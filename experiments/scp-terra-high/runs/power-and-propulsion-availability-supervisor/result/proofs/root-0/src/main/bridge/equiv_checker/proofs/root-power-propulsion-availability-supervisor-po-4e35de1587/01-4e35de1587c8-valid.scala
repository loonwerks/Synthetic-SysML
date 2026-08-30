// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_4e35de1587c8_1_Valid {
  @pure def check(
      power_assessment: equiv_shared_0.Power_Propulsion_Availability_Supervisor.PowerAssessment.Type,
      power_evidence: equiv_shared_0.Power_Propulsion_Availability_Supervisor.PowerEvidence): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
