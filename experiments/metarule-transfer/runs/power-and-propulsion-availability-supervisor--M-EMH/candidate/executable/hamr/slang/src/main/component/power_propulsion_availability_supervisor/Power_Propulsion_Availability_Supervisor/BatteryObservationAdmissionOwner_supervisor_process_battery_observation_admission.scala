// #Sireum

package power_propulsion_availability_supervisor.Power_Propulsion_Availability_Supervisor

import org.sireum._
import power_propulsion_availability_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission {

  def initialise(api: BatteryObservationAdmissionOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_qualified_battery(
      Power_Propulsion_Availability_Supervisor.QualifiedBatteryObservation(
        Power_Propulsion_Availability_Supervisor.AdmissionResult.REJECTED_INVALID,
        Power_Propulsion_Availability_Supervisor.BatteryQuality.UNKNOWN))
  }

  def timeTriggered(api: BatteryObservationAdmissionOwner_Operational_Api): Unit = {
    Contract(Modifies(api))
    val qualified: Power_Propulsion_Availability_Supervisor.QualifiedBatteryObservation = api.get_battery_observation() match {
      case Some(observation) =>
        val admission: Power_Propulsion_Availability_Supervisor.AdmissionResult.Type =
          if (observation.validity != Power_Propulsion_Availability_Supervisor.EvidenceValidity.VALID)
            Power_Propulsion_Availability_Supervisor.AdmissionResult.REJECTED_INVALID
          else if (observation.freshness != Power_Propulsion_Availability_Supervisor.EvidenceFreshness.CURRENT)
            Power_Propulsion_Availability_Supervisor.AdmissionResult.REJECTED_STALE
          else Power_Propulsion_Availability_Supervisor.AdmissionResult.ADMITTED_NONE
        Power_Propulsion_Availability_Supervisor.QualifiedBatteryObservation(admission, observation.quality)
      case _ =>
        Power_Propulsion_Availability_Supervisor.QualifiedBatteryObservation(
          Power_Propulsion_Availability_Supervisor.AdmissionResult.REJECTED_INVALID,
          Power_Propulsion_Availability_Supervisor.BatteryQuality.UNKNOWN)
    }
    api.put_qualified_battery(qualified)
  }

  def finalise(api: BatteryObservationAdmissionOwner_Operational_Api): Unit = { }
}
