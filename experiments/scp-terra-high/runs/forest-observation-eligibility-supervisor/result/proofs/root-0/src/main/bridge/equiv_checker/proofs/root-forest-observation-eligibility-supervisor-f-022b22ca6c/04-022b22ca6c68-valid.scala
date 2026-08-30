// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_022b22ca6c68_4_Valid {
  @pure def check(
      eligibilitydecision: equiv_shared_0.Forest_Observation_Eligibility_Supervisor.EligibilityDecision.Type,
      gateoutcome: equiv_shared_0.Forest_Observation_Eligibility_Supervisor.GateOutcome.Type,
      observationauthorization: equiv_shared_0.Forest_Observation_Eligibility_Supervisor.ObservationAuthorization.Type,
      observationprogress: equiv_shared_0.Forest_Observation_Eligibility_Supervisor.ObservationProgress.Type,
      in_gatephase: equiv_shared_0.Forest_Observation_Eligibility_Supervisor.GatePhase.Type,
      gatephase: equiv_shared_0.Forest_Observation_Eligibility_Supervisor.GatePhase.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_GumboX.compute_CEP_Post(in_gatephase, gatephase, eligibilitydecision, observationprogress, gateoutcome, observationauthorization))) ___>: (equiv_shared_0.Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_Candidate_GumboX.compute_CEP_Post(in_gatephase, gatephase, eligibilitydecision, observationprogress, gateoutcome, observationauthorization))) & T))
  }
}
