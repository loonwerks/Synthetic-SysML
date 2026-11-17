// #Sireum

package cabin_air_treatment_supervisor.Cabin_Air_Treatment_Supervisor

import org.sireum._
import cabin_air_treatment_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner {

  def initialise(api: HumidityProposalOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_humidityProposal(HumidityProposal.None)
  }

  def timeTriggered(api: HumidityProposalOwner_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_HUM_02_PROPOSAL_PARTITION
        (T) ___>: ((api.requestIntent == RequestIntent.None |
          api.requestIntent == RequestIntent.BlockedInvalid |
          api.requestIntent == RequestIntent.BlockedRearm |
          api.requestIntent == RequestIntent.FreshPurge |
          api.requestIntent == RequestIntent.HeldPurge) &
          api.humidityProposal == HumidityProposal.None |
          (api.requestIntent == RequestIntent.FreshAuto |
            api.requestIntent == RequestIntent.HeldAuto) &
            api.humidityAssessment == HumidityAssessment.Unknown &
            api.humidityProposal == HumidityProposal.InvalidHumidityObservation |
          (api.requestIntent == RequestIntent.FreshAuto |
            api.requestIntent == RequestIntent.HeldAuto) &
            api.humidityAssessment == HumidityAssessment.NoExcessHumidity &
            api.humidityProposal == HumidityProposal.None |
          (api.requestIntent == RequestIntent.FreshAuto |
            api.requestIntent == RequestIntent.HeldAuto) &
            api.humidityAssessment == HumidityAssessment.DryingNeeded &
            (api.treatmentReadiness == TreatmentReadiness.DryerOnly |
              api.treatmentReadiness == TreatmentReadiness.BothReady) &
            api.humidityProposal == HumidityProposal.Dry |
          (api.requestIntent == RequestIntent.FreshAuto |
            api.requestIntent == RequestIntent.HeldAuto) &
            api.humidityAssessment == HumidityAssessment.DryingNeeded &
            api.treatmentReadiness != TreatmentReadiness.DryerOnly &
            api.treatmentReadiness != TreatmentReadiness.BothReady &
            api.humidityProposal == HumidityProposal.DryerUnavailable)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val intent = api.get_requestIntent().get
    val assessment = api.get_humidityAssessment().get
    val readiness = api.get_treatmentReadiness().get
    val dryerReady = readiness == TreatmentReadiness.DryerOnly |
      readiness == TreatmentReadiness.BothReady

    if (intent != RequestIntent.FreshAuto & intent != RequestIntent.HeldAuto) {
      api.put_humidityProposal(HumidityProposal.None)
    } else if (assessment == HumidityAssessment.Unknown) {
      api.put_humidityProposal(HumidityProposal.InvalidHumidityObservation)
    } else if (assessment == HumidityAssessment.NoExcessHumidity) {
      api.put_humidityProposal(HumidityProposal.None)
    } else if (dryerReady) {
      api.put_humidityProposal(HumidityProposal.Dry)
    } else {
      api.put_humidityProposal(HumidityProposal.DryerUnavailable)
    }
  }

  def finalise(api: HumidityProposalOwner_Operational_Api): Unit = { }
}
