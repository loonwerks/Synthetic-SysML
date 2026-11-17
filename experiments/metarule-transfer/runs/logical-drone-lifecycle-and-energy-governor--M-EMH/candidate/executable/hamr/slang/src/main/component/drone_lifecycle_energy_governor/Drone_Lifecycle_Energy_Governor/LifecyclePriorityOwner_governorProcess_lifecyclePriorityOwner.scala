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
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_resolutionOut(Drone_Lifecycle_Energy_Governor.LifecycleResolution.example())
  }

  def timeTriggered(api: LifecyclePriorityOwner_Operational_Api): Unit = {
    Contract(
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee RESOLUTION_PRESERVATION
        api.resolutionOut.nextPhase == phaseState &
          api.resolutionOut.chargeRetentionEligible == api.chargeEligibilityIn.retentionEligible &
          api.resolutionOut.launchReady == api.readinessIn &
          api.resolutionOut.requestPresent == (api.semanticsIn.requestFamily != RequestFamily.ABSENT),
        // guarantee REQUEST_EFFECT_EVIDENCE
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
    // example api usage

    val apiUsage_semanticsIn: Option[Drone_Lifecycle_Energy_Governor.LifecycleClassifiedRequest] = api.get_semanticsIn()
    api.logInfo(s"Received on data port semanticsIn: ${apiUsage_semanticsIn}")
    val apiUsage_chargeEligibilityIn: Option[Drone_Lifecycle_Energy_Governor.ChargeEligibility] = api.get_chargeEligibilityIn()
    api.logInfo(s"Received on data port chargeEligibilityIn: ${apiUsage_chargeEligibilityIn}")
    val apiUsage_readinessIn: Option[Base_Types.Boolean] = api.get_readinessIn()
    api.logInfo(s"Received on data port readinessIn: ${apiUsage_readinessIn}")
    val apiUsage_homeFactsIn: Option[Drone_Lifecycle_Energy_Governor.HomeFacts] = api.get_homeFactsIn()
    api.logInfo(s"Received on data port homeFactsIn: ${apiUsage_homeFactsIn}")
    val apiUsage_touchdownFactsIn: Option[Drone_Lifecycle_Energy_Governor.TouchdownFacts] = api.get_touchdownFactsIn()
    api.logInfo(s"Received on data port touchdownFactsIn: ${apiUsage_touchdownFactsIn}")
    val apiUsage_hazardProposalIn: Option[Drone_Lifecycle_Energy_Governor.HazardProposal] = api.get_hazardProposalIn()
    api.logInfo(s"Received on data port hazardProposalIn: ${apiUsage_hazardProposalIn}")
    val apiUsage_airborneRequestIn: Option[Drone_Lifecycle_Energy_Governor.AirborneRequestProposal.Type] = api.get_airborneRequestIn()
    api.logInfo(s"Received on data port airborneRequestIn: ${apiUsage_airborneRequestIn}")
  }

  def finalise(api: LifecyclePriorityOwner_Operational_Api): Unit = { }
}
