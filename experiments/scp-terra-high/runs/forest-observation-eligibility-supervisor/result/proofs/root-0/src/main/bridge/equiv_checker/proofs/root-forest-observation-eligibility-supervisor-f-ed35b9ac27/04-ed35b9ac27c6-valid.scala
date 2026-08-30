// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_ed35b9ac27c6_4_Valid {
  @pure def check(
      cameraevidence: equiv_shared_0.Forest_Observation_Eligibility_Supervisor.CameraEvidence.Type,
      evaluationticket: equiv_shared_0.Forest_Observation_Eligibility_Supervisor.EvaluationTicket.Type,
      radioevidence: equiv_shared_0.Forest_Observation_Eligibility_Supervisor.RadioEvidence.Type,
      supportverdictout: equiv_shared_0.Forest_Observation_Eligibility_Supervisor.TaggedSupportVerdict): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_GumboX.inititialize_IEP_Post(supportverdictout))) ___>: (equiv_shared_0.Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_Candidate_GumboX.inititialize_IEP_Post(supportverdictout))) & T))
  }
}
