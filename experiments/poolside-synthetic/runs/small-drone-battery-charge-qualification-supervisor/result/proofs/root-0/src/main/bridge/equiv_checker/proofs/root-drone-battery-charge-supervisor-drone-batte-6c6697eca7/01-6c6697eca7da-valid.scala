// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_6c6697eca7da_1_Valid {
  @pure def check(
      charge_context: equiv_shared_0.Drone_Battery_Charge_Supervisor.ChargeContext.Type,
      charger_sample: equiv_shared_0.Drone_Battery_Charge_Supervisor.ChargerSample,
      flight_sample: equiv_shared_0.Drone_Battery_Charge_Supervisor.FlightActivitySample): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
