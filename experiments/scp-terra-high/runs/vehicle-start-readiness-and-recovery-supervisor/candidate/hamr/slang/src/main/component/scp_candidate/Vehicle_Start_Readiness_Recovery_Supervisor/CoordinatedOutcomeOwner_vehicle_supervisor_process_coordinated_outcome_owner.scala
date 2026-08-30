// #Sireum

package scp_candidate.Vehicle_Start_Readiness_Recovery_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner {

  def initialise(api: CoordinatedOutcomeOwner_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee c76
        api.control_frame.startEnable == StartEnable.Inhibit &&
          api.control_frame.parkingBrake == ParkingBrakeCommand.Apply &&
          api.control_frame.powerDisposition == PowerDisposition.Isolate &&
          api.control_frame.selfTestCommand == SelfTestCommand.None &&
          api.control_frame.lifecycleMode == ControlLifecycleMode.Off &&
          api.control_frame.status == SupervisoryStatus.Idle
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_control_frame(ControlFrame(
      StartEnable.Inhibit, ParkingBrakeCommand.Apply, PowerDisposition.Isolate,
      SelfTestCommand.None, ControlLifecycleMode.Off, SupervisoryStatus.Idle))
  }

  def compute(api: CoordinatedOutcomeOwner_Operational_Api): Unit = {
    Contract(Modifies(api))
    val authorization = api.get_authorization().getOrElse(StartAuthorizationFacts(StartDecision.NoStart, F))
    val lifecycle = api.get_applied_lifecycle().getOrElse(AppliedLifecycleSnapshot(
      LifecycleDirectiveSnapshot.None, LifecyclePreMode.Off, LifecycleMode.Off, LifecycleReason.Ordinary))
    val frame: ControlFrame =
      if (lifecycle.nextMode == LifecycleMode.Starting) {
        val command: SelfTestCommand.Type =
          if (lifecycle.cycleDirective == LifecycleDirectiveSnapshot.BeginStart) {
            SelfTestCommand.Initiate
          } else {
            SelfTestCommand.None
          }
        ControlFrame(StartEnable.Inhibit, ParkingBrakeCommand.Apply, PowerDisposition.TestOnly,
          command,
          ControlLifecycleMode.Starting, SupervisoryStatus.Testing)
      } else if (lifecycle.nextMode == LifecycleMode.On) {
        ControlFrame(StartEnable.Permit, ParkingBrakeCommand.Release, PowerDisposition.Enable,
          SelfTestCommand.None, ControlLifecycleMode.On, SupervisoryStatus.Operating)
      } else if (lifecycle.nextMode == LifecycleMode.Degraded) {
        val testing = lifecycle.cycleDirective == LifecycleDirectiveSnapshot.BeginRecovery ||
          lifecycle.reason == LifecycleReason.RecoveryAwaiting
        val command: SelfTestCommand.Type =
          if (lifecycle.cycleDirective == LifecycleDirectiveSnapshot.BeginRecovery) {
            SelfTestCommand.Initiate
          } else {
            SelfTestCommand.None
          }
        val status: SupervisoryStatus.Type =
          if (testing) {
            SupervisoryStatus.RecoveryTesting
          } else {
            SupervisoryStatus.Degraded
          }
        ControlFrame(StartEnable.Inhibit, ParkingBrakeCommand.Apply, PowerDisposition.Isolate,
          command, ControlLifecycleMode.Degraded, status)
      } else {
        val status: SupervisoryStatus.Type =
          if (lifecycle.reason == LifecycleReason.RecoveryCompleted) {
            SupervisoryStatus.RecoveredAwaitFreshStart
          } else if (authorization.decision == StartDecision.DenyInvalid) {
            SupervisoryStatus.StartBlockedInvalid
          } else if (authorization.decision == StartDecision.DenyNotReady) {
            SupervisoryStatus.StartBlockedNotReady
          } else if (authorization.conflict) {
            SupervisoryStatus.RequestConflict
          } else {
            SupervisoryStatus.Idle
          }
        ControlFrame(StartEnable.Inhibit, ParkingBrakeCommand.Apply, PowerDisposition.Isolate,
          SelfTestCommand.None, ControlLifecycleMode.Off, status)
      }
    api.put_control_frame(frame)
  }

  def timeTriggered(api: CoordinatedOutcomeOwner_Operational_Api): Unit = {
    Contract(Modifies(api))
    compute(api)
  }

  def finalise(api: CoordinatedOutcomeOwner_Operational_Api): Unit = { }
}
