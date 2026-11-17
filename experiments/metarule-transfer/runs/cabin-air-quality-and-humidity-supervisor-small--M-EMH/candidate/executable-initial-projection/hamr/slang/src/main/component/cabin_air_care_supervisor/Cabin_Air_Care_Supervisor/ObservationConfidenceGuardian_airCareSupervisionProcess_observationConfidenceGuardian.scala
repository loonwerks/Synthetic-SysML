// #Sireum

package cabin_air_care_supervisor.Cabin_Air_Care_Supervisor

import org.sireum._
import cabin_air_care_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian {

  def initialise(api: ObservationConfidenceGuardian_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_measurementConfidence(Cabin_Air_Care_Supervisor.MeasurementConfidence.Trusted)
  }

  def timeTriggered(api: ObservationConfidenceGuardian_Operational_Api): Unit = {
    // example api usage

    val apiUsage_airAssessment: Option[Cabin_Air_Care_Supervisor.AirAssessment.Type] = api.get_airAssessment()
    api.logInfo(s"Received on data port airAssessment: ${apiUsage_airAssessment}")
    val apiUsage_humidityAssessment: Option[Cabin_Air_Care_Supervisor.HumidityAssessment.Type] = api.get_humidityAssessment()
    api.logInfo(s"Received on data port humidityAssessment: ${apiUsage_humidityAssessment}")
  }

  def finalise(api: ObservationConfidenceGuardian_Operational_Api): Unit = { }
}
