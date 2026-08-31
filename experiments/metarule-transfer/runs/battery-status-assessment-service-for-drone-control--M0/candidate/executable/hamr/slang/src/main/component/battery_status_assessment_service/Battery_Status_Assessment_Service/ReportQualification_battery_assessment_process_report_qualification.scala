// #Sireum

package battery_status_assessment_service.Battery_Status_Assessment_Service

import org.sireum._
import battery_status_assessment_service._

// This file will not be overwritten if HAMR codegen is rerun
object ReportQualification_battery_assessment_process_report_qualification {

  def initialise(api: ReportQualification_Initialization_Api): Unit = {
    api.put_qualified_evidence(Battery_Status_Assessment_Service.TaggedQualifiedEvidence(ReportTicket.NoTicket, QualifiedEvidence.NoEvidence))
  }

  def timeTriggered(api: ReportQualification_Operational_Api): Unit = {
    Contract(
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case QUALIFY_CURRENT_HIGH
        //   N.md#QUALIFY_CURRENT_HIGH
        (api.captured_report.ticket != ReportTicket.NoTicket &
          api.captured_report.availability == ReportAvailability.Present &
          api.captured_report.level == CapacityLevel.High &
          api.captured_report.quality == ReportQuality.Current) ___>: (api.qualified_evidence.ticket == api.captured_report.ticket &
          api.qualified_evidence.evidence == QualifiedEvidence.TrustedHigh),
        // case QUALIFY_CURRENT_MODERATE
        //   N.md#QUALIFY_CURRENT_MODERATE
        (api.captured_report.ticket != ReportTicket.NoTicket &
          api.captured_report.availability == ReportAvailability.Present &
          api.captured_report.level == CapacityLevel.Moderate &
          api.captured_report.quality == ReportQuality.Current) ___>: (api.qualified_evidence.ticket == api.captured_report.ticket &
          api.qualified_evidence.evidence == QualifiedEvidence.TrustedModerate),
        // case QUALIFY_CURRENT_LOW
        //   N.md#QUALIFY_CURRENT_LOW
        (api.captured_report.ticket != ReportTicket.NoTicket &
          api.captured_report.availability == ReportAvailability.Present &
          api.captured_report.level == CapacityLevel.Low &
          api.captured_report.quality == ReportQuality.Current) ___>: (api.qualified_evidence.ticket == api.captured_report.ticket &
          api.qualified_evidence.evidence == QualifiedEvidence.TrustedLow),
        // case QUALIFY_CURRENT_CRITICAL
        //   N.md#QUALIFY_CURRENT_CRITICAL
        (api.captured_report.ticket != ReportTicket.NoTicket &
          api.captured_report.availability == ReportAvailability.Present &
          api.captured_report.level == CapacityLevel.Critical &
          api.captured_report.quality == ReportQuality.Current) ___>: (api.qualified_evidence.ticket == api.captured_report.ticket &
          api.qualified_evidence.evidence == QualifiedEvidence.TrustedCritical),
        // case QUALIFY_UNTRUSTED_PRESENT
        //   N.md#QUALIFY_UNTRUSTED_PRESENT
        (api.captured_report.ticket != ReportTicket.NoTicket &
          !(api.captured_report.availability == ReportAvailability.Present &
            api.captured_report.level != CapacityLevel.NoLevel &
            api.captured_report.quality == ReportQuality.Current)) ___>: (api.qualified_evidence.ticket == api.captured_report.ticket &
          api.qualified_evidence.evidence == QualifiedEvidence.Untrusted),
        // case QUALIFICATION_INACTIVE
        //   N.md#QUALIFICATION_INACTIVE
        (api.captured_report.ticket == ReportTicket.NoTicket) ___>: (api.qualified_evidence.ticket == ReportTicket.NoTicket &
          api.qualified_evidence.evidence == QualifiedEvidence.NoEvidence)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val report = api.get_captured_report().get
    val evidence: QualifiedEvidence.Type =
      if (report.ticket == ReportTicket.NoTicket) QualifiedEvidence.NoEvidence
      else if (report.availability == ReportAvailability.Present & report.quality == ReportQuality.Current & report.level == CapacityLevel.High) QualifiedEvidence.TrustedHigh
      else if (report.availability == ReportAvailability.Present & report.quality == ReportQuality.Current & report.level == CapacityLevel.Moderate) QualifiedEvidence.TrustedModerate
      else if (report.availability == ReportAvailability.Present & report.quality == ReportQuality.Current & report.level == CapacityLevel.Low) QualifiedEvidence.TrustedLow
      else if (report.availability == ReportAvailability.Present & report.quality == ReportQuality.Current & report.level == CapacityLevel.Critical) QualifiedEvidence.TrustedCritical
      else QualifiedEvidence.Untrusted
    val ticket: ReportTicket.Type = if (evidence == QualifiedEvidence.NoEvidence) ReportTicket.NoTicket else report.ticket
    api.put_qualified_evidence(Battery_Status_Assessment_Service.TaggedQualifiedEvidence(ticket, evidence))
  }

  def finalise(api: ReportQualification_Operational_Api): Unit = { }
}
