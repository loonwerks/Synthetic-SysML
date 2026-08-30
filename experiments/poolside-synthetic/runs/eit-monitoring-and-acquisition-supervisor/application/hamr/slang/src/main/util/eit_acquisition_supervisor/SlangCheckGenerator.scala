// #Sireum

package eit_acquisition_supervisor

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

DoctorSignal.scala

RequestClass.scala

PreparationObservation.scala

PreparationFacts.scala

EquipmentObservation.scala

EquipmentFacts.scala

BatchSignal.scala

BatchFacts.scala

ImageFeedback.scala

ImageResultFacts.scala

DominantFault.scala

RecoveryState.scala

RecoveryGate.scala

RecoveryCause.scala

StartFeasibility.scala

SessionState.scala

CycleState.scala

ImageState.scala

RecoveryEvent.scala

Proposal.scala

SelectedAction.scala

SelectedCause.scala

AcquisitionCommand.scala

ImageCommand.scala

PublicMode.scala

ImageDisposition.scala

RequestFactsRecord.scala

FaultSummary.scala

RecoveryFrame.scala

SessionFrame.scala

CycleFrame.scala

ImageFrame.scala

DecisionFrame.scala

ControlFrame.scala

StatusFrame.scala

Base_Types.scala

DoctorRequestQualification_acquisition_process_doctor_request_qualification_Containers.scala

PreparationAssessment_acquisition_process_preparation_assessment_Containers.scala

EquipmentAssessment_acquisition_process_equipment_assessment_Containers.scala

BatchAssessment_acquisition_process_batch_assessment_Containers.scala

ImageResultAssessment_acquisition_process_image_result_assessment_Containers.scala

FaultComposition_acquisition_process_fault_composition_Containers.scala

SessionControl_acquisition_process_session_control_Containers.scala

AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_Containers.scala

ImageAvailabilityControl_acquisition_process_image_availability_control_Containers.scala

RecoveryControl_acquisition_process_recovery_control_Containers.scala

StartFeasibilityOwner_acquisition_process_start_feasibility_Containers.scala

CollectionFeasibilityOwner_acquisition_process_collection_feasibility_Containers.scala

ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_Containers.scala

SupervisoryArbitration_acquisition_process_supervisory_arbitration_Containers.scala

PublicationComposition_acquisition_process_publication_composition_Containers.scala

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

@record class Gen_EIT_Acquisition_SupervisorAcquisitionCommandType(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.AcquisitionCommand.Type] {
  override def generate(f: EIT_Acquisition_Supervisor.AcquisitionCommand.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorAcquisitionCommandType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorAcquisitionCommand_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.AcquisitionCommand_Payload] {
  override def generate(f: EIT_Acquisition_Supervisor.AcquisitionCommand_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorAcquisitionCommand_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container] {
  override def generate(f: EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_P(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_P] {
  override def generate(f: EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PS(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PS] {
  override def generate(f: EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container] {
  override def generate(f: EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_P(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_P] {
  override def generate(f: EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PS(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PS] {
  override def generate(f: EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PreState_Container] {
  override def generate(f: EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_P(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PreState_Container_P] {
  override def generate(f: EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_PS(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PreState_Container_PS] {
  override def generate(f: EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PostState_Container] {
  override def generate(f: EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_P(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PostState_Container_P] {
  override def generate(f: EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_PS(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PostState_Container_PS] {
  override def generate(f: EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorBatchFactsType(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.BatchFacts.Type] {
  override def generate(f: EIT_Acquisition_Supervisor.BatchFacts.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorBatchFactsType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorBatchFacts_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.BatchFacts_Payload] {
  override def generate(f: EIT_Acquisition_Supervisor.BatchFacts_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorBatchFacts_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorBatchSignalType(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.BatchSignal.Type] {
  override def generate(f: EIT_Acquisition_Supervisor.BatchSignal.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorBatchSignalType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorBatchSignal_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.BatchSignal_Payload] {
  override def generate(f: EIT_Acquisition_Supervisor.BatchSignal_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorBatchSignal_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container] {
  override def generate(f: EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_P(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_P] {
  override def generate(f: EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PS(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PS] {
  override def generate(f: EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container] {
  override def generate(f: EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_P(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_P] {
  override def generate(f: EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PS(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PS] {
  override def generate(f: EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorControlFrame(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.ControlFrame] {
  override def generate(f: EIT_Acquisition_Supervisor.ControlFrame => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorControlFrame())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorControlFrame_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.ControlFrame_Payload] {
  override def generate(f: EIT_Acquisition_Supervisor.ControlFrame_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorControlFrame_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorCycleFrame(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.CycleFrame] {
  override def generate(f: EIT_Acquisition_Supervisor.CycleFrame => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorCycleFrame())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorCycleFrame_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.CycleFrame_Payload] {
  override def generate(f: EIT_Acquisition_Supervisor.CycleFrame_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorCycleFrame_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorCycleStateType(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.CycleState.Type] {
  override def generate(f: EIT_Acquisition_Supervisor.CycleState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorCycleStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorCycleState_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.CycleState_Payload] {
  override def generate(f: EIT_Acquisition_Supervisor.CycleState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorCycleState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorDecisionFrame(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.DecisionFrame] {
  override def generate(f: EIT_Acquisition_Supervisor.DecisionFrame => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorDecisionFrame())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorDecisionFrame_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.DecisionFrame_Payload] {
  override def generate(f: EIT_Acquisition_Supervisor.DecisionFrame_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorDecisionFrame_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container] {
  override def generate(f: EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_P(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_P] {
  override def generate(f: EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PS(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PS] {
  override def generate(f: EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container] {
  override def generate(f: EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_P(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_P] {
  override def generate(f: EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PS(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PS] {
  override def generate(f: EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorDoctorSignalType(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.DoctorSignal.Type] {
  override def generate(f: EIT_Acquisition_Supervisor.DoctorSignal.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorDoctorSignalType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorDoctorSignal_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.DoctorSignal_Payload] {
  override def generate(f: EIT_Acquisition_Supervisor.DoctorSignal_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorDoctorSignal_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorDominantFaultType(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.DominantFault.Type] {
  override def generate(f: EIT_Acquisition_Supervisor.DominantFault.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorDominantFaultType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorDominantFault_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.DominantFault_Payload] {
  override def generate(f: EIT_Acquisition_Supervisor.DominantFault_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorDominantFault_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container] {
  override def generate(f: EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_P(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_P] {
  override def generate(f: EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PS(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PS] {
  override def generate(f: EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container] {
  override def generate(f: EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_P(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_P] {
  override def generate(f: EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PS(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PS] {
  override def generate(f: EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorEquipmentFactsType(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.EquipmentFacts.Type] {
  override def generate(f: EIT_Acquisition_Supervisor.EquipmentFacts.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorEquipmentFactsType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorEquipmentFacts_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.EquipmentFacts_Payload] {
  override def generate(f: EIT_Acquisition_Supervisor.EquipmentFacts_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorEquipmentFacts_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorEquipmentObservationType(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.EquipmentObservation.Type] {
  override def generate(f: EIT_Acquisition_Supervisor.EquipmentObservation.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorEquipmentObservationType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorEquipmentObservation_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.EquipmentObservation_Payload] {
  override def generate(f: EIT_Acquisition_Supervisor.EquipmentObservation_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorEquipmentObservation_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PreState_Container] {
  override def generate(f: EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_P(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PreState_Container_P] {
  override def generate(f: EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_PS(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PreState_Container_PS] {
  override def generate(f: EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PostState_Container] {
  override def generate(f: EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_P(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PostState_Container_P] {
  override def generate(f: EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_PS(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PostState_Container_PS] {
  override def generate(f: EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorFaultSummary(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.FaultSummary] {
  override def generate(f: EIT_Acquisition_Supervisor.FaultSummary => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorFaultSummary())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorFaultSummary_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.FaultSummary_Payload] {
  override def generate(f: EIT_Acquisition_Supervisor.FaultSummary_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorFaultSummary_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container] {
  override def generate(f: EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_P(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_P] {
  override def generate(f: EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PS(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PS] {
  override def generate(f: EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container] {
  override def generate(f: EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_P(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_P] {
  override def generate(f: EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PS(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PS] {
  override def generate(f: EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorImageCommandType(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.ImageCommand.Type] {
  override def generate(f: EIT_Acquisition_Supervisor.ImageCommand.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorImageCommandType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorImageCommand_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.ImageCommand_Payload] {
  override def generate(f: EIT_Acquisition_Supervisor.ImageCommand_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorImageCommand_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorImageDispositionType(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.ImageDisposition.Type] {
  override def generate(f: EIT_Acquisition_Supervisor.ImageDisposition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorImageDispositionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorImageDisposition_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.ImageDisposition_Payload] {
  override def generate(f: EIT_Acquisition_Supervisor.ImageDisposition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorImageDisposition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorImageFeedbackType(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.ImageFeedback.Type] {
  override def generate(f: EIT_Acquisition_Supervisor.ImageFeedback.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorImageFeedbackType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorImageFeedback_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.ImageFeedback_Payload] {
  override def generate(f: EIT_Acquisition_Supervisor.ImageFeedback_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorImageFeedback_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorImageFrame(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.ImageFrame] {
  override def generate(f: EIT_Acquisition_Supervisor.ImageFrame => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorImageFrame())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorImageFrame_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.ImageFrame_Payload] {
  override def generate(f: EIT_Acquisition_Supervisor.ImageFrame_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorImageFrame_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container] {
  override def generate(f: EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_P(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_P] {
  override def generate(f: EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PS(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PS] {
  override def generate(f: EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container] {
  override def generate(f: EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_P(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_P] {
  override def generate(f: EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PS(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PS] {
  override def generate(f: EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container] {
  override def generate(f: EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_P(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_P] {
  override def generate(f: EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PS(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PS] {
  override def generate(f: EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container] {
  override def generate(f: EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_P(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_P] {
  override def generate(f: EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PS(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PS] {
  override def generate(f: EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorImageResultFactsType(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.ImageResultFacts.Type] {
  override def generate(f: EIT_Acquisition_Supervisor.ImageResultFacts.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorImageResultFactsType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorImageResultFacts_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.ImageResultFacts_Payload] {
  override def generate(f: EIT_Acquisition_Supervisor.ImageResultFacts_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorImageResultFacts_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorImageStateType(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.ImageState.Type] {
  override def generate(f: EIT_Acquisition_Supervisor.ImageState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorImageStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorImageState_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.ImageState_Payload] {
  override def generate(f: EIT_Acquisition_Supervisor.ImageState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorImageState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PreState_Container] {
  override def generate(f: EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_P(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_P] {
  override def generate(f: EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PS(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PS] {
  override def generate(f: EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PostState_Container] {
  override def generate(f: EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_P(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_P] {
  override def generate(f: EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PS(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PS] {
  override def generate(f: EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorPreparationFactsType(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.PreparationFacts.Type] {
  override def generate(f: EIT_Acquisition_Supervisor.PreparationFacts.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorPreparationFactsType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorPreparationFacts_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.PreparationFacts_Payload] {
  override def generate(f: EIT_Acquisition_Supervisor.PreparationFacts_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorPreparationFacts_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorPreparationObservationType(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.PreparationObservation.Type] {
  override def generate(f: EIT_Acquisition_Supervisor.PreparationObservation.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorPreparationObservationType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorPreparationObservation_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.PreparationObservation_Payload] {
  override def generate(f: EIT_Acquisition_Supervisor.PreparationObservation_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorPreparationObservation_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorProposalType(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.Proposal.Type] {
  override def generate(f: EIT_Acquisition_Supervisor.Proposal.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorProposalType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorProposal_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.Proposal_Payload] {
  override def generate(f: EIT_Acquisition_Supervisor.Proposal_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorProposal_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorPublicModeType(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.PublicMode.Type] {
  override def generate(f: EIT_Acquisition_Supervisor.PublicMode.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorPublicModeType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorPublicMode_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.PublicMode_Payload] {
  override def generate(f: EIT_Acquisition_Supervisor.PublicMode_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorPublicMode_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PreState_Container] {
  override def generate(f: EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_P(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PreState_Container_P] {
  override def generate(f: EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_PS(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PreState_Container_PS] {
  override def generate(f: EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PostState_Container] {
  override def generate(f: EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_P(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PostState_Container_P] {
  override def generate(f: EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_PS(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PostState_Container_PS] {
  override def generate(f: EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorRecoveryCauseType(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.RecoveryCause.Type] {
  override def generate(f: EIT_Acquisition_Supervisor.RecoveryCause.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorRecoveryCauseType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorRecoveryCause_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.RecoveryCause_Payload] {
  override def generate(f: EIT_Acquisition_Supervisor.RecoveryCause_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorRecoveryCause_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PreState_Container] {
  override def generate(f: EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_P(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PreState_Container_P] {
  override def generate(f: EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_PS(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PreState_Container_PS] {
  override def generate(f: EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PostState_Container] {
  override def generate(f: EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_P(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PostState_Container_P] {
  override def generate(f: EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_PS(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PostState_Container_PS] {
  override def generate(f: EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorRecoveryEventType(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.RecoveryEvent.Type] {
  override def generate(f: EIT_Acquisition_Supervisor.RecoveryEvent.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorRecoveryEventType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorRecoveryEvent_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.RecoveryEvent_Payload] {
  override def generate(f: EIT_Acquisition_Supervisor.RecoveryEvent_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorRecoveryEvent_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorRecoveryFrame(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.RecoveryFrame] {
  override def generate(f: EIT_Acquisition_Supervisor.RecoveryFrame => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorRecoveryFrame())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorRecoveryFrame_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.RecoveryFrame_Payload] {
  override def generate(f: EIT_Acquisition_Supervisor.RecoveryFrame_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorRecoveryFrame_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorRecoveryGateType(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.RecoveryGate.Type] {
  override def generate(f: EIT_Acquisition_Supervisor.RecoveryGate.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorRecoveryGateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorRecoveryGate_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.RecoveryGate_Payload] {
  override def generate(f: EIT_Acquisition_Supervisor.RecoveryGate_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorRecoveryGate_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorRecoveryStateType(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.RecoveryState.Type] {
  override def generate(f: EIT_Acquisition_Supervisor.RecoveryState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorRecoveryStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorRecoveryState_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.RecoveryState_Payload] {
  override def generate(f: EIT_Acquisition_Supervisor.RecoveryState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorRecoveryState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorRequestClassType(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.RequestClass.Type] {
  override def generate(f: EIT_Acquisition_Supervisor.RequestClass.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorRequestClassType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorRequestClass_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.RequestClass_Payload] {
  override def generate(f: EIT_Acquisition_Supervisor.RequestClass_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorRequestClass_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorRequestFactsRecord(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.RequestFactsRecord] {
  override def generate(f: EIT_Acquisition_Supervisor.RequestFactsRecord => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorRequestFactsRecord())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorRequestFactsRecord_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.RequestFactsRecord_Payload] {
  override def generate(f: EIT_Acquisition_Supervisor.RequestFactsRecord_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorRequestFactsRecord_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorSelectedActionType(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.SelectedAction.Type] {
  override def generate(f: EIT_Acquisition_Supervisor.SelectedAction.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorSelectedActionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorSelectedAction_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.SelectedAction_Payload] {
  override def generate(f: EIT_Acquisition_Supervisor.SelectedAction_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorSelectedAction_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorSelectedCauseType(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.SelectedCause.Type] {
  override def generate(f: EIT_Acquisition_Supervisor.SelectedCause.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorSelectedCauseType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorSelectedCause_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.SelectedCause_Payload] {
  override def generate(f: EIT_Acquisition_Supervisor.SelectedCause_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorSelectedCause_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PreState_Container] {
  override def generate(f: EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_P(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PreState_Container_P] {
  override def generate(f: EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_PS(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PreState_Container_PS] {
  override def generate(f: EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PostState_Container] {
  override def generate(f: EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_P(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PostState_Container_P] {
  override def generate(f: EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_PS(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PostState_Container_PS] {
  override def generate(f: EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorSessionFrame(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.SessionFrame] {
  override def generate(f: EIT_Acquisition_Supervisor.SessionFrame => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorSessionFrame())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorSessionFrame_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.SessionFrame_Payload] {
  override def generate(f: EIT_Acquisition_Supervisor.SessionFrame_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorSessionFrame_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorSessionStateType(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.SessionState.Type] {
  override def generate(f: EIT_Acquisition_Supervisor.SessionState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorSessionStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorSessionState_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.SessionState_Payload] {
  override def generate(f: EIT_Acquisition_Supervisor.SessionState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorSessionState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorStartFeasibilityType(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.StartFeasibility.Type] {
  override def generate(f: EIT_Acquisition_Supervisor.StartFeasibility.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorStartFeasibilityType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorStartFeasibility_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.StartFeasibility_Payload] {
  override def generate(f: EIT_Acquisition_Supervisor.StartFeasibility_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorStartFeasibility_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container] {
  override def generate(f: EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_P(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_P] {
  override def generate(f: EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PS(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PS] {
  override def generate(f: EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container] {
  override def generate(f: EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_P(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_P] {
  override def generate(f: EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PS(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PS] {
  override def generate(f: EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorStatusFrame(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.StatusFrame] {
  override def generate(f: EIT_Acquisition_Supervisor.StatusFrame => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorStatusFrame())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorStatusFrame_Payload(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.StatusFrame_Payload] {
  override def generate(f: EIT_Acquisition_Supervisor.StatusFrame_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorStatusFrame_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container] {
  override def generate(f: EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_P(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_P] {
  override def generate(f: EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PS(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PS] {
  override def generate(f: EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container] {
  override def generate(f: EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_P(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_P] {
  override def generate(f: EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PS(param: RandomLibI) extends MJen[EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PS] {
  override def generate(f: EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PS())

      if (!continue) {
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


