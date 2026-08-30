// #Sireum

package factory_dispatch_coordinator

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

Request_Id.scala

Product_Id.scala

Dispatch_Amount.scala

Request_Freshness.scala

Admission_Assessment.scala

Inventory_Amount.scala

Observation_Validity.scala

Inventory_Product_Id.scala

Dispatch_Lifecycle.scala

Capacity_Request_Id.scala

Capacity_Product_Id.scala

Capacity_Amount.scala

Fresh_Inventory_Assessment.scala

Recovery_Inventory_Assessment.scala

Candidate_Request_Id.scala

Candidate_Product_Id.scala

Candidate_Amount.scala

Candidate_Lifecycle.scala

Dock_Disposition.scala

Dock_Assessment.scala

Dispatch_Attempt.scala

Outcome_Result.scala

Context_Request_Id.scala

Context_Attempt.scala

Outcome_Plan.scala

Confirmation_Outcome_Class.scala

Confirmation_Request_Id.scala

Selected_Intent.scala

Dispatch_Decision_Kind.scala

Decision_Reason.scala

Instruction_Kind.scala

Confirmation_Kind.scala

Dispatch_Status.scala

Raw_Dispatch_Request.scala

Qualified_Request_Fact.scala

Dispatch_Inventory_Snapshot.scala

Recovery_Qualification_Context.scala

Candidate_Inventory_Readiness.scala

Dock_Snapshot.scala

Execution_Outcome.scala

Active_Execution_Context.scala

Confirmation_Context.scala

Dispatch_Decision.scala

Shipment_Instruction.scala

Shipping_Confirmation.scala

Base_Types.scala

Request_Qualifier_dispatch_coordinator_process_request_qualifier_Containers.scala

Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_Containers.scala

Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_Containers.scala

Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_Containers.scala

Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_Containers.scala

Release_Arbiter_dispatch_coordinator_process_release_arbiter_Containers.scala

Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_Containers.scala

Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_Containers.scala

Status_Determiner_dispatch_coordinator_process_status_determiner_Containers.scala

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

@record class Gen_Factory_Dispatch_CoordinatorActive_Execution_Context(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Active_Execution_Context] {
  override def generate(f: Factory_Dispatch_Coordinator.Active_Execution_Context => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorActive_Execution_Context())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorActive_Execution_Context_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Active_Execution_Context_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.Active_Execution_Context_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorActive_Execution_Context_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorAdmission_AssessmentType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Admission_Assessment.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.Admission_Assessment.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorAdmission_AssessmentType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorAdmission_Assessment_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Admission_Assessment_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.Admission_Assessment_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorAdmission_Assessment_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorCandidate_AmountType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Candidate_Amount.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.Candidate_Amount.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorCandidate_AmountType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorCandidate_Amount_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Candidate_Amount_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.Candidate_Amount_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorCandidate_Amount_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorCandidate_Inventory_Readiness(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Candidate_Inventory_Readiness] {
  override def generate(f: Factory_Dispatch_Coordinator.Candidate_Inventory_Readiness => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorCandidate_Inventory_Readiness())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorCandidate_Inventory_Readiness_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Candidate_Inventory_Readiness_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.Candidate_Inventory_Readiness_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorCandidate_Inventory_Readiness_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorCandidate_LifecycleType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Candidate_Lifecycle.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.Candidate_Lifecycle.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorCandidate_LifecycleType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorCandidate_Lifecycle_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Candidate_Lifecycle_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.Candidate_Lifecycle_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorCandidate_Lifecycle_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorCandidate_Product_IdType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Candidate_Product_Id.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.Candidate_Product_Id.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorCandidate_Product_IdType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorCandidate_Product_Id_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Candidate_Product_Id_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.Candidate_Product_Id_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorCandidate_Product_Id_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorCandidate_Request_IdType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Candidate_Request_Id.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.Candidate_Request_Id.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorCandidate_Request_IdType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorCandidate_Request_Id_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Candidate_Request_Id_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.Candidate_Request_Id_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorCandidate_Request_Id_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorCapacity_AmountType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Capacity_Amount.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.Capacity_Amount.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorCapacity_AmountType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorCapacity_Amount_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Capacity_Amount_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.Capacity_Amount_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorCapacity_Amount_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorCapacity_Product_IdType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Capacity_Product_Id.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.Capacity_Product_Id.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorCapacity_Product_IdType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorCapacity_Product_Id_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Capacity_Product_Id_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.Capacity_Product_Id_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorCapacity_Product_Id_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorCapacity_Request_IdType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Capacity_Request_Id.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.Capacity_Request_Id.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorCapacity_Request_IdType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorCapacity_Request_Id_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Capacity_Request_Id_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.Capacity_Request_Id_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorCapacity_Request_Id_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container] {
  override def generate(f: Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_P(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_P] {
  override def generate(f: Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PS(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PS] {
  override def generate(f: Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container] {
  override def generate(f: Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_P(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_P] {
  override def generate(f: Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PS(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PS] {
  override def generate(f: Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorCommitment_Tracker_dispatch_coordinator_process_commitment_tracker_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorConfirmation_Context(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Confirmation_Context] {
  override def generate(f: Factory_Dispatch_Coordinator.Confirmation_Context => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorConfirmation_Context())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorConfirmation_Context_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Confirmation_Context_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.Confirmation_Context_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorConfirmation_Context_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container] {
  override def generate(f: Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_P(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_P] {
  override def generate(f: Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PS(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PS] {
  override def generate(f: Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container] {
  override def generate(f: Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_P(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_P] {
  override def generate(f: Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PS(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PS] {
  override def generate(f: Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorConfirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorConfirmation_KindType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Confirmation_Kind.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.Confirmation_Kind.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorConfirmation_KindType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorConfirmation_Kind_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Confirmation_Kind_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.Confirmation_Kind_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorConfirmation_Kind_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorConfirmation_Outcome_ClassType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Confirmation_Outcome_Class.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.Confirmation_Outcome_Class.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorConfirmation_Outcome_ClassType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorConfirmation_Outcome_Class_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Confirmation_Outcome_Class_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.Confirmation_Outcome_Class_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorConfirmation_Outcome_Class_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorConfirmation_Request_IdType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Confirmation_Request_Id.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.Confirmation_Request_Id.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorConfirmation_Request_IdType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorConfirmation_Request_Id_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Confirmation_Request_Id_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.Confirmation_Request_Id_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorConfirmation_Request_Id_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorContext_AttemptType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Context_Attempt.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.Context_Attempt.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorContext_AttemptType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorContext_Attempt_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Context_Attempt_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.Context_Attempt_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorContext_Attempt_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorContext_Request_IdType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Context_Request_Id.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.Context_Request_Id.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorContext_Request_IdType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorContext_Request_Id_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Context_Request_Id_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.Context_Request_Id_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorContext_Request_Id_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDecision_ReasonType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Decision_Reason.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.Decision_Reason.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDecision_ReasonType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDecision_Reason_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Decision_Reason_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.Decision_Reason_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDecision_Reason_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDispatch_AmountType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Dispatch_Amount.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.Dispatch_Amount.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDispatch_AmountType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDispatch_Amount_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Dispatch_Amount_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.Dispatch_Amount_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDispatch_Amount_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDispatch_AttemptType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Dispatch_Attempt.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.Dispatch_Attempt.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDispatch_AttemptType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDispatch_Attempt_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Dispatch_Attempt_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.Dispatch_Attempt_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDispatch_Attempt_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDispatch_Decision(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Dispatch_Decision] {
  override def generate(f: Factory_Dispatch_Coordinator.Dispatch_Decision => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDispatch_Decision())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDispatch_Decision_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Dispatch_Decision_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.Dispatch_Decision_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDispatch_Decision_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDispatch_Decision_KindType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Dispatch_Decision_Kind.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.Dispatch_Decision_Kind.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDispatch_Decision_KindType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDispatch_Decision_Kind_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Dispatch_Decision_Kind_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.Dispatch_Decision_Kind_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDispatch_Decision_Kind_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDispatch_Inventory_Snapshot(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Dispatch_Inventory_Snapshot] {
  override def generate(f: Factory_Dispatch_Coordinator.Dispatch_Inventory_Snapshot => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDispatch_Inventory_Snapshot())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDispatch_Inventory_Snapshot_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Dispatch_Inventory_Snapshot_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.Dispatch_Inventory_Snapshot_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDispatch_Inventory_Snapshot_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDispatch_LifecycleType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Dispatch_Lifecycle.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.Dispatch_Lifecycle.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDispatch_LifecycleType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDispatch_Lifecycle_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Dispatch_Lifecycle_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.Dispatch_Lifecycle_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDispatch_Lifecycle_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container] {
  override def generate(f: Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_P(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_P] {
  override def generate(f: Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PS(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PS] {
  override def generate(f: Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container] {
  override def generate(f: Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_P(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_P] {
  override def generate(f: Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PS(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PS] {
  override def generate(f: Factory_Dispatch_Coordinator.Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_PostState_Container_PS())

      if (!continue) {
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

@record class Gen_Factory_Dispatch_CoordinatorDock_AssessmentType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Dock_Assessment.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.Dock_Assessment.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDock_AssessmentType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDock_Assessment_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Dock_Assessment_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.Dock_Assessment_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDock_Assessment_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDock_DispositionType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Dock_Disposition.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.Dock_Disposition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDock_DispositionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDock_Disposition_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Dock_Disposition_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.Dock_Disposition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDock_Disposition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container] {
  override def generate(f: Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_P(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_P] {
  override def generate(f: Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PS(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PS] {
  override def generate(f: Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container] {
  override def generate(f: Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_P(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_P] {
  override def generate(f: Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PS(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PS] {
  override def generate(f: Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDock_Qualifier_dispatch_coordinator_process_dock_qualifier_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDock_Snapshot(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Dock_Snapshot] {
  override def generate(f: Factory_Dispatch_Coordinator.Dock_Snapshot => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDock_Snapshot())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorDock_Snapshot_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Dock_Snapshot_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.Dock_Snapshot_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorDock_Snapshot_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorExecution_Outcome(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Execution_Outcome] {
  override def generate(f: Factory_Dispatch_Coordinator.Execution_Outcome => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorExecution_Outcome())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorExecution_Outcome_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Execution_Outcome_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.Execution_Outcome_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorExecution_Outcome_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorFresh_Inventory_AssessmentType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Fresh_Inventory_Assessment.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.Fresh_Inventory_Assessment.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorFresh_Inventory_AssessmentType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorFresh_Inventory_Assessment_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Fresh_Inventory_Assessment_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.Fresh_Inventory_Assessment_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorFresh_Inventory_Assessment_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorInstruction_KindType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Instruction_Kind.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.Instruction_Kind.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorInstruction_KindType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorInstruction_Kind_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Instruction_Kind_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.Instruction_Kind_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorInstruction_Kind_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorInventory_AmountType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Inventory_Amount.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.Inventory_Amount.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorInventory_AmountType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorInventory_Amount_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Inventory_Amount_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.Inventory_Amount_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorInventory_Amount_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorInventory_Product_IdType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Inventory_Product_Id.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.Inventory_Product_Id.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorInventory_Product_IdType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorInventory_Product_Id_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Inventory_Product_Id_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.Inventory_Product_Id_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorInventory_Product_Id_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container] {
  override def generate(f: Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_P(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_P] {
  override def generate(f: Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PS(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PS] {
  override def generate(f: Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container] {
  override def generate(f: Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_P(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_P] {
  override def generate(f: Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PS(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PS] {
  override def generate(f: Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorInventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorObservation_ValidityType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Observation_Validity.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.Observation_Validity.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorObservation_ValidityType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorObservation_Validity_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Observation_Validity_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.Observation_Validity_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorObservation_Validity_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorOutcome_PlanType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Outcome_Plan.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.Outcome_Plan.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorOutcome_PlanType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorOutcome_Plan_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Outcome_Plan_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.Outcome_Plan_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorOutcome_Plan_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container] {
  override def generate(f: Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_P(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_P] {
  override def generate(f: Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PS(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PS] {
  override def generate(f: Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container] {
  override def generate(f: Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_P(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_P] {
  override def generate(f: Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PS(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PS] {
  override def generate(f: Factory_Dispatch_Coordinator.Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorOutcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorOutcome_ResultType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Outcome_Result.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.Outcome_Result.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorOutcome_ResultType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorOutcome_Result_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Outcome_Result_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.Outcome_Result_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorOutcome_Result_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorProduct_IdType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Product_Id.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.Product_Id.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorProduct_IdType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorProduct_Id_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Product_Id_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.Product_Id_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorProduct_Id_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorQualified_Request_Fact(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Qualified_Request_Fact] {
  override def generate(f: Factory_Dispatch_Coordinator.Qualified_Request_Fact => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorQualified_Request_Fact())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorQualified_Request_Fact_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Qualified_Request_Fact_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.Qualified_Request_Fact_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorQualified_Request_Fact_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorRaw_Dispatch_Request(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Raw_Dispatch_Request] {
  override def generate(f: Factory_Dispatch_Coordinator.Raw_Dispatch_Request => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorRaw_Dispatch_Request())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorRaw_Dispatch_Request_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Raw_Dispatch_Request_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.Raw_Dispatch_Request_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorRaw_Dispatch_Request_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorRecovery_Inventory_AssessmentType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Recovery_Inventory_Assessment.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.Recovery_Inventory_Assessment.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorRecovery_Inventory_AssessmentType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorRecovery_Inventory_Assessment_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Recovery_Inventory_Assessment_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.Recovery_Inventory_Assessment_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorRecovery_Inventory_Assessment_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorRecovery_Qualification_Context(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Recovery_Qualification_Context] {
  override def generate(f: Factory_Dispatch_Coordinator.Recovery_Qualification_Context => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorRecovery_Qualification_Context())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorRecovery_Qualification_Context_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Recovery_Qualification_Context_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.Recovery_Qualification_Context_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorRecovery_Qualification_Context_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container] {
  override def generate(f: Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_P(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_P] {
  override def generate(f: Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PS(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PS] {
  override def generate(f: Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container] {
  override def generate(f: Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_P(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_P] {
  override def generate(f: Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PS(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PS] {
  override def generate(f: Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorRelease_Arbiter_dispatch_coordinator_process_release_arbiter_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorRequest_FreshnessType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Request_Freshness.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.Request_Freshness.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorRequest_FreshnessType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorRequest_Freshness_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Request_Freshness_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.Request_Freshness_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorRequest_Freshness_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorRequest_IdType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Request_Id.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.Request_Id.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorRequest_IdType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorRequest_Id_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Request_Id_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.Request_Id_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorRequest_Id_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container] {
  override def generate(f: Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_P(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_P] {
  override def generate(f: Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PS(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PS] {
  override def generate(f: Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container] {
  override def generate(f: Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_P(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_P] {
  override def generate(f: Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PS(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PS] {
  override def generate(f: Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorRequest_Qualifier_dispatch_coordinator_process_request_qualifier_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorSelected_IntentType(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Selected_Intent.Type] {
  override def generate(f: Factory_Dispatch_Coordinator.Selected_Intent.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorSelected_IntentType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorSelected_Intent_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Selected_Intent_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.Selected_Intent_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorSelected_Intent_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorShipment_Instruction(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Shipment_Instruction] {
  override def generate(f: Factory_Dispatch_Coordinator.Shipment_Instruction => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorShipment_Instruction())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorShipment_Instruction_Payload(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Shipment_Instruction_Payload] {
  override def generate(f: Factory_Dispatch_Coordinator.Shipment_Instruction_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorShipment_Instruction_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorShipping_Confirmation(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Shipping_Confirmation] {
  override def generate(f: Factory_Dispatch_Coordinator.Shipping_Confirmation => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorShipping_Confirmation())

      if (!continue) {
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

@record class Gen_Factory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container] {
  override def generate(f: Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_P(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_P] {
  override def generate(f: Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PS(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PS] {
  override def generate(f: Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container] {
  override def generate(f: Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_P(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_P] {
  override def generate(f: Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PS(param: RandomLibI) extends MJen[Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PS] {
  override def generate(f: Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_Dispatch_CoordinatorStatus_Determiner_dispatch_coordinator_process_status_determiner_PostState_Container_PS())

      if (!continue) {
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


