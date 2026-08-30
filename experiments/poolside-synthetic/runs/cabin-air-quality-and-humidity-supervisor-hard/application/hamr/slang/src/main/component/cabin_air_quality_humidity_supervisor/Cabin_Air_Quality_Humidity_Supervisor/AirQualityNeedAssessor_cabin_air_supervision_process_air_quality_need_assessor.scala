// #Sireum

package cabin_air_quality_humidity_supervisor.Cabin_Air_Quality_Humidity_Supervisor

import org.sireum._
import cabin_air_quality_humidity_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor {

  def initialise(api: AirQualityNeedAssessor_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        api.evidence == Cabin_Air_Quality_Humidity_Supervisor.AirEvidence.Invalid
      )
    )
    api.put_evidence(Cabin_Air_Quality_Humidity_Supervisor.AirEvidence.Invalid)
  }

  def timeTriggered(api: AirQualityNeedAssessor_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        api.evidence == AirEvidence.Invalid |
          api.evidence == AirEvidence.Clean |
          api.evidence == AirEvidence.FilterDemand
      )
    )

    val apiUsage_observation: Option[Cabin_Air_Quality_Humidity_Supervisor.AirQualityObservation] = api.get_observation()

    val evidence: Cabin_Air_Quality_Humidity_Supervisor.AirEvidence.Type = apiUsage_observation.get._ match {
      case Some(observation) =>
        if (observation.validity == Cabin_Air_Quality_Humidity_Supervisor.Validity.Invalid) {
          Cabin_Air_Quality_Humidity_Supervisor.AirEvidence.Invalid
        } else if (observation.condition == Cabin_Air_Quality_Humidity_Supervisor.AirCondition.Clean) {
          Cabin_Air_Quality_Humidity_Supervisor.AirEvidence.Clean
        } else {
          Cabin_Air_Quality_Humidity_Supervisor.AirEvidence.FilterDemand
        }
      case None() =>
        Cabin_Air_Quality_Humidity_Supervisor.AirEvidence.Invalid
    }

    api.put_evidence(evidence)
  }

  def finalise(api: AirQualityNeedAssessor_Operational_Api): Unit = { }
}
