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
        // case CC_03_AIR_ASSESSMENT
        //   Validity-qualified air observation is classified exhaustively | <N.md#CC_03_AIR_ASSESSMENT>
        (T) ___>: ((api.airQualityValidity == Cabin_Air_Care_Supervisor.AirQualityValidity.Invalid ___>:
          api.airAssessment == Cabin_Air_Care_Supervisor.AirAssessment.Unknown) &
          (api.airQualityValidity == Cabin_Air_Care_Supervisor.AirQualityValidity.Valid &
            api.cabinAirQuality == Cabin_Air_Care_Supervisor.CabinAirQuality.Acceptable ___>:
            api.airAssessment == Cabin_Air_Care_Supervisor.AirAssessment.Acceptable) &
          (api.airQualityValidity == Cabin_Air_Care_Supervisor.AirQualityValidity.Valid &
            api.cabinAirQuality == Cabin_Air_Care_Supervisor.CabinAirQuality.Polluted ___>:
            api.airAssessment == Cabin_Air_Care_Supervisor.AirAssessment.FilterNeeded))
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val quality = api.get_cabinAirQuality().get
    val validity = api.get_airQualityValidity().get

    if (validity == Cabin_Air_Care_Supervisor.AirQualityValidity.Invalid) {
      api.put_airAssessment(Cabin_Air_Care_Supervisor.AirAssessment.Unknown)
    } else if (quality == Cabin_Air_Care_Supervisor.CabinAirQuality.Acceptable) {
      api.put_airAssessment(Cabin_Air_Care_Supervisor.AirAssessment.Acceptable)
    } else {
      api.put_airAssessment(Cabin_Air_Care_Supervisor.AirAssessment.FilterNeeded)
    }
  }

  def finalise(api: AirQualityAssessor_Operational_Api): Unit = { }
}
