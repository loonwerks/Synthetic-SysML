// #Sireum

package cabin_air_quality_humidity_supervisor.Cabin_Air_Quality_Humidity_Supervisor

import org.sireum._
import cabin_air_quality_humidity_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler {

  def initialise(api: StatusOutcomeReconciler_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_supervisor_status(Cabin_Air_Quality_Humidity_Supervisor.CabinAirSupervisorStatus.example())
  }

  def timeTriggered(api: StatusOutcomeReconciler_Operational_Api): Unit = {
    // example api usage

    val apiUsage_composed_result: Option[Cabin_Air_Quality_Humidity_Supervisor.CompositionReport] = api.get_composed_result()
    api.logInfo(s"Received on data port composed_result: ${apiUsage_composed_result}")
    val apiUsage_selection: Option[Cabin_Air_Quality_Humidity_Supervisor.SelectionReport] = api.get_selection()
    api.logInfo(s"Received on data port selection: ${apiUsage_selection}")
    val apiUsage_air_report: Option[Cabin_Air_Quality_Humidity_Supervisor.AirRecoveryReport] = api.get_air_report()
    api.logInfo(s"Received on data port air_report: ${apiUsage_air_report}")
    val apiUsage_humidity_report: Option[Cabin_Air_Quality_Humidity_Supervisor.HumidityRecoveryReport] = api.get_humidity_report()
    api.logInfo(s"Received on data port humidity_report: ${apiUsage_humidity_report}")
    val apiUsage_accepted: Option[Cabin_Air_Quality_Humidity_Supervisor.AcceptedPreference] = api.get_accepted()
    api.logInfo(s"Received on data port accepted: ${apiUsage_accepted}")
  }

  def finalise(api: StatusOutcomeReconciler_Operational_Api): Unit = { }
}
