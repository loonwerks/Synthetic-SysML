// #Sireum
// @formatter:off

// This file is auto-generated from ContactSignature.scala, ContactSignatureStatus.scala, ContactIdentity.scala, IdentityStatus.scala, QualifiedThreat.scala, DefenseAvailability.scala, DefenseAvailabilityStatus.scala, DroneReadiness.scala, DroneReadinessStatus.scala, DefenseCondition.scala, DestinationStatus.scala, DestinationEvidenceStatus.scala, WarpProgress.scala, WarpProgressStatus.scala, RetreatCondition.scala, ResponseRequestValue.scala, RequestStatus.scala, DefenseActivation.scala, RetreatNavigationCommand.scala, ResponseDisposition.scala, AcknowledgmentValue.scala, AcknowledgmentStatus.scala, ReportPriority.scala, ContactEvidence.scala, IdentificationEvidence.scala, DefenseEvidence.scala, RetreatNavigationEvidence.scala, ResponseRequest.scala, ResponseRecord.scala, ReportAcknowledgment.scala, ThreatReport.scala, Base_Types.scala, ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_Containers.scala, DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_Containers.scala, RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_Containers.scala, PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_Containers.scala, ThreatReportComposer_threatResponseProcess_threatReportComposer_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package frigate_threat_response_coordinator

import org.sireum._
import org.sireum.Json.Printer._

object JSON {

  object Printer {

    @pure def printFrigate_Threat_Response_CoordinatorContactSignatureType(o: Frigate_Threat_Response_Coordinator.ContactSignature.Type): ST = {
      val value: String = o match {
        case Frigate_Threat_Response_Coordinator.ContactSignature.NONE => "NONE"
        case Frigate_Threat_Response_Coordinator.ContactSignature.CONTACT => "CONTACT"
      }
      return printObject(ISZ(
        ("type", printString("Frigate_Threat_Response_Coordinator.ContactSignature")),
        ("value", printString(value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorContactSignature_Payload(o: Frigate_Threat_Response_Coordinator.ContactSignature_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.ContactSignature_Payload""""),
        ("value", printFrigate_Threat_Response_CoordinatorContactSignatureType(o.value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorContactSignatureStatusType(o: Frigate_Threat_Response_Coordinator.ContactSignatureStatus.Type): ST = {
      val value: String = o match {
        case Frigate_Threat_Response_Coordinator.ContactSignatureStatus.VALID => "VALID"
        case Frigate_Threat_Response_Coordinator.ContactSignatureStatus.INVALID => "INVALID"
      }
      return printObject(ISZ(
        ("type", printString("Frigate_Threat_Response_Coordinator.ContactSignatureStatus")),
        ("value", printString(value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorContactSignatureStatus_Payload(o: Frigate_Threat_Response_Coordinator.ContactSignatureStatus_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.ContactSignatureStatus_Payload""""),
        ("value", printFrigate_Threat_Response_CoordinatorContactSignatureStatusType(o.value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorContactIdentityType(o: Frigate_Threat_Response_Coordinator.ContactIdentity.Type): ST = {
      val value: String = o match {
        case Frigate_Threat_Response_Coordinator.ContactIdentity.NO_HOSTILE => "NO_HOSTILE"
        case Frigate_Threat_Response_Coordinator.ContactIdentity.HOSTILE => "HOSTILE"
      }
      return printObject(ISZ(
        ("type", printString("Frigate_Threat_Response_Coordinator.ContactIdentity")),
        ("value", printString(value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorContactIdentity_Payload(o: Frigate_Threat_Response_Coordinator.ContactIdentity_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.ContactIdentity_Payload""""),
        ("value", printFrigate_Threat_Response_CoordinatorContactIdentityType(o.value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorIdentityStatusType(o: Frigate_Threat_Response_Coordinator.IdentityStatus.Type): ST = {
      val value: String = o match {
        case Frigate_Threat_Response_Coordinator.IdentityStatus.VALID => "VALID"
        case Frigate_Threat_Response_Coordinator.IdentityStatus.INVALID => "INVALID"
      }
      return printObject(ISZ(
        ("type", printString("Frigate_Threat_Response_Coordinator.IdentityStatus")),
        ("value", printString(value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorIdentityStatus_Payload(o: Frigate_Threat_Response_Coordinator.IdentityStatus_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.IdentityStatus_Payload""""),
        ("value", printFrigate_Threat_Response_CoordinatorIdentityStatusType(o.value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorQualifiedThreatType(o: Frigate_Threat_Response_Coordinator.QualifiedThreat.Type): ST = {
      val value: String = o match {
        case Frigate_Threat_Response_Coordinator.QualifiedThreat.CLEAR => "CLEAR"
        case Frigate_Threat_Response_Coordinator.QualifiedThreat.SUSPECT => "SUSPECT"
        case Frigate_Threat_Response_Coordinator.QualifiedThreat.HOSTILE => "HOSTILE"
        case Frigate_Threat_Response_Coordinator.QualifiedThreat.UNKNOWN => "UNKNOWN"
      }
      return printObject(ISZ(
        ("type", printString("Frigate_Threat_Response_Coordinator.QualifiedThreat")),
        ("value", printString(value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorQualifiedThreat_Payload(o: Frigate_Threat_Response_Coordinator.QualifiedThreat_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.QualifiedThreat_Payload""""),
        ("value", printFrigate_Threat_Response_CoordinatorQualifiedThreatType(o.value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorDefenseAvailabilityType(o: Frigate_Threat_Response_Coordinator.DefenseAvailability.Type): ST = {
      val value: String = o match {
        case Frigate_Threat_Response_Coordinator.DefenseAvailability.AVAILABLE => "AVAILABLE"
        case Frigate_Threat_Response_Coordinator.DefenseAvailability.UNAVAILABLE => "UNAVAILABLE"
      }
      return printObject(ISZ(
        ("type", printString("Frigate_Threat_Response_Coordinator.DefenseAvailability")),
        ("value", printString(value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorDefenseAvailability_Payload(o: Frigate_Threat_Response_Coordinator.DefenseAvailability_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.DefenseAvailability_Payload""""),
        ("value", printFrigate_Threat_Response_CoordinatorDefenseAvailabilityType(o.value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorDefenseAvailabilityStatusType(o: Frigate_Threat_Response_Coordinator.DefenseAvailabilityStatus.Type): ST = {
      val value: String = o match {
        case Frigate_Threat_Response_Coordinator.DefenseAvailabilityStatus.VALID => "VALID"
        case Frigate_Threat_Response_Coordinator.DefenseAvailabilityStatus.INVALID => "INVALID"
      }
      return printObject(ISZ(
        ("type", printString("Frigate_Threat_Response_Coordinator.DefenseAvailabilityStatus")),
        ("value", printString(value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorDefenseAvailabilityStatus_Payload(o: Frigate_Threat_Response_Coordinator.DefenseAvailabilityStatus_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.DefenseAvailabilityStatus_Payload""""),
        ("value", printFrigate_Threat_Response_CoordinatorDefenseAvailabilityStatusType(o.value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorDroneReadinessType(o: Frigate_Threat_Response_Coordinator.DroneReadiness.Type): ST = {
      val value: String = o match {
        case Frigate_Threat_Response_Coordinator.DroneReadiness.READY => "READY"
        case Frigate_Threat_Response_Coordinator.DroneReadiness.NOT_READY => "NOT_READY"
      }
      return printObject(ISZ(
        ("type", printString("Frigate_Threat_Response_Coordinator.DroneReadiness")),
        ("value", printString(value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorDroneReadiness_Payload(o: Frigate_Threat_Response_Coordinator.DroneReadiness_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.DroneReadiness_Payload""""),
        ("value", printFrigate_Threat_Response_CoordinatorDroneReadinessType(o.value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorDroneReadinessStatusType(o: Frigate_Threat_Response_Coordinator.DroneReadinessStatus.Type): ST = {
      val value: String = o match {
        case Frigate_Threat_Response_Coordinator.DroneReadinessStatus.VALID => "VALID"
        case Frigate_Threat_Response_Coordinator.DroneReadinessStatus.INVALID => "INVALID"
      }
      return printObject(ISZ(
        ("type", printString("Frigate_Threat_Response_Coordinator.DroneReadinessStatus")),
        ("value", printString(value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorDroneReadinessStatus_Payload(o: Frigate_Threat_Response_Coordinator.DroneReadinessStatus_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.DroneReadinessStatus_Payload""""),
        ("value", printFrigate_Threat_Response_CoordinatorDroneReadinessStatusType(o.value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorDefenseConditionType(o: Frigate_Threat_Response_Coordinator.DefenseCondition.Type): ST = {
      val value: String = o match {
        case Frigate_Threat_Response_Coordinator.DefenseCondition.READY => "READY"
        case Frigate_Threat_Response_Coordinator.DefenseCondition.UNAVAILABLE => "UNAVAILABLE"
        case Frigate_Threat_Response_Coordinator.DefenseCondition.UNKNOWN => "UNKNOWN"
      }
      return printObject(ISZ(
        ("type", printString("Frigate_Threat_Response_Coordinator.DefenseCondition")),
        ("value", printString(value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorDefenseCondition_Payload(o: Frigate_Threat_Response_Coordinator.DefenseCondition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.DefenseCondition_Payload""""),
        ("value", printFrigate_Threat_Response_CoordinatorDefenseConditionType(o.value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorDestinationStatusType(o: Frigate_Threat_Response_Coordinator.DestinationStatus.Type): ST = {
      val value: String = o match {
        case Frigate_Threat_Response_Coordinator.DestinationStatus.IDENTIFIED => "IDENTIFIED"
        case Frigate_Threat_Response_Coordinator.DestinationStatus.ABSENT => "ABSENT"
      }
      return printObject(ISZ(
        ("type", printString("Frigate_Threat_Response_Coordinator.DestinationStatus")),
        ("value", printString(value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorDestinationStatus_Payload(o: Frigate_Threat_Response_Coordinator.DestinationStatus_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.DestinationStatus_Payload""""),
        ("value", printFrigate_Threat_Response_CoordinatorDestinationStatusType(o.value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorDestinationEvidenceStatusType(o: Frigate_Threat_Response_Coordinator.DestinationEvidenceStatus.Type): ST = {
      val value: String = o match {
        case Frigate_Threat_Response_Coordinator.DestinationEvidenceStatus.VALID => "VALID"
        case Frigate_Threat_Response_Coordinator.DestinationEvidenceStatus.INVALID => "INVALID"
      }
      return printObject(ISZ(
        ("type", printString("Frigate_Threat_Response_Coordinator.DestinationEvidenceStatus")),
        ("value", printString(value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorDestinationEvidenceStatus_Payload(o: Frigate_Threat_Response_Coordinator.DestinationEvidenceStatus_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.DestinationEvidenceStatus_Payload""""),
        ("value", printFrigate_Threat_Response_CoordinatorDestinationEvidenceStatusType(o.value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorWarpProgressType(o: Frigate_Threat_Response_Coordinator.WarpProgress.Type): ST = {
      val value: String = o match {
        case Frigate_Threat_Response_Coordinator.WarpProgress.READY => "READY"
        case Frigate_Threat_Response_Coordinator.WarpProgress.IN_PROGRESS => "IN_PROGRESS"
        case Frigate_Threat_Response_Coordinator.WarpProgress.COMPLETE => "COMPLETE"
        case Frigate_Threat_Response_Coordinator.WarpProgress.UNAVAILABLE => "UNAVAILABLE"
      }
      return printObject(ISZ(
        ("type", printString("Frigate_Threat_Response_Coordinator.WarpProgress")),
        ("value", printString(value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorWarpProgress_Payload(o: Frigate_Threat_Response_Coordinator.WarpProgress_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.WarpProgress_Payload""""),
        ("value", printFrigate_Threat_Response_CoordinatorWarpProgressType(o.value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorWarpProgressStatusType(o: Frigate_Threat_Response_Coordinator.WarpProgressStatus.Type): ST = {
      val value: String = o match {
        case Frigate_Threat_Response_Coordinator.WarpProgressStatus.VALID => "VALID"
        case Frigate_Threat_Response_Coordinator.WarpProgressStatus.INVALID => "INVALID"
      }
      return printObject(ISZ(
        ("type", printString("Frigate_Threat_Response_Coordinator.WarpProgressStatus")),
        ("value", printString(value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorWarpProgressStatus_Payload(o: Frigate_Threat_Response_Coordinator.WarpProgressStatus_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.WarpProgressStatus_Payload""""),
        ("value", printFrigate_Threat_Response_CoordinatorWarpProgressStatusType(o.value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorRetreatConditionType(o: Frigate_Threat_Response_Coordinator.RetreatCondition.Type): ST = {
      val value: String = o match {
        case Frigate_Threat_Response_Coordinator.RetreatCondition.AVAILABLE => "AVAILABLE"
        case Frigate_Threat_Response_Coordinator.RetreatCondition.UNAVAILABLE => "UNAVAILABLE"
        case Frigate_Threat_Response_Coordinator.RetreatCondition.COMPLETE => "COMPLETE"
        case Frigate_Threat_Response_Coordinator.RetreatCondition.UNKNOWN => "UNKNOWN"
      }
      return printObject(ISZ(
        ("type", printString("Frigate_Threat_Response_Coordinator.RetreatCondition")),
        ("value", printString(value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorRetreatCondition_Payload(o: Frigate_Threat_Response_Coordinator.RetreatCondition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.RetreatCondition_Payload""""),
        ("value", printFrigate_Threat_Response_CoordinatorRetreatConditionType(o.value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorResponseRequestValueType(o: Frigate_Threat_Response_Coordinator.ResponseRequestValue.Type): ST = {
      val value: String = o match {
        case Frigate_Threat_Response_Coordinator.ResponseRequestValue.OBSERVE => "OBSERVE"
        case Frigate_Threat_Response_Coordinator.ResponseRequestValue.DEFEND_IF_HOSTILE => "DEFEND_IF_HOSTILE"
        case Frigate_Threat_Response_Coordinator.ResponseRequestValue.RETREAT => "RETREAT"
      }
      return printObject(ISZ(
        ("type", printString("Frigate_Threat_Response_Coordinator.ResponseRequestValue")),
        ("value", printString(value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorResponseRequestValue_Payload(o: Frigate_Threat_Response_Coordinator.ResponseRequestValue_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.ResponseRequestValue_Payload""""),
        ("value", printFrigate_Threat_Response_CoordinatorResponseRequestValueType(o.value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorRequestStatusType(o: Frigate_Threat_Response_Coordinator.RequestStatus.Type): ST = {
      val value: String = o match {
        case Frigate_Threat_Response_Coordinator.RequestStatus.VALID => "VALID"
        case Frigate_Threat_Response_Coordinator.RequestStatus.INVALID => "INVALID"
      }
      return printObject(ISZ(
        ("type", printString("Frigate_Threat_Response_Coordinator.RequestStatus")),
        ("value", printString(value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorRequestStatus_Payload(o: Frigate_Threat_Response_Coordinator.RequestStatus_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.RequestStatus_Payload""""),
        ("value", printFrigate_Threat_Response_CoordinatorRequestStatusType(o.value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorDefenseActivationType(o: Frigate_Threat_Response_Coordinator.DefenseActivation.Type): ST = {
      val value: String = o match {
        case Frigate_Threat_Response_Coordinator.DefenseActivation.STAND_DOWN => "STAND_DOWN"
        case Frigate_Threat_Response_Coordinator.DefenseActivation.ACTIVATE => "ACTIVATE"
      }
      return printObject(ISZ(
        ("type", printString("Frigate_Threat_Response_Coordinator.DefenseActivation")),
        ("value", printString(value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorDefenseActivation_Payload(o: Frigate_Threat_Response_Coordinator.DefenseActivation_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.DefenseActivation_Payload""""),
        ("value", printFrigate_Threat_Response_CoordinatorDefenseActivationType(o.value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorRetreatNavigationCommandType(o: Frigate_Threat_Response_Coordinator.RetreatNavigationCommand.Type): ST = {
      val value: String = o match {
        case Frigate_Threat_Response_Coordinator.RetreatNavigationCommand.HOLD => "HOLD"
        case Frigate_Threat_Response_Coordinator.RetreatNavigationCommand.RETREAT => "RETREAT"
      }
      return printObject(ISZ(
        ("type", printString("Frigate_Threat_Response_Coordinator.RetreatNavigationCommand")),
        ("value", printString(value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorRetreatNavigationCommand_Payload(o: Frigate_Threat_Response_Coordinator.RetreatNavigationCommand_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.RetreatNavigationCommand_Payload""""),
        ("value", printFrigate_Threat_Response_CoordinatorRetreatNavigationCommandType(o.value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorResponseDispositionType(o: Frigate_Threat_Response_Coordinator.ResponseDisposition.Type): ST = {
      val value: String = o match {
        case Frigate_Threat_Response_Coordinator.ResponseDisposition.OBSERVED => "OBSERVED"
        case Frigate_Threat_Response_Coordinator.ResponseDisposition.DEFENSE_ACTIVE => "DEFENSE_ACTIVE"
        case Frigate_Threat_Response_Coordinator.ResponseDisposition.RETREAT_ACTIVE => "RETREAT_ACTIVE"
        case Frigate_Threat_Response_Coordinator.ResponseDisposition.RETREAT_BLOCKED => "RETREAT_BLOCKED"
        case Frigate_Threat_Response_Coordinator.ResponseDisposition.RETREAT_COMPLETE => "RETREAT_COMPLETE"
        case Frigate_Threat_Response_Coordinator.ResponseDisposition.INPUT_FAULT => "INPUT_FAULT"
      }
      return printObject(ISZ(
        ("type", printString("Frigate_Threat_Response_Coordinator.ResponseDisposition")),
        ("value", printString(value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorResponseDisposition_Payload(o: Frigate_Threat_Response_Coordinator.ResponseDisposition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.ResponseDisposition_Payload""""),
        ("value", printFrigate_Threat_Response_CoordinatorResponseDispositionType(o.value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorAcknowledgmentValueType(o: Frigate_Threat_Response_Coordinator.AcknowledgmentValue.Type): ST = {
      val value: String = o match {
        case Frigate_Threat_Response_Coordinator.AcknowledgmentValue.NOT_ACKNOWLEDGED => "NOT_ACKNOWLEDGED"
        case Frigate_Threat_Response_Coordinator.AcknowledgmentValue.ACKNOWLEDGED => "ACKNOWLEDGED"
      }
      return printObject(ISZ(
        ("type", printString("Frigate_Threat_Response_Coordinator.AcknowledgmentValue")),
        ("value", printString(value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorAcknowledgmentValue_Payload(o: Frigate_Threat_Response_Coordinator.AcknowledgmentValue_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.AcknowledgmentValue_Payload""""),
        ("value", printFrigate_Threat_Response_CoordinatorAcknowledgmentValueType(o.value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorAcknowledgmentStatusType(o: Frigate_Threat_Response_Coordinator.AcknowledgmentStatus.Type): ST = {
      val value: String = o match {
        case Frigate_Threat_Response_Coordinator.AcknowledgmentStatus.VALID => "VALID"
        case Frigate_Threat_Response_Coordinator.AcknowledgmentStatus.INVALID => "INVALID"
      }
      return printObject(ISZ(
        ("type", printString("Frigate_Threat_Response_Coordinator.AcknowledgmentStatus")),
        ("value", printString(value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorAcknowledgmentStatus_Payload(o: Frigate_Threat_Response_Coordinator.AcknowledgmentStatus_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.AcknowledgmentStatus_Payload""""),
        ("value", printFrigate_Threat_Response_CoordinatorAcknowledgmentStatusType(o.value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorReportPriorityType(o: Frigate_Threat_Response_Coordinator.ReportPriority.Type): ST = {
      val value: String = o match {
        case Frigate_Threat_Response_Coordinator.ReportPriority.COMMUNICATION_FAULT => "COMMUNICATION_FAULT"
        case Frigate_Threat_Response_Coordinator.ReportPriority.CLOSED => "CLOSED"
        case Frigate_Threat_Response_Coordinator.ReportPriority.URGENT => "URGENT"
        case Frigate_Threat_Response_Coordinator.ReportPriority.ROUTINE => "ROUTINE"
      }
      return printObject(ISZ(
        ("type", printString("Frigate_Threat_Response_Coordinator.ReportPriority")),
        ("value", printString(value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorReportPriority_Payload(o: Frigate_Threat_Response_Coordinator.ReportPriority_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.ReportPriority_Payload""""),
        ("value", printFrigate_Threat_Response_CoordinatorReportPriorityType(o.value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorContactEvidence(o: Frigate_Threat_Response_Coordinator.ContactEvidence): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.ContactEvidence""""),
        ("signature", printFrigate_Threat_Response_CoordinatorContactSignatureType(o.signature)),
        ("signatureStatus", printFrigate_Threat_Response_CoordinatorContactSignatureStatusType(o.signatureStatus))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorContactEvidence_Payload(o: Frigate_Threat_Response_Coordinator.ContactEvidence_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.ContactEvidence_Payload""""),
        ("value", printFrigate_Threat_Response_CoordinatorContactEvidence(o.value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorIdentificationEvidence(o: Frigate_Threat_Response_Coordinator.IdentificationEvidence): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.IdentificationEvidence""""),
        ("identity", printFrigate_Threat_Response_CoordinatorContactIdentityType(o.identity)),
        ("identityStatus", printFrigate_Threat_Response_CoordinatorIdentityStatusType(o.identityStatus))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorIdentificationEvidence_Payload(o: Frigate_Threat_Response_Coordinator.IdentificationEvidence_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.IdentificationEvidence_Payload""""),
        ("value", printFrigate_Threat_Response_CoordinatorIdentificationEvidence(o.value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorDefenseEvidence(o: Frigate_Threat_Response_Coordinator.DefenseEvidence): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.DefenseEvidence""""),
        ("defenseAvailable", printFrigate_Threat_Response_CoordinatorDefenseAvailabilityType(o.defenseAvailable)),
        ("defenseStatus", printFrigate_Threat_Response_CoordinatorDefenseAvailabilityStatusType(o.defenseStatus)),
        ("droneReadiness", printFrigate_Threat_Response_CoordinatorDroneReadinessType(o.droneReadiness)),
        ("droneStatus", printFrigate_Threat_Response_CoordinatorDroneReadinessStatusType(o.droneStatus))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorDefenseEvidence_Payload(o: Frigate_Threat_Response_Coordinator.DefenseEvidence_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.DefenseEvidence_Payload""""),
        ("value", printFrigate_Threat_Response_CoordinatorDefenseEvidence(o.value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorRetreatNavigationEvidence(o: Frigate_Threat_Response_Coordinator.RetreatNavigationEvidence): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.RetreatNavigationEvidence""""),
        ("destination", printFrigate_Threat_Response_CoordinatorDestinationStatusType(o.destination)),
        ("destinationStatus", printFrigate_Threat_Response_CoordinatorDestinationEvidenceStatusType(o.destinationStatus)),
        ("warpProgress", printFrigate_Threat_Response_CoordinatorWarpProgressType(o.warpProgress)),
        ("warpStatus", printFrigate_Threat_Response_CoordinatorWarpProgressStatusType(o.warpStatus))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorRetreatNavigationEvidence_Payload(o: Frigate_Threat_Response_Coordinator.RetreatNavigationEvidence_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.RetreatNavigationEvidence_Payload""""),
        ("value", printFrigate_Threat_Response_CoordinatorRetreatNavigationEvidence(o.value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorResponseRequest(o: Frigate_Threat_Response_Coordinator.ResponseRequest): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.ResponseRequest""""),
        ("request", printFrigate_Threat_Response_CoordinatorResponseRequestValueType(o.request)),
        ("requestStatus", printFrigate_Threat_Response_CoordinatorRequestStatusType(o.requestStatus))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorResponseRequest_Payload(o: Frigate_Threat_Response_Coordinator.ResponseRequest_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.ResponseRequest_Payload""""),
        ("value", printFrigate_Threat_Response_CoordinatorResponseRequest(o.value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorResponseRecord(o: Frigate_Threat_Response_Coordinator.ResponseRecord): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.ResponseRecord""""),
        ("qualifiedThreat", printFrigate_Threat_Response_CoordinatorQualifiedThreatType(o.qualifiedThreat)),
        ("disposition", printFrigate_Threat_Response_CoordinatorResponseDispositionType(o.disposition))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorResponseRecord_Payload(o: Frigate_Threat_Response_Coordinator.ResponseRecord_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.ResponseRecord_Payload""""),
        ("value", printFrigate_Threat_Response_CoordinatorResponseRecord(o.value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorReportAcknowledgment(o: Frigate_Threat_Response_Coordinator.ReportAcknowledgment): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.ReportAcknowledgment""""),
        ("acknowledgment", printFrigate_Threat_Response_CoordinatorAcknowledgmentValueType(o.acknowledgment)),
        ("acknowledgmentStatus", printFrigate_Threat_Response_CoordinatorAcknowledgmentStatusType(o.acknowledgmentStatus))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorReportAcknowledgment_Payload(o: Frigate_Threat_Response_Coordinator.ReportAcknowledgment_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.ReportAcknowledgment_Payload""""),
        ("value", printFrigate_Threat_Response_CoordinatorReportAcknowledgment(o.value))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorThreatReport(o: Frigate_Threat_Response_Coordinator.ThreatReport): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.ThreatReport""""),
        ("qualifiedThreat", printFrigate_Threat_Response_CoordinatorQualifiedThreatType(o.qualifiedThreat)),
        ("disposition", printFrigate_Threat_Response_CoordinatorResponseDispositionType(o.disposition)),
        ("priority", printFrigate_Threat_Response_CoordinatorReportPriorityType(o.priority))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorThreatReport_Payload(o: Frigate_Threat_Response_Coordinator.ThreatReport_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.ThreatReport_Payload""""),
        ("value", printFrigate_Threat_Response_CoordinatorThreatReport(o.value))
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

    @pure def printFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container(o: Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container): ST = {
      o match {
        case o: Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_P => return printFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PS => return printFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PS(o)
      }
    }

    @pure def printFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_P(o: Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_P""""),
        ("api_contactEvidence", printFrigate_Threat_Response_CoordinatorContactEvidence(o.api_contactEvidence)),
        ("api_identificationEvidence", printFrigate_Threat_Response_CoordinatorIdentificationEvidence(o.api_identificationEvidence))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PS(o: Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PS""""),
        ("api_contactEvidence", printFrigate_Threat_Response_CoordinatorContactEvidence(o.api_contactEvidence)),
        ("api_identificationEvidence", printFrigate_Threat_Response_CoordinatorIdentificationEvidence(o.api_identificationEvidence))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container(o: Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container): ST = {
      o match {
        case o: Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_P => return printFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PS => return printFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PS(o)
      }
    }

    @pure def printFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_P(o: Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_P""""),
        ("api_qualifiedThreat", printFrigate_Threat_Response_CoordinatorQualifiedThreatType(o.api_qualifiedThreat))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PS(o: Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PS""""),
        ("api_qualifiedThreat", printFrigate_Threat_Response_CoordinatorQualifiedThreatType(o.api_qualifiedThreat))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container(o: Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container): ST = {
      o match {
        case o: Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_P => return printFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PS => return printFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PS(o)
      }
    }

    @pure def printFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_P(o: Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_P""""),
        ("api_defenseEvidence", printFrigate_Threat_Response_CoordinatorDefenseEvidence(o.api_defenseEvidence))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PS(o: Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PS""""),
        ("api_defenseEvidence", printFrigate_Threat_Response_CoordinatorDefenseEvidence(o.api_defenseEvidence))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container(o: Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container): ST = {
      o match {
        case o: Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_P => return printFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PS => return printFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PS(o)
      }
    }

    @pure def printFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_P(o: Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_P""""),
        ("api_defenseCondition", printFrigate_Threat_Response_CoordinatorDefenseConditionType(o.api_defenseCondition))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PS(o: Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PS""""),
        ("api_defenseCondition", printFrigate_Threat_Response_CoordinatorDefenseConditionType(o.api_defenseCondition))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container(o: Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container): ST = {
      o match {
        case o: Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_P => return printFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PS => return printFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PS(o)
      }
    }

    @pure def printFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_P(o: Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_P""""),
        ("api_retreatNavigationEvidence", printFrigate_Threat_Response_CoordinatorRetreatNavigationEvidence(o.api_retreatNavigationEvidence))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PS(o: Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PS""""),
        ("api_retreatNavigationEvidence", printFrigate_Threat_Response_CoordinatorRetreatNavigationEvidence(o.api_retreatNavigationEvidence))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container(o: Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container): ST = {
      o match {
        case o: Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_P => return printFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PS => return printFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PS(o)
      }
    }

    @pure def printFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_P(o: Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_P""""),
        ("api_retreatCondition", printFrigate_Threat_Response_CoordinatorRetreatConditionType(o.api_retreatCondition))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PS(o: Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PS""""),
        ("api_retreatCondition", printFrigate_Threat_Response_CoordinatorRetreatConditionType(o.api_retreatCondition))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container(o: Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container): ST = {
      o match {
        case o: Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_P => return printFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PS => return printFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PS(o)
      }
    }

    @pure def printFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_P(o: Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_P""""),
        ("api_defenseCondition", printFrigate_Threat_Response_CoordinatorDefenseConditionType(o.api_defenseCondition)),
        ("api_qualifiedThreat", printFrigate_Threat_Response_CoordinatorQualifiedThreatType(o.api_qualifiedThreat)),
        ("api_responseRequest", printFrigate_Threat_Response_CoordinatorResponseRequest(o.api_responseRequest)),
        ("api_retreatCondition", printFrigate_Threat_Response_CoordinatorRetreatConditionType(o.api_retreatCondition))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PS(o: Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PS""""),
        ("api_defenseCondition", printFrigate_Threat_Response_CoordinatorDefenseConditionType(o.api_defenseCondition)),
        ("api_qualifiedThreat", printFrigate_Threat_Response_CoordinatorQualifiedThreatType(o.api_qualifiedThreat)),
        ("api_responseRequest", printFrigate_Threat_Response_CoordinatorResponseRequest(o.api_responseRequest)),
        ("api_retreatCondition", printFrigate_Threat_Response_CoordinatorRetreatConditionType(o.api_retreatCondition))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container(o: Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container): ST = {
      o match {
        case o: Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_P => return printFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PS => return printFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PS(o)
      }
    }

    @pure def printFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_P(o: Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_P""""),
        ("api_defenseActivation", printFrigate_Threat_Response_CoordinatorDefenseActivationType(o.api_defenseActivation)),
        ("api_responseRecord", printFrigate_Threat_Response_CoordinatorResponseRecord(o.api_responseRecord)),
        ("api_retreatNavigationCommand", printFrigate_Threat_Response_CoordinatorRetreatNavigationCommandType(o.api_retreatNavigationCommand))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PS(o: Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PS""""),
        ("api_defenseActivation", printFrigate_Threat_Response_CoordinatorDefenseActivationType(o.api_defenseActivation)),
        ("api_responseRecord", printFrigate_Threat_Response_CoordinatorResponseRecord(o.api_responseRecord)),
        ("api_retreatNavigationCommand", printFrigate_Threat_Response_CoordinatorRetreatNavigationCommandType(o.api_retreatNavigationCommand))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container(o: Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container): ST = {
      o match {
        case o: Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_P => return printFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PS => return printFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PS(o)
      }
    }

    @pure def printFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_P(o: Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_P""""),
        ("api_reportAcknowledgment", printFrigate_Threat_Response_CoordinatorReportAcknowledgment(o.api_reportAcknowledgment)),
        ("api_responseRecord", printFrigate_Threat_Response_CoordinatorResponseRecord(o.api_responseRecord))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PS(o: Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PS""""),
        ("api_reportAcknowledgment", printFrigate_Threat_Response_CoordinatorReportAcknowledgment(o.api_reportAcknowledgment)),
        ("api_responseRecord", printFrigate_Threat_Response_CoordinatorResponseRecord(o.api_responseRecord))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container(o: Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container): ST = {
      o match {
        case o: Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_P => return printFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PS => return printFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PS(o)
      }
    }

    @pure def printFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_P(o: Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_P""""),
        ("api_threatReport", printFrigate_Threat_Response_CoordinatorThreatReport(o.api_threatReport))
      ))
    }

    @pure def printFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PS(o: Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PS""""),
        ("api_threatReport", printFrigate_Threat_Response_CoordinatorThreatReport(o.api_threatReport))
      ))
    }

    @pure def printruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): ST = {
      val value: String = o match {
        case runtimemonitor.ObservationKind.FrigateThreatResponseCoordinator_Instance_threatResponseProcess_threatEvidenceInterpreter_postInit => "FrigateThreatResponseCoordinator_Instance_threatResponseProcess_threatEvidenceInterpreter_postInit"
        case runtimemonitor.ObservationKind.FrigateThreatResponseCoordinator_Instance_threatResponseProcess_threatEvidenceInterpreter_preCompute => "FrigateThreatResponseCoordinator_Instance_threatResponseProcess_threatEvidenceInterpreter_preCompute"
        case runtimemonitor.ObservationKind.FrigateThreatResponseCoordinator_Instance_threatResponseProcess_threatEvidenceInterpreter_postCompute => "FrigateThreatResponseCoordinator_Instance_threatResponseProcess_threatEvidenceInterpreter_postCompute"
        case runtimemonitor.ObservationKind.FrigateThreatResponseCoordinator_Instance_threatResponseProcess_defenseReadinessAssessor_postInit => "FrigateThreatResponseCoordinator_Instance_threatResponseProcess_defenseReadinessAssessor_postInit"
        case runtimemonitor.ObservationKind.FrigateThreatResponseCoordinator_Instance_threatResponseProcess_defenseReadinessAssessor_preCompute => "FrigateThreatResponseCoordinator_Instance_threatResponseProcess_defenseReadinessAssessor_preCompute"
        case runtimemonitor.ObservationKind.FrigateThreatResponseCoordinator_Instance_threatResponseProcess_defenseReadinessAssessor_postCompute => "FrigateThreatResponseCoordinator_Instance_threatResponseProcess_defenseReadinessAssessor_postCompute"
        case runtimemonitor.ObservationKind.FrigateThreatResponseCoordinator_Instance_threatResponseProcess_retreatReadinessAssessor_postInit => "FrigateThreatResponseCoordinator_Instance_threatResponseProcess_retreatReadinessAssessor_postInit"
        case runtimemonitor.ObservationKind.FrigateThreatResponseCoordinator_Instance_threatResponseProcess_retreatReadinessAssessor_preCompute => "FrigateThreatResponseCoordinator_Instance_threatResponseProcess_retreatReadinessAssessor_preCompute"
        case runtimemonitor.ObservationKind.FrigateThreatResponseCoordinator_Instance_threatResponseProcess_retreatReadinessAssessor_postCompute => "FrigateThreatResponseCoordinator_Instance_threatResponseProcess_retreatReadinessAssessor_postCompute"
        case runtimemonitor.ObservationKind.FrigateThreatResponseCoordinator_Instance_threatResponseProcess_principalResponseCoordinator_postInit => "FrigateThreatResponseCoordinator_Instance_threatResponseProcess_principalResponseCoordinator_postInit"
        case runtimemonitor.ObservationKind.FrigateThreatResponseCoordinator_Instance_threatResponseProcess_principalResponseCoordinator_preCompute => "FrigateThreatResponseCoordinator_Instance_threatResponseProcess_principalResponseCoordinator_preCompute"
        case runtimemonitor.ObservationKind.FrigateThreatResponseCoordinator_Instance_threatResponseProcess_principalResponseCoordinator_postCompute => "FrigateThreatResponseCoordinator_Instance_threatResponseProcess_principalResponseCoordinator_postCompute"
        case runtimemonitor.ObservationKind.FrigateThreatResponseCoordinator_Instance_threatResponseProcess_threatReportComposer_postInit => "FrigateThreatResponseCoordinator_Instance_threatResponseProcess_threatReportComposer_postInit"
        case runtimemonitor.ObservationKind.FrigateThreatResponseCoordinator_Instance_threatResponseProcess_threatReportComposer_preCompute => "FrigateThreatResponseCoordinator_Instance_threatResponseProcess_threatReportComposer_preCompute"
        case runtimemonitor.ObservationKind.FrigateThreatResponseCoordinator_Instance_threatResponseProcess_threatReportComposer_postCompute => "FrigateThreatResponseCoordinator_Instance_threatResponseProcess_threatReportComposer_postCompute"
      }
      return printObject(ISZ(
        ("type", printString("runtimemonitor.ObservationKind")),
        ("value", printString(value))
      ))
    }

    @pure def printutilContainer(o: util.Container): ST = {
      o match {
        case o: util.EmptyContainer => return printutilEmptyContainer(o)
        case o: Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_P => return printFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PS => return printFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_P => return printFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PS => return printFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_P => return printFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_P => return printFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PS => return printFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PS => return printFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_P => return printFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_P => return printFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PS => return printFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PS => return printFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_P => return printFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PS => return printFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_P => return printFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PS => return printFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_P => return printFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PS => return printFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_P => return printFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PS => return printFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PS(o)
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
        case o: Frigate_Threat_Response_Coordinator.WarpProgress_Payload => return printFrigate_Threat_Response_CoordinatorWarpProgress_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.ThreatReport_Payload => return printFrigate_Threat_Response_CoordinatorThreatReport_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.RequestStatus_Payload => return printFrigate_Threat_Response_CoordinatorRequestStatus_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.IdentityStatus_Payload => return printFrigate_Threat_Response_CoordinatorIdentityStatus_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.DroneReadiness_Payload => return printFrigate_Threat_Response_CoordinatorDroneReadiness_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.ReportPriority_Payload => return printFrigate_Threat_Response_CoordinatorReportPriority_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.ResponseRecord_Payload => return printFrigate_Threat_Response_CoordinatorResponseRecord_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.ContactIdentity_Payload => return printFrigate_Threat_Response_CoordinatorContactIdentity_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.QualifiedThreat_Payload => return printFrigate_Threat_Response_CoordinatorQualifiedThreat_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.ResponseRequest_Payload => return printFrigate_Threat_Response_CoordinatorResponseRequest_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.ContactEvidence_Payload => return printFrigate_Threat_Response_CoordinatorContactEvidence_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseEvidence_Payload => return printFrigate_Threat_Response_CoordinatorDefenseEvidence_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.ContactSignature_Payload => return printFrigate_Threat_Response_CoordinatorContactSignature_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseCondition_Payload => return printFrigate_Threat_Response_CoordinatorDefenseCondition_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.RetreatCondition_Payload => return printFrigate_Threat_Response_CoordinatorRetreatCondition_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.DestinationStatus_Payload => return printFrigate_Threat_Response_CoordinatorDestinationStatus_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseActivation_Payload => return printFrigate_Threat_Response_CoordinatorDefenseActivation_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.WarpProgressStatus_Payload => return printFrigate_Threat_Response_CoordinatorWarpProgressStatus_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseAvailability_Payload => return printFrigate_Threat_Response_CoordinatorDefenseAvailability_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.AcknowledgmentValue_Payload => return printFrigate_Threat_Response_CoordinatorAcknowledgmentValue_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.ResponseDisposition_Payload => return printFrigate_Threat_Response_CoordinatorResponseDisposition_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.DroneReadinessStatus_Payload => return printFrigate_Threat_Response_CoordinatorDroneReadinessStatus_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.AcknowledgmentStatus_Payload => return printFrigate_Threat_Response_CoordinatorAcknowledgmentStatus_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.ResponseRequestValue_Payload => return printFrigate_Threat_Response_CoordinatorResponseRequestValue_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.ReportAcknowledgment_Payload => return printFrigate_Threat_Response_CoordinatorReportAcknowledgment_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.ContactSignatureStatus_Payload => return printFrigate_Threat_Response_CoordinatorContactSignatureStatus_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.IdentificationEvidence_Payload => return printFrigate_Threat_Response_CoordinatorIdentificationEvidence_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.RetreatNavigationCommand_Payload => return printFrigate_Threat_Response_CoordinatorRetreatNavigationCommand_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseAvailabilityStatus_Payload => return printFrigate_Threat_Response_CoordinatorDefenseAvailabilityStatus_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.DestinationEvidenceStatus_Payload => return printFrigate_Threat_Response_CoordinatorDestinationEvidenceStatus_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.RetreatNavigationEvidence_Payload => return printFrigate_Threat_Response_CoordinatorRetreatNavigationEvidence_Payload(o)
        case o: Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_P => return printFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PS => return printFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_P => return printFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PS => return printFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_P => return printFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_P => return printFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PS => return printFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PS => return printFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_P => return printFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_P => return printFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PS => return printFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PS => return printFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_P => return printFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PS => return printFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_P => return printFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PS => return printFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_P => return printFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PS => return printFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PS(o)
        case o: Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_P => return printFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_P(o)
        case o: Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PS => return printFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PS(o)
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

    def parseFrigate_Threat_Response_CoordinatorContactSignatureType(): Frigate_Threat_Response_Coordinator.ContactSignature.Type = {
      val r = parseFrigate_Threat_Response_CoordinatorContactSignatureT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorContactSignatureT(typeParsed: B): Frigate_Threat_Response_Coordinator.ContactSignature.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.ContactSignature")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Frigate_Threat_Response_Coordinator.ContactSignature.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Frigate_Threat_Response_Coordinator.ContactSignature.")
          return Frigate_Threat_Response_Coordinator.ContactSignature.byOrdinal(0).get
      }
    }

    def parseFrigate_Threat_Response_CoordinatorContactSignature_Payload(): Frigate_Threat_Response_Coordinator.ContactSignature_Payload = {
      val r = parseFrigate_Threat_Response_CoordinatorContactSignature_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorContactSignature_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.ContactSignature_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.ContactSignature_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Response_CoordinatorContactSignatureType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.ContactSignature_Payload(value)
    }

    def parseFrigate_Threat_Response_CoordinatorContactSignatureStatusType(): Frigate_Threat_Response_Coordinator.ContactSignatureStatus.Type = {
      val r = parseFrigate_Threat_Response_CoordinatorContactSignatureStatusT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorContactSignatureStatusT(typeParsed: B): Frigate_Threat_Response_Coordinator.ContactSignatureStatus.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.ContactSignatureStatus")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Frigate_Threat_Response_Coordinator.ContactSignatureStatus.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Frigate_Threat_Response_Coordinator.ContactSignatureStatus.")
          return Frigate_Threat_Response_Coordinator.ContactSignatureStatus.byOrdinal(0).get
      }
    }

    def parseFrigate_Threat_Response_CoordinatorContactSignatureStatus_Payload(): Frigate_Threat_Response_Coordinator.ContactSignatureStatus_Payload = {
      val r = parseFrigate_Threat_Response_CoordinatorContactSignatureStatus_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorContactSignatureStatus_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.ContactSignatureStatus_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.ContactSignatureStatus_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Response_CoordinatorContactSignatureStatusType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.ContactSignatureStatus_Payload(value)
    }

    def parseFrigate_Threat_Response_CoordinatorContactIdentityType(): Frigate_Threat_Response_Coordinator.ContactIdentity.Type = {
      val r = parseFrigate_Threat_Response_CoordinatorContactIdentityT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorContactIdentityT(typeParsed: B): Frigate_Threat_Response_Coordinator.ContactIdentity.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.ContactIdentity")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Frigate_Threat_Response_Coordinator.ContactIdentity.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Frigate_Threat_Response_Coordinator.ContactIdentity.")
          return Frigate_Threat_Response_Coordinator.ContactIdentity.byOrdinal(0).get
      }
    }

    def parseFrigate_Threat_Response_CoordinatorContactIdentity_Payload(): Frigate_Threat_Response_Coordinator.ContactIdentity_Payload = {
      val r = parseFrigate_Threat_Response_CoordinatorContactIdentity_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorContactIdentity_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.ContactIdentity_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.ContactIdentity_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Response_CoordinatorContactIdentityType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.ContactIdentity_Payload(value)
    }

    def parseFrigate_Threat_Response_CoordinatorIdentityStatusType(): Frigate_Threat_Response_Coordinator.IdentityStatus.Type = {
      val r = parseFrigate_Threat_Response_CoordinatorIdentityStatusT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorIdentityStatusT(typeParsed: B): Frigate_Threat_Response_Coordinator.IdentityStatus.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.IdentityStatus")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Frigate_Threat_Response_Coordinator.IdentityStatus.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Frigate_Threat_Response_Coordinator.IdentityStatus.")
          return Frigate_Threat_Response_Coordinator.IdentityStatus.byOrdinal(0).get
      }
    }

    def parseFrigate_Threat_Response_CoordinatorIdentityStatus_Payload(): Frigate_Threat_Response_Coordinator.IdentityStatus_Payload = {
      val r = parseFrigate_Threat_Response_CoordinatorIdentityStatus_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorIdentityStatus_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.IdentityStatus_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.IdentityStatus_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Response_CoordinatorIdentityStatusType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.IdentityStatus_Payload(value)
    }

    def parseFrigate_Threat_Response_CoordinatorQualifiedThreatType(): Frigate_Threat_Response_Coordinator.QualifiedThreat.Type = {
      val r = parseFrigate_Threat_Response_CoordinatorQualifiedThreatT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorQualifiedThreatT(typeParsed: B): Frigate_Threat_Response_Coordinator.QualifiedThreat.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.QualifiedThreat")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Frigate_Threat_Response_Coordinator.QualifiedThreat.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Frigate_Threat_Response_Coordinator.QualifiedThreat.")
          return Frigate_Threat_Response_Coordinator.QualifiedThreat.byOrdinal(0).get
      }
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
      val value = parseFrigate_Threat_Response_CoordinatorQualifiedThreatType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.QualifiedThreat_Payload(value)
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseAvailabilityType(): Frigate_Threat_Response_Coordinator.DefenseAvailability.Type = {
      val r = parseFrigate_Threat_Response_CoordinatorDefenseAvailabilityT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseAvailabilityT(typeParsed: B): Frigate_Threat_Response_Coordinator.DefenseAvailability.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.DefenseAvailability")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Frigate_Threat_Response_Coordinator.DefenseAvailability.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Frigate_Threat_Response_Coordinator.DefenseAvailability.")
          return Frigate_Threat_Response_Coordinator.DefenseAvailability.byOrdinal(0).get
      }
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseAvailability_Payload(): Frigate_Threat_Response_Coordinator.DefenseAvailability_Payload = {
      val r = parseFrigate_Threat_Response_CoordinatorDefenseAvailability_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseAvailability_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.DefenseAvailability_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.DefenseAvailability_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Response_CoordinatorDefenseAvailabilityType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.DefenseAvailability_Payload(value)
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseAvailabilityStatusType(): Frigate_Threat_Response_Coordinator.DefenseAvailabilityStatus.Type = {
      val r = parseFrigate_Threat_Response_CoordinatorDefenseAvailabilityStatusT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseAvailabilityStatusT(typeParsed: B): Frigate_Threat_Response_Coordinator.DefenseAvailabilityStatus.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.DefenseAvailabilityStatus")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Frigate_Threat_Response_Coordinator.DefenseAvailabilityStatus.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Frigate_Threat_Response_Coordinator.DefenseAvailabilityStatus.")
          return Frigate_Threat_Response_Coordinator.DefenseAvailabilityStatus.byOrdinal(0).get
      }
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseAvailabilityStatus_Payload(): Frigate_Threat_Response_Coordinator.DefenseAvailabilityStatus_Payload = {
      val r = parseFrigate_Threat_Response_CoordinatorDefenseAvailabilityStatus_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseAvailabilityStatus_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.DefenseAvailabilityStatus_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.DefenseAvailabilityStatus_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Response_CoordinatorDefenseAvailabilityStatusType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.DefenseAvailabilityStatus_Payload(value)
    }

    def parseFrigate_Threat_Response_CoordinatorDroneReadinessType(): Frigate_Threat_Response_Coordinator.DroneReadiness.Type = {
      val r = parseFrigate_Threat_Response_CoordinatorDroneReadinessT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorDroneReadinessT(typeParsed: B): Frigate_Threat_Response_Coordinator.DroneReadiness.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.DroneReadiness")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Frigate_Threat_Response_Coordinator.DroneReadiness.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Frigate_Threat_Response_Coordinator.DroneReadiness.")
          return Frigate_Threat_Response_Coordinator.DroneReadiness.byOrdinal(0).get
      }
    }

    def parseFrigate_Threat_Response_CoordinatorDroneReadiness_Payload(): Frigate_Threat_Response_Coordinator.DroneReadiness_Payload = {
      val r = parseFrigate_Threat_Response_CoordinatorDroneReadiness_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorDroneReadiness_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.DroneReadiness_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.DroneReadiness_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Response_CoordinatorDroneReadinessType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.DroneReadiness_Payload(value)
    }

    def parseFrigate_Threat_Response_CoordinatorDroneReadinessStatusType(): Frigate_Threat_Response_Coordinator.DroneReadinessStatus.Type = {
      val r = parseFrigate_Threat_Response_CoordinatorDroneReadinessStatusT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorDroneReadinessStatusT(typeParsed: B): Frigate_Threat_Response_Coordinator.DroneReadinessStatus.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.DroneReadinessStatus")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Frigate_Threat_Response_Coordinator.DroneReadinessStatus.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Frigate_Threat_Response_Coordinator.DroneReadinessStatus.")
          return Frigate_Threat_Response_Coordinator.DroneReadinessStatus.byOrdinal(0).get
      }
    }

    def parseFrigate_Threat_Response_CoordinatorDroneReadinessStatus_Payload(): Frigate_Threat_Response_Coordinator.DroneReadinessStatus_Payload = {
      val r = parseFrigate_Threat_Response_CoordinatorDroneReadinessStatus_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorDroneReadinessStatus_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.DroneReadinessStatus_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.DroneReadinessStatus_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Response_CoordinatorDroneReadinessStatusType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.DroneReadinessStatus_Payload(value)
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseConditionType(): Frigate_Threat_Response_Coordinator.DefenseCondition.Type = {
      val r = parseFrigate_Threat_Response_CoordinatorDefenseConditionT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseConditionT(typeParsed: B): Frigate_Threat_Response_Coordinator.DefenseCondition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.DefenseCondition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Frigate_Threat_Response_Coordinator.DefenseCondition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Frigate_Threat_Response_Coordinator.DefenseCondition.")
          return Frigate_Threat_Response_Coordinator.DefenseCondition.byOrdinal(0).get
      }
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseCondition_Payload(): Frigate_Threat_Response_Coordinator.DefenseCondition_Payload = {
      val r = parseFrigate_Threat_Response_CoordinatorDefenseCondition_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseCondition_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.DefenseCondition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.DefenseCondition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Response_CoordinatorDefenseConditionType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.DefenseCondition_Payload(value)
    }

    def parseFrigate_Threat_Response_CoordinatorDestinationStatusType(): Frigate_Threat_Response_Coordinator.DestinationStatus.Type = {
      val r = parseFrigate_Threat_Response_CoordinatorDestinationStatusT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorDestinationStatusT(typeParsed: B): Frigate_Threat_Response_Coordinator.DestinationStatus.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.DestinationStatus")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Frigate_Threat_Response_Coordinator.DestinationStatus.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Frigate_Threat_Response_Coordinator.DestinationStatus.")
          return Frigate_Threat_Response_Coordinator.DestinationStatus.byOrdinal(0).get
      }
    }

    def parseFrigate_Threat_Response_CoordinatorDestinationStatus_Payload(): Frigate_Threat_Response_Coordinator.DestinationStatus_Payload = {
      val r = parseFrigate_Threat_Response_CoordinatorDestinationStatus_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorDestinationStatus_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.DestinationStatus_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.DestinationStatus_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Response_CoordinatorDestinationStatusType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.DestinationStatus_Payload(value)
    }

    def parseFrigate_Threat_Response_CoordinatorDestinationEvidenceStatusType(): Frigate_Threat_Response_Coordinator.DestinationEvidenceStatus.Type = {
      val r = parseFrigate_Threat_Response_CoordinatorDestinationEvidenceStatusT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorDestinationEvidenceStatusT(typeParsed: B): Frigate_Threat_Response_Coordinator.DestinationEvidenceStatus.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.DestinationEvidenceStatus")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Frigate_Threat_Response_Coordinator.DestinationEvidenceStatus.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Frigate_Threat_Response_Coordinator.DestinationEvidenceStatus.")
          return Frigate_Threat_Response_Coordinator.DestinationEvidenceStatus.byOrdinal(0).get
      }
    }

    def parseFrigate_Threat_Response_CoordinatorDestinationEvidenceStatus_Payload(): Frigate_Threat_Response_Coordinator.DestinationEvidenceStatus_Payload = {
      val r = parseFrigate_Threat_Response_CoordinatorDestinationEvidenceStatus_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorDestinationEvidenceStatus_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.DestinationEvidenceStatus_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.DestinationEvidenceStatus_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Response_CoordinatorDestinationEvidenceStatusType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.DestinationEvidenceStatus_Payload(value)
    }

    def parseFrigate_Threat_Response_CoordinatorWarpProgressType(): Frigate_Threat_Response_Coordinator.WarpProgress.Type = {
      val r = parseFrigate_Threat_Response_CoordinatorWarpProgressT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorWarpProgressT(typeParsed: B): Frigate_Threat_Response_Coordinator.WarpProgress.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.WarpProgress")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Frigate_Threat_Response_Coordinator.WarpProgress.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Frigate_Threat_Response_Coordinator.WarpProgress.")
          return Frigate_Threat_Response_Coordinator.WarpProgress.byOrdinal(0).get
      }
    }

    def parseFrigate_Threat_Response_CoordinatorWarpProgress_Payload(): Frigate_Threat_Response_Coordinator.WarpProgress_Payload = {
      val r = parseFrigate_Threat_Response_CoordinatorWarpProgress_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorWarpProgress_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.WarpProgress_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.WarpProgress_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Response_CoordinatorWarpProgressType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.WarpProgress_Payload(value)
    }

    def parseFrigate_Threat_Response_CoordinatorWarpProgressStatusType(): Frigate_Threat_Response_Coordinator.WarpProgressStatus.Type = {
      val r = parseFrigate_Threat_Response_CoordinatorWarpProgressStatusT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorWarpProgressStatusT(typeParsed: B): Frigate_Threat_Response_Coordinator.WarpProgressStatus.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.WarpProgressStatus")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Frigate_Threat_Response_Coordinator.WarpProgressStatus.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Frigate_Threat_Response_Coordinator.WarpProgressStatus.")
          return Frigate_Threat_Response_Coordinator.WarpProgressStatus.byOrdinal(0).get
      }
    }

    def parseFrigate_Threat_Response_CoordinatorWarpProgressStatus_Payload(): Frigate_Threat_Response_Coordinator.WarpProgressStatus_Payload = {
      val r = parseFrigate_Threat_Response_CoordinatorWarpProgressStatus_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorWarpProgressStatus_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.WarpProgressStatus_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.WarpProgressStatus_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Response_CoordinatorWarpProgressStatusType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.WarpProgressStatus_Payload(value)
    }

    def parseFrigate_Threat_Response_CoordinatorRetreatConditionType(): Frigate_Threat_Response_Coordinator.RetreatCondition.Type = {
      val r = parseFrigate_Threat_Response_CoordinatorRetreatConditionT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorRetreatConditionT(typeParsed: B): Frigate_Threat_Response_Coordinator.RetreatCondition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.RetreatCondition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Frigate_Threat_Response_Coordinator.RetreatCondition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Frigate_Threat_Response_Coordinator.RetreatCondition.")
          return Frigate_Threat_Response_Coordinator.RetreatCondition.byOrdinal(0).get
      }
    }

    def parseFrigate_Threat_Response_CoordinatorRetreatCondition_Payload(): Frigate_Threat_Response_Coordinator.RetreatCondition_Payload = {
      val r = parseFrigate_Threat_Response_CoordinatorRetreatCondition_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorRetreatCondition_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.RetreatCondition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.RetreatCondition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Response_CoordinatorRetreatConditionType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.RetreatCondition_Payload(value)
    }

    def parseFrigate_Threat_Response_CoordinatorResponseRequestValueType(): Frigate_Threat_Response_Coordinator.ResponseRequestValue.Type = {
      val r = parseFrigate_Threat_Response_CoordinatorResponseRequestValueT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorResponseRequestValueT(typeParsed: B): Frigate_Threat_Response_Coordinator.ResponseRequestValue.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.ResponseRequestValue")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Frigate_Threat_Response_Coordinator.ResponseRequestValue.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Frigate_Threat_Response_Coordinator.ResponseRequestValue.")
          return Frigate_Threat_Response_Coordinator.ResponseRequestValue.byOrdinal(0).get
      }
    }

    def parseFrigate_Threat_Response_CoordinatorResponseRequestValue_Payload(): Frigate_Threat_Response_Coordinator.ResponseRequestValue_Payload = {
      val r = parseFrigate_Threat_Response_CoordinatorResponseRequestValue_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorResponseRequestValue_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.ResponseRequestValue_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.ResponseRequestValue_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Response_CoordinatorResponseRequestValueType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.ResponseRequestValue_Payload(value)
    }

    def parseFrigate_Threat_Response_CoordinatorRequestStatusType(): Frigate_Threat_Response_Coordinator.RequestStatus.Type = {
      val r = parseFrigate_Threat_Response_CoordinatorRequestStatusT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorRequestStatusT(typeParsed: B): Frigate_Threat_Response_Coordinator.RequestStatus.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.RequestStatus")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Frigate_Threat_Response_Coordinator.RequestStatus.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Frigate_Threat_Response_Coordinator.RequestStatus.")
          return Frigate_Threat_Response_Coordinator.RequestStatus.byOrdinal(0).get
      }
    }

    def parseFrigate_Threat_Response_CoordinatorRequestStatus_Payload(): Frigate_Threat_Response_Coordinator.RequestStatus_Payload = {
      val r = parseFrigate_Threat_Response_CoordinatorRequestStatus_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorRequestStatus_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.RequestStatus_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.RequestStatus_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Response_CoordinatorRequestStatusType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.RequestStatus_Payload(value)
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseActivationType(): Frigate_Threat_Response_Coordinator.DefenseActivation.Type = {
      val r = parseFrigate_Threat_Response_CoordinatorDefenseActivationT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseActivationT(typeParsed: B): Frigate_Threat_Response_Coordinator.DefenseActivation.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.DefenseActivation")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Frigate_Threat_Response_Coordinator.DefenseActivation.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Frigate_Threat_Response_Coordinator.DefenseActivation.")
          return Frigate_Threat_Response_Coordinator.DefenseActivation.byOrdinal(0).get
      }
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseActivation_Payload(): Frigate_Threat_Response_Coordinator.DefenseActivation_Payload = {
      val r = parseFrigate_Threat_Response_CoordinatorDefenseActivation_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseActivation_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.DefenseActivation_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.DefenseActivation_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Response_CoordinatorDefenseActivationType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.DefenseActivation_Payload(value)
    }

    def parseFrigate_Threat_Response_CoordinatorRetreatNavigationCommandType(): Frigate_Threat_Response_Coordinator.RetreatNavigationCommand.Type = {
      val r = parseFrigate_Threat_Response_CoordinatorRetreatNavigationCommandT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorRetreatNavigationCommandT(typeParsed: B): Frigate_Threat_Response_Coordinator.RetreatNavigationCommand.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.RetreatNavigationCommand")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Frigate_Threat_Response_Coordinator.RetreatNavigationCommand.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Frigate_Threat_Response_Coordinator.RetreatNavigationCommand.")
          return Frigate_Threat_Response_Coordinator.RetreatNavigationCommand.byOrdinal(0).get
      }
    }

    def parseFrigate_Threat_Response_CoordinatorRetreatNavigationCommand_Payload(): Frigate_Threat_Response_Coordinator.RetreatNavigationCommand_Payload = {
      val r = parseFrigate_Threat_Response_CoordinatorRetreatNavigationCommand_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorRetreatNavigationCommand_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.RetreatNavigationCommand_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.RetreatNavigationCommand_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Response_CoordinatorRetreatNavigationCommandType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.RetreatNavigationCommand_Payload(value)
    }

    def parseFrigate_Threat_Response_CoordinatorResponseDispositionType(): Frigate_Threat_Response_Coordinator.ResponseDisposition.Type = {
      val r = parseFrigate_Threat_Response_CoordinatorResponseDispositionT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorResponseDispositionT(typeParsed: B): Frigate_Threat_Response_Coordinator.ResponseDisposition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.ResponseDisposition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Frigate_Threat_Response_Coordinator.ResponseDisposition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Frigate_Threat_Response_Coordinator.ResponseDisposition.")
          return Frigate_Threat_Response_Coordinator.ResponseDisposition.byOrdinal(0).get
      }
    }

    def parseFrigate_Threat_Response_CoordinatorResponseDisposition_Payload(): Frigate_Threat_Response_Coordinator.ResponseDisposition_Payload = {
      val r = parseFrigate_Threat_Response_CoordinatorResponseDisposition_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorResponseDisposition_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.ResponseDisposition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.ResponseDisposition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Response_CoordinatorResponseDispositionType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.ResponseDisposition_Payload(value)
    }

    def parseFrigate_Threat_Response_CoordinatorAcknowledgmentValueType(): Frigate_Threat_Response_Coordinator.AcknowledgmentValue.Type = {
      val r = parseFrigate_Threat_Response_CoordinatorAcknowledgmentValueT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorAcknowledgmentValueT(typeParsed: B): Frigate_Threat_Response_Coordinator.AcknowledgmentValue.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.AcknowledgmentValue")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Frigate_Threat_Response_Coordinator.AcknowledgmentValue.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Frigate_Threat_Response_Coordinator.AcknowledgmentValue.")
          return Frigate_Threat_Response_Coordinator.AcknowledgmentValue.byOrdinal(0).get
      }
    }

    def parseFrigate_Threat_Response_CoordinatorAcknowledgmentValue_Payload(): Frigate_Threat_Response_Coordinator.AcknowledgmentValue_Payload = {
      val r = parseFrigate_Threat_Response_CoordinatorAcknowledgmentValue_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorAcknowledgmentValue_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.AcknowledgmentValue_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.AcknowledgmentValue_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Response_CoordinatorAcknowledgmentValueType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.AcknowledgmentValue_Payload(value)
    }

    def parseFrigate_Threat_Response_CoordinatorAcknowledgmentStatusType(): Frigate_Threat_Response_Coordinator.AcknowledgmentStatus.Type = {
      val r = parseFrigate_Threat_Response_CoordinatorAcknowledgmentStatusT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorAcknowledgmentStatusT(typeParsed: B): Frigate_Threat_Response_Coordinator.AcknowledgmentStatus.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.AcknowledgmentStatus")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Frigate_Threat_Response_Coordinator.AcknowledgmentStatus.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Frigate_Threat_Response_Coordinator.AcknowledgmentStatus.")
          return Frigate_Threat_Response_Coordinator.AcknowledgmentStatus.byOrdinal(0).get
      }
    }

    def parseFrigate_Threat_Response_CoordinatorAcknowledgmentStatus_Payload(): Frigate_Threat_Response_Coordinator.AcknowledgmentStatus_Payload = {
      val r = parseFrigate_Threat_Response_CoordinatorAcknowledgmentStatus_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorAcknowledgmentStatus_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.AcknowledgmentStatus_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.AcknowledgmentStatus_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Response_CoordinatorAcknowledgmentStatusType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.AcknowledgmentStatus_Payload(value)
    }

    def parseFrigate_Threat_Response_CoordinatorReportPriorityType(): Frigate_Threat_Response_Coordinator.ReportPriority.Type = {
      val r = parseFrigate_Threat_Response_CoordinatorReportPriorityT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorReportPriorityT(typeParsed: B): Frigate_Threat_Response_Coordinator.ReportPriority.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.ReportPriority")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Frigate_Threat_Response_Coordinator.ReportPriority.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Frigate_Threat_Response_Coordinator.ReportPriority.")
          return Frigate_Threat_Response_Coordinator.ReportPriority.byOrdinal(0).get
      }
    }

    def parseFrigate_Threat_Response_CoordinatorReportPriority_Payload(): Frigate_Threat_Response_Coordinator.ReportPriority_Payload = {
      val r = parseFrigate_Threat_Response_CoordinatorReportPriority_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorReportPriority_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.ReportPriority_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.ReportPriority_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Response_CoordinatorReportPriorityType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.ReportPriority_Payload(value)
    }

    def parseFrigate_Threat_Response_CoordinatorContactEvidence(): Frigate_Threat_Response_Coordinator.ContactEvidence = {
      val r = parseFrigate_Threat_Response_CoordinatorContactEvidenceT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorContactEvidenceT(typeParsed: B): Frigate_Threat_Response_Coordinator.ContactEvidence = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.ContactEvidence")
      }
      parser.parseObjectKey("signature")
      val signature = parseFrigate_Threat_Response_CoordinatorContactSignatureType()
      parser.parseObjectNext()
      parser.parseObjectKey("signatureStatus")
      val signatureStatus = parseFrigate_Threat_Response_CoordinatorContactSignatureStatusType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.ContactEvidence(signature, signatureStatus)
    }

    def parseFrigate_Threat_Response_CoordinatorContactEvidence_Payload(): Frigate_Threat_Response_Coordinator.ContactEvidence_Payload = {
      val r = parseFrigate_Threat_Response_CoordinatorContactEvidence_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorContactEvidence_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.ContactEvidence_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.ContactEvidence_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Response_CoordinatorContactEvidence()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.ContactEvidence_Payload(value)
    }

    def parseFrigate_Threat_Response_CoordinatorIdentificationEvidence(): Frigate_Threat_Response_Coordinator.IdentificationEvidence = {
      val r = parseFrigate_Threat_Response_CoordinatorIdentificationEvidenceT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorIdentificationEvidenceT(typeParsed: B): Frigate_Threat_Response_Coordinator.IdentificationEvidence = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.IdentificationEvidence")
      }
      parser.parseObjectKey("identity")
      val identity = parseFrigate_Threat_Response_CoordinatorContactIdentityType()
      parser.parseObjectNext()
      parser.parseObjectKey("identityStatus")
      val identityStatus = parseFrigate_Threat_Response_CoordinatorIdentityStatusType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.IdentificationEvidence(identity, identityStatus)
    }

    def parseFrigate_Threat_Response_CoordinatorIdentificationEvidence_Payload(): Frigate_Threat_Response_Coordinator.IdentificationEvidence_Payload = {
      val r = parseFrigate_Threat_Response_CoordinatorIdentificationEvidence_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorIdentificationEvidence_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.IdentificationEvidence_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.IdentificationEvidence_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Response_CoordinatorIdentificationEvidence()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.IdentificationEvidence_Payload(value)
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseEvidence(): Frigate_Threat_Response_Coordinator.DefenseEvidence = {
      val r = parseFrigate_Threat_Response_CoordinatorDefenseEvidenceT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseEvidenceT(typeParsed: B): Frigate_Threat_Response_Coordinator.DefenseEvidence = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.DefenseEvidence")
      }
      parser.parseObjectKey("defenseAvailable")
      val defenseAvailable = parseFrigate_Threat_Response_CoordinatorDefenseAvailabilityType()
      parser.parseObjectNext()
      parser.parseObjectKey("defenseStatus")
      val defenseStatus = parseFrigate_Threat_Response_CoordinatorDefenseAvailabilityStatusType()
      parser.parseObjectNext()
      parser.parseObjectKey("droneReadiness")
      val droneReadiness = parseFrigate_Threat_Response_CoordinatorDroneReadinessType()
      parser.parseObjectNext()
      parser.parseObjectKey("droneStatus")
      val droneStatus = parseFrigate_Threat_Response_CoordinatorDroneReadinessStatusType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.DefenseEvidence(defenseAvailable, defenseStatus, droneReadiness, droneStatus)
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseEvidence_Payload(): Frigate_Threat_Response_Coordinator.DefenseEvidence_Payload = {
      val r = parseFrigate_Threat_Response_CoordinatorDefenseEvidence_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseEvidence_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.DefenseEvidence_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.DefenseEvidence_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Response_CoordinatorDefenseEvidence()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.DefenseEvidence_Payload(value)
    }

    def parseFrigate_Threat_Response_CoordinatorRetreatNavigationEvidence(): Frigate_Threat_Response_Coordinator.RetreatNavigationEvidence = {
      val r = parseFrigate_Threat_Response_CoordinatorRetreatNavigationEvidenceT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorRetreatNavigationEvidenceT(typeParsed: B): Frigate_Threat_Response_Coordinator.RetreatNavigationEvidence = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.RetreatNavigationEvidence")
      }
      parser.parseObjectKey("destination")
      val destination = parseFrigate_Threat_Response_CoordinatorDestinationStatusType()
      parser.parseObjectNext()
      parser.parseObjectKey("destinationStatus")
      val destinationStatus = parseFrigate_Threat_Response_CoordinatorDestinationEvidenceStatusType()
      parser.parseObjectNext()
      parser.parseObjectKey("warpProgress")
      val warpProgress = parseFrigate_Threat_Response_CoordinatorWarpProgressType()
      parser.parseObjectNext()
      parser.parseObjectKey("warpStatus")
      val warpStatus = parseFrigate_Threat_Response_CoordinatorWarpProgressStatusType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.RetreatNavigationEvidence(destination, destinationStatus, warpProgress, warpStatus)
    }

    def parseFrigate_Threat_Response_CoordinatorRetreatNavigationEvidence_Payload(): Frigate_Threat_Response_Coordinator.RetreatNavigationEvidence_Payload = {
      val r = parseFrigate_Threat_Response_CoordinatorRetreatNavigationEvidence_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorRetreatNavigationEvidence_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.RetreatNavigationEvidence_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.RetreatNavigationEvidence_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Response_CoordinatorRetreatNavigationEvidence()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.RetreatNavigationEvidence_Payload(value)
    }

    def parseFrigate_Threat_Response_CoordinatorResponseRequest(): Frigate_Threat_Response_Coordinator.ResponseRequest = {
      val r = parseFrigate_Threat_Response_CoordinatorResponseRequestT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorResponseRequestT(typeParsed: B): Frigate_Threat_Response_Coordinator.ResponseRequest = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.ResponseRequest")
      }
      parser.parseObjectKey("request")
      val request = parseFrigate_Threat_Response_CoordinatorResponseRequestValueType()
      parser.parseObjectNext()
      parser.parseObjectKey("requestStatus")
      val requestStatus = parseFrigate_Threat_Response_CoordinatorRequestStatusType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.ResponseRequest(request, requestStatus)
    }

    def parseFrigate_Threat_Response_CoordinatorResponseRequest_Payload(): Frigate_Threat_Response_Coordinator.ResponseRequest_Payload = {
      val r = parseFrigate_Threat_Response_CoordinatorResponseRequest_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorResponseRequest_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.ResponseRequest_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.ResponseRequest_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Response_CoordinatorResponseRequest()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.ResponseRequest_Payload(value)
    }

    def parseFrigate_Threat_Response_CoordinatorResponseRecord(): Frigate_Threat_Response_Coordinator.ResponseRecord = {
      val r = parseFrigate_Threat_Response_CoordinatorResponseRecordT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorResponseRecordT(typeParsed: B): Frigate_Threat_Response_Coordinator.ResponseRecord = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.ResponseRecord")
      }
      parser.parseObjectKey("qualifiedThreat")
      val qualifiedThreat = parseFrigate_Threat_Response_CoordinatorQualifiedThreatType()
      parser.parseObjectNext()
      parser.parseObjectKey("disposition")
      val disposition = parseFrigate_Threat_Response_CoordinatorResponseDispositionType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.ResponseRecord(qualifiedThreat, disposition)
    }

    def parseFrigate_Threat_Response_CoordinatorResponseRecord_Payload(): Frigate_Threat_Response_Coordinator.ResponseRecord_Payload = {
      val r = parseFrigate_Threat_Response_CoordinatorResponseRecord_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorResponseRecord_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.ResponseRecord_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.ResponseRecord_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Response_CoordinatorResponseRecord()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.ResponseRecord_Payload(value)
    }

    def parseFrigate_Threat_Response_CoordinatorReportAcknowledgment(): Frigate_Threat_Response_Coordinator.ReportAcknowledgment = {
      val r = parseFrigate_Threat_Response_CoordinatorReportAcknowledgmentT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorReportAcknowledgmentT(typeParsed: B): Frigate_Threat_Response_Coordinator.ReportAcknowledgment = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.ReportAcknowledgment")
      }
      parser.parseObjectKey("acknowledgment")
      val acknowledgment = parseFrigate_Threat_Response_CoordinatorAcknowledgmentValueType()
      parser.parseObjectNext()
      parser.parseObjectKey("acknowledgmentStatus")
      val acknowledgmentStatus = parseFrigate_Threat_Response_CoordinatorAcknowledgmentStatusType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.ReportAcknowledgment(acknowledgment, acknowledgmentStatus)
    }

    def parseFrigate_Threat_Response_CoordinatorReportAcknowledgment_Payload(): Frigate_Threat_Response_Coordinator.ReportAcknowledgment_Payload = {
      val r = parseFrigate_Threat_Response_CoordinatorReportAcknowledgment_PayloadT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorReportAcknowledgment_PayloadT(typeParsed: B): Frigate_Threat_Response_Coordinator.ReportAcknowledgment_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.ReportAcknowledgment_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFrigate_Threat_Response_CoordinatorReportAcknowledgment()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.ReportAcknowledgment_Payload(value)
    }

    def parseFrigate_Threat_Response_CoordinatorThreatReport(): Frigate_Threat_Response_Coordinator.ThreatReport = {
      val r = parseFrigate_Threat_Response_CoordinatorThreatReportT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorThreatReportT(typeParsed: B): Frigate_Threat_Response_Coordinator.ThreatReport = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.ThreatReport")
      }
      parser.parseObjectKey("qualifiedThreat")
      val qualifiedThreat = parseFrigate_Threat_Response_CoordinatorQualifiedThreatType()
      parser.parseObjectNext()
      parser.parseObjectKey("disposition")
      val disposition = parseFrigate_Threat_Response_CoordinatorResponseDispositionType()
      parser.parseObjectNext()
      parser.parseObjectKey("priority")
      val priority = parseFrigate_Threat_Response_CoordinatorReportPriorityType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.ThreatReport(qualifiedThreat, disposition, priority)
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
      val value = parseFrigate_Threat_Response_CoordinatorThreatReport()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.ThreatReport_Payload(value)
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

    def parseFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container(): Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_P", "Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PS"))
      t.native match {
        case "Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PST(T); return r
        case _ => val r = parseFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PST(T); return r
      }
    }

    def parseFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_P(): Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_P = {
      val r = parseFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PT(typeParsed: B): Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_P")
      }
      parser.parseObjectKey("api_contactEvidence")
      val api_contactEvidence = parseFrigate_Threat_Response_CoordinatorContactEvidence()
      parser.parseObjectNext()
      parser.parseObjectKey("api_identificationEvidence")
      val api_identificationEvidence = parseFrigate_Threat_Response_CoordinatorIdentificationEvidence()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_P(api_contactEvidence, api_identificationEvidence)
    }

    def parseFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PS(): Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PS = {
      val r = parseFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PST(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PST(typeParsed: B): Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PS")
      }
      parser.parseObjectKey("api_contactEvidence")
      val api_contactEvidence = parseFrigate_Threat_Response_CoordinatorContactEvidence()
      parser.parseObjectNext()
      parser.parseObjectKey("api_identificationEvidence")
      val api_identificationEvidence = parseFrigate_Threat_Response_CoordinatorIdentificationEvidence()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PS(api_contactEvidence, api_identificationEvidence)
    }

    def parseFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container(): Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_P", "Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PS"))
      t.native match {
        case "Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PST(T); return r
        case _ => val r = parseFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PST(T); return r
      }
    }

    def parseFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_P(): Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_P = {
      val r = parseFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PT(typeParsed: B): Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_P")
      }
      parser.parseObjectKey("api_qualifiedThreat")
      val api_qualifiedThreat = parseFrigate_Threat_Response_CoordinatorQualifiedThreatType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_P(api_qualifiedThreat)
    }

    def parseFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PS(): Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PS = {
      val r = parseFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PST(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PST(typeParsed: B): Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PS")
      }
      parser.parseObjectKey("api_qualifiedThreat")
      val api_qualifiedThreat = parseFrigate_Threat_Response_CoordinatorQualifiedThreatType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PS(api_qualifiedThreat)
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container(): Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_P", "Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PS"))
      t.native match {
        case "Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PST(T); return r
        case _ => val r = parseFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PST(T); return r
      }
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_P(): Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_P = {
      val r = parseFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PT(typeParsed: B): Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_P")
      }
      parser.parseObjectKey("api_defenseEvidence")
      val api_defenseEvidence = parseFrigate_Threat_Response_CoordinatorDefenseEvidence()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_P(api_defenseEvidence)
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PS(): Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PS = {
      val r = parseFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PST(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PST(typeParsed: B): Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PS")
      }
      parser.parseObjectKey("api_defenseEvidence")
      val api_defenseEvidence = parseFrigate_Threat_Response_CoordinatorDefenseEvidence()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PS(api_defenseEvidence)
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container(): Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_P", "Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PS"))
      t.native match {
        case "Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PST(T); return r
        case _ => val r = parseFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PST(T); return r
      }
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_P(): Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_P = {
      val r = parseFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PT(typeParsed: B): Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_P")
      }
      parser.parseObjectKey("api_defenseCondition")
      val api_defenseCondition = parseFrigate_Threat_Response_CoordinatorDefenseConditionType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_P(api_defenseCondition)
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PS(): Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PS = {
      val r = parseFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PST(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PST(typeParsed: B): Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PS")
      }
      parser.parseObjectKey("api_defenseCondition")
      val api_defenseCondition = parseFrigate_Threat_Response_CoordinatorDefenseConditionType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PS(api_defenseCondition)
    }

    def parseFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container(): Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_P", "Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PS"))
      t.native match {
        case "Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PST(T); return r
        case _ => val r = parseFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PST(T); return r
      }
    }

    def parseFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_P(): Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_P = {
      val r = parseFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PT(typeParsed: B): Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_P")
      }
      parser.parseObjectKey("api_retreatNavigationEvidence")
      val api_retreatNavigationEvidence = parseFrigate_Threat_Response_CoordinatorRetreatNavigationEvidence()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_P(api_retreatNavigationEvidence)
    }

    def parseFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PS(): Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PS = {
      val r = parseFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PST(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PST(typeParsed: B): Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PS")
      }
      parser.parseObjectKey("api_retreatNavigationEvidence")
      val api_retreatNavigationEvidence = parseFrigate_Threat_Response_CoordinatorRetreatNavigationEvidence()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PS(api_retreatNavigationEvidence)
    }

    def parseFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container(): Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_P", "Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PS"))
      t.native match {
        case "Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PST(T); return r
        case _ => val r = parseFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PST(T); return r
      }
    }

    def parseFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_P(): Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_P = {
      val r = parseFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PT(typeParsed: B): Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_P")
      }
      parser.parseObjectKey("api_retreatCondition")
      val api_retreatCondition = parseFrigate_Threat_Response_CoordinatorRetreatConditionType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_P(api_retreatCondition)
    }

    def parseFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PS(): Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PS = {
      val r = parseFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PST(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PST(typeParsed: B): Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PS")
      }
      parser.parseObjectKey("api_retreatCondition")
      val api_retreatCondition = parseFrigate_Threat_Response_CoordinatorRetreatConditionType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PS(api_retreatCondition)
    }

    def parseFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container(): Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_P", "Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PS"))
      t.native match {
        case "Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PST(T); return r
        case _ => val r = parseFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PST(T); return r
      }
    }

    def parseFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_P(): Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_P = {
      val r = parseFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PT(typeParsed: B): Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_P")
      }
      parser.parseObjectKey("api_defenseCondition")
      val api_defenseCondition = parseFrigate_Threat_Response_CoordinatorDefenseConditionType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_qualifiedThreat")
      val api_qualifiedThreat = parseFrigate_Threat_Response_CoordinatorQualifiedThreatType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_responseRequest")
      val api_responseRequest = parseFrigate_Threat_Response_CoordinatorResponseRequest()
      parser.parseObjectNext()
      parser.parseObjectKey("api_retreatCondition")
      val api_retreatCondition = parseFrigate_Threat_Response_CoordinatorRetreatConditionType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_P(api_defenseCondition, api_qualifiedThreat, api_responseRequest, api_retreatCondition)
    }

    def parseFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PS(): Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PS = {
      val r = parseFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PST(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PST(typeParsed: B): Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PS")
      }
      parser.parseObjectKey("api_defenseCondition")
      val api_defenseCondition = parseFrigate_Threat_Response_CoordinatorDefenseConditionType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_qualifiedThreat")
      val api_qualifiedThreat = parseFrigate_Threat_Response_CoordinatorQualifiedThreatType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_responseRequest")
      val api_responseRequest = parseFrigate_Threat_Response_CoordinatorResponseRequest()
      parser.parseObjectNext()
      parser.parseObjectKey("api_retreatCondition")
      val api_retreatCondition = parseFrigate_Threat_Response_CoordinatorRetreatConditionType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PS(api_defenseCondition, api_qualifiedThreat, api_responseRequest, api_retreatCondition)
    }

    def parseFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container(): Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_P", "Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PS"))
      t.native match {
        case "Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PST(T); return r
        case _ => val r = parseFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PST(T); return r
      }
    }

    def parseFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_P(): Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_P = {
      val r = parseFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PT(typeParsed: B): Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_P")
      }
      parser.parseObjectKey("api_defenseActivation")
      val api_defenseActivation = parseFrigate_Threat_Response_CoordinatorDefenseActivationType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_responseRecord")
      val api_responseRecord = parseFrigate_Threat_Response_CoordinatorResponseRecord()
      parser.parseObjectNext()
      parser.parseObjectKey("api_retreatNavigationCommand")
      val api_retreatNavigationCommand = parseFrigate_Threat_Response_CoordinatorRetreatNavigationCommandType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_P(api_defenseActivation, api_responseRecord, api_retreatNavigationCommand)
    }

    def parseFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PS(): Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PS = {
      val r = parseFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PST(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PST(typeParsed: B): Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PS")
      }
      parser.parseObjectKey("api_defenseActivation")
      val api_defenseActivation = parseFrigate_Threat_Response_CoordinatorDefenseActivationType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_responseRecord")
      val api_responseRecord = parseFrigate_Threat_Response_CoordinatorResponseRecord()
      parser.parseObjectNext()
      parser.parseObjectKey("api_retreatNavigationCommand")
      val api_retreatNavigationCommand = parseFrigate_Threat_Response_CoordinatorRetreatNavigationCommandType()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PS(api_defenseActivation, api_responseRecord, api_retreatNavigationCommand)
    }

    def parseFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container(): Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_P", "Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PS"))
      t.native match {
        case "Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PST(T); return r
        case _ => val r = parseFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PST(T); return r
      }
    }

    def parseFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_P(): Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_P = {
      val r = parseFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PT(typeParsed: B): Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_P")
      }
      parser.parseObjectKey("api_reportAcknowledgment")
      val api_reportAcknowledgment = parseFrigate_Threat_Response_CoordinatorReportAcknowledgment()
      parser.parseObjectNext()
      parser.parseObjectKey("api_responseRecord")
      val api_responseRecord = parseFrigate_Threat_Response_CoordinatorResponseRecord()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_P(api_reportAcknowledgment, api_responseRecord)
    }

    def parseFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PS(): Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PS = {
      val r = parseFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PST(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PST(typeParsed: B): Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PS")
      }
      parser.parseObjectKey("api_reportAcknowledgment")
      val api_reportAcknowledgment = parseFrigate_Threat_Response_CoordinatorReportAcknowledgment()
      parser.parseObjectNext()
      parser.parseObjectKey("api_responseRecord")
      val api_responseRecord = parseFrigate_Threat_Response_CoordinatorResponseRecord()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PS(api_reportAcknowledgment, api_responseRecord)
    }

    def parseFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container(): Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_P", "Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PS"))
      t.native match {
        case "Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PST(T); return r
        case _ => val r = parseFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PST(T); return r
      }
    }

    def parseFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_P(): Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_P = {
      val r = parseFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PT(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PT(typeParsed: B): Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_P")
      }
      parser.parseObjectKey("api_threatReport")
      val api_threatReport = parseFrigate_Threat_Response_CoordinatorThreatReport()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_P(api_threatReport)
    }

    def parseFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PS(): Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PS = {
      val r = parseFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PST(F)
      return r
    }

    def parseFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PST(typeParsed: B): Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PS")
      }
      parser.parseObjectKey("api_threatReport")
      val api_threatReport = parseFrigate_Threat_Response_CoordinatorThreatReport()
      parser.parseObjectNext()
      return Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PS(api_threatReport)
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
      val t = parser.parseObjectTypes(ISZ("util.EmptyContainer", "Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_P", "Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PS", "Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_P", "Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PS", "Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_P", "Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_P", "Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PS", "Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PS", "Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_P", "Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_P", "Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PS", "Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PS", "Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_P", "Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PS", "Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_P", "Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PS", "Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_P", "Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PS", "Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_P", "Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PS"))
      t.native match {
        case "util.EmptyContainer" => val r = parseutilEmptyContainerT(T); return r
        case "Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PST(T); return r
        case "Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PST(T); return r
        case "Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PST(T); return r
        case "Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PST(T); return r
        case "Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PST(T); return r
        case "Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PST(T); return r
        case "Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PST(T); return r
        case "Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PST(T); return r
        case "Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PST(T); return r
        case "Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PST(T); return r
        case _ => val r = parseFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PST(T); return r
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
      val t = parser.parseObjectTypes(ISZ("art.Empty", "Base_Types.Boolean_Payload", "Base_Types.Integer_Payload", "Base_Types.Integer_8_Payload", "Base_Types.Integer_16_Payload", "Base_Types.Integer_32_Payload", "Base_Types.Integer_64_Payload", "Base_Types.Unsigned_8_Payload", "Base_Types.Unsigned_16_Payload", "Base_Types.Unsigned_32_Payload", "Base_Types.Unsigned_64_Payload", "Base_Types.Float_Payload", "Base_Types.Float_32_Payload", "Base_Types.Float_64_Payload", "Base_Types.Character_Payload", "Base_Types.String_Payload", "Base_Types.Bits_Payload", "util.EmptyContainer", "Frigate_Threat_Response_Coordinator.WarpProgress_Payload", "Frigate_Threat_Response_Coordinator.ThreatReport_Payload", "Frigate_Threat_Response_Coordinator.RequestStatus_Payload", "Frigate_Threat_Response_Coordinator.IdentityStatus_Payload", "Frigate_Threat_Response_Coordinator.DroneReadiness_Payload", "Frigate_Threat_Response_Coordinator.ReportPriority_Payload", "Frigate_Threat_Response_Coordinator.ResponseRecord_Payload", "Frigate_Threat_Response_Coordinator.ContactIdentity_Payload", "Frigate_Threat_Response_Coordinator.QualifiedThreat_Payload", "Frigate_Threat_Response_Coordinator.ResponseRequest_Payload", "Frigate_Threat_Response_Coordinator.ContactEvidence_Payload", "Frigate_Threat_Response_Coordinator.DefenseEvidence_Payload", "Frigate_Threat_Response_Coordinator.ContactSignature_Payload", "Frigate_Threat_Response_Coordinator.DefenseCondition_Payload", "Frigate_Threat_Response_Coordinator.RetreatCondition_Payload", "Frigate_Threat_Response_Coordinator.DestinationStatus_Payload", "Frigate_Threat_Response_Coordinator.DefenseActivation_Payload", "Frigate_Threat_Response_Coordinator.WarpProgressStatus_Payload", "Frigate_Threat_Response_Coordinator.DefenseAvailability_Payload", "Frigate_Threat_Response_Coordinator.AcknowledgmentValue_Payload", "Frigate_Threat_Response_Coordinator.ResponseDisposition_Payload", "Frigate_Threat_Response_Coordinator.DroneReadinessStatus_Payload", "Frigate_Threat_Response_Coordinator.AcknowledgmentStatus_Payload", "Frigate_Threat_Response_Coordinator.ResponseRequestValue_Payload", "Frigate_Threat_Response_Coordinator.ReportAcknowledgment_Payload", "Frigate_Threat_Response_Coordinator.ContactSignatureStatus_Payload", "Frigate_Threat_Response_Coordinator.IdentificationEvidence_Payload", "Frigate_Threat_Response_Coordinator.RetreatNavigationCommand_Payload", "Frigate_Threat_Response_Coordinator.DefenseAvailabilityStatus_Payload", "Frigate_Threat_Response_Coordinator.DestinationEvidenceStatus_Payload", "Frigate_Threat_Response_Coordinator.RetreatNavigationEvidence_Payload", "Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_P", "Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PS", "Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_P", "Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PS", "Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_P", "Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_P", "Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PS", "Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PS", "Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_P", "Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_P", "Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PS", "Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PS", "Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_P", "Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PS", "Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_P", "Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PS", "Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_P", "Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PS", "Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_P", "Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PS"))
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
        case "Frigate_Threat_Response_Coordinator.WarpProgress_Payload" => val r = parseFrigate_Threat_Response_CoordinatorWarpProgress_PayloadT(T); return r
        case "Frigate_Threat_Response_Coordinator.ThreatReport_Payload" => val r = parseFrigate_Threat_Response_CoordinatorThreatReport_PayloadT(T); return r
        case "Frigate_Threat_Response_Coordinator.RequestStatus_Payload" => val r = parseFrigate_Threat_Response_CoordinatorRequestStatus_PayloadT(T); return r
        case "Frigate_Threat_Response_Coordinator.IdentityStatus_Payload" => val r = parseFrigate_Threat_Response_CoordinatorIdentityStatus_PayloadT(T); return r
        case "Frigate_Threat_Response_Coordinator.DroneReadiness_Payload" => val r = parseFrigate_Threat_Response_CoordinatorDroneReadiness_PayloadT(T); return r
        case "Frigate_Threat_Response_Coordinator.ReportPriority_Payload" => val r = parseFrigate_Threat_Response_CoordinatorReportPriority_PayloadT(T); return r
        case "Frigate_Threat_Response_Coordinator.ResponseRecord_Payload" => val r = parseFrigate_Threat_Response_CoordinatorResponseRecord_PayloadT(T); return r
        case "Frigate_Threat_Response_Coordinator.ContactIdentity_Payload" => val r = parseFrigate_Threat_Response_CoordinatorContactIdentity_PayloadT(T); return r
        case "Frigate_Threat_Response_Coordinator.QualifiedThreat_Payload" => val r = parseFrigate_Threat_Response_CoordinatorQualifiedThreat_PayloadT(T); return r
        case "Frigate_Threat_Response_Coordinator.ResponseRequest_Payload" => val r = parseFrigate_Threat_Response_CoordinatorResponseRequest_PayloadT(T); return r
        case "Frigate_Threat_Response_Coordinator.ContactEvidence_Payload" => val r = parseFrigate_Threat_Response_CoordinatorContactEvidence_PayloadT(T); return r
        case "Frigate_Threat_Response_Coordinator.DefenseEvidence_Payload" => val r = parseFrigate_Threat_Response_CoordinatorDefenseEvidence_PayloadT(T); return r
        case "Frigate_Threat_Response_Coordinator.ContactSignature_Payload" => val r = parseFrigate_Threat_Response_CoordinatorContactSignature_PayloadT(T); return r
        case "Frigate_Threat_Response_Coordinator.DefenseCondition_Payload" => val r = parseFrigate_Threat_Response_CoordinatorDefenseCondition_PayloadT(T); return r
        case "Frigate_Threat_Response_Coordinator.RetreatCondition_Payload" => val r = parseFrigate_Threat_Response_CoordinatorRetreatCondition_PayloadT(T); return r
        case "Frigate_Threat_Response_Coordinator.DestinationStatus_Payload" => val r = parseFrigate_Threat_Response_CoordinatorDestinationStatus_PayloadT(T); return r
        case "Frigate_Threat_Response_Coordinator.DefenseActivation_Payload" => val r = parseFrigate_Threat_Response_CoordinatorDefenseActivation_PayloadT(T); return r
        case "Frigate_Threat_Response_Coordinator.WarpProgressStatus_Payload" => val r = parseFrigate_Threat_Response_CoordinatorWarpProgressStatus_PayloadT(T); return r
        case "Frigate_Threat_Response_Coordinator.DefenseAvailability_Payload" => val r = parseFrigate_Threat_Response_CoordinatorDefenseAvailability_PayloadT(T); return r
        case "Frigate_Threat_Response_Coordinator.AcknowledgmentValue_Payload" => val r = parseFrigate_Threat_Response_CoordinatorAcknowledgmentValue_PayloadT(T); return r
        case "Frigate_Threat_Response_Coordinator.ResponseDisposition_Payload" => val r = parseFrigate_Threat_Response_CoordinatorResponseDisposition_PayloadT(T); return r
        case "Frigate_Threat_Response_Coordinator.DroneReadinessStatus_Payload" => val r = parseFrigate_Threat_Response_CoordinatorDroneReadinessStatus_PayloadT(T); return r
        case "Frigate_Threat_Response_Coordinator.AcknowledgmentStatus_Payload" => val r = parseFrigate_Threat_Response_CoordinatorAcknowledgmentStatus_PayloadT(T); return r
        case "Frigate_Threat_Response_Coordinator.ResponseRequestValue_Payload" => val r = parseFrigate_Threat_Response_CoordinatorResponseRequestValue_PayloadT(T); return r
        case "Frigate_Threat_Response_Coordinator.ReportAcknowledgment_Payload" => val r = parseFrigate_Threat_Response_CoordinatorReportAcknowledgment_PayloadT(T); return r
        case "Frigate_Threat_Response_Coordinator.ContactSignatureStatus_Payload" => val r = parseFrigate_Threat_Response_CoordinatorContactSignatureStatus_PayloadT(T); return r
        case "Frigate_Threat_Response_Coordinator.IdentificationEvidence_Payload" => val r = parseFrigate_Threat_Response_CoordinatorIdentificationEvidence_PayloadT(T); return r
        case "Frigate_Threat_Response_Coordinator.RetreatNavigationCommand_Payload" => val r = parseFrigate_Threat_Response_CoordinatorRetreatNavigationCommand_PayloadT(T); return r
        case "Frigate_Threat_Response_Coordinator.DefenseAvailabilityStatus_Payload" => val r = parseFrigate_Threat_Response_CoordinatorDefenseAvailabilityStatus_PayloadT(T); return r
        case "Frigate_Threat_Response_Coordinator.DestinationEvidenceStatus_Payload" => val r = parseFrigate_Threat_Response_CoordinatorDestinationEvidenceStatus_PayloadT(T); return r
        case "Frigate_Threat_Response_Coordinator.RetreatNavigationEvidence_Payload" => val r = parseFrigate_Threat_Response_CoordinatorRetreatNavigationEvidence_PayloadT(T); return r
        case "Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PST(T); return r
        case "Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PST(T); return r
        case "Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PST(T); return r
        case "Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PST(T); return r
        case "Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PST(T); return r
        case "Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PST(T); return r
        case "Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PST(T); return r
        case "Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PST(T); return r
        case "Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PST(T); return r
        case "Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_P" => val r = parseFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PT(T); return r
        case "Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PS" => val r = parseFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PST(T); return r
        case _ => val r = parseFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PST(T); return r
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

  def fromFrigate_Threat_Response_CoordinatorContactSignature_Payload(o: Frigate_Threat_Response_Coordinator.ContactSignature_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorContactSignature_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorContactSignature_Payload(s: String): Either[Frigate_Threat_Response_Coordinator.ContactSignature_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorContactSignature_Payload(parser: Parser): Frigate_Threat_Response_Coordinator.ContactSignature_Payload = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorContactSignature_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorContactSignature_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorContactSignatureStatus_Payload(o: Frigate_Threat_Response_Coordinator.ContactSignatureStatus_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorContactSignatureStatus_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorContactSignatureStatus_Payload(s: String): Either[Frigate_Threat_Response_Coordinator.ContactSignatureStatus_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorContactSignatureStatus_Payload(parser: Parser): Frigate_Threat_Response_Coordinator.ContactSignatureStatus_Payload = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorContactSignatureStatus_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorContactSignatureStatus_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorContactIdentity_Payload(o: Frigate_Threat_Response_Coordinator.ContactIdentity_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorContactIdentity_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorContactIdentity_Payload(s: String): Either[Frigate_Threat_Response_Coordinator.ContactIdentity_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorContactIdentity_Payload(parser: Parser): Frigate_Threat_Response_Coordinator.ContactIdentity_Payload = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorContactIdentity_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorContactIdentity_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorIdentityStatus_Payload(o: Frigate_Threat_Response_Coordinator.IdentityStatus_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorIdentityStatus_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorIdentityStatus_Payload(s: String): Either[Frigate_Threat_Response_Coordinator.IdentityStatus_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorIdentityStatus_Payload(parser: Parser): Frigate_Threat_Response_Coordinator.IdentityStatus_Payload = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorIdentityStatus_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorIdentityStatus_Payload _)
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

  def fromFrigate_Threat_Response_CoordinatorDefenseAvailability_Payload(o: Frigate_Threat_Response_Coordinator.DefenseAvailability_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorDefenseAvailability_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorDefenseAvailability_Payload(s: String): Either[Frigate_Threat_Response_Coordinator.DefenseAvailability_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDefenseAvailability_Payload(parser: Parser): Frigate_Threat_Response_Coordinator.DefenseAvailability_Payload = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorDefenseAvailability_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorDefenseAvailability_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDefenseAvailabilityStatus_Payload(o: Frigate_Threat_Response_Coordinator.DefenseAvailabilityStatus_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorDefenseAvailabilityStatus_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorDefenseAvailabilityStatus_Payload(s: String): Either[Frigate_Threat_Response_Coordinator.DefenseAvailabilityStatus_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDefenseAvailabilityStatus_Payload(parser: Parser): Frigate_Threat_Response_Coordinator.DefenseAvailabilityStatus_Payload = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorDefenseAvailabilityStatus_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorDefenseAvailabilityStatus_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDroneReadiness_Payload(o: Frigate_Threat_Response_Coordinator.DroneReadiness_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorDroneReadiness_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorDroneReadiness_Payload(s: String): Either[Frigate_Threat_Response_Coordinator.DroneReadiness_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDroneReadiness_Payload(parser: Parser): Frigate_Threat_Response_Coordinator.DroneReadiness_Payload = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorDroneReadiness_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorDroneReadiness_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDroneReadinessStatus_Payload(o: Frigate_Threat_Response_Coordinator.DroneReadinessStatus_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorDroneReadinessStatus_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorDroneReadinessStatus_Payload(s: String): Either[Frigate_Threat_Response_Coordinator.DroneReadinessStatus_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDroneReadinessStatus_Payload(parser: Parser): Frigate_Threat_Response_Coordinator.DroneReadinessStatus_Payload = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorDroneReadinessStatus_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorDroneReadinessStatus_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDefenseCondition_Payload(o: Frigate_Threat_Response_Coordinator.DefenseCondition_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorDefenseCondition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorDefenseCondition_Payload(s: String): Either[Frigate_Threat_Response_Coordinator.DefenseCondition_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDefenseCondition_Payload(parser: Parser): Frigate_Threat_Response_Coordinator.DefenseCondition_Payload = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorDefenseCondition_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorDefenseCondition_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDestinationStatus_Payload(o: Frigate_Threat_Response_Coordinator.DestinationStatus_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorDestinationStatus_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorDestinationStatus_Payload(s: String): Either[Frigate_Threat_Response_Coordinator.DestinationStatus_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDestinationStatus_Payload(parser: Parser): Frigate_Threat_Response_Coordinator.DestinationStatus_Payload = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorDestinationStatus_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorDestinationStatus_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDestinationEvidenceStatus_Payload(o: Frigate_Threat_Response_Coordinator.DestinationEvidenceStatus_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorDestinationEvidenceStatus_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorDestinationEvidenceStatus_Payload(s: String): Either[Frigate_Threat_Response_Coordinator.DestinationEvidenceStatus_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDestinationEvidenceStatus_Payload(parser: Parser): Frigate_Threat_Response_Coordinator.DestinationEvidenceStatus_Payload = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorDestinationEvidenceStatus_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorDestinationEvidenceStatus_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorWarpProgress_Payload(o: Frigate_Threat_Response_Coordinator.WarpProgress_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorWarpProgress_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorWarpProgress_Payload(s: String): Either[Frigate_Threat_Response_Coordinator.WarpProgress_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorWarpProgress_Payload(parser: Parser): Frigate_Threat_Response_Coordinator.WarpProgress_Payload = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorWarpProgress_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorWarpProgress_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorWarpProgressStatus_Payload(o: Frigate_Threat_Response_Coordinator.WarpProgressStatus_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorWarpProgressStatus_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorWarpProgressStatus_Payload(s: String): Either[Frigate_Threat_Response_Coordinator.WarpProgressStatus_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorWarpProgressStatus_Payload(parser: Parser): Frigate_Threat_Response_Coordinator.WarpProgressStatus_Payload = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorWarpProgressStatus_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorWarpProgressStatus_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorRetreatCondition_Payload(o: Frigate_Threat_Response_Coordinator.RetreatCondition_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorRetreatCondition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorRetreatCondition_Payload(s: String): Either[Frigate_Threat_Response_Coordinator.RetreatCondition_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorRetreatCondition_Payload(parser: Parser): Frigate_Threat_Response_Coordinator.RetreatCondition_Payload = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorRetreatCondition_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorRetreatCondition_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorResponseRequestValue_Payload(o: Frigate_Threat_Response_Coordinator.ResponseRequestValue_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorResponseRequestValue_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorResponseRequestValue_Payload(s: String): Either[Frigate_Threat_Response_Coordinator.ResponseRequestValue_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorResponseRequestValue_Payload(parser: Parser): Frigate_Threat_Response_Coordinator.ResponseRequestValue_Payload = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorResponseRequestValue_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorResponseRequestValue_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorRequestStatus_Payload(o: Frigate_Threat_Response_Coordinator.RequestStatus_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorRequestStatus_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorRequestStatus_Payload(s: String): Either[Frigate_Threat_Response_Coordinator.RequestStatus_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorRequestStatus_Payload(parser: Parser): Frigate_Threat_Response_Coordinator.RequestStatus_Payload = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorRequestStatus_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorRequestStatus_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDefenseActivation_Payload(o: Frigate_Threat_Response_Coordinator.DefenseActivation_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorDefenseActivation_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorDefenseActivation_Payload(s: String): Either[Frigate_Threat_Response_Coordinator.DefenseActivation_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDefenseActivation_Payload(parser: Parser): Frigate_Threat_Response_Coordinator.DefenseActivation_Payload = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorDefenseActivation_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorDefenseActivation_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorRetreatNavigationCommand_Payload(o: Frigate_Threat_Response_Coordinator.RetreatNavigationCommand_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorRetreatNavigationCommand_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorRetreatNavigationCommand_Payload(s: String): Either[Frigate_Threat_Response_Coordinator.RetreatNavigationCommand_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorRetreatNavigationCommand_Payload(parser: Parser): Frigate_Threat_Response_Coordinator.RetreatNavigationCommand_Payload = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorRetreatNavigationCommand_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorRetreatNavigationCommand_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorResponseDisposition_Payload(o: Frigate_Threat_Response_Coordinator.ResponseDisposition_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorResponseDisposition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorResponseDisposition_Payload(s: String): Either[Frigate_Threat_Response_Coordinator.ResponseDisposition_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorResponseDisposition_Payload(parser: Parser): Frigate_Threat_Response_Coordinator.ResponseDisposition_Payload = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorResponseDisposition_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorResponseDisposition_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorAcknowledgmentValue_Payload(o: Frigate_Threat_Response_Coordinator.AcknowledgmentValue_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorAcknowledgmentValue_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorAcknowledgmentValue_Payload(s: String): Either[Frigate_Threat_Response_Coordinator.AcknowledgmentValue_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorAcknowledgmentValue_Payload(parser: Parser): Frigate_Threat_Response_Coordinator.AcknowledgmentValue_Payload = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorAcknowledgmentValue_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorAcknowledgmentValue_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorAcknowledgmentStatus_Payload(o: Frigate_Threat_Response_Coordinator.AcknowledgmentStatus_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorAcknowledgmentStatus_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorAcknowledgmentStatus_Payload(s: String): Either[Frigate_Threat_Response_Coordinator.AcknowledgmentStatus_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorAcknowledgmentStatus_Payload(parser: Parser): Frigate_Threat_Response_Coordinator.AcknowledgmentStatus_Payload = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorAcknowledgmentStatus_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorAcknowledgmentStatus_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorReportPriority_Payload(o: Frigate_Threat_Response_Coordinator.ReportPriority_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorReportPriority_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorReportPriority_Payload(s: String): Either[Frigate_Threat_Response_Coordinator.ReportPriority_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorReportPriority_Payload(parser: Parser): Frigate_Threat_Response_Coordinator.ReportPriority_Payload = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorReportPriority_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorReportPriority_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorContactEvidence(o: Frigate_Threat_Response_Coordinator.ContactEvidence, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorContactEvidence(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorContactEvidence(s: String): Either[Frigate_Threat_Response_Coordinator.ContactEvidence, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorContactEvidence(parser: Parser): Frigate_Threat_Response_Coordinator.ContactEvidence = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorContactEvidence()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorContactEvidence _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorContactEvidence_Payload(o: Frigate_Threat_Response_Coordinator.ContactEvidence_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorContactEvidence_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorContactEvidence_Payload(s: String): Either[Frigate_Threat_Response_Coordinator.ContactEvidence_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorContactEvidence_Payload(parser: Parser): Frigate_Threat_Response_Coordinator.ContactEvidence_Payload = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorContactEvidence_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorContactEvidence_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorIdentificationEvidence(o: Frigate_Threat_Response_Coordinator.IdentificationEvidence, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorIdentificationEvidence(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorIdentificationEvidence(s: String): Either[Frigate_Threat_Response_Coordinator.IdentificationEvidence, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorIdentificationEvidence(parser: Parser): Frigate_Threat_Response_Coordinator.IdentificationEvidence = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorIdentificationEvidence()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorIdentificationEvidence _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorIdentificationEvidence_Payload(o: Frigate_Threat_Response_Coordinator.IdentificationEvidence_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorIdentificationEvidence_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorIdentificationEvidence_Payload(s: String): Either[Frigate_Threat_Response_Coordinator.IdentificationEvidence_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorIdentificationEvidence_Payload(parser: Parser): Frigate_Threat_Response_Coordinator.IdentificationEvidence_Payload = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorIdentificationEvidence_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorIdentificationEvidence_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDefenseEvidence(o: Frigate_Threat_Response_Coordinator.DefenseEvidence, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorDefenseEvidence(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorDefenseEvidence(s: String): Either[Frigate_Threat_Response_Coordinator.DefenseEvidence, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDefenseEvidence(parser: Parser): Frigate_Threat_Response_Coordinator.DefenseEvidence = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorDefenseEvidence()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorDefenseEvidence _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDefenseEvidence_Payload(o: Frigate_Threat_Response_Coordinator.DefenseEvidence_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorDefenseEvidence_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorDefenseEvidence_Payload(s: String): Either[Frigate_Threat_Response_Coordinator.DefenseEvidence_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDefenseEvidence_Payload(parser: Parser): Frigate_Threat_Response_Coordinator.DefenseEvidence_Payload = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorDefenseEvidence_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorDefenseEvidence_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorRetreatNavigationEvidence(o: Frigate_Threat_Response_Coordinator.RetreatNavigationEvidence, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorRetreatNavigationEvidence(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorRetreatNavigationEvidence(s: String): Either[Frigate_Threat_Response_Coordinator.RetreatNavigationEvidence, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorRetreatNavigationEvidence(parser: Parser): Frigate_Threat_Response_Coordinator.RetreatNavigationEvidence = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorRetreatNavigationEvidence()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorRetreatNavigationEvidence _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorRetreatNavigationEvidence_Payload(o: Frigate_Threat_Response_Coordinator.RetreatNavigationEvidence_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorRetreatNavigationEvidence_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorRetreatNavigationEvidence_Payload(s: String): Either[Frigate_Threat_Response_Coordinator.RetreatNavigationEvidence_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorRetreatNavigationEvidence_Payload(parser: Parser): Frigate_Threat_Response_Coordinator.RetreatNavigationEvidence_Payload = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorRetreatNavigationEvidence_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorRetreatNavigationEvidence_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorResponseRequest(o: Frigate_Threat_Response_Coordinator.ResponseRequest, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorResponseRequest(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorResponseRequest(s: String): Either[Frigate_Threat_Response_Coordinator.ResponseRequest, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorResponseRequest(parser: Parser): Frigate_Threat_Response_Coordinator.ResponseRequest = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorResponseRequest()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorResponseRequest _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorResponseRequest_Payload(o: Frigate_Threat_Response_Coordinator.ResponseRequest_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorResponseRequest_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorResponseRequest_Payload(s: String): Either[Frigate_Threat_Response_Coordinator.ResponseRequest_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorResponseRequest_Payload(parser: Parser): Frigate_Threat_Response_Coordinator.ResponseRequest_Payload = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorResponseRequest_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorResponseRequest_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorResponseRecord(o: Frigate_Threat_Response_Coordinator.ResponseRecord, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorResponseRecord(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorResponseRecord(s: String): Either[Frigate_Threat_Response_Coordinator.ResponseRecord, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorResponseRecord(parser: Parser): Frigate_Threat_Response_Coordinator.ResponseRecord = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorResponseRecord()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorResponseRecord _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorResponseRecord_Payload(o: Frigate_Threat_Response_Coordinator.ResponseRecord_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorResponseRecord_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorResponseRecord_Payload(s: String): Either[Frigate_Threat_Response_Coordinator.ResponseRecord_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorResponseRecord_Payload(parser: Parser): Frigate_Threat_Response_Coordinator.ResponseRecord_Payload = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorResponseRecord_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorResponseRecord_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorReportAcknowledgment(o: Frigate_Threat_Response_Coordinator.ReportAcknowledgment, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorReportAcknowledgment(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorReportAcknowledgment(s: String): Either[Frigate_Threat_Response_Coordinator.ReportAcknowledgment, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorReportAcknowledgment(parser: Parser): Frigate_Threat_Response_Coordinator.ReportAcknowledgment = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorReportAcknowledgment()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorReportAcknowledgment _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorReportAcknowledgment_Payload(o: Frigate_Threat_Response_Coordinator.ReportAcknowledgment_Payload, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorReportAcknowledgment_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorReportAcknowledgment_Payload(s: String): Either[Frigate_Threat_Response_Coordinator.ReportAcknowledgment_Payload, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorReportAcknowledgment_Payload(parser: Parser): Frigate_Threat_Response_Coordinator.ReportAcknowledgment_Payload = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorReportAcknowledgment_Payload()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorReportAcknowledgment_Payload _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorThreatReport(o: Frigate_Threat_Response_Coordinator.ThreatReport, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorThreatReport(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorThreatReport(s: String): Either[Frigate_Threat_Response_Coordinator.ThreatReport, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorThreatReport(parser: Parser): Frigate_Threat_Response_Coordinator.ThreatReport = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorThreatReport()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorThreatReport _)
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

  def fromFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container(o: Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container(s: String): Either[Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container(parser: Parser): Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_P(o: Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_P(s: String): Either[Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_P, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_P(parser: Parser): Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_P = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_P()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PS(o: Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PS(s: String): Either[Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PS, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PS(parser: Parser): Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PS = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PS()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PreState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container(o: Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container(s: String): Either[Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container(parser: Parser): Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_P(o: Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_P(s: String): Either[Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_P, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_P(parser: Parser): Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_P = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_P()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PS(o: Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PS(s: String): Either[Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PS, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PS(parser: Parser): Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PS = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PS()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_PostState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container(o: Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container(s: String): Either[Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container(parser: Parser): Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_P(o: Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_P(s: String): Either[Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_P, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_P(parser: Parser): Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_P = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_P()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PS(o: Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PS(s: String): Either[Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PS, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PS(parser: Parser): Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PS = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PS()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PreState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container(o: Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container(s: String): Either[Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container(parser: Parser): Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_P(o: Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_P(s: String): Either[Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_P, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_P(parser: Parser): Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_P = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_P()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PS(o: Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PS(s: String): Either[Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PS, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PS(parser: Parser): Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PS = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PS()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorDefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_PostState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container(o: Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container(s: String): Either[Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container(parser: Parser): Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_P(o: Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_P(s: String): Either[Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_P, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_P(parser: Parser): Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_P = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_P()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PS(o: Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PS(s: String): Either[Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PS, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PS(parser: Parser): Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PS = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PS()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PreState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container(o: Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container(s: String): Either[Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container(parser: Parser): Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_P(o: Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_P(s: String): Either[Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_P, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_P(parser: Parser): Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_P = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_P()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PS(o: Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PS(s: String): Either[Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PS, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PS(parser: Parser): Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PS = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PS()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorRetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_PostState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container(o: Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container(s: String): Either[Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container(parser: Parser): Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_P(o: Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_P(s: String): Either[Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_P, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_P(parser: Parser): Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_P = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_P()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PS(o: Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PS(s: String): Either[Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PS, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PS(parser: Parser): Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PS = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PS()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PreState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container(o: Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container(s: String): Either[Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container(parser: Parser): Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_P(o: Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_P(s: String): Either[Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_P, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_P(parser: Parser): Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_P = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_P()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PS(o: Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PS(s: String): Either[Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PS, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PS(parser: Parser): Frigate_Threat_Response_Coordinator.PrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PS = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PS()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorPrincipalResponseCoordinator_threatResponseProcess_principalResponseCoordinator_PostState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container(o: Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container(s: String): Either[Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container(parser: Parser): Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_P(o: Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_P(s: String): Either[Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_P, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_P(parser: Parser): Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_P = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_P()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PS(o: Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PS(s: String): Either[Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PS, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PS(parser: Parser): Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PS = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PS()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PreState_Container_PS _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container(o: Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container(s: String): Either[Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container(parser: Parser): Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_P(o: Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_P(s: String): Either[Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_P, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_P(parser: Parser): Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_P = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_P()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_P _)
    return r
  }

  def fromFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PS(o: Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PS(s: String): Either[Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PS, Json.ErrorMsg] = {
    def fFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PS(parser: Parser): Frigate_Threat_Response_Coordinator.ThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PS = {
      val r = parser.parseFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PS()
      return r
    }
    val r = to(s, fFrigate_Threat_Response_CoordinatorThreatReportComposer_threatResponseProcess_threatReportComposer_PostState_Container_PS _)
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