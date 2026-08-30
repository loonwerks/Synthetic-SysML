// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_78efc1d63d14_1_Valid {
  @pure def check(
      mining_support: equiv_shared_0.Ore_Hold_Mining_Guard_Supervisor.MiningSupportSample,
      support_assessment: equiv_shared_0.Ore_Hold_Mining_Guard_Supervisor.SupportAssessment.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
