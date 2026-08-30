// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_81bce68077fb_2_Valid {
  @pure def check(
      command_fault: B,
      exact_fault_summary: equiv_shared_0.Protected_Start_Power_Supervisor.ExactFaultSummary,
      parking_brake_fault: B,
      pedal_fault: B,
      self_test_fault: B,
      supply_fault: B,
      thermal_fault: B): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_GumboX.compute_CEP_Post(command_fault, parking_brake_fault, pedal_fault, self_test_fault, supply_fault, thermal_fault, exact_fault_summary))) & T))
  }
}
