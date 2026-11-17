// #Sireum
// @formatter:off

// This file is auto-generated from CheckCommand.scala, CheckToken.scala, AcquisitionOutcome.scala, PublicationOutcome.scala, AcquisitionDirective.scala, AssessmentContext.scala, PublicationDirective.scala, CheckStatus.scala, ReportTicket.scala, ReportAvailability.scala, CapacityLevel.scala, ReportQuality.scala, StatusReadRequest.scala, QualifiedEvidence.scala, AssessmentResult.scala, FeedbackTicket.scala, UseDisposition.scala, LifecycleState.scala, LastAdmittedToken.scala, AcquisitionState.scala, PublicationState.scala, CheckRequest.scala, BatteryReport.scala, CapturedReport.scala, TaggedQualifiedEvidence.scala, TaggedAssessment.scala, ControlUseFeedback.scala, Base_Types.scala, CheckLifecycle_battery_assessment_process_check_lifecycle_Containers.scala, ReportAcquisition_battery_assessment_process_report_acquisition_Containers.scala, ReportQualification_battery_assessment_process_report_qualification_Containers.scala, AssessmentDecision_battery_assessment_process_assessment_decision_Containers.scala, ResultCustody_battery_assessment_process_result_custody_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package battery_status_assessment_service

import org.sireum._

object MsgPack {

  object Constants {

    val Battery_Status_Assessment_ServiceCheckCommand_Payload: Z = -32

    val Battery_Status_Assessment_ServiceCheckToken_Payload: Z = -31

    val Battery_Status_Assessment_ServiceAcquisitionOutcome_Payload: Z = -30

    val Battery_Status_Assessment_ServicePublicationOutcome_Payload: Z = -29

    val Battery_Status_Assessment_ServiceAcquisitionDirective_Payload: Z = -28

    val Battery_Status_Assessment_ServiceAssessmentContext_Payload: Z = -27

    val Battery_Status_Assessment_ServicePublicationDirective_Payload: Z = -26

    val Battery_Status_Assessment_ServiceCheckStatus_Payload: Z = -25

    val Battery_Status_Assessment_ServiceReportTicket_Payload: Z = -24

    val Battery_Status_Assessment_ServiceReportAvailability_Payload: Z = -23

    val Battery_Status_Assessment_ServiceCapacityLevel_Payload: Z = -22

    val Battery_Status_Assessment_ServiceReportQuality_Payload: Z = -21

    val Battery_Status_Assessment_ServiceStatusReadRequest_Payload: Z = -20

    val Battery_Status_Assessment_ServiceQualifiedEvidence_Payload: Z = -19

    val Battery_Status_Assessment_ServiceAssessmentResult_Payload: Z = -18

    val Battery_Status_Assessment_ServiceFeedbackTicket_Payload: Z = -17

    val Battery_Status_Assessment_ServiceUseDisposition_Payload: Z = -16

    val Battery_Status_Assessment_ServiceLifecycleState_Payload: Z = -15

    val Battery_Status_Assessment_ServiceLastAdmittedToken_Payload: Z = -14

    val Battery_Status_Assessment_ServiceAcquisitionState_Payload: Z = -13

    val Battery_Status_Assessment_ServicePublicationState_Payload: Z = -12

    val Battery_Status_Assessment_ServiceCheckRequest: Z = -11

    val Battery_Status_Assessment_ServiceCheckRequest_Payload: Z = -10

    val Battery_Status_Assessment_ServiceBatteryReport: Z = -9

    val Battery_Status_Assessment_ServiceBatteryReport_Payload: Z = -8

    val Battery_Status_Assessment_ServiceCapturedReport: Z = -7

    val Battery_Status_Assessment_ServiceCapturedReport_Payload: Z = -6

    val Battery_Status_Assessment_ServiceTaggedQualifiedEvidence: Z = -5

    val Battery_Status_Assessment_ServiceTaggedQualifiedEvidence_Payload: Z = -4

    val Battery_Status_Assessment_ServiceTaggedAssessment: Z = -3

    val Battery_Status_Assessment_ServiceTaggedAssessment_Payload: Z = -2

    val Battery_Status_Assessment_ServiceControlUseFeedback: Z = -1

    val Battery_Status_Assessment_ServiceControlUseFeedback_Payload: Z = 0

    val Base_TypesBoolean_Payload: Z = 1

    val Base_TypesInteger_Payload: Z = 2

    val Base_TypesInteger_8_Payload: Z = 3

    val Base_TypesInteger_16_Payload: Z = 4

    val Base_TypesInteger_32_Payload: Z = 5

    val Base_TypesInteger_64_Payload: Z = 6

    val Base_TypesUnsigned_8_Payload: Z = 7

    val Base_TypesUnsigned_16_Payload: Z = 8

    val Base_TypesUnsigned_32_Payload: Z = 9

    val Base_TypesUnsigned_64_Payload: Z = 10

    val Base_TypesFloat_Payload: Z = 11

    val Base_TypesFloat_32_Payload: Z = 12

    val Base_TypesFloat_64_Payload: Z = 13

    val Base_TypesCharacter_Payload: Z = 14

    val Base_TypesString_Payload: Z = 15

    val Base_TypesBits_Payload: Z = 16

    val Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P: Z = 17

    val Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS: Z = 18

    val Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P: Z = 19

    val Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS: Z = 20

    val Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P: Z = 21

    val Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS: Z = 22

    val Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P: Z = 23

    val Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS: Z = 24

    val Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_P: Z = 25

    val Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS: Z = 26

    val Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_P: Z = 27

    val Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS: Z = 28

    val Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P: Z = 29

    val Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS: Z = 30

    val Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P: Z = 31

    val Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS: Z = 32

    val Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_P: Z = 33

    val Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PS: Z = 34

    val Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_P: Z = 35

    val Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PS: Z = 36

    val utilEmptyContainer: Z = 37

    val _artEmpty: Z = 38

  }

  object Writer {

    @record class Default(val writer: MessagePack.Writer.Impl) extends Writer

  }

  @msig trait Writer {

    def writer: MessagePack.Writer

    def writeBattery_Status_Assessment_ServiceCheckCommandType(o: Battery_Status_Assessment_Service.CheckCommand.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeBattery_Status_Assessment_ServiceCheckCommand_Payload(o: Battery_Status_Assessment_Service.CheckCommand_Payload): Unit = {
      writer.writeZ(Constants.Battery_Status_Assessment_ServiceCheckCommand_Payload)
      writeBattery_Status_Assessment_ServiceCheckCommandType(o.value)
    }

    def writeBattery_Status_Assessment_ServiceCheckTokenType(o: Battery_Status_Assessment_Service.CheckToken.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeBattery_Status_Assessment_ServiceCheckToken_Payload(o: Battery_Status_Assessment_Service.CheckToken_Payload): Unit = {
      writer.writeZ(Constants.Battery_Status_Assessment_ServiceCheckToken_Payload)
      writeBattery_Status_Assessment_ServiceCheckTokenType(o.value)
    }

    def writeBattery_Status_Assessment_ServiceAcquisitionOutcomeType(o: Battery_Status_Assessment_Service.AcquisitionOutcome.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeBattery_Status_Assessment_ServiceAcquisitionOutcome_Payload(o: Battery_Status_Assessment_Service.AcquisitionOutcome_Payload): Unit = {
      writer.writeZ(Constants.Battery_Status_Assessment_ServiceAcquisitionOutcome_Payload)
      writeBattery_Status_Assessment_ServiceAcquisitionOutcomeType(o.value)
    }

    def writeBattery_Status_Assessment_ServicePublicationOutcomeType(o: Battery_Status_Assessment_Service.PublicationOutcome.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeBattery_Status_Assessment_ServicePublicationOutcome_Payload(o: Battery_Status_Assessment_Service.PublicationOutcome_Payload): Unit = {
      writer.writeZ(Constants.Battery_Status_Assessment_ServicePublicationOutcome_Payload)
      writeBattery_Status_Assessment_ServicePublicationOutcomeType(o.value)
    }

    def writeBattery_Status_Assessment_ServiceAcquisitionDirectiveType(o: Battery_Status_Assessment_Service.AcquisitionDirective.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeBattery_Status_Assessment_ServiceAcquisitionDirective_Payload(o: Battery_Status_Assessment_Service.AcquisitionDirective_Payload): Unit = {
      writer.writeZ(Constants.Battery_Status_Assessment_ServiceAcquisitionDirective_Payload)
      writeBattery_Status_Assessment_ServiceAcquisitionDirectiveType(o.value)
    }

    def writeBattery_Status_Assessment_ServiceAssessmentContextType(o: Battery_Status_Assessment_Service.AssessmentContext.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeBattery_Status_Assessment_ServiceAssessmentContext_Payload(o: Battery_Status_Assessment_Service.AssessmentContext_Payload): Unit = {
      writer.writeZ(Constants.Battery_Status_Assessment_ServiceAssessmentContext_Payload)
      writeBattery_Status_Assessment_ServiceAssessmentContextType(o.value)
    }

    def writeBattery_Status_Assessment_ServicePublicationDirectiveType(o: Battery_Status_Assessment_Service.PublicationDirective.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeBattery_Status_Assessment_ServicePublicationDirective_Payload(o: Battery_Status_Assessment_Service.PublicationDirective_Payload): Unit = {
      writer.writeZ(Constants.Battery_Status_Assessment_ServicePublicationDirective_Payload)
      writeBattery_Status_Assessment_ServicePublicationDirectiveType(o.value)
    }

    def writeBattery_Status_Assessment_ServiceCheckStatusType(o: Battery_Status_Assessment_Service.CheckStatus.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeBattery_Status_Assessment_ServiceCheckStatus_Payload(o: Battery_Status_Assessment_Service.CheckStatus_Payload): Unit = {
      writer.writeZ(Constants.Battery_Status_Assessment_ServiceCheckStatus_Payload)
      writeBattery_Status_Assessment_ServiceCheckStatusType(o.value)
    }

    def writeBattery_Status_Assessment_ServiceReportTicketType(o: Battery_Status_Assessment_Service.ReportTicket.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeBattery_Status_Assessment_ServiceReportTicket_Payload(o: Battery_Status_Assessment_Service.ReportTicket_Payload): Unit = {
      writer.writeZ(Constants.Battery_Status_Assessment_ServiceReportTicket_Payload)
      writeBattery_Status_Assessment_ServiceReportTicketType(o.value)
    }

    def writeBattery_Status_Assessment_ServiceReportAvailabilityType(o: Battery_Status_Assessment_Service.ReportAvailability.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeBattery_Status_Assessment_ServiceReportAvailability_Payload(o: Battery_Status_Assessment_Service.ReportAvailability_Payload): Unit = {
      writer.writeZ(Constants.Battery_Status_Assessment_ServiceReportAvailability_Payload)
      writeBattery_Status_Assessment_ServiceReportAvailabilityType(o.value)
    }

    def writeBattery_Status_Assessment_ServiceCapacityLevelType(o: Battery_Status_Assessment_Service.CapacityLevel.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeBattery_Status_Assessment_ServiceCapacityLevel_Payload(o: Battery_Status_Assessment_Service.CapacityLevel_Payload): Unit = {
      writer.writeZ(Constants.Battery_Status_Assessment_ServiceCapacityLevel_Payload)
      writeBattery_Status_Assessment_ServiceCapacityLevelType(o.value)
    }

    def writeBattery_Status_Assessment_ServiceReportQualityType(o: Battery_Status_Assessment_Service.ReportQuality.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeBattery_Status_Assessment_ServiceReportQuality_Payload(o: Battery_Status_Assessment_Service.ReportQuality_Payload): Unit = {
      writer.writeZ(Constants.Battery_Status_Assessment_ServiceReportQuality_Payload)
      writeBattery_Status_Assessment_ServiceReportQualityType(o.value)
    }

    def writeBattery_Status_Assessment_ServiceStatusReadRequestType(o: Battery_Status_Assessment_Service.StatusReadRequest.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeBattery_Status_Assessment_ServiceStatusReadRequest_Payload(o: Battery_Status_Assessment_Service.StatusReadRequest_Payload): Unit = {
      writer.writeZ(Constants.Battery_Status_Assessment_ServiceStatusReadRequest_Payload)
      writeBattery_Status_Assessment_ServiceStatusReadRequestType(o.value)
    }

    def writeBattery_Status_Assessment_ServiceQualifiedEvidenceType(o: Battery_Status_Assessment_Service.QualifiedEvidence.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeBattery_Status_Assessment_ServiceQualifiedEvidence_Payload(o: Battery_Status_Assessment_Service.QualifiedEvidence_Payload): Unit = {
      writer.writeZ(Constants.Battery_Status_Assessment_ServiceQualifiedEvidence_Payload)
      writeBattery_Status_Assessment_ServiceQualifiedEvidenceType(o.value)
    }

    def writeBattery_Status_Assessment_ServiceAssessmentResultType(o: Battery_Status_Assessment_Service.AssessmentResult.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeBattery_Status_Assessment_ServiceAssessmentResult_Payload(o: Battery_Status_Assessment_Service.AssessmentResult_Payload): Unit = {
      writer.writeZ(Constants.Battery_Status_Assessment_ServiceAssessmentResult_Payload)
      writeBattery_Status_Assessment_ServiceAssessmentResultType(o.value)
    }

    def writeBattery_Status_Assessment_ServiceFeedbackTicketType(o: Battery_Status_Assessment_Service.FeedbackTicket.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeBattery_Status_Assessment_ServiceFeedbackTicket_Payload(o: Battery_Status_Assessment_Service.FeedbackTicket_Payload): Unit = {
      writer.writeZ(Constants.Battery_Status_Assessment_ServiceFeedbackTicket_Payload)
      writeBattery_Status_Assessment_ServiceFeedbackTicketType(o.value)
    }

    def writeBattery_Status_Assessment_ServiceUseDispositionType(o: Battery_Status_Assessment_Service.UseDisposition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeBattery_Status_Assessment_ServiceUseDisposition_Payload(o: Battery_Status_Assessment_Service.UseDisposition_Payload): Unit = {
      writer.writeZ(Constants.Battery_Status_Assessment_ServiceUseDisposition_Payload)
      writeBattery_Status_Assessment_ServiceUseDispositionType(o.value)
    }

    def writeBattery_Status_Assessment_ServiceLifecycleStateType(o: Battery_Status_Assessment_Service.LifecycleState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeBattery_Status_Assessment_ServiceLifecycleState_Payload(o: Battery_Status_Assessment_Service.LifecycleState_Payload): Unit = {
      writer.writeZ(Constants.Battery_Status_Assessment_ServiceLifecycleState_Payload)
      writeBattery_Status_Assessment_ServiceLifecycleStateType(o.value)
    }

    def writeBattery_Status_Assessment_ServiceLastAdmittedTokenType(o: Battery_Status_Assessment_Service.LastAdmittedToken.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeBattery_Status_Assessment_ServiceLastAdmittedToken_Payload(o: Battery_Status_Assessment_Service.LastAdmittedToken_Payload): Unit = {
      writer.writeZ(Constants.Battery_Status_Assessment_ServiceLastAdmittedToken_Payload)
      writeBattery_Status_Assessment_ServiceLastAdmittedTokenType(o.value)
    }

    def writeBattery_Status_Assessment_ServiceAcquisitionStateType(o: Battery_Status_Assessment_Service.AcquisitionState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeBattery_Status_Assessment_ServiceAcquisitionState_Payload(o: Battery_Status_Assessment_Service.AcquisitionState_Payload): Unit = {
      writer.writeZ(Constants.Battery_Status_Assessment_ServiceAcquisitionState_Payload)
      writeBattery_Status_Assessment_ServiceAcquisitionStateType(o.value)
    }

    def writeBattery_Status_Assessment_ServicePublicationStateType(o: Battery_Status_Assessment_Service.PublicationState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeBattery_Status_Assessment_ServicePublicationState_Payload(o: Battery_Status_Assessment_Service.PublicationState_Payload): Unit = {
      writer.writeZ(Constants.Battery_Status_Assessment_ServicePublicationState_Payload)
      writeBattery_Status_Assessment_ServicePublicationStateType(o.value)
    }

    def writeBattery_Status_Assessment_ServiceCheckRequest(o: Battery_Status_Assessment_Service.CheckRequest): Unit = {
      writer.writeZ(Constants.Battery_Status_Assessment_ServiceCheckRequest)
      writeBattery_Status_Assessment_ServiceCheckCommandType(o.command)
      writeBattery_Status_Assessment_ServiceCheckTokenType(o.token)
    }

    def writeBattery_Status_Assessment_ServiceCheckRequest_Payload(o: Battery_Status_Assessment_Service.CheckRequest_Payload): Unit = {
      writer.writeZ(Constants.Battery_Status_Assessment_ServiceCheckRequest_Payload)
      writeBattery_Status_Assessment_ServiceCheckRequest(o.value)
    }

    def writeBattery_Status_Assessment_ServiceBatteryReport(o: Battery_Status_Assessment_Service.BatteryReport): Unit = {
      writer.writeZ(Constants.Battery_Status_Assessment_ServiceBatteryReport)
      writeBattery_Status_Assessment_ServiceReportTicketType(o.ticket)
      writeBattery_Status_Assessment_ServiceReportAvailabilityType(o.availability)
      writeBattery_Status_Assessment_ServiceCapacityLevelType(o.level)
      writeBattery_Status_Assessment_ServiceReportQualityType(o.quality)
    }

    def writeBattery_Status_Assessment_ServiceBatteryReport_Payload(o: Battery_Status_Assessment_Service.BatteryReport_Payload): Unit = {
      writer.writeZ(Constants.Battery_Status_Assessment_ServiceBatteryReport_Payload)
      writeBattery_Status_Assessment_ServiceBatteryReport(o.value)
    }

    def writeBattery_Status_Assessment_ServiceCapturedReport(o: Battery_Status_Assessment_Service.CapturedReport): Unit = {
      writer.writeZ(Constants.Battery_Status_Assessment_ServiceCapturedReport)
      writeBattery_Status_Assessment_ServiceReportTicketType(o.ticket)
      writeBattery_Status_Assessment_ServiceReportAvailabilityType(o.availability)
      writeBattery_Status_Assessment_ServiceCapacityLevelType(o.level)
      writeBattery_Status_Assessment_ServiceReportQualityType(o.quality)
    }

    def writeBattery_Status_Assessment_ServiceCapturedReport_Payload(o: Battery_Status_Assessment_Service.CapturedReport_Payload): Unit = {
      writer.writeZ(Constants.Battery_Status_Assessment_ServiceCapturedReport_Payload)
      writeBattery_Status_Assessment_ServiceCapturedReport(o.value)
    }

    def writeBattery_Status_Assessment_ServiceTaggedQualifiedEvidence(o: Battery_Status_Assessment_Service.TaggedQualifiedEvidence): Unit = {
      writer.writeZ(Constants.Battery_Status_Assessment_ServiceTaggedQualifiedEvidence)
      writeBattery_Status_Assessment_ServiceReportTicketType(o.ticket)
      writeBattery_Status_Assessment_ServiceQualifiedEvidenceType(o.evidence)
    }

    def writeBattery_Status_Assessment_ServiceTaggedQualifiedEvidence_Payload(o: Battery_Status_Assessment_Service.TaggedQualifiedEvidence_Payload): Unit = {
      writer.writeZ(Constants.Battery_Status_Assessment_ServiceTaggedQualifiedEvidence_Payload)
      writeBattery_Status_Assessment_ServiceTaggedQualifiedEvidence(o.value)
    }

    def writeBattery_Status_Assessment_ServiceTaggedAssessment(o: Battery_Status_Assessment_Service.TaggedAssessment): Unit = {
      writer.writeZ(Constants.Battery_Status_Assessment_ServiceTaggedAssessment)
      writeBattery_Status_Assessment_ServiceReportTicketType(o.ticket)
      writeBattery_Status_Assessment_ServiceAssessmentResultType(o.result)
    }

    def writeBattery_Status_Assessment_ServiceTaggedAssessment_Payload(o: Battery_Status_Assessment_Service.TaggedAssessment_Payload): Unit = {
      writer.writeZ(Constants.Battery_Status_Assessment_ServiceTaggedAssessment_Payload)
      writeBattery_Status_Assessment_ServiceTaggedAssessment(o.value)
    }

    def writeBattery_Status_Assessment_ServiceControlUseFeedback(o: Battery_Status_Assessment_Service.ControlUseFeedback): Unit = {
      writer.writeZ(Constants.Battery_Status_Assessment_ServiceControlUseFeedback)
      writeBattery_Status_Assessment_ServiceFeedbackTicketType(o.ticket)
      writeBattery_Status_Assessment_ServiceUseDispositionType(o.disposition)
    }

    def writeBattery_Status_Assessment_ServiceControlUseFeedback_Payload(o: Battery_Status_Assessment_Service.ControlUseFeedback_Payload): Unit = {
      writer.writeZ(Constants.Battery_Status_Assessment_ServiceControlUseFeedback_Payload)
      writeBattery_Status_Assessment_ServiceControlUseFeedback(o.value)
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

    def writeBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container(o: Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container): Unit = {
      o match {
        case o: Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P => writeBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P(o)
        case o: Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS => writeBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS(o)
      }
    }

    def writeBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P(o: Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P)
      writeBattery_Status_Assessment_ServiceAcquisitionOutcomeType(o.api_acquisition_outcome)
      writeBattery_Status_Assessment_ServiceCheckRequest(o.api_check_request)
      writeBattery_Status_Assessment_ServicePublicationOutcomeType(o.api_publication_outcome)
    }

    def writeBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS(o: Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS)
      writeBattery_Status_Assessment_ServiceLastAdmittedTokenType(o.In_lastAdmittedToken)
      writeBattery_Status_Assessment_ServiceLifecycleStateType(o.In_lifecycleState)
      writeBattery_Status_Assessment_ServiceAcquisitionOutcomeType(o.api_acquisition_outcome)
      writeBattery_Status_Assessment_ServiceCheckRequest(o.api_check_request)
      writeBattery_Status_Assessment_ServicePublicationOutcomeType(o.api_publication_outcome)
    }

    def writeBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container(o: Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container): Unit = {
      o match {
        case o: Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P => writeBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P(o)
        case o: Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS => writeBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS(o)
      }
    }

    def writeBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P(o: Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P)
      writeBattery_Status_Assessment_ServiceAcquisitionDirectiveType(o.api_acquisition_directive)
      writeBattery_Status_Assessment_ServiceAssessmentContextType(o.api_assessment_context)
      writeBattery_Status_Assessment_ServiceCheckStatusType(o.api_check_status)
      writeBattery_Status_Assessment_ServicePublicationDirectiveType(o.api_publication_directive)
    }

    def writeBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS(o: Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS)
      writeBattery_Status_Assessment_ServiceLastAdmittedTokenType(o.lastAdmittedToken)
      writeBattery_Status_Assessment_ServiceLifecycleStateType(o.lifecycleState)
      writeBattery_Status_Assessment_ServiceAcquisitionDirectiveType(o.api_acquisition_directive)
      writeBattery_Status_Assessment_ServiceAssessmentContextType(o.api_assessment_context)
      writeBattery_Status_Assessment_ServiceCheckStatusType(o.api_check_status)
      writeBattery_Status_Assessment_ServicePublicationDirectiveType(o.api_publication_directive)
    }

    def writeBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container(o: Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container): Unit = {
      o match {
        case o: Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P => writeBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P(o)
        case o: Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS => writeBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS(o)
      }
    }

    def writeBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P(o: Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P)
      writeBattery_Status_Assessment_ServiceAcquisitionDirectiveType(o.api_acquisition_directive)
      writeBattery_Status_Assessment_ServiceBatteryReport(o.api_battery_report)
    }

    def writeBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS(o: Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS)
      writeBattery_Status_Assessment_ServiceAcquisitionStateType(o.In_acquisitionState)
      writeBattery_Status_Assessment_ServiceAcquisitionOutcomeType(o.In_committedAcquisitionOutcome)
      writeBattery_Status_Assessment_ServiceAcquisitionDirectiveType(o.api_acquisition_directive)
      writeBattery_Status_Assessment_ServiceBatteryReport(o.api_battery_report)
    }

    def writeBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container(o: Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container): Unit = {
      o match {
        case o: Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P => writeBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P(o)
        case o: Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS => writeBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS(o)
      }
    }

    def writeBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P(o: Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P)
      writeBattery_Status_Assessment_ServiceAcquisitionOutcomeType(o.api_acquisition_outcome)
      writeBattery_Status_Assessment_ServiceCapturedReport(o.api_captured_report)
      writeBattery_Status_Assessment_ServiceStatusReadRequestType(o.api_status_read_request)
    }

    def writeBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS(o: Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS)
      writeBattery_Status_Assessment_ServiceAcquisitionStateType(o.acquisitionState)
      writeBattery_Status_Assessment_ServiceAcquisitionOutcomeType(o.committedAcquisitionOutcome)
      writeBattery_Status_Assessment_ServiceAcquisitionOutcomeType(o.api_acquisition_outcome)
      writeBattery_Status_Assessment_ServiceCapturedReport(o.api_captured_report)
      writeBattery_Status_Assessment_ServiceStatusReadRequestType(o.api_status_read_request)
    }

    def writeBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container(o: Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container): Unit = {
      o match {
        case o: Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container_P => writeBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_P(o)
        case o: Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS => writeBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS(o)
      }
    }

    def writeBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_P(o: Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_P)
      writeBattery_Status_Assessment_ServiceCapturedReport(o.api_captured_report)
    }

    def writeBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS(o: Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS)
      writeBattery_Status_Assessment_ServiceCapturedReport(o.api_captured_report)
    }

    def writeBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container(o: Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container): Unit = {
      o match {
        case o: Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container_P => writeBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_P(o)
        case o: Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS => writeBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS(o)
      }
    }

    def writeBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_P(o: Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_P)
      writeBattery_Status_Assessment_ServiceTaggedQualifiedEvidence(o.api_qualified_evidence)
    }

    def writeBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS(o: Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS)
      writeBattery_Status_Assessment_ServiceTaggedQualifiedEvidence(o.api_qualified_evidence)
    }

    def writeBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container(o: Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container): Unit = {
      o match {
        case o: Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P => writeBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P(o)
        case o: Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS => writeBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS(o)
      }
    }

    def writeBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P(o: Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P)
      writeBattery_Status_Assessment_ServiceAssessmentContextType(o.api_assessment_context)
      writeBattery_Status_Assessment_ServiceTaggedQualifiedEvidence(o.api_qualified_evidence)
    }

    def writeBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS(o: Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS)
      writeBattery_Status_Assessment_ServiceAssessmentContextType(o.api_assessment_context)
      writeBattery_Status_Assessment_ServiceTaggedQualifiedEvidence(o.api_qualified_evidence)
    }

    def writeBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container(o: Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container): Unit = {
      o match {
        case o: Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P => writeBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P(o)
        case o: Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS => writeBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS(o)
      }
    }

    def writeBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P(o: Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P)
      writeBattery_Status_Assessment_ServiceTaggedAssessment(o.api_decision_assessment)
    }

    def writeBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS(o: Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS)
      writeBattery_Status_Assessment_ServiceTaggedAssessment(o.api_decision_assessment)
    }

    def writeBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container(o: Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container): Unit = {
      o match {
        case o: Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container_P => writeBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_P(o)
        case o: Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container_PS => writeBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PS(o)
      }
    }

    def writeBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_P(o: Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_P)
      writeBattery_Status_Assessment_ServiceControlUseFeedback(o.api_control_use_feedback)
      writeBattery_Status_Assessment_ServiceTaggedAssessment(o.api_decision_assessment)
      writeBattery_Status_Assessment_ServicePublicationDirectiveType(o.api_publication_directive)
    }

    def writeBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PS(o: Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PS)
      writeBattery_Status_Assessment_ServicePublicationOutcomeType(o.In_committedPublicationOutcome)
      writeBattery_Status_Assessment_ServicePublicationStateType(o.In_publicationState)
      writeBattery_Status_Assessment_ServiceAssessmentResultType(o.In_retainedAssessment)
      writeBattery_Status_Assessment_ServiceControlUseFeedback(o.api_control_use_feedback)
      writeBattery_Status_Assessment_ServiceTaggedAssessment(o.api_decision_assessment)
      writeBattery_Status_Assessment_ServicePublicationDirectiveType(o.api_publication_directive)
    }

    def writeBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container(o: Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container): Unit = {
      o match {
        case o: Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container_P => writeBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_P(o)
        case o: Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container_PS => writeBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PS(o)
      }
    }

    def writeBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_P(o: Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_P)
      writeBattery_Status_Assessment_ServiceTaggedAssessment(o.api_battery_assessment)
      writeBattery_Status_Assessment_ServicePublicationOutcomeType(o.api_publication_outcome)
    }

    def writeBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PS(o: Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PS)
      writeBattery_Status_Assessment_ServicePublicationOutcomeType(o.committedPublicationOutcome)
      writeBattery_Status_Assessment_ServicePublicationStateType(o.publicationState)
      writeBattery_Status_Assessment_ServiceAssessmentResultType(o.retainedAssessment)
      writeBattery_Status_Assessment_ServiceTaggedAssessment(o.api_battery_assessment)
      writeBattery_Status_Assessment_ServicePublicationOutcomeType(o.api_publication_outcome)
    }

    def writeruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeutilContainer(o: util.Container): Unit = {
      o match {
        case o: util.EmptyContainer => writeutilEmptyContainer(o)
        case o: Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container_P => writeBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_P(o)
        case o: Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container_PS => writeBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PS(o)
        case o: Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container_P => writeBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_P(o)
        case o: Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container_PS => writeBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PS(o)
        case o: Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P => writeBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P(o)
        case o: Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS => writeBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS(o)
        case o: Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P => writeBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P(o)
        case o: Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS => writeBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS(o)
        case o: Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P => writeBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P(o)
        case o: Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS => writeBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS(o)
        case o: Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P => writeBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P(o)
        case o: Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS => writeBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS(o)
        case o: Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P => writeBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P(o)
        case o: Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS => writeBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS(o)
        case o: Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P => writeBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P(o)
        case o: Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS => writeBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS(o)
        case o: Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container_P => writeBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_P(o)
        case o: Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS => writeBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS(o)
        case o: Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container_P => writeBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_P(o)
        case o: Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS => writeBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS(o)
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
        case o: Battery_Status_Assessment_Service.CheckToken_Payload => writeBattery_Status_Assessment_ServiceCheckToken_Payload(o)
        case o: Battery_Status_Assessment_Service.CheckStatus_Payload => writeBattery_Status_Assessment_ServiceCheckStatus_Payload(o)
        case o: Battery_Status_Assessment_Service.ReportTicket_Payload => writeBattery_Status_Assessment_ServiceReportTicket_Payload(o)
        case o: Battery_Status_Assessment_Service.CheckCommand_Payload => writeBattery_Status_Assessment_ServiceCheckCommand_Payload(o)
        case o: Battery_Status_Assessment_Service.CheckRequest_Payload => writeBattery_Status_Assessment_ServiceCheckRequest_Payload(o)
        case o: Battery_Status_Assessment_Service.ReportQuality_Payload => writeBattery_Status_Assessment_ServiceReportQuality_Payload(o)
        case o: Battery_Status_Assessment_Service.CapacityLevel_Payload => writeBattery_Status_Assessment_ServiceCapacityLevel_Payload(o)
        case o: Battery_Status_Assessment_Service.BatteryReport_Payload => writeBattery_Status_Assessment_ServiceBatteryReport_Payload(o)
        case o: Battery_Status_Assessment_Service.FeedbackTicket_Payload => writeBattery_Status_Assessment_ServiceFeedbackTicket_Payload(o)
        case o: Battery_Status_Assessment_Service.LifecycleState_Payload => writeBattery_Status_Assessment_ServiceLifecycleState_Payload(o)
        case o: Battery_Status_Assessment_Service.UseDisposition_Payload => writeBattery_Status_Assessment_ServiceUseDisposition_Payload(o)
        case o: Battery_Status_Assessment_Service.CapturedReport_Payload => writeBattery_Status_Assessment_ServiceCapturedReport_Payload(o)
        case o: Battery_Status_Assessment_Service.AcquisitionState_Payload => writeBattery_Status_Assessment_ServiceAcquisitionState_Payload(o)
        case o: Battery_Status_Assessment_Service.PublicationState_Payload => writeBattery_Status_Assessment_ServicePublicationState_Payload(o)
        case o: Battery_Status_Assessment_Service.AssessmentResult_Payload => writeBattery_Status_Assessment_ServiceAssessmentResult_Payload(o)
        case o: Battery_Status_Assessment_Service.TaggedAssessment_Payload => writeBattery_Status_Assessment_ServiceTaggedAssessment_Payload(o)
        case o: Battery_Status_Assessment_Service.LastAdmittedToken_Payload => writeBattery_Status_Assessment_ServiceLastAdmittedToken_Payload(o)
        case o: Battery_Status_Assessment_Service.StatusReadRequest_Payload => writeBattery_Status_Assessment_ServiceStatusReadRequest_Payload(o)
        case o: Battery_Status_Assessment_Service.AssessmentContext_Payload => writeBattery_Status_Assessment_ServiceAssessmentContext_Payload(o)
        case o: Battery_Status_Assessment_Service.QualifiedEvidence_Payload => writeBattery_Status_Assessment_ServiceQualifiedEvidence_Payload(o)
        case o: Battery_Status_Assessment_Service.ReportAvailability_Payload => writeBattery_Status_Assessment_ServiceReportAvailability_Payload(o)
        case o: Battery_Status_Assessment_Service.AcquisitionOutcome_Payload => writeBattery_Status_Assessment_ServiceAcquisitionOutcome_Payload(o)
        case o: Battery_Status_Assessment_Service.PublicationOutcome_Payload => writeBattery_Status_Assessment_ServicePublicationOutcome_Payload(o)
        case o: Battery_Status_Assessment_Service.ControlUseFeedback_Payload => writeBattery_Status_Assessment_ServiceControlUseFeedback_Payload(o)
        case o: Battery_Status_Assessment_Service.AcquisitionDirective_Payload => writeBattery_Status_Assessment_ServiceAcquisitionDirective_Payload(o)
        case o: Battery_Status_Assessment_Service.PublicationDirective_Payload => writeBattery_Status_Assessment_ServicePublicationDirective_Payload(o)
        case o: Battery_Status_Assessment_Service.TaggedQualifiedEvidence_Payload => writeBattery_Status_Assessment_ServiceTaggedQualifiedEvidence_Payload(o)
        case o: Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container_P => writeBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_P(o)
        case o: Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container_PS => writeBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PS(o)
        case o: Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container_P => writeBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_P(o)
        case o: Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container_PS => writeBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PS(o)
        case o: Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P => writeBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P(o)
        case o: Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS => writeBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS(o)
        case o: Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P => writeBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P(o)
        case o: Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS => writeBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS(o)
        case o: Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P => writeBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P(o)
        case o: Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS => writeBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS(o)
        case o: Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P => writeBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P(o)
        case o: Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS => writeBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS(o)
        case o: Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P => writeBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P(o)
        case o: Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS => writeBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS(o)
        case o: Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P => writeBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P(o)
        case o: Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS => writeBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS(o)
        case o: Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container_P => writeBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_P(o)
        case o: Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS => writeBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS(o)
        case o: Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container_P => writeBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_P(o)
        case o: Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS => writeBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS(o)
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

    def readBattery_Status_Assessment_ServiceCheckCommandType(): Battery_Status_Assessment_Service.CheckCommand.Type = {
      val r = reader.readZ()
      return Battery_Status_Assessment_Service.CheckCommand.byOrdinal(r).get
    }

    def readBattery_Status_Assessment_ServiceCheckCommand_Payload(): Battery_Status_Assessment_Service.CheckCommand_Payload = {
      val r = readBattery_Status_Assessment_ServiceCheckCommand_PayloadT(F)
      return r
    }

    def readBattery_Status_Assessment_ServiceCheckCommand_PayloadT(typeParsed: B): Battery_Status_Assessment_Service.CheckCommand_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Status_Assessment_ServiceCheckCommand_Payload)
      }
      val value = readBattery_Status_Assessment_ServiceCheckCommandType()
      return Battery_Status_Assessment_Service.CheckCommand_Payload(value)
    }

    def readBattery_Status_Assessment_ServiceCheckTokenType(): Battery_Status_Assessment_Service.CheckToken.Type = {
      val r = reader.readZ()
      return Battery_Status_Assessment_Service.CheckToken.byOrdinal(r).get
    }

    def readBattery_Status_Assessment_ServiceCheckToken_Payload(): Battery_Status_Assessment_Service.CheckToken_Payload = {
      val r = readBattery_Status_Assessment_ServiceCheckToken_PayloadT(F)
      return r
    }

    def readBattery_Status_Assessment_ServiceCheckToken_PayloadT(typeParsed: B): Battery_Status_Assessment_Service.CheckToken_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Status_Assessment_ServiceCheckToken_Payload)
      }
      val value = readBattery_Status_Assessment_ServiceCheckTokenType()
      return Battery_Status_Assessment_Service.CheckToken_Payload(value)
    }

    def readBattery_Status_Assessment_ServiceAcquisitionOutcomeType(): Battery_Status_Assessment_Service.AcquisitionOutcome.Type = {
      val r = reader.readZ()
      return Battery_Status_Assessment_Service.AcquisitionOutcome.byOrdinal(r).get
    }

    def readBattery_Status_Assessment_ServiceAcquisitionOutcome_Payload(): Battery_Status_Assessment_Service.AcquisitionOutcome_Payload = {
      val r = readBattery_Status_Assessment_ServiceAcquisitionOutcome_PayloadT(F)
      return r
    }

    def readBattery_Status_Assessment_ServiceAcquisitionOutcome_PayloadT(typeParsed: B): Battery_Status_Assessment_Service.AcquisitionOutcome_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Status_Assessment_ServiceAcquisitionOutcome_Payload)
      }
      val value = readBattery_Status_Assessment_ServiceAcquisitionOutcomeType()
      return Battery_Status_Assessment_Service.AcquisitionOutcome_Payload(value)
    }

    def readBattery_Status_Assessment_ServicePublicationOutcomeType(): Battery_Status_Assessment_Service.PublicationOutcome.Type = {
      val r = reader.readZ()
      return Battery_Status_Assessment_Service.PublicationOutcome.byOrdinal(r).get
    }

    def readBattery_Status_Assessment_ServicePublicationOutcome_Payload(): Battery_Status_Assessment_Service.PublicationOutcome_Payload = {
      val r = readBattery_Status_Assessment_ServicePublicationOutcome_PayloadT(F)
      return r
    }

    def readBattery_Status_Assessment_ServicePublicationOutcome_PayloadT(typeParsed: B): Battery_Status_Assessment_Service.PublicationOutcome_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Status_Assessment_ServicePublicationOutcome_Payload)
      }
      val value = readBattery_Status_Assessment_ServicePublicationOutcomeType()
      return Battery_Status_Assessment_Service.PublicationOutcome_Payload(value)
    }

    def readBattery_Status_Assessment_ServiceAcquisitionDirectiveType(): Battery_Status_Assessment_Service.AcquisitionDirective.Type = {
      val r = reader.readZ()
      return Battery_Status_Assessment_Service.AcquisitionDirective.byOrdinal(r).get
    }

    def readBattery_Status_Assessment_ServiceAcquisitionDirective_Payload(): Battery_Status_Assessment_Service.AcquisitionDirective_Payload = {
      val r = readBattery_Status_Assessment_ServiceAcquisitionDirective_PayloadT(F)
      return r
    }

    def readBattery_Status_Assessment_ServiceAcquisitionDirective_PayloadT(typeParsed: B): Battery_Status_Assessment_Service.AcquisitionDirective_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Status_Assessment_ServiceAcquisitionDirective_Payload)
      }
      val value = readBattery_Status_Assessment_ServiceAcquisitionDirectiveType()
      return Battery_Status_Assessment_Service.AcquisitionDirective_Payload(value)
    }

    def readBattery_Status_Assessment_ServiceAssessmentContextType(): Battery_Status_Assessment_Service.AssessmentContext.Type = {
      val r = reader.readZ()
      return Battery_Status_Assessment_Service.AssessmentContext.byOrdinal(r).get
    }

    def readBattery_Status_Assessment_ServiceAssessmentContext_Payload(): Battery_Status_Assessment_Service.AssessmentContext_Payload = {
      val r = readBattery_Status_Assessment_ServiceAssessmentContext_PayloadT(F)
      return r
    }

    def readBattery_Status_Assessment_ServiceAssessmentContext_PayloadT(typeParsed: B): Battery_Status_Assessment_Service.AssessmentContext_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Status_Assessment_ServiceAssessmentContext_Payload)
      }
      val value = readBattery_Status_Assessment_ServiceAssessmentContextType()
      return Battery_Status_Assessment_Service.AssessmentContext_Payload(value)
    }

    def readBattery_Status_Assessment_ServicePublicationDirectiveType(): Battery_Status_Assessment_Service.PublicationDirective.Type = {
      val r = reader.readZ()
      return Battery_Status_Assessment_Service.PublicationDirective.byOrdinal(r).get
    }

    def readBattery_Status_Assessment_ServicePublicationDirective_Payload(): Battery_Status_Assessment_Service.PublicationDirective_Payload = {
      val r = readBattery_Status_Assessment_ServicePublicationDirective_PayloadT(F)
      return r
    }

    def readBattery_Status_Assessment_ServicePublicationDirective_PayloadT(typeParsed: B): Battery_Status_Assessment_Service.PublicationDirective_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Status_Assessment_ServicePublicationDirective_Payload)
      }
      val value = readBattery_Status_Assessment_ServicePublicationDirectiveType()
      return Battery_Status_Assessment_Service.PublicationDirective_Payload(value)
    }

    def readBattery_Status_Assessment_ServiceCheckStatusType(): Battery_Status_Assessment_Service.CheckStatus.Type = {
      val r = reader.readZ()
      return Battery_Status_Assessment_Service.CheckStatus.byOrdinal(r).get
    }

    def readBattery_Status_Assessment_ServiceCheckStatus_Payload(): Battery_Status_Assessment_Service.CheckStatus_Payload = {
      val r = readBattery_Status_Assessment_ServiceCheckStatus_PayloadT(F)
      return r
    }

    def readBattery_Status_Assessment_ServiceCheckStatus_PayloadT(typeParsed: B): Battery_Status_Assessment_Service.CheckStatus_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Status_Assessment_ServiceCheckStatus_Payload)
      }
      val value = readBattery_Status_Assessment_ServiceCheckStatusType()
      return Battery_Status_Assessment_Service.CheckStatus_Payload(value)
    }

    def readBattery_Status_Assessment_ServiceReportTicketType(): Battery_Status_Assessment_Service.ReportTicket.Type = {
      val r = reader.readZ()
      return Battery_Status_Assessment_Service.ReportTicket.byOrdinal(r).get
    }

    def readBattery_Status_Assessment_ServiceReportTicket_Payload(): Battery_Status_Assessment_Service.ReportTicket_Payload = {
      val r = readBattery_Status_Assessment_ServiceReportTicket_PayloadT(F)
      return r
    }

    def readBattery_Status_Assessment_ServiceReportTicket_PayloadT(typeParsed: B): Battery_Status_Assessment_Service.ReportTicket_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Status_Assessment_ServiceReportTicket_Payload)
      }
      val value = readBattery_Status_Assessment_ServiceReportTicketType()
      return Battery_Status_Assessment_Service.ReportTicket_Payload(value)
    }

    def readBattery_Status_Assessment_ServiceReportAvailabilityType(): Battery_Status_Assessment_Service.ReportAvailability.Type = {
      val r = reader.readZ()
      return Battery_Status_Assessment_Service.ReportAvailability.byOrdinal(r).get
    }

    def readBattery_Status_Assessment_ServiceReportAvailability_Payload(): Battery_Status_Assessment_Service.ReportAvailability_Payload = {
      val r = readBattery_Status_Assessment_ServiceReportAvailability_PayloadT(F)
      return r
    }

    def readBattery_Status_Assessment_ServiceReportAvailability_PayloadT(typeParsed: B): Battery_Status_Assessment_Service.ReportAvailability_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Status_Assessment_ServiceReportAvailability_Payload)
      }
      val value = readBattery_Status_Assessment_ServiceReportAvailabilityType()
      return Battery_Status_Assessment_Service.ReportAvailability_Payload(value)
    }

    def readBattery_Status_Assessment_ServiceCapacityLevelType(): Battery_Status_Assessment_Service.CapacityLevel.Type = {
      val r = reader.readZ()
      return Battery_Status_Assessment_Service.CapacityLevel.byOrdinal(r).get
    }

    def readBattery_Status_Assessment_ServiceCapacityLevel_Payload(): Battery_Status_Assessment_Service.CapacityLevel_Payload = {
      val r = readBattery_Status_Assessment_ServiceCapacityLevel_PayloadT(F)
      return r
    }

    def readBattery_Status_Assessment_ServiceCapacityLevel_PayloadT(typeParsed: B): Battery_Status_Assessment_Service.CapacityLevel_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Status_Assessment_ServiceCapacityLevel_Payload)
      }
      val value = readBattery_Status_Assessment_ServiceCapacityLevelType()
      return Battery_Status_Assessment_Service.CapacityLevel_Payload(value)
    }

    def readBattery_Status_Assessment_ServiceReportQualityType(): Battery_Status_Assessment_Service.ReportQuality.Type = {
      val r = reader.readZ()
      return Battery_Status_Assessment_Service.ReportQuality.byOrdinal(r).get
    }

    def readBattery_Status_Assessment_ServiceReportQuality_Payload(): Battery_Status_Assessment_Service.ReportQuality_Payload = {
      val r = readBattery_Status_Assessment_ServiceReportQuality_PayloadT(F)
      return r
    }

    def readBattery_Status_Assessment_ServiceReportQuality_PayloadT(typeParsed: B): Battery_Status_Assessment_Service.ReportQuality_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Status_Assessment_ServiceReportQuality_Payload)
      }
      val value = readBattery_Status_Assessment_ServiceReportQualityType()
      return Battery_Status_Assessment_Service.ReportQuality_Payload(value)
    }

    def readBattery_Status_Assessment_ServiceStatusReadRequestType(): Battery_Status_Assessment_Service.StatusReadRequest.Type = {
      val r = reader.readZ()
      return Battery_Status_Assessment_Service.StatusReadRequest.byOrdinal(r).get
    }

    def readBattery_Status_Assessment_ServiceStatusReadRequest_Payload(): Battery_Status_Assessment_Service.StatusReadRequest_Payload = {
      val r = readBattery_Status_Assessment_ServiceStatusReadRequest_PayloadT(F)
      return r
    }

    def readBattery_Status_Assessment_ServiceStatusReadRequest_PayloadT(typeParsed: B): Battery_Status_Assessment_Service.StatusReadRequest_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Status_Assessment_ServiceStatusReadRequest_Payload)
      }
      val value = readBattery_Status_Assessment_ServiceStatusReadRequestType()
      return Battery_Status_Assessment_Service.StatusReadRequest_Payload(value)
    }

    def readBattery_Status_Assessment_ServiceQualifiedEvidenceType(): Battery_Status_Assessment_Service.QualifiedEvidence.Type = {
      val r = reader.readZ()
      return Battery_Status_Assessment_Service.QualifiedEvidence.byOrdinal(r).get
    }

    def readBattery_Status_Assessment_ServiceQualifiedEvidence_Payload(): Battery_Status_Assessment_Service.QualifiedEvidence_Payload = {
      val r = readBattery_Status_Assessment_ServiceQualifiedEvidence_PayloadT(F)
      return r
    }

    def readBattery_Status_Assessment_ServiceQualifiedEvidence_PayloadT(typeParsed: B): Battery_Status_Assessment_Service.QualifiedEvidence_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Status_Assessment_ServiceQualifiedEvidence_Payload)
      }
      val value = readBattery_Status_Assessment_ServiceQualifiedEvidenceType()
      return Battery_Status_Assessment_Service.QualifiedEvidence_Payload(value)
    }

    def readBattery_Status_Assessment_ServiceAssessmentResultType(): Battery_Status_Assessment_Service.AssessmentResult.Type = {
      val r = reader.readZ()
      return Battery_Status_Assessment_Service.AssessmentResult.byOrdinal(r).get
    }

    def readBattery_Status_Assessment_ServiceAssessmentResult_Payload(): Battery_Status_Assessment_Service.AssessmentResult_Payload = {
      val r = readBattery_Status_Assessment_ServiceAssessmentResult_PayloadT(F)
      return r
    }

    def readBattery_Status_Assessment_ServiceAssessmentResult_PayloadT(typeParsed: B): Battery_Status_Assessment_Service.AssessmentResult_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Status_Assessment_ServiceAssessmentResult_Payload)
      }
      val value = readBattery_Status_Assessment_ServiceAssessmentResultType()
      return Battery_Status_Assessment_Service.AssessmentResult_Payload(value)
    }

    def readBattery_Status_Assessment_ServiceFeedbackTicketType(): Battery_Status_Assessment_Service.FeedbackTicket.Type = {
      val r = reader.readZ()
      return Battery_Status_Assessment_Service.FeedbackTicket.byOrdinal(r).get
    }

    def readBattery_Status_Assessment_ServiceFeedbackTicket_Payload(): Battery_Status_Assessment_Service.FeedbackTicket_Payload = {
      val r = readBattery_Status_Assessment_ServiceFeedbackTicket_PayloadT(F)
      return r
    }

    def readBattery_Status_Assessment_ServiceFeedbackTicket_PayloadT(typeParsed: B): Battery_Status_Assessment_Service.FeedbackTicket_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Status_Assessment_ServiceFeedbackTicket_Payload)
      }
      val value = readBattery_Status_Assessment_ServiceFeedbackTicketType()
      return Battery_Status_Assessment_Service.FeedbackTicket_Payload(value)
    }

    def readBattery_Status_Assessment_ServiceUseDispositionType(): Battery_Status_Assessment_Service.UseDisposition.Type = {
      val r = reader.readZ()
      return Battery_Status_Assessment_Service.UseDisposition.byOrdinal(r).get
    }

    def readBattery_Status_Assessment_ServiceUseDisposition_Payload(): Battery_Status_Assessment_Service.UseDisposition_Payload = {
      val r = readBattery_Status_Assessment_ServiceUseDisposition_PayloadT(F)
      return r
    }

    def readBattery_Status_Assessment_ServiceUseDisposition_PayloadT(typeParsed: B): Battery_Status_Assessment_Service.UseDisposition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Status_Assessment_ServiceUseDisposition_Payload)
      }
      val value = readBattery_Status_Assessment_ServiceUseDispositionType()
      return Battery_Status_Assessment_Service.UseDisposition_Payload(value)
    }

    def readBattery_Status_Assessment_ServiceLifecycleStateType(): Battery_Status_Assessment_Service.LifecycleState.Type = {
      val r = reader.readZ()
      return Battery_Status_Assessment_Service.LifecycleState.byOrdinal(r).get
    }

    def readBattery_Status_Assessment_ServiceLifecycleState_Payload(): Battery_Status_Assessment_Service.LifecycleState_Payload = {
      val r = readBattery_Status_Assessment_ServiceLifecycleState_PayloadT(F)
      return r
    }

    def readBattery_Status_Assessment_ServiceLifecycleState_PayloadT(typeParsed: B): Battery_Status_Assessment_Service.LifecycleState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Status_Assessment_ServiceLifecycleState_Payload)
      }
      val value = readBattery_Status_Assessment_ServiceLifecycleStateType()
      return Battery_Status_Assessment_Service.LifecycleState_Payload(value)
    }

    def readBattery_Status_Assessment_ServiceLastAdmittedTokenType(): Battery_Status_Assessment_Service.LastAdmittedToken.Type = {
      val r = reader.readZ()
      return Battery_Status_Assessment_Service.LastAdmittedToken.byOrdinal(r).get
    }

    def readBattery_Status_Assessment_ServiceLastAdmittedToken_Payload(): Battery_Status_Assessment_Service.LastAdmittedToken_Payload = {
      val r = readBattery_Status_Assessment_ServiceLastAdmittedToken_PayloadT(F)
      return r
    }

    def readBattery_Status_Assessment_ServiceLastAdmittedToken_PayloadT(typeParsed: B): Battery_Status_Assessment_Service.LastAdmittedToken_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Status_Assessment_ServiceLastAdmittedToken_Payload)
      }
      val value = readBattery_Status_Assessment_ServiceLastAdmittedTokenType()
      return Battery_Status_Assessment_Service.LastAdmittedToken_Payload(value)
    }

    def readBattery_Status_Assessment_ServiceAcquisitionStateType(): Battery_Status_Assessment_Service.AcquisitionState.Type = {
      val r = reader.readZ()
      return Battery_Status_Assessment_Service.AcquisitionState.byOrdinal(r).get
    }

    def readBattery_Status_Assessment_ServiceAcquisitionState_Payload(): Battery_Status_Assessment_Service.AcquisitionState_Payload = {
      val r = readBattery_Status_Assessment_ServiceAcquisitionState_PayloadT(F)
      return r
    }

    def readBattery_Status_Assessment_ServiceAcquisitionState_PayloadT(typeParsed: B): Battery_Status_Assessment_Service.AcquisitionState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Status_Assessment_ServiceAcquisitionState_Payload)
      }
      val value = readBattery_Status_Assessment_ServiceAcquisitionStateType()
      return Battery_Status_Assessment_Service.AcquisitionState_Payload(value)
    }

    def readBattery_Status_Assessment_ServicePublicationStateType(): Battery_Status_Assessment_Service.PublicationState.Type = {
      val r = reader.readZ()
      return Battery_Status_Assessment_Service.PublicationState.byOrdinal(r).get
    }

    def readBattery_Status_Assessment_ServicePublicationState_Payload(): Battery_Status_Assessment_Service.PublicationState_Payload = {
      val r = readBattery_Status_Assessment_ServicePublicationState_PayloadT(F)
      return r
    }

    def readBattery_Status_Assessment_ServicePublicationState_PayloadT(typeParsed: B): Battery_Status_Assessment_Service.PublicationState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Status_Assessment_ServicePublicationState_Payload)
      }
      val value = readBattery_Status_Assessment_ServicePublicationStateType()
      return Battery_Status_Assessment_Service.PublicationState_Payload(value)
    }

    def readBattery_Status_Assessment_ServiceCheckRequest(): Battery_Status_Assessment_Service.CheckRequest = {
      val r = readBattery_Status_Assessment_ServiceCheckRequestT(F)
      return r
    }

    def readBattery_Status_Assessment_ServiceCheckRequestT(typeParsed: B): Battery_Status_Assessment_Service.CheckRequest = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Status_Assessment_ServiceCheckRequest)
      }
      val command = readBattery_Status_Assessment_ServiceCheckCommandType()
      val token = readBattery_Status_Assessment_ServiceCheckTokenType()
      return Battery_Status_Assessment_Service.CheckRequest(command, token)
    }

    def readBattery_Status_Assessment_ServiceCheckRequest_Payload(): Battery_Status_Assessment_Service.CheckRequest_Payload = {
      val r = readBattery_Status_Assessment_ServiceCheckRequest_PayloadT(F)
      return r
    }

    def readBattery_Status_Assessment_ServiceCheckRequest_PayloadT(typeParsed: B): Battery_Status_Assessment_Service.CheckRequest_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Status_Assessment_ServiceCheckRequest_Payload)
      }
      val value = readBattery_Status_Assessment_ServiceCheckRequest()
      return Battery_Status_Assessment_Service.CheckRequest_Payload(value)
    }

    def readBattery_Status_Assessment_ServiceBatteryReport(): Battery_Status_Assessment_Service.BatteryReport = {
      val r = readBattery_Status_Assessment_ServiceBatteryReportT(F)
      return r
    }

    def readBattery_Status_Assessment_ServiceBatteryReportT(typeParsed: B): Battery_Status_Assessment_Service.BatteryReport = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Status_Assessment_ServiceBatteryReport)
      }
      val ticket = readBattery_Status_Assessment_ServiceReportTicketType()
      val availability = readBattery_Status_Assessment_ServiceReportAvailabilityType()
      val level = readBattery_Status_Assessment_ServiceCapacityLevelType()
      val quality = readBattery_Status_Assessment_ServiceReportQualityType()
      return Battery_Status_Assessment_Service.BatteryReport(ticket, availability, level, quality)
    }

    def readBattery_Status_Assessment_ServiceBatteryReport_Payload(): Battery_Status_Assessment_Service.BatteryReport_Payload = {
      val r = readBattery_Status_Assessment_ServiceBatteryReport_PayloadT(F)
      return r
    }

    def readBattery_Status_Assessment_ServiceBatteryReport_PayloadT(typeParsed: B): Battery_Status_Assessment_Service.BatteryReport_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Status_Assessment_ServiceBatteryReport_Payload)
      }
      val value = readBattery_Status_Assessment_ServiceBatteryReport()
      return Battery_Status_Assessment_Service.BatteryReport_Payload(value)
    }

    def readBattery_Status_Assessment_ServiceCapturedReport(): Battery_Status_Assessment_Service.CapturedReport = {
      val r = readBattery_Status_Assessment_ServiceCapturedReportT(F)
      return r
    }

    def readBattery_Status_Assessment_ServiceCapturedReportT(typeParsed: B): Battery_Status_Assessment_Service.CapturedReport = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Status_Assessment_ServiceCapturedReport)
      }
      val ticket = readBattery_Status_Assessment_ServiceReportTicketType()
      val availability = readBattery_Status_Assessment_ServiceReportAvailabilityType()
      val level = readBattery_Status_Assessment_ServiceCapacityLevelType()
      val quality = readBattery_Status_Assessment_ServiceReportQualityType()
      return Battery_Status_Assessment_Service.CapturedReport(ticket, availability, level, quality)
    }

    def readBattery_Status_Assessment_ServiceCapturedReport_Payload(): Battery_Status_Assessment_Service.CapturedReport_Payload = {
      val r = readBattery_Status_Assessment_ServiceCapturedReport_PayloadT(F)
      return r
    }

    def readBattery_Status_Assessment_ServiceCapturedReport_PayloadT(typeParsed: B): Battery_Status_Assessment_Service.CapturedReport_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Status_Assessment_ServiceCapturedReport_Payload)
      }
      val value = readBattery_Status_Assessment_ServiceCapturedReport()
      return Battery_Status_Assessment_Service.CapturedReport_Payload(value)
    }

    def readBattery_Status_Assessment_ServiceTaggedQualifiedEvidence(): Battery_Status_Assessment_Service.TaggedQualifiedEvidence = {
      val r = readBattery_Status_Assessment_ServiceTaggedQualifiedEvidenceT(F)
      return r
    }

    def readBattery_Status_Assessment_ServiceTaggedQualifiedEvidenceT(typeParsed: B): Battery_Status_Assessment_Service.TaggedQualifiedEvidence = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Status_Assessment_ServiceTaggedQualifiedEvidence)
      }
      val ticket = readBattery_Status_Assessment_ServiceReportTicketType()
      val evidence = readBattery_Status_Assessment_ServiceQualifiedEvidenceType()
      return Battery_Status_Assessment_Service.TaggedQualifiedEvidence(ticket, evidence)
    }

    def readBattery_Status_Assessment_ServiceTaggedQualifiedEvidence_Payload(): Battery_Status_Assessment_Service.TaggedQualifiedEvidence_Payload = {
      val r = readBattery_Status_Assessment_ServiceTaggedQualifiedEvidence_PayloadT(F)
      return r
    }

    def readBattery_Status_Assessment_ServiceTaggedQualifiedEvidence_PayloadT(typeParsed: B): Battery_Status_Assessment_Service.TaggedQualifiedEvidence_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Status_Assessment_ServiceTaggedQualifiedEvidence_Payload)
      }
      val value = readBattery_Status_Assessment_ServiceTaggedQualifiedEvidence()
      return Battery_Status_Assessment_Service.TaggedQualifiedEvidence_Payload(value)
    }

    def readBattery_Status_Assessment_ServiceTaggedAssessment(): Battery_Status_Assessment_Service.TaggedAssessment = {
      val r = readBattery_Status_Assessment_ServiceTaggedAssessmentT(F)
      return r
    }

    def readBattery_Status_Assessment_ServiceTaggedAssessmentT(typeParsed: B): Battery_Status_Assessment_Service.TaggedAssessment = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Status_Assessment_ServiceTaggedAssessment)
      }
      val ticket = readBattery_Status_Assessment_ServiceReportTicketType()
      val result = readBattery_Status_Assessment_ServiceAssessmentResultType()
      return Battery_Status_Assessment_Service.TaggedAssessment(ticket, result)
    }

    def readBattery_Status_Assessment_ServiceTaggedAssessment_Payload(): Battery_Status_Assessment_Service.TaggedAssessment_Payload = {
      val r = readBattery_Status_Assessment_ServiceTaggedAssessment_PayloadT(F)
      return r
    }

    def readBattery_Status_Assessment_ServiceTaggedAssessment_PayloadT(typeParsed: B): Battery_Status_Assessment_Service.TaggedAssessment_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Status_Assessment_ServiceTaggedAssessment_Payload)
      }
      val value = readBattery_Status_Assessment_ServiceTaggedAssessment()
      return Battery_Status_Assessment_Service.TaggedAssessment_Payload(value)
    }

    def readBattery_Status_Assessment_ServiceControlUseFeedback(): Battery_Status_Assessment_Service.ControlUseFeedback = {
      val r = readBattery_Status_Assessment_ServiceControlUseFeedbackT(F)
      return r
    }

    def readBattery_Status_Assessment_ServiceControlUseFeedbackT(typeParsed: B): Battery_Status_Assessment_Service.ControlUseFeedback = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Status_Assessment_ServiceControlUseFeedback)
      }
      val ticket = readBattery_Status_Assessment_ServiceFeedbackTicketType()
      val disposition = readBattery_Status_Assessment_ServiceUseDispositionType()
      return Battery_Status_Assessment_Service.ControlUseFeedback(ticket, disposition)
    }

    def readBattery_Status_Assessment_ServiceControlUseFeedback_Payload(): Battery_Status_Assessment_Service.ControlUseFeedback_Payload = {
      val r = readBattery_Status_Assessment_ServiceControlUseFeedback_PayloadT(F)
      return r
    }

    def readBattery_Status_Assessment_ServiceControlUseFeedback_PayloadT(typeParsed: B): Battery_Status_Assessment_Service.ControlUseFeedback_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Status_Assessment_ServiceControlUseFeedback_Payload)
      }
      val value = readBattery_Status_Assessment_ServiceControlUseFeedback()
      return Battery_Status_Assessment_Service.ControlUseFeedback_Payload(value)
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

    def readBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container(): Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P => val r = readBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PT(T); return r
        case Constants.Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS => val r = readBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container.")
          val r = readBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PST(T)
          return r
      }
    }

    def readBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P(): Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P = {
      val r = readBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PT(F)
      return r
    }

    def readBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PT(typeParsed: B): Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P)
      }
      val api_acquisition_outcome = readBattery_Status_Assessment_ServiceAcquisitionOutcomeType()
      val api_check_request = readBattery_Status_Assessment_ServiceCheckRequest()
      val api_publication_outcome = readBattery_Status_Assessment_ServicePublicationOutcomeType()
      return Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P(api_acquisition_outcome, api_check_request, api_publication_outcome)
    }

    def readBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS(): Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS = {
      val r = readBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PST(F)
      return r
    }

    def readBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PST(typeParsed: B): Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS)
      }
      val In_lastAdmittedToken = readBattery_Status_Assessment_ServiceLastAdmittedTokenType()
      val In_lifecycleState = readBattery_Status_Assessment_ServiceLifecycleStateType()
      val api_acquisition_outcome = readBattery_Status_Assessment_ServiceAcquisitionOutcomeType()
      val api_check_request = readBattery_Status_Assessment_ServiceCheckRequest()
      val api_publication_outcome = readBattery_Status_Assessment_ServicePublicationOutcomeType()
      return Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS(In_lastAdmittedToken, In_lifecycleState, api_acquisition_outcome, api_check_request, api_publication_outcome)
    }

    def readBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container(): Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P => val r = readBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PT(T); return r
        case Constants.Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS => val r = readBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container.")
          val r = readBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PST(T)
          return r
      }
    }

    def readBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P(): Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P = {
      val r = readBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PT(F)
      return r
    }

    def readBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PT(typeParsed: B): Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P)
      }
      val api_acquisition_directive = readBattery_Status_Assessment_ServiceAcquisitionDirectiveType()
      val api_assessment_context = readBattery_Status_Assessment_ServiceAssessmentContextType()
      val api_check_status = readBattery_Status_Assessment_ServiceCheckStatusType()
      val api_publication_directive = readBattery_Status_Assessment_ServicePublicationDirectiveType()
      return Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P(api_acquisition_directive, api_assessment_context, api_check_status, api_publication_directive)
    }

    def readBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS(): Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS = {
      val r = readBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PST(F)
      return r
    }

    def readBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PST(typeParsed: B): Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS)
      }
      val lastAdmittedToken = readBattery_Status_Assessment_ServiceLastAdmittedTokenType()
      val lifecycleState = readBattery_Status_Assessment_ServiceLifecycleStateType()
      val api_acquisition_directive = readBattery_Status_Assessment_ServiceAcquisitionDirectiveType()
      val api_assessment_context = readBattery_Status_Assessment_ServiceAssessmentContextType()
      val api_check_status = readBattery_Status_Assessment_ServiceCheckStatusType()
      val api_publication_directive = readBattery_Status_Assessment_ServicePublicationDirectiveType()
      return Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS(lastAdmittedToken, lifecycleState, api_acquisition_directive, api_assessment_context, api_check_status, api_publication_directive)
    }

    def readBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container(): Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P => val r = readBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PT(T); return r
        case Constants.Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS => val r = readBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container.")
          val r = readBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PST(T)
          return r
      }
    }

    def readBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P(): Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P = {
      val r = readBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PT(F)
      return r
    }

    def readBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PT(typeParsed: B): Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P)
      }
      val api_acquisition_directive = readBattery_Status_Assessment_ServiceAcquisitionDirectiveType()
      val api_battery_report = readBattery_Status_Assessment_ServiceBatteryReport()
      return Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P(api_acquisition_directive, api_battery_report)
    }

    def readBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS(): Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS = {
      val r = readBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PST(F)
      return r
    }

    def readBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PST(typeParsed: B): Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS)
      }
      val In_acquisitionState = readBattery_Status_Assessment_ServiceAcquisitionStateType()
      val In_committedAcquisitionOutcome = readBattery_Status_Assessment_ServiceAcquisitionOutcomeType()
      val api_acquisition_directive = readBattery_Status_Assessment_ServiceAcquisitionDirectiveType()
      val api_battery_report = readBattery_Status_Assessment_ServiceBatteryReport()
      return Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS(In_acquisitionState, In_committedAcquisitionOutcome, api_acquisition_directive, api_battery_report)
    }

    def readBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container(): Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P => val r = readBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PT(T); return r
        case Constants.Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS => val r = readBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container.")
          val r = readBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PST(T)
          return r
      }
    }

    def readBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P(): Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P = {
      val r = readBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PT(F)
      return r
    }

    def readBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PT(typeParsed: B): Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P)
      }
      val api_acquisition_outcome = readBattery_Status_Assessment_ServiceAcquisitionOutcomeType()
      val api_captured_report = readBattery_Status_Assessment_ServiceCapturedReport()
      val api_status_read_request = readBattery_Status_Assessment_ServiceStatusReadRequestType()
      return Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P(api_acquisition_outcome, api_captured_report, api_status_read_request)
    }

    def readBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS(): Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS = {
      val r = readBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PST(F)
      return r
    }

    def readBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PST(typeParsed: B): Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS)
      }
      val acquisitionState = readBattery_Status_Assessment_ServiceAcquisitionStateType()
      val committedAcquisitionOutcome = readBattery_Status_Assessment_ServiceAcquisitionOutcomeType()
      val api_acquisition_outcome = readBattery_Status_Assessment_ServiceAcquisitionOutcomeType()
      val api_captured_report = readBattery_Status_Assessment_ServiceCapturedReport()
      val api_status_read_request = readBattery_Status_Assessment_ServiceStatusReadRequestType()
      return Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS(acquisitionState, committedAcquisitionOutcome, api_acquisition_outcome, api_captured_report, api_status_read_request)
    }

    def readBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container(): Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_P => val r = readBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PT(T); return r
        case Constants.Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS => val r = readBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container.")
          val r = readBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PST(T)
          return r
      }
    }

    def readBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_P(): Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container_P = {
      val r = readBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PT(F)
      return r
    }

    def readBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PT(typeParsed: B): Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_P)
      }
      val api_captured_report = readBattery_Status_Assessment_ServiceCapturedReport()
      return Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container_P(api_captured_report)
    }

    def readBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS(): Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS = {
      val r = readBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PST(F)
      return r
    }

    def readBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PST(typeParsed: B): Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS)
      }
      val api_captured_report = readBattery_Status_Assessment_ServiceCapturedReport()
      return Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS(api_captured_report)
    }

    def readBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container(): Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_P => val r = readBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PT(T); return r
        case Constants.Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS => val r = readBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container.")
          val r = readBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PST(T)
          return r
      }
    }

    def readBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_P(): Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container_P = {
      val r = readBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PT(F)
      return r
    }

    def readBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PT(typeParsed: B): Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_P)
      }
      val api_qualified_evidence = readBattery_Status_Assessment_ServiceTaggedQualifiedEvidence()
      return Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container_P(api_qualified_evidence)
    }

    def readBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS(): Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS = {
      val r = readBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PST(F)
      return r
    }

    def readBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PST(typeParsed: B): Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS)
      }
      val api_qualified_evidence = readBattery_Status_Assessment_ServiceTaggedQualifiedEvidence()
      return Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS(api_qualified_evidence)
    }

    def readBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container(): Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P => val r = readBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PT(T); return r
        case Constants.Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS => val r = readBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container.")
          val r = readBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PST(T)
          return r
      }
    }

    def readBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P(): Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P = {
      val r = readBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PT(F)
      return r
    }

    def readBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PT(typeParsed: B): Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P)
      }
      val api_assessment_context = readBattery_Status_Assessment_ServiceAssessmentContextType()
      val api_qualified_evidence = readBattery_Status_Assessment_ServiceTaggedQualifiedEvidence()
      return Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P(api_assessment_context, api_qualified_evidence)
    }

    def readBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS(): Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS = {
      val r = readBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PST(F)
      return r
    }

    def readBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PST(typeParsed: B): Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS)
      }
      val api_assessment_context = readBattery_Status_Assessment_ServiceAssessmentContextType()
      val api_qualified_evidence = readBattery_Status_Assessment_ServiceTaggedQualifiedEvidence()
      return Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS(api_assessment_context, api_qualified_evidence)
    }

    def readBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container(): Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P => val r = readBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PT(T); return r
        case Constants.Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS => val r = readBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container.")
          val r = readBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PST(T)
          return r
      }
    }

    def readBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P(): Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P = {
      val r = readBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PT(F)
      return r
    }

    def readBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PT(typeParsed: B): Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P)
      }
      val api_decision_assessment = readBattery_Status_Assessment_ServiceTaggedAssessment()
      return Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P(api_decision_assessment)
    }

    def readBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS(): Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS = {
      val r = readBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PST(F)
      return r
    }

    def readBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PST(typeParsed: B): Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS)
      }
      val api_decision_assessment = readBattery_Status_Assessment_ServiceTaggedAssessment()
      return Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS(api_decision_assessment)
    }

    def readBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container(): Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_P => val r = readBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PT(T); return r
        case Constants.Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PS => val r = readBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container.")
          val r = readBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PST(T)
          return r
      }
    }

    def readBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_P(): Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container_P = {
      val r = readBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PT(F)
      return r
    }

    def readBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PT(typeParsed: B): Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_P)
      }
      val api_control_use_feedback = readBattery_Status_Assessment_ServiceControlUseFeedback()
      val api_decision_assessment = readBattery_Status_Assessment_ServiceTaggedAssessment()
      val api_publication_directive = readBattery_Status_Assessment_ServicePublicationDirectiveType()
      return Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container_P(api_control_use_feedback, api_decision_assessment, api_publication_directive)
    }

    def readBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PS(): Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container_PS = {
      val r = readBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PST(F)
      return r
    }

    def readBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PST(typeParsed: B): Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PS)
      }
      val In_committedPublicationOutcome = readBattery_Status_Assessment_ServicePublicationOutcomeType()
      val In_publicationState = readBattery_Status_Assessment_ServicePublicationStateType()
      val In_retainedAssessment = readBattery_Status_Assessment_ServiceAssessmentResultType()
      val api_control_use_feedback = readBattery_Status_Assessment_ServiceControlUseFeedback()
      val api_decision_assessment = readBattery_Status_Assessment_ServiceTaggedAssessment()
      val api_publication_directive = readBattery_Status_Assessment_ServicePublicationDirectiveType()
      return Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container_PS(In_committedPublicationOutcome, In_publicationState, In_retainedAssessment, api_control_use_feedback, api_decision_assessment, api_publication_directive)
    }

    def readBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container(): Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_P => val r = readBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PT(T); return r
        case Constants.Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PS => val r = readBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container.")
          val r = readBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PST(T)
          return r
      }
    }

    def readBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_P(): Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container_P = {
      val r = readBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PT(F)
      return r
    }

    def readBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PT(typeParsed: B): Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_P)
      }
      val api_battery_assessment = readBattery_Status_Assessment_ServiceTaggedAssessment()
      val api_publication_outcome = readBattery_Status_Assessment_ServicePublicationOutcomeType()
      return Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container_P(api_battery_assessment, api_publication_outcome)
    }

    def readBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PS(): Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container_PS = {
      val r = readBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PST(F)
      return r
    }

    def readBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PST(typeParsed: B): Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PS)
      }
      val committedPublicationOutcome = readBattery_Status_Assessment_ServicePublicationOutcomeType()
      val publicationState = readBattery_Status_Assessment_ServicePublicationStateType()
      val retainedAssessment = readBattery_Status_Assessment_ServiceAssessmentResultType()
      val api_battery_assessment = readBattery_Status_Assessment_ServiceTaggedAssessment()
      val api_publication_outcome = readBattery_Status_Assessment_ServicePublicationOutcomeType()
      return Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container_PS(committedPublicationOutcome, publicationState, retainedAssessment, api_battery_assessment, api_publication_outcome)
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
        case Constants.Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_P => val r = readBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PT(T); return r
        case Constants.Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PS => val r = readBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PST(T); return r
        case Constants.Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_P => val r = readBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PT(T); return r
        case Constants.Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PS => val r = readBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PST(T); return r
        case Constants.Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P => val r = readBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PT(T); return r
        case Constants.Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS => val r = readBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PST(T); return r
        case Constants.Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P => val r = readBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PT(T); return r
        case Constants.Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS => val r = readBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PST(T); return r
        case Constants.Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P => val r = readBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PT(T); return r
        case Constants.Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS => val r = readBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PST(T); return r
        case Constants.Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P => val r = readBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PT(T); return r
        case Constants.Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS => val r = readBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PST(T); return r
        case Constants.Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P => val r = readBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PT(T); return r
        case Constants.Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS => val r = readBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PST(T); return r
        case Constants.Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P => val r = readBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PT(T); return r
        case Constants.Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS => val r = readBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PST(T); return r
        case Constants.Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_P => val r = readBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PT(T); return r
        case Constants.Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS => val r = readBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PST(T); return r
        case Constants.Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_P => val r = readBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PT(T); return r
        case Constants.Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS => val r = readBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of util.Container.")
          val r = readBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PST(T)
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
        case Constants.Battery_Status_Assessment_ServiceCheckToken_Payload => val r = readBattery_Status_Assessment_ServiceCheckToken_PayloadT(T); return r
        case Constants.Battery_Status_Assessment_ServiceCheckStatus_Payload => val r = readBattery_Status_Assessment_ServiceCheckStatus_PayloadT(T); return r
        case Constants.Battery_Status_Assessment_ServiceReportTicket_Payload => val r = readBattery_Status_Assessment_ServiceReportTicket_PayloadT(T); return r
        case Constants.Battery_Status_Assessment_ServiceCheckCommand_Payload => val r = readBattery_Status_Assessment_ServiceCheckCommand_PayloadT(T); return r
        case Constants.Battery_Status_Assessment_ServiceCheckRequest_Payload => val r = readBattery_Status_Assessment_ServiceCheckRequest_PayloadT(T); return r
        case Constants.Battery_Status_Assessment_ServiceReportQuality_Payload => val r = readBattery_Status_Assessment_ServiceReportQuality_PayloadT(T); return r
        case Constants.Battery_Status_Assessment_ServiceCapacityLevel_Payload => val r = readBattery_Status_Assessment_ServiceCapacityLevel_PayloadT(T); return r
        case Constants.Battery_Status_Assessment_ServiceBatteryReport_Payload => val r = readBattery_Status_Assessment_ServiceBatteryReport_PayloadT(T); return r
        case Constants.Battery_Status_Assessment_ServiceFeedbackTicket_Payload => val r = readBattery_Status_Assessment_ServiceFeedbackTicket_PayloadT(T); return r
        case Constants.Battery_Status_Assessment_ServiceLifecycleState_Payload => val r = readBattery_Status_Assessment_ServiceLifecycleState_PayloadT(T); return r
        case Constants.Battery_Status_Assessment_ServiceUseDisposition_Payload => val r = readBattery_Status_Assessment_ServiceUseDisposition_PayloadT(T); return r
        case Constants.Battery_Status_Assessment_ServiceCapturedReport_Payload => val r = readBattery_Status_Assessment_ServiceCapturedReport_PayloadT(T); return r
        case Constants.Battery_Status_Assessment_ServiceAcquisitionState_Payload => val r = readBattery_Status_Assessment_ServiceAcquisitionState_PayloadT(T); return r
        case Constants.Battery_Status_Assessment_ServicePublicationState_Payload => val r = readBattery_Status_Assessment_ServicePublicationState_PayloadT(T); return r
        case Constants.Battery_Status_Assessment_ServiceAssessmentResult_Payload => val r = readBattery_Status_Assessment_ServiceAssessmentResult_PayloadT(T); return r
        case Constants.Battery_Status_Assessment_ServiceTaggedAssessment_Payload => val r = readBattery_Status_Assessment_ServiceTaggedAssessment_PayloadT(T); return r
        case Constants.Battery_Status_Assessment_ServiceLastAdmittedToken_Payload => val r = readBattery_Status_Assessment_ServiceLastAdmittedToken_PayloadT(T); return r
        case Constants.Battery_Status_Assessment_ServiceStatusReadRequest_Payload => val r = readBattery_Status_Assessment_ServiceStatusReadRequest_PayloadT(T); return r
        case Constants.Battery_Status_Assessment_ServiceAssessmentContext_Payload => val r = readBattery_Status_Assessment_ServiceAssessmentContext_PayloadT(T); return r
        case Constants.Battery_Status_Assessment_ServiceQualifiedEvidence_Payload => val r = readBattery_Status_Assessment_ServiceQualifiedEvidence_PayloadT(T); return r
        case Constants.Battery_Status_Assessment_ServiceReportAvailability_Payload => val r = readBattery_Status_Assessment_ServiceReportAvailability_PayloadT(T); return r
        case Constants.Battery_Status_Assessment_ServiceAcquisitionOutcome_Payload => val r = readBattery_Status_Assessment_ServiceAcquisitionOutcome_PayloadT(T); return r
        case Constants.Battery_Status_Assessment_ServicePublicationOutcome_Payload => val r = readBattery_Status_Assessment_ServicePublicationOutcome_PayloadT(T); return r
        case Constants.Battery_Status_Assessment_ServiceControlUseFeedback_Payload => val r = readBattery_Status_Assessment_ServiceControlUseFeedback_PayloadT(T); return r
        case Constants.Battery_Status_Assessment_ServiceAcquisitionDirective_Payload => val r = readBattery_Status_Assessment_ServiceAcquisitionDirective_PayloadT(T); return r
        case Constants.Battery_Status_Assessment_ServicePublicationDirective_Payload => val r = readBattery_Status_Assessment_ServicePublicationDirective_PayloadT(T); return r
        case Constants.Battery_Status_Assessment_ServiceTaggedQualifiedEvidence_Payload => val r = readBattery_Status_Assessment_ServiceTaggedQualifiedEvidence_PayloadT(T); return r
        case Constants.Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_P => val r = readBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PT(T); return r
        case Constants.Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PS => val r = readBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PST(T); return r
        case Constants.Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_P => val r = readBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PT(T); return r
        case Constants.Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PS => val r = readBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PST(T); return r
        case Constants.Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P => val r = readBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PT(T); return r
        case Constants.Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS => val r = readBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PST(T); return r
        case Constants.Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P => val r = readBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PT(T); return r
        case Constants.Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS => val r = readBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PST(T); return r
        case Constants.Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P => val r = readBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PT(T); return r
        case Constants.Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS => val r = readBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PST(T); return r
        case Constants.Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P => val r = readBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PT(T); return r
        case Constants.Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS => val r = readBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PST(T); return r
        case Constants.Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P => val r = readBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PT(T); return r
        case Constants.Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS => val r = readBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PST(T); return r
        case Constants.Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P => val r = readBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PT(T); return r
        case Constants.Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS => val r = readBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PST(T); return r
        case Constants.Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_P => val r = readBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PT(T); return r
        case Constants.Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS => val r = readBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PST(T); return r
        case Constants.Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_P => val r = readBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PT(T); return r
        case Constants.Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS => val r = readBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of art.DataContent.")
          val r = readBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PST(T)
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

  def fromBattery_Status_Assessment_ServiceCheckCommand_Payload(o: Battery_Status_Assessment_Service.CheckCommand_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Status_Assessment_ServiceCheckCommand_Payload(o)
    return w.result
  }

  def toBattery_Status_Assessment_ServiceCheckCommand_Payload(data: ISZ[U8]): Either[Battery_Status_Assessment_Service.CheckCommand_Payload, MessagePack.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceCheckCommand_Payload(reader: Reader): Battery_Status_Assessment_Service.CheckCommand_Payload = {
      val r = reader.readBattery_Status_Assessment_ServiceCheckCommand_Payload()
      return r
    }
    val r = to(data, fBattery_Status_Assessment_ServiceCheckCommand_Payload _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceCheckToken_Payload(o: Battery_Status_Assessment_Service.CheckToken_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Status_Assessment_ServiceCheckToken_Payload(o)
    return w.result
  }

  def toBattery_Status_Assessment_ServiceCheckToken_Payload(data: ISZ[U8]): Either[Battery_Status_Assessment_Service.CheckToken_Payload, MessagePack.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceCheckToken_Payload(reader: Reader): Battery_Status_Assessment_Service.CheckToken_Payload = {
      val r = reader.readBattery_Status_Assessment_ServiceCheckToken_Payload()
      return r
    }
    val r = to(data, fBattery_Status_Assessment_ServiceCheckToken_Payload _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceAcquisitionOutcome_Payload(o: Battery_Status_Assessment_Service.AcquisitionOutcome_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Status_Assessment_ServiceAcquisitionOutcome_Payload(o)
    return w.result
  }

  def toBattery_Status_Assessment_ServiceAcquisitionOutcome_Payload(data: ISZ[U8]): Either[Battery_Status_Assessment_Service.AcquisitionOutcome_Payload, MessagePack.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceAcquisitionOutcome_Payload(reader: Reader): Battery_Status_Assessment_Service.AcquisitionOutcome_Payload = {
      val r = reader.readBattery_Status_Assessment_ServiceAcquisitionOutcome_Payload()
      return r
    }
    val r = to(data, fBattery_Status_Assessment_ServiceAcquisitionOutcome_Payload _)
    return r
  }

  def fromBattery_Status_Assessment_ServicePublicationOutcome_Payload(o: Battery_Status_Assessment_Service.PublicationOutcome_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Status_Assessment_ServicePublicationOutcome_Payload(o)
    return w.result
  }

  def toBattery_Status_Assessment_ServicePublicationOutcome_Payload(data: ISZ[U8]): Either[Battery_Status_Assessment_Service.PublicationOutcome_Payload, MessagePack.ErrorMsg] = {
    def fBattery_Status_Assessment_ServicePublicationOutcome_Payload(reader: Reader): Battery_Status_Assessment_Service.PublicationOutcome_Payload = {
      val r = reader.readBattery_Status_Assessment_ServicePublicationOutcome_Payload()
      return r
    }
    val r = to(data, fBattery_Status_Assessment_ServicePublicationOutcome_Payload _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceAcquisitionDirective_Payload(o: Battery_Status_Assessment_Service.AcquisitionDirective_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Status_Assessment_ServiceAcquisitionDirective_Payload(o)
    return w.result
  }

  def toBattery_Status_Assessment_ServiceAcquisitionDirective_Payload(data: ISZ[U8]): Either[Battery_Status_Assessment_Service.AcquisitionDirective_Payload, MessagePack.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceAcquisitionDirective_Payload(reader: Reader): Battery_Status_Assessment_Service.AcquisitionDirective_Payload = {
      val r = reader.readBattery_Status_Assessment_ServiceAcquisitionDirective_Payload()
      return r
    }
    val r = to(data, fBattery_Status_Assessment_ServiceAcquisitionDirective_Payload _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceAssessmentContext_Payload(o: Battery_Status_Assessment_Service.AssessmentContext_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Status_Assessment_ServiceAssessmentContext_Payload(o)
    return w.result
  }

  def toBattery_Status_Assessment_ServiceAssessmentContext_Payload(data: ISZ[U8]): Either[Battery_Status_Assessment_Service.AssessmentContext_Payload, MessagePack.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceAssessmentContext_Payload(reader: Reader): Battery_Status_Assessment_Service.AssessmentContext_Payload = {
      val r = reader.readBattery_Status_Assessment_ServiceAssessmentContext_Payload()
      return r
    }
    val r = to(data, fBattery_Status_Assessment_ServiceAssessmentContext_Payload _)
    return r
  }

  def fromBattery_Status_Assessment_ServicePublicationDirective_Payload(o: Battery_Status_Assessment_Service.PublicationDirective_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Status_Assessment_ServicePublicationDirective_Payload(o)
    return w.result
  }

  def toBattery_Status_Assessment_ServicePublicationDirective_Payload(data: ISZ[U8]): Either[Battery_Status_Assessment_Service.PublicationDirective_Payload, MessagePack.ErrorMsg] = {
    def fBattery_Status_Assessment_ServicePublicationDirective_Payload(reader: Reader): Battery_Status_Assessment_Service.PublicationDirective_Payload = {
      val r = reader.readBattery_Status_Assessment_ServicePublicationDirective_Payload()
      return r
    }
    val r = to(data, fBattery_Status_Assessment_ServicePublicationDirective_Payload _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceCheckStatus_Payload(o: Battery_Status_Assessment_Service.CheckStatus_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Status_Assessment_ServiceCheckStatus_Payload(o)
    return w.result
  }

  def toBattery_Status_Assessment_ServiceCheckStatus_Payload(data: ISZ[U8]): Either[Battery_Status_Assessment_Service.CheckStatus_Payload, MessagePack.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceCheckStatus_Payload(reader: Reader): Battery_Status_Assessment_Service.CheckStatus_Payload = {
      val r = reader.readBattery_Status_Assessment_ServiceCheckStatus_Payload()
      return r
    }
    val r = to(data, fBattery_Status_Assessment_ServiceCheckStatus_Payload _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceReportTicket_Payload(o: Battery_Status_Assessment_Service.ReportTicket_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Status_Assessment_ServiceReportTicket_Payload(o)
    return w.result
  }

  def toBattery_Status_Assessment_ServiceReportTicket_Payload(data: ISZ[U8]): Either[Battery_Status_Assessment_Service.ReportTicket_Payload, MessagePack.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceReportTicket_Payload(reader: Reader): Battery_Status_Assessment_Service.ReportTicket_Payload = {
      val r = reader.readBattery_Status_Assessment_ServiceReportTicket_Payload()
      return r
    }
    val r = to(data, fBattery_Status_Assessment_ServiceReportTicket_Payload _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceReportAvailability_Payload(o: Battery_Status_Assessment_Service.ReportAvailability_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Status_Assessment_ServiceReportAvailability_Payload(o)
    return w.result
  }

  def toBattery_Status_Assessment_ServiceReportAvailability_Payload(data: ISZ[U8]): Either[Battery_Status_Assessment_Service.ReportAvailability_Payload, MessagePack.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceReportAvailability_Payload(reader: Reader): Battery_Status_Assessment_Service.ReportAvailability_Payload = {
      val r = reader.readBattery_Status_Assessment_ServiceReportAvailability_Payload()
      return r
    }
    val r = to(data, fBattery_Status_Assessment_ServiceReportAvailability_Payload _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceCapacityLevel_Payload(o: Battery_Status_Assessment_Service.CapacityLevel_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Status_Assessment_ServiceCapacityLevel_Payload(o)
    return w.result
  }

  def toBattery_Status_Assessment_ServiceCapacityLevel_Payload(data: ISZ[U8]): Either[Battery_Status_Assessment_Service.CapacityLevel_Payload, MessagePack.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceCapacityLevel_Payload(reader: Reader): Battery_Status_Assessment_Service.CapacityLevel_Payload = {
      val r = reader.readBattery_Status_Assessment_ServiceCapacityLevel_Payload()
      return r
    }
    val r = to(data, fBattery_Status_Assessment_ServiceCapacityLevel_Payload _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceReportQuality_Payload(o: Battery_Status_Assessment_Service.ReportQuality_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Status_Assessment_ServiceReportQuality_Payload(o)
    return w.result
  }

  def toBattery_Status_Assessment_ServiceReportQuality_Payload(data: ISZ[U8]): Either[Battery_Status_Assessment_Service.ReportQuality_Payload, MessagePack.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceReportQuality_Payload(reader: Reader): Battery_Status_Assessment_Service.ReportQuality_Payload = {
      val r = reader.readBattery_Status_Assessment_ServiceReportQuality_Payload()
      return r
    }
    val r = to(data, fBattery_Status_Assessment_ServiceReportQuality_Payload _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceStatusReadRequest_Payload(o: Battery_Status_Assessment_Service.StatusReadRequest_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Status_Assessment_ServiceStatusReadRequest_Payload(o)
    return w.result
  }

  def toBattery_Status_Assessment_ServiceStatusReadRequest_Payload(data: ISZ[U8]): Either[Battery_Status_Assessment_Service.StatusReadRequest_Payload, MessagePack.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceStatusReadRequest_Payload(reader: Reader): Battery_Status_Assessment_Service.StatusReadRequest_Payload = {
      val r = reader.readBattery_Status_Assessment_ServiceStatusReadRequest_Payload()
      return r
    }
    val r = to(data, fBattery_Status_Assessment_ServiceStatusReadRequest_Payload _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceQualifiedEvidence_Payload(o: Battery_Status_Assessment_Service.QualifiedEvidence_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Status_Assessment_ServiceQualifiedEvidence_Payload(o)
    return w.result
  }

  def toBattery_Status_Assessment_ServiceQualifiedEvidence_Payload(data: ISZ[U8]): Either[Battery_Status_Assessment_Service.QualifiedEvidence_Payload, MessagePack.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceQualifiedEvidence_Payload(reader: Reader): Battery_Status_Assessment_Service.QualifiedEvidence_Payload = {
      val r = reader.readBattery_Status_Assessment_ServiceQualifiedEvidence_Payload()
      return r
    }
    val r = to(data, fBattery_Status_Assessment_ServiceQualifiedEvidence_Payload _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceAssessmentResult_Payload(o: Battery_Status_Assessment_Service.AssessmentResult_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Status_Assessment_ServiceAssessmentResult_Payload(o)
    return w.result
  }

  def toBattery_Status_Assessment_ServiceAssessmentResult_Payload(data: ISZ[U8]): Either[Battery_Status_Assessment_Service.AssessmentResult_Payload, MessagePack.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceAssessmentResult_Payload(reader: Reader): Battery_Status_Assessment_Service.AssessmentResult_Payload = {
      val r = reader.readBattery_Status_Assessment_ServiceAssessmentResult_Payload()
      return r
    }
    val r = to(data, fBattery_Status_Assessment_ServiceAssessmentResult_Payload _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceFeedbackTicket_Payload(o: Battery_Status_Assessment_Service.FeedbackTicket_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Status_Assessment_ServiceFeedbackTicket_Payload(o)
    return w.result
  }

  def toBattery_Status_Assessment_ServiceFeedbackTicket_Payload(data: ISZ[U8]): Either[Battery_Status_Assessment_Service.FeedbackTicket_Payload, MessagePack.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceFeedbackTicket_Payload(reader: Reader): Battery_Status_Assessment_Service.FeedbackTicket_Payload = {
      val r = reader.readBattery_Status_Assessment_ServiceFeedbackTicket_Payload()
      return r
    }
    val r = to(data, fBattery_Status_Assessment_ServiceFeedbackTicket_Payload _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceUseDisposition_Payload(o: Battery_Status_Assessment_Service.UseDisposition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Status_Assessment_ServiceUseDisposition_Payload(o)
    return w.result
  }

  def toBattery_Status_Assessment_ServiceUseDisposition_Payload(data: ISZ[U8]): Either[Battery_Status_Assessment_Service.UseDisposition_Payload, MessagePack.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceUseDisposition_Payload(reader: Reader): Battery_Status_Assessment_Service.UseDisposition_Payload = {
      val r = reader.readBattery_Status_Assessment_ServiceUseDisposition_Payload()
      return r
    }
    val r = to(data, fBattery_Status_Assessment_ServiceUseDisposition_Payload _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceLifecycleState_Payload(o: Battery_Status_Assessment_Service.LifecycleState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Status_Assessment_ServiceLifecycleState_Payload(o)
    return w.result
  }

  def toBattery_Status_Assessment_ServiceLifecycleState_Payload(data: ISZ[U8]): Either[Battery_Status_Assessment_Service.LifecycleState_Payload, MessagePack.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceLifecycleState_Payload(reader: Reader): Battery_Status_Assessment_Service.LifecycleState_Payload = {
      val r = reader.readBattery_Status_Assessment_ServiceLifecycleState_Payload()
      return r
    }
    val r = to(data, fBattery_Status_Assessment_ServiceLifecycleState_Payload _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceLastAdmittedToken_Payload(o: Battery_Status_Assessment_Service.LastAdmittedToken_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Status_Assessment_ServiceLastAdmittedToken_Payload(o)
    return w.result
  }

  def toBattery_Status_Assessment_ServiceLastAdmittedToken_Payload(data: ISZ[U8]): Either[Battery_Status_Assessment_Service.LastAdmittedToken_Payload, MessagePack.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceLastAdmittedToken_Payload(reader: Reader): Battery_Status_Assessment_Service.LastAdmittedToken_Payload = {
      val r = reader.readBattery_Status_Assessment_ServiceLastAdmittedToken_Payload()
      return r
    }
    val r = to(data, fBattery_Status_Assessment_ServiceLastAdmittedToken_Payload _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceAcquisitionState_Payload(o: Battery_Status_Assessment_Service.AcquisitionState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Status_Assessment_ServiceAcquisitionState_Payload(o)
    return w.result
  }

  def toBattery_Status_Assessment_ServiceAcquisitionState_Payload(data: ISZ[U8]): Either[Battery_Status_Assessment_Service.AcquisitionState_Payload, MessagePack.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceAcquisitionState_Payload(reader: Reader): Battery_Status_Assessment_Service.AcquisitionState_Payload = {
      val r = reader.readBattery_Status_Assessment_ServiceAcquisitionState_Payload()
      return r
    }
    val r = to(data, fBattery_Status_Assessment_ServiceAcquisitionState_Payload _)
    return r
  }

  def fromBattery_Status_Assessment_ServicePublicationState_Payload(o: Battery_Status_Assessment_Service.PublicationState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Status_Assessment_ServicePublicationState_Payload(o)
    return w.result
  }

  def toBattery_Status_Assessment_ServicePublicationState_Payload(data: ISZ[U8]): Either[Battery_Status_Assessment_Service.PublicationState_Payload, MessagePack.ErrorMsg] = {
    def fBattery_Status_Assessment_ServicePublicationState_Payload(reader: Reader): Battery_Status_Assessment_Service.PublicationState_Payload = {
      val r = reader.readBattery_Status_Assessment_ServicePublicationState_Payload()
      return r
    }
    val r = to(data, fBattery_Status_Assessment_ServicePublicationState_Payload _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceCheckRequest(o: Battery_Status_Assessment_Service.CheckRequest, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Status_Assessment_ServiceCheckRequest(o)
    return w.result
  }

  def toBattery_Status_Assessment_ServiceCheckRequest(data: ISZ[U8]): Either[Battery_Status_Assessment_Service.CheckRequest, MessagePack.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceCheckRequest(reader: Reader): Battery_Status_Assessment_Service.CheckRequest = {
      val r = reader.readBattery_Status_Assessment_ServiceCheckRequest()
      return r
    }
    val r = to(data, fBattery_Status_Assessment_ServiceCheckRequest _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceCheckRequest_Payload(o: Battery_Status_Assessment_Service.CheckRequest_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Status_Assessment_ServiceCheckRequest_Payload(o)
    return w.result
  }

  def toBattery_Status_Assessment_ServiceCheckRequest_Payload(data: ISZ[U8]): Either[Battery_Status_Assessment_Service.CheckRequest_Payload, MessagePack.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceCheckRequest_Payload(reader: Reader): Battery_Status_Assessment_Service.CheckRequest_Payload = {
      val r = reader.readBattery_Status_Assessment_ServiceCheckRequest_Payload()
      return r
    }
    val r = to(data, fBattery_Status_Assessment_ServiceCheckRequest_Payload _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceBatteryReport(o: Battery_Status_Assessment_Service.BatteryReport, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Status_Assessment_ServiceBatteryReport(o)
    return w.result
  }

  def toBattery_Status_Assessment_ServiceBatteryReport(data: ISZ[U8]): Either[Battery_Status_Assessment_Service.BatteryReport, MessagePack.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceBatteryReport(reader: Reader): Battery_Status_Assessment_Service.BatteryReport = {
      val r = reader.readBattery_Status_Assessment_ServiceBatteryReport()
      return r
    }
    val r = to(data, fBattery_Status_Assessment_ServiceBatteryReport _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceBatteryReport_Payload(o: Battery_Status_Assessment_Service.BatteryReport_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Status_Assessment_ServiceBatteryReport_Payload(o)
    return w.result
  }

  def toBattery_Status_Assessment_ServiceBatteryReport_Payload(data: ISZ[U8]): Either[Battery_Status_Assessment_Service.BatteryReport_Payload, MessagePack.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceBatteryReport_Payload(reader: Reader): Battery_Status_Assessment_Service.BatteryReport_Payload = {
      val r = reader.readBattery_Status_Assessment_ServiceBatteryReport_Payload()
      return r
    }
    val r = to(data, fBattery_Status_Assessment_ServiceBatteryReport_Payload _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceCapturedReport(o: Battery_Status_Assessment_Service.CapturedReport, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Status_Assessment_ServiceCapturedReport(o)
    return w.result
  }

  def toBattery_Status_Assessment_ServiceCapturedReport(data: ISZ[U8]): Either[Battery_Status_Assessment_Service.CapturedReport, MessagePack.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceCapturedReport(reader: Reader): Battery_Status_Assessment_Service.CapturedReport = {
      val r = reader.readBattery_Status_Assessment_ServiceCapturedReport()
      return r
    }
    val r = to(data, fBattery_Status_Assessment_ServiceCapturedReport _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceCapturedReport_Payload(o: Battery_Status_Assessment_Service.CapturedReport_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Status_Assessment_ServiceCapturedReport_Payload(o)
    return w.result
  }

  def toBattery_Status_Assessment_ServiceCapturedReport_Payload(data: ISZ[U8]): Either[Battery_Status_Assessment_Service.CapturedReport_Payload, MessagePack.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceCapturedReport_Payload(reader: Reader): Battery_Status_Assessment_Service.CapturedReport_Payload = {
      val r = reader.readBattery_Status_Assessment_ServiceCapturedReport_Payload()
      return r
    }
    val r = to(data, fBattery_Status_Assessment_ServiceCapturedReport_Payload _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceTaggedQualifiedEvidence(o: Battery_Status_Assessment_Service.TaggedQualifiedEvidence, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Status_Assessment_ServiceTaggedQualifiedEvidence(o)
    return w.result
  }

  def toBattery_Status_Assessment_ServiceTaggedQualifiedEvidence(data: ISZ[U8]): Either[Battery_Status_Assessment_Service.TaggedQualifiedEvidence, MessagePack.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceTaggedQualifiedEvidence(reader: Reader): Battery_Status_Assessment_Service.TaggedQualifiedEvidence = {
      val r = reader.readBattery_Status_Assessment_ServiceTaggedQualifiedEvidence()
      return r
    }
    val r = to(data, fBattery_Status_Assessment_ServiceTaggedQualifiedEvidence _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceTaggedQualifiedEvidence_Payload(o: Battery_Status_Assessment_Service.TaggedQualifiedEvidence_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Status_Assessment_ServiceTaggedQualifiedEvidence_Payload(o)
    return w.result
  }

  def toBattery_Status_Assessment_ServiceTaggedQualifiedEvidence_Payload(data: ISZ[U8]): Either[Battery_Status_Assessment_Service.TaggedQualifiedEvidence_Payload, MessagePack.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceTaggedQualifiedEvidence_Payload(reader: Reader): Battery_Status_Assessment_Service.TaggedQualifiedEvidence_Payload = {
      val r = reader.readBattery_Status_Assessment_ServiceTaggedQualifiedEvidence_Payload()
      return r
    }
    val r = to(data, fBattery_Status_Assessment_ServiceTaggedQualifiedEvidence_Payload _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceTaggedAssessment(o: Battery_Status_Assessment_Service.TaggedAssessment, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Status_Assessment_ServiceTaggedAssessment(o)
    return w.result
  }

  def toBattery_Status_Assessment_ServiceTaggedAssessment(data: ISZ[U8]): Either[Battery_Status_Assessment_Service.TaggedAssessment, MessagePack.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceTaggedAssessment(reader: Reader): Battery_Status_Assessment_Service.TaggedAssessment = {
      val r = reader.readBattery_Status_Assessment_ServiceTaggedAssessment()
      return r
    }
    val r = to(data, fBattery_Status_Assessment_ServiceTaggedAssessment _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceTaggedAssessment_Payload(o: Battery_Status_Assessment_Service.TaggedAssessment_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Status_Assessment_ServiceTaggedAssessment_Payload(o)
    return w.result
  }

  def toBattery_Status_Assessment_ServiceTaggedAssessment_Payload(data: ISZ[U8]): Either[Battery_Status_Assessment_Service.TaggedAssessment_Payload, MessagePack.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceTaggedAssessment_Payload(reader: Reader): Battery_Status_Assessment_Service.TaggedAssessment_Payload = {
      val r = reader.readBattery_Status_Assessment_ServiceTaggedAssessment_Payload()
      return r
    }
    val r = to(data, fBattery_Status_Assessment_ServiceTaggedAssessment_Payload _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceControlUseFeedback(o: Battery_Status_Assessment_Service.ControlUseFeedback, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Status_Assessment_ServiceControlUseFeedback(o)
    return w.result
  }

  def toBattery_Status_Assessment_ServiceControlUseFeedback(data: ISZ[U8]): Either[Battery_Status_Assessment_Service.ControlUseFeedback, MessagePack.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceControlUseFeedback(reader: Reader): Battery_Status_Assessment_Service.ControlUseFeedback = {
      val r = reader.readBattery_Status_Assessment_ServiceControlUseFeedback()
      return r
    }
    val r = to(data, fBattery_Status_Assessment_ServiceControlUseFeedback _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceControlUseFeedback_Payload(o: Battery_Status_Assessment_Service.ControlUseFeedback_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Status_Assessment_ServiceControlUseFeedback_Payload(o)
    return w.result
  }

  def toBattery_Status_Assessment_ServiceControlUseFeedback_Payload(data: ISZ[U8]): Either[Battery_Status_Assessment_Service.ControlUseFeedback_Payload, MessagePack.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceControlUseFeedback_Payload(reader: Reader): Battery_Status_Assessment_Service.ControlUseFeedback_Payload = {
      val r = reader.readBattery_Status_Assessment_ServiceControlUseFeedback_Payload()
      return r
    }
    val r = to(data, fBattery_Status_Assessment_ServiceControlUseFeedback_Payload _)
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

  def fromBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container(o: Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container(o)
    return w.result
  }

  def toBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container(data: ISZ[U8]): Either[Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container, MessagePack.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container(reader: Reader): Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container = {
      val r = reader.readBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container()
      return r
    }
    val r = to(data, fBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P(o: Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P(o)
    return w.result
  }

  def toBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P(data: ISZ[U8]): Either[Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P(reader: Reader): Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P = {
      val r = reader.readBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P()
      return r
    }
    val r = to(data, fBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS(o: Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS(o)
    return w.result
  }

  def toBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS(data: ISZ[U8]): Either[Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS(reader: Reader): Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS = {
      val r = reader.readBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS()
      return r
    }
    val r = to(data, fBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container(o: Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container(o)
    return w.result
  }

  def toBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container(data: ISZ[U8]): Either[Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container, MessagePack.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container(reader: Reader): Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container = {
      val r = reader.readBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container()
      return r
    }
    val r = to(data, fBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P(o: Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P(o)
    return w.result
  }

  def toBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P(data: ISZ[U8]): Either[Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P(reader: Reader): Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P = {
      val r = reader.readBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P()
      return r
    }
    val r = to(data, fBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS(o: Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS(o)
    return w.result
  }

  def toBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS(data: ISZ[U8]): Either[Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS(reader: Reader): Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS = {
      val r = reader.readBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS()
      return r
    }
    val r = to(data, fBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container(o: Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container(o)
    return w.result
  }

  def toBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container(data: ISZ[U8]): Either[Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container, MessagePack.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container(reader: Reader): Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container = {
      val r = reader.readBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container()
      return r
    }
    val r = to(data, fBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P(o: Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P(o)
    return w.result
  }

  def toBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P(data: ISZ[U8]): Either[Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P(reader: Reader): Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P = {
      val r = reader.readBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P()
      return r
    }
    val r = to(data, fBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS(o: Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS(o)
    return w.result
  }

  def toBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS(data: ISZ[U8]): Either[Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS(reader: Reader): Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS = {
      val r = reader.readBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS()
      return r
    }
    val r = to(data, fBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container(o: Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container(o)
    return w.result
  }

  def toBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container(data: ISZ[U8]): Either[Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container, MessagePack.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container(reader: Reader): Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container = {
      val r = reader.readBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container()
      return r
    }
    val r = to(data, fBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P(o: Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P(o)
    return w.result
  }

  def toBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P(data: ISZ[U8]): Either[Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P(reader: Reader): Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P = {
      val r = reader.readBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P()
      return r
    }
    val r = to(data, fBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS(o: Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS(o)
    return w.result
  }

  def toBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS(data: ISZ[U8]): Either[Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS(reader: Reader): Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS = {
      val r = reader.readBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS()
      return r
    }
    val r = to(data, fBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container(o: Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container(o)
    return w.result
  }

  def toBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container(data: ISZ[U8]): Either[Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container, MessagePack.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container(reader: Reader): Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container = {
      val r = reader.readBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container()
      return r
    }
    val r = to(data, fBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_P(o: Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_P(o)
    return w.result
  }

  def toBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_P(data: ISZ[U8]): Either[Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_P(reader: Reader): Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container_P = {
      val r = reader.readBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_P()
      return r
    }
    val r = to(data, fBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_P _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS(o: Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS(o)
    return w.result
  }

  def toBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS(data: ISZ[U8]): Either[Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS(reader: Reader): Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS = {
      val r = reader.readBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS()
      return r
    }
    val r = to(data, fBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container(o: Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container(o)
    return w.result
  }

  def toBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container(data: ISZ[U8]): Either[Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container, MessagePack.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container(reader: Reader): Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container = {
      val r = reader.readBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container()
      return r
    }
    val r = to(data, fBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_P(o: Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_P(o)
    return w.result
  }

  def toBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_P(data: ISZ[U8]): Either[Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_P(reader: Reader): Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container_P = {
      val r = reader.readBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_P()
      return r
    }
    val r = to(data, fBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_P _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS(o: Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS(o)
    return w.result
  }

  def toBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS(data: ISZ[U8]): Either[Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS(reader: Reader): Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS = {
      val r = reader.readBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS()
      return r
    }
    val r = to(data, fBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container(o: Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container(o)
    return w.result
  }

  def toBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container(data: ISZ[U8]): Either[Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container, MessagePack.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container(reader: Reader): Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container = {
      val r = reader.readBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container()
      return r
    }
    val r = to(data, fBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P(o: Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P(o)
    return w.result
  }

  def toBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P(data: ISZ[U8]): Either[Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P(reader: Reader): Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P = {
      val r = reader.readBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P()
      return r
    }
    val r = to(data, fBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS(o: Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS(o)
    return w.result
  }

  def toBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS(data: ISZ[U8]): Either[Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS(reader: Reader): Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS = {
      val r = reader.readBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS()
      return r
    }
    val r = to(data, fBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container(o: Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container(o)
    return w.result
  }

  def toBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container(data: ISZ[U8]): Either[Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container, MessagePack.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container(reader: Reader): Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container = {
      val r = reader.readBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container()
      return r
    }
    val r = to(data, fBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P(o: Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P(o)
    return w.result
  }

  def toBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P(data: ISZ[U8]): Either[Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P(reader: Reader): Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P = {
      val r = reader.readBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P()
      return r
    }
    val r = to(data, fBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS(o: Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS(o)
    return w.result
  }

  def toBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS(data: ISZ[U8]): Either[Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS(reader: Reader): Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS = {
      val r = reader.readBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS()
      return r
    }
    val r = to(data, fBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container(o: Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container(o)
    return w.result
  }

  def toBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container(data: ISZ[U8]): Either[Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container, MessagePack.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container(reader: Reader): Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container = {
      val r = reader.readBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container()
      return r
    }
    val r = to(data, fBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_P(o: Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_P(o)
    return w.result
  }

  def toBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_P(data: ISZ[U8]): Either[Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_P(reader: Reader): Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container_P = {
      val r = reader.readBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_P()
      return r
    }
    val r = to(data, fBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_P _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PS(o: Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PS(o)
    return w.result
  }

  def toBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PS(data: ISZ[U8]): Either[Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PS(reader: Reader): Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container_PS = {
      val r = reader.readBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PS()
      return r
    }
    val r = to(data, fBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PS _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container(o: Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container(o)
    return w.result
  }

  def toBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container(data: ISZ[U8]): Either[Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container, MessagePack.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container(reader: Reader): Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container = {
      val r = reader.readBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container()
      return r
    }
    val r = to(data, fBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_P(o: Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_P(o)
    return w.result
  }

  def toBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_P(data: ISZ[U8]): Either[Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_P(reader: Reader): Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container_P = {
      val r = reader.readBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_P()
      return r
    }
    val r = to(data, fBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_P _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PS(o: Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PS(o)
    return w.result
  }

  def toBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PS(data: ISZ[U8]): Either[Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PS(reader: Reader): Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container_PS = {
      val r = reader.readBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PS()
      return r
    }
    val r = to(data, fBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PS _)
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