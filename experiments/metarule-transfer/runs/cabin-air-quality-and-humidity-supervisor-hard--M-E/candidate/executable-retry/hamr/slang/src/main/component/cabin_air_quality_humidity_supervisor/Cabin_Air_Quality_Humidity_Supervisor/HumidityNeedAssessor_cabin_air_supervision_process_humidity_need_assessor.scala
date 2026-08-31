// #Sireum

package cabin_air_quality_humidity_supervisor.Cabin_Air_Quality_Humidity_Supervisor

import org.sireum._
import cabin_air_quality_humidity_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor {

  def initialise(api: HumidityNeedAssessor_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_evidence(HumidityEvidence.Invalid)
  }

  def timeTriggered(api: HumidityNeedAssessor_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee HUMIDITY_EVIDENCE_CLASSIFICATION
        api.observation.validity == Validity.Invalid &
          api.evidence == HumidityEvidence.Invalid |
          api.observation.validity == Validity.Valid &
            api.observation.condition == HumidityCondition.Dry &
            api.evidence == HumidityEvidence.Dry |
          api.observation.validity == Validity.Valid &
            api.observation.condition == HumidityCondition.Acceptable &
            api.evidence == HumidityEvidence.None |
          api.observation.validity == Validity.Valid &
            api.observation.condition == HumidityCondition.Damp &
            api.evidence == HumidityEvidence.Damp
        // END COMPUTE ENSURES timeTriggered
      )
    )
    api.get_observation() match {
      case Some(observation) =>
        if (observation.validity == Validity.Invalid) {
          api.put_evidence(HumidityEvidence.Invalid)
        } else if (observation.condition == HumidityCondition.Dry) {
          api.put_evidence(HumidityEvidence.Dry)
        } else if (observation.condition == HumidityCondition.Damp) {
          api.put_evidence(HumidityEvidence.Damp)
        } else {
          api.put_evidence(HumidityEvidence.None)
        }
    }
  }

  def finalise(api: HumidityNeedAssessor_Operational_Api): Unit = { }
}
