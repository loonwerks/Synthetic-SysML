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
        //   Shutdown transitions to OFF
        (api.arbitratedIntent.effectiveIntent == EffectiveIntent.SWITCH_OFF) ___>: (api.decisionSnapshot.nextState == DecisionNextState.OFF &
          api.decisionSnapshot.transitionResult == TransitionResult.ACCEPTED &
          api.decisionSnapshot.decisionReason == EligibilityReason.NONE),
        // case CASE_15
        //   Eligible forward transitions are accepted
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
        //   Back transitions and recovery enter standby
        (In(committedLifecycleState) == LifecycleState.CHARGING &
          api.arbitratedIntent.effectiveIntent == EffectiveIntent.END_CHARGE |
          In(committedLifecycleState) == LifecycleState.READY &
            api.arbitratedIntent.effectiveIntent == EffectiveIntent.DEACTIVATE |
          In(committedLifecycleState) == LifecycleState.FLYING &
            api.arbitratedIntent.effectiveIntent == EffectiveIntent.END_FLIGHT |
          (In(committedLifecycleState) == LifecycleState.READY |
            In(committedLifecycleState) == LifecycleState.FLYING |
            In(committedLifecycleState) == LifecycleState.CHARGING) &
            api.arbitratedIntent.effectiveIntent == EffectiveIntent.RECOVER_TO_STANDBY) ___>: ((In(committedLifecycleState) == LifecycleState.CHARGING &
          api.arbitratedIntent.effectiveIntent == EffectiveIntent.END_CHARGE |
          In(committedLifecycleState) == LifecycleState.READY &
            api.arbitratedIntent.effectiveIntent == EffectiveIntent.DEACTIVATE) &
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
        //   All remaining intents retain or reject
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
              api.eligibilityEnvelope.flightEligible) &
          !(In(committedLifecycleState) == LifecycleState.CHARGING &
            api.arbitratedIntent.effectiveIntent == EffectiveIntent.END_CHARGE |
            In(committedLifecycleState) == LifecycleState.READY &
              api.arbitratedIntent.effectiveIntent == EffectiveIntent.DEACTIVATE |
            In(committedLifecycleState) == LifecycleState.FLYING &
              api.arbitratedIntent.effectiveIntent == EffectiveIntent.END_FLIGHT |
            (In(committedLifecycleState) == LifecycleState.READY |
              In(committedLifecycleState) == LifecycleState.FLYING |
              In(committedLifecycleState) == LifecycleState.CHARGING) &
              api.arbitratedIntent.effectiveIntent == EffectiveIntent.RECOVER_TO_STANDBY)) ___>: ((In(committedLifecycleState) == LifecycleState.OFF &
          api.decisionSnapshot.nextState == DecisionNextState.OFF |
          In(committedLifecycleState) == LifecycleState.STANDBY &
            api.decisionSnapshot.nextState == DecisionNextState.STANDBY |
          In(committedLifecycleState) == LifecycleState.CHARGING &
            api.decisionSnapshot.nextState == DecisionNextState.CHARGING |
          In(committedLifecycleState) == LifecycleState.READY &
            api.decisionSnapshot.nextState == DecisionNextState.READY |
          In(committedLifecycleState) == LifecycleState.FLYING &
            api.decisionSnapshot.nextState == DecisionNextState.FLYING) &
          (api.arbitratedIntent.effectiveIntent == EffectiveIntent.NO_INTENT &
            api.decisionSnapshot.transitionResult == TransitionResult.NO_CHANGE &
            api.decisionSnapshot.decisionReason == EligibilityReason.NONE |
            api.arbitratedIntent.effectiveIntent == EffectiveIntent.REJECT_BEGIN_CHARGE &
              api.decisionSnapshot.transitionResult == TransitionResult.REJECTED &
              api.decisionSnapshot.decisionReason == EligibilityReason.CHARGER_DISCONNECTED |
            (In(committedLifecycleState) == LifecycleState.STANDBY &
              api.arbitratedIntent.effectiveIntent == EffectiveIntent.BEGIN_CHARGE &
              !(api.eligibilityEnvelope.chargeEligible) |
              In(committedLifecycleState) == LifecycleState.STANDBY &
                api.arbitratedIntent.effectiveIntent == EffectiveIntent.ACTIVATE &
                !(api.eligibilityEnvelope.flightEligible) |
              In(committedLifecycleState) == LifecycleState.READY &
                api.arbitratedIntent.effectiveIntent == EffectiveIntent.BEGIN_FLIGHT &
                !(api.eligibilityEnvelope.flightEligible)) &
              api.decisionSnapshot.transitionResult == TransitionResult.REJECTED &
              api.decisionSnapshot.decisionReason == api.eligibilityEnvelope.decisionReason |
            api.arbitratedIntent.effectiveIntent != EffectiveIntent.NO_INTENT &
              api.arbitratedIntent.effectiveIntent != EffectiveIntent.REJECT_BEGIN_CHARGE &
              !(In(committedLifecycleState) == LifecycleState.STANDBY &
                api.arbitratedIntent.effectiveIntent == EffectiveIntent.BEGIN_CHARGE &
                !(api.eligibilityEnvelope.chargeEligible) |
                In(committedLifecycleState) == LifecycleState.STANDBY &
                  api.arbitratedIntent.effectiveIntent == EffectiveIntent.ACTIVATE &
                  !(api.eligibilityEnvelope.flightEligible) |
                In(committedLifecycleState) == LifecycleState.READY &
                  api.arbitratedIntent.effectiveIntent == EffectiveIntent.BEGIN_FLIGHT &
                  !(api.eligibilityEnvelope.flightEligible)) &
              api.decisionSnapshot.transitionResult == TransitionResult.REJECTED &
              api.decisionSnapshot.decisionReason == EligibilityReason.NONE))
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val intent = api.get_arbitratedIntent().get
    val eligibility = api.get_eligibilityEnvelope().get
    val previous = committedLifecycleState
    val forward =
      (previous == LifecycleState.OFF & intent.effectiveIntent == EffectiveIntent.SWITCH_ON) |
      (previous == LifecycleState.STANDBY & intent.effectiveIntent == EffectiveIntent.BEGIN_CHARGE &
        eligibility.chargeEligible) |
      (previous == LifecycleState.STANDBY & intent.effectiveIntent == EffectiveIntent.ACTIVATE &
        eligibility.flightEligible) |
      (previous == LifecycleState.READY & intent.effectiveIntent == EffectiveIntent.BEGIN_FLIGHT &
        eligibility.flightEligible)
    val back =
      (previous == LifecycleState.CHARGING & intent.effectiveIntent == EffectiveIntent.END_CHARGE) |
      (previous == LifecycleState.READY & intent.effectiveIntent == EffectiveIntent.DEACTIVATE) |
      (previous == LifecycleState.FLYING & intent.effectiveIntent == EffectiveIntent.END_FLIGHT)
    val recovery = (previous == LifecycleState.CHARGING | previous == LifecycleState.READY |
      previous == LifecycleState.FLYING) &
      intent.effectiveIntent == EffectiveIntent.RECOVER_TO_STANDBY
    val next: Drone_Lifecycle_Governor.LifecycleState.Type =
      if (intent.effectiveIntent == EffectiveIntent.SWITCH_OFF) LifecycleState.OFF
      else if (forward & previous == LifecycleState.OFF) LifecycleState.STANDBY
      else if (forward & intent.effectiveIntent == EffectiveIntent.BEGIN_CHARGE) LifecycleState.CHARGING
      else if (forward & intent.effectiveIntent == EffectiveIntent.ACTIVATE) LifecycleState.READY
      else if (forward) LifecycleState.FLYING
      else if (back & previous == LifecycleState.FLYING) LifecycleState.READY
      else if (back | recovery) LifecycleState.STANDBY
      else previous
    val result: Drone_Lifecycle_Governor.TransitionResult.Type =
      if (intent.effectiveIntent == EffectiveIntent.SWITCH_OFF | forward | back) TransitionResult.ACCEPTED
      else if (recovery & intent.preemption == FreshRequestPreemption.PREEMPTED)
        TransitionResult.FRESH_REQUEST_PREEMPTED
      else if (recovery) TransitionResult.RECOVERY_APPLIED
      else if (intent.effectiveIntent == EffectiveIntent.NO_INTENT) TransitionResult.NO_CHANGE
      else TransitionResult.REJECTED
    val reason: Drone_Lifecycle_Governor.EligibilityReason.Type =
      if (recovery) eligibility.decisionReason
      else if (intent.effectiveIntent == EffectiveIntent.REJECT_BEGIN_CHARGE)
        EligibilityReason.CHARGER_DISCONNECTED
      else if ((previous == LifecycleState.STANDBY &
          intent.effectiveIntent == EffectiveIntent.BEGIN_CHARGE & !eligibility.chargeEligible) |
        (previous == LifecycleState.STANDBY &
          intent.effectiveIntent == EffectiveIntent.ACTIVATE & !eligibility.flightEligible) |
        (previous == LifecycleState.READY &
          intent.effectiveIntent == EffectiveIntent.BEGIN_FLIGHT & !eligibility.flightEligible))
        eligibility.decisionReason
      else EligibilityReason.NONE
    val preState: Drone_Lifecycle_Governor.DecisionPreState.Type =
      if (previous == LifecycleState.OFF) DecisionPreState.OFF
      else if (previous == LifecycleState.STANDBY) DecisionPreState.STANDBY
      else if (previous == LifecycleState.CHARGING) DecisionPreState.CHARGING
      else if (previous == LifecycleState.READY) DecisionPreState.READY
      else DecisionPreState.FLYING
    val nextState: Drone_Lifecycle_Governor.DecisionNextState.Type =
      if (next == LifecycleState.OFF) DecisionNextState.OFF
      else if (next == LifecycleState.STANDBY) DecisionNextState.STANDBY
      else if (next == LifecycleState.CHARGING) DecisionNextState.CHARGING
      else if (next == LifecycleState.READY) DecisionNextState.READY
      else DecisionNextState.FLYING
    committedLifecycleState = next
    api.put_currentLifecycleState(previous)
    api.put_decisionSnapshot(DecisionSnapshot(preState, nextState, intent.effectiveIntent, result, reason))
  }

  def finalise(api: LifecycleStateGovernor_Operational_Api): Unit = { }
}
