// #Sireum

package frigate_threat_egress_supervisor.Frigate_Threat_Egress_Supervisor

import org.sireum._
import frigate_threat_egress_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ResponseStateController_threatResponseProcess_responseStateController {

  // BEGIN STATE VARS
  var committedEgress: Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.Type =
    Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.IDLE
  // END STATE VARS

  def initialise(api: ResponseStateController_Initialization_Api): Unit = {
    Contract(
      Modifies(
        api,
        committedEgress
      ),
      Ensures(
        // INIT_EGRESS_SESSION
        committedEgress == Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.IDLE,
        api.defenseCommand == Frigate_Threat_Egress_Supervisor.DefenseCommand.STANDBY,
        api.egressCommand == Frigate_Threat_Egress_Supervisor.EgressCommand.NONE,
        api.responseSnapshot.preEgress == Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.IDLE,
        api.responseSnapshot.nextEgress == Frigate_Threat_Egress_Supervisor.SnapshotNextEgressState.IDLE,
        api.responseSnapshot.defenseCommand == Frigate_Threat_Egress_Supervisor.SnapshotDefenseCommand.STANDBY,
        api.responseSnapshot.egressCommand == Frigate_Threat_Egress_Supervisor.SnapshotEgressCommand.NONE
      )
    )
    committedEgress = Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.IDLE

    val responseSnapshot: Frigate_Threat_Egress_Supervisor.ResponseSnapshot =
      Frigate_Threat_Egress_Supervisor.ResponseSnapshot(
        preEgress = Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.IDLE,
        nextEgress = Frigate_Threat_Egress_Supervisor.SnapshotNextEgressState.IDLE,
        directive = Frigate_Threat_Egress_Supervisor.SnapshotResponseDirective.RESET,
        defenseCommand = Frigate_Threat_Egress_Supervisor.SnapshotDefenseCommand.STANDBY,
        egressCommand = Frigate_Threat_Egress_Supervisor.SnapshotEgressCommand.NONE
      )

    api.put_responseSnapshot(responseSnapshot)
    api.put_defenseCommand(Frigate_Threat_Egress_Supervisor.DefenseCommand.STANDBY)
    api.put_egressCommand(Frigate_Threat_Egress_Supervisor.EgressCommand.NONE)
  }

  def timeTriggered(api: ResponseStateController_Operational_Api): Unit = {
    Contract(
      Modifies(
        api,
        committedEgress
      ),
      Ensures(
        // CASE_19_EGRESS_STATE_AND_COMMAND_PRIORITY
        // PRESERVE_RESPONSE_SNAPSHOT
        // preEgress mirrors entry committedEgress
        (In(committedEgress) == Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.IDLE) ___>:
          api.responseSnapshot.preEgress == Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.IDLE,
        (In(committedEgress) == Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.ORDERED) ___>:
          api.responseSnapshot.preEgress == Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.ORDERED,
        (In(committedEgress) == Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.MOVING) ___>:
          api.responseSnapshot.preEgress == Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.MOVING,
        (In(committedEgress) == Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.BLOCKED) ___>:
          api.responseSnapshot.preEgress == Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.BLOCKED,
        (In(committedEgress) == Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.ARRIVED) ___>:
          api.responseSnapshot.preEgress == Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.ARRIVED,
        // nextEgress mirrors new committedEgress
        (committedEgress == Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.IDLE) ___>:
          api.responseSnapshot.nextEgress == Frigate_Threat_Egress_Supervisor.SnapshotNextEgressState.IDLE,
        (committedEgress == Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.ORDERED) ___>:
          api.responseSnapshot.nextEgress == Frigate_Threat_Egress_Supervisor.SnapshotNextEgressState.ORDERED,
        (committedEgress == Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.MOVING) ___>:
          api.responseSnapshot.nextEgress == Frigate_Threat_Egress_Supervisor.SnapshotNextEgressState.MOVING,
        (committedEgress == Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.BLOCKED) ___>:
          api.responseSnapshot.nextEgress == Frigate_Threat_Egress_Supervisor.SnapshotNextEgressState.BLOCKED,
        (committedEgress == Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.ARRIVED) ___>:
          api.responseSnapshot.nextEgress == Frigate_Threat_Egress_Supervisor.SnapshotNextEgressState.ARRIVED
      )
    )
    // CASE_19_EGRESS_STATE_AND_COMMAND_PRIORITY implemented in body below
    val egressProgress: Frigate_Threat_Egress_Supervisor.EgressProgress.Type = api.get_egressProgress().get
    val responseDirective: Frigate_Threat_Egress_Supervisor.ResponseDirective.Type = api.get_responseDirective().get

    val entryEgress: Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.Type = committedEgress

    val newEgress: Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.Type =
      if (responseDirective == Frigate_Threat_Egress_Supervisor.ResponseDirective.RESET) {
        Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.IDLE
      } else if (responseDirective != Frigate_Threat_Egress_Supervisor.ResponseDirective.CANCEL_EGRESS &
        (entryEgress == Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.ORDERED |
          entryEgress == Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.MOVING) &
        egressProgress == Frigate_Threat_Egress_Supervisor.EgressProgress.SAFE_DESTINATION_OBSERVED) {
        Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.ARRIVED
      } else if (responseDirective == Frigate_Threat_Egress_Supervisor.ResponseDirective.CANCEL_EGRESS) {
        Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.IDLE
      } else if ((entryEgress == Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.ORDERED |
        entryEgress == Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.MOVING) &
        egressProgress == Frigate_Threat_Egress_Supervisor.EgressProgress.FAILED) {
        Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.BLOCKED
      } else if (entryEgress == Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.ORDERED &
        egressProgress == Frigate_Threat_Egress_Supervisor.EgressProgress.NOT_STARTED) {
        Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.ORDERED
      } else if (entryEgress == Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.ORDERED &
        egressProgress == Frigate_Threat_Egress_Supervisor.EgressProgress.EN_ROUTE) {
        Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.MOVING
      } else if (entryEgress == Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.MOVING &
        (egressProgress == Frigate_Threat_Egress_Supervisor.EgressProgress.NOT_STARTED |
          egressProgress == Frigate_Threat_Egress_Supervisor.EgressProgress.EN_ROUTE)) {
        Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.MOVING
      } else if (entryEgress == Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.BLOCKED &
        responseDirective == Frigate_Threat_Egress_Supervisor.ResponseDirective.START_EGRESS) {
        Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.ORDERED
      } else if (entryEgress == Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.BLOCKED) {
        Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.BLOCKED
      } else if (entryEgress == Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.ARRIVED) {
        Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.ARRIVED
      } else if (entryEgress == Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.IDLE &
        responseDirective == Frigate_Threat_Egress_Supervisor.ResponseDirective.START_EGRESS) {
        Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.ORDERED
      } else if (entryEgress == Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.IDLE &
        responseDirective == Frigate_Threat_Egress_Supervisor.ResponseDirective.DEFEND) {
        Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.IDLE
      } else {
        Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.IDLE
      }

    committedEgress = newEgress

    val egressCommand: Frigate_Threat_Egress_Supervisor.EgressCommand.Type =
      if (responseDirective == Frigate_Threat_Egress_Supervisor.ResponseDirective.RESET) {
        Frigate_Threat_Egress_Supervisor.EgressCommand.NONE
      } else if (responseDirective != Frigate_Threat_Egress_Supervisor.ResponseDirective.CANCEL_EGRESS &
        (entryEgress == Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.ORDERED |
          entryEgress == Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.MOVING) &
        egressProgress == Frigate_Threat_Egress_Supervisor.EgressProgress.SAFE_DESTINATION_OBSERVED) {
        Frigate_Threat_Egress_Supervisor.EgressCommand.HOLD
      } else if (responseDirective == Frigate_Threat_Egress_Supervisor.ResponseDirective.CANCEL_EGRESS) {
        Frigate_Threat_Egress_Supervisor.EgressCommand.CANCEL
      } else if ((entryEgress == Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.ORDERED |
        entryEgress == Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.MOVING) &
        egressProgress == Frigate_Threat_Egress_Supervisor.EgressProgress.FAILED) {
        Frigate_Threat_Egress_Supervisor.EgressCommand.HOLD
      } else if (entryEgress == Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.ORDERED &
        egressProgress == Frigate_Threat_Egress_Supervisor.EgressProgress.NOT_STARTED) {
        Frigate_Threat_Egress_Supervisor.EgressCommand.INITIATE
      } else if (entryEgress == Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.ORDERED &
        egressProgress == Frigate_Threat_Egress_Supervisor.EgressProgress.EN_ROUTE) {
        Frigate_Threat_Egress_Supervisor.EgressCommand.CONTINUE
      } else if (entryEgress == Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.MOVING &
        (egressProgress == Frigate_Threat_Egress_Supervisor.EgressProgress.NOT_STARTED |
          egressProgress == Frigate_Threat_Egress_Supervisor.EgressProgress.EN_ROUTE)) {
        Frigate_Threat_Egress_Supervisor.EgressCommand.CONTINUE
      } else if (entryEgress == Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.BLOCKED &
        responseDirective == Frigate_Threat_Egress_Supervisor.ResponseDirective.START_EGRESS) {
        Frigate_Threat_Egress_Supervisor.EgressCommand.INITIATE
      } else if (entryEgress == Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.BLOCKED) {
        Frigate_Threat_Egress_Supervisor.EgressCommand.HOLD
      } else if (entryEgress == Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.ARRIVED) {
        Frigate_Threat_Egress_Supervisor.EgressCommand.HOLD
      } else if (entryEgress == Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.IDLE &
        responseDirective == Frigate_Threat_Egress_Supervisor.ResponseDirective.START_EGRESS) {
        Frigate_Threat_Egress_Supervisor.EgressCommand.INITIATE
      } else {
        Frigate_Threat_Egress_Supervisor.EgressCommand.NONE
      }

    val defenseCommand: Frigate_Threat_Egress_Supervisor.DefenseCommand.Type =
      if (responseDirective == Frigate_Threat_Egress_Supervisor.ResponseDirective.RESET) {
        Frigate_Threat_Egress_Supervisor.DefenseCommand.STANDBY
      } else if ((entryEgress == Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.ORDERED |
        entryEgress == Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.MOVING) &
        egressProgress == Frigate_Threat_Egress_Supervisor.EgressProgress.SAFE_DESTINATION_OBSERVED) {
        Frigate_Threat_Egress_Supervisor.DefenseCommand.STANDBY
      } else if (responseDirective == Frigate_Threat_Egress_Supervisor.ResponseDirective.CANCEL_EGRESS) {
        Frigate_Threat_Egress_Supervisor.DefenseCommand.STANDBY
      } else if ((entryEgress == Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.ORDERED |
        entryEgress == Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.MOVING) &
        egressProgress == Frigate_Threat_Egress_Supervisor.EgressProgress.FAILED) {
        if (responseDirective == Frigate_Threat_Egress_Supervisor.ResponseDirective.DEFEND) {
          Frigate_Threat_Egress_Supervisor.DefenseCommand.ACTIVATE
        } else {
          Frigate_Threat_Egress_Supervisor.DefenseCommand.STANDBY
        }
      } else if ((entryEgress == Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.ORDERED |
        entryEgress == Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.MOVING) &
        egressProgress == Frigate_Threat_Egress_Supervisor.EgressProgress.NOT_STARTED) {
        Frigate_Threat_Egress_Supervisor.DefenseCommand.STANDBY
      } else if ((entryEgress == Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.ORDERED |
        entryEgress == Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.MOVING) &
        egressProgress == Frigate_Threat_Egress_Supervisor.EgressProgress.EN_ROUTE) {
        Frigate_Threat_Egress_Supervisor.DefenseCommand.STANDBY
      } else if (entryEgress == Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.MOVING) {
        Frigate_Threat_Egress_Supervisor.DefenseCommand.STANDBY
      } else if (entryEgress == Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.BLOCKED) {
        if (responseDirective == Frigate_Threat_Egress_Supervisor.ResponseDirective.DEFEND) {
          Frigate_Threat_Egress_Supervisor.DefenseCommand.ACTIVATE
        } else {
          Frigate_Threat_Egress_Supervisor.DefenseCommand.STANDBY
        }
      } else if (entryEgress == Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.ARRIVED) {
        Frigate_Threat_Egress_Supervisor.DefenseCommand.STANDBY
      } else if (entryEgress == Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.IDLE) {
        if (responseDirective == Frigate_Threat_Egress_Supervisor.ResponseDirective.START_EGRESS |
          responseDirective == Frigate_Threat_Egress_Supervisor.ResponseDirective.DEFEND) {
          if (responseDirective == Frigate_Threat_Egress_Supervisor.ResponseDirective.DEFEND) {
            Frigate_Threat_Egress_Supervisor.DefenseCommand.ACTIVATE
          } else {
            Frigate_Threat_Egress_Supervisor.DefenseCommand.STANDBY
          }
        } else {
          Frigate_Threat_Egress_Supervisor.DefenseCommand.STANDBY
        }
      } else {
        Frigate_Threat_Egress_Supervisor.DefenseCommand.STANDBY
      }

    val snapshotNextEgress: Frigate_Threat_Egress_Supervisor.SnapshotNextEgressState.Type =
      if (newEgress == Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.IDLE) {
        Frigate_Threat_Egress_Supervisor.SnapshotNextEgressState.IDLE
      } else if (newEgress == Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.ORDERED) {
        Frigate_Threat_Egress_Supervisor.SnapshotNextEgressState.ORDERED
      } else if (newEgress == Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.MOVING) {
        Frigate_Threat_Egress_Supervisor.SnapshotNextEgressState.MOVING
      } else if (newEgress == Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.BLOCKED) {
        Frigate_Threat_Egress_Supervisor.SnapshotNextEgressState.BLOCKED
      } else {
        Frigate_Threat_Egress_Supervisor.SnapshotNextEgressState.ARRIVED
      }

    val snapshotDefenseCommand: Frigate_Threat_Egress_Supervisor.SnapshotDefenseCommand.Type =
      if (defenseCommand == Frigate_Threat_Egress_Supervisor.DefenseCommand.STANDBY) {
        Frigate_Threat_Egress_Supervisor.SnapshotDefenseCommand.STANDBY
      } else {
        Frigate_Threat_Egress_Supervisor.SnapshotDefenseCommand.ACTIVATE
      }

    val snapshotEgressCommand: Frigate_Threat_Egress_Supervisor.SnapshotEgressCommand.Type =
      if (egressCommand == Frigate_Threat_Egress_Supervisor.EgressCommand.NONE) {
        Frigate_Threat_Egress_Supervisor.SnapshotEgressCommand.NONE
      } else if (egressCommand == Frigate_Threat_Egress_Supervisor.EgressCommand.INITIATE) {
        Frigate_Threat_Egress_Supervisor.SnapshotEgressCommand.INITIATE
      } else if (egressCommand == Frigate_Threat_Egress_Supervisor.EgressCommand.CONTINUE) {
        Frigate_Threat_Egress_Supervisor.SnapshotEgressCommand.CONTINUE
      } else if (egressCommand == Frigate_Threat_Egress_Supervisor.EgressCommand.HOLD) {
        Frigate_Threat_Egress_Supervisor.SnapshotEgressCommand.HOLD
      } else {
        Frigate_Threat_Egress_Supervisor.SnapshotEgressCommand.CANCEL
      }

    val snapshotDirective: Frigate_Threat_Egress_Supervisor.SnapshotResponseDirective.Type =
      if (responseDirective == Frigate_Threat_Egress_Supervisor.ResponseDirective.RESET) {
        Frigate_Threat_Egress_Supervisor.SnapshotResponseDirective.RESET
      } else if (responseDirective == Frigate_Threat_Egress_Supervisor.ResponseDirective.CONTAIN) {
        Frigate_Threat_Egress_Supervisor.SnapshotResponseDirective.CONTAIN
      } else if (responseDirective == Frigate_Threat_Egress_Supervisor.ResponseDirective.CANCEL_EGRESS) {
        Frigate_Threat_Egress_Supervisor.SnapshotResponseDirective.CANCEL_EGRESS
      } else if (responseDirective == Frigate_Threat_Egress_Supervisor.ResponseDirective.START_EGRESS) {
        Frigate_Threat_Egress_Supervisor.SnapshotResponseDirective.START_EGRESS
      } else if (responseDirective == Frigate_Threat_Egress_Supervisor.ResponseDirective.DEFEND) {
        Frigate_Threat_Egress_Supervisor.SnapshotResponseDirective.DEFEND
      } else if (responseDirective == Frigate_Threat_Egress_Supervisor.ResponseDirective.HOLD_BLOCKED) {
        Frigate_Threat_Egress_Supervisor.SnapshotResponseDirective.HOLD_BLOCKED
      } else {
        Frigate_Threat_Egress_Supervisor.SnapshotResponseDirective.MONITOR
      }

    api.put_responseSnapshot(
      Frigate_Threat_Egress_Supervisor.ResponseSnapshot(
        preEgress = entryEgress,
        nextEgress = snapshotNextEgress,
        directive = snapshotDirective,
        defenseCommand = snapshotDefenseCommand,
        egressCommand = snapshotEgressCommand
      )
    )
    api.put_defenseCommand(defenseCommand)
    api.put_egressCommand(egressCommand)
  }

  def finalise(api: ResponseStateController_Operational_Api): Unit = { }
}
