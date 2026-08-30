// #Sireum
// @formatter:off

// This file is auto-generated from Request_Value.scala, Input_Validity.scala, Qualified_Request.scala, Attitude_Data_Validity.scala, Attitude_Acceptability.scala, Reference_State.scala, AP_Availability.scala, Request_Indication.scala, FD_Indication.scala, FCS_Failed_Indication.scala, AP_Status.scala, AP_Enable.scala, Base_Types.scala, FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_Containers.scala, Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_Containers.scala, Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_Containers.scala, AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_Containers.scala, Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_Containers.scala, Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_Containers.scala, FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package scp_candidate

import org.sireum._
import org.sireum.Json.Printer._

object JSON {

  object Printer {

    @pure def printFAA_FCS_CoordinationRequest_ValueType(o: FAA_FCS_Coordination.Request_Value.Type): ST = {
      val value: String = o match {
        case FAA_FCS_Coordination.Request_Value.Requested => "Requested"
        case FAA_FCS_Coordination.Request_Value.Not_Requested => "Not_Requested"
      }
      return printObject(ISZ(
        ("type", printString("FAA_FCS_Coordination.Request_Value")),
        ("value", printString(value))
      ))
    }

    @pure def printFAA_FCS_CoordinationRequest_Value_Payload(o: FAA_FCS_Coordination.Request_Value_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""FAA_FCS_Coordination.Request_Value_Payload""""),
        ("value", printFAA_FCS_CoordinationRequest_ValueType(o.value))
      ))
    }

    @pure def printFAA_FCS_CoordinationInput_ValidityType(o: FAA_FCS_Coordination.Input_Validity.Type): ST = {
      val value: String = o match {
        case FAA_FCS_Coordination.Input_Validity.Valid => "Valid"
        case FAA_FCS_Coordination.Input_Validity.Invalid => "Invalid"
      }
      return printObject(ISZ(
        ("type", printString("FAA_FCS_Coordination.Input_Validity")),
        ("value", printString(value))
      ))
    }

    @pure def printFAA_FCS_CoordinationInput_Validity_Payload(o: FAA_FCS_Coordination.Input_Validity_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""FAA_FCS_Coordination.Input_Validity_Payload""""),
        ("value", printFAA_FCS_CoordinationInput_ValidityType(o.value))
      ))
    }

    @pure def printFAA_FCS_CoordinationQualified_RequestType(o: FAA_FCS_Coordination.Qualified_Request.Type): ST = {
      val value: String = o match {
        case FAA_FCS_Coordination.Qualified_Request.Requested => "Requested"
        case FAA_FCS_Coordination.Qualified_Request.Not_Requested => "Not_Requested"
      }
      return printObject(ISZ(
        ("type", printString("FAA_FCS_Coordination.Qualified_Request")),
        ("value", printString(value))
      ))
    }

    @pure def printFAA_FCS_CoordinationQualified_Request_Payload(o: FAA_FCS_Coordination.Qualified_Request_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""FAA_FCS_Coordination.Qualified_Request_Payload""""),
        ("value", printFAA_FCS_CoordinationQualified_RequestType(o.value))
      ))
    }

    @pure def printFAA_FCS_CoordinationAttitude_Data_ValidityType(o: FAA_FCS_Coordination.Attitude_Data_Validity.Type): ST = {
      val value: String = o match {
        case FAA_FCS_Coordination.Attitude_Data_Validity.Valid => "Valid"
        case FAA_FCS_Coordination.Attitude_Data_Validity.Invalid => "Invalid"
      }
      return printObject(ISZ(
        ("type", printString("FAA_FCS_Coordination.Attitude_Data_Validity")),
        ("value", printString(value))
      ))
    }

    @pure def printFAA_FCS_CoordinationAttitude_Data_Validity_Payload(o: FAA_FCS_Coordination.Attitude_Data_Validity_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""FAA_FCS_Coordination.Attitude_Data_Validity_Payload""""),
        ("value", printFAA_FCS_CoordinationAttitude_Data_ValidityType(o.value))
      ))
    }

    @pure def printFAA_FCS_CoordinationAttitude_AcceptabilityType(o: FAA_FCS_Coordination.Attitude_Acceptability.Type): ST = {
      val value: String = o match {
        case FAA_FCS_Coordination.Attitude_Acceptability.Acceptable => "Acceptable"
        case FAA_FCS_Coordination.Attitude_Acceptability.Not_Acceptable => "Not_Acceptable"
      }
      return printObject(ISZ(
        ("type", printString("FAA_FCS_Coordination.Attitude_Acceptability")),
        ("value", printString(value))
      ))
    }

    @pure def printFAA_FCS_CoordinationAttitude_Acceptability_Payload(o: FAA_FCS_Coordination.Attitude_Acceptability_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""FAA_FCS_Coordination.Attitude_Acceptability_Payload""""),
        ("value", printFAA_FCS_CoordinationAttitude_AcceptabilityType(o.value))
      ))
    }

    @pure def printFAA_FCS_CoordinationReference_StateType(o: FAA_FCS_Coordination.Reference_State.Type): ST = {
      val value: String = o match {
        case FAA_FCS_Coordination.Reference_State.Synchronized => "Synchronized"
        case FAA_FCS_Coordination.Reference_State.Not_Synchronized => "Not_Synchronized"
      }
      return printObject(ISZ(
        ("type", printString("FAA_FCS_Coordination.Reference_State")),
        ("value", printString(value))
      ))
    }

    @pure def printFAA_FCS_CoordinationReference_State_Payload(o: FAA_FCS_Coordination.Reference_State_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""FAA_FCS_Coordination.Reference_State_Payload""""),
        ("value", printFAA_FCS_CoordinationReference_StateType(o.value))
      ))
    }

    @pure def printFAA_FCS_CoordinationAP_AvailabilityType(o: FAA_FCS_Coordination.AP_Availability.Type): ST = {
      val value: String = o match {
        case FAA_FCS_Coordination.AP_Availability.Available => "Available"
        case FAA_FCS_Coordination.AP_Availability.Failed => "Failed"
      }
      return printObject(ISZ(
        ("type", printString("FAA_FCS_Coordination.AP_Availability")),
        ("value", printString(value))
      ))
    }

    @pure def printFAA_FCS_CoordinationAP_Availability_Payload(o: FAA_FCS_Coordination.AP_Availability_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""FAA_FCS_Coordination.AP_Availability_Payload""""),
        ("value", printFAA_FCS_CoordinationAP_AvailabilityType(o.value))
      ))
    }

    @pure def printFAA_FCS_CoordinationRequest_IndicationType(o: FAA_FCS_Coordination.Request_Indication.Type): ST = {
      val value: String = o match {
        case FAA_FCS_Coordination.Request_Indication.Asserted => "Asserted"
        case FAA_FCS_Coordination.Request_Indication.Not_Asserted => "Not_Asserted"
      }
      return printObject(ISZ(
        ("type", printString("FAA_FCS_Coordination.Request_Indication")),
        ("value", printString(value))
      ))
    }

    @pure def printFAA_FCS_CoordinationRequest_Indication_Payload(o: FAA_FCS_Coordination.Request_Indication_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""FAA_FCS_Coordination.Request_Indication_Payload""""),
        ("value", printFAA_FCS_CoordinationRequest_IndicationType(o.value))
      ))
    }

    @pure def printFAA_FCS_CoordinationFD_IndicationType(o: FAA_FCS_Coordination.FD_Indication.Type): ST = {
      val value: String = o match {
        case FAA_FCS_Coordination.FD_Indication.On => "On"
        case FAA_FCS_Coordination.FD_Indication.Off => "Off"
      }
      return printObject(ISZ(
        ("type", printString("FAA_FCS_Coordination.FD_Indication")),
        ("value", printString(value))
      ))
    }

    @pure def printFAA_FCS_CoordinationFD_Indication_Payload(o: FAA_FCS_Coordination.FD_Indication_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""FAA_FCS_Coordination.FD_Indication_Payload""""),
        ("value", printFAA_FCS_CoordinationFD_IndicationType(o.value))
      ))
    }

    @pure def printFAA_FCS_CoordinationFCS_Failed_IndicationType(o: FAA_FCS_Coordination.FCS_Failed_Indication.Type): ST = {
      val value: String = o match {
        case FAA_FCS_Coordination.FCS_Failed_Indication.Asserted => "Asserted"
        case FAA_FCS_Coordination.FCS_Failed_Indication.Clear => "Clear"
      }
      return printObject(ISZ(
        ("type", printString("FAA_FCS_Coordination.FCS_Failed_Indication")),
        ("value", printString(value))
      ))
    }

    @pure def printFAA_FCS_CoordinationFCS_Failed_Indication_Payload(o: FAA_FCS_Coordination.FCS_Failed_Indication_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""FAA_FCS_Coordination.FCS_Failed_Indication_Payload""""),
        ("value", printFAA_FCS_CoordinationFCS_Failed_IndicationType(o.value))
      ))
    }

    @pure def printFAA_FCS_CoordinationAP_StatusType(o: FAA_FCS_Coordination.AP_Status.Type): ST = {
      val value: String = o match {
        case FAA_FCS_Coordination.AP_Status.On => "On"
        case FAA_FCS_Coordination.AP_Status.Off => "Off"
        case FAA_FCS_Coordination.AP_Status.Failed => "Failed"
      }
      return printObject(ISZ(
        ("type", printString("FAA_FCS_Coordination.AP_Status")),
        ("value", printString(value))
      ))
    }

    @pure def printFAA_FCS_CoordinationAP_Status_Payload(o: FAA_FCS_Coordination.AP_Status_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""FAA_FCS_Coordination.AP_Status_Payload""""),
        ("value", printFAA_FCS_CoordinationAP_StatusType(o.value))
      ))
    }

    @pure def printFAA_FCS_CoordinationAP_EnableType(o: FAA_FCS_Coordination.AP_Enable.Type): ST = {
      val value: String = o match {
        case FAA_FCS_Coordination.AP_Enable.Enabled => "Enabled"
        case FAA_FCS_Coordination.AP_Enable.Disabled => "Disabled"
      }
      return printObject(ISZ(
        ("type", printString("FAA_FCS_Coordination.AP_Enable")),
        ("value", printString(value))
      ))
    }

    @pure def printFAA_FCS_CoordinationAP_Enable_Payload(o: FAA_FCS_Coordination.AP_Enable_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""FAA_FCS_Coordination.AP_Enable_Payload""""),
        ("value", printFAA_FCS_CoordinationAP_EnableType(o.value))
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

    @pure def printFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container(o: FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container): ST = {
      o match {
        case o: FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_P => return printFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_P(o)
        case o: FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PS => return printFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PS(o)
      }
    }

    @pure def printFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_P(o: FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_P""""),
        ("api_display_fd_request_in", printFAA_FCS_CoordinationRequest_ValueType(o.api_display_fd_request_in)),
        ("api_display_fd_validity_in", printFAA_FCS_CoordinationInput_ValidityType(o.api_display_fd_validity_in)),
        ("api_engage_ap_request_in", printFAA_FCS_CoordinationRequest_ValueType(o.api_engage_ap_request_in)),
        ("api_engage_ap_validity_in", printFAA_FCS_CoordinationInput_ValidityType(o.api_engage_ap_validity_in)),
        ("api_sync_fd_request_in", printFAA_FCS_CoordinationRequest_ValueType(o.api_sync_fd_request_in)),
        ("api_sync_fd_validity_in", printFAA_FCS_CoordinationInput_ValidityType(o.api_sync_fd_validity_in))
      ))
    }

    @pure def printFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PS(o: FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PS""""),
        ("api_display_fd_request_in", printFAA_FCS_CoordinationRequest_ValueType(o.api_display_fd_request_in)),
        ("api_display_fd_validity_in", printFAA_FCS_CoordinationInput_ValidityType(o.api_display_fd_validity_in)),
        ("api_engage_ap_request_in", printFAA_FCS_CoordinationRequest_ValueType(o.api_engage_ap_request_in)),
        ("api_engage_ap_validity_in", printFAA_FCS_CoordinationInput_ValidityType(o.api_engage_ap_validity_in)),
        ("api_sync_fd_request_in", printFAA_FCS_CoordinationRequest_ValueType(o.api_sync_fd_request_in)),
        ("api_sync_fd_validity_in", printFAA_FCS_CoordinationInput_ValidityType(o.api_sync_fd_validity_in))
      ))
    }

    @pure def printFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container(o: FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container): ST = {
      o match {
        case o: FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_P => return printFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_P(o)
        case o: FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PS => return printFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PS(o)
      }
    }

    @pure def printFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_P(o: FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_P""""),
        ("api_qualified_display_request", printFAA_FCS_CoordinationQualified_RequestType(o.api_qualified_display_request)),
        ("api_qualified_engage_request", printFAA_FCS_CoordinationQualified_RequestType(o.api_qualified_engage_request)),
        ("api_qualified_sync_request", printFAA_FCS_CoordinationQualified_RequestType(o.api_qualified_sync_request))
      ))
    }

    @pure def printFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PS(o: FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PS""""),
        ("api_qualified_display_request", printFAA_FCS_CoordinationQualified_RequestType(o.api_qualified_display_request)),
        ("api_qualified_engage_request", printFAA_FCS_CoordinationQualified_RequestType(o.api_qualified_engage_request)),
        ("api_qualified_sync_request", printFAA_FCS_CoordinationQualified_RequestType(o.api_qualified_sync_request))
      ))
    }

    @pure def printFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container(o: FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container): ST = {
      o match {
        case o: FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_P => return printFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_P(o)
        case o: FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PS => return printFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PS(o)
      }
    }

    @pure def printFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_P(o: FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_P""""),
        ("api_attitude_acceptable_in", printFAA_FCS_CoordinationAttitude_AcceptabilityType(o.api_attitude_acceptable_in)),
        ("api_attitude_data_in", printFAA_FCS_CoordinationAttitude_Data_ValidityType(o.api_attitude_data_in))
      ))
    }

    @pure def printFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PS(o: FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PS""""),
        ("api_attitude_acceptable_in", printFAA_FCS_CoordinationAttitude_AcceptabilityType(o.api_attitude_acceptable_in)),
        ("api_attitude_data_in", printFAA_FCS_CoordinationAttitude_Data_ValidityType(o.api_attitude_data_in))
      ))
    }

    @pure def printFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container(o: FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container): ST = {
      o match {
        case o: FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_P => return printFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_P(o)
        case o: FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PS => return printFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PS(o)
      }
    }

    @pure def printFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_P(o: FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_P""""),
        ("api_attitude_acceptable_out", printFAA_FCS_CoordinationAttitude_AcceptabilityType(o.api_attitude_acceptable_out)),
        ("api_attitude_data_out", printFAA_FCS_CoordinationAttitude_Data_ValidityType(o.api_attitude_data_out))
      ))
    }

    @pure def printFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PS(o: FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PS""""),
        ("api_attitude_acceptable_out", printFAA_FCS_CoordinationAttitude_AcceptabilityType(o.api_attitude_acceptable_out)),
        ("api_attitude_data_out", printFAA_FCS_CoordinationAttitude_Data_ValidityType(o.api_attitude_data_out))
      ))
    }

    @pure def printFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container(o: FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container): ST = {
      o match {
        case o: FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_P => return printFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_P(o)
        case o: FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PS => return printFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PS(o)
      }
    }

    @pure def printFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_P(o: FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_P""""),
        ("api_reference_state_in", printFAA_FCS_CoordinationReference_StateType(o.api_reference_state_in))
      ))
    }

    @pure def printFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PS(o: FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PS""""),
        ("api_reference_state_in", printFAA_FCS_CoordinationReference_StateType(o.api_reference_state_in))
      ))
    }

    @pure def printFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container(o: FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container): ST = {
      o match {
        case o: FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_P => return printFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_P(o)
        case o: FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PS => return printFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PS(o)
      }
    }

    @pure def printFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_P(o: FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_P""""),
        ("api_reference_state_out", printFAA_FCS_CoordinationReference_StateType(o.api_reference_state_out))
      ))
    }

    @pure def printFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PS(o: FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PS""""),
        ("api_reference_state_out", printFAA_FCS_CoordinationReference_StateType(o.api_reference_state_out))
      ))
    }

    @pure def printFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container(o: FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container): ST = {
      o match {
        case o: FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_P => return printFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_P(o)
        case o: FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PS => return printFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PS(o)
      }
    }

    @pure def printFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_P(o: FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_P""""),
        ("api_ap_availability_in", printFAA_FCS_CoordinationAP_AvailabilityType(o.api_ap_availability_in))
      ))
    }

    @pure def printFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PS(o: FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PS""""),
        ("api_ap_availability_in", printFAA_FCS_CoordinationAP_AvailabilityType(o.api_ap_availability_in))
      ))
    }

    @pure def printFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container(o: FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container): ST = {
      o match {
        case o: FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_P => return printFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_P(o)
        case o: FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PS => return printFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PS(o)
      }
    }

    @pure def printFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_P(o: FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_P""""),
        ("api_ap_availability_out", printFAA_FCS_CoordinationAP_AvailabilityType(o.api_ap_availability_out))
      ))
    }

    @pure def printFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PS(o: FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PS""""),
        ("api_ap_availability_out", printFAA_FCS_CoordinationAP_AvailabilityType(o.api_ap_availability_out))
      ))
    }

    @pure def printFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container(o: FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container): ST = {
      o match {
        case o: FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_P => return printFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_P(o)
        case o: FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PS => return printFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PS(o)
      }
    }

    @pure def printFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_P(o: FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_P""""),
        ("api_attitude_acceptable", printFAA_FCS_CoordinationAttitude_AcceptabilityType(o.api_attitude_acceptable)),
        ("api_attitude_data", printFAA_FCS_CoordinationAttitude_Data_ValidityType(o.api_attitude_data)),
        ("api_qualified_display_request", printFAA_FCS_CoordinationQualified_RequestType(o.api_qualified_display_request)),
        ("api_qualified_sync_request", printFAA_FCS_CoordinationQualified_RequestType(o.api_qualified_sync_request)),
        ("api_reference_state", printFAA_FCS_CoordinationReference_StateType(o.api_reference_state)),
        ("api_reference_sync_trigger", printFAA_FCS_CoordinationRequest_IndicationType(o.api_reference_sync_trigger))
      ))
    }

    @pure def printFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PS(o: FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PS""""),
        ("api_attitude_acceptable", printFAA_FCS_CoordinationAttitude_AcceptabilityType(o.api_attitude_acceptable)),
        ("api_attitude_data", printFAA_FCS_CoordinationAttitude_Data_ValidityType(o.api_attitude_data)),
        ("api_qualified_display_request", printFAA_FCS_CoordinationQualified_RequestType(o.api_qualified_display_request)),
        ("api_qualified_sync_request", printFAA_FCS_CoordinationQualified_RequestType(o.api_qualified_sync_request)),
        ("api_reference_state", printFAA_FCS_CoordinationReference_StateType(o.api_reference_state)),
        ("api_reference_sync_trigger", printFAA_FCS_CoordinationRequest_IndicationType(o.api_reference_sync_trigger))
      ))
    }

    @pure def printFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container(o: FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container): ST = {
      o match {
        case o: FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_P => return printFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_P(o)
        case o: FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PS => return printFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PS(o)
      }
    }

    @pure def printFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_P(o: FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_P""""),
        ("api_fcs_failed", printFAA_FCS_CoordinationFCS_Failed_IndicationType(o.api_fcs_failed)),
        ("api_fd_on", printFAA_FCS_CoordinationFD_IndicationType(o.api_fd_on)),
        ("api_reference_sync_request", printFAA_FCS_CoordinationRequest_IndicationType(o.api_reference_sync_request))
      ))
    }

    @pure def printFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PS(o: FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PS""""),
        ("api_fcs_failed", printFAA_FCS_CoordinationFCS_Failed_IndicationType(o.api_fcs_failed)),
        ("api_fd_on", printFAA_FCS_CoordinationFD_IndicationType(o.api_fd_on)),
        ("api_reference_sync_request", printFAA_FCS_CoordinationRequest_IndicationType(o.api_reference_sync_request))
      ))
    }

    @pure def printFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container(o: FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container): ST = {
      o match {
        case o: FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_P => return printFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_P(o)
        case o: FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PS => return printFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PS(o)
      }
    }

    @pure def printFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_P(o: FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_P""""),
        ("api_ap_availability", printFAA_FCS_CoordinationAP_AvailabilityType(o.api_ap_availability)),
        ("api_attitude_acceptable", printFAA_FCS_CoordinationAttitude_AcceptabilityType(o.api_attitude_acceptable)),
        ("api_attitude_data", printFAA_FCS_CoordinationAttitude_Data_ValidityType(o.api_attitude_data)),
        ("api_fd_on", printFAA_FCS_CoordinationFD_IndicationType(o.api_fd_on)),
        ("api_qualified_engage_request", printFAA_FCS_CoordinationQualified_RequestType(o.api_qualified_engage_request)),
        ("api_reference_state", printFAA_FCS_CoordinationReference_StateType(o.api_reference_state))
      ))
    }

    @pure def printFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PS(o: FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PS""""),
        ("api_ap_availability", printFAA_FCS_CoordinationAP_AvailabilityType(o.api_ap_availability)),
        ("api_attitude_acceptable", printFAA_FCS_CoordinationAttitude_AcceptabilityType(o.api_attitude_acceptable)),
        ("api_attitude_data", printFAA_FCS_CoordinationAttitude_Data_ValidityType(o.api_attitude_data)),
        ("api_fd_on", printFAA_FCS_CoordinationFD_IndicationType(o.api_fd_on)),
        ("api_qualified_engage_request", printFAA_FCS_CoordinationQualified_RequestType(o.api_qualified_engage_request)),
        ("api_reference_state", printFAA_FCS_CoordinationReference_StateType(o.api_reference_state))
      ))
    }

    @pure def printFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container(o: FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container): ST = {
      o match {
        case o: FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_P => return printFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_P(o)
        case o: FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PS => return printFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PS(o)
      }
    }

    @pure def printFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_P(o: FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_P""""),
        ("api_ap_guidance_request", printFAA_FCS_CoordinationRequest_IndicationType(o.api_ap_guidance_request)),
        ("api_ap_on", printFAA_FCS_CoordinationAP_EnableType(o.api_ap_on)),
        ("api_ap_status", printFAA_FCS_CoordinationAP_StatusType(o.api_ap_status)),
        ("api_reference_sync_trigger", printFAA_FCS_CoordinationRequest_IndicationType(o.api_reference_sync_trigger))
      ))
    }

    @pure def printFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PS(o: FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PS""""),
        ("api_ap_guidance_request", printFAA_FCS_CoordinationRequest_IndicationType(o.api_ap_guidance_request)),
        ("api_ap_on", printFAA_FCS_CoordinationAP_EnableType(o.api_ap_on)),
        ("api_ap_status", printFAA_FCS_CoordinationAP_StatusType(o.api_ap_status)),
        ("api_reference_sync_trigger", printFAA_FCS_CoordinationRequest_IndicationType(o.api_reference_sync_trigger))
      ))
    }

    @pure def printFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container(o: FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container): ST = {
      o match {
        case o: FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_P => return printFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_P(o)
        case o: FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PS => return printFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PS(o)
      }
    }

    @pure def printFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_P(o: FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_P""""),
        ("api_ap_guidance_request_in", printFAA_FCS_CoordinationRequest_IndicationType(o.api_ap_guidance_request_in)),
        ("api_ap_on_in", printFAA_FCS_CoordinationAP_EnableType(o.api_ap_on_in)),
        ("api_ap_status_in", printFAA_FCS_CoordinationAP_StatusType(o.api_ap_status_in)),
        ("api_fcs_failed_in", printFAA_FCS_CoordinationFCS_Failed_IndicationType(o.api_fcs_failed_in)),
        ("api_fd_on_in", printFAA_FCS_CoordinationFD_IndicationType(o.api_fd_on_in)),
        ("api_reference_sync_request_in", printFAA_FCS_CoordinationRequest_IndicationType(o.api_reference_sync_request_in))
      ))
    }

    @pure def printFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PS(o: FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PS""""),
        ("api_ap_guidance_request_in", printFAA_FCS_CoordinationRequest_IndicationType(o.api_ap_guidance_request_in)),
        ("api_ap_on_in", printFAA_FCS_CoordinationAP_EnableType(o.api_ap_on_in)),
        ("api_ap_status_in", printFAA_FCS_CoordinationAP_StatusType(o.api_ap_status_in)),
        ("api_fcs_failed_in", printFAA_FCS_CoordinationFCS_Failed_IndicationType(o.api_fcs_failed_in)),
        ("api_fd_on_in", printFAA_FCS_CoordinationFD_IndicationType(o.api_fd_on_in)),
        ("api_reference_sync_request_in", printFAA_FCS_CoordinationRequest_IndicationType(o.api_reference_sync_request_in))
      ))
    }

    @pure def printFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container(o: FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container): ST = {
      o match {
        case o: FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_P => return printFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_P(o)
        case o: FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PS => return printFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PS(o)
      }
    }

    @pure def printFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_P(o: FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_P""""),
        ("api_ap_guidance_request_out", printFAA_FCS_CoordinationRequest_IndicationType(o.api_ap_guidance_request_out)),
        ("api_ap_on_out", printFAA_FCS_CoordinationAP_EnableType(o.api_ap_on_out)),
        ("api_ap_status_out", printFAA_FCS_CoordinationAP_StatusType(o.api_ap_status_out)),
        ("api_fcs_failed_out", printFAA_FCS_CoordinationFCS_Failed_IndicationType(o.api_fcs_failed_out)),
        ("api_fd_on_out", printFAA_FCS_CoordinationFD_IndicationType(o.api_fd_on_out)),
        ("api_reference_sync_request_out", printFAA_FCS_CoordinationRequest_IndicationType(o.api_reference_sync_request_out))
      ))
    }

    @pure def printFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PS(o: FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PS""""),
        ("api_ap_guidance_request_out", printFAA_FCS_CoordinationRequest_IndicationType(o.api_ap_guidance_request_out)),
        ("api_ap_on_out", printFAA_FCS_CoordinationAP_EnableType(o.api_ap_on_out)),
        ("api_ap_status_out", printFAA_FCS_CoordinationAP_StatusType(o.api_ap_status_out)),
        ("api_fcs_failed_out", printFAA_FCS_CoordinationFCS_Failed_IndicationType(o.api_fcs_failed_out)),
        ("api_fd_on_out", printFAA_FCS_CoordinationFD_IndicationType(o.api_fd_on_out)),
        ("api_reference_sync_request_out", printFAA_FCS_CoordinationRequest_IndicationType(o.api_reference_sync_request_out))
      ))
    }

    @pure def printruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): ST = {
      val value: String = o match {
        case runtimemonitor.ObservationKind.FAA_FCS_Coordination_Root_Instance_fcs_coordination_process_fci_command_intake_postInit => "FAA_FCS_Coordination_Root_Instance_fcs_coordination_process_fci_command_intake_postInit"
        case runtimemonitor.ObservationKind.FAA_FCS_Coordination_Root_Instance_fcs_coordination_process_fci_command_intake_preCompute => "FAA_FCS_Coordination_Root_Instance_fcs_coordination_process_fci_command_intake_preCompute"
        case runtimemonitor.ObservationKind.FAA_FCS_Coordination_Root_Instance_fcs_coordination_process_fci_command_intake_postCompute => "FAA_FCS_Coordination_Root_Instance_fcs_coordination_process_fci_command_intake_postCompute"
        case runtimemonitor.ObservationKind.FAA_FCS_Coordination_Root_Instance_fcs_coordination_process_attitude_condition_intake_postInit => "FAA_FCS_Coordination_Root_Instance_fcs_coordination_process_attitude_condition_intake_postInit"
        case runtimemonitor.ObservationKind.FAA_FCS_Coordination_Root_Instance_fcs_coordination_process_attitude_condition_intake_preCompute => "FAA_FCS_Coordination_Root_Instance_fcs_coordination_process_attitude_condition_intake_preCompute"
        case runtimemonitor.ObservationKind.FAA_FCS_Coordination_Root_Instance_fcs_coordination_process_attitude_condition_intake_postCompute => "FAA_FCS_Coordination_Root_Instance_fcs_coordination_process_attitude_condition_intake_postCompute"
        case runtimemonitor.ObservationKind.FAA_FCS_Coordination_Root_Instance_fcs_coordination_process_reference_state_intake_postInit => "FAA_FCS_Coordination_Root_Instance_fcs_coordination_process_reference_state_intake_postInit"
        case runtimemonitor.ObservationKind.FAA_FCS_Coordination_Root_Instance_fcs_coordination_process_reference_state_intake_preCompute => "FAA_FCS_Coordination_Root_Instance_fcs_coordination_process_reference_state_intake_preCompute"
        case runtimemonitor.ObservationKind.FAA_FCS_Coordination_Root_Instance_fcs_coordination_process_reference_state_intake_postCompute => "FAA_FCS_Coordination_Root_Instance_fcs_coordination_process_reference_state_intake_postCompute"
        case runtimemonitor.ObservationKind.FAA_FCS_Coordination_Root_Instance_fcs_coordination_process_ap_availability_intake_postInit => "FAA_FCS_Coordination_Root_Instance_fcs_coordination_process_ap_availability_intake_postInit"
        case runtimemonitor.ObservationKind.FAA_FCS_Coordination_Root_Instance_fcs_coordination_process_ap_availability_intake_preCompute => "FAA_FCS_Coordination_Root_Instance_fcs_coordination_process_ap_availability_intake_preCompute"
        case runtimemonitor.ObservationKind.FAA_FCS_Coordination_Root_Instance_fcs_coordination_process_ap_availability_intake_postCompute => "FAA_FCS_Coordination_Root_Instance_fcs_coordination_process_ap_availability_intake_postCompute"
        case runtimemonitor.ObservationKind.FAA_FCS_Coordination_Root_Instance_fcs_coordination_process_flight_guidance_coordination_postInit => "FAA_FCS_Coordination_Root_Instance_fcs_coordination_process_flight_guidance_coordination_postInit"
        case runtimemonitor.ObservationKind.FAA_FCS_Coordination_Root_Instance_fcs_coordination_process_flight_guidance_coordination_preCompute => "FAA_FCS_Coordination_Root_Instance_fcs_coordination_process_flight_guidance_coordination_preCompute"
        case runtimemonitor.ObservationKind.FAA_FCS_Coordination_Root_Instance_fcs_coordination_process_flight_guidance_coordination_postCompute => "FAA_FCS_Coordination_Root_Instance_fcs_coordination_process_flight_guidance_coordination_postCompute"
        case runtimemonitor.ObservationKind.FAA_FCS_Coordination_Root_Instance_fcs_coordination_process_autopilot_coordination_postInit => "FAA_FCS_Coordination_Root_Instance_fcs_coordination_process_autopilot_coordination_postInit"
        case runtimemonitor.ObservationKind.FAA_FCS_Coordination_Root_Instance_fcs_coordination_process_autopilot_coordination_preCompute => "FAA_FCS_Coordination_Root_Instance_fcs_coordination_process_autopilot_coordination_preCompute"
        case runtimemonitor.ObservationKind.FAA_FCS_Coordination_Root_Instance_fcs_coordination_process_autopilot_coordination_postCompute => "FAA_FCS_Coordination_Root_Instance_fcs_coordination_process_autopilot_coordination_postCompute"
        case runtimemonitor.ObservationKind.FAA_FCS_Coordination_Root_Instance_fcs_coordination_process_fcs_snapshot_publication_postInit => "FAA_FCS_Coordination_Root_Instance_fcs_coordination_process_fcs_snapshot_publication_postInit"
        case runtimemonitor.ObservationKind.FAA_FCS_Coordination_Root_Instance_fcs_coordination_process_fcs_snapshot_publication_preCompute => "FAA_FCS_Coordination_Root_Instance_fcs_coordination_process_fcs_snapshot_publication_preCompute"
        case runtimemonitor.ObservationKind.FAA_FCS_Coordination_Root_Instance_fcs_coordination_process_fcs_snapshot_publication_postCompute => "FAA_FCS_Coordination_Root_Instance_fcs_coordination_process_fcs_snapshot_publication_postCompute"
      }
      return printObject(ISZ(
        ("type", printString("runtimemonitor.ObservationKind")),
        ("value", printString(value))
      ))
    }

    @pure def printutilContainer(o: util.Container): ST = {
      o match {
        case o: util.EmptyContainer => return printutilEmptyContainer(o)
        case o: FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_P => return printFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_P(o)
        case o: FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PS => return printFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PS(o)
        case o: FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_P => return printFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_P(o)
        case o: FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PS => return printFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PS(o)
        case o: FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_P => return printFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_P(o)
        case o: FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_P => return printFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_P(o)
        case o: FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PS => return printFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PS(o)
        case o: FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PS => return printFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PS(o)
        case o: FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_P => return printFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_P(o)
        case o: FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_P => return printFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_P(o)
        case o: FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_P => return printFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_P(o)
        case o: FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PS => return printFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PS(o)
        case o: FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PS => return printFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PS(o)
        case o: FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PS => return printFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PS(o)
        case o: FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_P => return printFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_P(o)
        case o: FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PS => return printFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PS(o)
        case o: FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_P => return printFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_P(o)
        case o: FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PS => return printFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PS(o)
        case o: FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_P => return printFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_P(o)
        case o: FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PS => return printFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PS(o)
        case o: FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_P => return printFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_P(o)
        case o: FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PS => return printFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PS(o)
        case o: FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_P => return printFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_P(o)
        case o: FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PS => return printFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PS(o)
        case o: FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_P => return printFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_P(o)
        case o: FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PS => return printFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PS(o)
        case o: FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_P => return printFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_P(o)
        case o: FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PS => return printFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PS(o)
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
        case o: FAA_FCS_Coordination.AP_Status_Payload => return printFAA_FCS_CoordinationAP_Status_Payload(o)
        case o: FAA_FCS_Coordination.AP_Enable_Payload => return printFAA_FCS_CoordinationAP_Enable_Payload(o)
        case o: FAA_FCS_Coordination.FD_Indication_Payload => return printFAA_FCS_CoordinationFD_Indication_Payload(o)
        case o: FAA_FCS_Coordination.Request_Value_Payload => return printFAA_FCS_CoordinationRequest_Value_Payload(o)
        case o: FAA_FCS_Coordination.Input_Validity_Payload => return printFAA_FCS_CoordinationInput_Validity_Payload(o)
        case o: FAA_FCS_Coordination.AP_Availability_Payload => return printFAA_FCS_CoordinationAP_Availability_Payload(o)
        case o: FAA_FCS_Coordination.Reference_State_Payload => return printFAA_FCS_CoordinationReference_State_Payload(o)
        case o: FAA_FCS_Coordination.Qualified_Request_Payload => return printFAA_FCS_CoordinationQualified_Request_Payload(o)
        case o: FAA_FCS_Coordination.Request_Indication_Payload => return printFAA_FCS_CoordinationRequest_Indication_Payload(o)
        case o: FAA_FCS_Coordination.FCS_Failed_Indication_Payload => return printFAA_FCS_CoordinationFCS_Failed_Indication_Payload(o)
        case o: FAA_FCS_Coordination.Attitude_Data_Validity_Payload => return printFAA_FCS_CoordinationAttitude_Data_Validity_Payload(o)
        case o: FAA_FCS_Coordination.Attitude_Acceptability_Payload => return printFAA_FCS_CoordinationAttitude_Acceptability_Payload(o)
        case o: FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_P => return printFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_P(o)
        case o: FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PS => return printFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PS(o)
        case o: FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_P => return printFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_P(o)
        case o: FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PS => return printFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PS(o)
        case o: FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_P => return printFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_P(o)
        case o: FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_P => return printFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_P(o)
        case o: FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PS => return printFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PS(o)
        case o: FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PS => return printFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PS(o)
        case o: FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_P => return printFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_P(o)
        case o: FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_P => return printFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_P(o)
        case o: FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_P => return printFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_P(o)
        case o: FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PS => return printFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PS(o)
        case o: FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PS => return printFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PS(o)
        case o: FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PS => return printFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PS(o)
        case o: FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_P => return printFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_P(o)
        case o: FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PS => return printFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PS(o)
        case o: FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_P => return printFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_P(o)
        case o: FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PS => return printFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PS(o)
        case o: FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_P => return printFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_P(o)
        case o: FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PS => return printFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PS(o)
        case o: FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_P => return printFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_P(o)
        case o: FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PS => return printFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PS(o)
        case o: FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_P => return printFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_P(o)
        case o: FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PS => return printFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PS(o)
        case o: FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_P => return printFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_P(o)
        case o: FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PS => return printFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PS(o)
        case o: FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_P => return printFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_P(o)
        case o: FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PS => return printFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PS(o)
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

    def parseFAA_FCS_CoordinationRequest_ValueType(): FAA_FCS_Coordination.Request_Value.Type = {
      val r = parseFAA_FCS_CoordinationRequest_ValueT(F)
      return r
    }

    def parseFAA_FCS_CoordinationRequest_ValueT(typeParsed: B): FAA_FCS_Coordination.Request_Value.Type = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_FCS_Coordination.Request_Value")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      FAA_FCS_Coordination.Request_Value.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for FAA_FCS_Coordination.Request_Value.")
          return FAA_FCS_Coordination.Request_Value.byOrdinal(0).get
      }
    }

    def parseFAA_FCS_CoordinationRequest_Value_Payload(): FAA_FCS_Coordination.Request_Value_Payload = {
      val r = parseFAA_FCS_CoordinationRequest_Value_PayloadT(F)
      return r
    }

    def parseFAA_FCS_CoordinationRequest_Value_PayloadT(typeParsed: B): FAA_FCS_Coordination.Request_Value_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_FCS_Coordination.Request_Value_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFAA_FCS_CoordinationRequest_ValueType()
      parser.parseObjectNext()
      return FAA_FCS_Coordination.Request_Value_Payload(value)
    }

    def parseFAA_FCS_CoordinationInput_ValidityType(): FAA_FCS_Coordination.Input_Validity.Type = {
      val r = parseFAA_FCS_CoordinationInput_ValidityT(F)
      return r
    }

    def parseFAA_FCS_CoordinationInput_ValidityT(typeParsed: B): FAA_FCS_Coordination.Input_Validity.Type = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_FCS_Coordination.Input_Validity")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      FAA_FCS_Coordination.Input_Validity.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for FAA_FCS_Coordination.Input_Validity.")
          return FAA_FCS_Coordination.Input_Validity.byOrdinal(0).get
      }
    }

    def parseFAA_FCS_CoordinationInput_Validity_Payload(): FAA_FCS_Coordination.Input_Validity_Payload = {
      val r = parseFAA_FCS_CoordinationInput_Validity_PayloadT(F)
      return r
    }

    def parseFAA_FCS_CoordinationInput_Validity_PayloadT(typeParsed: B): FAA_FCS_Coordination.Input_Validity_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_FCS_Coordination.Input_Validity_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFAA_FCS_CoordinationInput_ValidityType()
      parser.parseObjectNext()
      return FAA_FCS_Coordination.Input_Validity_Payload(value)
    }

    def parseFAA_FCS_CoordinationQualified_RequestType(): FAA_FCS_Coordination.Qualified_Request.Type = {
      val r = parseFAA_FCS_CoordinationQualified_RequestT(F)
      return r
    }

    def parseFAA_FCS_CoordinationQualified_RequestT(typeParsed: B): FAA_FCS_Coordination.Qualified_Request.Type = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_FCS_Coordination.Qualified_Request")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      FAA_FCS_Coordination.Qualified_Request.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for FAA_FCS_Coordination.Qualified_Request.")
          return FAA_FCS_Coordination.Qualified_Request.byOrdinal(0).get
      }
    }

    def parseFAA_FCS_CoordinationQualified_Request_Payload(): FAA_FCS_Coordination.Qualified_Request_Payload = {
      val r = parseFAA_FCS_CoordinationQualified_Request_PayloadT(F)
      return r
    }

    def parseFAA_FCS_CoordinationQualified_Request_PayloadT(typeParsed: B): FAA_FCS_Coordination.Qualified_Request_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_FCS_Coordination.Qualified_Request_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFAA_FCS_CoordinationQualified_RequestType()
      parser.parseObjectNext()
      return FAA_FCS_Coordination.Qualified_Request_Payload(value)
    }

    def parseFAA_FCS_CoordinationAttitude_Data_ValidityType(): FAA_FCS_Coordination.Attitude_Data_Validity.Type = {
      val r = parseFAA_FCS_CoordinationAttitude_Data_ValidityT(F)
      return r
    }

    def parseFAA_FCS_CoordinationAttitude_Data_ValidityT(typeParsed: B): FAA_FCS_Coordination.Attitude_Data_Validity.Type = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_FCS_Coordination.Attitude_Data_Validity")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      FAA_FCS_Coordination.Attitude_Data_Validity.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for FAA_FCS_Coordination.Attitude_Data_Validity.")
          return FAA_FCS_Coordination.Attitude_Data_Validity.byOrdinal(0).get
      }
    }

    def parseFAA_FCS_CoordinationAttitude_Data_Validity_Payload(): FAA_FCS_Coordination.Attitude_Data_Validity_Payload = {
      val r = parseFAA_FCS_CoordinationAttitude_Data_Validity_PayloadT(F)
      return r
    }

    def parseFAA_FCS_CoordinationAttitude_Data_Validity_PayloadT(typeParsed: B): FAA_FCS_Coordination.Attitude_Data_Validity_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_FCS_Coordination.Attitude_Data_Validity_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFAA_FCS_CoordinationAttitude_Data_ValidityType()
      parser.parseObjectNext()
      return FAA_FCS_Coordination.Attitude_Data_Validity_Payload(value)
    }

    def parseFAA_FCS_CoordinationAttitude_AcceptabilityType(): FAA_FCS_Coordination.Attitude_Acceptability.Type = {
      val r = parseFAA_FCS_CoordinationAttitude_AcceptabilityT(F)
      return r
    }

    def parseFAA_FCS_CoordinationAttitude_AcceptabilityT(typeParsed: B): FAA_FCS_Coordination.Attitude_Acceptability.Type = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_FCS_Coordination.Attitude_Acceptability")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      FAA_FCS_Coordination.Attitude_Acceptability.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for FAA_FCS_Coordination.Attitude_Acceptability.")
          return FAA_FCS_Coordination.Attitude_Acceptability.byOrdinal(0).get
      }
    }

    def parseFAA_FCS_CoordinationAttitude_Acceptability_Payload(): FAA_FCS_Coordination.Attitude_Acceptability_Payload = {
      val r = parseFAA_FCS_CoordinationAttitude_Acceptability_PayloadT(F)
      return r
    }

    def parseFAA_FCS_CoordinationAttitude_Acceptability_PayloadT(typeParsed: B): FAA_FCS_Coordination.Attitude_Acceptability_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_FCS_Coordination.Attitude_Acceptability_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFAA_FCS_CoordinationAttitude_AcceptabilityType()
      parser.parseObjectNext()
      return FAA_FCS_Coordination.Attitude_Acceptability_Payload(value)
    }

    def parseFAA_FCS_CoordinationReference_StateType(): FAA_FCS_Coordination.Reference_State.Type = {
      val r = parseFAA_FCS_CoordinationReference_StateT(F)
      return r
    }

    def parseFAA_FCS_CoordinationReference_StateT(typeParsed: B): FAA_FCS_Coordination.Reference_State.Type = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_FCS_Coordination.Reference_State")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      FAA_FCS_Coordination.Reference_State.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for FAA_FCS_Coordination.Reference_State.")
          return FAA_FCS_Coordination.Reference_State.byOrdinal(0).get
      }
    }

    def parseFAA_FCS_CoordinationReference_State_Payload(): FAA_FCS_Coordination.Reference_State_Payload = {
      val r = parseFAA_FCS_CoordinationReference_State_PayloadT(F)
      return r
    }

    def parseFAA_FCS_CoordinationReference_State_PayloadT(typeParsed: B): FAA_FCS_Coordination.Reference_State_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_FCS_Coordination.Reference_State_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFAA_FCS_CoordinationReference_StateType()
      parser.parseObjectNext()
      return FAA_FCS_Coordination.Reference_State_Payload(value)
    }

    def parseFAA_FCS_CoordinationAP_AvailabilityType(): FAA_FCS_Coordination.AP_Availability.Type = {
      val r = parseFAA_FCS_CoordinationAP_AvailabilityT(F)
      return r
    }

    def parseFAA_FCS_CoordinationAP_AvailabilityT(typeParsed: B): FAA_FCS_Coordination.AP_Availability.Type = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_FCS_Coordination.AP_Availability")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      FAA_FCS_Coordination.AP_Availability.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for FAA_FCS_Coordination.AP_Availability.")
          return FAA_FCS_Coordination.AP_Availability.byOrdinal(0).get
      }
    }

    def parseFAA_FCS_CoordinationAP_Availability_Payload(): FAA_FCS_Coordination.AP_Availability_Payload = {
      val r = parseFAA_FCS_CoordinationAP_Availability_PayloadT(F)
      return r
    }

    def parseFAA_FCS_CoordinationAP_Availability_PayloadT(typeParsed: B): FAA_FCS_Coordination.AP_Availability_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_FCS_Coordination.AP_Availability_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFAA_FCS_CoordinationAP_AvailabilityType()
      parser.parseObjectNext()
      return FAA_FCS_Coordination.AP_Availability_Payload(value)
    }

    def parseFAA_FCS_CoordinationRequest_IndicationType(): FAA_FCS_Coordination.Request_Indication.Type = {
      val r = parseFAA_FCS_CoordinationRequest_IndicationT(F)
      return r
    }

    def parseFAA_FCS_CoordinationRequest_IndicationT(typeParsed: B): FAA_FCS_Coordination.Request_Indication.Type = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_FCS_Coordination.Request_Indication")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      FAA_FCS_Coordination.Request_Indication.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for FAA_FCS_Coordination.Request_Indication.")
          return FAA_FCS_Coordination.Request_Indication.byOrdinal(0).get
      }
    }

    def parseFAA_FCS_CoordinationRequest_Indication_Payload(): FAA_FCS_Coordination.Request_Indication_Payload = {
      val r = parseFAA_FCS_CoordinationRequest_Indication_PayloadT(F)
      return r
    }

    def parseFAA_FCS_CoordinationRequest_Indication_PayloadT(typeParsed: B): FAA_FCS_Coordination.Request_Indication_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_FCS_Coordination.Request_Indication_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFAA_FCS_CoordinationRequest_IndicationType()
      parser.parseObjectNext()
      return FAA_FCS_Coordination.Request_Indication_Payload(value)
    }

    def parseFAA_FCS_CoordinationFD_IndicationType(): FAA_FCS_Coordination.FD_Indication.Type = {
      val r = parseFAA_FCS_CoordinationFD_IndicationT(F)
      return r
    }

    def parseFAA_FCS_CoordinationFD_IndicationT(typeParsed: B): FAA_FCS_Coordination.FD_Indication.Type = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_FCS_Coordination.FD_Indication")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      FAA_FCS_Coordination.FD_Indication.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for FAA_FCS_Coordination.FD_Indication.")
          return FAA_FCS_Coordination.FD_Indication.byOrdinal(0).get
      }
    }

    def parseFAA_FCS_CoordinationFD_Indication_Payload(): FAA_FCS_Coordination.FD_Indication_Payload = {
      val r = parseFAA_FCS_CoordinationFD_Indication_PayloadT(F)
      return r
    }

    def parseFAA_FCS_CoordinationFD_Indication_PayloadT(typeParsed: B): FAA_FCS_Coordination.FD_Indication_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_FCS_Coordination.FD_Indication_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFAA_FCS_CoordinationFD_IndicationType()
      parser.parseObjectNext()
      return FAA_FCS_Coordination.FD_Indication_Payload(value)
    }

    def parseFAA_FCS_CoordinationFCS_Failed_IndicationType(): FAA_FCS_Coordination.FCS_Failed_Indication.Type = {
      val r = parseFAA_FCS_CoordinationFCS_Failed_IndicationT(F)
      return r
    }

    def parseFAA_FCS_CoordinationFCS_Failed_IndicationT(typeParsed: B): FAA_FCS_Coordination.FCS_Failed_Indication.Type = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_FCS_Coordination.FCS_Failed_Indication")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      FAA_FCS_Coordination.FCS_Failed_Indication.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for FAA_FCS_Coordination.FCS_Failed_Indication.")
          return FAA_FCS_Coordination.FCS_Failed_Indication.byOrdinal(0).get
      }
    }

    def parseFAA_FCS_CoordinationFCS_Failed_Indication_Payload(): FAA_FCS_Coordination.FCS_Failed_Indication_Payload = {
      val r = parseFAA_FCS_CoordinationFCS_Failed_Indication_PayloadT(F)
      return r
    }

    def parseFAA_FCS_CoordinationFCS_Failed_Indication_PayloadT(typeParsed: B): FAA_FCS_Coordination.FCS_Failed_Indication_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_FCS_Coordination.FCS_Failed_Indication_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFAA_FCS_CoordinationFCS_Failed_IndicationType()
      parser.parseObjectNext()
      return FAA_FCS_Coordination.FCS_Failed_Indication_Payload(value)
    }

    def parseFAA_FCS_CoordinationAP_StatusType(): FAA_FCS_Coordination.AP_Status.Type = {
      val r = parseFAA_FCS_CoordinationAP_StatusT(F)
      return r
    }

    def parseFAA_FCS_CoordinationAP_StatusT(typeParsed: B): FAA_FCS_Coordination.AP_Status.Type = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_FCS_Coordination.AP_Status")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      FAA_FCS_Coordination.AP_Status.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for FAA_FCS_Coordination.AP_Status.")
          return FAA_FCS_Coordination.AP_Status.byOrdinal(0).get
      }
    }

    def parseFAA_FCS_CoordinationAP_Status_Payload(): FAA_FCS_Coordination.AP_Status_Payload = {
      val r = parseFAA_FCS_CoordinationAP_Status_PayloadT(F)
      return r
    }

    def parseFAA_FCS_CoordinationAP_Status_PayloadT(typeParsed: B): FAA_FCS_Coordination.AP_Status_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_FCS_Coordination.AP_Status_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFAA_FCS_CoordinationAP_StatusType()
      parser.parseObjectNext()
      return FAA_FCS_Coordination.AP_Status_Payload(value)
    }

    def parseFAA_FCS_CoordinationAP_EnableType(): FAA_FCS_Coordination.AP_Enable.Type = {
      val r = parseFAA_FCS_CoordinationAP_EnableT(F)
      return r
    }

    def parseFAA_FCS_CoordinationAP_EnableT(typeParsed: B): FAA_FCS_Coordination.AP_Enable.Type = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_FCS_Coordination.AP_Enable")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      FAA_FCS_Coordination.AP_Enable.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for FAA_FCS_Coordination.AP_Enable.")
          return FAA_FCS_Coordination.AP_Enable.byOrdinal(0).get
      }
    }

    def parseFAA_FCS_CoordinationAP_Enable_Payload(): FAA_FCS_Coordination.AP_Enable_Payload = {
      val r = parseFAA_FCS_CoordinationAP_Enable_PayloadT(F)
      return r
    }

    def parseFAA_FCS_CoordinationAP_Enable_PayloadT(typeParsed: B): FAA_FCS_Coordination.AP_Enable_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_FCS_Coordination.AP_Enable_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFAA_FCS_CoordinationAP_EnableType()
      parser.parseObjectNext()
      return FAA_FCS_Coordination.AP_Enable_Payload(value)
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

    def parseFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container(): FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_P", "FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PS"))
      t.native match {
        case "FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_P" => val r = parseFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PT(T); return r
        case "FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PS" => val r = parseFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PST(T); return r
        case _ => val r = parseFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PST(T); return r
      }
    }

    def parseFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_P(): FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_P = {
      val r = parseFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PT(F)
      return r
    }

    def parseFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PT(typeParsed: B): FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_P")
      }
      parser.parseObjectKey("api_display_fd_request_in")
      val api_display_fd_request_in = parseFAA_FCS_CoordinationRequest_ValueType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_display_fd_validity_in")
      val api_display_fd_validity_in = parseFAA_FCS_CoordinationInput_ValidityType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_engage_ap_request_in")
      val api_engage_ap_request_in = parseFAA_FCS_CoordinationRequest_ValueType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_engage_ap_validity_in")
      val api_engage_ap_validity_in = parseFAA_FCS_CoordinationInput_ValidityType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_sync_fd_request_in")
      val api_sync_fd_request_in = parseFAA_FCS_CoordinationRequest_ValueType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_sync_fd_validity_in")
      val api_sync_fd_validity_in = parseFAA_FCS_CoordinationInput_ValidityType()
      parser.parseObjectNext()
      return FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_P(api_display_fd_request_in, api_display_fd_validity_in, api_engage_ap_request_in, api_engage_ap_validity_in, api_sync_fd_request_in, api_sync_fd_validity_in)
    }

    def parseFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PS(): FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PS = {
      val r = parseFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PST(F)
      return r
    }

    def parseFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PST(typeParsed: B): FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PS")
      }
      parser.parseObjectKey("api_display_fd_request_in")
      val api_display_fd_request_in = parseFAA_FCS_CoordinationRequest_ValueType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_display_fd_validity_in")
      val api_display_fd_validity_in = parseFAA_FCS_CoordinationInput_ValidityType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_engage_ap_request_in")
      val api_engage_ap_request_in = parseFAA_FCS_CoordinationRequest_ValueType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_engage_ap_validity_in")
      val api_engage_ap_validity_in = parseFAA_FCS_CoordinationInput_ValidityType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_sync_fd_request_in")
      val api_sync_fd_request_in = parseFAA_FCS_CoordinationRequest_ValueType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_sync_fd_validity_in")
      val api_sync_fd_validity_in = parseFAA_FCS_CoordinationInput_ValidityType()
      parser.parseObjectNext()
      return FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PS(api_display_fd_request_in, api_display_fd_validity_in, api_engage_ap_request_in, api_engage_ap_validity_in, api_sync_fd_request_in, api_sync_fd_validity_in)
    }

    def parseFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container(): FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_P", "FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PS"))
      t.native match {
        case "FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_P" => val r = parseFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PT(T); return r
        case "FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PS" => val r = parseFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PST(T); return r
        case _ => val r = parseFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PST(T); return r
      }
    }

    def parseFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_P(): FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_P = {
      val r = parseFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PT(F)
      return r
    }

    def parseFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PT(typeParsed: B): FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_P")
      }
      parser.parseObjectKey("api_qualified_display_request")
      val api_qualified_display_request = parseFAA_FCS_CoordinationQualified_RequestType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_qualified_engage_request")
      val api_qualified_engage_request = parseFAA_FCS_CoordinationQualified_RequestType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_qualified_sync_request")
      val api_qualified_sync_request = parseFAA_FCS_CoordinationQualified_RequestType()
      parser.parseObjectNext()
      return FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_P(api_qualified_display_request, api_qualified_engage_request, api_qualified_sync_request)
    }

    def parseFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PS(): FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PS = {
      val r = parseFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PST(F)
      return r
    }

    def parseFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PST(typeParsed: B): FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PS")
      }
      parser.parseObjectKey("api_qualified_display_request")
      val api_qualified_display_request = parseFAA_FCS_CoordinationQualified_RequestType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_qualified_engage_request")
      val api_qualified_engage_request = parseFAA_FCS_CoordinationQualified_RequestType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_qualified_sync_request")
      val api_qualified_sync_request = parseFAA_FCS_CoordinationQualified_RequestType()
      parser.parseObjectNext()
      return FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PS(api_qualified_display_request, api_qualified_engage_request, api_qualified_sync_request)
    }

    def parseFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container(): FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_P", "FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PS"))
      t.native match {
        case "FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_P" => val r = parseFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PT(T); return r
        case "FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PS" => val r = parseFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PST(T); return r
        case _ => val r = parseFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PST(T); return r
      }
    }

    def parseFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_P(): FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_P = {
      val r = parseFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PT(F)
      return r
    }

    def parseFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PT(typeParsed: B): FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_P")
      }
      parser.parseObjectKey("api_attitude_acceptable_in")
      val api_attitude_acceptable_in = parseFAA_FCS_CoordinationAttitude_AcceptabilityType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_attitude_data_in")
      val api_attitude_data_in = parseFAA_FCS_CoordinationAttitude_Data_ValidityType()
      parser.parseObjectNext()
      return FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_P(api_attitude_acceptable_in, api_attitude_data_in)
    }

    def parseFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PS(): FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PS = {
      val r = parseFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PST(F)
      return r
    }

    def parseFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PST(typeParsed: B): FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PS")
      }
      parser.parseObjectKey("api_attitude_acceptable_in")
      val api_attitude_acceptable_in = parseFAA_FCS_CoordinationAttitude_AcceptabilityType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_attitude_data_in")
      val api_attitude_data_in = parseFAA_FCS_CoordinationAttitude_Data_ValidityType()
      parser.parseObjectNext()
      return FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PS(api_attitude_acceptable_in, api_attitude_data_in)
    }

    def parseFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container(): FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_P", "FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PS"))
      t.native match {
        case "FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_P" => val r = parseFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PT(T); return r
        case "FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PS" => val r = parseFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PST(T); return r
        case _ => val r = parseFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PST(T); return r
      }
    }

    def parseFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_P(): FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_P = {
      val r = parseFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PT(F)
      return r
    }

    def parseFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PT(typeParsed: B): FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_P")
      }
      parser.parseObjectKey("api_attitude_acceptable_out")
      val api_attitude_acceptable_out = parseFAA_FCS_CoordinationAttitude_AcceptabilityType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_attitude_data_out")
      val api_attitude_data_out = parseFAA_FCS_CoordinationAttitude_Data_ValidityType()
      parser.parseObjectNext()
      return FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_P(api_attitude_acceptable_out, api_attitude_data_out)
    }

    def parseFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PS(): FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PS = {
      val r = parseFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PST(F)
      return r
    }

    def parseFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PST(typeParsed: B): FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PS")
      }
      parser.parseObjectKey("api_attitude_acceptable_out")
      val api_attitude_acceptable_out = parseFAA_FCS_CoordinationAttitude_AcceptabilityType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_attitude_data_out")
      val api_attitude_data_out = parseFAA_FCS_CoordinationAttitude_Data_ValidityType()
      parser.parseObjectNext()
      return FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PS(api_attitude_acceptable_out, api_attitude_data_out)
    }

    def parseFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container(): FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_P", "FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PS"))
      t.native match {
        case "FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_P" => val r = parseFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PT(T); return r
        case "FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PS" => val r = parseFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PST(T); return r
        case _ => val r = parseFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PST(T); return r
      }
    }

    def parseFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_P(): FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_P = {
      val r = parseFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PT(F)
      return r
    }

    def parseFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PT(typeParsed: B): FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_P")
      }
      parser.parseObjectKey("api_reference_state_in")
      val api_reference_state_in = parseFAA_FCS_CoordinationReference_StateType()
      parser.parseObjectNext()
      return FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_P(api_reference_state_in)
    }

    def parseFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PS(): FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PS = {
      val r = parseFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PST(F)
      return r
    }

    def parseFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PST(typeParsed: B): FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PS")
      }
      parser.parseObjectKey("api_reference_state_in")
      val api_reference_state_in = parseFAA_FCS_CoordinationReference_StateType()
      parser.parseObjectNext()
      return FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PS(api_reference_state_in)
    }

    def parseFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container(): FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_P", "FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PS"))
      t.native match {
        case "FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_P" => val r = parseFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PT(T); return r
        case "FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PS" => val r = parseFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PST(T); return r
        case _ => val r = parseFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PST(T); return r
      }
    }

    def parseFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_P(): FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_P = {
      val r = parseFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PT(F)
      return r
    }

    def parseFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PT(typeParsed: B): FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_P")
      }
      parser.parseObjectKey("api_reference_state_out")
      val api_reference_state_out = parseFAA_FCS_CoordinationReference_StateType()
      parser.parseObjectNext()
      return FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_P(api_reference_state_out)
    }

    def parseFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PS(): FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PS = {
      val r = parseFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PST(F)
      return r
    }

    def parseFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PST(typeParsed: B): FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PS")
      }
      parser.parseObjectKey("api_reference_state_out")
      val api_reference_state_out = parseFAA_FCS_CoordinationReference_StateType()
      parser.parseObjectNext()
      return FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PS(api_reference_state_out)
    }

    def parseFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container(): FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_P", "FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PS"))
      t.native match {
        case "FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_P" => val r = parseFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PT(T); return r
        case "FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PS" => val r = parseFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PST(T); return r
        case _ => val r = parseFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PST(T); return r
      }
    }

    def parseFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_P(): FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_P = {
      val r = parseFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PT(F)
      return r
    }

    def parseFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PT(typeParsed: B): FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_P")
      }
      parser.parseObjectKey("api_ap_availability_in")
      val api_ap_availability_in = parseFAA_FCS_CoordinationAP_AvailabilityType()
      parser.parseObjectNext()
      return FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_P(api_ap_availability_in)
    }

    def parseFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PS(): FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PS = {
      val r = parseFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PST(F)
      return r
    }

    def parseFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PST(typeParsed: B): FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PS")
      }
      parser.parseObjectKey("api_ap_availability_in")
      val api_ap_availability_in = parseFAA_FCS_CoordinationAP_AvailabilityType()
      parser.parseObjectNext()
      return FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PS(api_ap_availability_in)
    }

    def parseFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container(): FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_P", "FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PS"))
      t.native match {
        case "FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_P" => val r = parseFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PT(T); return r
        case "FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PS" => val r = parseFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PST(T); return r
        case _ => val r = parseFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PST(T); return r
      }
    }

    def parseFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_P(): FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_P = {
      val r = parseFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PT(F)
      return r
    }

    def parseFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PT(typeParsed: B): FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_P")
      }
      parser.parseObjectKey("api_ap_availability_out")
      val api_ap_availability_out = parseFAA_FCS_CoordinationAP_AvailabilityType()
      parser.parseObjectNext()
      return FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_P(api_ap_availability_out)
    }

    def parseFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PS(): FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PS = {
      val r = parseFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PST(F)
      return r
    }

    def parseFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PST(typeParsed: B): FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PS")
      }
      parser.parseObjectKey("api_ap_availability_out")
      val api_ap_availability_out = parseFAA_FCS_CoordinationAP_AvailabilityType()
      parser.parseObjectNext()
      return FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PS(api_ap_availability_out)
    }

    def parseFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container(): FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_P", "FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PS"))
      t.native match {
        case "FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_P" => val r = parseFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PT(T); return r
        case "FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PS" => val r = parseFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PST(T); return r
        case _ => val r = parseFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PST(T); return r
      }
    }

    def parseFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_P(): FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_P = {
      val r = parseFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PT(F)
      return r
    }

    def parseFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PT(typeParsed: B): FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_P")
      }
      parser.parseObjectKey("api_attitude_acceptable")
      val api_attitude_acceptable = parseFAA_FCS_CoordinationAttitude_AcceptabilityType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_attitude_data")
      val api_attitude_data = parseFAA_FCS_CoordinationAttitude_Data_ValidityType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_qualified_display_request")
      val api_qualified_display_request = parseFAA_FCS_CoordinationQualified_RequestType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_qualified_sync_request")
      val api_qualified_sync_request = parseFAA_FCS_CoordinationQualified_RequestType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_reference_state")
      val api_reference_state = parseFAA_FCS_CoordinationReference_StateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_reference_sync_trigger")
      val api_reference_sync_trigger = parseFAA_FCS_CoordinationRequest_IndicationType()
      parser.parseObjectNext()
      return FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_P(api_attitude_acceptable, api_attitude_data, api_qualified_display_request, api_qualified_sync_request, api_reference_state, api_reference_sync_trigger)
    }

    def parseFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PS(): FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PS = {
      val r = parseFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PST(F)
      return r
    }

    def parseFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PST(typeParsed: B): FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PS")
      }
      parser.parseObjectKey("api_attitude_acceptable")
      val api_attitude_acceptable = parseFAA_FCS_CoordinationAttitude_AcceptabilityType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_attitude_data")
      val api_attitude_data = parseFAA_FCS_CoordinationAttitude_Data_ValidityType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_qualified_display_request")
      val api_qualified_display_request = parseFAA_FCS_CoordinationQualified_RequestType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_qualified_sync_request")
      val api_qualified_sync_request = parseFAA_FCS_CoordinationQualified_RequestType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_reference_state")
      val api_reference_state = parseFAA_FCS_CoordinationReference_StateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_reference_sync_trigger")
      val api_reference_sync_trigger = parseFAA_FCS_CoordinationRequest_IndicationType()
      parser.parseObjectNext()
      return FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PS(api_attitude_acceptable, api_attitude_data, api_qualified_display_request, api_qualified_sync_request, api_reference_state, api_reference_sync_trigger)
    }

    def parseFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container(): FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_P", "FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PS"))
      t.native match {
        case "FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_P" => val r = parseFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PT(T); return r
        case "FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PS" => val r = parseFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PST(T); return r
        case _ => val r = parseFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PST(T); return r
      }
    }

    def parseFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_P(): FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_P = {
      val r = parseFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PT(F)
      return r
    }

    def parseFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PT(typeParsed: B): FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_P")
      }
      parser.parseObjectKey("api_fcs_failed")
      val api_fcs_failed = parseFAA_FCS_CoordinationFCS_Failed_IndicationType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_fd_on")
      val api_fd_on = parseFAA_FCS_CoordinationFD_IndicationType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_reference_sync_request")
      val api_reference_sync_request = parseFAA_FCS_CoordinationRequest_IndicationType()
      parser.parseObjectNext()
      return FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_P(api_fcs_failed, api_fd_on, api_reference_sync_request)
    }

    def parseFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PS(): FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PS = {
      val r = parseFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PST(F)
      return r
    }

    def parseFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PST(typeParsed: B): FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PS")
      }
      parser.parseObjectKey("api_fcs_failed")
      val api_fcs_failed = parseFAA_FCS_CoordinationFCS_Failed_IndicationType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_fd_on")
      val api_fd_on = parseFAA_FCS_CoordinationFD_IndicationType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_reference_sync_request")
      val api_reference_sync_request = parseFAA_FCS_CoordinationRequest_IndicationType()
      parser.parseObjectNext()
      return FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PS(api_fcs_failed, api_fd_on, api_reference_sync_request)
    }

    def parseFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container(): FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_P", "FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PS"))
      t.native match {
        case "FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_P" => val r = parseFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PT(T); return r
        case "FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PS" => val r = parseFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PST(T); return r
        case _ => val r = parseFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PST(T); return r
      }
    }

    def parseFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_P(): FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_P = {
      val r = parseFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PT(F)
      return r
    }

    def parseFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PT(typeParsed: B): FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_P")
      }
      parser.parseObjectKey("api_ap_availability")
      val api_ap_availability = parseFAA_FCS_CoordinationAP_AvailabilityType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_attitude_acceptable")
      val api_attitude_acceptable = parseFAA_FCS_CoordinationAttitude_AcceptabilityType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_attitude_data")
      val api_attitude_data = parseFAA_FCS_CoordinationAttitude_Data_ValidityType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_fd_on")
      val api_fd_on = parseFAA_FCS_CoordinationFD_IndicationType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_qualified_engage_request")
      val api_qualified_engage_request = parseFAA_FCS_CoordinationQualified_RequestType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_reference_state")
      val api_reference_state = parseFAA_FCS_CoordinationReference_StateType()
      parser.parseObjectNext()
      return FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_P(api_ap_availability, api_attitude_acceptable, api_attitude_data, api_fd_on, api_qualified_engage_request, api_reference_state)
    }

    def parseFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PS(): FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PS = {
      val r = parseFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PST(F)
      return r
    }

    def parseFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PST(typeParsed: B): FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PS")
      }
      parser.parseObjectKey("api_ap_availability")
      val api_ap_availability = parseFAA_FCS_CoordinationAP_AvailabilityType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_attitude_acceptable")
      val api_attitude_acceptable = parseFAA_FCS_CoordinationAttitude_AcceptabilityType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_attitude_data")
      val api_attitude_data = parseFAA_FCS_CoordinationAttitude_Data_ValidityType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_fd_on")
      val api_fd_on = parseFAA_FCS_CoordinationFD_IndicationType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_qualified_engage_request")
      val api_qualified_engage_request = parseFAA_FCS_CoordinationQualified_RequestType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_reference_state")
      val api_reference_state = parseFAA_FCS_CoordinationReference_StateType()
      parser.parseObjectNext()
      return FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PS(api_ap_availability, api_attitude_acceptable, api_attitude_data, api_fd_on, api_qualified_engage_request, api_reference_state)
    }

    def parseFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container(): FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_P", "FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PS"))
      t.native match {
        case "FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_P" => val r = parseFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PT(T); return r
        case "FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PS" => val r = parseFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PST(T); return r
        case _ => val r = parseFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PST(T); return r
      }
    }

    def parseFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_P(): FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_P = {
      val r = parseFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PT(F)
      return r
    }

    def parseFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PT(typeParsed: B): FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_P")
      }
      parser.parseObjectKey("api_ap_guidance_request")
      val api_ap_guidance_request = parseFAA_FCS_CoordinationRequest_IndicationType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_ap_on")
      val api_ap_on = parseFAA_FCS_CoordinationAP_EnableType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_ap_status")
      val api_ap_status = parseFAA_FCS_CoordinationAP_StatusType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_reference_sync_trigger")
      val api_reference_sync_trigger = parseFAA_FCS_CoordinationRequest_IndicationType()
      parser.parseObjectNext()
      return FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_P(api_ap_guidance_request, api_ap_on, api_ap_status, api_reference_sync_trigger)
    }

    def parseFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PS(): FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PS = {
      val r = parseFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PST(F)
      return r
    }

    def parseFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PST(typeParsed: B): FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PS")
      }
      parser.parseObjectKey("api_ap_guidance_request")
      val api_ap_guidance_request = parseFAA_FCS_CoordinationRequest_IndicationType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_ap_on")
      val api_ap_on = parseFAA_FCS_CoordinationAP_EnableType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_ap_status")
      val api_ap_status = parseFAA_FCS_CoordinationAP_StatusType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_reference_sync_trigger")
      val api_reference_sync_trigger = parseFAA_FCS_CoordinationRequest_IndicationType()
      parser.parseObjectNext()
      return FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PS(api_ap_guidance_request, api_ap_on, api_ap_status, api_reference_sync_trigger)
    }

    def parseFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container(): FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_P", "FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PS"))
      t.native match {
        case "FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_P" => val r = parseFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PT(T); return r
        case "FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PS" => val r = parseFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PST(T); return r
        case _ => val r = parseFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PST(T); return r
      }
    }

    def parseFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_P(): FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_P = {
      val r = parseFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PT(F)
      return r
    }

    def parseFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PT(typeParsed: B): FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_P")
      }
      parser.parseObjectKey("api_ap_guidance_request_in")
      val api_ap_guidance_request_in = parseFAA_FCS_CoordinationRequest_IndicationType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_ap_on_in")
      val api_ap_on_in = parseFAA_FCS_CoordinationAP_EnableType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_ap_status_in")
      val api_ap_status_in = parseFAA_FCS_CoordinationAP_StatusType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_fcs_failed_in")
      val api_fcs_failed_in = parseFAA_FCS_CoordinationFCS_Failed_IndicationType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_fd_on_in")
      val api_fd_on_in = parseFAA_FCS_CoordinationFD_IndicationType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_reference_sync_request_in")
      val api_reference_sync_request_in = parseFAA_FCS_CoordinationRequest_IndicationType()
      parser.parseObjectNext()
      return FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_P(api_ap_guidance_request_in, api_ap_on_in, api_ap_status_in, api_fcs_failed_in, api_fd_on_in, api_reference_sync_request_in)
    }

    def parseFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PS(): FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PS = {
      val r = parseFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PST(F)
      return r
    }

    def parseFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PST(typeParsed: B): FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PS")
      }
      parser.parseObjectKey("api_ap_guidance_request_in")
      val api_ap_guidance_request_in = parseFAA_FCS_CoordinationRequest_IndicationType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_ap_on_in")
      val api_ap_on_in = parseFAA_FCS_CoordinationAP_EnableType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_ap_status_in")
      val api_ap_status_in = parseFAA_FCS_CoordinationAP_StatusType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_fcs_failed_in")
      val api_fcs_failed_in = parseFAA_FCS_CoordinationFCS_Failed_IndicationType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_fd_on_in")
      val api_fd_on_in = parseFAA_FCS_CoordinationFD_IndicationType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_reference_sync_request_in")
      val api_reference_sync_request_in = parseFAA_FCS_CoordinationRequest_IndicationType()
      parser.parseObjectNext()
      return FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PS(api_ap_guidance_request_in, api_ap_on_in, api_ap_status_in, api_fcs_failed_in, api_fd_on_in, api_reference_sync_request_in)
    }

    def parseFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container(): FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_P", "FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PS"))
      t.native match {
        case "FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_P" => val r = parseFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PT(T); return r
        case "FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PS" => val r = parseFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PST(T); return r
        case _ => val r = parseFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PST(T); return r
      }
    }

    def parseFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_P(): FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_P = {
      val r = parseFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PT(F)
      return r
    }

    def parseFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PT(typeParsed: B): FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_P")
      }
      parser.parseObjectKey("api_ap_guidance_request_out")
      val api_ap_guidance_request_out = parseFAA_FCS_CoordinationRequest_IndicationType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_ap_on_out")
      val api_ap_on_out = parseFAA_FCS_CoordinationAP_EnableType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_ap_status_out")
      val api_ap_status_out = parseFAA_FCS_CoordinationAP_StatusType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_fcs_failed_out")
      val api_fcs_failed_out = parseFAA_FCS_CoordinationFCS_Failed_IndicationType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_fd_on_out")
      val api_fd_on_out = parseFAA_FCS_CoordinationFD_IndicationType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_reference_sync_request_out")
      val api_reference_sync_request_out = parseFAA_FCS_CoordinationRequest_IndicationType()
      parser.parseObjectNext()
      return FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_P(api_ap_guidance_request_out, api_ap_on_out, api_ap_status_out, api_fcs_failed_out, api_fd_on_out, api_reference_sync_request_out)
    }

    def parseFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PS(): FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PS = {
      val r = parseFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PST(F)
      return r
    }

    def parseFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PST(typeParsed: B): FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PS")
      }
      parser.parseObjectKey("api_ap_guidance_request_out")
      val api_ap_guidance_request_out = parseFAA_FCS_CoordinationRequest_IndicationType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_ap_on_out")
      val api_ap_on_out = parseFAA_FCS_CoordinationAP_EnableType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_ap_status_out")
      val api_ap_status_out = parseFAA_FCS_CoordinationAP_StatusType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_fcs_failed_out")
      val api_fcs_failed_out = parseFAA_FCS_CoordinationFCS_Failed_IndicationType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_fd_on_out")
      val api_fd_on_out = parseFAA_FCS_CoordinationFD_IndicationType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_reference_sync_request_out")
      val api_reference_sync_request_out = parseFAA_FCS_CoordinationRequest_IndicationType()
      parser.parseObjectNext()
      return FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PS(api_ap_guidance_request_out, api_ap_on_out, api_ap_status_out, api_fcs_failed_out, api_fd_on_out, api_reference_sync_request_out)
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
      val t = parser.parseObjectTypes(ISZ("util.EmptyContainer", "FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_P", "FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PS", "FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_P", "FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PS", "FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_P", "FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_P", "FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PS", "FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PS", "FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_P", "FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_P", "FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_P", "FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PS", "FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PS", "FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PS", "FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_P", "FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PS", "FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_P", "FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PS", "FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_P", "FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PS", "FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_P", "FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PS", "FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_P", "FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PS", "FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_P", "FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PS", "FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_P", "FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PS"))
      t.native match {
        case "util.EmptyContainer" => val r = parseutilEmptyContainerT(T); return r
        case "FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_P" => val r = parseFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PT(T); return r
        case "FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PS" => val r = parseFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PST(T); return r
        case "FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_P" => val r = parseFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PT(T); return r
        case "FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PS" => val r = parseFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PST(T); return r
        case "FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_P" => val r = parseFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PT(T); return r
        case "FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_P" => val r = parseFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PT(T); return r
        case "FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PS" => val r = parseFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PST(T); return r
        case "FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PS" => val r = parseFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PST(T); return r
        case "FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_P" => val r = parseFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PT(T); return r
        case "FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_P" => val r = parseFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PT(T); return r
        case "FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_P" => val r = parseFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PT(T); return r
        case "FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PS" => val r = parseFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PST(T); return r
        case "FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PS" => val r = parseFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PST(T); return r
        case "FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PS" => val r = parseFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PST(T); return r
        case "FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_P" => val r = parseFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PT(T); return r
        case "FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PS" => val r = parseFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PST(T); return r
        case "FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_P" => val r = parseFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PT(T); return r
        case "FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PS" => val r = parseFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PST(T); return r
        case "FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_P" => val r = parseFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PT(T); return r
        case "FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PS" => val r = parseFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PST(T); return r
        case "FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_P" => val r = parseFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PT(T); return r
        case "FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PS" => val r = parseFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PST(T); return r
        case "FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_P" => val r = parseFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PT(T); return r
        case "FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PS" => val r = parseFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PST(T); return r
        case "FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_P" => val r = parseFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PT(T); return r
        case "FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PS" => val r = parseFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PST(T); return r
        case "FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_P" => val r = parseFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PT(T); return r
        case "FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PS" => val r = parseFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PST(T); return r
        case _ => val r = parseFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PST(T); return r
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
      val t = parser.parseObjectTypes(ISZ("art.Empty", "Base_Types.Boolean_Payload", "Base_Types.Integer_Payload", "Base_Types.Integer_8_Payload", "Base_Types.Integer_16_Payload", "Base_Types.Integer_32_Payload", "Base_Types.Integer_64_Payload", "Base_Types.Unsigned_8_Payload", "Base_Types.Unsigned_16_Payload", "Base_Types.Unsigned_32_Payload", "Base_Types.Unsigned_64_Payload", "Base_Types.Float_Payload", "Base_Types.Float_32_Payload", "Base_Types.Float_64_Payload", "Base_Types.Character_Payload", "Base_Types.String_Payload", "Base_Types.Bits_Payload", "util.EmptyContainer", "FAA_FCS_Coordination.AP_Status_Payload", "FAA_FCS_Coordination.AP_Enable_Payload", "FAA_FCS_Coordination.FD_Indication_Payload", "FAA_FCS_Coordination.Request_Value_Payload", "FAA_FCS_Coordination.Input_Validity_Payload", "FAA_FCS_Coordination.AP_Availability_Payload", "FAA_FCS_Coordination.Reference_State_Payload", "FAA_FCS_Coordination.Qualified_Request_Payload", "FAA_FCS_Coordination.Request_Indication_Payload", "FAA_FCS_Coordination.FCS_Failed_Indication_Payload", "FAA_FCS_Coordination.Attitude_Data_Validity_Payload", "FAA_FCS_Coordination.Attitude_Acceptability_Payload", "FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_P", "FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PS", "FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_P", "FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PS", "FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_P", "FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_P", "FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PS", "FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PS", "FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_P", "FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_P", "FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_P", "FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PS", "FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PS", "FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PS", "FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_P", "FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PS", "FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_P", "FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PS", "FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_P", "FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PS", "FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_P", "FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PS", "FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_P", "FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PS", "FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_P", "FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PS", "FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_P", "FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PS"))
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
        case "FAA_FCS_Coordination.AP_Status_Payload" => val r = parseFAA_FCS_CoordinationAP_Status_PayloadT(T); return r
        case "FAA_FCS_Coordination.AP_Enable_Payload" => val r = parseFAA_FCS_CoordinationAP_Enable_PayloadT(T); return r
        case "FAA_FCS_Coordination.FD_Indication_Payload" => val r = parseFAA_FCS_CoordinationFD_Indication_PayloadT(T); return r
        case "FAA_FCS_Coordination.Request_Value_Payload" => val r = parseFAA_FCS_CoordinationRequest_Value_PayloadT(T); return r
        case "FAA_FCS_Coordination.Input_Validity_Payload" => val r = parseFAA_FCS_CoordinationInput_Validity_PayloadT(T); return r
        case "FAA_FCS_Coordination.AP_Availability_Payload" => val r = parseFAA_FCS_CoordinationAP_Availability_PayloadT(T); return r
        case "FAA_FCS_Coordination.Reference_State_Payload" => val r = parseFAA_FCS_CoordinationReference_State_PayloadT(T); return r
        case "FAA_FCS_Coordination.Qualified_Request_Payload" => val r = parseFAA_FCS_CoordinationQualified_Request_PayloadT(T); return r
        case "FAA_FCS_Coordination.Request_Indication_Payload" => val r = parseFAA_FCS_CoordinationRequest_Indication_PayloadT(T); return r
        case "FAA_FCS_Coordination.FCS_Failed_Indication_Payload" => val r = parseFAA_FCS_CoordinationFCS_Failed_Indication_PayloadT(T); return r
        case "FAA_FCS_Coordination.Attitude_Data_Validity_Payload" => val r = parseFAA_FCS_CoordinationAttitude_Data_Validity_PayloadT(T); return r
        case "FAA_FCS_Coordination.Attitude_Acceptability_Payload" => val r = parseFAA_FCS_CoordinationAttitude_Acceptability_PayloadT(T); return r
        case "FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_P" => val r = parseFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PT(T); return r
        case "FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PS" => val r = parseFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PST(T); return r
        case "FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_P" => val r = parseFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PT(T); return r
        case "FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PS" => val r = parseFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PST(T); return r
        case "FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_P" => val r = parseFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PT(T); return r
        case "FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_P" => val r = parseFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PT(T); return r
        case "FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PS" => val r = parseFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PST(T); return r
        case "FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PS" => val r = parseFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PST(T); return r
        case "FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_P" => val r = parseFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PT(T); return r
        case "FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_P" => val r = parseFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PT(T); return r
        case "FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_P" => val r = parseFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PT(T); return r
        case "FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PS" => val r = parseFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PST(T); return r
        case "FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PS" => val r = parseFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PST(T); return r
        case "FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PS" => val r = parseFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PST(T); return r
        case "FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_P" => val r = parseFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PT(T); return r
        case "FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PS" => val r = parseFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PST(T); return r
        case "FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_P" => val r = parseFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PT(T); return r
        case "FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PS" => val r = parseFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PST(T); return r
        case "FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_P" => val r = parseFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PT(T); return r
        case "FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PS" => val r = parseFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PST(T); return r
        case "FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_P" => val r = parseFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PT(T); return r
        case "FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PS" => val r = parseFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PST(T); return r
        case "FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_P" => val r = parseFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PT(T); return r
        case "FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PS" => val r = parseFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PST(T); return r
        case "FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_P" => val r = parseFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PT(T); return r
        case "FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PS" => val r = parseFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PST(T); return r
        case "FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_P" => val r = parseFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PT(T); return r
        case "FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PS" => val r = parseFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PST(T); return r
        case _ => val r = parseFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PST(T); return r
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

  def fromFAA_FCS_CoordinationRequest_Value_Payload(o: FAA_FCS_Coordination.Request_Value_Payload, isCompact: B): String = {
    val st = Printer.printFAA_FCS_CoordinationRequest_Value_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_FCS_CoordinationRequest_Value_Payload(s: String): Either[FAA_FCS_Coordination.Request_Value_Payload, Json.ErrorMsg] = {
    def fFAA_FCS_CoordinationRequest_Value_Payload(parser: Parser): FAA_FCS_Coordination.Request_Value_Payload = {
      val r = parser.parseFAA_FCS_CoordinationRequest_Value_Payload()
      return r
    }
    val r = to(s, fFAA_FCS_CoordinationRequest_Value_Payload _)
    return r
  }

  def fromFAA_FCS_CoordinationInput_Validity_Payload(o: FAA_FCS_Coordination.Input_Validity_Payload, isCompact: B): String = {
    val st = Printer.printFAA_FCS_CoordinationInput_Validity_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_FCS_CoordinationInput_Validity_Payload(s: String): Either[FAA_FCS_Coordination.Input_Validity_Payload, Json.ErrorMsg] = {
    def fFAA_FCS_CoordinationInput_Validity_Payload(parser: Parser): FAA_FCS_Coordination.Input_Validity_Payload = {
      val r = parser.parseFAA_FCS_CoordinationInput_Validity_Payload()
      return r
    }
    val r = to(s, fFAA_FCS_CoordinationInput_Validity_Payload _)
    return r
  }

  def fromFAA_FCS_CoordinationQualified_Request_Payload(o: FAA_FCS_Coordination.Qualified_Request_Payload, isCompact: B): String = {
    val st = Printer.printFAA_FCS_CoordinationQualified_Request_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_FCS_CoordinationQualified_Request_Payload(s: String): Either[FAA_FCS_Coordination.Qualified_Request_Payload, Json.ErrorMsg] = {
    def fFAA_FCS_CoordinationQualified_Request_Payload(parser: Parser): FAA_FCS_Coordination.Qualified_Request_Payload = {
      val r = parser.parseFAA_FCS_CoordinationQualified_Request_Payload()
      return r
    }
    val r = to(s, fFAA_FCS_CoordinationQualified_Request_Payload _)
    return r
  }

  def fromFAA_FCS_CoordinationAttitude_Data_Validity_Payload(o: FAA_FCS_Coordination.Attitude_Data_Validity_Payload, isCompact: B): String = {
    val st = Printer.printFAA_FCS_CoordinationAttitude_Data_Validity_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_FCS_CoordinationAttitude_Data_Validity_Payload(s: String): Either[FAA_FCS_Coordination.Attitude_Data_Validity_Payload, Json.ErrorMsg] = {
    def fFAA_FCS_CoordinationAttitude_Data_Validity_Payload(parser: Parser): FAA_FCS_Coordination.Attitude_Data_Validity_Payload = {
      val r = parser.parseFAA_FCS_CoordinationAttitude_Data_Validity_Payload()
      return r
    }
    val r = to(s, fFAA_FCS_CoordinationAttitude_Data_Validity_Payload _)
    return r
  }

  def fromFAA_FCS_CoordinationAttitude_Acceptability_Payload(o: FAA_FCS_Coordination.Attitude_Acceptability_Payload, isCompact: B): String = {
    val st = Printer.printFAA_FCS_CoordinationAttitude_Acceptability_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_FCS_CoordinationAttitude_Acceptability_Payload(s: String): Either[FAA_FCS_Coordination.Attitude_Acceptability_Payload, Json.ErrorMsg] = {
    def fFAA_FCS_CoordinationAttitude_Acceptability_Payload(parser: Parser): FAA_FCS_Coordination.Attitude_Acceptability_Payload = {
      val r = parser.parseFAA_FCS_CoordinationAttitude_Acceptability_Payload()
      return r
    }
    val r = to(s, fFAA_FCS_CoordinationAttitude_Acceptability_Payload _)
    return r
  }

  def fromFAA_FCS_CoordinationReference_State_Payload(o: FAA_FCS_Coordination.Reference_State_Payload, isCompact: B): String = {
    val st = Printer.printFAA_FCS_CoordinationReference_State_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_FCS_CoordinationReference_State_Payload(s: String): Either[FAA_FCS_Coordination.Reference_State_Payload, Json.ErrorMsg] = {
    def fFAA_FCS_CoordinationReference_State_Payload(parser: Parser): FAA_FCS_Coordination.Reference_State_Payload = {
      val r = parser.parseFAA_FCS_CoordinationReference_State_Payload()
      return r
    }
    val r = to(s, fFAA_FCS_CoordinationReference_State_Payload _)
    return r
  }

  def fromFAA_FCS_CoordinationAP_Availability_Payload(o: FAA_FCS_Coordination.AP_Availability_Payload, isCompact: B): String = {
    val st = Printer.printFAA_FCS_CoordinationAP_Availability_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_FCS_CoordinationAP_Availability_Payload(s: String): Either[FAA_FCS_Coordination.AP_Availability_Payload, Json.ErrorMsg] = {
    def fFAA_FCS_CoordinationAP_Availability_Payload(parser: Parser): FAA_FCS_Coordination.AP_Availability_Payload = {
      val r = parser.parseFAA_FCS_CoordinationAP_Availability_Payload()
      return r
    }
    val r = to(s, fFAA_FCS_CoordinationAP_Availability_Payload _)
    return r
  }

  def fromFAA_FCS_CoordinationRequest_Indication_Payload(o: FAA_FCS_Coordination.Request_Indication_Payload, isCompact: B): String = {
    val st = Printer.printFAA_FCS_CoordinationRequest_Indication_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_FCS_CoordinationRequest_Indication_Payload(s: String): Either[FAA_FCS_Coordination.Request_Indication_Payload, Json.ErrorMsg] = {
    def fFAA_FCS_CoordinationRequest_Indication_Payload(parser: Parser): FAA_FCS_Coordination.Request_Indication_Payload = {
      val r = parser.parseFAA_FCS_CoordinationRequest_Indication_Payload()
      return r
    }
    val r = to(s, fFAA_FCS_CoordinationRequest_Indication_Payload _)
    return r
  }

  def fromFAA_FCS_CoordinationFD_Indication_Payload(o: FAA_FCS_Coordination.FD_Indication_Payload, isCompact: B): String = {
    val st = Printer.printFAA_FCS_CoordinationFD_Indication_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_FCS_CoordinationFD_Indication_Payload(s: String): Either[FAA_FCS_Coordination.FD_Indication_Payload, Json.ErrorMsg] = {
    def fFAA_FCS_CoordinationFD_Indication_Payload(parser: Parser): FAA_FCS_Coordination.FD_Indication_Payload = {
      val r = parser.parseFAA_FCS_CoordinationFD_Indication_Payload()
      return r
    }
    val r = to(s, fFAA_FCS_CoordinationFD_Indication_Payload _)
    return r
  }

  def fromFAA_FCS_CoordinationFCS_Failed_Indication_Payload(o: FAA_FCS_Coordination.FCS_Failed_Indication_Payload, isCompact: B): String = {
    val st = Printer.printFAA_FCS_CoordinationFCS_Failed_Indication_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_FCS_CoordinationFCS_Failed_Indication_Payload(s: String): Either[FAA_FCS_Coordination.FCS_Failed_Indication_Payload, Json.ErrorMsg] = {
    def fFAA_FCS_CoordinationFCS_Failed_Indication_Payload(parser: Parser): FAA_FCS_Coordination.FCS_Failed_Indication_Payload = {
      val r = parser.parseFAA_FCS_CoordinationFCS_Failed_Indication_Payload()
      return r
    }
    val r = to(s, fFAA_FCS_CoordinationFCS_Failed_Indication_Payload _)
    return r
  }

  def fromFAA_FCS_CoordinationAP_Status_Payload(o: FAA_FCS_Coordination.AP_Status_Payload, isCompact: B): String = {
    val st = Printer.printFAA_FCS_CoordinationAP_Status_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_FCS_CoordinationAP_Status_Payload(s: String): Either[FAA_FCS_Coordination.AP_Status_Payload, Json.ErrorMsg] = {
    def fFAA_FCS_CoordinationAP_Status_Payload(parser: Parser): FAA_FCS_Coordination.AP_Status_Payload = {
      val r = parser.parseFAA_FCS_CoordinationAP_Status_Payload()
      return r
    }
    val r = to(s, fFAA_FCS_CoordinationAP_Status_Payload _)
    return r
  }

  def fromFAA_FCS_CoordinationAP_Enable_Payload(o: FAA_FCS_Coordination.AP_Enable_Payload, isCompact: B): String = {
    val st = Printer.printFAA_FCS_CoordinationAP_Enable_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_FCS_CoordinationAP_Enable_Payload(s: String): Either[FAA_FCS_Coordination.AP_Enable_Payload, Json.ErrorMsg] = {
    def fFAA_FCS_CoordinationAP_Enable_Payload(parser: Parser): FAA_FCS_Coordination.AP_Enable_Payload = {
      val r = parser.parseFAA_FCS_CoordinationAP_Enable_Payload()
      return r
    }
    val r = to(s, fFAA_FCS_CoordinationAP_Enable_Payload _)
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

  def fromFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container(o: FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container, isCompact: B): String = {
    val st = Printer.printFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container(s: String): Either[FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container, Json.ErrorMsg] = {
    def fFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container(parser: Parser): FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container = {
      val r = parser.parseFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container()
      return r
    }
    val r = to(s, fFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container _)
    return r
  }

  def fromFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_P(o: FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_P(s: String): Either[FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_P, Json.ErrorMsg] = {
    def fFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_P(parser: Parser): FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_P = {
      val r = parser.parseFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_P()
      return r
    }
    val r = to(s, fFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_P _)
    return r
  }

  def fromFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PS(o: FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PS(s: String): Either[FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PS, Json.ErrorMsg] = {
    def fFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PS(parser: Parser): FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PS = {
      val r = parser.parseFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PS()
      return r
    }
    val r = to(s, fFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PS _)
    return r
  }

  def fromFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container(o: FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container, isCompact: B): String = {
    val st = Printer.printFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container(s: String): Either[FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container, Json.ErrorMsg] = {
    def fFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container(parser: Parser): FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container = {
      val r = parser.parseFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container()
      return r
    }
    val r = to(s, fFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container _)
    return r
  }

  def fromFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_P(o: FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_P(s: String): Either[FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_P, Json.ErrorMsg] = {
    def fFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_P(parser: Parser): FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_P = {
      val r = parser.parseFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_P()
      return r
    }
    val r = to(s, fFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_P _)
    return r
  }

  def fromFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PS(o: FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PS(s: String): Either[FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PS, Json.ErrorMsg] = {
    def fFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PS(parser: Parser): FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PS = {
      val r = parser.parseFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PS()
      return r
    }
    val r = to(s, fFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PS _)
    return r
  }

  def fromFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container(o: FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container, isCompact: B): String = {
    val st = Printer.printFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container(s: String): Either[FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container, Json.ErrorMsg] = {
    def fFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container(parser: Parser): FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container = {
      val r = parser.parseFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container()
      return r
    }
    val r = to(s, fFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container _)
    return r
  }

  def fromFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_P(o: FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_P(s: String): Either[FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_P, Json.ErrorMsg] = {
    def fFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_P(parser: Parser): FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_P = {
      val r = parser.parseFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_P()
      return r
    }
    val r = to(s, fFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_P _)
    return r
  }

  def fromFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PS(o: FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PS(s: String): Either[FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PS, Json.ErrorMsg] = {
    def fFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PS(parser: Parser): FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PS = {
      val r = parser.parseFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PS()
      return r
    }
    val r = to(s, fFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PS _)
    return r
  }

  def fromFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container(o: FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container, isCompact: B): String = {
    val st = Printer.printFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container(s: String): Either[FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container, Json.ErrorMsg] = {
    def fFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container(parser: Parser): FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container = {
      val r = parser.parseFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container()
      return r
    }
    val r = to(s, fFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container _)
    return r
  }

  def fromFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_P(o: FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_P(s: String): Either[FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_P, Json.ErrorMsg] = {
    def fFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_P(parser: Parser): FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_P = {
      val r = parser.parseFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_P()
      return r
    }
    val r = to(s, fFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_P _)
    return r
  }

  def fromFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PS(o: FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PS(s: String): Either[FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PS, Json.ErrorMsg] = {
    def fFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PS(parser: Parser): FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PS = {
      val r = parser.parseFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PS()
      return r
    }
    val r = to(s, fFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PS _)
    return r
  }

  def fromFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container(o: FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container, isCompact: B): String = {
    val st = Printer.printFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container(s: String): Either[FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container, Json.ErrorMsg] = {
    def fFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container(parser: Parser): FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container = {
      val r = parser.parseFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container()
      return r
    }
    val r = to(s, fFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container _)
    return r
  }

  def fromFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_P(o: FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_P(s: String): Either[FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_P, Json.ErrorMsg] = {
    def fFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_P(parser: Parser): FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_P = {
      val r = parser.parseFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_P()
      return r
    }
    val r = to(s, fFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_P _)
    return r
  }

  def fromFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PS(o: FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PS(s: String): Either[FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PS, Json.ErrorMsg] = {
    def fFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PS(parser: Parser): FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PS = {
      val r = parser.parseFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PS()
      return r
    }
    val r = to(s, fFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PS _)
    return r
  }

  def fromFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container(o: FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container, isCompact: B): String = {
    val st = Printer.printFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container(s: String): Either[FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container, Json.ErrorMsg] = {
    def fFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container(parser: Parser): FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container = {
      val r = parser.parseFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container()
      return r
    }
    val r = to(s, fFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container _)
    return r
  }

  def fromFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_P(o: FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_P(s: String): Either[FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_P, Json.ErrorMsg] = {
    def fFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_P(parser: Parser): FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_P = {
      val r = parser.parseFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_P()
      return r
    }
    val r = to(s, fFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_P _)
    return r
  }

  def fromFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PS(o: FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PS(s: String): Either[FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PS, Json.ErrorMsg] = {
    def fFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PS(parser: Parser): FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PS = {
      val r = parser.parseFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PS()
      return r
    }
    val r = to(s, fFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PS _)
    return r
  }

  def fromFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container(o: FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container, isCompact: B): String = {
    val st = Printer.printFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container(s: String): Either[FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container, Json.ErrorMsg] = {
    def fFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container(parser: Parser): FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container = {
      val r = parser.parseFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container()
      return r
    }
    val r = to(s, fFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container _)
    return r
  }

  def fromFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_P(o: FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_P(s: String): Either[FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_P, Json.ErrorMsg] = {
    def fFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_P(parser: Parser): FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_P = {
      val r = parser.parseFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_P()
      return r
    }
    val r = to(s, fFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_P _)
    return r
  }

  def fromFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PS(o: FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PS(s: String): Either[FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PS, Json.ErrorMsg] = {
    def fFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PS(parser: Parser): FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PS = {
      val r = parser.parseFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PS()
      return r
    }
    val r = to(s, fFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PS _)
    return r
  }

  def fromFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container(o: FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container, isCompact: B): String = {
    val st = Printer.printFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container(s: String): Either[FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container, Json.ErrorMsg] = {
    def fFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container(parser: Parser): FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container = {
      val r = parser.parseFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container()
      return r
    }
    val r = to(s, fFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container _)
    return r
  }

  def fromFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_P(o: FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_P(s: String): Either[FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_P, Json.ErrorMsg] = {
    def fFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_P(parser: Parser): FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_P = {
      val r = parser.parseFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_P()
      return r
    }
    val r = to(s, fFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_P _)
    return r
  }

  def fromFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PS(o: FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PS(s: String): Either[FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PS, Json.ErrorMsg] = {
    def fFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PS(parser: Parser): FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PS = {
      val r = parser.parseFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PS()
      return r
    }
    val r = to(s, fFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PS _)
    return r
  }

  def fromFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container(o: FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container, isCompact: B): String = {
    val st = Printer.printFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container(s: String): Either[FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container, Json.ErrorMsg] = {
    def fFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container(parser: Parser): FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container = {
      val r = parser.parseFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container()
      return r
    }
    val r = to(s, fFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container _)
    return r
  }

  def fromFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_P(o: FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_P(s: String): Either[FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_P, Json.ErrorMsg] = {
    def fFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_P(parser: Parser): FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_P = {
      val r = parser.parseFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_P()
      return r
    }
    val r = to(s, fFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_P _)
    return r
  }

  def fromFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PS(o: FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PS(s: String): Either[FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PS, Json.ErrorMsg] = {
    def fFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PS(parser: Parser): FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PS = {
      val r = parser.parseFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PS()
      return r
    }
    val r = to(s, fFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PS _)
    return r
  }

  def fromFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container(o: FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container, isCompact: B): String = {
    val st = Printer.printFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container(s: String): Either[FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container, Json.ErrorMsg] = {
    def fFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container(parser: Parser): FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container = {
      val r = parser.parseFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container()
      return r
    }
    val r = to(s, fFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container _)
    return r
  }

  def fromFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_P(o: FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_P(s: String): Either[FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_P, Json.ErrorMsg] = {
    def fFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_P(parser: Parser): FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_P = {
      val r = parser.parseFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_P()
      return r
    }
    val r = to(s, fFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_P _)
    return r
  }

  def fromFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PS(o: FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PS(s: String): Either[FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PS, Json.ErrorMsg] = {
    def fFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PS(parser: Parser): FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PS = {
      val r = parser.parseFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PS()
      return r
    }
    val r = to(s, fFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PS _)
    return r
  }

  def fromFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container(o: FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container, isCompact: B): String = {
    val st = Printer.printFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container(s: String): Either[FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container, Json.ErrorMsg] = {
    def fFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container(parser: Parser): FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container = {
      val r = parser.parseFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container()
      return r
    }
    val r = to(s, fFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container _)
    return r
  }

  def fromFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_P(o: FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_P(s: String): Either[FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_P, Json.ErrorMsg] = {
    def fFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_P(parser: Parser): FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_P = {
      val r = parser.parseFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_P()
      return r
    }
    val r = to(s, fFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_P _)
    return r
  }

  def fromFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PS(o: FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PS(s: String): Either[FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PS, Json.ErrorMsg] = {
    def fFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PS(parser: Parser): FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PS = {
      val r = parser.parseFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PS()
      return r
    }
    val r = to(s, fFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PS _)
    return r
  }

  def fromFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container(o: FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container, isCompact: B): String = {
    val st = Printer.printFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container(s: String): Either[FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container, Json.ErrorMsg] = {
    def fFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container(parser: Parser): FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container = {
      val r = parser.parseFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container()
      return r
    }
    val r = to(s, fFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container _)
    return r
  }

  def fromFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_P(o: FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_P(s: String): Either[FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_P, Json.ErrorMsg] = {
    def fFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_P(parser: Parser): FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_P = {
      val r = parser.parseFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_P()
      return r
    }
    val r = to(s, fFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_P _)
    return r
  }

  def fromFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PS(o: FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PS(s: String): Either[FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PS, Json.ErrorMsg] = {
    def fFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PS(parser: Parser): FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PS = {
      val r = parser.parseFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PS()
      return r
    }
    val r = to(s, fFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PS _)
    return r
  }

  def fromFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container(o: FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container, isCompact: B): String = {
    val st = Printer.printFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container(s: String): Either[FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container, Json.ErrorMsg] = {
    def fFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container(parser: Parser): FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container = {
      val r = parser.parseFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container()
      return r
    }
    val r = to(s, fFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container _)
    return r
  }

  def fromFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_P(o: FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_P(s: String): Either[FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_P, Json.ErrorMsg] = {
    def fFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_P(parser: Parser): FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_P = {
      val r = parser.parseFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_P()
      return r
    }
    val r = to(s, fFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_P _)
    return r
  }

  def fromFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PS(o: FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PS(s: String): Either[FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PS, Json.ErrorMsg] = {
    def fFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PS(parser: Parser): FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PS = {
      val r = parser.parseFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PS()
      return r
    }
    val r = to(s, fFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PS _)
    return r
  }

  def fromFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container(o: FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container, isCompact: B): String = {
    val st = Printer.printFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container(s: String): Either[FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container, Json.ErrorMsg] = {
    def fFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container(parser: Parser): FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container = {
      val r = parser.parseFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container()
      return r
    }
    val r = to(s, fFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container _)
    return r
  }

  def fromFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_P(o: FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_P(s: String): Either[FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_P, Json.ErrorMsg] = {
    def fFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_P(parser: Parser): FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_P = {
      val r = parser.parseFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_P()
      return r
    }
    val r = to(s, fFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_P _)
    return r
  }

  def fromFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PS(o: FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PS(s: String): Either[FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PS, Json.ErrorMsg] = {
    def fFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PS(parser: Parser): FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PS = {
      val r = parser.parseFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PS()
      return r
    }
    val r = to(s, fFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PS _)
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