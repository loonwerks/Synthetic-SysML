// #Sireum

package cabin_air_care_supervisor.Cabin_Air_Care_Supervisor

import org.sireum._
import cabin_air_care_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object HumidityAssessor_airCareSupervisionProcess_humidityAssessor {

  def initialise(api: HumidityAssessor_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_humidityAssessment(HumidityAssessment.Unknown)
  }

  def timeTriggered(api: HumidityAssessor_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CC_04_HUMIDITY_ASSESSMENT
        (T) ___>: ((api.humidityValidity == HumidityValidity.Invalid ___>:
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
    val band = api.get_cabinHumidityBand()
    val validity = api.get_humidityValidity()

    (band, validity) match {
      case (_, Some(HumidityValidity.Invalid)) =>
        api.put_humidityAssessment(HumidityAssessment.Unknown)
      case (Some(CabinHumidityBand.Low), Some(HumidityValidity.Valid)) =>
        api.put_humidityAssessment(HumidityAssessment.AddMoisture)
      case (Some(CabinHumidityBand.Target), Some(HumidityValidity.Valid)) =>
        api.put_humidityAssessment(HumidityAssessment.AtTarget)
      case (Some(CabinHumidityBand.High), Some(HumidityValidity.Valid)) =>
        api.put_humidityAssessment(HumidityAssessment.RemoveMoisture)
      case _ =>
        api.put_humidityAssessment(HumidityAssessment.Unknown)
    }
  }

  def finalise(api: HumidityAssessor_Operational_Api): Unit = { }
}
