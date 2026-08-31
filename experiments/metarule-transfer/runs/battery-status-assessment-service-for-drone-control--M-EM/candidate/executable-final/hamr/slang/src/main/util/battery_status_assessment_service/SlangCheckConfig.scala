// #Sireum

package battery_status_assessment_service

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

CheckCommand.scala

CheckToken.scala

AcquisitionOutcome.scala

PublicationOutcome.scala

AcquisitionDirective.scala

AssessmentContext.scala

PublicationDirective.scala

CheckStatus.scala

ReportTicket.scala

ReportAvailability.scala

CapacityLevel.scala

ReportQuality.scala

StatusReadRequest.scala

QualifiedEvidence.scala

AssessmentResult.scala

FeedbackTicket.scala

UseDisposition.scala

LifecycleState.scala

LastAdmittedToken.scala

AcquisitionState.scala

PublicationState.scala

CheckRequest.scala

BatteryReport.scala

CapturedReport.scala

TaggedQualifiedEvidence.scala

TaggedAssessment.scala

ControlUseFeedback.scala

Base_Types.scala

CheckLifecycle_battery_assessment_process_check_lifecycle_Containers.scala

ReportAcquisition_battery_assessment_process_report_acquisition_Containers.scala

ReportQualification_battery_assessment_process_report_qualification_Containers.scala

AssessmentDecision_battery_assessment_process_assessment_decision_Containers.scala

ResultCustody_battery_assessment_process_result_custody_Containers.scala

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

@datatype class Config_Battery_Status_Assessment_ServiceAcquisitionDirectiveType(attempts: Z, verbose: B, filter: Battery_Status_Assessment_Service.AcquisitionDirective.Type => B) {}

@datatype class Config_Battery_Status_Assessment_ServiceAcquisitionDirective_Payload(attempts: Z, verbose: B, filter: Battery_Status_Assessment_Service.AcquisitionDirective_Payload => B) {}

@datatype class Config_Battery_Status_Assessment_ServiceAcquisitionOutcomeType(attempts: Z, verbose: B, filter: Battery_Status_Assessment_Service.AcquisitionOutcome.Type => B) {}

@datatype class Config_Battery_Status_Assessment_ServiceAcquisitionOutcome_Payload(attempts: Z, verbose: B, filter: Battery_Status_Assessment_Service.AcquisitionOutcome_Payload => B) {}

@datatype class Config_Battery_Status_Assessment_ServiceAcquisitionStateType(attempts: Z, verbose: B, filter: Battery_Status_Assessment_Service.AcquisitionState.Type => B) {}

@datatype class Config_Battery_Status_Assessment_ServiceAcquisitionState_Payload(attempts: Z, verbose: B, filter: Battery_Status_Assessment_Service.AcquisitionState_Payload => B) {}

@datatype class Config_Battery_Status_Assessment_ServiceAssessmentContextType(attempts: Z, verbose: B, filter: Battery_Status_Assessment_Service.AssessmentContext.Type => B) {}

@datatype class Config_Battery_Status_Assessment_ServiceAssessmentContext_Payload(attempts: Z, verbose: B, filter: Battery_Status_Assessment_Service.AssessmentContext_Payload => B) {}

@datatype class Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_DataTypeId.Type], filter: Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container => B) {}

@datatype class Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P(attempts: Z, verbose: B, filter: Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P => B) {}

@datatype class Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS(attempts: Z, verbose: B, filter: Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS => B) {}

@datatype class Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_DataTypeId.Type], filter: Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container => B) {}

@datatype class Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P(attempts: Z, verbose: B, filter: Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P => B) {}

@datatype class Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS(attempts: Z, verbose: B, filter: Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS => B) {}

@datatype class Config_Battery_Status_Assessment_ServiceAssessmentResultType(attempts: Z, verbose: B, filter: Battery_Status_Assessment_Service.AssessmentResult.Type => B) {}

@datatype class Config_Battery_Status_Assessment_ServiceAssessmentResult_Payload(attempts: Z, verbose: B, filter: Battery_Status_Assessment_Service.AssessmentResult_Payload => B) {}

@datatype class Config_Battery_Status_Assessment_ServiceBatteryReport(attempts: Z, verbose: B, filter: Battery_Status_Assessment_Service.BatteryReport => B) {}

@datatype class Config_Battery_Status_Assessment_ServiceBatteryReport_Payload(attempts: Z, verbose: B, filter: Battery_Status_Assessment_Service.BatteryReport_Payload => B) {}

@datatype class Config_Battery_Status_Assessment_ServiceCapacityLevelType(attempts: Z, verbose: B, filter: Battery_Status_Assessment_Service.CapacityLevel.Type => B) {}

@datatype class Config_Battery_Status_Assessment_ServiceCapacityLevel_Payload(attempts: Z, verbose: B, filter: Battery_Status_Assessment_Service.CapacityLevel_Payload => B) {}

@datatype class Config_Battery_Status_Assessment_ServiceCapturedReport(attempts: Z, verbose: B, filter: Battery_Status_Assessment_Service.CapturedReport => B) {}

@datatype class Config_Battery_Status_Assessment_ServiceCapturedReport_Payload(attempts: Z, verbose: B, filter: Battery_Status_Assessment_Service.CapturedReport_Payload => B) {}

@datatype class Config_Battery_Status_Assessment_ServiceCheckCommandType(attempts: Z, verbose: B, filter: Battery_Status_Assessment_Service.CheckCommand.Type => B) {}

@datatype class Config_Battery_Status_Assessment_ServiceCheckCommand_Payload(attempts: Z, verbose: B, filter: Battery_Status_Assessment_Service.CheckCommand_Payload => B) {}

@datatype class Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_DataTypeId.Type], filter: Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container => B) {}

@datatype class Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P(attempts: Z, verbose: B, filter: Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P => B) {}

@datatype class Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS(attempts: Z, verbose: B, filter: Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS => B) {}

@datatype class Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_DataTypeId.Type], filter: Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container => B) {}

@datatype class Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P(attempts: Z, verbose: B, filter: Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P => B) {}

@datatype class Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS(attempts: Z, verbose: B, filter: Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS => B) {}

@datatype class Config_Battery_Status_Assessment_ServiceCheckRequest(attempts: Z, verbose: B, filter: Battery_Status_Assessment_Service.CheckRequest => B) {}

@datatype class Config_Battery_Status_Assessment_ServiceCheckRequest_Payload(attempts: Z, verbose: B, filter: Battery_Status_Assessment_Service.CheckRequest_Payload => B) {}

@datatype class Config_Battery_Status_Assessment_ServiceCheckStatusType(attempts: Z, verbose: B, filter: Battery_Status_Assessment_Service.CheckStatus.Type => B) {}

@datatype class Config_Battery_Status_Assessment_ServiceCheckStatus_Payload(attempts: Z, verbose: B, filter: Battery_Status_Assessment_Service.CheckStatus_Payload => B) {}

@datatype class Config_Battery_Status_Assessment_ServiceCheckTokenType(attempts: Z, verbose: B, filter: Battery_Status_Assessment_Service.CheckToken.Type => B) {}

@datatype class Config_Battery_Status_Assessment_ServiceCheckToken_Payload(attempts: Z, verbose: B, filter: Battery_Status_Assessment_Service.CheckToken_Payload => B) {}

@datatype class Config_Battery_Status_Assessment_ServiceControlUseFeedback(attempts: Z, verbose: B, filter: Battery_Status_Assessment_Service.ControlUseFeedback => B) {}

@datatype class Config_Battery_Status_Assessment_ServiceControlUseFeedback_Payload(attempts: Z, verbose: B, filter: Battery_Status_Assessment_Service.ControlUseFeedback_Payload => B) {}

@datatype class Config_Battery_Status_Assessment_ServiceFeedbackTicketType(attempts: Z, verbose: B, filter: Battery_Status_Assessment_Service.FeedbackTicket.Type => B) {}

@datatype class Config_Battery_Status_Assessment_ServiceFeedbackTicket_Payload(attempts: Z, verbose: B, filter: Battery_Status_Assessment_Service.FeedbackTicket_Payload => B) {}

@datatype class Config_Battery_Status_Assessment_ServiceLastAdmittedTokenType(attempts: Z, verbose: B, filter: Battery_Status_Assessment_Service.LastAdmittedToken.Type => B) {}

@datatype class Config_Battery_Status_Assessment_ServiceLastAdmittedToken_Payload(attempts: Z, verbose: B, filter: Battery_Status_Assessment_Service.LastAdmittedToken_Payload => B) {}

@datatype class Config_Battery_Status_Assessment_ServiceLifecycleStateType(attempts: Z, verbose: B, filter: Battery_Status_Assessment_Service.LifecycleState.Type => B) {}

@datatype class Config_Battery_Status_Assessment_ServiceLifecycleState_Payload(attempts: Z, verbose: B, filter: Battery_Status_Assessment_Service.LifecycleState_Payload => B) {}

@datatype class Config_Battery_Status_Assessment_ServicePublicationDirectiveType(attempts: Z, verbose: B, filter: Battery_Status_Assessment_Service.PublicationDirective.Type => B) {}

@datatype class Config_Battery_Status_Assessment_ServicePublicationDirective_Payload(attempts: Z, verbose: B, filter: Battery_Status_Assessment_Service.PublicationDirective_Payload => B) {}

@datatype class Config_Battery_Status_Assessment_ServicePublicationOutcomeType(attempts: Z, verbose: B, filter: Battery_Status_Assessment_Service.PublicationOutcome.Type => B) {}

@datatype class Config_Battery_Status_Assessment_ServicePublicationOutcome_Payload(attempts: Z, verbose: B, filter: Battery_Status_Assessment_Service.PublicationOutcome_Payload => B) {}

@datatype class Config_Battery_Status_Assessment_ServicePublicationStateType(attempts: Z, verbose: B, filter: Battery_Status_Assessment_Service.PublicationState.Type => B) {}

@datatype class Config_Battery_Status_Assessment_ServicePublicationState_Payload(attempts: Z, verbose: B, filter: Battery_Status_Assessment_Service.PublicationState_Payload => B) {}

@datatype class Config_Battery_Status_Assessment_ServiceQualifiedEvidenceType(attempts: Z, verbose: B, filter: Battery_Status_Assessment_Service.QualifiedEvidence.Type => B) {}

@datatype class Config_Battery_Status_Assessment_ServiceQualifiedEvidence_Payload(attempts: Z, verbose: B, filter: Battery_Status_Assessment_Service.QualifiedEvidence_Payload => B) {}

@datatype class Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_DataTypeId.Type], filter: Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container => B) {}

@datatype class Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P(attempts: Z, verbose: B, filter: Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P => B) {}

@datatype class Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS(attempts: Z, verbose: B, filter: Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS => B) {}

@datatype class Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_DataTypeId.Type], filter: Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container => B) {}

@datatype class Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P(attempts: Z, verbose: B, filter: Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P => B) {}

@datatype class Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS(attempts: Z, verbose: B, filter: Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS => B) {}

@datatype class Config_Battery_Status_Assessment_ServiceReportAvailabilityType(attempts: Z, verbose: B, filter: Battery_Status_Assessment_Service.ReportAvailability.Type => B) {}

@datatype class Config_Battery_Status_Assessment_ServiceReportAvailability_Payload(attempts: Z, verbose: B, filter: Battery_Status_Assessment_Service.ReportAvailability_Payload => B) {}

@datatype class Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_DataTypeId.Type], filter: Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container => B) {}

@datatype class Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_P(attempts: Z, verbose: B, filter: Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container_P => B) {}

@datatype class Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS(attempts: Z, verbose: B, filter: Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS => B) {}

@datatype class Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_DataTypeId.Type], filter: Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container => B) {}

@datatype class Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_P(attempts: Z, verbose: B, filter: Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container_P => B) {}

@datatype class Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS(attempts: Z, verbose: B, filter: Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS => B) {}

@datatype class Config_Battery_Status_Assessment_ServiceReportQualityType(attempts: Z, verbose: B, filter: Battery_Status_Assessment_Service.ReportQuality.Type => B) {}

@datatype class Config_Battery_Status_Assessment_ServiceReportQuality_Payload(attempts: Z, verbose: B, filter: Battery_Status_Assessment_Service.ReportQuality_Payload => B) {}

@datatype class Config_Battery_Status_Assessment_ServiceReportTicketType(attempts: Z, verbose: B, filter: Battery_Status_Assessment_Service.ReportTicket.Type => B) {}

@datatype class Config_Battery_Status_Assessment_ServiceReportTicket_Payload(attempts: Z, verbose: B, filter: Battery_Status_Assessment_Service.ReportTicket_Payload => B) {}

@datatype class Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_DataTypeId.Type], filter: Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container => B) {}

@datatype class Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_P(attempts: Z, verbose: B, filter: Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container_P => B) {}

@datatype class Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PS(attempts: Z, verbose: B, filter: Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container_PS => B) {}

@datatype class Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_DataTypeId.Type], filter: Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container => B) {}

@datatype class Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_P(attempts: Z, verbose: B, filter: Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container_P => B) {}

@datatype class Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PS(attempts: Z, verbose: B, filter: Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container_PS => B) {}

@datatype class Config_Battery_Status_Assessment_ServiceStatusReadRequestType(attempts: Z, verbose: B, filter: Battery_Status_Assessment_Service.StatusReadRequest.Type => B) {}

@datatype class Config_Battery_Status_Assessment_ServiceStatusReadRequest_Payload(attempts: Z, verbose: B, filter: Battery_Status_Assessment_Service.StatusReadRequest_Payload => B) {}

@datatype class Config_Battery_Status_Assessment_ServiceTaggedAssessment(attempts: Z, verbose: B, filter: Battery_Status_Assessment_Service.TaggedAssessment => B) {}

@datatype class Config_Battery_Status_Assessment_ServiceTaggedAssessment_Payload(attempts: Z, verbose: B, filter: Battery_Status_Assessment_Service.TaggedAssessment_Payload => B) {}

@datatype class Config_Battery_Status_Assessment_ServiceTaggedQualifiedEvidence(attempts: Z, verbose: B, filter: Battery_Status_Assessment_Service.TaggedQualifiedEvidence => B) {}

@datatype class Config_Battery_Status_Assessment_ServiceTaggedQualifiedEvidence_Payload(attempts: Z, verbose: B, filter: Battery_Status_Assessment_Service.TaggedQualifiedEvidence_Payload => B) {}

@datatype class Config_Battery_Status_Assessment_ServiceUseDispositionType(attempts: Z, verbose: B, filter: Battery_Status_Assessment_Service.UseDisposition.Type => B) {}

@datatype class Config_Battery_Status_Assessment_ServiceUseDisposition_Payload(attempts: Z, verbose: B, filter: Battery_Status_Assessment_Service.UseDisposition_Payload => B) {}

@datatype class Config_utilContainer(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[utilContainer_DataTypeId.Type], filter: util.Container => B) {}

@datatype class Config_utilEmptyContainer(attempts: Z, verbose: B, filter: util.EmptyContainer => B) {}

@datatype class Config_runtimemonitorObservationKindType(attempts: Z, verbose: B, filter: runtimemonitor.ObservationKind.Type => B) {}


