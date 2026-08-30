// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_6c6697eca7da_2_Complement {
  @pure def check(
      charge_context: equiv_shared_0.Drone_Battery_Charge_Supervisor.ChargeContext.Type,
      charger_sample: equiv_shared_0.Drone_Battery_Charge_Supervisor.ChargerSample,
      flight_sample: equiv_shared_0.Drone_Battery_Charge_Supervisor.FlightActivitySample): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_GumboX.inititialize_IEP_Post(charge_context))) & T)))
  }
}
