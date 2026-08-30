// #Sireum
// @formatter:off

// This file is auto-generated from OffloadRequestEvent.scala, InputStatus.scala, QualifiedRequest.scala, DockingObservation.scala, DockingAssessment.scala, ShipTransferProgress.scala, QualifiedShipProgress.scala, WarehouseReceiptEvidence.scala, QualifiedWarehouseEvidence.scala, TransferPhase.scala, TransferDisposition.scala, CargoTransferCommand.scala, TransferSupervisorStatus.scala, TransferVerificationFinding.scala, OffloadRequestSample.scala, DockingSample.scala, ShipTransferSample.scala, WarehouseReceiptSample.scala, TransferResolution.scala, Base_Types.scala, RequestQualification_supervisionProcess_requestQualification_Containers.scala, DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_Containers.scala, ShipProgressQualification_supervisionProcess_shipProgressQualification_Containers.scala, WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_Containers.scala, TransferDecisionOwner_supervisionProcess_transferDecisionOwner_Containers.scala, TransferCommandDerivation_supervisionProcess_transferCommandDerivation_Containers.scala, TransferReportDerivation_supervisionProcess_transferReportDerivation_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package mining_cargo_transfer_supervisor

import org.sireum._

object MsgPack {

  object Constants {

    val Mining_Cargo_Transfer_SupervisorOffloadRequestEvent_Payload: Z = -32

    val Mining_Cargo_Transfer_SupervisorInputStatus_Payload: Z = -31

    val Mining_Cargo_Transfer_SupervisorQualifiedRequest_Payload: Z = -30

    val Mining_Cargo_Transfer_SupervisorDockingObservation_Payload: Z = -29

    val Mining_Cargo_Transfer_SupervisorDockingAssessment_Payload: Z = -28

    val Mining_Cargo_Transfer_SupervisorShipTransferProgress_Payload: Z = -27

    val Mining_Cargo_Transfer_SupervisorQualifiedShipProgress_Payload: Z = -26

    val Mining_Cargo_Transfer_SupervisorWarehouseReceiptEvidence_Payload: Z = -25

    val Mining_Cargo_Transfer_SupervisorQualifiedWarehouseEvidence_Payload: Z = -24

    val Mining_Cargo_Transfer_SupervisorTransferPhase_Payload: Z = -23

    val Mining_Cargo_Transfer_SupervisorTransferDisposition_Payload: Z = -22

    val Mining_Cargo_Transfer_SupervisorCargoTransferCommand_Payload: Z = -21

    val Mining_Cargo_Transfer_SupervisorTransferSupervisorStatus_Payload: Z = -20

    val Mining_Cargo_Transfer_SupervisorTransferVerificationFinding_Payload: Z = -19

    val Mining_Cargo_Transfer_SupervisorOffloadRequestSample: Z = -18

    val Mining_Cargo_Transfer_SupervisorOffloadRequestSample_Payload: Z = -17

    val Mining_Cargo_Transfer_SupervisorDockingSample: Z = -16

    val Mining_Cargo_Transfer_SupervisorDockingSample_Payload: Z = -15

    val Mining_Cargo_Transfer_SupervisorShipTransferSample: Z = -14

    val Mining_Cargo_Transfer_SupervisorShipTransferSample_Payload: Z = -13

    val Mining_Cargo_Transfer_SupervisorWarehouseReceiptSample: Z = -12

    val Mining_Cargo_Transfer_SupervisorWarehouseReceiptSample_Payload: Z = -11

    val Mining_Cargo_Transfer_SupervisorTransferResolution: Z = -10

    val Mining_Cargo_Transfer_SupervisorTransferResolution_Payload: Z = -9

    val Base_TypesBoolean_Payload: Z = -8

    val Base_TypesInteger_Payload: Z = -7

    val Base_TypesInteger_8_Payload: Z = -6

    val Base_TypesInteger_16_Payload: Z = -5

    val Base_TypesInteger_32_Payload: Z = -4

    val Base_TypesInteger_64_Payload: Z = -3

    val Base_TypesUnsigned_8_Payload: Z = -2

    val Base_TypesUnsigned_16_Payload: Z = -1

    val Base_TypesUnsigned_32_Payload: Z = 0

    val Base_TypesUnsigned_64_Payload: Z = 1

    val Base_TypesFloat_Payload: Z = 2

    val Base_TypesFloat_32_Payload: Z = 3

    val Base_TypesFloat_64_Payload: Z = 4

    val Base_TypesCharacter_Payload: Z = 5

    val Base_TypesString_Payload: Z = 6

    val Base_TypesBits_Payload: Z = 7

    val Mining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_P: Z = 8

    val Mining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_PS: Z = 9

    val Mining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_P: Z = 10

    val Mining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_PS: Z = 11

    val Mining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_P: Z = 12

    val Mining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PS: Z = 13

    val Mining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_P: Z = 14

    val Mining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PS: Z = 15

    val Mining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_P: Z = 16

    val Mining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PS: Z = 17

    val Mining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_P: Z = 18

    val Mining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PS: Z = 19

    val Mining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_P: Z = 20

    val Mining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PS: Z = 21

    val Mining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_P: Z = 22

    val Mining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PS: Z = 23

    val Mining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_P: Z = 24

    val Mining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PS: Z = 25

    val Mining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_P: Z = 26

    val Mining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PS: Z = 27

    val Mining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_P: Z = 28

    val Mining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PS: Z = 29

    val Mining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_P: Z = 30

    val Mining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PS: Z = 31

    val Mining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_P: Z = 32

    val Mining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PS: Z = 33

    val Mining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_P: Z = 34

    val Mining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PS: Z = 35

    val utilEmptyContainer: Z = 36

    val _artEmpty: Z = 37

  }

  object Writer {

    @record class Default(val writer: MessagePack.Writer.Impl) extends Writer

  }

  @msig trait Writer {

    def writer: MessagePack.Writer

    def writeMining_Cargo_Transfer_SupervisorOffloadRequestEventType(o: Mining_Cargo_Transfer_Supervisor.OffloadRequestEvent.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeMining_Cargo_Transfer_SupervisorOffloadRequestEvent_Payload(o: Mining_Cargo_Transfer_Supervisor.OffloadRequestEvent_Payload): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_SupervisorOffloadRequestEvent_Payload)
      writeMining_Cargo_Transfer_SupervisorOffloadRequestEventType(o.value)
    }

    def writeMining_Cargo_Transfer_SupervisorInputStatusType(o: Mining_Cargo_Transfer_Supervisor.InputStatus.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeMining_Cargo_Transfer_SupervisorInputStatus_Payload(o: Mining_Cargo_Transfer_Supervisor.InputStatus_Payload): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_SupervisorInputStatus_Payload)
      writeMining_Cargo_Transfer_SupervisorInputStatusType(o.value)
    }

    def writeMining_Cargo_Transfer_SupervisorQualifiedRequestType(o: Mining_Cargo_Transfer_Supervisor.QualifiedRequest.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeMining_Cargo_Transfer_SupervisorQualifiedRequest_Payload(o: Mining_Cargo_Transfer_Supervisor.QualifiedRequest_Payload): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_SupervisorQualifiedRequest_Payload)
      writeMining_Cargo_Transfer_SupervisorQualifiedRequestType(o.value)
    }

    def writeMining_Cargo_Transfer_SupervisorDockingObservationType(o: Mining_Cargo_Transfer_Supervisor.DockingObservation.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeMining_Cargo_Transfer_SupervisorDockingObservation_Payload(o: Mining_Cargo_Transfer_Supervisor.DockingObservation_Payload): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_SupervisorDockingObservation_Payload)
      writeMining_Cargo_Transfer_SupervisorDockingObservationType(o.value)
    }

    def writeMining_Cargo_Transfer_SupervisorDockingAssessmentType(o: Mining_Cargo_Transfer_Supervisor.DockingAssessment.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeMining_Cargo_Transfer_SupervisorDockingAssessment_Payload(o: Mining_Cargo_Transfer_Supervisor.DockingAssessment_Payload): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_SupervisorDockingAssessment_Payload)
      writeMining_Cargo_Transfer_SupervisorDockingAssessmentType(o.value)
    }

    def writeMining_Cargo_Transfer_SupervisorShipTransferProgressType(o: Mining_Cargo_Transfer_Supervisor.ShipTransferProgress.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeMining_Cargo_Transfer_SupervisorShipTransferProgress_Payload(o: Mining_Cargo_Transfer_Supervisor.ShipTransferProgress_Payload): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_SupervisorShipTransferProgress_Payload)
      writeMining_Cargo_Transfer_SupervisorShipTransferProgressType(o.value)
    }

    def writeMining_Cargo_Transfer_SupervisorQualifiedShipProgressType(o: Mining_Cargo_Transfer_Supervisor.QualifiedShipProgress.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeMining_Cargo_Transfer_SupervisorQualifiedShipProgress_Payload(o: Mining_Cargo_Transfer_Supervisor.QualifiedShipProgress_Payload): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_SupervisorQualifiedShipProgress_Payload)
      writeMining_Cargo_Transfer_SupervisorQualifiedShipProgressType(o.value)
    }

    def writeMining_Cargo_Transfer_SupervisorWarehouseReceiptEvidenceType(o: Mining_Cargo_Transfer_Supervisor.WarehouseReceiptEvidence.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeMining_Cargo_Transfer_SupervisorWarehouseReceiptEvidence_Payload(o: Mining_Cargo_Transfer_Supervisor.WarehouseReceiptEvidence_Payload): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_SupervisorWarehouseReceiptEvidence_Payload)
      writeMining_Cargo_Transfer_SupervisorWarehouseReceiptEvidenceType(o.value)
    }

    def writeMining_Cargo_Transfer_SupervisorQualifiedWarehouseEvidenceType(o: Mining_Cargo_Transfer_Supervisor.QualifiedWarehouseEvidence.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeMining_Cargo_Transfer_SupervisorQualifiedWarehouseEvidence_Payload(o: Mining_Cargo_Transfer_Supervisor.QualifiedWarehouseEvidence_Payload): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_SupervisorQualifiedWarehouseEvidence_Payload)
      writeMining_Cargo_Transfer_SupervisorQualifiedWarehouseEvidenceType(o.value)
    }

    def writeMining_Cargo_Transfer_SupervisorTransferPhaseType(o: Mining_Cargo_Transfer_Supervisor.TransferPhase.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeMining_Cargo_Transfer_SupervisorTransferPhase_Payload(o: Mining_Cargo_Transfer_Supervisor.TransferPhase_Payload): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_SupervisorTransferPhase_Payload)
      writeMining_Cargo_Transfer_SupervisorTransferPhaseType(o.value)
    }

    def writeMining_Cargo_Transfer_SupervisorTransferDispositionType(o: Mining_Cargo_Transfer_Supervisor.TransferDisposition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeMining_Cargo_Transfer_SupervisorTransferDisposition_Payload(o: Mining_Cargo_Transfer_Supervisor.TransferDisposition_Payload): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_SupervisorTransferDisposition_Payload)
      writeMining_Cargo_Transfer_SupervisorTransferDispositionType(o.value)
    }

    def writeMining_Cargo_Transfer_SupervisorCargoTransferCommandType(o: Mining_Cargo_Transfer_Supervisor.CargoTransferCommand.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeMining_Cargo_Transfer_SupervisorCargoTransferCommand_Payload(o: Mining_Cargo_Transfer_Supervisor.CargoTransferCommand_Payload): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_SupervisorCargoTransferCommand_Payload)
      writeMining_Cargo_Transfer_SupervisorCargoTransferCommandType(o.value)
    }

    def writeMining_Cargo_Transfer_SupervisorTransferSupervisorStatusType(o: Mining_Cargo_Transfer_Supervisor.TransferSupervisorStatus.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeMining_Cargo_Transfer_SupervisorTransferSupervisorStatus_Payload(o: Mining_Cargo_Transfer_Supervisor.TransferSupervisorStatus_Payload): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_SupervisorTransferSupervisorStatus_Payload)
      writeMining_Cargo_Transfer_SupervisorTransferSupervisorStatusType(o.value)
    }

    def writeMining_Cargo_Transfer_SupervisorTransferVerificationFindingType(o: Mining_Cargo_Transfer_Supervisor.TransferVerificationFinding.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeMining_Cargo_Transfer_SupervisorTransferVerificationFinding_Payload(o: Mining_Cargo_Transfer_Supervisor.TransferVerificationFinding_Payload): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_SupervisorTransferVerificationFinding_Payload)
      writeMining_Cargo_Transfer_SupervisorTransferVerificationFindingType(o.value)
    }

    def writeMining_Cargo_Transfer_SupervisorOffloadRequestSample(o: Mining_Cargo_Transfer_Supervisor.OffloadRequestSample): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_SupervisorOffloadRequestSample)
      writeMining_Cargo_Transfer_SupervisorOffloadRequestEventType(o.requestEvent)
      writeMining_Cargo_Transfer_SupervisorInputStatusType(o.status)
    }

    def writeMining_Cargo_Transfer_SupervisorOffloadRequestSample_Payload(o: Mining_Cargo_Transfer_Supervisor.OffloadRequestSample_Payload): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_SupervisorOffloadRequestSample_Payload)
      writeMining_Cargo_Transfer_SupervisorOffloadRequestSample(o.value)
    }

    def writeMining_Cargo_Transfer_SupervisorDockingSample(o: Mining_Cargo_Transfer_Supervisor.DockingSample): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_SupervisorDockingSample)
      writeMining_Cargo_Transfer_SupervisorDockingObservationType(o.docking)
      writeMining_Cargo_Transfer_SupervisorInputStatusType(o.status)
    }

    def writeMining_Cargo_Transfer_SupervisorDockingSample_Payload(o: Mining_Cargo_Transfer_Supervisor.DockingSample_Payload): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_SupervisorDockingSample_Payload)
      writeMining_Cargo_Transfer_SupervisorDockingSample(o.value)
    }

    def writeMining_Cargo_Transfer_SupervisorShipTransferSample(o: Mining_Cargo_Transfer_Supervisor.ShipTransferSample): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_SupervisorShipTransferSample)
      writeMining_Cargo_Transfer_SupervisorShipTransferProgressType(o.progress)
      writeMining_Cargo_Transfer_SupervisorInputStatusType(o.status)
    }

    def writeMining_Cargo_Transfer_SupervisorShipTransferSample_Payload(o: Mining_Cargo_Transfer_Supervisor.ShipTransferSample_Payload): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_SupervisorShipTransferSample_Payload)
      writeMining_Cargo_Transfer_SupervisorShipTransferSample(o.value)
    }

    def writeMining_Cargo_Transfer_SupervisorWarehouseReceiptSample(o: Mining_Cargo_Transfer_Supervisor.WarehouseReceiptSample): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_SupervisorWarehouseReceiptSample)
      writeMining_Cargo_Transfer_SupervisorWarehouseReceiptEvidenceType(o.receipt)
      writeMining_Cargo_Transfer_SupervisorInputStatusType(o.status)
    }

    def writeMining_Cargo_Transfer_SupervisorWarehouseReceiptSample_Payload(o: Mining_Cargo_Transfer_Supervisor.WarehouseReceiptSample_Payload): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_SupervisorWarehouseReceiptSample_Payload)
      writeMining_Cargo_Transfer_SupervisorWarehouseReceiptSample(o.value)
    }

    def writeMining_Cargo_Transfer_SupervisorTransferResolution(o: Mining_Cargo_Transfer_Supervisor.TransferResolution): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_SupervisorTransferResolution)
      writeMining_Cargo_Transfer_SupervisorTransferPhaseType(o.nextPhase)
      writer.writeB(o.nextRearmRequired)
      writeMining_Cargo_Transfer_SupervisorTransferDispositionType(o.disposition)
    }

    def writeMining_Cargo_Transfer_SupervisorTransferResolution_Payload(o: Mining_Cargo_Transfer_Supervisor.TransferResolution_Payload): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_SupervisorTransferResolution_Payload)
      writeMining_Cargo_Transfer_SupervisorTransferResolution(o.value)
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

    def writeMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container(o: Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PreState_Container): Unit = {
      o match {
        case o: Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PreState_Container_P => writeMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PreState_Container_PS => writeMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_PS(o)
      }
    }

    def writeMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_P(o: Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_P)
      writeMining_Cargo_Transfer_SupervisorOffloadRequestSample(o.api_requestSample)
    }

    def writeMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_PS(o: Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_PS)
      writeMining_Cargo_Transfer_SupervisorOffloadRequestSample(o.api_requestSample)
    }

    def writeMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container(o: Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PostState_Container): Unit = {
      o match {
        case o: Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PostState_Container_P => writeMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PostState_Container_PS => writeMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_PS(o)
      }
    }

    def writeMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_P(o: Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_P)
      writeMining_Cargo_Transfer_SupervisorQualifiedRequestType(o.api_qualifiedRequest)
    }

    def writeMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_PS(o: Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_PS)
      writeMining_Cargo_Transfer_SupervisorQualifiedRequestType(o.api_qualifiedRequest)
    }

    def writeMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container(o: Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container): Unit = {
      o match {
        case o: Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_P => writeMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PS => writeMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PS(o)
      }
    }

    def writeMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_P(o: Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_P)
      writeMining_Cargo_Transfer_SupervisorDockingSample(o.api_dockingSample)
    }

    def writeMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PS(o: Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PS)
      writeMining_Cargo_Transfer_SupervisorDockingSample(o.api_dockingSample)
    }

    def writeMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container(o: Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container): Unit = {
      o match {
        case o: Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_P => writeMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PS => writeMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PS(o)
      }
    }

    def writeMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_P(o: Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_P)
      writeMining_Cargo_Transfer_SupervisorDockingAssessmentType(o.api_dockingAssessment)
    }

    def writeMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PS(o: Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PS)
      writeMining_Cargo_Transfer_SupervisorDockingAssessmentType(o.api_dockingAssessment)
    }

    def writeMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container(o: Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container): Unit = {
      o match {
        case o: Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_P => writeMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PS => writeMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PS(o)
      }
    }

    def writeMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_P(o: Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_P)
      writeMining_Cargo_Transfer_SupervisorShipTransferSample(o.api_shipSample)
    }

    def writeMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PS(o: Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PS)
      writeMining_Cargo_Transfer_SupervisorShipTransferSample(o.api_shipSample)
    }

    def writeMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container(o: Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container): Unit = {
      o match {
        case o: Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_P => writeMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PS => writeMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PS(o)
      }
    }

    def writeMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_P(o: Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_P)
      writeMining_Cargo_Transfer_SupervisorQualifiedShipProgressType(o.api_qualifiedShipProgress)
    }

    def writeMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PS(o: Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PS)
      writeMining_Cargo_Transfer_SupervisorQualifiedShipProgressType(o.api_qualifiedShipProgress)
    }

    def writeMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container(o: Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container): Unit = {
      o match {
        case o: Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_P => writeMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PS => writeMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PS(o)
      }
    }

    def writeMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_P(o: Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_P)
      writeMining_Cargo_Transfer_SupervisorWarehouseReceiptSample(o.api_warehouseSample)
    }

    def writeMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PS(o: Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PS)
      writeMining_Cargo_Transfer_SupervisorWarehouseReceiptSample(o.api_warehouseSample)
    }

    def writeMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container(o: Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container): Unit = {
      o match {
        case o: Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_P => writeMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PS => writeMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PS(o)
      }
    }

    def writeMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_P(o: Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_P)
      writeMining_Cargo_Transfer_SupervisorQualifiedWarehouseEvidenceType(o.api_qualifiedWarehouseEvidence)
    }

    def writeMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PS(o: Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PS)
      writeMining_Cargo_Transfer_SupervisorQualifiedWarehouseEvidenceType(o.api_qualifiedWarehouseEvidence)
    }

    def writeMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container(o: Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container): Unit = {
      o match {
        case o: Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_P => writeMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PS => writeMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PS(o)
      }
    }

    def writeMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_P(o: Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_P)
      writeMining_Cargo_Transfer_SupervisorDockingAssessmentType(o.api_dockingAssessment)
      writeMining_Cargo_Transfer_SupervisorQualifiedRequestType(o.api_qualifiedRequest)
      writeMining_Cargo_Transfer_SupervisorQualifiedShipProgressType(o.api_qualifiedShipProgress)
      writeMining_Cargo_Transfer_SupervisorQualifiedWarehouseEvidenceType(o.api_qualifiedWarehouseEvidence)
    }

    def writeMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PS(o: Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PS)
      writeMining_Cargo_Transfer_SupervisorDockingAssessmentType(o.api_dockingAssessment)
      writeMining_Cargo_Transfer_SupervisorQualifiedRequestType(o.api_qualifiedRequest)
      writeMining_Cargo_Transfer_SupervisorQualifiedShipProgressType(o.api_qualifiedShipProgress)
      writeMining_Cargo_Transfer_SupervisorQualifiedWarehouseEvidenceType(o.api_qualifiedWarehouseEvidence)
    }

    def writeMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container(o: Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container): Unit = {
      o match {
        case o: Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_P => writeMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PS => writeMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PS(o)
      }
    }

    def writeMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_P(o: Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_P)
      writeMining_Cargo_Transfer_SupervisorTransferResolution(o.api_commandResolution)
      writeMining_Cargo_Transfer_SupervisorTransferResolution(o.api_reportResolution)
    }

    def writeMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PS(o: Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PS)
      writeMining_Cargo_Transfer_SupervisorTransferResolution(o.api_commandResolution)
      writeMining_Cargo_Transfer_SupervisorTransferResolution(o.api_reportResolution)
    }

    def writeMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container(o: Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container): Unit = {
      o match {
        case o: Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_P => writeMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PS => writeMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PS(o)
      }
    }

    def writeMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_P(o: Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_P)
      writeMining_Cargo_Transfer_SupervisorTransferResolution(o.api_resolution)
    }

    def writeMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PS(o: Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PS)
      writeMining_Cargo_Transfer_SupervisorTransferResolution(o.api_resolution)
    }

    def writeMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container(o: Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container): Unit = {
      o match {
        case o: Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_P => writeMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PS => writeMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PS(o)
      }
    }

    def writeMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_P(o: Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_P)
      writeMining_Cargo_Transfer_SupervisorCargoTransferCommandType(o.api_command)
    }

    def writeMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PS(o: Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PS)
      writeMining_Cargo_Transfer_SupervisorCargoTransferCommandType(o.api_command)
    }

    def writeMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container(o: Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container): Unit = {
      o match {
        case o: Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_P => writeMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PS => writeMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PS(o)
      }
    }

    def writeMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_P(o: Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_P)
      writeMining_Cargo_Transfer_SupervisorTransferResolution(o.api_resolution)
    }

    def writeMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PS(o: Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PS)
      writeMining_Cargo_Transfer_SupervisorTransferResolution(o.api_resolution)
    }

    def writeMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container(o: Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container): Unit = {
      o match {
        case o: Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_P => writeMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PS => writeMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PS(o)
      }
    }

    def writeMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_P(o: Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_P)
      writeMining_Cargo_Transfer_SupervisorTransferSupervisorStatusType(o.api_supervisorStatus)
      writeMining_Cargo_Transfer_SupervisorTransferVerificationFindingType(o.api_verificationFinding)
    }

    def writeMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PS(o: Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PS)
      writeMining_Cargo_Transfer_SupervisorTransferSupervisorStatusType(o.api_supervisorStatus)
      writeMining_Cargo_Transfer_SupervisorTransferVerificationFindingType(o.api_verificationFinding)
    }

    def writeruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeutilContainer(o: util.Container): Unit = {
      o match {
        case o: util.EmptyContainer => writeutilEmptyContainer(o)
        case o: Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PreState_Container_P => writeMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PreState_Container_PS => writeMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PostState_Container_P => writeMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PostState_Container_PS => writeMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_P => writeMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PS => writeMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_P => writeMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PS => writeMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_P => writeMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PS => writeMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_P => writeMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PS => writeMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_P => writeMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PS => writeMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_P => writeMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PS => writeMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_P => writeMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_P => writeMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PS => writeMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PS => writeMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_P => writeMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_P => writeMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PS => writeMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PS => writeMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_P => writeMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PS => writeMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_P => writeMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PS => writeMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PS(o)
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
        case o: Mining_Cargo_Transfer_Supervisor.InputStatus_Payload => writeMining_Cargo_Transfer_SupervisorInputStatus_Payload(o)
        case o: Mining_Cargo_Transfer_Supervisor.TransferPhase_Payload => writeMining_Cargo_Transfer_SupervisorTransferPhase_Payload(o)
        case o: Mining_Cargo_Transfer_Supervisor.DockingSample_Payload => writeMining_Cargo_Transfer_SupervisorDockingSample_Payload(o)
        case o: Mining_Cargo_Transfer_Supervisor.QualifiedRequest_Payload => writeMining_Cargo_Transfer_SupervisorQualifiedRequest_Payload(o)
        case o: Mining_Cargo_Transfer_Supervisor.DockingAssessment_Payload => writeMining_Cargo_Transfer_SupervisorDockingAssessment_Payload(o)
        case o: Mining_Cargo_Transfer_Supervisor.DockingObservation_Payload => writeMining_Cargo_Transfer_SupervisorDockingObservation_Payload(o)
        case o: Mining_Cargo_Transfer_Supervisor.ShipTransferSample_Payload => writeMining_Cargo_Transfer_SupervisorShipTransferSample_Payload(o)
        case o: Mining_Cargo_Transfer_Supervisor.TransferResolution_Payload => writeMining_Cargo_Transfer_SupervisorTransferResolution_Payload(o)
        case o: Mining_Cargo_Transfer_Supervisor.OffloadRequestEvent_Payload => writeMining_Cargo_Transfer_SupervisorOffloadRequestEvent_Payload(o)
        case o: Mining_Cargo_Transfer_Supervisor.TransferDisposition_Payload => writeMining_Cargo_Transfer_SupervisorTransferDisposition_Payload(o)
        case o: Mining_Cargo_Transfer_Supervisor.CargoTransferCommand_Payload => writeMining_Cargo_Transfer_SupervisorCargoTransferCommand_Payload(o)
        case o: Mining_Cargo_Transfer_Supervisor.ShipTransferProgress_Payload => writeMining_Cargo_Transfer_SupervisorShipTransferProgress_Payload(o)
        case o: Mining_Cargo_Transfer_Supervisor.OffloadRequestSample_Payload => writeMining_Cargo_Transfer_SupervisorOffloadRequestSample_Payload(o)
        case o: Mining_Cargo_Transfer_Supervisor.QualifiedShipProgress_Payload => writeMining_Cargo_Transfer_SupervisorQualifiedShipProgress_Payload(o)
        case o: Mining_Cargo_Transfer_Supervisor.WarehouseReceiptSample_Payload => writeMining_Cargo_Transfer_SupervisorWarehouseReceiptSample_Payload(o)
        case o: Mining_Cargo_Transfer_Supervisor.WarehouseReceiptEvidence_Payload => writeMining_Cargo_Transfer_SupervisorWarehouseReceiptEvidence_Payload(o)
        case o: Mining_Cargo_Transfer_Supervisor.TransferSupervisorStatus_Payload => writeMining_Cargo_Transfer_SupervisorTransferSupervisorStatus_Payload(o)
        case o: Mining_Cargo_Transfer_Supervisor.QualifiedWarehouseEvidence_Payload => writeMining_Cargo_Transfer_SupervisorQualifiedWarehouseEvidence_Payload(o)
        case o: Mining_Cargo_Transfer_Supervisor.TransferVerificationFinding_Payload => writeMining_Cargo_Transfer_SupervisorTransferVerificationFinding_Payload(o)
        case o: Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PreState_Container_P => writeMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PreState_Container_PS => writeMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PostState_Container_P => writeMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PostState_Container_PS => writeMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_P => writeMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PS => writeMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_P => writeMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PS => writeMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_P => writeMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PS => writeMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_P => writeMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PS => writeMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_P => writeMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PS => writeMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_P => writeMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PS => writeMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_P => writeMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_P => writeMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PS => writeMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PS => writeMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_P => writeMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_P => writeMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PS => writeMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PS => writeMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_P => writeMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PS => writeMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_P => writeMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PS => writeMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PS(o)
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

    def readMining_Cargo_Transfer_SupervisorOffloadRequestEventType(): Mining_Cargo_Transfer_Supervisor.OffloadRequestEvent.Type = {
      val r = reader.readZ()
      return Mining_Cargo_Transfer_Supervisor.OffloadRequestEvent.byOrdinal(r).get
    }

    def readMining_Cargo_Transfer_SupervisorOffloadRequestEvent_Payload(): Mining_Cargo_Transfer_Supervisor.OffloadRequestEvent_Payload = {
      val r = readMining_Cargo_Transfer_SupervisorOffloadRequestEvent_PayloadT(F)
      return r
    }

    def readMining_Cargo_Transfer_SupervisorOffloadRequestEvent_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.OffloadRequestEvent_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_SupervisorOffloadRequestEvent_Payload)
      }
      val value = readMining_Cargo_Transfer_SupervisorOffloadRequestEventType()
      return Mining_Cargo_Transfer_Supervisor.OffloadRequestEvent_Payload(value)
    }

    def readMining_Cargo_Transfer_SupervisorInputStatusType(): Mining_Cargo_Transfer_Supervisor.InputStatus.Type = {
      val r = reader.readZ()
      return Mining_Cargo_Transfer_Supervisor.InputStatus.byOrdinal(r).get
    }

    def readMining_Cargo_Transfer_SupervisorInputStatus_Payload(): Mining_Cargo_Transfer_Supervisor.InputStatus_Payload = {
      val r = readMining_Cargo_Transfer_SupervisorInputStatus_PayloadT(F)
      return r
    }

    def readMining_Cargo_Transfer_SupervisorInputStatus_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.InputStatus_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_SupervisorInputStatus_Payload)
      }
      val value = readMining_Cargo_Transfer_SupervisorInputStatusType()
      return Mining_Cargo_Transfer_Supervisor.InputStatus_Payload(value)
    }

    def readMining_Cargo_Transfer_SupervisorQualifiedRequestType(): Mining_Cargo_Transfer_Supervisor.QualifiedRequest.Type = {
      val r = reader.readZ()
      return Mining_Cargo_Transfer_Supervisor.QualifiedRequest.byOrdinal(r).get
    }

    def readMining_Cargo_Transfer_SupervisorQualifiedRequest_Payload(): Mining_Cargo_Transfer_Supervisor.QualifiedRequest_Payload = {
      val r = readMining_Cargo_Transfer_SupervisorQualifiedRequest_PayloadT(F)
      return r
    }

    def readMining_Cargo_Transfer_SupervisorQualifiedRequest_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.QualifiedRequest_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_SupervisorQualifiedRequest_Payload)
      }
      val value = readMining_Cargo_Transfer_SupervisorQualifiedRequestType()
      return Mining_Cargo_Transfer_Supervisor.QualifiedRequest_Payload(value)
    }

    def readMining_Cargo_Transfer_SupervisorDockingObservationType(): Mining_Cargo_Transfer_Supervisor.DockingObservation.Type = {
      val r = reader.readZ()
      return Mining_Cargo_Transfer_Supervisor.DockingObservation.byOrdinal(r).get
    }

    def readMining_Cargo_Transfer_SupervisorDockingObservation_Payload(): Mining_Cargo_Transfer_Supervisor.DockingObservation_Payload = {
      val r = readMining_Cargo_Transfer_SupervisorDockingObservation_PayloadT(F)
      return r
    }

    def readMining_Cargo_Transfer_SupervisorDockingObservation_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.DockingObservation_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_SupervisorDockingObservation_Payload)
      }
      val value = readMining_Cargo_Transfer_SupervisorDockingObservationType()
      return Mining_Cargo_Transfer_Supervisor.DockingObservation_Payload(value)
    }

    def readMining_Cargo_Transfer_SupervisorDockingAssessmentType(): Mining_Cargo_Transfer_Supervisor.DockingAssessment.Type = {
      val r = reader.readZ()
      return Mining_Cargo_Transfer_Supervisor.DockingAssessment.byOrdinal(r).get
    }

    def readMining_Cargo_Transfer_SupervisorDockingAssessment_Payload(): Mining_Cargo_Transfer_Supervisor.DockingAssessment_Payload = {
      val r = readMining_Cargo_Transfer_SupervisorDockingAssessment_PayloadT(F)
      return r
    }

    def readMining_Cargo_Transfer_SupervisorDockingAssessment_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.DockingAssessment_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_SupervisorDockingAssessment_Payload)
      }
      val value = readMining_Cargo_Transfer_SupervisorDockingAssessmentType()
      return Mining_Cargo_Transfer_Supervisor.DockingAssessment_Payload(value)
    }

    def readMining_Cargo_Transfer_SupervisorShipTransferProgressType(): Mining_Cargo_Transfer_Supervisor.ShipTransferProgress.Type = {
      val r = reader.readZ()
      return Mining_Cargo_Transfer_Supervisor.ShipTransferProgress.byOrdinal(r).get
    }

    def readMining_Cargo_Transfer_SupervisorShipTransferProgress_Payload(): Mining_Cargo_Transfer_Supervisor.ShipTransferProgress_Payload = {
      val r = readMining_Cargo_Transfer_SupervisorShipTransferProgress_PayloadT(F)
      return r
    }

    def readMining_Cargo_Transfer_SupervisorShipTransferProgress_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.ShipTransferProgress_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_SupervisorShipTransferProgress_Payload)
      }
      val value = readMining_Cargo_Transfer_SupervisorShipTransferProgressType()
      return Mining_Cargo_Transfer_Supervisor.ShipTransferProgress_Payload(value)
    }

    def readMining_Cargo_Transfer_SupervisorQualifiedShipProgressType(): Mining_Cargo_Transfer_Supervisor.QualifiedShipProgress.Type = {
      val r = reader.readZ()
      return Mining_Cargo_Transfer_Supervisor.QualifiedShipProgress.byOrdinal(r).get
    }

    def readMining_Cargo_Transfer_SupervisorQualifiedShipProgress_Payload(): Mining_Cargo_Transfer_Supervisor.QualifiedShipProgress_Payload = {
      val r = readMining_Cargo_Transfer_SupervisorQualifiedShipProgress_PayloadT(F)
      return r
    }

    def readMining_Cargo_Transfer_SupervisorQualifiedShipProgress_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.QualifiedShipProgress_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_SupervisorQualifiedShipProgress_Payload)
      }
      val value = readMining_Cargo_Transfer_SupervisorQualifiedShipProgressType()
      return Mining_Cargo_Transfer_Supervisor.QualifiedShipProgress_Payload(value)
    }

    def readMining_Cargo_Transfer_SupervisorWarehouseReceiptEvidenceType(): Mining_Cargo_Transfer_Supervisor.WarehouseReceiptEvidence.Type = {
      val r = reader.readZ()
      return Mining_Cargo_Transfer_Supervisor.WarehouseReceiptEvidence.byOrdinal(r).get
    }

    def readMining_Cargo_Transfer_SupervisorWarehouseReceiptEvidence_Payload(): Mining_Cargo_Transfer_Supervisor.WarehouseReceiptEvidence_Payload = {
      val r = readMining_Cargo_Transfer_SupervisorWarehouseReceiptEvidence_PayloadT(F)
      return r
    }

    def readMining_Cargo_Transfer_SupervisorWarehouseReceiptEvidence_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.WarehouseReceiptEvidence_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_SupervisorWarehouseReceiptEvidence_Payload)
      }
      val value = readMining_Cargo_Transfer_SupervisorWarehouseReceiptEvidenceType()
      return Mining_Cargo_Transfer_Supervisor.WarehouseReceiptEvidence_Payload(value)
    }

    def readMining_Cargo_Transfer_SupervisorQualifiedWarehouseEvidenceType(): Mining_Cargo_Transfer_Supervisor.QualifiedWarehouseEvidence.Type = {
      val r = reader.readZ()
      return Mining_Cargo_Transfer_Supervisor.QualifiedWarehouseEvidence.byOrdinal(r).get
    }

    def readMining_Cargo_Transfer_SupervisorQualifiedWarehouseEvidence_Payload(): Mining_Cargo_Transfer_Supervisor.QualifiedWarehouseEvidence_Payload = {
      val r = readMining_Cargo_Transfer_SupervisorQualifiedWarehouseEvidence_PayloadT(F)
      return r
    }

    def readMining_Cargo_Transfer_SupervisorQualifiedWarehouseEvidence_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.QualifiedWarehouseEvidence_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_SupervisorQualifiedWarehouseEvidence_Payload)
      }
      val value = readMining_Cargo_Transfer_SupervisorQualifiedWarehouseEvidenceType()
      return Mining_Cargo_Transfer_Supervisor.QualifiedWarehouseEvidence_Payload(value)
    }

    def readMining_Cargo_Transfer_SupervisorTransferPhaseType(): Mining_Cargo_Transfer_Supervisor.TransferPhase.Type = {
      val r = reader.readZ()
      return Mining_Cargo_Transfer_Supervisor.TransferPhase.byOrdinal(r).get
    }

    def readMining_Cargo_Transfer_SupervisorTransferPhase_Payload(): Mining_Cargo_Transfer_Supervisor.TransferPhase_Payload = {
      val r = readMining_Cargo_Transfer_SupervisorTransferPhase_PayloadT(F)
      return r
    }

    def readMining_Cargo_Transfer_SupervisorTransferPhase_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.TransferPhase_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_SupervisorTransferPhase_Payload)
      }
      val value = readMining_Cargo_Transfer_SupervisorTransferPhaseType()
      return Mining_Cargo_Transfer_Supervisor.TransferPhase_Payload(value)
    }

    def readMining_Cargo_Transfer_SupervisorTransferDispositionType(): Mining_Cargo_Transfer_Supervisor.TransferDisposition.Type = {
      val r = reader.readZ()
      return Mining_Cargo_Transfer_Supervisor.TransferDisposition.byOrdinal(r).get
    }

    def readMining_Cargo_Transfer_SupervisorTransferDisposition_Payload(): Mining_Cargo_Transfer_Supervisor.TransferDisposition_Payload = {
      val r = readMining_Cargo_Transfer_SupervisorTransferDisposition_PayloadT(F)
      return r
    }

    def readMining_Cargo_Transfer_SupervisorTransferDisposition_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.TransferDisposition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_SupervisorTransferDisposition_Payload)
      }
      val value = readMining_Cargo_Transfer_SupervisorTransferDispositionType()
      return Mining_Cargo_Transfer_Supervisor.TransferDisposition_Payload(value)
    }

    def readMining_Cargo_Transfer_SupervisorCargoTransferCommandType(): Mining_Cargo_Transfer_Supervisor.CargoTransferCommand.Type = {
      val r = reader.readZ()
      return Mining_Cargo_Transfer_Supervisor.CargoTransferCommand.byOrdinal(r).get
    }

    def readMining_Cargo_Transfer_SupervisorCargoTransferCommand_Payload(): Mining_Cargo_Transfer_Supervisor.CargoTransferCommand_Payload = {
      val r = readMining_Cargo_Transfer_SupervisorCargoTransferCommand_PayloadT(F)
      return r
    }

    def readMining_Cargo_Transfer_SupervisorCargoTransferCommand_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.CargoTransferCommand_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_SupervisorCargoTransferCommand_Payload)
      }
      val value = readMining_Cargo_Transfer_SupervisorCargoTransferCommandType()
      return Mining_Cargo_Transfer_Supervisor.CargoTransferCommand_Payload(value)
    }

    def readMining_Cargo_Transfer_SupervisorTransferSupervisorStatusType(): Mining_Cargo_Transfer_Supervisor.TransferSupervisorStatus.Type = {
      val r = reader.readZ()
      return Mining_Cargo_Transfer_Supervisor.TransferSupervisorStatus.byOrdinal(r).get
    }

    def readMining_Cargo_Transfer_SupervisorTransferSupervisorStatus_Payload(): Mining_Cargo_Transfer_Supervisor.TransferSupervisorStatus_Payload = {
      val r = readMining_Cargo_Transfer_SupervisorTransferSupervisorStatus_PayloadT(F)
      return r
    }

    def readMining_Cargo_Transfer_SupervisorTransferSupervisorStatus_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.TransferSupervisorStatus_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_SupervisorTransferSupervisorStatus_Payload)
      }
      val value = readMining_Cargo_Transfer_SupervisorTransferSupervisorStatusType()
      return Mining_Cargo_Transfer_Supervisor.TransferSupervisorStatus_Payload(value)
    }

    def readMining_Cargo_Transfer_SupervisorTransferVerificationFindingType(): Mining_Cargo_Transfer_Supervisor.TransferVerificationFinding.Type = {
      val r = reader.readZ()
      return Mining_Cargo_Transfer_Supervisor.TransferVerificationFinding.byOrdinal(r).get
    }

    def readMining_Cargo_Transfer_SupervisorTransferVerificationFinding_Payload(): Mining_Cargo_Transfer_Supervisor.TransferVerificationFinding_Payload = {
      val r = readMining_Cargo_Transfer_SupervisorTransferVerificationFinding_PayloadT(F)
      return r
    }

    def readMining_Cargo_Transfer_SupervisorTransferVerificationFinding_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.TransferVerificationFinding_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_SupervisorTransferVerificationFinding_Payload)
      }
      val value = readMining_Cargo_Transfer_SupervisorTransferVerificationFindingType()
      return Mining_Cargo_Transfer_Supervisor.TransferVerificationFinding_Payload(value)
    }

    def readMining_Cargo_Transfer_SupervisorOffloadRequestSample(): Mining_Cargo_Transfer_Supervisor.OffloadRequestSample = {
      val r = readMining_Cargo_Transfer_SupervisorOffloadRequestSampleT(F)
      return r
    }

    def readMining_Cargo_Transfer_SupervisorOffloadRequestSampleT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.OffloadRequestSample = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_SupervisorOffloadRequestSample)
      }
      val requestEvent = readMining_Cargo_Transfer_SupervisorOffloadRequestEventType()
      val status = readMining_Cargo_Transfer_SupervisorInputStatusType()
      return Mining_Cargo_Transfer_Supervisor.OffloadRequestSample(requestEvent, status)
    }

    def readMining_Cargo_Transfer_SupervisorOffloadRequestSample_Payload(): Mining_Cargo_Transfer_Supervisor.OffloadRequestSample_Payload = {
      val r = readMining_Cargo_Transfer_SupervisorOffloadRequestSample_PayloadT(F)
      return r
    }

    def readMining_Cargo_Transfer_SupervisorOffloadRequestSample_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.OffloadRequestSample_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_SupervisorOffloadRequestSample_Payload)
      }
      val value = readMining_Cargo_Transfer_SupervisorOffloadRequestSample()
      return Mining_Cargo_Transfer_Supervisor.OffloadRequestSample_Payload(value)
    }

    def readMining_Cargo_Transfer_SupervisorDockingSample(): Mining_Cargo_Transfer_Supervisor.DockingSample = {
      val r = readMining_Cargo_Transfer_SupervisorDockingSampleT(F)
      return r
    }

    def readMining_Cargo_Transfer_SupervisorDockingSampleT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.DockingSample = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_SupervisorDockingSample)
      }
      val docking = readMining_Cargo_Transfer_SupervisorDockingObservationType()
      val status = readMining_Cargo_Transfer_SupervisorInputStatusType()
      return Mining_Cargo_Transfer_Supervisor.DockingSample(docking, status)
    }

    def readMining_Cargo_Transfer_SupervisorDockingSample_Payload(): Mining_Cargo_Transfer_Supervisor.DockingSample_Payload = {
      val r = readMining_Cargo_Transfer_SupervisorDockingSample_PayloadT(F)
      return r
    }

    def readMining_Cargo_Transfer_SupervisorDockingSample_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.DockingSample_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_SupervisorDockingSample_Payload)
      }
      val value = readMining_Cargo_Transfer_SupervisorDockingSample()
      return Mining_Cargo_Transfer_Supervisor.DockingSample_Payload(value)
    }

    def readMining_Cargo_Transfer_SupervisorShipTransferSample(): Mining_Cargo_Transfer_Supervisor.ShipTransferSample = {
      val r = readMining_Cargo_Transfer_SupervisorShipTransferSampleT(F)
      return r
    }

    def readMining_Cargo_Transfer_SupervisorShipTransferSampleT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.ShipTransferSample = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_SupervisorShipTransferSample)
      }
      val progress = readMining_Cargo_Transfer_SupervisorShipTransferProgressType()
      val status = readMining_Cargo_Transfer_SupervisorInputStatusType()
      return Mining_Cargo_Transfer_Supervisor.ShipTransferSample(progress, status)
    }

    def readMining_Cargo_Transfer_SupervisorShipTransferSample_Payload(): Mining_Cargo_Transfer_Supervisor.ShipTransferSample_Payload = {
      val r = readMining_Cargo_Transfer_SupervisorShipTransferSample_PayloadT(F)
      return r
    }

    def readMining_Cargo_Transfer_SupervisorShipTransferSample_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.ShipTransferSample_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_SupervisorShipTransferSample_Payload)
      }
      val value = readMining_Cargo_Transfer_SupervisorShipTransferSample()
      return Mining_Cargo_Transfer_Supervisor.ShipTransferSample_Payload(value)
    }

    def readMining_Cargo_Transfer_SupervisorWarehouseReceiptSample(): Mining_Cargo_Transfer_Supervisor.WarehouseReceiptSample = {
      val r = readMining_Cargo_Transfer_SupervisorWarehouseReceiptSampleT(F)
      return r
    }

    def readMining_Cargo_Transfer_SupervisorWarehouseReceiptSampleT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.WarehouseReceiptSample = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_SupervisorWarehouseReceiptSample)
      }
      val receipt = readMining_Cargo_Transfer_SupervisorWarehouseReceiptEvidenceType()
      val status = readMining_Cargo_Transfer_SupervisorInputStatusType()
      return Mining_Cargo_Transfer_Supervisor.WarehouseReceiptSample(receipt, status)
    }

    def readMining_Cargo_Transfer_SupervisorWarehouseReceiptSample_Payload(): Mining_Cargo_Transfer_Supervisor.WarehouseReceiptSample_Payload = {
      val r = readMining_Cargo_Transfer_SupervisorWarehouseReceiptSample_PayloadT(F)
      return r
    }

    def readMining_Cargo_Transfer_SupervisorWarehouseReceiptSample_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.WarehouseReceiptSample_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_SupervisorWarehouseReceiptSample_Payload)
      }
      val value = readMining_Cargo_Transfer_SupervisorWarehouseReceiptSample()
      return Mining_Cargo_Transfer_Supervisor.WarehouseReceiptSample_Payload(value)
    }

    def readMining_Cargo_Transfer_SupervisorTransferResolution(): Mining_Cargo_Transfer_Supervisor.TransferResolution = {
      val r = readMining_Cargo_Transfer_SupervisorTransferResolutionT(F)
      return r
    }

    def readMining_Cargo_Transfer_SupervisorTransferResolutionT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.TransferResolution = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_SupervisorTransferResolution)
      }
      val nextPhase = readMining_Cargo_Transfer_SupervisorTransferPhaseType()
      val nextRearmRequired = reader.readB()
      val disposition = readMining_Cargo_Transfer_SupervisorTransferDispositionType()
      return Mining_Cargo_Transfer_Supervisor.TransferResolution(nextPhase, nextRearmRequired, disposition)
    }

    def readMining_Cargo_Transfer_SupervisorTransferResolution_Payload(): Mining_Cargo_Transfer_Supervisor.TransferResolution_Payload = {
      val r = readMining_Cargo_Transfer_SupervisorTransferResolution_PayloadT(F)
      return r
    }

    def readMining_Cargo_Transfer_SupervisorTransferResolution_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.TransferResolution_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_SupervisorTransferResolution_Payload)
      }
      val value = readMining_Cargo_Transfer_SupervisorTransferResolution()
      return Mining_Cargo_Transfer_Supervisor.TransferResolution_Payload(value)
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

    def readMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container(): Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_P => val r = readMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_PS => val r = readMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PreState_Container.")
          val r = readMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_PST(T)
          return r
      }
    }

    def readMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_P(): Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PreState_Container_P = {
      val r = readMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_PT(F)
      return r
    }

    def readMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_P)
      }
      val api_requestSample = readMining_Cargo_Transfer_SupervisorOffloadRequestSample()
      return Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PreState_Container_P(api_requestSample)
    }

    def readMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_PS(): Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PreState_Container_PS = {
      val r = readMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_PST(F)
      return r
    }

    def readMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_PS)
      }
      val api_requestSample = readMining_Cargo_Transfer_SupervisorOffloadRequestSample()
      return Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PreState_Container_PS(api_requestSample)
    }

    def readMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container(): Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_P => val r = readMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_PS => val r = readMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PostState_Container.")
          val r = readMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_PST(T)
          return r
      }
    }

    def readMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_P(): Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PostState_Container_P = {
      val r = readMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_PT(F)
      return r
    }

    def readMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_P)
      }
      val api_qualifiedRequest = readMining_Cargo_Transfer_SupervisorQualifiedRequestType()
      return Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PostState_Container_P(api_qualifiedRequest)
    }

    def readMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_PS(): Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PostState_Container_PS = {
      val r = readMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_PST(F)
      return r
    }

    def readMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_PS)
      }
      val api_qualifiedRequest = readMining_Cargo_Transfer_SupervisorQualifiedRequestType()
      return Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PostState_Container_PS(api_qualifiedRequest)
    }

    def readMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container(): Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_P => val r = readMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PS => val r = readMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container.")
          val r = readMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PST(T)
          return r
      }
    }

    def readMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_P(): Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_P = {
      val r = readMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PT(F)
      return r
    }

    def readMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_P)
      }
      val api_dockingSample = readMining_Cargo_Transfer_SupervisorDockingSample()
      return Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_P(api_dockingSample)
    }

    def readMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PS(): Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PS = {
      val r = readMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PST(F)
      return r
    }

    def readMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PS)
      }
      val api_dockingSample = readMining_Cargo_Transfer_SupervisorDockingSample()
      return Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PS(api_dockingSample)
    }

    def readMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container(): Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_P => val r = readMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PS => val r = readMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container.")
          val r = readMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PST(T)
          return r
      }
    }

    def readMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_P(): Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_P = {
      val r = readMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PT(F)
      return r
    }

    def readMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_P)
      }
      val api_dockingAssessment = readMining_Cargo_Transfer_SupervisorDockingAssessmentType()
      return Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_P(api_dockingAssessment)
    }

    def readMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PS(): Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PS = {
      val r = readMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PST(F)
      return r
    }

    def readMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PS)
      }
      val api_dockingAssessment = readMining_Cargo_Transfer_SupervisorDockingAssessmentType()
      return Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PS(api_dockingAssessment)
    }

    def readMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container(): Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_P => val r = readMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PS => val r = readMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container.")
          val r = readMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PST(T)
          return r
      }
    }

    def readMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_P(): Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_P = {
      val r = readMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PT(F)
      return r
    }

    def readMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_P)
      }
      val api_shipSample = readMining_Cargo_Transfer_SupervisorShipTransferSample()
      return Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_P(api_shipSample)
    }

    def readMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PS(): Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PS = {
      val r = readMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PST(F)
      return r
    }

    def readMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PS)
      }
      val api_shipSample = readMining_Cargo_Transfer_SupervisorShipTransferSample()
      return Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PS(api_shipSample)
    }

    def readMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container(): Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_P => val r = readMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PS => val r = readMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container.")
          val r = readMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PST(T)
          return r
      }
    }

    def readMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_P(): Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_P = {
      val r = readMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PT(F)
      return r
    }

    def readMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_P)
      }
      val api_qualifiedShipProgress = readMining_Cargo_Transfer_SupervisorQualifiedShipProgressType()
      return Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_P(api_qualifiedShipProgress)
    }

    def readMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PS(): Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PS = {
      val r = readMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PST(F)
      return r
    }

    def readMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PS)
      }
      val api_qualifiedShipProgress = readMining_Cargo_Transfer_SupervisorQualifiedShipProgressType()
      return Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PS(api_qualifiedShipProgress)
    }

    def readMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container(): Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_P => val r = readMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PS => val r = readMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container.")
          val r = readMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PST(T)
          return r
      }
    }

    def readMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_P(): Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_P = {
      val r = readMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PT(F)
      return r
    }

    def readMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_P)
      }
      val api_warehouseSample = readMining_Cargo_Transfer_SupervisorWarehouseReceiptSample()
      return Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_P(api_warehouseSample)
    }

    def readMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PS(): Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PS = {
      val r = readMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PST(F)
      return r
    }

    def readMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PS)
      }
      val api_warehouseSample = readMining_Cargo_Transfer_SupervisorWarehouseReceiptSample()
      return Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PS(api_warehouseSample)
    }

    def readMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container(): Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_P => val r = readMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PS => val r = readMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container.")
          val r = readMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PST(T)
          return r
      }
    }

    def readMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_P(): Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_P = {
      val r = readMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PT(F)
      return r
    }

    def readMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_P)
      }
      val api_qualifiedWarehouseEvidence = readMining_Cargo_Transfer_SupervisorQualifiedWarehouseEvidenceType()
      return Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_P(api_qualifiedWarehouseEvidence)
    }

    def readMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PS(): Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PS = {
      val r = readMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PST(F)
      return r
    }

    def readMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PS)
      }
      val api_qualifiedWarehouseEvidence = readMining_Cargo_Transfer_SupervisorQualifiedWarehouseEvidenceType()
      return Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PS(api_qualifiedWarehouseEvidence)
    }

    def readMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container(): Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_P => val r = readMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PS => val r = readMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container.")
          val r = readMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PST(T)
          return r
      }
    }

    def readMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_P(): Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_P = {
      val r = readMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PT(F)
      return r
    }

    def readMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_P)
      }
      val api_dockingAssessment = readMining_Cargo_Transfer_SupervisorDockingAssessmentType()
      val api_qualifiedRequest = readMining_Cargo_Transfer_SupervisorQualifiedRequestType()
      val api_qualifiedShipProgress = readMining_Cargo_Transfer_SupervisorQualifiedShipProgressType()
      val api_qualifiedWarehouseEvidence = readMining_Cargo_Transfer_SupervisorQualifiedWarehouseEvidenceType()
      return Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_P(api_dockingAssessment, api_qualifiedRequest, api_qualifiedShipProgress, api_qualifiedWarehouseEvidence)
    }

    def readMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PS(): Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PS = {
      val r = readMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PST(F)
      return r
    }

    def readMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PS)
      }
      val api_dockingAssessment = readMining_Cargo_Transfer_SupervisorDockingAssessmentType()
      val api_qualifiedRequest = readMining_Cargo_Transfer_SupervisorQualifiedRequestType()
      val api_qualifiedShipProgress = readMining_Cargo_Transfer_SupervisorQualifiedShipProgressType()
      val api_qualifiedWarehouseEvidence = readMining_Cargo_Transfer_SupervisorQualifiedWarehouseEvidenceType()
      return Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PS(api_dockingAssessment, api_qualifiedRequest, api_qualifiedShipProgress, api_qualifiedWarehouseEvidence)
    }

    def readMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container(): Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_P => val r = readMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PS => val r = readMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container.")
          val r = readMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PST(T)
          return r
      }
    }

    def readMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_P(): Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_P = {
      val r = readMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PT(F)
      return r
    }

    def readMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_P)
      }
      val api_commandResolution = readMining_Cargo_Transfer_SupervisorTransferResolution()
      val api_reportResolution = readMining_Cargo_Transfer_SupervisorTransferResolution()
      return Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_P(api_commandResolution, api_reportResolution)
    }

    def readMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PS(): Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PS = {
      val r = readMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PST(F)
      return r
    }

    def readMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PS)
      }
      val api_commandResolution = readMining_Cargo_Transfer_SupervisorTransferResolution()
      val api_reportResolution = readMining_Cargo_Transfer_SupervisorTransferResolution()
      return Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PS(api_commandResolution, api_reportResolution)
    }

    def readMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container(): Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_P => val r = readMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PS => val r = readMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container.")
          val r = readMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PST(T)
          return r
      }
    }

    def readMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_P(): Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_P = {
      val r = readMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PT(F)
      return r
    }

    def readMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_P)
      }
      val api_resolution = readMining_Cargo_Transfer_SupervisorTransferResolution()
      return Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_P(api_resolution)
    }

    def readMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PS(): Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PS = {
      val r = readMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PST(F)
      return r
    }

    def readMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PS)
      }
      val api_resolution = readMining_Cargo_Transfer_SupervisorTransferResolution()
      return Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PS(api_resolution)
    }

    def readMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container(): Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_P => val r = readMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PS => val r = readMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container.")
          val r = readMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PST(T)
          return r
      }
    }

    def readMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_P(): Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_P = {
      val r = readMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PT(F)
      return r
    }

    def readMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_P)
      }
      val api_command = readMining_Cargo_Transfer_SupervisorCargoTransferCommandType()
      return Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_P(api_command)
    }

    def readMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PS(): Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PS = {
      val r = readMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PST(F)
      return r
    }

    def readMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PS)
      }
      val api_command = readMining_Cargo_Transfer_SupervisorCargoTransferCommandType()
      return Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PS(api_command)
    }

    def readMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container(): Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_P => val r = readMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PS => val r = readMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container.")
          val r = readMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PST(T)
          return r
      }
    }

    def readMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_P(): Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_P = {
      val r = readMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PT(F)
      return r
    }

    def readMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_P)
      }
      val api_resolution = readMining_Cargo_Transfer_SupervisorTransferResolution()
      return Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_P(api_resolution)
    }

    def readMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PS(): Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PS = {
      val r = readMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PST(F)
      return r
    }

    def readMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PS)
      }
      val api_resolution = readMining_Cargo_Transfer_SupervisorTransferResolution()
      return Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PS(api_resolution)
    }

    def readMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container(): Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_P => val r = readMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PS => val r = readMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container.")
          val r = readMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PST(T)
          return r
      }
    }

    def readMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_P(): Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_P = {
      val r = readMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PT(F)
      return r
    }

    def readMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_P)
      }
      val api_supervisorStatus = readMining_Cargo_Transfer_SupervisorTransferSupervisorStatusType()
      val api_verificationFinding = readMining_Cargo_Transfer_SupervisorTransferVerificationFindingType()
      return Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_P(api_supervisorStatus, api_verificationFinding)
    }

    def readMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PS(): Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PS = {
      val r = readMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PST(F)
      return r
    }

    def readMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PS)
      }
      val api_supervisorStatus = readMining_Cargo_Transfer_SupervisorTransferSupervisorStatusType()
      val api_verificationFinding = readMining_Cargo_Transfer_SupervisorTransferVerificationFindingType()
      return Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PS(api_supervisorStatus, api_verificationFinding)
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
        case Constants.Mining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_P => val r = readMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_PS => val r = readMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_P => val r = readMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_PS => val r = readMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_P => val r = readMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PS => val r = readMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_P => val r = readMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PS => val r = readMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_P => val r = readMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PS => val r = readMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_P => val r = readMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PS => val r = readMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_P => val r = readMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PS => val r = readMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_P => val r = readMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PS => val r = readMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_P => val r = readMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_P => val r = readMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PS => val r = readMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PS => val r = readMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_P => val r = readMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_P => val r = readMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PS => val r = readMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PS => val r = readMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_P => val r = readMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PS => val r = readMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_P => val r = readMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PS => val r = readMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of util.Container.")
          val r = readMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PST(T)
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
        case Constants.Mining_Cargo_Transfer_SupervisorInputStatus_Payload => val r = readMining_Cargo_Transfer_SupervisorInputStatus_PayloadT(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorTransferPhase_Payload => val r = readMining_Cargo_Transfer_SupervisorTransferPhase_PayloadT(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorDockingSample_Payload => val r = readMining_Cargo_Transfer_SupervisorDockingSample_PayloadT(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorQualifiedRequest_Payload => val r = readMining_Cargo_Transfer_SupervisorQualifiedRequest_PayloadT(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorDockingAssessment_Payload => val r = readMining_Cargo_Transfer_SupervisorDockingAssessment_PayloadT(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorDockingObservation_Payload => val r = readMining_Cargo_Transfer_SupervisorDockingObservation_PayloadT(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorShipTransferSample_Payload => val r = readMining_Cargo_Transfer_SupervisorShipTransferSample_PayloadT(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorTransferResolution_Payload => val r = readMining_Cargo_Transfer_SupervisorTransferResolution_PayloadT(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorOffloadRequestEvent_Payload => val r = readMining_Cargo_Transfer_SupervisorOffloadRequestEvent_PayloadT(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorTransferDisposition_Payload => val r = readMining_Cargo_Transfer_SupervisorTransferDisposition_PayloadT(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorCargoTransferCommand_Payload => val r = readMining_Cargo_Transfer_SupervisorCargoTransferCommand_PayloadT(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorShipTransferProgress_Payload => val r = readMining_Cargo_Transfer_SupervisorShipTransferProgress_PayloadT(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorOffloadRequestSample_Payload => val r = readMining_Cargo_Transfer_SupervisorOffloadRequestSample_PayloadT(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorQualifiedShipProgress_Payload => val r = readMining_Cargo_Transfer_SupervisorQualifiedShipProgress_PayloadT(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorWarehouseReceiptSample_Payload => val r = readMining_Cargo_Transfer_SupervisorWarehouseReceiptSample_PayloadT(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorWarehouseReceiptEvidence_Payload => val r = readMining_Cargo_Transfer_SupervisorWarehouseReceiptEvidence_PayloadT(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorTransferSupervisorStatus_Payload => val r = readMining_Cargo_Transfer_SupervisorTransferSupervisorStatus_PayloadT(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorQualifiedWarehouseEvidence_Payload => val r = readMining_Cargo_Transfer_SupervisorQualifiedWarehouseEvidence_PayloadT(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorTransferVerificationFinding_Payload => val r = readMining_Cargo_Transfer_SupervisorTransferVerificationFinding_PayloadT(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_P => val r = readMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_PS => val r = readMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_P => val r = readMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_PS => val r = readMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_P => val r = readMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PS => val r = readMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_P => val r = readMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PS => val r = readMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_P => val r = readMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PS => val r = readMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_P => val r = readMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PS => val r = readMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_P => val r = readMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PS => val r = readMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_P => val r = readMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PS => val r = readMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_P => val r = readMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_P => val r = readMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PS => val r = readMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PS => val r = readMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_P => val r = readMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_P => val r = readMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PS => val r = readMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PS => val r = readMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_P => val r = readMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PS => val r = readMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PST(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_P => val r = readMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PT(T); return r
        case Constants.Mining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PS => val r = readMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of art.DataContent.")
          val r = readMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PST(T)
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

  def fromMining_Cargo_Transfer_SupervisorOffloadRequestEvent_Payload(o: Mining_Cargo_Transfer_Supervisor.OffloadRequestEvent_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_SupervisorOffloadRequestEvent_Payload(o)
    return w.result
  }

  def toMining_Cargo_Transfer_SupervisorOffloadRequestEvent_Payload(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Supervisor.OffloadRequestEvent_Payload, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorOffloadRequestEvent_Payload(reader: Reader): Mining_Cargo_Transfer_Supervisor.OffloadRequestEvent_Payload = {
      val r = reader.readMining_Cargo_Transfer_SupervisorOffloadRequestEvent_Payload()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_SupervisorOffloadRequestEvent_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorInputStatus_Payload(o: Mining_Cargo_Transfer_Supervisor.InputStatus_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_SupervisorInputStatus_Payload(o)
    return w.result
  }

  def toMining_Cargo_Transfer_SupervisorInputStatus_Payload(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Supervisor.InputStatus_Payload, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorInputStatus_Payload(reader: Reader): Mining_Cargo_Transfer_Supervisor.InputStatus_Payload = {
      val r = reader.readMining_Cargo_Transfer_SupervisorInputStatus_Payload()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_SupervisorInputStatus_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorQualifiedRequest_Payload(o: Mining_Cargo_Transfer_Supervisor.QualifiedRequest_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_SupervisorQualifiedRequest_Payload(o)
    return w.result
  }

  def toMining_Cargo_Transfer_SupervisorQualifiedRequest_Payload(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Supervisor.QualifiedRequest_Payload, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorQualifiedRequest_Payload(reader: Reader): Mining_Cargo_Transfer_Supervisor.QualifiedRequest_Payload = {
      val r = reader.readMining_Cargo_Transfer_SupervisorQualifiedRequest_Payload()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_SupervisorQualifiedRequest_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorDockingObservation_Payload(o: Mining_Cargo_Transfer_Supervisor.DockingObservation_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_SupervisorDockingObservation_Payload(o)
    return w.result
  }

  def toMining_Cargo_Transfer_SupervisorDockingObservation_Payload(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Supervisor.DockingObservation_Payload, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorDockingObservation_Payload(reader: Reader): Mining_Cargo_Transfer_Supervisor.DockingObservation_Payload = {
      val r = reader.readMining_Cargo_Transfer_SupervisorDockingObservation_Payload()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_SupervisorDockingObservation_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorDockingAssessment_Payload(o: Mining_Cargo_Transfer_Supervisor.DockingAssessment_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_SupervisorDockingAssessment_Payload(o)
    return w.result
  }

  def toMining_Cargo_Transfer_SupervisorDockingAssessment_Payload(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Supervisor.DockingAssessment_Payload, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorDockingAssessment_Payload(reader: Reader): Mining_Cargo_Transfer_Supervisor.DockingAssessment_Payload = {
      val r = reader.readMining_Cargo_Transfer_SupervisorDockingAssessment_Payload()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_SupervisorDockingAssessment_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorShipTransferProgress_Payload(o: Mining_Cargo_Transfer_Supervisor.ShipTransferProgress_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_SupervisorShipTransferProgress_Payload(o)
    return w.result
  }

  def toMining_Cargo_Transfer_SupervisorShipTransferProgress_Payload(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Supervisor.ShipTransferProgress_Payload, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorShipTransferProgress_Payload(reader: Reader): Mining_Cargo_Transfer_Supervisor.ShipTransferProgress_Payload = {
      val r = reader.readMining_Cargo_Transfer_SupervisorShipTransferProgress_Payload()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_SupervisorShipTransferProgress_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorQualifiedShipProgress_Payload(o: Mining_Cargo_Transfer_Supervisor.QualifiedShipProgress_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_SupervisorQualifiedShipProgress_Payload(o)
    return w.result
  }

  def toMining_Cargo_Transfer_SupervisorQualifiedShipProgress_Payload(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Supervisor.QualifiedShipProgress_Payload, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorQualifiedShipProgress_Payload(reader: Reader): Mining_Cargo_Transfer_Supervisor.QualifiedShipProgress_Payload = {
      val r = reader.readMining_Cargo_Transfer_SupervisorQualifiedShipProgress_Payload()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_SupervisorQualifiedShipProgress_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorWarehouseReceiptEvidence_Payload(o: Mining_Cargo_Transfer_Supervisor.WarehouseReceiptEvidence_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_SupervisorWarehouseReceiptEvidence_Payload(o)
    return w.result
  }

  def toMining_Cargo_Transfer_SupervisorWarehouseReceiptEvidence_Payload(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Supervisor.WarehouseReceiptEvidence_Payload, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorWarehouseReceiptEvidence_Payload(reader: Reader): Mining_Cargo_Transfer_Supervisor.WarehouseReceiptEvidence_Payload = {
      val r = reader.readMining_Cargo_Transfer_SupervisorWarehouseReceiptEvidence_Payload()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_SupervisorWarehouseReceiptEvidence_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorQualifiedWarehouseEvidence_Payload(o: Mining_Cargo_Transfer_Supervisor.QualifiedWarehouseEvidence_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_SupervisorQualifiedWarehouseEvidence_Payload(o)
    return w.result
  }

  def toMining_Cargo_Transfer_SupervisorQualifiedWarehouseEvidence_Payload(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Supervisor.QualifiedWarehouseEvidence_Payload, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorQualifiedWarehouseEvidence_Payload(reader: Reader): Mining_Cargo_Transfer_Supervisor.QualifiedWarehouseEvidence_Payload = {
      val r = reader.readMining_Cargo_Transfer_SupervisorQualifiedWarehouseEvidence_Payload()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_SupervisorQualifiedWarehouseEvidence_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorTransferPhase_Payload(o: Mining_Cargo_Transfer_Supervisor.TransferPhase_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_SupervisorTransferPhase_Payload(o)
    return w.result
  }

  def toMining_Cargo_Transfer_SupervisorTransferPhase_Payload(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Supervisor.TransferPhase_Payload, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorTransferPhase_Payload(reader: Reader): Mining_Cargo_Transfer_Supervisor.TransferPhase_Payload = {
      val r = reader.readMining_Cargo_Transfer_SupervisorTransferPhase_Payload()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_SupervisorTransferPhase_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorTransferDisposition_Payload(o: Mining_Cargo_Transfer_Supervisor.TransferDisposition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_SupervisorTransferDisposition_Payload(o)
    return w.result
  }

  def toMining_Cargo_Transfer_SupervisorTransferDisposition_Payload(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Supervisor.TransferDisposition_Payload, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorTransferDisposition_Payload(reader: Reader): Mining_Cargo_Transfer_Supervisor.TransferDisposition_Payload = {
      val r = reader.readMining_Cargo_Transfer_SupervisorTransferDisposition_Payload()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_SupervisorTransferDisposition_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorCargoTransferCommand_Payload(o: Mining_Cargo_Transfer_Supervisor.CargoTransferCommand_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_SupervisorCargoTransferCommand_Payload(o)
    return w.result
  }

  def toMining_Cargo_Transfer_SupervisorCargoTransferCommand_Payload(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Supervisor.CargoTransferCommand_Payload, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorCargoTransferCommand_Payload(reader: Reader): Mining_Cargo_Transfer_Supervisor.CargoTransferCommand_Payload = {
      val r = reader.readMining_Cargo_Transfer_SupervisorCargoTransferCommand_Payload()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_SupervisorCargoTransferCommand_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorTransferSupervisorStatus_Payload(o: Mining_Cargo_Transfer_Supervisor.TransferSupervisorStatus_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_SupervisorTransferSupervisorStatus_Payload(o)
    return w.result
  }

  def toMining_Cargo_Transfer_SupervisorTransferSupervisorStatus_Payload(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Supervisor.TransferSupervisorStatus_Payload, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorTransferSupervisorStatus_Payload(reader: Reader): Mining_Cargo_Transfer_Supervisor.TransferSupervisorStatus_Payload = {
      val r = reader.readMining_Cargo_Transfer_SupervisorTransferSupervisorStatus_Payload()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_SupervisorTransferSupervisorStatus_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorTransferVerificationFinding_Payload(o: Mining_Cargo_Transfer_Supervisor.TransferVerificationFinding_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_SupervisorTransferVerificationFinding_Payload(o)
    return w.result
  }

  def toMining_Cargo_Transfer_SupervisorTransferVerificationFinding_Payload(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Supervisor.TransferVerificationFinding_Payload, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorTransferVerificationFinding_Payload(reader: Reader): Mining_Cargo_Transfer_Supervisor.TransferVerificationFinding_Payload = {
      val r = reader.readMining_Cargo_Transfer_SupervisorTransferVerificationFinding_Payload()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_SupervisorTransferVerificationFinding_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorOffloadRequestSample(o: Mining_Cargo_Transfer_Supervisor.OffloadRequestSample, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_SupervisorOffloadRequestSample(o)
    return w.result
  }

  def toMining_Cargo_Transfer_SupervisorOffloadRequestSample(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Supervisor.OffloadRequestSample, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorOffloadRequestSample(reader: Reader): Mining_Cargo_Transfer_Supervisor.OffloadRequestSample = {
      val r = reader.readMining_Cargo_Transfer_SupervisorOffloadRequestSample()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_SupervisorOffloadRequestSample _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorOffloadRequestSample_Payload(o: Mining_Cargo_Transfer_Supervisor.OffloadRequestSample_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_SupervisorOffloadRequestSample_Payload(o)
    return w.result
  }

  def toMining_Cargo_Transfer_SupervisorOffloadRequestSample_Payload(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Supervisor.OffloadRequestSample_Payload, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorOffloadRequestSample_Payload(reader: Reader): Mining_Cargo_Transfer_Supervisor.OffloadRequestSample_Payload = {
      val r = reader.readMining_Cargo_Transfer_SupervisorOffloadRequestSample_Payload()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_SupervisorOffloadRequestSample_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorDockingSample(o: Mining_Cargo_Transfer_Supervisor.DockingSample, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_SupervisorDockingSample(o)
    return w.result
  }

  def toMining_Cargo_Transfer_SupervisorDockingSample(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Supervisor.DockingSample, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorDockingSample(reader: Reader): Mining_Cargo_Transfer_Supervisor.DockingSample = {
      val r = reader.readMining_Cargo_Transfer_SupervisorDockingSample()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_SupervisorDockingSample _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorDockingSample_Payload(o: Mining_Cargo_Transfer_Supervisor.DockingSample_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_SupervisorDockingSample_Payload(o)
    return w.result
  }

  def toMining_Cargo_Transfer_SupervisorDockingSample_Payload(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Supervisor.DockingSample_Payload, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorDockingSample_Payload(reader: Reader): Mining_Cargo_Transfer_Supervisor.DockingSample_Payload = {
      val r = reader.readMining_Cargo_Transfer_SupervisorDockingSample_Payload()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_SupervisorDockingSample_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorShipTransferSample(o: Mining_Cargo_Transfer_Supervisor.ShipTransferSample, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_SupervisorShipTransferSample(o)
    return w.result
  }

  def toMining_Cargo_Transfer_SupervisorShipTransferSample(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Supervisor.ShipTransferSample, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorShipTransferSample(reader: Reader): Mining_Cargo_Transfer_Supervisor.ShipTransferSample = {
      val r = reader.readMining_Cargo_Transfer_SupervisorShipTransferSample()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_SupervisorShipTransferSample _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorShipTransferSample_Payload(o: Mining_Cargo_Transfer_Supervisor.ShipTransferSample_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_SupervisorShipTransferSample_Payload(o)
    return w.result
  }

  def toMining_Cargo_Transfer_SupervisorShipTransferSample_Payload(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Supervisor.ShipTransferSample_Payload, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorShipTransferSample_Payload(reader: Reader): Mining_Cargo_Transfer_Supervisor.ShipTransferSample_Payload = {
      val r = reader.readMining_Cargo_Transfer_SupervisorShipTransferSample_Payload()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_SupervisorShipTransferSample_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorWarehouseReceiptSample(o: Mining_Cargo_Transfer_Supervisor.WarehouseReceiptSample, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_SupervisorWarehouseReceiptSample(o)
    return w.result
  }

  def toMining_Cargo_Transfer_SupervisorWarehouseReceiptSample(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Supervisor.WarehouseReceiptSample, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorWarehouseReceiptSample(reader: Reader): Mining_Cargo_Transfer_Supervisor.WarehouseReceiptSample = {
      val r = reader.readMining_Cargo_Transfer_SupervisorWarehouseReceiptSample()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_SupervisorWarehouseReceiptSample _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorWarehouseReceiptSample_Payload(o: Mining_Cargo_Transfer_Supervisor.WarehouseReceiptSample_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_SupervisorWarehouseReceiptSample_Payload(o)
    return w.result
  }

  def toMining_Cargo_Transfer_SupervisorWarehouseReceiptSample_Payload(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Supervisor.WarehouseReceiptSample_Payload, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorWarehouseReceiptSample_Payload(reader: Reader): Mining_Cargo_Transfer_Supervisor.WarehouseReceiptSample_Payload = {
      val r = reader.readMining_Cargo_Transfer_SupervisorWarehouseReceiptSample_Payload()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_SupervisorWarehouseReceiptSample_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorTransferResolution(o: Mining_Cargo_Transfer_Supervisor.TransferResolution, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_SupervisorTransferResolution(o)
    return w.result
  }

  def toMining_Cargo_Transfer_SupervisorTransferResolution(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Supervisor.TransferResolution, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorTransferResolution(reader: Reader): Mining_Cargo_Transfer_Supervisor.TransferResolution = {
      val r = reader.readMining_Cargo_Transfer_SupervisorTransferResolution()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_SupervisorTransferResolution _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorTransferResolution_Payload(o: Mining_Cargo_Transfer_Supervisor.TransferResolution_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_SupervisorTransferResolution_Payload(o)
    return w.result
  }

  def toMining_Cargo_Transfer_SupervisorTransferResolution_Payload(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Supervisor.TransferResolution_Payload, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorTransferResolution_Payload(reader: Reader): Mining_Cargo_Transfer_Supervisor.TransferResolution_Payload = {
      val r = reader.readMining_Cargo_Transfer_SupervisorTransferResolution_Payload()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_SupervisorTransferResolution_Payload _)
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

  def fromMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container(o: Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container(o)
    return w.result
  }

  def toMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PreState_Container, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container(reader: Reader): Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PreState_Container = {
      val r = reader.readMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_P(o: Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_P(o)
    return w.result
  }

  def toMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_P(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_P(reader: Reader): Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PreState_Container_P = {
      val r = reader.readMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_P()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_PS(o: Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_PS(o)
    return w.result
  }

  def toMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_PS(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_PS(reader: Reader): Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PreState_Container_PS = {
      val r = reader.readMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_PS()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PreState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container(o: Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container(o)
    return w.result
  }

  def toMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PostState_Container, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container(reader: Reader): Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PostState_Container = {
      val r = reader.readMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_P(o: Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_P(o)
    return w.result
  }

  def toMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_P(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_P(reader: Reader): Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PostState_Container_P = {
      val r = reader.readMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_P()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_PS(o: Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_PS(o)
    return w.result
  }

  def toMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_PS(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_PS(reader: Reader): Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_PostState_Container_PS = {
      val r = reader.readMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_PS()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_SupervisorRequestQualification_supervisionProcess_requestQualification_PostState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container(o: Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container(o)
    return w.result
  }

  def toMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container(reader: Reader): Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container = {
      val r = reader.readMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_P(o: Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_P(o)
    return w.result
  }

  def toMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_P(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_P(reader: Reader): Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_P = {
      val r = reader.readMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_P()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PS(o: Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PS(o)
    return w.result
  }

  def toMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PS(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PS(reader: Reader): Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PS = {
      val r = reader.readMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PS()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PreState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container(o: Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container(o)
    return w.result
  }

  def toMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container(reader: Reader): Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container = {
      val r = reader.readMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_P(o: Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_P(o)
    return w.result
  }

  def toMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_P(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_P(reader: Reader): Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_P = {
      val r = reader.readMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_P()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PS(o: Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PS(o)
    return w.result
  }

  def toMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PS(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PS(reader: Reader): Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PS = {
      val r = reader.readMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PS()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_SupervisorDockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_PostState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container(o: Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container(o)
    return w.result
  }

  def toMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container(reader: Reader): Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container = {
      val r = reader.readMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_P(o: Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_P(o)
    return w.result
  }

  def toMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_P(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_P(reader: Reader): Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_P = {
      val r = reader.readMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_P()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PS(o: Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PS(o)
    return w.result
  }

  def toMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PS(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PS(reader: Reader): Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PS = {
      val r = reader.readMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PS()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PreState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container(o: Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container(o)
    return w.result
  }

  def toMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container(reader: Reader): Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container = {
      val r = reader.readMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_P(o: Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_P(o)
    return w.result
  }

  def toMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_P(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_P(reader: Reader): Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_P = {
      val r = reader.readMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_P()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PS(o: Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PS(o)
    return w.result
  }

  def toMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PS(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PS(reader: Reader): Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PS = {
      val r = reader.readMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PS()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_SupervisorShipProgressQualification_supervisionProcess_shipProgressQualification_PostState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container(o: Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container(o)
    return w.result
  }

  def toMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container(reader: Reader): Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container = {
      val r = reader.readMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_P(o: Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_P(o)
    return w.result
  }

  def toMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_P(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_P(reader: Reader): Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_P = {
      val r = reader.readMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_P()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PS(o: Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PS(o)
    return w.result
  }

  def toMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PS(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PS(reader: Reader): Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PS = {
      val r = reader.readMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PS()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PreState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container(o: Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container(o)
    return w.result
  }

  def toMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container(reader: Reader): Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container = {
      val r = reader.readMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_P(o: Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_P(o)
    return w.result
  }

  def toMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_P(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_P(reader: Reader): Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_P = {
      val r = reader.readMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_P()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PS(o: Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PS(o)
    return w.result
  }

  def toMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PS(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PS(reader: Reader): Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PS = {
      val r = reader.readMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PS()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_SupervisorWarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_PostState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container(o: Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container(o)
    return w.result
  }

  def toMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container(reader: Reader): Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container = {
      val r = reader.readMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_P(o: Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_P(o)
    return w.result
  }

  def toMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_P(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_P(reader: Reader): Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_P = {
      val r = reader.readMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_P()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PS(o: Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PS(o)
    return w.result
  }

  def toMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PS(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PS(reader: Reader): Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PS = {
      val r = reader.readMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PS()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PreState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container(o: Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container(o)
    return w.result
  }

  def toMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container(reader: Reader): Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container = {
      val r = reader.readMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_P(o: Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_P(o)
    return w.result
  }

  def toMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_P(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_P(reader: Reader): Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_P = {
      val r = reader.readMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_P()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PS(o: Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PS(o)
    return w.result
  }

  def toMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PS(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PS(reader: Reader): Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PS = {
      val r = reader.readMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PS()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_SupervisorTransferDecisionOwner_supervisionProcess_transferDecisionOwner_PostState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container(o: Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container(o)
    return w.result
  }

  def toMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container(reader: Reader): Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container = {
      val r = reader.readMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_P(o: Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_P(o)
    return w.result
  }

  def toMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_P(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_P(reader: Reader): Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_P = {
      val r = reader.readMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_P()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PS(o: Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PS(o)
    return w.result
  }

  def toMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PS(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PS(reader: Reader): Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PS = {
      val r = reader.readMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PS()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PreState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container(o: Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container(o)
    return w.result
  }

  def toMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container(reader: Reader): Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container = {
      val r = reader.readMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_P(o: Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_P(o)
    return w.result
  }

  def toMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_P(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_P(reader: Reader): Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_P = {
      val r = reader.readMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_P()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PS(o: Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PS(o)
    return w.result
  }

  def toMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PS(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PS(reader: Reader): Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PS = {
      val r = reader.readMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PS()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_SupervisorTransferCommandDerivation_supervisionProcess_transferCommandDerivation_PostState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container(o: Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container(o)
    return w.result
  }

  def toMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container(reader: Reader): Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container = {
      val r = reader.readMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_P(o: Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_P(o)
    return w.result
  }

  def toMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_P(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_P(reader: Reader): Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_P = {
      val r = reader.readMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_P()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PS(o: Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PS(o)
    return w.result
  }

  def toMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PS(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PS(reader: Reader): Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PS = {
      val r = reader.readMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PS()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PreState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container(o: Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container(o)
    return w.result
  }

  def toMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container(reader: Reader): Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container = {
      val r = reader.readMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_P(o: Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_P(o)
    return w.result
  }

  def toMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_P(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_P(reader: Reader): Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_P = {
      val r = reader.readMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_P()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PS(o: Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PS(o)
    return w.result
  }

  def toMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PS(data: ISZ[U8]): Either[Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PS(reader: Reader): Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PS = {
      val r = reader.readMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PS()
      return r
    }
    val r = to(data, fMining_Cargo_Transfer_SupervisorTransferReportDerivation_supervisionProcess_transferReportDerivation_PostState_Container_PS _)
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