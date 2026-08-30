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
      Modifies(
        api,
        lifecycleState,
        lastAdmittedToken
      ),
      Ensures(
        // BEGIN INITIALIZES ENSURES timeTriggered
        // guarantee INITIAL_LIFECYCLE_SAFE
        //   lifecycle state is Idle, last admitted token is None,
        //   acquisition directive to NoAcquisition, assessment context to
        //   NoContext, publication directive to NoPublicationDirective, and
        //   check status to Idle
        lifecycleState == Battery_Status_Assessment_Service.LifecycleState.Idle &
          lastAdmittedToken == Battery_Status_Assessment_Service.LastAdmittedToken.None &
          api.acquisition_directive == Battery_Status_Assessment_Service.AcquisitionDirective.NoAcquisition &
          api.assessment_context == Battery_Status_Assessment_Service.AssessmentContext.NoContext &
          api.publication_directive == Battery_Status_Assessment_Service.PublicationDirective.NoPublicationDirective &
          api.check_status == Battery_Status_Assessment_Service.CheckStatus.Idle
        // END INITIALIZES ENSURES timeTriggered
      )
    )
    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    lifecycleState = Battery_Status_Assessment_Service.LifecycleState.Idle
    lastAdmittedToken = Battery_Status_Assessment_Service.LastAdmittedToken.None
    api.put_acquisition_directive(Battery_Status_Assessment_Service.AcquisitionDirective.NoAcquisition)
    api.put_assessment_context(Battery_Status_Assessment_Service.AssessmentContext.NoContext)
    api.put_publication_directive(Battery_Status_Assessment_Service.PublicationDirective.NoPublicationDirective)
    api.put_check_status(Battery_Status_Assessment_Service.CheckStatus.Idle)
  }

  def timeTriggered(api: CheckLifecycle_Operational_Api): Unit = {
    Contract(
      Modifies(
        // BEGIN COMPUTE MODIFIES timeTriggered
        api,
        lifecycleState,
        lastAdmittedToken
        // END COMPUTE MODIFIES timeTriggered
      ),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case PRIOR_PUBLICATION_FAULT
        //   publication outcome fault
        (In(lifecycleState) != LifecycleState.RecoveryHold &
          api.publication_outcome == PublicationOutcome.PublicationFault) ___>: (lifecycleState == LifecycleState.RecoveryHold &
          lastAdmittedToken == In(lastAdmittedToken) &
          api.acquisition_directive == AcquisitionDirective.NoAcquisition &
          api.assessment_context == AssessmentContext.NoContext &
          api.publication_directive == PublicationDirective.NoPublicationDirective &
          api.check_status == CheckStatus.PublicationFailed),
        // case PRIOR_ACQUISITION_FAULT
        //   acquisition outcome fault
        (In(lifecycleState) != LifecycleState.RecoveryHold &
          api.publication_outcome != PublicationOutcome.PublicationFault &
          api.acquisition_outcome == AcquisitionOutcome.AcquisitionFault) ___>: (lifecycleState == LifecycleState.RecoveryHold &
          lastAdmittedToken == In(lastAdmittedToken) &
          api.acquisition_directive == AcquisitionDirective.NoAcquisition &
          api.assessment_context == AssessmentContext.NoContext &
          api.publication_directive == PublicationDirective.NoPublicationDirective &
          api.check_status == CheckStatus.AcquisitionFailed),
        // case RESET_CONFIRMATIONS
        //   reset in recovery hold
        (In(lifecycleState) == LifecycleState.RecoveryHold &
          api.acquisition_outcome == AcquisitionOutcome.AcquisitionReset &
          api.publication_outcome == PublicationOutcome.PublicationReset) ___>: (lifecycleState == LifecycleState.Idle &
          lastAdmittedToken == In(lastAdmittedToken) &
          api.acquisition_directive == AcquisitionDirective.NoAcquisition &
          api.assessment_context == AssessmentContext.NoContext &
          api.publication_directive == PublicationDirective.NoPublicationDirective &
          api.check_status == CheckStatus.ResetCompleted),
        // case RESET_IN_RECOVERY
        //   reset in recovery but not confirmed
        (In(lifecycleState) == LifecycleState.RecoveryHold &
          !(api.acquisition_outcome == AcquisitionOutcome.AcquisitionReset &
            api.publication_outcome == PublicationOutcome.PublicationReset) &
          api.check_request.command == CheckCommand.Reset) ___>: (lifecycleState == LifecycleState.RecoveryHold &
          lastAdmittedToken == In(lastAdmittedToken) &
          api.acquisition_directive == AcquisitionDirective.ResetAcquisition &
          api.assessment_context == AssessmentContext.NoContext &
          api.publication_directive == PublicationDirective.ResetPublication &
          api.check_status == CheckStatus.RecoveryRequired),
        // case RECOVERY_BLOCKS_NONRESET
        //   recovery blocks non-reset
        (In(lifecycleState) == LifecycleState.RecoveryHold &
          !(api.acquisition_outcome == AcquisitionOutcome.AcquisitionReset &
            api.publication_outcome == PublicationOutcome.PublicationReset) &
          api.check_request.command != CheckCommand.Reset) ___>: (lifecycleState == LifecycleState.RecoveryHold &
          lastAdmittedToken == In(lastAdmittedToken) &
          api.acquisition_directive == AcquisitionDirective.NoAcquisition &
          api.assessment_context == AssessmentContext.NoContext &
          api.publication_directive == PublicationDirective.NoPublicationDirective &
          api.check_status == CheckStatus.RecoveryRequired),
        // case PRIOR_CONSUMPTION_COMPLETES
        //   consumption completes
        (In(lifecycleState) != LifecycleState.RecoveryHold &
          api.publication_outcome != PublicationOutcome.PublicationFault &
          api.acquisition_outcome != AcquisitionOutcome.AcquisitionFault &
          api.publication_outcome == PublicationOutcome.Consumed) ___>: (lifecycleState == LifecycleState.Idle &
          lastAdmittedToken == In(lastAdmittedToken) &
          api.acquisition_directive == AcquisitionDirective.NoAcquisition &
          api.assessment_context == AssessmentContext.NoContext &
          api.publication_directive == PublicationDirective.NoPublicationDirective &
          api.check_status == CheckStatus.Completed),
        // case ACTIVE_CANCEL
        //   cancel during active check
        (In(lifecycleState) != LifecycleState.RecoveryHold &
          api.publication_outcome != PublicationOutcome.PublicationFault &
          api.acquisition_outcome != AcquisitionOutcome.AcquisitionFault &
          api.publication_outcome != PublicationOutcome.Consumed &
          api.check_request.command == CheckCommand.Cancel &
          (In(lifecycleState) == LifecycleState.Checking |
            In(lifecycleState) == LifecycleState.AwaitingUse)) ___>: (lifecycleState == LifecycleState.Idle &
          lastAdmittedToken == In(lastAdmittedToken) &
          api.acquisition_directive == AcquisitionDirective.NoAcquisition &
          api.assessment_context == AssessmentContext.NoContext &
          api.publication_directive == PublicationDirective.Withdraw &
          api.check_status == CheckStatus.Cancelled),
        // case IDLE_DUPLICATE_TOKEN_A
        //   duplicate token A at idle
        (In(lifecycleState) == LifecycleState.Idle &
          api.publication_outcome != PublicationOutcome.PublicationFault &
          api.acquisition_outcome != AcquisitionOutcome.AcquisitionFault &
          api.publication_outcome != PublicationOutcome.Consumed &
          api.check_request.command == CheckCommand.Start &
          api.check_request.token == CheckToken.TokenA &
          In(lastAdmittedToken) == LastAdmittedToken.TokenA) ___>: (lifecycleState == LifecycleState.Idle &
          lastAdmittedToken == In(lastAdmittedToken) &
          api.acquisition_directive == AcquisitionDirective.NoAcquisition &
          api.assessment_context == AssessmentContext.NoContext &
          api.publication_directive == PublicationDirective.NoPublicationDirective &
          api.check_status == CheckStatus.DuplicateIgnored),
        // case IDLE_DUPLICATE_TOKEN_B
        //   duplicate token B at idle
        (In(lifecycleState) == LifecycleState.Idle &
          api.publication_outcome != PublicationOutcome.PublicationFault &
          api.acquisition_outcome != AcquisitionOutcome.AcquisitionFault &
          api.publication_outcome != PublicationOutcome.Consumed &
          api.check_request.command == CheckCommand.Start &
          api.check_request.token == CheckToken.TokenB &
          In(lastAdmittedToken) == LastAdmittedToken.TokenB) ___>: (lifecycleState == LifecycleState.Idle &
          lastAdmittedToken == In(lastAdmittedToken) &
          api.acquisition_directive == AcquisitionDirective.NoAcquisition &
          api.assessment_context == AssessmentContext.NoContext &
          api.publication_directive == PublicationDirective.NoPublicationDirective &
          api.check_status == CheckStatus.DuplicateIgnored),
        // case FRESH_TOKEN_A_START
        //   fresh token A start
        (In(lifecycleState) == LifecycleState.Idle &
          api.publication_outcome != PublicationOutcome.PublicationFault &
          api.acquisition_outcome != AcquisitionOutcome.AcquisitionFault &
          api.publication_outcome != PublicationOutcome.Consumed &
          api.check_request.command == CheckCommand.Start &
          api.check_request.token == CheckToken.TokenA &
          In(lastAdmittedToken) != LastAdmittedToken.TokenA) ___>: (lifecycleState == LifecycleState.Checking &
          lastAdmittedToken == LastAdmittedToken.TokenA &
          api.acquisition_directive == AcquisitionDirective.AcquireTokenA &
          api.assessment_context == AssessmentContext.AssessTokenA &
          api.publication_directive == PublicationDirective.OpenTokenA &
          api.check_status == CheckStatus.Checking),
        // case FRESH_TOKEN_B_START
        //   fresh token B start
        (In(lifecycleState) == LifecycleState.Idle &
          api.publication_outcome != PublicationOutcome.PublicationFault &
          api.acquisition_outcome != AcquisitionOutcome.AcquisitionFault &
          api.publication_outcome != PublicationOutcome.Consumed &
          api.check_request.command == CheckCommand.Start &
          api.check_request.token == CheckToken.TokenB &
          In(lastAdmittedToken) != LastAdmittedToken.TokenB) ___>: (lifecycleState == LifecycleState.Checking &
          lastAdmittedToken == LastAdmittedToken.TokenB &
          api.acquisition_directive == AcquisitionDirective.AcquireTokenB &
          api.assessment_context == AssessmentContext.AssessTokenB &
          api.publication_directive == PublicationDirective.OpenTokenB &
          api.check_status == CheckStatus.Checking),
        // case ACTIVE_START_BUSY
        //   start busy during active check
        ((In(lifecycleState) == LifecycleState.Checking |
          In(lifecycleState) == LifecycleState.AwaitingUse) &
          api.publication_outcome != PublicationOutcome.PublicationFault &
          api.acquisition_outcome != AcquisitionOutcome.AcquisitionFault &
          api.publication_outcome != PublicationOutcome.Consumed &
          api.check_request.command == CheckCommand.Start) ___>: (lifecycleState == In(lifecycleState) &
          lastAdmittedToken == In(lastAdmittedToken) &
          api.acquisition_directive == AcquisitionDirective.NoAcquisition &
          api.assessment_context == AssessmentContext.NoContext &
          api.publication_directive == PublicationDirective.NoPublicationDirective &
          api.check_status == CheckStatus.Busy),
        // case CHECK_BECOMES_AVAILABLE
        //   check becomes available
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
          lastAdmittedToken == In(lastAdmittedToken) &
          api.acquisition_directive == AcquisitionDirective.NoAcquisition &
          api.assessment_context == AssessmentContext.NoContext &
          api.publication_directive == PublicationDirective.NoPublicationDirective &
          api.check_status == CheckStatus.Available),
        // case ORDINARY_NONHOLD
        //   ordinary non-hold retention
        (In(lifecycleState) != LifecycleState.RecoveryHold &
          api.publication_outcome != PublicationOutcome.PublicationFault &
          api.acquisition_outcome != AcquisitionOutcome.AcquisitionFault &
          api.publication_outcome != PublicationOutcome.Consumed &
          !(api.check_request.command == CheckCommand.Cancel &
            (In(lifecycleState) == LifecycleState.Checking |
              In(lifecycleState) == LifecycleState.AwaitingUse)) &
          !(In(lifecycleState) == LifecycleState.Idle &
            api.check_request.command == CheckCommand.Start) &
          !((In(lifecycleState) == LifecycleState.Checking |
            In(lifecycleState) == LifecycleState.AwaitingUse) &
            api.check_request.command == CheckCommand.Start) &
          !(In(lifecycleState) == LifecycleState.Checking &
            api.check_request.command != CheckCommand.Start &
            api.check_request.command != CheckCommand.Cancel &
            (In(lastAdmittedToken) == LastAdmittedToken.TokenA &
              api.acquisition_outcome == AcquisitionOutcome.CapturedTokenA &
              api.publication_outcome == PublicationOutcome.OfferedTokenA |
              In(lastAdmittedToken) == LastAdmittedToken.TokenB &
                api.acquisition_outcome == AcquisitionOutcome.CapturedTokenB &
                api.publication_outcome == PublicationOutcome.OfferedTokenB))) ___>: (lifecycleState == In(lifecycleState) &
          lastAdmittedToken == In(lastAdmittedToken) &
          api.acquisition_directive == AcquisitionDirective.NoAcquisition &
          api.assessment_context == AssessmentContext.NoContext &
          api.publication_directive == PublicationDirective.NoPublicationDirective &
          (lifecycleState == LifecycleState.AwaitingUse &
            api.check_status == CheckStatus.Available |
            lifecycleState == LifecycleState.Checking &
              api.check_status == CheckStatus.Checking |
            lifecycleState == LifecycleState.Idle &
              api.check_status == CheckStatus.Idle))
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

    val cr: Battery_Status_Assessment_Service.CheckRequest = apiUsage_check_request.get
    val acqOut: Battery_Status_Assessment_Service.AcquisitionOutcome.Type = apiUsage_acquisition_outcome.get
    val pubOut: Battery_Status_Assessment_Service.PublicationOutcome.Type = apiUsage_publication_outcome.get

    val entryState: Battery_Status_Assessment_Service.LifecycleState.Type = lifecycleState
    val entryToken: Battery_Status_Assessment_Service.LastAdmittedToken.Type = lastAdmittedToken

    var newLifecycleState: Battery_Status_Assessment_Service.LifecycleState.Type = entryState
    var newLastAdmittedToken: Battery_Status_Assessment_Service.LastAdmittedToken.Type = entryToken
    var newAcqDirective: Battery_Status_Assessment_Service.AcquisitionDirective.Type = Battery_Status_Assessment_Service.AcquisitionDirective.NoAcquisition
    var newAssessContext: Battery_Status_Assessment_Service.AssessmentContext.Type = Battery_Status_Assessment_Service.AssessmentContext.NoContext
    var newPubDirective: Battery_Status_Assessment_Service.PublicationDirective.Type = Battery_Status_Assessment_Service.PublicationDirective.NoPublicationDirective
    var newCheckStatus: Battery_Status_Assessment_Service.CheckStatus.Type = entryState match {
      case Battery_Status_Assessment_Service.LifecycleState.Idle => Battery_Status_Assessment_Service.CheckStatus.Idle
      case Battery_Status_Assessment_Service.LifecycleState.Checking => Battery_Status_Assessment_Service.CheckStatus.Checking
      case Battery_Status_Assessment_Service.LifecycleState.AwaitingUse => Battery_Status_Assessment_Service.CheckStatus.Available
      case Battery_Status_Assessment_Service.LifecycleState.RecoveryHold => Battery_Status_Assessment_Service.CheckStatus.RecoveryRequired
    }

    if (entryState != Battery_Status_Assessment_Service.LifecycleState.RecoveryHold &
      pubOut == Battery_Status_Assessment_Service.PublicationOutcome.PublicationFault) {
      // case PRIOR_PUBLICATION_FAULT
      newLifecycleState = Battery_Status_Assessment_Service.LifecycleState.RecoveryHold
      newCheckStatus = Battery_Status_Assessment_Service.CheckStatus.PublicationFailed
    } else if (entryState != Battery_Status_Assessment_Service.LifecycleState.RecoveryHold &
      pubOut != Battery_Status_Assessment_Service.PublicationOutcome.PublicationFault &
      acqOut == Battery_Status_Assessment_Service.AcquisitionOutcome.AcquisitionFault) {
      // case PRIOR_ACQUISITION_FAULT
      newLifecycleState = Battery_Status_Assessment_Service.LifecycleState.RecoveryHold
      newCheckStatus = Battery_Status_Assessment_Service.CheckStatus.AcquisitionFailed
    } else if (entryState == Battery_Status_Assessment_Service.LifecycleState.RecoveryHold &
      acqOut == Battery_Status_Assessment_Service.AcquisitionOutcome.AcquisitionReset &
      pubOut == Battery_Status_Assessment_Service.PublicationOutcome.PublicationReset) {
      // case RESET_CONFIRMATIONS
      newLifecycleState = Battery_Status_Assessment_Service.LifecycleState.Idle
      newCheckStatus = Battery_Status_Assessment_Service.CheckStatus.ResetCompleted
    } else if (entryState == Battery_Status_Assessment_Service.LifecycleState.RecoveryHold &
      !(acqOut == Battery_Status_Assessment_Service.AcquisitionOutcome.AcquisitionReset &
        pubOut == Battery_Status_Assessment_Service.PublicationOutcome.PublicationReset) &
      cr.command == Battery_Status_Assessment_Service.CheckCommand.Reset) {
      // case RESET_IN_RECOVERY
      newLifecycleState = Battery_Status_Assessment_Service.LifecycleState.RecoveryHold
      newAcqDirective = Battery_Status_Assessment_Service.AcquisitionDirective.ResetAcquisition
      newPubDirective = Battery_Status_Assessment_Service.PublicationDirective.ResetPublication
      newCheckStatus = Battery_Status_Assessment_Service.CheckStatus.RecoveryRequired
    } else if (entryState == Battery_Status_Assessment_Service.LifecycleState.RecoveryHold &
      !(acqOut == Battery_Status_Assessment_Service.AcquisitionOutcome.AcquisitionReset &
        pubOut == Battery_Status_Assessment_Service.PublicationOutcome.PublicationReset) &
      cr.command != Battery_Status_Assessment_Service.CheckCommand.Reset) {
      // case RECOVERY_BLOCKS_NONRESET
      newLifecycleState = Battery_Status_Assessment_Service.LifecycleState.RecoveryHold
      newCheckStatus = Battery_Status_Assessment_Service.CheckStatus.RecoveryRequired
    } else if (entryState != Battery_Status_Assessment_Service.LifecycleState.RecoveryHold &
      pubOut != Battery_Status_Assessment_Service.PublicationOutcome.PublicationFault &
      acqOut != Battery_Status_Assessment_Service.AcquisitionOutcome.AcquisitionFault &
      pubOut == Battery_Status_Assessment_Service.PublicationOutcome.Consumed) {
      // case PRIOR_CONSUMPTION_COMPLETES
      newLifecycleState = Battery_Status_Assessment_Service.LifecycleState.Idle
      newCheckStatus = Battery_Status_Assessment_Service.CheckStatus.Completed
    } else if (entryState != Battery_Status_Assessment_Service.LifecycleState.RecoveryHold &
      pubOut != Battery_Status_Assessment_Service.PublicationOutcome.PublicationFault &
      acqOut != Battery_Status_Assessment_Service.AcquisitionOutcome.AcquisitionFault &
      pubOut != Battery_Status_Assessment_Service.PublicationOutcome.Consumed &
      cr.command == Battery_Status_Assessment_Service.CheckCommand.Cancel &
      (entryState == Battery_Status_Assessment_Service.LifecycleState.Checking |
        entryState == Battery_Status_Assessment_Service.LifecycleState.AwaitingUse)) {
      // case ACTIVE_CANCEL
      newLifecycleState = Battery_Status_Assessment_Service.LifecycleState.Idle
      newPubDirective = Battery_Status_Assessment_Service.PublicationDirective.Withdraw
      newCheckStatus = Battery_Status_Assessment_Service.CheckStatus.Cancelled
    } else if (entryState == Battery_Status_Assessment_Service.LifecycleState.Idle &
      pubOut != Battery_Status_Assessment_Service.PublicationOutcome.PublicationFault &
      acqOut != Battery_Status_Assessment_Service.AcquisitionOutcome.AcquisitionFault &
      pubOut != Battery_Status_Assessment_Service.PublicationOutcome.Consumed &
      cr.command == Battery_Status_Assessment_Service.CheckCommand.Start &
      cr.token == Battery_Status_Assessment_Service.CheckToken.TokenA &
      entryToken == Battery_Status_Assessment_Service.LastAdmittedToken.TokenA) {
      // case IDLE_DUPLICATE_TOKEN_A
      newCheckStatus = Battery_Status_Assessment_Service.CheckStatus.DuplicateIgnored
    } else if (entryState == Battery_Status_Assessment_Service.LifecycleState.Idle &
      pubOut != Battery_Status_Assessment_Service.PublicationOutcome.PublicationFault &
      acqOut != Battery_Status_Assessment_Service.AcquisitionOutcome.AcquisitionFault &
      pubOut != Battery_Status_Assessment_Service.PublicationOutcome.Consumed &
      cr.command == Battery_Status_Assessment_Service.CheckCommand.Start &
      cr.token == Battery_Status_Assessment_Service.CheckToken.TokenB &
      entryToken == Battery_Status_Assessment_Service.LastAdmittedToken.TokenB) {
      // case IDLE_DUPLICATE_TOKEN_B
      newCheckStatus = Battery_Status_Assessment_Service.CheckStatus.DuplicateIgnored
    } else if (entryState == Battery_Status_Assessment_Service.LifecycleState.Idle &
      pubOut != Battery_Status_Assessment_Service.PublicationOutcome.PublicationFault &
      acqOut != Battery_Status_Assessment_Service.AcquisitionOutcome.AcquisitionFault &
      pubOut != Battery_Status_Assessment_Service.PublicationOutcome.Consumed &
      cr.command == Battery_Status_Assessment_Service.CheckCommand.Start &
      cr.token == Battery_Status_Assessment_Service.CheckToken.TokenA &
      entryToken != Battery_Status_Assessment_Service.LastAdmittedToken.TokenA) {
      // case FRESH_TOKEN_A_START
      newLifecycleState = Battery_Status_Assessment_Service.LifecycleState.Checking
      newLastAdmittedToken = Battery_Status_Assessment_Service.LastAdmittedToken.TokenA
      newAcqDirective = Battery_Status_Assessment_Service.AcquisitionDirective.AcquireTokenA
      newAssessContext = Battery_Status_Assessment_Service.AssessmentContext.AssessTokenA
      newPubDirective = Battery_Status_Assessment_Service.PublicationDirective.OpenTokenA
      newCheckStatus = Battery_Status_Assessment_Service.CheckStatus.Checking
    } else if (entryState == Battery_Status_Assessment_Service.LifecycleState.Idle &
      pubOut != Battery_Status_Assessment_Service.PublicationOutcome.PublicationFault &
      acqOut != Battery_Status_Assessment_Service.AcquisitionOutcome.AcquisitionFault &
      pubOut != Battery_Status_Assessment_Service.PublicationOutcome.Consumed &
      cr.command == Battery_Status_Assessment_Service.CheckCommand.Start &
      cr.token == Battery_Status_Assessment_Service.CheckToken.TokenB &
      entryToken != Battery_Status_Assessment_Service.LastAdmittedToken.TokenB) {
      // case FRESH_TOKEN_B_START
      newLifecycleState = Battery_Status_Assessment_Service.LifecycleState.Checking
      newLastAdmittedToken = Battery_Status_Assessment_Service.LastAdmittedToken.TokenB
      newAcqDirective = Battery_Status_Assessment_Service.AcquisitionDirective.AcquireTokenB
      newAssessContext = Battery_Status_Assessment_Service.AssessmentContext.AssessTokenB
      newPubDirective = Battery_Status_Assessment_Service.PublicationDirective.OpenTokenB
      newCheckStatus = Battery_Status_Assessment_Service.CheckStatus.Checking
    } else if ((entryState == Battery_Status_Assessment_Service.LifecycleState.Checking |
      entryState == Battery_Status_Assessment_Service.LifecycleState.AwaitingUse) &
      pubOut != Battery_Status_Assessment_Service.PublicationOutcome.PublicationFault &
      acqOut != Battery_Status_Assessment_Service.AcquisitionOutcome.AcquisitionFault &
      pubOut != Battery_Status_Assessment_Service.PublicationOutcome.Consumed &
      cr.command == Battery_Status_Assessment_Service.CheckCommand.Start) {
      // case ACTIVE_START_BUSY
      newCheckStatus = Battery_Status_Assessment_Service.CheckStatus.Busy
    } else if (entryState == Battery_Status_Assessment_Service.LifecycleState.Checking &
      pubOut != Battery_Status_Assessment_Service.PublicationOutcome.PublicationFault &
      acqOut != Battery_Status_Assessment_Service.AcquisitionOutcome.AcquisitionFault &
      pubOut != Battery_Status_Assessment_Service.PublicationOutcome.Consumed &
      cr.command != Battery_Status_Assessment_Service.CheckCommand.Start &
      cr.command != Battery_Status_Assessment_Service.CheckCommand.Cancel &
      ((entryToken == Battery_Status_Assessment_Service.LastAdmittedToken.TokenA &
        acqOut == Battery_Status_Assessment_Service.AcquisitionOutcome.CapturedTokenA &
        pubOut == Battery_Status_Assessment_Service.PublicationOutcome.OfferedTokenA) |
        (entryToken == Battery_Status_Assessment_Service.LastAdmittedToken.TokenB &
          acqOut == Battery_Status_Assessment_Service.AcquisitionOutcome.CapturedTokenB &
          pubOut == Battery_Status_Assessment_Service.PublicationOutcome.OfferedTokenB))) {
      // case CHECK_BECOMES_AVAILABLE
      newLifecycleState = Battery_Status_Assessment_Service.LifecycleState.AwaitingUse
      newCheckStatus = Battery_Status_Assessment_Service.CheckStatus.Available
    } else {
      // case ORDINARY_NONHOLD
      // state and token preserved; check_status defaults set above
    }

    lifecycleState = newLifecycleState
    lastAdmittedToken = newLastAdmittedToken
    api.put_acquisition_directive(newAcqDirective)
    api.put_assessment_context(newAssessContext)
    api.put_publication_directive(newPubDirective)
    api.put_check_status(newCheckStatus)
  }

  def finalise(api: CheckLifecycle_Operational_Api): Unit = { }
}
