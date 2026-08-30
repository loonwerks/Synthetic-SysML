// #Sireum

package scp_candidate.Battery_Status_Assessment_Service

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object CheckLifecycle_battery_assessment_process_check_lifecycle {

  // BEGIN STATE VARS
  var lifecycleState: Battery_Status_Assessment_Service.LifecycleState.Type = Battery_Status_Assessment_Service.LifecycleState.Idle

  var lastAdmittedToken: Battery_Status_Assessment_Service.LastAdmittedToken.Type = Battery_Status_Assessment_Service.LastAdmittedToken.None
  // END STATE VARS

  def initialise(api: CheckLifecycle_Initialization_Api): Unit = {
    Contract(
      Modifies(lifecycleState, lastAdmittedToken, api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_LIFECYCLE_SAFE
        lifecycleState == LifecycleState.Idle &
          lastAdmittedToken == LastAdmittedToken.None &
          api.acquisition_directive == AcquisitionDirective.NoAcquisition &
          api.assessment_context == AssessmentContext.NoContext &
          api.publication_directive == PublicationDirective.NoPublicationDirective &
          api.check_status == CheckStatus.Idle
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    lifecycleState = LifecycleState.Idle
    lastAdmittedToken = LastAdmittedToken.None
    api.put_acquisition_directive(Battery_Status_Assessment_Service.AcquisitionDirective.NoAcquisition)
    api.put_assessment_context(Battery_Status_Assessment_Service.AssessmentContext.NoContext)
    api.put_publication_directive(Battery_Status_Assessment_Service.PublicationDirective.NoPublicationDirective)
    api.put_check_status(Battery_Status_Assessment_Service.CheckStatus.Idle)
  }

  def finalise(api: CheckLifecycle_Operational_Api): Unit = { }

  def timeTriggered(api: CheckLifecycle_Operational_Api): Unit = {
    Contract(
      Modifies(lifecycleState, lastAdmittedToken, api)
    )
    val request: CheckRequest = api.get_check_request().get
    val acquisitionOutcome: AcquisitionOutcome.Type = api.get_acquisition_outcome().get
    val publicationOutcome: PublicationOutcome.Type = api.get_publication_outcome().get

    var acquisitionDirective: AcquisitionDirective.Type = AcquisitionDirective.NoAcquisition
    var context: AssessmentContext.Type = AssessmentContext.NoContext
    var publicationDirective: PublicationDirective.Type = PublicationDirective.NoPublicationDirective
    var status: CheckStatus.Type = CheckStatus.Idle

    if (lifecycleState != LifecycleState.RecoveryHold && publicationOutcome == PublicationOutcome.PublicationFault) {
      lifecycleState = LifecycleState.RecoveryHold
      status = CheckStatus.PublicationFailed
    } else if (lifecycleState != LifecycleState.RecoveryHold && acquisitionOutcome == AcquisitionOutcome.AcquisitionFault) {
      lifecycleState = LifecycleState.RecoveryHold
      status = CheckStatus.AcquisitionFailed
    } else if (lifecycleState == LifecycleState.RecoveryHold && acquisitionOutcome == AcquisitionOutcome.AcquisitionReset && publicationOutcome == PublicationOutcome.PublicationReset) {
      lifecycleState = LifecycleState.Idle
      status = CheckStatus.ResetCompleted
    } else if (lifecycleState == LifecycleState.RecoveryHold && request.command == CheckCommand.Reset) {
      acquisitionDirective = AcquisitionDirective.ResetAcquisition
      publicationDirective = PublicationDirective.ResetPublication
      status = CheckStatus.RecoveryRequired
    } else if (lifecycleState == LifecycleState.RecoveryHold) {
      status = CheckStatus.RecoveryRequired
    } else if (publicationOutcome == PublicationOutcome.Consumed) {
      lifecycleState = LifecycleState.Idle
      status = CheckStatus.Completed
    } else if ((lifecycleState == LifecycleState.Checking || lifecycleState == LifecycleState.AwaitingUse) && request.command == CheckCommand.Cancel) {
      lifecycleState = LifecycleState.Idle
      publicationDirective = PublicationDirective.Withdraw
      status = CheckStatus.Cancelled
    } else if (lifecycleState == LifecycleState.Idle && request.command == CheckCommand.Start && request.token == CheckToken.TokenA && lastAdmittedToken == LastAdmittedToken.TokenA) {
      status = CheckStatus.DuplicateIgnored
    } else if (lifecycleState == LifecycleState.Idle && request.command == CheckCommand.Start && request.token == CheckToken.TokenB && lastAdmittedToken == LastAdmittedToken.TokenB) {
      status = CheckStatus.DuplicateIgnored
    } else if (lifecycleState == LifecycleState.Idle && request.command == CheckCommand.Start && request.token == CheckToken.TokenA) {
      lifecycleState = LifecycleState.Checking
      lastAdmittedToken = LastAdmittedToken.TokenA
      acquisitionDirective = AcquisitionDirective.AcquireTokenA
      context = AssessmentContext.AssessTokenA
      publicationDirective = PublicationDirective.OpenTokenA
      status = CheckStatus.Checking
    } else if (lifecycleState == LifecycleState.Idle && request.command == CheckCommand.Start && request.token == CheckToken.TokenB) {
      lifecycleState = LifecycleState.Checking
      lastAdmittedToken = LastAdmittedToken.TokenB
      acquisitionDirective = AcquisitionDirective.AcquireTokenB
      context = AssessmentContext.AssessTokenB
      publicationDirective = PublicationDirective.OpenTokenB
      status = CheckStatus.Checking
    } else if ((lifecycleState == LifecycleState.Checking || lifecycleState == LifecycleState.AwaitingUse) && request.command == CheckCommand.Start) {
      status = CheckStatus.Busy
    } else if (lifecycleState == LifecycleState.Checking && request.command != CheckCommand.Start && request.command != CheckCommand.Cancel && ((lastAdmittedToken == LastAdmittedToken.TokenA && acquisitionOutcome == AcquisitionOutcome.CapturedTokenA && publicationOutcome == PublicationOutcome.OfferedTokenA) || (lastAdmittedToken == LastAdmittedToken.TokenB && acquisitionOutcome == AcquisitionOutcome.CapturedTokenB && publicationOutcome == PublicationOutcome.OfferedTokenB))) {
      lifecycleState = LifecycleState.AwaitingUse
      status = CheckStatus.Available
    } else if (lifecycleState == LifecycleState.AwaitingUse) {
      status = CheckStatus.Available
    } else if (lifecycleState == LifecycleState.Checking) {
      status = CheckStatus.Checking
    }

    api.put_acquisition_directive(acquisitionDirective)
    api.put_assessment_context(context)
    api.put_publication_directive(publicationDirective)
    api.put_check_status(status)
  }
}
