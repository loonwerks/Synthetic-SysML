// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_a8da942da549_1_Valid {
  @pure def check(
      chargeauthorizationout: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.ChargeAuthorization.Type,
      faultsin: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.FaultFacts,
      pilotstatusout: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.PilotStatus,
      publicfactsin: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.PublicDecisionFacts): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
