// #Sireum

package cabin_air_treatment_supervisor.Cabin_Air_Treatment_Supervisor

import org.sireum._
import cabin_air_treatment_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner {

  def initialise(api: HumidityQualificationOwner_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(T)
    )
    api.put_humidityAssessment(Cabin_Air_Treatment_Supervisor.HumidityAssessment.Unknown)
  }

  def timeTriggered(api: HumidityQualificationOwner_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_HUM_01_INVALID
        //   Invalid humidity observation is unknown
        (api.humidityValidity == Cabin_Air_Treatment_Supervisor.HumidityValidity.Invalid) ___>: (api.humidityAssessment == Cabin_Air_Treatment_Supervisor.HumidityAssessment.Unknown),
        // case CASE_HUM_01_DAMP
        //   Valid damp cabin needs drying
        (api.humidityValidity == Cabin_Air_Treatment_Supervisor.HumidityValidity.Valid &
          api.cabinHumidity == Cabin_Air_Treatment_Supervisor.CabinHumidity.Damp) ___>: (api.humidityAssessment == Cabin_Air_Treatment_Supervisor.HumidityAssessment.DryingNeeded),
        // case CASE_HUM_01_NO_EXCESS
        //   Valid dry or comfortable cabin needs no drying
        (api.humidityValidity == Cabin_Air_Treatment_Supervisor.HumidityValidity.Valid &
          (api.cabinHumidity == Cabin_Air_Treatment_Supervisor.CabinHumidity.Dry |
            api.cabinHumidity == Cabin_Air_Treatment_Supervisor.CabinHumidity.Comfortable)) ___>: (api.humidityAssessment == Cabin_Air_Treatment_Supervisor.HumidityAssessment.NoExcessHumidity)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    (api.get_humidityValidity(), api.get_cabinHumidity()) match {
      case (Some(Cabin_Air_Treatment_Supervisor.HumidityValidity.Valid),
            Some(Cabin_Air_Treatment_Supervisor.CabinHumidity.Damp)) =>
        api.put_humidityAssessment(Cabin_Air_Treatment_Supervisor.HumidityAssessment.DryingNeeded)
      case (Some(Cabin_Air_Treatment_Supervisor.HumidityValidity.Valid),
            Some(_)) =>
        api.put_humidityAssessment(Cabin_Air_Treatment_Supervisor.HumidityAssessment.NoExcessHumidity)
      case _ =>
        api.put_humidityAssessment(Cabin_Air_Treatment_Supervisor.HumidityAssessment.Unknown)
    }
  }

  def finalise(api: HumidityQualificationOwner_Operational_Api): Unit = { }
}
