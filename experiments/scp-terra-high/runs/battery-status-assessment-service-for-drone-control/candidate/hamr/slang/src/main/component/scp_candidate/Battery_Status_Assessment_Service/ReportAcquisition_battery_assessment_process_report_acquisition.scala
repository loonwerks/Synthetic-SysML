// #Sireum

package scp_candidate.Battery_Status_Assessment_Service

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object ReportAcquisition_battery_assessment_process_report_acquisition {

  // BEGIN STATE VARS
  var acquisitionState: Battery_Status_Assessment_Service.AcquisitionState.Type = Battery_Status_Assessment_Service.AcquisitionState.Ready

  var committedAcquisitionOutcome: Battery_Status_Assessment_Service.AcquisitionOutcome.Type = Battery_Status_Assessment_Service.AcquisitionOutcome.NoAcquisitionOutcome
  // END STATE VARS

  def initialise(api: ReportAcquisition_Initialization_Api): Unit = {
    Contract(
      Modifies(acquisitionState, committedAcquisitionOutcome, api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_ACQUISITION_SAFE
        acquisitionState == AcquisitionState.Ready &
          committedAcquisitionOutcome == AcquisitionOutcome.NoAcquisitionOutcome &
          api.acquisition_outcome == AcquisitionOutcome.NoAcquisitionOutcome &
          api.status_read_request == StatusReadRequest.NoRead &
          api.captured_report.ticket == ReportTicket.NoTicket &
          api.captured_report.availability == ReportAvailability.Absent &
          api.captured_report.level == CapacityLevel.NoLevel &
          api.captured_report.quality == ReportQuality.NoQuality
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    acquisitionState = AcquisitionState.Ready
    committedAcquisitionOutcome = AcquisitionOutcome.NoAcquisitionOutcome
    api.put_captured_report(CapturedReport(ReportTicket.NoTicket, ReportAvailability.Absent, CapacityLevel.NoLevel, ReportQuality.NoQuality))
    api.put_acquisition_outcome(Battery_Status_Assessment_Service.AcquisitionOutcome.NoAcquisitionOutcome)
    api.put_status_read_request(Battery_Status_Assessment_Service.StatusReadRequest.NoRead)
  }

  def finalise(api: ReportAcquisition_Operational_Api): Unit = { }

  def timeTriggered(api: ReportAcquisition_Operational_Api): Unit = {
    Contract(
      Modifies(acquisitionState, committedAcquisitionOutcome, api)
    )
    val directive: AcquisitionDirective.Type = api.get_acquisition_directive().get
    val report: BatteryReport = api.get_battery_report().get
    val empty: CapturedReport = CapturedReport(ReportTicket.NoTicket, ReportAvailability.Absent, CapacityLevel.NoLevel, ReportQuality.NoQuality)

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
    } else if (directive == AcquisitionDirective.AcquireTokenA) {
      api.put_status_read_request(StatusReadRequest.ReadTokenA)
      if (report.ticket == ReportTicket.TokenA && report.availability == ReportAvailability.Present) {
        committedAcquisitionOutcome = AcquisitionOutcome.CapturedTokenA
        api.put_captured_report(CapturedReport(report.ticket, report.availability, report.level, report.quality))
      } else {
        acquisitionState = AcquisitionState.FailureHold
        committedAcquisitionOutcome = AcquisitionOutcome.AcquisitionFault
        api.put_captured_report(empty)
      }
    } else if (directive == AcquisitionDirective.AcquireTokenB) {
      api.put_status_read_request(StatusReadRequest.ReadTokenB)
      if (report.ticket == ReportTicket.TokenB && report.availability == ReportAvailability.Present) {
        committedAcquisitionOutcome = AcquisitionOutcome.CapturedTokenB
        api.put_captured_report(CapturedReport(report.ticket, report.availability, report.level, report.quality))
      } else {
        acquisitionState = AcquisitionState.FailureHold
        committedAcquisitionOutcome = AcquisitionOutcome.AcquisitionFault
        api.put_captured_report(empty)
      }
    } else {
      committedAcquisitionOutcome = AcquisitionOutcome.NoAcquisitionOutcome
      api.put_status_read_request(StatusReadRequest.NoRead)
      api.put_captured_report(empty)
    }
  }
}
