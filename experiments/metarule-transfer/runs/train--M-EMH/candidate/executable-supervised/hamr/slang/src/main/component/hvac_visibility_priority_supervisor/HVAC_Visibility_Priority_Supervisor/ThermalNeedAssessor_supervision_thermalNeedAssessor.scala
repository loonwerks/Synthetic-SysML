// #Sireum

package hvac_visibility_priority_supervisor.HVAC_Visibility_Priority_Supervisor

import org.sireum._
import hvac_visibility_priority_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ThermalNeedAssessor_supervision_thermalNeedAssessor {

  def initialise(api: ThermalNeedAssessor_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_thermalAssessment(HVAC_Visibility_Priority_Supervisor.ThermalAssessment(
      HVAC_Visibility_Priority_Supervisor.ThermalNeed.Unavailable,
      HVAC_Visibility_Priority_Supervisor.ThermalObservationValidity.Invalid))
  }

  def timeTriggered(api: ThermalNeedAssessor_Operational_Api): Unit = {
    Contract(Modifies(api))
    (api.get_cabinObservation(), api.get_qualifiedTarget()) match {
      case (Some(observation), Some(target)) if observation.validity == HVAC_Visibility_Priority_Supervisor.Validity.Valid =>
        val need: HVAC_Visibility_Priority_Supervisor.ThermalNeed.Type =
          if (target.requestClass != HVAC_Visibility_Priority_Supervisor.RequestClass.Comfort)
            HVAC_Visibility_Priority_Supervisor.ThermalNeed.Unavailable
          else if (target.target == HVAC_Visibility_Priority_Supervisor.ThermalBand.Cool &&
            observation.band == HVAC_Visibility_Priority_Supervisor.CabinBand.Cool ||
            target.target == HVAC_Visibility_Priority_Supervisor.ThermalBand.Neutral &&
              observation.band == HVAC_Visibility_Priority_Supervisor.CabinBand.Neutral ||
            target.target == HVAC_Visibility_Priority_Supervisor.ThermalBand.Warm &&
              observation.band == HVAC_Visibility_Priority_Supervisor.CabinBand.Warm)
            HVAC_Visibility_Priority_Supervisor.ThermalNeed.None
          else if (target.target == HVAC_Visibility_Priority_Supervisor.ThermalBand.Warm ||
            target.target == HVAC_Visibility_Priority_Supervisor.ThermalBand.Neutral &&
              observation.band == HVAC_Visibility_Priority_Supervisor.CabinBand.Cool)
            HVAC_Visibility_Priority_Supervisor.ThermalNeed.Heat
          else HVAC_Visibility_Priority_Supervisor.ThermalNeed.Cool
        api.put_thermalAssessment(HVAC_Visibility_Priority_Supervisor.ThermalAssessment(
          need, HVAC_Visibility_Priority_Supervisor.ThermalObservationValidity.Valid))
      case _ =>
        api.put_thermalAssessment(HVAC_Visibility_Priority_Supervisor.ThermalAssessment(
          HVAC_Visibility_Priority_Supervisor.ThermalNeed.Unavailable,
          HVAC_Visibility_Priority_Supervisor.ThermalObservationValidity.Invalid))
    }
  }

  def finalise(api: ThermalNeedAssessor_Operational_Api): Unit = { }
}
