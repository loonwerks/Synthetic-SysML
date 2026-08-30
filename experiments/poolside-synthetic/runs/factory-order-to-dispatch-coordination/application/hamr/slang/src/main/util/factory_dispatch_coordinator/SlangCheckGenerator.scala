// #Sireum

package factory_dispatch_coordinator

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

FreshRequest.scala

MaterialBand.scala

ProductBand.scala

ExecutionOutcome.scala

OutcomeEventClass.scala

OrderState.scala

QualifiedOutcome.scala

RecoveryEvent.scala

RecoveryGate.scala

EmergencyState.scala

RecoveryState.scala

ProposalState.scala

DispatchAction.scala

OrderStatusValue.scala

RecoveryStatusValue.scala

Mode.scala

SelectedCause.scala

PublishedOrderState.scala

PublishedRecoveryState.scala

RequestDisposition.scala

PublishedAction.scala

RequestBoundaryFacts.scala

CapabilitySnapshot.scala

RequestFacts.scala

MaterialBoundaryFacts.scala

InventorySnapshot.scala

ProductBoundaryFacts.scala

StockFacts.scala

OutcomeBoundaryFacts.scala

DispatchStatusRecord.scala

DispatchPublicResult.scala

Base_Types.scala

CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_Containers.scala

InventoryAcquisition_coordinator_process_inventory_acquisition_Containers.scala

CapabilityAcquisition_coordinator_process_capability_acquisition_Containers.scala

ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_Containers.scala

RequestQualification_coordinator_process_request_qualification_Containers.scala

StockAssessment_coordinator_process_stock_assessment_Containers.scala

OutcomeQualification_coordinator_process_outcome_qualification_Containers.scala

RecoveryControl_coordinator_process_recovery_control_Containers.scala

OrderLifecycle_coordinator_process_order_lifecycle_Containers.scala

QuotationEligibility_coordinator_process_quotation_eligibility_Containers.scala

ProcurementEligibility_coordinator_process_procurement_eligibility_Containers.scala

ProductionEligibility_coordinator_process_production_eligibility_Containers.scala

DispatchEligibility_coordinator_process_dispatch_eligibility_Containers.scala

ActionArbitration_coordinator_process_action_arbitration_Containers.scala

StatusDerivation_coordinator_process_status_derivation_Containers.scala

PublicComposition_coordinator_process_public_composition_Containers.scala

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

@record class Gen_Factory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PreState_Container] {
  override def generate(f: Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_P(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PreState_Container_P] {
  override def generate(f: Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_PS(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PreState_Container_PS] {
  override def generate(f: Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PostState_Container] {
  override def generate(f: Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_P(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PostState_Container_P] {
  override def generate(f: Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_PS(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PostState_Container_PS] {
  override def generate(f: Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorActionArbitration_coordinator_process_action_arbitration_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container] {
  override def generate(f: Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_P(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_P] {
  override def generate(f: Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PS(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PS] {
  override def generate(f: Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container] {
  override def generate(f: Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_P(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_P] {
  override def generate(f: Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PS(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PS] {
  override def generate(f: Factory_Dispatch_Coordinator.CapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorCapabilityAcquisition_coordinator_process_capability_acquisition_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorCapabilitySnapshot(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.CapabilitySnapshot] {
  override def generate(f: Factory_Dispatch_Coordinator.CapabilitySnapshot => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorCapabilitySnapshot())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorCapabilitySnapshot_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.CapabilitySnapshot_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.CapabilitySnapshot_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorCapabilitySnapshot_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container] {
  override def generate(f: Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_P(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_P] {
  override def generate(f: Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PS(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PS] {
  override def generate(f: Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container] {
  override def generate(f: Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_P(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_P] {
  override def generate(f: Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PS(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PS] {
  override def generate(f: Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorCustomerRequestAcquisition_coordinator_process_customer_request_acquisition_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDispatchActionType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.DispatchAction.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.DispatchAction.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDispatchActionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDispatchAction_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.DispatchAction_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.DispatchAction_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDispatchAction_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container] {
  override def generate(f: Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_P(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_P] {
  override def generate(f: Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PS(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PS] {
  override def generate(f: Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container] {
  override def generate(f: Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_P(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_P] {
  override def generate(f: Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PS(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PS] {
  override def generate(f: Factory_Dispatch_Coordinator.DispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDispatchEligibility_coordinator_process_dispatch_eligibility_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDispatchPublicResult(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.DispatchPublicResult] {
  override def generate(f: Factory_Dispatch_Coordinator.DispatchPublicResult => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDispatchPublicResult())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDispatchPublicResult_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.DispatchPublicResult_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.DispatchPublicResult_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDispatchPublicResult_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDispatchStatusRecord(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.DispatchStatusRecord] {
  override def generate(f: Factory_Dispatch_Coordinator.DispatchStatusRecord => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDispatchStatusRecord())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDispatchStatusRecord_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.DispatchStatusRecord_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.DispatchStatusRecord_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDispatchStatusRecord_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorEmergencyStateType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.EmergencyState.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.EmergencyState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorEmergencyStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorEmergencyState_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.EmergencyState_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.EmergencyState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorEmergencyState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorExecutionOutcomeType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.ExecutionOutcome.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.ExecutionOutcome.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorExecutionOutcomeType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorExecutionOutcome_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.ExecutionOutcome_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.ExecutionOutcome_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorExecutionOutcome_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container] {
  override def generate(f: Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_P(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_P] {
  override def generate(f: Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PS(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PS] {
  override def generate(f: Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container] {
  override def generate(f: Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_P(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_P] {
  override def generate(f: Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PS(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PS] {
  override def generate(f: Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorFreshRequestType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.FreshRequest.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.FreshRequest.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorFreshRequestType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorFreshRequest_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.FreshRequest_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.FreshRequest_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorFreshRequest_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container] {
  override def generate(f: Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_P(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_P] {
  override def generate(f: Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PS(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PS] {
  override def generate(f: Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container] {
  override def generate(f: Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_P(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_P] {
  override def generate(f: Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PS(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PS] {
  override def generate(f: Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorInventoryAcquisition_coordinator_process_inventory_acquisition_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorInventorySnapshot(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.InventorySnapshot] {
  override def generate(f: Factory_Dispatch_Coordinator.InventorySnapshot => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorInventorySnapshot())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorInventorySnapshot_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.InventorySnapshot_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.InventorySnapshot_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorInventorySnapshot_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorMaterialBandType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.MaterialBand.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.MaterialBand.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorMaterialBandType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorMaterialBand_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.MaterialBand_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.MaterialBand_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorMaterialBand_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorMaterialBoundaryFacts(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.MaterialBoundaryFacts] {
  override def generate(f: Factory_Dispatch_Coordinator.MaterialBoundaryFacts => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorMaterialBoundaryFacts())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorMaterialBoundaryFacts_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.MaterialBoundaryFacts_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.MaterialBoundaryFacts_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorMaterialBoundaryFacts_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorModeType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Mode.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.Mode.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorModeType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorMode_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Mode_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.Mode_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorMode_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PreState_Container] {
  override def generate(f: Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_P(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_P] {
  override def generate(f: Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PS(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PS] {
  override def generate(f: Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PostState_Container] {
  override def generate(f: Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_P(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_P] {
  override def generate(f: Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PS(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PS] {
  override def generate(f: Factory_Dispatch_Coordinator.OrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorOrderLifecycle_coordinator_process_order_lifecycle_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorOrderStateType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.OrderState.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.OrderState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorOrderStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorOrderState_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.OrderState_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.OrderState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorOrderState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorOrderStatusValueType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.OrderStatusValue.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.OrderStatusValue.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorOrderStatusValueType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorOrderStatusValue_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.OrderStatusValue_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.OrderStatusValue_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorOrderStatusValue_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorOutcomeBoundaryFacts(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.OutcomeBoundaryFacts] {
  override def generate(f: Factory_Dispatch_Coordinator.OutcomeBoundaryFacts => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorOutcomeBoundaryFacts())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorOutcomeBoundaryFacts_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.OutcomeBoundaryFacts_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.OutcomeBoundaryFacts_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorOutcomeBoundaryFacts_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorOutcomeEventClassType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.OutcomeEventClass.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.OutcomeEventClass.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorOutcomeEventClassType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorOutcomeEventClass_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.OutcomeEventClass_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.OutcomeEventClass_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorOutcomeEventClass_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PreState_Container] {
  override def generate(f: Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_P(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_P] {
  override def generate(f: Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PS(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PS] {
  override def generate(f: Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PostState_Container] {
  override def generate(f: Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_P(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_P] {
  override def generate(f: Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PS(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PS] {
  override def generate(f: Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorOutcomeQualification_coordinator_process_outcome_qualification_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container] {
  override def generate(f: Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_P(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_P] {
  override def generate(f: Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PS(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PS] {
  override def generate(f: Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container] {
  override def generate(f: Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_P(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_P] {
  override def generate(f: Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PS(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PS] {
  override def generate(f: Factory_Dispatch_Coordinator.ProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorProcurementEligibility_coordinator_process_procurement_eligibility_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorProductBandType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.ProductBand.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.ProductBand.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorProductBandType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorProductBand_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.ProductBand_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.ProductBand_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorProductBand_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorProductBoundaryFacts(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.ProductBoundaryFacts] {
  override def generate(f: Factory_Dispatch_Coordinator.ProductBoundaryFacts => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorProductBoundaryFacts())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorProductBoundaryFacts_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.ProductBoundaryFacts_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.ProductBoundaryFacts_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorProductBoundaryFacts_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PreState_Container] {
  override def generate(f: Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_P(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PreState_Container_P] {
  override def generate(f: Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PS(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PS] {
  override def generate(f: Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PostState_Container] {
  override def generate(f: Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_P(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PostState_Container_P] {
  override def generate(f: Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PS(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PS] {
  override def generate(f: Factory_Dispatch_Coordinator.ProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorProductionEligibility_coordinator_process_production_eligibility_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorProposalStateType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.ProposalState.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.ProposalState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorProposalStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorProposalState_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.ProposalState_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.ProposalState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorProposalState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PreState_Container] {
  override def generate(f: Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_P(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PreState_Container_P] {
  override def generate(f: Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_PS(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PreState_Container_PS] {
  override def generate(f: Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PostState_Container] {
  override def generate(f: Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_P(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PostState_Container_P] {
  override def generate(f: Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_PS(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PostState_Container_PS] {
  override def generate(f: Factory_Dispatch_Coordinator.PublicComposition_coordinator_process_public_composition_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorPublicComposition_coordinator_process_public_composition_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorPublishedActionType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.PublishedAction.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.PublishedAction.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorPublishedActionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorPublishedAction_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.PublishedAction_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.PublishedAction_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorPublishedAction_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorPublishedOrderStateType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.PublishedOrderState.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.PublishedOrderState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorPublishedOrderStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorPublishedOrderState_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.PublishedOrderState_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.PublishedOrderState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorPublishedOrderState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorPublishedRecoveryStateType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.PublishedRecoveryState.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.PublishedRecoveryState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorPublishedRecoveryStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorPublishedRecoveryState_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.PublishedRecoveryState_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.PublishedRecoveryState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorPublishedRecoveryState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorQualifiedOutcomeType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.QualifiedOutcome.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.QualifiedOutcome.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorQualifiedOutcomeType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorQualifiedOutcome_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.QualifiedOutcome_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.QualifiedOutcome_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorQualifiedOutcome_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container] {
  override def generate(f: Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_P(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_P] {
  override def generate(f: Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PS(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PS] {
  override def generate(f: Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container] {
  override def generate(f: Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_P(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_P] {
  override def generate(f: Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PS(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PS] {
  override def generate(f: Factory_Dispatch_Coordinator.QuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorQuotationEligibility_coordinator_process_quotation_eligibility_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PreState_Container] {
  override def generate(f: Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_P(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PreState_Container_P] {
  override def generate(f: Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_PS(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PreState_Container_PS] {
  override def generate(f: Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PostState_Container] {
  override def generate(f: Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_P(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PostState_Container_P] {
  override def generate(f: Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_PS(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PostState_Container_PS] {
  override def generate(f: Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorRecoveryControl_coordinator_process_recovery_control_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorRecoveryEventType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.RecoveryEvent.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.RecoveryEvent.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorRecoveryEventType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorRecoveryEvent_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.RecoveryEvent_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.RecoveryEvent_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorRecoveryEvent_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorRecoveryGateType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.RecoveryGate.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.RecoveryGate.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorRecoveryGateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorRecoveryGate_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.RecoveryGate_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.RecoveryGate_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorRecoveryGate_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorRecoveryStateType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.RecoveryState.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.RecoveryState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorRecoveryStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorRecoveryState_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.RecoveryState_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.RecoveryState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorRecoveryState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorRecoveryStatusValueType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.RecoveryStatusValue.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.RecoveryStatusValue.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorRecoveryStatusValueType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorRecoveryStatusValue_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.RecoveryStatusValue_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.RecoveryStatusValue_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorRecoveryStatusValue_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorRequestBoundaryFacts(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.RequestBoundaryFacts] {
  override def generate(f: Factory_Dispatch_Coordinator.RequestBoundaryFacts => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorRequestBoundaryFacts())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorRequestBoundaryFacts_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.RequestBoundaryFacts_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.RequestBoundaryFacts_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorRequestBoundaryFacts_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorRequestDispositionType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.RequestDisposition.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.RequestDisposition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorRequestDispositionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorRequestDisposition_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.RequestDisposition_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.RequestDisposition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorRequestDisposition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorRequestFacts(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.RequestFacts] {
  override def generate(f: Factory_Dispatch_Coordinator.RequestFacts => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorRequestFacts())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorRequestFacts_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.RequestFacts_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.RequestFacts_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorRequestFacts_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PreState_Container] {
  override def generate(f: Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_P(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PreState_Container_P] {
  override def generate(f: Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_PS(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PreState_Container_PS] {
  override def generate(f: Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PostState_Container] {
  override def generate(f: Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_P(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PostState_Container_P] {
  override def generate(f: Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_PS(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PostState_Container_PS] {
  override def generate(f: Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorRequestQualification_coordinator_process_request_qualification_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorSelectedCauseType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.SelectedCause.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.SelectedCause.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorSelectedCauseType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorSelectedCause_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.SelectedCause_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.SelectedCause_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorSelectedCause_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PreState_Container] {
  override def generate(f: Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_P(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PreState_Container_P] {
  override def generate(f: Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_PS(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PreState_Container_PS] {
  override def generate(f: Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PostState_Container] {
  override def generate(f: Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_P(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PostState_Container_P] {
  override def generate(f: Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_PS(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PostState_Container_PS] {
  override def generate(f: Factory_Dispatch_Coordinator.StatusDerivation_coordinator_process_status_derivation_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorStatusDerivation_coordinator_process_status_derivation_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PreState_Container] {
  override def generate(f: Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_P(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PreState_Container_P] {
  override def generate(f: Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_PS(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PreState_Container_PS] {
  override def generate(f: Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PostState_Container] {
  override def generate(f: Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_P(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PostState_Container_P] {
  override def generate(f: Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_PS(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PostState_Container_PS] {
  override def generate(f: Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorStockAssessment_coordinator_process_stock_assessment_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorStockFacts(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.StockFacts] {
  override def generate(f: Factory_Dispatch_Coordinator.StockFacts => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorStockFacts())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorStockFacts_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.StockFacts_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.StockFacts_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorStockFacts_Payload())

      if (!continue) {
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


