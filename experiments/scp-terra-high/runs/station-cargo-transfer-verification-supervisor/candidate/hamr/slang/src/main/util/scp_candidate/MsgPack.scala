// #Sireum
// @formatter:off

// This file is auto-generated from TransferRequest.scala, CargoState.scala, QualifiedRequest.scala, DockServiceCondition.scala, ServiceEligibility.scala, SessionState.scala, AdmittedDirective.scala, VerificationDisposition.scala, SessionExpectation.scala, CommandProposal.scala, SnapshotSessionState.scala, SnapshotSessionResult.scala, ShipTransferEvidence.scala, ShipFinding.scala, WarehouseReceiptEvidence.scala, WarehouseFinding.scala, ShipCommand.scala, WarehouseQuery.scala, PilotTransferReport.scala, StationTransferReport.scala, SessionSnapshot.scala, Base_Types.scala, RequestQualifier_supervisorProcess_requestQualifier_Containers.scala, ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_Containers.scala, PriorityArbiter_supervisorProcess_priorityArbiter_Containers.scala, SessionController_supervisorProcess_sessionController_Containers.scala, ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_Containers.scala, WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_Containers.scala, CompletionReconciler_supervisorProcess_completionReconciler_Containers.scala, CommandSafetyGate_supervisorProcess_commandSafetyGate_Containers.scala, OutcomeReporter_supervisorProcess_outcomeReporter_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package scp_candidate

import org.sireum._

object MsgPack {

  object Constants {

    val Station_Cargo_Transfer_Verification_SupervisorTransferRequest_Payload: Z = -32

    val Station_Cargo_Transfer_Verification_SupervisorCargoState_Payload: Z = -31

    val Station_Cargo_Transfer_Verification_SupervisorQualifiedRequest_Payload: Z = -30

    val Station_Cargo_Transfer_Verification_SupervisorDockServiceCondition_Payload: Z = -29

    val Station_Cargo_Transfer_Verification_SupervisorServiceEligibility_Payload: Z = -28

    val Station_Cargo_Transfer_Verification_SupervisorSessionState_Payload: Z = -27

    val Station_Cargo_Transfer_Verification_SupervisorAdmittedDirective_Payload: Z = -26

    val Station_Cargo_Transfer_Verification_SupervisorVerificationDisposition_Payload: Z = -25

    val Station_Cargo_Transfer_Verification_SupervisorSessionExpectation_Payload: Z = -24

    val Station_Cargo_Transfer_Verification_SupervisorCommandProposal_Payload: Z = -23

    val Station_Cargo_Transfer_Verification_SupervisorSnapshotSessionState_Payload: Z = -22

    val Station_Cargo_Transfer_Verification_SupervisorSnapshotSessionResult_Payload: Z = -21

    val Station_Cargo_Transfer_Verification_SupervisorShipTransferEvidence_Payload: Z = -20

    val Station_Cargo_Transfer_Verification_SupervisorShipFinding_Payload: Z = -19

    val Station_Cargo_Transfer_Verification_SupervisorWarehouseReceiptEvidence_Payload: Z = -18

    val Station_Cargo_Transfer_Verification_SupervisorWarehouseFinding_Payload: Z = -17

    val Station_Cargo_Transfer_Verification_SupervisorShipCommand_Payload: Z = -16

    val Station_Cargo_Transfer_Verification_SupervisorWarehouseQuery_Payload: Z = -15

    val Station_Cargo_Transfer_Verification_SupervisorPilotTransferReport_Payload: Z = -14

    val Station_Cargo_Transfer_Verification_SupervisorStationTransferReport_Payload: Z = -13

    val Station_Cargo_Transfer_Verification_SupervisorSessionSnapshot: Z = -12

    val Station_Cargo_Transfer_Verification_SupervisorSessionSnapshot_Payload: Z = -11

    val Base_TypesBoolean_Payload: Z = -10

    val Base_TypesInteger_Payload: Z = -9

    val Base_TypesInteger_8_Payload: Z = -8

    val Base_TypesInteger_16_Payload: Z = -7

    val Base_TypesInteger_32_Payload: Z = -6

    val Base_TypesInteger_64_Payload: Z = -5

    val Base_TypesUnsigned_8_Payload: Z = -4

    val Base_TypesUnsigned_16_Payload: Z = -3

    val Base_TypesUnsigned_32_Payload: Z = -2

    val Base_TypesUnsigned_64_Payload: Z = -1

    val Base_TypesFloat_Payload: Z = 0

    val Base_TypesFloat_32_Payload: Z = 1

    val Base_TypesFloat_64_Payload: Z = 2

    val Base_TypesCharacter_Payload: Z = 3

    val Base_TypesString_Payload: Z = 4

    val Base_TypesBits_Payload: Z = 5

    val Station_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_P: Z = 6

    val Station_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PS: Z = 7

    val Station_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_P: Z = 8

    val Station_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PS: Z = 9

    val Station_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_P: Z = 10

    val Station_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PS: Z = 11

    val Station_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_P: Z = 12

    val Station_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PS: Z = 13

    val Station_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P: Z = 14

    val Station_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS: Z = 15

    val Station_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P: Z = 16

    val Station_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS: Z = 17

    val Station_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_P: Z = 18

    val Station_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_PS: Z = 19

    val Station_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_P: Z = 20

    val Station_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_PS: Z = 21

    val Station_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_P: Z = 22

    val Station_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PS: Z = 23

    val Station_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_P: Z = 24

    val Station_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PS: Z = 25

    val Station_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_P: Z = 26

    val Station_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PS: Z = 27

    val Station_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_P: Z = 28

    val Station_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PS: Z = 29

    val Station_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_P: Z = 30

    val Station_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PS: Z = 31

    val Station_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_P: Z = 32

    val Station_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PS: Z = 33

    val Station_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_P: Z = 34

    val Station_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PS: Z = 35

    val Station_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_P: Z = 36

    val Station_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PS: Z = 37

    val Station_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_P: Z = 38

    val Station_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PS: Z = 39

    val Station_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_P: Z = 40

    val Station_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PS: Z = 41

    val utilEmptyContainer: Z = 42

    val _artEmpty: Z = 43

  }

  object Writer {

    @record class Default(val writer: MessagePack.Writer.Impl) extends Writer

  }

  @msig trait Writer {

    def writer: MessagePack.Writer

    def writeStation_Cargo_Transfer_Verification_SupervisorTransferRequestType(o: Station_Cargo_Transfer_Verification_Supervisor.TransferRequest.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorTransferRequest_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.TransferRequest_Payload): Unit = {
      writer.writeZ(Constants.Station_Cargo_Transfer_Verification_SupervisorTransferRequest_Payload)
      writeStation_Cargo_Transfer_Verification_SupervisorTransferRequestType(o.value)
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorCargoStateType(o: Station_Cargo_Transfer_Verification_Supervisor.CargoState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorCargoState_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.CargoState_Payload): Unit = {
      writer.writeZ(Constants.Station_Cargo_Transfer_Verification_SupervisorCargoState_Payload)
      writeStation_Cargo_Transfer_Verification_SupervisorCargoStateType(o.value)
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorQualifiedRequestType(o: Station_Cargo_Transfer_Verification_Supervisor.QualifiedRequest.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorQualifiedRequest_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.QualifiedRequest_Payload): Unit = {
      writer.writeZ(Constants.Station_Cargo_Transfer_Verification_SupervisorQualifiedRequest_Payload)
      writeStation_Cargo_Transfer_Verification_SupervisorQualifiedRequestType(o.value)
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorDockServiceConditionType(o: Station_Cargo_Transfer_Verification_Supervisor.DockServiceCondition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorDockServiceCondition_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.DockServiceCondition_Payload): Unit = {
      writer.writeZ(Constants.Station_Cargo_Transfer_Verification_SupervisorDockServiceCondition_Payload)
      writeStation_Cargo_Transfer_Verification_SupervisorDockServiceConditionType(o.value)
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorServiceEligibilityType(o: Station_Cargo_Transfer_Verification_Supervisor.ServiceEligibility.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorServiceEligibility_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.ServiceEligibility_Payload): Unit = {
      writer.writeZ(Constants.Station_Cargo_Transfer_Verification_SupervisorServiceEligibility_Payload)
      writeStation_Cargo_Transfer_Verification_SupervisorServiceEligibilityType(o.value)
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorSessionStateType(o: Station_Cargo_Transfer_Verification_Supervisor.SessionState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorSessionState_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.SessionState_Payload): Unit = {
      writer.writeZ(Constants.Station_Cargo_Transfer_Verification_SupervisorSessionState_Payload)
      writeStation_Cargo_Transfer_Verification_SupervisorSessionStateType(o.value)
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorAdmittedDirectiveType(o: Station_Cargo_Transfer_Verification_Supervisor.AdmittedDirective.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorAdmittedDirective_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.AdmittedDirective_Payload): Unit = {
      writer.writeZ(Constants.Station_Cargo_Transfer_Verification_SupervisorAdmittedDirective_Payload)
      writeStation_Cargo_Transfer_Verification_SupervisorAdmittedDirectiveType(o.value)
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorVerificationDispositionType(o: Station_Cargo_Transfer_Verification_Supervisor.VerificationDisposition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorVerificationDisposition_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.VerificationDisposition_Payload): Unit = {
      writer.writeZ(Constants.Station_Cargo_Transfer_Verification_SupervisorVerificationDisposition_Payload)
      writeStation_Cargo_Transfer_Verification_SupervisorVerificationDispositionType(o.value)
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorSessionExpectationType(o: Station_Cargo_Transfer_Verification_Supervisor.SessionExpectation.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorSessionExpectation_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.SessionExpectation_Payload): Unit = {
      writer.writeZ(Constants.Station_Cargo_Transfer_Verification_SupervisorSessionExpectation_Payload)
      writeStation_Cargo_Transfer_Verification_SupervisorSessionExpectationType(o.value)
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorCommandProposalType(o: Station_Cargo_Transfer_Verification_Supervisor.CommandProposal.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorCommandProposal_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.CommandProposal_Payload): Unit = {
      writer.writeZ(Constants.Station_Cargo_Transfer_Verification_SupervisorCommandProposal_Payload)
      writeStation_Cargo_Transfer_Verification_SupervisorCommandProposalType(o.value)
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionStateType(o: Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionState_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionState_Payload): Unit = {
      writer.writeZ(Constants.Station_Cargo_Transfer_Verification_SupervisorSnapshotSessionState_Payload)
      writeStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionStateType(o.value)
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionResultType(o: Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionResult.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionResult_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionResult_Payload): Unit = {
      writer.writeZ(Constants.Station_Cargo_Transfer_Verification_SupervisorSnapshotSessionResult_Payload)
      writeStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionResultType(o.value)
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorShipTransferEvidenceType(o: Station_Cargo_Transfer_Verification_Supervisor.ShipTransferEvidence.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorShipTransferEvidence_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.ShipTransferEvidence_Payload): Unit = {
      writer.writeZ(Constants.Station_Cargo_Transfer_Verification_SupervisorShipTransferEvidence_Payload)
      writeStation_Cargo_Transfer_Verification_SupervisorShipTransferEvidenceType(o.value)
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorShipFindingType(o: Station_Cargo_Transfer_Verification_Supervisor.ShipFinding.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorShipFinding_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.ShipFinding_Payload): Unit = {
      writer.writeZ(Constants.Station_Cargo_Transfer_Verification_SupervisorShipFinding_Payload)
      writeStation_Cargo_Transfer_Verification_SupervisorShipFindingType(o.value)
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorWarehouseReceiptEvidenceType(o: Station_Cargo_Transfer_Verification_Supervisor.WarehouseReceiptEvidence.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorWarehouseReceiptEvidence_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.WarehouseReceiptEvidence_Payload): Unit = {
      writer.writeZ(Constants.Station_Cargo_Transfer_Verification_SupervisorWarehouseReceiptEvidence_Payload)
      writeStation_Cargo_Transfer_Verification_SupervisorWarehouseReceiptEvidenceType(o.value)
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorWarehouseFindingType(o: Station_Cargo_Transfer_Verification_Supervisor.WarehouseFinding.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorWarehouseFinding_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.WarehouseFinding_Payload): Unit = {
      writer.writeZ(Constants.Station_Cargo_Transfer_Verification_SupervisorWarehouseFinding_Payload)
      writeStation_Cargo_Transfer_Verification_SupervisorWarehouseFindingType(o.value)
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorShipCommandType(o: Station_Cargo_Transfer_Verification_Supervisor.ShipCommand.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorShipCommand_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.ShipCommand_Payload): Unit = {
      writer.writeZ(Constants.Station_Cargo_Transfer_Verification_SupervisorShipCommand_Payload)
      writeStation_Cargo_Transfer_Verification_SupervisorShipCommandType(o.value)
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorWarehouseQueryType(o: Station_Cargo_Transfer_Verification_Supervisor.WarehouseQuery.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorWarehouseQuery_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.WarehouseQuery_Payload): Unit = {
      writer.writeZ(Constants.Station_Cargo_Transfer_Verification_SupervisorWarehouseQuery_Payload)
      writeStation_Cargo_Transfer_Verification_SupervisorWarehouseQueryType(o.value)
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorPilotTransferReportType(o: Station_Cargo_Transfer_Verification_Supervisor.PilotTransferReport.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorPilotTransferReport_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.PilotTransferReport_Payload): Unit = {
      writer.writeZ(Constants.Station_Cargo_Transfer_Verification_SupervisorPilotTransferReport_Payload)
      writeStation_Cargo_Transfer_Verification_SupervisorPilotTransferReportType(o.value)
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorStationTransferReportType(o: Station_Cargo_Transfer_Verification_Supervisor.StationTransferReport.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorStationTransferReport_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.StationTransferReport_Payload): Unit = {
      writer.writeZ(Constants.Station_Cargo_Transfer_Verification_SupervisorStationTransferReport_Payload)
      writeStation_Cargo_Transfer_Verification_SupervisorStationTransferReportType(o.value)
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorSessionSnapshot(o: Station_Cargo_Transfer_Verification_Supervisor.SessionSnapshot): Unit = {
      writer.writeZ(Constants.Station_Cargo_Transfer_Verification_SupervisorSessionSnapshot)
      writeStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionStateType(o.next_state)
      writeStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionResultType(o.session_result)
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorSessionSnapshot_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.SessionSnapshot_Payload): Unit = {
      writer.writeZ(Constants.Station_Cargo_Transfer_Verification_SupervisorSessionSnapshot_Payload)
      writeStation_Cargo_Transfer_Verification_SupervisorSessionSnapshot(o.value)
    }

    def writeBase_TypesBoolean_Payload(o: Base_Types.Boolean_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesBoolean_Payload)
      writer.writeB(o.value)
    }

    def writeBase_TypesInteger_Payload(o: Base_Types.Integer_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesInteger_Payload)
      writer.writeZ(o.value)
    }

    def writeBase_TypesInteger_8_Payload(o: Base_Types.Integer_8_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesInteger_8_Payload)
      writer.writeS8(o.value)
    }

    def writeBase_TypesInteger_16_Payload(o: Base_Types.Integer_16_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesInteger_16_Payload)
      writer.writeS16(o.value)
    }

    def writeBase_TypesInteger_32_Payload(o: Base_Types.Integer_32_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesInteger_32_Payload)
      writer.writeS32(o.value)
    }

    def writeBase_TypesInteger_64_Payload(o: Base_Types.Integer_64_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesInteger_64_Payload)
      writer.writeS64(o.value)
    }

    def writeBase_TypesUnsigned_8_Payload(o: Base_Types.Unsigned_8_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesUnsigned_8_Payload)
      writer.writeU8(o.value)
    }

    def writeBase_TypesUnsigned_16_Payload(o: Base_Types.Unsigned_16_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesUnsigned_16_Payload)
      writer.writeU16(o.value)
    }

    def writeBase_TypesUnsigned_32_Payload(o: Base_Types.Unsigned_32_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesUnsigned_32_Payload)
      writer.writeU32(o.value)
    }

    def writeBase_TypesUnsigned_64_Payload(o: Base_Types.Unsigned_64_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesUnsigned_64_Payload)
      writer.writeU64(o.value)
    }

    def writeBase_TypesFloat_Payload(o: Base_Types.Float_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesFloat_Payload)
      writer.writeR(o.value)
    }

    def writeBase_TypesFloat_32_Payload(o: Base_Types.Float_32_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesFloat_32_Payload)
      writer.writeF32(o.value)
    }

    def writeBase_TypesFloat_64_Payload(o: Base_Types.Float_64_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesFloat_64_Payload)
      writer.writeF64(o.value)
    }

    def writeBase_TypesCharacter_Payload(o: Base_Types.Character_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesCharacter_Payload)
      writer.writeC(o.value)
    }

    def writeBase_TypesString_Payload(o: Base_Types.String_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesString_Payload)
      writer.writeString(o.value)
    }

    def writeBase_TypesBits_Payload(o: Base_Types.Bits_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesBits_Payload)
      writer.writeISZ(o.value, writer.writeB _)
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container(o: Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PreState_Container): Unit = {
      o match {
        case o: Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PreState_Container_P => writeStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PS => writeStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PS(o)
      }
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_P(o: Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Station_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_P)
      writeStation_Cargo_Transfer_Verification_SupervisorCargoStateType(o.api_cargoState)
      writeStation_Cargo_Transfer_Verification_SupervisorTransferRequestType(o.api_transferRequest)
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PS(o: Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Station_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PS)
      writeStation_Cargo_Transfer_Verification_SupervisorCargoStateType(o.api_cargoState)
      writeStation_Cargo_Transfer_Verification_SupervisorTransferRequestType(o.api_transferRequest)
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container(o: Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PostState_Container): Unit = {
      o match {
        case o: Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PostState_Container_P => writeStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PS => writeStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PS(o)
      }
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_P(o: Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Station_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_P)
      writeStation_Cargo_Transfer_Verification_SupervisorQualifiedRequestType(o.api_qualifiedRequest)
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PS(o: Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Station_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PS)
      writeStation_Cargo_Transfer_Verification_SupervisorQualifiedRequestType(o.api_qualifiedRequest)
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container(o: Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container): Unit = {
      o match {
        case o: Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_P => writeStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PS => writeStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PS(o)
      }
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_P(o: Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Station_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_P)
      writeStation_Cargo_Transfer_Verification_SupervisorDockServiceConditionType(o.api_serviceCondition)
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PS(o: Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Station_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PS)
      writeStation_Cargo_Transfer_Verification_SupervisorDockServiceConditionType(o.api_serviceCondition)
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container(o: Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container): Unit = {
      o match {
        case o: Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_P => writeStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PS => writeStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PS(o)
      }
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_P(o: Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Station_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_P)
      writeStation_Cargo_Transfer_Verification_SupervisorServiceEligibilityType(o.api_gateEligibility)
      writeStation_Cargo_Transfer_Verification_SupervisorServiceEligibilityType(o.api_serviceEligibility)
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PS(o: Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Station_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PS)
      writeStation_Cargo_Transfer_Verification_SupervisorServiceEligibilityType(o.api_gateEligibility)
      writeStation_Cargo_Transfer_Verification_SupervisorServiceEligibilityType(o.api_serviceEligibility)
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container(o: Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container): Unit = {
      o match {
        case o: Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P => writeStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS => writeStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS(o)
      }
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P(o: Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Station_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P)
      writeStation_Cargo_Transfer_Verification_SupervisorQualifiedRequestType(o.api_qualifiedRequest)
      writeStation_Cargo_Transfer_Verification_SupervisorServiceEligibilityType(o.api_serviceEligibility)
      writeStation_Cargo_Transfer_Verification_SupervisorSessionStateType(o.api_sessionPrestate)
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS(o: Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Station_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS)
      writeStation_Cargo_Transfer_Verification_SupervisorQualifiedRequestType(o.api_qualifiedRequest)
      writeStation_Cargo_Transfer_Verification_SupervisorServiceEligibilityType(o.api_serviceEligibility)
      writeStation_Cargo_Transfer_Verification_SupervisorSessionStateType(o.api_sessionPrestate)
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container(o: Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container): Unit = {
      o match {
        case o: Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P => writeStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS => writeStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS(o)
      }
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P(o: Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Station_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P)
      writeStation_Cargo_Transfer_Verification_SupervisorAdmittedDirectiveType(o.api_admittedDirective)
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS(o: Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Station_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS)
      writeStation_Cargo_Transfer_Verification_SupervisorAdmittedDirectiveType(o.api_admittedDirective)
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container(o: Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PreState_Container): Unit = {
      o match {
        case o: Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PreState_Container_P => writeStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PreState_Container_PS => writeStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_PS(o)
      }
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_P(o: Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Station_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_P)
      writeStation_Cargo_Transfer_Verification_SupervisorAdmittedDirectiveType(o.api_admittedDirective)
      writeStation_Cargo_Transfer_Verification_SupervisorVerificationDispositionType(o.api_verificationDisposition)
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_PS(o: Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Station_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_PS)
      writeStation_Cargo_Transfer_Verification_SupervisorSessionStateType(o.In_sessionState)
      writeStation_Cargo_Transfer_Verification_SupervisorAdmittedDirectiveType(o.api_admittedDirective)
      writeStation_Cargo_Transfer_Verification_SupervisorVerificationDispositionType(o.api_verificationDisposition)
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container(o: Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PostState_Container): Unit = {
      o match {
        case o: Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PostState_Container_P => writeStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PostState_Container_PS => writeStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_PS(o)
      }
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_P(o: Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Station_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_P)
      writeStation_Cargo_Transfer_Verification_SupervisorCommandProposalType(o.api_commandProposal)
      writeStation_Cargo_Transfer_Verification_SupervisorSessionStateType(o.api_sessionPrestate)
      writeStation_Cargo_Transfer_Verification_SupervisorSessionSnapshot(o.api_sessionSnapshot)
      writeStation_Cargo_Transfer_Verification_SupervisorSessionExpectationType(o.api_shipExpectation)
      writeStation_Cargo_Transfer_Verification_SupervisorSessionExpectationType(o.api_warehouseExpectation)
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_PS(o: Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Station_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_PS)
      writeStation_Cargo_Transfer_Verification_SupervisorSessionStateType(o.sessionState)
      writeStation_Cargo_Transfer_Verification_SupervisorCommandProposalType(o.api_commandProposal)
      writeStation_Cargo_Transfer_Verification_SupervisorSessionStateType(o.api_sessionPrestate)
      writeStation_Cargo_Transfer_Verification_SupervisorSessionSnapshot(o.api_sessionSnapshot)
      writeStation_Cargo_Transfer_Verification_SupervisorSessionExpectationType(o.api_shipExpectation)
      writeStation_Cargo_Transfer_Verification_SupervisorSessionExpectationType(o.api_warehouseExpectation)
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container(o: Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container): Unit = {
      o match {
        case o: Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_P => writeStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PS => writeStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PS(o)
      }
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_P(o: Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Station_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_P)
      writeStation_Cargo_Transfer_Verification_SupervisorSessionExpectationType(o.api_sessionExpectation)
      writeStation_Cargo_Transfer_Verification_SupervisorShipTransferEvidenceType(o.api_transferEvidence)
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PS(o: Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Station_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PS)
      writeStation_Cargo_Transfer_Verification_SupervisorSessionExpectationType(o.api_sessionExpectation)
      writeStation_Cargo_Transfer_Verification_SupervisorShipTransferEvidenceType(o.api_transferEvidence)
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container(o: Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container): Unit = {
      o match {
        case o: Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_P => writeStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PS => writeStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PS(o)
      }
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_P(o: Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Station_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_P)
      writeStation_Cargo_Transfer_Verification_SupervisorShipFindingType(o.api_shipFinding)
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PS(o: Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Station_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PS)
      writeStation_Cargo_Transfer_Verification_SupervisorShipFindingType(o.api_shipFinding)
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container(o: Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container): Unit = {
      o match {
        case o: Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_P => writeStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PS => writeStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PS(o)
      }
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_P(o: Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Station_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_P)
      writeStation_Cargo_Transfer_Verification_SupervisorWarehouseReceiptEvidenceType(o.api_receiptEvidence)
      writeStation_Cargo_Transfer_Verification_SupervisorSessionExpectationType(o.api_sessionExpectation)
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PS(o: Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Station_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PS)
      writeStation_Cargo_Transfer_Verification_SupervisorWarehouseReceiptEvidenceType(o.api_receiptEvidence)
      writeStation_Cargo_Transfer_Verification_SupervisorSessionExpectationType(o.api_sessionExpectation)
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container(o: Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container): Unit = {
      o match {
        case o: Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_P => writeStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PS => writeStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PS(o)
      }
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_P(o: Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Station_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_P)
      writeStation_Cargo_Transfer_Verification_SupervisorWarehouseFindingType(o.api_warehouseFinding)
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PS(o: Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Station_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PS)
      writeStation_Cargo_Transfer_Verification_SupervisorWarehouseFindingType(o.api_warehouseFinding)
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container(o: Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PreState_Container): Unit = {
      o match {
        case o: Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_P => writeStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PS => writeStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PS(o)
      }
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_P(o: Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Station_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_P)
      writeStation_Cargo_Transfer_Verification_SupervisorShipFindingType(o.api_shipFinding)
      writeStation_Cargo_Transfer_Verification_SupervisorWarehouseFindingType(o.api_warehouseFinding)
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PS(o: Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Station_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PS)
      writeStation_Cargo_Transfer_Verification_SupervisorShipFindingType(o.api_shipFinding)
      writeStation_Cargo_Transfer_Verification_SupervisorWarehouseFindingType(o.api_warehouseFinding)
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container(o: Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PostState_Container): Unit = {
      o match {
        case o: Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_P => writeStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PS => writeStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PS(o)
      }
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_P(o: Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Station_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_P)
      writeStation_Cargo_Transfer_Verification_SupervisorVerificationDispositionType(o.api_verificationDisposition)
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PS(o: Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Station_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PS)
      writeStation_Cargo_Transfer_Verification_SupervisorVerificationDispositionType(o.api_verificationDisposition)
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container(o: Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container): Unit = {
      o match {
        case o: Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_P => writeStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PS => writeStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PS(o)
      }
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_P(o: Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Station_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_P)
      writeStation_Cargo_Transfer_Verification_SupervisorCommandProposalType(o.api_commandProposal)
      writeStation_Cargo_Transfer_Verification_SupervisorServiceEligibilityType(o.api_serviceEligibility)
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PS(o: Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Station_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PS)
      writeStation_Cargo_Transfer_Verification_SupervisorCommandProposalType(o.api_commandProposal)
      writeStation_Cargo_Transfer_Verification_SupervisorServiceEligibilityType(o.api_serviceEligibility)
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container(o: Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container): Unit = {
      o match {
        case o: Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_P => writeStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PS => writeStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PS(o)
      }
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_P(o: Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Station_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_P)
      writeStation_Cargo_Transfer_Verification_SupervisorWarehouseQueryType(o.api_receiptQuery)
      writeStation_Cargo_Transfer_Verification_SupervisorShipCommandType(o.api_shipCommand)
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PS(o: Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Station_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PS)
      writeStation_Cargo_Transfer_Verification_SupervisorWarehouseQueryType(o.api_receiptQuery)
      writeStation_Cargo_Transfer_Verification_SupervisorShipCommandType(o.api_shipCommand)
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container(o: Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container): Unit = {
      o match {
        case o: Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_P => writeStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PS => writeStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PS(o)
      }
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_P(o: Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Station_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_P)
      writeStation_Cargo_Transfer_Verification_SupervisorSessionSnapshot(o.api_sessionSnapshot)
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PS(o: Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Station_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PS)
      writeStation_Cargo_Transfer_Verification_SupervisorSessionSnapshot(o.api_sessionSnapshot)
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container(o: Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container): Unit = {
      o match {
        case o: Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_P => writeStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PS => writeStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PS(o)
      }
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_P(o: Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Station_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_P)
      writeStation_Cargo_Transfer_Verification_SupervisorPilotTransferReportType(o.api_pilotReport)
      writeStation_Cargo_Transfer_Verification_SupervisorStationTransferReportType(o.api_stationReport)
    }

    def writeStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PS(o: Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Station_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PS)
      writeStation_Cargo_Transfer_Verification_SupervisorPilotTransferReportType(o.api_pilotReport)
      writeStation_Cargo_Transfer_Verification_SupervisorStationTransferReportType(o.api_stationReport)
    }

    def writeruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeutilContainer(o: util.Container): Unit = {
      o match {
        case o: util.EmptyContainer => writeutilEmptyContainer(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_P => writeStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P => writeStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PS => writeStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PS(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS => writeStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_P => writeStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PS => writeStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PS(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P => writeStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS => writeStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PreState_Container_P => writeStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PS => writeStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PS(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PostState_Container_P => writeStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PS => writeStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PS(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_P => writeStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PreState_Container_P => writeStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PS => writeStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PS(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PreState_Container_PS => writeStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_PS(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_P => writeStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PS => writeStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PS(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PostState_Container_P => writeStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PostState_Container_PS => writeStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_PS(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_P => writeStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PS => writeStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PS(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_P => writeStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PS => writeStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PS(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_P => writeStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PS => writeStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PS(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_P => writeStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PS => writeStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PS(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_P => writeStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PS => writeStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PS(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_P => writeStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PS => writeStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PS(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_P => writeStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PS => writeStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PS(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_P => writeStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PS => writeStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PS(o)
      }
    }

    def writeutilEmptyContainer(o: util.EmptyContainer): Unit = {
      writer.writeZ(Constants.utilEmptyContainer)
    }

    def write_artDataContent(o: art.DataContent): Unit = {
      o match {
        case o: art.Empty => write_artEmpty(o)
        case o: Base_Types.Boolean_Payload => writeBase_TypesBoolean_Payload(o)
        case o: Base_Types.Integer_Payload => writeBase_TypesInteger_Payload(o)
        case o: Base_Types.Integer_8_Payload => writeBase_TypesInteger_8_Payload(o)
        case o: Base_Types.Integer_16_Payload => writeBase_TypesInteger_16_Payload(o)
        case o: Base_Types.Integer_32_Payload => writeBase_TypesInteger_32_Payload(o)
        case o: Base_Types.Integer_64_Payload => writeBase_TypesInteger_64_Payload(o)
        case o: Base_Types.Unsigned_8_Payload => writeBase_TypesUnsigned_8_Payload(o)
        case o: Base_Types.Unsigned_16_Payload => writeBase_TypesUnsigned_16_Payload(o)
        case o: Base_Types.Unsigned_32_Payload => writeBase_TypesUnsigned_32_Payload(o)
        case o: Base_Types.Unsigned_64_Payload => writeBase_TypesUnsigned_64_Payload(o)
        case o: Base_Types.Float_Payload => writeBase_TypesFloat_Payload(o)
        case o: Base_Types.Float_32_Payload => writeBase_TypesFloat_32_Payload(o)
        case o: Base_Types.Float_64_Payload => writeBase_TypesFloat_64_Payload(o)
        case o: Base_Types.Character_Payload => writeBase_TypesCharacter_Payload(o)
        case o: Base_Types.String_Payload => writeBase_TypesString_Payload(o)
        case o: Base_Types.Bits_Payload => writeBase_TypesBits_Payload(o)
        case o: util.EmptyContainer => writeutilEmptyContainer(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.CargoState_Payload => writeStation_Cargo_Transfer_Verification_SupervisorCargoState_Payload(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.ShipCommand_Payload => writeStation_Cargo_Transfer_Verification_SupervisorShipCommand_Payload(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.ShipFinding_Payload => writeStation_Cargo_Transfer_Verification_SupervisorShipFinding_Payload(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.SessionState_Payload => writeStation_Cargo_Transfer_Verification_SupervisorSessionState_Payload(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.WarehouseQuery_Payload => writeStation_Cargo_Transfer_Verification_SupervisorWarehouseQuery_Payload(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.CommandProposal_Payload => writeStation_Cargo_Transfer_Verification_SupervisorCommandProposal_Payload(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.TransferRequest_Payload => writeStation_Cargo_Transfer_Verification_SupervisorTransferRequest_Payload(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.SessionSnapshot_Payload => writeStation_Cargo_Transfer_Verification_SupervisorSessionSnapshot_Payload(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.WarehouseFinding_Payload => writeStation_Cargo_Transfer_Verification_SupervisorWarehouseFinding_Payload(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.QualifiedRequest_Payload => writeStation_Cargo_Transfer_Verification_SupervisorQualifiedRequest_Payload(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.AdmittedDirective_Payload => writeStation_Cargo_Transfer_Verification_SupervisorAdmittedDirective_Payload(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.SessionExpectation_Payload => writeStation_Cargo_Transfer_Verification_SupervisorSessionExpectation_Payload(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.ServiceEligibility_Payload => writeStation_Cargo_Transfer_Verification_SupervisorServiceEligibility_Payload(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.PilotTransferReport_Payload => writeStation_Cargo_Transfer_Verification_SupervisorPilotTransferReport_Payload(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.ShipTransferEvidence_Payload => writeStation_Cargo_Transfer_Verification_SupervisorShipTransferEvidence_Payload(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.DockServiceCondition_Payload => writeStation_Cargo_Transfer_Verification_SupervisorDockServiceCondition_Payload(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionState_Payload => writeStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionState_Payload(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionResult_Payload => writeStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionResult_Payload(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.StationTransferReport_Payload => writeStation_Cargo_Transfer_Verification_SupervisorStationTransferReport_Payload(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.VerificationDisposition_Payload => writeStation_Cargo_Transfer_Verification_SupervisorVerificationDisposition_Payload(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.WarehouseReceiptEvidence_Payload => writeStation_Cargo_Transfer_Verification_SupervisorWarehouseReceiptEvidence_Payload(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_P => writeStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P => writeStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PS => writeStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PS(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS => writeStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_P => writeStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PS => writeStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PS(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P => writeStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS => writeStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PreState_Container_P => writeStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PS => writeStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PS(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PostState_Container_P => writeStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PS => writeStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PS(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_P => writeStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PreState_Container_P => writeStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PS => writeStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PS(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PreState_Container_PS => writeStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_PS(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_P => writeStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PS => writeStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PS(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PostState_Container_P => writeStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PostState_Container_PS => writeStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_PS(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_P => writeStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PS => writeStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PS(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_P => writeStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PS => writeStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PS(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_P => writeStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PS => writeStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PS(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_P => writeStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PS => writeStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PS(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_P => writeStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PS => writeStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PS(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_P => writeStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PS => writeStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PS(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_P => writeStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PS => writeStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PS(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_P => writeStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_P(o)
        case o: Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PS => writeStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PS(o)
      }
    }

    def write_artEmpty(o: art.Empty): Unit = {
      writer.writeZ(Constants._artEmpty)
    }

    def result: ISZ[U8] = {
      return writer.result
    }

  }

  object Reader {

    @record class Default(val reader: MessagePack.Reader.Impl) extends Reader {
      def errorOpt: Option[MessagePack.ErrorMsg] = {
        return reader.errorOpt
      }
    }

  }

  @msig trait Reader {

    def reader: MessagePack.Reader

    def readStation_Cargo_Transfer_Verification_SupervisorTransferRequestType(): Station_Cargo_Transfer_Verification_Supervisor.TransferRequest.Type = {
      val r = reader.readZ()
      return Station_Cargo_Transfer_Verification_Supervisor.TransferRequest.byOrdinal(r).get
    }

    def readStation_Cargo_Transfer_Verification_SupervisorTransferRequest_Payload(): Station_Cargo_Transfer_Verification_Supervisor.TransferRequest_Payload = {
      val r = readStation_Cargo_Transfer_Verification_SupervisorTransferRequest_PayloadT(F)
      return r
    }

    def readStation_Cargo_Transfer_Verification_SupervisorTransferRequest_PayloadT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.TransferRequest_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Station_Cargo_Transfer_Verification_SupervisorTransferRequest_Payload)
      }
      val value = readStation_Cargo_Transfer_Verification_SupervisorTransferRequestType()
      return Station_Cargo_Transfer_Verification_Supervisor.TransferRequest_Payload(value)
    }

    def readStation_Cargo_Transfer_Verification_SupervisorCargoStateType(): Station_Cargo_Transfer_Verification_Supervisor.CargoState.Type = {
      val r = reader.readZ()
      return Station_Cargo_Transfer_Verification_Supervisor.CargoState.byOrdinal(r).get
    }

    def readStation_Cargo_Transfer_Verification_SupervisorCargoState_Payload(): Station_Cargo_Transfer_Verification_Supervisor.CargoState_Payload = {
      val r = readStation_Cargo_Transfer_Verification_SupervisorCargoState_PayloadT(F)
      return r
    }

    def readStation_Cargo_Transfer_Verification_SupervisorCargoState_PayloadT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.CargoState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Station_Cargo_Transfer_Verification_SupervisorCargoState_Payload)
      }
      val value = readStation_Cargo_Transfer_Verification_SupervisorCargoStateType()
      return Station_Cargo_Transfer_Verification_Supervisor.CargoState_Payload(value)
    }

    def readStation_Cargo_Transfer_Verification_SupervisorQualifiedRequestType(): Station_Cargo_Transfer_Verification_Supervisor.QualifiedRequest.Type = {
      val r = reader.readZ()
      return Station_Cargo_Transfer_Verification_Supervisor.QualifiedRequest.byOrdinal(r).get
    }

    def readStation_Cargo_Transfer_Verification_SupervisorQualifiedRequest_Payload(): Station_Cargo_Transfer_Verification_Supervisor.QualifiedRequest_Payload = {
      val r = readStation_Cargo_Transfer_Verification_SupervisorQualifiedRequest_PayloadT(F)
      return r
    }

    def readStation_Cargo_Transfer_Verification_SupervisorQualifiedRequest_PayloadT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.QualifiedRequest_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Station_Cargo_Transfer_Verification_SupervisorQualifiedRequest_Payload)
      }
      val value = readStation_Cargo_Transfer_Verification_SupervisorQualifiedRequestType()
      return Station_Cargo_Transfer_Verification_Supervisor.QualifiedRequest_Payload(value)
    }

    def readStation_Cargo_Transfer_Verification_SupervisorDockServiceConditionType(): Station_Cargo_Transfer_Verification_Supervisor.DockServiceCondition.Type = {
      val r = reader.readZ()
      return Station_Cargo_Transfer_Verification_Supervisor.DockServiceCondition.byOrdinal(r).get
    }

    def readStation_Cargo_Transfer_Verification_SupervisorDockServiceCondition_Payload(): Station_Cargo_Transfer_Verification_Supervisor.DockServiceCondition_Payload = {
      val r = readStation_Cargo_Transfer_Verification_SupervisorDockServiceCondition_PayloadT(F)
      return r
    }

    def readStation_Cargo_Transfer_Verification_SupervisorDockServiceCondition_PayloadT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.DockServiceCondition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Station_Cargo_Transfer_Verification_SupervisorDockServiceCondition_Payload)
      }
      val value = readStation_Cargo_Transfer_Verification_SupervisorDockServiceConditionType()
      return Station_Cargo_Transfer_Verification_Supervisor.DockServiceCondition_Payload(value)
    }

    def readStation_Cargo_Transfer_Verification_SupervisorServiceEligibilityType(): Station_Cargo_Transfer_Verification_Supervisor.ServiceEligibility.Type = {
      val r = reader.readZ()
      return Station_Cargo_Transfer_Verification_Supervisor.ServiceEligibility.byOrdinal(r).get
    }

    def readStation_Cargo_Transfer_Verification_SupervisorServiceEligibility_Payload(): Station_Cargo_Transfer_Verification_Supervisor.ServiceEligibility_Payload = {
      val r = readStation_Cargo_Transfer_Verification_SupervisorServiceEligibility_PayloadT(F)
      return r
    }

    def readStation_Cargo_Transfer_Verification_SupervisorServiceEligibility_PayloadT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.ServiceEligibility_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Station_Cargo_Transfer_Verification_SupervisorServiceEligibility_Payload)
      }
      val value = readStation_Cargo_Transfer_Verification_SupervisorServiceEligibilityType()
      return Station_Cargo_Transfer_Verification_Supervisor.ServiceEligibility_Payload(value)
    }

    def readStation_Cargo_Transfer_Verification_SupervisorSessionStateType(): Station_Cargo_Transfer_Verification_Supervisor.SessionState.Type = {
      val r = reader.readZ()
      return Station_Cargo_Transfer_Verification_Supervisor.SessionState.byOrdinal(r).get
    }

    def readStation_Cargo_Transfer_Verification_SupervisorSessionState_Payload(): Station_Cargo_Transfer_Verification_Supervisor.SessionState_Payload = {
      val r = readStation_Cargo_Transfer_Verification_SupervisorSessionState_PayloadT(F)
      return r
    }

    def readStation_Cargo_Transfer_Verification_SupervisorSessionState_PayloadT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.SessionState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Station_Cargo_Transfer_Verification_SupervisorSessionState_Payload)
      }
      val value = readStation_Cargo_Transfer_Verification_SupervisorSessionStateType()
      return Station_Cargo_Transfer_Verification_Supervisor.SessionState_Payload(value)
    }

    def readStation_Cargo_Transfer_Verification_SupervisorAdmittedDirectiveType(): Station_Cargo_Transfer_Verification_Supervisor.AdmittedDirective.Type = {
      val r = reader.readZ()
      return Station_Cargo_Transfer_Verification_Supervisor.AdmittedDirective.byOrdinal(r).get
    }

    def readStation_Cargo_Transfer_Verification_SupervisorAdmittedDirective_Payload(): Station_Cargo_Transfer_Verification_Supervisor.AdmittedDirective_Payload = {
      val r = readStation_Cargo_Transfer_Verification_SupervisorAdmittedDirective_PayloadT(F)
      return r
    }

    def readStation_Cargo_Transfer_Verification_SupervisorAdmittedDirective_PayloadT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.AdmittedDirective_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Station_Cargo_Transfer_Verification_SupervisorAdmittedDirective_Payload)
      }
      val value = readStation_Cargo_Transfer_Verification_SupervisorAdmittedDirectiveType()
      return Station_Cargo_Transfer_Verification_Supervisor.AdmittedDirective_Payload(value)
    }

    def readStation_Cargo_Transfer_Verification_SupervisorVerificationDispositionType(): Station_Cargo_Transfer_Verification_Supervisor.VerificationDisposition.Type = {
      val r = reader.readZ()
      return Station_Cargo_Transfer_Verification_Supervisor.VerificationDisposition.byOrdinal(r).get
    }

    def readStation_Cargo_Transfer_Verification_SupervisorVerificationDisposition_Payload(): Station_Cargo_Transfer_Verification_Supervisor.VerificationDisposition_Payload = {
      val r = readStation_Cargo_Transfer_Verification_SupervisorVerificationDisposition_PayloadT(F)
      return r
    }

    def readStation_Cargo_Transfer_Verification_SupervisorVerificationDisposition_PayloadT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.VerificationDisposition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Station_Cargo_Transfer_Verification_SupervisorVerificationDisposition_Payload)
      }
      val value = readStation_Cargo_Transfer_Verification_SupervisorVerificationDispositionType()
      return Station_Cargo_Transfer_Verification_Supervisor.VerificationDisposition_Payload(value)
    }

    def readStation_Cargo_Transfer_Verification_SupervisorSessionExpectationType(): Station_Cargo_Transfer_Verification_Supervisor.SessionExpectation.Type = {
      val r = reader.readZ()
      return Station_Cargo_Transfer_Verification_Supervisor.SessionExpectation.byOrdinal(r).get
    }

    def readStation_Cargo_Transfer_Verification_SupervisorSessionExpectation_Payload(): Station_Cargo_Transfer_Verification_Supervisor.SessionExpectation_Payload = {
      val r = readStation_Cargo_Transfer_Verification_SupervisorSessionExpectation_PayloadT(F)
      return r
    }

    def readStation_Cargo_Transfer_Verification_SupervisorSessionExpectation_PayloadT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.SessionExpectation_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Station_Cargo_Transfer_Verification_SupervisorSessionExpectation_Payload)
      }
      val value = readStation_Cargo_Transfer_Verification_SupervisorSessionExpectationType()
      return Station_Cargo_Transfer_Verification_Supervisor.SessionExpectation_Payload(value)
    }

    def readStation_Cargo_Transfer_Verification_SupervisorCommandProposalType(): Station_Cargo_Transfer_Verification_Supervisor.CommandProposal.Type = {
      val r = reader.readZ()
      return Station_Cargo_Transfer_Verification_Supervisor.CommandProposal.byOrdinal(r).get
    }

    def readStation_Cargo_Transfer_Verification_SupervisorCommandProposal_Payload(): Station_Cargo_Transfer_Verification_Supervisor.CommandProposal_Payload = {
      val r = readStation_Cargo_Transfer_Verification_SupervisorCommandProposal_PayloadT(F)
      return r
    }

    def readStation_Cargo_Transfer_Verification_SupervisorCommandProposal_PayloadT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.CommandProposal_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Station_Cargo_Transfer_Verification_SupervisorCommandProposal_Payload)
      }
      val value = readStation_Cargo_Transfer_Verification_SupervisorCommandProposalType()
      return Station_Cargo_Transfer_Verification_Supervisor.CommandProposal_Payload(value)
    }

    def readStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionStateType(): Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionState.Type = {
      val r = reader.readZ()
      return Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionState.byOrdinal(r).get
    }

    def readStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionState_Payload(): Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionState_Payload = {
      val r = readStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionState_PayloadT(F)
      return r
    }

    def readStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionState_PayloadT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Station_Cargo_Transfer_Verification_SupervisorSnapshotSessionState_Payload)
      }
      val value = readStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionStateType()
      return Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionState_Payload(value)
    }

    def readStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionResultType(): Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionResult.Type = {
      val r = reader.readZ()
      return Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionResult.byOrdinal(r).get
    }

    def readStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionResult_Payload(): Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionResult_Payload = {
      val r = readStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionResult_PayloadT(F)
      return r
    }

    def readStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionResult_PayloadT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionResult_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Station_Cargo_Transfer_Verification_SupervisorSnapshotSessionResult_Payload)
      }
      val value = readStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionResultType()
      return Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionResult_Payload(value)
    }

    def readStation_Cargo_Transfer_Verification_SupervisorShipTransferEvidenceType(): Station_Cargo_Transfer_Verification_Supervisor.ShipTransferEvidence.Type = {
      val r = reader.readZ()
      return Station_Cargo_Transfer_Verification_Supervisor.ShipTransferEvidence.byOrdinal(r).get
    }

    def readStation_Cargo_Transfer_Verification_SupervisorShipTransferEvidence_Payload(): Station_Cargo_Transfer_Verification_Supervisor.ShipTransferEvidence_Payload = {
      val r = readStation_Cargo_Transfer_Verification_SupervisorShipTransferEvidence_PayloadT(F)
      return r
    }

    def readStation_Cargo_Transfer_Verification_SupervisorShipTransferEvidence_PayloadT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.ShipTransferEvidence_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Station_Cargo_Transfer_Verification_SupervisorShipTransferEvidence_Payload)
      }
      val value = readStation_Cargo_Transfer_Verification_SupervisorShipTransferEvidenceType()
      return Station_Cargo_Transfer_Verification_Supervisor.ShipTransferEvidence_Payload(value)
    }

    def readStation_Cargo_Transfer_Verification_SupervisorShipFindingType(): Station_Cargo_Transfer_Verification_Supervisor.ShipFinding.Type = {
      val r = reader.readZ()
      return Station_Cargo_Transfer_Verification_Supervisor.ShipFinding.byOrdinal(r).get
    }

    def readStation_Cargo_Transfer_Verification_SupervisorShipFinding_Payload(): Station_Cargo_Transfer_Verification_Supervisor.ShipFinding_Payload = {
      val r = readStation_Cargo_Transfer_Verification_SupervisorShipFinding_PayloadT(F)
      return r
    }

    def readStation_Cargo_Transfer_Verification_SupervisorShipFinding_PayloadT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.ShipFinding_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Station_Cargo_Transfer_Verification_SupervisorShipFinding_Payload)
      }
      val value = readStation_Cargo_Transfer_Verification_SupervisorShipFindingType()
      return Station_Cargo_Transfer_Verification_Supervisor.ShipFinding_Payload(value)
    }

    def readStation_Cargo_Transfer_Verification_SupervisorWarehouseReceiptEvidenceType(): Station_Cargo_Transfer_Verification_Supervisor.WarehouseReceiptEvidence.Type = {
      val r = reader.readZ()
      return Station_Cargo_Transfer_Verification_Supervisor.WarehouseReceiptEvidence.byOrdinal(r).get
    }

    def readStation_Cargo_Transfer_Verification_SupervisorWarehouseReceiptEvidence_Payload(): Station_Cargo_Transfer_Verification_Supervisor.WarehouseReceiptEvidence_Payload = {
      val r = readStation_Cargo_Transfer_Verification_SupervisorWarehouseReceiptEvidence_PayloadT(F)
      return r
    }

    def readStation_Cargo_Transfer_Verification_SupervisorWarehouseReceiptEvidence_PayloadT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.WarehouseReceiptEvidence_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Station_Cargo_Transfer_Verification_SupervisorWarehouseReceiptEvidence_Payload)
      }
      val value = readStation_Cargo_Transfer_Verification_SupervisorWarehouseReceiptEvidenceType()
      return Station_Cargo_Transfer_Verification_Supervisor.WarehouseReceiptEvidence_Payload(value)
    }

    def readStation_Cargo_Transfer_Verification_SupervisorWarehouseFindingType(): Station_Cargo_Transfer_Verification_Supervisor.WarehouseFinding.Type = {
      val r = reader.readZ()
      return Station_Cargo_Transfer_Verification_Supervisor.WarehouseFinding.byOrdinal(r).get
    }

    def readStation_Cargo_Transfer_Verification_SupervisorWarehouseFinding_Payload(): Station_Cargo_Transfer_Verification_Supervisor.WarehouseFinding_Payload = {
      val r = readStation_Cargo_Transfer_Verification_SupervisorWarehouseFinding_PayloadT(F)
      return r
    }

    def readStation_Cargo_Transfer_Verification_SupervisorWarehouseFinding_PayloadT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.WarehouseFinding_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Station_Cargo_Transfer_Verification_SupervisorWarehouseFinding_Payload)
      }
      val value = readStation_Cargo_Transfer_Verification_SupervisorWarehouseFindingType()
      return Station_Cargo_Transfer_Verification_Supervisor.WarehouseFinding_Payload(value)
    }

    def readStation_Cargo_Transfer_Verification_SupervisorShipCommandType(): Station_Cargo_Transfer_Verification_Supervisor.ShipCommand.Type = {
      val r = reader.readZ()
      return Station_Cargo_Transfer_Verification_Supervisor.ShipCommand.byOrdinal(r).get
    }

    def readStation_Cargo_Transfer_Verification_SupervisorShipCommand_Payload(): Station_Cargo_Transfer_Verification_Supervisor.ShipCommand_Payload = {
      val r = readStation_Cargo_Transfer_Verification_SupervisorShipCommand_PayloadT(F)
      return r
    }

    def readStation_Cargo_Transfer_Verification_SupervisorShipCommand_PayloadT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.ShipCommand_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Station_Cargo_Transfer_Verification_SupervisorShipCommand_Payload)
      }
      val value = readStation_Cargo_Transfer_Verification_SupervisorShipCommandType()
      return Station_Cargo_Transfer_Verification_Supervisor.ShipCommand_Payload(value)
    }

    def readStation_Cargo_Transfer_Verification_SupervisorWarehouseQueryType(): Station_Cargo_Transfer_Verification_Supervisor.WarehouseQuery.Type = {
      val r = reader.readZ()
      return Station_Cargo_Transfer_Verification_Supervisor.WarehouseQuery.byOrdinal(r).get
    }

    def readStation_Cargo_Transfer_Verification_SupervisorWarehouseQuery_Payload(): Station_Cargo_Transfer_Verification_Supervisor.WarehouseQuery_Payload = {
      val r = readStation_Cargo_Transfer_Verification_SupervisorWarehouseQuery_PayloadT(F)
      return r
    }

    def readStation_Cargo_Transfer_Verification_SupervisorWarehouseQuery_PayloadT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.WarehouseQuery_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Station_Cargo_Transfer_Verification_SupervisorWarehouseQuery_Payload)
      }
      val value = readStation_Cargo_Transfer_Verification_SupervisorWarehouseQueryType()
      return Station_Cargo_Transfer_Verification_Supervisor.WarehouseQuery_Payload(value)
    }

    def readStation_Cargo_Transfer_Verification_SupervisorPilotTransferReportType(): Station_Cargo_Transfer_Verification_Supervisor.PilotTransferReport.Type = {
      val r = reader.readZ()
      return Station_Cargo_Transfer_Verification_Supervisor.PilotTransferReport.byOrdinal(r).get
    }

    def readStation_Cargo_Transfer_Verification_SupervisorPilotTransferReport_Payload(): Station_Cargo_Transfer_Verification_Supervisor.PilotTransferReport_Payload = {
      val r = readStation_Cargo_Transfer_Verification_SupervisorPilotTransferReport_PayloadT(F)
      return r
    }

    def readStation_Cargo_Transfer_Verification_SupervisorPilotTransferReport_PayloadT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.PilotTransferReport_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Station_Cargo_Transfer_Verification_SupervisorPilotTransferReport_Payload)
      }
      val value = readStation_Cargo_Transfer_Verification_SupervisorPilotTransferReportType()
      return Station_Cargo_Transfer_Verification_Supervisor.PilotTransferReport_Payload(value)
    }

    def readStation_Cargo_Transfer_Verification_SupervisorStationTransferReportType(): Station_Cargo_Transfer_Verification_Supervisor.StationTransferReport.Type = {
      val r = reader.readZ()
      return Station_Cargo_Transfer_Verification_Supervisor.StationTransferReport.byOrdinal(r).get
    }

    def readStation_Cargo_Transfer_Verification_SupervisorStationTransferReport_Payload(): Station_Cargo_Transfer_Verification_Supervisor.StationTransferReport_Payload = {
      val r = readStation_Cargo_Transfer_Verification_SupervisorStationTransferReport_PayloadT(F)
      return r
    }

    def readStation_Cargo_Transfer_Verification_SupervisorStationTransferReport_PayloadT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.StationTransferReport_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Station_Cargo_Transfer_Verification_SupervisorStationTransferReport_Payload)
      }
      val value = readStation_Cargo_Transfer_Verification_SupervisorStationTransferReportType()
      return Station_Cargo_Transfer_Verification_Supervisor.StationTransferReport_Payload(value)
    }

    def readStation_Cargo_Transfer_Verification_SupervisorSessionSnapshot(): Station_Cargo_Transfer_Verification_Supervisor.SessionSnapshot = {
      val r = readStation_Cargo_Transfer_Verification_SupervisorSessionSnapshotT(F)
      return r
    }

    def readStation_Cargo_Transfer_Verification_SupervisorSessionSnapshotT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.SessionSnapshot = {
      if (!typeParsed) {
        reader.expectZ(Constants.Station_Cargo_Transfer_Verification_SupervisorSessionSnapshot)
      }
      val next_state = readStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionStateType()
      val session_result = readStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionResultType()
      return Station_Cargo_Transfer_Verification_Supervisor.SessionSnapshot(next_state, session_result)
    }

    def readStation_Cargo_Transfer_Verification_SupervisorSessionSnapshot_Payload(): Station_Cargo_Transfer_Verification_Supervisor.SessionSnapshot_Payload = {
      val r = readStation_Cargo_Transfer_Verification_SupervisorSessionSnapshot_PayloadT(F)
      return r
    }

    def readStation_Cargo_Transfer_Verification_SupervisorSessionSnapshot_PayloadT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.SessionSnapshot_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Station_Cargo_Transfer_Verification_SupervisorSessionSnapshot_Payload)
      }
      val value = readStation_Cargo_Transfer_Verification_SupervisorSessionSnapshot()
      return Station_Cargo_Transfer_Verification_Supervisor.SessionSnapshot_Payload(value)
    }

    def readBase_TypesBoolean_Payload(): Base_Types.Boolean_Payload = {
      val r = readBase_TypesBoolean_PayloadT(F)
      return r
    }

    def readBase_TypesBoolean_PayloadT(typeParsed: B): Base_Types.Boolean_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesBoolean_Payload)
      }
      val value = reader.readB()
      return Base_Types.Boolean_Payload(value)
    }

    def readBase_TypesInteger_Payload(): Base_Types.Integer_Payload = {
      val r = readBase_TypesInteger_PayloadT(F)
      return r
    }

    def readBase_TypesInteger_PayloadT(typeParsed: B): Base_Types.Integer_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesInteger_Payload)
      }
      val value = reader.readZ()
      return Base_Types.Integer_Payload(value)
    }

    def readBase_TypesInteger_8_Payload(): Base_Types.Integer_8_Payload = {
      val r = readBase_TypesInteger_8_PayloadT(F)
      return r
    }

    def readBase_TypesInteger_8_PayloadT(typeParsed: B): Base_Types.Integer_8_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesInteger_8_Payload)
      }
      val value = reader.readS8()
      return Base_Types.Integer_8_Payload(value)
    }

    def readBase_TypesInteger_16_Payload(): Base_Types.Integer_16_Payload = {
      val r = readBase_TypesInteger_16_PayloadT(F)
      return r
    }

    def readBase_TypesInteger_16_PayloadT(typeParsed: B): Base_Types.Integer_16_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesInteger_16_Payload)
      }
      val value = reader.readS16()
      return Base_Types.Integer_16_Payload(value)
    }

    def readBase_TypesInteger_32_Payload(): Base_Types.Integer_32_Payload = {
      val r = readBase_TypesInteger_32_PayloadT(F)
      return r
    }

    def readBase_TypesInteger_32_PayloadT(typeParsed: B): Base_Types.Integer_32_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesInteger_32_Payload)
      }
      val value = reader.readS32()
      return Base_Types.Integer_32_Payload(value)
    }

    def readBase_TypesInteger_64_Payload(): Base_Types.Integer_64_Payload = {
      val r = readBase_TypesInteger_64_PayloadT(F)
      return r
    }

    def readBase_TypesInteger_64_PayloadT(typeParsed: B): Base_Types.Integer_64_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesInteger_64_Payload)
      }
      val value = reader.readS64()
      return Base_Types.Integer_64_Payload(value)
    }

    def readBase_TypesUnsigned_8_Payload(): Base_Types.Unsigned_8_Payload = {
      val r = readBase_TypesUnsigned_8_PayloadT(F)
      return r
    }

    def readBase_TypesUnsigned_8_PayloadT(typeParsed: B): Base_Types.Unsigned_8_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesUnsigned_8_Payload)
      }
      val value = reader.readU8()
      return Base_Types.Unsigned_8_Payload(value)
    }

    def readBase_TypesUnsigned_16_Payload(): Base_Types.Unsigned_16_Payload = {
      val r = readBase_TypesUnsigned_16_PayloadT(F)
      return r
    }

    def readBase_TypesUnsigned_16_PayloadT(typeParsed: B): Base_Types.Unsigned_16_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesUnsigned_16_Payload)
      }
      val value = reader.readU16()
      return Base_Types.Unsigned_16_Payload(value)
    }

    def readBase_TypesUnsigned_32_Payload(): Base_Types.Unsigned_32_Payload = {
      val r = readBase_TypesUnsigned_32_PayloadT(F)
      return r
    }

    def readBase_TypesUnsigned_32_PayloadT(typeParsed: B): Base_Types.Unsigned_32_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesUnsigned_32_Payload)
      }
      val value = reader.readU32()
      return Base_Types.Unsigned_32_Payload(value)
    }

    def readBase_TypesUnsigned_64_Payload(): Base_Types.Unsigned_64_Payload = {
      val r = readBase_TypesUnsigned_64_PayloadT(F)
      return r
    }

    def readBase_TypesUnsigned_64_PayloadT(typeParsed: B): Base_Types.Unsigned_64_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesUnsigned_64_Payload)
      }
      val value = reader.readU64()
      return Base_Types.Unsigned_64_Payload(value)
    }

    def readBase_TypesFloat_Payload(): Base_Types.Float_Payload = {
      val r = readBase_TypesFloat_PayloadT(F)
      return r
    }

    def readBase_TypesFloat_PayloadT(typeParsed: B): Base_Types.Float_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesFloat_Payload)
      }
      val value = reader.readR()
      return Base_Types.Float_Payload(value)
    }

    def readBase_TypesFloat_32_Payload(): Base_Types.Float_32_Payload = {
      val r = readBase_TypesFloat_32_PayloadT(F)
      return r
    }

    def readBase_TypesFloat_32_PayloadT(typeParsed: B): Base_Types.Float_32_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesFloat_32_Payload)
      }
      val value = reader.readF32()
      return Base_Types.Float_32_Payload(value)
    }

    def readBase_TypesFloat_64_Payload(): Base_Types.Float_64_Payload = {
      val r = readBase_TypesFloat_64_PayloadT(F)
      return r
    }

    def readBase_TypesFloat_64_PayloadT(typeParsed: B): Base_Types.Float_64_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesFloat_64_Payload)
      }
      val value = reader.readF64()
      return Base_Types.Float_64_Payload(value)
    }

    def readBase_TypesCharacter_Payload(): Base_Types.Character_Payload = {
      val r = readBase_TypesCharacter_PayloadT(F)
      return r
    }

    def readBase_TypesCharacter_PayloadT(typeParsed: B): Base_Types.Character_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesCharacter_Payload)
      }
      val value = reader.readC()
      return Base_Types.Character_Payload(value)
    }

    def readBase_TypesString_Payload(): Base_Types.String_Payload = {
      val r = readBase_TypesString_PayloadT(F)
      return r
    }

    def readBase_TypesString_PayloadT(typeParsed: B): Base_Types.String_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesString_Payload)
      }
      val value = reader.readString()
      return Base_Types.String_Payload(value)
    }

    def readBase_TypesBits_Payload(): Base_Types.Bits_Payload = {
      val r = readBase_TypesBits_PayloadT(F)
      return r
    }

    def readBase_TypesBits_PayloadT(typeParsed: B): Base_Types.Bits_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesBits_Payload)
      }
      val value = reader.readISZ(reader.readB _)
      return Base_Types.Bits_Payload(value)
    }

    def readStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container(): Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Station_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_P => val r = readStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PT(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PS => val r = readStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PreState_Container.")
          val r = readStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PST(T)
          return r
      }
    }

    def readStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_P(): Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PreState_Container_P = {
      val r = readStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PT(F)
      return r
    }

    def readStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Station_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_P)
      }
      val api_cargoState = readStation_Cargo_Transfer_Verification_SupervisorCargoStateType()
      val api_transferRequest = readStation_Cargo_Transfer_Verification_SupervisorTransferRequestType()
      return Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PreState_Container_P(api_cargoState, api_transferRequest)
    }

    def readStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PS(): Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PS = {
      val r = readStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PST(F)
      return r
    }

    def readStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PST(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Station_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PS)
      }
      val api_cargoState = readStation_Cargo_Transfer_Verification_SupervisorCargoStateType()
      val api_transferRequest = readStation_Cargo_Transfer_Verification_SupervisorTransferRequestType()
      return Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PS(api_cargoState, api_transferRequest)
    }

    def readStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container(): Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Station_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_P => val r = readStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PT(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PS => val r = readStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PostState_Container.")
          val r = readStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PST(T)
          return r
      }
    }

    def readStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_P(): Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PostState_Container_P = {
      val r = readStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PT(F)
      return r
    }

    def readStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Station_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_P)
      }
      val api_qualifiedRequest = readStation_Cargo_Transfer_Verification_SupervisorQualifiedRequestType()
      return Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PostState_Container_P(api_qualifiedRequest)
    }

    def readStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PS(): Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PS = {
      val r = readStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PST(F)
      return r
    }

    def readStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PST(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Station_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PS)
      }
      val api_qualifiedRequest = readStation_Cargo_Transfer_Verification_SupervisorQualifiedRequestType()
      return Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PS(api_qualifiedRequest)
    }

    def readStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container(): Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Station_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_P => val r = readStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PT(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PS => val r = readStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container.")
          val r = readStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PST(T)
          return r
      }
    }

    def readStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_P(): Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_P = {
      val r = readStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PT(F)
      return r
    }

    def readStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Station_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_P)
      }
      val api_serviceCondition = readStation_Cargo_Transfer_Verification_SupervisorDockServiceConditionType()
      return Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_P(api_serviceCondition)
    }

    def readStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PS(): Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PS = {
      val r = readStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PST(F)
      return r
    }

    def readStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PST(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Station_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PS)
      }
      val api_serviceCondition = readStation_Cargo_Transfer_Verification_SupervisorDockServiceConditionType()
      return Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PS(api_serviceCondition)
    }

    def readStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container(): Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Station_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_P => val r = readStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PT(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PS => val r = readStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container.")
          val r = readStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PST(T)
          return r
      }
    }

    def readStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_P(): Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_P = {
      val r = readStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PT(F)
      return r
    }

    def readStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Station_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_P)
      }
      val api_gateEligibility = readStation_Cargo_Transfer_Verification_SupervisorServiceEligibilityType()
      val api_serviceEligibility = readStation_Cargo_Transfer_Verification_SupervisorServiceEligibilityType()
      return Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_P(api_gateEligibility, api_serviceEligibility)
    }

    def readStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PS(): Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PS = {
      val r = readStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PST(F)
      return r
    }

    def readStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PST(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Station_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PS)
      }
      val api_gateEligibility = readStation_Cargo_Transfer_Verification_SupervisorServiceEligibilityType()
      val api_serviceEligibility = readStation_Cargo_Transfer_Verification_SupervisorServiceEligibilityType()
      return Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PS(api_gateEligibility, api_serviceEligibility)
    }

    def readStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container(): Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Station_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P => val r = readStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PT(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS => val r = readStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container.")
          val r = readStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PST(T)
          return r
      }
    }

    def readStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P(): Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P = {
      val r = readStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PT(F)
      return r
    }

    def readStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Station_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P)
      }
      val api_qualifiedRequest = readStation_Cargo_Transfer_Verification_SupervisorQualifiedRequestType()
      val api_serviceEligibility = readStation_Cargo_Transfer_Verification_SupervisorServiceEligibilityType()
      val api_sessionPrestate = readStation_Cargo_Transfer_Verification_SupervisorSessionStateType()
      return Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P(api_qualifiedRequest, api_serviceEligibility, api_sessionPrestate)
    }

    def readStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS(): Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS = {
      val r = readStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PST(F)
      return r
    }

    def readStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PST(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Station_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS)
      }
      val api_qualifiedRequest = readStation_Cargo_Transfer_Verification_SupervisorQualifiedRequestType()
      val api_serviceEligibility = readStation_Cargo_Transfer_Verification_SupervisorServiceEligibilityType()
      val api_sessionPrestate = readStation_Cargo_Transfer_Verification_SupervisorSessionStateType()
      return Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS(api_qualifiedRequest, api_serviceEligibility, api_sessionPrestate)
    }

    def readStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container(): Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Station_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P => val r = readStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PT(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS => val r = readStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container.")
          val r = readStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PST(T)
          return r
      }
    }

    def readStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P(): Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P = {
      val r = readStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PT(F)
      return r
    }

    def readStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Station_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P)
      }
      val api_admittedDirective = readStation_Cargo_Transfer_Verification_SupervisorAdmittedDirectiveType()
      return Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P(api_admittedDirective)
    }

    def readStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS(): Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS = {
      val r = readStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PST(F)
      return r
    }

    def readStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PST(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Station_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS)
      }
      val api_admittedDirective = readStation_Cargo_Transfer_Verification_SupervisorAdmittedDirectiveType()
      return Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS(api_admittedDirective)
    }

    def readStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container(): Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Station_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_P => val r = readStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_PT(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_PS => val r = readStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PreState_Container.")
          val r = readStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_PST(T)
          return r
      }
    }

    def readStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_P(): Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PreState_Container_P = {
      val r = readStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_PT(F)
      return r
    }

    def readStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_PT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Station_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_P)
      }
      val api_admittedDirective = readStation_Cargo_Transfer_Verification_SupervisorAdmittedDirectiveType()
      val api_verificationDisposition = readStation_Cargo_Transfer_Verification_SupervisorVerificationDispositionType()
      return Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PreState_Container_P(api_admittedDirective, api_verificationDisposition)
    }

    def readStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_PS(): Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PreState_Container_PS = {
      val r = readStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_PST(F)
      return r
    }

    def readStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_PST(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Station_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_PS)
      }
      val In_sessionState = readStation_Cargo_Transfer_Verification_SupervisorSessionStateType()
      val api_admittedDirective = readStation_Cargo_Transfer_Verification_SupervisorAdmittedDirectiveType()
      val api_verificationDisposition = readStation_Cargo_Transfer_Verification_SupervisorVerificationDispositionType()
      return Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PreState_Container_PS(In_sessionState, api_admittedDirective, api_verificationDisposition)
    }

    def readStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container(): Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Station_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_P => val r = readStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_PT(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_PS => val r = readStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PostState_Container.")
          val r = readStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_PST(T)
          return r
      }
    }

    def readStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_P(): Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PostState_Container_P = {
      val r = readStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_PT(F)
      return r
    }

    def readStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_PT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Station_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_P)
      }
      val api_commandProposal = readStation_Cargo_Transfer_Verification_SupervisorCommandProposalType()
      val api_sessionPrestate = readStation_Cargo_Transfer_Verification_SupervisorSessionStateType()
      val api_sessionSnapshot = readStation_Cargo_Transfer_Verification_SupervisorSessionSnapshot()
      val api_shipExpectation = readStation_Cargo_Transfer_Verification_SupervisorSessionExpectationType()
      val api_warehouseExpectation = readStation_Cargo_Transfer_Verification_SupervisorSessionExpectationType()
      return Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PostState_Container_P(api_commandProposal, api_sessionPrestate, api_sessionSnapshot, api_shipExpectation, api_warehouseExpectation)
    }

    def readStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_PS(): Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PostState_Container_PS = {
      val r = readStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_PST(F)
      return r
    }

    def readStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_PST(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Station_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_PS)
      }
      val sessionState = readStation_Cargo_Transfer_Verification_SupervisorSessionStateType()
      val api_commandProposal = readStation_Cargo_Transfer_Verification_SupervisorCommandProposalType()
      val api_sessionPrestate = readStation_Cargo_Transfer_Verification_SupervisorSessionStateType()
      val api_sessionSnapshot = readStation_Cargo_Transfer_Verification_SupervisorSessionSnapshot()
      val api_shipExpectation = readStation_Cargo_Transfer_Verification_SupervisorSessionExpectationType()
      val api_warehouseExpectation = readStation_Cargo_Transfer_Verification_SupervisorSessionExpectationType()
      return Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PostState_Container_PS(sessionState, api_commandProposal, api_sessionPrestate, api_sessionSnapshot, api_shipExpectation, api_warehouseExpectation)
    }

    def readStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container(): Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Station_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_P => val r = readStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PT(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PS => val r = readStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container.")
          val r = readStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PST(T)
          return r
      }
    }

    def readStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_P(): Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_P = {
      val r = readStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PT(F)
      return r
    }

    def readStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Station_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_P)
      }
      val api_sessionExpectation = readStation_Cargo_Transfer_Verification_SupervisorSessionExpectationType()
      val api_transferEvidence = readStation_Cargo_Transfer_Verification_SupervisorShipTransferEvidenceType()
      return Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_P(api_sessionExpectation, api_transferEvidence)
    }

    def readStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PS(): Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PS = {
      val r = readStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PST(F)
      return r
    }

    def readStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PST(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Station_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PS)
      }
      val api_sessionExpectation = readStation_Cargo_Transfer_Verification_SupervisorSessionExpectationType()
      val api_transferEvidence = readStation_Cargo_Transfer_Verification_SupervisorShipTransferEvidenceType()
      return Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PS(api_sessionExpectation, api_transferEvidence)
    }

    def readStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container(): Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Station_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_P => val r = readStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PT(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PS => val r = readStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container.")
          val r = readStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PST(T)
          return r
      }
    }

    def readStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_P(): Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_P = {
      val r = readStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PT(F)
      return r
    }

    def readStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Station_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_P)
      }
      val api_shipFinding = readStation_Cargo_Transfer_Verification_SupervisorShipFindingType()
      return Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_P(api_shipFinding)
    }

    def readStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PS(): Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PS = {
      val r = readStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PST(F)
      return r
    }

    def readStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PST(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Station_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PS)
      }
      val api_shipFinding = readStation_Cargo_Transfer_Verification_SupervisorShipFindingType()
      return Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PS(api_shipFinding)
    }

    def readStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container(): Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Station_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_P => val r = readStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PT(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PS => val r = readStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container.")
          val r = readStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PST(T)
          return r
      }
    }

    def readStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_P(): Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_P = {
      val r = readStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PT(F)
      return r
    }

    def readStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Station_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_P)
      }
      val api_receiptEvidence = readStation_Cargo_Transfer_Verification_SupervisorWarehouseReceiptEvidenceType()
      val api_sessionExpectation = readStation_Cargo_Transfer_Verification_SupervisorSessionExpectationType()
      return Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_P(api_receiptEvidence, api_sessionExpectation)
    }

    def readStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PS(): Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PS = {
      val r = readStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PST(F)
      return r
    }

    def readStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PST(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Station_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PS)
      }
      val api_receiptEvidence = readStation_Cargo_Transfer_Verification_SupervisorWarehouseReceiptEvidenceType()
      val api_sessionExpectation = readStation_Cargo_Transfer_Verification_SupervisorSessionExpectationType()
      return Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PS(api_receiptEvidence, api_sessionExpectation)
    }

    def readStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container(): Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Station_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_P => val r = readStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PT(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PS => val r = readStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container.")
          val r = readStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PST(T)
          return r
      }
    }

    def readStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_P(): Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_P = {
      val r = readStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PT(F)
      return r
    }

    def readStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Station_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_P)
      }
      val api_warehouseFinding = readStation_Cargo_Transfer_Verification_SupervisorWarehouseFindingType()
      return Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_P(api_warehouseFinding)
    }

    def readStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PS(): Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PS = {
      val r = readStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PST(F)
      return r
    }

    def readStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PST(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Station_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PS)
      }
      val api_warehouseFinding = readStation_Cargo_Transfer_Verification_SupervisorWarehouseFindingType()
      return Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PS(api_warehouseFinding)
    }

    def readStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container(): Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Station_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_P => val r = readStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PT(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PS => val r = readStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PreState_Container.")
          val r = readStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PST(T)
          return r
      }
    }

    def readStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_P(): Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_P = {
      val r = readStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PT(F)
      return r
    }

    def readStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Station_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_P)
      }
      val api_shipFinding = readStation_Cargo_Transfer_Verification_SupervisorShipFindingType()
      val api_warehouseFinding = readStation_Cargo_Transfer_Verification_SupervisorWarehouseFindingType()
      return Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_P(api_shipFinding, api_warehouseFinding)
    }

    def readStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PS(): Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PS = {
      val r = readStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PST(F)
      return r
    }

    def readStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PST(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Station_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PS)
      }
      val api_shipFinding = readStation_Cargo_Transfer_Verification_SupervisorShipFindingType()
      val api_warehouseFinding = readStation_Cargo_Transfer_Verification_SupervisorWarehouseFindingType()
      return Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PS(api_shipFinding, api_warehouseFinding)
    }

    def readStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container(): Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Station_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_P => val r = readStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PT(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PS => val r = readStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PostState_Container.")
          val r = readStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PST(T)
          return r
      }
    }

    def readStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_P(): Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_P = {
      val r = readStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PT(F)
      return r
    }

    def readStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Station_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_P)
      }
      val api_verificationDisposition = readStation_Cargo_Transfer_Verification_SupervisorVerificationDispositionType()
      return Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_P(api_verificationDisposition)
    }

    def readStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PS(): Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PS = {
      val r = readStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PST(F)
      return r
    }

    def readStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PST(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Station_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PS)
      }
      val api_verificationDisposition = readStation_Cargo_Transfer_Verification_SupervisorVerificationDispositionType()
      return Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PS(api_verificationDisposition)
    }

    def readStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container(): Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Station_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_P => val r = readStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PT(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PS => val r = readStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container.")
          val r = readStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PST(T)
          return r
      }
    }

    def readStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_P(): Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_P = {
      val r = readStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PT(F)
      return r
    }

    def readStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Station_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_P)
      }
      val api_commandProposal = readStation_Cargo_Transfer_Verification_SupervisorCommandProposalType()
      val api_serviceEligibility = readStation_Cargo_Transfer_Verification_SupervisorServiceEligibilityType()
      return Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_P(api_commandProposal, api_serviceEligibility)
    }

    def readStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PS(): Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PS = {
      val r = readStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PST(F)
      return r
    }

    def readStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PST(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Station_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PS)
      }
      val api_commandProposal = readStation_Cargo_Transfer_Verification_SupervisorCommandProposalType()
      val api_serviceEligibility = readStation_Cargo_Transfer_Verification_SupervisorServiceEligibilityType()
      return Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PS(api_commandProposal, api_serviceEligibility)
    }

    def readStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container(): Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Station_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_P => val r = readStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PT(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PS => val r = readStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container.")
          val r = readStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PST(T)
          return r
      }
    }

    def readStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_P(): Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_P = {
      val r = readStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PT(F)
      return r
    }

    def readStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Station_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_P)
      }
      val api_receiptQuery = readStation_Cargo_Transfer_Verification_SupervisorWarehouseQueryType()
      val api_shipCommand = readStation_Cargo_Transfer_Verification_SupervisorShipCommandType()
      return Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_P(api_receiptQuery, api_shipCommand)
    }

    def readStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PS(): Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PS = {
      val r = readStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PST(F)
      return r
    }

    def readStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PST(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Station_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PS)
      }
      val api_receiptQuery = readStation_Cargo_Transfer_Verification_SupervisorWarehouseQueryType()
      val api_shipCommand = readStation_Cargo_Transfer_Verification_SupervisorShipCommandType()
      return Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PS(api_receiptQuery, api_shipCommand)
    }

    def readStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container(): Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Station_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_P => val r = readStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PT(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PS => val r = readStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container.")
          val r = readStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PST(T)
          return r
      }
    }

    def readStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_P(): Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_P = {
      val r = readStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PT(F)
      return r
    }

    def readStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Station_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_P)
      }
      val api_sessionSnapshot = readStation_Cargo_Transfer_Verification_SupervisorSessionSnapshot()
      return Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_P(api_sessionSnapshot)
    }

    def readStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PS(): Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PS = {
      val r = readStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PST(F)
      return r
    }

    def readStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PST(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Station_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PS)
      }
      val api_sessionSnapshot = readStation_Cargo_Transfer_Verification_SupervisorSessionSnapshot()
      return Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PS(api_sessionSnapshot)
    }

    def readStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container(): Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Station_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_P => val r = readStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PT(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PS => val r = readStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container.")
          val r = readStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PST(T)
          return r
      }
    }

    def readStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_P(): Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_P = {
      val r = readStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PT(F)
      return r
    }

    def readStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PT(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Station_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_P)
      }
      val api_pilotReport = readStation_Cargo_Transfer_Verification_SupervisorPilotTransferReportType()
      val api_stationReport = readStation_Cargo_Transfer_Verification_SupervisorStationTransferReportType()
      return Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_P(api_pilotReport, api_stationReport)
    }

    def readStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PS(): Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PS = {
      val r = readStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PST(F)
      return r
    }

    def readStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PST(typeParsed: B): Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Station_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PS)
      }
      val api_pilotReport = readStation_Cargo_Transfer_Verification_SupervisorPilotTransferReportType()
      val api_stationReport = readStation_Cargo_Transfer_Verification_SupervisorStationTransferReportType()
      return Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PS(api_pilotReport, api_stationReport)
    }

    def readruntimemonitorObservationKindType(): runtimemonitor.ObservationKind.Type = {
      val r = reader.readZ()
      return runtimemonitor.ObservationKind.byOrdinal(r).get
    }

    def readutilContainer(): util.Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.utilEmptyContainer => val r = readutilEmptyContainerT(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_P => val r = readStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PT(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P => val r = readStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PT(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PS => val r = readStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PST(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS => val r = readStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PST(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_P => val r = readStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PT(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PS => val r = readStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PST(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P => val r = readStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PT(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS => val r = readStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PST(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_P => val r = readStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PT(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PS => val r = readStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PST(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_P => val r = readStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PT(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PS => val r = readStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PST(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_P => val r = readStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PT(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_P => val r = readStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_PT(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PS => val r = readStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PST(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_PS => val r = readStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_PST(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_P => val r = readStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PT(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PS => val r = readStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PST(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_P => val r = readStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_PT(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_PS => val r = readStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_PST(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_P => val r = readStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PT(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PS => val r = readStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PST(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_P => val r = readStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PT(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PS => val r = readStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PST(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_P => val r = readStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PT(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PS => val r = readStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PST(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_P => val r = readStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PT(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PS => val r = readStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PST(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_P => val r = readStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PT(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PS => val r = readStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PST(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_P => val r = readStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PT(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PS => val r = readStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PST(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_P => val r = readStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PT(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PS => val r = readStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PST(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_P => val r = readStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PT(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PS => val r = readStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of util.Container.")
          val r = readStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PST(T)
          return r
      }
    }

    def readutilEmptyContainer(): util.EmptyContainer = {
      val r = readutilEmptyContainerT(F)
      return r
    }

    def readutilEmptyContainerT(typeParsed: B): util.EmptyContainer = {
      if (!typeParsed) {
        reader.expectZ(Constants.utilEmptyContainer)
      }
      return util.EmptyContainer()
    }

    def read_artDataContent(): art.DataContent = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants._artEmpty => val r = read_artEmptyT(T); return r
        case Constants.Base_TypesBoolean_Payload => val r = readBase_TypesBoolean_PayloadT(T); return r
        case Constants.Base_TypesInteger_Payload => val r = readBase_TypesInteger_PayloadT(T); return r
        case Constants.Base_TypesInteger_8_Payload => val r = readBase_TypesInteger_8_PayloadT(T); return r
        case Constants.Base_TypesInteger_16_Payload => val r = readBase_TypesInteger_16_PayloadT(T); return r
        case Constants.Base_TypesInteger_32_Payload => val r = readBase_TypesInteger_32_PayloadT(T); return r
        case Constants.Base_TypesInteger_64_Payload => val r = readBase_TypesInteger_64_PayloadT(T); return r
        case Constants.Base_TypesUnsigned_8_Payload => val r = readBase_TypesUnsigned_8_PayloadT(T); return r
        case Constants.Base_TypesUnsigned_16_Payload => val r = readBase_TypesUnsigned_16_PayloadT(T); return r
        case Constants.Base_TypesUnsigned_32_Payload => val r = readBase_TypesUnsigned_32_PayloadT(T); return r
        case Constants.Base_TypesUnsigned_64_Payload => val r = readBase_TypesUnsigned_64_PayloadT(T); return r
        case Constants.Base_TypesFloat_Payload => val r = readBase_TypesFloat_PayloadT(T); return r
        case Constants.Base_TypesFloat_32_Payload => val r = readBase_TypesFloat_32_PayloadT(T); return r
        case Constants.Base_TypesFloat_64_Payload => val r = readBase_TypesFloat_64_PayloadT(T); return r
        case Constants.Base_TypesCharacter_Payload => val r = readBase_TypesCharacter_PayloadT(T); return r
        case Constants.Base_TypesString_Payload => val r = readBase_TypesString_PayloadT(T); return r
        case Constants.Base_TypesBits_Payload => val r = readBase_TypesBits_PayloadT(T); return r
        case Constants.utilEmptyContainer => val r = readutilEmptyContainerT(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorCargoState_Payload => val r = readStation_Cargo_Transfer_Verification_SupervisorCargoState_PayloadT(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorShipCommand_Payload => val r = readStation_Cargo_Transfer_Verification_SupervisorShipCommand_PayloadT(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorShipFinding_Payload => val r = readStation_Cargo_Transfer_Verification_SupervisorShipFinding_PayloadT(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorSessionState_Payload => val r = readStation_Cargo_Transfer_Verification_SupervisorSessionState_PayloadT(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorWarehouseQuery_Payload => val r = readStation_Cargo_Transfer_Verification_SupervisorWarehouseQuery_PayloadT(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorCommandProposal_Payload => val r = readStation_Cargo_Transfer_Verification_SupervisorCommandProposal_PayloadT(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorTransferRequest_Payload => val r = readStation_Cargo_Transfer_Verification_SupervisorTransferRequest_PayloadT(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorSessionSnapshot_Payload => val r = readStation_Cargo_Transfer_Verification_SupervisorSessionSnapshot_PayloadT(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorWarehouseFinding_Payload => val r = readStation_Cargo_Transfer_Verification_SupervisorWarehouseFinding_PayloadT(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorQualifiedRequest_Payload => val r = readStation_Cargo_Transfer_Verification_SupervisorQualifiedRequest_PayloadT(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorAdmittedDirective_Payload => val r = readStation_Cargo_Transfer_Verification_SupervisorAdmittedDirective_PayloadT(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorSessionExpectation_Payload => val r = readStation_Cargo_Transfer_Verification_SupervisorSessionExpectation_PayloadT(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorServiceEligibility_Payload => val r = readStation_Cargo_Transfer_Verification_SupervisorServiceEligibility_PayloadT(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorPilotTransferReport_Payload => val r = readStation_Cargo_Transfer_Verification_SupervisorPilotTransferReport_PayloadT(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorShipTransferEvidence_Payload => val r = readStation_Cargo_Transfer_Verification_SupervisorShipTransferEvidence_PayloadT(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorDockServiceCondition_Payload => val r = readStation_Cargo_Transfer_Verification_SupervisorDockServiceCondition_PayloadT(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorSnapshotSessionState_Payload => val r = readStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionState_PayloadT(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorSnapshotSessionResult_Payload => val r = readStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionResult_PayloadT(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorStationTransferReport_Payload => val r = readStation_Cargo_Transfer_Verification_SupervisorStationTransferReport_PayloadT(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorVerificationDisposition_Payload => val r = readStation_Cargo_Transfer_Verification_SupervisorVerificationDisposition_PayloadT(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorWarehouseReceiptEvidence_Payload => val r = readStation_Cargo_Transfer_Verification_SupervisorWarehouseReceiptEvidence_PayloadT(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_P => val r = readStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PT(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P => val r = readStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PT(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PS => val r = readStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PST(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS => val r = readStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PST(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_P => val r = readStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PT(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PS => val r = readStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PST(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P => val r = readStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PT(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS => val r = readStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PST(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_P => val r = readStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PT(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PS => val r = readStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PST(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_P => val r = readStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PT(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PS => val r = readStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PST(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_P => val r = readStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PT(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_P => val r = readStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_PT(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PS => val r = readStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PST(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_PS => val r = readStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_PST(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_P => val r = readStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PT(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PS => val r = readStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PST(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_P => val r = readStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_PT(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_PS => val r = readStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_PST(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_P => val r = readStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PT(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PS => val r = readStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PST(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_P => val r = readStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PT(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PS => val r = readStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PST(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_P => val r = readStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PT(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PS => val r = readStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PST(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_P => val r = readStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PT(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PS => val r = readStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PST(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_P => val r = readStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PT(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PS => val r = readStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PST(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_P => val r = readStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PT(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PS => val r = readStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PST(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_P => val r = readStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PT(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PS => val r = readStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PST(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_P => val r = readStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PT(T); return r
        case Constants.Station_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PS => val r = readStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of art.DataContent.")
          val r = readStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PST(T)
          return r
      }
    }

    def read_artEmpty(): art.Empty = {
      val r = read_artEmptyT(F)
      return r
    }

    def read_artEmptyT(typeParsed: B): art.Empty = {
      if (!typeParsed) {
        reader.expectZ(Constants._artEmpty)
      }
      return art.Empty()
    }

  }

  def to[T](data: ISZ[U8], f: Reader => T): Either[T, MessagePack.ErrorMsg] = {
    val rd = Reader.Default(MessagePack.reader(data))
    rd.reader.init()
    val r = f(rd)
    rd.errorOpt match {
      case Some(e) => return Either.Right(e)
      case _ => return Either.Left(r)
    }
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorTransferRequest_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.TransferRequest_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeStation_Cargo_Transfer_Verification_SupervisorTransferRequest_Payload(o)
    return w.result
  }

  def toStation_Cargo_Transfer_Verification_SupervisorTransferRequest_Payload(data: ISZ[U8]): Either[Station_Cargo_Transfer_Verification_Supervisor.TransferRequest_Payload, MessagePack.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorTransferRequest_Payload(reader: Reader): Station_Cargo_Transfer_Verification_Supervisor.TransferRequest_Payload = {
      val r = reader.readStation_Cargo_Transfer_Verification_SupervisorTransferRequest_Payload()
      return r
    }
    val r = to(data, fStation_Cargo_Transfer_Verification_SupervisorTransferRequest_Payload _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorCargoState_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.CargoState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeStation_Cargo_Transfer_Verification_SupervisorCargoState_Payload(o)
    return w.result
  }

  def toStation_Cargo_Transfer_Verification_SupervisorCargoState_Payload(data: ISZ[U8]): Either[Station_Cargo_Transfer_Verification_Supervisor.CargoState_Payload, MessagePack.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorCargoState_Payload(reader: Reader): Station_Cargo_Transfer_Verification_Supervisor.CargoState_Payload = {
      val r = reader.readStation_Cargo_Transfer_Verification_SupervisorCargoState_Payload()
      return r
    }
    val r = to(data, fStation_Cargo_Transfer_Verification_SupervisorCargoState_Payload _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorQualifiedRequest_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.QualifiedRequest_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeStation_Cargo_Transfer_Verification_SupervisorQualifiedRequest_Payload(o)
    return w.result
  }

  def toStation_Cargo_Transfer_Verification_SupervisorQualifiedRequest_Payload(data: ISZ[U8]): Either[Station_Cargo_Transfer_Verification_Supervisor.QualifiedRequest_Payload, MessagePack.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorQualifiedRequest_Payload(reader: Reader): Station_Cargo_Transfer_Verification_Supervisor.QualifiedRequest_Payload = {
      val r = reader.readStation_Cargo_Transfer_Verification_SupervisorQualifiedRequest_Payload()
      return r
    }
    val r = to(data, fStation_Cargo_Transfer_Verification_SupervisorQualifiedRequest_Payload _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorDockServiceCondition_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.DockServiceCondition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeStation_Cargo_Transfer_Verification_SupervisorDockServiceCondition_Payload(o)
    return w.result
  }

  def toStation_Cargo_Transfer_Verification_SupervisorDockServiceCondition_Payload(data: ISZ[U8]): Either[Station_Cargo_Transfer_Verification_Supervisor.DockServiceCondition_Payload, MessagePack.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorDockServiceCondition_Payload(reader: Reader): Station_Cargo_Transfer_Verification_Supervisor.DockServiceCondition_Payload = {
      val r = reader.readStation_Cargo_Transfer_Verification_SupervisorDockServiceCondition_Payload()
      return r
    }
    val r = to(data, fStation_Cargo_Transfer_Verification_SupervisorDockServiceCondition_Payload _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorServiceEligibility_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.ServiceEligibility_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeStation_Cargo_Transfer_Verification_SupervisorServiceEligibility_Payload(o)
    return w.result
  }

  def toStation_Cargo_Transfer_Verification_SupervisorServiceEligibility_Payload(data: ISZ[U8]): Either[Station_Cargo_Transfer_Verification_Supervisor.ServiceEligibility_Payload, MessagePack.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorServiceEligibility_Payload(reader: Reader): Station_Cargo_Transfer_Verification_Supervisor.ServiceEligibility_Payload = {
      val r = reader.readStation_Cargo_Transfer_Verification_SupervisorServiceEligibility_Payload()
      return r
    }
    val r = to(data, fStation_Cargo_Transfer_Verification_SupervisorServiceEligibility_Payload _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorSessionState_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.SessionState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeStation_Cargo_Transfer_Verification_SupervisorSessionState_Payload(o)
    return w.result
  }

  def toStation_Cargo_Transfer_Verification_SupervisorSessionState_Payload(data: ISZ[U8]): Either[Station_Cargo_Transfer_Verification_Supervisor.SessionState_Payload, MessagePack.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorSessionState_Payload(reader: Reader): Station_Cargo_Transfer_Verification_Supervisor.SessionState_Payload = {
      val r = reader.readStation_Cargo_Transfer_Verification_SupervisorSessionState_Payload()
      return r
    }
    val r = to(data, fStation_Cargo_Transfer_Verification_SupervisorSessionState_Payload _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorAdmittedDirective_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.AdmittedDirective_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeStation_Cargo_Transfer_Verification_SupervisorAdmittedDirective_Payload(o)
    return w.result
  }

  def toStation_Cargo_Transfer_Verification_SupervisorAdmittedDirective_Payload(data: ISZ[U8]): Either[Station_Cargo_Transfer_Verification_Supervisor.AdmittedDirective_Payload, MessagePack.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorAdmittedDirective_Payload(reader: Reader): Station_Cargo_Transfer_Verification_Supervisor.AdmittedDirective_Payload = {
      val r = reader.readStation_Cargo_Transfer_Verification_SupervisorAdmittedDirective_Payload()
      return r
    }
    val r = to(data, fStation_Cargo_Transfer_Verification_SupervisorAdmittedDirective_Payload _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorVerificationDisposition_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.VerificationDisposition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeStation_Cargo_Transfer_Verification_SupervisorVerificationDisposition_Payload(o)
    return w.result
  }

  def toStation_Cargo_Transfer_Verification_SupervisorVerificationDisposition_Payload(data: ISZ[U8]): Either[Station_Cargo_Transfer_Verification_Supervisor.VerificationDisposition_Payload, MessagePack.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorVerificationDisposition_Payload(reader: Reader): Station_Cargo_Transfer_Verification_Supervisor.VerificationDisposition_Payload = {
      val r = reader.readStation_Cargo_Transfer_Verification_SupervisorVerificationDisposition_Payload()
      return r
    }
    val r = to(data, fStation_Cargo_Transfer_Verification_SupervisorVerificationDisposition_Payload _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorSessionExpectation_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.SessionExpectation_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeStation_Cargo_Transfer_Verification_SupervisorSessionExpectation_Payload(o)
    return w.result
  }

  def toStation_Cargo_Transfer_Verification_SupervisorSessionExpectation_Payload(data: ISZ[U8]): Either[Station_Cargo_Transfer_Verification_Supervisor.SessionExpectation_Payload, MessagePack.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorSessionExpectation_Payload(reader: Reader): Station_Cargo_Transfer_Verification_Supervisor.SessionExpectation_Payload = {
      val r = reader.readStation_Cargo_Transfer_Verification_SupervisorSessionExpectation_Payload()
      return r
    }
    val r = to(data, fStation_Cargo_Transfer_Verification_SupervisorSessionExpectation_Payload _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorCommandProposal_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.CommandProposal_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeStation_Cargo_Transfer_Verification_SupervisorCommandProposal_Payload(o)
    return w.result
  }

  def toStation_Cargo_Transfer_Verification_SupervisorCommandProposal_Payload(data: ISZ[U8]): Either[Station_Cargo_Transfer_Verification_Supervisor.CommandProposal_Payload, MessagePack.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorCommandProposal_Payload(reader: Reader): Station_Cargo_Transfer_Verification_Supervisor.CommandProposal_Payload = {
      val r = reader.readStation_Cargo_Transfer_Verification_SupervisorCommandProposal_Payload()
      return r
    }
    val r = to(data, fStation_Cargo_Transfer_Verification_SupervisorCommandProposal_Payload _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionState_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionState_Payload(o)
    return w.result
  }

  def toStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionState_Payload(data: ISZ[U8]): Either[Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionState_Payload, MessagePack.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionState_Payload(reader: Reader): Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionState_Payload = {
      val r = reader.readStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionState_Payload()
      return r
    }
    val r = to(data, fStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionState_Payload _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionResult_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionResult_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionResult_Payload(o)
    return w.result
  }

  def toStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionResult_Payload(data: ISZ[U8]): Either[Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionResult_Payload, MessagePack.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionResult_Payload(reader: Reader): Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionResult_Payload = {
      val r = reader.readStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionResult_Payload()
      return r
    }
    val r = to(data, fStation_Cargo_Transfer_Verification_SupervisorSnapshotSessionResult_Payload _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorShipTransferEvidence_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.ShipTransferEvidence_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeStation_Cargo_Transfer_Verification_SupervisorShipTransferEvidence_Payload(o)
    return w.result
  }

  def toStation_Cargo_Transfer_Verification_SupervisorShipTransferEvidence_Payload(data: ISZ[U8]): Either[Station_Cargo_Transfer_Verification_Supervisor.ShipTransferEvidence_Payload, MessagePack.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorShipTransferEvidence_Payload(reader: Reader): Station_Cargo_Transfer_Verification_Supervisor.ShipTransferEvidence_Payload = {
      val r = reader.readStation_Cargo_Transfer_Verification_SupervisorShipTransferEvidence_Payload()
      return r
    }
    val r = to(data, fStation_Cargo_Transfer_Verification_SupervisorShipTransferEvidence_Payload _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorShipFinding_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.ShipFinding_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeStation_Cargo_Transfer_Verification_SupervisorShipFinding_Payload(o)
    return w.result
  }

  def toStation_Cargo_Transfer_Verification_SupervisorShipFinding_Payload(data: ISZ[U8]): Either[Station_Cargo_Transfer_Verification_Supervisor.ShipFinding_Payload, MessagePack.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorShipFinding_Payload(reader: Reader): Station_Cargo_Transfer_Verification_Supervisor.ShipFinding_Payload = {
      val r = reader.readStation_Cargo_Transfer_Verification_SupervisorShipFinding_Payload()
      return r
    }
    val r = to(data, fStation_Cargo_Transfer_Verification_SupervisorShipFinding_Payload _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorWarehouseReceiptEvidence_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.WarehouseReceiptEvidence_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeStation_Cargo_Transfer_Verification_SupervisorWarehouseReceiptEvidence_Payload(o)
    return w.result
  }

  def toStation_Cargo_Transfer_Verification_SupervisorWarehouseReceiptEvidence_Payload(data: ISZ[U8]): Either[Station_Cargo_Transfer_Verification_Supervisor.WarehouseReceiptEvidence_Payload, MessagePack.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorWarehouseReceiptEvidence_Payload(reader: Reader): Station_Cargo_Transfer_Verification_Supervisor.WarehouseReceiptEvidence_Payload = {
      val r = reader.readStation_Cargo_Transfer_Verification_SupervisorWarehouseReceiptEvidence_Payload()
      return r
    }
    val r = to(data, fStation_Cargo_Transfer_Verification_SupervisorWarehouseReceiptEvidence_Payload _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorWarehouseFinding_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.WarehouseFinding_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeStation_Cargo_Transfer_Verification_SupervisorWarehouseFinding_Payload(o)
    return w.result
  }

  def toStation_Cargo_Transfer_Verification_SupervisorWarehouseFinding_Payload(data: ISZ[U8]): Either[Station_Cargo_Transfer_Verification_Supervisor.WarehouseFinding_Payload, MessagePack.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorWarehouseFinding_Payload(reader: Reader): Station_Cargo_Transfer_Verification_Supervisor.WarehouseFinding_Payload = {
      val r = reader.readStation_Cargo_Transfer_Verification_SupervisorWarehouseFinding_Payload()
      return r
    }
    val r = to(data, fStation_Cargo_Transfer_Verification_SupervisorWarehouseFinding_Payload _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorShipCommand_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.ShipCommand_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeStation_Cargo_Transfer_Verification_SupervisorShipCommand_Payload(o)
    return w.result
  }

  def toStation_Cargo_Transfer_Verification_SupervisorShipCommand_Payload(data: ISZ[U8]): Either[Station_Cargo_Transfer_Verification_Supervisor.ShipCommand_Payload, MessagePack.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorShipCommand_Payload(reader: Reader): Station_Cargo_Transfer_Verification_Supervisor.ShipCommand_Payload = {
      val r = reader.readStation_Cargo_Transfer_Verification_SupervisorShipCommand_Payload()
      return r
    }
    val r = to(data, fStation_Cargo_Transfer_Verification_SupervisorShipCommand_Payload _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorWarehouseQuery_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.WarehouseQuery_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeStation_Cargo_Transfer_Verification_SupervisorWarehouseQuery_Payload(o)
    return w.result
  }

  def toStation_Cargo_Transfer_Verification_SupervisorWarehouseQuery_Payload(data: ISZ[U8]): Either[Station_Cargo_Transfer_Verification_Supervisor.WarehouseQuery_Payload, MessagePack.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorWarehouseQuery_Payload(reader: Reader): Station_Cargo_Transfer_Verification_Supervisor.WarehouseQuery_Payload = {
      val r = reader.readStation_Cargo_Transfer_Verification_SupervisorWarehouseQuery_Payload()
      return r
    }
    val r = to(data, fStation_Cargo_Transfer_Verification_SupervisorWarehouseQuery_Payload _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorPilotTransferReport_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.PilotTransferReport_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeStation_Cargo_Transfer_Verification_SupervisorPilotTransferReport_Payload(o)
    return w.result
  }

  def toStation_Cargo_Transfer_Verification_SupervisorPilotTransferReport_Payload(data: ISZ[U8]): Either[Station_Cargo_Transfer_Verification_Supervisor.PilotTransferReport_Payload, MessagePack.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorPilotTransferReport_Payload(reader: Reader): Station_Cargo_Transfer_Verification_Supervisor.PilotTransferReport_Payload = {
      val r = reader.readStation_Cargo_Transfer_Verification_SupervisorPilotTransferReport_Payload()
      return r
    }
    val r = to(data, fStation_Cargo_Transfer_Verification_SupervisorPilotTransferReport_Payload _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorStationTransferReport_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.StationTransferReport_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeStation_Cargo_Transfer_Verification_SupervisorStationTransferReport_Payload(o)
    return w.result
  }

  def toStation_Cargo_Transfer_Verification_SupervisorStationTransferReport_Payload(data: ISZ[U8]): Either[Station_Cargo_Transfer_Verification_Supervisor.StationTransferReport_Payload, MessagePack.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorStationTransferReport_Payload(reader: Reader): Station_Cargo_Transfer_Verification_Supervisor.StationTransferReport_Payload = {
      val r = reader.readStation_Cargo_Transfer_Verification_SupervisorStationTransferReport_Payload()
      return r
    }
    val r = to(data, fStation_Cargo_Transfer_Verification_SupervisorStationTransferReport_Payload _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorSessionSnapshot(o: Station_Cargo_Transfer_Verification_Supervisor.SessionSnapshot, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeStation_Cargo_Transfer_Verification_SupervisorSessionSnapshot(o)
    return w.result
  }

  def toStation_Cargo_Transfer_Verification_SupervisorSessionSnapshot(data: ISZ[U8]): Either[Station_Cargo_Transfer_Verification_Supervisor.SessionSnapshot, MessagePack.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorSessionSnapshot(reader: Reader): Station_Cargo_Transfer_Verification_Supervisor.SessionSnapshot = {
      val r = reader.readStation_Cargo_Transfer_Verification_SupervisorSessionSnapshot()
      return r
    }
    val r = to(data, fStation_Cargo_Transfer_Verification_SupervisorSessionSnapshot _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorSessionSnapshot_Payload(o: Station_Cargo_Transfer_Verification_Supervisor.SessionSnapshot_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeStation_Cargo_Transfer_Verification_SupervisorSessionSnapshot_Payload(o)
    return w.result
  }

  def toStation_Cargo_Transfer_Verification_SupervisorSessionSnapshot_Payload(data: ISZ[U8]): Either[Station_Cargo_Transfer_Verification_Supervisor.SessionSnapshot_Payload, MessagePack.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorSessionSnapshot_Payload(reader: Reader): Station_Cargo_Transfer_Verification_Supervisor.SessionSnapshot_Payload = {
      val r = reader.readStation_Cargo_Transfer_Verification_SupervisorSessionSnapshot_Payload()
      return r
    }
    val r = to(data, fStation_Cargo_Transfer_Verification_SupervisorSessionSnapshot_Payload _)
    return r
  }

  def fromBase_TypesBoolean_Payload(o: Base_Types.Boolean_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesBoolean_Payload(o)
    return w.result
  }

  def toBase_TypesBoolean_Payload(data: ISZ[U8]): Either[Base_Types.Boolean_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesBoolean_Payload(reader: Reader): Base_Types.Boolean_Payload = {
      val r = reader.readBase_TypesBoolean_Payload()
      return r
    }
    val r = to(data, fBase_TypesBoolean_Payload _)
    return r
  }

  def fromBase_TypesInteger_Payload(o: Base_Types.Integer_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesInteger_Payload(o)
    return w.result
  }

  def toBase_TypesInteger_Payload(data: ISZ[U8]): Either[Base_Types.Integer_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesInteger_Payload(reader: Reader): Base_Types.Integer_Payload = {
      val r = reader.readBase_TypesInteger_Payload()
      return r
    }
    val r = to(data, fBase_TypesInteger_Payload _)
    return r
  }

  def fromBase_TypesInteger_8_Payload(o: Base_Types.Integer_8_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesInteger_8_Payload(o)
    return w.result
  }

  def toBase_TypesInteger_8_Payload(data: ISZ[U8]): Either[Base_Types.Integer_8_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesInteger_8_Payload(reader: Reader): Base_Types.Integer_8_Payload = {
      val r = reader.readBase_TypesInteger_8_Payload()
      return r
    }
    val r = to(data, fBase_TypesInteger_8_Payload _)
    return r
  }

  def fromBase_TypesInteger_16_Payload(o: Base_Types.Integer_16_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesInteger_16_Payload(o)
    return w.result
  }

  def toBase_TypesInteger_16_Payload(data: ISZ[U8]): Either[Base_Types.Integer_16_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesInteger_16_Payload(reader: Reader): Base_Types.Integer_16_Payload = {
      val r = reader.readBase_TypesInteger_16_Payload()
      return r
    }
    val r = to(data, fBase_TypesInteger_16_Payload _)
    return r
  }

  def fromBase_TypesInteger_32_Payload(o: Base_Types.Integer_32_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesInteger_32_Payload(o)
    return w.result
  }

  def toBase_TypesInteger_32_Payload(data: ISZ[U8]): Either[Base_Types.Integer_32_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesInteger_32_Payload(reader: Reader): Base_Types.Integer_32_Payload = {
      val r = reader.readBase_TypesInteger_32_Payload()
      return r
    }
    val r = to(data, fBase_TypesInteger_32_Payload _)
    return r
  }

  def fromBase_TypesInteger_64_Payload(o: Base_Types.Integer_64_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesInteger_64_Payload(o)
    return w.result
  }

  def toBase_TypesInteger_64_Payload(data: ISZ[U8]): Either[Base_Types.Integer_64_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesInteger_64_Payload(reader: Reader): Base_Types.Integer_64_Payload = {
      val r = reader.readBase_TypesInteger_64_Payload()
      return r
    }
    val r = to(data, fBase_TypesInteger_64_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_8_Payload(o: Base_Types.Unsigned_8_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesUnsigned_8_Payload(o)
    return w.result
  }

  def toBase_TypesUnsigned_8_Payload(data: ISZ[U8]): Either[Base_Types.Unsigned_8_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesUnsigned_8_Payload(reader: Reader): Base_Types.Unsigned_8_Payload = {
      val r = reader.readBase_TypesUnsigned_8_Payload()
      return r
    }
    val r = to(data, fBase_TypesUnsigned_8_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_16_Payload(o: Base_Types.Unsigned_16_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesUnsigned_16_Payload(o)
    return w.result
  }

  def toBase_TypesUnsigned_16_Payload(data: ISZ[U8]): Either[Base_Types.Unsigned_16_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesUnsigned_16_Payload(reader: Reader): Base_Types.Unsigned_16_Payload = {
      val r = reader.readBase_TypesUnsigned_16_Payload()
      return r
    }
    val r = to(data, fBase_TypesUnsigned_16_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_32_Payload(o: Base_Types.Unsigned_32_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesUnsigned_32_Payload(o)
    return w.result
  }

  def toBase_TypesUnsigned_32_Payload(data: ISZ[U8]): Either[Base_Types.Unsigned_32_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesUnsigned_32_Payload(reader: Reader): Base_Types.Unsigned_32_Payload = {
      val r = reader.readBase_TypesUnsigned_32_Payload()
      return r
    }
    val r = to(data, fBase_TypesUnsigned_32_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_64_Payload(o: Base_Types.Unsigned_64_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesUnsigned_64_Payload(o)
    return w.result
  }

  def toBase_TypesUnsigned_64_Payload(data: ISZ[U8]): Either[Base_Types.Unsigned_64_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesUnsigned_64_Payload(reader: Reader): Base_Types.Unsigned_64_Payload = {
      val r = reader.readBase_TypesUnsigned_64_Payload()
      return r
    }
    val r = to(data, fBase_TypesUnsigned_64_Payload _)
    return r
  }

  def fromBase_TypesFloat_Payload(o: Base_Types.Float_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesFloat_Payload(o)
    return w.result
  }

  def toBase_TypesFloat_Payload(data: ISZ[U8]): Either[Base_Types.Float_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesFloat_Payload(reader: Reader): Base_Types.Float_Payload = {
      val r = reader.readBase_TypesFloat_Payload()
      return r
    }
    val r = to(data, fBase_TypesFloat_Payload _)
    return r
  }

  def fromBase_TypesFloat_32_Payload(o: Base_Types.Float_32_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesFloat_32_Payload(o)
    return w.result
  }

  def toBase_TypesFloat_32_Payload(data: ISZ[U8]): Either[Base_Types.Float_32_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesFloat_32_Payload(reader: Reader): Base_Types.Float_32_Payload = {
      val r = reader.readBase_TypesFloat_32_Payload()
      return r
    }
    val r = to(data, fBase_TypesFloat_32_Payload _)
    return r
  }

  def fromBase_TypesFloat_64_Payload(o: Base_Types.Float_64_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesFloat_64_Payload(o)
    return w.result
  }

  def toBase_TypesFloat_64_Payload(data: ISZ[U8]): Either[Base_Types.Float_64_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesFloat_64_Payload(reader: Reader): Base_Types.Float_64_Payload = {
      val r = reader.readBase_TypesFloat_64_Payload()
      return r
    }
    val r = to(data, fBase_TypesFloat_64_Payload _)
    return r
  }

  def fromBase_TypesCharacter_Payload(o: Base_Types.Character_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesCharacter_Payload(o)
    return w.result
  }

  def toBase_TypesCharacter_Payload(data: ISZ[U8]): Either[Base_Types.Character_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesCharacter_Payload(reader: Reader): Base_Types.Character_Payload = {
      val r = reader.readBase_TypesCharacter_Payload()
      return r
    }
    val r = to(data, fBase_TypesCharacter_Payload _)
    return r
  }

  def fromBase_TypesString_Payload(o: Base_Types.String_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesString_Payload(o)
    return w.result
  }

  def toBase_TypesString_Payload(data: ISZ[U8]): Either[Base_Types.String_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesString_Payload(reader: Reader): Base_Types.String_Payload = {
      val r = reader.readBase_TypesString_Payload()
      return r
    }
    val r = to(data, fBase_TypesString_Payload _)
    return r
  }

  def fromBase_TypesBits_Payload(o: Base_Types.Bits_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesBits_Payload(o)
    return w.result
  }

  def toBase_TypesBits_Payload(data: ISZ[U8]): Either[Base_Types.Bits_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesBits_Payload(reader: Reader): Base_Types.Bits_Payload = {
      val r = reader.readBase_TypesBits_Payload()
      return r
    }
    val r = to(data, fBase_TypesBits_Payload _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container(o: Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container(o)
    return w.result
  }

  def toStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container(data: ISZ[U8]): Either[Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PreState_Container, MessagePack.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container(reader: Reader): Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PreState_Container = {
      val r = reader.readStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container()
      return r
    }
    val r = to(data, fStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_P(o: Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_P(o)
    return w.result
  }

  def toStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_P(data: ISZ[U8]): Either[Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_P(reader: Reader): Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PreState_Container_P = {
      val r = reader.readStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_P()
      return r
    }
    val r = to(data, fStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_P _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PS(o: Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PS(o)
    return w.result
  }

  def toStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PS(data: ISZ[U8]): Either[Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PS(reader: Reader): Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PS = {
      val r = reader.readStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PS()
      return r
    }
    val r = to(data, fStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PreState_Container_PS _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container(o: Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container(o)
    return w.result
  }

  def toStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container(data: ISZ[U8]): Either[Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PostState_Container, MessagePack.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container(reader: Reader): Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PostState_Container = {
      val r = reader.readStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container()
      return r
    }
    val r = to(data, fStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_P(o: Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_P(o)
    return w.result
  }

  def toStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_P(data: ISZ[U8]): Either[Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_P(reader: Reader): Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PostState_Container_P = {
      val r = reader.readStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_P()
      return r
    }
    val r = to(data, fStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_P _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PS(o: Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PS(o)
    return w.result
  }

  def toStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PS(data: ISZ[U8]): Either[Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PS(reader: Reader): Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PS = {
      val r = reader.readStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PS()
      return r
    }
    val r = to(data, fStation_Cargo_Transfer_Verification_SupervisorRequestQualifier_supervisorProcess_requestQualifier_PostState_Container_PS _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container(o: Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container(o)
    return w.result
  }

  def toStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container(data: ISZ[U8]): Either[Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container, MessagePack.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container(reader: Reader): Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container = {
      val r = reader.readStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container()
      return r
    }
    val r = to(data, fStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_P(o: Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_P(o)
    return w.result
  }

  def toStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_P(data: ISZ[U8]): Either[Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_P(reader: Reader): Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_P = {
      val r = reader.readStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_P()
      return r
    }
    val r = to(data, fStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_P _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PS(o: Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PS(o)
    return w.result
  }

  def toStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PS(data: ISZ[U8]): Either[Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PS(reader: Reader): Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PS = {
      val r = reader.readStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PS()
      return r
    }
    val r = to(data, fStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PreState_Container_PS _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container(o: Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container(o)
    return w.result
  }

  def toStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container(data: ISZ[U8]): Either[Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container, MessagePack.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container(reader: Reader): Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container = {
      val r = reader.readStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container()
      return r
    }
    val r = to(data, fStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_P(o: Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_P(o)
    return w.result
  }

  def toStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_P(data: ISZ[U8]): Either[Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_P(reader: Reader): Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_P = {
      val r = reader.readStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_P()
      return r
    }
    val r = to(data, fStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_P _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PS(o: Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PS(o)
    return w.result
  }

  def toStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PS(data: ISZ[U8]): Either[Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PS(reader: Reader): Station_Cargo_Transfer_Verification_Supervisor.ServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PS = {
      val r = reader.readStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PS()
      return r
    }
    val r = to(data, fStation_Cargo_Transfer_Verification_SupervisorServiceReadinessQualifier_supervisorProcess_serviceReadinessQualifier_PostState_Container_PS _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container(o: Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container(o)
    return w.result
  }

  def toStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container(data: ISZ[U8]): Either[Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container, MessagePack.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container(reader: Reader): Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container = {
      val r = reader.readStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container()
      return r
    }
    val r = to(data, fStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P(o: Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P(o)
    return w.result
  }

  def toStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P(data: ISZ[U8]): Either[Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P(reader: Reader): Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P = {
      val r = reader.readStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P()
      return r
    }
    val r = to(data, fStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS(o: Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS(o)
    return w.result
  }

  def toStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS(data: ISZ[U8]): Either[Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS(reader: Reader): Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS = {
      val r = reader.readStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS()
      return r
    }
    val r = to(data, fStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container(o: Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container(o)
    return w.result
  }

  def toStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container(data: ISZ[U8]): Either[Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container, MessagePack.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container(reader: Reader): Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container = {
      val r = reader.readStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container()
      return r
    }
    val r = to(data, fStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P(o: Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P(o)
    return w.result
  }

  def toStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P(data: ISZ[U8]): Either[Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P(reader: Reader): Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P = {
      val r = reader.readStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P()
      return r
    }
    val r = to(data, fStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS(o: Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS(o)
    return w.result
  }

  def toStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS(data: ISZ[U8]): Either[Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS(reader: Reader): Station_Cargo_Transfer_Verification_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS = {
      val r = reader.readStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS()
      return r
    }
    val r = to(data, fStation_Cargo_Transfer_Verification_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container(o: Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container(o)
    return w.result
  }

  def toStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container(data: ISZ[U8]): Either[Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PreState_Container, MessagePack.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container(reader: Reader): Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PreState_Container = {
      val r = reader.readStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container()
      return r
    }
    val r = to(data, fStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_P(o: Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_P(o)
    return w.result
  }

  def toStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_P(data: ISZ[U8]): Either[Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_P(reader: Reader): Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PreState_Container_P = {
      val r = reader.readStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_P()
      return r
    }
    val r = to(data, fStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_P _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_PS(o: Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_PS(o)
    return w.result
  }

  def toStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_PS(data: ISZ[U8]): Either[Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_PS(reader: Reader): Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PreState_Container_PS = {
      val r = reader.readStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_PS()
      return r
    }
    val r = to(data, fStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PreState_Container_PS _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container(o: Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container(o)
    return w.result
  }

  def toStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container(data: ISZ[U8]): Either[Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PostState_Container, MessagePack.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container(reader: Reader): Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PostState_Container = {
      val r = reader.readStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container()
      return r
    }
    val r = to(data, fStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_P(o: Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_P(o)
    return w.result
  }

  def toStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_P(data: ISZ[U8]): Either[Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_P(reader: Reader): Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PostState_Container_P = {
      val r = reader.readStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_P()
      return r
    }
    val r = to(data, fStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_P _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_PS(o: Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_PS(o)
    return w.result
  }

  def toStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_PS(data: ISZ[U8]): Either[Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_PS(reader: Reader): Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_PostState_Container_PS = {
      val r = reader.readStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_PS()
      return r
    }
    val r = to(data, fStation_Cargo_Transfer_Verification_SupervisorSessionController_supervisorProcess_sessionController_PostState_Container_PS _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container(o: Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container(o)
    return w.result
  }

  def toStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container(data: ISZ[U8]): Either[Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container, MessagePack.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container(reader: Reader): Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container = {
      val r = reader.readStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container()
      return r
    }
    val r = to(data, fStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_P(o: Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_P(o)
    return w.result
  }

  def toStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_P(data: ISZ[U8]): Either[Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_P(reader: Reader): Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_P = {
      val r = reader.readStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_P()
      return r
    }
    val r = to(data, fStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_P _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PS(o: Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PS(o)
    return w.result
  }

  def toStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PS(data: ISZ[U8]): Either[Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PS(reader: Reader): Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PS = {
      val r = reader.readStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PS()
      return r
    }
    val r = to(data, fStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PreState_Container_PS _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container(o: Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container(o)
    return w.result
  }

  def toStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container(data: ISZ[U8]): Either[Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container, MessagePack.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container(reader: Reader): Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container = {
      val r = reader.readStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container()
      return r
    }
    val r = to(data, fStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_P(o: Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_P(o)
    return w.result
  }

  def toStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_P(data: ISZ[U8]): Either[Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_P(reader: Reader): Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_P = {
      val r = reader.readStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_P()
      return r
    }
    val r = to(data, fStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_P _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PS(o: Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PS(o)
    return w.result
  }

  def toStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PS(data: ISZ[U8]): Either[Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PS(reader: Reader): Station_Cargo_Transfer_Verification_Supervisor.ShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PS = {
      val r = reader.readStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PS()
      return r
    }
    val r = to(data, fStation_Cargo_Transfer_Verification_SupervisorShipEvidenceQualifier_supervisorProcess_shipEvidenceQualifier_PostState_Container_PS _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container(o: Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container(o)
    return w.result
  }

  def toStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container(data: ISZ[U8]): Either[Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container, MessagePack.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container(reader: Reader): Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container = {
      val r = reader.readStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container()
      return r
    }
    val r = to(data, fStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_P(o: Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_P(o)
    return w.result
  }

  def toStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_P(data: ISZ[U8]): Either[Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_P(reader: Reader): Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_P = {
      val r = reader.readStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_P()
      return r
    }
    val r = to(data, fStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_P _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PS(o: Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PS(o)
    return w.result
  }

  def toStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PS(data: ISZ[U8]): Either[Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PS(reader: Reader): Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PS = {
      val r = reader.readStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PS()
      return r
    }
    val r = to(data, fStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PreState_Container_PS _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container(o: Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container(o)
    return w.result
  }

  def toStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container(data: ISZ[U8]): Either[Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container, MessagePack.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container(reader: Reader): Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container = {
      val r = reader.readStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container()
      return r
    }
    val r = to(data, fStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_P(o: Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_P(o)
    return w.result
  }

  def toStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_P(data: ISZ[U8]): Either[Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_P(reader: Reader): Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_P = {
      val r = reader.readStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_P()
      return r
    }
    val r = to(data, fStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_P _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PS(o: Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PS(o)
    return w.result
  }

  def toStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PS(data: ISZ[U8]): Either[Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PS(reader: Reader): Station_Cargo_Transfer_Verification_Supervisor.WarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PS = {
      val r = reader.readStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PS()
      return r
    }
    val r = to(data, fStation_Cargo_Transfer_Verification_SupervisorWarehouseEvidenceQualifier_supervisorProcess_warehouseEvidenceQualifier_PostState_Container_PS _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container(o: Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container(o)
    return w.result
  }

  def toStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container(data: ISZ[U8]): Either[Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PreState_Container, MessagePack.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container(reader: Reader): Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PreState_Container = {
      val r = reader.readStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container()
      return r
    }
    val r = to(data, fStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_P(o: Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_P(o)
    return w.result
  }

  def toStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_P(data: ISZ[U8]): Either[Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_P(reader: Reader): Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_P = {
      val r = reader.readStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_P()
      return r
    }
    val r = to(data, fStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_P _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PS(o: Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PS(o)
    return w.result
  }

  def toStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PS(data: ISZ[U8]): Either[Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PS(reader: Reader): Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PS = {
      val r = reader.readStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PS()
      return r
    }
    val r = to(data, fStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PreState_Container_PS _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container(o: Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container(o)
    return w.result
  }

  def toStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container(data: ISZ[U8]): Either[Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PostState_Container, MessagePack.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container(reader: Reader): Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PostState_Container = {
      val r = reader.readStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container()
      return r
    }
    val r = to(data, fStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_P(o: Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_P(o)
    return w.result
  }

  def toStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_P(data: ISZ[U8]): Either[Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_P(reader: Reader): Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_P = {
      val r = reader.readStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_P()
      return r
    }
    val r = to(data, fStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_P _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PS(o: Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PS(o)
    return w.result
  }

  def toStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PS(data: ISZ[U8]): Either[Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PS(reader: Reader): Station_Cargo_Transfer_Verification_Supervisor.CompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PS = {
      val r = reader.readStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PS()
      return r
    }
    val r = to(data, fStation_Cargo_Transfer_Verification_SupervisorCompletionReconciler_supervisorProcess_completionReconciler_PostState_Container_PS _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container(o: Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container(o)
    return w.result
  }

  def toStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container(data: ISZ[U8]): Either[Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container, MessagePack.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container(reader: Reader): Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container = {
      val r = reader.readStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container()
      return r
    }
    val r = to(data, fStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_P(o: Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_P(o)
    return w.result
  }

  def toStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_P(data: ISZ[U8]): Either[Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_P(reader: Reader): Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_P = {
      val r = reader.readStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_P()
      return r
    }
    val r = to(data, fStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_P _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PS(o: Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PS(o)
    return w.result
  }

  def toStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PS(data: ISZ[U8]): Either[Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PS(reader: Reader): Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PS = {
      val r = reader.readStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PS()
      return r
    }
    val r = to(data, fStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PreState_Container_PS _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container(o: Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container(o)
    return w.result
  }

  def toStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container(data: ISZ[U8]): Either[Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container, MessagePack.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container(reader: Reader): Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container = {
      val r = reader.readStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container()
      return r
    }
    val r = to(data, fStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_P(o: Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_P(o)
    return w.result
  }

  def toStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_P(data: ISZ[U8]): Either[Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_P(reader: Reader): Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_P = {
      val r = reader.readStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_P()
      return r
    }
    val r = to(data, fStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_P _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PS(o: Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PS(o)
    return w.result
  }

  def toStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PS(data: ISZ[U8]): Either[Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PS(reader: Reader): Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PS = {
      val r = reader.readStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PS()
      return r
    }
    val r = to(data, fStation_Cargo_Transfer_Verification_SupervisorCommandSafetyGate_supervisorProcess_commandSafetyGate_PostState_Container_PS _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container(o: Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container(o)
    return w.result
  }

  def toStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container(data: ISZ[U8]): Either[Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container, MessagePack.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container(reader: Reader): Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container = {
      val r = reader.readStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container()
      return r
    }
    val r = to(data, fStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_P(o: Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_P(o)
    return w.result
  }

  def toStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_P(data: ISZ[U8]): Either[Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_P(reader: Reader): Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_P = {
      val r = reader.readStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_P()
      return r
    }
    val r = to(data, fStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_P _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PS(o: Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PS(o)
    return w.result
  }

  def toStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PS(data: ISZ[U8]): Either[Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PS(reader: Reader): Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PS = {
      val r = reader.readStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PS()
      return r
    }
    val r = to(data, fStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PreState_Container_PS _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container(o: Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container(o)
    return w.result
  }

  def toStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container(data: ISZ[U8]): Either[Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container, MessagePack.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container(reader: Reader): Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container = {
      val r = reader.readStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container()
      return r
    }
    val r = to(data, fStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_P(o: Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_P(o)
    return w.result
  }

  def toStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_P(data: ISZ[U8]): Either[Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_P(reader: Reader): Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_P = {
      val r = reader.readStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_P()
      return r
    }
    val r = to(data, fStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_P _)
    return r
  }

  def fromStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PS(o: Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PS(o)
    return w.result
  }

  def toStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PS(data: ISZ[U8]): Either[Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PS(reader: Reader): Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PS = {
      val r = reader.readStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PS()
      return r
    }
    val r = to(data, fStation_Cargo_Transfer_Verification_SupervisorOutcomeReporter_supervisorProcess_outcomeReporter_PostState_Container_PS _)
    return r
  }

  def fromutilContainer(o: util.Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeutilContainer(o)
    return w.result
  }

  def toutilContainer(data: ISZ[U8]): Either[util.Container, MessagePack.ErrorMsg] = {
    def futilContainer(reader: Reader): util.Container = {
      val r = reader.readutilContainer()
      return r
    }
    val r = to(data, futilContainer _)
    return r
  }

  def fromutilEmptyContainer(o: util.EmptyContainer, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeutilEmptyContainer(o)
    return w.result
  }

  def toutilEmptyContainer(data: ISZ[U8]): Either[util.EmptyContainer, MessagePack.ErrorMsg] = {
    def futilEmptyContainer(reader: Reader): util.EmptyContainer = {
      val r = reader.readutilEmptyContainer()
      return r
    }
    val r = to(data, futilEmptyContainer _)
    return r
  }

  def from_artDataContent(o: art.DataContent, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_artDataContent(o)
    return w.result
  }

  def to_artDataContent(data: ISZ[U8]): Either[art.DataContent, MessagePack.ErrorMsg] = {
    def f_artDataContent(reader: Reader): art.DataContent = {
      val r = reader.read_artDataContent()
      return r
    }
    val r = to(data, f_artDataContent _)
    return r
  }

  def from_artEmpty(o: art.Empty, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_artEmpty(o)
    return w.result
  }

  def to_artEmpty(data: ISZ[U8]): Either[art.Empty, MessagePack.ErrorMsg] = {
    def f_artEmpty(reader: Reader): art.Empty = {
      val r = reader.read_artEmpty()
      return r
    }
    val r = to(data, f_artEmpty _)
    return r
  }

}