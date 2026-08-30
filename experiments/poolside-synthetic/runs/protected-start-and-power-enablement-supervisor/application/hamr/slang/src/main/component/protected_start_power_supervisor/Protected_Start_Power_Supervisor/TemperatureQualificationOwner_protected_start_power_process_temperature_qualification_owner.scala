// #Sireum

package protected_start_power_supervisor.Protected_Start_Power_Supervisor

import org.sireum._
import protected_start_power_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner {

  def initialise(api: TemperatureQualificationOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_qualified_temperature(Protected_Start_Power_Supervisor.QualifiedTemperature.InvalidEvidence)
  }

  def timeTriggered(api: TemperatureQualificationOwner_Operational_Api): Unit = {
    Contract(
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee TEMPERATURE_QUALIFICATION_TOTAL
        //   qualified temperature per temperature report status and band
        api.temperature_report.status == Validity.Invalid &
          api.qualified_temperature == QualifiedTemperature.InvalidEvidence |
          api.temperature_report.status == Validity.Valid &
            api.temperature_report.band == TemperatureBand.Nominal &
            api.qualified_temperature == QualifiedTemperature.Nominal |
          api.temperature_report.status == Validity.Valid &
            api.temperature_report.band == TemperatureBand.Elevated &
            api.qualified_temperature == QualifiedTemperature.Elevated |
          api.temperature_report.status == Validity.Valid &
            api.temperature_report.band == TemperatureBand.OverLimit &
            api.qualified_temperature == QualifiedTemperature.OverLimit
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val apiUsage_temperature_report: Option[Protected_Start_Power_Supervisor.TemperatureReport] = api.get_temperature_report()
    api.logInfo(s"Received on data port temperature_report: ${apiUsage_temperature_report}")
  }

  def finalise(api: TemperatureQualificationOwner_Operational_Api): Unit = { }
}
