// #Sireum

package scp_candidate.Ore_Hold_Mining_Guard_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner {

  def initialise(api: GuardReportingDerivationOwner_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_REPORTING_SAFE
        api.guard_status == GuardStatus.Idle &
          api.offload_readiness == OffloadReadiness.NotReadyForOffload
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_guard_status(Ore_Hold_Mining_Guard_Supervisor.GuardStatus.Idle)
    api.put_offload_readiness(Ore_Hold_Mining_Guard_Supervisor.OffloadReadiness.NotReadyForOffload)
  }

  def timeTriggered(api: GuardReportingDerivationOwner_Operational_Api): Unit = { }

  def finalise(api: GuardReportingDerivationOwner_Operational_Api): Unit = { }
}
