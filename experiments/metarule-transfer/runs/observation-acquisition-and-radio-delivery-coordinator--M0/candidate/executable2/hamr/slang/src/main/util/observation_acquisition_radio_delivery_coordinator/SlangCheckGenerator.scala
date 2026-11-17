// #Sireum

package observation_acquisition_radio_delivery_coordinator

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

BatteryCapacityBand.scala

BatteryCheck.scala

BatteryAssessment.scala

SortieContext.scala

SortieQualification.scala

CameraCondition.scala

CaptureResult.scala

CameraEvidence.scala

RadioCondition.scala

DeliveryResult.scala

RadioEvidence.scala

ObservationSessionState.scala

SessionProposal.scala

ObservationIntent.scala

SessionDecision.scala

SnapshotPreSessionState.scala

SnapshotNextSessionState.scala

SnapshotCoordinationDisposition.scala

SnapshotCoordinationReason.scala

CameraAcquisitionCommand.scala

RadioDeliveryCommand.scala

StatusSessionState.scala

StatusCoordinationDisposition.scala

StatusCoordinationReason.scala

OperatorAdvisory.scala

DroneControlObservationNotice.scala

SessionSnapshot.scala

OperatorCoordinationStatus.scala

Base_Types.scala

BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_Containers.scala

SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_Containers.scala

CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_Containers.scala

RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_Containers.scala

SessionProposalOwner_coordinatorProcess_sessionProposalOwner_Containers.scala

ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_Containers.scala

ObservationSessionController_coordinatorProcess_observationSessionController_Containers.scala

CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_Containers.scala

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

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorBatteryAssessmentType(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.Type] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorBatteryAssessmentType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorBatteryAssessment_Payload(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment_Payload] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorBatteryAssessment_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorBatteryCapacityBandType(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCapacityBand.Type] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCapacityBand.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCapacityBandType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorBatteryCapacityBand_Payload(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCapacityBand_Payload] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCapacityBand_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCapacityBand_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorBatteryCheckType(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCheck.Type] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCheck.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCheckType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorBatteryCheck_Payload(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCheck_Payload] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCheck_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCheck_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_P(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_P] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PS(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PS] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_P(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_P] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PS(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PS] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorCameraAcquisitionCommandType(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.CameraAcquisitionCommand.Type] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.CameraAcquisitionCommand.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorCameraAcquisitionCommandType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorCameraAcquisitionCommand_Payload(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.CameraAcquisitionCommand_Payload] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.CameraAcquisitionCommand_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorCameraAcquisitionCommand_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorCameraConditionType(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.CameraCondition.Type] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.CameraCondition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorCameraConditionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorCameraCondition_Payload(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.CameraCondition_Payload] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.CameraCondition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorCameraCondition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceType(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.Type] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorCameraEvidence_Payload(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence_Payload] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidence_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_P(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_P] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PS(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PS] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_P(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_P] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PS(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PS] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorCaptureResultType(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.CaptureResult.Type] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.CaptureResult.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorCaptureResultType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorCaptureResult_Payload(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.CaptureResult_Payload] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.CaptureResult_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorCaptureResult_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_P(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_P] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PS(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PS] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_P(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_P] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PS(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PS] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorDeliveryResultType(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.DeliveryResult.Type] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.DeliveryResult.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorDeliveryResultType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorDeliveryResult_Payload(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.DeliveryResult_Payload] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.DeliveryResult_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorDeliveryResult_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorDroneControlObservationNoticeType(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.DroneControlObservationNotice.Type] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.DroneControlObservationNotice.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorDroneControlObservationNoticeType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorDroneControlObservationNotice_Payload(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.DroneControlObservationNotice_Payload] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.DroneControlObservationNotice_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorDroneControlObservationNotice_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorObservationIntentType(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent.Type] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorObservationIntent_Payload(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent_Payload] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntent_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_P(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_P] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PS(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PS] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_P(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_P] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PS(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PS] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_P(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_P] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PS(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PS] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_P(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_P] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PS(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PS] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorObservationSessionStateType(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.Type] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorObservationSessionState_Payload(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState_Payload] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorOperatorAdvisoryType(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory.Type] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorOperatorAdvisoryType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorOperatorAdvisory_Payload(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory_Payload] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorOperatorAdvisory_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorOperatorCoordinationStatus(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.OperatorCoordinationStatus] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.OperatorCoordinationStatus => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorOperatorCoordinationStatus())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorOperatorCoordinationStatus_Payload(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.OperatorCoordinationStatus_Payload] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.OperatorCoordinationStatus_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorOperatorCoordinationStatus_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorRadioConditionType(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.RadioCondition.Type] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.RadioCondition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorRadioConditionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorRadioCondition_Payload(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.RadioCondition_Payload] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.RadioCondition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorRadioCondition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorRadioDeliveryCommandType(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.RadioDeliveryCommand.Type] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.RadioDeliveryCommand.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorRadioDeliveryCommandType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorRadioDeliveryCommand_Payload(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.RadioDeliveryCommand_Payload] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.RadioDeliveryCommand_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorRadioDeliveryCommand_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceType(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.Type] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorRadioEvidence_Payload(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence_Payload] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidence_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_P(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_P] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PS(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PS] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_P(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_P] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PS(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PS] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorSessionDecisionType(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.Type] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorSessionDecisionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorSessionDecision_Payload(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision_Payload] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorSessionDecision_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorSessionProposalType(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.Type] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorSessionProposal_Payload(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal_Payload] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposal_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_P(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_P] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PS(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PS] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_P(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_P] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PS(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PS] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorSessionSnapshot(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.SessionSnapshot] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.SessionSnapshot => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorSessionSnapshot())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorSessionSnapshot_Payload(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.SessionSnapshot_Payload] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.SessionSnapshot_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorSessionSnapshot_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationDispositionType(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.Type] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationDispositionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationDisposition_Payload(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition_Payload] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationDisposition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationReasonType(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.Type] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationReasonType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationReason_Payload(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason_Payload] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationReason_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorSnapshotNextSessionStateType(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.Type] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotNextSessionStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorSnapshotNextSessionState_Payload(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState_Payload] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotNextSessionState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorSnapshotPreSessionStateType(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotPreSessionState.Type] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotPreSessionState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotPreSessionStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorSnapshotPreSessionState_Payload(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotPreSessionState_Payload] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotPreSessionState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotPreSessionState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_P(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_P] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PS(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PS] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_P(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_P] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PS(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PS] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorSortieContextType(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.SortieContext.Type] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.SortieContext.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorSortieContextType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorSortieContext_Payload(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.SortieContext_Payload] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.SortieContext_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorSortieContext_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorSortieQualificationType(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.Type] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorSortieQualificationType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorSortieQualification_Payload(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification_Payload] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorSortieQualification_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationDispositionType(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition.Type] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationDispositionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationDisposition_Payload(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition_Payload] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationDisposition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationReasonType(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason.Type] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationReasonType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationReason_Payload(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason_Payload] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationReason_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorStatusSessionStateType(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.StatusSessionState.Type] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.StatusSessionState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorStatusSessionStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Observation_Acquisition_Radio_Delivery_CoordinatorStatusSessionState_Payload(param: RandomLibI) extends MJen[Observation_Acquisition_Radio_Delivery_Coordinator.StatusSessionState_Payload] {
  override def generate(f: Observation_Acquisition_Radio_Delivery_Coordinator.StatusSessionState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextObservation_Acquisition_Radio_Delivery_CoordinatorStatusSessionState_Payload())

      if (!continue) {
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


