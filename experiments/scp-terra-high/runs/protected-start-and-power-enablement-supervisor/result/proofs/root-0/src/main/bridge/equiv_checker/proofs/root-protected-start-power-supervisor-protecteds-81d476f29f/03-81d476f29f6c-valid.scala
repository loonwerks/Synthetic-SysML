// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_81d476f29f6c_3_Valid {
  @pure def check(
      qualified_temperature: equiv_shared_0.Protected_Start_Power_Supervisor.QualifiedTemperature.Type,
      thermal_fault: B,
      thermal_state_facts: equiv_shared_0.Protected_Start_Power_Supervisor.ThermalStateFacts,
      thermalmemory: equiv_shared_0.Protected_Start_Power_Supervisor.ThermalState.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
