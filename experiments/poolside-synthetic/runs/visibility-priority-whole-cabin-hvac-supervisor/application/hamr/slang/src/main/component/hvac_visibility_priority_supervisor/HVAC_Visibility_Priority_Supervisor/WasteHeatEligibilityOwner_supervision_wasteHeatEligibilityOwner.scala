// #Sireum

package hvac_visibility_priority_supervisor.HVAC_Visibility_Priority_Supervisor

import org.sireum._
import hvac_visibility_priority_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner {

  def initialise(api: WasteHeatEligibilityOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_wasteHeatEligibility(HVAC_Visibility_Priority_Supervisor.WasteHeatEligibility.Eligible)
  }

  def timeTriggered(api: WasteHeatEligibilityOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_wasteHeatAvailability: Option[HVAC_Visibility_Priority_Supervisor.WasteHeatAvailability] = api.get_wasteHeatAvailability()
    api.logInfo(s"Received on data port wasteHeatAvailability: ${apiUsage_wasteHeatAvailability}")
  }

  def finalise(api: WasteHeatEligibilityOwner_Operational_Api): Unit = { }
}
