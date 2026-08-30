// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_f5204151d9a1_3_Valid {
  @pure def check(
      value: equiv_shared_0.Dual_Zone_Greenhouse.Temperature_Celsius): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
