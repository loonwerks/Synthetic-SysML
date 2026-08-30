// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_2a02f9e2bdbc_Candidate_Pointwise_Realizable {
  @pure def check(
      chargeactivity: equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.ChargeActivity.Type,
      chargerconnection: equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.ChargerConnection.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_Candidate_GumboX.inititialize_IEP_Post(equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification.UNAVAILABLE)) |
        (equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_Candidate_GumboX.inititialize_IEP_Post(equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification.READY)) |
        (equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_Candidate_GumboX.inititialize_IEP_Post(equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification.ACTIVE)))))
  }
}
