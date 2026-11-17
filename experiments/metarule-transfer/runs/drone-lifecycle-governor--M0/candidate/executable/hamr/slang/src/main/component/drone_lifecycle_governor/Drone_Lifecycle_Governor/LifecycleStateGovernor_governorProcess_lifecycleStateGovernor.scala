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
    Contract(Modifies(api, committedLifecycleState))
    committedLifecycleState = LifecycleState.OFF
    api.put_currentLifecycleState(LifecycleState.OFF)
    api.put_decisionSnapshot(Drone_Lifecycle_Governor.DecisionSnapshot(
      DecisionPreState.OFF,
      DecisionNextState.OFF,
      EffectiveIntent.NO_INTENT,
      TransitionResult.NO_CHANGE,
      EligibilityReason.NONE))
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
        //   Switch off always commits OFF | N.md#CASE_14
        (api.arbitratedIntent.effectiveIntent == EffectiveIntent.SWITCH_OFF) ___>: (api.decisionSnapshot.nextState == DecisionNextState.OFF &
          api.decisionSnapshot.transitionResult == TransitionResult.ACCEPTED &
          api.decisionSnapshot.decisionReason == EligibilityReason.NONE),
        // case CASE_15
        //   Eligible progression advances lifecycle | N.md#CASE_15
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
        //   End requests and recovery return safely | N.md#CASE_16
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
        //   All other requests hold or reject deterministically | N.md#CASE_17
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
    val arbitrated = api.get_arbitratedIntent().get
    val eligibility = api.get_eligibilityEnvelope().get
    val prior = committedLifecycleState
    val eligibleProgress =
      (prior == LifecycleState.OFF &
        arbitrated.effectiveIntent == EffectiveIntent.SWITCH_ON) |
      (prior == LifecycleState.STANDBY &
        arbitrated.effectiveIntent == EffectiveIntent.BEGIN_CHARGE &
        eligibility.chargeEligible) |
      (prior == LifecycleState.STANDBY &
        arbitrated.effectiveIntent == EffectiveIntent.ACTIVATE &
        eligibility.flightEligible) |
      (prior == LifecycleState.READY &
        arbitrated.effectiveIntent == EffectiveIntent.BEGIN_FLIGHT &
        eligibility.flightEligible)
    val acceptedEnd =
      (prior == LifecycleState.CHARGING &
        arbitrated.effectiveIntent == EffectiveIntent.END_CHARGE) |
      (prior == LifecycleState.READY &
        arbitrated.effectiveIntent == EffectiveIntent.DEACTIVATE) |
      (prior == LifecycleState.FLYING &
        arbitrated.effectiveIntent == EffectiveIntent.END_FLIGHT)
    val recovery =
      (prior == LifecycleState.READY | prior == LifecycleState.FLYING |
        prior == LifecycleState.CHARGING) &
        arbitrated.effectiveIntent == EffectiveIntent.RECOVER_TO_STANDBY
    val blockedProgress =
      (prior == LifecycleState.STANDBY &
        arbitrated.effectiveIntent == EffectiveIntent.BEGIN_CHARGE &
        !eligibility.chargeEligible) |
      (prior == LifecycleState.STANDBY &
        arbitrated.effectiveIntent == EffectiveIntent.ACTIVATE &
        !eligibility.flightEligible) |
      (prior == LifecycleState.READY &
        arbitrated.effectiveIntent == EffectiveIntent.BEGIN_FLIGHT &
        !eligibility.flightEligible)
    val nextState: LifecycleState.Type =
      if (arbitrated.effectiveIntent == EffectiveIntent.SWITCH_OFF) {
        LifecycleState.OFF
      } else if (prior == LifecycleState.OFF &
        arbitrated.effectiveIntent == EffectiveIntent.SWITCH_ON) {
        LifecycleState.STANDBY
      } else if (prior == LifecycleState.STANDBY &
        arbitrated.effectiveIntent == EffectiveIntent.BEGIN_CHARGE &
        eligibility.chargeEligible) {
        LifecycleState.CHARGING
      } else if (prior == LifecycleState.STANDBY &
        arbitrated.effectiveIntent == EffectiveIntent.ACTIVATE &
        eligibility.flightEligible) {
        LifecycleState.READY
      } else if (prior == LifecycleState.READY &
        arbitrated.effectiveIntent == EffectiveIntent.BEGIN_FLIGHT &
        eligibility.flightEligible) {
        LifecycleState.FLYING
      } else if ((prior == LifecycleState.CHARGING &
        arbitrated.effectiveIntent == EffectiveIntent.END_CHARGE) |
        (prior == LifecycleState.READY &
          arbitrated.effectiveIntent == EffectiveIntent.DEACTIVATE) |
        recovery) {
        LifecycleState.STANDBY
      } else if (prior == LifecycleState.FLYING &
        arbitrated.effectiveIntent == EffectiveIntent.END_FLIGHT) {
        LifecycleState.READY
      } else {
        prior
      }
    val result: TransitionResult.Type =
      if (arbitrated.effectiveIntent == EffectiveIntent.SWITCH_OFF | eligibleProgress | acceptedEnd) {
        TransitionResult.ACCEPTED
      } else if (recovery) {
        if (arbitrated.preemption == FreshRequestPreemption.PREEMPTED) {
          TransitionResult.FRESH_REQUEST_PREEMPTED
        } else {
          TransitionResult.RECOVERY_APPLIED
        }
      } else if (arbitrated.effectiveIntent == EffectiveIntent.NO_INTENT) {
        TransitionResult.NO_CHANGE
      } else {
        TransitionResult.REJECTED
      }
    val reason: EligibilityReason.Type =
      if (arbitrated.effectiveIntent == EffectiveIntent.SWITCH_OFF | eligibleProgress | acceptedEnd |
        arbitrated.effectiveIntent == EffectiveIntent.NO_INTENT) {
        EligibilityReason.NONE
      } else if (recovery | blockedProgress) {
        eligibility.decisionReason
      } else if (arbitrated.effectiveIntent == EffectiveIntent.REJECT_BEGIN_CHARGE) {
        EligibilityReason.CHARGER_DISCONNECTED
      } else {
        EligibilityReason.NONE
      }
    val preState: DecisionPreState.Type =
      if (prior == LifecycleState.OFF) DecisionPreState.OFF
      else if (prior == LifecycleState.STANDBY) DecisionPreState.STANDBY
      else if (prior == LifecycleState.CHARGING) DecisionPreState.CHARGING
      else if (prior == LifecycleState.READY) DecisionPreState.READY
      else DecisionPreState.FLYING
    val snapshotNext: DecisionNextState.Type =
      if (nextState == LifecycleState.OFF) DecisionNextState.OFF
      else if (nextState == LifecycleState.STANDBY) DecisionNextState.STANDBY
      else if (nextState == LifecycleState.CHARGING) DecisionNextState.CHARGING
      else if (nextState == LifecycleState.READY) DecisionNextState.READY
      else DecisionNextState.FLYING
    committedLifecycleState = nextState
    api.put_currentLifecycleState(prior)
    api.put_decisionSnapshot(Drone_Lifecycle_Governor.DecisionSnapshot(
      preState, snapshotNext, arbitrated.effectiveIntent, result, reason))
  }

  def finalise(api: LifecycleStateGovernor_Operational_Api): Unit = { }
}
