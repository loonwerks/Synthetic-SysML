// #Sireum

package hvac_visibility_priority_supervisor.HVAC_Visibility_Priority_Supervisor

import org.sireum._
import hvac_visibility_priority_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object EquipmentFaultAssessor_supervision_equipmentFaultAssessor {

  def initialise(api: EquipmentFaultAssessor_Initialization_Api): Unit = {
    api.put_criticalEquipment(HVAC_Visibility_Priority_Supervisor.EquipmentCriticality.Present)
    api.put_thermalPath(HVAC_Visibility_Priority_Supervisor.ThermalPathReadiness(
      HVAC_Visibility_Priority_Supervisor.ThermalBlowerAvailability.Unavailable,
      HVAC_Visibility_Priority_Supervisor.ThermalEquipmentAvailability.Unavailable))
    api.put_visibilityPath(HVAC_Visibility_Priority_Supervisor.VisibilityPathReadiness(
      HVAC_Visibility_Priority_Supervisor.VisibilityBlowerAvailability.Unavailable,
      HVAC_Visibility_Priority_Supervisor.ClearingAvailability.Unavailable))
    api.put_airPath(HVAC_Visibility_Priority_Supervisor.AirPathReadiness(
      HVAC_Visibility_Priority_Supervisor.AirTreatmentAvailability.Unavailable))
  }

  def timeTriggered(api: EquipmentFaultAssessor_Operational_Api): Unit = {
    api.get_equipmentReadiness() match {
      case Some(readiness) if readiness.validity == HVAC_Visibility_Priority_Supervisor.Validity.Valid =>
        val blowerAvailable = readiness.circulationState == HVAC_Visibility_Priority_Supervisor.BlowerReadiness.Ready
        val thermalAvailable = readiness.thermal == HVAC_Visibility_Priority_Supervisor.ThermalReadiness.Ready
        val clearingAvailable = readiness.clearing == HVAC_Visibility_Priority_Supervisor.ClearingReadiness.Ready
        val airAvailable = readiness.airTreatment == HVAC_Visibility_Priority_Supervisor.AirTreatmentReadiness.Ready
        api.put_thermalPath(HVAC_Visibility_Priority_Supervisor.ThermalPathReadiness(
          if (blowerAvailable) HVAC_Visibility_Priority_Supervisor.ThermalBlowerAvailability.Available else HVAC_Visibility_Priority_Supervisor.ThermalBlowerAvailability.Unavailable,
          if (thermalAvailable) HVAC_Visibility_Priority_Supervisor.ThermalEquipmentAvailability.Available else HVAC_Visibility_Priority_Supervisor.ThermalEquipmentAvailability.Unavailable))
        api.put_visibilityPath(HVAC_Visibility_Priority_Supervisor.VisibilityPathReadiness(
          if (blowerAvailable) HVAC_Visibility_Priority_Supervisor.VisibilityBlowerAvailability.Available else HVAC_Visibility_Priority_Supervisor.VisibilityBlowerAvailability.Unavailable,
          if (clearingAvailable) HVAC_Visibility_Priority_Supervisor.ClearingAvailability.Available else HVAC_Visibility_Priority_Supervisor.ClearingAvailability.Unavailable))
        api.put_airPath(HVAC_Visibility_Priority_Supervisor.AirPathReadiness(
          if (airAvailable) HVAC_Visibility_Priority_Supervisor.AirTreatmentAvailability.Available else HVAC_Visibility_Priority_Supervisor.AirTreatmentAvailability.Unavailable))
        api.put_criticalEquipment(if (!blowerAvailable || !clearingAvailable ||
          readiness.thermal == HVAC_Visibility_Priority_Supervisor.ThermalReadiness.Unknown ||
          readiness.airTreatment == HVAC_Visibility_Priority_Supervisor.AirTreatmentReadiness.Unknown)
          HVAC_Visibility_Priority_Supervisor.EquipmentCriticality.Present
        else HVAC_Visibility_Priority_Supervisor.EquipmentCriticality.Absent)
      case _ =>
        api.put_criticalEquipment(HVAC_Visibility_Priority_Supervisor.EquipmentCriticality.Present)
        api.put_thermalPath(HVAC_Visibility_Priority_Supervisor.ThermalPathReadiness(
          HVAC_Visibility_Priority_Supervisor.ThermalBlowerAvailability.Unavailable,
          HVAC_Visibility_Priority_Supervisor.ThermalEquipmentAvailability.Unavailable))
        api.put_visibilityPath(HVAC_Visibility_Priority_Supervisor.VisibilityPathReadiness(
          HVAC_Visibility_Priority_Supervisor.VisibilityBlowerAvailability.Unavailable,
          HVAC_Visibility_Priority_Supervisor.ClearingAvailability.Unavailable))
        api.put_airPath(HVAC_Visibility_Priority_Supervisor.AirPathReadiness(
          HVAC_Visibility_Priority_Supervisor.AirTreatmentAvailability.Unavailable))
    }
  }

  def finalise(api: EquipmentFaultAssessor_Operational_Api): Unit = { }
}
