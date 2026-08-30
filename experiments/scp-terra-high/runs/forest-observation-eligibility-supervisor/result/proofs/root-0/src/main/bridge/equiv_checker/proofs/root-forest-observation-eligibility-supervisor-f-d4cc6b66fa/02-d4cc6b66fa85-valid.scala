// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_d4cc6b66fa85_2_Valid {
  @pure def check(
      eligibilitydecision: equiv_shared_0.Forest_Observation_Eligibility_Supervisor.EligibilityDecision.Type,
      gateoutcome: equiv_shared_0.Forest_Observation_Eligibility_Supervisor.GateOutcome.Type,
      observationauthorization: equiv_shared_0.Forest_Observation_Eligibility_Supervisor.ObservationAuthorization.Type,
      observationprogress: equiv_shared_0.Forest_Observation_Eligibility_Supervisor.ObservationProgress.Type,
      gatephase: equiv_shared_0.Forest_Observation_Eligibility_Supervisor.GatePhase.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_Candidate_GumboX.inititialize_IEP_Post(gatephase, gateoutcome, observationauthorization))) ___>: (equiv_shared_0.Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_GumboX.inititialize_IEP_Post(gatephase, gateoutcome, observationauthorization))) & T))
  }
}
