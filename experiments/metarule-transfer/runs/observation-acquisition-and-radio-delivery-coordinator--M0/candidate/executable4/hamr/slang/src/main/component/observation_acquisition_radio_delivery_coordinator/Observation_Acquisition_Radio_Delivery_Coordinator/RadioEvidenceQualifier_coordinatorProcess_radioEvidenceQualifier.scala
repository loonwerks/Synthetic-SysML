// #Sireum

package observation_acquisition_radio_delivery_coordinator.Observation_Acquisition_Radio_Delivery_Coordinator

import org.sireum._
import observation_acquisition_radio_delivery_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier {

  def initialise(api: RadioEvidenceQualifier_Initialization_Api): Unit = {
    Contract(Modifies(api))
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
        //   Unavailable radio masks delivery result | N.md#CASE_10
        (api.radioCondition == RadioCondition.UNAVAILABLE) ___>: (api.radioEvidence == RadioEvidence.UNAVAILABLE),
        // case CASE_11_RADIO_READY
        //   Ready radio without a result is ready | N.md#CASE_11
        (api.radioCondition == RadioCondition.READY &
          api.deliveryResult == DeliveryResult.NONE) ___>: (api.radioEvidence == RadioEvidence.READY),
        // case CASE_12_RADIO_RESULT
        //   Ready radio preserves a current delivery result | N.md#CASE_12
        (api.radioCondition == RadioCondition.READY &
          api.deliveryResult != DeliveryResult.NONE) ___>: ((api.deliveryResult == DeliveryResult.ACCEPTED ___>:
          api.radioEvidence == RadioEvidence.ACCEPTED) &
          (api.deliveryResult == DeliveryResult.REJECTED ___>:
            api.radioEvidence == RadioEvidence.REJECTED))
        // END COMPUTE ENSURES timeTriggered
      )
    )
    (api.get_radioCondition(), api.get_deliveryResult()) match {
      case (Some(RadioCondition.UNAVAILABLE), _) => api.put_radioEvidence(RadioEvidence.UNAVAILABLE)
      case (Some(RadioCondition.READY), Some(DeliveryResult.ACCEPTED)) => api.put_radioEvidence(RadioEvidence.ACCEPTED)
      case (Some(RadioCondition.READY), Some(DeliveryResult.REJECTED)) => api.put_radioEvidence(RadioEvidence.REJECTED)
      case (Some(RadioCondition.READY), _) => api.put_radioEvidence(RadioEvidence.READY)
      case _ => api.put_radioEvidence(RadioEvidence.UNAVAILABLE)
    }
  }

  def finalise(api: RadioEvidenceQualifier_Operational_Api): Unit = { }
}
