// #Sireum

package cabin_air_quality_humidity_supervisor.Cabin_Air_Quality_Humidity_Supervisor

import org.sireum._
import cabin_air_quality_humidity_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor {

  def initialise(api: HumidityNeedAssessor_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_evidence(Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidence.Invalid)
  }

  def timeTriggered(api: HumidityNeedAssessor_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.get_observation() match {
      case Some(observation) =>
        val result: Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidence.Type =
          if (observation.validity == Cabin_Air_Quality_Humidity_Supervisor.Validity.Invalid)
            Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidence.Invalid
          else if (observation.condition == Cabin_Air_Quality_Humidity_Supervisor.HumidityCondition.Dry)
            Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidence.Dry
          else if (observation.condition == Cabin_Air_Quality_Humidity_Supervisor.HumidityCondition.Damp)
            Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidence.Damp
          else Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidence.None
        api.put_evidence(result)
      case _ => api.put_evidence(Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidence.Invalid)
    }
  }

  def finalise(api: HumidityNeedAssessor_Operational_Api): Unit = { }
}
