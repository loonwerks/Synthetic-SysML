// #Sireum

package drone_lifecycle_governor.Drone_Lifecycle_Governor

import org.sireum._
import drone_lifecycle_governor._

// This file will not be overwritten if HAMR codegen is rerun
object RequestArbiter_governorProcess_requestArbiter {

  def initialise(api: RequestArbiter_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_arbitratedIntent(Drone_Lifecycle_Governor.ArbitratedIntent.example())
  }

  def timeTriggered(api: RequestArbiter_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_11
        //   SWITCH_OFF always dominates recovery
        (api.pilotRequest == LifecycleRequest.SWITCH_OFF) ___>: (api.arbitratedIntent.effectiveIntent == EffectiveIntent.SWITCH_OFF &
          api.arbitratedIntent.preemption == FreshRequestPreemption.NOT_PREEMPTED),
        // case CASE_12
        //   Recovery preempts every non-shutdown fresh request
        (api.pilotRequest != LifecycleRequest.SWITCH_OFF &
          api.recoveryProposal != RecoveryProposal.NO_RECOVERY) ___>: (api.arbitratedIntent.effectiveIntent == EffectiveIntent.RECOVER_TO_STANDBY &
          (api.pilotRequest == LifecycleRequest.NO_REQUEST &
            api.arbitratedIntent.preemption == FreshRequestPreemption.NOT_PREEMPTED |
            api.pilotRequest != LifecycleRequest.NO_REQUEST &
              api.arbitratedIntent.preemption == FreshRequestPreemption.PREEMPTED)),
        // case CASE_13
        //   Otherwise translate the finite pilot request
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
    val result: Drone_Lifecycle_Governor.ArbitratedIntent =
      if (request == LifecycleRequest.SWITCH_OFF) {
        ArbitratedIntent(EffectiveIntent.SWITCH_OFF, FreshRequestPreemption.NOT_PREEMPTED)
      } else if (recovery != RecoveryProposal.NO_RECOVERY) {
        ArbitratedIntent(
          EffectiveIntent.RECOVER_TO_STANDBY,
          if (request == LifecycleRequest.NO_REQUEST) FreshRequestPreemption.NOT_PREEMPTED
          else FreshRequestPreemption.PREEMPTED)
      } else {
        val intent: Drone_Lifecycle_Governor.EffectiveIntent.Type =
          if (request == LifecycleRequest.NO_REQUEST) EffectiveIntent.NO_INTENT
          else if (request == LifecycleRequest.SWITCH_ON) EffectiveIntent.SWITCH_ON
          else if (request == LifecycleRequest.BEGIN_CHARGE &
            charger == ChargerState.DISCONNECTED) EffectiveIntent.REJECT_BEGIN_CHARGE
          else if (request == LifecycleRequest.BEGIN_CHARGE) EffectiveIntent.BEGIN_CHARGE
          else if (request == LifecycleRequest.END_CHARGE) EffectiveIntent.END_CHARGE
          else if (request == LifecycleRequest.ACTIVATE) EffectiveIntent.ACTIVATE
          else if (request == LifecycleRequest.DEACTIVATE) EffectiveIntent.DEACTIVATE
          else if (request == LifecycleRequest.BEGIN_FLIGHT) EffectiveIntent.BEGIN_FLIGHT
          else EffectiveIntent.END_FLIGHT
        ArbitratedIntent(intent, FreshRequestPreemption.NOT_PREEMPTED)
      }
    api.put_arbitratedIntent(result)
  }

  def finalise(api: RequestArbiter_Operational_Api): Unit = { }
}
