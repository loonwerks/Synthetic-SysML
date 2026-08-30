// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_5d5bfcfaf029_3_Valid {
  @pure def check(
      airassessment: equiv_shared_0.Cabin_Air_Treatment_Supervisor.AirAssessment.Type,
      airproposal: equiv_shared_0.Cabin_Air_Treatment_Supervisor.AirProposal.Type,
      requestintent: equiv_shared_0.Cabin_Air_Treatment_Supervisor.RequestIntent.Type,
      treatmentreadiness: equiv_shared_0.Cabin_Air_Treatment_Supervisor.TreatmentReadiness.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
