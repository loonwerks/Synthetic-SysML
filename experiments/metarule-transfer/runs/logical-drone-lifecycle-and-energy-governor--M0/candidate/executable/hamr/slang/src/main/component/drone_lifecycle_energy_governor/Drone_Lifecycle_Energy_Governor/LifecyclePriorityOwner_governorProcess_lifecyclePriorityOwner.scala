// #Sireum

package drone_lifecycle_energy_governor.Drone_Lifecycle_Energy_Governor

import org.sireum._
import drone_lifecycle_energy_governor._

// This file will not be overwritten if HAMR codegen is rerun
object LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner {
  var phaseState: LifecyclePhase.Type = LifecyclePhase.OFF

  def sourceOf(phase: LifecyclePhase.Type): SourceLifecyclePhase.Type = {
    var result: SourceLifecyclePhase.Type = SourceLifecyclePhase.OFF
    phase match {
      case LifecyclePhase.OFF => result = SourceLifecyclePhase.OFF
      case LifecyclePhase.STANDBY => result = SourceLifecyclePhase.STANDBY
      case LifecyclePhase.CHARGING => result = SourceLifecyclePhase.CHARGING
      case LifecyclePhase.READY => result = SourceLifecyclePhase.READY
      case LifecyclePhase.FLYING => result = SourceLifecyclePhase.FLYING
      case LifecyclePhase.RETURNING => result = SourceLifecyclePhase.RETURNING
      case LifecyclePhase.LANDING => result = SourceLifecyclePhase.LANDING
    }
    return result
  }

  def publish(
    api: LifecyclePriorityOwner_Operational_Api,
    entry: LifecyclePhase.Type,
    next: LifecyclePhase.Type,
    winner: LifecycleCase.Type,
    semantics: LifecycleClassifiedRequest,
    charge: ChargeEligibility,
    ready: B,
    airborne: AirborneRequestProposal.Type): Unit = {
    val applicable: B =
      (entry == LifecyclePhase.OFF & semantics.requestFamily == RequestFamily.POWER &
        semantics.intentCode == ExactRequestCode.SWITCH_ON) |
      (entry == LifecyclePhase.STANDBY &
        ((semantics.requestFamily == RequestFamily.POWER & semantics.intentCode == ExactRequestCode.SWITCH_OFF) |
          (semantics.requestFamily == RequestFamily.CHARGE & semantics.intentCode == ExactRequestCode.START_CHARGE & charge.entryEligible) |
          (semantics.requestFamily == RequestFamily.READINESS & semantics.intentCode == ExactRequestCode.ACTIVATE & ready))) |
      (entry == LifecyclePhase.CHARGING &
        ((semantics.requestFamily == RequestFamily.POWER & semantics.intentCode == ExactRequestCode.SWITCH_OFF) |
          (semantics.requestFamily == RequestFamily.CHARGE & semantics.intentCode == ExactRequestCode.STOP_CHARGE))) |
      (entry == LifecyclePhase.READY &
        ((semantics.requestFamily == RequestFamily.POWER & semantics.intentCode == ExactRequestCode.SWITCH_OFF) |
          (semantics.requestFamily == RequestFamily.READINESS & semantics.intentCode == ExactRequestCode.DEACTIVATE) |
          (semantics.requestFamily == RequestFamily.READINESS & semantics.intentCode == ExactRequestCode.LAUNCH & ready))) |
      (entry == LifecyclePhase.FLYING & semantics.requestFamily == RequestFamily.AIRBORNE &
        (airborne == AirborneRequestProposal.RETURN_REQUESTED | airborne == AirborneRequestProposal.LAND_REQUESTED)) |
      (entry == LifecyclePhase.RETURNING & semantics.requestFamily == RequestFamily.AIRBORNE &
        airborne == AirborneRequestProposal.LAND_REQUESTED)
    val caused: B =
      (winner == LifecycleCase.L04 & semantics.intentCode == ExactRequestCode.LAND) |
      (winner == LifecycleCase.L05 & semantics.intentCode == ExactRequestCode.RETURN) |
      (winner == LifecycleCase.L11 & semantics.intentCode == ExactRequestCode.SWITCH_ON) |
      (winner == LifecycleCase.L13 & semantics.intentCode == ExactRequestCode.SWITCH_OFF) |
      (winner == LifecycleCase.L14 & semantics.intentCode == ExactRequestCode.START_CHARGE) |
      (winner == LifecycleCase.L15 & semantics.intentCode == ExactRequestCode.ACTIVATE) |
      (winner == LifecycleCase.L17 & semantics.intentCode == ExactRequestCode.SWITCH_OFF) |
      (winner == LifecycleCase.L18 & semantics.intentCode == ExactRequestCode.STOP_CHARGE) |
      (winner == LifecycleCase.L20 & semantics.intentCode == ExactRequestCode.SWITCH_OFF) |
      (winner == LifecycleCase.L21 & semantics.intentCode == ExactRequestCode.DEACTIVATE) |
      (winner == LifecycleCase.L22 & semantics.intentCode == ExactRequestCode.LAUNCH)
    phaseState = next
    api.put_resolutionOut(LifecycleResolution(
      winner, sourceOf(entry), next, semantics.requestFamily != RequestFamily.ABSENT,
      applicable, caused, applicable & !caused, charge.retentionEligible, ready))
  }

  def initialise(api: LifecyclePriorityOwner_Initialization_Api): Unit = {
    Contract(Modifies(api, phaseState))
    phaseState = LifecyclePhase.OFF
    api.put_resolutionOut(LifecycleResolution(
      LifecycleCase.L12, SourceLifecyclePhase.OFF, LifecyclePhase.OFF, F, F, F, F, F, F))
  }

  def timeTriggered(api: LifecyclePriorityOwner_Operational_Api): Unit = {
    Contract(Modifies(api, phaseState))
    (api.get_semanticsIn(), api.get_chargeEligibilityIn(), api.get_readinessIn(),
      api.get_homeFactsIn(), api.get_touchdownFactsIn(), api.get_hazardProposalIn(),
      api.get_airborneRequestIn()) match {
      case (Some(semantics), Some(charge), Some(ready), Some(home), Some(touchdown), Some(hazard), Some(airborne)) =>
        val entry: LifecyclePhase.Type = phaseState
        if ((entry == LifecyclePhase.FLYING | entry == LifecyclePhase.RETURNING | entry == LifecyclePhase.LANDING) &
          hazard.emergencyLand) {
          publish(api, entry, LifecyclePhase.LANDING, LifecycleCase.L01, semantics, charge, ready, airborne)
        } else if (entry == LifecyclePhase.RETURNING & hazard.navigationUnusable) {
          publish(api, entry, LifecyclePhase.LANDING, LifecycleCase.L02, semantics, charge, ready, airborne)
        } else if (entry == LifecyclePhase.FLYING & hazard.forcedReturn) {
          publish(api, entry, LifecyclePhase.RETURNING, LifecycleCase.L03, semantics, charge, ready, airborne)
        } else if (((entry == LifecyclePhase.FLYING & !hazard.forcedReturn) |
          (entry == LifecyclePhase.RETURNING & !hazard.navigationUnusable)) &
          airborne == AirborneRequestProposal.LAND_REQUESTED) {
          publish(api, entry, LifecyclePhase.LANDING, LifecycleCase.L04, semantics, charge, ready, airborne)
        } else if (entry == LifecyclePhase.FLYING & airborne == AirborneRequestProposal.RETURN_REQUESTED) {
          publish(api, entry, LifecyclePhase.RETURNING, LifecycleCase.L05, semantics, charge, ready, airborne)
        } else if (entry == LifecyclePhase.RETURNING & home.arrivalEstablished) {
          publish(api, entry, LifecyclePhase.LANDING, LifecycleCase.L06, semantics, charge, ready, airborne)
        } else if (entry == LifecyclePhase.LANDING & touchdown.touchdownEstablished & ready) {
          publish(api, entry, LifecyclePhase.READY, LifecycleCase.L07, semantics, charge, ready, airborne)
        } else if (entry == LifecyclePhase.LANDING & touchdown.touchdownEstablished) {
          publish(api, entry, LifecyclePhase.STANDBY, LifecycleCase.L08, semantics, charge, ready, airborne)
        } else if ((entry == LifecyclePhase.STANDBY | entry == LifecyclePhase.CHARGING | entry == LifecyclePhase.READY) &
          hazard.batteryUnusable) {
          publish(api, entry, LifecyclePhase.STANDBY, LifecycleCase.L09, semantics, charge, ready, airborne)
        } else if (entry == LifecyclePhase.READY & hazard.lowOrCritical) {
          publish(api, entry, LifecyclePhase.STANDBY, LifecycleCase.L10, semantics, charge, ready, airborne)
        } else if (entry == LifecyclePhase.OFF & semantics.intentCode == ExactRequestCode.SWITCH_ON) {
          publish(api, entry, LifecyclePhase.STANDBY, LifecycleCase.L11, semantics, charge, ready, airborne)
        } else if (entry == LifecyclePhase.OFF) {
          publish(api, entry, LifecyclePhase.OFF, LifecycleCase.L12, semantics, charge, ready, airborne)
        } else if (entry == LifecyclePhase.STANDBY & semantics.intentCode == ExactRequestCode.SWITCH_OFF) {
          publish(api, entry, LifecyclePhase.OFF, LifecycleCase.L13, semantics, charge, ready, airborne)
        } else if (entry == LifecyclePhase.STANDBY & semantics.intentCode == ExactRequestCode.START_CHARGE & charge.entryEligible) {
          publish(api, entry, LifecyclePhase.CHARGING, LifecycleCase.L14, semantics, charge, ready, airborne)
        } else if (entry == LifecyclePhase.STANDBY & semantics.intentCode == ExactRequestCode.ACTIVATE & ready) {
          publish(api, entry, LifecyclePhase.READY, LifecycleCase.L15, semantics, charge, ready, airborne)
        } else if (entry == LifecyclePhase.STANDBY) {
          publish(api, entry, LifecyclePhase.STANDBY, LifecycleCase.L16, semantics, charge, ready, airborne)
        } else if (entry == LifecyclePhase.CHARGING & semantics.intentCode == ExactRequestCode.SWITCH_OFF) {
          publish(api, entry, LifecyclePhase.OFF, LifecycleCase.L17, semantics, charge, ready, airborne)
        } else if (entry == LifecyclePhase.CHARGING &
          (semantics.intentCode == ExactRequestCode.STOP_CHARGE | charge.exitRequired)) {
          publish(api, entry, LifecyclePhase.STANDBY, LifecycleCase.L18, semantics, charge, ready, airborne)
        } else if (entry == LifecyclePhase.CHARGING) {
          publish(api, entry, LifecyclePhase.CHARGING, LifecycleCase.L19, semantics, charge, ready, airborne)
        } else if (entry == LifecyclePhase.READY & semantics.intentCode == ExactRequestCode.SWITCH_OFF) {
          publish(api, entry, LifecyclePhase.OFF, LifecycleCase.L20, semantics, charge, ready, airborne)
        } else if (entry == LifecyclePhase.READY & semantics.intentCode == ExactRequestCode.DEACTIVATE) {
          publish(api, entry, LifecyclePhase.STANDBY, LifecycleCase.L21, semantics, charge, ready, airborne)
        } else if (entry == LifecyclePhase.READY & semantics.intentCode == ExactRequestCode.LAUNCH & ready) {
          publish(api, entry, LifecyclePhase.FLYING, LifecycleCase.L22, semantics, charge, ready, airborne)
        } else if (entry == LifecyclePhase.READY) {
          publish(api, entry, LifecyclePhase.READY, LifecycleCase.L23, semantics, charge, ready, airborne)
        } else if (entry == LifecyclePhase.FLYING) {
          publish(api, entry, LifecyclePhase.FLYING, LifecycleCase.L24, semantics, charge, ready, airborne)
        } else if (entry == LifecyclePhase.RETURNING) {
          publish(api, entry, LifecyclePhase.RETURNING, LifecycleCase.L25, semantics, charge, ready, airborne)
        } else {
          publish(api, entry, LifecyclePhase.LANDING, LifecycleCase.L26, semantics, charge, ready, airborne)
        }
      case _ =>
        val entry: LifecyclePhase.Type = phaseState
        phaseState = LifecyclePhase.STANDBY
        api.put_resolutionOut(LifecycleResolution(
          LifecycleCase.L09, sourceOf(entry), LifecyclePhase.STANDBY, F, F, F, F, F, F))
    }
  }

  def finalise(api: LifecyclePriorityOwner_Operational_Api): Unit = { }
}
