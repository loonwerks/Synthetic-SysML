// #Sireum

package factory_flow.Factory_Flow

import org.sireum._
import factory_flow._

// This file will not be overwritten if HAMR codegen is rerun
object FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer {

  def initialise(api: FlowStatusDeterminer_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee SafeStatusInitialization
        //   During contract evaluation for the initialization phase,
        //   FlowStatusDeterminer shall set flowStatus to Factory Flow
        //   ProductionFlowStatus Idle.
        api.flowStatus == Factory_Flow.ProductionFlowStatus.Idle
        // END INITIALIZES ENSURES
      )
    )

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_flowStatus(Factory_Flow.ProductionFlowStatus.Idle)
  }

  def timeTriggered(api: FlowStatusDeterminer_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case TerminalCompleteStatus
        //   If appliedSnapshot phase is Factory Flow LedgerPhase
        //   TerminalComplete, FlowStatusDeterminer shall set flowStatus to
        //   Factory Flow ProductionFlowStatus Completed.
        (api.appliedSnapshot.phase == Factory_Flow.LedgerPhase.TerminalComplete) ___>: (
          api.flowStatus == Factory_Flow.ProductionFlowStatus.Completed),
        // case TerminalFailedStatus
        //   If appliedSnapshot phase is Factory Flow LedgerPhase
        //   TerminalFailed, FlowStatusDeterminer shall set flowStatus to
        //   Factory Flow ProductionFlowStatus Failed.
        (api.appliedSnapshot.phase == Factory_Flow.LedgerPhase.TerminalFailed) ___>: (
          api.flowStatus == Factory_Flow.ProductionFlowStatus.Failed),
        // case RecoveryPendingStatus
        //   If appliedSnapshot phase is Factory Flow LedgerPhase
        //   RecoveryPending, FlowStatusDeterminer shall set flowStatus to
        //   Factory Flow ProductionFlowStatus Recovering.
        (api.appliedSnapshot.phase == Factory_Flow.LedgerPhase.RecoveryPending) ___>: (
          api.flowStatus == Factory_Flow.ProductionFlowStatus.Recovering),
        // case RetryReleasedStatus
        //   If appliedSnapshot phase is Factory Flow LedgerPhase Active and
        //   decisionReason is Factory Flow DecisionReason RecoveryReleased,
        //   FlowStatusDeterminer shall set flowStatus to Factory Flow
        //   ProductionFlowStatus Recovering.
        (api.appliedSnapshot.phase == Factory_Flow.LedgerPhase.Active &
          api.decisionReason == Factory_Flow.DecisionReason.RecoveryReleased) ___>: (
          api.flowStatus == Factory_Flow.ProductionFlowStatus.Recovering),
        // case TransferPendingStatus
        //   If appliedSnapshot phase is Factory Flow LedgerPhase
        //   TransferPending, FlowStatusDeterminer shall set flowStatus to
        //   Factory Flow ProductionFlowStatus WaitingStation.
        (api.appliedSnapshot.phase == Factory_Flow.LedgerPhase.TransferPending) ___>: (
          api.flowStatus == Factory_Flow.ProductionFlowStatus.WaitingStation),
        // case RejectedStatus
        //   If appliedSnapshot phase is Factory Flow LedgerPhase Idle and
        //   decisionReason is Factory Flow DecisionReason MalformedRequest,
        //   FlowStatusDeterminer shall set flowStatus to Factory Flow
        //   ProductionFlowStatus Rejected.
        (api.appliedSnapshot.phase == Factory_Flow.LedgerPhase.Idle &
          api.decisionReason == Factory_Flow.DecisionReason.MalformedRequest) ___>: (
          api.flowStatus == Factory_Flow.ProductionFlowStatus.Rejected),
        // case MaterialWaitStatus
        //   If appliedSnapshot phase is Idle and (decisionReason is
        //   MaterialUnavailable or decisionReason is MaterialUnknown),
        //   FlowStatusDeterminer shall set flowStatus to WaitingMaterial.
        (api.appliedSnapshot.phase == Factory_Flow.LedgerPhase.Idle &
          (api.decisionReason == Factory_Flow.DecisionReason.MaterialUnavailable |
            api.decisionReason == Factory_Flow.DecisionReason.MaterialUnknown)) ___>: (
          api.flowStatus == Factory_Flow.ProductionFlowStatus.WaitingMaterial),
        // case HeatingWaitStatus
        //   If appliedSnapshot phase is Idle and (decisionReason is
        //   HeatingBlocked or decisionReason is HeatingUnknown),
        //   FlowStatusDeterminer shall set flowStatus to WaitingStation.
        (api.appliedSnapshot.phase == Factory_Flow.LedgerPhase.Idle &
          (api.decisionReason == Factory_Flow.DecisionReason.HeatingBlocked |
            api.decisionReason == Factory_Flow.DecisionReason.HeatingUnknown)) ___>: (
          api.flowStatus == Factory_Flow.ProductionFlowStatus.WaitingStation),
        // case StartedStatus
        //   If appliedSnapshot phase is Active and decisionReason is
        //   Started, FlowStatusDeterminer shall set flowStatus to Started.
        (api.appliedSnapshot.phase == Factory_Flow.LedgerPhase.Active &
          api.decisionReason == Factory_Flow.DecisionReason.Started) ___>: (
          api.flowStatus == Factory_Flow.ProductionFlowStatus.Started),
        // case AdvancedStatus
        //   If appliedSnapshot phase is Active and (decisionReason is
        //   Advanced or decisionReason is TransferReleased),
        //   FlowStatusDeterminer shall set flowStatus to Advanced.
        (api.appliedSnapshot.phase == Factory_Flow.LedgerPhase.Active &
          (api.decisionReason == Factory_Flow.DecisionReason.Advanced |
            api.decisionReason == Factory_Flow.DecisionReason.TransferReleased)) ___>: (
          api.flowStatus == Factory_Flow.ProductionFlowStatus.Advanced),
        // case BusyStatus
        //   If appliedSnapshot phase is Active and decisionReason is
        //   ProtectedBusy, FlowStatusDeterminer shall set flowStatus to Busy.
        (api.appliedSnapshot.phase == Factory_Flow.LedgerPhase.Active &
          api.decisionReason == Factory_Flow.DecisionReason.ProtectedBusy) ___>: (
          api.flowStatus == Factory_Flow.ProductionFlowStatus.Busy),
        // case ProcessingStatus
        //   If appliedSnapshot phase is Active and decisionReason is
        //   Processing, FlowStatusDeterminer shall set flowStatus to
        //   Processing.
        (api.appliedSnapshot.phase == Factory_Flow.LedgerPhase.Active &
          api.decisionReason == Factory_Flow.DecisionReason.Processing) ___>: (
          api.flowStatus == Factory_Flow.ProductionFlowStatus.Processing),
        // case IdleStatus
        //   If appliedSnapshot phase is Idle and (decisionReason is
        //   NoRequest or decisionReason is ResetComplete or
        //   decisionReason is ResetFailed), FlowStatusDeterminer shall set
        //   flowStatus to Idle.
        (api.appliedSnapshot.phase == Factory_Flow.LedgerPhase.Idle &
          (api.decisionReason == Factory_Flow.DecisionReason.NoRequest |
            api.decisionReason == Factory_Flow.DecisionReason.ResetComplete |
            api.decisionReason == Factory_Flow.DecisionReason.ResetFailed)) ___>: (
          api.flowStatus == Factory_Flow.ProductionFlowStatus.Idle)
        // END COMPUTE ENSURES timeTriggered
      )
    )

    val apiUsage_decisionReason: Option[Factory_Flow.DecisionReason.Type] = api.get_decisionReason()
    api.logInfo(s"Received on data port decisionReason: ${apiUsage_decisionReason}")
    val apiUsage_appliedSnapshot: Option[Factory_Flow.FlowSnapshot] = api.get_appliedSnapshot()
    api.logInfo(s"Received on data port appliedSnapshot: ${apiUsage_appliedSnapshot}")

    apiUsage_appliedSnapshot match {
      case Some(s) =>
        s.phase match {
          case Factory_Flow.LedgerPhase.TerminalComplete =>
            api.put_flowStatus(Factory_Flow.ProductionFlowStatus.Completed)
          case Factory_Flow.LedgerPhase.TerminalFailed =>
            api.put_flowStatus(Factory_Flow.ProductionFlowStatus.Failed)
          case Factory_Flow.LedgerPhase.RecoveryPending =>
            api.put_flowStatus(Factory_Flow.ProductionFlowStatus.Recovering)
          case Factory_Flow.LedgerPhase.TransferPending =>
            api.put_flowStatus(Factory_Flow.ProductionFlowStatus.WaitingStation)
          case Factory_Flow.LedgerPhase.Active =>
            apiUsage_decisionReason match {
              case Some(r) =>
                r match {
                  case Factory_Flow.DecisionReason.RecoveryReleased =>
                    api.put_flowStatus(Factory_Flow.ProductionFlowStatus.Recovering)
                  case Factory_Flow.DecisionReason.Started =>
                    api.put_flowStatus(Factory_Flow.ProductionFlowStatus.Started)
                  case Factory_Flow.DecisionReason.Advanced =>
                    api.put_flowStatus(Factory_Flow.ProductionFlowStatus.Advanced)
                  case Factory_Flow.DecisionReason.TransferReleased =>
                    api.put_flowStatus(Factory_Flow.ProductionFlowStatus.Advanced)
                  case Factory_Flow.DecisionReason.ProtectedBusy =>
                    api.put_flowStatus(Factory_Flow.ProductionFlowStatus.Busy)
                  case Factory_Flow.DecisionReason.Processing =>
                    api.put_flowStatus(Factory_Flow.ProductionFlowStatus.Processing)
                  case Factory_Flow.DecisionReason.MalformedRequest =>
                    api.put_flowStatus(Factory_Flow.ProductionFlowStatus.Rejected)
                  case Factory_Flow.DecisionReason.MaterialUnavailable =>
                    api.put_flowStatus(Factory_Flow.ProductionFlowStatus.WaitingMaterial)
                  case Factory_Flow.DecisionReason.MaterialUnknown =>
                    api.put_flowStatus(Factory_Flow.ProductionFlowStatus.WaitingMaterial)
                  case Factory_Flow.DecisionReason.HeatingBlocked =>
                    api.put_flowStatus(Factory_Flow.ProductionFlowStatus.WaitingStation)
                  case Factory_Flow.DecisionReason.HeatingUnknown =>
                    api.put_flowStatus(Factory_Flow.ProductionFlowStatus.WaitingStation)
                  case Factory_Flow.DecisionReason.NoRequest =>
                    api.put_flowStatus(Factory_Flow.ProductionFlowStatus.Idle)
                  case Factory_Flow.DecisionReason.ResetComplete =>
                    api.put_flowStatus(Factory_Flow.ProductionFlowStatus.Idle)
                  case Factory_Flow.DecisionReason.ResetFailed =>
                    api.put_flowStatus(Factory_Flow.ProductionFlowStatus.Idle)
                  case _ =>
                    api.put_flowStatus(Factory_Flow.ProductionFlowStatus.Idle)
                }
              case None() =>
                api.put_flowStatus(Factory_Flow.ProductionFlowStatus.Idle)
            }
          case Factory_Flow.LedgerPhase.Idle =>
            apiUsage_decisionReason match {
              case Some(r) =>
                r match {
                  case Factory_Flow.DecisionReason.MalformedRequest =>
                    api.put_flowStatus(Factory_Flow.ProductionFlowStatus.Rejected)
                  case Factory_Flow.DecisionReason.MaterialUnavailable =>
                    api.put_flowStatus(Factory_Flow.ProductionFlowStatus.WaitingMaterial)
                  case Factory_Flow.DecisionReason.MaterialUnknown =>
                    api.put_flowStatus(Factory_Flow.ProductionFlowStatus.WaitingMaterial)
                  case Factory_Flow.DecisionReason.HeatingBlocked =>
                    api.put_flowStatus(Factory_Flow.ProductionFlowStatus.WaitingStation)
                  case Factory_Flow.DecisionReason.HeatingUnknown =>
                    api.put_flowStatus(Factory_Flow.ProductionFlowStatus.WaitingStation)
                  case Factory_Flow.DecisionReason.NoRequest =>
                    api.put_flowStatus(Factory_Flow.ProductionFlowStatus.Idle)
                  case Factory_Flow.DecisionReason.ResetComplete =>
                    api.put_flowStatus(Factory_Flow.ProductionFlowStatus.Idle)
                  case Factory_Flow.DecisionReason.ResetFailed =>
                    api.put_flowStatus(Factory_Flow.ProductionFlowStatus.Idle)
                  case _ =>
                    api.put_flowStatus(Factory_Flow.ProductionFlowStatus.Idle)
                }
              case None() =>
                api.put_flowStatus(Factory_Flow.ProductionFlowStatus.Idle)
            }
          case _ =>
            api.put_flowStatus(Factory_Flow.ProductionFlowStatus.Idle)
        }
      case None() =>
        api.put_flowStatus(Factory_Flow.ProductionFlowStatus.Idle)
    }
  }

  def finalise(api: FlowStatusDeterminer_Operational_Api): Unit = { }
}
