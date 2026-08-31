// #Sireum

package battery_status_assessment_service.Battery_Status_Assessment_Service

import org.sireum._
import battery_status_assessment_service._

// This file will not be overwritten if HAMR codegen is rerun
object ReportQualification_battery_assessment_process_report_qualification {

  def initialise(api: ReportQualification_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_qualified_evidence(Battery_Status_Assessment_Service.TaggedQualifiedEvidence.example())
  }

  def timeTriggered(api: ReportQualification_Operational_Api): Unit = {
    Contract(
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case QUALIFY_CURRENT_HIGH
        (api.captured_report.ticket != ReportTicket.NoTicket &
          api.captured_report.availability == ReportAvailability.Present &
          api.captured_report.level == CapacityLevel.High &
          api.captured_report.quality == ReportQuality.Current) ___>: (api.qualified_evidence.ticket == api.captured_report.ticket &
          api.qualified_evidence.evidence == QualifiedEvidence.TrustedHigh),
        // case QUALIFY_CURRENT_MODERATE
        (api.captured_report.ticket != ReportTicket.NoTicket &
          api.captured_report.availability == ReportAvailability.Present &
          api.captured_report.level == CapacityLevel.Moderate &
          api.captured_report.quality == ReportQuality.Current) ___>: (api.qualified_evidence.ticket == api.captured_report.ticket &
          api.qualified_evidence.evidence == QualifiedEvidence.TrustedModerate),
        // case QUALIFY_CURRENT_LOW
        (api.captured_report.ticket != ReportTicket.NoTicket &
          api.captured_report.availability == ReportAvailability.Present &
          api.captured_report.level == CapacityLevel.Low &
          api.captured_report.quality == ReportQuality.Current) ___>: (api.qualified_evidence.ticket == api.captured_report.ticket &
          api.qualified_evidence.evidence == QualifiedEvidence.TrustedLow),
        // case QUALIFY_CURRENT_CRITICAL
        (api.captured_report.ticket != ReportTicket.NoTicket &
          api.captured_report.availability == ReportAvailability.Present &
          api.captured_report.level == CapacityLevel.Critical &
          api.captured_report.quality == ReportQuality.Current) ___>: (api.qualified_evidence.ticket == api.captured_report.ticket &
          api.qualified_evidence.evidence == QualifiedEvidence.TrustedCritical),
        // case QUALIFY_UNTRUSTED_PRESENT
        (api.captured_report.ticket != ReportTicket.NoTicket &
          !(api.captured_report.availability == ReportAvailability.Present &
            api.captured_report.level != CapacityLevel.NoLevel &
            api.captured_report.quality == ReportQuality.Current)) ___>: (api.qualified_evidence.ticket == api.captured_report.ticket &
          api.qualified_evidence.evidence == QualifiedEvidence.Untrusted),
        // case QUALIFICATION_INACTIVE
        (api.captured_report.ticket == ReportTicket.NoTicket) ___>: (api.qualified_evidence.ticket == ReportTicket.NoTicket &
          api.qualified_evidence.evidence == QualifiedEvidence.NoEvidence)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val apiUsage_captured_report: Option[Battery_Status_Assessment_Service.CapturedReport] = api.get_captured_report()
    api.logInfo(s"Received on data port captured_report: ${apiUsage_captured_report}")
  }

  def finalise(api: ReportQualification_Operational_Api): Unit = { }
}
