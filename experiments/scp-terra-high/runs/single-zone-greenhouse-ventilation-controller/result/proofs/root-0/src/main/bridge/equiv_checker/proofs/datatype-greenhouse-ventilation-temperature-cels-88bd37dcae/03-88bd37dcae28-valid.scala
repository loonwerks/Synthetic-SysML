// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_88bd37dcae28_3_Valid {
  @pure def check(
      value: equiv_shared_0.Greenhouse_Ventilation.Temperature_Celsius): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
