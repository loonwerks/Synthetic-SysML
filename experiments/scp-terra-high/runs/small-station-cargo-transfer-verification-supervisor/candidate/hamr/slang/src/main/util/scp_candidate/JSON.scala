// #Sireum
// @formatter:off

// This file is auto-generated from OffloadRequestEvent.scala, InputStatus.scala, QualifiedRequest.scala, DockingObservation.scala, DockingAssessment.scala, ShipTransferProgress.scala, QualifiedShipProgress.scala, WarehouseReceiptEvidence.scala, QualifiedWarehouseEvidence.scala, TransferPhase.scala, TransferDisposition.scala, CargoTransferCommand.scala, TransferSupervisorStatus.scala, TransferVerificationFinding.scala, OffloadRequestSample.scala, DockingSample.scala, ShipTransferSample.scala, WarehouseReceiptSample.scala, TransferResolution.scala, Base_Types.scala, RequestQualification_supervisionProcess_requestQualification_Containers.scala, DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_Containers.scala, ShipProgressQualification_supervisionProcess_shipProgressQualification_Containers.scala, WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_Containers.scala, TransferDecisionOwner_supervisionProcess_transferDecisionOwner_Containers.scala, TransferCommandDerivation_supervisionProcess_transferCommandDerivation_Containers.scala, TransferReportDerivation_supervisionProcess_transferReportDerivation_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package scp_candidate

import org.sireum._
import org.sireum.Json.Printer._

object JSON {

  object Printer {

    @pure def printMining_Cargo_Transfer_SupervisorOffloadRequestEventType(o: Mining_Cargo_Transfer_Supervisor.OffloadRequestEvent.Type): ST = {
      val value: String = o match {
        case Mining_Cargo_Transfer_Supervisor.OffloadRequestEvent.NoRequest => "NoRequest"
        case Mining_Cargo_Transfer_Supervisor.OffloadRequestEvent.OffloadRequested => "OffloadRequested"
      }
      return printObject(ISZ(
        ("type", printString("Mining_Cargo_Transfer_Supervisor.OffloadRequestEvent")),
        ("value", printString(value))
      ))
    }

    @pure def printMining_Cargo_Transfer_SupervisorOffloadRequestEvent_Payload(o: Mining_Cargo_Transfer_Supervisor.OffloadRequestEvent_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Supervisor.OffloadRequestEvent_Payload""""),
        ("value", printMining_Cargo_Transfer_SupervisorOffloadRequestEventType(o.value))
      ))
    }

    @pure def printMining_Cargo_Transfer_SupervisorInputStatusType(o: Mining_Cargo_Transfer_Supervisor.InputStatus.Type): ST = {
      val value: String = o match {
        case Mining_Cargo_Transfer_Supervisor.InputStatus.Valid => "Valid"
        case Mining_Cargo_Transfer_Supervisor.InputStatus.Invalid => "Invalid"
      }
      return printObject(ISZ(
        ("type", printString("Mining_Cargo_Transfer_Supervisor.InputStatus")),
        ("value", printString(value))
      ))
    }

    @pure def printMining_Cargo_Transfer_SupervisorInputStatus_Payload(o: Mining_Cargo_Transfer_Supervisor.InputStatus_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Supervisor.InputStatus_Payload""""),
        ("value", printMining_Cargo_Transfer_SupervisorInputStatusType(o.value))
      ))
    }

    @pure def printMining_Cargo_Transfer_SupervisorQualifiedRequestType(o: Mining_Cargo_Transfer_Supervisor.QualifiedRequest.Type): ST = {
      val value: String = o match {
        case Mining_Cargo_Transfer_Supervisor.QualifiedRequest.InvalidRequest => "InvalidRequest"
        case Mining_Cargo_Transfer_Supervisor.QualifiedRequest.NoQualifiedRequest => "NoQualifiedRequest"
        case Mining_Cargo_Transfer_Supervisor.QualifiedRequest.QualifiedOffloadRequest => "QualifiedOffloadRequest"
      }
      return printObject(ISZ(
        ("type", printString("Mining_Cargo_Transfer_Supervisor.QualifiedRequest")),
        ("value", printString(value))
      ))
    }

    @pure def printMining_Cargo_Transfer_SupervisorQualifiedRequest_Payload(o: Mining_Cargo_Transfer_Supervisor.QualifiedRequest_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Supervisor.QualifiedRequest_Payload""""),
        ("value", printMining_Cargo_Transfer_SupervisorQualifiedRequestType(o.value))
      ))
    }

    @pure def printMining_Cargo_Transfer_SupervisorDockingObservationType(o: Mining_Cargo_Transfer_Supervisor.DockingObservation.Type): ST = {
      val value: String = o match {
        case Mining_Cargo_Transfer_Supervisor.DockingObservation.NotDocked => "NotDocked"
        case Mining_Cargo_Transfer_Supervisor.DockingObservation.Docked => "Docked"
      }
      return printObject(ISZ(
        ("type", printString("Mining_Cargo_Transfer_Supervisor.DockingObservation")),
        ("value", printString(value))
      ))
    }

    @pure def printMining_Cargo_Transfer_SupervisorDockingObservation_Payload(o: Mining_Cargo_Transfer_Supervisor.DockingObservation_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Supervisor.DockingObservation_Payload""""),
        ("value", printMining_Cargo_Transfer_SupervisorDockingObservationType(o.value))
      ))
    }

    @pure def printMining_Cargo_Transfer_SupervisorDockingAssessmentType(o: Mining_Cargo_Transfer_Supervisor.DockingAssessment.Type): ST = {
      val value: String = o match {
        case Mining_Cargo_Transfer_Supervisor.DockingAssessment.InvalidDocking => "InvalidDocking"
        case Mining_Cargo_Transfer_Supervisor.DockingAssessment.NotDockedAssessment => "NotDockedAssessment"
        case Mining_Cargo_Transfer_Supervisor.DockingAssessment.DockedAssessment => "DockedAssessment"
      }
      return printObject(ISZ(
        ("type", printString("Mining_Cargo_Transfer_Supervisor.DockingAssessment")),
        ("value", printString(value))
      ))
    }

    @pure def printMining_Cargo_Transfer_SupervisorDockingAssessment_Payload(o: Mining_Cargo_Transfer_Supervisor.DockingAssessment_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Supervisor.DockingAssessment_Payload""""),
        ("value", printMining_Cargo_Transfer_SupervisorDockingAssessmentType(o.value))
      ))
    }

    @pure def printMining_Cargo_Transfer_SupervisorShipTransferProgressType(o: Mining_Cargo_Transfer_Supervisor.ShipTransferProgress.Type): ST = {
      val value: String = o match {
        case Mining_Cargo_Transfer_Supervisor.ShipTransferProgress.Idle => "Idle"
        case Mining_Cargo_Transfer_Supervisor.ShipTransferProgress.InProgress => "InProgress"
        case Mining_Cargo_Transfer_Supervisor.ShipTransferProgress.Complete => "Complete"
        case Mining_Cargo_Transfer_Supervisor.ShipTransferProgress.Failed => "Failed"
      }
      return printObject(ISZ(
        ("type", printString("Mining_Cargo_Transfer_Supervisor.ShipTransferProgress")),
        ("value", printString(value))
      ))
    }

    @pure def printMining_Cargo_Transfer_SupervisorShipTransferProgress_Payload(o: Mining_Cargo_Transfer_Supervisor.ShipTransferProgress_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Supervisor.ShipTransferProgress_Payload""""),
        ("value", printMining_Cargo_Transfer_SupervisorShipTransferProgressType(o.value))
      ))
    }

    @pure def printMining_Cargo_Transfer_SupervisorQualifiedShipProgressType(o: Mining_Cargo_Transfer_Supervisor.QualifiedShipProgress.Type): ST = {
      val value: String = o match {
        case Mining_Cargo_Transfer_Supervisor.QualifiedShipProgress.InvalidShipProgress => "InvalidShipProgress"
        case Mining_Cargo_Transfer_Supervisor.QualifiedShipProgress.ShipIdle => "ShipIdle"
        case Mining_Cargo_Transfer_Supervisor.QualifiedShipProgress.ShipInProgress => "ShipInProgress"
        case Mining_Cargo_Transfer_Supervisor.QualifiedShipProgress.ShipComplete => "ShipComplete"
        case Mining_Cargo_Transfer_Supervisor.QualifiedShipProgress.ShipFailed => "ShipFailed"
      }
      return printObject(ISZ(
        ("type", printString("Mining_Cargo_Transfer_Supervisor.QualifiedShipProgress")),
        ("value", printString(value))
      ))
    }

    @pure def printMining_Cargo_Transfer_SupervisorQualifiedShipProgress_Payload(o: Mining_Cargo_Transfer_Supervisor.QualifiedShipProgress_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Supervisor.QualifiedShipProgress_Payload""""),
        ("value", printMining_Cargo_Transfer_SupervisorQualifiedShipProgressType(o.value))
      ))
    }

    @pure def printMining_Cargo_Transfer_SupervisorWarehouseReceiptEvidenceType(o: Mining_Cargo_Transfer_Supervisor.WarehouseReceiptEvidence.Type): ST = {
      val value: String = o match {
        case Mining_Cargo_Transfer_Supervisor.WarehouseReceiptEvidence.NoReceipt => "NoReceipt"
        case Mining_Cargo_Transfer_Supervisor.WarehouseReceiptEvidence.ReceiptConfirmed => "ReceiptConfirmed"
        case Mining_Cargo_Transfer_Supervisor.WarehouseReceiptEvidence.ReceiptRejected => "ReceiptRejected"
      }
      return printObject(ISZ(
        ("type", printString("Mining_Cargo_Transfer_Supervisor.WarehouseReceiptEvidence")),
        ("value", printString(value))
      ))
    }

    @pure def printMining_Cargo_Transfer_SupervisorWarehouseReceiptEvidence_Payload(o: Mining_Cargo_Transfer_Supervisor.WarehouseReceiptEvidence_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Supervisor.WarehouseReceiptEvidence_Payload""""),
        ("value", printMining_Cargo_Transfer_SupervisorWarehouseReceiptEvidenceType(o.value))
      ))
    }

    @pure def printMining_Cargo_Transfer_SupervisorQualifiedWarehouseEvidenceType(o: Mining_Cargo_Transfer_Supervisor.QualifiedWarehouseEvidence.Type): ST = {
      val value: String = o match {
        case Mining_Cargo_Transfer_Supervisor.QualifiedWarehouseEvidence.InvalidWarehouseEvidence => "InvalidWarehouseEvidence"
        case Mining_Cargo_Transfer_Supervisor.QualifiedWarehouseEvidence.NoQualifiedReceipt => "NoQualifiedReceipt"
        case Mining_Cargo_Transfer_Supervisor.QualifiedWarehouseEvidence.QualifiedReceiptConfirmed => "QualifiedReceiptConfirmed"
        case Mining_Cargo_Transfer_Supervisor.QualifiedWarehouseEvidence.QualifiedReceiptRejected => "QualifiedReceiptRejected"
      }
      return printObject(ISZ(
        ("type", printString("Mining_Cargo_Transfer_Supervisor.QualifiedWarehouseEvidence")),
        ("value", printString(value))
      ))
    }

    @pure def printMining_Cargo_Transfer_SupervisorQualifiedWarehouseEvidence_Payload(o: Mining_Cargo_Transfer_Supervisor.QualifiedWarehouseEvidence_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Supervisor.QualifiedWarehouseEvidence_Payload""""),
        ("value", printMining_Cargo_Transfer_SupervisorQualifiedWarehouseEvidenceType(o.value))
      ))
    }

    @pure def printMining_Cargo_Transfer_SupervisorTransferPhaseType(o: Mining_Cargo_Transfer_Supervisor.TransferPhase.Type): ST = {
      val value: String = o match {
        case Mining_Cargo_Transfer_Supervisor.TransferPhase.Idle => "Idle"
        case Mining_Cargo_Transfer_Supervisor.TransferPhase.TransferOutstanding => "TransferOutstanding"
        case Mining_Cargo_Transfer_Supervisor.TransferPhase.AwaitingReceipt => "AwaitingReceipt"
      }
      return printObject(ISZ(
        ("type", printString("Mining_Cargo_Transfer_Supervisor.TransferPhase")),
        ("value", printString(value))
      ))
    }

    @pure def printMining_Cargo_Transfer_SupervisorTransferPhase_Payload(o: Mining_Cargo_Transfer_Supervisor.TransferPhase_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Supervisor.TransferPhase_Payload""""),
        ("value", printMining_Cargo_Transfer_SupervisorTransferPhaseType(o.value))
      ))
    }

    @pure def printMining_Cargo_Transfer_SupervisorTransferDispositionType(o: Mining_Cargo_Transfer_Supervisor.TransferDisposition.Type): ST = {
      val value: String = o match {
        case Mining_Cargo_Transfer_Supervisor.TransferDisposition.InputFault => "InputFault"
        case Mining_Cargo_Transfer_Supervisor.TransferDisposition.RearmBlocked => "RearmBlocked"
        case Mining_Cargo_Transfer_Supervisor.TransferDisposition.RearmCleared => "RearmCleared"
        case Mining_Cargo_Transfer_Supervisor.TransferDisposition.ActiveEvidenceFault => "ActiveEvidenceFault"
        case Mining_Cargo_Transfer_Supervisor.TransferDisposition.UnexpectedIdleEvidence => "UnexpectedIdleEvidence"
        case Mining_Cargo_Transfer_Supervisor.TransferDisposition.BeginAccepted => "BeginAccepted"
        case Mining_Cargo_Transfer_Supervisor.TransferDisposition.BeginDenied => "BeginDenied"
        case Mining_Cargo_Transfer_Supervisor.TransferDisposition.VerifiedImmediate => "VerifiedImmediate"
        case Mining_Cargo_Transfer_Supervisor.TransferDisposition.ReceiptPending => "ReceiptPending"
        case Mining_Cargo_Transfer_Supervisor.TransferDisposition.VerifiedDelayed => "VerifiedDelayed"
        case Mining_Cargo_Transfer_Supervisor.TransferDisposition.ActiveHolding => "ActiveHolding"
        case Mining_Cargo_Transfer_Supervisor.TransferDisposition.IdleHolding => "IdleHolding"
      }
      return printObject(ISZ(
        ("type", printString("Mining_Cargo_Transfer_Supervisor.TransferDisposition")),
        ("value", printString(value))
      ))
    }

    @pure def printMining_Cargo_Transfer_SupervisorTransferDisposition_Payload(o: Mining_Cargo_Transfer_Supervisor.TransferDisposition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Supervisor.TransferDisposition_Payload""""),
        ("value", printMining_Cargo_Transfer_SupervisorTransferDispositionType(o.value))
      ))
    }

    @pure def printMining_Cargo_Transfer_SupervisorCargoTransferCommandType(o: Mining_Cargo_Transfer_Supervisor.CargoTransferCommand.Type): ST = {
      val value: String = o match {
        case Mining_Cargo_Transfer_Supervisor.CargoTransferCommand.Hold => "Hold"
        case Mining_Cargo_Transfer_Supervisor.CargoTransferCommand.BeginOffload => "BeginOffload"
      }
      return printObject(ISZ(
        ("type", printString("Mining_Cargo_Transfer_Supervisor.CargoTransferCommand")),
        ("value", printString(value))
      ))
    }

    @pure def printMining_Cargo_Transfer_SupervisorCargoTransferCommand_Payload(o: Mining_Cargo_Transfer_Supervisor.CargoTransferCommand_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Supervisor.CargoTransferCommand_Payload""""),
        ("value", printMining_Cargo_Transfer_SupervisorCargoTransferCommandType(o.value))
      ))
    }

    @pure def printMining_Cargo_Transfer_SupervisorTransferSupervisorStatusType(o: Mining_Cargo_Transfer_Supervisor.TransferSupervisorStatus.Type): ST = {
      val value: String = o match {
        case Mining_Cargo_Transfer_Supervisor.TransferSupervisorStatus.Ready => "Ready"
        case Mining_Cargo_Transfer_Supervisor.TransferSupervisorStatus.NotDocked => "NotDocked"
        case Mining_Cargo_Transfer_Supervisor.TransferSupervisorStatus.TransferStarted => "TransferStarted"
        case Mining_Cargo_Transfer_Supervisor.TransferSupervisorStatus.TransferActive => "TransferActive"
        case Mining_Cargo_Transfer_Supervisor.TransferSupervisorStatus.AwaitingReceipt => "AwaitingReceipt"
        case Mining_Cargo_Transfer_Supervisor.TransferSupervisorStatus.TransferVerified => "TransferVerified"
        case Mining_Cargo_Transfer_Supervisor.TransferSupervisorStatus.EvidenceFault => "EvidenceFault"
        case Mining_Cargo_Transfer_Supervisor.TransferSupervisorStatus.UnexpectedEvidence => "UnexpectedEvidence"
        case Mining_Cargo_Transfer_Supervisor.TransferSupervisorStatus.InputFault => "InputFault"
        case Mining_Cargo_Transfer_Supervisor.TransferSupervisorStatus.AwaitingNeutral => "AwaitingNeutral"
      }
      return printObject(ISZ(
        ("type", printString("Mining_Cargo_Transfer_Supervisor.TransferSupervisorStatus")),
        ("value", printString(value))
      ))
    }

    @pure def printMining_Cargo_Transfer_SupervisorTransferSupervisorStatus_Payload(o: Mining_Cargo_Transfer_Supervisor.TransferSupervisorStatus_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Supervisor.TransferSupervisorStatus_Payload""""),
        ("value", printMining_Cargo_Transfer_SupervisorTransferSupervisorStatusType(o.value))
      ))
    }

    @pure def printMining_Cargo_Transfer_SupervisorTransferVerificationFindingType(o: Mining_Cargo_Transfer_Supervisor.TransferVerificationFinding.Type): ST = {
      val value: String = o match {
        case Mining_Cargo_Transfer_Supervisor.TransferVerificationFinding.NotEstablished => "NotEstablished"
        case Mining_Cargo_Transfer_Supervisor.TransferVerificationFinding.Verified => "Verified"
        case Mining_Cargo_Transfer_Supervisor.TransferVerificationFinding.Rejected => "Rejected"
      }
      return printObject(ISZ(
        ("type", printString("Mining_Cargo_Transfer_Supervisor.TransferVerificationFinding")),
        ("value", printString(value))
      ))
    }

    @pure def printMining_Cargo_Transfer_SupervisorTransferVerificationFinding_Payload(o: Mining_Cargo_Transfer_Supervisor.TransferVerificationFinding_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Supervisor.TransferVerificationFinding_Payload""""),
        ("value", printMining_Cargo_Transfer_SupervisorTransferVerificationFindingType(o.value))
      ))
    }

    @pure def printMining_Cargo_Transfer_SupervisorOffloadRequestSample(o: Mining_Cargo_Transfer_Supervisor.OffloadRequestSample): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Supervisor.OffloadRequestSample""""),
        ("requestEvent", printMining_Cargo_Transfer_SupervisorOffloadRequestEventType(o.requestEvent)),
        ("status", printMining_Cargo_Transfer_SupervisorInputStatusType(o.status))
      ))
    }

    @pure def printMining_Cargo_Transfer_SupervisorOffloadRequestSample_Payload(o: Mining_Cargo_Transfer_Supervisor.OffloadRequestSample_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Supervisor.OffloadRequestSample_Payload""""),
        ("value", printMining_Cargo_Transfer_SupervisorOffloadRequestSample(o.value))
      ))
    }

    @pure def printMining_Cargo_Transfer_SupervisorDockingSample(o: Mining_Cargo_Transfer_Supervisor.DockingSample): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Supervisor.DockingSample""""),
        ("docking", printMining_Cargo_Transfer_SupervisorDockingObservationType(o.docking)),
        ("status", printMining_Cargo_Transfer_SupervisorInputStatusType(o.status))
      ))
    }

    @pure def printMining_Cargo_Transfer_SupervisorDockingSample_Payload(o: Mining_Cargo_Transfer_Supervisor.DockingSample_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Supervisor.DockingSample_Payload""""),
        ("value", printMining_Cargo_Transfer_SupervisorDockingSample(o.value))
      ))
    }

    @pure def printMining_Cargo_Transfer_SupervisorShipTransferSample(o: Mining_Cargo_Transfer_Supervisor.ShipTransferSample): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Supervisor.ShipTransferSample""""),
        ("progress", printMining_Cargo_Transfer_SupervisorShipTransferProgressType(o.progress)),
        ("status", printMining_Cargo_Transfer_SupervisorInputStatusType(o.status))
      ))
    }

    @pure def printMining_Cargo_Transfer_SupervisorShipTransferSample_Payload(o: Mining_Cargo_Transfer_Supervisor.ShipTransferSample_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Supervisor.ShipTransferSample_Payload""""),
        ("value", printMining_Cargo_Transfer_SupervisorShipTransferSample(o.value))
      ))
    }

    @pure def printMining_Cargo_Transfer_SupervisorWarehouseReceiptSample(o: Mining_Cargo_Transfer_Supervisor.WarehouseReceiptSample): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Supervisor.WarehouseReceiptSample""""),
        ("receipt", printMining_Cargo_Transfer_SupervisorWarehouseReceiptEvidenceType(o.receipt)),
        ("status", printMining_Cargo_Transfer_SupervisorInputStatusType(o.status))
      ))
    }

    @pure def printMining_Cargo_Transfer_SupervisorWarehouseReceiptSample_Payload(o: Mining_Cargo_Transfer_Supervisor.WarehouseReceiptSample_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Supervisor.WarehouseReceiptSample_Payload""""),
        ("value", printMining_Cargo_Transfer_SupervisorWarehouseReceiptSample(o.value))
      ))
    }

    @pure def printMining_Cargo_Transfer_SupervisorTransferResolution(o: Mining_Cargo_Transfer_Supervisor.TransferResolution): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Supervisor.TransferResolution""""),
        ("nextPhase", printMining_Cargo_Transfer_SupervisorTransferPhaseType(o.nextPhase)),
        ("nextRearmRequired", printB(o.nextRearmRequired)),
        ("disposition", printMining_Cargo_Transfer_SupervisorTransferDispositionType(o.disposition))
      ))
    }

    @pure def printMining_Cargo_Transfer_SupervisorTransferResolution_Payload(o: Mining_Cargo_Transfer_Supervisor.TransferResolution_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Supervisor.TransferResolution_Payload""""),
        ("value", printMining_Cargo_Transfer_SupervisorTransferResolution(o.value))
      ))
    }

    @pure def printBase_TypesBoolean_Payload(o: Base_Types.Boolean_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Boolean_Payload""""),
        ("value", printB(o.value))
      ))
    }

    @pure def printBase_TypesInteger_Payload(o: Base_Types.Integer_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Integer_Payload""""),
        ("value", printZ(o.value))
      ))
    }

    @pure def printBase_TypesInteger_8_Payload(o: Base_Types.Integer_8_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Integer_8_Payload""""),
        ("value", printS8(o.value))
      ))
    }

    @pure def printBase_TypesInteger_16_Payload(o: Base_Types.Integer_16_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Integer_16_Payload""""),
        ("value", printS16(o.value))
      ))
    }

    @pure def printBase_TypesInteger_32_Payload(o: Base_Types.Integer_32_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Integer_32_Payload""""),
        ("value", printS32(o.value))
      ))
    }

    @pure def printBase_TypesInteger_64_Payload(o: Base_Types.Integer_64_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Integer_64_Payload""""),
        ("value", printS64(o.value))
      ))
    }

    @pure def printBase_TypesUnsigned_8_Payload(o: Base_Types.Unsigned_8_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Unsigned_8_Payload""""),
        ("value", printU8(o.value))
      ))
    }

    @pure def printBase_TypesUnsigned_16_Payload(o: Base_Types.Unsigned_16_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Unsigned_16_Payload""""),
        ("value", printU16(o.value))
      ))
    }

    @pure def printBase_TypesUnsigned_32_Payload(o: Base_Types.Unsigned_32_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Unsigned_32_Payload""""),
        ("value", printU32(o.value))
      ))
    }

    @pure def printBase_TypesUnsigned_64_Payload(o: Base_Types.Unsigned_64_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Unsigned_64_Payload""""),
        ("value", printU64(o.value))
      ))
    }

    @pure def printBase_TypesFloat_Payload(o: Base_Types.Float_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Float_Payload""""),
        ("value", printR(o.value))
      ))
    }

    @pure def printBase_TypesFloat_32_Payload(o: Base_Types.Float_32_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Float_32_Payload""""),
        ("value", printF32(o.value))
      ))
    }

    @pure def printBase_TypesFloat_64_Payload(o: Base_Types.Float_64_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Float_64_Payload""""),
        ("value", printF64(o.value))
      ))
    }

    @pure def printBase_TypesCharacter_Payload(o: Base_Types.Character_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Character_Payload""""),
        ("value", printC(o.value))
      ))
    }

    @pure def printBase_TypesString_Payload(o: Base_Types.String_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.String_Payload""""),
        ("value", printString(o.value))
      ))
    }

    @pure def printBase_TypesBits_Payload(o: Base_Types.Bits_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Bits_Payload""""),
        ("value", printISZ(T, o.value, printB _))
      ))
    }

    @pure def printMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container(o: Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PreState_Container): ST = {
      o match {
        case o: Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PreState_Container_P => return printMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PreState_Container_PS => return printMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_PS(o)
      }
    }

    @pure def printMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_P(o: Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PreState_Container_P""""),
        ("api_requestSample", printMining_Cargo_Transfer_SupervisorOffloadRequestSample(o.api_requestSample))
      ))
    }

    @pure def printMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_PS(o: Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PreState_Container_PS""""),
        ("api_requestSample", printMining_Cargo_Transfer_SupervisorOffloadRequestSample(o.api_requestSample))
      ))
    }

    @pure def printMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container(o: Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PostState_Container): ST = {
      o match {
        case o: Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PostState_Container_P => return printMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PostState_Container_PS => return printMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_PS(o)
      }
    }

    @pure def printMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_P(o: Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PostState_Container_P""""),
        ("api_qualifiedRequest", printMining_Cargo_Transfer_SupervisorQualifiedRequestType(o.api_qualifiedRequest))
      ))
    }

    @pure def printMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_PS(o: Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PostState_Container_PS""""),
        ("api_qualifiedRequest", printMining_Cargo_Transfer_SupervisorQualifiedRequestType(o.api_qualifiedRequest))
      ))
    }

    @pure def printMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container(o: Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container): ST = {
      o match {
        case o: Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_P => return printMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PS => return printMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PS(o)
      }
    }

    @pure def printMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_P(o: Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_P""""),
        ("api_dockingSample", printMining_Cargo_Transfer_SupervisorDockingSample(o.api_dockingSample))
      ))
    }

    @pure def printMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PS(o: Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PS""""),
        ("api_dockingSample", printMining_Cargo_Transfer_SupervisorDockingSample(o.api_dockingSample))
      ))
    }

    @pure def printMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container(o: Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container): ST = {
      o match {
        case o: Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_P => return printMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PS => return printMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PS(o)
      }
    }

    @pure def printMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_P(o: Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_P""""),
        ("api_dockingAssessment", printMining_Cargo_Transfer_SupervisorDockingAssessmentType(o.api_dockingAssessment))
      ))
    }

    @pure def printMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PS(o: Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PS""""),
        ("api_dockingAssessment", printMining_Cargo_Transfer_SupervisorDockingAssessmentType(o.api_dockingAssessment))
      ))
    }

    @pure def printMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container(o: Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container): ST = {
      o match {
        case o: Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_P => return printMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PS => return printMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PS(o)
      }
    }

    @pure def printMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_P(o: Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_P""""),
        ("api_shipSample", printMining_Cargo_Transfer_SupervisorShipTransferSample(o.api_shipSample))
      ))
    }

    @pure def printMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PS(o: Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PS""""),
        ("api_shipSample", printMining_Cargo_Transfer_SupervisorShipTransferSample(o.api_shipSample))
      ))
    }

    @pure def printMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container(o: Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container): ST = {
      o match {
        case o: Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_P => return printMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PS => return printMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PS(o)
      }
    }

    @pure def printMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_P(o: Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_P""""),
        ("api_qualifiedShipProgress", printMining_Cargo_Transfer_SupervisorQualifiedShipProgressType(o.api_qualifiedShipProgress))
      ))
    }

    @pure def printMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PS(o: Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PS""""),
        ("api_qualifiedShipProgress", printMining_Cargo_Transfer_SupervisorQualifiedShipProgressType(o.api_qualifiedShipProgress))
      ))
    }

    @pure def printMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container(o: Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container): ST = {
      o match {
        case o: Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_P => return printMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PS => return printMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PS(o)
      }
    }

    @pure def printMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_P(o: Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_P""""),
        ("api_warehouseSample", printMining_Cargo_Transfer_SupervisorWarehouseReceiptSample(o.api_warehouseSample))
      ))
    }

    @pure def printMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PS(o: Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PS""""),
        ("api_warehouseSample", printMining_Cargo_Transfer_SupervisorWarehouseReceiptSample(o.api_warehouseSample))
      ))
    }

    @pure def printMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container(o: Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container): ST = {
      o match {
        case o: Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_P => return printMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PS => return printMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PS(o)
      }
    }

    @pure def printMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_P(o: Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_P""""),
        ("api_qualifiedWarehouseEvidence", printMining_Cargo_Transfer_SupervisorQualifiedWarehouseEvidenceType(o.api_qualifiedWarehouseEvidence))
      ))
    }

    @pure def printMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PS(o: Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PS""""),
        ("api_qualifiedWarehouseEvidence", printMining_Cargo_Transfer_SupervisorQualifiedWarehouseEvidenceType(o.api_qualifiedWarehouseEvidence))
      ))
    }

    @pure def printMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container(o: Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container): ST = {
      o match {
        case o: Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_P => return printMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PS => return printMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PS(o)
      }
    }

    @pure def printMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_P(o: Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_P""""),
        ("api_dockingAssessment", printMining_Cargo_Transfer_SupervisorDockingAssessmentType(o.api_dockingAssessment)),
        ("api_qualifiedRequest", printMining_Cargo_Transfer_SupervisorQualifiedRequestType(o.api_qualifiedRequest)),
        ("api_qualifiedShipProgress", printMining_Cargo_Transfer_SupervisorQualifiedShipProgressType(o.api_qualifiedShipProgress)),
        ("api_qualifiedWarehouseEvidence", printMining_Cargo_Transfer_SupervisorQualifiedWarehouseEvidenceType(o.api_qualifiedWarehouseEvidence))
      ))
    }

    @pure def printMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PS(o: Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PS""""),
        ("In_rearmRequired", printB(o.In_rearmRequired)),
        ("In_transferPhase", printMining_Cargo_Transfer_SupervisorTransferPhaseType(o.In_transferPhase)),
        ("api_dockingAssessment", printMining_Cargo_Transfer_SupervisorDockingAssessmentType(o.api_dockingAssessment)),
        ("api_qualifiedRequest", printMining_Cargo_Transfer_SupervisorQualifiedRequestType(o.api_qualifiedRequest)),
        ("api_qualifiedShipProgress", printMining_Cargo_Transfer_SupervisorQualifiedShipProgressType(o.api_qualifiedShipProgress)),
        ("api_qualifiedWarehouseEvidence", printMining_Cargo_Transfer_SupervisorQualifiedWarehouseEvidenceType(o.api_qualifiedWarehouseEvidence))
      ))
    }

    @pure def printMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container(o: Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container): ST = {
      o match {
        case o: Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_P => return printMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PS => return printMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PS(o)
      }
    }

    @pure def printMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_P(o: Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_P""""),
        ("api_commandResolution", printMining_Cargo_Transfer_SupervisorTransferResolution(o.api_commandResolution)),
        ("api_reportResolution", printMining_Cargo_Transfer_SupervisorTransferResolution(o.api_reportResolution))
      ))
    }

    @pure def printMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PS(o: Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PS""""),
        ("rearmRequired", printB(o.rearmRequired)),
        ("transferPhase", printMining_Cargo_Transfer_SupervisorTransferPhaseType(o.transferPhase)),
        ("api_commandResolution", printMining_Cargo_Transfer_SupervisorTransferResolution(o.api_commandResolution)),
        ("api_reportResolution", printMining_Cargo_Transfer_SupervisorTransferResolution(o.api_reportResolution))
      ))
    }

    @pure def printMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container(o: Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container): ST = {
      o match {
        case o: Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_P => return printMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PS => return printMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PS(o)
      }
    }

    @pure def printMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_P(o: Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_P""""),
        ("api_resolution", printMining_Cargo_Transfer_SupervisorTransferResolution(o.api_resolution))
      ))
    }

    @pure def printMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PS(o: Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PS""""),
        ("api_resolution", printMining_Cargo_Transfer_SupervisorTransferResolution(o.api_resolution))
      ))
    }

    @pure def printMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container(o: Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container): ST = {
      o match {
        case o: Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_P => return printMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PS => return printMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PS(o)
      }
    }

    @pure def printMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_P(o: Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_P""""),
        ("api_command", printMining_Cargo_Transfer_SupervisorCargoTransferCommandType(o.api_command))
      ))
    }

    @pure def printMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PS(o: Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PS""""),
        ("api_command", printMining_Cargo_Transfer_SupervisorCargoTransferCommandType(o.api_command))
      ))
    }

    @pure def printMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container(o: Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container): ST = {
      o match {
        case o: Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_P => return printMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PS => return printMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PS(o)
      }
    }

    @pure def printMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_P(o: Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_P""""),
        ("api_resolution", printMining_Cargo_Transfer_SupervisorTransferResolution(o.api_resolution))
      ))
    }

    @pure def printMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PS(o: Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PS""""),
        ("api_resolution", printMining_Cargo_Transfer_SupervisorTransferResolution(o.api_resolution))
      ))
    }

    @pure def printMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container(o: Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container): ST = {
      o match {
        case o: Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_P => return printMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PS => return printMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PS(o)
      }
    }

    @pure def printMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_P(o: Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_P""""),
        ("api_supervisorStatus", printMining_Cargo_Transfer_SupervisorTransferSupervisorStatusType(o.api_supervisorStatus)),
        ("api_verificationFinding", printMining_Cargo_Transfer_SupervisorTransferVerificationFindingType(o.api_verificationFinding))
      ))
    }

    @pure def printMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PS(o: Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PS""""),
        ("api_supervisorStatus", printMining_Cargo_Transfer_SupervisorTransferSupervisorStatusType(o.api_supervisorStatus)),
        ("api_verificationFinding", printMining_Cargo_Transfer_SupervisorTransferVerificationFindingType(o.api_verificationFinding))
      ))
    }

    @pure def printruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): ST = {
      val value: String = o match {
        case runtimemonitor.ObservationKind.MiningCargoTransferSupervisorSystem_Instance_supervisionProcess_requestQualification_postInit => "MiningCargoTransferSupervisorSystem_Instance_supervisionProcess_requestQualification_postInit"
        case runtimemonitor.ObservationKind.MiningCargoTransferSupervisorSystem_Instance_supervisionProcess_requestQualification_preCompute => "MiningCargoTransferSupervisorSystem_Instance_supervisionProcess_requestQualification_preCompute"
        case runtimemonitor.ObservationKind.MiningCargoTransferSupervisorSystem_Instance_supervisionProcess_requestQualification_postCompute => "MiningCargoTransferSupervisorSystem_Instance_supervisionProcess_requestQualification_postCompute"
        case runtimemonitor.ObservationKind.MiningCargoTransferSupervisorSystem_Instance_supervisionProcess_dockingAssessmentOwner_postInit => "MiningCargoTransferSupervisorSystem_Instance_supervisionProcess_dockingAssessmentOwner_postInit"
        case runtimemonitor.ObservationKind.MiningCargoTransferSupervisorSystem_Instance_supervisionProcess_dockingAssessmentOwner_preCompute => "MiningCargoTransferSupervisorSystem_Instance_supervisionProcess_dockingAssessmentOwner_preCompute"
        case runtimemonitor.ObservationKind.MiningCargoTransferSupervisorSystem_Instance_supervisionProcess_dockingAssessmentOwner_postCompute => "MiningCargoTransferSupervisorSystem_Instance_supervisionProcess_dockingAssessmentOwner_postCompute"
        case runtimemonitor.ObservationKind.MiningCargoTransferSupervisorSystem_Instance_supervisionProcess_shipProgressQualification_postInit => "MiningCargoTransferSupervisorSystem_Instance_supervisionProcess_shipProgressQualification_postInit"
        case runtimemonitor.ObservationKind.MiningCargoTransferSupervisorSystem_Instance_supervisionProcess_shipProgressQualification_preCompute => "MiningCargoTransferSupervisorSystem_Instance_supervisionProcess_shipProgressQualification_preCompute"
        case runtimemonitor.ObservationKind.MiningCargoTransferSupervisorSystem_Instance_supervisionProcess_shipProgressQualification_postCompute => "MiningCargoTransferSupervisorSystem_Instance_supervisionProcess_shipProgressQualification_postCompute"
        case runtimemonitor.ObservationKind.MiningCargoTransferSupervisorSystem_Instance_supervisionProcess_warehouseEvidenceQualification_postInit => "MiningCargoTransferSupervisorSystem_Instance_supervisionProcess_warehouseEvidenceQualification_postInit"
        case runtimemonitor.ObservationKind.MiningCargoTransferSupervisorSystem_Instance_supervisionProcess_warehouseEvidenceQualification_preCompute => "MiningCargoTransferSupervisorSystem_Instance_supervisionProcess_warehouseEvidenceQualification_preCompute"
        case runtimemonitor.ObservationKind.MiningCargoTransferSupervisorSystem_Instance_supervisionProcess_warehouseEvidenceQualification_postCompute => "MiningCargoTransferSupervisorSystem_Instance_supervisionProcess_warehouseEvidenceQualification_postCompute"
        case runtimemonitor.ObservationKind.MiningCargoTransferSupervisorSystem_Instance_supervisionProcess_transferDecisionOwner_postInit => "MiningCargoTransferSupervisorSystem_Instance_supervisionProcess_transferDecisionOwner_postInit"
        case runtimemonitor.ObservationKind.MiningCargoTransferSupervisorSystem_Instance_supervisionProcess_transferDecisionOwner_preCompute => "MiningCargoTransferSupervisorSystem_Instance_supervisionProcess_transferDecisionOwner_preCompute"
        case runtimemonitor.ObservationKind.MiningCargoTransferSupervisorSystem_Instance_supervisionProcess_transferDecisionOwner_postCompute => "MiningCargoTransferSupervisorSystem_Instance_supervisionProcess_transferDecisionOwner_postCompute"
        case runtimemonitor.ObservationKind.MiningCargoTransferSupervisorSystem_Instance_supervisionProcess_transferCommandDerivation_postInit => "MiningCargoTransferSupervisorSystem_Instance_supervisionProcess_transferCommandDerivation_postInit"
        case runtimemonitor.ObservationKind.MiningCargoTransferSupervisorSystem_Instance_supervisionProcess_transferCommandDerivation_preCompute => "MiningCargoTransferSupervisorSystem_Instance_supervisionProcess_transferCommandDerivation_preCompute"
        case runtimemonitor.ObservationKind.MiningCargoTransferSupervisorSystem_Instance_supervisionProcess_transferCommandDerivation_postCompute => "MiningCargoTransferSupervisorSystem_Instance_supervisionProcess_transferCommandDerivation_postCompute"
        case runtimemonitor.ObservationKind.MiningCargoTransferSupervisorSystem_Instance_supervisionProcess_transferReportDerivation_postInit => "MiningCargoTransferSupervisorSystem_Instance_supervisionProcess_transferReportDerivation_postInit"
        case runtimemonitor.ObservationKind.MiningCargoTransferSupervisorSystem_Instance_supervisionProcess_transferReportDerivation_preCompute => "MiningCargoTransferSupervisorSystem_Instance_supervisionProcess_transferReportDerivation_preCompute"
        case runtimemonitor.ObservationKind.MiningCargoTransferSupervisorSystem_Instance_supervisionProcess_transferReportDerivation_postCompute => "MiningCargoTransferSupervisorSystem_Instance_supervisionProcess_transferReportDerivation_postCompute"
      }
      return printObject(ISZ(
        ("type", printString("runtimemonitor.ObservationKind")),
        ("value", printString(value))
      ))
    }

    @pure def printutilContainer(o: util.Container): ST = {
      o match {
        case o: util.EmptyContainer => return printutilEmptyContainer(o)
        case o: Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PreState_Container_P => return printMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PreState_Container_PS => return printMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PostState_Container_P => return printMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PostState_Container_PS => return printMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_P => return printMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PS => return printMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_P => return printMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PS => return printMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_P => return printMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PS => return printMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_P => return printMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PS => return printMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_P => return printMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PS => return printMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_P => return printMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PS => return printMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_P => return printMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_P => return printMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PS => return printMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PS => return printMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_P => return printMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_P => return printMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PS => return printMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PS => return printMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_P => return printMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PS => return printMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_P => return printMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PS => return printMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PS(o)
      }
    }

    @pure def printutilEmptyContainer(o: util.EmptyContainer): ST = {
      return printObject(ISZ(
        ("type", st""""util.EmptyContainer"""")
      ))
    }

    @pure def print_artDataContent(o: art.DataContent): ST = {
      o match {
        case o: art.Empty => return print_artEmpty(o)
        case o: Base_Types.Boolean_Payload => return printBase_TypesBoolean_Payload(o)
        case o: Base_Types.Integer_Payload => return printBase_TypesInteger_Payload(o)
        case o: Base_Types.Integer_8_Payload => return printBase_TypesInteger_8_Payload(o)
        case o: Base_Types.Integer_16_Payload => return printBase_TypesInteger_16_Payload(o)
        case o: Base_Types.Integer_32_Payload => return printBase_TypesInteger_32_Payload(o)
        case o: Base_Types.Integer_64_Payload => return printBase_TypesInteger_64_Payload(o)
        case o: Base_Types.Unsigned_8_Payload => return printBase_TypesUnsigned_8_Payload(o)
        case o: Base_Types.Unsigned_16_Payload => return printBase_TypesUnsigned_16_Payload(o)
        case o: Base_Types.Unsigned_32_Payload => return printBase_TypesUnsigned_32_Payload(o)
        case o: Base_Types.Unsigned_64_Payload => return printBase_TypesUnsigned_64_Payload(o)
        case o: Base_Types.Float_Payload => return printBase_TypesFloat_Payload(o)
        case o: Base_Types.Float_32_Payload => return printBase_TypesFloat_32_Payload(o)
        case o: Base_Types.Float_64_Payload => return printBase_TypesFloat_64_Payload(o)
        case o: Base_Types.Character_Payload => return printBase_TypesCharacter_Payload(o)
        case o: Base_Types.String_Payload => return printBase_TypesString_Payload(o)
        case o: Base_Types.Bits_Payload => return printBase_TypesBits_Payload(o)
        case o: util.EmptyContainer => return printutilEmptyContainer(o)
        case o: Mining_Cargo_Transfer_Supervisor.InputStatus_Payload => return printMining_Cargo_Transfer_SupervisorInputStatus_Payload(o)
        case o: Mining_Cargo_Transfer_Supervisor.TransferPhase_Payload => return printMining_Cargo_Transfer_SupervisorTransferPhase_Payload(o)
        case o: Mining_Cargo_Transfer_Supervisor.DockingSample_Payload => return printMining_Cargo_Transfer_SupervisorDockingSample_Payload(o)
        case o: Mining_Cargo_Transfer_Supervisor.QualifiedRequest_Payload => return printMining_Cargo_Transfer_SupervisorQualifiedRequest_Payload(o)
        case o: Mining_Cargo_Transfer_Supervisor.DockingAssessment_Payload => return printMining_Cargo_Transfer_SupervisorDockingAssessment_Payload(o)
        case o: Mining_Cargo_Transfer_Supervisor.DockingObservation_Payload => return printMining_Cargo_Transfer_SupervisorDockingObservation_Payload(o)
        case o: Mining_Cargo_Transfer_Supervisor.ShipTransferSample_Payload => return printMining_Cargo_Transfer_SupervisorShipTransferSample_Payload(o)
        case o: Mining_Cargo_Transfer_Supervisor.TransferResolution_Payload => return printMining_Cargo_Transfer_SupervisorTransferResolution_Payload(o)
        case o: Mining_Cargo_Transfer_Supervisor.OffloadRequestEvent_Payload => return printMining_Cargo_Transfer_SupervisorOffloadRequestEvent_Payload(o)
        case o: Mining_Cargo_Transfer_Supervisor.TransferDisposition_Payload => return printMining_Cargo_Transfer_SupervisorTransferDisposition_Payload(o)
        case o: Mining_Cargo_Transfer_Supervisor.CargoTransferCommand_Payload => return printMining_Cargo_Transfer_SupervisorCargoTransferCommand_Payload(o)
        case o: Mining_Cargo_Transfer_Supervisor.ShipTransferProgress_Payload => return printMining_Cargo_Transfer_SupervisorShipTransferProgress_Payload(o)
        case o: Mining_Cargo_Transfer_Supervisor.OffloadRequestSample_Payload => return printMining_Cargo_Transfer_SupervisorOffloadRequestSample_Payload(o)
        case o: Mining_Cargo_Transfer_Supervisor.QualifiedShipProgress_Payload => return printMining_Cargo_Transfer_SupervisorQualifiedShipProgress_Payload(o)
        case o: Mining_Cargo_Transfer_Supervisor.WarehouseReceiptSample_Payload => return printMining_Cargo_Transfer_SupervisorWarehouseReceiptSample_Payload(o)
        case o: Mining_Cargo_Transfer_Supervisor.WarehouseReceiptEvidence_Payload => return printMining_Cargo_Transfer_SupervisorWarehouseReceiptEvidence_Payload(o)
        case o: Mining_Cargo_Transfer_Supervisor.TransferSupervisorStatus_Payload => return printMining_Cargo_Transfer_SupervisorTransferSupervisorStatus_Payload(o)
        case o: Mining_Cargo_Transfer_Supervisor.QualifiedWarehouseEvidence_Payload => return printMining_Cargo_Transfer_SupervisorQualifiedWarehouseEvidence_Payload(o)
        case o: Mining_Cargo_Transfer_Supervisor.TransferVerificationFinding_Payload => return printMining_Cargo_Transfer_SupervisorTransferVerificationFinding_Payload(o)
        case o: Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PreState_Container_P => return printMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PreState_Container_PS => return printMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PostState_Container_P => return printMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PostState_Container_PS => return printMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_P => return printMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PS => return printMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_P => return printMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PS => return printMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_P => return printMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PS => return printMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_P => return printMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PS => return printMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_P => return printMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PS => return printMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_P => return printMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PS => return printMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_P => return printMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_P => return printMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PS => return printMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PS => return printMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_P => return printMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_P => return printMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PS => return printMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PS => return printMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_P => return printMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PS => return printMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_P => return printMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PS => return printMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PS(o)
      }
    }

    @pure def print_artEmpty(o: art.Empty): ST = {
      return printObject(ISZ(
        ("type", st""""art.Empty"""")
      ))
    }

  }

  @record class Parser(val input: String) {
    val parser: Json.Parser = Json.Parser.create(input)

    def errorOpt: Option[Json.ErrorMsg] = {
      return parser.errorOpt
    }

    def parseMining_Cargo_Transfer_SupervisorOffloadRequestEventType(): Mining_Cargo_Transfer_Supervisor.OffloadRequestEvent.Type = {
      val r = parseMining_Cargo_Transfer_SupervisorOffloadRequestEventT(F)
      return r
    }

    def parseMining_Cargo_Transfer_SupervisorOffloadRequestEventT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.OffloadRequestEvent.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Supervisor.OffloadRequestEvent")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Mining_Cargo_Transfer_Supervisor.OffloadRequestEvent.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Mining_Cargo_Transfer_Supervisor.OffloadRequestEvent.")
          return Mining_Cargo_Transfer_Supervisor.OffloadRequestEvent.byOrdinal(0).get
      }
    }

    def parseMining_Cargo_Transfer_SupervisorOffloadRequestEvent_Payload(): Mining_Cargo_Transfer_Supervisor.OffloadRequestEvent_Payload = {
      val r = parseMining_Cargo_Transfer_SupervisorOffloadRequestEvent_PayloadT(F)
      return r
    }

    def parseMining_Cargo_Transfer_SupervisorOffloadRequestEvent_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.OffloadRequestEvent_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Supervisor.OffloadRequestEvent_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Cargo_Transfer_SupervisorOffloadRequestEventType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Supervisor.OffloadRequestEvent_Payload(value)
    }

    def parseMining_Cargo_Transfer_SupervisorInputStatusType(): Mining_Cargo_Transfer_Supervisor.InputStatus.Type = {
      val r = parseMining_Cargo_Transfer_SupervisorInputStatusT(F)
      return r
    }

    def parseMining_Cargo_Transfer_SupervisorInputStatusT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.InputStatus.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Supervisor.InputStatus")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Mining_Cargo_Transfer_Supervisor.InputStatus.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Mining_Cargo_Transfer_Supervisor.InputStatus.")
          return Mining_Cargo_Transfer_Supervisor.InputStatus.byOrdinal(0).get
      }
    }

    def parseMining_Cargo_Transfer_SupervisorInputStatus_Payload(): Mining_Cargo_Transfer_Supervisor.InputStatus_Payload = {
      val r = parseMining_Cargo_Transfer_SupervisorInputStatus_PayloadT(F)
      return r
    }

    def parseMining_Cargo_Transfer_SupervisorInputStatus_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.InputStatus_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Supervisor.InputStatus_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Cargo_Transfer_SupervisorInputStatusType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Supervisor.InputStatus_Payload(value)
    }

    def parseMining_Cargo_Transfer_SupervisorQualifiedRequestType(): Mining_Cargo_Transfer_Supervisor.QualifiedRequest.Type = {
      val r = parseMining_Cargo_Transfer_SupervisorQualifiedRequestT(F)
      return r
    }

    def parseMining_Cargo_Transfer_SupervisorQualifiedRequestT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.QualifiedRequest.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Supervisor.QualifiedRequest")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Mining_Cargo_Transfer_Supervisor.QualifiedRequest.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Mining_Cargo_Transfer_Supervisor.QualifiedRequest.")
          return Mining_Cargo_Transfer_Supervisor.QualifiedRequest.byOrdinal(0).get
      }
    }

    def parseMining_Cargo_Transfer_SupervisorQualifiedRequest_Payload(): Mining_Cargo_Transfer_Supervisor.QualifiedRequest_Payload = {
      val r = parseMining_Cargo_Transfer_SupervisorQualifiedRequest_PayloadT(F)
      return r
    }

    def parseMining_Cargo_Transfer_SupervisorQualifiedRequest_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.QualifiedRequest_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Supervisor.QualifiedRequest_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Cargo_Transfer_SupervisorQualifiedRequestType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Supervisor.QualifiedRequest_Payload(value)
    }

    def parseMining_Cargo_Transfer_SupervisorDockingObservationType(): Mining_Cargo_Transfer_Supervisor.DockingObservation.Type = {
      val r = parseMining_Cargo_Transfer_SupervisorDockingObservationT(F)
      return r
    }

    def parseMining_Cargo_Transfer_SupervisorDockingObservationT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.DockingObservation.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Supervisor.DockingObservation")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Mining_Cargo_Transfer_Supervisor.DockingObservation.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Mining_Cargo_Transfer_Supervisor.DockingObservation.")
          return Mining_Cargo_Transfer_Supervisor.DockingObservation.byOrdinal(0).get
      }
    }

    def parseMining_Cargo_Transfer_SupervisorDockingObservation_Payload(): Mining_Cargo_Transfer_Supervisor.DockingObservation_Payload = {
      val r = parseMining_Cargo_Transfer_SupervisorDockingObservation_PayloadT(F)
      return r
    }

    def parseMining_Cargo_Transfer_SupervisorDockingObservation_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.DockingObservation_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Supervisor.DockingObservation_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Cargo_Transfer_SupervisorDockingObservationType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Supervisor.DockingObservation_Payload(value)
    }

    def parseMining_Cargo_Transfer_SupervisorDockingAssessmentType(): Mining_Cargo_Transfer_Supervisor.DockingAssessment.Type = {
      val r = parseMining_Cargo_Transfer_SupervisorDockingAssessmentT(F)
      return r
    }

    def parseMining_Cargo_Transfer_SupervisorDockingAssessmentT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.DockingAssessment.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Supervisor.DockingAssessment")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Mining_Cargo_Transfer_Supervisor.DockingAssessment.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Mining_Cargo_Transfer_Supervisor.DockingAssessment.")
          return Mining_Cargo_Transfer_Supervisor.DockingAssessment.byOrdinal(0).get
      }
    }

    def parseMining_Cargo_Transfer_SupervisorDockingAssessment_Payload(): Mining_Cargo_Transfer_Supervisor.DockingAssessment_Payload = {
      val r = parseMining_Cargo_Transfer_SupervisorDockingAssessment_PayloadT(F)
      return r
    }

    def parseMining_Cargo_Transfer_SupervisorDockingAssessment_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.DockingAssessment_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Supervisor.DockingAssessment_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Cargo_Transfer_SupervisorDockingAssessmentType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Supervisor.DockingAssessment_Payload(value)
    }

    def parseMining_Cargo_Transfer_SupervisorShipTransferProgressType(): Mining_Cargo_Transfer_Supervisor.ShipTransferProgress.Type = {
      val r = parseMining_Cargo_Transfer_SupervisorShipTransferProgressT(F)
      return r
    }

    def parseMining_Cargo_Transfer_SupervisorShipTransferProgressT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.ShipTransferProgress.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Supervisor.ShipTransferProgress")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Mining_Cargo_Transfer_Supervisor.ShipTransferProgress.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Mining_Cargo_Transfer_Supervisor.ShipTransferProgress.")
          return Mining_Cargo_Transfer_Supervisor.ShipTransferProgress.byOrdinal(0).get
      }
    }

    def parseMining_Cargo_Transfer_SupervisorShipTransferProgress_Payload(): Mining_Cargo_Transfer_Supervisor.ShipTransferProgress_Payload = {
      val r = parseMining_Cargo_Transfer_SupervisorShipTransferProgress_PayloadT(F)
      return r
    }

    def parseMining_Cargo_Transfer_SupervisorShipTransferProgress_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.ShipTransferProgress_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Supervisor.ShipTransferProgress_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Cargo_Transfer_SupervisorShipTransferProgressType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Supervisor.ShipTransferProgress_Payload(value)
    }

    def parseMining_Cargo_Transfer_SupervisorQualifiedShipProgressType(): Mining_Cargo_Transfer_Supervisor.QualifiedShipProgress.Type = {
      val r = parseMining_Cargo_Transfer_SupervisorQualifiedShipProgressT(F)
      return r
    }

    def parseMining_Cargo_Transfer_SupervisorQualifiedShipProgressT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.QualifiedShipProgress.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Supervisor.QualifiedShipProgress")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Mining_Cargo_Transfer_Supervisor.QualifiedShipProgress.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Mining_Cargo_Transfer_Supervisor.QualifiedShipProgress.")
          return Mining_Cargo_Transfer_Supervisor.QualifiedShipProgress.byOrdinal(0).get
      }
    }

    def parseMining_Cargo_Transfer_SupervisorQualifiedShipProgress_Payload(): Mining_Cargo_Transfer_Supervisor.QualifiedShipProgress_Payload = {
      val r = parseMining_Cargo_Transfer_SupervisorQualifiedShipProgress_PayloadT(F)
      return r
    }

    def parseMining_Cargo_Transfer_SupervisorQualifiedShipProgress_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.QualifiedShipProgress_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Supervisor.QualifiedShipProgress_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Cargo_Transfer_SupervisorQualifiedShipProgressType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Supervisor.QualifiedShipProgress_Payload(value)
    }

    def parseMining_Cargo_Transfer_SupervisorWarehouseReceiptEvidenceType(): Mining_Cargo_Transfer_Supervisor.WarehouseReceiptEvidence.Type = {
      val r = parseMining_Cargo_Transfer_SupervisorWarehouseReceiptEvidenceT(F)
      return r
    }

    def parseMining_Cargo_Transfer_SupervisorWarehouseReceiptEvidenceT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.WarehouseReceiptEvidence.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Supervisor.WarehouseReceiptEvidence")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Mining_Cargo_Transfer_Supervisor.WarehouseReceiptEvidence.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Mining_Cargo_Transfer_Supervisor.WarehouseReceiptEvidence.")
          return Mining_Cargo_Transfer_Supervisor.WarehouseReceiptEvidence.byOrdinal(0).get
      }
    }

    def parseMining_Cargo_Transfer_SupervisorWarehouseReceiptEvidence_Payload(): Mining_Cargo_Transfer_Supervisor.WarehouseReceiptEvidence_Payload = {
      val r = parseMining_Cargo_Transfer_SupervisorWarehouseReceiptEvidence_PayloadT(F)
      return r
    }

    def parseMining_Cargo_Transfer_SupervisorWarehouseReceiptEvidence_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.WarehouseReceiptEvidence_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Supervisor.WarehouseReceiptEvidence_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Cargo_Transfer_SupervisorWarehouseReceiptEvidenceType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Supervisor.WarehouseReceiptEvidence_Payload(value)
    }

    def parseMining_Cargo_Transfer_SupervisorQualifiedWarehouseEvidenceType(): Mining_Cargo_Transfer_Supervisor.QualifiedWarehouseEvidence.Type = {
      val r = parseMining_Cargo_Transfer_SupervisorQualifiedWarehouseEvidenceT(F)
      return r
    }

    def parseMining_Cargo_Transfer_SupervisorQualifiedWarehouseEvidenceT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.QualifiedWarehouseEvidence.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Supervisor.QualifiedWarehouseEvidence")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Mining_Cargo_Transfer_Supervisor.QualifiedWarehouseEvidence.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Mining_Cargo_Transfer_Supervisor.QualifiedWarehouseEvidence.")
          return Mining_Cargo_Transfer_Supervisor.QualifiedWarehouseEvidence.byOrdinal(0).get
      }
    }

    def parseMining_Cargo_Transfer_SupervisorQualifiedWarehouseEvidence_Payload(): Mining_Cargo_Transfer_Supervisor.QualifiedWarehouseEvidence_Payload = {
      val r = parseMining_Cargo_Transfer_SupervisorQualifiedWarehouseEvidence_PayloadT(F)
      return r
    }

    def parseMining_Cargo_Transfer_SupervisorQualifiedWarehouseEvidence_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.QualifiedWarehouseEvidence_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Supervisor.QualifiedWarehouseEvidence_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Cargo_Transfer_SupervisorQualifiedWarehouseEvidenceType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Supervisor.QualifiedWarehouseEvidence_Payload(value)
    }

    def parseMining_Cargo_Transfer_SupervisorTransferPhaseType(): Mining_Cargo_Transfer_Supervisor.TransferPhase.Type = {
      val r = parseMining_Cargo_Transfer_SupervisorTransferPhaseT(F)
      return r
    }

    def parseMining_Cargo_Transfer_SupervisorTransferPhaseT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.TransferPhase.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Supervisor.TransferPhase")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Mining_Cargo_Transfer_Supervisor.TransferPhase.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Mining_Cargo_Transfer_Supervisor.TransferPhase.")
          return Mining_Cargo_Transfer_Supervisor.TransferPhase.byOrdinal(0).get
      }
    }

    def parseMining_Cargo_Transfer_SupervisorTransferPhase_Payload(): Mining_Cargo_Transfer_Supervisor.TransferPhase_Payload = {
      val r = parseMining_Cargo_Transfer_SupervisorTransferPhase_PayloadT(F)
      return r
    }

    def parseMining_Cargo_Transfer_SupervisorTransferPhase_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.TransferPhase_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Supervisor.TransferPhase_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Cargo_Transfer_SupervisorTransferPhaseType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Supervisor.TransferPhase_Payload(value)
    }

    def parseMining_Cargo_Transfer_SupervisorTransferDispositionType(): Mining_Cargo_Transfer_Supervisor.TransferDisposition.Type = {
      val r = parseMining_Cargo_Transfer_SupervisorTransferDispositionT(F)
      return r
    }

    def parseMining_Cargo_Transfer_SupervisorTransferDispositionT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.TransferDisposition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Supervisor.TransferDisposition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Mining_Cargo_Transfer_Supervisor.TransferDisposition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Mining_Cargo_Transfer_Supervisor.TransferDisposition.")
          return Mining_Cargo_Transfer_Supervisor.TransferDisposition.byOrdinal(0).get
      }
    }

    def parseMining_Cargo_Transfer_SupervisorTransferDisposition_Payload(): Mining_Cargo_Transfer_Supervisor.TransferDisposition_Payload = {
      val r = parseMining_Cargo_Transfer_SupervisorTransferDisposition_PayloadT(F)
      return r
    }

    def parseMining_Cargo_Transfer_SupervisorTransferDisposition_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.TransferDisposition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Supervisor.TransferDisposition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Cargo_Transfer_SupervisorTransferDispositionType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Supervisor.TransferDisposition_Payload(value)
    }

    def parseMining_Cargo_Transfer_SupervisorCargoTransferCommandType(): Mining_Cargo_Transfer_Supervisor.CargoTransferCommand.Type = {
      val r = parseMining_Cargo_Transfer_SupervisorCargoTransferCommandT(F)
      return r
    }

    def parseMining_Cargo_Transfer_SupervisorCargoTransferCommandT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.CargoTransferCommand.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Supervisor.CargoTransferCommand")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Mining_Cargo_Transfer_Supervisor.CargoTransferCommand.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Mining_Cargo_Transfer_Supervisor.CargoTransferCommand.")
          return Mining_Cargo_Transfer_Supervisor.CargoTransferCommand.byOrdinal(0).get
      }
    }

    def parseMining_Cargo_Transfer_SupervisorCargoTransferCommand_Payload(): Mining_Cargo_Transfer_Supervisor.CargoTransferCommand_Payload = {
      val r = parseMining_Cargo_Transfer_SupervisorCargoTransferCommand_PayloadT(F)
      return r
    }

    def parseMining_Cargo_Transfer_SupervisorCargoTransferCommand_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.CargoTransferCommand_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Supervisor.CargoTransferCommand_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Cargo_Transfer_SupervisorCargoTransferCommandType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Supervisor.CargoTransferCommand_Payload(value)
    }

    def parseMining_Cargo_Transfer_SupervisorTransferSupervisorStatusType(): Mining_Cargo_Transfer_Supervisor.TransferSupervisorStatus.Type = {
      val r = parseMining_Cargo_Transfer_SupervisorTransferSupervisorStatusT(F)
      return r
    }

    def parseMining_Cargo_Transfer_SupervisorTransferSupervisorStatusT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.TransferSupervisorStatus.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Supervisor.TransferSupervisorStatus")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Mining_Cargo_Transfer_Supervisor.TransferSupervisorStatus.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Mining_Cargo_Transfer_Supervisor.TransferSupervisorStatus.")
          return Mining_Cargo_Transfer_Supervisor.TransferSupervisorStatus.byOrdinal(0).get
      }
    }

    def parseMining_Cargo_Transfer_SupervisorTransferSupervisorStatus_Payload(): Mining_Cargo_Transfer_Supervisor.TransferSupervisorStatus_Payload = {
      val r = parseMining_Cargo_Transfer_SupervisorTransferSupervisorStatus_PayloadT(F)
      return r
    }

    def parseMining_Cargo_Transfer_SupervisorTransferSupervisorStatus_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.TransferSupervisorStatus_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Supervisor.TransferSupervisorStatus_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Cargo_Transfer_SupervisorTransferSupervisorStatusType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Supervisor.TransferSupervisorStatus_Payload(value)
    }

    def parseMining_Cargo_Transfer_SupervisorTransferVerificationFindingType(): Mining_Cargo_Transfer_Supervisor.TransferVerificationFinding.Type = {
      val r = parseMining_Cargo_Transfer_SupervisorTransferVerificationFindingT(F)
      return r
    }

    def parseMining_Cargo_Transfer_SupervisorTransferVerificationFindingT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.TransferVerificationFinding.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Supervisor.TransferVerificationFinding")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Mining_Cargo_Transfer_Supervisor.TransferVerificationFinding.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Mining_Cargo_Transfer_Supervisor.TransferVerificationFinding.")
          return Mining_Cargo_Transfer_Supervisor.TransferVerificationFinding.byOrdinal(0).get
      }
    }

    def parseMining_Cargo_Transfer_SupervisorTransferVerificationFinding_Payload(): Mining_Cargo_Transfer_Supervisor.TransferVerificationFinding_Payload = {
      val r = parseMining_Cargo_Transfer_SupervisorTransferVerificationFinding_PayloadT(F)
      return r
    }

    def parseMining_Cargo_Transfer_SupervisorTransferVerificationFinding_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.TransferVerificationFinding_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Supervisor.TransferVerificationFinding_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Cargo_Transfer_SupervisorTransferVerificationFindingType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Supervisor.TransferVerificationFinding_Payload(value)
    }

    def parseMining_Cargo_Transfer_SupervisorOffloadRequestSample(): Mining_Cargo_Transfer_Supervisor.OffloadRequestSample = {
      val r = parseMining_Cargo_Transfer_SupervisorOffloadRequestSampleT(F)
      return r
    }

    def parseMining_Cargo_Transfer_SupervisorOffloadRequestSampleT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.OffloadRequestSample = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Supervisor.OffloadRequestSample")
      }
      parser.parseObjectKey("requestEvent")
      val requestEvent = parseMining_Cargo_Transfer_SupervisorOffloadRequestEventType()
      parser.parseObjectNext()
      parser.parseObjectKey("status")
      val status = parseMining_Cargo_Transfer_SupervisorInputStatusType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Supervisor.OffloadRequestSample(requestEvent, status)
    }

    def parseMining_Cargo_Transfer_SupervisorOffloadRequestSample_Payload(): Mining_Cargo_Transfer_Supervisor.OffloadRequestSample_Payload = {
      val r = parseMining_Cargo_Transfer_SupervisorOffloadRequestSample_PayloadT(F)
      return r
    }

    def parseMining_Cargo_Transfer_SupervisorOffloadRequestSample_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.OffloadRequestSample_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Supervisor.OffloadRequestSample_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Cargo_Transfer_SupervisorOffloadRequestSample()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Supervisor.OffloadRequestSample_Payload(value)
    }

    def parseMining_Cargo_Transfer_SupervisorDockingSample(): Mining_Cargo_Transfer_Supervisor.DockingSample = {
      val r = parseMining_Cargo_Transfer_SupervisorDockingSampleT(F)
      return r
    }

    def parseMining_Cargo_Transfer_SupervisorDockingSampleT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.DockingSample = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Supervisor.DockingSample")
      }
      parser.parseObjectKey("docking")
      val docking = parseMining_Cargo_Transfer_SupervisorDockingObservationType()
      parser.parseObjectNext()
      parser.parseObjectKey("status")
      val status = parseMining_Cargo_Transfer_SupervisorInputStatusType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Supervisor.DockingSample(docking, status)
    }

    def parseMining_Cargo_Transfer_SupervisorDockingSample_Payload(): Mining_Cargo_Transfer_Supervisor.DockingSample_Payload = {
      val r = parseMining_Cargo_Transfer_SupervisorDockingSample_PayloadT(F)
      return r
    }

    def parseMining_Cargo_Transfer_SupervisorDockingSample_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.DockingSample_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Supervisor.DockingSample_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Cargo_Transfer_SupervisorDockingSample()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Supervisor.DockingSample_Payload(value)
    }

    def parseMining_Cargo_Transfer_SupervisorShipTransferSample(): Mining_Cargo_Transfer_Supervisor.ShipTransferSample = {
      val r = parseMining_Cargo_Transfer_SupervisorShipTransferSampleT(F)
      return r
    }

    def parseMining_Cargo_Transfer_SupervisorShipTransferSampleT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.ShipTransferSample = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Supervisor.ShipTransferSample")
      }
      parser.parseObjectKey("progress")
      val progress = parseMining_Cargo_Transfer_SupervisorShipTransferProgressType()
      parser.parseObjectNext()
      parser.parseObjectKey("status")
      val status = parseMining_Cargo_Transfer_SupervisorInputStatusType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Supervisor.ShipTransferSample(progress, status)
    }

    def parseMining_Cargo_Transfer_SupervisorShipTransferSample_Payload(): Mining_Cargo_Transfer_Supervisor.ShipTransferSample_Payload = {
      val r = parseMining_Cargo_Transfer_SupervisorShipTransferSample_PayloadT(F)
      return r
    }

    def parseMining_Cargo_Transfer_SupervisorShipTransferSample_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.ShipTransferSample_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Supervisor.ShipTransferSample_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Cargo_Transfer_SupervisorShipTransferSample()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Supervisor.ShipTransferSample_Payload(value)
    }

    def parseMining_Cargo_Transfer_SupervisorWarehouseReceiptSample(): Mining_Cargo_Transfer_Supervisor.WarehouseReceiptSample = {
      val r = parseMining_Cargo_Transfer_SupervisorWarehouseReceiptSampleT(F)
      return r
    }

    def parseMining_Cargo_Transfer_SupervisorWarehouseReceiptSampleT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.WarehouseReceiptSample = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Supervisor.WarehouseReceiptSample")
      }
      parser.parseObjectKey("receipt")
      val receipt = parseMining_Cargo_Transfer_SupervisorWarehouseReceiptEvidenceType()
      parser.parseObjectNext()
      parser.parseObjectKey("status")
      val status = parseMining_Cargo_Transfer_SupervisorInputStatusType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Supervisor.WarehouseReceiptSample(receipt, status)
    }

    def parseMining_Cargo_Transfer_SupervisorWarehouseReceiptSample_Payload(): Mining_Cargo_Transfer_Supervisor.WarehouseReceiptSample_Payload = {
      val r = parseMining_Cargo_Transfer_SupervisorWarehouseReceiptSample_PayloadT(F)
      return r
    }

    def parseMining_Cargo_Transfer_SupervisorWarehouseReceiptSample_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.WarehouseReceiptSample_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Supervisor.WarehouseReceiptSample_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Cargo_Transfer_SupervisorWarehouseReceiptSample()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Supervisor.WarehouseReceiptSample_Payload(value)
    }

    def parseMining_Cargo_Transfer_SupervisorTransferResolution(): Mining_Cargo_Transfer_Supervisor.TransferResolution = {
      val r = parseMining_Cargo_Transfer_SupervisorTransferResolutionT(F)
      return r
    }

    def parseMining_Cargo_Transfer_SupervisorTransferResolutionT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.TransferResolution = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Supervisor.TransferResolution")
      }
      parser.parseObjectKey("nextPhase")
      val nextPhase = parseMining_Cargo_Transfer_SupervisorTransferPhaseType()
      parser.parseObjectNext()
      parser.parseObjectKey("nextRearmRequired")
      val nextRearmRequired = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("disposition")
      val disposition = parseMining_Cargo_Transfer_SupervisorTransferDispositionType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Supervisor.TransferResolution(nextPhase, nextRearmRequired, disposition)
    }

    def parseMining_Cargo_Transfer_SupervisorTransferResolution_Payload(): Mining_Cargo_Transfer_Supervisor.TransferResolution_Payload = {
      val r = parseMining_Cargo_Transfer_SupervisorTransferResolution_PayloadT(F)
      return r
    }

    def parseMining_Cargo_Transfer_SupervisorTransferResolution_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.TransferResolution_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Supervisor.TransferResolution_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Cargo_Transfer_SupervisorTransferResolution()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Supervisor.TransferResolution_Payload(value)
    }

    def parseBase_TypesBoolean_Payload(): Base_Types.Boolean_Payload = {
      val r = parseBase_TypesBoolean_PayloadT(F)
      return r
    }

    def parseBase_TypesBoolean_PayloadT(typeParsed: B): Base_Types.Boolean_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Boolean_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseB()
      parser.parseObjectNext()
      return Base_Types.Boolean_Payload(value)
    }

    def parseBase_TypesInteger_Payload(): Base_Types.Integer_Payload = {
      val r = parseBase_TypesInteger_PayloadT(F)
      return r
    }

    def parseBase_TypesInteger_PayloadT(typeParsed: B): Base_Types.Integer_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Integer_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseZ()
      parser.parseObjectNext()
      return Base_Types.Integer_Payload(value)
    }

    def parseBase_TypesInteger_8_Payload(): Base_Types.Integer_8_Payload = {
      val r = parseBase_TypesInteger_8_PayloadT(F)
      return r
    }

    def parseBase_TypesInteger_8_PayloadT(typeParsed: B): Base_Types.Integer_8_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Integer_8_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseS8()
      parser.parseObjectNext()
      return Base_Types.Integer_8_Payload(value)
    }

    def parseBase_TypesInteger_16_Payload(): Base_Types.Integer_16_Payload = {
      val r = parseBase_TypesInteger_16_PayloadT(F)
      return r
    }

    def parseBase_TypesInteger_16_PayloadT(typeParsed: B): Base_Types.Integer_16_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Integer_16_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseS16()
      parser.parseObjectNext()
      return Base_Types.Integer_16_Payload(value)
    }

    def parseBase_TypesInteger_32_Payload(): Base_Types.Integer_32_Payload = {
      val r = parseBase_TypesInteger_32_PayloadT(F)
      return r
    }

    def parseBase_TypesInteger_32_PayloadT(typeParsed: B): Base_Types.Integer_32_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Integer_32_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseS32()
      parser.parseObjectNext()
      return Base_Types.Integer_32_Payload(value)
    }

    def parseBase_TypesInteger_64_Payload(): Base_Types.Integer_64_Payload = {
      val r = parseBase_TypesInteger_64_PayloadT(F)
      return r
    }

    def parseBase_TypesInteger_64_PayloadT(typeParsed: B): Base_Types.Integer_64_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Integer_64_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseS64()
      parser.parseObjectNext()
      return Base_Types.Integer_64_Payload(value)
    }

    def parseBase_TypesUnsigned_8_Payload(): Base_Types.Unsigned_8_Payload = {
      val r = parseBase_TypesUnsigned_8_PayloadT(F)
      return r
    }

    def parseBase_TypesUnsigned_8_PayloadT(typeParsed: B): Base_Types.Unsigned_8_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Unsigned_8_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseU8()
      parser.parseObjectNext()
      return Base_Types.Unsigned_8_Payload(value)
    }

    def parseBase_TypesUnsigned_16_Payload(): Base_Types.Unsigned_16_Payload = {
      val r = parseBase_TypesUnsigned_16_PayloadT(F)
      return r
    }

    def parseBase_TypesUnsigned_16_PayloadT(typeParsed: B): Base_Types.Unsigned_16_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Unsigned_16_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseU16()
      parser.parseObjectNext()
      return Base_Types.Unsigned_16_Payload(value)
    }

    def parseBase_TypesUnsigned_32_Payload(): Base_Types.Unsigned_32_Payload = {
      val r = parseBase_TypesUnsigned_32_PayloadT(F)
      return r
    }

    def parseBase_TypesUnsigned_32_PayloadT(typeParsed: B): Base_Types.Unsigned_32_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Unsigned_32_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseU32()
      parser.parseObjectNext()
      return Base_Types.Unsigned_32_Payload(value)
    }

    def parseBase_TypesUnsigned_64_Payload(): Base_Types.Unsigned_64_Payload = {
      val r = parseBase_TypesUnsigned_64_PayloadT(F)
      return r
    }

    def parseBase_TypesUnsigned_64_PayloadT(typeParsed: B): Base_Types.Unsigned_64_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Unsigned_64_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseU64()
      parser.parseObjectNext()
      return Base_Types.Unsigned_64_Payload(value)
    }

    def parseBase_TypesFloat_Payload(): Base_Types.Float_Payload = {
      val r = parseBase_TypesFloat_PayloadT(F)
      return r
    }

    def parseBase_TypesFloat_PayloadT(typeParsed: B): Base_Types.Float_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Float_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseR()
      parser.parseObjectNext()
      return Base_Types.Float_Payload(value)
    }

    def parseBase_TypesFloat_32_Payload(): Base_Types.Float_32_Payload = {
      val r = parseBase_TypesFloat_32_PayloadT(F)
      return r
    }

    def parseBase_TypesFloat_32_PayloadT(typeParsed: B): Base_Types.Float_32_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Float_32_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseF32()
      parser.parseObjectNext()
      return Base_Types.Float_32_Payload(value)
    }

    def parseBase_TypesFloat_64_Payload(): Base_Types.Float_64_Payload = {
      val r = parseBase_TypesFloat_64_PayloadT(F)
      return r
    }

    def parseBase_TypesFloat_64_PayloadT(typeParsed: B): Base_Types.Float_64_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Float_64_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseF64()
      parser.parseObjectNext()
      return Base_Types.Float_64_Payload(value)
    }

    def parseBase_TypesCharacter_Payload(): Base_Types.Character_Payload = {
      val r = parseBase_TypesCharacter_PayloadT(F)
      return r
    }

    def parseBase_TypesCharacter_PayloadT(typeParsed: B): Base_Types.Character_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Character_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseC()
      parser.parseObjectNext()
      return Base_Types.Character_Payload(value)
    }

    def parseBase_TypesString_Payload(): Base_Types.String_Payload = {
      val r = parseBase_TypesString_PayloadT(F)
      return r
    }

    def parseBase_TypesString_PayloadT(typeParsed: B): Base_Types.String_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.String_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseString()
      parser.parseObjectNext()
      return Base_Types.String_Payload(value)
    }

    def parseBase_TypesBits_Payload(): Base_Types.Bits_Payload = {
      val r = parseBase_TypesBits_PayloadT(F)
      return r
    }

    def parseBase_TypesBits_PayloadT(typeParsed: B): Base_Types.Bits_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Bits_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseISZ(parser.parseB _)
      parser.parseObjectNext()
      return Base_Types.Bits_Payload(value)
    }

    def parseMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container(): Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PreState_Container_P", "Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PreState_Container_PS"))
      t.native match {
        case "Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PreState_Container_P" => val r = parseMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PreState_Container_PS" => val r = parseMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_PST(T); return r
        case _ => val r = parseMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_PST(T); return r
      }
    }

    def parseMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_P(): Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PreState_Container_P = {
      val r = parseMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_PT(F)
      return r
    }

    def parseMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PreState_Container_P")
      }
      parser.parseObjectKey("api_requestSample")
      val api_requestSample = parseMining_Cargo_Transfer_SupervisorOffloadRequestSample()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PreState_Container_P(api_requestSample)
    }

    def parseMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_PS(): Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PreState_Container_PS = {
      val r = parseMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_PST(F)
      return r
    }

    def parseMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PreState_Container_PS")
      }
      parser.parseObjectKey("api_requestSample")
      val api_requestSample = parseMining_Cargo_Transfer_SupervisorOffloadRequestSample()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PreState_Container_PS(api_requestSample)
    }

    def parseMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container(): Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PostState_Container_P", "Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PostState_Container_PS"))
      t.native match {
        case "Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PostState_Container_P" => val r = parseMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PostState_Container_PS" => val r = parseMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_PST(T); return r
        case _ => val r = parseMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_PST(T); return r
      }
    }

    def parseMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_P(): Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PostState_Container_P = {
      val r = parseMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_PT(F)
      return r
    }

    def parseMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PostState_Container_P")
      }
      parser.parseObjectKey("api_qualifiedRequest")
      val api_qualifiedRequest = parseMining_Cargo_Transfer_SupervisorQualifiedRequestType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PostState_Container_P(api_qualifiedRequest)
    }

    def parseMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_PS(): Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PostState_Container_PS = {
      val r = parseMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_PST(F)
      return r
    }

    def parseMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PostState_Container_PS")
      }
      parser.parseObjectKey("api_qualifiedRequest")
      val api_qualifiedRequest = parseMining_Cargo_Transfer_SupervisorQualifiedRequestType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PostState_Container_PS(api_qualifiedRequest)
    }

    def parseMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container(): Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_P", "Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PS"))
      t.native match {
        case "Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_P" => val r = parseMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PS" => val r = parseMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PST(T); return r
        case _ => val r = parseMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PST(T); return r
      }
    }

    def parseMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_P(): Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_P = {
      val r = parseMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PT(F)
      return r
    }

    def parseMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_P")
      }
      parser.parseObjectKey("api_dockingSample")
      val api_dockingSample = parseMining_Cargo_Transfer_SupervisorDockingSample()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_P(api_dockingSample)
    }

    def parseMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PS(): Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PS = {
      val r = parseMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PST(F)
      return r
    }

    def parseMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_dockingSample")
      val api_dockingSample = parseMining_Cargo_Transfer_SupervisorDockingSample()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PS(api_dockingSample)
    }

    def parseMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container(): Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_P", "Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PS"))
      t.native match {
        case "Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_P" => val r = parseMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PS" => val r = parseMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PST(T); return r
        case _ => val r = parseMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PST(T); return r
      }
    }

    def parseMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_P(): Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_P = {
      val r = parseMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PT(F)
      return r
    }

    def parseMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_P")
      }
      parser.parseObjectKey("api_dockingAssessment")
      val api_dockingAssessment = parseMining_Cargo_Transfer_SupervisorDockingAssessmentType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_P(api_dockingAssessment)
    }

    def parseMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PS(): Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PS = {
      val r = parseMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PST(F)
      return r
    }

    def parseMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_dockingAssessment")
      val api_dockingAssessment = parseMining_Cargo_Transfer_SupervisorDockingAssessmentType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PS(api_dockingAssessment)
    }

    def parseMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container(): Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_P", "Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PS"))
      t.native match {
        case "Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_P" => val r = parseMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PS" => val r = parseMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PST(T); return r
        case _ => val r = parseMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PST(T); return r
      }
    }

    def parseMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_P(): Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_P = {
      val r = parseMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PT(F)
      return r
    }

    def parseMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_P")
      }
      parser.parseObjectKey("api_shipSample")
      val api_shipSample = parseMining_Cargo_Transfer_SupervisorShipTransferSample()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_P(api_shipSample)
    }

    def parseMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PS(): Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PS = {
      val r = parseMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PST(F)
      return r
    }

    def parseMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PS")
      }
      parser.parseObjectKey("api_shipSample")
      val api_shipSample = parseMining_Cargo_Transfer_SupervisorShipTransferSample()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PS(api_shipSample)
    }

    def parseMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container(): Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_P", "Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PS"))
      t.native match {
        case "Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_P" => val r = parseMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PS" => val r = parseMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PST(T); return r
        case _ => val r = parseMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PST(T); return r
      }
    }

    def parseMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_P(): Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_P = {
      val r = parseMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PT(F)
      return r
    }

    def parseMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_P")
      }
      parser.parseObjectKey("api_qualifiedShipProgress")
      val api_qualifiedShipProgress = parseMining_Cargo_Transfer_SupervisorQualifiedShipProgressType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_P(api_qualifiedShipProgress)
    }

    def parseMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PS(): Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PS = {
      val r = parseMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PST(F)
      return r
    }

    def parseMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PS")
      }
      parser.parseObjectKey("api_qualifiedShipProgress")
      val api_qualifiedShipProgress = parseMining_Cargo_Transfer_SupervisorQualifiedShipProgressType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PS(api_qualifiedShipProgress)
    }

    def parseMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container(): Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_P", "Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PS"))
      t.native match {
        case "Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_P" => val r = parseMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PS" => val r = parseMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PST(T); return r
        case _ => val r = parseMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PST(T); return r
      }
    }

    def parseMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_P(): Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_P = {
      val r = parseMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PT(F)
      return r
    }

    def parseMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_P")
      }
      parser.parseObjectKey("api_warehouseSample")
      val api_warehouseSample = parseMining_Cargo_Transfer_SupervisorWarehouseReceiptSample()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_P(api_warehouseSample)
    }

    def parseMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PS(): Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PS = {
      val r = parseMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PST(F)
      return r
    }

    def parseMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PS")
      }
      parser.parseObjectKey("api_warehouseSample")
      val api_warehouseSample = parseMining_Cargo_Transfer_SupervisorWarehouseReceiptSample()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PS(api_warehouseSample)
    }

    def parseMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container(): Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_P", "Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PS"))
      t.native match {
        case "Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_P" => val r = parseMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PS" => val r = parseMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PST(T); return r
        case _ => val r = parseMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PST(T); return r
      }
    }

    def parseMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_P(): Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_P = {
      val r = parseMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PT(F)
      return r
    }

    def parseMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_P")
      }
      parser.parseObjectKey("api_qualifiedWarehouseEvidence")
      val api_qualifiedWarehouseEvidence = parseMining_Cargo_Transfer_SupervisorQualifiedWarehouseEvidenceType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_P(api_qualifiedWarehouseEvidence)
    }

    def parseMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PS(): Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PS = {
      val r = parseMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PST(F)
      return r
    }

    def parseMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PS")
      }
      parser.parseObjectKey("api_qualifiedWarehouseEvidence")
      val api_qualifiedWarehouseEvidence = parseMining_Cargo_Transfer_SupervisorQualifiedWarehouseEvidenceType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PS(api_qualifiedWarehouseEvidence)
    }

    def parseMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container(): Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_P", "Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PS"))
      t.native match {
        case "Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_P" => val r = parseMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PS" => val r = parseMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PST(T); return r
        case _ => val r = parseMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PST(T); return r
      }
    }

    def parseMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_P(): Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_P = {
      val r = parseMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PT(F)
      return r
    }

    def parseMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_P")
      }
      parser.parseObjectKey("api_dockingAssessment")
      val api_dockingAssessment = parseMining_Cargo_Transfer_SupervisorDockingAssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_qualifiedRequest")
      val api_qualifiedRequest = parseMining_Cargo_Transfer_SupervisorQualifiedRequestType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_qualifiedShipProgress")
      val api_qualifiedShipProgress = parseMining_Cargo_Transfer_SupervisorQualifiedShipProgressType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_qualifiedWarehouseEvidence")
      val api_qualifiedWarehouseEvidence = parseMining_Cargo_Transfer_SupervisorQualifiedWarehouseEvidenceType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_P(api_dockingAssessment, api_qualifiedRequest, api_qualifiedShipProgress, api_qualifiedWarehouseEvidence)
    }

    def parseMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PS(): Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PS = {
      val r = parseMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PST(F)
      return r
    }

    def parseMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PS")
      }
      parser.parseObjectKey("In_rearmRequired")
      val In_rearmRequired = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("In_transferPhase")
      val In_transferPhase = parseMining_Cargo_Transfer_SupervisorTransferPhaseType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_dockingAssessment")
      val api_dockingAssessment = parseMining_Cargo_Transfer_SupervisorDockingAssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_qualifiedRequest")
      val api_qualifiedRequest = parseMining_Cargo_Transfer_SupervisorQualifiedRequestType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_qualifiedShipProgress")
      val api_qualifiedShipProgress = parseMining_Cargo_Transfer_SupervisorQualifiedShipProgressType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_qualifiedWarehouseEvidence")
      val api_qualifiedWarehouseEvidence = parseMining_Cargo_Transfer_SupervisorQualifiedWarehouseEvidenceType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PS(In_rearmRequired, In_transferPhase, api_dockingAssessment, api_qualifiedRequest, api_qualifiedShipProgress, api_qualifiedWarehouseEvidence)
    }

    def parseMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container(): Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_P", "Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PS"))
      t.native match {
        case "Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_P" => val r = parseMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PS" => val r = parseMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PST(T); return r
        case _ => val r = parseMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PST(T); return r
      }
    }

    def parseMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_P(): Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_P = {
      val r = parseMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PT(F)
      return r
    }

    def parseMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_P")
      }
      parser.parseObjectKey("api_commandResolution")
      val api_commandResolution = parseMining_Cargo_Transfer_SupervisorTransferResolution()
      parser.parseObjectNext()
      parser.parseObjectKey("api_reportResolution")
      val api_reportResolution = parseMining_Cargo_Transfer_SupervisorTransferResolution()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_P(api_commandResolution, api_reportResolution)
    }

    def parseMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PS(): Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PS = {
      val r = parseMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PST(F)
      return r
    }

    def parseMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PS")
      }
      parser.parseObjectKey("rearmRequired")
      val rearmRequired = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("transferPhase")
      val transferPhase = parseMining_Cargo_Transfer_SupervisorTransferPhaseType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_commandResolution")
      val api_commandResolution = parseMining_Cargo_Transfer_SupervisorTransferResolution()
      parser.parseObjectNext()
      parser.parseObjectKey("api_reportResolution")
      val api_reportResolution = parseMining_Cargo_Transfer_SupervisorTransferResolution()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PS(rearmRequired, transferPhase, api_commandResolution, api_reportResolution)
    }

    def parseMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container(): Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_P", "Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PS"))
      t.native match {
        case "Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_P" => val r = parseMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PS" => val r = parseMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PST(T); return r
        case _ => val r = parseMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PST(T); return r
      }
    }

    def parseMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_P(): Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_P = {
      val r = parseMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PT(F)
      return r
    }

    def parseMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_P")
      }
      parser.parseObjectKey("api_resolution")
      val api_resolution = parseMining_Cargo_Transfer_SupervisorTransferResolution()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_P(api_resolution)
    }

    def parseMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PS(): Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PS = {
      val r = parseMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PST(F)
      return r
    }

    def parseMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PS")
      }
      parser.parseObjectKey("api_resolution")
      val api_resolution = parseMining_Cargo_Transfer_SupervisorTransferResolution()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PS(api_resolution)
    }

    def parseMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container(): Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_P", "Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PS"))
      t.native match {
        case "Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_P" => val r = parseMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PS" => val r = parseMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PST(T); return r
        case _ => val r = parseMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PST(T); return r
      }
    }

    def parseMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_P(): Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_P = {
      val r = parseMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PT(F)
      return r
    }

    def parseMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_P")
      }
      parser.parseObjectKey("api_command")
      val api_command = parseMining_Cargo_Transfer_SupervisorCargoTransferCommandType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_P(api_command)
    }

    def parseMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PS(): Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PS = {
      val r = parseMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PST(F)
      return r
    }

    def parseMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PS")
      }
      parser.parseObjectKey("api_command")
      val api_command = parseMining_Cargo_Transfer_SupervisorCargoTransferCommandType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PS(api_command)
    }

    def parseMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container(): Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_P", "Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PS"))
      t.native match {
        case "Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_P" => val r = parseMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PS" => val r = parseMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PST(T); return r
        case _ => val r = parseMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PST(T); return r
      }
    }

    def parseMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_P(): Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_P = {
      val r = parseMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PT(F)
      return r
    }

    def parseMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_P")
      }
      parser.parseObjectKey("api_resolution")
      val api_resolution = parseMining_Cargo_Transfer_SupervisorTransferResolution()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_P(api_resolution)
    }

    def parseMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PS(): Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PS = {
      val r = parseMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PST(F)
      return r
    }

    def parseMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PS")
      }
      parser.parseObjectKey("api_resolution")
      val api_resolution = parseMining_Cargo_Transfer_SupervisorTransferResolution()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PS(api_resolution)
    }

    def parseMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container(): Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_P", "Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PS"))
      t.native match {
        case "Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_P" => val r = parseMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PS" => val r = parseMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PST(T); return r
        case _ => val r = parseMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PST(T); return r
      }
    }

    def parseMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_P(): Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_P = {
      val r = parseMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PT(F)
      return r
    }

    def parseMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_P")
      }
      parser.parseObjectKey("api_supervisorStatus")
      val api_supervisorStatus = parseMining_Cargo_Transfer_SupervisorTransferSupervisorStatusType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_verificationFinding")
      val api_verificationFinding = parseMining_Cargo_Transfer_SupervisorTransferVerificationFindingType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_P(api_supervisorStatus, api_verificationFinding)
    }

    def parseMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PS(): Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PS = {
      val r = parseMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PST(F)
      return r
    }

    def parseMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PS")
      }
      parser.parseObjectKey("api_supervisorStatus")
      val api_supervisorStatus = parseMining_Cargo_Transfer_SupervisorTransferSupervisorStatusType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_verificationFinding")
      val api_verificationFinding = parseMining_Cargo_Transfer_SupervisorTransferVerificationFindingType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PS(api_supervisorStatus, api_verificationFinding)
    }

    def parseruntimemonitorObservationKindType(): runtimemonitor.ObservationKind.Type = {
      val r = parseruntimemonitorObservationKindT(F)
      return r
    }

    def parseruntimemonitorObservationKindT(typeParsed: B): runtimemonitor.ObservationKind.Type = {
      if (!typeParsed) {
        parser.parseObjectType("runtimemonitor.ObservationKind")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      runtimemonitor.ObservationKind.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for runtimemonitor.ObservationKind.")
          return runtimemonitor.ObservationKind.byOrdinal(0).get
      }
    }

    def parseutilContainer(): util.Container = {
      val t = parser.parseObjectTypes(ISZ("util.EmptyContainer", "Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PreState_Container_P", "Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PreState_Container_PS", "Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PostState_Container_P", "Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PostState_Container_PS", "Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_P", "Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PS", "Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_P", "Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PS", "Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_P", "Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PS", "Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_P", "Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PS", "Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_P", "Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PS", "Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_P", "Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PS", "Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_P", "Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_P", "Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PS", "Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PS", "Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_P", "Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_P", "Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PS", "Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PS", "Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_P", "Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PS", "Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_P", "Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PS"))
      t.native match {
        case "util.EmptyContainer" => val r = parseutilEmptyContainerT(T); return r
        case "Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PreState_Container_P" => val r = parseMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PreState_Container_PS" => val r = parseMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PostState_Container_P" => val r = parseMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PostState_Container_PS" => val r = parseMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_P" => val r = parseMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PS" => val r = parseMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_P" => val r = parseMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PS" => val r = parseMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_P" => val r = parseMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PS" => val r = parseMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_P" => val r = parseMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PS" => val r = parseMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_P" => val r = parseMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PS" => val r = parseMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_P" => val r = parseMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PS" => val r = parseMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_P" => val r = parseMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_P" => val r = parseMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PS" => val r = parseMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PS" => val r = parseMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_P" => val r = parseMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_P" => val r = parseMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PS" => val r = parseMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PS" => val r = parseMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_P" => val r = parseMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PS" => val r = parseMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_P" => val r = parseMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PS" => val r = parseMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PST(T); return r
        case _ => val r = parseMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PST(T); return r
      }
    }

    def parseutilEmptyContainer(): util.EmptyContainer = {
      val r = parseutilEmptyContainerT(F)
      return r
    }

    def parseutilEmptyContainerT(typeParsed: B): util.EmptyContainer = {
      if (!typeParsed) {
        parser.parseObjectType("util.EmptyContainer")
      }
      return util.EmptyContainer()
    }

    def parse_artDataContent(): art.DataContent = {
      val t = parser.parseObjectTypes(ISZ("art.Empty", "Base_Types.Boolean_Payload", "Base_Types.Integer_Payload", "Base_Types.Integer_8_Payload", "Base_Types.Integer_16_Payload", "Base_Types.Integer_32_Payload", "Base_Types.Integer_64_Payload", "Base_Types.Unsigned_8_Payload", "Base_Types.Unsigned_16_Payload", "Base_Types.Unsigned_32_Payload", "Base_Types.Unsigned_64_Payload", "Base_Types.Float_Payload", "Base_Types.Float_32_Payload", "Base_Types.Float_64_Payload", "Base_Types.Character_Payload", "Base_Types.String_Payload", "Base_Types.Bits_Payload", "util.EmptyContainer", "Mining_Cargo_Transfer_Supervisor.InputStatus_Payload", "Mining_Cargo_Transfer_Supervisor.TransferPhase_Payload", "Mining_Cargo_Transfer_Supervisor.DockingSample_Payload", "Mining_Cargo_Transfer_Supervisor.QualifiedRequest_Payload", "Mining_Cargo_Transfer_Supervisor.DockingAssessment_Payload", "Mining_Cargo_Transfer_Supervisor.DockingObservation_Payload", "Mining_Cargo_Transfer_Supervisor.ShipTransferSample_Payload", "Mining_Cargo_Transfer_Supervisor.TransferResolution_Payload", "Mining_Cargo_Transfer_Supervisor.OffloadRequestEvent_Payload", "Mining_Cargo_Transfer_Supervisor.TransferDisposition_Payload", "Mining_Cargo_Transfer_Supervisor.CargoTransferCommand_Payload", "Mining_Cargo_Transfer_Supervisor.ShipTransferProgress_Payload", "Mining_Cargo_Transfer_Supervisor.OffloadRequestSample_Payload", "Mining_Cargo_Transfer_Supervisor.QualifiedShipProgress_Payload", "Mining_Cargo_Transfer_Supervisor.WarehouseReceiptSample_Payload", "Mining_Cargo_Transfer_Supervisor.WarehouseReceiptEvidence_Payload", "Mining_Cargo_Transfer_Supervisor.TransferSupervisorStatus_Payload", "Mining_Cargo_Transfer_Supervisor.QualifiedWarehouseEvidence_Payload", "Mining_Cargo_Transfer_Supervisor.TransferVerificationFinding_Payload", "Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PreState_Container_P", "Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PreState_Container_PS", "Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PostState_Container_P", "Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PostState_Container_PS", "Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_P", "Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PS", "Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_P", "Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PS", "Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_P", "Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PS", "Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_P", "Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PS", "Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_P", "Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PS", "Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_P", "Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PS", "Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_P", "Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_P", "Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PS", "Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PS", "Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_P", "Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_P", "Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PS", "Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PS", "Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_P", "Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PS", "Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_P", "Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PS"))
      t.native match {
        case "art.Empty" => val r = parse_artEmptyT(T); return r
        case "Base_Types.Boolean_Payload" => val r = parseBase_TypesBoolean_PayloadT(T); return r
        case "Base_Types.Integer_Payload" => val r = parseBase_TypesInteger_PayloadT(T); return r
        case "Base_Types.Integer_8_Payload" => val r = parseBase_TypesInteger_8_PayloadT(T); return r
        case "Base_Types.Integer_16_Payload" => val r = parseBase_TypesInteger_16_PayloadT(T); return r
        case "Base_Types.Integer_32_Payload" => val r = parseBase_TypesInteger_32_PayloadT(T); return r
        case "Base_Types.Integer_64_Payload" => val r = parseBase_TypesInteger_64_PayloadT(T); return r
        case "Base_Types.Unsigned_8_Payload" => val r = parseBase_TypesUnsigned_8_PayloadT(T); return r
        case "Base_Types.Unsigned_16_Payload" => val r = parseBase_TypesUnsigned_16_PayloadT(T); return r
        case "Base_Types.Unsigned_32_Payload" => val r = parseBase_TypesUnsigned_32_PayloadT(T); return r
        case "Base_Types.Unsigned_64_Payload" => val r = parseBase_TypesUnsigned_64_PayloadT(T); return r
        case "Base_Types.Float_Payload" => val r = parseBase_TypesFloat_PayloadT(T); return r
        case "Base_Types.Float_32_Payload" => val r = parseBase_TypesFloat_32_PayloadT(T); return r
        case "Base_Types.Float_64_Payload" => val r = parseBase_TypesFloat_64_PayloadT(T); return r
        case "Base_Types.Character_Payload" => val r = parseBase_TypesCharacter_PayloadT(T); return r
        case "Base_Types.String_Payload" => val r = parseBase_TypesString_PayloadT(T); return r
        case "Base_Types.Bits_Payload" => val r = parseBase_TypesBits_PayloadT(T); return r
        case "util.EmptyContainer" => val r = parseutilEmptyContainerT(T); return r
        case "Mining_Cargo_Transfer_Supervisor.InputStatus_Payload" => val r = parseMining_Cargo_Transfer_SupervisorInputStatus_PayloadT(T); return r
        case "Mining_Cargo_Transfer_Supervisor.TransferPhase_Payload" => val r = parseMining_Cargo_Transfer_SupervisorTransferPhase_PayloadT(T); return r
        case "Mining_Cargo_Transfer_Supervisor.DockingSample_Payload" => val r = parseMining_Cargo_Transfer_SupervisorDockingSample_PayloadT(T); return r
        case "Mining_Cargo_Transfer_Supervisor.QualifiedRequest_Payload" => val r = parseMining_Cargo_Transfer_SupervisorQualifiedRequest_PayloadT(T); return r
        case "Mining_Cargo_Transfer_Supervisor.DockingAssessment_Payload" => val r = parseMining_Cargo_Transfer_SupervisorDockingAssessment_PayloadT(T); return r
        case "Mining_Cargo_Transfer_Supervisor.DockingObservation_Payload" => val r = parseMining_Cargo_Transfer_SupervisorDockingObservation_PayloadT(T); return r
        case "Mining_Cargo_Transfer_Supervisor.ShipTransferSample_Payload" => val r = parseMining_Cargo_Transfer_SupervisorShipTransferSample_PayloadT(T); return r
        case "Mining_Cargo_Transfer_Supervisor.TransferResolution_Payload" => val r = parseMining_Cargo_Transfer_SupervisorTransferResolution_PayloadT(T); return r
        case "Mining_Cargo_Transfer_Supervisor.OffloadRequestEvent_Payload" => val r = parseMining_Cargo_Transfer_SupervisorOffloadRequestEvent_PayloadT(T); return r
        case "Mining_Cargo_Transfer_Supervisor.TransferDisposition_Payload" => val r = parseMining_Cargo_Transfer_SupervisorTransferDisposition_PayloadT(T); return r
        case "Mining_Cargo_Transfer_Supervisor.CargoTransferCommand_Payload" => val r = parseMining_Cargo_Transfer_SupervisorCargoTransferCommand_PayloadT(T); return r
        case "Mining_Cargo_Transfer_Supervisor.ShipTransferProgress_Payload" => val r = parseMining_Cargo_Transfer_SupervisorShipTransferProgress_PayloadT(T); return r
        case "Mining_Cargo_Transfer_Supervisor.OffloadRequestSample_Payload" => val r = parseMining_Cargo_Transfer_SupervisorOffloadRequestSample_PayloadT(T); return r
        case "Mining_Cargo_Transfer_Supervisor.QualifiedShipProgress_Payload" => val r = parseMining_Cargo_Transfer_SupervisorQualifiedShipProgress_PayloadT(T); return r
        case "Mining_Cargo_Transfer_Supervisor.WarehouseReceiptSample_Payload" => val r = parseMining_Cargo_Transfer_SupervisorWarehouseReceiptSample_PayloadT(T); return r
        case "Mining_Cargo_Transfer_Supervisor.WarehouseReceiptEvidence_Payload" => val r = parseMining_Cargo_Transfer_SupervisorWarehouseReceiptEvidence_PayloadT(T); return r
        case "Mining_Cargo_Transfer_Supervisor.TransferSupervisorStatus_Payload" => val r = parseMining_Cargo_Transfer_SupervisorTransferSupervisorStatus_PayloadT(T); return r
        case "Mining_Cargo_Transfer_Supervisor.QualifiedWarehouseEvidence_Payload" => val r = parseMining_Cargo_Transfer_SupervisorQualifiedWarehouseEvidence_PayloadT(T); return r
        case "Mining_Cargo_Transfer_Supervisor.TransferVerificationFinding_Payload" => val r = parseMining_Cargo_Transfer_SupervisorTransferVerificationFinding_PayloadT(T); return r
        case "Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PreState_Container_P" => val r = parseMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PreState_Container_PS" => val r = parseMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PostState_Container_P" => val r = parseMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PostState_Container_PS" => val r = parseMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_P" => val r = parseMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PS" => val r = parseMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_P" => val r = parseMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PS" => val r = parseMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_P" => val r = parseMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PS" => val r = parseMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_P" => val r = parseMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PS" => val r = parseMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_P" => val r = parseMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PS" => val r = parseMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_P" => val r = parseMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PS" => val r = parseMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_P" => val r = parseMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_P" => val r = parseMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PS" => val r = parseMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PS" => val r = parseMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_P" => val r = parseMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_P" => val r = parseMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PS" => val r = parseMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PS" => val r = parseMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_P" => val r = parseMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PS" => val r = parseMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_P" => val r = parseMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PS" => val r = parseMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PST(T); return r
        case _ => val r = parseMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PST(T); return r
      }
    }

    def parse_artEmpty(): art.Empty = {
      val r = parse_artEmptyT(F)
      return r
    }

    def parse_artEmptyT(typeParsed: B): art.Empty = {
      if (!typeParsed) {
        parser.parseObjectType("art.Empty")
      }
      return art.Empty()
    }

    def eof(): B = {
      val r = parser.eof()
      return r
    }

  }

  def to[T](s: String, f: Parser => T): Either[T, Json.ErrorMsg] = {
    val parser = Parser(s)
    val r = f(parser)
    parser.eof()
    parser.errorOpt match {
      case Some(e) => return Either.Right(e)
      case _ => return Either.Left(r)
    }
  }

  def fromMining_Cargo_Transfer_SupervisorOffloadRequestEvent_Payload(o: Mining_Cargo_Transfer_Supervisor.OffloadRequestEvent_Payload, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_SupervisorOffloadRequestEvent_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_SupervisorOffloadRequestEvent_Payload(s: String): Either[Mining_Cargo_Transfer_Supervisor.OffloadRequestEvent_Payload, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorOffloadRequestEvent_Payload(parser: Parser): Mining_Cargo_Transfer_Supervisor.OffloadRequestEvent_Payload = {
      val r = parser.parseMining_Cargo_Transfer_SupervisorOffloadRequestEvent_Payload()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_SupervisorOffloadRequestEvent_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorInputStatus_Payload(o: Mining_Cargo_Transfer_Supervisor.InputStatus_Payload, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_SupervisorInputStatus_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_SupervisorInputStatus_Payload(s: String): Either[Mining_Cargo_Transfer_Supervisor.InputStatus_Payload, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorInputStatus_Payload(parser: Parser): Mining_Cargo_Transfer_Supervisor.InputStatus_Payload = {
      val r = parser.parseMining_Cargo_Transfer_SupervisorInputStatus_Payload()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_SupervisorInputStatus_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorQualifiedRequest_Payload(o: Mining_Cargo_Transfer_Supervisor.QualifiedRequest_Payload, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_SupervisorQualifiedRequest_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_SupervisorQualifiedRequest_Payload(s: String): Either[Mining_Cargo_Transfer_Supervisor.QualifiedRequest_Payload, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorQualifiedRequest_Payload(parser: Parser): Mining_Cargo_Transfer_Supervisor.QualifiedRequest_Payload = {
      val r = parser.parseMining_Cargo_Transfer_SupervisorQualifiedRequest_Payload()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_SupervisorQualifiedRequest_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorDockingObservation_Payload(o: Mining_Cargo_Transfer_Supervisor.DockingObservation_Payload, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_SupervisorDockingObservation_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_SupervisorDockingObservation_Payload(s: String): Either[Mining_Cargo_Transfer_Supervisor.DockingObservation_Payload, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorDockingObservation_Payload(parser: Parser): Mining_Cargo_Transfer_Supervisor.DockingObservation_Payload = {
      val r = parser.parseMining_Cargo_Transfer_SupervisorDockingObservation_Payload()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_SupervisorDockingObservation_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorDockingAssessment_Payload(o: Mining_Cargo_Transfer_Supervisor.DockingAssessment_Payload, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_SupervisorDockingAssessment_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_SupervisorDockingAssessment_Payload(s: String): Either[Mining_Cargo_Transfer_Supervisor.DockingAssessment_Payload, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorDockingAssessment_Payload(parser: Parser): Mining_Cargo_Transfer_Supervisor.DockingAssessment_Payload = {
      val r = parser.parseMining_Cargo_Transfer_SupervisorDockingAssessment_Payload()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_SupervisorDockingAssessment_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorShipTransferProgress_Payload(o: Mining_Cargo_Transfer_Supervisor.ShipTransferProgress_Payload, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_SupervisorShipTransferProgress_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_SupervisorShipTransferProgress_Payload(s: String): Either[Mining_Cargo_Transfer_Supervisor.ShipTransferProgress_Payload, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorShipTransferProgress_Payload(parser: Parser): Mining_Cargo_Transfer_Supervisor.ShipTransferProgress_Payload = {
      val r = parser.parseMining_Cargo_Transfer_SupervisorShipTransferProgress_Payload()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_SupervisorShipTransferProgress_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorQualifiedShipProgress_Payload(o: Mining_Cargo_Transfer_Supervisor.QualifiedShipProgress_Payload, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_SupervisorQualifiedShipProgress_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_SupervisorQualifiedShipProgress_Payload(s: String): Either[Mining_Cargo_Transfer_Supervisor.QualifiedShipProgress_Payload, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorQualifiedShipProgress_Payload(parser: Parser): Mining_Cargo_Transfer_Supervisor.QualifiedShipProgress_Payload = {
      val r = parser.parseMining_Cargo_Transfer_SupervisorQualifiedShipProgress_Payload()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_SupervisorQualifiedShipProgress_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorWarehouseReceiptEvidence_Payload(o: Mining_Cargo_Transfer_Supervisor.WarehouseReceiptEvidence_Payload, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_SupervisorWarehouseReceiptEvidence_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_SupervisorWarehouseReceiptEvidence_Payload(s: String): Either[Mining_Cargo_Transfer_Supervisor.WarehouseReceiptEvidence_Payload, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorWarehouseReceiptEvidence_Payload(parser: Parser): Mining_Cargo_Transfer_Supervisor.WarehouseReceiptEvidence_Payload = {
      val r = parser.parseMining_Cargo_Transfer_SupervisorWarehouseReceiptEvidence_Payload()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_SupervisorWarehouseReceiptEvidence_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorQualifiedWarehouseEvidence_Payload(o: Mining_Cargo_Transfer_Supervisor.QualifiedWarehouseEvidence_Payload, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_SupervisorQualifiedWarehouseEvidence_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_SupervisorQualifiedWarehouseEvidence_Payload(s: String): Either[Mining_Cargo_Transfer_Supervisor.QualifiedWarehouseEvidence_Payload, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorQualifiedWarehouseEvidence_Payload(parser: Parser): Mining_Cargo_Transfer_Supervisor.QualifiedWarehouseEvidence_Payload = {
      val r = parser.parseMining_Cargo_Transfer_SupervisorQualifiedWarehouseEvidence_Payload()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_SupervisorQualifiedWarehouseEvidence_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorTransferPhase_Payload(o: Mining_Cargo_Transfer_Supervisor.TransferPhase_Payload, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_SupervisorTransferPhase_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_SupervisorTransferPhase_Payload(s: String): Either[Mining_Cargo_Transfer_Supervisor.TransferPhase_Payload, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorTransferPhase_Payload(parser: Parser): Mining_Cargo_Transfer_Supervisor.TransferPhase_Payload = {
      val r = parser.parseMining_Cargo_Transfer_SupervisorTransferPhase_Payload()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_SupervisorTransferPhase_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorTransferDisposition_Payload(o: Mining_Cargo_Transfer_Supervisor.TransferDisposition_Payload, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_SupervisorTransferDisposition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_SupervisorTransferDisposition_Payload(s: String): Either[Mining_Cargo_Transfer_Supervisor.TransferDisposition_Payload, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorTransferDisposition_Payload(parser: Parser): Mining_Cargo_Transfer_Supervisor.TransferDisposition_Payload = {
      val r = parser.parseMining_Cargo_Transfer_SupervisorTransferDisposition_Payload()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_SupervisorTransferDisposition_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorCargoTransferCommand_Payload(o: Mining_Cargo_Transfer_Supervisor.CargoTransferCommand_Payload, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_SupervisorCargoTransferCommand_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_SupervisorCargoTransferCommand_Payload(s: String): Either[Mining_Cargo_Transfer_Supervisor.CargoTransferCommand_Payload, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorCargoTransferCommand_Payload(parser: Parser): Mining_Cargo_Transfer_Supervisor.CargoTransferCommand_Payload = {
      val r = parser.parseMining_Cargo_Transfer_SupervisorCargoTransferCommand_Payload()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_SupervisorCargoTransferCommand_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorTransferSupervisorStatus_Payload(o: Mining_Cargo_Transfer_Supervisor.TransferSupervisorStatus_Payload, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_SupervisorTransferSupervisorStatus_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_SupervisorTransferSupervisorStatus_Payload(s: String): Either[Mining_Cargo_Transfer_Supervisor.TransferSupervisorStatus_Payload, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorTransferSupervisorStatus_Payload(parser: Parser): Mining_Cargo_Transfer_Supervisor.TransferSupervisorStatus_Payload = {
      val r = parser.parseMining_Cargo_Transfer_SupervisorTransferSupervisorStatus_Payload()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_SupervisorTransferSupervisorStatus_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorTransferVerificationFinding_Payload(o: Mining_Cargo_Transfer_Supervisor.TransferVerificationFinding_Payload, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_SupervisorTransferVerificationFinding_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_SupervisorTransferVerificationFinding_Payload(s: String): Either[Mining_Cargo_Transfer_Supervisor.TransferVerificationFinding_Payload, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorTransferVerificationFinding_Payload(parser: Parser): Mining_Cargo_Transfer_Supervisor.TransferVerificationFinding_Payload = {
      val r = parser.parseMining_Cargo_Transfer_SupervisorTransferVerificationFinding_Payload()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_SupervisorTransferVerificationFinding_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorOffloadRequestSample(o: Mining_Cargo_Transfer_Supervisor.OffloadRequestSample, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_SupervisorOffloadRequestSample(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_SupervisorOffloadRequestSample(s: String): Either[Mining_Cargo_Transfer_Supervisor.OffloadRequestSample, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorOffloadRequestSample(parser: Parser): Mining_Cargo_Transfer_Supervisor.OffloadRequestSample = {
      val r = parser.parseMining_Cargo_Transfer_SupervisorOffloadRequestSample()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_SupervisorOffloadRequestSample _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorOffloadRequestSample_Payload(o: Mining_Cargo_Transfer_Supervisor.OffloadRequestSample_Payload, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_SupervisorOffloadRequestSample_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_SupervisorOffloadRequestSample_Payload(s: String): Either[Mining_Cargo_Transfer_Supervisor.OffloadRequestSample_Payload, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorOffloadRequestSample_Payload(parser: Parser): Mining_Cargo_Transfer_Supervisor.OffloadRequestSample_Payload = {
      val r = parser.parseMining_Cargo_Transfer_SupervisorOffloadRequestSample_Payload()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_SupervisorOffloadRequestSample_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorDockingSample(o: Mining_Cargo_Transfer_Supervisor.DockingSample, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_SupervisorDockingSample(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_SupervisorDockingSample(s: String): Either[Mining_Cargo_Transfer_Supervisor.DockingSample, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorDockingSample(parser: Parser): Mining_Cargo_Transfer_Supervisor.DockingSample = {
      val r = parser.parseMining_Cargo_Transfer_SupervisorDockingSample()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_SupervisorDockingSample _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorDockingSample_Payload(o: Mining_Cargo_Transfer_Supervisor.DockingSample_Payload, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_SupervisorDockingSample_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_SupervisorDockingSample_Payload(s: String): Either[Mining_Cargo_Transfer_Supervisor.DockingSample_Payload, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorDockingSample_Payload(parser: Parser): Mining_Cargo_Transfer_Supervisor.DockingSample_Payload = {
      val r = parser.parseMining_Cargo_Transfer_SupervisorDockingSample_Payload()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_SupervisorDockingSample_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorShipTransferSample(o: Mining_Cargo_Transfer_Supervisor.ShipTransferSample, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_SupervisorShipTransferSample(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_SupervisorShipTransferSample(s: String): Either[Mining_Cargo_Transfer_Supervisor.ShipTransferSample, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorShipTransferSample(parser: Parser): Mining_Cargo_Transfer_Supervisor.ShipTransferSample = {
      val r = parser.parseMining_Cargo_Transfer_SupervisorShipTransferSample()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_SupervisorShipTransferSample _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorShipTransferSample_Payload(o: Mining_Cargo_Transfer_Supervisor.ShipTransferSample_Payload, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_SupervisorShipTransferSample_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_SupervisorShipTransferSample_Payload(s: String): Either[Mining_Cargo_Transfer_Supervisor.ShipTransferSample_Payload, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorShipTransferSample_Payload(parser: Parser): Mining_Cargo_Transfer_Supervisor.ShipTransferSample_Payload = {
      val r = parser.parseMining_Cargo_Transfer_SupervisorShipTransferSample_Payload()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_SupervisorShipTransferSample_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorWarehouseReceiptSample(o: Mining_Cargo_Transfer_Supervisor.WarehouseReceiptSample, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_SupervisorWarehouseReceiptSample(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_SupervisorWarehouseReceiptSample(s: String): Either[Mining_Cargo_Transfer_Supervisor.WarehouseReceiptSample, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorWarehouseReceiptSample(parser: Parser): Mining_Cargo_Transfer_Supervisor.WarehouseReceiptSample = {
      val r = parser.parseMining_Cargo_Transfer_SupervisorWarehouseReceiptSample()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_SupervisorWarehouseReceiptSample _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorWarehouseReceiptSample_Payload(o: Mining_Cargo_Transfer_Supervisor.WarehouseReceiptSample_Payload, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_SupervisorWarehouseReceiptSample_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_SupervisorWarehouseReceiptSample_Payload(s: String): Either[Mining_Cargo_Transfer_Supervisor.WarehouseReceiptSample_Payload, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorWarehouseReceiptSample_Payload(parser: Parser): Mining_Cargo_Transfer_Supervisor.WarehouseReceiptSample_Payload = {
      val r = parser.parseMining_Cargo_Transfer_SupervisorWarehouseReceiptSample_Payload()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_SupervisorWarehouseReceiptSample_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorTransferResolution(o: Mining_Cargo_Transfer_Supervisor.TransferResolution, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_SupervisorTransferResolution(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_SupervisorTransferResolution(s: String): Either[Mining_Cargo_Transfer_Supervisor.TransferResolution, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorTransferResolution(parser: Parser): Mining_Cargo_Transfer_Supervisor.TransferResolution = {
      val r = parser.parseMining_Cargo_Transfer_SupervisorTransferResolution()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_SupervisorTransferResolution _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorTransferResolution_Payload(o: Mining_Cargo_Transfer_Supervisor.TransferResolution_Payload, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_SupervisorTransferResolution_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_SupervisorTransferResolution_Payload(s: String): Either[Mining_Cargo_Transfer_Supervisor.TransferResolution_Payload, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorTransferResolution_Payload(parser: Parser): Mining_Cargo_Transfer_Supervisor.TransferResolution_Payload = {
      val r = parser.parseMining_Cargo_Transfer_SupervisorTransferResolution_Payload()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_SupervisorTransferResolution_Payload _)
    return r
  }

  def fromBase_TypesBoolean_Payload(o: Base_Types.Boolean_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesBoolean_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesBoolean_Payload(s: String): Either[Base_Types.Boolean_Payload, Json.ErrorMsg] = {
    def fBase_TypesBoolean_Payload(parser: Parser): Base_Types.Boolean_Payload = {
      val r = parser.parseBase_TypesBoolean_Payload()
      return r
    }
    val r = to(s, fBase_TypesBoolean_Payload _)
    return r
  }

  def fromBase_TypesInteger_Payload(o: Base_Types.Integer_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesInteger_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesInteger_Payload(s: String): Either[Base_Types.Integer_Payload, Json.ErrorMsg] = {
    def fBase_TypesInteger_Payload(parser: Parser): Base_Types.Integer_Payload = {
      val r = parser.parseBase_TypesInteger_Payload()
      return r
    }
    val r = to(s, fBase_TypesInteger_Payload _)
    return r
  }

  def fromBase_TypesInteger_8_Payload(o: Base_Types.Integer_8_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesInteger_8_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesInteger_8_Payload(s: String): Either[Base_Types.Integer_8_Payload, Json.ErrorMsg] = {
    def fBase_TypesInteger_8_Payload(parser: Parser): Base_Types.Integer_8_Payload = {
      val r = parser.parseBase_TypesInteger_8_Payload()
      return r
    }
    val r = to(s, fBase_TypesInteger_8_Payload _)
    return r
  }

  def fromBase_TypesInteger_16_Payload(o: Base_Types.Integer_16_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesInteger_16_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesInteger_16_Payload(s: String): Either[Base_Types.Integer_16_Payload, Json.ErrorMsg] = {
    def fBase_TypesInteger_16_Payload(parser: Parser): Base_Types.Integer_16_Payload = {
      val r = parser.parseBase_TypesInteger_16_Payload()
      return r
    }
    val r = to(s, fBase_TypesInteger_16_Payload _)
    return r
  }

  def fromBase_TypesInteger_32_Payload(o: Base_Types.Integer_32_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesInteger_32_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesInteger_32_Payload(s: String): Either[Base_Types.Integer_32_Payload, Json.ErrorMsg] = {
    def fBase_TypesInteger_32_Payload(parser: Parser): Base_Types.Integer_32_Payload = {
      val r = parser.parseBase_TypesInteger_32_Payload()
      return r
    }
    val r = to(s, fBase_TypesInteger_32_Payload _)
    return r
  }

  def fromBase_TypesInteger_64_Payload(o: Base_Types.Integer_64_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesInteger_64_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesInteger_64_Payload(s: String): Either[Base_Types.Integer_64_Payload, Json.ErrorMsg] = {
    def fBase_TypesInteger_64_Payload(parser: Parser): Base_Types.Integer_64_Payload = {
      val r = parser.parseBase_TypesInteger_64_Payload()
      return r
    }
    val r = to(s, fBase_TypesInteger_64_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_8_Payload(o: Base_Types.Unsigned_8_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesUnsigned_8_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesUnsigned_8_Payload(s: String): Either[Base_Types.Unsigned_8_Payload, Json.ErrorMsg] = {
    def fBase_TypesUnsigned_8_Payload(parser: Parser): Base_Types.Unsigned_8_Payload = {
      val r = parser.parseBase_TypesUnsigned_8_Payload()
      return r
    }
    val r = to(s, fBase_TypesUnsigned_8_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_16_Payload(o: Base_Types.Unsigned_16_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesUnsigned_16_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesUnsigned_16_Payload(s: String): Either[Base_Types.Unsigned_16_Payload, Json.ErrorMsg] = {
    def fBase_TypesUnsigned_16_Payload(parser: Parser): Base_Types.Unsigned_16_Payload = {
      val r = parser.parseBase_TypesUnsigned_16_Payload()
      return r
    }
    val r = to(s, fBase_TypesUnsigned_16_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_32_Payload(o: Base_Types.Unsigned_32_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesUnsigned_32_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesUnsigned_32_Payload(s: String): Either[Base_Types.Unsigned_32_Payload, Json.ErrorMsg] = {
    def fBase_TypesUnsigned_32_Payload(parser: Parser): Base_Types.Unsigned_32_Payload = {
      val r = parser.parseBase_TypesUnsigned_32_Payload()
      return r
    }
    val r = to(s, fBase_TypesUnsigned_32_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_64_Payload(o: Base_Types.Unsigned_64_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesUnsigned_64_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesUnsigned_64_Payload(s: String): Either[Base_Types.Unsigned_64_Payload, Json.ErrorMsg] = {
    def fBase_TypesUnsigned_64_Payload(parser: Parser): Base_Types.Unsigned_64_Payload = {
      val r = parser.parseBase_TypesUnsigned_64_Payload()
      return r
    }
    val r = to(s, fBase_TypesUnsigned_64_Payload _)
    return r
  }

  def fromBase_TypesFloat_Payload(o: Base_Types.Float_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesFloat_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesFloat_Payload(s: String): Either[Base_Types.Float_Payload, Json.ErrorMsg] = {
    def fBase_TypesFloat_Payload(parser: Parser): Base_Types.Float_Payload = {
      val r = parser.parseBase_TypesFloat_Payload()
      return r
    }
    val r = to(s, fBase_TypesFloat_Payload _)
    return r
  }

  def fromBase_TypesFloat_32_Payload(o: Base_Types.Float_32_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesFloat_32_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesFloat_32_Payload(s: String): Either[Base_Types.Float_32_Payload, Json.ErrorMsg] = {
    def fBase_TypesFloat_32_Payload(parser: Parser): Base_Types.Float_32_Payload = {
      val r = parser.parseBase_TypesFloat_32_Payload()
      return r
    }
    val r = to(s, fBase_TypesFloat_32_Payload _)
    return r
  }

  def fromBase_TypesFloat_64_Payload(o: Base_Types.Float_64_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesFloat_64_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesFloat_64_Payload(s: String): Either[Base_Types.Float_64_Payload, Json.ErrorMsg] = {
    def fBase_TypesFloat_64_Payload(parser: Parser): Base_Types.Float_64_Payload = {
      val r = parser.parseBase_TypesFloat_64_Payload()
      return r
    }
    val r = to(s, fBase_TypesFloat_64_Payload _)
    return r
  }

  def fromBase_TypesCharacter_Payload(o: Base_Types.Character_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesCharacter_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesCharacter_Payload(s: String): Either[Base_Types.Character_Payload, Json.ErrorMsg] = {
    def fBase_TypesCharacter_Payload(parser: Parser): Base_Types.Character_Payload = {
      val r = parser.parseBase_TypesCharacter_Payload()
      return r
    }
    val r = to(s, fBase_TypesCharacter_Payload _)
    return r
  }

  def fromBase_TypesString_Payload(o: Base_Types.String_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesString_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesString_Payload(s: String): Either[Base_Types.String_Payload, Json.ErrorMsg] = {
    def fBase_TypesString_Payload(parser: Parser): Base_Types.String_Payload = {
      val r = parser.parseBase_TypesString_Payload()
      return r
    }
    val r = to(s, fBase_TypesString_Payload _)
    return r
  }

  def fromBase_TypesBits_Payload(o: Base_Types.Bits_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesBits_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesBits_Payload(s: String): Either[Base_Types.Bits_Payload, Json.ErrorMsg] = {
    def fBase_TypesBits_Payload(parser: Parser): Base_Types.Bits_Payload = {
      val r = parser.parseBase_TypesBits_Payload()
      return r
    }
    val r = to(s, fBase_TypesBits_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container(o: Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PreState_Container, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container(s: String): Either[Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PreState_Container, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container(parser: Parser): Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PreState_Container = {
      val r = parser.parseMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_P(o: Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_P(s: String): Either[Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PreState_Container_P, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_P(parser: Parser): Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PreState_Container_P = {
      val r = parser.parseMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_P()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_PS(o: Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_PS(s: String): Either[Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PreState_Container_PS, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_PS(parser: Parser): Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PreState_Container_PS = {
      val r = parser.parseMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_PS()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container(o: Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PostState_Container, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container(s: String): Either[Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PostState_Container, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container(parser: Parser): Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PostState_Container = {
      val r = parser.parseMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_P(o: Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_P(s: String): Either[Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PostState_Container_P, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_P(parser: Parser): Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PostState_Container_P = {
      val r = parser.parseMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_P()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_PS(o: Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_PS(s: String): Either[Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PostState_Container_PS, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_PS(parser: Parser): Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PostState_Container_PS = {
      val r = parser.parseMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_PS()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container(o: Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container(s: String): Either[Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container(parser: Parser): Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container = {
      val r = parser.parseMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_P(o: Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_P(s: String): Either[Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_P, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_P(parser: Parser): Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_P = {
      val r = parser.parseMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_P()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PS(o: Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PS(s: String): Either[Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PS, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PS(parser: Parser): Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PS = {
      val r = parser.parseMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PS()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container(o: Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container(s: String): Either[Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container(parser: Parser): Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container = {
      val r = parser.parseMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_P(o: Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_P(s: String): Either[Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_P, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_P(parser: Parser): Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_P = {
      val r = parser.parseMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_P()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PS(o: Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PS(s: String): Either[Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PS, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PS(parser: Parser): Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PS = {
      val r = parser.parseMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PS()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container(o: Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container(s: String): Either[Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container(parser: Parser): Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container = {
      val r = parser.parseMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_P(o: Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_P(s: String): Either[Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_P, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_P(parser: Parser): Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_P = {
      val r = parser.parseMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_P()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PS(o: Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PS(s: String): Either[Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PS, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PS(parser: Parser): Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PS = {
      val r = parser.parseMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PS()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container(o: Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container(s: String): Either[Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container(parser: Parser): Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container = {
      val r = parser.parseMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_P(o: Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_P(s: String): Either[Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_P, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_P(parser: Parser): Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_P = {
      val r = parser.parseMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_P()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PS(o: Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PS(s: String): Either[Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PS, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PS(parser: Parser): Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PS = {
      val r = parser.parseMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PS()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container(o: Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container(s: String): Either[Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container(parser: Parser): Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container = {
      val r = parser.parseMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_P(o: Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_P(s: String): Either[Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_P, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_P(parser: Parser): Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_P = {
      val r = parser.parseMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_P()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PS(o: Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PS(s: String): Either[Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PS, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PS(parser: Parser): Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PS = {
      val r = parser.parseMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PS()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container(o: Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container(s: String): Either[Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container(parser: Parser): Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container = {
      val r = parser.parseMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_P(o: Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_P(s: String): Either[Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_P, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_P(parser: Parser): Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_P = {
      val r = parser.parseMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_P()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PS(o: Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PS(s: String): Either[Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PS, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PS(parser: Parser): Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PS = {
      val r = parser.parseMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PS()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container(o: Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container(s: String): Either[Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container(parser: Parser): Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container = {
      val r = parser.parseMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_P(o: Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_P(s: String): Either[Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_P, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_P(parser: Parser): Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_P = {
      val r = parser.parseMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_P()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PS(o: Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PS(s: String): Either[Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PS, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PS(parser: Parser): Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PS = {
      val r = parser.parseMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PS()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container(o: Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container(s: String): Either[Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container(parser: Parser): Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container = {
      val r = parser.parseMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_P(o: Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_P(s: String): Either[Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_P, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_P(parser: Parser): Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_P = {
      val r = parser.parseMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_P()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PS(o: Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PS(s: String): Either[Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PS, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PS(parser: Parser): Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PS = {
      val r = parser.parseMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PS()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container(o: Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container(s: String): Either[Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container(parser: Parser): Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container = {
      val r = parser.parseMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_P(o: Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_P(s: String): Either[Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_P, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_P(parser: Parser): Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_P = {
      val r = parser.parseMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_P()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PS(o: Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PS(s: String): Either[Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PS, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PS(parser: Parser): Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PS = {
      val r = parser.parseMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PS()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container(o: Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container(s: String): Either[Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container(parser: Parser): Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container = {
      val r = parser.parseMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_P(o: Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_P(s: String): Either[Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_P, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_P(parser: Parser): Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_P = {
      val r = parser.parseMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_P()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PS(o: Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PS(s: String): Either[Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PS, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PS(parser: Parser): Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PS = {
      val r = parser.parseMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PS()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container(o: Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container(s: String): Either[Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container(parser: Parser): Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container = {
      val r = parser.parseMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_P(o: Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_P(s: String): Either[Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_P, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_P(parser: Parser): Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_P = {
      val r = parser.parseMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_P()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PS(o: Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PS(s: String): Either[Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PS, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PS(parser: Parser): Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PS = {
      val r = parser.parseMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PS()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container(o: Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container(s: String): Either[Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container(parser: Parser): Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container = {
      val r = parser.parseMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_P(o: Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_P(s: String): Either[Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_P, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_P(parser: Parser): Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_P = {
      val r = parser.parseMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_P()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PS(o: Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PS(s: String): Either[Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PS, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PS(parser: Parser): Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PS = {
      val r = parser.parseMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PS()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PS _)
    return r
  }

  def fromutilContainer(o: util.Container, isCompact: B): String = {
    val st = Printer.printutilContainer(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toutilContainer(s: String): Either[util.Container, Json.ErrorMsg] = {
    def futilContainer(parser: Parser): util.Container = {
      val r = parser.parseutilContainer()
      return r
    }
    val r = to(s, futilContainer _)
    return r
  }

  def fromutilEmptyContainer(o: util.EmptyContainer, isCompact: B): String = {
    val st = Printer.printutilEmptyContainer(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toutilEmptyContainer(s: String): Either[util.EmptyContainer, Json.ErrorMsg] = {
    def futilEmptyContainer(parser: Parser): util.EmptyContainer = {
      val r = parser.parseutilEmptyContainer()
      return r
    }
    val r = to(s, futilEmptyContainer _)
    return r
  }

  def from_artDataContent(o: art.DataContent, isCompact: B): String = {
    val st = Printer.print_artDataContent(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_artDataContent(s: String): Either[art.DataContent, Json.ErrorMsg] = {
    def f_artDataContent(parser: Parser): art.DataContent = {
      val r = parser.parse_artDataContent()
      return r
    }
    val r = to(s, f_artDataContent _)
    return r
  }

  def from_artEmpty(o: art.Empty, isCompact: B): String = {
    val st = Printer.print_artEmpty(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_artEmpty(s: String): Either[art.Empty, Json.ErrorMsg] = {
    def f_artEmpty(parser: Parser): art.Empty = {
      val r = parser.parse_artEmpty()
      return r
    }
    val r = to(s, f_artEmpty _)
    return r
  }

}