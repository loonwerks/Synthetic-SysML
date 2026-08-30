// #Sireum

package scp_candidate.Cabin_Air_Treatment_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner {

  def initialise(api: AirQualityQualificationOwner_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_AIR_ASSESSMENT_SAFE
        api.airAssessment == AirAssessment.Unknown
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_airAssessment(Cabin_Air_Treatment_Supervisor.AirAssessment.Unknown)
  }

  def timeTriggered(api: AirQualityQualificationOwner_Operational_Api): Unit = {
    Contract(
      Modifies(api)
    )
    val quality = api.get_cabinAirQuality().get
    val validity = api.get_airQualityValidity().get
    if (validity == AirQualityValidity.Invalid) {
      api.put_airAssessment(AirAssessment.Unknown)
    } else if (quality == CabinAirQuality.Clean) {
      api.put_airAssessment(AirAssessment.Clear)
    } else if (quality == CabinAirQuality.Elevated) {
      api.put_airAssessment(AirAssessment.FilterNormalNeeded)
    } else {
      api.put_airAssessment(AirAssessment.FilterIntensiveNeeded)
    }
  }

  def finalise(api: AirQualityQualificationOwner_Operational_Api): Unit = { }
}
