// #Sireum

package hvac_visibility_priority_supervisor.HVAC_Visibility_Priority_Supervisor

import org.sireum._
import hvac_visibility_priority_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner {

  def initialise(api: WasteHeatEligibilityOwner_Initialization_Api): Unit = {
    api.put_wasteHeatEligibility(HVAC_Visibility_Priority_Supervisor.WasteHeatEligibility.Ineligible)
  }

  def timeTriggered(api: WasteHeatEligibilityOwner_Operational_Api): Unit = {
    val eligibility = api.get_wasteHeatAvailability() match {
      case Some(availability) if availability.validity == HVAC_Visibility_Priority_Supervisor.Validity.Valid &&
        availability.availability == HVAC_Visibility_Priority_Supervisor.Availability.Available =>
        HVAC_Visibility_Priority_Supervisor.WasteHeatEligibility.Eligible
      case _ => HVAC_Visibility_Priority_Supervisor.WasteHeatEligibility.Ineligible
    }
    api.put_wasteHeatEligibility(eligibility)
  }

  def finalise(api: WasteHeatEligibilityOwner_Operational_Api): Unit = { }
}
