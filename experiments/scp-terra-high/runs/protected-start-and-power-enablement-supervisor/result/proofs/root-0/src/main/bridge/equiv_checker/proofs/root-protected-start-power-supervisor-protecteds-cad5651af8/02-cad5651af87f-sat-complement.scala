// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_cad5651af87f_2_Complement {
  @pure def check(
      qualified_temperature: equiv_shared_0.Protected_Start_Power_Supervisor.QualifiedTemperature.Type,
      thermal_fault: B,
      thermal_state_facts: equiv_shared_0.Protected_Start_Power_Supervisor.ThermalStateFacts,
      in_thermalmemory: equiv_shared_0.Protected_Start_Power_Supervisor.ThermalState.Type,
      thermalmemory: equiv_shared_0.Protected_Start_Power_Supervisor.ThermalState.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_GumboX.compute_CEP_Post(in_thermalmemory, thermalmemory, qualified_temperature, thermal_fault, thermal_state_facts))) & T)))
  }
}
