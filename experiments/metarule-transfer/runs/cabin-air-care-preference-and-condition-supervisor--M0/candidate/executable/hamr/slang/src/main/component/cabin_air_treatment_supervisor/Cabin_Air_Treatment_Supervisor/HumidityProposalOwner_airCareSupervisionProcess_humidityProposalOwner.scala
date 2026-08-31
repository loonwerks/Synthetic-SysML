// #Sireum

package cabin_air_treatment_supervisor.Cabin_Air_Treatment_Supervisor

import org.sireum._
import cabin_air_treatment_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner {

  def initialise(api: HumidityProposalOwner_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(T)
    )
    api.put_humidityProposal(Cabin_Air_Treatment_Supervisor.HumidityProposal.None)
  }

  def timeTriggered(api: HumidityProposalOwner_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_HUM_02_NONAUTO
        //   Only automatic intent may propose drying
        (api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.None |
          api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.BlockedInvalid |
          api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.BlockedRearm |
          api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.FreshPurge |
          api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.HeldPurge) ___>: (api.humidityProposal == Cabin_Air_Treatment_Supervisor.HumidityProposal.None),
        // case CASE_HUM_02_INVALID
        //   Auto reports invalid humidity observation
        ((api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.FreshAuto |
          api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.HeldAuto) &
          api.humidityAssessment == Cabin_Air_Treatment_Supervisor.HumidityAssessment.Unknown) ___>: (api.humidityProposal == Cabin_Air_Treatment_Supervisor.HumidityProposal.InvalidHumidityObservation),
        // case CASE_HUM_02_NO_EXCESS
        //   No excess humidity proposes nothing
        ((api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.FreshAuto |
          api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.HeldAuto) &
          api.humidityAssessment == Cabin_Air_Treatment_Supervisor.HumidityAssessment.NoExcessHumidity) ___>: (api.humidityProposal == Cabin_Air_Treatment_Supervisor.HumidityProposal.None),
        // case CASE_HUM_02_DRY_READY
        //   Excess humidity proposes drying when ready
        ((api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.FreshAuto |
          api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.HeldAuto) &
          api.humidityAssessment == Cabin_Air_Treatment_Supervisor.HumidityAssessment.DryingNeeded &
          (api.treatmentReadiness == Cabin_Air_Treatment_Supervisor.TreatmentReadiness.DryerOnly |
            api.treatmentReadiness == Cabin_Air_Treatment_Supervisor.TreatmentReadiness.BothReady)) ___>: (api.humidityProposal == Cabin_Air_Treatment_Supervisor.HumidityProposal.Dry),
        // case CASE_HUM_02_DRY_UNAVAILABLE
        //   Excess humidity reports unavailable dryer
        ((api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.FreshAuto |
          api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.HeldAuto) &
          api.humidityAssessment == Cabin_Air_Treatment_Supervisor.HumidityAssessment.DryingNeeded &
          api.treatmentReadiness != Cabin_Air_Treatment_Supervisor.TreatmentReadiness.DryerOnly &
          api.treatmentReadiness != Cabin_Air_Treatment_Supervisor.TreatmentReadiness.BothReady) ___>: (api.humidityProposal == Cabin_Air_Treatment_Supervisor.HumidityProposal.DryerUnavailable)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    (api.get_requestIntent(), api.get_humidityAssessment(), api.get_treatmentReadiness()) match {
      case (Some(Cabin_Air_Treatment_Supervisor.RequestIntent.FreshAuto),
            Some(Cabin_Air_Treatment_Supervisor.HumidityAssessment.Unknown), _) =>
        api.put_humidityProposal(Cabin_Air_Treatment_Supervisor.HumidityProposal.InvalidHumidityObservation)
      case (Some(Cabin_Air_Treatment_Supervisor.RequestIntent.HeldAuto),
            Some(Cabin_Air_Treatment_Supervisor.HumidityAssessment.Unknown), _) =>
        api.put_humidityProposal(Cabin_Air_Treatment_Supervisor.HumidityProposal.InvalidHumidityObservation)
      case (Some(Cabin_Air_Treatment_Supervisor.RequestIntent.FreshAuto),
            Some(Cabin_Air_Treatment_Supervisor.HumidityAssessment.DryingNeeded), Some(readiness)) =>
        if (readiness == Cabin_Air_Treatment_Supervisor.TreatmentReadiness.DryerOnly |
            readiness == Cabin_Air_Treatment_Supervisor.TreatmentReadiness.BothReady) {
          api.put_humidityProposal(Cabin_Air_Treatment_Supervisor.HumidityProposal.Dry)
        } else {
          api.put_humidityProposal(Cabin_Air_Treatment_Supervisor.HumidityProposal.DryerUnavailable)
        }
      case (Some(Cabin_Air_Treatment_Supervisor.RequestIntent.HeldAuto),
            Some(Cabin_Air_Treatment_Supervisor.HumidityAssessment.DryingNeeded), Some(readiness)) =>
        if (readiness == Cabin_Air_Treatment_Supervisor.TreatmentReadiness.DryerOnly |
            readiness == Cabin_Air_Treatment_Supervisor.TreatmentReadiness.BothReady) {
          api.put_humidityProposal(Cabin_Air_Treatment_Supervisor.HumidityProposal.Dry)
        } else {
          api.put_humidityProposal(Cabin_Air_Treatment_Supervisor.HumidityProposal.DryerUnavailable)
        }
      case _ =>
        api.put_humidityProposal(Cabin_Air_Treatment_Supervisor.HumidityProposal.None)
    }
  }

  def finalise(api: HumidityProposalOwner_Operational_Api): Unit = { }
}
