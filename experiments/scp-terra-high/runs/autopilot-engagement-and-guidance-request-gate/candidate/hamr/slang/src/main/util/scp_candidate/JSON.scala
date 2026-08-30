// #Sireum
// @formatter:off

// This file is auto-generated from Engage_AP_Command.scala, Engage_Command_Status.scala, Guidance_Readiness.scala, Attitude_Acceptability.scala, AP_Availability.scala, AP_Guidance_Request.scala, AP_Status.scala, AP_On_Indication.scala, Base_Types.scala, FCI_Command_Intake_Thread_control_process_fci_command_intake_Containers.scala, Engagement_Decision_Thread_control_process_engagement_decision_Containers.scala, Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_Containers.scala, Status_Reporting_Thread_control_process_status_reporting_Containers.scala, CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package scp_candidate

import org.sireum._
import org.sireum.Json.Printer._

object JSON {

  object Printer {

    @pure def printFAA_Autopilot_EngagementEngage_AP_CommandType(o: FAA_Autopilot_Engagement.Engage_AP_Command.Type): ST = {
      val value: String = o match {
        case FAA_Autopilot_Engagement.Engage_AP_Command.Requested => "Requested"
        case FAA_Autopilot_Engagement.Engage_AP_Command.Not_Requested => "Not_Requested"
      }
      return printObject(ISZ(
        ("type", printString("FAA_Autopilot_Engagement.Engage_AP_Command")),
        ("value", printString(value))
      ))
    }

    @pure def printFAA_Autopilot_EngagementEngage_AP_Command_Payload(o: FAA_Autopilot_Engagement.Engage_AP_Command_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""FAA_Autopilot_Engagement.Engage_AP_Command_Payload""""),
        ("value", printFAA_Autopilot_EngagementEngage_AP_CommandType(o.value))
      ))
    }

    @pure def printFAA_Autopilot_EngagementEngage_Command_StatusType(o: FAA_Autopilot_Engagement.Engage_Command_Status.Type): ST = {
      val value: String = o match {
        case FAA_Autopilot_Engagement.Engage_Command_Status.Valid => "Valid"
        case FAA_Autopilot_Engagement.Engage_Command_Status.Invalid => "Invalid"
      }
      return printObject(ISZ(
        ("type", printString("FAA_Autopilot_Engagement.Engage_Command_Status")),
        ("value", printString(value))
      ))
    }

    @pure def printFAA_Autopilot_EngagementEngage_Command_Status_Payload(o: FAA_Autopilot_Engagement.Engage_Command_Status_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""FAA_Autopilot_Engagement.Engage_Command_Status_Payload""""),
        ("value", printFAA_Autopilot_EngagementEngage_Command_StatusType(o.value))
      ))
    }

    @pure def printFAA_Autopilot_EngagementGuidance_ReadinessType(o: FAA_Autopilot_Engagement.Guidance_Readiness.Type): ST = {
      val value: String = o match {
        case FAA_Autopilot_Engagement.Guidance_Readiness.Ready => "Ready"
        case FAA_Autopilot_Engagement.Guidance_Readiness.Not_Ready => "Not_Ready"
      }
      return printObject(ISZ(
        ("type", printString("FAA_Autopilot_Engagement.Guidance_Readiness")),
        ("value", printString(value))
      ))
    }

    @pure def printFAA_Autopilot_EngagementGuidance_Readiness_Payload(o: FAA_Autopilot_Engagement.Guidance_Readiness_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""FAA_Autopilot_Engagement.Guidance_Readiness_Payload""""),
        ("value", printFAA_Autopilot_EngagementGuidance_ReadinessType(o.value))
      ))
    }

    @pure def printFAA_Autopilot_EngagementAttitude_AcceptabilityType(o: FAA_Autopilot_Engagement.Attitude_Acceptability.Type): ST = {
      val value: String = o match {
        case FAA_Autopilot_Engagement.Attitude_Acceptability.Acceptable => "Acceptable"
        case FAA_Autopilot_Engagement.Attitude_Acceptability.Not_Acceptable => "Not_Acceptable"
      }
      return printObject(ISZ(
        ("type", printString("FAA_Autopilot_Engagement.Attitude_Acceptability")),
        ("value", printString(value))
      ))
    }

    @pure def printFAA_Autopilot_EngagementAttitude_Acceptability_Payload(o: FAA_Autopilot_Engagement.Attitude_Acceptability_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""FAA_Autopilot_Engagement.Attitude_Acceptability_Payload""""),
        ("value", printFAA_Autopilot_EngagementAttitude_AcceptabilityType(o.value))
      ))
    }

    @pure def printFAA_Autopilot_EngagementAP_AvailabilityType(o: FAA_Autopilot_Engagement.AP_Availability.Type): ST = {
      val value: String = o match {
        case FAA_Autopilot_Engagement.AP_Availability.Available => "Available"
        case FAA_Autopilot_Engagement.AP_Availability.Failed => "Failed"
      }
      return printObject(ISZ(
        ("type", printString("FAA_Autopilot_Engagement.AP_Availability")),
        ("value", printString(value))
      ))
    }

    @pure def printFAA_Autopilot_EngagementAP_Availability_Payload(o: FAA_Autopilot_Engagement.AP_Availability_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""FAA_Autopilot_Engagement.AP_Availability_Payload""""),
        ("value", printFAA_Autopilot_EngagementAP_AvailabilityType(o.value))
      ))
    }

    @pure def printFAA_Autopilot_EngagementAP_Guidance_RequestType(o: FAA_Autopilot_Engagement.AP_Guidance_Request.Type): ST = {
      val value: String = o match {
        case FAA_Autopilot_Engagement.AP_Guidance_Request.Requested => "Requested"
        case FAA_Autopilot_Engagement.AP_Guidance_Request.Not_Requested => "Not_Requested"
      }
      return printObject(ISZ(
        ("type", printString("FAA_Autopilot_Engagement.AP_Guidance_Request")),
        ("value", printString(value))
      ))
    }

    @pure def printFAA_Autopilot_EngagementAP_Guidance_Request_Payload(o: FAA_Autopilot_Engagement.AP_Guidance_Request_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""FAA_Autopilot_Engagement.AP_Guidance_Request_Payload""""),
        ("value", printFAA_Autopilot_EngagementAP_Guidance_RequestType(o.value))
      ))
    }

    @pure def printFAA_Autopilot_EngagementAP_StatusType(o: FAA_Autopilot_Engagement.AP_Status.Type): ST = {
      val value: String = o match {
        case FAA_Autopilot_Engagement.AP_Status.Failed => "Failed"
        case FAA_Autopilot_Engagement.AP_Status.Off => "Off"
        case FAA_Autopilot_Engagement.AP_Status.On => "On"
      }
      return printObject(ISZ(
        ("type", printString("FAA_Autopilot_Engagement.AP_Status")),
        ("value", printString(value))
      ))
    }

    @pure def printFAA_Autopilot_EngagementAP_Status_Payload(o: FAA_Autopilot_Engagement.AP_Status_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""FAA_Autopilot_Engagement.AP_Status_Payload""""),
        ("value", printFAA_Autopilot_EngagementAP_StatusType(o.value))
      ))
    }

    @pure def printFAA_Autopilot_EngagementAP_On_IndicationType(o: FAA_Autopilot_Engagement.AP_On_Indication.Type): ST = {
      val value: String = o match {
        case FAA_Autopilot_Engagement.AP_On_Indication.Enabled => "Enabled"
        case FAA_Autopilot_Engagement.AP_On_Indication.Disabled => "Disabled"
      }
      return printObject(ISZ(
        ("type", printString("FAA_Autopilot_Engagement.AP_On_Indication")),
        ("value", printString(value))
      ))
    }

    @pure def printFAA_Autopilot_EngagementAP_On_Indication_Payload(o: FAA_Autopilot_Engagement.AP_On_Indication_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""FAA_Autopilot_Engagement.AP_On_Indication_Payload""""),
        ("value", printFAA_Autopilot_EngagementAP_On_IndicationType(o.value))
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

    @pure def printFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container(o: FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container): ST = {
      o match {
        case o: FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_P => return printFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_P(o)
        case o: FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PS => return printFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PS(o)
      }
    }

    @pure def printFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_P(o: FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_P""""),
        ("api_command_status_in", printFAA_Autopilot_EngagementEngage_Command_StatusType(o.api_command_status_in)),
        ("api_engage_ap_in", printFAA_Autopilot_EngagementEngage_AP_CommandType(o.api_engage_ap_in))
      ))
    }

    @pure def printFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PS(o: FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PS""""),
        ("api_command_status_in", printFAA_Autopilot_EngagementEngage_Command_StatusType(o.api_command_status_in)),
        ("api_engage_ap_in", printFAA_Autopilot_EngagementEngage_AP_CommandType(o.api_engage_ap_in))
      ))
    }

    @pure def printFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container(o: FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container): ST = {
      o match {
        case o: FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_P => return printFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_P(o)
        case o: FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PS => return printFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PS(o)
      }
    }

    @pure def printFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_P(o: FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_P""""),
        ("api_command_status_out", printFAA_Autopilot_EngagementEngage_Command_StatusType(o.api_command_status_out)),
        ("api_engage_ap_out", printFAA_Autopilot_EngagementEngage_AP_CommandType(o.api_engage_ap_out))
      ))
    }

    @pure def printFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PS(o: FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PS""""),
        ("api_command_status_out", printFAA_Autopilot_EngagementEngage_Command_StatusType(o.api_command_status_out)),
        ("api_engage_ap_out", printFAA_Autopilot_EngagementEngage_AP_CommandType(o.api_engage_ap_out))
      ))
    }

    @pure def printFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container(o: FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PreState_Container): ST = {
      o match {
        case o: FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PreState_Container_P => return printFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_P(o)
        case o: FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PS => return printFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PS(o)
      }
    }

    @pure def printFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_P(o: FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PreState_Container_P""""),
        ("api_ap_availability", printFAA_Autopilot_EngagementAP_AvailabilityType(o.api_ap_availability)),
        ("api_attitude_acceptable", printFAA_Autopilot_EngagementAttitude_AcceptabilityType(o.api_attitude_acceptable)),
        ("api_command_status", printFAA_Autopilot_EngagementEngage_Command_StatusType(o.api_command_status)),
        ("api_engage_ap", printFAA_Autopilot_EngagementEngage_AP_CommandType(o.api_engage_ap)),
        ("api_guidance_valid", printFAA_Autopilot_EngagementGuidance_ReadinessType(o.api_guidance_valid))
      ))
    }

    @pure def printFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PS(o: FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PS""""),
        ("api_ap_availability", printFAA_Autopilot_EngagementAP_AvailabilityType(o.api_ap_availability)),
        ("api_attitude_acceptable", printFAA_Autopilot_EngagementAttitude_AcceptabilityType(o.api_attitude_acceptable)),
        ("api_command_status", printFAA_Autopilot_EngagementEngage_Command_StatusType(o.api_command_status)),
        ("api_engage_ap", printFAA_Autopilot_EngagementEngage_AP_CommandType(o.api_engage_ap)),
        ("api_guidance_valid", printFAA_Autopilot_EngagementGuidance_ReadinessType(o.api_guidance_valid))
      ))
    }

    @pure def printFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container(o: FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PostState_Container): ST = {
      o match {
        case o: FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PostState_Container_P => return printFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_P(o)
        case o: FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PS => return printFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PS(o)
      }
    }

    @pure def printFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_P(o: FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PostState_Container_P""""),
        ("api_ap_guidance_request", printFAA_Autopilot_EngagementAP_Guidance_RequestType(o.api_ap_guidance_request)),
        ("api_ap_on", printFAA_Autopilot_EngagementAP_On_IndicationType(o.api_ap_on)),
        ("api_ap_status", printFAA_Autopilot_EngagementAP_StatusType(o.api_ap_status))
      ))
    }

    @pure def printFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PS(o: FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PS""""),
        ("api_ap_guidance_request", printFAA_Autopilot_EngagementAP_Guidance_RequestType(o.api_ap_guidance_request)),
        ("api_ap_on", printFAA_Autopilot_EngagementAP_On_IndicationType(o.api_ap_on)),
        ("api_ap_status", printFAA_Autopilot_EngagementAP_StatusType(o.api_ap_status))
      ))
    }

    @pure def printFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container(o: FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container): ST = {
      o match {
        case o: FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_P => return printFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_P(o)
        case o: FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PS => return printFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PS(o)
      }
    }

    @pure def printFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_P(o: FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_P""""),
        ("api_request_in", printFAA_Autopilot_EngagementAP_Guidance_RequestType(o.api_request_in))
      ))
    }

    @pure def printFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PS(o: FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PS""""),
        ("api_request_in", printFAA_Autopilot_EngagementAP_Guidance_RequestType(o.api_request_in))
      ))
    }

    @pure def printFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container(o: FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container): ST = {
      o match {
        case o: FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_P => return printFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_P(o)
        case o: FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PS => return printFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PS(o)
      }
    }

    @pure def printFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_P(o: FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_P""""),
        ("api_request_out", printFAA_Autopilot_EngagementAP_Guidance_RequestType(o.api_request_out))
      ))
    }

    @pure def printFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PS(o: FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PS""""),
        ("api_request_out", printFAA_Autopilot_EngagementAP_Guidance_RequestType(o.api_request_out))
      ))
    }

    @pure def printFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container(o: FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PreState_Container): ST = {
      o match {
        case o: FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PreState_Container_P => return printFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_P(o)
        case o: FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PreState_Container_PS => return printFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_PS(o)
      }
    }

    @pure def printFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_P(o: FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PreState_Container_P""""),
        ("api_status_in", printFAA_Autopilot_EngagementAP_StatusType(o.api_status_in))
      ))
    }

    @pure def printFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_PS(o: FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PreState_Container_PS""""),
        ("api_status_in", printFAA_Autopilot_EngagementAP_StatusType(o.api_status_in))
      ))
    }

    @pure def printFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container(o: FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PostState_Container): ST = {
      o match {
        case o: FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PostState_Container_P => return printFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_P(o)
        case o: FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PostState_Container_PS => return printFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_PS(o)
      }
    }

    @pure def printFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_P(o: FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PostState_Container_P""""),
        ("api_status_out", printFAA_Autopilot_EngagementAP_StatusType(o.api_status_out))
      ))
    }

    @pure def printFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_PS(o: FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PostState_Container_PS""""),
        ("api_status_out", printFAA_Autopilot_EngagementAP_StatusType(o.api_status_out))
      ))
    }

    @pure def printFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container(o: FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container): ST = {
      o match {
        case o: FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_P => return printFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_P(o)
        case o: FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PS => return printFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PS(o)
      }
    }

    @pure def printFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_P(o: FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_P""""),
        ("api_ap_on_in", printFAA_Autopilot_EngagementAP_On_IndicationType(o.api_ap_on_in))
      ))
    }

    @pure def printFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PS(o: FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PS""""),
        ("api_ap_on_in", printFAA_Autopilot_EngagementAP_On_IndicationType(o.api_ap_on_in))
      ))
    }

    @pure def printFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container(o: FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container): ST = {
      o match {
        case o: FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_P => return printFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_P(o)
        case o: FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PS => return printFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PS(o)
      }
    }

    @pure def printFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_P(o: FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_P""""),
        ("api_ap_on_out", printFAA_Autopilot_EngagementAP_On_IndicationType(o.api_ap_on_out))
      ))
    }

    @pure def printFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PS(o: FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PS""""),
        ("api_ap_on_out", printFAA_Autopilot_EngagementAP_On_IndicationType(o.api_ap_on_out))
      ))
    }

    @pure def printruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): ST = {
      val value: String = o match {
        case runtimemonitor.ObservationKind.Autopilot_Engagement_System_Instance_control_process_fci_command_intake_postInit => "Autopilot_Engagement_System_Instance_control_process_fci_command_intake_postInit"
        case runtimemonitor.ObservationKind.Autopilot_Engagement_System_Instance_control_process_fci_command_intake_preCompute => "Autopilot_Engagement_System_Instance_control_process_fci_command_intake_preCompute"
        case runtimemonitor.ObservationKind.Autopilot_Engagement_System_Instance_control_process_fci_command_intake_postCompute => "Autopilot_Engagement_System_Instance_control_process_fci_command_intake_postCompute"
        case runtimemonitor.ObservationKind.Autopilot_Engagement_System_Instance_control_process_engagement_decision_postInit => "Autopilot_Engagement_System_Instance_control_process_engagement_decision_postInit"
        case runtimemonitor.ObservationKind.Autopilot_Engagement_System_Instance_control_process_engagement_decision_preCompute => "Autopilot_Engagement_System_Instance_control_process_engagement_decision_preCompute"
        case runtimemonitor.ObservationKind.Autopilot_Engagement_System_Instance_control_process_engagement_decision_postCompute => "Autopilot_Engagement_System_Instance_control_process_engagement_decision_postCompute"
        case runtimemonitor.ObservationKind.Autopilot_Engagement_System_Instance_control_process_guidance_request_delivery_postInit => "Autopilot_Engagement_System_Instance_control_process_guidance_request_delivery_postInit"
        case runtimemonitor.ObservationKind.Autopilot_Engagement_System_Instance_control_process_guidance_request_delivery_preCompute => "Autopilot_Engagement_System_Instance_control_process_guidance_request_delivery_preCompute"
        case runtimemonitor.ObservationKind.Autopilot_Engagement_System_Instance_control_process_guidance_request_delivery_postCompute => "Autopilot_Engagement_System_Instance_control_process_guidance_request_delivery_postCompute"
        case runtimemonitor.ObservationKind.Autopilot_Engagement_System_Instance_control_process_status_reporting_postInit => "Autopilot_Engagement_System_Instance_control_process_status_reporting_postInit"
        case runtimemonitor.ObservationKind.Autopilot_Engagement_System_Instance_control_process_status_reporting_preCompute => "Autopilot_Engagement_System_Instance_control_process_status_reporting_preCompute"
        case runtimemonitor.ObservationKind.Autopilot_Engagement_System_Instance_control_process_status_reporting_postCompute => "Autopilot_Engagement_System_Instance_control_process_status_reporting_postCompute"
        case runtimemonitor.ObservationKind.Autopilot_Engagement_System_Instance_control_process_csa_enable_delivery_postInit => "Autopilot_Engagement_System_Instance_control_process_csa_enable_delivery_postInit"
        case runtimemonitor.ObservationKind.Autopilot_Engagement_System_Instance_control_process_csa_enable_delivery_preCompute => "Autopilot_Engagement_System_Instance_control_process_csa_enable_delivery_preCompute"
        case runtimemonitor.ObservationKind.Autopilot_Engagement_System_Instance_control_process_csa_enable_delivery_postCompute => "Autopilot_Engagement_System_Instance_control_process_csa_enable_delivery_postCompute"
      }
      return printObject(ISZ(
        ("type", printString("runtimemonitor.ObservationKind")),
        ("value", printString(value))
      ))
    }

    @pure def printutilContainer(o: util.Container): ST = {
      o match {
        case o: util.EmptyContainer => return printutilEmptyContainer(o)
        case o: FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PreState_Container_P => return printFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_P(o)
        case o: FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PreState_Container_PS => return printFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_PS(o)
        case o: FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PostState_Container_P => return printFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_P(o)
        case o: FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PostState_Container_PS => return printFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_PS(o)
        case o: FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_P => return printFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_P(o)
        case o: FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PS => return printFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PS(o)
        case o: FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_P => return printFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_P(o)
        case o: FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PS => return printFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PS(o)
        case o: FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_P => return printFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_P(o)
        case o: FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PreState_Container_P => return printFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_P(o)
        case o: FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PS => return printFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PS(o)
        case o: FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_P => return printFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_P(o)
        case o: FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PS => return printFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PS(o)
        case o: FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PS => return printFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PS(o)
        case o: FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PostState_Container_P => return printFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_P(o)
        case o: FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PS => return printFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PS(o)
        case o: FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_P => return printFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_P(o)
        case o: FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PS => return printFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PS(o)
        case o: FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_P => return printFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_P(o)
        case o: FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PS => return printFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PS(o)
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
        case o: FAA_Autopilot_Engagement.AP_Status_Payload => return printFAA_Autopilot_EngagementAP_Status_Payload(o)
        case o: FAA_Autopilot_Engagement.AP_Availability_Payload => return printFAA_Autopilot_EngagementAP_Availability_Payload(o)
        case o: FAA_Autopilot_Engagement.AP_On_Indication_Payload => return printFAA_Autopilot_EngagementAP_On_Indication_Payload(o)
        case o: FAA_Autopilot_Engagement.Engage_AP_Command_Payload => return printFAA_Autopilot_EngagementEngage_AP_Command_Payload(o)
        case o: FAA_Autopilot_Engagement.Guidance_Readiness_Payload => return printFAA_Autopilot_EngagementGuidance_Readiness_Payload(o)
        case o: FAA_Autopilot_Engagement.AP_Guidance_Request_Payload => return printFAA_Autopilot_EngagementAP_Guidance_Request_Payload(o)
        case o: FAA_Autopilot_Engagement.Engage_Command_Status_Payload => return printFAA_Autopilot_EngagementEngage_Command_Status_Payload(o)
        case o: FAA_Autopilot_Engagement.Attitude_Acceptability_Payload => return printFAA_Autopilot_EngagementAttitude_Acceptability_Payload(o)
        case o: FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PreState_Container_P => return printFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_P(o)
        case o: FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PreState_Container_PS => return printFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_PS(o)
        case o: FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PostState_Container_P => return printFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_P(o)
        case o: FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PostState_Container_PS => return printFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_PS(o)
        case o: FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_P => return printFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_P(o)
        case o: FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PS => return printFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PS(o)
        case o: FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_P => return printFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_P(o)
        case o: FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PS => return printFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PS(o)
        case o: FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_P => return printFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_P(o)
        case o: FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PreState_Container_P => return printFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_P(o)
        case o: FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PS => return printFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PS(o)
        case o: FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_P => return printFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_P(o)
        case o: FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PS => return printFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PS(o)
        case o: FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PS => return printFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PS(o)
        case o: FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PostState_Container_P => return printFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_P(o)
        case o: FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PS => return printFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PS(o)
        case o: FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_P => return printFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_P(o)
        case o: FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PS => return printFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PS(o)
        case o: FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_P => return printFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_P(o)
        case o: FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PS => return printFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PS(o)
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

    def parseFAA_Autopilot_EngagementEngage_AP_CommandType(): FAA_Autopilot_Engagement.Engage_AP_Command.Type = {
      val r = parseFAA_Autopilot_EngagementEngage_AP_CommandT(F)
      return r
    }

    def parseFAA_Autopilot_EngagementEngage_AP_CommandT(typeParsed: B): FAA_Autopilot_Engagement.Engage_AP_Command.Type = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_Autopilot_Engagement.Engage_AP_Command")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      FAA_Autopilot_Engagement.Engage_AP_Command.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for FAA_Autopilot_Engagement.Engage_AP_Command.")
          return FAA_Autopilot_Engagement.Engage_AP_Command.byOrdinal(0).get
      }
    }

    def parseFAA_Autopilot_EngagementEngage_AP_Command_Payload(): FAA_Autopilot_Engagement.Engage_AP_Command_Payload = {
      val r = parseFAA_Autopilot_EngagementEngage_AP_Command_PayloadT(F)
      return r
    }

    def parseFAA_Autopilot_EngagementEngage_AP_Command_PayloadT(typeParsed: B): FAA_Autopilot_Engagement.Engage_AP_Command_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_Autopilot_Engagement.Engage_AP_Command_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFAA_Autopilot_EngagementEngage_AP_CommandType()
      parser.parseObjectNext()
      return FAA_Autopilot_Engagement.Engage_AP_Command_Payload(value)
    }

    def parseFAA_Autopilot_EngagementEngage_Command_StatusType(): FAA_Autopilot_Engagement.Engage_Command_Status.Type = {
      val r = parseFAA_Autopilot_EngagementEngage_Command_StatusT(F)
      return r
    }

    def parseFAA_Autopilot_EngagementEngage_Command_StatusT(typeParsed: B): FAA_Autopilot_Engagement.Engage_Command_Status.Type = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_Autopilot_Engagement.Engage_Command_Status")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      FAA_Autopilot_Engagement.Engage_Command_Status.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for FAA_Autopilot_Engagement.Engage_Command_Status.")
          return FAA_Autopilot_Engagement.Engage_Command_Status.byOrdinal(0).get
      }
    }

    def parseFAA_Autopilot_EngagementEngage_Command_Status_Payload(): FAA_Autopilot_Engagement.Engage_Command_Status_Payload = {
      val r = parseFAA_Autopilot_EngagementEngage_Command_Status_PayloadT(F)
      return r
    }

    def parseFAA_Autopilot_EngagementEngage_Command_Status_PayloadT(typeParsed: B): FAA_Autopilot_Engagement.Engage_Command_Status_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_Autopilot_Engagement.Engage_Command_Status_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFAA_Autopilot_EngagementEngage_Command_StatusType()
      parser.parseObjectNext()
      return FAA_Autopilot_Engagement.Engage_Command_Status_Payload(value)
    }

    def parseFAA_Autopilot_EngagementGuidance_ReadinessType(): FAA_Autopilot_Engagement.Guidance_Readiness.Type = {
      val r = parseFAA_Autopilot_EngagementGuidance_ReadinessT(F)
      return r
    }

    def parseFAA_Autopilot_EngagementGuidance_ReadinessT(typeParsed: B): FAA_Autopilot_Engagement.Guidance_Readiness.Type = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_Autopilot_Engagement.Guidance_Readiness")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      FAA_Autopilot_Engagement.Guidance_Readiness.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for FAA_Autopilot_Engagement.Guidance_Readiness.")
          return FAA_Autopilot_Engagement.Guidance_Readiness.byOrdinal(0).get
      }
    }

    def parseFAA_Autopilot_EngagementGuidance_Readiness_Payload(): FAA_Autopilot_Engagement.Guidance_Readiness_Payload = {
      val r = parseFAA_Autopilot_EngagementGuidance_Readiness_PayloadT(F)
      return r
    }

    def parseFAA_Autopilot_EngagementGuidance_Readiness_PayloadT(typeParsed: B): FAA_Autopilot_Engagement.Guidance_Readiness_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_Autopilot_Engagement.Guidance_Readiness_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFAA_Autopilot_EngagementGuidance_ReadinessType()
      parser.parseObjectNext()
      return FAA_Autopilot_Engagement.Guidance_Readiness_Payload(value)
    }

    def parseFAA_Autopilot_EngagementAttitude_AcceptabilityType(): FAA_Autopilot_Engagement.Attitude_Acceptability.Type = {
      val r = parseFAA_Autopilot_EngagementAttitude_AcceptabilityT(F)
      return r
    }

    def parseFAA_Autopilot_EngagementAttitude_AcceptabilityT(typeParsed: B): FAA_Autopilot_Engagement.Attitude_Acceptability.Type = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_Autopilot_Engagement.Attitude_Acceptability")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      FAA_Autopilot_Engagement.Attitude_Acceptability.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for FAA_Autopilot_Engagement.Attitude_Acceptability.")
          return FAA_Autopilot_Engagement.Attitude_Acceptability.byOrdinal(0).get
      }
    }

    def parseFAA_Autopilot_EngagementAttitude_Acceptability_Payload(): FAA_Autopilot_Engagement.Attitude_Acceptability_Payload = {
      val r = parseFAA_Autopilot_EngagementAttitude_Acceptability_PayloadT(F)
      return r
    }

    def parseFAA_Autopilot_EngagementAttitude_Acceptability_PayloadT(typeParsed: B): FAA_Autopilot_Engagement.Attitude_Acceptability_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_Autopilot_Engagement.Attitude_Acceptability_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFAA_Autopilot_EngagementAttitude_AcceptabilityType()
      parser.parseObjectNext()
      return FAA_Autopilot_Engagement.Attitude_Acceptability_Payload(value)
    }

    def parseFAA_Autopilot_EngagementAP_AvailabilityType(): FAA_Autopilot_Engagement.AP_Availability.Type = {
      val r = parseFAA_Autopilot_EngagementAP_AvailabilityT(F)
      return r
    }

    def parseFAA_Autopilot_EngagementAP_AvailabilityT(typeParsed: B): FAA_Autopilot_Engagement.AP_Availability.Type = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_Autopilot_Engagement.AP_Availability")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      FAA_Autopilot_Engagement.AP_Availability.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for FAA_Autopilot_Engagement.AP_Availability.")
          return FAA_Autopilot_Engagement.AP_Availability.byOrdinal(0).get
      }
    }

    def parseFAA_Autopilot_EngagementAP_Availability_Payload(): FAA_Autopilot_Engagement.AP_Availability_Payload = {
      val r = parseFAA_Autopilot_EngagementAP_Availability_PayloadT(F)
      return r
    }

    def parseFAA_Autopilot_EngagementAP_Availability_PayloadT(typeParsed: B): FAA_Autopilot_Engagement.AP_Availability_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_Autopilot_Engagement.AP_Availability_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFAA_Autopilot_EngagementAP_AvailabilityType()
      parser.parseObjectNext()
      return FAA_Autopilot_Engagement.AP_Availability_Payload(value)
    }

    def parseFAA_Autopilot_EngagementAP_Guidance_RequestType(): FAA_Autopilot_Engagement.AP_Guidance_Request.Type = {
      val r = parseFAA_Autopilot_EngagementAP_Guidance_RequestT(F)
      return r
    }

    def parseFAA_Autopilot_EngagementAP_Guidance_RequestT(typeParsed: B): FAA_Autopilot_Engagement.AP_Guidance_Request.Type = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_Autopilot_Engagement.AP_Guidance_Request")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      FAA_Autopilot_Engagement.AP_Guidance_Request.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for FAA_Autopilot_Engagement.AP_Guidance_Request.")
          return FAA_Autopilot_Engagement.AP_Guidance_Request.byOrdinal(0).get
      }
    }

    def parseFAA_Autopilot_EngagementAP_Guidance_Request_Payload(): FAA_Autopilot_Engagement.AP_Guidance_Request_Payload = {
      val r = parseFAA_Autopilot_EngagementAP_Guidance_Request_PayloadT(F)
      return r
    }

    def parseFAA_Autopilot_EngagementAP_Guidance_Request_PayloadT(typeParsed: B): FAA_Autopilot_Engagement.AP_Guidance_Request_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_Autopilot_Engagement.AP_Guidance_Request_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFAA_Autopilot_EngagementAP_Guidance_RequestType()
      parser.parseObjectNext()
      return FAA_Autopilot_Engagement.AP_Guidance_Request_Payload(value)
    }

    def parseFAA_Autopilot_EngagementAP_StatusType(): FAA_Autopilot_Engagement.AP_Status.Type = {
      val r = parseFAA_Autopilot_EngagementAP_StatusT(F)
      return r
    }

    def parseFAA_Autopilot_EngagementAP_StatusT(typeParsed: B): FAA_Autopilot_Engagement.AP_Status.Type = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_Autopilot_Engagement.AP_Status")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      FAA_Autopilot_Engagement.AP_Status.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for FAA_Autopilot_Engagement.AP_Status.")
          return FAA_Autopilot_Engagement.AP_Status.byOrdinal(0).get
      }
    }

    def parseFAA_Autopilot_EngagementAP_Status_Payload(): FAA_Autopilot_Engagement.AP_Status_Payload = {
      val r = parseFAA_Autopilot_EngagementAP_Status_PayloadT(F)
      return r
    }

    def parseFAA_Autopilot_EngagementAP_Status_PayloadT(typeParsed: B): FAA_Autopilot_Engagement.AP_Status_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_Autopilot_Engagement.AP_Status_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFAA_Autopilot_EngagementAP_StatusType()
      parser.parseObjectNext()
      return FAA_Autopilot_Engagement.AP_Status_Payload(value)
    }

    def parseFAA_Autopilot_EngagementAP_On_IndicationType(): FAA_Autopilot_Engagement.AP_On_Indication.Type = {
      val r = parseFAA_Autopilot_EngagementAP_On_IndicationT(F)
      return r
    }

    def parseFAA_Autopilot_EngagementAP_On_IndicationT(typeParsed: B): FAA_Autopilot_Engagement.AP_On_Indication.Type = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_Autopilot_Engagement.AP_On_Indication")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      FAA_Autopilot_Engagement.AP_On_Indication.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for FAA_Autopilot_Engagement.AP_On_Indication.")
          return FAA_Autopilot_Engagement.AP_On_Indication.byOrdinal(0).get
      }
    }

    def parseFAA_Autopilot_EngagementAP_On_Indication_Payload(): FAA_Autopilot_Engagement.AP_On_Indication_Payload = {
      val r = parseFAA_Autopilot_EngagementAP_On_Indication_PayloadT(F)
      return r
    }

    def parseFAA_Autopilot_EngagementAP_On_Indication_PayloadT(typeParsed: B): FAA_Autopilot_Engagement.AP_On_Indication_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_Autopilot_Engagement.AP_On_Indication_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFAA_Autopilot_EngagementAP_On_IndicationType()
      parser.parseObjectNext()
      return FAA_Autopilot_Engagement.AP_On_Indication_Payload(value)
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

    def parseFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container(): FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_P", "FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PS"))
      t.native match {
        case "FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_P" => val r = parseFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PT(T); return r
        case "FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PS" => val r = parseFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PST(T); return r
        case _ => val r = parseFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PST(T); return r
      }
    }

    def parseFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_P(): FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_P = {
      val r = parseFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PT(F)
      return r
    }

    def parseFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PT(typeParsed: B): FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_P")
      }
      parser.parseObjectKey("api_command_status_in")
      val api_command_status_in = parseFAA_Autopilot_EngagementEngage_Command_StatusType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_engage_ap_in")
      val api_engage_ap_in = parseFAA_Autopilot_EngagementEngage_AP_CommandType()
      parser.parseObjectNext()
      return FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_P(api_command_status_in, api_engage_ap_in)
    }

    def parseFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PS(): FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PS = {
      val r = parseFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PST(F)
      return r
    }

    def parseFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PST(typeParsed: B): FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PS")
      }
      parser.parseObjectKey("api_command_status_in")
      val api_command_status_in = parseFAA_Autopilot_EngagementEngage_Command_StatusType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_engage_ap_in")
      val api_engage_ap_in = parseFAA_Autopilot_EngagementEngage_AP_CommandType()
      parser.parseObjectNext()
      return FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PS(api_command_status_in, api_engage_ap_in)
    }

    def parseFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container(): FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_P", "FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PS"))
      t.native match {
        case "FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_P" => val r = parseFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PT(T); return r
        case "FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PS" => val r = parseFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PST(T); return r
        case _ => val r = parseFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PST(T); return r
      }
    }

    def parseFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_P(): FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_P = {
      val r = parseFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PT(F)
      return r
    }

    def parseFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PT(typeParsed: B): FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_P")
      }
      parser.parseObjectKey("api_command_status_out")
      val api_command_status_out = parseFAA_Autopilot_EngagementEngage_Command_StatusType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_engage_ap_out")
      val api_engage_ap_out = parseFAA_Autopilot_EngagementEngage_AP_CommandType()
      parser.parseObjectNext()
      return FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_P(api_command_status_out, api_engage_ap_out)
    }

    def parseFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PS(): FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PS = {
      val r = parseFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PST(F)
      return r
    }

    def parseFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PST(typeParsed: B): FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PS")
      }
      parser.parseObjectKey("api_command_status_out")
      val api_command_status_out = parseFAA_Autopilot_EngagementEngage_Command_StatusType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_engage_ap_out")
      val api_engage_ap_out = parseFAA_Autopilot_EngagementEngage_AP_CommandType()
      parser.parseObjectNext()
      return FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PS(api_command_status_out, api_engage_ap_out)
    }

    def parseFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container(): FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PreState_Container_P", "FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PS"))
      t.native match {
        case "FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PreState_Container_P" => val r = parseFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PT(T); return r
        case "FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PS" => val r = parseFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PST(T); return r
        case _ => val r = parseFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PST(T); return r
      }
    }

    def parseFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_P(): FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PreState_Container_P = {
      val r = parseFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PT(F)
      return r
    }

    def parseFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PT(typeParsed: B): FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PreState_Container_P")
      }
      parser.parseObjectKey("api_ap_availability")
      val api_ap_availability = parseFAA_Autopilot_EngagementAP_AvailabilityType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_attitude_acceptable")
      val api_attitude_acceptable = parseFAA_Autopilot_EngagementAttitude_AcceptabilityType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_command_status")
      val api_command_status = parseFAA_Autopilot_EngagementEngage_Command_StatusType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_engage_ap")
      val api_engage_ap = parseFAA_Autopilot_EngagementEngage_AP_CommandType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_guidance_valid")
      val api_guidance_valid = parseFAA_Autopilot_EngagementGuidance_ReadinessType()
      parser.parseObjectNext()
      return FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PreState_Container_P(api_ap_availability, api_attitude_acceptable, api_command_status, api_engage_ap, api_guidance_valid)
    }

    def parseFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PS(): FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PS = {
      val r = parseFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PST(F)
      return r
    }

    def parseFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PST(typeParsed: B): FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PS")
      }
      parser.parseObjectKey("api_ap_availability")
      val api_ap_availability = parseFAA_Autopilot_EngagementAP_AvailabilityType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_attitude_acceptable")
      val api_attitude_acceptable = parseFAA_Autopilot_EngagementAttitude_AcceptabilityType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_command_status")
      val api_command_status = parseFAA_Autopilot_EngagementEngage_Command_StatusType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_engage_ap")
      val api_engage_ap = parseFAA_Autopilot_EngagementEngage_AP_CommandType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_guidance_valid")
      val api_guidance_valid = parseFAA_Autopilot_EngagementGuidance_ReadinessType()
      parser.parseObjectNext()
      return FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PS(api_ap_availability, api_attitude_acceptable, api_command_status, api_engage_ap, api_guidance_valid)
    }

    def parseFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container(): FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PostState_Container_P", "FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PS"))
      t.native match {
        case "FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PostState_Container_P" => val r = parseFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PT(T); return r
        case "FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PS" => val r = parseFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PST(T); return r
        case _ => val r = parseFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PST(T); return r
      }
    }

    def parseFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_P(): FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PostState_Container_P = {
      val r = parseFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PT(F)
      return r
    }

    def parseFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PT(typeParsed: B): FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PostState_Container_P")
      }
      parser.parseObjectKey("api_ap_guidance_request")
      val api_ap_guidance_request = parseFAA_Autopilot_EngagementAP_Guidance_RequestType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_ap_on")
      val api_ap_on = parseFAA_Autopilot_EngagementAP_On_IndicationType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_ap_status")
      val api_ap_status = parseFAA_Autopilot_EngagementAP_StatusType()
      parser.parseObjectNext()
      return FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PostState_Container_P(api_ap_guidance_request, api_ap_on, api_ap_status)
    }

    def parseFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PS(): FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PS = {
      val r = parseFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PST(F)
      return r
    }

    def parseFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PST(typeParsed: B): FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PS")
      }
      parser.parseObjectKey("api_ap_guidance_request")
      val api_ap_guidance_request = parseFAA_Autopilot_EngagementAP_Guidance_RequestType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_ap_on")
      val api_ap_on = parseFAA_Autopilot_EngagementAP_On_IndicationType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_ap_status")
      val api_ap_status = parseFAA_Autopilot_EngagementAP_StatusType()
      parser.parseObjectNext()
      return FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PS(api_ap_guidance_request, api_ap_on, api_ap_status)
    }

    def parseFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container(): FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_P", "FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PS"))
      t.native match {
        case "FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_P" => val r = parseFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PT(T); return r
        case "FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PS" => val r = parseFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PST(T); return r
        case _ => val r = parseFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PST(T); return r
      }
    }

    def parseFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_P(): FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_P = {
      val r = parseFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PT(F)
      return r
    }

    def parseFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PT(typeParsed: B): FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_P")
      }
      parser.parseObjectKey("api_request_in")
      val api_request_in = parseFAA_Autopilot_EngagementAP_Guidance_RequestType()
      parser.parseObjectNext()
      return FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_P(api_request_in)
    }

    def parseFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PS(): FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PS = {
      val r = parseFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PST(F)
      return r
    }

    def parseFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PST(typeParsed: B): FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PS")
      }
      parser.parseObjectKey("api_request_in")
      val api_request_in = parseFAA_Autopilot_EngagementAP_Guidance_RequestType()
      parser.parseObjectNext()
      return FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PS(api_request_in)
    }

    def parseFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container(): FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_P", "FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PS"))
      t.native match {
        case "FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_P" => val r = parseFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PT(T); return r
        case "FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PS" => val r = parseFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PST(T); return r
        case _ => val r = parseFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PST(T); return r
      }
    }

    def parseFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_P(): FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_P = {
      val r = parseFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PT(F)
      return r
    }

    def parseFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PT(typeParsed: B): FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_P")
      }
      parser.parseObjectKey("api_request_out")
      val api_request_out = parseFAA_Autopilot_EngagementAP_Guidance_RequestType()
      parser.parseObjectNext()
      return FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_P(api_request_out)
    }

    def parseFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PS(): FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PS = {
      val r = parseFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PST(F)
      return r
    }

    def parseFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PST(typeParsed: B): FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PS")
      }
      parser.parseObjectKey("api_request_out")
      val api_request_out = parseFAA_Autopilot_EngagementAP_Guidance_RequestType()
      parser.parseObjectNext()
      return FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PS(api_request_out)
    }

    def parseFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container(): FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PreState_Container_P", "FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PreState_Container_PS"))
      t.native match {
        case "FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PreState_Container_P" => val r = parseFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_PT(T); return r
        case "FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PreState_Container_PS" => val r = parseFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_PST(T); return r
        case _ => val r = parseFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_PST(T); return r
      }
    }

    def parseFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_P(): FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PreState_Container_P = {
      val r = parseFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_PT(F)
      return r
    }

    def parseFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_PT(typeParsed: B): FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PreState_Container_P")
      }
      parser.parseObjectKey("api_status_in")
      val api_status_in = parseFAA_Autopilot_EngagementAP_StatusType()
      parser.parseObjectNext()
      return FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PreState_Container_P(api_status_in)
    }

    def parseFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_PS(): FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PreState_Container_PS = {
      val r = parseFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_PST(F)
      return r
    }

    def parseFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_PST(typeParsed: B): FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PreState_Container_PS")
      }
      parser.parseObjectKey("api_status_in")
      val api_status_in = parseFAA_Autopilot_EngagementAP_StatusType()
      parser.parseObjectNext()
      return FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PreState_Container_PS(api_status_in)
    }

    def parseFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container(): FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PostState_Container_P", "FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PostState_Container_PS"))
      t.native match {
        case "FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PostState_Container_P" => val r = parseFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_PT(T); return r
        case "FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PostState_Container_PS" => val r = parseFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_PST(T); return r
        case _ => val r = parseFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_PST(T); return r
      }
    }

    def parseFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_P(): FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PostState_Container_P = {
      val r = parseFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_PT(F)
      return r
    }

    def parseFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_PT(typeParsed: B): FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PostState_Container_P")
      }
      parser.parseObjectKey("api_status_out")
      val api_status_out = parseFAA_Autopilot_EngagementAP_StatusType()
      parser.parseObjectNext()
      return FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PostState_Container_P(api_status_out)
    }

    def parseFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_PS(): FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PostState_Container_PS = {
      val r = parseFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_PST(F)
      return r
    }

    def parseFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_PST(typeParsed: B): FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PostState_Container_PS")
      }
      parser.parseObjectKey("api_status_out")
      val api_status_out = parseFAA_Autopilot_EngagementAP_StatusType()
      parser.parseObjectNext()
      return FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PostState_Container_PS(api_status_out)
    }

    def parseFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container(): FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_P", "FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PS"))
      t.native match {
        case "FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_P" => val r = parseFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PT(T); return r
        case "FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PS" => val r = parseFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PST(T); return r
        case _ => val r = parseFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PST(T); return r
      }
    }

    def parseFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_P(): FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_P = {
      val r = parseFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PT(F)
      return r
    }

    def parseFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PT(typeParsed: B): FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_P")
      }
      parser.parseObjectKey("api_ap_on_in")
      val api_ap_on_in = parseFAA_Autopilot_EngagementAP_On_IndicationType()
      parser.parseObjectNext()
      return FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_P(api_ap_on_in)
    }

    def parseFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PS(): FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PS = {
      val r = parseFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PST(F)
      return r
    }

    def parseFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PST(typeParsed: B): FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PS")
      }
      parser.parseObjectKey("api_ap_on_in")
      val api_ap_on_in = parseFAA_Autopilot_EngagementAP_On_IndicationType()
      parser.parseObjectNext()
      return FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PS(api_ap_on_in)
    }

    def parseFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container(): FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_P", "FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PS"))
      t.native match {
        case "FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_P" => val r = parseFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PT(T); return r
        case "FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PS" => val r = parseFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PST(T); return r
        case _ => val r = parseFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PST(T); return r
      }
    }

    def parseFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_P(): FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_P = {
      val r = parseFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PT(F)
      return r
    }

    def parseFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PT(typeParsed: B): FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_P")
      }
      parser.parseObjectKey("api_ap_on_out")
      val api_ap_on_out = parseFAA_Autopilot_EngagementAP_On_IndicationType()
      parser.parseObjectNext()
      return FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_P(api_ap_on_out)
    }

    def parseFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PS(): FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PS = {
      val r = parseFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PST(F)
      return r
    }

    def parseFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PST(typeParsed: B): FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PS")
      }
      parser.parseObjectKey("api_ap_on_out")
      val api_ap_on_out = parseFAA_Autopilot_EngagementAP_On_IndicationType()
      parser.parseObjectNext()
      return FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PS(api_ap_on_out)
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
      val t = parser.parseObjectTypes(ISZ("util.EmptyContainer", "FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PreState_Container_P", "FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PreState_Container_PS", "FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PostState_Container_P", "FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PostState_Container_PS", "FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_P", "FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PS", "FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_P", "FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PS", "FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_P", "FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PreState_Container_P", "FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PS", "FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_P", "FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PS", "FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PS", "FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PostState_Container_P", "FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PS", "FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_P", "FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PS", "FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_P", "FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PS"))
      t.native match {
        case "util.EmptyContainer" => val r = parseutilEmptyContainerT(T); return r
        case "FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PreState_Container_P" => val r = parseFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_PT(T); return r
        case "FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PreState_Container_PS" => val r = parseFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_PST(T); return r
        case "FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PostState_Container_P" => val r = parseFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_PT(T); return r
        case "FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PostState_Container_PS" => val r = parseFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_PST(T); return r
        case "FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_P" => val r = parseFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PT(T); return r
        case "FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PS" => val r = parseFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PST(T); return r
        case "FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_P" => val r = parseFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PT(T); return r
        case "FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PS" => val r = parseFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PST(T); return r
        case "FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_P" => val r = parseFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PT(T); return r
        case "FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PreState_Container_P" => val r = parseFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PT(T); return r
        case "FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PS" => val r = parseFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PST(T); return r
        case "FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_P" => val r = parseFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PT(T); return r
        case "FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PS" => val r = parseFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PST(T); return r
        case "FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PS" => val r = parseFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PST(T); return r
        case "FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PostState_Container_P" => val r = parseFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PT(T); return r
        case "FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PS" => val r = parseFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PST(T); return r
        case "FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_P" => val r = parseFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PT(T); return r
        case "FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PS" => val r = parseFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PST(T); return r
        case "FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_P" => val r = parseFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PT(T); return r
        case "FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PS" => val r = parseFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PST(T); return r
        case _ => val r = parseFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PST(T); return r
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
      val t = parser.parseObjectTypes(ISZ("art.Empty", "Base_Types.Boolean_Payload", "Base_Types.Integer_Payload", "Base_Types.Integer_8_Payload", "Base_Types.Integer_16_Payload", "Base_Types.Integer_32_Payload", "Base_Types.Integer_64_Payload", "Base_Types.Unsigned_8_Payload", "Base_Types.Unsigned_16_Payload", "Base_Types.Unsigned_32_Payload", "Base_Types.Unsigned_64_Payload", "Base_Types.Float_Payload", "Base_Types.Float_32_Payload", "Base_Types.Float_64_Payload", "Base_Types.Character_Payload", "Base_Types.String_Payload", "Base_Types.Bits_Payload", "util.EmptyContainer", "FAA_Autopilot_Engagement.AP_Status_Payload", "FAA_Autopilot_Engagement.AP_Availability_Payload", "FAA_Autopilot_Engagement.AP_On_Indication_Payload", "FAA_Autopilot_Engagement.Engage_AP_Command_Payload", "FAA_Autopilot_Engagement.Guidance_Readiness_Payload", "FAA_Autopilot_Engagement.AP_Guidance_Request_Payload", "FAA_Autopilot_Engagement.Engage_Command_Status_Payload", "FAA_Autopilot_Engagement.Attitude_Acceptability_Payload", "FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PreState_Container_P", "FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PreState_Container_PS", "FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PostState_Container_P", "FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PostState_Container_PS", "FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_P", "FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PS", "FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_P", "FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PS", "FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_P", "FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PreState_Container_P", "FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PS", "FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_P", "FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PS", "FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PS", "FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PostState_Container_P", "FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PS", "FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_P", "FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PS", "FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_P", "FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PS"))
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
        case "FAA_Autopilot_Engagement.AP_Status_Payload" => val r = parseFAA_Autopilot_EngagementAP_Status_PayloadT(T); return r
        case "FAA_Autopilot_Engagement.AP_Availability_Payload" => val r = parseFAA_Autopilot_EngagementAP_Availability_PayloadT(T); return r
        case "FAA_Autopilot_Engagement.AP_On_Indication_Payload" => val r = parseFAA_Autopilot_EngagementAP_On_Indication_PayloadT(T); return r
        case "FAA_Autopilot_Engagement.Engage_AP_Command_Payload" => val r = parseFAA_Autopilot_EngagementEngage_AP_Command_PayloadT(T); return r
        case "FAA_Autopilot_Engagement.Guidance_Readiness_Payload" => val r = parseFAA_Autopilot_EngagementGuidance_Readiness_PayloadT(T); return r
        case "FAA_Autopilot_Engagement.AP_Guidance_Request_Payload" => val r = parseFAA_Autopilot_EngagementAP_Guidance_Request_PayloadT(T); return r
        case "FAA_Autopilot_Engagement.Engage_Command_Status_Payload" => val r = parseFAA_Autopilot_EngagementEngage_Command_Status_PayloadT(T); return r
        case "FAA_Autopilot_Engagement.Attitude_Acceptability_Payload" => val r = parseFAA_Autopilot_EngagementAttitude_Acceptability_PayloadT(T); return r
        case "FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PreState_Container_P" => val r = parseFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_PT(T); return r
        case "FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PreState_Container_PS" => val r = parseFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_PST(T); return r
        case "FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PostState_Container_P" => val r = parseFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_PT(T); return r
        case "FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PostState_Container_PS" => val r = parseFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_PST(T); return r
        case "FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_P" => val r = parseFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PT(T); return r
        case "FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PS" => val r = parseFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PST(T); return r
        case "FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_P" => val r = parseFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PT(T); return r
        case "FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PS" => val r = parseFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PST(T); return r
        case "FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_P" => val r = parseFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PT(T); return r
        case "FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PreState_Container_P" => val r = parseFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PT(T); return r
        case "FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PS" => val r = parseFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PST(T); return r
        case "FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_P" => val r = parseFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PT(T); return r
        case "FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PS" => val r = parseFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PST(T); return r
        case "FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PS" => val r = parseFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PST(T); return r
        case "FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PostState_Container_P" => val r = parseFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PT(T); return r
        case "FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PS" => val r = parseFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PST(T); return r
        case "FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_P" => val r = parseFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PT(T); return r
        case "FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PS" => val r = parseFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PST(T); return r
        case "FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_P" => val r = parseFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PT(T); return r
        case "FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PS" => val r = parseFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PST(T); return r
        case _ => val r = parseFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PST(T); return r
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

  def fromFAA_Autopilot_EngagementEngage_AP_Command_Payload(o: FAA_Autopilot_Engagement.Engage_AP_Command_Payload, isCompact: B): String = {
    val st = Printer.printFAA_Autopilot_EngagementEngage_AP_Command_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_Autopilot_EngagementEngage_AP_Command_Payload(s: String): Either[FAA_Autopilot_Engagement.Engage_AP_Command_Payload, Json.ErrorMsg] = {
    def fFAA_Autopilot_EngagementEngage_AP_Command_Payload(parser: Parser): FAA_Autopilot_Engagement.Engage_AP_Command_Payload = {
      val r = parser.parseFAA_Autopilot_EngagementEngage_AP_Command_Payload()
      return r
    }
    val r = to(s, fFAA_Autopilot_EngagementEngage_AP_Command_Payload _)
    return r
  }

  def fromFAA_Autopilot_EngagementEngage_Command_Status_Payload(o: FAA_Autopilot_Engagement.Engage_Command_Status_Payload, isCompact: B): String = {
    val st = Printer.printFAA_Autopilot_EngagementEngage_Command_Status_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_Autopilot_EngagementEngage_Command_Status_Payload(s: String): Either[FAA_Autopilot_Engagement.Engage_Command_Status_Payload, Json.ErrorMsg] = {
    def fFAA_Autopilot_EngagementEngage_Command_Status_Payload(parser: Parser): FAA_Autopilot_Engagement.Engage_Command_Status_Payload = {
      val r = parser.parseFAA_Autopilot_EngagementEngage_Command_Status_Payload()
      return r
    }
    val r = to(s, fFAA_Autopilot_EngagementEngage_Command_Status_Payload _)
    return r
  }

  def fromFAA_Autopilot_EngagementGuidance_Readiness_Payload(o: FAA_Autopilot_Engagement.Guidance_Readiness_Payload, isCompact: B): String = {
    val st = Printer.printFAA_Autopilot_EngagementGuidance_Readiness_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_Autopilot_EngagementGuidance_Readiness_Payload(s: String): Either[FAA_Autopilot_Engagement.Guidance_Readiness_Payload, Json.ErrorMsg] = {
    def fFAA_Autopilot_EngagementGuidance_Readiness_Payload(parser: Parser): FAA_Autopilot_Engagement.Guidance_Readiness_Payload = {
      val r = parser.parseFAA_Autopilot_EngagementGuidance_Readiness_Payload()
      return r
    }
    val r = to(s, fFAA_Autopilot_EngagementGuidance_Readiness_Payload _)
    return r
  }

  def fromFAA_Autopilot_EngagementAttitude_Acceptability_Payload(o: FAA_Autopilot_Engagement.Attitude_Acceptability_Payload, isCompact: B): String = {
    val st = Printer.printFAA_Autopilot_EngagementAttitude_Acceptability_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_Autopilot_EngagementAttitude_Acceptability_Payload(s: String): Either[FAA_Autopilot_Engagement.Attitude_Acceptability_Payload, Json.ErrorMsg] = {
    def fFAA_Autopilot_EngagementAttitude_Acceptability_Payload(parser: Parser): FAA_Autopilot_Engagement.Attitude_Acceptability_Payload = {
      val r = parser.parseFAA_Autopilot_EngagementAttitude_Acceptability_Payload()
      return r
    }
    val r = to(s, fFAA_Autopilot_EngagementAttitude_Acceptability_Payload _)
    return r
  }

  def fromFAA_Autopilot_EngagementAP_Availability_Payload(o: FAA_Autopilot_Engagement.AP_Availability_Payload, isCompact: B): String = {
    val st = Printer.printFAA_Autopilot_EngagementAP_Availability_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_Autopilot_EngagementAP_Availability_Payload(s: String): Either[FAA_Autopilot_Engagement.AP_Availability_Payload, Json.ErrorMsg] = {
    def fFAA_Autopilot_EngagementAP_Availability_Payload(parser: Parser): FAA_Autopilot_Engagement.AP_Availability_Payload = {
      val r = parser.parseFAA_Autopilot_EngagementAP_Availability_Payload()
      return r
    }
    val r = to(s, fFAA_Autopilot_EngagementAP_Availability_Payload _)
    return r
  }

  def fromFAA_Autopilot_EngagementAP_Guidance_Request_Payload(o: FAA_Autopilot_Engagement.AP_Guidance_Request_Payload, isCompact: B): String = {
    val st = Printer.printFAA_Autopilot_EngagementAP_Guidance_Request_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_Autopilot_EngagementAP_Guidance_Request_Payload(s: String): Either[FAA_Autopilot_Engagement.AP_Guidance_Request_Payload, Json.ErrorMsg] = {
    def fFAA_Autopilot_EngagementAP_Guidance_Request_Payload(parser: Parser): FAA_Autopilot_Engagement.AP_Guidance_Request_Payload = {
      val r = parser.parseFAA_Autopilot_EngagementAP_Guidance_Request_Payload()
      return r
    }
    val r = to(s, fFAA_Autopilot_EngagementAP_Guidance_Request_Payload _)
    return r
  }

  def fromFAA_Autopilot_EngagementAP_Status_Payload(o: FAA_Autopilot_Engagement.AP_Status_Payload, isCompact: B): String = {
    val st = Printer.printFAA_Autopilot_EngagementAP_Status_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_Autopilot_EngagementAP_Status_Payload(s: String): Either[FAA_Autopilot_Engagement.AP_Status_Payload, Json.ErrorMsg] = {
    def fFAA_Autopilot_EngagementAP_Status_Payload(parser: Parser): FAA_Autopilot_Engagement.AP_Status_Payload = {
      val r = parser.parseFAA_Autopilot_EngagementAP_Status_Payload()
      return r
    }
    val r = to(s, fFAA_Autopilot_EngagementAP_Status_Payload _)
    return r
  }

  def fromFAA_Autopilot_EngagementAP_On_Indication_Payload(o: FAA_Autopilot_Engagement.AP_On_Indication_Payload, isCompact: B): String = {
    val st = Printer.printFAA_Autopilot_EngagementAP_On_Indication_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_Autopilot_EngagementAP_On_Indication_Payload(s: String): Either[FAA_Autopilot_Engagement.AP_On_Indication_Payload, Json.ErrorMsg] = {
    def fFAA_Autopilot_EngagementAP_On_Indication_Payload(parser: Parser): FAA_Autopilot_Engagement.AP_On_Indication_Payload = {
      val r = parser.parseFAA_Autopilot_EngagementAP_On_Indication_Payload()
      return r
    }
    val r = to(s, fFAA_Autopilot_EngagementAP_On_Indication_Payload _)
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

  def fromFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container(o: FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container, isCompact: B): String = {
    val st = Printer.printFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container(s: String): Either[FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container, Json.ErrorMsg] = {
    def fFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container(parser: Parser): FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container = {
      val r = parser.parseFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container()
      return r
    }
    val r = to(s, fFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container _)
    return r
  }

  def fromFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_P(o: FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_P(s: String): Either[FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_P, Json.ErrorMsg] = {
    def fFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_P(parser: Parser): FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_P = {
      val r = parser.parseFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_P()
      return r
    }
    val r = to(s, fFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_P _)
    return r
  }

  def fromFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PS(o: FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PS(s: String): Either[FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PS, Json.ErrorMsg] = {
    def fFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PS(parser: Parser): FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PS = {
      val r = parser.parseFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PS()
      return r
    }
    val r = to(s, fFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PS _)
    return r
  }

  def fromFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container(o: FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container, isCompact: B): String = {
    val st = Printer.printFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container(s: String): Either[FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container, Json.ErrorMsg] = {
    def fFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container(parser: Parser): FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container = {
      val r = parser.parseFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container()
      return r
    }
    val r = to(s, fFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container _)
    return r
  }

  def fromFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_P(o: FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_P(s: String): Either[FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_P, Json.ErrorMsg] = {
    def fFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_P(parser: Parser): FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_P = {
      val r = parser.parseFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_P()
      return r
    }
    val r = to(s, fFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_P _)
    return r
  }

  def fromFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PS(o: FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PS(s: String): Either[FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PS, Json.ErrorMsg] = {
    def fFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PS(parser: Parser): FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PS = {
      val r = parser.parseFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PS()
      return r
    }
    val r = to(s, fFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PS _)
    return r
  }

  def fromFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container(o: FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PreState_Container, isCompact: B): String = {
    val st = Printer.printFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container(s: String): Either[FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PreState_Container, Json.ErrorMsg] = {
    def fFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container(parser: Parser): FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PreState_Container = {
      val r = parser.parseFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container()
      return r
    }
    val r = to(s, fFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container _)
    return r
  }

  def fromFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_P(o: FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_P(s: String): Either[FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PreState_Container_P, Json.ErrorMsg] = {
    def fFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_P(parser: Parser): FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PreState_Container_P = {
      val r = parser.parseFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_P()
      return r
    }
    val r = to(s, fFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_P _)
    return r
  }

  def fromFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PS(o: FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PS(s: String): Either[FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PS, Json.ErrorMsg] = {
    def fFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PS(parser: Parser): FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PS = {
      val r = parser.parseFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PS()
      return r
    }
    val r = to(s, fFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PS _)
    return r
  }

  def fromFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container(o: FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PostState_Container, isCompact: B): String = {
    val st = Printer.printFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container(s: String): Either[FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PostState_Container, Json.ErrorMsg] = {
    def fFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container(parser: Parser): FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PostState_Container = {
      val r = parser.parseFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container()
      return r
    }
    val r = to(s, fFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container _)
    return r
  }

  def fromFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_P(o: FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_P(s: String): Either[FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PostState_Container_P, Json.ErrorMsg] = {
    def fFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_P(parser: Parser): FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PostState_Container_P = {
      val r = parser.parseFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_P()
      return r
    }
    val r = to(s, fFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_P _)
    return r
  }

  def fromFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PS(o: FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PS(s: String): Either[FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PS, Json.ErrorMsg] = {
    def fFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PS(parser: Parser): FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PS = {
      val r = parser.parseFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PS()
      return r
    }
    val r = to(s, fFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PS _)
    return r
  }

  def fromFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container(o: FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container, isCompact: B): String = {
    val st = Printer.printFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container(s: String): Either[FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container, Json.ErrorMsg] = {
    def fFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container(parser: Parser): FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container = {
      val r = parser.parseFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container()
      return r
    }
    val r = to(s, fFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container _)
    return r
  }

  def fromFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_P(o: FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_P(s: String): Either[FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_P, Json.ErrorMsg] = {
    def fFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_P(parser: Parser): FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_P = {
      val r = parser.parseFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_P()
      return r
    }
    val r = to(s, fFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_P _)
    return r
  }

  def fromFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PS(o: FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PS(s: String): Either[FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PS, Json.ErrorMsg] = {
    def fFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PS(parser: Parser): FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PS = {
      val r = parser.parseFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PS()
      return r
    }
    val r = to(s, fFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PS _)
    return r
  }

  def fromFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container(o: FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container, isCompact: B): String = {
    val st = Printer.printFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container(s: String): Either[FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container, Json.ErrorMsg] = {
    def fFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container(parser: Parser): FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container = {
      val r = parser.parseFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container()
      return r
    }
    val r = to(s, fFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container _)
    return r
  }

  def fromFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_P(o: FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_P(s: String): Either[FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_P, Json.ErrorMsg] = {
    def fFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_P(parser: Parser): FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_P = {
      val r = parser.parseFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_P()
      return r
    }
    val r = to(s, fFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_P _)
    return r
  }

  def fromFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PS(o: FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PS(s: String): Either[FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PS, Json.ErrorMsg] = {
    def fFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PS(parser: Parser): FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PS = {
      val r = parser.parseFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PS()
      return r
    }
    val r = to(s, fFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PS _)
    return r
  }

  def fromFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container(o: FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PreState_Container, isCompact: B): String = {
    val st = Printer.printFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container(s: String): Either[FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PreState_Container, Json.ErrorMsg] = {
    def fFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container(parser: Parser): FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PreState_Container = {
      val r = parser.parseFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container()
      return r
    }
    val r = to(s, fFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container _)
    return r
  }

  def fromFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_P(o: FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_P(s: String): Either[FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PreState_Container_P, Json.ErrorMsg] = {
    def fFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_P(parser: Parser): FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PreState_Container_P = {
      val r = parser.parseFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_P()
      return r
    }
    val r = to(s, fFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_P _)
    return r
  }

  def fromFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_PS(o: FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_PS(s: String): Either[FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PreState_Container_PS, Json.ErrorMsg] = {
    def fFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_PS(parser: Parser): FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PreState_Container_PS = {
      val r = parser.parseFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_PS()
      return r
    }
    val r = to(s, fFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_PS _)
    return r
  }

  def fromFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container(o: FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PostState_Container, isCompact: B): String = {
    val st = Printer.printFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container(s: String): Either[FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PostState_Container, Json.ErrorMsg] = {
    def fFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container(parser: Parser): FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PostState_Container = {
      val r = parser.parseFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container()
      return r
    }
    val r = to(s, fFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container _)
    return r
  }

  def fromFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_P(o: FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_P(s: String): Either[FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PostState_Container_P, Json.ErrorMsg] = {
    def fFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_P(parser: Parser): FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PostState_Container_P = {
      val r = parser.parseFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_P()
      return r
    }
    val r = to(s, fFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_P _)
    return r
  }

  def fromFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_PS(o: FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_PS(s: String): Either[FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PostState_Container_PS, Json.ErrorMsg] = {
    def fFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_PS(parser: Parser): FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PostState_Container_PS = {
      val r = parser.parseFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_PS()
      return r
    }
    val r = to(s, fFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_PS _)
    return r
  }

  def fromFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container(o: FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container, isCompact: B): String = {
    val st = Printer.printFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container(s: String): Either[FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container, Json.ErrorMsg] = {
    def fFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container(parser: Parser): FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container = {
      val r = parser.parseFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container()
      return r
    }
    val r = to(s, fFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container _)
    return r
  }

  def fromFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_P(o: FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_P(s: String): Either[FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_P, Json.ErrorMsg] = {
    def fFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_P(parser: Parser): FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_P = {
      val r = parser.parseFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_P()
      return r
    }
    val r = to(s, fFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_P _)
    return r
  }

  def fromFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PS(o: FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PS(s: String): Either[FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PS, Json.ErrorMsg] = {
    def fFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PS(parser: Parser): FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PS = {
      val r = parser.parseFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PS()
      return r
    }
    val r = to(s, fFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PS _)
    return r
  }

  def fromFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container(o: FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container, isCompact: B): String = {
    val st = Printer.printFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container(s: String): Either[FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container, Json.ErrorMsg] = {
    def fFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container(parser: Parser): FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container = {
      val r = parser.parseFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container()
      return r
    }
    val r = to(s, fFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container _)
    return r
  }

  def fromFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_P(o: FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_P(s: String): Either[FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_P, Json.ErrorMsg] = {
    def fFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_P(parser: Parser): FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_P = {
      val r = parser.parseFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_P()
      return r
    }
    val r = to(s, fFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_P _)
    return r
  }

  def fromFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PS(o: FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PS(s: String): Either[FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PS, Json.ErrorMsg] = {
    def fFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PS(parser: Parser): FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PS = {
      val r = parser.parseFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PS()
      return r
    }
    val r = to(s, fFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PS _)
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