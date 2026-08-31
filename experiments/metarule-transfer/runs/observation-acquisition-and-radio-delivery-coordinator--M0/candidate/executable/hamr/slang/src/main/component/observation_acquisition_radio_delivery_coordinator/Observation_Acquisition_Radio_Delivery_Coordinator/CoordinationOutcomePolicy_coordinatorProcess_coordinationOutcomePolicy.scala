// #Sireum

package observation_acquisition_radio_delivery_coordinator.Observation_Acquisition_Radio_Delivery_Coordinator

import org.sireum._
import observation_acquisition_radio_delivery_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy {

  def initialise(api: CoordinationOutcomePolicy_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_operatorCoordinationStatus(Observation_Acquisition_Radio_Delivery_Coordinator.OperatorCoordinationStatus.example())
    api.put_droneControlObservationNotice(Observation_Acquisition_Radio_Delivery_Coordinator.DroneControlObservationNotice.IDLE)
  }

  def timeTriggered(api: CoordinationOutcomePolicy_Operational_Api): Unit = {
    // example api usage

    val apiUsage_batteryAssessment: Option[Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.Type] = api.get_batteryAssessment()
    api.logInfo(s"Received on data port batteryAssessment: ${apiUsage_batteryAssessment}")
    val apiUsage_sessionSnapshot: Option[Observation_Acquisition_Radio_Delivery_Coordinator.SessionSnapshot] = api.get_sessionSnapshot()
    api.logInfo(s"Received on data port sessionSnapshot: ${apiUsage_sessionSnapshot}")
  }

  def finalise(api: CoordinationOutcomePolicy_Operational_Api): Unit = { }
}
