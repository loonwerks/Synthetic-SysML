// #Sireum

package drone_lifecycle_governor.Drone_Lifecycle_Governor

import org.sireum._
import drone_lifecycle_governor._

// This file will not be overwritten if HAMR codegen is rerun
object RequestArbiter_governorProcess_requestArbiter {

  def initialise(api: RequestArbiter_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_arbitratedIntent(Drone_Lifecycle_Governor.ArbitratedIntent(
      EffectiveIntent.NO_INTENT,
      FreshRequestPreemption.NOT_PREEMPTED))
  }

  def timeTriggered(api: RequestArbiter_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_11
        //   Shutdown dominates recovery | N.md#CASE_11
        (api.pilotRequest == LifecycleRequest.SWITCH_OFF) ___>: (api.arbitratedIntent.effectiveIntent == EffectiveIntent.SWITCH_OFF &
          api.arbitratedIntent.preemption == FreshRequestPreemption.NOT_PREEMPTED),
        // case CASE_12
        //   Recovery preempts every non-shutdown request | N.md#CASE_12
        (api.pilotRequest != LifecycleRequest.SWITCH_OFF &
          api.recoveryProposal != RecoveryProposal.NO_RECOVERY) ___>: (api.arbitratedIntent.effectiveIntent == EffectiveIntent.RECOVER_TO_STANDBY &
          (api.pilotRequest == LifecycleRequest.NO_REQUEST &
            api.arbitratedIntent.preemption == FreshRequestPreemption.NOT_PREEMPTED |
            api.pilotRequest != LifecycleRequest.NO_REQUEST &
              api.arbitratedIntent.preemption == FreshRequestPreemption.PREEMPTED)),
        // case CASE_13
        //   No recovery maps each request deterministically | N.md#CASE_13
        (api.pilotRequest != LifecycleRequest.SWITCH_OFF &
          api.recoveryProposal == RecoveryProposal.NO_RECOVERY) ___>: (api.arbitratedIntent.preemption == FreshRequestPreemption.NOT_PREEMPTED &
          (api.pilotRequest == LifecycleRequest.NO_REQUEST &
            api.arbitratedIntent.effectiveIntent == EffectiveIntent.NO_INTENT |
            api.pilotRequest == LifecycleRequest.SWITCH_ON &
              api.arbitratedIntent.effectiveIntent == EffectiveIntent.SWITCH_ON |
            api.pilotRequest == LifecycleRequest.BEGIN_CHARGE &
              api.chargerState == ChargerState.DISCONNECTED &
              api.arbitratedIntent.effectiveIntent == EffectiveIntent.REJECT_BEGIN_CHARGE |
            api.pilotRequest == LifecycleRequest.BEGIN_CHARGE &
              api.chargerState == ChargerState.CONNECTED &
              api.arbitratedIntent.effectiveIntent == EffectiveIntent.BEGIN_CHARGE |
            api.pilotRequest == LifecycleRequest.END_CHARGE &
              api.arbitratedIntent.effectiveIntent == EffectiveIntent.END_CHARGE |
            api.pilotRequest == LifecycleRequest.ACTIVATE &
              api.arbitratedIntent.effectiveIntent == EffectiveIntent.ACTIVATE |
            api.pilotRequest == LifecycleRequest.DEACTIVATE &
              api.arbitratedIntent.effectiveIntent == EffectiveIntent.DEACTIVATE |
            api.pilotRequest == LifecycleRequest.BEGIN_FLIGHT &
              api.arbitratedIntent.effectiveIntent == EffectiveIntent.BEGIN_FLIGHT |
            api.pilotRequest == LifecycleRequest.END_FLIGHT &
              api.arbitratedIntent.effectiveIntent == EffectiveIntent.END_FLIGHT))
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val request = api.get_pilotRequest().get
    val charger = api.get_chargerState().get
    val recovery = api.get_recoveryProposal().get
    val intent: EffectiveIntent.Type =
      if (request == LifecycleRequest.SWITCH_OFF) {
        EffectiveIntent.SWITCH_OFF
      } else if (recovery != RecoveryProposal.NO_RECOVERY) {
        EffectiveIntent.RECOVER_TO_STANDBY
      } else if (request == LifecycleRequest.NO_REQUEST) {
        EffectiveIntent.NO_INTENT
      } else if (request == LifecycleRequest.SWITCH_ON) {
        EffectiveIntent.SWITCH_ON
      } else if (request == LifecycleRequest.BEGIN_CHARGE) {
        if (charger == ChargerState.CONNECTED) EffectiveIntent.BEGIN_CHARGE
        else EffectiveIntent.REJECT_BEGIN_CHARGE
      } else if (request == LifecycleRequest.END_CHARGE) {
        EffectiveIntent.END_CHARGE
      } else if (request == LifecycleRequest.ACTIVATE) {
        EffectiveIntent.ACTIVATE
      } else if (request == LifecycleRequest.DEACTIVATE) {
        EffectiveIntent.DEACTIVATE
      } else if (request == LifecycleRequest.BEGIN_FLIGHT) {
        EffectiveIntent.BEGIN_FLIGHT
      } else {
        EffectiveIntent.END_FLIGHT
      }
    val preemption: FreshRequestPreemption.Type =
      if (request != LifecycleRequest.SWITCH_OFF &
        recovery != RecoveryProposal.NO_RECOVERY &
        request != LifecycleRequest.NO_REQUEST) FreshRequestPreemption.PREEMPTED
      else FreshRequestPreemption.NOT_PREEMPTED
    api.put_arbitratedIntent(Drone_Lifecycle_Governor.ArbitratedIntent(intent, preemption))
  }

  def finalise(api: RequestArbiter_Operational_Api): Unit = { }
}
