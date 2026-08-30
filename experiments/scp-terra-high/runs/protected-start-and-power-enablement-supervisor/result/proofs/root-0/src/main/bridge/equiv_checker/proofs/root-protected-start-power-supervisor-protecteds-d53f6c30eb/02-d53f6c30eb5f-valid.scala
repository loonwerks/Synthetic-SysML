// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_d53f6c30eb5f_2_Valid {
  @pure def check(
      qualified_temperature: equiv_shared_0.Protected_Start_Power_Supervisor.QualifiedTemperature.Type,
      temperature_report: equiv_shared_0.Protected_Start_Power_Supervisor.TemperatureReport): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_GumboX.inititialize_IEP_Post(qualified_temperature))) & T))
  }
}
