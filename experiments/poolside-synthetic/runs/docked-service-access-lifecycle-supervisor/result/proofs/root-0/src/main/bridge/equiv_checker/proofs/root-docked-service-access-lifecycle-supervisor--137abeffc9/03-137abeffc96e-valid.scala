// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_137abeffc96e_3_Valid {
  @pure def check(
      admitteddirective: equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.AdmittedDirective.Type,
      lifecycleprestate: equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.LifecycleState.Type,
      operationalassessment: equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.OperationalAssessment.Type,
      qualifiedintent: equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.QualifiedIntent.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
