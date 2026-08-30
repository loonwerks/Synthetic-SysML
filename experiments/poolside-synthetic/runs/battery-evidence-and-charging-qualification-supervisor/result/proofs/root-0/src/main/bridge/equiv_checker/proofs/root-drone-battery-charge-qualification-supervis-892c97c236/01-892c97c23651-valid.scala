// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_892c97c23651_1_Valid {
  @pure def check(
      attentionin: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.AttentionResolution,
      faultsin: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.FaultFacts,
      flightcontrolnoticeout: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.FlightControlNotice.Type,
      pilotnoticeout: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.PilotNotice.Type,
      sessionin: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.SessionResolution): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
