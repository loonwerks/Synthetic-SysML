// #Sireum

package battery_status_assessment_service.Battery_Status_Assessment_Service

import org.sireum._
import battery_status_assessment_service._

// This file will not be overwritten if HAMR codegen is rerun
object ReportAcquisition_battery_assessment_process_report_acquisition {

  def initialise(api: ReportAcquisition_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_captured_report(Battery_Status_Assessment_Service.CapturedReport.example())
    api.put_acquisition_outcome(Battery_Status_Assessment_Service.AcquisitionOutcome.NoAcquisitionOutcome)
    api.put_status_read_request(Battery_Status_Assessment_Service.StatusReadRequest.NoRead)
  }

  def timeTriggered(api: ReportAcquisition_Operational_Api): Unit = {
    // example api usage

    val apiUsage_battery_report: Option[Battery_Status_Assessment_Service.BatteryReport] = api.get_battery_report()
    api.logInfo(s"Received on data port battery_report: ${apiUsage_battery_report}")
    val apiUsage_acquisition_directive: Option[Battery_Status_Assessment_Service.AcquisitionDirective.Type] = api.get_acquisition_directive()
    api.logInfo(s"Received on data port acquisition_directive: ${apiUsage_acquisition_directive}")
  }

  def finalise(api: ReportAcquisition_Operational_Api): Unit = { }
}
