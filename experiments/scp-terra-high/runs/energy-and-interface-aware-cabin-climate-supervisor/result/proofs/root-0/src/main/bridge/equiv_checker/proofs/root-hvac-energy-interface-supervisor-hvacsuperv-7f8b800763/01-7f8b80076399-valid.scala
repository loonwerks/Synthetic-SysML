// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_7f8b80076399_1_Valid {
  @pure def check(
      energycapability: equiv_shared_0.HVAC_Energy_Interface_Supervisor.EnergyCapability.Type,
      resourcegrant: equiv_shared_0.HVAC_Energy_Interface_Supervisor.ResourceGrant.Type,
      serviceselection: equiv_shared_0.HVAC_Energy_Interface_Supervisor.ServiceSelection): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
