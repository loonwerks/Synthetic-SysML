// #Sireum

package scp_candidate.Vehicle_Start_Readiness_Recovery_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner {

  def initialise(api: HealthQualificationOwner_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee c5
        api.health_to_authorization == HealthQualification.Invalid &&
          api.health_to_lifecycle == HealthQualification.Invalid
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_health_to_authorization(HealthQualification.Invalid)
    api.put_health_to_lifecycle(HealthQualification.Invalid)
  }

  def timeTriggered(api: HealthQualificationOwner_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.get_health_observation() match {
      case Some(observation) =>
        var qualification: HealthQualification.Type = HealthQualification.Ready
        if (observation.thermal == ThermalCondition.Invalid ||
            observation.maintenance == MaintenanceCondition.Invalid) {
          qualification = HealthQualification.Invalid
        } else if (observation.thermal == ThermalCondition.OverMaximum ||
                   observation.maintenance == MaintenanceCondition.Due) {
          qualification = HealthQualification.NotReady
        }
        api.put_health_to_authorization(qualification)
        api.put_health_to_lifecycle(qualification)
    }
  }

  def finalise(api: HealthQualificationOwner_Operational_Api): Unit = { }
}
