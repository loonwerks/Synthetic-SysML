// #Sireum

package scp_candidate.EIT_Acquisition_Session_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor {

  // BEGIN STATE VARS
  var committedMonitoringState: EIT_Acquisition_Session_Coordinator.MonitoringState.Type = EIT_Acquisition_Session_Coordinator.MonitoringState.MONITORING_INACTIVE
  // END STATE VARS

  def initialise(api: MonitoringStateGovernor_Initialization_Api): Unit = {
    Contract(Modifies(api, committedMonitoringState),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INIT_MONITORING_STATE
        committedMonitoringState == MonitoringState.MONITORING_INACTIVE &&
          api.monitoringState == MonitoringState.MONITORING_INACTIVE &&
          api.monitoringDecision.preState == MonitoringDecisionPreState.MONITORING_INACTIVE &&
          api.monitoringDecision.nextState == MonitoringDecisionNextState.MONITORING_INACTIVE &&
          api.monitoringDecision.effectiveIntent == MonitoringDecisionIntent.NO_INTENT &&
          api.monitoringDecision.disposition == MonitoringDecisionDisposition.NO_REQUEST_DISPOSITION &&
          api.monitoringDecision.notice == MonitoringDecisionNotice.NONE &&
          api.monitoringDecision.preparationState == MonitoringDecisionPreparationState.UNPREPARED
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    committedMonitoringState = MonitoringState.MONITORING_INACTIVE
    api.put_monitoringState(MonitoringState.MONITORING_INACTIVE)
    api.put_monitoringDecision(MonitoringDecisionSnapshot(MonitoringDecisionPreState.MONITORING_INACTIVE, MonitoringDecisionNextState.MONITORING_INACTIVE, MonitoringDecisionIntent.NO_INTENT, MonitoringDecisionDisposition.NO_REQUEST_DISPOSITION, MonitoringDecisionNotice.NONE, MonitoringDecisionPreparationState.UNPREPARED))
  }

  def timeTriggered(api: MonitoringStateGovernor_Operational_Api): Unit = {
    Contract(Modifies(api, committedMonitoringState))
    (api.get_preparationDecision(), api.get_arbitrationDecision(), api.get_eligibilityEnvelope()) match {
      case (Some(preparation), Some(arbitration), Some(envelope)) =>
        val pre = committedMonitoringState
        committedMonitoringState =
          if (arbitration.effectiveIntent == ArbitrationDecisionEffectiveIntent.STOP_INTENT) MonitoringState.MONITORING_INACTIVE
          else if (pre == MonitoringState.MONITORING_ACTIVE &&
            (arbitration.effectiveIntent == ArbitrationDecisionEffectiveIntent.RESET_PREPARATION_INTENT ||
              arbitration.effectiveIntent == ArbitrationDecisionEffectiveIntent.HOLD_MONITORING_INTENT)) MonitoringState.MONITORING_HELD
          else if (arbitration.effectiveIntent == ArbitrationDecisionEffectiveIntent.START_MONITORING_INTENT &&
            envelope.condition == EligibilityEnvelopeCondition.ACQUISITION_READY) MonitoringState.MONITORING_ACTIVE
          else pre
        val next: MonitoringDecisionNextState.Type = committedMonitoringState match {
          case MonitoringState.MONITORING_ACTIVE => MonitoringDecisionNextState.MONITORING_ACTIVE
          case MonitoringState.MONITORING_HELD => MonitoringDecisionNextState.MONITORING_HELD
          case _ => MonitoringDecisionNextState.MONITORING_INACTIVE
        }
        val preState: MonitoringDecisionPreState.Type = pre match {
          case MonitoringState.MONITORING_ACTIVE => MonitoringDecisionPreState.MONITORING_ACTIVE
          case MonitoringState.MONITORING_HELD => MonitoringDecisionPreState.MONITORING_HELD
          case _ => MonitoringDecisionPreState.MONITORING_INACTIVE
        }
        api.put_monitoringState(pre)
        api.put_monitoringDecision(MonitoringDecisionSnapshot(preState, next,
          MonitoringDecisionIntent.NO_INTENT, MonitoringDecisionDisposition.NO_REQUEST_DISPOSITION,
          if (committedMonitoringState == MonitoringState.MONITORING_HELD) MonitoringDecisionNotice.MONITORING_HELD_NOTICE
          else MonitoringDecisionNotice.NONE, MonitoringDecisionPreparationState.UNPREPARED))
    }
  }

  def finalise(api: MonitoringStateGovernor_Operational_Api): Unit = { }
}
