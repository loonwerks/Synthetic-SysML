// #Sireum

package dual_zone_greenhouse

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

Sensor_Validity.scala

Contention_Preference.scala

Ventilation_Eligibility.scala

Sensor_Fault_Indication.scala

Fan_Command.scala

Temperature_Celsius.scala

Upper_Temperature_Limit.scala

Base_Types.scala

Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_Containers.scala

Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_Containers.scala

Operator_Configuration_Intake_i_control_process_operator_configuration_intake_Containers.scala

Zone_A_Local_Decision_i_control_process_zone_a_local_decision_Containers.scala

Zone_B_Local_Decision_i_control_process_zone_b_local_decision_Containers.scala

Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_Containers.scala

Boundary_Output_Delivery_i_control_process_boundary_output_delivery_Containers.scala

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

@record class Gen_Dual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container(param: RandomLibI) extends MJen[Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container] {
  override def generate(f: Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Dual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_P(param: RandomLibI) extends MJen[Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_P] {
  override def generate(f: Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Dual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PS(param: RandomLibI) extends MJen[Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PS] {
  override def generate(f: Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Dual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container(param: RandomLibI) extends MJen[Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container] {
  override def generate(f: Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Dual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_P(param: RandomLibI) extends MJen[Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_P] {
  override def generate(f: Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Dual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PS(param: RandomLibI) extends MJen[Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PS] {
  override def generate(f: Dual_Zone_Greenhouse.Boundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDual_Zone_GreenhouseBoundary_Output_Delivery_i_control_process_boundary_output_delivery_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Dual_Zone_GreenhouseContention_PreferenceType(param: RandomLibI) extends MJen[Dual_Zone_Greenhouse.Contention_Preference.Type] {
  override def generate(f: Dual_Zone_Greenhouse.Contention_Preference.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDual_Zone_GreenhouseContention_PreferenceType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Dual_Zone_GreenhouseContention_Preference_Payload(param: RandomLibI) extends MJen[Dual_Zone_Greenhouse.Contention_Preference_Payload] {
  override def generate(f: Dual_Zone_Greenhouse.Contention_Preference_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDual_Zone_GreenhouseContention_Preference_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Dual_Zone_GreenhouseFan_CommandType(param: RandomLibI) extends MJen[Dual_Zone_Greenhouse.Fan_Command.Type] {
  override def generate(f: Dual_Zone_Greenhouse.Fan_Command.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDual_Zone_GreenhouseFan_CommandType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Dual_Zone_GreenhouseFan_Command_Payload(param: RandomLibI) extends MJen[Dual_Zone_Greenhouse.Fan_Command_Payload] {
  override def generate(f: Dual_Zone_Greenhouse.Fan_Command_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDual_Zone_GreenhouseFan_Command_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Dual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container(param: RandomLibI) extends MJen[Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container] {
  override def generate(f: Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Dual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_P(param: RandomLibI) extends MJen[Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_P] {
  override def generate(f: Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Dual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PS(param: RandomLibI) extends MJen[Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PS] {
  override def generate(f: Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Dual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container(param: RandomLibI) extends MJen[Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container] {
  override def generate(f: Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Dual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_P(param: RandomLibI) extends MJen[Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_P] {
  override def generate(f: Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Dual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PS(param: RandomLibI) extends MJen[Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PS] {
  override def generate(f: Dual_Zone_Greenhouse.Operator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDual_Zone_GreenhouseOperator_Configuration_Intake_i_control_process_operator_configuration_intake_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Dual_Zone_GreenhouseSensor_Fault_IndicationType(param: RandomLibI) extends MJen[Dual_Zone_Greenhouse.Sensor_Fault_Indication.Type] {
  override def generate(f: Dual_Zone_Greenhouse.Sensor_Fault_Indication.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDual_Zone_GreenhouseSensor_Fault_IndicationType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Dual_Zone_GreenhouseSensor_Fault_Indication_Payload(param: RandomLibI) extends MJen[Dual_Zone_Greenhouse.Sensor_Fault_Indication_Payload] {
  override def generate(f: Dual_Zone_Greenhouse.Sensor_Fault_Indication_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDual_Zone_GreenhouseSensor_Fault_Indication_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Dual_Zone_GreenhouseSensor_ValidityType(param: RandomLibI) extends MJen[Dual_Zone_Greenhouse.Sensor_Validity.Type] {
  override def generate(f: Dual_Zone_Greenhouse.Sensor_Validity.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDual_Zone_GreenhouseSensor_ValidityType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Dual_Zone_GreenhouseSensor_Validity_Payload(param: RandomLibI) extends MJen[Dual_Zone_Greenhouse.Sensor_Validity_Payload] {
  override def generate(f: Dual_Zone_Greenhouse.Sensor_Validity_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDual_Zone_GreenhouseSensor_Validity_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Dual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container(param: RandomLibI) extends MJen[Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container] {
  override def generate(f: Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Dual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_P(param: RandomLibI) extends MJen[Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_P] {
  override def generate(f: Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Dual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PS(param: RandomLibI) extends MJen[Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PS] {
  override def generate(f: Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Dual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container(param: RandomLibI) extends MJen[Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container] {
  override def generate(f: Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Dual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_P(param: RandomLibI) extends MJen[Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_P] {
  override def generate(f: Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Dual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PS(param: RandomLibI) extends MJen[Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PS] {
  override def generate(f: Dual_Zone_Greenhouse.Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDual_Zone_GreenhouseShared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Dual_Zone_GreenhouseTemperature_Celsius(param: RandomLibI) extends MJen[Dual_Zone_Greenhouse.Temperature_Celsius] {
  override def generate(f: Dual_Zone_Greenhouse.Temperature_Celsius => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDual_Zone_GreenhouseTemperature_Celsius())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Dual_Zone_GreenhouseTemperature_Celsius_Payload(param: RandomLibI) extends MJen[Dual_Zone_Greenhouse.Temperature_Celsius_Payload] {
  override def generate(f: Dual_Zone_Greenhouse.Temperature_Celsius_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDual_Zone_GreenhouseTemperature_Celsius_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Dual_Zone_GreenhouseUpper_Temperature_Limit(param: RandomLibI) extends MJen[Dual_Zone_Greenhouse.Upper_Temperature_Limit] {
  override def generate(f: Dual_Zone_Greenhouse.Upper_Temperature_Limit => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDual_Zone_GreenhouseUpper_Temperature_Limit())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Dual_Zone_GreenhouseUpper_Temperature_Limit_Payload(param: RandomLibI) extends MJen[Dual_Zone_Greenhouse.Upper_Temperature_Limit_Payload] {
  override def generate(f: Dual_Zone_Greenhouse.Upper_Temperature_Limit_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDual_Zone_GreenhouseUpper_Temperature_Limit_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Dual_Zone_GreenhouseVentilation_EligibilityType(param: RandomLibI) extends MJen[Dual_Zone_Greenhouse.Ventilation_Eligibility.Type] {
  override def generate(f: Dual_Zone_Greenhouse.Ventilation_Eligibility.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDual_Zone_GreenhouseVentilation_EligibilityType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Dual_Zone_GreenhouseVentilation_Eligibility_Payload(param: RandomLibI) extends MJen[Dual_Zone_Greenhouse.Ventilation_Eligibility_Payload] {
  override def generate(f: Dual_Zone_Greenhouse.Ventilation_Eligibility_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDual_Zone_GreenhouseVentilation_Eligibility_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Dual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container(param: RandomLibI) extends MJen[Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container] {
  override def generate(f: Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Dual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_P(param: RandomLibI) extends MJen[Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_P] {
  override def generate(f: Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Dual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PS(param: RandomLibI) extends MJen[Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PS] {
  override def generate(f: Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Dual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container(param: RandomLibI) extends MJen[Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container] {
  override def generate(f: Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Dual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_P(param: RandomLibI) extends MJen[Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_P] {
  override def generate(f: Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Dual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PS(param: RandomLibI) extends MJen[Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PS] {
  override def generate(f: Dual_Zone_Greenhouse.Zone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDual_Zone_GreenhouseZone_A_Local_Decision_i_control_process_zone_a_local_decision_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Dual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container(param: RandomLibI) extends MJen[Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container] {
  override def generate(f: Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Dual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_P(param: RandomLibI) extends MJen[Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_P] {
  override def generate(f: Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Dual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PS(param: RandomLibI) extends MJen[Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PS] {
  override def generate(f: Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Dual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container(param: RandomLibI) extends MJen[Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container] {
  override def generate(f: Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Dual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_P(param: RandomLibI) extends MJen[Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_P] {
  override def generate(f: Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Dual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PS(param: RandomLibI) extends MJen[Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PS] {
  override def generate(f: Dual_Zone_Greenhouse.Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDual_Zone_GreenhouseZone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Dual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container(param: RandomLibI) extends MJen[Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container] {
  override def generate(f: Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Dual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_P(param: RandomLibI) extends MJen[Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_P] {
  override def generate(f: Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Dual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PS(param: RandomLibI) extends MJen[Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PS] {
  override def generate(f: Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Dual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container(param: RandomLibI) extends MJen[Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container] {
  override def generate(f: Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Dual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_P(param: RandomLibI) extends MJen[Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_P] {
  override def generate(f: Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Dual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PS(param: RandomLibI) extends MJen[Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PS] {
  override def generate(f: Dual_Zone_Greenhouse.Zone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDual_Zone_GreenhouseZone_B_Local_Decision_i_control_process_zone_b_local_decision_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Dual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container(param: RandomLibI) extends MJen[Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container] {
  override def generate(f: Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Dual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_P(param: RandomLibI) extends MJen[Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_P] {
  override def generate(f: Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Dual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PS(param: RandomLibI) extends MJen[Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PS] {
  override def generate(f: Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Dual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container(param: RandomLibI) extends MJen[Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container] {
  override def generate(f: Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Dual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_P(param: RandomLibI) extends MJen[Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_P] {
  override def generate(f: Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Dual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PS(param: RandomLibI) extends MJen[Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PS] {
  override def generate(f: Dual_Zone_Greenhouse.Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDual_Zone_GreenhouseZone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_PostState_Container_PS())

      if (!continue) {
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


