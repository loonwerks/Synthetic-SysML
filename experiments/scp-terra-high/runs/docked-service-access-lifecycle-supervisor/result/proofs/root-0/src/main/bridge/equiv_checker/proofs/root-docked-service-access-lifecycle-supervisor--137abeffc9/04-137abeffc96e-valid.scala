// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_137abeffc96e_4_Valid {
  @pure def check(
      admitteddirective: equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.AdmittedDirective.Type,
      lifecycleprestate: equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.LifecycleState.Type,
      operationalassessment: equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.OperationalAssessment.Type,
      qualifiedintent: equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.QualifiedIntent.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_GumboX.compute_CEP_Post(lifecycleprestate, operationalassessment, qualifiedintent, admitteddirective))) ___>: (equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_Candidate_GumboX.compute_CEP_Post(lifecycleprestate, operationalassessment, qualifiedintent, admitteddirective))) & T))
  }
}
