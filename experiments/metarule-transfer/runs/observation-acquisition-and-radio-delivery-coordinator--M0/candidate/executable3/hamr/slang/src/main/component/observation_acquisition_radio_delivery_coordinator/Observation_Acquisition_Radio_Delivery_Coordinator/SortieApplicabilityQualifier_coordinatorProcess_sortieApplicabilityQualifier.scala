// #Sireum

package observation_acquisition_radio_delivery_coordinator.Observation_Acquisition_Radio_Delivery_Coordinator

import org.sireum._
import observation_acquisition_radio_delivery_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier {

  def initialise(api: SortieApplicabilityQualifier_Initialization_Api): Unit = {
    Contract(Modifies(api))
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
        //   Unavailable assessment blocks evidence | N.md#CASE_04
        (api.batteryAssessment == BatteryAssessment.UNAVAILABLE) ___>: (api.sortieQualification == SortieQualification.BLOCKED_EVIDENCE),
        // case CASE_05_ENERGY_BLOCK
        //   Low assessment blocks energy | N.md#CASE_05
        (api.batteryAssessment == BatteryAssessment.LOW) ___>: (api.sortieQualification == SortieQualification.BLOCKED_ENERGY),
        // case CASE_06_CONTEXT_APPLICABILITY
        //   Adequate assessment qualifies selected context | N.md#CASE_06
        (api.batteryAssessment == BatteryAssessment.ADEQUATE) ___>: ((api.sortieContext == SortieContext.AT_OBSERVATION_POSITION ___>:
          api.sortieQualification == SortieQualification.ELIGIBLE) &
          (api.sortieContext == SortieContext.OUTSIDE_OBSERVATION_POSITION ___>:
            api.sortieQualification == SortieQualification.BLOCKED_CONTEXT))
        // END COMPUTE ENSURES timeTriggered
      )
    )
    (api.get_batteryAssessment(), api.get_sortieContext()) match {
      case (Some(BatteryAssessment.UNAVAILABLE), _) =>
        api.put_sortieQualification(SortieQualification.BLOCKED_EVIDENCE)
      case (Some(BatteryAssessment.LOW), _) =>
        api.put_sortieQualification(SortieQualification.BLOCKED_ENERGY)
      case (Some(BatteryAssessment.ADEQUATE), Some(SortieContext.AT_OBSERVATION_POSITION)) =>
        api.put_sortieQualification(SortieQualification.ELIGIBLE)
      case (Some(BatteryAssessment.ADEQUATE), _) =>
        api.put_sortieQualification(SortieQualification.BLOCKED_CONTEXT)
      case _ =>
        api.put_sortieQualification(SortieQualification.BLOCKED_EVIDENCE)
    }
  }

  def finalise(api: SortieApplicabilityQualifier_Operational_Api): Unit = { }
}
