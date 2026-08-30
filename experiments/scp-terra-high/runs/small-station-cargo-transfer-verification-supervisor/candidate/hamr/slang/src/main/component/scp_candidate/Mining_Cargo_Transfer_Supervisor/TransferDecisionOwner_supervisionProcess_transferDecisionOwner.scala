// #Sireum

package scp_candidate.Mining_Cargo_Transfer_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object TransferDecisionOwner_supervisionProcess_transferDecisionOwner {

  // BEGIN STATE VARS
  var transferPhase: Mining_Cargo_Transfer_Supervisor.TransferPhase.Type = Mining_Cargo_Transfer_Supervisor.TransferPhase.Idle

  var rearmRequired: Base_Types.Boolean = Base_Types.Boolean_example()
  // END STATE VARS

  // BEGIN FUNCTIONS
  @strictpure def g01Invalid(request: Mining_Cargo_Transfer_Supervisor.QualifiedRequest.Type, docking: Mining_Cargo_Transfer_Supervisor.DockingAssessment.Type, ship: Mining_Cargo_Transfer_Supervisor.QualifiedShipProgress.Type, warehouse: Mining_Cargo_Transfer_Supervisor.QualifiedWarehouseEvidence.Type): Base_Types.Boolean = request == QualifiedRequest.InvalidRequest ||
    docking == DockingAssessment.InvalidDocking ||
    ship == QualifiedShipProgress.InvalidShipProgress ||
    warehouse == QualifiedWarehouseEvidence.InvalidWarehouseEvidence

  @strictpure def neutral(request: Mining_Cargo_Transfer_Supervisor.QualifiedRequest.Type, ship: Mining_Cargo_Transfer_Supervisor.QualifiedShipProgress.Type, warehouse: Mining_Cargo_Transfer_Supervisor.QualifiedWarehouseEvidence.Type): Base_Types.Boolean = request == QualifiedRequest.NoQualifiedRequest &&
    ship == QualifiedShipProgress.ShipIdle &&
    warehouse == QualifiedWarehouseEvidence.NoQualifiedReceipt

  @strictpure def g02RearmBlocked(rearm: Base_Types.Boolean, request: Mining_Cargo_Transfer_Supervisor.QualifiedRequest.Type, ship: Mining_Cargo_Transfer_Supervisor.QualifiedShipProgress.Type, warehouse: Mining_Cargo_Transfer_Supervisor.QualifiedWarehouseEvidence.Type): Base_Types.Boolean = rearm && !(neutral(request, ship, warehouse))

  @strictpure def g03RearmCleared(rearm: Base_Types.Boolean, request: Mining_Cargo_Transfer_Supervisor.QualifiedRequest.Type, docking: Mining_Cargo_Transfer_Supervisor.DockingAssessment.Type, ship: Mining_Cargo_Transfer_Supervisor.QualifiedShipProgress.Type, warehouse: Mining_Cargo_Transfer_Supervisor.QualifiedWarehouseEvidence.Type): Base_Types.Boolean = rearm && !(g01Invalid(request, docking, ship, warehouse)) &&
    neutral(request, ship, warehouse)

  @strictpure def g04ActiveFault(phase: Mining_Cargo_Transfer_Supervisor.TransferPhase.Type, docking: Mining_Cargo_Transfer_Supervisor.DockingAssessment.Type, ship: Mining_Cargo_Transfer_Supervisor.QualifiedShipProgress.Type, warehouse: Mining_Cargo_Transfer_Supervisor.QualifiedWarehouseEvidence.Type): Base_Types.Boolean = (phase == TransferPhase.TransferOutstanding ||
     phase == TransferPhase.AwaitingReceipt) &&
    (docking == DockingAssessment.NotDockedAssessment ||
      ship == QualifiedShipProgress.ShipFailed ||
      warehouse == QualifiedWarehouseEvidence.QualifiedReceiptRejected ||
      phase == TransferPhase.TransferOutstanding &&
        warehouse == QualifiedWarehouseEvidence.QualifiedReceiptConfirmed &&
        ship != QualifiedShipProgress.ShipComplete ||
      phase == TransferPhase.AwaitingReceipt &&
        ship == QualifiedShipProgress.ShipInProgress)

  @strictpure def g05UnexpectedIdle(phase: Mining_Cargo_Transfer_Supervisor.TransferPhase.Type, ship: Mining_Cargo_Transfer_Supervisor.QualifiedShipProgress.Type, warehouse: Mining_Cargo_Transfer_Supervisor.QualifiedWarehouseEvidence.Type): Base_Types.Boolean = phase == TransferPhase.Idle &&
    (ship != QualifiedShipProgress.ShipIdle ||
      warehouse != QualifiedWarehouseEvidence.NoQualifiedReceipt)

  @strictpure def g06BeginAccepted(phase: Mining_Cargo_Transfer_Supervisor.TransferPhase.Type, request: Mining_Cargo_Transfer_Supervisor.QualifiedRequest.Type, docking: Mining_Cargo_Transfer_Supervisor.DockingAssessment.Type): Base_Types.Boolean = phase == TransferPhase.Idle &&
    request == QualifiedRequest.QualifiedOffloadRequest &&
    docking == DockingAssessment.DockedAssessment

  @strictpure def g07BeginDenied(phase: Mining_Cargo_Transfer_Supervisor.TransferPhase.Type, request: Mining_Cargo_Transfer_Supervisor.QualifiedRequest.Type, docking: Mining_Cargo_Transfer_Supervisor.DockingAssessment.Type): Base_Types.Boolean = phase == TransferPhase.Idle &&
    request == QualifiedRequest.QualifiedOffloadRequest &&
    docking == DockingAssessment.NotDockedAssessment

  @strictpure def g08VerifiedImmediate(phase: Mining_Cargo_Transfer_Supervisor.TransferPhase.Type, ship: Mining_Cargo_Transfer_Supervisor.QualifiedShipProgress.Type, warehouse: Mining_Cargo_Transfer_Supervisor.QualifiedWarehouseEvidence.Type): Base_Types.Boolean = phase == TransferPhase.TransferOutstanding &&
    ship == QualifiedShipProgress.ShipComplete &&
    warehouse == QualifiedWarehouseEvidence.QualifiedReceiptConfirmed

  @strictpure def g09ReceiptPending(phase: Mining_Cargo_Transfer_Supervisor.TransferPhase.Type, ship: Mining_Cargo_Transfer_Supervisor.QualifiedShipProgress.Type, warehouse: Mining_Cargo_Transfer_Supervisor.QualifiedWarehouseEvidence.Type): Base_Types.Boolean = phase == TransferPhase.TransferOutstanding &&
    ship == QualifiedShipProgress.ShipComplete &&
    warehouse == QualifiedWarehouseEvidence.NoQualifiedReceipt

  @strictpure def g10VerifiedDelayed(phase: Mining_Cargo_Transfer_Supervisor.TransferPhase.Type, warehouse: Mining_Cargo_Transfer_Supervisor.QualifiedWarehouseEvidence.Type): Base_Types.Boolean = phase == TransferPhase.AwaitingReceipt &&
    warehouse == QualifiedWarehouseEvidence.QualifiedReceiptConfirmed

  @strictpure def g11ActiveHolding(phase: Mining_Cargo_Transfer_Supervisor.TransferPhase.Type): Base_Types.Boolean = phase == TransferPhase.TransferOutstanding ||
    phase == TransferPhase.AwaitingReceipt
  // END FUNCTIONS

  def initialise(api: TransferDecisionOwner_Initialization_Api): Unit = {
    Contract(
      Modifies(transferPhase, rearmRequired, api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INIT_DECISION_OWNER
        transferPhase == TransferPhase.Idle &&
          !rearmRequired &&
          api.commandResolution.nextPhase == TransferPhase.Idle &&
          !(api.commandResolution.nextRearmRequired) &&
          api.commandResolution.disposition == TransferDisposition.IdleHolding &&
          api.reportResolution.nextPhase == TransferPhase.Idle &&
          !(api.reportResolution.nextRearmRequired) &&
          api.reportResolution.disposition == TransferDisposition.IdleHolding
        // END INITIALIZES ENSURES
      )
    )
    transferPhase = TransferPhase.Idle
    rearmRequired = false
    val resolution = TransferResolution(
      TransferPhase.Idle,
      false,
      TransferDisposition.IdleHolding)
    api.put_commandResolution(resolution)
    api.put_reportResolution(resolution)
  }

  def timeTriggered(api: TransferDecisionOwner_Operational_Api): Unit = {
    Contract(Modifies(transferPhase, rearmRequired, api))
    val request = api.get_qualifiedRequest().get
    val docking = api.get_dockingAssessment().get
    val ship = api.get_qualifiedShipProgress().get
    val warehouse = api.get_qualifiedWarehouseEvidence().get
    val priorPhase = transferPhase
    val priorRearm = rearmRequired
    val resolution: TransferResolution =
      if (g01Invalid(request, docking, ship, warehouse)) {
        TransferResolution(TransferPhase.Idle, true, TransferDisposition.InputFault)
      } else if (g02RearmBlocked(priorRearm, request, ship, warehouse)) {
        TransferResolution(TransferPhase.Idle, true, TransferDisposition.RearmBlocked)
      } else if (g03RearmCleared(priorRearm, request, docking, ship, warehouse)) {
        TransferResolution(TransferPhase.Idle, false, TransferDisposition.RearmCleared)
      } else if (g04ActiveFault(priorPhase, docking, ship, warehouse)) {
        TransferResolution(TransferPhase.Idle, true, TransferDisposition.ActiveEvidenceFault)
      } else if (g05UnexpectedIdle(priorPhase, ship, warehouse)) {
        TransferResolution(TransferPhase.Idle, true, TransferDisposition.UnexpectedIdleEvidence)
      } else if (g06BeginAccepted(priorPhase, request, docking)) {
        TransferResolution(TransferPhase.TransferOutstanding, false, TransferDisposition.BeginAccepted)
      } else if (g07BeginDenied(priorPhase, request, docking)) {
        TransferResolution(TransferPhase.Idle, true, TransferDisposition.BeginDenied)
      } else if (g08VerifiedImmediate(priorPhase, ship, warehouse)) {
        TransferResolution(TransferPhase.Idle, true, TransferDisposition.VerifiedImmediate)
      } else if (g09ReceiptPending(priorPhase, ship, warehouse)) {
        TransferResolution(TransferPhase.AwaitingReceipt, false, TransferDisposition.ReceiptPending)
      } else if (g10VerifiedDelayed(priorPhase, warehouse)) {
        TransferResolution(TransferPhase.Idle, true, TransferDisposition.VerifiedDelayed)
      } else if (g11ActiveHolding(priorPhase)) {
        TransferResolution(priorPhase, false, TransferDisposition.ActiveHolding)
      } else {
        TransferResolution(TransferPhase.Idle, false, TransferDisposition.IdleHolding)
    }
    transferPhase = resolution.nextPhase
    rearmRequired = resolution.nextRearmRequired
    api.put_commandResolution(resolution)
    api.put_reportResolution(resolution)
  }

  def finalise(api: TransferDecisionOwner_Operational_Api): Unit = { }
}
