// #Sireum

package cabin_air_treatment_supervisor.Cabin_Air_Treatment_Supervisor

import org.sireum._
import cabin_air_treatment_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner {

  def initialise(api: HumidityQualificationOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_humidityAssessment(HumidityAssessment.Unknown)
  }

  def timeTriggered(api: HumidityQualificationOwner_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_HUM_01_QUALIFICATION
        (T) ___>: (api.humidityValidity == HumidityValidity.Invalid &
          api.humidityAssessment == HumidityAssessment.Unknown |
          api.humidityValidity == HumidityValidity.Valid &
            api.cabinHumidity == CabinHumidity.Damp &
            api.humidityAssessment == HumidityAssessment.DryingNeeded |
          api.humidityValidity == HumidityValidity.Valid &
            (api.cabinHumidity == CabinHumidity.Dry |
              api.cabinHumidity == CabinHumidity.Comfortable) &
            api.humidityAssessment == HumidityAssessment.NoExcessHumidity)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val assessment: HumidityAssessment.Type = (api.get_humidityValidity(), api.get_cabinHumidity()) match {
      case (Some(HumidityValidity.Valid), Some(CabinHumidity.Damp)) => HumidityAssessment.DryingNeeded
      case (Some(HumidityValidity.Valid), Some(CabinHumidity.Dry)) => HumidityAssessment.NoExcessHumidity
      case (Some(HumidityValidity.Valid), Some(CabinHumidity.Comfortable)) => HumidityAssessment.NoExcessHumidity
      case _ => HumidityAssessment.Unknown
    }
    api.put_humidityAssessment(assessment)
  }

  def finalise(api: HumidityQualificationOwner_Operational_Api): Unit = { }
}
