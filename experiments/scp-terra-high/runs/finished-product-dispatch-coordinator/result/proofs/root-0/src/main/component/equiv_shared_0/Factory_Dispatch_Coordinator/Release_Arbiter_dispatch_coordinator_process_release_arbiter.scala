// #Sireum

package equiv_shared_0.Factory_Dispatch_Coordinator

import org.sireum._
import equiv_shared_0._

object Release_Arbiter_dispatch_coordinator_process_release_arbiter {
  // BEGIN FUNCTIONS
  @strictpure def capacity_request(value: Factory_Dispatch_Coordinator.Candidate_Request_Id.Type): Factory_Dispatch_Coordinator.Request_Id.Type = if (value == Candidate_Request_Id.R1) Request_Id.R1 else if (value == Candidate_Request_Id.R2) Request_Id.R2 else if (value == Candidate_Request_Id.R3) Request_Id.R3 else if (value == Candidate_Request_Id.R4) Request_Id.R4 else if (value == Candidate_Request_Id.R5) Request_Id.R5 else if (value == Candidate_Request_Id.R6) Request_Id.R6 else if (value == Candidate_Request_Id.R7) Request_Id.R7 else if (value == Candidate_Request_Id.R8) Request_Id.R8 else Request_Id.None

  @strictpure def capacity_product(value: Factory_Dispatch_Coordinator.Candidate_Product_Id.Type): Factory_Dispatch_Coordinator.Product_Id.Type = if (value == Candidate_Product_Id.P1) Product_Id.P1 else if (value == Candidate_Product_Id.P2) Product_Id.P2 else if (value == Candidate_Product_Id.P3) Product_Id.P3 else if (value == Candidate_Product_Id.P4) Product_Id.P4 else Product_Id.None

  @strictpure def capacity_amount(value: Factory_Dispatch_Coordinator.Candidate_Amount.Type): Factory_Dispatch_Coordinator.Dispatch_Amount.Type = if (value == Candidate_Amount.A1) Dispatch_Amount.A1 else if (value == Candidate_Amount.A2) Dispatch_Amount.A2 else if (value == Candidate_Amount.A3) Dispatch_Amount.A3 else if (value == Candidate_Amount.A4) Dispatch_Amount.A4 else Dispatch_Amount.A0
  // END FUNCTIONS
}
