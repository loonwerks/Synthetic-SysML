// #Sireum

package battery_status_assessment_service.Battery_Status_Assessment_Service

import org.sireum._
import battery_status_assessment_service._

// This file will not be overwritten if HAMR codegen is rerun
object CheckLifecycle_battery_assessment_process_check_lifecycle {
  var recoveryHold: B = F
  var checking: B = F
  var awaitingUse: B = F
  var hasLastToken: B = F
  var lastToken: Battery_Status_Assessment_Service.CheckToken.Type =
    Battery_Status_Assessment_Service.CheckToken.TokenA

  def inactive(api: CheckLifecycle_Operational_Api, status: Battery_Status_Assessment_Service.CheckStatus.Type): Unit = {
    api.put_acquisition_directive(Battery_Status_Assessment_Service.AcquisitionDirective.NoAcquisition)
    api.put_assessment_context(Battery_Status_Assessment_Service.AssessmentContext.NoContext)
    api.put_publication_directive(Battery_Status_Assessment_Service.PublicationDirective.NoPublicationDirective)
    api.put_check_status(status)
  }

  def initialise(api: CheckLifecycle_Initialization_Api): Unit = {
    Contract(
      Modifies(api, recoveryHold, checking, awaitingUse, hasLastToken, lastToken)
    )
    recoveryHold = F
    checking = F
    awaitingUse = F
    hasLastToken = F
    lastToken = Battery_Status_Assessment_Service.CheckToken.TokenA
    api.put_acquisition_directive(Battery_Status_Assessment_Service.AcquisitionDirective.NoAcquisition)
    api.put_assessment_context(Battery_Status_Assessment_Service.AssessmentContext.NoContext)
    api.put_publication_directive(Battery_Status_Assessment_Service.PublicationDirective.NoPublicationDirective)
    api.put_check_status(Battery_Status_Assessment_Service.CheckStatus.Idle)
  }

  def timeTriggered(api: CheckLifecycle_Operational_Api): Unit = {
    Contract(
      Modifies(api, recoveryHold, checking, awaitingUse, hasLastToken, lastToken)
    )
    val request: Battery_Status_Assessment_Service.CheckRequest = api.get_check_request() match {
      case Some(value) => value
      case _ => Battery_Status_Assessment_Service.CheckRequest.example()
    }
    val acquisition: Battery_Status_Assessment_Service.AcquisitionOutcome.Type = api.get_acquisition_outcome() match {
      case Some(value) => value
      case _ => Battery_Status_Assessment_Service.AcquisitionOutcome.NoAcquisitionOutcome
    }
    val publication: Battery_Status_Assessment_Service.PublicationOutcome.Type = api.get_publication_outcome() match {
      case Some(value) => value
      case _ => Battery_Status_Assessment_Service.PublicationOutcome.NoPublicationOutcome
    }

    if (!recoveryHold && publication == Battery_Status_Assessment_Service.PublicationOutcome.PublicationFault) {
      recoveryHold = T
      checking = F
      awaitingUse = F
      inactive(api, Battery_Status_Assessment_Service.CheckStatus.PublicationFailed)
    } else if (!recoveryHold && acquisition == Battery_Status_Assessment_Service.AcquisitionOutcome.AcquisitionFault) {
      recoveryHold = T
      checking = F
      awaitingUse = F
      inactive(api, Battery_Status_Assessment_Service.CheckStatus.AcquisitionFailed)
    } else if (recoveryHold &&
      acquisition == Battery_Status_Assessment_Service.AcquisitionOutcome.AcquisitionReset &&
      publication == Battery_Status_Assessment_Service.PublicationOutcome.PublicationReset) {
      recoveryHold = F
      checking = F
      awaitingUse = F
      inactive(api, Battery_Status_Assessment_Service.CheckStatus.ResetCompleted)
    } else if (recoveryHold && request.command == Battery_Status_Assessment_Service.CheckCommand.Reset) {
      checking = F
      awaitingUse = F
      api.put_acquisition_directive(Battery_Status_Assessment_Service.AcquisitionDirective.ResetAcquisition)
      api.put_assessment_context(Battery_Status_Assessment_Service.AssessmentContext.NoContext)
      api.put_publication_directive(Battery_Status_Assessment_Service.PublicationDirective.ResetPublication)
      api.put_check_status(Battery_Status_Assessment_Service.CheckStatus.RecoveryRequired)
    } else if (recoveryHold) {
      checking = F
      awaitingUse = F
      inactive(api, Battery_Status_Assessment_Service.CheckStatus.RecoveryRequired)
    } else if (publication == Battery_Status_Assessment_Service.PublicationOutcome.Consumed) {
      checking = F
      awaitingUse = F
      inactive(api, Battery_Status_Assessment_Service.CheckStatus.Completed)
    } else if ((checking || awaitingUse) &&
      request.command == Battery_Status_Assessment_Service.CheckCommand.Cancel) {
      checking = F
      awaitingUse = F
      api.put_acquisition_directive(Battery_Status_Assessment_Service.AcquisitionDirective.NoAcquisition)
      api.put_assessment_context(Battery_Status_Assessment_Service.AssessmentContext.NoContext)
      api.put_publication_directive(Battery_Status_Assessment_Service.PublicationDirective.Withdraw)
      api.put_check_status(Battery_Status_Assessment_Service.CheckStatus.Cancelled)
    } else if (!checking && !awaitingUse &&
      request.command == Battery_Status_Assessment_Service.CheckCommand.Start) {
      val duplicate = hasLastToken && request.token == lastToken
      if (duplicate) {
        inactive(api, Battery_Status_Assessment_Service.CheckStatus.DuplicateIgnored)
      } else {
        checking = T
        awaitingUse = F
        hasLastToken = T
        lastToken = request.token
        if (request.token == Battery_Status_Assessment_Service.CheckToken.TokenA) {
          api.put_acquisition_directive(Battery_Status_Assessment_Service.AcquisitionDirective.AcquireTokenA)
          api.put_assessment_context(Battery_Status_Assessment_Service.AssessmentContext.AssessTokenA)
          api.put_publication_directive(Battery_Status_Assessment_Service.PublicationDirective.OpenTokenA)
        } else {
          api.put_acquisition_directive(Battery_Status_Assessment_Service.AcquisitionDirective.AcquireTokenB)
          api.put_assessment_context(Battery_Status_Assessment_Service.AssessmentContext.AssessTokenB)
          api.put_publication_directive(Battery_Status_Assessment_Service.PublicationDirective.OpenTokenB)
        }
        api.put_check_status(Battery_Status_Assessment_Service.CheckStatus.Checking)
      }
    } else if ((checking || awaitingUse) &&
      request.command == Battery_Status_Assessment_Service.CheckCommand.Start) {
      inactive(api, Battery_Status_Assessment_Service.CheckStatus.Busy)
    } else if (checking &&
      ((lastToken == Battery_Status_Assessment_Service.CheckToken.TokenA &&
        acquisition == Battery_Status_Assessment_Service.AcquisitionOutcome.CapturedTokenA &&
        publication == Battery_Status_Assessment_Service.PublicationOutcome.OfferedTokenA) ||
       (lastToken == Battery_Status_Assessment_Service.CheckToken.TokenB &&
        acquisition == Battery_Status_Assessment_Service.AcquisitionOutcome.CapturedTokenB &&
        publication == Battery_Status_Assessment_Service.PublicationOutcome.OfferedTokenB))) {
      checking = F
      awaitingUse = T
      inactive(api, Battery_Status_Assessment_Service.CheckStatus.Available)
    } else if (awaitingUse) {
      inactive(api, Battery_Status_Assessment_Service.CheckStatus.Available)
    } else if (checking) {
      inactive(api, Battery_Status_Assessment_Service.CheckStatus.Checking)
    } else {
      inactive(api, Battery_Status_Assessment_Service.CheckStatus.Idle)
    }
  }

  def finalise(api: CheckLifecycle_Operational_Api): Unit = { }
}
