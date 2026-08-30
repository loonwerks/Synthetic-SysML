// #Sireum

package equiv_shared_0.Dual_Zone_Greenhouse

import org.sireum._
import equiv_shared_0._
import org.sireum.S32._

object Upper_Temperature_Limit_Candidate {
  def example(): Dual_Zone_Greenhouse.Upper_Temperature_Limit = {
    return Dual_Zone_Greenhouse.Upper_Temperature_Limit(
      degrees_celsius = Base_Types.Integer_32_example())
  }

  /** invariant SELECTABLE_UPPER_LIMIT_RANGE
    */
  @strictpure def SELECTABLE_UPPER_LIMIT_RANGE_Invariant(value: Dual_Zone_Greenhouse.Upper_Temperature_Limit): B =
    value.degrees_celsius >= s32"10" &
      value.degrees_celsius <= s32"35"

  /** D-Inv Data Invariant for Dual_Zone_Greenhouse.Upper_Temperature_Limit
    */
  @strictpure def D_Inv_Upper_Temperature_Limit_Candidate(value: Dual_Zone_Greenhouse.Upper_Temperature_Limit): B =
    (SELECTABLE_UPPER_LIMIT_RANGE_Invariant(value))

  /** D-Inv-Guard Data Invariant for Dual_Zone_Greenhouse.Upper_Temperature_Limit
    */
  @strictpure def D_Inv_Guard_Upper_Temperature_Limit(value: Option[Dual_Zone_Greenhouse.Upper_Temperature_Limit]): B =
    value.nonEmpty ___>: D_Inv_Upper_Temperature_Limit_Candidate(value.get)
}
