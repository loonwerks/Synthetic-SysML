// #Sireum
// @formatter:off

// This file is auto-generated from CheckCommand.scala, CheckToken.scala, AcquisitionOutcome.scala, PublicationOutcome.scala, AcquisitionDirective.scala, AssessmentContext.scala, PublicationDirective.scala, CheckStatus.scala, ReportTicket.scala, ReportAvailability.scala, CapacityLevel.scala, ReportQuality.scala, StatusReadRequest.scala, QualifiedEvidence.scala, AssessmentResult.scala, FeedbackTicket.scala, UseDisposition.scala, CheckRequest.scala, BatteryReport.scala, CapturedReport.scala, TaggedQualifiedEvidence.scala, TaggedAssessment.scala, ControlUseFeedback.scala, Base_Types.scala, CheckLifecycle_battery_assessment_process_check_lifecycle_Containers.scala, ReportAcquisition_battery_assessment_process_report_acquisition_Containers.scala, ReportQualification_battery_assessment_process_report_qualification_Containers.scala, AssessmentDecision_battery_assessment_process_assessment_decision_Containers.scala, ResultCustody_battery_assessment_process_result_custody_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package battery_status_assessment_service

import org.sireum._
import org.sireum.Json.Printer._

object JSON {

  object Printer {

    @pure def printBattery_Status_Assessment_ServiceCheckCommandType(o: Battery_Status_Assessment_Service.CheckCommand.Type): ST = {
      val value: String = o match {
        case Battery_Status_Assessment_Service.CheckCommand.NoCommand => "NoCommand"
        case Battery_Status_Assessment_Service.CheckCommand.Start => "Start"
        case Battery_Status_Assessment_Service.CheckCommand.Cancel => "Cancel"
        case Battery_Status_Assessment_Service.CheckCommand.Reset => "Reset"
      }
      return printObject(ISZ(
        ("type", printString("Battery_Status_Assessment_Service.CheckCommand")),
        ("value", printString(value))
      ))
    }

    @pure def printBattery_Status_Assessment_ServiceCheckCommand_Payload(o: Battery_Status_Assessment_Service.CheckCommand_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Status_Assessment_Service.CheckCommand_Payload""""),
        ("value", printBattery_Status_Assessment_ServiceCheckCommandType(o.value))
      ))
    }

    @pure def printBattery_Status_Assessment_ServiceCheckTokenType(o: Battery_Status_Assessment_Service.CheckToken.Type): ST = {
      val value: String = o match {
        case Battery_Status_Assessment_Service.CheckToken.TokenA => "TokenA"
        case Battery_Status_Assessment_Service.CheckToken.TokenB => "TokenB"
      }
      return printObject(ISZ(
        ("type", printString("Battery_Status_Assessment_Service.CheckToken")),
        ("value", printString(value))
      ))
    }

    @pure def printBattery_Status_Assessment_ServiceCheckToken_Payload(o: Battery_Status_Assessment_Service.CheckToken_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Status_Assessment_Service.CheckToken_Payload""""),
        ("value", printBattery_Status_Assessment_ServiceCheckTokenType(o.value))
      ))
    }

    @pure def printBattery_Status_Assessment_ServiceAcquisitionOutcomeType(o: Battery_Status_Assessment_Service.AcquisitionOutcome.Type): ST = {
      val value: String = o match {
        case Battery_Status_Assessment_Service.AcquisitionOutcome.NoAcquisitionOutcome => "NoAcquisitionOutcome"
        case Battery_Status_Assessment_Service.AcquisitionOutcome.CapturedTokenA => "CapturedTokenA"
        case Battery_Status_Assessment_Service.AcquisitionOutcome.CapturedTokenB => "CapturedTokenB"
        case Battery_Status_Assessment_Service.AcquisitionOutcome.AcquisitionFault => "AcquisitionFault"
        case Battery_Status_Assessment_Service.AcquisitionOutcome.AcquisitionReset => "AcquisitionReset"
      }
      return printObject(ISZ(
        ("type", printString("Battery_Status_Assessment_Service.AcquisitionOutcome")),
        ("value", printString(value))
      ))
    }

    @pure def printBattery_Status_Assessment_ServiceAcquisitionOutcome_Payload(o: Battery_Status_Assessment_Service.AcquisitionOutcome_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Status_Assessment_Service.AcquisitionOutcome_Payload""""),
        ("value", printBattery_Status_Assessment_ServiceAcquisitionOutcomeType(o.value))
      ))
    }

    @pure def printBattery_Status_Assessment_ServicePublicationOutcomeType(o: Battery_Status_Assessment_Service.PublicationOutcome.Type): ST = {
      val value: String = o match {
        case Battery_Status_Assessment_Service.PublicationOutcome.NoPublicationOutcome => "NoPublicationOutcome"
        case Battery_Status_Assessment_Service.PublicationOutcome.OfferedTokenA => "OfferedTokenA"
        case Battery_Status_Assessment_Service.PublicationOutcome.OfferedTokenB => "OfferedTokenB"
        case Battery_Status_Assessment_Service.PublicationOutcome.Consumed => "Consumed"
        case Battery_Status_Assessment_Service.PublicationOutcome.Cancelled => "Cancelled"
        case Battery_Status_Assessment_Service.PublicationOutcome.PublicationFault => "PublicationFault"
        case Battery_Status_Assessment_Service.PublicationOutcome.PublicationReset => "PublicationReset"
      }
      return printObject(ISZ(
        ("type", printString("Battery_Status_Assessment_Service.PublicationOutcome")),
        ("value", printString(value))
      ))
    }

    @pure def printBattery_Status_Assessment_ServicePublicationOutcome_Payload(o: Battery_Status_Assessment_Service.PublicationOutcome_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Status_Assessment_Service.PublicationOutcome_Payload""""),
        ("value", printBattery_Status_Assessment_ServicePublicationOutcomeType(o.value))
      ))
    }

    @pure def printBattery_Status_Assessment_ServiceAcquisitionDirectiveType(o: Battery_Status_Assessment_Service.AcquisitionDirective.Type): ST = {
      val value: String = o match {
        case Battery_Status_Assessment_Service.AcquisitionDirective.NoAcquisition => "NoAcquisition"
        case Battery_Status_Assessment_Service.AcquisitionDirective.AcquireTokenA => "AcquireTokenA"
        case Battery_Status_Assessment_Service.AcquisitionDirective.AcquireTokenB => "AcquireTokenB"
        case Battery_Status_Assessment_Service.AcquisitionDirective.ResetAcquisition => "ResetAcquisition"
      }
      return printObject(ISZ(
        ("type", printString("Battery_Status_Assessment_Service.AcquisitionDirective")),
        ("value", printString(value))
      ))
    }

    @pure def printBattery_Status_Assessment_ServiceAcquisitionDirective_Payload(o: Battery_Status_Assessment_Service.AcquisitionDirective_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Status_Assessment_Service.AcquisitionDirective_Payload""""),
        ("value", printBattery_Status_Assessment_ServiceAcquisitionDirectiveType(o.value))
      ))
    }

    @pure def printBattery_Status_Assessment_ServiceAssessmentContextType(o: Battery_Status_Assessment_Service.AssessmentContext.Type): ST = {
      val value: String = o match {
        case Battery_Status_Assessment_Service.AssessmentContext.NoContext => "NoContext"
        case Battery_Status_Assessment_Service.AssessmentContext.AssessTokenA => "AssessTokenA"
        case Battery_Status_Assessment_Service.AssessmentContext.AssessTokenB => "AssessTokenB"
      }
      return printObject(ISZ(
        ("type", printString("Battery_Status_Assessment_Service.AssessmentContext")),
        ("value", printString(value))
      ))
    }

    @pure def printBattery_Status_Assessment_ServiceAssessmentContext_Payload(o: Battery_Status_Assessment_Service.AssessmentContext_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Status_Assessment_Service.AssessmentContext_Payload""""),
        ("value", printBattery_Status_Assessment_ServiceAssessmentContextType(o.value))
      ))
    }

    @pure def printBattery_Status_Assessment_ServicePublicationDirectiveType(o: Battery_Status_Assessment_Service.PublicationDirective.Type): ST = {
      val value: String = o match {
        case Battery_Status_Assessment_Service.PublicationDirective.NoPublicationDirective => "NoPublicationDirective"
        case Battery_Status_Assessment_Service.PublicationDirective.OpenTokenA => "OpenTokenA"
        case Battery_Status_Assessment_Service.PublicationDirective.OpenTokenB => "OpenTokenB"
        case Battery_Status_Assessment_Service.PublicationDirective.Withdraw => "Withdraw"
        case Battery_Status_Assessment_Service.PublicationDirective.ResetPublication => "ResetPublication"
      }
      return printObject(ISZ(
        ("type", printString("Battery_Status_Assessment_Service.PublicationDirective")),
        ("value", printString(value))
      ))
    }

    @pure def printBattery_Status_Assessment_ServicePublicationDirective_Payload(o: Battery_Status_Assessment_Service.PublicationDirective_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Status_Assessment_Service.PublicationDirective_Payload""""),
        ("value", printBattery_Status_Assessment_ServicePublicationDirectiveType(o.value))
      ))
    }

    @pure def printBattery_Status_Assessment_ServiceCheckStatusType(o: Battery_Status_Assessment_Service.CheckStatus.Type): ST = {
      val value: String = o match {
        case Battery_Status_Assessment_Service.CheckStatus.Idle => "Idle"
        case Battery_Status_Assessment_Service.CheckStatus.Checking => "Checking"
        case Battery_Status_Assessment_Service.CheckStatus.Available => "Available"
        case Battery_Status_Assessment_Service.CheckStatus.DuplicateIgnored => "DuplicateIgnored"
        case Battery_Status_Assessment_Service.CheckStatus.Busy => "Busy"
        case Battery_Status_Assessment_Service.CheckStatus.Cancelled => "Cancelled"
        case Battery_Status_Assessment_Service.CheckStatus.AcquisitionFailed => "AcquisitionFailed"
        case Battery_Status_Assessment_Service.CheckStatus.Completed => "Completed"
        case Battery_Status_Assessment_Service.CheckStatus.PublicationFailed => "PublicationFailed"
        case Battery_Status_Assessment_Service.CheckStatus.RecoveryRequired => "RecoveryRequired"
        case Battery_Status_Assessment_Service.CheckStatus.ResetCompleted => "ResetCompleted"
      }
      return printObject(ISZ(
        ("type", printString("Battery_Status_Assessment_Service.CheckStatus")),
        ("value", printString(value))
      ))
    }

    @pure def printBattery_Status_Assessment_ServiceCheckStatus_Payload(o: Battery_Status_Assessment_Service.CheckStatus_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Status_Assessment_Service.CheckStatus_Payload""""),
        ("value", printBattery_Status_Assessment_ServiceCheckStatusType(o.value))
      ))
    }

    @pure def printBattery_Status_Assessment_ServiceReportTicketType(o: Battery_Status_Assessment_Service.ReportTicket.Type): ST = {
      val value: String = o match {
        case Battery_Status_Assessment_Service.ReportTicket.NoTicket => "NoTicket"
        case Battery_Status_Assessment_Service.ReportTicket.TokenA => "TokenA"
        case Battery_Status_Assessment_Service.ReportTicket.TokenB => "TokenB"
      }
      return printObject(ISZ(
        ("type", printString("Battery_Status_Assessment_Service.ReportTicket")),
        ("value", printString(value))
      ))
    }

    @pure def printBattery_Status_Assessment_ServiceReportTicket_Payload(o: Battery_Status_Assessment_Service.ReportTicket_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Status_Assessment_Service.ReportTicket_Payload""""),
        ("value", printBattery_Status_Assessment_ServiceReportTicketType(o.value))
      ))
    }

    @pure def printBattery_Status_Assessment_ServiceReportAvailabilityType(o: Battery_Status_Assessment_Service.ReportAvailability.Type): ST = {
      val value: String = o match {
        case Battery_Status_Assessment_Service.ReportAvailability.Absent => "Absent"
        case Battery_Status_Assessment_Service.ReportAvailability.Present => "Present"
        case Battery_Status_Assessment_Service.ReportAvailability.Unavailable => "Unavailable"
      }
      return printObject(ISZ(
        ("type", printString("Battery_Status_Assessment_Service.ReportAvailability")),
        ("value", printString(value))
      ))
    }

    @pure def printBattery_Status_Assessment_ServiceReportAvailability_Payload(o: Battery_Status_Assessment_Service.ReportAvailability_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Status_Assessment_Service.ReportAvailability_Payload""""),
        ("value", printBattery_Status_Assessment_ServiceReportAvailabilityType(o.value))
      ))
    }

    @pure def printBattery_Status_Assessment_ServiceCapacityLevelType(o: Battery_Status_Assessment_Service.CapacityLevel.Type): ST = {
      val value: String = o match {
        case Battery_Status_Assessment_Service.CapacityLevel.NoLevel => "NoLevel"
        case Battery_Status_Assessment_Service.CapacityLevel.High => "High"
        case Battery_Status_Assessment_Service.CapacityLevel.Moderate => "Moderate"
        case Battery_Status_Assessment_Service.CapacityLevel.Low => "Low"
        case Battery_Status_Assessment_Service.CapacityLevel.Critical => "Critical"
      }
      return printObject(ISZ(
        ("type", printString("Battery_Status_Assessment_Service.CapacityLevel")),
        ("value", printString(value))
      ))
    }

    @pure def printBattery_Status_Assessment_ServiceCapacityLevel_Payload(o: Battery_Status_Assessment_Service.CapacityLevel_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Status_Assessment_Service.CapacityLevel_Payload""""),
        ("value", printBattery_Status_Assessment_ServiceCapacityLevelType(o.value))
      ))
    }

    @pure def printBattery_Status_Assessment_ServiceReportQualityType(o: Battery_Status_Assessment_Service.ReportQuality.Type): ST = {
      val value: String = o match {
        case Battery_Status_Assessment_Service.ReportQuality.NoQuality => "NoQuality"
        case Battery_Status_Assessment_Service.ReportQuality.Current => "Current"
        case Battery_Status_Assessment_Service.ReportQuality.Stale => "Stale"
        case Battery_Status_Assessment_Service.ReportQuality.Invalid => "Invalid"
      }
      return printObject(ISZ(
        ("type", printString("Battery_Status_Assessment_Service.ReportQuality")),
        ("value", printString(value))
      ))
    }

    @pure def printBattery_Status_Assessment_ServiceReportQuality_Payload(o: Battery_Status_Assessment_Service.ReportQuality_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Status_Assessment_Service.ReportQuality_Payload""""),
        ("value", printBattery_Status_Assessment_ServiceReportQualityType(o.value))
      ))
    }

    @pure def printBattery_Status_Assessment_ServiceStatusReadRequestType(o: Battery_Status_Assessment_Service.StatusReadRequest.Type): ST = {
      val value: String = o match {
        case Battery_Status_Assessment_Service.StatusReadRequest.NoRead => "NoRead"
        case Battery_Status_Assessment_Service.StatusReadRequest.ReadTokenA => "ReadTokenA"
        case Battery_Status_Assessment_Service.StatusReadRequest.ReadTokenB => "ReadTokenB"
      }
      return printObject(ISZ(
        ("type", printString("Battery_Status_Assessment_Service.StatusReadRequest")),
        ("value", printString(value))
      ))
    }

    @pure def printBattery_Status_Assessment_ServiceStatusReadRequest_Payload(o: Battery_Status_Assessment_Service.StatusReadRequest_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Status_Assessment_Service.StatusReadRequest_Payload""""),
        ("value", printBattery_Status_Assessment_ServiceStatusReadRequestType(o.value))
      ))
    }

    @pure def printBattery_Status_Assessment_ServiceQualifiedEvidenceType(o: Battery_Status_Assessment_Service.QualifiedEvidence.Type): ST = {
      val value: String = o match {
        case Battery_Status_Assessment_Service.QualifiedEvidence.NoEvidence => "NoEvidence"
        case Battery_Status_Assessment_Service.QualifiedEvidence.TrustedHigh => "TrustedHigh"
        case Battery_Status_Assessment_Service.QualifiedEvidence.TrustedModerate => "TrustedModerate"
        case Battery_Status_Assessment_Service.QualifiedEvidence.TrustedLow => "TrustedLow"
        case Battery_Status_Assessment_Service.QualifiedEvidence.TrustedCritical => "TrustedCritical"
        case Battery_Status_Assessment_Service.QualifiedEvidence.Untrusted => "Untrusted"
      }
      return printObject(ISZ(
        ("type", printString("Battery_Status_Assessment_Service.QualifiedEvidence")),
        ("value", printString(value))
      ))
    }

    @pure def printBattery_Status_Assessment_ServiceQualifiedEvidence_Payload(o: Battery_Status_Assessment_Service.QualifiedEvidence_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Status_Assessment_Service.QualifiedEvidence_Payload""""),
        ("value", printBattery_Status_Assessment_ServiceQualifiedEvidenceType(o.value))
      ))
    }

    @pure def printBattery_Status_Assessment_ServiceAssessmentResultType(o: Battery_Status_Assessment_Service.AssessmentResult.Type): ST = {
      val value: String = o match {
        case Battery_Status_Assessment_Service.AssessmentResult.NoAssessment => "NoAssessment"
        case Battery_Status_Assessment_Service.AssessmentResult.NormalUse => "NormalUse"
        case Battery_Status_Assessment_Service.AssessmentResult.CautionUse => "CautionUse"
        case Battery_Status_Assessment_Service.AssessmentResult.RestrictUse => "RestrictUse"
        case Battery_Status_Assessment_Service.AssessmentResult.Untrusted => "Untrusted"
      }
      return printObject(ISZ(
        ("type", printString("Battery_Status_Assessment_Service.AssessmentResult")),
        ("value", printString(value))
      ))
    }

    @pure def printBattery_Status_Assessment_ServiceAssessmentResult_Payload(o: Battery_Status_Assessment_Service.AssessmentResult_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Status_Assessment_Service.AssessmentResult_Payload""""),
        ("value", printBattery_Status_Assessment_ServiceAssessmentResultType(o.value))
      ))
    }

    @pure def printBattery_Status_Assessment_ServiceFeedbackTicketType(o: Battery_Status_Assessment_Service.FeedbackTicket.Type): ST = {
      val value: String = o match {
        case Battery_Status_Assessment_Service.FeedbackTicket.NoTicket => "NoTicket"
        case Battery_Status_Assessment_Service.FeedbackTicket.TokenA => "TokenA"
        case Battery_Status_Assessment_Service.FeedbackTicket.TokenB => "TokenB"
      }
      return printObject(ISZ(
        ("type", printString("Battery_Status_Assessment_Service.FeedbackTicket")),
        ("value", printString(value))
      ))
    }

    @pure def printBattery_Status_Assessment_ServiceFeedbackTicket_Payload(o: Battery_Status_Assessment_Service.FeedbackTicket_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Status_Assessment_Service.FeedbackTicket_Payload""""),
        ("value", printBattery_Status_Assessment_ServiceFeedbackTicketType(o.value))
      ))
    }

    @pure def printBattery_Status_Assessment_ServiceUseDispositionType(o: Battery_Status_Assessment_Service.UseDisposition.Type): ST = {
      val value: String = o match {
        case Battery_Status_Assessment_Service.UseDisposition.NoFeedback => "NoFeedback"
        case Battery_Status_Assessment_Service.UseDisposition.Pending => "Pending"
        case Battery_Status_Assessment_Service.UseDisposition.Consumed => "Consumed"
        case Battery_Status_Assessment_Service.UseDisposition.Rejected => "Rejected"
      }
      return printObject(ISZ(
        ("type", printString("Battery_Status_Assessment_Service.UseDisposition")),
        ("value", printString(value))
      ))
    }

    @pure def printBattery_Status_Assessment_ServiceUseDisposition_Payload(o: Battery_Status_Assessment_Service.UseDisposition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Status_Assessment_Service.UseDisposition_Payload""""),
        ("value", printBattery_Status_Assessment_ServiceUseDispositionType(o.value))
      ))
    }

    @pure def printBattery_Status_Assessment_ServiceCheckRequest(o: Battery_Status_Assessment_Service.CheckRequest): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Status_Assessment_Service.CheckRequest""""),
        ("command", printBattery_Status_Assessment_ServiceCheckCommandType(o.command)),
        ("token", printBattery_Status_Assessment_ServiceCheckTokenType(o.token))
      ))
    }

    @pure def printBattery_Status_Assessment_ServiceCheckRequest_Payload(o: Battery_Status_Assessment_Service.CheckRequest_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Status_Assessment_Service.CheckRequest_Payload""""),
        ("value", printBattery_Status_Assessment_ServiceCheckRequest(o.value))
      ))
    }

    @pure def printBattery_Status_Assessment_ServiceBatteryReport(o: Battery_Status_Assessment_Service.BatteryReport): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Status_Assessment_Service.BatteryReport""""),
        ("ticket", printBattery_Status_Assessment_ServiceReportTicketType(o.ticket)),
        ("availability", printBattery_Status_Assessment_ServiceReportAvailabilityType(o.availability)),
        ("level", printBattery_Status_Assessment_ServiceCapacityLevelType(o.level)),
        ("quality", printBattery_Status_Assessment_ServiceReportQualityType(o.quality))
      ))
    }

    @pure def printBattery_Status_Assessment_ServiceBatteryReport_Payload(o: Battery_Status_Assessment_Service.BatteryReport_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Status_Assessment_Service.BatteryReport_Payload""""),
        ("value", printBattery_Status_Assessment_ServiceBatteryReport(o.value))
      ))
    }

    @pure def printBattery_Status_Assessment_ServiceCapturedReport(o: Battery_Status_Assessment_Service.CapturedReport): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Status_Assessment_Service.CapturedReport""""),
        ("ticket", printBattery_Status_Assessment_ServiceReportTicketType(o.ticket)),
        ("availability", printBattery_Status_Assessment_ServiceReportAvailabilityType(o.availability)),
        ("level", printBattery_Status_Assessment_ServiceCapacityLevelType(o.level)),
        ("quality", printBattery_Status_Assessment_ServiceReportQualityType(o.quality))
      ))
    }

    @pure def printBattery_Status_Assessment_ServiceCapturedReport_Payload(o: Battery_Status_Assessment_Service.CapturedReport_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Status_Assessment_Service.CapturedReport_Payload""""),
        ("value", printBattery_Status_Assessment_ServiceCapturedReport(o.value))
      ))
    }

    @pure def printBattery_Status_Assessment_ServiceTaggedQualifiedEvidence(o: Battery_Status_Assessment_Service.TaggedQualifiedEvidence): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Status_Assessment_Service.TaggedQualifiedEvidence""""),
        ("ticket", printBattery_Status_Assessment_ServiceReportTicketType(o.ticket)),
        ("evidence", printBattery_Status_Assessment_ServiceQualifiedEvidenceType(o.evidence))
      ))
    }

    @pure def printBattery_Status_Assessment_ServiceTaggedQualifiedEvidence_Payload(o: Battery_Status_Assessment_Service.TaggedQualifiedEvidence_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Status_Assessment_Service.TaggedQualifiedEvidence_Payload""""),
        ("value", printBattery_Status_Assessment_ServiceTaggedQualifiedEvidence(o.value))
      ))
    }

    @pure def printBattery_Status_Assessment_ServiceTaggedAssessment(o: Battery_Status_Assessment_Service.TaggedAssessment): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Status_Assessment_Service.TaggedAssessment""""),
        ("ticket", printBattery_Status_Assessment_ServiceReportTicketType(o.ticket)),
        ("result", printBattery_Status_Assessment_ServiceAssessmentResultType(o.result))
      ))
    }

    @pure def printBattery_Status_Assessment_ServiceTaggedAssessment_Payload(o: Battery_Status_Assessment_Service.TaggedAssessment_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Status_Assessment_Service.TaggedAssessment_Payload""""),
        ("value", printBattery_Status_Assessment_ServiceTaggedAssessment(o.value))
      ))
    }

    @pure def printBattery_Status_Assessment_ServiceControlUseFeedback(o: Battery_Status_Assessment_Service.ControlUseFeedback): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Status_Assessment_Service.ControlUseFeedback""""),
        ("ticket", printBattery_Status_Assessment_ServiceFeedbackTicketType(o.ticket)),
        ("disposition", printBattery_Status_Assessment_ServiceUseDispositionType(o.disposition))
      ))
    }

    @pure def printBattery_Status_Assessment_ServiceControlUseFeedback_Payload(o: Battery_Status_Assessment_Service.ControlUseFeedback_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Status_Assessment_Service.ControlUseFeedback_Payload""""),
        ("value", printBattery_Status_Assessment_ServiceControlUseFeedback(o.value))
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

    @pure def printBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container(o: Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container): ST = {
      o match {
        case o: Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P => return printBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P(o)
        case o: Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS => return printBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS(o)
      }
    }

    @pure def printBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P(o: Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P""""),
        ("api_acquisition_outcome", printBattery_Status_Assessment_ServiceAcquisitionOutcomeType(o.api_acquisition_outcome)),
        ("api_check_request", printBattery_Status_Assessment_ServiceCheckRequest(o.api_check_request)),
        ("api_publication_outcome", printBattery_Status_Assessment_ServicePublicationOutcomeType(o.api_publication_outcome))
      ))
    }

    @pure def printBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS(o: Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS""""),
        ("api_acquisition_outcome", printBattery_Status_Assessment_ServiceAcquisitionOutcomeType(o.api_acquisition_outcome)),
        ("api_check_request", printBattery_Status_Assessment_ServiceCheckRequest(o.api_check_request)),
        ("api_publication_outcome", printBattery_Status_Assessment_ServicePublicationOutcomeType(o.api_publication_outcome))
      ))
    }

    @pure def printBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container(o: Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container): ST = {
      o match {
        case o: Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P => return printBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P(o)
        case o: Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS => return printBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS(o)
      }
    }

    @pure def printBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P(o: Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P""""),
        ("api_acquisition_directive", printBattery_Status_Assessment_ServiceAcquisitionDirectiveType(o.api_acquisition_directive)),
        ("api_assessment_context", printBattery_Status_Assessment_ServiceAssessmentContextType(o.api_assessment_context)),
        ("api_check_status", printBattery_Status_Assessment_ServiceCheckStatusType(o.api_check_status)),
        ("api_publication_directive", printBattery_Status_Assessment_ServicePublicationDirectiveType(o.api_publication_directive))
      ))
    }

    @pure def printBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS(o: Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS""""),
        ("api_acquisition_directive", printBattery_Status_Assessment_ServiceAcquisitionDirectiveType(o.api_acquisition_directive)),
        ("api_assessment_context", printBattery_Status_Assessment_ServiceAssessmentContextType(o.api_assessment_context)),
        ("api_check_status", printBattery_Status_Assessment_ServiceCheckStatusType(o.api_check_status)),
        ("api_publication_directive", printBattery_Status_Assessment_ServicePublicationDirectiveType(o.api_publication_directive))
      ))
    }

    @pure def printBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container(o: Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container): ST = {
      o match {
        case o: Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P => return printBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P(o)
        case o: Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS => return printBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS(o)
      }
    }

    @pure def printBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P(o: Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P""""),
        ("api_acquisition_directive", printBattery_Status_Assessment_ServiceAcquisitionDirectiveType(o.api_acquisition_directive)),
        ("api_battery_report", printBattery_Status_Assessment_ServiceBatteryReport(o.api_battery_report))
      ))
    }

    @pure def printBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS(o: Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS""""),
        ("api_acquisition_directive", printBattery_Status_Assessment_ServiceAcquisitionDirectiveType(o.api_acquisition_directive)),
        ("api_battery_report", printBattery_Status_Assessment_ServiceBatteryReport(o.api_battery_report))
      ))
    }

    @pure def printBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container(o: Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container): ST = {
      o match {
        case o: Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P => return printBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P(o)
        case o: Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS => return printBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS(o)
      }
    }

    @pure def printBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P(o: Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P""""),
        ("api_acquisition_outcome", printBattery_Status_Assessment_ServiceAcquisitionOutcomeType(o.api_acquisition_outcome)),
        ("api_captured_report", printBattery_Status_Assessment_ServiceCapturedReport(o.api_captured_report)),
        ("api_status_read_request", printBattery_Status_Assessment_ServiceStatusReadRequestType(o.api_status_read_request))
      ))
    }

    @pure def printBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS(o: Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS""""),
        ("api_acquisition_outcome", printBattery_Status_Assessment_ServiceAcquisitionOutcomeType(o.api_acquisition_outcome)),
        ("api_captured_report", printBattery_Status_Assessment_ServiceCapturedReport(o.api_captured_report)),
        ("api_status_read_request", printBattery_Status_Assessment_ServiceStatusReadRequestType(o.api_status_read_request))
      ))
    }

    @pure def printBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container(o: Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container): ST = {
      o match {
        case o: Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container_P => return printBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_P(o)
        case o: Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS => return printBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS(o)
      }
    }

    @pure def printBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_P(o: Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container_P""""),
        ("api_captured_report", printBattery_Status_Assessment_ServiceCapturedReport(o.api_captured_report))
      ))
    }

    @pure def printBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS(o: Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS""""),
        ("api_captured_report", printBattery_Status_Assessment_ServiceCapturedReport(o.api_captured_report))
      ))
    }

    @pure def printBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container(o: Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container): ST = {
      o match {
        case o: Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container_P => return printBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_P(o)
        case o: Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS => return printBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS(o)
      }
    }

    @pure def printBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_P(o: Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container_P""""),
        ("api_qualified_evidence", printBattery_Status_Assessment_ServiceTaggedQualifiedEvidence(o.api_qualified_evidence))
      ))
    }

    @pure def printBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS(o: Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS""""),
        ("api_qualified_evidence", printBattery_Status_Assessment_ServiceTaggedQualifiedEvidence(o.api_qualified_evidence))
      ))
    }

    @pure def printBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container(o: Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container): ST = {
      o match {
        case o: Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P => return printBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P(o)
        case o: Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS => return printBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS(o)
      }
    }

    @pure def printBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P(o: Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P""""),
        ("api_assessment_context", printBattery_Status_Assessment_ServiceAssessmentContextType(o.api_assessment_context)),
        ("api_qualified_evidence", printBattery_Status_Assessment_ServiceTaggedQualifiedEvidence(o.api_qualified_evidence))
      ))
    }

    @pure def printBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS(o: Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS""""),
        ("api_assessment_context", printBattery_Status_Assessment_ServiceAssessmentContextType(o.api_assessment_context)),
        ("api_qualified_evidence", printBattery_Status_Assessment_ServiceTaggedQualifiedEvidence(o.api_qualified_evidence))
      ))
    }

    @pure def printBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container(o: Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container): ST = {
      o match {
        case o: Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P => return printBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P(o)
        case o: Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS => return printBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS(o)
      }
    }

    @pure def printBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P(o: Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P""""),
        ("api_decision_assessment", printBattery_Status_Assessment_ServiceTaggedAssessment(o.api_decision_assessment))
      ))
    }

    @pure def printBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS(o: Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS""""),
        ("api_decision_assessment", printBattery_Status_Assessment_ServiceTaggedAssessment(o.api_decision_assessment))
      ))
    }

    @pure def printBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container(o: Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container): ST = {
      o match {
        case o: Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container_P => return printBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_P(o)
        case o: Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container_PS => return printBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PS(o)
      }
    }

    @pure def printBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_P(o: Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container_P""""),
        ("api_control_use_feedback", printBattery_Status_Assessment_ServiceControlUseFeedback(o.api_control_use_feedback)),
        ("api_decision_assessment", printBattery_Status_Assessment_ServiceTaggedAssessment(o.api_decision_assessment)),
        ("api_publication_directive", printBattery_Status_Assessment_ServicePublicationDirectiveType(o.api_publication_directive))
      ))
    }

    @pure def printBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PS(o: Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container_PS""""),
        ("api_control_use_feedback", printBattery_Status_Assessment_ServiceControlUseFeedback(o.api_control_use_feedback)),
        ("api_decision_assessment", printBattery_Status_Assessment_ServiceTaggedAssessment(o.api_decision_assessment)),
        ("api_publication_directive", printBattery_Status_Assessment_ServicePublicationDirectiveType(o.api_publication_directive))
      ))
    }

    @pure def printBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container(o: Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container): ST = {
      o match {
        case o: Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container_P => return printBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_P(o)
        case o: Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container_PS => return printBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PS(o)
      }
    }

    @pure def printBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_P(o: Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container_P""""),
        ("api_battery_assessment", printBattery_Status_Assessment_ServiceTaggedAssessment(o.api_battery_assessment)),
        ("api_publication_outcome", printBattery_Status_Assessment_ServicePublicationOutcomeType(o.api_publication_outcome))
      ))
    }

    @pure def printBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PS(o: Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container_PS""""),
        ("api_battery_assessment", printBattery_Status_Assessment_ServiceTaggedAssessment(o.api_battery_assessment)),
        ("api_publication_outcome", printBattery_Status_Assessment_ServicePublicationOutcomeType(o.api_publication_outcome))
      ))
    }

    @pure def printruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): ST = {
      val value: String = o match {
        case runtimemonitor.ObservationKind.BatteryStatusAssessmentServiceSystem_Instance_battery_assessment_process_check_lifecycle_postInit => "BatteryStatusAssessmentServiceSystem_Instance_battery_assessment_process_check_lifecycle_postInit"
        case runtimemonitor.ObservationKind.BatteryStatusAssessmentServiceSystem_Instance_battery_assessment_process_check_lifecycle_preCompute => "BatteryStatusAssessmentServiceSystem_Instance_battery_assessment_process_check_lifecycle_preCompute"
        case runtimemonitor.ObservationKind.BatteryStatusAssessmentServiceSystem_Instance_battery_assessment_process_check_lifecycle_postCompute => "BatteryStatusAssessmentServiceSystem_Instance_battery_assessment_process_check_lifecycle_postCompute"
        case runtimemonitor.ObservationKind.BatteryStatusAssessmentServiceSystem_Instance_battery_assessment_process_report_acquisition_postInit => "BatteryStatusAssessmentServiceSystem_Instance_battery_assessment_process_report_acquisition_postInit"
        case runtimemonitor.ObservationKind.BatteryStatusAssessmentServiceSystem_Instance_battery_assessment_process_report_acquisition_preCompute => "BatteryStatusAssessmentServiceSystem_Instance_battery_assessment_process_report_acquisition_preCompute"
        case runtimemonitor.ObservationKind.BatteryStatusAssessmentServiceSystem_Instance_battery_assessment_process_report_acquisition_postCompute => "BatteryStatusAssessmentServiceSystem_Instance_battery_assessment_process_report_acquisition_postCompute"
        case runtimemonitor.ObservationKind.BatteryStatusAssessmentServiceSystem_Instance_battery_assessment_process_report_qualification_postInit => "BatteryStatusAssessmentServiceSystem_Instance_battery_assessment_process_report_qualification_postInit"
        case runtimemonitor.ObservationKind.BatteryStatusAssessmentServiceSystem_Instance_battery_assessment_process_report_qualification_preCompute => "BatteryStatusAssessmentServiceSystem_Instance_battery_assessment_process_report_qualification_preCompute"
        case runtimemonitor.ObservationKind.BatteryStatusAssessmentServiceSystem_Instance_battery_assessment_process_report_qualification_postCompute => "BatteryStatusAssessmentServiceSystem_Instance_battery_assessment_process_report_qualification_postCompute"
        case runtimemonitor.ObservationKind.BatteryStatusAssessmentServiceSystem_Instance_battery_assessment_process_assessment_decision_postInit => "BatteryStatusAssessmentServiceSystem_Instance_battery_assessment_process_assessment_decision_postInit"
        case runtimemonitor.ObservationKind.BatteryStatusAssessmentServiceSystem_Instance_battery_assessment_process_assessment_decision_preCompute => "BatteryStatusAssessmentServiceSystem_Instance_battery_assessment_process_assessment_decision_preCompute"
        case runtimemonitor.ObservationKind.BatteryStatusAssessmentServiceSystem_Instance_battery_assessment_process_assessment_decision_postCompute => "BatteryStatusAssessmentServiceSystem_Instance_battery_assessment_process_assessment_decision_postCompute"
        case runtimemonitor.ObservationKind.BatteryStatusAssessmentServiceSystem_Instance_battery_assessment_process_result_custody_postInit => "BatteryStatusAssessmentServiceSystem_Instance_battery_assessment_process_result_custody_postInit"
        case runtimemonitor.ObservationKind.BatteryStatusAssessmentServiceSystem_Instance_battery_assessment_process_result_custody_preCompute => "BatteryStatusAssessmentServiceSystem_Instance_battery_assessment_process_result_custody_preCompute"
        case runtimemonitor.ObservationKind.BatteryStatusAssessmentServiceSystem_Instance_battery_assessment_process_result_custody_postCompute => "BatteryStatusAssessmentServiceSystem_Instance_battery_assessment_process_result_custody_postCompute"
      }
      return printObject(ISZ(
        ("type", printString("runtimemonitor.ObservationKind")),
        ("value", printString(value))
      ))
    }

    @pure def printutilContainer(o: util.Container): ST = {
      o match {
        case o: util.EmptyContainer => return printutilEmptyContainer(o)
        case o: Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container_P => return printBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_P(o)
        case o: Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container_PS => return printBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PS(o)
        case o: Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container_P => return printBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_P(o)
        case o: Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container_PS => return printBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PS(o)
        case o: Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P => return printBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P(o)
        case o: Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS => return printBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS(o)
        case o: Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P => return printBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P(o)
        case o: Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS => return printBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS(o)
        case o: Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P => return printBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P(o)
        case o: Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS => return printBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS(o)
        case o: Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P => return printBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P(o)
        case o: Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS => return printBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS(o)
        case o: Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P => return printBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P(o)
        case o: Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS => return printBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS(o)
        case o: Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P => return printBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P(o)
        case o: Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS => return printBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS(o)
        case o: Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container_P => return printBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_P(o)
        case o: Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS => return printBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS(o)
        case o: Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container_P => return printBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_P(o)
        case o: Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS => return printBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS(o)
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
        case o: Battery_Status_Assessment_Service.CheckToken_Payload => return printBattery_Status_Assessment_ServiceCheckToken_Payload(o)
        case o: Battery_Status_Assessment_Service.CheckStatus_Payload => return printBattery_Status_Assessment_ServiceCheckStatus_Payload(o)
        case o: Battery_Status_Assessment_Service.ReportTicket_Payload => return printBattery_Status_Assessment_ServiceReportTicket_Payload(o)
        case o: Battery_Status_Assessment_Service.CheckCommand_Payload => return printBattery_Status_Assessment_ServiceCheckCommand_Payload(o)
        case o: Battery_Status_Assessment_Service.CheckRequest_Payload => return printBattery_Status_Assessment_ServiceCheckRequest_Payload(o)
        case o: Battery_Status_Assessment_Service.ReportQuality_Payload => return printBattery_Status_Assessment_ServiceReportQuality_Payload(o)
        case o: Battery_Status_Assessment_Service.CapacityLevel_Payload => return printBattery_Status_Assessment_ServiceCapacityLevel_Payload(o)
        case o: Battery_Status_Assessment_Service.BatteryReport_Payload => return printBattery_Status_Assessment_ServiceBatteryReport_Payload(o)
        case o: Battery_Status_Assessment_Service.FeedbackTicket_Payload => return printBattery_Status_Assessment_ServiceFeedbackTicket_Payload(o)
        case o: Battery_Status_Assessment_Service.UseDisposition_Payload => return printBattery_Status_Assessment_ServiceUseDisposition_Payload(o)
        case o: Battery_Status_Assessment_Service.CapturedReport_Payload => return printBattery_Status_Assessment_ServiceCapturedReport_Payload(o)
        case o: Battery_Status_Assessment_Service.AssessmentResult_Payload => return printBattery_Status_Assessment_ServiceAssessmentResult_Payload(o)
        case o: Battery_Status_Assessment_Service.TaggedAssessment_Payload => return printBattery_Status_Assessment_ServiceTaggedAssessment_Payload(o)
        case o: Battery_Status_Assessment_Service.StatusReadRequest_Payload => return printBattery_Status_Assessment_ServiceStatusReadRequest_Payload(o)
        case o: Battery_Status_Assessment_Service.AssessmentContext_Payload => return printBattery_Status_Assessment_ServiceAssessmentContext_Payload(o)
        case o: Battery_Status_Assessment_Service.QualifiedEvidence_Payload => return printBattery_Status_Assessment_ServiceQualifiedEvidence_Payload(o)
        case o: Battery_Status_Assessment_Service.ReportAvailability_Payload => return printBattery_Status_Assessment_ServiceReportAvailability_Payload(o)
        case o: Battery_Status_Assessment_Service.AcquisitionOutcome_Payload => return printBattery_Status_Assessment_ServiceAcquisitionOutcome_Payload(o)
        case o: Battery_Status_Assessment_Service.PublicationOutcome_Payload => return printBattery_Status_Assessment_ServicePublicationOutcome_Payload(o)
        case o: Battery_Status_Assessment_Service.ControlUseFeedback_Payload => return printBattery_Status_Assessment_ServiceControlUseFeedback_Payload(o)
        case o: Battery_Status_Assessment_Service.AcquisitionDirective_Payload => return printBattery_Status_Assessment_ServiceAcquisitionDirective_Payload(o)
        case o: Battery_Status_Assessment_Service.PublicationDirective_Payload => return printBattery_Status_Assessment_ServicePublicationDirective_Payload(o)
        case o: Battery_Status_Assessment_Service.TaggedQualifiedEvidence_Payload => return printBattery_Status_Assessment_ServiceTaggedQualifiedEvidence_Payload(o)
        case o: Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container_P => return printBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_P(o)
        case o: Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container_PS => return printBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PS(o)
        case o: Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container_P => return printBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_P(o)
        case o: Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container_PS => return printBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PS(o)
        case o: Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P => return printBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P(o)
        case o: Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS => return printBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS(o)
        case o: Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P => return printBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P(o)
        case o: Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS => return printBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS(o)
        case o: Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P => return printBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P(o)
        case o: Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS => return printBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS(o)
        case o: Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P => return printBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P(o)
        case o: Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS => return printBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS(o)
        case o: Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P => return printBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P(o)
        case o: Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS => return printBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS(o)
        case o: Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P => return printBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P(o)
        case o: Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS => return printBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS(o)
        case o: Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container_P => return printBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_P(o)
        case o: Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS => return printBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS(o)
        case o: Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container_P => return printBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_P(o)
        case o: Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS => return printBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS(o)
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

    def parseBattery_Status_Assessment_ServiceCheckCommandType(): Battery_Status_Assessment_Service.CheckCommand.Type = {
      val r = parseBattery_Status_Assessment_ServiceCheckCommandT(F)
      return r
    }

    def parseBattery_Status_Assessment_ServiceCheckCommandT(typeParsed: B): Battery_Status_Assessment_Service.CheckCommand.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Status_Assessment_Service.CheckCommand")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Battery_Status_Assessment_Service.CheckCommand.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Battery_Status_Assessment_Service.CheckCommand.")
          return Battery_Status_Assessment_Service.CheckCommand.byOrdinal(0).get
      }
    }

    def parseBattery_Status_Assessment_ServiceCheckCommand_Payload(): Battery_Status_Assessment_Service.CheckCommand_Payload = {
      val r = parseBattery_Status_Assessment_ServiceCheckCommand_PayloadT(F)
      return r
    }

    def parseBattery_Status_Assessment_ServiceCheckCommand_PayloadT(typeParsed: B): Battery_Status_Assessment_Service.CheckCommand_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Status_Assessment_Service.CheckCommand_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseBattery_Status_Assessment_ServiceCheckCommandType()
      parser.parseObjectNext()
      return Battery_Status_Assessment_Service.CheckCommand_Payload(value)
    }

    def parseBattery_Status_Assessment_ServiceCheckTokenType(): Battery_Status_Assessment_Service.CheckToken.Type = {
      val r = parseBattery_Status_Assessment_ServiceCheckTokenT(F)
      return r
    }

    def parseBattery_Status_Assessment_ServiceCheckTokenT(typeParsed: B): Battery_Status_Assessment_Service.CheckToken.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Status_Assessment_Service.CheckToken")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Battery_Status_Assessment_Service.CheckToken.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Battery_Status_Assessment_Service.CheckToken.")
          return Battery_Status_Assessment_Service.CheckToken.byOrdinal(0).get
      }
    }

    def parseBattery_Status_Assessment_ServiceCheckToken_Payload(): Battery_Status_Assessment_Service.CheckToken_Payload = {
      val r = parseBattery_Status_Assessment_ServiceCheckToken_PayloadT(F)
      return r
    }

    def parseBattery_Status_Assessment_ServiceCheckToken_PayloadT(typeParsed: B): Battery_Status_Assessment_Service.CheckToken_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Status_Assessment_Service.CheckToken_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseBattery_Status_Assessment_ServiceCheckTokenType()
      parser.parseObjectNext()
      return Battery_Status_Assessment_Service.CheckToken_Payload(value)
    }

    def parseBattery_Status_Assessment_ServiceAcquisitionOutcomeType(): Battery_Status_Assessment_Service.AcquisitionOutcome.Type = {
      val r = parseBattery_Status_Assessment_ServiceAcquisitionOutcomeT(F)
      return r
    }

    def parseBattery_Status_Assessment_ServiceAcquisitionOutcomeT(typeParsed: B): Battery_Status_Assessment_Service.AcquisitionOutcome.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Status_Assessment_Service.AcquisitionOutcome")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Battery_Status_Assessment_Service.AcquisitionOutcome.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Battery_Status_Assessment_Service.AcquisitionOutcome.")
          return Battery_Status_Assessment_Service.AcquisitionOutcome.byOrdinal(0).get
      }
    }

    def parseBattery_Status_Assessment_ServiceAcquisitionOutcome_Payload(): Battery_Status_Assessment_Service.AcquisitionOutcome_Payload = {
      val r = parseBattery_Status_Assessment_ServiceAcquisitionOutcome_PayloadT(F)
      return r
    }

    def parseBattery_Status_Assessment_ServiceAcquisitionOutcome_PayloadT(typeParsed: B): Battery_Status_Assessment_Service.AcquisitionOutcome_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Status_Assessment_Service.AcquisitionOutcome_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseBattery_Status_Assessment_ServiceAcquisitionOutcomeType()
      parser.parseObjectNext()
      return Battery_Status_Assessment_Service.AcquisitionOutcome_Payload(value)
    }

    def parseBattery_Status_Assessment_ServicePublicationOutcomeType(): Battery_Status_Assessment_Service.PublicationOutcome.Type = {
      val r = parseBattery_Status_Assessment_ServicePublicationOutcomeT(F)
      return r
    }

    def parseBattery_Status_Assessment_ServicePublicationOutcomeT(typeParsed: B): Battery_Status_Assessment_Service.PublicationOutcome.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Status_Assessment_Service.PublicationOutcome")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Battery_Status_Assessment_Service.PublicationOutcome.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Battery_Status_Assessment_Service.PublicationOutcome.")
          return Battery_Status_Assessment_Service.PublicationOutcome.byOrdinal(0).get
      }
    }

    def parseBattery_Status_Assessment_ServicePublicationOutcome_Payload(): Battery_Status_Assessment_Service.PublicationOutcome_Payload = {
      val r = parseBattery_Status_Assessment_ServicePublicationOutcome_PayloadT(F)
      return r
    }

    def parseBattery_Status_Assessment_ServicePublicationOutcome_PayloadT(typeParsed: B): Battery_Status_Assessment_Service.PublicationOutcome_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Status_Assessment_Service.PublicationOutcome_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseBattery_Status_Assessment_ServicePublicationOutcomeType()
      parser.parseObjectNext()
      return Battery_Status_Assessment_Service.PublicationOutcome_Payload(value)
    }

    def parseBattery_Status_Assessment_ServiceAcquisitionDirectiveType(): Battery_Status_Assessment_Service.AcquisitionDirective.Type = {
      val r = parseBattery_Status_Assessment_ServiceAcquisitionDirectiveT(F)
      return r
    }

    def parseBattery_Status_Assessment_ServiceAcquisitionDirectiveT(typeParsed: B): Battery_Status_Assessment_Service.AcquisitionDirective.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Status_Assessment_Service.AcquisitionDirective")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Battery_Status_Assessment_Service.AcquisitionDirective.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Battery_Status_Assessment_Service.AcquisitionDirective.")
          return Battery_Status_Assessment_Service.AcquisitionDirective.byOrdinal(0).get
      }
    }

    def parseBattery_Status_Assessment_ServiceAcquisitionDirective_Payload(): Battery_Status_Assessment_Service.AcquisitionDirective_Payload = {
      val r = parseBattery_Status_Assessment_ServiceAcquisitionDirective_PayloadT(F)
      return r
    }

    def parseBattery_Status_Assessment_ServiceAcquisitionDirective_PayloadT(typeParsed: B): Battery_Status_Assessment_Service.AcquisitionDirective_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Status_Assessment_Service.AcquisitionDirective_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseBattery_Status_Assessment_ServiceAcquisitionDirectiveType()
      parser.parseObjectNext()
      return Battery_Status_Assessment_Service.AcquisitionDirective_Payload(value)
    }

    def parseBattery_Status_Assessment_ServiceAssessmentContextType(): Battery_Status_Assessment_Service.AssessmentContext.Type = {
      val r = parseBattery_Status_Assessment_ServiceAssessmentContextT(F)
      return r
    }

    def parseBattery_Status_Assessment_ServiceAssessmentContextT(typeParsed: B): Battery_Status_Assessment_Service.AssessmentContext.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Status_Assessment_Service.AssessmentContext")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Battery_Status_Assessment_Service.AssessmentContext.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Battery_Status_Assessment_Service.AssessmentContext.")
          return Battery_Status_Assessment_Service.AssessmentContext.byOrdinal(0).get
      }
    }

    def parseBattery_Status_Assessment_ServiceAssessmentContext_Payload(): Battery_Status_Assessment_Service.AssessmentContext_Payload = {
      val r = parseBattery_Status_Assessment_ServiceAssessmentContext_PayloadT(F)
      return r
    }

    def parseBattery_Status_Assessment_ServiceAssessmentContext_PayloadT(typeParsed: B): Battery_Status_Assessment_Service.AssessmentContext_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Status_Assessment_Service.AssessmentContext_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseBattery_Status_Assessment_ServiceAssessmentContextType()
      parser.parseObjectNext()
      return Battery_Status_Assessment_Service.AssessmentContext_Payload(value)
    }

    def parseBattery_Status_Assessment_ServicePublicationDirectiveType(): Battery_Status_Assessment_Service.PublicationDirective.Type = {
      val r = parseBattery_Status_Assessment_ServicePublicationDirectiveT(F)
      return r
    }

    def parseBattery_Status_Assessment_ServicePublicationDirectiveT(typeParsed: B): Battery_Status_Assessment_Service.PublicationDirective.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Status_Assessment_Service.PublicationDirective")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Battery_Status_Assessment_Service.PublicationDirective.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Battery_Status_Assessment_Service.PublicationDirective.")
          return Battery_Status_Assessment_Service.PublicationDirective.byOrdinal(0).get
      }
    }

    def parseBattery_Status_Assessment_ServicePublicationDirective_Payload(): Battery_Status_Assessment_Service.PublicationDirective_Payload = {
      val r = parseBattery_Status_Assessment_ServicePublicationDirective_PayloadT(F)
      return r
    }

    def parseBattery_Status_Assessment_ServicePublicationDirective_PayloadT(typeParsed: B): Battery_Status_Assessment_Service.PublicationDirective_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Status_Assessment_Service.PublicationDirective_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseBattery_Status_Assessment_ServicePublicationDirectiveType()
      parser.parseObjectNext()
      return Battery_Status_Assessment_Service.PublicationDirective_Payload(value)
    }

    def parseBattery_Status_Assessment_ServiceCheckStatusType(): Battery_Status_Assessment_Service.CheckStatus.Type = {
      val r = parseBattery_Status_Assessment_ServiceCheckStatusT(F)
      return r
    }

    def parseBattery_Status_Assessment_ServiceCheckStatusT(typeParsed: B): Battery_Status_Assessment_Service.CheckStatus.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Status_Assessment_Service.CheckStatus")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Battery_Status_Assessment_Service.CheckStatus.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Battery_Status_Assessment_Service.CheckStatus.")
          return Battery_Status_Assessment_Service.CheckStatus.byOrdinal(0).get
      }
    }

    def parseBattery_Status_Assessment_ServiceCheckStatus_Payload(): Battery_Status_Assessment_Service.CheckStatus_Payload = {
      val r = parseBattery_Status_Assessment_ServiceCheckStatus_PayloadT(F)
      return r
    }

    def parseBattery_Status_Assessment_ServiceCheckStatus_PayloadT(typeParsed: B): Battery_Status_Assessment_Service.CheckStatus_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Status_Assessment_Service.CheckStatus_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseBattery_Status_Assessment_ServiceCheckStatusType()
      parser.parseObjectNext()
      return Battery_Status_Assessment_Service.CheckStatus_Payload(value)
    }

    def parseBattery_Status_Assessment_ServiceReportTicketType(): Battery_Status_Assessment_Service.ReportTicket.Type = {
      val r = parseBattery_Status_Assessment_ServiceReportTicketT(F)
      return r
    }

    def parseBattery_Status_Assessment_ServiceReportTicketT(typeParsed: B): Battery_Status_Assessment_Service.ReportTicket.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Status_Assessment_Service.ReportTicket")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Battery_Status_Assessment_Service.ReportTicket.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Battery_Status_Assessment_Service.ReportTicket.")
          return Battery_Status_Assessment_Service.ReportTicket.byOrdinal(0).get
      }
    }

    def parseBattery_Status_Assessment_ServiceReportTicket_Payload(): Battery_Status_Assessment_Service.ReportTicket_Payload = {
      val r = parseBattery_Status_Assessment_ServiceReportTicket_PayloadT(F)
      return r
    }

    def parseBattery_Status_Assessment_ServiceReportTicket_PayloadT(typeParsed: B): Battery_Status_Assessment_Service.ReportTicket_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Status_Assessment_Service.ReportTicket_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseBattery_Status_Assessment_ServiceReportTicketType()
      parser.parseObjectNext()
      return Battery_Status_Assessment_Service.ReportTicket_Payload(value)
    }

    def parseBattery_Status_Assessment_ServiceReportAvailabilityType(): Battery_Status_Assessment_Service.ReportAvailability.Type = {
      val r = parseBattery_Status_Assessment_ServiceReportAvailabilityT(F)
      return r
    }

    def parseBattery_Status_Assessment_ServiceReportAvailabilityT(typeParsed: B): Battery_Status_Assessment_Service.ReportAvailability.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Status_Assessment_Service.ReportAvailability")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Battery_Status_Assessment_Service.ReportAvailability.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Battery_Status_Assessment_Service.ReportAvailability.")
          return Battery_Status_Assessment_Service.ReportAvailability.byOrdinal(0).get
      }
    }

    def parseBattery_Status_Assessment_ServiceReportAvailability_Payload(): Battery_Status_Assessment_Service.ReportAvailability_Payload = {
      val r = parseBattery_Status_Assessment_ServiceReportAvailability_PayloadT(F)
      return r
    }

    def parseBattery_Status_Assessment_ServiceReportAvailability_PayloadT(typeParsed: B): Battery_Status_Assessment_Service.ReportAvailability_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Status_Assessment_Service.ReportAvailability_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseBattery_Status_Assessment_ServiceReportAvailabilityType()
      parser.parseObjectNext()
      return Battery_Status_Assessment_Service.ReportAvailability_Payload(value)
    }

    def parseBattery_Status_Assessment_ServiceCapacityLevelType(): Battery_Status_Assessment_Service.CapacityLevel.Type = {
      val r = parseBattery_Status_Assessment_ServiceCapacityLevelT(F)
      return r
    }

    def parseBattery_Status_Assessment_ServiceCapacityLevelT(typeParsed: B): Battery_Status_Assessment_Service.CapacityLevel.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Status_Assessment_Service.CapacityLevel")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Battery_Status_Assessment_Service.CapacityLevel.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Battery_Status_Assessment_Service.CapacityLevel.")
          return Battery_Status_Assessment_Service.CapacityLevel.byOrdinal(0).get
      }
    }

    def parseBattery_Status_Assessment_ServiceCapacityLevel_Payload(): Battery_Status_Assessment_Service.CapacityLevel_Payload = {
      val r = parseBattery_Status_Assessment_ServiceCapacityLevel_PayloadT(F)
      return r
    }

    def parseBattery_Status_Assessment_ServiceCapacityLevel_PayloadT(typeParsed: B): Battery_Status_Assessment_Service.CapacityLevel_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Status_Assessment_Service.CapacityLevel_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseBattery_Status_Assessment_ServiceCapacityLevelType()
      parser.parseObjectNext()
      return Battery_Status_Assessment_Service.CapacityLevel_Payload(value)
    }

    def parseBattery_Status_Assessment_ServiceReportQualityType(): Battery_Status_Assessment_Service.ReportQuality.Type = {
      val r = parseBattery_Status_Assessment_ServiceReportQualityT(F)
      return r
    }

    def parseBattery_Status_Assessment_ServiceReportQualityT(typeParsed: B): Battery_Status_Assessment_Service.ReportQuality.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Status_Assessment_Service.ReportQuality")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Battery_Status_Assessment_Service.ReportQuality.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Battery_Status_Assessment_Service.ReportQuality.")
          return Battery_Status_Assessment_Service.ReportQuality.byOrdinal(0).get
      }
    }

    def parseBattery_Status_Assessment_ServiceReportQuality_Payload(): Battery_Status_Assessment_Service.ReportQuality_Payload = {
      val r = parseBattery_Status_Assessment_ServiceReportQuality_PayloadT(F)
      return r
    }

    def parseBattery_Status_Assessment_ServiceReportQuality_PayloadT(typeParsed: B): Battery_Status_Assessment_Service.ReportQuality_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Status_Assessment_Service.ReportQuality_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseBattery_Status_Assessment_ServiceReportQualityType()
      parser.parseObjectNext()
      return Battery_Status_Assessment_Service.ReportQuality_Payload(value)
    }

    def parseBattery_Status_Assessment_ServiceStatusReadRequestType(): Battery_Status_Assessment_Service.StatusReadRequest.Type = {
      val r = parseBattery_Status_Assessment_ServiceStatusReadRequestT(F)
      return r
    }

    def parseBattery_Status_Assessment_ServiceStatusReadRequestT(typeParsed: B): Battery_Status_Assessment_Service.StatusReadRequest.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Status_Assessment_Service.StatusReadRequest")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Battery_Status_Assessment_Service.StatusReadRequest.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Battery_Status_Assessment_Service.StatusReadRequest.")
          return Battery_Status_Assessment_Service.StatusReadRequest.byOrdinal(0).get
      }
    }

    def parseBattery_Status_Assessment_ServiceStatusReadRequest_Payload(): Battery_Status_Assessment_Service.StatusReadRequest_Payload = {
      val r = parseBattery_Status_Assessment_ServiceStatusReadRequest_PayloadT(F)
      return r
    }

    def parseBattery_Status_Assessment_ServiceStatusReadRequest_PayloadT(typeParsed: B): Battery_Status_Assessment_Service.StatusReadRequest_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Status_Assessment_Service.StatusReadRequest_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseBattery_Status_Assessment_ServiceStatusReadRequestType()
      parser.parseObjectNext()
      return Battery_Status_Assessment_Service.StatusReadRequest_Payload(value)
    }

    def parseBattery_Status_Assessment_ServiceQualifiedEvidenceType(): Battery_Status_Assessment_Service.QualifiedEvidence.Type = {
      val r = parseBattery_Status_Assessment_ServiceQualifiedEvidenceT(F)
      return r
    }

    def parseBattery_Status_Assessment_ServiceQualifiedEvidenceT(typeParsed: B): Battery_Status_Assessment_Service.QualifiedEvidence.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Status_Assessment_Service.QualifiedEvidence")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Battery_Status_Assessment_Service.QualifiedEvidence.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Battery_Status_Assessment_Service.QualifiedEvidence.")
          return Battery_Status_Assessment_Service.QualifiedEvidence.byOrdinal(0).get
      }
    }

    def parseBattery_Status_Assessment_ServiceQualifiedEvidence_Payload(): Battery_Status_Assessment_Service.QualifiedEvidence_Payload = {
      val r = parseBattery_Status_Assessment_ServiceQualifiedEvidence_PayloadT(F)
      return r
    }

    def parseBattery_Status_Assessment_ServiceQualifiedEvidence_PayloadT(typeParsed: B): Battery_Status_Assessment_Service.QualifiedEvidence_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Status_Assessment_Service.QualifiedEvidence_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseBattery_Status_Assessment_ServiceQualifiedEvidenceType()
      parser.parseObjectNext()
      return Battery_Status_Assessment_Service.QualifiedEvidence_Payload(value)
    }

    def parseBattery_Status_Assessment_ServiceAssessmentResultType(): Battery_Status_Assessment_Service.AssessmentResult.Type = {
      val r = parseBattery_Status_Assessment_ServiceAssessmentResultT(F)
      return r
    }

    def parseBattery_Status_Assessment_ServiceAssessmentResultT(typeParsed: B): Battery_Status_Assessment_Service.AssessmentResult.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Status_Assessment_Service.AssessmentResult")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Battery_Status_Assessment_Service.AssessmentResult.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Battery_Status_Assessment_Service.AssessmentResult.")
          return Battery_Status_Assessment_Service.AssessmentResult.byOrdinal(0).get
      }
    }

    def parseBattery_Status_Assessment_ServiceAssessmentResult_Payload(): Battery_Status_Assessment_Service.AssessmentResult_Payload = {
      val r = parseBattery_Status_Assessment_ServiceAssessmentResult_PayloadT(F)
      return r
    }

    def parseBattery_Status_Assessment_ServiceAssessmentResult_PayloadT(typeParsed: B): Battery_Status_Assessment_Service.AssessmentResult_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Status_Assessment_Service.AssessmentResult_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseBattery_Status_Assessment_ServiceAssessmentResultType()
      parser.parseObjectNext()
      return Battery_Status_Assessment_Service.AssessmentResult_Payload(value)
    }

    def parseBattery_Status_Assessment_ServiceFeedbackTicketType(): Battery_Status_Assessment_Service.FeedbackTicket.Type = {
      val r = parseBattery_Status_Assessment_ServiceFeedbackTicketT(F)
      return r
    }

    def parseBattery_Status_Assessment_ServiceFeedbackTicketT(typeParsed: B): Battery_Status_Assessment_Service.FeedbackTicket.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Status_Assessment_Service.FeedbackTicket")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Battery_Status_Assessment_Service.FeedbackTicket.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Battery_Status_Assessment_Service.FeedbackTicket.")
          return Battery_Status_Assessment_Service.FeedbackTicket.byOrdinal(0).get
      }
    }

    def parseBattery_Status_Assessment_ServiceFeedbackTicket_Payload(): Battery_Status_Assessment_Service.FeedbackTicket_Payload = {
      val r = parseBattery_Status_Assessment_ServiceFeedbackTicket_PayloadT(F)
      return r
    }

    def parseBattery_Status_Assessment_ServiceFeedbackTicket_PayloadT(typeParsed: B): Battery_Status_Assessment_Service.FeedbackTicket_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Status_Assessment_Service.FeedbackTicket_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseBattery_Status_Assessment_ServiceFeedbackTicketType()
      parser.parseObjectNext()
      return Battery_Status_Assessment_Service.FeedbackTicket_Payload(value)
    }

    def parseBattery_Status_Assessment_ServiceUseDispositionType(): Battery_Status_Assessment_Service.UseDisposition.Type = {
      val r = parseBattery_Status_Assessment_ServiceUseDispositionT(F)
      return r
    }

    def parseBattery_Status_Assessment_ServiceUseDispositionT(typeParsed: B): Battery_Status_Assessment_Service.UseDisposition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Status_Assessment_Service.UseDisposition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Battery_Status_Assessment_Service.UseDisposition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Battery_Status_Assessment_Service.UseDisposition.")
          return Battery_Status_Assessment_Service.UseDisposition.byOrdinal(0).get
      }
    }

    def parseBattery_Status_Assessment_ServiceUseDisposition_Payload(): Battery_Status_Assessment_Service.UseDisposition_Payload = {
      val r = parseBattery_Status_Assessment_ServiceUseDisposition_PayloadT(F)
      return r
    }

    def parseBattery_Status_Assessment_ServiceUseDisposition_PayloadT(typeParsed: B): Battery_Status_Assessment_Service.UseDisposition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Status_Assessment_Service.UseDisposition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseBattery_Status_Assessment_ServiceUseDispositionType()
      parser.parseObjectNext()
      return Battery_Status_Assessment_Service.UseDisposition_Payload(value)
    }

    def parseBattery_Status_Assessment_ServiceCheckRequest(): Battery_Status_Assessment_Service.CheckRequest = {
      val r = parseBattery_Status_Assessment_ServiceCheckRequestT(F)
      return r
    }

    def parseBattery_Status_Assessment_ServiceCheckRequestT(typeParsed: B): Battery_Status_Assessment_Service.CheckRequest = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Status_Assessment_Service.CheckRequest")
      }
      parser.parseObjectKey("command")
      val command = parseBattery_Status_Assessment_ServiceCheckCommandType()
      parser.parseObjectNext()
      parser.parseObjectKey("token")
      val token = parseBattery_Status_Assessment_ServiceCheckTokenType()
      parser.parseObjectNext()
      return Battery_Status_Assessment_Service.CheckRequest(command, token)
    }

    def parseBattery_Status_Assessment_ServiceCheckRequest_Payload(): Battery_Status_Assessment_Service.CheckRequest_Payload = {
      val r = parseBattery_Status_Assessment_ServiceCheckRequest_PayloadT(F)
      return r
    }

    def parseBattery_Status_Assessment_ServiceCheckRequest_PayloadT(typeParsed: B): Battery_Status_Assessment_Service.CheckRequest_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Status_Assessment_Service.CheckRequest_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseBattery_Status_Assessment_ServiceCheckRequest()
      parser.parseObjectNext()
      return Battery_Status_Assessment_Service.CheckRequest_Payload(value)
    }

    def parseBattery_Status_Assessment_ServiceBatteryReport(): Battery_Status_Assessment_Service.BatteryReport = {
      val r = parseBattery_Status_Assessment_ServiceBatteryReportT(F)
      return r
    }

    def parseBattery_Status_Assessment_ServiceBatteryReportT(typeParsed: B): Battery_Status_Assessment_Service.BatteryReport = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Status_Assessment_Service.BatteryReport")
      }
      parser.parseObjectKey("ticket")
      val ticket = parseBattery_Status_Assessment_ServiceReportTicketType()
      parser.parseObjectNext()
      parser.parseObjectKey("availability")
      val availability = parseBattery_Status_Assessment_ServiceReportAvailabilityType()
      parser.parseObjectNext()
      parser.parseObjectKey("level")
      val level = parseBattery_Status_Assessment_ServiceCapacityLevelType()
      parser.parseObjectNext()
      parser.parseObjectKey("quality")
      val quality = parseBattery_Status_Assessment_ServiceReportQualityType()
      parser.parseObjectNext()
      return Battery_Status_Assessment_Service.BatteryReport(ticket, availability, level, quality)
    }

    def parseBattery_Status_Assessment_ServiceBatteryReport_Payload(): Battery_Status_Assessment_Service.BatteryReport_Payload = {
      val r = parseBattery_Status_Assessment_ServiceBatteryReport_PayloadT(F)
      return r
    }

    def parseBattery_Status_Assessment_ServiceBatteryReport_PayloadT(typeParsed: B): Battery_Status_Assessment_Service.BatteryReport_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Status_Assessment_Service.BatteryReport_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseBattery_Status_Assessment_ServiceBatteryReport()
      parser.parseObjectNext()
      return Battery_Status_Assessment_Service.BatteryReport_Payload(value)
    }

    def parseBattery_Status_Assessment_ServiceCapturedReport(): Battery_Status_Assessment_Service.CapturedReport = {
      val r = parseBattery_Status_Assessment_ServiceCapturedReportT(F)
      return r
    }

    def parseBattery_Status_Assessment_ServiceCapturedReportT(typeParsed: B): Battery_Status_Assessment_Service.CapturedReport = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Status_Assessment_Service.CapturedReport")
      }
      parser.parseObjectKey("ticket")
      val ticket = parseBattery_Status_Assessment_ServiceReportTicketType()
      parser.parseObjectNext()
      parser.parseObjectKey("availability")
      val availability = parseBattery_Status_Assessment_ServiceReportAvailabilityType()
      parser.parseObjectNext()
      parser.parseObjectKey("level")
      val level = parseBattery_Status_Assessment_ServiceCapacityLevelType()
      parser.parseObjectNext()
      parser.parseObjectKey("quality")
      val quality = parseBattery_Status_Assessment_ServiceReportQualityType()
      parser.parseObjectNext()
      return Battery_Status_Assessment_Service.CapturedReport(ticket, availability, level, quality)
    }

    def parseBattery_Status_Assessment_ServiceCapturedReport_Payload(): Battery_Status_Assessment_Service.CapturedReport_Payload = {
      val r = parseBattery_Status_Assessment_ServiceCapturedReport_PayloadT(F)
      return r
    }

    def parseBattery_Status_Assessment_ServiceCapturedReport_PayloadT(typeParsed: B): Battery_Status_Assessment_Service.CapturedReport_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Status_Assessment_Service.CapturedReport_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseBattery_Status_Assessment_ServiceCapturedReport()
      parser.parseObjectNext()
      return Battery_Status_Assessment_Service.CapturedReport_Payload(value)
    }

    def parseBattery_Status_Assessment_ServiceTaggedQualifiedEvidence(): Battery_Status_Assessment_Service.TaggedQualifiedEvidence = {
      val r = parseBattery_Status_Assessment_ServiceTaggedQualifiedEvidenceT(F)
      return r
    }

    def parseBattery_Status_Assessment_ServiceTaggedQualifiedEvidenceT(typeParsed: B): Battery_Status_Assessment_Service.TaggedQualifiedEvidence = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Status_Assessment_Service.TaggedQualifiedEvidence")
      }
      parser.parseObjectKey("ticket")
      val ticket = parseBattery_Status_Assessment_ServiceReportTicketType()
      parser.parseObjectNext()
      parser.parseObjectKey("evidence")
      val evidence = parseBattery_Status_Assessment_ServiceQualifiedEvidenceType()
      parser.parseObjectNext()
      return Battery_Status_Assessment_Service.TaggedQualifiedEvidence(ticket, evidence)
    }

    def parseBattery_Status_Assessment_ServiceTaggedQualifiedEvidence_Payload(): Battery_Status_Assessment_Service.TaggedQualifiedEvidence_Payload = {
      val r = parseBattery_Status_Assessment_ServiceTaggedQualifiedEvidence_PayloadT(F)
      return r
    }

    def parseBattery_Status_Assessment_ServiceTaggedQualifiedEvidence_PayloadT(typeParsed: B): Battery_Status_Assessment_Service.TaggedQualifiedEvidence_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Status_Assessment_Service.TaggedQualifiedEvidence_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseBattery_Status_Assessment_ServiceTaggedQualifiedEvidence()
      parser.parseObjectNext()
      return Battery_Status_Assessment_Service.TaggedQualifiedEvidence_Payload(value)
    }

    def parseBattery_Status_Assessment_ServiceTaggedAssessment(): Battery_Status_Assessment_Service.TaggedAssessment = {
      val r = parseBattery_Status_Assessment_ServiceTaggedAssessmentT(F)
      return r
    }

    def parseBattery_Status_Assessment_ServiceTaggedAssessmentT(typeParsed: B): Battery_Status_Assessment_Service.TaggedAssessment = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Status_Assessment_Service.TaggedAssessment")
      }
      parser.parseObjectKey("ticket")
      val ticket = parseBattery_Status_Assessment_ServiceReportTicketType()
      parser.parseObjectNext()
      parser.parseObjectKey("result")
      val result = parseBattery_Status_Assessment_ServiceAssessmentResultType()
      parser.parseObjectNext()
      return Battery_Status_Assessment_Service.TaggedAssessment(ticket, result)
    }

    def parseBattery_Status_Assessment_ServiceTaggedAssessment_Payload(): Battery_Status_Assessment_Service.TaggedAssessment_Payload = {
      val r = parseBattery_Status_Assessment_ServiceTaggedAssessment_PayloadT(F)
      return r
    }

    def parseBattery_Status_Assessment_ServiceTaggedAssessment_PayloadT(typeParsed: B): Battery_Status_Assessment_Service.TaggedAssessment_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Status_Assessment_Service.TaggedAssessment_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseBattery_Status_Assessment_ServiceTaggedAssessment()
      parser.parseObjectNext()
      return Battery_Status_Assessment_Service.TaggedAssessment_Payload(value)
    }

    def parseBattery_Status_Assessment_ServiceControlUseFeedback(): Battery_Status_Assessment_Service.ControlUseFeedback = {
      val r = parseBattery_Status_Assessment_ServiceControlUseFeedbackT(F)
      return r
    }

    def parseBattery_Status_Assessment_ServiceControlUseFeedbackT(typeParsed: B): Battery_Status_Assessment_Service.ControlUseFeedback = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Status_Assessment_Service.ControlUseFeedback")
      }
      parser.parseObjectKey("ticket")
      val ticket = parseBattery_Status_Assessment_ServiceFeedbackTicketType()
      parser.parseObjectNext()
      parser.parseObjectKey("disposition")
      val disposition = parseBattery_Status_Assessment_ServiceUseDispositionType()
      parser.parseObjectNext()
      return Battery_Status_Assessment_Service.ControlUseFeedback(ticket, disposition)
    }

    def parseBattery_Status_Assessment_ServiceControlUseFeedback_Payload(): Battery_Status_Assessment_Service.ControlUseFeedback_Payload = {
      val r = parseBattery_Status_Assessment_ServiceControlUseFeedback_PayloadT(F)
      return r
    }

    def parseBattery_Status_Assessment_ServiceControlUseFeedback_PayloadT(typeParsed: B): Battery_Status_Assessment_Service.ControlUseFeedback_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Status_Assessment_Service.ControlUseFeedback_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseBattery_Status_Assessment_ServiceControlUseFeedback()
      parser.parseObjectNext()
      return Battery_Status_Assessment_Service.ControlUseFeedback_Payload(value)
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

    def parseBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container(): Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P", "Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS"))
      t.native match {
        case "Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P" => val r = parseBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PT(T); return r
        case "Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS" => val r = parseBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PST(T); return r
        case _ => val r = parseBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PST(T); return r
      }
    }

    def parseBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P(): Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P = {
      val r = parseBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PT(F)
      return r
    }

    def parseBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PT(typeParsed: B): Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P")
      }
      parser.parseObjectKey("api_acquisition_outcome")
      val api_acquisition_outcome = parseBattery_Status_Assessment_ServiceAcquisitionOutcomeType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_check_request")
      val api_check_request = parseBattery_Status_Assessment_ServiceCheckRequest()
      parser.parseObjectNext()
      parser.parseObjectKey("api_publication_outcome")
      val api_publication_outcome = parseBattery_Status_Assessment_ServicePublicationOutcomeType()
      parser.parseObjectNext()
      return Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P(api_acquisition_outcome, api_check_request, api_publication_outcome)
    }

    def parseBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS(): Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS = {
      val r = parseBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PST(F)
      return r
    }

    def parseBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PST(typeParsed: B): Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS")
      }
      parser.parseObjectKey("api_acquisition_outcome")
      val api_acquisition_outcome = parseBattery_Status_Assessment_ServiceAcquisitionOutcomeType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_check_request")
      val api_check_request = parseBattery_Status_Assessment_ServiceCheckRequest()
      parser.parseObjectNext()
      parser.parseObjectKey("api_publication_outcome")
      val api_publication_outcome = parseBattery_Status_Assessment_ServicePublicationOutcomeType()
      parser.parseObjectNext()
      return Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS(api_acquisition_outcome, api_check_request, api_publication_outcome)
    }

    def parseBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container(): Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P", "Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS"))
      t.native match {
        case "Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P" => val r = parseBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PT(T); return r
        case "Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS" => val r = parseBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PST(T); return r
        case _ => val r = parseBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PST(T); return r
      }
    }

    def parseBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P(): Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P = {
      val r = parseBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PT(F)
      return r
    }

    def parseBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PT(typeParsed: B): Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P")
      }
      parser.parseObjectKey("api_acquisition_directive")
      val api_acquisition_directive = parseBattery_Status_Assessment_ServiceAcquisitionDirectiveType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_assessment_context")
      val api_assessment_context = parseBattery_Status_Assessment_ServiceAssessmentContextType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_check_status")
      val api_check_status = parseBattery_Status_Assessment_ServiceCheckStatusType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_publication_directive")
      val api_publication_directive = parseBattery_Status_Assessment_ServicePublicationDirectiveType()
      parser.parseObjectNext()
      return Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P(api_acquisition_directive, api_assessment_context, api_check_status, api_publication_directive)
    }

    def parseBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS(): Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS = {
      val r = parseBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PST(F)
      return r
    }

    def parseBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PST(typeParsed: B): Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS")
      }
      parser.parseObjectKey("api_acquisition_directive")
      val api_acquisition_directive = parseBattery_Status_Assessment_ServiceAcquisitionDirectiveType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_assessment_context")
      val api_assessment_context = parseBattery_Status_Assessment_ServiceAssessmentContextType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_check_status")
      val api_check_status = parseBattery_Status_Assessment_ServiceCheckStatusType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_publication_directive")
      val api_publication_directive = parseBattery_Status_Assessment_ServicePublicationDirectiveType()
      parser.parseObjectNext()
      return Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS(api_acquisition_directive, api_assessment_context, api_check_status, api_publication_directive)
    }

    def parseBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container(): Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P", "Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS"))
      t.native match {
        case "Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P" => val r = parseBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PT(T); return r
        case "Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS" => val r = parseBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PST(T); return r
        case _ => val r = parseBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PST(T); return r
      }
    }

    def parseBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P(): Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P = {
      val r = parseBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PT(F)
      return r
    }

    def parseBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PT(typeParsed: B): Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P")
      }
      parser.parseObjectKey("api_acquisition_directive")
      val api_acquisition_directive = parseBattery_Status_Assessment_ServiceAcquisitionDirectiveType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_battery_report")
      val api_battery_report = parseBattery_Status_Assessment_ServiceBatteryReport()
      parser.parseObjectNext()
      return Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P(api_acquisition_directive, api_battery_report)
    }

    def parseBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS(): Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS = {
      val r = parseBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PST(F)
      return r
    }

    def parseBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PST(typeParsed: B): Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS")
      }
      parser.parseObjectKey("api_acquisition_directive")
      val api_acquisition_directive = parseBattery_Status_Assessment_ServiceAcquisitionDirectiveType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_battery_report")
      val api_battery_report = parseBattery_Status_Assessment_ServiceBatteryReport()
      parser.parseObjectNext()
      return Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS(api_acquisition_directive, api_battery_report)
    }

    def parseBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container(): Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P", "Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS"))
      t.native match {
        case "Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P" => val r = parseBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PT(T); return r
        case "Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS" => val r = parseBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PST(T); return r
        case _ => val r = parseBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PST(T); return r
      }
    }

    def parseBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P(): Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P = {
      val r = parseBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PT(F)
      return r
    }

    def parseBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PT(typeParsed: B): Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P")
      }
      parser.parseObjectKey("api_acquisition_outcome")
      val api_acquisition_outcome = parseBattery_Status_Assessment_ServiceAcquisitionOutcomeType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_captured_report")
      val api_captured_report = parseBattery_Status_Assessment_ServiceCapturedReport()
      parser.parseObjectNext()
      parser.parseObjectKey("api_status_read_request")
      val api_status_read_request = parseBattery_Status_Assessment_ServiceStatusReadRequestType()
      parser.parseObjectNext()
      return Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P(api_acquisition_outcome, api_captured_report, api_status_read_request)
    }

    def parseBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS(): Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS = {
      val r = parseBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PST(F)
      return r
    }

    def parseBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PST(typeParsed: B): Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS")
      }
      parser.parseObjectKey("api_acquisition_outcome")
      val api_acquisition_outcome = parseBattery_Status_Assessment_ServiceAcquisitionOutcomeType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_captured_report")
      val api_captured_report = parseBattery_Status_Assessment_ServiceCapturedReport()
      parser.parseObjectNext()
      parser.parseObjectKey("api_status_read_request")
      val api_status_read_request = parseBattery_Status_Assessment_ServiceStatusReadRequestType()
      parser.parseObjectNext()
      return Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS(api_acquisition_outcome, api_captured_report, api_status_read_request)
    }

    def parseBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container(): Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container_P", "Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS"))
      t.native match {
        case "Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container_P" => val r = parseBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PT(T); return r
        case "Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS" => val r = parseBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PST(T); return r
        case _ => val r = parseBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PST(T); return r
      }
    }

    def parseBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_P(): Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container_P = {
      val r = parseBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PT(F)
      return r
    }

    def parseBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PT(typeParsed: B): Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container_P")
      }
      parser.parseObjectKey("api_captured_report")
      val api_captured_report = parseBattery_Status_Assessment_ServiceCapturedReport()
      parser.parseObjectNext()
      return Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container_P(api_captured_report)
    }

    def parseBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS(): Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS = {
      val r = parseBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PST(F)
      return r
    }

    def parseBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PST(typeParsed: B): Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS")
      }
      parser.parseObjectKey("api_captured_report")
      val api_captured_report = parseBattery_Status_Assessment_ServiceCapturedReport()
      parser.parseObjectNext()
      return Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS(api_captured_report)
    }

    def parseBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container(): Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container_P", "Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS"))
      t.native match {
        case "Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container_P" => val r = parseBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PT(T); return r
        case "Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS" => val r = parseBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PST(T); return r
        case _ => val r = parseBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PST(T); return r
      }
    }

    def parseBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_P(): Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container_P = {
      val r = parseBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PT(F)
      return r
    }

    def parseBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PT(typeParsed: B): Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container_P")
      }
      parser.parseObjectKey("api_qualified_evidence")
      val api_qualified_evidence = parseBattery_Status_Assessment_ServiceTaggedQualifiedEvidence()
      parser.parseObjectNext()
      return Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container_P(api_qualified_evidence)
    }

    def parseBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS(): Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS = {
      val r = parseBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PST(F)
      return r
    }

    def parseBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PST(typeParsed: B): Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS")
      }
      parser.parseObjectKey("api_qualified_evidence")
      val api_qualified_evidence = parseBattery_Status_Assessment_ServiceTaggedQualifiedEvidence()
      parser.parseObjectNext()
      return Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS(api_qualified_evidence)
    }

    def parseBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container(): Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P", "Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS"))
      t.native match {
        case "Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P" => val r = parseBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PT(T); return r
        case "Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS" => val r = parseBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PST(T); return r
        case _ => val r = parseBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PST(T); return r
      }
    }

    def parseBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P(): Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P = {
      val r = parseBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PT(F)
      return r
    }

    def parseBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PT(typeParsed: B): Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P")
      }
      parser.parseObjectKey("api_assessment_context")
      val api_assessment_context = parseBattery_Status_Assessment_ServiceAssessmentContextType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_qualified_evidence")
      val api_qualified_evidence = parseBattery_Status_Assessment_ServiceTaggedQualifiedEvidence()
      parser.parseObjectNext()
      return Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P(api_assessment_context, api_qualified_evidence)
    }

    def parseBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS(): Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS = {
      val r = parseBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PST(F)
      return r
    }

    def parseBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PST(typeParsed: B): Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS")
      }
      parser.parseObjectKey("api_assessment_context")
      val api_assessment_context = parseBattery_Status_Assessment_ServiceAssessmentContextType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_qualified_evidence")
      val api_qualified_evidence = parseBattery_Status_Assessment_ServiceTaggedQualifiedEvidence()
      parser.parseObjectNext()
      return Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS(api_assessment_context, api_qualified_evidence)
    }

    def parseBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container(): Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P", "Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS"))
      t.native match {
        case "Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P" => val r = parseBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PT(T); return r
        case "Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS" => val r = parseBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PST(T); return r
        case _ => val r = parseBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PST(T); return r
      }
    }

    def parseBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P(): Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P = {
      val r = parseBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PT(F)
      return r
    }

    def parseBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PT(typeParsed: B): Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P")
      }
      parser.parseObjectKey("api_decision_assessment")
      val api_decision_assessment = parseBattery_Status_Assessment_ServiceTaggedAssessment()
      parser.parseObjectNext()
      return Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P(api_decision_assessment)
    }

    def parseBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS(): Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS = {
      val r = parseBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PST(F)
      return r
    }

    def parseBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PST(typeParsed: B): Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS")
      }
      parser.parseObjectKey("api_decision_assessment")
      val api_decision_assessment = parseBattery_Status_Assessment_ServiceTaggedAssessment()
      parser.parseObjectNext()
      return Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS(api_decision_assessment)
    }

    def parseBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container(): Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container_P", "Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container_PS"))
      t.native match {
        case "Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container_P" => val r = parseBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PT(T); return r
        case "Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container_PS" => val r = parseBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PST(T); return r
        case _ => val r = parseBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PST(T); return r
      }
    }

    def parseBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_P(): Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container_P = {
      val r = parseBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PT(F)
      return r
    }

    def parseBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PT(typeParsed: B): Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container_P")
      }
      parser.parseObjectKey("api_control_use_feedback")
      val api_control_use_feedback = parseBattery_Status_Assessment_ServiceControlUseFeedback()
      parser.parseObjectNext()
      parser.parseObjectKey("api_decision_assessment")
      val api_decision_assessment = parseBattery_Status_Assessment_ServiceTaggedAssessment()
      parser.parseObjectNext()
      parser.parseObjectKey("api_publication_directive")
      val api_publication_directive = parseBattery_Status_Assessment_ServicePublicationDirectiveType()
      parser.parseObjectNext()
      return Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container_P(api_control_use_feedback, api_decision_assessment, api_publication_directive)
    }

    def parseBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PS(): Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container_PS = {
      val r = parseBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PST(F)
      return r
    }

    def parseBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PST(typeParsed: B): Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container_PS")
      }
      parser.parseObjectKey("api_control_use_feedback")
      val api_control_use_feedback = parseBattery_Status_Assessment_ServiceControlUseFeedback()
      parser.parseObjectNext()
      parser.parseObjectKey("api_decision_assessment")
      val api_decision_assessment = parseBattery_Status_Assessment_ServiceTaggedAssessment()
      parser.parseObjectNext()
      parser.parseObjectKey("api_publication_directive")
      val api_publication_directive = parseBattery_Status_Assessment_ServicePublicationDirectiveType()
      parser.parseObjectNext()
      return Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container_PS(api_control_use_feedback, api_decision_assessment, api_publication_directive)
    }

    def parseBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container(): Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container_P", "Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container_PS"))
      t.native match {
        case "Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container_P" => val r = parseBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PT(T); return r
        case "Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container_PS" => val r = parseBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PST(T); return r
        case _ => val r = parseBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PST(T); return r
      }
    }

    def parseBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_P(): Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container_P = {
      val r = parseBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PT(F)
      return r
    }

    def parseBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PT(typeParsed: B): Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container_P")
      }
      parser.parseObjectKey("api_battery_assessment")
      val api_battery_assessment = parseBattery_Status_Assessment_ServiceTaggedAssessment()
      parser.parseObjectNext()
      parser.parseObjectKey("api_publication_outcome")
      val api_publication_outcome = parseBattery_Status_Assessment_ServicePublicationOutcomeType()
      parser.parseObjectNext()
      return Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container_P(api_battery_assessment, api_publication_outcome)
    }

    def parseBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PS(): Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container_PS = {
      val r = parseBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PST(F)
      return r
    }

    def parseBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PST(typeParsed: B): Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container_PS")
      }
      parser.parseObjectKey("api_battery_assessment")
      val api_battery_assessment = parseBattery_Status_Assessment_ServiceTaggedAssessment()
      parser.parseObjectNext()
      parser.parseObjectKey("api_publication_outcome")
      val api_publication_outcome = parseBattery_Status_Assessment_ServicePublicationOutcomeType()
      parser.parseObjectNext()
      return Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container_PS(api_battery_assessment, api_publication_outcome)
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
      val t = parser.parseObjectTypes(ISZ("util.EmptyContainer", "Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container_P", "Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container_PS", "Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container_P", "Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container_PS", "Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P", "Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS", "Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P", "Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS", "Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P", "Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS", "Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P", "Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS", "Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P", "Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS", "Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P", "Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS", "Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container_P", "Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS", "Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container_P", "Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS"))
      t.native match {
        case "util.EmptyContainer" => val r = parseutilEmptyContainerT(T); return r
        case "Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container_P" => val r = parseBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PT(T); return r
        case "Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container_PS" => val r = parseBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PST(T); return r
        case "Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container_P" => val r = parseBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PT(T); return r
        case "Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container_PS" => val r = parseBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PST(T); return r
        case "Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P" => val r = parseBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PT(T); return r
        case "Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS" => val r = parseBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PST(T); return r
        case "Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P" => val r = parseBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PT(T); return r
        case "Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS" => val r = parseBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PST(T); return r
        case "Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P" => val r = parseBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PT(T); return r
        case "Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS" => val r = parseBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PST(T); return r
        case "Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P" => val r = parseBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PT(T); return r
        case "Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS" => val r = parseBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PST(T); return r
        case "Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P" => val r = parseBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PT(T); return r
        case "Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS" => val r = parseBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PST(T); return r
        case "Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P" => val r = parseBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PT(T); return r
        case "Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS" => val r = parseBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PST(T); return r
        case "Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container_P" => val r = parseBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PT(T); return r
        case "Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS" => val r = parseBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PST(T); return r
        case "Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container_P" => val r = parseBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PT(T); return r
        case "Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS" => val r = parseBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PST(T); return r
        case _ => val r = parseBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PST(T); return r
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
      val t = parser.parseObjectTypes(ISZ("art.Empty", "Base_Types.Boolean_Payload", "Base_Types.Integer_Payload", "Base_Types.Integer_8_Payload", "Base_Types.Integer_16_Payload", "Base_Types.Integer_32_Payload", "Base_Types.Integer_64_Payload", "Base_Types.Unsigned_8_Payload", "Base_Types.Unsigned_16_Payload", "Base_Types.Unsigned_32_Payload", "Base_Types.Unsigned_64_Payload", "Base_Types.Float_Payload", "Base_Types.Float_32_Payload", "Base_Types.Float_64_Payload", "Base_Types.Character_Payload", "Base_Types.String_Payload", "Base_Types.Bits_Payload", "util.EmptyContainer", "Battery_Status_Assessment_Service.CheckToken_Payload", "Battery_Status_Assessment_Service.CheckStatus_Payload", "Battery_Status_Assessment_Service.ReportTicket_Payload", "Battery_Status_Assessment_Service.CheckCommand_Payload", "Battery_Status_Assessment_Service.CheckRequest_Payload", "Battery_Status_Assessment_Service.ReportQuality_Payload", "Battery_Status_Assessment_Service.CapacityLevel_Payload", "Battery_Status_Assessment_Service.BatteryReport_Payload", "Battery_Status_Assessment_Service.FeedbackTicket_Payload", "Battery_Status_Assessment_Service.UseDisposition_Payload", "Battery_Status_Assessment_Service.CapturedReport_Payload", "Battery_Status_Assessment_Service.AssessmentResult_Payload", "Battery_Status_Assessment_Service.TaggedAssessment_Payload", "Battery_Status_Assessment_Service.StatusReadRequest_Payload", "Battery_Status_Assessment_Service.AssessmentContext_Payload", "Battery_Status_Assessment_Service.QualifiedEvidence_Payload", "Battery_Status_Assessment_Service.ReportAvailability_Payload", "Battery_Status_Assessment_Service.AcquisitionOutcome_Payload", "Battery_Status_Assessment_Service.PublicationOutcome_Payload", "Battery_Status_Assessment_Service.ControlUseFeedback_Payload", "Battery_Status_Assessment_Service.AcquisitionDirective_Payload", "Battery_Status_Assessment_Service.PublicationDirective_Payload", "Battery_Status_Assessment_Service.TaggedQualifiedEvidence_Payload", "Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container_P", "Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container_PS", "Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container_P", "Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container_PS", "Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P", "Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS", "Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P", "Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS", "Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P", "Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS", "Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P", "Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS", "Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P", "Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS", "Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P", "Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS", "Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container_P", "Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS", "Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container_P", "Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS"))
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
        case "Battery_Status_Assessment_Service.CheckToken_Payload" => val r = parseBattery_Status_Assessment_ServiceCheckToken_PayloadT(T); return r
        case "Battery_Status_Assessment_Service.CheckStatus_Payload" => val r = parseBattery_Status_Assessment_ServiceCheckStatus_PayloadT(T); return r
        case "Battery_Status_Assessment_Service.ReportTicket_Payload" => val r = parseBattery_Status_Assessment_ServiceReportTicket_PayloadT(T); return r
        case "Battery_Status_Assessment_Service.CheckCommand_Payload" => val r = parseBattery_Status_Assessment_ServiceCheckCommand_PayloadT(T); return r
        case "Battery_Status_Assessment_Service.CheckRequest_Payload" => val r = parseBattery_Status_Assessment_ServiceCheckRequest_PayloadT(T); return r
        case "Battery_Status_Assessment_Service.ReportQuality_Payload" => val r = parseBattery_Status_Assessment_ServiceReportQuality_PayloadT(T); return r
        case "Battery_Status_Assessment_Service.CapacityLevel_Payload" => val r = parseBattery_Status_Assessment_ServiceCapacityLevel_PayloadT(T); return r
        case "Battery_Status_Assessment_Service.BatteryReport_Payload" => val r = parseBattery_Status_Assessment_ServiceBatteryReport_PayloadT(T); return r
        case "Battery_Status_Assessment_Service.FeedbackTicket_Payload" => val r = parseBattery_Status_Assessment_ServiceFeedbackTicket_PayloadT(T); return r
        case "Battery_Status_Assessment_Service.UseDisposition_Payload" => val r = parseBattery_Status_Assessment_ServiceUseDisposition_PayloadT(T); return r
        case "Battery_Status_Assessment_Service.CapturedReport_Payload" => val r = parseBattery_Status_Assessment_ServiceCapturedReport_PayloadT(T); return r
        case "Battery_Status_Assessment_Service.AssessmentResult_Payload" => val r = parseBattery_Status_Assessment_ServiceAssessmentResult_PayloadT(T); return r
        case "Battery_Status_Assessment_Service.TaggedAssessment_Payload" => val r = parseBattery_Status_Assessment_ServiceTaggedAssessment_PayloadT(T); return r
        case "Battery_Status_Assessment_Service.StatusReadRequest_Payload" => val r = parseBattery_Status_Assessment_ServiceStatusReadRequest_PayloadT(T); return r
        case "Battery_Status_Assessment_Service.AssessmentContext_Payload" => val r = parseBattery_Status_Assessment_ServiceAssessmentContext_PayloadT(T); return r
        case "Battery_Status_Assessment_Service.QualifiedEvidence_Payload" => val r = parseBattery_Status_Assessment_ServiceQualifiedEvidence_PayloadT(T); return r
        case "Battery_Status_Assessment_Service.ReportAvailability_Payload" => val r = parseBattery_Status_Assessment_ServiceReportAvailability_PayloadT(T); return r
        case "Battery_Status_Assessment_Service.AcquisitionOutcome_Payload" => val r = parseBattery_Status_Assessment_ServiceAcquisitionOutcome_PayloadT(T); return r
        case "Battery_Status_Assessment_Service.PublicationOutcome_Payload" => val r = parseBattery_Status_Assessment_ServicePublicationOutcome_PayloadT(T); return r
        case "Battery_Status_Assessment_Service.ControlUseFeedback_Payload" => val r = parseBattery_Status_Assessment_ServiceControlUseFeedback_PayloadT(T); return r
        case "Battery_Status_Assessment_Service.AcquisitionDirective_Payload" => val r = parseBattery_Status_Assessment_ServiceAcquisitionDirective_PayloadT(T); return r
        case "Battery_Status_Assessment_Service.PublicationDirective_Payload" => val r = parseBattery_Status_Assessment_ServicePublicationDirective_PayloadT(T); return r
        case "Battery_Status_Assessment_Service.TaggedQualifiedEvidence_Payload" => val r = parseBattery_Status_Assessment_ServiceTaggedQualifiedEvidence_PayloadT(T); return r
        case "Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container_P" => val r = parseBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PT(T); return r
        case "Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container_PS" => val r = parseBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PST(T); return r
        case "Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container_P" => val r = parseBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PT(T); return r
        case "Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container_PS" => val r = parseBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PST(T); return r
        case "Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P" => val r = parseBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PT(T); return r
        case "Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS" => val r = parseBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PST(T); return r
        case "Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P" => val r = parseBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PT(T); return r
        case "Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS" => val r = parseBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PST(T); return r
        case "Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P" => val r = parseBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PT(T); return r
        case "Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS" => val r = parseBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PST(T); return r
        case "Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P" => val r = parseBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PT(T); return r
        case "Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS" => val r = parseBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PST(T); return r
        case "Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P" => val r = parseBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PT(T); return r
        case "Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS" => val r = parseBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PST(T); return r
        case "Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P" => val r = parseBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PT(T); return r
        case "Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS" => val r = parseBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PST(T); return r
        case "Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container_P" => val r = parseBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PT(T); return r
        case "Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS" => val r = parseBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PST(T); return r
        case "Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container_P" => val r = parseBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PT(T); return r
        case "Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS" => val r = parseBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PST(T); return r
        case _ => val r = parseBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PST(T); return r
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

  def fromBattery_Status_Assessment_ServiceCheckCommand_Payload(o: Battery_Status_Assessment_Service.CheckCommand_Payload, isCompact: B): String = {
    val st = Printer.printBattery_Status_Assessment_ServiceCheckCommand_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Status_Assessment_ServiceCheckCommand_Payload(s: String): Either[Battery_Status_Assessment_Service.CheckCommand_Payload, Json.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceCheckCommand_Payload(parser: Parser): Battery_Status_Assessment_Service.CheckCommand_Payload = {
      val r = parser.parseBattery_Status_Assessment_ServiceCheckCommand_Payload()
      return r
    }
    val r = to(s, fBattery_Status_Assessment_ServiceCheckCommand_Payload _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceCheckToken_Payload(o: Battery_Status_Assessment_Service.CheckToken_Payload, isCompact: B): String = {
    val st = Printer.printBattery_Status_Assessment_ServiceCheckToken_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Status_Assessment_ServiceCheckToken_Payload(s: String): Either[Battery_Status_Assessment_Service.CheckToken_Payload, Json.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceCheckToken_Payload(parser: Parser): Battery_Status_Assessment_Service.CheckToken_Payload = {
      val r = parser.parseBattery_Status_Assessment_ServiceCheckToken_Payload()
      return r
    }
    val r = to(s, fBattery_Status_Assessment_ServiceCheckToken_Payload _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceAcquisitionOutcome_Payload(o: Battery_Status_Assessment_Service.AcquisitionOutcome_Payload, isCompact: B): String = {
    val st = Printer.printBattery_Status_Assessment_ServiceAcquisitionOutcome_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Status_Assessment_ServiceAcquisitionOutcome_Payload(s: String): Either[Battery_Status_Assessment_Service.AcquisitionOutcome_Payload, Json.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceAcquisitionOutcome_Payload(parser: Parser): Battery_Status_Assessment_Service.AcquisitionOutcome_Payload = {
      val r = parser.parseBattery_Status_Assessment_ServiceAcquisitionOutcome_Payload()
      return r
    }
    val r = to(s, fBattery_Status_Assessment_ServiceAcquisitionOutcome_Payload _)
    return r
  }

  def fromBattery_Status_Assessment_ServicePublicationOutcome_Payload(o: Battery_Status_Assessment_Service.PublicationOutcome_Payload, isCompact: B): String = {
    val st = Printer.printBattery_Status_Assessment_ServicePublicationOutcome_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Status_Assessment_ServicePublicationOutcome_Payload(s: String): Either[Battery_Status_Assessment_Service.PublicationOutcome_Payload, Json.ErrorMsg] = {
    def fBattery_Status_Assessment_ServicePublicationOutcome_Payload(parser: Parser): Battery_Status_Assessment_Service.PublicationOutcome_Payload = {
      val r = parser.parseBattery_Status_Assessment_ServicePublicationOutcome_Payload()
      return r
    }
    val r = to(s, fBattery_Status_Assessment_ServicePublicationOutcome_Payload _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceAcquisitionDirective_Payload(o: Battery_Status_Assessment_Service.AcquisitionDirective_Payload, isCompact: B): String = {
    val st = Printer.printBattery_Status_Assessment_ServiceAcquisitionDirective_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Status_Assessment_ServiceAcquisitionDirective_Payload(s: String): Either[Battery_Status_Assessment_Service.AcquisitionDirective_Payload, Json.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceAcquisitionDirective_Payload(parser: Parser): Battery_Status_Assessment_Service.AcquisitionDirective_Payload = {
      val r = parser.parseBattery_Status_Assessment_ServiceAcquisitionDirective_Payload()
      return r
    }
    val r = to(s, fBattery_Status_Assessment_ServiceAcquisitionDirective_Payload _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceAssessmentContext_Payload(o: Battery_Status_Assessment_Service.AssessmentContext_Payload, isCompact: B): String = {
    val st = Printer.printBattery_Status_Assessment_ServiceAssessmentContext_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Status_Assessment_ServiceAssessmentContext_Payload(s: String): Either[Battery_Status_Assessment_Service.AssessmentContext_Payload, Json.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceAssessmentContext_Payload(parser: Parser): Battery_Status_Assessment_Service.AssessmentContext_Payload = {
      val r = parser.parseBattery_Status_Assessment_ServiceAssessmentContext_Payload()
      return r
    }
    val r = to(s, fBattery_Status_Assessment_ServiceAssessmentContext_Payload _)
    return r
  }

  def fromBattery_Status_Assessment_ServicePublicationDirective_Payload(o: Battery_Status_Assessment_Service.PublicationDirective_Payload, isCompact: B): String = {
    val st = Printer.printBattery_Status_Assessment_ServicePublicationDirective_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Status_Assessment_ServicePublicationDirective_Payload(s: String): Either[Battery_Status_Assessment_Service.PublicationDirective_Payload, Json.ErrorMsg] = {
    def fBattery_Status_Assessment_ServicePublicationDirective_Payload(parser: Parser): Battery_Status_Assessment_Service.PublicationDirective_Payload = {
      val r = parser.parseBattery_Status_Assessment_ServicePublicationDirective_Payload()
      return r
    }
    val r = to(s, fBattery_Status_Assessment_ServicePublicationDirective_Payload _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceCheckStatus_Payload(o: Battery_Status_Assessment_Service.CheckStatus_Payload, isCompact: B): String = {
    val st = Printer.printBattery_Status_Assessment_ServiceCheckStatus_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Status_Assessment_ServiceCheckStatus_Payload(s: String): Either[Battery_Status_Assessment_Service.CheckStatus_Payload, Json.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceCheckStatus_Payload(parser: Parser): Battery_Status_Assessment_Service.CheckStatus_Payload = {
      val r = parser.parseBattery_Status_Assessment_ServiceCheckStatus_Payload()
      return r
    }
    val r = to(s, fBattery_Status_Assessment_ServiceCheckStatus_Payload _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceReportTicket_Payload(o: Battery_Status_Assessment_Service.ReportTicket_Payload, isCompact: B): String = {
    val st = Printer.printBattery_Status_Assessment_ServiceReportTicket_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Status_Assessment_ServiceReportTicket_Payload(s: String): Either[Battery_Status_Assessment_Service.ReportTicket_Payload, Json.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceReportTicket_Payload(parser: Parser): Battery_Status_Assessment_Service.ReportTicket_Payload = {
      val r = parser.parseBattery_Status_Assessment_ServiceReportTicket_Payload()
      return r
    }
    val r = to(s, fBattery_Status_Assessment_ServiceReportTicket_Payload _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceReportAvailability_Payload(o: Battery_Status_Assessment_Service.ReportAvailability_Payload, isCompact: B): String = {
    val st = Printer.printBattery_Status_Assessment_ServiceReportAvailability_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Status_Assessment_ServiceReportAvailability_Payload(s: String): Either[Battery_Status_Assessment_Service.ReportAvailability_Payload, Json.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceReportAvailability_Payload(parser: Parser): Battery_Status_Assessment_Service.ReportAvailability_Payload = {
      val r = parser.parseBattery_Status_Assessment_ServiceReportAvailability_Payload()
      return r
    }
    val r = to(s, fBattery_Status_Assessment_ServiceReportAvailability_Payload _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceCapacityLevel_Payload(o: Battery_Status_Assessment_Service.CapacityLevel_Payload, isCompact: B): String = {
    val st = Printer.printBattery_Status_Assessment_ServiceCapacityLevel_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Status_Assessment_ServiceCapacityLevel_Payload(s: String): Either[Battery_Status_Assessment_Service.CapacityLevel_Payload, Json.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceCapacityLevel_Payload(parser: Parser): Battery_Status_Assessment_Service.CapacityLevel_Payload = {
      val r = parser.parseBattery_Status_Assessment_ServiceCapacityLevel_Payload()
      return r
    }
    val r = to(s, fBattery_Status_Assessment_ServiceCapacityLevel_Payload _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceReportQuality_Payload(o: Battery_Status_Assessment_Service.ReportQuality_Payload, isCompact: B): String = {
    val st = Printer.printBattery_Status_Assessment_ServiceReportQuality_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Status_Assessment_ServiceReportQuality_Payload(s: String): Either[Battery_Status_Assessment_Service.ReportQuality_Payload, Json.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceReportQuality_Payload(parser: Parser): Battery_Status_Assessment_Service.ReportQuality_Payload = {
      val r = parser.parseBattery_Status_Assessment_ServiceReportQuality_Payload()
      return r
    }
    val r = to(s, fBattery_Status_Assessment_ServiceReportQuality_Payload _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceStatusReadRequest_Payload(o: Battery_Status_Assessment_Service.StatusReadRequest_Payload, isCompact: B): String = {
    val st = Printer.printBattery_Status_Assessment_ServiceStatusReadRequest_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Status_Assessment_ServiceStatusReadRequest_Payload(s: String): Either[Battery_Status_Assessment_Service.StatusReadRequest_Payload, Json.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceStatusReadRequest_Payload(parser: Parser): Battery_Status_Assessment_Service.StatusReadRequest_Payload = {
      val r = parser.parseBattery_Status_Assessment_ServiceStatusReadRequest_Payload()
      return r
    }
    val r = to(s, fBattery_Status_Assessment_ServiceStatusReadRequest_Payload _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceQualifiedEvidence_Payload(o: Battery_Status_Assessment_Service.QualifiedEvidence_Payload, isCompact: B): String = {
    val st = Printer.printBattery_Status_Assessment_ServiceQualifiedEvidence_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Status_Assessment_ServiceQualifiedEvidence_Payload(s: String): Either[Battery_Status_Assessment_Service.QualifiedEvidence_Payload, Json.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceQualifiedEvidence_Payload(parser: Parser): Battery_Status_Assessment_Service.QualifiedEvidence_Payload = {
      val r = parser.parseBattery_Status_Assessment_ServiceQualifiedEvidence_Payload()
      return r
    }
    val r = to(s, fBattery_Status_Assessment_ServiceQualifiedEvidence_Payload _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceAssessmentResult_Payload(o: Battery_Status_Assessment_Service.AssessmentResult_Payload, isCompact: B): String = {
    val st = Printer.printBattery_Status_Assessment_ServiceAssessmentResult_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Status_Assessment_ServiceAssessmentResult_Payload(s: String): Either[Battery_Status_Assessment_Service.AssessmentResult_Payload, Json.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceAssessmentResult_Payload(parser: Parser): Battery_Status_Assessment_Service.AssessmentResult_Payload = {
      val r = parser.parseBattery_Status_Assessment_ServiceAssessmentResult_Payload()
      return r
    }
    val r = to(s, fBattery_Status_Assessment_ServiceAssessmentResult_Payload _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceFeedbackTicket_Payload(o: Battery_Status_Assessment_Service.FeedbackTicket_Payload, isCompact: B): String = {
    val st = Printer.printBattery_Status_Assessment_ServiceFeedbackTicket_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Status_Assessment_ServiceFeedbackTicket_Payload(s: String): Either[Battery_Status_Assessment_Service.FeedbackTicket_Payload, Json.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceFeedbackTicket_Payload(parser: Parser): Battery_Status_Assessment_Service.FeedbackTicket_Payload = {
      val r = parser.parseBattery_Status_Assessment_ServiceFeedbackTicket_Payload()
      return r
    }
    val r = to(s, fBattery_Status_Assessment_ServiceFeedbackTicket_Payload _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceUseDisposition_Payload(o: Battery_Status_Assessment_Service.UseDisposition_Payload, isCompact: B): String = {
    val st = Printer.printBattery_Status_Assessment_ServiceUseDisposition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Status_Assessment_ServiceUseDisposition_Payload(s: String): Either[Battery_Status_Assessment_Service.UseDisposition_Payload, Json.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceUseDisposition_Payload(parser: Parser): Battery_Status_Assessment_Service.UseDisposition_Payload = {
      val r = parser.parseBattery_Status_Assessment_ServiceUseDisposition_Payload()
      return r
    }
    val r = to(s, fBattery_Status_Assessment_ServiceUseDisposition_Payload _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceCheckRequest(o: Battery_Status_Assessment_Service.CheckRequest, isCompact: B): String = {
    val st = Printer.printBattery_Status_Assessment_ServiceCheckRequest(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Status_Assessment_ServiceCheckRequest(s: String): Either[Battery_Status_Assessment_Service.CheckRequest, Json.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceCheckRequest(parser: Parser): Battery_Status_Assessment_Service.CheckRequest = {
      val r = parser.parseBattery_Status_Assessment_ServiceCheckRequest()
      return r
    }
    val r = to(s, fBattery_Status_Assessment_ServiceCheckRequest _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceCheckRequest_Payload(o: Battery_Status_Assessment_Service.CheckRequest_Payload, isCompact: B): String = {
    val st = Printer.printBattery_Status_Assessment_ServiceCheckRequest_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Status_Assessment_ServiceCheckRequest_Payload(s: String): Either[Battery_Status_Assessment_Service.CheckRequest_Payload, Json.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceCheckRequest_Payload(parser: Parser): Battery_Status_Assessment_Service.CheckRequest_Payload = {
      val r = parser.parseBattery_Status_Assessment_ServiceCheckRequest_Payload()
      return r
    }
    val r = to(s, fBattery_Status_Assessment_ServiceCheckRequest_Payload _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceBatteryReport(o: Battery_Status_Assessment_Service.BatteryReport, isCompact: B): String = {
    val st = Printer.printBattery_Status_Assessment_ServiceBatteryReport(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Status_Assessment_ServiceBatteryReport(s: String): Either[Battery_Status_Assessment_Service.BatteryReport, Json.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceBatteryReport(parser: Parser): Battery_Status_Assessment_Service.BatteryReport = {
      val r = parser.parseBattery_Status_Assessment_ServiceBatteryReport()
      return r
    }
    val r = to(s, fBattery_Status_Assessment_ServiceBatteryReport _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceBatteryReport_Payload(o: Battery_Status_Assessment_Service.BatteryReport_Payload, isCompact: B): String = {
    val st = Printer.printBattery_Status_Assessment_ServiceBatteryReport_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Status_Assessment_ServiceBatteryReport_Payload(s: String): Either[Battery_Status_Assessment_Service.BatteryReport_Payload, Json.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceBatteryReport_Payload(parser: Parser): Battery_Status_Assessment_Service.BatteryReport_Payload = {
      val r = parser.parseBattery_Status_Assessment_ServiceBatteryReport_Payload()
      return r
    }
    val r = to(s, fBattery_Status_Assessment_ServiceBatteryReport_Payload _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceCapturedReport(o: Battery_Status_Assessment_Service.CapturedReport, isCompact: B): String = {
    val st = Printer.printBattery_Status_Assessment_ServiceCapturedReport(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Status_Assessment_ServiceCapturedReport(s: String): Either[Battery_Status_Assessment_Service.CapturedReport, Json.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceCapturedReport(parser: Parser): Battery_Status_Assessment_Service.CapturedReport = {
      val r = parser.parseBattery_Status_Assessment_ServiceCapturedReport()
      return r
    }
    val r = to(s, fBattery_Status_Assessment_ServiceCapturedReport _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceCapturedReport_Payload(o: Battery_Status_Assessment_Service.CapturedReport_Payload, isCompact: B): String = {
    val st = Printer.printBattery_Status_Assessment_ServiceCapturedReport_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Status_Assessment_ServiceCapturedReport_Payload(s: String): Either[Battery_Status_Assessment_Service.CapturedReport_Payload, Json.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceCapturedReport_Payload(parser: Parser): Battery_Status_Assessment_Service.CapturedReport_Payload = {
      val r = parser.parseBattery_Status_Assessment_ServiceCapturedReport_Payload()
      return r
    }
    val r = to(s, fBattery_Status_Assessment_ServiceCapturedReport_Payload _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceTaggedQualifiedEvidence(o: Battery_Status_Assessment_Service.TaggedQualifiedEvidence, isCompact: B): String = {
    val st = Printer.printBattery_Status_Assessment_ServiceTaggedQualifiedEvidence(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Status_Assessment_ServiceTaggedQualifiedEvidence(s: String): Either[Battery_Status_Assessment_Service.TaggedQualifiedEvidence, Json.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceTaggedQualifiedEvidence(parser: Parser): Battery_Status_Assessment_Service.TaggedQualifiedEvidence = {
      val r = parser.parseBattery_Status_Assessment_ServiceTaggedQualifiedEvidence()
      return r
    }
    val r = to(s, fBattery_Status_Assessment_ServiceTaggedQualifiedEvidence _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceTaggedQualifiedEvidence_Payload(o: Battery_Status_Assessment_Service.TaggedQualifiedEvidence_Payload, isCompact: B): String = {
    val st = Printer.printBattery_Status_Assessment_ServiceTaggedQualifiedEvidence_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Status_Assessment_ServiceTaggedQualifiedEvidence_Payload(s: String): Either[Battery_Status_Assessment_Service.TaggedQualifiedEvidence_Payload, Json.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceTaggedQualifiedEvidence_Payload(parser: Parser): Battery_Status_Assessment_Service.TaggedQualifiedEvidence_Payload = {
      val r = parser.parseBattery_Status_Assessment_ServiceTaggedQualifiedEvidence_Payload()
      return r
    }
    val r = to(s, fBattery_Status_Assessment_ServiceTaggedQualifiedEvidence_Payload _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceTaggedAssessment(o: Battery_Status_Assessment_Service.TaggedAssessment, isCompact: B): String = {
    val st = Printer.printBattery_Status_Assessment_ServiceTaggedAssessment(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Status_Assessment_ServiceTaggedAssessment(s: String): Either[Battery_Status_Assessment_Service.TaggedAssessment, Json.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceTaggedAssessment(parser: Parser): Battery_Status_Assessment_Service.TaggedAssessment = {
      val r = parser.parseBattery_Status_Assessment_ServiceTaggedAssessment()
      return r
    }
    val r = to(s, fBattery_Status_Assessment_ServiceTaggedAssessment _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceTaggedAssessment_Payload(o: Battery_Status_Assessment_Service.TaggedAssessment_Payload, isCompact: B): String = {
    val st = Printer.printBattery_Status_Assessment_ServiceTaggedAssessment_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Status_Assessment_ServiceTaggedAssessment_Payload(s: String): Either[Battery_Status_Assessment_Service.TaggedAssessment_Payload, Json.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceTaggedAssessment_Payload(parser: Parser): Battery_Status_Assessment_Service.TaggedAssessment_Payload = {
      val r = parser.parseBattery_Status_Assessment_ServiceTaggedAssessment_Payload()
      return r
    }
    val r = to(s, fBattery_Status_Assessment_ServiceTaggedAssessment_Payload _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceControlUseFeedback(o: Battery_Status_Assessment_Service.ControlUseFeedback, isCompact: B): String = {
    val st = Printer.printBattery_Status_Assessment_ServiceControlUseFeedback(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Status_Assessment_ServiceControlUseFeedback(s: String): Either[Battery_Status_Assessment_Service.ControlUseFeedback, Json.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceControlUseFeedback(parser: Parser): Battery_Status_Assessment_Service.ControlUseFeedback = {
      val r = parser.parseBattery_Status_Assessment_ServiceControlUseFeedback()
      return r
    }
    val r = to(s, fBattery_Status_Assessment_ServiceControlUseFeedback _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceControlUseFeedback_Payload(o: Battery_Status_Assessment_Service.ControlUseFeedback_Payload, isCompact: B): String = {
    val st = Printer.printBattery_Status_Assessment_ServiceControlUseFeedback_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Status_Assessment_ServiceControlUseFeedback_Payload(s: String): Either[Battery_Status_Assessment_Service.ControlUseFeedback_Payload, Json.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceControlUseFeedback_Payload(parser: Parser): Battery_Status_Assessment_Service.ControlUseFeedback_Payload = {
      val r = parser.parseBattery_Status_Assessment_ServiceControlUseFeedback_Payload()
      return r
    }
    val r = to(s, fBattery_Status_Assessment_ServiceControlUseFeedback_Payload _)
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

  def fromBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container(o: Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container, isCompact: B): String = {
    val st = Printer.printBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container(s: String): Either[Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container, Json.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container(parser: Parser): Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container = {
      val r = parser.parseBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container()
      return r
    }
    val r = to(s, fBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P(o: Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P(s: String): Either[Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P, Json.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P(parser: Parser): Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P = {
      val r = parser.parseBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P()
      return r
    }
    val r = to(s, fBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS(o: Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS(s: String): Either[Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS, Json.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS(parser: Parser): Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS = {
      val r = parser.parseBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS()
      return r
    }
    val r = to(s, fBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container(o: Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container, isCompact: B): String = {
    val st = Printer.printBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container(s: String): Either[Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container, Json.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container(parser: Parser): Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container = {
      val r = parser.parseBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container()
      return r
    }
    val r = to(s, fBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P(o: Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P(s: String): Either[Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P, Json.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P(parser: Parser): Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P = {
      val r = parser.parseBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P()
      return r
    }
    val r = to(s, fBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS(o: Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS(s: String): Either[Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS, Json.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS(parser: Parser): Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS = {
      val r = parser.parseBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS()
      return r
    }
    val r = to(s, fBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container(o: Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container, isCompact: B): String = {
    val st = Printer.printBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container(s: String): Either[Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container, Json.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container(parser: Parser): Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container = {
      val r = parser.parseBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container()
      return r
    }
    val r = to(s, fBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P(o: Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P(s: String): Either[Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P, Json.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P(parser: Parser): Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P = {
      val r = parser.parseBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P()
      return r
    }
    val r = to(s, fBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS(o: Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS(s: String): Either[Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS, Json.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS(parser: Parser): Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS = {
      val r = parser.parseBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS()
      return r
    }
    val r = to(s, fBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container(o: Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container, isCompact: B): String = {
    val st = Printer.printBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container(s: String): Either[Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container, Json.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container(parser: Parser): Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container = {
      val r = parser.parseBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container()
      return r
    }
    val r = to(s, fBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P(o: Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P(s: String): Either[Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P, Json.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P(parser: Parser): Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P = {
      val r = parser.parseBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P()
      return r
    }
    val r = to(s, fBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS(o: Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS(s: String): Either[Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS, Json.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS(parser: Parser): Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS = {
      val r = parser.parseBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS()
      return r
    }
    val r = to(s, fBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container(o: Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container, isCompact: B): String = {
    val st = Printer.printBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container(s: String): Either[Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container, Json.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container(parser: Parser): Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container = {
      val r = parser.parseBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container()
      return r
    }
    val r = to(s, fBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_P(o: Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_P(s: String): Either[Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container_P, Json.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_P(parser: Parser): Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container_P = {
      val r = parser.parseBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_P()
      return r
    }
    val r = to(s, fBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_P _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS(o: Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS(s: String): Either[Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS, Json.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS(parser: Parser): Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS = {
      val r = parser.parseBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS()
      return r
    }
    val r = to(s, fBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container(o: Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container, isCompact: B): String = {
    val st = Printer.printBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container(s: String): Either[Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container, Json.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container(parser: Parser): Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container = {
      val r = parser.parseBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container()
      return r
    }
    val r = to(s, fBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_P(o: Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_P(s: String): Either[Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container_P, Json.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_P(parser: Parser): Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container_P = {
      val r = parser.parseBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_P()
      return r
    }
    val r = to(s, fBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_P _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS(o: Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS(s: String): Either[Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS, Json.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS(parser: Parser): Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS = {
      val r = parser.parseBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS()
      return r
    }
    val r = to(s, fBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container(o: Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container, isCompact: B): String = {
    val st = Printer.printBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container(s: String): Either[Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container, Json.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container(parser: Parser): Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container = {
      val r = parser.parseBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container()
      return r
    }
    val r = to(s, fBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P(o: Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P(s: String): Either[Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P, Json.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P(parser: Parser): Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P = {
      val r = parser.parseBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P()
      return r
    }
    val r = to(s, fBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS(o: Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS(s: String): Either[Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS, Json.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS(parser: Parser): Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS = {
      val r = parser.parseBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS()
      return r
    }
    val r = to(s, fBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container(o: Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container, isCompact: B): String = {
    val st = Printer.printBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container(s: String): Either[Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container, Json.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container(parser: Parser): Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container = {
      val r = parser.parseBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container()
      return r
    }
    val r = to(s, fBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P(o: Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P(s: String): Either[Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P, Json.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P(parser: Parser): Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P = {
      val r = parser.parseBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P()
      return r
    }
    val r = to(s, fBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS(o: Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS(s: String): Either[Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS, Json.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS(parser: Parser): Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS = {
      val r = parser.parseBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS()
      return r
    }
    val r = to(s, fBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container(o: Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container, isCompact: B): String = {
    val st = Printer.printBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container(s: String): Either[Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container, Json.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container(parser: Parser): Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container = {
      val r = parser.parseBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container()
      return r
    }
    val r = to(s, fBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_P(o: Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_P(s: String): Either[Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container_P, Json.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_P(parser: Parser): Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container_P = {
      val r = parser.parseBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_P()
      return r
    }
    val r = to(s, fBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_P _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PS(o: Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PS(s: String): Either[Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container_PS, Json.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PS(parser: Parser): Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container_PS = {
      val r = parser.parseBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PS()
      return r
    }
    val r = to(s, fBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PS _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container(o: Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container, isCompact: B): String = {
    val st = Printer.printBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container(s: String): Either[Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container, Json.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container(parser: Parser): Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container = {
      val r = parser.parseBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container()
      return r
    }
    val r = to(s, fBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_P(o: Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_P(s: String): Either[Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container_P, Json.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_P(parser: Parser): Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container_P = {
      val r = parser.parseBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_P()
      return r
    }
    val r = to(s, fBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_P _)
    return r
  }

  def fromBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PS(o: Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PS(s: String): Either[Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container_PS, Json.ErrorMsg] = {
    def fBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PS(parser: Parser): Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container_PS = {
      val r = parser.parseBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PS()
      return r
    }
    val r = to(s, fBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PS _)
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