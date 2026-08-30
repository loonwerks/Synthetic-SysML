// #Sireum
// @formatter:off

// This file is auto-generated from Lifecycle_Event.scala, Input_Status.scala, Qualified_Request.scala, Battery_Indication.scala, Battery_Assessment_Value.scala, Lifecycle_Phase.scala, Power_Permission.scala, Attention_Status.scala, Lifecycle_Request_Sample.scala, Battery_Sample.scala, Decision_Disposition.scala, Lifecycle_Actuation.scala, Base_Types.scala, Request_Qualification_governor_process_request_qualification_Containers.scala, Battery_Assessment_governor_process_battery_assessment_Containers.scala, Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_Containers.scala, Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_Containers.scala, Attention_Derivation_governor_process_attention_derivation_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package scp_candidate

import org.sireum._
import org.sireum.Json.Printer._

object JSON {

  object Printer {

    @pure def printDrone_Lifecycle_GovernorLifecycle_EventType(o: Drone_Lifecycle_Governor.Lifecycle_Event.Type): ST = {
      val value: String = o match {
        case Drone_Lifecycle_Governor.Lifecycle_Event.No_Request => "No_Request"
        case Drone_Lifecycle_Governor.Lifecycle_Event.Switch_On => "Switch_On"
        case Drone_Lifecycle_Governor.Lifecycle_Event.Switch_Off => "Switch_Off"
        case Drone_Lifecycle_Governor.Lifecycle_Event.Begin_Charge => "Begin_Charge"
        case Drone_Lifecycle_Governor.Lifecycle_Event.End_Charge => "End_Charge"
        case Drone_Lifecycle_Governor.Lifecycle_Event.Activate => "Activate"
        case Drone_Lifecycle_Governor.Lifecycle_Event.Deactivate => "Deactivate"
        case Drone_Lifecycle_Governor.Lifecycle_Event.Begin_Flight => "Begin_Flight"
        case Drone_Lifecycle_Governor.Lifecycle_Event.End_Flight => "End_Flight"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Lifecycle_Governor.Lifecycle_Event")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorLifecycle_Event_Payload(o: Drone_Lifecycle_Governor.Lifecycle_Event_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.Lifecycle_Event_Payload""""),
        ("value", printDrone_Lifecycle_GovernorLifecycle_EventType(o.value))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorInput_StatusType(o: Drone_Lifecycle_Governor.Input_Status.Type): ST = {
      val value: String = o match {
        case Drone_Lifecycle_Governor.Input_Status.Valid => "Valid"
        case Drone_Lifecycle_Governor.Input_Status.Invalid => "Invalid"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Lifecycle_Governor.Input_Status")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorInput_Status_Payload(o: Drone_Lifecycle_Governor.Input_Status_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.Input_Status_Payload""""),
        ("value", printDrone_Lifecycle_GovernorInput_StatusType(o.value))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorQualified_RequestType(o: Drone_Lifecycle_Governor.Qualified_Request.Type): ST = {
      val value: String = o match {
        case Drone_Lifecycle_Governor.Qualified_Request.Invalid_Request => "Invalid_Request"
        case Drone_Lifecycle_Governor.Qualified_Request.No_Request => "No_Request"
        case Drone_Lifecycle_Governor.Qualified_Request.Switch_On => "Switch_On"
        case Drone_Lifecycle_Governor.Qualified_Request.Switch_Off => "Switch_Off"
        case Drone_Lifecycle_Governor.Qualified_Request.Begin_Charge => "Begin_Charge"
        case Drone_Lifecycle_Governor.Qualified_Request.End_Charge => "End_Charge"
        case Drone_Lifecycle_Governor.Qualified_Request.Activate => "Activate"
        case Drone_Lifecycle_Governor.Qualified_Request.Deactivate => "Deactivate"
        case Drone_Lifecycle_Governor.Qualified_Request.Begin_Flight => "Begin_Flight"
        case Drone_Lifecycle_Governor.Qualified_Request.End_Flight => "End_Flight"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Lifecycle_Governor.Qualified_Request")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorQualified_Request_Payload(o: Drone_Lifecycle_Governor.Qualified_Request_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.Qualified_Request_Payload""""),
        ("value", printDrone_Lifecycle_GovernorQualified_RequestType(o.value))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorBattery_IndicationType(o: Drone_Lifecycle_Governor.Battery_Indication.Type): ST = {
      val value: String = o match {
        case Drone_Lifecycle_Governor.Battery_Indication.Adequate => "Adequate"
        case Drone_Lifecycle_Governor.Battery_Indication.Low => "Low"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Lifecycle_Governor.Battery_Indication")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorBattery_Indication_Payload(o: Drone_Lifecycle_Governor.Battery_Indication_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.Battery_Indication_Payload""""),
        ("value", printDrone_Lifecycle_GovernorBattery_IndicationType(o.value))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorBattery_Assessment_ValueType(o: Drone_Lifecycle_Governor.Battery_Assessment_Value.Type): ST = {
      val value: String = o match {
        case Drone_Lifecycle_Governor.Battery_Assessment_Value.Invalid_Battery => "Invalid_Battery"
        case Drone_Lifecycle_Governor.Battery_Assessment_Value.Adequate_Battery => "Adequate_Battery"
        case Drone_Lifecycle_Governor.Battery_Assessment_Value.Low_Battery => "Low_Battery"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Lifecycle_Governor.Battery_Assessment_Value")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorBattery_Assessment_Value_Payload(o: Drone_Lifecycle_Governor.Battery_Assessment_Value_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.Battery_Assessment_Value_Payload""""),
        ("value", printDrone_Lifecycle_GovernorBattery_Assessment_ValueType(o.value))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorLifecycle_PhaseType(o: Drone_Lifecycle_Governor.Lifecycle_Phase.Type): ST = {
      val value: String = o match {
        case Drone_Lifecycle_Governor.Lifecycle_Phase.Off => "Off"
        case Drone_Lifecycle_Governor.Lifecycle_Phase.Standby => "Standby"
        case Drone_Lifecycle_Governor.Lifecycle_Phase.Charging => "Charging"
        case Drone_Lifecycle_Governor.Lifecycle_Phase.Ready => "Ready"
        case Drone_Lifecycle_Governor.Lifecycle_Phase.Flying => "Flying"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Lifecycle_Governor.Lifecycle_Phase")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorLifecycle_Phase_Payload(o: Drone_Lifecycle_Governor.Lifecycle_Phase_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.Lifecycle_Phase_Payload""""),
        ("value", printDrone_Lifecycle_GovernorLifecycle_PhaseType(o.value))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorPower_PermissionType(o: Drone_Lifecycle_Governor.Power_Permission.Type): ST = {
      val value: String = o match {
        case Drone_Lifecycle_Governor.Power_Permission.Disabled => "Disabled"
        case Drone_Lifecycle_Governor.Power_Permission.Standby_Enabled => "Standby_Enabled"
        case Drone_Lifecycle_Governor.Power_Permission.Operational_Enabled => "Operational_Enabled"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Lifecycle_Governor.Power_Permission")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorPower_Permission_Payload(o: Drone_Lifecycle_Governor.Power_Permission_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.Power_Permission_Payload""""),
        ("value", printDrone_Lifecycle_GovernorPower_PermissionType(o.value))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorAttention_StatusType(o: Drone_Lifecycle_Governor.Attention_Status.Type): ST = {
      val value: String = o match {
        case Drone_Lifecycle_Governor.Attention_Status.None => "None"
        case Drone_Lifecycle_Governor.Attention_Status.Low_Battery => "Low_Battery"
        case Drone_Lifecycle_Governor.Attention_Status.Input_Fault => "Input_Fault"
        case Drone_Lifecycle_Governor.Attention_Status.Recovery_Awaiting_Neutral => "Recovery_Awaiting_Neutral"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Lifecycle_Governor.Attention_Status")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorAttention_Status_Payload(o: Drone_Lifecycle_Governor.Attention_Status_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.Attention_Status_Payload""""),
        ("value", printDrone_Lifecycle_GovernorAttention_StatusType(o.value))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorLifecycle_Request_Sample(o: Drone_Lifecycle_Governor.Lifecycle_Request_Sample): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.Lifecycle_Request_Sample""""),
        ("request_event", printDrone_Lifecycle_GovernorLifecycle_EventType(o.request_event)),
        ("status", printDrone_Lifecycle_GovernorInput_StatusType(o.status))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorLifecycle_Request_Sample_Payload(o: Drone_Lifecycle_Governor.Lifecycle_Request_Sample_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.Lifecycle_Request_Sample_Payload""""),
        ("value", printDrone_Lifecycle_GovernorLifecycle_Request_Sample(o.value))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorBattery_Sample(o: Drone_Lifecycle_Governor.Battery_Sample): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.Battery_Sample""""),
        ("indication", printDrone_Lifecycle_GovernorBattery_IndicationType(o.indication)),
        ("status", printDrone_Lifecycle_GovernorInput_StatusType(o.status))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorBattery_Sample_Payload(o: Drone_Lifecycle_Governor.Battery_Sample_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.Battery_Sample_Payload""""),
        ("value", printDrone_Lifecycle_GovernorBattery_Sample(o.value))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorDecision_Disposition(o: Drone_Lifecycle_Governor.Decision_Disposition): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.Decision_Disposition""""),
        ("input_fault_detected", printB(o.input_fault_detected)),
        ("recovery_pending", printB(o.recovery_pending))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorDecision_Disposition_Payload(o: Drone_Lifecycle_Governor.Decision_Disposition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.Decision_Disposition_Payload""""),
        ("value", printDrone_Lifecycle_GovernorDecision_Disposition(o.value))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorLifecycle_Actuation(o: Drone_Lifecycle_Governor.Lifecycle_Actuation): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.Lifecycle_Actuation""""),
        ("power", printDrone_Lifecycle_GovernorPower_PermissionType(o.power)),
        ("charging_permitted", printB(o.charging_permitted)),
        ("flight_permitted", printB(o.flight_permitted))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorLifecycle_Actuation_Payload(o: Drone_Lifecycle_Governor.Lifecycle_Actuation_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.Lifecycle_Actuation_Payload""""),
        ("value", printDrone_Lifecycle_GovernorLifecycle_Actuation(o.value))
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

    @pure def printDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container(o: Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PreState_Container): ST = {
      o match {
        case o: Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PreState_Container_P => return printDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_P(o)
        case o: Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PreState_Container_PS => return printDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_PS(o)
      }
    }

    @pure def printDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_P(o: Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PreState_Container_P""""),
        ("api_raw_request", printDrone_Lifecycle_GovernorLifecycle_Request_Sample(o.api_raw_request))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_PS(o: Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PreState_Container_PS""""),
        ("api_raw_request", printDrone_Lifecycle_GovernorLifecycle_Request_Sample(o.api_raw_request))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container(o: Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PostState_Container): ST = {
      o match {
        case o: Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PostState_Container_P => return printDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_P(o)
        case o: Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PostState_Container_PS => return printDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_PS(o)
      }
    }

    @pure def printDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_P(o: Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PostState_Container_P""""),
        ("api_qualified_request", printDrone_Lifecycle_GovernorQualified_RequestType(o.api_qualified_request))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_PS(o: Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PostState_Container_PS""""),
        ("api_qualified_request", printDrone_Lifecycle_GovernorQualified_RequestType(o.api_qualified_request))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container(o: Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PreState_Container): ST = {
      o match {
        case o: Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PreState_Container_P => return printDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_P(o)
        case o: Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PreState_Container_PS => return printDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_PS(o)
      }
    }

    @pure def printDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_P(o: Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PreState_Container_P""""),
        ("api_raw_battery", printDrone_Lifecycle_GovernorBattery_Sample(o.api_raw_battery))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_PS(o: Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PreState_Container_PS""""),
        ("api_raw_battery", printDrone_Lifecycle_GovernorBattery_Sample(o.api_raw_battery))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container(o: Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PostState_Container): ST = {
      o match {
        case o: Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PostState_Container_P => return printDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_P(o)
        case o: Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PostState_Container_PS => return printDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_PS(o)
      }
    }

    @pure def printDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_P(o: Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PostState_Container_P""""),
        ("api_battery_assessment", printDrone_Lifecycle_GovernorBattery_Assessment_ValueType(o.api_battery_assessment))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_PS(o: Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PostState_Container_PS""""),
        ("api_battery_assessment", printDrone_Lifecycle_GovernorBattery_Assessment_ValueType(o.api_battery_assessment))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container(o: Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container): ST = {
      o match {
        case o: Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_P => return printDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_P(o)
        case o: Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PS => return printDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PS(o)
      }
    }

    @pure def printDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_P(o: Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_P""""),
        ("api_battery_assessment", printDrone_Lifecycle_GovernorBattery_Assessment_ValueType(o.api_battery_assessment)),
        ("api_qualified_request", printDrone_Lifecycle_GovernorQualified_RequestType(o.api_qualified_request))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PS(o: Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PS""""),
        ("In_current_phase", printDrone_Lifecycle_GovernorLifecycle_PhaseType(o.In_current_phase)),
        ("In_recovery_required", printB(o.In_recovery_required)),
        ("api_battery_assessment", printDrone_Lifecycle_GovernorBattery_Assessment_ValueType(o.api_battery_assessment)),
        ("api_qualified_request", printDrone_Lifecycle_GovernorQualified_RequestType(o.api_qualified_request))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container(o: Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container): ST = {
      o match {
        case o: Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_P => return printDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_P(o)
        case o: Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PS => return printDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PS(o)
      }
    }

    @pure def printDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_P(o: Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_P""""),
        ("api_decision_disposition", printDrone_Lifecycle_GovernorDecision_Disposition(o.api_decision_disposition)),
        ("api_phase_report", printDrone_Lifecycle_GovernorLifecycle_PhaseType(o.api_phase_report)),
        ("api_selected_phase", printDrone_Lifecycle_GovernorLifecycle_PhaseType(o.api_selected_phase))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PS(o: Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PS""""),
        ("current_phase", printDrone_Lifecycle_GovernorLifecycle_PhaseType(o.current_phase)),
        ("recovery_required", printB(o.recovery_required)),
        ("api_decision_disposition", printDrone_Lifecycle_GovernorDecision_Disposition(o.api_decision_disposition)),
        ("api_phase_report", printDrone_Lifecycle_GovernorLifecycle_PhaseType(o.api_phase_report)),
        ("api_selected_phase", printDrone_Lifecycle_GovernorLifecycle_PhaseType(o.api_selected_phase))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container(o: Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container): ST = {
      o match {
        case o: Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_P => return printDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_P(o)
        case o: Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PS => return printDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PS(o)
      }
    }

    @pure def printDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_P(o: Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_P""""),
        ("api_selected_phase", printDrone_Lifecycle_GovernorLifecycle_PhaseType(o.api_selected_phase))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PS(o: Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PS""""),
        ("api_selected_phase", printDrone_Lifecycle_GovernorLifecycle_PhaseType(o.api_selected_phase))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container(o: Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container): ST = {
      o match {
        case o: Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_P => return printDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_P(o)
        case o: Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PS => return printDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PS(o)
      }
    }

    @pure def printDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_P(o: Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_P""""),
        ("api_lifecycle_actuation", printDrone_Lifecycle_GovernorLifecycle_Actuation(o.api_lifecycle_actuation))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PS(o: Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PS""""),
        ("api_lifecycle_actuation", printDrone_Lifecycle_GovernorLifecycle_Actuation(o.api_lifecycle_actuation))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container(o: Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PreState_Container): ST = {
      o match {
        case o: Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PreState_Container_P => return printDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_P(o)
        case o: Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PreState_Container_PS => return printDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_PS(o)
      }
    }

    @pure def printDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_P(o: Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PreState_Container_P""""),
        ("api_battery_assessment", printDrone_Lifecycle_GovernorBattery_Assessment_ValueType(o.api_battery_assessment)),
        ("api_decision_disposition", printDrone_Lifecycle_GovernorDecision_Disposition(o.api_decision_disposition))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_PS(o: Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PreState_Container_PS""""),
        ("api_battery_assessment", printDrone_Lifecycle_GovernorBattery_Assessment_ValueType(o.api_battery_assessment)),
        ("api_decision_disposition", printDrone_Lifecycle_GovernorDecision_Disposition(o.api_decision_disposition))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container(o: Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PostState_Container): ST = {
      o match {
        case o: Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PostState_Container_P => return printDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_P(o)
        case o: Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PostState_Container_PS => return printDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_PS(o)
      }
    }

    @pure def printDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_P(o: Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PostState_Container_P""""),
        ("api_attention_status", printDrone_Lifecycle_GovernorAttention_StatusType(o.api_attention_status))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_PS(o: Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PostState_Container_PS""""),
        ("api_attention_status", printDrone_Lifecycle_GovernorAttention_StatusType(o.api_attention_status))
      ))
    }

    @pure def printruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): ST = {
      val value: String = o match {
        case runtimemonitor.ObservationKind.Drone_Lifecycle_Governor_System_Instance_governor_process_request_qualification_postInit => "Drone_Lifecycle_Governor_System_Instance_governor_process_request_qualification_postInit"
        case runtimemonitor.ObservationKind.Drone_Lifecycle_Governor_System_Instance_governor_process_request_qualification_preCompute => "Drone_Lifecycle_Governor_System_Instance_governor_process_request_qualification_preCompute"
        case runtimemonitor.ObservationKind.Drone_Lifecycle_Governor_System_Instance_governor_process_request_qualification_postCompute => "Drone_Lifecycle_Governor_System_Instance_governor_process_request_qualification_postCompute"
        case runtimemonitor.ObservationKind.Drone_Lifecycle_Governor_System_Instance_governor_process_battery_assessment_postInit => "Drone_Lifecycle_Governor_System_Instance_governor_process_battery_assessment_postInit"
        case runtimemonitor.ObservationKind.Drone_Lifecycle_Governor_System_Instance_governor_process_battery_assessment_preCompute => "Drone_Lifecycle_Governor_System_Instance_governor_process_battery_assessment_preCompute"
        case runtimemonitor.ObservationKind.Drone_Lifecycle_Governor_System_Instance_governor_process_battery_assessment_postCompute => "Drone_Lifecycle_Governor_System_Instance_governor_process_battery_assessment_postCompute"
        case runtimemonitor.ObservationKind.Drone_Lifecycle_Governor_System_Instance_governor_process_lifecycle_decision_owner_postInit => "Drone_Lifecycle_Governor_System_Instance_governor_process_lifecycle_decision_owner_postInit"
        case runtimemonitor.ObservationKind.Drone_Lifecycle_Governor_System_Instance_governor_process_lifecycle_decision_owner_preCompute => "Drone_Lifecycle_Governor_System_Instance_governor_process_lifecycle_decision_owner_preCompute"
        case runtimemonitor.ObservationKind.Drone_Lifecycle_Governor_System_Instance_governor_process_lifecycle_decision_owner_postCompute => "Drone_Lifecycle_Governor_System_Instance_governor_process_lifecycle_decision_owner_postCompute"
        case runtimemonitor.ObservationKind.Drone_Lifecycle_Governor_System_Instance_governor_process_controlled_outcome_derivation_postInit => "Drone_Lifecycle_Governor_System_Instance_governor_process_controlled_outcome_derivation_postInit"
        case runtimemonitor.ObservationKind.Drone_Lifecycle_Governor_System_Instance_governor_process_controlled_outcome_derivation_preCompute => "Drone_Lifecycle_Governor_System_Instance_governor_process_controlled_outcome_derivation_preCompute"
        case runtimemonitor.ObservationKind.Drone_Lifecycle_Governor_System_Instance_governor_process_controlled_outcome_derivation_postCompute => "Drone_Lifecycle_Governor_System_Instance_governor_process_controlled_outcome_derivation_postCompute"
        case runtimemonitor.ObservationKind.Drone_Lifecycle_Governor_System_Instance_governor_process_attention_derivation_postInit => "Drone_Lifecycle_Governor_System_Instance_governor_process_attention_derivation_postInit"
        case runtimemonitor.ObservationKind.Drone_Lifecycle_Governor_System_Instance_governor_process_attention_derivation_preCompute => "Drone_Lifecycle_Governor_System_Instance_governor_process_attention_derivation_preCompute"
        case runtimemonitor.ObservationKind.Drone_Lifecycle_Governor_System_Instance_governor_process_attention_derivation_postCompute => "Drone_Lifecycle_Governor_System_Instance_governor_process_attention_derivation_postCompute"
      }
      return printObject(ISZ(
        ("type", printString("runtimemonitor.ObservationKind")),
        ("value", printString(value))
      ))
    }

    @pure def printutilContainer(o: util.Container): ST = {
      o match {
        case o: util.EmptyContainer => return printutilEmptyContainer(o)
        case o: Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PreState_Container_P => return printDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_P(o)
        case o: Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PreState_Container_PS => return printDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PostState_Container_P => return printDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_P(o)
        case o: Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PostState_Container_PS => return printDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PreState_Container_P => return printDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_P(o)
        case o: Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PreState_Container_PS => return printDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PostState_Container_P => return printDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_P(o)
        case o: Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PostState_Container_PS => return printDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PreState_Container_P => return printDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_P(o)
        case o: Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PreState_Container_PS => return printDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PostState_Container_P => return printDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_P(o)
        case o: Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PostState_Container_PS => return printDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_P => return printDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_P(o)
        case o: Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PS => return printDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_P => return printDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_P(o)
        case o: Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PS => return printDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_P => return printDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_P(o)
        case o: Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PS => return printDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_P => return printDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_P(o)
        case o: Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PS => return printDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PS(o)
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
        case o: Drone_Lifecycle_Governor.Input_Status_Payload => return printDrone_Lifecycle_GovernorInput_Status_Payload(o)
        case o: Drone_Lifecycle_Governor.Battery_Sample_Payload => return printDrone_Lifecycle_GovernorBattery_Sample_Payload(o)
        case o: Drone_Lifecycle_Governor.Lifecycle_Phase_Payload => return printDrone_Lifecycle_GovernorLifecycle_Phase_Payload(o)
        case o: Drone_Lifecycle_Governor.Lifecycle_Event_Payload => return printDrone_Lifecycle_GovernorLifecycle_Event_Payload(o)
        case o: Drone_Lifecycle_Governor.Power_Permission_Payload => return printDrone_Lifecycle_GovernorPower_Permission_Payload(o)
        case o: Drone_Lifecycle_Governor.Attention_Status_Payload => return printDrone_Lifecycle_GovernorAttention_Status_Payload(o)
        case o: Drone_Lifecycle_Governor.Qualified_Request_Payload => return printDrone_Lifecycle_GovernorQualified_Request_Payload(o)
        case o: Drone_Lifecycle_Governor.Battery_Indication_Payload => return printDrone_Lifecycle_GovernorBattery_Indication_Payload(o)
        case o: Drone_Lifecycle_Governor.Lifecycle_Actuation_Payload => return printDrone_Lifecycle_GovernorLifecycle_Actuation_Payload(o)
        case o: Drone_Lifecycle_Governor.Decision_Disposition_Payload => return printDrone_Lifecycle_GovernorDecision_Disposition_Payload(o)
        case o: Drone_Lifecycle_Governor.Battery_Assessment_Value_Payload => return printDrone_Lifecycle_GovernorBattery_Assessment_Value_Payload(o)
        case o: Drone_Lifecycle_Governor.Lifecycle_Request_Sample_Payload => return printDrone_Lifecycle_GovernorLifecycle_Request_Sample_Payload(o)
        case o: Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PreState_Container_P => return printDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_P(o)
        case o: Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PreState_Container_PS => return printDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PostState_Container_P => return printDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_P(o)
        case o: Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PostState_Container_PS => return printDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PreState_Container_P => return printDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_P(o)
        case o: Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PreState_Container_PS => return printDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PostState_Container_P => return printDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_P(o)
        case o: Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PostState_Container_PS => return printDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PreState_Container_P => return printDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_P(o)
        case o: Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PreState_Container_PS => return printDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PostState_Container_P => return printDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_P(o)
        case o: Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PostState_Container_PS => return printDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_P => return printDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_P(o)
        case o: Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PS => return printDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_P => return printDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_P(o)
        case o: Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PS => return printDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_P => return printDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_P(o)
        case o: Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PS => return printDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_P => return printDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_P(o)
        case o: Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PS => return printDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PS(o)
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

    def parseDrone_Lifecycle_GovernorLifecycle_EventType(): Drone_Lifecycle_Governor.Lifecycle_Event.Type = {
      val r = parseDrone_Lifecycle_GovernorLifecycle_EventT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorLifecycle_EventT(typeParsed: B): Drone_Lifecycle_Governor.Lifecycle_Event.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.Lifecycle_Event")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Lifecycle_Governor.Lifecycle_Event.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Lifecycle_Governor.Lifecycle_Event.")
          return Drone_Lifecycle_Governor.Lifecycle_Event.byOrdinal(0).get
      }
    }

    def parseDrone_Lifecycle_GovernorLifecycle_Event_Payload(): Drone_Lifecycle_Governor.Lifecycle_Event_Payload = {
      val r = parseDrone_Lifecycle_GovernorLifecycle_Event_PayloadT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorLifecycle_Event_PayloadT(typeParsed: B): Drone_Lifecycle_Governor.Lifecycle_Event_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.Lifecycle_Event_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Lifecycle_GovernorLifecycle_EventType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.Lifecycle_Event_Payload(value)
    }

    def parseDrone_Lifecycle_GovernorInput_StatusType(): Drone_Lifecycle_Governor.Input_Status.Type = {
      val r = parseDrone_Lifecycle_GovernorInput_StatusT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorInput_StatusT(typeParsed: B): Drone_Lifecycle_Governor.Input_Status.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.Input_Status")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Lifecycle_Governor.Input_Status.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Lifecycle_Governor.Input_Status.")
          return Drone_Lifecycle_Governor.Input_Status.byOrdinal(0).get
      }
    }

    def parseDrone_Lifecycle_GovernorInput_Status_Payload(): Drone_Lifecycle_Governor.Input_Status_Payload = {
      val r = parseDrone_Lifecycle_GovernorInput_Status_PayloadT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorInput_Status_PayloadT(typeParsed: B): Drone_Lifecycle_Governor.Input_Status_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.Input_Status_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Lifecycle_GovernorInput_StatusType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.Input_Status_Payload(value)
    }

    def parseDrone_Lifecycle_GovernorQualified_RequestType(): Drone_Lifecycle_Governor.Qualified_Request.Type = {
      val r = parseDrone_Lifecycle_GovernorQualified_RequestT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorQualified_RequestT(typeParsed: B): Drone_Lifecycle_Governor.Qualified_Request.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.Qualified_Request")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Lifecycle_Governor.Qualified_Request.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Lifecycle_Governor.Qualified_Request.")
          return Drone_Lifecycle_Governor.Qualified_Request.byOrdinal(0).get
      }
    }

    def parseDrone_Lifecycle_GovernorQualified_Request_Payload(): Drone_Lifecycle_Governor.Qualified_Request_Payload = {
      val r = parseDrone_Lifecycle_GovernorQualified_Request_PayloadT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorQualified_Request_PayloadT(typeParsed: B): Drone_Lifecycle_Governor.Qualified_Request_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.Qualified_Request_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Lifecycle_GovernorQualified_RequestType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.Qualified_Request_Payload(value)
    }

    def parseDrone_Lifecycle_GovernorBattery_IndicationType(): Drone_Lifecycle_Governor.Battery_Indication.Type = {
      val r = parseDrone_Lifecycle_GovernorBattery_IndicationT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorBattery_IndicationT(typeParsed: B): Drone_Lifecycle_Governor.Battery_Indication.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.Battery_Indication")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Lifecycle_Governor.Battery_Indication.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Lifecycle_Governor.Battery_Indication.")
          return Drone_Lifecycle_Governor.Battery_Indication.byOrdinal(0).get
      }
    }

    def parseDrone_Lifecycle_GovernorBattery_Indication_Payload(): Drone_Lifecycle_Governor.Battery_Indication_Payload = {
      val r = parseDrone_Lifecycle_GovernorBattery_Indication_PayloadT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorBattery_Indication_PayloadT(typeParsed: B): Drone_Lifecycle_Governor.Battery_Indication_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.Battery_Indication_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Lifecycle_GovernorBattery_IndicationType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.Battery_Indication_Payload(value)
    }

    def parseDrone_Lifecycle_GovernorBattery_Assessment_ValueType(): Drone_Lifecycle_Governor.Battery_Assessment_Value.Type = {
      val r = parseDrone_Lifecycle_GovernorBattery_Assessment_ValueT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorBattery_Assessment_ValueT(typeParsed: B): Drone_Lifecycle_Governor.Battery_Assessment_Value.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.Battery_Assessment_Value")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Lifecycle_Governor.Battery_Assessment_Value.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Lifecycle_Governor.Battery_Assessment_Value.")
          return Drone_Lifecycle_Governor.Battery_Assessment_Value.byOrdinal(0).get
      }
    }

    def parseDrone_Lifecycle_GovernorBattery_Assessment_Value_Payload(): Drone_Lifecycle_Governor.Battery_Assessment_Value_Payload = {
      val r = parseDrone_Lifecycle_GovernorBattery_Assessment_Value_PayloadT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorBattery_Assessment_Value_PayloadT(typeParsed: B): Drone_Lifecycle_Governor.Battery_Assessment_Value_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.Battery_Assessment_Value_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Lifecycle_GovernorBattery_Assessment_ValueType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.Battery_Assessment_Value_Payload(value)
    }

    def parseDrone_Lifecycle_GovernorLifecycle_PhaseType(): Drone_Lifecycle_Governor.Lifecycle_Phase.Type = {
      val r = parseDrone_Lifecycle_GovernorLifecycle_PhaseT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorLifecycle_PhaseT(typeParsed: B): Drone_Lifecycle_Governor.Lifecycle_Phase.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.Lifecycle_Phase")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Lifecycle_Governor.Lifecycle_Phase.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Lifecycle_Governor.Lifecycle_Phase.")
          return Drone_Lifecycle_Governor.Lifecycle_Phase.byOrdinal(0).get
      }
    }

    def parseDrone_Lifecycle_GovernorLifecycle_Phase_Payload(): Drone_Lifecycle_Governor.Lifecycle_Phase_Payload = {
      val r = parseDrone_Lifecycle_GovernorLifecycle_Phase_PayloadT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorLifecycle_Phase_PayloadT(typeParsed: B): Drone_Lifecycle_Governor.Lifecycle_Phase_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.Lifecycle_Phase_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Lifecycle_GovernorLifecycle_PhaseType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.Lifecycle_Phase_Payload(value)
    }

    def parseDrone_Lifecycle_GovernorPower_PermissionType(): Drone_Lifecycle_Governor.Power_Permission.Type = {
      val r = parseDrone_Lifecycle_GovernorPower_PermissionT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorPower_PermissionT(typeParsed: B): Drone_Lifecycle_Governor.Power_Permission.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.Power_Permission")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Lifecycle_Governor.Power_Permission.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Lifecycle_Governor.Power_Permission.")
          return Drone_Lifecycle_Governor.Power_Permission.byOrdinal(0).get
      }
    }

    def parseDrone_Lifecycle_GovernorPower_Permission_Payload(): Drone_Lifecycle_Governor.Power_Permission_Payload = {
      val r = parseDrone_Lifecycle_GovernorPower_Permission_PayloadT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorPower_Permission_PayloadT(typeParsed: B): Drone_Lifecycle_Governor.Power_Permission_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.Power_Permission_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Lifecycle_GovernorPower_PermissionType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.Power_Permission_Payload(value)
    }

    def parseDrone_Lifecycle_GovernorAttention_StatusType(): Drone_Lifecycle_Governor.Attention_Status.Type = {
      val r = parseDrone_Lifecycle_GovernorAttention_StatusT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorAttention_StatusT(typeParsed: B): Drone_Lifecycle_Governor.Attention_Status.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.Attention_Status")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Lifecycle_Governor.Attention_Status.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Lifecycle_Governor.Attention_Status.")
          return Drone_Lifecycle_Governor.Attention_Status.byOrdinal(0).get
      }
    }

    def parseDrone_Lifecycle_GovernorAttention_Status_Payload(): Drone_Lifecycle_Governor.Attention_Status_Payload = {
      val r = parseDrone_Lifecycle_GovernorAttention_Status_PayloadT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorAttention_Status_PayloadT(typeParsed: B): Drone_Lifecycle_Governor.Attention_Status_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.Attention_Status_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Lifecycle_GovernorAttention_StatusType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.Attention_Status_Payload(value)
    }

    def parseDrone_Lifecycle_GovernorLifecycle_Request_Sample(): Drone_Lifecycle_Governor.Lifecycle_Request_Sample = {
      val r = parseDrone_Lifecycle_GovernorLifecycle_Request_SampleT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorLifecycle_Request_SampleT(typeParsed: B): Drone_Lifecycle_Governor.Lifecycle_Request_Sample = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.Lifecycle_Request_Sample")
      }
      parser.parseObjectKey("request_event")
      val request_event = parseDrone_Lifecycle_GovernorLifecycle_EventType()
      parser.parseObjectNext()
      parser.parseObjectKey("status")
      val status = parseDrone_Lifecycle_GovernorInput_StatusType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.Lifecycle_Request_Sample(request_event, status)
    }

    def parseDrone_Lifecycle_GovernorLifecycle_Request_Sample_Payload(): Drone_Lifecycle_Governor.Lifecycle_Request_Sample_Payload = {
      val r = parseDrone_Lifecycle_GovernorLifecycle_Request_Sample_PayloadT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorLifecycle_Request_Sample_PayloadT(typeParsed: B): Drone_Lifecycle_Governor.Lifecycle_Request_Sample_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.Lifecycle_Request_Sample_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Lifecycle_GovernorLifecycle_Request_Sample()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.Lifecycle_Request_Sample_Payload(value)
    }

    def parseDrone_Lifecycle_GovernorBattery_Sample(): Drone_Lifecycle_Governor.Battery_Sample = {
      val r = parseDrone_Lifecycle_GovernorBattery_SampleT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorBattery_SampleT(typeParsed: B): Drone_Lifecycle_Governor.Battery_Sample = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.Battery_Sample")
      }
      parser.parseObjectKey("indication")
      val indication = parseDrone_Lifecycle_GovernorBattery_IndicationType()
      parser.parseObjectNext()
      parser.parseObjectKey("status")
      val status = parseDrone_Lifecycle_GovernorInput_StatusType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.Battery_Sample(indication, status)
    }

    def parseDrone_Lifecycle_GovernorBattery_Sample_Payload(): Drone_Lifecycle_Governor.Battery_Sample_Payload = {
      val r = parseDrone_Lifecycle_GovernorBattery_Sample_PayloadT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorBattery_Sample_PayloadT(typeParsed: B): Drone_Lifecycle_Governor.Battery_Sample_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.Battery_Sample_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Lifecycle_GovernorBattery_Sample()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.Battery_Sample_Payload(value)
    }

    def parseDrone_Lifecycle_GovernorDecision_Disposition(): Drone_Lifecycle_Governor.Decision_Disposition = {
      val r = parseDrone_Lifecycle_GovernorDecision_DispositionT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorDecision_DispositionT(typeParsed: B): Drone_Lifecycle_Governor.Decision_Disposition = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.Decision_Disposition")
      }
      parser.parseObjectKey("input_fault_detected")
      val input_fault_detected = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("recovery_pending")
      val recovery_pending = parser.parseB()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.Decision_Disposition(input_fault_detected, recovery_pending)
    }

    def parseDrone_Lifecycle_GovernorDecision_Disposition_Payload(): Drone_Lifecycle_Governor.Decision_Disposition_Payload = {
      val r = parseDrone_Lifecycle_GovernorDecision_Disposition_PayloadT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorDecision_Disposition_PayloadT(typeParsed: B): Drone_Lifecycle_Governor.Decision_Disposition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.Decision_Disposition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Lifecycle_GovernorDecision_Disposition()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.Decision_Disposition_Payload(value)
    }

    def parseDrone_Lifecycle_GovernorLifecycle_Actuation(): Drone_Lifecycle_Governor.Lifecycle_Actuation = {
      val r = parseDrone_Lifecycle_GovernorLifecycle_ActuationT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorLifecycle_ActuationT(typeParsed: B): Drone_Lifecycle_Governor.Lifecycle_Actuation = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.Lifecycle_Actuation")
      }
      parser.parseObjectKey("power")
      val power = parseDrone_Lifecycle_GovernorPower_PermissionType()
      parser.parseObjectNext()
      parser.parseObjectKey("charging_permitted")
      val charging_permitted = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("flight_permitted")
      val flight_permitted = parser.parseB()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.Lifecycle_Actuation(power, charging_permitted, flight_permitted)
    }

    def parseDrone_Lifecycle_GovernorLifecycle_Actuation_Payload(): Drone_Lifecycle_Governor.Lifecycle_Actuation_Payload = {
      val r = parseDrone_Lifecycle_GovernorLifecycle_Actuation_PayloadT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorLifecycle_Actuation_PayloadT(typeParsed: B): Drone_Lifecycle_Governor.Lifecycle_Actuation_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.Lifecycle_Actuation_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Lifecycle_GovernorLifecycle_Actuation()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.Lifecycle_Actuation_Payload(value)
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

    def parseDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container(): Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PreState_Container_P", "Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PreState_Container_PS"))
      t.native match {
        case "Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PreState_Container_P" => val r = parseDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_PT(T); return r
        case "Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PreState_Container_PS" => val r = parseDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_PST(T); return r
        case _ => val r = parseDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_PST(T); return r
      }
    }

    def parseDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_P(): Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PreState_Container_P = {
      val r = parseDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_PT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_PT(typeParsed: B): Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PreState_Container_P")
      }
      parser.parseObjectKey("api_raw_request")
      val api_raw_request = parseDrone_Lifecycle_GovernorLifecycle_Request_Sample()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PreState_Container_P(api_raw_request)
    }

    def parseDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_PS(): Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PreState_Container_PS = {
      val r = parseDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_PST(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_PST(typeParsed: B): Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PreState_Container_PS")
      }
      parser.parseObjectKey("api_raw_request")
      val api_raw_request = parseDrone_Lifecycle_GovernorLifecycle_Request_Sample()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PreState_Container_PS(api_raw_request)
    }

    def parseDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container(): Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PostState_Container_P", "Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PostState_Container_PS"))
      t.native match {
        case "Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PostState_Container_P" => val r = parseDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_PT(T); return r
        case "Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PostState_Container_PS" => val r = parseDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_PST(T); return r
        case _ => val r = parseDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_PST(T); return r
      }
    }

    def parseDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_P(): Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PostState_Container_P = {
      val r = parseDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_PT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_PT(typeParsed: B): Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PostState_Container_P")
      }
      parser.parseObjectKey("api_qualified_request")
      val api_qualified_request = parseDrone_Lifecycle_GovernorQualified_RequestType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PostState_Container_P(api_qualified_request)
    }

    def parseDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_PS(): Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PostState_Container_PS = {
      val r = parseDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_PST(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_PST(typeParsed: B): Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PostState_Container_PS")
      }
      parser.parseObjectKey("api_qualified_request")
      val api_qualified_request = parseDrone_Lifecycle_GovernorQualified_RequestType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PostState_Container_PS(api_qualified_request)
    }

    def parseDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container(): Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PreState_Container_P", "Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PreState_Container_PS"))
      t.native match {
        case "Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PreState_Container_P" => val r = parseDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_PT(T); return r
        case "Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PreState_Container_PS" => val r = parseDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_PST(T); return r
        case _ => val r = parseDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_PST(T); return r
      }
    }

    def parseDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_P(): Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PreState_Container_P = {
      val r = parseDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_PT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_PT(typeParsed: B): Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PreState_Container_P")
      }
      parser.parseObjectKey("api_raw_battery")
      val api_raw_battery = parseDrone_Lifecycle_GovernorBattery_Sample()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PreState_Container_P(api_raw_battery)
    }

    def parseDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_PS(): Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PreState_Container_PS = {
      val r = parseDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_PST(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_PST(typeParsed: B): Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PreState_Container_PS")
      }
      parser.parseObjectKey("api_raw_battery")
      val api_raw_battery = parseDrone_Lifecycle_GovernorBattery_Sample()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PreState_Container_PS(api_raw_battery)
    }

    def parseDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container(): Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PostState_Container_P", "Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PostState_Container_PS"))
      t.native match {
        case "Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PostState_Container_P" => val r = parseDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_PT(T); return r
        case "Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PostState_Container_PS" => val r = parseDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_PST(T); return r
        case _ => val r = parseDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_PST(T); return r
      }
    }

    def parseDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_P(): Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PostState_Container_P = {
      val r = parseDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_PT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_PT(typeParsed: B): Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PostState_Container_P")
      }
      parser.parseObjectKey("api_battery_assessment")
      val api_battery_assessment = parseDrone_Lifecycle_GovernorBattery_Assessment_ValueType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PostState_Container_P(api_battery_assessment)
    }

    def parseDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_PS(): Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PostState_Container_PS = {
      val r = parseDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_PST(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_PST(typeParsed: B): Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PostState_Container_PS")
      }
      parser.parseObjectKey("api_battery_assessment")
      val api_battery_assessment = parseDrone_Lifecycle_GovernorBattery_Assessment_ValueType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PostState_Container_PS(api_battery_assessment)
    }

    def parseDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container(): Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_P", "Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PS"))
      t.native match {
        case "Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_P" => val r = parseDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PT(T); return r
        case "Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PS" => val r = parseDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PST(T); return r
        case _ => val r = parseDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PST(T); return r
      }
    }

    def parseDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_P(): Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_P = {
      val r = parseDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PT(typeParsed: B): Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_P")
      }
      parser.parseObjectKey("api_battery_assessment")
      val api_battery_assessment = parseDrone_Lifecycle_GovernorBattery_Assessment_ValueType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_qualified_request")
      val api_qualified_request = parseDrone_Lifecycle_GovernorQualified_RequestType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_P(api_battery_assessment, api_qualified_request)
    }

    def parseDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PS(): Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PS = {
      val r = parseDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PST(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PST(typeParsed: B): Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PS")
      }
      parser.parseObjectKey("In_current_phase")
      val In_current_phase = parseDrone_Lifecycle_GovernorLifecycle_PhaseType()
      parser.parseObjectNext()
      parser.parseObjectKey("In_recovery_required")
      val In_recovery_required = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("api_battery_assessment")
      val api_battery_assessment = parseDrone_Lifecycle_GovernorBattery_Assessment_ValueType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_qualified_request")
      val api_qualified_request = parseDrone_Lifecycle_GovernorQualified_RequestType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PS(In_current_phase, In_recovery_required, api_battery_assessment, api_qualified_request)
    }

    def parseDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container(): Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_P", "Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PS"))
      t.native match {
        case "Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_P" => val r = parseDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PT(T); return r
        case "Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PS" => val r = parseDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PST(T); return r
        case _ => val r = parseDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PST(T); return r
      }
    }

    def parseDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_P(): Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_P = {
      val r = parseDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PT(typeParsed: B): Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_P")
      }
      parser.parseObjectKey("api_decision_disposition")
      val api_decision_disposition = parseDrone_Lifecycle_GovernorDecision_Disposition()
      parser.parseObjectNext()
      parser.parseObjectKey("api_phase_report")
      val api_phase_report = parseDrone_Lifecycle_GovernorLifecycle_PhaseType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_selected_phase")
      val api_selected_phase = parseDrone_Lifecycle_GovernorLifecycle_PhaseType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_P(api_decision_disposition, api_phase_report, api_selected_phase)
    }

    def parseDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PS(): Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PS = {
      val r = parseDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PST(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PST(typeParsed: B): Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PS")
      }
      parser.parseObjectKey("current_phase")
      val current_phase = parseDrone_Lifecycle_GovernorLifecycle_PhaseType()
      parser.parseObjectNext()
      parser.parseObjectKey("recovery_required")
      val recovery_required = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("api_decision_disposition")
      val api_decision_disposition = parseDrone_Lifecycle_GovernorDecision_Disposition()
      parser.parseObjectNext()
      parser.parseObjectKey("api_phase_report")
      val api_phase_report = parseDrone_Lifecycle_GovernorLifecycle_PhaseType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_selected_phase")
      val api_selected_phase = parseDrone_Lifecycle_GovernorLifecycle_PhaseType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PS(current_phase, recovery_required, api_decision_disposition, api_phase_report, api_selected_phase)
    }

    def parseDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container(): Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_P", "Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PS"))
      t.native match {
        case "Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_P" => val r = parseDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PT(T); return r
        case "Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PS" => val r = parseDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PST(T); return r
        case _ => val r = parseDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PST(T); return r
      }
    }

    def parseDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_P(): Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_P = {
      val r = parseDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PT(typeParsed: B): Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_P")
      }
      parser.parseObjectKey("api_selected_phase")
      val api_selected_phase = parseDrone_Lifecycle_GovernorLifecycle_PhaseType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_P(api_selected_phase)
    }

    def parseDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PS(): Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PS = {
      val r = parseDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PST(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PST(typeParsed: B): Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PS")
      }
      parser.parseObjectKey("api_selected_phase")
      val api_selected_phase = parseDrone_Lifecycle_GovernorLifecycle_PhaseType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PS(api_selected_phase)
    }

    def parseDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container(): Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_P", "Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PS"))
      t.native match {
        case "Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_P" => val r = parseDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PT(T); return r
        case "Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PS" => val r = parseDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PST(T); return r
        case _ => val r = parseDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PST(T); return r
      }
    }

    def parseDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_P(): Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_P = {
      val r = parseDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PT(typeParsed: B): Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_P")
      }
      parser.parseObjectKey("api_lifecycle_actuation")
      val api_lifecycle_actuation = parseDrone_Lifecycle_GovernorLifecycle_Actuation()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_P(api_lifecycle_actuation)
    }

    def parseDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PS(): Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PS = {
      val r = parseDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PST(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PST(typeParsed: B): Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PS")
      }
      parser.parseObjectKey("api_lifecycle_actuation")
      val api_lifecycle_actuation = parseDrone_Lifecycle_GovernorLifecycle_Actuation()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PS(api_lifecycle_actuation)
    }

    def parseDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container(): Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PreState_Container_P", "Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PreState_Container_PS"))
      t.native match {
        case "Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PreState_Container_P" => val r = parseDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_PT(T); return r
        case "Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PreState_Container_PS" => val r = parseDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_PST(T); return r
        case _ => val r = parseDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_PST(T); return r
      }
    }

    def parseDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_P(): Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PreState_Container_P = {
      val r = parseDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_PT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_PT(typeParsed: B): Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PreState_Container_P")
      }
      parser.parseObjectKey("api_battery_assessment")
      val api_battery_assessment = parseDrone_Lifecycle_GovernorBattery_Assessment_ValueType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_decision_disposition")
      val api_decision_disposition = parseDrone_Lifecycle_GovernorDecision_Disposition()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PreState_Container_P(api_battery_assessment, api_decision_disposition)
    }

    def parseDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_PS(): Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PreState_Container_PS = {
      val r = parseDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_PST(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_PST(typeParsed: B): Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PreState_Container_PS")
      }
      parser.parseObjectKey("api_battery_assessment")
      val api_battery_assessment = parseDrone_Lifecycle_GovernorBattery_Assessment_ValueType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_decision_disposition")
      val api_decision_disposition = parseDrone_Lifecycle_GovernorDecision_Disposition()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PreState_Container_PS(api_battery_assessment, api_decision_disposition)
    }

    def parseDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container(): Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PostState_Container_P", "Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PostState_Container_PS"))
      t.native match {
        case "Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PostState_Container_P" => val r = parseDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_PT(T); return r
        case "Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PostState_Container_PS" => val r = parseDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_PST(T); return r
        case _ => val r = parseDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_PST(T); return r
      }
    }

    def parseDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_P(): Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PostState_Container_P = {
      val r = parseDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_PT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_PT(typeParsed: B): Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PostState_Container_P")
      }
      parser.parseObjectKey("api_attention_status")
      val api_attention_status = parseDrone_Lifecycle_GovernorAttention_StatusType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PostState_Container_P(api_attention_status)
    }

    def parseDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_PS(): Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PostState_Container_PS = {
      val r = parseDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_PST(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_PST(typeParsed: B): Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PostState_Container_PS")
      }
      parser.parseObjectKey("api_attention_status")
      val api_attention_status = parseDrone_Lifecycle_GovernorAttention_StatusType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PostState_Container_PS(api_attention_status)
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
      val t = parser.parseObjectTypes(ISZ("util.EmptyContainer", "Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PreState_Container_P", "Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PreState_Container_PS", "Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PostState_Container_P", "Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PostState_Container_PS", "Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PreState_Container_P", "Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PreState_Container_PS", "Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PostState_Container_P", "Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PostState_Container_PS", "Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PreState_Container_P", "Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PreState_Container_PS", "Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PostState_Container_P", "Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PostState_Container_PS", "Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_P", "Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PS", "Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_P", "Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PS", "Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_P", "Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PS", "Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_P", "Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PS"))
      t.native match {
        case "util.EmptyContainer" => val r = parseutilEmptyContainerT(T); return r
        case "Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PreState_Container_P" => val r = parseDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_PT(T); return r
        case "Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PreState_Container_PS" => val r = parseDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_PST(T); return r
        case "Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PostState_Container_P" => val r = parseDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_PT(T); return r
        case "Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PostState_Container_PS" => val r = parseDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_PST(T); return r
        case "Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PreState_Container_P" => val r = parseDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_PT(T); return r
        case "Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PreState_Container_PS" => val r = parseDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_PST(T); return r
        case "Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PostState_Container_P" => val r = parseDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_PT(T); return r
        case "Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PostState_Container_PS" => val r = parseDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_PST(T); return r
        case "Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PreState_Container_P" => val r = parseDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_PT(T); return r
        case "Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PreState_Container_PS" => val r = parseDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_PST(T); return r
        case "Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PostState_Container_P" => val r = parseDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_PT(T); return r
        case "Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PostState_Container_PS" => val r = parseDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_PST(T); return r
        case "Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_P" => val r = parseDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PT(T); return r
        case "Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PS" => val r = parseDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PST(T); return r
        case "Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_P" => val r = parseDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PT(T); return r
        case "Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PS" => val r = parseDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PST(T); return r
        case "Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_P" => val r = parseDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PT(T); return r
        case "Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PS" => val r = parseDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PST(T); return r
        case "Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_P" => val r = parseDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PT(T); return r
        case "Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PS" => val r = parseDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PST(T); return r
        case _ => val r = parseDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PST(T); return r
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
      val t = parser.parseObjectTypes(ISZ("art.Empty", "Base_Types.Boolean_Payload", "Base_Types.Integer_Payload", "Base_Types.Integer_8_Payload", "Base_Types.Integer_16_Payload", "Base_Types.Integer_32_Payload", "Base_Types.Integer_64_Payload", "Base_Types.Unsigned_8_Payload", "Base_Types.Unsigned_16_Payload", "Base_Types.Unsigned_32_Payload", "Base_Types.Unsigned_64_Payload", "Base_Types.Float_Payload", "Base_Types.Float_32_Payload", "Base_Types.Float_64_Payload", "Base_Types.Character_Payload", "Base_Types.String_Payload", "Base_Types.Bits_Payload", "util.EmptyContainer", "Drone_Lifecycle_Governor.Input_Status_Payload", "Drone_Lifecycle_Governor.Battery_Sample_Payload", "Drone_Lifecycle_Governor.Lifecycle_Phase_Payload", "Drone_Lifecycle_Governor.Lifecycle_Event_Payload", "Drone_Lifecycle_Governor.Power_Permission_Payload", "Drone_Lifecycle_Governor.Attention_Status_Payload", "Drone_Lifecycle_Governor.Qualified_Request_Payload", "Drone_Lifecycle_Governor.Battery_Indication_Payload", "Drone_Lifecycle_Governor.Lifecycle_Actuation_Payload", "Drone_Lifecycle_Governor.Decision_Disposition_Payload", "Drone_Lifecycle_Governor.Battery_Assessment_Value_Payload", "Drone_Lifecycle_Governor.Lifecycle_Request_Sample_Payload", "Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PreState_Container_P", "Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PreState_Container_PS", "Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PostState_Container_P", "Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PostState_Container_PS", "Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PreState_Container_P", "Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PreState_Container_PS", "Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PostState_Container_P", "Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PostState_Container_PS", "Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PreState_Container_P", "Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PreState_Container_PS", "Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PostState_Container_P", "Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PostState_Container_PS", "Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_P", "Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PS", "Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_P", "Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PS", "Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_P", "Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PS", "Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_P", "Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PS"))
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
        case "Drone_Lifecycle_Governor.Input_Status_Payload" => val r = parseDrone_Lifecycle_GovernorInput_Status_PayloadT(T); return r
        case "Drone_Lifecycle_Governor.Battery_Sample_Payload" => val r = parseDrone_Lifecycle_GovernorBattery_Sample_PayloadT(T); return r
        case "Drone_Lifecycle_Governor.Lifecycle_Phase_Payload" => val r = parseDrone_Lifecycle_GovernorLifecycle_Phase_PayloadT(T); return r
        case "Drone_Lifecycle_Governor.Lifecycle_Event_Payload" => val r = parseDrone_Lifecycle_GovernorLifecycle_Event_PayloadT(T); return r
        case "Drone_Lifecycle_Governor.Power_Permission_Payload" => val r = parseDrone_Lifecycle_GovernorPower_Permission_PayloadT(T); return r
        case "Drone_Lifecycle_Governor.Attention_Status_Payload" => val r = parseDrone_Lifecycle_GovernorAttention_Status_PayloadT(T); return r
        case "Drone_Lifecycle_Governor.Qualified_Request_Payload" => val r = parseDrone_Lifecycle_GovernorQualified_Request_PayloadT(T); return r
        case "Drone_Lifecycle_Governor.Battery_Indication_Payload" => val r = parseDrone_Lifecycle_GovernorBattery_Indication_PayloadT(T); return r
        case "Drone_Lifecycle_Governor.Lifecycle_Actuation_Payload" => val r = parseDrone_Lifecycle_GovernorLifecycle_Actuation_PayloadT(T); return r
        case "Drone_Lifecycle_Governor.Decision_Disposition_Payload" => val r = parseDrone_Lifecycle_GovernorDecision_Disposition_PayloadT(T); return r
        case "Drone_Lifecycle_Governor.Battery_Assessment_Value_Payload" => val r = parseDrone_Lifecycle_GovernorBattery_Assessment_Value_PayloadT(T); return r
        case "Drone_Lifecycle_Governor.Lifecycle_Request_Sample_Payload" => val r = parseDrone_Lifecycle_GovernorLifecycle_Request_Sample_PayloadT(T); return r
        case "Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PreState_Container_P" => val r = parseDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_PT(T); return r
        case "Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PreState_Container_PS" => val r = parseDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_PST(T); return r
        case "Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PostState_Container_P" => val r = parseDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_PT(T); return r
        case "Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PostState_Container_PS" => val r = parseDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_PST(T); return r
        case "Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PreState_Container_P" => val r = parseDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_PT(T); return r
        case "Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PreState_Container_PS" => val r = parseDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_PST(T); return r
        case "Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PostState_Container_P" => val r = parseDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_PT(T); return r
        case "Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PostState_Container_PS" => val r = parseDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_PST(T); return r
        case "Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PreState_Container_P" => val r = parseDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_PT(T); return r
        case "Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PreState_Container_PS" => val r = parseDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_PST(T); return r
        case "Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PostState_Container_P" => val r = parseDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_PT(T); return r
        case "Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PostState_Container_PS" => val r = parseDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_PST(T); return r
        case "Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_P" => val r = parseDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PT(T); return r
        case "Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PS" => val r = parseDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PST(T); return r
        case "Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_P" => val r = parseDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PT(T); return r
        case "Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PS" => val r = parseDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PST(T); return r
        case "Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_P" => val r = parseDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PT(T); return r
        case "Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PS" => val r = parseDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PST(T); return r
        case "Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_P" => val r = parseDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PT(T); return r
        case "Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PS" => val r = parseDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PST(T); return r
        case _ => val r = parseDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PST(T); return r
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

  def fromDrone_Lifecycle_GovernorLifecycle_Event_Payload(o: Drone_Lifecycle_Governor.Lifecycle_Event_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorLifecycle_Event_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorLifecycle_Event_Payload(s: String): Either[Drone_Lifecycle_Governor.Lifecycle_Event_Payload, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorLifecycle_Event_Payload(parser: Parser): Drone_Lifecycle_Governor.Lifecycle_Event_Payload = {
      val r = parser.parseDrone_Lifecycle_GovernorLifecycle_Event_Payload()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorLifecycle_Event_Payload _)
    return r
  }

  def fromDrone_Lifecycle_GovernorInput_Status_Payload(o: Drone_Lifecycle_Governor.Input_Status_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorInput_Status_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorInput_Status_Payload(s: String): Either[Drone_Lifecycle_Governor.Input_Status_Payload, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorInput_Status_Payload(parser: Parser): Drone_Lifecycle_Governor.Input_Status_Payload = {
      val r = parser.parseDrone_Lifecycle_GovernorInput_Status_Payload()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorInput_Status_Payload _)
    return r
  }

  def fromDrone_Lifecycle_GovernorQualified_Request_Payload(o: Drone_Lifecycle_Governor.Qualified_Request_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorQualified_Request_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorQualified_Request_Payload(s: String): Either[Drone_Lifecycle_Governor.Qualified_Request_Payload, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorQualified_Request_Payload(parser: Parser): Drone_Lifecycle_Governor.Qualified_Request_Payload = {
      val r = parser.parseDrone_Lifecycle_GovernorQualified_Request_Payload()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorQualified_Request_Payload _)
    return r
  }

  def fromDrone_Lifecycle_GovernorBattery_Indication_Payload(o: Drone_Lifecycle_Governor.Battery_Indication_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorBattery_Indication_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorBattery_Indication_Payload(s: String): Either[Drone_Lifecycle_Governor.Battery_Indication_Payload, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorBattery_Indication_Payload(parser: Parser): Drone_Lifecycle_Governor.Battery_Indication_Payload = {
      val r = parser.parseDrone_Lifecycle_GovernorBattery_Indication_Payload()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorBattery_Indication_Payload _)
    return r
  }

  def fromDrone_Lifecycle_GovernorBattery_Assessment_Value_Payload(o: Drone_Lifecycle_Governor.Battery_Assessment_Value_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorBattery_Assessment_Value_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorBattery_Assessment_Value_Payload(s: String): Either[Drone_Lifecycle_Governor.Battery_Assessment_Value_Payload, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorBattery_Assessment_Value_Payload(parser: Parser): Drone_Lifecycle_Governor.Battery_Assessment_Value_Payload = {
      val r = parser.parseDrone_Lifecycle_GovernorBattery_Assessment_Value_Payload()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorBattery_Assessment_Value_Payload _)
    return r
  }

  def fromDrone_Lifecycle_GovernorLifecycle_Phase_Payload(o: Drone_Lifecycle_Governor.Lifecycle_Phase_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorLifecycle_Phase_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorLifecycle_Phase_Payload(s: String): Either[Drone_Lifecycle_Governor.Lifecycle_Phase_Payload, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorLifecycle_Phase_Payload(parser: Parser): Drone_Lifecycle_Governor.Lifecycle_Phase_Payload = {
      val r = parser.parseDrone_Lifecycle_GovernorLifecycle_Phase_Payload()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorLifecycle_Phase_Payload _)
    return r
  }

  def fromDrone_Lifecycle_GovernorPower_Permission_Payload(o: Drone_Lifecycle_Governor.Power_Permission_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorPower_Permission_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorPower_Permission_Payload(s: String): Either[Drone_Lifecycle_Governor.Power_Permission_Payload, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorPower_Permission_Payload(parser: Parser): Drone_Lifecycle_Governor.Power_Permission_Payload = {
      val r = parser.parseDrone_Lifecycle_GovernorPower_Permission_Payload()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorPower_Permission_Payload _)
    return r
  }

  def fromDrone_Lifecycle_GovernorAttention_Status_Payload(o: Drone_Lifecycle_Governor.Attention_Status_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorAttention_Status_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorAttention_Status_Payload(s: String): Either[Drone_Lifecycle_Governor.Attention_Status_Payload, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorAttention_Status_Payload(parser: Parser): Drone_Lifecycle_Governor.Attention_Status_Payload = {
      val r = parser.parseDrone_Lifecycle_GovernorAttention_Status_Payload()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorAttention_Status_Payload _)
    return r
  }

  def fromDrone_Lifecycle_GovernorLifecycle_Request_Sample(o: Drone_Lifecycle_Governor.Lifecycle_Request_Sample, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorLifecycle_Request_Sample(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorLifecycle_Request_Sample(s: String): Either[Drone_Lifecycle_Governor.Lifecycle_Request_Sample, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorLifecycle_Request_Sample(parser: Parser): Drone_Lifecycle_Governor.Lifecycle_Request_Sample = {
      val r = parser.parseDrone_Lifecycle_GovernorLifecycle_Request_Sample()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorLifecycle_Request_Sample _)
    return r
  }

  def fromDrone_Lifecycle_GovernorLifecycle_Request_Sample_Payload(o: Drone_Lifecycle_Governor.Lifecycle_Request_Sample_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorLifecycle_Request_Sample_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorLifecycle_Request_Sample_Payload(s: String): Either[Drone_Lifecycle_Governor.Lifecycle_Request_Sample_Payload, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorLifecycle_Request_Sample_Payload(parser: Parser): Drone_Lifecycle_Governor.Lifecycle_Request_Sample_Payload = {
      val r = parser.parseDrone_Lifecycle_GovernorLifecycle_Request_Sample_Payload()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorLifecycle_Request_Sample_Payload _)
    return r
  }

  def fromDrone_Lifecycle_GovernorBattery_Sample(o: Drone_Lifecycle_Governor.Battery_Sample, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorBattery_Sample(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorBattery_Sample(s: String): Either[Drone_Lifecycle_Governor.Battery_Sample, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorBattery_Sample(parser: Parser): Drone_Lifecycle_Governor.Battery_Sample = {
      val r = parser.parseDrone_Lifecycle_GovernorBattery_Sample()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorBattery_Sample _)
    return r
  }

  def fromDrone_Lifecycle_GovernorBattery_Sample_Payload(o: Drone_Lifecycle_Governor.Battery_Sample_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorBattery_Sample_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorBattery_Sample_Payload(s: String): Either[Drone_Lifecycle_Governor.Battery_Sample_Payload, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorBattery_Sample_Payload(parser: Parser): Drone_Lifecycle_Governor.Battery_Sample_Payload = {
      val r = parser.parseDrone_Lifecycle_GovernorBattery_Sample_Payload()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorBattery_Sample_Payload _)
    return r
  }

  def fromDrone_Lifecycle_GovernorDecision_Disposition(o: Drone_Lifecycle_Governor.Decision_Disposition, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorDecision_Disposition(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorDecision_Disposition(s: String): Either[Drone_Lifecycle_Governor.Decision_Disposition, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorDecision_Disposition(parser: Parser): Drone_Lifecycle_Governor.Decision_Disposition = {
      val r = parser.parseDrone_Lifecycle_GovernorDecision_Disposition()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorDecision_Disposition _)
    return r
  }

  def fromDrone_Lifecycle_GovernorDecision_Disposition_Payload(o: Drone_Lifecycle_Governor.Decision_Disposition_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorDecision_Disposition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorDecision_Disposition_Payload(s: String): Either[Drone_Lifecycle_Governor.Decision_Disposition_Payload, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorDecision_Disposition_Payload(parser: Parser): Drone_Lifecycle_Governor.Decision_Disposition_Payload = {
      val r = parser.parseDrone_Lifecycle_GovernorDecision_Disposition_Payload()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorDecision_Disposition_Payload _)
    return r
  }

  def fromDrone_Lifecycle_GovernorLifecycle_Actuation(o: Drone_Lifecycle_Governor.Lifecycle_Actuation, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorLifecycle_Actuation(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorLifecycle_Actuation(s: String): Either[Drone_Lifecycle_Governor.Lifecycle_Actuation, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorLifecycle_Actuation(parser: Parser): Drone_Lifecycle_Governor.Lifecycle_Actuation = {
      val r = parser.parseDrone_Lifecycle_GovernorLifecycle_Actuation()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorLifecycle_Actuation _)
    return r
  }

  def fromDrone_Lifecycle_GovernorLifecycle_Actuation_Payload(o: Drone_Lifecycle_Governor.Lifecycle_Actuation_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorLifecycle_Actuation_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorLifecycle_Actuation_Payload(s: String): Either[Drone_Lifecycle_Governor.Lifecycle_Actuation_Payload, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorLifecycle_Actuation_Payload(parser: Parser): Drone_Lifecycle_Governor.Lifecycle_Actuation_Payload = {
      val r = parser.parseDrone_Lifecycle_GovernorLifecycle_Actuation_Payload()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorLifecycle_Actuation_Payload _)
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

  def fromDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container(o: Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PreState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container(s: String): Either[Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PreState_Container, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container(parser: Parser): Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PreState_Container = {
      val r = parser.parseDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container _)
    return r
  }

  def fromDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_P(o: Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_P(s: String): Either[Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PreState_Container_P, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_P(parser: Parser): Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PreState_Container_P = {
      val r = parser.parseDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_P()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_PS(o: Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_PS(s: String): Either[Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PreState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_PS(parser: Parser): Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PreState_Container_PS = {
      val r = parser.parseDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container(o: Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PostState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container(s: String): Either[Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PostState_Container, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container(parser: Parser): Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PostState_Container = {
      val r = parser.parseDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container _)
    return r
  }

  def fromDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_P(o: Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_P(s: String): Either[Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PostState_Container_P, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_P(parser: Parser): Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PostState_Container_P = {
      val r = parser.parseDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_P()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_PS(o: Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_PS(s: String): Either[Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PostState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_PS(parser: Parser): Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PostState_Container_PS = {
      val r = parser.parseDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container(o: Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PreState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container(s: String): Either[Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PreState_Container, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container(parser: Parser): Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PreState_Container = {
      val r = parser.parseDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container _)
    return r
  }

  def fromDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_P(o: Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_P(s: String): Either[Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PreState_Container_P, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_P(parser: Parser): Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PreState_Container_P = {
      val r = parser.parseDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_P()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_PS(o: Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_PS(s: String): Either[Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PreState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_PS(parser: Parser): Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PreState_Container_PS = {
      val r = parser.parseDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container(o: Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PostState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container(s: String): Either[Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PostState_Container, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container(parser: Parser): Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PostState_Container = {
      val r = parser.parseDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container _)
    return r
  }

  def fromDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_P(o: Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_P(s: String): Either[Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PostState_Container_P, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_P(parser: Parser): Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PostState_Container_P = {
      val r = parser.parseDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_P()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_PS(o: Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_PS(s: String): Either[Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PostState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_PS(parser: Parser): Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PostState_Container_PS = {
      val r = parser.parseDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container(o: Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container(s: String): Either[Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container(parser: Parser): Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container = {
      val r = parser.parseDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container _)
    return r
  }

  def fromDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_P(o: Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_P(s: String): Either[Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_P, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_P(parser: Parser): Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_P = {
      val r = parser.parseDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_P()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PS(o: Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PS(s: String): Either[Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PS(parser: Parser): Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PS = {
      val r = parser.parseDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container(o: Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container(s: String): Either[Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container(parser: Parser): Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container = {
      val r = parser.parseDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container _)
    return r
  }

  def fromDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_P(o: Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_P(s: String): Either[Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_P, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_P(parser: Parser): Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_P = {
      val r = parser.parseDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_P()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PS(o: Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PS(s: String): Either[Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PS(parser: Parser): Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PS = {
      val r = parser.parseDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container(o: Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container(s: String): Either[Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container(parser: Parser): Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container = {
      val r = parser.parseDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container _)
    return r
  }

  def fromDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_P(o: Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_P(s: String): Either[Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_P, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_P(parser: Parser): Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_P = {
      val r = parser.parseDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_P()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PS(o: Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PS(s: String): Either[Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PS(parser: Parser): Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PS = {
      val r = parser.parseDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container(o: Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container(s: String): Either[Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container(parser: Parser): Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container = {
      val r = parser.parseDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container _)
    return r
  }

  def fromDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_P(o: Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_P(s: String): Either[Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_P, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_P(parser: Parser): Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_P = {
      val r = parser.parseDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_P()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PS(o: Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PS(s: String): Either[Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PS(parser: Parser): Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PS = {
      val r = parser.parseDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container(o: Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PreState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container(s: String): Either[Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PreState_Container, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container(parser: Parser): Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PreState_Container = {
      val r = parser.parseDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container _)
    return r
  }

  def fromDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_P(o: Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_P(s: String): Either[Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PreState_Container_P, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_P(parser: Parser): Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PreState_Container_P = {
      val r = parser.parseDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_P()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_PS(o: Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_PS(s: String): Either[Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PreState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_PS(parser: Parser): Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PreState_Container_PS = {
      val r = parser.parseDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container(o: Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PostState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container(s: String): Either[Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PostState_Container, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container(parser: Parser): Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PostState_Container = {
      val r = parser.parseDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container _)
    return r
  }

  def fromDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_P(o: Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_P(s: String): Either[Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PostState_Container_P, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_P(parser: Parser): Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PostState_Container_P = {
      val r = parser.parseDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_P()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_PS(o: Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_PS(s: String): Either[Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PostState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_PS(parser: Parser): Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PostState_Container_PS = {
      val r = parser.parseDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_PS _)
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