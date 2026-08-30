// #Sireum

package scp_candidate.Drone_Lifecycle_Governor

import org.sireum._
import scp_candidate._

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
    Contract(Modifies(api))
    (api.get_pilotRequest(), api.get_chargerState(), api.get_recoveryProposal()) match {
      case (Some(request), Some(charger), Some(recovery)) =>
        val intent: Drone_Lifecycle_Governor.ArbitratedIntent =
          if (request == Drone_Lifecycle_Governor.LifecycleRequest.SWITCH_OFF) {
            Drone_Lifecycle_Governor.ArbitratedIntent(
              Drone_Lifecycle_Governor.EffectiveIntent.SWITCH_OFF,
              Drone_Lifecycle_Governor.FreshRequestPreemption.NOT_PREEMPTED)
          } else if (recovery != Drone_Lifecycle_Governor.RecoveryProposal.NO_RECOVERY) {
            Drone_Lifecycle_Governor.ArbitratedIntent(
              Drone_Lifecycle_Governor.EffectiveIntent.RECOVER_TO_STANDBY,
              if (request == Drone_Lifecycle_Governor.LifecycleRequest.NO_REQUEST)
                Drone_Lifecycle_Governor.FreshRequestPreemption.NOT_PREEMPTED
              else Drone_Lifecycle_Governor.FreshRequestPreemption.PREEMPTED)
          } else {
            val effective: Drone_Lifecycle_Governor.EffectiveIntent.Type =
              if (request == Drone_Lifecycle_Governor.LifecycleRequest.NO_REQUEST) Drone_Lifecycle_Governor.EffectiveIntent.NO_INTENT
              else if (request == Drone_Lifecycle_Governor.LifecycleRequest.SWITCH_ON) Drone_Lifecycle_Governor.EffectiveIntent.SWITCH_ON
              else if (request == Drone_Lifecycle_Governor.LifecycleRequest.BEGIN_CHARGE)
                if (charger == Drone_Lifecycle_Governor.ChargerState.CONNECTED) Drone_Lifecycle_Governor.EffectiveIntent.BEGIN_CHARGE
                else Drone_Lifecycle_Governor.EffectiveIntent.REJECT_BEGIN_CHARGE
              else if (request == Drone_Lifecycle_Governor.LifecycleRequest.END_CHARGE) Drone_Lifecycle_Governor.EffectiveIntent.END_CHARGE
              else if (request == Drone_Lifecycle_Governor.LifecycleRequest.ACTIVATE) Drone_Lifecycle_Governor.EffectiveIntent.ACTIVATE
              else if (request == Drone_Lifecycle_Governor.LifecycleRequest.DEACTIVATE) Drone_Lifecycle_Governor.EffectiveIntent.DEACTIVATE
              else if (request == Drone_Lifecycle_Governor.LifecycleRequest.BEGIN_FLIGHT) Drone_Lifecycle_Governor.EffectiveIntent.BEGIN_FLIGHT
              else Drone_Lifecycle_Governor.EffectiveIntent.END_FLIGHT
            Drone_Lifecycle_Governor.ArbitratedIntent(
              effective, Drone_Lifecycle_Governor.FreshRequestPreemption.NOT_PREEMPTED)
          }
        api.put_arbitratedIntent(intent)
    }
  }

  def finalise(api: RequestArbiter_Operational_Api): Unit = { }
}
