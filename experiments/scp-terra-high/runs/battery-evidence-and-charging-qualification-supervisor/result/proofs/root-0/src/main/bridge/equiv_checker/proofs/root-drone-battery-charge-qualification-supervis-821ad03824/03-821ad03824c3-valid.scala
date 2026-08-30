// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_821ad03824c3_3_Valid {
  @pure def check(
      batteryfaultin: B,
      chargerfaultin: B,
      contextfaultin: B,
      faultstocomposition: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.FaultFacts,
      faultstonotification: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.FaultFacts,
      interfacefaultin: B,
      sessionconflictin: B): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
