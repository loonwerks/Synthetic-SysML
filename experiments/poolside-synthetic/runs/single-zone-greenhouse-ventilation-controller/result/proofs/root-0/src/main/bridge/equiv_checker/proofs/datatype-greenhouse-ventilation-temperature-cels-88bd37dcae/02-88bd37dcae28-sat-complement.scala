// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_88bd37dcae28_2_Complement {
  @pure def check(
      value: equiv_shared_0.Greenhouse_Ventilation.Temperature_Celsius): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Greenhouse_Ventilation.Temperature_Celsius.D_Inv_Temperature_Celsius(value))) & T)))
  }
}
