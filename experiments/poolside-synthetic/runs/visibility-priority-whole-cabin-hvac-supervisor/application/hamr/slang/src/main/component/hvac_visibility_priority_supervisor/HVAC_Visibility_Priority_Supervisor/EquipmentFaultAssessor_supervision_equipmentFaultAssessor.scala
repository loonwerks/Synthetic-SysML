// #Sireum

package hvac_visibility_priority_supervisor.HVAC_Visibility_Priority_Supervisor

import org.sireum._
import hvac_visibility_priority_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object EquipmentFaultAssessor_supervision_equipmentFaultAssessor {

  def initialise(api: EquipmentFaultAssessor_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_criticalEquipment(HVAC_Visibility_Priority_Supervisor.EquipmentCriticality.Present)
    api.put_thermalPath(HVAC_Visibility_Priority_Supervisor.ThermalPathReadiness.example())
    api.put_visibilityPath(HVAC_Visibility_Priority_Supervisor.VisibilityPathReadiness.example())
    api.put_airPath(HVAC_Visibility_Priority_Supervisor.AirPathReadiness.example())
  }

  def timeTriggered(api: EquipmentFaultAssessor_Operational_Api): Unit = {
    // example api usage

    val apiUsage_equipmentReadiness: Option[HVAC_Visibility_Priority_Supervisor.EquipmentReadiness] = api.get_equipmentReadiness()
    api.logInfo(s"Received on data port equipmentReadiness: ${apiUsage_equipmentReadiness}")
  }

  def finalise(api: EquipmentFaultAssessor_Operational_Api): Unit = { }
}
