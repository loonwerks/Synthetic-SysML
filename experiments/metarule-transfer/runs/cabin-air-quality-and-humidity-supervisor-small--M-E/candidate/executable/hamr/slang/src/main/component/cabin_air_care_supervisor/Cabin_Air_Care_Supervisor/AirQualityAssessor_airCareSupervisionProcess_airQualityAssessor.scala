// #Sireum

package cabin_air_care_supervisor.Cabin_Air_Care_Supervisor

import org.sireum._
import cabin_air_care_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor {

  def initialise(api: AirQualityAssessor_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_airAssessment(AirAssessment.Unknown)
  }

  def timeTriggered(api: AirQualityAssessor_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CC_03_AIR_ASSESSMENT
        (T) ___>: ((api.airQualityValidity == AirQualityValidity.Invalid ___>:
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
    val quality = api.get_cabinAirQuality()
    val validity = api.get_airQualityValidity()

    (quality, validity) match {
      case (_, Some(AirQualityValidity.Invalid)) =>
        api.put_airAssessment(AirAssessment.Unknown)
      case (Some(CabinAirQuality.Acceptable), Some(AirQualityValidity.Valid)) =>
        api.put_airAssessment(AirAssessment.Acceptable)
      case (Some(CabinAirQuality.Polluted), Some(AirQualityValidity.Valid)) =>
        api.put_airAssessment(AirAssessment.FilterNeeded)
      case _ =>
        api.put_airAssessment(AirAssessment.Unknown)
    }
  }

  def finalise(api: AirQualityAssessor_Operational_Api): Unit = { }
}
