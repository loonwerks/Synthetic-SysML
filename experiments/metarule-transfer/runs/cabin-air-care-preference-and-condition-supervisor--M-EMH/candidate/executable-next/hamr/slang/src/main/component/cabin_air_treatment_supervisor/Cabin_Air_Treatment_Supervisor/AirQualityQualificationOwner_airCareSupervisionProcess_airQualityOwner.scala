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
    val assessment: AirAssessment.Type = (api.get_airQualityValidity(), api.get_cabinAirQuality()) match {
      case (Some(AirQualityValidity.Valid), Some(CabinAirQuality.Clean)) => AirAssessment.Clear
      case (Some(AirQualityValidity.Valid), Some(CabinAirQuality.Elevated)) => AirAssessment.FilterNormalNeeded
      case (Some(AirQualityValidity.Valid), Some(CabinAirQuality.Poor)) => AirAssessment.FilterIntensiveNeeded
      case _ => AirAssessment.Unknown
    }
    api.put_airAssessment(assessment)
  }

  def finalise(api: AirQualityQualificationOwner_Operational_Api): Unit = { }
}
