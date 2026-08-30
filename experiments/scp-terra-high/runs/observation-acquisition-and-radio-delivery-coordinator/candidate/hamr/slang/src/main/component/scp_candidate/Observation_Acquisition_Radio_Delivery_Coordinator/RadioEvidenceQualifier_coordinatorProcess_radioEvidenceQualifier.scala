// #Sireum

package scp_candidate.Observation_Acquisition_Radio_Delivery_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier {

  def initialise(api: RadioEvidenceQualifier_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_radioEvidence(Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.UNAVAILABLE)
  }

  def timeTriggered(api: RadioEvidenceQualifier_Operational_Api): Unit = {
    Contract(Modifies(api))
    val condition: Observation_Acquisition_Radio_Delivery_Coordinator.RadioCondition.Type = api.get_radioCondition().get
    val result: Observation_Acquisition_Radio_Delivery_Coordinator.DeliveryResult.Type = api.get_deliveryResult().get
    var evidence: Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.Type =
      Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.READY
    if (condition == Observation_Acquisition_Radio_Delivery_Coordinator.RadioCondition.UNAVAILABLE) {
      evidence = Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.UNAVAILABLE
    } else if (result == Observation_Acquisition_Radio_Delivery_Coordinator.DeliveryResult.ACCEPTED) {
      evidence = Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.ACCEPTED
    } else if (result == Observation_Acquisition_Radio_Delivery_Coordinator.DeliveryResult.REJECTED) {
      evidence = Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.REJECTED
    }
    api.put_radioEvidence(evidence)
  }

  def finalise(api: RadioEvidenceQualifier_Operational_Api): Unit = { }
}
