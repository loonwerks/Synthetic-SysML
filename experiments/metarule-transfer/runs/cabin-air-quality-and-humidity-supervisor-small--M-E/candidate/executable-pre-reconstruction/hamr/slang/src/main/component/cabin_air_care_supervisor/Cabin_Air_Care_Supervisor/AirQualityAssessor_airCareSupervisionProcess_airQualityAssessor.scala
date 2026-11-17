// #Sireum

package cabin_air_care_supervisor.Cabin_Air_Care_Supervisor

import org.sireum._
import cabin_air_care_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor {

  def initialise(api: AirQualityAssessor_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_airAssessment(Cabin_Air_Care_Supervisor.AirAssessment.Acceptable)
  }

  def timeTriggered(api: AirQualityAssessor_Operational_Api): Unit = {
    // example api usage

    val apiUsage_cabinAirQuality: Option[Cabin_Air_Care_Supervisor.CabinAirQuality.Type] = api.get_cabinAirQuality()
    api.logInfo(s"Received on data port cabinAirQuality: ${apiUsage_cabinAirQuality}")
    val apiUsage_airQualityValidity: Option[Cabin_Air_Care_Supervisor.AirQualityValidity.Type] = api.get_airQualityValidity()
    api.logInfo(s"Received on data port airQualityValidity: ${apiUsage_airQualityValidity}")
  }

  def finalise(api: AirQualityAssessor_Operational_Api): Unit = { }
}
