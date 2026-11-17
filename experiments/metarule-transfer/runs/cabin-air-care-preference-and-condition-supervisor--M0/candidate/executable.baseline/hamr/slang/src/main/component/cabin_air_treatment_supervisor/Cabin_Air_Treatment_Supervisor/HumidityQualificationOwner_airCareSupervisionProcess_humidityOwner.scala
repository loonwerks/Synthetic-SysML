// #Sireum

package cabin_air_treatment_supervisor.Cabin_Air_Treatment_Supervisor

import org.sireum._
import cabin_air_treatment_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner {

  def initialise(api: HumidityQualificationOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_humidityAssessment(Cabin_Air_Treatment_Supervisor.HumidityAssessment.Unknown)
  }

  def timeTriggered(api: HumidityQualificationOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_cabinHumidity: Option[Cabin_Air_Treatment_Supervisor.CabinHumidity.Type] = api.get_cabinHumidity()
    api.logInfo(s"Received on data port cabinHumidity: ${apiUsage_cabinHumidity}")
    val apiUsage_humidityValidity: Option[Cabin_Air_Treatment_Supervisor.HumidityValidity.Type] = api.get_humidityValidity()
    api.logInfo(s"Received on data port humidityValidity: ${apiUsage_humidityValidity}")
  }

  def finalise(api: HumidityQualificationOwner_Operational_Api): Unit = { }
}
