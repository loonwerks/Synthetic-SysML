// #Sireum

package scp_candidate

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

ThreatSampleValue.scala

IntentValue.scala

CargoBandValue.scala

CapacitorBandValue.scala

LocationValue.scala

ActionOutcomeValue.scala

ThreatValidityValue.scala

ThreatDispositionValue.scala

RecoveryGateValue.scala

EmergencyStateValue.scala

RecoveryStateValue.scala

ProposalValue.scala

MobilityProposalValue.scala

ActionValue.scala

SelectedCauseValue.scala

PublicResultValue.scala

MiningAvailabilityValue.scala

DefenseAvailabilityValue.scala

RetreatAvailabilityValue.scala

DestinationAvailabilityValue.scala

ServiceAvailabilityValue.scala

ReadinessAssessmentValue.scala

Base_Types.scala

Threat_Observation_supervisor_process_threat_observation_Containers.scala

Intent_Acquisition_supervisor_process_intent_acquisition_Containers.scala

Resource_Observation_supervisor_process_resource_observation_Containers.scala

Availability_Observation_supervisor_process_availability_observation_Containers.scala

Outcome_Observation_supervisor_process_outcome_observation_Containers.scala

Threat_Qualification_supervisor_process_threat_qualification_Containers.scala

Readiness_Assessment_supervisor_process_readiness_assessment_Containers.scala

Recovery_Control_supervisor_process_recovery_control_Containers.scala

Mining_Eligibility_supervisor_process_mining_eligibility_Containers.scala

Defense_Eligibility_supervisor_process_defense_eligibility_Containers.scala

Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_Containers.scala

Priority_Arbitration_supervisor_process_priority_arbitration_Containers.scala

Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_Containers.scala

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

@record class Gen_Mining_Threat_Retreat_SupervisionActionOutcomeValue(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.ActionOutcomeValue] {
  override def generate(f: Mining_Threat_Retreat_Supervision.ActionOutcomeValue => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionActionOutcomeValue())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionActionOutcomeValue_Payload(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.ActionOutcomeValue_Payload] {
  override def generate(f: Mining_Threat_Retreat_Supervision.ActionOutcomeValue_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionActionOutcomeValue_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionActionValue(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.ActionValue] {
  override def generate(f: Mining_Threat_Retreat_Supervision.ActionValue => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionActionValue())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionActionValue_Payload(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.ActionValue_Payload] {
  override def generate(f: Mining_Threat_Retreat_Supervision.ActionValue_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionActionValue_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PreState_Container] {
  override def generate(f: Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_P(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PreState_Container_P] {
  override def generate(f: Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_PS(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PreState_Container_PS] {
  override def generate(f: Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PostState_Container] {
  override def generate(f: Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_P(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PostState_Container_P] {
  override def generate(f: Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_PS(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PostState_Container_PS] {
  override def generate(f: Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionCapacitorBandValue(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.CapacitorBandValue] {
  override def generate(f: Mining_Threat_Retreat_Supervision.CapacitorBandValue => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionCapacitorBandValue())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionCapacitorBandValue_Payload(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.CapacitorBandValue_Payload] {
  override def generate(f: Mining_Threat_Retreat_Supervision.CapacitorBandValue_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionCapacitorBandValue_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionCargoBandValue(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.CargoBandValue] {
  override def generate(f: Mining_Threat_Retreat_Supervision.CargoBandValue => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionCargoBandValue())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionCargoBandValue_Payload(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.CargoBandValue_Payload] {
  override def generate(f: Mining_Threat_Retreat_Supervision.CargoBandValue_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionCargoBandValue_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionDefenseAvailabilityValue(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.DefenseAvailabilityValue] {
  override def generate(f: Mining_Threat_Retreat_Supervision.DefenseAvailabilityValue => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionDefenseAvailabilityValue())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionDefenseAvailabilityValue_Payload(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.DefenseAvailabilityValue_Payload] {
  override def generate(f: Mining_Threat_Retreat_Supervision.DefenseAvailabilityValue_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionDefenseAvailabilityValue_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PreState_Container] {
  override def generate(f: Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_P(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_P] {
  override def generate(f: Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PS(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PS] {
  override def generate(f: Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PostState_Container] {
  override def generate(f: Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_P(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_P] {
  override def generate(f: Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PS(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PS] {
  override def generate(f: Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionDestinationAvailabilityValue(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.DestinationAvailabilityValue] {
  override def generate(f: Mining_Threat_Retreat_Supervision.DestinationAvailabilityValue => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionDestinationAvailabilityValue())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionDestinationAvailabilityValue_Payload(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.DestinationAvailabilityValue_Payload] {
  override def generate(f: Mining_Threat_Retreat_Supervision.DestinationAvailabilityValue_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionDestinationAvailabilityValue_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionEmergencyStateValue(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.EmergencyStateValue] {
  override def generate(f: Mining_Threat_Retreat_Supervision.EmergencyStateValue => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionEmergencyStateValue())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionEmergencyStateValue_Payload(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.EmergencyStateValue_Payload] {
  override def generate(f: Mining_Threat_Retreat_Supervision.EmergencyStateValue_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionEmergencyStateValue_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionIntentValue(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.IntentValue] {
  override def generate(f: Mining_Threat_Retreat_Supervision.IntentValue => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionIntentValue())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionIntentValue_Payload(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.IntentValue_Payload] {
  override def generate(f: Mining_Threat_Retreat_Supervision.IntentValue_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionIntentValue_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PreState_Container] {
  override def generate(f: Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_P(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_P] {
  override def generate(f: Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PS(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PS] {
  override def generate(f: Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PostState_Container] {
  override def generate(f: Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_P(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_P] {
  override def generate(f: Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PS(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PS] {
  override def generate(f: Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionLocationValue(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.LocationValue] {
  override def generate(f: Mining_Threat_Retreat_Supervision.LocationValue => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionLocationValue())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionLocationValue_Payload(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.LocationValue_Payload] {
  override def generate(f: Mining_Threat_Retreat_Supervision.LocationValue_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionLocationValue_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionMiningAvailabilityValue(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.MiningAvailabilityValue] {
  override def generate(f: Mining_Threat_Retreat_Supervision.MiningAvailabilityValue => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionMiningAvailabilityValue())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionMiningAvailabilityValue_Payload(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.MiningAvailabilityValue_Payload] {
  override def generate(f: Mining_Threat_Retreat_Supervision.MiningAvailabilityValue_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionMiningAvailabilityValue_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PreState_Container] {
  override def generate(f: Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_P(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_P] {
  override def generate(f: Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PS(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PS] {
  override def generate(f: Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PostState_Container] {
  override def generate(f: Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_P(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_P] {
  override def generate(f: Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PS(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PS] {
  override def generate(f: Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container] {
  override def generate(f: Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_P(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_P] {
  override def generate(f: Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PS(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PS] {
  override def generate(f: Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container] {
  override def generate(f: Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_P(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_P] {
  override def generate(f: Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PS(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PS] {
  override def generate(f: Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionMobilityProposalValue(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.MobilityProposalValue] {
  override def generate(f: Mining_Threat_Retreat_Supervision.MobilityProposalValue => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionMobilityProposalValue())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionMobilityProposalValue_Payload(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.MobilityProposalValue_Payload] {
  override def generate(f: Mining_Threat_Retreat_Supervision.MobilityProposalValue_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionMobilityProposalValue_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container] {
  override def generate(f: Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_P(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_P] {
  override def generate(f: Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PS(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PS] {
  override def generate(f: Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container] {
  override def generate(f: Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_P(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_P] {
  override def generate(f: Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PS(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PS] {
  override def generate(f: Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PreState_Container] {
  override def generate(f: Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_P(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PreState_Container_P] {
  override def generate(f: Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_PS(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PreState_Container_PS] {
  override def generate(f: Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PostState_Container] {
  override def generate(f: Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_P(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PostState_Container_P] {
  override def generate(f: Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_PS(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PostState_Container_PS] {
  override def generate(f: Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PreState_Container] {
  override def generate(f: Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_P(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_P] {
  override def generate(f: Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PS(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PS] {
  override def generate(f: Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PostState_Container] {
  override def generate(f: Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_P(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_P] {
  override def generate(f: Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PS(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PS] {
  override def generate(f: Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionProposalValue(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.ProposalValue] {
  override def generate(f: Mining_Threat_Retreat_Supervision.ProposalValue => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionProposalValue())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionProposalValue_Payload(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.ProposalValue_Payload] {
  override def generate(f: Mining_Threat_Retreat_Supervision.ProposalValue_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionProposalValue_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionPublicResultValue(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.PublicResultValue] {
  override def generate(f: Mining_Threat_Retreat_Supervision.PublicResultValue => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionPublicResultValue())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionPublicResultValue_Payload(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.PublicResultValue_Payload] {
  override def generate(f: Mining_Threat_Retreat_Supervision.PublicResultValue_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionPublicResultValue_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionReadinessAssessmentValue(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.ReadinessAssessmentValue] {
  override def generate(f: Mining_Threat_Retreat_Supervision.ReadinessAssessmentValue => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionReadinessAssessmentValue())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionReadinessAssessmentValue_Payload(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.ReadinessAssessmentValue_Payload] {
  override def generate(f: Mining_Threat_Retreat_Supervision.ReadinessAssessmentValue_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionReadinessAssessmentValue_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PreState_Container] {
  override def generate(f: Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_P(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_P] {
  override def generate(f: Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PS(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PS] {
  override def generate(f: Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PostState_Container] {
  override def generate(f: Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_P(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_P] {
  override def generate(f: Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PS(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PS] {
  override def generate(f: Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionRecoveryGateValue(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.RecoveryGateValue] {
  override def generate(f: Mining_Threat_Retreat_Supervision.RecoveryGateValue => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionRecoveryGateValue())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionRecoveryGateValue_Payload(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.RecoveryGateValue_Payload] {
  override def generate(f: Mining_Threat_Retreat_Supervision.RecoveryGateValue_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionRecoveryGateValue_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionRecoveryStateValue(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.RecoveryStateValue] {
  override def generate(f: Mining_Threat_Retreat_Supervision.RecoveryStateValue => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionRecoveryStateValue())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionRecoveryStateValue_Payload(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.RecoveryStateValue_Payload] {
  override def generate(f: Mining_Threat_Retreat_Supervision.RecoveryStateValue_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionRecoveryStateValue_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PreState_Container] {
  override def generate(f: Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_P(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PreState_Container_P] {
  override def generate(f: Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_PS(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PreState_Container_PS] {
  override def generate(f: Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PostState_Container] {
  override def generate(f: Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_P(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PostState_Container_P] {
  override def generate(f: Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_PS(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PostState_Container_PS] {
  override def generate(f: Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PreState_Container] {
  override def generate(f: Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_P(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PreState_Container_P] {
  override def generate(f: Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_PS(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PreState_Container_PS] {
  override def generate(f: Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PostState_Container] {
  override def generate(f: Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_P(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PostState_Container_P] {
  override def generate(f: Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_PS(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PostState_Container_PS] {
  override def generate(f: Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionRetreatAvailabilityValue(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.RetreatAvailabilityValue] {
  override def generate(f: Mining_Threat_Retreat_Supervision.RetreatAvailabilityValue => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionRetreatAvailabilityValue())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionRetreatAvailabilityValue_Payload(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.RetreatAvailabilityValue_Payload] {
  override def generate(f: Mining_Threat_Retreat_Supervision.RetreatAvailabilityValue_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionRetreatAvailabilityValue_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionSelectedCauseValue(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.SelectedCauseValue] {
  override def generate(f: Mining_Threat_Retreat_Supervision.SelectedCauseValue => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionSelectedCauseValue())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionSelectedCauseValue_Payload(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.SelectedCauseValue_Payload] {
  override def generate(f: Mining_Threat_Retreat_Supervision.SelectedCauseValue_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionSelectedCauseValue_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionServiceAvailabilityValue(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.ServiceAvailabilityValue] {
  override def generate(f: Mining_Threat_Retreat_Supervision.ServiceAvailabilityValue => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionServiceAvailabilityValue())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionServiceAvailabilityValue_Payload(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.ServiceAvailabilityValue_Payload] {
  override def generate(f: Mining_Threat_Retreat_Supervision.ServiceAvailabilityValue_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionServiceAvailabilityValue_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionThreatDispositionValue(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.ThreatDispositionValue] {
  override def generate(f: Mining_Threat_Retreat_Supervision.ThreatDispositionValue => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionThreatDispositionValue())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionThreatDispositionValue_Payload(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.ThreatDispositionValue_Payload] {
  override def generate(f: Mining_Threat_Retreat_Supervision.ThreatDispositionValue_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionThreatDispositionValue_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionThreatSampleValue(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.ThreatSampleValue] {
  override def generate(f: Mining_Threat_Retreat_Supervision.ThreatSampleValue => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionThreatSampleValue())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionThreatSampleValue_Payload(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.ThreatSampleValue_Payload] {
  override def generate(f: Mining_Threat_Retreat_Supervision.ThreatSampleValue_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionThreatSampleValue_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionThreatValidityValue(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.ThreatValidityValue] {
  override def generate(f: Mining_Threat_Retreat_Supervision.ThreatValidityValue => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionThreatValidityValue())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionThreatValidityValue_Payload(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.ThreatValidityValue_Payload] {
  override def generate(f: Mining_Threat_Retreat_Supervision.ThreatValidityValue_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionThreatValidityValue_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PreState_Container] {
  override def generate(f: Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_P(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PreState_Container_P] {
  override def generate(f: Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_PS(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PreState_Container_PS] {
  override def generate(f: Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PostState_Container] {
  override def generate(f: Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_P(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PostState_Container_P] {
  override def generate(f: Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_PS(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PostState_Container_PS] {
  override def generate(f: Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container] {
  override def generate(f: Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_P(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_P] {
  override def generate(f: Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS] {
  override def generate(f: Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container] {
  override def generate(f: Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_P(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_P] {
  override def generate(f: Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS] {
  override def generate(f: Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS())

      if (!continue) {
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


