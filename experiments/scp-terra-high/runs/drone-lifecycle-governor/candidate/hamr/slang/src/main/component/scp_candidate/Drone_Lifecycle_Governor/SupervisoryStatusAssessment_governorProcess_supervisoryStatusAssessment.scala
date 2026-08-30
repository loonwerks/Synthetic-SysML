// #Sireum

package scp_candidate.Drone_Lifecycle_Governor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment {

  def initialise(api: SupervisoryStatusAssessment_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee initialPilotStatus
        api.pilotStatus.lifecycleState == PilotLifecycleState.OFF &
          api.pilotStatus.requestDisposition == RequestDisposition.NO_CHANGE &
          api.pilotStatus.pilotNotice == PilotNotice.NONE
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_pilotStatus(Drone_Lifecycle_Governor.PilotStatus(
      Drone_Lifecycle_Governor.PilotLifecycleState.OFF,
      Drone_Lifecycle_Governor.RequestDisposition.NO_CHANGE,
      Drone_Lifecycle_Governor.PilotNotice.NONE))
  }

  def timeTriggered(api: SupervisoryStatusAssessment_Operational_Api): Unit = {
    Contract(Modifies(api))
    (api.get_decisionSnapshot(), api.get_batteryQualification()) match {
      case (Some(snapshot), Some(battery)) =>
        val lifecycle: Drone_Lifecycle_Governor.PilotLifecycleState.Type =
          if (snapshot.nextState == Drone_Lifecycle_Governor.DecisionNextState.OFF) Drone_Lifecycle_Governor.PilotLifecycleState.OFF
          else if (snapshot.nextState == Drone_Lifecycle_Governor.DecisionNextState.STANDBY) Drone_Lifecycle_Governor.PilotLifecycleState.STANDBY
          else if (snapshot.nextState == Drone_Lifecycle_Governor.DecisionNextState.CHARGING) Drone_Lifecycle_Governor.PilotLifecycleState.CHARGING
          else if (snapshot.nextState == Drone_Lifecycle_Governor.DecisionNextState.READY) Drone_Lifecycle_Governor.PilotLifecycleState.READY
          else Drone_Lifecycle_Governor.PilotLifecycleState.FLYING
        val disposition: Drone_Lifecycle_Governor.RequestDisposition.Type =
          if (snapshot.transitionResult == Drone_Lifecycle_Governor.TransitionResult.NO_CHANGE) Drone_Lifecycle_Governor.RequestDisposition.NO_CHANGE
          else if (snapshot.transitionResult == Drone_Lifecycle_Governor.TransitionResult.ACCEPTED) Drone_Lifecycle_Governor.RequestDisposition.ACCEPTED
          else if (snapshot.transitionResult == Drone_Lifecycle_Governor.TransitionResult.REJECTED) Drone_Lifecycle_Governor.RequestDisposition.REJECTED
          else if (snapshot.transitionResult == Drone_Lifecycle_Governor.TransitionResult.RECOVERY_APPLIED) Drone_Lifecycle_Governor.RequestDisposition.RECOVERY_APPLIED
          else Drone_Lifecycle_Governor.RequestDisposition.PREEMPTED
        val notice: Drone_Lifecycle_Governor.PilotNotice.Type =
          if (battery == Drone_Lifecycle_Governor.BatteryQualification.UNAVAILABLE) Drone_Lifecycle_Governor.PilotNotice.BATTERY_UNAVAILABLE
          else if (battery == Drone_Lifecycle_Governor.BatteryQualification.INSUFFICIENT) Drone_Lifecycle_Governor.PilotNotice.BATTERY_LOW
          else if (snapshot.decisionReason == Drone_Lifecycle_Governor.EligibilityReason.BATTERY_UNAVAILABLE) Drone_Lifecycle_Governor.PilotNotice.BATTERY_UNAVAILABLE
          else if (snapshot.decisionReason == Drone_Lifecycle_Governor.EligibilityReason.BATTERY_LOW) Drone_Lifecycle_Governor.PilotNotice.BATTERY_LOW
          else if (snapshot.decisionReason == Drone_Lifecycle_Governor.EligibilityReason.FLIGHT_UNAVAILABLE) Drone_Lifecycle_Governor.PilotNotice.FLIGHT_UNAVAILABLE
          else if (snapshot.decisionReason == Drone_Lifecycle_Governor.EligibilityReason.FLIGHT_NOT_READY) Drone_Lifecycle_Governor.PilotNotice.FLIGHT_NOT_READY
          else if (snapshot.decisionReason == Drone_Lifecycle_Governor.EligibilityReason.CHARGER_DISCONNECTED) Drone_Lifecycle_Governor.PilotNotice.CHARGER_DISCONNECTED
          else if (snapshot.transitionResult == Drone_Lifecycle_Governor.TransitionResult.REJECTED) Drone_Lifecycle_Governor.PilotNotice.INAPPLICABLE_REQUEST
          else Drone_Lifecycle_Governor.PilotNotice.NONE
        api.put_pilotStatus(Drone_Lifecycle_Governor.PilotStatus(lifecycle, disposition, notice))
    }
  }

  def finalise(api: SupervisoryStatusAssessment_Operational_Api): Unit = { }
}
