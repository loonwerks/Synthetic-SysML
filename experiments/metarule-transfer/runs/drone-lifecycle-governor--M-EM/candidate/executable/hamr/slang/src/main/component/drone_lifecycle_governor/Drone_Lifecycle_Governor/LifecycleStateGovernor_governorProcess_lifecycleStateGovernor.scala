// #Sireum

package drone_lifecycle_governor.Drone_Lifecycle_Governor

import org.sireum._
import drone_lifecycle_governor._

// This file will not be overwritten if HAMR codegen is rerun
object LifecycleStateGovernor_governorProcess_lifecycleStateGovernor {

  // BEGIN STATE VARS
  var committedLifecycleState: Drone_Lifecycle_Governor.LifecycleState.Type = Drone_Lifecycle_Governor.LifecycleState.OFF
  // END STATE VARS

  def initialise(api: LifecycleStateGovernor_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_currentLifecycleState(Drone_Lifecycle_Governor.LifecycleState.OFF)
    api.put_decisionSnapshot(Drone_Lifecycle_Governor.DecisionSnapshot.example())
  }

  def timeTriggered(api: LifecycleStateGovernor_Operational_Api): Unit = {
    Contract(
      Modifies(api, committedLifecycleState),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee PublishCommittedPreState
        api.currentLifecycleState == In(committedLifecycleState),
        // guarantee PreserveDecisionInputsAndCommitNextState
        api.decisionSnapshot.effectiveIntent == api.arbitratedIntent.effectiveIntent &
          (In(committedLifecycleState) == LifecycleState.OFF &
            api.decisionSnapshot.preState == DecisionPreState.OFF |
            In(committedLifecycleState) == LifecycleState.STANDBY &
              api.decisionSnapshot.preState == DecisionPreState.STANDBY |
            In(committedLifecycleState) == LifecycleState.CHARGING &
              api.decisionSnapshot.preState == DecisionPreState.CHARGING |
            In(committedLifecycleState) == LifecycleState.READY &
              api.decisionSnapshot.preState == DecisionPreState.READY |
            In(committedLifecycleState) == LifecycleState.FLYING &
              api.decisionSnapshot.preState == DecisionPreState.FLYING) &
          (api.decisionSnapshot.nextState == DecisionNextState.OFF &
            committedLifecycleState == LifecycleState.OFF |
            api.decisionSnapshot.nextState == DecisionNextState.STANDBY &
              committedLifecycleState == LifecycleState.STANDBY |
            api.decisionSnapshot.nextState == DecisionNextState.CHARGING &
              committedLifecycleState == LifecycleState.CHARGING |
            api.decisionSnapshot.nextState == DecisionNextState.READY &
              committedLifecycleState == LifecycleState.READY |
            api.decisionSnapshot.nextState == DecisionNextState.FLYING &
              committedLifecycleState == LifecycleState.FLYING),
        // case CASE_14
        //   Switch off is always accepted
        (api.arbitratedIntent.effectiveIntent == EffectiveIntent.SWITCH_OFF) ___>: (api.decisionSnapshot.nextState == DecisionNextState.OFF &
          api.decisionSnapshot.transitionResult == TransitionResult.ACCEPTED &
          api.decisionSnapshot.decisionReason == EligibilityReason.NONE),
        // case CASE_15
        //   Eligible progression is accepted
        (In(committedLifecycleState) == LifecycleState.OFF &
          api.arbitratedIntent.effectiveIntent == EffectiveIntent.SWITCH_ON |
          In(committedLifecycleState) == LifecycleState.STANDBY &
            api.arbitratedIntent.effectiveIntent == EffectiveIntent.BEGIN_CHARGE &
            api.eligibilityEnvelope.chargeEligible |
          In(committedLifecycleState) == LifecycleState.STANDBY &
            api.arbitratedIntent.effectiveIntent == EffectiveIntent.ACTIVATE &
            api.eligibilityEnvelope.flightEligible |
          In(committedLifecycleState) == LifecycleState.READY &
            api.arbitratedIntent.effectiveIntent == EffectiveIntent.BEGIN_FLIGHT &
            api.eligibilityEnvelope.flightEligible) ___>: (api.decisionSnapshot.transitionResult == TransitionResult.ACCEPTED &
          api.decisionSnapshot.decisionReason == EligibilityReason.NONE &
          (In(committedLifecycleState) == LifecycleState.OFF &
            api.decisionSnapshot.nextState == DecisionNextState.STANDBY |
            In(committedLifecycleState) == LifecycleState.STANDBY &
              api.arbitratedIntent.effectiveIntent == EffectiveIntent.BEGIN_CHARGE &
              api.decisionSnapshot.nextState == DecisionNextState.CHARGING |
            In(committedLifecycleState) == LifecycleState.STANDBY &
              api.arbitratedIntent.effectiveIntent == EffectiveIntent.ACTIVATE &
              api.decisionSnapshot.nextState == DecisionNextState.READY |
            In(committedLifecycleState) == LifecycleState.READY &
              api.decisionSnapshot.nextState == DecisionNextState.FLYING)),
        // case CASE_16
        //   Returns and recovery use their designated target
        (In(committedLifecycleState) == LifecycleState.CHARGING &
          api.arbitratedIntent.effectiveIntent == EffectiveIntent.END_CHARGE |
          In(committedLifecycleState) == LifecycleState.READY &
            api.arbitratedIntent.effectiveIntent == EffectiveIntent.DEACTIVATE |
          In(committedLifecycleState) == LifecycleState.FLYING &
            api.arbitratedIntent.effectiveIntent == EffectiveIntent.END_FLIGHT |
          (In(committedLifecycleState) == LifecycleState.READY |
            In(committedLifecycleState) == LifecycleState.FLYING |
            In(committedLifecycleState) == LifecycleState.CHARGING) &
            api.arbitratedIntent.effectiveIntent == EffectiveIntent.RECOVER_TO_STANDBY) ___>: (In(committedLifecycleState) == LifecycleState.CHARGING &
          api.arbitratedIntent.effectiveIntent == EffectiveIntent.END_CHARGE &
          api.decisionSnapshot.nextState == DecisionNextState.STANDBY &
          api.decisionSnapshot.transitionResult == TransitionResult.ACCEPTED &
          api.decisionSnapshot.decisionReason == EligibilityReason.NONE |
          In(committedLifecycleState) == LifecycleState.READY &
            api.arbitratedIntent.effectiveIntent == EffectiveIntent.DEACTIVATE &
            api.decisionSnapshot.nextState == DecisionNextState.STANDBY &
            api.decisionSnapshot.transitionResult == TransitionResult.ACCEPTED &
            api.decisionSnapshot.decisionReason == EligibilityReason.NONE |
          In(committedLifecycleState) == LifecycleState.FLYING &
            api.arbitratedIntent.effectiveIntent == EffectiveIntent.END_FLIGHT &
            api.decisionSnapshot.nextState == DecisionNextState.READY &
            api.decisionSnapshot.transitionResult == TransitionResult.ACCEPTED &
            api.decisionSnapshot.decisionReason == EligibilityReason.NONE |
          api.arbitratedIntent.effectiveIntent == EffectiveIntent.RECOVER_TO_STANDBY &
            api.decisionSnapshot.nextState == DecisionNextState.STANDBY &
            api.decisionSnapshot.decisionReason == api.eligibilityEnvelope.decisionReason &
            (api.arbitratedIntent.preemption == FreshRequestPreemption.PREEMPTED &
              api.decisionSnapshot.transitionResult == TransitionResult.FRESH_REQUEST_PREEMPTED |
              api.arbitratedIntent.preemption == FreshRequestPreemption.NOT_PREEMPTED &
                api.decisionSnapshot.transitionResult == TransitionResult.RECOVERY_APPLIED)),
        // case CASE_17
        //   All other requests hold or are rejected
        (api.arbitratedIntent.effectiveIntent != EffectiveIntent.SWITCH_OFF &
          !(In(committedLifecycleState) == LifecycleState.OFF &
            api.arbitratedIntent.effectiveIntent == EffectiveIntent.SWITCH_ON |
            In(committedLifecycleState) == LifecycleState.STANDBY &
              api.arbitratedIntent.effectiveIntent == EffectiveIntent.BEGIN_CHARGE &
              api.eligibilityEnvelope.chargeEligible |
            In(committedLifecycleState) == LifecycleState.STANDBY &
              api.arbitratedIntent.effectiveIntent == EffectiveIntent.ACTIVATE &
              api.eligibilityEnvelope.flightEligible |
            In(committedLifecycleState) == LifecycleState.READY &
              api.arbitratedIntent.effectiveIntent == EffectiveIntent.BEGIN_FLIGHT &
              api.eligibilityEnvelope.flightEligible |
            In(committedLifecycleState) == LifecycleState.CHARGING &
              api.arbitratedIntent.effectiveIntent == EffectiveIntent.END_CHARGE |
            In(committedLifecycleState) == LifecycleState.READY &
              api.arbitratedIntent.effectiveIntent == EffectiveIntent.DEACTIVATE |
            In(committedLifecycleState) == LifecycleState.FLYING &
              api.arbitratedIntent.effectiveIntent == EffectiveIntent.END_FLIGHT |
            (In(committedLifecycleState) == LifecycleState.READY |
              In(committedLifecycleState) == LifecycleState.FLYING |
              In(committedLifecycleState) == LifecycleState.CHARGING) &
              api.arbitratedIntent.effectiveIntent == EffectiveIntent.RECOVER_TO_STANDBY)) ___>: ((api.arbitratedIntent.effectiveIntent == EffectiveIntent.NO_INTENT &
          api.decisionSnapshot.transitionResult == TransitionResult.NO_CHANGE &
          api.decisionSnapshot.decisionReason == EligibilityReason.NONE |
          api.arbitratedIntent.effectiveIntent == EffectiveIntent.REJECT_BEGIN_CHARGE &
            api.decisionSnapshot.transitionResult == TransitionResult.REJECTED &
            api.decisionSnapshot.decisionReason == EligibilityReason.CHARGER_DISCONNECTED |
          api.arbitratedIntent.effectiveIntent != EffectiveIntent.NO_INTENT &
            api.arbitratedIntent.effectiveIntent != EffectiveIntent.REJECT_BEGIN_CHARGE &
            api.decisionSnapshot.transitionResult == TransitionResult.REJECTED) &
          (In(committedLifecycleState) == LifecycleState.OFF &
            api.decisionSnapshot.nextState == DecisionNextState.OFF |
            In(committedLifecycleState) == LifecycleState.STANDBY &
              api.decisionSnapshot.nextState == DecisionNextState.STANDBY |
            In(committedLifecycleState) == LifecycleState.CHARGING &
              api.decisionSnapshot.nextState == DecisionNextState.CHARGING |
            In(committedLifecycleState) == LifecycleState.READY &
              api.decisionSnapshot.nextState == DecisionNextState.READY |
            In(committedLifecycleState) == LifecycleState.FLYING &
              api.decisionSnapshot.nextState == DecisionNextState.FLYING))
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val intent = api.get_arbitratedIntent()
    val eligibility = api.get_eligibilityEnvelope()
    (intent, eligibility) match {
      case (Some(i), Some(e)) =>
        val pre = committedLifecycleState
        var next = pre
        var result = TransitionResult.NO_CHANGE
        var reason = EligibilityReason.NONE

        if (i.effectiveIntent == EffectiveIntent.SWITCH_OFF) {
          next = LifecycleState.OFF
          result = TransitionResult.ACCEPTED
        } else if (pre == LifecycleState.OFF &
          i.effectiveIntent == EffectiveIntent.SWITCH_ON) {
          next = LifecycleState.STANDBY
          result = TransitionResult.ACCEPTED
        } else if (pre == LifecycleState.STANDBY &
          i.effectiveIntent == EffectiveIntent.BEGIN_CHARGE &
          e.chargeEligible) {
          next = LifecycleState.CHARGING
          result = TransitionResult.ACCEPTED
        } else if (pre == LifecycleState.STANDBY &
          i.effectiveIntent == EffectiveIntent.ACTIVATE &
          e.flightEligible) {
          next = LifecycleState.READY
          result = TransitionResult.ACCEPTED
        } else if (pre == LifecycleState.READY &
          i.effectiveIntent == EffectiveIntent.BEGIN_FLIGHT &
          e.flightEligible) {
          next = LifecycleState.FLYING
          result = TransitionResult.ACCEPTED
        } else if ((pre == LifecycleState.CHARGING &
          i.effectiveIntent == EffectiveIntent.END_CHARGE) |
          (pre == LifecycleState.READY &
            i.effectiveIntent == EffectiveIntent.DEACTIVATE)) {
          next = LifecycleState.STANDBY
          result = TransitionResult.ACCEPTED
        } else if (pre == LifecycleState.FLYING &
          i.effectiveIntent == EffectiveIntent.END_FLIGHT) {
          next = LifecycleState.READY
          result = TransitionResult.ACCEPTED
        } else if ((pre == LifecycleState.READY | pre == LifecycleState.FLYING |
          pre == LifecycleState.CHARGING) &
          i.effectiveIntent == EffectiveIntent.RECOVER_TO_STANDBY) {
          next = LifecycleState.STANDBY
          result = if (i.preemption == FreshRequestPreemption.PREEMPTED)
            TransitionResult.FRESH_REQUEST_PREEMPTED
          else
            TransitionResult.RECOVERY_APPLIED
          reason = e.decisionReason
        } else if (i.effectiveIntent == EffectiveIntent.REJECT_BEGIN_CHARGE) {
          result = TransitionResult.REJECTED
          reason = EligibilityReason.CHARGER_DISCONNECTED
        } else if ((pre == LifecycleState.STANDBY &
          i.effectiveIntent == EffectiveIntent.BEGIN_CHARGE & !e.chargeEligible) |
          (pre == LifecycleState.STANDBY &
            i.effectiveIntent == EffectiveIntent.ACTIVATE & !e.flightEligible) |
          (pre == LifecycleState.READY &
            i.effectiveIntent == EffectiveIntent.BEGIN_FLIGHT & !e.flightEligible)) {
          result = TransitionResult.REJECTED
          reason = e.decisionReason
        } else if (i.effectiveIntent != EffectiveIntent.NO_INTENT) {
          result = TransitionResult.REJECTED
        }

        val preState: DecisionPreState.Type = pre match {
          case LifecycleState.OFF => DecisionPreState.OFF
          case LifecycleState.STANDBY => DecisionPreState.STANDBY
          case LifecycleState.CHARGING => DecisionPreState.CHARGING
          case LifecycleState.READY => DecisionPreState.READY
          case LifecycleState.FLYING => DecisionPreState.FLYING
        }
        val nextState: DecisionNextState.Type = next match {
          case LifecycleState.OFF => DecisionNextState.OFF
          case LifecycleState.STANDBY => DecisionNextState.STANDBY
          case LifecycleState.CHARGING => DecisionNextState.CHARGING
          case LifecycleState.READY => DecisionNextState.READY
          case LifecycleState.FLYING => DecisionNextState.FLYING
        }
        api.put_currentLifecycleState(pre)
        api.put_decisionSnapshot(DecisionSnapshot(
          preState, nextState, i.effectiveIntent, result, reason))
        committedLifecycleState = next
      case _ =>
        api.put_currentLifecycleState(committedLifecycleState)
        api.put_decisionSnapshot(DecisionSnapshot.example())
    }
  }

  def finalise(api: LifecycleStateGovernor_Operational_Api): Unit = { }
}
