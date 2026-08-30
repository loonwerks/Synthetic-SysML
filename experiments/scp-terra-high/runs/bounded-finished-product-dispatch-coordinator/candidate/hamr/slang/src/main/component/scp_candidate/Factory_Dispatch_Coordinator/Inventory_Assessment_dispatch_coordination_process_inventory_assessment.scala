// #Sireum
package scp_candidate.Factory_Dispatch_Coordinator
import org.sireum._
import scp_candidate._

object Inventory_Assessment_dispatch_coordination_process_inventory_assessment {
  def initialise(api: Inventory_Assessment_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_inventory_finding(Inventory_Finding.No_Demand)
  }
  def timeTriggered(api: Inventory_Assessment_Operational_Api): Unit = {
    Contract(Modifies(api))
    val request: Pending_Request_View.Type = api.get_pending_request().get
    val evidence: Inventory_Sample = api.get_inventory_evidence().get
    val finding: Inventory_Finding.Type = request match {
      case Pending_Request_View.No_Pending_Request => Inventory_Finding.No_Demand
      case _ => {
        if (evidence.status == Input_Status.Invalid) {
          Inventory_Finding.Invalid_Inventory
        } else if (stockIsSufficient(request, evidence)) {
          Inventory_Finding.Sufficient
        } else {
          Inventory_Finding.Insufficient
        }
      }
    }
    api.put_inventory_finding(finding)
  }
  def stockIsSufficient(request: Pending_Request_View.Type, evidence: Inventory_Sample): B = {
    if (request == Pending_Request_View.Pending_R1_AngleA_One || request == Pending_Request_View.Pending_R2_AngleA_One) { return evidence.stock_band_angle_a != Angle_A_Stock_Band.Zero }
    if (request == Pending_Request_View.Pending_R1_AngleA_Two || request == Pending_Request_View.Pending_R2_AngleA_Two) { return evidence.stock_band_angle_a == Angle_A_Stock_Band.Two_Or_More }
    if (request == Pending_Request_View.Pending_R1_AngleB_One || request == Pending_Request_View.Pending_R2_AngleB_One) { return evidence.stock_band_angle_b != Angle_B_Stock_Band.Zero }
    if (request == Pending_Request_View.Pending_R1_AngleB_Two || request == Pending_Request_View.Pending_R2_AngleB_Two) { return evidence.stock_band_angle_b == Angle_B_Stock_Band.Two_Or_More }
    return F
  }
  def finalise(api: Inventory_Assessment_Operational_Api): Unit = { }
}
