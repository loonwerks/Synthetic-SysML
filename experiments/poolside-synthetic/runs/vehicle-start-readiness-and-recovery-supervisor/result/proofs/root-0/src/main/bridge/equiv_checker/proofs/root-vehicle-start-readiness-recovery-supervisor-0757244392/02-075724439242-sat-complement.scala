// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_075724439242_2_Complement {
  @pure def check(
      applied_lifecycle: equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.AppliedLifecycleSnapshot,
      authorization: equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationFacts,
      brake_facts: equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.BrakeFacts,
      cycle_assessment: equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.CycleAssessment.Type,
      health_qualification: equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualification.Type,
      power_facts: equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.PowerFacts,
      request_facts: equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.RequestFacts,
      test_cycle_directive: equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.TestCycleDirective.Type,
      in_lifecyclemodememory: equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleMode.Type,
      lifecyclemodememory: equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleMode.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_GumboX.compute_CEP_Post(in_lifecyclemodememory, lifecyclemodememory, authorization, brake_facts, cycle_assessment, health_qualification, power_facts, request_facts, applied_lifecycle, test_cycle_directive))) & T)))
  }
}
