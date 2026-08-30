// #Sireum
// @formatter:off

// This file is auto-generated from Threat_Value.scala, Threat_Status.scala, Cargo_Band.scala, Cargo_Status.scala, Capacitor_Band.scala, Capacitor_Status.scala, Operator_Request.scala, Request_Status.scala, Mining_Availability.scala, Mining_Availability_Status.scala, Defense_Availability.scala, Defense_Availability_Status.scala, Retreat_Availability.scala, Retreat_Availability_Status.scala, Service_Progress.scala, Service_Progress_Status.scala, Mining_Command.scala, Defense_Command.scala, Movement_Service_Command.scala, Operational_Phase.scala, Input_Fault.scala, Threat_Observation.scala, Cargo_Observation.scala, Capacitor_Observation.scala, Request_Observation.scala, Mining_Availability_Observation.scala, Defense_Availability_Observation.scala, Retreat_Availability_Observation.scala, Service_Progress_Observation.scala, Base_Types.scala, Threat_Qualification_supervisor_process_threat_qualification_Containers.scala, Resource_Qualification_supervisor_process_resource_qualification_Containers.scala, Request_Availability_Qualification_supervisor_process_request_availability_qualification_Containers.scala, Principal_Decision_Owner_supervisor_process_principal_decision_owner_Containers.scala, Mining_Command_Delivery_supervisor_process_mining_command_delivery_Containers.scala, Defense_Command_Delivery_supervisor_process_defense_command_delivery_Containers.scala, Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package scp_candidate

import org.sireum._
import org.sireum.Json.Printer._

object JSON {

  object Printer {

    @pure def printMining_Threat_Retreat_SupervisorThreat_ValueType(o: Mining_Threat_Retreat_Supervisor.Threat_Value.Type): ST = {
      val value: String = o match {
        case Mining_Threat_Retreat_Supervisor.Threat_Value.Clear => "Clear"
        case Mining_Threat_Retreat_Supervisor.Threat_Value.Suspect => "Suspect"
        case Mining_Threat_Retreat_Supervisor.Threat_Value.Hostile => "Hostile"
      }
      return printObject(ISZ(
        ("type", printString("Mining_Threat_Retreat_Supervisor.Threat_Value")),
        ("value", printString(value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorThreat_Value_Payload(o: Mining_Threat_Retreat_Supervisor.Threat_Value_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Threat_Value_Payload""""),
        ("value", printMining_Threat_Retreat_SupervisorThreat_ValueType(o.value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorThreat_StatusType(o: Mining_Threat_Retreat_Supervisor.Threat_Status.Type): ST = {
      val value: String = o match {
        case Mining_Threat_Retreat_Supervisor.Threat_Status.Valid => "Valid"
        case Mining_Threat_Retreat_Supervisor.Threat_Status.Invalid => "Invalid"
      }
      return printObject(ISZ(
        ("type", printString("Mining_Threat_Retreat_Supervisor.Threat_Status")),
        ("value", printString(value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorThreat_Status_Payload(o: Mining_Threat_Retreat_Supervisor.Threat_Status_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Threat_Status_Payload""""),
        ("value", printMining_Threat_Retreat_SupervisorThreat_StatusType(o.value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorCargo_BandType(o: Mining_Threat_Retreat_Supervisor.Cargo_Band.Type): ST = {
      val value: String = o match {
        case Mining_Threat_Retreat_Supervisor.Cargo_Band.Partial => "Partial"
        case Mining_Threat_Retreat_Supervisor.Cargo_Band.Near_Full => "Near_Full"
        case Mining_Threat_Retreat_Supervisor.Cargo_Band.Full => "Full"
      }
      return printObject(ISZ(
        ("type", printString("Mining_Threat_Retreat_Supervisor.Cargo_Band")),
        ("value", printString(value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorCargo_Band_Payload(o: Mining_Threat_Retreat_Supervisor.Cargo_Band_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Cargo_Band_Payload""""),
        ("value", printMining_Threat_Retreat_SupervisorCargo_BandType(o.value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorCargo_StatusType(o: Mining_Threat_Retreat_Supervisor.Cargo_Status.Type): ST = {
      val value: String = o match {
        case Mining_Threat_Retreat_Supervisor.Cargo_Status.Valid => "Valid"
        case Mining_Threat_Retreat_Supervisor.Cargo_Status.Invalid => "Invalid"
      }
      return printObject(ISZ(
        ("type", printString("Mining_Threat_Retreat_Supervisor.Cargo_Status")),
        ("value", printString(value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorCargo_Status_Payload(o: Mining_Threat_Retreat_Supervisor.Cargo_Status_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Cargo_Status_Payload""""),
        ("value", printMining_Threat_Retreat_SupervisorCargo_StatusType(o.value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorCapacitor_BandType(o: Mining_Threat_Retreat_Supervisor.Capacitor_Band.Type): ST = {
      val value: String = o match {
        case Mining_Threat_Retreat_Supervisor.Capacitor_Band.Critical => "Critical"
        case Mining_Threat_Retreat_Supervisor.Capacitor_Band.Reserve => "Reserve"
        case Mining_Threat_Retreat_Supervisor.Capacitor_Band.Ready => "Ready"
      }
      return printObject(ISZ(
        ("type", printString("Mining_Threat_Retreat_Supervisor.Capacitor_Band")),
        ("value", printString(value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorCapacitor_Band_Payload(o: Mining_Threat_Retreat_Supervisor.Capacitor_Band_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Capacitor_Band_Payload""""),
        ("value", printMining_Threat_Retreat_SupervisorCapacitor_BandType(o.value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorCapacitor_StatusType(o: Mining_Threat_Retreat_Supervisor.Capacitor_Status.Type): ST = {
      val value: String = o match {
        case Mining_Threat_Retreat_Supervisor.Capacitor_Status.Valid => "Valid"
        case Mining_Threat_Retreat_Supervisor.Capacitor_Status.Invalid => "Invalid"
      }
      return printObject(ISZ(
        ("type", printString("Mining_Threat_Retreat_Supervisor.Capacitor_Status")),
        ("value", printString(value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorCapacitor_Status_Payload(o: Mining_Threat_Retreat_Supervisor.Capacitor_Status_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Capacitor_Status_Payload""""),
        ("value", printMining_Threat_Retreat_SupervisorCapacitor_StatusType(o.value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorOperator_RequestType(o: Mining_Threat_Retreat_Supervisor.Operator_Request.Type): ST = {
      val value: String = o match {
        case Mining_Threat_Retreat_Supervisor.Operator_Request.Idle => "Idle"
        case Mining_Threat_Retreat_Supervisor.Operator_Request.Mine => "Mine"
        case Mining_Threat_Retreat_Supervisor.Operator_Request.Retreat => "Retreat"
      }
      return printObject(ISZ(
        ("type", printString("Mining_Threat_Retreat_Supervisor.Operator_Request")),
        ("value", printString(value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorOperator_Request_Payload(o: Mining_Threat_Retreat_Supervisor.Operator_Request_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Operator_Request_Payload""""),
        ("value", printMining_Threat_Retreat_SupervisorOperator_RequestType(o.value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorRequest_StatusType(o: Mining_Threat_Retreat_Supervisor.Request_Status.Type): ST = {
      val value: String = o match {
        case Mining_Threat_Retreat_Supervisor.Request_Status.Valid => "Valid"
        case Mining_Threat_Retreat_Supervisor.Request_Status.Invalid => "Invalid"
      }
      return printObject(ISZ(
        ("type", printString("Mining_Threat_Retreat_Supervisor.Request_Status")),
        ("value", printString(value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorRequest_Status_Payload(o: Mining_Threat_Retreat_Supervisor.Request_Status_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Request_Status_Payload""""),
        ("value", printMining_Threat_Retreat_SupervisorRequest_StatusType(o.value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorMining_AvailabilityType(o: Mining_Threat_Retreat_Supervisor.Mining_Availability.Type): ST = {
      val value: String = o match {
        case Mining_Threat_Retreat_Supervisor.Mining_Availability.Available => "Available"
        case Mining_Threat_Retreat_Supervisor.Mining_Availability.Unavailable => "Unavailable"
      }
      return printObject(ISZ(
        ("type", printString("Mining_Threat_Retreat_Supervisor.Mining_Availability")),
        ("value", printString(value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorMining_Availability_Payload(o: Mining_Threat_Retreat_Supervisor.Mining_Availability_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Mining_Availability_Payload""""),
        ("value", printMining_Threat_Retreat_SupervisorMining_AvailabilityType(o.value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorMining_Availability_StatusType(o: Mining_Threat_Retreat_Supervisor.Mining_Availability_Status.Type): ST = {
      val value: String = o match {
        case Mining_Threat_Retreat_Supervisor.Mining_Availability_Status.Valid => "Valid"
        case Mining_Threat_Retreat_Supervisor.Mining_Availability_Status.Invalid => "Invalid"
      }
      return printObject(ISZ(
        ("type", printString("Mining_Threat_Retreat_Supervisor.Mining_Availability_Status")),
        ("value", printString(value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorMining_Availability_Status_Payload(o: Mining_Threat_Retreat_Supervisor.Mining_Availability_Status_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Mining_Availability_Status_Payload""""),
        ("value", printMining_Threat_Retreat_SupervisorMining_Availability_StatusType(o.value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorDefense_AvailabilityType(o: Mining_Threat_Retreat_Supervisor.Defense_Availability.Type): ST = {
      val value: String = o match {
        case Mining_Threat_Retreat_Supervisor.Defense_Availability.Available => "Available"
        case Mining_Threat_Retreat_Supervisor.Defense_Availability.Unavailable => "Unavailable"
      }
      return printObject(ISZ(
        ("type", printString("Mining_Threat_Retreat_Supervisor.Defense_Availability")),
        ("value", printString(value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorDefense_Availability_Payload(o: Mining_Threat_Retreat_Supervisor.Defense_Availability_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Defense_Availability_Payload""""),
        ("value", printMining_Threat_Retreat_SupervisorDefense_AvailabilityType(o.value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorDefense_Availability_StatusType(o: Mining_Threat_Retreat_Supervisor.Defense_Availability_Status.Type): ST = {
      val value: String = o match {
        case Mining_Threat_Retreat_Supervisor.Defense_Availability_Status.Valid => "Valid"
        case Mining_Threat_Retreat_Supervisor.Defense_Availability_Status.Invalid => "Invalid"
      }
      return printObject(ISZ(
        ("type", printString("Mining_Threat_Retreat_Supervisor.Defense_Availability_Status")),
        ("value", printString(value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorDefense_Availability_Status_Payload(o: Mining_Threat_Retreat_Supervisor.Defense_Availability_Status_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Defense_Availability_Status_Payload""""),
        ("value", printMining_Threat_Retreat_SupervisorDefense_Availability_StatusType(o.value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorRetreat_AvailabilityType(o: Mining_Threat_Retreat_Supervisor.Retreat_Availability.Type): ST = {
      val value: String = o match {
        case Mining_Threat_Retreat_Supervisor.Retreat_Availability.Available => "Available"
        case Mining_Threat_Retreat_Supervisor.Retreat_Availability.Unavailable => "Unavailable"
      }
      return printObject(ISZ(
        ("type", printString("Mining_Threat_Retreat_Supervisor.Retreat_Availability")),
        ("value", printString(value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorRetreat_Availability_Payload(o: Mining_Threat_Retreat_Supervisor.Retreat_Availability_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Retreat_Availability_Payload""""),
        ("value", printMining_Threat_Retreat_SupervisorRetreat_AvailabilityType(o.value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorRetreat_Availability_StatusType(o: Mining_Threat_Retreat_Supervisor.Retreat_Availability_Status.Type): ST = {
      val value: String = o match {
        case Mining_Threat_Retreat_Supervisor.Retreat_Availability_Status.Valid => "Valid"
        case Mining_Threat_Retreat_Supervisor.Retreat_Availability_Status.Invalid => "Invalid"
      }
      return printObject(ISZ(
        ("type", printString("Mining_Threat_Retreat_Supervisor.Retreat_Availability_Status")),
        ("value", printString(value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorRetreat_Availability_Status_Payload(o: Mining_Threat_Retreat_Supervisor.Retreat_Availability_Status_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Retreat_Availability_Status_Payload""""),
        ("value", printMining_Threat_Retreat_SupervisorRetreat_Availability_StatusType(o.value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorService_ProgressType(o: Mining_Threat_Retreat_Supervisor.Service_Progress.Type): ST = {
      val value: String = o match {
        case Mining_Threat_Retreat_Supervisor.Service_Progress.Away => "Away"
        case Mining_Threat_Retreat_Supervisor.Service_Progress.At_Station => "At_Station"
        case Mining_Threat_Retreat_Supervisor.Service_Progress.Docked_Loaded => "Docked_Loaded"
        case Mining_Threat_Retreat_Supervisor.Service_Progress.Offload_Confirmed => "Offload_Confirmed"
        case Mining_Threat_Retreat_Supervisor.Service_Progress.Resupply_Confirmed => "Resupply_Confirmed"
      }
      return printObject(ISZ(
        ("type", printString("Mining_Threat_Retreat_Supervisor.Service_Progress")),
        ("value", printString(value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorService_Progress_Payload(o: Mining_Threat_Retreat_Supervisor.Service_Progress_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Service_Progress_Payload""""),
        ("value", printMining_Threat_Retreat_SupervisorService_ProgressType(o.value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorService_Progress_StatusType(o: Mining_Threat_Retreat_Supervisor.Service_Progress_Status.Type): ST = {
      val value: String = o match {
        case Mining_Threat_Retreat_Supervisor.Service_Progress_Status.Valid => "Valid"
        case Mining_Threat_Retreat_Supervisor.Service_Progress_Status.Invalid => "Invalid"
      }
      return printObject(ISZ(
        ("type", printString("Mining_Threat_Retreat_Supervisor.Service_Progress_Status")),
        ("value", printString(value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorService_Progress_Status_Payload(o: Mining_Threat_Retreat_Supervisor.Service_Progress_Status_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Service_Progress_Status_Payload""""),
        ("value", printMining_Threat_Retreat_SupervisorService_Progress_StatusType(o.value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorMining_CommandType(o: Mining_Threat_Retreat_Supervisor.Mining_Command.Type): ST = {
      val value: String = o match {
        case Mining_Threat_Retreat_Supervisor.Mining_Command.Stop => "Stop"
        case Mining_Threat_Retreat_Supervisor.Mining_Command.Mine => "Mine"
      }
      return printObject(ISZ(
        ("type", printString("Mining_Threat_Retreat_Supervisor.Mining_Command")),
        ("value", printString(value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorMining_Command_Payload(o: Mining_Threat_Retreat_Supervisor.Mining_Command_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Mining_Command_Payload""""),
        ("value", printMining_Threat_Retreat_SupervisorMining_CommandType(o.value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorDefense_CommandType(o: Mining_Threat_Retreat_Supervisor.Defense_Command.Type): ST = {
      val value: String = o match {
        case Mining_Threat_Retreat_Supervisor.Defense_Command.Stand_Down => "Stand_Down"
        case Mining_Threat_Retreat_Supervisor.Defense_Command.Engage => "Engage"
      }
      return printObject(ISZ(
        ("type", printString("Mining_Threat_Retreat_Supervisor.Defense_Command")),
        ("value", printString(value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorDefense_Command_Payload(o: Mining_Threat_Retreat_Supervisor.Defense_Command_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Defense_Command_Payload""""),
        ("value", printMining_Threat_Retreat_SupervisorDefense_CommandType(o.value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorMovement_Service_CommandType(o: Mining_Threat_Retreat_Supervisor.Movement_Service_Command.Type): ST = {
      val value: String = o match {
        case Mining_Threat_Retreat_Supervisor.Movement_Service_Command.Hold => "Hold"
        case Mining_Threat_Retreat_Supervisor.Movement_Service_Command.Retreat => "Retreat"
        case Mining_Threat_Retreat_Supervisor.Movement_Service_Command.Dock => "Dock"
        case Mining_Threat_Retreat_Supervisor.Movement_Service_Command.Offload => "Offload"
        case Mining_Threat_Retreat_Supervisor.Movement_Service_Command.Resupply => "Resupply"
        case Mining_Threat_Retreat_Supervisor.Movement_Service_Command.Acknowledge_Ready => "Acknowledge_Ready"
      }
      return printObject(ISZ(
        ("type", printString("Mining_Threat_Retreat_Supervisor.Movement_Service_Command")),
        ("value", printString(value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorMovement_Service_Command_Payload(o: Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Payload""""),
        ("value", printMining_Threat_Retreat_SupervisorMovement_Service_CommandType(o.value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorOperational_PhaseType(o: Mining_Threat_Retreat_Supervisor.Operational_Phase.Type): ST = {
      val value: String = o match {
        case Mining_Threat_Retreat_Supervisor.Operational_Phase.Idle => "Idle"
        case Mining_Threat_Retreat_Supervisor.Operational_Phase.Mining => "Mining"
        case Mining_Threat_Retreat_Supervisor.Operational_Phase.Defending => "Defending"
        case Mining_Threat_Retreat_Supervisor.Operational_Phase.Retreating => "Retreating"
        case Mining_Threat_Retreat_Supervisor.Operational_Phase.Servicing => "Servicing"
        case Mining_Threat_Retreat_Supervisor.Operational_Phase.Fault_Hold => "Fault_Hold"
      }
      return printObject(ISZ(
        ("type", printString("Mining_Threat_Retreat_Supervisor.Operational_Phase")),
        ("value", printString(value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorOperational_Phase_Payload(o: Mining_Threat_Retreat_Supervisor.Operational_Phase_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Operational_Phase_Payload""""),
        ("value", printMining_Threat_Retreat_SupervisorOperational_PhaseType(o.value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorInput_FaultType(o: Mining_Threat_Retreat_Supervisor.Input_Fault.Type): ST = {
      val value: String = o match {
        case Mining_Threat_Retreat_Supervisor.Input_Fault.Clear => "Clear"
        case Mining_Threat_Retreat_Supervisor.Input_Fault.Asserted => "Asserted"
      }
      return printObject(ISZ(
        ("type", printString("Mining_Threat_Retreat_Supervisor.Input_Fault")),
        ("value", printString(value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorInput_Fault_Payload(o: Mining_Threat_Retreat_Supervisor.Input_Fault_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Input_Fault_Payload""""),
        ("value", printMining_Threat_Retreat_SupervisorInput_FaultType(o.value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorThreat_Observation(o: Mining_Threat_Retreat_Supervisor.Threat_Observation): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Threat_Observation""""),
        ("threat", printMining_Threat_Retreat_SupervisorThreat_ValueType(o.threat)),
        ("threat_status", printMining_Threat_Retreat_SupervisorThreat_StatusType(o.threat_status))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorThreat_Observation_Payload(o: Mining_Threat_Retreat_Supervisor.Threat_Observation_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Threat_Observation_Payload""""),
        ("value", printMining_Threat_Retreat_SupervisorThreat_Observation(o.value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorCargo_Observation(o: Mining_Threat_Retreat_Supervisor.Cargo_Observation): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Cargo_Observation""""),
        ("cargo_band", printMining_Threat_Retreat_SupervisorCargo_BandType(o.cargo_band)),
        ("cargo_status", printMining_Threat_Retreat_SupervisorCargo_StatusType(o.cargo_status))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorCargo_Observation_Payload(o: Mining_Threat_Retreat_Supervisor.Cargo_Observation_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Cargo_Observation_Payload""""),
        ("value", printMining_Threat_Retreat_SupervisorCargo_Observation(o.value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorCapacitor_Observation(o: Mining_Threat_Retreat_Supervisor.Capacitor_Observation): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Capacitor_Observation""""),
        ("capacitor_band", printMining_Threat_Retreat_SupervisorCapacitor_BandType(o.capacitor_band)),
        ("capacitor_status", printMining_Threat_Retreat_SupervisorCapacitor_StatusType(o.capacitor_status))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorCapacitor_Observation_Payload(o: Mining_Threat_Retreat_Supervisor.Capacitor_Observation_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Capacitor_Observation_Payload""""),
        ("value", printMining_Threat_Retreat_SupervisorCapacitor_Observation(o.value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorRequest_Observation(o: Mining_Threat_Retreat_Supervisor.Request_Observation): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Request_Observation""""),
        ("operator_request", printMining_Threat_Retreat_SupervisorOperator_RequestType(o.operator_request)),
        ("request_status", printMining_Threat_Retreat_SupervisorRequest_StatusType(o.request_status))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorRequest_Observation_Payload(o: Mining_Threat_Retreat_Supervisor.Request_Observation_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Request_Observation_Payload""""),
        ("value", printMining_Threat_Retreat_SupervisorRequest_Observation(o.value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorMining_Availability_Observation(o: Mining_Threat_Retreat_Supervisor.Mining_Availability_Observation): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Mining_Availability_Observation""""),
        ("mining_available", printMining_Threat_Retreat_SupervisorMining_AvailabilityType(o.mining_available)),
        ("mining_availability_status", printMining_Threat_Retreat_SupervisorMining_Availability_StatusType(o.mining_availability_status))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorMining_Availability_Observation_Payload(o: Mining_Threat_Retreat_Supervisor.Mining_Availability_Observation_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Mining_Availability_Observation_Payload""""),
        ("value", printMining_Threat_Retreat_SupervisorMining_Availability_Observation(o.value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorDefense_Availability_Observation(o: Mining_Threat_Retreat_Supervisor.Defense_Availability_Observation): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Defense_Availability_Observation""""),
        ("defense_available", printMining_Threat_Retreat_SupervisorDefense_AvailabilityType(o.defense_available)),
        ("defense_availability_status", printMining_Threat_Retreat_SupervisorDefense_Availability_StatusType(o.defense_availability_status))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorDefense_Availability_Observation_Payload(o: Mining_Threat_Retreat_Supervisor.Defense_Availability_Observation_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Defense_Availability_Observation_Payload""""),
        ("value", printMining_Threat_Retreat_SupervisorDefense_Availability_Observation(o.value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorRetreat_Availability_Observation(o: Mining_Threat_Retreat_Supervisor.Retreat_Availability_Observation): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Retreat_Availability_Observation""""),
        ("retreat_available", printMining_Threat_Retreat_SupervisorRetreat_AvailabilityType(o.retreat_available)),
        ("retreat_availability_status", printMining_Threat_Retreat_SupervisorRetreat_Availability_StatusType(o.retreat_availability_status))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorRetreat_Availability_Observation_Payload(o: Mining_Threat_Retreat_Supervisor.Retreat_Availability_Observation_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Retreat_Availability_Observation_Payload""""),
        ("value", printMining_Threat_Retreat_SupervisorRetreat_Availability_Observation(o.value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorService_Progress_Observation(o: Mining_Threat_Retreat_Supervisor.Service_Progress_Observation): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Service_Progress_Observation""""),
        ("service_progress", printMining_Threat_Retreat_SupervisorService_ProgressType(o.service_progress)),
        ("service_progress_status", printMining_Threat_Retreat_SupervisorService_Progress_StatusType(o.service_progress_status))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorService_Progress_Observation_Payload(o: Mining_Threat_Retreat_Supervisor.Service_Progress_Observation_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Service_Progress_Observation_Payload""""),
        ("value", printMining_Threat_Retreat_SupervisorService_Progress_Observation(o.value))
      ))
    }

    @pure def printBase_TypesBoolean_Payload(o: Base_Types.Boolean_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Boolean_Payload""""),
        ("value", printB(o.value))
      ))
    }

    @pure def printBase_TypesInteger_Payload(o: Base_Types.Integer_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Integer_Payload""""),
        ("value", printZ(o.value))
      ))
    }

    @pure def printBase_TypesInteger_8_Payload(o: Base_Types.Integer_8_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Integer_8_Payload""""),
        ("value", printS8(o.value))
      ))
    }

    @pure def printBase_TypesInteger_16_Payload(o: Base_Types.Integer_16_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Integer_16_Payload""""),
        ("value", printS16(o.value))
      ))
    }

    @pure def printBase_TypesInteger_32_Payload(o: Base_Types.Integer_32_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Integer_32_Payload""""),
        ("value", printS32(o.value))
      ))
    }

    @pure def printBase_TypesInteger_64_Payload(o: Base_Types.Integer_64_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Integer_64_Payload""""),
        ("value", printS64(o.value))
      ))
    }

    @pure def printBase_TypesUnsigned_8_Payload(o: Base_Types.Unsigned_8_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Unsigned_8_Payload""""),
        ("value", printU8(o.value))
      ))
    }

    @pure def printBase_TypesUnsigned_16_Payload(o: Base_Types.Unsigned_16_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Unsigned_16_Payload""""),
        ("value", printU16(o.value))
      ))
    }

    @pure def printBase_TypesUnsigned_32_Payload(o: Base_Types.Unsigned_32_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Unsigned_32_Payload""""),
        ("value", printU32(o.value))
      ))
    }

    @pure def printBase_TypesUnsigned_64_Payload(o: Base_Types.Unsigned_64_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Unsigned_64_Payload""""),
        ("value", printU64(o.value))
      ))
    }

    @pure def printBase_TypesFloat_Payload(o: Base_Types.Float_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Float_Payload""""),
        ("value", printR(o.value))
      ))
    }

    @pure def printBase_TypesFloat_32_Payload(o: Base_Types.Float_32_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Float_32_Payload""""),
        ("value", printF32(o.value))
      ))
    }

    @pure def printBase_TypesFloat_64_Payload(o: Base_Types.Float_64_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Float_64_Payload""""),
        ("value", printF64(o.value))
      ))
    }

    @pure def printBase_TypesCharacter_Payload(o: Base_Types.Character_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Character_Payload""""),
        ("value", printC(o.value))
      ))
    }

    @pure def printBase_TypesString_Payload(o: Base_Types.String_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.String_Payload""""),
        ("value", printString(o.value))
      ))
    }

    @pure def printBase_TypesBits_Payload(o: Base_Types.Bits_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Bits_Payload""""),
        ("value", printISZ(T, o.value, printB _))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container(o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container): ST = {
      o match {
        case o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_P => return printMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS => return printMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS(o)
      }
    }

    @pure def printMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_P(o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_P""""),
        ("api_raw_threat", printMining_Threat_Retreat_SupervisorThreat_Observation(o.api_raw_threat))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS""""),
        ("api_raw_threat", printMining_Threat_Retreat_SupervisorThreat_Observation(o.api_raw_threat))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container(o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container): ST = {
      o match {
        case o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_P => return printMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS => return printMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS(o)
      }
    }

    @pure def printMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_P(o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_P""""),
        ("api_qualified_threat", printMining_Threat_Retreat_SupervisorThreat_Observation(o.api_qualified_threat))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS""""),
        ("api_qualified_threat", printMining_Threat_Retreat_SupervisorThreat_Observation(o.api_qualified_threat))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container(o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PreState_Container): ST = {
      o match {
        case o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PreState_Container_P => return printMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PreState_Container_PS => return printMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_PS(o)
      }
    }

    @pure def printMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_P(o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PreState_Container_P""""),
        ("api_raw_capacitor", printMining_Threat_Retreat_SupervisorCapacitor_Observation(o.api_raw_capacitor)),
        ("api_raw_cargo", printMining_Threat_Retreat_SupervisorCargo_Observation(o.api_raw_cargo))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PreState_Container_PS""""),
        ("api_raw_capacitor", printMining_Threat_Retreat_SupervisorCapacitor_Observation(o.api_raw_capacitor)),
        ("api_raw_cargo", printMining_Threat_Retreat_SupervisorCargo_Observation(o.api_raw_cargo))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container(o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PostState_Container): ST = {
      o match {
        case o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PostState_Container_P => return printMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PostState_Container_PS => return printMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_PS(o)
      }
    }

    @pure def printMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_P(o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PostState_Container_P""""),
        ("api_qualified_capacitor", printMining_Threat_Retreat_SupervisorCapacitor_Observation(o.api_qualified_capacitor)),
        ("api_qualified_cargo", printMining_Threat_Retreat_SupervisorCargo_Observation(o.api_qualified_cargo))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PostState_Container_PS""""),
        ("api_qualified_capacitor", printMining_Threat_Retreat_SupervisorCapacitor_Observation(o.api_qualified_capacitor)),
        ("api_qualified_cargo", printMining_Threat_Retreat_SupervisorCargo_Observation(o.api_qualified_cargo))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container(o: Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container): ST = {
      o match {
        case o: Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_P => return printMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PS => return printMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PS(o)
      }
    }

    @pure def printMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_P(o: Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_P""""),
        ("api_raw_defense_availability", printMining_Threat_Retreat_SupervisorDefense_Availability_Observation(o.api_raw_defense_availability)),
        ("api_raw_mining_availability", printMining_Threat_Retreat_SupervisorMining_Availability_Observation(o.api_raw_mining_availability)),
        ("api_raw_request", printMining_Threat_Retreat_SupervisorRequest_Observation(o.api_raw_request)),
        ("api_raw_retreat_availability", printMining_Threat_Retreat_SupervisorRetreat_Availability_Observation(o.api_raw_retreat_availability))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PS""""),
        ("api_raw_defense_availability", printMining_Threat_Retreat_SupervisorDefense_Availability_Observation(o.api_raw_defense_availability)),
        ("api_raw_mining_availability", printMining_Threat_Retreat_SupervisorMining_Availability_Observation(o.api_raw_mining_availability)),
        ("api_raw_request", printMining_Threat_Retreat_SupervisorRequest_Observation(o.api_raw_request)),
        ("api_raw_retreat_availability", printMining_Threat_Retreat_SupervisorRetreat_Availability_Observation(o.api_raw_retreat_availability))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container(o: Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container): ST = {
      o match {
        case o: Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_P => return printMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PS => return printMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PS(o)
      }
    }

    @pure def printMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_P(o: Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_P""""),
        ("api_qualified_defense_availability", printMining_Threat_Retreat_SupervisorDefense_Availability_Observation(o.api_qualified_defense_availability)),
        ("api_qualified_mining_availability", printMining_Threat_Retreat_SupervisorMining_Availability_Observation(o.api_qualified_mining_availability)),
        ("api_qualified_request", printMining_Threat_Retreat_SupervisorRequest_Observation(o.api_qualified_request)),
        ("api_qualified_retreat_availability", printMining_Threat_Retreat_SupervisorRetreat_Availability_Observation(o.api_qualified_retreat_availability))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PS""""),
        ("api_qualified_defense_availability", printMining_Threat_Retreat_SupervisorDefense_Availability_Observation(o.api_qualified_defense_availability)),
        ("api_qualified_mining_availability", printMining_Threat_Retreat_SupervisorMining_Availability_Observation(o.api_qualified_mining_availability)),
        ("api_qualified_request", printMining_Threat_Retreat_SupervisorRequest_Observation(o.api_qualified_request)),
        ("api_qualified_retreat_availability", printMining_Threat_Retreat_SupervisorRetreat_Availability_Observation(o.api_qualified_retreat_availability))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container(o: Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container): ST = {
      o match {
        case o: Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_P => return printMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PS => return printMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PS(o)
      }
    }

    @pure def printMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_P(o: Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_P""""),
        ("api_capacitor_input", printMining_Threat_Retreat_SupervisorCapacitor_Observation(o.api_capacitor_input)),
        ("api_cargo_input", printMining_Threat_Retreat_SupervisorCargo_Observation(o.api_cargo_input)),
        ("api_defense_availability_input", printMining_Threat_Retreat_SupervisorDefense_Availability_Observation(o.api_defense_availability_input)),
        ("api_mining_availability_input", printMining_Threat_Retreat_SupervisorMining_Availability_Observation(o.api_mining_availability_input)),
        ("api_request_input", printMining_Threat_Retreat_SupervisorRequest_Observation(o.api_request_input)),
        ("api_retreat_availability_input", printMining_Threat_Retreat_SupervisorRetreat_Availability_Observation(o.api_retreat_availability_input)),
        ("api_service_progress_input", printMining_Threat_Retreat_SupervisorService_Progress_Observation(o.api_service_progress_input)),
        ("api_threat_input", printMining_Threat_Retreat_SupervisorThreat_Observation(o.api_threat_input))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PS""""),
        ("In_current_phase", printMining_Threat_Retreat_SupervisorOperational_PhaseType(o.In_current_phase)),
        ("api_capacitor_input", printMining_Threat_Retreat_SupervisorCapacitor_Observation(o.api_capacitor_input)),
        ("api_cargo_input", printMining_Threat_Retreat_SupervisorCargo_Observation(o.api_cargo_input)),
        ("api_defense_availability_input", printMining_Threat_Retreat_SupervisorDefense_Availability_Observation(o.api_defense_availability_input)),
        ("api_mining_availability_input", printMining_Threat_Retreat_SupervisorMining_Availability_Observation(o.api_mining_availability_input)),
        ("api_request_input", printMining_Threat_Retreat_SupervisorRequest_Observation(o.api_request_input)),
        ("api_retreat_availability_input", printMining_Threat_Retreat_SupervisorRetreat_Availability_Observation(o.api_retreat_availability_input)),
        ("api_service_progress_input", printMining_Threat_Retreat_SupervisorService_Progress_Observation(o.api_service_progress_input)),
        ("api_threat_input", printMining_Threat_Retreat_SupervisorThreat_Observation(o.api_threat_input))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container(o: Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container): ST = {
      o match {
        case o: Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_P => return printMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PS => return printMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PS(o)
      }
    }

    @pure def printMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_P(o: Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_P""""),
        ("api_defense_decision", printMining_Threat_Retreat_SupervisorDefense_CommandType(o.api_defense_decision)),
        ("api_fault_decision", printMining_Threat_Retreat_SupervisorInput_FaultType(o.api_fault_decision)),
        ("api_mining_decision", printMining_Threat_Retreat_SupervisorMining_CommandType(o.api_mining_decision)),
        ("api_movement_service_decision", printMining_Threat_Retreat_SupervisorMovement_Service_CommandType(o.api_movement_service_decision)),
        ("api_phase_decision", printMining_Threat_Retreat_SupervisorOperational_PhaseType(o.api_phase_decision))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PS""""),
        ("current_phase", printMining_Threat_Retreat_SupervisorOperational_PhaseType(o.current_phase)),
        ("api_defense_decision", printMining_Threat_Retreat_SupervisorDefense_CommandType(o.api_defense_decision)),
        ("api_fault_decision", printMining_Threat_Retreat_SupervisorInput_FaultType(o.api_fault_decision)),
        ("api_mining_decision", printMining_Threat_Retreat_SupervisorMining_CommandType(o.api_mining_decision)),
        ("api_movement_service_decision", printMining_Threat_Retreat_SupervisorMovement_Service_CommandType(o.api_movement_service_decision)),
        ("api_phase_decision", printMining_Threat_Retreat_SupervisorOperational_PhaseType(o.api_phase_decision))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container(o: Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container): ST = {
      o match {
        case o: Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_P => return printMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PS => return printMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PS(o)
      }
    }

    @pure def printMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_P(o: Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_P""""),
        ("api_mining_in", printMining_Threat_Retreat_SupervisorMining_CommandType(o.api_mining_in))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PS""""),
        ("api_mining_in", printMining_Threat_Retreat_SupervisorMining_CommandType(o.api_mining_in))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container(o: Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container): ST = {
      o match {
        case o: Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_P => return printMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PS => return printMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PS(o)
      }
    }

    @pure def printMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_P(o: Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_P""""),
        ("api_mining_out", printMining_Threat_Retreat_SupervisorMining_CommandType(o.api_mining_out))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PS""""),
        ("api_mining_out", printMining_Threat_Retreat_SupervisorMining_CommandType(o.api_mining_out))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container(o: Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container): ST = {
      o match {
        case o: Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_P => return printMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PS => return printMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PS(o)
      }
    }

    @pure def printMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_P(o: Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_P""""),
        ("api_defense_in", printMining_Threat_Retreat_SupervisorDefense_CommandType(o.api_defense_in))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PS""""),
        ("api_defense_in", printMining_Threat_Retreat_SupervisorDefense_CommandType(o.api_defense_in))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container(o: Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container): ST = {
      o match {
        case o: Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_P => return printMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PS => return printMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PS(o)
      }
    }

    @pure def printMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_P(o: Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_P""""),
        ("api_defense_out", printMining_Threat_Retreat_SupervisorDefense_CommandType(o.api_defense_out))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PS""""),
        ("api_defense_out", printMining_Threat_Retreat_SupervisorDefense_CommandType(o.api_defense_out))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container(o: Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container): ST = {
      o match {
        case o: Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_P => return printMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PS => return printMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PS(o)
      }
    }

    @pure def printMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_P(o: Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_P""""),
        ("api_movement_service_in", printMining_Threat_Retreat_SupervisorMovement_Service_CommandType(o.api_movement_service_in))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PS""""),
        ("api_movement_service_in", printMining_Threat_Retreat_SupervisorMovement_Service_CommandType(o.api_movement_service_in))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container(o: Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container): ST = {
      o match {
        case o: Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_P => return printMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PS => return printMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PS(o)
      }
    }

    @pure def printMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_P(o: Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_P""""),
        ("api_movement_service_out", printMining_Threat_Retreat_SupervisorMovement_Service_CommandType(o.api_movement_service_out))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PS""""),
        ("api_movement_service_out", printMining_Threat_Retreat_SupervisorMovement_Service_CommandType(o.api_movement_service_out))
      ))
    }

    @pure def printruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): ST = {
      val value: String = o match {
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_System_Instance_supervisor_process_threat_qualification_postInit => "Mining_Threat_Retreat_System_Instance_supervisor_process_threat_qualification_postInit"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_System_Instance_supervisor_process_threat_qualification_preCompute => "Mining_Threat_Retreat_System_Instance_supervisor_process_threat_qualification_preCompute"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_System_Instance_supervisor_process_threat_qualification_postCompute => "Mining_Threat_Retreat_System_Instance_supervisor_process_threat_qualification_postCompute"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_System_Instance_supervisor_process_resource_qualification_postInit => "Mining_Threat_Retreat_System_Instance_supervisor_process_resource_qualification_postInit"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_System_Instance_supervisor_process_resource_qualification_preCompute => "Mining_Threat_Retreat_System_Instance_supervisor_process_resource_qualification_preCompute"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_System_Instance_supervisor_process_resource_qualification_postCompute => "Mining_Threat_Retreat_System_Instance_supervisor_process_resource_qualification_postCompute"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_System_Instance_supervisor_process_request_availability_qualification_postInit => "Mining_Threat_Retreat_System_Instance_supervisor_process_request_availability_qualification_postInit"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_System_Instance_supervisor_process_request_availability_qualification_preCompute => "Mining_Threat_Retreat_System_Instance_supervisor_process_request_availability_qualification_preCompute"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_System_Instance_supervisor_process_request_availability_qualification_postCompute => "Mining_Threat_Retreat_System_Instance_supervisor_process_request_availability_qualification_postCompute"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_System_Instance_supervisor_process_principal_decision_owner_postInit => "Mining_Threat_Retreat_System_Instance_supervisor_process_principal_decision_owner_postInit"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_System_Instance_supervisor_process_principal_decision_owner_preCompute => "Mining_Threat_Retreat_System_Instance_supervisor_process_principal_decision_owner_preCompute"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_System_Instance_supervisor_process_principal_decision_owner_postCompute => "Mining_Threat_Retreat_System_Instance_supervisor_process_principal_decision_owner_postCompute"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_System_Instance_supervisor_process_mining_command_delivery_postInit => "Mining_Threat_Retreat_System_Instance_supervisor_process_mining_command_delivery_postInit"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_System_Instance_supervisor_process_mining_command_delivery_preCompute => "Mining_Threat_Retreat_System_Instance_supervisor_process_mining_command_delivery_preCompute"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_System_Instance_supervisor_process_mining_command_delivery_postCompute => "Mining_Threat_Retreat_System_Instance_supervisor_process_mining_command_delivery_postCompute"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_System_Instance_supervisor_process_defense_command_delivery_postInit => "Mining_Threat_Retreat_System_Instance_supervisor_process_defense_command_delivery_postInit"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_System_Instance_supervisor_process_defense_command_delivery_preCompute => "Mining_Threat_Retreat_System_Instance_supervisor_process_defense_command_delivery_preCompute"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_System_Instance_supervisor_process_defense_command_delivery_postCompute => "Mining_Threat_Retreat_System_Instance_supervisor_process_defense_command_delivery_postCompute"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_System_Instance_supervisor_process_movement_service_command_delivery_postInit => "Mining_Threat_Retreat_System_Instance_supervisor_process_movement_service_command_delivery_postInit"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_System_Instance_supervisor_process_movement_service_command_delivery_preCompute => "Mining_Threat_Retreat_System_Instance_supervisor_process_movement_service_command_delivery_preCompute"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_System_Instance_supervisor_process_movement_service_command_delivery_postCompute => "Mining_Threat_Retreat_System_Instance_supervisor_process_movement_service_command_delivery_postCompute"
      }
      return printObject(ISZ(
        ("type", printString("runtimemonitor.ObservationKind")),
        ("value", printString(value))
      ))
    }

    @pure def printutilContainer(o: util.Container): ST = {
      o match {
        case o: util.EmptyContainer => return printutilEmptyContainer(o)
        case o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_P => return printMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS => return printMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_P => return printMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS => return printMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PreState_Container_P => return printMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PreState_Container_PS => return printMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PostState_Container_P => return printMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PostState_Container_PS => return printMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_P => return printMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PS => return printMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_P => return printMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PS => return printMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_P => return printMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PS => return printMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_P => return printMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_P => return printMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PS => return printMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PS => return printMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_P => return printMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PS => return printMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_P => return printMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PS => return printMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_P => return printMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PS => return printMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_P => return printMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PS => return printMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_P => return printMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PS => return printMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PS(o)
      }
    }

    @pure def printutilEmptyContainer(o: util.EmptyContainer): ST = {
      return printObject(ISZ(
        ("type", st""""util.EmptyContainer"""")
      ))
    }

    @pure def print_artDataContent(o: art.DataContent): ST = {
      o match {
        case o: art.Empty => return print_artEmpty(o)
        case o: Base_Types.Boolean_Payload => return printBase_TypesBoolean_Payload(o)
        case o: Base_Types.Integer_Payload => return printBase_TypesInteger_Payload(o)
        case o: Base_Types.Integer_8_Payload => return printBase_TypesInteger_8_Payload(o)
        case o: Base_Types.Integer_16_Payload => return printBase_TypesInteger_16_Payload(o)
        case o: Base_Types.Integer_32_Payload => return printBase_TypesInteger_32_Payload(o)
        case o: Base_Types.Integer_64_Payload => return printBase_TypesInteger_64_Payload(o)
        case o: Base_Types.Unsigned_8_Payload => return printBase_TypesUnsigned_8_Payload(o)
        case o: Base_Types.Unsigned_16_Payload => return printBase_TypesUnsigned_16_Payload(o)
        case o: Base_Types.Unsigned_32_Payload => return printBase_TypesUnsigned_32_Payload(o)
        case o: Base_Types.Unsigned_64_Payload => return printBase_TypesUnsigned_64_Payload(o)
        case o: Base_Types.Float_Payload => return printBase_TypesFloat_Payload(o)
        case o: Base_Types.Float_32_Payload => return printBase_TypesFloat_32_Payload(o)
        case o: Base_Types.Float_64_Payload => return printBase_TypesFloat_64_Payload(o)
        case o: Base_Types.Character_Payload => return printBase_TypesCharacter_Payload(o)
        case o: Base_Types.String_Payload => return printBase_TypesString_Payload(o)
        case o: Base_Types.Bits_Payload => return printBase_TypesBits_Payload(o)
        case o: util.EmptyContainer => return printutilEmptyContainer(o)
        case o: Mining_Threat_Retreat_Supervisor.Cargo_Band_Payload => return printMining_Threat_Retreat_SupervisorCargo_Band_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Input_Fault_Payload => return printMining_Threat_Retreat_SupervisorInput_Fault_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Cargo_Status_Payload => return printMining_Threat_Retreat_SupervisorCargo_Status_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Threat_Value_Payload => return printMining_Threat_Retreat_SupervisorThreat_Value_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Threat_Status_Payload => return printMining_Threat_Retreat_SupervisorThreat_Status_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Mining_Command_Payload => return printMining_Threat_Retreat_SupervisorMining_Command_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Request_Status_Payload => return printMining_Threat_Retreat_SupervisorRequest_Status_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Capacitor_Band_Payload => return printMining_Threat_Retreat_SupervisorCapacitor_Band_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Defense_Command_Payload => return printMining_Threat_Retreat_SupervisorDefense_Command_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Capacitor_Status_Payload => return printMining_Threat_Retreat_SupervisorCapacitor_Status_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Operator_Request_Payload => return printMining_Threat_Retreat_SupervisorOperator_Request_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Service_Progress_Payload => return printMining_Threat_Retreat_SupervisorService_Progress_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Operational_Phase_Payload => return printMining_Threat_Retreat_SupervisorOperational_Phase_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Cargo_Observation_Payload => return printMining_Threat_Retreat_SupervisorCargo_Observation_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Threat_Observation_Payload => return printMining_Threat_Retreat_SupervisorThreat_Observation_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Mining_Availability_Payload => return printMining_Threat_Retreat_SupervisorMining_Availability_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Request_Observation_Payload => return printMining_Threat_Retreat_SupervisorRequest_Observation_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Defense_Availability_Payload => return printMining_Threat_Retreat_SupervisorDefense_Availability_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Retreat_Availability_Payload => return printMining_Threat_Retreat_SupervisorRetreat_Availability_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Capacitor_Observation_Payload => return printMining_Threat_Retreat_SupervisorCapacitor_Observation_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Service_Progress_Status_Payload => return printMining_Threat_Retreat_SupervisorService_Progress_Status_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Payload => return printMining_Threat_Retreat_SupervisorMovement_Service_Command_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Mining_Availability_Status_Payload => return printMining_Threat_Retreat_SupervisorMining_Availability_Status_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Defense_Availability_Status_Payload => return printMining_Threat_Retreat_SupervisorDefense_Availability_Status_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Retreat_Availability_Status_Payload => return printMining_Threat_Retreat_SupervisorRetreat_Availability_Status_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Service_Progress_Observation_Payload => return printMining_Threat_Retreat_SupervisorService_Progress_Observation_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Mining_Availability_Observation_Payload => return printMining_Threat_Retreat_SupervisorMining_Availability_Observation_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Defense_Availability_Observation_Payload => return printMining_Threat_Retreat_SupervisorDefense_Availability_Observation_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Retreat_Availability_Observation_Payload => return printMining_Threat_Retreat_SupervisorRetreat_Availability_Observation_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_P => return printMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS => return printMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_P => return printMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS => return printMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PreState_Container_P => return printMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PreState_Container_PS => return printMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PostState_Container_P => return printMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PostState_Container_PS => return printMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_P => return printMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PS => return printMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_P => return printMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PS => return printMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_P => return printMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PS => return printMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_P => return printMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_P => return printMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PS => return printMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PS => return printMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_P => return printMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PS => return printMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_P => return printMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PS => return printMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_P => return printMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PS => return printMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_P => return printMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PS => return printMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_P => return printMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PS => return printMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PS(o)
      }
    }

    @pure def print_artEmpty(o: art.Empty): ST = {
      return printObject(ISZ(
        ("type", st""""art.Empty"""")
      ))
    }

  }

  @record class Parser(val input: String) {
    val parser: Json.Parser = Json.Parser.create(input)

    def errorOpt: Option[Json.ErrorMsg] = {
      return parser.errorOpt
    }

    def parseMining_Threat_Retreat_SupervisorThreat_ValueType(): Mining_Threat_Retreat_Supervisor.Threat_Value.Type = {
      val r = parseMining_Threat_Retreat_SupervisorThreat_ValueT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorThreat_ValueT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Threat_Value.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Threat_Value")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Mining_Threat_Retreat_Supervisor.Threat_Value.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Mining_Threat_Retreat_Supervisor.Threat_Value.")
          return Mining_Threat_Retreat_Supervisor.Threat_Value.byOrdinal(0).get
      }
    }

    def parseMining_Threat_Retreat_SupervisorThreat_Value_Payload(): Mining_Threat_Retreat_Supervisor.Threat_Value_Payload = {
      val r = parseMining_Threat_Retreat_SupervisorThreat_Value_PayloadT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorThreat_Value_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Threat_Value_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Threat_Value_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Threat_Retreat_SupervisorThreat_ValueType()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Threat_Value_Payload(value)
    }

    def parseMining_Threat_Retreat_SupervisorThreat_StatusType(): Mining_Threat_Retreat_Supervisor.Threat_Status.Type = {
      val r = parseMining_Threat_Retreat_SupervisorThreat_StatusT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorThreat_StatusT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Threat_Status.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Threat_Status")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Mining_Threat_Retreat_Supervisor.Threat_Status.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Mining_Threat_Retreat_Supervisor.Threat_Status.")
          return Mining_Threat_Retreat_Supervisor.Threat_Status.byOrdinal(0).get
      }
    }

    def parseMining_Threat_Retreat_SupervisorThreat_Status_Payload(): Mining_Threat_Retreat_Supervisor.Threat_Status_Payload = {
      val r = parseMining_Threat_Retreat_SupervisorThreat_Status_PayloadT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorThreat_Status_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Threat_Status_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Threat_Status_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Threat_Retreat_SupervisorThreat_StatusType()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Threat_Status_Payload(value)
    }

    def parseMining_Threat_Retreat_SupervisorCargo_BandType(): Mining_Threat_Retreat_Supervisor.Cargo_Band.Type = {
      val r = parseMining_Threat_Retreat_SupervisorCargo_BandT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorCargo_BandT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Cargo_Band.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Cargo_Band")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Mining_Threat_Retreat_Supervisor.Cargo_Band.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Mining_Threat_Retreat_Supervisor.Cargo_Band.")
          return Mining_Threat_Retreat_Supervisor.Cargo_Band.byOrdinal(0).get
      }
    }

    def parseMining_Threat_Retreat_SupervisorCargo_Band_Payload(): Mining_Threat_Retreat_Supervisor.Cargo_Band_Payload = {
      val r = parseMining_Threat_Retreat_SupervisorCargo_Band_PayloadT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorCargo_Band_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Cargo_Band_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Cargo_Band_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Threat_Retreat_SupervisorCargo_BandType()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Cargo_Band_Payload(value)
    }

    def parseMining_Threat_Retreat_SupervisorCargo_StatusType(): Mining_Threat_Retreat_Supervisor.Cargo_Status.Type = {
      val r = parseMining_Threat_Retreat_SupervisorCargo_StatusT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorCargo_StatusT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Cargo_Status.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Cargo_Status")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Mining_Threat_Retreat_Supervisor.Cargo_Status.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Mining_Threat_Retreat_Supervisor.Cargo_Status.")
          return Mining_Threat_Retreat_Supervisor.Cargo_Status.byOrdinal(0).get
      }
    }

    def parseMining_Threat_Retreat_SupervisorCargo_Status_Payload(): Mining_Threat_Retreat_Supervisor.Cargo_Status_Payload = {
      val r = parseMining_Threat_Retreat_SupervisorCargo_Status_PayloadT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorCargo_Status_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Cargo_Status_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Cargo_Status_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Threat_Retreat_SupervisorCargo_StatusType()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Cargo_Status_Payload(value)
    }

    def parseMining_Threat_Retreat_SupervisorCapacitor_BandType(): Mining_Threat_Retreat_Supervisor.Capacitor_Band.Type = {
      val r = parseMining_Threat_Retreat_SupervisorCapacitor_BandT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorCapacitor_BandT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Capacitor_Band.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Capacitor_Band")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Mining_Threat_Retreat_Supervisor.Capacitor_Band.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Mining_Threat_Retreat_Supervisor.Capacitor_Band.")
          return Mining_Threat_Retreat_Supervisor.Capacitor_Band.byOrdinal(0).get
      }
    }

    def parseMining_Threat_Retreat_SupervisorCapacitor_Band_Payload(): Mining_Threat_Retreat_Supervisor.Capacitor_Band_Payload = {
      val r = parseMining_Threat_Retreat_SupervisorCapacitor_Band_PayloadT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorCapacitor_Band_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Capacitor_Band_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Capacitor_Band_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Threat_Retreat_SupervisorCapacitor_BandType()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Capacitor_Band_Payload(value)
    }

    def parseMining_Threat_Retreat_SupervisorCapacitor_StatusType(): Mining_Threat_Retreat_Supervisor.Capacitor_Status.Type = {
      val r = parseMining_Threat_Retreat_SupervisorCapacitor_StatusT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorCapacitor_StatusT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Capacitor_Status.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Capacitor_Status")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Mining_Threat_Retreat_Supervisor.Capacitor_Status.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Mining_Threat_Retreat_Supervisor.Capacitor_Status.")
          return Mining_Threat_Retreat_Supervisor.Capacitor_Status.byOrdinal(0).get
      }
    }

    def parseMining_Threat_Retreat_SupervisorCapacitor_Status_Payload(): Mining_Threat_Retreat_Supervisor.Capacitor_Status_Payload = {
      val r = parseMining_Threat_Retreat_SupervisorCapacitor_Status_PayloadT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorCapacitor_Status_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Capacitor_Status_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Capacitor_Status_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Threat_Retreat_SupervisorCapacitor_StatusType()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Capacitor_Status_Payload(value)
    }

    def parseMining_Threat_Retreat_SupervisorOperator_RequestType(): Mining_Threat_Retreat_Supervisor.Operator_Request.Type = {
      val r = parseMining_Threat_Retreat_SupervisorOperator_RequestT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorOperator_RequestT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Operator_Request.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Operator_Request")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Mining_Threat_Retreat_Supervisor.Operator_Request.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Mining_Threat_Retreat_Supervisor.Operator_Request.")
          return Mining_Threat_Retreat_Supervisor.Operator_Request.byOrdinal(0).get
      }
    }

    def parseMining_Threat_Retreat_SupervisorOperator_Request_Payload(): Mining_Threat_Retreat_Supervisor.Operator_Request_Payload = {
      val r = parseMining_Threat_Retreat_SupervisorOperator_Request_PayloadT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorOperator_Request_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Operator_Request_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Operator_Request_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Threat_Retreat_SupervisorOperator_RequestType()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Operator_Request_Payload(value)
    }

    def parseMining_Threat_Retreat_SupervisorRequest_StatusType(): Mining_Threat_Retreat_Supervisor.Request_Status.Type = {
      val r = parseMining_Threat_Retreat_SupervisorRequest_StatusT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorRequest_StatusT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Request_Status.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Request_Status")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Mining_Threat_Retreat_Supervisor.Request_Status.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Mining_Threat_Retreat_Supervisor.Request_Status.")
          return Mining_Threat_Retreat_Supervisor.Request_Status.byOrdinal(0).get
      }
    }

    def parseMining_Threat_Retreat_SupervisorRequest_Status_Payload(): Mining_Threat_Retreat_Supervisor.Request_Status_Payload = {
      val r = parseMining_Threat_Retreat_SupervisorRequest_Status_PayloadT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorRequest_Status_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Request_Status_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Request_Status_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Threat_Retreat_SupervisorRequest_StatusType()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Request_Status_Payload(value)
    }

    def parseMining_Threat_Retreat_SupervisorMining_AvailabilityType(): Mining_Threat_Retreat_Supervisor.Mining_Availability.Type = {
      val r = parseMining_Threat_Retreat_SupervisorMining_AvailabilityT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorMining_AvailabilityT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Mining_Availability.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Mining_Availability")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Mining_Threat_Retreat_Supervisor.Mining_Availability.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Mining_Threat_Retreat_Supervisor.Mining_Availability.")
          return Mining_Threat_Retreat_Supervisor.Mining_Availability.byOrdinal(0).get
      }
    }

    def parseMining_Threat_Retreat_SupervisorMining_Availability_Payload(): Mining_Threat_Retreat_Supervisor.Mining_Availability_Payload = {
      val r = parseMining_Threat_Retreat_SupervisorMining_Availability_PayloadT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorMining_Availability_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Mining_Availability_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Mining_Availability_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Threat_Retreat_SupervisorMining_AvailabilityType()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Mining_Availability_Payload(value)
    }

    def parseMining_Threat_Retreat_SupervisorMining_Availability_StatusType(): Mining_Threat_Retreat_Supervisor.Mining_Availability_Status.Type = {
      val r = parseMining_Threat_Retreat_SupervisorMining_Availability_StatusT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorMining_Availability_StatusT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Mining_Availability_Status.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Mining_Availability_Status")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Mining_Threat_Retreat_Supervisor.Mining_Availability_Status.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Mining_Threat_Retreat_Supervisor.Mining_Availability_Status.")
          return Mining_Threat_Retreat_Supervisor.Mining_Availability_Status.byOrdinal(0).get
      }
    }

    def parseMining_Threat_Retreat_SupervisorMining_Availability_Status_Payload(): Mining_Threat_Retreat_Supervisor.Mining_Availability_Status_Payload = {
      val r = parseMining_Threat_Retreat_SupervisorMining_Availability_Status_PayloadT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorMining_Availability_Status_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Mining_Availability_Status_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Mining_Availability_Status_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Threat_Retreat_SupervisorMining_Availability_StatusType()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Mining_Availability_Status_Payload(value)
    }

    def parseMining_Threat_Retreat_SupervisorDefense_AvailabilityType(): Mining_Threat_Retreat_Supervisor.Defense_Availability.Type = {
      val r = parseMining_Threat_Retreat_SupervisorDefense_AvailabilityT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorDefense_AvailabilityT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Defense_Availability.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Defense_Availability")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Mining_Threat_Retreat_Supervisor.Defense_Availability.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Mining_Threat_Retreat_Supervisor.Defense_Availability.")
          return Mining_Threat_Retreat_Supervisor.Defense_Availability.byOrdinal(0).get
      }
    }

    def parseMining_Threat_Retreat_SupervisorDefense_Availability_Payload(): Mining_Threat_Retreat_Supervisor.Defense_Availability_Payload = {
      val r = parseMining_Threat_Retreat_SupervisorDefense_Availability_PayloadT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorDefense_Availability_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Defense_Availability_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Defense_Availability_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Threat_Retreat_SupervisorDefense_AvailabilityType()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Defense_Availability_Payload(value)
    }

    def parseMining_Threat_Retreat_SupervisorDefense_Availability_StatusType(): Mining_Threat_Retreat_Supervisor.Defense_Availability_Status.Type = {
      val r = parseMining_Threat_Retreat_SupervisorDefense_Availability_StatusT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorDefense_Availability_StatusT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Defense_Availability_Status.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Defense_Availability_Status")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Mining_Threat_Retreat_Supervisor.Defense_Availability_Status.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Mining_Threat_Retreat_Supervisor.Defense_Availability_Status.")
          return Mining_Threat_Retreat_Supervisor.Defense_Availability_Status.byOrdinal(0).get
      }
    }

    def parseMining_Threat_Retreat_SupervisorDefense_Availability_Status_Payload(): Mining_Threat_Retreat_Supervisor.Defense_Availability_Status_Payload = {
      val r = parseMining_Threat_Retreat_SupervisorDefense_Availability_Status_PayloadT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorDefense_Availability_Status_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Defense_Availability_Status_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Defense_Availability_Status_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Threat_Retreat_SupervisorDefense_Availability_StatusType()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Defense_Availability_Status_Payload(value)
    }

    def parseMining_Threat_Retreat_SupervisorRetreat_AvailabilityType(): Mining_Threat_Retreat_Supervisor.Retreat_Availability.Type = {
      val r = parseMining_Threat_Retreat_SupervisorRetreat_AvailabilityT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorRetreat_AvailabilityT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Retreat_Availability.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Retreat_Availability")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Mining_Threat_Retreat_Supervisor.Retreat_Availability.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Mining_Threat_Retreat_Supervisor.Retreat_Availability.")
          return Mining_Threat_Retreat_Supervisor.Retreat_Availability.byOrdinal(0).get
      }
    }

    def parseMining_Threat_Retreat_SupervisorRetreat_Availability_Payload(): Mining_Threat_Retreat_Supervisor.Retreat_Availability_Payload = {
      val r = parseMining_Threat_Retreat_SupervisorRetreat_Availability_PayloadT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorRetreat_Availability_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Retreat_Availability_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Retreat_Availability_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Threat_Retreat_SupervisorRetreat_AvailabilityType()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Retreat_Availability_Payload(value)
    }

    def parseMining_Threat_Retreat_SupervisorRetreat_Availability_StatusType(): Mining_Threat_Retreat_Supervisor.Retreat_Availability_Status.Type = {
      val r = parseMining_Threat_Retreat_SupervisorRetreat_Availability_StatusT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorRetreat_Availability_StatusT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Retreat_Availability_Status.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Retreat_Availability_Status")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Mining_Threat_Retreat_Supervisor.Retreat_Availability_Status.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Mining_Threat_Retreat_Supervisor.Retreat_Availability_Status.")
          return Mining_Threat_Retreat_Supervisor.Retreat_Availability_Status.byOrdinal(0).get
      }
    }

    def parseMining_Threat_Retreat_SupervisorRetreat_Availability_Status_Payload(): Mining_Threat_Retreat_Supervisor.Retreat_Availability_Status_Payload = {
      val r = parseMining_Threat_Retreat_SupervisorRetreat_Availability_Status_PayloadT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorRetreat_Availability_Status_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Retreat_Availability_Status_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Retreat_Availability_Status_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Threat_Retreat_SupervisorRetreat_Availability_StatusType()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Retreat_Availability_Status_Payload(value)
    }

    def parseMining_Threat_Retreat_SupervisorService_ProgressType(): Mining_Threat_Retreat_Supervisor.Service_Progress.Type = {
      val r = parseMining_Threat_Retreat_SupervisorService_ProgressT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorService_ProgressT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Service_Progress.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Service_Progress")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Mining_Threat_Retreat_Supervisor.Service_Progress.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Mining_Threat_Retreat_Supervisor.Service_Progress.")
          return Mining_Threat_Retreat_Supervisor.Service_Progress.byOrdinal(0).get
      }
    }

    def parseMining_Threat_Retreat_SupervisorService_Progress_Payload(): Mining_Threat_Retreat_Supervisor.Service_Progress_Payload = {
      val r = parseMining_Threat_Retreat_SupervisorService_Progress_PayloadT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorService_Progress_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Service_Progress_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Service_Progress_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Threat_Retreat_SupervisorService_ProgressType()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Service_Progress_Payload(value)
    }

    def parseMining_Threat_Retreat_SupervisorService_Progress_StatusType(): Mining_Threat_Retreat_Supervisor.Service_Progress_Status.Type = {
      val r = parseMining_Threat_Retreat_SupervisorService_Progress_StatusT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorService_Progress_StatusT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Service_Progress_Status.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Service_Progress_Status")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Mining_Threat_Retreat_Supervisor.Service_Progress_Status.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Mining_Threat_Retreat_Supervisor.Service_Progress_Status.")
          return Mining_Threat_Retreat_Supervisor.Service_Progress_Status.byOrdinal(0).get
      }
    }

    def parseMining_Threat_Retreat_SupervisorService_Progress_Status_Payload(): Mining_Threat_Retreat_Supervisor.Service_Progress_Status_Payload = {
      val r = parseMining_Threat_Retreat_SupervisorService_Progress_Status_PayloadT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorService_Progress_Status_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Service_Progress_Status_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Service_Progress_Status_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Threat_Retreat_SupervisorService_Progress_StatusType()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Service_Progress_Status_Payload(value)
    }

    def parseMining_Threat_Retreat_SupervisorMining_CommandType(): Mining_Threat_Retreat_Supervisor.Mining_Command.Type = {
      val r = parseMining_Threat_Retreat_SupervisorMining_CommandT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorMining_CommandT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Mining_Command.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Mining_Command")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Mining_Threat_Retreat_Supervisor.Mining_Command.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Mining_Threat_Retreat_Supervisor.Mining_Command.")
          return Mining_Threat_Retreat_Supervisor.Mining_Command.byOrdinal(0).get
      }
    }

    def parseMining_Threat_Retreat_SupervisorMining_Command_Payload(): Mining_Threat_Retreat_Supervisor.Mining_Command_Payload = {
      val r = parseMining_Threat_Retreat_SupervisorMining_Command_PayloadT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorMining_Command_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Mining_Command_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Mining_Command_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Threat_Retreat_SupervisorMining_CommandType()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Mining_Command_Payload(value)
    }

    def parseMining_Threat_Retreat_SupervisorDefense_CommandType(): Mining_Threat_Retreat_Supervisor.Defense_Command.Type = {
      val r = parseMining_Threat_Retreat_SupervisorDefense_CommandT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorDefense_CommandT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Defense_Command.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Defense_Command")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Mining_Threat_Retreat_Supervisor.Defense_Command.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Mining_Threat_Retreat_Supervisor.Defense_Command.")
          return Mining_Threat_Retreat_Supervisor.Defense_Command.byOrdinal(0).get
      }
    }

    def parseMining_Threat_Retreat_SupervisorDefense_Command_Payload(): Mining_Threat_Retreat_Supervisor.Defense_Command_Payload = {
      val r = parseMining_Threat_Retreat_SupervisorDefense_Command_PayloadT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorDefense_Command_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Defense_Command_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Defense_Command_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Threat_Retreat_SupervisorDefense_CommandType()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Defense_Command_Payload(value)
    }

    def parseMining_Threat_Retreat_SupervisorMovement_Service_CommandType(): Mining_Threat_Retreat_Supervisor.Movement_Service_Command.Type = {
      val r = parseMining_Threat_Retreat_SupervisorMovement_Service_CommandT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorMovement_Service_CommandT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Movement_Service_Command.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Movement_Service_Command")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Mining_Threat_Retreat_Supervisor.Movement_Service_Command.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Mining_Threat_Retreat_Supervisor.Movement_Service_Command.")
          return Mining_Threat_Retreat_Supervisor.Movement_Service_Command.byOrdinal(0).get
      }
    }

    def parseMining_Threat_Retreat_SupervisorMovement_Service_Command_Payload(): Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Payload = {
      val r = parseMining_Threat_Retreat_SupervisorMovement_Service_Command_PayloadT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorMovement_Service_Command_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Threat_Retreat_SupervisorMovement_Service_CommandType()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Payload(value)
    }

    def parseMining_Threat_Retreat_SupervisorOperational_PhaseType(): Mining_Threat_Retreat_Supervisor.Operational_Phase.Type = {
      val r = parseMining_Threat_Retreat_SupervisorOperational_PhaseT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorOperational_PhaseT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Operational_Phase.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Operational_Phase")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Mining_Threat_Retreat_Supervisor.Operational_Phase.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Mining_Threat_Retreat_Supervisor.Operational_Phase.")
          return Mining_Threat_Retreat_Supervisor.Operational_Phase.byOrdinal(0).get
      }
    }

    def parseMining_Threat_Retreat_SupervisorOperational_Phase_Payload(): Mining_Threat_Retreat_Supervisor.Operational_Phase_Payload = {
      val r = parseMining_Threat_Retreat_SupervisorOperational_Phase_PayloadT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorOperational_Phase_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Operational_Phase_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Operational_Phase_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Threat_Retreat_SupervisorOperational_PhaseType()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Operational_Phase_Payload(value)
    }

    def parseMining_Threat_Retreat_SupervisorInput_FaultType(): Mining_Threat_Retreat_Supervisor.Input_Fault.Type = {
      val r = parseMining_Threat_Retreat_SupervisorInput_FaultT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorInput_FaultT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Input_Fault.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Input_Fault")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Mining_Threat_Retreat_Supervisor.Input_Fault.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Mining_Threat_Retreat_Supervisor.Input_Fault.")
          return Mining_Threat_Retreat_Supervisor.Input_Fault.byOrdinal(0).get
      }
    }

    def parseMining_Threat_Retreat_SupervisorInput_Fault_Payload(): Mining_Threat_Retreat_Supervisor.Input_Fault_Payload = {
      val r = parseMining_Threat_Retreat_SupervisorInput_Fault_PayloadT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorInput_Fault_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Input_Fault_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Input_Fault_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Threat_Retreat_SupervisorInput_FaultType()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Input_Fault_Payload(value)
    }

    def parseMining_Threat_Retreat_SupervisorThreat_Observation(): Mining_Threat_Retreat_Supervisor.Threat_Observation = {
      val r = parseMining_Threat_Retreat_SupervisorThreat_ObservationT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorThreat_ObservationT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Threat_Observation = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Threat_Observation")
      }
      parser.parseObjectKey("threat")
      val threat = parseMining_Threat_Retreat_SupervisorThreat_ValueType()
      parser.parseObjectNext()
      parser.parseObjectKey("threat_status")
      val threat_status = parseMining_Threat_Retreat_SupervisorThreat_StatusType()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Threat_Observation(threat, threat_status)
    }

    def parseMining_Threat_Retreat_SupervisorThreat_Observation_Payload(): Mining_Threat_Retreat_Supervisor.Threat_Observation_Payload = {
      val r = parseMining_Threat_Retreat_SupervisorThreat_Observation_PayloadT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorThreat_Observation_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Threat_Observation_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Threat_Observation_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Threat_Retreat_SupervisorThreat_Observation()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Threat_Observation_Payload(value)
    }

    def parseMining_Threat_Retreat_SupervisorCargo_Observation(): Mining_Threat_Retreat_Supervisor.Cargo_Observation = {
      val r = parseMining_Threat_Retreat_SupervisorCargo_ObservationT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorCargo_ObservationT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Cargo_Observation = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Cargo_Observation")
      }
      parser.parseObjectKey("cargo_band")
      val cargo_band = parseMining_Threat_Retreat_SupervisorCargo_BandType()
      parser.parseObjectNext()
      parser.parseObjectKey("cargo_status")
      val cargo_status = parseMining_Threat_Retreat_SupervisorCargo_StatusType()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Cargo_Observation(cargo_band, cargo_status)
    }

    def parseMining_Threat_Retreat_SupervisorCargo_Observation_Payload(): Mining_Threat_Retreat_Supervisor.Cargo_Observation_Payload = {
      val r = parseMining_Threat_Retreat_SupervisorCargo_Observation_PayloadT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorCargo_Observation_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Cargo_Observation_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Cargo_Observation_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Threat_Retreat_SupervisorCargo_Observation()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Cargo_Observation_Payload(value)
    }

    def parseMining_Threat_Retreat_SupervisorCapacitor_Observation(): Mining_Threat_Retreat_Supervisor.Capacitor_Observation = {
      val r = parseMining_Threat_Retreat_SupervisorCapacitor_ObservationT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorCapacitor_ObservationT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Capacitor_Observation = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Capacitor_Observation")
      }
      parser.parseObjectKey("capacitor_band")
      val capacitor_band = parseMining_Threat_Retreat_SupervisorCapacitor_BandType()
      parser.parseObjectNext()
      parser.parseObjectKey("capacitor_status")
      val capacitor_status = parseMining_Threat_Retreat_SupervisorCapacitor_StatusType()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Capacitor_Observation(capacitor_band, capacitor_status)
    }

    def parseMining_Threat_Retreat_SupervisorCapacitor_Observation_Payload(): Mining_Threat_Retreat_Supervisor.Capacitor_Observation_Payload = {
      val r = parseMining_Threat_Retreat_SupervisorCapacitor_Observation_PayloadT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorCapacitor_Observation_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Capacitor_Observation_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Capacitor_Observation_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Threat_Retreat_SupervisorCapacitor_Observation()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Capacitor_Observation_Payload(value)
    }

    def parseMining_Threat_Retreat_SupervisorRequest_Observation(): Mining_Threat_Retreat_Supervisor.Request_Observation = {
      val r = parseMining_Threat_Retreat_SupervisorRequest_ObservationT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorRequest_ObservationT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Request_Observation = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Request_Observation")
      }
      parser.parseObjectKey("operator_request")
      val operator_request = parseMining_Threat_Retreat_SupervisorOperator_RequestType()
      parser.parseObjectNext()
      parser.parseObjectKey("request_status")
      val request_status = parseMining_Threat_Retreat_SupervisorRequest_StatusType()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Request_Observation(operator_request, request_status)
    }

    def parseMining_Threat_Retreat_SupervisorRequest_Observation_Payload(): Mining_Threat_Retreat_Supervisor.Request_Observation_Payload = {
      val r = parseMining_Threat_Retreat_SupervisorRequest_Observation_PayloadT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorRequest_Observation_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Request_Observation_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Request_Observation_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Threat_Retreat_SupervisorRequest_Observation()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Request_Observation_Payload(value)
    }

    def parseMining_Threat_Retreat_SupervisorMining_Availability_Observation(): Mining_Threat_Retreat_Supervisor.Mining_Availability_Observation = {
      val r = parseMining_Threat_Retreat_SupervisorMining_Availability_ObservationT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorMining_Availability_ObservationT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Mining_Availability_Observation = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Mining_Availability_Observation")
      }
      parser.parseObjectKey("mining_available")
      val mining_available = parseMining_Threat_Retreat_SupervisorMining_AvailabilityType()
      parser.parseObjectNext()
      parser.parseObjectKey("mining_availability_status")
      val mining_availability_status = parseMining_Threat_Retreat_SupervisorMining_Availability_StatusType()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Mining_Availability_Observation(mining_available, mining_availability_status)
    }

    def parseMining_Threat_Retreat_SupervisorMining_Availability_Observation_Payload(): Mining_Threat_Retreat_Supervisor.Mining_Availability_Observation_Payload = {
      val r = parseMining_Threat_Retreat_SupervisorMining_Availability_Observation_PayloadT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorMining_Availability_Observation_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Mining_Availability_Observation_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Mining_Availability_Observation_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Threat_Retreat_SupervisorMining_Availability_Observation()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Mining_Availability_Observation_Payload(value)
    }

    def parseMining_Threat_Retreat_SupervisorDefense_Availability_Observation(): Mining_Threat_Retreat_Supervisor.Defense_Availability_Observation = {
      val r = parseMining_Threat_Retreat_SupervisorDefense_Availability_ObservationT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorDefense_Availability_ObservationT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Defense_Availability_Observation = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Defense_Availability_Observation")
      }
      parser.parseObjectKey("defense_available")
      val defense_available = parseMining_Threat_Retreat_SupervisorDefense_AvailabilityType()
      parser.parseObjectNext()
      parser.parseObjectKey("defense_availability_status")
      val defense_availability_status = parseMining_Threat_Retreat_SupervisorDefense_Availability_StatusType()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Defense_Availability_Observation(defense_available, defense_availability_status)
    }

    def parseMining_Threat_Retreat_SupervisorDefense_Availability_Observation_Payload(): Mining_Threat_Retreat_Supervisor.Defense_Availability_Observation_Payload = {
      val r = parseMining_Threat_Retreat_SupervisorDefense_Availability_Observation_PayloadT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorDefense_Availability_Observation_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Defense_Availability_Observation_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Defense_Availability_Observation_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Threat_Retreat_SupervisorDefense_Availability_Observation()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Defense_Availability_Observation_Payload(value)
    }

    def parseMining_Threat_Retreat_SupervisorRetreat_Availability_Observation(): Mining_Threat_Retreat_Supervisor.Retreat_Availability_Observation = {
      val r = parseMining_Threat_Retreat_SupervisorRetreat_Availability_ObservationT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorRetreat_Availability_ObservationT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Retreat_Availability_Observation = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Retreat_Availability_Observation")
      }
      parser.parseObjectKey("retreat_available")
      val retreat_available = parseMining_Threat_Retreat_SupervisorRetreat_AvailabilityType()
      parser.parseObjectNext()
      parser.parseObjectKey("retreat_availability_status")
      val retreat_availability_status = parseMining_Threat_Retreat_SupervisorRetreat_Availability_StatusType()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Retreat_Availability_Observation(retreat_available, retreat_availability_status)
    }

    def parseMining_Threat_Retreat_SupervisorRetreat_Availability_Observation_Payload(): Mining_Threat_Retreat_Supervisor.Retreat_Availability_Observation_Payload = {
      val r = parseMining_Threat_Retreat_SupervisorRetreat_Availability_Observation_PayloadT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorRetreat_Availability_Observation_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Retreat_Availability_Observation_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Retreat_Availability_Observation_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Threat_Retreat_SupervisorRetreat_Availability_Observation()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Retreat_Availability_Observation_Payload(value)
    }

    def parseMining_Threat_Retreat_SupervisorService_Progress_Observation(): Mining_Threat_Retreat_Supervisor.Service_Progress_Observation = {
      val r = parseMining_Threat_Retreat_SupervisorService_Progress_ObservationT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorService_Progress_ObservationT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Service_Progress_Observation = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Service_Progress_Observation")
      }
      parser.parseObjectKey("service_progress")
      val service_progress = parseMining_Threat_Retreat_SupervisorService_ProgressType()
      parser.parseObjectNext()
      parser.parseObjectKey("service_progress_status")
      val service_progress_status = parseMining_Threat_Retreat_SupervisorService_Progress_StatusType()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Service_Progress_Observation(service_progress, service_progress_status)
    }

    def parseMining_Threat_Retreat_SupervisorService_Progress_Observation_Payload(): Mining_Threat_Retreat_Supervisor.Service_Progress_Observation_Payload = {
      val r = parseMining_Threat_Retreat_SupervisorService_Progress_Observation_PayloadT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorService_Progress_Observation_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Service_Progress_Observation_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Service_Progress_Observation_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Threat_Retreat_SupervisorService_Progress_Observation()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Service_Progress_Observation_Payload(value)
    }

    def parseBase_TypesBoolean_Payload(): Base_Types.Boolean_Payload = {
      val r = parseBase_TypesBoolean_PayloadT(F)
      return r
    }

    def parseBase_TypesBoolean_PayloadT(typeParsed: B): Base_Types.Boolean_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Boolean_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseB()
      parser.parseObjectNext()
      return Base_Types.Boolean_Payload(value)
    }

    def parseBase_TypesInteger_Payload(): Base_Types.Integer_Payload = {
      val r = parseBase_TypesInteger_PayloadT(F)
      return r
    }

    def parseBase_TypesInteger_PayloadT(typeParsed: B): Base_Types.Integer_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Integer_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseZ()
      parser.parseObjectNext()
      return Base_Types.Integer_Payload(value)
    }

    def parseBase_TypesInteger_8_Payload(): Base_Types.Integer_8_Payload = {
      val r = parseBase_TypesInteger_8_PayloadT(F)
      return r
    }

    def parseBase_TypesInteger_8_PayloadT(typeParsed: B): Base_Types.Integer_8_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Integer_8_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseS8()
      parser.parseObjectNext()
      return Base_Types.Integer_8_Payload(value)
    }

    def parseBase_TypesInteger_16_Payload(): Base_Types.Integer_16_Payload = {
      val r = parseBase_TypesInteger_16_PayloadT(F)
      return r
    }

    def parseBase_TypesInteger_16_PayloadT(typeParsed: B): Base_Types.Integer_16_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Integer_16_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseS16()
      parser.parseObjectNext()
      return Base_Types.Integer_16_Payload(value)
    }

    def parseBase_TypesInteger_32_Payload(): Base_Types.Integer_32_Payload = {
      val r = parseBase_TypesInteger_32_PayloadT(F)
      return r
    }

    def parseBase_TypesInteger_32_PayloadT(typeParsed: B): Base_Types.Integer_32_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Integer_32_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseS32()
      parser.parseObjectNext()
      return Base_Types.Integer_32_Payload(value)
    }

    def parseBase_TypesInteger_64_Payload(): Base_Types.Integer_64_Payload = {
      val r = parseBase_TypesInteger_64_PayloadT(F)
      return r
    }

    def parseBase_TypesInteger_64_PayloadT(typeParsed: B): Base_Types.Integer_64_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Integer_64_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseS64()
      parser.parseObjectNext()
      return Base_Types.Integer_64_Payload(value)
    }

    def parseBase_TypesUnsigned_8_Payload(): Base_Types.Unsigned_8_Payload = {
      val r = parseBase_TypesUnsigned_8_PayloadT(F)
      return r
    }

    def parseBase_TypesUnsigned_8_PayloadT(typeParsed: B): Base_Types.Unsigned_8_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Unsigned_8_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseU8()
      parser.parseObjectNext()
      return Base_Types.Unsigned_8_Payload(value)
    }

    def parseBase_TypesUnsigned_16_Payload(): Base_Types.Unsigned_16_Payload = {
      val r = parseBase_TypesUnsigned_16_PayloadT(F)
      return r
    }

    def parseBase_TypesUnsigned_16_PayloadT(typeParsed: B): Base_Types.Unsigned_16_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Unsigned_16_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseU16()
      parser.parseObjectNext()
      return Base_Types.Unsigned_16_Payload(value)
    }

    def parseBase_TypesUnsigned_32_Payload(): Base_Types.Unsigned_32_Payload = {
      val r = parseBase_TypesUnsigned_32_PayloadT(F)
      return r
    }

    def parseBase_TypesUnsigned_32_PayloadT(typeParsed: B): Base_Types.Unsigned_32_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Unsigned_32_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseU32()
      parser.parseObjectNext()
      return Base_Types.Unsigned_32_Payload(value)
    }

    def parseBase_TypesUnsigned_64_Payload(): Base_Types.Unsigned_64_Payload = {
      val r = parseBase_TypesUnsigned_64_PayloadT(F)
      return r
    }

    def parseBase_TypesUnsigned_64_PayloadT(typeParsed: B): Base_Types.Unsigned_64_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Unsigned_64_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseU64()
      parser.parseObjectNext()
      return Base_Types.Unsigned_64_Payload(value)
    }

    def parseBase_TypesFloat_Payload(): Base_Types.Float_Payload = {
      val r = parseBase_TypesFloat_PayloadT(F)
      return r
    }

    def parseBase_TypesFloat_PayloadT(typeParsed: B): Base_Types.Float_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Float_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseR()
      parser.parseObjectNext()
      return Base_Types.Float_Payload(value)
    }

    def parseBase_TypesFloat_32_Payload(): Base_Types.Float_32_Payload = {
      val r = parseBase_TypesFloat_32_PayloadT(F)
      return r
    }

    def parseBase_TypesFloat_32_PayloadT(typeParsed: B): Base_Types.Float_32_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Float_32_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseF32()
      parser.parseObjectNext()
      return Base_Types.Float_32_Payload(value)
    }

    def parseBase_TypesFloat_64_Payload(): Base_Types.Float_64_Payload = {
      val r = parseBase_TypesFloat_64_PayloadT(F)
      return r
    }

    def parseBase_TypesFloat_64_PayloadT(typeParsed: B): Base_Types.Float_64_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Float_64_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseF64()
      parser.parseObjectNext()
      return Base_Types.Float_64_Payload(value)
    }

    def parseBase_TypesCharacter_Payload(): Base_Types.Character_Payload = {
      val r = parseBase_TypesCharacter_PayloadT(F)
      return r
    }

    def parseBase_TypesCharacter_PayloadT(typeParsed: B): Base_Types.Character_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Character_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseC()
      parser.parseObjectNext()
      return Base_Types.Character_Payload(value)
    }

    def parseBase_TypesString_Payload(): Base_Types.String_Payload = {
      val r = parseBase_TypesString_PayloadT(F)
      return r
    }

    def parseBase_TypesString_PayloadT(typeParsed: B): Base_Types.String_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.String_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseString()
      parser.parseObjectNext()
      return Base_Types.String_Payload(value)
    }

    def parseBase_TypesBits_Payload(): Base_Types.Bits_Payload = {
      val r = parseBase_TypesBits_PayloadT(F)
      return r
    }

    def parseBase_TypesBits_PayloadT(typeParsed: B): Base_Types.Bits_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Bits_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseISZ(parser.parseB _)
      parser.parseObjectNext()
      return Base_Types.Bits_Payload(value)
    }

    def parseMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container(): Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_P", "Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS"))
      t.native match {
        case "Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PST(T); return r
        case _ => val r = parseMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PST(T); return r
      }
    }

    def parseMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_P(): Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_P = {
      val r = parseMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_P")
      }
      parser.parseObjectKey("api_raw_threat")
      val api_raw_threat = parseMining_Threat_Retreat_SupervisorThreat_Observation()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_P(api_raw_threat)
    }

    def parseMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS(): Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS = {
      val r = parseMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PST(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS")
      }
      parser.parseObjectKey("api_raw_threat")
      val api_raw_threat = parseMining_Threat_Retreat_SupervisorThreat_Observation()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS(api_raw_threat)
    }

    def parseMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container(): Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_P", "Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS"))
      t.native match {
        case "Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PST(T); return r
        case _ => val r = parseMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PST(T); return r
      }
    }

    def parseMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_P(): Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_P = {
      val r = parseMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_P")
      }
      parser.parseObjectKey("api_qualified_threat")
      val api_qualified_threat = parseMining_Threat_Retreat_SupervisorThreat_Observation()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_P(api_qualified_threat)
    }

    def parseMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS(): Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS = {
      val r = parseMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PST(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS")
      }
      parser.parseObjectKey("api_qualified_threat")
      val api_qualified_threat = parseMining_Threat_Retreat_SupervisorThreat_Observation()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS(api_qualified_threat)
    }

    def parseMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container(): Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PreState_Container_P", "Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PreState_Container_PS"))
      t.native match {
        case "Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_PST(T); return r
        case _ => val r = parseMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_PST(T); return r
      }
    }

    def parseMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_P(): Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PreState_Container_P = {
      val r = parseMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_PT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PreState_Container_P")
      }
      parser.parseObjectKey("api_raw_capacitor")
      val api_raw_capacitor = parseMining_Threat_Retreat_SupervisorCapacitor_Observation()
      parser.parseObjectNext()
      parser.parseObjectKey("api_raw_cargo")
      val api_raw_cargo = parseMining_Threat_Retreat_SupervisorCargo_Observation()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PreState_Container_P(api_raw_capacitor, api_raw_cargo)
    }

    def parseMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_PS(): Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PreState_Container_PS = {
      val r = parseMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_PST(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PreState_Container_PS")
      }
      parser.parseObjectKey("api_raw_capacitor")
      val api_raw_capacitor = parseMining_Threat_Retreat_SupervisorCapacitor_Observation()
      parser.parseObjectNext()
      parser.parseObjectKey("api_raw_cargo")
      val api_raw_cargo = parseMining_Threat_Retreat_SupervisorCargo_Observation()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PreState_Container_PS(api_raw_capacitor, api_raw_cargo)
    }

    def parseMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container(): Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PostState_Container_P", "Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PostState_Container_PS"))
      t.native match {
        case "Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_PST(T); return r
        case _ => val r = parseMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_PST(T); return r
      }
    }

    def parseMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_P(): Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PostState_Container_P = {
      val r = parseMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_PT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PostState_Container_P")
      }
      parser.parseObjectKey("api_qualified_capacitor")
      val api_qualified_capacitor = parseMining_Threat_Retreat_SupervisorCapacitor_Observation()
      parser.parseObjectNext()
      parser.parseObjectKey("api_qualified_cargo")
      val api_qualified_cargo = parseMining_Threat_Retreat_SupervisorCargo_Observation()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PostState_Container_P(api_qualified_capacitor, api_qualified_cargo)
    }

    def parseMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_PS(): Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PostState_Container_PS = {
      val r = parseMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_PST(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PostState_Container_PS")
      }
      parser.parseObjectKey("api_qualified_capacitor")
      val api_qualified_capacitor = parseMining_Threat_Retreat_SupervisorCapacitor_Observation()
      parser.parseObjectNext()
      parser.parseObjectKey("api_qualified_cargo")
      val api_qualified_cargo = parseMining_Threat_Retreat_SupervisorCargo_Observation()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PostState_Container_PS(api_qualified_capacitor, api_qualified_cargo)
    }

    def parseMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container(): Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_P", "Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PS"))
      t.native match {
        case "Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PST(T); return r
        case _ => val r = parseMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PST(T); return r
      }
    }

    def parseMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_P(): Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_P = {
      val r = parseMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_P")
      }
      parser.parseObjectKey("api_raw_defense_availability")
      val api_raw_defense_availability = parseMining_Threat_Retreat_SupervisorDefense_Availability_Observation()
      parser.parseObjectNext()
      parser.parseObjectKey("api_raw_mining_availability")
      val api_raw_mining_availability = parseMining_Threat_Retreat_SupervisorMining_Availability_Observation()
      parser.parseObjectNext()
      parser.parseObjectKey("api_raw_request")
      val api_raw_request = parseMining_Threat_Retreat_SupervisorRequest_Observation()
      parser.parseObjectNext()
      parser.parseObjectKey("api_raw_retreat_availability")
      val api_raw_retreat_availability = parseMining_Threat_Retreat_SupervisorRetreat_Availability_Observation()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_P(api_raw_defense_availability, api_raw_mining_availability, api_raw_request, api_raw_retreat_availability)
    }

    def parseMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PS(): Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PS = {
      val r = parseMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PST(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PS")
      }
      parser.parseObjectKey("api_raw_defense_availability")
      val api_raw_defense_availability = parseMining_Threat_Retreat_SupervisorDefense_Availability_Observation()
      parser.parseObjectNext()
      parser.parseObjectKey("api_raw_mining_availability")
      val api_raw_mining_availability = parseMining_Threat_Retreat_SupervisorMining_Availability_Observation()
      parser.parseObjectNext()
      parser.parseObjectKey("api_raw_request")
      val api_raw_request = parseMining_Threat_Retreat_SupervisorRequest_Observation()
      parser.parseObjectNext()
      parser.parseObjectKey("api_raw_retreat_availability")
      val api_raw_retreat_availability = parseMining_Threat_Retreat_SupervisorRetreat_Availability_Observation()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PS(api_raw_defense_availability, api_raw_mining_availability, api_raw_request, api_raw_retreat_availability)
    }

    def parseMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container(): Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_P", "Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PS"))
      t.native match {
        case "Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PST(T); return r
        case _ => val r = parseMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PST(T); return r
      }
    }

    def parseMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_P(): Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_P = {
      val r = parseMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_P")
      }
      parser.parseObjectKey("api_qualified_defense_availability")
      val api_qualified_defense_availability = parseMining_Threat_Retreat_SupervisorDefense_Availability_Observation()
      parser.parseObjectNext()
      parser.parseObjectKey("api_qualified_mining_availability")
      val api_qualified_mining_availability = parseMining_Threat_Retreat_SupervisorMining_Availability_Observation()
      parser.parseObjectNext()
      parser.parseObjectKey("api_qualified_request")
      val api_qualified_request = parseMining_Threat_Retreat_SupervisorRequest_Observation()
      parser.parseObjectNext()
      parser.parseObjectKey("api_qualified_retreat_availability")
      val api_qualified_retreat_availability = parseMining_Threat_Retreat_SupervisorRetreat_Availability_Observation()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_P(api_qualified_defense_availability, api_qualified_mining_availability, api_qualified_request, api_qualified_retreat_availability)
    }

    def parseMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PS(): Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PS = {
      val r = parseMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PST(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PS")
      }
      parser.parseObjectKey("api_qualified_defense_availability")
      val api_qualified_defense_availability = parseMining_Threat_Retreat_SupervisorDefense_Availability_Observation()
      parser.parseObjectNext()
      parser.parseObjectKey("api_qualified_mining_availability")
      val api_qualified_mining_availability = parseMining_Threat_Retreat_SupervisorMining_Availability_Observation()
      parser.parseObjectNext()
      parser.parseObjectKey("api_qualified_request")
      val api_qualified_request = parseMining_Threat_Retreat_SupervisorRequest_Observation()
      parser.parseObjectNext()
      parser.parseObjectKey("api_qualified_retreat_availability")
      val api_qualified_retreat_availability = parseMining_Threat_Retreat_SupervisorRetreat_Availability_Observation()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PS(api_qualified_defense_availability, api_qualified_mining_availability, api_qualified_request, api_qualified_retreat_availability)
    }

    def parseMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container(): Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_P", "Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PS"))
      t.native match {
        case "Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PST(T); return r
        case _ => val r = parseMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PST(T); return r
      }
    }

    def parseMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_P(): Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_P = {
      val r = parseMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_P")
      }
      parser.parseObjectKey("api_capacitor_input")
      val api_capacitor_input = parseMining_Threat_Retreat_SupervisorCapacitor_Observation()
      parser.parseObjectNext()
      parser.parseObjectKey("api_cargo_input")
      val api_cargo_input = parseMining_Threat_Retreat_SupervisorCargo_Observation()
      parser.parseObjectNext()
      parser.parseObjectKey("api_defense_availability_input")
      val api_defense_availability_input = parseMining_Threat_Retreat_SupervisorDefense_Availability_Observation()
      parser.parseObjectNext()
      parser.parseObjectKey("api_mining_availability_input")
      val api_mining_availability_input = parseMining_Threat_Retreat_SupervisorMining_Availability_Observation()
      parser.parseObjectNext()
      parser.parseObjectKey("api_request_input")
      val api_request_input = parseMining_Threat_Retreat_SupervisorRequest_Observation()
      parser.parseObjectNext()
      parser.parseObjectKey("api_retreat_availability_input")
      val api_retreat_availability_input = parseMining_Threat_Retreat_SupervisorRetreat_Availability_Observation()
      parser.parseObjectNext()
      parser.parseObjectKey("api_service_progress_input")
      val api_service_progress_input = parseMining_Threat_Retreat_SupervisorService_Progress_Observation()
      parser.parseObjectNext()
      parser.parseObjectKey("api_threat_input")
      val api_threat_input = parseMining_Threat_Retreat_SupervisorThreat_Observation()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_P(api_capacitor_input, api_cargo_input, api_defense_availability_input, api_mining_availability_input, api_request_input, api_retreat_availability_input, api_service_progress_input, api_threat_input)
    }

    def parseMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PS(): Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PS = {
      val r = parseMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PST(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PS")
      }
      parser.parseObjectKey("In_current_phase")
      val In_current_phase = parseMining_Threat_Retreat_SupervisorOperational_PhaseType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_capacitor_input")
      val api_capacitor_input = parseMining_Threat_Retreat_SupervisorCapacitor_Observation()
      parser.parseObjectNext()
      parser.parseObjectKey("api_cargo_input")
      val api_cargo_input = parseMining_Threat_Retreat_SupervisorCargo_Observation()
      parser.parseObjectNext()
      parser.parseObjectKey("api_defense_availability_input")
      val api_defense_availability_input = parseMining_Threat_Retreat_SupervisorDefense_Availability_Observation()
      parser.parseObjectNext()
      parser.parseObjectKey("api_mining_availability_input")
      val api_mining_availability_input = parseMining_Threat_Retreat_SupervisorMining_Availability_Observation()
      parser.parseObjectNext()
      parser.parseObjectKey("api_request_input")
      val api_request_input = parseMining_Threat_Retreat_SupervisorRequest_Observation()
      parser.parseObjectNext()
      parser.parseObjectKey("api_retreat_availability_input")
      val api_retreat_availability_input = parseMining_Threat_Retreat_SupervisorRetreat_Availability_Observation()
      parser.parseObjectNext()
      parser.parseObjectKey("api_service_progress_input")
      val api_service_progress_input = parseMining_Threat_Retreat_SupervisorService_Progress_Observation()
      parser.parseObjectNext()
      parser.parseObjectKey("api_threat_input")
      val api_threat_input = parseMining_Threat_Retreat_SupervisorThreat_Observation()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PS(In_current_phase, api_capacitor_input, api_cargo_input, api_defense_availability_input, api_mining_availability_input, api_request_input, api_retreat_availability_input, api_service_progress_input, api_threat_input)
    }

    def parseMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container(): Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_P", "Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PS"))
      t.native match {
        case "Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PST(T); return r
        case _ => val r = parseMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PST(T); return r
      }
    }

    def parseMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_P(): Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_P = {
      val r = parseMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_P")
      }
      parser.parseObjectKey("api_defense_decision")
      val api_defense_decision = parseMining_Threat_Retreat_SupervisorDefense_CommandType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_fault_decision")
      val api_fault_decision = parseMining_Threat_Retreat_SupervisorInput_FaultType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_mining_decision")
      val api_mining_decision = parseMining_Threat_Retreat_SupervisorMining_CommandType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_movement_service_decision")
      val api_movement_service_decision = parseMining_Threat_Retreat_SupervisorMovement_Service_CommandType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_phase_decision")
      val api_phase_decision = parseMining_Threat_Retreat_SupervisorOperational_PhaseType()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_P(api_defense_decision, api_fault_decision, api_mining_decision, api_movement_service_decision, api_phase_decision)
    }

    def parseMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PS(): Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PS = {
      val r = parseMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PST(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PS")
      }
      parser.parseObjectKey("current_phase")
      val current_phase = parseMining_Threat_Retreat_SupervisorOperational_PhaseType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_defense_decision")
      val api_defense_decision = parseMining_Threat_Retreat_SupervisorDefense_CommandType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_fault_decision")
      val api_fault_decision = parseMining_Threat_Retreat_SupervisorInput_FaultType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_mining_decision")
      val api_mining_decision = parseMining_Threat_Retreat_SupervisorMining_CommandType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_movement_service_decision")
      val api_movement_service_decision = parseMining_Threat_Retreat_SupervisorMovement_Service_CommandType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_phase_decision")
      val api_phase_decision = parseMining_Threat_Retreat_SupervisorOperational_PhaseType()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PS(current_phase, api_defense_decision, api_fault_decision, api_mining_decision, api_movement_service_decision, api_phase_decision)
    }

    def parseMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container(): Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_P", "Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PS"))
      t.native match {
        case "Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PST(T); return r
        case _ => val r = parseMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PST(T); return r
      }
    }

    def parseMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_P(): Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_P = {
      val r = parseMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_P")
      }
      parser.parseObjectKey("api_mining_in")
      val api_mining_in = parseMining_Threat_Retreat_SupervisorMining_CommandType()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_P(api_mining_in)
    }

    def parseMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PS(): Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PS = {
      val r = parseMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PST(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PS")
      }
      parser.parseObjectKey("api_mining_in")
      val api_mining_in = parseMining_Threat_Retreat_SupervisorMining_CommandType()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PS(api_mining_in)
    }

    def parseMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container(): Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_P", "Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PS"))
      t.native match {
        case "Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PST(T); return r
        case _ => val r = parseMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PST(T); return r
      }
    }

    def parseMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_P(): Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_P = {
      val r = parseMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_P")
      }
      parser.parseObjectKey("api_mining_out")
      val api_mining_out = parseMining_Threat_Retreat_SupervisorMining_CommandType()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_P(api_mining_out)
    }

    def parseMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PS(): Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PS = {
      val r = parseMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PST(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PS")
      }
      parser.parseObjectKey("api_mining_out")
      val api_mining_out = parseMining_Threat_Retreat_SupervisorMining_CommandType()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PS(api_mining_out)
    }

    def parseMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container(): Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_P", "Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PS"))
      t.native match {
        case "Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PST(T); return r
        case _ => val r = parseMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PST(T); return r
      }
    }

    def parseMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_P(): Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_P = {
      val r = parseMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_P")
      }
      parser.parseObjectKey("api_defense_in")
      val api_defense_in = parseMining_Threat_Retreat_SupervisorDefense_CommandType()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_P(api_defense_in)
    }

    def parseMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PS(): Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PS = {
      val r = parseMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PST(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PS")
      }
      parser.parseObjectKey("api_defense_in")
      val api_defense_in = parseMining_Threat_Retreat_SupervisorDefense_CommandType()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PS(api_defense_in)
    }

    def parseMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container(): Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_P", "Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PS"))
      t.native match {
        case "Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PST(T); return r
        case _ => val r = parseMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PST(T); return r
      }
    }

    def parseMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_P(): Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_P = {
      val r = parseMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_P")
      }
      parser.parseObjectKey("api_defense_out")
      val api_defense_out = parseMining_Threat_Retreat_SupervisorDefense_CommandType()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_P(api_defense_out)
    }

    def parseMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PS(): Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PS = {
      val r = parseMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PST(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PS")
      }
      parser.parseObjectKey("api_defense_out")
      val api_defense_out = parseMining_Threat_Retreat_SupervisorDefense_CommandType()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PS(api_defense_out)
    }

    def parseMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container(): Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_P", "Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PS"))
      t.native match {
        case "Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PST(T); return r
        case _ => val r = parseMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PST(T); return r
      }
    }

    def parseMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_P(): Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_P = {
      val r = parseMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_P")
      }
      parser.parseObjectKey("api_movement_service_in")
      val api_movement_service_in = parseMining_Threat_Retreat_SupervisorMovement_Service_CommandType()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_P(api_movement_service_in)
    }

    def parseMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PS(): Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PS = {
      val r = parseMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PST(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PS")
      }
      parser.parseObjectKey("api_movement_service_in")
      val api_movement_service_in = parseMining_Threat_Retreat_SupervisorMovement_Service_CommandType()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PS(api_movement_service_in)
    }

    def parseMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container(): Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_P", "Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PS"))
      t.native match {
        case "Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PST(T); return r
        case _ => val r = parseMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PST(T); return r
      }
    }

    def parseMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_P(): Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_P = {
      val r = parseMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_P")
      }
      parser.parseObjectKey("api_movement_service_out")
      val api_movement_service_out = parseMining_Threat_Retreat_SupervisorMovement_Service_CommandType()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_P(api_movement_service_out)
    }

    def parseMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PS(): Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PS = {
      val r = parseMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PST(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PS")
      }
      parser.parseObjectKey("api_movement_service_out")
      val api_movement_service_out = parseMining_Threat_Retreat_SupervisorMovement_Service_CommandType()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PS(api_movement_service_out)
    }

    def parseruntimemonitorObservationKindType(): runtimemonitor.ObservationKind.Type = {
      val r = parseruntimemonitorObservationKindT(F)
      return r
    }

    def parseruntimemonitorObservationKindT(typeParsed: B): runtimemonitor.ObservationKind.Type = {
      if (!typeParsed) {
        parser.parseObjectType("runtimemonitor.ObservationKind")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      runtimemonitor.ObservationKind.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for runtimemonitor.ObservationKind.")
          return runtimemonitor.ObservationKind.byOrdinal(0).get
      }
    }

    def parseutilContainer(): util.Container = {
      val t = parser.parseObjectTypes(ISZ("util.EmptyContainer", "Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_P", "Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS", "Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_P", "Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS", "Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PreState_Container_P", "Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PreState_Container_PS", "Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PostState_Container_P", "Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PostState_Container_PS", "Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_P", "Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PS", "Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_P", "Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PS", "Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_P", "Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PS", "Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_P", "Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_P", "Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PS", "Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PS", "Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_P", "Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PS", "Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_P", "Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PS", "Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_P", "Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PS", "Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_P", "Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PS", "Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_P", "Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PS"))
      t.native match {
        case "util.EmptyContainer" => val r = parseutilEmptyContainerT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PST(T); return r
        case _ => val r = parseMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PST(T); return r
      }
    }

    def parseutilEmptyContainer(): util.EmptyContainer = {
      val r = parseutilEmptyContainerT(F)
      return r
    }

    def parseutilEmptyContainerT(typeParsed: B): util.EmptyContainer = {
      if (!typeParsed) {
        parser.parseObjectType("util.EmptyContainer")
      }
      return util.EmptyContainer()
    }

    def parse_artDataContent(): art.DataContent = {
      val t = parser.parseObjectTypes(ISZ("art.Empty", "Base_Types.Boolean_Payload", "Base_Types.Integer_Payload", "Base_Types.Integer_8_Payload", "Base_Types.Integer_16_Payload", "Base_Types.Integer_32_Payload", "Base_Types.Integer_64_Payload", "Base_Types.Unsigned_8_Payload", "Base_Types.Unsigned_16_Payload", "Base_Types.Unsigned_32_Payload", "Base_Types.Unsigned_64_Payload", "Base_Types.Float_Payload", "Base_Types.Float_32_Payload", "Base_Types.Float_64_Payload", "Base_Types.Character_Payload", "Base_Types.String_Payload", "Base_Types.Bits_Payload", "util.EmptyContainer", "Mining_Threat_Retreat_Supervisor.Cargo_Band_Payload", "Mining_Threat_Retreat_Supervisor.Input_Fault_Payload", "Mining_Threat_Retreat_Supervisor.Cargo_Status_Payload", "Mining_Threat_Retreat_Supervisor.Threat_Value_Payload", "Mining_Threat_Retreat_Supervisor.Threat_Status_Payload", "Mining_Threat_Retreat_Supervisor.Mining_Command_Payload", "Mining_Threat_Retreat_Supervisor.Request_Status_Payload", "Mining_Threat_Retreat_Supervisor.Capacitor_Band_Payload", "Mining_Threat_Retreat_Supervisor.Defense_Command_Payload", "Mining_Threat_Retreat_Supervisor.Capacitor_Status_Payload", "Mining_Threat_Retreat_Supervisor.Operator_Request_Payload", "Mining_Threat_Retreat_Supervisor.Service_Progress_Payload", "Mining_Threat_Retreat_Supervisor.Operational_Phase_Payload", "Mining_Threat_Retreat_Supervisor.Cargo_Observation_Payload", "Mining_Threat_Retreat_Supervisor.Threat_Observation_Payload", "Mining_Threat_Retreat_Supervisor.Mining_Availability_Payload", "Mining_Threat_Retreat_Supervisor.Request_Observation_Payload", "Mining_Threat_Retreat_Supervisor.Defense_Availability_Payload", "Mining_Threat_Retreat_Supervisor.Retreat_Availability_Payload", "Mining_Threat_Retreat_Supervisor.Capacitor_Observation_Payload", "Mining_Threat_Retreat_Supervisor.Service_Progress_Status_Payload", "Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Payload", "Mining_Threat_Retreat_Supervisor.Mining_Availability_Status_Payload", "Mining_Threat_Retreat_Supervisor.Defense_Availability_Status_Payload", "Mining_Threat_Retreat_Supervisor.Retreat_Availability_Status_Payload", "Mining_Threat_Retreat_Supervisor.Service_Progress_Observation_Payload", "Mining_Threat_Retreat_Supervisor.Mining_Availability_Observation_Payload", "Mining_Threat_Retreat_Supervisor.Defense_Availability_Observation_Payload", "Mining_Threat_Retreat_Supervisor.Retreat_Availability_Observation_Payload", "Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_P", "Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS", "Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_P", "Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS", "Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PreState_Container_P", "Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PreState_Container_PS", "Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PostState_Container_P", "Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PostState_Container_PS", "Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_P", "Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PS", "Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_P", "Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PS", "Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_P", "Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PS", "Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_P", "Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_P", "Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PS", "Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PS", "Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_P", "Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PS", "Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_P", "Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PS", "Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_P", "Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PS", "Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_P", "Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PS", "Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_P", "Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PS"))
      t.native match {
        case "art.Empty" => val r = parse_artEmptyT(T); return r
        case "Base_Types.Boolean_Payload" => val r = parseBase_TypesBoolean_PayloadT(T); return r
        case "Base_Types.Integer_Payload" => val r = parseBase_TypesInteger_PayloadT(T); return r
        case "Base_Types.Integer_8_Payload" => val r = parseBase_TypesInteger_8_PayloadT(T); return r
        case "Base_Types.Integer_16_Payload" => val r = parseBase_TypesInteger_16_PayloadT(T); return r
        case "Base_Types.Integer_32_Payload" => val r = parseBase_TypesInteger_32_PayloadT(T); return r
        case "Base_Types.Integer_64_Payload" => val r = parseBase_TypesInteger_64_PayloadT(T); return r
        case "Base_Types.Unsigned_8_Payload" => val r = parseBase_TypesUnsigned_8_PayloadT(T); return r
        case "Base_Types.Unsigned_16_Payload" => val r = parseBase_TypesUnsigned_16_PayloadT(T); return r
        case "Base_Types.Unsigned_32_Payload" => val r = parseBase_TypesUnsigned_32_PayloadT(T); return r
        case "Base_Types.Unsigned_64_Payload" => val r = parseBase_TypesUnsigned_64_PayloadT(T); return r
        case "Base_Types.Float_Payload" => val r = parseBase_TypesFloat_PayloadT(T); return r
        case "Base_Types.Float_32_Payload" => val r = parseBase_TypesFloat_32_PayloadT(T); return r
        case "Base_Types.Float_64_Payload" => val r = parseBase_TypesFloat_64_PayloadT(T); return r
        case "Base_Types.Character_Payload" => val r = parseBase_TypesCharacter_PayloadT(T); return r
        case "Base_Types.String_Payload" => val r = parseBase_TypesString_PayloadT(T); return r
        case "Base_Types.Bits_Payload" => val r = parseBase_TypesBits_PayloadT(T); return r
        case "util.EmptyContainer" => val r = parseutilEmptyContainerT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Cargo_Band_Payload" => val r = parseMining_Threat_Retreat_SupervisorCargo_Band_PayloadT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Input_Fault_Payload" => val r = parseMining_Threat_Retreat_SupervisorInput_Fault_PayloadT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Cargo_Status_Payload" => val r = parseMining_Threat_Retreat_SupervisorCargo_Status_PayloadT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Threat_Value_Payload" => val r = parseMining_Threat_Retreat_SupervisorThreat_Value_PayloadT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Threat_Status_Payload" => val r = parseMining_Threat_Retreat_SupervisorThreat_Status_PayloadT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Mining_Command_Payload" => val r = parseMining_Threat_Retreat_SupervisorMining_Command_PayloadT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Request_Status_Payload" => val r = parseMining_Threat_Retreat_SupervisorRequest_Status_PayloadT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Capacitor_Band_Payload" => val r = parseMining_Threat_Retreat_SupervisorCapacitor_Band_PayloadT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Defense_Command_Payload" => val r = parseMining_Threat_Retreat_SupervisorDefense_Command_PayloadT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Capacitor_Status_Payload" => val r = parseMining_Threat_Retreat_SupervisorCapacitor_Status_PayloadT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Operator_Request_Payload" => val r = parseMining_Threat_Retreat_SupervisorOperator_Request_PayloadT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Service_Progress_Payload" => val r = parseMining_Threat_Retreat_SupervisorService_Progress_PayloadT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Operational_Phase_Payload" => val r = parseMining_Threat_Retreat_SupervisorOperational_Phase_PayloadT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Cargo_Observation_Payload" => val r = parseMining_Threat_Retreat_SupervisorCargo_Observation_PayloadT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Threat_Observation_Payload" => val r = parseMining_Threat_Retreat_SupervisorThreat_Observation_PayloadT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Mining_Availability_Payload" => val r = parseMining_Threat_Retreat_SupervisorMining_Availability_PayloadT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Request_Observation_Payload" => val r = parseMining_Threat_Retreat_SupervisorRequest_Observation_PayloadT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Defense_Availability_Payload" => val r = parseMining_Threat_Retreat_SupervisorDefense_Availability_PayloadT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Retreat_Availability_Payload" => val r = parseMining_Threat_Retreat_SupervisorRetreat_Availability_PayloadT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Capacitor_Observation_Payload" => val r = parseMining_Threat_Retreat_SupervisorCapacitor_Observation_PayloadT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Service_Progress_Status_Payload" => val r = parseMining_Threat_Retreat_SupervisorService_Progress_Status_PayloadT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Payload" => val r = parseMining_Threat_Retreat_SupervisorMovement_Service_Command_PayloadT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Mining_Availability_Status_Payload" => val r = parseMining_Threat_Retreat_SupervisorMining_Availability_Status_PayloadT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Defense_Availability_Status_Payload" => val r = parseMining_Threat_Retreat_SupervisorDefense_Availability_Status_PayloadT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Retreat_Availability_Status_Payload" => val r = parseMining_Threat_Retreat_SupervisorRetreat_Availability_Status_PayloadT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Service_Progress_Observation_Payload" => val r = parseMining_Threat_Retreat_SupervisorService_Progress_Observation_PayloadT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Mining_Availability_Observation_Payload" => val r = parseMining_Threat_Retreat_SupervisorMining_Availability_Observation_PayloadT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Defense_Availability_Observation_Payload" => val r = parseMining_Threat_Retreat_SupervisorDefense_Availability_Observation_PayloadT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Retreat_Availability_Observation_Payload" => val r = parseMining_Threat_Retreat_SupervisorRetreat_Availability_Observation_PayloadT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PST(T); return r
        case _ => val r = parseMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PST(T); return r
      }
    }

    def parse_artEmpty(): art.Empty = {
      val r = parse_artEmptyT(F)
      return r
    }

    def parse_artEmptyT(typeParsed: B): art.Empty = {
      if (!typeParsed) {
        parser.parseObjectType("art.Empty")
      }
      return art.Empty()
    }

    def eof(): B = {
      val r = parser.eof()
      return r
    }

  }

  def to[T](s: String, f: Parser => T): Either[T, Json.ErrorMsg] = {
    val parser = Parser(s)
    val r = f(parser)
    parser.eof()
    parser.errorOpt match {
      case Some(e) => return Either.Right(e)
      case _ => return Either.Left(r)
    }
  }

  def fromMining_Threat_Retreat_SupervisorThreat_Value_Payload(o: Mining_Threat_Retreat_Supervisor.Threat_Value_Payload, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorThreat_Value_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorThreat_Value_Payload(s: String): Either[Mining_Threat_Retreat_Supervisor.Threat_Value_Payload, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorThreat_Value_Payload(parser: Parser): Mining_Threat_Retreat_Supervisor.Threat_Value_Payload = {
      val r = parser.parseMining_Threat_Retreat_SupervisorThreat_Value_Payload()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorThreat_Value_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorThreat_Status_Payload(o: Mining_Threat_Retreat_Supervisor.Threat_Status_Payload, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorThreat_Status_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorThreat_Status_Payload(s: String): Either[Mining_Threat_Retreat_Supervisor.Threat_Status_Payload, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorThreat_Status_Payload(parser: Parser): Mining_Threat_Retreat_Supervisor.Threat_Status_Payload = {
      val r = parser.parseMining_Threat_Retreat_SupervisorThreat_Status_Payload()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorThreat_Status_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorCargo_Band_Payload(o: Mining_Threat_Retreat_Supervisor.Cargo_Band_Payload, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorCargo_Band_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorCargo_Band_Payload(s: String): Either[Mining_Threat_Retreat_Supervisor.Cargo_Band_Payload, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorCargo_Band_Payload(parser: Parser): Mining_Threat_Retreat_Supervisor.Cargo_Band_Payload = {
      val r = parser.parseMining_Threat_Retreat_SupervisorCargo_Band_Payload()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorCargo_Band_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorCargo_Status_Payload(o: Mining_Threat_Retreat_Supervisor.Cargo_Status_Payload, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorCargo_Status_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorCargo_Status_Payload(s: String): Either[Mining_Threat_Retreat_Supervisor.Cargo_Status_Payload, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorCargo_Status_Payload(parser: Parser): Mining_Threat_Retreat_Supervisor.Cargo_Status_Payload = {
      val r = parser.parseMining_Threat_Retreat_SupervisorCargo_Status_Payload()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorCargo_Status_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorCapacitor_Band_Payload(o: Mining_Threat_Retreat_Supervisor.Capacitor_Band_Payload, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorCapacitor_Band_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorCapacitor_Band_Payload(s: String): Either[Mining_Threat_Retreat_Supervisor.Capacitor_Band_Payload, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorCapacitor_Band_Payload(parser: Parser): Mining_Threat_Retreat_Supervisor.Capacitor_Band_Payload = {
      val r = parser.parseMining_Threat_Retreat_SupervisorCapacitor_Band_Payload()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorCapacitor_Band_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorCapacitor_Status_Payload(o: Mining_Threat_Retreat_Supervisor.Capacitor_Status_Payload, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorCapacitor_Status_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorCapacitor_Status_Payload(s: String): Either[Mining_Threat_Retreat_Supervisor.Capacitor_Status_Payload, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorCapacitor_Status_Payload(parser: Parser): Mining_Threat_Retreat_Supervisor.Capacitor_Status_Payload = {
      val r = parser.parseMining_Threat_Retreat_SupervisorCapacitor_Status_Payload()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorCapacitor_Status_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorOperator_Request_Payload(o: Mining_Threat_Retreat_Supervisor.Operator_Request_Payload, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorOperator_Request_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorOperator_Request_Payload(s: String): Either[Mining_Threat_Retreat_Supervisor.Operator_Request_Payload, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorOperator_Request_Payload(parser: Parser): Mining_Threat_Retreat_Supervisor.Operator_Request_Payload = {
      val r = parser.parseMining_Threat_Retreat_SupervisorOperator_Request_Payload()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorOperator_Request_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorRequest_Status_Payload(o: Mining_Threat_Retreat_Supervisor.Request_Status_Payload, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorRequest_Status_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorRequest_Status_Payload(s: String): Either[Mining_Threat_Retreat_Supervisor.Request_Status_Payload, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorRequest_Status_Payload(parser: Parser): Mining_Threat_Retreat_Supervisor.Request_Status_Payload = {
      val r = parser.parseMining_Threat_Retreat_SupervisorRequest_Status_Payload()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorRequest_Status_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorMining_Availability_Payload(o: Mining_Threat_Retreat_Supervisor.Mining_Availability_Payload, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorMining_Availability_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorMining_Availability_Payload(s: String): Either[Mining_Threat_Retreat_Supervisor.Mining_Availability_Payload, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorMining_Availability_Payload(parser: Parser): Mining_Threat_Retreat_Supervisor.Mining_Availability_Payload = {
      val r = parser.parseMining_Threat_Retreat_SupervisorMining_Availability_Payload()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorMining_Availability_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorMining_Availability_Status_Payload(o: Mining_Threat_Retreat_Supervisor.Mining_Availability_Status_Payload, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorMining_Availability_Status_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorMining_Availability_Status_Payload(s: String): Either[Mining_Threat_Retreat_Supervisor.Mining_Availability_Status_Payload, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorMining_Availability_Status_Payload(parser: Parser): Mining_Threat_Retreat_Supervisor.Mining_Availability_Status_Payload = {
      val r = parser.parseMining_Threat_Retreat_SupervisorMining_Availability_Status_Payload()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorMining_Availability_Status_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorDefense_Availability_Payload(o: Mining_Threat_Retreat_Supervisor.Defense_Availability_Payload, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorDefense_Availability_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorDefense_Availability_Payload(s: String): Either[Mining_Threat_Retreat_Supervisor.Defense_Availability_Payload, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorDefense_Availability_Payload(parser: Parser): Mining_Threat_Retreat_Supervisor.Defense_Availability_Payload = {
      val r = parser.parseMining_Threat_Retreat_SupervisorDefense_Availability_Payload()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorDefense_Availability_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorDefense_Availability_Status_Payload(o: Mining_Threat_Retreat_Supervisor.Defense_Availability_Status_Payload, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorDefense_Availability_Status_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorDefense_Availability_Status_Payload(s: String): Either[Mining_Threat_Retreat_Supervisor.Defense_Availability_Status_Payload, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorDefense_Availability_Status_Payload(parser: Parser): Mining_Threat_Retreat_Supervisor.Defense_Availability_Status_Payload = {
      val r = parser.parseMining_Threat_Retreat_SupervisorDefense_Availability_Status_Payload()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorDefense_Availability_Status_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorRetreat_Availability_Payload(o: Mining_Threat_Retreat_Supervisor.Retreat_Availability_Payload, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorRetreat_Availability_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorRetreat_Availability_Payload(s: String): Either[Mining_Threat_Retreat_Supervisor.Retreat_Availability_Payload, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorRetreat_Availability_Payload(parser: Parser): Mining_Threat_Retreat_Supervisor.Retreat_Availability_Payload = {
      val r = parser.parseMining_Threat_Retreat_SupervisorRetreat_Availability_Payload()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorRetreat_Availability_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorRetreat_Availability_Status_Payload(o: Mining_Threat_Retreat_Supervisor.Retreat_Availability_Status_Payload, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorRetreat_Availability_Status_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorRetreat_Availability_Status_Payload(s: String): Either[Mining_Threat_Retreat_Supervisor.Retreat_Availability_Status_Payload, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorRetreat_Availability_Status_Payload(parser: Parser): Mining_Threat_Retreat_Supervisor.Retreat_Availability_Status_Payload = {
      val r = parser.parseMining_Threat_Retreat_SupervisorRetreat_Availability_Status_Payload()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorRetreat_Availability_Status_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorService_Progress_Payload(o: Mining_Threat_Retreat_Supervisor.Service_Progress_Payload, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorService_Progress_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorService_Progress_Payload(s: String): Either[Mining_Threat_Retreat_Supervisor.Service_Progress_Payload, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorService_Progress_Payload(parser: Parser): Mining_Threat_Retreat_Supervisor.Service_Progress_Payload = {
      val r = parser.parseMining_Threat_Retreat_SupervisorService_Progress_Payload()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorService_Progress_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorService_Progress_Status_Payload(o: Mining_Threat_Retreat_Supervisor.Service_Progress_Status_Payload, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorService_Progress_Status_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorService_Progress_Status_Payload(s: String): Either[Mining_Threat_Retreat_Supervisor.Service_Progress_Status_Payload, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorService_Progress_Status_Payload(parser: Parser): Mining_Threat_Retreat_Supervisor.Service_Progress_Status_Payload = {
      val r = parser.parseMining_Threat_Retreat_SupervisorService_Progress_Status_Payload()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorService_Progress_Status_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorMining_Command_Payload(o: Mining_Threat_Retreat_Supervisor.Mining_Command_Payload, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorMining_Command_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorMining_Command_Payload(s: String): Either[Mining_Threat_Retreat_Supervisor.Mining_Command_Payload, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorMining_Command_Payload(parser: Parser): Mining_Threat_Retreat_Supervisor.Mining_Command_Payload = {
      val r = parser.parseMining_Threat_Retreat_SupervisorMining_Command_Payload()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorMining_Command_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorDefense_Command_Payload(o: Mining_Threat_Retreat_Supervisor.Defense_Command_Payload, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorDefense_Command_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorDefense_Command_Payload(s: String): Either[Mining_Threat_Retreat_Supervisor.Defense_Command_Payload, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorDefense_Command_Payload(parser: Parser): Mining_Threat_Retreat_Supervisor.Defense_Command_Payload = {
      val r = parser.parseMining_Threat_Retreat_SupervisorDefense_Command_Payload()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorDefense_Command_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorMovement_Service_Command_Payload(o: Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Payload, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorMovement_Service_Command_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorMovement_Service_Command_Payload(s: String): Either[Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Payload, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorMovement_Service_Command_Payload(parser: Parser): Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Payload = {
      val r = parser.parseMining_Threat_Retreat_SupervisorMovement_Service_Command_Payload()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorMovement_Service_Command_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorOperational_Phase_Payload(o: Mining_Threat_Retreat_Supervisor.Operational_Phase_Payload, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorOperational_Phase_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorOperational_Phase_Payload(s: String): Either[Mining_Threat_Retreat_Supervisor.Operational_Phase_Payload, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorOperational_Phase_Payload(parser: Parser): Mining_Threat_Retreat_Supervisor.Operational_Phase_Payload = {
      val r = parser.parseMining_Threat_Retreat_SupervisorOperational_Phase_Payload()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorOperational_Phase_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorInput_Fault_Payload(o: Mining_Threat_Retreat_Supervisor.Input_Fault_Payload, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorInput_Fault_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorInput_Fault_Payload(s: String): Either[Mining_Threat_Retreat_Supervisor.Input_Fault_Payload, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorInput_Fault_Payload(parser: Parser): Mining_Threat_Retreat_Supervisor.Input_Fault_Payload = {
      val r = parser.parseMining_Threat_Retreat_SupervisorInput_Fault_Payload()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorInput_Fault_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorThreat_Observation(o: Mining_Threat_Retreat_Supervisor.Threat_Observation, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorThreat_Observation(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorThreat_Observation(s: String): Either[Mining_Threat_Retreat_Supervisor.Threat_Observation, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorThreat_Observation(parser: Parser): Mining_Threat_Retreat_Supervisor.Threat_Observation = {
      val r = parser.parseMining_Threat_Retreat_SupervisorThreat_Observation()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorThreat_Observation _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorThreat_Observation_Payload(o: Mining_Threat_Retreat_Supervisor.Threat_Observation_Payload, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorThreat_Observation_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorThreat_Observation_Payload(s: String): Either[Mining_Threat_Retreat_Supervisor.Threat_Observation_Payload, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorThreat_Observation_Payload(parser: Parser): Mining_Threat_Retreat_Supervisor.Threat_Observation_Payload = {
      val r = parser.parseMining_Threat_Retreat_SupervisorThreat_Observation_Payload()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorThreat_Observation_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorCargo_Observation(o: Mining_Threat_Retreat_Supervisor.Cargo_Observation, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorCargo_Observation(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorCargo_Observation(s: String): Either[Mining_Threat_Retreat_Supervisor.Cargo_Observation, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorCargo_Observation(parser: Parser): Mining_Threat_Retreat_Supervisor.Cargo_Observation = {
      val r = parser.parseMining_Threat_Retreat_SupervisorCargo_Observation()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorCargo_Observation _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorCargo_Observation_Payload(o: Mining_Threat_Retreat_Supervisor.Cargo_Observation_Payload, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorCargo_Observation_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorCargo_Observation_Payload(s: String): Either[Mining_Threat_Retreat_Supervisor.Cargo_Observation_Payload, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorCargo_Observation_Payload(parser: Parser): Mining_Threat_Retreat_Supervisor.Cargo_Observation_Payload = {
      val r = parser.parseMining_Threat_Retreat_SupervisorCargo_Observation_Payload()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorCargo_Observation_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorCapacitor_Observation(o: Mining_Threat_Retreat_Supervisor.Capacitor_Observation, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorCapacitor_Observation(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorCapacitor_Observation(s: String): Either[Mining_Threat_Retreat_Supervisor.Capacitor_Observation, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorCapacitor_Observation(parser: Parser): Mining_Threat_Retreat_Supervisor.Capacitor_Observation = {
      val r = parser.parseMining_Threat_Retreat_SupervisorCapacitor_Observation()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorCapacitor_Observation _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorCapacitor_Observation_Payload(o: Mining_Threat_Retreat_Supervisor.Capacitor_Observation_Payload, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorCapacitor_Observation_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorCapacitor_Observation_Payload(s: String): Either[Mining_Threat_Retreat_Supervisor.Capacitor_Observation_Payload, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorCapacitor_Observation_Payload(parser: Parser): Mining_Threat_Retreat_Supervisor.Capacitor_Observation_Payload = {
      val r = parser.parseMining_Threat_Retreat_SupervisorCapacitor_Observation_Payload()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorCapacitor_Observation_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorRequest_Observation(o: Mining_Threat_Retreat_Supervisor.Request_Observation, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorRequest_Observation(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorRequest_Observation(s: String): Either[Mining_Threat_Retreat_Supervisor.Request_Observation, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorRequest_Observation(parser: Parser): Mining_Threat_Retreat_Supervisor.Request_Observation = {
      val r = parser.parseMining_Threat_Retreat_SupervisorRequest_Observation()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorRequest_Observation _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorRequest_Observation_Payload(o: Mining_Threat_Retreat_Supervisor.Request_Observation_Payload, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorRequest_Observation_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorRequest_Observation_Payload(s: String): Either[Mining_Threat_Retreat_Supervisor.Request_Observation_Payload, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorRequest_Observation_Payload(parser: Parser): Mining_Threat_Retreat_Supervisor.Request_Observation_Payload = {
      val r = parser.parseMining_Threat_Retreat_SupervisorRequest_Observation_Payload()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorRequest_Observation_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorMining_Availability_Observation(o: Mining_Threat_Retreat_Supervisor.Mining_Availability_Observation, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorMining_Availability_Observation(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorMining_Availability_Observation(s: String): Either[Mining_Threat_Retreat_Supervisor.Mining_Availability_Observation, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorMining_Availability_Observation(parser: Parser): Mining_Threat_Retreat_Supervisor.Mining_Availability_Observation = {
      val r = parser.parseMining_Threat_Retreat_SupervisorMining_Availability_Observation()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorMining_Availability_Observation _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorMining_Availability_Observation_Payload(o: Mining_Threat_Retreat_Supervisor.Mining_Availability_Observation_Payload, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorMining_Availability_Observation_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorMining_Availability_Observation_Payload(s: String): Either[Mining_Threat_Retreat_Supervisor.Mining_Availability_Observation_Payload, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorMining_Availability_Observation_Payload(parser: Parser): Mining_Threat_Retreat_Supervisor.Mining_Availability_Observation_Payload = {
      val r = parser.parseMining_Threat_Retreat_SupervisorMining_Availability_Observation_Payload()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorMining_Availability_Observation_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorDefense_Availability_Observation(o: Mining_Threat_Retreat_Supervisor.Defense_Availability_Observation, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorDefense_Availability_Observation(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorDefense_Availability_Observation(s: String): Either[Mining_Threat_Retreat_Supervisor.Defense_Availability_Observation, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorDefense_Availability_Observation(parser: Parser): Mining_Threat_Retreat_Supervisor.Defense_Availability_Observation = {
      val r = parser.parseMining_Threat_Retreat_SupervisorDefense_Availability_Observation()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorDefense_Availability_Observation _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorDefense_Availability_Observation_Payload(o: Mining_Threat_Retreat_Supervisor.Defense_Availability_Observation_Payload, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorDefense_Availability_Observation_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorDefense_Availability_Observation_Payload(s: String): Either[Mining_Threat_Retreat_Supervisor.Defense_Availability_Observation_Payload, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorDefense_Availability_Observation_Payload(parser: Parser): Mining_Threat_Retreat_Supervisor.Defense_Availability_Observation_Payload = {
      val r = parser.parseMining_Threat_Retreat_SupervisorDefense_Availability_Observation_Payload()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorDefense_Availability_Observation_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorRetreat_Availability_Observation(o: Mining_Threat_Retreat_Supervisor.Retreat_Availability_Observation, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorRetreat_Availability_Observation(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorRetreat_Availability_Observation(s: String): Either[Mining_Threat_Retreat_Supervisor.Retreat_Availability_Observation, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorRetreat_Availability_Observation(parser: Parser): Mining_Threat_Retreat_Supervisor.Retreat_Availability_Observation = {
      val r = parser.parseMining_Threat_Retreat_SupervisorRetreat_Availability_Observation()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorRetreat_Availability_Observation _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorRetreat_Availability_Observation_Payload(o: Mining_Threat_Retreat_Supervisor.Retreat_Availability_Observation_Payload, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorRetreat_Availability_Observation_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorRetreat_Availability_Observation_Payload(s: String): Either[Mining_Threat_Retreat_Supervisor.Retreat_Availability_Observation_Payload, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorRetreat_Availability_Observation_Payload(parser: Parser): Mining_Threat_Retreat_Supervisor.Retreat_Availability_Observation_Payload = {
      val r = parser.parseMining_Threat_Retreat_SupervisorRetreat_Availability_Observation_Payload()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorRetreat_Availability_Observation_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorService_Progress_Observation(o: Mining_Threat_Retreat_Supervisor.Service_Progress_Observation, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorService_Progress_Observation(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorService_Progress_Observation(s: String): Either[Mining_Threat_Retreat_Supervisor.Service_Progress_Observation, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorService_Progress_Observation(parser: Parser): Mining_Threat_Retreat_Supervisor.Service_Progress_Observation = {
      val r = parser.parseMining_Threat_Retreat_SupervisorService_Progress_Observation()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorService_Progress_Observation _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorService_Progress_Observation_Payload(o: Mining_Threat_Retreat_Supervisor.Service_Progress_Observation_Payload, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorService_Progress_Observation_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorService_Progress_Observation_Payload(s: String): Either[Mining_Threat_Retreat_Supervisor.Service_Progress_Observation_Payload, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorService_Progress_Observation_Payload(parser: Parser): Mining_Threat_Retreat_Supervisor.Service_Progress_Observation_Payload = {
      val r = parser.parseMining_Threat_Retreat_SupervisorService_Progress_Observation_Payload()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorService_Progress_Observation_Payload _)
    return r
  }

  def fromBase_TypesBoolean_Payload(o: Base_Types.Boolean_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesBoolean_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesBoolean_Payload(s: String): Either[Base_Types.Boolean_Payload, Json.ErrorMsg] = {
    def fBase_TypesBoolean_Payload(parser: Parser): Base_Types.Boolean_Payload = {
      val r = parser.parseBase_TypesBoolean_Payload()
      return r
    }
    val r = to(s, fBase_TypesBoolean_Payload _)
    return r
  }

  def fromBase_TypesInteger_Payload(o: Base_Types.Integer_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesInteger_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesInteger_Payload(s: String): Either[Base_Types.Integer_Payload, Json.ErrorMsg] = {
    def fBase_TypesInteger_Payload(parser: Parser): Base_Types.Integer_Payload = {
      val r = parser.parseBase_TypesInteger_Payload()
      return r
    }
    val r = to(s, fBase_TypesInteger_Payload _)
    return r
  }

  def fromBase_TypesInteger_8_Payload(o: Base_Types.Integer_8_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesInteger_8_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesInteger_8_Payload(s: String): Either[Base_Types.Integer_8_Payload, Json.ErrorMsg] = {
    def fBase_TypesInteger_8_Payload(parser: Parser): Base_Types.Integer_8_Payload = {
      val r = parser.parseBase_TypesInteger_8_Payload()
      return r
    }
    val r = to(s, fBase_TypesInteger_8_Payload _)
    return r
  }

  def fromBase_TypesInteger_16_Payload(o: Base_Types.Integer_16_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesInteger_16_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesInteger_16_Payload(s: String): Either[Base_Types.Integer_16_Payload, Json.ErrorMsg] = {
    def fBase_TypesInteger_16_Payload(parser: Parser): Base_Types.Integer_16_Payload = {
      val r = parser.parseBase_TypesInteger_16_Payload()
      return r
    }
    val r = to(s, fBase_TypesInteger_16_Payload _)
    return r
  }

  def fromBase_TypesInteger_32_Payload(o: Base_Types.Integer_32_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesInteger_32_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesInteger_32_Payload(s: String): Either[Base_Types.Integer_32_Payload, Json.ErrorMsg] = {
    def fBase_TypesInteger_32_Payload(parser: Parser): Base_Types.Integer_32_Payload = {
      val r = parser.parseBase_TypesInteger_32_Payload()
      return r
    }
    val r = to(s, fBase_TypesInteger_32_Payload _)
    return r
  }

  def fromBase_TypesInteger_64_Payload(o: Base_Types.Integer_64_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesInteger_64_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesInteger_64_Payload(s: String): Either[Base_Types.Integer_64_Payload, Json.ErrorMsg] = {
    def fBase_TypesInteger_64_Payload(parser: Parser): Base_Types.Integer_64_Payload = {
      val r = parser.parseBase_TypesInteger_64_Payload()
      return r
    }
    val r = to(s, fBase_TypesInteger_64_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_8_Payload(o: Base_Types.Unsigned_8_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesUnsigned_8_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesUnsigned_8_Payload(s: String): Either[Base_Types.Unsigned_8_Payload, Json.ErrorMsg] = {
    def fBase_TypesUnsigned_8_Payload(parser: Parser): Base_Types.Unsigned_8_Payload = {
      val r = parser.parseBase_TypesUnsigned_8_Payload()
      return r
    }
    val r = to(s, fBase_TypesUnsigned_8_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_16_Payload(o: Base_Types.Unsigned_16_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesUnsigned_16_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesUnsigned_16_Payload(s: String): Either[Base_Types.Unsigned_16_Payload, Json.ErrorMsg] = {
    def fBase_TypesUnsigned_16_Payload(parser: Parser): Base_Types.Unsigned_16_Payload = {
      val r = parser.parseBase_TypesUnsigned_16_Payload()
      return r
    }
    val r = to(s, fBase_TypesUnsigned_16_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_32_Payload(o: Base_Types.Unsigned_32_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesUnsigned_32_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesUnsigned_32_Payload(s: String): Either[Base_Types.Unsigned_32_Payload, Json.ErrorMsg] = {
    def fBase_TypesUnsigned_32_Payload(parser: Parser): Base_Types.Unsigned_32_Payload = {
      val r = parser.parseBase_TypesUnsigned_32_Payload()
      return r
    }
    val r = to(s, fBase_TypesUnsigned_32_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_64_Payload(o: Base_Types.Unsigned_64_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesUnsigned_64_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesUnsigned_64_Payload(s: String): Either[Base_Types.Unsigned_64_Payload, Json.ErrorMsg] = {
    def fBase_TypesUnsigned_64_Payload(parser: Parser): Base_Types.Unsigned_64_Payload = {
      val r = parser.parseBase_TypesUnsigned_64_Payload()
      return r
    }
    val r = to(s, fBase_TypesUnsigned_64_Payload _)
    return r
  }

  def fromBase_TypesFloat_Payload(o: Base_Types.Float_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesFloat_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesFloat_Payload(s: String): Either[Base_Types.Float_Payload, Json.ErrorMsg] = {
    def fBase_TypesFloat_Payload(parser: Parser): Base_Types.Float_Payload = {
      val r = parser.parseBase_TypesFloat_Payload()
      return r
    }
    val r = to(s, fBase_TypesFloat_Payload _)
    return r
  }

  def fromBase_TypesFloat_32_Payload(o: Base_Types.Float_32_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesFloat_32_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesFloat_32_Payload(s: String): Either[Base_Types.Float_32_Payload, Json.ErrorMsg] = {
    def fBase_TypesFloat_32_Payload(parser: Parser): Base_Types.Float_32_Payload = {
      val r = parser.parseBase_TypesFloat_32_Payload()
      return r
    }
    val r = to(s, fBase_TypesFloat_32_Payload _)
    return r
  }

  def fromBase_TypesFloat_64_Payload(o: Base_Types.Float_64_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesFloat_64_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesFloat_64_Payload(s: String): Either[Base_Types.Float_64_Payload, Json.ErrorMsg] = {
    def fBase_TypesFloat_64_Payload(parser: Parser): Base_Types.Float_64_Payload = {
      val r = parser.parseBase_TypesFloat_64_Payload()
      return r
    }
    val r = to(s, fBase_TypesFloat_64_Payload _)
    return r
  }

  def fromBase_TypesCharacter_Payload(o: Base_Types.Character_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesCharacter_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesCharacter_Payload(s: String): Either[Base_Types.Character_Payload, Json.ErrorMsg] = {
    def fBase_TypesCharacter_Payload(parser: Parser): Base_Types.Character_Payload = {
      val r = parser.parseBase_TypesCharacter_Payload()
      return r
    }
    val r = to(s, fBase_TypesCharacter_Payload _)
    return r
  }

  def fromBase_TypesString_Payload(o: Base_Types.String_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesString_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesString_Payload(s: String): Either[Base_Types.String_Payload, Json.ErrorMsg] = {
    def fBase_TypesString_Payload(parser: Parser): Base_Types.String_Payload = {
      val r = parser.parseBase_TypesString_Payload()
      return r
    }
    val r = to(s, fBase_TypesString_Payload _)
    return r
  }

  def fromBase_TypesBits_Payload(o: Base_Types.Bits_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesBits_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesBits_Payload(s: String): Either[Base_Types.Bits_Payload, Json.ErrorMsg] = {
    def fBase_TypesBits_Payload(parser: Parser): Base_Types.Bits_Payload = {
      val r = parser.parseBase_TypesBits_Payload()
      return r
    }
    val r = to(s, fBase_TypesBits_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container(o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container(s: String): Either[Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container(parser: Parser): Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container = {
      val r = parser.parseMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_P(o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_P(s: String): Either[Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_P, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_P(parser: Parser): Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_P = {
      val r = parser.parseMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_P()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS(s: String): Either[Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS(parser: Parser): Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS = {
      val r = parser.parseMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container(o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container(s: String): Either[Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container(parser: Parser): Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container = {
      val r = parser.parseMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_P(o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_P(s: String): Either[Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_P, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_P(parser: Parser): Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_P = {
      val r = parser.parseMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_P()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS(s: String): Either[Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS(parser: Parser): Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS = {
      val r = parser.parseMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container(o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PreState_Container, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container(s: String): Either[Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PreState_Container, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container(parser: Parser): Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PreState_Container = {
      val r = parser.parseMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_P(o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_P(s: String): Either[Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PreState_Container_P, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_P(parser: Parser): Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PreState_Container_P = {
      val r = parser.parseMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_P()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_PS(s: String): Either[Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PreState_Container_PS, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_PS(parser: Parser): Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PreState_Container_PS = {
      val r = parser.parseMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_PS()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PreState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container(o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PostState_Container, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container(s: String): Either[Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PostState_Container, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container(parser: Parser): Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PostState_Container = {
      val r = parser.parseMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_P(o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_P(s: String): Either[Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PostState_Container_P, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_P(parser: Parser): Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PostState_Container_P = {
      val r = parser.parseMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_P()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_PS(s: String): Either[Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PostState_Container_PS, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_PS(parser: Parser): Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_PostState_Container_PS = {
      val r = parser.parseMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_PS()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_process_resource_qualification_PostState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container(o: Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container(s: String): Either[Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container(parser: Parser): Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container = {
      val r = parser.parseMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_P(o: Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_P(s: String): Either[Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_P, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_P(parser: Parser): Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_P = {
      val r = parser.parseMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_P()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PS(s: String): Either[Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PS, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PS(parser: Parser): Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PS = {
      val r = parser.parseMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PS()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PreState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container(o: Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container(s: String): Either[Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container(parser: Parser): Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container = {
      val r = parser.parseMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_P(o: Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_P(s: String): Either[Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_P, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_P(parser: Parser): Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_P = {
      val r = parser.parseMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_P()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PS(s: String): Either[Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PS, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PS(parser: Parser): Mining_Threat_Retreat_Supervisor.Request_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PS = {
      val r = parser.parseMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PS()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorRequest_Availability_Qualification_supervisor_process_request_availability_qualification_PostState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container(o: Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container(s: String): Either[Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container(parser: Parser): Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container = {
      val r = parser.parseMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_P(o: Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_P(s: String): Either[Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_P, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_P(parser: Parser): Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_P = {
      val r = parser.parseMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_P()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PS(s: String): Either[Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PS, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PS(parser: Parser): Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PS = {
      val r = parser.parseMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PS()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PreState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container(o: Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container(s: String): Either[Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container(parser: Parser): Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container = {
      val r = parser.parseMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_P(o: Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_P(s: String): Either[Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_P, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_P(parser: Parser): Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_P = {
      val r = parser.parseMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_P()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PS(s: String): Either[Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PS, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PS(parser: Parser): Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PS = {
      val r = parser.parseMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PS()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorPrincipal_Decision_Owner_supervisor_process_principal_decision_owner_PostState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container(o: Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container(s: String): Either[Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container(parser: Parser): Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container = {
      val r = parser.parseMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_P(o: Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_P(s: String): Either[Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_P, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_P(parser: Parser): Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_P = {
      val r = parser.parseMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_P()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PS(s: String): Either[Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PS, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PS(parser: Parser): Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PS = {
      val r = parser.parseMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PS()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PreState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container(o: Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container(s: String): Either[Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container(parser: Parser): Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container = {
      val r = parser.parseMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_P(o: Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_P(s: String): Either[Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_P, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_P(parser: Parser): Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_P = {
      val r = parser.parseMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_P()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PS(s: String): Either[Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PS, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PS(parser: Parser): Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PS = {
      val r = parser.parseMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PS()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorMining_Command_Delivery_supervisor_process_mining_command_delivery_PostState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container(o: Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container(s: String): Either[Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container(parser: Parser): Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container = {
      val r = parser.parseMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_P(o: Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_P(s: String): Either[Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_P, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_P(parser: Parser): Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_P = {
      val r = parser.parseMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_P()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PS(s: String): Either[Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PS, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PS(parser: Parser): Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PS = {
      val r = parser.parseMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PS()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PreState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container(o: Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container(s: String): Either[Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container(parser: Parser): Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container = {
      val r = parser.parseMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_P(o: Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_P(s: String): Either[Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_P, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_P(parser: Parser): Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_P = {
      val r = parser.parseMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_P()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PS(s: String): Either[Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PS, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PS(parser: Parser): Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PS = {
      val r = parser.parseMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PS()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorDefense_Command_Delivery_supervisor_process_defense_command_delivery_PostState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container(o: Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container(s: String): Either[Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container(parser: Parser): Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container = {
      val r = parser.parseMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_P(o: Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_P(s: String): Either[Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_P, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_P(parser: Parser): Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_P = {
      val r = parser.parseMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_P()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PS(s: String): Either[Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PS, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PS(parser: Parser): Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PS = {
      val r = parser.parseMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PS()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PreState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container(o: Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container(s: String): Either[Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container(parser: Parser): Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container = {
      val r = parser.parseMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_P(o: Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_P(s: String): Either[Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_P, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_P(parser: Parser): Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_P = {
      val r = parser.parseMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_P()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PS(s: String): Either[Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PS, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PS(parser: Parser): Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PS = {
      val r = parser.parseMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PS()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorMovement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_PostState_Container_PS _)
    return r
  }

  def fromutilContainer(o: util.Container, isCompact: B): String = {
    val st = Printer.printutilContainer(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toutilContainer(s: String): Either[util.Container, Json.ErrorMsg] = {
    def futilContainer(parser: Parser): util.Container = {
      val r = parser.parseutilContainer()
      return r
    }
    val r = to(s, futilContainer _)
    return r
  }

  def fromutilEmptyContainer(o: util.EmptyContainer, isCompact: B): String = {
    val st = Printer.printutilEmptyContainer(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toutilEmptyContainer(s: String): Either[util.EmptyContainer, Json.ErrorMsg] = {
    def futilEmptyContainer(parser: Parser): util.EmptyContainer = {
      val r = parser.parseutilEmptyContainer()
      return r
    }
    val r = to(s, futilEmptyContainer _)
    return r
  }

  def from_artDataContent(o: art.DataContent, isCompact: B): String = {
    val st = Printer.print_artDataContent(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_artDataContent(s: String): Either[art.DataContent, Json.ErrorMsg] = {
    def f_artDataContent(parser: Parser): art.DataContent = {
      val r = parser.parse_artDataContent()
      return r
    }
    val r = to(s, f_artDataContent _)
    return r
  }

  def from_artEmpty(o: art.Empty, isCompact: B): String = {
    val st = Printer.print_artEmpty(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_artEmpty(s: String): Either[art.Empty, Json.ErrorMsg] = {
    def f_artEmpty(parser: Parser): art.Empty = {
      val r = parser.parse_artEmpty()
      return r
    }
    val r = to(s, f_artEmpty _)
    return r
  }

}