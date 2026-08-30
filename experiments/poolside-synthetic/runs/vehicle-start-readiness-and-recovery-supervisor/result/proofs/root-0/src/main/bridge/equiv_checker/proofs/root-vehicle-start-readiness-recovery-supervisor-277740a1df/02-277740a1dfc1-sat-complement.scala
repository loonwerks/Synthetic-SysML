// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_277740a1dfc1_2_Complement {
  @pure def check(
      cycle_assessment: equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.CycleAssessment.Type,
      self_test_observation: equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestObservation.Type,
      test_cycle_directive: equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.TestCycleDirective.Type,
      in_committedtestcycle: equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.CommittedTestCycle.Type,
      committedtestcycle: equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.CommittedTestCycle.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_GumboX.compute_CEP_Post(in_committedtestcycle, committedtestcycle, self_test_observation, test_cycle_directive, cycle_assessment))) & T)))
  }
}
