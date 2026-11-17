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
    val proposal: AirProposal.Type =
      (api.get_requestIntent(), api.get_airAssessment(), api.get_treatmentReadiness()) match {
        case (Some(RequestIntent.FreshPurge), _, Some(TreatmentReadiness.FilterOnly)) => AirProposal.FilterIntensive
        case (Some(RequestIntent.FreshPurge), _, Some(TreatmentReadiness.BothReady)) => AirProposal.FilterIntensive
        case (Some(RequestIntent.HeldPurge), _, Some(TreatmentReadiness.FilterOnly)) => AirProposal.FilterIntensive
        case (Some(RequestIntent.HeldPurge), _, Some(TreatmentReadiness.BothReady)) => AirProposal.FilterIntensive
        case (Some(RequestIntent.FreshPurge), _, _) => AirProposal.FilterUnavailable
        case (Some(RequestIntent.HeldPurge), _, _) => AirProposal.FilterUnavailable
        case (Some(RequestIntent.FreshAuto), Some(AirAssessment.Unknown), _) => AirProposal.InvalidAirObservation
        case (Some(RequestIntent.HeldAuto), Some(AirAssessment.Unknown), _) => AirProposal.InvalidAirObservation
        case (Some(RequestIntent.FreshAuto), Some(AirAssessment.FilterNormalNeeded), Some(TreatmentReadiness.FilterOnly)) => AirProposal.FilterNormal
        case (Some(RequestIntent.FreshAuto), Some(AirAssessment.FilterNormalNeeded), Some(TreatmentReadiness.BothReady)) => AirProposal.FilterNormal
        case (Some(RequestIntent.HeldAuto), Some(AirAssessment.FilterNormalNeeded), Some(TreatmentReadiness.FilterOnly)) => AirProposal.FilterNormal
        case (Some(RequestIntent.HeldAuto), Some(AirAssessment.FilterNormalNeeded), Some(TreatmentReadiness.BothReady)) => AirProposal.FilterNormal
        case (Some(RequestIntent.FreshAuto), Some(AirAssessment.FilterIntensiveNeeded), Some(TreatmentReadiness.FilterOnly)) => AirProposal.FilterIntensive
        case (Some(RequestIntent.FreshAuto), Some(AirAssessment.FilterIntensiveNeeded), Some(TreatmentReadiness.BothReady)) => AirProposal.FilterIntensive
        case (Some(RequestIntent.HeldAuto), Some(AirAssessment.FilterIntensiveNeeded), Some(TreatmentReadiness.FilterOnly)) => AirProposal.FilterIntensive
        case (Some(RequestIntent.HeldAuto), Some(AirAssessment.FilterIntensiveNeeded), Some(TreatmentReadiness.BothReady)) => AirProposal.FilterIntensive
        case (Some(RequestIntent.FreshAuto), Some(AirAssessment.FilterNormalNeeded), _) => AirProposal.FilterUnavailable
        case (Some(RequestIntent.HeldAuto), Some(AirAssessment.FilterNormalNeeded), _) => AirProposal.FilterUnavailable
        case (Some(RequestIntent.FreshAuto), Some(AirAssessment.FilterIntensiveNeeded), _) => AirProposal.FilterUnavailable
        case (Some(RequestIntent.HeldAuto), Some(AirAssessment.FilterIntensiveNeeded), _) => AirProposal.FilterUnavailable
        case _ => AirProposal.None
      }
    api.put_airProposal(proposal)
  }

  def finalise(api: FiltrationProposalOwner_Operational_Api): Unit = { }
}
