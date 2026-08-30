// #Sireum

package factory_dispatch_coordinator.Factory_Dispatch_Coordinator

import org.sireum._
import factory_dispatch_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object Dispatch_Decision_Owner_dispatch_coordination_process_dispatch_decision_owner {

  // BEGIN STATE VARS
  var current_phase: Factory_Dispatch_Coordinator.Dispatch_Phase.Type = Factory_Dispatch_Coordinator.Dispatch_Phase.Idle

  var recovery_required: Base_Types.Boolean = Base_Types.Boolean_example()
  // END STATE VARS

  def initialise(api: Dispatch_Decision_Owner_Initialization_Api): Unit = {
    Contract(
      Modifies(api, current_phase, recovery_required),
      Ensures(
        // INITIAL_OWNER_STATE_AND_RESOLUTION
        current_phase == Dispatch_Phase.Idle &
        recovery_required == F &
        api.release_resolution.next_phase == Dispatch_Phase.Idle &
        api.release_resolution.next_recovery_required == F &
        api.release_resolution.disposition == Dispatch_Disposition.Hold_Position &
        api.notice_resolution.next_phase == Dispatch_Phase.Idle &
        api.notice_resolution.next_recovery_required == F &
        api.notice_resolution.disposition == Dispatch_Disposition.Hold_Position
      )
    )

    current_phase = Dispatch_Phase.Idle
    recovery_required = F
    api.put_release_resolution(Factory_Dispatch_Coordinator.Dispatch_Resolution(
      next_phase = Factory_Dispatch_Coordinator.Dispatch_Phase.Idle,
      next_recovery_required = F,
      disposition = Factory_Dispatch_Coordinator.Dispatch_Disposition.Hold_Position))
    api.put_notice_resolution(Factory_Dispatch_Coordinator.Dispatch_Resolution(
      next_phase = Factory_Dispatch_Coordinator.Dispatch_Phase.Idle,
      next_recovery_required = F,
      disposition = Factory_Dispatch_Coordinator.Dispatch_Disposition.Hold_Position))
  }

  def timeTriggered(api: Dispatch_Decision_Owner_Operational_Api): Unit = {
    Contract(
      Modifies(
        // BEGIN COMPUTE MODIFIES timeTriggered
        current_phase,
        recovery_required,
        api
        // END COMPUTE MODIFIES timeTriggered
      ),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee OWNER_STATE_AND_RESOLUTIONS_AGREE
        //   if recovery required then owner state and resolutions agree
        recovery_required ___>:
          current_phase == Dispatch_Phase.Idle &
            api.release_resolution.next_phase == current_phase &
            api.release_resolution.next_recovery_required == recovery_required &
            api.notice_resolution.next_phase == current_phase &
            api.notice_resolution.next_recovery_required == recovery_required &
            api.release_resolution.disposition == api.notice_resolution.disposition,
        // case CASE_01_INPUT_FAULT
        //   qualified request, availability, or outcome is invalid
        (api.qualified_request == Qualified_Request.Invalid_Request |
          api.availability_assessment == Availability_Assessment_Value.Invalid_Availability |
          api.qualified_outcome == Qualified_Outcome.Invalid_Outcome) ___>: (current_phase == Dispatch_Phase.Idle &
          recovery_required == T &
          api.release_resolution.next_phase == Dispatch_Phase.Idle &
          api.release_resolution.next_recovery_required == T &
          api.release_resolution.disposition == Dispatch_Disposition.Input_Fault &
          api.notice_resolution.next_phase == Dispatch_Phase.Idle &
          api.notice_resolution.next_recovery_required == T &
          api.notice_resolution.disposition == Dispatch_Disposition.Input_Fault),
        // case CASE_02_RECOVERY_BLOCKED
        //   not invalid inputs, recovery required on entry is true, and a request or outcome is pending
        (api.qualified_request != Qualified_Request.Invalid_Request &
          api.availability_assessment != Availability_Assessment_Value.Invalid_Availability &
          api.qualified_outcome != Qualified_Outcome.Invalid_Outcome &
          In(recovery_required) == T &
          (api.qualified_request != Qualified_Request.No_Qualified_Request |
            api.qualified_outcome != Qualified_Outcome.No_Qualified_Report)) ___>: (current_phase == Dispatch_Phase.Idle &
          recovery_required == T &
          api.release_resolution.next_phase == Dispatch_Phase.Idle &
          api.release_resolution.next_recovery_required == T &
          api.release_resolution.disposition == Dispatch_Disposition.Recovery_Blocked &
          api.notice_resolution.next_phase == Dispatch_Phase.Idle &
          api.notice_resolution.next_recovery_required == T &
          api.notice_resolution.disposition == Dispatch_Disposition.Recovery_Blocked),
        // case CASE_03_RECOVERY_CLEARED
        //   not invalid inputs, recovery required on entry is true, no request and no outcome pending
        (api.qualified_request != Qualified_Request.Invalid_Request &
          api.availability_assessment != Availability_Assessment_Value.Invalid_Availability &
          api.qualified_outcome != Qualified_Outcome.Invalid_Outcome &
          In(recovery_required) == T &
          api.qualified_request == Qualified_Request.No_Qualified_Request &
          api.qualified_outcome == Qualified_Outcome.No_Qualified_Report) ___>: (current_phase == Dispatch_Phase.Idle &
          recovery_required == F &
          api.release_resolution.next_phase == Dispatch_Phase.Idle &
          api.release_resolution.next_recovery_required == F &
          api.release_resolution.disposition == Dispatch_Disposition.Recovery_Cleared &
          api.notice_resolution.next_phase == Dispatch_Phase.Idle &
          api.notice_resolution.next_recovery_required == F &
          api.notice_resolution.disposition == Dispatch_Disposition.Recovery_Cleared),
        // case CASE_04_EXPECTED_ACCEPTANCE
        //   not invalid inputs, recovery required on entry is false, phase on entry is Release Outstanding, outcome is Qualified Shipment Accepted
        (api.qualified_request != Qualified_Request.Invalid_Request &
          api.availability_assessment != Availability_Assessment_Value.Invalid_Availability &
          api.qualified_outcome != Qualified_Outcome.Invalid_Outcome &
          In(recovery_required) == F &
          In(current_phase) == Dispatch_Phase.Release_Outstanding &
          api.qualified_outcome == Qualified_Outcome.Qualified_Shipment_Accepted) ___>: (current_phase == Dispatch_Phase.Idle &
          recovery_required == F &
          api.release_resolution.next_phase == Dispatch_Phase.Idle &
          api.release_resolution.next_recovery_required == F &
          api.release_resolution.disposition == Dispatch_Disposition.Shipment_Acknowledged &
          api.notice_resolution.next_phase == Dispatch_Phase.Idle &
          api.notice_resolution.next_recovery_required == F &
          api.notice_resolution.disposition == Dispatch_Disposition.Shipment_Acknowledged),
        // case CASE_05_UNEXPECTED_ACCEPTANCE
        //   not invalid inputs, recovery required on entry is false, phase on entry is not Release Outstanding, outcome is Qualified Shipment Accepted
        (api.qualified_request != Qualified_Request.Invalid_Request &
          api.availability_assessment != Availability_Assessment_Value.Invalid_Availability &
          api.qualified_outcome != Qualified_Outcome.Invalid_Outcome &
          In(recovery_required) == F &
          In(current_phase) != Dispatch_Phase.Release_Outstanding &
          api.qualified_outcome == Qualified_Outcome.Qualified_Shipment_Accepted) ___>: (current_phase == In(current_phase) &
          recovery_required == F &
          api.release_resolution.next_phase == In(current_phase) &
          api.release_resolution.next_recovery_required == F &
          api.release_resolution.disposition == Dispatch_Disposition.Unexpected_Outcome &
          api.notice_resolution.next_phase == In(current_phase) &
          api.notice_resolution.next_recovery_required == F &
          api.notice_resolution.disposition == Dispatch_Disposition.Unexpected_Outcome),
        // case CASE_06_RELEASE_FROM_IDLE
        //   not invalid inputs, product available, no qualified report, recovery required on entry is false, phase on entry is Idle, qualified shipment request, product available
        (api.qualified_request != Qualified_Request.Invalid_Request &
          api.availability_assessment != Availability_Assessment_Value.Invalid_Availability &
          api.qualified_outcome == Qualified_Outcome.No_Qualified_Report &
          In(recovery_required) == F &
          In(current_phase) == Dispatch_Phase.Idle &
          api.qualified_request == Qualified_Request.Qualified_Shipment_Request &
          api.availability_assessment == Availability_Assessment_Value.Product_Available) ___>: (current_phase == Dispatch_Phase.Release_Outstanding &
          recovery_required == F &
          api.release_resolution.next_phase == Dispatch_Phase.Release_Outstanding &
          api.release_resolution.next_recovery_required == F &
          api.release_resolution.disposition == Dispatch_Disposition.Release_From_Idle &
          api.notice_resolution.next_phase == Dispatch_Phase.Release_Outstanding &
          api.notice_resolution.next_recovery_required == F &
          api.notice_resolution.disposition == Dispatch_Disposition.Release_From_Idle),
        // case CASE_07_QUEUE_FOR_PRODUCT
        //   not invalid inputs, product unavailable, no qualified report, recovery required on entry is false, phase on entry is Idle, qualified shipment request, product unavailable
        (api.qualified_request != Qualified_Request.Invalid_Request &
          api.availability_assessment != Availability_Assessment_Value.Invalid_Availability &
          api.qualified_outcome == Qualified_Outcome.No_Qualified_Report &
          In(recovery_required) == F &
          In(current_phase) == Dispatch_Phase.Idle &
          api.qualified_request == Qualified_Request.Qualified_Shipment_Request &
          api.availability_assessment == Availability_Assessment_Value.Product_Unavailable) ___>: (current_phase == Dispatch_Phase.Awaiting_Product &
          recovery_required == F &
          api.release_resolution.next_phase == Dispatch_Phase.Awaiting_Product &
          api.release_resolution.next_recovery_required == F &
          api.release_resolution.disposition == Dispatch_Disposition.Queue_For_Product &
          api.notice_resolution.next_phase == Dispatch_Phase.Awaiting_Product &
          api.notice_resolution.next_recovery_required == F &
          api.notice_resolution.disposition == Dispatch_Disposition.Queue_For_Product),
        // case CASE_08_RELEASE_FROM_QUEUE
        //   not invalid request, product available, no qualified report, recovery required on entry is false, phase on entry is Awaiting Product
        (api.qualified_request != Qualified_Request.Invalid_Request &
          api.availability_assessment == Availability_Assessment_Value.Product_Available &
          api.qualified_outcome == Qualified_Outcome.No_Qualified_Report &
          In(recovery_required) == F &
          In(current_phase) == Dispatch_Phase.Awaiting_Product) ___>: (current_phase == Dispatch_Phase.Release_Outstanding &
          recovery_required == F &
          api.release_resolution.next_phase == Dispatch_Phase.Release_Outstanding &
          api.release_resolution.next_recovery_required == F &
          api.release_resolution.disposition == Dispatch_Disposition.Release_From_Queue &
          api.notice_resolution.next_phase == Dispatch_Phase.Release_Outstanding &
          api.notice_resolution.next_recovery_required == F &
          api.notice_resolution.disposition == Dispatch_Disposition.Release_From_Queue),
        // case CASE_09_HOLD_POSITION
        //   not invalid inputs, no qualified report, recovery required on entry is false, none of the release/queue transitions apply
        (api.qualified_request != Qualified_Request.Invalid_Request &
          api.availability_assessment != Availability_Assessment_Value.Invalid_Availability &
          api.qualified_outcome == Qualified_Outcome.No_Qualified_Report &
          In(recovery_required) == F &
          !(In(current_phase) == Dispatch_Phase.Idle &
            api.qualified_request == Qualified_Request.Qualified_Shipment_Request &
            api.availability_assessment == Availability_Assessment_Value.Product_Available) &
          !(In(current_phase) == Dispatch_Phase.Idle &
            api.qualified_request == Qualified_Request.Qualified_Shipment_Request &
            api.availability_assessment == Availability_Assessment_Value.Product_Unavailable) &
          !(In(current_phase) == Dispatch_Phase.Awaiting_Product &
            api.availability_assessment == Availability_Assessment_Value.Product_Available)) ___>: (current_phase == In(current_phase) &
          recovery_required == F &
          api.release_resolution.next_phase == In(current_phase) &
          api.release_resolution.next_recovery_required == F &
          api.release_resolution.disposition == Dispatch_Disposition.Hold_Position &
          api.notice_resolution.next_phase == In(current_phase) &
          api.notice_resolution.next_recovery_required == F &
          api.notice_resolution.disposition == Dispatch_Disposition.Hold_Position)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val qr = api.get_qualified_request().get
    val aa = api.get_availability_assessment().get
    val qo = api.get_qualified_outcome().get

    val entry_phase: Dispatch_Phase.Type = current_phase
    val entry_recovery: B = recovery_required

    val invalid = qr == Qualified_Request.Invalid_Request |
      aa == Availability_Assessment_Value.Invalid_Availability |
      qo == Qualified_Outcome.Invalid_Outcome

    val new_phase: Dispatch_Phase.Type =
      if (invalid) {
        Dispatch_Phase.Idle
      } else if (entry_recovery == T) {
        Dispatch_Phase.Idle
      } else if (qo == Qualified_Outcome.Qualified_Shipment_Accepted) {
        if (entry_phase == Dispatch_Phase.Release_Outstanding) {
          Dispatch_Phase.Idle
        } else {
          entry_phase
        }
      } else if (entry_phase == Dispatch_Phase.Idle &
        qr == Qualified_Request.Qualified_Shipment_Request &
        aa == Availability_Assessment_Value.Product_Available) {
        Dispatch_Phase.Release_Outstanding
      } else if (entry_phase == Dispatch_Phase.Idle &
        qr == Qualified_Request.Qualified_Shipment_Request &
        aa == Availability_Assessment_Value.Product_Unavailable) {
        Dispatch_Phase.Awaiting_Product
      } else if (entry_phase == Dispatch_Phase.Awaiting_Product &
        aa == Availability_Assessment_Value.Product_Available) {
        Dispatch_Phase.Release_Outstanding
      } else {
        entry_phase
      }

    val new_recovery_required: B =
      if (invalid) {
        T
      } else if (entry_recovery == T) {
        val pending = qr != Qualified_Request.No_Qualified_Request |
          qo != Qualified_Outcome.No_Qualified_Report
        if (pending) T else F
      } else {
        F
      }

    val disposition: Dispatch_Disposition.Type =
      if (invalid) {
        Dispatch_Disposition.Input_Fault
      } else if (entry_recovery == T) {
        val pending = qr != Qualified_Request.No_Qualified_Request |
          qo != Qualified_Outcome.No_Qualified_Report
        if (pending) Dispatch_Disposition.Recovery_Blocked else Dispatch_Disposition.Recovery_Cleared
      } else if (qo == Qualified_Outcome.Qualified_Shipment_Accepted) {
        if (entry_phase == Dispatch_Phase.Release_Outstanding) {
          Dispatch_Disposition.Shipment_Acknowledged
        } else {
          Dispatch_Disposition.Unexpected_Outcome
        }
      } else if (entry_phase == Dispatch_Phase.Idle &
        qr == Qualified_Request.Qualified_Shipment_Request &
        aa == Availability_Assessment_Value.Product_Available) {
        Dispatch_Disposition.Release_From_Idle
      } else if (entry_phase == Dispatch_Phase.Idle &
        qr == Qualified_Request.Qualified_Shipment_Request &
        aa == Availability_Assessment_Value.Product_Unavailable) {
        Dispatch_Disposition.Queue_For_Product
      } else if (entry_phase == Dispatch_Phase.Awaiting_Product &
        aa == Availability_Assessment_Value.Product_Available) {
        Dispatch_Disposition.Release_From_Queue
      } else {
        Dispatch_Disposition.Hold_Position
      }

    current_phase = new_phase
    recovery_required = new_recovery_required

    val resolution = Factory_Dispatch_Coordinator.Dispatch_Resolution(
      next_phase = new_phase,
      next_recovery_required = new_recovery_required,
      disposition = disposition)
    api.put_release_resolution(resolution)
    api.put_notice_resolution(resolution)
  }

  def finalise(api: Dispatch_Decision_Owner_Operational_Api): Unit = { }
}
