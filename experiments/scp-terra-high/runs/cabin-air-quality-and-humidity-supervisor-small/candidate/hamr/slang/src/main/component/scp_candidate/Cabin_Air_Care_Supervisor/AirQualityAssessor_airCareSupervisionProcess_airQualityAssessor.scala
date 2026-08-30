// #Sireum

package scp_candidate.Cabin_Air_Care_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor {

  def initialise(api: AirQualityAssessor_Initialization_Api): Unit = {
    Contract(
      Modifies(api)
    )
    api.put_airAssessment(AirAssessment.Unknown)
  }

  def timeTriggered(api: AirQualityAssessor_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_GumboX.compute_CEP_Post(
          api.airQualityValidity, api.cabinAirQuality, api.airAssessment)
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
