// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_f27a68d0066e_1_Valid {
  @pure def check(
      charger_evidence: equiv_shared_0.Power_Propulsion_Availability_Supervisor.ChargerEvidence,
      charging_assessment: equiv_shared_0.Power_Propulsion_Availability_Supervisor.ChargingAssessment.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
