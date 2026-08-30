// #Sireum

package scp_candidate

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

Mission_Invalidity_Facts.scala

Threat_Invalidity.scala

Resource_Invalidity.scala

Mining_Recovery_Facts.scala

Defense_Facts.scala

Mission_Facts.scala

Arrival_Fact.scala

Phase_Context.scala

Fault_Fact.scala

Raw_Threat_Observation.scala

Threat_State_Input.scala

Qualified_Threat.scala

Threat_Publication_Facts.scala

Raw_Resource_Observation.scala

Resource_Publication_Facts.scala

Raw_Mission_Observation.scala

Mission_Proposal.scala

Response_Proposal.scala

Phase_State_Input.scala

Atomic_Supervisor_Result.scala

Published_Supervisor_Result.scala

Base_Types.scala

Fault_Assessment_supervisor_fa_Containers.scala

Threat_Qualification_supervisor_tq_Containers.scala

Resource_Qualification_supervisor_rq_Containers.scala

Personnel_Mission_Qualification_supervisor_pq_Containers.scala

Mission_Recovery_Decision_supervisor_mr_Containers.scala

Threat_Retreat_Decision_supervisor_tr_Containers.scala

Priority_Phase_Arbitration_supervisor_arb_Containers.scala

Atomic_Publication_supervisor_ap_Containers.scala

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

@record class Gen_Mining_Threat_Retreat_SupervisorArrival_Fact(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Arrival_Fact] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Arrival_Fact => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorArrival_Fact())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorArrival_Fact_Payload(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Arrival_Fact_Payload] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Arrival_Fact_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorArrival_Fact_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PreState_Container] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_P(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PreState_Container_P] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_PS(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PreState_Container_PS] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PostState_Container] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_P(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PostState_Container_P] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_PS(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PostState_Container_PS] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorAtomic_Supervisor_Result(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Atomic_Supervisor_Result] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Atomic_Supervisor_Result => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorAtomic_Supervisor_Result())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorAtomic_Supervisor_Result_Payload(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Atomic_Supervisor_Result_Payload] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Atomic_Supervisor_Result_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorAtomic_Supervisor_Result_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorDefense_Facts(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Defense_Facts] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Defense_Facts => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorDefense_Facts())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorDefense_Facts_Payload(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Defense_Facts_Payload] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Defense_Facts_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorDefense_Facts_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PreState_Container] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_P(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PreState_Container_P] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_PS(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PreState_Container_PS] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PostState_Container] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_P(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PostState_Container_P] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_PS(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PostState_Container_PS] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorFault_Fact(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Fault_Fact] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Fault_Fact => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorFault_Fact())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorFault_Fact_Payload(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Fault_Fact_Payload] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Fault_Fact_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorFault_Fact_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorMining_Recovery_Facts(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Mining_Recovery_Facts] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Mining_Recovery_Facts => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorMining_Recovery_Facts())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorMining_Recovery_Facts_Payload(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Mining_Recovery_Facts_Payload] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Mining_Recovery_Facts_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorMining_Recovery_Facts_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorMission_Facts(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Mission_Facts] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Mission_Facts => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorMission_Facts())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorMission_Facts_Payload(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Mission_Facts_Payload] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Mission_Facts_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorMission_Facts_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorMission_Invalidity_Facts(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Mission_Invalidity_Facts] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Mission_Invalidity_Facts => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorMission_Invalidity_Facts())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorMission_Invalidity_Facts_Payload(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Mission_Invalidity_Facts_Payload] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Mission_Invalidity_Facts_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorMission_Invalidity_Facts_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorMission_Proposal(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Mission_Proposal] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Mission_Proposal => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorMission_Proposal())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorMission_Proposal_Payload(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Mission_Proposal_Payload] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Mission_Proposal_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorMission_Proposal_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PreState_Container] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_P(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PreState_Container_P] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_PS(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PreState_Container_PS] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PostState_Container] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_P(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PostState_Container_P] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_PS(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PostState_Container_PS] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PreState_Container] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_P(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PreState_Container_P] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_PS(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PreState_Container_PS] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PostState_Container] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_P(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PostState_Container_P] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_PS(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PostState_Container_PS] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorPhase_Context(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Phase_Context] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Phase_Context => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorPhase_Context())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorPhase_Context_Payload(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Phase_Context_Payload] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Phase_Context_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorPhase_Context_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorPhase_State_Input(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Phase_State_Input] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Phase_State_Input => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorPhase_State_Input())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorPhase_State_Input_Payload(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Phase_State_Input_Payload] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Phase_State_Input_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorPhase_State_Input_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PreState_Container] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_P(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PreState_Container_P] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_PS(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PreState_Container_PS] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PostState_Container] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_P(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PostState_Container_P] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_PS(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PostState_Container_PS] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorPublished_Supervisor_Result(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Published_Supervisor_Result] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Published_Supervisor_Result => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorPublished_Supervisor_Result())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorPublished_Supervisor_Result_Payload(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Published_Supervisor_Result_Payload] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Published_Supervisor_Result_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorPublished_Supervisor_Result_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorQualified_Threat(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Qualified_Threat] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Qualified_Threat => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorQualified_Threat())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorQualified_Threat_Payload(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Qualified_Threat_Payload] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Qualified_Threat_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorQualified_Threat_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorRaw_Mission_Observation(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Raw_Mission_Observation] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Raw_Mission_Observation => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorRaw_Mission_Observation())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorRaw_Mission_Observation_Payload(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Raw_Mission_Observation_Payload] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Raw_Mission_Observation_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorRaw_Mission_Observation_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorRaw_Resource_Observation(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Raw_Resource_Observation] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Raw_Resource_Observation => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorRaw_Resource_Observation())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorRaw_Resource_Observation_Payload(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Raw_Resource_Observation_Payload] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Raw_Resource_Observation_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorRaw_Resource_Observation_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorRaw_Threat_Observation(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Raw_Threat_Observation] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Raw_Threat_Observation => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorRaw_Threat_Observation())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorRaw_Threat_Observation_Payload(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Raw_Threat_Observation_Payload] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Raw_Threat_Observation_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorRaw_Threat_Observation_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorResource_Invalidity(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Resource_Invalidity] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Resource_Invalidity => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorResource_Invalidity())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorResource_Invalidity_Payload(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Resource_Invalidity_Payload] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Resource_Invalidity_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorResource_Invalidity_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorResource_Publication_Facts(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Resource_Publication_Facts] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Resource_Publication_Facts => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorResource_Publication_Facts())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorResource_Publication_Facts_Payload(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Resource_Publication_Facts_Payload] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Resource_Publication_Facts_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorResource_Publication_Facts_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PreState_Container] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_P(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PreState_Container_P] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_PS(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PreState_Container_PS] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PostState_Container] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_P(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PostState_Container_P] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_PS(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PostState_Container_PS] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorResponse_Proposal(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Response_Proposal] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Response_Proposal => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorResponse_Proposal())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorResponse_Proposal_Payload(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Response_Proposal_Payload] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Response_Proposal_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorResponse_Proposal_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorThreat_Invalidity(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Threat_Invalidity] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Threat_Invalidity => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorThreat_Invalidity())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorThreat_Invalidity_Payload(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Threat_Invalidity_Payload] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Threat_Invalidity_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorThreat_Invalidity_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorThreat_Publication_Facts(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Threat_Publication_Facts] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Threat_Publication_Facts => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorThreat_Publication_Facts())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorThreat_Publication_Facts_Payload(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Threat_Publication_Facts_Payload] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Threat_Publication_Facts_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorThreat_Publication_Facts_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PreState_Container] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_P(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PreState_Container_P] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_PS(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PreState_Container_PS] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PostState_Container] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_P(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PostState_Container_P] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_PS(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PostState_Container_PS] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PreState_Container] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_P(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PreState_Container_P] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_PS(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PreState_Container_PS] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PostState_Container] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_P(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PostState_Container_P] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_PS(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PostState_Container_PS] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorThreat_State_Input(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Threat_State_Input] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Threat_State_Input => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorThreat_State_Input())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorThreat_State_Input_Payload(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Threat_State_Input_Payload] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Threat_State_Input_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorThreat_State_Input_Payload())

      if (!continue) {
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


