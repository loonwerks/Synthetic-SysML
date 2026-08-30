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
      Modifies(
        api,
        acquisitionState,
        committedAcquisitionOutcome
      ),
      Ensures(
        // BEGIN INITIALIZES ENSURES timeTriggered
        // guarantee INITIAL_ACQUISITION_SAFE
        //   acquisitionState is Ready, committedAcquisitionOutcome is
        //   NoAcquisitionOutcome, status read request is NoRead, captured
        //   report ticket is NoTicket, captured report availability is
        //   Absent, captured report level is NoLevel, and captured report
        //   quality is NoQuality
        acquisitionState == Battery_Status_Assessment_Service.AcquisitionState.Ready &
          committedAcquisitionOutcome == Battery_Status_Assessment_Service.AcquisitionOutcome.NoAcquisitionOutcome &
          api.status_read_request == Battery_Status_Assessment_Service.StatusReadRequest.NoRead &
          api.captured_report.ticket == Battery_Status_Assessment_Service.ReportTicket.NoTicket &
          api.captured_report.availability == Battery_Status_Assessment_Service.ReportAvailability.Absent &
          api.captured_report.level == Battery_Status_Assessment_Service.CapacityLevel.NoLevel &
          api.captured_report.quality == Battery_Status_Assessment_Service.ReportQuality.NoQuality
        // END INITIALIZES ENSURES timeTriggered
      )
    )
    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    acquisitionState = Battery_Status_Assessment_Service.AcquisitionState.Ready
    committedAcquisitionOutcome = Battery_Status_Assessment_Service.AcquisitionOutcome.NoAcquisitionOutcome
    api.put_status_read_request(Battery_Status_Assessment_Service.StatusReadRequest.NoRead)
    api.put_captured_report(
      Battery_Status_Assessment_Service.CapturedReport(
        ticket = Battery_Status_Assessment_Service.ReportTicket.NoTicket,
        availability = Battery_Status_Assessment_Service.ReportAvailability.Absent,
        level = Battery_Status_Assessment_Service.CapacityLevel.NoLevel,
        quality = Battery_Status_Assessment_Service.ReportQuality.NoQuality))
    api.put_acquisition_outcome(Battery_Status_Assessment_Service.AcquisitionOutcome.NoAcquisitionOutcome)
  }

  def timeTriggered(api: ReportAcquisition_Operational_Api): Unit = {
    Contract(
      Modifies(
        // BEGIN COMPUTE MODIFIES timeTriggered
        api,
        acquisitionState,
        committedAcquisitionOutcome
        // END COMPUTE MODIFIES timeTriggered
      ),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee PRIOR_ACQUISITION_OUTCOME
        //   publish committed acquisition outcome
        api.acquisition_outcome == In(committedAcquisitionOutcome),
        // case ACQUISITION_RESET
        //   reset acquisition directive
        (api.acquisition_directive == AcquisitionDirective.ResetAcquisition) ___>: (acquisitionState == AcquisitionState.Ready &
          committedAcquisitionOutcome == AcquisitionOutcome.AcquisitionReset &
          api.status_read_request == StatusReadRequest.NoRead &
          api.captured_report.ticket == ReportTicket.NoTicket &
          api.captured_report.availability == ReportAvailability.Absent &
          api.captured_report.level == CapacityLevel.NoLevel &
          api.captured_report.quality == ReportQuality.NoQuality),
        // case ACQUISITION_HELD
        //   retained in failure hold
        (api.acquisition_directive != AcquisitionDirective.ResetAcquisition &
          In(acquisitionState) == AcquisitionState.FailureHold) ___>: (acquisitionState == AcquisitionState.FailureHold &
          committedAcquisitionOutcome == AcquisitionOutcome.NoAcquisitionOutcome &
          api.status_read_request == StatusReadRequest.NoRead &
          api.captured_report.ticket == ReportTicket.NoTicket &
          api.captured_report.availability == ReportAvailability.Absent &
          api.captured_report.level == CapacityLevel.NoLevel &
          api.captured_report.quality == ReportQuality.NoQuality),
        // case CAPTURE_TOKEN_A
        //   capture token A report
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
        //   capture token B report
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
        //   report missing for acquisition directive
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
        //   no acquisition directive
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

    // guarantee PRIOR_ACQUISITION_OUTCOME: publish committed acquisition outcome
    api.put_acquisition_outcome(committedAcquisitionOutcome)

    val br: Battery_Status_Assessment_Service.BatteryReport = apiUsage_battery_report.get
    val acqDirective: Battery_Status_Assessment_Service.AcquisitionDirective.Type = apiUsage_acquisition_directive.get
    val entryAcqState: Battery_Status_Assessment_Service.AcquisitionState.Type = acquisitionState

    var newAcqState: Battery_Status_Assessment_Service.AcquisitionState.Type = entryAcqState
    var newCommittedOutcome: Battery_Status_Assessment_Service.AcquisitionOutcome.Type = Battery_Status_Assessment_Service.AcquisitionOutcome.NoAcquisitionOutcome
    var newStatusReadRequest: Battery_Status_Assessment_Service.StatusReadRequest.Type = Battery_Status_Assessment_Service.StatusReadRequest.NoRead
    var newCapturedReport: Battery_Status_Assessment_Service.CapturedReport =
      Battery_Status_Assessment_Service.CapturedReport(
        ticket = Battery_Status_Assessment_Service.ReportTicket.NoTicket,
        availability = Battery_Status_Assessment_Service.ReportAvailability.Absent,
        level = Battery_Status_Assessment_Service.CapacityLevel.NoLevel,
        quality = Battery_Status_Assessment_Service.ReportQuality.NoQuality)

    if (acqDirective == Battery_Status_Assessment_Service.AcquisitionDirective.ResetAcquisition) {
      // case ACQUISITION_RESET
      newAcqState = Battery_Status_Assessment_Service.AcquisitionState.Ready
      newCommittedOutcome = Battery_Status_Assessment_Service.AcquisitionOutcome.AcquisitionReset
      newStatusReadRequest = Battery_Status_Assessment_Service.StatusReadRequest.NoRead
    } else if (entryAcqState == Battery_Status_Assessment_Service.AcquisitionState.FailureHold) {
      // case ACQUISITION_HELD
      newAcqState = Battery_Status_Assessment_Service.AcquisitionState.FailureHold
      newCommittedOutcome = Battery_Status_Assessment_Service.AcquisitionOutcome.NoAcquisitionOutcome
      newStatusReadRequest = Battery_Status_Assessment_Service.StatusReadRequest.NoRead
    } else if (entryAcqState == Battery_Status_Assessment_Service.AcquisitionState.Ready &
      acqDirective == Battery_Status_Assessment_Service.AcquisitionDirective.AcquireTokenA &
      br.ticket == Battery_Status_Assessment_Service.ReportTicket.TokenA &
      br.availability == Battery_Status_Assessment_Service.ReportAvailability.Present) {
      // case CAPTURE_TOKEN_A
      newAcqState = Battery_Status_Assessment_Service.AcquisitionState.Ready
      newCommittedOutcome = Battery_Status_Assessment_Service.AcquisitionOutcome.CapturedTokenA
      newStatusReadRequest = Battery_Status_Assessment_Service.StatusReadRequest.ReadTokenA
      newCapturedReport =
        Battery_Status_Assessment_Service.CapturedReport(
          ticket = br.ticket,
          availability = br.availability,
          level = br.level,
          quality = br.quality)
    } else if (entryAcqState == Battery_Status_Assessment_Service.AcquisitionState.Ready &
      acqDirective == Battery_Status_Assessment_Service.AcquisitionDirective.AcquireTokenB &
      br.ticket == Battery_Status_Assessment_Service.ReportTicket.TokenB &
      br.availability == Battery_Status_Assessment_Service.ReportAvailability.Present) {
      // case CAPTURE_TOKEN_B
      newAcqState = Battery_Status_Assessment_Service.AcquisitionState.Ready
      newCommittedOutcome = Battery_Status_Assessment_Service.AcquisitionOutcome.CapturedTokenB
      newStatusReadRequest = Battery_Status_Assessment_Service.StatusReadRequest.ReadTokenB
      newCapturedReport =
        Battery_Status_Assessment_Service.CapturedReport(
          ticket = br.ticket,
          availability = br.availability,
          level = br.level,
          quality = br.quality)
    } else if (entryAcqState == Battery_Status_Assessment_Service.AcquisitionState.Ready &
      !((acqDirective == Battery_Status_Assessment_Service.AcquisitionDirective.AcquireTokenA &
        br.ticket == Battery_Status_Assessment_Service.ReportTicket.TokenA &
        br.availability == Battery_Status_Assessment_Service.ReportAvailability.Present) |
        (acqDirective == Battery_Status_Assessment_Service.AcquisitionDirective.AcquireTokenB &
          br.ticket == Battery_Status_Assessment_Service.ReportTicket.TokenB &
          br.availability == Battery_Status_Assessment_Service.ReportAvailability.Present))) {
      // case REQUESTED_ACQUISITION_FAULT (covers Ready + directive AcquireTokenA/B with missing report)
      newAcqState = Battery_Status_Assessment_Service.AcquisitionState.FailureHold
      newCommittedOutcome = Battery_Status_Assessment_Service.AcquisitionOutcome.AcquisitionFault
      newStatusReadRequest =
        if (acqDirective == Battery_Status_Assessment_Service.AcquisitionDirective.AcquireTokenA)
          Battery_Status_Assessment_Service.StatusReadRequest.ReadTokenA
        else Battery_Status_Assessment_Service.StatusReadRequest.ReadTokenB
    } else {
      // case ACQUISITION_INACTIVE (Ready + NoAcquisition)
      newAcqState = Battery_Status_Assessment_Service.AcquisitionState.Ready
      newCommittedOutcome = Battery_Status_Assessment_Service.AcquisitionOutcome.NoAcquisitionOutcome
      newStatusReadRequest = Battery_Status_Assessment_Service.StatusReadRequest.NoRead
    }

    acquisitionState = newAcqState
    committedAcquisitionOutcome = newCommittedOutcome
    api.put_status_read_request(newStatusReadRequest)
    api.put_captured_report(newCapturedReport)
  }

  def finalise(api: ReportAcquisition_Operational_Api): Unit = { }
}
