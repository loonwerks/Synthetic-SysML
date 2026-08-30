// #Sireum
// @formatter:off

// This file is auto-generated from Engage_AP_Command.scala, Engage_Command_Status.scala, Guidance_Readiness.scala, Attitude_Acceptability.scala, AP_Availability.scala, AP_Guidance_Request.scala, AP_Status.scala, AP_On_Indication.scala, Base_Types.scala, FCI_Command_Intake_Thread_control_process_fci_command_intake_Containers.scala, Engagement_Decision_Thread_control_process_engagement_decision_Containers.scala, Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_Containers.scala, Status_Reporting_Thread_control_process_status_reporting_Containers.scala, CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package faa_autopilot_engagement

import org.sireum._

object MsgPack {

  object Constants {

    val FAA_Autopilot_EngagementEngage_AP_Command_Payload: Z = -32

    val FAA_Autopilot_EngagementEngage_Command_Status_Payload: Z = -31

    val FAA_Autopilot_EngagementGuidance_Readiness_Payload: Z = -30

    val FAA_Autopilot_EngagementAttitude_Acceptability_Payload: Z = -29

    val FAA_Autopilot_EngagementAP_Availability_Payload: Z = -28

    val FAA_Autopilot_EngagementAP_Guidance_Request_Payload: Z = -27

    val FAA_Autopilot_EngagementAP_Status_Payload: Z = -26

    val FAA_Autopilot_EngagementAP_On_Indication_Payload: Z = -25

    val Base_TypesBoolean_Payload: Z = -24

    val Base_TypesInteger_Payload: Z = -23

    val Base_TypesInteger_8_Payload: Z = -22

    val Base_TypesInteger_16_Payload: Z = -21

    val Base_TypesInteger_32_Payload: Z = -20

    val Base_TypesInteger_64_Payload: Z = -19

    val Base_TypesUnsigned_8_Payload: Z = -18

    val Base_TypesUnsigned_16_Payload: Z = -17

    val Base_TypesUnsigned_32_Payload: Z = -16

    val Base_TypesUnsigned_64_Payload: Z = -15

    val Base_TypesFloat_Payload: Z = -14

    val Base_TypesFloat_32_Payload: Z = -13

    val Base_TypesFloat_64_Payload: Z = -12

    val Base_TypesCharacter_Payload: Z = -11

    val Base_TypesString_Payload: Z = -10

    val Base_TypesBits_Payload: Z = -9

    val FAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_P: Z = -8

    val FAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PS: Z = -7

    val FAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_P: Z = -6

    val FAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PS: Z = -5

    val FAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_P: Z = -4

    val FAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PS: Z = -3

    val FAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_P: Z = -2

    val FAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PS: Z = -1

    val FAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_P: Z = 0

    val FAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PS: Z = 1

    val FAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_P: Z = 2

    val FAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PS: Z = 3

    val FAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_P: Z = 4

    val FAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_PS: Z = 5

    val FAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_P: Z = 6

    val FAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_PS: Z = 7

    val FAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_P: Z = 8

    val FAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PS: Z = 9

    val FAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_P: Z = 10

    val FAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PS: Z = 11

    val utilEmptyContainer: Z = 12

    val _artEmpty: Z = 13

  }

  object Writer {

    @record class Default(val writer: MessagePack.Writer.Impl) extends Writer

  }

  @msig trait Writer {

    def writer: MessagePack.Writer

    def writeFAA_Autopilot_EngagementEngage_AP_CommandType(o: FAA_Autopilot_Engagement.Engage_AP_Command.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFAA_Autopilot_EngagementEngage_AP_Command_Payload(o: FAA_Autopilot_Engagement.Engage_AP_Command_Payload): Unit = {
      writer.writeZ(Constants.FAA_Autopilot_EngagementEngage_AP_Command_Payload)
      writeFAA_Autopilot_EngagementEngage_AP_CommandType(o.value)
    }

    def writeFAA_Autopilot_EngagementEngage_Command_StatusType(o: FAA_Autopilot_Engagement.Engage_Command_Status.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFAA_Autopilot_EngagementEngage_Command_Status_Payload(o: FAA_Autopilot_Engagement.Engage_Command_Status_Payload): Unit = {
      writer.writeZ(Constants.FAA_Autopilot_EngagementEngage_Command_Status_Payload)
      writeFAA_Autopilot_EngagementEngage_Command_StatusType(o.value)
    }

    def writeFAA_Autopilot_EngagementGuidance_ReadinessType(o: FAA_Autopilot_Engagement.Guidance_Readiness.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFAA_Autopilot_EngagementGuidance_Readiness_Payload(o: FAA_Autopilot_Engagement.Guidance_Readiness_Payload): Unit = {
      writer.writeZ(Constants.FAA_Autopilot_EngagementGuidance_Readiness_Payload)
      writeFAA_Autopilot_EngagementGuidance_ReadinessType(o.value)
    }

    def writeFAA_Autopilot_EngagementAttitude_AcceptabilityType(o: FAA_Autopilot_Engagement.Attitude_Acceptability.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFAA_Autopilot_EngagementAttitude_Acceptability_Payload(o: FAA_Autopilot_Engagement.Attitude_Acceptability_Payload): Unit = {
      writer.writeZ(Constants.FAA_Autopilot_EngagementAttitude_Acceptability_Payload)
      writeFAA_Autopilot_EngagementAttitude_AcceptabilityType(o.value)
    }

    def writeFAA_Autopilot_EngagementAP_AvailabilityType(o: FAA_Autopilot_Engagement.AP_Availability.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFAA_Autopilot_EngagementAP_Availability_Payload(o: FAA_Autopilot_Engagement.AP_Availability_Payload): Unit = {
      writer.writeZ(Constants.FAA_Autopilot_EngagementAP_Availability_Payload)
      writeFAA_Autopilot_EngagementAP_AvailabilityType(o.value)
    }

    def writeFAA_Autopilot_EngagementAP_Guidance_RequestType(o: FAA_Autopilot_Engagement.AP_Guidance_Request.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFAA_Autopilot_EngagementAP_Guidance_Request_Payload(o: FAA_Autopilot_Engagement.AP_Guidance_Request_Payload): Unit = {
      writer.writeZ(Constants.FAA_Autopilot_EngagementAP_Guidance_Request_Payload)
      writeFAA_Autopilot_EngagementAP_Guidance_RequestType(o.value)
    }

    def writeFAA_Autopilot_EngagementAP_StatusType(o: FAA_Autopilot_Engagement.AP_Status.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFAA_Autopilot_EngagementAP_Status_Payload(o: FAA_Autopilot_Engagement.AP_Status_Payload): Unit = {
      writer.writeZ(Constants.FAA_Autopilot_EngagementAP_Status_Payload)
      writeFAA_Autopilot_EngagementAP_StatusType(o.value)
    }

    def writeFAA_Autopilot_EngagementAP_On_IndicationType(o: FAA_Autopilot_Engagement.AP_On_Indication.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFAA_Autopilot_EngagementAP_On_Indication_Payload(o: FAA_Autopilot_Engagement.AP_On_Indication_Payload): Unit = {
      writer.writeZ(Constants.FAA_Autopilot_EngagementAP_On_Indication_Payload)
      writeFAA_Autopilot_EngagementAP_On_IndicationType(o.value)
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

    def writeFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container(o: FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container): Unit = {
      o match {
        case o: FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_P => writeFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_P(o)
        case o: FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PS => writeFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PS(o)
      }
    }

    def writeFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_P(o: FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_P): Unit = {
      writer.writeZ(Constants.FAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_P)
      writeFAA_Autopilot_EngagementEngage_Command_StatusType(o.api_command_status_in)
      writeFAA_Autopilot_EngagementEngage_AP_CommandType(o.api_engage_ap_in)
    }

    def writeFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PS(o: FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.FAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PS)
      writeFAA_Autopilot_EngagementEngage_Command_StatusType(o.api_command_status_in)
      writeFAA_Autopilot_EngagementEngage_AP_CommandType(o.api_engage_ap_in)
    }

    def writeFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container(o: FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container): Unit = {
      o match {
        case o: FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_P => writeFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_P(o)
        case o: FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PS => writeFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PS(o)
      }
    }

    def writeFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_P(o: FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_P): Unit = {
      writer.writeZ(Constants.FAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_P)
      writeFAA_Autopilot_EngagementEngage_Command_StatusType(o.api_command_status_out)
      writeFAA_Autopilot_EngagementEngage_AP_CommandType(o.api_engage_ap_out)
    }

    def writeFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PS(o: FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.FAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PS)
      writeFAA_Autopilot_EngagementEngage_Command_StatusType(o.api_command_status_out)
      writeFAA_Autopilot_EngagementEngage_AP_CommandType(o.api_engage_ap_out)
    }

    def writeFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container(o: FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PreState_Container): Unit = {
      o match {
        case o: FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PreState_Container_P => writeFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_P(o)
        case o: FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PS => writeFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PS(o)
      }
    }

    def writeFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_P(o: FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PreState_Container_P): Unit = {
      writer.writeZ(Constants.FAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_P)
      writeFAA_Autopilot_EngagementAP_AvailabilityType(o.api_ap_availability)
      writeFAA_Autopilot_EngagementAttitude_AcceptabilityType(o.api_attitude_acceptable)
      writeFAA_Autopilot_EngagementEngage_Command_StatusType(o.api_command_status)
      writeFAA_Autopilot_EngagementEngage_AP_CommandType(o.api_engage_ap)
      writeFAA_Autopilot_EngagementGuidance_ReadinessType(o.api_guidance_valid)
    }

    def writeFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PS(o: FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.FAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PS)
      writeFAA_Autopilot_EngagementAP_AvailabilityType(o.api_ap_availability)
      writeFAA_Autopilot_EngagementAttitude_AcceptabilityType(o.api_attitude_acceptable)
      writeFAA_Autopilot_EngagementEngage_Command_StatusType(o.api_command_status)
      writeFAA_Autopilot_EngagementEngage_AP_CommandType(o.api_engage_ap)
      writeFAA_Autopilot_EngagementGuidance_ReadinessType(o.api_guidance_valid)
    }

    def writeFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container(o: FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PostState_Container): Unit = {
      o match {
        case o: FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PostState_Container_P => writeFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_P(o)
        case o: FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PS => writeFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PS(o)
      }
    }

    def writeFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_P(o: FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PostState_Container_P): Unit = {
      writer.writeZ(Constants.FAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_P)
      writeFAA_Autopilot_EngagementAP_Guidance_RequestType(o.api_ap_guidance_request)
      writeFAA_Autopilot_EngagementAP_On_IndicationType(o.api_ap_on)
      writeFAA_Autopilot_EngagementAP_StatusType(o.api_ap_status)
    }

    def writeFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PS(o: FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.FAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PS)
      writeFAA_Autopilot_EngagementAP_Guidance_RequestType(o.api_ap_guidance_request)
      writeFAA_Autopilot_EngagementAP_On_IndicationType(o.api_ap_on)
      writeFAA_Autopilot_EngagementAP_StatusType(o.api_ap_status)
    }

    def writeFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container(o: FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container): Unit = {
      o match {
        case o: FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_P => writeFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_P(o)
        case o: FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PS => writeFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PS(o)
      }
    }

    def writeFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_P(o: FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_P): Unit = {
      writer.writeZ(Constants.FAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_P)
      writeFAA_Autopilot_EngagementAP_Guidance_RequestType(o.api_request_in)
    }

    def writeFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PS(o: FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.FAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PS)
      writeFAA_Autopilot_EngagementAP_Guidance_RequestType(o.api_request_in)
    }

    def writeFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container(o: FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container): Unit = {
      o match {
        case o: FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_P => writeFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_P(o)
        case o: FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PS => writeFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PS(o)
      }
    }

    def writeFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_P(o: FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_P): Unit = {
      writer.writeZ(Constants.FAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_P)
      writeFAA_Autopilot_EngagementAP_Guidance_RequestType(o.api_request_out)
    }

    def writeFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PS(o: FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.FAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PS)
      writeFAA_Autopilot_EngagementAP_Guidance_RequestType(o.api_request_out)
    }

    def writeFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container(o: FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PreState_Container): Unit = {
      o match {
        case o: FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PreState_Container_P => writeFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_P(o)
        case o: FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PreState_Container_PS => writeFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_PS(o)
      }
    }

    def writeFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_P(o: FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PreState_Container_P): Unit = {
      writer.writeZ(Constants.FAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_P)
      writeFAA_Autopilot_EngagementAP_StatusType(o.api_status_in)
    }

    def writeFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_PS(o: FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.FAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_PS)
      writeFAA_Autopilot_EngagementAP_StatusType(o.api_status_in)
    }

    def writeFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container(o: FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PostState_Container): Unit = {
      o match {
        case o: FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PostState_Container_P => writeFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_P(o)
        case o: FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PostState_Container_PS => writeFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_PS(o)
      }
    }

    def writeFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_P(o: FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PostState_Container_P): Unit = {
      writer.writeZ(Constants.FAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_P)
      writeFAA_Autopilot_EngagementAP_StatusType(o.api_status_out)
    }

    def writeFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_PS(o: FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.FAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_PS)
      writeFAA_Autopilot_EngagementAP_StatusType(o.api_status_out)
    }

    def writeFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container(o: FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container): Unit = {
      o match {
        case o: FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_P => writeFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_P(o)
        case o: FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PS => writeFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PS(o)
      }
    }

    def writeFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_P(o: FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_P): Unit = {
      writer.writeZ(Constants.FAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_P)
      writeFAA_Autopilot_EngagementAP_On_IndicationType(o.api_ap_on_in)
    }

    def writeFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PS(o: FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.FAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PS)
      writeFAA_Autopilot_EngagementAP_On_IndicationType(o.api_ap_on_in)
    }

    def writeFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container(o: FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container): Unit = {
      o match {
        case o: FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_P => writeFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_P(o)
        case o: FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PS => writeFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PS(o)
      }
    }

    def writeFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_P(o: FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_P): Unit = {
      writer.writeZ(Constants.FAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_P)
      writeFAA_Autopilot_EngagementAP_On_IndicationType(o.api_ap_on_out)
    }

    def writeFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PS(o: FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.FAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PS)
      writeFAA_Autopilot_EngagementAP_On_IndicationType(o.api_ap_on_out)
    }

    def writeruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeutilContainer(o: util.Container): Unit = {
      o match {
        case o: util.EmptyContainer => writeutilEmptyContainer(o)
        case o: FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PreState_Container_P => writeFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_P(o)
        case o: FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PreState_Container_PS => writeFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_PS(o)
        case o: FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PostState_Container_P => writeFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_P(o)
        case o: FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PostState_Container_PS => writeFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_PS(o)
        case o: FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_P => writeFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_P(o)
        case o: FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PS => writeFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PS(o)
        case o: FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_P => writeFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_P(o)
        case o: FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PS => writeFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PS(o)
        case o: FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_P => writeFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_P(o)
        case o: FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PreState_Container_P => writeFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_P(o)
        case o: FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PS => writeFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PS(o)
        case o: FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_P => writeFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_P(o)
        case o: FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PS => writeFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PS(o)
        case o: FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PS => writeFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PS(o)
        case o: FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PostState_Container_P => writeFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_P(o)
        case o: FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PS => writeFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PS(o)
        case o: FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_P => writeFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_P(o)
        case o: FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PS => writeFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PS(o)
        case o: FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_P => writeFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_P(o)
        case o: FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PS => writeFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PS(o)
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
        case o: FAA_Autopilot_Engagement.AP_Status_Payload => writeFAA_Autopilot_EngagementAP_Status_Payload(o)
        case o: FAA_Autopilot_Engagement.AP_Availability_Payload => writeFAA_Autopilot_EngagementAP_Availability_Payload(o)
        case o: FAA_Autopilot_Engagement.AP_On_Indication_Payload => writeFAA_Autopilot_EngagementAP_On_Indication_Payload(o)
        case o: FAA_Autopilot_Engagement.Engage_AP_Command_Payload => writeFAA_Autopilot_EngagementEngage_AP_Command_Payload(o)
        case o: FAA_Autopilot_Engagement.Guidance_Readiness_Payload => writeFAA_Autopilot_EngagementGuidance_Readiness_Payload(o)
        case o: FAA_Autopilot_Engagement.AP_Guidance_Request_Payload => writeFAA_Autopilot_EngagementAP_Guidance_Request_Payload(o)
        case o: FAA_Autopilot_Engagement.Engage_Command_Status_Payload => writeFAA_Autopilot_EngagementEngage_Command_Status_Payload(o)
        case o: FAA_Autopilot_Engagement.Attitude_Acceptability_Payload => writeFAA_Autopilot_EngagementAttitude_Acceptability_Payload(o)
        case o: FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PreState_Container_P => writeFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_P(o)
        case o: FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PreState_Container_PS => writeFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_PS(o)
        case o: FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PostState_Container_P => writeFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_P(o)
        case o: FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PostState_Container_PS => writeFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_PS(o)
        case o: FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_P => writeFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_P(o)
        case o: FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PS => writeFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PS(o)
        case o: FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_P => writeFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_P(o)
        case o: FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PS => writeFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PS(o)
        case o: FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_P => writeFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_P(o)
        case o: FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PreState_Container_P => writeFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_P(o)
        case o: FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PS => writeFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PS(o)
        case o: FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_P => writeFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_P(o)
        case o: FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PS => writeFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PS(o)
        case o: FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PS => writeFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PS(o)
        case o: FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PostState_Container_P => writeFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_P(o)
        case o: FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PS => writeFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PS(o)
        case o: FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_P => writeFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_P(o)
        case o: FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PS => writeFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PS(o)
        case o: FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_P => writeFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_P(o)
        case o: FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PS => writeFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PS(o)
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

    def readFAA_Autopilot_EngagementEngage_AP_CommandType(): FAA_Autopilot_Engagement.Engage_AP_Command.Type = {
      val r = reader.readZ()
      return FAA_Autopilot_Engagement.Engage_AP_Command.byOrdinal(r).get
    }

    def readFAA_Autopilot_EngagementEngage_AP_Command_Payload(): FAA_Autopilot_Engagement.Engage_AP_Command_Payload = {
      val r = readFAA_Autopilot_EngagementEngage_AP_Command_PayloadT(F)
      return r
    }

    def readFAA_Autopilot_EngagementEngage_AP_Command_PayloadT(typeParsed: B): FAA_Autopilot_Engagement.Engage_AP_Command_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.FAA_Autopilot_EngagementEngage_AP_Command_Payload)
      }
      val value = readFAA_Autopilot_EngagementEngage_AP_CommandType()
      return FAA_Autopilot_Engagement.Engage_AP_Command_Payload(value)
    }

    def readFAA_Autopilot_EngagementEngage_Command_StatusType(): FAA_Autopilot_Engagement.Engage_Command_Status.Type = {
      val r = reader.readZ()
      return FAA_Autopilot_Engagement.Engage_Command_Status.byOrdinal(r).get
    }

    def readFAA_Autopilot_EngagementEngage_Command_Status_Payload(): FAA_Autopilot_Engagement.Engage_Command_Status_Payload = {
      val r = readFAA_Autopilot_EngagementEngage_Command_Status_PayloadT(F)
      return r
    }

    def readFAA_Autopilot_EngagementEngage_Command_Status_PayloadT(typeParsed: B): FAA_Autopilot_Engagement.Engage_Command_Status_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.FAA_Autopilot_EngagementEngage_Command_Status_Payload)
      }
      val value = readFAA_Autopilot_EngagementEngage_Command_StatusType()
      return FAA_Autopilot_Engagement.Engage_Command_Status_Payload(value)
    }

    def readFAA_Autopilot_EngagementGuidance_ReadinessType(): FAA_Autopilot_Engagement.Guidance_Readiness.Type = {
      val r = reader.readZ()
      return FAA_Autopilot_Engagement.Guidance_Readiness.byOrdinal(r).get
    }

    def readFAA_Autopilot_EngagementGuidance_Readiness_Payload(): FAA_Autopilot_Engagement.Guidance_Readiness_Payload = {
      val r = readFAA_Autopilot_EngagementGuidance_Readiness_PayloadT(F)
      return r
    }

    def readFAA_Autopilot_EngagementGuidance_Readiness_PayloadT(typeParsed: B): FAA_Autopilot_Engagement.Guidance_Readiness_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.FAA_Autopilot_EngagementGuidance_Readiness_Payload)
      }
      val value = readFAA_Autopilot_EngagementGuidance_ReadinessType()
      return FAA_Autopilot_Engagement.Guidance_Readiness_Payload(value)
    }

    def readFAA_Autopilot_EngagementAttitude_AcceptabilityType(): FAA_Autopilot_Engagement.Attitude_Acceptability.Type = {
      val r = reader.readZ()
      return FAA_Autopilot_Engagement.Attitude_Acceptability.byOrdinal(r).get
    }

    def readFAA_Autopilot_EngagementAttitude_Acceptability_Payload(): FAA_Autopilot_Engagement.Attitude_Acceptability_Payload = {
      val r = readFAA_Autopilot_EngagementAttitude_Acceptability_PayloadT(F)
      return r
    }

    def readFAA_Autopilot_EngagementAttitude_Acceptability_PayloadT(typeParsed: B): FAA_Autopilot_Engagement.Attitude_Acceptability_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.FAA_Autopilot_EngagementAttitude_Acceptability_Payload)
      }
      val value = readFAA_Autopilot_EngagementAttitude_AcceptabilityType()
      return FAA_Autopilot_Engagement.Attitude_Acceptability_Payload(value)
    }

    def readFAA_Autopilot_EngagementAP_AvailabilityType(): FAA_Autopilot_Engagement.AP_Availability.Type = {
      val r = reader.readZ()
      return FAA_Autopilot_Engagement.AP_Availability.byOrdinal(r).get
    }

    def readFAA_Autopilot_EngagementAP_Availability_Payload(): FAA_Autopilot_Engagement.AP_Availability_Payload = {
      val r = readFAA_Autopilot_EngagementAP_Availability_PayloadT(F)
      return r
    }

    def readFAA_Autopilot_EngagementAP_Availability_PayloadT(typeParsed: B): FAA_Autopilot_Engagement.AP_Availability_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.FAA_Autopilot_EngagementAP_Availability_Payload)
      }
      val value = readFAA_Autopilot_EngagementAP_AvailabilityType()
      return FAA_Autopilot_Engagement.AP_Availability_Payload(value)
    }

    def readFAA_Autopilot_EngagementAP_Guidance_RequestType(): FAA_Autopilot_Engagement.AP_Guidance_Request.Type = {
      val r = reader.readZ()
      return FAA_Autopilot_Engagement.AP_Guidance_Request.byOrdinal(r).get
    }

    def readFAA_Autopilot_EngagementAP_Guidance_Request_Payload(): FAA_Autopilot_Engagement.AP_Guidance_Request_Payload = {
      val r = readFAA_Autopilot_EngagementAP_Guidance_Request_PayloadT(F)
      return r
    }

    def readFAA_Autopilot_EngagementAP_Guidance_Request_PayloadT(typeParsed: B): FAA_Autopilot_Engagement.AP_Guidance_Request_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.FAA_Autopilot_EngagementAP_Guidance_Request_Payload)
      }
      val value = readFAA_Autopilot_EngagementAP_Guidance_RequestType()
      return FAA_Autopilot_Engagement.AP_Guidance_Request_Payload(value)
    }

    def readFAA_Autopilot_EngagementAP_StatusType(): FAA_Autopilot_Engagement.AP_Status.Type = {
      val r = reader.readZ()
      return FAA_Autopilot_Engagement.AP_Status.byOrdinal(r).get
    }

    def readFAA_Autopilot_EngagementAP_Status_Payload(): FAA_Autopilot_Engagement.AP_Status_Payload = {
      val r = readFAA_Autopilot_EngagementAP_Status_PayloadT(F)
      return r
    }

    def readFAA_Autopilot_EngagementAP_Status_PayloadT(typeParsed: B): FAA_Autopilot_Engagement.AP_Status_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.FAA_Autopilot_EngagementAP_Status_Payload)
      }
      val value = readFAA_Autopilot_EngagementAP_StatusType()
      return FAA_Autopilot_Engagement.AP_Status_Payload(value)
    }

    def readFAA_Autopilot_EngagementAP_On_IndicationType(): FAA_Autopilot_Engagement.AP_On_Indication.Type = {
      val r = reader.readZ()
      return FAA_Autopilot_Engagement.AP_On_Indication.byOrdinal(r).get
    }

    def readFAA_Autopilot_EngagementAP_On_Indication_Payload(): FAA_Autopilot_Engagement.AP_On_Indication_Payload = {
      val r = readFAA_Autopilot_EngagementAP_On_Indication_PayloadT(F)
      return r
    }

    def readFAA_Autopilot_EngagementAP_On_Indication_PayloadT(typeParsed: B): FAA_Autopilot_Engagement.AP_On_Indication_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.FAA_Autopilot_EngagementAP_On_Indication_Payload)
      }
      val value = readFAA_Autopilot_EngagementAP_On_IndicationType()
      return FAA_Autopilot_Engagement.AP_On_Indication_Payload(value)
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

    def readFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container(): FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.FAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_P => val r = readFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PT(T); return r
        case Constants.FAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PS => val r = readFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container.")
          val r = readFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PST(T)
          return r
      }
    }

    def readFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_P(): FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_P = {
      val r = readFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PT(F)
      return r
    }

    def readFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PT(typeParsed: B): FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.FAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_P)
      }
      val api_command_status_in = readFAA_Autopilot_EngagementEngage_Command_StatusType()
      val api_engage_ap_in = readFAA_Autopilot_EngagementEngage_AP_CommandType()
      return FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_P(api_command_status_in, api_engage_ap_in)
    }

    def readFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PS(): FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PS = {
      val r = readFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PST(F)
      return r
    }

    def readFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PST(typeParsed: B): FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.FAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PS)
      }
      val api_command_status_in = readFAA_Autopilot_EngagementEngage_Command_StatusType()
      val api_engage_ap_in = readFAA_Autopilot_EngagementEngage_AP_CommandType()
      return FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PS(api_command_status_in, api_engage_ap_in)
    }

    def readFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container(): FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.FAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_P => val r = readFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PT(T); return r
        case Constants.FAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PS => val r = readFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container.")
          val r = readFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PST(T)
          return r
      }
    }

    def readFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_P(): FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_P = {
      val r = readFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PT(F)
      return r
    }

    def readFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PT(typeParsed: B): FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.FAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_P)
      }
      val api_command_status_out = readFAA_Autopilot_EngagementEngage_Command_StatusType()
      val api_engage_ap_out = readFAA_Autopilot_EngagementEngage_AP_CommandType()
      return FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_P(api_command_status_out, api_engage_ap_out)
    }

    def readFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PS(): FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PS = {
      val r = readFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PST(F)
      return r
    }

    def readFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PST(typeParsed: B): FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.FAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PS)
      }
      val api_command_status_out = readFAA_Autopilot_EngagementEngage_Command_StatusType()
      val api_engage_ap_out = readFAA_Autopilot_EngagementEngage_AP_CommandType()
      return FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PS(api_command_status_out, api_engage_ap_out)
    }

    def readFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container(): FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.FAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_P => val r = readFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PT(T); return r
        case Constants.FAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PS => val r = readFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PreState_Container.")
          val r = readFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PST(T)
          return r
      }
    }

    def readFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_P(): FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PreState_Container_P = {
      val r = readFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PT(F)
      return r
    }

    def readFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PT(typeParsed: B): FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.FAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_P)
      }
      val api_ap_availability = readFAA_Autopilot_EngagementAP_AvailabilityType()
      val api_attitude_acceptable = readFAA_Autopilot_EngagementAttitude_AcceptabilityType()
      val api_command_status = readFAA_Autopilot_EngagementEngage_Command_StatusType()
      val api_engage_ap = readFAA_Autopilot_EngagementEngage_AP_CommandType()
      val api_guidance_valid = readFAA_Autopilot_EngagementGuidance_ReadinessType()
      return FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PreState_Container_P(api_ap_availability, api_attitude_acceptable, api_command_status, api_engage_ap, api_guidance_valid)
    }

    def readFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PS(): FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PS = {
      val r = readFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PST(F)
      return r
    }

    def readFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PST(typeParsed: B): FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.FAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PS)
      }
      val api_ap_availability = readFAA_Autopilot_EngagementAP_AvailabilityType()
      val api_attitude_acceptable = readFAA_Autopilot_EngagementAttitude_AcceptabilityType()
      val api_command_status = readFAA_Autopilot_EngagementEngage_Command_StatusType()
      val api_engage_ap = readFAA_Autopilot_EngagementEngage_AP_CommandType()
      val api_guidance_valid = readFAA_Autopilot_EngagementGuidance_ReadinessType()
      return FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PS(api_ap_availability, api_attitude_acceptable, api_command_status, api_engage_ap, api_guidance_valid)
    }

    def readFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container(): FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.FAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_P => val r = readFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PT(T); return r
        case Constants.FAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PS => val r = readFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PostState_Container.")
          val r = readFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PST(T)
          return r
      }
    }

    def readFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_P(): FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PostState_Container_P = {
      val r = readFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PT(F)
      return r
    }

    def readFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PT(typeParsed: B): FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.FAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_P)
      }
      val api_ap_guidance_request = readFAA_Autopilot_EngagementAP_Guidance_RequestType()
      val api_ap_on = readFAA_Autopilot_EngagementAP_On_IndicationType()
      val api_ap_status = readFAA_Autopilot_EngagementAP_StatusType()
      return FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PostState_Container_P(api_ap_guidance_request, api_ap_on, api_ap_status)
    }

    def readFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PS(): FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PS = {
      val r = readFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PST(F)
      return r
    }

    def readFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PST(typeParsed: B): FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.FAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PS)
      }
      val api_ap_guidance_request = readFAA_Autopilot_EngagementAP_Guidance_RequestType()
      val api_ap_on = readFAA_Autopilot_EngagementAP_On_IndicationType()
      val api_ap_status = readFAA_Autopilot_EngagementAP_StatusType()
      return FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PS(api_ap_guidance_request, api_ap_on, api_ap_status)
    }

    def readFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container(): FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.FAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_P => val r = readFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PT(T); return r
        case Constants.FAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PS => val r = readFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container.")
          val r = readFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PST(T)
          return r
      }
    }

    def readFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_P(): FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_P = {
      val r = readFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PT(F)
      return r
    }

    def readFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PT(typeParsed: B): FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.FAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_P)
      }
      val api_request_in = readFAA_Autopilot_EngagementAP_Guidance_RequestType()
      return FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_P(api_request_in)
    }

    def readFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PS(): FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PS = {
      val r = readFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PST(F)
      return r
    }

    def readFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PST(typeParsed: B): FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.FAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PS)
      }
      val api_request_in = readFAA_Autopilot_EngagementAP_Guidance_RequestType()
      return FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PS(api_request_in)
    }

    def readFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container(): FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.FAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_P => val r = readFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PT(T); return r
        case Constants.FAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PS => val r = readFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container.")
          val r = readFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PST(T)
          return r
      }
    }

    def readFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_P(): FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_P = {
      val r = readFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PT(F)
      return r
    }

    def readFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PT(typeParsed: B): FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.FAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_P)
      }
      val api_request_out = readFAA_Autopilot_EngagementAP_Guidance_RequestType()
      return FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_P(api_request_out)
    }

    def readFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PS(): FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PS = {
      val r = readFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PST(F)
      return r
    }

    def readFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PST(typeParsed: B): FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.FAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PS)
      }
      val api_request_out = readFAA_Autopilot_EngagementAP_Guidance_RequestType()
      return FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PS(api_request_out)
    }

    def readFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container(): FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.FAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_P => val r = readFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_PT(T); return r
        case Constants.FAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_PS => val r = readFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PreState_Container.")
          val r = readFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_PST(T)
          return r
      }
    }

    def readFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_P(): FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PreState_Container_P = {
      val r = readFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_PT(F)
      return r
    }

    def readFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_PT(typeParsed: B): FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.FAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_P)
      }
      val api_status_in = readFAA_Autopilot_EngagementAP_StatusType()
      return FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PreState_Container_P(api_status_in)
    }

    def readFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_PS(): FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PreState_Container_PS = {
      val r = readFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_PST(F)
      return r
    }

    def readFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_PST(typeParsed: B): FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.FAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_PS)
      }
      val api_status_in = readFAA_Autopilot_EngagementAP_StatusType()
      return FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PreState_Container_PS(api_status_in)
    }

    def readFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container(): FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.FAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_P => val r = readFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_PT(T); return r
        case Constants.FAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_PS => val r = readFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PostState_Container.")
          val r = readFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_PST(T)
          return r
      }
    }

    def readFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_P(): FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PostState_Container_P = {
      val r = readFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_PT(F)
      return r
    }

    def readFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_PT(typeParsed: B): FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.FAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_P)
      }
      val api_status_out = readFAA_Autopilot_EngagementAP_StatusType()
      return FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PostState_Container_P(api_status_out)
    }

    def readFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_PS(): FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PostState_Container_PS = {
      val r = readFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_PST(F)
      return r
    }

    def readFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_PST(typeParsed: B): FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.FAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_PS)
      }
      val api_status_out = readFAA_Autopilot_EngagementAP_StatusType()
      return FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PostState_Container_PS(api_status_out)
    }

    def readFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container(): FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.FAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_P => val r = readFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PT(T); return r
        case Constants.FAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PS => val r = readFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container.")
          val r = readFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PST(T)
          return r
      }
    }

    def readFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_P(): FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_P = {
      val r = readFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PT(F)
      return r
    }

    def readFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PT(typeParsed: B): FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.FAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_P)
      }
      val api_ap_on_in = readFAA_Autopilot_EngagementAP_On_IndicationType()
      return FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_P(api_ap_on_in)
    }

    def readFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PS(): FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PS = {
      val r = readFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PST(F)
      return r
    }

    def readFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PST(typeParsed: B): FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.FAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PS)
      }
      val api_ap_on_in = readFAA_Autopilot_EngagementAP_On_IndicationType()
      return FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PS(api_ap_on_in)
    }

    def readFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container(): FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.FAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_P => val r = readFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PT(T); return r
        case Constants.FAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PS => val r = readFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container.")
          val r = readFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PST(T)
          return r
      }
    }

    def readFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_P(): FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_P = {
      val r = readFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PT(F)
      return r
    }

    def readFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PT(typeParsed: B): FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.FAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_P)
      }
      val api_ap_on_out = readFAA_Autopilot_EngagementAP_On_IndicationType()
      return FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_P(api_ap_on_out)
    }

    def readFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PS(): FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PS = {
      val r = readFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PST(F)
      return r
    }

    def readFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PST(typeParsed: B): FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.FAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PS)
      }
      val api_ap_on_out = readFAA_Autopilot_EngagementAP_On_IndicationType()
      return FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PS(api_ap_on_out)
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
        case Constants.FAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_P => val r = readFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_PT(T); return r
        case Constants.FAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_PS => val r = readFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_PST(T); return r
        case Constants.FAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_P => val r = readFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_PT(T); return r
        case Constants.FAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_PS => val r = readFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_PST(T); return r
        case Constants.FAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_P => val r = readFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PT(T); return r
        case Constants.FAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PS => val r = readFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PST(T); return r
        case Constants.FAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_P => val r = readFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PT(T); return r
        case Constants.FAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PS => val r = readFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PST(T); return r
        case Constants.FAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_P => val r = readFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PT(T); return r
        case Constants.FAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_P => val r = readFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PT(T); return r
        case Constants.FAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PS => val r = readFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PST(T); return r
        case Constants.FAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_P => val r = readFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PT(T); return r
        case Constants.FAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PS => val r = readFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PST(T); return r
        case Constants.FAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PS => val r = readFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PST(T); return r
        case Constants.FAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_P => val r = readFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PT(T); return r
        case Constants.FAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PS => val r = readFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PST(T); return r
        case Constants.FAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_P => val r = readFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PT(T); return r
        case Constants.FAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PS => val r = readFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PST(T); return r
        case Constants.FAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_P => val r = readFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PT(T); return r
        case Constants.FAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PS => val r = readFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of util.Container.")
          val r = readFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PST(T)
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
        case Constants.FAA_Autopilot_EngagementAP_Status_Payload => val r = readFAA_Autopilot_EngagementAP_Status_PayloadT(T); return r
        case Constants.FAA_Autopilot_EngagementAP_Availability_Payload => val r = readFAA_Autopilot_EngagementAP_Availability_PayloadT(T); return r
        case Constants.FAA_Autopilot_EngagementAP_On_Indication_Payload => val r = readFAA_Autopilot_EngagementAP_On_Indication_PayloadT(T); return r
        case Constants.FAA_Autopilot_EngagementEngage_AP_Command_Payload => val r = readFAA_Autopilot_EngagementEngage_AP_Command_PayloadT(T); return r
        case Constants.FAA_Autopilot_EngagementGuidance_Readiness_Payload => val r = readFAA_Autopilot_EngagementGuidance_Readiness_PayloadT(T); return r
        case Constants.FAA_Autopilot_EngagementAP_Guidance_Request_Payload => val r = readFAA_Autopilot_EngagementAP_Guidance_Request_PayloadT(T); return r
        case Constants.FAA_Autopilot_EngagementEngage_Command_Status_Payload => val r = readFAA_Autopilot_EngagementEngage_Command_Status_PayloadT(T); return r
        case Constants.FAA_Autopilot_EngagementAttitude_Acceptability_Payload => val r = readFAA_Autopilot_EngagementAttitude_Acceptability_PayloadT(T); return r
        case Constants.FAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_P => val r = readFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_PT(T); return r
        case Constants.FAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_PS => val r = readFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_PST(T); return r
        case Constants.FAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_P => val r = readFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_PT(T); return r
        case Constants.FAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_PS => val r = readFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_PST(T); return r
        case Constants.FAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_P => val r = readFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PT(T); return r
        case Constants.FAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PS => val r = readFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PST(T); return r
        case Constants.FAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_P => val r = readFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PT(T); return r
        case Constants.FAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PS => val r = readFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PST(T); return r
        case Constants.FAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_P => val r = readFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PT(T); return r
        case Constants.FAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_P => val r = readFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PT(T); return r
        case Constants.FAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PS => val r = readFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PST(T); return r
        case Constants.FAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_P => val r = readFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PT(T); return r
        case Constants.FAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PS => val r = readFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PST(T); return r
        case Constants.FAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PS => val r = readFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PST(T); return r
        case Constants.FAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_P => val r = readFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PT(T); return r
        case Constants.FAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PS => val r = readFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PST(T); return r
        case Constants.FAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_P => val r = readFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PT(T); return r
        case Constants.FAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PS => val r = readFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PST(T); return r
        case Constants.FAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_P => val r = readFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PT(T); return r
        case Constants.FAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PS => val r = readFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of art.DataContent.")
          val r = readFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PST(T)
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

  def fromFAA_Autopilot_EngagementEngage_AP_Command_Payload(o: FAA_Autopilot_Engagement.Engage_AP_Command_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_Autopilot_EngagementEngage_AP_Command_Payload(o)
    return w.result
  }

  def toFAA_Autopilot_EngagementEngage_AP_Command_Payload(data: ISZ[U8]): Either[FAA_Autopilot_Engagement.Engage_AP_Command_Payload, MessagePack.ErrorMsg] = {
    def fFAA_Autopilot_EngagementEngage_AP_Command_Payload(reader: Reader): FAA_Autopilot_Engagement.Engage_AP_Command_Payload = {
      val r = reader.readFAA_Autopilot_EngagementEngage_AP_Command_Payload()
      return r
    }
    val r = to(data, fFAA_Autopilot_EngagementEngage_AP_Command_Payload _)
    return r
  }

  def fromFAA_Autopilot_EngagementEngage_Command_Status_Payload(o: FAA_Autopilot_Engagement.Engage_Command_Status_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_Autopilot_EngagementEngage_Command_Status_Payload(o)
    return w.result
  }

  def toFAA_Autopilot_EngagementEngage_Command_Status_Payload(data: ISZ[U8]): Either[FAA_Autopilot_Engagement.Engage_Command_Status_Payload, MessagePack.ErrorMsg] = {
    def fFAA_Autopilot_EngagementEngage_Command_Status_Payload(reader: Reader): FAA_Autopilot_Engagement.Engage_Command_Status_Payload = {
      val r = reader.readFAA_Autopilot_EngagementEngage_Command_Status_Payload()
      return r
    }
    val r = to(data, fFAA_Autopilot_EngagementEngage_Command_Status_Payload _)
    return r
  }

  def fromFAA_Autopilot_EngagementGuidance_Readiness_Payload(o: FAA_Autopilot_Engagement.Guidance_Readiness_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_Autopilot_EngagementGuidance_Readiness_Payload(o)
    return w.result
  }

  def toFAA_Autopilot_EngagementGuidance_Readiness_Payload(data: ISZ[U8]): Either[FAA_Autopilot_Engagement.Guidance_Readiness_Payload, MessagePack.ErrorMsg] = {
    def fFAA_Autopilot_EngagementGuidance_Readiness_Payload(reader: Reader): FAA_Autopilot_Engagement.Guidance_Readiness_Payload = {
      val r = reader.readFAA_Autopilot_EngagementGuidance_Readiness_Payload()
      return r
    }
    val r = to(data, fFAA_Autopilot_EngagementGuidance_Readiness_Payload _)
    return r
  }

  def fromFAA_Autopilot_EngagementAttitude_Acceptability_Payload(o: FAA_Autopilot_Engagement.Attitude_Acceptability_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_Autopilot_EngagementAttitude_Acceptability_Payload(o)
    return w.result
  }

  def toFAA_Autopilot_EngagementAttitude_Acceptability_Payload(data: ISZ[U8]): Either[FAA_Autopilot_Engagement.Attitude_Acceptability_Payload, MessagePack.ErrorMsg] = {
    def fFAA_Autopilot_EngagementAttitude_Acceptability_Payload(reader: Reader): FAA_Autopilot_Engagement.Attitude_Acceptability_Payload = {
      val r = reader.readFAA_Autopilot_EngagementAttitude_Acceptability_Payload()
      return r
    }
    val r = to(data, fFAA_Autopilot_EngagementAttitude_Acceptability_Payload _)
    return r
  }

  def fromFAA_Autopilot_EngagementAP_Availability_Payload(o: FAA_Autopilot_Engagement.AP_Availability_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_Autopilot_EngagementAP_Availability_Payload(o)
    return w.result
  }

  def toFAA_Autopilot_EngagementAP_Availability_Payload(data: ISZ[U8]): Either[FAA_Autopilot_Engagement.AP_Availability_Payload, MessagePack.ErrorMsg] = {
    def fFAA_Autopilot_EngagementAP_Availability_Payload(reader: Reader): FAA_Autopilot_Engagement.AP_Availability_Payload = {
      val r = reader.readFAA_Autopilot_EngagementAP_Availability_Payload()
      return r
    }
    val r = to(data, fFAA_Autopilot_EngagementAP_Availability_Payload _)
    return r
  }

  def fromFAA_Autopilot_EngagementAP_Guidance_Request_Payload(o: FAA_Autopilot_Engagement.AP_Guidance_Request_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_Autopilot_EngagementAP_Guidance_Request_Payload(o)
    return w.result
  }

  def toFAA_Autopilot_EngagementAP_Guidance_Request_Payload(data: ISZ[U8]): Either[FAA_Autopilot_Engagement.AP_Guidance_Request_Payload, MessagePack.ErrorMsg] = {
    def fFAA_Autopilot_EngagementAP_Guidance_Request_Payload(reader: Reader): FAA_Autopilot_Engagement.AP_Guidance_Request_Payload = {
      val r = reader.readFAA_Autopilot_EngagementAP_Guidance_Request_Payload()
      return r
    }
    val r = to(data, fFAA_Autopilot_EngagementAP_Guidance_Request_Payload _)
    return r
  }

  def fromFAA_Autopilot_EngagementAP_Status_Payload(o: FAA_Autopilot_Engagement.AP_Status_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_Autopilot_EngagementAP_Status_Payload(o)
    return w.result
  }

  def toFAA_Autopilot_EngagementAP_Status_Payload(data: ISZ[U8]): Either[FAA_Autopilot_Engagement.AP_Status_Payload, MessagePack.ErrorMsg] = {
    def fFAA_Autopilot_EngagementAP_Status_Payload(reader: Reader): FAA_Autopilot_Engagement.AP_Status_Payload = {
      val r = reader.readFAA_Autopilot_EngagementAP_Status_Payload()
      return r
    }
    val r = to(data, fFAA_Autopilot_EngagementAP_Status_Payload _)
    return r
  }

  def fromFAA_Autopilot_EngagementAP_On_Indication_Payload(o: FAA_Autopilot_Engagement.AP_On_Indication_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_Autopilot_EngagementAP_On_Indication_Payload(o)
    return w.result
  }

  def toFAA_Autopilot_EngagementAP_On_Indication_Payload(data: ISZ[U8]): Either[FAA_Autopilot_Engagement.AP_On_Indication_Payload, MessagePack.ErrorMsg] = {
    def fFAA_Autopilot_EngagementAP_On_Indication_Payload(reader: Reader): FAA_Autopilot_Engagement.AP_On_Indication_Payload = {
      val r = reader.readFAA_Autopilot_EngagementAP_On_Indication_Payload()
      return r
    }
    val r = to(data, fFAA_Autopilot_EngagementAP_On_Indication_Payload _)
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

  def fromFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container(o: FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container(o)
    return w.result
  }

  def toFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container(data: ISZ[U8]): Either[FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container, MessagePack.ErrorMsg] = {
    def fFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container(reader: Reader): FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container = {
      val r = reader.readFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container()
      return r
    }
    val r = to(data, fFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container _)
    return r
  }

  def fromFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_P(o: FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_P(o)
    return w.result
  }

  def toFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_P(data: ISZ[U8]): Either[FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_P(reader: Reader): FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_P = {
      val r = reader.readFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_P()
      return r
    }
    val r = to(data, fFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_P _)
    return r
  }

  def fromFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PS(o: FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PS(o)
    return w.result
  }

  def toFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PS(data: ISZ[U8]): Either[FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PS(reader: Reader): FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PS = {
      val r = reader.readFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PS()
      return r
    }
    val r = to(data, fFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PS _)
    return r
  }

  def fromFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container(o: FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container(o)
    return w.result
  }

  def toFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container(data: ISZ[U8]): Either[FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container, MessagePack.ErrorMsg] = {
    def fFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container(reader: Reader): FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container = {
      val r = reader.readFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container()
      return r
    }
    val r = to(data, fFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container _)
    return r
  }

  def fromFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_P(o: FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_P(o)
    return w.result
  }

  def toFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_P(data: ISZ[U8]): Either[FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_P(reader: Reader): FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_P = {
      val r = reader.readFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_P()
      return r
    }
    val r = to(data, fFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_P _)
    return r
  }

  def fromFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PS(o: FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PS(o)
    return w.result
  }

  def toFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PS(data: ISZ[U8]): Either[FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PS(reader: Reader): FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PS = {
      val r = reader.readFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PS()
      return r
    }
    val r = to(data, fFAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PS _)
    return r
  }

  def fromFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container(o: FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container(o)
    return w.result
  }

  def toFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container(data: ISZ[U8]): Either[FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PreState_Container, MessagePack.ErrorMsg] = {
    def fFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container(reader: Reader): FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PreState_Container = {
      val r = reader.readFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container()
      return r
    }
    val r = to(data, fFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container _)
    return r
  }

  def fromFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_P(o: FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_P(o)
    return w.result
  }

  def toFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_P(data: ISZ[U8]): Either[FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_P(reader: Reader): FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PreState_Container_P = {
      val r = reader.readFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_P()
      return r
    }
    val r = to(data, fFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_P _)
    return r
  }

  def fromFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PS(o: FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PS(o)
    return w.result
  }

  def toFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PS(data: ISZ[U8]): Either[FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PS(reader: Reader): FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PS = {
      val r = reader.readFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PS()
      return r
    }
    val r = to(data, fFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PS _)
    return r
  }

  def fromFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container(o: FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container(o)
    return w.result
  }

  def toFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container(data: ISZ[U8]): Either[FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PostState_Container, MessagePack.ErrorMsg] = {
    def fFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container(reader: Reader): FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PostState_Container = {
      val r = reader.readFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container()
      return r
    }
    val r = to(data, fFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container _)
    return r
  }

  def fromFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_P(o: FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_P(o)
    return w.result
  }

  def toFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_P(data: ISZ[U8]): Either[FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_P(reader: Reader): FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PostState_Container_P = {
      val r = reader.readFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_P()
      return r
    }
    val r = to(data, fFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_P _)
    return r
  }

  def fromFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PS(o: FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PS(o)
    return w.result
  }

  def toFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PS(data: ISZ[U8]): Either[FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PS(reader: Reader): FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PS = {
      val r = reader.readFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PS()
      return r
    }
    val r = to(data, fFAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PS _)
    return r
  }

  def fromFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container(o: FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container(o)
    return w.result
  }

  def toFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container(data: ISZ[U8]): Either[FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container, MessagePack.ErrorMsg] = {
    def fFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container(reader: Reader): FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container = {
      val r = reader.readFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container()
      return r
    }
    val r = to(data, fFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container _)
    return r
  }

  def fromFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_P(o: FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_P(o)
    return w.result
  }

  def toFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_P(data: ISZ[U8]): Either[FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_P(reader: Reader): FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_P = {
      val r = reader.readFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_P()
      return r
    }
    val r = to(data, fFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_P _)
    return r
  }

  def fromFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PS(o: FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PS(o)
    return w.result
  }

  def toFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PS(data: ISZ[U8]): Either[FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PS(reader: Reader): FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PS = {
      val r = reader.readFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PS()
      return r
    }
    val r = to(data, fFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PS _)
    return r
  }

  def fromFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container(o: FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container(o)
    return w.result
  }

  def toFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container(data: ISZ[U8]): Either[FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container, MessagePack.ErrorMsg] = {
    def fFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container(reader: Reader): FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container = {
      val r = reader.readFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container()
      return r
    }
    val r = to(data, fFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container _)
    return r
  }

  def fromFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_P(o: FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_P(o)
    return w.result
  }

  def toFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_P(data: ISZ[U8]): Either[FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_P(reader: Reader): FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_P = {
      val r = reader.readFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_P()
      return r
    }
    val r = to(data, fFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_P _)
    return r
  }

  def fromFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PS(o: FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PS(o)
    return w.result
  }

  def toFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PS(data: ISZ[U8]): Either[FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PS(reader: Reader): FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PS = {
      val r = reader.readFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PS()
      return r
    }
    val r = to(data, fFAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PS _)
    return r
  }

  def fromFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container(o: FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container(o)
    return w.result
  }

  def toFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container(data: ISZ[U8]): Either[FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PreState_Container, MessagePack.ErrorMsg] = {
    def fFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container(reader: Reader): FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PreState_Container = {
      val r = reader.readFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container()
      return r
    }
    val r = to(data, fFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container _)
    return r
  }

  def fromFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_P(o: FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_P(o)
    return w.result
  }

  def toFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_P(data: ISZ[U8]): Either[FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_P(reader: Reader): FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PreState_Container_P = {
      val r = reader.readFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_P()
      return r
    }
    val r = to(data, fFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_P _)
    return r
  }

  def fromFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_PS(o: FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_PS(o)
    return w.result
  }

  def toFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_PS(data: ISZ[U8]): Either[FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_PS(reader: Reader): FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PreState_Container_PS = {
      val r = reader.readFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_PS()
      return r
    }
    val r = to(data, fFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_PS _)
    return r
  }

  def fromFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container(o: FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container(o)
    return w.result
  }

  def toFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container(data: ISZ[U8]): Either[FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PostState_Container, MessagePack.ErrorMsg] = {
    def fFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container(reader: Reader): FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PostState_Container = {
      val r = reader.readFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container()
      return r
    }
    val r = to(data, fFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container _)
    return r
  }

  def fromFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_P(o: FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_P(o)
    return w.result
  }

  def toFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_P(data: ISZ[U8]): Either[FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_P(reader: Reader): FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PostState_Container_P = {
      val r = reader.readFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_P()
      return r
    }
    val r = to(data, fFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_P _)
    return r
  }

  def fromFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_PS(o: FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_PS(o)
    return w.result
  }

  def toFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_PS(data: ISZ[U8]): Either[FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_PS(reader: Reader): FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PostState_Container_PS = {
      val r = reader.readFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_PS()
      return r
    }
    val r = to(data, fFAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_PS _)
    return r
  }

  def fromFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container(o: FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container(o)
    return w.result
  }

  def toFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container(data: ISZ[U8]): Either[FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container, MessagePack.ErrorMsg] = {
    def fFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container(reader: Reader): FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container = {
      val r = reader.readFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container()
      return r
    }
    val r = to(data, fFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container _)
    return r
  }

  def fromFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_P(o: FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_P(o)
    return w.result
  }

  def toFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_P(data: ISZ[U8]): Either[FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_P(reader: Reader): FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_P = {
      val r = reader.readFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_P()
      return r
    }
    val r = to(data, fFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_P _)
    return r
  }

  def fromFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PS(o: FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PS(o)
    return w.result
  }

  def toFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PS(data: ISZ[U8]): Either[FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PS(reader: Reader): FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PS = {
      val r = reader.readFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PS()
      return r
    }
    val r = to(data, fFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PS _)
    return r
  }

  def fromFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container(o: FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container(o)
    return w.result
  }

  def toFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container(data: ISZ[U8]): Either[FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container, MessagePack.ErrorMsg] = {
    def fFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container(reader: Reader): FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container = {
      val r = reader.readFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container()
      return r
    }
    val r = to(data, fFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container _)
    return r
  }

  def fromFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_P(o: FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_P(o)
    return w.result
  }

  def toFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_P(data: ISZ[U8]): Either[FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_P(reader: Reader): FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_P = {
      val r = reader.readFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_P()
      return r
    }
    val r = to(data, fFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_P _)
    return r
  }

  def fromFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PS(o: FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PS(o)
    return w.result
  }

  def toFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PS(data: ISZ[U8]): Either[FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PS(reader: Reader): FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PS = {
      val r = reader.readFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PS()
      return r
    }
    val r = to(data, fFAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PS _)
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