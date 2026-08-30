// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_90378282ce23_4_Valid {
  @pure def check(
      mining_support: equiv_shared_0.Ore_Hold_Mining_Guard_Supervisor.MiningSupportSample,
      support_assessment: equiv_shared_0.Ore_Hold_Mining_Guard_Supervisor.SupportAssessment.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_GumboX.inititialize_IEP_Post(support_assessment))) ___>: (T)) & T))
  }
}
