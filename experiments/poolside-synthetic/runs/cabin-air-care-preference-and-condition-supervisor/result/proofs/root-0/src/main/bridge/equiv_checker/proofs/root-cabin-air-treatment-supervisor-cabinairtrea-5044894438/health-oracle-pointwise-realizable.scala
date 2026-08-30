// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_5044894438f9_Oracle_Pointwise_Realizable {
  @pure def check(
      humidityassessment: equiv_shared_0.Cabin_Air_Treatment_Supervisor.HumidityAssessment.Type,
      requestintent: equiv_shared_0.Cabin_Air_Treatment_Supervisor.RequestIntent.Type,
      treatmentreadiness: equiv_shared_0.Cabin_Air_Treatment_Supervisor.TreatmentReadiness.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Cabin_Air_Treatment_Supervisor.HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_GumboX.inititialize_IEP_Post(equiv_shared_0.Cabin_Air_Treatment_Supervisor.HumidityProposal.None)) |
        (equiv_shared_0.Cabin_Air_Treatment_Supervisor.HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_GumboX.inititialize_IEP_Post(equiv_shared_0.Cabin_Air_Treatment_Supervisor.HumidityProposal.InvalidHumidityObservation)) |
        (equiv_shared_0.Cabin_Air_Treatment_Supervisor.HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_GumboX.inititialize_IEP_Post(equiv_shared_0.Cabin_Air_Treatment_Supervisor.HumidityProposal.DryerUnavailable)) |
        (equiv_shared_0.Cabin_Air_Treatment_Supervisor.HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_GumboX.inititialize_IEP_Post(equiv_shared_0.Cabin_Air_Treatment_Supervisor.HumidityProposal.Dry)))))
  }
}
