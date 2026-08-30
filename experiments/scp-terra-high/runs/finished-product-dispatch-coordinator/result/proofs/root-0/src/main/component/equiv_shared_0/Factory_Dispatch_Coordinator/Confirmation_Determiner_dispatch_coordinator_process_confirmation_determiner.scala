// #Sireum

package equiv_shared_0.Factory_Dispatch_Coordinator

import org.sireum._
import equiv_shared_0._

object Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner {
  // BEGIN FUNCTIONS
  @strictpure def request_id(value: Factory_Dispatch_Coordinator.Confirmation_Request_Id.Type): Factory_Dispatch_Coordinator.Request_Id.Type = if (value == Confirmation_Request_Id.R1) Request_Id.R1 else if (value == Confirmation_Request_Id.R2) Request_Id.R2 else if (value == Confirmation_Request_Id.R3) Request_Id.R3 else if (value == Confirmation_Request_Id.R4) Request_Id.R4 else if (value == Confirmation_Request_Id.R5) Request_Id.R5 else if (value == Confirmation_Request_Id.R6) Request_Id.R6 else if (value == Confirmation_Request_Id.R7) Request_Id.R7 else if (value == Confirmation_Request_Id.R8) Request_Id.R8 else Request_Id.None
  // END FUNCTIONS
}
