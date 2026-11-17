// #Sireum

package cabin_air_treatment_supervisor.Cabin_Air_Treatment_Supervisor

import org.sireum._
import cabin_air_treatment_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner {

  def initialise(api: FiltrationProposalOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_airProposal(Cabin_Air_Treatment_Supervisor.AirProposal.None)
  }

  def timeTriggered(api: FiltrationProposalOwner_Operational_Api): Unit = {
    Contract(
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
    // example api usage

    val apiUsage_requestIntent: Option[Cabin_Air_Treatment_Supervisor.RequestIntent.Type] = api.get_requestIntent()
    api.logInfo(s"Received on data port requestIntent: ${apiUsage_requestIntent}")
    val apiUsage_airAssessment: Option[Cabin_Air_Treatment_Supervisor.AirAssessment.Type] = api.get_airAssessment()
    api.logInfo(s"Received on data port airAssessment: ${apiUsage_airAssessment}")
    val apiUsage_treatmentReadiness: Option[Cabin_Air_Treatment_Supervisor.TreatmentReadiness.Type] = api.get_treatmentReadiness()
    api.logInfo(s"Received on data port treatmentReadiness: ${apiUsage_treatmentReadiness}")
  }

  def finalise(api: FiltrationProposalOwner_Operational_Api): Unit = { }
}
