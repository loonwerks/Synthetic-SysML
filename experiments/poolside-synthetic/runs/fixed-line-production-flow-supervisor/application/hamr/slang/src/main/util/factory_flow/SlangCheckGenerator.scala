// #Sireum

package factory_flow

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

RequestPresence.scala

Validity.scala

WorkId.scala

ProductKind.scala

AdmissionAssessment.scala

MaterialDisposition.scala

MaterialAssessment.scala

StepDisposition.scala

LedgerPhase.scala

AttemptKind.scala

TargetQualification.scala

ProcessEvent.scala

CorrelatedOutcomePlan.scala

IntentKind.scala

CompetitorPresence.scala

FlowDecision.scala

DecisionReason.scala

CommandAction.scala

ProductionResult.scala

ProductionFlowStatus.scala

PresentedWorkRequest.scala

AdmissionFact.scala

MaterialHandoffObservation.scala

MaterialFact.scala

StepReadinessObservation.scala

FlowContext.scala

ProtectionContext.scala

FlowSnapshot.scala

ProcessResultObservation.scala

OutcomeFact.scala

FlowIntentFact.scala

AuthorizationFact.scala

LineFlowCommand.scala

ProductionOutcome.scala

Base_Types.scala

WorkRequestQualifier_supervisorProcess_workRequestQualifier_Containers.scala

MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_Containers.scala

TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_Containers.scala

ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_Containers.scala

ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_Containers.scala

FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_Containers.scala

FlowLedger_supervisorProcess_flowLedger_Containers.scala

ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_Containers.scala

FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_Containers.scala

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

@record class Gen_Factory_FlowAdmissionAssessmentType(param: RandomLibI) extends MJen[Factory_Flow.AdmissionAssessment.Type] {
  override def generate(f: Factory_Flow.AdmissionAssessment.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowAdmissionAssessmentType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowAdmissionAssessment_Payload(param: RandomLibI) extends MJen[Factory_Flow.AdmissionAssessment_Payload] {
  override def generate(f: Factory_Flow.AdmissionAssessment_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowAdmissionAssessment_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowAdmissionFact(param: RandomLibI) extends MJen[Factory_Flow.AdmissionFact] {
  override def generate(f: Factory_Flow.AdmissionFact => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowAdmissionFact())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowAdmissionFact_Payload(param: RandomLibI) extends MJen[Factory_Flow.AdmissionFact_Payload] {
  override def generate(f: Factory_Flow.AdmissionFact_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowAdmissionFact_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowAttemptKindType(param: RandomLibI) extends MJen[Factory_Flow.AttemptKind.Type] {
  override def generate(f: Factory_Flow.AttemptKind.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowAttemptKindType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowAttemptKind_Payload(param: RandomLibI) extends MJen[Factory_Flow.AttemptKind_Payload] {
  override def generate(f: Factory_Flow.AttemptKind_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowAttemptKind_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowAuthorizationFact(param: RandomLibI) extends MJen[Factory_Flow.AuthorizationFact] {
  override def generate(f: Factory_Flow.AuthorizationFact => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowAuthorizationFact())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowAuthorizationFact_Payload(param: RandomLibI) extends MJen[Factory_Flow.AuthorizationFact_Payload] {
  override def generate(f: Factory_Flow.AuthorizationFact_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowAuthorizationFact_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowCommandActionType(param: RandomLibI) extends MJen[Factory_Flow.CommandAction.Type] {
  override def generate(f: Factory_Flow.CommandAction.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowCommandActionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowCommandAction_Payload(param: RandomLibI) extends MJen[Factory_Flow.CommandAction_Payload] {
  override def generate(f: Factory_Flow.CommandAction_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowCommandAction_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowCompetitorPresenceType(param: RandomLibI) extends MJen[Factory_Flow.CompetitorPresence.Type] {
  override def generate(f: Factory_Flow.CompetitorPresence.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowCompetitorPresenceType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowCompetitorPresence_Payload(param: RandomLibI) extends MJen[Factory_Flow.CompetitorPresence_Payload] {
  override def generate(f: Factory_Flow.CompetitorPresence_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowCompetitorPresence_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowCorrelatedOutcomePlanType(param: RandomLibI) extends MJen[Factory_Flow.CorrelatedOutcomePlan.Type] {
  override def generate(f: Factory_Flow.CorrelatedOutcomePlan.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowCorrelatedOutcomePlanType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowCorrelatedOutcomePlan_Payload(param: RandomLibI) extends MJen[Factory_Flow.CorrelatedOutcomePlan_Payload] {
  override def generate(f: Factory_Flow.CorrelatedOutcomePlan_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowCorrelatedOutcomePlan_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowDecisionReasonType(param: RandomLibI) extends MJen[Factory_Flow.DecisionReason.Type] {
  override def generate(f: Factory_Flow.DecisionReason.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowDecisionReasonType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowDecisionReason_Payload(param: RandomLibI) extends MJen[Factory_Flow.DecisionReason_Payload] {
  override def generate(f: Factory_Flow.DecisionReason_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowDecisionReason_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container(param: RandomLibI) extends MJen[Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container] {
  override def generate(f: Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_P(param: RandomLibI) extends MJen[Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_P] {
  override def generate(f: Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PS(param: RandomLibI) extends MJen[Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PS] {
  override def generate(f: Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container(param: RandomLibI) extends MJen[Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container] {
  override def generate(f: Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_P(param: RandomLibI) extends MJen[Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_P] {
  override def generate(f: Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PS(param: RandomLibI) extends MJen[Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PS] {
  override def generate(f: Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowFlowContext(param: RandomLibI) extends MJen[Factory_Flow.FlowContext] {
  override def generate(f: Factory_Flow.FlowContext => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowFlowContext())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowFlowContext_Payload(param: RandomLibI) extends MJen[Factory_Flow.FlowContext_Payload] {
  override def generate(f: Factory_Flow.FlowContext_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowFlowContext_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowFlowDecisionType(param: RandomLibI) extends MJen[Factory_Flow.FlowDecision.Type] {
  override def generate(f: Factory_Flow.FlowDecision.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowFlowDecisionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowFlowDecision_Payload(param: RandomLibI) extends MJen[Factory_Flow.FlowDecision_Payload] {
  override def generate(f: Factory_Flow.FlowDecision_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowFlowDecision_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowFlowIntentFact(param: RandomLibI) extends MJen[Factory_Flow.FlowIntentFact] {
  override def generate(f: Factory_Flow.FlowIntentFact => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowFlowIntentFact())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowFlowIntentFact_Payload(param: RandomLibI) extends MJen[Factory_Flow.FlowIntentFact_Payload] {
  override def generate(f: Factory_Flow.FlowIntentFact_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowFlowIntentFact_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container(param: RandomLibI) extends MJen[Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PreState_Container] {
  override def generate(f: Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_P(param: RandomLibI) extends MJen[Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PreState_Container_P] {
  override def generate(f: Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_PS(param: RandomLibI) extends MJen[Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PreState_Container_PS] {
  override def generate(f: Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container(param: RandomLibI) extends MJen[Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PostState_Container] {
  override def generate(f: Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_P(param: RandomLibI) extends MJen[Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PostState_Container_P] {
  override def generate(f: Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_PS(param: RandomLibI) extends MJen[Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PostState_Container_PS] {
  override def generate(f: Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowFlowSnapshot(param: RandomLibI) extends MJen[Factory_Flow.FlowSnapshot] {
  override def generate(f: Factory_Flow.FlowSnapshot => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowFlowSnapshot())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowFlowSnapshot_Payload(param: RandomLibI) extends MJen[Factory_Flow.FlowSnapshot_Payload] {
  override def generate(f: Factory_Flow.FlowSnapshot_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowFlowSnapshot_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container(param: RandomLibI) extends MJen[Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container] {
  override def generate(f: Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_P(param: RandomLibI) extends MJen[Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_P] {
  override def generate(f: Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PS(param: RandomLibI) extends MJen[Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PS] {
  override def generate(f: Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container(param: RandomLibI) extends MJen[Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container] {
  override def generate(f: Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_P(param: RandomLibI) extends MJen[Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_P] {
  override def generate(f: Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PS(param: RandomLibI) extends MJen[Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PS] {
  override def generate(f: Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowIntentKindType(param: RandomLibI) extends MJen[Factory_Flow.IntentKind.Type] {
  override def generate(f: Factory_Flow.IntentKind.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowIntentKindType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowIntentKind_Payload(param: RandomLibI) extends MJen[Factory_Flow.IntentKind_Payload] {
  override def generate(f: Factory_Flow.IntentKind_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowIntentKind_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowLedgerPhaseType(param: RandomLibI) extends MJen[Factory_Flow.LedgerPhase.Type] {
  override def generate(f: Factory_Flow.LedgerPhase.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowLedgerPhaseType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowLedgerPhase_Payload(param: RandomLibI) extends MJen[Factory_Flow.LedgerPhase_Payload] {
  override def generate(f: Factory_Flow.LedgerPhase_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowLedgerPhase_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowLineFlowCommand(param: RandomLibI) extends MJen[Factory_Flow.LineFlowCommand] {
  override def generate(f: Factory_Flow.LineFlowCommand => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowLineFlowCommand())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowLineFlowCommand_Payload(param: RandomLibI) extends MJen[Factory_Flow.LineFlowCommand_Payload] {
  override def generate(f: Factory_Flow.LineFlowCommand_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowLineFlowCommand_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowMaterialAssessmentType(param: RandomLibI) extends MJen[Factory_Flow.MaterialAssessment.Type] {
  override def generate(f: Factory_Flow.MaterialAssessment.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowMaterialAssessmentType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowMaterialAssessment_Payload(param: RandomLibI) extends MJen[Factory_Flow.MaterialAssessment_Payload] {
  override def generate(f: Factory_Flow.MaterialAssessment_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowMaterialAssessment_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container(param: RandomLibI) extends MJen[Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container] {
  override def generate(f: Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_P(param: RandomLibI) extends MJen[Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_P] {
  override def generate(f: Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PS(param: RandomLibI) extends MJen[Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PS] {
  override def generate(f: Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container(param: RandomLibI) extends MJen[Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container] {
  override def generate(f: Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_P(param: RandomLibI) extends MJen[Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_P] {
  override def generate(f: Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PS(param: RandomLibI) extends MJen[Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PS] {
  override def generate(f: Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowMaterialDispositionType(param: RandomLibI) extends MJen[Factory_Flow.MaterialDisposition.Type] {
  override def generate(f: Factory_Flow.MaterialDisposition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowMaterialDispositionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowMaterialDisposition_Payload(param: RandomLibI) extends MJen[Factory_Flow.MaterialDisposition_Payload] {
  override def generate(f: Factory_Flow.MaterialDisposition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowMaterialDisposition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowMaterialFact(param: RandomLibI) extends MJen[Factory_Flow.MaterialFact] {
  override def generate(f: Factory_Flow.MaterialFact => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowMaterialFact())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowMaterialFact_Payload(param: RandomLibI) extends MJen[Factory_Flow.MaterialFact_Payload] {
  override def generate(f: Factory_Flow.MaterialFact_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowMaterialFact_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowMaterialHandoffObservation(param: RandomLibI) extends MJen[Factory_Flow.MaterialHandoffObservation] {
  override def generate(f: Factory_Flow.MaterialHandoffObservation => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowMaterialHandoffObservation())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowMaterialHandoffObservation_Payload(param: RandomLibI) extends MJen[Factory_Flow.MaterialHandoffObservation_Payload] {
  override def generate(f: Factory_Flow.MaterialHandoffObservation_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowMaterialHandoffObservation_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowOutcomeFact(param: RandomLibI) extends MJen[Factory_Flow.OutcomeFact] {
  override def generate(f: Factory_Flow.OutcomeFact => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowOutcomeFact())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowOutcomeFact_Payload(param: RandomLibI) extends MJen[Factory_Flow.OutcomeFact_Payload] {
  override def generate(f: Factory_Flow.OutcomeFact_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowOutcomeFact_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowPresentedWorkRequest(param: RandomLibI) extends MJen[Factory_Flow.PresentedWorkRequest] {
  override def generate(f: Factory_Flow.PresentedWorkRequest => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowPresentedWorkRequest())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowPresentedWorkRequest_Payload(param: RandomLibI) extends MJen[Factory_Flow.PresentedWorkRequest_Payload] {
  override def generate(f: Factory_Flow.PresentedWorkRequest_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowPresentedWorkRequest_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowProcessEventType(param: RandomLibI) extends MJen[Factory_Flow.ProcessEvent.Type] {
  override def generate(f: Factory_Flow.ProcessEvent.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowProcessEventType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowProcessEvent_Payload(param: RandomLibI) extends MJen[Factory_Flow.ProcessEvent_Payload] {
  override def generate(f: Factory_Flow.ProcessEvent_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowProcessEvent_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container(param: RandomLibI) extends MJen[Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container] {
  override def generate(f: Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_P(param: RandomLibI) extends MJen[Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_P] {
  override def generate(f: Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PS(param: RandomLibI) extends MJen[Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PS] {
  override def generate(f: Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container(param: RandomLibI) extends MJen[Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container] {
  override def generate(f: Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_P(param: RandomLibI) extends MJen[Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_P] {
  override def generate(f: Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PS(param: RandomLibI) extends MJen[Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PS] {
  override def generate(f: Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowProcessResultObservation(param: RandomLibI) extends MJen[Factory_Flow.ProcessResultObservation] {
  override def generate(f: Factory_Flow.ProcessResultObservation => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowProcessResultObservation())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowProcessResultObservation_Payload(param: RandomLibI) extends MJen[Factory_Flow.ProcessResultObservation_Payload] {
  override def generate(f: Factory_Flow.ProcessResultObservation_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowProcessResultObservation_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowProductKindType(param: RandomLibI) extends MJen[Factory_Flow.ProductKind.Type] {
  override def generate(f: Factory_Flow.ProductKind.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowProductKindType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowProductKind_Payload(param: RandomLibI) extends MJen[Factory_Flow.ProductKind_Payload] {
  override def generate(f: Factory_Flow.ProductKind_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowProductKind_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowProductionFlowStatusType(param: RandomLibI) extends MJen[Factory_Flow.ProductionFlowStatus.Type] {
  override def generate(f: Factory_Flow.ProductionFlowStatus.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowProductionFlowStatusType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowProductionFlowStatus_Payload(param: RandomLibI) extends MJen[Factory_Flow.ProductionFlowStatus_Payload] {
  override def generate(f: Factory_Flow.ProductionFlowStatus_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowProductionFlowStatus_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowProductionOutcome(param: RandomLibI) extends MJen[Factory_Flow.ProductionOutcome] {
  override def generate(f: Factory_Flow.ProductionOutcome => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowProductionOutcome())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowProductionOutcome_Payload(param: RandomLibI) extends MJen[Factory_Flow.ProductionOutcome_Payload] {
  override def generate(f: Factory_Flow.ProductionOutcome_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowProductionOutcome_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container(param: RandomLibI) extends MJen[Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container] {
  override def generate(f: Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_P(param: RandomLibI) extends MJen[Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_P] {
  override def generate(f: Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PS(param: RandomLibI) extends MJen[Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PS] {
  override def generate(f: Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container(param: RandomLibI) extends MJen[Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container] {
  override def generate(f: Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_P(param: RandomLibI) extends MJen[Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_P] {
  override def generate(f: Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PS(param: RandomLibI) extends MJen[Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PS] {
  override def generate(f: Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowProductionResultType(param: RandomLibI) extends MJen[Factory_Flow.ProductionResult.Type] {
  override def generate(f: Factory_Flow.ProductionResult.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowProductionResultType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowProductionResult_Payload(param: RandomLibI) extends MJen[Factory_Flow.ProductionResult_Payload] {
  override def generate(f: Factory_Flow.ProductionResult_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowProductionResult_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container(param: RandomLibI) extends MJen[Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container] {
  override def generate(f: Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_P(param: RandomLibI) extends MJen[Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_P] {
  override def generate(f: Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PS(param: RandomLibI) extends MJen[Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PS] {
  override def generate(f: Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container(param: RandomLibI) extends MJen[Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container] {
  override def generate(f: Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_P(param: RandomLibI) extends MJen[Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_P] {
  override def generate(f: Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PS(param: RandomLibI) extends MJen[Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PS] {
  override def generate(f: Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowProtectionContext(param: RandomLibI) extends MJen[Factory_Flow.ProtectionContext] {
  override def generate(f: Factory_Flow.ProtectionContext => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowProtectionContext())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowProtectionContext_Payload(param: RandomLibI) extends MJen[Factory_Flow.ProtectionContext_Payload] {
  override def generate(f: Factory_Flow.ProtectionContext_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowProtectionContext_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowRequestPresenceType(param: RandomLibI) extends MJen[Factory_Flow.RequestPresence.Type] {
  override def generate(f: Factory_Flow.RequestPresence.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowRequestPresenceType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowRequestPresence_Payload(param: RandomLibI) extends MJen[Factory_Flow.RequestPresence_Payload] {
  override def generate(f: Factory_Flow.RequestPresence_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowRequestPresence_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowStepDispositionType(param: RandomLibI) extends MJen[Factory_Flow.StepDisposition.Type] {
  override def generate(f: Factory_Flow.StepDisposition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowStepDispositionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowStepDisposition_Payload(param: RandomLibI) extends MJen[Factory_Flow.StepDisposition_Payload] {
  override def generate(f: Factory_Flow.StepDisposition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowStepDisposition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowStepReadinessObservation(param: RandomLibI) extends MJen[Factory_Flow.StepReadinessObservation] {
  override def generate(f: Factory_Flow.StepReadinessObservation => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowStepReadinessObservation())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowStepReadinessObservation_Payload(param: RandomLibI) extends MJen[Factory_Flow.StepReadinessObservation_Payload] {
  override def generate(f: Factory_Flow.StepReadinessObservation_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowStepReadinessObservation_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowTargetQualificationType(param: RandomLibI) extends MJen[Factory_Flow.TargetQualification.Type] {
  override def generate(f: Factory_Flow.TargetQualification.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowTargetQualificationType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowTargetQualification_Payload(param: RandomLibI) extends MJen[Factory_Flow.TargetQualification_Payload] {
  override def generate(f: Factory_Flow.TargetQualification_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowTargetQualification_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container(param: RandomLibI) extends MJen[Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container] {
  override def generate(f: Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_P(param: RandomLibI) extends MJen[Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_P] {
  override def generate(f: Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PS(param: RandomLibI) extends MJen[Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PS] {
  override def generate(f: Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container(param: RandomLibI) extends MJen[Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container] {
  override def generate(f: Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_P(param: RandomLibI) extends MJen[Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_P] {
  override def generate(f: Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PS(param: RandomLibI) extends MJen[Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PS] {
  override def generate(f: Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowValidityType(param: RandomLibI) extends MJen[Factory_Flow.Validity.Type] {
  override def generate(f: Factory_Flow.Validity.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowValidityType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowValidity_Payload(param: RandomLibI) extends MJen[Factory_Flow.Validity_Payload] {
  override def generate(f: Factory_Flow.Validity_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowValidity_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowWorkIdType(param: RandomLibI) extends MJen[Factory_Flow.WorkId.Type] {
  override def generate(f: Factory_Flow.WorkId.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowWorkIdType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowWorkId_Payload(param: RandomLibI) extends MJen[Factory_Flow.WorkId_Payload] {
  override def generate(f: Factory_Flow.WorkId_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowWorkId_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container(param: RandomLibI) extends MJen[Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container] {
  override def generate(f: Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_P(param: RandomLibI) extends MJen[Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_P] {
  override def generate(f: Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PS(param: RandomLibI) extends MJen[Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PS] {
  override def generate(f: Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container(param: RandomLibI) extends MJen[Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container] {
  override def generate(f: Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_P(param: RandomLibI) extends MJen[Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_P] {
  override def generate(f: Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Factory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PS(param: RandomLibI) extends MJen[Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PS] {
  override def generate(f: Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PS())

      if (!continue) {
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


