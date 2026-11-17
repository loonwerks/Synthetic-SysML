// #Sireum

package battery_status_assessment_service.Battery_Status_Assessment_Service

import org.sireum._
import battery_status_assessment_service._

// This file will not be overwritten if HAMR codegen is rerun
object ReportAcquisition_battery_assessment_process_report_acquisition {
  var failureHold: B = F
  var committedOutcome: Battery_Status_Assessment_Service.AcquisitionOutcome.Type =
    Battery_Status_Assessment_Service.AcquisitionOutcome.NoAcquisitionOutcome

  def noReport(): Battery_Status_Assessment_Service.CapturedReport = {
    return Battery_Status_Assessment_Service.CapturedReport.example()
  }

  def initialise(api: ReportAcquisition_Initialization_Api): Unit = {
    Contract(
      Modifies(api, failureHold, committedOutcome)
    )
    failureHold = F
    committedOutcome = Battery_Status_Assessment_Service.AcquisitionOutcome.NoAcquisitionOutcome
    api.put_captured_report(noReport())
    api.put_acquisition_outcome(committedOutcome)
    api.put_status_read_request(Battery_Status_Assessment_Service.StatusReadRequest.NoRead)
  }

  def timeTriggered(api: ReportAcquisition_Operational_Api): Unit = {
    Contract(
      Modifies(api, failureHold, committedOutcome)
    )
    val report: Battery_Status_Assessment_Service.BatteryReport = api.get_battery_report() match {
      case Some(value) => value
      case _ => Battery_Status_Assessment_Service.BatteryReport.example()
    }
    val directive: Battery_Status_Assessment_Service.AcquisitionDirective.Type = api.get_acquisition_directive() match {
      case Some(value) => value
      case _ => Battery_Status_Assessment_Service.AcquisitionDirective.NoAcquisition
    }

    // The outgoing outcome reports the prior committed result; this evaluation
    // commits the result to be observed by CheckLifecycle on the next one.
    api.put_acquisition_outcome(committedOutcome)

    if (directive == Battery_Status_Assessment_Service.AcquisitionDirective.ResetAcquisition) {
      failureHold = F
      committedOutcome = Battery_Status_Assessment_Service.AcquisitionOutcome.AcquisitionReset
      api.put_status_read_request(Battery_Status_Assessment_Service.StatusReadRequest.NoRead)
      api.put_captured_report(noReport())
    } else if (failureHold) {
      committedOutcome = Battery_Status_Assessment_Service.AcquisitionOutcome.NoAcquisitionOutcome
      api.put_status_read_request(Battery_Status_Assessment_Service.StatusReadRequest.NoRead)
      api.put_captured_report(noReport())
    } else if (directive == Battery_Status_Assessment_Service.AcquisitionDirective.AcquireTokenA &&
      report.ticket == Battery_Status_Assessment_Service.ReportTicket.TokenA &&
      report.availability == Battery_Status_Assessment_Service.ReportAvailability.Present) {
      committedOutcome = Battery_Status_Assessment_Service.AcquisitionOutcome.CapturedTokenA
      api.put_status_read_request(Battery_Status_Assessment_Service.StatusReadRequest.ReadTokenA)
      api.put_captured_report(Battery_Status_Assessment_Service.CapturedReport(
        report.ticket, report.availability, report.level, report.quality))
    } else if (directive == Battery_Status_Assessment_Service.AcquisitionDirective.AcquireTokenB &&
      report.ticket == Battery_Status_Assessment_Service.ReportTicket.TokenB &&
      report.availability == Battery_Status_Assessment_Service.ReportAvailability.Present) {
      committedOutcome = Battery_Status_Assessment_Service.AcquisitionOutcome.CapturedTokenB
      api.put_status_read_request(Battery_Status_Assessment_Service.StatusReadRequest.ReadTokenB)
      api.put_captured_report(Battery_Status_Assessment_Service.CapturedReport(
        report.ticket, report.availability, report.level, report.quality))
    } else if (directive == Battery_Status_Assessment_Service.AcquisitionDirective.AcquireTokenA ||
      directive == Battery_Status_Assessment_Service.AcquisitionDirective.AcquireTokenB) {
      failureHold = T
      committedOutcome = Battery_Status_Assessment_Service.AcquisitionOutcome.AcquisitionFault
      api.put_status_read_request(
        if (directive == Battery_Status_Assessment_Service.AcquisitionDirective.AcquireTokenA)
          Battery_Status_Assessment_Service.StatusReadRequest.ReadTokenA
        else Battery_Status_Assessment_Service.StatusReadRequest.ReadTokenB)
      api.put_captured_report(noReport())
    } else {
      committedOutcome = Battery_Status_Assessment_Service.AcquisitionOutcome.NoAcquisitionOutcome
      api.put_status_read_request(Battery_Status_Assessment_Service.StatusReadRequest.NoRead)
      api.put_captured_report(noReport())
    }
  }

  def finalise(api: ReportAcquisition_Operational_Api): Unit = { }
}
