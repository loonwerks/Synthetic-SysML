// #Sireum

package scp_candidate.Battery_Status_Assessment_Service

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object ReportQualification_battery_assessment_process_report_qualification {

  def initialise(api: ReportQualification_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_QUALIFICATION_SAFE
        api.qualified_evidence.ticket == ReportTicket.NoTicket &
          api.qualified_evidence.evidence == QualifiedEvidence.NoEvidence
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_qualified_evidence(TaggedQualifiedEvidence(ReportTicket.NoTicket, QualifiedEvidence.NoEvidence))
  }

  def finalise(api: ReportQualification_Operational_Api): Unit = { }

  def timeTriggered(api: ReportQualification_Operational_Api): Unit = {
    Contract(
      Modifies(api)
    )
    val report: CapturedReport = api.get_captured_report().get
    val qualified: TaggedQualifiedEvidence = if (report.ticket == ReportTicket.NoTicket) {
      TaggedQualifiedEvidence(ReportTicket.NoTicket, QualifiedEvidence.NoEvidence)
    } else if (report.availability == ReportAvailability.Present && report.quality == ReportQuality.Current) {
      report.level match {
        case CapacityLevel.High => TaggedQualifiedEvidence(report.ticket, QualifiedEvidence.TrustedHigh)
        case CapacityLevel.Moderate => TaggedQualifiedEvidence(report.ticket, QualifiedEvidence.TrustedModerate)
        case CapacityLevel.Low => TaggedQualifiedEvidence(report.ticket, QualifiedEvidence.TrustedLow)
        case CapacityLevel.Critical => TaggedQualifiedEvidence(report.ticket, QualifiedEvidence.TrustedCritical)
        case _ => TaggedQualifiedEvidence(report.ticket, QualifiedEvidence.Untrusted)
      }
    } else {
      TaggedQualifiedEvidence(report.ticket, QualifiedEvidence.Untrusted)
    }
    api.put_qualified_evidence(qualified)
  }
}
