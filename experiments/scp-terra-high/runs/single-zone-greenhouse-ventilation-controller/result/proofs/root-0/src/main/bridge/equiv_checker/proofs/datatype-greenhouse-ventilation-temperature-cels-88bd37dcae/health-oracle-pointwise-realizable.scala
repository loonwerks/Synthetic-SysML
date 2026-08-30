// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_88bd37dcae28_Oracle_Pointwise_Realizable {
  @pure def check(
      value: equiv_shared_0.Greenhouse_Ventilation.Temperature_Celsius): Unit = {
    Contract(Requires((T) & (equiv_shared_0.Greenhouse_Ventilation.Temperature_Celsius.D_Inv_Temperature_Celsius(value))))
  }
}
