// #Sireum

package cabin_air_care_supervisor.Cabin_Air_Care_Supervisor

import org.sireum._
import cabin_air_care_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object HumidityAssessor_airCareSupervisionProcess_humidityAssessor {

  def initialise(api: HumidityAssessor_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_humidityAssessment(Cabin_Air_Care_Supervisor.HumidityAssessment.AddMoisture)
  }

  def timeTriggered(api: HumidityAssessor_Operational_Api): Unit = {
    // example api usage

    val apiUsage_cabinHumidityBand: Option[Cabin_Air_Care_Supervisor.CabinHumidityBand.Type] = api.get_cabinHumidityBand()
    api.logInfo(s"Received on data port cabinHumidityBand: ${apiUsage_cabinHumidityBand}")
    val apiUsage_humidityValidity: Option[Cabin_Air_Care_Supervisor.HumidityValidity.Type] = api.get_humidityValidity()
    api.logInfo(s"Received on data port humidityValidity: ${apiUsage_humidityValidity}")
  }

  def finalise(api: HumidityAssessor_Operational_Api): Unit = { }
}
