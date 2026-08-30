// #Sireum

package scp_candidate.Cabin_Air_Treatment_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner {

  def initialise(api: HumidityQualificationOwner_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_HUMIDITY_ASSESSMENT_SAFE
        api.humidityAssessment == HumidityAssessment.Unknown
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_humidityAssessment(Cabin_Air_Treatment_Supervisor.HumidityAssessment.Unknown)
  }

  def timeTriggered(api: HumidityQualificationOwner_Operational_Api): Unit = {
    Contract(
      Modifies(api)
    )
    val humidity = api.get_cabinHumidity().get
    val validity = api.get_humidityValidity().get
    if (validity == HumidityValidity.Invalid) {
      api.put_humidityAssessment(HumidityAssessment.Unknown)
    } else if (humidity == CabinHumidity.Damp) {
      api.put_humidityAssessment(HumidityAssessment.DryingNeeded)
    } else {
      api.put_humidityAssessment(HumidityAssessment.NoExcessHumidity)
    }
  }

  def finalise(api: HumidityQualificationOwner_Operational_Api): Unit = { }
}
