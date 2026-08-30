// #Sireum

package eit_acquisition_coordinator

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

MonitoringRequest.scala

InputStatus.scala

QualifiedRequest.scala

CalibrationState.scala

ImpedanceToken.scala

AcquisitionEvidence.scala

AcquisitionCommand.scala

SessionMode.scala

RecoveryPhase.scala

MonitoringDisposition.scala

ImpedanceDelivery.scala

MonitoringStatus.scala

MonitoringRequestSample.scala

CalibrationSample.scala

ImpedanceSample.scala

MonitoringResolution.scala

Base_Types.scala

RequestQualification_coordinationProcess_requestQualification_Containers.scala

AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_Containers.scala

MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_Containers.scala

ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_Containers.scala

DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_Containers.scala

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

@record class Gen_EIT_Acquisition_CoordinatorAcquisitionCommandType(param: RandomLibI) extends MJen[EIT_Acquisition_Coordinator.AcquisitionCommand.Type] {
  override def generate(f: EIT_Acquisition_Coordinator.AcquisitionCommand.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_CoordinatorAcquisitionCommandType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_CoordinatorAcquisitionCommand_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Coordinator.AcquisitionCommand_Payload] {
  override def generate(f: EIT_Acquisition_Coordinator.AcquisitionCommand_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_CoordinatorAcquisitionCommand_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_CoordinatorAcquisitionEvidenceType(param: RandomLibI) extends MJen[EIT_Acquisition_Coordinator.AcquisitionEvidence.Type] {
  override def generate(f: EIT_Acquisition_Coordinator.AcquisitionEvidence.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_CoordinatorAcquisitionEvidenceType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_CoordinatorAcquisitionEvidence_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Coordinator.AcquisitionEvidence_Payload] {
  override def generate(f: EIT_Acquisition_Coordinator.AcquisitionEvidence_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_CoordinatorAcquisitionEvidence_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container(param: RandomLibI) extends MJen[EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container] {
  override def generate(f: EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_P(param: RandomLibI) extends MJen[EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_P] {
  override def generate(f: EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PS(param: RandomLibI) extends MJen[EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PS] {
  override def generate(f: EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container(param: RandomLibI) extends MJen[EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container] {
  override def generate(f: EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_P(param: RandomLibI) extends MJen[EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_P] {
  override def generate(f: EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PS(param: RandomLibI) extends MJen[EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PS] {
  override def generate(f: EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_CoordinatorCalibrationSample(param: RandomLibI) extends MJen[EIT_Acquisition_Coordinator.CalibrationSample] {
  override def generate(f: EIT_Acquisition_Coordinator.CalibrationSample => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_CoordinatorCalibrationSample())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_CoordinatorCalibrationSample_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Coordinator.CalibrationSample_Payload] {
  override def generate(f: EIT_Acquisition_Coordinator.CalibrationSample_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_CoordinatorCalibrationSample_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_CoordinatorCalibrationStateType(param: RandomLibI) extends MJen[EIT_Acquisition_Coordinator.CalibrationState.Type] {
  override def generate(f: EIT_Acquisition_Coordinator.CalibrationState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_CoordinatorCalibrationStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_CoordinatorCalibrationState_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Coordinator.CalibrationState_Payload] {
  override def generate(f: EIT_Acquisition_Coordinator.CalibrationState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_CoordinatorCalibrationState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container(param: RandomLibI) extends MJen[EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container] {
  override def generate(f: EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_P(param: RandomLibI) extends MJen[EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_P] {
  override def generate(f: EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PS(param: RandomLibI) extends MJen[EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PS] {
  override def generate(f: EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container(param: RandomLibI) extends MJen[EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container] {
  override def generate(f: EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_P(param: RandomLibI) extends MJen[EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_P] {
  override def generate(f: EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PS(param: RandomLibI) extends MJen[EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PS] {
  override def generate(f: EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_CoordinatorImpedanceDeliveryType(param: RandomLibI) extends MJen[EIT_Acquisition_Coordinator.ImpedanceDelivery.Type] {
  override def generate(f: EIT_Acquisition_Coordinator.ImpedanceDelivery.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_CoordinatorImpedanceDeliveryType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_CoordinatorImpedanceDelivery_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Coordinator.ImpedanceDelivery_Payload] {
  override def generate(f: EIT_Acquisition_Coordinator.ImpedanceDelivery_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_CoordinatorImpedanceDelivery_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container(param: RandomLibI) extends MJen[EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container] {
  override def generate(f: EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_P(param: RandomLibI) extends MJen[EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_P] {
  override def generate(f: EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PS(param: RandomLibI) extends MJen[EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PS] {
  override def generate(f: EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container(param: RandomLibI) extends MJen[EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container] {
  override def generate(f: EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_P(param: RandomLibI) extends MJen[EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_P] {
  override def generate(f: EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PS(param: RandomLibI) extends MJen[EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PS] {
  override def generate(f: EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_CoordinatorImpedanceSample(param: RandomLibI) extends MJen[EIT_Acquisition_Coordinator.ImpedanceSample] {
  override def generate(f: EIT_Acquisition_Coordinator.ImpedanceSample => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_CoordinatorImpedanceSample())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_CoordinatorImpedanceSample_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Coordinator.ImpedanceSample_Payload] {
  override def generate(f: EIT_Acquisition_Coordinator.ImpedanceSample_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_CoordinatorImpedanceSample_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_CoordinatorImpedanceTokenType(param: RandomLibI) extends MJen[EIT_Acquisition_Coordinator.ImpedanceToken.Type] {
  override def generate(f: EIT_Acquisition_Coordinator.ImpedanceToken.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_CoordinatorImpedanceTokenType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_CoordinatorImpedanceToken_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Coordinator.ImpedanceToken_Payload] {
  override def generate(f: EIT_Acquisition_Coordinator.ImpedanceToken_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_CoordinatorImpedanceToken_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_CoordinatorInputStatusType(param: RandomLibI) extends MJen[EIT_Acquisition_Coordinator.InputStatus.Type] {
  override def generate(f: EIT_Acquisition_Coordinator.InputStatus.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_CoordinatorInputStatusType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_CoordinatorInputStatus_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Coordinator.InputStatus_Payload] {
  override def generate(f: EIT_Acquisition_Coordinator.InputStatus_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_CoordinatorInputStatus_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container(param: RandomLibI) extends MJen[EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container] {
  override def generate(f: EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_P(param: RandomLibI) extends MJen[EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_P] {
  override def generate(f: EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PS(param: RandomLibI) extends MJen[EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PS] {
  override def generate(f: EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container(param: RandomLibI) extends MJen[EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container] {
  override def generate(f: EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_P(param: RandomLibI) extends MJen[EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_P] {
  override def generate(f: EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PS(param: RandomLibI) extends MJen[EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PS] {
  override def generate(f: EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_CoordinatorMonitoringDispositionType(param: RandomLibI) extends MJen[EIT_Acquisition_Coordinator.MonitoringDisposition.Type] {
  override def generate(f: EIT_Acquisition_Coordinator.MonitoringDisposition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_CoordinatorMonitoringDispositionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_CoordinatorMonitoringDisposition_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Coordinator.MonitoringDisposition_Payload] {
  override def generate(f: EIT_Acquisition_Coordinator.MonitoringDisposition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_CoordinatorMonitoringDisposition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_CoordinatorMonitoringRequestType(param: RandomLibI) extends MJen[EIT_Acquisition_Coordinator.MonitoringRequest.Type] {
  override def generate(f: EIT_Acquisition_Coordinator.MonitoringRequest.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_CoordinatorMonitoringRequestType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_CoordinatorMonitoringRequest_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Coordinator.MonitoringRequest_Payload] {
  override def generate(f: EIT_Acquisition_Coordinator.MonitoringRequest_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_CoordinatorMonitoringRequest_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_CoordinatorMonitoringRequestSample(param: RandomLibI) extends MJen[EIT_Acquisition_Coordinator.MonitoringRequestSample] {
  override def generate(f: EIT_Acquisition_Coordinator.MonitoringRequestSample => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_CoordinatorMonitoringRequestSample())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_CoordinatorMonitoringRequestSample_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Coordinator.MonitoringRequestSample_Payload] {
  override def generate(f: EIT_Acquisition_Coordinator.MonitoringRequestSample_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_CoordinatorMonitoringRequestSample_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_CoordinatorMonitoringResolution(param: RandomLibI) extends MJen[EIT_Acquisition_Coordinator.MonitoringResolution] {
  override def generate(f: EIT_Acquisition_Coordinator.MonitoringResolution => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_CoordinatorMonitoringResolution())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_CoordinatorMonitoringResolution_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Coordinator.MonitoringResolution_Payload] {
  override def generate(f: EIT_Acquisition_Coordinator.MonitoringResolution_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_CoordinatorMonitoringResolution_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_CoordinatorMonitoringStatusType(param: RandomLibI) extends MJen[EIT_Acquisition_Coordinator.MonitoringStatus.Type] {
  override def generate(f: EIT_Acquisition_Coordinator.MonitoringStatus.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_CoordinatorMonitoringStatusType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_CoordinatorMonitoringStatus_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Coordinator.MonitoringStatus_Payload] {
  override def generate(f: EIT_Acquisition_Coordinator.MonitoringStatus_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_CoordinatorMonitoringStatus_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_CoordinatorQualifiedRequestType(param: RandomLibI) extends MJen[EIT_Acquisition_Coordinator.QualifiedRequest.Type] {
  override def generate(f: EIT_Acquisition_Coordinator.QualifiedRequest.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_CoordinatorQualifiedRequestType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_CoordinatorQualifiedRequest_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Coordinator.QualifiedRequest_Payload] {
  override def generate(f: EIT_Acquisition_Coordinator.QualifiedRequest_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_CoordinatorQualifiedRequest_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_CoordinatorRecoveryPhaseType(param: RandomLibI) extends MJen[EIT_Acquisition_Coordinator.RecoveryPhase.Type] {
  override def generate(f: EIT_Acquisition_Coordinator.RecoveryPhase.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_CoordinatorRecoveryPhaseType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_CoordinatorRecoveryPhase_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Coordinator.RecoveryPhase_Payload] {
  override def generate(f: EIT_Acquisition_Coordinator.RecoveryPhase_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_CoordinatorRecoveryPhase_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container(param: RandomLibI) extends MJen[EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PreState_Container] {
  override def generate(f: EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_P(param: RandomLibI) extends MJen[EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PreState_Container_P] {
  override def generate(f: EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_PS(param: RandomLibI) extends MJen[EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PreState_Container_PS] {
  override def generate(f: EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container(param: RandomLibI) extends MJen[EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PostState_Container] {
  override def generate(f: EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_P(param: RandomLibI) extends MJen[EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PostState_Container_P] {
  override def generate(f: EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_PS(param: RandomLibI) extends MJen[EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PostState_Container_PS] {
  override def generate(f: EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_CoordinatorSessionModeType(param: RandomLibI) extends MJen[EIT_Acquisition_Coordinator.SessionMode.Type] {
  override def generate(f: EIT_Acquisition_Coordinator.SessionMode.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_CoordinatorSessionModeType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_CoordinatorSessionMode_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Coordinator.SessionMode_Payload] {
  override def generate(f: EIT_Acquisition_Coordinator.SessionMode_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_CoordinatorSessionMode_Payload())

      if (!continue) {
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


