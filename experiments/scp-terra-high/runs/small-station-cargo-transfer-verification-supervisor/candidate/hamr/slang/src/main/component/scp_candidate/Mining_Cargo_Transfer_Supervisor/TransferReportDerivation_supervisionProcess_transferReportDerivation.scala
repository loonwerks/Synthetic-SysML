// #Sireum

package scp_candidate.Mining_Cargo_Transfer_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object TransferReportDerivation_supervisionProcess_transferReportDerivation {

  // BEGIN FUNCTIONS
  @strictpure def statusFor(value: Mining_Cargo_Transfer_Supervisor.TransferResolution): Mining_Cargo_Transfer_Supervisor.TransferSupervisorStatus.Type = if (value.disposition == TransferDisposition.InputFault) TransferSupervisorStatus.InputFault else if (value.disposition == TransferDisposition.RearmBlocked) TransferSupervisorStatus.AwaitingNeutral else if (value.disposition == TransferDisposition.RearmCleared ||
          value.disposition == TransferDisposition.IdleHolding) TransferSupervisorStatus.Ready else if (value.disposition == TransferDisposition.ActiveEvidenceFault) TransferSupervisorStatus.EvidenceFault else if (value.disposition == TransferDisposition.UnexpectedIdleEvidence) TransferSupervisorStatus.UnexpectedEvidence else if (value.disposition == TransferDisposition.BeginAccepted) TransferSupervisorStatus.TransferStarted else if (value.disposition == TransferDisposition.BeginDenied) TransferSupervisorStatus.NotDocked else if (value.disposition == TransferDisposition.VerifiedImmediate ||
          value.disposition == TransferDisposition.VerifiedDelayed) TransferSupervisorStatus.TransferVerified else if (value.disposition == TransferDisposition.ReceiptPending) TransferSupervisorStatus.AwaitingReceipt else if (value.nextPhase == TransferPhase.TransferOutstanding) TransferSupervisorStatus.TransferActive else TransferSupervisorStatus.AwaitingReceipt

  @strictpure def findingFor(value: Mining_Cargo_Transfer_Supervisor.TransferResolution): Mining_Cargo_Transfer_Supervisor.TransferVerificationFinding.Type = if (value.disposition == TransferDisposition.ActiveEvidenceFault ||
        value.disposition == TransferDisposition.UnexpectedIdleEvidence) TransferVerificationFinding.Rejected else if (value.disposition == TransferDisposition.VerifiedImmediate ||
          value.disposition == TransferDisposition.VerifiedDelayed) TransferVerificationFinding.Verified else TransferVerificationFinding.NotEstablished
  // END FUNCTIONS

  def initialise(api: TransferReportDerivation_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INIT_REPORT_SAFE
        api.supervisorStatus == TransferSupervisorStatus.Ready &&
          api.verificationFinding == TransferVerificationFinding.NotEstablished
        // END INITIALIZES ENSURES
      )
    )
    api.put_supervisorStatus(TransferSupervisorStatus.Ready)
    api.put_verificationFinding(TransferVerificationFinding.NotEstablished)
  }

  def timeTriggered(api: TransferReportDerivation_Operational_Api): Unit = {
    Contract(Modifies(api))
    val resolution = api.get_resolution().get
    api.put_supervisorStatus(statusFor(resolution))
    api.put_verificationFinding(findingFor(resolution))
  }

  def finalise(api: TransferReportDerivation_Operational_Api): Unit = { }
}
