// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_63d65ae56456_Oracle_Pointwise_Realizable {
  @pure def check(
      qualifiedrequest: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.QualifiedRequest.Type,
      serviceeligibility: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.ServiceEligibility.Type,
      sessionprestate: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.SessionState.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_GumboX.compute_CEP_Post(qualifiedrequest, serviceeligibility, sessionprestate, equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.AdmittedDirective.Hold)) |
        (equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_GumboX.compute_CEP_Post(qualifiedrequest, serviceeligibility, sessionprestate, equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.AdmittedDirective.Begin)) |
        (equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_GumboX.compute_CEP_Post(qualifiedrequest, serviceeligibility, sessionprestate, equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.AdmittedDirective.Cancel)) |
        (equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_GumboX.compute_CEP_Post(qualifiedrequest, serviceeligibility, sessionprestate, equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.AdmittedDirective.PreemptUndock)) |
        (equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_GumboX.compute_CEP_Post(qualifiedrequest, serviceeligibility, sessionprestate, equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.AdmittedDirective.PreemptService)) |
        (equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_GumboX.compute_CEP_Post(qualifiedrequest, serviceeligibility, sessionprestate, equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.AdmittedDirective.EnterRecovery)) |
        (equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_GumboX.compute_CEP_Post(qualifiedrequest, serviceeligibility, sessionprestate, equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.AdmittedDirective.Reset)) |
        (equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_GumboX.compute_CEP_Post(qualifiedrequest, serviceeligibility, sessionprestate, equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.AdmittedDirective.RejectEmpty)) |
        (equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_GumboX.compute_CEP_Post(qualifiedrequest, serviceeligibility, sessionprestate, equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.AdmittedDirective.RejectIneligible)))))
  }
}
