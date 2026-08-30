// #Sireum

package factory_dispatch_coordinator

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

Dispatch_Request_Event.scala

Input_Status.scala

Qualified_Request.scala

Product_Availability.scala

Availability_Assessment_Value.scala

Dispatch_Outcome.scala

Qualified_Outcome.scala

Dispatch_Phase.scala

Dispatch_Disposition.scala

Shipment_Release_Command.scala

Dispatch_Status.scala

Shipping_Confirmation.scala

Dispatch_Request_Sample.scala

Product_Availability_Sample.scala

Dispatch_Outcome_Sample.scala

Dispatch_Resolution.scala

Base_Types.scala

Request_Qualification_dispatch_coordination_process_request_qualification_Containers.scala

Availability_Assessment_dispatch_coordination_process_availability_assessment_Containers.scala

Outcome_Qualification_dispatch_coordination_process_outcome_qualification_Containers.scala

Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_Containers.scala

Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_Containers.scala

Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_Containers.scala

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

@record class Gen_Factory_Dispatch_CoordinatorAvailability_Assessment_ValueType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Availability_Assessment_Value.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.Availability_Assessment_Value.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorAvailability_Assessment_ValueType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorAvailability_Assessment_Value_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Availability_Assessment_Value_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.Availability_Assessment_Value_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorAvailability_Assessment_Value_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container] {
  override def generate(f: Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_P(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_P] {
  override def generate(f: Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PS(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PS] {
  override def generate(f: Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container] {
  override def generate(f: Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_P(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_P] {
  override def generate(f: Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PS(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PS] {
  override def generate(f: Factory_Dispatch_Coordinator.Availability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorAvailability_Assessment_dispatch_coordination_process_availability_assessment_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container] {
  override def generate(f: Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_P(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_P] {
  override def generate(f: Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PS(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PS] {
  override def generate(f: Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container] {
  override def generate(f: Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_P(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_P] {
  override def generate(f: Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PS(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PS] {
  override def generate(f: Factory_Dispatch_Coordinator.Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDispatch_DispositionType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Dispatch_Disposition.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.Dispatch_Disposition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDispatch_DispositionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDispatch_Disposition_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Dispatch_Disposition_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.Dispatch_Disposition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDispatch_Disposition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container] {
  override def generate(f: Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_P(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_P] {
  override def generate(f: Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PS(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PS] {
  override def generate(f: Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container] {
  override def generate(f: Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_P(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_P] {
  override def generate(f: Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PS(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PS] {
  override def generate(f: Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDispatch_OutcomeType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Dispatch_Outcome.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.Dispatch_Outcome.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDispatch_OutcomeType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDispatch_Outcome_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Dispatch_Outcome_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.Dispatch_Outcome_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDispatch_Outcome_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDispatch_Outcome_Sample(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Dispatch_Outcome_Sample] {
  override def generate(f: Factory_Dispatch_Coordinator.Dispatch_Outcome_Sample => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDispatch_Outcome_Sample())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDispatch_Outcome_Sample_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Dispatch_Outcome_Sample_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.Dispatch_Outcome_Sample_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDispatch_Outcome_Sample_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDispatch_PhaseType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Dispatch_Phase.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.Dispatch_Phase.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDispatch_PhaseType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDispatch_Phase_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Dispatch_Phase_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.Dispatch_Phase_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDispatch_Phase_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDispatch_Request_EventType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Dispatch_Request_Event.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.Dispatch_Request_Event.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDispatch_Request_EventType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDispatch_Request_Event_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Dispatch_Request_Event_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.Dispatch_Request_Event_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDispatch_Request_Event_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDispatch_Request_Sample(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Dispatch_Request_Sample] {
  override def generate(f: Factory_Dispatch_Coordinator.Dispatch_Request_Sample => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDispatch_Request_Sample())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDispatch_Request_Sample_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Dispatch_Request_Sample_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.Dispatch_Request_Sample_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDispatch_Request_Sample_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDispatch_Resolution(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Dispatch_Resolution] {
  override def generate(f: Factory_Dispatch_Coordinator.Dispatch_Resolution => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDispatch_Resolution())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDispatch_Resolution_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Dispatch_Resolution_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.Dispatch_Resolution_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDispatch_Resolution_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDispatch_StatusType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Dispatch_Status.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.Dispatch_Status.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDispatch_StatusType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDispatch_Status_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Dispatch_Status_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.Dispatch_Status_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDispatch_Status_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorInput_StatusType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Input_Status.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.Input_Status.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorInput_StatusType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorInput_Status_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Input_Status_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.Input_Status_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorInput_Status_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container] {
  override def generate(f: Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_P(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_P] {
  override def generate(f: Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PS(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PS] {
  override def generate(f: Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container] {
  override def generate(f: Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_P(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_P] {
  override def generate(f: Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PS(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PS] {
  override def generate(f: Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorOutcome_Qualification_dispatch_coordination_process_outcome_qualification_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorProduct_AvailabilityType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Product_Availability.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.Product_Availability.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorProduct_AvailabilityType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorProduct_Availability_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Product_Availability_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.Product_Availability_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorProduct_Availability_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorProduct_Availability_Sample(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Product_Availability_Sample] {
  override def generate(f: Factory_Dispatch_Coordinator.Product_Availability_Sample => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorProduct_Availability_Sample())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorProduct_Availability_Sample_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Product_Availability_Sample_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.Product_Availability_Sample_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorProduct_Availability_Sample_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorQualified_OutcomeType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Qualified_Outcome.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.Qualified_Outcome.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorQualified_OutcomeType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorQualified_Outcome_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Qualified_Outcome_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.Qualified_Outcome_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorQualified_Outcome_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorQualified_RequestType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Qualified_Request.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.Qualified_Request.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorQualified_RequestType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorQualified_Request_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Qualified_Request_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.Qualified_Request_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorQualified_Request_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container] {
  override def generate(f: Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_P(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_P] {
  override def generate(f: Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PS(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PS] {
  override def generate(f: Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container] {
  override def generate(f: Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_P(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_P] {
  override def generate(f: Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PS(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PS] {
  override def generate(f: Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorRelease_Command_Derivation_dispatch_coordination_process_release_command_derivation_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container] {
  override def generate(f: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P] {
  override def generate(f: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS] {
  override def generate(f: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container] {
  override def generate(f: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P] {
  override def generate(f: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS] {
  override def generate(f: Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorRequest_Qualification_dispatch_coordination_process_request_qualification_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorShipment_Release_CommandType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Shipment_Release_Command.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.Shipment_Release_Command.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorShipment_Release_CommandType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorShipment_Release_Command_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Shipment_Release_Command_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.Shipment_Release_Command_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorShipment_Release_Command_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorShipping_ConfirmationType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Shipping_Confirmation.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.Shipping_Confirmation.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorShipping_ConfirmationType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorShipping_Confirmation_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Shipping_Confirmation_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.Shipping_Confirmation_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorShipping_Confirmation_Payload())

      if (!continue) {
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


