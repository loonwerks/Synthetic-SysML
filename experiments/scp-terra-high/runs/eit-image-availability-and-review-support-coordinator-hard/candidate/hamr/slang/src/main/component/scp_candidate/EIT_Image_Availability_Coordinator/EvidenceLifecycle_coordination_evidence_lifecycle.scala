// #Sireum

package scp_candidate.EIT_Image_Availability_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object EvidenceLifecycle_coordination_evidence_lifecycle {

  def initialise(api: EvidenceLifecycle_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_evidenceFrame(EIT_Image_Availability_Coordinator.EvidenceFrame.example())
  }

  def finalise(api: EvidenceLifecycle_Operational_Api): Unit = { }
  def timeTriggered(api: EvidenceLifecycle_Operational_Api): Unit = { Contract(Modifies(api)) }
}
