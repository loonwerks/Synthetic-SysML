// #Sireum

package scp_candidate.Observation_Acquisition_Radio_Delivery_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier {

  def initialise(api: SortieApplicabilityQualifier_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_sortieQualification(Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.BLOCKED_EVIDENCE)
  }

  def timeTriggered(api: SortieApplicabilityQualifier_Operational_Api): Unit = {
    Contract(Modifies(api))
    val assessment: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.Type = api.get_batteryAssessment().get
    val context: Observation_Acquisition_Radio_Delivery_Coordinator.SortieContext.Type = api.get_sortieContext().get
    var qualification: Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.Type =
      Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.BLOCKED_CONTEXT
    if (assessment == Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.UNAVAILABLE) {
      qualification = Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.BLOCKED_EVIDENCE
    } else if (assessment == Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.LOW) {
      qualification = Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.BLOCKED_ENERGY
    } else if (context == Observation_Acquisition_Radio_Delivery_Coordinator.SortieContext.AT_OBSERVATION_POSITION) {
      qualification = Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.ELIGIBLE
    }
    api.put_sortieQualification(qualification)
  }

  def finalise(api: SortieApplicabilityQualifier_Operational_Api): Unit = { }
}
