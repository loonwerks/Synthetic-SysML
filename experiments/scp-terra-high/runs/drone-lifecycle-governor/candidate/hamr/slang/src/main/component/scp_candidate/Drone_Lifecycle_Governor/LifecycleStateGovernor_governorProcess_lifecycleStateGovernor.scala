// #Sireum

package scp_candidate.Drone_Lifecycle_Governor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object LifecycleStateGovernor_governorProcess_lifecycleStateGovernor {

  // BEGIN STATE VARS
  var committedLifecycleState: Drone_Lifecycle_Governor.LifecycleState.Type = Drone_Lifecycle_Governor.LifecycleState.OFF
  // END STATE VARS

  def initialise(api: LifecycleStateGovernor_Initialization_Api): Unit = {
    Contract(
      Modifies(
        // BEGIN INITIALIZES MODIFIES
        committedLifecycleState
        // END INITIALIZES MODIFIES
      ),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee initialCommitted
        committedLifecycleState == LifecycleState.OFF,
        // guarantee initialCurrent
        api.currentLifecycleState == LifecycleState.OFF,
        // guarantee initialSnapshot
        api.decisionSnapshot.preState == DecisionPreState.OFF &
          api.decisionSnapshot.nextState == DecisionNextState.OFF &
          api.decisionSnapshot.effectiveIntent == EffectiveIntent.NO_INTENT &
          api.decisionSnapshot.transitionResult == TransitionResult.NO_CHANGE &
          api.decisionSnapshot.decisionReason == EligibilityReason.NONE
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    committedLifecycleState = Drone_Lifecycle_Governor.LifecycleState.OFF
    api.put_currentLifecycleState(Drone_Lifecycle_Governor.LifecycleState.OFF)
    api.put_decisionSnapshot(Drone_Lifecycle_Governor.DecisionSnapshot(
      Drone_Lifecycle_Governor.DecisionPreState.OFF,
      Drone_Lifecycle_Governor.DecisionNextState.OFF,
      Drone_Lifecycle_Governor.EffectiveIntent.NO_INTENT,
      Drone_Lifecycle_Governor.TransitionResult.NO_CHANGE,
      Drone_Lifecycle_Governor.EligibilityReason.NONE))
  }

  def timeTriggered(api: LifecycleStateGovernor_Operational_Api): Unit = {
    Contract(Modifies(api, committedLifecycleState))
    (api.get_arbitratedIntent(), api.get_eligibilityEnvelope()) match {
      case (Some(intent), Some(envelope)) =>
        val pre: Drone_Lifecycle_Governor.LifecycleState.Type = committedLifecycleState
        val (next, result, reason): (Drone_Lifecycle_Governor.LifecycleState.Type, Drone_Lifecycle_Governor.TransitionResult.Type, Drone_Lifecycle_Governor.EligibilityReason.Type) =
          if (intent.effectiveIntent == Drone_Lifecycle_Governor.EffectiveIntent.SWITCH_OFF)
            (Drone_Lifecycle_Governor.LifecycleState.OFF, Drone_Lifecycle_Governor.TransitionResult.ACCEPTED,
              Drone_Lifecycle_Governor.EligibilityReason.NONE)
          else if (pre == Drone_Lifecycle_Governor.LifecycleState.OFF &&
            intent.effectiveIntent == Drone_Lifecycle_Governor.EffectiveIntent.SWITCH_ON)
            (Drone_Lifecycle_Governor.LifecycleState.STANDBY, Drone_Lifecycle_Governor.TransitionResult.ACCEPTED,
              Drone_Lifecycle_Governor.EligibilityReason.NONE)
          else if (pre == Drone_Lifecycle_Governor.LifecycleState.STANDBY &&
            intent.effectiveIntent == Drone_Lifecycle_Governor.EffectiveIntent.BEGIN_CHARGE && envelope.chargeEligible)
            (Drone_Lifecycle_Governor.LifecycleState.CHARGING, Drone_Lifecycle_Governor.TransitionResult.ACCEPTED,
              Drone_Lifecycle_Governor.EligibilityReason.NONE)
          else if (pre == Drone_Lifecycle_Governor.LifecycleState.STANDBY &&
            intent.effectiveIntent == Drone_Lifecycle_Governor.EffectiveIntent.ACTIVATE && envelope.flightEligible)
            (Drone_Lifecycle_Governor.LifecycleState.READY, Drone_Lifecycle_Governor.TransitionResult.ACCEPTED,
              Drone_Lifecycle_Governor.EligibilityReason.NONE)
          else if (pre == Drone_Lifecycle_Governor.LifecycleState.READY &&
            intent.effectiveIntent == Drone_Lifecycle_Governor.EffectiveIntent.BEGIN_FLIGHT && envelope.flightEligible)
            (Drone_Lifecycle_Governor.LifecycleState.FLYING, Drone_Lifecycle_Governor.TransitionResult.ACCEPTED,
              Drone_Lifecycle_Governor.EligibilityReason.NONE)
          else if ((pre == Drone_Lifecycle_Governor.LifecycleState.CHARGING &&
            intent.effectiveIntent == Drone_Lifecycle_Governor.EffectiveIntent.END_CHARGE) ||
            (pre == Drone_Lifecycle_Governor.LifecycleState.READY &&
              intent.effectiveIntent == Drone_Lifecycle_Governor.EffectiveIntent.DEACTIVATE))
            (Drone_Lifecycle_Governor.LifecycleState.STANDBY, Drone_Lifecycle_Governor.TransitionResult.ACCEPTED,
              Drone_Lifecycle_Governor.EligibilityReason.NONE)
          else if (pre == Drone_Lifecycle_Governor.LifecycleState.FLYING &&
            intent.effectiveIntent == Drone_Lifecycle_Governor.EffectiveIntent.END_FLIGHT)
            (Drone_Lifecycle_Governor.LifecycleState.READY, Drone_Lifecycle_Governor.TransitionResult.ACCEPTED,
              Drone_Lifecycle_Governor.EligibilityReason.NONE)
          else if ((pre == Drone_Lifecycle_Governor.LifecycleState.CHARGING ||
            pre == Drone_Lifecycle_Governor.LifecycleState.READY ||
            pre == Drone_Lifecycle_Governor.LifecycleState.FLYING) &&
            intent.effectiveIntent == Drone_Lifecycle_Governor.EffectiveIntent.RECOVER_TO_STANDBY)
            (Drone_Lifecycle_Governor.LifecycleState.STANDBY,
              if (intent.preemption == Drone_Lifecycle_Governor.FreshRequestPreemption.PREEMPTED)
                Drone_Lifecycle_Governor.TransitionResult.FRESH_REQUEST_PREEMPTED
              else Drone_Lifecycle_Governor.TransitionResult.RECOVERY_APPLIED,
              envelope.decisionReason)
          else if (intent.effectiveIntent == Drone_Lifecycle_Governor.EffectiveIntent.NO_INTENT)
            (pre, Drone_Lifecycle_Governor.TransitionResult.NO_CHANGE, Drone_Lifecycle_Governor.EligibilityReason.NONE)
          else if (intent.effectiveIntent == Drone_Lifecycle_Governor.EffectiveIntent.REJECT_BEGIN_CHARGE)
            (pre, Drone_Lifecycle_Governor.TransitionResult.REJECTED,
              Drone_Lifecycle_Governor.EligibilityReason.CHARGER_DISCONNECTED)
          else if ((pre == Drone_Lifecycle_Governor.LifecycleState.STANDBY &&
            intent.effectiveIntent == Drone_Lifecycle_Governor.EffectiveIntent.BEGIN_CHARGE && !envelope.chargeEligible) ||
            (pre == Drone_Lifecycle_Governor.LifecycleState.STANDBY &&
              intent.effectiveIntent == Drone_Lifecycle_Governor.EffectiveIntent.ACTIVATE && !envelope.flightEligible) ||
            (pre == Drone_Lifecycle_Governor.LifecycleState.READY &&
              intent.effectiveIntent == Drone_Lifecycle_Governor.EffectiveIntent.BEGIN_FLIGHT && !envelope.flightEligible))
            (pre, Drone_Lifecycle_Governor.TransitionResult.REJECTED, envelope.decisionReason)
          else (pre, Drone_Lifecycle_Governor.TransitionResult.REJECTED, Drone_Lifecycle_Governor.EligibilityReason.NONE)
        val preState: Drone_Lifecycle_Governor.DecisionPreState.Type =
          if (pre == Drone_Lifecycle_Governor.LifecycleState.OFF) Drone_Lifecycle_Governor.DecisionPreState.OFF
          else if (pre == Drone_Lifecycle_Governor.LifecycleState.STANDBY) Drone_Lifecycle_Governor.DecisionPreState.STANDBY
          else if (pre == Drone_Lifecycle_Governor.LifecycleState.CHARGING) Drone_Lifecycle_Governor.DecisionPreState.CHARGING
          else if (pre == Drone_Lifecycle_Governor.LifecycleState.READY) Drone_Lifecycle_Governor.DecisionPreState.READY
          else Drone_Lifecycle_Governor.DecisionPreState.FLYING
        val nextState: Drone_Lifecycle_Governor.DecisionNextState.Type =
          if (next == Drone_Lifecycle_Governor.LifecycleState.OFF) Drone_Lifecycle_Governor.DecisionNextState.OFF
          else if (next == Drone_Lifecycle_Governor.LifecycleState.STANDBY) Drone_Lifecycle_Governor.DecisionNextState.STANDBY
          else if (next == Drone_Lifecycle_Governor.LifecycleState.CHARGING) Drone_Lifecycle_Governor.DecisionNextState.CHARGING
          else if (next == Drone_Lifecycle_Governor.LifecycleState.READY) Drone_Lifecycle_Governor.DecisionNextState.READY
          else Drone_Lifecycle_Governor.DecisionNextState.FLYING
        api.put_currentLifecycleState(pre)
        committedLifecycleState = next
        api.put_decisionSnapshot(Drone_Lifecycle_Governor.DecisionSnapshot(preState, nextState,
          intent.effectiveIntent, result, reason))
    }
  }

  def finalise(api: LifecycleStateGovernor_Operational_Api): Unit = { }
}
