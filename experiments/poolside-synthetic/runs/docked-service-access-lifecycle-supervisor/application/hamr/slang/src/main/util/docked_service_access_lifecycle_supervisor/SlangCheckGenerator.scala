// #Sireum

package docked_service_access_lifecycle_supervisor

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

PilotIntent.scala

QualifiedIntent.scala

BerthObservation.scala

ShipCondition.scala

DockReadiness.scala

ServiceSignal.scala

ServiceInterlock.scala

LifecycleState.scala

OperationalAssessment.scala

AdmittedDirective.scala

MovementProposal.scala

AccessProposal.scala

SnapshotLifecycleState.scala

LifecycleResult.scala

MovementDirective.scala

ServiceAccess.scala

PilotLifecycleReport.scala

StationAccessReport.scala

ControlProposal.scala

LifecycleSnapshot.scala

GatedControl.scala

Base_Types.scala

IntentQualifier_supervisorProcess_intentQualifier_Containers.scala

DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_Containers.scala

ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_Containers.scala

LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_Containers.scala

PriorityArbiter_supervisorProcess_priorityArbiter_Containers.scala

LifecycleController_supervisorProcess_lifecycleController_Containers.scala

MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_Containers.scala

LifecycleReporter_supervisorProcess_lifecycleReporter_Containers.scala

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

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorAccessProposalType(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.AccessProposal.Type] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.AccessProposal.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorAccessProposalType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorAccessProposal_Payload(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.AccessProposal_Payload] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.AccessProposal_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorAccessProposal_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorAdmittedDirectiveType(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.AdmittedDirective.Type] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.AdmittedDirective.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorAdmittedDirectiveType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorAdmittedDirective_Payload(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.AdmittedDirective_Payload] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.AdmittedDirective_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorAdmittedDirective_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorBerthObservationType(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.BerthObservation.Type] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.BerthObservation.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorBerthObservationType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorBerthObservation_Payload(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.BerthObservation_Payload] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.BerthObservation_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorBerthObservation_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorControlProposal(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.ControlProposal] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.ControlProposal => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorControlProposal())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorControlProposal_Payload(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.ControlProposal_Payload] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.ControlProposal_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorControlProposal_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorDockReadinessType(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.DockReadiness.Type] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.DockReadiness.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorDockReadinessType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorDockReadiness_Payload(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.DockReadiness_Payload] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.DockReadiness_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorDockReadiness_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_P(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_P] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PS(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PS] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_P(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_P] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PS(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PS] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorGatedControl(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.GatedControl] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.GatedControl => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorGatedControl())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorGatedControl_Payload(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.GatedControl_Payload] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.GatedControl_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorGatedControl_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PreState_Container] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_P(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PreState_Container_P] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PS(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PS] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PostState_Container] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_P(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PostState_Container_P] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PS(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PS] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_P(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_P] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PS(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PS] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_P(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_P] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PS(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PS] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PreState_Container] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_P(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PreState_Container_P] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_PS(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PreState_Container_PS] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PostState_Container] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_P(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PostState_Container_P] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_PS(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PostState_Container_PS] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_P(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_P] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PS(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PS] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_P(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_P] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PS(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PS] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorLifecycleResultType(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.LifecycleResult.Type] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.LifecycleResult.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorLifecycleResultType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorLifecycleResult_Payload(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.LifecycleResult_Payload] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.LifecycleResult_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorLifecycleResult_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorLifecycleSnapshot(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.LifecycleSnapshot] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.LifecycleSnapshot => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorLifecycleSnapshot())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorLifecycleSnapshot_Payload(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.LifecycleSnapshot_Payload] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.LifecycleSnapshot_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorLifecycleSnapshot_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorLifecycleStateType(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.LifecycleState.Type] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.LifecycleState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorLifecycleStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorLifecycleState_Payload(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.LifecycleState_Payload] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.LifecycleState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorLifecycleState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_P(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_P] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PS(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PS] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_P(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_P] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PS(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PS] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorMovementDirectiveType(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.MovementDirective.Type] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.MovementDirective.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorMovementDirectiveType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorMovementDirective_Payload(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.MovementDirective_Payload] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.MovementDirective_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorMovementDirective_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorMovementProposalType(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.MovementProposal.Type] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.MovementProposal.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorMovementProposalType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorMovementProposal_Payload(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.MovementProposal_Payload] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.MovementProposal_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorMovementProposal_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorOperationalAssessmentType(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.OperationalAssessment.Type] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.OperationalAssessment.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorOperationalAssessmentType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorOperationalAssessment_Payload(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.OperationalAssessment_Payload] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.OperationalAssessment_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorOperationalAssessment_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorPilotIntentType(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.PilotIntent.Type] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.PilotIntent.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorPilotIntentType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorPilotIntent_Payload(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.PilotIntent_Payload] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.PilotIntent_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorPilotIntent_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorPilotLifecycleReportType(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.PilotLifecycleReport.Type] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.PilotLifecycleReport.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorPilotLifecycleReportType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorPilotLifecycleReport_Payload(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.PilotLifecycleReport_Payload] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.PilotLifecycleReport_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorPilotLifecycleReport_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorQualifiedIntentType(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.QualifiedIntent.Type] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.QualifiedIntent.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorQualifiedIntentType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorQualifiedIntent_Payload(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.QualifiedIntent_Payload] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.QualifiedIntent_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorQualifiedIntent_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorServiceAccessType(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.ServiceAccess.Type] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.ServiceAccess.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorServiceAccessType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorServiceAccess_Payload(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.ServiceAccess_Payload] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.ServiceAccess_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorServiceAccess_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorServiceInterlockType(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlock.Type] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlock.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorServiceInterlockType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorServiceInterlock_Payload(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlock_Payload] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlock_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorServiceInterlock_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_P(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_P] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PS(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PS] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_P(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_P] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PS(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PS] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorServiceSignalType(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.ServiceSignal.Type] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.ServiceSignal.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorServiceSignalType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorServiceSignal_Payload(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.ServiceSignal_Payload] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.ServiceSignal_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorServiceSignal_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorShipConditionType(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.ShipCondition.Type] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.ShipCondition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorShipConditionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorShipCondition_Payload(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.ShipCondition_Payload] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.ShipCondition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorShipCondition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorSnapshotLifecycleStateType(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.SnapshotLifecycleState.Type] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.SnapshotLifecycleState.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorSnapshotLifecycleStateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorSnapshotLifecycleState_Payload(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.SnapshotLifecycleState_Payload] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.SnapshotLifecycleState_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorSnapshotLifecycleState_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorStationAccessReportType(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.StationAccessReport.Type] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.StationAccessReport.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorStationAccessReportType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Docked_Service_Access_Lifecycle_SupervisorStationAccessReport_Payload(param: RandomLibI) extends MJen[Docked_Service_Access_Lifecycle_Supervisor.StationAccessReport_Payload] {
  override def generate(f: Docked_Service_Access_Lifecycle_Supervisor.StationAccessReport_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextDocked_Service_Access_Lifecycle_SupervisorStationAccessReport_Payload())

      if (!continue) {
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


