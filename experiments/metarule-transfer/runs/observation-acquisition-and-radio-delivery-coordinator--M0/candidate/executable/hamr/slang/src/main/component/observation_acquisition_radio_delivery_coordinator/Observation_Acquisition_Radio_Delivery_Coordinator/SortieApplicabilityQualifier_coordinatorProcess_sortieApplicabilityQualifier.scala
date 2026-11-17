// #Sireum

package observation_acquisition_radio_delivery_coordinator.Observation_Acquisition_Radio_Delivery_Coordinator

import org.sireum._
import observation_acquisition_radio_delivery_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier {

  def initialise(api: SortieApplicabilityQualifier_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_sortieQualification(Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.BLOCKED_EVIDENCE)
  }

  def timeTriggered(api: SortieApplicabilityQualifier_Operational_Api): Unit = {
    // example api usage

    val apiUsage_batteryAssessment: Option[Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.Type] = api.get_batteryAssessment()
    api.logInfo(s"Received on data port batteryAssessment: ${apiUsage_batteryAssessment}")
    val apiUsage_sortieContext: Option[Observation_Acquisition_Radio_Delivery_Coordinator.SortieContext.Type] = api.get_sortieContext()
    api.logInfo(s"Received on data port sortieContext: ${apiUsage_sortieContext}")
  }

  def finalise(api: SortieApplicabilityQualifier_Operational_Api): Unit = { }
}
