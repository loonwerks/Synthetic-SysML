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
    api.put_humidityAssessment(Cabin_Air_Care_Supervisor.HumidityAssessment.AddMoisture)
  }

  def timeTriggered(api: HumidityAssessor_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CC_04_HUMIDITY_ASSESSMENT
        //   Invalid yields Unknown; Low yields AddMoisture; Target yields AtTarget; High yields RemoveMoisture
        (api.humidityValidity == HumidityValidity.Invalid |
          api.humidityValidity == HumidityValidity.Valid &
            api.cabinHumidityBand == CabinHumidityBand.Low |
          api.humidityValidity == HumidityValidity.Valid &
            api.cabinHumidityBand == CabinHumidityBand.Target |
          api.humidityValidity == HumidityValidity.Valid &
            api.cabinHumidityBand == CabinHumidityBand.High) ___>: ((api.humidityValidity == HumidityValidity.Invalid ___>:
          api.humidityAssessment == HumidityAssessment.Unknown) &
          (api.humidityValidity == HumidityValidity.Valid &
            api.cabinHumidityBand == CabinHumidityBand.Low ___>:
            api.humidityAssessment == HumidityAssessment.AddMoisture) &
          (api.humidityValidity == HumidityValidity.Valid &
            api.cabinHumidityBand == CabinHumidityBand.Target ___>:
            api.humidityAssessment == HumidityAssessment.AtTarget) &
          (api.humidityValidity == HumidityValidity.Valid &
            api.cabinHumidityBand == CabinHumidityBand.High ___>:
            api.humidityAssessment == HumidityAssessment.RemoveMoisture))
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val humidityValidity: Cabin_Air_Care_Supervisor.HumidityValidity.Type = api.get_humidityValidity().get
    val cabinHumidityBand: Cabin_Air_Care_Supervisor.CabinHumidityBand.Type = api.get_cabinHumidityBand().get

    humidityValidity match {
      case Cabin_Air_Care_Supervisor.HumidityValidity.Invalid =>
        api.put_humidityAssessment(Cabin_Air_Care_Supervisor.HumidityAssessment.Unknown)
      case Cabin_Air_Care_Supervisor.HumidityValidity.Valid =>
        cabinHumidityBand match {
          case Cabin_Air_Care_Supervisor.CabinHumidityBand.Low =>
            api.put_humidityAssessment(Cabin_Air_Care_Supervisor.HumidityAssessment.AddMoisture)
          case Cabin_Air_Care_Supervisor.CabinHumidityBand.Target =>
            api.put_humidityAssessment(Cabin_Air_Care_Supervisor.HumidityAssessment.AtTarget)
          case Cabin_Air_Care_Supervisor.CabinHumidityBand.High =>
            api.put_humidityAssessment(Cabin_Air_Care_Supervisor.HumidityAssessment.RemoveMoisture)
        }
    }
  }

  def finalise(api: HumidityAssessor_Operational_Api): Unit = { }
}
