// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_caecc05856d0_1_Valid {
  @pure def check(
      eligibilitystatus: equiv_shared_0.Forest_Observation_Eligibility_Supervisor.EligibilityStatus.Type,
      energyticket: equiv_shared_0.Forest_Observation_Eligibility_Supervisor.EvaluationTicket.Type,
      gateoutcome: equiv_shared_0.Forest_Observation_Eligibility_Supervisor.GateOutcome.Type,
      requestcontext: equiv_shared_0.Forest_Observation_Eligibility_Supervisor.RequestContext.Type,
      requestinput: equiv_shared_0.Forest_Observation_Eligibility_Supervisor.RequestInput,
      supportticket: equiv_shared_0.Forest_Observation_Eligibility_Supervisor.EvaluationTicket.Type,
      in_lastacceptedtoken: equiv_shared_0.Forest_Observation_Eligibility_Supervisor.LastAcceptedToken.Type,
      lastacceptedtoken: equiv_shared_0.Forest_Observation_Eligibility_Supervisor.LastAcceptedToken.Type,
      in_requeststate: equiv_shared_0.Forest_Observation_Eligibility_Supervisor.RequestState.Type,
      requeststate: equiv_shared_0.Forest_Observation_Eligibility_Supervisor.RequestState.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
