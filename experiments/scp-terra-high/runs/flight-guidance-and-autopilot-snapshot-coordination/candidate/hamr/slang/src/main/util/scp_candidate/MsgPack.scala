// #Sireum
// @formatter:off

// This file is auto-generated from Request_Value.scala, Input_Validity.scala, Qualified_Request.scala, Attitude_Data_Validity.scala, Attitude_Acceptability.scala, Reference_State.scala, AP_Availability.scala, Request_Indication.scala, FD_Indication.scala, FCS_Failed_Indication.scala, AP_Status.scala, AP_Enable.scala, Base_Types.scala, FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_Containers.scala, Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_Containers.scala, Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_Containers.scala, AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_Containers.scala, Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_Containers.scala, Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_Containers.scala, FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package scp_candidate

import org.sireum._

object MsgPack {

  object Constants {

    val FAA_FCS_CoordinationRequest_Value_Payload: Z = -32

    val FAA_FCS_CoordinationInput_Validity_Payload: Z = -31

    val FAA_FCS_CoordinationQualified_Request_Payload: Z = -30

    val FAA_FCS_CoordinationAttitude_Data_Validity_Payload: Z = -29

    val FAA_FCS_CoordinationAttitude_Acceptability_Payload: Z = -28

    val FAA_FCS_CoordinationReference_State_Payload: Z = -27

    val FAA_FCS_CoordinationAP_Availability_Payload: Z = -26

    val FAA_FCS_CoordinationRequest_Indication_Payload: Z = -25

    val FAA_FCS_CoordinationFD_Indication_Payload: Z = -24

    val FAA_FCS_CoordinationFCS_Failed_Indication_Payload: Z = -23

    val FAA_FCS_CoordinationAP_Status_Payload: Z = -22

    val FAA_FCS_CoordinationAP_Enable_Payload: Z = -21

    val Base_TypesBoolean_Payload: Z = -20

    val Base_TypesInteger_Payload: Z = -19

    val Base_TypesInteger_8_Payload: Z = -18

    val Base_TypesInteger_16_Payload: Z = -17

    val Base_TypesInteger_32_Payload: Z = -16

    val Base_TypesInteger_64_Payload: Z = -15

    val Base_TypesUnsigned_8_Payload: Z = -14

    val Base_TypesUnsigned_16_Payload: Z = -13

    val Base_TypesUnsigned_32_Payload: Z = -12

    val Base_TypesUnsigned_64_Payload: Z = -11

    val Base_TypesFloat_Payload: Z = -10

    val Base_TypesFloat_32_Payload: Z = -9

    val Base_TypesFloat_64_Payload: Z = -8

    val Base_TypesCharacter_Payload: Z = -7

    val Base_TypesString_Payload: Z = -6

    val Base_TypesBits_Payload: Z = -5

    val FAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_P: Z = -4

    val FAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PS: Z = -3

    val FAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_P: Z = -2

    val FAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PS: Z = -1

    val FAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_P: Z = 0

    val FAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PS: Z = 1

    val FAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_P: Z = 2

    val FAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PS: Z = 3

    val FAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_P: Z = 4

    val FAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PS: Z = 5

    val FAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_P: Z = 6

    val FAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PS: Z = 7

    val FAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_P: Z = 8

    val FAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PS: Z = 9

    val FAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_P: Z = 10

    val FAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PS: Z = 11

    val FAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_P: Z = 12

    val FAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PS: Z = 13

    val FAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_P: Z = 14

    val FAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PS: Z = 15

    val FAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_P: Z = 16

    val FAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PS: Z = 17

    val FAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_P: Z = 18

    val FAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PS: Z = 19

    val FAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_P: Z = 20

    val FAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PS: Z = 21

    val FAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_P: Z = 22

    val FAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PS: Z = 23

    val utilEmptyContainer: Z = 24

    val _artEmpty: Z = 25

  }

  object Writer {

    @record class Default(val writer: MessagePack.Writer.Impl) extends Writer

  }

  @msig trait Writer {

    def writer: MessagePack.Writer

    def writeFAA_FCS_CoordinationRequest_ValueType(o: FAA_FCS_Coordination.Request_Value.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFAA_FCS_CoordinationRequest_Value_Payload(o: FAA_FCS_Coordination.Request_Value_Payload): Unit = {
      writer.writeZ(Constants.FAA_FCS_CoordinationRequest_Value_Payload)
      writeFAA_FCS_CoordinationRequest_ValueType(o.value)
    }

    def writeFAA_FCS_CoordinationInput_ValidityType(o: FAA_FCS_Coordination.Input_Validity.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFAA_FCS_CoordinationInput_Validity_Payload(o: FAA_FCS_Coordination.Input_Validity_Payload): Unit = {
      writer.writeZ(Constants.FAA_FCS_CoordinationInput_Validity_Payload)
      writeFAA_FCS_CoordinationInput_ValidityType(o.value)
    }

    def writeFAA_FCS_CoordinationQualified_RequestType(o: FAA_FCS_Coordination.Qualified_Request.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFAA_FCS_CoordinationQualified_Request_Payload(o: FAA_FCS_Coordination.Qualified_Request_Payload): Unit = {
      writer.writeZ(Constants.FAA_FCS_CoordinationQualified_Request_Payload)
      writeFAA_FCS_CoordinationQualified_RequestType(o.value)
    }

    def writeFAA_FCS_CoordinationAttitude_Data_ValidityType(o: FAA_FCS_Coordination.Attitude_Data_Validity.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFAA_FCS_CoordinationAttitude_Data_Validity_Payload(o: FAA_FCS_Coordination.Attitude_Data_Validity_Payload): Unit = {
      writer.writeZ(Constants.FAA_FCS_CoordinationAttitude_Data_Validity_Payload)
      writeFAA_FCS_CoordinationAttitude_Data_ValidityType(o.value)
    }

    def writeFAA_FCS_CoordinationAttitude_AcceptabilityType(o: FAA_FCS_Coordination.Attitude_Acceptability.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFAA_FCS_CoordinationAttitude_Acceptability_Payload(o: FAA_FCS_Coordination.Attitude_Acceptability_Payload): Unit = {
      writer.writeZ(Constants.FAA_FCS_CoordinationAttitude_Acceptability_Payload)
      writeFAA_FCS_CoordinationAttitude_AcceptabilityType(o.value)
    }

    def writeFAA_FCS_CoordinationReference_StateType(o: FAA_FCS_Coordination.Reference_State.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFAA_FCS_CoordinationReference_State_Payload(o: FAA_FCS_Coordination.Reference_State_Payload): Unit = {
      writer.writeZ(Constants.FAA_FCS_CoordinationReference_State_Payload)
      writeFAA_FCS_CoordinationReference_StateType(o.value)
    }

    def writeFAA_FCS_CoordinationAP_AvailabilityType(o: FAA_FCS_Coordination.AP_Availability.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFAA_FCS_CoordinationAP_Availability_Payload(o: FAA_FCS_Coordination.AP_Availability_Payload): Unit = {
      writer.writeZ(Constants.FAA_FCS_CoordinationAP_Availability_Payload)
      writeFAA_FCS_CoordinationAP_AvailabilityType(o.value)
    }

    def writeFAA_FCS_CoordinationRequest_IndicationType(o: FAA_FCS_Coordination.Request_Indication.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFAA_FCS_CoordinationRequest_Indication_Payload(o: FAA_FCS_Coordination.Request_Indication_Payload): Unit = {
      writer.writeZ(Constants.FAA_FCS_CoordinationRequest_Indication_Payload)
      writeFAA_FCS_CoordinationRequest_IndicationType(o.value)
    }

    def writeFAA_FCS_CoordinationFD_IndicationType(o: FAA_FCS_Coordination.FD_Indication.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFAA_FCS_CoordinationFD_Indication_Payload(o: FAA_FCS_Coordination.FD_Indication_Payload): Unit = {
      writer.writeZ(Constants.FAA_FCS_CoordinationFD_Indication_Payload)
      writeFAA_FCS_CoordinationFD_IndicationType(o.value)
    }

    def writeFAA_FCS_CoordinationFCS_Failed_IndicationType(o: FAA_FCS_Coordination.FCS_Failed_Indication.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFAA_FCS_CoordinationFCS_Failed_Indication_Payload(o: FAA_FCS_Coordination.FCS_Failed_Indication_Payload): Unit = {
      writer.writeZ(Constants.FAA_FCS_CoordinationFCS_Failed_Indication_Payload)
      writeFAA_FCS_CoordinationFCS_Failed_IndicationType(o.value)
    }

    def writeFAA_FCS_CoordinationAP_StatusType(o: FAA_FCS_Coordination.AP_Status.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFAA_FCS_CoordinationAP_Status_Payload(o: FAA_FCS_Coordination.AP_Status_Payload): Unit = {
      writer.writeZ(Constants.FAA_FCS_CoordinationAP_Status_Payload)
      writeFAA_FCS_CoordinationAP_StatusType(o.value)
    }

    def writeFAA_FCS_CoordinationAP_EnableType(o: FAA_FCS_Coordination.AP_Enable.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFAA_FCS_CoordinationAP_Enable_Payload(o: FAA_FCS_Coordination.AP_Enable_Payload): Unit = {
      writer.writeZ(Constants.FAA_FCS_CoordinationAP_Enable_Payload)
      writeFAA_FCS_CoordinationAP_EnableType(o.value)
    }

    def writeBase_TypesBoolean_Payload(o: Base_Types.Boolean_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesBoolean_Payload)
      writer.writeB(o.value)
    }

    def writeBase_TypesInteger_Payload(o: Base_Types.Integer_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesInteger_Payload)
      writer.writeZ(o.value)
    }

    def writeBase_TypesInteger_8_Payload(o: Base_Types.Integer_8_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesInteger_8_Payload)
      writer.writeS8(o.value)
    }

    def writeBase_TypesInteger_16_Payload(o: Base_Types.Integer_16_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesInteger_16_Payload)
      writer.writeS16(o.value)
    }

    def writeBase_TypesInteger_32_Payload(o: Base_Types.Integer_32_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesInteger_32_Payload)
      writer.writeS32(o.value)
    }

    def writeBase_TypesInteger_64_Payload(o: Base_Types.Integer_64_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesInteger_64_Payload)
      writer.writeS64(o.value)
    }

    def writeBase_TypesUnsigned_8_Payload(o: Base_Types.Unsigned_8_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesUnsigned_8_Payload)
      writer.writeU8(o.value)
    }

    def writeBase_TypesUnsigned_16_Payload(o: Base_Types.Unsigned_16_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesUnsigned_16_Payload)
      writer.writeU16(o.value)
    }

    def writeBase_TypesUnsigned_32_Payload(o: Base_Types.Unsigned_32_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesUnsigned_32_Payload)
      writer.writeU32(o.value)
    }

    def writeBase_TypesUnsigned_64_Payload(o: Base_Types.Unsigned_64_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesUnsigned_64_Payload)
      writer.writeU64(o.value)
    }

    def writeBase_TypesFloat_Payload(o: Base_Types.Float_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesFloat_Payload)
      writer.writeR(o.value)
    }

    def writeBase_TypesFloat_32_Payload(o: Base_Types.Float_32_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesFloat_32_Payload)
      writer.writeF32(o.value)
    }

    def writeBase_TypesFloat_64_Payload(o: Base_Types.Float_64_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesFloat_64_Payload)
      writer.writeF64(o.value)
    }

    def writeBase_TypesCharacter_Payload(o: Base_Types.Character_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesCharacter_Payload)
      writer.writeC(o.value)
    }

    def writeBase_TypesString_Payload(o: Base_Types.String_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesString_Payload)
      writer.writeString(o.value)
    }

    def writeBase_TypesBits_Payload(o: Base_Types.Bits_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesBits_Payload)
      writer.writeISZ(o.value, writer.writeB _)
    }

    def writeFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container(o: FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container): Unit = {
      o match {
        case o: FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_P => writeFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_P(o)
        case o: FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PS => writeFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PS(o)
      }
    }

    def writeFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_P(o: FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_P): Unit = {
      writer.writeZ(Constants.FAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_P)
      writeFAA_FCS_CoordinationRequest_ValueType(o.api_display_fd_request_in)
      writeFAA_FCS_CoordinationInput_ValidityType(o.api_display_fd_validity_in)
      writeFAA_FCS_CoordinationRequest_ValueType(o.api_engage_ap_request_in)
      writeFAA_FCS_CoordinationInput_ValidityType(o.api_engage_ap_validity_in)
      writeFAA_FCS_CoordinationRequest_ValueType(o.api_sync_fd_request_in)
      writeFAA_FCS_CoordinationInput_ValidityType(o.api_sync_fd_validity_in)
    }

    def writeFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PS(o: FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.FAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PS)
      writeFAA_FCS_CoordinationRequest_ValueType(o.api_display_fd_request_in)
      writeFAA_FCS_CoordinationInput_ValidityType(o.api_display_fd_validity_in)
      writeFAA_FCS_CoordinationRequest_ValueType(o.api_engage_ap_request_in)
      writeFAA_FCS_CoordinationInput_ValidityType(o.api_engage_ap_validity_in)
      writeFAA_FCS_CoordinationRequest_ValueType(o.api_sync_fd_request_in)
      writeFAA_FCS_CoordinationInput_ValidityType(o.api_sync_fd_validity_in)
    }

    def writeFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container(o: FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container): Unit = {
      o match {
        case o: FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_P => writeFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_P(o)
        case o: FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PS => writeFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PS(o)
      }
    }

    def writeFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_P(o: FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_P): Unit = {
      writer.writeZ(Constants.FAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_P)
      writeFAA_FCS_CoordinationQualified_RequestType(o.api_qualified_display_request)
      writeFAA_FCS_CoordinationQualified_RequestType(o.api_qualified_engage_request)
      writeFAA_FCS_CoordinationQualified_RequestType(o.api_qualified_sync_request)
    }

    def writeFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PS(o: FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.FAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PS)
      writeFAA_FCS_CoordinationQualified_RequestType(o.api_qualified_display_request)
      writeFAA_FCS_CoordinationQualified_RequestType(o.api_qualified_engage_request)
      writeFAA_FCS_CoordinationQualified_RequestType(o.api_qualified_sync_request)
    }

    def writeFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container(o: FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container): Unit = {
      o match {
        case o: FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_P => writeFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_P(o)
        case o: FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PS => writeFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PS(o)
      }
    }

    def writeFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_P(o: FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_P): Unit = {
      writer.writeZ(Constants.FAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_P)
      writeFAA_FCS_CoordinationAttitude_AcceptabilityType(o.api_attitude_acceptable_in)
      writeFAA_FCS_CoordinationAttitude_Data_ValidityType(o.api_attitude_data_in)
    }

    def writeFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PS(o: FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.FAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PS)
      writeFAA_FCS_CoordinationAttitude_AcceptabilityType(o.api_attitude_acceptable_in)
      writeFAA_FCS_CoordinationAttitude_Data_ValidityType(o.api_attitude_data_in)
    }

    def writeFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container(o: FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container): Unit = {
      o match {
        case o: FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_P => writeFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_P(o)
        case o: FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PS => writeFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PS(o)
      }
    }

    def writeFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_P(o: FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_P): Unit = {
      writer.writeZ(Constants.FAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_P)
      writeFAA_FCS_CoordinationAttitude_AcceptabilityType(o.api_attitude_acceptable_out)
      writeFAA_FCS_CoordinationAttitude_Data_ValidityType(o.api_attitude_data_out)
    }

    def writeFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PS(o: FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.FAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PS)
      writeFAA_FCS_CoordinationAttitude_AcceptabilityType(o.api_attitude_acceptable_out)
      writeFAA_FCS_CoordinationAttitude_Data_ValidityType(o.api_attitude_data_out)
    }

    def writeFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container(o: FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container): Unit = {
      o match {
        case o: FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_P => writeFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_P(o)
        case o: FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PS => writeFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PS(o)
      }
    }

    def writeFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_P(o: FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_P): Unit = {
      writer.writeZ(Constants.FAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_P)
      writeFAA_FCS_CoordinationReference_StateType(o.api_reference_state_in)
    }

    def writeFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PS(o: FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.FAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PS)
      writeFAA_FCS_CoordinationReference_StateType(o.api_reference_state_in)
    }

    def writeFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container(o: FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container): Unit = {
      o match {
        case o: FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_P => writeFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_P(o)
        case o: FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PS => writeFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PS(o)
      }
    }

    def writeFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_P(o: FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_P): Unit = {
      writer.writeZ(Constants.FAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_P)
      writeFAA_FCS_CoordinationReference_StateType(o.api_reference_state_out)
    }

    def writeFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PS(o: FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.FAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PS)
      writeFAA_FCS_CoordinationReference_StateType(o.api_reference_state_out)
    }

    def writeFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container(o: FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container): Unit = {
      o match {
        case o: FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_P => writeFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_P(o)
        case o: FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PS => writeFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PS(o)
      }
    }

    def writeFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_P(o: FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_P): Unit = {
      writer.writeZ(Constants.FAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_P)
      writeFAA_FCS_CoordinationAP_AvailabilityType(o.api_ap_availability_in)
    }

    def writeFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PS(o: FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.FAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PS)
      writeFAA_FCS_CoordinationAP_AvailabilityType(o.api_ap_availability_in)
    }

    def writeFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container(o: FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container): Unit = {
      o match {
        case o: FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_P => writeFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_P(o)
        case o: FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PS => writeFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PS(o)
      }
    }

    def writeFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_P(o: FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_P): Unit = {
      writer.writeZ(Constants.FAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_P)
      writeFAA_FCS_CoordinationAP_AvailabilityType(o.api_ap_availability_out)
    }

    def writeFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PS(o: FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.FAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PS)
      writeFAA_FCS_CoordinationAP_AvailabilityType(o.api_ap_availability_out)
    }

    def writeFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container(o: FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container): Unit = {
      o match {
        case o: FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_P => writeFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_P(o)
        case o: FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PS => writeFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PS(o)
      }
    }

    def writeFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_P(o: FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_P): Unit = {
      writer.writeZ(Constants.FAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_P)
      writeFAA_FCS_CoordinationAttitude_AcceptabilityType(o.api_attitude_acceptable)
      writeFAA_FCS_CoordinationAttitude_Data_ValidityType(o.api_attitude_data)
      writeFAA_FCS_CoordinationQualified_RequestType(o.api_qualified_display_request)
      writeFAA_FCS_CoordinationQualified_RequestType(o.api_qualified_sync_request)
      writeFAA_FCS_CoordinationReference_StateType(o.api_reference_state)
      writeFAA_FCS_CoordinationRequest_IndicationType(o.api_reference_sync_trigger)
    }

    def writeFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PS(o: FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.FAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PS)
      writeFAA_FCS_CoordinationAttitude_AcceptabilityType(o.api_attitude_acceptable)
      writeFAA_FCS_CoordinationAttitude_Data_ValidityType(o.api_attitude_data)
      writeFAA_FCS_CoordinationQualified_RequestType(o.api_qualified_display_request)
      writeFAA_FCS_CoordinationQualified_RequestType(o.api_qualified_sync_request)
      writeFAA_FCS_CoordinationReference_StateType(o.api_reference_state)
      writeFAA_FCS_CoordinationRequest_IndicationType(o.api_reference_sync_trigger)
    }

    def writeFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container(o: FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container): Unit = {
      o match {
        case o: FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_P => writeFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_P(o)
        case o: FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PS => writeFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PS(o)
      }
    }

    def writeFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_P(o: FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_P): Unit = {
      writer.writeZ(Constants.FAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_P)
      writeFAA_FCS_CoordinationFCS_Failed_IndicationType(o.api_fcs_failed)
      writeFAA_FCS_CoordinationFD_IndicationType(o.api_fd_on)
      writeFAA_FCS_CoordinationRequest_IndicationType(o.api_reference_sync_request)
    }

    def writeFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PS(o: FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.FAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PS)
      writeFAA_FCS_CoordinationFCS_Failed_IndicationType(o.api_fcs_failed)
      writeFAA_FCS_CoordinationFD_IndicationType(o.api_fd_on)
      writeFAA_FCS_CoordinationRequest_IndicationType(o.api_reference_sync_request)
    }

    def writeFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container(o: FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container): Unit = {
      o match {
        case o: FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_P => writeFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_P(o)
        case o: FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PS => writeFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PS(o)
      }
    }

    def writeFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_P(o: FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_P): Unit = {
      writer.writeZ(Constants.FAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_P)
      writeFAA_FCS_CoordinationAP_AvailabilityType(o.api_ap_availability)
      writeFAA_FCS_CoordinationAttitude_AcceptabilityType(o.api_attitude_acceptable)
      writeFAA_FCS_CoordinationAttitude_Data_ValidityType(o.api_attitude_data)
      writeFAA_FCS_CoordinationFD_IndicationType(o.api_fd_on)
      writeFAA_FCS_CoordinationQualified_RequestType(o.api_qualified_engage_request)
      writeFAA_FCS_CoordinationReference_StateType(o.api_reference_state)
    }

    def writeFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PS(o: FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.FAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PS)
      writeFAA_FCS_CoordinationAP_AvailabilityType(o.api_ap_availability)
      writeFAA_FCS_CoordinationAttitude_AcceptabilityType(o.api_attitude_acceptable)
      writeFAA_FCS_CoordinationAttitude_Data_ValidityType(o.api_attitude_data)
      writeFAA_FCS_CoordinationFD_IndicationType(o.api_fd_on)
      writeFAA_FCS_CoordinationQualified_RequestType(o.api_qualified_engage_request)
      writeFAA_FCS_CoordinationReference_StateType(o.api_reference_state)
    }

    def writeFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container(o: FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container): Unit = {
      o match {
        case o: FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_P => writeFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_P(o)
        case o: FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PS => writeFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PS(o)
      }
    }

    def writeFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_P(o: FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_P): Unit = {
      writer.writeZ(Constants.FAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_P)
      writeFAA_FCS_CoordinationRequest_IndicationType(o.api_ap_guidance_request)
      writeFAA_FCS_CoordinationAP_EnableType(o.api_ap_on)
      writeFAA_FCS_CoordinationAP_StatusType(o.api_ap_status)
      writeFAA_FCS_CoordinationRequest_IndicationType(o.api_reference_sync_trigger)
    }

    def writeFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PS(o: FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.FAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PS)
      writeFAA_FCS_CoordinationRequest_IndicationType(o.api_ap_guidance_request)
      writeFAA_FCS_CoordinationAP_EnableType(o.api_ap_on)
      writeFAA_FCS_CoordinationAP_StatusType(o.api_ap_status)
      writeFAA_FCS_CoordinationRequest_IndicationType(o.api_reference_sync_trigger)
    }

    def writeFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container(o: FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container): Unit = {
      o match {
        case o: FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_P => writeFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_P(o)
        case o: FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PS => writeFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PS(o)
      }
    }

    def writeFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_P(o: FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_P): Unit = {
      writer.writeZ(Constants.FAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_P)
      writeFAA_FCS_CoordinationRequest_IndicationType(o.api_ap_guidance_request_in)
      writeFAA_FCS_CoordinationAP_EnableType(o.api_ap_on_in)
      writeFAA_FCS_CoordinationAP_StatusType(o.api_ap_status_in)
      writeFAA_FCS_CoordinationFCS_Failed_IndicationType(o.api_fcs_failed_in)
      writeFAA_FCS_CoordinationFD_IndicationType(o.api_fd_on_in)
      writeFAA_FCS_CoordinationRequest_IndicationType(o.api_reference_sync_request_in)
    }

    def writeFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PS(o: FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.FAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PS)
      writeFAA_FCS_CoordinationRequest_IndicationType(o.api_ap_guidance_request_in)
      writeFAA_FCS_CoordinationAP_EnableType(o.api_ap_on_in)
      writeFAA_FCS_CoordinationAP_StatusType(o.api_ap_status_in)
      writeFAA_FCS_CoordinationFCS_Failed_IndicationType(o.api_fcs_failed_in)
      writeFAA_FCS_CoordinationFD_IndicationType(o.api_fd_on_in)
      writeFAA_FCS_CoordinationRequest_IndicationType(o.api_reference_sync_request_in)
    }

    def writeFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container(o: FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container): Unit = {
      o match {
        case o: FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_P => writeFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_P(o)
        case o: FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PS => writeFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PS(o)
      }
    }

    def writeFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_P(o: FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_P): Unit = {
      writer.writeZ(Constants.FAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_P)
      writeFAA_FCS_CoordinationRequest_IndicationType(o.api_ap_guidance_request_out)
      writeFAA_FCS_CoordinationAP_EnableType(o.api_ap_on_out)
      writeFAA_FCS_CoordinationAP_StatusType(o.api_ap_status_out)
      writeFAA_FCS_CoordinationFCS_Failed_IndicationType(o.api_fcs_failed_out)
      writeFAA_FCS_CoordinationFD_IndicationType(o.api_fd_on_out)
      writeFAA_FCS_CoordinationRequest_IndicationType(o.api_reference_sync_request_out)
    }

    def writeFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PS(o: FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.FAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PS)
      writeFAA_FCS_CoordinationRequest_IndicationType(o.api_ap_guidance_request_out)
      writeFAA_FCS_CoordinationAP_EnableType(o.api_ap_on_out)
      writeFAA_FCS_CoordinationAP_StatusType(o.api_ap_status_out)
      writeFAA_FCS_CoordinationFCS_Failed_IndicationType(o.api_fcs_failed_out)
      writeFAA_FCS_CoordinationFD_IndicationType(o.api_fd_on_out)
      writeFAA_FCS_CoordinationRequest_IndicationType(o.api_reference_sync_request_out)
    }

    def writeruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeutilContainer(o: util.Container): Unit = {
      o match {
        case o: util.EmptyContainer => writeutilEmptyContainer(o)
        case o: FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_P => writeFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_P(o)
        case o: FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PS => writeFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PS(o)
        case o: FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_P => writeFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_P(o)
        case o: FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PS => writeFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PS(o)
        case o: FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_P => writeFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_P(o)
        case o: FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_P => writeFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_P(o)
        case o: FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PS => writeFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PS(o)
        case o: FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PS => writeFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PS(o)
        case o: FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_P => writeFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_P(o)
        case o: FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_P => writeFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_P(o)
        case o: FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_P => writeFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_P(o)
        case o: FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PS => writeFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PS(o)
        case o: FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PS => writeFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PS(o)
        case o: FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PS => writeFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PS(o)
        case o: FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_P => writeFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_P(o)
        case o: FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PS => writeFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PS(o)
        case o: FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_P => writeFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_P(o)
        case o: FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PS => writeFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PS(o)
        case o: FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_P => writeFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_P(o)
        case o: FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PS => writeFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PS(o)
        case o: FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_P => writeFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_P(o)
        case o: FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PS => writeFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PS(o)
        case o: FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_P => writeFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_P(o)
        case o: FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PS => writeFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PS(o)
        case o: FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_P => writeFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_P(o)
        case o: FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PS => writeFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PS(o)
        case o: FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_P => writeFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_P(o)
        case o: FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PS => writeFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PS(o)
      }
    }

    def writeutilEmptyContainer(o: util.EmptyContainer): Unit = {
      writer.writeZ(Constants.utilEmptyContainer)
    }

    def write_artDataContent(o: art.DataContent): Unit = {
      o match {
        case o: art.Empty => write_artEmpty(o)
        case o: Base_Types.Boolean_Payload => writeBase_TypesBoolean_Payload(o)
        case o: Base_Types.Integer_Payload => writeBase_TypesInteger_Payload(o)
        case o: Base_Types.Integer_8_Payload => writeBase_TypesInteger_8_Payload(o)
        case o: Base_Types.Integer_16_Payload => writeBase_TypesInteger_16_Payload(o)
        case o: Base_Types.Integer_32_Payload => writeBase_TypesInteger_32_Payload(o)
        case o: Base_Types.Integer_64_Payload => writeBase_TypesInteger_64_Payload(o)
        case o: Base_Types.Unsigned_8_Payload => writeBase_TypesUnsigned_8_Payload(o)
        case o: Base_Types.Unsigned_16_Payload => writeBase_TypesUnsigned_16_Payload(o)
        case o: Base_Types.Unsigned_32_Payload => writeBase_TypesUnsigned_32_Payload(o)
        case o: Base_Types.Unsigned_64_Payload => writeBase_TypesUnsigned_64_Payload(o)
        case o: Base_Types.Float_Payload => writeBase_TypesFloat_Payload(o)
        case o: Base_Types.Float_32_Payload => writeBase_TypesFloat_32_Payload(o)
        case o: Base_Types.Float_64_Payload => writeBase_TypesFloat_64_Payload(o)
        case o: Base_Types.Character_Payload => writeBase_TypesCharacter_Payload(o)
        case o: Base_Types.String_Payload => writeBase_TypesString_Payload(o)
        case o: Base_Types.Bits_Payload => writeBase_TypesBits_Payload(o)
        case o: util.EmptyContainer => writeutilEmptyContainer(o)
        case o: FAA_FCS_Coordination.AP_Status_Payload => writeFAA_FCS_CoordinationAP_Status_Payload(o)
        case o: FAA_FCS_Coordination.AP_Enable_Payload => writeFAA_FCS_CoordinationAP_Enable_Payload(o)
        case o: FAA_FCS_Coordination.FD_Indication_Payload => writeFAA_FCS_CoordinationFD_Indication_Payload(o)
        case o: FAA_FCS_Coordination.Request_Value_Payload => writeFAA_FCS_CoordinationRequest_Value_Payload(o)
        case o: FAA_FCS_Coordination.Input_Validity_Payload => writeFAA_FCS_CoordinationInput_Validity_Payload(o)
        case o: FAA_FCS_Coordination.AP_Availability_Payload => writeFAA_FCS_CoordinationAP_Availability_Payload(o)
        case o: FAA_FCS_Coordination.Reference_State_Payload => writeFAA_FCS_CoordinationReference_State_Payload(o)
        case o: FAA_FCS_Coordination.Qualified_Request_Payload => writeFAA_FCS_CoordinationQualified_Request_Payload(o)
        case o: FAA_FCS_Coordination.Request_Indication_Payload => writeFAA_FCS_CoordinationRequest_Indication_Payload(o)
        case o: FAA_FCS_Coordination.FCS_Failed_Indication_Payload => writeFAA_FCS_CoordinationFCS_Failed_Indication_Payload(o)
        case o: FAA_FCS_Coordination.Attitude_Data_Validity_Payload => writeFAA_FCS_CoordinationAttitude_Data_Validity_Payload(o)
        case o: FAA_FCS_Coordination.Attitude_Acceptability_Payload => writeFAA_FCS_CoordinationAttitude_Acceptability_Payload(o)
        case o: FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_P => writeFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_P(o)
        case o: FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PS => writeFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PS(o)
        case o: FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_P => writeFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_P(o)
        case o: FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PS => writeFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PS(o)
        case o: FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_P => writeFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_P(o)
        case o: FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_P => writeFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_P(o)
        case o: FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PS => writeFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PS(o)
        case o: FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PS => writeFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PS(o)
        case o: FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_P => writeFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_P(o)
        case o: FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_P => writeFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_P(o)
        case o: FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_P => writeFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_P(o)
        case o: FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PS => writeFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PS(o)
        case o: FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PS => writeFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PS(o)
        case o: FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PS => writeFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PS(o)
        case o: FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_P => writeFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_P(o)
        case o: FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PS => writeFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PS(o)
        case o: FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_P => writeFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_P(o)
        case o: FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PS => writeFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PS(o)
        case o: FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_P => writeFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_P(o)
        case o: FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PS => writeFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PS(o)
        case o: FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_P => writeFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_P(o)
        case o: FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PS => writeFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PS(o)
        case o: FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_P => writeFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_P(o)
        case o: FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PS => writeFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PS(o)
        case o: FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_P => writeFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_P(o)
        case o: FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PS => writeFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PS(o)
        case o: FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_P => writeFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_P(o)
        case o: FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PS => writeFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PS(o)
      }
    }

    def write_artEmpty(o: art.Empty): Unit = {
      writer.writeZ(Constants._artEmpty)
    }

    def result: ISZ[U8] = {
      return writer.result
    }

  }

  object Reader {

    @record class Default(val reader: MessagePack.Reader.Impl) extends Reader {
      def errorOpt: Option[MessagePack.ErrorMsg] = {
        return reader.errorOpt
      }
    }

  }

  @msig trait Reader {

    def reader: MessagePack.Reader

    def readFAA_FCS_CoordinationRequest_ValueType(): FAA_FCS_Coordination.Request_Value.Type = {
      val r = reader.readZ()
      return FAA_FCS_Coordination.Request_Value.byOrdinal(r).get
    }

    def readFAA_FCS_CoordinationRequest_Value_Payload(): FAA_FCS_Coordination.Request_Value_Payload = {
      val r = readFAA_FCS_CoordinationRequest_Value_PayloadT(F)
      return r
    }

    def readFAA_FCS_CoordinationRequest_Value_PayloadT(typeParsed: B): FAA_FCS_Coordination.Request_Value_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.FAA_FCS_CoordinationRequest_Value_Payload)
      }
      val value = readFAA_FCS_CoordinationRequest_ValueType()
      return FAA_FCS_Coordination.Request_Value_Payload(value)
    }

    def readFAA_FCS_CoordinationInput_ValidityType(): FAA_FCS_Coordination.Input_Validity.Type = {
      val r = reader.readZ()
      return FAA_FCS_Coordination.Input_Validity.byOrdinal(r).get
    }

    def readFAA_FCS_CoordinationInput_Validity_Payload(): FAA_FCS_Coordination.Input_Validity_Payload = {
      val r = readFAA_FCS_CoordinationInput_Validity_PayloadT(F)
      return r
    }

    def readFAA_FCS_CoordinationInput_Validity_PayloadT(typeParsed: B): FAA_FCS_Coordination.Input_Validity_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.FAA_FCS_CoordinationInput_Validity_Payload)
      }
      val value = readFAA_FCS_CoordinationInput_ValidityType()
      return FAA_FCS_Coordination.Input_Validity_Payload(value)
    }

    def readFAA_FCS_CoordinationQualified_RequestType(): FAA_FCS_Coordination.Qualified_Request.Type = {
      val r = reader.readZ()
      return FAA_FCS_Coordination.Qualified_Request.byOrdinal(r).get
    }

    def readFAA_FCS_CoordinationQualified_Request_Payload(): FAA_FCS_Coordination.Qualified_Request_Payload = {
      val r = readFAA_FCS_CoordinationQualified_Request_PayloadT(F)
      return r
    }

    def readFAA_FCS_CoordinationQualified_Request_PayloadT(typeParsed: B): FAA_FCS_Coordination.Qualified_Request_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.FAA_FCS_CoordinationQualified_Request_Payload)
      }
      val value = readFAA_FCS_CoordinationQualified_RequestType()
      return FAA_FCS_Coordination.Qualified_Request_Payload(value)
    }

    def readFAA_FCS_CoordinationAttitude_Data_ValidityType(): FAA_FCS_Coordination.Attitude_Data_Validity.Type = {
      val r = reader.readZ()
      return FAA_FCS_Coordination.Attitude_Data_Validity.byOrdinal(r).get
    }

    def readFAA_FCS_CoordinationAttitude_Data_Validity_Payload(): FAA_FCS_Coordination.Attitude_Data_Validity_Payload = {
      val r = readFAA_FCS_CoordinationAttitude_Data_Validity_PayloadT(F)
      return r
    }

    def readFAA_FCS_CoordinationAttitude_Data_Validity_PayloadT(typeParsed: B): FAA_FCS_Coordination.Attitude_Data_Validity_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.FAA_FCS_CoordinationAttitude_Data_Validity_Payload)
      }
      val value = readFAA_FCS_CoordinationAttitude_Data_ValidityType()
      return FAA_FCS_Coordination.Attitude_Data_Validity_Payload(value)
    }

    def readFAA_FCS_CoordinationAttitude_AcceptabilityType(): FAA_FCS_Coordination.Attitude_Acceptability.Type = {
      val r = reader.readZ()
      return FAA_FCS_Coordination.Attitude_Acceptability.byOrdinal(r).get
    }

    def readFAA_FCS_CoordinationAttitude_Acceptability_Payload(): FAA_FCS_Coordination.Attitude_Acceptability_Payload = {
      val r = readFAA_FCS_CoordinationAttitude_Acceptability_PayloadT(F)
      return r
    }

    def readFAA_FCS_CoordinationAttitude_Acceptability_PayloadT(typeParsed: B): FAA_FCS_Coordination.Attitude_Acceptability_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.FAA_FCS_CoordinationAttitude_Acceptability_Payload)
      }
      val value = readFAA_FCS_CoordinationAttitude_AcceptabilityType()
      return FAA_FCS_Coordination.Attitude_Acceptability_Payload(value)
    }

    def readFAA_FCS_CoordinationReference_StateType(): FAA_FCS_Coordination.Reference_State.Type = {
      val r = reader.readZ()
      return FAA_FCS_Coordination.Reference_State.byOrdinal(r).get
    }

    def readFAA_FCS_CoordinationReference_State_Payload(): FAA_FCS_Coordination.Reference_State_Payload = {
      val r = readFAA_FCS_CoordinationReference_State_PayloadT(F)
      return r
    }

    def readFAA_FCS_CoordinationReference_State_PayloadT(typeParsed: B): FAA_FCS_Coordination.Reference_State_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.FAA_FCS_CoordinationReference_State_Payload)
      }
      val value = readFAA_FCS_CoordinationReference_StateType()
      return FAA_FCS_Coordination.Reference_State_Payload(value)
    }

    def readFAA_FCS_CoordinationAP_AvailabilityType(): FAA_FCS_Coordination.AP_Availability.Type = {
      val r = reader.readZ()
      return FAA_FCS_Coordination.AP_Availability.byOrdinal(r).get
    }

    def readFAA_FCS_CoordinationAP_Availability_Payload(): FAA_FCS_Coordination.AP_Availability_Payload = {
      val r = readFAA_FCS_CoordinationAP_Availability_PayloadT(F)
      return r
    }

    def readFAA_FCS_CoordinationAP_Availability_PayloadT(typeParsed: B): FAA_FCS_Coordination.AP_Availability_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.FAA_FCS_CoordinationAP_Availability_Payload)
      }
      val value = readFAA_FCS_CoordinationAP_AvailabilityType()
      return FAA_FCS_Coordination.AP_Availability_Payload(value)
    }

    def readFAA_FCS_CoordinationRequest_IndicationType(): FAA_FCS_Coordination.Request_Indication.Type = {
      val r = reader.readZ()
      return FAA_FCS_Coordination.Request_Indication.byOrdinal(r).get
    }

    def readFAA_FCS_CoordinationRequest_Indication_Payload(): FAA_FCS_Coordination.Request_Indication_Payload = {
      val r = readFAA_FCS_CoordinationRequest_Indication_PayloadT(F)
      return r
    }

    def readFAA_FCS_CoordinationRequest_Indication_PayloadT(typeParsed: B): FAA_FCS_Coordination.Request_Indication_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.FAA_FCS_CoordinationRequest_Indication_Payload)
      }
      val value = readFAA_FCS_CoordinationRequest_IndicationType()
      return FAA_FCS_Coordination.Request_Indication_Payload(value)
    }

    def readFAA_FCS_CoordinationFD_IndicationType(): FAA_FCS_Coordination.FD_Indication.Type = {
      val r = reader.readZ()
      return FAA_FCS_Coordination.FD_Indication.byOrdinal(r).get
    }

    def readFAA_FCS_CoordinationFD_Indication_Payload(): FAA_FCS_Coordination.FD_Indication_Payload = {
      val r = readFAA_FCS_CoordinationFD_Indication_PayloadT(F)
      return r
    }

    def readFAA_FCS_CoordinationFD_Indication_PayloadT(typeParsed: B): FAA_FCS_Coordination.FD_Indication_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.FAA_FCS_CoordinationFD_Indication_Payload)
      }
      val value = readFAA_FCS_CoordinationFD_IndicationType()
      return FAA_FCS_Coordination.FD_Indication_Payload(value)
    }

    def readFAA_FCS_CoordinationFCS_Failed_IndicationType(): FAA_FCS_Coordination.FCS_Failed_Indication.Type = {
      val r = reader.readZ()
      return FAA_FCS_Coordination.FCS_Failed_Indication.byOrdinal(r).get
    }

    def readFAA_FCS_CoordinationFCS_Failed_Indication_Payload(): FAA_FCS_Coordination.FCS_Failed_Indication_Payload = {
      val r = readFAA_FCS_CoordinationFCS_Failed_Indication_PayloadT(F)
      return r
    }

    def readFAA_FCS_CoordinationFCS_Failed_Indication_PayloadT(typeParsed: B): FAA_FCS_Coordination.FCS_Failed_Indication_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.FAA_FCS_CoordinationFCS_Failed_Indication_Payload)
      }
      val value = readFAA_FCS_CoordinationFCS_Failed_IndicationType()
      return FAA_FCS_Coordination.FCS_Failed_Indication_Payload(value)
    }

    def readFAA_FCS_CoordinationAP_StatusType(): FAA_FCS_Coordination.AP_Status.Type = {
      val r = reader.readZ()
      return FAA_FCS_Coordination.AP_Status.byOrdinal(r).get
    }

    def readFAA_FCS_CoordinationAP_Status_Payload(): FAA_FCS_Coordination.AP_Status_Payload = {
      val r = readFAA_FCS_CoordinationAP_Status_PayloadT(F)
      return r
    }

    def readFAA_FCS_CoordinationAP_Status_PayloadT(typeParsed: B): FAA_FCS_Coordination.AP_Status_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.FAA_FCS_CoordinationAP_Status_Payload)
      }
      val value = readFAA_FCS_CoordinationAP_StatusType()
      return FAA_FCS_Coordination.AP_Status_Payload(value)
    }

    def readFAA_FCS_CoordinationAP_EnableType(): FAA_FCS_Coordination.AP_Enable.Type = {
      val r = reader.readZ()
      return FAA_FCS_Coordination.AP_Enable.byOrdinal(r).get
    }

    def readFAA_FCS_CoordinationAP_Enable_Payload(): FAA_FCS_Coordination.AP_Enable_Payload = {
      val r = readFAA_FCS_CoordinationAP_Enable_PayloadT(F)
      return r
    }

    def readFAA_FCS_CoordinationAP_Enable_PayloadT(typeParsed: B): FAA_FCS_Coordination.AP_Enable_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.FAA_FCS_CoordinationAP_Enable_Payload)
      }
      val value = readFAA_FCS_CoordinationAP_EnableType()
      return FAA_FCS_Coordination.AP_Enable_Payload(value)
    }

    def readBase_TypesBoolean_Payload(): Base_Types.Boolean_Payload = {
      val r = readBase_TypesBoolean_PayloadT(F)
      return r
    }

    def readBase_TypesBoolean_PayloadT(typeParsed: B): Base_Types.Boolean_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesBoolean_Payload)
      }
      val value = reader.readB()
      return Base_Types.Boolean_Payload(value)
    }

    def readBase_TypesInteger_Payload(): Base_Types.Integer_Payload = {
      val r = readBase_TypesInteger_PayloadT(F)
      return r
    }

    def readBase_TypesInteger_PayloadT(typeParsed: B): Base_Types.Integer_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesInteger_Payload)
      }
      val value = reader.readZ()
      return Base_Types.Integer_Payload(value)
    }

    def readBase_TypesInteger_8_Payload(): Base_Types.Integer_8_Payload = {
      val r = readBase_TypesInteger_8_PayloadT(F)
      return r
    }

    def readBase_TypesInteger_8_PayloadT(typeParsed: B): Base_Types.Integer_8_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesInteger_8_Payload)
      }
      val value = reader.readS8()
      return Base_Types.Integer_8_Payload(value)
    }

    def readBase_TypesInteger_16_Payload(): Base_Types.Integer_16_Payload = {
      val r = readBase_TypesInteger_16_PayloadT(F)
      return r
    }

    def readBase_TypesInteger_16_PayloadT(typeParsed: B): Base_Types.Integer_16_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesInteger_16_Payload)
      }
      val value = reader.readS16()
      return Base_Types.Integer_16_Payload(value)
    }

    def readBase_TypesInteger_32_Payload(): Base_Types.Integer_32_Payload = {
      val r = readBase_TypesInteger_32_PayloadT(F)
      return r
    }

    def readBase_TypesInteger_32_PayloadT(typeParsed: B): Base_Types.Integer_32_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesInteger_32_Payload)
      }
      val value = reader.readS32()
      return Base_Types.Integer_32_Payload(value)
    }

    def readBase_TypesInteger_64_Payload(): Base_Types.Integer_64_Payload = {
      val r = readBase_TypesInteger_64_PayloadT(F)
      return r
    }

    def readBase_TypesInteger_64_PayloadT(typeParsed: B): Base_Types.Integer_64_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesInteger_64_Payload)
      }
      val value = reader.readS64()
      return Base_Types.Integer_64_Payload(value)
    }

    def readBase_TypesUnsigned_8_Payload(): Base_Types.Unsigned_8_Payload = {
      val r = readBase_TypesUnsigned_8_PayloadT(F)
      return r
    }

    def readBase_TypesUnsigned_8_PayloadT(typeParsed: B): Base_Types.Unsigned_8_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesUnsigned_8_Payload)
      }
      val value = reader.readU8()
      return Base_Types.Unsigned_8_Payload(value)
    }

    def readBase_TypesUnsigned_16_Payload(): Base_Types.Unsigned_16_Payload = {
      val r = readBase_TypesUnsigned_16_PayloadT(F)
      return r
    }

    def readBase_TypesUnsigned_16_PayloadT(typeParsed: B): Base_Types.Unsigned_16_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesUnsigned_16_Payload)
      }
      val value = reader.readU16()
      return Base_Types.Unsigned_16_Payload(value)
    }

    def readBase_TypesUnsigned_32_Payload(): Base_Types.Unsigned_32_Payload = {
      val r = readBase_TypesUnsigned_32_PayloadT(F)
      return r
    }

    def readBase_TypesUnsigned_32_PayloadT(typeParsed: B): Base_Types.Unsigned_32_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesUnsigned_32_Payload)
      }
      val value = reader.readU32()
      return Base_Types.Unsigned_32_Payload(value)
    }

    def readBase_TypesUnsigned_64_Payload(): Base_Types.Unsigned_64_Payload = {
      val r = readBase_TypesUnsigned_64_PayloadT(F)
      return r
    }

    def readBase_TypesUnsigned_64_PayloadT(typeParsed: B): Base_Types.Unsigned_64_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesUnsigned_64_Payload)
      }
      val value = reader.readU64()
      return Base_Types.Unsigned_64_Payload(value)
    }

    def readBase_TypesFloat_Payload(): Base_Types.Float_Payload = {
      val r = readBase_TypesFloat_PayloadT(F)
      return r
    }

    def readBase_TypesFloat_PayloadT(typeParsed: B): Base_Types.Float_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesFloat_Payload)
      }
      val value = reader.readR()
      return Base_Types.Float_Payload(value)
    }

    def readBase_TypesFloat_32_Payload(): Base_Types.Float_32_Payload = {
      val r = readBase_TypesFloat_32_PayloadT(F)
      return r
    }

    def readBase_TypesFloat_32_PayloadT(typeParsed: B): Base_Types.Float_32_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesFloat_32_Payload)
      }
      val value = reader.readF32()
      return Base_Types.Float_32_Payload(value)
    }

    def readBase_TypesFloat_64_Payload(): Base_Types.Float_64_Payload = {
      val r = readBase_TypesFloat_64_PayloadT(F)
      return r
    }

    def readBase_TypesFloat_64_PayloadT(typeParsed: B): Base_Types.Float_64_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesFloat_64_Payload)
      }
      val value = reader.readF64()
      return Base_Types.Float_64_Payload(value)
    }

    def readBase_TypesCharacter_Payload(): Base_Types.Character_Payload = {
      val r = readBase_TypesCharacter_PayloadT(F)
      return r
    }

    def readBase_TypesCharacter_PayloadT(typeParsed: B): Base_Types.Character_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesCharacter_Payload)
      }
      val value = reader.readC()
      return Base_Types.Character_Payload(value)
    }

    def readBase_TypesString_Payload(): Base_Types.String_Payload = {
      val r = readBase_TypesString_PayloadT(F)
      return r
    }

    def readBase_TypesString_PayloadT(typeParsed: B): Base_Types.String_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesString_Payload)
      }
      val value = reader.readString()
      return Base_Types.String_Payload(value)
    }

    def readBase_TypesBits_Payload(): Base_Types.Bits_Payload = {
      val r = readBase_TypesBits_PayloadT(F)
      return r
    }

    def readBase_TypesBits_PayloadT(typeParsed: B): Base_Types.Bits_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesBits_Payload)
      }
      val value = reader.readISZ(reader.readB _)
      return Base_Types.Bits_Payload(value)
    }

    def readFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container(): FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.FAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_P => val r = readFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PT(T); return r
        case Constants.FAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PS => val r = readFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container.")
          val r = readFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PST(T)
          return r
      }
    }

    def readFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_P(): FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_P = {
      val r = readFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PT(F)
      return r
    }

    def readFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PT(typeParsed: B): FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.FAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_P)
      }
      val api_display_fd_request_in = readFAA_FCS_CoordinationRequest_ValueType()
      val api_display_fd_validity_in = readFAA_FCS_CoordinationInput_ValidityType()
      val api_engage_ap_request_in = readFAA_FCS_CoordinationRequest_ValueType()
      val api_engage_ap_validity_in = readFAA_FCS_CoordinationInput_ValidityType()
      val api_sync_fd_request_in = readFAA_FCS_CoordinationRequest_ValueType()
      val api_sync_fd_validity_in = readFAA_FCS_CoordinationInput_ValidityType()
      return FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_P(api_display_fd_request_in, api_display_fd_validity_in, api_engage_ap_request_in, api_engage_ap_validity_in, api_sync_fd_request_in, api_sync_fd_validity_in)
    }

    def readFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PS(): FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PS = {
      val r = readFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PST(F)
      return r
    }

    def readFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PST(typeParsed: B): FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.FAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PS)
      }
      val api_display_fd_request_in = readFAA_FCS_CoordinationRequest_ValueType()
      val api_display_fd_validity_in = readFAA_FCS_CoordinationInput_ValidityType()
      val api_engage_ap_request_in = readFAA_FCS_CoordinationRequest_ValueType()
      val api_engage_ap_validity_in = readFAA_FCS_CoordinationInput_ValidityType()
      val api_sync_fd_request_in = readFAA_FCS_CoordinationRequest_ValueType()
      val api_sync_fd_validity_in = readFAA_FCS_CoordinationInput_ValidityType()
      return FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PS(api_display_fd_request_in, api_display_fd_validity_in, api_engage_ap_request_in, api_engage_ap_validity_in, api_sync_fd_request_in, api_sync_fd_validity_in)
    }

    def readFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container(): FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.FAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_P => val r = readFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PT(T); return r
        case Constants.FAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PS => val r = readFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container.")
          val r = readFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PST(T)
          return r
      }
    }

    def readFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_P(): FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_P = {
      val r = readFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PT(F)
      return r
    }

    def readFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PT(typeParsed: B): FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.FAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_P)
      }
      val api_qualified_display_request = readFAA_FCS_CoordinationQualified_RequestType()
      val api_qualified_engage_request = readFAA_FCS_CoordinationQualified_RequestType()
      val api_qualified_sync_request = readFAA_FCS_CoordinationQualified_RequestType()
      return FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_P(api_qualified_display_request, api_qualified_engage_request, api_qualified_sync_request)
    }

    def readFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PS(): FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PS = {
      val r = readFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PST(F)
      return r
    }

    def readFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PST(typeParsed: B): FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.FAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PS)
      }
      val api_qualified_display_request = readFAA_FCS_CoordinationQualified_RequestType()
      val api_qualified_engage_request = readFAA_FCS_CoordinationQualified_RequestType()
      val api_qualified_sync_request = readFAA_FCS_CoordinationQualified_RequestType()
      return FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PS(api_qualified_display_request, api_qualified_engage_request, api_qualified_sync_request)
    }

    def readFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container(): FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.FAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_P => val r = readFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PT(T); return r
        case Constants.FAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PS => val r = readFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container.")
          val r = readFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PST(T)
          return r
      }
    }

    def readFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_P(): FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_P = {
      val r = readFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PT(F)
      return r
    }

    def readFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PT(typeParsed: B): FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.FAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_P)
      }
      val api_attitude_acceptable_in = readFAA_FCS_CoordinationAttitude_AcceptabilityType()
      val api_attitude_data_in = readFAA_FCS_CoordinationAttitude_Data_ValidityType()
      return FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_P(api_attitude_acceptable_in, api_attitude_data_in)
    }

    def readFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PS(): FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PS = {
      val r = readFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PST(F)
      return r
    }

    def readFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PST(typeParsed: B): FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.FAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PS)
      }
      val api_attitude_acceptable_in = readFAA_FCS_CoordinationAttitude_AcceptabilityType()
      val api_attitude_data_in = readFAA_FCS_CoordinationAttitude_Data_ValidityType()
      return FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PS(api_attitude_acceptable_in, api_attitude_data_in)
    }

    def readFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container(): FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.FAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_P => val r = readFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PT(T); return r
        case Constants.FAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PS => val r = readFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container.")
          val r = readFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PST(T)
          return r
      }
    }

    def readFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_P(): FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_P = {
      val r = readFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PT(F)
      return r
    }

    def readFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PT(typeParsed: B): FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.FAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_P)
      }
      val api_attitude_acceptable_out = readFAA_FCS_CoordinationAttitude_AcceptabilityType()
      val api_attitude_data_out = readFAA_FCS_CoordinationAttitude_Data_ValidityType()
      return FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_P(api_attitude_acceptable_out, api_attitude_data_out)
    }

    def readFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PS(): FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PS = {
      val r = readFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PST(F)
      return r
    }

    def readFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PST(typeParsed: B): FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.FAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PS)
      }
      val api_attitude_acceptable_out = readFAA_FCS_CoordinationAttitude_AcceptabilityType()
      val api_attitude_data_out = readFAA_FCS_CoordinationAttitude_Data_ValidityType()
      return FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PS(api_attitude_acceptable_out, api_attitude_data_out)
    }

    def readFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container(): FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.FAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_P => val r = readFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PT(T); return r
        case Constants.FAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PS => val r = readFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container.")
          val r = readFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PST(T)
          return r
      }
    }

    def readFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_P(): FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_P = {
      val r = readFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PT(F)
      return r
    }

    def readFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PT(typeParsed: B): FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.FAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_P)
      }
      val api_reference_state_in = readFAA_FCS_CoordinationReference_StateType()
      return FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_P(api_reference_state_in)
    }

    def readFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PS(): FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PS = {
      val r = readFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PST(F)
      return r
    }

    def readFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PST(typeParsed: B): FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.FAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PS)
      }
      val api_reference_state_in = readFAA_FCS_CoordinationReference_StateType()
      return FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PS(api_reference_state_in)
    }

    def readFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container(): FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.FAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_P => val r = readFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PT(T); return r
        case Constants.FAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PS => val r = readFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container.")
          val r = readFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PST(T)
          return r
      }
    }

    def readFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_P(): FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_P = {
      val r = readFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PT(F)
      return r
    }

    def readFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PT(typeParsed: B): FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.FAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_P)
      }
      val api_reference_state_out = readFAA_FCS_CoordinationReference_StateType()
      return FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_P(api_reference_state_out)
    }

    def readFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PS(): FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PS = {
      val r = readFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PST(F)
      return r
    }

    def readFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PST(typeParsed: B): FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.FAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PS)
      }
      val api_reference_state_out = readFAA_FCS_CoordinationReference_StateType()
      return FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PS(api_reference_state_out)
    }

    def readFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container(): FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.FAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_P => val r = readFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PT(T); return r
        case Constants.FAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PS => val r = readFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container.")
          val r = readFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PST(T)
          return r
      }
    }

    def readFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_P(): FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_P = {
      val r = readFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PT(F)
      return r
    }

    def readFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PT(typeParsed: B): FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.FAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_P)
      }
      val api_ap_availability_in = readFAA_FCS_CoordinationAP_AvailabilityType()
      return FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_P(api_ap_availability_in)
    }

    def readFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PS(): FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PS = {
      val r = readFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PST(F)
      return r
    }

    def readFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PST(typeParsed: B): FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.FAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PS)
      }
      val api_ap_availability_in = readFAA_FCS_CoordinationAP_AvailabilityType()
      return FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PS(api_ap_availability_in)
    }

    def readFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container(): FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.FAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_P => val r = readFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PT(T); return r
        case Constants.FAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PS => val r = readFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container.")
          val r = readFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PST(T)
          return r
      }
    }

    def readFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_P(): FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_P = {
      val r = readFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PT(F)
      return r
    }

    def readFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PT(typeParsed: B): FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.FAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_P)
      }
      val api_ap_availability_out = readFAA_FCS_CoordinationAP_AvailabilityType()
      return FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_P(api_ap_availability_out)
    }

    def readFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PS(): FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PS = {
      val r = readFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PST(F)
      return r
    }

    def readFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PST(typeParsed: B): FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.FAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PS)
      }
      val api_ap_availability_out = readFAA_FCS_CoordinationAP_AvailabilityType()
      return FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PS(api_ap_availability_out)
    }

    def readFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container(): FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.FAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_P => val r = readFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PT(T); return r
        case Constants.FAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PS => val r = readFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container.")
          val r = readFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PST(T)
          return r
      }
    }

    def readFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_P(): FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_P = {
      val r = readFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PT(F)
      return r
    }

    def readFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PT(typeParsed: B): FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.FAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_P)
      }
      val api_attitude_acceptable = readFAA_FCS_CoordinationAttitude_AcceptabilityType()
      val api_attitude_data = readFAA_FCS_CoordinationAttitude_Data_ValidityType()
      val api_qualified_display_request = readFAA_FCS_CoordinationQualified_RequestType()
      val api_qualified_sync_request = readFAA_FCS_CoordinationQualified_RequestType()
      val api_reference_state = readFAA_FCS_CoordinationReference_StateType()
      val api_reference_sync_trigger = readFAA_FCS_CoordinationRequest_IndicationType()
      return FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_P(api_attitude_acceptable, api_attitude_data, api_qualified_display_request, api_qualified_sync_request, api_reference_state, api_reference_sync_trigger)
    }

    def readFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PS(): FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PS = {
      val r = readFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PST(F)
      return r
    }

    def readFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PST(typeParsed: B): FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.FAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PS)
      }
      val api_attitude_acceptable = readFAA_FCS_CoordinationAttitude_AcceptabilityType()
      val api_attitude_data = readFAA_FCS_CoordinationAttitude_Data_ValidityType()
      val api_qualified_display_request = readFAA_FCS_CoordinationQualified_RequestType()
      val api_qualified_sync_request = readFAA_FCS_CoordinationQualified_RequestType()
      val api_reference_state = readFAA_FCS_CoordinationReference_StateType()
      val api_reference_sync_trigger = readFAA_FCS_CoordinationRequest_IndicationType()
      return FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PS(api_attitude_acceptable, api_attitude_data, api_qualified_display_request, api_qualified_sync_request, api_reference_state, api_reference_sync_trigger)
    }

    def readFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container(): FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.FAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_P => val r = readFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PT(T); return r
        case Constants.FAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PS => val r = readFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container.")
          val r = readFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PST(T)
          return r
      }
    }

    def readFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_P(): FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_P = {
      val r = readFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PT(F)
      return r
    }

    def readFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PT(typeParsed: B): FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.FAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_P)
      }
      val api_fcs_failed = readFAA_FCS_CoordinationFCS_Failed_IndicationType()
      val api_fd_on = readFAA_FCS_CoordinationFD_IndicationType()
      val api_reference_sync_request = readFAA_FCS_CoordinationRequest_IndicationType()
      return FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_P(api_fcs_failed, api_fd_on, api_reference_sync_request)
    }

    def readFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PS(): FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PS = {
      val r = readFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PST(F)
      return r
    }

    def readFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PST(typeParsed: B): FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.FAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PS)
      }
      val api_fcs_failed = readFAA_FCS_CoordinationFCS_Failed_IndicationType()
      val api_fd_on = readFAA_FCS_CoordinationFD_IndicationType()
      val api_reference_sync_request = readFAA_FCS_CoordinationRequest_IndicationType()
      return FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PS(api_fcs_failed, api_fd_on, api_reference_sync_request)
    }

    def readFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container(): FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.FAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_P => val r = readFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PT(T); return r
        case Constants.FAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PS => val r = readFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container.")
          val r = readFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PST(T)
          return r
      }
    }

    def readFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_P(): FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_P = {
      val r = readFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PT(F)
      return r
    }

    def readFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PT(typeParsed: B): FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.FAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_P)
      }
      val api_ap_availability = readFAA_FCS_CoordinationAP_AvailabilityType()
      val api_attitude_acceptable = readFAA_FCS_CoordinationAttitude_AcceptabilityType()
      val api_attitude_data = readFAA_FCS_CoordinationAttitude_Data_ValidityType()
      val api_fd_on = readFAA_FCS_CoordinationFD_IndicationType()
      val api_qualified_engage_request = readFAA_FCS_CoordinationQualified_RequestType()
      val api_reference_state = readFAA_FCS_CoordinationReference_StateType()
      return FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_P(api_ap_availability, api_attitude_acceptable, api_attitude_data, api_fd_on, api_qualified_engage_request, api_reference_state)
    }

    def readFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PS(): FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PS = {
      val r = readFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PST(F)
      return r
    }

    def readFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PST(typeParsed: B): FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.FAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PS)
      }
      val api_ap_availability = readFAA_FCS_CoordinationAP_AvailabilityType()
      val api_attitude_acceptable = readFAA_FCS_CoordinationAttitude_AcceptabilityType()
      val api_attitude_data = readFAA_FCS_CoordinationAttitude_Data_ValidityType()
      val api_fd_on = readFAA_FCS_CoordinationFD_IndicationType()
      val api_qualified_engage_request = readFAA_FCS_CoordinationQualified_RequestType()
      val api_reference_state = readFAA_FCS_CoordinationReference_StateType()
      return FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PS(api_ap_availability, api_attitude_acceptable, api_attitude_data, api_fd_on, api_qualified_engage_request, api_reference_state)
    }

    def readFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container(): FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.FAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_P => val r = readFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PT(T); return r
        case Constants.FAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PS => val r = readFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container.")
          val r = readFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PST(T)
          return r
      }
    }

    def readFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_P(): FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_P = {
      val r = readFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PT(F)
      return r
    }

    def readFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PT(typeParsed: B): FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.FAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_P)
      }
      val api_ap_guidance_request = readFAA_FCS_CoordinationRequest_IndicationType()
      val api_ap_on = readFAA_FCS_CoordinationAP_EnableType()
      val api_ap_status = readFAA_FCS_CoordinationAP_StatusType()
      val api_reference_sync_trigger = readFAA_FCS_CoordinationRequest_IndicationType()
      return FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_P(api_ap_guidance_request, api_ap_on, api_ap_status, api_reference_sync_trigger)
    }

    def readFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PS(): FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PS = {
      val r = readFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PST(F)
      return r
    }

    def readFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PST(typeParsed: B): FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.FAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PS)
      }
      val api_ap_guidance_request = readFAA_FCS_CoordinationRequest_IndicationType()
      val api_ap_on = readFAA_FCS_CoordinationAP_EnableType()
      val api_ap_status = readFAA_FCS_CoordinationAP_StatusType()
      val api_reference_sync_trigger = readFAA_FCS_CoordinationRequest_IndicationType()
      return FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PS(api_ap_guidance_request, api_ap_on, api_ap_status, api_reference_sync_trigger)
    }

    def readFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container(): FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.FAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_P => val r = readFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PT(T); return r
        case Constants.FAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PS => val r = readFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container.")
          val r = readFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PST(T)
          return r
      }
    }

    def readFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_P(): FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_P = {
      val r = readFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PT(F)
      return r
    }

    def readFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PT(typeParsed: B): FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.FAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_P)
      }
      val api_ap_guidance_request_in = readFAA_FCS_CoordinationRequest_IndicationType()
      val api_ap_on_in = readFAA_FCS_CoordinationAP_EnableType()
      val api_ap_status_in = readFAA_FCS_CoordinationAP_StatusType()
      val api_fcs_failed_in = readFAA_FCS_CoordinationFCS_Failed_IndicationType()
      val api_fd_on_in = readFAA_FCS_CoordinationFD_IndicationType()
      val api_reference_sync_request_in = readFAA_FCS_CoordinationRequest_IndicationType()
      return FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_P(api_ap_guidance_request_in, api_ap_on_in, api_ap_status_in, api_fcs_failed_in, api_fd_on_in, api_reference_sync_request_in)
    }

    def readFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PS(): FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PS = {
      val r = readFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PST(F)
      return r
    }

    def readFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PST(typeParsed: B): FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.FAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PS)
      }
      val api_ap_guidance_request_in = readFAA_FCS_CoordinationRequest_IndicationType()
      val api_ap_on_in = readFAA_FCS_CoordinationAP_EnableType()
      val api_ap_status_in = readFAA_FCS_CoordinationAP_StatusType()
      val api_fcs_failed_in = readFAA_FCS_CoordinationFCS_Failed_IndicationType()
      val api_fd_on_in = readFAA_FCS_CoordinationFD_IndicationType()
      val api_reference_sync_request_in = readFAA_FCS_CoordinationRequest_IndicationType()
      return FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PS(api_ap_guidance_request_in, api_ap_on_in, api_ap_status_in, api_fcs_failed_in, api_fd_on_in, api_reference_sync_request_in)
    }

    def readFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container(): FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.FAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_P => val r = readFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PT(T); return r
        case Constants.FAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PS => val r = readFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container.")
          val r = readFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PST(T)
          return r
      }
    }

    def readFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_P(): FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_P = {
      val r = readFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PT(F)
      return r
    }

    def readFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PT(typeParsed: B): FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.FAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_P)
      }
      val api_ap_guidance_request_out = readFAA_FCS_CoordinationRequest_IndicationType()
      val api_ap_on_out = readFAA_FCS_CoordinationAP_EnableType()
      val api_ap_status_out = readFAA_FCS_CoordinationAP_StatusType()
      val api_fcs_failed_out = readFAA_FCS_CoordinationFCS_Failed_IndicationType()
      val api_fd_on_out = readFAA_FCS_CoordinationFD_IndicationType()
      val api_reference_sync_request_out = readFAA_FCS_CoordinationRequest_IndicationType()
      return FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_P(api_ap_guidance_request_out, api_ap_on_out, api_ap_status_out, api_fcs_failed_out, api_fd_on_out, api_reference_sync_request_out)
    }

    def readFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PS(): FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PS = {
      val r = readFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PST(F)
      return r
    }

    def readFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PST(typeParsed: B): FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.FAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PS)
      }
      val api_ap_guidance_request_out = readFAA_FCS_CoordinationRequest_IndicationType()
      val api_ap_on_out = readFAA_FCS_CoordinationAP_EnableType()
      val api_ap_status_out = readFAA_FCS_CoordinationAP_StatusType()
      val api_fcs_failed_out = readFAA_FCS_CoordinationFCS_Failed_IndicationType()
      val api_fd_on_out = readFAA_FCS_CoordinationFD_IndicationType()
      val api_reference_sync_request_out = readFAA_FCS_CoordinationRequest_IndicationType()
      return FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PS(api_ap_guidance_request_out, api_ap_on_out, api_ap_status_out, api_fcs_failed_out, api_fd_on_out, api_reference_sync_request_out)
    }

    def readruntimemonitorObservationKindType(): runtimemonitor.ObservationKind.Type = {
      val r = reader.readZ()
      return runtimemonitor.ObservationKind.byOrdinal(r).get
    }

    def readutilContainer(): util.Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.utilEmptyContainer => val r = readutilEmptyContainerT(T); return r
        case Constants.FAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_P => val r = readFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PT(T); return r
        case Constants.FAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PS => val r = readFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PST(T); return r
        case Constants.FAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_P => val r = readFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PT(T); return r
        case Constants.FAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PS => val r = readFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PST(T); return r
        case Constants.FAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_P => val r = readFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PT(T); return r
        case Constants.FAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_P => val r = readFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PT(T); return r
        case Constants.FAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PS => val r = readFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PST(T); return r
        case Constants.FAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PS => val r = readFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PST(T); return r
        case Constants.FAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_P => val r = readFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PT(T); return r
        case Constants.FAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_P => val r = readFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PT(T); return r
        case Constants.FAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_P => val r = readFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PT(T); return r
        case Constants.FAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PS => val r = readFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PST(T); return r
        case Constants.FAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PS => val r = readFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PST(T); return r
        case Constants.FAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PS => val r = readFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PST(T); return r
        case Constants.FAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_P => val r = readFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PT(T); return r
        case Constants.FAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PS => val r = readFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PST(T); return r
        case Constants.FAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_P => val r = readFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PT(T); return r
        case Constants.FAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PS => val r = readFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PST(T); return r
        case Constants.FAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_P => val r = readFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PT(T); return r
        case Constants.FAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PS => val r = readFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PST(T); return r
        case Constants.FAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_P => val r = readFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PT(T); return r
        case Constants.FAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PS => val r = readFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PST(T); return r
        case Constants.FAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_P => val r = readFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PT(T); return r
        case Constants.FAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PS => val r = readFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PST(T); return r
        case Constants.FAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_P => val r = readFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PT(T); return r
        case Constants.FAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PS => val r = readFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PST(T); return r
        case Constants.FAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_P => val r = readFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PT(T); return r
        case Constants.FAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PS => val r = readFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of util.Container.")
          val r = readFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PST(T)
          return r
      }
    }

    def readutilEmptyContainer(): util.EmptyContainer = {
      val r = readutilEmptyContainerT(F)
      return r
    }

    def readutilEmptyContainerT(typeParsed: B): util.EmptyContainer = {
      if (!typeParsed) {
        reader.expectZ(Constants.utilEmptyContainer)
      }
      return util.EmptyContainer()
    }

    def read_artDataContent(): art.DataContent = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants._artEmpty => val r = read_artEmptyT(T); return r
        case Constants.Base_TypesBoolean_Payload => val r = readBase_TypesBoolean_PayloadT(T); return r
        case Constants.Base_TypesInteger_Payload => val r = readBase_TypesInteger_PayloadT(T); return r
        case Constants.Base_TypesInteger_8_Payload => val r = readBase_TypesInteger_8_PayloadT(T); return r
        case Constants.Base_TypesInteger_16_Payload => val r = readBase_TypesInteger_16_PayloadT(T); return r
        case Constants.Base_TypesInteger_32_Payload => val r = readBase_TypesInteger_32_PayloadT(T); return r
        case Constants.Base_TypesInteger_64_Payload => val r = readBase_TypesInteger_64_PayloadT(T); return r
        case Constants.Base_TypesUnsigned_8_Payload => val r = readBase_TypesUnsigned_8_PayloadT(T); return r
        case Constants.Base_TypesUnsigned_16_Payload => val r = readBase_TypesUnsigned_16_PayloadT(T); return r
        case Constants.Base_TypesUnsigned_32_Payload => val r = readBase_TypesUnsigned_32_PayloadT(T); return r
        case Constants.Base_TypesUnsigned_64_Payload => val r = readBase_TypesUnsigned_64_PayloadT(T); return r
        case Constants.Base_TypesFloat_Payload => val r = readBase_TypesFloat_PayloadT(T); return r
        case Constants.Base_TypesFloat_32_Payload => val r = readBase_TypesFloat_32_PayloadT(T); return r
        case Constants.Base_TypesFloat_64_Payload => val r = readBase_TypesFloat_64_PayloadT(T); return r
        case Constants.Base_TypesCharacter_Payload => val r = readBase_TypesCharacter_PayloadT(T); return r
        case Constants.Base_TypesString_Payload => val r = readBase_TypesString_PayloadT(T); return r
        case Constants.Base_TypesBits_Payload => val r = readBase_TypesBits_PayloadT(T); return r
        case Constants.utilEmptyContainer => val r = readutilEmptyContainerT(T); return r
        case Constants.FAA_FCS_CoordinationAP_Status_Payload => val r = readFAA_FCS_CoordinationAP_Status_PayloadT(T); return r
        case Constants.FAA_FCS_CoordinationAP_Enable_Payload => val r = readFAA_FCS_CoordinationAP_Enable_PayloadT(T); return r
        case Constants.FAA_FCS_CoordinationFD_Indication_Payload => val r = readFAA_FCS_CoordinationFD_Indication_PayloadT(T); return r
        case Constants.FAA_FCS_CoordinationRequest_Value_Payload => val r = readFAA_FCS_CoordinationRequest_Value_PayloadT(T); return r
        case Constants.FAA_FCS_CoordinationInput_Validity_Payload => val r = readFAA_FCS_CoordinationInput_Validity_PayloadT(T); return r
        case Constants.FAA_FCS_CoordinationAP_Availability_Payload => val r = readFAA_FCS_CoordinationAP_Availability_PayloadT(T); return r
        case Constants.FAA_FCS_CoordinationReference_State_Payload => val r = readFAA_FCS_CoordinationReference_State_PayloadT(T); return r
        case Constants.FAA_FCS_CoordinationQualified_Request_Payload => val r = readFAA_FCS_CoordinationQualified_Request_PayloadT(T); return r
        case Constants.FAA_FCS_CoordinationRequest_Indication_Payload => val r = readFAA_FCS_CoordinationRequest_Indication_PayloadT(T); return r
        case Constants.FAA_FCS_CoordinationFCS_Failed_Indication_Payload => val r = readFAA_FCS_CoordinationFCS_Failed_Indication_PayloadT(T); return r
        case Constants.FAA_FCS_CoordinationAttitude_Data_Validity_Payload => val r = readFAA_FCS_CoordinationAttitude_Data_Validity_PayloadT(T); return r
        case Constants.FAA_FCS_CoordinationAttitude_Acceptability_Payload => val r = readFAA_FCS_CoordinationAttitude_Acceptability_PayloadT(T); return r
        case Constants.FAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_P => val r = readFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PT(T); return r
        case Constants.FAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PS => val r = readFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PST(T); return r
        case Constants.FAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_P => val r = readFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PT(T); return r
        case Constants.FAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PS => val r = readFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PST(T); return r
        case Constants.FAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_P => val r = readFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PT(T); return r
        case Constants.FAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_P => val r = readFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PT(T); return r
        case Constants.FAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PS => val r = readFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PST(T); return r
        case Constants.FAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PS => val r = readFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PST(T); return r
        case Constants.FAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_P => val r = readFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PT(T); return r
        case Constants.FAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_P => val r = readFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PT(T); return r
        case Constants.FAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_P => val r = readFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PT(T); return r
        case Constants.FAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PS => val r = readFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PST(T); return r
        case Constants.FAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PS => val r = readFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PST(T); return r
        case Constants.FAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PS => val r = readFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PST(T); return r
        case Constants.FAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_P => val r = readFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PT(T); return r
        case Constants.FAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PS => val r = readFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PST(T); return r
        case Constants.FAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_P => val r = readFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PT(T); return r
        case Constants.FAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PS => val r = readFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PST(T); return r
        case Constants.FAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_P => val r = readFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PT(T); return r
        case Constants.FAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PS => val r = readFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PST(T); return r
        case Constants.FAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_P => val r = readFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PT(T); return r
        case Constants.FAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PS => val r = readFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PST(T); return r
        case Constants.FAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_P => val r = readFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PT(T); return r
        case Constants.FAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PS => val r = readFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PST(T); return r
        case Constants.FAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_P => val r = readFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PT(T); return r
        case Constants.FAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PS => val r = readFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PST(T); return r
        case Constants.FAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_P => val r = readFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PT(T); return r
        case Constants.FAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PS => val r = readFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of art.DataContent.")
          val r = readFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PST(T)
          return r
      }
    }

    def read_artEmpty(): art.Empty = {
      val r = read_artEmptyT(F)
      return r
    }

    def read_artEmptyT(typeParsed: B): art.Empty = {
      if (!typeParsed) {
        reader.expectZ(Constants._artEmpty)
      }
      return art.Empty()
    }

  }

  def to[T](data: ISZ[U8], f: Reader => T): Either[T, MessagePack.ErrorMsg] = {
    val rd = Reader.Default(MessagePack.reader(data))
    rd.reader.init()
    val r = f(rd)
    rd.errorOpt match {
      case Some(e) => return Either.Right(e)
      case _ => return Either.Left(r)
    }
  }

  def fromFAA_FCS_CoordinationRequest_Value_Payload(o: FAA_FCS_Coordination.Request_Value_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_FCS_CoordinationRequest_Value_Payload(o)
    return w.result
  }

  def toFAA_FCS_CoordinationRequest_Value_Payload(data: ISZ[U8]): Either[FAA_FCS_Coordination.Request_Value_Payload, MessagePack.ErrorMsg] = {
    def fFAA_FCS_CoordinationRequest_Value_Payload(reader: Reader): FAA_FCS_Coordination.Request_Value_Payload = {
      val r = reader.readFAA_FCS_CoordinationRequest_Value_Payload()
      return r
    }
    val r = to(data, fFAA_FCS_CoordinationRequest_Value_Payload _)
    return r
  }

  def fromFAA_FCS_CoordinationInput_Validity_Payload(o: FAA_FCS_Coordination.Input_Validity_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_FCS_CoordinationInput_Validity_Payload(o)
    return w.result
  }

  def toFAA_FCS_CoordinationInput_Validity_Payload(data: ISZ[U8]): Either[FAA_FCS_Coordination.Input_Validity_Payload, MessagePack.ErrorMsg] = {
    def fFAA_FCS_CoordinationInput_Validity_Payload(reader: Reader): FAA_FCS_Coordination.Input_Validity_Payload = {
      val r = reader.readFAA_FCS_CoordinationInput_Validity_Payload()
      return r
    }
    val r = to(data, fFAA_FCS_CoordinationInput_Validity_Payload _)
    return r
  }

  def fromFAA_FCS_CoordinationQualified_Request_Payload(o: FAA_FCS_Coordination.Qualified_Request_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_FCS_CoordinationQualified_Request_Payload(o)
    return w.result
  }

  def toFAA_FCS_CoordinationQualified_Request_Payload(data: ISZ[U8]): Either[FAA_FCS_Coordination.Qualified_Request_Payload, MessagePack.ErrorMsg] = {
    def fFAA_FCS_CoordinationQualified_Request_Payload(reader: Reader): FAA_FCS_Coordination.Qualified_Request_Payload = {
      val r = reader.readFAA_FCS_CoordinationQualified_Request_Payload()
      return r
    }
    val r = to(data, fFAA_FCS_CoordinationQualified_Request_Payload _)
    return r
  }

  def fromFAA_FCS_CoordinationAttitude_Data_Validity_Payload(o: FAA_FCS_Coordination.Attitude_Data_Validity_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_FCS_CoordinationAttitude_Data_Validity_Payload(o)
    return w.result
  }

  def toFAA_FCS_CoordinationAttitude_Data_Validity_Payload(data: ISZ[U8]): Either[FAA_FCS_Coordination.Attitude_Data_Validity_Payload, MessagePack.ErrorMsg] = {
    def fFAA_FCS_CoordinationAttitude_Data_Validity_Payload(reader: Reader): FAA_FCS_Coordination.Attitude_Data_Validity_Payload = {
      val r = reader.readFAA_FCS_CoordinationAttitude_Data_Validity_Payload()
      return r
    }
    val r = to(data, fFAA_FCS_CoordinationAttitude_Data_Validity_Payload _)
    return r
  }

  def fromFAA_FCS_CoordinationAttitude_Acceptability_Payload(o: FAA_FCS_Coordination.Attitude_Acceptability_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_FCS_CoordinationAttitude_Acceptability_Payload(o)
    return w.result
  }

  def toFAA_FCS_CoordinationAttitude_Acceptability_Payload(data: ISZ[U8]): Either[FAA_FCS_Coordination.Attitude_Acceptability_Payload, MessagePack.ErrorMsg] = {
    def fFAA_FCS_CoordinationAttitude_Acceptability_Payload(reader: Reader): FAA_FCS_Coordination.Attitude_Acceptability_Payload = {
      val r = reader.readFAA_FCS_CoordinationAttitude_Acceptability_Payload()
      return r
    }
    val r = to(data, fFAA_FCS_CoordinationAttitude_Acceptability_Payload _)
    return r
  }

  def fromFAA_FCS_CoordinationReference_State_Payload(o: FAA_FCS_Coordination.Reference_State_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_FCS_CoordinationReference_State_Payload(o)
    return w.result
  }

  def toFAA_FCS_CoordinationReference_State_Payload(data: ISZ[U8]): Either[FAA_FCS_Coordination.Reference_State_Payload, MessagePack.ErrorMsg] = {
    def fFAA_FCS_CoordinationReference_State_Payload(reader: Reader): FAA_FCS_Coordination.Reference_State_Payload = {
      val r = reader.readFAA_FCS_CoordinationReference_State_Payload()
      return r
    }
    val r = to(data, fFAA_FCS_CoordinationReference_State_Payload _)
    return r
  }

  def fromFAA_FCS_CoordinationAP_Availability_Payload(o: FAA_FCS_Coordination.AP_Availability_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_FCS_CoordinationAP_Availability_Payload(o)
    return w.result
  }

  def toFAA_FCS_CoordinationAP_Availability_Payload(data: ISZ[U8]): Either[FAA_FCS_Coordination.AP_Availability_Payload, MessagePack.ErrorMsg] = {
    def fFAA_FCS_CoordinationAP_Availability_Payload(reader: Reader): FAA_FCS_Coordination.AP_Availability_Payload = {
      val r = reader.readFAA_FCS_CoordinationAP_Availability_Payload()
      return r
    }
    val r = to(data, fFAA_FCS_CoordinationAP_Availability_Payload _)
    return r
  }

  def fromFAA_FCS_CoordinationRequest_Indication_Payload(o: FAA_FCS_Coordination.Request_Indication_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_FCS_CoordinationRequest_Indication_Payload(o)
    return w.result
  }

  def toFAA_FCS_CoordinationRequest_Indication_Payload(data: ISZ[U8]): Either[FAA_FCS_Coordination.Request_Indication_Payload, MessagePack.ErrorMsg] = {
    def fFAA_FCS_CoordinationRequest_Indication_Payload(reader: Reader): FAA_FCS_Coordination.Request_Indication_Payload = {
      val r = reader.readFAA_FCS_CoordinationRequest_Indication_Payload()
      return r
    }
    val r = to(data, fFAA_FCS_CoordinationRequest_Indication_Payload _)
    return r
  }

  def fromFAA_FCS_CoordinationFD_Indication_Payload(o: FAA_FCS_Coordination.FD_Indication_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_FCS_CoordinationFD_Indication_Payload(o)
    return w.result
  }

  def toFAA_FCS_CoordinationFD_Indication_Payload(data: ISZ[U8]): Either[FAA_FCS_Coordination.FD_Indication_Payload, MessagePack.ErrorMsg] = {
    def fFAA_FCS_CoordinationFD_Indication_Payload(reader: Reader): FAA_FCS_Coordination.FD_Indication_Payload = {
      val r = reader.readFAA_FCS_CoordinationFD_Indication_Payload()
      return r
    }
    val r = to(data, fFAA_FCS_CoordinationFD_Indication_Payload _)
    return r
  }

  def fromFAA_FCS_CoordinationFCS_Failed_Indication_Payload(o: FAA_FCS_Coordination.FCS_Failed_Indication_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_FCS_CoordinationFCS_Failed_Indication_Payload(o)
    return w.result
  }

  def toFAA_FCS_CoordinationFCS_Failed_Indication_Payload(data: ISZ[U8]): Either[FAA_FCS_Coordination.FCS_Failed_Indication_Payload, MessagePack.ErrorMsg] = {
    def fFAA_FCS_CoordinationFCS_Failed_Indication_Payload(reader: Reader): FAA_FCS_Coordination.FCS_Failed_Indication_Payload = {
      val r = reader.readFAA_FCS_CoordinationFCS_Failed_Indication_Payload()
      return r
    }
    val r = to(data, fFAA_FCS_CoordinationFCS_Failed_Indication_Payload _)
    return r
  }

  def fromFAA_FCS_CoordinationAP_Status_Payload(o: FAA_FCS_Coordination.AP_Status_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_FCS_CoordinationAP_Status_Payload(o)
    return w.result
  }

  def toFAA_FCS_CoordinationAP_Status_Payload(data: ISZ[U8]): Either[FAA_FCS_Coordination.AP_Status_Payload, MessagePack.ErrorMsg] = {
    def fFAA_FCS_CoordinationAP_Status_Payload(reader: Reader): FAA_FCS_Coordination.AP_Status_Payload = {
      val r = reader.readFAA_FCS_CoordinationAP_Status_Payload()
      return r
    }
    val r = to(data, fFAA_FCS_CoordinationAP_Status_Payload _)
    return r
  }

  def fromFAA_FCS_CoordinationAP_Enable_Payload(o: FAA_FCS_Coordination.AP_Enable_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_FCS_CoordinationAP_Enable_Payload(o)
    return w.result
  }

  def toFAA_FCS_CoordinationAP_Enable_Payload(data: ISZ[U8]): Either[FAA_FCS_Coordination.AP_Enable_Payload, MessagePack.ErrorMsg] = {
    def fFAA_FCS_CoordinationAP_Enable_Payload(reader: Reader): FAA_FCS_Coordination.AP_Enable_Payload = {
      val r = reader.readFAA_FCS_CoordinationAP_Enable_Payload()
      return r
    }
    val r = to(data, fFAA_FCS_CoordinationAP_Enable_Payload _)
    return r
  }

  def fromBase_TypesBoolean_Payload(o: Base_Types.Boolean_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesBoolean_Payload(o)
    return w.result
  }

  def toBase_TypesBoolean_Payload(data: ISZ[U8]): Either[Base_Types.Boolean_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesBoolean_Payload(reader: Reader): Base_Types.Boolean_Payload = {
      val r = reader.readBase_TypesBoolean_Payload()
      return r
    }
    val r = to(data, fBase_TypesBoolean_Payload _)
    return r
  }

  def fromBase_TypesInteger_Payload(o: Base_Types.Integer_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesInteger_Payload(o)
    return w.result
  }

  def toBase_TypesInteger_Payload(data: ISZ[U8]): Either[Base_Types.Integer_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesInteger_Payload(reader: Reader): Base_Types.Integer_Payload = {
      val r = reader.readBase_TypesInteger_Payload()
      return r
    }
    val r = to(data, fBase_TypesInteger_Payload _)
    return r
  }

  def fromBase_TypesInteger_8_Payload(o: Base_Types.Integer_8_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesInteger_8_Payload(o)
    return w.result
  }

  def toBase_TypesInteger_8_Payload(data: ISZ[U8]): Either[Base_Types.Integer_8_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesInteger_8_Payload(reader: Reader): Base_Types.Integer_8_Payload = {
      val r = reader.readBase_TypesInteger_8_Payload()
      return r
    }
    val r = to(data, fBase_TypesInteger_8_Payload _)
    return r
  }

  def fromBase_TypesInteger_16_Payload(o: Base_Types.Integer_16_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesInteger_16_Payload(o)
    return w.result
  }

  def toBase_TypesInteger_16_Payload(data: ISZ[U8]): Either[Base_Types.Integer_16_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesInteger_16_Payload(reader: Reader): Base_Types.Integer_16_Payload = {
      val r = reader.readBase_TypesInteger_16_Payload()
      return r
    }
    val r = to(data, fBase_TypesInteger_16_Payload _)
    return r
  }

  def fromBase_TypesInteger_32_Payload(o: Base_Types.Integer_32_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesInteger_32_Payload(o)
    return w.result
  }

  def toBase_TypesInteger_32_Payload(data: ISZ[U8]): Either[Base_Types.Integer_32_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesInteger_32_Payload(reader: Reader): Base_Types.Integer_32_Payload = {
      val r = reader.readBase_TypesInteger_32_Payload()
      return r
    }
    val r = to(data, fBase_TypesInteger_32_Payload _)
    return r
  }

  def fromBase_TypesInteger_64_Payload(o: Base_Types.Integer_64_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesInteger_64_Payload(o)
    return w.result
  }

  def toBase_TypesInteger_64_Payload(data: ISZ[U8]): Either[Base_Types.Integer_64_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesInteger_64_Payload(reader: Reader): Base_Types.Integer_64_Payload = {
      val r = reader.readBase_TypesInteger_64_Payload()
      return r
    }
    val r = to(data, fBase_TypesInteger_64_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_8_Payload(o: Base_Types.Unsigned_8_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesUnsigned_8_Payload(o)
    return w.result
  }

  def toBase_TypesUnsigned_8_Payload(data: ISZ[U8]): Either[Base_Types.Unsigned_8_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesUnsigned_8_Payload(reader: Reader): Base_Types.Unsigned_8_Payload = {
      val r = reader.readBase_TypesUnsigned_8_Payload()
      return r
    }
    val r = to(data, fBase_TypesUnsigned_8_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_16_Payload(o: Base_Types.Unsigned_16_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesUnsigned_16_Payload(o)
    return w.result
  }

  def toBase_TypesUnsigned_16_Payload(data: ISZ[U8]): Either[Base_Types.Unsigned_16_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesUnsigned_16_Payload(reader: Reader): Base_Types.Unsigned_16_Payload = {
      val r = reader.readBase_TypesUnsigned_16_Payload()
      return r
    }
    val r = to(data, fBase_TypesUnsigned_16_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_32_Payload(o: Base_Types.Unsigned_32_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesUnsigned_32_Payload(o)
    return w.result
  }

  def toBase_TypesUnsigned_32_Payload(data: ISZ[U8]): Either[Base_Types.Unsigned_32_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesUnsigned_32_Payload(reader: Reader): Base_Types.Unsigned_32_Payload = {
      val r = reader.readBase_TypesUnsigned_32_Payload()
      return r
    }
    val r = to(data, fBase_TypesUnsigned_32_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_64_Payload(o: Base_Types.Unsigned_64_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesUnsigned_64_Payload(o)
    return w.result
  }

  def toBase_TypesUnsigned_64_Payload(data: ISZ[U8]): Either[Base_Types.Unsigned_64_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesUnsigned_64_Payload(reader: Reader): Base_Types.Unsigned_64_Payload = {
      val r = reader.readBase_TypesUnsigned_64_Payload()
      return r
    }
    val r = to(data, fBase_TypesUnsigned_64_Payload _)
    return r
  }

  def fromBase_TypesFloat_Payload(o: Base_Types.Float_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesFloat_Payload(o)
    return w.result
  }

  def toBase_TypesFloat_Payload(data: ISZ[U8]): Either[Base_Types.Float_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesFloat_Payload(reader: Reader): Base_Types.Float_Payload = {
      val r = reader.readBase_TypesFloat_Payload()
      return r
    }
    val r = to(data, fBase_TypesFloat_Payload _)
    return r
  }

  def fromBase_TypesFloat_32_Payload(o: Base_Types.Float_32_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesFloat_32_Payload(o)
    return w.result
  }

  def toBase_TypesFloat_32_Payload(data: ISZ[U8]): Either[Base_Types.Float_32_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesFloat_32_Payload(reader: Reader): Base_Types.Float_32_Payload = {
      val r = reader.readBase_TypesFloat_32_Payload()
      return r
    }
    val r = to(data, fBase_TypesFloat_32_Payload _)
    return r
  }

  def fromBase_TypesFloat_64_Payload(o: Base_Types.Float_64_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesFloat_64_Payload(o)
    return w.result
  }

  def toBase_TypesFloat_64_Payload(data: ISZ[U8]): Either[Base_Types.Float_64_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesFloat_64_Payload(reader: Reader): Base_Types.Float_64_Payload = {
      val r = reader.readBase_TypesFloat_64_Payload()
      return r
    }
    val r = to(data, fBase_TypesFloat_64_Payload _)
    return r
  }

  def fromBase_TypesCharacter_Payload(o: Base_Types.Character_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesCharacter_Payload(o)
    return w.result
  }

  def toBase_TypesCharacter_Payload(data: ISZ[U8]): Either[Base_Types.Character_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesCharacter_Payload(reader: Reader): Base_Types.Character_Payload = {
      val r = reader.readBase_TypesCharacter_Payload()
      return r
    }
    val r = to(data, fBase_TypesCharacter_Payload _)
    return r
  }

  def fromBase_TypesString_Payload(o: Base_Types.String_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesString_Payload(o)
    return w.result
  }

  def toBase_TypesString_Payload(data: ISZ[U8]): Either[Base_Types.String_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesString_Payload(reader: Reader): Base_Types.String_Payload = {
      val r = reader.readBase_TypesString_Payload()
      return r
    }
    val r = to(data, fBase_TypesString_Payload _)
    return r
  }

  def fromBase_TypesBits_Payload(o: Base_Types.Bits_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesBits_Payload(o)
    return w.result
  }

  def toBase_TypesBits_Payload(data: ISZ[U8]): Either[Base_Types.Bits_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesBits_Payload(reader: Reader): Base_Types.Bits_Payload = {
      val r = reader.readBase_TypesBits_Payload()
      return r
    }
    val r = to(data, fBase_TypesBits_Payload _)
    return r
  }

  def fromFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container(o: FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container(o)
    return w.result
  }

  def toFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container(data: ISZ[U8]): Either[FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container, MessagePack.ErrorMsg] = {
    def fFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container(reader: Reader): FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container = {
      val r = reader.readFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container()
      return r
    }
    val r = to(data, fFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container _)
    return r
  }

  def fromFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_P(o: FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_P(o)
    return w.result
  }

  def toFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_P(data: ISZ[U8]): Either[FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_P(reader: Reader): FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_P = {
      val r = reader.readFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_P()
      return r
    }
    val r = to(data, fFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_P _)
    return r
  }

  def fromFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PS(o: FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PS(o)
    return w.result
  }

  def toFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PS(data: ISZ[U8]): Either[FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PS(reader: Reader): FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PS = {
      val r = reader.readFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PS()
      return r
    }
    val r = to(data, fFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PS _)
    return r
  }

  def fromFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container(o: FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container(o)
    return w.result
  }

  def toFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container(data: ISZ[U8]): Either[FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container, MessagePack.ErrorMsg] = {
    def fFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container(reader: Reader): FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container = {
      val r = reader.readFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container()
      return r
    }
    val r = to(data, fFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container _)
    return r
  }

  def fromFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_P(o: FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_P(o)
    return w.result
  }

  def toFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_P(data: ISZ[U8]): Either[FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_P(reader: Reader): FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_P = {
      val r = reader.readFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_P()
      return r
    }
    val r = to(data, fFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_P _)
    return r
  }

  def fromFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PS(o: FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PS(o)
    return w.result
  }

  def toFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PS(data: ISZ[U8]): Either[FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PS(reader: Reader): FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PS = {
      val r = reader.readFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PS()
      return r
    }
    val r = to(data, fFAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PS _)
    return r
  }

  def fromFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container(o: FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container(o)
    return w.result
  }

  def toFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container(data: ISZ[U8]): Either[FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container, MessagePack.ErrorMsg] = {
    def fFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container(reader: Reader): FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container = {
      val r = reader.readFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container()
      return r
    }
    val r = to(data, fFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container _)
    return r
  }

  def fromFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_P(o: FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_P(o)
    return w.result
  }

  def toFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_P(data: ISZ[U8]): Either[FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_P(reader: Reader): FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_P = {
      val r = reader.readFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_P()
      return r
    }
    val r = to(data, fFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_P _)
    return r
  }

  def fromFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PS(o: FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PS(o)
    return w.result
  }

  def toFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PS(data: ISZ[U8]): Either[FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PS(reader: Reader): FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PS = {
      val r = reader.readFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PS()
      return r
    }
    val r = to(data, fFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PS _)
    return r
  }

  def fromFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container(o: FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container(o)
    return w.result
  }

  def toFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container(data: ISZ[U8]): Either[FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container, MessagePack.ErrorMsg] = {
    def fFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container(reader: Reader): FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container = {
      val r = reader.readFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container()
      return r
    }
    val r = to(data, fFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container _)
    return r
  }

  def fromFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_P(o: FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_P(o)
    return w.result
  }

  def toFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_P(data: ISZ[U8]): Either[FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_P(reader: Reader): FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_P = {
      val r = reader.readFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_P()
      return r
    }
    val r = to(data, fFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_P _)
    return r
  }

  def fromFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PS(o: FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PS(o)
    return w.result
  }

  def toFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PS(data: ISZ[U8]): Either[FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PS(reader: Reader): FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PS = {
      val r = reader.readFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PS()
      return r
    }
    val r = to(data, fFAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PS _)
    return r
  }

  def fromFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container(o: FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container(o)
    return w.result
  }

  def toFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container(data: ISZ[U8]): Either[FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container, MessagePack.ErrorMsg] = {
    def fFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container(reader: Reader): FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container = {
      val r = reader.readFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container()
      return r
    }
    val r = to(data, fFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container _)
    return r
  }

  def fromFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_P(o: FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_P(o)
    return w.result
  }

  def toFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_P(data: ISZ[U8]): Either[FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_P(reader: Reader): FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_P = {
      val r = reader.readFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_P()
      return r
    }
    val r = to(data, fFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_P _)
    return r
  }

  def fromFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PS(o: FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PS(o)
    return w.result
  }

  def toFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PS(data: ISZ[U8]): Either[FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PS(reader: Reader): FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PS = {
      val r = reader.readFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PS()
      return r
    }
    val r = to(data, fFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PS _)
    return r
  }

  def fromFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container(o: FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container(o)
    return w.result
  }

  def toFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container(data: ISZ[U8]): Either[FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container, MessagePack.ErrorMsg] = {
    def fFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container(reader: Reader): FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container = {
      val r = reader.readFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container()
      return r
    }
    val r = to(data, fFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container _)
    return r
  }

  def fromFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_P(o: FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_P(o)
    return w.result
  }

  def toFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_P(data: ISZ[U8]): Either[FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_P(reader: Reader): FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_P = {
      val r = reader.readFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_P()
      return r
    }
    val r = to(data, fFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_P _)
    return r
  }

  def fromFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PS(o: FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PS(o)
    return w.result
  }

  def toFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PS(data: ISZ[U8]): Either[FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PS(reader: Reader): FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PS = {
      val r = reader.readFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PS()
      return r
    }
    val r = to(data, fFAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PS _)
    return r
  }

  def fromFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container(o: FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container(o)
    return w.result
  }

  def toFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container(data: ISZ[U8]): Either[FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container, MessagePack.ErrorMsg] = {
    def fFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container(reader: Reader): FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container = {
      val r = reader.readFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container()
      return r
    }
    val r = to(data, fFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container _)
    return r
  }

  def fromFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_P(o: FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_P(o)
    return w.result
  }

  def toFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_P(data: ISZ[U8]): Either[FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_P(reader: Reader): FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_P = {
      val r = reader.readFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_P()
      return r
    }
    val r = to(data, fFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_P _)
    return r
  }

  def fromFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PS(o: FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PS(o)
    return w.result
  }

  def toFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PS(data: ISZ[U8]): Either[FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PS(reader: Reader): FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PS = {
      val r = reader.readFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PS()
      return r
    }
    val r = to(data, fFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PS _)
    return r
  }

  def fromFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container(o: FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container(o)
    return w.result
  }

  def toFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container(data: ISZ[U8]): Either[FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container, MessagePack.ErrorMsg] = {
    def fFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container(reader: Reader): FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container = {
      val r = reader.readFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container()
      return r
    }
    val r = to(data, fFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container _)
    return r
  }

  def fromFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_P(o: FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_P(o)
    return w.result
  }

  def toFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_P(data: ISZ[U8]): Either[FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_P(reader: Reader): FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_P = {
      val r = reader.readFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_P()
      return r
    }
    val r = to(data, fFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_P _)
    return r
  }

  def fromFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PS(o: FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PS(o)
    return w.result
  }

  def toFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PS(data: ISZ[U8]): Either[FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PS(reader: Reader): FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PS = {
      val r = reader.readFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PS()
      return r
    }
    val r = to(data, fFAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PS _)
    return r
  }

  def fromFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container(o: FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container(o)
    return w.result
  }

  def toFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container(data: ISZ[U8]): Either[FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container, MessagePack.ErrorMsg] = {
    def fFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container(reader: Reader): FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container = {
      val r = reader.readFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container()
      return r
    }
    val r = to(data, fFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container _)
    return r
  }

  def fromFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_P(o: FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_P(o)
    return w.result
  }

  def toFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_P(data: ISZ[U8]): Either[FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_P(reader: Reader): FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_P = {
      val r = reader.readFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_P()
      return r
    }
    val r = to(data, fFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_P _)
    return r
  }

  def fromFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PS(o: FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PS(o)
    return w.result
  }

  def toFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PS(data: ISZ[U8]): Either[FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PS(reader: Reader): FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PS = {
      val r = reader.readFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PS()
      return r
    }
    val r = to(data, fFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PS _)
    return r
  }

  def fromFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container(o: FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container(o)
    return w.result
  }

  def toFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container(data: ISZ[U8]): Either[FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container, MessagePack.ErrorMsg] = {
    def fFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container(reader: Reader): FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container = {
      val r = reader.readFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container()
      return r
    }
    val r = to(data, fFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container _)
    return r
  }

  def fromFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_P(o: FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_P(o)
    return w.result
  }

  def toFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_P(data: ISZ[U8]): Either[FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_P(reader: Reader): FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_P = {
      val r = reader.readFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_P()
      return r
    }
    val r = to(data, fFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_P _)
    return r
  }

  def fromFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PS(o: FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PS(o)
    return w.result
  }

  def toFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PS(data: ISZ[U8]): Either[FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PS(reader: Reader): FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PS = {
      val r = reader.readFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PS()
      return r
    }
    val r = to(data, fFAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PS _)
    return r
  }

  def fromFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container(o: FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container(o)
    return w.result
  }

  def toFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container(data: ISZ[U8]): Either[FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container, MessagePack.ErrorMsg] = {
    def fFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container(reader: Reader): FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container = {
      val r = reader.readFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container()
      return r
    }
    val r = to(data, fFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container _)
    return r
  }

  def fromFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_P(o: FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_P(o)
    return w.result
  }

  def toFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_P(data: ISZ[U8]): Either[FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_P(reader: Reader): FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_P = {
      val r = reader.readFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_P()
      return r
    }
    val r = to(data, fFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_P _)
    return r
  }

  def fromFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PS(o: FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PS(o)
    return w.result
  }

  def toFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PS(data: ISZ[U8]): Either[FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PS(reader: Reader): FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PS = {
      val r = reader.readFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PS()
      return r
    }
    val r = to(data, fFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PS _)
    return r
  }

  def fromFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container(o: FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container(o)
    return w.result
  }

  def toFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container(data: ISZ[U8]): Either[FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container, MessagePack.ErrorMsg] = {
    def fFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container(reader: Reader): FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container = {
      val r = reader.readFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container()
      return r
    }
    val r = to(data, fFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container _)
    return r
  }

  def fromFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_P(o: FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_P(o)
    return w.result
  }

  def toFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_P(data: ISZ[U8]): Either[FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_P(reader: Reader): FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_P = {
      val r = reader.readFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_P()
      return r
    }
    val r = to(data, fFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_P _)
    return r
  }

  def fromFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PS(o: FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PS(o)
    return w.result
  }

  def toFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PS(data: ISZ[U8]): Either[FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PS(reader: Reader): FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PS = {
      val r = reader.readFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PS()
      return r
    }
    val r = to(data, fFAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PS _)
    return r
  }

  def fromFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container(o: FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container(o)
    return w.result
  }

  def toFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container(data: ISZ[U8]): Either[FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container, MessagePack.ErrorMsg] = {
    def fFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container(reader: Reader): FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container = {
      val r = reader.readFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container()
      return r
    }
    val r = to(data, fFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container _)
    return r
  }

  def fromFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_P(o: FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_P(o)
    return w.result
  }

  def toFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_P(data: ISZ[U8]): Either[FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_P(reader: Reader): FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_P = {
      val r = reader.readFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_P()
      return r
    }
    val r = to(data, fFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_P _)
    return r
  }

  def fromFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PS(o: FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PS(o)
    return w.result
  }

  def toFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PS(data: ISZ[U8]): Either[FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PS(reader: Reader): FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PS = {
      val r = reader.readFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PS()
      return r
    }
    val r = to(data, fFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PS _)
    return r
  }

  def fromFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container(o: FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container(o)
    return w.result
  }

  def toFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container(data: ISZ[U8]): Either[FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container, MessagePack.ErrorMsg] = {
    def fFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container(reader: Reader): FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container = {
      val r = reader.readFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container()
      return r
    }
    val r = to(data, fFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container _)
    return r
  }

  def fromFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_P(o: FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_P(o)
    return w.result
  }

  def toFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_P(data: ISZ[U8]): Either[FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_P(reader: Reader): FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_P = {
      val r = reader.readFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_P()
      return r
    }
    val r = to(data, fFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_P _)
    return r
  }

  def fromFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PS(o: FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PS(o)
    return w.result
  }

  def toFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PS(data: ISZ[U8]): Either[FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PS(reader: Reader): FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PS = {
      val r = reader.readFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PS()
      return r
    }
    val r = to(data, fFAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PS _)
    return r
  }

  def fromutilContainer(o: util.Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeutilContainer(o)
    return w.result
  }

  def toutilContainer(data: ISZ[U8]): Either[util.Container, MessagePack.ErrorMsg] = {
    def futilContainer(reader: Reader): util.Container = {
      val r = reader.readutilContainer()
      return r
    }
    val r = to(data, futilContainer _)
    return r
  }

  def fromutilEmptyContainer(o: util.EmptyContainer, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeutilEmptyContainer(o)
    return w.result
  }

  def toutilEmptyContainer(data: ISZ[U8]): Either[util.EmptyContainer, MessagePack.ErrorMsg] = {
    def futilEmptyContainer(reader: Reader): util.EmptyContainer = {
      val r = reader.readutilEmptyContainer()
      return r
    }
    val r = to(data, futilEmptyContainer _)
    return r
  }

  def from_artDataContent(o: art.DataContent, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_artDataContent(o)
    return w.result
  }

  def to_artDataContent(data: ISZ[U8]): Either[art.DataContent, MessagePack.ErrorMsg] = {
    def f_artDataContent(reader: Reader): art.DataContent = {
      val r = reader.read_artDataContent()
      return r
    }
    val r = to(data, f_artDataContent _)
    return r
  }

  def from_artEmpty(o: art.Empty, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_artEmpty(o)
    return w.result
  }

  def to_artEmpty(data: ISZ[U8]): Either[art.Empty, MessagePack.ErrorMsg] = {
    def f_artEmpty(reader: Reader): art.Empty = {
      val r = reader.read_artEmpty()
      return r
    }
    val r = to(data, f_artEmpty _)
    return r
  }

}