// #Sireum

package ore_hold_mining_guard_supervisor.Ore_Hold_Mining_Guard_Supervisor

import org.sireum._
import ore_hold_mining_guard_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner {

  def initialise(api: HoldGuardQualificationOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_hold_assessment(Ore_Hold_Mining_Guard_Supervisor.HoldAssessment.SpaceAvailable)
  }

  def timeTriggered(api: HoldGuardQualificationOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_hold_sample: Option[Ore_Hold_Mining_Guard_Supervisor.HoldSample] = api.get_hold_sample()
    api.logInfo(s"Received on data port hold_sample: ${apiUsage_hold_sample}")
  }

  def finalise(api: HoldGuardQualificationOwner_Operational_Api): Unit = { }
}
