// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_ed35b9ac27c6_1_Valid {
  @pure def check(
      cameraevidence: equiv_shared_0.Forest_Observation_Eligibility_Supervisor.CameraEvidence.Type,
      evaluationticket: equiv_shared_0.Forest_Observation_Eligibility_Supervisor.EvaluationTicket.Type,
      radioevidence: equiv_shared_0.Forest_Observation_Eligibility_Supervisor.RadioEvidence.Type,
      supportverdictout: equiv_shared_0.Forest_Observation_Eligibility_Supervisor.TaggedSupportVerdict): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
