// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_8c0867ffcf98_Candidate_Pointwise_Realizable {
  @pure def check(
      humidityassessment: equiv_shared_0.Cabin_Air_Treatment_Supervisor.HumidityAssessment.Type,
      requestintent: equiv_shared_0.Cabin_Air_Treatment_Supervisor.RequestIntent.Type,
      treatmentreadiness: equiv_shared_0.Cabin_Air_Treatment_Supervisor.TreatmentReadiness.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((T) |
        (T) |
        (T) |
        (T))))
  }
}
