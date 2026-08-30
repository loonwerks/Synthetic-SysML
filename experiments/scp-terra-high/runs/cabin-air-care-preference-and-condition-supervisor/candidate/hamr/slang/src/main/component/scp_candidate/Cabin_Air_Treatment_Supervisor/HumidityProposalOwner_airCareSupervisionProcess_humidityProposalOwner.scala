// #Sireum

package scp_candidate.Cabin_Air_Treatment_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner {

  def initialise(api: HumidityProposalOwner_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_HUMIDITY_PROPOSAL_SAFE
        api.humidityProposal == HumidityProposal.None
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_humidityProposal(Cabin_Air_Treatment_Supervisor.HumidityProposal.None)
  }

  def timeTriggered(api: HumidityProposalOwner_Operational_Api): Unit = {
    Contract(
      Modifies(api)
    )
    val intent = api.get_requestIntent().get
    val assessment = api.get_humidityAssessment().get
    val readiness = api.get_treatmentReadiness().get
    if (intent != RequestIntent.FreshAuto && intent != RequestIntent.HeldAuto) {
      api.put_humidityProposal(HumidityProposal.None)
    } else if (assessment == HumidityAssessment.Unknown) {
      api.put_humidityProposal(HumidityProposal.InvalidHumidityObservation)
    } else if (assessment == HumidityAssessment.NoExcessHumidity) {
      api.put_humidityProposal(HumidityProposal.None)
    } else if (readiness == TreatmentReadiness.DryerOnly || readiness == TreatmentReadiness.BothReady) {
      api.put_humidityProposal(HumidityProposal.Dry)
    } else {
      api.put_humidityProposal(HumidityProposal.DryerUnavailable)
    }
  }

  def finalise(api: HumidityProposalOwner_Operational_Api): Unit = { }
}
