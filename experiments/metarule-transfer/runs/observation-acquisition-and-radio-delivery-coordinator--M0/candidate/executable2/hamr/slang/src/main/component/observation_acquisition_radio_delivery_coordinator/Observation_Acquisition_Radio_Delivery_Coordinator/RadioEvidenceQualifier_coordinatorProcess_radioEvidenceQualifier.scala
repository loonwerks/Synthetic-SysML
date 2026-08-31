// #Sireum

package observation_acquisition_radio_delivery_coordinator.Observation_Acquisition_Radio_Delivery_Coordinator

import org.sireum._
import observation_acquisition_radio_delivery_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier {

  def initialise(api: RadioEvidenceQualifier_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_radioEvidence(Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.UNAVAILABLE)
  }

  def timeTriggered(api: RadioEvidenceQualifier_Operational_Api): Unit = {
    // example api usage

    val apiUsage_radioCondition: Option[Observation_Acquisition_Radio_Delivery_Coordinator.RadioCondition.Type] = api.get_radioCondition()
    api.logInfo(s"Received on data port radioCondition: ${apiUsage_radioCondition}")
    val apiUsage_deliveryResult: Option[Observation_Acquisition_Radio_Delivery_Coordinator.DeliveryResult.Type] = api.get_deliveryResult()
    api.logInfo(s"Received on data port deliveryResult: ${apiUsage_deliveryResult}")
  }

  def finalise(api: RadioEvidenceQualifier_Operational_Api): Unit = { }
}
