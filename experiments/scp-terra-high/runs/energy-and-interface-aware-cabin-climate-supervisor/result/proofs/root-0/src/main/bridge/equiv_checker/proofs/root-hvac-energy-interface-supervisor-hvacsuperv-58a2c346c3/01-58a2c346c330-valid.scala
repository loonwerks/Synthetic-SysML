// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_58a2c346c330_1_Valid {
  @pure def check(
      energycapability: equiv_shared_0.HVAC_Energy_Interface_Supervisor.EnergyCapability.Type,
      energycontext: equiv_shared_0.HVAC_Energy_Interface_Supervisor.EnergyContext): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
