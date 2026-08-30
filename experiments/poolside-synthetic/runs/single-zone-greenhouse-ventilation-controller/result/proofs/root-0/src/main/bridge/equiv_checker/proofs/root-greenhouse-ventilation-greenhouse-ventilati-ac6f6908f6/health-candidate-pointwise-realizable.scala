// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_ac6f6908f611_Candidate_Pointwise_Realizable {
  @pure def check(
      temperature: equiv_shared_0.Greenhouse_Ventilation.Temperature_Celsius,
      upper_limit: equiv_shared_0.Greenhouse_Ventilation.Upper_Temperature_Limit,
      validity: equiv_shared_0.Greenhouse_Ventilation.Temperature_Validity.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((T) |
        (T) |
        (T) |
        (T))))
  }
}
