// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_d21178c2ea02_4_Valid {
  @pure def check(
      chargedecision: equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.Type,
      chargepermission: equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.ChargePermission.Type,
      chargesessionsnapshot: equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionSnapshot,
      currentchargesession: equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState.Type,
      in_committedchargesession: equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState.Type,
      committedchargesession: equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_GumboX.compute_CEP_Post(in_committedchargesession, committedchargesession, chargedecision, chargepermission, chargesessionsnapshot, currentchargesession))) ___>: (equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_Candidate_GumboX.compute_CEP_Post(in_committedchargesession, committedchargesession, chargedecision, chargepermission, chargesessionsnapshot, currentchargesession))) & T))
  }
}
