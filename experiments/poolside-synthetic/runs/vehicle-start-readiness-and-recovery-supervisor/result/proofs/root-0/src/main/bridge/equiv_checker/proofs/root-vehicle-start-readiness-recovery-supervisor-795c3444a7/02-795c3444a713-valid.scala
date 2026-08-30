// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_795c3444a713_2_Valid {
  @pure def check(
      applied_lifecycle: equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.AppliedLifecycleSnapshot,
      authorization: equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationFacts,
      brake_facts: equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.BrakeFacts,
      cycle_assessment: equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.CycleAssessment.Type,
      health_qualification: equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualification.Type,
      power_facts: equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.PowerFacts,
      request_facts: equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.RequestFacts,
      test_cycle_directive: equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.TestCycleDirective.Type,
      lifecyclemodememory: equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleMode.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_GumboX.inititialize_IEP_Post(lifecyclemodememory, applied_lifecycle, test_cycle_directive))) & T))
  }
}
