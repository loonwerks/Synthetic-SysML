// #Sireum

package scp_candidate.Cabin_Air_Treatment_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner {

  def initialise(api: FiltrationProposalOwner_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_AIR_PROPOSAL_SAFE
        api.airProposal == AirProposal.None
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_airProposal(Cabin_Air_Treatment_Supervisor.AirProposal.None)
  }

  def timeTriggered(api: FiltrationProposalOwner_Operational_Api): Unit = {
    Contract(
      Modifies(api)
    )
    val intent = api.get_requestIntent().get
    val assessment = api.get_airAssessment().get
    val readiness = api.get_treatmentReadiness().get
    if (intent == RequestIntent.None || intent == RequestIntent.BlockedInvalid ||
        intent == RequestIntent.BlockedRearm) {
      api.put_airProposal(AirProposal.None)
    } else if (intent == RequestIntent.FreshPurge || intent == RequestIntent.HeldPurge) {
      if (readiness == TreatmentReadiness.FilterOnly || readiness == TreatmentReadiness.BothReady) {
        api.put_airProposal(AirProposal.FilterIntensive)
      } else {
        api.put_airProposal(AirProposal.FilterUnavailable)
      }
    } else if (assessment == AirAssessment.Unknown) {
      api.put_airProposal(AirProposal.InvalidAirObservation)
    } else if (assessment == AirAssessment.Clear) {
      api.put_airProposal(AirProposal.None)
    } else if (readiness == TreatmentReadiness.FilterOnly || readiness == TreatmentReadiness.BothReady) {
      if (assessment == AirAssessment.FilterNormalNeeded) {
        api.put_airProposal(AirProposal.FilterNormal)
      } else {
        api.put_airProposal(AirProposal.FilterIntensive)
      }
    } else {
      api.put_airProposal(AirProposal.FilterUnavailable)
    }
  }

  def finalise(api: FiltrationProposalOwner_Operational_Api): Unit = { }
}
