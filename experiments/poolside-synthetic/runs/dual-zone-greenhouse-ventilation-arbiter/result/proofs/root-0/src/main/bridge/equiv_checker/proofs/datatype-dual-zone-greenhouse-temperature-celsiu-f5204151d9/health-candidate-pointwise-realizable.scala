// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_f5204151d9a1_Candidate_Pointwise_Realizable {
  @pure def check(
      value: equiv_shared_0.Dual_Zone_Greenhouse.Temperature_Celsius): Unit = {
    Contract(Requires((T) & (equiv_shared_0.Dual_Zone_Greenhouse.Temperature_Celsius_Candidate.D_Inv_Temperature_Celsius_Candidate(value))))
  }
}
