// #Sireum

package navigation_obstacle_awareness_use_supervisor

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

NavigationEvidence.scala

EvidenceAssessment.scala

ObstacleEvidence.scala

ObstacleAssessment.scala

NavigationBasis.scala

MotionContext.scala

AwarenessCondition.scala

ConstraintProposal.scala

SupervisionEvent.scala

RecoveryPhase.scala

AcceptedAction.scala

NavigationUseDirective.scala

ObstacleAwarenessNotice.scala

SupervisionStatus.scala

Base_Types.scala

GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_Containers.scala

InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_Containers.scala

BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_Containers.scala

ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_Containers.scala

NavigationBasisOwner_supervisorProcess_navigationBasisOwner_Containers.scala

AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_Containers.scala

ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_Containers.scala

EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_Containers.scala

RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_Containers.scala

SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_Containers.scala

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

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorAcceptedActionType(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction.Type] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorAcceptedActionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorAcceptedAction_Payload(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction_Payload] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorAcceptedAction_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionType(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessCondition.Type] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessCondition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorAwarenessCondition_Payload(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessCondition_Payload] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessCondition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorAwarenessCondition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_P(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_P] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PS(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PS] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_P(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_P] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PS(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PS] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_P(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_P] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PS(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PS] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_P(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_P] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PS(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PS] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorConstraintProposalType(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposal.Type] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposal.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorConstraintProposal_Payload(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposal_Payload] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposal_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposal_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_P(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_P] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PS(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PS] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_P(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_P] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PS(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PS] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_P(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_P] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PS(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PS] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_P(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_P] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PS(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PS] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessmentType(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment.Type] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessmentType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessment_Payload(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment_Payload] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessment_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_P(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_P] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PS(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PS] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_P(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_P] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PS(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PS] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_P(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_P] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PS(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PS] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_P(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_P] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PS(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PS] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorMotionContextType(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.MotionContext.Type] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.MotionContext.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorMotionContextType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorMotionContext_Payload(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.MotionContext_Payload] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.MotionContext_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorMotionContext_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorNavigationBasisType(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasis.Type] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasis.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorNavigationBasis_Payload(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasis_Payload] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasis_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasis_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_P(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_P] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PS(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PS] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_P(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_P] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PS(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PS] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorNavigationEvidenceType(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.NavigationEvidence.Type] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationEvidence.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorNavigationEvidenceType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorNavigationEvidence_Payload(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.NavigationEvidence_Payload] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationEvidence_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorNavigationEvidence_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorNavigationUseDirectiveType(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.NavigationUseDirective.Type] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationUseDirective.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorNavigationUseDirectiveType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorNavigationUseDirective_Payload(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.NavigationUseDirective_Payload] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationUseDirective_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorNavigationUseDirective_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorObstacleAssessmentType(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAssessment.Type] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAssessment.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorObstacleAssessmentType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorObstacleAssessment_Payload(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAssessment_Payload] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAssessment_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorObstacleAssessment_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorObstacleAwarenessNoticeType(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAwarenessNotice.Type] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAwarenessNotice.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorObstacleAwarenessNoticeType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorObstacleAwarenessNotice_Payload(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAwarenessNotice_Payload] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAwarenessNotice_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorObstacleAwarenessNotice_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceType(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidence.Type] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidence.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorObstacleEvidence_Payload(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidence_Payload] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidence_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidence_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_P(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_P] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PS(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PS] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_P(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_P] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PS(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PS] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_P(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_P] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PS(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PS] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_P(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_P] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PS(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PS] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorRecoveryPhaseType(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryPhase.Type] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryPhase.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorRecoveryPhaseType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorRecoveryPhase_Payload(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryPhase_Payload] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryPhase_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorRecoveryPhase_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorSupervisionEventType(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionEvent.Type] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionEvent.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorSupervisionEventType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorSupervisionEvent_Payload(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionEvent_Payload] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionEvent_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorSupervisionEvent_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_P(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_P] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PS(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PS] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_P(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_P] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PS(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PS] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorSupervisionStatusType(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionStatus.Type] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionStatus.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorSupervisionStatusType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Navigation_Obstacle_Awareness_Use_SupervisorSupervisionStatus_Payload(param: RandomLibI) extends MJen[Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionStatus_Payload] {
  override def generate(f: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionStatus_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextNavigation_Obstacle_Awareness_Use_SupervisorSupervisionStatus_Payload())

      if (!continue) {
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


