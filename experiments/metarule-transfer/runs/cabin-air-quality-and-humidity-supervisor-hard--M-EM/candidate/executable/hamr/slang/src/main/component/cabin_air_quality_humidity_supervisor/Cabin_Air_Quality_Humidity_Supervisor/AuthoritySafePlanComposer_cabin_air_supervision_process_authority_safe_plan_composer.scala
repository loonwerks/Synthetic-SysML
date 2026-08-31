// #Sireum

package cabin_air_quality_humidity_supervisor.Cabin_Air_Quality_Humidity_Supervisor

import org.sireum._
import cabin_air_quality_humidity_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer {

  def initialise(api: AuthoritySafePlanComposer_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_composition_to_status(Cabin_Air_Quality_Humidity_Supervisor.CompositionReport.example())
    api.put_treatment_plan(Cabin_Air_Quality_Humidity_Supervisor.CabinAirTreatmentPlan.example())
  }

  def timeTriggered(api: AuthoritySafePlanComposer_Operational_Api): Unit = {
    // example api usage

    val apiUsage_selection: Option[Cabin_Air_Quality_Humidity_Supervisor.SelectionReport] = api.get_selection()
    api.logInfo(s"Received on data port selection: ${apiUsage_selection}")
    val apiUsage_path: Option[Cabin_Air_Quality_Humidity_Supervisor.PathDisposition.Type] = api.get_path()
    api.logInfo(s"Received on data port path: ${apiUsage_path}")
    val apiUsage_capabilities: Option[Cabin_Air_Quality_Humidity_Supervisor.CapabilitySet] = api.get_capabilities()
    api.logInfo(s"Received on data port capabilities: ${apiUsage_capabilities}")
  }

  def finalise(api: AuthoritySafePlanComposer_Operational_Api): Unit = { }
}
