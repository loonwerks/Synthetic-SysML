// #Sireum

package scp_candidate.EIT_Acquisition_Session_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor {

  // BEGIN STATE VARS
  var committedPreparationState: EIT_Acquisition_Session_Coordinator.PreparationState.Type = EIT_Acquisition_Session_Coordinator.PreparationState.UNPREPARED
  // END STATE VARS

  def initialise(api: PreparationStateGovernor_Initialization_Api): Unit = {
    Contract(Modifies(api, committedPreparationState),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INIT_PREPARATION_STATE
        committedPreparationState == PreparationState.UNPREPARED &&
          api.preparationState == PreparationState.UNPREPARED &&
          api.preparationDecision.preState == PreparationDecisionPreState.UNPREPARED &&
          api.preparationDecision.nextState == PreparationDecisionNextState.UNPREPARED &&
          api.preparationDecision.effectiveIntent == PreparationDecisionIntent.NO_INTENT &&
          api.preparationDecision.disposition == PreparationDecisionDisposition.NO_REQUEST_DISPOSITION
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    committedPreparationState = PreparationState.UNPREPARED
    api.put_preparationState(PreparationState.UNPREPARED)
    api.put_preparationDecision(PreparationDecisionSnapshot(PreparationDecisionPreState.UNPREPARED, PreparationDecisionNextState.UNPREPARED, PreparationDecisionIntent.NO_INTENT, PreparationDecisionDisposition.NO_REQUEST_DISPOSITION))
  }

  def timeTriggered(api: PreparationStateGovernor_Operational_Api): Unit = {
    Contract(Modifies(api, committedPreparationState))
    api.get_arbitrationDecision() match {
      case Some(decision) =>
        val pre = committedPreparationState
        committedPreparationState = decision.effectiveIntent match {
          case ArbitrationDecisionEffectiveIntent.RESET_PREPARATION_INTENT => PreparationState.UNPREPARED
          case ArbitrationDecisionEffectiveIntent.CONFIRM_BELT_INTENT => PreparationState.BELT_CONFIRMED
          case ArbitrationDecisionEffectiveIntent.RECORD_CALIBRATION_INTENT => PreparationState.PREPARATION_CALIBRATED
          case _ => pre
        }
        val preProjection: PreparationDecisionPreState.Type = pre match {
          case PreparationState.BELT_CONFIRMED => PreparationDecisionPreState.BELT_CONFIRMED
          case PreparationState.PREPARATION_CALIBRATED => PreparationDecisionPreState.PREPARATION_CALIBRATED
          case _ => PreparationDecisionPreState.UNPREPARED
        }
        val nextProjection: PreparationDecisionNextState.Type = committedPreparationState match {
          case PreparationState.BELT_CONFIRMED => PreparationDecisionNextState.BELT_CONFIRMED
          case PreparationState.PREPARATION_CALIBRATED => PreparationDecisionNextState.PREPARATION_CALIBRATED
          case _ => PreparationDecisionNextState.UNPREPARED
        }
        api.put_preparationState(pre)
        api.put_preparationDecision(PreparationDecisionSnapshot(preProjection, nextProjection,
          PreparationDecisionIntent.NO_INTENT, PreparationDecisionDisposition.NO_REQUEST_DISPOSITION))
    }
  }

  def finalise(api: PreparationStateGovernor_Operational_Api): Unit = { }
}
