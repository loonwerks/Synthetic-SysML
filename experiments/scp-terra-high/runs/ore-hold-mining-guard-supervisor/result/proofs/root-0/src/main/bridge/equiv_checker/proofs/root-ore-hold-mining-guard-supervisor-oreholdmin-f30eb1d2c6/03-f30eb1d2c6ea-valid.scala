// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_f30eb1d2c6ea_3_Valid {
  @pure def check(
      hold_assessment: equiv_shared_0.Ore_Hold_Mining_Guard_Supervisor.HoldAssessment.Type,
      request_assessment: equiv_shared_0.Ore_Hold_Mining_Guard_Supervisor.RequestAssessment,
      resolution_to_command: equiv_shared_0.Ore_Hold_Mining_Guard_Supervisor.GuardResolution,
      resolution_to_reporting: equiv_shared_0.Ore_Hold_Mining_Guard_Supervisor.GuardResolution,
      support_assessment: equiv_shared_0.Ore_Hold_Mining_Guard_Supervisor.SupportAssessment.Type,
      in_guardmode: equiv_shared_0.Ore_Hold_Mining_Guard_Supervisor.GuardMode.Type,
      guardmode: equiv_shared_0.Ore_Hold_Mining_Guard_Supervisor.GuardMode.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
