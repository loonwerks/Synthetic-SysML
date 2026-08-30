// #Sireum

package drone_lifecycle_governor.Drone_Lifecycle_Governor

import org.sireum._
import drone_lifecycle_governor._

// This file will not be overwritten if HAMR codegen is rerun
object RequestArbiter_governorProcess_requestArbiter {

  def initialise(api: RequestArbiter_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_arbitratedIntent(Drone_Lifecycle_Governor.ArbitratedIntent.example())
  }

  def timeTriggered(api: RequestArbiter_Operational_Api): Unit = {
    // example api usage

    val apiUsage_pilotRequest: Option[Drone_Lifecycle_Governor.LifecycleRequest.Type] = api.get_pilotRequest()
    api.logInfo(s"Received on data port pilotRequest: ${apiUsage_pilotRequest}")
    val apiUsage_chargerState: Option[Drone_Lifecycle_Governor.ChargerState.Type] = api.get_chargerState()
    api.logInfo(s"Received on data port chargerState: ${apiUsage_chargerState}")
    val apiUsage_recoveryProposal: Option[Drone_Lifecycle_Governor.RecoveryProposal.Type] = api.get_recoveryProposal()
    api.logInfo(s"Received on data port recoveryProposal: ${apiUsage_recoveryProposal}")
  }

  def finalise(api: RequestArbiter_Operational_Api): Unit = { }
}
