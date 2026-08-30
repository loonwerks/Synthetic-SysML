// #Sireum

package faa_fcs_coordination

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

Request_Value.scala

Input_Validity.scala

Qualified_Request.scala

Attitude_Data_Validity.scala

Attitude_Acceptability.scala

Reference_State.scala

AP_Availability.scala

Request_Indication.scala

FD_Indication.scala

FCS_Failed_Indication.scala

AP_Status.scala

AP_Enable.scala

Base_Types.scala

FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_Containers.scala

Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_Containers.scala

Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_Containers.scala

AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_Containers.scala

Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_Containers.scala

Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_Containers.scala

FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_Containers.scala

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

@record class Gen_FAA_FCS_CoordinationAP_AvailabilityType(param: RandomLibI) extends MJen[FAA_FCS_Coordination.AP_Availability.Type] {
  override def generate(f: FAA_FCS_Coordination.AP_Availability.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_FCS_CoordinationAP_AvailabilityType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_FCS_CoordinationAP_Availability_Payload(param: RandomLibI) extends MJen[FAA_FCS_Coordination.AP_Availability_Payload] {
  override def generate(f: FAA_FCS_Coordination.AP_Availability_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_FCS_CoordinationAP_Availability_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container(param: RandomLibI) extends MJen[FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container] {
  override def generate(f: FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_P(param: RandomLibI) extends MJen[FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_P] {
  override def generate(f: FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PS(param: RandomLibI) extends MJen[FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PS] {
  override def generate(f: FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container(param: RandomLibI) extends MJen[FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container] {
  override def generate(f: FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_P(param: RandomLibI) extends MJen[FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_P] {
  override def generate(f: FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PS(param: RandomLibI) extends MJen[FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PS] {
  override def generate(f: FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_FCS_CoordinationAP_EnableType(param: RandomLibI) extends MJen[FAA_FCS_Coordination.AP_Enable.Type] {
  override def generate(f: FAA_FCS_Coordination.AP_Enable.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_FCS_CoordinationAP_EnableType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_FCS_CoordinationAP_Enable_Payload(param: RandomLibI) extends MJen[FAA_FCS_Coordination.AP_Enable_Payload] {
  override def generate(f: FAA_FCS_Coordination.AP_Enable_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_FCS_CoordinationAP_Enable_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_FCS_CoordinationAP_StatusType(param: RandomLibI) extends MJen[FAA_FCS_Coordination.AP_Status.Type] {
  override def generate(f: FAA_FCS_Coordination.AP_Status.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_FCS_CoordinationAP_StatusType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_FCS_CoordinationAP_Status_Payload(param: RandomLibI) extends MJen[FAA_FCS_Coordination.AP_Status_Payload] {
  override def generate(f: FAA_FCS_Coordination.AP_Status_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_FCS_CoordinationAP_Status_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_FCS_CoordinationAttitude_AcceptabilityType(param: RandomLibI) extends MJen[FAA_FCS_Coordination.Attitude_Acceptability.Type] {
  override def generate(f: FAA_FCS_Coordination.Attitude_Acceptability.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_FCS_CoordinationAttitude_AcceptabilityType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_FCS_CoordinationAttitude_Acceptability_Payload(param: RandomLibI) extends MJen[FAA_FCS_Coordination.Attitude_Acceptability_Payload] {
  override def generate(f: FAA_FCS_Coordination.Attitude_Acceptability_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_FCS_CoordinationAttitude_Acceptability_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container(param: RandomLibI) extends MJen[FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container] {
  override def generate(f: FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_P(param: RandomLibI) extends MJen[FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_P] {
  override def generate(f: FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PS(param: RandomLibI) extends MJen[FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PS] {
  override def generate(f: FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container(param: RandomLibI) extends MJen[FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container] {
  override def generate(f: FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_P(param: RandomLibI) extends MJen[FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_P] {
  override def generate(f: FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PS(param: RandomLibI) extends MJen[FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PS] {
  override def generate(f: FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_FCS_CoordinationAttitude_Data_ValidityType(param: RandomLibI) extends MJen[FAA_FCS_Coordination.Attitude_Data_Validity.Type] {
  override def generate(f: FAA_FCS_Coordination.Attitude_Data_Validity.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_FCS_CoordinationAttitude_Data_ValidityType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_FCS_CoordinationAttitude_Data_Validity_Payload(param: RandomLibI) extends MJen[FAA_FCS_Coordination.Attitude_Data_Validity_Payload] {
  override def generate(f: FAA_FCS_Coordination.Attitude_Data_Validity_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_FCS_CoordinationAttitude_Data_Validity_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container(param: RandomLibI) extends MJen[FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container] {
  override def generate(f: FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_P(param: RandomLibI) extends MJen[FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_P] {
  override def generate(f: FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PS(param: RandomLibI) extends MJen[FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PS] {
  override def generate(f: FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container(param: RandomLibI) extends MJen[FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container] {
  override def generate(f: FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_P(param: RandomLibI) extends MJen[FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_P] {
  override def generate(f: FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PS(param: RandomLibI) extends MJen[FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PS] {
  override def generate(f: FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container(param: RandomLibI) extends MJen[FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container] {
  override def generate(f: FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_P(param: RandomLibI) extends MJen[FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_P] {
  override def generate(f: FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PS(param: RandomLibI) extends MJen[FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PS] {
  override def generate(f: FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container(param: RandomLibI) extends MJen[FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container] {
  override def generate(f: FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_P(param: RandomLibI) extends MJen[FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_P] {
  override def generate(f: FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PS(param: RandomLibI) extends MJen[FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PS] {
  override def generate(f: FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_FCS_CoordinationFCS_Failed_IndicationType(param: RandomLibI) extends MJen[FAA_FCS_Coordination.FCS_Failed_Indication.Type] {
  override def generate(f: FAA_FCS_Coordination.FCS_Failed_Indication.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_FCS_CoordinationFCS_Failed_IndicationType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_FCS_CoordinationFCS_Failed_Indication_Payload(param: RandomLibI) extends MJen[FAA_FCS_Coordination.FCS_Failed_Indication_Payload] {
  override def generate(f: FAA_FCS_Coordination.FCS_Failed_Indication_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_FCS_CoordinationFCS_Failed_Indication_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container(param: RandomLibI) extends MJen[FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container] {
  override def generate(f: FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_P(param: RandomLibI) extends MJen[FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_P] {
  override def generate(f: FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PS(param: RandomLibI) extends MJen[FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PS] {
  override def generate(f: FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container(param: RandomLibI) extends MJen[FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container] {
  override def generate(f: FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_P(param: RandomLibI) extends MJen[FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_P] {
  override def generate(f: FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PS(param: RandomLibI) extends MJen[FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PS] {
  override def generate(f: FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_FCS_CoordinationFD_IndicationType(param: RandomLibI) extends MJen[FAA_FCS_Coordination.FD_Indication.Type] {
  override def generate(f: FAA_FCS_Coordination.FD_Indication.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_FCS_CoordinationFD_IndicationType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_FCS_CoordinationFD_Indication_Payload(param: RandomLibI) extends MJen[FAA_FCS_Coordination.FD_Indication_Payload] {
  override def generate(f: FAA_FCS_Coordination.FD_Indication_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_FCS_CoordinationFD_Indication_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container(param: RandomLibI) extends MJen[FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container] {
  override def generate(f: FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_P(param: RandomLibI) extends MJen[FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_P] {
  override def generate(f: FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PS(param: RandomLibI) extends MJen[FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PS] {
  override def generate(f: FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container(param: RandomLibI) extends MJen[FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container] {
  override def generate(f: FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_P(param: RandomLibI) extends MJen[FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_P] {
  override def generate(f: FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PS(param: RandomLibI) extends MJen[FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PS] {
  override def generate(f: FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_FCS_CoordinationInput_ValidityType(param: RandomLibI) extends MJen[FAA_FCS_Coordination.Input_Validity.Type] {
  override def generate(f: FAA_FCS_Coordination.Input_Validity.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_FCS_CoordinationInput_ValidityType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_FCS_CoordinationInput_Validity_Payload(param: RandomLibI) extends MJen[FAA_FCS_Coordination.Input_Validity_Payload] {
  override def generate(f: FAA_FCS_Coordination.Input_Validity_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_FCS_CoordinationInput_Validity_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_FCS_CoordinationQualified_RequestType(param: RandomLibI) extends MJen[FAA_FCS_Coordination.Qualified_Request.Type] {
  override def generate(f: FAA_FCS_Coordination.Qualified_Request.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_FCS_CoordinationQualified_RequestType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_FCS_CoordinationQualified_Request_Payload(param: RandomLibI) extends MJen[FAA_FCS_Coordination.Qualified_Request_Payload] {
  override def generate(f: FAA_FCS_Coordination.Qualified_Request_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_FCS_CoordinationQualified_Request_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_FCS_CoordinationReference_StateType(param: RandomLibI) extends MJen[FAA_FCS_Coordination.Reference_State.Type] {
  override def generate(f: FAA_FCS_Coordination.Reference_State.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_FCS_CoordinationReference_StateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_FCS_CoordinationReference_State_Payload(param: RandomLibI) extends MJen[FAA_FCS_Coordination.Reference_State_Payload] {
  override def generate(f: FAA_FCS_Coordination.Reference_State_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_FCS_CoordinationReference_State_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container(param: RandomLibI) extends MJen[FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container] {
  override def generate(f: FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_P(param: RandomLibI) extends MJen[FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_P] {
  override def generate(f: FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PS(param: RandomLibI) extends MJen[FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PS] {
  override def generate(f: FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container(param: RandomLibI) extends MJen[FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container] {
  override def generate(f: FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_P(param: RandomLibI) extends MJen[FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_P] {
  override def generate(f: FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PS(param: RandomLibI) extends MJen[FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PS] {
  override def generate(f: FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_FCS_CoordinationRequest_IndicationType(param: RandomLibI) extends MJen[FAA_FCS_Coordination.Request_Indication.Type] {
  override def generate(f: FAA_FCS_Coordination.Request_Indication.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_FCS_CoordinationRequest_IndicationType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_FCS_CoordinationRequest_Indication_Payload(param: RandomLibI) extends MJen[FAA_FCS_Coordination.Request_Indication_Payload] {
  override def generate(f: FAA_FCS_Coordination.Request_Indication_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_FCS_CoordinationRequest_Indication_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_FCS_CoordinationRequest_ValueType(param: RandomLibI) extends MJen[FAA_FCS_Coordination.Request_Value.Type] {
  override def generate(f: FAA_FCS_Coordination.Request_Value.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_FCS_CoordinationRequest_ValueType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_FAA_FCS_CoordinationRequest_Value_Payload(param: RandomLibI) extends MJen[FAA_FCS_Coordination.Request_Value_Payload] {
  override def generate(f: FAA_FCS_Coordination.Request_Value_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFAA_FCS_CoordinationRequest_Value_Payload())

      if (!continue) {
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


