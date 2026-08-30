// #Sireum

package scp_candidate.Cabin_Air_Care_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object HumidityAssessor_airCareSupervisionProcess_humidityAssessor {

  def initialise(api: HumidityAssessor_Initialization_Api): Unit = {
    Contract(
      Modifies(api)
    )
    api.put_humidityAssessment(HumidityAssessment.Unknown)
  }

  def timeTriggered(api: HumidityAssessor_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        HumidityAssessor_airCareSupervisionProcess_humidityAssessor_GumboX.compute_CEP_Post(
          api.cabinHumidityBand, api.humidityValidity, api.humidityAssessment)
      )
    )

    val band = api.get_cabinHumidityBand().get
    val validity = api.get_humidityValidity().get
    if (validity == HumidityValidity.Invalid) {
      api.put_humidityAssessment(HumidityAssessment.Unknown)
    } else if (band == CabinHumidityBand.Low) {
      api.put_humidityAssessment(HumidityAssessment.AddMoisture)
    } else if (band == CabinHumidityBand.Target) {
      api.put_humidityAssessment(HumidityAssessment.AtTarget)
    } else {
      api.put_humidityAssessment(HumidityAssessment.RemoveMoisture)
    }
  }

  def finalise(api: HumidityAssessor_Operational_Api): Unit = { }
}
