// #Sireum

package cabin_air_care_supervisor.Cabin_Air_Care_Supervisor

import org.sireum._
import cabin_air_care_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor {

  def initialise(api: AirCarePolicySupervisor_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_airTreatmentDirective(Cabin_Air_Care_Supervisor.AirTreatmentDirective.Standby)
    api.put_airCareStatus(Cabin_Air_Care_Supervisor.AirCareStatus.Off)
  }

  def timeTriggered(api: AirCarePolicySupervisor_Operational_Api): Unit = {
    // example api usage

    val apiUsage_airCareIntent: Option[Cabin_Air_Care_Supervisor.AirCareIntent.Type] = api.get_airCareIntent()
    api.logInfo(s"Received on data port airCareIntent: ${apiUsage_airCareIntent}")
    val apiUsage_airAssessment: Option[Cabin_Air_Care_Supervisor.AirAssessment.Type] = api.get_airAssessment()
    api.logInfo(s"Received on data port airAssessment: ${apiUsage_airAssessment}")
    val apiUsage_humidityAssessment: Option[Cabin_Air_Care_Supervisor.HumidityAssessment.Type] = api.get_humidityAssessment()
    api.logInfo(s"Received on data port humidityAssessment: ${apiUsage_humidityAssessment}")
    val apiUsage_measurementConfidence: Option[Cabin_Air_Care_Supervisor.MeasurementConfidence.Type] = api.get_measurementConfidence()
    api.logInfo(s"Received on data port measurementConfidence: ${apiUsage_measurementConfidence}")
  }

  def finalise(api: AirCarePolicySupervisor_Operational_Api): Unit = { }
}
