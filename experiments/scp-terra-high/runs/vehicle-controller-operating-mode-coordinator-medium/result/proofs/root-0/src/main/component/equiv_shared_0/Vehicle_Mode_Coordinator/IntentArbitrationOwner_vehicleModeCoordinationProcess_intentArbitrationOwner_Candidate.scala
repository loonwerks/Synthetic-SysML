// #Sireum

package equiv_shared_0.Vehicle_Mode_Coordinator

import org.sireum._
import equiv_shared_0._

object IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_Candidate {
  // BEGIN FUNCTIONS
  @strictpure def atLeastTwoCandidates(a: Base_Types.Boolean, b: Base_Types.Boolean, c: Base_Types.Boolean, d: Base_Types.Boolean, e: Base_Types.Boolean, f: Base_Types.Boolean, g: Base_Types.Boolean): Base_Types.Boolean = a &
    (b | c |
      d |
      e |
      f |
      g) |
    b &
      (c | d |
        e |
        f |
        g) |
    c &
      (d | e |
        f |
        g) |
    d &
      (e | f |
        g) |
    e &
      (f | g) |
    f & g
  // END FUNCTIONS
}
