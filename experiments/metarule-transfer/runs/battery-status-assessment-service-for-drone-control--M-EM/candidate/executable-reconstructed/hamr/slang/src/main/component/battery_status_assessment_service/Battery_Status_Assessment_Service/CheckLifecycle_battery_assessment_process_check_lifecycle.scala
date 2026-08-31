// #Sireum

package battery_status_assessment_service.Battery_Status_Assessment_Service

import org.sireum._
import battery_status_assessment_service._

// This file will not be overwritten if HAMR codegen is rerun
object CheckLifecycle_battery_assessment_process_check_lifecycle {

  // BEGIN STATE VARS
  var lifecycleState: Battery_Status_Assessment_Service.LifecycleState.Type = Battery_Status_Assessment_Service.LifecycleState.Idle

  var lastAdmittedToken: Battery_Status_Assessment_Service.LastAdmittedToken.Type = Battery_Status_Assessment_Service.LastAdmittedToken.None
  // END STATE VARS

  def initialise(api: CheckLifecycle_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_acquisition_directive(Battery_Status_Assessment_Service.AcquisitionDirective.NoAcquisition)
    api.put_assessment_context(Battery_Status_Assessment_Service.AssessmentContext.NoContext)
    api.put_publication_directive(Battery_Status_Assessment_Service.PublicationDirective.NoPublicationDirective)
    api.put_check_status(Battery_Status_Assessment_Service.CheckStatus.Idle)
  }

  def timeTriggered(api: CheckLifecycle_Operational_Api): Unit = {
    Contract(
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case PRIOR_PUBLICATION_FAULT
        (In(lifecycleState) != LifecycleState.RecoveryHold &
          api.publication_outcome == PublicationOutcome.PublicationFault) ___>: (lifecycleState == LifecycleState.RecoveryHold &
          api.acquisition_directive == AcquisitionDirective.NoAcquisition &
          api.assessment_context == AssessmentContext.NoContext &
          api.publication_directive == PublicationDirective.NoPublicationDirective &
          api.check_status == CheckStatus.PublicationFailed),
        // case PRIOR_ACQUISITION_FAULT
        (In(lifecycleState) != LifecycleState.RecoveryHold &
          api.publication_outcome != PublicationOutcome.PublicationFault &
          api.acquisition_outcome == AcquisitionOutcome.AcquisitionFault) ___>: (lifecycleState == LifecycleState.RecoveryHold &
          api.acquisition_directive == AcquisitionDirective.NoAcquisition &
          api.assessment_context == AssessmentContext.NoContext &
          api.publication_directive == PublicationDirective.NoPublicationDirective &
          api.check_status == CheckStatus.AcquisitionFailed),
        // case RESET_CONFIRMATIONS
        (In(lifecycleState) == LifecycleState.RecoveryHold &
          api.acquisition_outcome == AcquisitionOutcome.AcquisitionReset &
          api.publication_outcome == PublicationOutcome.PublicationReset) ___>: (lifecycleState == LifecycleState.Idle &
          api.acquisition_directive == AcquisitionDirective.NoAcquisition &
          api.assessment_context == AssessmentContext.NoContext &
          api.publication_directive == PublicationDirective.NoPublicationDirective &
          api.check_status == CheckStatus.ResetCompleted),
        // case RESET_IN_RECOVERY
        (In(lifecycleState) == LifecycleState.RecoveryHold &
          !(api.acquisition_outcome == AcquisitionOutcome.AcquisitionReset &
            api.publication_outcome == PublicationOutcome.PublicationReset) &
          api.check_request.command == CheckCommand.Reset) ___>: (lifecycleState == LifecycleState.RecoveryHold &
          api.acquisition_directive == AcquisitionDirective.ResetAcquisition &
          api.assessment_context == AssessmentContext.NoContext &
          api.publication_directive == PublicationDirective.ResetPublication &
          api.check_status == CheckStatus.RecoveryRequired),
        // case RECOVERY_BLOCKS_NONRESET
        (In(lifecycleState) == LifecycleState.RecoveryHold &
          !(api.acquisition_outcome == AcquisitionOutcome.AcquisitionReset &
            api.publication_outcome == PublicationOutcome.PublicationReset) &
          api.check_request.command != CheckCommand.Reset) ___>: (lifecycleState == LifecycleState.RecoveryHold &
          api.acquisition_directive == AcquisitionDirective.NoAcquisition &
          api.assessment_context == AssessmentContext.NoContext &
          api.publication_directive == PublicationDirective.NoPublicationDirective &
          api.check_status == CheckStatus.RecoveryRequired),
        // case PRIOR_CONSUMPTION_COMPLETES
        (In(lifecycleState) != LifecycleState.RecoveryHold &
          api.publication_outcome != PublicationOutcome.PublicationFault &
          api.acquisition_outcome != AcquisitionOutcome.AcquisitionFault &
          api.publication_outcome == PublicationOutcome.Consumed) ___>: (lifecycleState == LifecycleState.Idle &
          api.acquisition_directive == AcquisitionDirective.NoAcquisition &
          api.assessment_context == AssessmentContext.NoContext &
          api.publication_directive == PublicationDirective.NoPublicationDirective &
          api.check_status == CheckStatus.Completed),
        // case ACTIVE_CANCEL
        ((In(lifecycleState) == LifecycleState.Checking |
          In(lifecycleState) == LifecycleState.AwaitingUse) &
          api.publication_outcome != PublicationOutcome.PublicationFault &
          api.acquisition_outcome != AcquisitionOutcome.AcquisitionFault &
          api.publication_outcome != PublicationOutcome.Consumed &
          api.check_request.command == CheckCommand.Cancel) ___>: (lifecycleState == LifecycleState.Idle &
          api.acquisition_directive == AcquisitionDirective.NoAcquisition &
          api.assessment_context == AssessmentContext.NoContext &
          api.publication_directive == PublicationDirective.Withdraw &
          api.check_status == CheckStatus.Cancelled),
        // case IDLE_DUPLICATE_TOKEN_A
        (In(lifecycleState) == LifecycleState.Idle &
          In(lastAdmittedToken) == LastAdmittedToken.TokenA &
          api.publication_outcome != PublicationOutcome.PublicationFault &
          api.acquisition_outcome != AcquisitionOutcome.AcquisitionFault &
          api.publication_outcome != PublicationOutcome.Consumed &
          api.check_request.command == CheckCommand.Start &
          api.check_request.token == CheckToken.TokenA) ___>: (lifecycleState == LifecycleState.Idle &
          api.acquisition_directive == AcquisitionDirective.NoAcquisition &
          api.assessment_context == AssessmentContext.NoContext &
          api.publication_directive == PublicationDirective.NoPublicationDirective &
          api.check_status == CheckStatus.DuplicateIgnored),
        // case IDLE_DUPLICATE_TOKEN_B
        (In(lifecycleState) == LifecycleState.Idle &
          In(lastAdmittedToken) == LastAdmittedToken.TokenB &
          api.publication_outcome != PublicationOutcome.PublicationFault &
          api.acquisition_outcome != AcquisitionOutcome.AcquisitionFault &
          api.publication_outcome != PublicationOutcome.Consumed &
          api.check_request.command == CheckCommand.Start &
          api.check_request.token == CheckToken.TokenB) ___>: (lifecycleState == LifecycleState.Idle &
          api.acquisition_directive == AcquisitionDirective.NoAcquisition &
          api.assessment_context == AssessmentContext.NoContext &
          api.publication_directive == PublicationDirective.NoPublicationDirective &
          api.check_status == CheckStatus.DuplicateIgnored),
        // case FRESH_TOKEN_A_START
        (In(lifecycleState) == LifecycleState.Idle &
          In(lastAdmittedToken) != LastAdmittedToken.TokenA &
          api.publication_outcome != PublicationOutcome.PublicationFault &
          api.acquisition_outcome != AcquisitionOutcome.AcquisitionFault &
          api.publication_outcome != PublicationOutcome.Consumed &
          api.check_request.command == CheckCommand.Start &
          api.check_request.token == CheckToken.TokenA) ___>: (lifecycleState == LifecycleState.Checking &
          lastAdmittedToken == LastAdmittedToken.TokenA &
          api.acquisition_directive == AcquisitionDirective.AcquireTokenA &
          api.assessment_context == AssessmentContext.AssessTokenA &
          api.publication_directive == PublicationDirective.OpenTokenA &
          api.check_status == CheckStatus.Checking),
        // case FRESH_TOKEN_B_START
        (In(lifecycleState) == LifecycleState.Idle &
          In(lastAdmittedToken) != LastAdmittedToken.TokenB &
          api.publication_outcome != PublicationOutcome.PublicationFault &
          api.acquisition_outcome != AcquisitionOutcome.AcquisitionFault &
          api.publication_outcome != PublicationOutcome.Consumed &
          api.check_request.command == CheckCommand.Start &
          api.check_request.token == CheckToken.TokenB) ___>: (lifecycleState == LifecycleState.Checking &
          lastAdmittedToken == LastAdmittedToken.TokenB &
          api.acquisition_directive == AcquisitionDirective.AcquireTokenB &
          api.assessment_context == AssessmentContext.AssessTokenB &
          api.publication_directive == PublicationDirective.OpenTokenB &
          api.check_status == CheckStatus.Checking),
        // case ACTIVE_START_BUSY
        ((In(lifecycleState) == LifecycleState.Checking |
          In(lifecycleState) == LifecycleState.AwaitingUse) &
          api.publication_outcome != PublicationOutcome.PublicationFault &
          api.acquisition_outcome != AcquisitionOutcome.AcquisitionFault &
          api.publication_outcome != PublicationOutcome.Consumed &
          api.check_request.command == CheckCommand.Start) ___>: (api.acquisition_directive == AcquisitionDirective.NoAcquisition &
          api.assessment_context == AssessmentContext.NoContext &
          api.publication_directive == PublicationDirective.NoPublicationDirective &
          api.check_status == CheckStatus.Busy),
        // case CHECK_BECOMES_AVAILABLE
        (In(lifecycleState) == LifecycleState.Checking &
          api.publication_outcome != PublicationOutcome.PublicationFault &
          api.acquisition_outcome != AcquisitionOutcome.AcquisitionFault &
          api.publication_outcome != PublicationOutcome.Consumed &
          api.check_request.command != CheckCommand.Start &
          api.check_request.command != CheckCommand.Cancel &
          (In(lastAdmittedToken) == LastAdmittedToken.TokenA &
            api.acquisition_outcome == AcquisitionOutcome.CapturedTokenA &
            api.publication_outcome == PublicationOutcome.OfferedTokenA |
            In(lastAdmittedToken) == LastAdmittedToken.TokenB &
              api.acquisition_outcome == AcquisitionOutcome.CapturedTokenB &
              api.publication_outcome == PublicationOutcome.OfferedTokenB)) ___>: (lifecycleState == LifecycleState.AwaitingUse &
          api.acquisition_directive == AcquisitionDirective.NoAcquisition &
          api.assessment_context == AssessmentContext.NoContext &
          api.publication_directive == PublicationDirective.NoPublicationDirective &
          api.check_status == CheckStatus.Available),
        // case ORDINARY_NONHOLD
        (In(lifecycleState) != LifecycleState.RecoveryHold) ___>: (api.acquisition_directive == AcquisitionDirective.NoAcquisition &
          api.assessment_context == AssessmentContext.NoContext &
          api.publication_directive == PublicationDirective.NoPublicationDirective)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val apiUsage_check_request: Option[Battery_Status_Assessment_Service.CheckRequest] = api.get_check_request()
    api.logInfo(s"Received on data port check_request: ${apiUsage_check_request}")
    val apiUsage_acquisition_outcome: Option[Battery_Status_Assessment_Service.AcquisitionOutcome.Type] = api.get_acquisition_outcome()
    api.logInfo(s"Received on data port acquisition_outcome: ${apiUsage_acquisition_outcome}")
    val apiUsage_publication_outcome: Option[Battery_Status_Assessment_Service.PublicationOutcome.Type] = api.get_publication_outcome()
    api.logInfo(s"Received on data port publication_outcome: ${apiUsage_publication_outcome}")
  }

  def finalise(api: CheckLifecycle_Operational_Api): Unit = { }
}
