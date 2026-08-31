// #Sireum

package observation_acquisition_radio_delivery_coordinator.Observation_Acquisition_Radio_Delivery_Coordinator

import org.sireum._
import observation_acquisition_radio_delivery_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter {

  def initialise(api: ObservationIntentArbiter_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_sessionDecision(Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.NO_CHANGE)
  }

  def timeTriggered(api: ObservationIntentArbiter_Operational_Api): Unit = {
    // example api usage

    val apiUsage_observationIntent: Option[Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent.Type] = api.get_observationIntent()
    api.logInfo(s"Received on data port observationIntent: ${apiUsage_observationIntent}")
    val apiUsage_sessionProposal: Option[Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.Type] = api.get_sessionProposal()
    api.logInfo(s"Received on data port sessionProposal: ${apiUsage_sessionProposal}")
  }

  def finalise(api: ObservationIntentArbiter_Operational_Api): Unit = { }
}
