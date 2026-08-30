// #Sireum

package equiv_shared_0.Factory_Dispatch_Coordinator

import org.sireum._
import equiv_shared_0._

object Inventory_Assessment_dispatch_coordination_process_inventory_assessment {
  // BEGIN FUNCTIONS
  @strictpure def is_angle_a(value: Factory_Dispatch_Coordinator.Pending_Request_View.Type): Base_Types.Boolean = value == Pending_Request_View.Pending_R1_AngleA_One |
    value == Pending_Request_View.Pending_R1_AngleA_Two |
    value == Pending_Request_View.Pending_R2_AngleA_One |
    value == Pending_Request_View.Pending_R2_AngleA_Two

  @strictpure def amount_is_one(value: Factory_Dispatch_Coordinator.Pending_Request_View.Type): Base_Types.Boolean = value == Pending_Request_View.Pending_R1_AngleA_One |
    value == Pending_Request_View.Pending_R1_AngleB_One |
    value == Pending_Request_View.Pending_R2_AngleA_One |
    value == Pending_Request_View.Pending_R2_AngleB_One

  @strictpure def stock_is_sufficient(value: Factory_Dispatch_Coordinator.Pending_Request_View.Type, angle_a: Factory_Dispatch_Coordinator.Angle_A_Stock_Band.Type, angle_b: Factory_Dispatch_Coordinator.Angle_B_Stock_Band.Type): Base_Types.Boolean = is_angle_a(value) &
    (amount_is_one(value) &
      angle_a != Angle_A_Stock_Band.Zero |
      !(amount_is_one(value)) &
        angle_a == Angle_A_Stock_Band.Two_Or_More) |
    !(is_angle_a(value)) &
      (amount_is_one(value) &
        angle_b != Angle_B_Stock_Band.Zero |
        !(amount_is_one(value)) &
          angle_b == Angle_B_Stock_Band.Two_Or_More)
  // END FUNCTIONS
}
