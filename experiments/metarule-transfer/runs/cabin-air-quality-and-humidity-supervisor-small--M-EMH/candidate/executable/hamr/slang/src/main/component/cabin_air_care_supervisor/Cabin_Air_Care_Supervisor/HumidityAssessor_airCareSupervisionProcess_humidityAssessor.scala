// #Sireum

package cabin_air_care_supervisor.Cabin_Air_Care_Supervisor

import org.sireum._
import cabin_air_care_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object HumidityAssessor_airCareSupervisionProcess_humidityAssessor {

  def initialise(api: HumidityAssessor_Initialization_Api): Unit = {
    Contract(
      Modifies(api)
    )
    api.put_humidityAssessment(Cabin_Air_Care_Supervisor.HumidityAssessment.Unknown)
  }

  def timeTriggered(api: HumidityAssessor_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CC_04_INVALID_HUMIDITY
        (api.humidityValidity == HumidityValidity.Invalid) ___>: (api.humidityAssessment == HumidityAssessment.Unknown),
        // case CC_04_LOW_HUMIDITY
        (api.humidityValidity == HumidityValidity.Valid &
          api.cabinHumidityBand == CabinHumidityBand.Low) ___>: (api.humidityAssessment == HumidityAssessment.AddMoisture),
        // case CC_04_TARGET_HUMIDITY
        (api.humidityValidity == HumidityValidity.Valid &
          api.cabinHumidityBand == CabinHumidityBand.Target) ___>: (api.humidityAssessment == HumidityAssessment.AtTarget),
        // case CC_04_HIGH_HUMIDITY
        (api.humidityValidity == HumidityValidity.Valid &
          api.cabinHumidityBand == CabinHumidityBand.High) ___>: (api.humidityAssessment == HumidityAssessment.RemoveMoisture)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val humidity = api.get_cabinHumidityBand().get
    val validity = api.get_humidityValidity().get
    if (validity == HumidityValidity.Invalid) {
      api.put_humidityAssessment(HumidityAssessment.Unknown)
    } else if (humidity == CabinHumidityBand.Low) {
      api.put_humidityAssessment(HumidityAssessment.AddMoisture)
    } else if (humidity == CabinHumidityBand.Target) {
      api.put_humidityAssessment(HumidityAssessment.AtTarget)
    } else {
      api.put_humidityAssessment(HumidityAssessment.RemoveMoisture)
    }
  }

  def finalise(api: HumidityAssessor_Operational_Api): Unit = { }
}
