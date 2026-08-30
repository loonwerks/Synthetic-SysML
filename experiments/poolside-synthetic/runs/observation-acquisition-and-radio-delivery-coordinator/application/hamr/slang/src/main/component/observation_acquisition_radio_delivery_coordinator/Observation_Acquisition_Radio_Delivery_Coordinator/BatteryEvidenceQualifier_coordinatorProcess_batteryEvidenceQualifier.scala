// #Sireum

package observation_acquisition_radio_delivery_coordinator.Observation_Acquisition_Radio_Delivery_Coordinator

import org.sireum._
import observation_acquisition_radio_delivery_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier {

  def initialise(api: BatteryEvidenceQualifier_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // INIT_BATTERY_ASSESSMENT: initialise to a safe default (UNAVAILABLE)
        // without reading input ports; full qualification is computed in timeTriggered
        api.batteryAssessment == Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.UNAVAILABLE
      )
    )
    api.put_batteryAssessment(Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.UNAVAILABLE)
  }

  def timeTriggered(api: BatteryEvidenceQualifier_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // CASE_01_INVALID_EVIDENCE
        (api.batteryCheck == Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCheck.INVALID)
          ->:(api.batteryAssessment == Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.UNAVAILABLE) &
        // CASE_02_VALID_LOW
        (api.batteryCheck == Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCheck.VALID &
          api.batteryCapacity == Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCapacityBand.LOW)
          ->:(api.batteryAssessment == Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.LOW) &
        // CASE_03_VALID_USABLE
        (api.batteryCheck == Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCheck.VALID &
          api.batteryCapacity == Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCapacityBand.USABLE)
          ->:(api.batteryAssessment == Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.ADEQUATE)
      )
    )

    val batteryCheckOpt: Option[Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCheck.Type] = api.get_batteryCheck()
    val batteryCapacityOpt: Option[Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCapacityBand.Type] = api.get_batteryCapacity()

    batteryCheckOpt.get match {
      case Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCheck.INVALID =>
        api.put_batteryAssessment(Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.UNAVAILABLE)
      case Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCheck.VALID =>
        batteryCapacityOpt.get match {
          case Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCapacityBand.LOW =>
            api.put_batteryAssessment(Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.LOW)
          case Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCapacityBand.USABLE =>
            api.put_batteryAssessment(Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.ADEQUATE)
        }
    }
  }

  def finalise(api: BatteryEvidenceQualifier_Operational_Api): Unit = { }
}
