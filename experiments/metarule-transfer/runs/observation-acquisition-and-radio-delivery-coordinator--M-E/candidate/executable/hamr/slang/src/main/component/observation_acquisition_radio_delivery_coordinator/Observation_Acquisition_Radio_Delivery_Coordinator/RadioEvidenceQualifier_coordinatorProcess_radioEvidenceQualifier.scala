// #Sireum

package observation_acquisition_radio_delivery_coordinator.Observation_Acquisition_Radio_Delivery_Coordinator

import org.sireum._
import observation_acquisition_radio_delivery_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier {

  def initialise(api: RadioEvidenceQualifier_Initialization_Api): Unit = {
    Contract(
      Modifies(api)
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_radioEvidence(Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.UNAVAILABLE)
  }

  def timeTriggered(api: RadioEvidenceQualifier_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_10_RADIO_UNAVAILABLE
        (api.radioCondition == Observation_Acquisition_Radio_Delivery_Coordinator.RadioCondition.UNAVAILABLE) ___>: (api.radioEvidence == Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.UNAVAILABLE),
        // case CASE_11_RADIO_READY
        (api.radioCondition == Observation_Acquisition_Radio_Delivery_Coordinator.RadioCondition.READY &
          api.deliveryResult == Observation_Acquisition_Radio_Delivery_Coordinator.DeliveryResult.NONE) ___>: (api.radioEvidence == Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.READY),
        // case CASE_12_RADIO_RESULT
        (api.radioCondition == Observation_Acquisition_Radio_Delivery_Coordinator.RadioCondition.READY &
          api.deliveryResult != Observation_Acquisition_Radio_Delivery_Coordinator.DeliveryResult.NONE) ___>: ((api.deliveryResult == Observation_Acquisition_Radio_Delivery_Coordinator.DeliveryResult.ACCEPTED ___>:
          api.radioEvidence == Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.ACCEPTED) &
          (api.deliveryResult == Observation_Acquisition_Radio_Delivery_Coordinator.DeliveryResult.REJECTED ___>:
            api.radioEvidence == Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.REJECTED))
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val radioCondition = api.get_radioCondition().get
    val deliveryResult = api.get_deliveryResult().get
    if (radioCondition == Observation_Acquisition_Radio_Delivery_Coordinator.RadioCondition.UNAVAILABLE) {
      api.put_radioEvidence(Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.UNAVAILABLE)
    } else if (deliveryResult == Observation_Acquisition_Radio_Delivery_Coordinator.DeliveryResult.ACCEPTED) {
      api.put_radioEvidence(Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.ACCEPTED)
    } else if (deliveryResult == Observation_Acquisition_Radio_Delivery_Coordinator.DeliveryResult.REJECTED) {
      api.put_radioEvidence(Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.REJECTED)
    } else {
      api.put_radioEvidence(Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.READY)
    }
  }

  def finalise(api: RadioEvidenceQualifier_Operational_Api): Unit = { }
}
