// #Sireum
// @formatter:off

// This file is auto-generated from EvidenceBand.scala, ObservationValidity.scala, EvidenceAssessment.scala, PilotDisposition.scala, SnapshotPreEpisodeState.scala, SnapshotNextEpisodeState.scala, SnapshotEvidenceAssessment.scala, SnapshotPilotDisposition.scala, ThreatReport.scala, DefenseAvailability.scala, CapacitorSupport.scala, DefenseQualification.scala, EgressRouteObservation.scala, EgressQualification.scala, ResponseAuthorization.scala, ResponseDirective.scala, EgressProgress.scala, SnapshotPreEgressState.scala, SnapshotNextEgressState.scala, SnapshotResponseDirective.scala, SnapshotDefenseCommand.scala, SnapshotEgressCommand.scala, DefenseCommand.scala, EgressCommand.scala, ResponseStatus.scala, ThreatObservation.scala, EpisodeSnapshot.scala, DefenseSupportObservation.scala, ResponseSnapshot.scala, Base_Types.scala, ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_Containers.scala, ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_Containers.scala, ThreatReportPolicy_threatResponseProcess_threatReportPolicy_Containers.scala, DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_Containers.scala, EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_Containers.scala, ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_Containers.scala, ResponseStateController_threatResponseProcess_responseStateController_Containers.scala, ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package frigate_threat_egress_supervisor

import org.sireum._
import org.sireum.Json.Printer._

object JSON {

  object Printer {

    @pure def printFrigate_Threat_Egress_SupervisorEvidenceBandType(o: Frigate_Threat_Egress_Supervisor.EvidenceBand.Type): ST = {
      val value: String = o match {
        case Frigate_Threat_Egress_Supervisor.EvidenceBand.CLEAR => "CLEAR"
        case Frigate_Threat_Egress_Supervisor.EvidenceBand.SUSPICIOUS => "SUSPICIOUS"
        case Frigate_Threat_Egress_Supervisor.EvidenceBand.HOSTILE => "HOSTILE"
      }
      return printObject(ISZ(
        ("type", printString("Frigate_Threat_Egress_Supervisor.EvidenceBand")),
        ("value", printString(value))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorEvidenceBand_Payload(o: Frigate_Threat_Egress_Supervisor.EvidenceBand_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Egress_Supervisor.EvidenceBand_Payload""""),
        ("value", printFrigate_Threat_Egress_SupervisorEvidenceBandType(o.value))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorObservationValidityType(o: Frigate_Threat_Egress_Supervisor.ObservationValidity.Type): ST = {
      val value: String = o match {
        case Frigate_Threat_Egress_Supervisor.ObservationValidity.INVALID => "INVALID"
        case Frigate_Threat_Egress_Supervisor.ObservationValidity.VALID => "VALID"
      }
      return printObject(ISZ(
        ("type", printString("Frigate_Threat_Egress_Supervisor.ObservationValidity")),
        ("value", printString(value))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorObservationValidity_Payload(o: Frigate_Threat_Egress_Supervisor.ObservationValidity_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Egress_Supervisor.ObservationValidity_Payload""""),
        ("value", printFrigate_Threat_Egress_SupervisorObservationValidityType(o.value))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorEvidenceAssessmentType(o: Frigate_Threat_Egress_Supervisor.EvidenceAssessment.Type): ST = {
      val value: String = o match {
        case Frigate_Threat_Egress_Supervisor.EvidenceAssessment.UNAVAILABLE => "UNAVAILABLE"
        case Frigate_Threat_Egress_Supervisor.EvidenceAssessment.CLEAR => "CLEAR"
        case Frigate_Threat_Egress_Supervisor.EvidenceAssessment.SUSPECT => "SUSPECT"
        case Frigate_Threat_Egress_Supervisor.EvidenceAssessment.HOSTILE => "HOSTILE"
      }
      return printObject(ISZ(
        ("type", printString("Frigate_Threat_Egress_Supervisor.EvidenceAssessment")),
        ("value", printString(value))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorEvidenceAssessment_Payload(o: Frigate_Threat_Egress_Supervisor.EvidenceAssessment_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Egress_Supervisor.EvidenceAssessment_Payload""""),
        ("value", printFrigate_Threat_Egress_SupervisorEvidenceAssessmentType(o.value))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorPilotDispositionType(o: Frigate_Threat_Egress_Supervisor.PilotDisposition.Type): ST = {
      val value: String = o match {
        case Frigate_Threat_Egress_Supervisor.PilotDisposition.NO_RESPONSE => "NO_RESPONSE"
        case Frigate_Threat_Egress_Supervisor.PilotDisposition.ACKNOWLEDGE_ALERT => "ACKNOWLEDGE_ALERT"
        case Frigate_Threat_Egress_Supervisor.PilotDisposition.CONFIRM_CLEAR => "CONFIRM_CLEAR"
      }
      return printObject(ISZ(
        ("type", printString("Frigate_Threat_Egress_Supervisor.PilotDisposition")),
        ("value", printString(value))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorPilotDisposition_Payload(o: Frigate_Threat_Egress_Supervisor.PilotDisposition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Egress_Supervisor.PilotDisposition_Payload""""),
        ("value", printFrigate_Threat_Egress_SupervisorPilotDispositionType(o.value))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorSnapshotPreEpisodeStateType(o: Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.Type): ST = {
      val value: String = o match {
        case Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.QUIET => "QUIET"
        case Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.WATCH => "WATCH"
        case Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.DECLARED => "DECLARED"
        case Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.CLEAR_PENDING => "CLEAR_PENDING"
      }
      return printObject(ISZ(
        ("type", printString("Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState")),
        ("value", printString(value))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorSnapshotPreEpisodeState_Payload(o: Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState_Payload""""),
        ("value", printFrigate_Threat_Egress_SupervisorSnapshotPreEpisodeStateType(o.value))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorSnapshotNextEpisodeStateType(o: Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState.Type): ST = {
      val value: String = o match {
        case Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState.QUIET => "QUIET"
        case Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState.WATCH => "WATCH"
        case Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState.DECLARED => "DECLARED"
        case Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState.CLEAR_PENDING => "CLEAR_PENDING"
      }
      return printObject(ISZ(
        ("type", printString("Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState")),
        ("value", printString(value))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorSnapshotNextEpisodeState_Payload(o: Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState_Payload""""),
        ("value", printFrigate_Threat_Egress_SupervisorSnapshotNextEpisodeStateType(o.value))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorSnapshotEvidenceAssessmentType(o: Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment.Type): ST = {
      val value: String = o match {
        case Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment.UNAVAILABLE => "UNAVAILABLE"
        case Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment.CLEAR => "CLEAR"
        case Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment.SUSPECT => "SUSPECT"
        case Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment.HOSTILE => "HOSTILE"
      }
      return printObject(ISZ(
        ("type", printString("Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment")),
        ("value", printString(value))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorSnapshotEvidenceAssessment_Payload(o: Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment_Payload""""),
        ("value", printFrigate_Threat_Egress_SupervisorSnapshotEvidenceAssessmentType(o.value))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorSnapshotPilotDispositionType(o: Frigate_Threat_Egress_Supervisor.SnapshotPilotDisposition.Type): ST = {
      val value: String = o match {
        case Frigate_Threat_Egress_Supervisor.SnapshotPilotDisposition.NO_RESPONSE => "NO_RESPONSE"
        case Frigate_Threat_Egress_Supervisor.SnapshotPilotDisposition.ACKNOWLEDGE_ALERT => "ACKNOWLEDGE_ALERT"
        case Frigate_Threat_Egress_Supervisor.SnapshotPilotDisposition.CONFIRM_CLEAR => "CONFIRM_CLEAR"
      }
      return printObject(ISZ(
        ("type", printString("Frigate_Threat_Egress_Supervisor.SnapshotPilotDisposition")),
        ("value", printString(value))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorSnapshotPilotDisposition_Payload(o: Frigate_Threat_Egress_Supervisor.SnapshotPilotDisposition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Egress_Supervisor.SnapshotPilotDisposition_Payload""""),
        ("value", printFrigate_Threat_Egress_SupervisorSnapshotPilotDispositionType(o.value))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorThreatReportType(o: Frigate_Threat_Egress_Supervisor.ThreatReport.Type): ST = {
      val value: String = o match {
        case Frigate_Threat_Egress_Supervisor.ThreatReport.NO_REPORT => "NO_REPORT"
        case Frigate_Threat_Egress_Supervisor.ThreatReport.WATCH_REPORT => "WATCH_REPORT"
        case Frigate_Threat_Egress_Supervisor.ThreatReport.HOSTILE_ALERT => "HOSTILE_ALERT"
        case Frigate_Threat_Egress_Supervisor.ThreatReport.EVIDENCE_FAULT => "EVIDENCE_FAULT"
        case Frigate_Threat_Egress_Supervisor.ThreatReport.CLEAR_PENDING_REPORT => "CLEAR_PENDING_REPORT"
        case Frigate_Threat_Egress_Supervisor.ThreatReport.CLEAR_CONFIRMED_REPORT => "CLEAR_CONFIRMED_REPORT"
      }
      return printObject(ISZ(
        ("type", printString("Frigate_Threat_Egress_Supervisor.ThreatReport")),
        ("value", printString(value))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorThreatReport_Payload(o: Frigate_Threat_Egress_Supervisor.ThreatReport_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Egress_Supervisor.ThreatReport_Payload""""),
        ("value", printFrigate_Threat_Egress_SupervisorThreatReportType(o.value))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorDefenseAvailabilityType(o: Frigate_Threat_Egress_Supervisor.DefenseAvailability.Type): ST = {
      val value: String = o match {
        case Frigate_Threat_Egress_Supervisor.DefenseAvailability.UNAVAILABLE => "UNAVAILABLE"
        case Frigate_Threat_Egress_Supervisor.DefenseAvailability.AVAILABLE => "AVAILABLE"
      }
      return printObject(ISZ(
        ("type", printString("Frigate_Threat_Egress_Supervisor.DefenseAvailability")),
        ("value", printString(value))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorDefenseAvailability_Payload(o: Frigate_Threat_Egress_Supervisor.DefenseAvailability_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Egress_Supervisor.DefenseAvailability_Payload""""),
        ("value", printFrigate_Threat_Egress_SupervisorDefenseAvailabilityType(o.value))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorCapacitorSupportType(o: Frigate_Threat_Egress_Supervisor.CapacitorSupport.Type): ST = {
      val value: String = o match {
        case Frigate_Threat_Egress_Supervisor.CapacitorSupport.INSUFFICIENT => "INSUFFICIENT"
        case Frigate_Threat_Egress_Supervisor.CapacitorSupport.SUFFICIENT => "SUFFICIENT"
      }
      return printObject(ISZ(
        ("type", printString("Frigate_Threat_Egress_Supervisor.CapacitorSupport")),
        ("value", printString(value))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorCapacitorSupport_Payload(o: Frigate_Threat_Egress_Supervisor.CapacitorSupport_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Egress_Supervisor.CapacitorSupport_Payload""""),
        ("value", printFrigate_Threat_Egress_SupervisorCapacitorSupportType(o.value))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorDefenseQualificationType(o: Frigate_Threat_Egress_Supervisor.DefenseQualification.Type): ST = {
      val value: String = o match {
        case Frigate_Threat_Egress_Supervisor.DefenseQualification.INAPPLICABLE => "INAPPLICABLE"
        case Frigate_Threat_Egress_Supervisor.DefenseQualification.BLOCKED_AVAILABILITY => "BLOCKED_AVAILABILITY"
        case Frigate_Threat_Egress_Supervisor.DefenseQualification.BLOCKED_CAPACITOR => "BLOCKED_CAPACITOR"
        case Frigate_Threat_Egress_Supervisor.DefenseQualification.READY => "READY"
      }
      return printObject(ISZ(
        ("type", printString("Frigate_Threat_Egress_Supervisor.DefenseQualification")),
        ("value", printString(value))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorDefenseQualification_Payload(o: Frigate_Threat_Egress_Supervisor.DefenseQualification_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Egress_Supervisor.DefenseQualification_Payload""""),
        ("value", printFrigate_Threat_Egress_SupervisorDefenseQualificationType(o.value))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorEgressRouteObservationType(o: Frigate_Threat_Egress_Supervisor.EgressRouteObservation.Type): ST = {
      val value: String = o match {
        case Frigate_Threat_Egress_Supervisor.EgressRouteObservation.UNKNOWN => "UNKNOWN"
        case Frigate_Threat_Egress_Supervisor.EgressRouteObservation.BLOCKED => "BLOCKED"
        case Frigate_Threat_Egress_Supervisor.EgressRouteObservation.AVAILABLE => "AVAILABLE"
      }
      return printObject(ISZ(
        ("type", printString("Frigate_Threat_Egress_Supervisor.EgressRouteObservation")),
        ("value", printString(value))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorEgressRouteObservation_Payload(o: Frigate_Threat_Egress_Supervisor.EgressRouteObservation_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Egress_Supervisor.EgressRouteObservation_Payload""""),
        ("value", printFrigate_Threat_Egress_SupervisorEgressRouteObservationType(o.value))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorEgressQualificationType(o: Frigate_Threat_Egress_Supervisor.EgressQualification.Type): ST = {
      val value: String = o match {
        case Frigate_Threat_Egress_Supervisor.EgressQualification.INAPPLICABLE => "INAPPLICABLE"
        case Frigate_Threat_Egress_Supervisor.EgressQualification.ROUTE_UNKNOWN => "ROUTE_UNKNOWN"
        case Frigate_Threat_Egress_Supervisor.EgressQualification.ROUTE_BLOCKED => "ROUTE_BLOCKED"
        case Frigate_Threat_Egress_Supervisor.EgressQualification.READY => "READY"
      }
      return printObject(ISZ(
        ("type", printString("Frigate_Threat_Egress_Supervisor.EgressQualification")),
        ("value", printString(value))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorEgressQualification_Payload(o: Frigate_Threat_Egress_Supervisor.EgressQualification_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Egress_Supervisor.EgressQualification_Payload""""),
        ("value", printFrigate_Threat_Egress_SupervisorEgressQualificationType(o.value))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorResponseAuthorizationType(o: Frigate_Threat_Egress_Supervisor.ResponseAuthorization.Type): ST = {
      val value: String = o match {
        case Frigate_Threat_Egress_Supervisor.ResponseAuthorization.NO_REQUEST => "NO_REQUEST"
        case Frigate_Threat_Egress_Supervisor.ResponseAuthorization.EGRESS_REQUEST => "EGRESS_REQUEST"
        case Frigate_Threat_Egress_Supervisor.ResponseAuthorization.CANCEL_EGRESS => "CANCEL_EGRESS"
      }
      return printObject(ISZ(
        ("type", printString("Frigate_Threat_Egress_Supervisor.ResponseAuthorization")),
        ("value", printString(value))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorResponseAuthorization_Payload(o: Frigate_Threat_Egress_Supervisor.ResponseAuthorization_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Egress_Supervisor.ResponseAuthorization_Payload""""),
        ("value", printFrigate_Threat_Egress_SupervisorResponseAuthorizationType(o.value))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorResponseDirectiveType(o: Frigate_Threat_Egress_Supervisor.ResponseDirective.Type): ST = {
      val value: String = o match {
        case Frigate_Threat_Egress_Supervisor.ResponseDirective.RESET => "RESET"
        case Frigate_Threat_Egress_Supervisor.ResponseDirective.CONTAIN => "CONTAIN"
        case Frigate_Threat_Egress_Supervisor.ResponseDirective.CANCEL_EGRESS => "CANCEL_EGRESS"
        case Frigate_Threat_Egress_Supervisor.ResponseDirective.START_EGRESS => "START_EGRESS"
        case Frigate_Threat_Egress_Supervisor.ResponseDirective.DEFEND => "DEFEND"
        case Frigate_Threat_Egress_Supervisor.ResponseDirective.HOLD_BLOCKED => "HOLD_BLOCKED"
        case Frigate_Threat_Egress_Supervisor.ResponseDirective.MONITOR => "MONITOR"
      }
      return printObject(ISZ(
        ("type", printString("Frigate_Threat_Egress_Supervisor.ResponseDirective")),
        ("value", printString(value))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorResponseDirective_Payload(o: Frigate_Threat_Egress_Supervisor.ResponseDirective_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Egress_Supervisor.ResponseDirective_Payload""""),
        ("value", printFrigate_Threat_Egress_SupervisorResponseDirectiveType(o.value))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorEgressProgressType(o: Frigate_Threat_Egress_Supervisor.EgressProgress.Type): ST = {
      val value: String = o match {
        case Frigate_Threat_Egress_Supervisor.EgressProgress.NOT_STARTED => "NOT_STARTED"
        case Frigate_Threat_Egress_Supervisor.EgressProgress.EN_ROUTE => "EN_ROUTE"
        case Frigate_Threat_Egress_Supervisor.EgressProgress.SAFE_DESTINATION_OBSERVED => "SAFE_DESTINATION_OBSERVED"
        case Frigate_Threat_Egress_Supervisor.EgressProgress.FAILED => "FAILED"
      }
      return printObject(ISZ(
        ("type", printString("Frigate_Threat_Egress_Supervisor.EgressProgress")),
        ("value", printString(value))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorEgressProgress_Payload(o: Frigate_Threat_Egress_Supervisor.EgressProgress_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Egress_Supervisor.EgressProgress_Payload""""),
        ("value", printFrigate_Threat_Egress_SupervisorEgressProgressType(o.value))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorSnapshotPreEgressStateType(o: Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.Type): ST = {
      val value: String = o match {
        case Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.IDLE => "IDLE"
        case Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.ORDERED => "ORDERED"
        case Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.MOVING => "MOVING"
        case Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.BLOCKED => "BLOCKED"
        case Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.ARRIVED => "ARRIVED"
      }
      return printObject(ISZ(
        ("type", printString("Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState")),
        ("value", printString(value))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorSnapshotPreEgressState_Payload(o: Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState_Payload""""),
        ("value", printFrigate_Threat_Egress_SupervisorSnapshotPreEgressStateType(o.value))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorSnapshotNextEgressStateType(o: Frigate_Threat_Egress_Supervisor.SnapshotNextEgressState.Type): ST = {
      val value: String = o match {
        case Frigate_Threat_Egress_Supervisor.SnapshotNextEgressState.IDLE => "IDLE"
        case Frigate_Threat_Egress_Supervisor.SnapshotNextEgressState.ORDERED => "ORDERED"
        case Frigate_Threat_Egress_Supervisor.SnapshotNextEgressState.MOVING => "MOVING"
        case Frigate_Threat_Egress_Supervisor.SnapshotNextEgressState.BLOCKED => "BLOCKED"
        case Frigate_Threat_Egress_Supervisor.SnapshotNextEgressState.ARRIVED => "ARRIVED"
      }
      return printObject(ISZ(
        ("type", printString("Frigate_Threat_Egress_Supervisor.SnapshotNextEgressState")),
        ("value", printString(value))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorSnapshotNextEgressState_Payload(o: Frigate_Threat_Egress_Supervisor.SnapshotNextEgressState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Egress_Supervisor.SnapshotNextEgressState_Payload""""),
        ("value", printFrigate_Threat_Egress_SupervisorSnapshotNextEgressStateType(o.value))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorSnapshotResponseDirectiveType(o: Frigate_Threat_Egress_Supervisor.SnapshotResponseDirective.Type): ST = {
      val value: String = o match {
        case Frigate_Threat_Egress_Supervisor.SnapshotResponseDirective.RESET => "RESET"
        case Frigate_Threat_Egress_Supervisor.SnapshotResponseDirective.CONTAIN => "CONTAIN"
        case Frigate_Threat_Egress_Supervisor.SnapshotResponseDirective.CANCEL_EGRESS => "CANCEL_EGRESS"
        case Frigate_Threat_Egress_Supervisor.SnapshotResponseDirective.START_EGRESS => "START_EGRESS"
        case Frigate_Threat_Egress_Supervisor.SnapshotResponseDirective.DEFEND => "DEFEND"
        case Frigate_Threat_Egress_Supervisor.SnapshotResponseDirective.HOLD_BLOCKED => "HOLD_BLOCKED"
        case Frigate_Threat_Egress_Supervisor.SnapshotResponseDirective.MONITOR => "MONITOR"
      }
      return printObject(ISZ(
        ("type", printString("Frigate_Threat_Egress_Supervisor.SnapshotResponseDirective")),
        ("value", printString(value))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorSnapshotResponseDirective_Payload(o: Frigate_Threat_Egress_Supervisor.SnapshotResponseDirective_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Egress_Supervisor.SnapshotResponseDirective_Payload""""),
        ("value", printFrigate_Threat_Egress_SupervisorSnapshotResponseDirectiveType(o.value))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorSnapshotDefenseCommandType(o: Frigate_Threat_Egress_Supervisor.SnapshotDefenseCommand.Type): ST = {
      val value: String = o match {
        case Frigate_Threat_Egress_Supervisor.SnapshotDefenseCommand.STANDBY => "STANDBY"
        case Frigate_Threat_Egress_Supervisor.SnapshotDefenseCommand.ACTIVATE => "ACTIVATE"
      }
      return printObject(ISZ(
        ("type", printString("Frigate_Threat_Egress_Supervisor.SnapshotDefenseCommand")),
        ("value", printString(value))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorSnapshotDefenseCommand_Payload(o: Frigate_Threat_Egress_Supervisor.SnapshotDefenseCommand_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Egress_Supervisor.SnapshotDefenseCommand_Payload""""),
        ("value", printFrigate_Threat_Egress_SupervisorSnapshotDefenseCommandType(o.value))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorSnapshotEgressCommandType(o: Frigate_Threat_Egress_Supervisor.SnapshotEgressCommand.Type): ST = {
      val value: String = o match {
        case Frigate_Threat_Egress_Supervisor.SnapshotEgressCommand.NONE => "NONE"
        case Frigate_Threat_Egress_Supervisor.SnapshotEgressCommand.INITIATE => "INITIATE"
        case Frigate_Threat_Egress_Supervisor.SnapshotEgressCommand.CONTINUE => "CONTINUE"
        case Frigate_Threat_Egress_Supervisor.SnapshotEgressCommand.HOLD => "HOLD"
        case Frigate_Threat_Egress_Supervisor.SnapshotEgressCommand.CANCEL => "CANCEL"
      }
      return printObject(ISZ(
        ("type", printString("Frigate_Threat_Egress_Supervisor.SnapshotEgressCommand")),
        ("value", printString(value))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorSnapshotEgressCommand_Payload(o: Frigate_Threat_Egress_Supervisor.SnapshotEgressCommand_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Egress_Supervisor.SnapshotEgressCommand_Payload""""),
        ("value", printFrigate_Threat_Egress_SupervisorSnapshotEgressCommandType(o.value))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorDefenseCommandType(o: Frigate_Threat_Egress_Supervisor.DefenseCommand.Type): ST = {
      val value: String = o match {
        case Frigate_Threat_Egress_Supervisor.DefenseCommand.STANDBY => "STANDBY"
        case Frigate_Threat_Egress_Supervisor.DefenseCommand.ACTIVATE => "ACTIVATE"
      }
      return printObject(ISZ(
        ("type", printString("Frigate_Threat_Egress_Supervisor.DefenseCommand")),
        ("value", printString(value))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorDefenseCommand_Payload(o: Frigate_Threat_Egress_Supervisor.DefenseCommand_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Egress_Supervisor.DefenseCommand_Payload""""),
        ("value", printFrigate_Threat_Egress_SupervisorDefenseCommandType(o.value))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorEgressCommandType(o: Frigate_Threat_Egress_Supervisor.EgressCommand.Type): ST = {
      val value: String = o match {
        case Frigate_Threat_Egress_Supervisor.EgressCommand.NONE => "NONE"
        case Frigate_Threat_Egress_Supervisor.EgressCommand.INITIATE => "INITIATE"
        case Frigate_Threat_Egress_Supervisor.EgressCommand.CONTINUE => "CONTINUE"
        case Frigate_Threat_Egress_Supervisor.EgressCommand.HOLD => "HOLD"
        case Frigate_Threat_Egress_Supervisor.EgressCommand.CANCEL => "CANCEL"
      }
      return printObject(ISZ(
        ("type", printString("Frigate_Threat_Egress_Supervisor.EgressCommand")),
        ("value", printString(value))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorEgressCommand_Payload(o: Frigate_Threat_Egress_Supervisor.EgressCommand_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Egress_Supervisor.EgressCommand_Payload""""),
        ("value", printFrigate_Threat_Egress_SupervisorEgressCommandType(o.value))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorResponseStatusType(o: Frigate_Threat_Egress_Supervisor.ResponseStatus.Type): ST = {
      val value: String = o match {
        case Frigate_Threat_Egress_Supervisor.ResponseStatus.QUIET => "QUIET"
        case Frigate_Threat_Egress_Supervisor.ResponseStatus.WATCHING => "WATCHING"
        case Frigate_Threat_Egress_Supervisor.ResponseStatus.THREAT_DECLARED => "THREAT_DECLARED"
        case Frigate_Threat_Egress_Supervisor.ResponseStatus.DEFENDING => "DEFENDING"
        case Frigate_Threat_Egress_Supervisor.ResponseStatus.EGRESS_ORDERED => "EGRESS_ORDERED"
        case Frigate_Threat_Egress_Supervisor.ResponseStatus.EGRESS_MOVING => "EGRESS_MOVING"
        case Frigate_Threat_Egress_Supervisor.ResponseStatus.EGRESS_BLOCKED => "EGRESS_BLOCKED"
        case Frigate_Threat_Egress_Supervisor.ResponseStatus.ARRIVAL_OBSERVED => "ARRIVAL_OBSERVED"
        case Frigate_Threat_Egress_Supervisor.ResponseStatus.EVIDENCE_UNAVAILABLE => "EVIDENCE_UNAVAILABLE"
        case Frigate_Threat_Egress_Supervisor.ResponseStatus.CLEAR_PENDING => "CLEAR_PENDING"
      }
      return printObject(ISZ(
        ("type", printString("Frigate_Threat_Egress_Supervisor.ResponseStatus")),
        ("value", printString(value))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorResponseStatus_Payload(o: Frigate_Threat_Egress_Supervisor.ResponseStatus_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Egress_Supervisor.ResponseStatus_Payload""""),
        ("value", printFrigate_Threat_Egress_SupervisorResponseStatusType(o.value))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorThreatObservation(o: Frigate_Threat_Egress_Supervisor.ThreatObservation): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Egress_Supervisor.ThreatObservation""""),
        ("evidenceBand", printFrigate_Threat_Egress_SupervisorEvidenceBandType(o.evidenceBand)),
        ("validity", printFrigate_Threat_Egress_SupervisorObservationValidityType(o.validity))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorThreatObservation_Payload(o: Frigate_Threat_Egress_Supervisor.ThreatObservation_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Egress_Supervisor.ThreatObservation_Payload""""),
        ("value", printFrigate_Threat_Egress_SupervisorThreatObservation(o.value))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorEpisodeSnapshot(o: Frigate_Threat_Egress_Supervisor.EpisodeSnapshot): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Egress_Supervisor.EpisodeSnapshot""""),
        ("preEpisode", printFrigate_Threat_Egress_SupervisorSnapshotPreEpisodeStateType(o.preEpisode)),
        ("nextEpisode", printFrigate_Threat_Egress_SupervisorSnapshotNextEpisodeStateType(o.nextEpisode)),
        ("assessment", printFrigate_Threat_Egress_SupervisorSnapshotEvidenceAssessmentType(o.assessment)),
        ("pilotDisposition", printFrigate_Threat_Egress_SupervisorSnapshotPilotDispositionType(o.pilotDisposition))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorEpisodeSnapshot_Payload(o: Frigate_Threat_Egress_Supervisor.EpisodeSnapshot_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Egress_Supervisor.EpisodeSnapshot_Payload""""),
        ("value", printFrigate_Threat_Egress_SupervisorEpisodeSnapshot(o.value))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorDefenseSupportObservation(o: Frigate_Threat_Egress_Supervisor.DefenseSupportObservation): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Egress_Supervisor.DefenseSupportObservation""""),
        ("defenseAvailability", printFrigate_Threat_Egress_SupervisorDefenseAvailabilityType(o.defenseAvailability)),
        ("capacitorSupport", printFrigate_Threat_Egress_SupervisorCapacitorSupportType(o.capacitorSupport))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorDefenseSupportObservation_Payload(o: Frigate_Threat_Egress_Supervisor.DefenseSupportObservation_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Egress_Supervisor.DefenseSupportObservation_Payload""""),
        ("value", printFrigate_Threat_Egress_SupervisorDefenseSupportObservation(o.value))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorResponseSnapshot(o: Frigate_Threat_Egress_Supervisor.ResponseSnapshot): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Egress_Supervisor.ResponseSnapshot""""),
        ("preEgress", printFrigate_Threat_Egress_SupervisorSnapshotPreEgressStateType(o.preEgress)),
        ("nextEgress", printFrigate_Threat_Egress_SupervisorSnapshotNextEgressStateType(o.nextEgress)),
        ("directive", printFrigate_Threat_Egress_SupervisorSnapshotResponseDirectiveType(o.directive)),
        ("defenseCommand", printFrigate_Threat_Egress_SupervisorSnapshotDefenseCommandType(o.defenseCommand)),
        ("egressCommand", printFrigate_Threat_Egress_SupervisorSnapshotEgressCommandType(o.egressCommand))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorResponseSnapshot_Payload(o: Frigate_Threat_Egress_Supervisor.ResponseSnapshot_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Egress_Supervisor.ResponseSnapshot_Payload""""),
        ("value", printFrigate_Threat_Egress_SupervisorResponseSnapshot(o.value))
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

    @pure def printFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container(o: Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container): ST = {
      o match {
        case o: Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_P => return printFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PS => return printFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PS(o)
      }
    }

    @pure def printFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_P(o: Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_P""""),
        ("api_threatObservation", printFrigate_Threat_Egress_SupervisorThreatObservation(o.api_threatObservation))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PS(o: Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PS""""),
        ("api_threatObservation", printFrigate_Threat_Egress_SupervisorThreatObservation(o.api_threatObservation))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container(o: Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container): ST = {
      o match {
        case o: Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_P => return printFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PS => return printFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PS(o)
      }
    }

    @pure def printFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_P(o: Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_P""""),
        ("api_evidenceAssessment", printFrigate_Threat_Egress_SupervisorEvidenceAssessmentType(o.api_evidenceAssessment))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PS(o: Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PS""""),
        ("api_evidenceAssessment", printFrigate_Threat_Egress_SupervisorEvidenceAssessmentType(o.api_evidenceAssessment))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container(o: Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container): ST = {
      o match {
        case o: Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_P => return printFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PS => return printFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PS(o)
      }
    }

    @pure def printFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_P(o: Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_P""""),
        ("api_evidenceAssessment", printFrigate_Threat_Egress_SupervisorEvidenceAssessmentType(o.api_evidenceAssessment)),
        ("api_pilotDisposition", printFrigate_Threat_Egress_SupervisorPilotDispositionType(o.api_pilotDisposition))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PS(o: Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PS""""),
        ("api_evidenceAssessment", printFrigate_Threat_Egress_SupervisorEvidenceAssessmentType(o.api_evidenceAssessment)),
        ("api_pilotDisposition", printFrigate_Threat_Egress_SupervisorPilotDispositionType(o.api_pilotDisposition))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container(o: Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container): ST = {
      o match {
        case o: Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_P => return printFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PS => return printFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PS(o)
      }
    }

    @pure def printFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_P(o: Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_P""""),
        ("api_episodeSnapshot", printFrigate_Threat_Egress_SupervisorEpisodeSnapshot(o.api_episodeSnapshot))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PS(o: Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PS""""),
        ("api_episodeSnapshot", printFrigate_Threat_Egress_SupervisorEpisodeSnapshot(o.api_episodeSnapshot))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container(o: Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container): ST = {
      o match {
        case o: Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_P => return printFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PS => return printFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PS(o)
      }
    }

    @pure def printFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_P(o: Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_P""""),
        ("api_episodeSnapshot", printFrigate_Threat_Egress_SupervisorEpisodeSnapshot(o.api_episodeSnapshot))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PS(o: Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PS""""),
        ("api_episodeSnapshot", printFrigate_Threat_Egress_SupervisorEpisodeSnapshot(o.api_episodeSnapshot))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container(o: Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container): ST = {
      o match {
        case o: Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_P => return printFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PS => return printFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PS(o)
      }
    }

    @pure def printFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_P(o: Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_P""""),
        ("api_threatReport", printFrigate_Threat_Egress_SupervisorThreatReportType(o.api_threatReport))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PS(o: Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PS""""),
        ("api_threatReport", printFrigate_Threat_Egress_SupervisorThreatReportType(o.api_threatReport))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container(o: Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container): ST = {
      o match {
        case o: Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_P => return printFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PS => return printFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PS(o)
      }
    }

    @pure def printFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_P(o: Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_P""""),
        ("api_defenseSupport", printFrigate_Threat_Egress_SupervisorDefenseSupportObservation(o.api_defenseSupport)),
        ("api_evidenceAssessment", printFrigate_Threat_Egress_SupervisorEvidenceAssessmentType(o.api_evidenceAssessment))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PS(o: Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PS""""),
        ("api_defenseSupport", printFrigate_Threat_Egress_SupervisorDefenseSupportObservation(o.api_defenseSupport)),
        ("api_evidenceAssessment", printFrigate_Threat_Egress_SupervisorEvidenceAssessmentType(o.api_evidenceAssessment))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container(o: Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container): ST = {
      o match {
        case o: Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_P => return printFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PS => return printFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PS(o)
      }
    }

    @pure def printFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_P(o: Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_P""""),
        ("api_defenseQualification", printFrigate_Threat_Egress_SupervisorDefenseQualificationType(o.api_defenseQualification))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PS(o: Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PS""""),
        ("api_defenseQualification", printFrigate_Threat_Egress_SupervisorDefenseQualificationType(o.api_defenseQualification))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container(o: Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container): ST = {
      o match {
        case o: Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_P => return printFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PS => return printFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PS(o)
      }
    }

    @pure def printFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_P(o: Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_P""""),
        ("api_egressRoute", printFrigate_Threat_Egress_SupervisorEgressRouteObservationType(o.api_egressRoute)),
        ("api_evidenceAssessment", printFrigate_Threat_Egress_SupervisorEvidenceAssessmentType(o.api_evidenceAssessment))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PS(o: Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PS""""),
        ("api_egressRoute", printFrigate_Threat_Egress_SupervisorEgressRouteObservationType(o.api_egressRoute)),
        ("api_evidenceAssessment", printFrigate_Threat_Egress_SupervisorEvidenceAssessmentType(o.api_evidenceAssessment))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container(o: Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container): ST = {
      o match {
        case o: Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_P => return printFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PS => return printFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PS(o)
      }
    }

    @pure def printFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_P(o: Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_P""""),
        ("api_egressQualification", printFrigate_Threat_Egress_SupervisorEgressQualificationType(o.api_egressQualification))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PS(o: Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PS""""),
        ("api_egressQualification", printFrigate_Threat_Egress_SupervisorEgressQualificationType(o.api_egressQualification))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container(o: Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container): ST = {
      o match {
        case o: Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_P => return printFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PS => return printFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PS(o)
      }
    }

    @pure def printFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_P(o: Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_P""""),
        ("api_defenseQualification", printFrigate_Threat_Egress_SupervisorDefenseQualificationType(o.api_defenseQualification)),
        ("api_egressQualification", printFrigate_Threat_Egress_SupervisorEgressQualificationType(o.api_egressQualification)),
        ("api_episodeSnapshot", printFrigate_Threat_Egress_SupervisorEpisodeSnapshot(o.api_episodeSnapshot)),
        ("api_responseAuthorization", printFrigate_Threat_Egress_SupervisorResponseAuthorizationType(o.api_responseAuthorization))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PS(o: Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PS""""),
        ("api_defenseQualification", printFrigate_Threat_Egress_SupervisorDefenseQualificationType(o.api_defenseQualification)),
        ("api_egressQualification", printFrigate_Threat_Egress_SupervisorEgressQualificationType(o.api_egressQualification)),
        ("api_episodeSnapshot", printFrigate_Threat_Egress_SupervisorEpisodeSnapshot(o.api_episodeSnapshot)),
        ("api_responseAuthorization", printFrigate_Threat_Egress_SupervisorResponseAuthorizationType(o.api_responseAuthorization))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container(o: Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container): ST = {
      o match {
        case o: Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_P => return printFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PS => return printFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PS(o)
      }
    }

    @pure def printFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_P(o: Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_P""""),
        ("api_responseDirective", printFrigate_Threat_Egress_SupervisorResponseDirectiveType(o.api_responseDirective))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PS(o: Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PS""""),
        ("api_responseDirective", printFrigate_Threat_Egress_SupervisorResponseDirectiveType(o.api_responseDirective))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container(o: Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PreState_Container): ST = {
      o match {
        case o: Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PreState_Container_P => return printFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PS => return printFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PS(o)
      }
    }

    @pure def printFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_P(o: Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PreState_Container_P""""),
        ("api_egressProgress", printFrigate_Threat_Egress_SupervisorEgressProgressType(o.api_egressProgress)),
        ("api_responseDirective", printFrigate_Threat_Egress_SupervisorResponseDirectiveType(o.api_responseDirective))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PS(o: Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PS""""),
        ("api_egressProgress", printFrigate_Threat_Egress_SupervisorEgressProgressType(o.api_egressProgress)),
        ("api_responseDirective", printFrigate_Threat_Egress_SupervisorResponseDirectiveType(o.api_responseDirective))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container(o: Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PostState_Container): ST = {
      o match {
        case o: Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PostState_Container_P => return printFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PS => return printFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PS(o)
      }
    }

    @pure def printFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_P(o: Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PostState_Container_P""""),
        ("api_defenseCommand", printFrigate_Threat_Egress_SupervisorDefenseCommandType(o.api_defenseCommand)),
        ("api_egressCommand", printFrigate_Threat_Egress_SupervisorEgressCommandType(o.api_egressCommand)),
        ("api_responseSnapshot", printFrigate_Threat_Egress_SupervisorResponseSnapshot(o.api_responseSnapshot))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PS(o: Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PS""""),
        ("api_defenseCommand", printFrigate_Threat_Egress_SupervisorDefenseCommandType(o.api_defenseCommand)),
        ("api_egressCommand", printFrigate_Threat_Egress_SupervisorEgressCommandType(o.api_egressCommand)),
        ("api_responseSnapshot", printFrigate_Threat_Egress_SupervisorResponseSnapshot(o.api_responseSnapshot))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container(o: Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container): ST = {
      o match {
        case o: Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_P => return printFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PS => return printFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PS(o)
      }
    }

    @pure def printFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_P(o: Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_P""""),
        ("api_episodeSnapshot", printFrigate_Threat_Egress_SupervisorEpisodeSnapshot(o.api_episodeSnapshot)),
        ("api_responseSnapshot", printFrigate_Threat_Egress_SupervisorResponseSnapshot(o.api_responseSnapshot))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PS(o: Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PS""""),
        ("api_episodeSnapshot", printFrigate_Threat_Egress_SupervisorEpisodeSnapshot(o.api_episodeSnapshot)),
        ("api_responseSnapshot", printFrigate_Threat_Egress_SupervisorResponseSnapshot(o.api_responseSnapshot))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container(o: Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container): ST = {
      o match {
        case o: Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_P => return printFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PS => return printFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PS(o)
      }
    }

    @pure def printFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_P(o: Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_P""""),
        ("api_responseStatus", printFrigate_Threat_Egress_SupervisorResponseStatusType(o.api_responseStatus))
      ))
    }

    @pure def printFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PS(o: Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PS""""),
        ("api_responseStatus", printFrigate_Threat_Egress_SupervisorResponseStatusType(o.api_responseStatus))
      ))
    }

    @pure def printruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): ST = {
      val value: String = o match {
        case runtimemonitor.ObservationKind.FrigateThreatEgressSupervisor_Instance_threatResponseProcess_threatEvidenceQualifier_postInit => "FrigateThreatEgressSupervisor_Instance_threatResponseProcess_threatEvidenceQualifier_postInit"
        case runtimemonitor.ObservationKind.FrigateThreatEgressSupervisor_Instance_threatResponseProcess_threatEvidenceQualifier_preCompute => "FrigateThreatEgressSupervisor_Instance_threatResponseProcess_threatEvidenceQualifier_preCompute"
        case runtimemonitor.ObservationKind.FrigateThreatEgressSupervisor_Instance_threatResponseProcess_threatEvidenceQualifier_postCompute => "FrigateThreatEgressSupervisor_Instance_threatResponseProcess_threatEvidenceQualifier_postCompute"
        case runtimemonitor.ObservationKind.FrigateThreatEgressSupervisor_Instance_threatResponseProcess_threatEpisodeTracker_postInit => "FrigateThreatEgressSupervisor_Instance_threatResponseProcess_threatEpisodeTracker_postInit"
        case runtimemonitor.ObservationKind.FrigateThreatEgressSupervisor_Instance_threatResponseProcess_threatEpisodeTracker_preCompute => "FrigateThreatEgressSupervisor_Instance_threatResponseProcess_threatEpisodeTracker_preCompute"
        case runtimemonitor.ObservationKind.FrigateThreatEgressSupervisor_Instance_threatResponseProcess_threatEpisodeTracker_postCompute => "FrigateThreatEgressSupervisor_Instance_threatResponseProcess_threatEpisodeTracker_postCompute"
        case runtimemonitor.ObservationKind.FrigateThreatEgressSupervisor_Instance_threatResponseProcess_threatReportPolicy_postInit => "FrigateThreatEgressSupervisor_Instance_threatResponseProcess_threatReportPolicy_postInit"
        case runtimemonitor.ObservationKind.FrigateThreatEgressSupervisor_Instance_threatResponseProcess_threatReportPolicy_preCompute => "FrigateThreatEgressSupervisor_Instance_threatResponseProcess_threatReportPolicy_preCompute"
        case runtimemonitor.ObservationKind.FrigateThreatEgressSupervisor_Instance_threatResponseProcess_threatReportPolicy_postCompute => "FrigateThreatEgressSupervisor_Instance_threatResponseProcess_threatReportPolicy_postCompute"
        case runtimemonitor.ObservationKind.FrigateThreatEgressSupervisor_Instance_threatResponseProcess_defenseReadinessQualifier_postInit => "FrigateThreatEgressSupervisor_Instance_threatResponseProcess_defenseReadinessQualifier_postInit"
        case runtimemonitor.ObservationKind.FrigateThreatEgressSupervisor_Instance_threatResponseProcess_defenseReadinessQualifier_preCompute => "FrigateThreatEgressSupervisor_Instance_threatResponseProcess_defenseReadinessQualifier_preCompute"
        case runtimemonitor.ObservationKind.FrigateThreatEgressSupervisor_Instance_threatResponseProcess_defenseReadinessQualifier_postCompute => "FrigateThreatEgressSupervisor_Instance_threatResponseProcess_defenseReadinessQualifier_postCompute"
        case runtimemonitor.ObservationKind.FrigateThreatEgressSupervisor_Instance_threatResponseProcess_egressReadinessQualifier_postInit => "FrigateThreatEgressSupervisor_Instance_threatResponseProcess_egressReadinessQualifier_postInit"
        case runtimemonitor.ObservationKind.FrigateThreatEgressSupervisor_Instance_threatResponseProcess_egressReadinessQualifier_preCompute => "FrigateThreatEgressSupervisor_Instance_threatResponseProcess_egressReadinessQualifier_preCompute"
        case runtimemonitor.ObservationKind.FrigateThreatEgressSupervisor_Instance_threatResponseProcess_egressReadinessQualifier_postCompute => "FrigateThreatEgressSupervisor_Instance_threatResponseProcess_egressReadinessQualifier_postCompute"
        case runtimemonitor.ObservationKind.FrigateThreatEgressSupervisor_Instance_threatResponseProcess_threatResponseArbiter_postInit => "FrigateThreatEgressSupervisor_Instance_threatResponseProcess_threatResponseArbiter_postInit"
        case runtimemonitor.ObservationKind.FrigateThreatEgressSupervisor_Instance_threatResponseProcess_threatResponseArbiter_preCompute => "FrigateThreatEgressSupervisor_Instance_threatResponseProcess_threatResponseArbiter_preCompute"
        case runtimemonitor.ObservationKind.FrigateThreatEgressSupervisor_Instance_threatResponseProcess_threatResponseArbiter_postCompute => "FrigateThreatEgressSupervisor_Instance_threatResponseProcess_threatResponseArbiter_postCompute"
        case runtimemonitor.ObservationKind.FrigateThreatEgressSupervisor_Instance_threatResponseProcess_responseStateController_postInit => "FrigateThreatEgressSupervisor_Instance_threatResponseProcess_responseStateController_postInit"
        case runtimemonitor.ObservationKind.FrigateThreatEgressSupervisor_Instance_threatResponseProcess_responseStateController_preCompute => "FrigateThreatEgressSupervisor_Instance_threatResponseProcess_responseStateController_preCompute"
        case runtimemonitor.ObservationKind.FrigateThreatEgressSupervisor_Instance_threatResponseProcess_responseStateController_postCompute => "FrigateThreatEgressSupervisor_Instance_threatResponseProcess_responseStateController_postCompute"
        case runtimemonitor.ObservationKind.FrigateThreatEgressSupervisor_Instance_threatResponseProcess_responseStatusAssessor_postInit => "FrigateThreatEgressSupervisor_Instance_threatResponseProcess_responseStatusAssessor_postInit"
        case runtimemonitor.ObservationKind.FrigateThreatEgressSupervisor_Instance_threatResponseProcess_responseStatusAssessor_preCompute => "FrigateThreatEgressSupervisor_Instance_threatResponseProcess_responseStatusAssessor_preCompute"
        case runtimemonitor.ObservationKind.FrigateThreatEgressSupervisor_Instance_threatResponseProcess_responseStatusAssessor_postCompute => "FrigateThreatEgressSupervisor_Instance_threatResponseProcess_responseStatusAssessor_postCompute"
      }
      return printObject(ISZ(
        ("type", printString("runtimemonitor.ObservationKind")),
        ("value", printString(value))
      ))
    }

    @pure def printutilContainer(o: util.Container): ST = {
      o match {
        case o: util.EmptyContainer => return printutilEmptyContainer(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_P => return printFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PS => return printFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PS(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_P => return printFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PS => return printFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PS(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_P => return printFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PS => return printFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PS(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_P => return printFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PS => return printFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PS(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_P => return printFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PS => return printFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PS(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_P => return printFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PS => return printFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PS(o)
        case o: Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_P => return printFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PS => return printFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PS(o)
        case o: Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_P => return printFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PS => return printFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PS(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_P => return printFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PreState_Container_P => return printFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PS => return printFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PS(o)
        case o: Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PS => return printFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PS(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_P => return printFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PS => return printFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PS(o)
        case o: Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PostState_Container_P => return printFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PS => return printFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PS(o)
        case o: Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_P => return printFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PS => return printFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PS(o)
        case o: Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_P => return printFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PS => return printFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PS(o)
        case o: Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_P => return printFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PS => return printFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PS(o)
        case o: Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_P => return printFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PS => return printFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PS(o)
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
        case o: Frigate_Threat_Egress_Supervisor.EvidenceBand_Payload => return printFrigate_Threat_Egress_SupervisorEvidenceBand_Payload(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatReport_Payload => return printFrigate_Threat_Egress_SupervisorThreatReport_Payload(o)
        case o: Frigate_Threat_Egress_Supervisor.EgressCommand_Payload => return printFrigate_Threat_Egress_SupervisorEgressCommand_Payload(o)
        case o: Frigate_Threat_Egress_Supervisor.DefenseCommand_Payload => return printFrigate_Threat_Egress_SupervisorDefenseCommand_Payload(o)
        case o: Frigate_Threat_Egress_Supervisor.EgressProgress_Payload => return printFrigate_Threat_Egress_SupervisorEgressProgress_Payload(o)
        case o: Frigate_Threat_Egress_Supervisor.ResponseStatus_Payload => return printFrigate_Threat_Egress_SupervisorResponseStatus_Payload(o)
        case o: Frigate_Threat_Egress_Supervisor.EpisodeSnapshot_Payload => return printFrigate_Threat_Egress_SupervisorEpisodeSnapshot_Payload(o)
        case o: Frigate_Threat_Egress_Supervisor.CapacitorSupport_Payload => return printFrigate_Threat_Egress_SupervisorCapacitorSupport_Payload(o)
        case o: Frigate_Threat_Egress_Supervisor.PilotDisposition_Payload => return printFrigate_Threat_Egress_SupervisorPilotDisposition_Payload(o)
        case o: Frigate_Threat_Egress_Supervisor.ResponseSnapshot_Payload => return printFrigate_Threat_Egress_SupervisorResponseSnapshot_Payload(o)
        case o: Frigate_Threat_Egress_Supervisor.ResponseDirective_Payload => return printFrigate_Threat_Egress_SupervisorResponseDirective_Payload(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatObservation_Payload => return printFrigate_Threat_Egress_SupervisorThreatObservation_Payload(o)
        case o: Frigate_Threat_Egress_Supervisor.EvidenceAssessment_Payload => return printFrigate_Threat_Egress_SupervisorEvidenceAssessment_Payload(o)
        case o: Frigate_Threat_Egress_Supervisor.ObservationValidity_Payload => return printFrigate_Threat_Egress_SupervisorObservationValidity_Payload(o)
        case o: Frigate_Threat_Egress_Supervisor.DefenseAvailability_Payload => return printFrigate_Threat_Egress_SupervisorDefenseAvailability_Payload(o)
        case o: Frigate_Threat_Egress_Supervisor.EgressQualification_Payload => return printFrigate_Threat_Egress_SupervisorEgressQualification_Payload(o)
        case o: Frigate_Threat_Egress_Supervisor.DefenseQualification_Payload => return printFrigate_Threat_Egress_SupervisorDefenseQualification_Payload(o)
        case o: Frigate_Threat_Egress_Supervisor.SnapshotEgressCommand_Payload => return printFrigate_Threat_Egress_SupervisorSnapshotEgressCommand_Payload(o)
        case o: Frigate_Threat_Egress_Supervisor.ResponseAuthorization_Payload => return printFrigate_Threat_Egress_SupervisorResponseAuthorization_Payload(o)
        case o: Frigate_Threat_Egress_Supervisor.SnapshotDefenseCommand_Payload => return printFrigate_Threat_Egress_SupervisorSnapshotDefenseCommand_Payload(o)
        case o: Frigate_Threat_Egress_Supervisor.EgressRouteObservation_Payload => return printFrigate_Threat_Egress_SupervisorEgressRouteObservation_Payload(o)
        case o: Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState_Payload => return printFrigate_Threat_Egress_SupervisorSnapshotPreEgressState_Payload(o)
        case o: Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState_Payload => return printFrigate_Threat_Egress_SupervisorSnapshotPreEpisodeState_Payload(o)
        case o: Frigate_Threat_Egress_Supervisor.SnapshotNextEgressState_Payload => return printFrigate_Threat_Egress_SupervisorSnapshotNextEgressState_Payload(o)
        case o: Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState_Payload => return printFrigate_Threat_Egress_SupervisorSnapshotNextEpisodeState_Payload(o)
        case o: Frigate_Threat_Egress_Supervisor.SnapshotPilotDisposition_Payload => return printFrigate_Threat_Egress_SupervisorSnapshotPilotDisposition_Payload(o)
        case o: Frigate_Threat_Egress_Supervisor.SnapshotResponseDirective_Payload => return printFrigate_Threat_Egress_SupervisorSnapshotResponseDirective_Payload(o)
        case o: Frigate_Threat_Egress_Supervisor.DefenseSupportObservation_Payload => return printFrigate_Threat_Egress_SupervisorDefenseSupportObservation_Payload(o)
        case o: Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment_Payload => return printFrigate_Threat_Egress_SupervisorSnapshotEvidenceAssessment_Payload(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_P => return printFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PS => return printFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PS(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_P => return printFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PS => return printFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PS(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_P => return printFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PS => return printFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PS(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_P => return printFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PS => return printFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PS(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_P => return printFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PS => return printFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PS(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_P => return printFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PS => return printFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PS(o)
        case o: Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_P => return printFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PS => return printFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PS(o)
        case o: Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_P => return printFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PS => return printFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PS(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_P => return printFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PreState_Container_P => return printFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PS => return printFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PS(o)
        case o: Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PS => return printFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PS(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_P => return printFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PS => return printFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PS(o)
        case o: Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PostState_Container_P => return printFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PS => return printFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PS(o)
        case o: Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_P => return printFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PS => return printFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PS(o)
        case o: Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_P => return printFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PS => return printFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PS(o)
        case o: Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_P => return printFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PS => return printFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PS(o)
        case o: Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_P => return printFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_P(o)
        case o: Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PS => return printFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PS(o)
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

    def parseFrigate_Threat_Egress_SupervisorEvidenceBandType(): Frigate_Threat_Egress_Supervisor.EvidenceBand.Type = {
      val r = parseFrigate_Threat_Egress_SupervisorEvidenceBandT(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorEvidenceBandT(typeParsed: B): Frigate_Threat_Egress_Supervisor.EvidenceBand.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.EvidenceBand")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Frigate_Threat_Egress_Supervisor.EvidenceBand.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Frigate_Threat_Egress_Supervisor.EvidenceBand.")
          return Frigate_Threat_Egress_Supervisor.EvidenceBand.byOrdinal(0).get
      }
    }

    def parseFrigate_Threat_Egress_SupervisorEvidenceBand_Payload(): Frigate_Threat_Egress_Supervisor.EvidenceBand_Payload = {
      val r = parseFrigate_Threat_Egress_SupervisorEvidenceBand_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorEvidenceBand_PayloadT(typeParsed: B): Frigate_Threat_Egress_Supervisor.EvidenceBand_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.EvidenceBand_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Egress_SupervisorEvidenceBandType()
      parser.parseObjectNext()
      return Frigate_Threat_Egress_Supervisor.EvidenceBand_Payload(value)
    }

    def parseFrigate_Threat_Egress_SupervisorObservationValidityType(): Frigate_Threat_Egress_Supervisor.ObservationValidity.Type = {
      val r = parseFrigate_Threat_Egress_SupervisorObservationValidityT(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorObservationValidityT(typeParsed: B): Frigate_Threat_Egress_Supervisor.ObservationValidity.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.ObservationValidity")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Frigate_Threat_Egress_Supervisor.ObservationValidity.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Frigate_Threat_Egress_Supervisor.ObservationValidity.")
          return Frigate_Threat_Egress_Supervisor.ObservationValidity.byOrdinal(0).get
      }
    }

    def parseFrigate_Threat_Egress_SupervisorObservationValidity_Payload(): Frigate_Threat_Egress_Supervisor.ObservationValidity_Payload = {
      val r = parseFrigate_Threat_Egress_SupervisorObservationValidity_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorObservationValidity_PayloadT(typeParsed: B): Frigate_Threat_Egress_Supervisor.ObservationValidity_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.ObservationValidity_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Egress_SupervisorObservationValidityType()
      parser.parseObjectNext()
      return Frigate_Threat_Egress_Supervisor.ObservationValidity_Payload(value)
    }

    def parseFrigate_Threat_Egress_SupervisorEvidenceAssessmentType(): Frigate_Threat_Egress_Supervisor.EvidenceAssessment.Type = {
      val r = parseFrigate_Threat_Egress_SupervisorEvidenceAssessmentT(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorEvidenceAssessmentT(typeParsed: B): Frigate_Threat_Egress_Supervisor.EvidenceAssessment.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.EvidenceAssessment")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Frigate_Threat_Egress_Supervisor.EvidenceAssessment.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Frigate_Threat_Egress_Supervisor.EvidenceAssessment.")
          return Frigate_Threat_Egress_Supervisor.EvidenceAssessment.byOrdinal(0).get
      }
    }

    def parseFrigate_Threat_Egress_SupervisorEvidenceAssessment_Payload(): Frigate_Threat_Egress_Supervisor.EvidenceAssessment_Payload = {
      val r = parseFrigate_Threat_Egress_SupervisorEvidenceAssessment_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorEvidenceAssessment_PayloadT(typeParsed: B): Frigate_Threat_Egress_Supervisor.EvidenceAssessment_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.EvidenceAssessment_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Egress_SupervisorEvidenceAssessmentType()
      parser.parseObjectNext()
      return Frigate_Threat_Egress_Supervisor.EvidenceAssessment_Payload(value)
    }

    def parseFrigate_Threat_Egress_SupervisorPilotDispositionType(): Frigate_Threat_Egress_Supervisor.PilotDisposition.Type = {
      val r = parseFrigate_Threat_Egress_SupervisorPilotDispositionT(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorPilotDispositionT(typeParsed: B): Frigate_Threat_Egress_Supervisor.PilotDisposition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.PilotDisposition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Frigate_Threat_Egress_Supervisor.PilotDisposition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Frigate_Threat_Egress_Supervisor.PilotDisposition.")
          return Frigate_Threat_Egress_Supervisor.PilotDisposition.byOrdinal(0).get
      }
    }

    def parseFrigate_Threat_Egress_SupervisorPilotDisposition_Payload(): Frigate_Threat_Egress_Supervisor.PilotDisposition_Payload = {
      val r = parseFrigate_Threat_Egress_SupervisorPilotDisposition_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorPilotDisposition_PayloadT(typeParsed: B): Frigate_Threat_Egress_Supervisor.PilotDisposition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.PilotDisposition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Egress_SupervisorPilotDispositionType()
      parser.parseObjectNext()
      return Frigate_Threat_Egress_Supervisor.PilotDisposition_Payload(value)
    }

    def parseFrigate_Threat_Egress_SupervisorSnapshotPreEpisodeStateType(): Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.Type = {
      val r = parseFrigate_Threat_Egress_SupervisorSnapshotPreEpisodeStateT(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorSnapshotPreEpisodeStateT(typeParsed: B): Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.")
          return Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.byOrdinal(0).get
      }
    }

    def parseFrigate_Threat_Egress_SupervisorSnapshotPreEpisodeState_Payload(): Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState_Payload = {
      val r = parseFrigate_Threat_Egress_SupervisorSnapshotPreEpisodeState_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorSnapshotPreEpisodeState_PayloadT(typeParsed: B): Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Egress_SupervisorSnapshotPreEpisodeStateType()
      parser.parseObjectNext()
      return Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState_Payload(value)
    }

    def parseFrigate_Threat_Egress_SupervisorSnapshotNextEpisodeStateType(): Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState.Type = {
      val r = parseFrigate_Threat_Egress_SupervisorSnapshotNextEpisodeStateT(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorSnapshotNextEpisodeStateT(typeParsed: B): Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState.")
          return Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState.byOrdinal(0).get
      }
    }

    def parseFrigate_Threat_Egress_SupervisorSnapshotNextEpisodeState_Payload(): Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState_Payload = {
      val r = parseFrigate_Threat_Egress_SupervisorSnapshotNextEpisodeState_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorSnapshotNextEpisodeState_PayloadT(typeParsed: B): Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Egress_SupervisorSnapshotNextEpisodeStateType()
      parser.parseObjectNext()
      return Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState_Payload(value)
    }

    def parseFrigate_Threat_Egress_SupervisorSnapshotEvidenceAssessmentType(): Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment.Type = {
      val r = parseFrigate_Threat_Egress_SupervisorSnapshotEvidenceAssessmentT(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorSnapshotEvidenceAssessmentT(typeParsed: B): Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment.")
          return Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment.byOrdinal(0).get
      }
    }

    def parseFrigate_Threat_Egress_SupervisorSnapshotEvidenceAssessment_Payload(): Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment_Payload = {
      val r = parseFrigate_Threat_Egress_SupervisorSnapshotEvidenceAssessment_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorSnapshotEvidenceAssessment_PayloadT(typeParsed: B): Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Egress_SupervisorSnapshotEvidenceAssessmentType()
      parser.parseObjectNext()
      return Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment_Payload(value)
    }

    def parseFrigate_Threat_Egress_SupervisorSnapshotPilotDispositionType(): Frigate_Threat_Egress_Supervisor.SnapshotPilotDisposition.Type = {
      val r = parseFrigate_Threat_Egress_SupervisorSnapshotPilotDispositionT(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorSnapshotPilotDispositionT(typeParsed: B): Frigate_Threat_Egress_Supervisor.SnapshotPilotDisposition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.SnapshotPilotDisposition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Frigate_Threat_Egress_Supervisor.SnapshotPilotDisposition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Frigate_Threat_Egress_Supervisor.SnapshotPilotDisposition.")
          return Frigate_Threat_Egress_Supervisor.SnapshotPilotDisposition.byOrdinal(0).get
      }
    }

    def parseFrigate_Threat_Egress_SupervisorSnapshotPilotDisposition_Payload(): Frigate_Threat_Egress_Supervisor.SnapshotPilotDisposition_Payload = {
      val r = parseFrigate_Threat_Egress_SupervisorSnapshotPilotDisposition_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorSnapshotPilotDisposition_PayloadT(typeParsed: B): Frigate_Threat_Egress_Supervisor.SnapshotPilotDisposition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.SnapshotPilotDisposition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Egress_SupervisorSnapshotPilotDispositionType()
      parser.parseObjectNext()
      return Frigate_Threat_Egress_Supervisor.SnapshotPilotDisposition_Payload(value)
    }

    def parseFrigate_Threat_Egress_SupervisorThreatReportType(): Frigate_Threat_Egress_Supervisor.ThreatReport.Type = {
      val r = parseFrigate_Threat_Egress_SupervisorThreatReportT(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorThreatReportT(typeParsed: B): Frigate_Threat_Egress_Supervisor.ThreatReport.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.ThreatReport")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Frigate_Threat_Egress_Supervisor.ThreatReport.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Frigate_Threat_Egress_Supervisor.ThreatReport.")
          return Frigate_Threat_Egress_Supervisor.ThreatReport.byOrdinal(0).get
      }
    }

    def parseFrigate_Threat_Egress_SupervisorThreatReport_Payload(): Frigate_Threat_Egress_Supervisor.ThreatReport_Payload = {
      val r = parseFrigate_Threat_Egress_SupervisorThreatReport_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorThreatReport_PayloadT(typeParsed: B): Frigate_Threat_Egress_Supervisor.ThreatReport_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.ThreatReport_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Egress_SupervisorThreatReportType()
      parser.parseObjectNext()
      return Frigate_Threat_Egress_Supervisor.ThreatReport_Payload(value)
    }

    def parseFrigate_Threat_Egress_SupervisorDefenseAvailabilityType(): Frigate_Threat_Egress_Supervisor.DefenseAvailability.Type = {
      val r = parseFrigate_Threat_Egress_SupervisorDefenseAvailabilityT(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorDefenseAvailabilityT(typeParsed: B): Frigate_Threat_Egress_Supervisor.DefenseAvailability.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.DefenseAvailability")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Frigate_Threat_Egress_Supervisor.DefenseAvailability.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Frigate_Threat_Egress_Supervisor.DefenseAvailability.")
          return Frigate_Threat_Egress_Supervisor.DefenseAvailability.byOrdinal(0).get
      }
    }

    def parseFrigate_Threat_Egress_SupervisorDefenseAvailability_Payload(): Frigate_Threat_Egress_Supervisor.DefenseAvailability_Payload = {
      val r = parseFrigate_Threat_Egress_SupervisorDefenseAvailability_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorDefenseAvailability_PayloadT(typeParsed: B): Frigate_Threat_Egress_Supervisor.DefenseAvailability_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.DefenseAvailability_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Egress_SupervisorDefenseAvailabilityType()
      parser.parseObjectNext()
      return Frigate_Threat_Egress_Supervisor.DefenseAvailability_Payload(value)
    }

    def parseFrigate_Threat_Egress_SupervisorCapacitorSupportType(): Frigate_Threat_Egress_Supervisor.CapacitorSupport.Type = {
      val r = parseFrigate_Threat_Egress_SupervisorCapacitorSupportT(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorCapacitorSupportT(typeParsed: B): Frigate_Threat_Egress_Supervisor.CapacitorSupport.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.CapacitorSupport")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Frigate_Threat_Egress_Supervisor.CapacitorSupport.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Frigate_Threat_Egress_Supervisor.CapacitorSupport.")
          return Frigate_Threat_Egress_Supervisor.CapacitorSupport.byOrdinal(0).get
      }
    }

    def parseFrigate_Threat_Egress_SupervisorCapacitorSupport_Payload(): Frigate_Threat_Egress_Supervisor.CapacitorSupport_Payload = {
      val r = parseFrigate_Threat_Egress_SupervisorCapacitorSupport_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorCapacitorSupport_PayloadT(typeParsed: B): Frigate_Threat_Egress_Supervisor.CapacitorSupport_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.CapacitorSupport_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Egress_SupervisorCapacitorSupportType()
      parser.parseObjectNext()
      return Frigate_Threat_Egress_Supervisor.CapacitorSupport_Payload(value)
    }

    def parseFrigate_Threat_Egress_SupervisorDefenseQualificationType(): Frigate_Threat_Egress_Supervisor.DefenseQualification.Type = {
      val r = parseFrigate_Threat_Egress_SupervisorDefenseQualificationT(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorDefenseQualificationT(typeParsed: B): Frigate_Threat_Egress_Supervisor.DefenseQualification.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.DefenseQualification")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Frigate_Threat_Egress_Supervisor.DefenseQualification.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Frigate_Threat_Egress_Supervisor.DefenseQualification.")
          return Frigate_Threat_Egress_Supervisor.DefenseQualification.byOrdinal(0).get
      }
    }

    def parseFrigate_Threat_Egress_SupervisorDefenseQualification_Payload(): Frigate_Threat_Egress_Supervisor.DefenseQualification_Payload = {
      val r = parseFrigate_Threat_Egress_SupervisorDefenseQualification_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorDefenseQualification_PayloadT(typeParsed: B): Frigate_Threat_Egress_Supervisor.DefenseQualification_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.DefenseQualification_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Egress_SupervisorDefenseQualificationType()
      parser.parseObjectNext()
      return Frigate_Threat_Egress_Supervisor.DefenseQualification_Payload(value)
    }

    def parseFrigate_Threat_Egress_SupervisorEgressRouteObservationType(): Frigate_Threat_Egress_Supervisor.EgressRouteObservation.Type = {
      val r = parseFrigate_Threat_Egress_SupervisorEgressRouteObservationT(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorEgressRouteObservationT(typeParsed: B): Frigate_Threat_Egress_Supervisor.EgressRouteObservation.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.EgressRouteObservation")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Frigate_Threat_Egress_Supervisor.EgressRouteObservation.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Frigate_Threat_Egress_Supervisor.EgressRouteObservation.")
          return Frigate_Threat_Egress_Supervisor.EgressRouteObservation.byOrdinal(0).get
      }
    }

    def parseFrigate_Threat_Egress_SupervisorEgressRouteObservation_Payload(): Frigate_Threat_Egress_Supervisor.EgressRouteObservation_Payload = {
      val r = parseFrigate_Threat_Egress_SupervisorEgressRouteObservation_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorEgressRouteObservation_PayloadT(typeParsed: B): Frigate_Threat_Egress_Supervisor.EgressRouteObservation_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.EgressRouteObservation_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Egress_SupervisorEgressRouteObservationType()
      parser.parseObjectNext()
      return Frigate_Threat_Egress_Supervisor.EgressRouteObservation_Payload(value)
    }

    def parseFrigate_Threat_Egress_SupervisorEgressQualificationType(): Frigate_Threat_Egress_Supervisor.EgressQualification.Type = {
      val r = parseFrigate_Threat_Egress_SupervisorEgressQualificationT(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorEgressQualificationT(typeParsed: B): Frigate_Threat_Egress_Supervisor.EgressQualification.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.EgressQualification")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Frigate_Threat_Egress_Supervisor.EgressQualification.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Frigate_Threat_Egress_Supervisor.EgressQualification.")
          return Frigate_Threat_Egress_Supervisor.EgressQualification.byOrdinal(0).get
      }
    }

    def parseFrigate_Threat_Egress_SupervisorEgressQualification_Payload(): Frigate_Threat_Egress_Supervisor.EgressQualification_Payload = {
      val r = parseFrigate_Threat_Egress_SupervisorEgressQualification_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorEgressQualification_PayloadT(typeParsed: B): Frigate_Threat_Egress_Supervisor.EgressQualification_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.EgressQualification_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Egress_SupervisorEgressQualificationType()
      parser.parseObjectNext()
      return Frigate_Threat_Egress_Supervisor.EgressQualification_Payload(value)
    }

    def parseFrigate_Threat_Egress_SupervisorResponseAuthorizationType(): Frigate_Threat_Egress_Supervisor.ResponseAuthorization.Type = {
      val r = parseFrigate_Threat_Egress_SupervisorResponseAuthorizationT(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorResponseAuthorizationT(typeParsed: B): Frigate_Threat_Egress_Supervisor.ResponseAuthorization.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.ResponseAuthorization")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Frigate_Threat_Egress_Supervisor.ResponseAuthorization.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Frigate_Threat_Egress_Supervisor.ResponseAuthorization.")
          return Frigate_Threat_Egress_Supervisor.ResponseAuthorization.byOrdinal(0).get
      }
    }

    def parseFrigate_Threat_Egress_SupervisorResponseAuthorization_Payload(): Frigate_Threat_Egress_Supervisor.ResponseAuthorization_Payload = {
      val r = parseFrigate_Threat_Egress_SupervisorResponseAuthorization_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorResponseAuthorization_PayloadT(typeParsed: B): Frigate_Threat_Egress_Supervisor.ResponseAuthorization_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.ResponseAuthorization_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Egress_SupervisorResponseAuthorizationType()
      parser.parseObjectNext()
      return Frigate_Threat_Egress_Supervisor.ResponseAuthorization_Payload(value)
    }

    def parseFrigate_Threat_Egress_SupervisorResponseDirectiveType(): Frigate_Threat_Egress_Supervisor.ResponseDirective.Type = {
      val r = parseFrigate_Threat_Egress_SupervisorResponseDirectiveT(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorResponseDirectiveT(typeParsed: B): Frigate_Threat_Egress_Supervisor.ResponseDirective.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.ResponseDirective")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Frigate_Threat_Egress_Supervisor.ResponseDirective.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Frigate_Threat_Egress_Supervisor.ResponseDirective.")
          return Frigate_Threat_Egress_Supervisor.ResponseDirective.byOrdinal(0).get
      }
    }

    def parseFrigate_Threat_Egress_SupervisorResponseDirective_Payload(): Frigate_Threat_Egress_Supervisor.ResponseDirective_Payload = {
      val r = parseFrigate_Threat_Egress_SupervisorResponseDirective_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorResponseDirective_PayloadT(typeParsed: B): Frigate_Threat_Egress_Supervisor.ResponseDirective_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.ResponseDirective_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Egress_SupervisorResponseDirectiveType()
      parser.parseObjectNext()
      return Frigate_Threat_Egress_Supervisor.ResponseDirective_Payload(value)
    }

    def parseFrigate_Threat_Egress_SupervisorEgressProgressType(): Frigate_Threat_Egress_Supervisor.EgressProgress.Type = {
      val r = parseFrigate_Threat_Egress_SupervisorEgressProgressT(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorEgressProgressT(typeParsed: B): Frigate_Threat_Egress_Supervisor.EgressProgress.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.EgressProgress")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Frigate_Threat_Egress_Supervisor.EgressProgress.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Frigate_Threat_Egress_Supervisor.EgressProgress.")
          return Frigate_Threat_Egress_Supervisor.EgressProgress.byOrdinal(0).get
      }
    }

    def parseFrigate_Threat_Egress_SupervisorEgressProgress_Payload(): Frigate_Threat_Egress_Supervisor.EgressProgress_Payload = {
      val r = parseFrigate_Threat_Egress_SupervisorEgressProgress_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorEgressProgress_PayloadT(typeParsed: B): Frigate_Threat_Egress_Supervisor.EgressProgress_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.EgressProgress_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Egress_SupervisorEgressProgressType()
      parser.parseObjectNext()
      return Frigate_Threat_Egress_Supervisor.EgressProgress_Payload(value)
    }

    def parseFrigate_Threat_Egress_SupervisorSnapshotPreEgressStateType(): Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.Type = {
      val r = parseFrigate_Threat_Egress_SupervisorSnapshotPreEgressStateT(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorSnapshotPreEgressStateT(typeParsed: B): Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.")
          return Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState.byOrdinal(0).get
      }
    }

    def parseFrigate_Threat_Egress_SupervisorSnapshotPreEgressState_Payload(): Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState_Payload = {
      val r = parseFrigate_Threat_Egress_SupervisorSnapshotPreEgressState_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorSnapshotPreEgressState_PayloadT(typeParsed: B): Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Egress_SupervisorSnapshotPreEgressStateType()
      parser.parseObjectNext()
      return Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState_Payload(value)
    }

    def parseFrigate_Threat_Egress_SupervisorSnapshotNextEgressStateType(): Frigate_Threat_Egress_Supervisor.SnapshotNextEgressState.Type = {
      val r = parseFrigate_Threat_Egress_SupervisorSnapshotNextEgressStateT(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorSnapshotNextEgressStateT(typeParsed: B): Frigate_Threat_Egress_Supervisor.SnapshotNextEgressState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.SnapshotNextEgressState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Frigate_Threat_Egress_Supervisor.SnapshotNextEgressState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Frigate_Threat_Egress_Supervisor.SnapshotNextEgressState.")
          return Frigate_Threat_Egress_Supervisor.SnapshotNextEgressState.byOrdinal(0).get
      }
    }

    def parseFrigate_Threat_Egress_SupervisorSnapshotNextEgressState_Payload(): Frigate_Threat_Egress_Supervisor.SnapshotNextEgressState_Payload = {
      val r = parseFrigate_Threat_Egress_SupervisorSnapshotNextEgressState_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorSnapshotNextEgressState_PayloadT(typeParsed: B): Frigate_Threat_Egress_Supervisor.SnapshotNextEgressState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.SnapshotNextEgressState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Egress_SupervisorSnapshotNextEgressStateType()
      parser.parseObjectNext()
      return Frigate_Threat_Egress_Supervisor.SnapshotNextEgressState_Payload(value)
    }

    def parseFrigate_Threat_Egress_SupervisorSnapshotResponseDirectiveType(): Frigate_Threat_Egress_Supervisor.SnapshotResponseDirective.Type = {
      val r = parseFrigate_Threat_Egress_SupervisorSnapshotResponseDirectiveT(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorSnapshotResponseDirectiveT(typeParsed: B): Frigate_Threat_Egress_Supervisor.SnapshotResponseDirective.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.SnapshotResponseDirective")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Frigate_Threat_Egress_Supervisor.SnapshotResponseDirective.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Frigate_Threat_Egress_Supervisor.SnapshotResponseDirective.")
          return Frigate_Threat_Egress_Supervisor.SnapshotResponseDirective.byOrdinal(0).get
      }
    }

    def parseFrigate_Threat_Egress_SupervisorSnapshotResponseDirective_Payload(): Frigate_Threat_Egress_Supervisor.SnapshotResponseDirective_Payload = {
      val r = parseFrigate_Threat_Egress_SupervisorSnapshotResponseDirective_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorSnapshotResponseDirective_PayloadT(typeParsed: B): Frigate_Threat_Egress_Supervisor.SnapshotResponseDirective_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.SnapshotResponseDirective_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Egress_SupervisorSnapshotResponseDirectiveType()
      parser.parseObjectNext()
      return Frigate_Threat_Egress_Supervisor.SnapshotResponseDirective_Payload(value)
    }

    def parseFrigate_Threat_Egress_SupervisorSnapshotDefenseCommandType(): Frigate_Threat_Egress_Supervisor.SnapshotDefenseCommand.Type = {
      val r = parseFrigate_Threat_Egress_SupervisorSnapshotDefenseCommandT(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorSnapshotDefenseCommandT(typeParsed: B): Frigate_Threat_Egress_Supervisor.SnapshotDefenseCommand.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.SnapshotDefenseCommand")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Frigate_Threat_Egress_Supervisor.SnapshotDefenseCommand.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Frigate_Threat_Egress_Supervisor.SnapshotDefenseCommand.")
          return Frigate_Threat_Egress_Supervisor.SnapshotDefenseCommand.byOrdinal(0).get
      }
    }

    def parseFrigate_Threat_Egress_SupervisorSnapshotDefenseCommand_Payload(): Frigate_Threat_Egress_Supervisor.SnapshotDefenseCommand_Payload = {
      val r = parseFrigate_Threat_Egress_SupervisorSnapshotDefenseCommand_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorSnapshotDefenseCommand_PayloadT(typeParsed: B): Frigate_Threat_Egress_Supervisor.SnapshotDefenseCommand_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.SnapshotDefenseCommand_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Egress_SupervisorSnapshotDefenseCommandType()
      parser.parseObjectNext()
      return Frigate_Threat_Egress_Supervisor.SnapshotDefenseCommand_Payload(value)
    }

    def parseFrigate_Threat_Egress_SupervisorSnapshotEgressCommandType(): Frigate_Threat_Egress_Supervisor.SnapshotEgressCommand.Type = {
      val r = parseFrigate_Threat_Egress_SupervisorSnapshotEgressCommandT(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorSnapshotEgressCommandT(typeParsed: B): Frigate_Threat_Egress_Supervisor.SnapshotEgressCommand.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.SnapshotEgressCommand")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Frigate_Threat_Egress_Supervisor.SnapshotEgressCommand.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Frigate_Threat_Egress_Supervisor.SnapshotEgressCommand.")
          return Frigate_Threat_Egress_Supervisor.SnapshotEgressCommand.byOrdinal(0).get
      }
    }

    def parseFrigate_Threat_Egress_SupervisorSnapshotEgressCommand_Payload(): Frigate_Threat_Egress_Supervisor.SnapshotEgressCommand_Payload = {
      val r = parseFrigate_Threat_Egress_SupervisorSnapshotEgressCommand_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorSnapshotEgressCommand_PayloadT(typeParsed: B): Frigate_Threat_Egress_Supervisor.SnapshotEgressCommand_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.SnapshotEgressCommand_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Egress_SupervisorSnapshotEgressCommandType()
      parser.parseObjectNext()
      return Frigate_Threat_Egress_Supervisor.SnapshotEgressCommand_Payload(value)
    }

    def parseFrigate_Threat_Egress_SupervisorDefenseCommandType(): Frigate_Threat_Egress_Supervisor.DefenseCommand.Type = {
      val r = parseFrigate_Threat_Egress_SupervisorDefenseCommandT(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorDefenseCommandT(typeParsed: B): Frigate_Threat_Egress_Supervisor.DefenseCommand.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.DefenseCommand")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Frigate_Threat_Egress_Supervisor.DefenseCommand.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Frigate_Threat_Egress_Supervisor.DefenseCommand.")
          return Frigate_Threat_Egress_Supervisor.DefenseCommand.byOrdinal(0).get
      }
    }

    def parseFrigate_Threat_Egress_SupervisorDefenseCommand_Payload(): Frigate_Threat_Egress_Supervisor.DefenseCommand_Payload = {
      val r = parseFrigate_Threat_Egress_SupervisorDefenseCommand_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorDefenseCommand_PayloadT(typeParsed: B): Frigate_Threat_Egress_Supervisor.DefenseCommand_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.DefenseCommand_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Egress_SupervisorDefenseCommandType()
      parser.parseObjectNext()
      return Frigate_Threat_Egress_Supervisor.DefenseCommand_Payload(value)
    }

    def parseFrigate_Threat_Egress_SupervisorEgressCommandType(): Frigate_Threat_Egress_Supervisor.EgressCommand.Type = {
      val r = parseFrigate_Threat_Egress_SupervisorEgressCommandT(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorEgressCommandT(typeParsed: B): Frigate_Threat_Egress_Supervisor.EgressCommand.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.EgressCommand")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Frigate_Threat_Egress_Supervisor.EgressCommand.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Frigate_Threat_Egress_Supervisor.EgressCommand.")
          return Frigate_Threat_Egress_Supervisor.EgressCommand.byOrdinal(0).get
      }
    }

    def parseFrigate_Threat_Egress_SupervisorEgressCommand_Payload(): Frigate_Threat_Egress_Supervisor.EgressCommand_Payload = {
      val r = parseFrigate_Threat_Egress_SupervisorEgressCommand_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorEgressCommand_PayloadT(typeParsed: B): Frigate_Threat_Egress_Supervisor.EgressCommand_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.EgressCommand_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Egress_SupervisorEgressCommandType()
      parser.parseObjectNext()
      return Frigate_Threat_Egress_Supervisor.EgressCommand_Payload(value)
    }

    def parseFrigate_Threat_Egress_SupervisorResponseStatusType(): Frigate_Threat_Egress_Supervisor.ResponseStatus.Type = {
      val r = parseFrigate_Threat_Egress_SupervisorResponseStatusT(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorResponseStatusT(typeParsed: B): Frigate_Threat_Egress_Supervisor.ResponseStatus.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.ResponseStatus")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Frigate_Threat_Egress_Supervisor.ResponseStatus.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Frigate_Threat_Egress_Supervisor.ResponseStatus.")
          return Frigate_Threat_Egress_Supervisor.ResponseStatus.byOrdinal(0).get
      }
    }

    def parseFrigate_Threat_Egress_SupervisorResponseStatus_Payload(): Frigate_Threat_Egress_Supervisor.ResponseStatus_Payload = {
      val r = parseFrigate_Threat_Egress_SupervisorResponseStatus_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorResponseStatus_PayloadT(typeParsed: B): Frigate_Threat_Egress_Supervisor.ResponseStatus_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.ResponseStatus_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Egress_SupervisorResponseStatusType()
      parser.parseObjectNext()
      return Frigate_Threat_Egress_Supervisor.ResponseStatus_Payload(value)
    }

    def parseFrigate_Threat_Egress_SupervisorThreatObservation(): Frigate_Threat_Egress_Supervisor.ThreatObservation = {
      val r = parseFrigate_Threat_Egress_SupervisorThreatObservationT(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorThreatObservationT(typeParsed: B): Frigate_Threat_Egress_Supervisor.ThreatObservation = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.ThreatObservation")
      }
      parser.parseObjectKey("evidenceBand")
      val evidenceBand = parseFrigate_Threat_Egress_SupervisorEvidenceBandType()
      parser.parseObjectNext()
      parser.parseObjectKey("validity")
      val validity = parseFrigate_Threat_Egress_SupervisorObservationValidityType()
      parser.parseObjectNext()
      return Frigate_Threat_Egress_Supervisor.ThreatObservation(evidenceBand, validity)
    }

    def parseFrigate_Threat_Egress_SupervisorThreatObservation_Payload(): Frigate_Threat_Egress_Supervisor.ThreatObservation_Payload = {
      val r = parseFrigate_Threat_Egress_SupervisorThreatObservation_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorThreatObservation_PayloadT(typeParsed: B): Frigate_Threat_Egress_Supervisor.ThreatObservation_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.ThreatObservation_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Egress_SupervisorThreatObservation()
      parser.parseObjectNext()
      return Frigate_Threat_Egress_Supervisor.ThreatObservation_Payload(value)
    }

    def parseFrigate_Threat_Egress_SupervisorEpisodeSnapshot(): Frigate_Threat_Egress_Supervisor.EpisodeSnapshot = {
      val r = parseFrigate_Threat_Egress_SupervisorEpisodeSnapshotT(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorEpisodeSnapshotT(typeParsed: B): Frigate_Threat_Egress_Supervisor.EpisodeSnapshot = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.EpisodeSnapshot")
      }
      parser.parseObjectKey("preEpisode")
      val preEpisode = parseFrigate_Threat_Egress_SupervisorSnapshotPreEpisodeStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("nextEpisode")
      val nextEpisode = parseFrigate_Threat_Egress_SupervisorSnapshotNextEpisodeStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("assessment")
      val assessment = parseFrigate_Threat_Egress_SupervisorSnapshotEvidenceAssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("pilotDisposition")
      val pilotDisposition = parseFrigate_Threat_Egress_SupervisorSnapshotPilotDispositionType()
      parser.parseObjectNext()
      return Frigate_Threat_Egress_Supervisor.EpisodeSnapshot(preEpisode, nextEpisode, assessment, pilotDisposition)
    }

    def parseFrigate_Threat_Egress_SupervisorEpisodeSnapshot_Payload(): Frigate_Threat_Egress_Supervisor.EpisodeSnapshot_Payload = {
      val r = parseFrigate_Threat_Egress_SupervisorEpisodeSnapshot_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorEpisodeSnapshot_PayloadT(typeParsed: B): Frigate_Threat_Egress_Supervisor.EpisodeSnapshot_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.EpisodeSnapshot_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Egress_SupervisorEpisodeSnapshot()
      parser.parseObjectNext()
      return Frigate_Threat_Egress_Supervisor.EpisodeSnapshot_Payload(value)
    }

    def parseFrigate_Threat_Egress_SupervisorDefenseSupportObservation(): Frigate_Threat_Egress_Supervisor.DefenseSupportObservation = {
      val r = parseFrigate_Threat_Egress_SupervisorDefenseSupportObservationT(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorDefenseSupportObservationT(typeParsed: B): Frigate_Threat_Egress_Supervisor.DefenseSupportObservation = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.DefenseSupportObservation")
      }
      parser.parseObjectKey("defenseAvailability")
      val defenseAvailability = parseFrigate_Threat_Egress_SupervisorDefenseAvailabilityType()
      parser.parseObjectNext()
      parser.parseObjectKey("capacitorSupport")
      val capacitorSupport = parseFrigate_Threat_Egress_SupervisorCapacitorSupportType()
      parser.parseObjectNext()
      return Frigate_Threat_Egress_Supervisor.DefenseSupportObservation(defenseAvailability, capacitorSupport)
    }

    def parseFrigate_Threat_Egress_SupervisorDefenseSupportObservation_Payload(): Frigate_Threat_Egress_Supervisor.DefenseSupportObservation_Payload = {
      val r = parseFrigate_Threat_Egress_SupervisorDefenseSupportObservation_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorDefenseSupportObservation_PayloadT(typeParsed: B): Frigate_Threat_Egress_Supervisor.DefenseSupportObservation_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.DefenseSupportObservation_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Egress_SupervisorDefenseSupportObservation()
      parser.parseObjectNext()
      return Frigate_Threat_Egress_Supervisor.DefenseSupportObservation_Payload(value)
    }

    def parseFrigate_Threat_Egress_SupervisorResponseSnapshot(): Frigate_Threat_Egress_Supervisor.ResponseSnapshot = {
      val r = parseFrigate_Threat_Egress_SupervisorResponseSnapshotT(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorResponseSnapshotT(typeParsed: B): Frigate_Threat_Egress_Supervisor.ResponseSnapshot = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.ResponseSnapshot")
      }
      parser.parseObjectKey("preEgress")
      val preEgress = parseFrigate_Threat_Egress_SupervisorSnapshotPreEgressStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("nextEgress")
      val nextEgress = parseFrigate_Threat_Egress_SupervisorSnapshotNextEgressStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("directive")
      val directive = parseFrigate_Threat_Egress_SupervisorSnapshotResponseDirectiveType()
      parser.parseObjectNext()
      parser.parseObjectKey("defenseCommand")
      val defenseCommand = parseFrigate_Threat_Egress_SupervisorSnapshotDefenseCommandType()
      parser.parseObjectNext()
      parser.parseObjectKey("egressCommand")
      val egressCommand = parseFrigate_Threat_Egress_SupervisorSnapshotEgressCommandType()
      parser.parseObjectNext()
      return Frigate_Threat_Egress_Supervisor.ResponseSnapshot(preEgress, nextEgress, directive, defenseCommand, egressCommand)
    }

    def parseFrigate_Threat_Egress_SupervisorResponseSnapshot_Payload(): Frigate_Threat_Egress_Supervisor.ResponseSnapshot_Payload = {
      val r = parseFrigate_Threat_Egress_SupervisorResponseSnapshot_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorResponseSnapshot_PayloadT(typeParsed: B): Frigate_Threat_Egress_Supervisor.ResponseSnapshot_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.ResponseSnapshot_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Egress_SupervisorResponseSnapshot()
      parser.parseObjectNext()
      return Frigate_Threat_Egress_Supervisor.ResponseSnapshot_Payload(value)
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

    def parseFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container(): Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_P", "Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PS"))
      t.native match {
        case "Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_P" => val r = parseFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PT(T); return r
        case "Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PS" => val r = parseFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PST(T); return r
        case _ => val r = parseFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PST(T); return r
      }
    }

    def parseFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_P(): Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_P = {
      val r = parseFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PT(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PT(typeParsed: B): Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_P")
      }
      parser.parseObjectKey("api_threatObservation")
      val api_threatObservation = parseFrigate_Threat_Egress_SupervisorThreatObservation()
      parser.parseObjectNext()
      return Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_P(api_threatObservation)
    }

    def parseFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PS(): Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PS = {
      val r = parseFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PST(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PST(typeParsed: B): Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PS")
      }
      parser.parseObjectKey("api_threatObservation")
      val api_threatObservation = parseFrigate_Threat_Egress_SupervisorThreatObservation()
      parser.parseObjectNext()
      return Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PS(api_threatObservation)
    }

    def parseFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container(): Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_P", "Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PS"))
      t.native match {
        case "Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_P" => val r = parseFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PT(T); return r
        case "Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PS" => val r = parseFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PST(T); return r
        case _ => val r = parseFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PST(T); return r
      }
    }

    def parseFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_P(): Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_P = {
      val r = parseFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PT(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PT(typeParsed: B): Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_P")
      }
      parser.parseObjectKey("api_evidenceAssessment")
      val api_evidenceAssessment = parseFrigate_Threat_Egress_SupervisorEvidenceAssessmentType()
      parser.parseObjectNext()
      return Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_P(api_evidenceAssessment)
    }

    def parseFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PS(): Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PS = {
      val r = parseFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PST(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PST(typeParsed: B): Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PS")
      }
      parser.parseObjectKey("api_evidenceAssessment")
      val api_evidenceAssessment = parseFrigate_Threat_Egress_SupervisorEvidenceAssessmentType()
      parser.parseObjectNext()
      return Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PS(api_evidenceAssessment)
    }

    def parseFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container(): Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_P", "Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PS"))
      t.native match {
        case "Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_P" => val r = parseFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PT(T); return r
        case "Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PS" => val r = parseFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PST(T); return r
        case _ => val r = parseFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PST(T); return r
      }
    }

    def parseFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_P(): Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_P = {
      val r = parseFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PT(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PT(typeParsed: B): Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_P")
      }
      parser.parseObjectKey("api_evidenceAssessment")
      val api_evidenceAssessment = parseFrigate_Threat_Egress_SupervisorEvidenceAssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_pilotDisposition")
      val api_pilotDisposition = parseFrigate_Threat_Egress_SupervisorPilotDispositionType()
      parser.parseObjectNext()
      return Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_P(api_evidenceAssessment, api_pilotDisposition)
    }

    def parseFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PS(): Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PS = {
      val r = parseFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PST(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PST(typeParsed: B): Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PS")
      }
      parser.parseObjectKey("api_evidenceAssessment")
      val api_evidenceAssessment = parseFrigate_Threat_Egress_SupervisorEvidenceAssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_pilotDisposition")
      val api_pilotDisposition = parseFrigate_Threat_Egress_SupervisorPilotDispositionType()
      parser.parseObjectNext()
      return Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PS(api_evidenceAssessment, api_pilotDisposition)
    }

    def parseFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container(): Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_P", "Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PS"))
      t.native match {
        case "Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_P" => val r = parseFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PT(T); return r
        case "Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PS" => val r = parseFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PST(T); return r
        case _ => val r = parseFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PST(T); return r
      }
    }

    def parseFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_P(): Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_P = {
      val r = parseFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PT(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PT(typeParsed: B): Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_P")
      }
      parser.parseObjectKey("api_episodeSnapshot")
      val api_episodeSnapshot = parseFrigate_Threat_Egress_SupervisorEpisodeSnapshot()
      parser.parseObjectNext()
      return Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_P(api_episodeSnapshot)
    }

    def parseFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PS(): Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PS = {
      val r = parseFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PST(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PST(typeParsed: B): Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PS")
      }
      parser.parseObjectKey("api_episodeSnapshot")
      val api_episodeSnapshot = parseFrigate_Threat_Egress_SupervisorEpisodeSnapshot()
      parser.parseObjectNext()
      return Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PS(api_episodeSnapshot)
    }

    def parseFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container(): Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_P", "Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PS"))
      t.native match {
        case "Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_P" => val r = parseFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PT(T); return r
        case "Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PS" => val r = parseFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PST(T); return r
        case _ => val r = parseFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PST(T); return r
      }
    }

    def parseFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_P(): Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_P = {
      val r = parseFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PT(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PT(typeParsed: B): Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_P")
      }
      parser.parseObjectKey("api_episodeSnapshot")
      val api_episodeSnapshot = parseFrigate_Threat_Egress_SupervisorEpisodeSnapshot()
      parser.parseObjectNext()
      return Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_P(api_episodeSnapshot)
    }

    def parseFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PS(): Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PS = {
      val r = parseFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PST(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PST(typeParsed: B): Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PS")
      }
      parser.parseObjectKey("api_episodeSnapshot")
      val api_episodeSnapshot = parseFrigate_Threat_Egress_SupervisorEpisodeSnapshot()
      parser.parseObjectNext()
      return Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PS(api_episodeSnapshot)
    }

    def parseFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container(): Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_P", "Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PS"))
      t.native match {
        case "Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_P" => val r = parseFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PT(T); return r
        case "Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PS" => val r = parseFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PST(T); return r
        case _ => val r = parseFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PST(T); return r
      }
    }

    def parseFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_P(): Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_P = {
      val r = parseFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PT(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PT(typeParsed: B): Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_P")
      }
      parser.parseObjectKey("api_threatReport")
      val api_threatReport = parseFrigate_Threat_Egress_SupervisorThreatReportType()
      parser.parseObjectNext()
      return Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_P(api_threatReport)
    }

    def parseFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PS(): Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PS = {
      val r = parseFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PST(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PST(typeParsed: B): Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PS")
      }
      parser.parseObjectKey("api_threatReport")
      val api_threatReport = parseFrigate_Threat_Egress_SupervisorThreatReportType()
      parser.parseObjectNext()
      return Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PS(api_threatReport)
    }

    def parseFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container(): Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_P", "Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PS"))
      t.native match {
        case "Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_P" => val r = parseFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PT(T); return r
        case "Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PS" => val r = parseFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PST(T); return r
        case _ => val r = parseFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PST(T); return r
      }
    }

    def parseFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_P(): Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_P = {
      val r = parseFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PT(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PT(typeParsed: B): Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_P")
      }
      parser.parseObjectKey("api_defenseSupport")
      val api_defenseSupport = parseFrigate_Threat_Egress_SupervisorDefenseSupportObservation()
      parser.parseObjectNext()
      parser.parseObjectKey("api_evidenceAssessment")
      val api_evidenceAssessment = parseFrigate_Threat_Egress_SupervisorEvidenceAssessmentType()
      parser.parseObjectNext()
      return Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_P(api_defenseSupport, api_evidenceAssessment)
    }

    def parseFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PS(): Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PS = {
      val r = parseFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PST(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PST(typeParsed: B): Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PS")
      }
      parser.parseObjectKey("api_defenseSupport")
      val api_defenseSupport = parseFrigate_Threat_Egress_SupervisorDefenseSupportObservation()
      parser.parseObjectNext()
      parser.parseObjectKey("api_evidenceAssessment")
      val api_evidenceAssessment = parseFrigate_Threat_Egress_SupervisorEvidenceAssessmentType()
      parser.parseObjectNext()
      return Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PS(api_defenseSupport, api_evidenceAssessment)
    }

    def parseFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container(): Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_P", "Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PS"))
      t.native match {
        case "Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_P" => val r = parseFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PT(T); return r
        case "Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PS" => val r = parseFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PST(T); return r
        case _ => val r = parseFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PST(T); return r
      }
    }

    def parseFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_P(): Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_P = {
      val r = parseFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PT(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PT(typeParsed: B): Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_P")
      }
      parser.parseObjectKey("api_defenseQualification")
      val api_defenseQualification = parseFrigate_Threat_Egress_SupervisorDefenseQualificationType()
      parser.parseObjectNext()
      return Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_P(api_defenseQualification)
    }

    def parseFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PS(): Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PS = {
      val r = parseFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PST(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PST(typeParsed: B): Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PS")
      }
      parser.parseObjectKey("api_defenseQualification")
      val api_defenseQualification = parseFrigate_Threat_Egress_SupervisorDefenseQualificationType()
      parser.parseObjectNext()
      return Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PS(api_defenseQualification)
    }

    def parseFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container(): Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_P", "Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PS"))
      t.native match {
        case "Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_P" => val r = parseFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PT(T); return r
        case "Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PS" => val r = parseFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PST(T); return r
        case _ => val r = parseFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PST(T); return r
      }
    }

    def parseFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_P(): Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_P = {
      val r = parseFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PT(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PT(typeParsed: B): Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_P")
      }
      parser.parseObjectKey("api_egressRoute")
      val api_egressRoute = parseFrigate_Threat_Egress_SupervisorEgressRouteObservationType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_evidenceAssessment")
      val api_evidenceAssessment = parseFrigate_Threat_Egress_SupervisorEvidenceAssessmentType()
      parser.parseObjectNext()
      return Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_P(api_egressRoute, api_evidenceAssessment)
    }

    def parseFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PS(): Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PS = {
      val r = parseFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PST(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PST(typeParsed: B): Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PS")
      }
      parser.parseObjectKey("api_egressRoute")
      val api_egressRoute = parseFrigate_Threat_Egress_SupervisorEgressRouteObservationType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_evidenceAssessment")
      val api_evidenceAssessment = parseFrigate_Threat_Egress_SupervisorEvidenceAssessmentType()
      parser.parseObjectNext()
      return Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PS(api_egressRoute, api_evidenceAssessment)
    }

    def parseFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container(): Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_P", "Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PS"))
      t.native match {
        case "Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_P" => val r = parseFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PT(T); return r
        case "Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PS" => val r = parseFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PST(T); return r
        case _ => val r = parseFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PST(T); return r
      }
    }

    def parseFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_P(): Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_P = {
      val r = parseFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PT(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PT(typeParsed: B): Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_P")
      }
      parser.parseObjectKey("api_egressQualification")
      val api_egressQualification = parseFrigate_Threat_Egress_SupervisorEgressQualificationType()
      parser.parseObjectNext()
      return Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_P(api_egressQualification)
    }

    def parseFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PS(): Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PS = {
      val r = parseFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PST(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PST(typeParsed: B): Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PS")
      }
      parser.parseObjectKey("api_egressQualification")
      val api_egressQualification = parseFrigate_Threat_Egress_SupervisorEgressQualificationType()
      parser.parseObjectNext()
      return Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PS(api_egressQualification)
    }

    def parseFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container(): Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_P", "Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PS"))
      t.native match {
        case "Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_P" => val r = parseFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PT(T); return r
        case "Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PS" => val r = parseFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PST(T); return r
        case _ => val r = parseFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PST(T); return r
      }
    }

    def parseFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_P(): Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_P = {
      val r = parseFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PT(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PT(typeParsed: B): Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_P")
      }
      parser.parseObjectKey("api_defenseQualification")
      val api_defenseQualification = parseFrigate_Threat_Egress_SupervisorDefenseQualificationType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_egressQualification")
      val api_egressQualification = parseFrigate_Threat_Egress_SupervisorEgressQualificationType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_episodeSnapshot")
      val api_episodeSnapshot = parseFrigate_Threat_Egress_SupervisorEpisodeSnapshot()
      parser.parseObjectNext()
      parser.parseObjectKey("api_responseAuthorization")
      val api_responseAuthorization = parseFrigate_Threat_Egress_SupervisorResponseAuthorizationType()
      parser.parseObjectNext()
      return Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_P(api_defenseQualification, api_egressQualification, api_episodeSnapshot, api_responseAuthorization)
    }

    def parseFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PS(): Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PS = {
      val r = parseFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PST(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PST(typeParsed: B): Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PS")
      }
      parser.parseObjectKey("api_defenseQualification")
      val api_defenseQualification = parseFrigate_Threat_Egress_SupervisorDefenseQualificationType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_egressQualification")
      val api_egressQualification = parseFrigate_Threat_Egress_SupervisorEgressQualificationType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_episodeSnapshot")
      val api_episodeSnapshot = parseFrigate_Threat_Egress_SupervisorEpisodeSnapshot()
      parser.parseObjectNext()
      parser.parseObjectKey("api_responseAuthorization")
      val api_responseAuthorization = parseFrigate_Threat_Egress_SupervisorResponseAuthorizationType()
      parser.parseObjectNext()
      return Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PS(api_defenseQualification, api_egressQualification, api_episodeSnapshot, api_responseAuthorization)
    }

    def parseFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container(): Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_P", "Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PS"))
      t.native match {
        case "Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_P" => val r = parseFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PT(T); return r
        case "Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PS" => val r = parseFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PST(T); return r
        case _ => val r = parseFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PST(T); return r
      }
    }

    def parseFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_P(): Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_P = {
      val r = parseFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PT(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PT(typeParsed: B): Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_P")
      }
      parser.parseObjectKey("api_responseDirective")
      val api_responseDirective = parseFrigate_Threat_Egress_SupervisorResponseDirectiveType()
      parser.parseObjectNext()
      return Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_P(api_responseDirective)
    }

    def parseFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PS(): Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PS = {
      val r = parseFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PST(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PST(typeParsed: B): Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PS")
      }
      parser.parseObjectKey("api_responseDirective")
      val api_responseDirective = parseFrigate_Threat_Egress_SupervisorResponseDirectiveType()
      parser.parseObjectNext()
      return Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PS(api_responseDirective)
    }

    def parseFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container(): Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PreState_Container_P", "Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PS"))
      t.native match {
        case "Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PreState_Container_P" => val r = parseFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PT(T); return r
        case "Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PS" => val r = parseFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PST(T); return r
        case _ => val r = parseFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PST(T); return r
      }
    }

    def parseFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_P(): Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PreState_Container_P = {
      val r = parseFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PT(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PT(typeParsed: B): Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PreState_Container_P")
      }
      parser.parseObjectKey("api_egressProgress")
      val api_egressProgress = parseFrigate_Threat_Egress_SupervisorEgressProgressType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_responseDirective")
      val api_responseDirective = parseFrigate_Threat_Egress_SupervisorResponseDirectiveType()
      parser.parseObjectNext()
      return Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PreState_Container_P(api_egressProgress, api_responseDirective)
    }

    def parseFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PS(): Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PS = {
      val r = parseFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PST(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PST(typeParsed: B): Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PS")
      }
      parser.parseObjectKey("api_egressProgress")
      val api_egressProgress = parseFrigate_Threat_Egress_SupervisorEgressProgressType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_responseDirective")
      val api_responseDirective = parseFrigate_Threat_Egress_SupervisorResponseDirectiveType()
      parser.parseObjectNext()
      return Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PS(api_egressProgress, api_responseDirective)
    }

    def parseFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container(): Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PostState_Container_P", "Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PS"))
      t.native match {
        case "Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PostState_Container_P" => val r = parseFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PT(T); return r
        case "Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PS" => val r = parseFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PST(T); return r
        case _ => val r = parseFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PST(T); return r
      }
    }

    def parseFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_P(): Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PostState_Container_P = {
      val r = parseFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PT(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PT(typeParsed: B): Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PostState_Container_P")
      }
      parser.parseObjectKey("api_defenseCommand")
      val api_defenseCommand = parseFrigate_Threat_Egress_SupervisorDefenseCommandType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_egressCommand")
      val api_egressCommand = parseFrigate_Threat_Egress_SupervisorEgressCommandType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_responseSnapshot")
      val api_responseSnapshot = parseFrigate_Threat_Egress_SupervisorResponseSnapshot()
      parser.parseObjectNext()
      return Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PostState_Container_P(api_defenseCommand, api_egressCommand, api_responseSnapshot)
    }

    def parseFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PS(): Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PS = {
      val r = parseFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PST(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PST(typeParsed: B): Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PS")
      }
      parser.parseObjectKey("api_defenseCommand")
      val api_defenseCommand = parseFrigate_Threat_Egress_SupervisorDefenseCommandType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_egressCommand")
      val api_egressCommand = parseFrigate_Threat_Egress_SupervisorEgressCommandType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_responseSnapshot")
      val api_responseSnapshot = parseFrigate_Threat_Egress_SupervisorResponseSnapshot()
      parser.parseObjectNext()
      return Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PS(api_defenseCommand, api_egressCommand, api_responseSnapshot)
    }

    def parseFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container(): Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_P", "Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PS"))
      t.native match {
        case "Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_P" => val r = parseFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PT(T); return r
        case "Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PS" => val r = parseFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PST(T); return r
        case _ => val r = parseFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PST(T); return r
      }
    }

    def parseFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_P(): Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_P = {
      val r = parseFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PT(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PT(typeParsed: B): Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_P")
      }
      parser.parseObjectKey("api_episodeSnapshot")
      val api_episodeSnapshot = parseFrigate_Threat_Egress_SupervisorEpisodeSnapshot()
      parser.parseObjectNext()
      parser.parseObjectKey("api_responseSnapshot")
      val api_responseSnapshot = parseFrigate_Threat_Egress_SupervisorResponseSnapshot()
      parser.parseObjectNext()
      return Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_P(api_episodeSnapshot, api_responseSnapshot)
    }

    def parseFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PS(): Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PS = {
      val r = parseFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PST(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PST(typeParsed: B): Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PS")
      }
      parser.parseObjectKey("api_episodeSnapshot")
      val api_episodeSnapshot = parseFrigate_Threat_Egress_SupervisorEpisodeSnapshot()
      parser.parseObjectNext()
      parser.parseObjectKey("api_responseSnapshot")
      val api_responseSnapshot = parseFrigate_Threat_Egress_SupervisorResponseSnapshot()
      parser.parseObjectNext()
      return Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PS(api_episodeSnapshot, api_responseSnapshot)
    }

    def parseFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container(): Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_P", "Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PS"))
      t.native match {
        case "Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_P" => val r = parseFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PT(T); return r
        case "Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PS" => val r = parseFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PST(T); return r
        case _ => val r = parseFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PST(T); return r
      }
    }

    def parseFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_P(): Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_P = {
      val r = parseFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PT(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PT(typeParsed: B): Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_P")
      }
      parser.parseObjectKey("api_responseStatus")
      val api_responseStatus = parseFrigate_Threat_Egress_SupervisorResponseStatusType()
      parser.parseObjectNext()
      return Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_P(api_responseStatus)
    }

    def parseFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PS(): Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PS = {
      val r = parseFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PST(F)
      return r
    }

    def parseFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PST(typeParsed: B): Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PS")
      }
      parser.parseObjectKey("api_responseStatus")
      val api_responseStatus = parseFrigate_Threat_Egress_SupervisorResponseStatusType()
      parser.parseObjectNext()
      return Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PS(api_responseStatus)
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
      val t = parser.parseObjectTypes(ISZ("util.EmptyContainer", "Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_P", "Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PS", "Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_P", "Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PS", "Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_P", "Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PS", "Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_P", "Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PS", "Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_P", "Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PS", "Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_P", "Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PS", "Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_P", "Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PS", "Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_P", "Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PS", "Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_P", "Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PreState_Container_P", "Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PS", "Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PS", "Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_P", "Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PS", "Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PostState_Container_P", "Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PS", "Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_P", "Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PS", "Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_P", "Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PS", "Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_P", "Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PS", "Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_P", "Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PS"))
      t.native match {
        case "util.EmptyContainer" => val r = parseutilEmptyContainerT(T); return r
        case "Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_P" => val r = parseFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PT(T); return r
        case "Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PS" => val r = parseFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PST(T); return r
        case "Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_P" => val r = parseFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PT(T); return r
        case "Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PS" => val r = parseFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PST(T); return r
        case "Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_P" => val r = parseFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PT(T); return r
        case "Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PS" => val r = parseFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PST(T); return r
        case "Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_P" => val r = parseFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PT(T); return r
        case "Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PS" => val r = parseFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PST(T); return r
        case "Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_P" => val r = parseFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PT(T); return r
        case "Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PS" => val r = parseFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PST(T); return r
        case "Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_P" => val r = parseFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PT(T); return r
        case "Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PS" => val r = parseFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PST(T); return r
        case "Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_P" => val r = parseFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PT(T); return r
        case "Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PS" => val r = parseFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PST(T); return r
        case "Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_P" => val r = parseFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PT(T); return r
        case "Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PS" => val r = parseFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PST(T); return r
        case "Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_P" => val r = parseFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PT(T); return r
        case "Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PreState_Container_P" => val r = parseFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PT(T); return r
        case "Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PS" => val r = parseFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PST(T); return r
        case "Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PS" => val r = parseFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PST(T); return r
        case "Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_P" => val r = parseFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PT(T); return r
        case "Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PS" => val r = parseFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PST(T); return r
        case "Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PostState_Container_P" => val r = parseFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PT(T); return r
        case "Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PS" => val r = parseFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PST(T); return r
        case "Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_P" => val r = parseFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PT(T); return r
        case "Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PS" => val r = parseFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PST(T); return r
        case "Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_P" => val r = parseFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PT(T); return r
        case "Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PS" => val r = parseFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PST(T); return r
        case "Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_P" => val r = parseFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PT(T); return r
        case "Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PS" => val r = parseFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PST(T); return r
        case "Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_P" => val r = parseFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PT(T); return r
        case "Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PS" => val r = parseFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PST(T); return r
        case _ => val r = parseFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PST(T); return r
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
      val t = parser.parseObjectTypes(ISZ("art.Empty", "Base_Types.Boolean_Payload", "Base_Types.Integer_Payload", "Base_Types.Integer_8_Payload", "Base_Types.Integer_16_Payload", "Base_Types.Integer_32_Payload", "Base_Types.Integer_64_Payload", "Base_Types.Unsigned_8_Payload", "Base_Types.Unsigned_16_Payload", "Base_Types.Unsigned_32_Payload", "Base_Types.Unsigned_64_Payload", "Base_Types.Float_Payload", "Base_Types.Float_32_Payload", "Base_Types.Float_64_Payload", "Base_Types.Character_Payload", "Base_Types.String_Payload", "Base_Types.Bits_Payload", "util.EmptyContainer", "Frigate_Threat_Egress_Supervisor.EvidenceBand_Payload", "Frigate_Threat_Egress_Supervisor.ThreatReport_Payload", "Frigate_Threat_Egress_Supervisor.EgressCommand_Payload", "Frigate_Threat_Egress_Supervisor.DefenseCommand_Payload", "Frigate_Threat_Egress_Supervisor.EgressProgress_Payload", "Frigate_Threat_Egress_Supervisor.ResponseStatus_Payload", "Frigate_Threat_Egress_Supervisor.EpisodeSnapshot_Payload", "Frigate_Threat_Egress_Supervisor.CapacitorSupport_Payload", "Frigate_Threat_Egress_Supervisor.PilotDisposition_Payload", "Frigate_Threat_Egress_Supervisor.ResponseSnapshot_Payload", "Frigate_Threat_Egress_Supervisor.ResponseDirective_Payload", "Frigate_Threat_Egress_Supervisor.ThreatObservation_Payload", "Frigate_Threat_Egress_Supervisor.EvidenceAssessment_Payload", "Frigate_Threat_Egress_Supervisor.ObservationValidity_Payload", "Frigate_Threat_Egress_Supervisor.DefenseAvailability_Payload", "Frigate_Threat_Egress_Supervisor.EgressQualification_Payload", "Frigate_Threat_Egress_Supervisor.DefenseQualification_Payload", "Frigate_Threat_Egress_Supervisor.SnapshotEgressCommand_Payload", "Frigate_Threat_Egress_Supervisor.ResponseAuthorization_Payload", "Frigate_Threat_Egress_Supervisor.SnapshotDefenseCommand_Payload", "Frigate_Threat_Egress_Supervisor.EgressRouteObservation_Payload", "Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState_Payload", "Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState_Payload", "Frigate_Threat_Egress_Supervisor.SnapshotNextEgressState_Payload", "Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState_Payload", "Frigate_Threat_Egress_Supervisor.SnapshotPilotDisposition_Payload", "Frigate_Threat_Egress_Supervisor.SnapshotResponseDirective_Payload", "Frigate_Threat_Egress_Supervisor.DefenseSupportObservation_Payload", "Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment_Payload", "Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_P", "Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PS", "Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_P", "Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PS", "Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_P", "Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PS", "Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_P", "Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PS", "Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_P", "Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PS", "Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_P", "Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PS", "Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_P", "Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PS", "Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_P", "Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PS", "Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_P", "Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PreState_Container_P", "Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PS", "Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PS", "Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_P", "Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PS", "Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PostState_Container_P", "Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PS", "Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_P", "Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PS", "Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_P", "Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PS", "Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_P", "Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PS", "Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_P", "Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PS"))
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
        case "Frigate_Threat_Egress_Supervisor.EvidenceBand_Payload" => val r = parseFrigate_Threat_Egress_SupervisorEvidenceBand_PayloadT(T); return r
        case "Frigate_Threat_Egress_Supervisor.ThreatReport_Payload" => val r = parseFrigate_Threat_Egress_SupervisorThreatReport_PayloadT(T); return r
        case "Frigate_Threat_Egress_Supervisor.EgressCommand_Payload" => val r = parseFrigate_Threat_Egress_SupervisorEgressCommand_PayloadT(T); return r
        case "Frigate_Threat_Egress_Supervisor.DefenseCommand_Payload" => val r = parseFrigate_Threat_Egress_SupervisorDefenseCommand_PayloadT(T); return r
        case "Frigate_Threat_Egress_Supervisor.EgressProgress_Payload" => val r = parseFrigate_Threat_Egress_SupervisorEgressProgress_PayloadT(T); return r
        case "Frigate_Threat_Egress_Supervisor.ResponseStatus_Payload" => val r = parseFrigate_Threat_Egress_SupervisorResponseStatus_PayloadT(T); return r
        case "Frigate_Threat_Egress_Supervisor.EpisodeSnapshot_Payload" => val r = parseFrigate_Threat_Egress_SupervisorEpisodeSnapshot_PayloadT(T); return r
        case "Frigate_Threat_Egress_Supervisor.CapacitorSupport_Payload" => val r = parseFrigate_Threat_Egress_SupervisorCapacitorSupport_PayloadT(T); return r
        case "Frigate_Threat_Egress_Supervisor.PilotDisposition_Payload" => val r = parseFrigate_Threat_Egress_SupervisorPilotDisposition_PayloadT(T); return r
        case "Frigate_Threat_Egress_Supervisor.ResponseSnapshot_Payload" => val r = parseFrigate_Threat_Egress_SupervisorResponseSnapshot_PayloadT(T); return r
        case "Frigate_Threat_Egress_Supervisor.ResponseDirective_Payload" => val r = parseFrigate_Threat_Egress_SupervisorResponseDirective_PayloadT(T); return r
        case "Frigate_Threat_Egress_Supervisor.ThreatObservation_Payload" => val r = parseFrigate_Threat_Egress_SupervisorThreatObservation_PayloadT(T); return r
        case "Frigate_Threat_Egress_Supervisor.EvidenceAssessment_Payload" => val r = parseFrigate_Threat_Egress_SupervisorEvidenceAssessment_PayloadT(T); return r
        case "Frigate_Threat_Egress_Supervisor.ObservationValidity_Payload" => val r = parseFrigate_Threat_Egress_SupervisorObservationValidity_PayloadT(T); return r
        case "Frigate_Threat_Egress_Supervisor.DefenseAvailability_Payload" => val r = parseFrigate_Threat_Egress_SupervisorDefenseAvailability_PayloadT(T); return r
        case "Frigate_Threat_Egress_Supervisor.EgressQualification_Payload" => val r = parseFrigate_Threat_Egress_SupervisorEgressQualification_PayloadT(T); return r
        case "Frigate_Threat_Egress_Supervisor.DefenseQualification_Payload" => val r = parseFrigate_Threat_Egress_SupervisorDefenseQualification_PayloadT(T); return r
        case "Frigate_Threat_Egress_Supervisor.SnapshotEgressCommand_Payload" => val r = parseFrigate_Threat_Egress_SupervisorSnapshotEgressCommand_PayloadT(T); return r
        case "Frigate_Threat_Egress_Supervisor.ResponseAuthorization_Payload" => val r = parseFrigate_Threat_Egress_SupervisorResponseAuthorization_PayloadT(T); return r
        case "Frigate_Threat_Egress_Supervisor.SnapshotDefenseCommand_Payload" => val r = parseFrigate_Threat_Egress_SupervisorSnapshotDefenseCommand_PayloadT(T); return r
        case "Frigate_Threat_Egress_Supervisor.EgressRouteObservation_Payload" => val r = parseFrigate_Threat_Egress_SupervisorEgressRouteObservation_PayloadT(T); return r
        case "Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState_Payload" => val r = parseFrigate_Threat_Egress_SupervisorSnapshotPreEgressState_PayloadT(T); return r
        case "Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState_Payload" => val r = parseFrigate_Threat_Egress_SupervisorSnapshotPreEpisodeState_PayloadT(T); return r
        case "Frigate_Threat_Egress_Supervisor.SnapshotNextEgressState_Payload" => val r = parseFrigate_Threat_Egress_SupervisorSnapshotNextEgressState_PayloadT(T); return r
        case "Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState_Payload" => val r = parseFrigate_Threat_Egress_SupervisorSnapshotNextEpisodeState_PayloadT(T); return r
        case "Frigate_Threat_Egress_Supervisor.SnapshotPilotDisposition_Payload" => val r = parseFrigate_Threat_Egress_SupervisorSnapshotPilotDisposition_PayloadT(T); return r
        case "Frigate_Threat_Egress_Supervisor.SnapshotResponseDirective_Payload" => val r = parseFrigate_Threat_Egress_SupervisorSnapshotResponseDirective_PayloadT(T); return r
        case "Frigate_Threat_Egress_Supervisor.DefenseSupportObservation_Payload" => val r = parseFrigate_Threat_Egress_SupervisorDefenseSupportObservation_PayloadT(T); return r
        case "Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment_Payload" => val r = parseFrigate_Threat_Egress_SupervisorSnapshotEvidenceAssessment_PayloadT(T); return r
        case "Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_P" => val r = parseFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PT(T); return r
        case "Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PS" => val r = parseFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PST(T); return r
        case "Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_P" => val r = parseFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PT(T); return r
        case "Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PS" => val r = parseFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PST(T); return r
        case "Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_P" => val r = parseFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PT(T); return r
        case "Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PS" => val r = parseFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PST(T); return r
        case "Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_P" => val r = parseFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PT(T); return r
        case "Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PS" => val r = parseFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PST(T); return r
        case "Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_P" => val r = parseFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PT(T); return r
        case "Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PS" => val r = parseFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PST(T); return r
        case "Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_P" => val r = parseFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PT(T); return r
        case "Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PS" => val r = parseFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PST(T); return r
        case "Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_P" => val r = parseFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PT(T); return r
        case "Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PS" => val r = parseFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PST(T); return r
        case "Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_P" => val r = parseFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PT(T); return r
        case "Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PS" => val r = parseFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PST(T); return r
        case "Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_P" => val r = parseFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PT(T); return r
        case "Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PreState_Container_P" => val r = parseFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PT(T); return r
        case "Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PS" => val r = parseFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PST(T); return r
        case "Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PS" => val r = parseFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PST(T); return r
        case "Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_P" => val r = parseFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PT(T); return r
        case "Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PS" => val r = parseFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PST(T); return r
        case "Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PostState_Container_P" => val r = parseFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PT(T); return r
        case "Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PS" => val r = parseFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PST(T); return r
        case "Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_P" => val r = parseFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PT(T); return r
        case "Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PS" => val r = parseFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PST(T); return r
        case "Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_P" => val r = parseFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PT(T); return r
        case "Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PS" => val r = parseFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PST(T); return r
        case "Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_P" => val r = parseFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PT(T); return r
        case "Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PS" => val r = parseFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PST(T); return r
        case "Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_P" => val r = parseFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PT(T); return r
        case "Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PS" => val r = parseFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PST(T); return r
        case _ => val r = parseFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PST(T); return r
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

  def fromFrigate_Threat_Egress_SupervisorEvidenceBand_Payload(o: Frigate_Threat_Egress_Supervisor.EvidenceBand_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorEvidenceBand_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorEvidenceBand_Payload(s: String): Either[Frigate_Threat_Egress_Supervisor.EvidenceBand_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorEvidenceBand_Payload(parser: Parser): Frigate_Threat_Egress_Supervisor.EvidenceBand_Payload = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorEvidenceBand_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorEvidenceBand_Payload _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorObservationValidity_Payload(o: Frigate_Threat_Egress_Supervisor.ObservationValidity_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorObservationValidity_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorObservationValidity_Payload(s: String): Either[Frigate_Threat_Egress_Supervisor.ObservationValidity_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorObservationValidity_Payload(parser: Parser): Frigate_Threat_Egress_Supervisor.ObservationValidity_Payload = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorObservationValidity_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorObservationValidity_Payload _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorEvidenceAssessment_Payload(o: Frigate_Threat_Egress_Supervisor.EvidenceAssessment_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorEvidenceAssessment_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorEvidenceAssessment_Payload(s: String): Either[Frigate_Threat_Egress_Supervisor.EvidenceAssessment_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorEvidenceAssessment_Payload(parser: Parser): Frigate_Threat_Egress_Supervisor.EvidenceAssessment_Payload = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorEvidenceAssessment_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorEvidenceAssessment_Payload _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorPilotDisposition_Payload(o: Frigate_Threat_Egress_Supervisor.PilotDisposition_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorPilotDisposition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorPilotDisposition_Payload(s: String): Either[Frigate_Threat_Egress_Supervisor.PilotDisposition_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorPilotDisposition_Payload(parser: Parser): Frigate_Threat_Egress_Supervisor.PilotDisposition_Payload = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorPilotDisposition_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorPilotDisposition_Payload _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorSnapshotPreEpisodeState_Payload(o: Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorSnapshotPreEpisodeState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorSnapshotPreEpisodeState_Payload(s: String): Either[Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorSnapshotPreEpisodeState_Payload(parser: Parser): Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState_Payload = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorSnapshotPreEpisodeState_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorSnapshotPreEpisodeState_Payload _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorSnapshotNextEpisodeState_Payload(o: Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorSnapshotNextEpisodeState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorSnapshotNextEpisodeState_Payload(s: String): Either[Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorSnapshotNextEpisodeState_Payload(parser: Parser): Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState_Payload = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorSnapshotNextEpisodeState_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorSnapshotNextEpisodeState_Payload _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorSnapshotEvidenceAssessment_Payload(o: Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorSnapshotEvidenceAssessment_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorSnapshotEvidenceAssessment_Payload(s: String): Either[Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorSnapshotEvidenceAssessment_Payload(parser: Parser): Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment_Payload = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorSnapshotEvidenceAssessment_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorSnapshotEvidenceAssessment_Payload _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorSnapshotPilotDisposition_Payload(o: Frigate_Threat_Egress_Supervisor.SnapshotPilotDisposition_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorSnapshotPilotDisposition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorSnapshotPilotDisposition_Payload(s: String): Either[Frigate_Threat_Egress_Supervisor.SnapshotPilotDisposition_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorSnapshotPilotDisposition_Payload(parser: Parser): Frigate_Threat_Egress_Supervisor.SnapshotPilotDisposition_Payload = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorSnapshotPilotDisposition_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorSnapshotPilotDisposition_Payload _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorThreatReport_Payload(o: Frigate_Threat_Egress_Supervisor.ThreatReport_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorThreatReport_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorThreatReport_Payload(s: String): Either[Frigate_Threat_Egress_Supervisor.ThreatReport_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorThreatReport_Payload(parser: Parser): Frigate_Threat_Egress_Supervisor.ThreatReport_Payload = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorThreatReport_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorThreatReport_Payload _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorDefenseAvailability_Payload(o: Frigate_Threat_Egress_Supervisor.DefenseAvailability_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorDefenseAvailability_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorDefenseAvailability_Payload(s: String): Either[Frigate_Threat_Egress_Supervisor.DefenseAvailability_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorDefenseAvailability_Payload(parser: Parser): Frigate_Threat_Egress_Supervisor.DefenseAvailability_Payload = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorDefenseAvailability_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorDefenseAvailability_Payload _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorCapacitorSupport_Payload(o: Frigate_Threat_Egress_Supervisor.CapacitorSupport_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorCapacitorSupport_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorCapacitorSupport_Payload(s: String): Either[Frigate_Threat_Egress_Supervisor.CapacitorSupport_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorCapacitorSupport_Payload(parser: Parser): Frigate_Threat_Egress_Supervisor.CapacitorSupport_Payload = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorCapacitorSupport_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorCapacitorSupport_Payload _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorDefenseQualification_Payload(o: Frigate_Threat_Egress_Supervisor.DefenseQualification_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorDefenseQualification_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorDefenseQualification_Payload(s: String): Either[Frigate_Threat_Egress_Supervisor.DefenseQualification_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorDefenseQualification_Payload(parser: Parser): Frigate_Threat_Egress_Supervisor.DefenseQualification_Payload = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorDefenseQualification_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorDefenseQualification_Payload _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorEgressRouteObservation_Payload(o: Frigate_Threat_Egress_Supervisor.EgressRouteObservation_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorEgressRouteObservation_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorEgressRouteObservation_Payload(s: String): Either[Frigate_Threat_Egress_Supervisor.EgressRouteObservation_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorEgressRouteObservation_Payload(parser: Parser): Frigate_Threat_Egress_Supervisor.EgressRouteObservation_Payload = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorEgressRouteObservation_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorEgressRouteObservation_Payload _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorEgressQualification_Payload(o: Frigate_Threat_Egress_Supervisor.EgressQualification_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorEgressQualification_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorEgressQualification_Payload(s: String): Either[Frigate_Threat_Egress_Supervisor.EgressQualification_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorEgressQualification_Payload(parser: Parser): Frigate_Threat_Egress_Supervisor.EgressQualification_Payload = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorEgressQualification_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorEgressQualification_Payload _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorResponseAuthorization_Payload(o: Frigate_Threat_Egress_Supervisor.ResponseAuthorization_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorResponseAuthorization_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorResponseAuthorization_Payload(s: String): Either[Frigate_Threat_Egress_Supervisor.ResponseAuthorization_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorResponseAuthorization_Payload(parser: Parser): Frigate_Threat_Egress_Supervisor.ResponseAuthorization_Payload = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorResponseAuthorization_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorResponseAuthorization_Payload _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorResponseDirective_Payload(o: Frigate_Threat_Egress_Supervisor.ResponseDirective_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorResponseDirective_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorResponseDirective_Payload(s: String): Either[Frigate_Threat_Egress_Supervisor.ResponseDirective_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorResponseDirective_Payload(parser: Parser): Frigate_Threat_Egress_Supervisor.ResponseDirective_Payload = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorResponseDirective_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorResponseDirective_Payload _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorEgressProgress_Payload(o: Frigate_Threat_Egress_Supervisor.EgressProgress_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorEgressProgress_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorEgressProgress_Payload(s: String): Either[Frigate_Threat_Egress_Supervisor.EgressProgress_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorEgressProgress_Payload(parser: Parser): Frigate_Threat_Egress_Supervisor.EgressProgress_Payload = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorEgressProgress_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorEgressProgress_Payload _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorSnapshotPreEgressState_Payload(o: Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorSnapshotPreEgressState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorSnapshotPreEgressState_Payload(s: String): Either[Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorSnapshotPreEgressState_Payload(parser: Parser): Frigate_Threat_Egress_Supervisor.SnapshotPreEgressState_Payload = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorSnapshotPreEgressState_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorSnapshotPreEgressState_Payload _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorSnapshotNextEgressState_Payload(o: Frigate_Threat_Egress_Supervisor.SnapshotNextEgressState_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorSnapshotNextEgressState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorSnapshotNextEgressState_Payload(s: String): Either[Frigate_Threat_Egress_Supervisor.SnapshotNextEgressState_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorSnapshotNextEgressState_Payload(parser: Parser): Frigate_Threat_Egress_Supervisor.SnapshotNextEgressState_Payload = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorSnapshotNextEgressState_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorSnapshotNextEgressState_Payload _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorSnapshotResponseDirective_Payload(o: Frigate_Threat_Egress_Supervisor.SnapshotResponseDirective_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorSnapshotResponseDirective_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorSnapshotResponseDirective_Payload(s: String): Either[Frigate_Threat_Egress_Supervisor.SnapshotResponseDirective_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorSnapshotResponseDirective_Payload(parser: Parser): Frigate_Threat_Egress_Supervisor.SnapshotResponseDirective_Payload = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorSnapshotResponseDirective_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorSnapshotResponseDirective_Payload _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorSnapshotDefenseCommand_Payload(o: Frigate_Threat_Egress_Supervisor.SnapshotDefenseCommand_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorSnapshotDefenseCommand_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorSnapshotDefenseCommand_Payload(s: String): Either[Frigate_Threat_Egress_Supervisor.SnapshotDefenseCommand_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorSnapshotDefenseCommand_Payload(parser: Parser): Frigate_Threat_Egress_Supervisor.SnapshotDefenseCommand_Payload = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorSnapshotDefenseCommand_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorSnapshotDefenseCommand_Payload _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorSnapshotEgressCommand_Payload(o: Frigate_Threat_Egress_Supervisor.SnapshotEgressCommand_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorSnapshotEgressCommand_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorSnapshotEgressCommand_Payload(s: String): Either[Frigate_Threat_Egress_Supervisor.SnapshotEgressCommand_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorSnapshotEgressCommand_Payload(parser: Parser): Frigate_Threat_Egress_Supervisor.SnapshotEgressCommand_Payload = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorSnapshotEgressCommand_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorSnapshotEgressCommand_Payload _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorDefenseCommand_Payload(o: Frigate_Threat_Egress_Supervisor.DefenseCommand_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorDefenseCommand_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorDefenseCommand_Payload(s: String): Either[Frigate_Threat_Egress_Supervisor.DefenseCommand_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorDefenseCommand_Payload(parser: Parser): Frigate_Threat_Egress_Supervisor.DefenseCommand_Payload = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorDefenseCommand_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorDefenseCommand_Payload _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorEgressCommand_Payload(o: Frigate_Threat_Egress_Supervisor.EgressCommand_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorEgressCommand_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorEgressCommand_Payload(s: String): Either[Frigate_Threat_Egress_Supervisor.EgressCommand_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorEgressCommand_Payload(parser: Parser): Frigate_Threat_Egress_Supervisor.EgressCommand_Payload = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorEgressCommand_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorEgressCommand_Payload _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorResponseStatus_Payload(o: Frigate_Threat_Egress_Supervisor.ResponseStatus_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorResponseStatus_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorResponseStatus_Payload(s: String): Either[Frigate_Threat_Egress_Supervisor.ResponseStatus_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorResponseStatus_Payload(parser: Parser): Frigate_Threat_Egress_Supervisor.ResponseStatus_Payload = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorResponseStatus_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorResponseStatus_Payload _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorThreatObservation(o: Frigate_Threat_Egress_Supervisor.ThreatObservation, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorThreatObservation(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorThreatObservation(s: String): Either[Frigate_Threat_Egress_Supervisor.ThreatObservation, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorThreatObservation(parser: Parser): Frigate_Threat_Egress_Supervisor.ThreatObservation = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorThreatObservation()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorThreatObservation _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorThreatObservation_Payload(o: Frigate_Threat_Egress_Supervisor.ThreatObservation_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorThreatObservation_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorThreatObservation_Payload(s: String): Either[Frigate_Threat_Egress_Supervisor.ThreatObservation_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorThreatObservation_Payload(parser: Parser): Frigate_Threat_Egress_Supervisor.ThreatObservation_Payload = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorThreatObservation_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorThreatObservation_Payload _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorEpisodeSnapshot(o: Frigate_Threat_Egress_Supervisor.EpisodeSnapshot, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorEpisodeSnapshot(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorEpisodeSnapshot(s: String): Either[Frigate_Threat_Egress_Supervisor.EpisodeSnapshot, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorEpisodeSnapshot(parser: Parser): Frigate_Threat_Egress_Supervisor.EpisodeSnapshot = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorEpisodeSnapshot()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorEpisodeSnapshot _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorEpisodeSnapshot_Payload(o: Frigate_Threat_Egress_Supervisor.EpisodeSnapshot_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorEpisodeSnapshot_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorEpisodeSnapshot_Payload(s: String): Either[Frigate_Threat_Egress_Supervisor.EpisodeSnapshot_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorEpisodeSnapshot_Payload(parser: Parser): Frigate_Threat_Egress_Supervisor.EpisodeSnapshot_Payload = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorEpisodeSnapshot_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorEpisodeSnapshot_Payload _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorDefenseSupportObservation(o: Frigate_Threat_Egress_Supervisor.DefenseSupportObservation, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorDefenseSupportObservation(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorDefenseSupportObservation(s: String): Either[Frigate_Threat_Egress_Supervisor.DefenseSupportObservation, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorDefenseSupportObservation(parser: Parser): Frigate_Threat_Egress_Supervisor.DefenseSupportObservation = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorDefenseSupportObservation()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorDefenseSupportObservation _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorDefenseSupportObservation_Payload(o: Frigate_Threat_Egress_Supervisor.DefenseSupportObservation_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorDefenseSupportObservation_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorDefenseSupportObservation_Payload(s: String): Either[Frigate_Threat_Egress_Supervisor.DefenseSupportObservation_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorDefenseSupportObservation_Payload(parser: Parser): Frigate_Threat_Egress_Supervisor.DefenseSupportObservation_Payload = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorDefenseSupportObservation_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorDefenseSupportObservation_Payload _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorResponseSnapshot(o: Frigate_Threat_Egress_Supervisor.ResponseSnapshot, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorResponseSnapshot(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorResponseSnapshot(s: String): Either[Frigate_Threat_Egress_Supervisor.ResponseSnapshot, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorResponseSnapshot(parser: Parser): Frigate_Threat_Egress_Supervisor.ResponseSnapshot = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorResponseSnapshot()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorResponseSnapshot _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorResponseSnapshot_Payload(o: Frigate_Threat_Egress_Supervisor.ResponseSnapshot_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorResponseSnapshot_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorResponseSnapshot_Payload(s: String): Either[Frigate_Threat_Egress_Supervisor.ResponseSnapshot_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorResponseSnapshot_Payload(parser: Parser): Frigate_Threat_Egress_Supervisor.ResponseSnapshot_Payload = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorResponseSnapshot_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorResponseSnapshot_Payload _)
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

  def fromFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container(o: Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container(s: String): Either[Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container(parser: Parser): Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_P(o: Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_P(s: String): Either[Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_P, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_P(parser: Parser): Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_P = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_P()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PS(o: Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PS(s: String): Either[Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PS, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PS(parser: Parser): Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PS = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PS()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PreState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container(o: Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container(s: String): Either[Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container(parser: Parser): Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_P(o: Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_P(s: String): Either[Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_P, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_P(parser: Parser): Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_P = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_P()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PS(o: Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PS(s: String): Either[Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PS, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PS(parser: Parser): Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PS = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PS()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_PostState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container(o: Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container(s: String): Either[Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container(parser: Parser): Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_P(o: Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_P(s: String): Either[Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_P, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_P(parser: Parser): Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_P = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_P()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PS(o: Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PS(s: String): Either[Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PS, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PS(parser: Parser): Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PS = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PS()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PreState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container(o: Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container(s: String): Either[Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container(parser: Parser): Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_P(o: Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_P(s: String): Either[Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_P, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_P(parser: Parser): Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_P = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_P()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PS(o: Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PS(s: String): Either[Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PS, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PS(parser: Parser): Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PS = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PS()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_PostState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container(o: Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container(s: String): Either[Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container(parser: Parser): Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_P(o: Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_P(s: String): Either[Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_P, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_P(parser: Parser): Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_P = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_P()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PS(o: Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PS(s: String): Either[Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PS, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PS(parser: Parser): Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PS = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PS()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PreState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container(o: Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container(s: String): Either[Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container(parser: Parser): Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_P(o: Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_P(s: String): Either[Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_P, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_P(parser: Parser): Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_P = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_P()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PS(o: Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PS(s: String): Either[Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PS, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PS(parser: Parser): Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PS = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PS()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorThreatReportPolicy_threatResponseProcess_threatReportPolicy_PostState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container(o: Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container(s: String): Either[Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container(parser: Parser): Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_P(o: Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_P(s: String): Either[Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_P, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_P(parser: Parser): Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_P = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_P()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PS(o: Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PS(s: String): Either[Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PS, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PS(parser: Parser): Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PS = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PS()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PreState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container(o: Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container(s: String): Either[Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container(parser: Parser): Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_P(o: Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_P(s: String): Either[Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_P, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_P(parser: Parser): Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_P = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_P()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PS(o: Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PS(s: String): Either[Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PS, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PS(parser: Parser): Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PS = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PS()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorDefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_PostState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container(o: Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container(s: String): Either[Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container(parser: Parser): Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_P(o: Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_P(s: String): Either[Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_P, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_P(parser: Parser): Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_P = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_P()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PS(o: Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PS(s: String): Either[Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PS, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PS(parser: Parser): Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PS = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PS()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PreState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container(o: Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container(s: String): Either[Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container(parser: Parser): Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_P(o: Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_P(s: String): Either[Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_P, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_P(parser: Parser): Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_P = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_P()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PS(o: Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PS(s: String): Either[Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PS, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PS(parser: Parser): Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PS = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PS()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorEgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_PostState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container(o: Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container(s: String): Either[Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container(parser: Parser): Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_P(o: Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_P(s: String): Either[Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_P, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_P(parser: Parser): Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_P = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_P()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PS(o: Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PS(s: String): Either[Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PS, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PS(parser: Parser): Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PS = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PS()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PreState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container(o: Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container(s: String): Either[Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container(parser: Parser): Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_P(o: Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_P(s: String): Either[Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_P, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_P(parser: Parser): Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_P = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_P()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PS(o: Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PS(s: String): Either[Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PS, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PS(parser: Parser): Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PS = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PS()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_PostState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container(o: Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PreState_Container, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container(s: String): Either[Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PreState_Container, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container(parser: Parser): Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PreState_Container = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_P(o: Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_P(s: String): Either[Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PreState_Container_P, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_P(parser: Parser): Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PreState_Container_P = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_P()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PS(o: Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PS(s: String): Either[Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PS, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PS(parser: Parser): Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PS = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PS()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PreState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container(o: Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PostState_Container, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container(s: String): Either[Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PostState_Container, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container(parser: Parser): Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PostState_Container = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_P(o: Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_P(s: String): Either[Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PostState_Container_P, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_P(parser: Parser): Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PostState_Container_P = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_P()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PS(o: Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PS(s: String): Either[Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PS, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PS(parser: Parser): Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PS = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PS()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorResponseStateController_threatResponseProcess_responseStateController_PostState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container(o: Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container(s: String): Either[Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container(parser: Parser): Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_P(o: Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_P(s: String): Either[Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_P, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_P(parser: Parser): Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_P = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_P()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PS(o: Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PS(s: String): Either[Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PS, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PS(parser: Parser): Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PS = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PS()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PreState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container(o: Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container(s: String): Either[Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container(parser: Parser): Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_P(o: Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_P(s: String): Either[Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_P, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_P(parser: Parser): Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_P = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_P()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PS(o: Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PS(s: String): Either[Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PS, Json.ErrorMsg] = {
    def fFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PS(parser: Parser): Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PS = {
      val r = parser.parseFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PS()
      return r
    }
    val r = to(s, fFrigate_Threat_Egress_SupervisorResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_PostState_Container_PS _)
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