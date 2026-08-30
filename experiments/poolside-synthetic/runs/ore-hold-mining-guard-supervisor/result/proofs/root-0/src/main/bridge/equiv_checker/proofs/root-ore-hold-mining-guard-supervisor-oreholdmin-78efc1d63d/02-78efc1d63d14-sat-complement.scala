// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_78efc1d63d14_2_Complement {
  @pure def check(
      mining_support: equiv_shared_0.Ore_Hold_Mining_Guard_Supervisor.MiningSupportSample,
      support_assessment: equiv_shared_0.Ore_Hold_Mining_Guard_Supervisor.SupportAssessment.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_GumboX.compute_CEP_Post(mining_support, support_assessment))) & T)))
  }
}
