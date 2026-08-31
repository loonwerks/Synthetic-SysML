// #Sireum

package battery_status_assessment_service

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

CheckCommand.scala

CheckToken.scala

AcquisitionOutcome.scala

PublicationOutcome.scala

AcquisitionDirective.scala

AssessmentContext.scala

PublicationDirective.scala

CheckStatus.scala

ReportTicket.scala

ReportAvailability.scala

CapacityLevel.scala

ReportQuality.scala

StatusReadRequest.scala

QualifiedEvidence.scala

AssessmentResult.scala

FeedbackTicket.scala

UseDisposition.scala

LifecycleState.scala

LastAdmittedToken.scala

AcquisitionState.scala

PublicationState.scala

CheckRequest.scala

BatteryReport.scala

CapturedReport.scala

TaggedQualifiedEvidence.scala

TaggedAssessment.scala

ControlUseFeedback.scala

Base_Types.scala

CheckLifecycle_battery_assessment_process_check_lifecycle_Containers.scala

ReportAcquisition_battery_assessment_process_report_acquisition_Containers.scala

ReportQualification_battery_assessment_process_report_qualification_Containers.scala

AssessmentDecision_battery_assessment_process_assessment_decision_Containers.scala

ResultCustody_battery_assessment_process_result_custody_Containers.scala

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

@record class Gen_Battery_Status_Assessment_ServiceAcquisitionDirectiveType(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.AcquisitionDirective.Type] {
  override def generate(f: Battery_Status_Assessment_Service.AcquisitionDirective.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServiceAcquisitionDirectiveType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServiceAcquisitionDirective_Payload(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.AcquisitionDirective_Payload] {
  override def generate(f: Battery_Status_Assessment_Service.AcquisitionDirective_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServiceAcquisitionDirective_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServiceAcquisitionOutcomeType(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.AcquisitionOutcome.Type] {
  override def generate(f: Battery_Status_Assessment_Service.AcquisitionOutcome.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServiceAcquisitionOutcomeType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServiceAcquisitionOutcome_Payload(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.AcquisitionOutcome_Payload] {
  override def generate(f: Battery_Status_Assessment_Service.AcquisitionOutcome_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServiceAcquisitionOutcome_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServiceAcquisitionStateType(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.AcquisitionState.Type] {
  override def generate(f: Battery_Status_Assessment_Service.AcquisitionState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServiceAcquisitionStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServiceAcquisitionState_Payload(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.AcquisitionState_Payload] {
  override def generate(f: Battery_Status_Assessment_Service.AcquisitionState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServiceAcquisitionState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServiceAssessmentContextType(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.AssessmentContext.Type] {
  override def generate(f: Battery_Status_Assessment_Service.AssessmentContext.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServiceAssessmentContextType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServiceAssessmentContext_Payload(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.AssessmentContext_Payload] {
  override def generate(f: Battery_Status_Assessment_Service.AssessmentContext_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServiceAssessmentContext_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container] {
  override def generate(f: Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P] {
  override def generate(f: Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS] {
  override def generate(f: Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container] {
  override def generate(f: Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P] {
  override def generate(f: Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS] {
  override def generate(f: Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServiceAssessmentResultType(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.AssessmentResult.Type] {
  override def generate(f: Battery_Status_Assessment_Service.AssessmentResult.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServiceAssessmentResultType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServiceAssessmentResult_Payload(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.AssessmentResult_Payload] {
  override def generate(f: Battery_Status_Assessment_Service.AssessmentResult_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServiceAssessmentResult_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServiceBatteryReport(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.BatteryReport] {
  override def generate(f: Battery_Status_Assessment_Service.BatteryReport => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServiceBatteryReport())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServiceBatteryReport_Payload(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.BatteryReport_Payload] {
  override def generate(f: Battery_Status_Assessment_Service.BatteryReport_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServiceBatteryReport_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServiceCapacityLevelType(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.CapacityLevel.Type] {
  override def generate(f: Battery_Status_Assessment_Service.CapacityLevel.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServiceCapacityLevelType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServiceCapacityLevel_Payload(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.CapacityLevel_Payload] {
  override def generate(f: Battery_Status_Assessment_Service.CapacityLevel_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServiceCapacityLevel_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServiceCapturedReport(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.CapturedReport] {
  override def generate(f: Battery_Status_Assessment_Service.CapturedReport => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServiceCapturedReport())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServiceCapturedReport_Payload(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.CapturedReport_Payload] {
  override def generate(f: Battery_Status_Assessment_Service.CapturedReport_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServiceCapturedReport_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServiceCheckCommandType(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.CheckCommand.Type] {
  override def generate(f: Battery_Status_Assessment_Service.CheckCommand.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServiceCheckCommandType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServiceCheckCommand_Payload(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.CheckCommand_Payload] {
  override def generate(f: Battery_Status_Assessment_Service.CheckCommand_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServiceCheckCommand_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container] {
  override def generate(f: Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P] {
  override def generate(f: Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS] {
  override def generate(f: Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container] {
  override def generate(f: Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P] {
  override def generate(f: Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS] {
  override def generate(f: Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServiceCheckRequest(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.CheckRequest] {
  override def generate(f: Battery_Status_Assessment_Service.CheckRequest => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServiceCheckRequest())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServiceCheckRequest_Payload(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.CheckRequest_Payload] {
  override def generate(f: Battery_Status_Assessment_Service.CheckRequest_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServiceCheckRequest_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServiceCheckStatusType(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.CheckStatus.Type] {
  override def generate(f: Battery_Status_Assessment_Service.CheckStatus.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServiceCheckStatusType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServiceCheckStatus_Payload(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.CheckStatus_Payload] {
  override def generate(f: Battery_Status_Assessment_Service.CheckStatus_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServiceCheckStatus_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServiceCheckTokenType(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.CheckToken.Type] {
  override def generate(f: Battery_Status_Assessment_Service.CheckToken.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServiceCheckTokenType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServiceCheckToken_Payload(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.CheckToken_Payload] {
  override def generate(f: Battery_Status_Assessment_Service.CheckToken_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServiceCheckToken_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServiceControlUseFeedback(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.ControlUseFeedback] {
  override def generate(f: Battery_Status_Assessment_Service.ControlUseFeedback => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServiceControlUseFeedback())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServiceControlUseFeedback_Payload(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.ControlUseFeedback_Payload] {
  override def generate(f: Battery_Status_Assessment_Service.ControlUseFeedback_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServiceControlUseFeedback_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServiceFeedbackTicketType(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.FeedbackTicket.Type] {
  override def generate(f: Battery_Status_Assessment_Service.FeedbackTicket.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServiceFeedbackTicketType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServiceFeedbackTicket_Payload(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.FeedbackTicket_Payload] {
  override def generate(f: Battery_Status_Assessment_Service.FeedbackTicket_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServiceFeedbackTicket_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServiceLastAdmittedTokenType(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.LastAdmittedToken.Type] {
  override def generate(f: Battery_Status_Assessment_Service.LastAdmittedToken.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServiceLastAdmittedTokenType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServiceLastAdmittedToken_Payload(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.LastAdmittedToken_Payload] {
  override def generate(f: Battery_Status_Assessment_Service.LastAdmittedToken_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServiceLastAdmittedToken_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServiceLifecycleStateType(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.LifecycleState.Type] {
  override def generate(f: Battery_Status_Assessment_Service.LifecycleState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServiceLifecycleStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServiceLifecycleState_Payload(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.LifecycleState_Payload] {
  override def generate(f: Battery_Status_Assessment_Service.LifecycleState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServiceLifecycleState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServicePublicationDirectiveType(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.PublicationDirective.Type] {
  override def generate(f: Battery_Status_Assessment_Service.PublicationDirective.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServicePublicationDirectiveType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServicePublicationDirective_Payload(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.PublicationDirective_Payload] {
  override def generate(f: Battery_Status_Assessment_Service.PublicationDirective_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServicePublicationDirective_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServicePublicationOutcomeType(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.PublicationOutcome.Type] {
  override def generate(f: Battery_Status_Assessment_Service.PublicationOutcome.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServicePublicationOutcomeType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServicePublicationOutcome_Payload(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.PublicationOutcome_Payload] {
  override def generate(f: Battery_Status_Assessment_Service.PublicationOutcome_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServicePublicationOutcome_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServicePublicationStateType(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.PublicationState.Type] {
  override def generate(f: Battery_Status_Assessment_Service.PublicationState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServicePublicationStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServicePublicationState_Payload(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.PublicationState_Payload] {
  override def generate(f: Battery_Status_Assessment_Service.PublicationState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServicePublicationState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServiceQualifiedEvidenceType(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.QualifiedEvidence.Type] {
  override def generate(f: Battery_Status_Assessment_Service.QualifiedEvidence.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServiceQualifiedEvidenceType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServiceQualifiedEvidence_Payload(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.QualifiedEvidence_Payload] {
  override def generate(f: Battery_Status_Assessment_Service.QualifiedEvidence_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServiceQualifiedEvidence_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container] {
  override def generate(f: Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P] {
  override def generate(f: Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS] {
  override def generate(f: Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container] {
  override def generate(f: Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P] {
  override def generate(f: Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS] {
  override def generate(f: Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServiceReportAvailabilityType(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.ReportAvailability.Type] {
  override def generate(f: Battery_Status_Assessment_Service.ReportAvailability.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServiceReportAvailabilityType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServiceReportAvailability_Payload(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.ReportAvailability_Payload] {
  override def generate(f: Battery_Status_Assessment_Service.ReportAvailability_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServiceReportAvailability_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container] {
  override def generate(f: Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_P(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container_P] {
  override def generate(f: Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS] {
  override def generate(f: Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container] {
  override def generate(f: Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_P(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container_P] {
  override def generate(f: Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS] {
  override def generate(f: Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServiceReportQualityType(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.ReportQuality.Type] {
  override def generate(f: Battery_Status_Assessment_Service.ReportQuality.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServiceReportQualityType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServiceReportQuality_Payload(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.ReportQuality_Payload] {
  override def generate(f: Battery_Status_Assessment_Service.ReportQuality_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServiceReportQuality_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServiceReportTicketType(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.ReportTicket.Type] {
  override def generate(f: Battery_Status_Assessment_Service.ReportTicket.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServiceReportTicketType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServiceReportTicket_Payload(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.ReportTicket_Payload] {
  override def generate(f: Battery_Status_Assessment_Service.ReportTicket_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServiceReportTicket_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container] {
  override def generate(f: Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_P(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container_P] {
  override def generate(f: Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PS(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container_PS] {
  override def generate(f: Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container] {
  override def generate(f: Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_P(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container_P] {
  override def generate(f: Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PS(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container_PS] {
  override def generate(f: Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServiceStatusReadRequestType(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.StatusReadRequest.Type] {
  override def generate(f: Battery_Status_Assessment_Service.StatusReadRequest.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServiceStatusReadRequestType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServiceStatusReadRequest_Payload(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.StatusReadRequest_Payload] {
  override def generate(f: Battery_Status_Assessment_Service.StatusReadRequest_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServiceStatusReadRequest_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServiceTaggedAssessment(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.TaggedAssessment] {
  override def generate(f: Battery_Status_Assessment_Service.TaggedAssessment => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServiceTaggedAssessment())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServiceTaggedAssessment_Payload(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.TaggedAssessment_Payload] {
  override def generate(f: Battery_Status_Assessment_Service.TaggedAssessment_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServiceTaggedAssessment_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServiceTaggedQualifiedEvidence(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.TaggedQualifiedEvidence] {
  override def generate(f: Battery_Status_Assessment_Service.TaggedQualifiedEvidence => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServiceTaggedQualifiedEvidence())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServiceTaggedQualifiedEvidence_Payload(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.TaggedQualifiedEvidence_Payload] {
  override def generate(f: Battery_Status_Assessment_Service.TaggedQualifiedEvidence_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServiceTaggedQualifiedEvidence_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServiceUseDispositionType(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.UseDisposition.Type] {
  override def generate(f: Battery_Status_Assessment_Service.UseDisposition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServiceUseDispositionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Battery_Status_Assessment_ServiceUseDisposition_Payload(param: RandomLibI) extends MJen[Battery_Status_Assessment_Service.UseDisposition_Payload] {
  override def generate(f: Battery_Status_Assessment_Service.UseDisposition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBattery_Status_Assessment_ServiceUseDisposition_Payload())

      if (!continue) {
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


