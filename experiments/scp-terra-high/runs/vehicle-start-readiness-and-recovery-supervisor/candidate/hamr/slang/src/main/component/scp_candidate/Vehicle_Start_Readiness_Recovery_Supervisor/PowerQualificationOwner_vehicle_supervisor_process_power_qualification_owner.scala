// #Sireum

package scp_candidate.Vehicle_Start_Readiness_Recovery_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner {

  def initialise(api: PowerQualificationOwner_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee c7
        !(api.power_to_authorization.evidenceTrusted) && !(api.power_to_authorization.availableForSupervision) &&
          !(api.power_to_lifecycle.evidenceTrusted) &&
          !(api.power_to_lifecycle.availableForSupervision)
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_power_to_authorization(PowerFacts(F, F))
    api.put_power_to_lifecycle(PowerFacts(F, F))
  }

  def timeTriggered(api: PowerQualificationOwner_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.get_power_observation() match {
      case Some(PowerObservation.Available) =>
        val facts = PowerFacts(T, T)
        api.put_power_to_authorization(facts)
        api.put_power_to_lifecycle(facts)
      case Some(PowerObservation.Unavailable) =>
        val facts = PowerFacts(T, F)
        api.put_power_to_authorization(facts)
        api.put_power_to_lifecycle(facts)
      case _ =>
        val facts = PowerFacts(F, F)
        api.put_power_to_authorization(facts)
        api.put_power_to_lifecycle(facts)
    }
  }

  def finalise(api: PowerQualificationOwner_Operational_Api): Unit = { }
}
