// #Sireum

package observation_acquisition_radio_delivery_coordinator.Observation_Acquisition_Radio_Delivery_Coordinator

import org.sireum._
import observation_acquisition_radio_delivery_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier {

  def initialise(api: RadioEvidenceQualifier_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // INIT_RADIO_EVIDENCE: initialise to a safe default (UNAVAILABLE)
        // without reading input ports; full evidence is computed in timeTriggered
        api.radioEvidence == Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.UNAVAILABLE
      )
    )
    api.put_radioEvidence(Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.UNAVAILABLE)
  }

  def timeTriggered(api: RadioEvidenceQualifier_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // CASE_10_RADIO_UNAVAILABLE
        (api.radioCondition == Observation_Acquisition_Radio_Delivery_Coordinator.RadioCondition.UNAVAILABLE)
          ->:(api.radioEvidence == Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.UNAVAILABLE) &
        // CASE_11_RADIO_READY
        (api.radioCondition == Observation_Acquisition_Radio_Delivery_Coordinator.RadioCondition.READY &
          api.deliveryResult == Observation_Acquisition_Radio_Delivery_Coordinator.DeliveryResult.NONE)
          ->:(api.radioEvidence == Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.READY) &
        // CASE_12_RADIO_RESULT
        (api.radioCondition == Observation_Acquisition_Radio_Delivery_Coordinator.RadioCondition.READY &
          api.deliveryResult != Observation_Acquisition_Radio_Delivery_Coordinator.DeliveryResult.NONE)
          ->:(
            (api.deliveryResult == Observation_Acquisition_Radio_Delivery_Coordinator.DeliveryResult.ACCEPTED)
              ->:(api.radioEvidence == Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.ACCEPTED) &
            (api.deliveryResult == Observation_Acquisition_Radio_Delivery_Coordinator.DeliveryResult.REJECTED)
              ->:(api.radioEvidence == Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.REJECTED)
          )
      )
    )

    val radioConditionOpt: Option[Observation_Acquisition_Radio_Delivery_Coordinator.RadioCondition.Type] = api.get_radioCondition()
    val deliveryResultOpt: Option[Observation_Acquisition_Radio_Delivery_Coordinator.DeliveryResult.Type] = api.get_deliveryResult()

    radioConditionOpt.get match {
      case Observation_Acquisition_Radio_Delivery_Coordinator.RadioCondition.UNAVAILABLE =>
        api.put_radioEvidence(Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.UNAVAILABLE)
      case Observation_Acquisition_Radio_Delivery_Coordinator.RadioCondition.READY =>
        deliveryResultOpt.get match {
          case Observation_Acquisition_Radio_Delivery_Coordinator.DeliveryResult.NONE =>
            api.put_radioEvidence(Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.READY)
          case Observation_Acquisition_Radio_Delivery_Coordinator.DeliveryResult.ACCEPTED =>
            api.put_radioEvidence(Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.ACCEPTED)
          case Observation_Acquisition_Radio_Delivery_Coordinator.DeliveryResult.REJECTED =>
            api.put_radioEvidence(Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.REJECTED)
        }
    }
  }

  def finalise(api: RadioEvidenceQualifier_Operational_Api): Unit = { }
}
