// #Sireum

package power_propulsion_availability_supervisor.Power_Propulsion_Availability_Supervisor

import org.sireum._
import power_propulsion_availability_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission {

  def initialise(api: BatteryObservationAdmissionOwner_Initialization_Api): Unit = {
    api.put_qualified_battery(Power_Propulsion_Availability_Supervisor.QualifiedBatteryObservation(
      admission = AdmissionResult.REJECTED_INVALID,
      quality = BatteryQuality.UNKNOWN))
  }

  def timeTriggered(api: BatteryObservationAdmissionOwner_Operational_Api): Unit = {
    Contract(
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_01_ADMITTED
        (api.battery_observation.validity == EvidenceValidity.VALID &
          api.battery_observation.freshness == EvidenceFreshness.CURRENT) ___>: (api.qualified_battery.admission == AdmissionResult.ADMITTED_NONE &
          api.qualified_battery.quality == api.battery_observation.quality),
        // case CASE_02_REJECTED
        (api.battery_observation.validity == EvidenceValidity.INVALID |
          api.battery_observation.freshness == EvidenceFreshness.STALE) ___>: (api.qualified_battery.quality == api.battery_observation.quality &
          (api.battery_observation.validity == EvidenceValidity.INVALID &
            api.qualified_battery.admission == AdmissionResult.REJECTED_INVALID |
            api.battery_observation.validity == EvidenceValidity.VALID &
              api.qualified_battery.admission == AdmissionResult.REJECTED_STALE))
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val observed: Power_Propulsion_Availability_Supervisor.BatteryObservation = api.get_battery_observation().get
    val admission: AdmissionResult.Type =
      if (observed.validity == EvidenceValidity.VALID &
          observed.freshness == EvidenceFreshness.CURRENT)
        AdmissionResult.ADMITTED_NONE
      else if (observed.validity == EvidenceValidity.INVALID)
        AdmissionResult.REJECTED_INVALID
      else AdmissionResult.REJECTED_STALE
    api.put_qualified_battery(Power_Propulsion_Availability_Supervisor.QualifiedBatteryObservation(
      admission = admission, quality = observed.quality))
  }

  def finalise(api: BatteryObservationAdmissionOwner_Operational_Api): Unit = { }
}
