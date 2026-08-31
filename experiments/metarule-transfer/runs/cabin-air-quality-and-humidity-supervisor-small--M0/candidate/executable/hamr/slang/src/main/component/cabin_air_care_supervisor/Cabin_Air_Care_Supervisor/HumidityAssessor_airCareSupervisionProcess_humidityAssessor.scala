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
        // case CC_04_HUMIDITY_ASSESSMENT
        //   Validity-qualified humidity observation is classified exhaustively | <N.md#CC_04_HUMIDITY_ASSESSMENT>
        (T) ___>: ((api.humidityValidity == Cabin_Air_Care_Supervisor.HumidityValidity.Invalid ___>:
          api.humidityAssessment == Cabin_Air_Care_Supervisor.HumidityAssessment.Unknown) &
          (api.humidityValidity == Cabin_Air_Care_Supervisor.HumidityValidity.Valid &
            api.cabinHumidityBand == Cabin_Air_Care_Supervisor.CabinHumidityBand.Low ___>:
            api.humidityAssessment == Cabin_Air_Care_Supervisor.HumidityAssessment.AddMoisture) &
          (api.humidityValidity == Cabin_Air_Care_Supervisor.HumidityValidity.Valid &
            api.cabinHumidityBand == Cabin_Air_Care_Supervisor.CabinHumidityBand.Target ___>:
            api.humidityAssessment == Cabin_Air_Care_Supervisor.HumidityAssessment.AtTarget) &
          (api.humidityValidity == Cabin_Air_Care_Supervisor.HumidityValidity.Valid &
            api.cabinHumidityBand == Cabin_Air_Care_Supervisor.CabinHumidityBand.High ___>:
            api.humidityAssessment == Cabin_Air_Care_Supervisor.HumidityAssessment.RemoveMoisture))
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val humidity = api.get_cabinHumidityBand().get
    val validity = api.get_humidityValidity().get

    if (validity == Cabin_Air_Care_Supervisor.HumidityValidity.Invalid) {
      api.put_humidityAssessment(Cabin_Air_Care_Supervisor.HumidityAssessment.Unknown)
    } else if (humidity == Cabin_Air_Care_Supervisor.CabinHumidityBand.Low) {
      api.put_humidityAssessment(Cabin_Air_Care_Supervisor.HumidityAssessment.AddMoisture)
    } else if (humidity == Cabin_Air_Care_Supervisor.CabinHumidityBand.Target) {
      api.put_humidityAssessment(Cabin_Air_Care_Supervisor.HumidityAssessment.AtTarget)
    } else {
      api.put_humidityAssessment(Cabin_Air_Care_Supervisor.HumidityAssessment.RemoveMoisture)
    }
  }

  def finalise(api: HumidityAssessor_Operational_Api): Unit = { }
}
