// #Sireum
// @formatter:off

// This file is auto-generated from MonitoringRequest.scala, InputStatus.scala, QualifiedRequest.scala, CalibrationState.scala, ImpedanceToken.scala, AcquisitionEvidence.scala, AcquisitionCommand.scala, SessionMode.scala, RecoveryPhase.scala, MonitoringDisposition.scala, ImpedanceDelivery.scala, MonitoringStatus.scala, MonitoringRequestSample.scala, CalibrationSample.scala, ImpedanceSample.scala, MonitoringResolution.scala, Base_Types.scala, RequestQualification_coordinationProcess_requestQualification_Containers.scala, AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_Containers.scala, MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_Containers.scala, ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_Containers.scala, DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package scp_candidate

import org.sireum._
import org.sireum.Json.Printer._

object JSON {

  object Printer {

    @pure def printEIT_Acquisition_CoordinatorMonitoringRequestType(o: EIT_Acquisition_Coordinator.MonitoringRequest.Type): ST = {
      val value: String = o match {
        case EIT_Acquisition_Coordinator.MonitoringRequest.NoRequest => "NoRequest"
        case EIT_Acquisition_Coordinator.MonitoringRequest.StartMonitoring => "StartMonitoring"
        case EIT_Acquisition_Coordinator.MonitoringRequest.StopMonitoring => "StopMonitoring"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Acquisition_Coordinator.MonitoringRequest")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Acquisition_CoordinatorMonitoringRequest_Payload(o: EIT_Acquisition_Coordinator.MonitoringRequest_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Coordinator.MonitoringRequest_Payload""""),
        ("value", printEIT_Acquisition_CoordinatorMonitoringRequestType(o.value))
      ))
    }

    @pure def printEIT_Acquisition_CoordinatorInputStatusType(o: EIT_Acquisition_Coordinator.InputStatus.Type): ST = {
      val value: String = o match {
        case EIT_Acquisition_Coordinator.InputStatus.Valid => "Valid"
        case EIT_Acquisition_Coordinator.InputStatus.Invalid => "Invalid"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Acquisition_Coordinator.InputStatus")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Acquisition_CoordinatorInputStatus_Payload(o: EIT_Acquisition_Coordinator.InputStatus_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Coordinator.InputStatus_Payload""""),
        ("value", printEIT_Acquisition_CoordinatorInputStatusType(o.value))
      ))
    }

    @pure def printEIT_Acquisition_CoordinatorQualifiedRequestType(o: EIT_Acquisition_Coordinator.QualifiedRequest.Type): ST = {
      val value: String = o match {
        case EIT_Acquisition_Coordinator.QualifiedRequest.InvalidRequest => "InvalidRequest"
        case EIT_Acquisition_Coordinator.QualifiedRequest.NoQualifiedRequest => "NoQualifiedRequest"
        case EIT_Acquisition_Coordinator.QualifiedRequest.QualifiedStart => "QualifiedStart"
        case EIT_Acquisition_Coordinator.QualifiedRequest.QualifiedStop => "QualifiedStop"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Acquisition_Coordinator.QualifiedRequest")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Acquisition_CoordinatorQualifiedRequest_Payload(o: EIT_Acquisition_Coordinator.QualifiedRequest_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Coordinator.QualifiedRequest_Payload""""),
        ("value", printEIT_Acquisition_CoordinatorQualifiedRequestType(o.value))
      ))
    }

    @pure def printEIT_Acquisition_CoordinatorCalibrationStateType(o: EIT_Acquisition_Coordinator.CalibrationState.Type): ST = {
      val value: String = o match {
        case EIT_Acquisition_Coordinator.CalibrationState.NotCurrent => "NotCurrent"
        case EIT_Acquisition_Coordinator.CalibrationState.Current => "Current"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Acquisition_Coordinator.CalibrationState")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Acquisition_CoordinatorCalibrationState_Payload(o: EIT_Acquisition_Coordinator.CalibrationState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Coordinator.CalibrationState_Payload""""),
        ("value", printEIT_Acquisition_CoordinatorCalibrationStateType(o.value))
      ))
    }

    @pure def printEIT_Acquisition_CoordinatorImpedanceTokenType(o: EIT_Acquisition_Coordinator.ImpedanceToken.Type): ST = {
      val value: String = o match {
        case EIT_Acquisition_Coordinator.ImpedanceToken.NoToken => "NoToken"
        case EIT_Acquisition_Coordinator.ImpedanceToken.TokenOne => "TokenOne"
        case EIT_Acquisition_Coordinator.ImpedanceToken.TokenTwo => "TokenTwo"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Acquisition_Coordinator.ImpedanceToken")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Acquisition_CoordinatorImpedanceToken_Payload(o: EIT_Acquisition_Coordinator.ImpedanceToken_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Coordinator.ImpedanceToken_Payload""""),
        ("value", printEIT_Acquisition_CoordinatorImpedanceTokenType(o.value))
      ))
    }

    @pure def printEIT_Acquisition_CoordinatorAcquisitionEvidenceType(o: EIT_Acquisition_Coordinator.AcquisitionEvidence.Type): ST = {
      val value: String = o match {
        case EIT_Acquisition_Coordinator.AcquisitionEvidence.InvalidAcquisitionEvidence => "InvalidAcquisitionEvidence"
        case EIT_Acquisition_Coordinator.AcquisitionEvidence.CalibrationAbsent => "CalibrationAbsent"
        case EIT_Acquisition_Coordinator.AcquisitionEvidence.ReadyNoToken => "ReadyNoToken"
        case EIT_Acquisition_Coordinator.AcquisitionEvidence.ReadyTokenOne => "ReadyTokenOne"
        case EIT_Acquisition_Coordinator.AcquisitionEvidence.ReadyTokenTwo => "ReadyTokenTwo"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Acquisition_Coordinator.AcquisitionEvidence")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Acquisition_CoordinatorAcquisitionEvidence_Payload(o: EIT_Acquisition_Coordinator.AcquisitionEvidence_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Coordinator.AcquisitionEvidence_Payload""""),
        ("value", printEIT_Acquisition_CoordinatorAcquisitionEvidenceType(o.value))
      ))
    }

    @pure def printEIT_Acquisition_CoordinatorAcquisitionCommandType(o: EIT_Acquisition_Coordinator.AcquisitionCommand.Type): ST = {
      val value: String = o match {
        case EIT_Acquisition_Coordinator.AcquisitionCommand.HoldAcquisition => "HoldAcquisition"
        case EIT_Acquisition_Coordinator.AcquisitionCommand.CollectImpedance => "CollectImpedance"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Acquisition_Coordinator.AcquisitionCommand")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Acquisition_CoordinatorAcquisitionCommand_Payload(o: EIT_Acquisition_Coordinator.AcquisitionCommand_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Coordinator.AcquisitionCommand_Payload""""),
        ("value", printEIT_Acquisition_CoordinatorAcquisitionCommandType(o.value))
      ))
    }

    @pure def printEIT_Acquisition_CoordinatorSessionModeType(o: EIT_Acquisition_Coordinator.SessionMode.Type): ST = {
      val value: String = o match {
        case EIT_Acquisition_Coordinator.SessionMode.SessionStopped => "SessionStopped"
        case EIT_Acquisition_Coordinator.SessionMode.SessionMonitoring => "SessionMonitoring"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Acquisition_Coordinator.SessionMode")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Acquisition_CoordinatorSessionMode_Payload(o: EIT_Acquisition_Coordinator.SessionMode_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Coordinator.SessionMode_Payload""""),
        ("value", printEIT_Acquisition_CoordinatorSessionModeType(o.value))
      ))
    }

    @pure def printEIT_Acquisition_CoordinatorRecoveryPhaseType(o: EIT_Acquisition_Coordinator.RecoveryPhase.Type): ST = {
      val value: String = o match {
        case EIT_Acquisition_Coordinator.RecoveryPhase.Normal => "Normal"
        case EIT_Acquisition_Coordinator.RecoveryPhase.AwaitNeutral => "AwaitNeutral"
        case EIT_Acquisition_Coordinator.RecoveryPhase.AwaitFreshRequest => "AwaitFreshRequest"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Acquisition_Coordinator.RecoveryPhase")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Acquisition_CoordinatorRecoveryPhase_Payload(o: EIT_Acquisition_Coordinator.RecoveryPhase_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Coordinator.RecoveryPhase_Payload""""),
        ("value", printEIT_Acquisition_CoordinatorRecoveryPhaseType(o.value))
      ))
    }

    @pure def printEIT_Acquisition_CoordinatorMonitoringDispositionType(o: EIT_Acquisition_Coordinator.MonitoringDisposition.Type): ST = {
      val value: String = o match {
        case EIT_Acquisition_Coordinator.MonitoringDisposition.InputFaultDisposition => "InputFaultDisposition"
        case EIT_Acquisition_Coordinator.MonitoringDisposition.RecoveryDisposition => "RecoveryDisposition"
        case EIT_Acquisition_Coordinator.MonitoringDisposition.StopAccepted => "StopAccepted"
        case EIT_Acquisition_Coordinator.MonitoringDisposition.StartAccepted => "StartAccepted"
        case EIT_Acquisition_Coordinator.MonitoringDisposition.StartDenied => "StartDenied"
        case EIT_Acquisition_Coordinator.MonitoringDisposition.MonitoringContinued => "MonitoringContinued"
        case EIT_Acquisition_Coordinator.MonitoringDisposition.StoppedDisposition => "StoppedDisposition"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Acquisition_Coordinator.MonitoringDisposition")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Acquisition_CoordinatorMonitoringDisposition_Payload(o: EIT_Acquisition_Coordinator.MonitoringDisposition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Coordinator.MonitoringDisposition_Payload""""),
        ("value", printEIT_Acquisition_CoordinatorMonitoringDispositionType(o.value))
      ))
    }

    @pure def printEIT_Acquisition_CoordinatorImpedanceDeliveryType(o: EIT_Acquisition_Coordinator.ImpedanceDelivery.Type): ST = {
      val value: String = o match {
        case EIT_Acquisition_Coordinator.ImpedanceDelivery.Withheld => "Withheld"
        case EIT_Acquisition_Coordinator.ImpedanceDelivery.NoTokenAvailable => "NoTokenAvailable"
        case EIT_Acquisition_Coordinator.ImpedanceDelivery.DeliverTokenOne => "DeliverTokenOne"
        case EIT_Acquisition_Coordinator.ImpedanceDelivery.DeliverTokenTwo => "DeliverTokenTwo"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Acquisition_Coordinator.ImpedanceDelivery")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Acquisition_CoordinatorImpedanceDelivery_Payload(o: EIT_Acquisition_Coordinator.ImpedanceDelivery_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Coordinator.ImpedanceDelivery_Payload""""),
        ("value", printEIT_Acquisition_CoordinatorImpedanceDeliveryType(o.value))
      ))
    }

    @pure def printEIT_Acquisition_CoordinatorMonitoringStatusType(o: EIT_Acquisition_Coordinator.MonitoringStatus.Type): ST = {
      val value: String = o match {
        case EIT_Acquisition_Coordinator.MonitoringStatus.Stopped => "Stopped"
        case EIT_Acquisition_Coordinator.MonitoringStatus.Monitoring => "Monitoring"
        case EIT_Acquisition_Coordinator.MonitoringStatus.CalibrationRequired => "CalibrationRequired"
        case EIT_Acquisition_Coordinator.MonitoringStatus.InputFault => "InputFault"
        case EIT_Acquisition_Coordinator.MonitoringStatus.RecoveryPending => "RecoveryPending"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Acquisition_Coordinator.MonitoringStatus")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Acquisition_CoordinatorMonitoringStatus_Payload(o: EIT_Acquisition_Coordinator.MonitoringStatus_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Coordinator.MonitoringStatus_Payload""""),
        ("value", printEIT_Acquisition_CoordinatorMonitoringStatusType(o.value))
      ))
    }

    @pure def printEIT_Acquisition_CoordinatorMonitoringRequestSample(o: EIT_Acquisition_Coordinator.MonitoringRequestSample): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Coordinator.MonitoringRequestSample""""),
        ("request", printEIT_Acquisition_CoordinatorMonitoringRequestType(o.request)),
        ("status", printEIT_Acquisition_CoordinatorInputStatusType(o.status))
      ))
    }

    @pure def printEIT_Acquisition_CoordinatorMonitoringRequestSample_Payload(o: EIT_Acquisition_Coordinator.MonitoringRequestSample_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Coordinator.MonitoringRequestSample_Payload""""),
        ("value", printEIT_Acquisition_CoordinatorMonitoringRequestSample(o.value))
      ))
    }

    @pure def printEIT_Acquisition_CoordinatorCalibrationSample(o: EIT_Acquisition_Coordinator.CalibrationSample): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Coordinator.CalibrationSample""""),
        ("calibration", printEIT_Acquisition_CoordinatorCalibrationStateType(o.calibration)),
        ("status", printEIT_Acquisition_CoordinatorInputStatusType(o.status))
      ))
    }

    @pure def printEIT_Acquisition_CoordinatorCalibrationSample_Payload(o: EIT_Acquisition_Coordinator.CalibrationSample_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Coordinator.CalibrationSample_Payload""""),
        ("value", printEIT_Acquisition_CoordinatorCalibrationSample(o.value))
      ))
    }

    @pure def printEIT_Acquisition_CoordinatorImpedanceSample(o: EIT_Acquisition_Coordinator.ImpedanceSample): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Coordinator.ImpedanceSample""""),
        ("token", printEIT_Acquisition_CoordinatorImpedanceTokenType(o.token)),
        ("status", printEIT_Acquisition_CoordinatorInputStatusType(o.status))
      ))
    }

    @pure def printEIT_Acquisition_CoordinatorImpedanceSample_Payload(o: EIT_Acquisition_Coordinator.ImpedanceSample_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Coordinator.ImpedanceSample_Payload""""),
        ("value", printEIT_Acquisition_CoordinatorImpedanceSample(o.value))
      ))
    }

    @pure def printEIT_Acquisition_CoordinatorMonitoringResolution(o: EIT_Acquisition_Coordinator.MonitoringResolution): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Coordinator.MonitoringResolution""""),
        ("nextSessionMode", printEIT_Acquisition_CoordinatorSessionModeType(o.nextSessionMode)),
        ("nextRecoveryPhase", printEIT_Acquisition_CoordinatorRecoveryPhaseType(o.nextRecoveryPhase)),
        ("acquisitionCommand", printEIT_Acquisition_CoordinatorAcquisitionCommandType(o.acquisitionCommand)),
        ("disposition", printEIT_Acquisition_CoordinatorMonitoringDispositionType(o.disposition))
      ))
    }

    @pure def printEIT_Acquisition_CoordinatorMonitoringResolution_Payload(o: EIT_Acquisition_Coordinator.MonitoringResolution_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Coordinator.MonitoringResolution_Payload""""),
        ("value", printEIT_Acquisition_CoordinatorMonitoringResolution(o.value))
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

    @pure def printEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container(o: EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PreState_Container): ST = {
      o match {
        case o: EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PreState_Container_P => return printEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_P(o)
        case o: EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PreState_Container_PS => return printEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_PS(o)
      }
    }

    @pure def printEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_P(o: EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PreState_Container_P""""),
        ("api_requestSample", printEIT_Acquisition_CoordinatorMonitoringRequestSample(o.api_requestSample))
      ))
    }

    @pure def printEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_PS(o: EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PreState_Container_PS""""),
        ("api_requestSample", printEIT_Acquisition_CoordinatorMonitoringRequestSample(o.api_requestSample))
      ))
    }

    @pure def printEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container(o: EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PostState_Container): ST = {
      o match {
        case o: EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PostState_Container_P => return printEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_P(o)
        case o: EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PostState_Container_PS => return printEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_PS(o)
      }
    }

    @pure def printEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_P(o: EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PostState_Container_P""""),
        ("api_qualifiedRequest", printEIT_Acquisition_CoordinatorQualifiedRequestType(o.api_qualifiedRequest))
      ))
    }

    @pure def printEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_PS(o: EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PostState_Container_PS""""),
        ("api_qualifiedRequest", printEIT_Acquisition_CoordinatorQualifiedRequestType(o.api_qualifiedRequest))
      ))
    }

    @pure def printEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container(o: EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container): ST = {
      o match {
        case o: EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_P => return printEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_P(o)
        case o: EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PS => return printEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PS(o)
      }
    }

    @pure def printEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_P(o: EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_P""""),
        ("api_calibrationSample", printEIT_Acquisition_CoordinatorCalibrationSample(o.api_calibrationSample)),
        ("api_impedanceSample", printEIT_Acquisition_CoordinatorImpedanceSample(o.api_impedanceSample))
      ))
    }

    @pure def printEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PS(o: EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PS""""),
        ("api_calibrationSample", printEIT_Acquisition_CoordinatorCalibrationSample(o.api_calibrationSample)),
        ("api_impedanceSample", printEIT_Acquisition_CoordinatorImpedanceSample(o.api_impedanceSample))
      ))
    }

    @pure def printEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container(o: EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container): ST = {
      o match {
        case o: EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_P => return printEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_P(o)
        case o: EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PS => return printEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PS(o)
      }
    }

    @pure def printEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_P(o: EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_P""""),
        ("api_acquisitionEvidence", printEIT_Acquisition_CoordinatorAcquisitionEvidenceType(o.api_acquisitionEvidence))
      ))
    }

    @pure def printEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PS(o: EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PS""""),
        ("api_acquisitionEvidence", printEIT_Acquisition_CoordinatorAcquisitionEvidenceType(o.api_acquisitionEvidence))
      ))
    }

    @pure def printEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container(o: EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container): ST = {
      o match {
        case o: EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_P => return printEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_P(o)
        case o: EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PS => return printEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PS(o)
      }
    }

    @pure def printEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_P(o: EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_P""""),
        ("api_acquisitionEvidence", printEIT_Acquisition_CoordinatorAcquisitionEvidenceType(o.api_acquisitionEvidence)),
        ("api_qualifiedRequest", printEIT_Acquisition_CoordinatorQualifiedRequestType(o.api_qualifiedRequest))
      ))
    }

    @pure def printEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PS(o: EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PS""""),
        ("api_acquisitionEvidence", printEIT_Acquisition_CoordinatorAcquisitionEvidenceType(o.api_acquisitionEvidence)),
        ("api_qualifiedRequest", printEIT_Acquisition_CoordinatorQualifiedRequestType(o.api_qualifiedRequest))
      ))
    }

    @pure def printEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container(o: EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container): ST = {
      o match {
        case o: EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_P => return printEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_P(o)
        case o: EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PS => return printEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PS(o)
      }
    }

    @pure def printEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_P(o: EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_P""""),
        ("api_acquisitionCommand", printEIT_Acquisition_CoordinatorAcquisitionCommandType(o.api_acquisitionCommand)),
        ("api_monitoringResolution", printEIT_Acquisition_CoordinatorMonitoringResolution(o.api_monitoringResolution))
      ))
    }

    @pure def printEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PS(o: EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PS""""),
        ("api_acquisitionCommand", printEIT_Acquisition_CoordinatorAcquisitionCommandType(o.api_acquisitionCommand)),
        ("api_monitoringResolution", printEIT_Acquisition_CoordinatorMonitoringResolution(o.api_monitoringResolution))
      ))
    }

    @pure def printEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container(o: EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container): ST = {
      o match {
        case o: EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_P => return printEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_P(o)
        case o: EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PS => return printEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PS(o)
      }
    }

    @pure def printEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_P(o: EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_P""""),
        ("api_acquisitionEvidence", printEIT_Acquisition_CoordinatorAcquisitionEvidenceType(o.api_acquisitionEvidence)),
        ("api_monitoringResolution", printEIT_Acquisition_CoordinatorMonitoringResolution(o.api_monitoringResolution))
      ))
    }

    @pure def printEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PS(o: EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PS""""),
        ("api_acquisitionEvidence", printEIT_Acquisition_CoordinatorAcquisitionEvidenceType(o.api_acquisitionEvidence)),
        ("api_monitoringResolution", printEIT_Acquisition_CoordinatorMonitoringResolution(o.api_monitoringResolution))
      ))
    }

    @pure def printEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container(o: EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container): ST = {
      o match {
        case o: EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_P => return printEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_P(o)
        case o: EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PS => return printEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PS(o)
      }
    }

    @pure def printEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_P(o: EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_P""""),
        ("api_impedanceDelivery", printEIT_Acquisition_CoordinatorImpedanceDeliveryType(o.api_impedanceDelivery))
      ))
    }

    @pure def printEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PS(o: EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PS""""),
        ("api_impedanceDelivery", printEIT_Acquisition_CoordinatorImpedanceDeliveryType(o.api_impedanceDelivery))
      ))
    }

    @pure def printEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container(o: EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container): ST = {
      o match {
        case o: EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_P => return printEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_P(o)
        case o: EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PS => return printEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PS(o)
      }
    }

    @pure def printEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_P(o: EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_P""""),
        ("api_acquisitionEvidence", printEIT_Acquisition_CoordinatorAcquisitionEvidenceType(o.api_acquisitionEvidence)),
        ("api_monitoringResolution", printEIT_Acquisition_CoordinatorMonitoringResolution(o.api_monitoringResolution))
      ))
    }

    @pure def printEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PS(o: EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PS""""),
        ("api_acquisitionEvidence", printEIT_Acquisition_CoordinatorAcquisitionEvidenceType(o.api_acquisitionEvidence)),
        ("api_monitoringResolution", printEIT_Acquisition_CoordinatorMonitoringResolution(o.api_monitoringResolution))
      ))
    }

    @pure def printEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container(o: EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container): ST = {
      o match {
        case o: EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_P => return printEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_P(o)
        case o: EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PS => return printEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PS(o)
      }
    }

    @pure def printEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_P(o: EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_P""""),
        ("api_monitoringStatus", printEIT_Acquisition_CoordinatorMonitoringStatusType(o.api_monitoringStatus))
      ))
    }

    @pure def printEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PS(o: EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PS""""),
        ("api_monitoringStatus", printEIT_Acquisition_CoordinatorMonitoringStatusType(o.api_monitoringStatus))
      ))
    }

    @pure def printruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): ST = {
      val value: String = o match {
        case runtimemonitor.ObservationKind.EITMonitoringAcquisitionCoordinatorSystem_Instance_coordinationProcess_requestQualification_postInit => "EITMonitoringAcquisitionCoordinatorSystem_Instance_coordinationProcess_requestQualification_postInit"
        case runtimemonitor.ObservationKind.EITMonitoringAcquisitionCoordinatorSystem_Instance_coordinationProcess_requestQualification_preCompute => "EITMonitoringAcquisitionCoordinatorSystem_Instance_coordinationProcess_requestQualification_preCompute"
        case runtimemonitor.ObservationKind.EITMonitoringAcquisitionCoordinatorSystem_Instance_coordinationProcess_requestQualification_postCompute => "EITMonitoringAcquisitionCoordinatorSystem_Instance_coordinationProcess_requestQualification_postCompute"
        case runtimemonitor.ObservationKind.EITMonitoringAcquisitionCoordinatorSystem_Instance_coordinationProcess_acquisitionEvidenceQualification_postInit => "EITMonitoringAcquisitionCoordinatorSystem_Instance_coordinationProcess_acquisitionEvidenceQualification_postInit"
        case runtimemonitor.ObservationKind.EITMonitoringAcquisitionCoordinatorSystem_Instance_coordinationProcess_acquisitionEvidenceQualification_preCompute => "EITMonitoringAcquisitionCoordinatorSystem_Instance_coordinationProcess_acquisitionEvidenceQualification_preCompute"
        case runtimemonitor.ObservationKind.EITMonitoringAcquisitionCoordinatorSystem_Instance_coordinationProcess_acquisitionEvidenceQualification_postCompute => "EITMonitoringAcquisitionCoordinatorSystem_Instance_coordinationProcess_acquisitionEvidenceQualification_postCompute"
        case runtimemonitor.ObservationKind.EITMonitoringAcquisitionCoordinatorSystem_Instance_coordinationProcess_monitoringDecisionOwner_postInit => "EITMonitoringAcquisitionCoordinatorSystem_Instance_coordinationProcess_monitoringDecisionOwner_postInit"
        case runtimemonitor.ObservationKind.EITMonitoringAcquisitionCoordinatorSystem_Instance_coordinationProcess_monitoringDecisionOwner_preCompute => "EITMonitoringAcquisitionCoordinatorSystem_Instance_coordinationProcess_monitoringDecisionOwner_preCompute"
        case runtimemonitor.ObservationKind.EITMonitoringAcquisitionCoordinatorSystem_Instance_coordinationProcess_monitoringDecisionOwner_postCompute => "EITMonitoringAcquisitionCoordinatorSystem_Instance_coordinationProcess_monitoringDecisionOwner_postCompute"
        case runtimemonitor.ObservationKind.EITMonitoringAcquisitionCoordinatorSystem_Instance_coordinationProcess_impedanceDeliveryDerivation_postInit => "EITMonitoringAcquisitionCoordinatorSystem_Instance_coordinationProcess_impedanceDeliveryDerivation_postInit"
        case runtimemonitor.ObservationKind.EITMonitoringAcquisitionCoordinatorSystem_Instance_coordinationProcess_impedanceDeliveryDerivation_preCompute => "EITMonitoringAcquisitionCoordinatorSystem_Instance_coordinationProcess_impedanceDeliveryDerivation_preCompute"
        case runtimemonitor.ObservationKind.EITMonitoringAcquisitionCoordinatorSystem_Instance_coordinationProcess_impedanceDeliveryDerivation_postCompute => "EITMonitoringAcquisitionCoordinatorSystem_Instance_coordinationProcess_impedanceDeliveryDerivation_postCompute"
        case runtimemonitor.ObservationKind.EITMonitoringAcquisitionCoordinatorSystem_Instance_coordinationProcess_doctorStatusDerivation_postInit => "EITMonitoringAcquisitionCoordinatorSystem_Instance_coordinationProcess_doctorStatusDerivation_postInit"
        case runtimemonitor.ObservationKind.EITMonitoringAcquisitionCoordinatorSystem_Instance_coordinationProcess_doctorStatusDerivation_preCompute => "EITMonitoringAcquisitionCoordinatorSystem_Instance_coordinationProcess_doctorStatusDerivation_preCompute"
        case runtimemonitor.ObservationKind.EITMonitoringAcquisitionCoordinatorSystem_Instance_coordinationProcess_doctorStatusDerivation_postCompute => "EITMonitoringAcquisitionCoordinatorSystem_Instance_coordinationProcess_doctorStatusDerivation_postCompute"
      }
      return printObject(ISZ(
        ("type", printString("runtimemonitor.ObservationKind")),
        ("value", printString(value))
      ))
    }

    @pure def printutilContainer(o: util.Container): ST = {
      o match {
        case o: util.EmptyContainer => return printutilEmptyContainer(o)
        case o: EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PreState_Container_P => return printEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_P(o)
        case o: EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PreState_Container_PS => return printEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_PS(o)
        case o: EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PostState_Container_P => return printEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_P(o)
        case o: EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PostState_Container_PS => return printEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_PS(o)
        case o: EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_P => return printEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_P(o)
        case o: EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PS => return printEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PS(o)
        case o: EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_P => return printEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_P(o)
        case o: EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PS => return printEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PS(o)
        case o: EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_P => return printEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_P(o)
        case o: EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PS => return printEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PS(o)
        case o: EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_P => return printEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_P(o)
        case o: EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PS => return printEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PS(o)
        case o: EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_P => return printEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_P(o)
        case o: EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PS => return printEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PS(o)
        case o: EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_P => return printEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_P(o)
        case o: EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PS => return printEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PS(o)
        case o: EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_P => return printEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_P(o)
        case o: EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PS => return printEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PS(o)
        case o: EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_P => return printEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_P(o)
        case o: EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PS => return printEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PS(o)
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
        case o: EIT_Acquisition_Coordinator.InputStatus_Payload => return printEIT_Acquisition_CoordinatorInputStatus_Payload(o)
        case o: EIT_Acquisition_Coordinator.SessionMode_Payload => return printEIT_Acquisition_CoordinatorSessionMode_Payload(o)
        case o: EIT_Acquisition_Coordinator.RecoveryPhase_Payload => return printEIT_Acquisition_CoordinatorRecoveryPhase_Payload(o)
        case o: EIT_Acquisition_Coordinator.ImpedanceToken_Payload => return printEIT_Acquisition_CoordinatorImpedanceToken_Payload(o)
        case o: EIT_Acquisition_Coordinator.ImpedanceSample_Payload => return printEIT_Acquisition_CoordinatorImpedanceSample_Payload(o)
        case o: EIT_Acquisition_Coordinator.CalibrationState_Payload => return printEIT_Acquisition_CoordinatorCalibrationState_Payload(o)
        case o: EIT_Acquisition_Coordinator.QualifiedRequest_Payload => return printEIT_Acquisition_CoordinatorQualifiedRequest_Payload(o)
        case o: EIT_Acquisition_Coordinator.MonitoringStatus_Payload => return printEIT_Acquisition_CoordinatorMonitoringStatus_Payload(o)
        case o: EIT_Acquisition_Coordinator.MonitoringRequest_Payload => return printEIT_Acquisition_CoordinatorMonitoringRequest_Payload(o)
        case o: EIT_Acquisition_Coordinator.ImpedanceDelivery_Payload => return printEIT_Acquisition_CoordinatorImpedanceDelivery_Payload(o)
        case o: EIT_Acquisition_Coordinator.CalibrationSample_Payload => return printEIT_Acquisition_CoordinatorCalibrationSample_Payload(o)
        case o: EIT_Acquisition_Coordinator.AcquisitionCommand_Payload => return printEIT_Acquisition_CoordinatorAcquisitionCommand_Payload(o)
        case o: EIT_Acquisition_Coordinator.AcquisitionEvidence_Payload => return printEIT_Acquisition_CoordinatorAcquisitionEvidence_Payload(o)
        case o: EIT_Acquisition_Coordinator.MonitoringResolution_Payload => return printEIT_Acquisition_CoordinatorMonitoringResolution_Payload(o)
        case o: EIT_Acquisition_Coordinator.MonitoringDisposition_Payload => return printEIT_Acquisition_CoordinatorMonitoringDisposition_Payload(o)
        case o: EIT_Acquisition_Coordinator.MonitoringRequestSample_Payload => return printEIT_Acquisition_CoordinatorMonitoringRequestSample_Payload(o)
        case o: EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PreState_Container_P => return printEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_P(o)
        case o: EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PreState_Container_PS => return printEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_PS(o)
        case o: EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PostState_Container_P => return printEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_P(o)
        case o: EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PostState_Container_PS => return printEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_PS(o)
        case o: EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_P => return printEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_P(o)
        case o: EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PS => return printEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PS(o)
        case o: EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_P => return printEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_P(o)
        case o: EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PS => return printEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PS(o)
        case o: EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_P => return printEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_P(o)
        case o: EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PS => return printEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PS(o)
        case o: EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_P => return printEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_P(o)
        case o: EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PS => return printEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PS(o)
        case o: EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_P => return printEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_P(o)
        case o: EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PS => return printEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PS(o)
        case o: EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_P => return printEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_P(o)
        case o: EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PS => return printEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PS(o)
        case o: EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_P => return printEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_P(o)
        case o: EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PS => return printEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PS(o)
        case o: EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_P => return printEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_P(o)
        case o: EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PS => return printEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PS(o)
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

    def parseEIT_Acquisition_CoordinatorMonitoringRequestType(): EIT_Acquisition_Coordinator.MonitoringRequest.Type = {
      val r = parseEIT_Acquisition_CoordinatorMonitoringRequestT(F)
      return r
    }

    def parseEIT_Acquisition_CoordinatorMonitoringRequestT(typeParsed: B): EIT_Acquisition_Coordinator.MonitoringRequest.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Coordinator.MonitoringRequest")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Acquisition_Coordinator.MonitoringRequest.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Acquisition_Coordinator.MonitoringRequest.")
          return EIT_Acquisition_Coordinator.MonitoringRequest.byOrdinal(0).get
      }
    }

    def parseEIT_Acquisition_CoordinatorMonitoringRequest_Payload(): EIT_Acquisition_Coordinator.MonitoringRequest_Payload = {
      val r = parseEIT_Acquisition_CoordinatorMonitoringRequest_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_CoordinatorMonitoringRequest_PayloadT(typeParsed: B): EIT_Acquisition_Coordinator.MonitoringRequest_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Coordinator.MonitoringRequest_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_CoordinatorMonitoringRequestType()
      parser.parseObjectNext()
      return EIT_Acquisition_Coordinator.MonitoringRequest_Payload(value)
    }

    def parseEIT_Acquisition_CoordinatorInputStatusType(): EIT_Acquisition_Coordinator.InputStatus.Type = {
      val r = parseEIT_Acquisition_CoordinatorInputStatusT(F)
      return r
    }

    def parseEIT_Acquisition_CoordinatorInputStatusT(typeParsed: B): EIT_Acquisition_Coordinator.InputStatus.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Coordinator.InputStatus")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Acquisition_Coordinator.InputStatus.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Acquisition_Coordinator.InputStatus.")
          return EIT_Acquisition_Coordinator.InputStatus.byOrdinal(0).get
      }
    }

    def parseEIT_Acquisition_CoordinatorInputStatus_Payload(): EIT_Acquisition_Coordinator.InputStatus_Payload = {
      val r = parseEIT_Acquisition_CoordinatorInputStatus_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_CoordinatorInputStatus_PayloadT(typeParsed: B): EIT_Acquisition_Coordinator.InputStatus_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Coordinator.InputStatus_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_CoordinatorInputStatusType()
      parser.parseObjectNext()
      return EIT_Acquisition_Coordinator.InputStatus_Payload(value)
    }

    def parseEIT_Acquisition_CoordinatorQualifiedRequestType(): EIT_Acquisition_Coordinator.QualifiedRequest.Type = {
      val r = parseEIT_Acquisition_CoordinatorQualifiedRequestT(F)
      return r
    }

    def parseEIT_Acquisition_CoordinatorQualifiedRequestT(typeParsed: B): EIT_Acquisition_Coordinator.QualifiedRequest.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Coordinator.QualifiedRequest")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Acquisition_Coordinator.QualifiedRequest.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Acquisition_Coordinator.QualifiedRequest.")
          return EIT_Acquisition_Coordinator.QualifiedRequest.byOrdinal(0).get
      }
    }

    def parseEIT_Acquisition_CoordinatorQualifiedRequest_Payload(): EIT_Acquisition_Coordinator.QualifiedRequest_Payload = {
      val r = parseEIT_Acquisition_CoordinatorQualifiedRequest_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_CoordinatorQualifiedRequest_PayloadT(typeParsed: B): EIT_Acquisition_Coordinator.QualifiedRequest_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Coordinator.QualifiedRequest_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_CoordinatorQualifiedRequestType()
      parser.parseObjectNext()
      return EIT_Acquisition_Coordinator.QualifiedRequest_Payload(value)
    }

    def parseEIT_Acquisition_CoordinatorCalibrationStateType(): EIT_Acquisition_Coordinator.CalibrationState.Type = {
      val r = parseEIT_Acquisition_CoordinatorCalibrationStateT(F)
      return r
    }

    def parseEIT_Acquisition_CoordinatorCalibrationStateT(typeParsed: B): EIT_Acquisition_Coordinator.CalibrationState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Coordinator.CalibrationState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Acquisition_Coordinator.CalibrationState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Acquisition_Coordinator.CalibrationState.")
          return EIT_Acquisition_Coordinator.CalibrationState.byOrdinal(0).get
      }
    }

    def parseEIT_Acquisition_CoordinatorCalibrationState_Payload(): EIT_Acquisition_Coordinator.CalibrationState_Payload = {
      val r = parseEIT_Acquisition_CoordinatorCalibrationState_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_CoordinatorCalibrationState_PayloadT(typeParsed: B): EIT_Acquisition_Coordinator.CalibrationState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Coordinator.CalibrationState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_CoordinatorCalibrationStateType()
      parser.parseObjectNext()
      return EIT_Acquisition_Coordinator.CalibrationState_Payload(value)
    }

    def parseEIT_Acquisition_CoordinatorImpedanceTokenType(): EIT_Acquisition_Coordinator.ImpedanceToken.Type = {
      val r = parseEIT_Acquisition_CoordinatorImpedanceTokenT(F)
      return r
    }

    def parseEIT_Acquisition_CoordinatorImpedanceTokenT(typeParsed: B): EIT_Acquisition_Coordinator.ImpedanceToken.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Coordinator.ImpedanceToken")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Acquisition_Coordinator.ImpedanceToken.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Acquisition_Coordinator.ImpedanceToken.")
          return EIT_Acquisition_Coordinator.ImpedanceToken.byOrdinal(0).get
      }
    }

    def parseEIT_Acquisition_CoordinatorImpedanceToken_Payload(): EIT_Acquisition_Coordinator.ImpedanceToken_Payload = {
      val r = parseEIT_Acquisition_CoordinatorImpedanceToken_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_CoordinatorImpedanceToken_PayloadT(typeParsed: B): EIT_Acquisition_Coordinator.ImpedanceToken_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Coordinator.ImpedanceToken_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_CoordinatorImpedanceTokenType()
      parser.parseObjectNext()
      return EIT_Acquisition_Coordinator.ImpedanceToken_Payload(value)
    }

    def parseEIT_Acquisition_CoordinatorAcquisitionEvidenceType(): EIT_Acquisition_Coordinator.AcquisitionEvidence.Type = {
      val r = parseEIT_Acquisition_CoordinatorAcquisitionEvidenceT(F)
      return r
    }

    def parseEIT_Acquisition_CoordinatorAcquisitionEvidenceT(typeParsed: B): EIT_Acquisition_Coordinator.AcquisitionEvidence.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Coordinator.AcquisitionEvidence")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Acquisition_Coordinator.AcquisitionEvidence.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Acquisition_Coordinator.AcquisitionEvidence.")
          return EIT_Acquisition_Coordinator.AcquisitionEvidence.byOrdinal(0).get
      }
    }

    def parseEIT_Acquisition_CoordinatorAcquisitionEvidence_Payload(): EIT_Acquisition_Coordinator.AcquisitionEvidence_Payload = {
      val r = parseEIT_Acquisition_CoordinatorAcquisitionEvidence_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_CoordinatorAcquisitionEvidence_PayloadT(typeParsed: B): EIT_Acquisition_Coordinator.AcquisitionEvidence_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Coordinator.AcquisitionEvidence_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_CoordinatorAcquisitionEvidenceType()
      parser.parseObjectNext()
      return EIT_Acquisition_Coordinator.AcquisitionEvidence_Payload(value)
    }

    def parseEIT_Acquisition_CoordinatorAcquisitionCommandType(): EIT_Acquisition_Coordinator.AcquisitionCommand.Type = {
      val r = parseEIT_Acquisition_CoordinatorAcquisitionCommandT(F)
      return r
    }

    def parseEIT_Acquisition_CoordinatorAcquisitionCommandT(typeParsed: B): EIT_Acquisition_Coordinator.AcquisitionCommand.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Coordinator.AcquisitionCommand")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Acquisition_Coordinator.AcquisitionCommand.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Acquisition_Coordinator.AcquisitionCommand.")
          return EIT_Acquisition_Coordinator.AcquisitionCommand.byOrdinal(0).get
      }
    }

    def parseEIT_Acquisition_CoordinatorAcquisitionCommand_Payload(): EIT_Acquisition_Coordinator.AcquisitionCommand_Payload = {
      val r = parseEIT_Acquisition_CoordinatorAcquisitionCommand_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_CoordinatorAcquisitionCommand_PayloadT(typeParsed: B): EIT_Acquisition_Coordinator.AcquisitionCommand_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Coordinator.AcquisitionCommand_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_CoordinatorAcquisitionCommandType()
      parser.parseObjectNext()
      return EIT_Acquisition_Coordinator.AcquisitionCommand_Payload(value)
    }

    def parseEIT_Acquisition_CoordinatorSessionModeType(): EIT_Acquisition_Coordinator.SessionMode.Type = {
      val r = parseEIT_Acquisition_CoordinatorSessionModeT(F)
      return r
    }

    def parseEIT_Acquisition_CoordinatorSessionModeT(typeParsed: B): EIT_Acquisition_Coordinator.SessionMode.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Coordinator.SessionMode")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Acquisition_Coordinator.SessionMode.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Acquisition_Coordinator.SessionMode.")
          return EIT_Acquisition_Coordinator.SessionMode.byOrdinal(0).get
      }
    }

    def parseEIT_Acquisition_CoordinatorSessionMode_Payload(): EIT_Acquisition_Coordinator.SessionMode_Payload = {
      val r = parseEIT_Acquisition_CoordinatorSessionMode_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_CoordinatorSessionMode_PayloadT(typeParsed: B): EIT_Acquisition_Coordinator.SessionMode_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Coordinator.SessionMode_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_CoordinatorSessionModeType()
      parser.parseObjectNext()
      return EIT_Acquisition_Coordinator.SessionMode_Payload(value)
    }

    def parseEIT_Acquisition_CoordinatorRecoveryPhaseType(): EIT_Acquisition_Coordinator.RecoveryPhase.Type = {
      val r = parseEIT_Acquisition_CoordinatorRecoveryPhaseT(F)
      return r
    }

    def parseEIT_Acquisition_CoordinatorRecoveryPhaseT(typeParsed: B): EIT_Acquisition_Coordinator.RecoveryPhase.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Coordinator.RecoveryPhase")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Acquisition_Coordinator.RecoveryPhase.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Acquisition_Coordinator.RecoveryPhase.")
          return EIT_Acquisition_Coordinator.RecoveryPhase.byOrdinal(0).get
      }
    }

    def parseEIT_Acquisition_CoordinatorRecoveryPhase_Payload(): EIT_Acquisition_Coordinator.RecoveryPhase_Payload = {
      val r = parseEIT_Acquisition_CoordinatorRecoveryPhase_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_CoordinatorRecoveryPhase_PayloadT(typeParsed: B): EIT_Acquisition_Coordinator.RecoveryPhase_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Coordinator.RecoveryPhase_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_CoordinatorRecoveryPhaseType()
      parser.parseObjectNext()
      return EIT_Acquisition_Coordinator.RecoveryPhase_Payload(value)
    }

    def parseEIT_Acquisition_CoordinatorMonitoringDispositionType(): EIT_Acquisition_Coordinator.MonitoringDisposition.Type = {
      val r = parseEIT_Acquisition_CoordinatorMonitoringDispositionT(F)
      return r
    }

    def parseEIT_Acquisition_CoordinatorMonitoringDispositionT(typeParsed: B): EIT_Acquisition_Coordinator.MonitoringDisposition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Coordinator.MonitoringDisposition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Acquisition_Coordinator.MonitoringDisposition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Acquisition_Coordinator.MonitoringDisposition.")
          return EIT_Acquisition_Coordinator.MonitoringDisposition.byOrdinal(0).get
      }
    }

    def parseEIT_Acquisition_CoordinatorMonitoringDisposition_Payload(): EIT_Acquisition_Coordinator.MonitoringDisposition_Payload = {
      val r = parseEIT_Acquisition_CoordinatorMonitoringDisposition_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_CoordinatorMonitoringDisposition_PayloadT(typeParsed: B): EIT_Acquisition_Coordinator.MonitoringDisposition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Coordinator.MonitoringDisposition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_CoordinatorMonitoringDispositionType()
      parser.parseObjectNext()
      return EIT_Acquisition_Coordinator.MonitoringDisposition_Payload(value)
    }

    def parseEIT_Acquisition_CoordinatorImpedanceDeliveryType(): EIT_Acquisition_Coordinator.ImpedanceDelivery.Type = {
      val r = parseEIT_Acquisition_CoordinatorImpedanceDeliveryT(F)
      return r
    }

    def parseEIT_Acquisition_CoordinatorImpedanceDeliveryT(typeParsed: B): EIT_Acquisition_Coordinator.ImpedanceDelivery.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Coordinator.ImpedanceDelivery")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Acquisition_Coordinator.ImpedanceDelivery.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Acquisition_Coordinator.ImpedanceDelivery.")
          return EIT_Acquisition_Coordinator.ImpedanceDelivery.byOrdinal(0).get
      }
    }

    def parseEIT_Acquisition_CoordinatorImpedanceDelivery_Payload(): EIT_Acquisition_Coordinator.ImpedanceDelivery_Payload = {
      val r = parseEIT_Acquisition_CoordinatorImpedanceDelivery_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_CoordinatorImpedanceDelivery_PayloadT(typeParsed: B): EIT_Acquisition_Coordinator.ImpedanceDelivery_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Coordinator.ImpedanceDelivery_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_CoordinatorImpedanceDeliveryType()
      parser.parseObjectNext()
      return EIT_Acquisition_Coordinator.ImpedanceDelivery_Payload(value)
    }

    def parseEIT_Acquisition_CoordinatorMonitoringStatusType(): EIT_Acquisition_Coordinator.MonitoringStatus.Type = {
      val r = parseEIT_Acquisition_CoordinatorMonitoringStatusT(F)
      return r
    }

    def parseEIT_Acquisition_CoordinatorMonitoringStatusT(typeParsed: B): EIT_Acquisition_Coordinator.MonitoringStatus.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Coordinator.MonitoringStatus")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Acquisition_Coordinator.MonitoringStatus.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Acquisition_Coordinator.MonitoringStatus.")
          return EIT_Acquisition_Coordinator.MonitoringStatus.byOrdinal(0).get
      }
    }

    def parseEIT_Acquisition_CoordinatorMonitoringStatus_Payload(): EIT_Acquisition_Coordinator.MonitoringStatus_Payload = {
      val r = parseEIT_Acquisition_CoordinatorMonitoringStatus_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_CoordinatorMonitoringStatus_PayloadT(typeParsed: B): EIT_Acquisition_Coordinator.MonitoringStatus_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Coordinator.MonitoringStatus_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_CoordinatorMonitoringStatusType()
      parser.parseObjectNext()
      return EIT_Acquisition_Coordinator.MonitoringStatus_Payload(value)
    }

    def parseEIT_Acquisition_CoordinatorMonitoringRequestSample(): EIT_Acquisition_Coordinator.MonitoringRequestSample = {
      val r = parseEIT_Acquisition_CoordinatorMonitoringRequestSampleT(F)
      return r
    }

    def parseEIT_Acquisition_CoordinatorMonitoringRequestSampleT(typeParsed: B): EIT_Acquisition_Coordinator.MonitoringRequestSample = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Coordinator.MonitoringRequestSample")
      }
      parser.parseObjectKey("request")
      val request = parseEIT_Acquisition_CoordinatorMonitoringRequestType()
      parser.parseObjectNext()
      parser.parseObjectKey("status")
      val status = parseEIT_Acquisition_CoordinatorInputStatusType()
      parser.parseObjectNext()
      return EIT_Acquisition_Coordinator.MonitoringRequestSample(request, status)
    }

    def parseEIT_Acquisition_CoordinatorMonitoringRequestSample_Payload(): EIT_Acquisition_Coordinator.MonitoringRequestSample_Payload = {
      val r = parseEIT_Acquisition_CoordinatorMonitoringRequestSample_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_CoordinatorMonitoringRequestSample_PayloadT(typeParsed: B): EIT_Acquisition_Coordinator.MonitoringRequestSample_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Coordinator.MonitoringRequestSample_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_CoordinatorMonitoringRequestSample()
      parser.parseObjectNext()
      return EIT_Acquisition_Coordinator.MonitoringRequestSample_Payload(value)
    }

    def parseEIT_Acquisition_CoordinatorCalibrationSample(): EIT_Acquisition_Coordinator.CalibrationSample = {
      val r = parseEIT_Acquisition_CoordinatorCalibrationSampleT(F)
      return r
    }

    def parseEIT_Acquisition_CoordinatorCalibrationSampleT(typeParsed: B): EIT_Acquisition_Coordinator.CalibrationSample = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Coordinator.CalibrationSample")
      }
      parser.parseObjectKey("calibration")
      val calibration = parseEIT_Acquisition_CoordinatorCalibrationStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("status")
      val status = parseEIT_Acquisition_CoordinatorInputStatusType()
      parser.parseObjectNext()
      return EIT_Acquisition_Coordinator.CalibrationSample(calibration, status)
    }

    def parseEIT_Acquisition_CoordinatorCalibrationSample_Payload(): EIT_Acquisition_Coordinator.CalibrationSample_Payload = {
      val r = parseEIT_Acquisition_CoordinatorCalibrationSample_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_CoordinatorCalibrationSample_PayloadT(typeParsed: B): EIT_Acquisition_Coordinator.CalibrationSample_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Coordinator.CalibrationSample_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_CoordinatorCalibrationSample()
      parser.parseObjectNext()
      return EIT_Acquisition_Coordinator.CalibrationSample_Payload(value)
    }

    def parseEIT_Acquisition_CoordinatorImpedanceSample(): EIT_Acquisition_Coordinator.ImpedanceSample = {
      val r = parseEIT_Acquisition_CoordinatorImpedanceSampleT(F)
      return r
    }

    def parseEIT_Acquisition_CoordinatorImpedanceSampleT(typeParsed: B): EIT_Acquisition_Coordinator.ImpedanceSample = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Coordinator.ImpedanceSample")
      }
      parser.parseObjectKey("token")
      val token = parseEIT_Acquisition_CoordinatorImpedanceTokenType()
      parser.parseObjectNext()
      parser.parseObjectKey("status")
      val status = parseEIT_Acquisition_CoordinatorInputStatusType()
      parser.parseObjectNext()
      return EIT_Acquisition_Coordinator.ImpedanceSample(token, status)
    }

    def parseEIT_Acquisition_CoordinatorImpedanceSample_Payload(): EIT_Acquisition_Coordinator.ImpedanceSample_Payload = {
      val r = parseEIT_Acquisition_CoordinatorImpedanceSample_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_CoordinatorImpedanceSample_PayloadT(typeParsed: B): EIT_Acquisition_Coordinator.ImpedanceSample_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Coordinator.ImpedanceSample_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_CoordinatorImpedanceSample()
      parser.parseObjectNext()
      return EIT_Acquisition_Coordinator.ImpedanceSample_Payload(value)
    }

    def parseEIT_Acquisition_CoordinatorMonitoringResolution(): EIT_Acquisition_Coordinator.MonitoringResolution = {
      val r = parseEIT_Acquisition_CoordinatorMonitoringResolutionT(F)
      return r
    }

    def parseEIT_Acquisition_CoordinatorMonitoringResolutionT(typeParsed: B): EIT_Acquisition_Coordinator.MonitoringResolution = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Coordinator.MonitoringResolution")
      }
      parser.parseObjectKey("nextSessionMode")
      val nextSessionMode = parseEIT_Acquisition_CoordinatorSessionModeType()
      parser.parseObjectNext()
      parser.parseObjectKey("nextRecoveryPhase")
      val nextRecoveryPhase = parseEIT_Acquisition_CoordinatorRecoveryPhaseType()
      parser.parseObjectNext()
      parser.parseObjectKey("acquisitionCommand")
      val acquisitionCommand = parseEIT_Acquisition_CoordinatorAcquisitionCommandType()
      parser.parseObjectNext()
      parser.parseObjectKey("disposition")
      val disposition = parseEIT_Acquisition_CoordinatorMonitoringDispositionType()
      parser.parseObjectNext()
      return EIT_Acquisition_Coordinator.MonitoringResolution(nextSessionMode, nextRecoveryPhase, acquisitionCommand, disposition)
    }

    def parseEIT_Acquisition_CoordinatorMonitoringResolution_Payload(): EIT_Acquisition_Coordinator.MonitoringResolution_Payload = {
      val r = parseEIT_Acquisition_CoordinatorMonitoringResolution_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_CoordinatorMonitoringResolution_PayloadT(typeParsed: B): EIT_Acquisition_Coordinator.MonitoringResolution_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Coordinator.MonitoringResolution_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_CoordinatorMonitoringResolution()
      parser.parseObjectNext()
      return EIT_Acquisition_Coordinator.MonitoringResolution_Payload(value)
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

    def parseEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container(): EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PreState_Container_P", "EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PreState_Container_PS"))
      t.native match {
        case "EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PreState_Container_P" => val r = parseEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PreState_Container_PS" => val r = parseEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_PST(T); return r
        case _ => val r = parseEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_PST(T); return r
      }
    }

    def parseEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_P(): EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PreState_Container_P = {
      val r = parseEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_PT(F)
      return r
    }

    def parseEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_PT(typeParsed: B): EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PreState_Container_P")
      }
      parser.parseObjectKey("api_requestSample")
      val api_requestSample = parseEIT_Acquisition_CoordinatorMonitoringRequestSample()
      parser.parseObjectNext()
      return EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PreState_Container_P(api_requestSample)
    }

    def parseEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_PS(): EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PreState_Container_PS = {
      val r = parseEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_PST(F)
      return r
    }

    def parseEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_PST(typeParsed: B): EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PreState_Container_PS")
      }
      parser.parseObjectKey("api_requestSample")
      val api_requestSample = parseEIT_Acquisition_CoordinatorMonitoringRequestSample()
      parser.parseObjectNext()
      return EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PreState_Container_PS(api_requestSample)
    }

    def parseEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container(): EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PostState_Container_P", "EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PostState_Container_PS"))
      t.native match {
        case "EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PostState_Container_P" => val r = parseEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PostState_Container_PS" => val r = parseEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_PST(T); return r
        case _ => val r = parseEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_PST(T); return r
      }
    }

    def parseEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_P(): EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PostState_Container_P = {
      val r = parseEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_PT(F)
      return r
    }

    def parseEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_PT(typeParsed: B): EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PostState_Container_P")
      }
      parser.parseObjectKey("api_qualifiedRequest")
      val api_qualifiedRequest = parseEIT_Acquisition_CoordinatorQualifiedRequestType()
      parser.parseObjectNext()
      return EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PostState_Container_P(api_qualifiedRequest)
    }

    def parseEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_PS(): EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PostState_Container_PS = {
      val r = parseEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_PST(F)
      return r
    }

    def parseEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_PST(typeParsed: B): EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PostState_Container_PS")
      }
      parser.parseObjectKey("api_qualifiedRequest")
      val api_qualifiedRequest = parseEIT_Acquisition_CoordinatorQualifiedRequestType()
      parser.parseObjectNext()
      return EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PostState_Container_PS(api_qualifiedRequest)
    }

    def parseEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container(): EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_P", "EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PS"))
      t.native match {
        case "EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_P" => val r = parseEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PS" => val r = parseEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PST(T); return r
        case _ => val r = parseEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PST(T); return r
      }
    }

    def parseEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_P(): EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_P = {
      val r = parseEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PT(F)
      return r
    }

    def parseEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PT(typeParsed: B): EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_P")
      }
      parser.parseObjectKey("api_calibrationSample")
      val api_calibrationSample = parseEIT_Acquisition_CoordinatorCalibrationSample()
      parser.parseObjectNext()
      parser.parseObjectKey("api_impedanceSample")
      val api_impedanceSample = parseEIT_Acquisition_CoordinatorImpedanceSample()
      parser.parseObjectNext()
      return EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_P(api_calibrationSample, api_impedanceSample)
    }

    def parseEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PS(): EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PS = {
      val r = parseEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PST(F)
      return r
    }

    def parseEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PST(typeParsed: B): EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PS")
      }
      parser.parseObjectKey("api_calibrationSample")
      val api_calibrationSample = parseEIT_Acquisition_CoordinatorCalibrationSample()
      parser.parseObjectNext()
      parser.parseObjectKey("api_impedanceSample")
      val api_impedanceSample = parseEIT_Acquisition_CoordinatorImpedanceSample()
      parser.parseObjectNext()
      return EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PS(api_calibrationSample, api_impedanceSample)
    }

    def parseEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container(): EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_P", "EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PS"))
      t.native match {
        case "EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_P" => val r = parseEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PS" => val r = parseEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PST(T); return r
        case _ => val r = parseEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PST(T); return r
      }
    }

    def parseEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_P(): EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_P = {
      val r = parseEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PT(F)
      return r
    }

    def parseEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PT(typeParsed: B): EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_P")
      }
      parser.parseObjectKey("api_acquisitionEvidence")
      val api_acquisitionEvidence = parseEIT_Acquisition_CoordinatorAcquisitionEvidenceType()
      parser.parseObjectNext()
      return EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_P(api_acquisitionEvidence)
    }

    def parseEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PS(): EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PS = {
      val r = parseEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PST(F)
      return r
    }

    def parseEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PST(typeParsed: B): EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PS")
      }
      parser.parseObjectKey("api_acquisitionEvidence")
      val api_acquisitionEvidence = parseEIT_Acquisition_CoordinatorAcquisitionEvidenceType()
      parser.parseObjectNext()
      return EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PS(api_acquisitionEvidence)
    }

    def parseEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container(): EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_P", "EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PS"))
      t.native match {
        case "EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_P" => val r = parseEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PS" => val r = parseEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PST(T); return r
        case _ => val r = parseEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PST(T); return r
      }
    }

    def parseEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_P(): EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_P = {
      val r = parseEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PT(F)
      return r
    }

    def parseEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PT(typeParsed: B): EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_P")
      }
      parser.parseObjectKey("api_acquisitionEvidence")
      val api_acquisitionEvidence = parseEIT_Acquisition_CoordinatorAcquisitionEvidenceType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_qualifiedRequest")
      val api_qualifiedRequest = parseEIT_Acquisition_CoordinatorQualifiedRequestType()
      parser.parseObjectNext()
      return EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_P(api_acquisitionEvidence, api_qualifiedRequest)
    }

    def parseEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PS(): EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PS = {
      val r = parseEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PST(F)
      return r
    }

    def parseEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PST(typeParsed: B): EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_acquisitionEvidence")
      val api_acquisitionEvidence = parseEIT_Acquisition_CoordinatorAcquisitionEvidenceType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_qualifiedRequest")
      val api_qualifiedRequest = parseEIT_Acquisition_CoordinatorQualifiedRequestType()
      parser.parseObjectNext()
      return EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PS(api_acquisitionEvidence, api_qualifiedRequest)
    }

    def parseEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container(): EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_P", "EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PS"))
      t.native match {
        case "EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_P" => val r = parseEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PS" => val r = parseEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PST(T); return r
        case _ => val r = parseEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PST(T); return r
      }
    }

    def parseEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_P(): EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_P = {
      val r = parseEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PT(F)
      return r
    }

    def parseEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PT(typeParsed: B): EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_P")
      }
      parser.parseObjectKey("api_acquisitionCommand")
      val api_acquisitionCommand = parseEIT_Acquisition_CoordinatorAcquisitionCommandType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_monitoringResolution")
      val api_monitoringResolution = parseEIT_Acquisition_CoordinatorMonitoringResolution()
      parser.parseObjectNext()
      return EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_P(api_acquisitionCommand, api_monitoringResolution)
    }

    def parseEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PS(): EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PS = {
      val r = parseEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PST(F)
      return r
    }

    def parseEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PST(typeParsed: B): EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_acquisitionCommand")
      val api_acquisitionCommand = parseEIT_Acquisition_CoordinatorAcquisitionCommandType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_monitoringResolution")
      val api_monitoringResolution = parseEIT_Acquisition_CoordinatorMonitoringResolution()
      parser.parseObjectNext()
      return EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PS(api_acquisitionCommand, api_monitoringResolution)
    }

    def parseEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container(): EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_P", "EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PS"))
      t.native match {
        case "EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_P" => val r = parseEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PS" => val r = parseEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PST(T); return r
        case _ => val r = parseEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PST(T); return r
      }
    }

    def parseEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_P(): EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_P = {
      val r = parseEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PT(F)
      return r
    }

    def parseEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PT(typeParsed: B): EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_P")
      }
      parser.parseObjectKey("api_acquisitionEvidence")
      val api_acquisitionEvidence = parseEIT_Acquisition_CoordinatorAcquisitionEvidenceType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_monitoringResolution")
      val api_monitoringResolution = parseEIT_Acquisition_CoordinatorMonitoringResolution()
      parser.parseObjectNext()
      return EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_P(api_acquisitionEvidence, api_monitoringResolution)
    }

    def parseEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PS(): EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PS = {
      val r = parseEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PST(F)
      return r
    }

    def parseEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PST(typeParsed: B): EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PS")
      }
      parser.parseObjectKey("api_acquisitionEvidence")
      val api_acquisitionEvidence = parseEIT_Acquisition_CoordinatorAcquisitionEvidenceType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_monitoringResolution")
      val api_monitoringResolution = parseEIT_Acquisition_CoordinatorMonitoringResolution()
      parser.parseObjectNext()
      return EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PS(api_acquisitionEvidence, api_monitoringResolution)
    }

    def parseEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container(): EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_P", "EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PS"))
      t.native match {
        case "EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_P" => val r = parseEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PS" => val r = parseEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PST(T); return r
        case _ => val r = parseEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PST(T); return r
      }
    }

    def parseEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_P(): EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_P = {
      val r = parseEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PT(F)
      return r
    }

    def parseEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PT(typeParsed: B): EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_P")
      }
      parser.parseObjectKey("api_impedanceDelivery")
      val api_impedanceDelivery = parseEIT_Acquisition_CoordinatorImpedanceDeliveryType()
      parser.parseObjectNext()
      return EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_P(api_impedanceDelivery)
    }

    def parseEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PS(): EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PS = {
      val r = parseEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PST(F)
      return r
    }

    def parseEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PST(typeParsed: B): EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PS")
      }
      parser.parseObjectKey("api_impedanceDelivery")
      val api_impedanceDelivery = parseEIT_Acquisition_CoordinatorImpedanceDeliveryType()
      parser.parseObjectNext()
      return EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PS(api_impedanceDelivery)
    }

    def parseEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container(): EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_P", "EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PS"))
      t.native match {
        case "EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_P" => val r = parseEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PS" => val r = parseEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PST(T); return r
        case _ => val r = parseEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PST(T); return r
      }
    }

    def parseEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_P(): EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_P = {
      val r = parseEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PT(F)
      return r
    }

    def parseEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PT(typeParsed: B): EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_P")
      }
      parser.parseObjectKey("api_acquisitionEvidence")
      val api_acquisitionEvidence = parseEIT_Acquisition_CoordinatorAcquisitionEvidenceType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_monitoringResolution")
      val api_monitoringResolution = parseEIT_Acquisition_CoordinatorMonitoringResolution()
      parser.parseObjectNext()
      return EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_P(api_acquisitionEvidence, api_monitoringResolution)
    }

    def parseEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PS(): EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PS = {
      val r = parseEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PST(F)
      return r
    }

    def parseEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PST(typeParsed: B): EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PS")
      }
      parser.parseObjectKey("api_acquisitionEvidence")
      val api_acquisitionEvidence = parseEIT_Acquisition_CoordinatorAcquisitionEvidenceType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_monitoringResolution")
      val api_monitoringResolution = parseEIT_Acquisition_CoordinatorMonitoringResolution()
      parser.parseObjectNext()
      return EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PS(api_acquisitionEvidence, api_monitoringResolution)
    }

    def parseEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container(): EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_P", "EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PS"))
      t.native match {
        case "EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_P" => val r = parseEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PS" => val r = parseEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PST(T); return r
        case _ => val r = parseEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PST(T); return r
      }
    }

    def parseEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_P(): EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_P = {
      val r = parseEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PT(F)
      return r
    }

    def parseEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PT(typeParsed: B): EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_P")
      }
      parser.parseObjectKey("api_monitoringStatus")
      val api_monitoringStatus = parseEIT_Acquisition_CoordinatorMonitoringStatusType()
      parser.parseObjectNext()
      return EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_P(api_monitoringStatus)
    }

    def parseEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PS(): EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PS = {
      val r = parseEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PST(F)
      return r
    }

    def parseEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PST(typeParsed: B): EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PS")
      }
      parser.parseObjectKey("api_monitoringStatus")
      val api_monitoringStatus = parseEIT_Acquisition_CoordinatorMonitoringStatusType()
      parser.parseObjectNext()
      return EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PS(api_monitoringStatus)
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
      val t = parser.parseObjectTypes(ISZ("util.EmptyContainer", "EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PreState_Container_P", "EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PreState_Container_PS", "EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PostState_Container_P", "EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PostState_Container_PS", "EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_P", "EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PS", "EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_P", "EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PS", "EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_P", "EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PS", "EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_P", "EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PS", "EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_P", "EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PS", "EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_P", "EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PS", "EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_P", "EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PS", "EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_P", "EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PS"))
      t.native match {
        case "util.EmptyContainer" => val r = parseutilEmptyContainerT(T); return r
        case "EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PreState_Container_P" => val r = parseEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PreState_Container_PS" => val r = parseEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_PST(T); return r
        case "EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PostState_Container_P" => val r = parseEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PostState_Container_PS" => val r = parseEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_PST(T); return r
        case "EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_P" => val r = parseEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PS" => val r = parseEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PST(T); return r
        case "EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_P" => val r = parseEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PS" => val r = parseEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PST(T); return r
        case "EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_P" => val r = parseEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PS" => val r = parseEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PST(T); return r
        case "EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_P" => val r = parseEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PS" => val r = parseEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PST(T); return r
        case "EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_P" => val r = parseEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PS" => val r = parseEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PST(T); return r
        case "EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_P" => val r = parseEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PS" => val r = parseEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PST(T); return r
        case "EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_P" => val r = parseEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PS" => val r = parseEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PST(T); return r
        case "EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_P" => val r = parseEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PS" => val r = parseEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PST(T); return r
        case _ => val r = parseEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PST(T); return r
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
      val t = parser.parseObjectTypes(ISZ("art.Empty", "Base_Types.Boolean_Payload", "Base_Types.Integer_Payload", "Base_Types.Integer_8_Payload", "Base_Types.Integer_16_Payload", "Base_Types.Integer_32_Payload", "Base_Types.Integer_64_Payload", "Base_Types.Unsigned_8_Payload", "Base_Types.Unsigned_16_Payload", "Base_Types.Unsigned_32_Payload", "Base_Types.Unsigned_64_Payload", "Base_Types.Float_Payload", "Base_Types.Float_32_Payload", "Base_Types.Float_64_Payload", "Base_Types.Character_Payload", "Base_Types.String_Payload", "Base_Types.Bits_Payload", "util.EmptyContainer", "EIT_Acquisition_Coordinator.InputStatus_Payload", "EIT_Acquisition_Coordinator.SessionMode_Payload", "EIT_Acquisition_Coordinator.RecoveryPhase_Payload", "EIT_Acquisition_Coordinator.ImpedanceToken_Payload", "EIT_Acquisition_Coordinator.ImpedanceSample_Payload", "EIT_Acquisition_Coordinator.CalibrationState_Payload", "EIT_Acquisition_Coordinator.QualifiedRequest_Payload", "EIT_Acquisition_Coordinator.MonitoringStatus_Payload", "EIT_Acquisition_Coordinator.MonitoringRequest_Payload", "EIT_Acquisition_Coordinator.ImpedanceDelivery_Payload", "EIT_Acquisition_Coordinator.CalibrationSample_Payload", "EIT_Acquisition_Coordinator.AcquisitionCommand_Payload", "EIT_Acquisition_Coordinator.AcquisitionEvidence_Payload", "EIT_Acquisition_Coordinator.MonitoringResolution_Payload", "EIT_Acquisition_Coordinator.MonitoringDisposition_Payload", "EIT_Acquisition_Coordinator.MonitoringRequestSample_Payload", "EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PreState_Container_P", "EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PreState_Container_PS", "EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PostState_Container_P", "EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PostState_Container_PS", "EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_P", "EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PS", "EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_P", "EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PS", "EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_P", "EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PS", "EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_P", "EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PS", "EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_P", "EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PS", "EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_P", "EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PS", "EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_P", "EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PS", "EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_P", "EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PS"))
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
        case "EIT_Acquisition_Coordinator.InputStatus_Payload" => val r = parseEIT_Acquisition_CoordinatorInputStatus_PayloadT(T); return r
        case "EIT_Acquisition_Coordinator.SessionMode_Payload" => val r = parseEIT_Acquisition_CoordinatorSessionMode_PayloadT(T); return r
        case "EIT_Acquisition_Coordinator.RecoveryPhase_Payload" => val r = parseEIT_Acquisition_CoordinatorRecoveryPhase_PayloadT(T); return r
        case "EIT_Acquisition_Coordinator.ImpedanceToken_Payload" => val r = parseEIT_Acquisition_CoordinatorImpedanceToken_PayloadT(T); return r
        case "EIT_Acquisition_Coordinator.ImpedanceSample_Payload" => val r = parseEIT_Acquisition_CoordinatorImpedanceSample_PayloadT(T); return r
        case "EIT_Acquisition_Coordinator.CalibrationState_Payload" => val r = parseEIT_Acquisition_CoordinatorCalibrationState_PayloadT(T); return r
        case "EIT_Acquisition_Coordinator.QualifiedRequest_Payload" => val r = parseEIT_Acquisition_CoordinatorQualifiedRequest_PayloadT(T); return r
        case "EIT_Acquisition_Coordinator.MonitoringStatus_Payload" => val r = parseEIT_Acquisition_CoordinatorMonitoringStatus_PayloadT(T); return r
        case "EIT_Acquisition_Coordinator.MonitoringRequest_Payload" => val r = parseEIT_Acquisition_CoordinatorMonitoringRequest_PayloadT(T); return r
        case "EIT_Acquisition_Coordinator.ImpedanceDelivery_Payload" => val r = parseEIT_Acquisition_CoordinatorImpedanceDelivery_PayloadT(T); return r
        case "EIT_Acquisition_Coordinator.CalibrationSample_Payload" => val r = parseEIT_Acquisition_CoordinatorCalibrationSample_PayloadT(T); return r
        case "EIT_Acquisition_Coordinator.AcquisitionCommand_Payload" => val r = parseEIT_Acquisition_CoordinatorAcquisitionCommand_PayloadT(T); return r
        case "EIT_Acquisition_Coordinator.AcquisitionEvidence_Payload" => val r = parseEIT_Acquisition_CoordinatorAcquisitionEvidence_PayloadT(T); return r
        case "EIT_Acquisition_Coordinator.MonitoringResolution_Payload" => val r = parseEIT_Acquisition_CoordinatorMonitoringResolution_PayloadT(T); return r
        case "EIT_Acquisition_Coordinator.MonitoringDisposition_Payload" => val r = parseEIT_Acquisition_CoordinatorMonitoringDisposition_PayloadT(T); return r
        case "EIT_Acquisition_Coordinator.MonitoringRequestSample_Payload" => val r = parseEIT_Acquisition_CoordinatorMonitoringRequestSample_PayloadT(T); return r
        case "EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PreState_Container_P" => val r = parseEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PreState_Container_PS" => val r = parseEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_PST(T); return r
        case "EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PostState_Container_P" => val r = parseEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PostState_Container_PS" => val r = parseEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_PST(T); return r
        case "EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_P" => val r = parseEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PS" => val r = parseEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PST(T); return r
        case "EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_P" => val r = parseEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PS" => val r = parseEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PST(T); return r
        case "EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_P" => val r = parseEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PS" => val r = parseEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PST(T); return r
        case "EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_P" => val r = parseEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PS" => val r = parseEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PST(T); return r
        case "EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_P" => val r = parseEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PS" => val r = parseEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PST(T); return r
        case "EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_P" => val r = parseEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PS" => val r = parseEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PST(T); return r
        case "EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_P" => val r = parseEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PS" => val r = parseEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PST(T); return r
        case "EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_P" => val r = parseEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PS" => val r = parseEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PST(T); return r
        case _ => val r = parseEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PST(T); return r
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

  def fromEIT_Acquisition_CoordinatorMonitoringRequest_Payload(o: EIT_Acquisition_Coordinator.MonitoringRequest_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_CoordinatorMonitoringRequest_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_CoordinatorMonitoringRequest_Payload(s: String): Either[EIT_Acquisition_Coordinator.MonitoringRequest_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorMonitoringRequest_Payload(parser: Parser): EIT_Acquisition_Coordinator.MonitoringRequest_Payload = {
      val r = parser.parseEIT_Acquisition_CoordinatorMonitoringRequest_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_CoordinatorMonitoringRequest_Payload _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorInputStatus_Payload(o: EIT_Acquisition_Coordinator.InputStatus_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_CoordinatorInputStatus_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_CoordinatorInputStatus_Payload(s: String): Either[EIT_Acquisition_Coordinator.InputStatus_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorInputStatus_Payload(parser: Parser): EIT_Acquisition_Coordinator.InputStatus_Payload = {
      val r = parser.parseEIT_Acquisition_CoordinatorInputStatus_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_CoordinatorInputStatus_Payload _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorQualifiedRequest_Payload(o: EIT_Acquisition_Coordinator.QualifiedRequest_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_CoordinatorQualifiedRequest_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_CoordinatorQualifiedRequest_Payload(s: String): Either[EIT_Acquisition_Coordinator.QualifiedRequest_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorQualifiedRequest_Payload(parser: Parser): EIT_Acquisition_Coordinator.QualifiedRequest_Payload = {
      val r = parser.parseEIT_Acquisition_CoordinatorQualifiedRequest_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_CoordinatorQualifiedRequest_Payload _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorCalibrationState_Payload(o: EIT_Acquisition_Coordinator.CalibrationState_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_CoordinatorCalibrationState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_CoordinatorCalibrationState_Payload(s: String): Either[EIT_Acquisition_Coordinator.CalibrationState_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorCalibrationState_Payload(parser: Parser): EIT_Acquisition_Coordinator.CalibrationState_Payload = {
      val r = parser.parseEIT_Acquisition_CoordinatorCalibrationState_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_CoordinatorCalibrationState_Payload _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorImpedanceToken_Payload(o: EIT_Acquisition_Coordinator.ImpedanceToken_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_CoordinatorImpedanceToken_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_CoordinatorImpedanceToken_Payload(s: String): Either[EIT_Acquisition_Coordinator.ImpedanceToken_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorImpedanceToken_Payload(parser: Parser): EIT_Acquisition_Coordinator.ImpedanceToken_Payload = {
      val r = parser.parseEIT_Acquisition_CoordinatorImpedanceToken_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_CoordinatorImpedanceToken_Payload _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorAcquisitionEvidence_Payload(o: EIT_Acquisition_Coordinator.AcquisitionEvidence_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_CoordinatorAcquisitionEvidence_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_CoordinatorAcquisitionEvidence_Payload(s: String): Either[EIT_Acquisition_Coordinator.AcquisitionEvidence_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorAcquisitionEvidence_Payload(parser: Parser): EIT_Acquisition_Coordinator.AcquisitionEvidence_Payload = {
      val r = parser.parseEIT_Acquisition_CoordinatorAcquisitionEvidence_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_CoordinatorAcquisitionEvidence_Payload _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorAcquisitionCommand_Payload(o: EIT_Acquisition_Coordinator.AcquisitionCommand_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_CoordinatorAcquisitionCommand_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_CoordinatorAcquisitionCommand_Payload(s: String): Either[EIT_Acquisition_Coordinator.AcquisitionCommand_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorAcquisitionCommand_Payload(parser: Parser): EIT_Acquisition_Coordinator.AcquisitionCommand_Payload = {
      val r = parser.parseEIT_Acquisition_CoordinatorAcquisitionCommand_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_CoordinatorAcquisitionCommand_Payload _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorSessionMode_Payload(o: EIT_Acquisition_Coordinator.SessionMode_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_CoordinatorSessionMode_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_CoordinatorSessionMode_Payload(s: String): Either[EIT_Acquisition_Coordinator.SessionMode_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorSessionMode_Payload(parser: Parser): EIT_Acquisition_Coordinator.SessionMode_Payload = {
      val r = parser.parseEIT_Acquisition_CoordinatorSessionMode_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_CoordinatorSessionMode_Payload _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorRecoveryPhase_Payload(o: EIT_Acquisition_Coordinator.RecoveryPhase_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_CoordinatorRecoveryPhase_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_CoordinatorRecoveryPhase_Payload(s: String): Either[EIT_Acquisition_Coordinator.RecoveryPhase_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorRecoveryPhase_Payload(parser: Parser): EIT_Acquisition_Coordinator.RecoveryPhase_Payload = {
      val r = parser.parseEIT_Acquisition_CoordinatorRecoveryPhase_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_CoordinatorRecoveryPhase_Payload _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorMonitoringDisposition_Payload(o: EIT_Acquisition_Coordinator.MonitoringDisposition_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_CoordinatorMonitoringDisposition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_CoordinatorMonitoringDisposition_Payload(s: String): Either[EIT_Acquisition_Coordinator.MonitoringDisposition_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorMonitoringDisposition_Payload(parser: Parser): EIT_Acquisition_Coordinator.MonitoringDisposition_Payload = {
      val r = parser.parseEIT_Acquisition_CoordinatorMonitoringDisposition_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_CoordinatorMonitoringDisposition_Payload _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorImpedanceDelivery_Payload(o: EIT_Acquisition_Coordinator.ImpedanceDelivery_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_CoordinatorImpedanceDelivery_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_CoordinatorImpedanceDelivery_Payload(s: String): Either[EIT_Acquisition_Coordinator.ImpedanceDelivery_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorImpedanceDelivery_Payload(parser: Parser): EIT_Acquisition_Coordinator.ImpedanceDelivery_Payload = {
      val r = parser.parseEIT_Acquisition_CoordinatorImpedanceDelivery_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_CoordinatorImpedanceDelivery_Payload _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorMonitoringStatus_Payload(o: EIT_Acquisition_Coordinator.MonitoringStatus_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_CoordinatorMonitoringStatus_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_CoordinatorMonitoringStatus_Payload(s: String): Either[EIT_Acquisition_Coordinator.MonitoringStatus_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorMonitoringStatus_Payload(parser: Parser): EIT_Acquisition_Coordinator.MonitoringStatus_Payload = {
      val r = parser.parseEIT_Acquisition_CoordinatorMonitoringStatus_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_CoordinatorMonitoringStatus_Payload _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorMonitoringRequestSample(o: EIT_Acquisition_Coordinator.MonitoringRequestSample, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_CoordinatorMonitoringRequestSample(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_CoordinatorMonitoringRequestSample(s: String): Either[EIT_Acquisition_Coordinator.MonitoringRequestSample, Json.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorMonitoringRequestSample(parser: Parser): EIT_Acquisition_Coordinator.MonitoringRequestSample = {
      val r = parser.parseEIT_Acquisition_CoordinatorMonitoringRequestSample()
      return r
    }
    val r = to(s, fEIT_Acquisition_CoordinatorMonitoringRequestSample _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorMonitoringRequestSample_Payload(o: EIT_Acquisition_Coordinator.MonitoringRequestSample_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_CoordinatorMonitoringRequestSample_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_CoordinatorMonitoringRequestSample_Payload(s: String): Either[EIT_Acquisition_Coordinator.MonitoringRequestSample_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorMonitoringRequestSample_Payload(parser: Parser): EIT_Acquisition_Coordinator.MonitoringRequestSample_Payload = {
      val r = parser.parseEIT_Acquisition_CoordinatorMonitoringRequestSample_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_CoordinatorMonitoringRequestSample_Payload _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorCalibrationSample(o: EIT_Acquisition_Coordinator.CalibrationSample, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_CoordinatorCalibrationSample(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_CoordinatorCalibrationSample(s: String): Either[EIT_Acquisition_Coordinator.CalibrationSample, Json.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorCalibrationSample(parser: Parser): EIT_Acquisition_Coordinator.CalibrationSample = {
      val r = parser.parseEIT_Acquisition_CoordinatorCalibrationSample()
      return r
    }
    val r = to(s, fEIT_Acquisition_CoordinatorCalibrationSample _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorCalibrationSample_Payload(o: EIT_Acquisition_Coordinator.CalibrationSample_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_CoordinatorCalibrationSample_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_CoordinatorCalibrationSample_Payload(s: String): Either[EIT_Acquisition_Coordinator.CalibrationSample_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorCalibrationSample_Payload(parser: Parser): EIT_Acquisition_Coordinator.CalibrationSample_Payload = {
      val r = parser.parseEIT_Acquisition_CoordinatorCalibrationSample_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_CoordinatorCalibrationSample_Payload _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorImpedanceSample(o: EIT_Acquisition_Coordinator.ImpedanceSample, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_CoordinatorImpedanceSample(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_CoordinatorImpedanceSample(s: String): Either[EIT_Acquisition_Coordinator.ImpedanceSample, Json.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorImpedanceSample(parser: Parser): EIT_Acquisition_Coordinator.ImpedanceSample = {
      val r = parser.parseEIT_Acquisition_CoordinatorImpedanceSample()
      return r
    }
    val r = to(s, fEIT_Acquisition_CoordinatorImpedanceSample _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorImpedanceSample_Payload(o: EIT_Acquisition_Coordinator.ImpedanceSample_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_CoordinatorImpedanceSample_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_CoordinatorImpedanceSample_Payload(s: String): Either[EIT_Acquisition_Coordinator.ImpedanceSample_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorImpedanceSample_Payload(parser: Parser): EIT_Acquisition_Coordinator.ImpedanceSample_Payload = {
      val r = parser.parseEIT_Acquisition_CoordinatorImpedanceSample_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_CoordinatorImpedanceSample_Payload _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorMonitoringResolution(o: EIT_Acquisition_Coordinator.MonitoringResolution, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_CoordinatorMonitoringResolution(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_CoordinatorMonitoringResolution(s: String): Either[EIT_Acquisition_Coordinator.MonitoringResolution, Json.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorMonitoringResolution(parser: Parser): EIT_Acquisition_Coordinator.MonitoringResolution = {
      val r = parser.parseEIT_Acquisition_CoordinatorMonitoringResolution()
      return r
    }
    val r = to(s, fEIT_Acquisition_CoordinatorMonitoringResolution _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorMonitoringResolution_Payload(o: EIT_Acquisition_Coordinator.MonitoringResolution_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_CoordinatorMonitoringResolution_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_CoordinatorMonitoringResolution_Payload(s: String): Either[EIT_Acquisition_Coordinator.MonitoringResolution_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorMonitoringResolution_Payload(parser: Parser): EIT_Acquisition_Coordinator.MonitoringResolution_Payload = {
      val r = parser.parseEIT_Acquisition_CoordinatorMonitoringResolution_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_CoordinatorMonitoringResolution_Payload _)
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

  def fromEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container(o: EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PreState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container(s: String): Either[EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PreState_Container, Json.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container(parser: Parser): EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PreState_Container = {
      val r = parser.parseEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container()
      return r
    }
    val r = to(s, fEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_P(o: EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_P(s: String): Either[EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PreState_Container_P, Json.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_P(parser: Parser): EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PreState_Container_P = {
      val r = parser.parseEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_P()
      return r
    }
    val r = to(s, fEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_PS(o: EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_PS(s: String): Either[EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PreState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_PS(parser: Parser): EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PreState_Container_PS = {
      val r = parser.parseEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PreState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container(o: EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PostState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container(s: String): Either[EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PostState_Container, Json.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container(parser: Parser): EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PostState_Container = {
      val r = parser.parseEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container()
      return r
    }
    val r = to(s, fEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_P(o: EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_P(s: String): Either[EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PostState_Container_P, Json.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_P(parser: Parser): EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PostState_Container_P = {
      val r = parser.parseEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_P()
      return r
    }
    val r = to(s, fEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_PS(o: EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_PS(s: String): Either[EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PostState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_PS(parser: Parser): EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_PostState_Container_PS = {
      val r = parser.parseEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Acquisition_CoordinatorRequestQualification_coordinationProcess_requestQualification_PostState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container(o: EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container(s: String): Either[EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container, Json.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container(parser: Parser): EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container = {
      val r = parser.parseEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container()
      return r
    }
    val r = to(s, fEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_P(o: EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_P(s: String): Either[EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_P, Json.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_P(parser: Parser): EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_P = {
      val r = parser.parseEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_P()
      return r
    }
    val r = to(s, fEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PS(o: EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PS(s: String): Either[EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PS(parser: Parser): EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PS = {
      val r = parser.parseEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PreState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container(o: EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container(s: String): Either[EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container, Json.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container(parser: Parser): EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container = {
      val r = parser.parseEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container()
      return r
    }
    val r = to(s, fEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_P(o: EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_P(s: String): Either[EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_P, Json.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_P(parser: Parser): EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_P = {
      val r = parser.parseEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_P()
      return r
    }
    val r = to(s, fEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PS(o: EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PS(s: String): Either[EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PS(parser: Parser): EIT_Acquisition_Coordinator.AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PS = {
      val r = parser.parseEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Acquisition_CoordinatorAcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification_PostState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container(o: EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container(s: String): Either[EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container, Json.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container(parser: Parser): EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container = {
      val r = parser.parseEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container()
      return r
    }
    val r = to(s, fEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_P(o: EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_P(s: String): Either[EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_P, Json.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_P(parser: Parser): EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_P = {
      val r = parser.parseEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_P()
      return r
    }
    val r = to(s, fEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PS(o: EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PS(s: String): Either[EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PS(parser: Parser): EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PS = {
      val r = parser.parseEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PreState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container(o: EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container(s: String): Either[EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container, Json.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container(parser: Parser): EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container = {
      val r = parser.parseEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container()
      return r
    }
    val r = to(s, fEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_P(o: EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_P(s: String): Either[EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_P, Json.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_P(parser: Parser): EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_P = {
      val r = parser.parseEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_P()
      return r
    }
    val r = to(s, fEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PS(o: EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PS(s: String): Either[EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PS(parser: Parser): EIT_Acquisition_Coordinator.MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PS = {
      val r = parser.parseEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Acquisition_CoordinatorMonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner_PostState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container(o: EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container(s: String): Either[EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container, Json.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container(parser: Parser): EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container = {
      val r = parser.parseEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container()
      return r
    }
    val r = to(s, fEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_P(o: EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_P(s: String): Either[EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_P, Json.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_P(parser: Parser): EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_P = {
      val r = parser.parseEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_P()
      return r
    }
    val r = to(s, fEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PS(o: EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PS(s: String): Either[EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PS(parser: Parser): EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PS = {
      val r = parser.parseEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PreState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container(o: EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container(s: String): Either[EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container, Json.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container(parser: Parser): EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container = {
      val r = parser.parseEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container()
      return r
    }
    val r = to(s, fEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_P(o: EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_P(s: String): Either[EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_P, Json.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_P(parser: Parser): EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_P = {
      val r = parser.parseEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_P()
      return r
    }
    val r = to(s, fEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PS(o: EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PS(s: String): Either[EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PS(parser: Parser): EIT_Acquisition_Coordinator.ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PS = {
      val r = parser.parseEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Acquisition_CoordinatorImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation_PostState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container(o: EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container(s: String): Either[EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container, Json.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container(parser: Parser): EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container = {
      val r = parser.parseEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container()
      return r
    }
    val r = to(s, fEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_P(o: EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_P(s: String): Either[EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_P, Json.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_P(parser: Parser): EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_P = {
      val r = parser.parseEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_P()
      return r
    }
    val r = to(s, fEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PS(o: EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PS(s: String): Either[EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PS(parser: Parser): EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PS = {
      val r = parser.parseEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PreState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container(o: EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container(s: String): Either[EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container, Json.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container(parser: Parser): EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container = {
      val r = parser.parseEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container()
      return r
    }
    val r = to(s, fEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_P(o: EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_P(s: String): Either[EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_P, Json.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_P(parser: Parser): EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_P = {
      val r = parser.parseEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_P()
      return r
    }
    val r = to(s, fEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PS(o: EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PS(s: String): Either[EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PS(parser: Parser): EIT_Acquisition_Coordinator.DoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PS = {
      val r = parser.parseEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Acquisition_CoordinatorDoctorStatusDerivation_coordinationProcess_doctorStatusDerivation_PostState_Container_PS _)
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