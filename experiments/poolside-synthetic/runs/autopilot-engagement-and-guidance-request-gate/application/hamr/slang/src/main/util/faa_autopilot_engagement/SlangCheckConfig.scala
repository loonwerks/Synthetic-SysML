// #Sireum

package faa_autopilot_engagement

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

Engage_AP_Command.scala

Engage_Command_Status.scala

Guidance_Readiness.scala

Attitude_Acceptability.scala

AP_Availability.scala

AP_Guidance_Request.scala

AP_Status.scala

AP_On_Indication.scala

Base_Types.scala

FCI_Command_Intake_Thread_control_process_fci_command_intake_Containers.scala

Engagement_Decision_Thread_control_process_engagement_decision_Containers.scala

Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_Containers.scala

Status_Reporting_Thread_control_process_status_reporting_Containers.scala

CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_Containers.scala

ObservationKind.scala

Container.scala

DataContent.scala

Aux_Types.scala

*/
@datatype class Config_String(minSize: Z, maxSize: Z, attempts: Z, verbose: B, filter: String => B) {}
@datatype class Config_Z(low: Option[Z], high: Option[Z], attempts: Z, verbose: B, filter: Z => B) {}

@datatype class Config_B(attempts: Z, verbose: B, filter: B => B) {}

@datatype class Config_C(low: Option[C], high: Option[C], attempts: Z, verbose: B, filter: C => B) {}

@datatype class Config_R(low: Option[R], high: Option[R], attempts: Z, verbose: B, filter: R => B) {}

@datatype class Config_F32(low: Option[F32], high: Option[F32], attempts: Z, verbose: B, filter: F32 => B) {}

@datatype class Config_F64(low: Option[F64], high: Option[F64], attempts: Z, verbose: B, filter: F64 => B) {}

@datatype class Config_S8(low: Option[S8], high: Option[S8], attempts: Z, verbose: B, filter: S8 => B) {}

@datatype class Config_S16(low: Option[S16], high: Option[S16], attempts: Z, verbose: B, filter: S16 => B) {}

@datatype class Config_S32(low: Option[S32], high: Option[S32], attempts: Z, verbose: B, filter: S32 => B) {}

@datatype class Config_S64(low: Option[S64], high: Option[S64], attempts: Z, verbose: B, filter: S64 => B) {}

@datatype class Config_U8(low: Option[U8], high: Option[U8], attempts: Z, verbose: B, filter: U8 => B) {}

@datatype class Config_U16(low: Option[U16], high: Option[U16], attempts: Z, verbose: B, filter: U16 => B) {}

@datatype class Config_U32(low: Option[U32], high: Option[U32], attempts: Z, verbose: B, filter: U32 => B) {}

@datatype class Config_U64(low: Option[U64], high: Option[U64], attempts: Z, verbose: B, filter: U64 => B) {}

@datatype class Config__artDataContent(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[_artDataContent_DataTypeId.Type], filter: art.DataContent => B) {}

@datatype class Config__artEmpty(attempts: Z, verbose: B, filter: art.Empty => B) {}

@datatype class Config_Base_TypesBoolean_Payload(attempts: Z, verbose: B, filter: Base_Types.Boolean_Payload => B) {}

@datatype class Config_Base_TypesInteger_Payload(attempts: Z, verbose: B, filter: Base_Types.Integer_Payload => B) {}

@datatype class Config_Base_TypesInteger_8_Payload(attempts: Z, verbose: B, filter: Base_Types.Integer_8_Payload => B) {}

@datatype class Config_Base_TypesInteger_16_Payload(attempts: Z, verbose: B, filter: Base_Types.Integer_16_Payload => B) {}

@datatype class Config_Base_TypesInteger_32_Payload(attempts: Z, verbose: B, filter: Base_Types.Integer_32_Payload => B) {}

@datatype class Config_Base_TypesInteger_64_Payload(attempts: Z, verbose: B, filter: Base_Types.Integer_64_Payload => B) {}

@datatype class Config_Base_TypesUnsigned_8_Payload(attempts: Z, verbose: B, filter: Base_Types.Unsigned_8_Payload => B) {}

@datatype class Config_Base_TypesUnsigned_16_Payload(attempts: Z, verbose: B, filter: Base_Types.Unsigned_16_Payload => B) {}

@datatype class Config_Base_TypesUnsigned_32_Payload(attempts: Z, verbose: B, filter: Base_Types.Unsigned_32_Payload => B) {}

@datatype class Config_Base_TypesUnsigned_64_Payload(attempts: Z, verbose: B, filter: Base_Types.Unsigned_64_Payload => B) {}

@datatype class Config_Base_TypesFloat_Payload(attempts: Z, verbose: B, filter: Base_Types.Float_Payload => B) {}

@datatype class Config_Base_TypesFloat_32_Payload(attempts: Z, verbose: B, filter: Base_Types.Float_32_Payload => B) {}

@datatype class Config_Base_TypesFloat_64_Payload(attempts: Z, verbose: B, filter: Base_Types.Float_64_Payload => B) {}

@datatype class Config_Base_TypesCharacter_Payload(attempts: Z, verbose: B, filter: Base_Types.Character_Payload => B) {}

@datatype class Config_Base_TypesString_Payload(attempts: Z, verbose: B, filter: Base_Types.String_Payload => B) {}

@datatype class Config_ISZB(minSize: Z, maxSize: Z, attempts: Z, verbose: B, filter: ISZ[B] => B) {}

@datatype class Config_Base_TypesBits_Payload(attempts: Z, verbose: B, filter: Base_Types.Bits_Payload => B) {}

@datatype class Config_FAA_Autopilot_EngagementAP_AvailabilityType(attempts: Z, verbose: B, filter: FAA_Autopilot_Engagement.AP_Availability.Type => B) {}

@datatype class Config_FAA_Autopilot_EngagementAP_Availability_Payload(attempts: Z, verbose: B, filter: FAA_Autopilot_Engagement.AP_Availability_Payload => B) {}

@datatype class Config_FAA_Autopilot_EngagementAP_Guidance_RequestType(attempts: Z, verbose: B, filter: FAA_Autopilot_Engagement.AP_Guidance_Request.Type => B) {}

@datatype class Config_FAA_Autopilot_EngagementAP_Guidance_Request_Payload(attempts: Z, verbose: B, filter: FAA_Autopilot_Engagement.AP_Guidance_Request_Payload => B) {}

@datatype class Config_FAA_Autopilot_EngagementAP_On_IndicationType(attempts: Z, verbose: B, filter: FAA_Autopilot_Engagement.AP_On_Indication.Type => B) {}

@datatype class Config_FAA_Autopilot_EngagementAP_On_Indication_Payload(attempts: Z, verbose: B, filter: FAA_Autopilot_Engagement.AP_On_Indication_Payload => B) {}

@datatype class Config_FAA_Autopilot_EngagementAP_StatusType(attempts: Z, verbose: B, filter: FAA_Autopilot_Engagement.AP_Status.Type => B) {}

@datatype class Config_FAA_Autopilot_EngagementAP_Status_Payload(attempts: Z, verbose: B, filter: FAA_Autopilot_Engagement.AP_Status_Payload => B) {}

@datatype class Config_FAA_Autopilot_EngagementAttitude_AcceptabilityType(attempts: Z, verbose: B, filter: FAA_Autopilot_Engagement.Attitude_Acceptability.Type => B) {}

@datatype class Config_FAA_Autopilot_EngagementAttitude_Acceptability_Payload(attempts: Z, verbose: B, filter: FAA_Autopilot_Engagement.Attitude_Acceptability_Payload => B) {}

@datatype class Config_FAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[FAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_DataTypeId.Type], filter: FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container => B) {}

@datatype class Config_FAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_P(attempts: Z, verbose: B, filter: FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_P => B) {}

@datatype class Config_FAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PS(attempts: Z, verbose: B, filter: FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PreState_Container_PS => B) {}

@datatype class Config_FAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[FAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_DataTypeId.Type], filter: FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container => B) {}

@datatype class Config_FAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_P(attempts: Z, verbose: B, filter: FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_P => B) {}

@datatype class Config_FAA_Autopilot_EngagementCSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PS(attempts: Z, verbose: B, filter: FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_PostState_Container_PS => B) {}

@datatype class Config_FAA_Autopilot_EngagementEngage_AP_CommandType(attempts: Z, verbose: B, filter: FAA_Autopilot_Engagement.Engage_AP_Command.Type => B) {}

@datatype class Config_FAA_Autopilot_EngagementEngage_AP_Command_Payload(attempts: Z, verbose: B, filter: FAA_Autopilot_Engagement.Engage_AP_Command_Payload => B) {}

@datatype class Config_FAA_Autopilot_EngagementEngage_Command_StatusType(attempts: Z, verbose: B, filter: FAA_Autopilot_Engagement.Engage_Command_Status.Type => B) {}

@datatype class Config_FAA_Autopilot_EngagementEngage_Command_Status_Payload(attempts: Z, verbose: B, filter: FAA_Autopilot_Engagement.Engage_Command_Status_Payload => B) {}

@datatype class Config_FAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[FAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_DataTypeId.Type], filter: FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PreState_Container => B) {}

@datatype class Config_FAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_P(attempts: Z, verbose: B, filter: FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PreState_Container_P => B) {}

@datatype class Config_FAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PS(attempts: Z, verbose: B, filter: FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PreState_Container_PS => B) {}

@datatype class Config_FAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[FAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_DataTypeId.Type], filter: FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PostState_Container => B) {}

@datatype class Config_FAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_P(attempts: Z, verbose: B, filter: FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PostState_Container_P => B) {}

@datatype class Config_FAA_Autopilot_EngagementEngagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PS(attempts: Z, verbose: B, filter: FAA_Autopilot_Engagement.Engagement_Decision_Thread_control_process_engagement_decision_PostState_Container_PS => B) {}

@datatype class Config_FAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[FAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_DataTypeId.Type], filter: FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container => B) {}

@datatype class Config_FAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_P(attempts: Z, verbose: B, filter: FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_P => B) {}

@datatype class Config_FAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PS(attempts: Z, verbose: B, filter: FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PreState_Container_PS => B) {}

@datatype class Config_FAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[FAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_DataTypeId.Type], filter: FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container => B) {}

@datatype class Config_FAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_P(attempts: Z, verbose: B, filter: FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_P => B) {}

@datatype class Config_FAA_Autopilot_EngagementFCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PS(attempts: Z, verbose: B, filter: FAA_Autopilot_Engagement.FCI_Command_Intake_Thread_control_process_fci_command_intake_PostState_Container_PS => B) {}

@datatype class Config_FAA_Autopilot_EngagementGuidance_ReadinessType(attempts: Z, verbose: B, filter: FAA_Autopilot_Engagement.Guidance_Readiness.Type => B) {}

@datatype class Config_FAA_Autopilot_EngagementGuidance_Readiness_Payload(attempts: Z, verbose: B, filter: FAA_Autopilot_Engagement.Guidance_Readiness_Payload => B) {}

@datatype class Config_FAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[FAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_DataTypeId.Type], filter: FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container => B) {}

@datatype class Config_FAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_P(attempts: Z, verbose: B, filter: FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_P => B) {}

@datatype class Config_FAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PS(attempts: Z, verbose: B, filter: FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PreState_Container_PS => B) {}

@datatype class Config_FAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[FAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_DataTypeId.Type], filter: FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container => B) {}

@datatype class Config_FAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_P(attempts: Z, verbose: B, filter: FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_P => B) {}

@datatype class Config_FAA_Autopilot_EngagementGuidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PS(attempts: Z, verbose: B, filter: FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_PostState_Container_PS => B) {}

@datatype class Config_FAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[FAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_DataTypeId.Type], filter: FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PreState_Container => B) {}

@datatype class Config_FAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_P(attempts: Z, verbose: B, filter: FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PreState_Container_P => B) {}

@datatype class Config_FAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PreState_Container_PS(attempts: Z, verbose: B, filter: FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PreState_Container_PS => B) {}

@datatype class Config_FAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[FAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_DataTypeId.Type], filter: FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PostState_Container => B) {}

@datatype class Config_FAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_P(attempts: Z, verbose: B, filter: FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PostState_Container_P => B) {}

@datatype class Config_FAA_Autopilot_EngagementStatus_Reporting_Thread_control_process_status_reporting_PostState_Container_PS(attempts: Z, verbose: B, filter: FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_PostState_Container_PS => B) {}

@datatype class Config_utilContainer(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[utilContainer_DataTypeId.Type], filter: util.Container => B) {}

@datatype class Config_utilEmptyContainer(attempts: Z, verbose: B, filter: util.EmptyContainer => B) {}

@datatype class Config_runtimemonitorObservationKindType(attempts: Z, verbose: B, filter: runtimemonitor.ObservationKind.Type => B) {}


