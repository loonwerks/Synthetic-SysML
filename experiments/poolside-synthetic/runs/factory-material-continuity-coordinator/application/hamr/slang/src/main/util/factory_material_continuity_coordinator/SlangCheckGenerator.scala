// #Sireum

package factory_material_continuity_coordinator

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

DemandSignal.scala

DemandCode.scala

InventoryBand.scala

InventoryBandCode.scala

MaterialEvent.scala

MaterialEventCode.scala

EventClass.scala

MaterialClass.scala

Availability.scala

DemandState.scala

SupplyState.scala

QualifiedEvent.scala

FaultTrigger.scala

RecoveryGate.scala

DemandStateView.scala

DemandStateCode.scala

DemandUpdate.scala

DemandDisposition.scala

RecoveryEvent.scala

EmergencyState.scala

RecoveryState.scala

ProposalState.scala

MaterialAction.scala

DecisionCause.scala

CoordinationMode.scala

SupplyStateCode.scala

RecoveryStateCode.scala

DemandBoundaryFacts.scala

InventoryBoundaryFacts.scala

MaterialReadinessFacts.scala

EventBoundaryFacts.scala

DemandFacts.scala

DemandTransition.scala

Decision.scala

MaterialCoordinationResult.scala

Base_Types.scala

DemandAcquisition_material_continuity_process_demand_acquisition_Containers.scala

InventoryAcquisition_material_continuity_process_inventory_acquisition_Containers.scala

EventAcquisition_material_continuity_process_event_acquisition_Containers.scala

DemandQualification_material_continuity_process_demand_qualification_Containers.scala

MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_Containers.scala

EventCoherence_material_continuity_process_event_coherence_Containers.scala

DemandRegistry_material_continuity_process_demand_registry_Containers.scala

SupplyLifecycle_material_continuity_process_supply_lifecycle_Containers.scala

RecoverySupervisor_material_continuity_process_recovery_supervisor_Containers.scala

UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_Containers.scala

RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_Containers.scala

ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_Containers.scala

MaterialActionArbitration_material_continuity_process_material_action_arbitration_Containers.scala

ResultComposition_material_continuity_process_result_composition_Containers.scala

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

@record class Gen_Factory_Material_Continuity_CoordinatorAvailabilityType(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.Availability.Type] {
  override def generate(f: Factory_Material_Continuity_Coordinator.Availability.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorAvailabilityType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorAvailability_Payload(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.Availability_Payload] {
  override def generate(f: Factory_Material_Continuity_Coordinator.Availability_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorAvailability_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorCoordinationModeType(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.CoordinationMode.Type] {
  override def generate(f: Factory_Material_Continuity_Coordinator.CoordinationMode.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorCoordinationModeType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorCoordinationMode_Payload(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.CoordinationMode_Payload] {
  override def generate(f: Factory_Material_Continuity_Coordinator.CoordinationMode_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorCoordinationMode_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorDecision(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.Decision] {
  override def generate(f: Factory_Material_Continuity_Coordinator.Decision => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorDecision())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorDecision_Payload(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.Decision_Payload] {
  override def generate(f: Factory_Material_Continuity_Coordinator.Decision_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorDecision_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorDecisionCauseType(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.DecisionCause.Type] {
  override def generate(f: Factory_Material_Continuity_Coordinator.DecisionCause.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorDecisionCauseType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorDecisionCause_Payload(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.DecisionCause_Payload] {
  override def generate(f: Factory_Material_Continuity_Coordinator.DecisionCause_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorDecisionCause_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container] {
  override def generate(f: Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_P(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_P] {
  override def generate(f: Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PS(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PS] {
  override def generate(f: Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container] {
  override def generate(f: Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_P(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_P] {
  override def generate(f: Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PS(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PS] {
  override def generate(f: Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorDemandAcquisition_material_continuity_process_demand_acquisition_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorDemandBoundaryFacts(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.DemandBoundaryFacts] {
  override def generate(f: Factory_Material_Continuity_Coordinator.DemandBoundaryFacts => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorDemandBoundaryFacts())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorDemandBoundaryFacts_Payload(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.DemandBoundaryFacts_Payload] {
  override def generate(f: Factory_Material_Continuity_Coordinator.DemandBoundaryFacts_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorDemandBoundaryFacts_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorDemandCodeType(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.DemandCode.Type] {
  override def generate(f: Factory_Material_Continuity_Coordinator.DemandCode.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorDemandCodeType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorDemandCode_Payload(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.DemandCode_Payload] {
  override def generate(f: Factory_Material_Continuity_Coordinator.DemandCode_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorDemandCode_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorDemandDispositionType(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.DemandDisposition.Type] {
  override def generate(f: Factory_Material_Continuity_Coordinator.DemandDisposition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorDemandDispositionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorDemandDisposition_Payload(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.DemandDisposition_Payload] {
  override def generate(f: Factory_Material_Continuity_Coordinator.DemandDisposition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorDemandDisposition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorDemandFacts(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.DemandFacts] {
  override def generate(f: Factory_Material_Continuity_Coordinator.DemandFacts => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorDemandFacts())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorDemandFacts_Payload(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.DemandFacts_Payload] {
  override def generate(f: Factory_Material_Continuity_Coordinator.DemandFacts_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorDemandFacts_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PreState_Container] {
  override def generate(f: Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_P(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PreState_Container_P] {
  override def generate(f: Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_PS(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PreState_Container_PS] {
  override def generate(f: Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PostState_Container] {
  override def generate(f: Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_P(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PostState_Container_P] {
  override def generate(f: Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_PS(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PostState_Container_PS] {
  override def generate(f: Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorDemandQualification_material_continuity_process_demand_qualification_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PreState_Container] {
  override def generate(f: Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_P(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PreState_Container_P] {
  override def generate(f: Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_PS(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PreState_Container_PS] {
  override def generate(f: Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PostState_Container] {
  override def generate(f: Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_P(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PostState_Container_P] {
  override def generate(f: Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_PS(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PostState_Container_PS] {
  override def generate(f: Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorDemandRegistry_material_continuity_process_demand_registry_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorDemandSignalType(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.DemandSignal.Type] {
  override def generate(f: Factory_Material_Continuity_Coordinator.DemandSignal.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorDemandSignalType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorDemandSignal_Payload(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.DemandSignal_Payload] {
  override def generate(f: Factory_Material_Continuity_Coordinator.DemandSignal_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorDemandSignal_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorDemandStateType(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.DemandState.Type] {
  override def generate(f: Factory_Material_Continuity_Coordinator.DemandState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorDemandStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorDemandState_Payload(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.DemandState_Payload] {
  override def generate(f: Factory_Material_Continuity_Coordinator.DemandState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorDemandState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorDemandStateCodeType(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.DemandStateCode.Type] {
  override def generate(f: Factory_Material_Continuity_Coordinator.DemandStateCode.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorDemandStateCodeType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorDemandStateCode_Payload(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.DemandStateCode_Payload] {
  override def generate(f: Factory_Material_Continuity_Coordinator.DemandStateCode_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorDemandStateCode_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorDemandStateViewType(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.DemandStateView.Type] {
  override def generate(f: Factory_Material_Continuity_Coordinator.DemandStateView.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorDemandStateViewType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorDemandStateView_Payload(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.DemandStateView_Payload] {
  override def generate(f: Factory_Material_Continuity_Coordinator.DemandStateView_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorDemandStateView_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorDemandTransition(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.DemandTransition] {
  override def generate(f: Factory_Material_Continuity_Coordinator.DemandTransition => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorDemandTransition())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorDemandTransition_Payload(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.DemandTransition_Payload] {
  override def generate(f: Factory_Material_Continuity_Coordinator.DemandTransition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorDemandTransition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorDemandUpdateType(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.DemandUpdate.Type] {
  override def generate(f: Factory_Material_Continuity_Coordinator.DemandUpdate.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorDemandUpdateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorDemandUpdate_Payload(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.DemandUpdate_Payload] {
  override def generate(f: Factory_Material_Continuity_Coordinator.DemandUpdate_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorDemandUpdate_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorEmergencyStateType(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.EmergencyState.Type] {
  override def generate(f: Factory_Material_Continuity_Coordinator.EmergencyState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorEmergencyStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorEmergencyState_Payload(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.EmergencyState_Payload] {
  override def generate(f: Factory_Material_Continuity_Coordinator.EmergencyState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorEmergencyState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PreState_Container] {
  override def generate(f: Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_P(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PreState_Container_P] {
  override def generate(f: Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PS(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PS] {
  override def generate(f: Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PostState_Container] {
  override def generate(f: Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_P(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PostState_Container_P] {
  override def generate(f: Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PS(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PS] {
  override def generate(f: Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorEventAcquisition_material_continuity_process_event_acquisition_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorEventBoundaryFacts(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.EventBoundaryFacts] {
  override def generate(f: Factory_Material_Continuity_Coordinator.EventBoundaryFacts => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorEventBoundaryFacts())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorEventBoundaryFacts_Payload(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.EventBoundaryFacts_Payload] {
  override def generate(f: Factory_Material_Continuity_Coordinator.EventBoundaryFacts_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorEventBoundaryFacts_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorEventClassType(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.EventClass.Type] {
  override def generate(f: Factory_Material_Continuity_Coordinator.EventClass.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorEventClassType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorEventClass_Payload(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.EventClass_Payload] {
  override def generate(f: Factory_Material_Continuity_Coordinator.EventClass_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorEventClass_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PreState_Container] {
  override def generate(f: Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_P(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PreState_Container_P] {
  override def generate(f: Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_PS(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PreState_Container_PS] {
  override def generate(f: Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PostState_Container] {
  override def generate(f: Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_P(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PostState_Container_P] {
  override def generate(f: Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_PS(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PostState_Container_PS] {
  override def generate(f: Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorEventCoherence_material_continuity_process_event_coherence_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorFaultTriggerType(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.FaultTrigger.Type] {
  override def generate(f: Factory_Material_Continuity_Coordinator.FaultTrigger.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorFaultTriggerType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorFaultTrigger_Payload(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.FaultTrigger_Payload] {
  override def generate(f: Factory_Material_Continuity_Coordinator.FaultTrigger_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorFaultTrigger_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container] {
  override def generate(f: Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_P(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_P] {
  override def generate(f: Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PS(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PS] {
  override def generate(f: Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container] {
  override def generate(f: Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_P(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_P] {
  override def generate(f: Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PS(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PS] {
  override def generate(f: Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorInventoryAcquisition_material_continuity_process_inventory_acquisition_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorInventoryBandType(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.InventoryBand.Type] {
  override def generate(f: Factory_Material_Continuity_Coordinator.InventoryBand.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorInventoryBandType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorInventoryBand_Payload(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.InventoryBand_Payload] {
  override def generate(f: Factory_Material_Continuity_Coordinator.InventoryBand_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorInventoryBand_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorInventoryBandCodeType(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.InventoryBandCode.Type] {
  override def generate(f: Factory_Material_Continuity_Coordinator.InventoryBandCode.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorInventoryBandCodeType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorInventoryBandCode_Payload(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.InventoryBandCode_Payload] {
  override def generate(f: Factory_Material_Continuity_Coordinator.InventoryBandCode_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorInventoryBandCode_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorInventoryBoundaryFacts(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.InventoryBoundaryFacts] {
  override def generate(f: Factory_Material_Continuity_Coordinator.InventoryBoundaryFacts => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorInventoryBoundaryFacts())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorInventoryBoundaryFacts_Payload(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.InventoryBoundaryFacts_Payload] {
  override def generate(f: Factory_Material_Continuity_Coordinator.InventoryBoundaryFacts_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorInventoryBoundaryFacts_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorMaterialActionType(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.MaterialAction.Type] {
  override def generate(f: Factory_Material_Continuity_Coordinator.MaterialAction.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorMaterialActionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorMaterialAction_Payload(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.MaterialAction_Payload] {
  override def generate(f: Factory_Material_Continuity_Coordinator.MaterialAction_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorMaterialAction_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container] {
  override def generate(f: Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_P(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_P] {
  override def generate(f: Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PS(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PS] {
  override def generate(f: Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container] {
  override def generate(f: Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_P(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_P] {
  override def generate(f: Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PS(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PS] {
  override def generate(f: Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorMaterialActionArbitration_material_continuity_process_material_action_arbitration_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorMaterialClassType(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.MaterialClass.Type] {
  override def generate(f: Factory_Material_Continuity_Coordinator.MaterialClass.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorMaterialClassType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorMaterialClass_Payload(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.MaterialClass_Payload] {
  override def generate(f: Factory_Material_Continuity_Coordinator.MaterialClass_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorMaterialClass_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorMaterialCoordinationResult(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.MaterialCoordinationResult] {
  override def generate(f: Factory_Material_Continuity_Coordinator.MaterialCoordinationResult => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorMaterialCoordinationResult())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorMaterialCoordinationResult_Payload(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.MaterialCoordinationResult_Payload] {
  override def generate(f: Factory_Material_Continuity_Coordinator.MaterialCoordinationResult_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorMaterialCoordinationResult_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorMaterialEventType(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.MaterialEvent.Type] {
  override def generate(f: Factory_Material_Continuity_Coordinator.MaterialEvent.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorMaterialEventType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorMaterialEvent_Payload(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.MaterialEvent_Payload] {
  override def generate(f: Factory_Material_Continuity_Coordinator.MaterialEvent_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorMaterialEvent_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorMaterialEventCodeType(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.MaterialEventCode.Type] {
  override def generate(f: Factory_Material_Continuity_Coordinator.MaterialEventCode.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorMaterialEventCodeType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorMaterialEventCode_Payload(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.MaterialEventCode_Payload] {
  override def generate(f: Factory_Material_Continuity_Coordinator.MaterialEventCode_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorMaterialEventCode_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container] {
  override def generate(f: Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_P(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_P] {
  override def generate(f: Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PS(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PS] {
  override def generate(f: Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container] {
  override def generate(f: Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_P(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_P] {
  override def generate(f: Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PS(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PS] {
  override def generate(f: Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorMaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorMaterialReadinessFacts(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.MaterialReadinessFacts] {
  override def generate(f: Factory_Material_Continuity_Coordinator.MaterialReadinessFacts => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorMaterialReadinessFacts())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorMaterialReadinessFacts_Payload(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.MaterialReadinessFacts_Payload] {
  override def generate(f: Factory_Material_Continuity_Coordinator.MaterialReadinessFacts_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorMaterialReadinessFacts_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorProposalStateType(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.ProposalState.Type] {
  override def generate(f: Factory_Material_Continuity_Coordinator.ProposalState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorProposalStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorProposalState_Payload(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.ProposalState_Payload] {
  override def generate(f: Factory_Material_Continuity_Coordinator.ProposalState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorProposalState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorQualifiedEventType(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.QualifiedEvent.Type] {
  override def generate(f: Factory_Material_Continuity_Coordinator.QualifiedEvent.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorQualifiedEventType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorQualifiedEvent_Payload(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.QualifiedEvent_Payload] {
  override def generate(f: Factory_Material_Continuity_Coordinator.QualifiedEvent_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorQualifiedEvent_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorRecoveryEventType(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.RecoveryEvent.Type] {
  override def generate(f: Factory_Material_Continuity_Coordinator.RecoveryEvent.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorRecoveryEventType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorRecoveryEvent_Payload(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.RecoveryEvent_Payload] {
  override def generate(f: Factory_Material_Continuity_Coordinator.RecoveryEvent_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorRecoveryEvent_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorRecoveryGateType(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.RecoveryGate.Type] {
  override def generate(f: Factory_Material_Continuity_Coordinator.RecoveryGate.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorRecoveryGateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorRecoveryGate_Payload(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.RecoveryGate_Payload] {
  override def generate(f: Factory_Material_Continuity_Coordinator.RecoveryGate_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorRecoveryGate_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorRecoveryStateType(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.RecoveryState.Type] {
  override def generate(f: Factory_Material_Continuity_Coordinator.RecoveryState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorRecoveryStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorRecoveryState_Payload(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.RecoveryState_Payload] {
  override def generate(f: Factory_Material_Continuity_Coordinator.RecoveryState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorRecoveryState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorRecoveryStateCodeType(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.RecoveryStateCode.Type] {
  override def generate(f: Factory_Material_Continuity_Coordinator.RecoveryStateCode.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorRecoveryStateCodeType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorRecoveryStateCode_Payload(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.RecoveryStateCode_Payload] {
  override def generate(f: Factory_Material_Continuity_Coordinator.RecoveryStateCode_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorRecoveryStateCode_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container] {
  override def generate(f: Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_P(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_P] {
  override def generate(f: Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PS(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PS] {
  override def generate(f: Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container] {
  override def generate(f: Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_P(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_P] {
  override def generate(f: Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PS(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PS] {
  override def generate(f: Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorRecoverySupervisor_material_continuity_process_recovery_supervisor_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container] {
  override def generate(f: Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_P(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_P] {
  override def generate(f: Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PS(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PS] {
  override def generate(f: Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container] {
  override def generate(f: Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_P(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_P] {
  override def generate(f: Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PS(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PS] {
  override def generate(f: Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorReplenishmentEligibility_material_continuity_process_replenishment_eligibility_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PreState_Container] {
  override def generate(f: Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_P(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PreState_Container_P] {
  override def generate(f: Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_PS(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PreState_Container_PS] {
  override def generate(f: Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PostState_Container] {
  override def generate(f: Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_P(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PostState_Container_P] {
  override def generate(f: Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_PS(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PostState_Container_PS] {
  override def generate(f: Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorResultComposition_material_continuity_process_result_composition_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container] {
  override def generate(f: Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_P(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_P] {
  override def generate(f: Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PS(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PS] {
  override def generate(f: Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container] {
  override def generate(f: Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_P(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_P] {
  override def generate(f: Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PS(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PS] {
  override def generate(f: Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorRoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container] {
  override def generate(f: Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_P(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_P] {
  override def generate(f: Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PS(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PS] {
  override def generate(f: Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container] {
  override def generate(f: Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_P(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_P] {
  override def generate(f: Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PS(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PS] {
  override def generate(f: Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorSupplyLifecycle_material_continuity_process_supply_lifecycle_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorSupplyStateType(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.SupplyState.Type] {
  override def generate(f: Factory_Material_Continuity_Coordinator.SupplyState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorSupplyStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorSupplyState_Payload(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.SupplyState_Payload] {
  override def generate(f: Factory_Material_Continuity_Coordinator.SupplyState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorSupplyState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorSupplyStateCodeType(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.SupplyStateCode.Type] {
  override def generate(f: Factory_Material_Continuity_Coordinator.SupplyStateCode.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorSupplyStateCodeType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorSupplyStateCode_Payload(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.SupplyStateCode_Payload] {
  override def generate(f: Factory_Material_Continuity_Coordinator.SupplyStateCode_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorSupplyStateCode_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container] {
  override def generate(f: Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_P(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_P] {
  override def generate(f: Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PS(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PS] {
  override def generate(f: Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container] {
  override def generate(f: Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_P(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_P] {
  override def generate(f: Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PS(param: RandomLibI) extends MJen[Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PS] {
  override def generate(f: Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Material_Continuity_CoordinatorUrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_PostState_Container_PS())

      if (!continue) {
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


