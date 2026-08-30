// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_1deab0e3d2cf_1_Valid {
  @pure def check(
      command_fault: B,
      exact_fault_summary: equiv_shared_0.Protected_Start_Power_Supervisor.ExactFaultSummary,
      parking_brake_fault: B,
      pedal_fault: B,
      self_test_fault: B,
      supply_fault: B,
      thermal_fault: B): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
