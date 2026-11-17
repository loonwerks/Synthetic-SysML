// #Sireum

package navigation_obstacle_awareness_use_supervisor.Navigation_Obstacle_Awareness_Use_Supervisor

import org.sireum._
import navigation_obstacle_awareness_use_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier {

  def initialise(api: BarometricEvidenceQualifier_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_barometricAssessment(Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment.READY)
  }

  def timeTriggered(api: BarometricEvidenceQualifier_Operational_Api): Unit = {
    // example api usage

    val apiUsage_barometricEvidence: Option[Navigation_Obstacle_Awareness_Use_Supervisor.NavigationEvidence.Type] = api.get_barometricEvidence()
    api.logInfo(s"Received on data port barometricEvidence: ${apiUsage_barometricEvidence}")
  }

  def finalise(api: BarometricEvidenceQualifier_Operational_Api): Unit = { }
}
