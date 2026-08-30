// #Sireum

package scp_candidate

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

Engage_AP_Command.scala

Engage_Command_Status.scala

Guidance_Readiness.scala

Attitude_Acceptability.scala

AP_Availability.scala

AP_Guidance_Request.scala

AP_Status.scala

AP_On_Indication.scala

Base_Types.scala

FCI_Command_Intake_Thread_control_process_fci_command_intake_Containers.scala

Engagement_Decision_Thread_control_process_engagement_decision_Containers.scala

Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_Containers.scala

Status_Reporting_Thread_control_process_status_reporting_Containers.scala

CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_Containers.scala

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

@record class Gen_FAA_Autopilot_EngagementAP_AvailabilityType(param: RandomLibI) extends MJen[FAA_Autopilot_Engagement.AP_Availability.Type] {
  override def generate(f: FAA_Autopilot_Engagement.AP_Availability.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_Autopilot_EngagementAP_AvailabilityType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_Autopilot_EngagementAP_Availability_Payload(param: RandomLibI) extends MJen[FAA_Autopilot_Engagement.AP_Availability_Payload] {
  override def generate(f: FAA_Autopilot_Engagement.AP_Availability_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_Autopilot_EngagementAP_Availability_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_Autopilot_EngagementAP_Guidance_RequestType(param: RandomLibI) extends MJen[FAA_Autopilot_Engagement.AP_Guidance_Request.Type] {
  override def generate(f: FAA_Autopilot_Engagement.AP_Guidance_Request.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_Autopilot_EngagementAP_Guidance_RequestType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_Autopilot_EngagementAP_Guidance_Request_Payload(param: RandomLibI) extends MJen[FAA_Autopilot_Engagement.AP_Guidance_Request_Payload] {
  override def generate(f: FAA_Autopilot_Engagement.AP_Guidance_Request_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_Autopilot_EngagementAP_Guidance_Request_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_Autopilot_EngagementAP_On_IndicationType(param: RandomLibI) extends MJen[FAA_Autopilot_Engagement.AP_On_Indication.Type] {
  override def generate(f: FAA_Autopilot_Engagement.AP_On_Indication.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_Autopilot_EngagementAP_On_IndicationType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_Autopilot_EngagementAP_On_Indication_Payload(param: RandomLibI) extends MJen[FAA_Autopilot_Engagement.AP_On_Indication_Payload] {
  override def generate(f: FAA_Autopilot_Engagement.AP_On_Indication_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_Autopilot_EngagementAP_On_Indication_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_Autopilot_EngagementAP_StatusType(param: RandomLibI) extends MJen[FAA_Autopilot_Engagement.AP_Status.Type] {
  override def generate(f: FAA_Autopilot_Engagement.AP_Status.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_Autopilot_EngagementAP_StatusType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_Autopilot_EngagementAP_Status_Payload(param: RandomLibI) extends MJen[FAA_Autopilot_Engagement.AP_Status_Payload] {
  override def generate(f: FAA_Autopilot_Engagement.AP_Status_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_Autopilot_EngagementAP_Status_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_Autopilot_EngagementAttitude_AcceptabilityType(param: RandomLibI) extends MJen[FAA_Autopilot_Engagement.Attitude_Acceptability.Type] {
  override def generate(f: FAA_Autopilot_Engagement.Attitude_Acceptability.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_Autopilot_EngagementAttitude_AcceptabilityType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_Autopilot_EngagementAttitude_Acceptability_Payload(param: RandomLibI) extends MJen[FAA_Autopilot_Engagement.Attitude_Acceptability_Payload] {
  override def generate(f: FAA_Autopilot_Engagement.Attitude_Acceptability_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_Autopilot_EngagementAttitude_Acceptability_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container(param: RandomLibI) extends MJen[FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container] {
  override def generate(f: FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_P(param: RandomLibI) extends MJen[FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_P] {
  override def generate(f: FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PS(param: RandomLibI) extends MJen[FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PS] {
  override def generate(f: FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container(param: RandomLibI) extends MJen[FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container] {
  override def generate(f: FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_P(param: RandomLibI) extends MJen[FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_P] {
  override def generate(f: FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PS(param: RandomLibI) extends MJen[FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PS] {
  override def generate(f: FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_Autopilot_EngagementEngage_AP_CommandType(param: RandomLibI) extends MJen[FAA_Autopilot_Engagement.Engage_AP_Command.Type] {
  override def generate(f: FAA_Autopilot_Engagement.Engage_AP_Command.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_Autopilot_EngagementEngage_AP_CommandType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_Autopilot_EngagementEngage_AP_Command_Payload(param: RandomLibI) extends MJen[FAA_Autopilot_Engagement.Engage_AP_Command_Payload] {
  override def generate(f: FAA_Autopilot_Engagement.Engage_AP_Command_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_Autopilot_EngagementEngage_AP_Command_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_Autopilot_EngagementEngage_Command_StatusType(param: RandomLibI) extends MJen[FAA_Autopilot_Engagement.Engage_Command_Status.Type] {
  override def generate(f: FAA_Autopilot_Engagement.Engage_Command_Status.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_Autopilot_EngagementEngage_Command_StatusType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_Autopilot_EngagementEngage_Command_Status_Payload(param: RandomLibI) extends MJen[FAA_Autopilot_Engagement.Engage_Command_Status_Payload] {
  override def generate(f: FAA_Autopilot_Engagement.Engage_Command_Status_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_Autopilot_EngagementEngage_Command_Status_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container(param: RandomLibI) extends MJen[FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PreState_Container] {
  override def generate(f: FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_P(param: RandomLibI) extends MJen[FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PreState_Container_P] {
  override def generate(f: FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PS(param: RandomLibI) extends MJen[FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PS] {
  override def generate(f: FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container(param: RandomLibI) extends MJen[FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PostState_Container] {
  override def generate(f: FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_P(param: RandomLibI) extends MJen[FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PostState_Container_P] {
  override def generate(f: FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PS(param: RandomLibI) extends MJen[FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PS] {
  override def generate(f: FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container(param: RandomLibI) extends MJen[FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container] {
  override def generate(f: FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_P(param: RandomLibI) extends MJen[FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_P] {
  override def generate(f: FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PS(param: RandomLibI) extends MJen[FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PS] {
  override def generate(f: FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container(param: RandomLibI) extends MJen[FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container] {
  override def generate(f: FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_P(param: RandomLibI) extends MJen[FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_P] {
  override def generate(f: FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PS(param: RandomLibI) extends MJen[FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PS] {
  override def generate(f: FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_Autopilot_EngagementGuidance_ReadinessType(param: RandomLibI) extends MJen[FAA_Autopilot_Engagement.Guidance_Readiness.Type] {
  override def generate(f: FAA_Autopilot_Engagement.Guidance_Readiness.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_Autopilot_EngagementGuidance_ReadinessType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_Autopilot_EngagementGuidance_Readiness_Payload(param: RandomLibI) extends MJen[FAA_Autopilot_Engagement.Guidance_Readiness_Payload] {
  override def generate(f: FAA_Autopilot_Engagement.Guidance_Readiness_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_Autopilot_EngagementGuidance_Readiness_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container(param: RandomLibI) extends MJen[FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container] {
  override def generate(f: FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_P(param: RandomLibI) extends MJen[FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_P] {
  override def generate(f: FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PS(param: RandomLibI) extends MJen[FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PS] {
  override def generate(f: FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container(param: RandomLibI) extends MJen[FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container] {
  override def generate(f: FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_P(param: RandomLibI) extends MJen[FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_P] {
  override def generate(f: FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PS(param: RandomLibI) extends MJen[FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PS] {
  override def generate(f: FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container(param: RandomLibI) extends MJen[FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PreState_Container] {
  override def generate(f: FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_P(param: RandomLibI) extends MJen[FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PreState_Container_P] {
  override def generate(f: FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_PS(param: RandomLibI) extends MJen[FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PreState_Container_PS] {
  override def generate(f: FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container(param: RandomLibI) extends MJen[FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PostState_Container] {
  override def generate(f: FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_P(param: RandomLibI) extends MJen[FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PostState_Container_P] {
  override def generate(f: FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_PS(param: RandomLibI) extends MJen[FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PostState_Container_PS] {
  override def generate(f: FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_PS())

      if (!continue) {
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


