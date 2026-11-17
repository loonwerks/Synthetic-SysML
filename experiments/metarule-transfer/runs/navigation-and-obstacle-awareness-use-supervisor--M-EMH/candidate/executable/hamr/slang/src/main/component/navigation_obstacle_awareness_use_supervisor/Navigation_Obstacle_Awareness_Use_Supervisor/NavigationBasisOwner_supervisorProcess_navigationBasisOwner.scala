// #Sireum

package navigation_obstacle_awareness_use_supervisor.Navigation_Obstacle_Awareness_Use_Supervisor

import org.sireum._
import navigation_obstacle_awareness_use_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object NavigationBasisOwner_supervisorProcess_navigationBasisOwner {

  def initialise(api: NavigationBasisOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_proposalBasis(Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasis.FULL_BASIS)
    api.put_outcomeBasis(Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasis.FULL_BASIS)
  }

  def timeTriggered(api: NavigationBasisOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_gpsAssessment: Option[Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment.Type] = api.get_gpsAssessment()
    api.logInfo(s"Received on data port gpsAssessment: ${apiUsage_gpsAssessment}")
    val apiUsage_inertialAssessment: Option[Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment.Type] = api.get_inertialAssessment()
    api.logInfo(s"Received on data port inertialAssessment: ${apiUsage_inertialAssessment}")
    val apiUsage_barometricAssessment: Option[Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment.Type] = api.get_barometricAssessment()
    api.logInfo(s"Received on data port barometricAssessment: ${apiUsage_barometricAssessment}")
  }

  def finalise(api: NavigationBasisOwner_Operational_Api): Unit = { }
}
