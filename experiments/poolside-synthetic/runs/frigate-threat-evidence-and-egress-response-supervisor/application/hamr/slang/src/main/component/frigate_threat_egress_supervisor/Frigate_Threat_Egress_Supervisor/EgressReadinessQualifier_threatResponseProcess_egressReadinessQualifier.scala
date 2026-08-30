// #Sireum

package frigate_threat_egress_supervisor.Frigate_Threat_Egress_Supervisor

import org.sireum._
import frigate_threat_egress_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier {

  def initialise(api: EgressReadinessQualifier_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // INIT_EGRESS_QUALIFICATION
        api.egressQualification == Frigate_Threat_Egress_Supervisor.EgressQualification.INAPPLICABLE
      )
    )
    api.put_egressQualification(Frigate_Threat_Egress_Supervisor.EgressQualification.INAPPLICABLE)
  }

  def timeTriggered(api: EgressReadinessQualifier_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // CASE_11_EGRESS_INAPPLICABLE
        (api.evidenceAssessment != Frigate_Threat_Egress_Supervisor.EvidenceAssessment.HOSTILE) ___>:
          api.egressQualification == Frigate_Threat_Egress_Supervisor.EgressQualification.INAPPLICABLE,
        // CASE_12_ROUTE_UNKNOWN
        (api.evidenceAssessment == Frigate_Threat_Egress_Supervisor.EvidenceAssessment.HOSTILE &
          api.egressRoute == Frigate_Threat_Egress_Supervisor.EgressRouteObservation.UNKNOWN) ___>:
          api.egressQualification == Frigate_Threat_Egress_Supervisor.EgressQualification.ROUTE_UNKNOWN,
        // CASE_13_ROUTE_BLOCKED
        (api.evidenceAssessment == Frigate_Threat_Egress_Supervisor.EvidenceAssessment.HOSTILE &
          api.egressRoute == Frigate_Threat_Egress_Supervisor.EgressRouteObservation.BLOCKED) ___>:
          api.egressQualification == Frigate_Threat_Egress_Supervisor.EgressQualification.ROUTE_BLOCKED,
        // CASE_14_EGRESS_READY
        (api.evidenceAssessment == Frigate_Threat_Egress_Supervisor.EvidenceAssessment.HOSTILE &
          api.egressRoute == Frigate_Threat_Egress_Supervisor.EgressRouteObservation.AVAILABLE) ___>:
          api.egressQualification == Frigate_Threat_Egress_Supervisor.EgressQualification.READY
      )
    )
    val evidenceAssessment: Frigate_Threat_Egress_Supervisor.EvidenceAssessment.Type = api.get_evidenceAssessment().get
    val egressRoute: Frigate_Threat_Egress_Supervisor.EgressRouteObservation.Type = api.get_egressRoute().get

    val egressQualification: Frigate_Threat_Egress_Supervisor.EgressQualification.Type =
      if (evidenceAssessment != Frigate_Threat_Egress_Supervisor.EvidenceAssessment.HOSTILE) {
        Frigate_Threat_Egress_Supervisor.EgressQualification.INAPPLICABLE
      } else if (egressRoute == Frigate_Threat_Egress_Supervisor.EgressRouteObservation.UNKNOWN) {
        Frigate_Threat_Egress_Supervisor.EgressQualification.ROUTE_UNKNOWN
      } else if (egressRoute == Frigate_Threat_Egress_Supervisor.EgressRouteObservation.BLOCKED) {
        Frigate_Threat_Egress_Supervisor.EgressQualification.ROUTE_BLOCKED
      } else {
        Frigate_Threat_Egress_Supervisor.EgressQualification.READY
      }

    api.put_egressQualification(egressQualification)
  }

  def finalise(api: EgressReadinessQualifier_Operational_Api): Unit = { }
}
