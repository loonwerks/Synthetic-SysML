// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_d9a6ae514ee1_4_Valid {
  @pure def check(
      charge_context: equiv_shared_0.Drone_Battery_Charge_Supervisor.ChargeContext.Type,
      charger_sample: equiv_shared_0.Drone_Battery_Charge_Supervisor.ChargerSample,
      flight_sample: equiv_shared_0.Drone_Battery_Charge_Supervisor.FlightActivitySample): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_GumboX.compute_CEP_Post(charger_sample, flight_sample, charge_context))) ___>: (T)) & T))
  }
}
