// #Sireum

package windshield_defrost_request_supervisor

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

DefrostSelection.scala

RequestValidity.scala

RequestIntent.scala

GlazingCondition.scala

GlazingValidity.scala

VisibilityAssessment.scala

ElectricalInterfaceStatus.scala

DefrostLoadAllowance.scala

DefrostEligibility.scala

DefrostEnableCommand.scala

PolicyDisposition.scala

DriverDefrostStatus.scala

RequestMemory.scala

Base_Types.scala

RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_Containers.scala

GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_Containers.scala

ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_Containers.scala

DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_Containers.scala

DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_Containers.scala

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

@record class Gen_Windshield_Defrost_Request_SupervisorDefrostEligibilityType(param: RandomLibI) extends MJen[Windshield_Defrost_Request_Supervisor.DefrostEligibility.Type] {
  override def generate(f: Windshield_Defrost_Request_Supervisor.DefrostEligibility.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextWindshield_Defrost_Request_SupervisorDefrostEligibilityType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Windshield_Defrost_Request_SupervisorDefrostEligibility_Payload(param: RandomLibI) extends MJen[Windshield_Defrost_Request_Supervisor.DefrostEligibility_Payload] {
  override def generate(f: Windshield_Defrost_Request_Supervisor.DefrostEligibility_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextWindshield_Defrost_Request_SupervisorDefrostEligibility_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Windshield_Defrost_Request_SupervisorDefrostEnableCommandType(param: RandomLibI) extends MJen[Windshield_Defrost_Request_Supervisor.DefrostEnableCommand.Type] {
  override def generate(f: Windshield_Defrost_Request_Supervisor.DefrostEnableCommand.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextWindshield_Defrost_Request_SupervisorDefrostEnableCommandType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Windshield_Defrost_Request_SupervisorDefrostEnableCommand_Payload(param: RandomLibI) extends MJen[Windshield_Defrost_Request_Supervisor.DefrostEnableCommand_Payload] {
  override def generate(f: Windshield_Defrost_Request_Supervisor.DefrostEnableCommand_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextWindshield_Defrost_Request_SupervisorDefrostEnableCommand_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Windshield_Defrost_Request_SupervisorDefrostLoadAllowanceType(param: RandomLibI) extends MJen[Windshield_Defrost_Request_Supervisor.DefrostLoadAllowance.Type] {
  override def generate(f: Windshield_Defrost_Request_Supervisor.DefrostLoadAllowance.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextWindshield_Defrost_Request_SupervisorDefrostLoadAllowanceType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Windshield_Defrost_Request_SupervisorDefrostLoadAllowance_Payload(param: RandomLibI) extends MJen[Windshield_Defrost_Request_Supervisor.DefrostLoadAllowance_Payload] {
  override def generate(f: Windshield_Defrost_Request_Supervisor.DefrostLoadAllowance_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextWindshield_Defrost_Request_SupervisorDefrostLoadAllowance_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Windshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container(param: RandomLibI) extends MJen[Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container] {
  override def generate(f: Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Windshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_P(param: RandomLibI) extends MJen[Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_P] {
  override def generate(f: Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Windshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PS(param: RandomLibI) extends MJen[Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PS] {
  override def generate(f: Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Windshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container(param: RandomLibI) extends MJen[Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container] {
  override def generate(f: Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Windshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_P(param: RandomLibI) extends MJen[Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_P] {
  override def generate(f: Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Windshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PS(param: RandomLibI) extends MJen[Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PS] {
  override def generate(f: Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Windshield_Defrost_Request_SupervisorDefrostSelectionType(param: RandomLibI) extends MJen[Windshield_Defrost_Request_Supervisor.DefrostSelection.Type] {
  override def generate(f: Windshield_Defrost_Request_Supervisor.DefrostSelection.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextWindshield_Defrost_Request_SupervisorDefrostSelectionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Windshield_Defrost_Request_SupervisorDefrostSelection_Payload(param: RandomLibI) extends MJen[Windshield_Defrost_Request_Supervisor.DefrostSelection_Payload] {
  override def generate(f: Windshield_Defrost_Request_Supervisor.DefrostSelection_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextWindshield_Defrost_Request_SupervisorDefrostSelection_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Windshield_Defrost_Request_SupervisorDriverDefrostStatusType(param: RandomLibI) extends MJen[Windshield_Defrost_Request_Supervisor.DriverDefrostStatus.Type] {
  override def generate(f: Windshield_Defrost_Request_Supervisor.DriverDefrostStatus.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextWindshield_Defrost_Request_SupervisorDriverDefrostStatusType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Windshield_Defrost_Request_SupervisorDriverDefrostStatus_Payload(param: RandomLibI) extends MJen[Windshield_Defrost_Request_Supervisor.DriverDefrostStatus_Payload] {
  override def generate(f: Windshield_Defrost_Request_Supervisor.DriverDefrostStatus_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextWindshield_Defrost_Request_SupervisorDriverDefrostStatus_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Windshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container(param: RandomLibI) extends MJen[Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container] {
  override def generate(f: Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Windshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_P(param: RandomLibI) extends MJen[Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_P] {
  override def generate(f: Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Windshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PS(param: RandomLibI) extends MJen[Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PS] {
  override def generate(f: Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Windshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container(param: RandomLibI) extends MJen[Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container] {
  override def generate(f: Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Windshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_P(param: RandomLibI) extends MJen[Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_P] {
  override def generate(f: Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Windshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PS(param: RandomLibI) extends MJen[Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PS] {
  override def generate(f: Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Windshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container(param: RandomLibI) extends MJen[Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container] {
  override def generate(f: Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Windshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_P(param: RandomLibI) extends MJen[Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_P] {
  override def generate(f: Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Windshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PS(param: RandomLibI) extends MJen[Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PS] {
  override def generate(f: Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Windshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container(param: RandomLibI) extends MJen[Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container] {
  override def generate(f: Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Windshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_P(param: RandomLibI) extends MJen[Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_P] {
  override def generate(f: Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Windshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PS(param: RandomLibI) extends MJen[Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PS] {
  override def generate(f: Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Windshield_Defrost_Request_SupervisorElectricalInterfaceStatusType(param: RandomLibI) extends MJen[Windshield_Defrost_Request_Supervisor.ElectricalInterfaceStatus.Type] {
  override def generate(f: Windshield_Defrost_Request_Supervisor.ElectricalInterfaceStatus.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextWindshield_Defrost_Request_SupervisorElectricalInterfaceStatusType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Windshield_Defrost_Request_SupervisorElectricalInterfaceStatus_Payload(param: RandomLibI) extends MJen[Windshield_Defrost_Request_Supervisor.ElectricalInterfaceStatus_Payload] {
  override def generate(f: Windshield_Defrost_Request_Supervisor.ElectricalInterfaceStatus_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextWindshield_Defrost_Request_SupervisorElectricalInterfaceStatus_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Windshield_Defrost_Request_SupervisorGlazingConditionType(param: RandomLibI) extends MJen[Windshield_Defrost_Request_Supervisor.GlazingCondition.Type] {
  override def generate(f: Windshield_Defrost_Request_Supervisor.GlazingCondition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextWindshield_Defrost_Request_SupervisorGlazingConditionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Windshield_Defrost_Request_SupervisorGlazingCondition_Payload(param: RandomLibI) extends MJen[Windshield_Defrost_Request_Supervisor.GlazingCondition_Payload] {
  override def generate(f: Windshield_Defrost_Request_Supervisor.GlazingCondition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextWindshield_Defrost_Request_SupervisorGlazingCondition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Windshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container(param: RandomLibI) extends MJen[Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container] {
  override def generate(f: Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Windshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_P(param: RandomLibI) extends MJen[Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_P] {
  override def generate(f: Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Windshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PS(param: RandomLibI) extends MJen[Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PS] {
  override def generate(f: Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Windshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container(param: RandomLibI) extends MJen[Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container] {
  override def generate(f: Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Windshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_P(param: RandomLibI) extends MJen[Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_P] {
  override def generate(f: Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Windshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PS(param: RandomLibI) extends MJen[Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PS] {
  override def generate(f: Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Windshield_Defrost_Request_SupervisorGlazingValidityType(param: RandomLibI) extends MJen[Windshield_Defrost_Request_Supervisor.GlazingValidity.Type] {
  override def generate(f: Windshield_Defrost_Request_Supervisor.GlazingValidity.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextWindshield_Defrost_Request_SupervisorGlazingValidityType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Windshield_Defrost_Request_SupervisorGlazingValidity_Payload(param: RandomLibI) extends MJen[Windshield_Defrost_Request_Supervisor.GlazingValidity_Payload] {
  override def generate(f: Windshield_Defrost_Request_Supervisor.GlazingValidity_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextWindshield_Defrost_Request_SupervisorGlazingValidity_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Windshield_Defrost_Request_SupervisorPolicyDispositionType(param: RandomLibI) extends MJen[Windshield_Defrost_Request_Supervisor.PolicyDisposition.Type] {
  override def generate(f: Windshield_Defrost_Request_Supervisor.PolicyDisposition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextWindshield_Defrost_Request_SupervisorPolicyDispositionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Windshield_Defrost_Request_SupervisorPolicyDisposition_Payload(param: RandomLibI) extends MJen[Windshield_Defrost_Request_Supervisor.PolicyDisposition_Payload] {
  override def generate(f: Windshield_Defrost_Request_Supervisor.PolicyDisposition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextWindshield_Defrost_Request_SupervisorPolicyDisposition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Windshield_Defrost_Request_SupervisorRequestIntentType(param: RandomLibI) extends MJen[Windshield_Defrost_Request_Supervisor.RequestIntent.Type] {
  override def generate(f: Windshield_Defrost_Request_Supervisor.RequestIntent.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextWindshield_Defrost_Request_SupervisorRequestIntentType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Windshield_Defrost_Request_SupervisorRequestIntent_Payload(param: RandomLibI) extends MJen[Windshield_Defrost_Request_Supervisor.RequestIntent_Payload] {
  override def generate(f: Windshield_Defrost_Request_Supervisor.RequestIntent_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextWindshield_Defrost_Request_SupervisorRequestIntent_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Windshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container(param: RandomLibI) extends MJen[Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container] {
  override def generate(f: Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Windshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_P(param: RandomLibI) extends MJen[Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_P] {
  override def generate(f: Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Windshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PS(param: RandomLibI) extends MJen[Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PS] {
  override def generate(f: Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Windshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container(param: RandomLibI) extends MJen[Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container] {
  override def generate(f: Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Windshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_P(param: RandomLibI) extends MJen[Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_P] {
  override def generate(f: Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Windshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PS(param: RandomLibI) extends MJen[Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PS] {
  override def generate(f: Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Windshield_Defrost_Request_SupervisorRequestMemoryType(param: RandomLibI) extends MJen[Windshield_Defrost_Request_Supervisor.RequestMemory.Type] {
  override def generate(f: Windshield_Defrost_Request_Supervisor.RequestMemory.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextWindshield_Defrost_Request_SupervisorRequestMemoryType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Windshield_Defrost_Request_SupervisorRequestMemory_Payload(param: RandomLibI) extends MJen[Windshield_Defrost_Request_Supervisor.RequestMemory_Payload] {
  override def generate(f: Windshield_Defrost_Request_Supervisor.RequestMemory_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextWindshield_Defrost_Request_SupervisorRequestMemory_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Windshield_Defrost_Request_SupervisorRequestValidityType(param: RandomLibI) extends MJen[Windshield_Defrost_Request_Supervisor.RequestValidity.Type] {
  override def generate(f: Windshield_Defrost_Request_Supervisor.RequestValidity.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextWindshield_Defrost_Request_SupervisorRequestValidityType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Windshield_Defrost_Request_SupervisorRequestValidity_Payload(param: RandomLibI) extends MJen[Windshield_Defrost_Request_Supervisor.RequestValidity_Payload] {
  override def generate(f: Windshield_Defrost_Request_Supervisor.RequestValidity_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextWindshield_Defrost_Request_SupervisorRequestValidity_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Windshield_Defrost_Request_SupervisorVisibilityAssessmentType(param: RandomLibI) extends MJen[Windshield_Defrost_Request_Supervisor.VisibilityAssessment.Type] {
  override def generate(f: Windshield_Defrost_Request_Supervisor.VisibilityAssessment.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextWindshield_Defrost_Request_SupervisorVisibilityAssessmentType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Windshield_Defrost_Request_SupervisorVisibilityAssessment_Payload(param: RandomLibI) extends MJen[Windshield_Defrost_Request_Supervisor.VisibilityAssessment_Payload] {
  override def generate(f: Windshield_Defrost_Request_Supervisor.VisibilityAssessment_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextWindshield_Defrost_Request_SupervisorVisibilityAssessment_Payload())

      if (!continue) {
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


