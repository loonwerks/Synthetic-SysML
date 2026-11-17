// #Sireum

package observation_acquisition_radio_delivery_coordinator.Observation_Acquisition_Radio_Delivery_Coordinator

import org.sireum._
import observation_acquisition_radio_delivery_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier {

  def initialise(api: SortieApplicabilityQualifier_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_sortieQualification(Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.BLOCKED_EVIDENCE)
  }

  def timeTriggered(api: SortieApplicabilityQualifier_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_04_EVIDENCE_BLOCK
        (api.batteryAssessment == BatteryAssessment.UNAVAILABLE) ___>: (api.sortieQualification == SortieQualification.BLOCKED_EVIDENCE),
        // case CASE_05_ENERGY_BLOCK
        (api.batteryAssessment == BatteryAssessment.LOW) ___>: (api.sortieQualification == SortieQualification.BLOCKED_ENERGY),
        // case CASE_06_CONTEXT_APPLICABILITY
        (api.batteryAssessment == BatteryAssessment.ADEQUATE) ___>: ((api.sortieContext == SortieContext.AT_OBSERVATION_POSITION ___>:
          api.sortieQualification == SortieQualification.ELIGIBLE) &
          (api.sortieContext == SortieContext.OUTSIDE_OBSERVATION_POSITION ___>:
            api.sortieQualification == SortieQualification.BLOCKED_CONTEXT))
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val assessment = api.get_batteryAssessment().get
    val context = api.get_sortieContext().get
    if (assessment == BatteryAssessment.UNAVAILABLE) {
      api.put_sortieQualification(SortieQualification.BLOCKED_EVIDENCE)
    } else if (assessment == BatteryAssessment.LOW) {
      api.put_sortieQualification(SortieQualification.BLOCKED_ENERGY)
    } else if (context == SortieContext.AT_OBSERVATION_POSITION) {
      api.put_sortieQualification(SortieQualification.ELIGIBLE)
    } else {
      api.put_sortieQualification(SortieQualification.BLOCKED_CONTEXT)
    }
  }

  def finalise(api: SortieApplicabilityQualifier_Operational_Api): Unit = { }
}
