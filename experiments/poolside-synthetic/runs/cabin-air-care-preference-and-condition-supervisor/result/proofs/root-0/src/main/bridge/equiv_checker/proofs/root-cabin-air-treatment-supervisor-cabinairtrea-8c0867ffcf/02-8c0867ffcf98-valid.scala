// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_8c0867ffcf98_2_Valid {
  @pure def check(
      humidityassessment: equiv_shared_0.Cabin_Air_Treatment_Supervisor.HumidityAssessment.Type,
      humidityproposal: equiv_shared_0.Cabin_Air_Treatment_Supervisor.HumidityProposal.Type,
      requestintent: equiv_shared_0.Cabin_Air_Treatment_Supervisor.RequestIntent.Type,
      treatmentreadiness: equiv_shared_0.Cabin_Air_Treatment_Supervisor.TreatmentReadiness.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Cabin_Air_Treatment_Supervisor.HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_GumboX.compute_CEP_Post(humidityassessment, requestintent, treatmentreadiness, humidityproposal))) & T))
  }
}
