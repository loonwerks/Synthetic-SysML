// #Sireum
// @formatter:off

// This file is auto-generated from BeltObservation.scala, BeltQualification.scala, CalibrationObservation.scala, CalibrationQualification.scala, AcquisitionObservation.scala, PreparationState.scala, MonitoringState.scala, EligibilityEnvelopeCondition.scala, EligibilityEnvelopeRecovery.scala, EligibilityEnvelopePreparationState.scala, EligibilityEnvelopeMonitoringState.scala, DoctorRequest.scala, TechnicianRequest.scala, ArbitrationDecisionEffectiveIntent.scala, ArbitrationDecisionDisposition.scala, PreparationDecisionPreState.scala, PreparationDecisionNextState.scala, PreparationDecisionIntent.scala, PreparationDecisionDisposition.scala, MonitoringDecisionPreState.scala, MonitoringDecisionNextState.scala, MonitoringDecisionIntent.scala, MonitoringDecisionDisposition.scala, MonitoringDecisionNotice.scala, MonitoringDecisionPreparationState.scala, AcquisitionCommand.scala, ImpedanceFrameObservation.scala, FrameDelivery.scala, SessionStatusPreparationState.scala, SessionStatusMonitoringState.scala, SessionStatusDisposition.scala, SessionStatusNotice.scala, BeltAssessment.scala, EligibilityEnvelope.scala, ArbitrationDecision.scala, PreparationDecisionSnapshot.scala, MonitoringDecisionSnapshot.scala, SessionStatus.scala, Base_Types.scala, BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_Containers.scala, CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_Containers.scala, AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_Containers.scala, RequestArbiter_acquisitionCoordinationProcess_requestArbiter_Containers.scala, PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_Containers.scala, MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_Containers.scala, AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_Containers.scala, SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package scp_candidate

import org.sireum._
import org.sireum.Json.Printer._

object JSON {

  object Printer {

    @pure def printEIT_Acquisition_Session_CoordinatorBeltObservationType(o: EIT_Acquisition_Session_Coordinator.BeltObservation.Type): ST = {
      val value: String = o match {
        case EIT_Acquisition_Session_Coordinator.BeltObservation.BELT_OBSERVATION_INVALID => "BELT_OBSERVATION_INVALID"
        case EIT_Acquisition_Session_Coordinator.BeltObservation.BELT_NOT_APPLIED => "BELT_NOT_APPLIED"
        case EIT_Acquisition_Session_Coordinator.BeltObservation.BELT_APPLIED => "BELT_APPLIED"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Acquisition_Session_Coordinator.BeltObservation")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorBeltObservation_Payload(o: EIT_Acquisition_Session_Coordinator.BeltObservation_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Session_Coordinator.BeltObservation_Payload""""),
        ("value", printEIT_Acquisition_Session_CoordinatorBeltObservationType(o.value))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorBeltQualificationType(o: EIT_Acquisition_Session_Coordinator.BeltQualification.Type): ST = {
      val value: String = o match {
        case EIT_Acquisition_Session_Coordinator.BeltQualification.BELT_UNAVAILABLE => "BELT_UNAVAILABLE"
        case EIT_Acquisition_Session_Coordinator.BeltQualification.BELT_ABSENT => "BELT_ABSENT"
        case EIT_Acquisition_Session_Coordinator.BeltQualification.BELT_PRESENT => "BELT_PRESENT"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Acquisition_Session_Coordinator.BeltQualification")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorBeltQualification_Payload(o: EIT_Acquisition_Session_Coordinator.BeltQualification_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Session_Coordinator.BeltQualification_Payload""""),
        ("value", printEIT_Acquisition_Session_CoordinatorBeltQualificationType(o.value))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorCalibrationObservationType(o: EIT_Acquisition_Session_Coordinator.CalibrationObservation.Type): ST = {
      val value: String = o match {
        case EIT_Acquisition_Session_Coordinator.CalibrationObservation.CALIBRATION_OBSERVATION_INVALID => "CALIBRATION_OBSERVATION_INVALID"
        case EIT_Acquisition_Session_Coordinator.CalibrationObservation.CALIBRATION_NOT_AVAILABLE => "CALIBRATION_NOT_AVAILABLE"
        case EIT_Acquisition_Session_Coordinator.CalibrationObservation.CALIBRATION_FAILED => "CALIBRATION_FAILED"
        case EIT_Acquisition_Session_Coordinator.CalibrationObservation.CALIBRATION_PASSED => "CALIBRATION_PASSED"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Acquisition_Session_Coordinator.CalibrationObservation")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorCalibrationObservation_Payload(o: EIT_Acquisition_Session_Coordinator.CalibrationObservation_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Session_Coordinator.CalibrationObservation_Payload""""),
        ("value", printEIT_Acquisition_Session_CoordinatorCalibrationObservationType(o.value))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorCalibrationQualificationType(o: EIT_Acquisition_Session_Coordinator.CalibrationQualification.Type): ST = {
      val value: String = o match {
        case EIT_Acquisition_Session_Coordinator.CalibrationQualification.CALIBRATION_BLOCKED => "CALIBRATION_BLOCKED"
        case EIT_Acquisition_Session_Coordinator.CalibrationQualification.NOT_CALIBRATED => "NOT_CALIBRATED"
        case EIT_Acquisition_Session_Coordinator.CalibrationQualification.CALIBRATED => "CALIBRATED"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Acquisition_Session_Coordinator.CalibrationQualification")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorCalibrationQualification_Payload(o: EIT_Acquisition_Session_Coordinator.CalibrationQualification_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Session_Coordinator.CalibrationQualification_Payload""""),
        ("value", printEIT_Acquisition_Session_CoordinatorCalibrationQualificationType(o.value))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorAcquisitionObservationType(o: EIT_Acquisition_Session_Coordinator.AcquisitionObservation.Type): ST = {
      val value: String = o match {
        case EIT_Acquisition_Session_Coordinator.AcquisitionObservation.ACQUISITION_AVAILABLE => "ACQUISITION_AVAILABLE"
        case EIT_Acquisition_Session_Coordinator.AcquisitionObservation.ACQUISITION_FAULT => "ACQUISITION_FAULT"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Acquisition_Session_Coordinator.AcquisitionObservation")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorAcquisitionObservation_Payload(o: EIT_Acquisition_Session_Coordinator.AcquisitionObservation_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Session_Coordinator.AcquisitionObservation_Payload""""),
        ("value", printEIT_Acquisition_Session_CoordinatorAcquisitionObservationType(o.value))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorPreparationStateType(o: EIT_Acquisition_Session_Coordinator.PreparationState.Type): ST = {
      val value: String = o match {
        case EIT_Acquisition_Session_Coordinator.PreparationState.UNPREPARED => "UNPREPARED"
        case EIT_Acquisition_Session_Coordinator.PreparationState.BELT_CONFIRMED => "BELT_CONFIRMED"
        case EIT_Acquisition_Session_Coordinator.PreparationState.PREPARATION_CALIBRATED => "PREPARATION_CALIBRATED"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Acquisition_Session_Coordinator.PreparationState")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorPreparationState_Payload(o: EIT_Acquisition_Session_Coordinator.PreparationState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Session_Coordinator.PreparationState_Payload""""),
        ("value", printEIT_Acquisition_Session_CoordinatorPreparationStateType(o.value))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorMonitoringStateType(o: EIT_Acquisition_Session_Coordinator.MonitoringState.Type): ST = {
      val value: String = o match {
        case EIT_Acquisition_Session_Coordinator.MonitoringState.MONITORING_INACTIVE => "MONITORING_INACTIVE"
        case EIT_Acquisition_Session_Coordinator.MonitoringState.MONITORING_ACTIVE => "MONITORING_ACTIVE"
        case EIT_Acquisition_Session_Coordinator.MonitoringState.MONITORING_HELD => "MONITORING_HELD"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Acquisition_Session_Coordinator.MonitoringState")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorMonitoringState_Payload(o: EIT_Acquisition_Session_Coordinator.MonitoringState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Session_Coordinator.MonitoringState_Payload""""),
        ("value", printEIT_Acquisition_Session_CoordinatorMonitoringStateType(o.value))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeConditionType(o: EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeCondition.Type): ST = {
      val value: String = o match {
        case EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeCondition.BELT_UNAVAILABLE_CONDITION => "BELT_UNAVAILABLE_CONDITION"
        case EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeCondition.BELT_ABSENT_CONDITION => "BELT_ABSENT_CONDITION"
        case EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeCondition.CALIBRATION_NOT_READY_CONDITION => "CALIBRATION_NOT_READY_CONDITION"
        case EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeCondition.ACQUISITION_FAULT_CONDITION => "ACQUISITION_FAULT_CONDITION"
        case EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeCondition.ACQUISITION_READY => "ACQUISITION_READY"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeCondition")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeCondition_Payload(o: EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeCondition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeCondition_Payload""""),
        ("value", printEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeConditionType(o.value))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeRecoveryType(o: EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeRecovery.Type): ST = {
      val value: String = o match {
        case EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeRecovery.NO_RECOVERY => "NO_RECOVERY"
        case EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeRecovery.RESET_PREPARATION_RECOVERY => "RESET_PREPARATION_RECOVERY"
        case EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeRecovery.HOLD_MONITORING_RECOVERY => "HOLD_MONITORING_RECOVERY"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeRecovery")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeRecovery_Payload(o: EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeRecovery_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeRecovery_Payload""""),
        ("value", printEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeRecoveryType(o.value))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorEligibilityEnvelopePreparationStateType(o: EIT_Acquisition_Session_Coordinator.EligibilityEnvelopePreparationState.Type): ST = {
      val value: String = o match {
        case EIT_Acquisition_Session_Coordinator.EligibilityEnvelopePreparationState.UNPREPARED => "UNPREPARED"
        case EIT_Acquisition_Session_Coordinator.EligibilityEnvelopePreparationState.BELT_CONFIRMED => "BELT_CONFIRMED"
        case EIT_Acquisition_Session_Coordinator.EligibilityEnvelopePreparationState.PREPARATION_CALIBRATED => "PREPARATION_CALIBRATED"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Acquisition_Session_Coordinator.EligibilityEnvelopePreparationState")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorEligibilityEnvelopePreparationState_Payload(o: EIT_Acquisition_Session_Coordinator.EligibilityEnvelopePreparationState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Session_Coordinator.EligibilityEnvelopePreparationState_Payload""""),
        ("value", printEIT_Acquisition_Session_CoordinatorEligibilityEnvelopePreparationStateType(o.value))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeMonitoringStateType(o: EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeMonitoringState.Type): ST = {
      val value: String = o match {
        case EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeMonitoringState.MONITORING_INACTIVE => "MONITORING_INACTIVE"
        case EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeMonitoringState.MONITORING_ACTIVE => "MONITORING_ACTIVE"
        case EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeMonitoringState.MONITORING_HELD => "MONITORING_HELD"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeMonitoringState")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeMonitoringState_Payload(o: EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeMonitoringState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeMonitoringState_Payload""""),
        ("value", printEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeMonitoringStateType(o.value))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorDoctorRequestType(o: EIT_Acquisition_Session_Coordinator.DoctorRequest.Type): ST = {
      val value: String = o match {
        case EIT_Acquisition_Session_Coordinator.DoctorRequest.NO_DOCTOR_REQUEST => "NO_DOCTOR_REQUEST"
        case EIT_Acquisition_Session_Coordinator.DoctorRequest.START_MONITORING => "START_MONITORING"
        case EIT_Acquisition_Session_Coordinator.DoctorRequest.STOP_MONITORING => "STOP_MONITORING"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Acquisition_Session_Coordinator.DoctorRequest")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorDoctorRequest_Payload(o: EIT_Acquisition_Session_Coordinator.DoctorRequest_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Session_Coordinator.DoctorRequest_Payload""""),
        ("value", printEIT_Acquisition_Session_CoordinatorDoctorRequestType(o.value))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorTechnicianRequestType(o: EIT_Acquisition_Session_Coordinator.TechnicianRequest.Type): ST = {
      val value: String = o match {
        case EIT_Acquisition_Session_Coordinator.TechnicianRequest.NO_TECHNICIAN_REQUEST => "NO_TECHNICIAN_REQUEST"
        case EIT_Acquisition_Session_Coordinator.TechnicianRequest.CONFIRM_BELT => "CONFIRM_BELT"
        case EIT_Acquisition_Session_Coordinator.TechnicianRequest.RECORD_CALIBRATION => "RECORD_CALIBRATION"
        case EIT_Acquisition_Session_Coordinator.TechnicianRequest.RESET_PREPARATION => "RESET_PREPARATION"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Acquisition_Session_Coordinator.TechnicianRequest")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorTechnicianRequest_Payload(o: EIT_Acquisition_Session_Coordinator.TechnicianRequest_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Session_Coordinator.TechnicianRequest_Payload""""),
        ("value", printEIT_Acquisition_Session_CoordinatorTechnicianRequestType(o.value))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorArbitrationDecisionEffectiveIntentType(o: EIT_Acquisition_Session_Coordinator.ArbitrationDecisionEffectiveIntent.Type): ST = {
      val value: String = o match {
        case EIT_Acquisition_Session_Coordinator.ArbitrationDecisionEffectiveIntent.NO_INTENT => "NO_INTENT"
        case EIT_Acquisition_Session_Coordinator.ArbitrationDecisionEffectiveIntent.STOP_INTENT => "STOP_INTENT"
        case EIT_Acquisition_Session_Coordinator.ArbitrationDecisionEffectiveIntent.RESET_PREPARATION_INTENT => "RESET_PREPARATION_INTENT"
        case EIT_Acquisition_Session_Coordinator.ArbitrationDecisionEffectiveIntent.HOLD_MONITORING_INTENT => "HOLD_MONITORING_INTENT"
        case EIT_Acquisition_Session_Coordinator.ArbitrationDecisionEffectiveIntent.CONFIRM_BELT_INTENT => "CONFIRM_BELT_INTENT"
        case EIT_Acquisition_Session_Coordinator.ArbitrationDecisionEffectiveIntent.RECORD_CALIBRATION_INTENT => "RECORD_CALIBRATION_INTENT"
        case EIT_Acquisition_Session_Coordinator.ArbitrationDecisionEffectiveIntent.START_MONITORING_INTENT => "START_MONITORING_INTENT"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Acquisition_Session_Coordinator.ArbitrationDecisionEffectiveIntent")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorArbitrationDecisionEffectiveIntent_Payload(o: EIT_Acquisition_Session_Coordinator.ArbitrationDecisionEffectiveIntent_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Session_Coordinator.ArbitrationDecisionEffectiveIntent_Payload""""),
        ("value", printEIT_Acquisition_Session_CoordinatorArbitrationDecisionEffectiveIntentType(o.value))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorArbitrationDecisionDispositionType(o: EIT_Acquisition_Session_Coordinator.ArbitrationDecisionDisposition.Type): ST = {
      val value: String = o match {
        case EIT_Acquisition_Session_Coordinator.ArbitrationDecisionDisposition.NO_REQUEST_DISPOSITION => "NO_REQUEST_DISPOSITION"
        case EIT_Acquisition_Session_Coordinator.ArbitrationDecisionDisposition.ACCEPTED => "ACCEPTED"
        case EIT_Acquisition_Session_Coordinator.ArbitrationDecisionDisposition.REJECTED => "REJECTED"
        case EIT_Acquisition_Session_Coordinator.ArbitrationDecisionDisposition.RECOVERY_APPLIED => "RECOVERY_APPLIED"
        case EIT_Acquisition_Session_Coordinator.ArbitrationDecisionDisposition.PREEMPTED => "PREEMPTED"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Acquisition_Session_Coordinator.ArbitrationDecisionDisposition")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorArbitrationDecisionDisposition_Payload(o: EIT_Acquisition_Session_Coordinator.ArbitrationDecisionDisposition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Session_Coordinator.ArbitrationDecisionDisposition_Payload""""),
        ("value", printEIT_Acquisition_Session_CoordinatorArbitrationDecisionDispositionType(o.value))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorPreparationDecisionPreStateType(o: EIT_Acquisition_Session_Coordinator.PreparationDecisionPreState.Type): ST = {
      val value: String = o match {
        case EIT_Acquisition_Session_Coordinator.PreparationDecisionPreState.UNPREPARED => "UNPREPARED"
        case EIT_Acquisition_Session_Coordinator.PreparationDecisionPreState.BELT_CONFIRMED => "BELT_CONFIRMED"
        case EIT_Acquisition_Session_Coordinator.PreparationDecisionPreState.PREPARATION_CALIBRATED => "PREPARATION_CALIBRATED"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Acquisition_Session_Coordinator.PreparationDecisionPreState")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorPreparationDecisionPreState_Payload(o: EIT_Acquisition_Session_Coordinator.PreparationDecisionPreState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Session_Coordinator.PreparationDecisionPreState_Payload""""),
        ("value", printEIT_Acquisition_Session_CoordinatorPreparationDecisionPreStateType(o.value))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorPreparationDecisionNextStateType(o: EIT_Acquisition_Session_Coordinator.PreparationDecisionNextState.Type): ST = {
      val value: String = o match {
        case EIT_Acquisition_Session_Coordinator.PreparationDecisionNextState.UNPREPARED => "UNPREPARED"
        case EIT_Acquisition_Session_Coordinator.PreparationDecisionNextState.BELT_CONFIRMED => "BELT_CONFIRMED"
        case EIT_Acquisition_Session_Coordinator.PreparationDecisionNextState.PREPARATION_CALIBRATED => "PREPARATION_CALIBRATED"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Acquisition_Session_Coordinator.PreparationDecisionNextState")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorPreparationDecisionNextState_Payload(o: EIT_Acquisition_Session_Coordinator.PreparationDecisionNextState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Session_Coordinator.PreparationDecisionNextState_Payload""""),
        ("value", printEIT_Acquisition_Session_CoordinatorPreparationDecisionNextStateType(o.value))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorPreparationDecisionIntentType(o: EIT_Acquisition_Session_Coordinator.PreparationDecisionIntent.Type): ST = {
      val value: String = o match {
        case EIT_Acquisition_Session_Coordinator.PreparationDecisionIntent.NO_INTENT => "NO_INTENT"
        case EIT_Acquisition_Session_Coordinator.PreparationDecisionIntent.STOP_INTENT => "STOP_INTENT"
        case EIT_Acquisition_Session_Coordinator.PreparationDecisionIntent.RESET_PREPARATION_INTENT => "RESET_PREPARATION_INTENT"
        case EIT_Acquisition_Session_Coordinator.PreparationDecisionIntent.HOLD_MONITORING_INTENT => "HOLD_MONITORING_INTENT"
        case EIT_Acquisition_Session_Coordinator.PreparationDecisionIntent.CONFIRM_BELT_INTENT => "CONFIRM_BELT_INTENT"
        case EIT_Acquisition_Session_Coordinator.PreparationDecisionIntent.RECORD_CALIBRATION_INTENT => "RECORD_CALIBRATION_INTENT"
        case EIT_Acquisition_Session_Coordinator.PreparationDecisionIntent.START_MONITORING_INTENT => "START_MONITORING_INTENT"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Acquisition_Session_Coordinator.PreparationDecisionIntent")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorPreparationDecisionIntent_Payload(o: EIT_Acquisition_Session_Coordinator.PreparationDecisionIntent_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Session_Coordinator.PreparationDecisionIntent_Payload""""),
        ("value", printEIT_Acquisition_Session_CoordinatorPreparationDecisionIntentType(o.value))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorPreparationDecisionDispositionType(o: EIT_Acquisition_Session_Coordinator.PreparationDecisionDisposition.Type): ST = {
      val value: String = o match {
        case EIT_Acquisition_Session_Coordinator.PreparationDecisionDisposition.NO_REQUEST_DISPOSITION => "NO_REQUEST_DISPOSITION"
        case EIT_Acquisition_Session_Coordinator.PreparationDecisionDisposition.ACCEPTED => "ACCEPTED"
        case EIT_Acquisition_Session_Coordinator.PreparationDecisionDisposition.REJECTED => "REJECTED"
        case EIT_Acquisition_Session_Coordinator.PreparationDecisionDisposition.RECOVERY_APPLIED => "RECOVERY_APPLIED"
        case EIT_Acquisition_Session_Coordinator.PreparationDecisionDisposition.PREEMPTED => "PREEMPTED"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Acquisition_Session_Coordinator.PreparationDecisionDisposition")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorPreparationDecisionDisposition_Payload(o: EIT_Acquisition_Session_Coordinator.PreparationDecisionDisposition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Session_Coordinator.PreparationDecisionDisposition_Payload""""),
        ("value", printEIT_Acquisition_Session_CoordinatorPreparationDecisionDispositionType(o.value))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreStateType(o: EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreState.Type): ST = {
      val value: String = o match {
        case EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreState.MONITORING_INACTIVE => "MONITORING_INACTIVE"
        case EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreState.MONITORING_ACTIVE => "MONITORING_ACTIVE"
        case EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreState.MONITORING_HELD => "MONITORING_HELD"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreState")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreState_Payload(o: EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreState_Payload""""),
        ("value", printEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreStateType(o.value))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorMonitoringDecisionNextStateType(o: EIT_Acquisition_Session_Coordinator.MonitoringDecisionNextState.Type): ST = {
      val value: String = o match {
        case EIT_Acquisition_Session_Coordinator.MonitoringDecisionNextState.MONITORING_INACTIVE => "MONITORING_INACTIVE"
        case EIT_Acquisition_Session_Coordinator.MonitoringDecisionNextState.MONITORING_ACTIVE => "MONITORING_ACTIVE"
        case EIT_Acquisition_Session_Coordinator.MonitoringDecisionNextState.MONITORING_HELD => "MONITORING_HELD"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Acquisition_Session_Coordinator.MonitoringDecisionNextState")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorMonitoringDecisionNextState_Payload(o: EIT_Acquisition_Session_Coordinator.MonitoringDecisionNextState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Session_Coordinator.MonitoringDecisionNextState_Payload""""),
        ("value", printEIT_Acquisition_Session_CoordinatorMonitoringDecisionNextStateType(o.value))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorMonitoringDecisionIntentType(o: EIT_Acquisition_Session_Coordinator.MonitoringDecisionIntent.Type): ST = {
      val value: String = o match {
        case EIT_Acquisition_Session_Coordinator.MonitoringDecisionIntent.NO_INTENT => "NO_INTENT"
        case EIT_Acquisition_Session_Coordinator.MonitoringDecisionIntent.STOP_INTENT => "STOP_INTENT"
        case EIT_Acquisition_Session_Coordinator.MonitoringDecisionIntent.RESET_PREPARATION_INTENT => "RESET_PREPARATION_INTENT"
        case EIT_Acquisition_Session_Coordinator.MonitoringDecisionIntent.HOLD_MONITORING_INTENT => "HOLD_MONITORING_INTENT"
        case EIT_Acquisition_Session_Coordinator.MonitoringDecisionIntent.CONFIRM_BELT_INTENT => "CONFIRM_BELT_INTENT"
        case EIT_Acquisition_Session_Coordinator.MonitoringDecisionIntent.RECORD_CALIBRATION_INTENT => "RECORD_CALIBRATION_INTENT"
        case EIT_Acquisition_Session_Coordinator.MonitoringDecisionIntent.START_MONITORING_INTENT => "START_MONITORING_INTENT"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Acquisition_Session_Coordinator.MonitoringDecisionIntent")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorMonitoringDecisionIntent_Payload(o: EIT_Acquisition_Session_Coordinator.MonitoringDecisionIntent_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Session_Coordinator.MonitoringDecisionIntent_Payload""""),
        ("value", printEIT_Acquisition_Session_CoordinatorMonitoringDecisionIntentType(o.value))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorMonitoringDecisionDispositionType(o: EIT_Acquisition_Session_Coordinator.MonitoringDecisionDisposition.Type): ST = {
      val value: String = o match {
        case EIT_Acquisition_Session_Coordinator.MonitoringDecisionDisposition.NO_REQUEST_DISPOSITION => "NO_REQUEST_DISPOSITION"
        case EIT_Acquisition_Session_Coordinator.MonitoringDecisionDisposition.ACCEPTED => "ACCEPTED"
        case EIT_Acquisition_Session_Coordinator.MonitoringDecisionDisposition.REJECTED => "REJECTED"
        case EIT_Acquisition_Session_Coordinator.MonitoringDecisionDisposition.RECOVERY_APPLIED => "RECOVERY_APPLIED"
        case EIT_Acquisition_Session_Coordinator.MonitoringDecisionDisposition.PREEMPTED => "PREEMPTED"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Acquisition_Session_Coordinator.MonitoringDecisionDisposition")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorMonitoringDecisionDisposition_Payload(o: EIT_Acquisition_Session_Coordinator.MonitoringDecisionDisposition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Session_Coordinator.MonitoringDecisionDisposition_Payload""""),
        ("value", printEIT_Acquisition_Session_CoordinatorMonitoringDecisionDispositionType(o.value))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorMonitoringDecisionNoticeType(o: EIT_Acquisition_Session_Coordinator.MonitoringDecisionNotice.Type): ST = {
      val value: String = o match {
        case EIT_Acquisition_Session_Coordinator.MonitoringDecisionNotice.NONE => "NONE"
        case EIT_Acquisition_Session_Coordinator.MonitoringDecisionNotice.BELT_OBSERVATION_UNAVAILABLE => "BELT_OBSERVATION_UNAVAILABLE"
        case EIT_Acquisition_Session_Coordinator.MonitoringDecisionNotice.BELT_NOT_CONFIRMED => "BELT_NOT_CONFIRMED"
        case EIT_Acquisition_Session_Coordinator.MonitoringDecisionNotice.CALIBRATION_NOT_READY => "CALIBRATION_NOT_READY"
        case EIT_Acquisition_Session_Coordinator.MonitoringDecisionNotice.ACQUISITION_UNAVAILABLE => "ACQUISITION_UNAVAILABLE"
        case EIT_Acquisition_Session_Coordinator.MonitoringDecisionNotice.MONITORING_HELD_NOTICE => "MONITORING_HELD_NOTICE"
        case EIT_Acquisition_Session_Coordinator.MonitoringDecisionNotice.INAPPLICABLE_REQUEST => "INAPPLICABLE_REQUEST"
        case EIT_Acquisition_Session_Coordinator.MonitoringDecisionNotice.WAITING_FOR_FRAME => "WAITING_FOR_FRAME"
        case EIT_Acquisition_Session_Coordinator.MonitoringDecisionNotice.FRAME_REJECTED => "FRAME_REJECTED"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Acquisition_Session_Coordinator.MonitoringDecisionNotice")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorMonitoringDecisionNotice_Payload(o: EIT_Acquisition_Session_Coordinator.MonitoringDecisionNotice_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Session_Coordinator.MonitoringDecisionNotice_Payload""""),
        ("value", printEIT_Acquisition_Session_CoordinatorMonitoringDecisionNoticeType(o.value))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreparationStateType(o: EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreparationState.Type): ST = {
      val value: String = o match {
        case EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreparationState.UNPREPARED => "UNPREPARED"
        case EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreparationState.BELT_CONFIRMED => "BELT_CONFIRMED"
        case EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreparationState.PREPARATION_CALIBRATED => "PREPARATION_CALIBRATED"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreparationState")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreparationState_Payload(o: EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreparationState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreparationState_Payload""""),
        ("value", printEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreparationStateType(o.value))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorAcquisitionCommandType(o: EIT_Acquisition_Session_Coordinator.AcquisitionCommand.Type): ST = {
      val value: String = o match {
        case EIT_Acquisition_Session_Coordinator.AcquisitionCommand.DO_NOT_COLLECT => "DO_NOT_COLLECT"
        case EIT_Acquisition_Session_Coordinator.AcquisitionCommand.COLLECT => "COLLECT"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Acquisition_Session_Coordinator.AcquisitionCommand")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorAcquisitionCommand_Payload(o: EIT_Acquisition_Session_Coordinator.AcquisitionCommand_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Session_Coordinator.AcquisitionCommand_Payload""""),
        ("value", printEIT_Acquisition_Session_CoordinatorAcquisitionCommandType(o.value))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorImpedanceFrameObservationType(o: EIT_Acquisition_Session_Coordinator.ImpedanceFrameObservation.Type): ST = {
      val value: String = o match {
        case EIT_Acquisition_Session_Coordinator.ImpedanceFrameObservation.NO_FRAME => "NO_FRAME"
        case EIT_Acquisition_Session_Coordinator.ImpedanceFrameObservation.INVALID_FRAME => "INVALID_FRAME"
        case EIT_Acquisition_Session_Coordinator.ImpedanceFrameObservation.FRAME_A => "FRAME_A"
        case EIT_Acquisition_Session_Coordinator.ImpedanceFrameObservation.FRAME_B => "FRAME_B"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Acquisition_Session_Coordinator.ImpedanceFrameObservation")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorImpedanceFrameObservation_Payload(o: EIT_Acquisition_Session_Coordinator.ImpedanceFrameObservation_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Session_Coordinator.ImpedanceFrameObservation_Payload""""),
        ("value", printEIT_Acquisition_Session_CoordinatorImpedanceFrameObservationType(o.value))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorFrameDeliveryType(o: EIT_Acquisition_Session_Coordinator.FrameDelivery.Type): ST = {
      val value: String = o match {
        case EIT_Acquisition_Session_Coordinator.FrameDelivery.NO_DELIVERY => "NO_DELIVERY"
        case EIT_Acquisition_Session_Coordinator.FrameDelivery.DELIVER_FRAME_A => "DELIVER_FRAME_A"
        case EIT_Acquisition_Session_Coordinator.FrameDelivery.DELIVER_FRAME_B => "DELIVER_FRAME_B"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Acquisition_Session_Coordinator.FrameDelivery")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorFrameDelivery_Payload(o: EIT_Acquisition_Session_Coordinator.FrameDelivery_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Session_Coordinator.FrameDelivery_Payload""""),
        ("value", printEIT_Acquisition_Session_CoordinatorFrameDeliveryType(o.value))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorSessionStatusPreparationStateType(o: EIT_Acquisition_Session_Coordinator.SessionStatusPreparationState.Type): ST = {
      val value: String = o match {
        case EIT_Acquisition_Session_Coordinator.SessionStatusPreparationState.UNPREPARED => "UNPREPARED"
        case EIT_Acquisition_Session_Coordinator.SessionStatusPreparationState.BELT_CONFIRMED => "BELT_CONFIRMED"
        case EIT_Acquisition_Session_Coordinator.SessionStatusPreparationState.PREPARATION_CALIBRATED => "PREPARATION_CALIBRATED"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Acquisition_Session_Coordinator.SessionStatusPreparationState")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorSessionStatusPreparationState_Payload(o: EIT_Acquisition_Session_Coordinator.SessionStatusPreparationState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Session_Coordinator.SessionStatusPreparationState_Payload""""),
        ("value", printEIT_Acquisition_Session_CoordinatorSessionStatusPreparationStateType(o.value))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorSessionStatusMonitoringStateType(o: EIT_Acquisition_Session_Coordinator.SessionStatusMonitoringState.Type): ST = {
      val value: String = o match {
        case EIT_Acquisition_Session_Coordinator.SessionStatusMonitoringState.MONITORING_INACTIVE => "MONITORING_INACTIVE"
        case EIT_Acquisition_Session_Coordinator.SessionStatusMonitoringState.MONITORING_ACTIVE => "MONITORING_ACTIVE"
        case EIT_Acquisition_Session_Coordinator.SessionStatusMonitoringState.MONITORING_HELD => "MONITORING_HELD"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Acquisition_Session_Coordinator.SessionStatusMonitoringState")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorSessionStatusMonitoringState_Payload(o: EIT_Acquisition_Session_Coordinator.SessionStatusMonitoringState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Session_Coordinator.SessionStatusMonitoringState_Payload""""),
        ("value", printEIT_Acquisition_Session_CoordinatorSessionStatusMonitoringStateType(o.value))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorSessionStatusDispositionType(o: EIT_Acquisition_Session_Coordinator.SessionStatusDisposition.Type): ST = {
      val value: String = o match {
        case EIT_Acquisition_Session_Coordinator.SessionStatusDisposition.NO_REQUEST_DISPOSITION => "NO_REQUEST_DISPOSITION"
        case EIT_Acquisition_Session_Coordinator.SessionStatusDisposition.ACCEPTED => "ACCEPTED"
        case EIT_Acquisition_Session_Coordinator.SessionStatusDisposition.REJECTED => "REJECTED"
        case EIT_Acquisition_Session_Coordinator.SessionStatusDisposition.RECOVERY_APPLIED => "RECOVERY_APPLIED"
        case EIT_Acquisition_Session_Coordinator.SessionStatusDisposition.PREEMPTED => "PREEMPTED"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Acquisition_Session_Coordinator.SessionStatusDisposition")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorSessionStatusDisposition_Payload(o: EIT_Acquisition_Session_Coordinator.SessionStatusDisposition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Session_Coordinator.SessionStatusDisposition_Payload""""),
        ("value", printEIT_Acquisition_Session_CoordinatorSessionStatusDispositionType(o.value))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorSessionStatusNoticeType(o: EIT_Acquisition_Session_Coordinator.SessionStatusNotice.Type): ST = {
      val value: String = o match {
        case EIT_Acquisition_Session_Coordinator.SessionStatusNotice.NONE => "NONE"
        case EIT_Acquisition_Session_Coordinator.SessionStatusNotice.BELT_OBSERVATION_UNAVAILABLE => "BELT_OBSERVATION_UNAVAILABLE"
        case EIT_Acquisition_Session_Coordinator.SessionStatusNotice.BELT_NOT_CONFIRMED => "BELT_NOT_CONFIRMED"
        case EIT_Acquisition_Session_Coordinator.SessionStatusNotice.CALIBRATION_NOT_READY => "CALIBRATION_NOT_READY"
        case EIT_Acquisition_Session_Coordinator.SessionStatusNotice.ACQUISITION_UNAVAILABLE => "ACQUISITION_UNAVAILABLE"
        case EIT_Acquisition_Session_Coordinator.SessionStatusNotice.MONITORING_HELD_NOTICE => "MONITORING_HELD_NOTICE"
        case EIT_Acquisition_Session_Coordinator.SessionStatusNotice.INAPPLICABLE_REQUEST => "INAPPLICABLE_REQUEST"
        case EIT_Acquisition_Session_Coordinator.SessionStatusNotice.WAITING_FOR_FRAME => "WAITING_FOR_FRAME"
        case EIT_Acquisition_Session_Coordinator.SessionStatusNotice.FRAME_REJECTED => "FRAME_REJECTED"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Acquisition_Session_Coordinator.SessionStatusNotice")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorSessionStatusNotice_Payload(o: EIT_Acquisition_Session_Coordinator.SessionStatusNotice_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Session_Coordinator.SessionStatusNotice_Payload""""),
        ("value", printEIT_Acquisition_Session_CoordinatorSessionStatusNoticeType(o.value))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorBeltAssessment(o: EIT_Acquisition_Session_Coordinator.BeltAssessment): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Session_Coordinator.BeltAssessment""""),
        ("beltCategory", printEIT_Acquisition_Session_CoordinatorBeltQualificationType(o.beltCategory)),
        ("qualified", printB(o.qualified))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorBeltAssessment_Payload(o: EIT_Acquisition_Session_Coordinator.BeltAssessment_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Session_Coordinator.BeltAssessment_Payload""""),
        ("value", printEIT_Acquisition_Session_CoordinatorBeltAssessment(o.value))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorEligibilityEnvelope(o: EIT_Acquisition_Session_Coordinator.EligibilityEnvelope): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Session_Coordinator.EligibilityEnvelope""""),
        ("condition", printEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeConditionType(o.condition)),
        ("recovery", printEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeRecoveryType(o.recovery)),
        ("beltQualified", printB(o.beltQualified)),
        ("calibrationQualified", printB(o.calibrationQualified)),
        ("preparationState", printEIT_Acquisition_Session_CoordinatorEligibilityEnvelopePreparationStateType(o.preparationState)),
        ("monitoringState", printEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeMonitoringStateType(o.monitoringState))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorEligibilityEnvelope_Payload(o: EIT_Acquisition_Session_Coordinator.EligibilityEnvelope_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Session_Coordinator.EligibilityEnvelope_Payload""""),
        ("value", printEIT_Acquisition_Session_CoordinatorEligibilityEnvelope(o.value))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorArbitrationDecision(o: EIT_Acquisition_Session_Coordinator.ArbitrationDecision): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Session_Coordinator.ArbitrationDecision""""),
        ("effectiveIntent", printEIT_Acquisition_Session_CoordinatorArbitrationDecisionEffectiveIntentType(o.effectiveIntent)),
        ("disposition", printEIT_Acquisition_Session_CoordinatorArbitrationDecisionDispositionType(o.disposition))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorArbitrationDecision_Payload(o: EIT_Acquisition_Session_Coordinator.ArbitrationDecision_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Session_Coordinator.ArbitrationDecision_Payload""""),
        ("value", printEIT_Acquisition_Session_CoordinatorArbitrationDecision(o.value))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorPreparationDecisionSnapshot(o: EIT_Acquisition_Session_Coordinator.PreparationDecisionSnapshot): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Session_Coordinator.PreparationDecisionSnapshot""""),
        ("preState", printEIT_Acquisition_Session_CoordinatorPreparationDecisionPreStateType(o.preState)),
        ("nextState", printEIT_Acquisition_Session_CoordinatorPreparationDecisionNextStateType(o.nextState)),
        ("effectiveIntent", printEIT_Acquisition_Session_CoordinatorPreparationDecisionIntentType(o.effectiveIntent)),
        ("disposition", printEIT_Acquisition_Session_CoordinatorPreparationDecisionDispositionType(o.disposition))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorPreparationDecisionSnapshot_Payload(o: EIT_Acquisition_Session_Coordinator.PreparationDecisionSnapshot_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Session_Coordinator.PreparationDecisionSnapshot_Payload""""),
        ("value", printEIT_Acquisition_Session_CoordinatorPreparationDecisionSnapshot(o.value))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot(o: EIT_Acquisition_Session_Coordinator.MonitoringDecisionSnapshot): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Session_Coordinator.MonitoringDecisionSnapshot""""),
        ("preState", printEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreStateType(o.preState)),
        ("nextState", printEIT_Acquisition_Session_CoordinatorMonitoringDecisionNextStateType(o.nextState)),
        ("effectiveIntent", printEIT_Acquisition_Session_CoordinatorMonitoringDecisionIntentType(o.effectiveIntent)),
        ("disposition", printEIT_Acquisition_Session_CoordinatorMonitoringDecisionDispositionType(o.disposition)),
        ("notice", printEIT_Acquisition_Session_CoordinatorMonitoringDecisionNoticeType(o.notice)),
        ("preparationState", printEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreparationStateType(o.preparationState))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot_Payload(o: EIT_Acquisition_Session_Coordinator.MonitoringDecisionSnapshot_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Session_Coordinator.MonitoringDecisionSnapshot_Payload""""),
        ("value", printEIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot(o.value))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorSessionStatus(o: EIT_Acquisition_Session_Coordinator.SessionStatus): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Session_Coordinator.SessionStatus""""),
        ("preparationState", printEIT_Acquisition_Session_CoordinatorSessionStatusPreparationStateType(o.preparationState)),
        ("monitoringState", printEIT_Acquisition_Session_CoordinatorSessionStatusMonitoringStateType(o.monitoringState)),
        ("disposition", printEIT_Acquisition_Session_CoordinatorSessionStatusDispositionType(o.disposition)),
        ("notice", printEIT_Acquisition_Session_CoordinatorSessionStatusNoticeType(o.notice))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorSessionStatus_Payload(o: EIT_Acquisition_Session_Coordinator.SessionStatus_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Session_Coordinator.SessionStatus_Payload""""),
        ("value", printEIT_Acquisition_Session_CoordinatorSessionStatus(o.value))
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

    @pure def printEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container(o: EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container): ST = {
      o match {
        case o: EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_P => return printEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PS => return printEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PS(o)
      }
    }

    @pure def printEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_P(o: EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_P""""),
        ("api_beltObservation", printEIT_Acquisition_Session_CoordinatorBeltObservationType(o.api_beltObservation))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PS(o: EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PS""""),
        ("api_beltObservation", printEIT_Acquisition_Session_CoordinatorBeltObservationType(o.api_beltObservation))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container(o: EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container): ST = {
      o match {
        case o: EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_P => return printEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PS => return printEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PS(o)
      }
    }

    @pure def printEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_P(o: EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_P""""),
        ("api_beltAssessment", printEIT_Acquisition_Session_CoordinatorBeltAssessment(o.api_beltAssessment))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PS(o: EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PS""""),
        ("api_beltAssessment", printEIT_Acquisition_Session_CoordinatorBeltAssessment(o.api_beltAssessment))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container(o: EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container): ST = {
      o match {
        case o: EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_P => return printEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PS => return printEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PS(o)
      }
    }

    @pure def printEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_P(o: EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_P""""),
        ("api_beltAssessment", printEIT_Acquisition_Session_CoordinatorBeltAssessment(o.api_beltAssessment)),
        ("api_calibrationObservation", printEIT_Acquisition_Session_CoordinatorCalibrationObservationType(o.api_calibrationObservation))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PS(o: EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PS""""),
        ("api_beltAssessment", printEIT_Acquisition_Session_CoordinatorBeltAssessment(o.api_beltAssessment)),
        ("api_calibrationObservation", printEIT_Acquisition_Session_CoordinatorCalibrationObservationType(o.api_calibrationObservation))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container(o: EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container): ST = {
      o match {
        case o: EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_P => return printEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PS => return printEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PS(o)
      }
    }

    @pure def printEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_P(o: EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_P""""),
        ("api_calibrationQualification", printEIT_Acquisition_Session_CoordinatorCalibrationQualificationType(o.api_calibrationQualification))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PS(o: EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PS""""),
        ("api_calibrationQualification", printEIT_Acquisition_Session_CoordinatorCalibrationQualificationType(o.api_calibrationQualification))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container(o: EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container): ST = {
      o match {
        case o: EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_P => return printEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PS => return printEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PS(o)
      }
    }

    @pure def printEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_P(o: EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_P""""),
        ("api_acquisitionObservation", printEIT_Acquisition_Session_CoordinatorAcquisitionObservationType(o.api_acquisitionObservation)),
        ("api_beltAssessment", printEIT_Acquisition_Session_CoordinatorBeltAssessment(o.api_beltAssessment)),
        ("api_calibrationQualification", printEIT_Acquisition_Session_CoordinatorCalibrationQualificationType(o.api_calibrationQualification)),
        ("api_monitoringState", printEIT_Acquisition_Session_CoordinatorMonitoringStateType(o.api_monitoringState)),
        ("api_preparationState", printEIT_Acquisition_Session_CoordinatorPreparationStateType(o.api_preparationState))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PS(o: EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PS""""),
        ("api_acquisitionObservation", printEIT_Acquisition_Session_CoordinatorAcquisitionObservationType(o.api_acquisitionObservation)),
        ("api_beltAssessment", printEIT_Acquisition_Session_CoordinatorBeltAssessment(o.api_beltAssessment)),
        ("api_calibrationQualification", printEIT_Acquisition_Session_CoordinatorCalibrationQualificationType(o.api_calibrationQualification)),
        ("api_monitoringState", printEIT_Acquisition_Session_CoordinatorMonitoringStateType(o.api_monitoringState)),
        ("api_preparationState", printEIT_Acquisition_Session_CoordinatorPreparationStateType(o.api_preparationState))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container(o: EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container): ST = {
      o match {
        case o: EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_P => return printEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PS => return printEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PS(o)
      }
    }

    @pure def printEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_P(o: EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_P""""),
        ("api_eligibilityEnvelope", printEIT_Acquisition_Session_CoordinatorEligibilityEnvelope(o.api_eligibilityEnvelope))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PS(o: EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PS""""),
        ("api_eligibilityEnvelope", printEIT_Acquisition_Session_CoordinatorEligibilityEnvelope(o.api_eligibilityEnvelope))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container(o: EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container): ST = {
      o match {
        case o: EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_P => return printEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PS => return printEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PS(o)
      }
    }

    @pure def printEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_P(o: EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_P""""),
        ("api_doctorRequest", printEIT_Acquisition_Session_CoordinatorDoctorRequestType(o.api_doctorRequest)),
        ("api_eligibilityEnvelope", printEIT_Acquisition_Session_CoordinatorEligibilityEnvelope(o.api_eligibilityEnvelope)),
        ("api_technicianRequest", printEIT_Acquisition_Session_CoordinatorTechnicianRequestType(o.api_technicianRequest))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PS(o: EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PS""""),
        ("api_doctorRequest", printEIT_Acquisition_Session_CoordinatorDoctorRequestType(o.api_doctorRequest)),
        ("api_eligibilityEnvelope", printEIT_Acquisition_Session_CoordinatorEligibilityEnvelope(o.api_eligibilityEnvelope)),
        ("api_technicianRequest", printEIT_Acquisition_Session_CoordinatorTechnicianRequestType(o.api_technicianRequest))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container(o: EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container): ST = {
      o match {
        case o: EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_P => return printEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PS => return printEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PS(o)
      }
    }

    @pure def printEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_P(o: EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_P""""),
        ("api_arbitrationDecision", printEIT_Acquisition_Session_CoordinatorArbitrationDecision(o.api_arbitrationDecision))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PS(o: EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PS""""),
        ("api_arbitrationDecision", printEIT_Acquisition_Session_CoordinatorArbitrationDecision(o.api_arbitrationDecision))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container(o: EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container): ST = {
      o match {
        case o: EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_P => return printEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PS => return printEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PS(o)
      }
    }

    @pure def printEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_P(o: EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_P""""),
        ("api_arbitrationDecision", printEIT_Acquisition_Session_CoordinatorArbitrationDecision(o.api_arbitrationDecision))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PS(o: EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PS""""),
        ("In_committedPreparationState", printEIT_Acquisition_Session_CoordinatorPreparationStateType(o.In_committedPreparationState)),
        ("api_arbitrationDecision", printEIT_Acquisition_Session_CoordinatorArbitrationDecision(o.api_arbitrationDecision))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container(o: EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container): ST = {
      o match {
        case o: EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_P => return printEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PS => return printEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PS(o)
      }
    }

    @pure def printEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_P(o: EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_P""""),
        ("api_preparationDecision", printEIT_Acquisition_Session_CoordinatorPreparationDecisionSnapshot(o.api_preparationDecision)),
        ("api_preparationState", printEIT_Acquisition_Session_CoordinatorPreparationStateType(o.api_preparationState))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PS(o: EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PS""""),
        ("committedPreparationState", printEIT_Acquisition_Session_CoordinatorPreparationStateType(o.committedPreparationState)),
        ("api_preparationDecision", printEIT_Acquisition_Session_CoordinatorPreparationDecisionSnapshot(o.api_preparationDecision)),
        ("api_preparationState", printEIT_Acquisition_Session_CoordinatorPreparationStateType(o.api_preparationState))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container(o: EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container): ST = {
      o match {
        case o: EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_P => return printEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PS => return printEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PS(o)
      }
    }

    @pure def printEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_P(o: EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_P""""),
        ("api_arbitrationDecision", printEIT_Acquisition_Session_CoordinatorArbitrationDecision(o.api_arbitrationDecision)),
        ("api_eligibilityEnvelope", printEIT_Acquisition_Session_CoordinatorEligibilityEnvelope(o.api_eligibilityEnvelope)),
        ("api_preparationDecision", printEIT_Acquisition_Session_CoordinatorPreparationDecisionSnapshot(o.api_preparationDecision))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PS(o: EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PS""""),
        ("In_committedMonitoringState", printEIT_Acquisition_Session_CoordinatorMonitoringStateType(o.In_committedMonitoringState)),
        ("api_arbitrationDecision", printEIT_Acquisition_Session_CoordinatorArbitrationDecision(o.api_arbitrationDecision)),
        ("api_eligibilityEnvelope", printEIT_Acquisition_Session_CoordinatorEligibilityEnvelope(o.api_eligibilityEnvelope)),
        ("api_preparationDecision", printEIT_Acquisition_Session_CoordinatorPreparationDecisionSnapshot(o.api_preparationDecision))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container(o: EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container): ST = {
      o match {
        case o: EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_P => return printEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PS => return printEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PS(o)
      }
    }

    @pure def printEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_P(o: EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_P""""),
        ("api_monitoringDecision", printEIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot(o.api_monitoringDecision)),
        ("api_monitoringState", printEIT_Acquisition_Session_CoordinatorMonitoringStateType(o.api_monitoringState))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PS(o: EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PS""""),
        ("committedMonitoringState", printEIT_Acquisition_Session_CoordinatorMonitoringStateType(o.committedMonitoringState)),
        ("api_monitoringDecision", printEIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot(o.api_monitoringDecision)),
        ("api_monitoringState", printEIT_Acquisition_Session_CoordinatorMonitoringStateType(o.api_monitoringState))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container(o: EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container): ST = {
      o match {
        case o: EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_P => return printEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PS => return printEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PS(o)
      }
    }

    @pure def printEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_P(o: EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_P""""),
        ("api_monitoringDecision", printEIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot(o.api_monitoringDecision))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PS(o: EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PS""""),
        ("api_monitoringDecision", printEIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot(o.api_monitoringDecision))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container(o: EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container): ST = {
      o match {
        case o: EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_P => return printEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PS => return printEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PS(o)
      }
    }

    @pure def printEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_P(o: EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_P""""),
        ("api_acquisitionCommand", printEIT_Acquisition_Session_CoordinatorAcquisitionCommandType(o.api_acquisitionCommand))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PS(o: EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PS""""),
        ("api_acquisitionCommand", printEIT_Acquisition_Session_CoordinatorAcquisitionCommandType(o.api_acquisitionCommand))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container(o: EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container): ST = {
      o match {
        case o: EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_P => return printEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PS => return printEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PS(o)
      }
    }

    @pure def printEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_P(o: EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_P""""),
        ("api_impedanceFrame", printEIT_Acquisition_Session_CoordinatorImpedanceFrameObservationType(o.api_impedanceFrame)),
        ("api_monitoringDecision", printEIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot(o.api_monitoringDecision))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PS(o: EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PS""""),
        ("api_impedanceFrame", printEIT_Acquisition_Session_CoordinatorImpedanceFrameObservationType(o.api_impedanceFrame)),
        ("api_monitoringDecision", printEIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot(o.api_monitoringDecision))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container(o: EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container): ST = {
      o match {
        case o: EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_P => return printEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PS => return printEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PS(o)
      }
    }

    @pure def printEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_P(o: EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_P""""),
        ("api_frameDelivery", printEIT_Acquisition_Session_CoordinatorFrameDeliveryType(o.api_frameDelivery)),
        ("api_sessionStatus", printEIT_Acquisition_Session_CoordinatorSessionStatus(o.api_sessionStatus))
      ))
    }

    @pure def printEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PS(o: EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PS""""),
        ("api_frameDelivery", printEIT_Acquisition_Session_CoordinatorFrameDeliveryType(o.api_frameDelivery)),
        ("api_sessionStatus", printEIT_Acquisition_Session_CoordinatorSessionStatus(o.api_sessionStatus))
      ))
    }

    @pure def printruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): ST = {
      val value: String = o match {
        case runtimemonitor.ObservationKind.EITAcquisitionSessionCoordinator_Instance_acquisitionCoordinationProcess_beltQualificationOwner_postInit => "EITAcquisitionSessionCoordinator_Instance_acquisitionCoordinationProcess_beltQualificationOwner_postInit"
        case runtimemonitor.ObservationKind.EITAcquisitionSessionCoordinator_Instance_acquisitionCoordinationProcess_beltQualificationOwner_preCompute => "EITAcquisitionSessionCoordinator_Instance_acquisitionCoordinationProcess_beltQualificationOwner_preCompute"
        case runtimemonitor.ObservationKind.EITAcquisitionSessionCoordinator_Instance_acquisitionCoordinationProcess_beltQualificationOwner_postCompute => "EITAcquisitionSessionCoordinator_Instance_acquisitionCoordinationProcess_beltQualificationOwner_postCompute"
        case runtimemonitor.ObservationKind.EITAcquisitionSessionCoordinator_Instance_acquisitionCoordinationProcess_calibrationQualificationOwner_postInit => "EITAcquisitionSessionCoordinator_Instance_acquisitionCoordinationProcess_calibrationQualificationOwner_postInit"
        case runtimemonitor.ObservationKind.EITAcquisitionSessionCoordinator_Instance_acquisitionCoordinationProcess_calibrationQualificationOwner_preCompute => "EITAcquisitionSessionCoordinator_Instance_acquisitionCoordinationProcess_calibrationQualificationOwner_preCompute"
        case runtimemonitor.ObservationKind.EITAcquisitionSessionCoordinator_Instance_acquisitionCoordinationProcess_calibrationQualificationOwner_postCompute => "EITAcquisitionSessionCoordinator_Instance_acquisitionCoordinationProcess_calibrationQualificationOwner_postCompute"
        case runtimemonitor.ObservationKind.EITAcquisitionSessionCoordinator_Instance_acquisitionCoordinationProcess_acquisitionEligibilityOwner_postInit => "EITAcquisitionSessionCoordinator_Instance_acquisitionCoordinationProcess_acquisitionEligibilityOwner_postInit"
        case runtimemonitor.ObservationKind.EITAcquisitionSessionCoordinator_Instance_acquisitionCoordinationProcess_acquisitionEligibilityOwner_preCompute => "EITAcquisitionSessionCoordinator_Instance_acquisitionCoordinationProcess_acquisitionEligibilityOwner_preCompute"
        case runtimemonitor.ObservationKind.EITAcquisitionSessionCoordinator_Instance_acquisitionCoordinationProcess_acquisitionEligibilityOwner_postCompute => "EITAcquisitionSessionCoordinator_Instance_acquisitionCoordinationProcess_acquisitionEligibilityOwner_postCompute"
        case runtimemonitor.ObservationKind.EITAcquisitionSessionCoordinator_Instance_acquisitionCoordinationProcess_requestArbiter_postInit => "EITAcquisitionSessionCoordinator_Instance_acquisitionCoordinationProcess_requestArbiter_postInit"
        case runtimemonitor.ObservationKind.EITAcquisitionSessionCoordinator_Instance_acquisitionCoordinationProcess_requestArbiter_preCompute => "EITAcquisitionSessionCoordinator_Instance_acquisitionCoordinationProcess_requestArbiter_preCompute"
        case runtimemonitor.ObservationKind.EITAcquisitionSessionCoordinator_Instance_acquisitionCoordinationProcess_requestArbiter_postCompute => "EITAcquisitionSessionCoordinator_Instance_acquisitionCoordinationProcess_requestArbiter_postCompute"
        case runtimemonitor.ObservationKind.EITAcquisitionSessionCoordinator_Instance_acquisitionCoordinationProcess_preparationStateGovernor_postInit => "EITAcquisitionSessionCoordinator_Instance_acquisitionCoordinationProcess_preparationStateGovernor_postInit"
        case runtimemonitor.ObservationKind.EITAcquisitionSessionCoordinator_Instance_acquisitionCoordinationProcess_preparationStateGovernor_preCompute => "EITAcquisitionSessionCoordinator_Instance_acquisitionCoordinationProcess_preparationStateGovernor_preCompute"
        case runtimemonitor.ObservationKind.EITAcquisitionSessionCoordinator_Instance_acquisitionCoordinationProcess_preparationStateGovernor_postCompute => "EITAcquisitionSessionCoordinator_Instance_acquisitionCoordinationProcess_preparationStateGovernor_postCompute"
        case runtimemonitor.ObservationKind.EITAcquisitionSessionCoordinator_Instance_acquisitionCoordinationProcess_monitoringStateGovernor_postInit => "EITAcquisitionSessionCoordinator_Instance_acquisitionCoordinationProcess_monitoringStateGovernor_postInit"
        case runtimemonitor.ObservationKind.EITAcquisitionSessionCoordinator_Instance_acquisitionCoordinationProcess_monitoringStateGovernor_preCompute => "EITAcquisitionSessionCoordinator_Instance_acquisitionCoordinationProcess_monitoringStateGovernor_preCompute"
        case runtimemonitor.ObservationKind.EITAcquisitionSessionCoordinator_Instance_acquisitionCoordinationProcess_monitoringStateGovernor_postCompute => "EITAcquisitionSessionCoordinator_Instance_acquisitionCoordinationProcess_monitoringStateGovernor_postCompute"
        case runtimemonitor.ObservationKind.EITAcquisitionSessionCoordinator_Instance_acquisitionCoordinationProcess_acquisitionCommandPolicy_postInit => "EITAcquisitionSessionCoordinator_Instance_acquisitionCoordinationProcess_acquisitionCommandPolicy_postInit"
        case runtimemonitor.ObservationKind.EITAcquisitionSessionCoordinator_Instance_acquisitionCoordinationProcess_acquisitionCommandPolicy_preCompute => "EITAcquisitionSessionCoordinator_Instance_acquisitionCoordinationProcess_acquisitionCommandPolicy_preCompute"
        case runtimemonitor.ObservationKind.EITAcquisitionSessionCoordinator_Instance_acquisitionCoordinationProcess_acquisitionCommandPolicy_postCompute => "EITAcquisitionSessionCoordinator_Instance_acquisitionCoordinationProcess_acquisitionCommandPolicy_postCompute"
        case runtimemonitor.ObservationKind.EITAcquisitionSessionCoordinator_Instance_acquisitionCoordinationProcess_sessionPublicationPolicy_postInit => "EITAcquisitionSessionCoordinator_Instance_acquisitionCoordinationProcess_sessionPublicationPolicy_postInit"
        case runtimemonitor.ObservationKind.EITAcquisitionSessionCoordinator_Instance_acquisitionCoordinationProcess_sessionPublicationPolicy_preCompute => "EITAcquisitionSessionCoordinator_Instance_acquisitionCoordinationProcess_sessionPublicationPolicy_preCompute"
        case runtimemonitor.ObservationKind.EITAcquisitionSessionCoordinator_Instance_acquisitionCoordinationProcess_sessionPublicationPolicy_postCompute => "EITAcquisitionSessionCoordinator_Instance_acquisitionCoordinationProcess_sessionPublicationPolicy_postCompute"
      }
      return printObject(ISZ(
        ("type", printString("runtimemonitor.ObservationKind")),
        ("value", printString(value))
      ))
    }

    @pure def printutilContainer(o: util.Container): ST = {
      o match {
        case o: util.EmptyContainer => return printutilEmptyContainer(o)
        case o: EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_P => return printEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PS => return printEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PS(o)
        case o: EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_P => return printEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PS => return printEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PS(o)
        case o: EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_P => return printEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PS => return printEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PS(o)
        case o: EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_P => return printEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PS => return printEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PS(o)
        case o: EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_P => return printEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PS => return printEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PS(o)
        case o: EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_P => return printEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PS => return printEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PS(o)
        case o: EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_P => return printEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_P => return printEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_P => return printEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PS => return printEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PS(o)
        case o: EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PS => return printEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PS(o)
        case o: EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PS => return printEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PS(o)
        case o: EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_P => return printEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_P => return printEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_P => return printEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PS => return printEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PS(o)
        case o: EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PS => return printEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PS(o)
        case o: EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PS => return printEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PS(o)
        case o: EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_P => return printEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PS => return printEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PS(o)
        case o: EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_P => return printEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PS => return printEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PS(o)
        case o: EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_P => return printEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PS => return printEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PS(o)
        case o: EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_P => return printEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PS => return printEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PS(o)
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
        case o: EIT_Acquisition_Session_Coordinator.FrameDelivery_Payload => return printEIT_Acquisition_Session_CoordinatorFrameDelivery_Payload(o)
        case o: EIT_Acquisition_Session_Coordinator.DoctorRequest_Payload => return printEIT_Acquisition_Session_CoordinatorDoctorRequest_Payload(o)
        case o: EIT_Acquisition_Session_Coordinator.SessionStatus_Payload => return printEIT_Acquisition_Session_CoordinatorSessionStatus_Payload(o)
        case o: EIT_Acquisition_Session_Coordinator.BeltAssessment_Payload => return printEIT_Acquisition_Session_CoordinatorBeltAssessment_Payload(o)
        case o: EIT_Acquisition_Session_Coordinator.MonitoringState_Payload => return printEIT_Acquisition_Session_CoordinatorMonitoringState_Payload(o)
        case o: EIT_Acquisition_Session_Coordinator.BeltObservation_Payload => return printEIT_Acquisition_Session_CoordinatorBeltObservation_Payload(o)
        case o: EIT_Acquisition_Session_Coordinator.PreparationState_Payload => return printEIT_Acquisition_Session_CoordinatorPreparationState_Payload(o)
        case o: EIT_Acquisition_Session_Coordinator.BeltQualification_Payload => return printEIT_Acquisition_Session_CoordinatorBeltQualification_Payload(o)
        case o: EIT_Acquisition_Session_Coordinator.TechnicianRequest_Payload => return printEIT_Acquisition_Session_CoordinatorTechnicianRequest_Payload(o)
        case o: EIT_Acquisition_Session_Coordinator.AcquisitionCommand_Payload => return printEIT_Acquisition_Session_CoordinatorAcquisitionCommand_Payload(o)
        case o: EIT_Acquisition_Session_Coordinator.SessionStatusNotice_Payload => return printEIT_Acquisition_Session_CoordinatorSessionStatusNotice_Payload(o)
        case o: EIT_Acquisition_Session_Coordinator.ArbitrationDecision_Payload => return printEIT_Acquisition_Session_CoordinatorArbitrationDecision_Payload(o)
        case o: EIT_Acquisition_Session_Coordinator.EligibilityEnvelope_Payload => return printEIT_Acquisition_Session_CoordinatorEligibilityEnvelope_Payload(o)
        case o: EIT_Acquisition_Session_Coordinator.AcquisitionObservation_Payload => return printEIT_Acquisition_Session_CoordinatorAcquisitionObservation_Payload(o)
        case o: EIT_Acquisition_Session_Coordinator.CalibrationObservation_Payload => return printEIT_Acquisition_Session_CoordinatorCalibrationObservation_Payload(o)
        case o: EIT_Acquisition_Session_Coordinator.CalibrationQualification_Payload => return printEIT_Acquisition_Session_CoordinatorCalibrationQualification_Payload(o)
        case o: EIT_Acquisition_Session_Coordinator.SessionStatusDisposition_Payload => return printEIT_Acquisition_Session_CoordinatorSessionStatusDisposition_Payload(o)
        case o: EIT_Acquisition_Session_Coordinator.MonitoringDecisionIntent_Payload => return printEIT_Acquisition_Session_CoordinatorMonitoringDecisionIntent_Payload(o)
        case o: EIT_Acquisition_Session_Coordinator.MonitoringDecisionNotice_Payload => return printEIT_Acquisition_Session_CoordinatorMonitoringDecisionNotice_Payload(o)
        case o: EIT_Acquisition_Session_Coordinator.ImpedanceFrameObservation_Payload => return printEIT_Acquisition_Session_CoordinatorImpedanceFrameObservation_Payload(o)
        case o: EIT_Acquisition_Session_Coordinator.PreparationDecisionIntent_Payload => return printEIT_Acquisition_Session_CoordinatorPreparationDecisionIntent_Payload(o)
        case o: EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreState_Payload => return printEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreState_Payload(o)
        case o: EIT_Acquisition_Session_Coordinator.MonitoringDecisionSnapshot_Payload => return printEIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot_Payload(o)
        case o: EIT_Acquisition_Session_Coordinator.PreparationDecisionPreState_Payload => return printEIT_Acquisition_Session_CoordinatorPreparationDecisionPreState_Payload(o)
        case o: EIT_Acquisition_Session_Coordinator.MonitoringDecisionNextState_Payload => return printEIT_Acquisition_Session_CoordinatorMonitoringDecisionNextState_Payload(o)
        case o: EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeRecovery_Payload => return printEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeRecovery_Payload(o)
        case o: EIT_Acquisition_Session_Coordinator.PreparationDecisionSnapshot_Payload => return printEIT_Acquisition_Session_CoordinatorPreparationDecisionSnapshot_Payload(o)
        case o: EIT_Acquisition_Session_Coordinator.PreparationDecisionNextState_Payload => return printEIT_Acquisition_Session_CoordinatorPreparationDecisionNextState_Payload(o)
        case o: EIT_Acquisition_Session_Coordinator.SessionStatusMonitoringState_Payload => return printEIT_Acquisition_Session_CoordinatorSessionStatusMonitoringState_Payload(o)
        case o: EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeCondition_Payload => return printEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeCondition_Payload(o)
        case o: EIT_Acquisition_Session_Coordinator.SessionStatusPreparationState_Payload => return printEIT_Acquisition_Session_CoordinatorSessionStatusPreparationState_Payload(o)
        case o: EIT_Acquisition_Session_Coordinator.MonitoringDecisionDisposition_Payload => return printEIT_Acquisition_Session_CoordinatorMonitoringDecisionDisposition_Payload(o)
        case o: EIT_Acquisition_Session_Coordinator.ArbitrationDecisionDisposition_Payload => return printEIT_Acquisition_Session_CoordinatorArbitrationDecisionDisposition_Payload(o)
        case o: EIT_Acquisition_Session_Coordinator.PreparationDecisionDisposition_Payload => return printEIT_Acquisition_Session_CoordinatorPreparationDecisionDisposition_Payload(o)
        case o: EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreparationState_Payload => return printEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreparationState_Payload(o)
        case o: EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeMonitoringState_Payload => return printEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeMonitoringState_Payload(o)
        case o: EIT_Acquisition_Session_Coordinator.ArbitrationDecisionEffectiveIntent_Payload => return printEIT_Acquisition_Session_CoordinatorArbitrationDecisionEffectiveIntent_Payload(o)
        case o: EIT_Acquisition_Session_Coordinator.EligibilityEnvelopePreparationState_Payload => return printEIT_Acquisition_Session_CoordinatorEligibilityEnvelopePreparationState_Payload(o)
        case o: EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_P => return printEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PS => return printEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PS(o)
        case o: EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_P => return printEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PS => return printEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PS(o)
        case o: EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_P => return printEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PS => return printEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PS(o)
        case o: EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_P => return printEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PS => return printEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PS(o)
        case o: EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_P => return printEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PS => return printEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PS(o)
        case o: EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_P => return printEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PS => return printEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PS(o)
        case o: EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_P => return printEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_P => return printEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_P => return printEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PS => return printEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PS(o)
        case o: EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PS => return printEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PS(o)
        case o: EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PS => return printEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PS(o)
        case o: EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_P => return printEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_P => return printEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_P => return printEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PS => return printEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PS(o)
        case o: EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PS => return printEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PS(o)
        case o: EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PS => return printEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PS(o)
        case o: EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_P => return printEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PS => return printEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PS(o)
        case o: EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_P => return printEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PS => return printEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PS(o)
        case o: EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_P => return printEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PS => return printEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PS(o)
        case o: EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_P => return printEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_P(o)
        case o: EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PS => return printEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PS(o)
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

    def parseEIT_Acquisition_Session_CoordinatorBeltObservationType(): EIT_Acquisition_Session_Coordinator.BeltObservation.Type = {
      val r = parseEIT_Acquisition_Session_CoordinatorBeltObservationT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorBeltObservationT(typeParsed: B): EIT_Acquisition_Session_Coordinator.BeltObservation.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.BeltObservation")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Acquisition_Session_Coordinator.BeltObservation.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Acquisition_Session_Coordinator.BeltObservation.")
          return EIT_Acquisition_Session_Coordinator.BeltObservation.byOrdinal(0).get
      }
    }

    def parseEIT_Acquisition_Session_CoordinatorBeltObservation_Payload(): EIT_Acquisition_Session_Coordinator.BeltObservation_Payload = {
      val r = parseEIT_Acquisition_Session_CoordinatorBeltObservation_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorBeltObservation_PayloadT(typeParsed: B): EIT_Acquisition_Session_Coordinator.BeltObservation_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.BeltObservation_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_Session_CoordinatorBeltObservationType()
      parser.parseObjectNext()
      return EIT_Acquisition_Session_Coordinator.BeltObservation_Payload(value)
    }

    def parseEIT_Acquisition_Session_CoordinatorBeltQualificationType(): EIT_Acquisition_Session_Coordinator.BeltQualification.Type = {
      val r = parseEIT_Acquisition_Session_CoordinatorBeltQualificationT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorBeltQualificationT(typeParsed: B): EIT_Acquisition_Session_Coordinator.BeltQualification.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.BeltQualification")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Acquisition_Session_Coordinator.BeltQualification.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Acquisition_Session_Coordinator.BeltQualification.")
          return EIT_Acquisition_Session_Coordinator.BeltQualification.byOrdinal(0).get
      }
    }

    def parseEIT_Acquisition_Session_CoordinatorBeltQualification_Payload(): EIT_Acquisition_Session_Coordinator.BeltQualification_Payload = {
      val r = parseEIT_Acquisition_Session_CoordinatorBeltQualification_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorBeltQualification_PayloadT(typeParsed: B): EIT_Acquisition_Session_Coordinator.BeltQualification_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.BeltQualification_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_Session_CoordinatorBeltQualificationType()
      parser.parseObjectNext()
      return EIT_Acquisition_Session_Coordinator.BeltQualification_Payload(value)
    }

    def parseEIT_Acquisition_Session_CoordinatorCalibrationObservationType(): EIT_Acquisition_Session_Coordinator.CalibrationObservation.Type = {
      val r = parseEIT_Acquisition_Session_CoordinatorCalibrationObservationT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorCalibrationObservationT(typeParsed: B): EIT_Acquisition_Session_Coordinator.CalibrationObservation.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.CalibrationObservation")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Acquisition_Session_Coordinator.CalibrationObservation.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Acquisition_Session_Coordinator.CalibrationObservation.")
          return EIT_Acquisition_Session_Coordinator.CalibrationObservation.byOrdinal(0).get
      }
    }

    def parseEIT_Acquisition_Session_CoordinatorCalibrationObservation_Payload(): EIT_Acquisition_Session_Coordinator.CalibrationObservation_Payload = {
      val r = parseEIT_Acquisition_Session_CoordinatorCalibrationObservation_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorCalibrationObservation_PayloadT(typeParsed: B): EIT_Acquisition_Session_Coordinator.CalibrationObservation_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.CalibrationObservation_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_Session_CoordinatorCalibrationObservationType()
      parser.parseObjectNext()
      return EIT_Acquisition_Session_Coordinator.CalibrationObservation_Payload(value)
    }

    def parseEIT_Acquisition_Session_CoordinatorCalibrationQualificationType(): EIT_Acquisition_Session_Coordinator.CalibrationQualification.Type = {
      val r = parseEIT_Acquisition_Session_CoordinatorCalibrationQualificationT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorCalibrationQualificationT(typeParsed: B): EIT_Acquisition_Session_Coordinator.CalibrationQualification.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.CalibrationQualification")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Acquisition_Session_Coordinator.CalibrationQualification.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Acquisition_Session_Coordinator.CalibrationQualification.")
          return EIT_Acquisition_Session_Coordinator.CalibrationQualification.byOrdinal(0).get
      }
    }

    def parseEIT_Acquisition_Session_CoordinatorCalibrationQualification_Payload(): EIT_Acquisition_Session_Coordinator.CalibrationQualification_Payload = {
      val r = parseEIT_Acquisition_Session_CoordinatorCalibrationQualification_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorCalibrationQualification_PayloadT(typeParsed: B): EIT_Acquisition_Session_Coordinator.CalibrationQualification_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.CalibrationQualification_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_Session_CoordinatorCalibrationQualificationType()
      parser.parseObjectNext()
      return EIT_Acquisition_Session_Coordinator.CalibrationQualification_Payload(value)
    }

    def parseEIT_Acquisition_Session_CoordinatorAcquisitionObservationType(): EIT_Acquisition_Session_Coordinator.AcquisitionObservation.Type = {
      val r = parseEIT_Acquisition_Session_CoordinatorAcquisitionObservationT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorAcquisitionObservationT(typeParsed: B): EIT_Acquisition_Session_Coordinator.AcquisitionObservation.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.AcquisitionObservation")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Acquisition_Session_Coordinator.AcquisitionObservation.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Acquisition_Session_Coordinator.AcquisitionObservation.")
          return EIT_Acquisition_Session_Coordinator.AcquisitionObservation.byOrdinal(0).get
      }
    }

    def parseEIT_Acquisition_Session_CoordinatorAcquisitionObservation_Payload(): EIT_Acquisition_Session_Coordinator.AcquisitionObservation_Payload = {
      val r = parseEIT_Acquisition_Session_CoordinatorAcquisitionObservation_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorAcquisitionObservation_PayloadT(typeParsed: B): EIT_Acquisition_Session_Coordinator.AcquisitionObservation_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.AcquisitionObservation_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_Session_CoordinatorAcquisitionObservationType()
      parser.parseObjectNext()
      return EIT_Acquisition_Session_Coordinator.AcquisitionObservation_Payload(value)
    }

    def parseEIT_Acquisition_Session_CoordinatorPreparationStateType(): EIT_Acquisition_Session_Coordinator.PreparationState.Type = {
      val r = parseEIT_Acquisition_Session_CoordinatorPreparationStateT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorPreparationStateT(typeParsed: B): EIT_Acquisition_Session_Coordinator.PreparationState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.PreparationState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Acquisition_Session_Coordinator.PreparationState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Acquisition_Session_Coordinator.PreparationState.")
          return EIT_Acquisition_Session_Coordinator.PreparationState.byOrdinal(0).get
      }
    }

    def parseEIT_Acquisition_Session_CoordinatorPreparationState_Payload(): EIT_Acquisition_Session_Coordinator.PreparationState_Payload = {
      val r = parseEIT_Acquisition_Session_CoordinatorPreparationState_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorPreparationState_PayloadT(typeParsed: B): EIT_Acquisition_Session_Coordinator.PreparationState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.PreparationState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_Session_CoordinatorPreparationStateType()
      parser.parseObjectNext()
      return EIT_Acquisition_Session_Coordinator.PreparationState_Payload(value)
    }

    def parseEIT_Acquisition_Session_CoordinatorMonitoringStateType(): EIT_Acquisition_Session_Coordinator.MonitoringState.Type = {
      val r = parseEIT_Acquisition_Session_CoordinatorMonitoringStateT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorMonitoringStateT(typeParsed: B): EIT_Acquisition_Session_Coordinator.MonitoringState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.MonitoringState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Acquisition_Session_Coordinator.MonitoringState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Acquisition_Session_Coordinator.MonitoringState.")
          return EIT_Acquisition_Session_Coordinator.MonitoringState.byOrdinal(0).get
      }
    }

    def parseEIT_Acquisition_Session_CoordinatorMonitoringState_Payload(): EIT_Acquisition_Session_Coordinator.MonitoringState_Payload = {
      val r = parseEIT_Acquisition_Session_CoordinatorMonitoringState_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorMonitoringState_PayloadT(typeParsed: B): EIT_Acquisition_Session_Coordinator.MonitoringState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.MonitoringState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_Session_CoordinatorMonitoringStateType()
      parser.parseObjectNext()
      return EIT_Acquisition_Session_Coordinator.MonitoringState_Payload(value)
    }

    def parseEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeConditionType(): EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeCondition.Type = {
      val r = parseEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeConditionT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeConditionT(typeParsed: B): EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeCondition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeCondition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeCondition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeCondition.")
          return EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeCondition.byOrdinal(0).get
      }
    }

    def parseEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeCondition_Payload(): EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeCondition_Payload = {
      val r = parseEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeCondition_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeCondition_PayloadT(typeParsed: B): EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeCondition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeCondition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeConditionType()
      parser.parseObjectNext()
      return EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeCondition_Payload(value)
    }

    def parseEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeRecoveryType(): EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeRecovery.Type = {
      val r = parseEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeRecoveryT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeRecoveryT(typeParsed: B): EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeRecovery.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeRecovery")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeRecovery.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeRecovery.")
          return EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeRecovery.byOrdinal(0).get
      }
    }

    def parseEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeRecovery_Payload(): EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeRecovery_Payload = {
      val r = parseEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeRecovery_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeRecovery_PayloadT(typeParsed: B): EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeRecovery_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeRecovery_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeRecoveryType()
      parser.parseObjectNext()
      return EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeRecovery_Payload(value)
    }

    def parseEIT_Acquisition_Session_CoordinatorEligibilityEnvelopePreparationStateType(): EIT_Acquisition_Session_Coordinator.EligibilityEnvelopePreparationState.Type = {
      val r = parseEIT_Acquisition_Session_CoordinatorEligibilityEnvelopePreparationStateT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorEligibilityEnvelopePreparationStateT(typeParsed: B): EIT_Acquisition_Session_Coordinator.EligibilityEnvelopePreparationState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.EligibilityEnvelopePreparationState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Acquisition_Session_Coordinator.EligibilityEnvelopePreparationState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Acquisition_Session_Coordinator.EligibilityEnvelopePreparationState.")
          return EIT_Acquisition_Session_Coordinator.EligibilityEnvelopePreparationState.byOrdinal(0).get
      }
    }

    def parseEIT_Acquisition_Session_CoordinatorEligibilityEnvelopePreparationState_Payload(): EIT_Acquisition_Session_Coordinator.EligibilityEnvelopePreparationState_Payload = {
      val r = parseEIT_Acquisition_Session_CoordinatorEligibilityEnvelopePreparationState_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorEligibilityEnvelopePreparationState_PayloadT(typeParsed: B): EIT_Acquisition_Session_Coordinator.EligibilityEnvelopePreparationState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.EligibilityEnvelopePreparationState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_Session_CoordinatorEligibilityEnvelopePreparationStateType()
      parser.parseObjectNext()
      return EIT_Acquisition_Session_Coordinator.EligibilityEnvelopePreparationState_Payload(value)
    }

    def parseEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeMonitoringStateType(): EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeMonitoringState.Type = {
      val r = parseEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeMonitoringStateT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeMonitoringStateT(typeParsed: B): EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeMonitoringState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeMonitoringState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeMonitoringState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeMonitoringState.")
          return EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeMonitoringState.byOrdinal(0).get
      }
    }

    def parseEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeMonitoringState_Payload(): EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeMonitoringState_Payload = {
      val r = parseEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeMonitoringState_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeMonitoringState_PayloadT(typeParsed: B): EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeMonitoringState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeMonitoringState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeMonitoringStateType()
      parser.parseObjectNext()
      return EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeMonitoringState_Payload(value)
    }

    def parseEIT_Acquisition_Session_CoordinatorDoctorRequestType(): EIT_Acquisition_Session_Coordinator.DoctorRequest.Type = {
      val r = parseEIT_Acquisition_Session_CoordinatorDoctorRequestT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorDoctorRequestT(typeParsed: B): EIT_Acquisition_Session_Coordinator.DoctorRequest.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.DoctorRequest")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Acquisition_Session_Coordinator.DoctorRequest.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Acquisition_Session_Coordinator.DoctorRequest.")
          return EIT_Acquisition_Session_Coordinator.DoctorRequest.byOrdinal(0).get
      }
    }

    def parseEIT_Acquisition_Session_CoordinatorDoctorRequest_Payload(): EIT_Acquisition_Session_Coordinator.DoctorRequest_Payload = {
      val r = parseEIT_Acquisition_Session_CoordinatorDoctorRequest_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorDoctorRequest_PayloadT(typeParsed: B): EIT_Acquisition_Session_Coordinator.DoctorRequest_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.DoctorRequest_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_Session_CoordinatorDoctorRequestType()
      parser.parseObjectNext()
      return EIT_Acquisition_Session_Coordinator.DoctorRequest_Payload(value)
    }

    def parseEIT_Acquisition_Session_CoordinatorTechnicianRequestType(): EIT_Acquisition_Session_Coordinator.TechnicianRequest.Type = {
      val r = parseEIT_Acquisition_Session_CoordinatorTechnicianRequestT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorTechnicianRequestT(typeParsed: B): EIT_Acquisition_Session_Coordinator.TechnicianRequest.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.TechnicianRequest")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Acquisition_Session_Coordinator.TechnicianRequest.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Acquisition_Session_Coordinator.TechnicianRequest.")
          return EIT_Acquisition_Session_Coordinator.TechnicianRequest.byOrdinal(0).get
      }
    }

    def parseEIT_Acquisition_Session_CoordinatorTechnicianRequest_Payload(): EIT_Acquisition_Session_Coordinator.TechnicianRequest_Payload = {
      val r = parseEIT_Acquisition_Session_CoordinatorTechnicianRequest_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorTechnicianRequest_PayloadT(typeParsed: B): EIT_Acquisition_Session_Coordinator.TechnicianRequest_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.TechnicianRequest_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_Session_CoordinatorTechnicianRequestType()
      parser.parseObjectNext()
      return EIT_Acquisition_Session_Coordinator.TechnicianRequest_Payload(value)
    }

    def parseEIT_Acquisition_Session_CoordinatorArbitrationDecisionEffectiveIntentType(): EIT_Acquisition_Session_Coordinator.ArbitrationDecisionEffectiveIntent.Type = {
      val r = parseEIT_Acquisition_Session_CoordinatorArbitrationDecisionEffectiveIntentT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorArbitrationDecisionEffectiveIntentT(typeParsed: B): EIT_Acquisition_Session_Coordinator.ArbitrationDecisionEffectiveIntent.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.ArbitrationDecisionEffectiveIntent")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Acquisition_Session_Coordinator.ArbitrationDecisionEffectiveIntent.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Acquisition_Session_Coordinator.ArbitrationDecisionEffectiveIntent.")
          return EIT_Acquisition_Session_Coordinator.ArbitrationDecisionEffectiveIntent.byOrdinal(0).get
      }
    }

    def parseEIT_Acquisition_Session_CoordinatorArbitrationDecisionEffectiveIntent_Payload(): EIT_Acquisition_Session_Coordinator.ArbitrationDecisionEffectiveIntent_Payload = {
      val r = parseEIT_Acquisition_Session_CoordinatorArbitrationDecisionEffectiveIntent_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorArbitrationDecisionEffectiveIntent_PayloadT(typeParsed: B): EIT_Acquisition_Session_Coordinator.ArbitrationDecisionEffectiveIntent_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.ArbitrationDecisionEffectiveIntent_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_Session_CoordinatorArbitrationDecisionEffectiveIntentType()
      parser.parseObjectNext()
      return EIT_Acquisition_Session_Coordinator.ArbitrationDecisionEffectiveIntent_Payload(value)
    }

    def parseEIT_Acquisition_Session_CoordinatorArbitrationDecisionDispositionType(): EIT_Acquisition_Session_Coordinator.ArbitrationDecisionDisposition.Type = {
      val r = parseEIT_Acquisition_Session_CoordinatorArbitrationDecisionDispositionT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorArbitrationDecisionDispositionT(typeParsed: B): EIT_Acquisition_Session_Coordinator.ArbitrationDecisionDisposition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.ArbitrationDecisionDisposition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Acquisition_Session_Coordinator.ArbitrationDecisionDisposition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Acquisition_Session_Coordinator.ArbitrationDecisionDisposition.")
          return EIT_Acquisition_Session_Coordinator.ArbitrationDecisionDisposition.byOrdinal(0).get
      }
    }

    def parseEIT_Acquisition_Session_CoordinatorArbitrationDecisionDisposition_Payload(): EIT_Acquisition_Session_Coordinator.ArbitrationDecisionDisposition_Payload = {
      val r = parseEIT_Acquisition_Session_CoordinatorArbitrationDecisionDisposition_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorArbitrationDecisionDisposition_PayloadT(typeParsed: B): EIT_Acquisition_Session_Coordinator.ArbitrationDecisionDisposition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.ArbitrationDecisionDisposition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_Session_CoordinatorArbitrationDecisionDispositionType()
      parser.parseObjectNext()
      return EIT_Acquisition_Session_Coordinator.ArbitrationDecisionDisposition_Payload(value)
    }

    def parseEIT_Acquisition_Session_CoordinatorPreparationDecisionPreStateType(): EIT_Acquisition_Session_Coordinator.PreparationDecisionPreState.Type = {
      val r = parseEIT_Acquisition_Session_CoordinatorPreparationDecisionPreStateT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorPreparationDecisionPreStateT(typeParsed: B): EIT_Acquisition_Session_Coordinator.PreparationDecisionPreState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.PreparationDecisionPreState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Acquisition_Session_Coordinator.PreparationDecisionPreState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Acquisition_Session_Coordinator.PreparationDecisionPreState.")
          return EIT_Acquisition_Session_Coordinator.PreparationDecisionPreState.byOrdinal(0).get
      }
    }

    def parseEIT_Acquisition_Session_CoordinatorPreparationDecisionPreState_Payload(): EIT_Acquisition_Session_Coordinator.PreparationDecisionPreState_Payload = {
      val r = parseEIT_Acquisition_Session_CoordinatorPreparationDecisionPreState_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorPreparationDecisionPreState_PayloadT(typeParsed: B): EIT_Acquisition_Session_Coordinator.PreparationDecisionPreState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.PreparationDecisionPreState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_Session_CoordinatorPreparationDecisionPreStateType()
      parser.parseObjectNext()
      return EIT_Acquisition_Session_Coordinator.PreparationDecisionPreState_Payload(value)
    }

    def parseEIT_Acquisition_Session_CoordinatorPreparationDecisionNextStateType(): EIT_Acquisition_Session_Coordinator.PreparationDecisionNextState.Type = {
      val r = parseEIT_Acquisition_Session_CoordinatorPreparationDecisionNextStateT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorPreparationDecisionNextStateT(typeParsed: B): EIT_Acquisition_Session_Coordinator.PreparationDecisionNextState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.PreparationDecisionNextState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Acquisition_Session_Coordinator.PreparationDecisionNextState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Acquisition_Session_Coordinator.PreparationDecisionNextState.")
          return EIT_Acquisition_Session_Coordinator.PreparationDecisionNextState.byOrdinal(0).get
      }
    }

    def parseEIT_Acquisition_Session_CoordinatorPreparationDecisionNextState_Payload(): EIT_Acquisition_Session_Coordinator.PreparationDecisionNextState_Payload = {
      val r = parseEIT_Acquisition_Session_CoordinatorPreparationDecisionNextState_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorPreparationDecisionNextState_PayloadT(typeParsed: B): EIT_Acquisition_Session_Coordinator.PreparationDecisionNextState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.PreparationDecisionNextState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_Session_CoordinatorPreparationDecisionNextStateType()
      parser.parseObjectNext()
      return EIT_Acquisition_Session_Coordinator.PreparationDecisionNextState_Payload(value)
    }

    def parseEIT_Acquisition_Session_CoordinatorPreparationDecisionIntentType(): EIT_Acquisition_Session_Coordinator.PreparationDecisionIntent.Type = {
      val r = parseEIT_Acquisition_Session_CoordinatorPreparationDecisionIntentT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorPreparationDecisionIntentT(typeParsed: B): EIT_Acquisition_Session_Coordinator.PreparationDecisionIntent.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.PreparationDecisionIntent")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Acquisition_Session_Coordinator.PreparationDecisionIntent.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Acquisition_Session_Coordinator.PreparationDecisionIntent.")
          return EIT_Acquisition_Session_Coordinator.PreparationDecisionIntent.byOrdinal(0).get
      }
    }

    def parseEIT_Acquisition_Session_CoordinatorPreparationDecisionIntent_Payload(): EIT_Acquisition_Session_Coordinator.PreparationDecisionIntent_Payload = {
      val r = parseEIT_Acquisition_Session_CoordinatorPreparationDecisionIntent_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorPreparationDecisionIntent_PayloadT(typeParsed: B): EIT_Acquisition_Session_Coordinator.PreparationDecisionIntent_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.PreparationDecisionIntent_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_Session_CoordinatorPreparationDecisionIntentType()
      parser.parseObjectNext()
      return EIT_Acquisition_Session_Coordinator.PreparationDecisionIntent_Payload(value)
    }

    def parseEIT_Acquisition_Session_CoordinatorPreparationDecisionDispositionType(): EIT_Acquisition_Session_Coordinator.PreparationDecisionDisposition.Type = {
      val r = parseEIT_Acquisition_Session_CoordinatorPreparationDecisionDispositionT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorPreparationDecisionDispositionT(typeParsed: B): EIT_Acquisition_Session_Coordinator.PreparationDecisionDisposition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.PreparationDecisionDisposition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Acquisition_Session_Coordinator.PreparationDecisionDisposition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Acquisition_Session_Coordinator.PreparationDecisionDisposition.")
          return EIT_Acquisition_Session_Coordinator.PreparationDecisionDisposition.byOrdinal(0).get
      }
    }

    def parseEIT_Acquisition_Session_CoordinatorPreparationDecisionDisposition_Payload(): EIT_Acquisition_Session_Coordinator.PreparationDecisionDisposition_Payload = {
      val r = parseEIT_Acquisition_Session_CoordinatorPreparationDecisionDisposition_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorPreparationDecisionDisposition_PayloadT(typeParsed: B): EIT_Acquisition_Session_Coordinator.PreparationDecisionDisposition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.PreparationDecisionDisposition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_Session_CoordinatorPreparationDecisionDispositionType()
      parser.parseObjectNext()
      return EIT_Acquisition_Session_Coordinator.PreparationDecisionDisposition_Payload(value)
    }

    def parseEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreStateType(): EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreState.Type = {
      val r = parseEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreStateT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreStateT(typeParsed: B): EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreState.")
          return EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreState.byOrdinal(0).get
      }
    }

    def parseEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreState_Payload(): EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreState_Payload = {
      val r = parseEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreState_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreState_PayloadT(typeParsed: B): EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreStateType()
      parser.parseObjectNext()
      return EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreState_Payload(value)
    }

    def parseEIT_Acquisition_Session_CoordinatorMonitoringDecisionNextStateType(): EIT_Acquisition_Session_Coordinator.MonitoringDecisionNextState.Type = {
      val r = parseEIT_Acquisition_Session_CoordinatorMonitoringDecisionNextStateT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorMonitoringDecisionNextStateT(typeParsed: B): EIT_Acquisition_Session_Coordinator.MonitoringDecisionNextState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.MonitoringDecisionNextState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Acquisition_Session_Coordinator.MonitoringDecisionNextState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Acquisition_Session_Coordinator.MonitoringDecisionNextState.")
          return EIT_Acquisition_Session_Coordinator.MonitoringDecisionNextState.byOrdinal(0).get
      }
    }

    def parseEIT_Acquisition_Session_CoordinatorMonitoringDecisionNextState_Payload(): EIT_Acquisition_Session_Coordinator.MonitoringDecisionNextState_Payload = {
      val r = parseEIT_Acquisition_Session_CoordinatorMonitoringDecisionNextState_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorMonitoringDecisionNextState_PayloadT(typeParsed: B): EIT_Acquisition_Session_Coordinator.MonitoringDecisionNextState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.MonitoringDecisionNextState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_Session_CoordinatorMonitoringDecisionNextStateType()
      parser.parseObjectNext()
      return EIT_Acquisition_Session_Coordinator.MonitoringDecisionNextState_Payload(value)
    }

    def parseEIT_Acquisition_Session_CoordinatorMonitoringDecisionIntentType(): EIT_Acquisition_Session_Coordinator.MonitoringDecisionIntent.Type = {
      val r = parseEIT_Acquisition_Session_CoordinatorMonitoringDecisionIntentT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorMonitoringDecisionIntentT(typeParsed: B): EIT_Acquisition_Session_Coordinator.MonitoringDecisionIntent.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.MonitoringDecisionIntent")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Acquisition_Session_Coordinator.MonitoringDecisionIntent.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Acquisition_Session_Coordinator.MonitoringDecisionIntent.")
          return EIT_Acquisition_Session_Coordinator.MonitoringDecisionIntent.byOrdinal(0).get
      }
    }

    def parseEIT_Acquisition_Session_CoordinatorMonitoringDecisionIntent_Payload(): EIT_Acquisition_Session_Coordinator.MonitoringDecisionIntent_Payload = {
      val r = parseEIT_Acquisition_Session_CoordinatorMonitoringDecisionIntent_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorMonitoringDecisionIntent_PayloadT(typeParsed: B): EIT_Acquisition_Session_Coordinator.MonitoringDecisionIntent_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.MonitoringDecisionIntent_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_Session_CoordinatorMonitoringDecisionIntentType()
      parser.parseObjectNext()
      return EIT_Acquisition_Session_Coordinator.MonitoringDecisionIntent_Payload(value)
    }

    def parseEIT_Acquisition_Session_CoordinatorMonitoringDecisionDispositionType(): EIT_Acquisition_Session_Coordinator.MonitoringDecisionDisposition.Type = {
      val r = parseEIT_Acquisition_Session_CoordinatorMonitoringDecisionDispositionT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorMonitoringDecisionDispositionT(typeParsed: B): EIT_Acquisition_Session_Coordinator.MonitoringDecisionDisposition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.MonitoringDecisionDisposition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Acquisition_Session_Coordinator.MonitoringDecisionDisposition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Acquisition_Session_Coordinator.MonitoringDecisionDisposition.")
          return EIT_Acquisition_Session_Coordinator.MonitoringDecisionDisposition.byOrdinal(0).get
      }
    }

    def parseEIT_Acquisition_Session_CoordinatorMonitoringDecisionDisposition_Payload(): EIT_Acquisition_Session_Coordinator.MonitoringDecisionDisposition_Payload = {
      val r = parseEIT_Acquisition_Session_CoordinatorMonitoringDecisionDisposition_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorMonitoringDecisionDisposition_PayloadT(typeParsed: B): EIT_Acquisition_Session_Coordinator.MonitoringDecisionDisposition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.MonitoringDecisionDisposition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_Session_CoordinatorMonitoringDecisionDispositionType()
      parser.parseObjectNext()
      return EIT_Acquisition_Session_Coordinator.MonitoringDecisionDisposition_Payload(value)
    }

    def parseEIT_Acquisition_Session_CoordinatorMonitoringDecisionNoticeType(): EIT_Acquisition_Session_Coordinator.MonitoringDecisionNotice.Type = {
      val r = parseEIT_Acquisition_Session_CoordinatorMonitoringDecisionNoticeT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorMonitoringDecisionNoticeT(typeParsed: B): EIT_Acquisition_Session_Coordinator.MonitoringDecisionNotice.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.MonitoringDecisionNotice")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Acquisition_Session_Coordinator.MonitoringDecisionNotice.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Acquisition_Session_Coordinator.MonitoringDecisionNotice.")
          return EIT_Acquisition_Session_Coordinator.MonitoringDecisionNotice.byOrdinal(0).get
      }
    }

    def parseEIT_Acquisition_Session_CoordinatorMonitoringDecisionNotice_Payload(): EIT_Acquisition_Session_Coordinator.MonitoringDecisionNotice_Payload = {
      val r = parseEIT_Acquisition_Session_CoordinatorMonitoringDecisionNotice_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorMonitoringDecisionNotice_PayloadT(typeParsed: B): EIT_Acquisition_Session_Coordinator.MonitoringDecisionNotice_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.MonitoringDecisionNotice_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_Session_CoordinatorMonitoringDecisionNoticeType()
      parser.parseObjectNext()
      return EIT_Acquisition_Session_Coordinator.MonitoringDecisionNotice_Payload(value)
    }

    def parseEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreparationStateType(): EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreparationState.Type = {
      val r = parseEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreparationStateT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreparationStateT(typeParsed: B): EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreparationState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreparationState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreparationState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreparationState.")
          return EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreparationState.byOrdinal(0).get
      }
    }

    def parseEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreparationState_Payload(): EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreparationState_Payload = {
      val r = parseEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreparationState_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreparationState_PayloadT(typeParsed: B): EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreparationState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreparationState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreparationStateType()
      parser.parseObjectNext()
      return EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreparationState_Payload(value)
    }

    def parseEIT_Acquisition_Session_CoordinatorAcquisitionCommandType(): EIT_Acquisition_Session_Coordinator.AcquisitionCommand.Type = {
      val r = parseEIT_Acquisition_Session_CoordinatorAcquisitionCommandT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorAcquisitionCommandT(typeParsed: B): EIT_Acquisition_Session_Coordinator.AcquisitionCommand.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.AcquisitionCommand")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Acquisition_Session_Coordinator.AcquisitionCommand.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Acquisition_Session_Coordinator.AcquisitionCommand.")
          return EIT_Acquisition_Session_Coordinator.AcquisitionCommand.byOrdinal(0).get
      }
    }

    def parseEIT_Acquisition_Session_CoordinatorAcquisitionCommand_Payload(): EIT_Acquisition_Session_Coordinator.AcquisitionCommand_Payload = {
      val r = parseEIT_Acquisition_Session_CoordinatorAcquisitionCommand_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorAcquisitionCommand_PayloadT(typeParsed: B): EIT_Acquisition_Session_Coordinator.AcquisitionCommand_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.AcquisitionCommand_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_Session_CoordinatorAcquisitionCommandType()
      parser.parseObjectNext()
      return EIT_Acquisition_Session_Coordinator.AcquisitionCommand_Payload(value)
    }

    def parseEIT_Acquisition_Session_CoordinatorImpedanceFrameObservationType(): EIT_Acquisition_Session_Coordinator.ImpedanceFrameObservation.Type = {
      val r = parseEIT_Acquisition_Session_CoordinatorImpedanceFrameObservationT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorImpedanceFrameObservationT(typeParsed: B): EIT_Acquisition_Session_Coordinator.ImpedanceFrameObservation.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.ImpedanceFrameObservation")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Acquisition_Session_Coordinator.ImpedanceFrameObservation.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Acquisition_Session_Coordinator.ImpedanceFrameObservation.")
          return EIT_Acquisition_Session_Coordinator.ImpedanceFrameObservation.byOrdinal(0).get
      }
    }

    def parseEIT_Acquisition_Session_CoordinatorImpedanceFrameObservation_Payload(): EIT_Acquisition_Session_Coordinator.ImpedanceFrameObservation_Payload = {
      val r = parseEIT_Acquisition_Session_CoordinatorImpedanceFrameObservation_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorImpedanceFrameObservation_PayloadT(typeParsed: B): EIT_Acquisition_Session_Coordinator.ImpedanceFrameObservation_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.ImpedanceFrameObservation_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_Session_CoordinatorImpedanceFrameObservationType()
      parser.parseObjectNext()
      return EIT_Acquisition_Session_Coordinator.ImpedanceFrameObservation_Payload(value)
    }

    def parseEIT_Acquisition_Session_CoordinatorFrameDeliveryType(): EIT_Acquisition_Session_Coordinator.FrameDelivery.Type = {
      val r = parseEIT_Acquisition_Session_CoordinatorFrameDeliveryT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorFrameDeliveryT(typeParsed: B): EIT_Acquisition_Session_Coordinator.FrameDelivery.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.FrameDelivery")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Acquisition_Session_Coordinator.FrameDelivery.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Acquisition_Session_Coordinator.FrameDelivery.")
          return EIT_Acquisition_Session_Coordinator.FrameDelivery.byOrdinal(0).get
      }
    }

    def parseEIT_Acquisition_Session_CoordinatorFrameDelivery_Payload(): EIT_Acquisition_Session_Coordinator.FrameDelivery_Payload = {
      val r = parseEIT_Acquisition_Session_CoordinatorFrameDelivery_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorFrameDelivery_PayloadT(typeParsed: B): EIT_Acquisition_Session_Coordinator.FrameDelivery_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.FrameDelivery_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_Session_CoordinatorFrameDeliveryType()
      parser.parseObjectNext()
      return EIT_Acquisition_Session_Coordinator.FrameDelivery_Payload(value)
    }

    def parseEIT_Acquisition_Session_CoordinatorSessionStatusPreparationStateType(): EIT_Acquisition_Session_Coordinator.SessionStatusPreparationState.Type = {
      val r = parseEIT_Acquisition_Session_CoordinatorSessionStatusPreparationStateT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorSessionStatusPreparationStateT(typeParsed: B): EIT_Acquisition_Session_Coordinator.SessionStatusPreparationState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.SessionStatusPreparationState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Acquisition_Session_Coordinator.SessionStatusPreparationState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Acquisition_Session_Coordinator.SessionStatusPreparationState.")
          return EIT_Acquisition_Session_Coordinator.SessionStatusPreparationState.byOrdinal(0).get
      }
    }

    def parseEIT_Acquisition_Session_CoordinatorSessionStatusPreparationState_Payload(): EIT_Acquisition_Session_Coordinator.SessionStatusPreparationState_Payload = {
      val r = parseEIT_Acquisition_Session_CoordinatorSessionStatusPreparationState_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorSessionStatusPreparationState_PayloadT(typeParsed: B): EIT_Acquisition_Session_Coordinator.SessionStatusPreparationState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.SessionStatusPreparationState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_Session_CoordinatorSessionStatusPreparationStateType()
      parser.parseObjectNext()
      return EIT_Acquisition_Session_Coordinator.SessionStatusPreparationState_Payload(value)
    }

    def parseEIT_Acquisition_Session_CoordinatorSessionStatusMonitoringStateType(): EIT_Acquisition_Session_Coordinator.SessionStatusMonitoringState.Type = {
      val r = parseEIT_Acquisition_Session_CoordinatorSessionStatusMonitoringStateT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorSessionStatusMonitoringStateT(typeParsed: B): EIT_Acquisition_Session_Coordinator.SessionStatusMonitoringState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.SessionStatusMonitoringState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Acquisition_Session_Coordinator.SessionStatusMonitoringState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Acquisition_Session_Coordinator.SessionStatusMonitoringState.")
          return EIT_Acquisition_Session_Coordinator.SessionStatusMonitoringState.byOrdinal(0).get
      }
    }

    def parseEIT_Acquisition_Session_CoordinatorSessionStatusMonitoringState_Payload(): EIT_Acquisition_Session_Coordinator.SessionStatusMonitoringState_Payload = {
      val r = parseEIT_Acquisition_Session_CoordinatorSessionStatusMonitoringState_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorSessionStatusMonitoringState_PayloadT(typeParsed: B): EIT_Acquisition_Session_Coordinator.SessionStatusMonitoringState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.SessionStatusMonitoringState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_Session_CoordinatorSessionStatusMonitoringStateType()
      parser.parseObjectNext()
      return EIT_Acquisition_Session_Coordinator.SessionStatusMonitoringState_Payload(value)
    }

    def parseEIT_Acquisition_Session_CoordinatorSessionStatusDispositionType(): EIT_Acquisition_Session_Coordinator.SessionStatusDisposition.Type = {
      val r = parseEIT_Acquisition_Session_CoordinatorSessionStatusDispositionT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorSessionStatusDispositionT(typeParsed: B): EIT_Acquisition_Session_Coordinator.SessionStatusDisposition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.SessionStatusDisposition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Acquisition_Session_Coordinator.SessionStatusDisposition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Acquisition_Session_Coordinator.SessionStatusDisposition.")
          return EIT_Acquisition_Session_Coordinator.SessionStatusDisposition.byOrdinal(0).get
      }
    }

    def parseEIT_Acquisition_Session_CoordinatorSessionStatusDisposition_Payload(): EIT_Acquisition_Session_Coordinator.SessionStatusDisposition_Payload = {
      val r = parseEIT_Acquisition_Session_CoordinatorSessionStatusDisposition_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorSessionStatusDisposition_PayloadT(typeParsed: B): EIT_Acquisition_Session_Coordinator.SessionStatusDisposition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.SessionStatusDisposition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_Session_CoordinatorSessionStatusDispositionType()
      parser.parseObjectNext()
      return EIT_Acquisition_Session_Coordinator.SessionStatusDisposition_Payload(value)
    }

    def parseEIT_Acquisition_Session_CoordinatorSessionStatusNoticeType(): EIT_Acquisition_Session_Coordinator.SessionStatusNotice.Type = {
      val r = parseEIT_Acquisition_Session_CoordinatorSessionStatusNoticeT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorSessionStatusNoticeT(typeParsed: B): EIT_Acquisition_Session_Coordinator.SessionStatusNotice.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.SessionStatusNotice")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Acquisition_Session_Coordinator.SessionStatusNotice.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Acquisition_Session_Coordinator.SessionStatusNotice.")
          return EIT_Acquisition_Session_Coordinator.SessionStatusNotice.byOrdinal(0).get
      }
    }

    def parseEIT_Acquisition_Session_CoordinatorSessionStatusNotice_Payload(): EIT_Acquisition_Session_Coordinator.SessionStatusNotice_Payload = {
      val r = parseEIT_Acquisition_Session_CoordinatorSessionStatusNotice_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorSessionStatusNotice_PayloadT(typeParsed: B): EIT_Acquisition_Session_Coordinator.SessionStatusNotice_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.SessionStatusNotice_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_Session_CoordinatorSessionStatusNoticeType()
      parser.parseObjectNext()
      return EIT_Acquisition_Session_Coordinator.SessionStatusNotice_Payload(value)
    }

    def parseEIT_Acquisition_Session_CoordinatorBeltAssessment(): EIT_Acquisition_Session_Coordinator.BeltAssessment = {
      val r = parseEIT_Acquisition_Session_CoordinatorBeltAssessmentT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorBeltAssessmentT(typeParsed: B): EIT_Acquisition_Session_Coordinator.BeltAssessment = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.BeltAssessment")
      }
      parser.parseObjectKey("beltCategory")
      val beltCategory = parseEIT_Acquisition_Session_CoordinatorBeltQualificationType()
      parser.parseObjectNext()
      parser.parseObjectKey("qualified")
      val qualified = parser.parseB()
      parser.parseObjectNext()
      return EIT_Acquisition_Session_Coordinator.BeltAssessment(beltCategory, qualified)
    }

    def parseEIT_Acquisition_Session_CoordinatorBeltAssessment_Payload(): EIT_Acquisition_Session_Coordinator.BeltAssessment_Payload = {
      val r = parseEIT_Acquisition_Session_CoordinatorBeltAssessment_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorBeltAssessment_PayloadT(typeParsed: B): EIT_Acquisition_Session_Coordinator.BeltAssessment_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.BeltAssessment_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_Session_CoordinatorBeltAssessment()
      parser.parseObjectNext()
      return EIT_Acquisition_Session_Coordinator.BeltAssessment_Payload(value)
    }

    def parseEIT_Acquisition_Session_CoordinatorEligibilityEnvelope(): EIT_Acquisition_Session_Coordinator.EligibilityEnvelope = {
      val r = parseEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeT(typeParsed: B): EIT_Acquisition_Session_Coordinator.EligibilityEnvelope = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.EligibilityEnvelope")
      }
      parser.parseObjectKey("condition")
      val condition = parseEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeConditionType()
      parser.parseObjectNext()
      parser.parseObjectKey("recovery")
      val recovery = parseEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeRecoveryType()
      parser.parseObjectNext()
      parser.parseObjectKey("beltQualified")
      val beltQualified = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("calibrationQualified")
      val calibrationQualified = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("preparationState")
      val preparationState = parseEIT_Acquisition_Session_CoordinatorEligibilityEnvelopePreparationStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("monitoringState")
      val monitoringState = parseEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeMonitoringStateType()
      parser.parseObjectNext()
      return EIT_Acquisition_Session_Coordinator.EligibilityEnvelope(condition, recovery, beltQualified, calibrationQualified, preparationState, monitoringState)
    }

    def parseEIT_Acquisition_Session_CoordinatorEligibilityEnvelope_Payload(): EIT_Acquisition_Session_Coordinator.EligibilityEnvelope_Payload = {
      val r = parseEIT_Acquisition_Session_CoordinatorEligibilityEnvelope_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorEligibilityEnvelope_PayloadT(typeParsed: B): EIT_Acquisition_Session_Coordinator.EligibilityEnvelope_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.EligibilityEnvelope_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_Session_CoordinatorEligibilityEnvelope()
      parser.parseObjectNext()
      return EIT_Acquisition_Session_Coordinator.EligibilityEnvelope_Payload(value)
    }

    def parseEIT_Acquisition_Session_CoordinatorArbitrationDecision(): EIT_Acquisition_Session_Coordinator.ArbitrationDecision = {
      val r = parseEIT_Acquisition_Session_CoordinatorArbitrationDecisionT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorArbitrationDecisionT(typeParsed: B): EIT_Acquisition_Session_Coordinator.ArbitrationDecision = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.ArbitrationDecision")
      }
      parser.parseObjectKey("effectiveIntent")
      val effectiveIntent = parseEIT_Acquisition_Session_CoordinatorArbitrationDecisionEffectiveIntentType()
      parser.parseObjectNext()
      parser.parseObjectKey("disposition")
      val disposition = parseEIT_Acquisition_Session_CoordinatorArbitrationDecisionDispositionType()
      parser.parseObjectNext()
      return EIT_Acquisition_Session_Coordinator.ArbitrationDecision(effectiveIntent, disposition)
    }

    def parseEIT_Acquisition_Session_CoordinatorArbitrationDecision_Payload(): EIT_Acquisition_Session_Coordinator.ArbitrationDecision_Payload = {
      val r = parseEIT_Acquisition_Session_CoordinatorArbitrationDecision_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorArbitrationDecision_PayloadT(typeParsed: B): EIT_Acquisition_Session_Coordinator.ArbitrationDecision_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.ArbitrationDecision_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_Session_CoordinatorArbitrationDecision()
      parser.parseObjectNext()
      return EIT_Acquisition_Session_Coordinator.ArbitrationDecision_Payload(value)
    }

    def parseEIT_Acquisition_Session_CoordinatorPreparationDecisionSnapshot(): EIT_Acquisition_Session_Coordinator.PreparationDecisionSnapshot = {
      val r = parseEIT_Acquisition_Session_CoordinatorPreparationDecisionSnapshotT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorPreparationDecisionSnapshotT(typeParsed: B): EIT_Acquisition_Session_Coordinator.PreparationDecisionSnapshot = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.PreparationDecisionSnapshot")
      }
      parser.parseObjectKey("preState")
      val preState = parseEIT_Acquisition_Session_CoordinatorPreparationDecisionPreStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("nextState")
      val nextState = parseEIT_Acquisition_Session_CoordinatorPreparationDecisionNextStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("effectiveIntent")
      val effectiveIntent = parseEIT_Acquisition_Session_CoordinatorPreparationDecisionIntentType()
      parser.parseObjectNext()
      parser.parseObjectKey("disposition")
      val disposition = parseEIT_Acquisition_Session_CoordinatorPreparationDecisionDispositionType()
      parser.parseObjectNext()
      return EIT_Acquisition_Session_Coordinator.PreparationDecisionSnapshot(preState, nextState, effectiveIntent, disposition)
    }

    def parseEIT_Acquisition_Session_CoordinatorPreparationDecisionSnapshot_Payload(): EIT_Acquisition_Session_Coordinator.PreparationDecisionSnapshot_Payload = {
      val r = parseEIT_Acquisition_Session_CoordinatorPreparationDecisionSnapshot_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorPreparationDecisionSnapshot_PayloadT(typeParsed: B): EIT_Acquisition_Session_Coordinator.PreparationDecisionSnapshot_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.PreparationDecisionSnapshot_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_Session_CoordinatorPreparationDecisionSnapshot()
      parser.parseObjectNext()
      return EIT_Acquisition_Session_Coordinator.PreparationDecisionSnapshot_Payload(value)
    }

    def parseEIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot(): EIT_Acquisition_Session_Coordinator.MonitoringDecisionSnapshot = {
      val r = parseEIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshotT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshotT(typeParsed: B): EIT_Acquisition_Session_Coordinator.MonitoringDecisionSnapshot = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.MonitoringDecisionSnapshot")
      }
      parser.parseObjectKey("preState")
      val preState = parseEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("nextState")
      val nextState = parseEIT_Acquisition_Session_CoordinatorMonitoringDecisionNextStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("effectiveIntent")
      val effectiveIntent = parseEIT_Acquisition_Session_CoordinatorMonitoringDecisionIntentType()
      parser.parseObjectNext()
      parser.parseObjectKey("disposition")
      val disposition = parseEIT_Acquisition_Session_CoordinatorMonitoringDecisionDispositionType()
      parser.parseObjectNext()
      parser.parseObjectKey("notice")
      val notice = parseEIT_Acquisition_Session_CoordinatorMonitoringDecisionNoticeType()
      parser.parseObjectNext()
      parser.parseObjectKey("preparationState")
      val preparationState = parseEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreparationStateType()
      parser.parseObjectNext()
      return EIT_Acquisition_Session_Coordinator.MonitoringDecisionSnapshot(preState, nextState, effectiveIntent, disposition, notice, preparationState)
    }

    def parseEIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot_Payload(): EIT_Acquisition_Session_Coordinator.MonitoringDecisionSnapshot_Payload = {
      val r = parseEIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot_PayloadT(typeParsed: B): EIT_Acquisition_Session_Coordinator.MonitoringDecisionSnapshot_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.MonitoringDecisionSnapshot_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot()
      parser.parseObjectNext()
      return EIT_Acquisition_Session_Coordinator.MonitoringDecisionSnapshot_Payload(value)
    }

    def parseEIT_Acquisition_Session_CoordinatorSessionStatus(): EIT_Acquisition_Session_Coordinator.SessionStatus = {
      val r = parseEIT_Acquisition_Session_CoordinatorSessionStatusT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorSessionStatusT(typeParsed: B): EIT_Acquisition_Session_Coordinator.SessionStatus = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.SessionStatus")
      }
      parser.parseObjectKey("preparationState")
      val preparationState = parseEIT_Acquisition_Session_CoordinatorSessionStatusPreparationStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("monitoringState")
      val monitoringState = parseEIT_Acquisition_Session_CoordinatorSessionStatusMonitoringStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("disposition")
      val disposition = parseEIT_Acquisition_Session_CoordinatorSessionStatusDispositionType()
      parser.parseObjectNext()
      parser.parseObjectKey("notice")
      val notice = parseEIT_Acquisition_Session_CoordinatorSessionStatusNoticeType()
      parser.parseObjectNext()
      return EIT_Acquisition_Session_Coordinator.SessionStatus(preparationState, monitoringState, disposition, notice)
    }

    def parseEIT_Acquisition_Session_CoordinatorSessionStatus_Payload(): EIT_Acquisition_Session_Coordinator.SessionStatus_Payload = {
      val r = parseEIT_Acquisition_Session_CoordinatorSessionStatus_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorSessionStatus_PayloadT(typeParsed: B): EIT_Acquisition_Session_Coordinator.SessionStatus_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.SessionStatus_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_Session_CoordinatorSessionStatus()
      parser.parseObjectNext()
      return EIT_Acquisition_Session_Coordinator.SessionStatus_Payload(value)
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

    def parseEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container(): EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_P", "EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PS"))
      t.native match {
        case "EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_P" => val r = parseEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PS" => val r = parseEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PST(T); return r
        case _ => val r = parseEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PST(T); return r
      }
    }

    def parseEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_P(): EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_P = {
      val r = parseEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PT(typeParsed: B): EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_P")
      }
      parser.parseObjectKey("api_beltObservation")
      val api_beltObservation = parseEIT_Acquisition_Session_CoordinatorBeltObservationType()
      parser.parseObjectNext()
      return EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_P(api_beltObservation)
    }

    def parseEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PS(): EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PS = {
      val r = parseEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PST(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PST(typeParsed: B): EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_beltObservation")
      val api_beltObservation = parseEIT_Acquisition_Session_CoordinatorBeltObservationType()
      parser.parseObjectNext()
      return EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PS(api_beltObservation)
    }

    def parseEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container(): EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_P", "EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PS"))
      t.native match {
        case "EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_P" => val r = parseEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PS" => val r = parseEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PST(T); return r
        case _ => val r = parseEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PST(T); return r
      }
    }

    def parseEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_P(): EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_P = {
      val r = parseEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PT(typeParsed: B): EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_P")
      }
      parser.parseObjectKey("api_beltAssessment")
      val api_beltAssessment = parseEIT_Acquisition_Session_CoordinatorBeltAssessment()
      parser.parseObjectNext()
      return EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_P(api_beltAssessment)
    }

    def parseEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PS(): EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PS = {
      val r = parseEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PST(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PST(typeParsed: B): EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_beltAssessment")
      val api_beltAssessment = parseEIT_Acquisition_Session_CoordinatorBeltAssessment()
      parser.parseObjectNext()
      return EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PS(api_beltAssessment)
    }

    def parseEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container(): EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_P", "EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PS"))
      t.native match {
        case "EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_P" => val r = parseEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PS" => val r = parseEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PST(T); return r
        case _ => val r = parseEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PST(T); return r
      }
    }

    def parseEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_P(): EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_P = {
      val r = parseEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PT(typeParsed: B): EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_P")
      }
      parser.parseObjectKey("api_beltAssessment")
      val api_beltAssessment = parseEIT_Acquisition_Session_CoordinatorBeltAssessment()
      parser.parseObjectNext()
      parser.parseObjectKey("api_calibrationObservation")
      val api_calibrationObservation = parseEIT_Acquisition_Session_CoordinatorCalibrationObservationType()
      parser.parseObjectNext()
      return EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_P(api_beltAssessment, api_calibrationObservation)
    }

    def parseEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PS(): EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PS = {
      val r = parseEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PST(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PST(typeParsed: B): EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_beltAssessment")
      val api_beltAssessment = parseEIT_Acquisition_Session_CoordinatorBeltAssessment()
      parser.parseObjectNext()
      parser.parseObjectKey("api_calibrationObservation")
      val api_calibrationObservation = parseEIT_Acquisition_Session_CoordinatorCalibrationObservationType()
      parser.parseObjectNext()
      return EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PS(api_beltAssessment, api_calibrationObservation)
    }

    def parseEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container(): EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_P", "EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PS"))
      t.native match {
        case "EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_P" => val r = parseEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PS" => val r = parseEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PST(T); return r
        case _ => val r = parseEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PST(T); return r
      }
    }

    def parseEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_P(): EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_P = {
      val r = parseEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PT(typeParsed: B): EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_P")
      }
      parser.parseObjectKey("api_calibrationQualification")
      val api_calibrationQualification = parseEIT_Acquisition_Session_CoordinatorCalibrationQualificationType()
      parser.parseObjectNext()
      return EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_P(api_calibrationQualification)
    }

    def parseEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PS(): EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PS = {
      val r = parseEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PST(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PST(typeParsed: B): EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_calibrationQualification")
      val api_calibrationQualification = parseEIT_Acquisition_Session_CoordinatorCalibrationQualificationType()
      parser.parseObjectNext()
      return EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PS(api_calibrationQualification)
    }

    def parseEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container(): EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_P", "EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PS"))
      t.native match {
        case "EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_P" => val r = parseEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PS" => val r = parseEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PST(T); return r
        case _ => val r = parseEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PST(T); return r
      }
    }

    def parseEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_P(): EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_P = {
      val r = parseEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PT(typeParsed: B): EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_P")
      }
      parser.parseObjectKey("api_acquisitionObservation")
      val api_acquisitionObservation = parseEIT_Acquisition_Session_CoordinatorAcquisitionObservationType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_beltAssessment")
      val api_beltAssessment = parseEIT_Acquisition_Session_CoordinatorBeltAssessment()
      parser.parseObjectNext()
      parser.parseObjectKey("api_calibrationQualification")
      val api_calibrationQualification = parseEIT_Acquisition_Session_CoordinatorCalibrationQualificationType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_monitoringState")
      val api_monitoringState = parseEIT_Acquisition_Session_CoordinatorMonitoringStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_preparationState")
      val api_preparationState = parseEIT_Acquisition_Session_CoordinatorPreparationStateType()
      parser.parseObjectNext()
      return EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_P(api_acquisitionObservation, api_beltAssessment, api_calibrationQualification, api_monitoringState, api_preparationState)
    }

    def parseEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PS(): EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PS = {
      val r = parseEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PST(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PST(typeParsed: B): EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_acquisitionObservation")
      val api_acquisitionObservation = parseEIT_Acquisition_Session_CoordinatorAcquisitionObservationType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_beltAssessment")
      val api_beltAssessment = parseEIT_Acquisition_Session_CoordinatorBeltAssessment()
      parser.parseObjectNext()
      parser.parseObjectKey("api_calibrationQualification")
      val api_calibrationQualification = parseEIT_Acquisition_Session_CoordinatorCalibrationQualificationType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_monitoringState")
      val api_monitoringState = parseEIT_Acquisition_Session_CoordinatorMonitoringStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_preparationState")
      val api_preparationState = parseEIT_Acquisition_Session_CoordinatorPreparationStateType()
      parser.parseObjectNext()
      return EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PS(api_acquisitionObservation, api_beltAssessment, api_calibrationQualification, api_monitoringState, api_preparationState)
    }

    def parseEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container(): EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_P", "EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PS"))
      t.native match {
        case "EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_P" => val r = parseEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PS" => val r = parseEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PST(T); return r
        case _ => val r = parseEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PST(T); return r
      }
    }

    def parseEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_P(): EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_P = {
      val r = parseEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PT(typeParsed: B): EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_P")
      }
      parser.parseObjectKey("api_eligibilityEnvelope")
      val api_eligibilityEnvelope = parseEIT_Acquisition_Session_CoordinatorEligibilityEnvelope()
      parser.parseObjectNext()
      return EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_P(api_eligibilityEnvelope)
    }

    def parseEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PS(): EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PS = {
      val r = parseEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PST(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PST(typeParsed: B): EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_eligibilityEnvelope")
      val api_eligibilityEnvelope = parseEIT_Acquisition_Session_CoordinatorEligibilityEnvelope()
      parser.parseObjectNext()
      return EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PS(api_eligibilityEnvelope)
    }

    def parseEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container(): EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_P", "EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PS"))
      t.native match {
        case "EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_P" => val r = parseEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PS" => val r = parseEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PST(T); return r
        case _ => val r = parseEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PST(T); return r
      }
    }

    def parseEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_P(): EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_P = {
      val r = parseEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PT(typeParsed: B): EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_P")
      }
      parser.parseObjectKey("api_doctorRequest")
      val api_doctorRequest = parseEIT_Acquisition_Session_CoordinatorDoctorRequestType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_eligibilityEnvelope")
      val api_eligibilityEnvelope = parseEIT_Acquisition_Session_CoordinatorEligibilityEnvelope()
      parser.parseObjectNext()
      parser.parseObjectKey("api_technicianRequest")
      val api_technicianRequest = parseEIT_Acquisition_Session_CoordinatorTechnicianRequestType()
      parser.parseObjectNext()
      return EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_P(api_doctorRequest, api_eligibilityEnvelope, api_technicianRequest)
    }

    def parseEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PS(): EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PS = {
      val r = parseEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PST(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PST(typeParsed: B): EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PS")
      }
      parser.parseObjectKey("api_doctorRequest")
      val api_doctorRequest = parseEIT_Acquisition_Session_CoordinatorDoctorRequestType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_eligibilityEnvelope")
      val api_eligibilityEnvelope = parseEIT_Acquisition_Session_CoordinatorEligibilityEnvelope()
      parser.parseObjectNext()
      parser.parseObjectKey("api_technicianRequest")
      val api_technicianRequest = parseEIT_Acquisition_Session_CoordinatorTechnicianRequestType()
      parser.parseObjectNext()
      return EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PS(api_doctorRequest, api_eligibilityEnvelope, api_technicianRequest)
    }

    def parseEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container(): EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_P", "EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PS"))
      t.native match {
        case "EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_P" => val r = parseEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PS" => val r = parseEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PST(T); return r
        case _ => val r = parseEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PST(T); return r
      }
    }

    def parseEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_P(): EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_P = {
      val r = parseEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PT(typeParsed: B): EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_P")
      }
      parser.parseObjectKey("api_arbitrationDecision")
      val api_arbitrationDecision = parseEIT_Acquisition_Session_CoordinatorArbitrationDecision()
      parser.parseObjectNext()
      return EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_P(api_arbitrationDecision)
    }

    def parseEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PS(): EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PS = {
      val r = parseEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PST(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PST(typeParsed: B): EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PS")
      }
      parser.parseObjectKey("api_arbitrationDecision")
      val api_arbitrationDecision = parseEIT_Acquisition_Session_CoordinatorArbitrationDecision()
      parser.parseObjectNext()
      return EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PS(api_arbitrationDecision)
    }

    def parseEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container(): EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_P", "EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PS"))
      t.native match {
        case "EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_P" => val r = parseEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PS" => val r = parseEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PST(T); return r
        case _ => val r = parseEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PST(T); return r
      }
    }

    def parseEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_P(): EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_P = {
      val r = parseEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PT(typeParsed: B): EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_P")
      }
      parser.parseObjectKey("api_arbitrationDecision")
      val api_arbitrationDecision = parseEIT_Acquisition_Session_CoordinatorArbitrationDecision()
      parser.parseObjectNext()
      return EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_P(api_arbitrationDecision)
    }

    def parseEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PS(): EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PS = {
      val r = parseEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PST(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PST(typeParsed: B): EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PS")
      }
      parser.parseObjectKey("In_committedPreparationState")
      val In_committedPreparationState = parseEIT_Acquisition_Session_CoordinatorPreparationStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_arbitrationDecision")
      val api_arbitrationDecision = parseEIT_Acquisition_Session_CoordinatorArbitrationDecision()
      parser.parseObjectNext()
      return EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PS(In_committedPreparationState, api_arbitrationDecision)
    }

    def parseEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container(): EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_P", "EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PS"))
      t.native match {
        case "EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_P" => val r = parseEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PS" => val r = parseEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PST(T); return r
        case _ => val r = parseEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PST(T); return r
      }
    }

    def parseEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_P(): EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_P = {
      val r = parseEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PT(typeParsed: B): EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_P")
      }
      parser.parseObjectKey("api_preparationDecision")
      val api_preparationDecision = parseEIT_Acquisition_Session_CoordinatorPreparationDecisionSnapshot()
      parser.parseObjectNext()
      parser.parseObjectKey("api_preparationState")
      val api_preparationState = parseEIT_Acquisition_Session_CoordinatorPreparationStateType()
      parser.parseObjectNext()
      return EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_P(api_preparationDecision, api_preparationState)
    }

    def parseEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PS(): EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PS = {
      val r = parseEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PST(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PST(typeParsed: B): EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PS")
      }
      parser.parseObjectKey("committedPreparationState")
      val committedPreparationState = parseEIT_Acquisition_Session_CoordinatorPreparationStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_preparationDecision")
      val api_preparationDecision = parseEIT_Acquisition_Session_CoordinatorPreparationDecisionSnapshot()
      parser.parseObjectNext()
      parser.parseObjectKey("api_preparationState")
      val api_preparationState = parseEIT_Acquisition_Session_CoordinatorPreparationStateType()
      parser.parseObjectNext()
      return EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PS(committedPreparationState, api_preparationDecision, api_preparationState)
    }

    def parseEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container(): EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_P", "EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PS"))
      t.native match {
        case "EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_P" => val r = parseEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PS" => val r = parseEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PST(T); return r
        case _ => val r = parseEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PST(T); return r
      }
    }

    def parseEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_P(): EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_P = {
      val r = parseEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PT(typeParsed: B): EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_P")
      }
      parser.parseObjectKey("api_arbitrationDecision")
      val api_arbitrationDecision = parseEIT_Acquisition_Session_CoordinatorArbitrationDecision()
      parser.parseObjectNext()
      parser.parseObjectKey("api_eligibilityEnvelope")
      val api_eligibilityEnvelope = parseEIT_Acquisition_Session_CoordinatorEligibilityEnvelope()
      parser.parseObjectNext()
      parser.parseObjectKey("api_preparationDecision")
      val api_preparationDecision = parseEIT_Acquisition_Session_CoordinatorPreparationDecisionSnapshot()
      parser.parseObjectNext()
      return EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_P(api_arbitrationDecision, api_eligibilityEnvelope, api_preparationDecision)
    }

    def parseEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PS(): EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PS = {
      val r = parseEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PST(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PST(typeParsed: B): EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PS")
      }
      parser.parseObjectKey("In_committedMonitoringState")
      val In_committedMonitoringState = parseEIT_Acquisition_Session_CoordinatorMonitoringStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_arbitrationDecision")
      val api_arbitrationDecision = parseEIT_Acquisition_Session_CoordinatorArbitrationDecision()
      parser.parseObjectNext()
      parser.parseObjectKey("api_eligibilityEnvelope")
      val api_eligibilityEnvelope = parseEIT_Acquisition_Session_CoordinatorEligibilityEnvelope()
      parser.parseObjectNext()
      parser.parseObjectKey("api_preparationDecision")
      val api_preparationDecision = parseEIT_Acquisition_Session_CoordinatorPreparationDecisionSnapshot()
      parser.parseObjectNext()
      return EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PS(In_committedMonitoringState, api_arbitrationDecision, api_eligibilityEnvelope, api_preparationDecision)
    }

    def parseEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container(): EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_P", "EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PS"))
      t.native match {
        case "EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_P" => val r = parseEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PS" => val r = parseEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PST(T); return r
        case _ => val r = parseEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PST(T); return r
      }
    }

    def parseEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_P(): EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_P = {
      val r = parseEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PT(typeParsed: B): EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_P")
      }
      parser.parseObjectKey("api_monitoringDecision")
      val api_monitoringDecision = parseEIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot()
      parser.parseObjectNext()
      parser.parseObjectKey("api_monitoringState")
      val api_monitoringState = parseEIT_Acquisition_Session_CoordinatorMonitoringStateType()
      parser.parseObjectNext()
      return EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_P(api_monitoringDecision, api_monitoringState)
    }

    def parseEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PS(): EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PS = {
      val r = parseEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PST(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PST(typeParsed: B): EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PS")
      }
      parser.parseObjectKey("committedMonitoringState")
      val committedMonitoringState = parseEIT_Acquisition_Session_CoordinatorMonitoringStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_monitoringDecision")
      val api_monitoringDecision = parseEIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot()
      parser.parseObjectNext()
      parser.parseObjectKey("api_monitoringState")
      val api_monitoringState = parseEIT_Acquisition_Session_CoordinatorMonitoringStateType()
      parser.parseObjectNext()
      return EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PS(committedMonitoringState, api_monitoringDecision, api_monitoringState)
    }

    def parseEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container(): EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_P", "EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PS"))
      t.native match {
        case "EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_P" => val r = parseEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PS" => val r = parseEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PST(T); return r
        case _ => val r = parseEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PST(T); return r
      }
    }

    def parseEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_P(): EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_P = {
      val r = parseEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PT(typeParsed: B): EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_P")
      }
      parser.parseObjectKey("api_monitoringDecision")
      val api_monitoringDecision = parseEIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot()
      parser.parseObjectNext()
      return EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_P(api_monitoringDecision)
    }

    def parseEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PS(): EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PS = {
      val r = parseEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PST(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PST(typeParsed: B): EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PS")
      }
      parser.parseObjectKey("api_monitoringDecision")
      val api_monitoringDecision = parseEIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot()
      parser.parseObjectNext()
      return EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PS(api_monitoringDecision)
    }

    def parseEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container(): EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_P", "EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PS"))
      t.native match {
        case "EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_P" => val r = parseEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PS" => val r = parseEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PST(T); return r
        case _ => val r = parseEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PST(T); return r
      }
    }

    def parseEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_P(): EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_P = {
      val r = parseEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PT(typeParsed: B): EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_P")
      }
      parser.parseObjectKey("api_acquisitionCommand")
      val api_acquisitionCommand = parseEIT_Acquisition_Session_CoordinatorAcquisitionCommandType()
      parser.parseObjectNext()
      return EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_P(api_acquisitionCommand)
    }

    def parseEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PS(): EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PS = {
      val r = parseEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PST(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PST(typeParsed: B): EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PS")
      }
      parser.parseObjectKey("api_acquisitionCommand")
      val api_acquisitionCommand = parseEIT_Acquisition_Session_CoordinatorAcquisitionCommandType()
      parser.parseObjectNext()
      return EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PS(api_acquisitionCommand)
    }

    def parseEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container(): EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_P", "EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PS"))
      t.native match {
        case "EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_P" => val r = parseEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PS" => val r = parseEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PST(T); return r
        case _ => val r = parseEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PST(T); return r
      }
    }

    def parseEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_P(): EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_P = {
      val r = parseEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PT(typeParsed: B): EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_P")
      }
      parser.parseObjectKey("api_impedanceFrame")
      val api_impedanceFrame = parseEIT_Acquisition_Session_CoordinatorImpedanceFrameObservationType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_monitoringDecision")
      val api_monitoringDecision = parseEIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot()
      parser.parseObjectNext()
      return EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_P(api_impedanceFrame, api_monitoringDecision)
    }

    def parseEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PS(): EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PS = {
      val r = parseEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PST(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PST(typeParsed: B): EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PS")
      }
      parser.parseObjectKey("api_impedanceFrame")
      val api_impedanceFrame = parseEIT_Acquisition_Session_CoordinatorImpedanceFrameObservationType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_monitoringDecision")
      val api_monitoringDecision = parseEIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot()
      parser.parseObjectNext()
      return EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PS(api_impedanceFrame, api_monitoringDecision)
    }

    def parseEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container(): EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_P", "EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PS"))
      t.native match {
        case "EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_P" => val r = parseEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PS" => val r = parseEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PST(T); return r
        case _ => val r = parseEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PST(T); return r
      }
    }

    def parseEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_P(): EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_P = {
      val r = parseEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PT(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PT(typeParsed: B): EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_P")
      }
      parser.parseObjectKey("api_frameDelivery")
      val api_frameDelivery = parseEIT_Acquisition_Session_CoordinatorFrameDeliveryType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_sessionStatus")
      val api_sessionStatus = parseEIT_Acquisition_Session_CoordinatorSessionStatus()
      parser.parseObjectNext()
      return EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_P(api_frameDelivery, api_sessionStatus)
    }

    def parseEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PS(): EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PS = {
      val r = parseEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PST(F)
      return r
    }

    def parseEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PST(typeParsed: B): EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PS")
      }
      parser.parseObjectKey("api_frameDelivery")
      val api_frameDelivery = parseEIT_Acquisition_Session_CoordinatorFrameDeliveryType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_sessionStatus")
      val api_sessionStatus = parseEIT_Acquisition_Session_CoordinatorSessionStatus()
      parser.parseObjectNext()
      return EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PS(api_frameDelivery, api_sessionStatus)
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
      val t = parser.parseObjectTypes(ISZ("util.EmptyContainer", "EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_P", "EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PS", "EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_P", "EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PS", "EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_P", "EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PS", "EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_P", "EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PS", "EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_P", "EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PS", "EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_P", "EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PS", "EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_P", "EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_P", "EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_P", "EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PS", "EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PS", "EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PS", "EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_P", "EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_P", "EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_P", "EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PS", "EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PS", "EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PS", "EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_P", "EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PS", "EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_P", "EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PS", "EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_P", "EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PS", "EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_P", "EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PS"))
      t.native match {
        case "util.EmptyContainer" => val r = parseutilEmptyContainerT(T); return r
        case "EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_P" => val r = parseEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PS" => val r = parseEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PST(T); return r
        case "EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_P" => val r = parseEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PS" => val r = parseEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PST(T); return r
        case "EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_P" => val r = parseEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PS" => val r = parseEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PST(T); return r
        case "EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_P" => val r = parseEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PS" => val r = parseEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PST(T); return r
        case "EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_P" => val r = parseEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PS" => val r = parseEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PST(T); return r
        case "EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_P" => val r = parseEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PS" => val r = parseEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PST(T); return r
        case "EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_P" => val r = parseEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_P" => val r = parseEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_P" => val r = parseEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PS" => val r = parseEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PST(T); return r
        case "EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PS" => val r = parseEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PST(T); return r
        case "EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PS" => val r = parseEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PST(T); return r
        case "EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_P" => val r = parseEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_P" => val r = parseEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_P" => val r = parseEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PS" => val r = parseEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PST(T); return r
        case "EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PS" => val r = parseEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PST(T); return r
        case "EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PS" => val r = parseEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PST(T); return r
        case "EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_P" => val r = parseEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PS" => val r = parseEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PST(T); return r
        case "EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_P" => val r = parseEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PS" => val r = parseEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PST(T); return r
        case "EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_P" => val r = parseEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PS" => val r = parseEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PST(T); return r
        case "EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_P" => val r = parseEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PS" => val r = parseEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PST(T); return r
        case _ => val r = parseEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PST(T); return r
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
      val t = parser.parseObjectTypes(ISZ("art.Empty", "Base_Types.Boolean_Payload", "Base_Types.Integer_Payload", "Base_Types.Integer_8_Payload", "Base_Types.Integer_16_Payload", "Base_Types.Integer_32_Payload", "Base_Types.Integer_64_Payload", "Base_Types.Unsigned_8_Payload", "Base_Types.Unsigned_16_Payload", "Base_Types.Unsigned_32_Payload", "Base_Types.Unsigned_64_Payload", "Base_Types.Float_Payload", "Base_Types.Float_32_Payload", "Base_Types.Float_64_Payload", "Base_Types.Character_Payload", "Base_Types.String_Payload", "Base_Types.Bits_Payload", "util.EmptyContainer", "EIT_Acquisition_Session_Coordinator.FrameDelivery_Payload", "EIT_Acquisition_Session_Coordinator.DoctorRequest_Payload", "EIT_Acquisition_Session_Coordinator.SessionStatus_Payload", "EIT_Acquisition_Session_Coordinator.BeltAssessment_Payload", "EIT_Acquisition_Session_Coordinator.MonitoringState_Payload", "EIT_Acquisition_Session_Coordinator.BeltObservation_Payload", "EIT_Acquisition_Session_Coordinator.PreparationState_Payload", "EIT_Acquisition_Session_Coordinator.BeltQualification_Payload", "EIT_Acquisition_Session_Coordinator.TechnicianRequest_Payload", "EIT_Acquisition_Session_Coordinator.AcquisitionCommand_Payload", "EIT_Acquisition_Session_Coordinator.SessionStatusNotice_Payload", "EIT_Acquisition_Session_Coordinator.ArbitrationDecision_Payload", "EIT_Acquisition_Session_Coordinator.EligibilityEnvelope_Payload", "EIT_Acquisition_Session_Coordinator.AcquisitionObservation_Payload", "EIT_Acquisition_Session_Coordinator.CalibrationObservation_Payload", "EIT_Acquisition_Session_Coordinator.CalibrationQualification_Payload", "EIT_Acquisition_Session_Coordinator.SessionStatusDisposition_Payload", "EIT_Acquisition_Session_Coordinator.MonitoringDecisionIntent_Payload", "EIT_Acquisition_Session_Coordinator.MonitoringDecisionNotice_Payload", "EIT_Acquisition_Session_Coordinator.ImpedanceFrameObservation_Payload", "EIT_Acquisition_Session_Coordinator.PreparationDecisionIntent_Payload", "EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreState_Payload", "EIT_Acquisition_Session_Coordinator.MonitoringDecisionSnapshot_Payload", "EIT_Acquisition_Session_Coordinator.PreparationDecisionPreState_Payload", "EIT_Acquisition_Session_Coordinator.MonitoringDecisionNextState_Payload", "EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeRecovery_Payload", "EIT_Acquisition_Session_Coordinator.PreparationDecisionSnapshot_Payload", "EIT_Acquisition_Session_Coordinator.PreparationDecisionNextState_Payload", "EIT_Acquisition_Session_Coordinator.SessionStatusMonitoringState_Payload", "EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeCondition_Payload", "EIT_Acquisition_Session_Coordinator.SessionStatusPreparationState_Payload", "EIT_Acquisition_Session_Coordinator.MonitoringDecisionDisposition_Payload", "EIT_Acquisition_Session_Coordinator.ArbitrationDecisionDisposition_Payload", "EIT_Acquisition_Session_Coordinator.PreparationDecisionDisposition_Payload", "EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreparationState_Payload", "EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeMonitoringState_Payload", "EIT_Acquisition_Session_Coordinator.ArbitrationDecisionEffectiveIntent_Payload", "EIT_Acquisition_Session_Coordinator.EligibilityEnvelopePreparationState_Payload", "EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_P", "EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PS", "EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_P", "EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PS", "EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_P", "EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PS", "EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_P", "EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PS", "EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_P", "EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PS", "EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_P", "EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PS", "EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_P", "EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_P", "EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_P", "EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PS", "EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PS", "EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PS", "EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_P", "EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_P", "EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_P", "EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PS", "EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PS", "EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PS", "EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_P", "EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PS", "EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_P", "EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PS", "EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_P", "EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PS", "EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_P", "EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PS"))
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
        case "EIT_Acquisition_Session_Coordinator.FrameDelivery_Payload" => val r = parseEIT_Acquisition_Session_CoordinatorFrameDelivery_PayloadT(T); return r
        case "EIT_Acquisition_Session_Coordinator.DoctorRequest_Payload" => val r = parseEIT_Acquisition_Session_CoordinatorDoctorRequest_PayloadT(T); return r
        case "EIT_Acquisition_Session_Coordinator.SessionStatus_Payload" => val r = parseEIT_Acquisition_Session_CoordinatorSessionStatus_PayloadT(T); return r
        case "EIT_Acquisition_Session_Coordinator.BeltAssessment_Payload" => val r = parseEIT_Acquisition_Session_CoordinatorBeltAssessment_PayloadT(T); return r
        case "EIT_Acquisition_Session_Coordinator.MonitoringState_Payload" => val r = parseEIT_Acquisition_Session_CoordinatorMonitoringState_PayloadT(T); return r
        case "EIT_Acquisition_Session_Coordinator.BeltObservation_Payload" => val r = parseEIT_Acquisition_Session_CoordinatorBeltObservation_PayloadT(T); return r
        case "EIT_Acquisition_Session_Coordinator.PreparationState_Payload" => val r = parseEIT_Acquisition_Session_CoordinatorPreparationState_PayloadT(T); return r
        case "EIT_Acquisition_Session_Coordinator.BeltQualification_Payload" => val r = parseEIT_Acquisition_Session_CoordinatorBeltQualification_PayloadT(T); return r
        case "EIT_Acquisition_Session_Coordinator.TechnicianRequest_Payload" => val r = parseEIT_Acquisition_Session_CoordinatorTechnicianRequest_PayloadT(T); return r
        case "EIT_Acquisition_Session_Coordinator.AcquisitionCommand_Payload" => val r = parseEIT_Acquisition_Session_CoordinatorAcquisitionCommand_PayloadT(T); return r
        case "EIT_Acquisition_Session_Coordinator.SessionStatusNotice_Payload" => val r = parseEIT_Acquisition_Session_CoordinatorSessionStatusNotice_PayloadT(T); return r
        case "EIT_Acquisition_Session_Coordinator.ArbitrationDecision_Payload" => val r = parseEIT_Acquisition_Session_CoordinatorArbitrationDecision_PayloadT(T); return r
        case "EIT_Acquisition_Session_Coordinator.EligibilityEnvelope_Payload" => val r = parseEIT_Acquisition_Session_CoordinatorEligibilityEnvelope_PayloadT(T); return r
        case "EIT_Acquisition_Session_Coordinator.AcquisitionObservation_Payload" => val r = parseEIT_Acquisition_Session_CoordinatorAcquisitionObservation_PayloadT(T); return r
        case "EIT_Acquisition_Session_Coordinator.CalibrationObservation_Payload" => val r = parseEIT_Acquisition_Session_CoordinatorCalibrationObservation_PayloadT(T); return r
        case "EIT_Acquisition_Session_Coordinator.CalibrationQualification_Payload" => val r = parseEIT_Acquisition_Session_CoordinatorCalibrationQualification_PayloadT(T); return r
        case "EIT_Acquisition_Session_Coordinator.SessionStatusDisposition_Payload" => val r = parseEIT_Acquisition_Session_CoordinatorSessionStatusDisposition_PayloadT(T); return r
        case "EIT_Acquisition_Session_Coordinator.MonitoringDecisionIntent_Payload" => val r = parseEIT_Acquisition_Session_CoordinatorMonitoringDecisionIntent_PayloadT(T); return r
        case "EIT_Acquisition_Session_Coordinator.MonitoringDecisionNotice_Payload" => val r = parseEIT_Acquisition_Session_CoordinatorMonitoringDecisionNotice_PayloadT(T); return r
        case "EIT_Acquisition_Session_Coordinator.ImpedanceFrameObservation_Payload" => val r = parseEIT_Acquisition_Session_CoordinatorImpedanceFrameObservation_PayloadT(T); return r
        case "EIT_Acquisition_Session_Coordinator.PreparationDecisionIntent_Payload" => val r = parseEIT_Acquisition_Session_CoordinatorPreparationDecisionIntent_PayloadT(T); return r
        case "EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreState_Payload" => val r = parseEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreState_PayloadT(T); return r
        case "EIT_Acquisition_Session_Coordinator.MonitoringDecisionSnapshot_Payload" => val r = parseEIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot_PayloadT(T); return r
        case "EIT_Acquisition_Session_Coordinator.PreparationDecisionPreState_Payload" => val r = parseEIT_Acquisition_Session_CoordinatorPreparationDecisionPreState_PayloadT(T); return r
        case "EIT_Acquisition_Session_Coordinator.MonitoringDecisionNextState_Payload" => val r = parseEIT_Acquisition_Session_CoordinatorMonitoringDecisionNextState_PayloadT(T); return r
        case "EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeRecovery_Payload" => val r = parseEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeRecovery_PayloadT(T); return r
        case "EIT_Acquisition_Session_Coordinator.PreparationDecisionSnapshot_Payload" => val r = parseEIT_Acquisition_Session_CoordinatorPreparationDecisionSnapshot_PayloadT(T); return r
        case "EIT_Acquisition_Session_Coordinator.PreparationDecisionNextState_Payload" => val r = parseEIT_Acquisition_Session_CoordinatorPreparationDecisionNextState_PayloadT(T); return r
        case "EIT_Acquisition_Session_Coordinator.SessionStatusMonitoringState_Payload" => val r = parseEIT_Acquisition_Session_CoordinatorSessionStatusMonitoringState_PayloadT(T); return r
        case "EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeCondition_Payload" => val r = parseEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeCondition_PayloadT(T); return r
        case "EIT_Acquisition_Session_Coordinator.SessionStatusPreparationState_Payload" => val r = parseEIT_Acquisition_Session_CoordinatorSessionStatusPreparationState_PayloadT(T); return r
        case "EIT_Acquisition_Session_Coordinator.MonitoringDecisionDisposition_Payload" => val r = parseEIT_Acquisition_Session_CoordinatorMonitoringDecisionDisposition_PayloadT(T); return r
        case "EIT_Acquisition_Session_Coordinator.ArbitrationDecisionDisposition_Payload" => val r = parseEIT_Acquisition_Session_CoordinatorArbitrationDecisionDisposition_PayloadT(T); return r
        case "EIT_Acquisition_Session_Coordinator.PreparationDecisionDisposition_Payload" => val r = parseEIT_Acquisition_Session_CoordinatorPreparationDecisionDisposition_PayloadT(T); return r
        case "EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreparationState_Payload" => val r = parseEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreparationState_PayloadT(T); return r
        case "EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeMonitoringState_Payload" => val r = parseEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeMonitoringState_PayloadT(T); return r
        case "EIT_Acquisition_Session_Coordinator.ArbitrationDecisionEffectiveIntent_Payload" => val r = parseEIT_Acquisition_Session_CoordinatorArbitrationDecisionEffectiveIntent_PayloadT(T); return r
        case "EIT_Acquisition_Session_Coordinator.EligibilityEnvelopePreparationState_Payload" => val r = parseEIT_Acquisition_Session_CoordinatorEligibilityEnvelopePreparationState_PayloadT(T); return r
        case "EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_P" => val r = parseEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PS" => val r = parseEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PST(T); return r
        case "EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_P" => val r = parseEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PS" => val r = parseEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PST(T); return r
        case "EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_P" => val r = parseEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PS" => val r = parseEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PST(T); return r
        case "EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_P" => val r = parseEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PS" => val r = parseEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PST(T); return r
        case "EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_P" => val r = parseEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PS" => val r = parseEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PST(T); return r
        case "EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_P" => val r = parseEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PS" => val r = parseEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PST(T); return r
        case "EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_P" => val r = parseEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_P" => val r = parseEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_P" => val r = parseEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PS" => val r = parseEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PST(T); return r
        case "EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PS" => val r = parseEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PST(T); return r
        case "EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PS" => val r = parseEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PST(T); return r
        case "EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_P" => val r = parseEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_P" => val r = parseEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_P" => val r = parseEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PS" => val r = parseEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PST(T); return r
        case "EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PS" => val r = parseEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PST(T); return r
        case "EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PS" => val r = parseEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PST(T); return r
        case "EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_P" => val r = parseEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PS" => val r = parseEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PST(T); return r
        case "EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_P" => val r = parseEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PS" => val r = parseEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PST(T); return r
        case "EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_P" => val r = parseEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PS" => val r = parseEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PST(T); return r
        case "EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_P" => val r = parseEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PS" => val r = parseEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PST(T); return r
        case _ => val r = parseEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PST(T); return r
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

  def fromEIT_Acquisition_Session_CoordinatorBeltObservation_Payload(o: EIT_Acquisition_Session_Coordinator.BeltObservation_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorBeltObservation_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorBeltObservation_Payload(s: String): Either[EIT_Acquisition_Session_Coordinator.BeltObservation_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorBeltObservation_Payload(parser: Parser): EIT_Acquisition_Session_Coordinator.BeltObservation_Payload = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorBeltObservation_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorBeltObservation_Payload _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorBeltQualification_Payload(o: EIT_Acquisition_Session_Coordinator.BeltQualification_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorBeltQualification_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorBeltQualification_Payload(s: String): Either[EIT_Acquisition_Session_Coordinator.BeltQualification_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorBeltQualification_Payload(parser: Parser): EIT_Acquisition_Session_Coordinator.BeltQualification_Payload = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorBeltQualification_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorBeltQualification_Payload _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorCalibrationObservation_Payload(o: EIT_Acquisition_Session_Coordinator.CalibrationObservation_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorCalibrationObservation_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorCalibrationObservation_Payload(s: String): Either[EIT_Acquisition_Session_Coordinator.CalibrationObservation_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorCalibrationObservation_Payload(parser: Parser): EIT_Acquisition_Session_Coordinator.CalibrationObservation_Payload = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorCalibrationObservation_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorCalibrationObservation_Payload _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorCalibrationQualification_Payload(o: EIT_Acquisition_Session_Coordinator.CalibrationQualification_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorCalibrationQualification_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorCalibrationQualification_Payload(s: String): Either[EIT_Acquisition_Session_Coordinator.CalibrationQualification_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorCalibrationQualification_Payload(parser: Parser): EIT_Acquisition_Session_Coordinator.CalibrationQualification_Payload = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorCalibrationQualification_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorCalibrationQualification_Payload _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorAcquisitionObservation_Payload(o: EIT_Acquisition_Session_Coordinator.AcquisitionObservation_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorAcquisitionObservation_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorAcquisitionObservation_Payload(s: String): Either[EIT_Acquisition_Session_Coordinator.AcquisitionObservation_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorAcquisitionObservation_Payload(parser: Parser): EIT_Acquisition_Session_Coordinator.AcquisitionObservation_Payload = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorAcquisitionObservation_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorAcquisitionObservation_Payload _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorPreparationState_Payload(o: EIT_Acquisition_Session_Coordinator.PreparationState_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorPreparationState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorPreparationState_Payload(s: String): Either[EIT_Acquisition_Session_Coordinator.PreparationState_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorPreparationState_Payload(parser: Parser): EIT_Acquisition_Session_Coordinator.PreparationState_Payload = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorPreparationState_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorPreparationState_Payload _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorMonitoringState_Payload(o: EIT_Acquisition_Session_Coordinator.MonitoringState_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorMonitoringState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorMonitoringState_Payload(s: String): Either[EIT_Acquisition_Session_Coordinator.MonitoringState_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorMonitoringState_Payload(parser: Parser): EIT_Acquisition_Session_Coordinator.MonitoringState_Payload = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorMonitoringState_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorMonitoringState_Payload _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeCondition_Payload(o: EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeCondition_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeCondition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeCondition_Payload(s: String): Either[EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeCondition_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeCondition_Payload(parser: Parser): EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeCondition_Payload = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeCondition_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeCondition_Payload _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeRecovery_Payload(o: EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeRecovery_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeRecovery_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeRecovery_Payload(s: String): Either[EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeRecovery_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeRecovery_Payload(parser: Parser): EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeRecovery_Payload = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeRecovery_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeRecovery_Payload _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorEligibilityEnvelopePreparationState_Payload(o: EIT_Acquisition_Session_Coordinator.EligibilityEnvelopePreparationState_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorEligibilityEnvelopePreparationState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorEligibilityEnvelopePreparationState_Payload(s: String): Either[EIT_Acquisition_Session_Coordinator.EligibilityEnvelopePreparationState_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorEligibilityEnvelopePreparationState_Payload(parser: Parser): EIT_Acquisition_Session_Coordinator.EligibilityEnvelopePreparationState_Payload = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorEligibilityEnvelopePreparationState_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorEligibilityEnvelopePreparationState_Payload _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeMonitoringState_Payload(o: EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeMonitoringState_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeMonitoringState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeMonitoringState_Payload(s: String): Either[EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeMonitoringState_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeMonitoringState_Payload(parser: Parser): EIT_Acquisition_Session_Coordinator.EligibilityEnvelopeMonitoringState_Payload = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeMonitoringState_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorEligibilityEnvelopeMonitoringState_Payload _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorDoctorRequest_Payload(o: EIT_Acquisition_Session_Coordinator.DoctorRequest_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorDoctorRequest_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorDoctorRequest_Payload(s: String): Either[EIT_Acquisition_Session_Coordinator.DoctorRequest_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorDoctorRequest_Payload(parser: Parser): EIT_Acquisition_Session_Coordinator.DoctorRequest_Payload = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorDoctorRequest_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorDoctorRequest_Payload _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorTechnicianRequest_Payload(o: EIT_Acquisition_Session_Coordinator.TechnicianRequest_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorTechnicianRequest_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorTechnicianRequest_Payload(s: String): Either[EIT_Acquisition_Session_Coordinator.TechnicianRequest_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorTechnicianRequest_Payload(parser: Parser): EIT_Acquisition_Session_Coordinator.TechnicianRequest_Payload = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorTechnicianRequest_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorTechnicianRequest_Payload _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorArbitrationDecisionEffectiveIntent_Payload(o: EIT_Acquisition_Session_Coordinator.ArbitrationDecisionEffectiveIntent_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorArbitrationDecisionEffectiveIntent_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorArbitrationDecisionEffectiveIntent_Payload(s: String): Either[EIT_Acquisition_Session_Coordinator.ArbitrationDecisionEffectiveIntent_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorArbitrationDecisionEffectiveIntent_Payload(parser: Parser): EIT_Acquisition_Session_Coordinator.ArbitrationDecisionEffectiveIntent_Payload = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorArbitrationDecisionEffectiveIntent_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorArbitrationDecisionEffectiveIntent_Payload _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorArbitrationDecisionDisposition_Payload(o: EIT_Acquisition_Session_Coordinator.ArbitrationDecisionDisposition_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorArbitrationDecisionDisposition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorArbitrationDecisionDisposition_Payload(s: String): Either[EIT_Acquisition_Session_Coordinator.ArbitrationDecisionDisposition_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorArbitrationDecisionDisposition_Payload(parser: Parser): EIT_Acquisition_Session_Coordinator.ArbitrationDecisionDisposition_Payload = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorArbitrationDecisionDisposition_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorArbitrationDecisionDisposition_Payload _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorPreparationDecisionPreState_Payload(o: EIT_Acquisition_Session_Coordinator.PreparationDecisionPreState_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorPreparationDecisionPreState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorPreparationDecisionPreState_Payload(s: String): Either[EIT_Acquisition_Session_Coordinator.PreparationDecisionPreState_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorPreparationDecisionPreState_Payload(parser: Parser): EIT_Acquisition_Session_Coordinator.PreparationDecisionPreState_Payload = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorPreparationDecisionPreState_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorPreparationDecisionPreState_Payload _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorPreparationDecisionNextState_Payload(o: EIT_Acquisition_Session_Coordinator.PreparationDecisionNextState_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorPreparationDecisionNextState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorPreparationDecisionNextState_Payload(s: String): Either[EIT_Acquisition_Session_Coordinator.PreparationDecisionNextState_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorPreparationDecisionNextState_Payload(parser: Parser): EIT_Acquisition_Session_Coordinator.PreparationDecisionNextState_Payload = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorPreparationDecisionNextState_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorPreparationDecisionNextState_Payload _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorPreparationDecisionIntent_Payload(o: EIT_Acquisition_Session_Coordinator.PreparationDecisionIntent_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorPreparationDecisionIntent_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorPreparationDecisionIntent_Payload(s: String): Either[EIT_Acquisition_Session_Coordinator.PreparationDecisionIntent_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorPreparationDecisionIntent_Payload(parser: Parser): EIT_Acquisition_Session_Coordinator.PreparationDecisionIntent_Payload = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorPreparationDecisionIntent_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorPreparationDecisionIntent_Payload _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorPreparationDecisionDisposition_Payload(o: EIT_Acquisition_Session_Coordinator.PreparationDecisionDisposition_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorPreparationDecisionDisposition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorPreparationDecisionDisposition_Payload(s: String): Either[EIT_Acquisition_Session_Coordinator.PreparationDecisionDisposition_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorPreparationDecisionDisposition_Payload(parser: Parser): EIT_Acquisition_Session_Coordinator.PreparationDecisionDisposition_Payload = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorPreparationDecisionDisposition_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorPreparationDecisionDisposition_Payload _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreState_Payload(o: EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreState_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreState_Payload(s: String): Either[EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreState_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreState_Payload(parser: Parser): EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreState_Payload = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreState_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreState_Payload _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorMonitoringDecisionNextState_Payload(o: EIT_Acquisition_Session_Coordinator.MonitoringDecisionNextState_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorMonitoringDecisionNextState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorMonitoringDecisionNextState_Payload(s: String): Either[EIT_Acquisition_Session_Coordinator.MonitoringDecisionNextState_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorMonitoringDecisionNextState_Payload(parser: Parser): EIT_Acquisition_Session_Coordinator.MonitoringDecisionNextState_Payload = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorMonitoringDecisionNextState_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorMonitoringDecisionNextState_Payload _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorMonitoringDecisionIntent_Payload(o: EIT_Acquisition_Session_Coordinator.MonitoringDecisionIntent_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorMonitoringDecisionIntent_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorMonitoringDecisionIntent_Payload(s: String): Either[EIT_Acquisition_Session_Coordinator.MonitoringDecisionIntent_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorMonitoringDecisionIntent_Payload(parser: Parser): EIT_Acquisition_Session_Coordinator.MonitoringDecisionIntent_Payload = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorMonitoringDecisionIntent_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorMonitoringDecisionIntent_Payload _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorMonitoringDecisionDisposition_Payload(o: EIT_Acquisition_Session_Coordinator.MonitoringDecisionDisposition_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorMonitoringDecisionDisposition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorMonitoringDecisionDisposition_Payload(s: String): Either[EIT_Acquisition_Session_Coordinator.MonitoringDecisionDisposition_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorMonitoringDecisionDisposition_Payload(parser: Parser): EIT_Acquisition_Session_Coordinator.MonitoringDecisionDisposition_Payload = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorMonitoringDecisionDisposition_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorMonitoringDecisionDisposition_Payload _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorMonitoringDecisionNotice_Payload(o: EIT_Acquisition_Session_Coordinator.MonitoringDecisionNotice_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorMonitoringDecisionNotice_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorMonitoringDecisionNotice_Payload(s: String): Either[EIT_Acquisition_Session_Coordinator.MonitoringDecisionNotice_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorMonitoringDecisionNotice_Payload(parser: Parser): EIT_Acquisition_Session_Coordinator.MonitoringDecisionNotice_Payload = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorMonitoringDecisionNotice_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorMonitoringDecisionNotice_Payload _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreparationState_Payload(o: EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreparationState_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreparationState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreparationState_Payload(s: String): Either[EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreparationState_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreparationState_Payload(parser: Parser): EIT_Acquisition_Session_Coordinator.MonitoringDecisionPreparationState_Payload = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreparationState_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorMonitoringDecisionPreparationState_Payload _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorAcquisitionCommand_Payload(o: EIT_Acquisition_Session_Coordinator.AcquisitionCommand_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorAcquisitionCommand_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorAcquisitionCommand_Payload(s: String): Either[EIT_Acquisition_Session_Coordinator.AcquisitionCommand_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorAcquisitionCommand_Payload(parser: Parser): EIT_Acquisition_Session_Coordinator.AcquisitionCommand_Payload = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorAcquisitionCommand_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorAcquisitionCommand_Payload _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorImpedanceFrameObservation_Payload(o: EIT_Acquisition_Session_Coordinator.ImpedanceFrameObservation_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorImpedanceFrameObservation_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorImpedanceFrameObservation_Payload(s: String): Either[EIT_Acquisition_Session_Coordinator.ImpedanceFrameObservation_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorImpedanceFrameObservation_Payload(parser: Parser): EIT_Acquisition_Session_Coordinator.ImpedanceFrameObservation_Payload = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorImpedanceFrameObservation_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorImpedanceFrameObservation_Payload _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorFrameDelivery_Payload(o: EIT_Acquisition_Session_Coordinator.FrameDelivery_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorFrameDelivery_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorFrameDelivery_Payload(s: String): Either[EIT_Acquisition_Session_Coordinator.FrameDelivery_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorFrameDelivery_Payload(parser: Parser): EIT_Acquisition_Session_Coordinator.FrameDelivery_Payload = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorFrameDelivery_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorFrameDelivery_Payload _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorSessionStatusPreparationState_Payload(o: EIT_Acquisition_Session_Coordinator.SessionStatusPreparationState_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorSessionStatusPreparationState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorSessionStatusPreparationState_Payload(s: String): Either[EIT_Acquisition_Session_Coordinator.SessionStatusPreparationState_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorSessionStatusPreparationState_Payload(parser: Parser): EIT_Acquisition_Session_Coordinator.SessionStatusPreparationState_Payload = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorSessionStatusPreparationState_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorSessionStatusPreparationState_Payload _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorSessionStatusMonitoringState_Payload(o: EIT_Acquisition_Session_Coordinator.SessionStatusMonitoringState_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorSessionStatusMonitoringState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorSessionStatusMonitoringState_Payload(s: String): Either[EIT_Acquisition_Session_Coordinator.SessionStatusMonitoringState_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorSessionStatusMonitoringState_Payload(parser: Parser): EIT_Acquisition_Session_Coordinator.SessionStatusMonitoringState_Payload = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorSessionStatusMonitoringState_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorSessionStatusMonitoringState_Payload _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorSessionStatusDisposition_Payload(o: EIT_Acquisition_Session_Coordinator.SessionStatusDisposition_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorSessionStatusDisposition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorSessionStatusDisposition_Payload(s: String): Either[EIT_Acquisition_Session_Coordinator.SessionStatusDisposition_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorSessionStatusDisposition_Payload(parser: Parser): EIT_Acquisition_Session_Coordinator.SessionStatusDisposition_Payload = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorSessionStatusDisposition_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorSessionStatusDisposition_Payload _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorSessionStatusNotice_Payload(o: EIT_Acquisition_Session_Coordinator.SessionStatusNotice_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorSessionStatusNotice_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorSessionStatusNotice_Payload(s: String): Either[EIT_Acquisition_Session_Coordinator.SessionStatusNotice_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorSessionStatusNotice_Payload(parser: Parser): EIT_Acquisition_Session_Coordinator.SessionStatusNotice_Payload = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorSessionStatusNotice_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorSessionStatusNotice_Payload _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorBeltAssessment(o: EIT_Acquisition_Session_Coordinator.BeltAssessment, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorBeltAssessment(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorBeltAssessment(s: String): Either[EIT_Acquisition_Session_Coordinator.BeltAssessment, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorBeltAssessment(parser: Parser): EIT_Acquisition_Session_Coordinator.BeltAssessment = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorBeltAssessment()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorBeltAssessment _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorBeltAssessment_Payload(o: EIT_Acquisition_Session_Coordinator.BeltAssessment_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorBeltAssessment_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorBeltAssessment_Payload(s: String): Either[EIT_Acquisition_Session_Coordinator.BeltAssessment_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorBeltAssessment_Payload(parser: Parser): EIT_Acquisition_Session_Coordinator.BeltAssessment_Payload = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorBeltAssessment_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorBeltAssessment_Payload _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorEligibilityEnvelope(o: EIT_Acquisition_Session_Coordinator.EligibilityEnvelope, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorEligibilityEnvelope(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorEligibilityEnvelope(s: String): Either[EIT_Acquisition_Session_Coordinator.EligibilityEnvelope, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorEligibilityEnvelope(parser: Parser): EIT_Acquisition_Session_Coordinator.EligibilityEnvelope = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorEligibilityEnvelope()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorEligibilityEnvelope _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorEligibilityEnvelope_Payload(o: EIT_Acquisition_Session_Coordinator.EligibilityEnvelope_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorEligibilityEnvelope_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorEligibilityEnvelope_Payload(s: String): Either[EIT_Acquisition_Session_Coordinator.EligibilityEnvelope_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorEligibilityEnvelope_Payload(parser: Parser): EIT_Acquisition_Session_Coordinator.EligibilityEnvelope_Payload = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorEligibilityEnvelope_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorEligibilityEnvelope_Payload _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorArbitrationDecision(o: EIT_Acquisition_Session_Coordinator.ArbitrationDecision, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorArbitrationDecision(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorArbitrationDecision(s: String): Either[EIT_Acquisition_Session_Coordinator.ArbitrationDecision, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorArbitrationDecision(parser: Parser): EIT_Acquisition_Session_Coordinator.ArbitrationDecision = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorArbitrationDecision()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorArbitrationDecision _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorArbitrationDecision_Payload(o: EIT_Acquisition_Session_Coordinator.ArbitrationDecision_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorArbitrationDecision_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorArbitrationDecision_Payload(s: String): Either[EIT_Acquisition_Session_Coordinator.ArbitrationDecision_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorArbitrationDecision_Payload(parser: Parser): EIT_Acquisition_Session_Coordinator.ArbitrationDecision_Payload = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorArbitrationDecision_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorArbitrationDecision_Payload _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorPreparationDecisionSnapshot(o: EIT_Acquisition_Session_Coordinator.PreparationDecisionSnapshot, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorPreparationDecisionSnapshot(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorPreparationDecisionSnapshot(s: String): Either[EIT_Acquisition_Session_Coordinator.PreparationDecisionSnapshot, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorPreparationDecisionSnapshot(parser: Parser): EIT_Acquisition_Session_Coordinator.PreparationDecisionSnapshot = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorPreparationDecisionSnapshot()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorPreparationDecisionSnapshot _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorPreparationDecisionSnapshot_Payload(o: EIT_Acquisition_Session_Coordinator.PreparationDecisionSnapshot_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorPreparationDecisionSnapshot_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorPreparationDecisionSnapshot_Payload(s: String): Either[EIT_Acquisition_Session_Coordinator.PreparationDecisionSnapshot_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorPreparationDecisionSnapshot_Payload(parser: Parser): EIT_Acquisition_Session_Coordinator.PreparationDecisionSnapshot_Payload = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorPreparationDecisionSnapshot_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorPreparationDecisionSnapshot_Payload _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot(o: EIT_Acquisition_Session_Coordinator.MonitoringDecisionSnapshot, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot(s: String): Either[EIT_Acquisition_Session_Coordinator.MonitoringDecisionSnapshot, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot(parser: Parser): EIT_Acquisition_Session_Coordinator.MonitoringDecisionSnapshot = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot_Payload(o: EIT_Acquisition_Session_Coordinator.MonitoringDecisionSnapshot_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot_Payload(s: String): Either[EIT_Acquisition_Session_Coordinator.MonitoringDecisionSnapshot_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot_Payload(parser: Parser): EIT_Acquisition_Session_Coordinator.MonitoringDecisionSnapshot_Payload = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorMonitoringDecisionSnapshot_Payload _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorSessionStatus(o: EIT_Acquisition_Session_Coordinator.SessionStatus, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorSessionStatus(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorSessionStatus(s: String): Either[EIT_Acquisition_Session_Coordinator.SessionStatus, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorSessionStatus(parser: Parser): EIT_Acquisition_Session_Coordinator.SessionStatus = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorSessionStatus()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorSessionStatus _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorSessionStatus_Payload(o: EIT_Acquisition_Session_Coordinator.SessionStatus_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorSessionStatus_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorSessionStatus_Payload(s: String): Either[EIT_Acquisition_Session_Coordinator.SessionStatus_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorSessionStatus_Payload(parser: Parser): EIT_Acquisition_Session_Coordinator.SessionStatus_Payload = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorSessionStatus_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorSessionStatus_Payload _)
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

  def fromEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container(o: EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container(s: String): Either[EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container(parser: Parser): EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_P(o: EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_P(s: String): Either[EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_P, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_P(parser: Parser): EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_P = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_P()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PS(o: EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PS(s: String): Either[EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PS(parser: Parser): EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PS = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PreState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container(o: EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container(s: String): Either[EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container(parser: Parser): EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_P(o: EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_P(s: String): Either[EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_P, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_P(parser: Parser): EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_P = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_P()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PS(o: EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PS(s: String): Either[EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PS(parser: Parser): EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PS = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorBeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_PostState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container(o: EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container(s: String): Either[EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container(parser: Parser): EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_P(o: EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_P(s: String): Either[EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_P, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_P(parser: Parser): EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_P = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_P()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PS(o: EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PS(s: String): Either[EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PS(parser: Parser): EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PS = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PreState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container(o: EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container(s: String): Either[EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container(parser: Parser): EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_P(o: EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_P(s: String): Either[EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_P, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_P(parser: Parser): EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_P = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_P()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PS(o: EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PS(s: String): Either[EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PS(parser: Parser): EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PS = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorCalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_PostState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container(o: EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container(s: String): Either[EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container(parser: Parser): EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_P(o: EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_P(s: String): Either[EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_P, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_P(parser: Parser): EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_P = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_P()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PS(o: EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PS(s: String): Either[EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PS(parser: Parser): EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PS = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PreState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container(o: EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container(s: String): Either[EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container(parser: Parser): EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_P(o: EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_P(s: String): Either[EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_P, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_P(parser: Parser): EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_P = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_P()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PS(o: EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PS(s: String): Either[EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PS(parser: Parser): EIT_Acquisition_Session_Coordinator.AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PS = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorAcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_PostState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container(o: EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container(s: String): Either[EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container(parser: Parser): EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_P(o: EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_P(s: String): Either[EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_P, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_P(parser: Parser): EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_P = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_P()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PS(o: EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PS(s: String): Either[EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PS(parser: Parser): EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PS = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PreState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container(o: EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container(s: String): Either[EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container(parser: Parser): EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_P(o: EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_P(s: String): Either[EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_P, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_P(parser: Parser): EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_P = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_P()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PS(o: EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PS(s: String): Either[EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PS(parser: Parser): EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PS = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorRequestArbiter_acquisitionCoordinationProcess_requestArbiter_PostState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container(o: EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container(s: String): Either[EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container(parser: Parser): EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_P(o: EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_P(s: String): Either[EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_P, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_P(parser: Parser): EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_P = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_P()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PS(o: EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PS(s: String): Either[EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PS(parser: Parser): EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PS = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PreState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container(o: EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container(s: String): Either[EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container(parser: Parser): EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_P(o: EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_P(s: String): Either[EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_P, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_P(parser: Parser): EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_P = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_P()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PS(o: EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PS(s: String): Either[EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PS(parser: Parser): EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PS = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorPreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_PostState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container(o: EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container(s: String): Either[EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container(parser: Parser): EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_P(o: EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_P(s: String): Either[EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_P, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_P(parser: Parser): EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_P = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_P()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PS(o: EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PS(s: String): Either[EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PS(parser: Parser): EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PS = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PreState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container(o: EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container(s: String): Either[EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container(parser: Parser): EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_P(o: EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_P(s: String): Either[EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_P, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_P(parser: Parser): EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_P = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_P()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PS(o: EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PS(s: String): Either[EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PS(parser: Parser): EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PS = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorMonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_PostState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container(o: EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container(s: String): Either[EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container(parser: Parser): EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_P(o: EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_P(s: String): Either[EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_P, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_P(parser: Parser): EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_P = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_P()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PS(o: EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PS(s: String): Either[EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PS(parser: Parser): EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PS = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PreState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container(o: EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container(s: String): Either[EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container(parser: Parser): EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_P(o: EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_P(s: String): Either[EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_P, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_P(parser: Parser): EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_P = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_P()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PS(o: EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PS(s: String): Either[EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PS(parser: Parser): EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PS = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorAcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_PostState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container(o: EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container(s: String): Either[EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container(parser: Parser): EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_P(o: EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_P(s: String): Either[EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_P, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_P(parser: Parser): EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_P = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_P()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PS(o: EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PS(s: String): Either[EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PS(parser: Parser): EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PS = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PreState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container(o: EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container(s: String): Either[EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container(parser: Parser): EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_P(o: EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_P(s: String): Either[EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_P, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_P(parser: Parser): EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_P = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_P()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PS(o: EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PS(s: String): Either[EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PS(parser: Parser): EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PS = {
      val r = parser.parseEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Acquisition_Session_CoordinatorSessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_PostState_Container_PS _)
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