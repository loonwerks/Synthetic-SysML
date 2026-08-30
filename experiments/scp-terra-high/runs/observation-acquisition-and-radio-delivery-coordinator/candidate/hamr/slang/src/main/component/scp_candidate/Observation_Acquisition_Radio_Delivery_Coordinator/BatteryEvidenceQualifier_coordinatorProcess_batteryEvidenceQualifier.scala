// #Sireum

package scp_candidate.Observation_Acquisition_Radio_Delivery_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier {

  def initialise(api: BatteryEvidenceQualifier_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_batteryAssessment(Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.UNAVAILABLE)
  }

  def timeTriggered(api: BatteryEvidenceQualifier_Operational_Api): Unit = {
    Contract(Modifies(api))
    val check: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCheck.Type = api.get_batteryCheck().get
    val capacity: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCapacityBand.Type = api.get_batteryCapacity().get
    var assessment: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.Type =
      Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.ADEQUATE
    if (check == Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCheck.INVALID) {
      assessment = Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.UNAVAILABLE
    } else if (capacity == Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCapacityBand.LOW) {
      assessment = Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.LOW
    }
    api.put_batteryAssessment(assessment)
  }

  def finalise(api: BatteryEvidenceQualifier_Operational_Api): Unit = { }
}
