// #Sireum

package hvac_visibility_priority_supervisor.HVAC_Visibility_Priority_Supervisor

import org.sireum._
import hvac_visibility_priority_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object AirQualityNeedAssessor_supervision_airQualityNeedAssessor {

  def initialise(api: AirQualityNeedAssessor_Initialization_Api): Unit = {
    api.put_airNeed(HVAC_Visibility_Priority_Supervisor.AirNeed.Unavailable)
  }

  def timeTriggered(api: AirQualityNeedAssessor_Operational_Api): Unit = {
    val need = api.get_airObservation() match {
      case Some(observation) if observation.validity == HVAC_Visibility_Priority_Supervisor.Validity.Valid &&
        observation.condition == HVAC_Visibility_Priority_Supervisor.AirCondition.Loaded =>
        HVAC_Visibility_Priority_Supervisor.AirNeed.Filter
      case Some(observation) if observation.validity == HVAC_Visibility_Priority_Supervisor.Validity.Valid =>
        HVAC_Visibility_Priority_Supervisor.AirNeed.None
      case _ => HVAC_Visibility_Priority_Supervisor.AirNeed.Unavailable
    }
    api.put_airNeed(need)
  }

  def finalise(api: AirQualityNeedAssessor_Operational_Api): Unit = { }
}
