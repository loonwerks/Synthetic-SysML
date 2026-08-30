// #Sireum

package ore_hold_mining_guard_supervisor.Ore_Hold_Mining_Guard_Supervisor

import org.sireum._
import ore_hold_mining_guard_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner {

  def initialise(api: GuardReportingDerivationOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_guard_status(Ore_Hold_Mining_Guard_Supervisor.GuardStatus.Idle)
    api.put_offload_readiness(Ore_Hold_Mining_Guard_Supervisor.OffloadReadiness.NotReadyForOffload)
  }

  def timeTriggered(api: GuardReportingDerivationOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_guard_resolution: Option[Ore_Hold_Mining_Guard_Supervisor.GuardResolution] = api.get_guard_resolution()
    api.logInfo(s"Received on data port guard_resolution: ${apiUsage_guard_resolution}")
  }

  def finalise(api: GuardReportingDerivationOwner_Operational_Api): Unit = { }
}
