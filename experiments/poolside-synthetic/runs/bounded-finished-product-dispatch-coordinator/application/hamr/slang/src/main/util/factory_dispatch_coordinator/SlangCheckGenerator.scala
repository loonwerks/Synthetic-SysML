// #Sireum

package factory_dispatch_coordinator

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

Request_Arrival_Sample.scala

Arrival_Fact.scala

Shipment_Result_Sample.scala

Registry_Instruction.scala

Pending_Request_View.scala

Request_Value.scala

Registry_Outcome.scala

Angle_A_Stock_Band.scala

Angle_B_Stock_Band.scala

Input_Status.scala

Inventory_Finding.scala

Dispatch_Readiness.scala

Shipment_Release_Directive.scala

Dispatch_Disposition.scala

Customer_Dispatch_Notice.scala

Active_Slot.scala

Completion_Slot.scala

Dispatch_Candidate.scala

Inventory_Sample.scala

Dispatch_Readiness_Sample.scala

Base_Types.scala

Request_Qualification_dispatch_coordination_process_request_qualification_Containers.scala

Request_Registry_dispatch_coordination_process_request_registry_Containers.scala

Inventory_Assessment_dispatch_coordination_process_inventory_assessment_Containers.scala

Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_Containers.scala

Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_Containers.scala

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

@record class Gen_Factory_Dispatch_CoordinatorActive_SlotType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Active_Slot.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.Active_Slot.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorActive_SlotType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorActive_Slot_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Active_Slot_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.Active_Slot_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorActive_Slot_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorAngle_A_Stock_BandType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Angle_A_Stock_Band.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.Angle_A_Stock_Band.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorAngle_A_Stock_BandType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorAngle_A_Stock_Band_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Angle_A_Stock_Band_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.Angle_A_Stock_Band_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorAngle_A_Stock_Band_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorAngle_B_Stock_BandType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Angle_B_Stock_Band.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.Angle_B_Stock_Band.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorAngle_B_Stock_BandType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorAngle_B_Stock_Band_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Angle_B_Stock_Band_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.Angle_B_Stock_Band_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorAngle_B_Stock_Band_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorArrival_FactType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Arrival_Fact.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.Arrival_Fact.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorArrival_FactType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorArrival_Fact_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Arrival_Fact_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.Arrival_Fact_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorArrival_Fact_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorCompletion_SlotType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Completion_Slot.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.Completion_Slot.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorCompletion_SlotType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorCompletion_Slot_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Completion_Slot_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.Completion_Slot_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorCompletion_Slot_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorCustomer_Dispatch_NoticeType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Customer_Dispatch_Notice.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.Customer_Dispatch_Notice.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorCustomer_Dispatch_NoticeType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorCustomer_Dispatch_Notice_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Customer_Dispatch_Notice_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.Customer_Dispatch_Notice_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorCustomer_Dispatch_Notice_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container] {
  override def generate(f: Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_P(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_P] {
  override def generate(f: Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PS(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PS] {
  override def generate(f: Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container] {
  override def generate(f: Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_P(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_P] {
  override def generate(f: Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PS(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PS] {
  override def generate(f: Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorCustomer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container] {
  override def generate(f: Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_P(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_P] {
  override def generate(f: Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PS(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PS] {
  override def generate(f: Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container] {
  override def generate(f: Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_P(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_P] {
  override def generate(f: Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PS(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PS] {
  override def generate(f: Factory_Dispatch_Coordinator.Dispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDispatch_Arbiter_dispatch_coordination_process_dispatch_arbiter_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDispatch_Candidate(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Dispatch_Candidate] {
  override def generate(f: Factory_Dispatch_Coordinator.Dispatch_Candidate => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDispatch_Candidate())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDispatch_Candidate_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Dispatch_Candidate_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.Dispatch_Candidate_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDispatch_Candidate_Payload())

      if (!continue) {
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

@record class Gen_Factory_Dispatch_CoordinatorDispatch_ReadinessType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Dispatch_Readiness.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.Dispatch_Readiness.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDispatch_ReadinessType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDispatch_Readiness_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Dispatch_Readiness_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.Dispatch_Readiness_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDispatch_Readiness_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDispatch_Readiness_Sample(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Dispatch_Readiness_Sample] {
  override def generate(f: Factory_Dispatch_Coordinator.Dispatch_Readiness_Sample => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDispatch_Readiness_Sample())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDispatch_Readiness_Sample_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Dispatch_Readiness_Sample_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.Dispatch_Readiness_Sample_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDispatch_Readiness_Sample_Payload())

      if (!continue) {
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

@record class Gen_Factory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container] {
  override def generate(f: Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_P(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_P] {
  override def generate(f: Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PS(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PS] {
  override def generate(f: Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container] {
  override def generate(f: Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_P(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_P] {
  override def generate(f: Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PS(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PS] {
  override def generate(f: Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorInventory_Assessment_dispatch_coordination_process_inventory_assessment_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorInventory_FindingType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Inventory_Finding.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.Inventory_Finding.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorInventory_FindingType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorInventory_Finding_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Inventory_Finding_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.Inventory_Finding_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorInventory_Finding_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorInventory_Sample(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Inventory_Sample] {
  override def generate(f: Factory_Dispatch_Coordinator.Inventory_Sample => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorInventory_Sample())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorInventory_Sample_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Inventory_Sample_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.Inventory_Sample_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorInventory_Sample_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorPending_Request_ViewType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Pending_Request_View.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.Pending_Request_View.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorPending_Request_ViewType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorPending_Request_View_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Pending_Request_View_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.Pending_Request_View_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorPending_Request_View_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorRegistry_InstructionType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Registry_Instruction.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.Registry_Instruction.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorRegistry_InstructionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorRegistry_Instruction_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Registry_Instruction_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.Registry_Instruction_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorRegistry_Instruction_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorRegistry_OutcomeType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Registry_Outcome.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.Registry_Outcome.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorRegistry_OutcomeType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorRegistry_Outcome_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Registry_Outcome_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.Registry_Outcome_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorRegistry_Outcome_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorRequest_Arrival_SampleType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Request_Arrival_Sample.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.Request_Arrival_Sample.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorRequest_Arrival_SampleType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorRequest_Arrival_Sample_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Request_Arrival_Sample_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.Request_Arrival_Sample_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorRequest_Arrival_Sample_Payload())

      if (!continue) {
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

@record class Gen_Factory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PreState_Container] {
  override def generate(f: Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_P(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PreState_Container_P] {
  override def generate(f: Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_PS(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PreState_Container_PS] {
  override def generate(f: Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PostState_Container] {
  override def generate(f: Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_P(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PostState_Container_P] {
  override def generate(f: Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_PS(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PostState_Container_PS] {
  override def generate(f: Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorRequest_Registry_dispatch_coordination_process_request_registry_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorRequest_ValueType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Request_Value.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.Request_Value.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorRequest_ValueType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorRequest_Value_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Request_Value_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.Request_Value_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorRequest_Value_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorShipment_Release_DirectiveType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Shipment_Release_Directive.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.Shipment_Release_Directive.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorShipment_Release_DirectiveType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorShipment_Release_Directive_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Shipment_Release_Directive_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.Shipment_Release_Directive_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorShipment_Release_Directive_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorShipment_Result_SampleType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Shipment_Result_Sample.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.Shipment_Result_Sample.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorShipment_Result_SampleType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorShipment_Result_Sample_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Shipment_Result_Sample_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.Shipment_Result_Sample_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorShipment_Result_Sample_Payload())

      if (!continue) {
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


