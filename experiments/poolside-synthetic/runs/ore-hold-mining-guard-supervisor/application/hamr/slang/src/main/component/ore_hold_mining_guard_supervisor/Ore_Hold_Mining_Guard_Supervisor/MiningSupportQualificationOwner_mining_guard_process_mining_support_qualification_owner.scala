// #Sireum

package ore_hold_mining_guard_supervisor.Ore_Hold_Mining_Guard_Supervisor

import org.sireum._
import ore_hold_mining_guard_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner {

  def initialise(api: MiningSupportQualificationOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_support_assessment(Ore_Hold_Mining_Guard_Supervisor.SupportAssessment.SupportReady)
  }

  def timeTriggered(api: MiningSupportQualificationOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_mining_support: Option[Ore_Hold_Mining_Guard_Supervisor.MiningSupportSample] = api.get_mining_support()
    api.logInfo(s"Received on data port mining_support: ${apiUsage_mining_support}")
  }

  def finalise(api: MiningSupportQualificationOwner_Operational_Api): Unit = { }
}
