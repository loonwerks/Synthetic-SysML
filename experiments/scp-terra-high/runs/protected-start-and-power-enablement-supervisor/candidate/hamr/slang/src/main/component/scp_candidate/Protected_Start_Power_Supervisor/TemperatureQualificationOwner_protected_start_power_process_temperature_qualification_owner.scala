// #Sireum

package scp_candidate.Protected_Start_Power_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner {

  def initialise(api: TemperatureQualificationOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_qualified_temperature(Protected_Start_Power_Supervisor.QualifiedTemperature.InvalidEvidence)
  }

  def timeTriggered(api: TemperatureQualificationOwner_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.get_temperature_report() match {
      case Some(report) =>
        var temperature: Protected_Start_Power_Supervisor.QualifiedTemperature.Type =
          Protected_Start_Power_Supervisor.QualifiedTemperature.InvalidEvidence
        if (report.status == Protected_Start_Power_Supervisor.Validity.Valid) {
          if (report.band == Protected_Start_Power_Supervisor.TemperatureBand.Nominal) {
            temperature = Protected_Start_Power_Supervisor.QualifiedTemperature.Nominal
          } else if (report.band == Protected_Start_Power_Supervisor.TemperatureBand.Elevated) {
            temperature = Protected_Start_Power_Supervisor.QualifiedTemperature.Elevated
          } else {
            temperature = Protected_Start_Power_Supervisor.QualifiedTemperature.OverLimit
          }
        }
        api.put_qualified_temperature(temperature)
    }
  }

  def finalise(api: TemperatureQualificationOwner_Operational_Api): Unit = { }
}
