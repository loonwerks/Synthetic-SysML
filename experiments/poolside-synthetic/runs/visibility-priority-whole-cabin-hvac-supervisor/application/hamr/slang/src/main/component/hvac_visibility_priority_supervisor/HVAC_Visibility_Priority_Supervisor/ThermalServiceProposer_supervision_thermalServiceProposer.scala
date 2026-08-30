// #Sireum

package hvac_visibility_priority_supervisor.HVAC_Visibility_Priority_Supervisor

import org.sireum._
import hvac_visibility_priority_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ThermalServiceProposer_supervision_thermalServiceProposer {

  def initialise(api: ThermalServiceProposer_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_thermalProposal(HVAC_Visibility_Priority_Supervisor.ThermalProposal.example())
  }

  def timeTriggered(api: ThermalServiceProposer_Operational_Api): Unit = {
    // example api usage

    val apiUsage_thermalAssessment: Option[HVAC_Visibility_Priority_Supervisor.ThermalAssessment] = api.get_thermalAssessment()
    api.logInfo(s"Received on data port thermalAssessment: ${apiUsage_thermalAssessment}")
    val apiUsage_wasteHeatEligibility: Option[HVAC_Visibility_Priority_Supervisor.WasteHeatEligibility.Type] = api.get_wasteHeatEligibility()
    api.logInfo(s"Received on data port wasteHeatEligibility: ${apiUsage_wasteHeatEligibility}")
    val apiUsage_thermalPath: Option[HVAC_Visibility_Priority_Supervisor.ThermalPathReadiness] = api.get_thermalPath()
    api.logInfo(s"Received on data port thermalPath: ${apiUsage_thermalPath}")
  }

  def finalise(api: ThermalServiceProposer_Operational_Api): Unit = { }
}
