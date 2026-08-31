// #Sireum

package hvac_visibility_priority_supervisor.HVAC_Visibility_Priority_Supervisor

import org.sireum._
import hvac_visibility_priority_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object HumidityNeedAssessor_supervision_humidityNeedAssessor {

  def initialise(api: HumidityNeedAssessor_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_humidityNeed(HVAC_Visibility_Priority_Supervisor.HumidityNeed.Unavailable)
  }

  def timeTriggered(api: HumidityNeedAssessor_Operational_Api): Unit = {
    Contract(Modifies(api))
    val need: HVAC_Visibility_Priority_Supervisor.HumidityNeed.Type = api.get_humidityObservation() match {
      case Some(observation) if observation.validity == HVAC_Visibility_Priority_Supervisor.Validity.Valid &&
        observation.condition == HVAC_Visibility_Priority_Supervisor.HumidityCondition.Damp =>
        HVAC_Visibility_Priority_Supervisor.HumidityNeed.Dry
      case Some(observation) if observation.validity == HVAC_Visibility_Priority_Supervisor.Validity.Valid =>
        HVAC_Visibility_Priority_Supervisor.HumidityNeed.None
      case _ => HVAC_Visibility_Priority_Supervisor.HumidityNeed.Unavailable
    }
    api.put_humidityNeed(need)
  }

  def finalise(api: HumidityNeedAssessor_Operational_Api): Unit = { }
}
