// #Sireum

package scp_candidate.Drone_Lifecycle_Energy_Governor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner {

  var phaseState: Drone_Lifecycle_Energy_Governor.LifecyclePhase.Type =
    Drone_Lifecycle_Energy_Governor.LifecyclePhase.OFF

  def initialise(api: LifecyclePriorityOwner_Initialization_Api): Unit = {
    Contract(Modifies(api, phaseState))
    phaseState = Drone_Lifecycle_Energy_Governor.LifecyclePhase.OFF
    api.put_resolutionOut(Drone_Lifecycle_Energy_Governor.LifecycleResolution(
      Drone_Lifecycle_Energy_Governor.LifecycleCase.L12,
      Drone_Lifecycle_Energy_Governor.SourceLifecyclePhase.OFF,
      Drone_Lifecycle_Energy_Governor.LifecyclePhase.OFF,
      F, F, F, F, F, F))
  }

  def timeTriggered(api: LifecyclePriorityOwner_Operational_Api): Unit = {
    Contract(Modifies(api, phaseState))
    (api.get_semanticsIn(), api.get_chargeEligibilityIn(), api.get_readinessIn(),
      api.get_homeFactsIn(), api.get_touchdownFactsIn(), api.get_hazardProposalIn(),
      api.get_airborneRequestIn()) match {
      case (Some(semantics), Some(charge), Some(ready), Some(home), Some(touchdown),
          Some(hazard), Some(airborneRequest)) =>
        val source: Drone_Lifecycle_Energy_Governor.LifecyclePhase.Type = phaseState
        var next: Drone_Lifecycle_Energy_Governor.LifecyclePhase.Type = source
        var winner: Drone_Lifecycle_Energy_Governor.LifecycleCase.Type =
          Drone_Lifecycle_Energy_Governor.LifecycleCase.L26
        if ((source == Drone_Lifecycle_Energy_Governor.LifecyclePhase.FLYING ||
            source == Drone_Lifecycle_Energy_Governor.LifecyclePhase.RETURNING ||
            source == Drone_Lifecycle_Energy_Governor.LifecyclePhase.LANDING) && hazard.emergencyLand)
        {
          next = Drone_Lifecycle_Energy_Governor.LifecyclePhase.LANDING
          winner = Drone_Lifecycle_Energy_Governor.LifecycleCase.L01
        } else if (source == Drone_Lifecycle_Energy_Governor.LifecyclePhase.RETURNING && hazard.navigationUnusable) {
          next = Drone_Lifecycle_Energy_Governor.LifecyclePhase.LANDING
          winner = Drone_Lifecycle_Energy_Governor.LifecycleCase.L02
        } else if (source == Drone_Lifecycle_Energy_Governor.LifecyclePhase.FLYING && hazard.forcedReturn) {
          next = Drone_Lifecycle_Energy_Governor.LifecyclePhase.RETURNING
          winner = Drone_Lifecycle_Energy_Governor.LifecycleCase.L03
        } else if (((source == Drone_Lifecycle_Energy_Governor.LifecyclePhase.FLYING &&
            !hazard.forcedReturn) || (source == Drone_Lifecycle_Energy_Governor.LifecyclePhase.RETURNING &&
            !hazard.navigationUnusable)) &&
            airborneRequest == Drone_Lifecycle_Energy_Governor.AirborneRequestProposal.LAND_REQUESTED) {
          next = Drone_Lifecycle_Energy_Governor.LifecyclePhase.LANDING
          winner = Drone_Lifecycle_Energy_Governor.LifecycleCase.L04
        } else if (source == Drone_Lifecycle_Energy_Governor.LifecyclePhase.FLYING &&
          airborneRequest == Drone_Lifecycle_Energy_Governor.AirborneRequestProposal.RETURN_REQUESTED) {
          next = Drone_Lifecycle_Energy_Governor.LifecyclePhase.RETURNING
          winner = Drone_Lifecycle_Energy_Governor.LifecycleCase.L05
        } else if (source == Drone_Lifecycle_Energy_Governor.LifecyclePhase.RETURNING && home.arrivalEstablished) {
          next = Drone_Lifecycle_Energy_Governor.LifecyclePhase.LANDING
          winner = Drone_Lifecycle_Energy_Governor.LifecycleCase.L06
        } else if (source == Drone_Lifecycle_Energy_Governor.LifecyclePhase.LANDING && touchdown.touchdownEstablished && ready) {
          next = Drone_Lifecycle_Energy_Governor.LifecyclePhase.READY
          winner = Drone_Lifecycle_Energy_Governor.LifecycleCase.L07
        } else if (source == Drone_Lifecycle_Energy_Governor.LifecyclePhase.LANDING && touchdown.touchdownEstablished) {
          next = Drone_Lifecycle_Energy_Governor.LifecyclePhase.STANDBY
          winner = Drone_Lifecycle_Energy_Governor.LifecycleCase.L08
        } else if ((source == Drone_Lifecycle_Energy_Governor.LifecyclePhase.STANDBY ||
            source == Drone_Lifecycle_Energy_Governor.LifecyclePhase.CHARGING ||
            source == Drone_Lifecycle_Energy_Governor.LifecyclePhase.READY) && hazard.batteryUnusable) {
          next = Drone_Lifecycle_Energy_Governor.LifecyclePhase.STANDBY
          winner = Drone_Lifecycle_Energy_Governor.LifecycleCase.L09
        } else if (source == Drone_Lifecycle_Energy_Governor.LifecyclePhase.READY && hazard.lowOrCritical) {
          next = Drone_Lifecycle_Energy_Governor.LifecyclePhase.STANDBY
          winner = Drone_Lifecycle_Energy_Governor.LifecycleCase.L10
        } else if (source == Drone_Lifecycle_Energy_Governor.LifecyclePhase.OFF) {
          if (semantics.intentCode == Drone_Lifecycle_Energy_Governor.ExactRequestCode.SWITCH_ON) {
            next = Drone_Lifecycle_Energy_Governor.LifecyclePhase.STANDBY
            winner = Drone_Lifecycle_Energy_Governor.LifecycleCase.L11
          } else {
            winner = Drone_Lifecycle_Energy_Governor.LifecycleCase.L12
          }
        } else if (source == Drone_Lifecycle_Energy_Governor.LifecyclePhase.STANDBY) {
          if (semantics.intentCode == Drone_Lifecycle_Energy_Governor.ExactRequestCode.SWITCH_OFF) {
            next = Drone_Lifecycle_Energy_Governor.LifecyclePhase.OFF
            winner = Drone_Lifecycle_Energy_Governor.LifecycleCase.L13
          } else if (semantics.intentCode == Drone_Lifecycle_Energy_Governor.ExactRequestCode.START_CHARGE && charge.entryEligible) {
            next = Drone_Lifecycle_Energy_Governor.LifecyclePhase.CHARGING
            winner = Drone_Lifecycle_Energy_Governor.LifecycleCase.L14
          } else if (semantics.intentCode == Drone_Lifecycle_Energy_Governor.ExactRequestCode.ACTIVATE && ready) {
            next = Drone_Lifecycle_Energy_Governor.LifecyclePhase.READY
            winner = Drone_Lifecycle_Energy_Governor.LifecycleCase.L15
          } else {
            winner = Drone_Lifecycle_Energy_Governor.LifecycleCase.L16
          }
        } else if (source == Drone_Lifecycle_Energy_Governor.LifecyclePhase.CHARGING) {
          if (semantics.intentCode == Drone_Lifecycle_Energy_Governor.ExactRequestCode.SWITCH_OFF) {
            next = Drone_Lifecycle_Energy_Governor.LifecyclePhase.OFF
            winner = Drone_Lifecycle_Energy_Governor.LifecycleCase.L17
          } else if (semantics.intentCode == Drone_Lifecycle_Energy_Governor.ExactRequestCode.STOP_CHARGE || charge.exitRequired) {
            next = Drone_Lifecycle_Energy_Governor.LifecyclePhase.STANDBY
            winner = Drone_Lifecycle_Energy_Governor.LifecycleCase.L18
          } else {
            winner = Drone_Lifecycle_Energy_Governor.LifecycleCase.L19
          }
        } else if (source == Drone_Lifecycle_Energy_Governor.LifecyclePhase.READY) {
          if (semantics.intentCode == Drone_Lifecycle_Energy_Governor.ExactRequestCode.SWITCH_OFF) {
            next = Drone_Lifecycle_Energy_Governor.LifecyclePhase.OFF
            winner = Drone_Lifecycle_Energy_Governor.LifecycleCase.L20
          } else if (semantics.intentCode == Drone_Lifecycle_Energy_Governor.ExactRequestCode.DEACTIVATE) {
            next = Drone_Lifecycle_Energy_Governor.LifecyclePhase.STANDBY
            winner = Drone_Lifecycle_Energy_Governor.LifecycleCase.L21
          } else if (semantics.intentCode == Drone_Lifecycle_Energy_Governor.ExactRequestCode.LAUNCH && ready) {
            next = Drone_Lifecycle_Energy_Governor.LifecyclePhase.FLYING
            winner = Drone_Lifecycle_Energy_Governor.LifecycleCase.L22
          } else {
            winner = Drone_Lifecycle_Energy_Governor.LifecycleCase.L23
          }
        } else if (source == Drone_Lifecycle_Energy_Governor.LifecyclePhase.FLYING) {
          winner = Drone_Lifecycle_Energy_Governor.LifecycleCase.L24
        } else if (source == Drone_Lifecycle_Energy_Governor.LifecyclePhase.RETURNING) {
          winner = Drone_Lifecycle_Energy_Governor.LifecycleCase.L25
        }
        val applicable: B =
          (source == Drone_Lifecycle_Energy_Governor.LifecyclePhase.OFF &&
            semantics.intentCode == Drone_Lifecycle_Energy_Governor.ExactRequestCode.SWITCH_ON) ||
          (source == Drone_Lifecycle_Energy_Governor.LifecyclePhase.STANDBY &&
            ((semantics.intentCode == Drone_Lifecycle_Energy_Governor.ExactRequestCode.SWITCH_OFF) ||
              (semantics.intentCode == Drone_Lifecycle_Energy_Governor.ExactRequestCode.START_CHARGE && charge.entryEligible) ||
              (semantics.intentCode == Drone_Lifecycle_Energy_Governor.ExactRequestCode.ACTIVATE && ready))) ||
          (source == Drone_Lifecycle_Energy_Governor.LifecyclePhase.CHARGING &&
            (semantics.intentCode == Drone_Lifecycle_Energy_Governor.ExactRequestCode.SWITCH_OFF ||
              semantics.intentCode == Drone_Lifecycle_Energy_Governor.ExactRequestCode.STOP_CHARGE)) ||
          (source == Drone_Lifecycle_Energy_Governor.LifecyclePhase.READY &&
            (semantics.intentCode == Drone_Lifecycle_Energy_Governor.ExactRequestCode.SWITCH_OFF ||
              semantics.intentCode == Drone_Lifecycle_Energy_Governor.ExactRequestCode.DEACTIVATE ||
              (semantics.intentCode == Drone_Lifecycle_Energy_Governor.ExactRequestCode.LAUNCH && ready))) ||
          (source == Drone_Lifecycle_Energy_Governor.LifecyclePhase.FLYING &&
            (airborneRequest == Drone_Lifecycle_Energy_Governor.AirborneRequestProposal.RETURN_REQUESTED ||
              airborneRequest == Drone_Lifecycle_Energy_Governor.AirborneRequestProposal.LAND_REQUESTED)) ||
          (source == Drone_Lifecycle_Energy_Governor.LifecyclePhase.RETURNING &&
            airborneRequest == Drone_Lifecycle_Energy_Governor.AirborneRequestProposal.LAND_REQUESTED)
        val caused: B =
          (winner == Drone_Lifecycle_Energy_Governor.LifecycleCase.L04 && semantics.intentCode == Drone_Lifecycle_Energy_Governor.ExactRequestCode.LAND) ||
          (winner == Drone_Lifecycle_Energy_Governor.LifecycleCase.L05 && semantics.intentCode == Drone_Lifecycle_Energy_Governor.ExactRequestCode.RETURN) ||
          (winner == Drone_Lifecycle_Energy_Governor.LifecycleCase.L11 && semantics.intentCode == Drone_Lifecycle_Energy_Governor.ExactRequestCode.SWITCH_ON) ||
          (winner == Drone_Lifecycle_Energy_Governor.LifecycleCase.L13 && semantics.intentCode == Drone_Lifecycle_Energy_Governor.ExactRequestCode.SWITCH_OFF) ||
          (winner == Drone_Lifecycle_Energy_Governor.LifecycleCase.L14 && semantics.intentCode == Drone_Lifecycle_Energy_Governor.ExactRequestCode.START_CHARGE) ||
          (winner == Drone_Lifecycle_Energy_Governor.LifecycleCase.L15 && semantics.intentCode == Drone_Lifecycle_Energy_Governor.ExactRequestCode.ACTIVATE) ||
          (winner == Drone_Lifecycle_Energy_Governor.LifecycleCase.L17 && semantics.intentCode == Drone_Lifecycle_Energy_Governor.ExactRequestCode.SWITCH_OFF) ||
          (winner == Drone_Lifecycle_Energy_Governor.LifecycleCase.L18 && semantics.intentCode == Drone_Lifecycle_Energy_Governor.ExactRequestCode.STOP_CHARGE) ||
          (winner == Drone_Lifecycle_Energy_Governor.LifecycleCase.L20 && semantics.intentCode == Drone_Lifecycle_Energy_Governor.ExactRequestCode.SWITCH_OFF) ||
          (winner == Drone_Lifecycle_Energy_Governor.LifecycleCase.L21 && semantics.intentCode == Drone_Lifecycle_Energy_Governor.ExactRequestCode.DEACTIVATE) ||
          (winner == Drone_Lifecycle_Energy_Governor.LifecycleCase.L22 && semantics.intentCode == Drone_Lifecycle_Energy_Governor.ExactRequestCode.LAUNCH)
        val sourcePublished: Drone_Lifecycle_Energy_Governor.SourceLifecyclePhase.Type =
          if (source == Drone_Lifecycle_Energy_Governor.LifecyclePhase.OFF) Drone_Lifecycle_Energy_Governor.SourceLifecyclePhase.OFF
          else if (source == Drone_Lifecycle_Energy_Governor.LifecyclePhase.STANDBY) Drone_Lifecycle_Energy_Governor.SourceLifecyclePhase.STANDBY
          else if (source == Drone_Lifecycle_Energy_Governor.LifecyclePhase.CHARGING) Drone_Lifecycle_Energy_Governor.SourceLifecyclePhase.CHARGING
          else if (source == Drone_Lifecycle_Energy_Governor.LifecyclePhase.READY) Drone_Lifecycle_Energy_Governor.SourceLifecyclePhase.READY
          else if (source == Drone_Lifecycle_Energy_Governor.LifecyclePhase.FLYING) Drone_Lifecycle_Energy_Governor.SourceLifecyclePhase.FLYING
          else if (source == Drone_Lifecycle_Energy_Governor.LifecyclePhase.RETURNING) Drone_Lifecycle_Energy_Governor.SourceLifecyclePhase.RETURNING
          else Drone_Lifecycle_Energy_Governor.SourceLifecyclePhase.LANDING
        phaseState = next
        api.put_resolutionOut(Drone_Lifecycle_Energy_Governor.LifecycleResolution(
          winner, sourcePublished, next,
          semantics.requestFamily != Drone_Lifecycle_Energy_Governor.RequestFamily.ABSENT,
          applicable, caused, applicable && !caused, charge.retentionEligible, ready))
    }
  }

  def finalise(api: LifecyclePriorityOwner_Operational_Api): Unit = { }
}
