// #Sireum

package equiv_shared_0.Dual_Zone_Greenhouse

import org.sireum._
import equiv_shared_0._
import org.sireum.S32._

object Temperature_Celsius_Candidate {
  def example(): Dual_Zone_Greenhouse.Temperature_Celsius = {
    return Dual_Zone_Greenhouse.Temperature_Celsius(
      degrees_celsius = Base_Types.Integer_32_example())
  }

  /** invariant REPRESENTABLE_TEMPERATURE_RANGE
    *   degrees celsius between -20 and 60 inclusive
    */
  @strictpure def REPRESENTABLE_TEMPERATURE_RANGE_Invariant(value: Dual_Zone_Greenhouse.Temperature_Celsius): B =
    value.degrees_celsius >= s32"-20" &
      value.degrees_celsius <= s32"60"

  /** D-Inv Data Invariant for Dual_Zone_Greenhouse.Temperature_Celsius
    */
  @strictpure def D_Inv_Temperature_Celsius_Candidate(value: Dual_Zone_Greenhouse.Temperature_Celsius): B =
    (REPRESENTABLE_TEMPERATURE_RANGE_Invariant(value))

  /** D-Inv-Guard Data Invariant for Dual_Zone_Greenhouse.Temperature_Celsius
    */
  @strictpure def D_Inv_Guard_Temperature_Celsius(value: Option[Dual_Zone_Greenhouse.Temperature_Celsius]): B =
    value.nonEmpty ___>: D_Inv_Temperature_Celsius_Candidate(value.get)
}
