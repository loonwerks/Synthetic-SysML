// #Sireum

package scp_candidate.Factory_Dispatch_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner {

  // BEGIN STATE VARS
  var current_phase: Factory_Dispatch_Coordinator.Dispatch_Phase.Type = Factory_Dispatch_Coordinator.Dispatch_Phase.Idle

  var recovery_required: Base_Types.Boolean = Base_Types.Boolean_example()
  // END STATE VARS

  def initialise(api: Dispatch_Decision_Owner_Initialization_Api): Unit = {
    Contract(
      Modifies(
        // BEGIN INITIALIZES MODIFIES
        current_phase,
        recovery_required
        // END INITIALIZES MODIFIES
      ),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_OWNER_STATE_AND_RESOLUTION
        current_phase == Dispatch_Phase.Idle &&
          recovery_required == F &&
          api.release_resolution.next_phase == Dispatch_Phase.Idle &&
          api.release_resolution.next_recovery_required == F &&
          api.release_resolution.disposition == Dispatch_Disposition.Hold_Position &&
          api.notice_resolution.next_phase == Dispatch_Phase.Idle &&
          api.notice_resolution.next_recovery_required == F &&
          api.notice_resolution.disposition == Dispatch_Disposition.Hold_Position
        // END INITIALIZES ENSURES
      )
    )
    current_phase = Dispatch_Phase.Idle
    recovery_required = F
    val initial: Dispatch_Resolution = Dispatch_Resolution(
      next_phase = Dispatch_Phase.Idle,
      next_recovery_required = F,
      disposition = Dispatch_Disposition.Hold_Position)
    api.put_release_resolution(initial)
    api.put_notice_resolution(initial)
  }

  def timeTriggered(api: Dispatch_Decision_Owner_Operational_Api): Unit = {
    Contract(
      Modifies(current_phase, recovery_required, api),
      Ensures(
        Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner_GumboX.compute_CEP_Post(
          In(current_phase), In(recovery_required), current_phase, recovery_required,
          api.availability_assessment, api.qualified_outcome, api.qualified_request,
          api.notice_resolution, api.release_resolution)
      )
    )
    val request: Qualified_Request.Type = api.get_qualified_request().get
    val availability: Availability_Assessment_Value.Type = api.get_availability_assessment().get
    val outcome: Qualified_Outcome.Type = api.get_qualified_outcome().get

    var nextPhase: Dispatch_Phase.Type = current_phase
    var nextRecovery: Base_Types.Boolean = recovery_required
    var disposition: Dispatch_Disposition.Type = Dispatch_Disposition.Hold_Position

    if (request == Qualified_Request.Invalid_Request ||
        availability == Availability_Assessment_Value.Invalid_Availability ||
        outcome == Qualified_Outcome.Invalid_Outcome) {
      nextPhase = Dispatch_Phase.Idle
      nextRecovery = T
      disposition = Dispatch_Disposition.Input_Fault
    } else if (recovery_required) {
      nextPhase = Dispatch_Phase.Idle
      if (request == Qualified_Request.No_Qualified_Request &&
          outcome == Qualified_Outcome.No_Qualified_Report) {
        nextRecovery = F
        disposition = Dispatch_Disposition.Recovery_Cleared
      } else {
        nextRecovery = T
        disposition = Dispatch_Disposition.Recovery_Blocked
      }
    } else if (outcome == Qualified_Outcome.Qualified_Shipment_Accepted) {
      if (current_phase == Dispatch_Phase.Release_Outstanding) {
        nextPhase = Dispatch_Phase.Idle
        nextRecovery = F
        disposition = Dispatch_Disposition.Shipment_Acknowledged
      } else {
        nextRecovery = F
        disposition = Dispatch_Disposition.Unexpected_Outcome
      }
    } else if (current_phase == Dispatch_Phase.Idle &&
               request == Qualified_Request.Qualified_Shipment_Request &&
               availability == Availability_Assessment_Value.Product_Available) {
      nextPhase = Dispatch_Phase.Release_Outstanding
      nextRecovery = F
      disposition = Dispatch_Disposition.Release_From_Idle
    } else if (current_phase == Dispatch_Phase.Idle &&
               request == Qualified_Request.Qualified_Shipment_Request &&
               availability == Availability_Assessment_Value.Product_Unavailable) {
      nextPhase = Dispatch_Phase.Awaiting_Product
      nextRecovery = F
      disposition = Dispatch_Disposition.Queue_For_Product
    } else if (current_phase == Dispatch_Phase.Awaiting_Product &&
               availability == Availability_Assessment_Value.Product_Available) {
      nextPhase = Dispatch_Phase.Release_Outstanding
      nextRecovery = F
      disposition = Dispatch_Disposition.Release_From_Queue
    }

    current_phase = nextPhase
    recovery_required = nextRecovery
    val resolution: Dispatch_Resolution = Dispatch_Resolution(nextPhase, nextRecovery, disposition)
    api.put_release_resolution(resolution)
    api.put_notice_resolution(resolution)
  }

  def finalise(api: Dispatch_Decision_Owner_Operational_Api): Unit = { }
}
