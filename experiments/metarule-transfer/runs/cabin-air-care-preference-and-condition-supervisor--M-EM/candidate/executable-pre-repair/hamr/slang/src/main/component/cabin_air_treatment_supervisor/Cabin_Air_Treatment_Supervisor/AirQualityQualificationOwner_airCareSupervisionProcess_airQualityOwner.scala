// #Sireum

package cabin_air_treatment_supervisor.Cabin_Air_Treatment_Supervisor

import org.sireum._
import cabin_air_treatment_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner {

  def initialise(api: AirQualityQualificationOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_airAssessment(Cabin_Air_Treatment_Supervisor.AirAssessment.Unknown)
  }

  def timeTriggered(api: AirQualityQualificationOwner_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_AIR_01_INVALID
        (api.airQualityValidity == Cabin_Air_Treatment_Supervisor.AirQualityValidity.Invalid) ___>: (api.airAssessment == Cabin_Air_Treatment_Supervisor.AirAssessment.Unknown),
        // case CASE_AIR_01_CLEAN
        (api.airQualityValidity == Cabin_Air_Treatment_Supervisor.AirQualityValidity.Valid &
          api.cabinAirQuality == Cabin_Air_Treatment_Supervisor.CabinAirQuality.Clean) ___>: (api.airAssessment == Cabin_Air_Treatment_Supervisor.AirAssessment.Clear),
        // case CASE_AIR_01_ELEVATED
        (api.airQualityValidity == Cabin_Air_Treatment_Supervisor.AirQualityValidity.Valid &
          api.cabinAirQuality == Cabin_Air_Treatment_Supervisor.CabinAirQuality.Elevated) ___>: (api.airAssessment == Cabin_Air_Treatment_Supervisor.AirAssessment.FilterNormalNeeded),
        // case CASE_AIR_01_POOR
        (api.airQualityValidity == Cabin_Air_Treatment_Supervisor.AirQualityValidity.Valid &
          api.cabinAirQuality == Cabin_Air_Treatment_Supervisor.CabinAirQuality.Poor) ___>: (api.airAssessment == Cabin_Air_Treatment_Supervisor.AirAssessment.FilterIntensiveNeeded)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    (api.get_cabinAirQuality(), api.get_airQualityValidity()) match {
      case (Some(quality), Some(validity)) =>
        if (validity == Cabin_Air_Treatment_Supervisor.AirQualityValidity.Invalid) {
          api.put_airAssessment(Cabin_Air_Treatment_Supervisor.AirAssessment.Unknown)
        } else if (quality == Cabin_Air_Treatment_Supervisor.CabinAirQuality.Clean) {
          api.put_airAssessment(Cabin_Air_Treatment_Supervisor.AirAssessment.Clear)
        } else if (quality == Cabin_Air_Treatment_Supervisor.CabinAirQuality.Elevated) {
          api.put_airAssessment(Cabin_Air_Treatment_Supervisor.AirAssessment.FilterNormalNeeded)
        } else {
          api.put_airAssessment(Cabin_Air_Treatment_Supervisor.AirAssessment.FilterIntensiveNeeded)
        }
      case _ => api.put_airAssessment(Cabin_Air_Treatment_Supervisor.AirAssessment.Unknown)
    }
  }

  def finalise(api: AirQualityQualificationOwner_Operational_Api): Unit = { }
}
