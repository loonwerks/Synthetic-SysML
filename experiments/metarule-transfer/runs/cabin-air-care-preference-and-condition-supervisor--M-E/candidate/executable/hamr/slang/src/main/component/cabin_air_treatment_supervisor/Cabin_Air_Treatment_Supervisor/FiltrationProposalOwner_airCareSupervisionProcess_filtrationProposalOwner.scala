// #Sireum

package cabin_air_treatment_supervisor.Cabin_Air_Treatment_Supervisor

import org.sireum._
import cabin_air_treatment_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner {

  def initialise(api: FiltrationProposalOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_airProposal(AirProposal.None)
  }

  def timeTriggered(api: FiltrationProposalOwner_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_AIR_02_PROPOSAL_PARTITION
        (T) ___>: ((api.requestIntent == RequestIntent.None |
          api.requestIntent == RequestIntent.BlockedInvalid |
          api.requestIntent == RequestIntent.BlockedRearm) &
          api.airProposal == AirProposal.None |
          (api.requestIntent == RequestIntent.FreshPurge |
            api.requestIntent == RequestIntent.HeldPurge) &
            (api.treatmentReadiness == TreatmentReadiness.FilterOnly |
              api.treatmentReadiness == TreatmentReadiness.BothReady) &
            api.airProposal == AirProposal.FilterIntensive |
          (api.requestIntent == RequestIntent.FreshPurge |
            api.requestIntent == RequestIntent.HeldPurge) &
            api.treatmentReadiness != TreatmentReadiness.FilterOnly &
            api.treatmentReadiness != TreatmentReadiness.BothReady &
            api.airProposal == AirProposal.FilterUnavailable |
          (api.requestIntent == RequestIntent.FreshAuto |
            api.requestIntent == RequestIntent.HeldAuto) &
            api.airAssessment == AirAssessment.Unknown &
            api.airProposal == AirProposal.InvalidAirObservation |
          (api.requestIntent == RequestIntent.FreshAuto |
            api.requestIntent == RequestIntent.HeldAuto) &
            api.airAssessment == AirAssessment.Clear &
            api.airProposal == AirProposal.None |
          (api.requestIntent == RequestIntent.FreshAuto |
            api.requestIntent == RequestIntent.HeldAuto) &
            api.airAssessment == AirAssessment.FilterNormalNeeded &
            (api.treatmentReadiness == TreatmentReadiness.FilterOnly |
              api.treatmentReadiness == TreatmentReadiness.BothReady) &
            api.airProposal == AirProposal.FilterNormal |
          (api.requestIntent == RequestIntent.FreshAuto |
            api.requestIntent == RequestIntent.HeldAuto) &
            api.airAssessment == AirAssessment.FilterIntensiveNeeded &
            (api.treatmentReadiness == TreatmentReadiness.FilterOnly |
              api.treatmentReadiness == TreatmentReadiness.BothReady) &
            api.airProposal == AirProposal.FilterIntensive |
          (api.requestIntent == RequestIntent.FreshAuto |
            api.requestIntent == RequestIntent.HeldAuto) &
            (api.airAssessment == AirAssessment.FilterNormalNeeded |
              api.airAssessment == AirAssessment.FilterIntensiveNeeded) &
            api.treatmentReadiness != TreatmentReadiness.FilterOnly &
            api.treatmentReadiness != TreatmentReadiness.BothReady &
            api.airProposal == AirProposal.FilterUnavailable)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val intent = api.get_requestIntent().get
    val assessment = api.get_airAssessment().get
    val readiness = api.get_treatmentReadiness().get
    val filterReady = readiness == TreatmentReadiness.FilterOnly |
      readiness == TreatmentReadiness.BothReady

    if (intent == RequestIntent.None |
      intent == RequestIntent.BlockedInvalid |
      intent == RequestIntent.BlockedRearm) {
      api.put_airProposal(AirProposal.None)
    } else if (intent == RequestIntent.FreshPurge | intent == RequestIntent.HeldPurge) {
      if (filterReady) {
        api.put_airProposal(AirProposal.FilterIntensive)
      } else {
        api.put_airProposal(AirProposal.FilterUnavailable)
      }
    } else if (assessment == AirAssessment.Unknown) {
      api.put_airProposal(AirProposal.InvalidAirObservation)
    } else if (assessment == AirAssessment.Clear) {
      api.put_airProposal(AirProposal.None)
    } else if (filterReady & assessment == AirAssessment.FilterNormalNeeded) {
      api.put_airProposal(AirProposal.FilterNormal)
    } else if (filterReady) {
      api.put_airProposal(AirProposal.FilterIntensive)
    } else {
      api.put_airProposal(AirProposal.FilterUnavailable)
    }
  }

  def finalise(api: FiltrationProposalOwner_Operational_Api): Unit = { }
}
