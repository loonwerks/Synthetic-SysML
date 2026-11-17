// #Sireum

package hvac_visibility_priority_supervisor.HVAC_Visibility_Priority_Supervisor

import org.sireum._
import hvac_visibility_priority_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object VisibilityNeedAssessor_supervision_visibilityNeedAssessor {

  def initialise(api: VisibilityNeedAssessor_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_visibilityNeed(HVAC_Visibility_Priority_Supervisor.VisibilityNeed.Unavailable)
    api.put_visibilityFault(HVAC_Visibility_Priority_Supervisor.VisibilityCriticality.Present)
  }

  def timeTriggered(api: VisibilityNeedAssessor_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.get_glazingObservation() match {
      case Some(observation) if observation.validity == HVAC_Visibility_Priority_Supervisor.Validity.Valid =>
        val need: HVAC_Visibility_Priority_Supervisor.VisibilityNeed.Type = observation.condition match {
          case HVAC_Visibility_Priority_Supervisor.GlazingCondition.Clear =>
            HVAC_Visibility_Priority_Supervisor.VisibilityNeed.None
          case HVAC_Visibility_Priority_Supervisor.GlazingCondition.Misting =>
            HVAC_Visibility_Priority_Supervisor.VisibilityNeed.Preventive
          case _ => HVAC_Visibility_Priority_Supervisor.VisibilityNeed.Urgent
        }
        api.put_visibilityNeed(need)
        api.put_visibilityFault(HVAC_Visibility_Priority_Supervisor.VisibilityCriticality.Absent)
      case _ =>
        api.put_visibilityNeed(HVAC_Visibility_Priority_Supervisor.VisibilityNeed.Unavailable)
        api.put_visibilityFault(HVAC_Visibility_Priority_Supervisor.VisibilityCriticality.Present)
    }
  }

  def finalise(api: VisibilityNeedAssessor_Operational_Api): Unit = { }
}
