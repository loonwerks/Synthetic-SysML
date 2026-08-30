// #Sireum
// @formatter:off

// This file is auto-generated from ContactClass.scala, EvidenceStatus.scala, ThreatBand.scala, ThreatValidity.scala, AlertState.scala, ThreatReport.scala, DefenseAuthority.scala, DefenseOutcome.scala, ChannelGate.scala, ChannelState.scala, EscapeAuthority.scala, EscapeOutcome.scala, RouteStatus.scala, MiningInterlock.scala, DefenseProposal.scala, EscapeProposal.scala, ResponsePattern.scala, DefenseDirective.scala, EscapeDirective.scala, ResponseStage.scala, DefenseChannelCondition.scala, EscapeChannelCondition.scala, ThreatEvidence.scala, QualifiedThreat.scala, DefenseReadinessContext.scala, ResponseFrame.scala, Base_Types.scala, ThreatQualification_threatResponseProcess_threatQualification_Containers.scala, AlertMemory_threatResponseProcess_alertMemory_Containers.scala, DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_Containers.scala, EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_Containers.scala, DefenseReadiness_threatResponseProcess_defenseReadiness_Containers.scala, DepartureReadiness_threatResponseProcess_departureReadiness_Containers.scala, DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_Containers.scala, DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_Containers.scala, ResponseCoordination_threatResponseProcess_responseCoordination_Containers.scala, ReportFrameComposition_threatResponseProcess_reportFrameComposition_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package scp_candidate

import org.sireum._
import org.sireum.Json.Printer._

object JSON {

  object Printer {

    @pure def printFrigate_Threat_Response_CoordinatorContactClassType(o: Frigate_Threat_Response_Coordinator.ContactClass.Type): ST = {
      val value: String = o match {
        case Frigate_Threat_Response_Coordinator.ContactClass.NO_CONTACT => "NO_CONTACT"
        case Frigate_Threat_Response_Coordinator.ContactClass.UNCERTAIN => "UNCERTAIN"
        case Frigate_Threat_Response_Coordinator.ContactClass.HOSTILE_SIGNATURE => "HOSTILE_SIGNATURE"
      }
      return printObject(ISZ(
        ("type", printString("Frigate_Threat_Response_Coordinator.ContactClass")),
        ("value", printString(value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorContactClass_Payload(o: Frigate_Threat_Response_Coordinator.ContactClass_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.ContactClass_Payload""""),
        ("value", printFrigate_Threat_Response_CoordinatorContactClassType(o.value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorEvidenceStatusType(o: Frigate_Threat_Response_Coordinator.EvidenceStatus.Type): ST = {
      val value: String = o match {
        case Frigate_Threat_Response_Coordinator.EvidenceStatus.VALID => "VALID"
        case Frigate_Threat_Response_Coordinator.EvidenceStatus.INVALID => "INVALID"
      }
      return printObject(ISZ(
        ("type", printString("Frigate_Threat_Response_Coordinator.EvidenceStatus")),
        ("value", printString(value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorEvidenceStatus_Payload(o: Frigate_Threat_Response_Coordinator.EvidenceStatus_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.EvidenceStatus_Payload""""),
        ("value", printFrigate_Threat_Response_CoordinatorEvidenceStatusType(o.value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorThreatBandType(o: Frigate_Threat_Response_Coordinator.ThreatBand.Type): ST = {
      val value: String = o match {
        case Frigate_Threat_Response_Coordinator.ThreatBand.CLEAR => "CLEAR"
        case Frigate_Threat_Response_Coordinator.ThreatBand.CAUTION => "CAUTION"
        case Frigate_Threat_Response_Coordinator.ThreatBand.HOSTILE => "HOSTILE"
      }
      return printObject(ISZ(
        ("type", printString("Frigate_Threat_Response_Coordinator.ThreatBand")),
        ("value", printString(value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorThreatBand_Payload(o: Frigate_Threat_Response_Coordinator.ThreatBand_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.ThreatBand_Payload""""),
        ("value", printFrigate_Threat_Response_CoordinatorThreatBandType(o.value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorThreatValidityType(o: Frigate_Threat_Response_Coordinator.ThreatValidity.Type): ST = {
      val value: String = o match {
        case Frigate_Threat_Response_Coordinator.ThreatValidity.USABLE => "USABLE"
        case Frigate_Threat_Response_Coordinator.ThreatValidity.UNUSABLE => "UNUSABLE"
      }
      return printObject(ISZ(
        ("type", printString("Frigate_Threat_Response_Coordinator.ThreatValidity")),
        ("value", printString(value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorThreatValidity_Payload(o: Frigate_Threat_Response_Coordinator.ThreatValidity_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.ThreatValidity_Payload""""),
        ("value", printFrigate_Threat_Response_CoordinatorThreatValidityType(o.value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorAlertStateType(o: Frigate_Threat_Response_Coordinator.AlertState.Type): ST = {
      val value: String = o match {
        case Frigate_Threat_Response_Coordinator.AlertState.QUIET => "QUIET"
        case Frigate_Threat_Response_Coordinator.AlertState.WATCH => "WATCH"
        case Frigate_Threat_Response_Coordinator.AlertState.ALARM => "ALARM"
      }
      return printObject(ISZ(
        ("type", printString("Frigate_Threat_Response_Coordinator.AlertState")),
        ("value", printString(value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorAlertState_Payload(o: Frigate_Threat_Response_Coordinator.AlertState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.AlertState_Payload""""),
        ("value", printFrigate_Threat_Response_CoordinatorAlertStateType(o.value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorThreatReportType(o: Frigate_Threat_Response_Coordinator.ThreatReport.Type): ST = {
      val value: String = o match {
        case Frigate_Threat_Response_Coordinator.ThreatReport.UNKNOWN => "UNKNOWN"
        case Frigate_Threat_Response_Coordinator.ThreatReport.CLEAR => "CLEAR"
        case Frigate_Threat_Response_Coordinator.ThreatReport.CAUTION => "CAUTION"
        case Frigate_Threat_Response_Coordinator.ThreatReport.HOSTILE => "HOSTILE"
      }
      return printObject(ISZ(
        ("type", printString("Frigate_Threat_Response_Coordinator.ThreatReport")),
        ("value", printString(value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorThreatReport_Payload(o: Frigate_Threat_Response_Coordinator.ThreatReport_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.ThreatReport_Payload""""),
        ("value", printFrigate_Threat_Response_CoordinatorThreatReportType(o.value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorDefenseAuthorityType(o: Frigate_Threat_Response_Coordinator.DefenseAuthority.Type): ST = {
      val value: String = o match {
        case Frigate_Threat_Response_Coordinator.DefenseAuthority.NONE => "NONE"
        case Frigate_Threat_Response_Coordinator.DefenseAuthority.ENABLE => "ENABLE"
        case Frigate_Threat_Response_Coordinator.DefenseAuthority.RESET => "RESET"
      }
      return printObject(ISZ(
        ("type", printString("Frigate_Threat_Response_Coordinator.DefenseAuthority")),
        ("value", printString(value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorDefenseAuthority_Payload(o: Frigate_Threat_Response_Coordinator.DefenseAuthority_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.DefenseAuthority_Payload""""),
        ("value", printFrigate_Threat_Response_CoordinatorDefenseAuthorityType(o.value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorDefenseOutcomeType(o: Frigate_Threat_Response_Coordinator.DefenseOutcome.Type): ST = {
      val value: String = o match {
        case Frigate_Threat_Response_Coordinator.DefenseOutcome.NONE => "NONE"
        case Frigate_Threat_Response_Coordinator.DefenseOutcome.COMMAND_SUCCEEDED => "COMMAND_SUCCEEDED"
        case Frigate_Threat_Response_Coordinator.DefenseOutcome.COMMAND_FAILED => "COMMAND_FAILED"
        case Frigate_Threat_Response_Coordinator.DefenseOutcome.RECOVERY_CONFIRMED => "RECOVERY_CONFIRMED"
      }
      return printObject(ISZ(
        ("type", printString("Frigate_Threat_Response_Coordinator.DefenseOutcome")),
        ("value", printString(value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorDefenseOutcome_Payload(o: Frigate_Threat_Response_Coordinator.DefenseOutcome_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.DefenseOutcome_Payload""""),
        ("value", printFrigate_Threat_Response_CoordinatorDefenseOutcomeType(o.value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorChannelGateType(o: Frigate_Threat_Response_Coordinator.ChannelGate.Type): ST = {
      val value: String = o match {
        case Frigate_Threat_Response_Coordinator.ChannelGate.OPEN => "OPEN"
        case Frigate_Threat_Response_Coordinator.ChannelGate.BLOCKED => "BLOCKED"
      }
      return printObject(ISZ(
        ("type", printString("Frigate_Threat_Response_Coordinator.ChannelGate")),
        ("value", printString(value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorChannelGate_Payload(o: Frigate_Threat_Response_Coordinator.ChannelGate_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.ChannelGate_Payload""""),
        ("value", printFrigate_Threat_Response_CoordinatorChannelGateType(o.value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorChannelStateType(o: Frigate_Threat_Response_Coordinator.ChannelState.Type): ST = {
      val value: String = o match {
        case Frigate_Threat_Response_Coordinator.ChannelState.AVAILABLE => "AVAILABLE"
        case Frigate_Threat_Response_Coordinator.ChannelState.ISOLATED => "ISOLATED"
        case Frigate_Threat_Response_Coordinator.ChannelState.PROBATION => "PROBATION"
      }
      return printObject(ISZ(
        ("type", printString("Frigate_Threat_Response_Coordinator.ChannelState")),
        ("value", printString(value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorChannelState_Payload(o: Frigate_Threat_Response_Coordinator.ChannelState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.ChannelState_Payload""""),
        ("value", printFrigate_Threat_Response_CoordinatorChannelStateType(o.value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorEscapeAuthorityType(o: Frigate_Threat_Response_Coordinator.EscapeAuthority.Type): ST = {
      val value: String = o match {
        case Frigate_Threat_Response_Coordinator.EscapeAuthority.NONE => "NONE"
        case Frigate_Threat_Response_Coordinator.EscapeAuthority.ENABLE => "ENABLE"
        case Frigate_Threat_Response_Coordinator.EscapeAuthority.RESET => "RESET"
      }
      return printObject(ISZ(
        ("type", printString("Frigate_Threat_Response_Coordinator.EscapeAuthority")),
        ("value", printString(value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorEscapeAuthority_Payload(o: Frigate_Threat_Response_Coordinator.EscapeAuthority_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.EscapeAuthority_Payload""""),
        ("value", printFrigate_Threat_Response_CoordinatorEscapeAuthorityType(o.value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorEscapeOutcomeType(o: Frigate_Threat_Response_Coordinator.EscapeOutcome.Type): ST = {
      val value: String = o match {
        case Frigate_Threat_Response_Coordinator.EscapeOutcome.NONE => "NONE"
        case Frigate_Threat_Response_Coordinator.EscapeOutcome.DEPARTURE_SUCCEEDED => "DEPARTURE_SUCCEEDED"
        case Frigate_Threat_Response_Coordinator.EscapeOutcome.DEPARTURE_FAILED => "DEPARTURE_FAILED"
        case Frigate_Threat_Response_Coordinator.EscapeOutcome.RECOVERY_CONFIRMED => "RECOVERY_CONFIRMED"
      }
      return printObject(ISZ(
        ("type", printString("Frigate_Threat_Response_Coordinator.EscapeOutcome")),
        ("value", printString(value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorEscapeOutcome_Payload(o: Frigate_Threat_Response_Coordinator.EscapeOutcome_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.EscapeOutcome_Payload""""),
        ("value", printFrigate_Threat_Response_CoordinatorEscapeOutcomeType(o.value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorRouteStatusType(o: Frigate_Threat_Response_Coordinator.RouteStatus.Type): ST = {
      val value: String = o match {
        case Frigate_Threat_Response_Coordinator.RouteStatus.UNAVAILABLE => "UNAVAILABLE"
        case Frigate_Threat_Response_Coordinator.RouteStatus.READY => "READY"
      }
      return printObject(ISZ(
        ("type", printString("Frigate_Threat_Response_Coordinator.RouteStatus")),
        ("value", printString(value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorRouteStatus_Payload(o: Frigate_Threat_Response_Coordinator.RouteStatus_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.RouteStatus_Payload""""),
        ("value", printFrigate_Threat_Response_CoordinatorRouteStatusType(o.value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorMiningInterlockType(o: Frigate_Threat_Response_Coordinator.MiningInterlock.Type): ST = {
      val value: String = o match {
        case Frigate_Threat_Response_Coordinator.MiningInterlock.CLEAR => "CLEAR"
        case Frigate_Threat_Response_Coordinator.MiningInterlock.BLOCKED => "BLOCKED"
      }
      return printObject(ISZ(
        ("type", printString("Frigate_Threat_Response_Coordinator.MiningInterlock")),
        ("value", printString(value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorMiningInterlock_Payload(o: Frigate_Threat_Response_Coordinator.MiningInterlock_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.MiningInterlock_Payload""""),
        ("value", printFrigate_Threat_Response_CoordinatorMiningInterlockType(o.value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorDefenseProposalType(o: Frigate_Threat_Response_Coordinator.DefenseProposal.Type): ST = {
      val value: String = o match {
        case Frigate_Threat_Response_Coordinator.DefenseProposal.STANDBY => "STANDBY"
        case Frigate_Threat_Response_Coordinator.DefenseProposal.ACTIVATE => "ACTIVATE"
      }
      return printObject(ISZ(
        ("type", printString("Frigate_Threat_Response_Coordinator.DefenseProposal")),
        ("value", printString(value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorDefenseProposal_Payload(o: Frigate_Threat_Response_Coordinator.DefenseProposal_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.DefenseProposal_Payload""""),
        ("value", printFrigate_Threat_Response_CoordinatorDefenseProposalType(o.value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorEscapeProposalType(o: Frigate_Threat_Response_Coordinator.EscapeProposal.Type): ST = {
      val value: String = o match {
        case Frigate_Threat_Response_Coordinator.EscapeProposal.STAY => "STAY"
        case Frigate_Threat_Response_Coordinator.EscapeProposal.DEPART => "DEPART"
      }
      return printObject(ISZ(
        ("type", printString("Frigate_Threat_Response_Coordinator.EscapeProposal")),
        ("value", printString(value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorEscapeProposal_Payload(o: Frigate_Threat_Response_Coordinator.EscapeProposal_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.EscapeProposal_Payload""""),
        ("value", printFrigate_Threat_Response_CoordinatorEscapeProposalType(o.value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorResponsePatternType(o: Frigate_Threat_Response_Coordinator.ResponsePattern.Type): ST = {
      val value: String = o match {
        case Frigate_Threat_Response_Coordinator.ResponsePattern.OBSERVE => "OBSERVE"
        case Frigate_Threat_Response_Coordinator.ResponsePattern.DEFENSE => "DEFENSE"
        case Frigate_Threat_Response_Coordinator.ResponsePattern.DEPARTURE => "DEPARTURE"
      }
      return printObject(ISZ(
        ("type", printString("Frigate_Threat_Response_Coordinator.ResponsePattern")),
        ("value", printString(value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorResponsePattern_Payload(o: Frigate_Threat_Response_Coordinator.ResponsePattern_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.ResponsePattern_Payload""""),
        ("value", printFrigate_Threat_Response_CoordinatorResponsePatternType(o.value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorDefenseDirectiveType(o: Frigate_Threat_Response_Coordinator.DefenseDirective.Type): ST = {
      val value: String = o match {
        case Frigate_Threat_Response_Coordinator.DefenseDirective.STANDBY => "STANDBY"
        case Frigate_Threat_Response_Coordinator.DefenseDirective.ACTIVATE => "ACTIVATE"
      }
      return printObject(ISZ(
        ("type", printString("Frigate_Threat_Response_Coordinator.DefenseDirective")),
        ("value", printString(value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorDefenseDirective_Payload(o: Frigate_Threat_Response_Coordinator.DefenseDirective_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.DefenseDirective_Payload""""),
        ("value", printFrigate_Threat_Response_CoordinatorDefenseDirectiveType(o.value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorEscapeDirectiveType(o: Frigate_Threat_Response_Coordinator.EscapeDirective.Type): ST = {
      val value: String = o match {
        case Frigate_Threat_Response_Coordinator.EscapeDirective.STAY => "STAY"
        case Frigate_Threat_Response_Coordinator.EscapeDirective.DEPART => "DEPART"
      }
      return printObject(ISZ(
        ("type", printString("Frigate_Threat_Response_Coordinator.EscapeDirective")),
        ("value", printString(value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorEscapeDirective_Payload(o: Frigate_Threat_Response_Coordinator.EscapeDirective_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.EscapeDirective_Payload""""),
        ("value", printFrigate_Threat_Response_CoordinatorEscapeDirectiveType(o.value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorResponseStageType(o: Frigate_Threat_Response_Coordinator.ResponseStage.Type): ST = {
      val value: String = o match {
        case Frigate_Threat_Response_Coordinator.ResponseStage.INITIALIZING => "INITIALIZING"
        case Frigate_Threat_Response_Coordinator.ResponseStage.MONITORING => "MONITORING"
        case Frigate_Threat_Response_Coordinator.ResponseStage.RESPONDING => "RESPONDING"
        case Frigate_Threat_Response_Coordinator.ResponseStage.DEGRADED => "DEGRADED"
        case Frigate_Threat_Response_Coordinator.ResponseStage.EVIDENCE_FAULT => "EVIDENCE_FAULT"
      }
      return printObject(ISZ(
        ("type", printString("Frigate_Threat_Response_Coordinator.ResponseStage")),
        ("value", printString(value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorResponseStage_Payload(o: Frigate_Threat_Response_Coordinator.ResponseStage_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.ResponseStage_Payload""""),
        ("value", printFrigate_Threat_Response_CoordinatorResponseStageType(o.value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorDefenseChannelConditionType(o: Frigate_Threat_Response_Coordinator.DefenseChannelCondition.Type): ST = {
      val value: String = o match {
        case Frigate_Threat_Response_Coordinator.DefenseChannelCondition.AVAILABLE => "AVAILABLE"
        case Frigate_Threat_Response_Coordinator.DefenseChannelCondition.ISOLATED => "ISOLATED"
        case Frigate_Threat_Response_Coordinator.DefenseChannelCondition.PROBATION => "PROBATION"
      }
      return printObject(ISZ(
        ("type", printString("Frigate_Threat_Response_Coordinator.DefenseChannelCondition")),
        ("value", printString(value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorDefenseChannelCondition_Payload(o: Frigate_Threat_Response_Coordinator.DefenseChannelCondition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.DefenseChannelCondition_Payload""""),
        ("value", printFrigate_Threat_Response_CoordinatorDefenseChannelConditionType(o.value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorEscapeChannelConditionType(o: Frigate_Threat_Response_Coordinator.EscapeChannelCondition.Type): ST = {
      val value: String = o match {
        case Frigate_Threat_Response_Coordinator.EscapeChannelCondition.AVAILABLE => "AVAILABLE"
        case Frigate_Threat_Response_Coordinator.EscapeChannelCondition.ISOLATED => "ISOLATED"
        case Frigate_Threat_Response_Coordinator.EscapeChannelCondition.PROBATION => "PROBATION"
      }
      return printObject(ISZ(
        ("type", printString("Frigate_Threat_Response_Coordinator.EscapeChannelCondition")),
        ("value", printString(value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorEscapeChannelCondition_Payload(o: Frigate_Threat_Response_Coordinator.EscapeChannelCondition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.EscapeChannelCondition_Payload""""),
        ("value", printFrigate_Threat_Response_CoordinatorEscapeChannelConditionType(o.value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorThreatEvidence(o: Frigate_Threat_Response_Coordinator.ThreatEvidence): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.ThreatEvidence""""),
        ("contactClass", printFrigate_Threat_Response_CoordinatorContactClassType(o.contactClass)),
        ("evidenceStatus", printFrigate_Threat_Response_CoordinatorEvidenceStatusType(o.evidenceStatus))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorThreatEvidence_Payload(o: Frigate_Threat_Response_Coordinator.ThreatEvidence_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.ThreatEvidence_Payload""""),
        ("value", printFrigate_Threat_Response_CoordinatorThreatEvidence(o.value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorQualifiedThreat(o: Frigate_Threat_Response_Coordinator.QualifiedThreat): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.QualifiedThreat""""),
        ("band", printFrigate_Threat_Response_CoordinatorThreatBandType(o.band)),
        ("validity", printFrigate_Threat_Response_CoordinatorThreatValidityType(o.validity))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorQualifiedThreat_Payload(o: Frigate_Threat_Response_Coordinator.QualifiedThreat_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.QualifiedThreat_Payload""""),
        ("value", printFrigate_Threat_Response_CoordinatorQualifiedThreat(o.value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorDefenseReadinessContext(o: Frigate_Threat_Response_Coordinator.DefenseReadinessContext): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.DefenseReadinessContext""""),
        ("defenseAvailable", printB(o.defenseAvailable)),
        ("capacitorAdequate", printB(o.capacitorAdequate))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorDefenseReadinessContext_Payload(o: Frigate_Threat_Response_Coordinator.DefenseReadinessContext_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.DefenseReadinessContext_Payload""""),
        ("value", printFrigate_Threat_Response_CoordinatorDefenseReadinessContext(o.value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorResponseFrame(o: Frigate_Threat_Response_Coordinator.ResponseFrame): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.ResponseFrame""""),
        ("threatReport", printFrigate_Threat_Response_CoordinatorThreatReportType(o.threatReport)),
        ("defenseDirective", printFrigate_Threat_Response_CoordinatorDefenseDirectiveType(o.defenseDirective)),
        ("escapeDirective", printFrigate_Threat_Response_CoordinatorEscapeDirectiveType(o.escapeDirective)),
        ("responsePattern", printFrigate_Threat_Response_CoordinatorResponsePatternType(o.responsePattern)),
        ("responseStage", printFrigate_Threat_Response_CoordinatorResponseStageType(o.responseStage)),
        ("defenseCondition", printFrigate_Threat_Response_CoordinatorDefenseChannelConditionType(o.defenseCondition)),
        ("escapeCondition", printFrigate_Threat_Response_CoordinatorEscapeChannelConditionType(o.escapeCondition))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorResponseFrame_Payload(o: Frigate_Threat_Response_Coordinator.ResponseFrame_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.ResponseFrame_Payload""""),
        ("value", printFrigate_Threat_Response_CoordinatorResponseFrame(o.value))
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

    @pure def printFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container(o: Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PreState_Container): ST = {
      o match {
        case o: Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PreState_Container_P => return printFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PS => return printFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PS(o)
      }
    }

    @pure def printFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_P(o: Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PreState_Container_P""""),
        ("api_threatEvidenceIn", printFrigate_Threat_Response_CoordinatorThreatEvidence(o.api_threatEvidenceIn))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PS(o: Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PS""""),
        ("api_threatEvidenceIn", printFrigate_Threat_Response_CoordinatorThreatEvidence(o.api_threatEvidenceIn))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container(o: Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PostState_Container): ST = {
      o match {
        case o: Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PostState_Container_P => return printFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PS => return printFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PS(o)
      }
    }

    @pure def printFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_P(o: Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PostState_Container_P""""),
        ("api_qualifiedThreatToAlertOut", printFrigate_Threat_Response_CoordinatorQualifiedThreat(o.api_qualifiedThreatToAlertOut)),
        ("api_threatValidityToDefenseOut", printFrigate_Threat_Response_CoordinatorThreatValidityType(o.api_threatValidityToDefenseOut)),
        ("api_threatValidityToEscapeOut", printFrigate_Threat_Response_CoordinatorThreatValidityType(o.api_threatValidityToEscapeOut))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PS(o: Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PS""""),
        ("api_qualifiedThreatToAlertOut", printFrigate_Threat_Response_CoordinatorQualifiedThreat(o.api_qualifiedThreatToAlertOut)),
        ("api_threatValidityToDefenseOut", printFrigate_Threat_Response_CoordinatorThreatValidityType(o.api_threatValidityToDefenseOut)),
        ("api_threatValidityToEscapeOut", printFrigate_Threat_Response_CoordinatorThreatValidityType(o.api_threatValidityToEscapeOut))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container(o: Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PreState_Container): ST = {
      o match {
        case o: Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PreState_Container_P => return printFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PreState_Container_PS => return printFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_PS(o)
      }
    }

    @pure def printFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_P(o: Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PreState_Container_P""""),
        ("api_clearAcknowledgmentIn", printB(o.api_clearAcknowledgmentIn)),
        ("api_qualifiedThreatIn", printFrigate_Threat_Response_CoordinatorQualifiedThreat(o.api_qualifiedThreatIn))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_PS(o: Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PreState_Container_PS""""),
        ("In_retainedAlert", printFrigate_Threat_Response_CoordinatorAlertStateType(o.In_retainedAlert)),
        ("api_clearAcknowledgmentIn", printB(o.api_clearAcknowledgmentIn)),
        ("api_qualifiedThreatIn", printFrigate_Threat_Response_CoordinatorQualifiedThreat(o.api_qualifiedThreatIn))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container(o: Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PostState_Container): ST = {
      o match {
        case o: Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PostState_Container_P => return printFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PostState_Container_PS => return printFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_PS(o)
      }
    }

    @pure def printFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_P(o: Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PostState_Container_P""""),
        ("api_compositionAlertOut", printFrigate_Threat_Response_CoordinatorAlertStateType(o.api_compositionAlertOut)),
        ("api_defenseAlertOut", printFrigate_Threat_Response_CoordinatorAlertStateType(o.api_defenseAlertOut)),
        ("api_escapeAlertOut", printFrigate_Threat_Response_CoordinatorAlertStateType(o.api_escapeAlertOut)),
        ("api_threatReportOut", printFrigate_Threat_Response_CoordinatorThreatReportType(o.api_threatReportOut))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_PS(o: Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PostState_Container_PS""""),
        ("retainedAlert", printFrigate_Threat_Response_CoordinatorAlertStateType(o.retainedAlert)),
        ("api_compositionAlertOut", printFrigate_Threat_Response_CoordinatorAlertStateType(o.api_compositionAlertOut)),
        ("api_defenseAlertOut", printFrigate_Threat_Response_CoordinatorAlertStateType(o.api_defenseAlertOut)),
        ("api_escapeAlertOut", printFrigate_Threat_Response_CoordinatorAlertStateType(o.api_escapeAlertOut)),
        ("api_threatReportOut", printFrigate_Threat_Response_CoordinatorThreatReportType(o.api_threatReportOut))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container(o: Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container): ST = {
      o match {
        case o: Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_P => return printFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PS => return printFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PS(o)
      }
    }

    @pure def printFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_P(o: Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_P""""),
        ("api_defenseAuthorityIn", printFrigate_Threat_Response_CoordinatorDefenseAuthorityType(o.api_defenseAuthorityIn)),
        ("api_defenseOutcomeIn", printFrigate_Threat_Response_CoordinatorDefenseOutcomeType(o.api_defenseOutcomeIn)),
        ("api_threatValidityIn", printFrigate_Threat_Response_CoordinatorThreatValidityType(o.api_threatValidityIn))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PS(o: Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PS""""),
        ("In_defenseRecoveryState", printFrigate_Threat_Response_CoordinatorChannelStateType(o.In_defenseRecoveryState)),
        ("api_defenseAuthorityIn", printFrigate_Threat_Response_CoordinatorDefenseAuthorityType(o.api_defenseAuthorityIn)),
        ("api_defenseOutcomeIn", printFrigate_Threat_Response_CoordinatorDefenseOutcomeType(o.api_defenseOutcomeIn)),
        ("api_threatValidityIn", printFrigate_Threat_Response_CoordinatorThreatValidityType(o.api_threatValidityIn))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container(o: Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container): ST = {
      o match {
        case o: Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_P => return printFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PS => return printFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PS(o)
      }
    }

    @pure def printFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_P(o: Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_P""""),
        ("api_defenseChannelStateOut", printFrigate_Threat_Response_CoordinatorChannelStateType(o.api_defenseChannelStateOut)),
        ("api_defenseGateOut", printFrigate_Threat_Response_CoordinatorChannelGateType(o.api_defenseGateOut))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PS(o: Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PS""""),
        ("defenseRecoveryState", printFrigate_Threat_Response_CoordinatorChannelStateType(o.defenseRecoveryState)),
        ("api_defenseChannelStateOut", printFrigate_Threat_Response_CoordinatorChannelStateType(o.api_defenseChannelStateOut)),
        ("api_defenseGateOut", printFrigate_Threat_Response_CoordinatorChannelGateType(o.api_defenseGateOut))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container(o: Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container): ST = {
      o match {
        case o: Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_P => return printFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PS => return printFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PS(o)
      }
    }

    @pure def printFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_P(o: Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_P""""),
        ("api_escapeAuthorityIn", printFrigate_Threat_Response_CoordinatorEscapeAuthorityType(o.api_escapeAuthorityIn)),
        ("api_escapeOutcomeIn", printFrigate_Threat_Response_CoordinatorEscapeOutcomeType(o.api_escapeOutcomeIn)),
        ("api_threatValidityIn", printFrigate_Threat_Response_CoordinatorThreatValidityType(o.api_threatValidityIn))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PS(o: Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PS""""),
        ("In_escapeRecoveryState", printFrigate_Threat_Response_CoordinatorChannelStateType(o.In_escapeRecoveryState)),
        ("api_escapeAuthorityIn", printFrigate_Threat_Response_CoordinatorEscapeAuthorityType(o.api_escapeAuthorityIn)),
        ("api_escapeOutcomeIn", printFrigate_Threat_Response_CoordinatorEscapeOutcomeType(o.api_escapeOutcomeIn)),
        ("api_threatValidityIn", printFrigate_Threat_Response_CoordinatorThreatValidityType(o.api_threatValidityIn))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container(o: Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container): ST = {
      o match {
        case o: Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_P => return printFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PS => return printFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PS(o)
      }
    }

    @pure def printFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_P(o: Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_P""""),
        ("api_escapeChannelStateOut", printFrigate_Threat_Response_CoordinatorChannelStateType(o.api_escapeChannelStateOut)),
        ("api_escapeGateOut", printFrigate_Threat_Response_CoordinatorChannelGateType(o.api_escapeGateOut))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PS(o: Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PS""""),
        ("escapeRecoveryState", printFrigate_Threat_Response_CoordinatorChannelStateType(o.escapeRecoveryState)),
        ("api_escapeChannelStateOut", printFrigate_Threat_Response_CoordinatorChannelStateType(o.api_escapeChannelStateOut)),
        ("api_escapeGateOut", printFrigate_Threat_Response_CoordinatorChannelGateType(o.api_escapeGateOut))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container(o: Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container): ST = {
      o match {
        case o: Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_P => return printFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PS => return printFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PS(o)
      }
    }

    @pure def printFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_P(o: Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_P""""),
        ("api_defenseGateIn", printFrigate_Threat_Response_CoordinatorChannelGateType(o.api_defenseGateIn)),
        ("api_readinessContextIn", printFrigate_Threat_Response_CoordinatorDefenseReadinessContext(o.api_readinessContextIn))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PS(o: Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PS""""),
        ("api_defenseGateIn", printFrigate_Threat_Response_CoordinatorChannelGateType(o.api_defenseGateIn)),
        ("api_readinessContextIn", printFrigate_Threat_Response_CoordinatorDefenseReadinessContext(o.api_readinessContextIn))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container(o: Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container): ST = {
      o match {
        case o: Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_P => return printFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PS => return printFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PS(o)
      }
    }

    @pure def printFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_P(o: Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_P""""),
        ("api_defenseReadyOut", printB(o.api_defenseReadyOut))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PS(o: Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PS""""),
        ("api_defenseReadyOut", printB(o.api_defenseReadyOut))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container(o: Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container): ST = {
      o match {
        case o: Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_P => return printFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PS => return printFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PS(o)
      }
    }

    @pure def printFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_P(o: Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_P""""),
        ("api_escapeGateIn", printFrigate_Threat_Response_CoordinatorChannelGateType(o.api_escapeGateIn)),
        ("api_miningInterlockIn", printFrigate_Threat_Response_CoordinatorMiningInterlockType(o.api_miningInterlockIn)),
        ("api_navigationAvailableIn", printB(o.api_navigationAvailableIn)),
        ("api_routeStatusIn", printFrigate_Threat_Response_CoordinatorRouteStatusType(o.api_routeStatusIn))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PS(o: Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PS""""),
        ("api_escapeGateIn", printFrigate_Threat_Response_CoordinatorChannelGateType(o.api_escapeGateIn)),
        ("api_miningInterlockIn", printFrigate_Threat_Response_CoordinatorMiningInterlockType(o.api_miningInterlockIn)),
        ("api_navigationAvailableIn", printB(o.api_navigationAvailableIn)),
        ("api_routeStatusIn", printFrigate_Threat_Response_CoordinatorRouteStatusType(o.api_routeStatusIn))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container(o: Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container): ST = {
      o match {
        case o: Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_P => return printFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PS => return printFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PS(o)
      }
    }

    @pure def printFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_P(o: Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_P""""),
        ("api_escapeReadyOut", printB(o.api_escapeReadyOut))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PS(o: Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PS""""),
        ("api_escapeReadyOut", printB(o.api_escapeReadyOut))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container(o: Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container): ST = {
      o match {
        case o: Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_P => return printFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PS => return printFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PS(o)
      }
    }

    @pure def printFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_P(o: Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_P""""),
        ("api_alertStateIn", printFrigate_Threat_Response_CoordinatorAlertStateType(o.api_alertStateIn)),
        ("api_defenseAuthorityIn", printFrigate_Threat_Response_CoordinatorDefenseAuthorityType(o.api_defenseAuthorityIn)),
        ("api_defenseReadyIn", printB(o.api_defenseReadyIn))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PS(o: Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PS""""),
        ("api_alertStateIn", printFrigate_Threat_Response_CoordinatorAlertStateType(o.api_alertStateIn)),
        ("api_defenseAuthorityIn", printFrigate_Threat_Response_CoordinatorDefenseAuthorityType(o.api_defenseAuthorityIn)),
        ("api_defenseReadyIn", printB(o.api_defenseReadyIn))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container(o: Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container): ST = {
      o match {
        case o: Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_P => return printFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PS => return printFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PS(o)
      }
    }

    @pure def printFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_P(o: Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_P""""),
        ("api_defenseProposalToCompositionOut", printFrigate_Threat_Response_CoordinatorDefenseProposalType(o.api_defenseProposalToCompositionOut)),
        ("api_defenseProposalToCoordinationOut", printFrigate_Threat_Response_CoordinatorDefenseProposalType(o.api_defenseProposalToCoordinationOut))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PS(o: Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PS""""),
        ("api_defenseProposalToCompositionOut", printFrigate_Threat_Response_CoordinatorDefenseProposalType(o.api_defenseProposalToCompositionOut)),
        ("api_defenseProposalToCoordinationOut", printFrigate_Threat_Response_CoordinatorDefenseProposalType(o.api_defenseProposalToCoordinationOut))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container(o: Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container): ST = {
      o match {
        case o: Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_P => return printFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PS => return printFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PS(o)
      }
    }

    @pure def printFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_P(o: Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_P""""),
        ("api_alertStateIn", printFrigate_Threat_Response_CoordinatorAlertStateType(o.api_alertStateIn)),
        ("api_escapeAuthorityIn", printFrigate_Threat_Response_CoordinatorEscapeAuthorityType(o.api_escapeAuthorityIn)),
        ("api_escapeReadyIn", printB(o.api_escapeReadyIn))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PS(o: Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PS""""),
        ("api_alertStateIn", printFrigate_Threat_Response_CoordinatorAlertStateType(o.api_alertStateIn)),
        ("api_escapeAuthorityIn", printFrigate_Threat_Response_CoordinatorEscapeAuthorityType(o.api_escapeAuthorityIn)),
        ("api_escapeReadyIn", printB(o.api_escapeReadyIn))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container(o: Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container): ST = {
      o match {
        case o: Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_P => return printFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PS => return printFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PS(o)
      }
    }

    @pure def printFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_P(o: Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_P""""),
        ("api_escapeProposalToCompositionOut", printFrigate_Threat_Response_CoordinatorEscapeProposalType(o.api_escapeProposalToCompositionOut)),
        ("api_escapeProposalToCoordinationOut", printFrigate_Threat_Response_CoordinatorEscapeProposalType(o.api_escapeProposalToCoordinationOut))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PS(o: Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PS""""),
        ("api_escapeProposalToCompositionOut", printFrigate_Threat_Response_CoordinatorEscapeProposalType(o.api_escapeProposalToCompositionOut)),
        ("api_escapeProposalToCoordinationOut", printFrigate_Threat_Response_CoordinatorEscapeProposalType(o.api_escapeProposalToCoordinationOut))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container(o: Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container): ST = {
      o match {
        case o: Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_P => return printFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PS => return printFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PS(o)
      }
    }

    @pure def printFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_P(o: Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_P""""),
        ("api_defenseProposalIn", printFrigate_Threat_Response_CoordinatorDefenseProposalType(o.api_defenseProposalIn)),
        ("api_escapeProposalIn", printFrigate_Threat_Response_CoordinatorEscapeProposalType(o.api_escapeProposalIn))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PS(o: Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PS""""),
        ("api_defenseProposalIn", printFrigate_Threat_Response_CoordinatorDefenseProposalType(o.api_defenseProposalIn)),
        ("api_escapeProposalIn", printFrigate_Threat_Response_CoordinatorEscapeProposalType(o.api_escapeProposalIn))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container(o: Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container): ST = {
      o match {
        case o: Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_P => return printFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PS => return printFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PS(o)
      }
    }

    @pure def printFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_P(o: Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_P""""),
        ("api_responsePatternOut", printFrigate_Threat_Response_CoordinatorResponsePatternType(o.api_responsePatternOut))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PS(o: Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PS""""),
        ("api_responsePatternOut", printFrigate_Threat_Response_CoordinatorResponsePatternType(o.api_responsePatternOut))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container(o: Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container): ST = {
      o match {
        case o: Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_P => return printFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PS => return printFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PS(o)
      }
    }

    @pure def printFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_P(o: Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_P""""),
        ("api_alertStateIn", printFrigate_Threat_Response_CoordinatorAlertStateType(o.api_alertStateIn)),
        ("api_defenseChannelStateIn", printFrigate_Threat_Response_CoordinatorChannelStateType(o.api_defenseChannelStateIn)),
        ("api_defenseProposalIn", printFrigate_Threat_Response_CoordinatorDefenseProposalType(o.api_defenseProposalIn)),
        ("api_escapeChannelStateIn", printFrigate_Threat_Response_CoordinatorChannelStateType(o.api_escapeChannelStateIn)),
        ("api_escapeProposalIn", printFrigate_Threat_Response_CoordinatorEscapeProposalType(o.api_escapeProposalIn)),
        ("api_responsePatternIn", printFrigate_Threat_Response_CoordinatorResponsePatternType(o.api_responsePatternIn)),
        ("api_threatReportIn", printFrigate_Threat_Response_CoordinatorThreatReportType(o.api_threatReportIn))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PS(o: Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PS""""),
        ("api_alertStateIn", printFrigate_Threat_Response_CoordinatorAlertStateType(o.api_alertStateIn)),
        ("api_defenseChannelStateIn", printFrigate_Threat_Response_CoordinatorChannelStateType(o.api_defenseChannelStateIn)),
        ("api_defenseProposalIn", printFrigate_Threat_Response_CoordinatorDefenseProposalType(o.api_defenseProposalIn)),
        ("api_escapeChannelStateIn", printFrigate_Threat_Response_CoordinatorChannelStateType(o.api_escapeChannelStateIn)),
        ("api_escapeProposalIn", printFrigate_Threat_Response_CoordinatorEscapeProposalType(o.api_escapeProposalIn)),
        ("api_responsePatternIn", printFrigate_Threat_Response_CoordinatorResponsePatternType(o.api_responsePatternIn)),
        ("api_threatReportIn", printFrigate_Threat_Response_CoordinatorThreatReportType(o.api_threatReportIn))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container(o: Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container): ST = {
      o match {
        case o: Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_P => return printFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PS => return printFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PS(o)
      }
    }

    @pure def printFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_P(o: Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_P""""),
        ("api_responseFrameOut", printFrigate_Threat_Response_CoordinatorResponseFrame(o.api_responseFrameOut))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PS(o: Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PS""""),
        ("api_responseFrameOut", printFrigate_Threat_Response_CoordinatorResponseFrame(o.api_responseFrameOut))
      ))
    }

    @pure def printruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): ST = {
      val value: String = o match {
        case runtimemonitor.ObservationKind.FrigateThreatResponseSystem_Instance_threatResponseProcess_threatQualification_postInit => "FrigateThreatResponseSystem_Instance_threatResponseProcess_threatQualification_postInit"
        case runtimemonitor.ObservationKind.FrigateThreatResponseSystem_Instance_threatResponseProcess_threatQualification_preCompute => "FrigateThreatResponseSystem_Instance_threatResponseProcess_threatQualification_preCompute"
        case runtimemonitor.ObservationKind.FrigateThreatResponseSystem_Instance_threatResponseProcess_threatQualification_postCompute => "FrigateThreatResponseSystem_Instance_threatResponseProcess_threatQualification_postCompute"
        case runtimemonitor.ObservationKind.FrigateThreatResponseSystem_Instance_threatResponseProcess_alertMemory_postInit => "FrigateThreatResponseSystem_Instance_threatResponseProcess_alertMemory_postInit"
        case runtimemonitor.ObservationKind.FrigateThreatResponseSystem_Instance_threatResponseProcess_alertMemory_preCompute => "FrigateThreatResponseSystem_Instance_threatResponseProcess_alertMemory_preCompute"
        case runtimemonitor.ObservationKind.FrigateThreatResponseSystem_Instance_threatResponseProcess_alertMemory_postCompute => "FrigateThreatResponseSystem_Instance_threatResponseProcess_alertMemory_postCompute"
        case runtimemonitor.ObservationKind.FrigateThreatResponseSystem_Instance_threatResponseProcess_defenseChannelRecovery_postInit => "FrigateThreatResponseSystem_Instance_threatResponseProcess_defenseChannelRecovery_postInit"
        case runtimemonitor.ObservationKind.FrigateThreatResponseSystem_Instance_threatResponseProcess_defenseChannelRecovery_preCompute => "FrigateThreatResponseSystem_Instance_threatResponseProcess_defenseChannelRecovery_preCompute"
        case runtimemonitor.ObservationKind.FrigateThreatResponseSystem_Instance_threatResponseProcess_defenseChannelRecovery_postCompute => "FrigateThreatResponseSystem_Instance_threatResponseProcess_defenseChannelRecovery_postCompute"
        case runtimemonitor.ObservationKind.FrigateThreatResponseSystem_Instance_threatResponseProcess_escapeChannelRecovery_postInit => "FrigateThreatResponseSystem_Instance_threatResponseProcess_escapeChannelRecovery_postInit"
        case runtimemonitor.ObservationKind.FrigateThreatResponseSystem_Instance_threatResponseProcess_escapeChannelRecovery_preCompute => "FrigateThreatResponseSystem_Instance_threatResponseProcess_escapeChannelRecovery_preCompute"
        case runtimemonitor.ObservationKind.FrigateThreatResponseSystem_Instance_threatResponseProcess_escapeChannelRecovery_postCompute => "FrigateThreatResponseSystem_Instance_threatResponseProcess_escapeChannelRecovery_postCompute"
        case runtimemonitor.ObservationKind.FrigateThreatResponseSystem_Instance_threatResponseProcess_defenseReadiness_postInit => "FrigateThreatResponseSystem_Instance_threatResponseProcess_defenseReadiness_postInit"
        case runtimemonitor.ObservationKind.FrigateThreatResponseSystem_Instance_threatResponseProcess_defenseReadiness_preCompute => "FrigateThreatResponseSystem_Instance_threatResponseProcess_defenseReadiness_preCompute"
        case runtimemonitor.ObservationKind.FrigateThreatResponseSystem_Instance_threatResponseProcess_defenseReadiness_postCompute => "FrigateThreatResponseSystem_Instance_threatResponseProcess_defenseReadiness_postCompute"
        case runtimemonitor.ObservationKind.FrigateThreatResponseSystem_Instance_threatResponseProcess_departureReadiness_postInit => "FrigateThreatResponseSystem_Instance_threatResponseProcess_departureReadiness_postInit"
        case runtimemonitor.ObservationKind.FrigateThreatResponseSystem_Instance_threatResponseProcess_departureReadiness_preCompute => "FrigateThreatResponseSystem_Instance_threatResponseProcess_departureReadiness_preCompute"
        case runtimemonitor.ObservationKind.FrigateThreatResponseSystem_Instance_threatResponseProcess_departureReadiness_postCompute => "FrigateThreatResponseSystem_Instance_threatResponseProcess_departureReadiness_postCompute"
        case runtimemonitor.ObservationKind.FrigateThreatResponseSystem_Instance_threatResponseProcess_defenseActivationDecision_postInit => "FrigateThreatResponseSystem_Instance_threatResponseProcess_defenseActivationDecision_postInit"
        case runtimemonitor.ObservationKind.FrigateThreatResponseSystem_Instance_threatResponseProcess_defenseActivationDecision_preCompute => "FrigateThreatResponseSystem_Instance_threatResponseProcess_defenseActivationDecision_preCompute"
        case runtimemonitor.ObservationKind.FrigateThreatResponseSystem_Instance_threatResponseProcess_defenseActivationDecision_postCompute => "FrigateThreatResponseSystem_Instance_threatResponseProcess_defenseActivationDecision_postCompute"
        case runtimemonitor.ObservationKind.FrigateThreatResponseSystem_Instance_threatResponseProcess_departureInitiationDecision_postInit => "FrigateThreatResponseSystem_Instance_threatResponseProcess_departureInitiationDecision_postInit"
        case runtimemonitor.ObservationKind.FrigateThreatResponseSystem_Instance_threatResponseProcess_departureInitiationDecision_preCompute => "FrigateThreatResponseSystem_Instance_threatResponseProcess_departureInitiationDecision_preCompute"
        case runtimemonitor.ObservationKind.FrigateThreatResponseSystem_Instance_threatResponseProcess_departureInitiationDecision_postCompute => "FrigateThreatResponseSystem_Instance_threatResponseProcess_departureInitiationDecision_postCompute"
        case runtimemonitor.ObservationKind.FrigateThreatResponseSystem_Instance_threatResponseProcess_responseCoordination_postInit => "FrigateThreatResponseSystem_Instance_threatResponseProcess_responseCoordination_postInit"
        case runtimemonitor.ObservationKind.FrigateThreatResponseSystem_Instance_threatResponseProcess_responseCoordination_preCompute => "FrigateThreatResponseSystem_Instance_threatResponseProcess_responseCoordination_preCompute"
        case runtimemonitor.ObservationKind.FrigateThreatResponseSystem_Instance_threatResponseProcess_responseCoordination_postCompute => "FrigateThreatResponseSystem_Instance_threatResponseProcess_responseCoordination_postCompute"
        case runtimemonitor.ObservationKind.FrigateThreatResponseSystem_Instance_threatResponseProcess_reportFrameComposition_postInit => "FrigateThreatResponseSystem_Instance_threatResponseProcess_reportFrameComposition_postInit"
        case runtimemonitor.ObservationKind.FrigateThreatResponseSystem_Instance_threatResponseProcess_reportFrameComposition_preCompute => "FrigateThreatResponseSystem_Instance_threatResponseProcess_reportFrameComposition_preCompute"
        case runtimemonitor.ObservationKind.FrigateThreatResponseSystem_Instance_threatResponseProcess_reportFrameComposition_postCompute => "FrigateThreatResponseSystem_Instance_threatResponseProcess_reportFrameComposition_postCompute"
      }
      return printObject(ISZ(
        ("type", printString("runtimemonitor.ObservationKind")),
        ("value", printString(value))
      ))
    }

    @pure def printutilContainer(o: util.Container): ST = {
      o match {
        case o: util.EmptyContainer => return printutilEmptyContainer(o)
        case o: Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PreState_Container_P => return printFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PreState_Container_PS => return printFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PostState_Container_P => return printFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PostState_Container_PS => return printFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_P => return printFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PS => return printFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_P => return printFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PS => return printFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_P => return printFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PS => return printFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_P => return printFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PS => return printFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PreState_Container_P => return printFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PS => return printFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PostState_Container_P => return printFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PS => return printFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_P => return printFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PS => return printFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_P => return printFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PS => return printFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_P => return printFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PS => return printFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_P => return printFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PS => return printFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_P => return printFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_P => return printFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PS => return printFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PS => return printFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_P => return printFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PS => return printFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_P => return printFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PS => return printFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_P => return printFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PS => return printFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_P => return printFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PS => return printFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_P => return printFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PS => return printFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_P => return printFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PS => return printFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PS(o)
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
        case o: Frigate_Threat_Response_Coordinator.AlertState_Payload => return printFrigate_Threat_Response_CoordinatorAlertState_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.ThreatBand_Payload => return printFrigate_Threat_Response_CoordinatorThreatBand_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.ChannelGate_Payload => return printFrigate_Threat_Response_CoordinatorChannelGate_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.RouteStatus_Payload => return printFrigate_Threat_Response_CoordinatorRouteStatus_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.ChannelState_Payload => return printFrigate_Threat_Response_CoordinatorChannelState_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.ThreatReport_Payload => return printFrigate_Threat_Response_CoordinatorThreatReport_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.ContactClass_Payload => return printFrigate_Threat_Response_CoordinatorContactClass_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.EscapeOutcome_Payload => return printFrigate_Threat_Response_CoordinatorEscapeOutcome_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.ResponseStage_Payload => return printFrigate_Threat_Response_CoordinatorResponseStage_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.ResponseFrame_Payload => return printFrigate_Threat_Response_CoordinatorResponseFrame_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.EscapeProposal_Payload => return printFrigate_Threat_Response_CoordinatorEscapeProposal_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.EvidenceStatus_Payload => return printFrigate_Threat_Response_CoordinatorEvidenceStatus_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.ThreatValidity_Payload => return printFrigate_Threat_Response_CoordinatorThreatValidity_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseOutcome_Payload => return printFrigate_Threat_Response_CoordinatorDefenseOutcome_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.ThreatEvidence_Payload => return printFrigate_Threat_Response_CoordinatorThreatEvidence_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.EscapeDirective_Payload => return printFrigate_Threat_Response_CoordinatorEscapeDirective_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.MiningInterlock_Payload => return printFrigate_Threat_Response_CoordinatorMiningInterlock_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseProposal_Payload => return printFrigate_Threat_Response_CoordinatorDefenseProposal_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.EscapeAuthority_Payload => return printFrigate_Threat_Response_CoordinatorEscapeAuthority_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.ResponsePattern_Payload => return printFrigate_Threat_Response_CoordinatorResponsePattern_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.QualifiedThreat_Payload => return printFrigate_Threat_Response_CoordinatorQualifiedThreat_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseDirective_Payload => return printFrigate_Threat_Response_CoordinatorDefenseDirective_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseAuthority_Payload => return printFrigate_Threat_Response_CoordinatorDefenseAuthority_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.EscapeChannelCondition_Payload => return printFrigate_Threat_Response_CoordinatorEscapeChannelCondition_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseChannelCondition_Payload => return printFrigate_Threat_Response_CoordinatorDefenseChannelCondition_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseReadinessContext_Payload => return printFrigate_Threat_Response_CoordinatorDefenseReadinessContext_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PreState_Container_P => return printFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PreState_Container_PS => return printFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PostState_Container_P => return printFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PostState_Container_PS => return printFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_P => return printFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PS => return printFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_P => return printFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PS => return printFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_P => return printFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PS => return printFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_P => return printFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PS => return printFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PreState_Container_P => return printFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PS => return printFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PostState_Container_P => return printFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PS => return printFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_P => return printFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PS => return printFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_P => return printFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PS => return printFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_P => return printFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PS => return printFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_P => return printFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PS => return printFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_P => return printFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_P => return printFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PS => return printFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PS => return printFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_P => return printFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PS => return printFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_P => return printFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PS => return printFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_P => return printFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PS => return printFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_P => return printFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PS => return printFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_P => return printFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PS => return printFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_P => return printFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PS => return printFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PS(o)
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

    def parseFrigate_Threat_Response_CoordinatorContactClassType(): Frigate_Threat_Response_Coordinator.ContactClass.Type = {
      val r = parseFrigate_Threat_Response_CoordinatorContactClassT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorContactClassT(typeParsed: B): Frigate_Threat_Response_Coordinator.ContactClass.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.ContactClass")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Frigate_Threat_Response_Coordinator.ContactClass.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Frigate_Threat_Response_Coordinator.ContactClass.")
          return Frigate_Threat_Response_Coordinator.ContactClass.byOrdinal(0).get
      }
    }

    def parseFrigate_Threat_Response_CoordinatorContactClass_Payload(): Frigate_Threat_Response_Coordinator.ContactClass_Payload = {
      val r = parseFrigate_Threat_Response_CoordinatorContactClass_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorContactClass_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.ContactClass_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.ContactClass_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Response_CoordinatorContactClassType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.ContactClass_Payload(value)
    }

    def parseFrigate_Threat_Response_CoordinatorEvidenceStatusType(): Frigate_Threat_Response_Coordinator.EvidenceStatus.Type = {
      val r = parseFrigate_Threat_Response_CoordinatorEvidenceStatusT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorEvidenceStatusT(typeParsed: B): Frigate_Threat_Response_Coordinator.EvidenceStatus.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.EvidenceStatus")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Frigate_Threat_Response_Coordinator.EvidenceStatus.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Frigate_Threat_Response_Coordinator.EvidenceStatus.")
          return Frigate_Threat_Response_Coordinator.EvidenceStatus.byOrdinal(0).get
      }
    }

    def parseFrigate_Threat_Response_CoordinatorEvidenceStatus_Payload(): Frigate_Threat_Response_Coordinator.EvidenceStatus_Payload = {
      val r = parseFrigate_Threat_Response_CoordinatorEvidenceStatus_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorEvidenceStatus_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.EvidenceStatus_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.EvidenceStatus_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Response_CoordinatorEvidenceStatusType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.EvidenceStatus_Payload(value)
    }

    def parseFrigate_Threat_Response_CoordinatorThreatBandType(): Frigate_Threat_Response_Coordinator.ThreatBand.Type = {
      val r = parseFrigate_Threat_Response_CoordinatorThreatBandT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorThreatBandT(typeParsed: B): Frigate_Threat_Response_Coordinator.ThreatBand.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.ThreatBand")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Frigate_Threat_Response_Coordinator.ThreatBand.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Frigate_Threat_Response_Coordinator.ThreatBand.")
          return Frigate_Threat_Response_Coordinator.ThreatBand.byOrdinal(0).get
      }
    }

    def parseFrigate_Threat_Response_CoordinatorThreatBand_Payload(): Frigate_Threat_Response_Coordinator.ThreatBand_Payload = {
      val r = parseFrigate_Threat_Response_CoordinatorThreatBand_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorThreatBand_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.ThreatBand_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.ThreatBand_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Response_CoordinatorThreatBandType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.ThreatBand_Payload(value)
    }

    def parseFrigate_Threat_Response_CoordinatorThreatValidityType(): Frigate_Threat_Response_Coordinator.ThreatValidity.Type = {
      val r = parseFrigate_Threat_Response_CoordinatorThreatValidityT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorThreatValidityT(typeParsed: B): Frigate_Threat_Response_Coordinator.ThreatValidity.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.ThreatValidity")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Frigate_Threat_Response_Coordinator.ThreatValidity.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Frigate_Threat_Response_Coordinator.ThreatValidity.")
          return Frigate_Threat_Response_Coordinator.ThreatValidity.byOrdinal(0).get
      }
    }

    def parseFrigate_Threat_Response_CoordinatorThreatValidity_Payload(): Frigate_Threat_Response_Coordinator.ThreatValidity_Payload = {
      val r = parseFrigate_Threat_Response_CoordinatorThreatValidity_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorThreatValidity_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.ThreatValidity_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.ThreatValidity_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Response_CoordinatorThreatValidityType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.ThreatValidity_Payload(value)
    }

    def parseFrigate_Threat_Response_CoordinatorAlertStateType(): Frigate_Threat_Response_Coordinator.AlertState.Type = {
      val r = parseFrigate_Threat_Response_CoordinatorAlertStateT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorAlertStateT(typeParsed: B): Frigate_Threat_Response_Coordinator.AlertState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.AlertState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Frigate_Threat_Response_Coordinator.AlertState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Frigate_Threat_Response_Coordinator.AlertState.")
          return Frigate_Threat_Response_Coordinator.AlertState.byOrdinal(0).get
      }
    }

    def parseFrigate_Threat_Response_CoordinatorAlertState_Payload(): Frigate_Threat_Response_Coordinator.AlertState_Payload = {
      val r = parseFrigate_Threat_Response_CoordinatorAlertState_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorAlertState_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.AlertState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.AlertState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Response_CoordinatorAlertStateType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.AlertState_Payload(value)
    }

    def parseFrigate_Threat_Response_CoordinatorThreatReportType(): Frigate_Threat_Response_Coordinator.ThreatReport.Type = {
      val r = parseFrigate_Threat_Response_CoordinatorThreatReportT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorThreatReportT(typeParsed: B): Frigate_Threat_Response_Coordinator.ThreatReport.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.ThreatReport")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Frigate_Threat_Response_Coordinator.ThreatReport.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Frigate_Threat_Response_Coordinator.ThreatReport.")
          return Frigate_Threat_Response_Coordinator.ThreatReport.byOrdinal(0).get
      }
    }

    def parseFrigate_Threat_Response_CoordinatorThreatReport_Payload(): Frigate_Threat_Response_Coordinator.ThreatReport_Payload = {
      val r = parseFrigate_Threat_Response_CoordinatorThreatReport_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorThreatReport_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.ThreatReport_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.ThreatReport_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Response_CoordinatorThreatReportType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.ThreatReport_Payload(value)
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseAuthorityType(): Frigate_Threat_Response_Coordinator.DefenseAuthority.Type = {
      val r = parseFrigate_Threat_Response_CoordinatorDefenseAuthorityT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseAuthorityT(typeParsed: B): Frigate_Threat_Response_Coordinator.DefenseAuthority.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.DefenseAuthority")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Frigate_Threat_Response_Coordinator.DefenseAuthority.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Frigate_Threat_Response_Coordinator.DefenseAuthority.")
          return Frigate_Threat_Response_Coordinator.DefenseAuthority.byOrdinal(0).get
      }
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseAuthority_Payload(): Frigate_Threat_Response_Coordinator.DefenseAuthority_Payload = {
      val r = parseFrigate_Threat_Response_CoordinatorDefenseAuthority_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseAuthority_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.DefenseAuthority_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.DefenseAuthority_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Response_CoordinatorDefenseAuthorityType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.DefenseAuthority_Payload(value)
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseOutcomeType(): Frigate_Threat_Response_Coordinator.DefenseOutcome.Type = {
      val r = parseFrigate_Threat_Response_CoordinatorDefenseOutcomeT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseOutcomeT(typeParsed: B): Frigate_Threat_Response_Coordinator.DefenseOutcome.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.DefenseOutcome")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Frigate_Threat_Response_Coordinator.DefenseOutcome.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Frigate_Threat_Response_Coordinator.DefenseOutcome.")
          return Frigate_Threat_Response_Coordinator.DefenseOutcome.byOrdinal(0).get
      }
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseOutcome_Payload(): Frigate_Threat_Response_Coordinator.DefenseOutcome_Payload = {
      val r = parseFrigate_Threat_Response_CoordinatorDefenseOutcome_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseOutcome_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.DefenseOutcome_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.DefenseOutcome_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Response_CoordinatorDefenseOutcomeType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.DefenseOutcome_Payload(value)
    }

    def parseFrigate_Threat_Response_CoordinatorChannelGateType(): Frigate_Threat_Response_Coordinator.ChannelGate.Type = {
      val r = parseFrigate_Threat_Response_CoordinatorChannelGateT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorChannelGateT(typeParsed: B): Frigate_Threat_Response_Coordinator.ChannelGate.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.ChannelGate")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Frigate_Threat_Response_Coordinator.ChannelGate.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Frigate_Threat_Response_Coordinator.ChannelGate.")
          return Frigate_Threat_Response_Coordinator.ChannelGate.byOrdinal(0).get
      }
    }

    def parseFrigate_Threat_Response_CoordinatorChannelGate_Payload(): Frigate_Threat_Response_Coordinator.ChannelGate_Payload = {
      val r = parseFrigate_Threat_Response_CoordinatorChannelGate_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorChannelGate_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.ChannelGate_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.ChannelGate_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Response_CoordinatorChannelGateType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.ChannelGate_Payload(value)
    }

    def parseFrigate_Threat_Response_CoordinatorChannelStateType(): Frigate_Threat_Response_Coordinator.ChannelState.Type = {
      val r = parseFrigate_Threat_Response_CoordinatorChannelStateT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorChannelStateT(typeParsed: B): Frigate_Threat_Response_Coordinator.ChannelState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.ChannelState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Frigate_Threat_Response_Coordinator.ChannelState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Frigate_Threat_Response_Coordinator.ChannelState.")
          return Frigate_Threat_Response_Coordinator.ChannelState.byOrdinal(0).get
      }
    }

    def parseFrigate_Threat_Response_CoordinatorChannelState_Payload(): Frigate_Threat_Response_Coordinator.ChannelState_Payload = {
      val r = parseFrigate_Threat_Response_CoordinatorChannelState_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorChannelState_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.ChannelState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.ChannelState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Response_CoordinatorChannelStateType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.ChannelState_Payload(value)
    }

    def parseFrigate_Threat_Response_CoordinatorEscapeAuthorityType(): Frigate_Threat_Response_Coordinator.EscapeAuthority.Type = {
      val r = parseFrigate_Threat_Response_CoordinatorEscapeAuthorityT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorEscapeAuthorityT(typeParsed: B): Frigate_Threat_Response_Coordinator.EscapeAuthority.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.EscapeAuthority")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Frigate_Threat_Response_Coordinator.EscapeAuthority.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Frigate_Threat_Response_Coordinator.EscapeAuthority.")
          return Frigate_Threat_Response_Coordinator.EscapeAuthority.byOrdinal(0).get
      }
    }

    def parseFrigate_Threat_Response_CoordinatorEscapeAuthority_Payload(): Frigate_Threat_Response_Coordinator.EscapeAuthority_Payload = {
      val r = parseFrigate_Threat_Response_CoordinatorEscapeAuthority_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorEscapeAuthority_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.EscapeAuthority_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.EscapeAuthority_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Response_CoordinatorEscapeAuthorityType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.EscapeAuthority_Payload(value)
    }

    def parseFrigate_Threat_Response_CoordinatorEscapeOutcomeType(): Frigate_Threat_Response_Coordinator.EscapeOutcome.Type = {
      val r = parseFrigate_Threat_Response_CoordinatorEscapeOutcomeT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorEscapeOutcomeT(typeParsed: B): Frigate_Threat_Response_Coordinator.EscapeOutcome.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.EscapeOutcome")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Frigate_Threat_Response_Coordinator.EscapeOutcome.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Frigate_Threat_Response_Coordinator.EscapeOutcome.")
          return Frigate_Threat_Response_Coordinator.EscapeOutcome.byOrdinal(0).get
      }
    }

    def parseFrigate_Threat_Response_CoordinatorEscapeOutcome_Payload(): Frigate_Threat_Response_Coordinator.EscapeOutcome_Payload = {
      val r = parseFrigate_Threat_Response_CoordinatorEscapeOutcome_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorEscapeOutcome_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.EscapeOutcome_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.EscapeOutcome_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Response_CoordinatorEscapeOutcomeType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.EscapeOutcome_Payload(value)
    }

    def parseFrigate_Threat_Response_CoordinatorRouteStatusType(): Frigate_Threat_Response_Coordinator.RouteStatus.Type = {
      val r = parseFrigate_Threat_Response_CoordinatorRouteStatusT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorRouteStatusT(typeParsed: B): Frigate_Threat_Response_Coordinator.RouteStatus.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.RouteStatus")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Frigate_Threat_Response_Coordinator.RouteStatus.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Frigate_Threat_Response_Coordinator.RouteStatus.")
          return Frigate_Threat_Response_Coordinator.RouteStatus.byOrdinal(0).get
      }
    }

    def parseFrigate_Threat_Response_CoordinatorRouteStatus_Payload(): Frigate_Threat_Response_Coordinator.RouteStatus_Payload = {
      val r = parseFrigate_Threat_Response_CoordinatorRouteStatus_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorRouteStatus_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.RouteStatus_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.RouteStatus_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Response_CoordinatorRouteStatusType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.RouteStatus_Payload(value)
    }

    def parseFrigate_Threat_Response_CoordinatorMiningInterlockType(): Frigate_Threat_Response_Coordinator.MiningInterlock.Type = {
      val r = parseFrigate_Threat_Response_CoordinatorMiningInterlockT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorMiningInterlockT(typeParsed: B): Frigate_Threat_Response_Coordinator.MiningInterlock.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.MiningInterlock")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Frigate_Threat_Response_Coordinator.MiningInterlock.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Frigate_Threat_Response_Coordinator.MiningInterlock.")
          return Frigate_Threat_Response_Coordinator.MiningInterlock.byOrdinal(0).get
      }
    }

    def parseFrigate_Threat_Response_CoordinatorMiningInterlock_Payload(): Frigate_Threat_Response_Coordinator.MiningInterlock_Payload = {
      val r = parseFrigate_Threat_Response_CoordinatorMiningInterlock_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorMiningInterlock_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.MiningInterlock_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.MiningInterlock_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Response_CoordinatorMiningInterlockType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.MiningInterlock_Payload(value)
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseProposalType(): Frigate_Threat_Response_Coordinator.DefenseProposal.Type = {
      val r = parseFrigate_Threat_Response_CoordinatorDefenseProposalT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseProposalT(typeParsed: B): Frigate_Threat_Response_Coordinator.DefenseProposal.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.DefenseProposal")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Frigate_Threat_Response_Coordinator.DefenseProposal.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Frigate_Threat_Response_Coordinator.DefenseProposal.")
          return Frigate_Threat_Response_Coordinator.DefenseProposal.byOrdinal(0).get
      }
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseProposal_Payload(): Frigate_Threat_Response_Coordinator.DefenseProposal_Payload = {
      val r = parseFrigate_Threat_Response_CoordinatorDefenseProposal_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseProposal_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.DefenseProposal_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.DefenseProposal_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Response_CoordinatorDefenseProposalType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.DefenseProposal_Payload(value)
    }

    def parseFrigate_Threat_Response_CoordinatorEscapeProposalType(): Frigate_Threat_Response_Coordinator.EscapeProposal.Type = {
      val r = parseFrigate_Threat_Response_CoordinatorEscapeProposalT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorEscapeProposalT(typeParsed: B): Frigate_Threat_Response_Coordinator.EscapeProposal.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.EscapeProposal")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Frigate_Threat_Response_Coordinator.EscapeProposal.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Frigate_Threat_Response_Coordinator.EscapeProposal.")
          return Frigate_Threat_Response_Coordinator.EscapeProposal.byOrdinal(0).get
      }
    }

    def parseFrigate_Threat_Response_CoordinatorEscapeProposal_Payload(): Frigate_Threat_Response_Coordinator.EscapeProposal_Payload = {
      val r = parseFrigate_Threat_Response_CoordinatorEscapeProposal_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorEscapeProposal_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.EscapeProposal_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.EscapeProposal_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Response_CoordinatorEscapeProposalType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.EscapeProposal_Payload(value)
    }

    def parseFrigate_Threat_Response_CoordinatorResponsePatternType(): Frigate_Threat_Response_Coordinator.ResponsePattern.Type = {
      val r = parseFrigate_Threat_Response_CoordinatorResponsePatternT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorResponsePatternT(typeParsed: B): Frigate_Threat_Response_Coordinator.ResponsePattern.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.ResponsePattern")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Frigate_Threat_Response_Coordinator.ResponsePattern.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Frigate_Threat_Response_Coordinator.ResponsePattern.")
          return Frigate_Threat_Response_Coordinator.ResponsePattern.byOrdinal(0).get
      }
    }

    def parseFrigate_Threat_Response_CoordinatorResponsePattern_Payload(): Frigate_Threat_Response_Coordinator.ResponsePattern_Payload = {
      val r = parseFrigate_Threat_Response_CoordinatorResponsePattern_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorResponsePattern_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.ResponsePattern_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.ResponsePattern_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Response_CoordinatorResponsePatternType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.ResponsePattern_Payload(value)
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseDirectiveType(): Frigate_Threat_Response_Coordinator.DefenseDirective.Type = {
      val r = parseFrigate_Threat_Response_CoordinatorDefenseDirectiveT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseDirectiveT(typeParsed: B): Frigate_Threat_Response_Coordinator.DefenseDirective.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.DefenseDirective")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Frigate_Threat_Response_Coordinator.DefenseDirective.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Frigate_Threat_Response_Coordinator.DefenseDirective.")
          return Frigate_Threat_Response_Coordinator.DefenseDirective.byOrdinal(0).get
      }
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseDirective_Payload(): Frigate_Threat_Response_Coordinator.DefenseDirective_Payload = {
      val r = parseFrigate_Threat_Response_CoordinatorDefenseDirective_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseDirective_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.DefenseDirective_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.DefenseDirective_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Response_CoordinatorDefenseDirectiveType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.DefenseDirective_Payload(value)
    }

    def parseFrigate_Threat_Response_CoordinatorEscapeDirectiveType(): Frigate_Threat_Response_Coordinator.EscapeDirective.Type = {
      val r = parseFrigate_Threat_Response_CoordinatorEscapeDirectiveT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorEscapeDirectiveT(typeParsed: B): Frigate_Threat_Response_Coordinator.EscapeDirective.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.EscapeDirective")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Frigate_Threat_Response_Coordinator.EscapeDirective.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Frigate_Threat_Response_Coordinator.EscapeDirective.")
          return Frigate_Threat_Response_Coordinator.EscapeDirective.byOrdinal(0).get
      }
    }

    def parseFrigate_Threat_Response_CoordinatorEscapeDirective_Payload(): Frigate_Threat_Response_Coordinator.EscapeDirective_Payload = {
      val r = parseFrigate_Threat_Response_CoordinatorEscapeDirective_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorEscapeDirective_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.EscapeDirective_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.EscapeDirective_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Response_CoordinatorEscapeDirectiveType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.EscapeDirective_Payload(value)
    }

    def parseFrigate_Threat_Response_CoordinatorResponseStageType(): Frigate_Threat_Response_Coordinator.ResponseStage.Type = {
      val r = parseFrigate_Threat_Response_CoordinatorResponseStageT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorResponseStageT(typeParsed: B): Frigate_Threat_Response_Coordinator.ResponseStage.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.ResponseStage")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Frigate_Threat_Response_Coordinator.ResponseStage.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Frigate_Threat_Response_Coordinator.ResponseStage.")
          return Frigate_Threat_Response_Coordinator.ResponseStage.byOrdinal(0).get
      }
    }

    def parseFrigate_Threat_Response_CoordinatorResponseStage_Payload(): Frigate_Threat_Response_Coordinator.ResponseStage_Payload = {
      val r = parseFrigate_Threat_Response_CoordinatorResponseStage_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorResponseStage_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.ResponseStage_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.ResponseStage_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Response_CoordinatorResponseStageType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.ResponseStage_Payload(value)
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseChannelConditionType(): Frigate_Threat_Response_Coordinator.DefenseChannelCondition.Type = {
      val r = parseFrigate_Threat_Response_CoordinatorDefenseChannelConditionT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseChannelConditionT(typeParsed: B): Frigate_Threat_Response_Coordinator.DefenseChannelCondition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.DefenseChannelCondition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Frigate_Threat_Response_Coordinator.DefenseChannelCondition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Frigate_Threat_Response_Coordinator.DefenseChannelCondition.")
          return Frigate_Threat_Response_Coordinator.DefenseChannelCondition.byOrdinal(0).get
      }
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseChannelCondition_Payload(): Frigate_Threat_Response_Coordinator.DefenseChannelCondition_Payload = {
      val r = parseFrigate_Threat_Response_CoordinatorDefenseChannelCondition_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseChannelCondition_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.DefenseChannelCondition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.DefenseChannelCondition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Response_CoordinatorDefenseChannelConditionType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.DefenseChannelCondition_Payload(value)
    }

    def parseFrigate_Threat_Response_CoordinatorEscapeChannelConditionType(): Frigate_Threat_Response_Coordinator.EscapeChannelCondition.Type = {
      val r = parseFrigate_Threat_Response_CoordinatorEscapeChannelConditionT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorEscapeChannelConditionT(typeParsed: B): Frigate_Threat_Response_Coordinator.EscapeChannelCondition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.EscapeChannelCondition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Frigate_Threat_Response_Coordinator.EscapeChannelCondition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Frigate_Threat_Response_Coordinator.EscapeChannelCondition.")
          return Frigate_Threat_Response_Coordinator.EscapeChannelCondition.byOrdinal(0).get
      }
    }

    def parseFrigate_Threat_Response_CoordinatorEscapeChannelCondition_Payload(): Frigate_Threat_Response_Coordinator.EscapeChannelCondition_Payload = {
      val r = parseFrigate_Threat_Response_CoordinatorEscapeChannelCondition_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorEscapeChannelCondition_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.EscapeChannelCondition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.EscapeChannelCondition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Response_CoordinatorEscapeChannelConditionType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.EscapeChannelCondition_Payload(value)
    }

    def parseFrigate_Threat_Response_CoordinatorThreatEvidence(): Frigate_Threat_Response_Coordinator.ThreatEvidence = {
      val r = parseFrigate_Threat_Response_CoordinatorThreatEvidenceT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorThreatEvidenceT(typeParsed: B): Frigate_Threat_Response_Coordinator.ThreatEvidence = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.ThreatEvidence")
      }
      parser.parseObjectKey("contactClass")
      val contactClass = parseFrigate_Threat_Response_CoordinatorContactClassType()
      parser.parseObjectNext()
      parser.parseObjectKey("evidenceStatus")
      val evidenceStatus = parseFrigate_Threat_Response_CoordinatorEvidenceStatusType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.ThreatEvidence(contactClass, evidenceStatus)
    }

    def parseFrigate_Threat_Response_CoordinatorThreatEvidence_Payload(): Frigate_Threat_Response_Coordinator.ThreatEvidence_Payload = {
      val r = parseFrigate_Threat_Response_CoordinatorThreatEvidence_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorThreatEvidence_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.ThreatEvidence_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.ThreatEvidence_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Response_CoordinatorThreatEvidence()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.ThreatEvidence_Payload(value)
    }

    def parseFrigate_Threat_Response_CoordinatorQualifiedThreat(): Frigate_Threat_Response_Coordinator.QualifiedThreat = {
      val r = parseFrigate_Threat_Response_CoordinatorQualifiedThreatT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorQualifiedThreatT(typeParsed: B): Frigate_Threat_Response_Coordinator.QualifiedThreat = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.QualifiedThreat")
      }
      parser.parseObjectKey("band")
      val band = parseFrigate_Threat_Response_CoordinatorThreatBandType()
      parser.parseObjectNext()
      parser.parseObjectKey("validity")
      val validity = parseFrigate_Threat_Response_CoordinatorThreatValidityType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.QualifiedThreat(band, validity)
    }

    def parseFrigate_Threat_Response_CoordinatorQualifiedThreat_Payload(): Frigate_Threat_Response_Coordinator.QualifiedThreat_Payload = {
      val r = parseFrigate_Threat_Response_CoordinatorQualifiedThreat_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorQualifiedThreat_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.QualifiedThreat_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.QualifiedThreat_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Response_CoordinatorQualifiedThreat()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.QualifiedThreat_Payload(value)
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseReadinessContext(): Frigate_Threat_Response_Coordinator.DefenseReadinessContext = {
      val r = parseFrigate_Threat_Response_CoordinatorDefenseReadinessContextT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseReadinessContextT(typeParsed: B): Frigate_Threat_Response_Coordinator.DefenseReadinessContext = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.DefenseReadinessContext")
      }
      parser.parseObjectKey("defenseAvailable")
      val defenseAvailable = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("capacitorAdequate")
      val capacitorAdequate = parser.parseB()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.DefenseReadinessContext(defenseAvailable, capacitorAdequate)
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseReadinessContext_Payload(): Frigate_Threat_Response_Coordinator.DefenseReadinessContext_Payload = {
      val r = parseFrigate_Threat_Response_CoordinatorDefenseReadinessContext_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseReadinessContext_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.DefenseReadinessContext_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.DefenseReadinessContext_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Response_CoordinatorDefenseReadinessContext()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.DefenseReadinessContext_Payload(value)
    }

    def parseFrigate_Threat_Response_CoordinatorResponseFrame(): Frigate_Threat_Response_Coordinator.ResponseFrame = {
      val r = parseFrigate_Threat_Response_CoordinatorResponseFrameT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorResponseFrameT(typeParsed: B): Frigate_Threat_Response_Coordinator.ResponseFrame = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.ResponseFrame")
      }
      parser.parseObjectKey("threatReport")
      val threatReport = parseFrigate_Threat_Response_CoordinatorThreatReportType()
      parser.parseObjectNext()
      parser.parseObjectKey("defenseDirective")
      val defenseDirective = parseFrigate_Threat_Response_CoordinatorDefenseDirectiveType()
      parser.parseObjectNext()
      parser.parseObjectKey("escapeDirective")
      val escapeDirective = parseFrigate_Threat_Response_CoordinatorEscapeDirectiveType()
      parser.parseObjectNext()
      parser.parseObjectKey("responsePattern")
      val responsePattern = parseFrigate_Threat_Response_CoordinatorResponsePatternType()
      parser.parseObjectNext()
      parser.parseObjectKey("responseStage")
      val responseStage = parseFrigate_Threat_Response_CoordinatorResponseStageType()
      parser.parseObjectNext()
      parser.parseObjectKey("defenseCondition")
      val defenseCondition = parseFrigate_Threat_Response_CoordinatorDefenseChannelConditionType()
      parser.parseObjectNext()
      parser.parseObjectKey("escapeCondition")
      val escapeCondition = parseFrigate_Threat_Response_CoordinatorEscapeChannelConditionType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.ResponseFrame(threatReport, defenseDirective, escapeDirective, responsePattern, responseStage, defenseCondition, escapeCondition)
    }

    def parseFrigate_Threat_Response_CoordinatorResponseFrame_Payload(): Frigate_Threat_Response_Coordinator.ResponseFrame_Payload = {
      val r = parseFrigate_Threat_Response_CoordinatorResponseFrame_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorResponseFrame_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.ResponseFrame_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.ResponseFrame_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Response_CoordinatorResponseFrame()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.ResponseFrame_Payload(value)
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

    def parseFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container(): Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PreState_Container_P", "Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PS"))
      t.native match {
        case "Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PreState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PST(T); return r
        case _ => val r = parseFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PST(T); return r
      }
    }

    def parseFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_P(): Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PreState_Container_P = {
      val r = parseFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PT(typeParsed: B): Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PreState_Container_P")
      }
      parser.parseObjectKey("api_threatEvidenceIn")
      val api_threatEvidenceIn = parseFrigate_Threat_Response_CoordinatorThreatEvidence()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PreState_Container_P(api_threatEvidenceIn)
    }

    def parseFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PS(): Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PS = {
      val r = parseFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PST(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PST(typeParsed: B): Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PS")
      }
      parser.parseObjectKey("api_threatEvidenceIn")
      val api_threatEvidenceIn = parseFrigate_Threat_Response_CoordinatorThreatEvidence()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PS(api_threatEvidenceIn)
    }

    def parseFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container(): Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PostState_Container_P", "Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PS"))
      t.native match {
        case "Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PostState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PST(T); return r
        case _ => val r = parseFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PST(T); return r
      }
    }

    def parseFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_P(): Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PostState_Container_P = {
      val r = parseFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PT(typeParsed: B): Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PostState_Container_P")
      }
      parser.parseObjectKey("api_qualifiedThreatToAlertOut")
      val api_qualifiedThreatToAlertOut = parseFrigate_Threat_Response_CoordinatorQualifiedThreat()
      parser.parseObjectNext()
      parser.parseObjectKey("api_threatValidityToDefenseOut")
      val api_threatValidityToDefenseOut = parseFrigate_Threat_Response_CoordinatorThreatValidityType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_threatValidityToEscapeOut")
      val api_threatValidityToEscapeOut = parseFrigate_Threat_Response_CoordinatorThreatValidityType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PostState_Container_P(api_qualifiedThreatToAlertOut, api_threatValidityToDefenseOut, api_threatValidityToEscapeOut)
    }

    def parseFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PS(): Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PS = {
      val r = parseFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PST(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PST(typeParsed: B): Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PS")
      }
      parser.parseObjectKey("api_qualifiedThreatToAlertOut")
      val api_qualifiedThreatToAlertOut = parseFrigate_Threat_Response_CoordinatorQualifiedThreat()
      parser.parseObjectNext()
      parser.parseObjectKey("api_threatValidityToDefenseOut")
      val api_threatValidityToDefenseOut = parseFrigate_Threat_Response_CoordinatorThreatValidityType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_threatValidityToEscapeOut")
      val api_threatValidityToEscapeOut = parseFrigate_Threat_Response_CoordinatorThreatValidityType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PS(api_qualifiedThreatToAlertOut, api_threatValidityToDefenseOut, api_threatValidityToEscapeOut)
    }

    def parseFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container(): Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PreState_Container_P", "Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PreState_Container_PS"))
      t.native match {
        case "Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PreState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PreState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_PST(T); return r
        case _ => val r = parseFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_PST(T); return r
      }
    }

    def parseFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_P(): Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PreState_Container_P = {
      val r = parseFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_PT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_PT(typeParsed: B): Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PreState_Container_P")
      }
      parser.parseObjectKey("api_clearAcknowledgmentIn")
      val api_clearAcknowledgmentIn = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("api_qualifiedThreatIn")
      val api_qualifiedThreatIn = parseFrigate_Threat_Response_CoordinatorQualifiedThreat()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PreState_Container_P(api_clearAcknowledgmentIn, api_qualifiedThreatIn)
    }

    def parseFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_PS(): Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PreState_Container_PS = {
      val r = parseFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_PST(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_PST(typeParsed: B): Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PreState_Container_PS")
      }
      parser.parseObjectKey("In_retainedAlert")
      val In_retainedAlert = parseFrigate_Threat_Response_CoordinatorAlertStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_clearAcknowledgmentIn")
      val api_clearAcknowledgmentIn = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("api_qualifiedThreatIn")
      val api_qualifiedThreatIn = parseFrigate_Threat_Response_CoordinatorQualifiedThreat()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PreState_Container_PS(In_retainedAlert, api_clearAcknowledgmentIn, api_qualifiedThreatIn)
    }

    def parseFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container(): Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PostState_Container_P", "Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PostState_Container_PS"))
      t.native match {
        case "Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PostState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PostState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_PST(T); return r
        case _ => val r = parseFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_PST(T); return r
      }
    }

    def parseFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_P(): Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PostState_Container_P = {
      val r = parseFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_PT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_PT(typeParsed: B): Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PostState_Container_P")
      }
      parser.parseObjectKey("api_compositionAlertOut")
      val api_compositionAlertOut = parseFrigate_Threat_Response_CoordinatorAlertStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_defenseAlertOut")
      val api_defenseAlertOut = parseFrigate_Threat_Response_CoordinatorAlertStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_escapeAlertOut")
      val api_escapeAlertOut = parseFrigate_Threat_Response_CoordinatorAlertStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_threatReportOut")
      val api_threatReportOut = parseFrigate_Threat_Response_CoordinatorThreatReportType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PostState_Container_P(api_compositionAlertOut, api_defenseAlertOut, api_escapeAlertOut, api_threatReportOut)
    }

    def parseFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_PS(): Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PostState_Container_PS = {
      val r = parseFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_PST(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_PST(typeParsed: B): Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PostState_Container_PS")
      }
      parser.parseObjectKey("retainedAlert")
      val retainedAlert = parseFrigate_Threat_Response_CoordinatorAlertStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_compositionAlertOut")
      val api_compositionAlertOut = parseFrigate_Threat_Response_CoordinatorAlertStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_defenseAlertOut")
      val api_defenseAlertOut = parseFrigate_Threat_Response_CoordinatorAlertStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_escapeAlertOut")
      val api_escapeAlertOut = parseFrigate_Threat_Response_CoordinatorAlertStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_threatReportOut")
      val api_threatReportOut = parseFrigate_Threat_Response_CoordinatorThreatReportType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PostState_Container_PS(retainedAlert, api_compositionAlertOut, api_defenseAlertOut, api_escapeAlertOut, api_threatReportOut)
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container(): Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_P", "Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PS"))
      t.native match {
        case "Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PST(T); return r
        case _ => val r = parseFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PST(T); return r
      }
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_P(): Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_P = {
      val r = parseFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PT(typeParsed: B): Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_P")
      }
      parser.parseObjectKey("api_defenseAuthorityIn")
      val api_defenseAuthorityIn = parseFrigate_Threat_Response_CoordinatorDefenseAuthorityType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_defenseOutcomeIn")
      val api_defenseOutcomeIn = parseFrigate_Threat_Response_CoordinatorDefenseOutcomeType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_threatValidityIn")
      val api_threatValidityIn = parseFrigate_Threat_Response_CoordinatorThreatValidityType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_P(api_defenseAuthorityIn, api_defenseOutcomeIn, api_threatValidityIn)
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PS(): Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PS = {
      val r = parseFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PST(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PST(typeParsed: B): Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PS")
      }
      parser.parseObjectKey("In_defenseRecoveryState")
      val In_defenseRecoveryState = parseFrigate_Threat_Response_CoordinatorChannelStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_defenseAuthorityIn")
      val api_defenseAuthorityIn = parseFrigate_Threat_Response_CoordinatorDefenseAuthorityType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_defenseOutcomeIn")
      val api_defenseOutcomeIn = parseFrigate_Threat_Response_CoordinatorDefenseOutcomeType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_threatValidityIn")
      val api_threatValidityIn = parseFrigate_Threat_Response_CoordinatorThreatValidityType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PS(In_defenseRecoveryState, api_defenseAuthorityIn, api_defenseOutcomeIn, api_threatValidityIn)
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container(): Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_P", "Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PS"))
      t.native match {
        case "Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PST(T); return r
        case _ => val r = parseFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PST(T); return r
      }
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_P(): Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_P = {
      val r = parseFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PT(typeParsed: B): Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_P")
      }
      parser.parseObjectKey("api_defenseChannelStateOut")
      val api_defenseChannelStateOut = parseFrigate_Threat_Response_CoordinatorChannelStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_defenseGateOut")
      val api_defenseGateOut = parseFrigate_Threat_Response_CoordinatorChannelGateType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_P(api_defenseChannelStateOut, api_defenseGateOut)
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PS(): Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PS = {
      val r = parseFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PST(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PST(typeParsed: B): Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PS")
      }
      parser.parseObjectKey("defenseRecoveryState")
      val defenseRecoveryState = parseFrigate_Threat_Response_CoordinatorChannelStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_defenseChannelStateOut")
      val api_defenseChannelStateOut = parseFrigate_Threat_Response_CoordinatorChannelStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_defenseGateOut")
      val api_defenseGateOut = parseFrigate_Threat_Response_CoordinatorChannelGateType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PS(defenseRecoveryState, api_defenseChannelStateOut, api_defenseGateOut)
    }

    def parseFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container(): Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_P", "Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PS"))
      t.native match {
        case "Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PST(T); return r
        case _ => val r = parseFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PST(T); return r
      }
    }

    def parseFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_P(): Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_P = {
      val r = parseFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PT(typeParsed: B): Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_P")
      }
      parser.parseObjectKey("api_escapeAuthorityIn")
      val api_escapeAuthorityIn = parseFrigate_Threat_Response_CoordinatorEscapeAuthorityType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_escapeOutcomeIn")
      val api_escapeOutcomeIn = parseFrigate_Threat_Response_CoordinatorEscapeOutcomeType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_threatValidityIn")
      val api_threatValidityIn = parseFrigate_Threat_Response_CoordinatorThreatValidityType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_P(api_escapeAuthorityIn, api_escapeOutcomeIn, api_threatValidityIn)
    }

    def parseFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PS(): Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PS = {
      val r = parseFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PST(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PST(typeParsed: B): Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PS")
      }
      parser.parseObjectKey("In_escapeRecoveryState")
      val In_escapeRecoveryState = parseFrigate_Threat_Response_CoordinatorChannelStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_escapeAuthorityIn")
      val api_escapeAuthorityIn = parseFrigate_Threat_Response_CoordinatorEscapeAuthorityType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_escapeOutcomeIn")
      val api_escapeOutcomeIn = parseFrigate_Threat_Response_CoordinatorEscapeOutcomeType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_threatValidityIn")
      val api_threatValidityIn = parseFrigate_Threat_Response_CoordinatorThreatValidityType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PS(In_escapeRecoveryState, api_escapeAuthorityIn, api_escapeOutcomeIn, api_threatValidityIn)
    }

    def parseFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container(): Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_P", "Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PS"))
      t.native match {
        case "Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PST(T); return r
        case _ => val r = parseFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PST(T); return r
      }
    }

    def parseFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_P(): Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_P = {
      val r = parseFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PT(typeParsed: B): Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_P")
      }
      parser.parseObjectKey("api_escapeChannelStateOut")
      val api_escapeChannelStateOut = parseFrigate_Threat_Response_CoordinatorChannelStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_escapeGateOut")
      val api_escapeGateOut = parseFrigate_Threat_Response_CoordinatorChannelGateType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_P(api_escapeChannelStateOut, api_escapeGateOut)
    }

    def parseFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PS(): Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PS = {
      val r = parseFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PST(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PST(typeParsed: B): Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PS")
      }
      parser.parseObjectKey("escapeRecoveryState")
      val escapeRecoveryState = parseFrigate_Threat_Response_CoordinatorChannelStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_escapeChannelStateOut")
      val api_escapeChannelStateOut = parseFrigate_Threat_Response_CoordinatorChannelStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_escapeGateOut")
      val api_escapeGateOut = parseFrigate_Threat_Response_CoordinatorChannelGateType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PS(escapeRecoveryState, api_escapeChannelStateOut, api_escapeGateOut)
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container(): Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_P", "Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PS"))
      t.native match {
        case "Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PST(T); return r
        case _ => val r = parseFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PST(T); return r
      }
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_P(): Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_P = {
      val r = parseFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PT(typeParsed: B): Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_P")
      }
      parser.parseObjectKey("api_defenseGateIn")
      val api_defenseGateIn = parseFrigate_Threat_Response_CoordinatorChannelGateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_readinessContextIn")
      val api_readinessContextIn = parseFrigate_Threat_Response_CoordinatorDefenseReadinessContext()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_P(api_defenseGateIn, api_readinessContextIn)
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PS(): Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PS = {
      val r = parseFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PST(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PST(typeParsed: B): Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PS")
      }
      parser.parseObjectKey("api_defenseGateIn")
      val api_defenseGateIn = parseFrigate_Threat_Response_CoordinatorChannelGateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_readinessContextIn")
      val api_readinessContextIn = parseFrigate_Threat_Response_CoordinatorDefenseReadinessContext()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PS(api_defenseGateIn, api_readinessContextIn)
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container(): Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_P", "Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PS"))
      t.native match {
        case "Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PST(T); return r
        case _ => val r = parseFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PST(T); return r
      }
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_P(): Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_P = {
      val r = parseFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PT(typeParsed: B): Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_P")
      }
      parser.parseObjectKey("api_defenseReadyOut")
      val api_defenseReadyOut = parser.parseB()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_P(api_defenseReadyOut)
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PS(): Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PS = {
      val r = parseFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PST(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PST(typeParsed: B): Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PS")
      }
      parser.parseObjectKey("api_defenseReadyOut")
      val api_defenseReadyOut = parser.parseB()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PS(api_defenseReadyOut)
    }

    def parseFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container(): Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_P", "Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PS"))
      t.native match {
        case "Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PST(T); return r
        case _ => val r = parseFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PST(T); return r
      }
    }

    def parseFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_P(): Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_P = {
      val r = parseFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PT(typeParsed: B): Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_P")
      }
      parser.parseObjectKey("api_escapeGateIn")
      val api_escapeGateIn = parseFrigate_Threat_Response_CoordinatorChannelGateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_miningInterlockIn")
      val api_miningInterlockIn = parseFrigate_Threat_Response_CoordinatorMiningInterlockType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_navigationAvailableIn")
      val api_navigationAvailableIn = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("api_routeStatusIn")
      val api_routeStatusIn = parseFrigate_Threat_Response_CoordinatorRouteStatusType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_P(api_escapeGateIn, api_miningInterlockIn, api_navigationAvailableIn, api_routeStatusIn)
    }

    def parseFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PS(): Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PS = {
      val r = parseFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PST(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PST(typeParsed: B): Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PS")
      }
      parser.parseObjectKey("api_escapeGateIn")
      val api_escapeGateIn = parseFrigate_Threat_Response_CoordinatorChannelGateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_miningInterlockIn")
      val api_miningInterlockIn = parseFrigate_Threat_Response_CoordinatorMiningInterlockType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_navigationAvailableIn")
      val api_navigationAvailableIn = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("api_routeStatusIn")
      val api_routeStatusIn = parseFrigate_Threat_Response_CoordinatorRouteStatusType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PS(api_escapeGateIn, api_miningInterlockIn, api_navigationAvailableIn, api_routeStatusIn)
    }

    def parseFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container(): Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_P", "Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PS"))
      t.native match {
        case "Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PST(T); return r
        case _ => val r = parseFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PST(T); return r
      }
    }

    def parseFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_P(): Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_P = {
      val r = parseFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PT(typeParsed: B): Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_P")
      }
      parser.parseObjectKey("api_escapeReadyOut")
      val api_escapeReadyOut = parser.parseB()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_P(api_escapeReadyOut)
    }

    def parseFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PS(): Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PS = {
      val r = parseFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PST(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PST(typeParsed: B): Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PS")
      }
      parser.parseObjectKey("api_escapeReadyOut")
      val api_escapeReadyOut = parser.parseB()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PS(api_escapeReadyOut)
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container(): Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_P", "Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PS"))
      t.native match {
        case "Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PST(T); return r
        case _ => val r = parseFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PST(T); return r
      }
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_P(): Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_P = {
      val r = parseFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PT(typeParsed: B): Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_P")
      }
      parser.parseObjectKey("api_alertStateIn")
      val api_alertStateIn = parseFrigate_Threat_Response_CoordinatorAlertStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_defenseAuthorityIn")
      val api_defenseAuthorityIn = parseFrigate_Threat_Response_CoordinatorDefenseAuthorityType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_defenseReadyIn")
      val api_defenseReadyIn = parser.parseB()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_P(api_alertStateIn, api_defenseAuthorityIn, api_defenseReadyIn)
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PS(): Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PS = {
      val r = parseFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PST(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PST(typeParsed: B): Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PS")
      }
      parser.parseObjectKey("api_alertStateIn")
      val api_alertStateIn = parseFrigate_Threat_Response_CoordinatorAlertStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_defenseAuthorityIn")
      val api_defenseAuthorityIn = parseFrigate_Threat_Response_CoordinatorDefenseAuthorityType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_defenseReadyIn")
      val api_defenseReadyIn = parser.parseB()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PS(api_alertStateIn, api_defenseAuthorityIn, api_defenseReadyIn)
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container(): Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_P", "Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PS"))
      t.native match {
        case "Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PST(T); return r
        case _ => val r = parseFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PST(T); return r
      }
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_P(): Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_P = {
      val r = parseFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PT(typeParsed: B): Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_P")
      }
      parser.parseObjectKey("api_defenseProposalToCompositionOut")
      val api_defenseProposalToCompositionOut = parseFrigate_Threat_Response_CoordinatorDefenseProposalType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_defenseProposalToCoordinationOut")
      val api_defenseProposalToCoordinationOut = parseFrigate_Threat_Response_CoordinatorDefenseProposalType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_P(api_defenseProposalToCompositionOut, api_defenseProposalToCoordinationOut)
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PS(): Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PS = {
      val r = parseFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PST(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PST(typeParsed: B): Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PS")
      }
      parser.parseObjectKey("api_defenseProposalToCompositionOut")
      val api_defenseProposalToCompositionOut = parseFrigate_Threat_Response_CoordinatorDefenseProposalType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_defenseProposalToCoordinationOut")
      val api_defenseProposalToCoordinationOut = parseFrigate_Threat_Response_CoordinatorDefenseProposalType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PS(api_defenseProposalToCompositionOut, api_defenseProposalToCoordinationOut)
    }

    def parseFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container(): Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_P", "Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PS"))
      t.native match {
        case "Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PST(T); return r
        case _ => val r = parseFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PST(T); return r
      }
    }

    def parseFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_P(): Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_P = {
      val r = parseFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PT(typeParsed: B): Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_P")
      }
      parser.parseObjectKey("api_alertStateIn")
      val api_alertStateIn = parseFrigate_Threat_Response_CoordinatorAlertStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_escapeAuthorityIn")
      val api_escapeAuthorityIn = parseFrigate_Threat_Response_CoordinatorEscapeAuthorityType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_escapeReadyIn")
      val api_escapeReadyIn = parser.parseB()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_P(api_alertStateIn, api_escapeAuthorityIn, api_escapeReadyIn)
    }

    def parseFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PS(): Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PS = {
      val r = parseFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PST(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PST(typeParsed: B): Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PS")
      }
      parser.parseObjectKey("api_alertStateIn")
      val api_alertStateIn = parseFrigate_Threat_Response_CoordinatorAlertStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_escapeAuthorityIn")
      val api_escapeAuthorityIn = parseFrigate_Threat_Response_CoordinatorEscapeAuthorityType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_escapeReadyIn")
      val api_escapeReadyIn = parser.parseB()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PS(api_alertStateIn, api_escapeAuthorityIn, api_escapeReadyIn)
    }

    def parseFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container(): Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_P", "Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PS"))
      t.native match {
        case "Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PST(T); return r
        case _ => val r = parseFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PST(T); return r
      }
    }

    def parseFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_P(): Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_P = {
      val r = parseFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PT(typeParsed: B): Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_P")
      }
      parser.parseObjectKey("api_escapeProposalToCompositionOut")
      val api_escapeProposalToCompositionOut = parseFrigate_Threat_Response_CoordinatorEscapeProposalType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_escapeProposalToCoordinationOut")
      val api_escapeProposalToCoordinationOut = parseFrigate_Threat_Response_CoordinatorEscapeProposalType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_P(api_escapeProposalToCompositionOut, api_escapeProposalToCoordinationOut)
    }

    def parseFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PS(): Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PS = {
      val r = parseFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PST(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PST(typeParsed: B): Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PS")
      }
      parser.parseObjectKey("api_escapeProposalToCompositionOut")
      val api_escapeProposalToCompositionOut = parseFrigate_Threat_Response_CoordinatorEscapeProposalType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_escapeProposalToCoordinationOut")
      val api_escapeProposalToCoordinationOut = parseFrigate_Threat_Response_CoordinatorEscapeProposalType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PS(api_escapeProposalToCompositionOut, api_escapeProposalToCoordinationOut)
    }

    def parseFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container(): Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_P", "Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PS"))
      t.native match {
        case "Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PST(T); return r
        case _ => val r = parseFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PST(T); return r
      }
    }

    def parseFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_P(): Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_P = {
      val r = parseFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PT(typeParsed: B): Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_P")
      }
      parser.parseObjectKey("api_defenseProposalIn")
      val api_defenseProposalIn = parseFrigate_Threat_Response_CoordinatorDefenseProposalType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_escapeProposalIn")
      val api_escapeProposalIn = parseFrigate_Threat_Response_CoordinatorEscapeProposalType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_P(api_defenseProposalIn, api_escapeProposalIn)
    }

    def parseFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PS(): Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PS = {
      val r = parseFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PST(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PST(typeParsed: B): Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PS")
      }
      parser.parseObjectKey("api_defenseProposalIn")
      val api_defenseProposalIn = parseFrigate_Threat_Response_CoordinatorDefenseProposalType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_escapeProposalIn")
      val api_escapeProposalIn = parseFrigate_Threat_Response_CoordinatorEscapeProposalType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PS(api_defenseProposalIn, api_escapeProposalIn)
    }

    def parseFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container(): Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_P", "Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PS"))
      t.native match {
        case "Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PST(T); return r
        case _ => val r = parseFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PST(T); return r
      }
    }

    def parseFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_P(): Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_P = {
      val r = parseFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PT(typeParsed: B): Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_P")
      }
      parser.parseObjectKey("api_responsePatternOut")
      val api_responsePatternOut = parseFrigate_Threat_Response_CoordinatorResponsePatternType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_P(api_responsePatternOut)
    }

    def parseFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PS(): Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PS = {
      val r = parseFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PST(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PST(typeParsed: B): Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PS")
      }
      parser.parseObjectKey("api_responsePatternOut")
      val api_responsePatternOut = parseFrigate_Threat_Response_CoordinatorResponsePatternType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PS(api_responsePatternOut)
    }

    def parseFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container(): Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_P", "Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PS"))
      t.native match {
        case "Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PST(T); return r
        case _ => val r = parseFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PST(T); return r
      }
    }

    def parseFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_P(): Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_P = {
      val r = parseFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PT(typeParsed: B): Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_P")
      }
      parser.parseObjectKey("api_alertStateIn")
      val api_alertStateIn = parseFrigate_Threat_Response_CoordinatorAlertStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_defenseChannelStateIn")
      val api_defenseChannelStateIn = parseFrigate_Threat_Response_CoordinatorChannelStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_defenseProposalIn")
      val api_defenseProposalIn = parseFrigate_Threat_Response_CoordinatorDefenseProposalType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_escapeChannelStateIn")
      val api_escapeChannelStateIn = parseFrigate_Threat_Response_CoordinatorChannelStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_escapeProposalIn")
      val api_escapeProposalIn = parseFrigate_Threat_Response_CoordinatorEscapeProposalType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_responsePatternIn")
      val api_responsePatternIn = parseFrigate_Threat_Response_CoordinatorResponsePatternType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_threatReportIn")
      val api_threatReportIn = parseFrigate_Threat_Response_CoordinatorThreatReportType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_P(api_alertStateIn, api_defenseChannelStateIn, api_defenseProposalIn, api_escapeChannelStateIn, api_escapeProposalIn, api_responsePatternIn, api_threatReportIn)
    }

    def parseFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PS(): Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PS = {
      val r = parseFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PST(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PST(typeParsed: B): Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PS")
      }
      parser.parseObjectKey("api_alertStateIn")
      val api_alertStateIn = parseFrigate_Threat_Response_CoordinatorAlertStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_defenseChannelStateIn")
      val api_defenseChannelStateIn = parseFrigate_Threat_Response_CoordinatorChannelStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_defenseProposalIn")
      val api_defenseProposalIn = parseFrigate_Threat_Response_CoordinatorDefenseProposalType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_escapeChannelStateIn")
      val api_escapeChannelStateIn = parseFrigate_Threat_Response_CoordinatorChannelStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_escapeProposalIn")
      val api_escapeProposalIn = parseFrigate_Threat_Response_CoordinatorEscapeProposalType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_responsePatternIn")
      val api_responsePatternIn = parseFrigate_Threat_Response_CoordinatorResponsePatternType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_threatReportIn")
      val api_threatReportIn = parseFrigate_Threat_Response_CoordinatorThreatReportType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PS(api_alertStateIn, api_defenseChannelStateIn, api_defenseProposalIn, api_escapeChannelStateIn, api_escapeProposalIn, api_responsePatternIn, api_threatReportIn)
    }

    def parseFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container(): Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_P", "Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PS"))
      t.native match {
        case "Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PST(T); return r
        case _ => val r = parseFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PST(T); return r
      }
    }

    def parseFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_P(): Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_P = {
      val r = parseFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PT(typeParsed: B): Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_P")
      }
      parser.parseObjectKey("api_responseFrameOut")
      val api_responseFrameOut = parseFrigate_Threat_Response_CoordinatorResponseFrame()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_P(api_responseFrameOut)
    }

    def parseFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PS(): Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PS = {
      val r = parseFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PST(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PST(typeParsed: B): Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PS")
      }
      parser.parseObjectKey("api_responseFrameOut")
      val api_responseFrameOut = parseFrigate_Threat_Response_CoordinatorResponseFrame()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PS(api_responseFrameOut)
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
      val t = parser.parseObjectTypes(ISZ("util.EmptyContainer", "Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PreState_Container_P", "Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PreState_Container_PS", "Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PostState_Container_P", "Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PostState_Container_PS", "Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_P", "Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PS", "Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_P", "Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PS", "Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_P", "Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PS", "Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_P", "Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PS", "Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PreState_Container_P", "Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PS", "Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PostState_Container_P", "Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PS", "Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_P", "Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PS", "Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_P", "Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PS", "Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_P", "Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PS", "Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_P", "Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PS", "Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_P", "Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_P", "Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PS", "Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PS", "Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_P", "Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PS", "Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_P", "Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PS", "Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_P", "Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PS", "Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_P", "Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PS", "Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_P", "Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PS", "Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_P", "Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PS"))
      t.native match {
        case "util.EmptyContainer" => val r = parseutilEmptyContainerT(T); return r
        case "Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PreState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PreState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_PST(T); return r
        case "Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PostState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PostState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_PST(T); return r
        case "Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PST(T); return r
        case "Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PST(T); return r
        case "Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PST(T); return r
        case "Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PST(T); return r
        case "Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PreState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PST(T); return r
        case "Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PostState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PST(T); return r
        case "Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PST(T); return r
        case "Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PST(T); return r
        case "Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PST(T); return r
        case "Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PST(T); return r
        case "Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PST(T); return r
        case "Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PST(T); return r
        case "Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PST(T); return r
        case "Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PST(T); return r
        case "Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PST(T); return r
        case "Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PST(T); return r
        case "Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PST(T); return r
        case "Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PST(T); return r
        case _ => val r = parseFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PST(T); return r
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
      val t = parser.parseObjectTypes(ISZ("art.Empty", "Base_Types.Boolean_Payload", "Base_Types.Integer_Payload", "Base_Types.Integer_8_Payload", "Base_Types.Integer_16_Payload", "Base_Types.Integer_32_Payload", "Base_Types.Integer_64_Payload", "Base_Types.Unsigned_8_Payload", "Base_Types.Unsigned_16_Payload", "Base_Types.Unsigned_32_Payload", "Base_Types.Unsigned_64_Payload", "Base_Types.Float_Payload", "Base_Types.Float_32_Payload", "Base_Types.Float_64_Payload", "Base_Types.Character_Payload", "Base_Types.String_Payload", "Base_Types.Bits_Payload", "util.EmptyContainer", "Frigate_Threat_Response_Coordinator.AlertState_Payload", "Frigate_Threat_Response_Coordinator.ThreatBand_Payload", "Frigate_Threat_Response_Coordinator.ChannelGate_Payload", "Frigate_Threat_Response_Coordinator.RouteStatus_Payload", "Frigate_Threat_Response_Coordinator.ChannelState_Payload", "Frigate_Threat_Response_Coordinator.ThreatReport_Payload", "Frigate_Threat_Response_Coordinator.ContactClass_Payload", "Frigate_Threat_Response_Coordinator.EscapeOutcome_Payload", "Frigate_Threat_Response_Coordinator.ResponseStage_Payload", "Frigate_Threat_Response_Coordinator.ResponseFrame_Payload", "Frigate_Threat_Response_Coordinator.EscapeProposal_Payload", "Frigate_Threat_Response_Coordinator.EvidenceStatus_Payload", "Frigate_Threat_Response_Coordinator.ThreatValidity_Payload", "Frigate_Threat_Response_Coordinator.DefenseOutcome_Payload", "Frigate_Threat_Response_Coordinator.ThreatEvidence_Payload", "Frigate_Threat_Response_Coordinator.EscapeDirective_Payload", "Frigate_Threat_Response_Coordinator.MiningInterlock_Payload", "Frigate_Threat_Response_Coordinator.DefenseProposal_Payload", "Frigate_Threat_Response_Coordinator.EscapeAuthority_Payload", "Frigate_Threat_Response_Coordinator.ResponsePattern_Payload", "Frigate_Threat_Response_Coordinator.QualifiedThreat_Payload", "Frigate_Threat_Response_Coordinator.DefenseDirective_Payload", "Frigate_Threat_Response_Coordinator.DefenseAuthority_Payload", "Frigate_Threat_Response_Coordinator.EscapeChannelCondition_Payload", "Frigate_Threat_Response_Coordinator.DefenseChannelCondition_Payload", "Frigate_Threat_Response_Coordinator.DefenseReadinessContext_Payload", "Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PreState_Container_P", "Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PreState_Container_PS", "Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PostState_Container_P", "Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PostState_Container_PS", "Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_P", "Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PS", "Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_P", "Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PS", "Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_P", "Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PS", "Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_P", "Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PS", "Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PreState_Container_P", "Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PS", "Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PostState_Container_P", "Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PS", "Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_P", "Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PS", "Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_P", "Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PS", "Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_P", "Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PS", "Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_P", "Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PS", "Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_P", "Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_P", "Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PS", "Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PS", "Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_P", "Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PS", "Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_P", "Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PS", "Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_P", "Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PS", "Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_P", "Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PS", "Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_P", "Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PS", "Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_P", "Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PS"))
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
        case "Frigate_Threat_Response_Coordinator.AlertState_Payload" => val r = parseFrigate_Threat_Response_CoordinatorAlertState_PayloadT(T); return r
        case "Frigate_Threat_Response_Coordinator.ThreatBand_Payload" => val r = parseFrigate_Threat_Response_CoordinatorThreatBand_PayloadT(T); return r
        case "Frigate_Threat_Response_Coordinator.ChannelGate_Payload" => val r = parseFrigate_Threat_Response_CoordinatorChannelGate_PayloadT(T); return r
        case "Frigate_Threat_Response_Coordinator.RouteStatus_Payload" => val r = parseFrigate_Threat_Response_CoordinatorRouteStatus_PayloadT(T); return r
        case "Frigate_Threat_Response_Coordinator.ChannelState_Payload" => val r = parseFrigate_Threat_Response_CoordinatorChannelState_PayloadT(T); return r
        case "Frigate_Threat_Response_Coordinator.ThreatReport_Payload" => val r = parseFrigate_Threat_Response_CoordinatorThreatReport_PayloadT(T); return r
        case "Frigate_Threat_Response_Coordinator.ContactClass_Payload" => val r = parseFrigate_Threat_Response_CoordinatorContactClass_PayloadT(T); return r
        case "Frigate_Threat_Response_Coordinator.EscapeOutcome_Payload" => val r = parseFrigate_Threat_Response_CoordinatorEscapeOutcome_PayloadT(T); return r
        case "Frigate_Threat_Response_Coordinator.ResponseStage_Payload" => val r = parseFrigate_Threat_Response_CoordinatorResponseStage_PayloadT(T); return r
        case "Frigate_Threat_Response_Coordinator.ResponseFrame_Payload" => val r = parseFrigate_Threat_Response_CoordinatorResponseFrame_PayloadT(T); return r
        case "Frigate_Threat_Response_Coordinator.EscapeProposal_Payload" => val r = parseFrigate_Threat_Response_CoordinatorEscapeProposal_PayloadT(T); return r
        case "Frigate_Threat_Response_Coordinator.EvidenceStatus_Payload" => val r = parseFrigate_Threat_Response_CoordinatorEvidenceStatus_PayloadT(T); return r
        case "Frigate_Threat_Response_Coordinator.ThreatValidity_Payload" => val r = parseFrigate_Threat_Response_CoordinatorThreatValidity_PayloadT(T); return r
        case "Frigate_Threat_Response_Coordinator.DefenseOutcome_Payload" => val r = parseFrigate_Threat_Response_CoordinatorDefenseOutcome_PayloadT(T); return r
        case "Frigate_Threat_Response_Coordinator.ThreatEvidence_Payload" => val r = parseFrigate_Threat_Response_CoordinatorThreatEvidence_PayloadT(T); return r
        case "Frigate_Threat_Response_Coordinator.EscapeDirective_Payload" => val r = parseFrigate_Threat_Response_CoordinatorEscapeDirective_PayloadT(T); return r
        case "Frigate_Threat_Response_Coordinator.MiningInterlock_Payload" => val r = parseFrigate_Threat_Response_CoordinatorMiningInterlock_PayloadT(T); return r
        case "Frigate_Threat_Response_Coordinator.DefenseProposal_Payload" => val r = parseFrigate_Threat_Response_CoordinatorDefenseProposal_PayloadT(T); return r
        case "Frigate_Threat_Response_Coordinator.EscapeAuthority_Payload" => val r = parseFrigate_Threat_Response_CoordinatorEscapeAuthority_PayloadT(T); return r
        case "Frigate_Threat_Response_Coordinator.ResponsePattern_Payload" => val r = parseFrigate_Threat_Response_CoordinatorResponsePattern_PayloadT(T); return r
        case "Frigate_Threat_Response_Coordinator.QualifiedThreat_Payload" => val r = parseFrigate_Threat_Response_CoordinatorQualifiedThreat_PayloadT(T); return r
        case "Frigate_Threat_Response_Coordinator.DefenseDirective_Payload" => val r = parseFrigate_Threat_Response_CoordinatorDefenseDirective_PayloadT(T); return r
        case "Frigate_Threat_Response_Coordinator.DefenseAuthority_Payload" => val r = parseFrigate_Threat_Response_CoordinatorDefenseAuthority_PayloadT(T); return r
        case "Frigate_Threat_Response_Coordinator.EscapeChannelCondition_Payload" => val r = parseFrigate_Threat_Response_CoordinatorEscapeChannelCondition_PayloadT(T); return r
        case "Frigate_Threat_Response_Coordinator.DefenseChannelCondition_Payload" => val r = parseFrigate_Threat_Response_CoordinatorDefenseChannelCondition_PayloadT(T); return r
        case "Frigate_Threat_Response_Coordinator.DefenseReadinessContext_Payload" => val r = parseFrigate_Threat_Response_CoordinatorDefenseReadinessContext_PayloadT(T); return r
        case "Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PreState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PreState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_PST(T); return r
        case "Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PostState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PostState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_PST(T); return r
        case "Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PST(T); return r
        case "Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PST(T); return r
        case "Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PST(T); return r
        case "Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PST(T); return r
        case "Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PreState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PST(T); return r
        case "Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PostState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PST(T); return r
        case "Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PST(T); return r
        case "Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PST(T); return r
        case "Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PST(T); return r
        case "Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PST(T); return r
        case "Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PST(T); return r
        case "Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PST(T); return r
        case "Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PST(T); return r
        case "Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PST(T); return r
        case "Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PST(T); return r
        case "Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PST(T); return r
        case "Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PST(T); return r
        case "Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PST(T); return r
        case _ => val r = parseFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PST(T); return r
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

  def fromFrigate_Threat_Response_CoordinatorContactClass_Payload(o: Frigate_Threat_Response_Coordinator.ContactClass_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorContactClass_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorContactClass_Payload(s: String): Either[Frigate_Threat_Response_Coordinator.ContactClass_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorContactClass_Payload(parser: Parser): Frigate_Threat_Response_Coordinator.ContactClass_Payload = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorContactClass_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorContactClass_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorEvidenceStatus_Payload(o: Frigate_Threat_Response_Coordinator.EvidenceStatus_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorEvidenceStatus_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorEvidenceStatus_Payload(s: String): Either[Frigate_Threat_Response_Coordinator.EvidenceStatus_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorEvidenceStatus_Payload(parser: Parser): Frigate_Threat_Response_Coordinator.EvidenceStatus_Payload = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorEvidenceStatus_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorEvidenceStatus_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorThreatBand_Payload(o: Frigate_Threat_Response_Coordinator.ThreatBand_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorThreatBand_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorThreatBand_Payload(s: String): Either[Frigate_Threat_Response_Coordinator.ThreatBand_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorThreatBand_Payload(parser: Parser): Frigate_Threat_Response_Coordinator.ThreatBand_Payload = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorThreatBand_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorThreatBand_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorThreatValidity_Payload(o: Frigate_Threat_Response_Coordinator.ThreatValidity_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorThreatValidity_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorThreatValidity_Payload(s: String): Either[Frigate_Threat_Response_Coordinator.ThreatValidity_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorThreatValidity_Payload(parser: Parser): Frigate_Threat_Response_Coordinator.ThreatValidity_Payload = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorThreatValidity_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorThreatValidity_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorAlertState_Payload(o: Frigate_Threat_Response_Coordinator.AlertState_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorAlertState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorAlertState_Payload(s: String): Either[Frigate_Threat_Response_Coordinator.AlertState_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorAlertState_Payload(parser: Parser): Frigate_Threat_Response_Coordinator.AlertState_Payload = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorAlertState_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorAlertState_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorThreatReport_Payload(o: Frigate_Threat_Response_Coordinator.ThreatReport_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorThreatReport_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorThreatReport_Payload(s: String): Either[Frigate_Threat_Response_Coordinator.ThreatReport_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorThreatReport_Payload(parser: Parser): Frigate_Threat_Response_Coordinator.ThreatReport_Payload = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorThreatReport_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorThreatReport_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDefenseAuthority_Payload(o: Frigate_Threat_Response_Coordinator.DefenseAuthority_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorDefenseAuthority_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorDefenseAuthority_Payload(s: String): Either[Frigate_Threat_Response_Coordinator.DefenseAuthority_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDefenseAuthority_Payload(parser: Parser): Frigate_Threat_Response_Coordinator.DefenseAuthority_Payload = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorDefenseAuthority_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorDefenseAuthority_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDefenseOutcome_Payload(o: Frigate_Threat_Response_Coordinator.DefenseOutcome_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorDefenseOutcome_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorDefenseOutcome_Payload(s: String): Either[Frigate_Threat_Response_Coordinator.DefenseOutcome_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDefenseOutcome_Payload(parser: Parser): Frigate_Threat_Response_Coordinator.DefenseOutcome_Payload = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorDefenseOutcome_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorDefenseOutcome_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorChannelGate_Payload(o: Frigate_Threat_Response_Coordinator.ChannelGate_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorChannelGate_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorChannelGate_Payload(s: String): Either[Frigate_Threat_Response_Coordinator.ChannelGate_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorChannelGate_Payload(parser: Parser): Frigate_Threat_Response_Coordinator.ChannelGate_Payload = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorChannelGate_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorChannelGate_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorChannelState_Payload(o: Frigate_Threat_Response_Coordinator.ChannelState_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorChannelState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorChannelState_Payload(s: String): Either[Frigate_Threat_Response_Coordinator.ChannelState_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorChannelState_Payload(parser: Parser): Frigate_Threat_Response_Coordinator.ChannelState_Payload = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorChannelState_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorChannelState_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorEscapeAuthority_Payload(o: Frigate_Threat_Response_Coordinator.EscapeAuthority_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorEscapeAuthority_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorEscapeAuthority_Payload(s: String): Either[Frigate_Threat_Response_Coordinator.EscapeAuthority_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorEscapeAuthority_Payload(parser: Parser): Frigate_Threat_Response_Coordinator.EscapeAuthority_Payload = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorEscapeAuthority_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorEscapeAuthority_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorEscapeOutcome_Payload(o: Frigate_Threat_Response_Coordinator.EscapeOutcome_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorEscapeOutcome_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorEscapeOutcome_Payload(s: String): Either[Frigate_Threat_Response_Coordinator.EscapeOutcome_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorEscapeOutcome_Payload(parser: Parser): Frigate_Threat_Response_Coordinator.EscapeOutcome_Payload = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorEscapeOutcome_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorEscapeOutcome_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorRouteStatus_Payload(o: Frigate_Threat_Response_Coordinator.RouteStatus_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorRouteStatus_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorRouteStatus_Payload(s: String): Either[Frigate_Threat_Response_Coordinator.RouteStatus_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorRouteStatus_Payload(parser: Parser): Frigate_Threat_Response_Coordinator.RouteStatus_Payload = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorRouteStatus_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorRouteStatus_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorMiningInterlock_Payload(o: Frigate_Threat_Response_Coordinator.MiningInterlock_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorMiningInterlock_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorMiningInterlock_Payload(s: String): Either[Frigate_Threat_Response_Coordinator.MiningInterlock_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorMiningInterlock_Payload(parser: Parser): Frigate_Threat_Response_Coordinator.MiningInterlock_Payload = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorMiningInterlock_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorMiningInterlock_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDefenseProposal_Payload(o: Frigate_Threat_Response_Coordinator.DefenseProposal_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorDefenseProposal_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorDefenseProposal_Payload(s: String): Either[Frigate_Threat_Response_Coordinator.DefenseProposal_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDefenseProposal_Payload(parser: Parser): Frigate_Threat_Response_Coordinator.DefenseProposal_Payload = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorDefenseProposal_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorDefenseProposal_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorEscapeProposal_Payload(o: Frigate_Threat_Response_Coordinator.EscapeProposal_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorEscapeProposal_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorEscapeProposal_Payload(s: String): Either[Frigate_Threat_Response_Coordinator.EscapeProposal_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorEscapeProposal_Payload(parser: Parser): Frigate_Threat_Response_Coordinator.EscapeProposal_Payload = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorEscapeProposal_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorEscapeProposal_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorResponsePattern_Payload(o: Frigate_Threat_Response_Coordinator.ResponsePattern_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorResponsePattern_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorResponsePattern_Payload(s: String): Either[Frigate_Threat_Response_Coordinator.ResponsePattern_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorResponsePattern_Payload(parser: Parser): Frigate_Threat_Response_Coordinator.ResponsePattern_Payload = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorResponsePattern_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorResponsePattern_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDefenseDirective_Payload(o: Frigate_Threat_Response_Coordinator.DefenseDirective_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorDefenseDirective_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorDefenseDirective_Payload(s: String): Either[Frigate_Threat_Response_Coordinator.DefenseDirective_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDefenseDirective_Payload(parser: Parser): Frigate_Threat_Response_Coordinator.DefenseDirective_Payload = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorDefenseDirective_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorDefenseDirective_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorEscapeDirective_Payload(o: Frigate_Threat_Response_Coordinator.EscapeDirective_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorEscapeDirective_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorEscapeDirective_Payload(s: String): Either[Frigate_Threat_Response_Coordinator.EscapeDirective_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorEscapeDirective_Payload(parser: Parser): Frigate_Threat_Response_Coordinator.EscapeDirective_Payload = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorEscapeDirective_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorEscapeDirective_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorResponseStage_Payload(o: Frigate_Threat_Response_Coordinator.ResponseStage_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorResponseStage_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorResponseStage_Payload(s: String): Either[Frigate_Threat_Response_Coordinator.ResponseStage_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorResponseStage_Payload(parser: Parser): Frigate_Threat_Response_Coordinator.ResponseStage_Payload = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorResponseStage_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorResponseStage_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDefenseChannelCondition_Payload(o: Frigate_Threat_Response_Coordinator.DefenseChannelCondition_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorDefenseChannelCondition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorDefenseChannelCondition_Payload(s: String): Either[Frigate_Threat_Response_Coordinator.DefenseChannelCondition_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDefenseChannelCondition_Payload(parser: Parser): Frigate_Threat_Response_Coordinator.DefenseChannelCondition_Payload = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorDefenseChannelCondition_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorDefenseChannelCondition_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorEscapeChannelCondition_Payload(o: Frigate_Threat_Response_Coordinator.EscapeChannelCondition_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorEscapeChannelCondition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorEscapeChannelCondition_Payload(s: String): Either[Frigate_Threat_Response_Coordinator.EscapeChannelCondition_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorEscapeChannelCondition_Payload(parser: Parser): Frigate_Threat_Response_Coordinator.EscapeChannelCondition_Payload = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorEscapeChannelCondition_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorEscapeChannelCondition_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorThreatEvidence(o: Frigate_Threat_Response_Coordinator.ThreatEvidence, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorThreatEvidence(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorThreatEvidence(s: String): Either[Frigate_Threat_Response_Coordinator.ThreatEvidence, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorThreatEvidence(parser: Parser): Frigate_Threat_Response_Coordinator.ThreatEvidence = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorThreatEvidence()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorThreatEvidence _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorThreatEvidence_Payload(o: Frigate_Threat_Response_Coordinator.ThreatEvidence_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorThreatEvidence_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorThreatEvidence_Payload(s: String): Either[Frigate_Threat_Response_Coordinator.ThreatEvidence_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorThreatEvidence_Payload(parser: Parser): Frigate_Threat_Response_Coordinator.ThreatEvidence_Payload = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorThreatEvidence_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorThreatEvidence_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorQualifiedThreat(o: Frigate_Threat_Response_Coordinator.QualifiedThreat, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorQualifiedThreat(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorQualifiedThreat(s: String): Either[Frigate_Threat_Response_Coordinator.QualifiedThreat, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorQualifiedThreat(parser: Parser): Frigate_Threat_Response_Coordinator.QualifiedThreat = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorQualifiedThreat()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorQualifiedThreat _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorQualifiedThreat_Payload(o: Frigate_Threat_Response_Coordinator.QualifiedThreat_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorQualifiedThreat_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorQualifiedThreat_Payload(s: String): Either[Frigate_Threat_Response_Coordinator.QualifiedThreat_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorQualifiedThreat_Payload(parser: Parser): Frigate_Threat_Response_Coordinator.QualifiedThreat_Payload = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorQualifiedThreat_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorQualifiedThreat_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDefenseReadinessContext(o: Frigate_Threat_Response_Coordinator.DefenseReadinessContext, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorDefenseReadinessContext(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorDefenseReadinessContext(s: String): Either[Frigate_Threat_Response_Coordinator.DefenseReadinessContext, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDefenseReadinessContext(parser: Parser): Frigate_Threat_Response_Coordinator.DefenseReadinessContext = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorDefenseReadinessContext()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorDefenseReadinessContext _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDefenseReadinessContext_Payload(o: Frigate_Threat_Response_Coordinator.DefenseReadinessContext_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorDefenseReadinessContext_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorDefenseReadinessContext_Payload(s: String): Either[Frigate_Threat_Response_Coordinator.DefenseReadinessContext_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDefenseReadinessContext_Payload(parser: Parser): Frigate_Threat_Response_Coordinator.DefenseReadinessContext_Payload = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorDefenseReadinessContext_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorDefenseReadinessContext_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorResponseFrame(o: Frigate_Threat_Response_Coordinator.ResponseFrame, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorResponseFrame(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorResponseFrame(s: String): Either[Frigate_Threat_Response_Coordinator.ResponseFrame, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorResponseFrame(parser: Parser): Frigate_Threat_Response_Coordinator.ResponseFrame = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorResponseFrame()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorResponseFrame _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorResponseFrame_Payload(o: Frigate_Threat_Response_Coordinator.ResponseFrame_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorResponseFrame_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorResponseFrame_Payload(s: String): Either[Frigate_Threat_Response_Coordinator.ResponseFrame_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorResponseFrame_Payload(parser: Parser): Frigate_Threat_Response_Coordinator.ResponseFrame_Payload = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorResponseFrame_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorResponseFrame_Payload _)
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

  def fromFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container(o: Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PreState_Container, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container(s: String): Either[Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PreState_Container, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container(parser: Parser): Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PreState_Container = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_P(o: Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_P(s: String): Either[Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PreState_Container_P, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_P(parser: Parser): Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PreState_Container_P = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_P()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PS(o: Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PS(s: String): Either[Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PS, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PS(parser: Parser): Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PS = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PS()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container(o: Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PostState_Container, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container(s: String): Either[Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PostState_Container, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container(parser: Parser): Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PostState_Container = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_P(o: Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_P(s: String): Either[Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PostState_Container_P, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_P(parser: Parser): Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PostState_Container_P = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_P()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PS(o: Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PS(s: String): Either[Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PS, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PS(parser: Parser): Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PS = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PS()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container(o: Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PreState_Container, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container(s: String): Either[Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PreState_Container, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container(parser: Parser): Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PreState_Container = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_P(o: Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_P(s: String): Either[Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PreState_Container_P, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_P(parser: Parser): Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PreState_Container_P = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_P()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_PS(o: Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_PS(s: String): Either[Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PreState_Container_PS, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_PS(parser: Parser): Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PreState_Container_PS = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_PS()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container(o: Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PostState_Container, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container(s: String): Either[Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PostState_Container, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container(parser: Parser): Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PostState_Container = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_P(o: Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_P(s: String): Either[Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PostState_Container_P, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_P(parser: Parser): Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PostState_Container_P = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_P()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_PS(o: Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_PS(s: String): Either[Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PostState_Container_PS, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_PS(parser: Parser): Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PostState_Container_PS = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_PS()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container(o: Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container(s: String): Either[Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container(parser: Parser): Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_P(o: Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_P(s: String): Either[Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_P, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_P(parser: Parser): Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_P = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_P()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PS(o: Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PS(s: String): Either[Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PS, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PS(parser: Parser): Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PS = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PS()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container(o: Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container(s: String): Either[Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container(parser: Parser): Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_P(o: Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_P(s: String): Either[Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_P, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_P(parser: Parser): Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_P = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_P()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PS(o: Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PS(s: String): Either[Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PS, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PS(parser: Parser): Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PS = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PS()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container(o: Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container(s: String): Either[Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container(parser: Parser): Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_P(o: Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_P(s: String): Either[Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_P, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_P(parser: Parser): Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_P = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_P()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PS(o: Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PS(s: String): Either[Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PS, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PS(parser: Parser): Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PS = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PS()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container(o: Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container(s: String): Either[Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container(parser: Parser): Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_P(o: Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_P(s: String): Either[Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_P, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_P(parser: Parser): Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_P = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_P()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PS(o: Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PS(s: String): Either[Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PS, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PS(parser: Parser): Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PS = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PS()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container(o: Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container(s: String): Either[Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container(parser: Parser): Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_P(o: Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_P(s: String): Either[Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_P, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_P(parser: Parser): Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_P = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_P()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PS(o: Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PS(s: String): Either[Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PS, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PS(parser: Parser): Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PS = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PS()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container(o: Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container(s: String): Either[Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container(parser: Parser): Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_P(o: Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_P(s: String): Either[Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_P, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_P(parser: Parser): Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_P = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_P()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PS(o: Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PS(s: String): Either[Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PS, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PS(parser: Parser): Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PS = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PS()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container(o: Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container(s: String): Either[Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container(parser: Parser): Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_P(o: Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_P(s: String): Either[Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_P, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_P(parser: Parser): Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_P = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_P()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PS(o: Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PS(s: String): Either[Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PS, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PS(parser: Parser): Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PS = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PS()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container(o: Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container(s: String): Either[Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container(parser: Parser): Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_P(o: Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_P(s: String): Either[Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_P, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_P(parser: Parser): Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_P = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_P()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PS(o: Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PS(s: String): Either[Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PS, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PS(parser: Parser): Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PS = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PS()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container(o: Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container(s: String): Either[Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container(parser: Parser): Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_P(o: Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_P(s: String): Either[Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_P, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_P(parser: Parser): Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_P = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_P()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PS(o: Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PS(s: String): Either[Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PS, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PS(parser: Parser): Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PS = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PS()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container(o: Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container(s: String): Either[Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container(parser: Parser): Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_P(o: Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_P(s: String): Either[Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_P, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_P(parser: Parser): Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_P = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_P()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PS(o: Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PS(s: String): Either[Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PS, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PS(parser: Parser): Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PS = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PS()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container(o: Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container(s: String): Either[Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container(parser: Parser): Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_P(o: Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_P(s: String): Either[Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_P, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_P(parser: Parser): Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_P = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_P()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PS(o: Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PS(s: String): Either[Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PS, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PS(parser: Parser): Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PS = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PS()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container(o: Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container(s: String): Either[Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container(parser: Parser): Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_P(o: Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_P(s: String): Either[Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_P, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_P(parser: Parser): Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_P = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_P()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PS(o: Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PS(s: String): Either[Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PS, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PS(parser: Parser): Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PS = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PS()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container(o: Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container(s: String): Either[Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container(parser: Parser): Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_P(o: Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_P(s: String): Either[Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_P, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_P(parser: Parser): Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_P = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_P()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PS(o: Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PS(s: String): Either[Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PS, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PS(parser: Parser): Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PS = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PS()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container(o: Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container(s: String): Either[Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container(parser: Parser): Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_P(o: Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_P(s: String): Either[Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_P, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_P(parser: Parser): Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_P = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_P()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PS(o: Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PS(s: String): Either[Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PS, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PS(parser: Parser): Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PS = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PS()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container(o: Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container(s: String): Either[Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container(parser: Parser): Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_P(o: Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_P(s: String): Either[Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_P, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_P(parser: Parser): Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_P = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_P()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PS(o: Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PS(s: String): Either[Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PS, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PS(parser: Parser): Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PS = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PS()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container(o: Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container(s: String): Either[Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container(parser: Parser): Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_P(o: Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_P(s: String): Either[Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_P, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_P(parser: Parser): Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_P = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_P()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PS(o: Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PS(s: String): Either[Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PS, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PS(parser: Parser): Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PS = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PS()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PS _)
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