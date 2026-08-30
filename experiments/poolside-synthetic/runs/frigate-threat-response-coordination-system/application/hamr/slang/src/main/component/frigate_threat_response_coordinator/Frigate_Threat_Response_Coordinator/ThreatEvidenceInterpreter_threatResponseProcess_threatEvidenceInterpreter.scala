// #Sireum

package frigate_threat_response_coordinator.Frigate_Threat_Response_Coordinator

import org.sireum._
import frigate_threat_response_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter {

  def initialise(api: ThreatEvidenceInterpreter_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_qualifiedThreat(Frigate_Threat_Response_Coordinator.QualifiedThreat.CLEAR)
  }

  def timeTriggered(api: ThreatEvidenceInterpreter_Operational_Api): Unit = {
    Contract(Modifies(api))
    val apiUsage_contactEvidence: Option[Frigate_Threat_Response_Coordinator.ContactEvidence] = api.get_contactEvidence()
    val apiUsage_identificationEvidence: Option[Frigate_Threat_Response_Coordinator.IdentificationEvidence] = api.get_identificationEvidence()

    val ce: Frigate_Threat_Response_Coordinator.ContactEvidence = apiUsage_contactEvidence.get
    val ie: Frigate_Threat_Response_Coordinator.IdentificationEvidence = apiUsage_identificationEvidence.get

    // DERIVE_QUALIFIED_THREAT
    var qt: Frigate_Threat_Response_Coordinator.QualifiedThreat.Type = Frigate_Threat_Response_Coordinator.QualifiedThreat.UNKNOWN

    if (ce.signatureStatus == Frigate_Threat_Response_Coordinator.ContactSignatureStatus.INVALID |
      ie.identityStatus == Frigate_Threat_Response_Coordinator.IdentityStatus.INVALID |
      (ce.signature == Frigate_Threat_Response_Coordinator.ContactSignature.NONE &
        ie.identity == Frigate_Threat_Response_Coordinator.ContactIdentity.HOSTILE)) {
      qt = Frigate_Threat_Response_Coordinator.QualifiedThreat.UNKNOWN
    } else if (ce.signatureStatus == Frigate_Threat_Response_Coordinator.ContactSignatureStatus.VALID &
      ie.identityStatus == Frigate_Threat_Response_Coordinator.IdentityStatus.VALID &
      ce.signature == Frigate_Threat_Response_Coordinator.ContactSignature.CONTACT &
      ie.identity == Frigate_Threat_Response_Coordinator.ContactIdentity.HOSTILE) {
      qt = Frigate_Threat_Response_Coordinator.QualifiedThreat.HOSTILE
    } else if (ce.signatureStatus == Frigate_Threat_Response_Coordinator.ContactSignatureStatus.VALID &
      ie.identityStatus == Frigate_Threat_Response_Coordinator.IdentityStatus.VALID &
      ce.signature == Frigate_Threat_Response_Coordinator.ContactSignature.CONTACT &
      ie.identity == Frigate_Threat_Response_Coordinator.ContactIdentity.NO_HOSTILE) {
      qt = Frigate_Threat_Response_Coordinator.QualifiedThreat.SUSPECT
    } else if (ce.signatureStatus == Frigate_Threat_Response_Coordinator.ContactSignatureStatus.VALID &
      ie.identityStatus == Frigate_Threat_Response_Coordinator.IdentityStatus.VALID &
      ce.signature == Frigate_Threat_Response_Coordinator.ContactSignature.NONE &
      ie.identity == Frigate_Threat_Response_Coordinator.ContactIdentity.NO_HOSTILE) {
      qt = Frigate_Threat_Response_Coordinator.QualifiedThreat.CLEAR
    }

    api.put_qualifiedThreat(qt)
  }

  def finalise(api: ThreatEvidenceInterpreter_Operational_Api): Unit = { }
}
