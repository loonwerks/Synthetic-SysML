// #Sireum

package eit_image_availability_coordinator

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

ImageSignal.scala

ImageFacts.scala

DoctorSignal.scala

ReviewFacts.scala

PreparationContext.scala

ContextFacts.scala

ServiceObservation.scala

ServiceFacts.scala

DominantFault.scala

RecoveryEvent.scala

RecoveryState.scala

EvidenceState.scala

AdmissionOutcome.scala

AdmissionReason.scala

ArtifactState.scala

AvailabilityDecision.scala

BlockReason.scala

ReviewState.scala

PresentationProposal.scala

SelectedAction.scala

SelectedReason.scala

UpstreamDisposition.scala

PublicMode.scala

Visibility.scala

FaultSummary.scala

RecoveryFrame.scala

EvidenceFrame.scala

AdmissionFrame.scala

ArtifactFrame.scala

AvailabilityDecisionFrame.scala

ReviewFrame.scala

PresentationFrame.scala

DecisionFrame.scala

AvailabilityFrame.scala

Base_Types.scala

ImageEventQualification_coordination_image_event_qualification_Containers.scala

DoctorEventQualification_coordination_doctor_event_qualification_Containers.scala

PreparationContextAssessment_coordination_preparation_context_assessment_Containers.scala

AvailabilityServiceAssessment_coordination_availability_service_assessment_Containers.scala

FaultComposition_coordination_fault_composition_Containers.scala

RecoveryControl_coordination_recovery_control_Containers.scala

EvidenceLifecycle_coordination_evidence_lifecycle_Containers.scala

AdmissionDecisionOwner_coordination_admission_decision_Containers.scala

ArtifactLifecycle_coordination_artifact_lifecycle_Containers.scala

AvailabilityDecisionOwner_coordination_availability_decision_Containers.scala

ReviewLifecycle_coordination_review_lifecycle_Containers.scala

PresentationDecisionOwner_coordination_presentation_decision_Containers.scala

AvailabilityArbitration_coordination_availability_arbitration_Containers.scala

PublicationComposition_coordination_publication_composition_Containers.scala

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

@record class Gen_EIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PreState_Container] {
  override def generate(f: EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_P(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PreState_Container_P] {
  override def generate(f: EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PS(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PS] {
  override def generate(f: EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PostState_Container] {
  override def generate(f: EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_P(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PostState_Container_P] {
  override def generate(f: EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PS(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PS] {
  override def generate(f: EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorAdmissionFrame(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.AdmissionFrame] {
  override def generate(f: EIT_Image_Availability_Coordinator.AdmissionFrame => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorAdmissionFrame())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorAdmissionFrame_Payload(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.AdmissionFrame_Payload] {
  override def generate(f: EIT_Image_Availability_Coordinator.AdmissionFrame_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorAdmissionFrame_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorAdmissionOutcomeType(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.AdmissionOutcome.Type] {
  override def generate(f: EIT_Image_Availability_Coordinator.AdmissionOutcome.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorAdmissionOutcomeType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorAdmissionOutcome_Payload(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.AdmissionOutcome_Payload] {
  override def generate(f: EIT_Image_Availability_Coordinator.AdmissionOutcome_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorAdmissionOutcome_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorAdmissionReasonType(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.AdmissionReason.Type] {
  override def generate(f: EIT_Image_Availability_Coordinator.AdmissionReason.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorAdmissionReasonType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorAdmissionReason_Payload(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.AdmissionReason_Payload] {
  override def generate(f: EIT_Image_Availability_Coordinator.AdmissionReason_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorAdmissionReason_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorArtifactFrame(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.ArtifactFrame] {
  override def generate(f: EIT_Image_Availability_Coordinator.ArtifactFrame => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorArtifactFrame())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorArtifactFrame_Payload(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.ArtifactFrame_Payload] {
  override def generate(f: EIT_Image_Availability_Coordinator.ArtifactFrame_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorArtifactFrame_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container] {
  override def generate(f: EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_P(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_P] {
  override def generate(f: EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PS(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PS] {
  override def generate(f: EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container] {
  override def generate(f: EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_P(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_P] {
  override def generate(f: EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PS(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PS] {
  override def generate(f: EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorArtifactStateType(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.ArtifactState.Type] {
  override def generate(f: EIT_Image_Availability_Coordinator.ArtifactState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorArtifactStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorArtifactState_Payload(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.ArtifactState_Payload] {
  override def generate(f: EIT_Image_Availability_Coordinator.ArtifactState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorArtifactState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PreState_Container] {
  override def generate(f: EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_P(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PreState_Container_P] {
  override def generate(f: EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PS(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PS] {
  override def generate(f: EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PostState_Container] {
  override def generate(f: EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_P(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PostState_Container_P] {
  override def generate(f: EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PS(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PS] {
  override def generate(f: EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorAvailabilityDecisionType(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.AvailabilityDecision.Type] {
  override def generate(f: EIT_Image_Availability_Coordinator.AvailabilityDecision.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorAvailabilityDecisionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorAvailabilityDecision_Payload(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.AvailabilityDecision_Payload] {
  override def generate(f: EIT_Image_Availability_Coordinator.AvailabilityDecision_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorAvailabilityDecision_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorAvailabilityDecisionFrame(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.AvailabilityDecisionFrame] {
  override def generate(f: EIT_Image_Availability_Coordinator.AvailabilityDecisionFrame => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorAvailabilityDecisionFrame())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorAvailabilityDecisionFrame_Payload(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.AvailabilityDecisionFrame_Payload] {
  override def generate(f: EIT_Image_Availability_Coordinator.AvailabilityDecisionFrame_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorAvailabilityDecisionFrame_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PreState_Container] {
  override def generate(f: EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_P(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_P] {
  override def generate(f: EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PS(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PS] {
  override def generate(f: EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PostState_Container] {
  override def generate(f: EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_P(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_P] {
  override def generate(f: EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PS(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PS] {
  override def generate(f: EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorAvailabilityFrame(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.AvailabilityFrame] {
  override def generate(f: EIT_Image_Availability_Coordinator.AvailabilityFrame => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorAvailabilityFrame())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorAvailabilityFrame_Payload(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.AvailabilityFrame_Payload] {
  override def generate(f: EIT_Image_Availability_Coordinator.AvailabilityFrame_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorAvailabilityFrame_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container] {
  override def generate(f: EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_P(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_P] {
  override def generate(f: EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PS(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PS] {
  override def generate(f: EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container] {
  override def generate(f: EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_P(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_P] {
  override def generate(f: EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PS(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PS] {
  override def generate(f: EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorBlockReasonType(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.BlockReason.Type] {
  override def generate(f: EIT_Image_Availability_Coordinator.BlockReason.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorBlockReasonType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorBlockReason_Payload(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.BlockReason_Payload] {
  override def generate(f: EIT_Image_Availability_Coordinator.BlockReason_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorBlockReason_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorContextFactsType(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.ContextFacts.Type] {
  override def generate(f: EIT_Image_Availability_Coordinator.ContextFacts.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorContextFactsType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorContextFacts_Payload(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.ContextFacts_Payload] {
  override def generate(f: EIT_Image_Availability_Coordinator.ContextFacts_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorContextFacts_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorDecisionFrame(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.DecisionFrame] {
  override def generate(f: EIT_Image_Availability_Coordinator.DecisionFrame => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorDecisionFrame())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorDecisionFrame_Payload(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.DecisionFrame_Payload] {
  override def generate(f: EIT_Image_Availability_Coordinator.DecisionFrame_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorDecisionFrame_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PreState_Container] {
  override def generate(f: EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_P(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_P] {
  override def generate(f: EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PS(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PS] {
  override def generate(f: EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PostState_Container] {
  override def generate(f: EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_P(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_P] {
  override def generate(f: EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PS(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PS] {
  override def generate(f: EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorDoctorSignalType(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.DoctorSignal.Type] {
  override def generate(f: EIT_Image_Availability_Coordinator.DoctorSignal.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorDoctorSignalType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorDoctorSignal_Payload(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.DoctorSignal_Payload] {
  override def generate(f: EIT_Image_Availability_Coordinator.DoctorSignal_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorDoctorSignal_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorDominantFaultType(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.DominantFault.Type] {
  override def generate(f: EIT_Image_Availability_Coordinator.DominantFault.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorDominantFaultType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorDominantFault_Payload(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.DominantFault_Payload] {
  override def generate(f: EIT_Image_Availability_Coordinator.DominantFault_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorDominantFault_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorEvidenceFrame(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.EvidenceFrame] {
  override def generate(f: EIT_Image_Availability_Coordinator.EvidenceFrame => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorEvidenceFrame())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorEvidenceFrame_Payload(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.EvidenceFrame_Payload] {
  override def generate(f: EIT_Image_Availability_Coordinator.EvidenceFrame_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorEvidenceFrame_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container] {
  override def generate(f: EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_P(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_P] {
  override def generate(f: EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PS(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PS] {
  override def generate(f: EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container] {
  override def generate(f: EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_P(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_P] {
  override def generate(f: EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PS(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PS] {
  override def generate(f: EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorEvidenceStateType(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.EvidenceState.Type] {
  override def generate(f: EIT_Image_Availability_Coordinator.EvidenceState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorEvidenceStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorEvidenceState_Payload(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.EvidenceState_Payload] {
  override def generate(f: EIT_Image_Availability_Coordinator.EvidenceState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorEvidenceState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PreState_Container] {
  override def generate(f: EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_P(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PreState_Container_P] {
  override def generate(f: EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_PS(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PreState_Container_PS] {
  override def generate(f: EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PostState_Container] {
  override def generate(f: EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_P(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PostState_Container_P] {
  override def generate(f: EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_PS(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PostState_Container_PS] {
  override def generate(f: EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorFaultSummary(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.FaultSummary] {
  override def generate(f: EIT_Image_Availability_Coordinator.FaultSummary => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorFaultSummary())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorFaultSummary_Payload(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.FaultSummary_Payload] {
  override def generate(f: EIT_Image_Availability_Coordinator.FaultSummary_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorFaultSummary_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PreState_Container] {
  override def generate(f: EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_P(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PreState_Container_P] {
  override def generate(f: EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_PS(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PreState_Container_PS] {
  override def generate(f: EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PostState_Container] {
  override def generate(f: EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_P(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PostState_Container_P] {
  override def generate(f: EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_PS(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PostState_Container_PS] {
  override def generate(f: EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorImageFactsType(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.ImageFacts.Type] {
  override def generate(f: EIT_Image_Availability_Coordinator.ImageFacts.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorImageFactsType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorImageFacts_Payload(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.ImageFacts_Payload] {
  override def generate(f: EIT_Image_Availability_Coordinator.ImageFacts_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorImageFacts_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorImageSignalType(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.ImageSignal.Type] {
  override def generate(f: EIT_Image_Availability_Coordinator.ImageSignal.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorImageSignalType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorImageSignal_Payload(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.ImageSignal_Payload] {
  override def generate(f: EIT_Image_Availability_Coordinator.ImageSignal_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorImageSignal_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorPreparationContextType(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.PreparationContext.Type] {
  override def generate(f: EIT_Image_Availability_Coordinator.PreparationContext.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorPreparationContextType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorPreparationContext_Payload(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.PreparationContext_Payload] {
  override def generate(f: EIT_Image_Availability_Coordinator.PreparationContext_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorPreparationContext_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container] {
  override def generate(f: EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_P(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_P] {
  override def generate(f: EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PS(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PS] {
  override def generate(f: EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container] {
  override def generate(f: EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_P(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_P] {
  override def generate(f: EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PS(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PS] {
  override def generate(f: EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PreState_Container] {
  override def generate(f: EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_P(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PreState_Container_P] {
  override def generate(f: EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PS(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PS] {
  override def generate(f: EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PostState_Container] {
  override def generate(f: EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_P(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PostState_Container_P] {
  override def generate(f: EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PS(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PS] {
  override def generate(f: EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorPresentationFrame(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.PresentationFrame] {
  override def generate(f: EIT_Image_Availability_Coordinator.PresentationFrame => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorPresentationFrame())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorPresentationFrame_Payload(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.PresentationFrame_Payload] {
  override def generate(f: EIT_Image_Availability_Coordinator.PresentationFrame_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorPresentationFrame_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorPresentationProposalType(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.PresentationProposal.Type] {
  override def generate(f: EIT_Image_Availability_Coordinator.PresentationProposal.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorPresentationProposalType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorPresentationProposal_Payload(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.PresentationProposal_Payload] {
  override def generate(f: EIT_Image_Availability_Coordinator.PresentationProposal_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorPresentationProposal_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorPublicModeType(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.PublicMode.Type] {
  override def generate(f: EIT_Image_Availability_Coordinator.PublicMode.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorPublicModeType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorPublicMode_Payload(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.PublicMode_Payload] {
  override def generate(f: EIT_Image_Availability_Coordinator.PublicMode_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorPublicMode_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PreState_Container] {
  override def generate(f: EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_P(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PreState_Container_P] {
  override def generate(f: EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_PS(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PreState_Container_PS] {
  override def generate(f: EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PostState_Container] {
  override def generate(f: EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_P(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PostState_Container_P] {
  override def generate(f: EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_PS(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PostState_Container_PS] {
  override def generate(f: EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PreState_Container] {
  override def generate(f: EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_P(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PreState_Container_P] {
  override def generate(f: EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_PS(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PreState_Container_PS] {
  override def generate(f: EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PostState_Container] {
  override def generate(f: EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_P(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PostState_Container_P] {
  override def generate(f: EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_PS(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PostState_Container_PS] {
  override def generate(f: EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorRecoveryEventType(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.RecoveryEvent.Type] {
  override def generate(f: EIT_Image_Availability_Coordinator.RecoveryEvent.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorRecoveryEventType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorRecoveryEvent_Payload(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.RecoveryEvent_Payload] {
  override def generate(f: EIT_Image_Availability_Coordinator.RecoveryEvent_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorRecoveryEvent_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorRecoveryFrame(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.RecoveryFrame] {
  override def generate(f: EIT_Image_Availability_Coordinator.RecoveryFrame => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorRecoveryFrame())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorRecoveryFrame_Payload(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.RecoveryFrame_Payload] {
  override def generate(f: EIT_Image_Availability_Coordinator.RecoveryFrame_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorRecoveryFrame_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorRecoveryStateType(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.RecoveryState.Type] {
  override def generate(f: EIT_Image_Availability_Coordinator.RecoveryState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorRecoveryStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorRecoveryState_Payload(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.RecoveryState_Payload] {
  override def generate(f: EIT_Image_Availability_Coordinator.RecoveryState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorRecoveryState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorReviewFactsType(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.ReviewFacts.Type] {
  override def generate(f: EIT_Image_Availability_Coordinator.ReviewFacts.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorReviewFactsType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorReviewFacts_Payload(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.ReviewFacts_Payload] {
  override def generate(f: EIT_Image_Availability_Coordinator.ReviewFacts_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorReviewFacts_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorReviewFrame(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.ReviewFrame] {
  override def generate(f: EIT_Image_Availability_Coordinator.ReviewFrame => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorReviewFrame())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorReviewFrame_Payload(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.ReviewFrame_Payload] {
  override def generate(f: EIT_Image_Availability_Coordinator.ReviewFrame_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorReviewFrame_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PreState_Container] {
  override def generate(f: EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_P(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PreState_Container_P] {
  override def generate(f: EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_PS(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PreState_Container_PS] {
  override def generate(f: EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PostState_Container] {
  override def generate(f: EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_P(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PostState_Container_P] {
  override def generate(f: EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_PS(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PostState_Container_PS] {
  override def generate(f: EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorReviewStateType(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.ReviewState.Type] {
  override def generate(f: EIT_Image_Availability_Coordinator.ReviewState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorReviewStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorReviewState_Payload(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.ReviewState_Payload] {
  override def generate(f: EIT_Image_Availability_Coordinator.ReviewState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorReviewState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorSelectedActionType(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.SelectedAction.Type] {
  override def generate(f: EIT_Image_Availability_Coordinator.SelectedAction.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorSelectedActionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorSelectedAction_Payload(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.SelectedAction_Payload] {
  override def generate(f: EIT_Image_Availability_Coordinator.SelectedAction_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorSelectedAction_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorSelectedReasonType(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.SelectedReason.Type] {
  override def generate(f: EIT_Image_Availability_Coordinator.SelectedReason.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorSelectedReasonType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorSelectedReason_Payload(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.SelectedReason_Payload] {
  override def generate(f: EIT_Image_Availability_Coordinator.SelectedReason_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorSelectedReason_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorServiceFactsType(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.ServiceFacts.Type] {
  override def generate(f: EIT_Image_Availability_Coordinator.ServiceFacts.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorServiceFactsType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorServiceFacts_Payload(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.ServiceFacts_Payload] {
  override def generate(f: EIT_Image_Availability_Coordinator.ServiceFacts_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorServiceFacts_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorServiceObservationType(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.ServiceObservation.Type] {
  override def generate(f: EIT_Image_Availability_Coordinator.ServiceObservation.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorServiceObservationType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorServiceObservation_Payload(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.ServiceObservation_Payload] {
  override def generate(f: EIT_Image_Availability_Coordinator.ServiceObservation_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorServiceObservation_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorUpstreamDispositionType(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.UpstreamDisposition.Type] {
  override def generate(f: EIT_Image_Availability_Coordinator.UpstreamDisposition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorUpstreamDispositionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorUpstreamDisposition_Payload(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.UpstreamDisposition_Payload] {
  override def generate(f: EIT_Image_Availability_Coordinator.UpstreamDisposition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorUpstreamDisposition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorVisibilityType(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.Visibility.Type] {
  override def generate(f: EIT_Image_Availability_Coordinator.Visibility.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorVisibilityType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_EIT_Image_Availability_CoordinatorVisibility_Payload(param: RandomLibI) extends MJen[EIT_Image_Availability_Coordinator.Visibility_Payload] {
  override def generate(f: EIT_Image_Availability_Coordinator.Visibility_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextEIT_Image_Availability_CoordinatorVisibility_Payload())

      if (!continue) {
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


