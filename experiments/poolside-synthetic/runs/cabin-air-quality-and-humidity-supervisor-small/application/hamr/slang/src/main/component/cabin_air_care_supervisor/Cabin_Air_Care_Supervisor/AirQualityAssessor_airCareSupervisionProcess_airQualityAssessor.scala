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
    api.put_airAssessment(Cabin_Air_Care_Supervisor.AirAssessment.Acceptable)
  }

  def timeTriggered(api: AirQualityAssessor_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CC_03_AIR_ASSESSMENT
        //   Invalid yields Unknown; Valid/Acceptable yields Acceptable; Valid/Polluted yields FilterNeeded
        (api.airQualityValidity == AirQualityValidity.Invalid |
          api.airQualityValidity == AirQualityValidity.Valid &
            api.cabinAirQuality == CabinAirQuality.Acceptable |
          api.airQualityValidity == AirQualityValidity.Valid &
            api.cabinAirQuality == CabinAirQuality.Polluted) ___>: ((api.airQualityValidity == AirQualityValidity.Invalid ___>:
          api.airAssessment == AirAssessment.Unknown) &
          (api.airQualityValidity == AirQualityValidity.Valid &
            api.cabinAirQuality == CabinAirQuality.Acceptable ___>:
            api.airAssessment == AirAssessment.Acceptable) &
          (api.airQualityValidity == AirQualityValidity.Valid &
            api.cabinAirQuality == CabinAirQuality.Polluted ___>:
            api.airAssessment == AirAssessment.FilterNeeded))
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val airQualityValidity: Cabin_Air_Care_Supervisor.AirQualityValidity.Type = api.get_airQualityValidity().get
    val cabinAirQuality: Cabin_Air_Care_Supervisor.CabinAirQuality.Type = api.get_cabinAirQuality().get

    airQualityValidity match {
      case Cabin_Air_Care_Supervisor.AirQualityValidity.Invalid =>
        api.put_airAssessment(Cabin_Air_Care_Supervisor.AirAssessment.Unknown)
      case Cabin_Air_Care_Supervisor.AirQualityValidity.Valid =>
        cabinAirQuality match {
          case Cabin_Air_Care_Supervisor.CabinAirQuality.Acceptable =>
            api.put_airAssessment(Cabin_Air_Care_Supervisor.AirAssessment.Acceptable)
          case Cabin_Air_Care_Supervisor.CabinAirQuality.Polluted =>
            api.put_airAssessment(Cabin_Air_Care_Supervisor.AirAssessment.FilterNeeded)
        }
    }
  }

  def finalise(api: AirQualityAssessor_Operational_Api): Unit = { }
}
