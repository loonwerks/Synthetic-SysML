// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_1aea65120e83_Oracle_Pointwise_Realizable {
  @pure def check(
      chargeactivity: equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.ChargeActivity.Type,
      chargerconnection: equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.ChargerConnection.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_GumboX.compute_CEP_Post(chargeactivity, chargerconnection, equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification.UNAVAILABLE)) |
        (equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_GumboX.compute_CEP_Post(chargeactivity, chargerconnection, equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification.READY)) |
        (equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_GumboX.compute_CEP_Post(chargeactivity, chargerconnection, equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification.ACTIVE)))))
  }
}
