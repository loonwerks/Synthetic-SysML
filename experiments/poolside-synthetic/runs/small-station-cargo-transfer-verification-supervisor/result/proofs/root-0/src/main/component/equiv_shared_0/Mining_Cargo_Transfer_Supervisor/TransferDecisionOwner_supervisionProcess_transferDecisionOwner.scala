// #Sireum

package equiv_shared_0.Mining_Cargo_Transfer_Supervisor

import org.sireum._
import equiv_shared_0._

object TransferDecisionOwner_supervisionProcess_transferDecisionOwner {
  // BEGIN FUNCTIONS
  @strictpure def g01Invalid(request: Mining_Cargo_Transfer_Supervisor.QualifiedRequest.Type, docking: Mining_Cargo_Transfer_Supervisor.DockingAssessment.Type, ship: Mining_Cargo_Transfer_Supervisor.QualifiedShipProgress.Type, warehouse: Mining_Cargo_Transfer_Supervisor.QualifiedWarehouseEvidence.Type): Base_Types.Boolean = request == QualifiedRequest.InvalidRequest |
    docking == DockingAssessment.InvalidDocking |
    ship == QualifiedShipProgress.InvalidShipProgress |
    warehouse == QualifiedWarehouseEvidence.InvalidWarehouseEvidence

  @strictpure def neutral(request: Mining_Cargo_Transfer_Supervisor.QualifiedRequest.Type, ship: Mining_Cargo_Transfer_Supervisor.QualifiedShipProgress.Type, warehouse: Mining_Cargo_Transfer_Supervisor.QualifiedWarehouseEvidence.Type): Base_Types.Boolean = request == QualifiedRequest.NoQualifiedRequest &
    ship == QualifiedShipProgress.ShipIdle &
    warehouse == QualifiedWarehouseEvidence.NoQualifiedReceipt

  @strictpure def g02RearmBlocked(rearm: Base_Types.Boolean, request: Mining_Cargo_Transfer_Supervisor.QualifiedRequest.Type, ship: Mining_Cargo_Transfer_Supervisor.QualifiedShipProgress.Type, warehouse: Mining_Cargo_Transfer_Supervisor.QualifiedWarehouseEvidence.Type): Base_Types.Boolean = rearm & !(neutral(request, ship, warehouse))

  @strictpure def g03RearmCleared(rearm: Base_Types.Boolean, request: Mining_Cargo_Transfer_Supervisor.QualifiedRequest.Type, docking: Mining_Cargo_Transfer_Supervisor.DockingAssessment.Type, ship: Mining_Cargo_Transfer_Supervisor.QualifiedShipProgress.Type, warehouse: Mining_Cargo_Transfer_Supervisor.QualifiedWarehouseEvidence.Type): Base_Types.Boolean = rearm & !(g01Invalid(request, docking, ship, warehouse)) &
    neutral(request, ship, warehouse)

  @strictpure def g04ActiveFault(phase: Mining_Cargo_Transfer_Supervisor.TransferPhase.Type, docking: Mining_Cargo_Transfer_Supervisor.DockingAssessment.Type, ship: Mining_Cargo_Transfer_Supervisor.QualifiedShipProgress.Type, warehouse: Mining_Cargo_Transfer_Supervisor.QualifiedWarehouseEvidence.Type): Base_Types.Boolean = (phase == TransferPhase.TransferOutstanding |
     phase == TransferPhase.AwaitingReceipt) &
    (docking == DockingAssessment.NotDockedAssessment |
      ship == QualifiedShipProgress.ShipFailed |
      warehouse == QualifiedWarehouseEvidence.QualifiedReceiptRejected |
      phase == TransferPhase.TransferOutstanding &
        warehouse == QualifiedWarehouseEvidence.QualifiedReceiptConfirmed &
        ship != QualifiedShipProgress.ShipComplete |
      phase == TransferPhase.AwaitingReceipt &
        ship == QualifiedShipProgress.ShipInProgress)

  @strictpure def g05UnexpectedIdle(phase: Mining_Cargo_Transfer_Supervisor.TransferPhase.Type, ship: Mining_Cargo_Transfer_Supervisor.QualifiedShipProgress.Type, warehouse: Mining_Cargo_Transfer_Supervisor.QualifiedWarehouseEvidence.Type): Base_Types.Boolean = phase == TransferPhase.Idle &
    (ship != QualifiedShipProgress.ShipIdle |
      warehouse != QualifiedWarehouseEvidence.NoQualifiedReceipt)

  @strictpure def g06BeginAccepted(phase: Mining_Cargo_Transfer_Supervisor.TransferPhase.Type, request: Mining_Cargo_Transfer_Supervisor.QualifiedRequest.Type, docking: Mining_Cargo_Transfer_Supervisor.DockingAssessment.Type): Base_Types.Boolean = phase == TransferPhase.Idle &
    request == QualifiedRequest.QualifiedOffloadRequest &
    docking == DockingAssessment.DockedAssessment

  @strictpure def g07BeginDenied(phase: Mining_Cargo_Transfer_Supervisor.TransferPhase.Type, request: Mining_Cargo_Transfer_Supervisor.QualifiedRequest.Type, docking: Mining_Cargo_Transfer_Supervisor.DockingAssessment.Type): Base_Types.Boolean = phase == TransferPhase.Idle &
    request == QualifiedRequest.QualifiedOffloadRequest &
    docking == DockingAssessment.NotDockedAssessment

  @strictpure def g08VerifiedImmediate(phase: Mining_Cargo_Transfer_Supervisor.TransferPhase.Type, ship: Mining_Cargo_Transfer_Supervisor.QualifiedShipProgress.Type, warehouse: Mining_Cargo_Transfer_Supervisor.QualifiedWarehouseEvidence.Type): Base_Types.Boolean = phase == TransferPhase.TransferOutstanding &
    ship == QualifiedShipProgress.ShipComplete &
    warehouse == QualifiedWarehouseEvidence.QualifiedReceiptConfirmed

  @strictpure def g09ReceiptPending(phase: Mining_Cargo_Transfer_Supervisor.TransferPhase.Type, ship: Mining_Cargo_Transfer_Supervisor.QualifiedShipProgress.Type, warehouse: Mining_Cargo_Transfer_Supervisor.QualifiedWarehouseEvidence.Type): Base_Types.Boolean = phase == TransferPhase.TransferOutstanding &
    ship == QualifiedShipProgress.ShipComplete &
    warehouse == QualifiedWarehouseEvidence.NoQualifiedReceipt

  @strictpure def g10VerifiedDelayed(phase: Mining_Cargo_Transfer_Supervisor.TransferPhase.Type, warehouse: Mining_Cargo_Transfer_Supervisor.QualifiedWarehouseEvidence.Type): Base_Types.Boolean = phase == TransferPhase.AwaitingReceipt &
    warehouse == QualifiedWarehouseEvidence.QualifiedReceiptConfirmed

  @strictpure def g11ActiveHolding(phase: Mining_Cargo_Transfer_Supervisor.TransferPhase.Type): Base_Types.Boolean = phase == TransferPhase.TransferOutstanding |
    phase == TransferPhase.AwaitingReceipt
  // END FUNCTIONS
}
