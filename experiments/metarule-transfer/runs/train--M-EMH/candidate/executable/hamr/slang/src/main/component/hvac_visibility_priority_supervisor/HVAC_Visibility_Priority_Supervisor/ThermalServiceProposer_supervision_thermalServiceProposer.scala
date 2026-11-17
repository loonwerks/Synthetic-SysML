// #Sireum

package hvac_visibility_priority_supervisor.HVAC_Visibility_Priority_Supervisor

import org.sireum._
import hvac_visibility_priority_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ThermalServiceProposer_supervision_thermalServiceProposer {

  def initialise(api: ThermalServiceProposer_Initialization_Api): Unit = {
    api.put_thermalProposal(HVAC_Visibility_Priority_Supervisor.ThermalProposal(
      HVAC_Visibility_Priority_Supervisor.Service.None,
      HVAC_Visibility_Priority_Supervisor.HeatSource.None,
      HVAC_Visibility_Priority_Supervisor.ThermalProposalAvailability.Unavailable,
      HVAC_Visibility_Priority_Supervisor.ThermalDegradation.InvalidThermal))
  }

  def timeTriggered(api: ThermalServiceProposer_Operational_Api): Unit = {
    (api.get_thermalAssessment(), api.get_wasteHeatEligibility(), api.get_thermalPath()) match {
      case (Some(assessment), Some(wasteHeat), Some(path)) if
        assessment.observationInvalid == HVAC_Visibility_Priority_Supervisor.ThermalObservationValidity.Valid &&
          assessment.need == HVAC_Visibility_Priority_Supervisor.ThermalNeed.None &&
          path.thermalBlowerReady == HVAC_Visibility_Priority_Supervisor.ThermalBlowerAvailability.Available =>
        api.put_thermalProposal(HVAC_Visibility_Priority_Supervisor.ThermalProposal(
          HVAC_Visibility_Priority_Supervisor.Service.Ventilate,
          HVAC_Visibility_Priority_Supervisor.HeatSource.None,
          HVAC_Visibility_Priority_Supervisor.ThermalProposalAvailability.Available,
          HVAC_Visibility_Priority_Supervisor.ThermalDegradation.None))
      case (Some(assessment), Some(wasteHeat), Some(path)) if
        assessment.observationInvalid == HVAC_Visibility_Priority_Supervisor.ThermalObservationValidity.Valid &&
          assessment.need == HVAC_Visibility_Priority_Supervisor.ThermalNeed.Heat &&
          path.thermalBlowerReady == HVAC_Visibility_Priority_Supervisor.ThermalBlowerAvailability.Available &&
          path.thermalReady == HVAC_Visibility_Priority_Supervisor.ThermalEquipmentAvailability.Available =>
        api.put_thermalProposal(HVAC_Visibility_Priority_Supervisor.ThermalProposal(
          HVAC_Visibility_Priority_Supervisor.Service.Heat,
          if (wasteHeat == HVAC_Visibility_Priority_Supervisor.WasteHeatEligibility.Eligible)
            HVAC_Visibility_Priority_Supervisor.HeatSource.WasteHeat
          else HVAC_Visibility_Priority_Supervisor.HeatSource.Electrical,
          HVAC_Visibility_Priority_Supervisor.ThermalProposalAvailability.Available,
          HVAC_Visibility_Priority_Supervisor.ThermalDegradation.None))
      case (Some(assessment), _, Some(path)) if
        assessment.observationInvalid == HVAC_Visibility_Priority_Supervisor.ThermalObservationValidity.Valid &&
          assessment.need == HVAC_Visibility_Priority_Supervisor.ThermalNeed.Cool &&
          path.thermalBlowerReady == HVAC_Visibility_Priority_Supervisor.ThermalBlowerAvailability.Available &&
          path.thermalReady == HVAC_Visibility_Priority_Supervisor.ThermalEquipmentAvailability.Available =>
        api.put_thermalProposal(HVAC_Visibility_Priority_Supervisor.ThermalProposal(
          HVAC_Visibility_Priority_Supervisor.Service.Cool,
          HVAC_Visibility_Priority_Supervisor.HeatSource.None,
          HVAC_Visibility_Priority_Supervisor.ThermalProposalAvailability.Available,
          HVAC_Visibility_Priority_Supervisor.ThermalDegradation.None))
      case (Some(assessment), _, _) if assessment.observationInvalid ==
        HVAC_Visibility_Priority_Supervisor.ThermalObservationValidity.Valid =>
        api.put_thermalProposal(HVAC_Visibility_Priority_Supervisor.ThermalProposal(
          HVAC_Visibility_Priority_Supervisor.Service.None,
          HVAC_Visibility_Priority_Supervisor.HeatSource.None,
          HVAC_Visibility_Priority_Supervisor.ThermalProposalAvailability.Unavailable,
          HVAC_Visibility_Priority_Supervisor.ThermalDegradation.None))
      case _ =>
        api.put_thermalProposal(HVAC_Visibility_Priority_Supervisor.ThermalProposal(
          HVAC_Visibility_Priority_Supervisor.Service.None,
          HVAC_Visibility_Priority_Supervisor.HeatSource.None,
          HVAC_Visibility_Priority_Supervisor.ThermalProposalAvailability.Unavailable,
          HVAC_Visibility_Priority_Supervisor.ThermalDegradation.InvalidThermal))
    }
  }

  def finalise(api: ThermalServiceProposer_Operational_Api): Unit = { }
}
