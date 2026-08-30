// #Sireum

package frigate_threat_response_coordinator.Frigate_Threat_Response_Coordinator

import org.sireum._
import frigate_threat_response_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor {

  def initialise(api: DefenseReadinessAssessor_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_defenseCondition(Frigate_Threat_Response_Coordinator.DefenseCondition.READY)
  }

  def timeTriggered(api: DefenseReadinessAssessor_Operational_Api): Unit = {
    Contract(Modifies(api))
    val apiUsage_defenseEvidence: Option[Frigate_Threat_Response_Coordinator.DefenseEvidence] = api.get_defenseEvidence()

    val ev: Frigate_Threat_Response_Coordinator.DefenseEvidence = apiUsage_defenseEvidence.get

    // DERIVE_DEFENSE_CONDITION
    var condition: Frigate_Threat_Response_Coordinator.DefenseCondition.Type = Frigate_Threat_Response_Coordinator.DefenseCondition.UNKNOWN

    if (ev.defenseStatus == Frigate_Threat_Response_Coordinator.DefenseAvailabilityStatus.VALID &
      ev.droneStatus == Frigate_Threat_Response_Coordinator.DroneReadinessStatus.VALID &
      ev.defenseAvailable == Frigate_Threat_Response_Coordinator.DefenseAvailability.AVAILABLE &
      ev.droneReadiness == Frigate_Threat_Response_Coordinator.DroneReadiness.READY) {
      condition = Frigate_Threat_Response_Coordinator.DefenseCondition.READY
    } else if (ev.defenseStatus == Frigate_Threat_Response_Coordinator.DefenseAvailabilityStatus.VALID &
      ev.droneStatus == Frigate_Threat_Response_Coordinator.DroneReadinessStatus.VALID &
      (ev.defenseAvailable == Frigate_Threat_Response_Coordinator.DefenseAvailability.UNAVAILABLE |
        ev.droneReadiness == Frigate_Threat_Response_Coordinator.DroneReadiness.NOT_READY)) {
      condition = Frigate_Threat_Response_Coordinator.DefenseCondition.UNAVAILABLE
    }

    api.put_defenseCondition(condition)
  }

  def finalise(api: DefenseReadinessAssessor_Operational_Api): Unit = { }
}
