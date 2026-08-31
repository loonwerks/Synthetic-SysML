// #Sireum

package observation_acquisition_radio_delivery_coordinator.Observation_Acquisition_Radio_Delivery_Coordinator

import org.sireum._
import observation_acquisition_radio_delivery_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier {

  def initialise(api: BatteryEvidenceQualifier_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_batteryAssessment(Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.UNAVAILABLE)
  }

  def timeTriggered(api: BatteryEvidenceQualifier_Operational_Api): Unit = {
    Contract(
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
    // example api usage

    val apiUsage_batteryCapacity: Option[Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCapacityBand.Type] = api.get_batteryCapacity()
    api.logInfo(s"Received on data port batteryCapacity: ${apiUsage_batteryCapacity}")
    val apiUsage_batteryCheck: Option[Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCheck.Type] = api.get_batteryCheck()
    api.logInfo(s"Received on data port batteryCheck: ${apiUsage_batteryCheck}")
  }

  def finalise(api: BatteryEvidenceQualifier_Operational_Api): Unit = { }
}
