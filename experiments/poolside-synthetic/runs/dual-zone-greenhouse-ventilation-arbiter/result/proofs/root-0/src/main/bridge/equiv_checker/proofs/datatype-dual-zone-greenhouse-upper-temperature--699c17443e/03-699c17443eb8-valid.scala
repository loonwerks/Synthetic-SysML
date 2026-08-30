// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_699c17443eb8_3_Valid {
  @pure def check(
      value: equiv_shared_0.Dual_Zone_Greenhouse.Upper_Temperature_Limit): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
