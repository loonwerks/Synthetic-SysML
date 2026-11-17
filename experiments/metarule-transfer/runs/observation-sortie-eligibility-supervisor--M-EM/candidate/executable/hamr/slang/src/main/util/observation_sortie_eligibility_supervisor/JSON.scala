// #Sireum
// @formatter:off

// This file is auto-generated from EnergyQuality.scala, Validity.scala, Freshness.scala, EnergyCause.scala, GpsCondition.scala, InertialCondition.scala, BarometricCondition.scala, NavigationCause.scala, EquipmentCondition.scala, SingleEquipmentCause.scala, Engine1Condition.scala, Engine2Condition.scala, Engine3Condition.scala, Engine4Condition.scala, Confirmation.scala, PropulsionCause.scala, OperatorEvent.scala, PriorityDirective.scala, ReleaseFeedback.scala, RequestPhase.scala, FaultState.scala, EquipmentCause.scala, RecoveryPhase.scala, RecoveryGate.scala, CarriedPriority.scala, SortieDirective.scala, EligibilityReason.scala, StatusRequestPhase.scala, StatusFaultState.scala, StatusRecoveryPhase.scala, StatusDecision.scala, LimitingCause.scala, EnergyEvidence.scala, EnergyAssessment.scala, NavigationEvidenceRecord.scala, NavigationAssessment.scala, EquipmentEvidence.scala, SingleEquipmentAssessment.scala, PropulsionEvidence.scala, PropulsionAssessment.scala, FaultSummary.scala, RecoveryFacts.scala, EligibilityDecision.scala, EligibilityStatus.scala, Base_Types.scala, EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_Containers.scala, NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_Containers.scala, CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_Containers.scala, ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_Containers.scala, ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_Containers.scala, PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_Containers.scala, RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_Containers.scala, FaultRegistry_eligibility_supervisor_process_fault_registry_Containers.scala, PriorityArbiter_eligibility_supervisor_process_priority_arbiter_Containers.scala, RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_Containers.scala, EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_Containers.scala, PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_Containers.scala, StatusComposer_eligibility_supervisor_process_status_composer_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package observation_sortie_eligibility_supervisor

import org.sireum._
import org.sireum.Json.Printer._

object JSON {

  object Printer {

    @pure def printObservation_Sortie_Eligibility_SupervisorEnergyQualityType(o: Observation_Sortie_Eligibility_Supervisor.EnergyQuality.Type): ST = {
      val value: String = o match {
        case Observation_Sortie_Eligibility_Supervisor.EnergyQuality.Nominal => "Nominal"
        case Observation_Sortie_Eligibility_Supervisor.EnergyQuality.Limited => "Limited"
        case Observation_Sortie_Eligibility_Supervisor.EnergyQuality.Unavailable => "Unavailable"
        case Observation_Sortie_Eligibility_Supervisor.EnergyQuality.Unknown => "Unknown"
      }
      return printObject(ISZ(
        ("type", printString("Observation_Sortie_Eligibility_Supervisor.EnergyQuality")),
        ("value", printString(value))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorEnergyQuality_Payload(o: Observation_Sortie_Eligibility_Supervisor.EnergyQuality_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.EnergyQuality_Payload""""),
        ("value", printObservation_Sortie_Eligibility_SupervisorEnergyQualityType(o.value))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorValidityType(o: Observation_Sortie_Eligibility_Supervisor.Validity.Type): ST = {
      val value: String = o match {
        case Observation_Sortie_Eligibility_Supervisor.Validity.Valid => "Valid"
        case Observation_Sortie_Eligibility_Supervisor.Validity.Invalid => "Invalid"
      }
      return printObject(ISZ(
        ("type", printString("Observation_Sortie_Eligibility_Supervisor.Validity")),
        ("value", printString(value))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorValidity_Payload(o: Observation_Sortie_Eligibility_Supervisor.Validity_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.Validity_Payload""""),
        ("value", printObservation_Sortie_Eligibility_SupervisorValidityType(o.value))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorFreshnessType(o: Observation_Sortie_Eligibility_Supervisor.Freshness.Type): ST = {
      val value: String = o match {
        case Observation_Sortie_Eligibility_Supervisor.Freshness.Current => "Current"
        case Observation_Sortie_Eligibility_Supervisor.Freshness.Stale => "Stale"
      }
      return printObject(ISZ(
        ("type", printString("Observation_Sortie_Eligibility_Supervisor.Freshness")),
        ("value", printString(value))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorFreshness_Payload(o: Observation_Sortie_Eligibility_Supervisor.Freshness_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.Freshness_Payload""""),
        ("value", printObservation_Sortie_Eligibility_SupervisorFreshnessType(o.value))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorEnergyCauseType(o: Observation_Sortie_Eligibility_Supervisor.EnergyCause.Type): ST = {
      val value: String = o match {
        case Observation_Sortie_Eligibility_Supervisor.EnergyCause.None => "None"
        case Observation_Sortie_Eligibility_Supervisor.EnergyCause.Invalid => "Invalid"
        case Observation_Sortie_Eligibility_Supervisor.EnergyCause.Stale => "Stale"
        case Observation_Sortie_Eligibility_Supervisor.EnergyCause.UnavailableOrUnknown => "UnavailableOrUnknown"
        case Observation_Sortie_Eligibility_Supervisor.EnergyCause.Limited => "Limited"
      }
      return printObject(ISZ(
        ("type", printString("Observation_Sortie_Eligibility_Supervisor.EnergyCause")),
        ("value", printString(value))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorEnergyCause_Payload(o: Observation_Sortie_Eligibility_Supervisor.EnergyCause_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.EnergyCause_Payload""""),
        ("value", printObservation_Sortie_Eligibility_SupervisorEnergyCauseType(o.value))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorGpsConditionType(o: Observation_Sortie_Eligibility_Supervisor.GpsCondition.Type): ST = {
      val value: String = o match {
        case Observation_Sortie_Eligibility_Supervisor.GpsCondition.Nominal => "Nominal"
        case Observation_Sortie_Eligibility_Supervisor.GpsCondition.NonNominal => "NonNominal"
        case Observation_Sortie_Eligibility_Supervisor.GpsCondition.Unavailable => "Unavailable"
        case Observation_Sortie_Eligibility_Supervisor.GpsCondition.Unknown => "Unknown"
      }
      return printObject(ISZ(
        ("type", printString("Observation_Sortie_Eligibility_Supervisor.GpsCondition")),
        ("value", printString(value))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorGpsCondition_Payload(o: Observation_Sortie_Eligibility_Supervisor.GpsCondition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.GpsCondition_Payload""""),
        ("value", printObservation_Sortie_Eligibility_SupervisorGpsConditionType(o.value))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorInertialConditionType(o: Observation_Sortie_Eligibility_Supervisor.InertialCondition.Type): ST = {
      val value: String = o match {
        case Observation_Sortie_Eligibility_Supervisor.InertialCondition.Nominal => "Nominal"
        case Observation_Sortie_Eligibility_Supervisor.InertialCondition.NonNominal => "NonNominal"
        case Observation_Sortie_Eligibility_Supervisor.InertialCondition.Unavailable => "Unavailable"
        case Observation_Sortie_Eligibility_Supervisor.InertialCondition.Unknown => "Unknown"
      }
      return printObject(ISZ(
        ("type", printString("Observation_Sortie_Eligibility_Supervisor.InertialCondition")),
        ("value", printString(value))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorInertialCondition_Payload(o: Observation_Sortie_Eligibility_Supervisor.InertialCondition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.InertialCondition_Payload""""),
        ("value", printObservation_Sortie_Eligibility_SupervisorInertialConditionType(o.value))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorBarometricConditionType(o: Observation_Sortie_Eligibility_Supervisor.BarometricCondition.Type): ST = {
      val value: String = o match {
        case Observation_Sortie_Eligibility_Supervisor.BarometricCondition.Nominal => "Nominal"
        case Observation_Sortie_Eligibility_Supervisor.BarometricCondition.NonNominal => "NonNominal"
        case Observation_Sortie_Eligibility_Supervisor.BarometricCondition.Unavailable => "Unavailable"
        case Observation_Sortie_Eligibility_Supervisor.BarometricCondition.Unknown => "Unknown"
      }
      return printObject(ISZ(
        ("type", printString("Observation_Sortie_Eligibility_Supervisor.BarometricCondition")),
        ("value", printString(value))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorBarometricCondition_Payload(o: Observation_Sortie_Eligibility_Supervisor.BarometricCondition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.BarometricCondition_Payload""""),
        ("value", printObservation_Sortie_Eligibility_SupervisorBarometricConditionType(o.value))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorNavigationCauseType(o: Observation_Sortie_Eligibility_Supervisor.NavigationCause.Type): ST = {
      val value: String = o match {
        case Observation_Sortie_Eligibility_Supervisor.NavigationCause.None => "None"
        case Observation_Sortie_Eligibility_Supervisor.NavigationCause.Invalid => "Invalid"
        case Observation_Sortie_Eligibility_Supervisor.NavigationCause.Stale => "Stale"
        case Observation_Sortie_Eligibility_Supervisor.NavigationCause.Gps => "Gps"
        case Observation_Sortie_Eligibility_Supervisor.NavigationCause.Inertial => "Inertial"
        case Observation_Sortie_Eligibility_Supervisor.NavigationCause.Barometric => "Barometric"
      }
      return printObject(ISZ(
        ("type", printString("Observation_Sortie_Eligibility_Supervisor.NavigationCause")),
        ("value", printString(value))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorNavigationCause_Payload(o: Observation_Sortie_Eligibility_Supervisor.NavigationCause_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.NavigationCause_Payload""""),
        ("value", printObservation_Sortie_Eligibility_SupervisorNavigationCauseType(o.value))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorEquipmentConditionType(o: Observation_Sortie_Eligibility_Supervisor.EquipmentCondition.Type): ST = {
      val value: String = o match {
        case Observation_Sortie_Eligibility_Supervisor.EquipmentCondition.Nominal => "Nominal"
        case Observation_Sortie_Eligibility_Supervisor.EquipmentCondition.NonNominal => "NonNominal"
        case Observation_Sortie_Eligibility_Supervisor.EquipmentCondition.Unavailable => "Unavailable"
        case Observation_Sortie_Eligibility_Supervisor.EquipmentCondition.Unknown => "Unknown"
      }
      return printObject(ISZ(
        ("type", printString("Observation_Sortie_Eligibility_Supervisor.EquipmentCondition")),
        ("value", printString(value))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorEquipmentCondition_Payload(o: Observation_Sortie_Eligibility_Supervisor.EquipmentCondition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.EquipmentCondition_Payload""""),
        ("value", printObservation_Sortie_Eligibility_SupervisorEquipmentConditionType(o.value))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorSingleEquipmentCauseType(o: Observation_Sortie_Eligibility_Supervisor.SingleEquipmentCause.Type): ST = {
      val value: String = o match {
        case Observation_Sortie_Eligibility_Supervisor.SingleEquipmentCause.None => "None"
        case Observation_Sortie_Eligibility_Supervisor.SingleEquipmentCause.Invalid => "Invalid"
        case Observation_Sortie_Eligibility_Supervisor.SingleEquipmentCause.Stale => "Stale"
        case Observation_Sortie_Eligibility_Supervisor.SingleEquipmentCause.Condition => "Condition"
      }
      return printObject(ISZ(
        ("type", printString("Observation_Sortie_Eligibility_Supervisor.SingleEquipmentCause")),
        ("value", printString(value))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorSingleEquipmentCause_Payload(o: Observation_Sortie_Eligibility_Supervisor.SingleEquipmentCause_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.SingleEquipmentCause_Payload""""),
        ("value", printObservation_Sortie_Eligibility_SupervisorSingleEquipmentCauseType(o.value))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorEngine1ConditionType(o: Observation_Sortie_Eligibility_Supervisor.Engine1Condition.Type): ST = {
      val value: String = o match {
        case Observation_Sortie_Eligibility_Supervisor.Engine1Condition.Nominal => "Nominal"
        case Observation_Sortie_Eligibility_Supervisor.Engine1Condition.NonNominal => "NonNominal"
        case Observation_Sortie_Eligibility_Supervisor.Engine1Condition.Unavailable => "Unavailable"
        case Observation_Sortie_Eligibility_Supervisor.Engine1Condition.Unknown => "Unknown"
      }
      return printObject(ISZ(
        ("type", printString("Observation_Sortie_Eligibility_Supervisor.Engine1Condition")),
        ("value", printString(value))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorEngine1Condition_Payload(o: Observation_Sortie_Eligibility_Supervisor.Engine1Condition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.Engine1Condition_Payload""""),
        ("value", printObservation_Sortie_Eligibility_SupervisorEngine1ConditionType(o.value))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorEngine2ConditionType(o: Observation_Sortie_Eligibility_Supervisor.Engine2Condition.Type): ST = {
      val value: String = o match {
        case Observation_Sortie_Eligibility_Supervisor.Engine2Condition.Nominal => "Nominal"
        case Observation_Sortie_Eligibility_Supervisor.Engine2Condition.NonNominal => "NonNominal"
        case Observation_Sortie_Eligibility_Supervisor.Engine2Condition.Unavailable => "Unavailable"
        case Observation_Sortie_Eligibility_Supervisor.Engine2Condition.Unknown => "Unknown"
      }
      return printObject(ISZ(
        ("type", printString("Observation_Sortie_Eligibility_Supervisor.Engine2Condition")),
        ("value", printString(value))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorEngine2Condition_Payload(o: Observation_Sortie_Eligibility_Supervisor.Engine2Condition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.Engine2Condition_Payload""""),
        ("value", printObservation_Sortie_Eligibility_SupervisorEngine2ConditionType(o.value))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorEngine3ConditionType(o: Observation_Sortie_Eligibility_Supervisor.Engine3Condition.Type): ST = {
      val value: String = o match {
        case Observation_Sortie_Eligibility_Supervisor.Engine3Condition.Nominal => "Nominal"
        case Observation_Sortie_Eligibility_Supervisor.Engine3Condition.NonNominal => "NonNominal"
        case Observation_Sortie_Eligibility_Supervisor.Engine3Condition.Unavailable => "Unavailable"
        case Observation_Sortie_Eligibility_Supervisor.Engine3Condition.Unknown => "Unknown"
      }
      return printObject(ISZ(
        ("type", printString("Observation_Sortie_Eligibility_Supervisor.Engine3Condition")),
        ("value", printString(value))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorEngine3Condition_Payload(o: Observation_Sortie_Eligibility_Supervisor.Engine3Condition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.Engine3Condition_Payload""""),
        ("value", printObservation_Sortie_Eligibility_SupervisorEngine3ConditionType(o.value))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorEngine4ConditionType(o: Observation_Sortie_Eligibility_Supervisor.Engine4Condition.Type): ST = {
      val value: String = o match {
        case Observation_Sortie_Eligibility_Supervisor.Engine4Condition.Nominal => "Nominal"
        case Observation_Sortie_Eligibility_Supervisor.Engine4Condition.NonNominal => "NonNominal"
        case Observation_Sortie_Eligibility_Supervisor.Engine4Condition.Unavailable => "Unavailable"
        case Observation_Sortie_Eligibility_Supervisor.Engine4Condition.Unknown => "Unknown"
      }
      return printObject(ISZ(
        ("type", printString("Observation_Sortie_Eligibility_Supervisor.Engine4Condition")),
        ("value", printString(value))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorEngine4Condition_Payload(o: Observation_Sortie_Eligibility_Supervisor.Engine4Condition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.Engine4Condition_Payload""""),
        ("value", printObservation_Sortie_Eligibility_SupervisorEngine4ConditionType(o.value))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorConfirmationType(o: Observation_Sortie_Eligibility_Supervisor.Confirmation.Type): ST = {
      val value: String = o match {
        case Observation_Sortie_Eligibility_Supervisor.Confirmation.Confirmed => "Confirmed"
        case Observation_Sortie_Eligibility_Supervisor.Confirmation.NotConfirmed => "NotConfirmed"
      }
      return printObject(ISZ(
        ("type", printString("Observation_Sortie_Eligibility_Supervisor.Confirmation")),
        ("value", printString(value))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorConfirmation_Payload(o: Observation_Sortie_Eligibility_Supervisor.Confirmation_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.Confirmation_Payload""""),
        ("value", printObservation_Sortie_Eligibility_SupervisorConfirmationType(o.value))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorPropulsionCauseType(o: Observation_Sortie_Eligibility_Supervisor.PropulsionCause.Type): ST = {
      val value: String = o match {
        case Observation_Sortie_Eligibility_Supervisor.PropulsionCause.None => "None"
        case Observation_Sortie_Eligibility_Supervisor.PropulsionCause.Invalid => "Invalid"
        case Observation_Sortie_Eligibility_Supervisor.PropulsionCause.Stale => "Stale"
        case Observation_Sortie_Eligibility_Supervisor.PropulsionCause.Configuration => "Configuration"
        case Observation_Sortie_Eligibility_Supervisor.PropulsionCause.Engine1 => "Engine1"
        case Observation_Sortie_Eligibility_Supervisor.PropulsionCause.Engine2 => "Engine2"
        case Observation_Sortie_Eligibility_Supervisor.PropulsionCause.Engine3 => "Engine3"
        case Observation_Sortie_Eligibility_Supervisor.PropulsionCause.Engine4 => "Engine4"
      }
      return printObject(ISZ(
        ("type", printString("Observation_Sortie_Eligibility_Supervisor.PropulsionCause")),
        ("value", printString(value))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorPropulsionCause_Payload(o: Observation_Sortie_Eligibility_Supervisor.PropulsionCause_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.PropulsionCause_Payload""""),
        ("value", printObservation_Sortie_Eligibility_SupervisorPropulsionCauseType(o.value))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorOperatorEventType(o: Observation_Sortie_Eligibility_Supervisor.OperatorEvent.Type): ST = {
      val value: String = o match {
        case Observation_Sortie_Eligibility_Supervisor.OperatorEvent.None => "None"
        case Observation_Sortie_Eligibility_Supervisor.OperatorEvent.Submit => "Submit"
        case Observation_Sortie_Eligibility_Supervisor.OperatorEvent.Cancel => "Cancel"
        case Observation_Sortie_Eligibility_Supervisor.OperatorEvent.AcknowledgeRecovery => "AcknowledgeRecovery"
      }
      return printObject(ISZ(
        ("type", printString("Observation_Sortie_Eligibility_Supervisor.OperatorEvent")),
        ("value", printString(value))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorOperatorEvent_Payload(o: Observation_Sortie_Eligibility_Supervisor.OperatorEvent_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.OperatorEvent_Payload""""),
        ("value", printObservation_Sortie_Eligibility_SupervisorOperatorEventType(o.value))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorPriorityDirectiveType(o: Observation_Sortie_Eligibility_Supervisor.PriorityDirective.Type): ST = {
      val value: String = o match {
        case Observation_Sortie_Eligibility_Supervisor.PriorityDirective.Inhibit => "Inhibit"
        case Observation_Sortie_Eligibility_Supervisor.PriorityDirective.Cancel => "Cancel"
        case Observation_Sortie_Eligibility_Supervisor.PriorityDirective.Recover => "Recover"
        case Observation_Sortie_Eligibility_Supervisor.PriorityDirective.Submit => "Submit"
        case Observation_Sortie_Eligibility_Supervisor.PriorityDirective.Hold => "Hold"
      }
      return printObject(ISZ(
        ("type", printString("Observation_Sortie_Eligibility_Supervisor.PriorityDirective")),
        ("value", printString(value))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorPriorityDirective_Payload(o: Observation_Sortie_Eligibility_Supervisor.PriorityDirective_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.PriorityDirective_Payload""""),
        ("value", printObservation_Sortie_Eligibility_SupervisorPriorityDirectiveType(o.value))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorReleaseFeedbackType(o: Observation_Sortie_Eligibility_Supervisor.ReleaseFeedback.Type): ST = {
      val value: String = o match {
        case Observation_Sortie_Eligibility_Supervisor.ReleaseFeedback.NotReleased => "NotReleased"
        case Observation_Sortie_Eligibility_Supervisor.ReleaseFeedback.Released => "Released"
      }
      return printObject(ISZ(
        ("type", printString("Observation_Sortie_Eligibility_Supervisor.ReleaseFeedback")),
        ("value", printString(value))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorReleaseFeedback_Payload(o: Observation_Sortie_Eligibility_Supervisor.ReleaseFeedback_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.ReleaseFeedback_Payload""""),
        ("value", printObservation_Sortie_Eligibility_SupervisorReleaseFeedbackType(o.value))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorRequestPhaseType(o: Observation_Sortie_Eligibility_Supervisor.RequestPhase.Type): ST = {
      val value: String = o match {
        case Observation_Sortie_Eligibility_Supervisor.RequestPhase.Idle => "Idle"
        case Observation_Sortie_Eligibility_Supervisor.RequestPhase.Pending => "Pending"
        case Observation_Sortie_Eligibility_Supervisor.RequestPhase.Released => "Released"
      }
      return printObject(ISZ(
        ("type", printString("Observation_Sortie_Eligibility_Supervisor.RequestPhase")),
        ("value", printString(value))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorRequestPhase_Payload(o: Observation_Sortie_Eligibility_Supervisor.RequestPhase_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.RequestPhase_Payload""""),
        ("value", printObservation_Sortie_Eligibility_SupervisorRequestPhaseType(o.value))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorFaultStateType(o: Observation_Sortie_Eligibility_Supervisor.FaultState.Type): ST = {
      val value: String = o match {
        case Observation_Sortie_Eligibility_Supervisor.FaultState.Clear => "Clear"
        case Observation_Sortie_Eligibility_Supervisor.FaultState.Active => "Active"
      }
      return printObject(ISZ(
        ("type", printString("Observation_Sortie_Eligibility_Supervisor.FaultState")),
        ("value", printString(value))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorFaultState_Payload(o: Observation_Sortie_Eligibility_Supervisor.FaultState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.FaultState_Payload""""),
        ("value", printObservation_Sortie_Eligibility_SupervisorFaultStateType(o.value))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorEquipmentCauseType(o: Observation_Sortie_Eligibility_Supervisor.EquipmentCause.Type): ST = {
      val value: String = o match {
        case Observation_Sortie_Eligibility_Supervisor.EquipmentCause.None => "None"
        case Observation_Sortie_Eligibility_Supervisor.EquipmentCause.Energy => "Energy"
        case Observation_Sortie_Eligibility_Supervisor.EquipmentCause.Propulsion => "Propulsion"
        case Observation_Sortie_Eligibility_Supervisor.EquipmentCause.Navigation => "Navigation"
        case Observation_Sortie_Eligibility_Supervisor.EquipmentCause.Obstacle => "Obstacle"
        case Observation_Sortie_Eligibility_Supervisor.EquipmentCause.Observation => "Observation"
        case Observation_Sortie_Eligibility_Supervisor.EquipmentCause.Communication => "Communication"
      }
      return printObject(ISZ(
        ("type", printString("Observation_Sortie_Eligibility_Supervisor.EquipmentCause")),
        ("value", printString(value))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorEquipmentCause_Payload(o: Observation_Sortie_Eligibility_Supervisor.EquipmentCause_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.EquipmentCause_Payload""""),
        ("value", printObservation_Sortie_Eligibility_SupervisorEquipmentCauseType(o.value))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorRecoveryPhaseType(o: Observation_Sortie_Eligibility_Supervisor.RecoveryPhase.Type): ST = {
      val value: String = o match {
        case Observation_Sortie_Eligibility_Supervisor.RecoveryPhase.Normal => "Normal"
        case Observation_Sortie_Eligibility_Supervisor.RecoveryPhase.Quarantined => "Quarantined"
        case Observation_Sortie_Eligibility_Supervisor.RecoveryPhase.AwaitingAck => "AwaitingAck"
      }
      return printObject(ISZ(
        ("type", printString("Observation_Sortie_Eligibility_Supervisor.RecoveryPhase")),
        ("value", printString(value))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorRecoveryPhase_Payload(o: Observation_Sortie_Eligibility_Supervisor.RecoveryPhase_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.RecoveryPhase_Payload""""),
        ("value", printObservation_Sortie_Eligibility_SupervisorRecoveryPhaseType(o.value))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorRecoveryGateType(o: Observation_Sortie_Eligibility_Supervisor.RecoveryGate.Type): ST = {
      val value: String = o match {
        case Observation_Sortie_Eligibility_Supervisor.RecoveryGate.Open => "Open"
        case Observation_Sortie_Eligibility_Supervisor.RecoveryGate.Closed => "Closed"
      }
      return printObject(ISZ(
        ("type", printString("Observation_Sortie_Eligibility_Supervisor.RecoveryGate")),
        ("value", printString(value))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorRecoveryGate_Payload(o: Observation_Sortie_Eligibility_Supervisor.RecoveryGate_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.RecoveryGate_Payload""""),
        ("value", printObservation_Sortie_Eligibility_SupervisorRecoveryGateType(o.value))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorCarriedPriorityType(o: Observation_Sortie_Eligibility_Supervisor.CarriedPriority.Type): ST = {
      val value: String = o match {
        case Observation_Sortie_Eligibility_Supervisor.CarriedPriority.Inhibit => "Inhibit"
        case Observation_Sortie_Eligibility_Supervisor.CarriedPriority.Cancel => "Cancel"
        case Observation_Sortie_Eligibility_Supervisor.CarriedPriority.Recover => "Recover"
        case Observation_Sortie_Eligibility_Supervisor.CarriedPriority.Submit => "Submit"
        case Observation_Sortie_Eligibility_Supervisor.CarriedPriority.Hold => "Hold"
      }
      return printObject(ISZ(
        ("type", printString("Observation_Sortie_Eligibility_Supervisor.CarriedPriority")),
        ("value", printString(value))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorCarriedPriority_Payload(o: Observation_Sortie_Eligibility_Supervisor.CarriedPriority_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.CarriedPriority_Payload""""),
        ("value", printObservation_Sortie_Eligibility_SupervisorCarriedPriorityType(o.value))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorSortieDirectiveType(o: Observation_Sortie_Eligibility_Supervisor.SortieDirective.Type): ST = {
      val value: String = o match {
        case Observation_Sortie_Eligibility_Supervisor.SortieDirective.Withhold => "Withhold"
        case Observation_Sortie_Eligibility_Supervisor.SortieDirective.Permit => "Permit"
      }
      return printObject(ISZ(
        ("type", printString("Observation_Sortie_Eligibility_Supervisor.SortieDirective")),
        ("value", printString(value))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorSortieDirective_Payload(o: Observation_Sortie_Eligibility_Supervisor.SortieDirective_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.SortieDirective_Payload""""),
        ("value", printObservation_Sortie_Eligibility_SupervisorSortieDirectiveType(o.value))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorEligibilityReasonType(o: Observation_Sortie_Eligibility_Supervisor.EligibilityReason.Type): ST = {
      val value: String = o match {
        case Observation_Sortie_Eligibility_Supervisor.EligibilityReason.None => "None"
        case Observation_Sortie_Eligibility_Supervisor.EligibilityReason.Equipment => "Equipment"
        case Observation_Sortie_Eligibility_Supervisor.EligibilityReason.Recovery => "Recovery"
        case Observation_Sortie_Eligibility_Supervisor.EligibilityReason.NoRequest => "NoRequest"
      }
      return printObject(ISZ(
        ("type", printString("Observation_Sortie_Eligibility_Supervisor.EligibilityReason")),
        ("value", printString(value))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorEligibilityReason_Payload(o: Observation_Sortie_Eligibility_Supervisor.EligibilityReason_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.EligibilityReason_Payload""""),
        ("value", printObservation_Sortie_Eligibility_SupervisorEligibilityReasonType(o.value))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorStatusRequestPhaseType(o: Observation_Sortie_Eligibility_Supervisor.StatusRequestPhase.Type): ST = {
      val value: String = o match {
        case Observation_Sortie_Eligibility_Supervisor.StatusRequestPhase.Idle => "Idle"
        case Observation_Sortie_Eligibility_Supervisor.StatusRequestPhase.Pending => "Pending"
        case Observation_Sortie_Eligibility_Supervisor.StatusRequestPhase.Released => "Released"
      }
      return printObject(ISZ(
        ("type", printString("Observation_Sortie_Eligibility_Supervisor.StatusRequestPhase")),
        ("value", printString(value))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorStatusRequestPhase_Payload(o: Observation_Sortie_Eligibility_Supervisor.StatusRequestPhase_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.StatusRequestPhase_Payload""""),
        ("value", printObservation_Sortie_Eligibility_SupervisorStatusRequestPhaseType(o.value))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorStatusFaultStateType(o: Observation_Sortie_Eligibility_Supervisor.StatusFaultState.Type): ST = {
      val value: String = o match {
        case Observation_Sortie_Eligibility_Supervisor.StatusFaultState.Clear => "Clear"
        case Observation_Sortie_Eligibility_Supervisor.StatusFaultState.Active => "Active"
      }
      return printObject(ISZ(
        ("type", printString("Observation_Sortie_Eligibility_Supervisor.StatusFaultState")),
        ("value", printString(value))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorStatusFaultState_Payload(o: Observation_Sortie_Eligibility_Supervisor.StatusFaultState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.StatusFaultState_Payload""""),
        ("value", printObservation_Sortie_Eligibility_SupervisorStatusFaultStateType(o.value))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorStatusRecoveryPhaseType(o: Observation_Sortie_Eligibility_Supervisor.StatusRecoveryPhase.Type): ST = {
      val value: String = o match {
        case Observation_Sortie_Eligibility_Supervisor.StatusRecoveryPhase.Normal => "Normal"
        case Observation_Sortie_Eligibility_Supervisor.StatusRecoveryPhase.Quarantined => "Quarantined"
        case Observation_Sortie_Eligibility_Supervisor.StatusRecoveryPhase.AwaitingAck => "AwaitingAck"
      }
      return printObject(ISZ(
        ("type", printString("Observation_Sortie_Eligibility_Supervisor.StatusRecoveryPhase")),
        ("value", printString(value))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorStatusRecoveryPhase_Payload(o: Observation_Sortie_Eligibility_Supervisor.StatusRecoveryPhase_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.StatusRecoveryPhase_Payload""""),
        ("value", printObservation_Sortie_Eligibility_SupervisorStatusRecoveryPhaseType(o.value))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorStatusDecisionType(o: Observation_Sortie_Eligibility_Supervisor.StatusDecision.Type): ST = {
      val value: String = o match {
        case Observation_Sortie_Eligibility_Supervisor.StatusDecision.Withhold => "Withhold"
        case Observation_Sortie_Eligibility_Supervisor.StatusDecision.Permit => "Permit"
      }
      return printObject(ISZ(
        ("type", printString("Observation_Sortie_Eligibility_Supervisor.StatusDecision")),
        ("value", printString(value))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorStatusDecision_Payload(o: Observation_Sortie_Eligibility_Supervisor.StatusDecision_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.StatusDecision_Payload""""),
        ("value", printObservation_Sortie_Eligibility_SupervisorStatusDecisionType(o.value))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorLimitingCauseType(o: Observation_Sortie_Eligibility_Supervisor.LimitingCause.Type): ST = {
      val value: String = o match {
        case Observation_Sortie_Eligibility_Supervisor.LimitingCause.None => "None"
        case Observation_Sortie_Eligibility_Supervisor.LimitingCause.Energy => "Energy"
        case Observation_Sortie_Eligibility_Supervisor.LimitingCause.Propulsion => "Propulsion"
        case Observation_Sortie_Eligibility_Supervisor.LimitingCause.Navigation => "Navigation"
        case Observation_Sortie_Eligibility_Supervisor.LimitingCause.Obstacle => "Obstacle"
        case Observation_Sortie_Eligibility_Supervisor.LimitingCause.Observation => "Observation"
        case Observation_Sortie_Eligibility_Supervisor.LimitingCause.Communication => "Communication"
        case Observation_Sortie_Eligibility_Supervisor.LimitingCause.Recovery => "Recovery"
        case Observation_Sortie_Eligibility_Supervisor.LimitingCause.NoRequest => "NoRequest"
      }
      return printObject(ISZ(
        ("type", printString("Observation_Sortie_Eligibility_Supervisor.LimitingCause")),
        ("value", printString(value))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorLimitingCause_Payload(o: Observation_Sortie_Eligibility_Supervisor.LimitingCause_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.LimitingCause_Payload""""),
        ("value", printObservation_Sortie_Eligibility_SupervisorLimitingCauseType(o.value))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorEnergyEvidence(o: Observation_Sortie_Eligibility_Supervisor.EnergyEvidence): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.EnergyEvidence""""),
        ("quality", printObservation_Sortie_Eligibility_SupervisorEnergyQualityType(o.quality)),
        ("validity", printObservation_Sortie_Eligibility_SupervisorValidityType(o.validity)),
        ("freshness", printObservation_Sortie_Eligibility_SupervisorFreshnessType(o.freshness))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorEnergyEvidence_Payload(o: Observation_Sortie_Eligibility_Supervisor.EnergyEvidence_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.EnergyEvidence_Payload""""),
        ("value", printObservation_Sortie_Eligibility_SupervisorEnergyEvidence(o.value))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorEnergyAssessment(o: Observation_Sortie_Eligibility_Supervisor.EnergyAssessment): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.EnergyAssessment""""),
        ("ready", printB(o.ready)),
        ("localCause", printObservation_Sortie_Eligibility_SupervisorEnergyCauseType(o.localCause))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorEnergyAssessment_Payload(o: Observation_Sortie_Eligibility_Supervisor.EnergyAssessment_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.EnergyAssessment_Payload""""),
        ("value", printObservation_Sortie_Eligibility_SupervisorEnergyAssessment(o.value))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorNavigationEvidenceRecord(o: Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceRecord): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceRecord""""),
        ("gpsCondition", printObservation_Sortie_Eligibility_SupervisorGpsConditionType(o.gpsCondition)),
        ("inertial", printObservation_Sortie_Eligibility_SupervisorInertialConditionType(o.inertial)),
        ("barometric", printObservation_Sortie_Eligibility_SupervisorBarometricConditionType(o.barometric)),
        ("validity", printObservation_Sortie_Eligibility_SupervisorValidityType(o.validity)),
        ("freshness", printObservation_Sortie_Eligibility_SupervisorFreshnessType(o.freshness))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorNavigationEvidenceRecord_Payload(o: Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceRecord_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceRecord_Payload""""),
        ("value", printObservation_Sortie_Eligibility_SupervisorNavigationEvidenceRecord(o.value))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorNavigationAssessment(o: Observation_Sortie_Eligibility_Supervisor.NavigationAssessment): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.NavigationAssessment""""),
        ("ready", printB(o.ready)),
        ("localCause", printObservation_Sortie_Eligibility_SupervisorNavigationCauseType(o.localCause))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorNavigationAssessment_Payload(o: Observation_Sortie_Eligibility_Supervisor.NavigationAssessment_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.NavigationAssessment_Payload""""),
        ("value", printObservation_Sortie_Eligibility_SupervisorNavigationAssessment(o.value))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorEquipmentEvidence(o: Observation_Sortie_Eligibility_Supervisor.EquipmentEvidence): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.EquipmentEvidence""""),
        ("condition", printObservation_Sortie_Eligibility_SupervisorEquipmentConditionType(o.condition)),
        ("validity", printObservation_Sortie_Eligibility_SupervisorValidityType(o.validity)),
        ("freshness", printObservation_Sortie_Eligibility_SupervisorFreshnessType(o.freshness))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorEquipmentEvidence_Payload(o: Observation_Sortie_Eligibility_Supervisor.EquipmentEvidence_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.EquipmentEvidence_Payload""""),
        ("value", printObservation_Sortie_Eligibility_SupervisorEquipmentEvidence(o.value))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment(o: Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment""""),
        ("ready", printB(o.ready)),
        ("localCause", printObservation_Sortie_Eligibility_SupervisorSingleEquipmentCauseType(o.localCause))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment_Payload(o: Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment_Payload""""),
        ("value", printObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment(o.value))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorPropulsionEvidence(o: Observation_Sortie_Eligibility_Supervisor.PropulsionEvidence): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.PropulsionEvidence""""),
        ("engine1", printObservation_Sortie_Eligibility_SupervisorEngine1ConditionType(o.engine1)),
        ("engine2", printObservation_Sortie_Eligibility_SupervisorEngine2ConditionType(o.engine2)),
        ("engine3", printObservation_Sortie_Eligibility_SupervisorEngine3ConditionType(o.engine3)),
        ("engine4", printObservation_Sortie_Eligibility_SupervisorEngine4ConditionType(o.engine4)),
        ("validity", printObservation_Sortie_Eligibility_SupervisorValidityType(o.validity)),
        ("freshness", printObservation_Sortie_Eligibility_SupervisorFreshnessType(o.freshness)),
        ("alternatingKindsConfirmed", printObservation_Sortie_Eligibility_SupervisorConfirmationType(o.alternatingKindsConfirmed))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorPropulsionEvidence_Payload(o: Observation_Sortie_Eligibility_Supervisor.PropulsionEvidence_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.PropulsionEvidence_Payload""""),
        ("value", printObservation_Sortie_Eligibility_SupervisorPropulsionEvidence(o.value))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorPropulsionAssessment(o: Observation_Sortie_Eligibility_Supervisor.PropulsionAssessment): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.PropulsionAssessment""""),
        ("ready", printB(o.ready)),
        ("localCause", printObservation_Sortie_Eligibility_SupervisorPropulsionCauseType(o.localCause))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorPropulsionAssessment_Payload(o: Observation_Sortie_Eligibility_Supervisor.PropulsionAssessment_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.PropulsionAssessment_Payload""""),
        ("value", printObservation_Sortie_Eligibility_SupervisorPropulsionAssessment(o.value))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorFaultSummary(o: Observation_Sortie_Eligibility_Supervisor.FaultSummary): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.FaultSummary""""),
        ("faultState", printObservation_Sortie_Eligibility_SupervisorFaultStateType(o.faultState)),
        ("primaryCause", printObservation_Sortie_Eligibility_SupervisorEquipmentCauseType(o.primaryCause))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorFaultSummary_Payload(o: Observation_Sortie_Eligibility_Supervisor.FaultSummary_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.FaultSummary_Payload""""),
        ("value", printObservation_Sortie_Eligibility_SupervisorFaultSummary(o.value))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorRecoveryFacts(o: Observation_Sortie_Eligibility_Supervisor.RecoveryFacts): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.RecoveryFacts""""),
        ("phase", printObservation_Sortie_Eligibility_SupervisorRecoveryPhaseType(o.phase)),
        ("gate", printObservation_Sortie_Eligibility_SupervisorRecoveryGateType(o.gate)),
        ("carriedPriority", printObservation_Sortie_Eligibility_SupervisorCarriedPriorityType(o.carriedPriority))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorRecoveryFacts_Payload(o: Observation_Sortie_Eligibility_Supervisor.RecoveryFacts_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.RecoveryFacts_Payload""""),
        ("value", printObservation_Sortie_Eligibility_SupervisorRecoveryFacts(o.value))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorEligibilityDecision(o: Observation_Sortie_Eligibility_Supervisor.EligibilityDecision): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.EligibilityDecision""""),
        ("directive", printObservation_Sortie_Eligibility_SupervisorSortieDirectiveType(o.directive)),
        ("reason", printObservation_Sortie_Eligibility_SupervisorEligibilityReasonType(o.reason))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorEligibilityDecision_Payload(o: Observation_Sortie_Eligibility_Supervisor.EligibilityDecision_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.EligibilityDecision_Payload""""),
        ("value", printObservation_Sortie_Eligibility_SupervisorEligibilityDecision(o.value))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorEligibilityStatus(o: Observation_Sortie_Eligibility_Supervisor.EligibilityStatus): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.EligibilityStatus""""),
        ("requestPhase", printObservation_Sortie_Eligibility_SupervisorStatusRequestPhaseType(o.requestPhase)),
        ("faultState", printObservation_Sortie_Eligibility_SupervisorStatusFaultStateType(o.faultState)),
        ("recoveryPhase", printObservation_Sortie_Eligibility_SupervisorStatusRecoveryPhaseType(o.recoveryPhase)),
        ("decisionDirective", printObservation_Sortie_Eligibility_SupervisorStatusDecisionType(o.decisionDirective)),
        ("limitingCause", printObservation_Sortie_Eligibility_SupervisorLimitingCauseType(o.limitingCause))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorEligibilityStatus_Payload(o: Observation_Sortie_Eligibility_Supervisor.EligibilityStatus_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.EligibilityStatus_Payload""""),
        ("value", printObservation_Sortie_Eligibility_SupervisorEligibilityStatus(o.value))
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

    @pure def printObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container(o: Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container): ST = {
      o match {
        case o: Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_P => return printObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PS => return printObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PS(o)
      }
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_P""""),
        ("api_energy_evidence", printObservation_Sortie_Eligibility_SupervisorEnergyEvidence(o.api_energy_evidence))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PS""""),
        ("api_energy_evidence", printObservation_Sortie_Eligibility_SupervisorEnergyEvidence(o.api_energy_evidence))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container(o: Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container): ST = {
      o match {
        case o: Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_P => return printObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PS => return printObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PS(o)
      }
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_P""""),
        ("api_energy_assessment", printObservation_Sortie_Eligibility_SupervisorEnergyAssessment(o.api_energy_assessment))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PS""""),
        ("api_energy_assessment", printObservation_Sortie_Eligibility_SupervisorEnergyAssessment(o.api_energy_assessment))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container(o: Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container): ST = {
      o match {
        case o: Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_P => return printObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PS => return printObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PS(o)
      }
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_P""""),
        ("api_navigation_evidence", printObservation_Sortie_Eligibility_SupervisorNavigationEvidenceRecord(o.api_navigation_evidence))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PS""""),
        ("api_navigation_evidence", printObservation_Sortie_Eligibility_SupervisorNavigationEvidenceRecord(o.api_navigation_evidence))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container(o: Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container): ST = {
      o match {
        case o: Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_P => return printObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PS => return printObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PS(o)
      }
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_P""""),
        ("api_navigation_assessment", printObservation_Sortie_Eligibility_SupervisorNavigationAssessment(o.api_navigation_assessment))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PS""""),
        ("api_navigation_assessment", printObservation_Sortie_Eligibility_SupervisorNavigationAssessment(o.api_navigation_assessment))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container(o: Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container): ST = {
      o match {
        case o: Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_P => return printObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PS => return printObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PS(o)
      }
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_P""""),
        ("api_communication_evidence", printObservation_Sortie_Eligibility_SupervisorEquipmentEvidence(o.api_communication_evidence))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PS""""),
        ("api_communication_evidence", printObservation_Sortie_Eligibility_SupervisorEquipmentEvidence(o.api_communication_evidence))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container(o: Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container): ST = {
      o match {
        case o: Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_P => return printObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PS => return printObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PS(o)
      }
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_P""""),
        ("api_communication_assessment", printObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment(o.api_communication_assessment))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PS""""),
        ("api_communication_assessment", printObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment(o.api_communication_assessment))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container(o: Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container): ST = {
      o match {
        case o: Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_P => return printObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PS => return printObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PS(o)
      }
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_P""""),
        ("api_observation_evidence", printObservation_Sortie_Eligibility_SupervisorEquipmentEvidence(o.api_observation_evidence))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PS""""),
        ("api_observation_evidence", printObservation_Sortie_Eligibility_SupervisorEquipmentEvidence(o.api_observation_evidence))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container(o: Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container): ST = {
      o match {
        case o: Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_P => return printObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PS => return printObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PS(o)
      }
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_P""""),
        ("api_observation_assessment", printObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment(o.api_observation_assessment))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PS""""),
        ("api_observation_assessment", printObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment(o.api_observation_assessment))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container(o: Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container): ST = {
      o match {
        case o: Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_P => return printObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PS => return printObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PS(o)
      }
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_P""""),
        ("api_obstacle_evidence", printObservation_Sortie_Eligibility_SupervisorEquipmentEvidence(o.api_obstacle_evidence))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PS""""),
        ("api_obstacle_evidence", printObservation_Sortie_Eligibility_SupervisorEquipmentEvidence(o.api_obstacle_evidence))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container(o: Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container): ST = {
      o match {
        case o: Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_P => return printObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PS => return printObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PS(o)
      }
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_P""""),
        ("api_obstacle_assessment", printObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment(o.api_obstacle_assessment))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PS""""),
        ("api_obstacle_assessment", printObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment(o.api_obstacle_assessment))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container(o: Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container): ST = {
      o match {
        case o: Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_P => return printObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PS => return printObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PS(o)
      }
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_P""""),
        ("api_propulsion_evidence", printObservation_Sortie_Eligibility_SupervisorPropulsionEvidence(o.api_propulsion_evidence))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PS""""),
        ("api_propulsion_evidence", printObservation_Sortie_Eligibility_SupervisorPropulsionEvidence(o.api_propulsion_evidence))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container(o: Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container): ST = {
      o match {
        case o: Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_P => return printObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PS => return printObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PS(o)
      }
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_P""""),
        ("api_propulsion_assessment", printObservation_Sortie_Eligibility_SupervisorPropulsionAssessment(o.api_propulsion_assessment))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PS""""),
        ("api_propulsion_assessment", printObservation_Sortie_Eligibility_SupervisorPropulsionAssessment(o.api_propulsion_assessment))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container(o: Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container): ST = {
      o match {
        case o: Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_P => return printObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PS => return printObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PS(o)
      }
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_P""""),
        ("api_accepted_directive", printObservation_Sortie_Eligibility_SupervisorPriorityDirectiveType(o.api_accepted_directive)),
        ("api_operator_event", printObservation_Sortie_Eligibility_SupervisorOperatorEventType(o.api_operator_event)),
        ("api_release_feedback", printObservation_Sortie_Eligibility_SupervisorReleaseFeedbackType(o.api_release_feedback))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PS""""),
        ("api_accepted_directive", printObservation_Sortie_Eligibility_SupervisorPriorityDirectiveType(o.api_accepted_directive)),
        ("api_operator_event", printObservation_Sortie_Eligibility_SupervisorOperatorEventType(o.api_operator_event)),
        ("api_release_feedback", printObservation_Sortie_Eligibility_SupervisorReleaseFeedbackType(o.api_release_feedback))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container(o: Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container): ST = {
      o match {
        case o: Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_P => return printObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PS => return printObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PS(o)
      }
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_P""""),
        ("api_candidate_event", printObservation_Sortie_Eligibility_SupervisorOperatorEventType(o.api_candidate_event)),
        ("api_request_phase", printObservation_Sortie_Eligibility_SupervisorRequestPhaseType(o.api_request_phase))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PS""""),
        ("api_candidate_event", printObservation_Sortie_Eligibility_SupervisorOperatorEventType(o.api_candidate_event)),
        ("api_request_phase", printObservation_Sortie_Eligibility_SupervisorRequestPhaseType(o.api_request_phase))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container(o: Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container): ST = {
      o match {
        case o: Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_P => return printObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PS => return printObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PS(o)
      }
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_P""""),
        ("api_communication_assessment", printObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment(o.api_communication_assessment)),
        ("api_energy_assessment", printObservation_Sortie_Eligibility_SupervisorEnergyAssessment(o.api_energy_assessment)),
        ("api_navigation_assessment", printObservation_Sortie_Eligibility_SupervisorNavigationAssessment(o.api_navigation_assessment)),
        ("api_observation_assessment", printObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment(o.api_observation_assessment)),
        ("api_obstacle_assessment", printObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment(o.api_obstacle_assessment)),
        ("api_propulsion_assessment", printObservation_Sortie_Eligibility_SupervisorPropulsionAssessment(o.api_propulsion_assessment))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PS""""),
        ("api_communication_assessment", printObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment(o.api_communication_assessment)),
        ("api_energy_assessment", printObservation_Sortie_Eligibility_SupervisorEnergyAssessment(o.api_energy_assessment)),
        ("api_navigation_assessment", printObservation_Sortie_Eligibility_SupervisorNavigationAssessment(o.api_navigation_assessment)),
        ("api_observation_assessment", printObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment(o.api_observation_assessment)),
        ("api_obstacle_assessment", printObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment(o.api_obstacle_assessment)),
        ("api_propulsion_assessment", printObservation_Sortie_Eligibility_SupervisorPropulsionAssessment(o.api_propulsion_assessment))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container(o: Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container): ST = {
      o match {
        case o: Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_P => return printObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PS => return printObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PS(o)
      }
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_P""""),
        ("api_fault_summary", printObservation_Sortie_Eligibility_SupervisorFaultSummary(o.api_fault_summary))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PS""""),
        ("api_fault_summary", printObservation_Sortie_Eligibility_SupervisorFaultSummary(o.api_fault_summary))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container(o: Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container): ST = {
      o match {
        case o: Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_P => return printObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PS => return printObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PS(o)
      }
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_P""""),
        ("api_candidate_event", printObservation_Sortie_Eligibility_SupervisorOperatorEventType(o.api_candidate_event)),
        ("api_fault_summary", printObservation_Sortie_Eligibility_SupervisorFaultSummary(o.api_fault_summary))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PS""""),
        ("api_candidate_event", printObservation_Sortie_Eligibility_SupervisorOperatorEventType(o.api_candidate_event)),
        ("api_fault_summary", printObservation_Sortie_Eligibility_SupervisorFaultSummary(o.api_fault_summary))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container(o: Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container): ST = {
      o match {
        case o: Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_P => return printObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PS => return printObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PS(o)
      }
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_P""""),
        ("api_accepted_directive", printObservation_Sortie_Eligibility_SupervisorPriorityDirectiveType(o.api_accepted_directive))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PS""""),
        ("api_accepted_directive", printObservation_Sortie_Eligibility_SupervisorPriorityDirectiveType(o.api_accepted_directive))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container(o: Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container): ST = {
      o match {
        case o: Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_P => return printObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PS => return printObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PS(o)
      }
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_P""""),
        ("api_accepted_directive", printObservation_Sortie_Eligibility_SupervisorPriorityDirectiveType(o.api_accepted_directive)),
        ("api_fault_summary", printObservation_Sortie_Eligibility_SupervisorFaultSummary(o.api_fault_summary))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PS""""),
        ("api_accepted_directive", printObservation_Sortie_Eligibility_SupervisorPriorityDirectiveType(o.api_accepted_directive)),
        ("api_fault_summary", printObservation_Sortie_Eligibility_SupervisorFaultSummary(o.api_fault_summary))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container(o: Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container): ST = {
      o match {
        case o: Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_P => return printObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PS => return printObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PS(o)
      }
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_P""""),
        ("api_recovery_facts", printObservation_Sortie_Eligibility_SupervisorRecoveryFacts(o.api_recovery_facts)),
        ("api_recovery_phase", printObservation_Sortie_Eligibility_SupervisorRecoveryPhaseType(o.api_recovery_phase))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PS""""),
        ("api_recovery_facts", printObservation_Sortie_Eligibility_SupervisorRecoveryFacts(o.api_recovery_facts)),
        ("api_recovery_phase", printObservation_Sortie_Eligibility_SupervisorRecoveryPhaseType(o.api_recovery_phase))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container(o: Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container): ST = {
      o match {
        case o: Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_P => return printObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PS => return printObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PS(o)
      }
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_P""""),
        ("api_communication_assessment", printObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment(o.api_communication_assessment)),
        ("api_energy_assessment", printObservation_Sortie_Eligibility_SupervisorEnergyAssessment(o.api_energy_assessment)),
        ("api_navigation_assessment", printObservation_Sortie_Eligibility_SupervisorNavigationAssessment(o.api_navigation_assessment)),
        ("api_observation_assessment", printObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment(o.api_observation_assessment)),
        ("api_obstacle_assessment", printObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment(o.api_obstacle_assessment)),
        ("api_propulsion_assessment", printObservation_Sortie_Eligibility_SupervisorPropulsionAssessment(o.api_propulsion_assessment)),
        ("api_recovery_facts", printObservation_Sortie_Eligibility_SupervisorRecoveryFacts(o.api_recovery_facts)),
        ("api_request_phase", printObservation_Sortie_Eligibility_SupervisorRequestPhaseType(o.api_request_phase))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PS""""),
        ("api_communication_assessment", printObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment(o.api_communication_assessment)),
        ("api_energy_assessment", printObservation_Sortie_Eligibility_SupervisorEnergyAssessment(o.api_energy_assessment)),
        ("api_navigation_assessment", printObservation_Sortie_Eligibility_SupervisorNavigationAssessment(o.api_navigation_assessment)),
        ("api_observation_assessment", printObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment(o.api_observation_assessment)),
        ("api_obstacle_assessment", printObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment(o.api_obstacle_assessment)),
        ("api_propulsion_assessment", printObservation_Sortie_Eligibility_SupervisorPropulsionAssessment(o.api_propulsion_assessment)),
        ("api_recovery_facts", printObservation_Sortie_Eligibility_SupervisorRecoveryFacts(o.api_recovery_facts)),
        ("api_request_phase", printObservation_Sortie_Eligibility_SupervisorRequestPhaseType(o.api_request_phase))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container(o: Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container): ST = {
      o match {
        case o: Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_P => return printObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PS => return printObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PS(o)
      }
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_P""""),
        ("api_eligibility_decision", printObservation_Sortie_Eligibility_SupervisorEligibilityDecision(o.api_eligibility_decision))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PS""""),
        ("api_eligibility_decision", printObservation_Sortie_Eligibility_SupervisorEligibilityDecision(o.api_eligibility_decision))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container(o: Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container): ST = {
      o match {
        case o: Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_P => return printObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PS => return printObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PS(o)
      }
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_P""""),
        ("api_eligibility_decision", printObservation_Sortie_Eligibility_SupervisorEligibilityDecision(o.api_eligibility_decision)),
        ("api_request_phase", printObservation_Sortie_Eligibility_SupervisorRequestPhaseType(o.api_request_phase))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PS""""),
        ("api_eligibility_decision", printObservation_Sortie_Eligibility_SupervisorEligibilityDecision(o.api_eligibility_decision)),
        ("api_request_phase", printObservation_Sortie_Eligibility_SupervisorRequestPhaseType(o.api_request_phase))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container(o: Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container): ST = {
      o match {
        case o: Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_P => return printObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PS => return printObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PS(o)
      }
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_P""""),
        ("api_release_feedback", printObservation_Sortie_Eligibility_SupervisorReleaseFeedbackType(o.api_release_feedback)),
        ("api_sortie_directive", printObservation_Sortie_Eligibility_SupervisorSortieDirectiveType(o.api_sortie_directive))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PS""""),
        ("api_release_feedback", printObservation_Sortie_Eligibility_SupervisorReleaseFeedbackType(o.api_release_feedback)),
        ("api_sortie_directive", printObservation_Sortie_Eligibility_SupervisorSortieDirectiveType(o.api_sortie_directive))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container(o: Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PreState_Container): ST = {
      o match {
        case o: Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_P => return printObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PS => return printObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PS(o)
      }
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_P""""),
        ("api_eligibility_decision", printObservation_Sortie_Eligibility_SupervisorEligibilityDecision(o.api_eligibility_decision)),
        ("api_fault_summary", printObservation_Sortie_Eligibility_SupervisorFaultSummary(o.api_fault_summary)),
        ("api_recovery_phase", printObservation_Sortie_Eligibility_SupervisorRecoveryPhaseType(o.api_recovery_phase)),
        ("api_request_phase", printObservation_Sortie_Eligibility_SupervisorRequestPhaseType(o.api_request_phase))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PS""""),
        ("api_eligibility_decision", printObservation_Sortie_Eligibility_SupervisorEligibilityDecision(o.api_eligibility_decision)),
        ("api_fault_summary", printObservation_Sortie_Eligibility_SupervisorFaultSummary(o.api_fault_summary)),
        ("api_recovery_phase", printObservation_Sortie_Eligibility_SupervisorRecoveryPhaseType(o.api_recovery_phase)),
        ("api_request_phase", printObservation_Sortie_Eligibility_SupervisorRequestPhaseType(o.api_request_phase))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container(o: Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PostState_Container): ST = {
      o match {
        case o: Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_P => return printObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PS => return printObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PS(o)
      }
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_P""""),
        ("api_eligibility_status", printObservation_Sortie_Eligibility_SupervisorEligibilityStatus(o.api_eligibility_status))
      ))
    }

    @pure def printObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PS""""),
        ("api_eligibility_status", printObservation_Sortie_Eligibility_SupervisorEligibilityStatus(o.api_eligibility_status))
      ))
    }

    @pure def printruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): ST = {
      val value: String = o match {
        case runtimemonitor.ObservationKind.ObservationSortieEligibilitySupervisorSystem_Instance_eligibility_supervisor_process_energy_evidence_assessor_postInit => "ObservationSortieEligibilitySupervisorSystem_Instance_eligibility_supervisor_process_energy_evidence_assessor_postInit"
        case runtimemonitor.ObservationKind.ObservationSortieEligibilitySupervisorSystem_Instance_eligibility_supervisor_process_energy_evidence_assessor_preCompute => "ObservationSortieEligibilitySupervisorSystem_Instance_eligibility_supervisor_process_energy_evidence_assessor_preCompute"
        case runtimemonitor.ObservationKind.ObservationSortieEligibilitySupervisorSystem_Instance_eligibility_supervisor_process_energy_evidence_assessor_postCompute => "ObservationSortieEligibilitySupervisorSystem_Instance_eligibility_supervisor_process_energy_evidence_assessor_postCompute"
        case runtimemonitor.ObservationKind.ObservationSortieEligibilitySupervisorSystem_Instance_eligibility_supervisor_process_navigation_evidence_assessor_postInit => "ObservationSortieEligibilitySupervisorSystem_Instance_eligibility_supervisor_process_navigation_evidence_assessor_postInit"
        case runtimemonitor.ObservationKind.ObservationSortieEligibilitySupervisorSystem_Instance_eligibility_supervisor_process_navigation_evidence_assessor_preCompute => "ObservationSortieEligibilitySupervisorSystem_Instance_eligibility_supervisor_process_navigation_evidence_assessor_preCompute"
        case runtimemonitor.ObservationKind.ObservationSortieEligibilitySupervisorSystem_Instance_eligibility_supervisor_process_navigation_evidence_assessor_postCompute => "ObservationSortieEligibilitySupervisorSystem_Instance_eligibility_supervisor_process_navigation_evidence_assessor_postCompute"
        case runtimemonitor.ObservationKind.ObservationSortieEligibilitySupervisorSystem_Instance_eligibility_supervisor_process_communication_evidence_assessor_postInit => "ObservationSortieEligibilitySupervisorSystem_Instance_eligibility_supervisor_process_communication_evidence_assessor_postInit"
        case runtimemonitor.ObservationKind.ObservationSortieEligibilitySupervisorSystem_Instance_eligibility_supervisor_process_communication_evidence_assessor_preCompute => "ObservationSortieEligibilitySupervisorSystem_Instance_eligibility_supervisor_process_communication_evidence_assessor_preCompute"
        case runtimemonitor.ObservationKind.ObservationSortieEligibilitySupervisorSystem_Instance_eligibility_supervisor_process_communication_evidence_assessor_postCompute => "ObservationSortieEligibilitySupervisorSystem_Instance_eligibility_supervisor_process_communication_evidence_assessor_postCompute"
        case runtimemonitor.ObservationKind.ObservationSortieEligibilitySupervisorSystem_Instance_eligibility_supervisor_process_observation_evidence_assessor_postInit => "ObservationSortieEligibilitySupervisorSystem_Instance_eligibility_supervisor_process_observation_evidence_assessor_postInit"
        case runtimemonitor.ObservationKind.ObservationSortieEligibilitySupervisorSystem_Instance_eligibility_supervisor_process_observation_evidence_assessor_preCompute => "ObservationSortieEligibilitySupervisorSystem_Instance_eligibility_supervisor_process_observation_evidence_assessor_preCompute"
        case runtimemonitor.ObservationKind.ObservationSortieEligibilitySupervisorSystem_Instance_eligibility_supervisor_process_observation_evidence_assessor_postCompute => "ObservationSortieEligibilitySupervisorSystem_Instance_eligibility_supervisor_process_observation_evidence_assessor_postCompute"
        case runtimemonitor.ObservationKind.ObservationSortieEligibilitySupervisorSystem_Instance_eligibility_supervisor_process_obstacle_evidence_assessor_postInit => "ObservationSortieEligibilitySupervisorSystem_Instance_eligibility_supervisor_process_obstacle_evidence_assessor_postInit"
        case runtimemonitor.ObservationKind.ObservationSortieEligibilitySupervisorSystem_Instance_eligibility_supervisor_process_obstacle_evidence_assessor_preCompute => "ObservationSortieEligibilitySupervisorSystem_Instance_eligibility_supervisor_process_obstacle_evidence_assessor_preCompute"
        case runtimemonitor.ObservationKind.ObservationSortieEligibilitySupervisorSystem_Instance_eligibility_supervisor_process_obstacle_evidence_assessor_postCompute => "ObservationSortieEligibilitySupervisorSystem_Instance_eligibility_supervisor_process_obstacle_evidence_assessor_postCompute"
        case runtimemonitor.ObservationKind.ObservationSortieEligibilitySupervisorSystem_Instance_eligibility_supervisor_process_propulsion_evidence_assessor_postInit => "ObservationSortieEligibilitySupervisorSystem_Instance_eligibility_supervisor_process_propulsion_evidence_assessor_postInit"
        case runtimemonitor.ObservationKind.ObservationSortieEligibilitySupervisorSystem_Instance_eligibility_supervisor_process_propulsion_evidence_assessor_preCompute => "ObservationSortieEligibilitySupervisorSystem_Instance_eligibility_supervisor_process_propulsion_evidence_assessor_preCompute"
        case runtimemonitor.ObservationKind.ObservationSortieEligibilitySupervisorSystem_Instance_eligibility_supervisor_process_propulsion_evidence_assessor_postCompute => "ObservationSortieEligibilitySupervisorSystem_Instance_eligibility_supervisor_process_propulsion_evidence_assessor_postCompute"
        case runtimemonitor.ObservationKind.ObservationSortieEligibilitySupervisorSystem_Instance_eligibility_supervisor_process_request_lifecycle_owner_postInit => "ObservationSortieEligibilitySupervisorSystem_Instance_eligibility_supervisor_process_request_lifecycle_owner_postInit"
        case runtimemonitor.ObservationKind.ObservationSortieEligibilitySupervisorSystem_Instance_eligibility_supervisor_process_request_lifecycle_owner_preCompute => "ObservationSortieEligibilitySupervisorSystem_Instance_eligibility_supervisor_process_request_lifecycle_owner_preCompute"
        case runtimemonitor.ObservationKind.ObservationSortieEligibilitySupervisorSystem_Instance_eligibility_supervisor_process_request_lifecycle_owner_postCompute => "ObservationSortieEligibilitySupervisorSystem_Instance_eligibility_supervisor_process_request_lifecycle_owner_postCompute"
        case runtimemonitor.ObservationKind.ObservationSortieEligibilitySupervisorSystem_Instance_eligibility_supervisor_process_fault_registry_postInit => "ObservationSortieEligibilitySupervisorSystem_Instance_eligibility_supervisor_process_fault_registry_postInit"
        case runtimemonitor.ObservationKind.ObservationSortieEligibilitySupervisorSystem_Instance_eligibility_supervisor_process_fault_registry_preCompute => "ObservationSortieEligibilitySupervisorSystem_Instance_eligibility_supervisor_process_fault_registry_preCompute"
        case runtimemonitor.ObservationKind.ObservationSortieEligibilitySupervisorSystem_Instance_eligibility_supervisor_process_fault_registry_postCompute => "ObservationSortieEligibilitySupervisorSystem_Instance_eligibility_supervisor_process_fault_registry_postCompute"
        case runtimemonitor.ObservationKind.ObservationSortieEligibilitySupervisorSystem_Instance_eligibility_supervisor_process_priority_arbiter_postInit => "ObservationSortieEligibilitySupervisorSystem_Instance_eligibility_supervisor_process_priority_arbiter_postInit"
        case runtimemonitor.ObservationKind.ObservationSortieEligibilitySupervisorSystem_Instance_eligibility_supervisor_process_priority_arbiter_preCompute => "ObservationSortieEligibilitySupervisorSystem_Instance_eligibility_supervisor_process_priority_arbiter_preCompute"
        case runtimemonitor.ObservationKind.ObservationSortieEligibilitySupervisorSystem_Instance_eligibility_supervisor_process_priority_arbiter_postCompute => "ObservationSortieEligibilitySupervisorSystem_Instance_eligibility_supervisor_process_priority_arbiter_postCompute"
        case runtimemonitor.ObservationKind.ObservationSortieEligibilitySupervisorSystem_Instance_eligibility_supervisor_process_recovery_qualification_owner_postInit => "ObservationSortieEligibilitySupervisorSystem_Instance_eligibility_supervisor_process_recovery_qualification_owner_postInit"
        case runtimemonitor.ObservationKind.ObservationSortieEligibilitySupervisorSystem_Instance_eligibility_supervisor_process_recovery_qualification_owner_preCompute => "ObservationSortieEligibilitySupervisorSystem_Instance_eligibility_supervisor_process_recovery_qualification_owner_preCompute"
        case runtimemonitor.ObservationKind.ObservationSortieEligibilitySupervisorSystem_Instance_eligibility_supervisor_process_recovery_qualification_owner_postCompute => "ObservationSortieEligibilitySupervisorSystem_Instance_eligibility_supervisor_process_recovery_qualification_owner_postCompute"
        case runtimemonitor.ObservationKind.ObservationSortieEligibilitySupervisorSystem_Instance_eligibility_supervisor_process_eligibility_decision_owner_postInit => "ObservationSortieEligibilitySupervisorSystem_Instance_eligibility_supervisor_process_eligibility_decision_owner_postInit"
        case runtimemonitor.ObservationKind.ObservationSortieEligibilitySupervisorSystem_Instance_eligibility_supervisor_process_eligibility_decision_owner_preCompute => "ObservationSortieEligibilitySupervisorSystem_Instance_eligibility_supervisor_process_eligibility_decision_owner_preCompute"
        case runtimemonitor.ObservationKind.ObservationSortieEligibilitySupervisorSystem_Instance_eligibility_supervisor_process_eligibility_decision_owner_postCompute => "ObservationSortieEligibilitySupervisorSystem_Instance_eligibility_supervisor_process_eligibility_decision_owner_postCompute"
        case runtimemonitor.ObservationKind.ObservationSortieEligibilitySupervisorSystem_Instance_eligibility_supervisor_process_permission_release_ledger_postInit => "ObservationSortieEligibilitySupervisorSystem_Instance_eligibility_supervisor_process_permission_release_ledger_postInit"
        case runtimemonitor.ObservationKind.ObservationSortieEligibilitySupervisorSystem_Instance_eligibility_supervisor_process_permission_release_ledger_preCompute => "ObservationSortieEligibilitySupervisorSystem_Instance_eligibility_supervisor_process_permission_release_ledger_preCompute"
        case runtimemonitor.ObservationKind.ObservationSortieEligibilitySupervisorSystem_Instance_eligibility_supervisor_process_permission_release_ledger_postCompute => "ObservationSortieEligibilitySupervisorSystem_Instance_eligibility_supervisor_process_permission_release_ledger_postCompute"
        case runtimemonitor.ObservationKind.ObservationSortieEligibilitySupervisorSystem_Instance_eligibility_supervisor_process_status_composer_postInit => "ObservationSortieEligibilitySupervisorSystem_Instance_eligibility_supervisor_process_status_composer_postInit"
        case runtimemonitor.ObservationKind.ObservationSortieEligibilitySupervisorSystem_Instance_eligibility_supervisor_process_status_composer_preCompute => "ObservationSortieEligibilitySupervisorSystem_Instance_eligibility_supervisor_process_status_composer_preCompute"
        case runtimemonitor.ObservationKind.ObservationSortieEligibilitySupervisorSystem_Instance_eligibility_supervisor_process_status_composer_postCompute => "ObservationSortieEligibilitySupervisorSystem_Instance_eligibility_supervisor_process_status_composer_postCompute"
      }
      return printObject(ISZ(
        ("type", printString("runtimemonitor.ObservationKind")),
        ("value", printString(value))
      ))
    }

    @pure def printutilContainer(o: util.Container): ST = {
      o match {
        case o: util.EmptyContainer => return printutilEmptyContainer(o)
        case o: Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_P => return printObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PS => return printObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_P => return printObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PS => return printObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_P => return printObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PS => return printObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_P => return printObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PS => return printObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_P => return printObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PS => return printObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_P => return printObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PS => return printObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_P => return printObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PS => return printObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_P => return printObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PS => return printObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_P => return printObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PS => return printObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_P => return printObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PS => return printObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_P => return printObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PS => return printObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_P => return printObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PS => return printObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_P => return printObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PS => return printObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_P => return printObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_P => return printObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PS => return printObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PS => return printObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_P => return printObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PS => return printObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_P => return printObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_P => return printObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_P => return printObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PS => return printObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PS => return printObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PS => return printObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_P => return printObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_P => return printObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_P => return printObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PS => return printObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PS => return printObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PS => return printObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_P => return printObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PS => return printObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_P => return printObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PS => return printObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_P => return printObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PS => return printObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_P => return printObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PS => return printObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PS(o)
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
        case o: Observation_Sortie_Eligibility_Supervisor.Validity_Payload => return printObservation_Sortie_Eligibility_SupervisorValidity_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.Freshness_Payload => return printObservation_Sortie_Eligibility_SupervisorFreshness_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.FaultState_Payload => return printObservation_Sortie_Eligibility_SupervisorFaultState_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.EnergyCause_Payload => return printObservation_Sortie_Eligibility_SupervisorEnergyCause_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.RecoveryGate_Payload => return printObservation_Sortie_Eligibility_SupervisorRecoveryGate_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.RequestPhase_Payload => return printObservation_Sortie_Eligibility_SupervisorRequestPhase_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.Confirmation_Payload => return printObservation_Sortie_Eligibility_SupervisorConfirmation_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.GpsCondition_Payload => return printObservation_Sortie_Eligibility_SupervisorGpsCondition_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.FaultSummary_Payload => return printObservation_Sortie_Eligibility_SupervisorFaultSummary_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.RecoveryPhase_Payload => return printObservation_Sortie_Eligibility_SupervisorRecoveryPhase_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.EnergyQuality_Payload => return printObservation_Sortie_Eligibility_SupervisorEnergyQuality_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.OperatorEvent_Payload => return printObservation_Sortie_Eligibility_SupervisorOperatorEvent_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.LimitingCause_Payload => return printObservation_Sortie_Eligibility_SupervisorLimitingCause_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.RecoveryFacts_Payload => return printObservation_Sortie_Eligibility_SupervisorRecoveryFacts_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.StatusDecision_Payload => return printObservation_Sortie_Eligibility_SupervisorStatusDecision_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.EquipmentCause_Payload => return printObservation_Sortie_Eligibility_SupervisorEquipmentCause_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.EnergyEvidence_Payload => return printObservation_Sortie_Eligibility_SupervisorEnergyEvidence_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.SortieDirective_Payload => return printObservation_Sortie_Eligibility_SupervisorSortieDirective_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.ReleaseFeedback_Payload => return printObservation_Sortie_Eligibility_SupervisorReleaseFeedback_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.CarriedPriority_Payload => return printObservation_Sortie_Eligibility_SupervisorCarriedPriority_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.NavigationCause_Payload => return printObservation_Sortie_Eligibility_SupervisorNavigationCause_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.PropulsionCause_Payload => return printObservation_Sortie_Eligibility_SupervisorPropulsionCause_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.StatusFaultState_Payload => return printObservation_Sortie_Eligibility_SupervisorStatusFaultState_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.Engine1Condition_Payload => return printObservation_Sortie_Eligibility_SupervisorEngine1Condition_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.Engine2Condition_Payload => return printObservation_Sortie_Eligibility_SupervisorEngine2Condition_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.Engine3Condition_Payload => return printObservation_Sortie_Eligibility_SupervisorEngine3Condition_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.Engine4Condition_Payload => return printObservation_Sortie_Eligibility_SupervisorEngine4Condition_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.EnergyAssessment_Payload => return printObservation_Sortie_Eligibility_SupervisorEnergyAssessment_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.EligibilityReason_Payload => return printObservation_Sortie_Eligibility_SupervisorEligibilityReason_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.InertialCondition_Payload => return printObservation_Sortie_Eligibility_SupervisorInertialCondition_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.PriorityDirective_Payload => return printObservation_Sortie_Eligibility_SupervisorPriorityDirective_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.EquipmentEvidence_Payload => return printObservation_Sortie_Eligibility_SupervisorEquipmentEvidence_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.EligibilityStatus_Payload => return printObservation_Sortie_Eligibility_SupervisorEligibilityStatus_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.StatusRequestPhase_Payload => return printObservation_Sortie_Eligibility_SupervisorStatusRequestPhase_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.EquipmentCondition_Payload => return printObservation_Sortie_Eligibility_SupervisorEquipmentCondition_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.PropulsionEvidence_Payload => return printObservation_Sortie_Eligibility_SupervisorPropulsionEvidence_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.StatusRecoveryPhase_Payload => return printObservation_Sortie_Eligibility_SupervisorStatusRecoveryPhase_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.BarometricCondition_Payload => return printObservation_Sortie_Eligibility_SupervisorBarometricCondition_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.EligibilityDecision_Payload => return printObservation_Sortie_Eligibility_SupervisorEligibilityDecision_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.SingleEquipmentCause_Payload => return printObservation_Sortie_Eligibility_SupervisorSingleEquipmentCause_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.NavigationAssessment_Payload => return printObservation_Sortie_Eligibility_SupervisorNavigationAssessment_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.PropulsionAssessment_Payload => return printObservation_Sortie_Eligibility_SupervisorPropulsionAssessment_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceRecord_Payload => return printObservation_Sortie_Eligibility_SupervisorNavigationEvidenceRecord_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment_Payload => return printObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment_Payload(o)
        case o: Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_P => return printObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PS => return printObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_P => return printObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PS => return printObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_P => return printObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PS => return printObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_P => return printObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PS => return printObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_P => return printObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PS => return printObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_P => return printObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PS => return printObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_P => return printObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PS => return printObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_P => return printObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PS => return printObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_P => return printObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PS => return printObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_P => return printObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PS => return printObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_P => return printObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PS => return printObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_P => return printObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PS => return printObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_P => return printObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PS => return printObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_P => return printObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_P => return printObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PS => return printObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PS => return printObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_P => return printObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PS => return printObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_P => return printObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_P => return printObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_P => return printObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PS => return printObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PS => return printObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PS => return printObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_P => return printObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_P => return printObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_P => return printObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PS => return printObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PS => return printObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PS => return printObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_P => return printObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PS => return printObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_P => return printObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PS => return printObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_P => return printObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PS => return printObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PS(o)
        case o: Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_P => return printObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_P(o)
        case o: Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PS => return printObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PS(o)
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

    def parseObservation_Sortie_Eligibility_SupervisorEnergyQualityType(): Observation_Sortie_Eligibility_Supervisor.EnergyQuality.Type = {
      val r = parseObservation_Sortie_Eligibility_SupervisorEnergyQualityT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorEnergyQualityT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.EnergyQuality.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.EnergyQuality")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Observation_Sortie_Eligibility_Supervisor.EnergyQuality.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Observation_Sortie_Eligibility_Supervisor.EnergyQuality.")
          return Observation_Sortie_Eligibility_Supervisor.EnergyQuality.byOrdinal(0).get
      }
    }

    def parseObservation_Sortie_Eligibility_SupervisorEnergyQuality_Payload(): Observation_Sortie_Eligibility_Supervisor.EnergyQuality_Payload = {
      val r = parseObservation_Sortie_Eligibility_SupervisorEnergyQuality_PayloadT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorEnergyQuality_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.EnergyQuality_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.EnergyQuality_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseObservation_Sortie_Eligibility_SupervisorEnergyQualityType()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.EnergyQuality_Payload(value)
    }

    def parseObservation_Sortie_Eligibility_SupervisorValidityType(): Observation_Sortie_Eligibility_Supervisor.Validity.Type = {
      val r = parseObservation_Sortie_Eligibility_SupervisorValidityT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorValidityT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.Validity.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.Validity")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Observation_Sortie_Eligibility_Supervisor.Validity.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Observation_Sortie_Eligibility_Supervisor.Validity.")
          return Observation_Sortie_Eligibility_Supervisor.Validity.byOrdinal(0).get
      }
    }

    def parseObservation_Sortie_Eligibility_SupervisorValidity_Payload(): Observation_Sortie_Eligibility_Supervisor.Validity_Payload = {
      val r = parseObservation_Sortie_Eligibility_SupervisorValidity_PayloadT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorValidity_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.Validity_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.Validity_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseObservation_Sortie_Eligibility_SupervisorValidityType()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.Validity_Payload(value)
    }

    def parseObservation_Sortie_Eligibility_SupervisorFreshnessType(): Observation_Sortie_Eligibility_Supervisor.Freshness.Type = {
      val r = parseObservation_Sortie_Eligibility_SupervisorFreshnessT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorFreshnessT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.Freshness.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.Freshness")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Observation_Sortie_Eligibility_Supervisor.Freshness.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Observation_Sortie_Eligibility_Supervisor.Freshness.")
          return Observation_Sortie_Eligibility_Supervisor.Freshness.byOrdinal(0).get
      }
    }

    def parseObservation_Sortie_Eligibility_SupervisorFreshness_Payload(): Observation_Sortie_Eligibility_Supervisor.Freshness_Payload = {
      val r = parseObservation_Sortie_Eligibility_SupervisorFreshness_PayloadT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorFreshness_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.Freshness_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.Freshness_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseObservation_Sortie_Eligibility_SupervisorFreshnessType()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.Freshness_Payload(value)
    }

    def parseObservation_Sortie_Eligibility_SupervisorEnergyCauseType(): Observation_Sortie_Eligibility_Supervisor.EnergyCause.Type = {
      val r = parseObservation_Sortie_Eligibility_SupervisorEnergyCauseT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorEnergyCauseT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.EnergyCause.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.EnergyCause")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Observation_Sortie_Eligibility_Supervisor.EnergyCause.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Observation_Sortie_Eligibility_Supervisor.EnergyCause.")
          return Observation_Sortie_Eligibility_Supervisor.EnergyCause.byOrdinal(0).get
      }
    }

    def parseObservation_Sortie_Eligibility_SupervisorEnergyCause_Payload(): Observation_Sortie_Eligibility_Supervisor.EnergyCause_Payload = {
      val r = parseObservation_Sortie_Eligibility_SupervisorEnergyCause_PayloadT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorEnergyCause_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.EnergyCause_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.EnergyCause_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseObservation_Sortie_Eligibility_SupervisorEnergyCauseType()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.EnergyCause_Payload(value)
    }

    def parseObservation_Sortie_Eligibility_SupervisorGpsConditionType(): Observation_Sortie_Eligibility_Supervisor.GpsCondition.Type = {
      val r = parseObservation_Sortie_Eligibility_SupervisorGpsConditionT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorGpsConditionT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.GpsCondition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.GpsCondition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Observation_Sortie_Eligibility_Supervisor.GpsCondition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Observation_Sortie_Eligibility_Supervisor.GpsCondition.")
          return Observation_Sortie_Eligibility_Supervisor.GpsCondition.byOrdinal(0).get
      }
    }

    def parseObservation_Sortie_Eligibility_SupervisorGpsCondition_Payload(): Observation_Sortie_Eligibility_Supervisor.GpsCondition_Payload = {
      val r = parseObservation_Sortie_Eligibility_SupervisorGpsCondition_PayloadT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorGpsCondition_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.GpsCondition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.GpsCondition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseObservation_Sortie_Eligibility_SupervisorGpsConditionType()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.GpsCondition_Payload(value)
    }

    def parseObservation_Sortie_Eligibility_SupervisorInertialConditionType(): Observation_Sortie_Eligibility_Supervisor.InertialCondition.Type = {
      val r = parseObservation_Sortie_Eligibility_SupervisorInertialConditionT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorInertialConditionT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.InertialCondition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.InertialCondition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Observation_Sortie_Eligibility_Supervisor.InertialCondition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Observation_Sortie_Eligibility_Supervisor.InertialCondition.")
          return Observation_Sortie_Eligibility_Supervisor.InertialCondition.byOrdinal(0).get
      }
    }

    def parseObservation_Sortie_Eligibility_SupervisorInertialCondition_Payload(): Observation_Sortie_Eligibility_Supervisor.InertialCondition_Payload = {
      val r = parseObservation_Sortie_Eligibility_SupervisorInertialCondition_PayloadT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorInertialCondition_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.InertialCondition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.InertialCondition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseObservation_Sortie_Eligibility_SupervisorInertialConditionType()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.InertialCondition_Payload(value)
    }

    def parseObservation_Sortie_Eligibility_SupervisorBarometricConditionType(): Observation_Sortie_Eligibility_Supervisor.BarometricCondition.Type = {
      val r = parseObservation_Sortie_Eligibility_SupervisorBarometricConditionT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorBarometricConditionT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.BarometricCondition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.BarometricCondition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Observation_Sortie_Eligibility_Supervisor.BarometricCondition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Observation_Sortie_Eligibility_Supervisor.BarometricCondition.")
          return Observation_Sortie_Eligibility_Supervisor.BarometricCondition.byOrdinal(0).get
      }
    }

    def parseObservation_Sortie_Eligibility_SupervisorBarometricCondition_Payload(): Observation_Sortie_Eligibility_Supervisor.BarometricCondition_Payload = {
      val r = parseObservation_Sortie_Eligibility_SupervisorBarometricCondition_PayloadT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorBarometricCondition_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.BarometricCondition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.BarometricCondition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseObservation_Sortie_Eligibility_SupervisorBarometricConditionType()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.BarometricCondition_Payload(value)
    }

    def parseObservation_Sortie_Eligibility_SupervisorNavigationCauseType(): Observation_Sortie_Eligibility_Supervisor.NavigationCause.Type = {
      val r = parseObservation_Sortie_Eligibility_SupervisorNavigationCauseT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorNavigationCauseT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.NavigationCause.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.NavigationCause")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Observation_Sortie_Eligibility_Supervisor.NavigationCause.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Observation_Sortie_Eligibility_Supervisor.NavigationCause.")
          return Observation_Sortie_Eligibility_Supervisor.NavigationCause.byOrdinal(0).get
      }
    }

    def parseObservation_Sortie_Eligibility_SupervisorNavigationCause_Payload(): Observation_Sortie_Eligibility_Supervisor.NavigationCause_Payload = {
      val r = parseObservation_Sortie_Eligibility_SupervisorNavigationCause_PayloadT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorNavigationCause_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.NavigationCause_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.NavigationCause_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseObservation_Sortie_Eligibility_SupervisorNavigationCauseType()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.NavigationCause_Payload(value)
    }

    def parseObservation_Sortie_Eligibility_SupervisorEquipmentConditionType(): Observation_Sortie_Eligibility_Supervisor.EquipmentCondition.Type = {
      val r = parseObservation_Sortie_Eligibility_SupervisorEquipmentConditionT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorEquipmentConditionT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.EquipmentCondition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.EquipmentCondition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Observation_Sortie_Eligibility_Supervisor.EquipmentCondition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Observation_Sortie_Eligibility_Supervisor.EquipmentCondition.")
          return Observation_Sortie_Eligibility_Supervisor.EquipmentCondition.byOrdinal(0).get
      }
    }

    def parseObservation_Sortie_Eligibility_SupervisorEquipmentCondition_Payload(): Observation_Sortie_Eligibility_Supervisor.EquipmentCondition_Payload = {
      val r = parseObservation_Sortie_Eligibility_SupervisorEquipmentCondition_PayloadT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorEquipmentCondition_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.EquipmentCondition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.EquipmentCondition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseObservation_Sortie_Eligibility_SupervisorEquipmentConditionType()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.EquipmentCondition_Payload(value)
    }

    def parseObservation_Sortie_Eligibility_SupervisorSingleEquipmentCauseType(): Observation_Sortie_Eligibility_Supervisor.SingleEquipmentCause.Type = {
      val r = parseObservation_Sortie_Eligibility_SupervisorSingleEquipmentCauseT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorSingleEquipmentCauseT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.SingleEquipmentCause.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.SingleEquipmentCause")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Observation_Sortie_Eligibility_Supervisor.SingleEquipmentCause.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Observation_Sortie_Eligibility_Supervisor.SingleEquipmentCause.")
          return Observation_Sortie_Eligibility_Supervisor.SingleEquipmentCause.byOrdinal(0).get
      }
    }

    def parseObservation_Sortie_Eligibility_SupervisorSingleEquipmentCause_Payload(): Observation_Sortie_Eligibility_Supervisor.SingleEquipmentCause_Payload = {
      val r = parseObservation_Sortie_Eligibility_SupervisorSingleEquipmentCause_PayloadT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorSingleEquipmentCause_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.SingleEquipmentCause_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.SingleEquipmentCause_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseObservation_Sortie_Eligibility_SupervisorSingleEquipmentCauseType()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.SingleEquipmentCause_Payload(value)
    }

    def parseObservation_Sortie_Eligibility_SupervisorEngine1ConditionType(): Observation_Sortie_Eligibility_Supervisor.Engine1Condition.Type = {
      val r = parseObservation_Sortie_Eligibility_SupervisorEngine1ConditionT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorEngine1ConditionT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.Engine1Condition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.Engine1Condition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Observation_Sortie_Eligibility_Supervisor.Engine1Condition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Observation_Sortie_Eligibility_Supervisor.Engine1Condition.")
          return Observation_Sortie_Eligibility_Supervisor.Engine1Condition.byOrdinal(0).get
      }
    }

    def parseObservation_Sortie_Eligibility_SupervisorEngine1Condition_Payload(): Observation_Sortie_Eligibility_Supervisor.Engine1Condition_Payload = {
      val r = parseObservation_Sortie_Eligibility_SupervisorEngine1Condition_PayloadT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorEngine1Condition_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.Engine1Condition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.Engine1Condition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseObservation_Sortie_Eligibility_SupervisorEngine1ConditionType()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.Engine1Condition_Payload(value)
    }

    def parseObservation_Sortie_Eligibility_SupervisorEngine2ConditionType(): Observation_Sortie_Eligibility_Supervisor.Engine2Condition.Type = {
      val r = parseObservation_Sortie_Eligibility_SupervisorEngine2ConditionT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorEngine2ConditionT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.Engine2Condition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.Engine2Condition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Observation_Sortie_Eligibility_Supervisor.Engine2Condition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Observation_Sortie_Eligibility_Supervisor.Engine2Condition.")
          return Observation_Sortie_Eligibility_Supervisor.Engine2Condition.byOrdinal(0).get
      }
    }

    def parseObservation_Sortie_Eligibility_SupervisorEngine2Condition_Payload(): Observation_Sortie_Eligibility_Supervisor.Engine2Condition_Payload = {
      val r = parseObservation_Sortie_Eligibility_SupervisorEngine2Condition_PayloadT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorEngine2Condition_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.Engine2Condition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.Engine2Condition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseObservation_Sortie_Eligibility_SupervisorEngine2ConditionType()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.Engine2Condition_Payload(value)
    }

    def parseObservation_Sortie_Eligibility_SupervisorEngine3ConditionType(): Observation_Sortie_Eligibility_Supervisor.Engine3Condition.Type = {
      val r = parseObservation_Sortie_Eligibility_SupervisorEngine3ConditionT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorEngine3ConditionT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.Engine3Condition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.Engine3Condition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Observation_Sortie_Eligibility_Supervisor.Engine3Condition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Observation_Sortie_Eligibility_Supervisor.Engine3Condition.")
          return Observation_Sortie_Eligibility_Supervisor.Engine3Condition.byOrdinal(0).get
      }
    }

    def parseObservation_Sortie_Eligibility_SupervisorEngine3Condition_Payload(): Observation_Sortie_Eligibility_Supervisor.Engine3Condition_Payload = {
      val r = parseObservation_Sortie_Eligibility_SupervisorEngine3Condition_PayloadT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorEngine3Condition_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.Engine3Condition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.Engine3Condition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseObservation_Sortie_Eligibility_SupervisorEngine3ConditionType()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.Engine3Condition_Payload(value)
    }

    def parseObservation_Sortie_Eligibility_SupervisorEngine4ConditionType(): Observation_Sortie_Eligibility_Supervisor.Engine4Condition.Type = {
      val r = parseObservation_Sortie_Eligibility_SupervisorEngine4ConditionT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorEngine4ConditionT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.Engine4Condition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.Engine4Condition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Observation_Sortie_Eligibility_Supervisor.Engine4Condition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Observation_Sortie_Eligibility_Supervisor.Engine4Condition.")
          return Observation_Sortie_Eligibility_Supervisor.Engine4Condition.byOrdinal(0).get
      }
    }

    def parseObservation_Sortie_Eligibility_SupervisorEngine4Condition_Payload(): Observation_Sortie_Eligibility_Supervisor.Engine4Condition_Payload = {
      val r = parseObservation_Sortie_Eligibility_SupervisorEngine4Condition_PayloadT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorEngine4Condition_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.Engine4Condition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.Engine4Condition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseObservation_Sortie_Eligibility_SupervisorEngine4ConditionType()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.Engine4Condition_Payload(value)
    }

    def parseObservation_Sortie_Eligibility_SupervisorConfirmationType(): Observation_Sortie_Eligibility_Supervisor.Confirmation.Type = {
      val r = parseObservation_Sortie_Eligibility_SupervisorConfirmationT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorConfirmationT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.Confirmation.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.Confirmation")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Observation_Sortie_Eligibility_Supervisor.Confirmation.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Observation_Sortie_Eligibility_Supervisor.Confirmation.")
          return Observation_Sortie_Eligibility_Supervisor.Confirmation.byOrdinal(0).get
      }
    }

    def parseObservation_Sortie_Eligibility_SupervisorConfirmation_Payload(): Observation_Sortie_Eligibility_Supervisor.Confirmation_Payload = {
      val r = parseObservation_Sortie_Eligibility_SupervisorConfirmation_PayloadT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorConfirmation_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.Confirmation_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.Confirmation_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseObservation_Sortie_Eligibility_SupervisorConfirmationType()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.Confirmation_Payload(value)
    }

    def parseObservation_Sortie_Eligibility_SupervisorPropulsionCauseType(): Observation_Sortie_Eligibility_Supervisor.PropulsionCause.Type = {
      val r = parseObservation_Sortie_Eligibility_SupervisorPropulsionCauseT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorPropulsionCauseT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.PropulsionCause.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.PropulsionCause")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Observation_Sortie_Eligibility_Supervisor.PropulsionCause.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Observation_Sortie_Eligibility_Supervisor.PropulsionCause.")
          return Observation_Sortie_Eligibility_Supervisor.PropulsionCause.byOrdinal(0).get
      }
    }

    def parseObservation_Sortie_Eligibility_SupervisorPropulsionCause_Payload(): Observation_Sortie_Eligibility_Supervisor.PropulsionCause_Payload = {
      val r = parseObservation_Sortie_Eligibility_SupervisorPropulsionCause_PayloadT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorPropulsionCause_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.PropulsionCause_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.PropulsionCause_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseObservation_Sortie_Eligibility_SupervisorPropulsionCauseType()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.PropulsionCause_Payload(value)
    }

    def parseObservation_Sortie_Eligibility_SupervisorOperatorEventType(): Observation_Sortie_Eligibility_Supervisor.OperatorEvent.Type = {
      val r = parseObservation_Sortie_Eligibility_SupervisorOperatorEventT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorOperatorEventT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.OperatorEvent.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.OperatorEvent")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Observation_Sortie_Eligibility_Supervisor.OperatorEvent.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Observation_Sortie_Eligibility_Supervisor.OperatorEvent.")
          return Observation_Sortie_Eligibility_Supervisor.OperatorEvent.byOrdinal(0).get
      }
    }

    def parseObservation_Sortie_Eligibility_SupervisorOperatorEvent_Payload(): Observation_Sortie_Eligibility_Supervisor.OperatorEvent_Payload = {
      val r = parseObservation_Sortie_Eligibility_SupervisorOperatorEvent_PayloadT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorOperatorEvent_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.OperatorEvent_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.OperatorEvent_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseObservation_Sortie_Eligibility_SupervisorOperatorEventType()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.OperatorEvent_Payload(value)
    }

    def parseObservation_Sortie_Eligibility_SupervisorPriorityDirectiveType(): Observation_Sortie_Eligibility_Supervisor.PriorityDirective.Type = {
      val r = parseObservation_Sortie_Eligibility_SupervisorPriorityDirectiveT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorPriorityDirectiveT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.PriorityDirective.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.PriorityDirective")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Observation_Sortie_Eligibility_Supervisor.PriorityDirective.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Observation_Sortie_Eligibility_Supervisor.PriorityDirective.")
          return Observation_Sortie_Eligibility_Supervisor.PriorityDirective.byOrdinal(0).get
      }
    }

    def parseObservation_Sortie_Eligibility_SupervisorPriorityDirective_Payload(): Observation_Sortie_Eligibility_Supervisor.PriorityDirective_Payload = {
      val r = parseObservation_Sortie_Eligibility_SupervisorPriorityDirective_PayloadT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorPriorityDirective_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.PriorityDirective_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.PriorityDirective_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseObservation_Sortie_Eligibility_SupervisorPriorityDirectiveType()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.PriorityDirective_Payload(value)
    }

    def parseObservation_Sortie_Eligibility_SupervisorReleaseFeedbackType(): Observation_Sortie_Eligibility_Supervisor.ReleaseFeedback.Type = {
      val r = parseObservation_Sortie_Eligibility_SupervisorReleaseFeedbackT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorReleaseFeedbackT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.ReleaseFeedback.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.ReleaseFeedback")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Observation_Sortie_Eligibility_Supervisor.ReleaseFeedback.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Observation_Sortie_Eligibility_Supervisor.ReleaseFeedback.")
          return Observation_Sortie_Eligibility_Supervisor.ReleaseFeedback.byOrdinal(0).get
      }
    }

    def parseObservation_Sortie_Eligibility_SupervisorReleaseFeedback_Payload(): Observation_Sortie_Eligibility_Supervisor.ReleaseFeedback_Payload = {
      val r = parseObservation_Sortie_Eligibility_SupervisorReleaseFeedback_PayloadT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorReleaseFeedback_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.ReleaseFeedback_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.ReleaseFeedback_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseObservation_Sortie_Eligibility_SupervisorReleaseFeedbackType()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.ReleaseFeedback_Payload(value)
    }

    def parseObservation_Sortie_Eligibility_SupervisorRequestPhaseType(): Observation_Sortie_Eligibility_Supervisor.RequestPhase.Type = {
      val r = parseObservation_Sortie_Eligibility_SupervisorRequestPhaseT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorRequestPhaseT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.RequestPhase.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.RequestPhase")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Observation_Sortie_Eligibility_Supervisor.RequestPhase.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Observation_Sortie_Eligibility_Supervisor.RequestPhase.")
          return Observation_Sortie_Eligibility_Supervisor.RequestPhase.byOrdinal(0).get
      }
    }

    def parseObservation_Sortie_Eligibility_SupervisorRequestPhase_Payload(): Observation_Sortie_Eligibility_Supervisor.RequestPhase_Payload = {
      val r = parseObservation_Sortie_Eligibility_SupervisorRequestPhase_PayloadT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorRequestPhase_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.RequestPhase_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.RequestPhase_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseObservation_Sortie_Eligibility_SupervisorRequestPhaseType()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.RequestPhase_Payload(value)
    }

    def parseObservation_Sortie_Eligibility_SupervisorFaultStateType(): Observation_Sortie_Eligibility_Supervisor.FaultState.Type = {
      val r = parseObservation_Sortie_Eligibility_SupervisorFaultStateT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorFaultStateT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.FaultState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.FaultState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Observation_Sortie_Eligibility_Supervisor.FaultState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Observation_Sortie_Eligibility_Supervisor.FaultState.")
          return Observation_Sortie_Eligibility_Supervisor.FaultState.byOrdinal(0).get
      }
    }

    def parseObservation_Sortie_Eligibility_SupervisorFaultState_Payload(): Observation_Sortie_Eligibility_Supervisor.FaultState_Payload = {
      val r = parseObservation_Sortie_Eligibility_SupervisorFaultState_PayloadT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorFaultState_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.FaultState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.FaultState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseObservation_Sortie_Eligibility_SupervisorFaultStateType()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.FaultState_Payload(value)
    }

    def parseObservation_Sortie_Eligibility_SupervisorEquipmentCauseType(): Observation_Sortie_Eligibility_Supervisor.EquipmentCause.Type = {
      val r = parseObservation_Sortie_Eligibility_SupervisorEquipmentCauseT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorEquipmentCauseT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.EquipmentCause.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.EquipmentCause")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Observation_Sortie_Eligibility_Supervisor.EquipmentCause.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Observation_Sortie_Eligibility_Supervisor.EquipmentCause.")
          return Observation_Sortie_Eligibility_Supervisor.EquipmentCause.byOrdinal(0).get
      }
    }

    def parseObservation_Sortie_Eligibility_SupervisorEquipmentCause_Payload(): Observation_Sortie_Eligibility_Supervisor.EquipmentCause_Payload = {
      val r = parseObservation_Sortie_Eligibility_SupervisorEquipmentCause_PayloadT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorEquipmentCause_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.EquipmentCause_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.EquipmentCause_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseObservation_Sortie_Eligibility_SupervisorEquipmentCauseType()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.EquipmentCause_Payload(value)
    }

    def parseObservation_Sortie_Eligibility_SupervisorRecoveryPhaseType(): Observation_Sortie_Eligibility_Supervisor.RecoveryPhase.Type = {
      val r = parseObservation_Sortie_Eligibility_SupervisorRecoveryPhaseT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorRecoveryPhaseT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.RecoveryPhase.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.RecoveryPhase")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Observation_Sortie_Eligibility_Supervisor.RecoveryPhase.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Observation_Sortie_Eligibility_Supervisor.RecoveryPhase.")
          return Observation_Sortie_Eligibility_Supervisor.RecoveryPhase.byOrdinal(0).get
      }
    }

    def parseObservation_Sortie_Eligibility_SupervisorRecoveryPhase_Payload(): Observation_Sortie_Eligibility_Supervisor.RecoveryPhase_Payload = {
      val r = parseObservation_Sortie_Eligibility_SupervisorRecoveryPhase_PayloadT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorRecoveryPhase_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.RecoveryPhase_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.RecoveryPhase_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseObservation_Sortie_Eligibility_SupervisorRecoveryPhaseType()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.RecoveryPhase_Payload(value)
    }

    def parseObservation_Sortie_Eligibility_SupervisorRecoveryGateType(): Observation_Sortie_Eligibility_Supervisor.RecoveryGate.Type = {
      val r = parseObservation_Sortie_Eligibility_SupervisorRecoveryGateT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorRecoveryGateT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.RecoveryGate.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.RecoveryGate")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Observation_Sortie_Eligibility_Supervisor.RecoveryGate.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Observation_Sortie_Eligibility_Supervisor.RecoveryGate.")
          return Observation_Sortie_Eligibility_Supervisor.RecoveryGate.byOrdinal(0).get
      }
    }

    def parseObservation_Sortie_Eligibility_SupervisorRecoveryGate_Payload(): Observation_Sortie_Eligibility_Supervisor.RecoveryGate_Payload = {
      val r = parseObservation_Sortie_Eligibility_SupervisorRecoveryGate_PayloadT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorRecoveryGate_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.RecoveryGate_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.RecoveryGate_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseObservation_Sortie_Eligibility_SupervisorRecoveryGateType()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.RecoveryGate_Payload(value)
    }

    def parseObservation_Sortie_Eligibility_SupervisorCarriedPriorityType(): Observation_Sortie_Eligibility_Supervisor.CarriedPriority.Type = {
      val r = parseObservation_Sortie_Eligibility_SupervisorCarriedPriorityT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorCarriedPriorityT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.CarriedPriority.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.CarriedPriority")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Observation_Sortie_Eligibility_Supervisor.CarriedPriority.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Observation_Sortie_Eligibility_Supervisor.CarriedPriority.")
          return Observation_Sortie_Eligibility_Supervisor.CarriedPriority.byOrdinal(0).get
      }
    }

    def parseObservation_Sortie_Eligibility_SupervisorCarriedPriority_Payload(): Observation_Sortie_Eligibility_Supervisor.CarriedPriority_Payload = {
      val r = parseObservation_Sortie_Eligibility_SupervisorCarriedPriority_PayloadT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorCarriedPriority_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.CarriedPriority_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.CarriedPriority_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseObservation_Sortie_Eligibility_SupervisorCarriedPriorityType()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.CarriedPriority_Payload(value)
    }

    def parseObservation_Sortie_Eligibility_SupervisorSortieDirectiveType(): Observation_Sortie_Eligibility_Supervisor.SortieDirective.Type = {
      val r = parseObservation_Sortie_Eligibility_SupervisorSortieDirectiveT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorSortieDirectiveT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.SortieDirective.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.SortieDirective")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Observation_Sortie_Eligibility_Supervisor.SortieDirective.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Observation_Sortie_Eligibility_Supervisor.SortieDirective.")
          return Observation_Sortie_Eligibility_Supervisor.SortieDirective.byOrdinal(0).get
      }
    }

    def parseObservation_Sortie_Eligibility_SupervisorSortieDirective_Payload(): Observation_Sortie_Eligibility_Supervisor.SortieDirective_Payload = {
      val r = parseObservation_Sortie_Eligibility_SupervisorSortieDirective_PayloadT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorSortieDirective_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.SortieDirective_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.SortieDirective_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseObservation_Sortie_Eligibility_SupervisorSortieDirectiveType()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.SortieDirective_Payload(value)
    }

    def parseObservation_Sortie_Eligibility_SupervisorEligibilityReasonType(): Observation_Sortie_Eligibility_Supervisor.EligibilityReason.Type = {
      val r = parseObservation_Sortie_Eligibility_SupervisorEligibilityReasonT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorEligibilityReasonT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.EligibilityReason.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.EligibilityReason")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Observation_Sortie_Eligibility_Supervisor.EligibilityReason.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Observation_Sortie_Eligibility_Supervisor.EligibilityReason.")
          return Observation_Sortie_Eligibility_Supervisor.EligibilityReason.byOrdinal(0).get
      }
    }

    def parseObservation_Sortie_Eligibility_SupervisorEligibilityReason_Payload(): Observation_Sortie_Eligibility_Supervisor.EligibilityReason_Payload = {
      val r = parseObservation_Sortie_Eligibility_SupervisorEligibilityReason_PayloadT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorEligibilityReason_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.EligibilityReason_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.EligibilityReason_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseObservation_Sortie_Eligibility_SupervisorEligibilityReasonType()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.EligibilityReason_Payload(value)
    }

    def parseObservation_Sortie_Eligibility_SupervisorStatusRequestPhaseType(): Observation_Sortie_Eligibility_Supervisor.StatusRequestPhase.Type = {
      val r = parseObservation_Sortie_Eligibility_SupervisorStatusRequestPhaseT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorStatusRequestPhaseT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.StatusRequestPhase.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.StatusRequestPhase")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Observation_Sortie_Eligibility_Supervisor.StatusRequestPhase.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Observation_Sortie_Eligibility_Supervisor.StatusRequestPhase.")
          return Observation_Sortie_Eligibility_Supervisor.StatusRequestPhase.byOrdinal(0).get
      }
    }

    def parseObservation_Sortie_Eligibility_SupervisorStatusRequestPhase_Payload(): Observation_Sortie_Eligibility_Supervisor.StatusRequestPhase_Payload = {
      val r = parseObservation_Sortie_Eligibility_SupervisorStatusRequestPhase_PayloadT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorStatusRequestPhase_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.StatusRequestPhase_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.StatusRequestPhase_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseObservation_Sortie_Eligibility_SupervisorStatusRequestPhaseType()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.StatusRequestPhase_Payload(value)
    }

    def parseObservation_Sortie_Eligibility_SupervisorStatusFaultStateType(): Observation_Sortie_Eligibility_Supervisor.StatusFaultState.Type = {
      val r = parseObservation_Sortie_Eligibility_SupervisorStatusFaultStateT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorStatusFaultStateT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.StatusFaultState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.StatusFaultState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Observation_Sortie_Eligibility_Supervisor.StatusFaultState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Observation_Sortie_Eligibility_Supervisor.StatusFaultState.")
          return Observation_Sortie_Eligibility_Supervisor.StatusFaultState.byOrdinal(0).get
      }
    }

    def parseObservation_Sortie_Eligibility_SupervisorStatusFaultState_Payload(): Observation_Sortie_Eligibility_Supervisor.StatusFaultState_Payload = {
      val r = parseObservation_Sortie_Eligibility_SupervisorStatusFaultState_PayloadT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorStatusFaultState_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.StatusFaultState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.StatusFaultState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseObservation_Sortie_Eligibility_SupervisorStatusFaultStateType()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.StatusFaultState_Payload(value)
    }

    def parseObservation_Sortie_Eligibility_SupervisorStatusRecoveryPhaseType(): Observation_Sortie_Eligibility_Supervisor.StatusRecoveryPhase.Type = {
      val r = parseObservation_Sortie_Eligibility_SupervisorStatusRecoveryPhaseT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorStatusRecoveryPhaseT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.StatusRecoveryPhase.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.StatusRecoveryPhase")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Observation_Sortie_Eligibility_Supervisor.StatusRecoveryPhase.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Observation_Sortie_Eligibility_Supervisor.StatusRecoveryPhase.")
          return Observation_Sortie_Eligibility_Supervisor.StatusRecoveryPhase.byOrdinal(0).get
      }
    }

    def parseObservation_Sortie_Eligibility_SupervisorStatusRecoveryPhase_Payload(): Observation_Sortie_Eligibility_Supervisor.StatusRecoveryPhase_Payload = {
      val r = parseObservation_Sortie_Eligibility_SupervisorStatusRecoveryPhase_PayloadT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorStatusRecoveryPhase_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.StatusRecoveryPhase_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.StatusRecoveryPhase_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseObservation_Sortie_Eligibility_SupervisorStatusRecoveryPhaseType()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.StatusRecoveryPhase_Payload(value)
    }

    def parseObservation_Sortie_Eligibility_SupervisorStatusDecisionType(): Observation_Sortie_Eligibility_Supervisor.StatusDecision.Type = {
      val r = parseObservation_Sortie_Eligibility_SupervisorStatusDecisionT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorStatusDecisionT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.StatusDecision.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.StatusDecision")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Observation_Sortie_Eligibility_Supervisor.StatusDecision.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Observation_Sortie_Eligibility_Supervisor.StatusDecision.")
          return Observation_Sortie_Eligibility_Supervisor.StatusDecision.byOrdinal(0).get
      }
    }

    def parseObservation_Sortie_Eligibility_SupervisorStatusDecision_Payload(): Observation_Sortie_Eligibility_Supervisor.StatusDecision_Payload = {
      val r = parseObservation_Sortie_Eligibility_SupervisorStatusDecision_PayloadT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorStatusDecision_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.StatusDecision_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.StatusDecision_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseObservation_Sortie_Eligibility_SupervisorStatusDecisionType()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.StatusDecision_Payload(value)
    }

    def parseObservation_Sortie_Eligibility_SupervisorLimitingCauseType(): Observation_Sortie_Eligibility_Supervisor.LimitingCause.Type = {
      val r = parseObservation_Sortie_Eligibility_SupervisorLimitingCauseT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorLimitingCauseT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.LimitingCause.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.LimitingCause")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Observation_Sortie_Eligibility_Supervisor.LimitingCause.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Observation_Sortie_Eligibility_Supervisor.LimitingCause.")
          return Observation_Sortie_Eligibility_Supervisor.LimitingCause.byOrdinal(0).get
      }
    }

    def parseObservation_Sortie_Eligibility_SupervisorLimitingCause_Payload(): Observation_Sortie_Eligibility_Supervisor.LimitingCause_Payload = {
      val r = parseObservation_Sortie_Eligibility_SupervisorLimitingCause_PayloadT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorLimitingCause_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.LimitingCause_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.LimitingCause_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseObservation_Sortie_Eligibility_SupervisorLimitingCauseType()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.LimitingCause_Payload(value)
    }

    def parseObservation_Sortie_Eligibility_SupervisorEnergyEvidence(): Observation_Sortie_Eligibility_Supervisor.EnergyEvidence = {
      val r = parseObservation_Sortie_Eligibility_SupervisorEnergyEvidenceT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorEnergyEvidenceT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.EnergyEvidence = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.EnergyEvidence")
      }
      parser.parseObjectKey("quality")
      val quality = parseObservation_Sortie_Eligibility_SupervisorEnergyQualityType()
      parser.parseObjectNext()
      parser.parseObjectKey("validity")
      val validity = parseObservation_Sortie_Eligibility_SupervisorValidityType()
      parser.parseObjectNext()
      parser.parseObjectKey("freshness")
      val freshness = parseObservation_Sortie_Eligibility_SupervisorFreshnessType()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.EnergyEvidence(quality, validity, freshness)
    }

    def parseObservation_Sortie_Eligibility_SupervisorEnergyEvidence_Payload(): Observation_Sortie_Eligibility_Supervisor.EnergyEvidence_Payload = {
      val r = parseObservation_Sortie_Eligibility_SupervisorEnergyEvidence_PayloadT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorEnergyEvidence_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.EnergyEvidence_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.EnergyEvidence_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseObservation_Sortie_Eligibility_SupervisorEnergyEvidence()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.EnergyEvidence_Payload(value)
    }

    def parseObservation_Sortie_Eligibility_SupervisorEnergyAssessment(): Observation_Sortie_Eligibility_Supervisor.EnergyAssessment = {
      val r = parseObservation_Sortie_Eligibility_SupervisorEnergyAssessmentT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorEnergyAssessmentT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.EnergyAssessment = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.EnergyAssessment")
      }
      parser.parseObjectKey("ready")
      val ready = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("localCause")
      val localCause = parseObservation_Sortie_Eligibility_SupervisorEnergyCauseType()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.EnergyAssessment(ready, localCause)
    }

    def parseObservation_Sortie_Eligibility_SupervisorEnergyAssessment_Payload(): Observation_Sortie_Eligibility_Supervisor.EnergyAssessment_Payload = {
      val r = parseObservation_Sortie_Eligibility_SupervisorEnergyAssessment_PayloadT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorEnergyAssessment_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.EnergyAssessment_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.EnergyAssessment_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseObservation_Sortie_Eligibility_SupervisorEnergyAssessment()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.EnergyAssessment_Payload(value)
    }

    def parseObservation_Sortie_Eligibility_SupervisorNavigationEvidenceRecord(): Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceRecord = {
      val r = parseObservation_Sortie_Eligibility_SupervisorNavigationEvidenceRecordT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorNavigationEvidenceRecordT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceRecord = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceRecord")
      }
      parser.parseObjectKey("gpsCondition")
      val gpsCondition = parseObservation_Sortie_Eligibility_SupervisorGpsConditionType()
      parser.parseObjectNext()
      parser.parseObjectKey("inertial")
      val inertial = parseObservation_Sortie_Eligibility_SupervisorInertialConditionType()
      parser.parseObjectNext()
      parser.parseObjectKey("barometric")
      val barometric = parseObservation_Sortie_Eligibility_SupervisorBarometricConditionType()
      parser.parseObjectNext()
      parser.parseObjectKey("validity")
      val validity = parseObservation_Sortie_Eligibility_SupervisorValidityType()
      parser.parseObjectNext()
      parser.parseObjectKey("freshness")
      val freshness = parseObservation_Sortie_Eligibility_SupervisorFreshnessType()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceRecord(gpsCondition, inertial, barometric, validity, freshness)
    }

    def parseObservation_Sortie_Eligibility_SupervisorNavigationEvidenceRecord_Payload(): Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceRecord_Payload = {
      val r = parseObservation_Sortie_Eligibility_SupervisorNavigationEvidenceRecord_PayloadT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorNavigationEvidenceRecord_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceRecord_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceRecord_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseObservation_Sortie_Eligibility_SupervisorNavigationEvidenceRecord()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceRecord_Payload(value)
    }

    def parseObservation_Sortie_Eligibility_SupervisorNavigationAssessment(): Observation_Sortie_Eligibility_Supervisor.NavigationAssessment = {
      val r = parseObservation_Sortie_Eligibility_SupervisorNavigationAssessmentT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorNavigationAssessmentT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.NavigationAssessment = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.NavigationAssessment")
      }
      parser.parseObjectKey("ready")
      val ready = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("localCause")
      val localCause = parseObservation_Sortie_Eligibility_SupervisorNavigationCauseType()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.NavigationAssessment(ready, localCause)
    }

    def parseObservation_Sortie_Eligibility_SupervisorNavigationAssessment_Payload(): Observation_Sortie_Eligibility_Supervisor.NavigationAssessment_Payload = {
      val r = parseObservation_Sortie_Eligibility_SupervisorNavigationAssessment_PayloadT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorNavigationAssessment_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.NavigationAssessment_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.NavigationAssessment_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseObservation_Sortie_Eligibility_SupervisorNavigationAssessment()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.NavigationAssessment_Payload(value)
    }

    def parseObservation_Sortie_Eligibility_SupervisorEquipmentEvidence(): Observation_Sortie_Eligibility_Supervisor.EquipmentEvidence = {
      val r = parseObservation_Sortie_Eligibility_SupervisorEquipmentEvidenceT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorEquipmentEvidenceT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.EquipmentEvidence = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.EquipmentEvidence")
      }
      parser.parseObjectKey("condition")
      val condition = parseObservation_Sortie_Eligibility_SupervisorEquipmentConditionType()
      parser.parseObjectNext()
      parser.parseObjectKey("validity")
      val validity = parseObservation_Sortie_Eligibility_SupervisorValidityType()
      parser.parseObjectNext()
      parser.parseObjectKey("freshness")
      val freshness = parseObservation_Sortie_Eligibility_SupervisorFreshnessType()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.EquipmentEvidence(condition, validity, freshness)
    }

    def parseObservation_Sortie_Eligibility_SupervisorEquipmentEvidence_Payload(): Observation_Sortie_Eligibility_Supervisor.EquipmentEvidence_Payload = {
      val r = parseObservation_Sortie_Eligibility_SupervisorEquipmentEvidence_PayloadT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorEquipmentEvidence_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.EquipmentEvidence_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.EquipmentEvidence_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseObservation_Sortie_Eligibility_SupervisorEquipmentEvidence()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.EquipmentEvidence_Payload(value)
    }

    def parseObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment(): Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment = {
      val r = parseObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessmentT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessmentT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment")
      }
      parser.parseObjectKey("ready")
      val ready = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("localCause")
      val localCause = parseObservation_Sortie_Eligibility_SupervisorSingleEquipmentCauseType()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment(ready, localCause)
    }

    def parseObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment_Payload(): Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment_Payload = {
      val r = parseObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment_PayloadT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment_Payload(value)
    }

    def parseObservation_Sortie_Eligibility_SupervisorPropulsionEvidence(): Observation_Sortie_Eligibility_Supervisor.PropulsionEvidence = {
      val r = parseObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.PropulsionEvidence = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.PropulsionEvidence")
      }
      parser.parseObjectKey("engine1")
      val engine1 = parseObservation_Sortie_Eligibility_SupervisorEngine1ConditionType()
      parser.parseObjectNext()
      parser.parseObjectKey("engine2")
      val engine2 = parseObservation_Sortie_Eligibility_SupervisorEngine2ConditionType()
      parser.parseObjectNext()
      parser.parseObjectKey("engine3")
      val engine3 = parseObservation_Sortie_Eligibility_SupervisorEngine3ConditionType()
      parser.parseObjectNext()
      parser.parseObjectKey("engine4")
      val engine4 = parseObservation_Sortie_Eligibility_SupervisorEngine4ConditionType()
      parser.parseObjectNext()
      parser.parseObjectKey("validity")
      val validity = parseObservation_Sortie_Eligibility_SupervisorValidityType()
      parser.parseObjectNext()
      parser.parseObjectKey("freshness")
      val freshness = parseObservation_Sortie_Eligibility_SupervisorFreshnessType()
      parser.parseObjectNext()
      parser.parseObjectKey("alternatingKindsConfirmed")
      val alternatingKindsConfirmed = parseObservation_Sortie_Eligibility_SupervisorConfirmationType()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.PropulsionEvidence(engine1, engine2, engine3, engine4, validity, freshness, alternatingKindsConfirmed)
    }

    def parseObservation_Sortie_Eligibility_SupervisorPropulsionEvidence_Payload(): Observation_Sortie_Eligibility_Supervisor.PropulsionEvidence_Payload = {
      val r = parseObservation_Sortie_Eligibility_SupervisorPropulsionEvidence_PayloadT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorPropulsionEvidence_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.PropulsionEvidence_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.PropulsionEvidence_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseObservation_Sortie_Eligibility_SupervisorPropulsionEvidence()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.PropulsionEvidence_Payload(value)
    }

    def parseObservation_Sortie_Eligibility_SupervisorPropulsionAssessment(): Observation_Sortie_Eligibility_Supervisor.PropulsionAssessment = {
      val r = parseObservation_Sortie_Eligibility_SupervisorPropulsionAssessmentT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorPropulsionAssessmentT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.PropulsionAssessment = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.PropulsionAssessment")
      }
      parser.parseObjectKey("ready")
      val ready = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("localCause")
      val localCause = parseObservation_Sortie_Eligibility_SupervisorPropulsionCauseType()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.PropulsionAssessment(ready, localCause)
    }

    def parseObservation_Sortie_Eligibility_SupervisorPropulsionAssessment_Payload(): Observation_Sortie_Eligibility_Supervisor.PropulsionAssessment_Payload = {
      val r = parseObservation_Sortie_Eligibility_SupervisorPropulsionAssessment_PayloadT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorPropulsionAssessment_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.PropulsionAssessment_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.PropulsionAssessment_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseObservation_Sortie_Eligibility_SupervisorPropulsionAssessment()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.PropulsionAssessment_Payload(value)
    }

    def parseObservation_Sortie_Eligibility_SupervisorFaultSummary(): Observation_Sortie_Eligibility_Supervisor.FaultSummary = {
      val r = parseObservation_Sortie_Eligibility_SupervisorFaultSummaryT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorFaultSummaryT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.FaultSummary = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.FaultSummary")
      }
      parser.parseObjectKey("faultState")
      val faultState = parseObservation_Sortie_Eligibility_SupervisorFaultStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("primaryCause")
      val primaryCause = parseObservation_Sortie_Eligibility_SupervisorEquipmentCauseType()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.FaultSummary(faultState, primaryCause)
    }

    def parseObservation_Sortie_Eligibility_SupervisorFaultSummary_Payload(): Observation_Sortie_Eligibility_Supervisor.FaultSummary_Payload = {
      val r = parseObservation_Sortie_Eligibility_SupervisorFaultSummary_PayloadT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorFaultSummary_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.FaultSummary_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.FaultSummary_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseObservation_Sortie_Eligibility_SupervisorFaultSummary()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.FaultSummary_Payload(value)
    }

    def parseObservation_Sortie_Eligibility_SupervisorRecoveryFacts(): Observation_Sortie_Eligibility_Supervisor.RecoveryFacts = {
      val r = parseObservation_Sortie_Eligibility_SupervisorRecoveryFactsT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorRecoveryFactsT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.RecoveryFacts = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.RecoveryFacts")
      }
      parser.parseObjectKey("phase")
      val phase = parseObservation_Sortie_Eligibility_SupervisorRecoveryPhaseType()
      parser.parseObjectNext()
      parser.parseObjectKey("gate")
      val gate = parseObservation_Sortie_Eligibility_SupervisorRecoveryGateType()
      parser.parseObjectNext()
      parser.parseObjectKey("carriedPriority")
      val carriedPriority = parseObservation_Sortie_Eligibility_SupervisorCarriedPriorityType()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.RecoveryFacts(phase, gate, carriedPriority)
    }

    def parseObservation_Sortie_Eligibility_SupervisorRecoveryFacts_Payload(): Observation_Sortie_Eligibility_Supervisor.RecoveryFacts_Payload = {
      val r = parseObservation_Sortie_Eligibility_SupervisorRecoveryFacts_PayloadT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorRecoveryFacts_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.RecoveryFacts_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.RecoveryFacts_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseObservation_Sortie_Eligibility_SupervisorRecoveryFacts()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.RecoveryFacts_Payload(value)
    }

    def parseObservation_Sortie_Eligibility_SupervisorEligibilityDecision(): Observation_Sortie_Eligibility_Supervisor.EligibilityDecision = {
      val r = parseObservation_Sortie_Eligibility_SupervisorEligibilityDecisionT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorEligibilityDecisionT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.EligibilityDecision = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.EligibilityDecision")
      }
      parser.parseObjectKey("directive")
      val directive = parseObservation_Sortie_Eligibility_SupervisorSortieDirectiveType()
      parser.parseObjectNext()
      parser.parseObjectKey("reason")
      val reason = parseObservation_Sortie_Eligibility_SupervisorEligibilityReasonType()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.EligibilityDecision(directive, reason)
    }

    def parseObservation_Sortie_Eligibility_SupervisorEligibilityDecision_Payload(): Observation_Sortie_Eligibility_Supervisor.EligibilityDecision_Payload = {
      val r = parseObservation_Sortie_Eligibility_SupervisorEligibilityDecision_PayloadT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorEligibilityDecision_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.EligibilityDecision_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.EligibilityDecision_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseObservation_Sortie_Eligibility_SupervisorEligibilityDecision()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.EligibilityDecision_Payload(value)
    }

    def parseObservation_Sortie_Eligibility_SupervisorEligibilityStatus(): Observation_Sortie_Eligibility_Supervisor.EligibilityStatus = {
      val r = parseObservation_Sortie_Eligibility_SupervisorEligibilityStatusT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorEligibilityStatusT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.EligibilityStatus = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.EligibilityStatus")
      }
      parser.parseObjectKey("requestPhase")
      val requestPhase = parseObservation_Sortie_Eligibility_SupervisorStatusRequestPhaseType()
      parser.parseObjectNext()
      parser.parseObjectKey("faultState")
      val faultState = parseObservation_Sortie_Eligibility_SupervisorStatusFaultStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("recoveryPhase")
      val recoveryPhase = parseObservation_Sortie_Eligibility_SupervisorStatusRecoveryPhaseType()
      parser.parseObjectNext()
      parser.parseObjectKey("decisionDirective")
      val decisionDirective = parseObservation_Sortie_Eligibility_SupervisorStatusDecisionType()
      parser.parseObjectNext()
      parser.parseObjectKey("limitingCause")
      val limitingCause = parseObservation_Sortie_Eligibility_SupervisorLimitingCauseType()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.EligibilityStatus(requestPhase, faultState, recoveryPhase, decisionDirective, limitingCause)
    }

    def parseObservation_Sortie_Eligibility_SupervisorEligibilityStatus_Payload(): Observation_Sortie_Eligibility_Supervisor.EligibilityStatus_Payload = {
      val r = parseObservation_Sortie_Eligibility_SupervisorEligibilityStatus_PayloadT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorEligibilityStatus_PayloadT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.EligibilityStatus_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.EligibilityStatus_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseObservation_Sortie_Eligibility_SupervisorEligibilityStatus()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.EligibilityStatus_Payload(value)
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

    def parseObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container(): Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_P", "Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PS"))
      t.native match {
        case "Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_P" => val r = parseObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PS" => val r = parseObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PST(T); return r
        case _ => val r = parseObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PST(T); return r
      }
    }

    def parseObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_P(): Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_P = {
      val r = parseObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_P")
      }
      parser.parseObjectKey("api_energy_evidence")
      val api_energy_evidence = parseObservation_Sortie_Eligibility_SupervisorEnergyEvidence()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_P(api_energy_evidence)
    }

    def parseObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PS(): Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PS = {
      val r = parseObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PST(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PST(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PS")
      }
      parser.parseObjectKey("api_energy_evidence")
      val api_energy_evidence = parseObservation_Sortie_Eligibility_SupervisorEnergyEvidence()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PS(api_energy_evidence)
    }

    def parseObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container(): Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_P", "Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PS"))
      t.native match {
        case "Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_P" => val r = parseObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PS" => val r = parseObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PST(T); return r
        case _ => val r = parseObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PST(T); return r
      }
    }

    def parseObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_P(): Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_P = {
      val r = parseObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_P")
      }
      parser.parseObjectKey("api_energy_assessment")
      val api_energy_assessment = parseObservation_Sortie_Eligibility_SupervisorEnergyAssessment()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_P(api_energy_assessment)
    }

    def parseObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PS(): Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PS = {
      val r = parseObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PST(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PST(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PS")
      }
      parser.parseObjectKey("api_energy_assessment")
      val api_energy_assessment = parseObservation_Sortie_Eligibility_SupervisorEnergyAssessment()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PS(api_energy_assessment)
    }

    def parseObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container(): Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_P", "Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PS"))
      t.native match {
        case "Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_P" => val r = parseObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PS" => val r = parseObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PST(T); return r
        case _ => val r = parseObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PST(T); return r
      }
    }

    def parseObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_P(): Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_P = {
      val r = parseObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_P")
      }
      parser.parseObjectKey("api_navigation_evidence")
      val api_navigation_evidence = parseObservation_Sortie_Eligibility_SupervisorNavigationEvidenceRecord()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_P(api_navigation_evidence)
    }

    def parseObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PS(): Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PS = {
      val r = parseObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PST(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PST(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PS")
      }
      parser.parseObjectKey("api_navigation_evidence")
      val api_navigation_evidence = parseObservation_Sortie_Eligibility_SupervisorNavigationEvidenceRecord()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PS(api_navigation_evidence)
    }

    def parseObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container(): Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_P", "Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PS"))
      t.native match {
        case "Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_P" => val r = parseObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PS" => val r = parseObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PST(T); return r
        case _ => val r = parseObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PST(T); return r
      }
    }

    def parseObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_P(): Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_P = {
      val r = parseObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_P")
      }
      parser.parseObjectKey("api_navigation_assessment")
      val api_navigation_assessment = parseObservation_Sortie_Eligibility_SupervisorNavigationAssessment()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_P(api_navigation_assessment)
    }

    def parseObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PS(): Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PS = {
      val r = parseObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PST(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PST(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PS")
      }
      parser.parseObjectKey("api_navigation_assessment")
      val api_navigation_assessment = parseObservation_Sortie_Eligibility_SupervisorNavigationAssessment()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PS(api_navigation_assessment)
    }

    def parseObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container(): Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_P", "Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PS"))
      t.native match {
        case "Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_P" => val r = parseObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PS" => val r = parseObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PST(T); return r
        case _ => val r = parseObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PST(T); return r
      }
    }

    def parseObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_P(): Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_P = {
      val r = parseObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_P")
      }
      parser.parseObjectKey("api_communication_evidence")
      val api_communication_evidence = parseObservation_Sortie_Eligibility_SupervisorEquipmentEvidence()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_P(api_communication_evidence)
    }

    def parseObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PS(): Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PS = {
      val r = parseObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PST(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PST(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PS")
      }
      parser.parseObjectKey("api_communication_evidence")
      val api_communication_evidence = parseObservation_Sortie_Eligibility_SupervisorEquipmentEvidence()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PS(api_communication_evidence)
    }

    def parseObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container(): Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_P", "Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PS"))
      t.native match {
        case "Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_P" => val r = parseObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PS" => val r = parseObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PST(T); return r
        case _ => val r = parseObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PST(T); return r
      }
    }

    def parseObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_P(): Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_P = {
      val r = parseObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_P")
      }
      parser.parseObjectKey("api_communication_assessment")
      val api_communication_assessment = parseObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_P(api_communication_assessment)
    }

    def parseObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PS(): Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PS = {
      val r = parseObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PST(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PST(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PS")
      }
      parser.parseObjectKey("api_communication_assessment")
      val api_communication_assessment = parseObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PS(api_communication_assessment)
    }

    def parseObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container(): Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_P", "Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PS"))
      t.native match {
        case "Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_P" => val r = parseObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PS" => val r = parseObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PST(T); return r
        case _ => val r = parseObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PST(T); return r
      }
    }

    def parseObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_P(): Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_P = {
      val r = parseObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_P")
      }
      parser.parseObjectKey("api_observation_evidence")
      val api_observation_evidence = parseObservation_Sortie_Eligibility_SupervisorEquipmentEvidence()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_P(api_observation_evidence)
    }

    def parseObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PS(): Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PS = {
      val r = parseObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PST(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PST(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PS")
      }
      parser.parseObjectKey("api_observation_evidence")
      val api_observation_evidence = parseObservation_Sortie_Eligibility_SupervisorEquipmentEvidence()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PS(api_observation_evidence)
    }

    def parseObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container(): Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_P", "Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PS"))
      t.native match {
        case "Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_P" => val r = parseObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PS" => val r = parseObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PST(T); return r
        case _ => val r = parseObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PST(T); return r
      }
    }

    def parseObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_P(): Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_P = {
      val r = parseObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_P")
      }
      parser.parseObjectKey("api_observation_assessment")
      val api_observation_assessment = parseObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_P(api_observation_assessment)
    }

    def parseObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PS(): Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PS = {
      val r = parseObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PST(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PST(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PS")
      }
      parser.parseObjectKey("api_observation_assessment")
      val api_observation_assessment = parseObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PS(api_observation_assessment)
    }

    def parseObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container(): Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_P", "Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PS"))
      t.native match {
        case "Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_P" => val r = parseObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PS" => val r = parseObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PST(T); return r
        case _ => val r = parseObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PST(T); return r
      }
    }

    def parseObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_P(): Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_P = {
      val r = parseObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_P")
      }
      parser.parseObjectKey("api_obstacle_evidence")
      val api_obstacle_evidence = parseObservation_Sortie_Eligibility_SupervisorEquipmentEvidence()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_P(api_obstacle_evidence)
    }

    def parseObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PS(): Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PS = {
      val r = parseObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PST(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PST(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PS")
      }
      parser.parseObjectKey("api_obstacle_evidence")
      val api_obstacle_evidence = parseObservation_Sortie_Eligibility_SupervisorEquipmentEvidence()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PS(api_obstacle_evidence)
    }

    def parseObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container(): Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_P", "Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PS"))
      t.native match {
        case "Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_P" => val r = parseObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PS" => val r = parseObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PST(T); return r
        case _ => val r = parseObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PST(T); return r
      }
    }

    def parseObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_P(): Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_P = {
      val r = parseObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_P")
      }
      parser.parseObjectKey("api_obstacle_assessment")
      val api_obstacle_assessment = parseObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_P(api_obstacle_assessment)
    }

    def parseObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PS(): Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PS = {
      val r = parseObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PST(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PST(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PS")
      }
      parser.parseObjectKey("api_obstacle_assessment")
      val api_obstacle_assessment = parseObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PS(api_obstacle_assessment)
    }

    def parseObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container(): Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_P", "Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PS"))
      t.native match {
        case "Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_P" => val r = parseObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PS" => val r = parseObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PST(T); return r
        case _ => val r = parseObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PST(T); return r
      }
    }

    def parseObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_P(): Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_P = {
      val r = parseObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_P")
      }
      parser.parseObjectKey("api_propulsion_evidence")
      val api_propulsion_evidence = parseObservation_Sortie_Eligibility_SupervisorPropulsionEvidence()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_P(api_propulsion_evidence)
    }

    def parseObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PS(): Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PS = {
      val r = parseObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PST(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PST(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PS")
      }
      parser.parseObjectKey("api_propulsion_evidence")
      val api_propulsion_evidence = parseObservation_Sortie_Eligibility_SupervisorPropulsionEvidence()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PS(api_propulsion_evidence)
    }

    def parseObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container(): Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_P", "Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PS"))
      t.native match {
        case "Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_P" => val r = parseObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PS" => val r = parseObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PST(T); return r
        case _ => val r = parseObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PST(T); return r
      }
    }

    def parseObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_P(): Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_P = {
      val r = parseObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_P")
      }
      parser.parseObjectKey("api_propulsion_assessment")
      val api_propulsion_assessment = parseObservation_Sortie_Eligibility_SupervisorPropulsionAssessment()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_P(api_propulsion_assessment)
    }

    def parseObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PS(): Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PS = {
      val r = parseObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PST(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PST(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PS")
      }
      parser.parseObjectKey("api_propulsion_assessment")
      val api_propulsion_assessment = parseObservation_Sortie_Eligibility_SupervisorPropulsionAssessment()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PS(api_propulsion_assessment)
    }

    def parseObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container(): Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_P", "Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PS"))
      t.native match {
        case "Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_P" => val r = parseObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PS" => val r = parseObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PST(T); return r
        case _ => val r = parseObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PST(T); return r
      }
    }

    def parseObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_P(): Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_P = {
      val r = parseObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_P")
      }
      parser.parseObjectKey("api_accepted_directive")
      val api_accepted_directive = parseObservation_Sortie_Eligibility_SupervisorPriorityDirectiveType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_operator_event")
      val api_operator_event = parseObservation_Sortie_Eligibility_SupervisorOperatorEventType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_release_feedback")
      val api_release_feedback = parseObservation_Sortie_Eligibility_SupervisorReleaseFeedbackType()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_P(api_accepted_directive, api_operator_event, api_release_feedback)
    }

    def parseObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PS(): Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PS = {
      val r = parseObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PST(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PST(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_accepted_directive")
      val api_accepted_directive = parseObservation_Sortie_Eligibility_SupervisorPriorityDirectiveType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_operator_event")
      val api_operator_event = parseObservation_Sortie_Eligibility_SupervisorOperatorEventType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_release_feedback")
      val api_release_feedback = parseObservation_Sortie_Eligibility_SupervisorReleaseFeedbackType()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PS(api_accepted_directive, api_operator_event, api_release_feedback)
    }

    def parseObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container(): Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_P", "Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PS"))
      t.native match {
        case "Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_P" => val r = parseObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PS" => val r = parseObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PST(T); return r
        case _ => val r = parseObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PST(T); return r
      }
    }

    def parseObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_P(): Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_P = {
      val r = parseObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_P")
      }
      parser.parseObjectKey("api_candidate_event")
      val api_candidate_event = parseObservation_Sortie_Eligibility_SupervisorOperatorEventType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_request_phase")
      val api_request_phase = parseObservation_Sortie_Eligibility_SupervisorRequestPhaseType()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_P(api_candidate_event, api_request_phase)
    }

    def parseObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PS(): Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PS = {
      val r = parseObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PST(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PST(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_candidate_event")
      val api_candidate_event = parseObservation_Sortie_Eligibility_SupervisorOperatorEventType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_request_phase")
      val api_request_phase = parseObservation_Sortie_Eligibility_SupervisorRequestPhaseType()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PS(api_candidate_event, api_request_phase)
    }

    def parseObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container(): Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_P", "Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PS"))
      t.native match {
        case "Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_P" => val r = parseObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PS" => val r = parseObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PST(T); return r
        case _ => val r = parseObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PST(T); return r
      }
    }

    def parseObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_P(): Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_P = {
      val r = parseObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_P")
      }
      parser.parseObjectKey("api_communication_assessment")
      val api_communication_assessment = parseObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment()
      parser.parseObjectNext()
      parser.parseObjectKey("api_energy_assessment")
      val api_energy_assessment = parseObservation_Sortie_Eligibility_SupervisorEnergyAssessment()
      parser.parseObjectNext()
      parser.parseObjectKey("api_navigation_assessment")
      val api_navigation_assessment = parseObservation_Sortie_Eligibility_SupervisorNavigationAssessment()
      parser.parseObjectNext()
      parser.parseObjectKey("api_observation_assessment")
      val api_observation_assessment = parseObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment()
      parser.parseObjectNext()
      parser.parseObjectKey("api_obstacle_assessment")
      val api_obstacle_assessment = parseObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment()
      parser.parseObjectNext()
      parser.parseObjectKey("api_propulsion_assessment")
      val api_propulsion_assessment = parseObservation_Sortie_Eligibility_SupervisorPropulsionAssessment()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_P(api_communication_assessment, api_energy_assessment, api_navigation_assessment, api_observation_assessment, api_obstacle_assessment, api_propulsion_assessment)
    }

    def parseObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PS(): Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PS = {
      val r = parseObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PST(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PST(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PS")
      }
      parser.parseObjectKey("api_communication_assessment")
      val api_communication_assessment = parseObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment()
      parser.parseObjectNext()
      parser.parseObjectKey("api_energy_assessment")
      val api_energy_assessment = parseObservation_Sortie_Eligibility_SupervisorEnergyAssessment()
      parser.parseObjectNext()
      parser.parseObjectKey("api_navigation_assessment")
      val api_navigation_assessment = parseObservation_Sortie_Eligibility_SupervisorNavigationAssessment()
      parser.parseObjectNext()
      parser.parseObjectKey("api_observation_assessment")
      val api_observation_assessment = parseObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment()
      parser.parseObjectNext()
      parser.parseObjectKey("api_obstacle_assessment")
      val api_obstacle_assessment = parseObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment()
      parser.parseObjectNext()
      parser.parseObjectKey("api_propulsion_assessment")
      val api_propulsion_assessment = parseObservation_Sortie_Eligibility_SupervisorPropulsionAssessment()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PS(api_communication_assessment, api_energy_assessment, api_navigation_assessment, api_observation_assessment, api_obstacle_assessment, api_propulsion_assessment)
    }

    def parseObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container(): Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_P", "Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PS"))
      t.native match {
        case "Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_P" => val r = parseObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PS" => val r = parseObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PST(T); return r
        case _ => val r = parseObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PST(T); return r
      }
    }

    def parseObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_P(): Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_P = {
      val r = parseObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_P")
      }
      parser.parseObjectKey("api_fault_summary")
      val api_fault_summary = parseObservation_Sortie_Eligibility_SupervisorFaultSummary()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_P(api_fault_summary)
    }

    def parseObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PS(): Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PS = {
      val r = parseObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PST(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PST(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PS")
      }
      parser.parseObjectKey("api_fault_summary")
      val api_fault_summary = parseObservation_Sortie_Eligibility_SupervisorFaultSummary()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PS(api_fault_summary)
    }

    def parseObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container(): Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_P", "Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PS"))
      t.native match {
        case "Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_P" => val r = parseObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PS" => val r = parseObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PST(T); return r
        case _ => val r = parseObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PST(T); return r
      }
    }

    def parseObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_P(): Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_P = {
      val r = parseObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_P")
      }
      parser.parseObjectKey("api_candidate_event")
      val api_candidate_event = parseObservation_Sortie_Eligibility_SupervisorOperatorEventType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_fault_summary")
      val api_fault_summary = parseObservation_Sortie_Eligibility_SupervisorFaultSummary()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_P(api_candidate_event, api_fault_summary)
    }

    def parseObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PS(): Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PS = {
      val r = parseObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PST(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PST(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PS")
      }
      parser.parseObjectKey("api_candidate_event")
      val api_candidate_event = parseObservation_Sortie_Eligibility_SupervisorOperatorEventType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_fault_summary")
      val api_fault_summary = parseObservation_Sortie_Eligibility_SupervisorFaultSummary()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PS(api_candidate_event, api_fault_summary)
    }

    def parseObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container(): Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_P", "Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PS"))
      t.native match {
        case "Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_P" => val r = parseObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PS" => val r = parseObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PST(T); return r
        case _ => val r = parseObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PST(T); return r
      }
    }

    def parseObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_P(): Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_P = {
      val r = parseObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_P")
      }
      parser.parseObjectKey("api_accepted_directive")
      val api_accepted_directive = parseObservation_Sortie_Eligibility_SupervisorPriorityDirectiveType()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_P(api_accepted_directive)
    }

    def parseObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PS(): Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PS = {
      val r = parseObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PST(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PST(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PS")
      }
      parser.parseObjectKey("api_accepted_directive")
      val api_accepted_directive = parseObservation_Sortie_Eligibility_SupervisorPriorityDirectiveType()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PS(api_accepted_directive)
    }

    def parseObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container(): Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_P", "Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PS"))
      t.native match {
        case "Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_P" => val r = parseObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PS" => val r = parseObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PST(T); return r
        case _ => val r = parseObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PST(T); return r
      }
    }

    def parseObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_P(): Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_P = {
      val r = parseObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_P")
      }
      parser.parseObjectKey("api_accepted_directive")
      val api_accepted_directive = parseObservation_Sortie_Eligibility_SupervisorPriorityDirectiveType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_fault_summary")
      val api_fault_summary = parseObservation_Sortie_Eligibility_SupervisorFaultSummary()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_P(api_accepted_directive, api_fault_summary)
    }

    def parseObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PS(): Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PS = {
      val r = parseObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PST(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PST(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_accepted_directive")
      val api_accepted_directive = parseObservation_Sortie_Eligibility_SupervisorPriorityDirectiveType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_fault_summary")
      val api_fault_summary = parseObservation_Sortie_Eligibility_SupervisorFaultSummary()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PS(api_accepted_directive, api_fault_summary)
    }

    def parseObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container(): Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_P", "Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PS"))
      t.native match {
        case "Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_P" => val r = parseObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PS" => val r = parseObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PST(T); return r
        case _ => val r = parseObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PST(T); return r
      }
    }

    def parseObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_P(): Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_P = {
      val r = parseObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_P")
      }
      parser.parseObjectKey("api_recovery_facts")
      val api_recovery_facts = parseObservation_Sortie_Eligibility_SupervisorRecoveryFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_phase")
      val api_recovery_phase = parseObservation_Sortie_Eligibility_SupervisorRecoveryPhaseType()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_P(api_recovery_facts, api_recovery_phase)
    }

    def parseObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PS(): Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PS = {
      val r = parseObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PST(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PST(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_recovery_facts")
      val api_recovery_facts = parseObservation_Sortie_Eligibility_SupervisorRecoveryFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_phase")
      val api_recovery_phase = parseObservation_Sortie_Eligibility_SupervisorRecoveryPhaseType()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PS(api_recovery_facts, api_recovery_phase)
    }

    def parseObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container(): Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_P", "Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PS"))
      t.native match {
        case "Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_P" => val r = parseObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PS" => val r = parseObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PST(T); return r
        case _ => val r = parseObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PST(T); return r
      }
    }

    def parseObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_P(): Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_P = {
      val r = parseObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_P")
      }
      parser.parseObjectKey("api_communication_assessment")
      val api_communication_assessment = parseObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment()
      parser.parseObjectNext()
      parser.parseObjectKey("api_energy_assessment")
      val api_energy_assessment = parseObservation_Sortie_Eligibility_SupervisorEnergyAssessment()
      parser.parseObjectNext()
      parser.parseObjectKey("api_navigation_assessment")
      val api_navigation_assessment = parseObservation_Sortie_Eligibility_SupervisorNavigationAssessment()
      parser.parseObjectNext()
      parser.parseObjectKey("api_observation_assessment")
      val api_observation_assessment = parseObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment()
      parser.parseObjectNext()
      parser.parseObjectKey("api_obstacle_assessment")
      val api_obstacle_assessment = parseObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment()
      parser.parseObjectNext()
      parser.parseObjectKey("api_propulsion_assessment")
      val api_propulsion_assessment = parseObservation_Sortie_Eligibility_SupervisorPropulsionAssessment()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_facts")
      val api_recovery_facts = parseObservation_Sortie_Eligibility_SupervisorRecoveryFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_request_phase")
      val api_request_phase = parseObservation_Sortie_Eligibility_SupervisorRequestPhaseType()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_P(api_communication_assessment, api_energy_assessment, api_navigation_assessment, api_observation_assessment, api_obstacle_assessment, api_propulsion_assessment, api_recovery_facts, api_request_phase)
    }

    def parseObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PS(): Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PS = {
      val r = parseObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PST(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PST(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_communication_assessment")
      val api_communication_assessment = parseObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment()
      parser.parseObjectNext()
      parser.parseObjectKey("api_energy_assessment")
      val api_energy_assessment = parseObservation_Sortie_Eligibility_SupervisorEnergyAssessment()
      parser.parseObjectNext()
      parser.parseObjectKey("api_navigation_assessment")
      val api_navigation_assessment = parseObservation_Sortie_Eligibility_SupervisorNavigationAssessment()
      parser.parseObjectNext()
      parser.parseObjectKey("api_observation_assessment")
      val api_observation_assessment = parseObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment()
      parser.parseObjectNext()
      parser.parseObjectKey("api_obstacle_assessment")
      val api_obstacle_assessment = parseObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment()
      parser.parseObjectNext()
      parser.parseObjectKey("api_propulsion_assessment")
      val api_propulsion_assessment = parseObservation_Sortie_Eligibility_SupervisorPropulsionAssessment()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_facts")
      val api_recovery_facts = parseObservation_Sortie_Eligibility_SupervisorRecoveryFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_request_phase")
      val api_request_phase = parseObservation_Sortie_Eligibility_SupervisorRequestPhaseType()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PS(api_communication_assessment, api_energy_assessment, api_navigation_assessment, api_observation_assessment, api_obstacle_assessment, api_propulsion_assessment, api_recovery_facts, api_request_phase)
    }

    def parseObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container(): Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_P", "Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PS"))
      t.native match {
        case "Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_P" => val r = parseObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PS" => val r = parseObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PST(T); return r
        case _ => val r = parseObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PST(T); return r
      }
    }

    def parseObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_P(): Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_P = {
      val r = parseObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_P")
      }
      parser.parseObjectKey("api_eligibility_decision")
      val api_eligibility_decision = parseObservation_Sortie_Eligibility_SupervisorEligibilityDecision()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_P(api_eligibility_decision)
    }

    def parseObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PS(): Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PS = {
      val r = parseObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PST(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PST(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_eligibility_decision")
      val api_eligibility_decision = parseObservation_Sortie_Eligibility_SupervisorEligibilityDecision()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PS(api_eligibility_decision)
    }

    def parseObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container(): Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_P", "Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PS"))
      t.native match {
        case "Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_P" => val r = parseObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PS" => val r = parseObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PST(T); return r
        case _ => val r = parseObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PST(T); return r
      }
    }

    def parseObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_P(): Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_P = {
      val r = parseObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_P")
      }
      parser.parseObjectKey("api_eligibility_decision")
      val api_eligibility_decision = parseObservation_Sortie_Eligibility_SupervisorEligibilityDecision()
      parser.parseObjectNext()
      parser.parseObjectKey("api_request_phase")
      val api_request_phase = parseObservation_Sortie_Eligibility_SupervisorRequestPhaseType()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_P(api_eligibility_decision, api_request_phase)
    }

    def parseObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PS(): Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PS = {
      val r = parseObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PST(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PST(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PS")
      }
      parser.parseObjectKey("api_eligibility_decision")
      val api_eligibility_decision = parseObservation_Sortie_Eligibility_SupervisorEligibilityDecision()
      parser.parseObjectNext()
      parser.parseObjectKey("api_request_phase")
      val api_request_phase = parseObservation_Sortie_Eligibility_SupervisorRequestPhaseType()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PS(api_eligibility_decision, api_request_phase)
    }

    def parseObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container(): Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_P", "Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PS"))
      t.native match {
        case "Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_P" => val r = parseObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PS" => val r = parseObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PST(T); return r
        case _ => val r = parseObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PST(T); return r
      }
    }

    def parseObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_P(): Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_P = {
      val r = parseObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_P")
      }
      parser.parseObjectKey("api_release_feedback")
      val api_release_feedback = parseObservation_Sortie_Eligibility_SupervisorReleaseFeedbackType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_sortie_directive")
      val api_sortie_directive = parseObservation_Sortie_Eligibility_SupervisorSortieDirectiveType()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_P(api_release_feedback, api_sortie_directive)
    }

    def parseObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PS(): Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PS = {
      val r = parseObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PST(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PST(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PS")
      }
      parser.parseObjectKey("api_release_feedback")
      val api_release_feedback = parseObservation_Sortie_Eligibility_SupervisorReleaseFeedbackType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_sortie_directive")
      val api_sortie_directive = parseObservation_Sortie_Eligibility_SupervisorSortieDirectiveType()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PS(api_release_feedback, api_sortie_directive)
    }

    def parseObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container(): Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_P", "Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PS"))
      t.native match {
        case "Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_P" => val r = parseObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PS" => val r = parseObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PST(T); return r
        case _ => val r = parseObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PST(T); return r
      }
    }

    def parseObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_P(): Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_P = {
      val r = parseObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_P")
      }
      parser.parseObjectKey("api_eligibility_decision")
      val api_eligibility_decision = parseObservation_Sortie_Eligibility_SupervisorEligibilityDecision()
      parser.parseObjectNext()
      parser.parseObjectKey("api_fault_summary")
      val api_fault_summary = parseObservation_Sortie_Eligibility_SupervisorFaultSummary()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_phase")
      val api_recovery_phase = parseObservation_Sortie_Eligibility_SupervisorRecoveryPhaseType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_request_phase")
      val api_request_phase = parseObservation_Sortie_Eligibility_SupervisorRequestPhaseType()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_P(api_eligibility_decision, api_fault_summary, api_recovery_phase, api_request_phase)
    }

    def parseObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PS(): Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PS = {
      val r = parseObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PST(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PST(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PS")
      }
      parser.parseObjectKey("api_eligibility_decision")
      val api_eligibility_decision = parseObservation_Sortie_Eligibility_SupervisorEligibilityDecision()
      parser.parseObjectNext()
      parser.parseObjectKey("api_fault_summary")
      val api_fault_summary = parseObservation_Sortie_Eligibility_SupervisorFaultSummary()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_phase")
      val api_recovery_phase = parseObservation_Sortie_Eligibility_SupervisorRecoveryPhaseType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_request_phase")
      val api_request_phase = parseObservation_Sortie_Eligibility_SupervisorRequestPhaseType()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PS(api_eligibility_decision, api_fault_summary, api_recovery_phase, api_request_phase)
    }

    def parseObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container(): Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_P", "Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PS"))
      t.native match {
        case "Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_P" => val r = parseObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PS" => val r = parseObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PST(T); return r
        case _ => val r = parseObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PST(T); return r
      }
    }

    def parseObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_P(): Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_P = {
      val r = parseObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PT(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PT(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_P")
      }
      parser.parseObjectKey("api_eligibility_status")
      val api_eligibility_status = parseObservation_Sortie_Eligibility_SupervisorEligibilityStatus()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_P(api_eligibility_status)
    }

    def parseObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PS(): Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PS = {
      val r = parseObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PST(F)
      return r
    }

    def parseObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PST(typeParsed: B): Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PS")
      }
      parser.parseObjectKey("api_eligibility_status")
      val api_eligibility_status = parseObservation_Sortie_Eligibility_SupervisorEligibilityStatus()
      parser.parseObjectNext()
      return Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PS(api_eligibility_status)
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
      val t = parser.parseObjectTypes(ISZ("util.EmptyContainer", "Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_P", "Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PS", "Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_P", "Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PS", "Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_P", "Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PS", "Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_P", "Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PS", "Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_P", "Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PS", "Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_P", "Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PS", "Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_P", "Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PS", "Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_P", "Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PS", "Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_P", "Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PS", "Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_P", "Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PS", "Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_P", "Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PS", "Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_P", "Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PS", "Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_P", "Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PS", "Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_P", "Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_P", "Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PS", "Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PS", "Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_P", "Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PS", "Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_P", "Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_P", "Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_P", "Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PS", "Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PS", "Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PS", "Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_P", "Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_P", "Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_P", "Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PS", "Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PS", "Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PS", "Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_P", "Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PS", "Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_P", "Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PS", "Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_P", "Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PS", "Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_P", "Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PS"))
      t.native match {
        case "util.EmptyContainer" => val r = parseutilEmptyContainerT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_P" => val r = parseObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PS" => val r = parseObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PST(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_P" => val r = parseObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PS" => val r = parseObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PST(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_P" => val r = parseObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PS" => val r = parseObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PST(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_P" => val r = parseObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PS" => val r = parseObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PST(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_P" => val r = parseObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PS" => val r = parseObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PST(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_P" => val r = parseObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PS" => val r = parseObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PST(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_P" => val r = parseObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PS" => val r = parseObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PST(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_P" => val r = parseObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PS" => val r = parseObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PST(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_P" => val r = parseObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PS" => val r = parseObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PST(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_P" => val r = parseObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PS" => val r = parseObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PST(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_P" => val r = parseObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PS" => val r = parseObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PST(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_P" => val r = parseObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PS" => val r = parseObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PST(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_P" => val r = parseObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PS" => val r = parseObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PST(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_P" => val r = parseObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_P" => val r = parseObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PS" => val r = parseObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PST(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PS" => val r = parseObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PST(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_P" => val r = parseObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PS" => val r = parseObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PST(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_P" => val r = parseObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_P" => val r = parseObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_P" => val r = parseObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PS" => val r = parseObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PST(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PS" => val r = parseObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PST(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PS" => val r = parseObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PST(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_P" => val r = parseObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_P" => val r = parseObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_P" => val r = parseObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PS" => val r = parseObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PST(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PS" => val r = parseObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PST(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PS" => val r = parseObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PST(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_P" => val r = parseObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PS" => val r = parseObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PST(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_P" => val r = parseObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PS" => val r = parseObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PST(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_P" => val r = parseObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PS" => val r = parseObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PST(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_P" => val r = parseObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PS" => val r = parseObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PST(T); return r
        case _ => val r = parseObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PST(T); return r
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
      val t = parser.parseObjectTypes(ISZ("art.Empty", "Base_Types.Boolean_Payload", "Base_Types.Integer_Payload", "Base_Types.Integer_8_Payload", "Base_Types.Integer_16_Payload", "Base_Types.Integer_32_Payload", "Base_Types.Integer_64_Payload", "Base_Types.Unsigned_8_Payload", "Base_Types.Unsigned_16_Payload", "Base_Types.Unsigned_32_Payload", "Base_Types.Unsigned_64_Payload", "Base_Types.Float_Payload", "Base_Types.Float_32_Payload", "Base_Types.Float_64_Payload", "Base_Types.Character_Payload", "Base_Types.String_Payload", "Base_Types.Bits_Payload", "util.EmptyContainer", "Observation_Sortie_Eligibility_Supervisor.Validity_Payload", "Observation_Sortie_Eligibility_Supervisor.Freshness_Payload", "Observation_Sortie_Eligibility_Supervisor.FaultState_Payload", "Observation_Sortie_Eligibility_Supervisor.EnergyCause_Payload", "Observation_Sortie_Eligibility_Supervisor.RecoveryGate_Payload", "Observation_Sortie_Eligibility_Supervisor.RequestPhase_Payload", "Observation_Sortie_Eligibility_Supervisor.Confirmation_Payload", "Observation_Sortie_Eligibility_Supervisor.GpsCondition_Payload", "Observation_Sortie_Eligibility_Supervisor.FaultSummary_Payload", "Observation_Sortie_Eligibility_Supervisor.RecoveryPhase_Payload", "Observation_Sortie_Eligibility_Supervisor.EnergyQuality_Payload", "Observation_Sortie_Eligibility_Supervisor.OperatorEvent_Payload", "Observation_Sortie_Eligibility_Supervisor.LimitingCause_Payload", "Observation_Sortie_Eligibility_Supervisor.RecoveryFacts_Payload", "Observation_Sortie_Eligibility_Supervisor.StatusDecision_Payload", "Observation_Sortie_Eligibility_Supervisor.EquipmentCause_Payload", "Observation_Sortie_Eligibility_Supervisor.EnergyEvidence_Payload", "Observation_Sortie_Eligibility_Supervisor.SortieDirective_Payload", "Observation_Sortie_Eligibility_Supervisor.ReleaseFeedback_Payload", "Observation_Sortie_Eligibility_Supervisor.CarriedPriority_Payload", "Observation_Sortie_Eligibility_Supervisor.NavigationCause_Payload", "Observation_Sortie_Eligibility_Supervisor.PropulsionCause_Payload", "Observation_Sortie_Eligibility_Supervisor.StatusFaultState_Payload", "Observation_Sortie_Eligibility_Supervisor.Engine1Condition_Payload", "Observation_Sortie_Eligibility_Supervisor.Engine2Condition_Payload", "Observation_Sortie_Eligibility_Supervisor.Engine3Condition_Payload", "Observation_Sortie_Eligibility_Supervisor.Engine4Condition_Payload", "Observation_Sortie_Eligibility_Supervisor.EnergyAssessment_Payload", "Observation_Sortie_Eligibility_Supervisor.EligibilityReason_Payload", "Observation_Sortie_Eligibility_Supervisor.InertialCondition_Payload", "Observation_Sortie_Eligibility_Supervisor.PriorityDirective_Payload", "Observation_Sortie_Eligibility_Supervisor.EquipmentEvidence_Payload", "Observation_Sortie_Eligibility_Supervisor.EligibilityStatus_Payload", "Observation_Sortie_Eligibility_Supervisor.StatusRequestPhase_Payload", "Observation_Sortie_Eligibility_Supervisor.EquipmentCondition_Payload", "Observation_Sortie_Eligibility_Supervisor.PropulsionEvidence_Payload", "Observation_Sortie_Eligibility_Supervisor.StatusRecoveryPhase_Payload", "Observation_Sortie_Eligibility_Supervisor.BarometricCondition_Payload", "Observation_Sortie_Eligibility_Supervisor.EligibilityDecision_Payload", "Observation_Sortie_Eligibility_Supervisor.SingleEquipmentCause_Payload", "Observation_Sortie_Eligibility_Supervisor.NavigationAssessment_Payload", "Observation_Sortie_Eligibility_Supervisor.PropulsionAssessment_Payload", "Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceRecord_Payload", "Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment_Payload", "Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_P", "Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PS", "Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_P", "Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PS", "Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_P", "Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PS", "Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_P", "Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PS", "Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_P", "Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PS", "Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_P", "Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PS", "Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_P", "Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PS", "Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_P", "Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PS", "Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_P", "Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PS", "Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_P", "Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PS", "Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_P", "Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PS", "Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_P", "Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PS", "Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_P", "Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PS", "Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_P", "Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_P", "Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PS", "Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PS", "Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_P", "Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PS", "Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_P", "Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_P", "Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_P", "Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PS", "Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PS", "Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PS", "Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_P", "Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_P", "Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_P", "Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PS", "Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PS", "Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PS", "Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_P", "Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PS", "Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_P", "Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PS", "Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_P", "Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PS", "Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_P", "Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PS"))
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
        case "Observation_Sortie_Eligibility_Supervisor.Validity_Payload" => val r = parseObservation_Sortie_Eligibility_SupervisorValidity_PayloadT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.Freshness_Payload" => val r = parseObservation_Sortie_Eligibility_SupervisorFreshness_PayloadT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.FaultState_Payload" => val r = parseObservation_Sortie_Eligibility_SupervisorFaultState_PayloadT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.EnergyCause_Payload" => val r = parseObservation_Sortie_Eligibility_SupervisorEnergyCause_PayloadT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.RecoveryGate_Payload" => val r = parseObservation_Sortie_Eligibility_SupervisorRecoveryGate_PayloadT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.RequestPhase_Payload" => val r = parseObservation_Sortie_Eligibility_SupervisorRequestPhase_PayloadT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.Confirmation_Payload" => val r = parseObservation_Sortie_Eligibility_SupervisorConfirmation_PayloadT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.GpsCondition_Payload" => val r = parseObservation_Sortie_Eligibility_SupervisorGpsCondition_PayloadT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.FaultSummary_Payload" => val r = parseObservation_Sortie_Eligibility_SupervisorFaultSummary_PayloadT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.RecoveryPhase_Payload" => val r = parseObservation_Sortie_Eligibility_SupervisorRecoveryPhase_PayloadT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.EnergyQuality_Payload" => val r = parseObservation_Sortie_Eligibility_SupervisorEnergyQuality_PayloadT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.OperatorEvent_Payload" => val r = parseObservation_Sortie_Eligibility_SupervisorOperatorEvent_PayloadT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.LimitingCause_Payload" => val r = parseObservation_Sortie_Eligibility_SupervisorLimitingCause_PayloadT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.RecoveryFacts_Payload" => val r = parseObservation_Sortie_Eligibility_SupervisorRecoveryFacts_PayloadT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.StatusDecision_Payload" => val r = parseObservation_Sortie_Eligibility_SupervisorStatusDecision_PayloadT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.EquipmentCause_Payload" => val r = parseObservation_Sortie_Eligibility_SupervisorEquipmentCause_PayloadT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.EnergyEvidence_Payload" => val r = parseObservation_Sortie_Eligibility_SupervisorEnergyEvidence_PayloadT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.SortieDirective_Payload" => val r = parseObservation_Sortie_Eligibility_SupervisorSortieDirective_PayloadT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.ReleaseFeedback_Payload" => val r = parseObservation_Sortie_Eligibility_SupervisorReleaseFeedback_PayloadT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.CarriedPriority_Payload" => val r = parseObservation_Sortie_Eligibility_SupervisorCarriedPriority_PayloadT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.NavigationCause_Payload" => val r = parseObservation_Sortie_Eligibility_SupervisorNavigationCause_PayloadT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.PropulsionCause_Payload" => val r = parseObservation_Sortie_Eligibility_SupervisorPropulsionCause_PayloadT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.StatusFaultState_Payload" => val r = parseObservation_Sortie_Eligibility_SupervisorStatusFaultState_PayloadT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.Engine1Condition_Payload" => val r = parseObservation_Sortie_Eligibility_SupervisorEngine1Condition_PayloadT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.Engine2Condition_Payload" => val r = parseObservation_Sortie_Eligibility_SupervisorEngine2Condition_PayloadT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.Engine3Condition_Payload" => val r = parseObservation_Sortie_Eligibility_SupervisorEngine3Condition_PayloadT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.Engine4Condition_Payload" => val r = parseObservation_Sortie_Eligibility_SupervisorEngine4Condition_PayloadT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.EnergyAssessment_Payload" => val r = parseObservation_Sortie_Eligibility_SupervisorEnergyAssessment_PayloadT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.EligibilityReason_Payload" => val r = parseObservation_Sortie_Eligibility_SupervisorEligibilityReason_PayloadT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.InertialCondition_Payload" => val r = parseObservation_Sortie_Eligibility_SupervisorInertialCondition_PayloadT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.PriorityDirective_Payload" => val r = parseObservation_Sortie_Eligibility_SupervisorPriorityDirective_PayloadT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.EquipmentEvidence_Payload" => val r = parseObservation_Sortie_Eligibility_SupervisorEquipmentEvidence_PayloadT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.EligibilityStatus_Payload" => val r = parseObservation_Sortie_Eligibility_SupervisorEligibilityStatus_PayloadT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.StatusRequestPhase_Payload" => val r = parseObservation_Sortie_Eligibility_SupervisorStatusRequestPhase_PayloadT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.EquipmentCondition_Payload" => val r = parseObservation_Sortie_Eligibility_SupervisorEquipmentCondition_PayloadT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.PropulsionEvidence_Payload" => val r = parseObservation_Sortie_Eligibility_SupervisorPropulsionEvidence_PayloadT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.StatusRecoveryPhase_Payload" => val r = parseObservation_Sortie_Eligibility_SupervisorStatusRecoveryPhase_PayloadT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.BarometricCondition_Payload" => val r = parseObservation_Sortie_Eligibility_SupervisorBarometricCondition_PayloadT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.EligibilityDecision_Payload" => val r = parseObservation_Sortie_Eligibility_SupervisorEligibilityDecision_PayloadT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.SingleEquipmentCause_Payload" => val r = parseObservation_Sortie_Eligibility_SupervisorSingleEquipmentCause_PayloadT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.NavigationAssessment_Payload" => val r = parseObservation_Sortie_Eligibility_SupervisorNavigationAssessment_PayloadT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.PropulsionAssessment_Payload" => val r = parseObservation_Sortie_Eligibility_SupervisorPropulsionAssessment_PayloadT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceRecord_Payload" => val r = parseObservation_Sortie_Eligibility_SupervisorNavigationEvidenceRecord_PayloadT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment_Payload" => val r = parseObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment_PayloadT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_P" => val r = parseObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PS" => val r = parseObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PST(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_P" => val r = parseObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PS" => val r = parseObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PST(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_P" => val r = parseObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PS" => val r = parseObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PST(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_P" => val r = parseObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PS" => val r = parseObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PST(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_P" => val r = parseObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PS" => val r = parseObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PST(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_P" => val r = parseObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PS" => val r = parseObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PST(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_P" => val r = parseObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PS" => val r = parseObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PST(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_P" => val r = parseObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PS" => val r = parseObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PST(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_P" => val r = parseObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PS" => val r = parseObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PST(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_P" => val r = parseObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PS" => val r = parseObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PST(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_P" => val r = parseObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PS" => val r = parseObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PST(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_P" => val r = parseObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PS" => val r = parseObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PST(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_P" => val r = parseObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PS" => val r = parseObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PST(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_P" => val r = parseObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_P" => val r = parseObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PS" => val r = parseObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PST(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PS" => val r = parseObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PST(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_P" => val r = parseObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PS" => val r = parseObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PST(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_P" => val r = parseObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_P" => val r = parseObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_P" => val r = parseObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PS" => val r = parseObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PST(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PS" => val r = parseObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PST(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PS" => val r = parseObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PST(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_P" => val r = parseObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_P" => val r = parseObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_P" => val r = parseObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PS" => val r = parseObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PST(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PS" => val r = parseObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PST(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PS" => val r = parseObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PST(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_P" => val r = parseObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PS" => val r = parseObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PST(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_P" => val r = parseObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PS" => val r = parseObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PST(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_P" => val r = parseObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PS" => val r = parseObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PST(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_P" => val r = parseObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PT(T); return r
        case "Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PS" => val r = parseObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PST(T); return r
        case _ => val r = parseObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PST(T); return r
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

  def fromObservation_Sortie_Eligibility_SupervisorEnergyQuality_Payload(o: Observation_Sortie_Eligibility_Supervisor.EnergyQuality_Payload, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorEnergyQuality_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorEnergyQuality_Payload(s: String): Either[Observation_Sortie_Eligibility_Supervisor.EnergyQuality_Payload, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorEnergyQuality_Payload(parser: Parser): Observation_Sortie_Eligibility_Supervisor.EnergyQuality_Payload = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorEnergyQuality_Payload()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorEnergyQuality_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorValidity_Payload(o: Observation_Sortie_Eligibility_Supervisor.Validity_Payload, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorValidity_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorValidity_Payload(s: String): Either[Observation_Sortie_Eligibility_Supervisor.Validity_Payload, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorValidity_Payload(parser: Parser): Observation_Sortie_Eligibility_Supervisor.Validity_Payload = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorValidity_Payload()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorValidity_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorFreshness_Payload(o: Observation_Sortie_Eligibility_Supervisor.Freshness_Payload, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorFreshness_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorFreshness_Payload(s: String): Either[Observation_Sortie_Eligibility_Supervisor.Freshness_Payload, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorFreshness_Payload(parser: Parser): Observation_Sortie_Eligibility_Supervisor.Freshness_Payload = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorFreshness_Payload()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorFreshness_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorEnergyCause_Payload(o: Observation_Sortie_Eligibility_Supervisor.EnergyCause_Payload, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorEnergyCause_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorEnergyCause_Payload(s: String): Either[Observation_Sortie_Eligibility_Supervisor.EnergyCause_Payload, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorEnergyCause_Payload(parser: Parser): Observation_Sortie_Eligibility_Supervisor.EnergyCause_Payload = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorEnergyCause_Payload()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorEnergyCause_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorGpsCondition_Payload(o: Observation_Sortie_Eligibility_Supervisor.GpsCondition_Payload, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorGpsCondition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorGpsCondition_Payload(s: String): Either[Observation_Sortie_Eligibility_Supervisor.GpsCondition_Payload, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorGpsCondition_Payload(parser: Parser): Observation_Sortie_Eligibility_Supervisor.GpsCondition_Payload = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorGpsCondition_Payload()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorGpsCondition_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorInertialCondition_Payload(o: Observation_Sortie_Eligibility_Supervisor.InertialCondition_Payload, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorInertialCondition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorInertialCondition_Payload(s: String): Either[Observation_Sortie_Eligibility_Supervisor.InertialCondition_Payload, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorInertialCondition_Payload(parser: Parser): Observation_Sortie_Eligibility_Supervisor.InertialCondition_Payload = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorInertialCondition_Payload()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorInertialCondition_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorBarometricCondition_Payload(o: Observation_Sortie_Eligibility_Supervisor.BarometricCondition_Payload, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorBarometricCondition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorBarometricCondition_Payload(s: String): Either[Observation_Sortie_Eligibility_Supervisor.BarometricCondition_Payload, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorBarometricCondition_Payload(parser: Parser): Observation_Sortie_Eligibility_Supervisor.BarometricCondition_Payload = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorBarometricCondition_Payload()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorBarometricCondition_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorNavigationCause_Payload(o: Observation_Sortie_Eligibility_Supervisor.NavigationCause_Payload, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorNavigationCause_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorNavigationCause_Payload(s: String): Either[Observation_Sortie_Eligibility_Supervisor.NavigationCause_Payload, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorNavigationCause_Payload(parser: Parser): Observation_Sortie_Eligibility_Supervisor.NavigationCause_Payload = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorNavigationCause_Payload()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorNavigationCause_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorEquipmentCondition_Payload(o: Observation_Sortie_Eligibility_Supervisor.EquipmentCondition_Payload, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorEquipmentCondition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorEquipmentCondition_Payload(s: String): Either[Observation_Sortie_Eligibility_Supervisor.EquipmentCondition_Payload, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorEquipmentCondition_Payload(parser: Parser): Observation_Sortie_Eligibility_Supervisor.EquipmentCondition_Payload = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorEquipmentCondition_Payload()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorEquipmentCondition_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorSingleEquipmentCause_Payload(o: Observation_Sortie_Eligibility_Supervisor.SingleEquipmentCause_Payload, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorSingleEquipmentCause_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorSingleEquipmentCause_Payload(s: String): Either[Observation_Sortie_Eligibility_Supervisor.SingleEquipmentCause_Payload, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorSingleEquipmentCause_Payload(parser: Parser): Observation_Sortie_Eligibility_Supervisor.SingleEquipmentCause_Payload = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorSingleEquipmentCause_Payload()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorSingleEquipmentCause_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorEngine1Condition_Payload(o: Observation_Sortie_Eligibility_Supervisor.Engine1Condition_Payload, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorEngine1Condition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorEngine1Condition_Payload(s: String): Either[Observation_Sortie_Eligibility_Supervisor.Engine1Condition_Payload, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorEngine1Condition_Payload(parser: Parser): Observation_Sortie_Eligibility_Supervisor.Engine1Condition_Payload = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorEngine1Condition_Payload()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorEngine1Condition_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorEngine2Condition_Payload(o: Observation_Sortie_Eligibility_Supervisor.Engine2Condition_Payload, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorEngine2Condition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorEngine2Condition_Payload(s: String): Either[Observation_Sortie_Eligibility_Supervisor.Engine2Condition_Payload, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorEngine2Condition_Payload(parser: Parser): Observation_Sortie_Eligibility_Supervisor.Engine2Condition_Payload = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorEngine2Condition_Payload()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorEngine2Condition_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorEngine3Condition_Payload(o: Observation_Sortie_Eligibility_Supervisor.Engine3Condition_Payload, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorEngine3Condition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorEngine3Condition_Payload(s: String): Either[Observation_Sortie_Eligibility_Supervisor.Engine3Condition_Payload, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorEngine3Condition_Payload(parser: Parser): Observation_Sortie_Eligibility_Supervisor.Engine3Condition_Payload = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorEngine3Condition_Payload()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorEngine3Condition_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorEngine4Condition_Payload(o: Observation_Sortie_Eligibility_Supervisor.Engine4Condition_Payload, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorEngine4Condition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorEngine4Condition_Payload(s: String): Either[Observation_Sortie_Eligibility_Supervisor.Engine4Condition_Payload, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorEngine4Condition_Payload(parser: Parser): Observation_Sortie_Eligibility_Supervisor.Engine4Condition_Payload = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorEngine4Condition_Payload()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorEngine4Condition_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorConfirmation_Payload(o: Observation_Sortie_Eligibility_Supervisor.Confirmation_Payload, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorConfirmation_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorConfirmation_Payload(s: String): Either[Observation_Sortie_Eligibility_Supervisor.Confirmation_Payload, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorConfirmation_Payload(parser: Parser): Observation_Sortie_Eligibility_Supervisor.Confirmation_Payload = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorConfirmation_Payload()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorConfirmation_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorPropulsionCause_Payload(o: Observation_Sortie_Eligibility_Supervisor.PropulsionCause_Payload, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorPropulsionCause_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorPropulsionCause_Payload(s: String): Either[Observation_Sortie_Eligibility_Supervisor.PropulsionCause_Payload, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorPropulsionCause_Payload(parser: Parser): Observation_Sortie_Eligibility_Supervisor.PropulsionCause_Payload = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorPropulsionCause_Payload()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorPropulsionCause_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorOperatorEvent_Payload(o: Observation_Sortie_Eligibility_Supervisor.OperatorEvent_Payload, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorOperatorEvent_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorOperatorEvent_Payload(s: String): Either[Observation_Sortie_Eligibility_Supervisor.OperatorEvent_Payload, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorOperatorEvent_Payload(parser: Parser): Observation_Sortie_Eligibility_Supervisor.OperatorEvent_Payload = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorOperatorEvent_Payload()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorOperatorEvent_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorPriorityDirective_Payload(o: Observation_Sortie_Eligibility_Supervisor.PriorityDirective_Payload, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorPriorityDirective_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorPriorityDirective_Payload(s: String): Either[Observation_Sortie_Eligibility_Supervisor.PriorityDirective_Payload, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorPriorityDirective_Payload(parser: Parser): Observation_Sortie_Eligibility_Supervisor.PriorityDirective_Payload = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorPriorityDirective_Payload()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorPriorityDirective_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorReleaseFeedback_Payload(o: Observation_Sortie_Eligibility_Supervisor.ReleaseFeedback_Payload, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorReleaseFeedback_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorReleaseFeedback_Payload(s: String): Either[Observation_Sortie_Eligibility_Supervisor.ReleaseFeedback_Payload, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorReleaseFeedback_Payload(parser: Parser): Observation_Sortie_Eligibility_Supervisor.ReleaseFeedback_Payload = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorReleaseFeedback_Payload()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorReleaseFeedback_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorRequestPhase_Payload(o: Observation_Sortie_Eligibility_Supervisor.RequestPhase_Payload, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorRequestPhase_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorRequestPhase_Payload(s: String): Either[Observation_Sortie_Eligibility_Supervisor.RequestPhase_Payload, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorRequestPhase_Payload(parser: Parser): Observation_Sortie_Eligibility_Supervisor.RequestPhase_Payload = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorRequestPhase_Payload()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorRequestPhase_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorFaultState_Payload(o: Observation_Sortie_Eligibility_Supervisor.FaultState_Payload, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorFaultState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorFaultState_Payload(s: String): Either[Observation_Sortie_Eligibility_Supervisor.FaultState_Payload, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorFaultState_Payload(parser: Parser): Observation_Sortie_Eligibility_Supervisor.FaultState_Payload = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorFaultState_Payload()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorFaultState_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorEquipmentCause_Payload(o: Observation_Sortie_Eligibility_Supervisor.EquipmentCause_Payload, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorEquipmentCause_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorEquipmentCause_Payload(s: String): Either[Observation_Sortie_Eligibility_Supervisor.EquipmentCause_Payload, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorEquipmentCause_Payload(parser: Parser): Observation_Sortie_Eligibility_Supervisor.EquipmentCause_Payload = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorEquipmentCause_Payload()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorEquipmentCause_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorRecoveryPhase_Payload(o: Observation_Sortie_Eligibility_Supervisor.RecoveryPhase_Payload, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorRecoveryPhase_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorRecoveryPhase_Payload(s: String): Either[Observation_Sortie_Eligibility_Supervisor.RecoveryPhase_Payload, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorRecoveryPhase_Payload(parser: Parser): Observation_Sortie_Eligibility_Supervisor.RecoveryPhase_Payload = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorRecoveryPhase_Payload()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorRecoveryPhase_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorRecoveryGate_Payload(o: Observation_Sortie_Eligibility_Supervisor.RecoveryGate_Payload, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorRecoveryGate_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorRecoveryGate_Payload(s: String): Either[Observation_Sortie_Eligibility_Supervisor.RecoveryGate_Payload, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorRecoveryGate_Payload(parser: Parser): Observation_Sortie_Eligibility_Supervisor.RecoveryGate_Payload = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorRecoveryGate_Payload()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorRecoveryGate_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorCarriedPriority_Payload(o: Observation_Sortie_Eligibility_Supervisor.CarriedPriority_Payload, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorCarriedPriority_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorCarriedPriority_Payload(s: String): Either[Observation_Sortie_Eligibility_Supervisor.CarriedPriority_Payload, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorCarriedPriority_Payload(parser: Parser): Observation_Sortie_Eligibility_Supervisor.CarriedPriority_Payload = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorCarriedPriority_Payload()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorCarriedPriority_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorSortieDirective_Payload(o: Observation_Sortie_Eligibility_Supervisor.SortieDirective_Payload, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorSortieDirective_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorSortieDirective_Payload(s: String): Either[Observation_Sortie_Eligibility_Supervisor.SortieDirective_Payload, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorSortieDirective_Payload(parser: Parser): Observation_Sortie_Eligibility_Supervisor.SortieDirective_Payload = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorSortieDirective_Payload()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorSortieDirective_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorEligibilityReason_Payload(o: Observation_Sortie_Eligibility_Supervisor.EligibilityReason_Payload, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorEligibilityReason_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorEligibilityReason_Payload(s: String): Either[Observation_Sortie_Eligibility_Supervisor.EligibilityReason_Payload, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorEligibilityReason_Payload(parser: Parser): Observation_Sortie_Eligibility_Supervisor.EligibilityReason_Payload = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorEligibilityReason_Payload()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorEligibilityReason_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorStatusRequestPhase_Payload(o: Observation_Sortie_Eligibility_Supervisor.StatusRequestPhase_Payload, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorStatusRequestPhase_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorStatusRequestPhase_Payload(s: String): Either[Observation_Sortie_Eligibility_Supervisor.StatusRequestPhase_Payload, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorStatusRequestPhase_Payload(parser: Parser): Observation_Sortie_Eligibility_Supervisor.StatusRequestPhase_Payload = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorStatusRequestPhase_Payload()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorStatusRequestPhase_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorStatusFaultState_Payload(o: Observation_Sortie_Eligibility_Supervisor.StatusFaultState_Payload, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorStatusFaultState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorStatusFaultState_Payload(s: String): Either[Observation_Sortie_Eligibility_Supervisor.StatusFaultState_Payload, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorStatusFaultState_Payload(parser: Parser): Observation_Sortie_Eligibility_Supervisor.StatusFaultState_Payload = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorStatusFaultState_Payload()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorStatusFaultState_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorStatusRecoveryPhase_Payload(o: Observation_Sortie_Eligibility_Supervisor.StatusRecoveryPhase_Payload, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorStatusRecoveryPhase_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorStatusRecoveryPhase_Payload(s: String): Either[Observation_Sortie_Eligibility_Supervisor.StatusRecoveryPhase_Payload, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorStatusRecoveryPhase_Payload(parser: Parser): Observation_Sortie_Eligibility_Supervisor.StatusRecoveryPhase_Payload = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorStatusRecoveryPhase_Payload()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorStatusRecoveryPhase_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorStatusDecision_Payload(o: Observation_Sortie_Eligibility_Supervisor.StatusDecision_Payload, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorStatusDecision_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorStatusDecision_Payload(s: String): Either[Observation_Sortie_Eligibility_Supervisor.StatusDecision_Payload, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorStatusDecision_Payload(parser: Parser): Observation_Sortie_Eligibility_Supervisor.StatusDecision_Payload = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorStatusDecision_Payload()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorStatusDecision_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorLimitingCause_Payload(o: Observation_Sortie_Eligibility_Supervisor.LimitingCause_Payload, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorLimitingCause_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorLimitingCause_Payload(s: String): Either[Observation_Sortie_Eligibility_Supervisor.LimitingCause_Payload, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorLimitingCause_Payload(parser: Parser): Observation_Sortie_Eligibility_Supervisor.LimitingCause_Payload = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorLimitingCause_Payload()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorLimitingCause_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorEnergyEvidence(o: Observation_Sortie_Eligibility_Supervisor.EnergyEvidence, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorEnergyEvidence(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorEnergyEvidence(s: String): Either[Observation_Sortie_Eligibility_Supervisor.EnergyEvidence, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorEnergyEvidence(parser: Parser): Observation_Sortie_Eligibility_Supervisor.EnergyEvidence = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorEnergyEvidence()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorEnergyEvidence _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorEnergyEvidence_Payload(o: Observation_Sortie_Eligibility_Supervisor.EnergyEvidence_Payload, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorEnergyEvidence_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorEnergyEvidence_Payload(s: String): Either[Observation_Sortie_Eligibility_Supervisor.EnergyEvidence_Payload, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorEnergyEvidence_Payload(parser: Parser): Observation_Sortie_Eligibility_Supervisor.EnergyEvidence_Payload = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorEnergyEvidence_Payload()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorEnergyEvidence_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorEnergyAssessment(o: Observation_Sortie_Eligibility_Supervisor.EnergyAssessment, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorEnergyAssessment(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorEnergyAssessment(s: String): Either[Observation_Sortie_Eligibility_Supervisor.EnergyAssessment, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorEnergyAssessment(parser: Parser): Observation_Sortie_Eligibility_Supervisor.EnergyAssessment = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorEnergyAssessment()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorEnergyAssessment _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorEnergyAssessment_Payload(o: Observation_Sortie_Eligibility_Supervisor.EnergyAssessment_Payload, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorEnergyAssessment_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorEnergyAssessment_Payload(s: String): Either[Observation_Sortie_Eligibility_Supervisor.EnergyAssessment_Payload, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorEnergyAssessment_Payload(parser: Parser): Observation_Sortie_Eligibility_Supervisor.EnergyAssessment_Payload = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorEnergyAssessment_Payload()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorEnergyAssessment_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorNavigationEvidenceRecord(o: Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceRecord, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorNavigationEvidenceRecord(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorNavigationEvidenceRecord(s: String): Either[Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceRecord, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorNavigationEvidenceRecord(parser: Parser): Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceRecord = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorNavigationEvidenceRecord()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorNavigationEvidenceRecord _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorNavigationEvidenceRecord_Payload(o: Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceRecord_Payload, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorNavigationEvidenceRecord_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorNavigationEvidenceRecord_Payload(s: String): Either[Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceRecord_Payload, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorNavigationEvidenceRecord_Payload(parser: Parser): Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceRecord_Payload = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorNavigationEvidenceRecord_Payload()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorNavigationEvidenceRecord_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorNavigationAssessment(o: Observation_Sortie_Eligibility_Supervisor.NavigationAssessment, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorNavigationAssessment(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorNavigationAssessment(s: String): Either[Observation_Sortie_Eligibility_Supervisor.NavigationAssessment, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorNavigationAssessment(parser: Parser): Observation_Sortie_Eligibility_Supervisor.NavigationAssessment = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorNavigationAssessment()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorNavigationAssessment _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorNavigationAssessment_Payload(o: Observation_Sortie_Eligibility_Supervisor.NavigationAssessment_Payload, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorNavigationAssessment_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorNavigationAssessment_Payload(s: String): Either[Observation_Sortie_Eligibility_Supervisor.NavigationAssessment_Payload, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorNavigationAssessment_Payload(parser: Parser): Observation_Sortie_Eligibility_Supervisor.NavigationAssessment_Payload = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorNavigationAssessment_Payload()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorNavigationAssessment_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorEquipmentEvidence(o: Observation_Sortie_Eligibility_Supervisor.EquipmentEvidence, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorEquipmentEvidence(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorEquipmentEvidence(s: String): Either[Observation_Sortie_Eligibility_Supervisor.EquipmentEvidence, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorEquipmentEvidence(parser: Parser): Observation_Sortie_Eligibility_Supervisor.EquipmentEvidence = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorEquipmentEvidence()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorEquipmentEvidence _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorEquipmentEvidence_Payload(o: Observation_Sortie_Eligibility_Supervisor.EquipmentEvidence_Payload, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorEquipmentEvidence_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorEquipmentEvidence_Payload(s: String): Either[Observation_Sortie_Eligibility_Supervisor.EquipmentEvidence_Payload, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorEquipmentEvidence_Payload(parser: Parser): Observation_Sortie_Eligibility_Supervisor.EquipmentEvidence_Payload = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorEquipmentEvidence_Payload()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorEquipmentEvidence_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment(o: Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment(s: String): Either[Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment(parser: Parser): Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment_Payload(o: Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment_Payload, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment_Payload(s: String): Either[Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment_Payload, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment_Payload(parser: Parser): Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment_Payload = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment_Payload()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorSingleEquipmentAssessment_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorPropulsionEvidence(o: Observation_Sortie_Eligibility_Supervisor.PropulsionEvidence, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorPropulsionEvidence(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorPropulsionEvidence(s: String): Either[Observation_Sortie_Eligibility_Supervisor.PropulsionEvidence, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorPropulsionEvidence(parser: Parser): Observation_Sortie_Eligibility_Supervisor.PropulsionEvidence = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorPropulsionEvidence()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorPropulsionEvidence _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorPropulsionEvidence_Payload(o: Observation_Sortie_Eligibility_Supervisor.PropulsionEvidence_Payload, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorPropulsionEvidence_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorPropulsionEvidence_Payload(s: String): Either[Observation_Sortie_Eligibility_Supervisor.PropulsionEvidence_Payload, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorPropulsionEvidence_Payload(parser: Parser): Observation_Sortie_Eligibility_Supervisor.PropulsionEvidence_Payload = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorPropulsionEvidence_Payload()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorPropulsionEvidence_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorPropulsionAssessment(o: Observation_Sortie_Eligibility_Supervisor.PropulsionAssessment, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorPropulsionAssessment(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorPropulsionAssessment(s: String): Either[Observation_Sortie_Eligibility_Supervisor.PropulsionAssessment, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorPropulsionAssessment(parser: Parser): Observation_Sortie_Eligibility_Supervisor.PropulsionAssessment = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorPropulsionAssessment()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorPropulsionAssessment _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorPropulsionAssessment_Payload(o: Observation_Sortie_Eligibility_Supervisor.PropulsionAssessment_Payload, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorPropulsionAssessment_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorPropulsionAssessment_Payload(s: String): Either[Observation_Sortie_Eligibility_Supervisor.PropulsionAssessment_Payload, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorPropulsionAssessment_Payload(parser: Parser): Observation_Sortie_Eligibility_Supervisor.PropulsionAssessment_Payload = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorPropulsionAssessment_Payload()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorPropulsionAssessment_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorFaultSummary(o: Observation_Sortie_Eligibility_Supervisor.FaultSummary, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorFaultSummary(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorFaultSummary(s: String): Either[Observation_Sortie_Eligibility_Supervisor.FaultSummary, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorFaultSummary(parser: Parser): Observation_Sortie_Eligibility_Supervisor.FaultSummary = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorFaultSummary()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorFaultSummary _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorFaultSummary_Payload(o: Observation_Sortie_Eligibility_Supervisor.FaultSummary_Payload, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorFaultSummary_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorFaultSummary_Payload(s: String): Either[Observation_Sortie_Eligibility_Supervisor.FaultSummary_Payload, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorFaultSummary_Payload(parser: Parser): Observation_Sortie_Eligibility_Supervisor.FaultSummary_Payload = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorFaultSummary_Payload()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorFaultSummary_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorRecoveryFacts(o: Observation_Sortie_Eligibility_Supervisor.RecoveryFacts, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorRecoveryFacts(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorRecoveryFacts(s: String): Either[Observation_Sortie_Eligibility_Supervisor.RecoveryFacts, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorRecoveryFacts(parser: Parser): Observation_Sortie_Eligibility_Supervisor.RecoveryFacts = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorRecoveryFacts()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorRecoveryFacts _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorRecoveryFacts_Payload(o: Observation_Sortie_Eligibility_Supervisor.RecoveryFacts_Payload, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorRecoveryFacts_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorRecoveryFacts_Payload(s: String): Either[Observation_Sortie_Eligibility_Supervisor.RecoveryFacts_Payload, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorRecoveryFacts_Payload(parser: Parser): Observation_Sortie_Eligibility_Supervisor.RecoveryFacts_Payload = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorRecoveryFacts_Payload()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorRecoveryFacts_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorEligibilityDecision(o: Observation_Sortie_Eligibility_Supervisor.EligibilityDecision, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorEligibilityDecision(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorEligibilityDecision(s: String): Either[Observation_Sortie_Eligibility_Supervisor.EligibilityDecision, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorEligibilityDecision(parser: Parser): Observation_Sortie_Eligibility_Supervisor.EligibilityDecision = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorEligibilityDecision()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorEligibilityDecision _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorEligibilityDecision_Payload(o: Observation_Sortie_Eligibility_Supervisor.EligibilityDecision_Payload, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorEligibilityDecision_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorEligibilityDecision_Payload(s: String): Either[Observation_Sortie_Eligibility_Supervisor.EligibilityDecision_Payload, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorEligibilityDecision_Payload(parser: Parser): Observation_Sortie_Eligibility_Supervisor.EligibilityDecision_Payload = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorEligibilityDecision_Payload()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorEligibilityDecision_Payload _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorEligibilityStatus(o: Observation_Sortie_Eligibility_Supervisor.EligibilityStatus, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorEligibilityStatus(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorEligibilityStatus(s: String): Either[Observation_Sortie_Eligibility_Supervisor.EligibilityStatus, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorEligibilityStatus(parser: Parser): Observation_Sortie_Eligibility_Supervisor.EligibilityStatus = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorEligibilityStatus()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorEligibilityStatus _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorEligibilityStatus_Payload(o: Observation_Sortie_Eligibility_Supervisor.EligibilityStatus_Payload, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorEligibilityStatus_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorEligibilityStatus_Payload(s: String): Either[Observation_Sortie_Eligibility_Supervisor.EligibilityStatus_Payload, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorEligibilityStatus_Payload(parser: Parser): Observation_Sortie_Eligibility_Supervisor.EligibilityStatus_Payload = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorEligibilityStatus_Payload()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorEligibilityStatus_Payload _)
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

  def fromObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container(o: Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container(s: String): Either[Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container(parser: Parser): Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_P(s: String): Either[Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_P, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_P(parser: Parser): Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_P = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_P()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_P _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PS(s: String): Either[Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PS, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PS(parser: Parser): Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PS = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PS()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PreState_Container_PS _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container(o: Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container(s: String): Either[Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container(parser: Parser): Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_P(s: String): Either[Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_P, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_P(parser: Parser): Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_P = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_P()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_P _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PS(s: String): Either[Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PS, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PS(parser: Parser): Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PS = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PS()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorEnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_PostState_Container_PS _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container(o: Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container(s: String): Either[Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container(parser: Parser): Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_P(s: String): Either[Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_P, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_P(parser: Parser): Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_P = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_P()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_P _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PS(s: String): Either[Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PS, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PS(parser: Parser): Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PS = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PS()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PreState_Container_PS _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container(o: Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container(s: String): Either[Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container(parser: Parser): Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_P(s: String): Either[Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_P, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_P(parser: Parser): Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_P = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_P()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_P _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PS(s: String): Either[Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PS, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PS(parser: Parser): Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PS = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PS()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorNavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_PostState_Container_PS _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container(o: Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container(s: String): Either[Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container(parser: Parser): Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_P(s: String): Either[Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_P, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_P(parser: Parser): Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_P = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_P()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_P _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PS(s: String): Either[Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PS, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PS(parser: Parser): Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PS = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PS()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PreState_Container_PS _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container(o: Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container(s: String): Either[Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container(parser: Parser): Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_P(s: String): Either[Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_P, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_P(parser: Parser): Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_P = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_P()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_P _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PS(s: String): Either[Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PS, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PS(parser: Parser): Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PS = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PS()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorCommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_PostState_Container_PS _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container(o: Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container(s: String): Either[Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container(parser: Parser): Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_P(s: String): Either[Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_P, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_P(parser: Parser): Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_P = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_P()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_P _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PS(s: String): Either[Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PS, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PS(parser: Parser): Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PS = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PS()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PreState_Container_PS _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container(o: Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container(s: String): Either[Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container(parser: Parser): Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_P(s: String): Either[Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_P, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_P(parser: Parser): Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_P = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_P()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_P _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PS(s: String): Either[Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PS, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PS(parser: Parser): Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PS = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PS()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_PostState_Container_PS _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container(o: Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container(s: String): Either[Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container(parser: Parser): Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_P(s: String): Either[Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_P, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_P(parser: Parser): Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_P = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_P()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_P _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PS(s: String): Either[Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PS, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PS(parser: Parser): Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PS = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PS()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PreState_Container_PS _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container(o: Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container(s: String): Either[Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container(parser: Parser): Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_P(s: String): Either[Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_P, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_P(parser: Parser): Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_P = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_P()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_P _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PS(s: String): Either[Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PS, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PS(parser: Parser): Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PS = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PS()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_PostState_Container_PS _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container(o: Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container(s: String): Either[Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container(parser: Parser): Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_P(s: String): Either[Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_P, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_P(parser: Parser): Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_P = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_P()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_P _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PS(s: String): Either[Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PS, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PS(parser: Parser): Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PS = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PS()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PreState_Container_PS _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container(o: Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container(s: String): Either[Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container(parser: Parser): Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_P(s: String): Either[Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_P, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_P(parser: Parser): Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_P = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_P()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_P _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PS(s: String): Either[Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PS, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PS(parser: Parser): Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PS = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PS()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorPropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_PostState_Container_PS _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container(o: Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container(s: String): Either[Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container(parser: Parser): Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_P(s: String): Either[Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_P, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_P(parser: Parser): Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_P = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_P()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_P _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PS(s: String): Either[Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PS, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PS(parser: Parser): Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PS = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PS()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PreState_Container_PS _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container(o: Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container(s: String): Either[Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container(parser: Parser): Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_P(s: String): Either[Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_P, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_P(parser: Parser): Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_P = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_P()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_P _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PS(s: String): Either[Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PS, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PS(parser: Parser): Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PS = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PS()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorRequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_PostState_Container_PS _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container(o: Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container(s: String): Either[Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container(parser: Parser): Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_P(s: String): Either[Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_P, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_P(parser: Parser): Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_P = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_P()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_P _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PS(s: String): Either[Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PS, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PS(parser: Parser): Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PS = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PS()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PreState_Container_PS _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container(o: Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container(s: String): Either[Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container(parser: Parser): Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_P(s: String): Either[Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_P, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_P(parser: Parser): Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_P = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_P()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_P _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PS(s: String): Either[Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PS, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PS(parser: Parser): Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PS = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PS()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorFaultRegistry_eligibility_supervisor_process_fault_registry_PostState_Container_PS _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container(o: Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container(s: String): Either[Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container(parser: Parser): Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_P(s: String): Either[Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_P, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_P(parser: Parser): Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_P = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_P()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_P _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PS(s: String): Either[Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PS, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PS(parser: Parser): Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PS = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PS()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PreState_Container_PS _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container(o: Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container(s: String): Either[Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container(parser: Parser): Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_P(s: String): Either[Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_P, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_P(parser: Parser): Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_P = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_P()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_P _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PS(s: String): Either[Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PS, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PS(parser: Parser): Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PS = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PS()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorPriorityArbiter_eligibility_supervisor_process_priority_arbiter_PostState_Container_PS _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container(o: Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container(s: String): Either[Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container(parser: Parser): Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_P(s: String): Either[Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_P, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_P(parser: Parser): Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_P = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_P()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_P _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PS(s: String): Either[Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PS, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PS(parser: Parser): Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PS = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PS()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PreState_Container_PS _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container(o: Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container(s: String): Either[Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container(parser: Parser): Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_P(s: String): Either[Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_P, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_P(parser: Parser): Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_P = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_P()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_P _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PS(s: String): Either[Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PS, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PS(parser: Parser): Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PS = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PS()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorRecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_PostState_Container_PS _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container(o: Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container(s: String): Either[Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container(parser: Parser): Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_P(s: String): Either[Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_P, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_P(parser: Parser): Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_P = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_P()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_P _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PS(s: String): Either[Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PS, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PS(parser: Parser): Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PS = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PS()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PreState_Container_PS _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container(o: Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container(s: String): Either[Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container(parser: Parser): Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_P(s: String): Either[Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_P, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_P(parser: Parser): Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_P = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_P()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_P _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PS(s: String): Either[Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PS, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PS(parser: Parser): Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PS = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PS()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorEligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_PostState_Container_PS _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container(o: Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container(s: String): Either[Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container(parser: Parser): Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_P(s: String): Either[Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_P, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_P(parser: Parser): Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_P = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_P()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_P _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PS(s: String): Either[Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PS, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PS(parser: Parser): Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PS = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PS()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PreState_Container_PS _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container(o: Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container(s: String): Either[Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container(parser: Parser): Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_P(s: String): Either[Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_P, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_P(parser: Parser): Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_P = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_P()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_P _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PS(s: String): Either[Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PS, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PS(parser: Parser): Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PS = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PS()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorPermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_PostState_Container_PS _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container(o: Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PreState_Container, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container(s: String): Either[Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PreState_Container, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container(parser: Parser): Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PreState_Container = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_P(s: String): Either[Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_P, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_P(parser: Parser): Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_P = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_P()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_P _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PS(s: String): Either[Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PS, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PS(parser: Parser): Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PS = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PS()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PreState_Container_PS _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container(o: Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PostState_Container, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container(s: String): Either[Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PostState_Container, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container(parser: Parser): Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PostState_Container = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_P(o: Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_P(s: String): Either[Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_P, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_P(parser: Parser): Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_P = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_P()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_P _)
    return r
  }

  def fromObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PS(o: Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PS(s: String): Either[Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PS, Json.ErrorMsg] = {
    def fObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PS(parser: Parser): Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PS = {
      val r = parser.parseObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PS()
      return r
    }
    val r = to(s, fObservation_Sortie_Eligibility_SupervisorStatusComposer_eligibility_supervisor_process_status_composer_PostState_Container_PS _)
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