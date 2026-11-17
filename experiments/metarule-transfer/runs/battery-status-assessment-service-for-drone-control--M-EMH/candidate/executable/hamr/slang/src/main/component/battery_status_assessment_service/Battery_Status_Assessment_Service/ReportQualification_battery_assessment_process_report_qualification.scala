// #Sireum

package battery_status_assessment_service.Battery_Status_Assessment_Service

import org.sireum._
import battery_status_assessment_service._

// This file will not be overwritten if HAMR codegen is rerun
object ReportQualification_battery_assessment_process_report_qualification {

  def initialise(api: ReportQualification_Initialization_Api): Unit = {
    Contract(
      Modifies(api)
    )
    api.put_qualified_evidence(Battery_Status_Assessment_Service.TaggedQualifiedEvidence.example())
  }

  def timeTriggered(api: ReportQualification_Operational_Api): Unit = {
    Contract(
      Modifies(api)
    )
    val report: Battery_Status_Assessment_Service.CapturedReport = api.get_captured_report() match {
      case Some(value) => value
      case _ => Battery_Status_Assessment_Service.CapturedReport.example()
    }
    val evidence: Battery_Status_Assessment_Service.TaggedQualifiedEvidence =
      if (report.ticket == Battery_Status_Assessment_Service.ReportTicket.NoTicket) {
        Battery_Status_Assessment_Service.TaggedQualifiedEvidence.example()
      } else if (report.availability == Battery_Status_Assessment_Service.ReportAvailability.Present &&
        report.quality == Battery_Status_Assessment_Service.ReportQuality.Current) {
        val qualified: Battery_Status_Assessment_Service.QualifiedEvidence.Type = report.level match {
          case Battery_Status_Assessment_Service.CapacityLevel.High =>
            Battery_Status_Assessment_Service.QualifiedEvidence.TrustedHigh
          case Battery_Status_Assessment_Service.CapacityLevel.Moderate =>
            Battery_Status_Assessment_Service.QualifiedEvidence.TrustedModerate
          case Battery_Status_Assessment_Service.CapacityLevel.Low =>
            Battery_Status_Assessment_Service.QualifiedEvidence.TrustedLow
          case Battery_Status_Assessment_Service.CapacityLevel.Critical =>
            Battery_Status_Assessment_Service.QualifiedEvidence.TrustedCritical
          case _ =>
            Battery_Status_Assessment_Service.QualifiedEvidence.Untrusted
        }
        Battery_Status_Assessment_Service.TaggedQualifiedEvidence(report.ticket, qualified)
      } else {
        Battery_Status_Assessment_Service.TaggedQualifiedEvidence(
          report.ticket,
          Battery_Status_Assessment_Service.QualifiedEvidence.Untrusted)
      }
    api.put_qualified_evidence(evidence)
  }

  def finalise(api: ReportQualification_Operational_Api): Unit = { }
}
