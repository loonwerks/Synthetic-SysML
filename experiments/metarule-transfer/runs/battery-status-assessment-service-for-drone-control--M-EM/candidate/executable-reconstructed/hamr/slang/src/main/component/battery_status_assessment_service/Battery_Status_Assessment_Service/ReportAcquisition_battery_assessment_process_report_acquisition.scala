// #Sireum

package battery_status_assessment_service.Battery_Status_Assessment_Service

import org.sireum._
import battery_status_assessment_service._

// This file will not be overwritten if HAMR codegen is rerun
object ReportAcquisition_battery_assessment_process_report_acquisition {

  // BEGIN STATE VARS
  var acquisitionState: Battery_Status_Assessment_Service.AcquisitionState.Type = Battery_Status_Assessment_Service.AcquisitionState.Ready

  var committedAcquisitionOutcome: Battery_Status_Assessment_Service.AcquisitionOutcome.Type = Battery_Status_Assessment_Service.AcquisitionOutcome.NoAcquisitionOutcome
  // END STATE VARS

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
    Contract(
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee PRIOR_ACQUISITION_OUTCOME
        api.acquisition_outcome == committedAcquisitionOutcome,
        // case ACQUISITION_RESET
        (api.acquisition_directive == AcquisitionDirective.ResetAcquisition) ___>: (acquisitionState == AcquisitionState.Ready &
          committedAcquisitionOutcome == AcquisitionOutcome.AcquisitionReset &
          api.status_read_request == StatusReadRequest.NoRead &
          api.captured_report.ticket == ReportTicket.NoTicket &
          api.captured_report.availability == ReportAvailability.Absent &
          api.captured_report.level == CapacityLevel.NoLevel &
          api.captured_report.quality == ReportQuality.NoQuality),
        // case ACQUISITION_HELD
        (api.acquisition_directive != AcquisitionDirective.ResetAcquisition &
          In(acquisitionState) == AcquisitionState.FailureHold) ___>: (acquisitionState == AcquisitionState.FailureHold &
          committedAcquisitionOutcome == AcquisitionOutcome.NoAcquisitionOutcome &
          api.status_read_request == StatusReadRequest.NoRead &
          api.captured_report.ticket == ReportTicket.NoTicket &
          api.captured_report.availability == ReportAvailability.Absent &
          api.captured_report.level == CapacityLevel.NoLevel &
          api.captured_report.quality == ReportQuality.NoQuality),
        // case CAPTURE_TOKEN_A
        (In(acquisitionState) == AcquisitionState.Ready &
          api.acquisition_directive == AcquisitionDirective.AcquireTokenA &
          api.battery_report.ticket == ReportTicket.TokenA &
          api.battery_report.availability == ReportAvailability.Present) ___>: (acquisitionState == AcquisitionState.Ready &
          committedAcquisitionOutcome == AcquisitionOutcome.CapturedTokenA &
          api.status_read_request == StatusReadRequest.ReadTokenA &
          api.captured_report.ticket == api.battery_report.ticket &
          api.captured_report.availability == api.battery_report.availability &
          api.captured_report.level == api.battery_report.level &
          api.captured_report.quality == api.battery_report.quality),
        // case CAPTURE_TOKEN_B
        (In(acquisitionState) == AcquisitionState.Ready &
          api.acquisition_directive == AcquisitionDirective.AcquireTokenB &
          api.battery_report.ticket == ReportTicket.TokenB &
          api.battery_report.availability == ReportAvailability.Present) ___>: (acquisitionState == AcquisitionState.Ready &
          committedAcquisitionOutcome == AcquisitionOutcome.CapturedTokenB &
          api.status_read_request == StatusReadRequest.ReadTokenB &
          api.captured_report.ticket == api.battery_report.ticket &
          api.captured_report.availability == api.battery_report.availability &
          api.captured_report.level == api.battery_report.level &
          api.captured_report.quality == api.battery_report.quality),
        // case REQUESTED_ACQUISITION_FAULT
        (In(acquisitionState) == AcquisitionState.Ready &
          (api.acquisition_directive == AcquisitionDirective.AcquireTokenA &
            !(api.battery_report.ticket == ReportTicket.TokenA &
              api.battery_report.availability == ReportAvailability.Present) |
            api.acquisition_directive == AcquisitionDirective.AcquireTokenB &
              !(api.battery_report.ticket == ReportTicket.TokenB &
                api.battery_report.availability == ReportAvailability.Present))) ___>: (acquisitionState == AcquisitionState.FailureHold &
          committedAcquisitionOutcome == AcquisitionOutcome.AcquisitionFault &
          (api.acquisition_directive == AcquisitionDirective.AcquireTokenA &
            api.status_read_request == StatusReadRequest.ReadTokenA |
            api.acquisition_directive == AcquisitionDirective.AcquireTokenB &
              api.status_read_request == StatusReadRequest.ReadTokenB) &
          api.captured_report.ticket == ReportTicket.NoTicket &
          api.captured_report.availability == ReportAvailability.Absent &
          api.captured_report.level == CapacityLevel.NoLevel &
          api.captured_report.quality == ReportQuality.NoQuality),
        // case ACQUISITION_INACTIVE
        (In(acquisitionState) == AcquisitionState.Ready &
          api.acquisition_directive == AcquisitionDirective.NoAcquisition) ___>: (acquisitionState == AcquisitionState.Ready &
          committedAcquisitionOutcome == AcquisitionOutcome.NoAcquisitionOutcome &
          api.status_read_request == StatusReadRequest.NoRead &
          api.captured_report.ticket == ReportTicket.NoTicket &
          api.captured_report.availability == ReportAvailability.Absent &
          api.captured_report.level == CapacityLevel.NoLevel &
          api.captured_report.quality == ReportQuality.NoQuality)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val apiUsage_battery_report: Option[Battery_Status_Assessment_Service.BatteryReport] = api.get_battery_report()
    api.logInfo(s"Received on data port battery_report: ${apiUsage_battery_report}")
    val apiUsage_acquisition_directive: Option[Battery_Status_Assessment_Service.AcquisitionDirective.Type] = api.get_acquisition_directive()
    api.logInfo(s"Received on data port acquisition_directive: ${apiUsage_acquisition_directive}")
  }

  def finalise(api: ReportAcquisition_Operational_Api): Unit = { }
}
