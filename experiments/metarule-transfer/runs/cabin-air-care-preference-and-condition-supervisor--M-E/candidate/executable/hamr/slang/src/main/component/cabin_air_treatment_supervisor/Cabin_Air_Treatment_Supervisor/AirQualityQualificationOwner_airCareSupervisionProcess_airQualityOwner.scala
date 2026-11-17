// #Sireum

package cabin_air_treatment_supervisor.Cabin_Air_Treatment_Supervisor

import org.sireum._
import cabin_air_treatment_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner {

  def initialise(api: AirQualityQualificationOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_airAssessment(AirAssessment.Unknown)
  }

  def timeTriggered(api: AirQualityQualificationOwner_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_AIR_01_QUALIFICATION
        (T) ___>: (api.airQualityValidity == AirQualityValidity.Invalid &
          api.airAssessment == AirAssessment.Unknown |
          api.airQualityValidity == AirQualityValidity.Valid &
            api.cabinAirQuality == CabinAirQuality.Clean &
            api.airAssessment == AirAssessment.Clear |
          api.airQualityValidity == AirQualityValidity.Valid &
            api.cabinAirQuality == CabinAirQuality.Elevated &
            api.airAssessment == AirAssessment.FilterNormalNeeded |
          api.airQualityValidity == AirQualityValidity.Valid &
            api.cabinAirQuality == CabinAirQuality.Poor &
            api.airAssessment == AirAssessment.FilterIntensiveNeeded)
        // END COMPUTE ENSURES timeTriggered
      )
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
