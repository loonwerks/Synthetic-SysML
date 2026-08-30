// #Sireum

package scp_candidate

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

BeltObservation.scala

BeltQualification.scala

CalibrationObservation.scala

CalibrationQualification.scala

AcquisitionObservation.scala

PreparationState.scala

MonitoringState.scala

EligibilityEnvelopeCondition.scala

EligibilityEnvelopeRecovery.scala

EligibilityEnvelopePreparationState.scala

EligibilityEnvelopeMonitoringState.scala

DoctorRequest.scala

TechnicianRequest.scala

ArbitrationDecisionEffectiveIntent.scala

ArbitrationDecisionDisposition.scala

PreparationDecisionPreState.scala

PreparationDecisionNextState.scala

PreparationDecisionIntent.scala

PreparationDecisionDisposition.scala

MonitoringDecisionPreState.scala

MonitoringDecisionNextState.scala

MonitoringDecisionIntent.scala

MonitoringDecisionDisposition.scala

MonitoringDecisionNotice.scala

MonitoringDecisionPreparationState.scala

AcquisitionCommand.scala

ImpedanceFrameObservation.scala

FrameDelivery.scala

SessionStatusPreparationState.scala

SessionStatusMonitoringState.scala

SessionStatusDisposition.scala

SessionStatusNotice.scala

BeltAssessment.scala

EligibilityEnvelope.scala

ArbitrationDecision.scala

PreparationDecisionSnapshot.scala

MonitoringDecisionSnapshot.scala

SessionStatus.scala

Base_Types.scala

BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_Containers.scala

CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_Containers.scala

AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_Containers.scala

RequestArbiter_acquisitionCoordinationProcess_requestArbiter_Containers.scala

PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_Containers.scala

MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_Containers.scala

AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_Containers.scala

SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_Containers.scala

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

@record class Gen_EIT_Acquisition_Session_CoordinatorAcquisitionCommandType(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.AcquisitionCommand.Type] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.AcquisitionCommand.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorAcquisitionCommandType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorAcquisitionCommand_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.AcquisitionCommand_Payload] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.AcquisitionCommand_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorAcquisitionCommand_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_P(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_P] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PS(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PS] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_P(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_P] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PS(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PS] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_P(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_P] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PS(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PS] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_P(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_P] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PS(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PS] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorAcquisitionObservationType(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.AcquisitionObservation.Type] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.AcquisitionObservation.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorAcquisitionObservationType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorAcquisitionObservation_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.AcquisitionObservation_Payload] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.AcquisitionObservation_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorAcquisitionObservation_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorArbitrationDecision(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.ArbitrationDecision] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.ArbitrationDecision => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorArbitrationDecision())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorArbitrationDecision_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.ArbitrationDecision_Payload] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.ArbitrationDecision_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorArbitrationDecision_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorArbitrationDecisionDispositionType(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.ArbitrationDecisionDisposition.Type] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.ArbitrationDecisionDisposition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorArbitrationDecisionDispositionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorArbitrationDecisionDisposition_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.ArbitrationDecisionDisposition_Payload] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.ArbitrationDecisionDisposition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorArbitrationDecisionDisposition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorArbitrationDecisionEffectiveIntentType(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.ArbitrationDecisionEffectiveIntent.Type] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.ArbitrationDecisionEffectiveIntent.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorArbitrationDecisionEffectiveIntentType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorArbitrationDecisionEffectiveIntent_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.ArbitrationDecisionEffectiveIntent_Payload] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.ArbitrationDecisionEffectiveIntent_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorArbitrationDecisionEffectiveIntent_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorBeltAssessment(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.BeltAssessment] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.BeltAssessment => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorBeltAssessment())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorBeltAssessment_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.BeltAssessment_Payload] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.BeltAssessment_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorBeltAssessment_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorBeltObservationType(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.BeltObservation.Type] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.BeltObservation.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorBeltObservationType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorBeltObservation_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.BeltObservation_Payload] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.BeltObservation_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorBeltObservation_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorBeltQualificationType(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.BeltQualification.Type] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.BeltQualification.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorBeltQualificationType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorBeltQualification_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.BeltQualification_Payload] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.BeltQualification_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorBeltQualification_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_P(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_P] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PS(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PS] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_P(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_P] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PS(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PS] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorCalibrationObservationType(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.CalibrationObservation.Type] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.CalibrationObservation.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorCalibrationObservationType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorCalibrationObservation_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.CalibrationObservation_Payload] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.CalibrationObservation_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorCalibrationObservation_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorCalibrationQualificationType(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.CalibrationQualification.Type] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.CalibrationQualification.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorCalibrationQualificationType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorCalibrationQualification_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.CalibrationQualification_Payload] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.CalibrationQualification_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorCalibrationQualification_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_P(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_P] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PS(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PS] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_P(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_P] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PS(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PS] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorDoctorRequestType(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.DoctorRequest.Type] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.DoctorRequest.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorDoctorRequestType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorDoctorRequest_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.DoctorRequest_Payload] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.DoctorRequest_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorDoctorRequest_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorEligibilityEnvelope(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.EligibilityEnvelope] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.EligibilityEnvelope => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorEligibilityEnvelope())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorEligibilityEnvelope_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.EligibilityEnvelope_Payload] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.EligibilityEnvelope_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorEligibilityEnvelope_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorEligibilityEnvelopeConditionType(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeCondition.Type] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeCondition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeConditionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorEligibilityEnvelopeCondition_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeCondition_Payload] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeCondition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeCondition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorEligibilityEnvelopeMonitoringStateType(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeMonitoringState.Type] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeMonitoringState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeMonitoringStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorEligibilityEnvelopeMonitoringState_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeMonitoringState_Payload] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeMonitoringState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeMonitoringState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorEligibilityEnvelopePreparationStateType(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.EligibilityEnvelopePreparationState.Type] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.EligibilityEnvelopePreparationState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorEligibilityEnvelopePreparationStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorEligibilityEnvelopePreparationState_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.EligibilityEnvelopePreparationState_Payload] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.EligibilityEnvelopePreparationState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorEligibilityEnvelopePreparationState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorEligibilityEnvelopeRecoveryType(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeRecovery.Type] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeRecovery.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeRecoveryType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorEligibilityEnvelopeRecovery_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeRecovery_Payload] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeRecovery_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeRecovery_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorFrameDeliveryType(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.FrameDelivery.Type] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.FrameDelivery.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorFrameDeliveryType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorFrameDelivery_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.FrameDelivery_Payload] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.FrameDelivery_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorFrameDelivery_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorImpedanceFrameObservationType(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.ImpedanceFrameObservation.Type] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.ImpedanceFrameObservation.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorImpedanceFrameObservationType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorImpedanceFrameObservation_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.ImpedanceFrameObservation_Payload] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.ImpedanceFrameObservation_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorImpedanceFrameObservation_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorMonitoringDecisionDispositionType(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.MonitoringDecisionDisposition.Type] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.MonitoringDecisionDisposition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorMonitoringDecisionDispositionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorMonitoringDecisionDisposition_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.MonitoringDecisionDisposition_Payload] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.MonitoringDecisionDisposition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorMonitoringDecisionDisposition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorMonitoringDecisionIntentType(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.MonitoringDecisionIntent.Type] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.MonitoringDecisionIntent.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorMonitoringDecisionIntentType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorMonitoringDecisionIntent_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.MonitoringDecisionIntent_Payload] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.MonitoringDecisionIntent_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorMonitoringDecisionIntent_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorMonitoringDecisionNextStateType(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.MonitoringDecisionNextState.Type] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.MonitoringDecisionNextState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorMonitoringDecisionNextStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorMonitoringDecisionNextState_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.MonitoringDecisionNextState_Payload] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.MonitoringDecisionNextState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorMonitoringDecisionNextState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorMonitoringDecisionNoticeType(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.MonitoringDecisionNotice.Type] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.MonitoringDecisionNotice.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorMonitoringDecisionNoticeType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorMonitoringDecisionNotice_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.MonitoringDecisionNotice_Payload] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.MonitoringDecisionNotice_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorMonitoringDecisionNotice_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorMonitoringDecisionPreStateType(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreState.Type] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorMonitoringDecisionPreState_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreState_Payload] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorMonitoringDecisionPreparationStateType(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreparationState.Type] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreparationState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreparationStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorMonitoringDecisionPreparationState_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreparationState_Payload] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreparationState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreparationState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.MonitoringDecisionSnapshot] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.MonitoringDecisionSnapshot => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.MonitoringDecisionSnapshot_Payload] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.MonitoringDecisionSnapshot_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorMonitoringStateType(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.MonitoringState.Type] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.MonitoringState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorMonitoringStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorMonitoringState_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.MonitoringState_Payload] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.MonitoringState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorMonitoringState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_P(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_P] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PS(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PS] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_P(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_P] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PS(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PS] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorPreparationDecisionDispositionType(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.PreparationDecisionDisposition.Type] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.PreparationDecisionDisposition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorPreparationDecisionDispositionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorPreparationDecisionDisposition_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.PreparationDecisionDisposition_Payload] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.PreparationDecisionDisposition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorPreparationDecisionDisposition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorPreparationDecisionIntentType(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.PreparationDecisionIntent.Type] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.PreparationDecisionIntent.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorPreparationDecisionIntentType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorPreparationDecisionIntent_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.PreparationDecisionIntent_Payload] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.PreparationDecisionIntent_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorPreparationDecisionIntent_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorPreparationDecisionNextStateType(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.PreparationDecisionNextState.Type] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.PreparationDecisionNextState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorPreparationDecisionNextStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorPreparationDecisionNextState_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.PreparationDecisionNextState_Payload] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.PreparationDecisionNextState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorPreparationDecisionNextState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorPreparationDecisionPreStateType(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.PreparationDecisionPreState.Type] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.PreparationDecisionPreState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorPreparationDecisionPreStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorPreparationDecisionPreState_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.PreparationDecisionPreState_Payload] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.PreparationDecisionPreState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorPreparationDecisionPreState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorPreparationDecisionSnapshot(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.PreparationDecisionSnapshot] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.PreparationDecisionSnapshot => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorPreparationDecisionSnapshot())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorPreparationDecisionSnapshot_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.PreparationDecisionSnapshot_Payload] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.PreparationDecisionSnapshot_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorPreparationDecisionSnapshot_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorPreparationStateType(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.PreparationState.Type] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.PreparationState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorPreparationStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorPreparationState_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.PreparationState_Payload] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.PreparationState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorPreparationState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_P(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_P] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PS(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PS] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_P(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_P] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PS(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PS] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_P(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_P] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PS(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PS] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_P(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_P] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PS(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PS] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_P(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_P] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PS(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PS] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_P(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_P] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PS(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PS] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorSessionStatus(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.SessionStatus] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.SessionStatus => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorSessionStatus())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorSessionStatus_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.SessionStatus_Payload] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.SessionStatus_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorSessionStatus_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorSessionStatusDispositionType(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.SessionStatusDisposition.Type] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.SessionStatusDisposition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorSessionStatusDispositionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorSessionStatusDisposition_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.SessionStatusDisposition_Payload] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.SessionStatusDisposition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorSessionStatusDisposition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorSessionStatusMonitoringStateType(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.SessionStatusMonitoringState.Type] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.SessionStatusMonitoringState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorSessionStatusMonitoringStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorSessionStatusMonitoringState_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.SessionStatusMonitoringState_Payload] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.SessionStatusMonitoringState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorSessionStatusMonitoringState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorSessionStatusNoticeType(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.SessionStatusNotice.Type] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.SessionStatusNotice.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorSessionStatusNoticeType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorSessionStatusNotice_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.SessionStatusNotice_Payload] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.SessionStatusNotice_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorSessionStatusNotice_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorSessionStatusPreparationStateType(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.SessionStatusPreparationState.Type] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.SessionStatusPreparationState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorSessionStatusPreparationStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorSessionStatusPreparationState_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.SessionStatusPreparationState_Payload] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.SessionStatusPreparationState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorSessionStatusPreparationState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorTechnicianRequestType(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.TechnicianRequest.Type] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.TechnicianRequest.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorTechnicianRequestType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_Session_CoordinatorTechnicianRequest_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Session_Coordinator.TechnicianRequest_Payload] {
  override def generate(f: EIT_Acquisition_Session_Coordinator.TechnicianRequest_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_Session_CoordinatorTechnicianRequest_Payload())

      if (!continue) {
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


