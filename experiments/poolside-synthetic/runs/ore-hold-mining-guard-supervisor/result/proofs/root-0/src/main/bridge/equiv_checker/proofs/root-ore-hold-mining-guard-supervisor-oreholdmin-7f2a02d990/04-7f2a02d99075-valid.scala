// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_7f2a02d99075_4_Valid {
  @pure def check(
      hold_assessment: equiv_shared_0.Ore_Hold_Mining_Guard_Supervisor.HoldAssessment.Type,
      hold_sample: equiv_shared_0.Ore_Hold_Mining_Guard_Supervisor.HoldSample): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_GumboX.compute_CEP_Post(hold_sample, hold_assessment))) ___>: (T)) & T))
  }
}
