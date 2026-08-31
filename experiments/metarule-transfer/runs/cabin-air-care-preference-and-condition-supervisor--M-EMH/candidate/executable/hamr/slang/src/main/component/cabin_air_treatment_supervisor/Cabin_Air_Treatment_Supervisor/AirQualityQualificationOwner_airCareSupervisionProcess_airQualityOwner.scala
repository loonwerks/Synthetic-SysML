// #Sireum

package cabin_air_treatment_supervisor.Cabin_Air_Treatment_Supervisor

import org.sireum._
import cabin_air_treatment_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner {

  def initialise(api: AirQualityQualificationOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_airAssessment(Cabin_Air_Treatment_Supervisor.AirAssessment.Unknown)
  }

  def timeTriggered(api: AirQualityQualificationOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_cabinAirQuality: Option[Cabin_Air_Treatment_Supervisor.CabinAirQuality.Type] = api.get_cabinAirQuality()
    api.logInfo(s"Received on data port cabinAirQuality: ${apiUsage_cabinAirQuality}")
    val apiUsage_airQualityValidity: Option[Cabin_Air_Treatment_Supervisor.AirQualityValidity.Type] = api.get_airQualityValidity()
    api.logInfo(s"Received on data port airQualityValidity: ${apiUsage_airQualityValidity}")
  }

  def finalise(api: AirQualityQualificationOwner_Operational_Api): Unit = { }
}
