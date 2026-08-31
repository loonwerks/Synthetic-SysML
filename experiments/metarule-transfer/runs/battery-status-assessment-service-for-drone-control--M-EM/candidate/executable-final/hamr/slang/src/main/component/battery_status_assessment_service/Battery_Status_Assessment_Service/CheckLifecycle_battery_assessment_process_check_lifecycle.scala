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
    Contract(
      Modifies(api, lifecycleState, lastAdmittedToken)
    )
    lifecycleState = LifecycleState.Idle
    lastAdmittedToken = LastAdmittedToken.None
    api.put_acquisition_directive(AcquisitionDirective.NoAcquisition)
    api.put_assessment_context(AssessmentContext.NoContext)
    api.put_publication_directive(PublicationDirective.NoPublicationDirective)
    api.put_check_status(CheckStatus.Idle)
  }

  def timeTriggered(api: CheckLifecycle_Operational_Api): Unit = {
    Contract(
      Modifies(api, lifecycleState, lastAdmittedToken),
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
        (In(lifecycleState) == LifecycleState.Idle &
          api.publication_outcome != PublicationOutcome.PublicationFault &
          api.acquisition_outcome != AcquisitionOutcome.AcquisitionFault &
          api.publication_outcome != PublicationOutcome.Consumed &
          api.check_request.command != CheckCommand.Start) ___>: (api.acquisition_directive == AcquisitionDirective.NoAcquisition &
          api.assessment_context == AssessmentContext.NoContext &
          api.publication_directive == PublicationDirective.NoPublicationDirective &
          api.check_status == CheckStatus.Idle)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val request = api.get_check_request().get
    val acquisition = api.get_acquisition_outcome().get
    val publication = api.get_publication_outcome().get

    var acquisitionDirective = AcquisitionDirective.NoAcquisition
    var context = AssessmentContext.NoContext
    var publicationDirective = PublicationDirective.NoPublicationDirective
    var status: CheckStatus.Type =
      if (lifecycleState == LifecycleState.Checking) CheckStatus.Checking
      else if (lifecycleState == LifecycleState.AwaitingUse) CheckStatus.Available
      else if (lifecycleState == LifecycleState.RecoveryHold) CheckStatus.RecoveryRequired
      else CheckStatus.Idle

    if (lifecycleState == LifecycleState.RecoveryHold) {
      if (acquisition == AcquisitionOutcome.AcquisitionReset &
        publication == PublicationOutcome.PublicationReset) {
        lifecycleState = LifecycleState.Idle
        status = CheckStatus.ResetCompleted
      } else if (request.command == CheckCommand.Reset) {
        acquisitionDirective = AcquisitionDirective.ResetAcquisition
        publicationDirective = PublicationDirective.ResetPublication
        status = CheckStatus.RecoveryRequired
      } else {
        status = CheckStatus.RecoveryRequired
      }
    } else if (publication == PublicationOutcome.PublicationFault) {
      lifecycleState = LifecycleState.RecoveryHold
      status = CheckStatus.PublicationFailed
    } else if (acquisition == AcquisitionOutcome.AcquisitionFault) {
      lifecycleState = LifecycleState.RecoveryHold
      status = CheckStatus.AcquisitionFailed
    } else if (publication == PublicationOutcome.Consumed) {
      lifecycleState = LifecycleState.Idle
      status = CheckStatus.Completed
    } else if ((lifecycleState == LifecycleState.Checking |
      lifecycleState == LifecycleState.AwaitingUse) &
      request.command == CheckCommand.Cancel) {
      lifecycleState = LifecycleState.Idle
      publicationDirective = PublicationDirective.Withdraw
      status = CheckStatus.Cancelled
    } else if (lifecycleState == LifecycleState.Idle &
      request.command == CheckCommand.Start &
      request.token == CheckToken.TokenA &
      lastAdmittedToken == LastAdmittedToken.TokenA) {
      status = CheckStatus.DuplicateIgnored
    } else if (lifecycleState == LifecycleState.Idle &
      request.command == CheckCommand.Start &
      request.token == CheckToken.TokenB &
      lastAdmittedToken == LastAdmittedToken.TokenB) {
      status = CheckStatus.DuplicateIgnored
    } else if (lifecycleState == LifecycleState.Idle &
      request.command == CheckCommand.Start &
      request.token == CheckToken.TokenA) {
      lifecycleState = LifecycleState.Checking
      lastAdmittedToken = LastAdmittedToken.TokenA
      acquisitionDirective = AcquisitionDirective.AcquireTokenA
      context = AssessmentContext.AssessTokenA
      publicationDirective = PublicationDirective.OpenTokenA
      status = CheckStatus.Checking
    } else if (lifecycleState == LifecycleState.Idle &
      request.command == CheckCommand.Start &
      request.token == CheckToken.TokenB) {
      lifecycleState = LifecycleState.Checking
      lastAdmittedToken = LastAdmittedToken.TokenB
      acquisitionDirective = AcquisitionDirective.AcquireTokenB
      context = AssessmentContext.AssessTokenB
      publicationDirective = PublicationDirective.OpenTokenB
      status = CheckStatus.Checking
    } else if ((lifecycleState == LifecycleState.Checking |
      lifecycleState == LifecycleState.AwaitingUse) &
      request.command == CheckCommand.Start) {
      status = CheckStatus.Busy
    } else if (lifecycleState == LifecycleState.Checking &
      request.command != CheckCommand.Start &
      request.command != CheckCommand.Cancel &
      ((lastAdmittedToken == LastAdmittedToken.TokenA &
        acquisition == AcquisitionOutcome.CapturedTokenA &
        publication == PublicationOutcome.OfferedTokenA) |
        (lastAdmittedToken == LastAdmittedToken.TokenB &
          acquisition == AcquisitionOutcome.CapturedTokenB &
          publication == PublicationOutcome.OfferedTokenB))) {
      lifecycleState = LifecycleState.AwaitingUse
      status = CheckStatus.Available
    }

    api.put_acquisition_directive(acquisitionDirective)
    api.put_assessment_context(context)
    api.put_publication_directive(publicationDirective)
    api.put_check_status(status)
  }

  def finalise(api: CheckLifecycle_Operational_Api): Unit = { }
}
