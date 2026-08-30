// #Sireum

package scp_candidate.Vehicle_Start_Readiness_Recovery_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner {

  def initialise(api: BrakeQualificationOwner_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee c3
        !(api.brake_to_authorization.evidenceTrusted) && !(api.brake_to_authorization.readyForAdmission) &&
          !(api.brake_to_lifecycle.evidenceTrusted) &&
          !(api.brake_to_lifecycle.readyForAdmission)
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_brake_to_authorization(BrakeFacts(F, F))
    api.put_brake_to_lifecycle(BrakeFacts(F, F))
  }

  def timeTriggered(api: BrakeQualificationOwner_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.get_brake_observation() match {
      case Some(BrakeObservation.Pressed) =>
        val facts = BrakeFacts(T, T)
        api.put_brake_to_authorization(facts)
        api.put_brake_to_lifecycle(facts)
      case Some(BrakeObservation.Released) =>
        val facts = BrakeFacts(T, F)
        api.put_brake_to_authorization(facts)
        api.put_brake_to_lifecycle(facts)
      case _ =>
        val facts = BrakeFacts(F, F)
        api.put_brake_to_authorization(facts)
        api.put_brake_to_lifecycle(facts)
    }
  }

  def finalise(api: BrakeQualificationOwner_Operational_Api): Unit = { }
}
