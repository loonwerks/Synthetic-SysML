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
    Contract(
      Modifies(api, acquisitionState, committedAcquisitionOutcome)
    )
    acquisitionState = AcquisitionState.Ready
    committedAcquisitionOutcome = AcquisitionOutcome.NoAcquisitionOutcome
    api.put_captured_report(CapturedReport(
      ReportTicket.NoTicket, ReportAvailability.Absent,
      CapacityLevel.NoLevel, ReportQuality.NoQuality))
    api.put_acquisition_outcome(AcquisitionOutcome.NoAcquisitionOutcome)
    api.put_status_read_request(StatusReadRequest.NoRead)
  }

  def timeTriggered(api: ReportAcquisition_Operational_Api): Unit = {
    Contract(
      Modifies(api, acquisitionState, committedAcquisitionOutcome),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
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
    val report = api.get_battery_report().get
    val directive = api.get_acquisition_directive().get
    val empty = CapturedReport(
      ReportTicket.NoTicket, ReportAvailability.Absent,
      CapacityLevel.NoLevel, ReportQuality.NoQuality)

    // The outward outcome is the committed value visible to the lifecycle
    // during this logical evaluation; the new value is committed afterward.
    api.put_acquisition_outcome(committedAcquisitionOutcome)

    if (directive == AcquisitionDirective.ResetAcquisition) {
      acquisitionState = AcquisitionState.Ready
      committedAcquisitionOutcome = AcquisitionOutcome.AcquisitionReset
      api.put_status_read_request(StatusReadRequest.NoRead)
      api.put_captured_report(empty)
    } else if (acquisitionState == AcquisitionState.FailureHold) {
      committedAcquisitionOutcome = AcquisitionOutcome.NoAcquisitionOutcome
      api.put_status_read_request(StatusReadRequest.NoRead)
      api.put_captured_report(empty)
    } else if (directive == AcquisitionDirective.AcquireTokenA &
      report.ticket == ReportTicket.TokenA &
      report.availability == ReportAvailability.Present) {
      committedAcquisitionOutcome = AcquisitionOutcome.CapturedTokenA
      api.put_status_read_request(StatusReadRequest.ReadTokenA)
      api.put_captured_report(CapturedReport(
        report.ticket, report.availability, report.level, report.quality))
    } else if (directive == AcquisitionDirective.AcquireTokenB &
      report.ticket == ReportTicket.TokenB &
      report.availability == ReportAvailability.Present) {
      committedAcquisitionOutcome = AcquisitionOutcome.CapturedTokenB
      api.put_status_read_request(StatusReadRequest.ReadTokenB)
      api.put_captured_report(CapturedReport(
        report.ticket, report.availability, report.level, report.quality))
    } else if (directive == AcquisitionDirective.AcquireTokenA) {
      acquisitionState = AcquisitionState.FailureHold
      committedAcquisitionOutcome = AcquisitionOutcome.AcquisitionFault
      api.put_status_read_request(StatusReadRequest.ReadTokenA)
      api.put_captured_report(empty)
    } else if (directive == AcquisitionDirective.AcquireTokenB) {
      acquisitionState = AcquisitionState.FailureHold
      committedAcquisitionOutcome = AcquisitionOutcome.AcquisitionFault
      api.put_status_read_request(StatusReadRequest.ReadTokenB)
      api.put_captured_report(empty)
    } else {
      committedAcquisitionOutcome = AcquisitionOutcome.NoAcquisitionOutcome
      api.put_status_read_request(StatusReadRequest.NoRead)
      api.put_captured_report(empty)
    }
  }

  def finalise(api: ReportAcquisition_Operational_Api): Unit = { }
}
