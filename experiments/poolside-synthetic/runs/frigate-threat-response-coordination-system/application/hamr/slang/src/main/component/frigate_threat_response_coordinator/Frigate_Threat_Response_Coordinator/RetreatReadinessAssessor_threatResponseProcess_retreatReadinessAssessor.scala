// #Sireum

package frigate_threat_response_coordinator.Frigate_Threat_Response_Coordinator

import org.sireum._
import frigate_threat_response_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor {

  def initialise(api: RetreatReadinessAssessor_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_retreatCondition(Frigate_Threat_Response_Coordinator.RetreatCondition.AVAILABLE)
  }

  def timeTriggered(api: RetreatReadinessAssessor_Operational_Api): Unit = {
    Contract(Modifies(api))
    val apiUsage_retreatNavigationEvidence: Option[Frigate_Threat_Response_Coordinator.RetreatNavigationEvidence] = api.get_retreatNavigationEvidence()

    val ev: Frigate_Threat_Response_Coordinator.RetreatNavigationEvidence = apiUsage_retreatNavigationEvidence.get

    // DERIVE_RETREAT_CONDITION
    var condition: Frigate_Threat_Response_Coordinator.RetreatCondition.Type = Frigate_Threat_Response_Coordinator.RetreatCondition.UNKNOWN

    if (ev.destinationStatus == Frigate_Threat_Response_Coordinator.DestinationEvidenceStatus.INVALID |
      ev.warpStatus == Frigate_Threat_Response_Coordinator.WarpProgressStatus.INVALID) {
      condition = Frigate_Threat_Response_Coordinator.RetreatCondition.UNKNOWN
    } else if (ev.destinationStatus == Frigate_Threat_Response_Coordinator.DestinationEvidenceStatus.VALID &
      ev.warpStatus == Frigate_Threat_Response_Coordinator.WarpProgressStatus.VALID &
      ev.warpProgress == Frigate_Threat_Response_Coordinator.WarpProgress.COMPLETE) {
      condition = Frigate_Threat_Response_Coordinator.RetreatCondition.COMPLETE
    } else if (ev.destinationStatus == Frigate_Threat_Response_Coordinator.DestinationEvidenceStatus.VALID &
      ev.warpStatus == Frigate_Threat_Response_Coordinator.WarpProgressStatus.VALID &
      ev.destination == Frigate_Threat_Response_Coordinator.DestinationStatus.IDENTIFIED &
      (ev.warpProgress == Frigate_Threat_Response_Coordinator.WarpProgress.READY |
        ev.warpProgress == Frigate_Threat_Response_Coordinator.WarpProgress.IN_PROGRESS)) {
      condition = Frigate_Threat_Response_Coordinator.RetreatCondition.AVAILABLE
    } else if (ev.destinationStatus == Frigate_Threat_Response_Coordinator.DestinationEvidenceStatus.VALID &
      ev.warpStatus == Frigate_Threat_Response_Coordinator.WarpProgressStatus.VALID &
      ev.warpProgress != Frigate_Threat_Response_Coordinator.WarpProgress.COMPLETE &
      (ev.destination == Frigate_Threat_Response_Coordinator.DestinationStatus.ABSENT |
        ev.warpProgress == Frigate_Threat_Response_Coordinator.WarpProgress.UNAVAILABLE)) {
      condition = Frigate_Threat_Response_Coordinator.RetreatCondition.UNAVAILABLE
    }

    api.put_retreatCondition(condition)
  }

  def finalise(api: RetreatReadinessAssessor_Operational_Api): Unit = { }
}
