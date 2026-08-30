// #Sireum

package mining_threat_retreat_supervisor

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

Threat_Value.scala

Threat_Status.scala

Cargo_Band.scala

Cargo_Status.scala

Capacitor_Band.scala

Capacitor_Status.scala

Operator_Request.scala

Request_Status.scala

Mining_Availability.scala

Mining_Availability_Status.scala

Defense_Availability.scala

Defense_Availability_Status.scala

Retreat_Availability.scala

Retreat_Availability_Status.scala

Service_Progress.scala

Service_Progress_Status.scala

Mining_Command.scala

Defense_Command.scala

Movement_Service_Command.scala

Operational_Phase.scala

Input_Fault.scala

Threat_Observation.scala

Cargo_Observation.scala

Capacitor_Observation.scala

Request_Observation.scala

Mining_Availability_Observation.scala

Defense_Availability_Observation.scala

Retreat_Availability_Observation.scala

Service_Progress_Observation.scala

Base_Types.scala

Threat_Qualification_supervisor_process_threat_qualification_Containers.scala

Resource_Qualification_supervisor_process_resource_qualification_Containers.scala

Request_Availability_Qualification_supervisor_process_request_availability_qualification_Containers.scala

Principal_Decision_Owner_supervisor_process_principal_decision_owner_Containers.scala

Mining_Command_Delivery_supervisor_process_mining_command_delivery_Containers.scala

Defense_Command_Delivery_supervisor_process_defense_command_delivery_Containers.scala

Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_Containers.scala

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

@record class Gen_Mining_Threat_Retreat_SupervisorCapacitor_BandType(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Capacitor_Band.Type] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Capacitor_Band.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorCapacitor_BandType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorCapacitor_Band_Payload(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Capacitor_Band_Payload] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Capacitor_Band_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorCapacitor_Band_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorCapacitor_Observation(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Capacitor_Observation] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Capacitor_Observation => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorCapacitor_Observation())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorCapacitor_Observation_Payload(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Capacitor_Observation_Payload] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Capacitor_Observation_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorCapacitor_Observation_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorCapacitor_StatusType(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Capacitor_Status.Type] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Capacitor_Status.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorCapacitor_StatusType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorCapacitor_Status_Payload(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Capacitor_Status_Payload] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Capacitor_Status_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorCapacitor_Status_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorCargo_BandType(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Cargo_Band.Type] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Cargo_Band.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorCargo_BandType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorCargo_Band_Payload(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Cargo_Band_Payload] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Cargo_Band_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorCargo_Band_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorCargo_Observation(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Cargo_Observation] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Cargo_Observation => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorCargo_Observation())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorCargo_Observation_Payload(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Cargo_Observation_Payload] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Cargo_Observation_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorCargo_Observation_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorCargo_StatusType(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Cargo_Status.Type] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Cargo_Status.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorCargo_StatusType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorCargo_Status_Payload(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Cargo_Status_Payload] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Cargo_Status_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorCargo_Status_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorDefense_AvailabilityType(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Defense_Availability.Type] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Defense_Availability.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorDefense_AvailabilityType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorDefense_Availability_Payload(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Defense_Availability_Payload] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Defense_Availability_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorDefense_Availability_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorDefense_Availability_Observation(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Defense_Availability_Observation] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Defense_Availability_Observation => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorDefense_Availability_Observation())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorDefense_Availability_Observation_Payload(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Defense_Availability_Observation_Payload] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Defense_Availability_Observation_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorDefense_Availability_Observation_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorDefense_Availability_StatusType(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Defense_Availability_Status.Type] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Defense_Availability_Status.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorDefense_Availability_StatusType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorDefense_Availability_Status_Payload(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Defense_Availability_Status_Payload] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Defense_Availability_Status_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorDefense_Availability_Status_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorDefense_CommandType(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Defense_Command.Type] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Defense_Command.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorDefense_CommandType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorDefense_Command_Payload(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Defense_Command_Payload] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Defense_Command_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorDefense_Command_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_P(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_P] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PS(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PS] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_P(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_P] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PS(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PS] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorInput_FaultType(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Input_Fault.Type] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Input_Fault.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorInput_FaultType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorInput_Fault_Payload(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Input_Fault_Payload] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Input_Fault_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorInput_Fault_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorMining_AvailabilityType(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Mining_Availability.Type] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Mining_Availability.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorMining_AvailabilityType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorMining_Availability_Payload(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Mining_Availability_Payload] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Mining_Availability_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorMining_Availability_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorMining_Availability_Observation(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Mining_Availability_Observation] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Mining_Availability_Observation => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorMining_Availability_Observation())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorMining_Availability_Observation_Payload(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Mining_Availability_Observation_Payload] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Mining_Availability_Observation_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorMining_Availability_Observation_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorMining_Availability_StatusType(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Mining_Availability_Status.Type] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Mining_Availability_Status.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorMining_Availability_StatusType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorMining_Availability_Status_Payload(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Mining_Availability_Status_Payload] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Mining_Availability_Status_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorMining_Availability_Status_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorMining_CommandType(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Mining_Command.Type] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Mining_Command.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorMining_CommandType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorMining_Command_Payload(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Mining_Command_Payload] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Mining_Command_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorMining_Command_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_P(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_P] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PS(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PS] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_P(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_P] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PS(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PS] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorMovement_Service_CommandType(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Movement_Service_Command.Type] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Movement_Service_Command.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorMovement_Service_CommandType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorMovement_Service_Command_Payload(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Payload] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorMovement_Service_Command_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_P(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_P] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PS(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PS] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_P(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_P] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PS(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PS] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorOperational_PhaseType(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Operational_Phase.Type] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Operational_Phase.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorOperational_PhaseType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorOperational_Phase_Payload(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Operational_Phase_Payload] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Operational_Phase_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorOperational_Phase_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorOperator_RequestType(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Operator_Request.Type] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Operator_Request.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorOperator_RequestType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorOperator_Request_Payload(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Operator_Request_Payload] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Operator_Request_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorOperator_Request_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_P(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_P] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PS(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PS] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_P(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_P] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PS(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PS] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_P(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_P] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PS(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PS] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_P(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_P] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PS(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PS] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorRequest_Observation(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Request_Observation] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Request_Observation => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorRequest_Observation())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorRequest_Observation_Payload(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Request_Observation_Payload] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Request_Observation_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorRequest_Observation_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorRequest_StatusType(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Request_Status.Type] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Request_Status.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorRequest_StatusType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorRequest_Status_Payload(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Request_Status_Payload] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Request_Status_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorRequest_Status_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PreState_Container] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_P(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PreState_Container_P] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_PS(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PreState_Container_PS] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PostState_Container] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_P(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PostState_Container_P] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_PS(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PostState_Container_PS] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorRetreat_AvailabilityType(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Retreat_Availability.Type] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Retreat_Availability.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorRetreat_AvailabilityType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorRetreat_Availability_Payload(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Retreat_Availability_Payload] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Retreat_Availability_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorRetreat_Availability_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorRetreat_Availability_Observation(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Retreat_Availability_Observation] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Retreat_Availability_Observation => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorRetreat_Availability_Observation())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorRetreat_Availability_Observation_Payload(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Retreat_Availability_Observation_Payload] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Retreat_Availability_Observation_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorRetreat_Availability_Observation_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorRetreat_Availability_StatusType(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Retreat_Availability_Status.Type] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Retreat_Availability_Status.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorRetreat_Availability_StatusType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorRetreat_Availability_Status_Payload(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Retreat_Availability_Status_Payload] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Retreat_Availability_Status_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorRetreat_Availability_Status_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorService_ProgressType(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Service_Progress.Type] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Service_Progress.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorService_ProgressType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorService_Progress_Payload(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Service_Progress_Payload] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Service_Progress_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorService_Progress_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorService_Progress_Observation(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Service_Progress_Observation] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Service_Progress_Observation => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorService_Progress_Observation())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorService_Progress_Observation_Payload(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Service_Progress_Observation_Payload] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Service_Progress_Observation_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorService_Progress_Observation_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorService_Progress_StatusType(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Service_Progress_Status.Type] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Service_Progress_Status.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorService_Progress_StatusType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorService_Progress_Status_Payload(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Service_Progress_Status_Payload] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Service_Progress_Status_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorService_Progress_Status_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorThreat_Observation(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Threat_Observation] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Threat_Observation => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorThreat_Observation())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorThreat_Observation_Payload(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Threat_Observation_Payload] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Threat_Observation_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorThreat_Observation_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_P(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_P] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_P(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_P] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorThreat_StatusType(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Threat_Status.Type] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Threat_Status.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorThreat_StatusType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorThreat_Status_Payload(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Threat_Status_Payload] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Threat_Status_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorThreat_Status_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorThreat_ValueType(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Threat_Value.Type] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Threat_Value.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorThreat_ValueType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Mining_Threat_Retreat_SupervisorThreat_Value_Payload(param: RandomLibI) extends MJen[Mining_Threat_Retreat_Supervisor.Threat_Value_Payload] {
  override def generate(f: Mining_Threat_Retreat_Supervisor.Threat_Value_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextMining_Threat_Retreat_SupervisorThreat_Value_Payload())

      if (!continue) {
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


