// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_1aea65120e83_1_Valid {
  @pure def check(
      chargeactivity: equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.ChargeActivity.Type,
      chargerconnection: equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.ChargerConnection.Type,
      chargerpathqualification: equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
