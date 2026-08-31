// #Sireum

package cabin_air_treatment_supervisor.Cabin_Air_Treatment_Supervisor

import org.sireum._
import cabin_air_treatment_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner {

  def initialise(api: FiltrationProposalOwner_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(T)
    )
    api.put_airProposal(Cabin_Air_Treatment_Supervisor.AirProposal.None)
  }

  def timeTriggered(api: FiltrationProposalOwner_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_AIR_02_NONACTIONABLE
        //   Nonactionable intent makes no air proposal
        (api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.None |
          api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.BlockedInvalid |
          api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.BlockedRearm) ___>: (api.airProposal == Cabin_Air_Treatment_Supervisor.AirProposal.None),
        // case CASE_AIR_02_PURGE_READY
        //   Purge requests intensive filtration when ready
        ((api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.FreshPurge |
          api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.HeldPurge) &
          (api.treatmentReadiness == Cabin_Air_Treatment_Supervisor.TreatmentReadiness.FilterOnly |
            api.treatmentReadiness == Cabin_Air_Treatment_Supervisor.TreatmentReadiness.BothReady)) ___>: (api.airProposal == Cabin_Air_Treatment_Supervisor.AirProposal.FilterIntensive),
        // case CASE_AIR_02_PURGE_UNAVAILABLE
        //   Purge reports unavailable filtration
        ((api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.FreshPurge |
          api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.HeldPurge) &
          api.treatmentReadiness != Cabin_Air_Treatment_Supervisor.TreatmentReadiness.FilterOnly &
          api.treatmentReadiness != Cabin_Air_Treatment_Supervisor.TreatmentReadiness.BothReady) ___>: (api.airProposal == Cabin_Air_Treatment_Supervisor.AirProposal.FilterUnavailable),
        // case CASE_AIR_02_AUTO_INVALID
        //   Auto reports invalid air observation
        ((api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.FreshAuto |
          api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.HeldAuto) &
          api.airAssessment == Cabin_Air_Treatment_Supervisor.AirAssessment.Unknown) ___>: (api.airProposal == Cabin_Air_Treatment_Supervisor.AirProposal.InvalidAirObservation),
        // case CASE_AIR_02_AUTO_CLEAR
        //   Auto proposes no filtration for clear air
        ((api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.FreshAuto |
          api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.HeldAuto) &
          api.airAssessment == Cabin_Air_Treatment_Supervisor.AirAssessment.Clear) ___>: (api.airProposal == Cabin_Air_Treatment_Supervisor.AirProposal.None),
        // case CASE_AIR_02_AUTO_NORMAL
        //   Auto proposes normal filtration when ready
        ((api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.FreshAuto |
          api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.HeldAuto) &
          api.airAssessment == Cabin_Air_Treatment_Supervisor.AirAssessment.FilterNormalNeeded &
          (api.treatmentReadiness == Cabin_Air_Treatment_Supervisor.TreatmentReadiness.FilterOnly |
            api.treatmentReadiness == Cabin_Air_Treatment_Supervisor.TreatmentReadiness.BothReady)) ___>: (api.airProposal == Cabin_Air_Treatment_Supervisor.AirProposal.FilterNormal),
        // case CASE_AIR_02_AUTO_INTENSIVE
        //   Auto proposes intensive filtration when ready
        ((api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.FreshAuto |
          api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.HeldAuto) &
          api.airAssessment == Cabin_Air_Treatment_Supervisor.AirAssessment.FilterIntensiveNeeded &
          (api.treatmentReadiness == Cabin_Air_Treatment_Supervisor.TreatmentReadiness.FilterOnly |
            api.treatmentReadiness == Cabin_Air_Treatment_Supervisor.TreatmentReadiness.BothReady)) ___>: (api.airProposal == Cabin_Air_Treatment_Supervisor.AirProposal.FilterIntensive),
        // case CASE_AIR_02_AUTO_UNAVAILABLE
        //   Auto reports unavailable demanded filtration
        ((api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.FreshAuto |
          api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.HeldAuto) &
          (api.airAssessment == Cabin_Air_Treatment_Supervisor.AirAssessment.FilterNormalNeeded |
            api.airAssessment == Cabin_Air_Treatment_Supervisor.AirAssessment.FilterIntensiveNeeded) &
          api.treatmentReadiness != Cabin_Air_Treatment_Supervisor.TreatmentReadiness.FilterOnly &
          api.treatmentReadiness != Cabin_Air_Treatment_Supervisor.TreatmentReadiness.BothReady) ___>: (api.airProposal == Cabin_Air_Treatment_Supervisor.AirProposal.FilterUnavailable)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    (api.get_requestIntent(), api.get_airAssessment(), api.get_treatmentReadiness()) match {
      case (Some(Cabin_Air_Treatment_Supervisor.RequestIntent.FreshPurge), _, Some(readiness)) =>
        if (readiness == Cabin_Air_Treatment_Supervisor.TreatmentReadiness.FilterOnly |
            readiness == Cabin_Air_Treatment_Supervisor.TreatmentReadiness.BothReady) {
          api.put_airProposal(Cabin_Air_Treatment_Supervisor.AirProposal.FilterIntensive)
        } else {
          api.put_airProposal(Cabin_Air_Treatment_Supervisor.AirProposal.FilterUnavailable)
        }
      case (Some(Cabin_Air_Treatment_Supervisor.RequestIntent.HeldPurge), _, Some(readiness)) =>
        if (readiness == Cabin_Air_Treatment_Supervisor.TreatmentReadiness.FilterOnly |
            readiness == Cabin_Air_Treatment_Supervisor.TreatmentReadiness.BothReady) {
          api.put_airProposal(Cabin_Air_Treatment_Supervisor.AirProposal.FilterIntensive)
        } else {
          api.put_airProposal(Cabin_Air_Treatment_Supervisor.AirProposal.FilterUnavailable)
        }
      case (Some(Cabin_Air_Treatment_Supervisor.RequestIntent.FreshAuto), Some(assessment), Some(readiness)) =>
        if (assessment == Cabin_Air_Treatment_Supervisor.AirAssessment.Unknown) {
          api.put_airProposal(Cabin_Air_Treatment_Supervisor.AirProposal.InvalidAirObservation)
        } else if (assessment == Cabin_Air_Treatment_Supervisor.AirAssessment.Clear) {
          api.put_airProposal(Cabin_Air_Treatment_Supervisor.AirProposal.None)
        } else if (readiness == Cabin_Air_Treatment_Supervisor.TreatmentReadiness.FilterOnly |
                   readiness == Cabin_Air_Treatment_Supervisor.TreatmentReadiness.BothReady) {
          if (assessment == Cabin_Air_Treatment_Supervisor.AirAssessment.FilterNormalNeeded) {
            api.put_airProposal(Cabin_Air_Treatment_Supervisor.AirProposal.FilterNormal)
          } else {
            api.put_airProposal(Cabin_Air_Treatment_Supervisor.AirProposal.FilterIntensive)
          }
        } else {
          api.put_airProposal(Cabin_Air_Treatment_Supervisor.AirProposal.FilterUnavailable)
        }
      case (Some(Cabin_Air_Treatment_Supervisor.RequestIntent.HeldAuto), Some(assessment), Some(readiness)) =>
        if (assessment == Cabin_Air_Treatment_Supervisor.AirAssessment.Unknown) {
          api.put_airProposal(Cabin_Air_Treatment_Supervisor.AirProposal.InvalidAirObservation)
        } else if (assessment == Cabin_Air_Treatment_Supervisor.AirAssessment.Clear) {
          api.put_airProposal(Cabin_Air_Treatment_Supervisor.AirProposal.None)
        } else if (readiness == Cabin_Air_Treatment_Supervisor.TreatmentReadiness.FilterOnly |
                   readiness == Cabin_Air_Treatment_Supervisor.TreatmentReadiness.BothReady) {
          if (assessment == Cabin_Air_Treatment_Supervisor.AirAssessment.FilterNormalNeeded) {
            api.put_airProposal(Cabin_Air_Treatment_Supervisor.AirProposal.FilterNormal)
          } else {
            api.put_airProposal(Cabin_Air_Treatment_Supervisor.AirProposal.FilterIntensive)
          }
        } else {
          api.put_airProposal(Cabin_Air_Treatment_Supervisor.AirProposal.FilterUnavailable)
        }
      case _ =>
        api.put_airProposal(Cabin_Air_Treatment_Supervisor.AirProposal.None)
    }
  }

  def finalise(api: FiltrationProposalOwner_Operational_Api): Unit = { }
}
