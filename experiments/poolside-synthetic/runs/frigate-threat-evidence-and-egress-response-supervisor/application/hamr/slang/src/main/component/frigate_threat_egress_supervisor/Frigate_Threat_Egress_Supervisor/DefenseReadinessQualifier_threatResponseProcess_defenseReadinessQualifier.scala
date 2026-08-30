// #Sireum

package frigate_threat_egress_supervisor.Frigate_Threat_Egress_Supervisor

import org.sireum._
import frigate_threat_egress_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier {

  def initialise(api: DefenseReadinessQualifier_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // INIT_DEFENSE_QUALIFICATION
        api.defenseQualification == Frigate_Threat_Egress_Supervisor.DefenseQualification.INAPPLICABLE
      )
    )
    api.put_defenseQualification(Frigate_Threat_Egress_Supervisor.DefenseQualification.INAPPLICABLE)
  }

  def timeTriggered(api: DefenseReadinessQualifier_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // CASE_07_DEFENSE_INAPPLICABLE
        (api.evidenceAssessment != Frigate_Threat_Egress_Supervisor.EvidenceAssessment.HOSTILE) ___>:
          api.defenseQualification == Frigate_Threat_Egress_Supervisor.DefenseQualification.INAPPLICABLE,
        // CASE_08_DEFENSE_UNAVAILABLE
        (api.evidenceAssessment == Frigate_Threat_Egress_Supervisor.EvidenceAssessment.HOSTILE &
          api.defenseSupport.defenseAvailability == Frigate_Threat_Egress_Supervisor.DefenseAvailability.UNAVAILABLE) ___>:
          api.defenseQualification == Frigate_Threat_Egress_Supervisor.DefenseQualification.BLOCKED_AVAILABILITY,
        // CASE_09_CAPACITOR_BLOCK
        (api.evidenceAssessment == Frigate_Threat_Egress_Supervisor.EvidenceAssessment.HOSTILE &
          api.defenseSupport.defenseAvailability == Frigate_Threat_Egress_Supervisor.DefenseAvailability.AVAILABLE &
          api.defenseSupport.capacitorSupport == Frigate_Threat_Egress_Supervisor.CapacitorSupport.INSUFFICIENT) ___>:
          api.defenseQualification == Frigate_Threat_Egress_Supervisor.DefenseQualification.BLOCKED_CAPACITOR,
        // CASE_10_DEFENSE_READY
        (api.evidenceAssessment == Frigate_Threat_Egress_Supervisor.EvidenceAssessment.HOSTILE &
          api.defenseSupport.defenseAvailability == Frigate_Threat_Egress_Supervisor.DefenseAvailability.AVAILABLE &
          api.defenseSupport.capacitorSupport == Frigate_Threat_Egress_Supervisor.CapacitorSupport.SUFFICIENT) ___>:
          api.defenseQualification == Frigate_Threat_Egress_Supervisor.DefenseQualification.READY
      )
    )
    val evidenceAssessment: Frigate_Threat_Egress_Supervisor.EvidenceAssessment.Type = api.get_evidenceAssessment().get
    val defenseSupport: Frigate_Threat_Egress_Supervisor.DefenseSupportObservation = api.get_defenseSupport().get

    val defenseQualification: Frigate_Threat_Egress_Supervisor.DefenseQualification.Type =
      if (evidenceAssessment != Frigate_Threat_Egress_Supervisor.EvidenceAssessment.HOSTILE) {
        Frigate_Threat_Egress_Supervisor.DefenseQualification.INAPPLICABLE
      } else if (defenseSupport.defenseAvailability == Frigate_Threat_Egress_Supervisor.DefenseAvailability.UNAVAILABLE) {
        Frigate_Threat_Egress_Supervisor.DefenseQualification.BLOCKED_AVAILABILITY
      } else if (defenseSupport.capacitorSupport == Frigate_Threat_Egress_Supervisor.CapacitorSupport.INSUFFICIENT) {
        Frigate_Threat_Egress_Supervisor.DefenseQualification.BLOCKED_CAPACITOR
      } else {
        Frigate_Threat_Egress_Supervisor.DefenseQualification.READY
      }

    api.put_defenseQualification(defenseQualification)
  }

  def finalise(api: DefenseReadinessQualifier_Operational_Api): Unit = { }
}
