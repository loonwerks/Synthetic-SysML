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
    lifecycleState = LifecycleState.Idle
    lastAdmittedToken = LastAdmittedToken.None
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
        //   N.md#PRIOR_PUBLICATION_FAULT
        (In(lifecycleState) != LifecycleState.RecoveryHold &
          api.publication_outcome == PublicationOutcome.PublicationFault) ___>: (lifecycleState == LifecycleState.RecoveryHold &
          api.acquisition_directive == AcquisitionDirective.NoAcquisition &
          api.assessment_context == AssessmentContext.NoContext &
          api.publication_directive == PublicationDirective.NoPublicationDirective &
          api.check_status == CheckStatus.PublicationFailed),
        // case PRIOR_ACQUISITION_FAULT
        //   N.md#PRIOR_ACQUISITION_FAULT
        (In(lifecycleState) != LifecycleState.RecoveryHold &
          api.publication_outcome != PublicationOutcome.PublicationFault &
          api.acquisition_outcome == AcquisitionOutcome.AcquisitionFault) ___>: (lifecycleState == LifecycleState.RecoveryHold &
          api.acquisition_directive == AcquisitionDirective.NoAcquisition &
          api.assessment_context == AssessmentContext.NoContext &
          api.publication_directive == PublicationDirective.NoPublicationDirective &
          api.check_status == CheckStatus.AcquisitionFailed),
        // case RESET_CONFIRMATIONS
        //   N.md#RESET_CONFIRMATIONS
        (In(lifecycleState) == LifecycleState.RecoveryHold &
          api.acquisition_outcome == AcquisitionOutcome.AcquisitionReset &
          api.publication_outcome == PublicationOutcome.PublicationReset) ___>: (lifecycleState == LifecycleState.Idle &
          api.acquisition_directive == AcquisitionDirective.NoAcquisition &
          api.assessment_context == AssessmentContext.NoContext &
          api.publication_directive == PublicationDirective.NoPublicationDirective &
          api.check_status == CheckStatus.ResetCompleted),
        // case RESET_IN_RECOVERY
        //   N.md#RESET_IN_RECOVERY
        (In(lifecycleState) == LifecycleState.RecoveryHold &
          api.check_request.command == CheckCommand.Reset) ___>: (lifecycleState == LifecycleState.RecoveryHold &
          api.acquisition_directive == AcquisitionDirective.ResetAcquisition &
          api.assessment_context == AssessmentContext.NoContext &
          api.publication_directive == PublicationDirective.ResetPublication &
          api.check_status == CheckStatus.RecoveryRequired),
        // case RECOVERY_BLOCKS_NONRESET
        //   N.md#RECOVERY_BLOCKS_NONRESET
        (In(lifecycleState) == LifecycleState.RecoveryHold &
          api.check_request.command != CheckCommand.Reset) ___>: (lifecycleState == LifecycleState.RecoveryHold &
          api.acquisition_directive == AcquisitionDirective.NoAcquisition &
          api.assessment_context == AssessmentContext.NoContext &
          api.publication_directive == PublicationDirective.NoPublicationDirective &
          api.check_status == CheckStatus.RecoveryRequired),
        // case PRIOR_CONSUMPTION_COMPLETES
        //   N.md#PRIOR_CONSUMPTION_COMPLETES
        (In(lifecycleState) != LifecycleState.RecoveryHold &
          api.publication_outcome == PublicationOutcome.Consumed) ___>: (lifecycleState == LifecycleState.Idle &
          api.acquisition_directive == AcquisitionDirective.NoAcquisition &
          api.assessment_context == AssessmentContext.NoContext &
          api.publication_directive == PublicationDirective.NoPublicationDirective &
          api.check_status == CheckStatus.Completed),
        // case ACTIVE_CANCEL
        //   N.md#ACTIVE_CANCEL
        ((In(lifecycleState) == LifecycleState.Checking |
          In(lifecycleState) == LifecycleState.AwaitingUse) &
          api.check_request.command == CheckCommand.Cancel) ___>: (lifecycleState == LifecycleState.Idle &
          api.acquisition_directive == AcquisitionDirective.NoAcquisition &
          api.assessment_context == AssessmentContext.NoContext &
          api.publication_directive == PublicationDirective.Withdraw &
          api.check_status == CheckStatus.Cancelled),
        // case FRESH_TOKEN_A_START
        //   N.md#FRESH_TOKEN_A_START
        (In(lifecycleState) == LifecycleState.Idle &
          api.check_request.command == CheckCommand.Start &
          api.check_request.token == CheckToken.TokenA &
          In(lastAdmittedToken) != LastAdmittedToken.TokenA) ___>: (lifecycleState == LifecycleState.Checking &
          lastAdmittedToken == LastAdmittedToken.TokenA &
          api.acquisition_directive == AcquisitionDirective.AcquireTokenA &
          api.assessment_context == AssessmentContext.AssessTokenA &
          api.publication_directive == PublicationDirective.OpenTokenA &
          api.check_status == CheckStatus.Checking),
        // case FRESH_TOKEN_B_START
        //   N.md#FRESH_TOKEN_B_START
        (In(lifecycleState) == LifecycleState.Idle &
          api.check_request.command == CheckCommand.Start &
          api.check_request.token == CheckToken.TokenB &
          In(lastAdmittedToken) != LastAdmittedToken.TokenB) ___>: (lifecycleState == LifecycleState.Checking &
          lastAdmittedToken == LastAdmittedToken.TokenB &
          api.acquisition_directive == AcquisitionDirective.AcquireTokenB &
          api.assessment_context == AssessmentContext.AssessTokenB &
          api.publication_directive == PublicationDirective.OpenTokenB &
          api.check_status == CheckStatus.Checking),
        // case IDLE_DUPLICATE_TOKEN_A
        //   N.md#IDLE_DUPLICATE_TOKEN_A
        (In(lifecycleState) == LifecycleState.Idle &
          api.check_request.command == CheckCommand.Start &
          api.check_request.token == CheckToken.TokenA &
          In(lastAdmittedToken) == LastAdmittedToken.TokenA) ___>: (api.acquisition_directive == AcquisitionDirective.NoAcquisition &
          api.assessment_context == AssessmentContext.NoContext &
          api.publication_directive == PublicationDirective.NoPublicationDirective &
          api.check_status == CheckStatus.DuplicateIgnored),
        // case IDLE_DUPLICATE_TOKEN_B
        //   N.md#IDLE_DUPLICATE_TOKEN_B
        (In(lifecycleState) == LifecycleState.Idle &
          api.check_request.command == CheckCommand.Start &
          api.check_request.token == CheckToken.TokenB &
          In(lastAdmittedToken) == LastAdmittedToken.TokenB) ___>: (api.acquisition_directive == AcquisitionDirective.NoAcquisition &
          api.assessment_context == AssessmentContext.NoContext &
          api.publication_directive == PublicationDirective.NoPublicationDirective &
          api.check_status == CheckStatus.DuplicateIgnored),
        // case ACTIVE_START_BUSY
        //   N.md#ACTIVE_START_BUSY
        ((In(lifecycleState) == LifecycleState.Checking |
          In(lifecycleState) == LifecycleState.AwaitingUse) &
          api.check_request.command == CheckCommand.Start) ___>: (api.acquisition_directive == AcquisitionDirective.NoAcquisition &
          api.assessment_context == AssessmentContext.NoContext &
          api.publication_directive == PublicationDirective.NoPublicationDirective &
          api.check_status == CheckStatus.Busy),
        // case CHECK_BECOMES_AVAILABLE
        //   N.md#CHECK_BECOMES_AVAILABLE
        (In(lifecycleState) == LifecycleState.Checking &
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
        //   N.md#ORDINARY_NONHOLD
        (In(lifecycleState) != LifecycleState.RecoveryHold) ___>: (api.acquisition_directive == AcquisitionDirective.NoAcquisition &
          api.assessment_context == AssessmentContext.NoContext &
          api.publication_directive == PublicationDirective.NoPublicationDirective)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val request = api.get_check_request().get
    val acquisition = api.get_acquisition_outcome().get
    val publication = api.get_publication_outcome().get
    var ad = AcquisitionDirective.NoAcquisition
    var context = AssessmentContext.NoContext
    var pd = PublicationDirective.NoPublicationDirective
    var status = CheckStatus.Idle
    if (lifecycleState != LifecycleState.RecoveryHold & publication == PublicationOutcome.PublicationFault) {
      lifecycleState = LifecycleState.RecoveryHold; status = CheckStatus.PublicationFailed
    } else if (lifecycleState != LifecycleState.RecoveryHold & acquisition == AcquisitionOutcome.AcquisitionFault) {
      lifecycleState = LifecycleState.RecoveryHold; status = CheckStatus.AcquisitionFailed
    } else if (lifecycleState == LifecycleState.RecoveryHold & acquisition == AcquisitionOutcome.AcquisitionReset & publication == PublicationOutcome.PublicationReset) {
      lifecycleState = LifecycleState.Idle; status = CheckStatus.ResetCompleted
    } else if (lifecycleState == LifecycleState.RecoveryHold & request.command == CheckCommand.Reset) {
      ad = AcquisitionDirective.ResetAcquisition; pd = PublicationDirective.ResetPublication; status = CheckStatus.RecoveryRequired
    } else if (lifecycleState == LifecycleState.RecoveryHold) {
      status = CheckStatus.RecoveryRequired
    } else if (publication == PublicationOutcome.Consumed) {
      lifecycleState = LifecycleState.Idle; status = CheckStatus.Completed
    } else if ((lifecycleState == LifecycleState.Checking | lifecycleState == LifecycleState.AwaitingUse) & request.command == CheckCommand.Cancel) {
      lifecycleState = LifecycleState.Idle; pd = PublicationDirective.Withdraw; status = CheckStatus.Cancelled
    } else if (lifecycleState == LifecycleState.Idle & request.command == CheckCommand.Start & request.token == CheckToken.TokenA & lastAdmittedToken != LastAdmittedToken.TokenA) {
      lifecycleState = LifecycleState.Checking; lastAdmittedToken = LastAdmittedToken.TokenA; ad = AcquisitionDirective.AcquireTokenA; context = AssessmentContext.AssessTokenA; pd = PublicationDirective.OpenTokenA; status = CheckStatus.Checking
    } else if (lifecycleState == LifecycleState.Idle & request.command == CheckCommand.Start & request.token == CheckToken.TokenB & lastAdmittedToken != LastAdmittedToken.TokenB) {
      lifecycleState = LifecycleState.Checking; lastAdmittedToken = LastAdmittedToken.TokenB; ad = AcquisitionDirective.AcquireTokenB; context = AssessmentContext.AssessTokenB; pd = PublicationDirective.OpenTokenB; status = CheckStatus.Checking
    } else if (lifecycleState == LifecycleState.Idle & request.command == CheckCommand.Start) {
      status = CheckStatus.DuplicateIgnored
    } else if ((lifecycleState == LifecycleState.Checking | lifecycleState == LifecycleState.AwaitingUse) & request.command == CheckCommand.Start) {
      status = CheckStatus.Busy
    } else if (lifecycleState == LifecycleState.Checking & ((lastAdmittedToken == LastAdmittedToken.TokenA & acquisition == AcquisitionOutcome.CapturedTokenA & publication == PublicationOutcome.OfferedTokenA) | (lastAdmittedToken == LastAdmittedToken.TokenB & acquisition == AcquisitionOutcome.CapturedTokenB & publication == PublicationOutcome.OfferedTokenB))) {
      lifecycleState = LifecycleState.AwaitingUse; status = CheckStatus.Available
    } else if (lifecycleState == LifecycleState.Checking) {
      status = CheckStatus.Checking
    } else if (lifecycleState == LifecycleState.AwaitingUse) {
      status = CheckStatus.Available
    }
    api.put_acquisition_directive(ad); api.put_assessment_context(context); api.put_publication_directive(pd); api.put_check_status(status)
  }

  def finalise(api: CheckLifecycle_Operational_Api): Unit = { }
}
