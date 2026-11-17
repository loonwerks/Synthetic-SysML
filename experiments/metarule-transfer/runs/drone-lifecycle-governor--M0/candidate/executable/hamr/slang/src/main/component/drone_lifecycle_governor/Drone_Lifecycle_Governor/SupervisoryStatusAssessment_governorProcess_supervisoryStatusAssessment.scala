// #Sireum

package drone_lifecycle_governor.Drone_Lifecycle_Governor

import org.sireum._
import drone_lifecycle_governor._

// This file will not be overwritten if HAMR codegen is rerun
object SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment {

  def initialise(api: SupervisoryStatusAssessment_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_pilotStatus(Drone_Lifecycle_Governor.PilotStatus(
      PilotLifecycleState.OFF, RequestDisposition.NO_CHANGE, PilotNotice.NONE))
  }

  def timeTriggered(api: SupervisoryStatusAssessment_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_20
        //   Publish lifecycle, disposition, and notice | N.md#CASE_20
        (api.decisionSnapshot.transitionResult == TransitionResult.NO_CHANGE |
          api.decisionSnapshot.transitionResult == TransitionResult.ACCEPTED |
          api.decisionSnapshot.transitionResult == TransitionResult.REJECTED |
          api.decisionSnapshot.transitionResult == TransitionResult.RECOVERY_APPLIED |
          api.decisionSnapshot.transitionResult == TransitionResult.FRESH_REQUEST_PREEMPTED) ___>: ((api.decisionSnapshot.nextState == DecisionNextState.OFF &
          api.pilotStatus.lifecycleState == PilotLifecycleState.OFF |
          api.decisionSnapshot.nextState == DecisionNextState.STANDBY &
            api.pilotStatus.lifecycleState == PilotLifecycleState.STANDBY |
          api.decisionSnapshot.nextState == DecisionNextState.CHARGING &
            api.pilotStatus.lifecycleState == PilotLifecycleState.CHARGING |
          api.decisionSnapshot.nextState == DecisionNextState.READY &
            api.pilotStatus.lifecycleState == PilotLifecycleState.READY |
          api.decisionSnapshot.nextState == DecisionNextState.FLYING &
            api.pilotStatus.lifecycleState == PilotLifecycleState.FLYING) &
          (api.decisionSnapshot.transitionResult == TransitionResult.NO_CHANGE &
            api.pilotStatus.requestDisposition == RequestDisposition.NO_CHANGE |
            api.decisionSnapshot.transitionResult == TransitionResult.ACCEPTED &
              api.pilotStatus.requestDisposition == RequestDisposition.ACCEPTED |
            api.decisionSnapshot.transitionResult == TransitionResult.REJECTED &
              api.pilotStatus.requestDisposition == RequestDisposition.REJECTED |
            api.decisionSnapshot.transitionResult == TransitionResult.RECOVERY_APPLIED &
              api.pilotStatus.requestDisposition == RequestDisposition.RECOVERY_APPLIED |
            api.decisionSnapshot.transitionResult == TransitionResult.FRESH_REQUEST_PREEMPTED &
              api.pilotStatus.requestDisposition == RequestDisposition.PREEMPTED) &
          (api.batteryQualification == BatteryQualification.UNAVAILABLE &
            api.pilotStatus.pilotNotice == PilotNotice.BATTERY_UNAVAILABLE |
            api.batteryQualification == BatteryQualification.INSUFFICIENT &
              api.pilotStatus.pilotNotice == PilotNotice.BATTERY_LOW |
            api.batteryQualification == BatteryQualification.SUFFICIENT &
              api.decisionSnapshot.decisionReason == EligibilityReason.BATTERY_UNAVAILABLE &
              api.pilotStatus.pilotNotice == PilotNotice.BATTERY_UNAVAILABLE |
            api.batteryQualification == BatteryQualification.SUFFICIENT &
              api.decisionSnapshot.decisionReason == EligibilityReason.BATTERY_LOW &
              api.pilotStatus.pilotNotice == PilotNotice.BATTERY_LOW |
            api.batteryQualification == BatteryQualification.SUFFICIENT &
              api.decisionSnapshot.decisionReason == EligibilityReason.FLIGHT_UNAVAILABLE &
              api.pilotStatus.pilotNotice == PilotNotice.FLIGHT_UNAVAILABLE |
            api.batteryQualification == BatteryQualification.SUFFICIENT &
              api.decisionSnapshot.decisionReason == EligibilityReason.FLIGHT_NOT_READY &
              api.pilotStatus.pilotNotice == PilotNotice.FLIGHT_NOT_READY |
            api.batteryQualification == BatteryQualification.SUFFICIENT &
              api.decisionSnapshot.decisionReason == EligibilityReason.CHARGER_DISCONNECTED &
              api.pilotStatus.pilotNotice == PilotNotice.CHARGER_DISCONNECTED |
            api.batteryQualification == BatteryQualification.SUFFICIENT &
              api.decisionSnapshot.decisionReason == EligibilityReason.NONE &
              api.decisionSnapshot.transitionResult == TransitionResult.REJECTED &
              api.pilotStatus.pilotNotice == PilotNotice.INAPPLICABLE_REQUEST |
            api.batteryQualification == BatteryQualification.SUFFICIENT &
              api.decisionSnapshot.decisionReason == EligibilityReason.NONE &
              api.decisionSnapshot.transitionResult != TransitionResult.REJECTED &
              api.pilotStatus.pilotNotice == PilotNotice.NONE))
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val decision = api.get_decisionSnapshot().get
    val battery = api.get_batteryQualification().get
    val lifecycle: PilotLifecycleState.Type =
      if (decision.nextState == DecisionNextState.OFF) PilotLifecycleState.OFF
      else if (decision.nextState == DecisionNextState.STANDBY) PilotLifecycleState.STANDBY
      else if (decision.nextState == DecisionNextState.CHARGING) PilotLifecycleState.CHARGING
      else if (decision.nextState == DecisionNextState.READY) PilotLifecycleState.READY
      else PilotLifecycleState.FLYING
    val disposition: RequestDisposition.Type =
      if (decision.transitionResult == TransitionResult.NO_CHANGE) RequestDisposition.NO_CHANGE
      else if (decision.transitionResult == TransitionResult.ACCEPTED) RequestDisposition.ACCEPTED
      else if (decision.transitionResult == TransitionResult.REJECTED) RequestDisposition.REJECTED
      else if (decision.transitionResult == TransitionResult.RECOVERY_APPLIED) RequestDisposition.RECOVERY_APPLIED
      else RequestDisposition.PREEMPTED
    val notice: PilotNotice.Type =
      if (battery == BatteryQualification.UNAVAILABLE) PilotNotice.BATTERY_UNAVAILABLE
      else if (battery == BatteryQualification.INSUFFICIENT) PilotNotice.BATTERY_LOW
      else if (decision.decisionReason == EligibilityReason.BATTERY_UNAVAILABLE) PilotNotice.BATTERY_UNAVAILABLE
      else if (decision.decisionReason == EligibilityReason.BATTERY_LOW) PilotNotice.BATTERY_LOW
      else if (decision.decisionReason == EligibilityReason.FLIGHT_UNAVAILABLE) PilotNotice.FLIGHT_UNAVAILABLE
      else if (decision.decisionReason == EligibilityReason.FLIGHT_NOT_READY) PilotNotice.FLIGHT_NOT_READY
      else if (decision.decisionReason == EligibilityReason.CHARGER_DISCONNECTED) PilotNotice.CHARGER_DISCONNECTED
      else if (decision.transitionResult == TransitionResult.REJECTED) PilotNotice.INAPPLICABLE_REQUEST
      else PilotNotice.NONE
    api.put_pilotStatus(Drone_Lifecycle_Governor.PilotStatus(lifecycle, disposition, notice))
  }

  def finalise(api: SupervisoryStatusAssessment_Operational_Api): Unit = { }
}
