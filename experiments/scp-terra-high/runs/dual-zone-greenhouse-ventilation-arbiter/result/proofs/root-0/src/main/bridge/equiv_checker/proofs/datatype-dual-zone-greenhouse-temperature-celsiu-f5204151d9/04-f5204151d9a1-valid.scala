// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_f5204151d9a1_4_Valid {
  @pure def check(
      value: equiv_shared_0.Dual_Zone_Greenhouse.Temperature_Celsius): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Dual_Zone_Greenhouse.Temperature_Celsius.D_Inv_Temperature_Celsius(value))) ___>: (equiv_shared_0.Dual_Zone_Greenhouse.Temperature_Celsius_Candidate.D_Inv_Temperature_Celsius_Candidate(value))) & T))
  }
}
