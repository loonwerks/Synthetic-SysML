// #Sireum

package observation_acquisition_radio_delivery_coordinator.Observation_Acquisition_Radio_Delivery_Coordinator

import org.sireum._
import observation_acquisition_radio_delivery_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier {

  def initialise(api: RadioEvidenceQualifier_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_radioEvidence(Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.UNAVAILABLE)
  }

  def timeTriggered(api: RadioEvidenceQualifier_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_10_RADIO_UNAVAILABLE
        (api.radioCondition == RadioCondition.UNAVAILABLE) ___>: (api.radioEvidence == RadioEvidence.UNAVAILABLE),
        // case CASE_11_RADIO_READY
        (api.radioCondition == RadioCondition.READY &
          api.deliveryResult == DeliveryResult.NONE) ___>: (api.radioEvidence == RadioEvidence.READY),
        // case CASE_12_RADIO_RESULT
        (api.radioCondition == RadioCondition.READY &
          api.deliveryResult != DeliveryResult.NONE) ___>: ((api.deliveryResult == DeliveryResult.ACCEPTED ___>:
          api.radioEvidence == RadioEvidence.ACCEPTED) &
          (api.deliveryResult == DeliveryResult.REJECTED ___>:
            api.radioEvidence == RadioEvidence.REJECTED))
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val condition = api.get_radioCondition().get
    val result = api.get_deliveryResult().get
    if (condition == RadioCondition.UNAVAILABLE) {
      api.put_radioEvidence(RadioEvidence.UNAVAILABLE)
    } else if (result == DeliveryResult.ACCEPTED) {
      api.put_radioEvidence(RadioEvidence.ACCEPTED)
    } else if (result == DeliveryResult.REJECTED) {
      api.put_radioEvidence(RadioEvidence.REJECTED)
    } else {
      api.put_radioEvidence(RadioEvidence.READY)
    }
  }

  def finalise(api: RadioEvidenceQualifier_Operational_Api): Unit = { }
}
