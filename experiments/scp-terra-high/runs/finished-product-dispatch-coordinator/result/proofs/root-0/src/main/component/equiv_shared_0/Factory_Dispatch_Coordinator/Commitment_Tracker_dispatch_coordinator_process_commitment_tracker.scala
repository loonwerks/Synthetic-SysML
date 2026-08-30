// #Sireum

package equiv_shared_0.Factory_Dispatch_Coordinator

import org.sireum._
import equiv_shared_0._

object Commitment_Tracker_dispatch_coordinator_process_commitment_tracker {
  // BEGIN FUNCTIONS
  @strictpure def context_id(value: Factory_Dispatch_Coordinator.Request_Id.Type): Factory_Dispatch_Coordinator.Context_Request_Id.Type = if (value == Request_Id.R1) Context_Request_Id.R1 else if (value == Request_Id.R2) Context_Request_Id.R2 else if (value == Request_Id.R3) Context_Request_Id.R3 else if (value == Request_Id.R4) Context_Request_Id.R4 else if (value == Request_Id.R5) Context_Request_Id.R5 else if (value == Request_Id.R6) Context_Request_Id.R6 else if (value == Request_Id.R7) Context_Request_Id.R7 else if (value == Request_Id.R8) Context_Request_Id.R8 else Context_Request_Id.None

  @strictpure def context_attempt(value: Factory_Dispatch_Coordinator.Dispatch_Attempt.Type): Factory_Dispatch_Coordinator.Context_Attempt.Type = if (value == Dispatch_Attempt.RetryAttempt) Context_Attempt.RetryAttempt else Context_Attempt.FreshAttempt

  @strictpure def capacity_id(value: Factory_Dispatch_Coordinator.Request_Id.Type): Factory_Dispatch_Coordinator.Capacity_Request_Id.Type = if (value == Request_Id.R1) Capacity_Request_Id.R1 else if (value == Request_Id.R2) Capacity_Request_Id.R2 else if (value == Request_Id.R3) Capacity_Request_Id.R3 else if (value == Request_Id.R4) Capacity_Request_Id.R4 else if (value == Request_Id.R5) Capacity_Request_Id.R5 else if (value == Request_Id.R6) Capacity_Request_Id.R6 else if (value == Request_Id.R7) Capacity_Request_Id.R7 else if (value == Request_Id.R8) Capacity_Request_Id.R8 else Capacity_Request_Id.None

  @strictpure def capacity_product_id(value: Factory_Dispatch_Coordinator.Product_Id.Type): Factory_Dispatch_Coordinator.Capacity_Product_Id.Type = if (value == Product_Id.P1) Capacity_Product_Id.P1 else if (value == Product_Id.P2) Capacity_Product_Id.P2 else if (value == Product_Id.P3) Capacity_Product_Id.P3 else if (value == Product_Id.P4) Capacity_Product_Id.P4 else Capacity_Product_Id.None

  @strictpure def capacity_quantity(value: Factory_Dispatch_Coordinator.Dispatch_Amount.Type): Factory_Dispatch_Coordinator.Capacity_Amount.Type = if (value == Dispatch_Amount.A1) Capacity_Amount.A1 else if (value == Dispatch_Amount.A2) Capacity_Amount.A2 else if (value == Dispatch_Amount.A3) Capacity_Amount.A3 else if (value == Dispatch_Amount.A4) Capacity_Amount.A4 else Capacity_Amount.A0
  // END FUNCTIONS
}
