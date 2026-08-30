// #Sireum

package scp_candidate.Frigate_Threat_Response_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor {

  def initialise(api: DefenseReadinessAssessor_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_defenseCondition(Frigate_Threat_Response_Coordinator.DefenseCondition.UNKNOWN)
  }

  def timeTriggered(api: DefenseReadinessAssessor_Operational_Api): Unit = {
    Contract(Modifies(api))
    val evidence: Frigate_Threat_Response_Coordinator.DefenseEvidence = api.get_defenseEvidence().get
    val result: Frigate_Threat_Response_Coordinator.DefenseCondition.Type =
      if (evidence.defenseStatus == Frigate_Threat_Response_Coordinator.DefenseAvailabilityStatus.INVALID ||
          evidence.droneStatus == Frigate_Threat_Response_Coordinator.DroneReadinessStatus.INVALID) {
        Frigate_Threat_Response_Coordinator.DefenseCondition.UNKNOWN
      } else if (evidence.defenseAvailable == Frigate_Threat_Response_Coordinator.DefenseAvailability.AVAILABLE &&
                 evidence.droneReadiness == Frigate_Threat_Response_Coordinator.DroneReadiness.READY) {
        Frigate_Threat_Response_Coordinator.DefenseCondition.READY
      } else {
        Frigate_Threat_Response_Coordinator.DefenseCondition.UNAVAILABLE
    }
    api.put_defenseCondition(result)
  }

  def finalise(api: DefenseReadinessAssessor_Operational_Api): Unit = { }
}
