// #Sireum

package cabin_air_treatment_supervisor.Cabin_Air_Treatment_Supervisor

import org.sireum._
import cabin_air_treatment_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner {

  def initialise(api: FiltrationProposalOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_airProposal(Cabin_Air_Treatment_Supervisor.AirProposal.None)
  }

  def timeTriggered(api: FiltrationProposalOwner_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_AIR_02_NONACTIONABLE
        (api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.None |
          api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.BlockedInvalid |
          api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.BlockedRearm) ___>: (api.airProposal == Cabin_Air_Treatment_Supervisor.AirProposal.None),
        // case CASE_AIR_02_PURGE_READY
        ((api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.FreshPurge |
          api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.HeldPurge) &
          (api.treatmentReadiness == Cabin_Air_Treatment_Supervisor.TreatmentReadiness.FilterOnly |
            api.treatmentReadiness == Cabin_Air_Treatment_Supervisor.TreatmentReadiness.BothReady)) ___>: (api.airProposal == Cabin_Air_Treatment_Supervisor.AirProposal.FilterIntensive),
        // case CASE_AIR_02_PURGE_UNAVAILABLE
        ((api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.FreshPurge |
          api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.HeldPurge) &
          api.treatmentReadiness != Cabin_Air_Treatment_Supervisor.TreatmentReadiness.FilterOnly &
          api.treatmentReadiness != Cabin_Air_Treatment_Supervisor.TreatmentReadiness.BothReady) ___>: (api.airProposal == Cabin_Air_Treatment_Supervisor.AirProposal.FilterUnavailable),
        // case CASE_AIR_02_AUTO_INVALID
        ((api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.FreshAuto |
          api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.HeldAuto) &
          api.airAssessment == Cabin_Air_Treatment_Supervisor.AirAssessment.Unknown) ___>: (api.airProposal == Cabin_Air_Treatment_Supervisor.AirProposal.InvalidAirObservation),
        // case CASE_AIR_02_AUTO_CLEAR
        ((api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.FreshAuto |
          api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.HeldAuto) &
          api.airAssessment == Cabin_Air_Treatment_Supervisor.AirAssessment.Clear) ___>: (api.airProposal == Cabin_Air_Treatment_Supervisor.AirProposal.None),
        // case CASE_AIR_02_AUTO_NORMAL_READY
        ((api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.FreshAuto |
          api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.HeldAuto) &
          api.airAssessment == Cabin_Air_Treatment_Supervisor.AirAssessment.FilterNormalNeeded &
          (api.treatmentReadiness == Cabin_Air_Treatment_Supervisor.TreatmentReadiness.FilterOnly |
            api.treatmentReadiness == Cabin_Air_Treatment_Supervisor.TreatmentReadiness.BothReady)) ___>: (api.airProposal == Cabin_Air_Treatment_Supervisor.AirProposal.FilterNormal),
        // case CASE_AIR_02_AUTO_INTENSIVE_READY
        ((api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.FreshAuto |
          api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.HeldAuto) &
          api.airAssessment == Cabin_Air_Treatment_Supervisor.AirAssessment.FilterIntensiveNeeded &
          (api.treatmentReadiness == Cabin_Air_Treatment_Supervisor.TreatmentReadiness.FilterOnly |
            api.treatmentReadiness == Cabin_Air_Treatment_Supervisor.TreatmentReadiness.BothReady)) ___>: (api.airProposal == Cabin_Air_Treatment_Supervisor.AirProposal.FilterIntensive),
        // case CASE_AIR_02_AUTO_UNAVAILABLE
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
      case (Some(i), Some(a), Some(r)) =>
        val ready = r == Cabin_Air_Treatment_Supervisor.TreatmentReadiness.FilterOnly | r == Cabin_Air_Treatment_Supervisor.TreatmentReadiness.BothReady
        if (i == Cabin_Air_Treatment_Supervisor.RequestIntent.FreshPurge | i == Cabin_Air_Treatment_Supervisor.RequestIntent.HeldPurge) {
          if (ready) {
            api.put_airProposal(Cabin_Air_Treatment_Supervisor.AirProposal.FilterIntensive)
          } else {
            api.put_airProposal(Cabin_Air_Treatment_Supervisor.AirProposal.FilterUnavailable)
          }
        } else if (i == Cabin_Air_Treatment_Supervisor.RequestIntent.FreshAuto | i == Cabin_Air_Treatment_Supervisor.RequestIntent.HeldAuto) {
          if (a == Cabin_Air_Treatment_Supervisor.AirAssessment.Unknown) {
            api.put_airProposal(Cabin_Air_Treatment_Supervisor.AirProposal.InvalidAirObservation)
          } else if (a == Cabin_Air_Treatment_Supervisor.AirAssessment.Clear) {
            api.put_airProposal(Cabin_Air_Treatment_Supervisor.AirProposal.None)
          } else if (!ready) {
            api.put_airProposal(Cabin_Air_Treatment_Supervisor.AirProposal.FilterUnavailable)
          } else if (a == Cabin_Air_Treatment_Supervisor.AirAssessment.FilterNormalNeeded) {
            api.put_airProposal(Cabin_Air_Treatment_Supervisor.AirProposal.FilterNormal)
          } else {
            api.put_airProposal(Cabin_Air_Treatment_Supervisor.AirProposal.FilterIntensive)
          }
        } else {
          api.put_airProposal(Cabin_Air_Treatment_Supervisor.AirProposal.None)
        }
      case _ => api.put_airProposal(Cabin_Air_Treatment_Supervisor.AirProposal.None)
    }
  }

  def finalise(api: FiltrationProposalOwner_Operational_Api): Unit = { }
}
