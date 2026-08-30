// #Sireum

package equiv_shared_0.Factory_Dispatch_Coordinator

import org.sireum._
import equiv_shared_0._

object Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier {
  // BEGIN FUNCTIONS
  @strictpure def confirmation_class(value: Factory_Dispatch_Coordinator.Outcome_Plan.Type): Factory_Dispatch_Coordinator.Confirmation_Outcome_Class.Type = if (value == Outcome_Plan.Preserve) Confirmation_Outcome_Class.Preserve else if (value == Outcome_Plan.Completed) Confirmation_Outcome_Class.Completed else if (value == Outcome_Plan.RetryEligible) Confirmation_Outcome_Class.RetryEligible else Confirmation_Outcome_Class.Abort

  @strictpure def confirmation_id(value: Factory_Dispatch_Coordinator.Context_Request_Id.Type): Factory_Dispatch_Coordinator.Confirmation_Request_Id.Type = if (value == Context_Request_Id.R1) Confirmation_Request_Id.R1 else if (value == Context_Request_Id.R2) Confirmation_Request_Id.R2 else if (value == Context_Request_Id.R3) Confirmation_Request_Id.R3 else if (value == Context_Request_Id.R4) Confirmation_Request_Id.R4 else if (value == Context_Request_Id.R5) Confirmation_Request_Id.R5 else if (value == Context_Request_Id.R6) Confirmation_Request_Id.R6 else if (value == Context_Request_Id.R7) Confirmation_Request_Id.R7 else if (value == Context_Request_Id.R8) Confirmation_Request_Id.R8 else Confirmation_Request_Id.None

  @strictpure def same_request(raw: Factory_Dispatch_Coordinator.Request_Id.Type, active: Factory_Dispatch_Coordinator.Context_Request_Id.Type): Base_Types.Boolean = raw == Request_Id.R1 &
    active == Context_Request_Id.R1 |
    raw == Request_Id.R2 &
      active == Context_Request_Id.R2 |
    raw == Request_Id.R3 &
      active == Context_Request_Id.R3 |
    raw == Request_Id.R4 &
      active == Context_Request_Id.R4 |
    raw == Request_Id.R5 &
      active == Context_Request_Id.R5 |
    raw == Request_Id.R6 &
      active == Context_Request_Id.R6 |
    raw == Request_Id.R7 &
      active == Context_Request_Id.R7 |
    raw == Request_Id.R8 &
      active == Context_Request_Id.R8

  @strictpure def same_attempt(raw: Factory_Dispatch_Coordinator.Dispatch_Attempt.Type, active: Factory_Dispatch_Coordinator.Context_Attempt.Type): Base_Types.Boolean = raw == Dispatch_Attempt.FreshAttempt &
    active == Context_Attempt.FreshAttempt |
    raw == Dispatch_Attempt.RetryAttempt &
      active == Context_Attempt.RetryAttempt
  // END FUNCTIONS
}
