// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_2a02f9e2bdbc_2_Complement {
  @pure def check(
      chargeactivity: equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.ChargeActivity.Type,
      chargerconnection: equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.ChargerConnection.Type,
      chargerpathqualification: equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification.Type): Unit = {
    Contract(Requires(!((((T) & (equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_Candidate_GumboX.inititialize_IEP_Post(chargeactivity, chargerconnection, chargerpathqualification))) ___>: (equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_GumboX.inititialize_IEP_Post(chargeactivity, chargerconnection, chargerpathqualification))) & T)))
  }
}
