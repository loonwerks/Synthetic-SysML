// #Sireum

package scp_candidate.Frigate_Threat_Response_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object ThreatQualification_threatResponseProcess_threatQualification {

  def initialise(api: ThreatQualification_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_QUALIFICATION
        api.qualifiedThreatToAlertOut.band == ThreatBand.CAUTION &
          api.qualifiedThreatToAlertOut.validity == ThreatValidity.UNUSABLE &
          api.threatValidityToDefenseOut == ThreatValidity.UNUSABLE &
          api.threatValidityToEscapeOut == ThreatValidity.UNUSABLE
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_qualifiedThreatToAlertOut(Frigate_Threat_Response_Coordinator.QualifiedThreat(ThreatBand.CAUTION, ThreatValidity.UNUSABLE))
    api.put_threatValidityToDefenseOut(ThreatValidity.UNUSABLE)
    api.put_threatValidityToEscapeOut(ThreatValidity.UNUSABLE)
  }

  def timeTriggered(api: ThreatQualification_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.get_threatEvidenceIn() match {
      case Some(evidence) =>
        var qualified: QualifiedThreat = QualifiedThreat(ThreatBand.HOSTILE, ThreatValidity.USABLE)
        if (evidence.evidenceStatus == EvidenceStatus.INVALID) {
          qualified = QualifiedThreat(ThreatBand.CAUTION, ThreatValidity.UNUSABLE)
        } else if (evidence.contactClass == ContactClass.NO_CONTACT) {
          qualified = QualifiedThreat(ThreatBand.CLEAR, ThreatValidity.USABLE)
        } else if (evidence.contactClass == ContactClass.UNCERTAIN) {
          qualified = QualifiedThreat(ThreatBand.CAUTION, ThreatValidity.USABLE)
        }
        api.put_qualifiedThreatToAlertOut(qualified)
        api.put_threatValidityToDefenseOut(qualified.validity)
        api.put_threatValidityToEscapeOut(qualified.validity)
    }
  }

  def finalise(api: ThreatQualification_Operational_Api): Unit = { }
}
