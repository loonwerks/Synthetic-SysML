// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_63d65ae56456_2_Valid {
  @pure def check(
      admitteddirective: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.AdmittedDirective.Type,
      qualifiedrequest: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.QualifiedRequest.Type,
      serviceeligibility: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.ServiceEligibility.Type,
      sessionprestate: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.SessionState.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_Candidate_GumboX.compute_CEP_Post(qualifiedrequest, serviceeligibility, sessionprestate, admitteddirective))) ___>: (equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_GumboX.compute_CEP_Post(qualifiedrequest, serviceeligibility, sessionprestate, admitteddirective))) & T))
  }
}
