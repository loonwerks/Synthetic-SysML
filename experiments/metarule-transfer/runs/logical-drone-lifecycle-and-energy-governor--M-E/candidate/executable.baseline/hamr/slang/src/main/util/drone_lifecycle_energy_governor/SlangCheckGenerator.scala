// #Sireum

package drone_lifecycle_energy_governor

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

LifecycleRequest.scala

ExactRequestCode.scala

RequestFamily.scala

BatteryBand.scala

EvidenceValidity.scala

ChargerReport.scala

BatteryConfidence.scala

NavigationReport.scala

FlightControlReport.scala

HomeValue.scala

TouchdownValue.scala

AirborneRequestProposal.scala

LifecycleCase.scala

SourceLifecyclePhase.scala

LifecyclePhase.scala

PublishedPhase.scala

RequestResult.scala

BatteryNotice.scala

ChargePermission.scala

FlightIntent.scala

LaunchPermission.scala

PropulsionPermission.scala

AirborneClassifiedRequest.scala

LifecycleClassifiedRequest.scala

BatteryReportValue.scala

BatteryEvidence.scala

ChargerFacts.scala

ChargeEligibility.scala

HomeFacts.scala

TouchdownFacts.scala

HazardProposal.scala

FaultVector.scala

BatteryStateFacts.scala

HomeReportValue.scala

TouchdownReportValue.scala

LifecycleResolution.scala

PilotStatus.scala

FlightControlOutputs.scala

Base_Types.scala

RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_Containers.scala

BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_Containers.scala

ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_Containers.scala

ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_Containers.scala

FlightReadinessOwner_governorProcess_flightReadinessOwner_Containers.scala

HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_Containers.scala

TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_Containers.scala

BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_Containers.scala

AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_Containers.scala

AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_Containers.scala

FaultAggregationOwner_governorProcess_faultAggregationOwner_Containers.scala

LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_Containers.scala

OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_Containers.scala

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

@record class Gen_Drone_Lifecycle_Energy_GovernorAirborneClassifiedRequest(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.AirborneClassifiedRequest] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.AirborneClassifiedRequest => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorAirborneClassifiedRequest())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorAirborneClassifiedRequest_Payload(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.AirborneClassifiedRequest_Payload] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.AirborneClassifiedRequest_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorAirborneClassifiedRequest_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_P(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_P] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PS(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PS] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_P(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_P] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PS(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PS] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorAirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorAirborneRequestProposalType(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.AirborneRequestProposal.Type] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.AirborneRequestProposal.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorAirborneRequestProposalType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorAirborneRequestProposal_Payload(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.AirborneRequestProposal_Payload] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.AirborneRequestProposal_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorAirborneRequestProposal_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_P(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_P] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PS(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PS] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_P(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_P] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PS(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PS] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorAirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorBatteryBandType(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.BatteryBand.Type] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.BatteryBand.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorBatteryBandType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorBatteryBand_Payload(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.BatteryBand_Payload] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.BatteryBand_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorBatteryBand_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorBatteryConfidenceType(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.BatteryConfidence.Type] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.BatteryConfidence.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorBatteryConfidenceType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorBatteryConfidence_Payload(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.BatteryConfidence_Payload] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.BatteryConfidence_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorBatteryConfidence_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_P(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_P] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PS(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PS] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_P(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_P] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PS(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PS] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorBatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorBatteryEvidence(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.BatteryEvidence] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.BatteryEvidence => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorBatteryEvidence())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorBatteryEvidence_Payload(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.BatteryEvidence_Payload] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.BatteryEvidence_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorBatteryEvidence_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_P(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_P] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PS(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PS] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_P(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_P] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PS(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PS] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorBatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorBatteryNoticeType(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.BatteryNotice.Type] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.BatteryNotice.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorBatteryNoticeType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorBatteryNotice_Payload(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.BatteryNotice_Payload] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.BatteryNotice_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorBatteryNotice_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorBatteryReportValue(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.BatteryReportValue] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.BatteryReportValue => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorBatteryReportValue())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorBatteryReportValue_Payload(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.BatteryReportValue_Payload] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.BatteryReportValue_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorBatteryReportValue_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorBatteryStateFacts(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.BatteryStateFacts] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.BatteryStateFacts => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorBatteryStateFacts())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorBatteryStateFacts_Payload(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.BatteryStateFacts_Payload] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.BatteryStateFacts_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorBatteryStateFacts_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorChargeEligibility(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.ChargeEligibility] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.ChargeEligibility => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorChargeEligibility())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorChargeEligibility_Payload(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.ChargeEligibility_Payload] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.ChargeEligibility_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorChargeEligibility_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_P(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_P] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PS(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PS] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_P(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_P] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PS(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PS] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorChargePermissionType(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.ChargePermission.Type] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.ChargePermission.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorChargePermissionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorChargePermission_Payload(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.ChargePermission_Payload] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.ChargePermission_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorChargePermission_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_P(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_P] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PS(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PS] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_P(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_P] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PS(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PS] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorChargerFacts(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.ChargerFacts] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.ChargerFacts => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorChargerFacts())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorChargerFacts_Payload(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.ChargerFacts_Payload] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.ChargerFacts_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorChargerFacts_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorChargerReportType(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.ChargerReport.Type] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.ChargerReport.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorChargerReportType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorChargerReport_Payload(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.ChargerReport_Payload] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.ChargerReport_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorChargerReport_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorEvidenceValidityType(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.EvidenceValidity.Type] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.EvidenceValidity.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorEvidenceValidityType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorEvidenceValidity_Payload(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.EvidenceValidity_Payload] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.EvidenceValidity_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorEvidenceValidity_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorExactRequestCodeType(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.ExactRequestCode.Type] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.ExactRequestCode.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorExactRequestCodeType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorExactRequestCode_Payload(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.ExactRequestCode_Payload] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.ExactRequestCode_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorExactRequestCode_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_P(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_P] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PS(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PS] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_P(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_P] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PS(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PS] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorFaultAggregationOwner_governorProcess_faultAggregationOwner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorFaultVector(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.FaultVector] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.FaultVector => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorFaultVector())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorFaultVector_Payload(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.FaultVector_Payload] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.FaultVector_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorFaultVector_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorFlightControlOutputs(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.FlightControlOutputs] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.FlightControlOutputs => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorFlightControlOutputs())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorFlightControlOutputs_Payload(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.FlightControlOutputs_Payload] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.FlightControlOutputs_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorFlightControlOutputs_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorFlightControlReportType(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.FlightControlReport.Type] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.FlightControlReport.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorFlightControlReportType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorFlightControlReport_Payload(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.FlightControlReport_Payload] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.FlightControlReport_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorFlightControlReport_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorFlightIntentType(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.FlightIntent.Type] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.FlightIntent.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorFlightIntentType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorFlightIntent_Payload(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.FlightIntent_Payload] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.FlightIntent_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorFlightIntent_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorHazardProposal(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.HazardProposal] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.HazardProposal => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorHazardProposal())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorHazardProposal_Payload(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.HazardProposal_Payload] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.HazardProposal_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorHazardProposal_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_P(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_P] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PS(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PS] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_P(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_P] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PS(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PS] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorHomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorHomeFacts(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.HomeFacts] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.HomeFacts => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorHomeFacts())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorHomeFacts_Payload(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.HomeFacts_Payload] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.HomeFacts_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorHomeFacts_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorHomeReportValue(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.HomeReportValue] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.HomeReportValue => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorHomeReportValue())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorHomeReportValue_Payload(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.HomeReportValue_Payload] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.HomeReportValue_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorHomeReportValue_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorHomeValueType(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.HomeValue.Type] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.HomeValue.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorHomeValueType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorHomeValue_Payload(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.HomeValue_Payload] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.HomeValue_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorHomeValue_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorLaunchPermissionType(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.LaunchPermission.Type] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.LaunchPermission.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorLaunchPermissionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorLaunchPermission_Payload(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.LaunchPermission_Payload] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.LaunchPermission_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorLaunchPermission_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorLifecycleCaseType(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.LifecycleCase.Type] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.LifecycleCase.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorLifecycleCaseType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorLifecycleCase_Payload(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.LifecycleCase_Payload] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.LifecycleCase_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorLifecycleCase_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorLifecycleClassifiedRequest(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.LifecycleClassifiedRequest] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.LifecycleClassifiedRequest => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorLifecycleClassifiedRequest())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorLifecycleClassifiedRequest_Payload(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.LifecycleClassifiedRequest_Payload] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.LifecycleClassifiedRequest_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorLifecycleClassifiedRequest_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorLifecyclePhaseType(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.LifecyclePhase.Type] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.LifecyclePhase.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorLifecyclePhaseType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorLifecyclePhase_Payload(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.LifecyclePhase_Payload] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.LifecyclePhase_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorLifecyclePhase_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_P(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_P] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PS(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PS] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_P(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_P] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PS(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PS] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorLifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorLifecycleRequestType(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.LifecycleRequest.Type] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.LifecycleRequest.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorLifecycleRequestType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorLifecycleRequest_Payload(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.LifecycleRequest_Payload] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.LifecycleRequest_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorLifecycleRequest_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorLifecycleResolution(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.LifecycleResolution] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.LifecycleResolution => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorLifecycleResolution())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorLifecycleResolution_Payload(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.LifecycleResolution_Payload] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.LifecycleResolution_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorLifecycleResolution_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorNavigationReportType(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.NavigationReport.Type] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.NavigationReport.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorNavigationReportType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorNavigationReport_Payload(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.NavigationReport_Payload] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.NavigationReport_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorNavigationReport_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_P(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_P] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PS(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PS] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_P(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_P] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PS(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PS] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorOutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorPilotStatus(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.PilotStatus] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.PilotStatus => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorPilotStatus())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorPilotStatus_Payload(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.PilotStatus_Payload] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.PilotStatus_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorPilotStatus_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorPropulsionPermissionType(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.PropulsionPermission.Type] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.PropulsionPermission.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorPropulsionPermissionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorPropulsionPermission_Payload(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.PropulsionPermission_Payload] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.PropulsionPermission_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorPropulsionPermission_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorPublishedPhaseType(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.PublishedPhase.Type] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.PublishedPhase.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorPublishedPhaseType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorPublishedPhase_Payload(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.PublishedPhase_Payload] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.PublishedPhase_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorPublishedPhase_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_P(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_P] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PS(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PS] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_P(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_P] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PS(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PS] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorRequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorRequestFamilyType(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.RequestFamily.Type] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.RequestFamily.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorRequestFamilyType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorRequestFamily_Payload(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.RequestFamily_Payload] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.RequestFamily_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorRequestFamily_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorRequestResultType(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.RequestResult.Type] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.RequestResult.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorRequestResultType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorRequestResult_Payload(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.RequestResult_Payload] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.RequestResult_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorRequestResult_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorSourceLifecyclePhaseType(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.SourceLifecyclePhase.Type] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.SourceLifecyclePhase.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorSourceLifecyclePhaseType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorSourceLifecyclePhase_Payload(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.SourceLifecyclePhase_Payload] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.SourceLifecyclePhase_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorSourceLifecyclePhase_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_P(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_P] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PS(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PS] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_P(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_P] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PS(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PS] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorTouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorTouchdownFacts(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.TouchdownFacts] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.TouchdownFacts => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorTouchdownFacts())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorTouchdownFacts_Payload(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.TouchdownFacts_Payload] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.TouchdownFacts_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorTouchdownFacts_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorTouchdownReportValue(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.TouchdownReportValue] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.TouchdownReportValue => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorTouchdownReportValue())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorTouchdownReportValue_Payload(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.TouchdownReportValue_Payload] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.TouchdownReportValue_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorTouchdownReportValue_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorTouchdownValueType(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.TouchdownValue.Type] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.TouchdownValue.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorTouchdownValueType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Drone_Lifecycle_Energy_GovernorTouchdownValue_Payload(param: RandomLibI) extends MJen[Drone_Lifecycle_Energy_Governor.TouchdownValue_Payload] {
  override def generate(f: Drone_Lifecycle_Energy_Governor.TouchdownValue_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDrone_Lifecycle_Energy_GovernorTouchdownValue_Payload())

      if (!continue) {
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


