// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_e689f683b5ee_4_Valid {
  @pure def check(
      eligibilitystatus: equiv_shared_0.Forest_Observation_Eligibility_Supervisor.EligibilityStatus.Type,
      energyticket: equiv_shared_0.Forest_Observation_Eligibility_Supervisor.EvaluationTicket.Type,
      gateoutcome: equiv_shared_0.Forest_Observation_Eligibility_Supervisor.GateOutcome.Type,
      requestcontext: equiv_shared_0.Forest_Observation_Eligibility_Supervisor.RequestContext.Type,
      requestinput: equiv_shared_0.Forest_Observation_Eligibility_Supervisor.RequestInput,
      supportticket: equiv_shared_0.Forest_Observation_Eligibility_Supervisor.EvaluationTicket.Type,
      lastacceptedtoken: equiv_shared_0.Forest_Observation_Eligibility_Supervisor.LastAcceptedToken.Type,
      requeststate: equiv_shared_0.Forest_Observation_Eligibility_Supervisor.RequestState.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_GumboX.inititialize_IEP_Post(lastacceptedtoken, requeststate, eligibilitystatus, energyticket, requestcontext, supportticket))) ___>: (equiv_shared_0.Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_Candidate_GumboX.inititialize_IEP_Post(lastacceptedtoken, requeststate, eligibilitystatus, energyticket, requestcontext, supportticket))) & T))
  }
}
