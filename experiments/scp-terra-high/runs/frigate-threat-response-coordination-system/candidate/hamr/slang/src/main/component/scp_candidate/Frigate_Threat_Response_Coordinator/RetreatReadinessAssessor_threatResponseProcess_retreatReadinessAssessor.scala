// #Sireum

package scp_candidate.Frigate_Threat_Response_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor {

  def initialise(api: RetreatReadinessAssessor_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_retreatCondition(Frigate_Threat_Response_Coordinator.RetreatCondition.UNKNOWN)
  }

  def timeTriggered(api: RetreatReadinessAssessor_Operational_Api): Unit = {
    Contract(Modifies(api))
    val evidence: Frigate_Threat_Response_Coordinator.RetreatNavigationEvidence = api.get_retreatNavigationEvidence().get
    val result: Frigate_Threat_Response_Coordinator.RetreatCondition.Type =
      if (evidence.destinationStatus == Frigate_Threat_Response_Coordinator.DestinationEvidenceStatus.INVALID ||
          evidence.warpStatus == Frigate_Threat_Response_Coordinator.WarpProgressStatus.INVALID) {
        Frigate_Threat_Response_Coordinator.RetreatCondition.UNKNOWN
      } else if (evidence.warpProgress == Frigate_Threat_Response_Coordinator.WarpProgress.COMPLETE) {
        Frigate_Threat_Response_Coordinator.RetreatCondition.COMPLETE
      } else if (evidence.destination == Frigate_Threat_Response_Coordinator.DestinationStatus.IDENTIFIED &&
                 (evidence.warpProgress == Frigate_Threat_Response_Coordinator.WarpProgress.READY ||
                  evidence.warpProgress == Frigate_Threat_Response_Coordinator.WarpProgress.IN_PROGRESS)) {
        Frigate_Threat_Response_Coordinator.RetreatCondition.AVAILABLE
      } else {
        Frigate_Threat_Response_Coordinator.RetreatCondition.UNAVAILABLE
    }
    api.put_retreatCondition(result)
  }

  def finalise(api: RetreatReadinessAssessor_Operational_Api): Unit = { }
}
