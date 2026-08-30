// #Sireum

package scp_candidate.EIT_Image_Availability_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object ArtifactLifecycle_coordination_artifact_lifecycle {

  def initialise(api: ArtifactLifecycle_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_artifactFrame(EIT_Image_Availability_Coordinator.ArtifactFrame.example())
  }

  def finalise(api: ArtifactLifecycle_Operational_Api): Unit = { }
  def timeTriggered(api: ArtifactLifecycle_Operational_Api): Unit = { Contract(Modifies(api)) }
}
