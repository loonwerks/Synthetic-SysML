// #Sireum

package power_propulsion_availability_supervisor.Power_Propulsion_Availability_Supervisor

import org.sireum._
import power_propulsion_availability_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission {

  def initialise(api: BatteryObservationAdmissionOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_qualified_battery(QualifiedBatteryObservation(
      AdmissionResult.REJECTED_INVALID, BatteryQuality.UNKNOWN))
  }

  def timeTriggered(api: BatteryObservationAdmissionOwner_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.get_battery_observation() match {
      case Some(observation) =>
        val admission: AdmissionResult.Type =
          if (observation.validity == EvidenceValidity.VALID) {
            if (observation.freshness == EvidenceFreshness.CURRENT) {
              AdmissionResult.ADMITTED_NONE
            } else {
              AdmissionResult.REJECTED_STALE
            }
          } else {
            AdmissionResult.REJECTED_INVALID
          }
        api.put_qualified_battery(QualifiedBatteryObservation(admission, observation.quality))
      case _ =>
        api.put_qualified_battery(QualifiedBatteryObservation(
          AdmissionResult.REJECTED_INVALID, BatteryQuality.UNKNOWN))
    }
  }

  def finalise(api: BatteryObservationAdmissionOwner_Operational_Api): Unit = { }
}
