// #Sireum

package hvac_visibility_priority_supervisor.HVAC_Visibility_Priority_Supervisor

import org.sireum._
import hvac_visibility_priority_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ThermalNeedAssessor_supervision_thermalNeedAssessor {

  def initialise(api: ThermalNeedAssessor_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_thermalAssessment(HVAC_Visibility_Priority_Supervisor.ThermalAssessment.example())
  }

  def timeTriggered(api: ThermalNeedAssessor_Operational_Api): Unit = {
    // example api usage

    val apiUsage_cabinObservation: Option[HVAC_Visibility_Priority_Supervisor.CabinThermalObservation] = api.get_cabinObservation()
    api.logInfo(s"Received on data port cabinObservation: ${apiUsage_cabinObservation}")
    val apiUsage_qualifiedTarget: Option[HVAC_Visibility_Priority_Supervisor.QualifiedTarget] = api.get_qualifiedTarget()
    api.logInfo(s"Received on data port qualifiedTarget: ${apiUsage_qualifiedTarget}")
  }

  def finalise(api: ThermalNeedAssessor_Operational_Api): Unit = { }
}
