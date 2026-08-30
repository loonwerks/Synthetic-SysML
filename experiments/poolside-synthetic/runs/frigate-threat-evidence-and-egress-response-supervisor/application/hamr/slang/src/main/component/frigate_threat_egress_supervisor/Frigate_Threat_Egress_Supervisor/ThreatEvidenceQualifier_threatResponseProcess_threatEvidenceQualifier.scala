// #Sireum

package frigate_threat_egress_supervisor.Frigate_Threat_Egress_Supervisor

import org.sireum._
import frigate_threat_egress_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier {

  def initialise(api: ThreatEvidenceQualifier_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // INIT_EVIDENCE_ASSESSMENT
        api.evidenceAssessment == Frigate_Threat_Egress_Supervisor.EvidenceAssessment.UNAVAILABLE
      )
    )
    api.put_evidenceAssessment(Frigate_Threat_Egress_Supervisor.EvidenceAssessment.UNAVAILABLE)
  }

  def timeTriggered(api: ThreatEvidenceQualifier_Operational_Api): Unit = {
    Contract(
      Requires(
        api.threatObservation.validity != ObservationValidity.INVALID |
          api.threatObservation.validity == ObservationValidity.VALID
      ),
      Modifies(api),
      Ensures(
        // CASE_01_INVALID_EVIDENCE
        (api.threatObservation.validity == ObservationValidity.INVALID) ___>:
          api.evidenceAssessment == Frigate_Threat_Egress_Supervisor.EvidenceAssessment.UNAVAILABLE,
        // CASE_02_VALID_CLEAR
        (api.threatObservation.validity == ObservationValidity.VALID &
          api.threatObservation.evidenceBand == EvidenceBand.CLEAR) ___>:
          api.evidenceAssessment == Frigate_Threat_Egress_Supervisor.EvidenceAssessment.CLEAR,
        // CASE_03_VALID_THREAT_BANDS: SUSPICIOUS
        (api.threatObservation.validity == ObservationValidity.VALID &
          api.threatObservation.evidenceBand == EvidenceBand.SUSPICIOUS) ___>:
          api.evidenceAssessment == Frigate_Threat_Egress_Supervisor.EvidenceAssessment.SUSPECT,
        // CASE_03_VALID_THREAT_BANDS: HOSTILE
        (api.threatObservation.validity == ObservationValidity.VALID &
          api.threatObservation.evidenceBand == EvidenceBand.HOSTILE) ___>:
          api.evidenceAssessment == Frigate_Threat_Egress_Supervisor.EvidenceAssessment.HOSTILE
      )
    )
    val observation: Frigate_Threat_Egress_Supervisor.ThreatObservation = api.get_threatObservation().get

    val assessment: Frigate_Threat_Egress_Supervisor.EvidenceAssessment.Type =
      if (observation.validity == ObservationValidity.INVALID) {
        Frigate_Threat_Egress_Supervisor.EvidenceAssessment.UNAVAILABLE
      } else if (observation.evidenceBand == EvidenceBand.CLEAR) {
        Frigate_Threat_Egress_Supervisor.EvidenceAssessment.CLEAR
      } else if (observation.evidenceBand == EvidenceBand.SUSPICIOUS) {
        Frigate_Threat_Egress_Supervisor.EvidenceAssessment.SUSPECT
      } else {
        Frigate_Threat_Egress_Supervisor.EvidenceAssessment.HOSTILE
      }

    api.put_evidenceAssessment(assessment)
  }

  def finalise(api: ThreatEvidenceQualifier_Operational_Api): Unit = { }
}
