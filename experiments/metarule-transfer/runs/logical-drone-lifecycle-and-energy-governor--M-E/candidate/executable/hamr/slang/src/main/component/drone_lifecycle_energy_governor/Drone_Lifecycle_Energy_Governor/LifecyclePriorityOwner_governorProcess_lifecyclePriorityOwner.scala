// #Sireum

package drone_lifecycle_energy_governor.Drone_Lifecycle_Energy_Governor

import org.sireum._
import drone_lifecycle_energy_governor._

// This file will not be overwritten if HAMR codegen is rerun
object LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner {

  // BEGIN STATE VARS
  var phaseState: Drone_Lifecycle_Energy_Governor.LifecyclePhase.Type = Drone_Lifecycle_Energy_Governor.LifecyclePhase.OFF
  // END STATE VARS

  def initialise(api: LifecyclePriorityOwner_Initialization_Api): Unit = {
    Contract(Modifies(api, phaseState))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_resolutionOut(Drone_Lifecycle_Energy_Governor.LifecycleResolution.example())
  }

  def timeTriggered(api: LifecyclePriorityOwner_Operational_Api): Unit = {
    Contract(
      Modifies(api, phaseState),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee RESOLUTION_PRESERVATION
        (phaseState == LifecyclePhase.OFF &
          api.resolutionOut.sourceLifecycleState == SourceLifecyclePhase.OFF |
          phaseState == LifecyclePhase.STANDBY &
            api.resolutionOut.sourceLifecycleState == SourceLifecyclePhase.STANDBY |
          phaseState == LifecyclePhase.CHARGING &
            api.resolutionOut.sourceLifecycleState == SourceLifecyclePhase.CHARGING |
          phaseState == LifecyclePhase.READY &
            api.resolutionOut.sourceLifecycleState == SourceLifecyclePhase.READY |
          phaseState == LifecyclePhase.FLYING &
            api.resolutionOut.sourceLifecycleState == SourceLifecyclePhase.FLYING |
          phaseState == LifecyclePhase.RETURNING &
            api.resolutionOut.sourceLifecycleState == SourceLifecyclePhase.RETURNING |
          phaseState == LifecyclePhase.LANDING &
            api.resolutionOut.sourceLifecycleState == SourceLifecyclePhase.LANDING) &
          api.resolutionOut.nextPhase == phaseState &
          api.resolutionOut.chargeRetentionEligible == api.chargeEligibilityIn.retentionEligible &
          api.resolutionOut.launchReady == api.readinessIn,
        // guarantee REQUEST_EFFECT_EVIDENCE
        api.resolutionOut.requestPresent == (api.semanticsIn.requestFamily != RequestFamily.ABSENT) &
          api.resolutionOut.requestDefeatedByPriority == (api.resolutionOut.requestApplicable & !(api.resolutionOut.requestCausedTransition)),
        // case CASE_L_01_AIRBORNE_EMERGENCY
        ((In(phaseState) == LifecyclePhase.FLYING |
          In(phaseState) == LifecyclePhase.RETURNING |
          In(phaseState) == LifecyclePhase.LANDING) &
          api.hazardProposalIn.emergencyLand) ___>: (phaseState == LifecyclePhase.LANDING &
          api.resolutionOut.winningCase == LifecycleCase.L01),
        // case CASE_L_02_RETURNING_NAVIGATION_LOSS
        (In(phaseState) == LifecyclePhase.RETURNING &
          !(api.hazardProposalIn.emergencyLand) &
          api.hazardProposalIn.navigationUnusable) ___>: (phaseState == LifecyclePhase.LANDING &
          api.resolutionOut.winningCase == LifecycleCase.L02),
        // case CASE_L_03_FLYING_FORCED_RETURN
        (In(phaseState) == LifecyclePhase.FLYING &
          !(api.hazardProposalIn.emergencyLand) &
          api.hazardProposalIn.forcedReturn) ___>: (phaseState == LifecyclePhase.RETURNING &
          api.resolutionOut.winningCase == LifecycleCase.L03),
        // case CASE_L_04_AIRBORNE_LAND_REQUEST
        ((In(phaseState) == LifecyclePhase.FLYING &
          !(api.hazardProposalIn.emergencyLand) &
          !(api.hazardProposalIn.forcedReturn) |
          In(phaseState) == LifecyclePhase.RETURNING &
            !(api.hazardProposalIn.emergencyLand) &
            !(api.hazardProposalIn.navigationUnusable)) &
          api.airborneRequestIn == AirborneRequestProposal.LAND_REQUESTED) ___>: (phaseState == LifecyclePhase.LANDING &
          api.resolutionOut.winningCase == LifecycleCase.L04),
        // case CASE_L_05_FLYING_RETURN_REQUEST
        (In(phaseState) == LifecyclePhase.FLYING &
          !(api.hazardProposalIn.emergencyLand) &
          !(api.hazardProposalIn.forcedReturn) &
          api.airborneRequestIn != AirborneRequestProposal.LAND_REQUESTED &
          api.airborneRequestIn == AirborneRequestProposal.RETURN_REQUESTED) ___>: (phaseState == LifecyclePhase.RETURNING &
          api.resolutionOut.winningCase == LifecycleCase.L05),
        // case CASE_L_06_QUALIFIED_ARRIVAL
        (In(phaseState) == LifecyclePhase.RETURNING &
          !(api.hazardProposalIn.emergencyLand) &
          !(api.hazardProposalIn.navigationUnusable) &
          api.airborneRequestIn != AirborneRequestProposal.LAND_REQUESTED &
          api.homeFactsIn.arrivalEstablished) ___>: (phaseState == LifecyclePhase.LANDING &
          api.resolutionOut.winningCase == LifecycleCase.L06),
        // case CASE_L_07_TOUCHDOWN_READY
        (In(phaseState) == LifecyclePhase.LANDING &
          !(api.hazardProposalIn.emergencyLand) &
          api.touchdownFactsIn.touchdownEstablished &
          api.readinessIn) ___>: (phaseState == LifecyclePhase.READY &
          api.resolutionOut.winningCase == LifecycleCase.L07),
        // case CASE_L_08_TOUCHDOWN_STANDBY
        (In(phaseState) == LifecyclePhase.LANDING &
          !(api.hazardProposalIn.emergencyLand) &
          api.touchdownFactsIn.touchdownEstablished &
          !(api.readinessIn)) ___>: (phaseState == LifecyclePhase.STANDBY &
          api.resolutionOut.winningCase == LifecycleCase.L08),
        // case CASE_L_09_GROUND_BATTERY_FALLBACK
        ((In(phaseState) == LifecyclePhase.STANDBY |
          In(phaseState) == LifecyclePhase.CHARGING |
          In(phaseState) == LifecyclePhase.READY) &
          api.hazardProposalIn.batteryUnusable) ___>: (phaseState == LifecyclePhase.STANDBY &
          api.resolutionOut.winningCase == LifecycleCase.L09),
        // case CASE_L_10_READY_LOW_FALLBACK
        (In(phaseState) == LifecyclePhase.READY &
          !(api.hazardProposalIn.batteryUnusable) &
          api.hazardProposalIn.lowOrCritical) ___>: (phaseState == LifecyclePhase.STANDBY &
          api.resolutionOut.winningCase == LifecycleCase.L10),
        // case CASE_L_11_SWITCH_ON
        (In(phaseState) == LifecyclePhase.OFF &
          api.semanticsIn.intentCode == ExactRequestCode.SWITCH_ON) ___>: (phaseState == LifecyclePhase.STANDBY &
          api.resolutionOut.winningCase == LifecycleCase.L11),
        // case CASE_L_12_OFF_HOLD
        (In(phaseState) == LifecyclePhase.OFF &
          api.semanticsIn.intentCode != ExactRequestCode.SWITCH_ON) ___>: (phaseState == LifecyclePhase.OFF &
          api.resolutionOut.winningCase == LifecycleCase.L12),
        // case CASE_L_13_STANDBY_SWITCH_OFF
        (In(phaseState) == LifecyclePhase.STANDBY &
          !(api.hazardProposalIn.batteryUnusable) &
          api.semanticsIn.intentCode == ExactRequestCode.SWITCH_OFF) ___>: (phaseState == LifecyclePhase.OFF &
          api.resolutionOut.winningCase == LifecycleCase.L13),
        // case CASE_L_14_START_CHARGE
        (In(phaseState) == LifecyclePhase.STANDBY &
          !(api.hazardProposalIn.batteryUnusable) &
          api.semanticsIn.intentCode != ExactRequestCode.SWITCH_OFF &
          api.semanticsIn.intentCode == ExactRequestCode.START_CHARGE &
          api.chargeEligibilityIn.entryEligible) ___>: (phaseState == LifecyclePhase.CHARGING &
          api.resolutionOut.winningCase == LifecycleCase.L14),
        // case CASE_L_15_ACTIVATE
        (In(phaseState) == LifecyclePhase.STANDBY &
          !(api.hazardProposalIn.batteryUnusable) &
          api.semanticsIn.intentCode != ExactRequestCode.SWITCH_OFF &
          !(api.semanticsIn.intentCode == ExactRequestCode.START_CHARGE &
            api.chargeEligibilityIn.entryEligible) &
          api.semanticsIn.intentCode == ExactRequestCode.ACTIVATE &
          api.readinessIn) ___>: (phaseState == LifecyclePhase.READY &
          api.resolutionOut.winningCase == LifecycleCase.L15),
        // case CASE_L_16_STANDBY_HOLD
        (In(phaseState) == LifecyclePhase.STANDBY &
          !(api.hazardProposalIn.batteryUnusable) &
          api.semanticsIn.intentCode != ExactRequestCode.SWITCH_OFF &
          !(api.semanticsIn.intentCode == ExactRequestCode.START_CHARGE &
            api.chargeEligibilityIn.entryEligible) &
          !(api.semanticsIn.intentCode == ExactRequestCode.ACTIVATE &
            api.readinessIn)) ___>: (phaseState == LifecyclePhase.STANDBY &
          api.resolutionOut.winningCase == LifecycleCase.L16),
        // case CASE_L_17_CHARGING_SWITCH_OFF
        (In(phaseState) == LifecyclePhase.CHARGING &
          !(api.hazardProposalIn.batteryUnusable) &
          api.semanticsIn.intentCode == ExactRequestCode.SWITCH_OFF) ___>: (phaseState == LifecyclePhase.OFF &
          api.resolutionOut.winningCase == LifecycleCase.L17),
        // case CASE_L_18_CHARGE_EXIT
        (In(phaseState) == LifecyclePhase.CHARGING &
          !(api.hazardProposalIn.batteryUnusable) &
          api.semanticsIn.intentCode != ExactRequestCode.SWITCH_OFF &
          (api.semanticsIn.intentCode == ExactRequestCode.STOP_CHARGE |
            api.chargeEligibilityIn.exitRequired)) ___>: (phaseState == LifecyclePhase.STANDBY &
          api.resolutionOut.winningCase == LifecycleCase.L18),
        // case CASE_L_19_CHARGING_HOLD
        (In(phaseState) == LifecyclePhase.CHARGING &
          !(api.hazardProposalIn.batteryUnusable) &
          api.semanticsIn.intentCode != ExactRequestCode.SWITCH_OFF &
          api.semanticsIn.intentCode != ExactRequestCode.STOP_CHARGE &
          !(api.chargeEligibilityIn.exitRequired)) ___>: (phaseState == LifecyclePhase.CHARGING &
          api.resolutionOut.winningCase == LifecycleCase.L19),
        // case CASE_L_20_READY_SWITCH_OFF
        (In(phaseState) == LifecyclePhase.READY &
          !(api.hazardProposalIn.batteryUnusable) &
          !(api.hazardProposalIn.lowOrCritical) &
          api.semanticsIn.intentCode == ExactRequestCode.SWITCH_OFF) ___>: (phaseState == LifecyclePhase.OFF &
          api.resolutionOut.winningCase == LifecycleCase.L20),
        // case CASE_L_21_DEACTIVATE
        (In(phaseState) == LifecyclePhase.READY &
          !(api.hazardProposalIn.batteryUnusable) &
          !(api.hazardProposalIn.lowOrCritical) &
          api.semanticsIn.intentCode != ExactRequestCode.SWITCH_OFF &
          api.semanticsIn.intentCode == ExactRequestCode.DEACTIVATE) ___>: (phaseState == LifecyclePhase.STANDBY &
          api.resolutionOut.winningCase == LifecycleCase.L21),
        // case CASE_L_22_LAUNCH
        (In(phaseState) == LifecyclePhase.READY &
          !(api.hazardProposalIn.batteryUnusable) &
          !(api.hazardProposalIn.lowOrCritical) &
          api.semanticsIn.intentCode != ExactRequestCode.SWITCH_OFF &
          api.semanticsIn.intentCode != ExactRequestCode.DEACTIVATE &
          api.semanticsIn.intentCode == ExactRequestCode.LAUNCH &
          api.readinessIn) ___>: (phaseState == LifecyclePhase.FLYING &
          api.resolutionOut.winningCase == LifecycleCase.L22),
        // case CASE_L_23_READY_HOLD
        (In(phaseState) == LifecyclePhase.READY &
          !(api.hazardProposalIn.batteryUnusable) &
          !(api.hazardProposalIn.lowOrCritical) &
          api.semanticsIn.intentCode != ExactRequestCode.SWITCH_OFF &
          api.semanticsIn.intentCode != ExactRequestCode.DEACTIVATE &
          !(api.semanticsIn.intentCode == ExactRequestCode.LAUNCH &
            api.readinessIn)) ___>: (phaseState == LifecyclePhase.READY &
          api.resolutionOut.winningCase == LifecycleCase.L23),
        // case CASE_L_24_FLYING_HOLD
        (In(phaseState) == LifecyclePhase.FLYING &
          !(api.hazardProposalIn.emergencyLand) &
          !(api.hazardProposalIn.forcedReturn) &
          api.airborneRequestIn != AirborneRequestProposal.LAND_REQUESTED &
          api.airborneRequestIn != AirborneRequestProposal.RETURN_REQUESTED) ___>: (phaseState == LifecyclePhase.FLYING &
          api.resolutionOut.winningCase == LifecycleCase.L24),
        // case CASE_L_25_RETURNING_HOLD
        (In(phaseState) == LifecyclePhase.RETURNING &
          !(api.hazardProposalIn.emergencyLand) &
          !(api.hazardProposalIn.navigationUnusable) &
          api.airborneRequestIn != AirborneRequestProposal.LAND_REQUESTED &
          !(api.homeFactsIn.arrivalEstablished)) ___>: (phaseState == LifecyclePhase.RETURNING &
          api.resolutionOut.winningCase == LifecycleCase.L25),
        // case CASE_L_26_LANDING_HOLD
        (In(phaseState) == LifecyclePhase.LANDING &
          !(api.hazardProposalIn.emergencyLand) &
          !(api.touchdownFactsIn.touchdownEstablished)) ___>: (phaseState == LifecyclePhase.LANDING &
          api.resolutionOut.winningCase == LifecycleCase.L26)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    (api.get_semanticsIn(), api.get_chargeEligibilityIn(), api.get_readinessIn(),
      api.get_homeFactsIn(), api.get_touchdownFactsIn(), api.get_hazardProposalIn(),
      api.get_airborneRequestIn()) match {
      case (Some(request), Some(charge), Some(ready), Some(home), Some(touchdown),
        Some(hazard), Some(airborne)) =>
        val old = phaseState
        val result: (LifecyclePhase.Type, LifecycleCase.Type) =
          if ((old == LifecyclePhase.FLYING | old == LifecyclePhase.RETURNING |
            old == LifecyclePhase.LANDING) & hazard.emergencyLand)
            (LifecyclePhase.LANDING, LifecycleCase.L01)
          else if (old == LifecyclePhase.RETURNING & hazard.navigationUnusable)
            (LifecyclePhase.LANDING, LifecycleCase.L02)
          else if (old == LifecyclePhase.FLYING & hazard.forcedReturn)
            (LifecyclePhase.RETURNING, LifecycleCase.L03)
          else if (((old == LifecyclePhase.FLYING & !hazard.forcedReturn) |
            (old == LifecyclePhase.RETURNING & !hazard.navigationUnusable)) &
            airborne == AirborneRequestProposal.LAND_REQUESTED)
            (LifecyclePhase.LANDING, LifecycleCase.L04)
          else if (old == LifecyclePhase.FLYING &
            airborne == AirborneRequestProposal.RETURN_REQUESTED)
            (LifecyclePhase.RETURNING, LifecycleCase.L05)
          else if (old == LifecyclePhase.RETURNING & home.arrivalEstablished)
            (LifecyclePhase.LANDING, LifecycleCase.L06)
          else if (old == LifecyclePhase.LANDING & touchdown.touchdownEstablished & ready)
            (LifecyclePhase.READY, LifecycleCase.L07)
          else if (old == LifecyclePhase.LANDING & touchdown.touchdownEstablished)
            (LifecyclePhase.STANDBY, LifecycleCase.L08)
          else if ((old == LifecyclePhase.STANDBY | old == LifecyclePhase.CHARGING |
            old == LifecyclePhase.READY) & hazard.batteryUnusable)
            (LifecyclePhase.STANDBY, LifecycleCase.L09)
          else if (old == LifecyclePhase.READY & hazard.lowOrCritical)
            (LifecyclePhase.STANDBY, LifecycleCase.L10)
          else if (old == LifecyclePhase.OFF & request.intentCode == ExactRequestCode.SWITCH_ON)
            (LifecyclePhase.STANDBY, LifecycleCase.L11)
          else if (old == LifecyclePhase.OFF) (LifecyclePhase.OFF, LifecycleCase.L12)
          else if (old == LifecyclePhase.STANDBY & request.intentCode == ExactRequestCode.SWITCH_OFF)
            (LifecyclePhase.OFF, LifecycleCase.L13)
          else if (old == LifecyclePhase.STANDBY &
            request.intentCode == ExactRequestCode.START_CHARGE & charge.entryEligible)
            (LifecyclePhase.CHARGING, LifecycleCase.L14)
          else if (old == LifecyclePhase.STANDBY &
            request.intentCode == ExactRequestCode.ACTIVATE & ready)
            (LifecyclePhase.READY, LifecycleCase.L15)
          else if (old == LifecyclePhase.STANDBY) (LifecyclePhase.STANDBY, LifecycleCase.L16)
          else if (old == LifecyclePhase.CHARGING & request.intentCode == ExactRequestCode.SWITCH_OFF)
            (LifecyclePhase.OFF, LifecycleCase.L17)
          else if (old == LifecyclePhase.CHARGING &
            (request.intentCode == ExactRequestCode.STOP_CHARGE | charge.exitRequired))
            (LifecyclePhase.STANDBY, LifecycleCase.L18)
          else if (old == LifecyclePhase.CHARGING) (LifecyclePhase.CHARGING, LifecycleCase.L19)
          else if (old == LifecyclePhase.READY & request.intentCode == ExactRequestCode.SWITCH_OFF)
            (LifecyclePhase.OFF, LifecycleCase.L20)
          else if (old == LifecyclePhase.READY & request.intentCode == ExactRequestCode.DEACTIVATE)
            (LifecyclePhase.STANDBY, LifecycleCase.L21)
          else if (old == LifecyclePhase.READY & request.intentCode == ExactRequestCode.LAUNCH & ready)
            (LifecyclePhase.FLYING, LifecycleCase.L22)
          else if (old == LifecyclePhase.READY) (LifecyclePhase.READY, LifecycleCase.L23)
          else if (old == LifecyclePhase.FLYING) (LifecyclePhase.FLYING, LifecycleCase.L24)
          else if (old == LifecyclePhase.RETURNING) (LifecyclePhase.RETURNING, LifecycleCase.L25)
          else (LifecyclePhase.LANDING, LifecycleCase.L26)
        phaseState = result._1
        val source: SourceLifecyclePhase.Type = result._1 match {
          case LifecyclePhase.OFF => SourceLifecyclePhase.OFF
          case LifecyclePhase.STANDBY => SourceLifecyclePhase.STANDBY
          case LifecyclePhase.CHARGING => SourceLifecyclePhase.CHARGING
          case LifecyclePhase.READY => SourceLifecyclePhase.READY
          case LifecyclePhase.FLYING => SourceLifecyclePhase.FLYING
          case LifecyclePhase.RETURNING => SourceLifecyclePhase.RETURNING
          case LifecyclePhase.LANDING => SourceLifecyclePhase.LANDING
        }
        val present = request.requestFamily != RequestFamily.ABSENT
        val caused = result._2 == LifecycleCase.L04 | result._2 == LifecycleCase.L05 |
          result._2 == LifecycleCase.L11 | result._2 == LifecycleCase.L13 |
          result._2 == LifecycleCase.L14 | result._2 == LifecycleCase.L15 |
          result._2 == LifecycleCase.L17 | result._2 == LifecycleCase.L18 |
          result._2 == LifecycleCase.L20 | result._2 == LifecycleCase.L21 |
          result._2 == LifecycleCase.L22
        api.put_resolutionOut(LifecycleResolution(result._2, source, result._1, present,
          present, caused, present & !caused, charge.retentionEligible, ready))
      case _ =>
        phaseState = LifecyclePhase.OFF
        api.put_resolutionOut(LifecycleResolution(LifecycleCase.L12, SourceLifecyclePhase.OFF,
          LifecyclePhase.OFF, F, F, F, F, F, F))
    }
  }

  def finalise(api: LifecyclePriorityOwner_Operational_Api): Unit = { }
}
