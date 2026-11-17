// #Sireum
// @formatter:off

// This file is auto-generated from BatteryCapacityBand.scala, BatteryCheck.scala, BatteryAssessment.scala, LifecycleContext.scala, ChargeContextQualification.scala, BatteryReadinessAdvice.scala, ChargerConnection.scala, ChargeActivity.scala, ChargerPathQualification.scala, ChargeSessionState.scala, ChargeEligibilityEnvelope.scala, ChargeRequest.scala, ChargeDecision.scala, SnapshotPreSessionState.scala, SnapshotNextSessionState.scala, SnapshotChargeDisposition.scala, ChargeReason.scala, ChargePermission.scala, FlightControlBatteryNotice.scala, PilotSessionState.scala, PilotChargeDisposition.scala, PilotAdvisory.scala, ChargeSessionSnapshot.scala, PilotBatteryStatus.scala, Base_Types.scala, BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_Containers.scala, ChargeContextQualifier_supervisorProcess_chargeContextQualifier_Containers.scala, ChargerPathQualifier_supervisorProcess_chargerPathQualifier_Containers.scala, ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_Containers.scala, ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_Containers.scala, ChargeSessionController_supervisorProcess_chargeSessionController_Containers.scala, FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_Containers.scala, PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package battery_evidence_charge_qualification_supervisor

import org.sireum._
import org.sireum.Json.Printer._

object JSON {

  object Printer {

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBandType(o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryCapacityBand.Type): ST = {
      val value: String = o match {
        case Battery_Evidence_Charge_Qualification_Supervisor.BatteryCapacityBand.LOW => "LOW"
        case Battery_Evidence_Charge_Qualification_Supervisor.BatteryCapacityBand.USABLE => "USABLE"
      }
      return printObject(ISZ(
        ("type", printString("Battery_Evidence_Charge_Qualification_Supervisor.BatteryCapacityBand")),
        ("value", printString(value))
      ))
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBand_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryCapacityBand_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Evidence_Charge_Qualification_Supervisor.BatteryCapacityBand_Payload""""),
        ("value", printBattery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBandType(o.value))
      ))
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorBatteryCheckType(o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryCheck.Type): ST = {
      val value: String = o match {
        case Battery_Evidence_Charge_Qualification_Supervisor.BatteryCheck.INVALID => "INVALID"
        case Battery_Evidence_Charge_Qualification_Supervisor.BatteryCheck.VALID => "VALID"
      }
      return printObject(ISZ(
        ("type", printString("Battery_Evidence_Charge_Qualification_Supervisor.BatteryCheck")),
        ("value", printString(value))
      ))
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorBatteryCheck_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryCheck_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Evidence_Charge_Qualification_Supervisor.BatteryCheck_Payload""""),
        ("value", printBattery_Evidence_Charge_Qualification_SupervisorBatteryCheckType(o.value))
      ))
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType(o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.Type): ST = {
      val value: String = o match {
        case Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.UNAVAILABLE => "UNAVAILABLE"
        case Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.LOW => "LOW"
        case Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.ADEQUATE => "ADEQUATE"
      }
      return printObject(ISZ(
        ("type", printString("Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment")),
        ("value", printString(value))
      ))
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessment_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment_Payload""""),
        ("value", printBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType(o.value))
      ))
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorLifecycleContextType(o: Battery_Evidence_Charge_Qualification_Supervisor.LifecycleContext.Type): ST = {
      val value: String = o match {
        case Battery_Evidence_Charge_Qualification_Supervisor.LifecycleContext.OFF => "OFF"
        case Battery_Evidence_Charge_Qualification_Supervisor.LifecycleContext.STANDBY => "STANDBY"
        case Battery_Evidence_Charge_Qualification_Supervisor.LifecycleContext.CHARGING => "CHARGING"
        case Battery_Evidence_Charge_Qualification_Supervisor.LifecycleContext.READY => "READY"
        case Battery_Evidence_Charge_Qualification_Supervisor.LifecycleContext.FLYING => "FLYING"
      }
      return printObject(ISZ(
        ("type", printString("Battery_Evidence_Charge_Qualification_Supervisor.LifecycleContext")),
        ("value", printString(value))
      ))
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorLifecycleContext_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.LifecycleContext_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Evidence_Charge_Qualification_Supervisor.LifecycleContext_Payload""""),
        ("value", printBattery_Evidence_Charge_Qualification_SupervisorLifecycleContextType(o.value))
      ))
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualificationType(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification.Type): ST = {
      val value: String = o match {
        case Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification.BLOCKED_EVIDENCE => "BLOCKED_EVIDENCE"
        case Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification.BLOCKED_CONTEXT => "BLOCKED_CONTEXT"
        case Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification.ELIGIBLE => "ELIGIBLE"
      }
      return printObject(ISZ(
        ("type", printString("Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification")),
        ("value", printString(value))
      ))
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualification_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification_Payload""""),
        ("value", printBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualificationType(o.value))
      ))
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdviceType(o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryReadinessAdvice.Type): ST = {
      val value: String = o match {
        case Battery_Evidence_Charge_Qualification_Supervisor.BatteryReadinessAdvice.UNAVAILABLE => "UNAVAILABLE"
        case Battery_Evidence_Charge_Qualification_Supervisor.BatteryReadinessAdvice.NOT_READY => "NOT_READY"
        case Battery_Evidence_Charge_Qualification_Supervisor.BatteryReadinessAdvice.READY => "READY"
      }
      return printObject(ISZ(
        ("type", printString("Battery_Evidence_Charge_Qualification_Supervisor.BatteryReadinessAdvice")),
        ("value", printString(value))
      ))
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdvice_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryReadinessAdvice_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Evidence_Charge_Qualification_Supervisor.BatteryReadinessAdvice_Payload""""),
        ("value", printBattery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdviceType(o.value))
      ))
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorChargerConnectionType(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargerConnection.Type): ST = {
      val value: String = o match {
        case Battery_Evidence_Charge_Qualification_Supervisor.ChargerConnection.DISCONNECTED => "DISCONNECTED"
        case Battery_Evidence_Charge_Qualification_Supervisor.ChargerConnection.CONNECTED => "CONNECTED"
      }
      return printObject(ISZ(
        ("type", printString("Battery_Evidence_Charge_Qualification_Supervisor.ChargerConnection")),
        ("value", printString(value))
      ))
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorChargerConnection_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargerConnection_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Evidence_Charge_Qualification_Supervisor.ChargerConnection_Payload""""),
        ("value", printBattery_Evidence_Charge_Qualification_SupervisorChargerConnectionType(o.value))
      ))
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorChargeActivityType(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeActivity.Type): ST = {
      val value: String = o match {
        case Battery_Evidence_Charge_Qualification_Supervisor.ChargeActivity.INACTIVE => "INACTIVE"
        case Battery_Evidence_Charge_Qualification_Supervisor.ChargeActivity.ACTIVE => "ACTIVE"
      }
      return printObject(ISZ(
        ("type", printString("Battery_Evidence_Charge_Qualification_Supervisor.ChargeActivity")),
        ("value", printString(value))
      ))
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorChargeActivity_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeActivity_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Evidence_Charge_Qualification_Supervisor.ChargeActivity_Payload""""),
        ("value", printBattery_Evidence_Charge_Qualification_SupervisorChargeActivityType(o.value))
      ))
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification.Type): ST = {
      val value: String = o match {
        case Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification.UNAVAILABLE => "UNAVAILABLE"
        case Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification.READY => "READY"
        case Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification.ACTIVE => "ACTIVE"
      }
      return printObject(ISZ(
        ("type", printString("Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification")),
        ("value", printString(value))
      ))
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualification_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification_Payload""""),
        ("value", printBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType(o.value))
      ))
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorChargeSessionStateType(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState.Type): ST = {
      val value: String = o match {
        case Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState.IDLE => "IDLE"
        case Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState.ENABLED => "ENABLED"
        case Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState.SUSPENDED => "SUSPENDED"
      }
      return printObject(ISZ(
        ("type", printString("Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState")),
        ("value", printString(value))
      ))
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorChargeSessionState_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState_Payload""""),
        ("value", printBattery_Evidence_Charge_Qualification_SupervisorChargeSessionStateType(o.value))
      ))
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelopeType(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope.Type): ST = {
      val value: String = o match {
        case Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope.ELIGIBLE => "ELIGIBLE"
        case Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope.BLOCKED_EVIDENCE => "BLOCKED_EVIDENCE"
        case Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope.RECOVER_EVIDENCE => "RECOVER_EVIDENCE"
        case Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope.BLOCKED_CHARGER => "BLOCKED_CHARGER"
        case Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope.RECOVER_CHARGER => "RECOVER_CHARGER"
        case Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope.BLOCKED_CONTEXT => "BLOCKED_CONTEXT"
        case Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope.RECOVER_CONTEXT => "RECOVER_CONTEXT"
      }
      return printObject(ISZ(
        ("type", printString("Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope")),
        ("value", printString(value))
      ))
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelope_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope_Payload""""),
        ("value", printBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelopeType(o.value))
      ))
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorChargeRequestType(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeRequest.Type): ST = {
      val value: String = o match {
        case Battery_Evidence_Charge_Qualification_Supervisor.ChargeRequest.NO_REQUEST => "NO_REQUEST"
        case Battery_Evidence_Charge_Qualification_Supervisor.ChargeRequest.REQUEST_CHARGE => "REQUEST_CHARGE"
        case Battery_Evidence_Charge_Qualification_Supervisor.ChargeRequest.CANCEL_CHARGE => "CANCEL_CHARGE"
      }
      return printObject(ISZ(
        ("type", printString("Battery_Evidence_Charge_Qualification_Supervisor.ChargeRequest")),
        ("value", printString(value))
      ))
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorChargeRequest_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeRequest_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Evidence_Charge_Qualification_Supervisor.ChargeRequest_Payload""""),
        ("value", printBattery_Evidence_Charge_Qualification_SupervisorChargeRequestType(o.value))
      ))
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorChargeDecisionType(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.Type): ST = {
      val value: String = o match {
        case Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.NO_CHANGE => "NO_CHANGE"
        case Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.AUTHORIZE => "AUTHORIZE"
        case Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.TERMINATE => "TERMINATE"
        case Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.RECOVER_EVIDENCE => "RECOVER_EVIDENCE"
        case Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.RECOVER_CHARGER => "RECOVER_CHARGER"
        case Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.RECOVER_CONTEXT => "RECOVER_CONTEXT"
        case Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.REJECT_EVIDENCE => "REJECT_EVIDENCE"
        case Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.REJECT_CHARGER => "REJECT_CHARGER"
        case Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.REJECT_CONTEXT => "REJECT_CONTEXT"
      }
      return printObject(ISZ(
        ("type", printString("Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision")),
        ("value", printString(value))
      ))
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorChargeDecision_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision_Payload""""),
        ("value", printBattery_Evidence_Charge_Qualification_SupervisorChargeDecisionType(o.value))
      ))
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionStateType(o: Battery_Evidence_Charge_Qualification_Supervisor.SnapshotPreSessionState.Type): ST = {
      val value: String = o match {
        case Battery_Evidence_Charge_Qualification_Supervisor.SnapshotPreSessionState.IDLE => "IDLE"
        case Battery_Evidence_Charge_Qualification_Supervisor.SnapshotPreSessionState.ENABLED => "ENABLED"
        case Battery_Evidence_Charge_Qualification_Supervisor.SnapshotPreSessionState.SUSPENDED => "SUSPENDED"
      }
      return printObject(ISZ(
        ("type", printString("Battery_Evidence_Charge_Qualification_Supervisor.SnapshotPreSessionState")),
        ("value", printString(value))
      ))
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionState_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.SnapshotPreSessionState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Evidence_Charge_Qualification_Supervisor.SnapshotPreSessionState_Payload""""),
        ("value", printBattery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionStateType(o.value))
      ))
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionStateType(o: Battery_Evidence_Charge_Qualification_Supervisor.SnapshotNextSessionState.Type): ST = {
      val value: String = o match {
        case Battery_Evidence_Charge_Qualification_Supervisor.SnapshotNextSessionState.IDLE => "IDLE"
        case Battery_Evidence_Charge_Qualification_Supervisor.SnapshotNextSessionState.ENABLED => "ENABLED"
        case Battery_Evidence_Charge_Qualification_Supervisor.SnapshotNextSessionState.SUSPENDED => "SUSPENDED"
      }
      return printObject(ISZ(
        ("type", printString("Battery_Evidence_Charge_Qualification_Supervisor.SnapshotNextSessionState")),
        ("value", printString(value))
      ))
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionState_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.SnapshotNextSessionState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Evidence_Charge_Qualification_Supervisor.SnapshotNextSessionState_Payload""""),
        ("value", printBattery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionStateType(o.value))
      ))
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDispositionType(o: Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition.Type): ST = {
      val value: String = o match {
        case Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition.NO_CHANGE => "NO_CHANGE"
        case Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition.ACCEPTED => "ACCEPTED"
        case Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition.REJECTED => "REJECTED"
        case Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition.RECOVERY_APPLIED => "RECOVERY_APPLIED"
      }
      return printObject(ISZ(
        ("type", printString("Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition")),
        ("value", printString(value))
      ))
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDisposition_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition_Payload""""),
        ("value", printBattery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDispositionType(o.value))
      ))
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorChargeReasonType(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason.Type): ST = {
      val value: String = o match {
        case Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason.NONE => "NONE"
        case Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason.CANCELLED => "CANCELLED"
        case Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason.EVIDENCE_UNAVAILABLE => "EVIDENCE_UNAVAILABLE"
        case Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason.CHARGER_UNAVAILABLE => "CHARGER_UNAVAILABLE"
        case Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason.CONTEXT_INELIGIBLE => "CONTEXT_INELIGIBLE"
      }
      return printObject(ISZ(
        ("type", printString("Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason")),
        ("value", printString(value))
      ))
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorChargeReason_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason_Payload""""),
        ("value", printBattery_Evidence_Charge_Qualification_SupervisorChargeReasonType(o.value))
      ))
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorChargePermissionType(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargePermission.Type): ST = {
      val value: String = o match {
        case Battery_Evidence_Charge_Qualification_Supervisor.ChargePermission.DISABLED => "DISABLED"
        case Battery_Evidence_Charge_Qualification_Supervisor.ChargePermission.ENABLED => "ENABLED"
      }
      return printObject(ISZ(
        ("type", printString("Battery_Evidence_Charge_Qualification_Supervisor.ChargePermission")),
        ("value", printString(value))
      ))
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorChargePermission_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargePermission_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Evidence_Charge_Qualification_Supervisor.ChargePermission_Payload""""),
        ("value", printBattery_Evidence_Charge_Qualification_SupervisorChargePermissionType(o.value))
      ))
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticeType(o: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice.Type): ST = {
      val value: String = o match {
        case Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice.CLEAR => "CLEAR"
        case Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice.LOW_BATTERY => "LOW_BATTERY"
        case Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice.LOW_IN_FLIGHT_CONTEXT => "LOW_IN_FLIGHT_CONTEXT"
        case Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice.EVIDENCE_UNAVAILABLE => "EVIDENCE_UNAVAILABLE"
      }
      return printObject(ISZ(
        ("type", printString("Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice")),
        ("value", printString(value))
      ))
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNotice_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice_Payload""""),
        ("value", printBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticeType(o.value))
      ))
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorPilotSessionStateType(o: Battery_Evidence_Charge_Qualification_Supervisor.PilotSessionState.Type): ST = {
      val value: String = o match {
        case Battery_Evidence_Charge_Qualification_Supervisor.PilotSessionState.IDLE => "IDLE"
        case Battery_Evidence_Charge_Qualification_Supervisor.PilotSessionState.ENABLED => "ENABLED"
        case Battery_Evidence_Charge_Qualification_Supervisor.PilotSessionState.SUSPENDED => "SUSPENDED"
      }
      return printObject(ISZ(
        ("type", printString("Battery_Evidence_Charge_Qualification_Supervisor.PilotSessionState")),
        ("value", printString(value))
      ))
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorPilotSessionState_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.PilotSessionState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Evidence_Charge_Qualification_Supervisor.PilotSessionState_Payload""""),
        ("value", printBattery_Evidence_Charge_Qualification_SupervisorPilotSessionStateType(o.value))
      ))
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorPilotChargeDispositionType(o: Battery_Evidence_Charge_Qualification_Supervisor.PilotChargeDisposition.Type): ST = {
      val value: String = o match {
        case Battery_Evidence_Charge_Qualification_Supervisor.PilotChargeDisposition.NO_CHANGE => "NO_CHANGE"
        case Battery_Evidence_Charge_Qualification_Supervisor.PilotChargeDisposition.ACCEPTED => "ACCEPTED"
        case Battery_Evidence_Charge_Qualification_Supervisor.PilotChargeDisposition.REJECTED => "REJECTED"
        case Battery_Evidence_Charge_Qualification_Supervisor.PilotChargeDisposition.RECOVERY_APPLIED => "RECOVERY_APPLIED"
      }
      return printObject(ISZ(
        ("type", printString("Battery_Evidence_Charge_Qualification_Supervisor.PilotChargeDisposition")),
        ("value", printString(value))
      ))
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorPilotChargeDisposition_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.PilotChargeDisposition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Evidence_Charge_Qualification_Supervisor.PilotChargeDisposition_Payload""""),
        ("value", printBattery_Evidence_Charge_Qualification_SupervisorPilotChargeDispositionType(o.value))
      ))
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorPilotAdvisoryType(o: Battery_Evidence_Charge_Qualification_Supervisor.PilotAdvisory.Type): ST = {
      val value: String = o match {
        case Battery_Evidence_Charge_Qualification_Supervisor.PilotAdvisory.NONE => "NONE"
        case Battery_Evidence_Charge_Qualification_Supervisor.PilotAdvisory.EVIDENCE_UNAVAILABLE => "EVIDENCE_UNAVAILABLE"
        case Battery_Evidence_Charge_Qualification_Supervisor.PilotAdvisory.CHARGER_UNAVAILABLE => "CHARGER_UNAVAILABLE"
        case Battery_Evidence_Charge_Qualification_Supervisor.PilotAdvisory.CONTEXT_INELIGIBLE => "CONTEXT_INELIGIBLE"
        case Battery_Evidence_Charge_Qualification_Supervisor.PilotAdvisory.ACTIVITY_WITHOUT_PERMISSION => "ACTIVITY_WITHOUT_PERMISSION"
        case Battery_Evidence_Charge_Qualification_Supervisor.PilotAdvisory.CHARGE_RECOMMENDED => "CHARGE_RECOMMENDED"
        case Battery_Evidence_Charge_Qualification_Supervisor.PilotAdvisory.REQUEST_REJECTED => "REQUEST_REJECTED"
      }
      return printObject(ISZ(
        ("type", printString("Battery_Evidence_Charge_Qualification_Supervisor.PilotAdvisory")),
        ("value", printString(value))
      ))
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorPilotAdvisory_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.PilotAdvisory_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Evidence_Charge_Qualification_Supervisor.PilotAdvisory_Payload""""),
        ("value", printBattery_Evidence_Charge_Qualification_SupervisorPilotAdvisoryType(o.value))
      ))
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionSnapshot): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionSnapshot""""),
        ("preSession", printBattery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionStateType(o.preSession)),
        ("nextSession", printBattery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionStateType(o.nextSession)),
        ("disposition", printBattery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDispositionType(o.disposition)),
        ("reason", printBattery_Evidence_Charge_Qualification_SupervisorChargeReasonType(o.reason))
      ))
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionSnapshot_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionSnapshot_Payload""""),
        ("value", printBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot(o.value))
      ))
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus(o: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatus): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatus""""),
        ("batteryAssessment", printBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType(o.batteryAssessment)),
        ("chargerPathQualification", printBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType(o.chargerPathQualification)),
        ("session", printBattery_Evidence_Charge_Qualification_SupervisorPilotSessionStateType(o.session)),
        ("disposition", printBattery_Evidence_Charge_Qualification_SupervisorPilotChargeDispositionType(o.disposition)),
        ("advisory", printBattery_Evidence_Charge_Qualification_SupervisorPilotAdvisoryType(o.advisory))
      ))
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatus_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatus_Payload""""),
        ("value", printBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus(o.value))
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

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container(o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container): ST = {
      o match {
        case o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P => return printBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS => return printBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS(o)
      }
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P(o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P""""),
        ("api_batteryCapacity", printBattery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBandType(o.api_batteryCapacity)),
        ("api_batteryCheck", printBattery_Evidence_Charge_Qualification_SupervisorBatteryCheckType(o.api_batteryCheck))
      ))
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS(o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS""""),
        ("api_batteryCapacity", printBattery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBandType(o.api_batteryCapacity)),
        ("api_batteryCheck", printBattery_Evidence_Charge_Qualification_SupervisorBatteryCheckType(o.api_batteryCheck))
      ))
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container(o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container): ST = {
      o match {
        case o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P => return printBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS => return printBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS(o)
      }
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P(o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P""""),
        ("api_batteryAssessment", printBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType(o.api_batteryAssessment))
      ))
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS(o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS""""),
        ("api_batteryAssessment", printBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType(o.api_batteryAssessment))
      ))
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container): ST = {
      o match {
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P => return printBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS => return printBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS(o)
      }
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P""""),
        ("api_batteryAssessment", printBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType(o.api_batteryAssessment)),
        ("api_lifecycleContext", printBattery_Evidence_Charge_Qualification_SupervisorLifecycleContextType(o.api_lifecycleContext))
      ))
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS""""),
        ("api_batteryAssessment", printBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType(o.api_batteryAssessment)),
        ("api_lifecycleContext", printBattery_Evidence_Charge_Qualification_SupervisorLifecycleContextType(o.api_lifecycleContext))
      ))
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container): ST = {
      o match {
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P => return printBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS => return printBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS(o)
      }
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P""""),
        ("api_batteryReadinessAdvice", printBattery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdviceType(o.api_batteryReadinessAdvice)),
        ("api_chargeContextQualification", printBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualificationType(o.api_chargeContextQualification))
      ))
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS""""),
        ("api_batteryReadinessAdvice", printBattery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdviceType(o.api_batteryReadinessAdvice)),
        ("api_chargeContextQualification", printBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualificationType(o.api_chargeContextQualification))
      ))
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container): ST = {
      o match {
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P => return printBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS => return printBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS(o)
      }
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P""""),
        ("api_chargeActivity", printBattery_Evidence_Charge_Qualification_SupervisorChargeActivityType(o.api_chargeActivity)),
        ("api_chargerConnection", printBattery_Evidence_Charge_Qualification_SupervisorChargerConnectionType(o.api_chargerConnection))
      ))
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS""""),
        ("api_chargeActivity", printBattery_Evidence_Charge_Qualification_SupervisorChargeActivityType(o.api_chargeActivity)),
        ("api_chargerConnection", printBattery_Evidence_Charge_Qualification_SupervisorChargerConnectionType(o.api_chargerConnection))
      ))
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container): ST = {
      o match {
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P => return printBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS => return printBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS(o)
      }
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P""""),
        ("api_chargerPathQualification", printBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType(o.api_chargerPathQualification))
      ))
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS""""),
        ("api_chargerPathQualification", printBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType(o.api_chargerPathQualification))
      ))
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container): ST = {
      o match {
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P => return printBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS => return printBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS(o)
      }
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P""""),
        ("api_chargeContextQualification", printBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualificationType(o.api_chargeContextQualification)),
        ("api_chargerPathQualification", printBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType(o.api_chargerPathQualification)),
        ("api_currentChargeSession", printBattery_Evidence_Charge_Qualification_SupervisorChargeSessionStateType(o.api_currentChargeSession))
      ))
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS""""),
        ("api_chargeContextQualification", printBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualificationType(o.api_chargeContextQualification)),
        ("api_chargerPathQualification", printBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType(o.api_chargerPathQualification)),
        ("api_currentChargeSession", printBattery_Evidence_Charge_Qualification_SupervisorChargeSessionStateType(o.api_currentChargeSession))
      ))
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container): ST = {
      o match {
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P => return printBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS => return printBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS(o)
      }
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P""""),
        ("api_chargeEligibilityEnvelope", printBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelopeType(o.api_chargeEligibilityEnvelope))
      ))
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS""""),
        ("api_chargeEligibilityEnvelope", printBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelopeType(o.api_chargeEligibilityEnvelope))
      ))
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container): ST = {
      o match {
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P => return printBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS => return printBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS(o)
      }
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P""""),
        ("api_chargeEligibilityEnvelope", printBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelopeType(o.api_chargeEligibilityEnvelope)),
        ("api_chargeRequest", printBattery_Evidence_Charge_Qualification_SupervisorChargeRequestType(o.api_chargeRequest))
      ))
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS""""),
        ("api_chargeEligibilityEnvelope", printBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelopeType(o.api_chargeEligibilityEnvelope)),
        ("api_chargeRequest", printBattery_Evidence_Charge_Qualification_SupervisorChargeRequestType(o.api_chargeRequest))
      ))
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container): ST = {
      o match {
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P => return printBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS => return printBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS(o)
      }
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P""""),
        ("api_chargeDecision", printBattery_Evidence_Charge_Qualification_SupervisorChargeDecisionType(o.api_chargeDecision))
      ))
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS""""),
        ("api_chargeDecision", printBattery_Evidence_Charge_Qualification_SupervisorChargeDecisionType(o.api_chargeDecision))
      ))
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container): ST = {
      o match {
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P => return printBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS => return printBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS(o)
      }
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P""""),
        ("api_chargeDecision", printBattery_Evidence_Charge_Qualification_SupervisorChargeDecisionType(o.api_chargeDecision))
      ))
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS""""),
        ("api_chargeDecision", printBattery_Evidence_Charge_Qualification_SupervisorChargeDecisionType(o.api_chargeDecision))
      ))
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container): ST = {
      o match {
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P => return printBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS => return printBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS(o)
      }
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P""""),
        ("api_chargePermission", printBattery_Evidence_Charge_Qualification_SupervisorChargePermissionType(o.api_chargePermission)),
        ("api_chargeSessionSnapshot", printBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot(o.api_chargeSessionSnapshot)),
        ("api_currentChargeSession", printBattery_Evidence_Charge_Qualification_SupervisorChargeSessionStateType(o.api_currentChargeSession))
      ))
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS""""),
        ("api_chargePermission", printBattery_Evidence_Charge_Qualification_SupervisorChargePermissionType(o.api_chargePermission)),
        ("api_chargeSessionSnapshot", printBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot(o.api_chargeSessionSnapshot)),
        ("api_currentChargeSession", printBattery_Evidence_Charge_Qualification_SupervisorChargeSessionStateType(o.api_currentChargeSession))
      ))
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container(o: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container): ST = {
      o match {
        case o: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P => return printBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS => return printBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS(o)
      }
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P(o: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P""""),
        ("api_batteryAssessment", printBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType(o.api_batteryAssessment)),
        ("api_lifecycleContext", printBattery_Evidence_Charge_Qualification_SupervisorLifecycleContextType(o.api_lifecycleContext))
      ))
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS(o: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS""""),
        ("api_batteryAssessment", printBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType(o.api_batteryAssessment)),
        ("api_lifecycleContext", printBattery_Evidence_Charge_Qualification_SupervisorLifecycleContextType(o.api_lifecycleContext))
      ))
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container(o: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container): ST = {
      o match {
        case o: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P => return printBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS => return printBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS(o)
      }
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P(o: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P""""),
        ("api_flightControlBatteryNotice", printBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticeType(o.api_flightControlBatteryNotice))
      ))
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS(o: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS""""),
        ("api_flightControlBatteryNotice", printBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticeType(o.api_flightControlBatteryNotice))
      ))
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container(o: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container): ST = {
      o match {
        case o: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P => return printBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS => return printBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS(o)
      }
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P(o: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P""""),
        ("api_batteryAssessment", printBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType(o.api_batteryAssessment)),
        ("api_chargeSessionSnapshot", printBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot(o.api_chargeSessionSnapshot)),
        ("api_chargerPathQualification", printBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType(o.api_chargerPathQualification))
      ))
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS(o: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS""""),
        ("api_batteryAssessment", printBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType(o.api_batteryAssessment)),
        ("api_chargeSessionSnapshot", printBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot(o.api_chargeSessionSnapshot)),
        ("api_chargerPathQualification", printBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType(o.api_chargerPathQualification))
      ))
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container(o: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container): ST = {
      o match {
        case o: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P => return printBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS => return printBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS(o)
      }
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P(o: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P""""),
        ("api_pilotBatteryStatus", printBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus(o.api_pilotBatteryStatus))
      ))
    }

    @pure def printBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS(o: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS""""),
        ("api_pilotBatteryStatus", printBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus(o.api_pilotBatteryStatus))
      ))
    }

    @pure def printruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): ST = {
      val value: String = o match {
        case runtimemonitor.ObservationKind.BatteryEvidenceChargeQualificationSupervisor_Instance_supervisorProcess_batteryEvidenceQualifier_postInit => "BatteryEvidenceChargeQualificationSupervisor_Instance_supervisorProcess_batteryEvidenceQualifier_postInit"
        case runtimemonitor.ObservationKind.BatteryEvidenceChargeQualificationSupervisor_Instance_supervisorProcess_batteryEvidenceQualifier_preCompute => "BatteryEvidenceChargeQualificationSupervisor_Instance_supervisorProcess_batteryEvidenceQualifier_preCompute"
        case runtimemonitor.ObservationKind.BatteryEvidenceChargeQualificationSupervisor_Instance_supervisorProcess_batteryEvidenceQualifier_postCompute => "BatteryEvidenceChargeQualificationSupervisor_Instance_supervisorProcess_batteryEvidenceQualifier_postCompute"
        case runtimemonitor.ObservationKind.BatteryEvidenceChargeQualificationSupervisor_Instance_supervisorProcess_chargeContextQualifier_postInit => "BatteryEvidenceChargeQualificationSupervisor_Instance_supervisorProcess_chargeContextQualifier_postInit"
        case runtimemonitor.ObservationKind.BatteryEvidenceChargeQualificationSupervisor_Instance_supervisorProcess_chargeContextQualifier_preCompute => "BatteryEvidenceChargeQualificationSupervisor_Instance_supervisorProcess_chargeContextQualifier_preCompute"
        case runtimemonitor.ObservationKind.BatteryEvidenceChargeQualificationSupervisor_Instance_supervisorProcess_chargeContextQualifier_postCompute => "BatteryEvidenceChargeQualificationSupervisor_Instance_supervisorProcess_chargeContextQualifier_postCompute"
        case runtimemonitor.ObservationKind.BatteryEvidenceChargeQualificationSupervisor_Instance_supervisorProcess_chargerPathQualifier_postInit => "BatteryEvidenceChargeQualificationSupervisor_Instance_supervisorProcess_chargerPathQualifier_postInit"
        case runtimemonitor.ObservationKind.BatteryEvidenceChargeQualificationSupervisor_Instance_supervisorProcess_chargerPathQualifier_preCompute => "BatteryEvidenceChargeQualificationSupervisor_Instance_supervisorProcess_chargerPathQualifier_preCompute"
        case runtimemonitor.ObservationKind.BatteryEvidenceChargeQualificationSupervisor_Instance_supervisorProcess_chargerPathQualifier_postCompute => "BatteryEvidenceChargeQualificationSupervisor_Instance_supervisorProcess_chargerPathQualifier_postCompute"
        case runtimemonitor.ObservationKind.BatteryEvidenceChargeQualificationSupervisor_Instance_supervisorProcess_chargeEligibilityRecoveryOwner_postInit => "BatteryEvidenceChargeQualificationSupervisor_Instance_supervisorProcess_chargeEligibilityRecoveryOwner_postInit"
        case runtimemonitor.ObservationKind.BatteryEvidenceChargeQualificationSupervisor_Instance_supervisorProcess_chargeEligibilityRecoveryOwner_preCompute => "BatteryEvidenceChargeQualificationSupervisor_Instance_supervisorProcess_chargeEligibilityRecoveryOwner_preCompute"
        case runtimemonitor.ObservationKind.BatteryEvidenceChargeQualificationSupervisor_Instance_supervisorProcess_chargeEligibilityRecoveryOwner_postCompute => "BatteryEvidenceChargeQualificationSupervisor_Instance_supervisorProcess_chargeEligibilityRecoveryOwner_postCompute"
        case runtimemonitor.ObservationKind.BatteryEvidenceChargeQualificationSupervisor_Instance_supervisorProcess_chargeIntentArbiter_postInit => "BatteryEvidenceChargeQualificationSupervisor_Instance_supervisorProcess_chargeIntentArbiter_postInit"
        case runtimemonitor.ObservationKind.BatteryEvidenceChargeQualificationSupervisor_Instance_supervisorProcess_chargeIntentArbiter_preCompute => "BatteryEvidenceChargeQualificationSupervisor_Instance_supervisorProcess_chargeIntentArbiter_preCompute"
        case runtimemonitor.ObservationKind.BatteryEvidenceChargeQualificationSupervisor_Instance_supervisorProcess_chargeIntentArbiter_postCompute => "BatteryEvidenceChargeQualificationSupervisor_Instance_supervisorProcess_chargeIntentArbiter_postCompute"
        case runtimemonitor.ObservationKind.BatteryEvidenceChargeQualificationSupervisor_Instance_supervisorProcess_chargeSessionController_postInit => "BatteryEvidenceChargeQualificationSupervisor_Instance_supervisorProcess_chargeSessionController_postInit"
        case runtimemonitor.ObservationKind.BatteryEvidenceChargeQualificationSupervisor_Instance_supervisorProcess_chargeSessionController_preCompute => "BatteryEvidenceChargeQualificationSupervisor_Instance_supervisorProcess_chargeSessionController_preCompute"
        case runtimemonitor.ObservationKind.BatteryEvidenceChargeQualificationSupervisor_Instance_supervisorProcess_chargeSessionController_postCompute => "BatteryEvidenceChargeQualificationSupervisor_Instance_supervisorProcess_chargeSessionController_postCompute"
        case runtimemonitor.ObservationKind.BatteryEvidenceChargeQualificationSupervisor_Instance_supervisorProcess_flightControlBatteryNoticePolicy_postInit => "BatteryEvidenceChargeQualificationSupervisor_Instance_supervisorProcess_flightControlBatteryNoticePolicy_postInit"
        case runtimemonitor.ObservationKind.BatteryEvidenceChargeQualificationSupervisor_Instance_supervisorProcess_flightControlBatteryNoticePolicy_preCompute => "BatteryEvidenceChargeQualificationSupervisor_Instance_supervisorProcess_flightControlBatteryNoticePolicy_preCompute"
        case runtimemonitor.ObservationKind.BatteryEvidenceChargeQualificationSupervisor_Instance_supervisorProcess_flightControlBatteryNoticePolicy_postCompute => "BatteryEvidenceChargeQualificationSupervisor_Instance_supervisorProcess_flightControlBatteryNoticePolicy_postCompute"
        case runtimemonitor.ObservationKind.BatteryEvidenceChargeQualificationSupervisor_Instance_supervisorProcess_pilotBatteryStatusPolicy_postInit => "BatteryEvidenceChargeQualificationSupervisor_Instance_supervisorProcess_pilotBatteryStatusPolicy_postInit"
        case runtimemonitor.ObservationKind.BatteryEvidenceChargeQualificationSupervisor_Instance_supervisorProcess_pilotBatteryStatusPolicy_preCompute => "BatteryEvidenceChargeQualificationSupervisor_Instance_supervisorProcess_pilotBatteryStatusPolicy_preCompute"
        case runtimemonitor.ObservationKind.BatteryEvidenceChargeQualificationSupervisor_Instance_supervisorProcess_pilotBatteryStatusPolicy_postCompute => "BatteryEvidenceChargeQualificationSupervisor_Instance_supervisorProcess_pilotBatteryStatusPolicy_postCompute"
      }
      return printObject(ISZ(
        ("type", printString("runtimemonitor.ObservationKind")),
        ("value", printString(value))
      ))
    }

    @pure def printutilContainer(o: util.Container): ST = {
      o match {
        case o: util.EmptyContainer => return printutilEmptyContainer(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P => return printBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS => return printBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P => return printBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS => return printBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P => return printBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS => return printBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P => return printBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS => return printBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P => return printBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS => return printBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P => return printBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS => return printBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P => return printBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS => return printBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P => return printBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS => return printBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P => return printBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P => return printBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS => return printBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS => return printBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P => return printBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS => return printBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P => return printBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS => return printBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P => return printBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS => return printBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P => return printBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS => return printBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P => return printBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS => return printBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P => return printBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS => return printBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS(o)
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
        case o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryCheck_Payload => return printBattery_Evidence_Charge_Qualification_SupervisorBatteryCheck_Payload(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason_Payload => return printBattery_Evidence_Charge_Qualification_SupervisorChargeReason_Payload(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeRequest_Payload => return printBattery_Evidence_Charge_Qualification_SupervisorChargeRequest_Payload(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.PilotAdvisory_Payload => return printBattery_Evidence_Charge_Qualification_SupervisorPilotAdvisory_Payload(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeActivity_Payload => return printBattery_Evidence_Charge_Qualification_SupervisorChargeActivity_Payload(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision_Payload => return printBattery_Evidence_Charge_Qualification_SupervisorChargeDecision_Payload(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargePermission_Payload => return printBattery_Evidence_Charge_Qualification_SupervisorChargePermission_Payload(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.LifecycleContext_Payload => return printBattery_Evidence_Charge_Qualification_SupervisorLifecycleContext_Payload(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.PilotSessionState_Payload => return printBattery_Evidence_Charge_Qualification_SupervisorPilotSessionState_Payload(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargerConnection_Payload => return printBattery_Evidence_Charge_Qualification_SupervisorChargerConnection_Payload(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment_Payload => return printBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessment_Payload(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState_Payload => return printBattery_Evidence_Charge_Qualification_SupervisorChargeSessionState_Payload(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatus_Payload => return printBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus_Payload(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryCapacityBand_Payload => return printBattery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBand_Payload(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionSnapshot_Payload => return printBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot_Payload(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryReadinessAdvice_Payload => return printBattery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdvice_Payload(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.PilotChargeDisposition_Payload => return printBattery_Evidence_Charge_Qualification_SupervisorPilotChargeDisposition_Payload(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.SnapshotPreSessionState_Payload => return printBattery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionState_Payload(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.SnapshotNextSessionState_Payload => return printBattery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionState_Payload(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification_Payload => return printBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualification_Payload(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition_Payload => return printBattery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDisposition_Payload(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope_Payload => return printBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelope_Payload(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification_Payload => return printBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualification_Payload(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice_Payload => return printBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNotice_Payload(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P => return printBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS => return printBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P => return printBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS => return printBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P => return printBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS => return printBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P => return printBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS => return printBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P => return printBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS => return printBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P => return printBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS => return printBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P => return printBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS => return printBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P => return printBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS => return printBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P => return printBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P => return printBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS => return printBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS => return printBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P => return printBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS => return printBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P => return printBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS => return printBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P => return printBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS => return printBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P => return printBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS => return printBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P => return printBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS => return printBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P => return printBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS => return printBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS(o)
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

    def parseBattery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBandType(): Battery_Evidence_Charge_Qualification_Supervisor.BatteryCapacityBand.Type = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBandT(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBandT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.BatteryCapacityBand.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.BatteryCapacityBand")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Battery_Evidence_Charge_Qualification_Supervisor.BatteryCapacityBand.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Battery_Evidence_Charge_Qualification_Supervisor.BatteryCapacityBand.")
          return Battery_Evidence_Charge_Qualification_Supervisor.BatteryCapacityBand.byOrdinal(0).get
      }
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBand_Payload(): Battery_Evidence_Charge_Qualification_Supervisor.BatteryCapacityBand_Payload = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBand_PayloadT(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBand_PayloadT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.BatteryCapacityBand_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.BatteryCapacityBand_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseBattery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBandType()
      parser.parseObjectNext()
      return Battery_Evidence_Charge_Qualification_Supervisor.BatteryCapacityBand_Payload(value)
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorBatteryCheckType(): Battery_Evidence_Charge_Qualification_Supervisor.BatteryCheck.Type = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorBatteryCheckT(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorBatteryCheckT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.BatteryCheck.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.BatteryCheck")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Battery_Evidence_Charge_Qualification_Supervisor.BatteryCheck.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Battery_Evidence_Charge_Qualification_Supervisor.BatteryCheck.")
          return Battery_Evidence_Charge_Qualification_Supervisor.BatteryCheck.byOrdinal(0).get
      }
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorBatteryCheck_Payload(): Battery_Evidence_Charge_Qualification_Supervisor.BatteryCheck_Payload = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorBatteryCheck_PayloadT(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorBatteryCheck_PayloadT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.BatteryCheck_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.BatteryCheck_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseBattery_Evidence_Charge_Qualification_SupervisorBatteryCheckType()
      parser.parseObjectNext()
      return Battery_Evidence_Charge_Qualification_Supervisor.BatteryCheck_Payload(value)
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType(): Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.Type = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentT(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.")
          return Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.byOrdinal(0).get
      }
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessment_Payload(): Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment_Payload = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessment_PayloadT(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessment_PayloadT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType()
      parser.parseObjectNext()
      return Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment_Payload(value)
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorLifecycleContextType(): Battery_Evidence_Charge_Qualification_Supervisor.LifecycleContext.Type = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorLifecycleContextT(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorLifecycleContextT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.LifecycleContext.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.LifecycleContext")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Battery_Evidence_Charge_Qualification_Supervisor.LifecycleContext.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Battery_Evidence_Charge_Qualification_Supervisor.LifecycleContext.")
          return Battery_Evidence_Charge_Qualification_Supervisor.LifecycleContext.byOrdinal(0).get
      }
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorLifecycleContext_Payload(): Battery_Evidence_Charge_Qualification_Supervisor.LifecycleContext_Payload = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorLifecycleContext_PayloadT(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorLifecycleContext_PayloadT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.LifecycleContext_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.LifecycleContext_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseBattery_Evidence_Charge_Qualification_SupervisorLifecycleContextType()
      parser.parseObjectNext()
      return Battery_Evidence_Charge_Qualification_Supervisor.LifecycleContext_Payload(value)
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualificationType(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification.Type = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualificationT(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualificationT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification.")
          return Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification.byOrdinal(0).get
      }
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualification_Payload(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification_Payload = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualification_PayloadT(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualification_PayloadT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualificationType()
      parser.parseObjectNext()
      return Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification_Payload(value)
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdviceType(): Battery_Evidence_Charge_Qualification_Supervisor.BatteryReadinessAdvice.Type = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdviceT(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdviceT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.BatteryReadinessAdvice.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.BatteryReadinessAdvice")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Battery_Evidence_Charge_Qualification_Supervisor.BatteryReadinessAdvice.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Battery_Evidence_Charge_Qualification_Supervisor.BatteryReadinessAdvice.")
          return Battery_Evidence_Charge_Qualification_Supervisor.BatteryReadinessAdvice.byOrdinal(0).get
      }
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdvice_Payload(): Battery_Evidence_Charge_Qualification_Supervisor.BatteryReadinessAdvice_Payload = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdvice_PayloadT(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdvice_PayloadT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.BatteryReadinessAdvice_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.BatteryReadinessAdvice_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseBattery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdviceType()
      parser.parseObjectNext()
      return Battery_Evidence_Charge_Qualification_Supervisor.BatteryReadinessAdvice_Payload(value)
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargerConnectionType(): Battery_Evidence_Charge_Qualification_Supervisor.ChargerConnection.Type = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargerConnectionT(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargerConnectionT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.ChargerConnection.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.ChargerConnection")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Battery_Evidence_Charge_Qualification_Supervisor.ChargerConnection.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Battery_Evidence_Charge_Qualification_Supervisor.ChargerConnection.")
          return Battery_Evidence_Charge_Qualification_Supervisor.ChargerConnection.byOrdinal(0).get
      }
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargerConnection_Payload(): Battery_Evidence_Charge_Qualification_Supervisor.ChargerConnection_Payload = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargerConnection_PayloadT(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargerConnection_PayloadT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.ChargerConnection_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.ChargerConnection_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseBattery_Evidence_Charge_Qualification_SupervisorChargerConnectionType()
      parser.parseObjectNext()
      return Battery_Evidence_Charge_Qualification_Supervisor.ChargerConnection_Payload(value)
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargeActivityType(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeActivity.Type = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeActivityT(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargeActivityT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.ChargeActivity.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.ChargeActivity")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Battery_Evidence_Charge_Qualification_Supervisor.ChargeActivity.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Battery_Evidence_Charge_Qualification_Supervisor.ChargeActivity.")
          return Battery_Evidence_Charge_Qualification_Supervisor.ChargeActivity.byOrdinal(0).get
      }
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargeActivity_Payload(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeActivity_Payload = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeActivity_PayloadT(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargeActivity_PayloadT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.ChargeActivity_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.ChargeActivity_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseBattery_Evidence_Charge_Qualification_SupervisorChargeActivityType()
      parser.parseObjectNext()
      return Battery_Evidence_Charge_Qualification_Supervisor.ChargeActivity_Payload(value)
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType(): Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification.Type = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationT(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification.")
          return Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification.byOrdinal(0).get
      }
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualification_Payload(): Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification_Payload = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualification_PayloadT(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualification_PayloadT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType()
      parser.parseObjectNext()
      return Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification_Payload(value)
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargeSessionStateType(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState.Type = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeSessionStateT(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargeSessionStateT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState.")
          return Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState.byOrdinal(0).get
      }
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargeSessionState_Payload(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState_Payload = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeSessionState_PayloadT(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargeSessionState_PayloadT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseBattery_Evidence_Charge_Qualification_SupervisorChargeSessionStateType()
      parser.parseObjectNext()
      return Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState_Payload(value)
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelopeType(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope.Type = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelopeT(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelopeT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope.")
          return Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope.byOrdinal(0).get
      }
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelope_Payload(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope_Payload = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelope_PayloadT(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelope_PayloadT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelopeType()
      parser.parseObjectNext()
      return Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope_Payload(value)
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargeRequestType(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeRequest.Type = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeRequestT(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargeRequestT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.ChargeRequest.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.ChargeRequest")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Battery_Evidence_Charge_Qualification_Supervisor.ChargeRequest.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Battery_Evidence_Charge_Qualification_Supervisor.ChargeRequest.")
          return Battery_Evidence_Charge_Qualification_Supervisor.ChargeRequest.byOrdinal(0).get
      }
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargeRequest_Payload(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeRequest_Payload = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeRequest_PayloadT(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargeRequest_PayloadT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.ChargeRequest_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.ChargeRequest_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseBattery_Evidence_Charge_Qualification_SupervisorChargeRequestType()
      parser.parseObjectNext()
      return Battery_Evidence_Charge_Qualification_Supervisor.ChargeRequest_Payload(value)
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargeDecisionType(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.Type = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeDecisionT(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargeDecisionT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.")
          return Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.byOrdinal(0).get
      }
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargeDecision_Payload(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision_Payload = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeDecision_PayloadT(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargeDecision_PayloadT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseBattery_Evidence_Charge_Qualification_SupervisorChargeDecisionType()
      parser.parseObjectNext()
      return Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision_Payload(value)
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionStateType(): Battery_Evidence_Charge_Qualification_Supervisor.SnapshotPreSessionState.Type = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionStateT(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionStateT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.SnapshotPreSessionState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.SnapshotPreSessionState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Battery_Evidence_Charge_Qualification_Supervisor.SnapshotPreSessionState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Battery_Evidence_Charge_Qualification_Supervisor.SnapshotPreSessionState.")
          return Battery_Evidence_Charge_Qualification_Supervisor.SnapshotPreSessionState.byOrdinal(0).get
      }
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionState_Payload(): Battery_Evidence_Charge_Qualification_Supervisor.SnapshotPreSessionState_Payload = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionState_PayloadT(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionState_PayloadT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.SnapshotPreSessionState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.SnapshotPreSessionState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseBattery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionStateType()
      parser.parseObjectNext()
      return Battery_Evidence_Charge_Qualification_Supervisor.SnapshotPreSessionState_Payload(value)
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionStateType(): Battery_Evidence_Charge_Qualification_Supervisor.SnapshotNextSessionState.Type = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionStateT(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionStateT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.SnapshotNextSessionState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.SnapshotNextSessionState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Battery_Evidence_Charge_Qualification_Supervisor.SnapshotNextSessionState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Battery_Evidence_Charge_Qualification_Supervisor.SnapshotNextSessionState.")
          return Battery_Evidence_Charge_Qualification_Supervisor.SnapshotNextSessionState.byOrdinal(0).get
      }
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionState_Payload(): Battery_Evidence_Charge_Qualification_Supervisor.SnapshotNextSessionState_Payload = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionState_PayloadT(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionState_PayloadT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.SnapshotNextSessionState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.SnapshotNextSessionState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseBattery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionStateType()
      parser.parseObjectNext()
      return Battery_Evidence_Charge_Qualification_Supervisor.SnapshotNextSessionState_Payload(value)
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDispositionType(): Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition.Type = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDispositionT(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDispositionT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition.")
          return Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition.byOrdinal(0).get
      }
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDisposition_Payload(): Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition_Payload = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDisposition_PayloadT(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDisposition_PayloadT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseBattery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDispositionType()
      parser.parseObjectNext()
      return Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition_Payload(value)
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargeReasonType(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason.Type = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeReasonT(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargeReasonT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason.")
          return Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason.byOrdinal(0).get
      }
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargeReason_Payload(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason_Payload = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeReason_PayloadT(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargeReason_PayloadT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseBattery_Evidence_Charge_Qualification_SupervisorChargeReasonType()
      parser.parseObjectNext()
      return Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason_Payload(value)
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargePermissionType(): Battery_Evidence_Charge_Qualification_Supervisor.ChargePermission.Type = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargePermissionT(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargePermissionT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.ChargePermission.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.ChargePermission")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Battery_Evidence_Charge_Qualification_Supervisor.ChargePermission.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Battery_Evidence_Charge_Qualification_Supervisor.ChargePermission.")
          return Battery_Evidence_Charge_Qualification_Supervisor.ChargePermission.byOrdinal(0).get
      }
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargePermission_Payload(): Battery_Evidence_Charge_Qualification_Supervisor.ChargePermission_Payload = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargePermission_PayloadT(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargePermission_PayloadT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.ChargePermission_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.ChargePermission_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseBattery_Evidence_Charge_Qualification_SupervisorChargePermissionType()
      parser.parseObjectNext()
      return Battery_Evidence_Charge_Qualification_Supervisor.ChargePermission_Payload(value)
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticeType(): Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice.Type = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticeT(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticeT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice.")
          return Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice.byOrdinal(0).get
      }
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNotice_Payload(): Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice_Payload = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNotice_PayloadT(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNotice_PayloadT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticeType()
      parser.parseObjectNext()
      return Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice_Payload(value)
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorPilotSessionStateType(): Battery_Evidence_Charge_Qualification_Supervisor.PilotSessionState.Type = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorPilotSessionStateT(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorPilotSessionStateT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.PilotSessionState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.PilotSessionState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Battery_Evidence_Charge_Qualification_Supervisor.PilotSessionState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Battery_Evidence_Charge_Qualification_Supervisor.PilotSessionState.")
          return Battery_Evidence_Charge_Qualification_Supervisor.PilotSessionState.byOrdinal(0).get
      }
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorPilotSessionState_Payload(): Battery_Evidence_Charge_Qualification_Supervisor.PilotSessionState_Payload = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorPilotSessionState_PayloadT(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorPilotSessionState_PayloadT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.PilotSessionState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.PilotSessionState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseBattery_Evidence_Charge_Qualification_SupervisorPilotSessionStateType()
      parser.parseObjectNext()
      return Battery_Evidence_Charge_Qualification_Supervisor.PilotSessionState_Payload(value)
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorPilotChargeDispositionType(): Battery_Evidence_Charge_Qualification_Supervisor.PilotChargeDisposition.Type = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorPilotChargeDispositionT(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorPilotChargeDispositionT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.PilotChargeDisposition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.PilotChargeDisposition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Battery_Evidence_Charge_Qualification_Supervisor.PilotChargeDisposition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Battery_Evidence_Charge_Qualification_Supervisor.PilotChargeDisposition.")
          return Battery_Evidence_Charge_Qualification_Supervisor.PilotChargeDisposition.byOrdinal(0).get
      }
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorPilotChargeDisposition_Payload(): Battery_Evidence_Charge_Qualification_Supervisor.PilotChargeDisposition_Payload = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorPilotChargeDisposition_PayloadT(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorPilotChargeDisposition_PayloadT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.PilotChargeDisposition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.PilotChargeDisposition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseBattery_Evidence_Charge_Qualification_SupervisorPilotChargeDispositionType()
      parser.parseObjectNext()
      return Battery_Evidence_Charge_Qualification_Supervisor.PilotChargeDisposition_Payload(value)
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorPilotAdvisoryType(): Battery_Evidence_Charge_Qualification_Supervisor.PilotAdvisory.Type = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorPilotAdvisoryT(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorPilotAdvisoryT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.PilotAdvisory.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.PilotAdvisory")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Battery_Evidence_Charge_Qualification_Supervisor.PilotAdvisory.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Battery_Evidence_Charge_Qualification_Supervisor.PilotAdvisory.")
          return Battery_Evidence_Charge_Qualification_Supervisor.PilotAdvisory.byOrdinal(0).get
      }
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorPilotAdvisory_Payload(): Battery_Evidence_Charge_Qualification_Supervisor.PilotAdvisory_Payload = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorPilotAdvisory_PayloadT(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorPilotAdvisory_PayloadT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.PilotAdvisory_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.PilotAdvisory_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseBattery_Evidence_Charge_Qualification_SupervisorPilotAdvisoryType()
      parser.parseObjectNext()
      return Battery_Evidence_Charge_Qualification_Supervisor.PilotAdvisory_Payload(value)
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionSnapshot = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshotT(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshotT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionSnapshot = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionSnapshot")
      }
      parser.parseObjectKey("preSession")
      val preSession = parseBattery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("nextSession")
      val nextSession = parseBattery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("disposition")
      val disposition = parseBattery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDispositionType()
      parser.parseObjectNext()
      parser.parseObjectKey("reason")
      val reason = parseBattery_Evidence_Charge_Qualification_SupervisorChargeReasonType()
      parser.parseObjectNext()
      return Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionSnapshot(preSession, nextSession, disposition, reason)
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot_Payload(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionSnapshot_Payload = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot_PayloadT(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot_PayloadT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionSnapshot_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionSnapshot_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot()
      parser.parseObjectNext()
      return Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionSnapshot_Payload(value)
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus(): Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatus = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusT(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatus = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatus")
      }
      parser.parseObjectKey("batteryAssessment")
      val batteryAssessment = parseBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("chargerPathQualification")
      val chargerPathQualification = parseBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType()
      parser.parseObjectNext()
      parser.parseObjectKey("session")
      val session = parseBattery_Evidence_Charge_Qualification_SupervisorPilotSessionStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("disposition")
      val disposition = parseBattery_Evidence_Charge_Qualification_SupervisorPilotChargeDispositionType()
      parser.parseObjectNext()
      parser.parseObjectKey("advisory")
      val advisory = parseBattery_Evidence_Charge_Qualification_SupervisorPilotAdvisoryType()
      parser.parseObjectNext()
      return Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatus(batteryAssessment, chargerPathQualification, session, disposition, advisory)
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus_Payload(): Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatus_Payload = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus_PayloadT(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus_PayloadT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatus_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatus_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus()
      parser.parseObjectNext()
      return Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatus_Payload(value)
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

    def parseBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container(): Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P", "Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS"))
      t.native match {
        case "Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PT(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PST(T); return r
        case _ => val r = parseBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PST(T); return r
      }
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P(): Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PT(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P")
      }
      parser.parseObjectKey("api_batteryCapacity")
      val api_batteryCapacity = parseBattery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBandType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_batteryCheck")
      val api_batteryCheck = parseBattery_Evidence_Charge_Qualification_SupervisorBatteryCheckType()
      parser.parseObjectNext()
      return Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P(api_batteryCapacity, api_batteryCheck)
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS(): Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PST(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PST(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS")
      }
      parser.parseObjectKey("api_batteryCapacity")
      val api_batteryCapacity = parseBattery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBandType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_batteryCheck")
      val api_batteryCheck = parseBattery_Evidence_Charge_Qualification_SupervisorBatteryCheckType()
      parser.parseObjectNext()
      return Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS(api_batteryCapacity, api_batteryCheck)
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container(): Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P", "Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS"))
      t.native match {
        case "Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PT(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PST(T); return r
        case _ => val r = parseBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PST(T); return r
      }
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P(): Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PT(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P")
      }
      parser.parseObjectKey("api_batteryAssessment")
      val api_batteryAssessment = parseBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType()
      parser.parseObjectNext()
      return Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P(api_batteryAssessment)
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS(): Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PST(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PST(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS")
      }
      parser.parseObjectKey("api_batteryAssessment")
      val api_batteryAssessment = parseBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType()
      parser.parseObjectNext()
      return Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS(api_batteryAssessment)
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P", "Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS"))
      t.native match {
        case "Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PT(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PST(T); return r
        case _ => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PST(T); return r
      }
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PT(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P")
      }
      parser.parseObjectKey("api_batteryAssessment")
      val api_batteryAssessment = parseBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_lifecycleContext")
      val api_lifecycleContext = parseBattery_Evidence_Charge_Qualification_SupervisorLifecycleContextType()
      parser.parseObjectNext()
      return Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P(api_batteryAssessment, api_lifecycleContext)
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PST(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PST(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS")
      }
      parser.parseObjectKey("api_batteryAssessment")
      val api_batteryAssessment = parseBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_lifecycleContext")
      val api_lifecycleContext = parseBattery_Evidence_Charge_Qualification_SupervisorLifecycleContextType()
      parser.parseObjectNext()
      return Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS(api_batteryAssessment, api_lifecycleContext)
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P", "Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS"))
      t.native match {
        case "Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PT(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PST(T); return r
        case _ => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PST(T); return r
      }
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PT(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P")
      }
      parser.parseObjectKey("api_batteryReadinessAdvice")
      val api_batteryReadinessAdvice = parseBattery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdviceType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_chargeContextQualification")
      val api_chargeContextQualification = parseBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualificationType()
      parser.parseObjectNext()
      return Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P(api_batteryReadinessAdvice, api_chargeContextQualification)
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PST(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PST(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS")
      }
      parser.parseObjectKey("api_batteryReadinessAdvice")
      val api_batteryReadinessAdvice = parseBattery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdviceType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_chargeContextQualification")
      val api_chargeContextQualification = parseBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualificationType()
      parser.parseObjectNext()
      return Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS(api_batteryReadinessAdvice, api_chargeContextQualification)
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container(): Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P", "Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS"))
      t.native match {
        case "Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PT(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PST(T); return r
        case _ => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PST(T); return r
      }
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P(): Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PT(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P")
      }
      parser.parseObjectKey("api_chargeActivity")
      val api_chargeActivity = parseBattery_Evidence_Charge_Qualification_SupervisorChargeActivityType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_chargerConnection")
      val api_chargerConnection = parseBattery_Evidence_Charge_Qualification_SupervisorChargerConnectionType()
      parser.parseObjectNext()
      return Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P(api_chargeActivity, api_chargerConnection)
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS(): Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PST(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PST(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS")
      }
      parser.parseObjectKey("api_chargeActivity")
      val api_chargeActivity = parseBattery_Evidence_Charge_Qualification_SupervisorChargeActivityType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_chargerConnection")
      val api_chargerConnection = parseBattery_Evidence_Charge_Qualification_SupervisorChargerConnectionType()
      parser.parseObjectNext()
      return Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS(api_chargeActivity, api_chargerConnection)
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container(): Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P", "Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS"))
      t.native match {
        case "Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PT(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PST(T); return r
        case _ => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PST(T); return r
      }
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P(): Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PT(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P")
      }
      parser.parseObjectKey("api_chargerPathQualification")
      val api_chargerPathQualification = parseBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType()
      parser.parseObjectNext()
      return Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P(api_chargerPathQualification)
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS(): Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PST(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PST(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS")
      }
      parser.parseObjectKey("api_chargerPathQualification")
      val api_chargerPathQualification = parseBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType()
      parser.parseObjectNext()
      return Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS(api_chargerPathQualification)
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P", "Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS"))
      t.native match {
        case "Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PT(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PST(T); return r
        case _ => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PST(T); return r
      }
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PT(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P")
      }
      parser.parseObjectKey("api_chargeContextQualification")
      val api_chargeContextQualification = parseBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualificationType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_chargerPathQualification")
      val api_chargerPathQualification = parseBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_currentChargeSession")
      val api_currentChargeSession = parseBattery_Evidence_Charge_Qualification_SupervisorChargeSessionStateType()
      parser.parseObjectNext()
      return Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P(api_chargeContextQualification, api_chargerPathQualification, api_currentChargeSession)
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PST(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PST(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_chargeContextQualification")
      val api_chargeContextQualification = parseBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualificationType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_chargerPathQualification")
      val api_chargerPathQualification = parseBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_currentChargeSession")
      val api_currentChargeSession = parseBattery_Evidence_Charge_Qualification_SupervisorChargeSessionStateType()
      parser.parseObjectNext()
      return Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS(api_chargeContextQualification, api_chargerPathQualification, api_currentChargeSession)
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P", "Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS"))
      t.native match {
        case "Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PT(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PST(T); return r
        case _ => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PST(T); return r
      }
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PT(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P")
      }
      parser.parseObjectKey("api_chargeEligibilityEnvelope")
      val api_chargeEligibilityEnvelope = parseBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelopeType()
      parser.parseObjectNext()
      return Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P(api_chargeEligibilityEnvelope)
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PST(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PST(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_chargeEligibilityEnvelope")
      val api_chargeEligibilityEnvelope = parseBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelopeType()
      parser.parseObjectNext()
      return Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS(api_chargeEligibilityEnvelope)
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P", "Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS"))
      t.native match {
        case "Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PT(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PST(T); return r
        case _ => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PST(T); return r
      }
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PT(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P")
      }
      parser.parseObjectKey("api_chargeEligibilityEnvelope")
      val api_chargeEligibilityEnvelope = parseBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelopeType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_chargeRequest")
      val api_chargeRequest = parseBattery_Evidence_Charge_Qualification_SupervisorChargeRequestType()
      parser.parseObjectNext()
      return Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P(api_chargeEligibilityEnvelope, api_chargeRequest)
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PST(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PST(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS")
      }
      parser.parseObjectKey("api_chargeEligibilityEnvelope")
      val api_chargeEligibilityEnvelope = parseBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelopeType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_chargeRequest")
      val api_chargeRequest = parseBattery_Evidence_Charge_Qualification_SupervisorChargeRequestType()
      parser.parseObjectNext()
      return Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS(api_chargeEligibilityEnvelope, api_chargeRequest)
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P", "Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS"))
      t.native match {
        case "Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PT(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PST(T); return r
        case _ => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PST(T); return r
      }
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PT(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P")
      }
      parser.parseObjectKey("api_chargeDecision")
      val api_chargeDecision = parseBattery_Evidence_Charge_Qualification_SupervisorChargeDecisionType()
      parser.parseObjectNext()
      return Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P(api_chargeDecision)
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PST(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PST(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS")
      }
      parser.parseObjectKey("api_chargeDecision")
      val api_chargeDecision = parseBattery_Evidence_Charge_Qualification_SupervisorChargeDecisionType()
      parser.parseObjectNext()
      return Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS(api_chargeDecision)
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P", "Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS"))
      t.native match {
        case "Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PT(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PST(T); return r
        case _ => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PST(T); return r
      }
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PT(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P")
      }
      parser.parseObjectKey("api_chargeDecision")
      val api_chargeDecision = parseBattery_Evidence_Charge_Qualification_SupervisorChargeDecisionType()
      parser.parseObjectNext()
      return Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P(api_chargeDecision)
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PST(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PST(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS")
      }
      parser.parseObjectKey("api_chargeDecision")
      val api_chargeDecision = parseBattery_Evidence_Charge_Qualification_SupervisorChargeDecisionType()
      parser.parseObjectNext()
      return Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS(api_chargeDecision)
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P", "Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS"))
      t.native match {
        case "Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PT(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PST(T); return r
        case _ => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PST(T); return r
      }
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PT(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P")
      }
      parser.parseObjectKey("api_chargePermission")
      val api_chargePermission = parseBattery_Evidence_Charge_Qualification_SupervisorChargePermissionType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_chargeSessionSnapshot")
      val api_chargeSessionSnapshot = parseBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot()
      parser.parseObjectNext()
      parser.parseObjectKey("api_currentChargeSession")
      val api_currentChargeSession = parseBattery_Evidence_Charge_Qualification_SupervisorChargeSessionStateType()
      parser.parseObjectNext()
      return Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P(api_chargePermission, api_chargeSessionSnapshot, api_currentChargeSession)
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PST(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PST(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS")
      }
      parser.parseObjectKey("api_chargePermission")
      val api_chargePermission = parseBattery_Evidence_Charge_Qualification_SupervisorChargePermissionType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_chargeSessionSnapshot")
      val api_chargeSessionSnapshot = parseBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot()
      parser.parseObjectNext()
      parser.parseObjectKey("api_currentChargeSession")
      val api_currentChargeSession = parseBattery_Evidence_Charge_Qualification_SupervisorChargeSessionStateType()
      parser.parseObjectNext()
      return Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS(api_chargePermission, api_chargeSessionSnapshot, api_currentChargeSession)
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container(): Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P", "Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS"))
      t.native match {
        case "Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PT(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PST(T); return r
        case _ => val r = parseBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PST(T); return r
      }
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P(): Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PT(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P")
      }
      parser.parseObjectKey("api_batteryAssessment")
      val api_batteryAssessment = parseBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_lifecycleContext")
      val api_lifecycleContext = parseBattery_Evidence_Charge_Qualification_SupervisorLifecycleContextType()
      parser.parseObjectNext()
      return Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P(api_batteryAssessment, api_lifecycleContext)
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS(): Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PST(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PST(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS")
      }
      parser.parseObjectKey("api_batteryAssessment")
      val api_batteryAssessment = parseBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_lifecycleContext")
      val api_lifecycleContext = parseBattery_Evidence_Charge_Qualification_SupervisorLifecycleContextType()
      parser.parseObjectNext()
      return Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS(api_batteryAssessment, api_lifecycleContext)
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container(): Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P", "Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS"))
      t.native match {
        case "Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PT(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PST(T); return r
        case _ => val r = parseBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PST(T); return r
      }
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P(): Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PT(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P")
      }
      parser.parseObjectKey("api_flightControlBatteryNotice")
      val api_flightControlBatteryNotice = parseBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticeType()
      parser.parseObjectNext()
      return Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P(api_flightControlBatteryNotice)
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS(): Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PST(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PST(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS")
      }
      parser.parseObjectKey("api_flightControlBatteryNotice")
      val api_flightControlBatteryNotice = parseBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticeType()
      parser.parseObjectNext()
      return Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS(api_flightControlBatteryNotice)
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container(): Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P", "Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS"))
      t.native match {
        case "Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PT(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PST(T); return r
        case _ => val r = parseBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PST(T); return r
      }
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P(): Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PT(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P")
      }
      parser.parseObjectKey("api_batteryAssessment")
      val api_batteryAssessment = parseBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_chargeSessionSnapshot")
      val api_chargeSessionSnapshot = parseBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot()
      parser.parseObjectNext()
      parser.parseObjectKey("api_chargerPathQualification")
      val api_chargerPathQualification = parseBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType()
      parser.parseObjectNext()
      return Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P(api_batteryAssessment, api_chargeSessionSnapshot, api_chargerPathQualification)
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS(): Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PST(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PST(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS")
      }
      parser.parseObjectKey("api_batteryAssessment")
      val api_batteryAssessment = parseBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_chargeSessionSnapshot")
      val api_chargeSessionSnapshot = parseBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot()
      parser.parseObjectNext()
      parser.parseObjectKey("api_chargerPathQualification")
      val api_chargerPathQualification = parseBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType()
      parser.parseObjectNext()
      return Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS(api_batteryAssessment, api_chargeSessionSnapshot, api_chargerPathQualification)
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container(): Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P", "Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS"))
      t.native match {
        case "Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PT(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PST(T); return r
        case _ => val r = parseBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PST(T); return r
      }
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P(): Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PT(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P")
      }
      parser.parseObjectKey("api_pilotBatteryStatus")
      val api_pilotBatteryStatus = parseBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus()
      parser.parseObjectNext()
      return Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P(api_pilotBatteryStatus)
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS(): Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS = {
      val r = parseBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PST(F)
      return r
    }

    def parseBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PST(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS")
      }
      parser.parseObjectKey("api_pilotBatteryStatus")
      val api_pilotBatteryStatus = parseBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus()
      parser.parseObjectNext()
      return Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS(api_pilotBatteryStatus)
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
      val t = parser.parseObjectTypes(ISZ("util.EmptyContainer", "Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P", "Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS", "Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P", "Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS", "Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P", "Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS", "Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P", "Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS", "Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P", "Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS", "Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P", "Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS", "Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P", "Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS", "Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P", "Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS", "Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P", "Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P", "Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS", "Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS", "Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P", "Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS", "Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P", "Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS", "Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P", "Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS", "Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P", "Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS", "Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P", "Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS", "Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P", "Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS"))
      t.native match {
        case "util.EmptyContainer" => val r = parseutilEmptyContainerT(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PT(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PST(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PT(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PST(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PT(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PST(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PT(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PST(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PT(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PST(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PT(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PST(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PT(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PST(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PT(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PST(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PT(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PT(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PST(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PST(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PT(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PST(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PT(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PST(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PT(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PST(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PT(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PST(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PT(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PST(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PT(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PST(T); return r
        case _ => val r = parseBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PST(T); return r
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
      val t = parser.parseObjectTypes(ISZ("art.Empty", "Base_Types.Boolean_Payload", "Base_Types.Integer_Payload", "Base_Types.Integer_8_Payload", "Base_Types.Integer_16_Payload", "Base_Types.Integer_32_Payload", "Base_Types.Integer_64_Payload", "Base_Types.Unsigned_8_Payload", "Base_Types.Unsigned_16_Payload", "Base_Types.Unsigned_32_Payload", "Base_Types.Unsigned_64_Payload", "Base_Types.Float_Payload", "Base_Types.Float_32_Payload", "Base_Types.Float_64_Payload", "Base_Types.Character_Payload", "Base_Types.String_Payload", "Base_Types.Bits_Payload", "util.EmptyContainer", "Battery_Evidence_Charge_Qualification_Supervisor.BatteryCheck_Payload", "Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason_Payload", "Battery_Evidence_Charge_Qualification_Supervisor.ChargeRequest_Payload", "Battery_Evidence_Charge_Qualification_Supervisor.PilotAdvisory_Payload", "Battery_Evidence_Charge_Qualification_Supervisor.ChargeActivity_Payload", "Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision_Payload", "Battery_Evidence_Charge_Qualification_Supervisor.ChargePermission_Payload", "Battery_Evidence_Charge_Qualification_Supervisor.LifecycleContext_Payload", "Battery_Evidence_Charge_Qualification_Supervisor.PilotSessionState_Payload", "Battery_Evidence_Charge_Qualification_Supervisor.ChargerConnection_Payload", "Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment_Payload", "Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState_Payload", "Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatus_Payload", "Battery_Evidence_Charge_Qualification_Supervisor.BatteryCapacityBand_Payload", "Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionSnapshot_Payload", "Battery_Evidence_Charge_Qualification_Supervisor.BatteryReadinessAdvice_Payload", "Battery_Evidence_Charge_Qualification_Supervisor.PilotChargeDisposition_Payload", "Battery_Evidence_Charge_Qualification_Supervisor.SnapshotPreSessionState_Payload", "Battery_Evidence_Charge_Qualification_Supervisor.SnapshotNextSessionState_Payload", "Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification_Payload", "Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition_Payload", "Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope_Payload", "Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification_Payload", "Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice_Payload", "Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P", "Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS", "Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P", "Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS", "Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P", "Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS", "Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P", "Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS", "Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P", "Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS", "Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P", "Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS", "Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P", "Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS", "Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P", "Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS", "Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P", "Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P", "Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS", "Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS", "Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P", "Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS", "Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P", "Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS", "Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P", "Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS", "Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P", "Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS", "Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P", "Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS", "Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P", "Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS"))
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
        case "Battery_Evidence_Charge_Qualification_Supervisor.BatteryCheck_Payload" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorBatteryCheck_PayloadT(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason_Payload" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeReason_PayloadT(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.ChargeRequest_Payload" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeRequest_PayloadT(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.PilotAdvisory_Payload" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorPilotAdvisory_PayloadT(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.ChargeActivity_Payload" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeActivity_PayloadT(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision_Payload" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeDecision_PayloadT(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.ChargePermission_Payload" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargePermission_PayloadT(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.LifecycleContext_Payload" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorLifecycleContext_PayloadT(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.PilotSessionState_Payload" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorPilotSessionState_PayloadT(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.ChargerConnection_Payload" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargerConnection_PayloadT(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment_Payload" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessment_PayloadT(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState_Payload" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeSessionState_PayloadT(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatus_Payload" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus_PayloadT(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.BatteryCapacityBand_Payload" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBand_PayloadT(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionSnapshot_Payload" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot_PayloadT(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.BatteryReadinessAdvice_Payload" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdvice_PayloadT(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.PilotChargeDisposition_Payload" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorPilotChargeDisposition_PayloadT(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.SnapshotPreSessionState_Payload" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionState_PayloadT(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.SnapshotNextSessionState_Payload" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionState_PayloadT(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification_Payload" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualification_PayloadT(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition_Payload" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDisposition_PayloadT(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope_Payload" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelope_PayloadT(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification_Payload" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualification_PayloadT(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice_Payload" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNotice_PayloadT(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PT(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PST(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PT(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PST(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PT(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PST(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PT(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PST(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PT(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PST(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PT(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PST(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PT(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PST(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PT(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PST(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PT(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PT(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PST(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PST(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PT(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PST(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PT(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PST(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PT(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PST(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PT(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PST(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PT(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PST(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PT(T); return r
        case "Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS" => val r = parseBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PST(T); return r
        case _ => val r = parseBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PST(T); return r
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

  def fromBattery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBand_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryCapacityBand_Payload, isCompact: B): String = {
    val st = Printer.printBattery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBand_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBand_Payload(s: String): Either[Battery_Evidence_Charge_Qualification_Supervisor.BatteryCapacityBand_Payload, Json.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBand_Payload(parser: Parser): Battery_Evidence_Charge_Qualification_Supervisor.BatteryCapacityBand_Payload = {
      val r = parser.parseBattery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBand_Payload()
      return r
    }
    val r = to(s, fBattery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBand_Payload _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorBatteryCheck_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryCheck_Payload, isCompact: B): String = {
    val st = Printer.printBattery_Evidence_Charge_Qualification_SupervisorBatteryCheck_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorBatteryCheck_Payload(s: String): Either[Battery_Evidence_Charge_Qualification_Supervisor.BatteryCheck_Payload, Json.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorBatteryCheck_Payload(parser: Parser): Battery_Evidence_Charge_Qualification_Supervisor.BatteryCheck_Payload = {
      val r = parser.parseBattery_Evidence_Charge_Qualification_SupervisorBatteryCheck_Payload()
      return r
    }
    val r = to(s, fBattery_Evidence_Charge_Qualification_SupervisorBatteryCheck_Payload _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessment_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment_Payload, isCompact: B): String = {
    val st = Printer.printBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessment_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessment_Payload(s: String): Either[Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment_Payload, Json.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessment_Payload(parser: Parser): Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment_Payload = {
      val r = parser.parseBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessment_Payload()
      return r
    }
    val r = to(s, fBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessment_Payload _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorLifecycleContext_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.LifecycleContext_Payload, isCompact: B): String = {
    val st = Printer.printBattery_Evidence_Charge_Qualification_SupervisorLifecycleContext_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorLifecycleContext_Payload(s: String): Either[Battery_Evidence_Charge_Qualification_Supervisor.LifecycleContext_Payload, Json.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorLifecycleContext_Payload(parser: Parser): Battery_Evidence_Charge_Qualification_Supervisor.LifecycleContext_Payload = {
      val r = parser.parseBattery_Evidence_Charge_Qualification_SupervisorLifecycleContext_Payload()
      return r
    }
    val r = to(s, fBattery_Evidence_Charge_Qualification_SupervisorLifecycleContext_Payload _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualification_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification_Payload, isCompact: B): String = {
    val st = Printer.printBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualification_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualification_Payload(s: String): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification_Payload, Json.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualification_Payload(parser: Parser): Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification_Payload = {
      val r = parser.parseBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualification_Payload()
      return r
    }
    val r = to(s, fBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualification_Payload _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdvice_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryReadinessAdvice_Payload, isCompact: B): String = {
    val st = Printer.printBattery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdvice_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdvice_Payload(s: String): Either[Battery_Evidence_Charge_Qualification_Supervisor.BatteryReadinessAdvice_Payload, Json.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdvice_Payload(parser: Parser): Battery_Evidence_Charge_Qualification_Supervisor.BatteryReadinessAdvice_Payload = {
      val r = parser.parseBattery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdvice_Payload()
      return r
    }
    val r = to(s, fBattery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdvice_Payload _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargerConnection_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargerConnection_Payload, isCompact: B): String = {
    val st = Printer.printBattery_Evidence_Charge_Qualification_SupervisorChargerConnection_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargerConnection_Payload(s: String): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargerConnection_Payload, Json.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargerConnection_Payload(parser: Parser): Battery_Evidence_Charge_Qualification_Supervisor.ChargerConnection_Payload = {
      val r = parser.parseBattery_Evidence_Charge_Qualification_SupervisorChargerConnection_Payload()
      return r
    }
    val r = to(s, fBattery_Evidence_Charge_Qualification_SupervisorChargerConnection_Payload _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargeActivity_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeActivity_Payload, isCompact: B): String = {
    val st = Printer.printBattery_Evidence_Charge_Qualification_SupervisorChargeActivity_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargeActivity_Payload(s: String): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargeActivity_Payload, Json.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargeActivity_Payload(parser: Parser): Battery_Evidence_Charge_Qualification_Supervisor.ChargeActivity_Payload = {
      val r = parser.parseBattery_Evidence_Charge_Qualification_SupervisorChargeActivity_Payload()
      return r
    }
    val r = to(s, fBattery_Evidence_Charge_Qualification_SupervisorChargeActivity_Payload _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualification_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification_Payload, isCompact: B): String = {
    val st = Printer.printBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualification_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualification_Payload(s: String): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification_Payload, Json.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualification_Payload(parser: Parser): Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification_Payload = {
      val r = parser.parseBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualification_Payload()
      return r
    }
    val r = to(s, fBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualification_Payload _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargeSessionState_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState_Payload, isCompact: B): String = {
    val st = Printer.printBattery_Evidence_Charge_Qualification_SupervisorChargeSessionState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargeSessionState_Payload(s: String): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState_Payload, Json.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargeSessionState_Payload(parser: Parser): Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState_Payload = {
      val r = parser.parseBattery_Evidence_Charge_Qualification_SupervisorChargeSessionState_Payload()
      return r
    }
    val r = to(s, fBattery_Evidence_Charge_Qualification_SupervisorChargeSessionState_Payload _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelope_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope_Payload, isCompact: B): String = {
    val st = Printer.printBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelope_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelope_Payload(s: String): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope_Payload, Json.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelope_Payload(parser: Parser): Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope_Payload = {
      val r = parser.parseBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelope_Payload()
      return r
    }
    val r = to(s, fBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelope_Payload _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargeRequest_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeRequest_Payload, isCompact: B): String = {
    val st = Printer.printBattery_Evidence_Charge_Qualification_SupervisorChargeRequest_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargeRequest_Payload(s: String): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargeRequest_Payload, Json.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargeRequest_Payload(parser: Parser): Battery_Evidence_Charge_Qualification_Supervisor.ChargeRequest_Payload = {
      val r = parser.parseBattery_Evidence_Charge_Qualification_SupervisorChargeRequest_Payload()
      return r
    }
    val r = to(s, fBattery_Evidence_Charge_Qualification_SupervisorChargeRequest_Payload _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargeDecision_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision_Payload, isCompact: B): String = {
    val st = Printer.printBattery_Evidence_Charge_Qualification_SupervisorChargeDecision_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargeDecision_Payload(s: String): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision_Payload, Json.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargeDecision_Payload(parser: Parser): Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision_Payload = {
      val r = parser.parseBattery_Evidence_Charge_Qualification_SupervisorChargeDecision_Payload()
      return r
    }
    val r = to(s, fBattery_Evidence_Charge_Qualification_SupervisorChargeDecision_Payload _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionState_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.SnapshotPreSessionState_Payload, isCompact: B): String = {
    val st = Printer.printBattery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionState_Payload(s: String): Either[Battery_Evidence_Charge_Qualification_Supervisor.SnapshotPreSessionState_Payload, Json.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionState_Payload(parser: Parser): Battery_Evidence_Charge_Qualification_Supervisor.SnapshotPreSessionState_Payload = {
      val r = parser.parseBattery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionState_Payload()
      return r
    }
    val r = to(s, fBattery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionState_Payload _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionState_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.SnapshotNextSessionState_Payload, isCompact: B): String = {
    val st = Printer.printBattery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionState_Payload(s: String): Either[Battery_Evidence_Charge_Qualification_Supervisor.SnapshotNextSessionState_Payload, Json.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionState_Payload(parser: Parser): Battery_Evidence_Charge_Qualification_Supervisor.SnapshotNextSessionState_Payload = {
      val r = parser.parseBattery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionState_Payload()
      return r
    }
    val r = to(s, fBattery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionState_Payload _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDisposition_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition_Payload, isCompact: B): String = {
    val st = Printer.printBattery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDisposition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDisposition_Payload(s: String): Either[Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition_Payload, Json.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDisposition_Payload(parser: Parser): Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition_Payload = {
      val r = parser.parseBattery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDisposition_Payload()
      return r
    }
    val r = to(s, fBattery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDisposition_Payload _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargeReason_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason_Payload, isCompact: B): String = {
    val st = Printer.printBattery_Evidence_Charge_Qualification_SupervisorChargeReason_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargeReason_Payload(s: String): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason_Payload, Json.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargeReason_Payload(parser: Parser): Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason_Payload = {
      val r = parser.parseBattery_Evidence_Charge_Qualification_SupervisorChargeReason_Payload()
      return r
    }
    val r = to(s, fBattery_Evidence_Charge_Qualification_SupervisorChargeReason_Payload _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargePermission_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargePermission_Payload, isCompact: B): String = {
    val st = Printer.printBattery_Evidence_Charge_Qualification_SupervisorChargePermission_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargePermission_Payload(s: String): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargePermission_Payload, Json.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargePermission_Payload(parser: Parser): Battery_Evidence_Charge_Qualification_Supervisor.ChargePermission_Payload = {
      val r = parser.parseBattery_Evidence_Charge_Qualification_SupervisorChargePermission_Payload()
      return r
    }
    val r = to(s, fBattery_Evidence_Charge_Qualification_SupervisorChargePermission_Payload _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNotice_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice_Payload, isCompact: B): String = {
    val st = Printer.printBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNotice_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNotice_Payload(s: String): Either[Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice_Payload, Json.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNotice_Payload(parser: Parser): Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice_Payload = {
      val r = parser.parseBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNotice_Payload()
      return r
    }
    val r = to(s, fBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNotice_Payload _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorPilotSessionState_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.PilotSessionState_Payload, isCompact: B): String = {
    val st = Printer.printBattery_Evidence_Charge_Qualification_SupervisorPilotSessionState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorPilotSessionState_Payload(s: String): Either[Battery_Evidence_Charge_Qualification_Supervisor.PilotSessionState_Payload, Json.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorPilotSessionState_Payload(parser: Parser): Battery_Evidence_Charge_Qualification_Supervisor.PilotSessionState_Payload = {
      val r = parser.parseBattery_Evidence_Charge_Qualification_SupervisorPilotSessionState_Payload()
      return r
    }
    val r = to(s, fBattery_Evidence_Charge_Qualification_SupervisorPilotSessionState_Payload _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorPilotChargeDisposition_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.PilotChargeDisposition_Payload, isCompact: B): String = {
    val st = Printer.printBattery_Evidence_Charge_Qualification_SupervisorPilotChargeDisposition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorPilotChargeDisposition_Payload(s: String): Either[Battery_Evidence_Charge_Qualification_Supervisor.PilotChargeDisposition_Payload, Json.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorPilotChargeDisposition_Payload(parser: Parser): Battery_Evidence_Charge_Qualification_Supervisor.PilotChargeDisposition_Payload = {
      val r = parser.parseBattery_Evidence_Charge_Qualification_SupervisorPilotChargeDisposition_Payload()
      return r
    }
    val r = to(s, fBattery_Evidence_Charge_Qualification_SupervisorPilotChargeDisposition_Payload _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorPilotAdvisory_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.PilotAdvisory_Payload, isCompact: B): String = {
    val st = Printer.printBattery_Evidence_Charge_Qualification_SupervisorPilotAdvisory_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorPilotAdvisory_Payload(s: String): Either[Battery_Evidence_Charge_Qualification_Supervisor.PilotAdvisory_Payload, Json.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorPilotAdvisory_Payload(parser: Parser): Battery_Evidence_Charge_Qualification_Supervisor.PilotAdvisory_Payload = {
      val r = parser.parseBattery_Evidence_Charge_Qualification_SupervisorPilotAdvisory_Payload()
      return r
    }
    val r = to(s, fBattery_Evidence_Charge_Qualification_SupervisorPilotAdvisory_Payload _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionSnapshot, isCompact: B): String = {
    val st = Printer.printBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot(s: String): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionSnapshot, Json.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot(parser: Parser): Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionSnapshot = {
      val r = parser.parseBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot()
      return r
    }
    val r = to(s, fBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionSnapshot_Payload, isCompact: B): String = {
    val st = Printer.printBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot_Payload(s: String): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionSnapshot_Payload, Json.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot_Payload(parser: Parser): Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionSnapshot_Payload = {
      val r = parser.parseBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot_Payload()
      return r
    }
    val r = to(s, fBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot_Payload _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus(o: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatus, isCompact: B): String = {
    val st = Printer.printBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus(s: String): Either[Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatus, Json.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus(parser: Parser): Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatus = {
      val r = parser.parseBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus()
      return r
    }
    val r = to(s, fBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatus_Payload, isCompact: B): String = {
    val st = Printer.printBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus_Payload(s: String): Either[Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatus_Payload, Json.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus_Payload(parser: Parser): Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatus_Payload = {
      val r = parser.parseBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus_Payload()
      return r
    }
    val r = to(s, fBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus_Payload _)
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

  def fromBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container(o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container, isCompact: B): String = {
    val st = Printer.printBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container(s: String): Either[Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container, Json.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container(parser: Parser): Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container = {
      val r = parser.parseBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container()
      return r
    }
    val r = to(s, fBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P(o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P(s: String): Either[Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P, Json.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P(parser: Parser): Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P = {
      val r = parser.parseBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P()
      return r
    }
    val r = to(s, fBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS(o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS(s: String): Either[Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS, Json.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS(parser: Parser): Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS = {
      val r = parser.parseBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS()
      return r
    }
    val r = to(s, fBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container(o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container, isCompact: B): String = {
    val st = Printer.printBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container(s: String): Either[Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container, Json.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container(parser: Parser): Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container = {
      val r = parser.parseBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container()
      return r
    }
    val r = to(s, fBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P(o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P(s: String): Either[Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P, Json.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P(parser: Parser): Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P = {
      val r = parser.parseBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P()
      return r
    }
    val r = to(s, fBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS(o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS(s: String): Either[Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS, Json.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS(parser: Parser): Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS = {
      val r = parser.parseBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS()
      return r
    }
    val r = to(s, fBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container, isCompact: B): String = {
    val st = Printer.printBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container(s: String): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container, Json.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container(parser: Parser): Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container = {
      val r = parser.parseBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container()
      return r
    }
    val r = to(s, fBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P(s: String): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P, Json.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P(parser: Parser): Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P = {
      val r = parser.parseBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P()
      return r
    }
    val r = to(s, fBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS(s: String): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS, Json.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS(parser: Parser): Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS = {
      val r = parser.parseBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS()
      return r
    }
    val r = to(s, fBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container, isCompact: B): String = {
    val st = Printer.printBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container(s: String): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container, Json.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container(parser: Parser): Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container = {
      val r = parser.parseBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container()
      return r
    }
    val r = to(s, fBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P(s: String): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P, Json.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P(parser: Parser): Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P = {
      val r = parser.parseBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P()
      return r
    }
    val r = to(s, fBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS(s: String): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS, Json.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS(parser: Parser): Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS = {
      val r = parser.parseBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS()
      return r
    }
    val r = to(s, fBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container, isCompact: B): String = {
    val st = Printer.printBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container(s: String): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container, Json.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container(parser: Parser): Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container = {
      val r = parser.parseBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container()
      return r
    }
    val r = to(s, fBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P(s: String): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P, Json.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P(parser: Parser): Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P = {
      val r = parser.parseBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P()
      return r
    }
    val r = to(s, fBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS(s: String): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS, Json.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS(parser: Parser): Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS = {
      val r = parser.parseBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS()
      return r
    }
    val r = to(s, fBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container, isCompact: B): String = {
    val st = Printer.printBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container(s: String): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container, Json.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container(parser: Parser): Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container = {
      val r = parser.parseBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container()
      return r
    }
    val r = to(s, fBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P(s: String): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P, Json.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P(parser: Parser): Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P = {
      val r = parser.parseBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P()
      return r
    }
    val r = to(s, fBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS(s: String): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS, Json.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS(parser: Parser): Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS = {
      val r = parser.parseBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS()
      return r
    }
    val r = to(s, fBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container, isCompact: B): String = {
    val st = Printer.printBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container(s: String): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container, Json.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container(parser: Parser): Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container = {
      val r = parser.parseBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container()
      return r
    }
    val r = to(s, fBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P(s: String): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P, Json.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P(parser: Parser): Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P = {
      val r = parser.parseBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P()
      return r
    }
    val r = to(s, fBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS(s: String): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS, Json.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS(parser: Parser): Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS = {
      val r = parser.parseBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS()
      return r
    }
    val r = to(s, fBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container, isCompact: B): String = {
    val st = Printer.printBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container(s: String): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container, Json.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container(parser: Parser): Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container = {
      val r = parser.parseBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container()
      return r
    }
    val r = to(s, fBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P(s: String): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P, Json.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P(parser: Parser): Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P = {
      val r = parser.parseBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P()
      return r
    }
    val r = to(s, fBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS(s: String): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS, Json.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS(parser: Parser): Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS = {
      val r = parser.parseBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS()
      return r
    }
    val r = to(s, fBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container, isCompact: B): String = {
    val st = Printer.printBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container(s: String): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container, Json.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container(parser: Parser): Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container = {
      val r = parser.parseBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container()
      return r
    }
    val r = to(s, fBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P(s: String): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P, Json.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P(parser: Parser): Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P = {
      val r = parser.parseBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P()
      return r
    }
    val r = to(s, fBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS(s: String): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS, Json.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS(parser: Parser): Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS = {
      val r = parser.parseBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS()
      return r
    }
    val r = to(s, fBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container, isCompact: B): String = {
    val st = Printer.printBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container(s: String): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container, Json.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container(parser: Parser): Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container = {
      val r = parser.parseBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container()
      return r
    }
    val r = to(s, fBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P(s: String): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P, Json.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P(parser: Parser): Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P = {
      val r = parser.parseBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P()
      return r
    }
    val r = to(s, fBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS(s: String): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS, Json.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS(parser: Parser): Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS = {
      val r = parser.parseBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS()
      return r
    }
    val r = to(s, fBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container, isCompact: B): String = {
    val st = Printer.printBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container(s: String): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container, Json.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container(parser: Parser): Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container = {
      val r = parser.parseBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container()
      return r
    }
    val r = to(s, fBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P(s: String): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P, Json.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P(parser: Parser): Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P = {
      val r = parser.parseBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P()
      return r
    }
    val r = to(s, fBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS(s: String): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS, Json.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS(parser: Parser): Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS = {
      val r = parser.parseBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS()
      return r
    }
    val r = to(s, fBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container, isCompact: B): String = {
    val st = Printer.printBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container(s: String): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container, Json.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container(parser: Parser): Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container = {
      val r = parser.parseBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container()
      return r
    }
    val r = to(s, fBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P(s: String): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P, Json.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P(parser: Parser): Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P = {
      val r = parser.parseBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P()
      return r
    }
    val r = to(s, fBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS(s: String): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS, Json.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS(parser: Parser): Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS = {
      val r = parser.parseBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS()
      return r
    }
    val r = to(s, fBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container(o: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container, isCompact: B): String = {
    val st = Printer.printBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container(s: String): Either[Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container, Json.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container(parser: Parser): Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container = {
      val r = parser.parseBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container()
      return r
    }
    val r = to(s, fBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P(o: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P(s: String): Either[Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P, Json.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P(parser: Parser): Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P = {
      val r = parser.parseBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P()
      return r
    }
    val r = to(s, fBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS(o: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS(s: String): Either[Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS, Json.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS(parser: Parser): Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS = {
      val r = parser.parseBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS()
      return r
    }
    val r = to(s, fBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container(o: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container, isCompact: B): String = {
    val st = Printer.printBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container(s: String): Either[Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container, Json.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container(parser: Parser): Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container = {
      val r = parser.parseBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container()
      return r
    }
    val r = to(s, fBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P(o: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P(s: String): Either[Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P, Json.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P(parser: Parser): Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P = {
      val r = parser.parseBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P()
      return r
    }
    val r = to(s, fBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS(o: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS(s: String): Either[Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS, Json.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS(parser: Parser): Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS = {
      val r = parser.parseBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS()
      return r
    }
    val r = to(s, fBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container(o: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container, isCompact: B): String = {
    val st = Printer.printBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container(s: String): Either[Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container, Json.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container(parser: Parser): Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container = {
      val r = parser.parseBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container()
      return r
    }
    val r = to(s, fBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P(o: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P(s: String): Either[Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P, Json.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P(parser: Parser): Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P = {
      val r = parser.parseBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P()
      return r
    }
    val r = to(s, fBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS(o: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS(s: String): Either[Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS, Json.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS(parser: Parser): Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS = {
      val r = parser.parseBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS()
      return r
    }
    val r = to(s, fBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container(o: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container, isCompact: B): String = {
    val st = Printer.printBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container(s: String): Either[Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container, Json.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container(parser: Parser): Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container = {
      val r = parser.parseBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container()
      return r
    }
    val r = to(s, fBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P(o: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P(s: String): Either[Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P, Json.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P(parser: Parser): Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P = {
      val r = parser.parseBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P()
      return r
    }
    val r = to(s, fBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS(o: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS(s: String): Either[Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS, Json.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS(parser: Parser): Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS = {
      val r = parser.parseBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS()
      return r
    }
    val r = to(s, fBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS _)
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