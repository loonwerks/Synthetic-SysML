// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_81d476f29f6c_2_Valid {
  @pure def check(
      qualified_temperature: equiv_shared_0.Protected_Start_Power_Supervisor.QualifiedTemperature.Type,
      thermal_fault: B,
      thermal_state_facts: equiv_shared_0.Protected_Start_Power_Supervisor.ThermalStateFacts,
      thermalmemory: equiv_shared_0.Protected_Start_Power_Supervisor.ThermalState.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_GumboX.inititialize_IEP_Post(thermalmemory, thermal_fault, thermal_state_facts))) & T))
  }
}
