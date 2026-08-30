// #Sireum
// @formatter:off

// This file is auto-generated from MonitoringRequest.scala, InputStatus.scala, QualifiedRequest.scala, CalibrationState.scala, ImpedanceToken.scala, AcquisitionEvidence.scala, AcquisitionCommand.scala, SessionMode.scala, RecoveryPhase.scala, MonitoringDisposition.scala, ImpedanceDelivery.scala, MonitoringStatus.scala, MonitoringRequestSample.scala, CalibrationSample.scala, ImpedanceSample.scala, MonitoringResolution.scala, Base_Types.scala, RequestQualification_coordinationProcess_requestQualification_Containers.scala, AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_Containers.scala, MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_Containers.scala, ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_Containers.scala, DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package scp_candidate

import org.sireum._

object MsgPack {

  object Constants {

    val EIT_Acquisition_CoordinatorMonitoringRequest_Payload: Z = -32

    val EIT_Acquisition_CoordinatorInputStatus_Payload: Z = -31

    val EIT_Acquisition_CoordinatorQualifiedRequest_Payload: Z = -30

    val EIT_Acquisition_CoordinatorCalibrationState_Payload: Z = -29

    val EIT_Acquisition_CoordinatorImpedanceToken_Payload: Z = -28

    val EIT_Acquisition_CoordinatorAcquisitionEvidence_Payload: Z = -27

    val EIT_Acquisition_CoordinatorAcquisitionCommand_Payload: Z = -26

    val EIT_Acquisition_CoordinatorSessionMode_Payload: Z = -25

    val EIT_Acquisition_CoordinatorRecoveryPhase_Payload: Z = -24

    val EIT_Acquisition_CoordinatorMonitoringDisposition_Payload: Z = -23

    val EIT_Acquisition_CoordinatorImpedanceDelivery_Payload: Z = -22

    val EIT_Acquisition_CoordinatorMonitoringStatus_Payload: Z = -21

    val EIT_Acquisition_CoordinatorMonitoringRequestSample: Z = -20

    val EIT_Acquisition_CoordinatorMonitoringRequestSample_Payload: Z = -19

    val EIT_Acquisition_CoordinatorCalibrationSample: Z = -18

    val EIT_Acquisition_CoordinatorCalibrationSample_Payload: Z = -17

    val EIT_Acquisition_CoordinatorImpedanceSample: Z = -16

    val EIT_Acquisition_CoordinatorImpedanceSample_Payload: Z = -15

    val EIT_Acquisition_CoordinatorMonitoringResolution: Z = -14

    val EIT_Acquisition_CoordinatorMonitoringResolution_Payload: Z = -13

    val Base_TypesBoolean_Payload: Z = -12

    val Base_TypesInteger_Payload: Z = -11

    val Base_TypesInteger_8_Payload: Z = -10

    val Base_TypesInteger_16_Payload: Z = -9

    val Base_TypesInteger_32_Payload: Z = -8

    val Base_TypesInteger_64_Payload: Z = -7

    val Base_TypesUnsigned_8_Payload: Z = -6

    val Base_TypesUnsigned_16_Payload: Z = -5

    val Base_TypesUnsigned_32_Payload: Z = -4

    val Base_TypesUnsigned_64_Payload: Z = -3

    val Base_TypesFloat_Payload: Z = -2

    val Base_TypesFloat_32_Payload: Z = -1

    val Base_TypesFloat_64_Payload: Z = 0

    val Base_TypesCharacter_Payload: Z = 1

    val Base_TypesString_Payload: Z = 2

    val Base_TypesBits_Payload: Z = 3

    val EIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_P: Z = 4

    val EIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_PS: Z = 5

    val EIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_P: Z = 6

    val EIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_PS: Z = 7

    val EIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_P: Z = 8

    val EIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PS: Z = 9

    val EIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_P: Z = 10

    val EIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PS: Z = 11

    val EIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_P: Z = 12

    val EIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PS: Z = 13

    val EIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_P: Z = 14

    val EIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PS: Z = 15

    val EIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_P: Z = 16

    val EIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PS: Z = 17

    val EIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_P: Z = 18

    val EIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PS: Z = 19

    val EIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_P: Z = 20

    val EIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PS: Z = 21

    val EIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_P: Z = 22

    val EIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PS: Z = 23

    val utilEmptyContainer: Z = 24

    val _artEmpty: Z = 25

  }

  object Writer {

    @record class Default(val writer: MessagePack.Writer.Impl) extends Writer

  }

  @msig trait Writer {

    def writer: MessagePack.Writer

    def writeEIT_Acquisition_CoordinatorMonitoringRequestType(o: EIT_Acquisition_Coordinator.MonitoringRequest.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Acquisition_CoordinatorMonitoringRequest_Payload(o: EIT_Acquisition_Coordinator.MonitoringRequest_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_CoordinatorMonitoringRequest_Payload)
      writeEIT_Acquisition_CoordinatorMonitoringRequestType(o.value)
    }

    def writeEIT_Acquisition_CoordinatorInputStatusType(o: EIT_Acquisition_Coordinator.InputStatus.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Acquisition_CoordinatorInputStatus_Payload(o: EIT_Acquisition_Coordinator.InputStatus_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_CoordinatorInputStatus_Payload)
      writeEIT_Acquisition_CoordinatorInputStatusType(o.value)
    }

    def writeEIT_Acquisition_CoordinatorQualifiedRequestType(o: EIT_Acquisition_Coordinator.QualifiedRequest.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Acquisition_CoordinatorQualifiedRequest_Payload(o: EIT_Acquisition_Coordinator.QualifiedRequest_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_CoordinatorQualifiedRequest_Payload)
      writeEIT_Acquisition_CoordinatorQualifiedRequestType(o.value)
    }

    def writeEIT_Acquisition_CoordinatorCalibrationStateType(o: EIT_Acquisition_Coordinator.CalibrationState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Acquisition_CoordinatorCalibrationState_Payload(o: EIT_Acquisition_Coordinator.CalibrationState_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_CoordinatorCalibrationState_Payload)
      writeEIT_Acquisition_CoordinatorCalibrationStateType(o.value)
    }

    def writeEIT_Acquisition_CoordinatorImpedanceTokenType(o: EIT_Acquisition_Coordinator.ImpedanceToken.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Acquisition_CoordinatorImpedanceToken_Payload(o: EIT_Acquisition_Coordinator.ImpedanceToken_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_CoordinatorImpedanceToken_Payload)
      writeEIT_Acquisition_CoordinatorImpedanceTokenType(o.value)
    }

    def writeEIT_Acquisition_CoordinatorAcquisitionEvidenceType(o: EIT_Acquisition_Coordinator.AcquisitionEvidence.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Acquisition_CoordinatorAcquisitionEvidence_Payload(o: EIT_Acquisition_Coordinator.AcquisitionEvidence_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_CoordinatorAcquisitionEvidence_Payload)
      writeEIT_Acquisition_CoordinatorAcquisitionEvidenceType(o.value)
    }

    def writeEIT_Acquisition_CoordinatorAcquisitionCommandType(o: EIT_Acquisition_Coordinator.AcquisitionCommand.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Acquisition_CoordinatorAcquisitionCommand_Payload(o: EIT_Acquisition_Coordinator.AcquisitionCommand_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_CoordinatorAcquisitionCommand_Payload)
      writeEIT_Acquisition_CoordinatorAcquisitionCommandType(o.value)
    }

    def writeEIT_Acquisition_CoordinatorSessionModeType(o: EIT_Acquisition_Coordinator.SessionMode.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Acquisition_CoordinatorSessionMode_Payload(o: EIT_Acquisition_Coordinator.SessionMode_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_CoordinatorSessionMode_Payload)
      writeEIT_Acquisition_CoordinatorSessionModeType(o.value)
    }

    def writeEIT_Acquisition_CoordinatorRecoveryPhaseType(o: EIT_Acquisition_Coordinator.RecoveryPhase.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Acquisition_CoordinatorRecoveryPhase_Payload(o: EIT_Acquisition_Coordinator.RecoveryPhase_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_CoordinatorRecoveryPhase_Payload)
      writeEIT_Acquisition_CoordinatorRecoveryPhaseType(o.value)
    }

    def writeEIT_Acquisition_CoordinatorMonitoringDispositionType(o: EIT_Acquisition_Coordinator.MonitoringDisposition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Acquisition_CoordinatorMonitoringDisposition_Payload(o: EIT_Acquisition_Coordinator.MonitoringDisposition_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_CoordinatorMonitoringDisposition_Payload)
      writeEIT_Acquisition_CoordinatorMonitoringDispositionType(o.value)
    }

    def writeEIT_Acquisition_CoordinatorImpedanceDeliveryType(o: EIT_Acquisition_Coordinator.ImpedanceDelivery.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Acquisition_CoordinatorImpedanceDelivery_Payload(o: EIT_Acquisition_Coordinator.ImpedanceDelivery_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_CoordinatorImpedanceDelivery_Payload)
      writeEIT_Acquisition_CoordinatorImpedanceDeliveryType(o.value)
    }

    def writeEIT_Acquisition_CoordinatorMonitoringStatusType(o: EIT_Acquisition_Coordinator.MonitoringStatus.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEIT_Acquisition_CoordinatorMonitoringStatus_Payload(o: EIT_Acquisition_Coordinator.MonitoringStatus_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_CoordinatorMonitoringStatus_Payload)
      writeEIT_Acquisition_CoordinatorMonitoringStatusType(o.value)
    }

    def writeEIT_Acquisition_CoordinatorMonitoringRequestSample(o: EIT_Acquisition_Coordinator.MonitoringRequestSample): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_CoordinatorMonitoringRequestSample)
      writeEIT_Acquisition_CoordinatorMonitoringRequestType(o.request)
      writeEIT_Acquisition_CoordinatorInputStatusType(o.status)
    }

    def writeEIT_Acquisition_CoordinatorMonitoringRequestSample_Payload(o: EIT_Acquisition_Coordinator.MonitoringRequestSample_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_CoordinatorMonitoringRequestSample_Payload)
      writeEIT_Acquisition_CoordinatorMonitoringRequestSample(o.value)
    }

    def writeEIT_Acquisition_CoordinatorCalibrationSample(o: EIT_Acquisition_Coordinator.CalibrationSample): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_CoordinatorCalibrationSample)
      writeEIT_Acquisition_CoordinatorCalibrationStateType(o.calibration)
      writeEIT_Acquisition_CoordinatorInputStatusType(o.status)
    }

    def writeEIT_Acquisition_CoordinatorCalibrationSample_Payload(o: EIT_Acquisition_Coordinator.CalibrationSample_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_CoordinatorCalibrationSample_Payload)
      writeEIT_Acquisition_CoordinatorCalibrationSample(o.value)
    }

    def writeEIT_Acquisition_CoordinatorImpedanceSample(o: EIT_Acquisition_Coordinator.ImpedanceSample): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_CoordinatorImpedanceSample)
      writeEIT_Acquisition_CoordinatorImpedanceTokenType(o.token)
      writeEIT_Acquisition_CoordinatorInputStatusType(o.status)
    }

    def writeEIT_Acquisition_CoordinatorImpedanceSample_Payload(o: EIT_Acquisition_Coordinator.ImpedanceSample_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_CoordinatorImpedanceSample_Payload)
      writeEIT_Acquisition_CoordinatorImpedanceSample(o.value)
    }

    def writeEIT_Acquisition_CoordinatorMonitoringResolution(o: EIT_Acquisition_Coordinator.MonitoringResolution): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_CoordinatorMonitoringResolution)
      writeEIT_Acquisition_CoordinatorSessionModeType(o.nextSessionMode)
      writeEIT_Acquisition_CoordinatorRecoveryPhaseType(o.nextRecoveryPhase)
      writeEIT_Acquisition_CoordinatorAcquisitionCommandType(o.acquisitionCommand)
      writeEIT_Acquisition_CoordinatorMonitoringDispositionType(o.disposition)
    }

    def writeEIT_Acquisition_CoordinatorMonitoringResolution_Payload(o: EIT_Acquisition_Coordinator.MonitoringResolution_Payload): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_CoordinatorMonitoringResolution_Payload)
      writeEIT_Acquisition_CoordinatorMonitoringResolution(o.value)
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

    def writeEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container(o: EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PreState_Container): Unit = {
      o match {
        case o: EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PreState_Container_P => writeEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_P(o)
        case o: EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PreState_Container_PS => writeEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_PS(o)
      }
    }

    def writeEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_P(o: EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PreState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_P)
      writeEIT_Acquisition_CoordinatorMonitoringRequestSample(o.api_requestSample)
    }

    def writeEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_PS(o: EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_PS)
      writeEIT_Acquisition_CoordinatorMonitoringRequestSample(o.api_requestSample)
    }

    def writeEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container(o: EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PostState_Container): Unit = {
      o match {
        case o: EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PostState_Container_P => writeEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_P(o)
        case o: EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PostState_Container_PS => writeEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_PS(o)
      }
    }

    def writeEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_P(o: EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PostState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_P)
      writeEIT_Acquisition_CoordinatorQualifiedRequestType(o.api_qualifiedRequest)
    }

    def writeEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_PS(o: EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_PS)
      writeEIT_Acquisition_CoordinatorQualifiedRequestType(o.api_qualifiedRequest)
    }

    def writeEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container(o: EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container): Unit = {
      o match {
        case o: EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_P => writeEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_P(o)
        case o: EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PS => writeEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PS(o)
      }
    }

    def writeEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_P(o: EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_P)
      writeEIT_Acquisition_CoordinatorCalibrationSample(o.api_calibrationSample)
      writeEIT_Acquisition_CoordinatorImpedanceSample(o.api_impedanceSample)
    }

    def writeEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PS(o: EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PS)
      writeEIT_Acquisition_CoordinatorCalibrationSample(o.api_calibrationSample)
      writeEIT_Acquisition_CoordinatorImpedanceSample(o.api_impedanceSample)
    }

    def writeEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container(o: EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container): Unit = {
      o match {
        case o: EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_P => writeEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_P(o)
        case o: EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PS => writeEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PS(o)
      }
    }

    def writeEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_P(o: EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_P)
      writeEIT_Acquisition_CoordinatorAcquisitionEvidenceType(o.api_acquisitionEvidence)
    }

    def writeEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PS(o: EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PS)
      writeEIT_Acquisition_CoordinatorAcquisitionEvidenceType(o.api_acquisitionEvidence)
    }

    def writeEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container(o: EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container): Unit = {
      o match {
        case o: EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_P => writeEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_P(o)
        case o: EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PS => writeEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PS(o)
      }
    }

    def writeEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_P(o: EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_P)
      writeEIT_Acquisition_CoordinatorAcquisitionEvidenceType(o.api_acquisitionEvidence)
      writeEIT_Acquisition_CoordinatorQualifiedRequestType(o.api_qualifiedRequest)
    }

    def writeEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PS(o: EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PS)
      writeEIT_Acquisition_CoordinatorAcquisitionEvidenceType(o.api_acquisitionEvidence)
      writeEIT_Acquisition_CoordinatorQualifiedRequestType(o.api_qualifiedRequest)
    }

    def writeEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container(o: EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container): Unit = {
      o match {
        case o: EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_P => writeEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_P(o)
        case o: EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PS => writeEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PS(o)
      }
    }

    def writeEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_P(o: EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_P)
      writeEIT_Acquisition_CoordinatorAcquisitionCommandType(o.api_acquisitionCommand)
      writeEIT_Acquisition_CoordinatorMonitoringResolution(o.api_monitoringResolution)
    }

    def writeEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PS(o: EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PS)
      writeEIT_Acquisition_CoordinatorAcquisitionCommandType(o.api_acquisitionCommand)
      writeEIT_Acquisition_CoordinatorMonitoringResolution(o.api_monitoringResolution)
    }

    def writeEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container(o: EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container): Unit = {
      o match {
        case o: EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_P => writeEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_P(o)
        case o: EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PS => writeEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PS(o)
      }
    }

    def writeEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_P(o: EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_P)
      writeEIT_Acquisition_CoordinatorAcquisitionEvidenceType(o.api_acquisitionEvidence)
      writeEIT_Acquisition_CoordinatorMonitoringResolution(o.api_monitoringResolution)
    }

    def writeEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PS(o: EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PS)
      writeEIT_Acquisition_CoordinatorAcquisitionEvidenceType(o.api_acquisitionEvidence)
      writeEIT_Acquisition_CoordinatorMonitoringResolution(o.api_monitoringResolution)
    }

    def writeEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container(o: EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container): Unit = {
      o match {
        case o: EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_P => writeEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_P(o)
        case o: EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PS => writeEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PS(o)
      }
    }

    def writeEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_P(o: EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_P)
      writeEIT_Acquisition_CoordinatorImpedanceDeliveryType(o.api_impedanceDelivery)
    }

    def writeEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PS(o: EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PS)
      writeEIT_Acquisition_CoordinatorImpedanceDeliveryType(o.api_impedanceDelivery)
    }

    def writeEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container(o: EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container): Unit = {
      o match {
        case o: EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_P => writeEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_P(o)
        case o: EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PS => writeEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PS(o)
      }
    }

    def writeEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_P(o: EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_P)
      writeEIT_Acquisition_CoordinatorAcquisitionEvidenceType(o.api_acquisitionEvidence)
      writeEIT_Acquisition_CoordinatorMonitoringResolution(o.api_monitoringResolution)
    }

    def writeEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PS(o: EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PS)
      writeEIT_Acquisition_CoordinatorAcquisitionEvidenceType(o.api_acquisitionEvidence)
      writeEIT_Acquisition_CoordinatorMonitoringResolution(o.api_monitoringResolution)
    }

    def writeEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container(o: EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container): Unit = {
      o match {
        case o: EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_P => writeEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_P(o)
        case o: EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PS => writeEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PS(o)
      }
    }

    def writeEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_P(o: EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_P): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_P)
      writeEIT_Acquisition_CoordinatorMonitoringStatusType(o.api_monitoringStatus)
    }

    def writeEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PS(o: EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.EIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PS)
      writeEIT_Acquisition_CoordinatorMonitoringStatusType(o.api_monitoringStatus)
    }

    def writeruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeutilContainer(o: util.Container): Unit = {
      o match {
        case o: util.EmptyContainer => writeutilEmptyContainer(o)
        case o: EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PreState_Container_P => writeEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_P(o)
        case o: EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PreState_Container_PS => writeEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_PS(o)
        case o: EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PostState_Container_P => writeEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_P(o)
        case o: EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PostState_Container_PS => writeEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_PS(o)
        case o: EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_P => writeEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_P(o)
        case o: EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PS => writeEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PS(o)
        case o: EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_P => writeEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_P(o)
        case o: EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PS => writeEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PS(o)
        case o: EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_P => writeEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_P(o)
        case o: EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PS => writeEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PS(o)
        case o: EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_P => writeEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_P(o)
        case o: EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PS => writeEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PS(o)
        case o: EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_P => writeEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_P(o)
        case o: EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PS => writeEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PS(o)
        case o: EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_P => writeEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_P(o)
        case o: EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PS => writeEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PS(o)
        case o: EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_P => writeEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_P(o)
        case o: EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PS => writeEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PS(o)
        case o: EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_P => writeEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_P(o)
        case o: EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PS => writeEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PS(o)
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
        case o: EIT_Acquisition_Coordinator.InputStatus_Payload => writeEIT_Acquisition_CoordinatorInputStatus_Payload(o)
        case o: EIT_Acquisition_Coordinator.SessionMode_Payload => writeEIT_Acquisition_CoordinatorSessionMode_Payload(o)
        case o: EIT_Acquisition_Coordinator.RecoveryPhase_Payload => writeEIT_Acquisition_CoordinatorRecoveryPhase_Payload(o)
        case o: EIT_Acquisition_Coordinator.ImpedanceToken_Payload => writeEIT_Acquisition_CoordinatorImpedanceToken_Payload(o)
        case o: EIT_Acquisition_Coordinator.ImpedanceSample_Payload => writeEIT_Acquisition_CoordinatorImpedanceSample_Payload(o)
        case o: EIT_Acquisition_Coordinator.CalibrationState_Payload => writeEIT_Acquisition_CoordinatorCalibrationState_Payload(o)
        case o: EIT_Acquisition_Coordinator.QualifiedRequest_Payload => writeEIT_Acquisition_CoordinatorQualifiedRequest_Payload(o)
        case o: EIT_Acquisition_Coordinator.MonitoringStatus_Payload => writeEIT_Acquisition_CoordinatorMonitoringStatus_Payload(o)
        case o: EIT_Acquisition_Coordinator.MonitoringRequest_Payload => writeEIT_Acquisition_CoordinatorMonitoringRequest_Payload(o)
        case o: EIT_Acquisition_Coordinator.ImpedanceDelivery_Payload => writeEIT_Acquisition_CoordinatorImpedanceDelivery_Payload(o)
        case o: EIT_Acquisition_Coordinator.CalibrationSample_Payload => writeEIT_Acquisition_CoordinatorCalibrationSample_Payload(o)
        case o: EIT_Acquisition_Coordinator.AcquisitionCommand_Payload => writeEIT_Acquisition_CoordinatorAcquisitionCommand_Payload(o)
        case o: EIT_Acquisition_Coordinator.AcquisitionEvidence_Payload => writeEIT_Acquisition_CoordinatorAcquisitionEvidence_Payload(o)
        case o: EIT_Acquisition_Coordinator.MonitoringResolution_Payload => writeEIT_Acquisition_CoordinatorMonitoringResolution_Payload(o)
        case o: EIT_Acquisition_Coordinator.MonitoringDisposition_Payload => writeEIT_Acquisition_CoordinatorMonitoringDisposition_Payload(o)
        case o: EIT_Acquisition_Coordinator.MonitoringRequestSample_Payload => writeEIT_Acquisition_CoordinatorMonitoringRequestSample_Payload(o)
        case o: EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PreState_Container_P => writeEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_P(o)
        case o: EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PreState_Container_PS => writeEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_PS(o)
        case o: EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PostState_Container_P => writeEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_P(o)
        case o: EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PostState_Container_PS => writeEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_PS(o)
        case o: EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_P => writeEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_P(o)
        case o: EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PS => writeEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PS(o)
        case o: EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_P => writeEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_P(o)
        case o: EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PS => writeEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PS(o)
        case o: EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_P => writeEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_P(o)
        case o: EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PS => writeEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PS(o)
        case o: EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_P => writeEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_P(o)
        case o: EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PS => writeEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PS(o)
        case o: EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_P => writeEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_P(o)
        case o: EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PS => writeEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PS(o)
        case o: EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_P => writeEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_P(o)
        case o: EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PS => writeEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PS(o)
        case o: EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_P => writeEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_P(o)
        case o: EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PS => writeEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PS(o)
        case o: EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_P => writeEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_P(o)
        case o: EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PS => writeEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PS(o)
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

    def readEIT_Acquisition_CoordinatorMonitoringRequestType(): EIT_Acquisition_Coordinator.MonitoringRequest.Type = {
      val r = reader.readZ()
      return EIT_Acquisition_Coordinator.MonitoringRequest.byOrdinal(r).get
    }

    def readEIT_Acquisition_CoordinatorMonitoringRequest_Payload(): EIT_Acquisition_Coordinator.MonitoringRequest_Payload = {
      val r = readEIT_Acquisition_CoordinatorMonitoringRequest_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_CoordinatorMonitoringRequest_PayloadT(typeParsed: B): EIT_Acquisition_Coordinator.MonitoringRequest_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_CoordinatorMonitoringRequest_Payload)
      }
      val value = readEIT_Acquisition_CoordinatorMonitoringRequestType()
      return EIT_Acquisition_Coordinator.MonitoringRequest_Payload(value)
    }

    def readEIT_Acquisition_CoordinatorInputStatusType(): EIT_Acquisition_Coordinator.InputStatus.Type = {
      val r = reader.readZ()
      return EIT_Acquisition_Coordinator.InputStatus.byOrdinal(r).get
    }

    def readEIT_Acquisition_CoordinatorInputStatus_Payload(): EIT_Acquisition_Coordinator.InputStatus_Payload = {
      val r = readEIT_Acquisition_CoordinatorInputStatus_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_CoordinatorInputStatus_PayloadT(typeParsed: B): EIT_Acquisition_Coordinator.InputStatus_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_CoordinatorInputStatus_Payload)
      }
      val value = readEIT_Acquisition_CoordinatorInputStatusType()
      return EIT_Acquisition_Coordinator.InputStatus_Payload(value)
    }

    def readEIT_Acquisition_CoordinatorQualifiedRequestType(): EIT_Acquisition_Coordinator.QualifiedRequest.Type = {
      val r = reader.readZ()
      return EIT_Acquisition_Coordinator.QualifiedRequest.byOrdinal(r).get
    }

    def readEIT_Acquisition_CoordinatorQualifiedRequest_Payload(): EIT_Acquisition_Coordinator.QualifiedRequest_Payload = {
      val r = readEIT_Acquisition_CoordinatorQualifiedRequest_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_CoordinatorQualifiedRequest_PayloadT(typeParsed: B): EIT_Acquisition_Coordinator.QualifiedRequest_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_CoordinatorQualifiedRequest_Payload)
      }
      val value = readEIT_Acquisition_CoordinatorQualifiedRequestType()
      return EIT_Acquisition_Coordinator.QualifiedRequest_Payload(value)
    }

    def readEIT_Acquisition_CoordinatorCalibrationStateType(): EIT_Acquisition_Coordinator.CalibrationState.Type = {
      val r = reader.readZ()
      return EIT_Acquisition_Coordinator.CalibrationState.byOrdinal(r).get
    }

    def readEIT_Acquisition_CoordinatorCalibrationState_Payload(): EIT_Acquisition_Coordinator.CalibrationState_Payload = {
      val r = readEIT_Acquisition_CoordinatorCalibrationState_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_CoordinatorCalibrationState_PayloadT(typeParsed: B): EIT_Acquisition_Coordinator.CalibrationState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_CoordinatorCalibrationState_Payload)
      }
      val value = readEIT_Acquisition_CoordinatorCalibrationStateType()
      return EIT_Acquisition_Coordinator.CalibrationState_Payload(value)
    }

    def readEIT_Acquisition_CoordinatorImpedanceTokenType(): EIT_Acquisition_Coordinator.ImpedanceToken.Type = {
      val r = reader.readZ()
      return EIT_Acquisition_Coordinator.ImpedanceToken.byOrdinal(r).get
    }

    def readEIT_Acquisition_CoordinatorImpedanceToken_Payload(): EIT_Acquisition_Coordinator.ImpedanceToken_Payload = {
      val r = readEIT_Acquisition_CoordinatorImpedanceToken_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_CoordinatorImpedanceToken_PayloadT(typeParsed: B): EIT_Acquisition_Coordinator.ImpedanceToken_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_CoordinatorImpedanceToken_Payload)
      }
      val value = readEIT_Acquisition_CoordinatorImpedanceTokenType()
      return EIT_Acquisition_Coordinator.ImpedanceToken_Payload(value)
    }

    def readEIT_Acquisition_CoordinatorAcquisitionEvidenceType(): EIT_Acquisition_Coordinator.AcquisitionEvidence.Type = {
      val r = reader.readZ()
      return EIT_Acquisition_Coordinator.AcquisitionEvidence.byOrdinal(r).get
    }

    def readEIT_Acquisition_CoordinatorAcquisitionEvidence_Payload(): EIT_Acquisition_Coordinator.AcquisitionEvidence_Payload = {
      val r = readEIT_Acquisition_CoordinatorAcquisitionEvidence_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_CoordinatorAcquisitionEvidence_PayloadT(typeParsed: B): EIT_Acquisition_Coordinator.AcquisitionEvidence_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_CoordinatorAcquisitionEvidence_Payload)
      }
      val value = readEIT_Acquisition_CoordinatorAcquisitionEvidenceType()
      return EIT_Acquisition_Coordinator.AcquisitionEvidence_Payload(value)
    }

    def readEIT_Acquisition_CoordinatorAcquisitionCommandType(): EIT_Acquisition_Coordinator.AcquisitionCommand.Type = {
      val r = reader.readZ()
      return EIT_Acquisition_Coordinator.AcquisitionCommand.byOrdinal(r).get
    }

    def readEIT_Acquisition_CoordinatorAcquisitionCommand_Payload(): EIT_Acquisition_Coordinator.AcquisitionCommand_Payload = {
      val r = readEIT_Acquisition_CoordinatorAcquisitionCommand_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_CoordinatorAcquisitionCommand_PayloadT(typeParsed: B): EIT_Acquisition_Coordinator.AcquisitionCommand_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_CoordinatorAcquisitionCommand_Payload)
      }
      val value = readEIT_Acquisition_CoordinatorAcquisitionCommandType()
      return EIT_Acquisition_Coordinator.AcquisitionCommand_Payload(value)
    }

    def readEIT_Acquisition_CoordinatorSessionModeType(): EIT_Acquisition_Coordinator.SessionMode.Type = {
      val r = reader.readZ()
      return EIT_Acquisition_Coordinator.SessionMode.byOrdinal(r).get
    }

    def readEIT_Acquisition_CoordinatorSessionMode_Payload(): EIT_Acquisition_Coordinator.SessionMode_Payload = {
      val r = readEIT_Acquisition_CoordinatorSessionMode_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_CoordinatorSessionMode_PayloadT(typeParsed: B): EIT_Acquisition_Coordinator.SessionMode_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_CoordinatorSessionMode_Payload)
      }
      val value = readEIT_Acquisition_CoordinatorSessionModeType()
      return EIT_Acquisition_Coordinator.SessionMode_Payload(value)
    }

    def readEIT_Acquisition_CoordinatorRecoveryPhaseType(): EIT_Acquisition_Coordinator.RecoveryPhase.Type = {
      val r = reader.readZ()
      return EIT_Acquisition_Coordinator.RecoveryPhase.byOrdinal(r).get
    }

    def readEIT_Acquisition_CoordinatorRecoveryPhase_Payload(): EIT_Acquisition_Coordinator.RecoveryPhase_Payload = {
      val r = readEIT_Acquisition_CoordinatorRecoveryPhase_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_CoordinatorRecoveryPhase_PayloadT(typeParsed: B): EIT_Acquisition_Coordinator.RecoveryPhase_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_CoordinatorRecoveryPhase_Payload)
      }
      val value = readEIT_Acquisition_CoordinatorRecoveryPhaseType()
      return EIT_Acquisition_Coordinator.RecoveryPhase_Payload(value)
    }

    def readEIT_Acquisition_CoordinatorMonitoringDispositionType(): EIT_Acquisition_Coordinator.MonitoringDisposition.Type = {
      val r = reader.readZ()
      return EIT_Acquisition_Coordinator.MonitoringDisposition.byOrdinal(r).get
    }

    def readEIT_Acquisition_CoordinatorMonitoringDisposition_Payload(): EIT_Acquisition_Coordinator.MonitoringDisposition_Payload = {
      val r = readEIT_Acquisition_CoordinatorMonitoringDisposition_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_CoordinatorMonitoringDisposition_PayloadT(typeParsed: B): EIT_Acquisition_Coordinator.MonitoringDisposition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_CoordinatorMonitoringDisposition_Payload)
      }
      val value = readEIT_Acquisition_CoordinatorMonitoringDispositionType()
      return EIT_Acquisition_Coordinator.MonitoringDisposition_Payload(value)
    }

    def readEIT_Acquisition_CoordinatorImpedanceDeliveryType(): EIT_Acquisition_Coordinator.ImpedanceDelivery.Type = {
      val r = reader.readZ()
      return EIT_Acquisition_Coordinator.ImpedanceDelivery.byOrdinal(r).get
    }

    def readEIT_Acquisition_CoordinatorImpedanceDelivery_Payload(): EIT_Acquisition_Coordinator.ImpedanceDelivery_Payload = {
      val r = readEIT_Acquisition_CoordinatorImpedanceDelivery_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_CoordinatorImpedanceDelivery_PayloadT(typeParsed: B): EIT_Acquisition_Coordinator.ImpedanceDelivery_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_CoordinatorImpedanceDelivery_Payload)
      }
      val value = readEIT_Acquisition_CoordinatorImpedanceDeliveryType()
      return EIT_Acquisition_Coordinator.ImpedanceDelivery_Payload(value)
    }

    def readEIT_Acquisition_CoordinatorMonitoringStatusType(): EIT_Acquisition_Coordinator.MonitoringStatus.Type = {
      val r = reader.readZ()
      return EIT_Acquisition_Coordinator.MonitoringStatus.byOrdinal(r).get
    }

    def readEIT_Acquisition_CoordinatorMonitoringStatus_Payload(): EIT_Acquisition_Coordinator.MonitoringStatus_Payload = {
      val r = readEIT_Acquisition_CoordinatorMonitoringStatus_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_CoordinatorMonitoringStatus_PayloadT(typeParsed: B): EIT_Acquisition_Coordinator.MonitoringStatus_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_CoordinatorMonitoringStatus_Payload)
      }
      val value = readEIT_Acquisition_CoordinatorMonitoringStatusType()
      return EIT_Acquisition_Coordinator.MonitoringStatus_Payload(value)
    }

    def readEIT_Acquisition_CoordinatorMonitoringRequestSample(): EIT_Acquisition_Coordinator.MonitoringRequestSample = {
      val r = readEIT_Acquisition_CoordinatorMonitoringRequestSampleT(F)
      return r
    }

    def readEIT_Acquisition_CoordinatorMonitoringRequestSampleT(typeParsed: B): EIT_Acquisition_Coordinator.MonitoringRequestSample = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_CoordinatorMonitoringRequestSample)
      }
      val request = readEIT_Acquisition_CoordinatorMonitoringRequestType()
      val status = readEIT_Acquisition_CoordinatorInputStatusType()
      return EIT_Acquisition_Coordinator.MonitoringRequestSample(request, status)
    }

    def readEIT_Acquisition_CoordinatorMonitoringRequestSample_Payload(): EIT_Acquisition_Coordinator.MonitoringRequestSample_Payload = {
      val r = readEIT_Acquisition_CoordinatorMonitoringRequestSample_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_CoordinatorMonitoringRequestSample_PayloadT(typeParsed: B): EIT_Acquisition_Coordinator.MonitoringRequestSample_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_CoordinatorMonitoringRequestSample_Payload)
      }
      val value = readEIT_Acquisition_CoordinatorMonitoringRequestSample()
      return EIT_Acquisition_Coordinator.MonitoringRequestSample_Payload(value)
    }

    def readEIT_Acquisition_CoordinatorCalibrationSample(): EIT_Acquisition_Coordinator.CalibrationSample = {
      val r = readEIT_Acquisition_CoordinatorCalibrationSampleT(F)
      return r
    }

    def readEIT_Acquisition_CoordinatorCalibrationSampleT(typeParsed: B): EIT_Acquisition_Coordinator.CalibrationSample = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_CoordinatorCalibrationSample)
      }
      val calibration = readEIT_Acquisition_CoordinatorCalibrationStateType()
      val status = readEIT_Acquisition_CoordinatorInputStatusType()
      return EIT_Acquisition_Coordinator.CalibrationSample(calibration, status)
    }

    def readEIT_Acquisition_CoordinatorCalibrationSample_Payload(): EIT_Acquisition_Coordinator.CalibrationSample_Payload = {
      val r = readEIT_Acquisition_CoordinatorCalibrationSample_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_CoordinatorCalibrationSample_PayloadT(typeParsed: B): EIT_Acquisition_Coordinator.CalibrationSample_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_CoordinatorCalibrationSample_Payload)
      }
      val value = readEIT_Acquisition_CoordinatorCalibrationSample()
      return EIT_Acquisition_Coordinator.CalibrationSample_Payload(value)
    }

    def readEIT_Acquisition_CoordinatorImpedanceSample(): EIT_Acquisition_Coordinator.ImpedanceSample = {
      val r = readEIT_Acquisition_CoordinatorImpedanceSampleT(F)
      return r
    }

    def readEIT_Acquisition_CoordinatorImpedanceSampleT(typeParsed: B): EIT_Acquisition_Coordinator.ImpedanceSample = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_CoordinatorImpedanceSample)
      }
      val token = readEIT_Acquisition_CoordinatorImpedanceTokenType()
      val status = readEIT_Acquisition_CoordinatorInputStatusType()
      return EIT_Acquisition_Coordinator.ImpedanceSample(token, status)
    }

    def readEIT_Acquisition_CoordinatorImpedanceSample_Payload(): EIT_Acquisition_Coordinator.ImpedanceSample_Payload = {
      val r = readEIT_Acquisition_CoordinatorImpedanceSample_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_CoordinatorImpedanceSample_PayloadT(typeParsed: B): EIT_Acquisition_Coordinator.ImpedanceSample_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_CoordinatorImpedanceSample_Payload)
      }
      val value = readEIT_Acquisition_CoordinatorImpedanceSample()
      return EIT_Acquisition_Coordinator.ImpedanceSample_Payload(value)
    }

    def readEIT_Acquisition_CoordinatorMonitoringResolution(): EIT_Acquisition_Coordinator.MonitoringResolution = {
      val r = readEIT_Acquisition_CoordinatorMonitoringResolutionT(F)
      return r
    }

    def readEIT_Acquisition_CoordinatorMonitoringResolutionT(typeParsed: B): EIT_Acquisition_Coordinator.MonitoringResolution = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_CoordinatorMonitoringResolution)
      }
      val nextSessionMode = readEIT_Acquisition_CoordinatorSessionModeType()
      val nextRecoveryPhase = readEIT_Acquisition_CoordinatorRecoveryPhaseType()
      val acquisitionCommand = readEIT_Acquisition_CoordinatorAcquisitionCommandType()
      val disposition = readEIT_Acquisition_CoordinatorMonitoringDispositionType()
      return EIT_Acquisition_Coordinator.MonitoringResolution(nextSessionMode, nextRecoveryPhase, acquisitionCommand, disposition)
    }

    def readEIT_Acquisition_CoordinatorMonitoringResolution_Payload(): EIT_Acquisition_Coordinator.MonitoringResolution_Payload = {
      val r = readEIT_Acquisition_CoordinatorMonitoringResolution_PayloadT(F)
      return r
    }

    def readEIT_Acquisition_CoordinatorMonitoringResolution_PayloadT(typeParsed: B): EIT_Acquisition_Coordinator.MonitoringResolution_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_CoordinatorMonitoringResolution_Payload)
      }
      val value = readEIT_Acquisition_CoordinatorMonitoringResolution()
      return EIT_Acquisition_Coordinator.MonitoringResolution_Payload(value)
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

    def readEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container(): EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_P => val r = readEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_PS => val r = readEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PreState_Container.")
          val r = readEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_PST(T)
          return r
      }
    }

    def readEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_P(): EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PreState_Container_P = {
      val r = readEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_PT(F)
      return r
    }

    def readEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_PT(typeParsed: B): EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_P)
      }
      val api_requestSample = readEIT_Acquisition_CoordinatorMonitoringRequestSample()
      return EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PreState_Container_P(api_requestSample)
    }

    def readEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_PS(): EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PreState_Container_PS = {
      val r = readEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_PST(F)
      return r
    }

    def readEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_PST(typeParsed: B): EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_PS)
      }
      val api_requestSample = readEIT_Acquisition_CoordinatorMonitoringRequestSample()
      return EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PreState_Container_PS(api_requestSample)
    }

    def readEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container(): EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_P => val r = readEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_PS => val r = readEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PostState_Container.")
          val r = readEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_PST(T)
          return r
      }
    }

    def readEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_P(): EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PostState_Container_P = {
      val r = readEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_PT(F)
      return r
    }

    def readEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_PT(typeParsed: B): EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_P)
      }
      val api_qualifiedRequest = readEIT_Acquisition_CoordinatorQualifiedRequestType()
      return EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PostState_Container_P(api_qualifiedRequest)
    }

    def readEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_PS(): EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PostState_Container_PS = {
      val r = readEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_PST(F)
      return r
    }

    def readEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_PST(typeParsed: B): EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_PS)
      }
      val api_qualifiedRequest = readEIT_Acquisition_CoordinatorQualifiedRequestType()
      return EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PostState_Container_PS(api_qualifiedRequest)
    }

    def readEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container(): EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_P => val r = readEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PS => val r = readEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container.")
          val r = readEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PST(T)
          return r
      }
    }

    def readEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_P(): EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_P = {
      val r = readEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PT(F)
      return r
    }

    def readEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PT(typeParsed: B): EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_P)
      }
      val api_calibrationSample = readEIT_Acquisition_CoordinatorCalibrationSample()
      val api_impedanceSample = readEIT_Acquisition_CoordinatorImpedanceSample()
      return EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_P(api_calibrationSample, api_impedanceSample)
    }

    def readEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PS(): EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PS = {
      val r = readEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PST(F)
      return r
    }

    def readEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PST(typeParsed: B): EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PS)
      }
      val api_calibrationSample = readEIT_Acquisition_CoordinatorCalibrationSample()
      val api_impedanceSample = readEIT_Acquisition_CoordinatorImpedanceSample()
      return EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PS(api_calibrationSample, api_impedanceSample)
    }

    def readEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container(): EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_P => val r = readEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PS => val r = readEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container.")
          val r = readEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PST(T)
          return r
      }
    }

    def readEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_P(): EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_P = {
      val r = readEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PT(F)
      return r
    }

    def readEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PT(typeParsed: B): EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_P)
      }
      val api_acquisitionEvidence = readEIT_Acquisition_CoordinatorAcquisitionEvidenceType()
      return EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_P(api_acquisitionEvidence)
    }

    def readEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PS(): EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PS = {
      val r = readEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PST(F)
      return r
    }

    def readEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PST(typeParsed: B): EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PS)
      }
      val api_acquisitionEvidence = readEIT_Acquisition_CoordinatorAcquisitionEvidenceType()
      return EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PS(api_acquisitionEvidence)
    }

    def readEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container(): EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_P => val r = readEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PS => val r = readEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container.")
          val r = readEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PST(T)
          return r
      }
    }

    def readEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_P(): EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_P = {
      val r = readEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PT(F)
      return r
    }

    def readEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PT(typeParsed: B): EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_P)
      }
      val api_acquisitionEvidence = readEIT_Acquisition_CoordinatorAcquisitionEvidenceType()
      val api_qualifiedRequest = readEIT_Acquisition_CoordinatorQualifiedRequestType()
      return EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_P(api_acquisitionEvidence, api_qualifiedRequest)
    }

    def readEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PS(): EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PS = {
      val r = readEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PST(F)
      return r
    }

    def readEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PST(typeParsed: B): EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PS)
      }
      val api_acquisitionEvidence = readEIT_Acquisition_CoordinatorAcquisitionEvidenceType()
      val api_qualifiedRequest = readEIT_Acquisition_CoordinatorQualifiedRequestType()
      return EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PS(api_acquisitionEvidence, api_qualifiedRequest)
    }

    def readEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container(): EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_P => val r = readEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PS => val r = readEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container.")
          val r = readEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PST(T)
          return r
      }
    }

    def readEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_P(): EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_P = {
      val r = readEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PT(F)
      return r
    }

    def readEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PT(typeParsed: B): EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_P)
      }
      val api_acquisitionCommand = readEIT_Acquisition_CoordinatorAcquisitionCommandType()
      val api_monitoringResolution = readEIT_Acquisition_CoordinatorMonitoringResolution()
      return EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_P(api_acquisitionCommand, api_monitoringResolution)
    }

    def readEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PS(): EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PS = {
      val r = readEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PST(F)
      return r
    }

    def readEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PST(typeParsed: B): EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PS)
      }
      val api_acquisitionCommand = readEIT_Acquisition_CoordinatorAcquisitionCommandType()
      val api_monitoringResolution = readEIT_Acquisition_CoordinatorMonitoringResolution()
      return EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PS(api_acquisitionCommand, api_monitoringResolution)
    }

    def readEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container(): EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_P => val r = readEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PS => val r = readEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container.")
          val r = readEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PST(T)
          return r
      }
    }

    def readEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_P(): EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_P = {
      val r = readEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PT(F)
      return r
    }

    def readEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PT(typeParsed: B): EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_P)
      }
      val api_acquisitionEvidence = readEIT_Acquisition_CoordinatorAcquisitionEvidenceType()
      val api_monitoringResolution = readEIT_Acquisition_CoordinatorMonitoringResolution()
      return EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_P(api_acquisitionEvidence, api_monitoringResolution)
    }

    def readEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PS(): EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PS = {
      val r = readEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PST(F)
      return r
    }

    def readEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PST(typeParsed: B): EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PS)
      }
      val api_acquisitionEvidence = readEIT_Acquisition_CoordinatorAcquisitionEvidenceType()
      val api_monitoringResolution = readEIT_Acquisition_CoordinatorMonitoringResolution()
      return EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PS(api_acquisitionEvidence, api_monitoringResolution)
    }

    def readEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container(): EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_P => val r = readEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PS => val r = readEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container.")
          val r = readEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PST(T)
          return r
      }
    }

    def readEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_P(): EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_P = {
      val r = readEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PT(F)
      return r
    }

    def readEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PT(typeParsed: B): EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_P)
      }
      val api_impedanceDelivery = readEIT_Acquisition_CoordinatorImpedanceDeliveryType()
      return EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_P(api_impedanceDelivery)
    }

    def readEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PS(): EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PS = {
      val r = readEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PST(F)
      return r
    }

    def readEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PST(typeParsed: B): EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PS)
      }
      val api_impedanceDelivery = readEIT_Acquisition_CoordinatorImpedanceDeliveryType()
      return EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PS(api_impedanceDelivery)
    }

    def readEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container(): EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_P => val r = readEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PS => val r = readEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container.")
          val r = readEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PST(T)
          return r
      }
    }

    def readEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_P(): EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_P = {
      val r = readEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PT(F)
      return r
    }

    def readEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PT(typeParsed: B): EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_P)
      }
      val api_acquisitionEvidence = readEIT_Acquisition_CoordinatorAcquisitionEvidenceType()
      val api_monitoringResolution = readEIT_Acquisition_CoordinatorMonitoringResolution()
      return EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_P(api_acquisitionEvidence, api_monitoringResolution)
    }

    def readEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PS(): EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PS = {
      val r = readEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PST(F)
      return r
    }

    def readEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PST(typeParsed: B): EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PS)
      }
      val api_acquisitionEvidence = readEIT_Acquisition_CoordinatorAcquisitionEvidenceType()
      val api_monitoringResolution = readEIT_Acquisition_CoordinatorMonitoringResolution()
      return EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PS(api_acquisitionEvidence, api_monitoringResolution)
    }

    def readEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container(): EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_P => val r = readEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PS => val r = readEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container.")
          val r = readEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PST(T)
          return r
      }
    }

    def readEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_P(): EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_P = {
      val r = readEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PT(F)
      return r
    }

    def readEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PT(typeParsed: B): EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_P)
      }
      val api_monitoringStatus = readEIT_Acquisition_CoordinatorMonitoringStatusType()
      return EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_P(api_monitoringStatus)
    }

    def readEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PS(): EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PS = {
      val r = readEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PST(F)
      return r
    }

    def readEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PST(typeParsed: B): EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PS)
      }
      val api_monitoringStatus = readEIT_Acquisition_CoordinatorMonitoringStatusType()
      return EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PS(api_monitoringStatus)
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
        case Constants.EIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_P => val r = readEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_PS => val r = readEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_PST(T); return r
        case Constants.EIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_P => val r = readEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_PS => val r = readEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_PST(T); return r
        case Constants.EIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_P => val r = readEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PS => val r = readEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PST(T); return r
        case Constants.EIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_P => val r = readEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PS => val r = readEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PST(T); return r
        case Constants.EIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_P => val r = readEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PS => val r = readEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PST(T); return r
        case Constants.EIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_P => val r = readEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PS => val r = readEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PST(T); return r
        case Constants.EIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_P => val r = readEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PS => val r = readEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PST(T); return r
        case Constants.EIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_P => val r = readEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PS => val r = readEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PST(T); return r
        case Constants.EIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_P => val r = readEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PS => val r = readEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PST(T); return r
        case Constants.EIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_P => val r = readEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PS => val r = readEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of util.Container.")
          val r = readEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PST(T)
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
        case Constants.EIT_Acquisition_CoordinatorInputStatus_Payload => val r = readEIT_Acquisition_CoordinatorInputStatus_PayloadT(T); return r
        case Constants.EIT_Acquisition_CoordinatorSessionMode_Payload => val r = readEIT_Acquisition_CoordinatorSessionMode_PayloadT(T); return r
        case Constants.EIT_Acquisition_CoordinatorRecoveryPhase_Payload => val r = readEIT_Acquisition_CoordinatorRecoveryPhase_PayloadT(T); return r
        case Constants.EIT_Acquisition_CoordinatorImpedanceToken_Payload => val r = readEIT_Acquisition_CoordinatorImpedanceToken_PayloadT(T); return r
        case Constants.EIT_Acquisition_CoordinatorImpedanceSample_Payload => val r = readEIT_Acquisition_CoordinatorImpedanceSample_PayloadT(T); return r
        case Constants.EIT_Acquisition_CoordinatorCalibrationState_Payload => val r = readEIT_Acquisition_CoordinatorCalibrationState_PayloadT(T); return r
        case Constants.EIT_Acquisition_CoordinatorQualifiedRequest_Payload => val r = readEIT_Acquisition_CoordinatorQualifiedRequest_PayloadT(T); return r
        case Constants.EIT_Acquisition_CoordinatorMonitoringStatus_Payload => val r = readEIT_Acquisition_CoordinatorMonitoringStatus_PayloadT(T); return r
        case Constants.EIT_Acquisition_CoordinatorMonitoringRequest_Payload => val r = readEIT_Acquisition_CoordinatorMonitoringRequest_PayloadT(T); return r
        case Constants.EIT_Acquisition_CoordinatorImpedanceDelivery_Payload => val r = readEIT_Acquisition_CoordinatorImpedanceDelivery_PayloadT(T); return r
        case Constants.EIT_Acquisition_CoordinatorCalibrationSample_Payload => val r = readEIT_Acquisition_CoordinatorCalibrationSample_PayloadT(T); return r
        case Constants.EIT_Acquisition_CoordinatorAcquisitionCommand_Payload => val r = readEIT_Acquisition_CoordinatorAcquisitionCommand_PayloadT(T); return r
        case Constants.EIT_Acquisition_CoordinatorAcquisitionEvidence_Payload => val r = readEIT_Acquisition_CoordinatorAcquisitionEvidence_PayloadT(T); return r
        case Constants.EIT_Acquisition_CoordinatorMonitoringResolution_Payload => val r = readEIT_Acquisition_CoordinatorMonitoringResolution_PayloadT(T); return r
        case Constants.EIT_Acquisition_CoordinatorMonitoringDisposition_Payload => val r = readEIT_Acquisition_CoordinatorMonitoringDisposition_PayloadT(T); return r
        case Constants.EIT_Acquisition_CoordinatorMonitoringRequestSample_Payload => val r = readEIT_Acquisition_CoordinatorMonitoringRequestSample_PayloadT(T); return r
        case Constants.EIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_P => val r = readEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_PS => val r = readEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_PST(T); return r
        case Constants.EIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_P => val r = readEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_PS => val r = readEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_PST(T); return r
        case Constants.EIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_P => val r = readEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PS => val r = readEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PST(T); return r
        case Constants.EIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_P => val r = readEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PS => val r = readEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PST(T); return r
        case Constants.EIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_P => val r = readEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PS => val r = readEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PST(T); return r
        case Constants.EIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_P => val r = readEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PS => val r = readEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PST(T); return r
        case Constants.EIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_P => val r = readEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PS => val r = readEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PST(T); return r
        case Constants.EIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_P => val r = readEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PS => val r = readEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PST(T); return r
        case Constants.EIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_P => val r = readEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PT(T); return r
        case Constants.EIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PS => val r = readEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PST(T); return r
        case Constants.EIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_P => val r = readEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PT(T); return r
        case Constants.EIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PS => val r = readEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of art.DataContent.")
          val r = readEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PST(T)
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

  def fromEIT_Acquisition_CoordinatorMonitoringRequest_Payload(o: EIT_Acquisition_Coordinator.MonitoringRequest_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_CoordinatorMonitoringRequest_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_CoordinatorMonitoringRequest_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Coordinator.MonitoringRequest_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorMonitoringRequest_Payload(reader: Reader): EIT_Acquisition_Coordinator.MonitoringRequest_Payload = {
      val r = reader.readEIT_Acquisition_CoordinatorMonitoringRequest_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_CoordinatorMonitoringRequest_Payload _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorInputStatus_Payload(o: EIT_Acquisition_Coordinator.InputStatus_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_CoordinatorInputStatus_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_CoordinatorInputStatus_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Coordinator.InputStatus_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorInputStatus_Payload(reader: Reader): EIT_Acquisition_Coordinator.InputStatus_Payload = {
      val r = reader.readEIT_Acquisition_CoordinatorInputStatus_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_CoordinatorInputStatus_Payload _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorQualifiedRequest_Payload(o: EIT_Acquisition_Coordinator.QualifiedRequest_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_CoordinatorQualifiedRequest_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_CoordinatorQualifiedRequest_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Coordinator.QualifiedRequest_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorQualifiedRequest_Payload(reader: Reader): EIT_Acquisition_Coordinator.QualifiedRequest_Payload = {
      val r = reader.readEIT_Acquisition_CoordinatorQualifiedRequest_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_CoordinatorQualifiedRequest_Payload _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorCalibrationState_Payload(o: EIT_Acquisition_Coordinator.CalibrationState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_CoordinatorCalibrationState_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_CoordinatorCalibrationState_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Coordinator.CalibrationState_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorCalibrationState_Payload(reader: Reader): EIT_Acquisition_Coordinator.CalibrationState_Payload = {
      val r = reader.readEIT_Acquisition_CoordinatorCalibrationState_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_CoordinatorCalibrationState_Payload _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorImpedanceToken_Payload(o: EIT_Acquisition_Coordinator.ImpedanceToken_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_CoordinatorImpedanceToken_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_CoordinatorImpedanceToken_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Coordinator.ImpedanceToken_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorImpedanceToken_Payload(reader: Reader): EIT_Acquisition_Coordinator.ImpedanceToken_Payload = {
      val r = reader.readEIT_Acquisition_CoordinatorImpedanceToken_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_CoordinatorImpedanceToken_Payload _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorAcquisitionEvidence_Payload(o: EIT_Acquisition_Coordinator.AcquisitionEvidence_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_CoordinatorAcquisitionEvidence_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_CoordinatorAcquisitionEvidence_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Coordinator.AcquisitionEvidence_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorAcquisitionEvidence_Payload(reader: Reader): EIT_Acquisition_Coordinator.AcquisitionEvidence_Payload = {
      val r = reader.readEIT_Acquisition_CoordinatorAcquisitionEvidence_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_CoordinatorAcquisitionEvidence_Payload _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorAcquisitionCommand_Payload(o: EIT_Acquisition_Coordinator.AcquisitionCommand_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_CoordinatorAcquisitionCommand_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_CoordinatorAcquisitionCommand_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Coordinator.AcquisitionCommand_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorAcquisitionCommand_Payload(reader: Reader): EIT_Acquisition_Coordinator.AcquisitionCommand_Payload = {
      val r = reader.readEIT_Acquisition_CoordinatorAcquisitionCommand_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_CoordinatorAcquisitionCommand_Payload _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorSessionMode_Payload(o: EIT_Acquisition_Coordinator.SessionMode_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_CoordinatorSessionMode_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_CoordinatorSessionMode_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Coordinator.SessionMode_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorSessionMode_Payload(reader: Reader): EIT_Acquisition_Coordinator.SessionMode_Payload = {
      val r = reader.readEIT_Acquisition_CoordinatorSessionMode_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_CoordinatorSessionMode_Payload _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorRecoveryPhase_Payload(o: EIT_Acquisition_Coordinator.RecoveryPhase_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_CoordinatorRecoveryPhase_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_CoordinatorRecoveryPhase_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Coordinator.RecoveryPhase_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorRecoveryPhase_Payload(reader: Reader): EIT_Acquisition_Coordinator.RecoveryPhase_Payload = {
      val r = reader.readEIT_Acquisition_CoordinatorRecoveryPhase_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_CoordinatorRecoveryPhase_Payload _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorMonitoringDisposition_Payload(o: EIT_Acquisition_Coordinator.MonitoringDisposition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_CoordinatorMonitoringDisposition_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_CoordinatorMonitoringDisposition_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Coordinator.MonitoringDisposition_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorMonitoringDisposition_Payload(reader: Reader): EIT_Acquisition_Coordinator.MonitoringDisposition_Payload = {
      val r = reader.readEIT_Acquisition_CoordinatorMonitoringDisposition_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_CoordinatorMonitoringDisposition_Payload _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorImpedanceDelivery_Payload(o: EIT_Acquisition_Coordinator.ImpedanceDelivery_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_CoordinatorImpedanceDelivery_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_CoordinatorImpedanceDelivery_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Coordinator.ImpedanceDelivery_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorImpedanceDelivery_Payload(reader: Reader): EIT_Acquisition_Coordinator.ImpedanceDelivery_Payload = {
      val r = reader.readEIT_Acquisition_CoordinatorImpedanceDelivery_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_CoordinatorImpedanceDelivery_Payload _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorMonitoringStatus_Payload(o: EIT_Acquisition_Coordinator.MonitoringStatus_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_CoordinatorMonitoringStatus_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_CoordinatorMonitoringStatus_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Coordinator.MonitoringStatus_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorMonitoringStatus_Payload(reader: Reader): EIT_Acquisition_Coordinator.MonitoringStatus_Payload = {
      val r = reader.readEIT_Acquisition_CoordinatorMonitoringStatus_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_CoordinatorMonitoringStatus_Payload _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorMonitoringRequestSample(o: EIT_Acquisition_Coordinator.MonitoringRequestSample, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_CoordinatorMonitoringRequestSample(o)
    return w.result
  }

  def toEIT_Acquisition_CoordinatorMonitoringRequestSample(data: ISZ[U8]): Either[EIT_Acquisition_Coordinator.MonitoringRequestSample, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorMonitoringRequestSample(reader: Reader): EIT_Acquisition_Coordinator.MonitoringRequestSample = {
      val r = reader.readEIT_Acquisition_CoordinatorMonitoringRequestSample()
      return r
    }
    val r = to(data, fEIT_Acquisition_CoordinatorMonitoringRequestSample _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorMonitoringRequestSample_Payload(o: EIT_Acquisition_Coordinator.MonitoringRequestSample_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_CoordinatorMonitoringRequestSample_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_CoordinatorMonitoringRequestSample_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Coordinator.MonitoringRequestSample_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorMonitoringRequestSample_Payload(reader: Reader): EIT_Acquisition_Coordinator.MonitoringRequestSample_Payload = {
      val r = reader.readEIT_Acquisition_CoordinatorMonitoringRequestSample_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_CoordinatorMonitoringRequestSample_Payload _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorCalibrationSample(o: EIT_Acquisition_Coordinator.CalibrationSample, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_CoordinatorCalibrationSample(o)
    return w.result
  }

  def toEIT_Acquisition_CoordinatorCalibrationSample(data: ISZ[U8]): Either[EIT_Acquisition_Coordinator.CalibrationSample, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorCalibrationSample(reader: Reader): EIT_Acquisition_Coordinator.CalibrationSample = {
      val r = reader.readEIT_Acquisition_CoordinatorCalibrationSample()
      return r
    }
    val r = to(data, fEIT_Acquisition_CoordinatorCalibrationSample _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorCalibrationSample_Payload(o: EIT_Acquisition_Coordinator.CalibrationSample_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_CoordinatorCalibrationSample_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_CoordinatorCalibrationSample_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Coordinator.CalibrationSample_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorCalibrationSample_Payload(reader: Reader): EIT_Acquisition_Coordinator.CalibrationSample_Payload = {
      val r = reader.readEIT_Acquisition_CoordinatorCalibrationSample_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_CoordinatorCalibrationSample_Payload _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorImpedanceSample(o: EIT_Acquisition_Coordinator.ImpedanceSample, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_CoordinatorImpedanceSample(o)
    return w.result
  }

  def toEIT_Acquisition_CoordinatorImpedanceSample(data: ISZ[U8]): Either[EIT_Acquisition_Coordinator.ImpedanceSample, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorImpedanceSample(reader: Reader): EIT_Acquisition_Coordinator.ImpedanceSample = {
      val r = reader.readEIT_Acquisition_CoordinatorImpedanceSample()
      return r
    }
    val r = to(data, fEIT_Acquisition_CoordinatorImpedanceSample _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorImpedanceSample_Payload(o: EIT_Acquisition_Coordinator.ImpedanceSample_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_CoordinatorImpedanceSample_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_CoordinatorImpedanceSample_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Coordinator.ImpedanceSample_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorImpedanceSample_Payload(reader: Reader): EIT_Acquisition_Coordinator.ImpedanceSample_Payload = {
      val r = reader.readEIT_Acquisition_CoordinatorImpedanceSample_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_CoordinatorImpedanceSample_Payload _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorMonitoringResolution(o: EIT_Acquisition_Coordinator.MonitoringResolution, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_CoordinatorMonitoringResolution(o)
    return w.result
  }

  def toEIT_Acquisition_CoordinatorMonitoringResolution(data: ISZ[U8]): Either[EIT_Acquisition_Coordinator.MonitoringResolution, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorMonitoringResolution(reader: Reader): EIT_Acquisition_Coordinator.MonitoringResolution = {
      val r = reader.readEIT_Acquisition_CoordinatorMonitoringResolution()
      return r
    }
    val r = to(data, fEIT_Acquisition_CoordinatorMonitoringResolution _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorMonitoringResolution_Payload(o: EIT_Acquisition_Coordinator.MonitoringResolution_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_CoordinatorMonitoringResolution_Payload(o)
    return w.result
  }

  def toEIT_Acquisition_CoordinatorMonitoringResolution_Payload(data: ISZ[U8]): Either[EIT_Acquisition_Coordinator.MonitoringResolution_Payload, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorMonitoringResolution_Payload(reader: Reader): EIT_Acquisition_Coordinator.MonitoringResolution_Payload = {
      val r = reader.readEIT_Acquisition_CoordinatorMonitoringResolution_Payload()
      return r
    }
    val r = to(data, fEIT_Acquisition_CoordinatorMonitoringResolution_Payload _)
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

  def fromEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container(o: EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container(o)
    return w.result
  }

  def toEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container(data: ISZ[U8]): Either[EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PreState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container(reader: Reader): EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PreState_Container = {
      val r = reader.readEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container()
      return r
    }
    val r = to(data, fEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_P(o: EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_P(o)
    return w.result
  }

  def toEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_P(data: ISZ[U8]): Either[EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_P(reader: Reader): EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PreState_Container_P = {
      val r = reader.readEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_P()
      return r
    }
    val r = to(data, fEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_PS(o: EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_PS(o)
    return w.result
  }

  def toEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_PS(data: ISZ[U8]): Either[EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_PS(reader: Reader): EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PreState_Container_PS = {
      val r = reader.readEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container(o: EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container(o)
    return w.result
  }

  def toEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container(data: ISZ[U8]): Either[EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PostState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container(reader: Reader): EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PostState_Container = {
      val r = reader.readEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container()
      return r
    }
    val r = to(data, fEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_P(o: EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_P(o)
    return w.result
  }

  def toEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_P(data: ISZ[U8]): Either[EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_P(reader: Reader): EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PostState_Container_P = {
      val r = reader.readEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_P()
      return r
    }
    val r = to(data, fEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_PS(o: EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_PS(o)
    return w.result
  }

  def toEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_PS(data: ISZ[U8]): Either[EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_PS(reader: Reader): EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PostState_Container_PS = {
      val r = reader.readEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container(o: EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container(o)
    return w.result
  }

  def toEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container(data: ISZ[U8]): Either[EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container(reader: Reader): EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container = {
      val r = reader.readEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container()
      return r
    }
    val r = to(data, fEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_P(o: EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_P(o)
    return w.result
  }

  def toEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_P(data: ISZ[U8]): Either[EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_P(reader: Reader): EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_P = {
      val r = reader.readEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_P()
      return r
    }
    val r = to(data, fEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PS(o: EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PS(o)
    return w.result
  }

  def toEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PS(data: ISZ[U8]): Either[EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PS(reader: Reader): EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PS = {
      val r = reader.readEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container(o: EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container(o)
    return w.result
  }

  def toEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container(data: ISZ[U8]): Either[EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container(reader: Reader): EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container = {
      val r = reader.readEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container()
      return r
    }
    val r = to(data, fEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_P(o: EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_P(o)
    return w.result
  }

  def toEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_P(data: ISZ[U8]): Either[EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_P(reader: Reader): EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_P = {
      val r = reader.readEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_P()
      return r
    }
    val r = to(data, fEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PS(o: EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PS(o)
    return w.result
  }

  def toEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PS(data: ISZ[U8]): Either[EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PS(reader: Reader): EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PS = {
      val r = reader.readEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container(o: EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container(o)
    return w.result
  }

  def toEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container(data: ISZ[U8]): Either[EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container(reader: Reader): EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container = {
      val r = reader.readEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container()
      return r
    }
    val r = to(data, fEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_P(o: EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_P(o)
    return w.result
  }

  def toEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_P(data: ISZ[U8]): Either[EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_P(reader: Reader): EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_P = {
      val r = reader.readEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_P()
      return r
    }
    val r = to(data, fEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PS(o: EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PS(o)
    return w.result
  }

  def toEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PS(data: ISZ[U8]): Either[EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PS(reader: Reader): EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PS = {
      val r = reader.readEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container(o: EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container(o)
    return w.result
  }

  def toEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container(data: ISZ[U8]): Either[EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container(reader: Reader): EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container = {
      val r = reader.readEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container()
      return r
    }
    val r = to(data, fEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_P(o: EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_P(o)
    return w.result
  }

  def toEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_P(data: ISZ[U8]): Either[EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_P(reader: Reader): EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_P = {
      val r = reader.readEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_P()
      return r
    }
    val r = to(data, fEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PS(o: EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PS(o)
    return w.result
  }

  def toEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PS(data: ISZ[U8]): Either[EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PS(reader: Reader): EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PS = {
      val r = reader.readEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container(o: EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container(o)
    return w.result
  }

  def toEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container(data: ISZ[U8]): Either[EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container(reader: Reader): EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container = {
      val r = reader.readEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container()
      return r
    }
    val r = to(data, fEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_P(o: EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_P(o)
    return w.result
  }

  def toEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_P(data: ISZ[U8]): Either[EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_P(reader: Reader): EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_P = {
      val r = reader.readEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_P()
      return r
    }
    val r = to(data, fEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PS(o: EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PS(o)
    return w.result
  }

  def toEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PS(data: ISZ[U8]): Either[EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PS(reader: Reader): EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PS = {
      val r = reader.readEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container(o: EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container(o)
    return w.result
  }

  def toEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container(data: ISZ[U8]): Either[EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container(reader: Reader): EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container = {
      val r = reader.readEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container()
      return r
    }
    val r = to(data, fEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_P(o: EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_P(o)
    return w.result
  }

  def toEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_P(data: ISZ[U8]): Either[EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_P(reader: Reader): EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_P = {
      val r = reader.readEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_P()
      return r
    }
    val r = to(data, fEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PS(o: EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PS(o)
    return w.result
  }

  def toEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PS(data: ISZ[U8]): Either[EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PS(reader: Reader): EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PS = {
      val r = reader.readEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container(o: EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container(o)
    return w.result
  }

  def toEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container(data: ISZ[U8]): Either[EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container(reader: Reader): EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container = {
      val r = reader.readEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container()
      return r
    }
    val r = to(data, fEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_P(o: EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_P(o)
    return w.result
  }

  def toEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_P(data: ISZ[U8]): Either[EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_P(reader: Reader): EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_P = {
      val r = reader.readEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_P()
      return r
    }
    val r = to(data, fEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PS(o: EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PS(o)
    return w.result
  }

  def toEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PS(data: ISZ[U8]): Either[EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PS(reader: Reader): EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PS = {
      val r = reader.readEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container(o: EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container(o)
    return w.result
  }

  def toEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container(data: ISZ[U8]): Either[EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container(reader: Reader): EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container = {
      val r = reader.readEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container()
      return r
    }
    val r = to(data, fEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_P(o: EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_P(o)
    return w.result
  }

  def toEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_P(data: ISZ[U8]): Either[EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_P(reader: Reader): EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_P = {
      val r = reader.readEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_P()
      return r
    }
    val r = to(data, fEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PS(o: EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PS(o)
    return w.result
  }

  def toEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PS(data: ISZ[U8]): Either[EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PS(reader: Reader): EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PS = {
      val r = reader.readEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PS()
      return r
    }
    val r = to(data, fEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PS _)
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