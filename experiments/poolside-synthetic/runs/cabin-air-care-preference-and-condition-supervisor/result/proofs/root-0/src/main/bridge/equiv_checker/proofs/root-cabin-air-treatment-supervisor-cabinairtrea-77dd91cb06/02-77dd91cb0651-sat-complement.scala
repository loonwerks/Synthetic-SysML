// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_77dd91cb0651_2_Complement {
  @pure def check(
      airassessment: equiv_shared_0.Cabin_Air_Treatment_Supervisor.AirAssessment.Type,
      airproposal: equiv_shared_0.Cabin_Air_Treatment_Supervisor.AirProposal.Type,
      requestintent: equiv_shared_0.Cabin_Air_Treatment_Supervisor.RequestIntent.Type,
      treatmentreadiness: equiv_shared_0.Cabin_Air_Treatment_Supervisor.TreatmentReadiness.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Cabin_Air_Treatment_Supervisor.FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_GumboX.compute_CEP_Post(airassessment, requestintent, treatmentreadiness, airproposal))) & T)))
  }
}
