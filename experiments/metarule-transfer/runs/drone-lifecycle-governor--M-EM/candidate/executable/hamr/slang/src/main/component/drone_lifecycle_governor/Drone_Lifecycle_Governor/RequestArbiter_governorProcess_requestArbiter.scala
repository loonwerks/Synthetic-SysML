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
        //   Switch-off takes precedence
        (api.pilotRequest == LifecycleRequest.SWITCH_OFF) ___>: (api.arbitratedIntent.effectiveIntent == EffectiveIntent.SWITCH_OFF &
          api.arbitratedIntent.preemption == FreshRequestPreemption.NOT_PREEMPTED),
        // case CASE_12
        //   Recovery preempts every non-switch-off fresh request
        (api.pilotRequest != LifecycleRequest.SWITCH_OFF &
          api.recoveryProposal != RecoveryProposal.NO_RECOVERY) ___>: (api.arbitratedIntent.effectiveIntent == EffectiveIntent.RECOVER_TO_STANDBY &
          (api.pilotRequest == LifecycleRequest.NO_REQUEST &
            api.arbitratedIntent.preemption == FreshRequestPreemption.NOT_PREEMPTED |
            api.pilotRequest != LifecycleRequest.NO_REQUEST &
              api.arbitratedIntent.preemption == FreshRequestPreemption.PREEMPTED)),
        // case CASE_13
        //   Translate a fresh request when recovery is absent
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
    val request = api.get_pilotRequest()
    val charger = api.get_chargerState()
    val recovery = api.get_recoveryProposal()
    (request, charger, recovery) match {
      case (Some(LifecycleRequest.SWITCH_OFF), _, _) =>
        api.put_arbitratedIntent(ArbitratedIntent(
          EffectiveIntent.SWITCH_OFF, FreshRequestPreemption.NOT_PREEMPTED))
      case (Some(LifecycleRequest.NO_REQUEST), _, Some(proposal))
          if proposal != RecoveryProposal.NO_RECOVERY =>
        api.put_arbitratedIntent(ArbitratedIntent(
          EffectiveIntent.RECOVER_TO_STANDBY, FreshRequestPreemption.NOT_PREEMPTED))
      case (Some(_), _, Some(proposal)) if proposal != RecoveryProposal.NO_RECOVERY =>
        api.put_arbitratedIntent(ArbitratedIntent(
          EffectiveIntent.RECOVER_TO_STANDBY, FreshRequestPreemption.PREEMPTED))
      case (Some(LifecycleRequest.BEGIN_CHARGE), Some(ChargerState.DISCONNECTED), _) =>
        api.put_arbitratedIntent(ArbitratedIntent(
          EffectiveIntent.REJECT_BEGIN_CHARGE, FreshRequestPreemption.NOT_PREEMPTED))
      case (Some(LifecycleRequest.BEGIN_CHARGE), _, _) =>
        api.put_arbitratedIntent(ArbitratedIntent(
          EffectiveIntent.BEGIN_CHARGE, FreshRequestPreemption.NOT_PREEMPTED))
      case (Some(LifecycleRequest.NO_REQUEST), _, _) =>
        api.put_arbitratedIntent(ArbitratedIntent(
          EffectiveIntent.NO_INTENT, FreshRequestPreemption.NOT_PREEMPTED))
      case (Some(LifecycleRequest.SWITCH_ON), _, _) =>
        api.put_arbitratedIntent(ArbitratedIntent(
          EffectiveIntent.SWITCH_ON, FreshRequestPreemption.NOT_PREEMPTED))
      case (Some(LifecycleRequest.END_CHARGE), _, _) =>
        api.put_arbitratedIntent(ArbitratedIntent(
          EffectiveIntent.END_CHARGE, FreshRequestPreemption.NOT_PREEMPTED))
      case (Some(LifecycleRequest.ACTIVATE), _, _) =>
        api.put_arbitratedIntent(ArbitratedIntent(
          EffectiveIntent.ACTIVATE, FreshRequestPreemption.NOT_PREEMPTED))
      case (Some(LifecycleRequest.DEACTIVATE), _, _) =>
        api.put_arbitratedIntent(ArbitratedIntent(
          EffectiveIntent.DEACTIVATE, FreshRequestPreemption.NOT_PREEMPTED))
      case (Some(LifecycleRequest.BEGIN_FLIGHT), _, _) =>
        api.put_arbitratedIntent(ArbitratedIntent(
          EffectiveIntent.BEGIN_FLIGHT, FreshRequestPreemption.NOT_PREEMPTED))
      case (Some(LifecycleRequest.END_FLIGHT), _, _) =>
        api.put_arbitratedIntent(ArbitratedIntent(
          EffectiveIntent.END_FLIGHT, FreshRequestPreemption.NOT_PREEMPTED))
      case _ =>
        api.put_arbitratedIntent(ArbitratedIntent(
          EffectiveIntent.NO_INTENT, FreshRequestPreemption.NOT_PREEMPTED))
    }
  }

  def finalise(api: RequestArbiter_Operational_Api): Unit = { }
}
