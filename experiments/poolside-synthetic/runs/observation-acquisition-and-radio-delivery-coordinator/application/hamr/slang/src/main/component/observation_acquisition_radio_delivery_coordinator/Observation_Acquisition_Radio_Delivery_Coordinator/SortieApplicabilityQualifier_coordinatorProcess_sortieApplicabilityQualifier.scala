// #Sireum

package observation_acquisition_radio_delivery_coordinator.Observation_Acquisition_Radio_Delivery_Coordinator

import org.sireum._
import observation_acquisition_radio_delivery_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier {

  def initialise(api: SortieApplicabilityQualifier_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // INIT_SORTIE_QUALIFICATION: initialise to a safe default (BLOCKED_EVIDENCE)
        // without reading input ports; full qualification is computed in timeTriggered
        api.sortieQualification == Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.BLOCKED_EVIDENCE
      )
    )
    api.put_sortieQualification(Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.BLOCKED_EVIDENCE)
  }

  def timeTriggered(api: SortieApplicabilityQualifier_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // CASE_04_EVIDENCE_BLOCK
        (api.batteryAssessment == Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.UNAVAILABLE)
          ->:(api.sortieQualification == Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.BLOCKED_EVIDENCE) &
        // CASE_05_ENERGY_BLOCK
        (api.batteryAssessment == Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.LOW)
          ->:(api.sortieQualification == Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.BLOCKED_ENERGY) &
        // CASE_06_CONTEXT_APPLICABILITY
        (api.batteryAssessment == Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.ADEQUATE)
          ->:(
            (api.sortieContext == Observation_Acquisition_Radio_Delivery_Coordinator.SortieContext.AT_OBSERVATION_POSITION)
              ->:(api.sortieQualification == Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.ELIGIBLE) &
            (api.sortieContext == Observation_Acquisition_Radio_Delivery_Coordinator.SortieContext.OUTSIDE_OBSERVATION_POSITION)
              ->:(api.sortieQualification == Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.BLOCKED_CONTEXT)
          )
      )
    )

    val batteryAssessmentOpt: Option[Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.Type] = api.get_batteryAssessment()
    val sortieContextOpt: Option[Observation_Acquisition_Radio_Delivery_Coordinator.SortieContext.Type] = api.get_sortieContext()

    batteryAssessmentOpt.get match {
      case Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.UNAVAILABLE =>
        api.put_sortieQualification(Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.BLOCKED_EVIDENCE)
      case Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.LOW =>
        api.put_sortieQualification(Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.BLOCKED_ENERGY)
      case Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.ADEQUATE =>
        sortieContextOpt.get match {
          case Observation_Acquisition_Radio_Delivery_Coordinator.SortieContext.AT_OBSERVATION_POSITION =>
            api.put_sortieQualification(Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.ELIGIBLE)
          case Observation_Acquisition_Radio_Delivery_Coordinator.SortieContext.OUTSIDE_OBSERVATION_POSITION =>
            api.put_sortieQualification(Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.BLOCKED_CONTEXT)
        }
    }
  }

  def finalise(api: SortieApplicabilityQualifier_Operational_Api): Unit = { }
}
