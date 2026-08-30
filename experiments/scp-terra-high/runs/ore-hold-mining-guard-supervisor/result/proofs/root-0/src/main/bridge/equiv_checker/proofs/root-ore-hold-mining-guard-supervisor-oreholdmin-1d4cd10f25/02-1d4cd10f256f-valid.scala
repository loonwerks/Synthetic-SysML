// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_1d4cd10f256f_2_Valid {
  @pure def check(
      hold_assessment: equiv_shared_0.Ore_Hold_Mining_Guard_Supervisor.HoldAssessment.Type,
      hold_sample: equiv_shared_0.Ore_Hold_Mining_Guard_Supervisor.HoldSample): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_Candidate_GumboX.inititialize_IEP_Post(hold_assessment))) ___>: (equiv_shared_0.Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_GumboX.inititialize_IEP_Post(hold_assessment))) & T))
  }
}
