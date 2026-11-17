// #Sireum

package observation_acquisition_radio_delivery_coordinator.Observation_Acquisition_Radio_Delivery_Coordinator

import org.sireum._
import observation_acquisition_radio_delivery_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier {

  def initialise(api: SortieApplicabilityQualifier_Initialization_Api): Unit = {
    Contract(
      Modifies(api)
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_sortieQualification(Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.BLOCKED_EVIDENCE)
  }

  def timeTriggered(api: SortieApplicabilityQualifier_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_04_EVIDENCE_BLOCK
        (api.batteryAssessment == Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.UNAVAILABLE) ___>: (api.sortieQualification == Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.BLOCKED_EVIDENCE),
        // case CASE_05_ENERGY_BLOCK
        (api.batteryAssessment == Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.LOW) ___>: (api.sortieQualification == Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.BLOCKED_ENERGY),
        // case CASE_06_CONTEXT_APPLICABILITY
        (api.batteryAssessment == Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.ADEQUATE) ___>: ((api.sortieContext == Observation_Acquisition_Radio_Delivery_Coordinator.SortieContext.AT_OBSERVATION_POSITION ___>:
          api.sortieQualification == Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.ELIGIBLE) &
          (api.sortieContext == Observation_Acquisition_Radio_Delivery_Coordinator.SortieContext.OUTSIDE_OBSERVATION_POSITION ___>:
            api.sortieQualification == Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.BLOCKED_CONTEXT))
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val batteryAssessment = api.get_batteryAssessment().get
    val sortieContext = api.get_sortieContext().get
    if (batteryAssessment == Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.UNAVAILABLE) {
      api.put_sortieQualification(Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.BLOCKED_EVIDENCE)
    } else if (batteryAssessment == Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.LOW) {
      api.put_sortieQualification(Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.BLOCKED_ENERGY)
    } else if (sortieContext == Observation_Acquisition_Radio_Delivery_Coordinator.SortieContext.AT_OBSERVATION_POSITION) {
      api.put_sortieQualification(Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.ELIGIBLE)
    } else {
      api.put_sortieQualification(Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.BLOCKED_CONTEXT)
    }
  }

  def finalise(api: SortieApplicabilityQualifier_Operational_Api): Unit = { }
}
