// #Sireum

package battery_status_assessment_service.Battery_Status_Assessment_Service

import org.sireum._
import battery_status_assessment_service._

// This file will not be overwritten if HAMR codegen is rerun
object ReportQualification_battery_assessment_process_report_qualification {

  def initialise(api: ReportQualification_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES timeTriggered
        // guarantee INITIAL_QUALIFICATION_SAFE
        //   qualified evidence ticket is NoTicket and qualified evidence
        //   evidence is NoEvidence
        api.qualified_evidence.ticket == ReportTicket.NoTicket &
          api.qualified_evidence.evidence == QualifiedEvidence.NoEvidence
        // END INITIALIZES ENSURES timeTriggered
      )
    )
    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_qualified_evidence(
      Battery_Status_Assessment_Service.TaggedQualifiedEvidence(
        ticket = Battery_Status_Assessment_Service.ReportTicket.NoTicket,
        evidence = Battery_Status_Assessment_Service.QualifiedEvidence.NoEvidence))
  }

  def timeTriggered(api: ReportQualification_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case QUALIFY_CURRENT_HIGH
        //   qualify current high evidence
        (api.captured_report.ticket != ReportTicket.NoTicket &
          api.captured_report.availability == ReportAvailability.Present &
          api.captured_report.level == CapacityLevel.High &
          api.captured_report.quality == ReportQuality.Current) ___>: (api.qualified_evidence.ticket == api.captured_report.ticket &
          api.qualified_evidence.evidence == QualifiedEvidence.TrustedHigh),
        // case QUALIFY_CURRENT_MODERATE
        //   qualify current moderate evidence
        (api.captured_report.ticket != ReportTicket.NoTicket &
          api.captured_report.availability == ReportAvailability.Present &
          api.captured_report.level == CapacityLevel.Moderate &
          api.captured_report.quality == ReportQuality.Current) ___>: (api.qualified_evidence.ticket == api.captured_report.ticket &
          api.qualified_evidence.evidence == QualifiedEvidence.TrustedModerate),
        // case QUALIFY_CURRENT_LOW
        //   qualify current low evidence
        (api.captured_report.ticket != ReportTicket.NoTicket &
          api.captured_report.availability == ReportAvailability.Present &
          api.captured_report.level == CapacityLevel.Low &
          api.captured_report.quality == ReportQuality.Current) ___>: (api.qualified_evidence.ticket == api.captured_report.ticket &
          api.qualified_evidence.evidence == QualifiedEvidence.TrustedLow),
        // case QUALIFY_CURRENT_CRITICAL
        //   qualify current critical evidence
        (api.captured_report.ticket != ReportTicket.NoTicket &
          api.captured_report.availability == ReportAvailability.Present &
          api.captured_report.level == CapacityLevel.Critical &
          api.captured_report.quality == ReportQuality.Current) ___>: (api.qualified_evidence.ticket == api.captured_report.ticket &
          api.qualified_evidence.evidence == QualifiedEvidence.TrustedCritical),
        // case QUALIFY_UNTRUSTED_PRESENT
        //   qualify untrusted evidence
        (api.captured_report.ticket != ReportTicket.NoTicket &
          !(api.captured_report.availability == ReportAvailability.Present &
            api.captured_report.level != CapacityLevel.NoLevel &
            api.captured_report.quality == ReportQuality.Current)) ___>: (api.qualified_evidence.ticket == api.captured_report.ticket &
          api.qualified_evidence.evidence == QualifiedEvidence.Untrusted),
        // case QUALIFICATION_INACTIVE
        //   inactive qualification
        (api.captured_report.ticket == ReportTicket.NoTicket) ___>: (api.qualified_evidence.ticket == ReportTicket.NoTicket &
          api.qualified_evidence.evidence == QualifiedEvidence.NoEvidence)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val apiUsage_captured_report: Option[Battery_Status_Assessment_Service.CapturedReport] = api.get_captured_report()
    api.logInfo(s"Received on data port captured_report: ${apiUsage_captured_report}")

    val cr: Battery_Status_Assessment_Service.CapturedReport = apiUsage_captured_report.get

    var outTicket: Battery_Status_Assessment_Service.ReportTicket.Type = cr.ticket
    var outEvidence: Battery_Status_Assessment_Service.QualifiedEvidence.Type =
      Battery_Status_Assessment_Service.QualifiedEvidence.Untrusted

    if (cr.ticket == Battery_Status_Assessment_Service.ReportTicket.NoTicket) {
      // case QUALIFICATION_INACTIVE
      outTicket = Battery_Status_Assessment_Service.ReportTicket.NoTicket
      outEvidence = Battery_Status_Assessment_Service.QualifiedEvidence.NoEvidence
    } else if (cr.availability == Battery_Status_Assessment_Service.ReportAvailability.Present &
      cr.level == Battery_Status_Assessment_Service.CapacityLevel.High &
      cr.quality == Battery_Status_Assessment_Service.ReportQuality.Current) {
      // case QUALIFY_CURRENT_HIGH
      outTicket = cr.ticket
      outEvidence = Battery_Status_Assessment_Service.QualifiedEvidence.TrustedHigh
    } else if (cr.availability == Battery_Status_Assessment_Service.ReportAvailability.Present &
      cr.level == Battery_Status_Assessment_Service.CapacityLevel.Moderate &
      cr.quality == Battery_Status_Assessment_Service.ReportQuality.Current) {
      // case QUALIFY_CURRENT_MODERATE
      outTicket = cr.ticket
      outEvidence = Battery_Status_Assessment_Service.QualifiedEvidence.TrustedModerate
    } else if (cr.availability == Battery_Status_Assessment_Service.ReportAvailability.Present &
      cr.level == Battery_Status_Assessment_Service.CapacityLevel.Low &
      cr.quality == Battery_Status_Assessment_Service.ReportQuality.Current) {
      // case QUALIFY_CURRENT_LOW
      outTicket = cr.ticket
      outEvidence = Battery_Status_Assessment_Service.QualifiedEvidence.TrustedLow
    } else if (cr.availability == Battery_Status_Assessment_Service.ReportAvailability.Present &
      cr.level == Battery_Status_Assessment_Service.CapacityLevel.Critical &
      cr.quality == Battery_Status_Assessment_Service.ReportQuality.Current) {
      // case QUALIFY_CURRENT_CRITICAL
      outTicket = cr.ticket
      outEvidence = Battery_Status_Assessment_Service.QualifiedEvidence.TrustedCritical
    } else {
      // case QUALIFY_UNTRUSTED_PRESENT
      outTicket = cr.ticket
      outEvidence = Battery_Status_Assessment_Service.QualifiedEvidence.Untrusted
    }

    api.put_qualified_evidence(
      Battery_Status_Assessment_Service.TaggedQualifiedEvidence(
        ticket = outTicket,
        evidence = outEvidence))
  }

  def finalise(api: ReportQualification_Operational_Api): Unit = { }
}
