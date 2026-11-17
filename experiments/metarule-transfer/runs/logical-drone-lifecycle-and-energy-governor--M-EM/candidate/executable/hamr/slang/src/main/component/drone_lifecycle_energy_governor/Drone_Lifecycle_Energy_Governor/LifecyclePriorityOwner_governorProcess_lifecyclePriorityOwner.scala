// #Sireum

package drone_lifecycle_energy_governor.Drone_Lifecycle_Energy_Governor

import org.sireum._
import drone_lifecycle_energy_governor._

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
      case (Some(semantics), Some(charge), Some(ready), Some(home), Some(touchdown), Some(hazard), Some(airborne)) =>
        val source = phaseState
        val result: (Drone_Lifecycle_Energy_Governor.LifecycleCase.Type,
          Drone_Lifecycle_Energy_Governor.LifecyclePhase.Type) =
          if ((source == Drone_Lifecycle_Energy_Governor.LifecyclePhase.FLYING ||
            source == Drone_Lifecycle_Energy_Governor.LifecyclePhase.RETURNING ||
            source == Drone_Lifecycle_Energy_Governor.LifecyclePhase.LANDING) && hazard.emergencyLand)
            (Drone_Lifecycle_Energy_Governor.LifecycleCase.L01, Drone_Lifecycle_Energy_Governor.LifecyclePhase.LANDING)
          else if (source == Drone_Lifecycle_Energy_Governor.LifecyclePhase.RETURNING && hazard.navigationUnusable)
            (Drone_Lifecycle_Energy_Governor.LifecycleCase.L02, Drone_Lifecycle_Energy_Governor.LifecyclePhase.LANDING)
          else if (source == Drone_Lifecycle_Energy_Governor.LifecyclePhase.FLYING && hazard.forcedReturn)
            (Drone_Lifecycle_Energy_Governor.LifecycleCase.L03, Drone_Lifecycle_Energy_Governor.LifecyclePhase.RETURNING)
          else if (((source == Drone_Lifecycle_Energy_Governor.LifecyclePhase.FLYING &&
            !hazard.forcedReturn) ||
            (source == Drone_Lifecycle_Energy_Governor.LifecyclePhase.RETURNING &&
              !hazard.navigationUnusable)) &&
            airborne == Drone_Lifecycle_Energy_Governor.AirborneRequestProposal.LAND_REQUESTED)
            (Drone_Lifecycle_Energy_Governor.LifecycleCase.L04, Drone_Lifecycle_Energy_Governor.LifecyclePhase.LANDING)
          else if (source == Drone_Lifecycle_Energy_Governor.LifecyclePhase.FLYING &&
            airborne == Drone_Lifecycle_Energy_Governor.AirborneRequestProposal.RETURN_REQUESTED)
            (Drone_Lifecycle_Energy_Governor.LifecycleCase.L05, Drone_Lifecycle_Energy_Governor.LifecyclePhase.RETURNING)
          else if (source == Drone_Lifecycle_Energy_Governor.LifecyclePhase.RETURNING && home.arrivalEstablished)
            (Drone_Lifecycle_Energy_Governor.LifecycleCase.L06, Drone_Lifecycle_Energy_Governor.LifecyclePhase.LANDING)
          else if (source == Drone_Lifecycle_Energy_Governor.LifecyclePhase.LANDING && touchdown.touchdownEstablished && ready)
            (Drone_Lifecycle_Energy_Governor.LifecycleCase.L07, Drone_Lifecycle_Energy_Governor.LifecyclePhase.READY)
          else if (source == Drone_Lifecycle_Energy_Governor.LifecyclePhase.LANDING && touchdown.touchdownEstablished)
            (Drone_Lifecycle_Energy_Governor.LifecycleCase.L08, Drone_Lifecycle_Energy_Governor.LifecyclePhase.STANDBY)
          else if ((source == Drone_Lifecycle_Energy_Governor.LifecyclePhase.STANDBY ||
            source == Drone_Lifecycle_Energy_Governor.LifecyclePhase.CHARGING ||
            source == Drone_Lifecycle_Energy_Governor.LifecyclePhase.READY) && hazard.batteryUnusable)
            (Drone_Lifecycle_Energy_Governor.LifecycleCase.L09, Drone_Lifecycle_Energy_Governor.LifecyclePhase.STANDBY)
          else if (source == Drone_Lifecycle_Energy_Governor.LifecyclePhase.READY && hazard.lowOrCritical)
            (Drone_Lifecycle_Energy_Governor.LifecycleCase.L10, Drone_Lifecycle_Energy_Governor.LifecyclePhase.STANDBY)
          else if (source == Drone_Lifecycle_Energy_Governor.LifecyclePhase.OFF &&
            semantics.intentCode == Drone_Lifecycle_Energy_Governor.ExactRequestCode.SWITCH_ON)
            (Drone_Lifecycle_Energy_Governor.LifecycleCase.L11, Drone_Lifecycle_Energy_Governor.LifecyclePhase.STANDBY)
          else if (source == Drone_Lifecycle_Energy_Governor.LifecyclePhase.OFF)
            (Drone_Lifecycle_Energy_Governor.LifecycleCase.L12, Drone_Lifecycle_Energy_Governor.LifecyclePhase.OFF)
          else if (source == Drone_Lifecycle_Energy_Governor.LifecyclePhase.STANDBY &&
            semantics.intentCode == Drone_Lifecycle_Energy_Governor.ExactRequestCode.SWITCH_OFF)
            (Drone_Lifecycle_Energy_Governor.LifecycleCase.L13, Drone_Lifecycle_Energy_Governor.LifecyclePhase.OFF)
          else if (source == Drone_Lifecycle_Energy_Governor.LifecyclePhase.STANDBY &&
            semantics.intentCode == Drone_Lifecycle_Energy_Governor.ExactRequestCode.START_CHARGE && charge.entryEligible)
            (Drone_Lifecycle_Energy_Governor.LifecycleCase.L14, Drone_Lifecycle_Energy_Governor.LifecyclePhase.CHARGING)
          else if (source == Drone_Lifecycle_Energy_Governor.LifecyclePhase.STANDBY &&
            semantics.intentCode == Drone_Lifecycle_Energy_Governor.ExactRequestCode.ACTIVATE && ready)
            (Drone_Lifecycle_Energy_Governor.LifecycleCase.L15, Drone_Lifecycle_Energy_Governor.LifecyclePhase.READY)
          else if (source == Drone_Lifecycle_Energy_Governor.LifecyclePhase.STANDBY)
            (Drone_Lifecycle_Energy_Governor.LifecycleCase.L16, Drone_Lifecycle_Energy_Governor.LifecyclePhase.STANDBY)
          else if (source == Drone_Lifecycle_Energy_Governor.LifecyclePhase.CHARGING &&
            semantics.intentCode == Drone_Lifecycle_Energy_Governor.ExactRequestCode.SWITCH_OFF)
            (Drone_Lifecycle_Energy_Governor.LifecycleCase.L17, Drone_Lifecycle_Energy_Governor.LifecyclePhase.OFF)
          else if (source == Drone_Lifecycle_Energy_Governor.LifecyclePhase.CHARGING &&
            (semantics.intentCode == Drone_Lifecycle_Energy_Governor.ExactRequestCode.STOP_CHARGE || charge.exitRequired))
            (Drone_Lifecycle_Energy_Governor.LifecycleCase.L18, Drone_Lifecycle_Energy_Governor.LifecyclePhase.STANDBY)
          else if (source == Drone_Lifecycle_Energy_Governor.LifecyclePhase.CHARGING)
            (Drone_Lifecycle_Energy_Governor.LifecycleCase.L19, Drone_Lifecycle_Energy_Governor.LifecyclePhase.CHARGING)
          else if (source == Drone_Lifecycle_Energy_Governor.LifecyclePhase.READY &&
            semantics.intentCode == Drone_Lifecycle_Energy_Governor.ExactRequestCode.SWITCH_OFF)
            (Drone_Lifecycle_Energy_Governor.LifecycleCase.L20, Drone_Lifecycle_Energy_Governor.LifecyclePhase.OFF)
          else if (source == Drone_Lifecycle_Energy_Governor.LifecyclePhase.READY &&
            semantics.intentCode == Drone_Lifecycle_Energy_Governor.ExactRequestCode.DEACTIVATE)
            (Drone_Lifecycle_Energy_Governor.LifecycleCase.L21, Drone_Lifecycle_Energy_Governor.LifecyclePhase.STANDBY)
          else if (source == Drone_Lifecycle_Energy_Governor.LifecyclePhase.READY &&
            semantics.intentCode == Drone_Lifecycle_Energy_Governor.ExactRequestCode.LAUNCH && ready)
            (Drone_Lifecycle_Energy_Governor.LifecycleCase.L22, Drone_Lifecycle_Energy_Governor.LifecyclePhase.FLYING)
          else if (source == Drone_Lifecycle_Energy_Governor.LifecyclePhase.READY)
            (Drone_Lifecycle_Energy_Governor.LifecycleCase.L23, Drone_Lifecycle_Energy_Governor.LifecyclePhase.READY)
          else if (source == Drone_Lifecycle_Energy_Governor.LifecyclePhase.FLYING)
            (Drone_Lifecycle_Energy_Governor.LifecycleCase.L24, Drone_Lifecycle_Energy_Governor.LifecyclePhase.FLYING)
          else if (source == Drone_Lifecycle_Energy_Governor.LifecyclePhase.RETURNING)
            (Drone_Lifecycle_Energy_Governor.LifecycleCase.L25, Drone_Lifecycle_Energy_Governor.LifecyclePhase.RETURNING)
          else
            (Drone_Lifecycle_Energy_Governor.LifecycleCase.L26, Drone_Lifecycle_Energy_Governor.LifecyclePhase.LANDING)
        phaseState = result._2
        val applicable = requestApplicable(source, semantics, charge, ready, airborne)
        val caused = requestCaused(result._1, semantics.intentCode)
        api.put_resolutionOut(Drone_Lifecycle_Energy_Governor.LifecycleResolution(
          result._1, sourcePhase(source), phaseState,
          semantics.requestFamily != Drone_Lifecycle_Energy_Governor.RequestFamily.ABSENT,
          applicable, caused, applicable && !caused,
          charge.retentionEligible, ready))
      case _ =>
        phaseState = Drone_Lifecycle_Energy_Governor.LifecyclePhase.OFF
        api.put_resolutionOut(Drone_Lifecycle_Energy_Governor.LifecycleResolution(
          Drone_Lifecycle_Energy_Governor.LifecycleCase.L12,
          Drone_Lifecycle_Energy_Governor.SourceLifecyclePhase.OFF,
          phaseState, F, F, F, F, F, F))
    }
  }

  def sourcePhase(phase: Drone_Lifecycle_Energy_Governor.LifecyclePhase.Type):
  Drone_Lifecycle_Energy_Governor.SourceLifecyclePhase.Type = {
    if (phase == Drone_Lifecycle_Energy_Governor.LifecyclePhase.STANDBY) {
      return Drone_Lifecycle_Energy_Governor.SourceLifecyclePhase.STANDBY
    } else if (phase == Drone_Lifecycle_Energy_Governor.LifecyclePhase.CHARGING) {
      return Drone_Lifecycle_Energy_Governor.SourceLifecyclePhase.CHARGING
    } else if (phase == Drone_Lifecycle_Energy_Governor.LifecyclePhase.READY) {
      return Drone_Lifecycle_Energy_Governor.SourceLifecyclePhase.READY
    } else if (phase == Drone_Lifecycle_Energy_Governor.LifecyclePhase.FLYING) {
      return Drone_Lifecycle_Energy_Governor.SourceLifecyclePhase.FLYING
    } else if (phase == Drone_Lifecycle_Energy_Governor.LifecyclePhase.RETURNING) {
      return Drone_Lifecycle_Energy_Governor.SourceLifecyclePhase.RETURNING
    } else if (phase == Drone_Lifecycle_Energy_Governor.LifecyclePhase.LANDING) {
      return Drone_Lifecycle_Energy_Governor.SourceLifecyclePhase.LANDING
    }
    return Drone_Lifecycle_Energy_Governor.SourceLifecyclePhase.OFF
  }

  def requestApplicable(
    phase: Drone_Lifecycle_Energy_Governor.LifecyclePhase.Type,
    semantics: Drone_Lifecycle_Energy_Governor.LifecycleClassifiedRequest,
    charge: Drone_Lifecycle_Energy_Governor.ChargeEligibility,
    ready: B,
    airborne: Drone_Lifecycle_Energy_Governor.AirborneRequestProposal.Type): B = {
    if (phase == Drone_Lifecycle_Energy_Governor.LifecyclePhase.OFF) {
      return semantics.intentCode == Drone_Lifecycle_Energy_Governor.ExactRequestCode.SWITCH_ON
    } else if (phase == Drone_Lifecycle_Energy_Governor.LifecyclePhase.STANDBY) {
      return semantics.intentCode == Drone_Lifecycle_Energy_Governor.ExactRequestCode.SWITCH_OFF ||
        (semantics.intentCode == Drone_Lifecycle_Energy_Governor.ExactRequestCode.START_CHARGE && charge.entryEligible) ||
        (semantics.intentCode == Drone_Lifecycle_Energy_Governor.ExactRequestCode.ACTIVATE && ready)
    } else if (phase == Drone_Lifecycle_Energy_Governor.LifecyclePhase.CHARGING) {
      return semantics.intentCode == Drone_Lifecycle_Energy_Governor.ExactRequestCode.SWITCH_OFF ||
        semantics.intentCode == Drone_Lifecycle_Energy_Governor.ExactRequestCode.STOP_CHARGE
    } else if (phase == Drone_Lifecycle_Energy_Governor.LifecyclePhase.READY) {
      return semantics.intentCode == Drone_Lifecycle_Energy_Governor.ExactRequestCode.SWITCH_OFF ||
        semantics.intentCode == Drone_Lifecycle_Energy_Governor.ExactRequestCode.DEACTIVATE ||
        (semantics.intentCode == Drone_Lifecycle_Energy_Governor.ExactRequestCode.LAUNCH && ready)
    } else if (phase == Drone_Lifecycle_Energy_Governor.LifecyclePhase.FLYING) {
      return airborne == Drone_Lifecycle_Energy_Governor.AirborneRequestProposal.RETURN_REQUESTED ||
        airborne == Drone_Lifecycle_Energy_Governor.AirborneRequestProposal.LAND_REQUESTED
    } else if (phase == Drone_Lifecycle_Energy_Governor.LifecyclePhase.RETURNING) {
      return airborne == Drone_Lifecycle_Energy_Governor.AirborneRequestProposal.LAND_REQUESTED
    }
    return F
  }

  def requestCaused(
    winner: Drone_Lifecycle_Energy_Governor.LifecycleCase.Type,
    request: Drone_Lifecycle_Energy_Governor.ExactRequestCode.Type): B = {
    if (winner == Drone_Lifecycle_Energy_Governor.LifecycleCase.L04) {
      return request == Drone_Lifecycle_Energy_Governor.ExactRequestCode.LAND
    } else if (winner == Drone_Lifecycle_Energy_Governor.LifecycleCase.L05) {
      return request == Drone_Lifecycle_Energy_Governor.ExactRequestCode.RETURN
    } else if (winner == Drone_Lifecycle_Energy_Governor.LifecycleCase.L11) {
      return request == Drone_Lifecycle_Energy_Governor.ExactRequestCode.SWITCH_ON
    } else if (winner == Drone_Lifecycle_Energy_Governor.LifecycleCase.L13 ||
      winner == Drone_Lifecycle_Energy_Governor.LifecycleCase.L17 ||
      winner == Drone_Lifecycle_Energy_Governor.LifecycleCase.L20) {
      return request == Drone_Lifecycle_Energy_Governor.ExactRequestCode.SWITCH_OFF
    } else if (winner == Drone_Lifecycle_Energy_Governor.LifecycleCase.L14) {
      return request == Drone_Lifecycle_Energy_Governor.ExactRequestCode.START_CHARGE
    } else if (winner == Drone_Lifecycle_Energy_Governor.LifecycleCase.L15) {
      return request == Drone_Lifecycle_Energy_Governor.ExactRequestCode.ACTIVATE
    } else if (winner == Drone_Lifecycle_Energy_Governor.LifecycleCase.L18) {
      return request == Drone_Lifecycle_Energy_Governor.ExactRequestCode.STOP_CHARGE
    } else if (winner == Drone_Lifecycle_Energy_Governor.LifecycleCase.L21) {
      return request == Drone_Lifecycle_Energy_Governor.ExactRequestCode.DEACTIVATE
    } else if (winner == Drone_Lifecycle_Energy_Governor.LifecycleCase.L22) {
      return request == Drone_Lifecycle_Energy_Governor.ExactRequestCode.LAUNCH
    }
    return F
  }

  def finalise(api: LifecyclePriorityOwner_Operational_Api): Unit = { }
}
