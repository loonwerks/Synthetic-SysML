// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_6b3e3b36ba59_4_Valid {
  @pure def check(
      hold_assessment: equiv_shared_0.Ore_Hold_Mining_Guard_Supervisor.HoldAssessment.Type,
      request_assessment: equiv_shared_0.Ore_Hold_Mining_Guard_Supervisor.RequestAssessment,
      resolution_to_command: equiv_shared_0.Ore_Hold_Mining_Guard_Supervisor.GuardResolution,
      resolution_to_reporting: equiv_shared_0.Ore_Hold_Mining_Guard_Supervisor.GuardResolution,
      support_assessment: equiv_shared_0.Ore_Hold_Mining_Guard_Supervisor.SupportAssessment.Type,
      guardmode: equiv_shared_0.Ore_Hold_Mining_Guard_Supervisor.GuardMode.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_GumboX.inititialize_IEP_Post(guardmode, resolution_to_command, resolution_to_reporting))) ___>: (T)) & T))
  }
}
