// #Sireum
// @formatter:off

// This file is auto-generated from ServiceRequest.scala, PilotAdvisory.scala, SourceChargeSession.scala, ChargeSession.scala, SessionCase.scala, RequestResult.scala, BatteryBand.scala, Validity.scala, QualifiedBand.scala, ChargerReport.scala, ChargeInterfaceReport.scala, LifecyclePhase.scala, BatteryConfidence.scala, ConfidenceCase.scala, ChargeEligibility.scala, AttentionState.scala, AttentionCause.scala, AttentionCase.scala, PilotNotice.scala, FlightControlNotice.scala, ChargeAuthorization.scala, ChargerFacts.scala, InterfaceFacts.scala, LifecycleFacts.scala, FaultVector.scala, AdvisoryFacts.scala, PublishedSession.scala, PublishedRequestResult.scala, BatteryReportValue.scala, BatteryQualification.scala, LifecycleReportValue.scala, BatteryStateFacts.scala, AttentionResolution.scala, FaultFacts.scala, SessionResolution.scala, PublicDecisionFacts.scala, PilotStatus.scala, Base_Types.scala, CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_Containers.scala, BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_Containers.scala, ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_Containers.scala, ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_Containers.scala, LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_Containers.scala, BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_Containers.scala, ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_Containers.scala, AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_Containers.scala, BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_Containers.scala, FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_Containers.scala, ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_Containers.scala, NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_Containers.scala, AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package drone_battery_charge_qualification_supervisor

import org.sireum._
import org.sireum.Json.Printer._

object JSON {

  object Printer {

    @pure def printDrone_Battery_Charge_Qualification_SupervisorServiceRequestType(o: Drone_Battery_Charge_Qualification_Supervisor.ServiceRequest.Type): ST = {
      val value: String = o match {
        case Drone_Battery_Charge_Qualification_Supervisor.ServiceRequest.None => "None"
        case Drone_Battery_Charge_Qualification_Supervisor.ServiceRequest.Assess => "Assess"
        case Drone_Battery_Charge_Qualification_Supervisor.ServiceRequest.BeginCharge => "BeginCharge"
        case Drone_Battery_Charge_Qualification_Supervisor.ServiceRequest.EndCharge => "EndCharge"
        case Drone_Battery_Charge_Qualification_Supervisor.ServiceRequest.AcknowledgeNotice => "AcknowledgeNotice"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Battery_Charge_Qualification_Supervisor.ServiceRequest")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorServiceRequest_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.ServiceRequest_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.ServiceRequest_Payload""""),
        ("value", printDrone_Battery_Charge_Qualification_SupervisorServiceRequestType(o.value))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorPilotAdvisoryType(o: Drone_Battery_Charge_Qualification_Supervisor.PilotAdvisory.Type): ST = {
      val value: String = o match {
        case Drone_Battery_Charge_Qualification_Supervisor.PilotAdvisory.ADVISORY_UNKNOWN => "ADVISORY_UNKNOWN"
        case Drone_Battery_Charge_Qualification_Supervisor.PilotAdvisory.BATTERY_READY => "BATTERY_READY"
        case Drone_Battery_Charge_Qualification_Supervisor.PilotAdvisory.CHARGE_QUALIFIED => "CHARGE_QUALIFIED"
        case Drone_Battery_Charge_Qualification_Supervisor.PilotAdvisory.CHARGE_BLOCKED => "CHARGE_BLOCKED"
        case Drone_Battery_Charge_Qualification_Supervisor.PilotAdvisory.AIRBORNE_ATTENTION => "AIRBORNE_ATTENTION"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Battery_Charge_Qualification_Supervisor.PilotAdvisory")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorPilotAdvisory_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.PilotAdvisory_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.PilotAdvisory_Payload""""),
        ("value", printDrone_Battery_Charge_Qualification_SupervisorPilotAdvisoryType(o.value))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorSourceChargeSessionType(o: Drone_Battery_Charge_Qualification_Supervisor.SourceChargeSession.Type): ST = {
      val value: String = o match {
        case Drone_Battery_Charge_Qualification_Supervisor.SourceChargeSession.Idle => "Idle"
        case Drone_Battery_Charge_Qualification_Supervisor.SourceChargeSession.Eligible => "Eligible"
        case Drone_Battery_Charge_Qualification_Supervisor.SourceChargeSession.Authorized => "Authorized"
        case Drone_Battery_Charge_Qualification_Supervisor.SourceChargeSession.Suspended => "Suspended"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Battery_Charge_Qualification_Supervisor.SourceChargeSession")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorSourceChargeSession_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.SourceChargeSession_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.SourceChargeSession_Payload""""),
        ("value", printDrone_Battery_Charge_Qualification_SupervisorSourceChargeSessionType(o.value))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorChargeSessionType(o: Drone_Battery_Charge_Qualification_Supervisor.ChargeSession.Type): ST = {
      val value: String = o match {
        case Drone_Battery_Charge_Qualification_Supervisor.ChargeSession.Idle => "Idle"
        case Drone_Battery_Charge_Qualification_Supervisor.ChargeSession.Eligible => "Eligible"
        case Drone_Battery_Charge_Qualification_Supervisor.ChargeSession.Authorized => "Authorized"
        case Drone_Battery_Charge_Qualification_Supervisor.ChargeSession.Suspended => "Suspended"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Battery_Charge_Qualification_Supervisor.ChargeSession")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorChargeSession_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.ChargeSession_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.ChargeSession_Payload""""),
        ("value", printDrone_Battery_Charge_Qualification_SupervisorChargeSessionType(o.value))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorSessionCaseType(o: Drone_Battery_Charge_Qualification_Supervisor.SessionCase.Type): ST = {
      val value: String = o match {
        case Drone_Battery_Charge_Qualification_Supervisor.SessionCase.SESS_01 => "SESS_01"
        case Drone_Battery_Charge_Qualification_Supervisor.SessionCase.SESS_02 => "SESS_02"
        case Drone_Battery_Charge_Qualification_Supervisor.SessionCase.SESS_03 => "SESS_03"
        case Drone_Battery_Charge_Qualification_Supervisor.SessionCase.SESS_04 => "SESS_04"
        case Drone_Battery_Charge_Qualification_Supervisor.SessionCase.SESS_05 => "SESS_05"
        case Drone_Battery_Charge_Qualification_Supervisor.SessionCase.SESS_06 => "SESS_06"
        case Drone_Battery_Charge_Qualification_Supervisor.SessionCase.SESS_07 => "SESS_07"
        case Drone_Battery_Charge_Qualification_Supervisor.SessionCase.SESS_08 => "SESS_08"
        case Drone_Battery_Charge_Qualification_Supervisor.SessionCase.SESS_09 => "SESS_09"
        case Drone_Battery_Charge_Qualification_Supervisor.SessionCase.SESS_10 => "SESS_10"
        case Drone_Battery_Charge_Qualification_Supervisor.SessionCase.SESS_11 => "SESS_11"
        case Drone_Battery_Charge_Qualification_Supervisor.SessionCase.SESS_12 => "SESS_12"
        case Drone_Battery_Charge_Qualification_Supervisor.SessionCase.SESS_13 => "SESS_13"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Battery_Charge_Qualification_Supervisor.SessionCase")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorSessionCase_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.SessionCase_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.SessionCase_Payload""""),
        ("value", printDrone_Battery_Charge_Qualification_SupervisorSessionCaseType(o.value))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorRequestResultType(o: Drone_Battery_Charge_Qualification_Supervisor.RequestResult.Type): ST = {
      val value: String = o match {
        case Drone_Battery_Charge_Qualification_Supervisor.RequestResult.None => "None"
        case Drone_Battery_Charge_Qualification_Supervisor.RequestResult.Accepted => "Accepted"
        case Drone_Battery_Charge_Qualification_Supervisor.RequestResult.Rejected => "Rejected"
        case Drone_Battery_Charge_Qualification_Supervisor.RequestResult.Deferred => "Deferred"
        case Drone_Battery_Charge_Qualification_Supervisor.RequestResult.NoEffect => "NoEffect"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Battery_Charge_Qualification_Supervisor.RequestResult")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorRequestResult_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.RequestResult_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.RequestResult_Payload""""),
        ("value", printDrone_Battery_Charge_Qualification_SupervisorRequestResultType(o.value))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorBatteryBandType(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryBand.Type): ST = {
      val value: String = o match {
        case Drone_Battery_Charge_Qualification_Supervisor.BatteryBand.Full => "Full"
        case Drone_Battery_Charge_Qualification_Supervisor.BatteryBand.Nominal => "Nominal"
        case Drone_Battery_Charge_Qualification_Supervisor.BatteryBand.Low => "Low"
        case Drone_Battery_Charge_Qualification_Supervisor.BatteryBand.Critical => "Critical"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Battery_Charge_Qualification_Supervisor.BatteryBand")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorBatteryBand_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryBand_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.BatteryBand_Payload""""),
        ("value", printDrone_Battery_Charge_Qualification_SupervisorBatteryBandType(o.value))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorValidityType(o: Drone_Battery_Charge_Qualification_Supervisor.Validity.Type): ST = {
      val value: String = o match {
        case Drone_Battery_Charge_Qualification_Supervisor.Validity.Valid => "Valid"
        case Drone_Battery_Charge_Qualification_Supervisor.Validity.Invalid => "Invalid"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Battery_Charge_Qualification_Supervisor.Validity")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorValidity_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.Validity_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.Validity_Payload""""),
        ("value", printDrone_Battery_Charge_Qualification_SupervisorValidityType(o.value))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorQualifiedBandType(o: Drone_Battery_Charge_Qualification_Supervisor.QualifiedBand.Type): ST = {
      val value: String = o match {
        case Drone_Battery_Charge_Qualification_Supervisor.QualifiedBand.Suppressed => "Suppressed"
        case Drone_Battery_Charge_Qualification_Supervisor.QualifiedBand.Full => "Full"
        case Drone_Battery_Charge_Qualification_Supervisor.QualifiedBand.Nominal => "Nominal"
        case Drone_Battery_Charge_Qualification_Supervisor.QualifiedBand.Low => "Low"
        case Drone_Battery_Charge_Qualification_Supervisor.QualifiedBand.Critical => "Critical"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Battery_Charge_Qualification_Supervisor.QualifiedBand")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorQualifiedBand_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.QualifiedBand_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.QualifiedBand_Payload""""),
        ("value", printDrone_Battery_Charge_Qualification_SupervisorQualifiedBandType(o.value))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorChargerReportType(o: Drone_Battery_Charge_Qualification_Supervisor.ChargerReport.Type): ST = {
      val value: String = o match {
        case Drone_Battery_Charge_Qualification_Supervisor.ChargerReport.Disconnected => "Disconnected"
        case Drone_Battery_Charge_Qualification_Supervisor.ChargerReport.Ready => "Ready"
        case Drone_Battery_Charge_Qualification_Supervisor.ChargerReport.Faulted => "Faulted"
        case Drone_Battery_Charge_Qualification_Supervisor.ChargerReport.Unknown => "Unknown"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Battery_Charge_Qualification_Supervisor.ChargerReport")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorChargerReport_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.ChargerReport_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.ChargerReport_Payload""""),
        ("value", printDrone_Battery_Charge_Qualification_SupervisorChargerReportType(o.value))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorChargeInterfaceReportType(o: Drone_Battery_Charge_Qualification_Supervisor.ChargeInterfaceReport.Type): ST = {
      val value: String = o match {
        case Drone_Battery_Charge_Qualification_Supervisor.ChargeInterfaceReport.Idle => "Idle"
        case Drone_Battery_Charge_Qualification_Supervisor.ChargeInterfaceReport.Active => "Active"
        case Drone_Battery_Charge_Qualification_Supervisor.ChargeInterfaceReport.Faulted => "Faulted"
        case Drone_Battery_Charge_Qualification_Supervisor.ChargeInterfaceReport.Unknown => "Unknown"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Battery_Charge_Qualification_Supervisor.ChargeInterfaceReport")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorChargeInterfaceReport_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.ChargeInterfaceReport_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.ChargeInterfaceReport_Payload""""),
        ("value", printDrone_Battery_Charge_Qualification_SupervisorChargeInterfaceReportType(o.value))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorLifecyclePhaseType(o: Drone_Battery_Charge_Qualification_Supervisor.LifecyclePhase.Type): ST = {
      val value: String = o match {
        case Drone_Battery_Charge_Qualification_Supervisor.LifecyclePhase.Off => "Off"
        case Drone_Battery_Charge_Qualification_Supervisor.LifecyclePhase.Standby => "Standby"
        case Drone_Battery_Charge_Qualification_Supervisor.LifecyclePhase.Charging => "Charging"
        case Drone_Battery_Charge_Qualification_Supervisor.LifecyclePhase.Ready => "Ready"
        case Drone_Battery_Charge_Qualification_Supervisor.LifecyclePhase.Flying => "Flying"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Battery_Charge_Qualification_Supervisor.LifecyclePhase")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorLifecyclePhase_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.LifecyclePhase_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.LifecyclePhase_Payload""""),
        ("value", printDrone_Battery_Charge_Qualification_SupervisorLifecyclePhaseType(o.value))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceType(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidence.Type): ST = {
      val value: String = o match {
        case Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidence.Untrusted => "Untrusted"
        case Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidence.Confirming => "Confirming"
        case Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidence.Trusted => "Trusted"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidence")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorBatteryConfidence_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidence_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidence_Payload""""),
        ("value", printDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceType(o.value))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorConfidenceCaseType(o: Drone_Battery_Charge_Qualification_Supervisor.ConfidenceCase.Type): ST = {
      val value: String = o match {
        case Drone_Battery_Charge_Qualification_Supervisor.ConfidenceCase.CONF_01 => "CONF_01"
        case Drone_Battery_Charge_Qualification_Supervisor.ConfidenceCase.CONF_02 => "CONF_02"
        case Drone_Battery_Charge_Qualification_Supervisor.ConfidenceCase.CONF_03 => "CONF_03"
        case Drone_Battery_Charge_Qualification_Supervisor.ConfidenceCase.CONF_04 => "CONF_04"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Battery_Charge_Qualification_Supervisor.ConfidenceCase")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorConfidenceCase_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.ConfidenceCase_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.ConfidenceCase_Payload""""),
        ("value", printDrone_Battery_Charge_Qualification_SupervisorConfidenceCaseType(o.value))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityType(o: Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibility.Type): ST = {
      val value: String = o match {
        case Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibility.Blocked => "Blocked"
        case Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibility.NotNeeded => "NotNeeded"
        case Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibility.Permitted => "Permitted"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibility")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorChargeEligibility_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibility_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibility_Payload""""),
        ("value", printDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityType(o.value))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorAttentionStateType(o: Drone_Battery_Charge_Qualification_Supervisor.AttentionState.Type): ST = {
      val value: String = o match {
        case Drone_Battery_Charge_Qualification_Supervisor.AttentionState.Clear => "Clear"
        case Drone_Battery_Charge_Qualification_Supervisor.AttentionState.Attention => "Attention"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Battery_Charge_Qualification_Supervisor.AttentionState")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorAttentionState_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.AttentionState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.AttentionState_Payload""""),
        ("value", printDrone_Battery_Charge_Qualification_SupervisorAttentionStateType(o.value))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorAttentionCauseType(o: Drone_Battery_Charge_Qualification_Supervisor.AttentionCause.Type): ST = {
      val value: String = o match {
        case Drone_Battery_Charge_Qualification_Supervisor.AttentionCause.Untrusted => "Untrusted"
        case Drone_Battery_Charge_Qualification_Supervisor.AttentionCause.Critical => "Critical"
        case Drone_Battery_Charge_Qualification_Supervisor.AttentionCause.Low => "Low"
        case Drone_Battery_Charge_Qualification_Supervisor.AttentionCause.RecoveryPending => "RecoveryPending"
        case Drone_Battery_Charge_Qualification_Supervisor.AttentionCause.Clear => "Clear"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Battery_Charge_Qualification_Supervisor.AttentionCause")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorAttentionCause_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.AttentionCause_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.AttentionCause_Payload""""),
        ("value", printDrone_Battery_Charge_Qualification_SupervisorAttentionCauseType(o.value))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorAttentionCaseType(o: Drone_Battery_Charge_Qualification_Supervisor.AttentionCase.Type): ST = {
      val value: String = o match {
        case Drone_Battery_Charge_Qualification_Supervisor.AttentionCase.ATTN_01 => "ATTN_01"
        case Drone_Battery_Charge_Qualification_Supervisor.AttentionCase.ATTN_02 => "ATTN_02"
        case Drone_Battery_Charge_Qualification_Supervisor.AttentionCase.ATTN_03 => "ATTN_03"
        case Drone_Battery_Charge_Qualification_Supervisor.AttentionCase.ATTN_04 => "ATTN_04"
        case Drone_Battery_Charge_Qualification_Supervisor.AttentionCase.ATTN_05 => "ATTN_05"
        case Drone_Battery_Charge_Qualification_Supervisor.AttentionCase.ATTN_06 => "ATTN_06"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Battery_Charge_Qualification_Supervisor.AttentionCase")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorAttentionCase_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.AttentionCase_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.AttentionCase_Payload""""),
        ("value", printDrone_Battery_Charge_Qualification_SupervisorAttentionCaseType(o.value))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorPilotNoticeType(o: Drone_Battery_Charge_Qualification_Supervisor.PilotNotice.Type): ST = {
      val value: String = o match {
        case Drone_Battery_Charge_Qualification_Supervisor.PilotNotice.EvidenceUntrusted => "EvidenceUntrusted"
        case Drone_Battery_Charge_Qualification_Supervisor.PilotNotice.Critical => "Critical"
        case Drone_Battery_Charge_Qualification_Supervisor.PilotNotice.Low => "Low"
        case Drone_Battery_Charge_Qualification_Supervisor.PilotNotice.ChargeAttention => "ChargeAttention"
        case Drone_Battery_Charge_Qualification_Supervisor.PilotNotice.RecoveryPending => "RecoveryPending"
        case Drone_Battery_Charge_Qualification_Supervisor.PilotNotice.Clear => "Clear"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Battery_Charge_Qualification_Supervisor.PilotNotice")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorPilotNotice_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.PilotNotice_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.PilotNotice_Payload""""),
        ("value", printDrone_Battery_Charge_Qualification_SupervisorPilotNoticeType(o.value))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorFlightControlNoticeType(o: Drone_Battery_Charge_Qualification_Supervisor.FlightControlNotice.Type): ST = {
      val value: String = o match {
        case Drone_Battery_Charge_Qualification_Supervisor.FlightControlNotice.EvidenceUntrusted => "EvidenceUntrusted"
        case Drone_Battery_Charge_Qualification_Supervisor.FlightControlNotice.Critical => "Critical"
        case Drone_Battery_Charge_Qualification_Supervisor.FlightControlNotice.Low => "Low"
        case Drone_Battery_Charge_Qualification_Supervisor.FlightControlNotice.RecoveryPending => "RecoveryPending"
        case Drone_Battery_Charge_Qualification_Supervisor.FlightControlNotice.Clear => "Clear"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Battery_Charge_Qualification_Supervisor.FlightControlNotice")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorFlightControlNotice_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.FlightControlNotice_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.FlightControlNotice_Payload""""),
        ("value", printDrone_Battery_Charge_Qualification_SupervisorFlightControlNoticeType(o.value))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorChargeAuthorizationType(o: Drone_Battery_Charge_Qualification_Supervisor.ChargeAuthorization.Type): ST = {
      val value: String = o match {
        case Drone_Battery_Charge_Qualification_Supervisor.ChargeAuthorization.Denied => "Denied"
        case Drone_Battery_Charge_Qualification_Supervisor.ChargeAuthorization.Permitted => "Permitted"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Battery_Charge_Qualification_Supervisor.ChargeAuthorization")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorChargeAuthorization_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.ChargeAuthorization_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.ChargeAuthorization_Payload""""),
        ("value", printDrone_Battery_Charge_Qualification_SupervisorChargeAuthorizationType(o.value))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorChargerFacts(o: Drone_Battery_Charge_Qualification_Supervisor.ChargerFacts): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.ChargerFacts""""),
        ("chargerUsable", printB(o.chargerUsable)),
        ("chargerConnected", printB(o.chargerConnected)),
        ("chargerFault", printB(o.chargerFault))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorChargerFacts_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.ChargerFacts_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.ChargerFacts_Payload""""),
        ("value", printDrone_Battery_Charge_Qualification_SupervisorChargerFacts(o.value))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorInterfaceFacts(o: Drone_Battery_Charge_Qualification_Supervisor.InterfaceFacts): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.InterfaceFacts""""),
        ("interfaceHealthy", printB(o.interfaceHealthy)),
        ("activityObserved", printB(o.activityObserved)),
        ("interfaceFault", printB(o.interfaceFault))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorInterfaceFacts_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.InterfaceFacts_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.InterfaceFacts_Payload""""),
        ("value", printDrone_Battery_Charge_Qualification_SupervisorInterfaceFacts(o.value))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorLifecycleFacts(o: Drone_Battery_Charge_Qualification_Supervisor.LifecycleFacts): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.LifecycleFacts""""),
        ("chargeContextAllowed", printB(o.chargeContextAllowed)),
        ("airborneContext", printB(o.airborneContext)),
        ("contextValid", printB(o.contextValid)),
        ("contextFault", printB(o.contextFault))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorLifecycleFacts_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.LifecycleFacts_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.LifecycleFacts_Payload""""),
        ("value", printDrone_Battery_Charge_Qualification_SupervisorLifecycleFacts(o.value))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorFaultVector(o: Drone_Battery_Charge_Qualification_Supervisor.FaultVector): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.FaultVector""""),
        ("batteryFault", printB(o.batteryFault)),
        ("chargerFault", printB(o.chargerFault)),
        ("interfaceFault", printB(o.interfaceFault)),
        ("contextFault", printB(o.contextFault)),
        ("sessionConflict", printB(o.sessionConflict))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorFaultVector_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.FaultVector_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.FaultVector_Payload""""),
        ("value", printDrone_Battery_Charge_Qualification_SupervisorFaultVector(o.value))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorAdvisoryFacts(o: Drone_Battery_Charge_Qualification_Supervisor.AdvisoryFacts): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.AdvisoryFacts""""),
        ("advisoryValue", printDrone_Battery_Charge_Qualification_SupervisorPilotAdvisoryType(o.advisoryValue))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorAdvisoryFacts_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.AdvisoryFacts_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.AdvisoryFacts_Payload""""),
        ("value", printDrone_Battery_Charge_Qualification_SupervisorAdvisoryFacts(o.value))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorPublishedSession(o: Drone_Battery_Charge_Qualification_Supervisor.PublishedSession): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.PublishedSession""""),
        ("sessionValue", printDrone_Battery_Charge_Qualification_SupervisorChargeSessionType(o.sessionValue))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorPublishedSession_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.PublishedSession_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.PublishedSession_Payload""""),
        ("value", printDrone_Battery_Charge_Qualification_SupervisorPublishedSession(o.value))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorPublishedRequestResult(o: Drone_Battery_Charge_Qualification_Supervisor.PublishedRequestResult): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.PublishedRequestResult""""),
        ("requestResultValue", printDrone_Battery_Charge_Qualification_SupervisorRequestResultType(o.requestResultValue))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorPublishedRequestResult_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.PublishedRequestResult_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.PublishedRequestResult_Payload""""),
        ("value", printDrone_Battery_Charge_Qualification_SupervisorPublishedRequestResult(o.value))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorBatteryReportValue(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryReportValue): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.BatteryReportValue""""),
        ("band", printDrone_Battery_Charge_Qualification_SupervisorBatteryBandType(o.band)),
        ("validity", printDrone_Battery_Charge_Qualification_SupervisorValidityType(o.validity))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorBatteryReportValue_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryReportValue_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.BatteryReportValue_Payload""""),
        ("value", printDrone_Battery_Charge_Qualification_SupervisorBatteryReportValue(o.value))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorBatteryQualification(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryQualification): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.BatteryQualification""""),
        ("validEvidence", printB(o.validEvidence)),
        ("band", printDrone_Battery_Charge_Qualification_SupervisorQualifiedBandType(o.band))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorBatteryQualification_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryQualification_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.BatteryQualification_Payload""""),
        ("value", printDrone_Battery_Charge_Qualification_SupervisorBatteryQualification(o.value))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorLifecycleReportValue(o: Drone_Battery_Charge_Qualification_Supervisor.LifecycleReportValue): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.LifecycleReportValue""""),
        ("phase", printDrone_Battery_Charge_Qualification_SupervisorLifecyclePhaseType(o.phase)),
        ("validity", printDrone_Battery_Charge_Qualification_SupervisorValidityType(o.validity))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorLifecycleReportValue_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.LifecycleReportValue_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.LifecycleReportValue_Payload""""),
        ("value", printDrone_Battery_Charge_Qualification_SupervisorLifecycleReportValue(o.value))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryStateFacts): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.BatteryStateFacts""""),
        ("confidence", printDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceType(o.confidence)),
        ("band", printDrone_Battery_Charge_Qualification_SupervisorQualifiedBandType(o.band)),
        ("chargeNeeded", printB(o.chargeNeeded)),
        ("batteryUsable", printB(o.batteryUsable)),
        ("batteryFault", printB(o.batteryFault)),
        ("winningCase", printDrone_Battery_Charge_Qualification_SupervisorConfidenceCaseType(o.winningCase))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryStateFacts_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.BatteryStateFacts_Payload""""),
        ("value", printDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts(o.value))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorAttentionResolution(o: Drone_Battery_Charge_Qualification_Supervisor.AttentionResolution): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.AttentionResolution""""),
        ("newAttention", printDrone_Battery_Charge_Qualification_SupervisorAttentionStateType(o.newAttention)),
        ("cause", printDrone_Battery_Charge_Qualification_SupervisorAttentionCauseType(o.cause)),
        ("attentionClearedNow", printB(o.attentionClearedNow)),
        ("winningCase", printDrone_Battery_Charge_Qualification_SupervisorAttentionCaseType(o.winningCase))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorAttentionResolution_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.AttentionResolution_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.AttentionResolution_Payload""""),
        ("value", printDrone_Battery_Charge_Qualification_SupervisorAttentionResolution(o.value))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorFaultFacts(o: Drone_Battery_Charge_Qualification_Supervisor.FaultFacts): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.FaultFacts""""),
        ("vector", printDrone_Battery_Charge_Qualification_SupervisorFaultVector(o.vector)),
        ("aggregateFault", printB(o.aggregateFault))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorFaultFacts_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.FaultFacts_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.FaultFacts_Payload""""),
        ("value", printDrone_Battery_Charge_Qualification_SupervisorFaultFacts(o.value))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorSessionResolution(o: Drone_Battery_Charge_Qualification_Supervisor.SessionResolution): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.SessionResolution""""),
        ("sourceSession", printDrone_Battery_Charge_Qualification_SupervisorSourceChargeSessionType(o.sourceSession)),
        ("newSession", printDrone_Battery_Charge_Qualification_SupervisorPublishedSession(o.newSession)),
        ("sessionConflict", printB(o.sessionConflict)),
        ("winningCase", printDrone_Battery_Charge_Qualification_SupervisorSessionCaseType(o.winningCase))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorSessionResolution_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.SessionResolution_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.SessionResolution_Payload""""),
        ("value", printDrone_Battery_Charge_Qualification_SupervisorSessionResolution(o.value))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorPublicDecisionFacts(o: Drone_Battery_Charge_Qualification_Supervisor.PublicDecisionFacts): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.PublicDecisionFacts""""),
        ("advisory", printDrone_Battery_Charge_Qualification_SupervisorAdvisoryFacts(o.advisory)),
        ("requestResult", printDrone_Battery_Charge_Qualification_SupervisorPublishedRequestResult(o.requestResult)),
        ("newSession", printDrone_Battery_Charge_Qualification_SupervisorPublishedSession(o.newSession))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorPublicDecisionFacts_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.PublicDecisionFacts_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.PublicDecisionFacts_Payload""""),
        ("value", printDrone_Battery_Charge_Qualification_SupervisorPublicDecisionFacts(o.value))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorPilotStatus(o: Drone_Battery_Charge_Qualification_Supervisor.PilotStatus): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.PilotStatus""""),
        ("statusAdvisory", printDrone_Battery_Charge_Qualification_SupervisorAdvisoryFacts(o.statusAdvisory)),
        ("statusSession", printDrone_Battery_Charge_Qualification_SupervisorPublishedSession(o.statusSession)),
        ("statusRequestResult", printDrone_Battery_Charge_Qualification_SupervisorPublishedRequestResult(o.statusRequestResult)),
        ("faults", printDrone_Battery_Charge_Qualification_SupervisorFaultVector(o.faults)),
        ("aggregateFault", printB(o.aggregateFault))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorPilotStatus_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.PilotStatus_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.PilotStatus_Payload""""),
        ("value", printDrone_Battery_Charge_Qualification_SupervisorPilotStatus(o.value))
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

    @pure def printDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container): ST = {
      o match {
        case o: Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_P => return printDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PS => return printDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PS(o)
      }
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_P""""),
        ("api_advisoryIn", printDrone_Battery_Charge_Qualification_SupervisorAdvisoryFacts(o.api_advisoryIn)),
        ("api_attentionClearedIn", printB(o.api_attentionClearedIn)),
        ("api_requestIn", printDrone_Battery_Charge_Qualification_SupervisorServiceRequestType(o.api_requestIn)),
        ("api_sessionIn", printDrone_Battery_Charge_Qualification_SupervisorSessionResolution(o.api_sessionIn))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PS""""),
        ("api_advisoryIn", printDrone_Battery_Charge_Qualification_SupervisorAdvisoryFacts(o.api_advisoryIn)),
        ("api_attentionClearedIn", printB(o.api_attentionClearedIn)),
        ("api_requestIn", printDrone_Battery_Charge_Qualification_SupervisorServiceRequestType(o.api_requestIn)),
        ("api_sessionIn", printDrone_Battery_Charge_Qualification_SupervisorSessionResolution(o.api_sessionIn))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container): ST = {
      o match {
        case o: Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_P => return printDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PS => return printDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PS(o)
      }
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_P""""),
        ("api_publicFactsOut", printDrone_Battery_Charge_Qualification_SupervisorPublicDecisionFacts(o.api_publicFactsOut))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PS""""),
        ("api_publicFactsOut", printDrone_Battery_Charge_Qualification_SupervisorPublicDecisionFacts(o.api_publicFactsOut))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container): ST = {
      o match {
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_P => return printDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PS => return printDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PS(o)
      }
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_P""""),
        ("api_reportIn", printDrone_Battery_Charge_Qualification_SupervisorBatteryReportValue(o.api_reportIn))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PS""""),
        ("api_reportIn", printDrone_Battery_Charge_Qualification_SupervisorBatteryReportValue(o.api_reportIn))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container): ST = {
      o match {
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_P => return printDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PS => return printDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PS(o)
      }
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_P""""),
        ("api_qualificationOut", printDrone_Battery_Charge_Qualification_SupervisorBatteryQualification(o.api_qualificationOut))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PS""""),
        ("api_qualificationOut", printDrone_Battery_Charge_Qualification_SupervisorBatteryQualification(o.api_qualificationOut))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container): ST = {
      o match {
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_P => return printDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PS => return printDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PS(o)
      }
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_P""""),
        ("api_reportIn", printDrone_Battery_Charge_Qualification_SupervisorChargerReportType(o.api_reportIn))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PS""""),
        ("api_reportIn", printDrone_Battery_Charge_Qualification_SupervisorChargerReportType(o.api_reportIn))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container): ST = {
      o match {
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_P => return printDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PS => return printDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PS(o)
      }
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_P""""),
        ("api_factsToEligibility", printDrone_Battery_Charge_Qualification_SupervisorChargerFacts(o.api_factsToEligibility)),
        ("api_faultToAggregation", printB(o.api_faultToAggregation))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PS""""),
        ("api_factsToEligibility", printDrone_Battery_Charge_Qualification_SupervisorChargerFacts(o.api_factsToEligibility)),
        ("api_faultToAggregation", printB(o.api_faultToAggregation))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container): ST = {
      o match {
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_P => return printDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PS => return printDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PS(o)
      }
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_P""""),
        ("api_reportIn", printDrone_Battery_Charge_Qualification_SupervisorChargeInterfaceReportType(o.api_reportIn))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PS""""),
        ("api_reportIn", printDrone_Battery_Charge_Qualification_SupervisorChargeInterfaceReportType(o.api_reportIn))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container): ST = {
      o match {
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_P => return printDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PS => return printDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PS(o)
      }
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_P""""),
        ("api_factsToEligibility", printDrone_Battery_Charge_Qualification_SupervisorInterfaceFacts(o.api_factsToEligibility)),
        ("api_factsToSession", printDrone_Battery_Charge_Qualification_SupervisorInterfaceFacts(o.api_factsToSession)),
        ("api_faultToAggregation", printB(o.api_faultToAggregation))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PS""""),
        ("api_factsToEligibility", printDrone_Battery_Charge_Qualification_SupervisorInterfaceFacts(o.api_factsToEligibility)),
        ("api_factsToSession", printDrone_Battery_Charge_Qualification_SupervisorInterfaceFacts(o.api_factsToSession)),
        ("api_faultToAggregation", printB(o.api_faultToAggregation))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container): ST = {
      o match {
        case o: Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_P => return printDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PS => return printDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PS(o)
      }
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_P""""),
        ("api_reportIn", printDrone_Battery_Charge_Qualification_SupervisorLifecycleReportValue(o.api_reportIn))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PS""""),
        ("api_reportIn", printDrone_Battery_Charge_Qualification_SupervisorLifecycleReportValue(o.api_reportIn))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container): ST = {
      o match {
        case o: Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_P => return printDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PS => return printDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PS(o)
      }
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_P""""),
        ("api_factsToAdvisory", printDrone_Battery_Charge_Qualification_SupervisorLifecycleFacts(o.api_factsToAdvisory)),
        ("api_factsToEligibility", printDrone_Battery_Charge_Qualification_SupervisorLifecycleFacts(o.api_factsToEligibility)),
        ("api_faultToAggregation", printB(o.api_faultToAggregation))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PS""""),
        ("api_factsToAdvisory", printDrone_Battery_Charge_Qualification_SupervisorLifecycleFacts(o.api_factsToAdvisory)),
        ("api_factsToEligibility", printDrone_Battery_Charge_Qualification_SupervisorLifecycleFacts(o.api_factsToEligibility)),
        ("api_faultToAggregation", printB(o.api_faultToAggregation))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container): ST = {
      o match {
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_P => return printDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PS => return printDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PS(o)
      }
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_P""""),
        ("api_qualificationIn", printDrone_Battery_Charge_Qualification_SupervisorBatteryQualification(o.api_qualificationIn))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PS""""),
        ("api_qualificationIn", printDrone_Battery_Charge_Qualification_SupervisorBatteryQualification(o.api_qualificationIn))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container): ST = {
      o match {
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_P => return printDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PS => return printDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PS(o)
      }
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_P""""),
        ("api_faultToAggregation", printB(o.api_faultToAggregation)),
        ("api_stateToAdvisory", printDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts(o.api_stateToAdvisory)),
        ("api_stateToAttention", printDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts(o.api_stateToAttention)),
        ("api_stateToEligibility", printDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts(o.api_stateToEligibility))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PS""""),
        ("api_faultToAggregation", printB(o.api_faultToAggregation)),
        ("api_stateToAdvisory", printDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts(o.api_stateToAdvisory)),
        ("api_stateToAttention", printDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts(o.api_stateToAttention)),
        ("api_stateToEligibility", printDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts(o.api_stateToEligibility))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container): ST = {
      o match {
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_P => return printDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PS => return printDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PS(o)
      }
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_P""""),
        ("api_batteryIn", printDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts(o.api_batteryIn)),
        ("api_chargerIn", printDrone_Battery_Charge_Qualification_SupervisorChargerFacts(o.api_chargerIn)),
        ("api_interfaceIn", printDrone_Battery_Charge_Qualification_SupervisorInterfaceFacts(o.api_interfaceIn)),
        ("api_lifecycleIn", printDrone_Battery_Charge_Qualification_SupervisorLifecycleFacts(o.api_lifecycleIn))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PS""""),
        ("api_batteryIn", printDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts(o.api_batteryIn)),
        ("api_chargerIn", printDrone_Battery_Charge_Qualification_SupervisorChargerFacts(o.api_chargerIn)),
        ("api_interfaceIn", printDrone_Battery_Charge_Qualification_SupervisorInterfaceFacts(o.api_interfaceIn)),
        ("api_lifecycleIn", printDrone_Battery_Charge_Qualification_SupervisorLifecycleFacts(o.api_lifecycleIn))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container): ST = {
      o match {
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_P => return printDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PS => return printDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PS(o)
      }
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_P""""),
        ("api_eligibilityToAdvisory", printDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityType(o.api_eligibilityToAdvisory)),
        ("api_eligibilityToSession", printDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityType(o.api_eligibilityToSession))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PS""""),
        ("api_eligibilityToAdvisory", printDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityType(o.api_eligibilityToAdvisory)),
        ("api_eligibilityToSession", printDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityType(o.api_eligibilityToSession))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container): ST = {
      o match {
        case o: Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_P => return printDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PS => return printDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PS(o)
      }
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_P""""),
        ("api_batteryIn", printDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts(o.api_batteryIn)),
        ("api_requestIn", printDrone_Battery_Charge_Qualification_SupervisorServiceRequestType(o.api_requestIn))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PS""""),
        ("api_batteryIn", printDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts(o.api_batteryIn)),
        ("api_requestIn", printDrone_Battery_Charge_Qualification_SupervisorServiceRequestType(o.api_requestIn))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container): ST = {
      o match {
        case o: Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_P => return printDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PS => return printDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PS(o)
      }
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_P""""),
        ("api_clearedToRequestResult", printB(o.api_clearedToRequestResult)),
        ("api_resolutionToNotification", printDrone_Battery_Charge_Qualification_SupervisorAttentionResolution(o.api_resolutionToNotification))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PS""""),
        ("api_clearedToRequestResult", printB(o.api_clearedToRequestResult)),
        ("api_resolutionToNotification", printDrone_Battery_Charge_Qualification_SupervisorAttentionResolution(o.api_resolutionToNotification))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container): ST = {
      o match {
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_P => return printDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PS => return printDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PS(o)
      }
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_P""""),
        ("api_batteryIn", printDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts(o.api_batteryIn)),
        ("api_eligibilityIn", printDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityType(o.api_eligibilityIn)),
        ("api_lifecycleIn", printDrone_Battery_Charge_Qualification_SupervisorLifecycleFacts(o.api_lifecycleIn))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PS""""),
        ("api_batteryIn", printDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts(o.api_batteryIn)),
        ("api_eligibilityIn", printDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityType(o.api_eligibilityIn)),
        ("api_lifecycleIn", printDrone_Battery_Charge_Qualification_SupervisorLifecycleFacts(o.api_lifecycleIn))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container): ST = {
      o match {
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_P => return printDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PS => return printDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PS(o)
      }
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_P""""),
        ("api_advisoryToRequestResult", printDrone_Battery_Charge_Qualification_SupervisorAdvisoryFacts(o.api_advisoryToRequestResult))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PS""""),
        ("api_advisoryToRequestResult", printDrone_Battery_Charge_Qualification_SupervisorAdvisoryFacts(o.api_advisoryToRequestResult))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container): ST = {
      o match {
        case o: Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_P => return printDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PS => return printDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PS(o)
      }
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_P""""),
        ("api_batteryFaultIn", printB(o.api_batteryFaultIn)),
        ("api_chargerFaultIn", printB(o.api_chargerFaultIn)),
        ("api_contextFaultIn", printB(o.api_contextFaultIn)),
        ("api_interfaceFaultIn", printB(o.api_interfaceFaultIn)),
        ("api_sessionConflictIn", printB(o.api_sessionConflictIn))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PS""""),
        ("api_batteryFaultIn", printB(o.api_batteryFaultIn)),
        ("api_chargerFaultIn", printB(o.api_chargerFaultIn)),
        ("api_contextFaultIn", printB(o.api_contextFaultIn)),
        ("api_interfaceFaultIn", printB(o.api_interfaceFaultIn)),
        ("api_sessionConflictIn", printB(o.api_sessionConflictIn))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container): ST = {
      o match {
        case o: Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_P => return printDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PS => return printDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PS(o)
      }
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_P""""),
        ("api_faultsToComposition", printDrone_Battery_Charge_Qualification_SupervisorFaultFacts(o.api_faultsToComposition)),
        ("api_faultsToNotification", printDrone_Battery_Charge_Qualification_SupervisorFaultFacts(o.api_faultsToNotification))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PS""""),
        ("api_faultsToComposition", printDrone_Battery_Charge_Qualification_SupervisorFaultFacts(o.api_faultsToComposition)),
        ("api_faultsToNotification", printDrone_Battery_Charge_Qualification_SupervisorFaultFacts(o.api_faultsToNotification))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container): ST = {
      o match {
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_P => return printDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PS => return printDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PS(o)
      }
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_P""""),
        ("api_eligibilityIn", printDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityType(o.api_eligibilityIn)),
        ("api_interfaceIn", printDrone_Battery_Charge_Qualification_SupervisorInterfaceFacts(o.api_interfaceIn)),
        ("api_requestIn", printDrone_Battery_Charge_Qualification_SupervisorServiceRequestType(o.api_requestIn))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PS""""),
        ("api_eligibilityIn", printDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityType(o.api_eligibilityIn)),
        ("api_interfaceIn", printDrone_Battery_Charge_Qualification_SupervisorInterfaceFacts(o.api_interfaceIn)),
        ("api_requestIn", printDrone_Battery_Charge_Qualification_SupervisorServiceRequestType(o.api_requestIn))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container): ST = {
      o match {
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_P => return printDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PS => return printDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PS(o)
      }
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_P""""),
        ("api_conflictToAggregation", printB(o.api_conflictToAggregation)),
        ("api_resolutionToNotification", printDrone_Battery_Charge_Qualification_SupervisorSessionResolution(o.api_resolutionToNotification))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PS""""),
        ("api_conflictToAggregation", printB(o.api_conflictToAggregation)),
        ("api_resolutionToNotification", printDrone_Battery_Charge_Qualification_SupervisorSessionResolution(o.api_resolutionToNotification))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container): ST = {
      o match {
        case o: Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_P => return printDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PS => return printDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PS(o)
      }
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_P""""),
        ("api_attentionIn", printDrone_Battery_Charge_Qualification_SupervisorAttentionResolution(o.api_attentionIn)),
        ("api_faultsIn", printDrone_Battery_Charge_Qualification_SupervisorFaultFacts(o.api_faultsIn)),
        ("api_sessionIn", printDrone_Battery_Charge_Qualification_SupervisorSessionResolution(o.api_sessionIn))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PS""""),
        ("api_attentionIn", printDrone_Battery_Charge_Qualification_SupervisorAttentionResolution(o.api_attentionIn)),
        ("api_faultsIn", printDrone_Battery_Charge_Qualification_SupervisorFaultFacts(o.api_faultsIn)),
        ("api_sessionIn", printDrone_Battery_Charge_Qualification_SupervisorSessionResolution(o.api_sessionIn))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container): ST = {
      o match {
        case o: Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_P => return printDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PS => return printDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PS(o)
      }
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_P""""),
        ("api_flightControlNoticeOut", printDrone_Battery_Charge_Qualification_SupervisorFlightControlNoticeType(o.api_flightControlNoticeOut)),
        ("api_pilotNoticeOut", printDrone_Battery_Charge_Qualification_SupervisorPilotNoticeType(o.api_pilotNoticeOut))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PS""""),
        ("api_flightControlNoticeOut", printDrone_Battery_Charge_Qualification_SupervisorFlightControlNoticeType(o.api_flightControlNoticeOut)),
        ("api_pilotNoticeOut", printDrone_Battery_Charge_Qualification_SupervisorPilotNoticeType(o.api_pilotNoticeOut))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container): ST = {
      o match {
        case o: Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_P => return printDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PS => return printDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PS(o)
      }
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_P""""),
        ("api_faultsIn", printDrone_Battery_Charge_Qualification_SupervisorFaultFacts(o.api_faultsIn)),
        ("api_publicFactsIn", printDrone_Battery_Charge_Qualification_SupervisorPublicDecisionFacts(o.api_publicFactsIn))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PS""""),
        ("api_faultsIn", printDrone_Battery_Charge_Qualification_SupervisorFaultFacts(o.api_faultsIn)),
        ("api_publicFactsIn", printDrone_Battery_Charge_Qualification_SupervisorPublicDecisionFacts(o.api_publicFactsIn))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container): ST = {
      o match {
        case o: Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_P => return printDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PS => return printDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PS(o)
      }
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_P""""),
        ("api_chargeAuthorizationOut", printDrone_Battery_Charge_Qualification_SupervisorChargeAuthorizationType(o.api_chargeAuthorizationOut)),
        ("api_pilotStatusOut", printDrone_Battery_Charge_Qualification_SupervisorPilotStatus(o.api_pilotStatusOut))
      ))
    }

    @pure def printDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PS""""),
        ("api_chargeAuthorizationOut", printDrone_Battery_Charge_Qualification_SupervisorChargeAuthorizationType(o.api_chargeAuthorizationOut)),
        ("api_pilotStatusOut", printDrone_Battery_Charge_Qualification_SupervisorPilotStatus(o.api_pilotStatusOut))
      ))
    }

    @pure def printruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): ST = {
      val value: String = o match {
        case runtimemonitor.ObservationKind.DroneBatteryChargeQualificationSystem_Instance_chargeQualificationProcess_currentRequestResultDecisionOwner_postInit => "DroneBatteryChargeQualificationSystem_Instance_chargeQualificationProcess_currentRequestResultDecisionOwner_postInit"
        case runtimemonitor.ObservationKind.DroneBatteryChargeQualificationSystem_Instance_chargeQualificationProcess_currentRequestResultDecisionOwner_preCompute => "DroneBatteryChargeQualificationSystem_Instance_chargeQualificationProcess_currentRequestResultDecisionOwner_preCompute"
        case runtimemonitor.ObservationKind.DroneBatteryChargeQualificationSystem_Instance_chargeQualificationProcess_currentRequestResultDecisionOwner_postCompute => "DroneBatteryChargeQualificationSystem_Instance_chargeQualificationProcess_currentRequestResultDecisionOwner_postCompute"
        case runtimemonitor.ObservationKind.DroneBatteryChargeQualificationSystem_Instance_chargeQualificationProcess_batteryEvidenceQualifier_postInit => "DroneBatteryChargeQualificationSystem_Instance_chargeQualificationProcess_batteryEvidenceQualifier_postInit"
        case runtimemonitor.ObservationKind.DroneBatteryChargeQualificationSystem_Instance_chargeQualificationProcess_batteryEvidenceQualifier_preCompute => "DroneBatteryChargeQualificationSystem_Instance_chargeQualificationProcess_batteryEvidenceQualifier_preCompute"
        case runtimemonitor.ObservationKind.DroneBatteryChargeQualificationSystem_Instance_chargeQualificationProcess_batteryEvidenceQualifier_postCompute => "DroneBatteryChargeQualificationSystem_Instance_chargeQualificationProcess_batteryEvidenceQualifier_postCompute"
        case runtimemonitor.ObservationKind.DroneBatteryChargeQualificationSystem_Instance_chargeQualificationProcess_chargerEvidenceQualifier_postInit => "DroneBatteryChargeQualificationSystem_Instance_chargeQualificationProcess_chargerEvidenceQualifier_postInit"
        case runtimemonitor.ObservationKind.DroneBatteryChargeQualificationSystem_Instance_chargeQualificationProcess_chargerEvidenceQualifier_preCompute => "DroneBatteryChargeQualificationSystem_Instance_chargeQualificationProcess_chargerEvidenceQualifier_preCompute"
        case runtimemonitor.ObservationKind.DroneBatteryChargeQualificationSystem_Instance_chargeQualificationProcess_chargerEvidenceQualifier_postCompute => "DroneBatteryChargeQualificationSystem_Instance_chargeQualificationProcess_chargerEvidenceQualifier_postCompute"
        case runtimemonitor.ObservationKind.DroneBatteryChargeQualificationSystem_Instance_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_postInit => "DroneBatteryChargeQualificationSystem_Instance_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_postInit"
        case runtimemonitor.ObservationKind.DroneBatteryChargeQualificationSystem_Instance_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_preCompute => "DroneBatteryChargeQualificationSystem_Instance_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_preCompute"
        case runtimemonitor.ObservationKind.DroneBatteryChargeQualificationSystem_Instance_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_postCompute => "DroneBatteryChargeQualificationSystem_Instance_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_postCompute"
        case runtimemonitor.ObservationKind.DroneBatteryChargeQualificationSystem_Instance_chargeQualificationProcess_lifecycleContextApplicabilityOwner_postInit => "DroneBatteryChargeQualificationSystem_Instance_chargeQualificationProcess_lifecycleContextApplicabilityOwner_postInit"
        case runtimemonitor.ObservationKind.DroneBatteryChargeQualificationSystem_Instance_chargeQualificationProcess_lifecycleContextApplicabilityOwner_preCompute => "DroneBatteryChargeQualificationSystem_Instance_chargeQualificationProcess_lifecycleContextApplicabilityOwner_preCompute"
        case runtimemonitor.ObservationKind.DroneBatteryChargeQualificationSystem_Instance_chargeQualificationProcess_lifecycleContextApplicabilityOwner_postCompute => "DroneBatteryChargeQualificationSystem_Instance_chargeQualificationProcess_lifecycleContextApplicabilityOwner_postCompute"
        case runtimemonitor.ObservationKind.DroneBatteryChargeQualificationSystem_Instance_chargeQualificationProcess_batteryConfidenceStateOwner_postInit => "DroneBatteryChargeQualificationSystem_Instance_chargeQualificationProcess_batteryConfidenceStateOwner_postInit"
        case runtimemonitor.ObservationKind.DroneBatteryChargeQualificationSystem_Instance_chargeQualificationProcess_batteryConfidenceStateOwner_preCompute => "DroneBatteryChargeQualificationSystem_Instance_chargeQualificationProcess_batteryConfidenceStateOwner_preCompute"
        case runtimemonitor.ObservationKind.DroneBatteryChargeQualificationSystem_Instance_chargeQualificationProcess_batteryConfidenceStateOwner_postCompute => "DroneBatteryChargeQualificationSystem_Instance_chargeQualificationProcess_batteryConfidenceStateOwner_postCompute"
        case runtimemonitor.ObservationKind.DroneBatteryChargeQualificationSystem_Instance_chargeQualificationProcess_chargeEligibilityDecisionOwner_postInit => "DroneBatteryChargeQualificationSystem_Instance_chargeQualificationProcess_chargeEligibilityDecisionOwner_postInit"
        case runtimemonitor.ObservationKind.DroneBatteryChargeQualificationSystem_Instance_chargeQualificationProcess_chargeEligibilityDecisionOwner_preCompute => "DroneBatteryChargeQualificationSystem_Instance_chargeQualificationProcess_chargeEligibilityDecisionOwner_preCompute"
        case runtimemonitor.ObservationKind.DroneBatteryChargeQualificationSystem_Instance_chargeQualificationProcess_chargeEligibilityDecisionOwner_postCompute => "DroneBatteryChargeQualificationSystem_Instance_chargeQualificationProcess_chargeEligibilityDecisionOwner_postCompute"
        case runtimemonitor.ObservationKind.DroneBatteryChargeQualificationSystem_Instance_chargeQualificationProcess_attentionLatchStateOwner_postInit => "DroneBatteryChargeQualificationSystem_Instance_chargeQualificationProcess_attentionLatchStateOwner_postInit"
        case runtimemonitor.ObservationKind.DroneBatteryChargeQualificationSystem_Instance_chargeQualificationProcess_attentionLatchStateOwner_preCompute => "DroneBatteryChargeQualificationSystem_Instance_chargeQualificationProcess_attentionLatchStateOwner_preCompute"
        case runtimemonitor.ObservationKind.DroneBatteryChargeQualificationSystem_Instance_chargeQualificationProcess_attentionLatchStateOwner_postCompute => "DroneBatteryChargeQualificationSystem_Instance_chargeQualificationProcess_attentionLatchStateOwner_postCompute"
        case runtimemonitor.ObservationKind.DroneBatteryChargeQualificationSystem_Instance_chargeQualificationProcess_batteryAdvisoryDecisionOwner_postInit => "DroneBatteryChargeQualificationSystem_Instance_chargeQualificationProcess_batteryAdvisoryDecisionOwner_postInit"
        case runtimemonitor.ObservationKind.DroneBatteryChargeQualificationSystem_Instance_chargeQualificationProcess_batteryAdvisoryDecisionOwner_preCompute => "DroneBatteryChargeQualificationSystem_Instance_chargeQualificationProcess_batteryAdvisoryDecisionOwner_preCompute"
        case runtimemonitor.ObservationKind.DroneBatteryChargeQualificationSystem_Instance_chargeQualificationProcess_batteryAdvisoryDecisionOwner_postCompute => "DroneBatteryChargeQualificationSystem_Instance_chargeQualificationProcess_batteryAdvisoryDecisionOwner_postCompute"
        case runtimemonitor.ObservationKind.DroneBatteryChargeQualificationSystem_Instance_chargeQualificationProcess_faultAggregationOwner_postInit => "DroneBatteryChargeQualificationSystem_Instance_chargeQualificationProcess_faultAggregationOwner_postInit"
        case runtimemonitor.ObservationKind.DroneBatteryChargeQualificationSystem_Instance_chargeQualificationProcess_faultAggregationOwner_preCompute => "DroneBatteryChargeQualificationSystem_Instance_chargeQualificationProcess_faultAggregationOwner_preCompute"
        case runtimemonitor.ObservationKind.DroneBatteryChargeQualificationSystem_Instance_chargeQualificationProcess_faultAggregationOwner_postCompute => "DroneBatteryChargeQualificationSystem_Instance_chargeQualificationProcess_faultAggregationOwner_postCompute"
        case runtimemonitor.ObservationKind.DroneBatteryChargeQualificationSystem_Instance_chargeQualificationProcess_chargeSessionPriorityStateOwner_postInit => "DroneBatteryChargeQualificationSystem_Instance_chargeQualificationProcess_chargeSessionPriorityStateOwner_postInit"
        case runtimemonitor.ObservationKind.DroneBatteryChargeQualificationSystem_Instance_chargeQualificationProcess_chargeSessionPriorityStateOwner_preCompute => "DroneBatteryChargeQualificationSystem_Instance_chargeQualificationProcess_chargeSessionPriorityStateOwner_preCompute"
        case runtimemonitor.ObservationKind.DroneBatteryChargeQualificationSystem_Instance_chargeQualificationProcess_chargeSessionPriorityStateOwner_postCompute => "DroneBatteryChargeQualificationSystem_Instance_chargeQualificationProcess_chargeSessionPriorityStateOwner_postCompute"
        case runtimemonitor.ObservationKind.DroneBatteryChargeQualificationSystem_Instance_chargeQualificationProcess_notificationCompositionOwner_postInit => "DroneBatteryChargeQualificationSystem_Instance_chargeQualificationProcess_notificationCompositionOwner_postInit"
        case runtimemonitor.ObservationKind.DroneBatteryChargeQualificationSystem_Instance_chargeQualificationProcess_notificationCompositionOwner_preCompute => "DroneBatteryChargeQualificationSystem_Instance_chargeQualificationProcess_notificationCompositionOwner_preCompute"
        case runtimemonitor.ObservationKind.DroneBatteryChargeQualificationSystem_Instance_chargeQualificationProcess_notificationCompositionOwner_postCompute => "DroneBatteryChargeQualificationSystem_Instance_chargeQualificationProcess_notificationCompositionOwner_postCompute"
        case runtimemonitor.ObservationKind.DroneBatteryChargeQualificationSystem_Instance_chargeQualificationProcess_authorizationStatusCompositionOwner_postInit => "DroneBatteryChargeQualificationSystem_Instance_chargeQualificationProcess_authorizationStatusCompositionOwner_postInit"
        case runtimemonitor.ObservationKind.DroneBatteryChargeQualificationSystem_Instance_chargeQualificationProcess_authorizationStatusCompositionOwner_preCompute => "DroneBatteryChargeQualificationSystem_Instance_chargeQualificationProcess_authorizationStatusCompositionOwner_preCompute"
        case runtimemonitor.ObservationKind.DroneBatteryChargeQualificationSystem_Instance_chargeQualificationProcess_authorizationStatusCompositionOwner_postCompute => "DroneBatteryChargeQualificationSystem_Instance_chargeQualificationProcess_authorizationStatusCompositionOwner_postCompute"
      }
      return printObject(ISZ(
        ("type", printString("runtimemonitor.ObservationKind")),
        ("value", printString(value))
      ))
    }

    @pure def printutilContainer(o: util.Container): ST = {
      o match {
        case o: util.EmptyContainer => return printutilEmptyContainer(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_P => return printDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PS => return printDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_P => return printDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PS => return printDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_P => return printDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_P => return printDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_P => return printDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PS => return printDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PS => return printDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PS => return printDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_P => return printDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_P => return printDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_P => return printDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PS => return printDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PS => return printDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PS => return printDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_P => return printDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PS => return printDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_P => return printDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PS => return printDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_P => return printDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_P => return printDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PS => return printDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PS => return printDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_P => return printDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_P => return printDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PS => return printDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PS => return printDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_P => return printDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PS => return printDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_P => return printDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PS => return printDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_P => return printDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PS => return printDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_P => return printDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PS => return printDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_P => return printDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PS => return printDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_P => return printDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PS => return printDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_P => return printDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_P => return printDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PS => return printDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PS => return printDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_P => return printDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_P => return printDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PS => return printDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PS => return printDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_P => return printDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PS => return printDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_P => return printDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PS => return printDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PS(o)
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
        case o: Drone_Battery_Charge_Qualification_Supervisor.Validity_Payload => return printDrone_Battery_Charge_Qualification_SupervisorValidity_Payload(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.FaultFacts_Payload => return printDrone_Battery_Charge_Qualification_SupervisorFaultFacts_Payload(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryBand_Payload => return printDrone_Battery_Charge_Qualification_SupervisorBatteryBand_Payload(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.PilotNotice_Payload => return printDrone_Battery_Charge_Qualification_SupervisorPilotNotice_Payload(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.SessionCase_Payload => return printDrone_Battery_Charge_Qualification_SupervisorSessionCase_Payload(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.FaultVector_Payload => return printDrone_Battery_Charge_Qualification_SupervisorFaultVector_Payload(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.PilotStatus_Payload => return printDrone_Battery_Charge_Qualification_SupervisorPilotStatus_Payload(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargerFacts_Payload => return printDrone_Battery_Charge_Qualification_SupervisorChargerFacts_Payload(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargeSession_Payload => return printDrone_Battery_Charge_Qualification_SupervisorChargeSession_Payload(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargerReport_Payload => return printDrone_Battery_Charge_Qualification_SupervisorChargerReport_Payload(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.RequestResult_Payload => return printDrone_Battery_Charge_Qualification_SupervisorRequestResult_Payload(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.QualifiedBand_Payload => return printDrone_Battery_Charge_Qualification_SupervisorQualifiedBand_Payload(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.AttentionCase_Payload => return printDrone_Battery_Charge_Qualification_SupervisorAttentionCase_Payload(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.PilotAdvisory_Payload => return printDrone_Battery_Charge_Qualification_SupervisorPilotAdvisory_Payload(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.AdvisoryFacts_Payload => return printDrone_Battery_Charge_Qualification_SupervisorAdvisoryFacts_Payload(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.AttentionState_Payload => return printDrone_Battery_Charge_Qualification_SupervisorAttentionState_Payload(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ConfidenceCase_Payload => return printDrone_Battery_Charge_Qualification_SupervisorConfidenceCase_Payload(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.LifecyclePhase_Payload => return printDrone_Battery_Charge_Qualification_SupervisorLifecyclePhase_Payload(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.AttentionCause_Payload => return printDrone_Battery_Charge_Qualification_SupervisorAttentionCause_Payload(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ServiceRequest_Payload => return printDrone_Battery_Charge_Qualification_SupervisorServiceRequest_Payload(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.InterfaceFacts_Payload => return printDrone_Battery_Charge_Qualification_SupervisorInterfaceFacts_Payload(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.LifecycleFacts_Payload => return printDrone_Battery_Charge_Qualification_SupervisorLifecycleFacts_Payload(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.PublishedSession_Payload => return printDrone_Battery_Charge_Qualification_SupervisorPublishedSession_Payload(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibility_Payload => return printDrone_Battery_Charge_Qualification_SupervisorChargeEligibility_Payload(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidence_Payload => return printDrone_Battery_Charge_Qualification_SupervisorBatteryConfidence_Payload(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.SessionResolution_Payload => return printDrone_Battery_Charge_Qualification_SupervisorSessionResolution_Payload(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryStateFacts_Payload => return printDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts_Payload(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryReportValue_Payload => return printDrone_Battery_Charge_Qualification_SupervisorBatteryReportValue_Payload(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargeAuthorization_Payload => return printDrone_Battery_Charge_Qualification_SupervisorChargeAuthorization_Payload(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.SourceChargeSession_Payload => return printDrone_Battery_Charge_Qualification_SupervisorSourceChargeSession_Payload(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.FlightControlNotice_Payload => return printDrone_Battery_Charge_Qualification_SupervisorFlightControlNotice_Payload(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.PublicDecisionFacts_Payload => return printDrone_Battery_Charge_Qualification_SupervisorPublicDecisionFacts_Payload(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.AttentionResolution_Payload => return printDrone_Battery_Charge_Qualification_SupervisorAttentionResolution_Payload(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryQualification_Payload => return printDrone_Battery_Charge_Qualification_SupervisorBatteryQualification_Payload(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.LifecycleReportValue_Payload => return printDrone_Battery_Charge_Qualification_SupervisorLifecycleReportValue_Payload(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargeInterfaceReport_Payload => return printDrone_Battery_Charge_Qualification_SupervisorChargeInterfaceReport_Payload(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.PublishedRequestResult_Payload => return printDrone_Battery_Charge_Qualification_SupervisorPublishedRequestResult_Payload(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_P => return printDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PS => return printDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_P => return printDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PS => return printDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_P => return printDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_P => return printDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_P => return printDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PS => return printDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PS => return printDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PS => return printDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_P => return printDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_P => return printDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_P => return printDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PS => return printDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PS => return printDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PS => return printDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_P => return printDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PS => return printDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_P => return printDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PS => return printDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_P => return printDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_P => return printDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PS => return printDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PS => return printDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_P => return printDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_P => return printDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PS => return printDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PS => return printDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_P => return printDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PS => return printDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_P => return printDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PS => return printDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_P => return printDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PS => return printDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_P => return printDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PS => return printDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_P => return printDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PS => return printDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_P => return printDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PS => return printDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_P => return printDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_P => return printDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PS => return printDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PS => return printDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_P => return printDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_P => return printDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PS => return printDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PS => return printDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_P => return printDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PS => return printDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PS(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_P => return printDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PS => return printDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PS(o)
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

    def parseDrone_Battery_Charge_Qualification_SupervisorServiceRequestType(): Drone_Battery_Charge_Qualification_Supervisor.ServiceRequest.Type = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorServiceRequestT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorServiceRequestT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.ServiceRequest.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.ServiceRequest")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Battery_Charge_Qualification_Supervisor.ServiceRequest.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Battery_Charge_Qualification_Supervisor.ServiceRequest.")
          return Drone_Battery_Charge_Qualification_Supervisor.ServiceRequest.byOrdinal(0).get
      }
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorServiceRequest_Payload(): Drone_Battery_Charge_Qualification_Supervisor.ServiceRequest_Payload = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorServiceRequest_PayloadT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorServiceRequest_PayloadT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.ServiceRequest_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.ServiceRequest_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Battery_Charge_Qualification_SupervisorServiceRequestType()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.ServiceRequest_Payload(value)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorPilotAdvisoryType(): Drone_Battery_Charge_Qualification_Supervisor.PilotAdvisory.Type = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorPilotAdvisoryT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorPilotAdvisoryT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.PilotAdvisory.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.PilotAdvisory")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Battery_Charge_Qualification_Supervisor.PilotAdvisory.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Battery_Charge_Qualification_Supervisor.PilotAdvisory.")
          return Drone_Battery_Charge_Qualification_Supervisor.PilotAdvisory.byOrdinal(0).get
      }
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorPilotAdvisory_Payload(): Drone_Battery_Charge_Qualification_Supervisor.PilotAdvisory_Payload = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorPilotAdvisory_PayloadT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorPilotAdvisory_PayloadT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.PilotAdvisory_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.PilotAdvisory_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Battery_Charge_Qualification_SupervisorPilotAdvisoryType()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.PilotAdvisory_Payload(value)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorSourceChargeSessionType(): Drone_Battery_Charge_Qualification_Supervisor.SourceChargeSession.Type = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorSourceChargeSessionT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorSourceChargeSessionT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.SourceChargeSession.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.SourceChargeSession")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Battery_Charge_Qualification_Supervisor.SourceChargeSession.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Battery_Charge_Qualification_Supervisor.SourceChargeSession.")
          return Drone_Battery_Charge_Qualification_Supervisor.SourceChargeSession.byOrdinal(0).get
      }
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorSourceChargeSession_Payload(): Drone_Battery_Charge_Qualification_Supervisor.SourceChargeSession_Payload = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorSourceChargeSession_PayloadT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorSourceChargeSession_PayloadT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.SourceChargeSession_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.SourceChargeSession_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Battery_Charge_Qualification_SupervisorSourceChargeSessionType()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.SourceChargeSession_Payload(value)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorChargeSessionType(): Drone_Battery_Charge_Qualification_Supervisor.ChargeSession.Type = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorChargeSessionT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorChargeSessionT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.ChargeSession.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.ChargeSession")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Battery_Charge_Qualification_Supervisor.ChargeSession.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Battery_Charge_Qualification_Supervisor.ChargeSession.")
          return Drone_Battery_Charge_Qualification_Supervisor.ChargeSession.byOrdinal(0).get
      }
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorChargeSession_Payload(): Drone_Battery_Charge_Qualification_Supervisor.ChargeSession_Payload = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorChargeSession_PayloadT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorChargeSession_PayloadT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.ChargeSession_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.ChargeSession_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Battery_Charge_Qualification_SupervisorChargeSessionType()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.ChargeSession_Payload(value)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorSessionCaseType(): Drone_Battery_Charge_Qualification_Supervisor.SessionCase.Type = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorSessionCaseT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorSessionCaseT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.SessionCase.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.SessionCase")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Battery_Charge_Qualification_Supervisor.SessionCase.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Battery_Charge_Qualification_Supervisor.SessionCase.")
          return Drone_Battery_Charge_Qualification_Supervisor.SessionCase.byOrdinal(0).get
      }
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorSessionCase_Payload(): Drone_Battery_Charge_Qualification_Supervisor.SessionCase_Payload = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorSessionCase_PayloadT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorSessionCase_PayloadT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.SessionCase_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.SessionCase_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Battery_Charge_Qualification_SupervisorSessionCaseType()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.SessionCase_Payload(value)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorRequestResultType(): Drone_Battery_Charge_Qualification_Supervisor.RequestResult.Type = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorRequestResultT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorRequestResultT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.RequestResult.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.RequestResult")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Battery_Charge_Qualification_Supervisor.RequestResult.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Battery_Charge_Qualification_Supervisor.RequestResult.")
          return Drone_Battery_Charge_Qualification_Supervisor.RequestResult.byOrdinal(0).get
      }
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorRequestResult_Payload(): Drone_Battery_Charge_Qualification_Supervisor.RequestResult_Payload = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorRequestResult_PayloadT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorRequestResult_PayloadT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.RequestResult_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.RequestResult_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Battery_Charge_Qualification_SupervisorRequestResultType()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.RequestResult_Payload(value)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorBatteryBandType(): Drone_Battery_Charge_Qualification_Supervisor.BatteryBand.Type = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorBatteryBandT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorBatteryBandT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.BatteryBand.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.BatteryBand")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Battery_Charge_Qualification_Supervisor.BatteryBand.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Battery_Charge_Qualification_Supervisor.BatteryBand.")
          return Drone_Battery_Charge_Qualification_Supervisor.BatteryBand.byOrdinal(0).get
      }
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorBatteryBand_Payload(): Drone_Battery_Charge_Qualification_Supervisor.BatteryBand_Payload = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorBatteryBand_PayloadT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorBatteryBand_PayloadT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.BatteryBand_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.BatteryBand_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Battery_Charge_Qualification_SupervisorBatteryBandType()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.BatteryBand_Payload(value)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorValidityType(): Drone_Battery_Charge_Qualification_Supervisor.Validity.Type = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorValidityT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorValidityT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.Validity.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.Validity")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Battery_Charge_Qualification_Supervisor.Validity.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Battery_Charge_Qualification_Supervisor.Validity.")
          return Drone_Battery_Charge_Qualification_Supervisor.Validity.byOrdinal(0).get
      }
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorValidity_Payload(): Drone_Battery_Charge_Qualification_Supervisor.Validity_Payload = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorValidity_PayloadT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorValidity_PayloadT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.Validity_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.Validity_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Battery_Charge_Qualification_SupervisorValidityType()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.Validity_Payload(value)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorQualifiedBandType(): Drone_Battery_Charge_Qualification_Supervisor.QualifiedBand.Type = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorQualifiedBandT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorQualifiedBandT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.QualifiedBand.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.QualifiedBand")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Battery_Charge_Qualification_Supervisor.QualifiedBand.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Battery_Charge_Qualification_Supervisor.QualifiedBand.")
          return Drone_Battery_Charge_Qualification_Supervisor.QualifiedBand.byOrdinal(0).get
      }
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorQualifiedBand_Payload(): Drone_Battery_Charge_Qualification_Supervisor.QualifiedBand_Payload = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorQualifiedBand_PayloadT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorQualifiedBand_PayloadT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.QualifiedBand_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.QualifiedBand_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Battery_Charge_Qualification_SupervisorQualifiedBandType()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.QualifiedBand_Payload(value)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorChargerReportType(): Drone_Battery_Charge_Qualification_Supervisor.ChargerReport.Type = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorChargerReportT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorChargerReportT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.ChargerReport.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.ChargerReport")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Battery_Charge_Qualification_Supervisor.ChargerReport.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Battery_Charge_Qualification_Supervisor.ChargerReport.")
          return Drone_Battery_Charge_Qualification_Supervisor.ChargerReport.byOrdinal(0).get
      }
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorChargerReport_Payload(): Drone_Battery_Charge_Qualification_Supervisor.ChargerReport_Payload = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorChargerReport_PayloadT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorChargerReport_PayloadT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.ChargerReport_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.ChargerReport_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Battery_Charge_Qualification_SupervisorChargerReportType()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.ChargerReport_Payload(value)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorChargeInterfaceReportType(): Drone_Battery_Charge_Qualification_Supervisor.ChargeInterfaceReport.Type = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorChargeInterfaceReportT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorChargeInterfaceReportT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.ChargeInterfaceReport.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.ChargeInterfaceReport")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Battery_Charge_Qualification_Supervisor.ChargeInterfaceReport.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Battery_Charge_Qualification_Supervisor.ChargeInterfaceReport.")
          return Drone_Battery_Charge_Qualification_Supervisor.ChargeInterfaceReport.byOrdinal(0).get
      }
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorChargeInterfaceReport_Payload(): Drone_Battery_Charge_Qualification_Supervisor.ChargeInterfaceReport_Payload = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorChargeInterfaceReport_PayloadT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorChargeInterfaceReport_PayloadT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.ChargeInterfaceReport_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.ChargeInterfaceReport_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Battery_Charge_Qualification_SupervisorChargeInterfaceReportType()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.ChargeInterfaceReport_Payload(value)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorLifecyclePhaseType(): Drone_Battery_Charge_Qualification_Supervisor.LifecyclePhase.Type = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorLifecyclePhaseT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorLifecyclePhaseT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.LifecyclePhase.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.LifecyclePhase")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Battery_Charge_Qualification_Supervisor.LifecyclePhase.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Battery_Charge_Qualification_Supervisor.LifecyclePhase.")
          return Drone_Battery_Charge_Qualification_Supervisor.LifecyclePhase.byOrdinal(0).get
      }
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorLifecyclePhase_Payload(): Drone_Battery_Charge_Qualification_Supervisor.LifecyclePhase_Payload = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorLifecyclePhase_PayloadT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorLifecyclePhase_PayloadT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.LifecyclePhase_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.LifecyclePhase_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Battery_Charge_Qualification_SupervisorLifecyclePhaseType()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.LifecyclePhase_Payload(value)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceType(): Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidence.Type = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidence.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidence")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidence.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidence.")
          return Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidence.byOrdinal(0).get
      }
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorBatteryConfidence_Payload(): Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidence_Payload = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorBatteryConfidence_PayloadT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorBatteryConfidence_PayloadT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidence_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidence_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceType()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidence_Payload(value)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorConfidenceCaseType(): Drone_Battery_Charge_Qualification_Supervisor.ConfidenceCase.Type = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorConfidenceCaseT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorConfidenceCaseT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.ConfidenceCase.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.ConfidenceCase")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Battery_Charge_Qualification_Supervisor.ConfidenceCase.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Battery_Charge_Qualification_Supervisor.ConfidenceCase.")
          return Drone_Battery_Charge_Qualification_Supervisor.ConfidenceCase.byOrdinal(0).get
      }
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorConfidenceCase_Payload(): Drone_Battery_Charge_Qualification_Supervisor.ConfidenceCase_Payload = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorConfidenceCase_PayloadT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorConfidenceCase_PayloadT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.ConfidenceCase_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.ConfidenceCase_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Battery_Charge_Qualification_SupervisorConfidenceCaseType()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.ConfidenceCase_Payload(value)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityType(): Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibility.Type = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibility.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibility")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibility.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibility.")
          return Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibility.byOrdinal(0).get
      }
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorChargeEligibility_Payload(): Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibility_Payload = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorChargeEligibility_PayloadT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorChargeEligibility_PayloadT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibility_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibility_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityType()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibility_Payload(value)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorAttentionStateType(): Drone_Battery_Charge_Qualification_Supervisor.AttentionState.Type = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorAttentionStateT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorAttentionStateT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.AttentionState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.AttentionState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Battery_Charge_Qualification_Supervisor.AttentionState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Battery_Charge_Qualification_Supervisor.AttentionState.")
          return Drone_Battery_Charge_Qualification_Supervisor.AttentionState.byOrdinal(0).get
      }
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorAttentionState_Payload(): Drone_Battery_Charge_Qualification_Supervisor.AttentionState_Payload = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorAttentionState_PayloadT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorAttentionState_PayloadT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.AttentionState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.AttentionState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Battery_Charge_Qualification_SupervisorAttentionStateType()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.AttentionState_Payload(value)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorAttentionCauseType(): Drone_Battery_Charge_Qualification_Supervisor.AttentionCause.Type = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorAttentionCauseT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorAttentionCauseT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.AttentionCause.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.AttentionCause")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Battery_Charge_Qualification_Supervisor.AttentionCause.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Battery_Charge_Qualification_Supervisor.AttentionCause.")
          return Drone_Battery_Charge_Qualification_Supervisor.AttentionCause.byOrdinal(0).get
      }
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorAttentionCause_Payload(): Drone_Battery_Charge_Qualification_Supervisor.AttentionCause_Payload = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorAttentionCause_PayloadT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorAttentionCause_PayloadT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.AttentionCause_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.AttentionCause_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Battery_Charge_Qualification_SupervisorAttentionCauseType()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.AttentionCause_Payload(value)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorAttentionCaseType(): Drone_Battery_Charge_Qualification_Supervisor.AttentionCase.Type = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorAttentionCaseT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorAttentionCaseT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.AttentionCase.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.AttentionCase")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Battery_Charge_Qualification_Supervisor.AttentionCase.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Battery_Charge_Qualification_Supervisor.AttentionCase.")
          return Drone_Battery_Charge_Qualification_Supervisor.AttentionCase.byOrdinal(0).get
      }
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorAttentionCase_Payload(): Drone_Battery_Charge_Qualification_Supervisor.AttentionCase_Payload = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorAttentionCase_PayloadT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorAttentionCase_PayloadT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.AttentionCase_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.AttentionCase_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Battery_Charge_Qualification_SupervisorAttentionCaseType()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.AttentionCase_Payload(value)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorPilotNoticeType(): Drone_Battery_Charge_Qualification_Supervisor.PilotNotice.Type = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorPilotNoticeT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorPilotNoticeT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.PilotNotice.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.PilotNotice")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Battery_Charge_Qualification_Supervisor.PilotNotice.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Battery_Charge_Qualification_Supervisor.PilotNotice.")
          return Drone_Battery_Charge_Qualification_Supervisor.PilotNotice.byOrdinal(0).get
      }
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorPilotNotice_Payload(): Drone_Battery_Charge_Qualification_Supervisor.PilotNotice_Payload = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorPilotNotice_PayloadT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorPilotNotice_PayloadT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.PilotNotice_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.PilotNotice_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Battery_Charge_Qualification_SupervisorPilotNoticeType()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.PilotNotice_Payload(value)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorFlightControlNoticeType(): Drone_Battery_Charge_Qualification_Supervisor.FlightControlNotice.Type = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorFlightControlNoticeT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorFlightControlNoticeT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.FlightControlNotice.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.FlightControlNotice")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Battery_Charge_Qualification_Supervisor.FlightControlNotice.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Battery_Charge_Qualification_Supervisor.FlightControlNotice.")
          return Drone_Battery_Charge_Qualification_Supervisor.FlightControlNotice.byOrdinal(0).get
      }
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorFlightControlNotice_Payload(): Drone_Battery_Charge_Qualification_Supervisor.FlightControlNotice_Payload = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorFlightControlNotice_PayloadT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorFlightControlNotice_PayloadT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.FlightControlNotice_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.FlightControlNotice_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Battery_Charge_Qualification_SupervisorFlightControlNoticeType()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.FlightControlNotice_Payload(value)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorChargeAuthorizationType(): Drone_Battery_Charge_Qualification_Supervisor.ChargeAuthorization.Type = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorChargeAuthorizationT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorChargeAuthorizationT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.ChargeAuthorization.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.ChargeAuthorization")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Battery_Charge_Qualification_Supervisor.ChargeAuthorization.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Battery_Charge_Qualification_Supervisor.ChargeAuthorization.")
          return Drone_Battery_Charge_Qualification_Supervisor.ChargeAuthorization.byOrdinal(0).get
      }
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorChargeAuthorization_Payload(): Drone_Battery_Charge_Qualification_Supervisor.ChargeAuthorization_Payload = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorChargeAuthorization_PayloadT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorChargeAuthorization_PayloadT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.ChargeAuthorization_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.ChargeAuthorization_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Battery_Charge_Qualification_SupervisorChargeAuthorizationType()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.ChargeAuthorization_Payload(value)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorChargerFacts(): Drone_Battery_Charge_Qualification_Supervisor.ChargerFacts = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorChargerFactsT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorChargerFactsT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.ChargerFacts = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.ChargerFacts")
      }
      parser.parseObjectKey("chargerUsable")
      val chargerUsable = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("chargerConnected")
      val chargerConnected = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("chargerFault")
      val chargerFault = parser.parseB()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.ChargerFacts(chargerUsable, chargerConnected, chargerFault)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorChargerFacts_Payload(): Drone_Battery_Charge_Qualification_Supervisor.ChargerFacts_Payload = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorChargerFacts_PayloadT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorChargerFacts_PayloadT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.ChargerFacts_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.ChargerFacts_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Battery_Charge_Qualification_SupervisorChargerFacts()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.ChargerFacts_Payload(value)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorInterfaceFacts(): Drone_Battery_Charge_Qualification_Supervisor.InterfaceFacts = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorInterfaceFactsT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorInterfaceFactsT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.InterfaceFacts = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.InterfaceFacts")
      }
      parser.parseObjectKey("interfaceHealthy")
      val interfaceHealthy = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("activityObserved")
      val activityObserved = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("interfaceFault")
      val interfaceFault = parser.parseB()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.InterfaceFacts(interfaceHealthy, activityObserved, interfaceFault)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorInterfaceFacts_Payload(): Drone_Battery_Charge_Qualification_Supervisor.InterfaceFacts_Payload = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorInterfaceFacts_PayloadT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorInterfaceFacts_PayloadT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.InterfaceFacts_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.InterfaceFacts_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Battery_Charge_Qualification_SupervisorInterfaceFacts()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.InterfaceFacts_Payload(value)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorLifecycleFacts(): Drone_Battery_Charge_Qualification_Supervisor.LifecycleFacts = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorLifecycleFactsT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorLifecycleFactsT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.LifecycleFacts = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.LifecycleFacts")
      }
      parser.parseObjectKey("chargeContextAllowed")
      val chargeContextAllowed = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("airborneContext")
      val airborneContext = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("contextValid")
      val contextValid = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("contextFault")
      val contextFault = parser.parseB()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.LifecycleFacts(chargeContextAllowed, airborneContext, contextValid, contextFault)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorLifecycleFacts_Payload(): Drone_Battery_Charge_Qualification_Supervisor.LifecycleFacts_Payload = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorLifecycleFacts_PayloadT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorLifecycleFacts_PayloadT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.LifecycleFacts_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.LifecycleFacts_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Battery_Charge_Qualification_SupervisorLifecycleFacts()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.LifecycleFacts_Payload(value)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorFaultVector(): Drone_Battery_Charge_Qualification_Supervisor.FaultVector = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorFaultVectorT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorFaultVectorT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.FaultVector = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.FaultVector")
      }
      parser.parseObjectKey("batteryFault")
      val batteryFault = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("chargerFault")
      val chargerFault = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("interfaceFault")
      val interfaceFault = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("contextFault")
      val contextFault = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("sessionConflict")
      val sessionConflict = parser.parseB()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.FaultVector(batteryFault, chargerFault, interfaceFault, contextFault, sessionConflict)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorFaultVector_Payload(): Drone_Battery_Charge_Qualification_Supervisor.FaultVector_Payload = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorFaultVector_PayloadT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorFaultVector_PayloadT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.FaultVector_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.FaultVector_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Battery_Charge_Qualification_SupervisorFaultVector()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.FaultVector_Payload(value)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorAdvisoryFacts(): Drone_Battery_Charge_Qualification_Supervisor.AdvisoryFacts = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorAdvisoryFactsT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorAdvisoryFactsT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.AdvisoryFacts = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.AdvisoryFacts")
      }
      parser.parseObjectKey("advisoryValue")
      val advisoryValue = parseDrone_Battery_Charge_Qualification_SupervisorPilotAdvisoryType()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.AdvisoryFacts(advisoryValue)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorAdvisoryFacts_Payload(): Drone_Battery_Charge_Qualification_Supervisor.AdvisoryFacts_Payload = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorAdvisoryFacts_PayloadT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorAdvisoryFacts_PayloadT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.AdvisoryFacts_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.AdvisoryFacts_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Battery_Charge_Qualification_SupervisorAdvisoryFacts()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.AdvisoryFacts_Payload(value)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorPublishedSession(): Drone_Battery_Charge_Qualification_Supervisor.PublishedSession = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorPublishedSessionT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorPublishedSessionT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.PublishedSession = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.PublishedSession")
      }
      parser.parseObjectKey("sessionValue")
      val sessionValue = parseDrone_Battery_Charge_Qualification_SupervisorChargeSessionType()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.PublishedSession(sessionValue)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorPublishedSession_Payload(): Drone_Battery_Charge_Qualification_Supervisor.PublishedSession_Payload = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorPublishedSession_PayloadT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorPublishedSession_PayloadT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.PublishedSession_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.PublishedSession_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Battery_Charge_Qualification_SupervisorPublishedSession()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.PublishedSession_Payload(value)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorPublishedRequestResult(): Drone_Battery_Charge_Qualification_Supervisor.PublishedRequestResult = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorPublishedRequestResultT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorPublishedRequestResultT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.PublishedRequestResult = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.PublishedRequestResult")
      }
      parser.parseObjectKey("requestResultValue")
      val requestResultValue = parseDrone_Battery_Charge_Qualification_SupervisorRequestResultType()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.PublishedRequestResult(requestResultValue)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorPublishedRequestResult_Payload(): Drone_Battery_Charge_Qualification_Supervisor.PublishedRequestResult_Payload = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorPublishedRequestResult_PayloadT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorPublishedRequestResult_PayloadT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.PublishedRequestResult_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.PublishedRequestResult_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Battery_Charge_Qualification_SupervisorPublishedRequestResult()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.PublishedRequestResult_Payload(value)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorBatteryReportValue(): Drone_Battery_Charge_Qualification_Supervisor.BatteryReportValue = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorBatteryReportValueT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorBatteryReportValueT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.BatteryReportValue = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.BatteryReportValue")
      }
      parser.parseObjectKey("band")
      val band = parseDrone_Battery_Charge_Qualification_SupervisorBatteryBandType()
      parser.parseObjectNext()
      parser.parseObjectKey("validity")
      val validity = parseDrone_Battery_Charge_Qualification_SupervisorValidityType()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.BatteryReportValue(band, validity)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorBatteryReportValue_Payload(): Drone_Battery_Charge_Qualification_Supervisor.BatteryReportValue_Payload = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorBatteryReportValue_PayloadT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorBatteryReportValue_PayloadT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.BatteryReportValue_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.BatteryReportValue_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Battery_Charge_Qualification_SupervisorBatteryReportValue()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.BatteryReportValue_Payload(value)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorBatteryQualification(): Drone_Battery_Charge_Qualification_Supervisor.BatteryQualification = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorBatteryQualificationT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorBatteryQualificationT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.BatteryQualification = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.BatteryQualification")
      }
      parser.parseObjectKey("validEvidence")
      val validEvidence = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("band")
      val band = parseDrone_Battery_Charge_Qualification_SupervisorQualifiedBandType()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.BatteryQualification(validEvidence, band)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorBatteryQualification_Payload(): Drone_Battery_Charge_Qualification_Supervisor.BatteryQualification_Payload = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorBatteryQualification_PayloadT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorBatteryQualification_PayloadT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.BatteryQualification_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.BatteryQualification_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Battery_Charge_Qualification_SupervisorBatteryQualification()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.BatteryQualification_Payload(value)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorLifecycleReportValue(): Drone_Battery_Charge_Qualification_Supervisor.LifecycleReportValue = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorLifecycleReportValueT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorLifecycleReportValueT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.LifecycleReportValue = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.LifecycleReportValue")
      }
      parser.parseObjectKey("phase")
      val phase = parseDrone_Battery_Charge_Qualification_SupervisorLifecyclePhaseType()
      parser.parseObjectNext()
      parser.parseObjectKey("validity")
      val validity = parseDrone_Battery_Charge_Qualification_SupervisorValidityType()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.LifecycleReportValue(phase, validity)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorLifecycleReportValue_Payload(): Drone_Battery_Charge_Qualification_Supervisor.LifecycleReportValue_Payload = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorLifecycleReportValue_PayloadT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorLifecycleReportValue_PayloadT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.LifecycleReportValue_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.LifecycleReportValue_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Battery_Charge_Qualification_SupervisorLifecycleReportValue()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.LifecycleReportValue_Payload(value)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts(): Drone_Battery_Charge_Qualification_Supervisor.BatteryStateFacts = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorBatteryStateFactsT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorBatteryStateFactsT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.BatteryStateFacts = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.BatteryStateFacts")
      }
      parser.parseObjectKey("confidence")
      val confidence = parseDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceType()
      parser.parseObjectNext()
      parser.parseObjectKey("band")
      val band = parseDrone_Battery_Charge_Qualification_SupervisorQualifiedBandType()
      parser.parseObjectNext()
      parser.parseObjectKey("chargeNeeded")
      val chargeNeeded = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("batteryUsable")
      val batteryUsable = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("batteryFault")
      val batteryFault = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("winningCase")
      val winningCase = parseDrone_Battery_Charge_Qualification_SupervisorConfidenceCaseType()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.BatteryStateFacts(confidence, band, chargeNeeded, batteryUsable, batteryFault, winningCase)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts_Payload(): Drone_Battery_Charge_Qualification_Supervisor.BatteryStateFacts_Payload = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts_PayloadT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts_PayloadT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.BatteryStateFacts_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.BatteryStateFacts_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.BatteryStateFacts_Payload(value)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorAttentionResolution(): Drone_Battery_Charge_Qualification_Supervisor.AttentionResolution = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorAttentionResolutionT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorAttentionResolutionT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.AttentionResolution = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.AttentionResolution")
      }
      parser.parseObjectKey("newAttention")
      val newAttention = parseDrone_Battery_Charge_Qualification_SupervisorAttentionStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("cause")
      val cause = parseDrone_Battery_Charge_Qualification_SupervisorAttentionCauseType()
      parser.parseObjectNext()
      parser.parseObjectKey("attentionClearedNow")
      val attentionClearedNow = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("winningCase")
      val winningCase = parseDrone_Battery_Charge_Qualification_SupervisorAttentionCaseType()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.AttentionResolution(newAttention, cause, attentionClearedNow, winningCase)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorAttentionResolution_Payload(): Drone_Battery_Charge_Qualification_Supervisor.AttentionResolution_Payload = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorAttentionResolution_PayloadT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorAttentionResolution_PayloadT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.AttentionResolution_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.AttentionResolution_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Battery_Charge_Qualification_SupervisorAttentionResolution()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.AttentionResolution_Payload(value)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorFaultFacts(): Drone_Battery_Charge_Qualification_Supervisor.FaultFacts = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorFaultFactsT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorFaultFactsT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.FaultFacts = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.FaultFacts")
      }
      parser.parseObjectKey("vector")
      val vector = parseDrone_Battery_Charge_Qualification_SupervisorFaultVector()
      parser.parseObjectNext()
      parser.parseObjectKey("aggregateFault")
      val aggregateFault = parser.parseB()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.FaultFacts(vector, aggregateFault)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorFaultFacts_Payload(): Drone_Battery_Charge_Qualification_Supervisor.FaultFacts_Payload = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorFaultFacts_PayloadT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorFaultFacts_PayloadT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.FaultFacts_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.FaultFacts_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Battery_Charge_Qualification_SupervisorFaultFacts()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.FaultFacts_Payload(value)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorSessionResolution(): Drone_Battery_Charge_Qualification_Supervisor.SessionResolution = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorSessionResolutionT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorSessionResolutionT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.SessionResolution = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.SessionResolution")
      }
      parser.parseObjectKey("sourceSession")
      val sourceSession = parseDrone_Battery_Charge_Qualification_SupervisorSourceChargeSessionType()
      parser.parseObjectNext()
      parser.parseObjectKey("newSession")
      val newSession = parseDrone_Battery_Charge_Qualification_SupervisorPublishedSession()
      parser.parseObjectNext()
      parser.parseObjectKey("sessionConflict")
      val sessionConflict = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("winningCase")
      val winningCase = parseDrone_Battery_Charge_Qualification_SupervisorSessionCaseType()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.SessionResolution(sourceSession, newSession, sessionConflict, winningCase)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorSessionResolution_Payload(): Drone_Battery_Charge_Qualification_Supervisor.SessionResolution_Payload = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorSessionResolution_PayloadT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorSessionResolution_PayloadT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.SessionResolution_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.SessionResolution_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Battery_Charge_Qualification_SupervisorSessionResolution()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.SessionResolution_Payload(value)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorPublicDecisionFacts(): Drone_Battery_Charge_Qualification_Supervisor.PublicDecisionFacts = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorPublicDecisionFactsT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorPublicDecisionFactsT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.PublicDecisionFacts = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.PublicDecisionFacts")
      }
      parser.parseObjectKey("advisory")
      val advisory = parseDrone_Battery_Charge_Qualification_SupervisorAdvisoryFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("requestResult")
      val requestResult = parseDrone_Battery_Charge_Qualification_SupervisorPublishedRequestResult()
      parser.parseObjectNext()
      parser.parseObjectKey("newSession")
      val newSession = parseDrone_Battery_Charge_Qualification_SupervisorPublishedSession()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.PublicDecisionFacts(advisory, requestResult, newSession)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorPublicDecisionFacts_Payload(): Drone_Battery_Charge_Qualification_Supervisor.PublicDecisionFacts_Payload = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorPublicDecisionFacts_PayloadT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorPublicDecisionFacts_PayloadT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.PublicDecisionFacts_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.PublicDecisionFacts_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Battery_Charge_Qualification_SupervisorPublicDecisionFacts()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.PublicDecisionFacts_Payload(value)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorPilotStatus(): Drone_Battery_Charge_Qualification_Supervisor.PilotStatus = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorPilotStatusT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorPilotStatusT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.PilotStatus = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.PilotStatus")
      }
      parser.parseObjectKey("statusAdvisory")
      val statusAdvisory = parseDrone_Battery_Charge_Qualification_SupervisorAdvisoryFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("statusSession")
      val statusSession = parseDrone_Battery_Charge_Qualification_SupervisorPublishedSession()
      parser.parseObjectNext()
      parser.parseObjectKey("statusRequestResult")
      val statusRequestResult = parseDrone_Battery_Charge_Qualification_SupervisorPublishedRequestResult()
      parser.parseObjectNext()
      parser.parseObjectKey("faults")
      val faults = parseDrone_Battery_Charge_Qualification_SupervisorFaultVector()
      parser.parseObjectNext()
      parser.parseObjectKey("aggregateFault")
      val aggregateFault = parser.parseB()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.PilotStatus(statusAdvisory, statusSession, statusRequestResult, faults, aggregateFault)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorPilotStatus_Payload(): Drone_Battery_Charge_Qualification_Supervisor.PilotStatus_Payload = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorPilotStatus_PayloadT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorPilotStatus_PayloadT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.PilotStatus_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.PilotStatus_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Battery_Charge_Qualification_SupervisorPilotStatus()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.PilotStatus_Payload(value)
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

    def parseDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container(): Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_P", "Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PS"))
      t.native match {
        case "Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_P" => val r = parseDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PS" => val r = parseDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PST(T); return r
        case _ => val r = parseDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PST(T); return r
      }
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_P(): Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_P = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_P")
      }
      parser.parseObjectKey("api_advisoryIn")
      val api_advisoryIn = parseDrone_Battery_Charge_Qualification_SupervisorAdvisoryFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_attentionClearedIn")
      val api_attentionClearedIn = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("api_requestIn")
      val api_requestIn = parseDrone_Battery_Charge_Qualification_SupervisorServiceRequestType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_sessionIn")
      val api_sessionIn = parseDrone_Battery_Charge_Qualification_SupervisorSessionResolution()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_P(api_advisoryIn, api_attentionClearedIn, api_requestIn, api_sessionIn)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PS(): Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PS = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PST(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PST(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_advisoryIn")
      val api_advisoryIn = parseDrone_Battery_Charge_Qualification_SupervisorAdvisoryFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_attentionClearedIn")
      val api_attentionClearedIn = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("api_requestIn")
      val api_requestIn = parseDrone_Battery_Charge_Qualification_SupervisorServiceRequestType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_sessionIn")
      val api_sessionIn = parseDrone_Battery_Charge_Qualification_SupervisorSessionResolution()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PS(api_advisoryIn, api_attentionClearedIn, api_requestIn, api_sessionIn)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container(): Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_P", "Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PS"))
      t.native match {
        case "Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_P" => val r = parseDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PS" => val r = parseDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PST(T); return r
        case _ => val r = parseDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PST(T); return r
      }
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_P(): Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_P = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_P")
      }
      parser.parseObjectKey("api_publicFactsOut")
      val api_publicFactsOut = parseDrone_Battery_Charge_Qualification_SupervisorPublicDecisionFacts()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_P(api_publicFactsOut)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PS(): Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PS = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PST(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PST(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_publicFactsOut")
      val api_publicFactsOut = parseDrone_Battery_Charge_Qualification_SupervisorPublicDecisionFacts()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PS(api_publicFactsOut)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container(): Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_P", "Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PS"))
      t.native match {
        case "Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_P" => val r = parseDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PS" => val r = parseDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PST(T); return r
        case _ => val r = parseDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PST(T); return r
      }
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_P(): Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_P = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_P")
      }
      parser.parseObjectKey("api_reportIn")
      val api_reportIn = parseDrone_Battery_Charge_Qualification_SupervisorBatteryReportValue()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_P(api_reportIn)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PS(): Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PS = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PST(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PST(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PS")
      }
      parser.parseObjectKey("api_reportIn")
      val api_reportIn = parseDrone_Battery_Charge_Qualification_SupervisorBatteryReportValue()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PS(api_reportIn)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container(): Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_P", "Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PS"))
      t.native match {
        case "Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_P" => val r = parseDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PS" => val r = parseDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PST(T); return r
        case _ => val r = parseDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PST(T); return r
      }
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_P(): Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_P = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_P")
      }
      parser.parseObjectKey("api_qualificationOut")
      val api_qualificationOut = parseDrone_Battery_Charge_Qualification_SupervisorBatteryQualification()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_P(api_qualificationOut)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PS(): Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PS = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PST(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PST(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PS")
      }
      parser.parseObjectKey("api_qualificationOut")
      val api_qualificationOut = parseDrone_Battery_Charge_Qualification_SupervisorBatteryQualification()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PS(api_qualificationOut)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container(): Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_P", "Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PS"))
      t.native match {
        case "Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_P" => val r = parseDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PS" => val r = parseDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PST(T); return r
        case _ => val r = parseDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PST(T); return r
      }
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_P(): Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_P = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_P")
      }
      parser.parseObjectKey("api_reportIn")
      val api_reportIn = parseDrone_Battery_Charge_Qualification_SupervisorChargerReportType()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_P(api_reportIn)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PS(): Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PS = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PST(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PST(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PS")
      }
      parser.parseObjectKey("api_reportIn")
      val api_reportIn = parseDrone_Battery_Charge_Qualification_SupervisorChargerReportType()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PS(api_reportIn)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container(): Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_P", "Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PS"))
      t.native match {
        case "Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_P" => val r = parseDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PS" => val r = parseDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PST(T); return r
        case _ => val r = parseDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PST(T); return r
      }
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_P(): Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_P = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_P")
      }
      parser.parseObjectKey("api_factsToEligibility")
      val api_factsToEligibility = parseDrone_Battery_Charge_Qualification_SupervisorChargerFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_faultToAggregation")
      val api_faultToAggregation = parser.parseB()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_P(api_factsToEligibility, api_faultToAggregation)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PS(): Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PS = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PST(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PST(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PS")
      }
      parser.parseObjectKey("api_factsToEligibility")
      val api_factsToEligibility = parseDrone_Battery_Charge_Qualification_SupervisorChargerFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_faultToAggregation")
      val api_faultToAggregation = parser.parseB()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PS(api_factsToEligibility, api_faultToAggregation)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container(): Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_P", "Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PS"))
      t.native match {
        case "Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_P" => val r = parseDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PS" => val r = parseDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PST(T); return r
        case _ => val r = parseDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PST(T); return r
      }
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_P(): Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_P = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_P")
      }
      parser.parseObjectKey("api_reportIn")
      val api_reportIn = parseDrone_Battery_Charge_Qualification_SupervisorChargeInterfaceReportType()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_P(api_reportIn)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PS(): Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PS = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PST(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PST(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PS")
      }
      parser.parseObjectKey("api_reportIn")
      val api_reportIn = parseDrone_Battery_Charge_Qualification_SupervisorChargeInterfaceReportType()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PS(api_reportIn)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container(): Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_P", "Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PS"))
      t.native match {
        case "Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_P" => val r = parseDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PS" => val r = parseDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PST(T); return r
        case _ => val r = parseDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PST(T); return r
      }
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_P(): Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_P = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_P")
      }
      parser.parseObjectKey("api_factsToEligibility")
      val api_factsToEligibility = parseDrone_Battery_Charge_Qualification_SupervisorInterfaceFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_factsToSession")
      val api_factsToSession = parseDrone_Battery_Charge_Qualification_SupervisorInterfaceFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_faultToAggregation")
      val api_faultToAggregation = parser.parseB()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_P(api_factsToEligibility, api_factsToSession, api_faultToAggregation)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PS(): Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PS = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PST(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PST(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PS")
      }
      parser.parseObjectKey("api_factsToEligibility")
      val api_factsToEligibility = parseDrone_Battery_Charge_Qualification_SupervisorInterfaceFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_factsToSession")
      val api_factsToSession = parseDrone_Battery_Charge_Qualification_SupervisorInterfaceFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_faultToAggregation")
      val api_faultToAggregation = parser.parseB()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PS(api_factsToEligibility, api_factsToSession, api_faultToAggregation)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container(): Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_P", "Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PS"))
      t.native match {
        case "Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_P" => val r = parseDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PS" => val r = parseDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PST(T); return r
        case _ => val r = parseDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PST(T); return r
      }
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_P(): Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_P = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_P")
      }
      parser.parseObjectKey("api_reportIn")
      val api_reportIn = parseDrone_Battery_Charge_Qualification_SupervisorLifecycleReportValue()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_P(api_reportIn)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PS(): Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PS = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PST(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PST(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_reportIn")
      val api_reportIn = parseDrone_Battery_Charge_Qualification_SupervisorLifecycleReportValue()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PS(api_reportIn)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container(): Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_P", "Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PS"))
      t.native match {
        case "Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_P" => val r = parseDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PS" => val r = parseDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PST(T); return r
        case _ => val r = parseDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PST(T); return r
      }
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_P(): Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_P = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_P")
      }
      parser.parseObjectKey("api_factsToAdvisory")
      val api_factsToAdvisory = parseDrone_Battery_Charge_Qualification_SupervisorLifecycleFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_factsToEligibility")
      val api_factsToEligibility = parseDrone_Battery_Charge_Qualification_SupervisorLifecycleFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_faultToAggregation")
      val api_faultToAggregation = parser.parseB()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_P(api_factsToAdvisory, api_factsToEligibility, api_faultToAggregation)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PS(): Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PS = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PST(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PST(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_factsToAdvisory")
      val api_factsToAdvisory = parseDrone_Battery_Charge_Qualification_SupervisorLifecycleFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_factsToEligibility")
      val api_factsToEligibility = parseDrone_Battery_Charge_Qualification_SupervisorLifecycleFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_faultToAggregation")
      val api_faultToAggregation = parser.parseB()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PS(api_factsToAdvisory, api_factsToEligibility, api_faultToAggregation)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container(): Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_P", "Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PS"))
      t.native match {
        case "Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_P" => val r = parseDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PS" => val r = parseDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PST(T); return r
        case _ => val r = parseDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PST(T); return r
      }
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_P(): Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_P = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_P")
      }
      parser.parseObjectKey("api_qualificationIn")
      val api_qualificationIn = parseDrone_Battery_Charge_Qualification_SupervisorBatteryQualification()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_P(api_qualificationIn)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PS(): Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PS = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PST(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PST(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_qualificationIn")
      val api_qualificationIn = parseDrone_Battery_Charge_Qualification_SupervisorBatteryQualification()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PS(api_qualificationIn)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container(): Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_P", "Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PS"))
      t.native match {
        case "Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_P" => val r = parseDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PS" => val r = parseDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PST(T); return r
        case _ => val r = parseDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PST(T); return r
      }
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_P(): Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_P = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_P")
      }
      parser.parseObjectKey("api_faultToAggregation")
      val api_faultToAggregation = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("api_stateToAdvisory")
      val api_stateToAdvisory = parseDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_stateToAttention")
      val api_stateToAttention = parseDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_stateToEligibility")
      val api_stateToEligibility = parseDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_P(api_faultToAggregation, api_stateToAdvisory, api_stateToAttention, api_stateToEligibility)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PS(): Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PS = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PST(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PST(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_faultToAggregation")
      val api_faultToAggregation = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("api_stateToAdvisory")
      val api_stateToAdvisory = parseDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_stateToAttention")
      val api_stateToAttention = parseDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_stateToEligibility")
      val api_stateToEligibility = parseDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PS(api_faultToAggregation, api_stateToAdvisory, api_stateToAttention, api_stateToEligibility)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container(): Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_P", "Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PS"))
      t.native match {
        case "Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_P" => val r = parseDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PS" => val r = parseDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PST(T); return r
        case _ => val r = parseDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PST(T); return r
      }
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_P(): Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_P = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_P")
      }
      parser.parseObjectKey("api_batteryIn")
      val api_batteryIn = parseDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_chargerIn")
      val api_chargerIn = parseDrone_Battery_Charge_Qualification_SupervisorChargerFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_interfaceIn")
      val api_interfaceIn = parseDrone_Battery_Charge_Qualification_SupervisorInterfaceFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_lifecycleIn")
      val api_lifecycleIn = parseDrone_Battery_Charge_Qualification_SupervisorLifecycleFacts()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_P(api_batteryIn, api_chargerIn, api_interfaceIn, api_lifecycleIn)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PS(): Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PS = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PST(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PST(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_batteryIn")
      val api_batteryIn = parseDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_chargerIn")
      val api_chargerIn = parseDrone_Battery_Charge_Qualification_SupervisorChargerFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_interfaceIn")
      val api_interfaceIn = parseDrone_Battery_Charge_Qualification_SupervisorInterfaceFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_lifecycleIn")
      val api_lifecycleIn = parseDrone_Battery_Charge_Qualification_SupervisorLifecycleFacts()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PS(api_batteryIn, api_chargerIn, api_interfaceIn, api_lifecycleIn)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container(): Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_P", "Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PS"))
      t.native match {
        case "Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_P" => val r = parseDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PS" => val r = parseDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PST(T); return r
        case _ => val r = parseDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PST(T); return r
      }
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_P(): Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_P = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_P")
      }
      parser.parseObjectKey("api_eligibilityToAdvisory")
      val api_eligibilityToAdvisory = parseDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_eligibilityToSession")
      val api_eligibilityToSession = parseDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityType()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_P(api_eligibilityToAdvisory, api_eligibilityToSession)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PS(): Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PS = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PST(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PST(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_eligibilityToAdvisory")
      val api_eligibilityToAdvisory = parseDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_eligibilityToSession")
      val api_eligibilityToSession = parseDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityType()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PS(api_eligibilityToAdvisory, api_eligibilityToSession)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container(): Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_P", "Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PS"))
      t.native match {
        case "Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_P" => val r = parseDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PS" => val r = parseDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PST(T); return r
        case _ => val r = parseDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PST(T); return r
      }
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_P(): Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_P = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_P")
      }
      parser.parseObjectKey("api_batteryIn")
      val api_batteryIn = parseDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_requestIn")
      val api_requestIn = parseDrone_Battery_Charge_Qualification_SupervisorServiceRequestType()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_P(api_batteryIn, api_requestIn)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PS(): Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PS = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PST(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PST(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_batteryIn")
      val api_batteryIn = parseDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_requestIn")
      val api_requestIn = parseDrone_Battery_Charge_Qualification_SupervisorServiceRequestType()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PS(api_batteryIn, api_requestIn)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container(): Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_P", "Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PS"))
      t.native match {
        case "Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_P" => val r = parseDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PS" => val r = parseDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PST(T); return r
        case _ => val r = parseDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PST(T); return r
      }
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_P(): Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_P = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_P")
      }
      parser.parseObjectKey("api_clearedToRequestResult")
      val api_clearedToRequestResult = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("api_resolutionToNotification")
      val api_resolutionToNotification = parseDrone_Battery_Charge_Qualification_SupervisorAttentionResolution()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_P(api_clearedToRequestResult, api_resolutionToNotification)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PS(): Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PS = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PST(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PST(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_clearedToRequestResult")
      val api_clearedToRequestResult = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("api_resolutionToNotification")
      val api_resolutionToNotification = parseDrone_Battery_Charge_Qualification_SupervisorAttentionResolution()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PS(api_clearedToRequestResult, api_resolutionToNotification)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container(): Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_P", "Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PS"))
      t.native match {
        case "Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_P" => val r = parseDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PS" => val r = parseDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PST(T); return r
        case _ => val r = parseDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PST(T); return r
      }
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_P(): Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_P = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_P")
      }
      parser.parseObjectKey("api_batteryIn")
      val api_batteryIn = parseDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_eligibilityIn")
      val api_eligibilityIn = parseDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_lifecycleIn")
      val api_lifecycleIn = parseDrone_Battery_Charge_Qualification_SupervisorLifecycleFacts()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_P(api_batteryIn, api_eligibilityIn, api_lifecycleIn)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PS(): Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PS = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PST(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PST(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_batteryIn")
      val api_batteryIn = parseDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_eligibilityIn")
      val api_eligibilityIn = parseDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_lifecycleIn")
      val api_lifecycleIn = parseDrone_Battery_Charge_Qualification_SupervisorLifecycleFacts()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PS(api_batteryIn, api_eligibilityIn, api_lifecycleIn)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container(): Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_P", "Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PS"))
      t.native match {
        case "Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_P" => val r = parseDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PS" => val r = parseDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PST(T); return r
        case _ => val r = parseDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PST(T); return r
      }
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_P(): Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_P = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_P")
      }
      parser.parseObjectKey("api_advisoryToRequestResult")
      val api_advisoryToRequestResult = parseDrone_Battery_Charge_Qualification_SupervisorAdvisoryFacts()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_P(api_advisoryToRequestResult)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PS(): Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PS = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PST(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PST(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_advisoryToRequestResult")
      val api_advisoryToRequestResult = parseDrone_Battery_Charge_Qualification_SupervisorAdvisoryFacts()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PS(api_advisoryToRequestResult)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container(): Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_P", "Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PS"))
      t.native match {
        case "Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_P" => val r = parseDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PS" => val r = parseDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PST(T); return r
        case _ => val r = parseDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PST(T); return r
      }
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_P(): Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_P = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_P")
      }
      parser.parseObjectKey("api_batteryFaultIn")
      val api_batteryFaultIn = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("api_chargerFaultIn")
      val api_chargerFaultIn = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("api_contextFaultIn")
      val api_contextFaultIn = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("api_interfaceFaultIn")
      val api_interfaceFaultIn = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("api_sessionConflictIn")
      val api_sessionConflictIn = parser.parseB()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_P(api_batteryFaultIn, api_chargerFaultIn, api_contextFaultIn, api_interfaceFaultIn, api_sessionConflictIn)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PS(): Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PS = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PST(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PST(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_batteryFaultIn")
      val api_batteryFaultIn = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("api_chargerFaultIn")
      val api_chargerFaultIn = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("api_contextFaultIn")
      val api_contextFaultIn = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("api_interfaceFaultIn")
      val api_interfaceFaultIn = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("api_sessionConflictIn")
      val api_sessionConflictIn = parser.parseB()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PS(api_batteryFaultIn, api_chargerFaultIn, api_contextFaultIn, api_interfaceFaultIn, api_sessionConflictIn)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container(): Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_P", "Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PS"))
      t.native match {
        case "Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_P" => val r = parseDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PS" => val r = parseDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PST(T); return r
        case _ => val r = parseDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PST(T); return r
      }
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_P(): Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_P = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_P")
      }
      parser.parseObjectKey("api_faultsToComposition")
      val api_faultsToComposition = parseDrone_Battery_Charge_Qualification_SupervisorFaultFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_faultsToNotification")
      val api_faultsToNotification = parseDrone_Battery_Charge_Qualification_SupervisorFaultFacts()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_P(api_faultsToComposition, api_faultsToNotification)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PS(): Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PS = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PST(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PST(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_faultsToComposition")
      val api_faultsToComposition = parseDrone_Battery_Charge_Qualification_SupervisorFaultFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_faultsToNotification")
      val api_faultsToNotification = parseDrone_Battery_Charge_Qualification_SupervisorFaultFacts()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PS(api_faultsToComposition, api_faultsToNotification)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container(): Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_P", "Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PS"))
      t.native match {
        case "Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_P" => val r = parseDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PS" => val r = parseDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PST(T); return r
        case _ => val r = parseDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PST(T); return r
      }
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_P(): Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_P = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_P")
      }
      parser.parseObjectKey("api_eligibilityIn")
      val api_eligibilityIn = parseDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_interfaceIn")
      val api_interfaceIn = parseDrone_Battery_Charge_Qualification_SupervisorInterfaceFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_requestIn")
      val api_requestIn = parseDrone_Battery_Charge_Qualification_SupervisorServiceRequestType()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_P(api_eligibilityIn, api_interfaceIn, api_requestIn)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PS(): Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PS = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PST(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PST(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_eligibilityIn")
      val api_eligibilityIn = parseDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_interfaceIn")
      val api_interfaceIn = parseDrone_Battery_Charge_Qualification_SupervisorInterfaceFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_requestIn")
      val api_requestIn = parseDrone_Battery_Charge_Qualification_SupervisorServiceRequestType()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PS(api_eligibilityIn, api_interfaceIn, api_requestIn)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container(): Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_P", "Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PS"))
      t.native match {
        case "Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_P" => val r = parseDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PS" => val r = parseDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PST(T); return r
        case _ => val r = parseDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PST(T); return r
      }
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_P(): Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_P = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_P")
      }
      parser.parseObjectKey("api_conflictToAggregation")
      val api_conflictToAggregation = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("api_resolutionToNotification")
      val api_resolutionToNotification = parseDrone_Battery_Charge_Qualification_SupervisorSessionResolution()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_P(api_conflictToAggregation, api_resolutionToNotification)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PS(): Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PS = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PST(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PST(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_conflictToAggregation")
      val api_conflictToAggregation = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("api_resolutionToNotification")
      val api_resolutionToNotification = parseDrone_Battery_Charge_Qualification_SupervisorSessionResolution()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PS(api_conflictToAggregation, api_resolutionToNotification)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container(): Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_P", "Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PS"))
      t.native match {
        case "Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_P" => val r = parseDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PS" => val r = parseDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PST(T); return r
        case _ => val r = parseDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PST(T); return r
      }
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_P(): Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_P = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_P")
      }
      parser.parseObjectKey("api_attentionIn")
      val api_attentionIn = parseDrone_Battery_Charge_Qualification_SupervisorAttentionResolution()
      parser.parseObjectNext()
      parser.parseObjectKey("api_faultsIn")
      val api_faultsIn = parseDrone_Battery_Charge_Qualification_SupervisorFaultFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_sessionIn")
      val api_sessionIn = parseDrone_Battery_Charge_Qualification_SupervisorSessionResolution()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_P(api_attentionIn, api_faultsIn, api_sessionIn)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PS(): Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PS = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PST(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PST(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_attentionIn")
      val api_attentionIn = parseDrone_Battery_Charge_Qualification_SupervisorAttentionResolution()
      parser.parseObjectNext()
      parser.parseObjectKey("api_faultsIn")
      val api_faultsIn = parseDrone_Battery_Charge_Qualification_SupervisorFaultFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_sessionIn")
      val api_sessionIn = parseDrone_Battery_Charge_Qualification_SupervisorSessionResolution()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PS(api_attentionIn, api_faultsIn, api_sessionIn)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container(): Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_P", "Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PS"))
      t.native match {
        case "Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_P" => val r = parseDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PS" => val r = parseDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PST(T); return r
        case _ => val r = parseDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PST(T); return r
      }
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_P(): Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_P = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_P")
      }
      parser.parseObjectKey("api_flightControlNoticeOut")
      val api_flightControlNoticeOut = parseDrone_Battery_Charge_Qualification_SupervisorFlightControlNoticeType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_pilotNoticeOut")
      val api_pilotNoticeOut = parseDrone_Battery_Charge_Qualification_SupervisorPilotNoticeType()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_P(api_flightControlNoticeOut, api_pilotNoticeOut)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PS(): Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PS = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PST(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PST(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_flightControlNoticeOut")
      val api_flightControlNoticeOut = parseDrone_Battery_Charge_Qualification_SupervisorFlightControlNoticeType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_pilotNoticeOut")
      val api_pilotNoticeOut = parseDrone_Battery_Charge_Qualification_SupervisorPilotNoticeType()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PS(api_flightControlNoticeOut, api_pilotNoticeOut)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container(): Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_P", "Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PS"))
      t.native match {
        case "Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_P" => val r = parseDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PS" => val r = parseDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PST(T); return r
        case _ => val r = parseDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PST(T); return r
      }
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_P(): Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_P = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_P")
      }
      parser.parseObjectKey("api_faultsIn")
      val api_faultsIn = parseDrone_Battery_Charge_Qualification_SupervisorFaultFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_publicFactsIn")
      val api_publicFactsIn = parseDrone_Battery_Charge_Qualification_SupervisorPublicDecisionFacts()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_P(api_faultsIn, api_publicFactsIn)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PS(): Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PS = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PST(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PST(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_faultsIn")
      val api_faultsIn = parseDrone_Battery_Charge_Qualification_SupervisorFaultFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_publicFactsIn")
      val api_publicFactsIn = parseDrone_Battery_Charge_Qualification_SupervisorPublicDecisionFacts()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PS(api_faultsIn, api_publicFactsIn)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container(): Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_P", "Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PS"))
      t.native match {
        case "Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_P" => val r = parseDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PS" => val r = parseDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PST(T); return r
        case _ => val r = parseDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PST(T); return r
      }
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_P(): Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_P = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PT(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PT(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_P")
      }
      parser.parseObjectKey("api_chargeAuthorizationOut")
      val api_chargeAuthorizationOut = parseDrone_Battery_Charge_Qualification_SupervisorChargeAuthorizationType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_pilotStatusOut")
      val api_pilotStatusOut = parseDrone_Battery_Charge_Qualification_SupervisorPilotStatus()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_P(api_chargeAuthorizationOut, api_pilotStatusOut)
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PS(): Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PS = {
      val r = parseDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PST(F)
      return r
    }

    def parseDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PST(typeParsed: B): Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_chargeAuthorizationOut")
      val api_chargeAuthorizationOut = parseDrone_Battery_Charge_Qualification_SupervisorChargeAuthorizationType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_pilotStatusOut")
      val api_pilotStatusOut = parseDrone_Battery_Charge_Qualification_SupervisorPilotStatus()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PS(api_chargeAuthorizationOut, api_pilotStatusOut)
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
      val t = parser.parseObjectTypes(ISZ("util.EmptyContainer", "Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_P", "Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PS", "Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_P", "Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PS", "Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_P", "Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_P", "Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_P", "Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PS", "Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PS", "Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PS", "Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_P", "Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_P", "Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_P", "Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PS", "Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PS", "Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PS", "Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_P", "Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PS", "Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_P", "Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PS", "Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_P", "Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_P", "Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PS", "Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PS", "Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_P", "Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_P", "Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PS", "Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PS", "Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_P", "Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PS", "Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_P", "Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PS", "Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_P", "Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PS", "Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_P", "Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PS", "Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_P", "Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PS", "Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_P", "Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PS", "Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_P", "Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_P", "Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PS", "Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PS", "Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_P", "Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_P", "Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PS", "Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PS", "Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_P", "Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PS", "Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_P", "Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PS"))
      t.native match {
        case "util.EmptyContainer" => val r = parseutilEmptyContainerT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_P" => val r = parseDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PS" => val r = parseDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PST(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_P" => val r = parseDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PS" => val r = parseDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PST(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_P" => val r = parseDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_P" => val r = parseDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_P" => val r = parseDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PS" => val r = parseDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PST(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PS" => val r = parseDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PST(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PS" => val r = parseDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PST(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_P" => val r = parseDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_P" => val r = parseDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_P" => val r = parseDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PS" => val r = parseDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PST(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PS" => val r = parseDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PST(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PS" => val r = parseDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PST(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_P" => val r = parseDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PS" => val r = parseDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PST(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_P" => val r = parseDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PS" => val r = parseDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PST(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_P" => val r = parseDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_P" => val r = parseDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PS" => val r = parseDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PST(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PS" => val r = parseDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PST(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_P" => val r = parseDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_P" => val r = parseDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PS" => val r = parseDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PST(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PS" => val r = parseDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PST(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_P" => val r = parseDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PS" => val r = parseDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PST(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_P" => val r = parseDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PS" => val r = parseDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PST(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_P" => val r = parseDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PS" => val r = parseDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PST(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_P" => val r = parseDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PS" => val r = parseDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PST(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_P" => val r = parseDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PS" => val r = parseDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PST(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_P" => val r = parseDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PS" => val r = parseDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PST(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_P" => val r = parseDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_P" => val r = parseDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PS" => val r = parseDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PST(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PS" => val r = parseDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PST(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_P" => val r = parseDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_P" => val r = parseDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PS" => val r = parseDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PST(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PS" => val r = parseDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PST(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_P" => val r = parseDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PS" => val r = parseDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PST(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_P" => val r = parseDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PS" => val r = parseDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PST(T); return r
        case _ => val r = parseDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PST(T); return r
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
      val t = parser.parseObjectTypes(ISZ("art.Empty", "Base_Types.Boolean_Payload", "Base_Types.Integer_Payload", "Base_Types.Integer_8_Payload", "Base_Types.Integer_16_Payload", "Base_Types.Integer_32_Payload", "Base_Types.Integer_64_Payload", "Base_Types.Unsigned_8_Payload", "Base_Types.Unsigned_16_Payload", "Base_Types.Unsigned_32_Payload", "Base_Types.Unsigned_64_Payload", "Base_Types.Float_Payload", "Base_Types.Float_32_Payload", "Base_Types.Float_64_Payload", "Base_Types.Character_Payload", "Base_Types.String_Payload", "Base_Types.Bits_Payload", "util.EmptyContainer", "Drone_Battery_Charge_Qualification_Supervisor.Validity_Payload", "Drone_Battery_Charge_Qualification_Supervisor.FaultFacts_Payload", "Drone_Battery_Charge_Qualification_Supervisor.BatteryBand_Payload", "Drone_Battery_Charge_Qualification_Supervisor.PilotNotice_Payload", "Drone_Battery_Charge_Qualification_Supervisor.SessionCase_Payload", "Drone_Battery_Charge_Qualification_Supervisor.FaultVector_Payload", "Drone_Battery_Charge_Qualification_Supervisor.PilotStatus_Payload", "Drone_Battery_Charge_Qualification_Supervisor.ChargerFacts_Payload", "Drone_Battery_Charge_Qualification_Supervisor.ChargeSession_Payload", "Drone_Battery_Charge_Qualification_Supervisor.ChargerReport_Payload", "Drone_Battery_Charge_Qualification_Supervisor.RequestResult_Payload", "Drone_Battery_Charge_Qualification_Supervisor.QualifiedBand_Payload", "Drone_Battery_Charge_Qualification_Supervisor.AttentionCase_Payload", "Drone_Battery_Charge_Qualification_Supervisor.PilotAdvisory_Payload", "Drone_Battery_Charge_Qualification_Supervisor.AdvisoryFacts_Payload", "Drone_Battery_Charge_Qualification_Supervisor.AttentionState_Payload", "Drone_Battery_Charge_Qualification_Supervisor.ConfidenceCase_Payload", "Drone_Battery_Charge_Qualification_Supervisor.LifecyclePhase_Payload", "Drone_Battery_Charge_Qualification_Supervisor.AttentionCause_Payload", "Drone_Battery_Charge_Qualification_Supervisor.ServiceRequest_Payload", "Drone_Battery_Charge_Qualification_Supervisor.InterfaceFacts_Payload", "Drone_Battery_Charge_Qualification_Supervisor.LifecycleFacts_Payload", "Drone_Battery_Charge_Qualification_Supervisor.PublishedSession_Payload", "Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibility_Payload", "Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidence_Payload", "Drone_Battery_Charge_Qualification_Supervisor.SessionResolution_Payload", "Drone_Battery_Charge_Qualification_Supervisor.BatteryStateFacts_Payload", "Drone_Battery_Charge_Qualification_Supervisor.BatteryReportValue_Payload", "Drone_Battery_Charge_Qualification_Supervisor.ChargeAuthorization_Payload", "Drone_Battery_Charge_Qualification_Supervisor.SourceChargeSession_Payload", "Drone_Battery_Charge_Qualification_Supervisor.FlightControlNotice_Payload", "Drone_Battery_Charge_Qualification_Supervisor.PublicDecisionFacts_Payload", "Drone_Battery_Charge_Qualification_Supervisor.AttentionResolution_Payload", "Drone_Battery_Charge_Qualification_Supervisor.BatteryQualification_Payload", "Drone_Battery_Charge_Qualification_Supervisor.LifecycleReportValue_Payload", "Drone_Battery_Charge_Qualification_Supervisor.ChargeInterfaceReport_Payload", "Drone_Battery_Charge_Qualification_Supervisor.PublishedRequestResult_Payload", "Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_P", "Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PS", "Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_P", "Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PS", "Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_P", "Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_P", "Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_P", "Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PS", "Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PS", "Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PS", "Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_P", "Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_P", "Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_P", "Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PS", "Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PS", "Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PS", "Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_P", "Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PS", "Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_P", "Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PS", "Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_P", "Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_P", "Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PS", "Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PS", "Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_P", "Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_P", "Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PS", "Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PS", "Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_P", "Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PS", "Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_P", "Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PS", "Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_P", "Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PS", "Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_P", "Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PS", "Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_P", "Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PS", "Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_P", "Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PS", "Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_P", "Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_P", "Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PS", "Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PS", "Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_P", "Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_P", "Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PS", "Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PS", "Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_P", "Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PS", "Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_P", "Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PS"))
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
        case "Drone_Battery_Charge_Qualification_Supervisor.Validity_Payload" => val r = parseDrone_Battery_Charge_Qualification_SupervisorValidity_PayloadT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.FaultFacts_Payload" => val r = parseDrone_Battery_Charge_Qualification_SupervisorFaultFacts_PayloadT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.BatteryBand_Payload" => val r = parseDrone_Battery_Charge_Qualification_SupervisorBatteryBand_PayloadT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.PilotNotice_Payload" => val r = parseDrone_Battery_Charge_Qualification_SupervisorPilotNotice_PayloadT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.SessionCase_Payload" => val r = parseDrone_Battery_Charge_Qualification_SupervisorSessionCase_PayloadT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.FaultVector_Payload" => val r = parseDrone_Battery_Charge_Qualification_SupervisorFaultVector_PayloadT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.PilotStatus_Payload" => val r = parseDrone_Battery_Charge_Qualification_SupervisorPilotStatus_PayloadT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.ChargerFacts_Payload" => val r = parseDrone_Battery_Charge_Qualification_SupervisorChargerFacts_PayloadT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.ChargeSession_Payload" => val r = parseDrone_Battery_Charge_Qualification_SupervisorChargeSession_PayloadT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.ChargerReport_Payload" => val r = parseDrone_Battery_Charge_Qualification_SupervisorChargerReport_PayloadT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.RequestResult_Payload" => val r = parseDrone_Battery_Charge_Qualification_SupervisorRequestResult_PayloadT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.QualifiedBand_Payload" => val r = parseDrone_Battery_Charge_Qualification_SupervisorQualifiedBand_PayloadT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.AttentionCase_Payload" => val r = parseDrone_Battery_Charge_Qualification_SupervisorAttentionCase_PayloadT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.PilotAdvisory_Payload" => val r = parseDrone_Battery_Charge_Qualification_SupervisorPilotAdvisory_PayloadT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.AdvisoryFacts_Payload" => val r = parseDrone_Battery_Charge_Qualification_SupervisorAdvisoryFacts_PayloadT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.AttentionState_Payload" => val r = parseDrone_Battery_Charge_Qualification_SupervisorAttentionState_PayloadT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.ConfidenceCase_Payload" => val r = parseDrone_Battery_Charge_Qualification_SupervisorConfidenceCase_PayloadT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.LifecyclePhase_Payload" => val r = parseDrone_Battery_Charge_Qualification_SupervisorLifecyclePhase_PayloadT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.AttentionCause_Payload" => val r = parseDrone_Battery_Charge_Qualification_SupervisorAttentionCause_PayloadT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.ServiceRequest_Payload" => val r = parseDrone_Battery_Charge_Qualification_SupervisorServiceRequest_PayloadT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.InterfaceFacts_Payload" => val r = parseDrone_Battery_Charge_Qualification_SupervisorInterfaceFacts_PayloadT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.LifecycleFacts_Payload" => val r = parseDrone_Battery_Charge_Qualification_SupervisorLifecycleFacts_PayloadT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.PublishedSession_Payload" => val r = parseDrone_Battery_Charge_Qualification_SupervisorPublishedSession_PayloadT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibility_Payload" => val r = parseDrone_Battery_Charge_Qualification_SupervisorChargeEligibility_PayloadT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidence_Payload" => val r = parseDrone_Battery_Charge_Qualification_SupervisorBatteryConfidence_PayloadT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.SessionResolution_Payload" => val r = parseDrone_Battery_Charge_Qualification_SupervisorSessionResolution_PayloadT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.BatteryStateFacts_Payload" => val r = parseDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts_PayloadT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.BatteryReportValue_Payload" => val r = parseDrone_Battery_Charge_Qualification_SupervisorBatteryReportValue_PayloadT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.ChargeAuthorization_Payload" => val r = parseDrone_Battery_Charge_Qualification_SupervisorChargeAuthorization_PayloadT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.SourceChargeSession_Payload" => val r = parseDrone_Battery_Charge_Qualification_SupervisorSourceChargeSession_PayloadT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.FlightControlNotice_Payload" => val r = parseDrone_Battery_Charge_Qualification_SupervisorFlightControlNotice_PayloadT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.PublicDecisionFacts_Payload" => val r = parseDrone_Battery_Charge_Qualification_SupervisorPublicDecisionFacts_PayloadT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.AttentionResolution_Payload" => val r = parseDrone_Battery_Charge_Qualification_SupervisorAttentionResolution_PayloadT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.BatteryQualification_Payload" => val r = parseDrone_Battery_Charge_Qualification_SupervisorBatteryQualification_PayloadT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.LifecycleReportValue_Payload" => val r = parseDrone_Battery_Charge_Qualification_SupervisorLifecycleReportValue_PayloadT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.ChargeInterfaceReport_Payload" => val r = parseDrone_Battery_Charge_Qualification_SupervisorChargeInterfaceReport_PayloadT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.PublishedRequestResult_Payload" => val r = parseDrone_Battery_Charge_Qualification_SupervisorPublishedRequestResult_PayloadT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_P" => val r = parseDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PS" => val r = parseDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PST(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_P" => val r = parseDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PS" => val r = parseDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PST(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_P" => val r = parseDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_P" => val r = parseDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_P" => val r = parseDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PS" => val r = parseDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PST(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PS" => val r = parseDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PST(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PS" => val r = parseDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PST(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_P" => val r = parseDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_P" => val r = parseDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_P" => val r = parseDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PS" => val r = parseDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PST(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PS" => val r = parseDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PST(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PS" => val r = parseDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PST(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_P" => val r = parseDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PS" => val r = parseDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PST(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_P" => val r = parseDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PS" => val r = parseDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PST(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_P" => val r = parseDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_P" => val r = parseDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PS" => val r = parseDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PST(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PS" => val r = parseDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PST(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_P" => val r = parseDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_P" => val r = parseDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PS" => val r = parseDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PST(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PS" => val r = parseDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PST(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_P" => val r = parseDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PS" => val r = parseDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PST(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_P" => val r = parseDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PS" => val r = parseDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PST(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_P" => val r = parseDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PS" => val r = parseDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PST(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_P" => val r = parseDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PS" => val r = parseDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PST(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_P" => val r = parseDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PS" => val r = parseDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PST(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_P" => val r = parseDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PS" => val r = parseDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PST(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_P" => val r = parseDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_P" => val r = parseDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PS" => val r = parseDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PST(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PS" => val r = parseDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PST(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_P" => val r = parseDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_P" => val r = parseDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PS" => val r = parseDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PST(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PS" => val r = parseDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PST(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_P" => val r = parseDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PS" => val r = parseDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PST(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_P" => val r = parseDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PT(T); return r
        case "Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PS" => val r = parseDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PST(T); return r
        case _ => val r = parseDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PST(T); return r
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

  def fromDrone_Battery_Charge_Qualification_SupervisorServiceRequest_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.ServiceRequest_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorServiceRequest_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorServiceRequest_Payload(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.ServiceRequest_Payload, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorServiceRequest_Payload(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.ServiceRequest_Payload = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorServiceRequest_Payload()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorServiceRequest_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorPilotAdvisory_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.PilotAdvisory_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorPilotAdvisory_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorPilotAdvisory_Payload(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.PilotAdvisory_Payload, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorPilotAdvisory_Payload(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.PilotAdvisory_Payload = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorPilotAdvisory_Payload()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorPilotAdvisory_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorSourceChargeSession_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.SourceChargeSession_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorSourceChargeSession_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorSourceChargeSession_Payload(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.SourceChargeSession_Payload, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorSourceChargeSession_Payload(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.SourceChargeSession_Payload = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorSourceChargeSession_Payload()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorSourceChargeSession_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorChargeSession_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.ChargeSession_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorChargeSession_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorChargeSession_Payload(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.ChargeSession_Payload, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorChargeSession_Payload(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.ChargeSession_Payload = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorChargeSession_Payload()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorChargeSession_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorSessionCase_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.SessionCase_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorSessionCase_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorSessionCase_Payload(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.SessionCase_Payload, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorSessionCase_Payload(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.SessionCase_Payload = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorSessionCase_Payload()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorSessionCase_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorRequestResult_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.RequestResult_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorRequestResult_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorRequestResult_Payload(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.RequestResult_Payload, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorRequestResult_Payload(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.RequestResult_Payload = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorRequestResult_Payload()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorRequestResult_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorBatteryBand_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryBand_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorBatteryBand_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorBatteryBand_Payload(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.BatteryBand_Payload, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorBatteryBand_Payload(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.BatteryBand_Payload = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorBatteryBand_Payload()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorBatteryBand_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorValidity_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.Validity_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorValidity_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorValidity_Payload(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.Validity_Payload, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorValidity_Payload(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.Validity_Payload = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorValidity_Payload()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorValidity_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorQualifiedBand_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.QualifiedBand_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorQualifiedBand_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorQualifiedBand_Payload(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.QualifiedBand_Payload, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorQualifiedBand_Payload(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.QualifiedBand_Payload = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorQualifiedBand_Payload()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorQualifiedBand_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorChargerReport_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.ChargerReport_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorChargerReport_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorChargerReport_Payload(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.ChargerReport_Payload, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorChargerReport_Payload(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.ChargerReport_Payload = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorChargerReport_Payload()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorChargerReport_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorChargeInterfaceReport_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.ChargeInterfaceReport_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorChargeInterfaceReport_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorChargeInterfaceReport_Payload(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.ChargeInterfaceReport_Payload, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorChargeInterfaceReport_Payload(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.ChargeInterfaceReport_Payload = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorChargeInterfaceReport_Payload()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorChargeInterfaceReport_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorLifecyclePhase_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.LifecyclePhase_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorLifecyclePhase_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorLifecyclePhase_Payload(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.LifecyclePhase_Payload, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorLifecyclePhase_Payload(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.LifecyclePhase_Payload = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorLifecyclePhase_Payload()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorLifecyclePhase_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorBatteryConfidence_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidence_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorBatteryConfidence_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorBatteryConfidence_Payload(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidence_Payload, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorBatteryConfidence_Payload(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidence_Payload = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorBatteryConfidence_Payload()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorBatteryConfidence_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorConfidenceCase_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.ConfidenceCase_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorConfidenceCase_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorConfidenceCase_Payload(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.ConfidenceCase_Payload, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorConfidenceCase_Payload(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.ConfidenceCase_Payload = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorConfidenceCase_Payload()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorConfidenceCase_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorChargeEligibility_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibility_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorChargeEligibility_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorChargeEligibility_Payload(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibility_Payload, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorChargeEligibility_Payload(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibility_Payload = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorChargeEligibility_Payload()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorChargeEligibility_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorAttentionState_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.AttentionState_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorAttentionState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorAttentionState_Payload(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.AttentionState_Payload, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorAttentionState_Payload(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.AttentionState_Payload = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorAttentionState_Payload()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorAttentionState_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorAttentionCause_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.AttentionCause_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorAttentionCause_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorAttentionCause_Payload(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.AttentionCause_Payload, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorAttentionCause_Payload(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.AttentionCause_Payload = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorAttentionCause_Payload()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorAttentionCause_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorAttentionCase_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.AttentionCase_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorAttentionCase_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorAttentionCase_Payload(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.AttentionCase_Payload, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorAttentionCase_Payload(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.AttentionCase_Payload = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorAttentionCase_Payload()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorAttentionCase_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorPilotNotice_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.PilotNotice_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorPilotNotice_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorPilotNotice_Payload(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.PilotNotice_Payload, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorPilotNotice_Payload(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.PilotNotice_Payload = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorPilotNotice_Payload()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorPilotNotice_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorFlightControlNotice_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.FlightControlNotice_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorFlightControlNotice_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorFlightControlNotice_Payload(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.FlightControlNotice_Payload, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorFlightControlNotice_Payload(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.FlightControlNotice_Payload = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorFlightControlNotice_Payload()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorFlightControlNotice_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorChargeAuthorization_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.ChargeAuthorization_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorChargeAuthorization_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorChargeAuthorization_Payload(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.ChargeAuthorization_Payload, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorChargeAuthorization_Payload(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.ChargeAuthorization_Payload = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorChargeAuthorization_Payload()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorChargeAuthorization_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorChargerFacts(o: Drone_Battery_Charge_Qualification_Supervisor.ChargerFacts, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorChargerFacts(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorChargerFacts(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.ChargerFacts, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorChargerFacts(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.ChargerFacts = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorChargerFacts()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorChargerFacts _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorChargerFacts_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.ChargerFacts_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorChargerFacts_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorChargerFacts_Payload(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.ChargerFacts_Payload, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorChargerFacts_Payload(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.ChargerFacts_Payload = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorChargerFacts_Payload()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorChargerFacts_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorInterfaceFacts(o: Drone_Battery_Charge_Qualification_Supervisor.InterfaceFacts, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorInterfaceFacts(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorInterfaceFacts(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.InterfaceFacts, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorInterfaceFacts(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.InterfaceFacts = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorInterfaceFacts()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorInterfaceFacts _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorInterfaceFacts_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.InterfaceFacts_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorInterfaceFacts_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorInterfaceFacts_Payload(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.InterfaceFacts_Payload, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorInterfaceFacts_Payload(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.InterfaceFacts_Payload = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorInterfaceFacts_Payload()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorInterfaceFacts_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorLifecycleFacts(o: Drone_Battery_Charge_Qualification_Supervisor.LifecycleFacts, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorLifecycleFacts(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorLifecycleFacts(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.LifecycleFacts, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorLifecycleFacts(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.LifecycleFacts = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorLifecycleFacts()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorLifecycleFacts _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorLifecycleFacts_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.LifecycleFacts_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorLifecycleFacts_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorLifecycleFacts_Payload(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.LifecycleFacts_Payload, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorLifecycleFacts_Payload(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.LifecycleFacts_Payload = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorLifecycleFacts_Payload()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorLifecycleFacts_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorFaultVector(o: Drone_Battery_Charge_Qualification_Supervisor.FaultVector, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorFaultVector(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorFaultVector(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.FaultVector, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorFaultVector(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.FaultVector = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorFaultVector()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorFaultVector _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorFaultVector_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.FaultVector_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorFaultVector_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorFaultVector_Payload(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.FaultVector_Payload, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorFaultVector_Payload(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.FaultVector_Payload = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorFaultVector_Payload()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorFaultVector_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorAdvisoryFacts(o: Drone_Battery_Charge_Qualification_Supervisor.AdvisoryFacts, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorAdvisoryFacts(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorAdvisoryFacts(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.AdvisoryFacts, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorAdvisoryFacts(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.AdvisoryFacts = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorAdvisoryFacts()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorAdvisoryFacts _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorAdvisoryFacts_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.AdvisoryFacts_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorAdvisoryFacts_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorAdvisoryFacts_Payload(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.AdvisoryFacts_Payload, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorAdvisoryFacts_Payload(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.AdvisoryFacts_Payload = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorAdvisoryFacts_Payload()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorAdvisoryFacts_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorPublishedSession(o: Drone_Battery_Charge_Qualification_Supervisor.PublishedSession, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorPublishedSession(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorPublishedSession(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.PublishedSession, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorPublishedSession(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.PublishedSession = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorPublishedSession()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorPublishedSession _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorPublishedSession_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.PublishedSession_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorPublishedSession_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorPublishedSession_Payload(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.PublishedSession_Payload, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorPublishedSession_Payload(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.PublishedSession_Payload = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorPublishedSession_Payload()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorPublishedSession_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorPublishedRequestResult(o: Drone_Battery_Charge_Qualification_Supervisor.PublishedRequestResult, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorPublishedRequestResult(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorPublishedRequestResult(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.PublishedRequestResult, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorPublishedRequestResult(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.PublishedRequestResult = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorPublishedRequestResult()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorPublishedRequestResult _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorPublishedRequestResult_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.PublishedRequestResult_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorPublishedRequestResult_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorPublishedRequestResult_Payload(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.PublishedRequestResult_Payload, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorPublishedRequestResult_Payload(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.PublishedRequestResult_Payload = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorPublishedRequestResult_Payload()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorPublishedRequestResult_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorBatteryReportValue(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryReportValue, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorBatteryReportValue(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorBatteryReportValue(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.BatteryReportValue, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorBatteryReportValue(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.BatteryReportValue = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorBatteryReportValue()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorBatteryReportValue _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorBatteryReportValue_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryReportValue_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorBatteryReportValue_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorBatteryReportValue_Payload(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.BatteryReportValue_Payload, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorBatteryReportValue_Payload(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.BatteryReportValue_Payload = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorBatteryReportValue_Payload()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorBatteryReportValue_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorBatteryQualification(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryQualification, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorBatteryQualification(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorBatteryQualification(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.BatteryQualification, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorBatteryQualification(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.BatteryQualification = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorBatteryQualification()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorBatteryQualification _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorBatteryQualification_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryQualification_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorBatteryQualification_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorBatteryQualification_Payload(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.BatteryQualification_Payload, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorBatteryQualification_Payload(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.BatteryQualification_Payload = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorBatteryQualification_Payload()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorBatteryQualification_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorLifecycleReportValue(o: Drone_Battery_Charge_Qualification_Supervisor.LifecycleReportValue, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorLifecycleReportValue(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorLifecycleReportValue(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.LifecycleReportValue, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorLifecycleReportValue(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.LifecycleReportValue = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorLifecycleReportValue()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorLifecycleReportValue _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorLifecycleReportValue_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.LifecycleReportValue_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorLifecycleReportValue_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorLifecycleReportValue_Payload(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.LifecycleReportValue_Payload, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorLifecycleReportValue_Payload(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.LifecycleReportValue_Payload = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorLifecycleReportValue_Payload()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorLifecycleReportValue_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryStateFacts, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.BatteryStateFacts, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.BatteryStateFacts = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryStateFacts_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts_Payload(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.BatteryStateFacts_Payload, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts_Payload(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.BatteryStateFacts_Payload = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts_Payload()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorBatteryStateFacts_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorAttentionResolution(o: Drone_Battery_Charge_Qualification_Supervisor.AttentionResolution, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorAttentionResolution(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorAttentionResolution(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.AttentionResolution, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorAttentionResolution(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.AttentionResolution = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorAttentionResolution()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorAttentionResolution _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorAttentionResolution_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.AttentionResolution_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorAttentionResolution_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorAttentionResolution_Payload(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.AttentionResolution_Payload, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorAttentionResolution_Payload(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.AttentionResolution_Payload = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorAttentionResolution_Payload()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorAttentionResolution_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorFaultFacts(o: Drone_Battery_Charge_Qualification_Supervisor.FaultFacts, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorFaultFacts(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorFaultFacts(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.FaultFacts, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorFaultFacts(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.FaultFacts = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorFaultFacts()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorFaultFacts _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorFaultFacts_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.FaultFacts_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorFaultFacts_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorFaultFacts_Payload(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.FaultFacts_Payload, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorFaultFacts_Payload(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.FaultFacts_Payload = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorFaultFacts_Payload()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorFaultFacts_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorSessionResolution(o: Drone_Battery_Charge_Qualification_Supervisor.SessionResolution, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorSessionResolution(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorSessionResolution(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.SessionResolution, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorSessionResolution(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.SessionResolution = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorSessionResolution()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorSessionResolution _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorSessionResolution_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.SessionResolution_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorSessionResolution_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorSessionResolution_Payload(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.SessionResolution_Payload, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorSessionResolution_Payload(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.SessionResolution_Payload = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorSessionResolution_Payload()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorSessionResolution_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorPublicDecisionFacts(o: Drone_Battery_Charge_Qualification_Supervisor.PublicDecisionFacts, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorPublicDecisionFacts(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorPublicDecisionFacts(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.PublicDecisionFacts, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorPublicDecisionFacts(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.PublicDecisionFacts = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorPublicDecisionFacts()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorPublicDecisionFacts _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorPublicDecisionFacts_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.PublicDecisionFacts_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorPublicDecisionFacts_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorPublicDecisionFacts_Payload(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.PublicDecisionFacts_Payload, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorPublicDecisionFacts_Payload(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.PublicDecisionFacts_Payload = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorPublicDecisionFacts_Payload()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorPublicDecisionFacts_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorPilotStatus(o: Drone_Battery_Charge_Qualification_Supervisor.PilotStatus, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorPilotStatus(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorPilotStatus(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.PilotStatus, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorPilotStatus(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.PilotStatus = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorPilotStatus()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorPilotStatus _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorPilotStatus_Payload(o: Drone_Battery_Charge_Qualification_Supervisor.PilotStatus_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorPilotStatus_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorPilotStatus_Payload(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.PilotStatus_Payload, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorPilotStatus_Payload(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.PilotStatus_Payload = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorPilotStatus_Payload()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorPilotStatus_Payload _)
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

  def fromDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_P(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_P, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_P(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_P = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_P()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_P _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PS(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PS(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PS = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PreState_Container_PS _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_P(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_P, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_P(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_P = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_P()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_P _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PS(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PS(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PS = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorCurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_PostState_Container_PS _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_P(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_P, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_P(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_P = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_P()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_P _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PS(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PS(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PS = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PreState_Container_PS _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_P(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_P, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_P(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_P = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_P()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_P _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PS(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PS(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PS = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorBatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_PostState_Container_PS _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_P(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_P, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_P(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_P = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_P()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_P _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PS(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PS(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PS = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PreState_Container_PS _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_P(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_P, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_P(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_P = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_P()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_P _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PS(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PS(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PS = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_PostState_Container_PS _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_P(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_P, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_P(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_P = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_P()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_P _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PS(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PS(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PS = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PreState_Container_PS _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_P(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_P, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_P(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_P = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_P()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_P _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PS(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PS(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PS = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_PostState_Container_PS _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_P(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_P, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_P(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_P = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_P()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_P _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PS(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PS(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PS = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PreState_Container_PS _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_P(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_P, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_P(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_P = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_P()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_P _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PS(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PS(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PS = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorLifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_PostState_Container_PS _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_P(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_P, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_P(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_P = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_P()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_P _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PS(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PS(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PS = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PreState_Container_PS _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_P(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_P, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_P(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_P = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_P()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_P _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PS(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PS(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PS = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorBatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_PostState_Container_PS _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_P(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_P, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_P(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_P = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_P()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_P _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PS(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PS(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PS = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PreState_Container_PS _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_P(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_P, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_P(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_P = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_P()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_P _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PS(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PS(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PS = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_PostState_Container_PS _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_P(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_P, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_P(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_P = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_P()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_P _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PS(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PS(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PS = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PreState_Container_PS _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_P(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_P, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_P(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_P = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_P()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_P _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PS(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PS(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PS = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorAttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_PostState_Container_PS _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_P(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_P, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_P(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_P = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_P()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_P _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PS(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PS(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PS = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PreState_Container_PS _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_P(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_P, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_P(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_P = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_P()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_P _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PS(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PS(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PS = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorBatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_PostState_Container_PS _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_P(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_P, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_P(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_P = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_P()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_P _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PS(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PS(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PS = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PreState_Container_PS _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_P(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_P, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_P(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_P = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_P()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_P _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PS(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PS(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PS = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorFaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_PostState_Container_PS _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_P(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_P, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_P(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_P = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_P()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_P _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PS(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PS(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PS = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PreState_Container_PS _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_P(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_P, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_P(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_P = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_P()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_P _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PS(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PS(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PS = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_PostState_Container_PS _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_P(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_P, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_P(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_P = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_P()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_P _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PS(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PS(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PS = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PreState_Container_PS _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_P(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_P, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_P(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_P = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_P()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_P _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PS(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PS(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PS = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorNotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_PostState_Container_PS _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_P(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_P, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_P(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_P = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_P()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_P _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PS(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PS(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PS = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PreState_Container_PS _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container(o: Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_P(o: Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_P(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_P, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_P(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_P = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_P()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_P _)
    return r
  }

  def fromDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PS(o: Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PS(s: String): Either[Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PS(parser: Parser): Drone_Battery_Charge_Qualification_Supervisor.AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PS = {
      val r = parser.parseDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_Qualification_SupervisorAuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_PostState_Container_PS _)
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