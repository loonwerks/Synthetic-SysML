// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_5044894438f9_4_Valid {
  @pure def check(
      humidityassessment: equiv_shared_0.Cabin_Air_Treatment_Supervisor.HumidityAssessment.Type,
      humidityproposal: equiv_shared_0.Cabin_Air_Treatment_Supervisor.HumidityProposal.Type,
      requestintent: equiv_shared_0.Cabin_Air_Treatment_Supervisor.RequestIntent.Type,
      treatmentreadiness: equiv_shared_0.Cabin_Air_Treatment_Supervisor.TreatmentReadiness.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Cabin_Air_Treatment_Supervisor.HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_GumboX.inititialize_IEP_Post(humidityproposal))) ___>: (T)) & T))
  }
}
