// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_916fd1010fa2_4_Valid {
  @pure def check(
      cameraevidence: equiv_shared_0.Forest_Observation_Eligibility_Supervisor.CameraEvidence.Type,
      evaluationticket: equiv_shared_0.Forest_Observation_Eligibility_Supervisor.EvaluationTicket.Type,
      radioevidence: equiv_shared_0.Forest_Observation_Eligibility_Supervisor.RadioEvidence.Type,
      supportverdictout: equiv_shared_0.Forest_Observation_Eligibility_Supervisor.TaggedSupportVerdict): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_GumboX.compute_CEP_Post(cameraevidence, evaluationticket, radioevidence, supportverdictout))) ___>: (equiv_shared_0.Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_Candidate_GumboX.compute_CEP_Post(cameraevidence, evaluationticket, radioevidence, supportverdictout))) & T))
  }
}
