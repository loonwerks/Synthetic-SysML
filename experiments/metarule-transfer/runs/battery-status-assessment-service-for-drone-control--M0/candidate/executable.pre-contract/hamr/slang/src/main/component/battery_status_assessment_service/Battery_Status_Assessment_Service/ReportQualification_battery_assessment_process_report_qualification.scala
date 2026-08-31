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
    // example api usage

    val apiUsage_captured_report: Option[Battery_Status_Assessment_Service.CapturedReport] = api.get_captured_report()
    api.logInfo(s"Received on data port captured_report: ${apiUsage_captured_report}")
  }

  def finalise(api: ReportQualification_Operational_Api): Unit = { }
}
