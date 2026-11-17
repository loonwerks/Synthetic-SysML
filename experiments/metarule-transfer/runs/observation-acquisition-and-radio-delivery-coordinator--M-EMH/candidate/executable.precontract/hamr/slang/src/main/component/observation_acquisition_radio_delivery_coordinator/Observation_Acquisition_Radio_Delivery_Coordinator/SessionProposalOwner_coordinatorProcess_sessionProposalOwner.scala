// #Sireum

package observation_acquisition_radio_delivery_coordinator.Observation_Acquisition_Radio_Delivery_Coordinator

import org.sireum._
import observation_acquisition_radio_delivery_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object SessionProposalOwner_coordinatorProcess_sessionProposalOwner {

  def initialise(api: SessionProposalOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_sessionProposal(Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.BLOCK_EVIDENCE)
  }

  def timeTriggered(api: SessionProposalOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_sortieQualification: Option[Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.Type] = api.get_sortieQualification()
    api.logInfo(s"Received on data port sortieQualification: ${apiUsage_sortieQualification}")
    val apiUsage_cameraEvidence: Option[Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.Type] = api.get_cameraEvidence()
    api.logInfo(s"Received on data port cameraEvidence: ${apiUsage_cameraEvidence}")
    val apiUsage_radioEvidence: Option[Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.Type] = api.get_radioEvidence()
    api.logInfo(s"Received on data port radioEvidence: ${apiUsage_radioEvidence}")
    val apiUsage_sessionPhaseInput: Option[Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.Type] = api.get_sessionPhaseInput()
    api.logInfo(s"Received on data port sessionPhaseInput: ${apiUsage_sessionPhaseInput}")
  }

  def finalise(api: SessionProposalOwner_Operational_Api): Unit = { }
}
