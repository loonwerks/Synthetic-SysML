// #Sireum

package observation_acquisition_radio_delivery_coordinator.Observation_Acquisition_Radio_Delivery_Coordinator

import org.sireum._
import observation_acquisition_radio_delivery_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier {

  def initialise(api: BatteryEvidenceQualifier_Initialization_Api): Unit = {
    Contract(
      Modifies(api)
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_batteryAssessment(Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.UNAVAILABLE)
  }

  def timeTriggered(api: BatteryEvidenceQualifier_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_01_INVALID_EVIDENCE
        (api.batteryCheck == Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCheck.INVALID) ___>: (api.batteryAssessment == Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.UNAVAILABLE),
        // case CASE_02_VALID_LOW
        (api.batteryCheck == Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCheck.VALID &
          api.batteryCapacity == Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCapacityBand.LOW) ___>: (api.batteryAssessment == Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.LOW),
        // case CASE_03_VALID_USABLE
        (api.batteryCheck == Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCheck.VALID &
          api.batteryCapacity == Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCapacityBand.USABLE) ___>: (api.batteryAssessment == Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.ADEQUATE)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val batteryCapacity = api.get_batteryCapacity().get
    val batteryCheck = api.get_batteryCheck().get
    if (batteryCheck == Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCheck.INVALID) {
      api.put_batteryAssessment(Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.UNAVAILABLE)
    } else if (batteryCapacity == Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCapacityBand.LOW) {
      api.put_batteryAssessment(Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.LOW)
    } else {
      api.put_batteryAssessment(Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.ADEQUATE)
    }
  }

  def finalise(api: BatteryEvidenceQualifier_Operational_Api): Unit = { }
}
