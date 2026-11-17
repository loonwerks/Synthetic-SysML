// #Sireum

package cabin_air_care_supervisor.Cabin_Air_Care_Supervisor

import org.sireum._
import cabin_air_care_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor {

  def initialise(api: AirQualityAssessor_Initialization_Api): Unit = {
    Contract(
      Modifies(api)
    )
    api.put_airAssessment(Cabin_Air_Care_Supervisor.AirAssessment.Unknown)
  }

  def timeTriggered(api: AirQualityAssessor_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CC_03_INVALID_AIR_QUALITY
        (api.airQualityValidity == AirQualityValidity.Invalid) ___>: (api.airAssessment == AirAssessment.Unknown),
        // case CC_03_ACCEPTABLE_AIR
        (api.airQualityValidity == AirQualityValidity.Valid &
          api.cabinAirQuality == CabinAirQuality.Acceptable) ___>: (api.airAssessment == AirAssessment.Acceptable),
        // case CC_03_POLLUTED_AIR
        (api.airQualityValidity == AirQualityValidity.Valid &
          api.cabinAirQuality == CabinAirQuality.Polluted) ___>: (api.airAssessment == AirAssessment.FilterNeeded)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val quality = api.get_cabinAirQuality().get
    val validity = api.get_airQualityValidity().get
    if (validity == AirQualityValidity.Invalid) {
      api.put_airAssessment(AirAssessment.Unknown)
    } else if (quality == CabinAirQuality.Acceptable) {
      api.put_airAssessment(AirAssessment.Acceptable)
    } else {
      api.put_airAssessment(AirAssessment.FilterNeeded)
    }
  }

  def finalise(api: AirQualityAssessor_Operational_Api): Unit = { }
}
