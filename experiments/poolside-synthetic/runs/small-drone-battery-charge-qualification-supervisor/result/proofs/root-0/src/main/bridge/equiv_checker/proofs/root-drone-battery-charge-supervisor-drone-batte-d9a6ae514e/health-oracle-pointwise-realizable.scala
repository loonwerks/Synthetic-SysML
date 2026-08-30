// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_d9a6ae514ee1_Oracle_Pointwise_Realizable {
  @pure def check(
      charger_sample: equiv_shared_0.Drone_Battery_Charge_Supervisor.ChargerSample,
      flight_sample: equiv_shared_0.Drone_Battery_Charge_Supervisor.FlightActivitySample): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_GumboX.compute_CEP_Post(charger_sample, flight_sample, equiv_shared_0.Drone_Battery_Charge_Supervisor.ChargeContext.InvalidChargeContext)) |
        (equiv_shared_0.Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_GumboX.compute_CEP_Post(charger_sample, flight_sample, equiv_shared_0.Drone_Battery_Charge_Supervisor.ChargeContext.FlightActiveContext)) |
        (equiv_shared_0.Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_GumboX.compute_CEP_Post(charger_sample, flight_sample, equiv_shared_0.Drone_Battery_Charge_Supervisor.ChargeContext.AvailableInactiveContext)) |
        (equiv_shared_0.Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_GumboX.compute_CEP_Post(charger_sample, flight_sample, equiv_shared_0.Drone_Battery_Charge_Supervisor.ChargeContext.UnavailableInactiveContext)))))
  }
}
