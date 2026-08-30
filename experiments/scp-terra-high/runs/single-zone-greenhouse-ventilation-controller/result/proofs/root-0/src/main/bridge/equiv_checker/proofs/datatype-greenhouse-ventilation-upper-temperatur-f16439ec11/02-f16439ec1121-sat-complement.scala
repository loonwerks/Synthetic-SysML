// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_f16439ec1121_2_Complement {
  @pure def check(
      value: equiv_shared_0.Greenhouse_Ventilation.Upper_Temperature_Limit): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Greenhouse_Ventilation.Upper_Temperature_Limit.D_Inv_Upper_Temperature_Limit(value))) & T)))
  }
}
