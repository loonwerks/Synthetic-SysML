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
    acquisitionState = AcquisitionState.Ready
    committedAcquisitionOutcome = AcquisitionOutcome.NoAcquisitionOutcome
    api.put_captured_report(Battery_Status_Assessment_Service.CapturedReport(ReportTicket.NoTicket, ReportAvailability.Absent, CapacityLevel.NoLevel, ReportQuality.NoQuality))
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
        //   N.md#ACQUISITION_RESET
        (api.acquisition_directive == AcquisitionDirective.ResetAcquisition) ___>: (acquisitionState == AcquisitionState.Ready &
          committedAcquisitionOutcome == AcquisitionOutcome.AcquisitionReset &
          api.status_read_request == StatusReadRequest.NoRead &
          api.captured_report.ticket == ReportTicket.NoTicket &
          api.captured_report.availability == ReportAvailability.Absent &
          api.captured_report.level == CapacityLevel.NoLevel &
          api.captured_report.quality == ReportQuality.NoQuality),
        // case ACQUISITION_HELD
        //   N.md#ACQUISITION_HELD
        (In(acquisitionState) == AcquisitionState.FailureHold &
          api.acquisition_directive != AcquisitionDirective.ResetAcquisition) ___>: (acquisitionState == AcquisitionState.FailureHold &
          committedAcquisitionOutcome == AcquisitionOutcome.NoAcquisitionOutcome &
          api.status_read_request == StatusReadRequest.NoRead &
          api.captured_report.ticket == ReportTicket.NoTicket &
          api.captured_report.availability == ReportAvailability.Absent &
          api.captured_report.level == CapacityLevel.NoLevel &
          api.captured_report.quality == ReportQuality.NoQuality),
        // case CAPTURE_TOKEN_A
        //   N.md#CAPTURE_TOKEN_A
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
        //   N.md#CAPTURE_TOKEN_B
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
        //   N.md#REQUESTED_ACQUISITION_FAULT
        (In(acquisitionState) == AcquisitionState.Ready &
          (api.acquisition_directive == AcquisitionDirective.AcquireTokenA &
            !(api.battery_report.ticket == ReportTicket.TokenA &
              api.battery_report.availability == ReportAvailability.Present) |
            api.acquisition_directive == AcquisitionDirective.AcquireTokenB &
              !(api.battery_report.ticket == ReportTicket.TokenB &
                api.battery_report.availability == ReportAvailability.Present))) ___>: (acquisitionState == AcquisitionState.FailureHold &
          committedAcquisitionOutcome == AcquisitionOutcome.AcquisitionFault &
          api.captured_report.ticket == ReportTicket.NoTicket &
          api.captured_report.availability == ReportAvailability.Absent &
          api.captured_report.level == CapacityLevel.NoLevel &
          api.captured_report.quality == ReportQuality.NoQuality),
        // case ACQUISITION_INACTIVE
        //   N.md#ACQUISITION_INACTIVE
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
    val report = api.get_battery_report().get
    val directive = api.get_acquisition_directive().get
    var captured = Battery_Status_Assessment_Service.CapturedReport(ReportTicket.NoTicket, ReportAvailability.Absent, CapacityLevel.NoLevel, ReportQuality.NoQuality)
    var request = StatusReadRequest.NoRead
    if (directive == AcquisitionDirective.ResetAcquisition) {
      acquisitionState = AcquisitionState.Ready
      committedAcquisitionOutcome = AcquisitionOutcome.AcquisitionReset
    } else if (acquisitionState == AcquisitionState.FailureHold) {
      committedAcquisitionOutcome = AcquisitionOutcome.NoAcquisitionOutcome
    } else if (directive == AcquisitionDirective.AcquireTokenA & report.ticket == ReportTicket.TokenA & report.availability == ReportAvailability.Present) {
      committedAcquisitionOutcome = AcquisitionOutcome.CapturedTokenA
      request = StatusReadRequest.ReadTokenA
      captured = Battery_Status_Assessment_Service.CapturedReport(report.ticket, report.availability, report.level, report.quality)
    } else if (directive == AcquisitionDirective.AcquireTokenB & report.ticket == ReportTicket.TokenB & report.availability == ReportAvailability.Present) {
      committedAcquisitionOutcome = AcquisitionOutcome.CapturedTokenB
      request = StatusReadRequest.ReadTokenB
      captured = Battery_Status_Assessment_Service.CapturedReport(report.ticket, report.availability, report.level, report.quality)
    } else if (directive == AcquisitionDirective.AcquireTokenA | directive == AcquisitionDirective.AcquireTokenB) {
      acquisitionState = AcquisitionState.FailureHold
      committedAcquisitionOutcome = AcquisitionOutcome.AcquisitionFault
    } else {
      committedAcquisitionOutcome = AcquisitionOutcome.NoAcquisitionOutcome
    }
    api.put_acquisition_outcome(committedAcquisitionOutcome)
    api.put_status_read_request(request)
    api.put_captured_report(captured)
  }

  def finalise(api: ReportAcquisition_Operational_Api): Unit = { }
}
