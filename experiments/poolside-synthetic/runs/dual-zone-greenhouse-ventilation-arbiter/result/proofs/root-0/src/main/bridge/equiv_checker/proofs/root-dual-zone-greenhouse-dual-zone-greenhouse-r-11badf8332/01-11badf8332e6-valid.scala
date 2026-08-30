// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_11badf8332e6_1_Valid {
  @pure def check(
      preference: equiv_shared_0.Dual_Zone_Greenhouse.Contention_Preference.Type,
      zone_a_eligibility: equiv_shared_0.Dual_Zone_Greenhouse.Ventilation_Eligibility.Type,
      zone_a_fan_command: equiv_shared_0.Dual_Zone_Greenhouse.Fan_Command.Type,
      zone_b_eligibility: equiv_shared_0.Dual_Zone_Greenhouse.Ventilation_Eligibility.Type,
      zone_b_fan_command: equiv_shared_0.Dual_Zone_Greenhouse.Fan_Command.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
