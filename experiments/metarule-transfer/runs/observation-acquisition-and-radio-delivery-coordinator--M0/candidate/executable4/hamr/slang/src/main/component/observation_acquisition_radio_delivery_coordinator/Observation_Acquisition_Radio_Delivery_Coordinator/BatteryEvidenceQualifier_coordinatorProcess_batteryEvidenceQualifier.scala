// #Sireum

package observation_acquisition_radio_delivery_coordinator.Observation_Acquisition_Radio_Delivery_Coordinator

import org.sireum._
import observation_acquisition_radio_delivery_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier {

  def initialise(api: BatteryEvidenceQualifier_Initialization_Api): Unit = {
    Contract(Modifies(api))
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
        //   Invalid battery evidence is unavailable | N.md#CASE_01
        (api.batteryCheck == BatteryCheck.INVALID) ___>: (api.batteryAssessment == BatteryAssessment.UNAVAILABLE),
        // case CASE_02_VALID_LOW
        //   Valid low capacity is low | N.md#CASE_02
        (api.batteryCheck == BatteryCheck.VALID &
          api.batteryCapacity == BatteryCapacityBand.LOW) ___>: (api.batteryAssessment == BatteryAssessment.LOW),
        // case CASE_03_VALID_USABLE
        //   Valid usable capacity is adequate | N.md#CASE_03
        (api.batteryCheck == BatteryCheck.VALID &
          api.batteryCapacity == BatteryCapacityBand.USABLE) ___>: (api.batteryAssessment == BatteryAssessment.ADEQUATE)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    (api.get_batteryCheck(), api.get_batteryCapacity()) match {
      case (Some(BatteryCheck.INVALID), _) => api.put_batteryAssessment(BatteryAssessment.UNAVAILABLE)
      case (Some(BatteryCheck.VALID), Some(BatteryCapacityBand.LOW)) => api.put_batteryAssessment(BatteryAssessment.LOW)
      case (Some(BatteryCheck.VALID), Some(BatteryCapacityBand.USABLE)) => api.put_batteryAssessment(BatteryAssessment.ADEQUATE)
      case _ => api.put_batteryAssessment(BatteryAssessment.UNAVAILABLE)
    }
  }

  def finalise(api: BatteryEvidenceQualifier_Operational_Api): Unit = { }
}
