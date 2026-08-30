// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_a735cb3e5bd5_1_Valid {
  @pure def check(
      cycle_assessment: equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.CycleAssessment.Type,
      self_test_observation: equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestObservation.Type,
      test_cycle_directive: equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.TestCycleDirective.Type,
      committedtestcycle: equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.CommittedTestCycle.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
