// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_77dd91cb0651_Candidate_Pointwise_Realizable {
  @pure def check(
      airassessment: equiv_shared_0.Cabin_Air_Treatment_Supervisor.AirAssessment.Type,
      requestintent: equiv_shared_0.Cabin_Air_Treatment_Supervisor.RequestIntent.Type,
      treatmentreadiness: equiv_shared_0.Cabin_Air_Treatment_Supervisor.TreatmentReadiness.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Cabin_Air_Treatment_Supervisor.FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_Candidate_GumboX.compute_CEP_Post(airassessment, requestintent, treatmentreadiness, equiv_shared_0.Cabin_Air_Treatment_Supervisor.AirProposal.None)) |
        (equiv_shared_0.Cabin_Air_Treatment_Supervisor.FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_Candidate_GumboX.compute_CEP_Post(airassessment, requestintent, treatmentreadiness, equiv_shared_0.Cabin_Air_Treatment_Supervisor.AirProposal.InvalidAirObservation)) |
        (equiv_shared_0.Cabin_Air_Treatment_Supervisor.FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_Candidate_GumboX.compute_CEP_Post(airassessment, requestintent, treatmentreadiness, equiv_shared_0.Cabin_Air_Treatment_Supervisor.AirProposal.FilterUnavailable)) |
        (equiv_shared_0.Cabin_Air_Treatment_Supervisor.FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_Candidate_GumboX.compute_CEP_Post(airassessment, requestintent, treatmentreadiness, equiv_shared_0.Cabin_Air_Treatment_Supervisor.AirProposal.FilterNormal)) |
        (equiv_shared_0.Cabin_Air_Treatment_Supervisor.FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_Candidate_GumboX.compute_CEP_Post(airassessment, requestintent, treatmentreadiness, equiv_shared_0.Cabin_Air_Treatment_Supervisor.AirProposal.FilterIntensive)))))
  }
}
