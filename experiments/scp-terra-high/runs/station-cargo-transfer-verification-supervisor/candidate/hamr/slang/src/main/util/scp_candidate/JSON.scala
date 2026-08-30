// #Sireum
// @formatter:off

// This file is auto-generated from TransferRequest.scala, CargoState.scala, QualifiedRequest.scala, DockServiceCondition.scala, ServiceEligibility.scala, SessionState.scala, AdmittedDirective.scala, VerificationDisposition.scala, SessionExpectation.scala, CommandProposal.scala, SnapshotSessionState.scala, SnapshotSessionResult.scala, ShipTransferEvidence.scala, ShipFinding.scala, WarehouseReceiptEvidence.scala, WarehouseFinding.scala, ShipCommand.scala, WarehouseQuery.scala, PilotTransferReport.scala, StationTransferReport.scala, SessionSnapshot.scala, Base_Types.scala, RequestQualifier_supervisorProcess_requestQualifier_Containers.scala, ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_Containers.scala, PriorityArbiter_supervisorProcess_priorityArbiter_Containers.scala, SessionController_supervisorProcess_sessionController_Containers.scala, ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_Containers.scala, WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_Containers.scala, CompletionReconciler_supervisorProcess_completionReconciler_Containers.scala, CommandSafetyGate_supervisorProcess_commandSafetyGate_Containers.scala, OutcomeReporter_supervisorProcess_outcomeReporter_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package scp_candidate

import org.sireum._
import org.sireum.Json.Printer._

object JSON {

  object Printer {

    @pure def printStation_Cargo_Transfer_Verification_SupervisorTransferRequestType(o: Station_Cargo_Transfer_Verification_Supervisor.TransferRequest.Type): ST = {
      val value: String = o match {
        case Station_Cargo_Transfer_Verification_Supervisor.TransferRequest.None => "None"
        case Station_Cargo_Transfer_Verification_Supervisor.TransferRequest.FreshStart => "FreshStart"
        case Station_Cargo_Transfer_Verification_Supervisor.TransferRequest.RepeatedStart => "RepeatedStart"
        case Station_Cargo_Transfer_Verification_Supervisor.TransferRequest.FreshCancel => "FreshCancel"
        case Station_Cargo_Transfer_Verification_Supervisor.TransferRequest.RepeatedCancel => "RepeatedCancel"
        case Station_Cargo_Transfer_Verification_Supervisor.TransferRequest.FreshReset => "FreshReset"
        case Station_Cargo_Transfer_Verification_Supervisor.TransferRequest.RepeatedReset => "RepeatedReset"
        case Station_Cargo_Transfer_Verification_Supervisor.TransferRequest.Invalid => "Invalid"
      }
      return printObject(ISZ(
        ("type", printString("Station_Cargo_Transfer_Verification_Supervisor.TransferRequest")),
        ("value", printString(value))
      ))
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorTransferRequest_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.TransferRequest_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Station_Cargo_Transfer_Verification_Supervisor.TransferRequest_Payload""""),
        ("value", printStation_Cargo_Transfer_Verification_SupervisorTransferRequestType(o.value))
      ))
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorCargoStateType(o: Station_Cargo_Transfer_Verification_Supervisor.CargoState.Type): ST = {
      val value: String = o match {
        case Station_Cargo_Transfer_Verification_Supervisor.CargoState.Present => "Present"
        case Station_Cargo_Transfer_Verification_Supervisor.CargoState.Empty => "Empty"
        case Station_Cargo_Transfer_Verification_Supervisor.CargoState.Invalid => "Invalid"
      }
      return printObject(ISZ(
        ("type", printString("Station_Cargo_Transfer_Verification_Supervisor.CargoState")),
        ("value", printString(value))
      ))
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorCargoState_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.CargoState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Station_Cargo_Transfer_Verification_Supervisor.CargoState_Payload""""),
        ("value", printStation_Cargo_Transfer_Verification_SupervisorCargoStateType(o.value))
      ))
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorQualifiedRequestType(o: Station_Cargo_Transfer_Verification_Supervisor.QualifiedRequest.Type): ST = {
      val value: String = o match {
        case Station_Cargo_Transfer_Verification_Supervisor.QualifiedRequest.NoNewRequest => "NoNewRequest"
        case Station_Cargo_Transfer_Verification_Supervisor.QualifiedRequest.StartCandidate => "StartCandidate"
        case Station_Cargo_Transfer_Verification_Supervisor.QualifiedRequest.RejectEmpty => "RejectEmpty"
        case Station_Cargo_Transfer_Verification_Supervisor.QualifiedRequest.CancelCandidate => "CancelCandidate"
        case Station_Cargo_Transfer_Verification_Supervisor.QualifiedRequest.ResetCandidate => "ResetCandidate"
        case Station_Cargo_Transfer_Verification_Supervisor.QualifiedRequest.InputFault => "InputFault"
      }
      return printObject(ISZ(
        ("type", printString("Station_Cargo_Transfer_Verification_Supervisor.QualifiedRequest")),
        ("value", printString(value))
      ))
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorQualifiedRequest_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.QualifiedRequest_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Station_Cargo_Transfer_Verification_Supervisor.QualifiedRequest_Payload""""),
        ("value", printStation_Cargo_Transfer_Verification_SupervisorQualifiedRequestType(o.value))
      ))
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorDockServiceConditionType(o: Station_Cargo_Transfer_Verification_Supervisor.DockServiceCondition.Type): ST = {
      val value: String = o match {
        case Station_Cargo_Transfer_Verification_Supervisor.DockServiceCondition.TransferAvailable => "TransferAvailable"
        case Station_Cargo_Transfer_Verification_Supervisor.DockServiceCondition.UndockPriority => "UndockPriority"
        case Station_Cargo_Transfer_Verification_Supervisor.DockServiceCondition.ServiceHold => "ServiceHold"
        case Station_Cargo_Transfer_Verification_Supervisor.DockServiceCondition.Undocked => "Undocked"
        case Station_Cargo_Transfer_Verification_Supervisor.DockServiceCondition.Invalid => "Invalid"
      }
      return printObject(ISZ(
        ("type", printString("Station_Cargo_Transfer_Verification_Supervisor.DockServiceCondition")),
        ("value", printString(value))
      ))
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorDockServiceCondition_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.DockServiceCondition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Station_Cargo_Transfer_Verification_Supervisor.DockServiceCondition_Payload""""),
        ("value", printStation_Cargo_Transfer_Verification_SupervisorDockServiceConditionType(o.value))
      ))
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorServiceEligibilityType(o: Station_Cargo_Transfer_Verification_Supervisor.ServiceEligibility.Type): ST = {
      val value: String = o match {
        case Station_Cargo_Transfer_Verification_Supervisor.ServiceEligibility.Ready => "Ready"
        case Station_Cargo_Transfer_Verification_Supervisor.ServiceEligibility.PreemptUndock => "PreemptUndock"
        case Station_Cargo_Transfer_Verification_Supervisor.ServiceEligibility.Ineligible => "Ineligible"
        case Station_Cargo_Transfer_Verification_Supervisor.ServiceEligibility.ServiceFault => "ServiceFault"
      }
      return printObject(ISZ(
        ("type", printString("Station_Cargo_Transfer_Verification_Supervisor.ServiceEligibility")),
        ("value", printString(value))
      ))
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorServiceEligibility_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.ServiceEligibility_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Station_Cargo_Transfer_Verification_Supervisor.ServiceEligibility_Payload""""),
        ("value", printStation_Cargo_Transfer_Verification_SupervisorServiceEligibilityType(o.value))
      ))
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorSessionStateType(o: Station_Cargo_Transfer_Verification_Supervisor.SessionState.Type): ST = {
      val value: String = o match {
        case Station_Cargo_Transfer_Verification_Supervisor.SessionState.Idle => "Idle"
        case Station_Cargo_Transfer_Verification_Supervisor.SessionState.Commanding => "Commanding"
        case Station_Cargo_Transfer_Verification_Supervisor.SessionState.AwaitingEvidence => "AwaitingEvidence"
        case Station_Cargo_Transfer_Verification_Supervisor.SessionState.Verified => "Verified"
        case Station_Cargo_Transfer_Verification_Supervisor.SessionState.StoppedByCancel => "StoppedByCancel"
        case Station_Cargo_Transfer_Verification_Supervisor.SessionState.StoppedByUndock => "StoppedByUndock"
        case Station_Cargo_Transfer_Verification_Supervisor.SessionState.StoppedByService => "StoppedByService"
        case Station_Cargo_Transfer_Verification_Supervisor.SessionState.RecoveryRequired => "RecoveryRequired"
      }
      return printObject(ISZ(
        ("type", printString("Station_Cargo_Transfer_Verification_Supervisor.SessionState")),
        ("value", printString(value))
      ))
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorSessionState_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.SessionState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Station_Cargo_Transfer_Verification_Supervisor.SessionState_Payload""""),
        ("value", printStation_Cargo_Transfer_Verification_SupervisorSessionStateType(o.value))
      ))
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorAdmittedDirectiveType(o: Station_Cargo_Transfer_Verification_Supervisor.AdmittedDirective.Type): ST = {
      val value: String = o match {
        case Station_Cargo_Transfer_Verification_Supervisor.AdmittedDirective.Hold => "Hold"
        case Station_Cargo_Transfer_Verification_Supervisor.AdmittedDirective.Begin => "Begin"
        case Station_Cargo_Transfer_Verification_Supervisor.AdmittedDirective.Cancel => "Cancel"
        case Station_Cargo_Transfer_Verification_Supervisor.AdmittedDirective.PreemptUndock => "PreemptUndock"
        case Station_Cargo_Transfer_Verification_Supervisor.AdmittedDirective.PreemptService => "PreemptService"
        case Station_Cargo_Transfer_Verification_Supervisor.AdmittedDirective.EnterRecovery => "EnterRecovery"
        case Station_Cargo_Transfer_Verification_Supervisor.AdmittedDirective.Reset => "Reset"
        case Station_Cargo_Transfer_Verification_Supervisor.AdmittedDirective.RejectEmpty => "RejectEmpty"
        case Station_Cargo_Transfer_Verification_Supervisor.AdmittedDirective.RejectIneligible => "RejectIneligible"
      }
      return printObject(ISZ(
        ("type", printString("Station_Cargo_Transfer_Verification_Supervisor.AdmittedDirective")),
        ("value", printString(value))
      ))
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorAdmittedDirective_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.AdmittedDirective_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Station_Cargo_Transfer_Verification_Supervisor.AdmittedDirective_Payload""""),
        ("value", printStation_Cargo_Transfer_Verification_SupervisorAdmittedDirectiveType(o.value))
      ))
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorVerificationDispositionType(o: Station_Cargo_Transfer_Verification_Supervisor.VerificationDisposition.Type): ST = {
      val value: String = o match {
        case Station_Cargo_Transfer_Verification_Supervisor.VerificationDisposition.Neutral => "Neutral"
        case Station_Cargo_Transfer_Verification_Supervisor.VerificationDisposition.Awaiting => "Awaiting"
        case Station_Cargo_Transfer_Verification_Supervisor.VerificationDisposition.Verified => "Verified"
        case Station_Cargo_Transfer_Verification_Supervisor.VerificationDisposition.RecoveryRequired => "RecoveryRequired"
        case Station_Cargo_Transfer_Verification_Supervisor.VerificationDisposition.RecoveryClearable => "RecoveryClearable"
      }
      return printObject(ISZ(
        ("type", printString("Station_Cargo_Transfer_Verification_Supervisor.VerificationDisposition")),
        ("value", printString(value))
      ))
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorVerificationDisposition_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.VerificationDisposition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Station_Cargo_Transfer_Verification_Supervisor.VerificationDisposition_Payload""""),
        ("value", printStation_Cargo_Transfer_Verification_SupervisorVerificationDispositionType(o.value))
      ))
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorSessionExpectationType(o: Station_Cargo_Transfer_Verification_Supervisor.SessionExpectation.Type): ST = {
      val value: String = o match {
        case Station_Cargo_Transfer_Verification_Supervisor.SessionExpectation.None => "None"
        case Station_Cargo_Transfer_Verification_Supervisor.SessionExpectation.ActiveTransfer => "ActiveTransfer"
        case Station_Cargo_Transfer_Verification_Supervisor.SessionExpectation.RecoveryCheck => "RecoveryCheck"
      }
      return printObject(ISZ(
        ("type", printString("Station_Cargo_Transfer_Verification_Supervisor.SessionExpectation")),
        ("value", printString(value))
      ))
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorSessionExpectation_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.SessionExpectation_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Station_Cargo_Transfer_Verification_Supervisor.SessionExpectation_Payload""""),
        ("value", printStation_Cargo_Transfer_Verification_SupervisorSessionExpectationType(o.value))
      ))
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorCommandProposalType(o: Station_Cargo_Transfer_Verification_Supervisor.CommandProposal.Type): ST = {
      val value: String = o match {
        case Station_Cargo_Transfer_Verification_Supervisor.CommandProposal.HoldNoQuery => "HoldNoQuery"
        case Station_Cargo_Transfer_Verification_Supervisor.CommandProposal.BeginWithQuery => "BeginWithQuery"
        case Station_Cargo_Transfer_Verification_Supervisor.CommandProposal.HoldWithQuery => "HoldWithQuery"
        case Station_Cargo_Transfer_Verification_Supervisor.CommandProposal.StopNoQuery => "StopNoQuery"
      }
      return printObject(ISZ(
        ("type", printString("Station_Cargo_Transfer_Verification_Supervisor.CommandProposal")),
        ("value", printString(value))
      ))
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorCommandProposal_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.CommandProposal_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Station_Cargo_Transfer_Verification_Supervisor.CommandProposal_Payload""""),
        ("value", printStation_Cargo_Transfer_Verification_SupervisorCommandProposalType(o.value))
      ))
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionStateType(o: Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionState.Type): ST = {
      val value: String = o match {
        case Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionState.Idle => "Idle"
        case Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionState.Commanding => "Commanding"
        case Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionState.AwaitingEvidence => "AwaitingEvidence"
        case Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionState.Verified => "Verified"
        case Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionState.StoppedByCancel => "StoppedByCancel"
        case Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionState.StoppedByUndock => "StoppedByUndock"
        case Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionState.StoppedByService => "StoppedByService"
        case Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionState.RecoveryRequired => "RecoveryRequired"
      }
      return printObject(ISZ(
        ("type", printString("Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionState")),
        ("value", printString(value))
      ))
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionState_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionState_Payload""""),
        ("value", printStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionStateType(o.value))
      ))
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionResultType(o: Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionResult.Type): ST = {
      val value: String = o match {
        case Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionResult.None => "None"
        case Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionResult.Started => "Started"
        case Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionResult.Waiting => "Waiting"
        case Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionResult.Verified => "Verified"
        case Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionResult.Cancelled => "Cancelled"
        case Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionResult.Inhibited => "Inhibited"
        case Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionResult.RecoveryRequired => "RecoveryRequired"
        case Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionResult.ResetComplete => "ResetComplete"
      }
      return printObject(ISZ(
        ("type", printString("Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionResult")),
        ("value", printString(value))
      ))
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionResult_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionResult_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionResult_Payload""""),
        ("value", printStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionResultType(o.value))
      ))
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorShipTransferEvidenceType(o: Station_Cargo_Transfer_Verification_Supervisor.ShipTransferEvidence.Type): ST = {
      val value: String = o match {
        case Station_Cargo_Transfer_Verification_Supervisor.ShipTransferEvidence.Idle => "Idle"
        case Station_Cargo_Transfer_Verification_Supervisor.ShipTransferEvidence.Active => "Active"
        case Station_Cargo_Transfer_Verification_Supervisor.ShipTransferEvidence.Complete => "Complete"
        case Station_Cargo_Transfer_Verification_Supervisor.ShipTransferEvidence.Failed => "Failed"
        case Station_Cargo_Transfer_Verification_Supervisor.ShipTransferEvidence.Invalid => "Invalid"
      }
      return printObject(ISZ(
        ("type", printString("Station_Cargo_Transfer_Verification_Supervisor.ShipTransferEvidence")),
        ("value", printString(value))
      ))
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorShipTransferEvidence_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.ShipTransferEvidence_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Station_Cargo_Transfer_Verification_Supervisor.ShipTransferEvidence_Payload""""),
        ("value", printStation_Cargo_Transfer_Verification_SupervisorShipTransferEvidenceType(o.value))
      ))
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorShipFindingType(o: Station_Cargo_Transfer_Verification_Supervisor.ShipFinding.Type): ST = {
      val value: String = o match {
        case Station_Cargo_Transfer_Verification_Supervisor.ShipFinding.Neutral => "Neutral"
        case Station_Cargo_Transfer_Verification_Supervisor.ShipFinding.RecoveryNeutral => "RecoveryNeutral"
        case Station_Cargo_Transfer_Verification_Supervisor.ShipFinding.NotComplete => "NotComplete"
        case Station_Cargo_Transfer_Verification_Supervisor.ShipFinding.Complete => "Complete"
        case Station_Cargo_Transfer_Verification_Supervisor.ShipFinding.Fault => "Fault"
      }
      return printObject(ISZ(
        ("type", printString("Station_Cargo_Transfer_Verification_Supervisor.ShipFinding")),
        ("value", printString(value))
      ))
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorShipFinding_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.ShipFinding_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Station_Cargo_Transfer_Verification_Supervisor.ShipFinding_Payload""""),
        ("value", printStation_Cargo_Transfer_Verification_SupervisorShipFindingType(o.value))
      ))
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorWarehouseReceiptEvidenceType(o: Station_Cargo_Transfer_Verification_Supervisor.WarehouseReceiptEvidence.Type): ST = {
      val value: String = o match {
        case Station_Cargo_Transfer_Verification_Supervisor.WarehouseReceiptEvidence.NoReceipt => "NoReceipt"
        case Station_Cargo_Transfer_Verification_Supervisor.WarehouseReceiptEvidence.MatchingReceipt => "MatchingReceipt"
        case Station_Cargo_Transfer_Verification_Supervisor.WarehouseReceiptEvidence.ConflictingReceipt => "ConflictingReceipt"
        case Station_Cargo_Transfer_Verification_Supervisor.WarehouseReceiptEvidence.Invalid => "Invalid"
      }
      return printObject(ISZ(
        ("type", printString("Station_Cargo_Transfer_Verification_Supervisor.WarehouseReceiptEvidence")),
        ("value", printString(value))
      ))
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorWarehouseReceiptEvidence_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.WarehouseReceiptEvidence_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Station_Cargo_Transfer_Verification_Supervisor.WarehouseReceiptEvidence_Payload""""),
        ("value", printStation_Cargo_Transfer_Verification_SupervisorWarehouseReceiptEvidenceType(o.value))
      ))
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorWarehouseFindingType(o: Station_Cargo_Transfer_Verification_Supervisor.WarehouseFinding.Type): ST = {
      val value: String = o match {
        case Station_Cargo_Transfer_Verification_Supervisor.WarehouseFinding.Neutral => "Neutral"
        case Station_Cargo_Transfer_Verification_Supervisor.WarehouseFinding.RecoveryNeutral => "RecoveryNeutral"
        case Station_Cargo_Transfer_Verification_Supervisor.WarehouseFinding.Missing => "Missing"
        case Station_Cargo_Transfer_Verification_Supervisor.WarehouseFinding.Match => "Match"
        case Station_Cargo_Transfer_Verification_Supervisor.WarehouseFinding.Fault => "Fault"
      }
      return printObject(ISZ(
        ("type", printString("Station_Cargo_Transfer_Verification_Supervisor.WarehouseFinding")),
        ("value", printString(value))
      ))
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorWarehouseFinding_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.WarehouseFinding_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Station_Cargo_Transfer_Verification_Supervisor.WarehouseFinding_Payload""""),
        ("value", printStation_Cargo_Transfer_Verification_SupervisorWarehouseFindingType(o.value))
      ))
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorShipCommandType(o: Station_Cargo_Transfer_Verification_Supervisor.ShipCommand.Type): ST = {
      val value: String = o match {
        case Station_Cargo_Transfer_Verification_Supervisor.ShipCommand.Hold => "Hold"
        case Station_Cargo_Transfer_Verification_Supervisor.ShipCommand.BeginOffload => "BeginOffload"
        case Station_Cargo_Transfer_Verification_Supervisor.ShipCommand.StopOffload => "StopOffload"
      }
      return printObject(ISZ(
        ("type", printString("Station_Cargo_Transfer_Verification_Supervisor.ShipCommand")),
        ("value", printString(value))
      ))
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorShipCommand_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.ShipCommand_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Station_Cargo_Transfer_Verification_Supervisor.ShipCommand_Payload""""),
        ("value", printStation_Cargo_Transfer_Verification_SupervisorShipCommandType(o.value))
      ))
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorWarehouseQueryType(o: Station_Cargo_Transfer_Verification_Supervisor.WarehouseQuery.Type): ST = {
      val value: String = o match {
        case Station_Cargo_Transfer_Verification_Supervisor.WarehouseQuery.NoQuery => "NoQuery"
        case Station_Cargo_Transfer_Verification_Supervisor.WarehouseQuery.RequestReceipt => "RequestReceipt"
      }
      return printObject(ISZ(
        ("type", printString("Station_Cargo_Transfer_Verification_Supervisor.WarehouseQuery")),
        ("value", printString(value))
      ))
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorWarehouseQuery_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.WarehouseQuery_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Station_Cargo_Transfer_Verification_Supervisor.WarehouseQuery_Payload""""),
        ("value", printStation_Cargo_Transfer_Verification_SupervisorWarehouseQueryType(o.value))
      ))
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorPilotTransferReportType(o: Station_Cargo_Transfer_Verification_Supervisor.PilotTransferReport.Type): ST = {
      val value: String = o match {
        case Station_Cargo_Transfer_Verification_Supervisor.PilotTransferReport.Idle => "Idle"
        case Station_Cargo_Transfer_Verification_Supervisor.PilotTransferReport.Started => "Started"
        case Station_Cargo_Transfer_Verification_Supervisor.PilotTransferReport.InProgress => "InProgress"
        case Station_Cargo_Transfer_Verification_Supervisor.PilotTransferReport.Verified => "Verified"
        case Station_Cargo_Transfer_Verification_Supervisor.PilotTransferReport.Cancelled => "Cancelled"
        case Station_Cargo_Transfer_Verification_Supervisor.PilotTransferReport.Inhibited => "Inhibited"
        case Station_Cargo_Transfer_Verification_Supervisor.PilotTransferReport.RecoveryRequired => "RecoveryRequired"
        case Station_Cargo_Transfer_Verification_Supervisor.PilotTransferReport.ResetComplete => "ResetComplete"
      }
      return printObject(ISZ(
        ("type", printString("Station_Cargo_Transfer_Verification_Supervisor.PilotTransferReport")),
        ("value", printString(value))
      ))
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorPilotTransferReport_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.PilotTransferReport_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Station_Cargo_Transfer_Verification_Supervisor.PilotTransferReport_Payload""""),
        ("value", printStation_Cargo_Transfer_Verification_SupervisorPilotTransferReportType(o.value))
      ))
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorStationTransferReportType(o: Station_Cargo_Transfer_Verification_Supervisor.StationTransferReport.Type): ST = {
      val value: String = o match {
        case Station_Cargo_Transfer_Verification_Supervisor.StationTransferReport.Idle => "Idle"
        case Station_Cargo_Transfer_Verification_Supervisor.StationTransferReport.OffloadActive => "OffloadActive"
        case Station_Cargo_Transfer_Verification_Supervisor.StationTransferReport.VerificationPending => "VerificationPending"
        case Station_Cargo_Transfer_Verification_Supervisor.StationTransferReport.Verified => "Verified"
        case Station_Cargo_Transfer_Verification_Supervisor.StationTransferReport.Stopped => "Stopped"
        case Station_Cargo_Transfer_Verification_Supervisor.StationTransferReport.RecoveryRequired => "RecoveryRequired"
        case Station_Cargo_Transfer_Verification_Supervisor.StationTransferReport.ResetComplete => "ResetComplete"
      }
      return printObject(ISZ(
        ("type", printString("Station_Cargo_Transfer_Verification_Supervisor.StationTransferReport")),
        ("value", printString(value))
      ))
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorStationTransferReport_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.StationTransferReport_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Station_Cargo_Transfer_Verification_Supervisor.StationTransferReport_Payload""""),
        ("value", printStation_Cargo_Transfer_Verification_SupervisorStationTransferReportType(o.value))
      ))
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorSessionSnapshot(o: Station_Cargo_Transfer_Verification_Supervisor.SessionSnapshot): ST = {
      return printObject(ISZ(
        ("type", st""""Station_Cargo_Transfer_Verification_Supervisor.SessionSnapshot""""),
        ("next_state", printStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionStateType(o.next_state)),
        ("session_result", printStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionResultType(o.session_result))
      ))
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorSessionSnapshot_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.SessionSnapshot_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Station_Cargo_Transfer_Verification_Supervisor.SessionSnapshot_Payload""""),
        ("value", printStation_Cargo_Transfer_Verification_SupervisorSessionSnapshot(o.value))
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

    @pure def printStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container(o: Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PreState_Container): ST = {
      o match {
        case o: Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PreState_Container_P => return printStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PS => return printStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PS(o)
      }
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_P(o: Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PreState_Container_P""""),
        ("api_cargoState", printStation_Cargo_Transfer_Verification_SupervisorCargoStateType(o.api_cargoState)),
        ("api_transferRequest", printStation_Cargo_Transfer_Verification_SupervisorTransferRequestType(o.api_transferRequest))
      ))
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PS(o: Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PS""""),
        ("api_cargoState", printStation_Cargo_Transfer_Verification_SupervisorCargoStateType(o.api_cargoState)),
        ("api_transferRequest", printStation_Cargo_Transfer_Verification_SupervisorTransferRequestType(o.api_transferRequest))
      ))
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container(o: Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PostState_Container): ST = {
      o match {
        case o: Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PostState_Container_P => return printStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PS => return printStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PS(o)
      }
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_P(o: Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PostState_Container_P""""),
        ("api_qualifiedRequest", printStation_Cargo_Transfer_Verification_SupervisorQualifiedRequestType(o.api_qualifiedRequest))
      ))
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PS(o: Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PS""""),
        ("api_qualifiedRequest", printStation_Cargo_Transfer_Verification_SupervisorQualifiedRequestType(o.api_qualifiedRequest))
      ))
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container(o: Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container): ST = {
      o match {
        case o: Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_P => return printStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PS => return printStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PS(o)
      }
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_P(o: Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_P""""),
        ("api_serviceCondition", printStation_Cargo_Transfer_Verification_SupervisorDockServiceConditionType(o.api_serviceCondition))
      ))
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PS(o: Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PS""""),
        ("api_serviceCondition", printStation_Cargo_Transfer_Verification_SupervisorDockServiceConditionType(o.api_serviceCondition))
      ))
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container(o: Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container): ST = {
      o match {
        case o: Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_P => return printStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PS => return printStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PS(o)
      }
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_P(o: Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_P""""),
        ("api_gateEligibility", printStation_Cargo_Transfer_Verification_SupervisorServiceEligibilityType(o.api_gateEligibility)),
        ("api_serviceEligibility", printStation_Cargo_Transfer_Verification_SupervisorServiceEligibilityType(o.api_serviceEligibility))
      ))
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PS(o: Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PS""""),
        ("api_gateEligibility", printStation_Cargo_Transfer_Verification_SupervisorServiceEligibilityType(o.api_gateEligibility)),
        ("api_serviceEligibility", printStation_Cargo_Transfer_Verification_SupervisorServiceEligibilityType(o.api_serviceEligibility))
      ))
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container(o: Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container): ST = {
      o match {
        case o: Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P => return printStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS => return printStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS(o)
      }
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P(o: Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P""""),
        ("api_qualifiedRequest", printStation_Cargo_Transfer_Verification_SupervisorQualifiedRequestType(o.api_qualifiedRequest)),
        ("api_serviceEligibility", printStation_Cargo_Transfer_Verification_SupervisorServiceEligibilityType(o.api_serviceEligibility)),
        ("api_sessionPrestate", printStation_Cargo_Transfer_Verification_SupervisorSessionStateType(o.api_sessionPrestate))
      ))
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS(o: Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS""""),
        ("api_qualifiedRequest", printStation_Cargo_Transfer_Verification_SupervisorQualifiedRequestType(o.api_qualifiedRequest)),
        ("api_serviceEligibility", printStation_Cargo_Transfer_Verification_SupervisorServiceEligibilityType(o.api_serviceEligibility)),
        ("api_sessionPrestate", printStation_Cargo_Transfer_Verification_SupervisorSessionStateType(o.api_sessionPrestate))
      ))
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container(o: Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container): ST = {
      o match {
        case o: Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P => return printStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS => return printStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS(o)
      }
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P(o: Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P""""),
        ("api_admittedDirective", printStation_Cargo_Transfer_Verification_SupervisorAdmittedDirectiveType(o.api_admittedDirective))
      ))
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS(o: Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS""""),
        ("api_admittedDirective", printStation_Cargo_Transfer_Verification_SupervisorAdmittedDirectiveType(o.api_admittedDirective))
      ))
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container(o: Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PreState_Container): ST = {
      o match {
        case o: Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PreState_Container_P => return printStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PreState_Container_PS => return printStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_PS(o)
      }
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_P(o: Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PreState_Container_P""""),
        ("api_admittedDirective", printStation_Cargo_Transfer_Verification_SupervisorAdmittedDirectiveType(o.api_admittedDirective)),
        ("api_verificationDisposition", printStation_Cargo_Transfer_Verification_SupervisorVerificationDispositionType(o.api_verificationDisposition))
      ))
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_PS(o: Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PreState_Container_PS""""),
        ("In_sessionState", printStation_Cargo_Transfer_Verification_SupervisorSessionStateType(o.In_sessionState)),
        ("api_admittedDirective", printStation_Cargo_Transfer_Verification_SupervisorAdmittedDirectiveType(o.api_admittedDirective)),
        ("api_verificationDisposition", printStation_Cargo_Transfer_Verification_SupervisorVerificationDispositionType(o.api_verificationDisposition))
      ))
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container(o: Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PostState_Container): ST = {
      o match {
        case o: Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PostState_Container_P => return printStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PostState_Container_PS => return printStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_PS(o)
      }
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_P(o: Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PostState_Container_P""""),
        ("api_commandProposal", printStation_Cargo_Transfer_Verification_SupervisorCommandProposalType(o.api_commandProposal)),
        ("api_sessionPrestate", printStation_Cargo_Transfer_Verification_SupervisorSessionStateType(o.api_sessionPrestate)),
        ("api_sessionSnapshot", printStation_Cargo_Transfer_Verification_SupervisorSessionSnapshot(o.api_sessionSnapshot)),
        ("api_shipExpectation", printStation_Cargo_Transfer_Verification_SupervisorSessionExpectationType(o.api_shipExpectation)),
        ("api_warehouseExpectation", printStation_Cargo_Transfer_Verification_SupervisorSessionExpectationType(o.api_warehouseExpectation))
      ))
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_PS(o: Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PostState_Container_PS""""),
        ("sessionState", printStation_Cargo_Transfer_Verification_SupervisorSessionStateType(o.sessionState)),
        ("api_commandProposal", printStation_Cargo_Transfer_Verification_SupervisorCommandProposalType(o.api_commandProposal)),
        ("api_sessionPrestate", printStation_Cargo_Transfer_Verification_SupervisorSessionStateType(o.api_sessionPrestate)),
        ("api_sessionSnapshot", printStation_Cargo_Transfer_Verification_SupervisorSessionSnapshot(o.api_sessionSnapshot)),
        ("api_shipExpectation", printStation_Cargo_Transfer_Verification_SupervisorSessionExpectationType(o.api_shipExpectation)),
        ("api_warehouseExpectation", printStation_Cargo_Transfer_Verification_SupervisorSessionExpectationType(o.api_warehouseExpectation))
      ))
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container(o: Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container): ST = {
      o match {
        case o: Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_P => return printStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PS => return printStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PS(o)
      }
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_P(o: Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_P""""),
        ("api_sessionExpectation", printStation_Cargo_Transfer_Verification_SupervisorSessionExpectationType(o.api_sessionExpectation)),
        ("api_transferEvidence", printStation_Cargo_Transfer_Verification_SupervisorShipTransferEvidenceType(o.api_transferEvidence))
      ))
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PS(o: Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PS""""),
        ("api_sessionExpectation", printStation_Cargo_Transfer_Verification_SupervisorSessionExpectationType(o.api_sessionExpectation)),
        ("api_transferEvidence", printStation_Cargo_Transfer_Verification_SupervisorShipTransferEvidenceType(o.api_transferEvidence))
      ))
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container(o: Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container): ST = {
      o match {
        case o: Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_P => return printStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PS => return printStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PS(o)
      }
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_P(o: Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_P""""),
        ("api_shipFinding", printStation_Cargo_Transfer_Verification_SupervisorShipFindingType(o.api_shipFinding))
      ))
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PS(o: Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PS""""),
        ("api_shipFinding", printStation_Cargo_Transfer_Verification_SupervisorShipFindingType(o.api_shipFinding))
      ))
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container(o: Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container): ST = {
      o match {
        case o: Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_P => return printStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PS => return printStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PS(o)
      }
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_P(o: Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_P""""),
        ("api_receiptEvidence", printStation_Cargo_Transfer_Verification_SupervisorWarehouseReceiptEvidenceType(o.api_receiptEvidence)),
        ("api_sessionExpectation", printStation_Cargo_Transfer_Verification_SupervisorSessionExpectationType(o.api_sessionExpectation))
      ))
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PS(o: Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PS""""),
        ("api_receiptEvidence", printStation_Cargo_Transfer_Verification_SupervisorWarehouseReceiptEvidenceType(o.api_receiptEvidence)),
        ("api_sessionExpectation", printStation_Cargo_Transfer_Verification_SupervisorSessionExpectationType(o.api_sessionExpectation))
      ))
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container(o: Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container): ST = {
      o match {
        case o: Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_P => return printStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PS => return printStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PS(o)
      }
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_P(o: Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_P""""),
        ("api_warehouseFinding", printStation_Cargo_Transfer_Verification_SupervisorWarehouseFindingType(o.api_warehouseFinding))
      ))
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PS(o: Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PS""""),
        ("api_warehouseFinding", printStation_Cargo_Transfer_Verification_SupervisorWarehouseFindingType(o.api_warehouseFinding))
      ))
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container(o: Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PreState_Container): ST = {
      o match {
        case o: Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_P => return printStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PS => return printStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PS(o)
      }
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_P(o: Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_P""""),
        ("api_shipFinding", printStation_Cargo_Transfer_Verification_SupervisorShipFindingType(o.api_shipFinding)),
        ("api_warehouseFinding", printStation_Cargo_Transfer_Verification_SupervisorWarehouseFindingType(o.api_warehouseFinding))
      ))
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PS(o: Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PS""""),
        ("api_shipFinding", printStation_Cargo_Transfer_Verification_SupervisorShipFindingType(o.api_shipFinding)),
        ("api_warehouseFinding", printStation_Cargo_Transfer_Verification_SupervisorWarehouseFindingType(o.api_warehouseFinding))
      ))
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container(o: Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PostState_Container): ST = {
      o match {
        case o: Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_P => return printStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PS => return printStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PS(o)
      }
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_P(o: Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_P""""),
        ("api_verificationDisposition", printStation_Cargo_Transfer_Verification_SupervisorVerificationDispositionType(o.api_verificationDisposition))
      ))
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PS(o: Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PS""""),
        ("api_verificationDisposition", printStation_Cargo_Transfer_Verification_SupervisorVerificationDispositionType(o.api_verificationDisposition))
      ))
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container(o: Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container): ST = {
      o match {
        case o: Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_P => return printStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PS => return printStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PS(o)
      }
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_P(o: Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_P""""),
        ("api_commandProposal", printStation_Cargo_Transfer_Verification_SupervisorCommandProposalType(o.api_commandProposal)),
        ("api_serviceEligibility", printStation_Cargo_Transfer_Verification_SupervisorServiceEligibilityType(o.api_serviceEligibility))
      ))
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PS(o: Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PS""""),
        ("api_commandProposal", printStation_Cargo_Transfer_Verification_SupervisorCommandProposalType(o.api_commandProposal)),
        ("api_serviceEligibility", printStation_Cargo_Transfer_Verification_SupervisorServiceEligibilityType(o.api_serviceEligibility))
      ))
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container(o: Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container): ST = {
      o match {
        case o: Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_P => return printStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PS => return printStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PS(o)
      }
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_P(o: Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_P""""),
        ("api_receiptQuery", printStation_Cargo_Transfer_Verification_SupervisorWarehouseQueryType(o.api_receiptQuery)),
        ("api_shipCommand", printStation_Cargo_Transfer_Verification_SupervisorShipCommandType(o.api_shipCommand))
      ))
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PS(o: Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PS""""),
        ("api_receiptQuery", printStation_Cargo_Transfer_Verification_SupervisorWarehouseQueryType(o.api_receiptQuery)),
        ("api_shipCommand", printStation_Cargo_Transfer_Verification_SupervisorShipCommandType(o.api_shipCommand))
      ))
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container(o: Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container): ST = {
      o match {
        case o: Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_P => return printStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PS => return printStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PS(o)
      }
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_P(o: Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_P""""),
        ("api_sessionSnapshot", printStation_Cargo_Transfer_Verification_SupervisorSessionSnapshot(o.api_sessionSnapshot))
      ))
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PS(o: Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PS""""),
        ("api_sessionSnapshot", printStation_Cargo_Transfer_Verification_SupervisorSessionSnapshot(o.api_sessionSnapshot))
      ))
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container(o: Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container): ST = {
      o match {
        case o: Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_P => return printStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PS => return printStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PS(o)
      }
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_P(o: Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_P""""),
        ("api_pilotReport", printStation_Cargo_Transfer_Verification_SupervisorPilotTransferReportType(o.api_pilotReport)),
        ("api_stationReport", printStation_Cargo_Transfer_Verification_SupervisorStationTransferReportType(o.api_stationReport))
      ))
    }

    @pure def printStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PS(o: Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PS""""),
        ("api_pilotReport", printStation_Cargo_Transfer_Verification_SupervisorPilotTransferReportType(o.api_pilotReport)),
        ("api_stationReport", printStation_Cargo_Transfer_Verification_SupervisorStationTransferReportType(o.api_stationReport))
      ))
    }

    @pure def printruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): ST = {
      val value: String = o match {
        case runtimemonitor.ObservationKind.StationCargoTransferVerificationSystem_Instance_supervisorProcess_requestQualifier_postInit => "StationCargoTransferVerificationSystem_Instance_supervisorProcess_requestQualifier_postInit"
        case runtimemonitor.ObservationKind.StationCargoTransferVerificationSystem_Instance_supervisorProcess_requestQualifier_preCompute => "StationCargoTransferVerificationSystem_Instance_supervisorProcess_requestQualifier_preCompute"
        case runtimemonitor.ObservationKind.StationCargoTransferVerificationSystem_Instance_supervisorProcess_requestQualifier_postCompute => "StationCargoTransferVerificationSystem_Instance_supervisorProcess_requestQualifier_postCompute"
        case runtimemonitor.ObservationKind.StationCargoTransferVerificationSystem_Instance_supervisorProcess_serviceReadinessQualifier_postInit => "StationCargoTransferVerificationSystem_Instance_supervisorProcess_serviceReadinessQualifier_postInit"
        case runtimemonitor.ObservationKind.StationCargoTransferVerificationSystem_Instance_supervisorProcess_serviceReadinessQualifier_preCompute => "StationCargoTransferVerificationSystem_Instance_supervisorProcess_serviceReadinessQualifier_preCompute"
        case runtimemonitor.ObservationKind.StationCargoTransferVerificationSystem_Instance_supervisorProcess_serviceReadinessQualifier_postCompute => "StationCargoTransferVerificationSystem_Instance_supervisorProcess_serviceReadinessQualifier_postCompute"
        case runtimemonitor.ObservationKind.StationCargoTransferVerificationSystem_Instance_supervisorProcess_priorityArbiter_postInit => "StationCargoTransferVerificationSystem_Instance_supervisorProcess_priorityArbiter_postInit"
        case runtimemonitor.ObservationKind.StationCargoTransferVerificationSystem_Instance_supervisorProcess_priorityArbiter_preCompute => "StationCargoTransferVerificationSystem_Instance_supervisorProcess_priorityArbiter_preCompute"
        case runtimemonitor.ObservationKind.StationCargoTransferVerificationSystem_Instance_supervisorProcess_priorityArbiter_postCompute => "StationCargoTransferVerificationSystem_Instance_supervisorProcess_priorityArbiter_postCompute"
        case runtimemonitor.ObservationKind.StationCargoTransferVerificationSystem_Instance_supervisorProcess_sessionController_postInit => "StationCargoTransferVerificationSystem_Instance_supervisorProcess_sessionController_postInit"
        case runtimemonitor.ObservationKind.StationCargoTransferVerificationSystem_Instance_supervisorProcess_sessionController_preCompute => "StationCargoTransferVerificationSystem_Instance_supervisorProcess_sessionController_preCompute"
        case runtimemonitor.ObservationKind.StationCargoTransferVerificationSystem_Instance_supervisorProcess_sessionController_postCompute => "StationCargoTransferVerificationSystem_Instance_supervisorProcess_sessionController_postCompute"
        case runtimemonitor.ObservationKind.StationCargoTransferVerificationSystem_Instance_supervisorProcess_shipEvidenceQualifier_postInit => "StationCargoTransferVerificationSystem_Instance_supervisorProcess_shipEvidenceQualifier_postInit"
        case runtimemonitor.ObservationKind.StationCargoTransferVerificationSystem_Instance_supervisorProcess_shipEvidenceQualifier_preCompute => "StationCargoTransferVerificationSystem_Instance_supervisorProcess_shipEvidenceQualifier_preCompute"
        case runtimemonitor.ObservationKind.StationCargoTransferVerificationSystem_Instance_supervisorProcess_shipEvidenceQualifier_postCompute => "StationCargoTransferVerificationSystem_Instance_supervisorProcess_shipEvidenceQualifier_postCompute"
        case runtimemonitor.ObservationKind.StationCargoTransferVerificationSystem_Instance_supervisorProcess_warehouseEvidenceQualifier_postInit => "StationCargoTransferVerificationSystem_Instance_supervisorProcess_warehouseEvidenceQualifier_postInit"
        case runtimemonitor.ObservationKind.StationCargoTransferVerificationSystem_Instance_supervisorProcess_warehouseEvidenceQualifier_preCompute => "StationCargoTransferVerificationSystem_Instance_supervisorProcess_warehouseEvidenceQualifier_preCompute"
        case runtimemonitor.ObservationKind.StationCargoTransferVerificationSystem_Instance_supervisorProcess_warehouseEvidenceQualifier_postCompute => "StationCargoTransferVerificationSystem_Instance_supervisorProcess_warehouseEvidenceQualifier_postCompute"
        case runtimemonitor.ObservationKind.StationCargoTransferVerificationSystem_Instance_supervisorProcess_completionReconciler_postInit => "StationCargoTransferVerificationSystem_Instance_supervisorProcess_completionReconciler_postInit"
        case runtimemonitor.ObservationKind.StationCargoTransferVerificationSystem_Instance_supervisorProcess_completionReconciler_preCompute => "StationCargoTransferVerificationSystem_Instance_supervisorProcess_completionReconciler_preCompute"
        case runtimemonitor.ObservationKind.StationCargoTransferVerificationSystem_Instance_supervisorProcess_completionReconciler_postCompute => "StationCargoTransferVerificationSystem_Instance_supervisorProcess_completionReconciler_postCompute"
        case runtimemonitor.ObservationKind.StationCargoTransferVerificationSystem_Instance_supervisorProcess_commandSafetyGate_postInit => "StationCargoTransferVerificationSystem_Instance_supervisorProcess_commandSafetyGate_postInit"
        case runtimemonitor.ObservationKind.StationCargoTransferVerificationSystem_Instance_supervisorProcess_commandSafetyGate_preCompute => "StationCargoTransferVerificationSystem_Instance_supervisorProcess_commandSafetyGate_preCompute"
        case runtimemonitor.ObservationKind.StationCargoTransferVerificationSystem_Instance_supervisorProcess_commandSafetyGate_postCompute => "StationCargoTransferVerificationSystem_Instance_supervisorProcess_commandSafetyGate_postCompute"
        case runtimemonitor.ObservationKind.StationCargoTransferVerificationSystem_Instance_supervisorProcess_outcomeReporter_postInit => "StationCargoTransferVerificationSystem_Instance_supervisorProcess_outcomeReporter_postInit"
        case runtimemonitor.ObservationKind.StationCargoTransferVerificationSystem_Instance_supervisorProcess_outcomeReporter_preCompute => "StationCargoTransferVerificationSystem_Instance_supervisorProcess_outcomeReporter_preCompute"
        case runtimemonitor.ObservationKind.StationCargoTransferVerificationSystem_Instance_supervisorProcess_outcomeReporter_postCompute => "StationCargoTransferVerificationSystem_Instance_supervisorProcess_outcomeReporter_postCompute"
      }
      return printObject(ISZ(
        ("type", printString("runtimemonitor.ObservationKind")),
        ("value", printString(value))
      ))
    }

    @pure def printutilContainer(o: util.Container): ST = {
      o match {
        case o: util.EmptyContainer => return printutilEmptyContainer(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_P => return printStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P => return printStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PS => return printStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PS(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS => return printStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_P => return printStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PS => return printStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PS(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P => return printStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS => return printStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PreState_Container_P => return printStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PS => return printStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PS(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PostState_Container_P => return printStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PS => return printStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PS(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_P => return printStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PreState_Container_P => return printStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PS => return printStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PS(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PreState_Container_PS => return printStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_PS(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_P => return printStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PS => return printStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PS(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PostState_Container_P => return printStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PostState_Container_PS => return printStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_PS(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_P => return printStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PS => return printStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PS(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_P => return printStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PS => return printStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PS(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_P => return printStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PS => return printStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PS(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_P => return printStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PS => return printStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PS(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_P => return printStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PS => return printStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PS(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_P => return printStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PS => return printStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PS(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_P => return printStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PS => return printStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PS(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_P => return printStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PS => return printStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PS(o)
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
        case o: Station_Cargo_Transfer_Verification_Supervisor.CargoState_Payload => return printStation_Cargo_Transfer_Verification_SupervisorCargoState_Payload(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.ShipCommand_Payload => return printStation_Cargo_Transfer_Verification_SupervisorShipCommand_Payload(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.ShipFinding_Payload => return printStation_Cargo_Transfer_Verification_SupervisorShipFinding_Payload(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.SessionState_Payload => return printStation_Cargo_Transfer_Verification_SupervisorSessionState_Payload(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.WarehouseQuery_Payload => return printStation_Cargo_Transfer_Verification_SupervisorWarehouseQuery_Payload(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.CommandProposal_Payload => return printStation_Cargo_Transfer_Verification_SupervisorCommandProposal_Payload(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.TransferRequest_Payload => return printStation_Cargo_Transfer_Verification_SupervisorTransferRequest_Payload(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.SessionSnapshot_Payload => return printStation_Cargo_Transfer_Verification_SupervisorSessionSnapshot_Payload(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.WarehouseFinding_Payload => return printStation_Cargo_Transfer_Verification_SupervisorWarehouseFinding_Payload(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.QualifiedRequest_Payload => return printStation_Cargo_Transfer_Verification_SupervisorQualifiedRequest_Payload(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.AdmittedDirective_Payload => return printStation_Cargo_Transfer_Verification_SupervisorAdmittedDirective_Payload(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.SessionExpectation_Payload => return printStation_Cargo_Transfer_Verification_SupervisorSessionExpectation_Payload(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.ServiceEligibility_Payload => return printStation_Cargo_Transfer_Verification_SupervisorServiceEligibility_Payload(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.PilotTransferReport_Payload => return printStation_Cargo_Transfer_Verification_SupervisorPilotTransferReport_Payload(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.ShipTransferEvidence_Payload => return printStation_Cargo_Transfer_Verification_SupervisorShipTransferEvidence_Payload(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.DockServiceCondition_Payload => return printStation_Cargo_Transfer_Verification_SupervisorDockServiceCondition_Payload(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionState_Payload => return printStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionState_Payload(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionResult_Payload => return printStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionResult_Payload(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.StationTransferReport_Payload => return printStation_Cargo_Transfer_Verification_SupervisorStationTransferReport_Payload(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.VerificationDisposition_Payload => return printStation_Cargo_Transfer_Verification_SupervisorVerificationDisposition_Payload(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.WarehouseReceiptEvidence_Payload => return printStation_Cargo_Transfer_Verification_SupervisorWarehouseReceiptEvidence_Payload(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_P => return printStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P => return printStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PS => return printStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PS(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS => return printStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_P => return printStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PS => return printStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PS(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P => return printStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS => return printStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PreState_Container_P => return printStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PS => return printStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PS(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PostState_Container_P => return printStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PS => return printStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PS(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_P => return printStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PreState_Container_P => return printStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PS => return printStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PS(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PreState_Container_PS => return printStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_PS(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_P => return printStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PS => return printStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PS(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PostState_Container_P => return printStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PostState_Container_PS => return printStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_PS(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_P => return printStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PS => return printStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PS(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_P => return printStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PS => return printStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PS(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_P => return printStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PS => return printStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PS(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_P => return printStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PS => return printStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PS(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_P => return printStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PS => return printStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PS(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_P => return printStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PS => return printStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PS(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_P => return printStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PS => return printStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PS(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_P => return printStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PS => return printStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PS(o)
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

    def parseStation_Cargo_Transfer_Verification_SupervisorTransferRequestType(): Station_Cargo_Transfer_Verification_Supervisor.TransferRequest.Type = {
      val r = parseStation_Cargo_Transfer_Verification_SupervisorTransferRequestT(F)
      return r
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorTransferRequestT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.TransferRequest.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Station_Cargo_Transfer_Verification_Supervisor.TransferRequest")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Station_Cargo_Transfer_Verification_Supervisor.TransferRequest.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Station_Cargo_Transfer_Verification_Supervisor.TransferRequest.")
          return Station_Cargo_Transfer_Verification_Supervisor.TransferRequest.byOrdinal(0).get
      }
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorTransferRequest_Payload(): Station_Cargo_Transfer_Verification_Supervisor.TransferRequest_Payload = {
      val r = parseStation_Cargo_Transfer_Verification_SupervisorTransferRequest_PayloadT(F)
      return r
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorTransferRequest_PayloadT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.TransferRequest_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Station_Cargo_Transfer_Verification_Supervisor.TransferRequest_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseStation_Cargo_Transfer_Verification_SupervisorTransferRequestType()
      parser.parseObjectNext()
      return Station_Cargo_Transfer_Verification_Supervisor.TransferRequest_Payload(value)
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorCargoStateType(): Station_Cargo_Transfer_Verification_Supervisor.CargoState.Type = {
      val r = parseStation_Cargo_Transfer_Verification_SupervisorCargoStateT(F)
      return r
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorCargoStateT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.CargoState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Station_Cargo_Transfer_Verification_Supervisor.CargoState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Station_Cargo_Transfer_Verification_Supervisor.CargoState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Station_Cargo_Transfer_Verification_Supervisor.CargoState.")
          return Station_Cargo_Transfer_Verification_Supervisor.CargoState.byOrdinal(0).get
      }
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorCargoState_Payload(): Station_Cargo_Transfer_Verification_Supervisor.CargoState_Payload = {
      val r = parseStation_Cargo_Transfer_Verification_SupervisorCargoState_PayloadT(F)
      return r
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorCargoState_PayloadT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.CargoState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Station_Cargo_Transfer_Verification_Supervisor.CargoState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseStation_Cargo_Transfer_Verification_SupervisorCargoStateType()
      parser.parseObjectNext()
      return Station_Cargo_Transfer_Verification_Supervisor.CargoState_Payload(value)
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorQualifiedRequestType(): Station_Cargo_Transfer_Verification_Supervisor.QualifiedRequest.Type = {
      val r = parseStation_Cargo_Transfer_Verification_SupervisorQualifiedRequestT(F)
      return r
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorQualifiedRequestT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.QualifiedRequest.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Station_Cargo_Transfer_Verification_Supervisor.QualifiedRequest")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Station_Cargo_Transfer_Verification_Supervisor.QualifiedRequest.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Station_Cargo_Transfer_Verification_Supervisor.QualifiedRequest.")
          return Station_Cargo_Transfer_Verification_Supervisor.QualifiedRequest.byOrdinal(0).get
      }
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorQualifiedRequest_Payload(): Station_Cargo_Transfer_Verification_Supervisor.QualifiedRequest_Payload = {
      val r = parseStation_Cargo_Transfer_Verification_SupervisorQualifiedRequest_PayloadT(F)
      return r
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorQualifiedRequest_PayloadT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.QualifiedRequest_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Station_Cargo_Transfer_Verification_Supervisor.QualifiedRequest_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseStation_Cargo_Transfer_Verification_SupervisorQualifiedRequestType()
      parser.parseObjectNext()
      return Station_Cargo_Transfer_Verification_Supervisor.QualifiedRequest_Payload(value)
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorDockServiceConditionType(): Station_Cargo_Transfer_Verification_Supervisor.DockServiceCondition.Type = {
      val r = parseStation_Cargo_Transfer_Verification_SupervisorDockServiceConditionT(F)
      return r
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorDockServiceConditionT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.DockServiceCondition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Station_Cargo_Transfer_Verification_Supervisor.DockServiceCondition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Station_Cargo_Transfer_Verification_Supervisor.DockServiceCondition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Station_Cargo_Transfer_Verification_Supervisor.DockServiceCondition.")
          return Station_Cargo_Transfer_Verification_Supervisor.DockServiceCondition.byOrdinal(0).get
      }
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorDockServiceCondition_Payload(): Station_Cargo_Transfer_Verification_Supervisor.DockServiceCondition_Payload = {
      val r = parseStation_Cargo_Transfer_Verification_SupervisorDockServiceCondition_PayloadT(F)
      return r
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorDockServiceCondition_PayloadT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.DockServiceCondition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Station_Cargo_Transfer_Verification_Supervisor.DockServiceCondition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseStation_Cargo_Transfer_Verification_SupervisorDockServiceConditionType()
      parser.parseObjectNext()
      return Station_Cargo_Transfer_Verification_Supervisor.DockServiceCondition_Payload(value)
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorServiceEligibilityType(): Station_Cargo_Transfer_Verification_Supervisor.ServiceEligibility.Type = {
      val r = parseStation_Cargo_Transfer_Verification_SupervisorServiceEligibilityT(F)
      return r
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorServiceEligibilityT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.ServiceEligibility.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Station_Cargo_Transfer_Verification_Supervisor.ServiceEligibility")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Station_Cargo_Transfer_Verification_Supervisor.ServiceEligibility.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Station_Cargo_Transfer_Verification_Supervisor.ServiceEligibility.")
          return Station_Cargo_Transfer_Verification_Supervisor.ServiceEligibility.byOrdinal(0).get
      }
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorServiceEligibility_Payload(): Station_Cargo_Transfer_Verification_Supervisor.ServiceEligibility_Payload = {
      val r = parseStation_Cargo_Transfer_Verification_SupervisorServiceEligibility_PayloadT(F)
      return r
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorServiceEligibility_PayloadT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.ServiceEligibility_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Station_Cargo_Transfer_Verification_Supervisor.ServiceEligibility_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseStation_Cargo_Transfer_Verification_SupervisorServiceEligibilityType()
      parser.parseObjectNext()
      return Station_Cargo_Transfer_Verification_Supervisor.ServiceEligibility_Payload(value)
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorSessionStateType(): Station_Cargo_Transfer_Verification_Supervisor.SessionState.Type = {
      val r = parseStation_Cargo_Transfer_Verification_SupervisorSessionStateT(F)
      return r
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorSessionStateT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.SessionState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Station_Cargo_Transfer_Verification_Supervisor.SessionState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Station_Cargo_Transfer_Verification_Supervisor.SessionState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Station_Cargo_Transfer_Verification_Supervisor.SessionState.")
          return Station_Cargo_Transfer_Verification_Supervisor.SessionState.byOrdinal(0).get
      }
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorSessionState_Payload(): Station_Cargo_Transfer_Verification_Supervisor.SessionState_Payload = {
      val r = parseStation_Cargo_Transfer_Verification_SupervisorSessionState_PayloadT(F)
      return r
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorSessionState_PayloadT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.SessionState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Station_Cargo_Transfer_Verification_Supervisor.SessionState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseStation_Cargo_Transfer_Verification_SupervisorSessionStateType()
      parser.parseObjectNext()
      return Station_Cargo_Transfer_Verification_Supervisor.SessionState_Payload(value)
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorAdmittedDirectiveType(): Station_Cargo_Transfer_Verification_Supervisor.AdmittedDirective.Type = {
      val r = parseStation_Cargo_Transfer_Verification_SupervisorAdmittedDirectiveT(F)
      return r
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorAdmittedDirectiveT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.AdmittedDirective.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Station_Cargo_Transfer_Verification_Supervisor.AdmittedDirective")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Station_Cargo_Transfer_Verification_Supervisor.AdmittedDirective.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Station_Cargo_Transfer_Verification_Supervisor.AdmittedDirective.")
          return Station_Cargo_Transfer_Verification_Supervisor.AdmittedDirective.byOrdinal(0).get
      }
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorAdmittedDirective_Payload(): Station_Cargo_Transfer_Verification_Supervisor.AdmittedDirective_Payload = {
      val r = parseStation_Cargo_Transfer_Verification_SupervisorAdmittedDirective_PayloadT(F)
      return r
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorAdmittedDirective_PayloadT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.AdmittedDirective_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Station_Cargo_Transfer_Verification_Supervisor.AdmittedDirective_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseStation_Cargo_Transfer_Verification_SupervisorAdmittedDirectiveType()
      parser.parseObjectNext()
      return Station_Cargo_Transfer_Verification_Supervisor.AdmittedDirective_Payload(value)
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorVerificationDispositionType(): Station_Cargo_Transfer_Verification_Supervisor.VerificationDisposition.Type = {
      val r = parseStation_Cargo_Transfer_Verification_SupervisorVerificationDispositionT(F)
      return r
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorVerificationDispositionT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.VerificationDisposition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Station_Cargo_Transfer_Verification_Supervisor.VerificationDisposition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Station_Cargo_Transfer_Verification_Supervisor.VerificationDisposition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Station_Cargo_Transfer_Verification_Supervisor.VerificationDisposition.")
          return Station_Cargo_Transfer_Verification_Supervisor.VerificationDisposition.byOrdinal(0).get
      }
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorVerificationDisposition_Payload(): Station_Cargo_Transfer_Verification_Supervisor.VerificationDisposition_Payload = {
      val r = parseStation_Cargo_Transfer_Verification_SupervisorVerificationDisposition_PayloadT(F)
      return r
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorVerificationDisposition_PayloadT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.VerificationDisposition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Station_Cargo_Transfer_Verification_Supervisor.VerificationDisposition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseStation_Cargo_Transfer_Verification_SupervisorVerificationDispositionType()
      parser.parseObjectNext()
      return Station_Cargo_Transfer_Verification_Supervisor.VerificationDisposition_Payload(value)
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorSessionExpectationType(): Station_Cargo_Transfer_Verification_Supervisor.SessionExpectation.Type = {
      val r = parseStation_Cargo_Transfer_Verification_SupervisorSessionExpectationT(F)
      return r
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorSessionExpectationT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.SessionExpectation.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Station_Cargo_Transfer_Verification_Supervisor.SessionExpectation")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Station_Cargo_Transfer_Verification_Supervisor.SessionExpectation.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Station_Cargo_Transfer_Verification_Supervisor.SessionExpectation.")
          return Station_Cargo_Transfer_Verification_Supervisor.SessionExpectation.byOrdinal(0).get
      }
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorSessionExpectation_Payload(): Station_Cargo_Transfer_Verification_Supervisor.SessionExpectation_Payload = {
      val r = parseStation_Cargo_Transfer_Verification_SupervisorSessionExpectation_PayloadT(F)
      return r
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorSessionExpectation_PayloadT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.SessionExpectation_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Station_Cargo_Transfer_Verification_Supervisor.SessionExpectation_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseStation_Cargo_Transfer_Verification_SupervisorSessionExpectationType()
      parser.parseObjectNext()
      return Station_Cargo_Transfer_Verification_Supervisor.SessionExpectation_Payload(value)
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorCommandProposalType(): Station_Cargo_Transfer_Verification_Supervisor.CommandProposal.Type = {
      val r = parseStation_Cargo_Transfer_Verification_SupervisorCommandProposalT(F)
      return r
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorCommandProposalT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.CommandProposal.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Station_Cargo_Transfer_Verification_Supervisor.CommandProposal")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Station_Cargo_Transfer_Verification_Supervisor.CommandProposal.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Station_Cargo_Transfer_Verification_Supervisor.CommandProposal.")
          return Station_Cargo_Transfer_Verification_Supervisor.CommandProposal.byOrdinal(0).get
      }
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorCommandProposal_Payload(): Station_Cargo_Transfer_Verification_Supervisor.CommandProposal_Payload = {
      val r = parseStation_Cargo_Transfer_Verification_SupervisorCommandProposal_PayloadT(F)
      return r
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorCommandProposal_PayloadT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.CommandProposal_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Station_Cargo_Transfer_Verification_Supervisor.CommandProposal_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseStation_Cargo_Transfer_Verification_SupervisorCommandProposalType()
      parser.parseObjectNext()
      return Station_Cargo_Transfer_Verification_Supervisor.CommandProposal_Payload(value)
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionStateType(): Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionState.Type = {
      val r = parseStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionStateT(F)
      return r
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionStateT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionState.")
          return Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionState.byOrdinal(0).get
      }
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionState_Payload(): Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionState_Payload = {
      val r = parseStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionState_PayloadT(F)
      return r
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionState_PayloadT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionStateType()
      parser.parseObjectNext()
      return Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionState_Payload(value)
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionResultType(): Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionResult.Type = {
      val r = parseStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionResultT(F)
      return r
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionResultT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionResult.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionResult")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionResult.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionResult.")
          return Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionResult.byOrdinal(0).get
      }
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionResult_Payload(): Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionResult_Payload = {
      val r = parseStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionResult_PayloadT(F)
      return r
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionResult_PayloadT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionResult_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionResult_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionResultType()
      parser.parseObjectNext()
      return Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionResult_Payload(value)
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorShipTransferEvidenceType(): Station_Cargo_Transfer_Verification_Supervisor.ShipTransferEvidence.Type = {
      val r = parseStation_Cargo_Transfer_Verification_SupervisorShipTransferEvidenceT(F)
      return r
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorShipTransferEvidenceT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.ShipTransferEvidence.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Station_Cargo_Transfer_Verification_Supervisor.ShipTransferEvidence")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Station_Cargo_Transfer_Verification_Supervisor.ShipTransferEvidence.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Station_Cargo_Transfer_Verification_Supervisor.ShipTransferEvidence.")
          return Station_Cargo_Transfer_Verification_Supervisor.ShipTransferEvidence.byOrdinal(0).get
      }
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorShipTransferEvidence_Payload(): Station_Cargo_Transfer_Verification_Supervisor.ShipTransferEvidence_Payload = {
      val r = parseStation_Cargo_Transfer_Verification_SupervisorShipTransferEvidence_PayloadT(F)
      return r
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorShipTransferEvidence_PayloadT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.ShipTransferEvidence_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Station_Cargo_Transfer_Verification_Supervisor.ShipTransferEvidence_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseStation_Cargo_Transfer_Verification_SupervisorShipTransferEvidenceType()
      parser.parseObjectNext()
      return Station_Cargo_Transfer_Verification_Supervisor.ShipTransferEvidence_Payload(value)
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorShipFindingType(): Station_Cargo_Transfer_Verification_Supervisor.ShipFinding.Type = {
      val r = parseStation_Cargo_Transfer_Verification_SupervisorShipFindingT(F)
      return r
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorShipFindingT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.ShipFinding.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Station_Cargo_Transfer_Verification_Supervisor.ShipFinding")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Station_Cargo_Transfer_Verification_Supervisor.ShipFinding.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Station_Cargo_Transfer_Verification_Supervisor.ShipFinding.")
          return Station_Cargo_Transfer_Verification_Supervisor.ShipFinding.byOrdinal(0).get
      }
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorShipFinding_Payload(): Station_Cargo_Transfer_Verification_Supervisor.ShipFinding_Payload = {
      val r = parseStation_Cargo_Transfer_Verification_SupervisorShipFinding_PayloadT(F)
      return r
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorShipFinding_PayloadT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.ShipFinding_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Station_Cargo_Transfer_Verification_Supervisor.ShipFinding_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseStation_Cargo_Transfer_Verification_SupervisorShipFindingType()
      parser.parseObjectNext()
      return Station_Cargo_Transfer_Verification_Supervisor.ShipFinding_Payload(value)
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorWarehouseReceiptEvidenceType(): Station_Cargo_Transfer_Verification_Supervisor.WarehouseReceiptEvidence.Type = {
      val r = parseStation_Cargo_Transfer_Verification_SupervisorWarehouseReceiptEvidenceT(F)
      return r
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorWarehouseReceiptEvidenceT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.WarehouseReceiptEvidence.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Station_Cargo_Transfer_Verification_Supervisor.WarehouseReceiptEvidence")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Station_Cargo_Transfer_Verification_Supervisor.WarehouseReceiptEvidence.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Station_Cargo_Transfer_Verification_Supervisor.WarehouseReceiptEvidence.")
          return Station_Cargo_Transfer_Verification_Supervisor.WarehouseReceiptEvidence.byOrdinal(0).get
      }
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorWarehouseReceiptEvidence_Payload(): Station_Cargo_Transfer_Verification_Supervisor.WarehouseReceiptEvidence_Payload = {
      val r = parseStation_Cargo_Transfer_Verification_SupervisorWarehouseReceiptEvidence_PayloadT(F)
      return r
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorWarehouseReceiptEvidence_PayloadT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.WarehouseReceiptEvidence_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Station_Cargo_Transfer_Verification_Supervisor.WarehouseReceiptEvidence_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseStation_Cargo_Transfer_Verification_SupervisorWarehouseReceiptEvidenceType()
      parser.parseObjectNext()
      return Station_Cargo_Transfer_Verification_Supervisor.WarehouseReceiptEvidence_Payload(value)
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorWarehouseFindingType(): Station_Cargo_Transfer_Verification_Supervisor.WarehouseFinding.Type = {
      val r = parseStation_Cargo_Transfer_Verification_SupervisorWarehouseFindingT(F)
      return r
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorWarehouseFindingT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.WarehouseFinding.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Station_Cargo_Transfer_Verification_Supervisor.WarehouseFinding")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Station_Cargo_Transfer_Verification_Supervisor.WarehouseFinding.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Station_Cargo_Transfer_Verification_Supervisor.WarehouseFinding.")
          return Station_Cargo_Transfer_Verification_Supervisor.WarehouseFinding.byOrdinal(0).get
      }
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorWarehouseFinding_Payload(): Station_Cargo_Transfer_Verification_Supervisor.WarehouseFinding_Payload = {
      val r = parseStation_Cargo_Transfer_Verification_SupervisorWarehouseFinding_PayloadT(F)
      return r
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorWarehouseFinding_PayloadT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.WarehouseFinding_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Station_Cargo_Transfer_Verification_Supervisor.WarehouseFinding_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseStation_Cargo_Transfer_Verification_SupervisorWarehouseFindingType()
      parser.parseObjectNext()
      return Station_Cargo_Transfer_Verification_Supervisor.WarehouseFinding_Payload(value)
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorShipCommandType(): Station_Cargo_Transfer_Verification_Supervisor.ShipCommand.Type = {
      val r = parseStation_Cargo_Transfer_Verification_SupervisorShipCommandT(F)
      return r
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorShipCommandT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.ShipCommand.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Station_Cargo_Transfer_Verification_Supervisor.ShipCommand")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Station_Cargo_Transfer_Verification_Supervisor.ShipCommand.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Station_Cargo_Transfer_Verification_Supervisor.ShipCommand.")
          return Station_Cargo_Transfer_Verification_Supervisor.ShipCommand.byOrdinal(0).get
      }
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorShipCommand_Payload(): Station_Cargo_Transfer_Verification_Supervisor.ShipCommand_Payload = {
      val r = parseStation_Cargo_Transfer_Verification_SupervisorShipCommand_PayloadT(F)
      return r
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorShipCommand_PayloadT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.ShipCommand_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Station_Cargo_Transfer_Verification_Supervisor.ShipCommand_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseStation_Cargo_Transfer_Verification_SupervisorShipCommandType()
      parser.parseObjectNext()
      return Station_Cargo_Transfer_Verification_Supervisor.ShipCommand_Payload(value)
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorWarehouseQueryType(): Station_Cargo_Transfer_Verification_Supervisor.WarehouseQuery.Type = {
      val r = parseStation_Cargo_Transfer_Verification_SupervisorWarehouseQueryT(F)
      return r
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorWarehouseQueryT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.WarehouseQuery.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Station_Cargo_Transfer_Verification_Supervisor.WarehouseQuery")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Station_Cargo_Transfer_Verification_Supervisor.WarehouseQuery.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Station_Cargo_Transfer_Verification_Supervisor.WarehouseQuery.")
          return Station_Cargo_Transfer_Verification_Supervisor.WarehouseQuery.byOrdinal(0).get
      }
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorWarehouseQuery_Payload(): Station_Cargo_Transfer_Verification_Supervisor.WarehouseQuery_Payload = {
      val r = parseStation_Cargo_Transfer_Verification_SupervisorWarehouseQuery_PayloadT(F)
      return r
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorWarehouseQuery_PayloadT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.WarehouseQuery_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Station_Cargo_Transfer_Verification_Supervisor.WarehouseQuery_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseStation_Cargo_Transfer_Verification_SupervisorWarehouseQueryType()
      parser.parseObjectNext()
      return Station_Cargo_Transfer_Verification_Supervisor.WarehouseQuery_Payload(value)
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorPilotTransferReportType(): Station_Cargo_Transfer_Verification_Supervisor.PilotTransferReport.Type = {
      val r = parseStation_Cargo_Transfer_Verification_SupervisorPilotTransferReportT(F)
      return r
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorPilotTransferReportT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.PilotTransferReport.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Station_Cargo_Transfer_Verification_Supervisor.PilotTransferReport")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Station_Cargo_Transfer_Verification_Supervisor.PilotTransferReport.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Station_Cargo_Transfer_Verification_Supervisor.PilotTransferReport.")
          return Station_Cargo_Transfer_Verification_Supervisor.PilotTransferReport.byOrdinal(0).get
      }
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorPilotTransferReport_Payload(): Station_Cargo_Transfer_Verification_Supervisor.PilotTransferReport_Payload = {
      val r = parseStation_Cargo_Transfer_Verification_SupervisorPilotTransferReport_PayloadT(F)
      return r
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorPilotTransferReport_PayloadT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.PilotTransferReport_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Station_Cargo_Transfer_Verification_Supervisor.PilotTransferReport_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseStation_Cargo_Transfer_Verification_SupervisorPilotTransferReportType()
      parser.parseObjectNext()
      return Station_Cargo_Transfer_Verification_Supervisor.PilotTransferReport_Payload(value)
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorStationTransferReportType(): Station_Cargo_Transfer_Verification_Supervisor.StationTransferReport.Type = {
      val r = parseStation_Cargo_Transfer_Verification_SupervisorStationTransferReportT(F)
      return r
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorStationTransferReportT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.StationTransferReport.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Station_Cargo_Transfer_Verification_Supervisor.StationTransferReport")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Station_Cargo_Transfer_Verification_Supervisor.StationTransferReport.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Station_Cargo_Transfer_Verification_Supervisor.StationTransferReport.")
          return Station_Cargo_Transfer_Verification_Supervisor.StationTransferReport.byOrdinal(0).get
      }
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorStationTransferReport_Payload(): Station_Cargo_Transfer_Verification_Supervisor.StationTransferReport_Payload = {
      val r = parseStation_Cargo_Transfer_Verification_SupervisorStationTransferReport_PayloadT(F)
      return r
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorStationTransferReport_PayloadT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.StationTransferReport_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Station_Cargo_Transfer_Verification_Supervisor.StationTransferReport_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseStation_Cargo_Transfer_Verification_SupervisorStationTransferReportType()
      parser.parseObjectNext()
      return Station_Cargo_Transfer_Verification_Supervisor.StationTransferReport_Payload(value)
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorSessionSnapshot(): Station_Cargo_Transfer_Verification_Supervisor.SessionSnapshot = {
      val r = parseStation_Cargo_Transfer_Verification_SupervisorSessionSnapshotT(F)
      return r
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorSessionSnapshotT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.SessionSnapshot = {
      if (!typeParsed) {
        parser.parseObjectType("Station_Cargo_Transfer_Verification_Supervisor.SessionSnapshot")
      }
      parser.parseObjectKey("next_state")
      val next_state = parseStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("session_result")
      val session_result = parseStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionResultType()
      parser.parseObjectNext()
      return Station_Cargo_Transfer_Verification_Supervisor.SessionSnapshot(next_state, session_result)
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorSessionSnapshot_Payload(): Station_Cargo_Transfer_Verification_Supervisor.SessionSnapshot_Payload = {
      val r = parseStation_Cargo_Transfer_Verification_SupervisorSessionSnapshot_PayloadT(F)
      return r
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorSessionSnapshot_PayloadT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.SessionSnapshot_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Station_Cargo_Transfer_Verification_Supervisor.SessionSnapshot_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseStation_Cargo_Transfer_Verification_SupervisorSessionSnapshot()
      parser.parseObjectNext()
      return Station_Cargo_Transfer_Verification_Supervisor.SessionSnapshot_Payload(value)
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

    def parseStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container(): Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PreState_Container_P", "Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PS"))
      t.native match {
        case "Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PreState_Container_P" => val r = parseStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PT(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PS" => val r = parseStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PST(T); return r
        case _ => val r = parseStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PST(T); return r
      }
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_P(): Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PreState_Container_P = {
      val r = parseStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PT(F)
      return r
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PreState_Container_P")
      }
      parser.parseObjectKey("api_cargoState")
      val api_cargoState = parseStation_Cargo_Transfer_Verification_SupervisorCargoStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_transferRequest")
      val api_transferRequest = parseStation_Cargo_Transfer_Verification_SupervisorTransferRequestType()
      parser.parseObjectNext()
      return Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PreState_Container_P(api_cargoState, api_transferRequest)
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PS(): Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PS = {
      val r = parseStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PST(F)
      return r
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PST(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PS")
      }
      parser.parseObjectKey("api_cargoState")
      val api_cargoState = parseStation_Cargo_Transfer_Verification_SupervisorCargoStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_transferRequest")
      val api_transferRequest = parseStation_Cargo_Transfer_Verification_SupervisorTransferRequestType()
      parser.parseObjectNext()
      return Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PS(api_cargoState, api_transferRequest)
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container(): Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PostState_Container_P", "Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PS"))
      t.native match {
        case "Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PostState_Container_P" => val r = parseStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PT(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PS" => val r = parseStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PST(T); return r
        case _ => val r = parseStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PST(T); return r
      }
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_P(): Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PostState_Container_P = {
      val r = parseStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PT(F)
      return r
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PostState_Container_P")
      }
      parser.parseObjectKey("api_qualifiedRequest")
      val api_qualifiedRequest = parseStation_Cargo_Transfer_Verification_SupervisorQualifiedRequestType()
      parser.parseObjectNext()
      return Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PostState_Container_P(api_qualifiedRequest)
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PS(): Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PS = {
      val r = parseStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PST(F)
      return r
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PST(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PS")
      }
      parser.parseObjectKey("api_qualifiedRequest")
      val api_qualifiedRequest = parseStation_Cargo_Transfer_Verification_SupervisorQualifiedRequestType()
      parser.parseObjectNext()
      return Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PS(api_qualifiedRequest)
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container(): Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_P", "Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PS"))
      t.native match {
        case "Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_P" => val r = parseStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PT(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PS" => val r = parseStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PST(T); return r
        case _ => val r = parseStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PST(T); return r
      }
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_P(): Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_P = {
      val r = parseStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PT(F)
      return r
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_P")
      }
      parser.parseObjectKey("api_serviceCondition")
      val api_serviceCondition = parseStation_Cargo_Transfer_Verification_SupervisorDockServiceConditionType()
      parser.parseObjectNext()
      return Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_P(api_serviceCondition)
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PS(): Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PS = {
      val r = parseStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PST(F)
      return r
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PST(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PS")
      }
      parser.parseObjectKey("api_serviceCondition")
      val api_serviceCondition = parseStation_Cargo_Transfer_Verification_SupervisorDockServiceConditionType()
      parser.parseObjectNext()
      return Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PS(api_serviceCondition)
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container(): Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_P", "Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PS"))
      t.native match {
        case "Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_P" => val r = parseStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PT(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PS" => val r = parseStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PST(T); return r
        case _ => val r = parseStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PST(T); return r
      }
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_P(): Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_P = {
      val r = parseStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PT(F)
      return r
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_P")
      }
      parser.parseObjectKey("api_gateEligibility")
      val api_gateEligibility = parseStation_Cargo_Transfer_Verification_SupervisorServiceEligibilityType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_serviceEligibility")
      val api_serviceEligibility = parseStation_Cargo_Transfer_Verification_SupervisorServiceEligibilityType()
      parser.parseObjectNext()
      return Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_P(api_gateEligibility, api_serviceEligibility)
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PS(): Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PS = {
      val r = parseStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PST(F)
      return r
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PST(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PS")
      }
      parser.parseObjectKey("api_gateEligibility")
      val api_gateEligibility = parseStation_Cargo_Transfer_Verification_SupervisorServiceEligibilityType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_serviceEligibility")
      val api_serviceEligibility = parseStation_Cargo_Transfer_Verification_SupervisorServiceEligibilityType()
      parser.parseObjectNext()
      return Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PS(api_gateEligibility, api_serviceEligibility)
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container(): Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P", "Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS"))
      t.native match {
        case "Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P" => val r = parseStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PT(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS" => val r = parseStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PST(T); return r
        case _ => val r = parseStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PST(T); return r
      }
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P(): Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P = {
      val r = parseStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PT(F)
      return r
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P")
      }
      parser.parseObjectKey("api_qualifiedRequest")
      val api_qualifiedRequest = parseStation_Cargo_Transfer_Verification_SupervisorQualifiedRequestType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_serviceEligibility")
      val api_serviceEligibility = parseStation_Cargo_Transfer_Verification_SupervisorServiceEligibilityType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_sessionPrestate")
      val api_sessionPrestate = parseStation_Cargo_Transfer_Verification_SupervisorSessionStateType()
      parser.parseObjectNext()
      return Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P(api_qualifiedRequest, api_serviceEligibility, api_sessionPrestate)
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS(): Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS = {
      val r = parseStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PST(F)
      return r
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PST(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS")
      }
      parser.parseObjectKey("api_qualifiedRequest")
      val api_qualifiedRequest = parseStation_Cargo_Transfer_Verification_SupervisorQualifiedRequestType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_serviceEligibility")
      val api_serviceEligibility = parseStation_Cargo_Transfer_Verification_SupervisorServiceEligibilityType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_sessionPrestate")
      val api_sessionPrestate = parseStation_Cargo_Transfer_Verification_SupervisorSessionStateType()
      parser.parseObjectNext()
      return Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS(api_qualifiedRequest, api_serviceEligibility, api_sessionPrestate)
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container(): Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P", "Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS"))
      t.native match {
        case "Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P" => val r = parseStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PT(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS" => val r = parseStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PST(T); return r
        case _ => val r = parseStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PST(T); return r
      }
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P(): Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P = {
      val r = parseStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PT(F)
      return r
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P")
      }
      parser.parseObjectKey("api_admittedDirective")
      val api_admittedDirective = parseStation_Cargo_Transfer_Verification_SupervisorAdmittedDirectiveType()
      parser.parseObjectNext()
      return Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P(api_admittedDirective)
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS(): Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS = {
      val r = parseStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PST(F)
      return r
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PST(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS")
      }
      parser.parseObjectKey("api_admittedDirective")
      val api_admittedDirective = parseStation_Cargo_Transfer_Verification_SupervisorAdmittedDirectiveType()
      parser.parseObjectNext()
      return Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS(api_admittedDirective)
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container(): Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PreState_Container_P", "Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PreState_Container_PS"))
      t.native match {
        case "Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PreState_Container_P" => val r = parseStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_PT(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PreState_Container_PS" => val r = parseStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_PST(T); return r
        case _ => val r = parseStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_PST(T); return r
      }
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_P(): Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PreState_Container_P = {
      val r = parseStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_PT(F)
      return r
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_PT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PreState_Container_P")
      }
      parser.parseObjectKey("api_admittedDirective")
      val api_admittedDirective = parseStation_Cargo_Transfer_Verification_SupervisorAdmittedDirectiveType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_verificationDisposition")
      val api_verificationDisposition = parseStation_Cargo_Transfer_Verification_SupervisorVerificationDispositionType()
      parser.parseObjectNext()
      return Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PreState_Container_P(api_admittedDirective, api_verificationDisposition)
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_PS(): Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PreState_Container_PS = {
      val r = parseStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_PST(F)
      return r
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_PST(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PreState_Container_PS")
      }
      parser.parseObjectKey("In_sessionState")
      val In_sessionState = parseStation_Cargo_Transfer_Verification_SupervisorSessionStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_admittedDirective")
      val api_admittedDirective = parseStation_Cargo_Transfer_Verification_SupervisorAdmittedDirectiveType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_verificationDisposition")
      val api_verificationDisposition = parseStation_Cargo_Transfer_Verification_SupervisorVerificationDispositionType()
      parser.parseObjectNext()
      return Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PreState_Container_PS(In_sessionState, api_admittedDirective, api_verificationDisposition)
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container(): Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PostState_Container_P", "Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PostState_Container_PS"))
      t.native match {
        case "Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PostState_Container_P" => val r = parseStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_PT(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PostState_Container_PS" => val r = parseStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_PST(T); return r
        case _ => val r = parseStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_PST(T); return r
      }
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_P(): Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PostState_Container_P = {
      val r = parseStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_PT(F)
      return r
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_PT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PostState_Container_P")
      }
      parser.parseObjectKey("api_commandProposal")
      val api_commandProposal = parseStation_Cargo_Transfer_Verification_SupervisorCommandProposalType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_sessionPrestate")
      val api_sessionPrestate = parseStation_Cargo_Transfer_Verification_SupervisorSessionStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_sessionSnapshot")
      val api_sessionSnapshot = parseStation_Cargo_Transfer_Verification_SupervisorSessionSnapshot()
      parser.parseObjectNext()
      parser.parseObjectKey("api_shipExpectation")
      val api_shipExpectation = parseStation_Cargo_Transfer_Verification_SupervisorSessionExpectationType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_warehouseExpectation")
      val api_warehouseExpectation = parseStation_Cargo_Transfer_Verification_SupervisorSessionExpectationType()
      parser.parseObjectNext()
      return Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PostState_Container_P(api_commandProposal, api_sessionPrestate, api_sessionSnapshot, api_shipExpectation, api_warehouseExpectation)
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_PS(): Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PostState_Container_PS = {
      val r = parseStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_PST(F)
      return r
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_PST(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PostState_Container_PS")
      }
      parser.parseObjectKey("sessionState")
      val sessionState = parseStation_Cargo_Transfer_Verification_SupervisorSessionStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_commandProposal")
      val api_commandProposal = parseStation_Cargo_Transfer_Verification_SupervisorCommandProposalType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_sessionPrestate")
      val api_sessionPrestate = parseStation_Cargo_Transfer_Verification_SupervisorSessionStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_sessionSnapshot")
      val api_sessionSnapshot = parseStation_Cargo_Transfer_Verification_SupervisorSessionSnapshot()
      parser.parseObjectNext()
      parser.parseObjectKey("api_shipExpectation")
      val api_shipExpectation = parseStation_Cargo_Transfer_Verification_SupervisorSessionExpectationType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_warehouseExpectation")
      val api_warehouseExpectation = parseStation_Cargo_Transfer_Verification_SupervisorSessionExpectationType()
      parser.parseObjectNext()
      return Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PostState_Container_PS(sessionState, api_commandProposal, api_sessionPrestate, api_sessionSnapshot, api_shipExpectation, api_warehouseExpectation)
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container(): Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_P", "Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PS"))
      t.native match {
        case "Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_P" => val r = parseStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PT(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PS" => val r = parseStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PST(T); return r
        case _ => val r = parseStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PST(T); return r
      }
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_P(): Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_P = {
      val r = parseStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PT(F)
      return r
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_P")
      }
      parser.parseObjectKey("api_sessionExpectation")
      val api_sessionExpectation = parseStation_Cargo_Transfer_Verification_SupervisorSessionExpectationType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_transferEvidence")
      val api_transferEvidence = parseStation_Cargo_Transfer_Verification_SupervisorShipTransferEvidenceType()
      parser.parseObjectNext()
      return Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_P(api_sessionExpectation, api_transferEvidence)
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PS(): Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PS = {
      val r = parseStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PST(F)
      return r
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PST(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PS")
      }
      parser.parseObjectKey("api_sessionExpectation")
      val api_sessionExpectation = parseStation_Cargo_Transfer_Verification_SupervisorSessionExpectationType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_transferEvidence")
      val api_transferEvidence = parseStation_Cargo_Transfer_Verification_SupervisorShipTransferEvidenceType()
      parser.parseObjectNext()
      return Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PS(api_sessionExpectation, api_transferEvidence)
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container(): Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_P", "Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PS"))
      t.native match {
        case "Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_P" => val r = parseStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PT(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PS" => val r = parseStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PST(T); return r
        case _ => val r = parseStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PST(T); return r
      }
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_P(): Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_P = {
      val r = parseStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PT(F)
      return r
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_P")
      }
      parser.parseObjectKey("api_shipFinding")
      val api_shipFinding = parseStation_Cargo_Transfer_Verification_SupervisorShipFindingType()
      parser.parseObjectNext()
      return Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_P(api_shipFinding)
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PS(): Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PS = {
      val r = parseStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PST(F)
      return r
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PST(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PS")
      }
      parser.parseObjectKey("api_shipFinding")
      val api_shipFinding = parseStation_Cargo_Transfer_Verification_SupervisorShipFindingType()
      parser.parseObjectNext()
      return Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PS(api_shipFinding)
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container(): Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_P", "Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PS"))
      t.native match {
        case "Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_P" => val r = parseStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PT(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PS" => val r = parseStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PST(T); return r
        case _ => val r = parseStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PST(T); return r
      }
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_P(): Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_P = {
      val r = parseStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PT(F)
      return r
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_P")
      }
      parser.parseObjectKey("api_receiptEvidence")
      val api_receiptEvidence = parseStation_Cargo_Transfer_Verification_SupervisorWarehouseReceiptEvidenceType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_sessionExpectation")
      val api_sessionExpectation = parseStation_Cargo_Transfer_Verification_SupervisorSessionExpectationType()
      parser.parseObjectNext()
      return Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_P(api_receiptEvidence, api_sessionExpectation)
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PS(): Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PS = {
      val r = parseStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PST(F)
      return r
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PST(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PS")
      }
      parser.parseObjectKey("api_receiptEvidence")
      val api_receiptEvidence = parseStation_Cargo_Transfer_Verification_SupervisorWarehouseReceiptEvidenceType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_sessionExpectation")
      val api_sessionExpectation = parseStation_Cargo_Transfer_Verification_SupervisorSessionExpectationType()
      parser.parseObjectNext()
      return Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PS(api_receiptEvidence, api_sessionExpectation)
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container(): Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_P", "Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PS"))
      t.native match {
        case "Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_P" => val r = parseStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PT(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PS" => val r = parseStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PST(T); return r
        case _ => val r = parseStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PST(T); return r
      }
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_P(): Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_P = {
      val r = parseStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PT(F)
      return r
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_P")
      }
      parser.parseObjectKey("api_warehouseFinding")
      val api_warehouseFinding = parseStation_Cargo_Transfer_Verification_SupervisorWarehouseFindingType()
      parser.parseObjectNext()
      return Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_P(api_warehouseFinding)
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PS(): Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PS = {
      val r = parseStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PST(F)
      return r
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PST(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PS")
      }
      parser.parseObjectKey("api_warehouseFinding")
      val api_warehouseFinding = parseStation_Cargo_Transfer_Verification_SupervisorWarehouseFindingType()
      parser.parseObjectNext()
      return Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PS(api_warehouseFinding)
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container(): Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_P", "Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PS"))
      t.native match {
        case "Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_P" => val r = parseStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PT(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PS" => val r = parseStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PST(T); return r
        case _ => val r = parseStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PST(T); return r
      }
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_P(): Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_P = {
      val r = parseStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PT(F)
      return r
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_P")
      }
      parser.parseObjectKey("api_shipFinding")
      val api_shipFinding = parseStation_Cargo_Transfer_Verification_SupervisorShipFindingType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_warehouseFinding")
      val api_warehouseFinding = parseStation_Cargo_Transfer_Verification_SupervisorWarehouseFindingType()
      parser.parseObjectNext()
      return Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_P(api_shipFinding, api_warehouseFinding)
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PS(): Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PS = {
      val r = parseStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PST(F)
      return r
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PST(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PS")
      }
      parser.parseObjectKey("api_shipFinding")
      val api_shipFinding = parseStation_Cargo_Transfer_Verification_SupervisorShipFindingType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_warehouseFinding")
      val api_warehouseFinding = parseStation_Cargo_Transfer_Verification_SupervisorWarehouseFindingType()
      parser.parseObjectNext()
      return Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PS(api_shipFinding, api_warehouseFinding)
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container(): Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_P", "Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PS"))
      t.native match {
        case "Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_P" => val r = parseStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PT(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PS" => val r = parseStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PST(T); return r
        case _ => val r = parseStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PST(T); return r
      }
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_P(): Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_P = {
      val r = parseStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PT(F)
      return r
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_P")
      }
      parser.parseObjectKey("api_verificationDisposition")
      val api_verificationDisposition = parseStation_Cargo_Transfer_Verification_SupervisorVerificationDispositionType()
      parser.parseObjectNext()
      return Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_P(api_verificationDisposition)
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PS(): Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PS = {
      val r = parseStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PST(F)
      return r
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PST(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PS")
      }
      parser.parseObjectKey("api_verificationDisposition")
      val api_verificationDisposition = parseStation_Cargo_Transfer_Verification_SupervisorVerificationDispositionType()
      parser.parseObjectNext()
      return Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PS(api_verificationDisposition)
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container(): Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_P", "Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PS"))
      t.native match {
        case "Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_P" => val r = parseStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PT(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PS" => val r = parseStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PST(T); return r
        case _ => val r = parseStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PST(T); return r
      }
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_P(): Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_P = {
      val r = parseStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PT(F)
      return r
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_P")
      }
      parser.parseObjectKey("api_commandProposal")
      val api_commandProposal = parseStation_Cargo_Transfer_Verification_SupervisorCommandProposalType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_serviceEligibility")
      val api_serviceEligibility = parseStation_Cargo_Transfer_Verification_SupervisorServiceEligibilityType()
      parser.parseObjectNext()
      return Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_P(api_commandProposal, api_serviceEligibility)
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PS(): Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PS = {
      val r = parseStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PST(F)
      return r
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PST(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PS")
      }
      parser.parseObjectKey("api_commandProposal")
      val api_commandProposal = parseStation_Cargo_Transfer_Verification_SupervisorCommandProposalType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_serviceEligibility")
      val api_serviceEligibility = parseStation_Cargo_Transfer_Verification_SupervisorServiceEligibilityType()
      parser.parseObjectNext()
      return Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PS(api_commandProposal, api_serviceEligibility)
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container(): Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_P", "Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PS"))
      t.native match {
        case "Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_P" => val r = parseStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PT(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PS" => val r = parseStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PST(T); return r
        case _ => val r = parseStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PST(T); return r
      }
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_P(): Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_P = {
      val r = parseStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PT(F)
      return r
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_P")
      }
      parser.parseObjectKey("api_receiptQuery")
      val api_receiptQuery = parseStation_Cargo_Transfer_Verification_SupervisorWarehouseQueryType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_shipCommand")
      val api_shipCommand = parseStation_Cargo_Transfer_Verification_SupervisorShipCommandType()
      parser.parseObjectNext()
      return Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_P(api_receiptQuery, api_shipCommand)
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PS(): Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PS = {
      val r = parseStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PST(F)
      return r
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PST(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PS")
      }
      parser.parseObjectKey("api_receiptQuery")
      val api_receiptQuery = parseStation_Cargo_Transfer_Verification_SupervisorWarehouseQueryType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_shipCommand")
      val api_shipCommand = parseStation_Cargo_Transfer_Verification_SupervisorShipCommandType()
      parser.parseObjectNext()
      return Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PS(api_receiptQuery, api_shipCommand)
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container(): Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_P", "Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PS"))
      t.native match {
        case "Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_P" => val r = parseStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PT(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PS" => val r = parseStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PST(T); return r
        case _ => val r = parseStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PST(T); return r
      }
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_P(): Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_P = {
      val r = parseStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PT(F)
      return r
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_P")
      }
      parser.parseObjectKey("api_sessionSnapshot")
      val api_sessionSnapshot = parseStation_Cargo_Transfer_Verification_SupervisorSessionSnapshot()
      parser.parseObjectNext()
      return Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_P(api_sessionSnapshot)
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PS(): Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PS = {
      val r = parseStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PST(F)
      return r
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PST(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PS")
      }
      parser.parseObjectKey("api_sessionSnapshot")
      val api_sessionSnapshot = parseStation_Cargo_Transfer_Verification_SupervisorSessionSnapshot()
      parser.parseObjectNext()
      return Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PS(api_sessionSnapshot)
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container(): Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_P", "Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PS"))
      t.native match {
        case "Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_P" => val r = parseStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PT(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PS" => val r = parseStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PST(T); return r
        case _ => val r = parseStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PST(T); return r
      }
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_P(): Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_P = {
      val r = parseStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PT(F)
      return r
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_P")
      }
      parser.parseObjectKey("api_pilotReport")
      val api_pilotReport = parseStation_Cargo_Transfer_Verification_SupervisorPilotTransferReportType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_stationReport")
      val api_stationReport = parseStation_Cargo_Transfer_Verification_SupervisorStationTransferReportType()
      parser.parseObjectNext()
      return Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_P(api_pilotReport, api_stationReport)
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PS(): Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PS = {
      val r = parseStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PST(F)
      return r
    }

    def parseStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PST(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PS")
      }
      parser.parseObjectKey("api_pilotReport")
      val api_pilotReport = parseStation_Cargo_Transfer_Verification_SupervisorPilotTransferReportType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_stationReport")
      val api_stationReport = parseStation_Cargo_Transfer_Verification_SupervisorStationTransferReportType()
      parser.parseObjectNext()
      return Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PS(api_pilotReport, api_stationReport)
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
      val t = parser.parseObjectTypes(ISZ("util.EmptyContainer", "Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_P", "Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P", "Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PS", "Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS", "Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_P", "Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PS", "Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P", "Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS", "Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PreState_Container_P", "Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PS", "Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PostState_Container_P", "Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PS", "Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_P", "Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PreState_Container_P", "Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PS", "Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PreState_Container_PS", "Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_P", "Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PS", "Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PostState_Container_P", "Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PostState_Container_PS", "Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_P", "Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PS", "Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_P", "Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PS", "Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_P", "Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PS", "Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_P", "Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PS", "Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_P", "Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PS", "Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_P", "Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PS", "Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_P", "Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PS", "Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_P", "Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PS"))
      t.native match {
        case "util.EmptyContainer" => val r = parseutilEmptyContainerT(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_P" => val r = parseStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PT(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P" => val r = parseStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PT(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PS" => val r = parseStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PST(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS" => val r = parseStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PST(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_P" => val r = parseStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PT(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PS" => val r = parseStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PST(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P" => val r = parseStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PT(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS" => val r = parseStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PST(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PreState_Container_P" => val r = parseStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PT(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PS" => val r = parseStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PST(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PostState_Container_P" => val r = parseStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PT(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PS" => val r = parseStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PST(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_P" => val r = parseStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PT(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PreState_Container_P" => val r = parseStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_PT(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PS" => val r = parseStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PST(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PreState_Container_PS" => val r = parseStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_PST(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_P" => val r = parseStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PT(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PS" => val r = parseStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PST(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PostState_Container_P" => val r = parseStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_PT(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PostState_Container_PS" => val r = parseStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_PST(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_P" => val r = parseStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PT(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PS" => val r = parseStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PST(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_P" => val r = parseStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PT(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PS" => val r = parseStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PST(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_P" => val r = parseStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PT(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PS" => val r = parseStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PST(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_P" => val r = parseStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PT(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PS" => val r = parseStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PST(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_P" => val r = parseStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PT(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PS" => val r = parseStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PST(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_P" => val r = parseStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PT(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PS" => val r = parseStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PST(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_P" => val r = parseStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PT(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PS" => val r = parseStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PST(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_P" => val r = parseStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PT(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PS" => val r = parseStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PST(T); return r
        case _ => val r = parseStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PST(T); return r
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
      val t = parser.parseObjectTypes(ISZ("art.Empty", "Base_Types.Boolean_Payload", "Base_Types.Integer_Payload", "Base_Types.Integer_8_Payload", "Base_Types.Integer_16_Payload", "Base_Types.Integer_32_Payload", "Base_Types.Integer_64_Payload", "Base_Types.Unsigned_8_Payload", "Base_Types.Unsigned_16_Payload", "Base_Types.Unsigned_32_Payload", "Base_Types.Unsigned_64_Payload", "Base_Types.Float_Payload", "Base_Types.Float_32_Payload", "Base_Types.Float_64_Payload", "Base_Types.Character_Payload", "Base_Types.String_Payload", "Base_Types.Bits_Payload", "util.EmptyContainer", "Station_Cargo_Transfer_Verification_Supervisor.CargoState_Payload", "Station_Cargo_Transfer_Verification_Supervisor.ShipCommand_Payload", "Station_Cargo_Transfer_Verification_Supervisor.ShipFinding_Payload", "Station_Cargo_Transfer_Verification_Supervisor.SessionState_Payload", "Station_Cargo_Transfer_Verification_Supervisor.WarehouseQuery_Payload", "Station_Cargo_Transfer_Verification_Supervisor.CommandProposal_Payload", "Station_Cargo_Transfer_Verification_Supervisor.TransferRequest_Payload", "Station_Cargo_Transfer_Verification_Supervisor.SessionSnapshot_Payload", "Station_Cargo_Transfer_Verification_Supervisor.WarehouseFinding_Payload", "Station_Cargo_Transfer_Verification_Supervisor.QualifiedRequest_Payload", "Station_Cargo_Transfer_Verification_Supervisor.AdmittedDirective_Payload", "Station_Cargo_Transfer_Verification_Supervisor.SessionExpectation_Payload", "Station_Cargo_Transfer_Verification_Supervisor.ServiceEligibility_Payload", "Station_Cargo_Transfer_Verification_Supervisor.PilotTransferReport_Payload", "Station_Cargo_Transfer_Verification_Supervisor.ShipTransferEvidence_Payload", "Station_Cargo_Transfer_Verification_Supervisor.DockServiceCondition_Payload", "Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionState_Payload", "Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionResult_Payload", "Station_Cargo_Transfer_Verification_Supervisor.StationTransferReport_Payload", "Station_Cargo_Transfer_Verification_Supervisor.VerificationDisposition_Payload", "Station_Cargo_Transfer_Verification_Supervisor.WarehouseReceiptEvidence_Payload", "Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_P", "Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P", "Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PS", "Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS", "Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_P", "Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PS", "Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P", "Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS", "Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PreState_Container_P", "Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PS", "Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PostState_Container_P", "Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PS", "Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_P", "Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PreState_Container_P", "Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PS", "Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PreState_Container_PS", "Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_P", "Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PS", "Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PostState_Container_P", "Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PostState_Container_PS", "Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_P", "Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PS", "Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_P", "Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PS", "Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_P", "Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PS", "Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_P", "Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PS", "Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_P", "Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PS", "Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_P", "Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PS", "Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_P", "Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PS", "Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_P", "Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PS"))
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
        case "Station_Cargo_Transfer_Verification_Supervisor.CargoState_Payload" => val r = parseStation_Cargo_Transfer_Verification_SupervisorCargoState_PayloadT(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.ShipCommand_Payload" => val r = parseStation_Cargo_Transfer_Verification_SupervisorShipCommand_PayloadT(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.ShipFinding_Payload" => val r = parseStation_Cargo_Transfer_Verification_SupervisorShipFinding_PayloadT(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.SessionState_Payload" => val r = parseStation_Cargo_Transfer_Verification_SupervisorSessionState_PayloadT(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.WarehouseQuery_Payload" => val r = parseStation_Cargo_Transfer_Verification_SupervisorWarehouseQuery_PayloadT(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.CommandProposal_Payload" => val r = parseStation_Cargo_Transfer_Verification_SupervisorCommandProposal_PayloadT(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.TransferRequest_Payload" => val r = parseStation_Cargo_Transfer_Verification_SupervisorTransferRequest_PayloadT(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.SessionSnapshot_Payload" => val r = parseStation_Cargo_Transfer_Verification_SupervisorSessionSnapshot_PayloadT(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.WarehouseFinding_Payload" => val r = parseStation_Cargo_Transfer_Verification_SupervisorWarehouseFinding_PayloadT(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.QualifiedRequest_Payload" => val r = parseStation_Cargo_Transfer_Verification_SupervisorQualifiedRequest_PayloadT(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.AdmittedDirective_Payload" => val r = parseStation_Cargo_Transfer_Verification_SupervisorAdmittedDirective_PayloadT(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.SessionExpectation_Payload" => val r = parseStation_Cargo_Transfer_Verification_SupervisorSessionExpectation_PayloadT(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.ServiceEligibility_Payload" => val r = parseStation_Cargo_Transfer_Verification_SupervisorServiceEligibility_PayloadT(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.PilotTransferReport_Payload" => val r = parseStation_Cargo_Transfer_Verification_SupervisorPilotTransferReport_PayloadT(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.ShipTransferEvidence_Payload" => val r = parseStation_Cargo_Transfer_Verification_SupervisorShipTransferEvidence_PayloadT(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.DockServiceCondition_Payload" => val r = parseStation_Cargo_Transfer_Verification_SupervisorDockServiceCondition_PayloadT(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionState_Payload" => val r = parseStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionState_PayloadT(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionResult_Payload" => val r = parseStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionResult_PayloadT(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.StationTransferReport_Payload" => val r = parseStation_Cargo_Transfer_Verification_SupervisorStationTransferReport_PayloadT(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.VerificationDisposition_Payload" => val r = parseStation_Cargo_Transfer_Verification_SupervisorVerificationDisposition_PayloadT(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.WarehouseReceiptEvidence_Payload" => val r = parseStation_Cargo_Transfer_Verification_SupervisorWarehouseReceiptEvidence_PayloadT(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_P" => val r = parseStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PT(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P" => val r = parseStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PT(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PS" => val r = parseStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PST(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS" => val r = parseStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PST(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_P" => val r = parseStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PT(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PS" => val r = parseStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PST(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P" => val r = parseStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PT(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS" => val r = parseStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PST(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PreState_Container_P" => val r = parseStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PT(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PS" => val r = parseStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PST(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PostState_Container_P" => val r = parseStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PT(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PS" => val r = parseStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PST(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_P" => val r = parseStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PT(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PreState_Container_P" => val r = parseStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_PT(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PS" => val r = parseStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PST(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PreState_Container_PS" => val r = parseStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_PST(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_P" => val r = parseStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PT(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PS" => val r = parseStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PST(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PostState_Container_P" => val r = parseStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_PT(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PostState_Container_PS" => val r = parseStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_PST(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_P" => val r = parseStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PT(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PS" => val r = parseStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PST(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_P" => val r = parseStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PT(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PS" => val r = parseStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PST(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_P" => val r = parseStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PT(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PS" => val r = parseStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PST(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_P" => val r = parseStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PT(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PS" => val r = parseStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PST(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_P" => val r = parseStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PT(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PS" => val r = parseStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PST(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_P" => val r = parseStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PT(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PS" => val r = parseStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PST(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_P" => val r = parseStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PT(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PS" => val r = parseStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PST(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_P" => val r = parseStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PT(T); return r
        case "Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PS" => val r = parseStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PST(T); return r
        case _ => val r = parseStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PST(T); return r
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

  def fromStation_Cargo_Transfer_Verification_SupervisorTransferRequest_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.TransferRequest_Payload, isCompact: B): String = {
    val st = Printer.printStation_Cargo_Transfer_Verification_SupervisorTransferRequest_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toStation_Cargo_Transfer_Verification_SupervisorTransferRequest_Payload(s: String): Either[Station_Cargo_Transfer_Verification_Supervisor.TransferRequest_Payload, Json.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorTransferRequest_Payload(parser: Parser): Station_Cargo_Transfer_Verification_Supervisor.TransferRequest_Payload = {
      val r = parser.parseStation_Cargo_Transfer_Verification_SupervisorTransferRequest_Payload()
      return r
    }
    val r = to(s, fStation_Cargo_Transfer_Verification_SupervisorTransferRequest_Payload _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorCargoState_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.CargoState_Payload, isCompact: B): String = {
    val st = Printer.printStation_Cargo_Transfer_Verification_SupervisorCargoState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toStation_Cargo_Transfer_Verification_SupervisorCargoState_Payload(s: String): Either[Station_Cargo_Transfer_Verification_Supervisor.CargoState_Payload, Json.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorCargoState_Payload(parser: Parser): Station_Cargo_Transfer_Verification_Supervisor.CargoState_Payload = {
      val r = parser.parseStation_Cargo_Transfer_Verification_SupervisorCargoState_Payload()
      return r
    }
    val r = to(s, fStation_Cargo_Transfer_Verification_SupervisorCargoState_Payload _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorQualifiedRequest_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.QualifiedRequest_Payload, isCompact: B): String = {
    val st = Printer.printStation_Cargo_Transfer_Verification_SupervisorQualifiedRequest_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toStation_Cargo_Transfer_Verification_SupervisorQualifiedRequest_Payload(s: String): Either[Station_Cargo_Transfer_Verification_Supervisor.QualifiedRequest_Payload, Json.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorQualifiedRequest_Payload(parser: Parser): Station_Cargo_Transfer_Verification_Supervisor.QualifiedRequest_Payload = {
      val r = parser.parseStation_Cargo_Transfer_Verification_SupervisorQualifiedRequest_Payload()
      return r
    }
    val r = to(s, fStation_Cargo_Transfer_Verification_SupervisorQualifiedRequest_Payload _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorDockServiceCondition_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.DockServiceCondition_Payload, isCompact: B): String = {
    val st = Printer.printStation_Cargo_Transfer_Verification_SupervisorDockServiceCondition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toStation_Cargo_Transfer_Verification_SupervisorDockServiceCondition_Payload(s: String): Either[Station_Cargo_Transfer_Verification_Supervisor.DockServiceCondition_Payload, Json.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorDockServiceCondition_Payload(parser: Parser): Station_Cargo_Transfer_Verification_Supervisor.DockServiceCondition_Payload = {
      val r = parser.parseStation_Cargo_Transfer_Verification_SupervisorDockServiceCondition_Payload()
      return r
    }
    val r = to(s, fStation_Cargo_Transfer_Verification_SupervisorDockServiceCondition_Payload _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorServiceEligibility_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.ServiceEligibility_Payload, isCompact: B): String = {
    val st = Printer.printStation_Cargo_Transfer_Verification_SupervisorServiceEligibility_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toStation_Cargo_Transfer_Verification_SupervisorServiceEligibility_Payload(s: String): Either[Station_Cargo_Transfer_Verification_Supervisor.ServiceEligibility_Payload, Json.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorServiceEligibility_Payload(parser: Parser): Station_Cargo_Transfer_Verification_Supervisor.ServiceEligibility_Payload = {
      val r = parser.parseStation_Cargo_Transfer_Verification_SupervisorServiceEligibility_Payload()
      return r
    }
    val r = to(s, fStation_Cargo_Transfer_Verification_SupervisorServiceEligibility_Payload _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorSessionState_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.SessionState_Payload, isCompact: B): String = {
    val st = Printer.printStation_Cargo_Transfer_Verification_SupervisorSessionState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toStation_Cargo_Transfer_Verification_SupervisorSessionState_Payload(s: String): Either[Station_Cargo_Transfer_Verification_Supervisor.SessionState_Payload, Json.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorSessionState_Payload(parser: Parser): Station_Cargo_Transfer_Verification_Supervisor.SessionState_Payload = {
      val r = parser.parseStation_Cargo_Transfer_Verification_SupervisorSessionState_Payload()
      return r
    }
    val r = to(s, fStation_Cargo_Transfer_Verification_SupervisorSessionState_Payload _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorAdmittedDirective_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.AdmittedDirective_Payload, isCompact: B): String = {
    val st = Printer.printStation_Cargo_Transfer_Verification_SupervisorAdmittedDirective_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toStation_Cargo_Transfer_Verification_SupervisorAdmittedDirective_Payload(s: String): Either[Station_Cargo_Transfer_Verification_Supervisor.AdmittedDirective_Payload, Json.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorAdmittedDirective_Payload(parser: Parser): Station_Cargo_Transfer_Verification_Supervisor.AdmittedDirective_Payload = {
      val r = parser.parseStation_Cargo_Transfer_Verification_SupervisorAdmittedDirective_Payload()
      return r
    }
    val r = to(s, fStation_Cargo_Transfer_Verification_SupervisorAdmittedDirective_Payload _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorVerificationDisposition_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.VerificationDisposition_Payload, isCompact: B): String = {
    val st = Printer.printStation_Cargo_Transfer_Verification_SupervisorVerificationDisposition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toStation_Cargo_Transfer_Verification_SupervisorVerificationDisposition_Payload(s: String): Either[Station_Cargo_Transfer_Verification_Supervisor.VerificationDisposition_Payload, Json.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorVerificationDisposition_Payload(parser: Parser): Station_Cargo_Transfer_Verification_Supervisor.VerificationDisposition_Payload = {
      val r = parser.parseStation_Cargo_Transfer_Verification_SupervisorVerificationDisposition_Payload()
      return r
    }
    val r = to(s, fStation_Cargo_Transfer_Verification_SupervisorVerificationDisposition_Payload _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorSessionExpectation_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.SessionExpectation_Payload, isCompact: B): String = {
    val st = Printer.printStation_Cargo_Transfer_Verification_SupervisorSessionExpectation_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toStation_Cargo_Transfer_Verification_SupervisorSessionExpectation_Payload(s: String): Either[Station_Cargo_Transfer_Verification_Supervisor.SessionExpectation_Payload, Json.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorSessionExpectation_Payload(parser: Parser): Station_Cargo_Transfer_Verification_Supervisor.SessionExpectation_Payload = {
      val r = parser.parseStation_Cargo_Transfer_Verification_SupervisorSessionExpectation_Payload()
      return r
    }
    val r = to(s, fStation_Cargo_Transfer_Verification_SupervisorSessionExpectation_Payload _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorCommandProposal_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.CommandProposal_Payload, isCompact: B): String = {
    val st = Printer.printStation_Cargo_Transfer_Verification_SupervisorCommandProposal_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toStation_Cargo_Transfer_Verification_SupervisorCommandProposal_Payload(s: String): Either[Station_Cargo_Transfer_Verification_Supervisor.CommandProposal_Payload, Json.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorCommandProposal_Payload(parser: Parser): Station_Cargo_Transfer_Verification_Supervisor.CommandProposal_Payload = {
      val r = parser.parseStation_Cargo_Transfer_Verification_SupervisorCommandProposal_Payload()
      return r
    }
    val r = to(s, fStation_Cargo_Transfer_Verification_SupervisorCommandProposal_Payload _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionState_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionState_Payload, isCompact: B): String = {
    val st = Printer.printStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionState_Payload(s: String): Either[Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionState_Payload, Json.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionState_Payload(parser: Parser): Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionState_Payload = {
      val r = parser.parseStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionState_Payload()
      return r
    }
    val r = to(s, fStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionState_Payload _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionResult_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionResult_Payload, isCompact: B): String = {
    val st = Printer.printStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionResult_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionResult_Payload(s: String): Either[Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionResult_Payload, Json.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionResult_Payload(parser: Parser): Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionResult_Payload = {
      val r = parser.parseStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionResult_Payload()
      return r
    }
    val r = to(s, fStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionResult_Payload _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorShipTransferEvidence_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.ShipTransferEvidence_Payload, isCompact: B): String = {
    val st = Printer.printStation_Cargo_Transfer_Verification_SupervisorShipTransferEvidence_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toStation_Cargo_Transfer_Verification_SupervisorShipTransferEvidence_Payload(s: String): Either[Station_Cargo_Transfer_Verification_Supervisor.ShipTransferEvidence_Payload, Json.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorShipTransferEvidence_Payload(parser: Parser): Station_Cargo_Transfer_Verification_Supervisor.ShipTransferEvidence_Payload = {
      val r = parser.parseStation_Cargo_Transfer_Verification_SupervisorShipTransferEvidence_Payload()
      return r
    }
    val r = to(s, fStation_Cargo_Transfer_Verification_SupervisorShipTransferEvidence_Payload _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorShipFinding_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.ShipFinding_Payload, isCompact: B): String = {
    val st = Printer.printStation_Cargo_Transfer_Verification_SupervisorShipFinding_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toStation_Cargo_Transfer_Verification_SupervisorShipFinding_Payload(s: String): Either[Station_Cargo_Transfer_Verification_Supervisor.ShipFinding_Payload, Json.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorShipFinding_Payload(parser: Parser): Station_Cargo_Transfer_Verification_Supervisor.ShipFinding_Payload = {
      val r = parser.parseStation_Cargo_Transfer_Verification_SupervisorShipFinding_Payload()
      return r
    }
    val r = to(s, fStation_Cargo_Transfer_Verification_SupervisorShipFinding_Payload _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorWarehouseReceiptEvidence_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.WarehouseReceiptEvidence_Payload, isCompact: B): String = {
    val st = Printer.printStation_Cargo_Transfer_Verification_SupervisorWarehouseReceiptEvidence_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toStation_Cargo_Transfer_Verification_SupervisorWarehouseReceiptEvidence_Payload(s: String): Either[Station_Cargo_Transfer_Verification_Supervisor.WarehouseReceiptEvidence_Payload, Json.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorWarehouseReceiptEvidence_Payload(parser: Parser): Station_Cargo_Transfer_Verification_Supervisor.WarehouseReceiptEvidence_Payload = {
      val r = parser.parseStation_Cargo_Transfer_Verification_SupervisorWarehouseReceiptEvidence_Payload()
      return r
    }
    val r = to(s, fStation_Cargo_Transfer_Verification_SupervisorWarehouseReceiptEvidence_Payload _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorWarehouseFinding_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.WarehouseFinding_Payload, isCompact: B): String = {
    val st = Printer.printStation_Cargo_Transfer_Verification_SupervisorWarehouseFinding_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toStation_Cargo_Transfer_Verification_SupervisorWarehouseFinding_Payload(s: String): Either[Station_Cargo_Transfer_Verification_Supervisor.WarehouseFinding_Payload, Json.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorWarehouseFinding_Payload(parser: Parser): Station_Cargo_Transfer_Verification_Supervisor.WarehouseFinding_Payload = {
      val r = parser.parseStation_Cargo_Transfer_Verification_SupervisorWarehouseFinding_Payload()
      return r
    }
    val r = to(s, fStation_Cargo_Transfer_Verification_SupervisorWarehouseFinding_Payload _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorShipCommand_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.ShipCommand_Payload, isCompact: B): String = {
    val st = Printer.printStation_Cargo_Transfer_Verification_SupervisorShipCommand_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toStation_Cargo_Transfer_Verification_SupervisorShipCommand_Payload(s: String): Either[Station_Cargo_Transfer_Verification_Supervisor.ShipCommand_Payload, Json.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorShipCommand_Payload(parser: Parser): Station_Cargo_Transfer_Verification_Supervisor.ShipCommand_Payload = {
      val r = parser.parseStation_Cargo_Transfer_Verification_SupervisorShipCommand_Payload()
      return r
    }
    val r = to(s, fStation_Cargo_Transfer_Verification_SupervisorShipCommand_Payload _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorWarehouseQuery_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.WarehouseQuery_Payload, isCompact: B): String = {
    val st = Printer.printStation_Cargo_Transfer_Verification_SupervisorWarehouseQuery_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toStation_Cargo_Transfer_Verification_SupervisorWarehouseQuery_Payload(s: String): Either[Station_Cargo_Transfer_Verification_Supervisor.WarehouseQuery_Payload, Json.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorWarehouseQuery_Payload(parser: Parser): Station_Cargo_Transfer_Verification_Supervisor.WarehouseQuery_Payload = {
      val r = parser.parseStation_Cargo_Transfer_Verification_SupervisorWarehouseQuery_Payload()
      return r
    }
    val r = to(s, fStation_Cargo_Transfer_Verification_SupervisorWarehouseQuery_Payload _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorPilotTransferReport_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.PilotTransferReport_Payload, isCompact: B): String = {
    val st = Printer.printStation_Cargo_Transfer_Verification_SupervisorPilotTransferReport_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toStation_Cargo_Transfer_Verification_SupervisorPilotTransferReport_Payload(s: String): Either[Station_Cargo_Transfer_Verification_Supervisor.PilotTransferReport_Payload, Json.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorPilotTransferReport_Payload(parser: Parser): Station_Cargo_Transfer_Verification_Supervisor.PilotTransferReport_Payload = {
      val r = parser.parseStation_Cargo_Transfer_Verification_SupervisorPilotTransferReport_Payload()
      return r
    }
    val r = to(s, fStation_Cargo_Transfer_Verification_SupervisorPilotTransferReport_Payload _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorStationTransferReport_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.StationTransferReport_Payload, isCompact: B): String = {
    val st = Printer.printStation_Cargo_Transfer_Verification_SupervisorStationTransferReport_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toStation_Cargo_Transfer_Verification_SupervisorStationTransferReport_Payload(s: String): Either[Station_Cargo_Transfer_Verification_Supervisor.StationTransferReport_Payload, Json.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorStationTransferReport_Payload(parser: Parser): Station_Cargo_Transfer_Verification_Supervisor.StationTransferReport_Payload = {
      val r = parser.parseStation_Cargo_Transfer_Verification_SupervisorStationTransferReport_Payload()
      return r
    }
    val r = to(s, fStation_Cargo_Transfer_Verification_SupervisorStationTransferReport_Payload _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorSessionSnapshot(o: Station_Cargo_Transfer_Verification_Supervisor.SessionSnapshot, isCompact: B): String = {
    val st = Printer.printStation_Cargo_Transfer_Verification_SupervisorSessionSnapshot(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toStation_Cargo_Transfer_Verification_SupervisorSessionSnapshot(s: String): Either[Station_Cargo_Transfer_Verification_Supervisor.SessionSnapshot, Json.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorSessionSnapshot(parser: Parser): Station_Cargo_Transfer_Verification_Supervisor.SessionSnapshot = {
      val r = parser.parseStation_Cargo_Transfer_Verification_SupervisorSessionSnapshot()
      return r
    }
    val r = to(s, fStation_Cargo_Transfer_Verification_SupervisorSessionSnapshot _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorSessionSnapshot_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.SessionSnapshot_Payload, isCompact: B): String = {
    val st = Printer.printStation_Cargo_Transfer_Verification_SupervisorSessionSnapshot_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toStation_Cargo_Transfer_Verification_SupervisorSessionSnapshot_Payload(s: String): Either[Station_Cargo_Transfer_Verification_Supervisor.SessionSnapshot_Payload, Json.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorSessionSnapshot_Payload(parser: Parser): Station_Cargo_Transfer_Verification_Supervisor.SessionSnapshot_Payload = {
      val r = parser.parseStation_Cargo_Transfer_Verification_SupervisorSessionSnapshot_Payload()
      return r
    }
    val r = to(s, fStation_Cargo_Transfer_Verification_SupervisorSessionSnapshot_Payload _)
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

  def fromStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container(o: Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PreState_Container, isCompact: B): String = {
    val st = Printer.printStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container(s: String): Either[Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PreState_Container, Json.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container(parser: Parser): Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PreState_Container = {
      val r = parser.parseStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container()
      return r
    }
    val r = to(s, fStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_P(o: Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_P(s: String): Either[Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PreState_Container_P, Json.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_P(parser: Parser): Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PreState_Container_P = {
      val r = parser.parseStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_P()
      return r
    }
    val r = to(s, fStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_P _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PS(o: Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PS(s: String): Either[Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PS, Json.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PS(parser: Parser): Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PS = {
      val r = parser.parseStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PS()
      return r
    }
    val r = to(s, fStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PS _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container(o: Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PostState_Container, isCompact: B): String = {
    val st = Printer.printStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container(s: String): Either[Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PostState_Container, Json.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container(parser: Parser): Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PostState_Container = {
      val r = parser.parseStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container()
      return r
    }
    val r = to(s, fStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_P(o: Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_P(s: String): Either[Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PostState_Container_P, Json.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_P(parser: Parser): Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PostState_Container_P = {
      val r = parser.parseStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_P()
      return r
    }
    val r = to(s, fStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_P _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PS(o: Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PS(s: String): Either[Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PS, Json.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PS(parser: Parser): Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PS = {
      val r = parser.parseStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PS()
      return r
    }
    val r = to(s, fStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PS _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container(o: Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container, isCompact: B): String = {
    val st = Printer.printStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container(s: String): Either[Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container, Json.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container(parser: Parser): Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container = {
      val r = parser.parseStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container()
      return r
    }
    val r = to(s, fStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_P(o: Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_P(s: String): Either[Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_P, Json.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_P(parser: Parser): Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_P = {
      val r = parser.parseStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_P()
      return r
    }
    val r = to(s, fStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_P _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PS(o: Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PS(s: String): Either[Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PS, Json.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PS(parser: Parser): Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PS = {
      val r = parser.parseStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PS()
      return r
    }
    val r = to(s, fStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PS _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container(o: Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container, isCompact: B): String = {
    val st = Printer.printStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container(s: String): Either[Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container, Json.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container(parser: Parser): Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container = {
      val r = parser.parseStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container()
      return r
    }
    val r = to(s, fStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_P(o: Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_P(s: String): Either[Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_P, Json.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_P(parser: Parser): Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_P = {
      val r = parser.parseStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_P()
      return r
    }
    val r = to(s, fStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_P _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PS(o: Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PS(s: String): Either[Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PS, Json.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PS(parser: Parser): Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PS = {
      val r = parser.parseStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PS()
      return r
    }
    val r = to(s, fStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PS _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container(o: Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container, isCompact: B): String = {
    val st = Printer.printStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container(s: String): Either[Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container, Json.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container(parser: Parser): Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container = {
      val r = parser.parseStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container()
      return r
    }
    val r = to(s, fStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P(o: Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P(s: String): Either[Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P, Json.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P(parser: Parser): Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P = {
      val r = parser.parseStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P()
      return r
    }
    val r = to(s, fStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS(o: Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS(s: String): Either[Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS, Json.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS(parser: Parser): Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS = {
      val r = parser.parseStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS()
      return r
    }
    val r = to(s, fStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container(o: Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container, isCompact: B): String = {
    val st = Printer.printStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container(s: String): Either[Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container, Json.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container(parser: Parser): Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container = {
      val r = parser.parseStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container()
      return r
    }
    val r = to(s, fStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P(o: Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P(s: String): Either[Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P, Json.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P(parser: Parser): Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P = {
      val r = parser.parseStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P()
      return r
    }
    val r = to(s, fStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS(o: Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS(s: String): Either[Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS, Json.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS(parser: Parser): Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS = {
      val r = parser.parseStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS()
      return r
    }
    val r = to(s, fStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container(o: Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PreState_Container, isCompact: B): String = {
    val st = Printer.printStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container(s: String): Either[Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PreState_Container, Json.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container(parser: Parser): Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PreState_Container = {
      val r = parser.parseStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container()
      return r
    }
    val r = to(s, fStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_P(o: Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_P(s: String): Either[Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PreState_Container_P, Json.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_P(parser: Parser): Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PreState_Container_P = {
      val r = parser.parseStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_P()
      return r
    }
    val r = to(s, fStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_P _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_PS(o: Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_PS(s: String): Either[Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PreState_Container_PS, Json.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_PS(parser: Parser): Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PreState_Container_PS = {
      val r = parser.parseStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_PS()
      return r
    }
    val r = to(s, fStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_PS _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container(o: Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PostState_Container, isCompact: B): String = {
    val st = Printer.printStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container(s: String): Either[Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PostState_Container, Json.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container(parser: Parser): Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PostState_Container = {
      val r = parser.parseStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container()
      return r
    }
    val r = to(s, fStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_P(o: Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_P(s: String): Either[Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PostState_Container_P, Json.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_P(parser: Parser): Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PostState_Container_P = {
      val r = parser.parseStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_P()
      return r
    }
    val r = to(s, fStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_P _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_PS(o: Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_PS(s: String): Either[Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PostState_Container_PS, Json.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_PS(parser: Parser): Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PostState_Container_PS = {
      val r = parser.parseStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_PS()
      return r
    }
    val r = to(s, fStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_PS _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container(o: Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container, isCompact: B): String = {
    val st = Printer.printStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container(s: String): Either[Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container, Json.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container(parser: Parser): Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container = {
      val r = parser.parseStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container()
      return r
    }
    val r = to(s, fStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_P(o: Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_P(s: String): Either[Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_P, Json.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_P(parser: Parser): Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_P = {
      val r = parser.parseStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_P()
      return r
    }
    val r = to(s, fStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_P _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PS(o: Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PS(s: String): Either[Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PS, Json.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PS(parser: Parser): Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PS = {
      val r = parser.parseStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PS()
      return r
    }
    val r = to(s, fStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PS _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container(o: Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container, isCompact: B): String = {
    val st = Printer.printStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container(s: String): Either[Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container, Json.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container(parser: Parser): Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container = {
      val r = parser.parseStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container()
      return r
    }
    val r = to(s, fStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_P(o: Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_P(s: String): Either[Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_P, Json.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_P(parser: Parser): Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_P = {
      val r = parser.parseStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_P()
      return r
    }
    val r = to(s, fStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_P _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PS(o: Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PS(s: String): Either[Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PS, Json.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PS(parser: Parser): Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PS = {
      val r = parser.parseStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PS()
      return r
    }
    val r = to(s, fStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PS _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container(o: Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container, isCompact: B): String = {
    val st = Printer.printStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container(s: String): Either[Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container, Json.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container(parser: Parser): Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container = {
      val r = parser.parseStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container()
      return r
    }
    val r = to(s, fStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_P(o: Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_P(s: String): Either[Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_P, Json.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_P(parser: Parser): Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_P = {
      val r = parser.parseStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_P()
      return r
    }
    val r = to(s, fStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_P _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PS(o: Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PS(s: String): Either[Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PS, Json.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PS(parser: Parser): Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PS = {
      val r = parser.parseStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PS()
      return r
    }
    val r = to(s, fStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PS _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container(o: Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container, isCompact: B): String = {
    val st = Printer.printStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container(s: String): Either[Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container, Json.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container(parser: Parser): Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container = {
      val r = parser.parseStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container()
      return r
    }
    val r = to(s, fStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_P(o: Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_P(s: String): Either[Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_P, Json.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_P(parser: Parser): Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_P = {
      val r = parser.parseStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_P()
      return r
    }
    val r = to(s, fStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_P _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PS(o: Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PS(s: String): Either[Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PS, Json.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PS(parser: Parser): Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PS = {
      val r = parser.parseStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PS()
      return r
    }
    val r = to(s, fStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PS _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container(o: Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PreState_Container, isCompact: B): String = {
    val st = Printer.printStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container(s: String): Either[Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PreState_Container, Json.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container(parser: Parser): Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PreState_Container = {
      val r = parser.parseStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container()
      return r
    }
    val r = to(s, fStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_P(o: Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_P(s: String): Either[Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_P, Json.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_P(parser: Parser): Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_P = {
      val r = parser.parseStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_P()
      return r
    }
    val r = to(s, fStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_P _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PS(o: Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PS(s: String): Either[Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PS, Json.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PS(parser: Parser): Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PS = {
      val r = parser.parseStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PS()
      return r
    }
    val r = to(s, fStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PS _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container(o: Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PostState_Container, isCompact: B): String = {
    val st = Printer.printStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container(s: String): Either[Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PostState_Container, Json.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container(parser: Parser): Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PostState_Container = {
      val r = parser.parseStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container()
      return r
    }
    val r = to(s, fStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_P(o: Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_P(s: String): Either[Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_P, Json.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_P(parser: Parser): Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_P = {
      val r = parser.parseStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_P()
      return r
    }
    val r = to(s, fStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_P _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PS(o: Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PS(s: String): Either[Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PS, Json.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PS(parser: Parser): Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PS = {
      val r = parser.parseStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PS()
      return r
    }
    val r = to(s, fStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PS _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container(o: Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container, isCompact: B): String = {
    val st = Printer.printStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container(s: String): Either[Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container, Json.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container(parser: Parser): Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container = {
      val r = parser.parseStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container()
      return r
    }
    val r = to(s, fStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_P(o: Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_P(s: String): Either[Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_P, Json.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_P(parser: Parser): Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_P = {
      val r = parser.parseStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_P()
      return r
    }
    val r = to(s, fStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_P _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PS(o: Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PS(s: String): Either[Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PS, Json.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PS(parser: Parser): Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PS = {
      val r = parser.parseStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PS()
      return r
    }
    val r = to(s, fStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PS _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container(o: Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container, isCompact: B): String = {
    val st = Printer.printStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container(s: String): Either[Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container, Json.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container(parser: Parser): Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container = {
      val r = parser.parseStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container()
      return r
    }
    val r = to(s, fStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_P(o: Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_P(s: String): Either[Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_P, Json.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_P(parser: Parser): Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_P = {
      val r = parser.parseStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_P()
      return r
    }
    val r = to(s, fStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_P _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PS(o: Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PS(s: String): Either[Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PS, Json.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PS(parser: Parser): Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PS = {
      val r = parser.parseStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PS()
      return r
    }
    val r = to(s, fStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PS _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container(o: Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container, isCompact: B): String = {
    val st = Printer.printStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container(s: String): Either[Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container, Json.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container(parser: Parser): Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container = {
      val r = parser.parseStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container()
      return r
    }
    val r = to(s, fStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_P(o: Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_P(s: String): Either[Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_P, Json.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_P(parser: Parser): Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_P = {
      val r = parser.parseStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_P()
      return r
    }
    val r = to(s, fStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_P _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PS(o: Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PS(s: String): Either[Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PS, Json.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PS(parser: Parser): Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PS = {
      val r = parser.parseStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PS()
      return r
    }
    val r = to(s, fStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PS _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container(o: Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container, isCompact: B): String = {
    val st = Printer.printStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container(s: String): Either[Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container, Json.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container(parser: Parser): Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container = {
      val r = parser.parseStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container()
      return r
    }
    val r = to(s, fStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_P(o: Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_P(s: String): Either[Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_P, Json.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_P(parser: Parser): Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_P = {
      val r = parser.parseStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_P()
      return r
    }
    val r = to(s, fStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_P _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PS(o: Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PS(s: String): Either[Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PS, Json.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PS(parser: Parser): Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PS = {
      val r = parser.parseStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PS()
      return r
    }
    val r = to(s, fStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PS _)
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