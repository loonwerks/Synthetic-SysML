// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_cc315428655f_4_Valid {
  @pure def check(
      qualified_temperature: equiv_shared_0.Protected_Start_Power_Supervisor.QualifiedTemperature.Type,
      temperature_report: equiv_shared_0.Protected_Start_Power_Supervisor.TemperatureReport): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_GumboX.compute_CEP_Post(temperature_report, qualified_temperature))) ___>: (T)) & T))
  }
}
