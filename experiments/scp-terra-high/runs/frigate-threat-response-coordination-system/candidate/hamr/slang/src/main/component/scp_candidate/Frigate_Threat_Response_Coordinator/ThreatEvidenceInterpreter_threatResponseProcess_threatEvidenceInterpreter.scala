// #Sireum

package scp_candidate.Frigate_Threat_Response_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter {

  def initialise(api: ThreatEvidenceInterpreter_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_qualifiedThreat(Frigate_Threat_Response_Coordinator.QualifiedThreat.UNKNOWN)
  }

  def timeTriggered(api: ThreatEvidenceInterpreter_Operational_Api): Unit = {
    Contract(Modifies(api))
    val contact: Frigate_Threat_Response_Coordinator.ContactEvidence = api.get_contactEvidence().get
    val identification: Frigate_Threat_Response_Coordinator.IdentificationEvidence = api.get_identificationEvidence().get
    val result: Frigate_Threat_Response_Coordinator.QualifiedThreat.Type =
      if (contact.signatureStatus == Frigate_Threat_Response_Coordinator.ContactSignatureStatus.INVALID ||
          identification.identityStatus == Frigate_Threat_Response_Coordinator.IdentityStatus.INVALID ||
          (contact.signature == Frigate_Threat_Response_Coordinator.ContactSignature.NONE &&
            identification.identity == Frigate_Threat_Response_Coordinator.ContactIdentity.HOSTILE)) {
        Frigate_Threat_Response_Coordinator.QualifiedThreat.UNKNOWN
      } else if (contact.signature == Frigate_Threat_Response_Coordinator.ContactSignature.CONTACT &&
                 identification.identity == Frigate_Threat_Response_Coordinator.ContactIdentity.HOSTILE) {
        Frigate_Threat_Response_Coordinator.QualifiedThreat.HOSTILE
      } else if (contact.signature == Frigate_Threat_Response_Coordinator.ContactSignature.CONTACT) {
        Frigate_Threat_Response_Coordinator.QualifiedThreat.SUSPECT
      } else {
        Frigate_Threat_Response_Coordinator.QualifiedThreat.CLEAR
    }
    api.put_qualifiedThreat(result)
  }

  def finalise(api: ThreatEvidenceInterpreter_Operational_Api): Unit = { }
}
