// #Sireum

package hvac_visibility_priority_supervisor.HVAC_Visibility_Priority_Supervisor

import org.sireum._
import hvac_visibility_priority_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ElectricalEligibilityOwner_supervision_electricalEligibilityOwner {

  def initialise(api: ElectricalEligibilityOwner_Initialization_Api): Unit = {
    api.put_electricalEligibility(HVAC_Visibility_Priority_Supervisor.ElectricalEligibility(
      HVAC_Visibility_Priority_Supervisor.ElectricalTier.Ineligible,
      HVAC_Visibility_Priority_Supervisor.ElectricalCause.InvalidInterface))
    api.put_criticalElectrical(HVAC_Visibility_Priority_Supervisor.ElectricalCriticality.Present)
  }

  def timeTriggered(api: ElectricalEligibilityOwner_Operational_Api): Unit = {
    api.get_electricalAvailability() match {
      case Some(availability) if availability.validity != HVAC_Visibility_Priority_Supervisor.Validity.Valid ||
        availability.interfaceState == HVAC_Visibility_Priority_Supervisor.InterfaceState.Unavailable &&
          availability.budget != HVAC_Visibility_Priority_Supervisor.Budget.Denied =>
        api.put_electricalEligibility(HVAC_Visibility_Priority_Supervisor.ElectricalEligibility(
          HVAC_Visibility_Priority_Supervisor.ElectricalTier.Ineligible,
          HVAC_Visibility_Priority_Supervisor.ElectricalCause.InvalidInterface))
        api.put_criticalElectrical(HVAC_Visibility_Priority_Supervisor.ElectricalCriticality.Present)
      case Some(availability) if availability.interfaceState == HVAC_Visibility_Priority_Supervisor.InterfaceState.Unavailable =>
        api.put_electricalEligibility(HVAC_Visibility_Priority_Supervisor.ElectricalEligibility(
          HVAC_Visibility_Priority_Supervisor.ElectricalTier.Ineligible,
          HVAC_Visibility_Priority_Supervisor.ElectricalCause.ElectricalUnavailable))
        api.put_criticalElectrical(HVAC_Visibility_Priority_Supervisor.ElectricalCriticality.Present)
      case Some(availability) =>
        val (tier, cause) = availability.budget match {
          case HVAC_Visibility_Priority_Supervisor.Budget.Denied =>
            (HVAC_Visibility_Priority_Supervisor.ElectricalTier.Denied,
              HVAC_Visibility_Priority_Supervisor.ElectricalCause.ElectricalDenied)
          case HVAC_Visibility_Priority_Supervisor.Budget.Limited =>
            (HVAC_Visibility_Priority_Supervisor.ElectricalTier.Limited,
              HVAC_Visibility_Priority_Supervisor.ElectricalCause.None)
          case _ => (HVAC_Visibility_Priority_Supervisor.ElectricalTier.Full,
            HVAC_Visibility_Priority_Supervisor.ElectricalCause.None)
        }
        api.put_electricalEligibility(HVAC_Visibility_Priority_Supervisor.ElectricalEligibility(tier, cause))
        api.put_criticalElectrical(HVAC_Visibility_Priority_Supervisor.ElectricalCriticality.Absent)
      case _ =>
        api.put_electricalEligibility(HVAC_Visibility_Priority_Supervisor.ElectricalEligibility(
          HVAC_Visibility_Priority_Supervisor.ElectricalTier.Ineligible,
          HVAC_Visibility_Priority_Supervisor.ElectricalCause.InvalidInterface))
        api.put_criticalElectrical(HVAC_Visibility_Priority_Supervisor.ElectricalCriticality.Present)
    }
  }

  def finalise(api: ElectricalEligibilityOwner_Operational_Api): Unit = { }
}
