// #Sireum

package hvac_visibility_priority_supervisor.HVAC_Visibility_Priority_Supervisor

import org.sireum._
import hvac_visibility_priority_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ElectricalEligibilityOwner_supervision_electricalEligibilityOwner {

  def initialise(api: ElectricalEligibilityOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_electricalEligibility(HVAC_Visibility_Priority_Supervisor.ElectricalEligibility.example())
    api.put_criticalElectrical(HVAC_Visibility_Priority_Supervisor.ElectricalCriticality.Present)
  }

  def timeTriggered(api: ElectricalEligibilityOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_electricalAvailability: Option[HVAC_Visibility_Priority_Supervisor.ElectricalAvailability] = api.get_electricalAvailability()
    api.logInfo(s"Received on data port electricalAvailability: ${apiUsage_electricalAvailability}")
  }

  def finalise(api: ElectricalEligibilityOwner_Operational_Api): Unit = { }
}
