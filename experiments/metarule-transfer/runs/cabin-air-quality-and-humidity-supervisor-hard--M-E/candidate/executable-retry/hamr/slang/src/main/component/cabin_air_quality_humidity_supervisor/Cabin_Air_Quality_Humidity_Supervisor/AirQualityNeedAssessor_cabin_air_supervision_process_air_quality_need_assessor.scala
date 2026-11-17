// #Sireum

package cabin_air_quality_humidity_supervisor.Cabin_Air_Quality_Humidity_Supervisor

import org.sireum._
import cabin_air_quality_humidity_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor {

  def initialise(api: AirQualityNeedAssessor_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_evidence(AirEvidence.Invalid)
  }

  def timeTriggered(api: AirQualityNeedAssessor_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee AIR_EVIDENCE_CLASSIFICATION
        api.observation.validity == Validity.Invalid &
          api.evidence == AirEvidence.Invalid |
          api.observation.validity == Validity.Valid &
            api.observation.condition == AirCondition.Clean &
            api.evidence == AirEvidence.Clean |
          api.observation.validity == Validity.Valid &
            api.observation.condition == AirCondition.Loaded &
            api.evidence == AirEvidence.FilterDemand
        // END COMPUTE ENSURES timeTriggered
      )
    )
    api.get_observation() match {
      case Some(observation) =>
        if (observation.validity == Validity.Invalid) {
          api.put_evidence(AirEvidence.Invalid)
        } else if (observation.condition == AirCondition.Clean) {
          api.put_evidence(AirEvidence.Clean)
        } else {
          api.put_evidence(AirEvidence.FilterDemand)
        }
    }
  }

  def finalise(api: AirQualityNeedAssessor_Operational_Api): Unit = { }
}
