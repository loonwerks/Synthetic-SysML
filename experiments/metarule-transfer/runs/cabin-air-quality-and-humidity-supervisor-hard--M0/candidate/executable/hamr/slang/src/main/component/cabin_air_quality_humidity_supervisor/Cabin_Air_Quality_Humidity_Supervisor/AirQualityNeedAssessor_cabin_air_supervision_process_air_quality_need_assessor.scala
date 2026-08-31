// #Sireum

package cabin_air_quality_humidity_supervisor.Cabin_Air_Quality_Humidity_Supervisor

import org.sireum._
import cabin_air_quality_humidity_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor {

  def initialise(api: AirQualityNeedAssessor_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_evidence(Cabin_Air_Quality_Humidity_Supervisor.AirEvidence.Invalid)
  }

  def timeTriggered(api: AirQualityNeedAssessor_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.get_observation() match {
      case Some(observation) =>
        val evidence: Cabin_Air_Quality_Humidity_Supervisor.AirEvidence.Type =
          if (observation.validity == Cabin_Air_Quality_Humidity_Supervisor.Validity.Invalid)
            Cabin_Air_Quality_Humidity_Supervisor.AirEvidence.Invalid
          else if (observation.condition == Cabin_Air_Quality_Humidity_Supervisor.AirCondition.Clean)
            Cabin_Air_Quality_Humidity_Supervisor.AirEvidence.Clean
          else Cabin_Air_Quality_Humidity_Supervisor.AirEvidence.FilterDemand
        api.put_evidence(evidence)
      case _ => api.put_evidence(Cabin_Air_Quality_Humidity_Supervisor.AirEvidence.Invalid)
    }
  }

  def finalise(api: AirQualityNeedAssessor_Operational_Api): Unit = { }
}
